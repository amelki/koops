package com.codingue.koops.gen

import com.codingue.koops.common.forEachEntry
import com.codingue.koops.common.toFile
import com.amazonaws.codegen.model.intermediate.IntermediateModel
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import java.nio.ByteBuffer
import java.util.*
import java.util.zip.ZipInputStream
import kotlin.collections.ArrayList

private const val targetDir = "../aws/src/main/kotlin/com/codingue/koops/aws"
private const val targetPackageName = "com.codingue.koops.aws"
private const val corePackageName = "com.codingue.koops.core"
private const val commonPackageName = "com.codingue.koops.common"
private const val awsPackageName = "com.codingue.koops.aws"

fun main(args: Array<String>) {
	val modelMapper = jacksonObjectMapper()
	val intermediateMapper = jacksonObjectMapper()
	intermediateMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
	val modelsDir = "./models"
	val classLoader = Thread.currentThread().contextClassLoader!!
	val resources = classLoader.getResources("models")
	val jarModelURL = resources.toList().find { it.toString().startsWith("jar") }
	val jarFile = File(jarModelURL!!.file.substring("file:".length, jarModelURL.file.lastIndexOf('!')))
	val modelFiles = ArrayList<File>()
	ZipInputStream(FileInputStream(jarFile)).forEachEntry(Regex("^models/.+")) { entry, stream, _ ->
		val entryFileName = modelsDir + "/" + entry.name.substringAfterLast("/")
		stream.toFile(entryFileName)
		if (entry.name.endsWith("-model.json")) {
			modelFiles.add(File(entryFileName))
		}
	}
	modelFiles.forEach { modelSourceFile ->
		println("Generating code for ${modelSourceFile.path}")
		val intermediateSourceFile = modelSourceFile.absolutePath.substring(0, modelSourceFile.absolutePath.length - "model.json".length - 1) + "-intermediate.json"
		val schema = modelMapper.readValue(modelSourceFile, Schema::class.java)
		val intermediate = intermediateMapper.readValue(File(intermediateSourceFile), IntermediateModel::class.java)
		generate(schema, intermediate, targetDir)
	}
}

private val fixServiceNames = hashMapOf(
		"streams.dynamodb" to Pair("dynamodbstreams", "dynamodbstreams"),
		"runtime.sagemaker" to Pair("sagemakerruntime", "sagemaker-runtime"),
		"models.lex" to Pair("lexmodels", "lex-models"),
		"runtime.lex" to Pair("lexruntime", "lex-runtime"),
		"cloudsearchdomain" to Pair("cloudsearchdomain", "cloudsearchdomain"),
		"cloudhsmv2" to Pair("cloudhsmv2", "cloudhsmv2"),
		"data.mediastore" to Pair("mediastoredata", "mediastore-data"),
		"metering.marketplace" to Pair("meteringmarketplace", "meteringmarketplace"),
		"a4b" to Pair("alexaforbusiness", "alexaforbusiness")
)

fun generate(schema: Schema, intermediate: IntermediateModel, targetDir: String) {
	val (serviceName, cliName) = fixServiceNames[intermediate.metadata.endpointPrefix]
			?: Pair(intermediate.metadata.signingName.replace("-", "_"),
							intermediate.metadata.signingName)
	val syncInterface = intermediate.metadata.syncInterface
	val syncClientBuilderClassName = intermediate.metadata.syncClientBuilderClassName
	val awsServicePackageName = intermediate.metadata.packageName
	val kmetadata = KMetadata(serviceName, cliName, awsServicePackageName, syncInterface)
	val kops = intermediate.operations.values.filter {
		val skipClientMethodForOperations = intermediate.customizationConfig.skipClientMethodForOperations
		!(skipClientMethodForOperations != null && skipClientMethodForOperations.contains(it.operationName))
	}.map {
		val inputName = it.input?.variableType
		val outputName = it.syncReturnType
		val inputFields =
				if (inputName != null) {
					val shape = intermediate.shapes[inputName]!!
					if (shape.members == null) {
						emptyList()
					} else {
						shape.members.map {
							KField(it.name,
										 toKotlin(schema, intermediate, it.c2jShape, it.marshallingTargetClass),
										 it.variable.variableName,
										 it.variable.variableType,
										 shape.required?.contains(it.name) ?: false)
						}
					}
				} else {
					emptyList()
				}
		KOperation(it.operationName,
							 if (inputName == null) null else toKotlin(schema, intermediate, inputName),
							 toKotlin(schema, intermediate, outputName),
							 inputFields)
	}
	File("$targetDir/$serviceName").mkdirs();
	val file = File("$targetDir/$serviceName/$syncInterface.kt")
	val writer = file.bufferedWriter()
	writer.use { w ->
		w.write("""
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package $targetPackageName.$serviceName

import javax.annotation.Generated
import $commonPackageName.*
import $corePackageName.*
import $awsPackageName.*
import $awsServicePackageName.*
import $awsServicePackageName.model.*

var com.codingue.koops.core.Environment.$serviceName: $syncInterface
	get() {
		var service = this.capabilities["aws-$serviceName"]
		if (service == null) {
			service = $syncClientBuilderClassName.standard().build()
			this.capabilities["aws-$serviceName"] = service
		}
		return service as $syncInterface
	}
	set($serviceName) {
		this.capabilities["aws-$serviceName"] = $serviceName
	}

@Generated
class ${syncInterface}Functions(val block: Block)

infix fun <T> AwsContinuation.$serviceName(init: ${syncInterface}Functions.() -> T): T {
	return ${syncInterface}Functions(shell).run(init)
}

			""")
		kops.forEach {
			w.write(generate(kmetadata, it))
		}
	}

}

fun generate(metadata: KMetadata, op: KOperation): String {
	val requiredFields = op.fields.filter { it.required }
	val declareRequiredFields = requiredFields.joinToString(", ") {
		"val ${it.variableName}: ${it.type.toKotlinString()}"
	}
	val declareRequiredParams = requiredFields.joinToString("") {
		"${it.variableName}: ${it.type.toKotlinString()}, "
	}
	val callRequiredParams = requiredFields.joinToString(", ") {
		it.variableName
	}
	val declareOtherFields = op.fields.filter { !it.required }.joinToString("\n") {
		"\tvar ${it.variableName}: ${it.type.toKotlinString()}? = ${it.type.defaultValueString()}"
	}
	val setFields = op.fields.joinToString("\n") {
		"\t\tinput.set${it.name}(this.${it.variableName}${it.convertEnums()})"
	}
	val printFields = op.fields.joinToString("\n") {
		"\t\t\t\t.${it.type.optionOrArgument()}(\"${it.toCliName()}\", ${it.variableName}${it.toStringSuffix()})"
	}
	val commandName = "${metadata.syncInterface}${op.name}Command"
	if (op.inputName == null) {
		return """
fun ${metadata.syncInterface}Functions.${op.name.decapitalize()}()${op.returnTypeDeclaration} {
	${op.returnOrNothing}this.block.declare($commandName()) as ${op.outputName}
}
"""
	}
	val baseClass =
			when {
				op.output.void -> "AmazonWebServiceVoidCommand<${op.inputName}>"
				else -> "AmazonWebServiceCommand<${op.inputName}, ${op.outputName}>"
			}
	val operationBody =
			when {
				op.output.void -> "this.block.declare($commandName($callRequiredParams).applyIfNotNull(init, { init!!() }))"
				else -> "return this.block.declare($commandName($callRequiredParams).applyIfNotNull(init, { init!!() })) as ${op.outputName}"
			}

	val overrideDryResult = when {
		op.output.void -> ""
		else -> """
	override fun dryResult(): ${op.outputName} {
	  return ${op.outputName}()
	}
"""
	}

	return """

fun ${metadata.syncInterface}Functions.${op.name.decapitalize()}(${declareRequiredParams}init: ($commandName.() -> Unit)? = null)${op.returnTypeDeclaration} {
	$operationBody
}

@Generated
class $commandName($declareRequiredFields) : $baseClass {

$declareOtherFields

	override fun build(): ${op.inputName} {
		val input = ${op.inputName}()
$setFields
		return input
	}

	$overrideDryResult

	override fun eval(environment: com.codingue.koops.core.Environment)${op.returnTypeDeclaration} {
		${op.returnOrNothing}environment.${metadata.serviceName}.${op.name.decapitalize()}(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ${metadata.cliName} ${toCliName(op.name)}")
$printFields
	}

}
"""
}


class KMetadata(val serviceName: String,
								val cliName: String,
								val packageName: String,
								val syncInterface: String)

abstract class KotlinType(protected val name: String,
													val primitive: Boolean,
													private val defaultValue: Any? = null,
													val list: Boolean = false,
													val map: Boolean = false,
													val enumerated: Boolean = false,
													val void: Boolean = false) {

	fun defaultValueString() = "$defaultValue"

	fun optionOrArgument(): String =
			if (this == KotlinTypes.Boolean)
				"option"
			else
				"argument"

	open fun toKotlinString(): String = name
	open fun convertEnums(): String = ""
	open fun returnTypeDeclaration()  = ": ${toKotlinString()}"
	open fun returnOrNothing() = "return "

}

class PrimitiveKotlinType(name: String, defaultValue: String? = null)
	: KotlinType(name, true, defaultValue)

class EnumeratedKotlinType(name: String, defaultValue: Any? = null)
	: KotlinType(name, true, defaultValue, false, false, true) {
	override fun convertEnums(): String = ".toString()"
}

object VoidKotlinType : KotlinType("Unit", false, null, false, false, false, true) {
	override fun returnTypeDeclaration()  = ""
	override fun returnOrNothing() = ""
}

class ObjectKotlinType(name: String, defaultValue: Any? = null)
	: KotlinType(name, false, defaultValue)

class ListKotlinType(val member: KotlinType)
	: KotlinType("List", true, null, true, false) {
	override fun toKotlinString(): String {
		return "$name<${member.toKotlinString()}>"
	}

	override fun convertEnums(): String {
		val convertMemberEnums = member.convertEnums()
		return if (convertMemberEnums.isNotEmpty()) {
			".map { it$convertMemberEnums }"
		} else {
			super.convertEnums()
		}
	}
}

class MapKotlinType(val key: KotlinType, val value: KotlinType)
	: KotlinType("Map", true, null, false, true) {
	override fun toKotlinString(): String {
		return "$name<${key.toKotlinString()}, ${value.toKotlinString()}>"
	}

	override fun convertEnums(): String {
		val convertKeyEnums = key.convertEnums()
		val convertValueEnums = value.convertEnums()
		var convertMapEnums = super.convertEnums()
		if (convertKeyEnums.isNotEmpty()) {
			convertMapEnums += ".mapKeys { it$convertKeyEnums }"
		}
		if (convertValueEnums.isNotEmpty()) {
			convertMapEnums += ".mapKeys { it$convertValueEnums }"
		}
		return convertMapEnums
	}
}


object KotlinTypes {
	val String = PrimitiveKotlinType(String::class.simpleName!!, "null")
	val Integer = PrimitiveKotlinType(Integer::class.simpleName!!, "0")
	val Boolean = PrimitiveKotlinType(Boolean::class.simpleName!!, "false")
	val Double = PrimitiveKotlinType(Double::class.simpleName!!, "0.0")
	val Float = PrimitiveKotlinType(Float::class.simpleName!!, "0f")
	val Long = PrimitiveKotlinType(Long::class.simpleName!!, "0L")
	val Blob = ObjectKotlinType(ByteBuffer::class.java.name!!)
	val BlobStream = ObjectKotlinType(InputStream::class.java.name!!)
	val Timestamp = ObjectKotlinType(Date::class.java.name!!)
	val Void = VoidKotlinType
}

fun toKotlin(schema: Schema, intermediate: IntermediateModel, shapeName: String, memberMarshallingTargetClass: String? = null): KotlinType {
	val shape = intermediate.shapes[shapeName]
	return if (shape == null) {
		val alternativeShapeName = intermediate.customizationConfig?.shapeSubstitutions?.get(shapeName)?.emitAsShape
		if (alternativeShapeName != null) {
			return toKotlin(schema, intermediate, alternativeShapeName)
		}
		when {
			shapeName == "String" -> KotlinTypes.String
			shapeName == "Boolean" -> KotlinTypes.Boolean
			(shapeName == "BlobStream") && (memberMarshallingTargetClass != null) -> ObjectKotlinType(memberMarshallingTargetClass)
			(shapeName == "Blob") && (memberMarshallingTargetClass != null) -> ObjectKotlinType(memberMarshallingTargetClass)
			shapeName == "Double" -> KotlinTypes.Double
			shapeName == "Float" -> KotlinTypes.Float
			shapeName == "Integer" -> KotlinTypes.Integer
			shapeName == "Long" -> KotlinTypes.Long
			shapeName == "void" -> KotlinTypes.Void
			else -> {
				val schemaShape = schema.shapes[shapeName]
				if (schemaShape != null) {
					when (schemaShape.type) {
						Type.string -> KotlinTypes.String
						Type.boolean -> KotlinTypes.Boolean
						Type.double -> KotlinTypes.Double
						Type.float -> KotlinTypes.Float
						Type.integer -> KotlinTypes.Integer
						Type.long -> KotlinTypes.Long
						Type.timestamp -> KotlinTypes.Timestamp
						Type.void -> KotlinTypes.Void
						Type.blob -> {
							if (memberMarshallingTargetClass != null)
								ObjectKotlinType(memberMarshallingTargetClass)
							else {
								if (schemaShape.streaming)
									KotlinTypes.BlobStream
								else KotlinTypes.Blob
							}
						}
						Type.list -> ListKotlinType(toKotlin(schema, intermediate, schemaShape.member!!.shape))
						Type.map -> MapKotlinType(toKotlin(schema, intermediate, schemaShape.key!!.shape), toKotlin(schema, intermediate, schemaShape.value!!.shape))
						else -> throw IllegalStateException("Unknown type ${schemaShape.type} for shape $shapeName")
					}
				} else {
					throw IllegalStateException("Unknown shape $shapeName")
				}
			}
		}
	} else {
		if (shape.enums != null && shape.enums.size > 0) {
			EnumeratedKotlinType(shape.variable.variableType)
		} else {
			ObjectKotlinType(intermediate.metadata.packageName + ".model." + shape.variable.variableType)
		}
	}
}

private fun toCliName(camelCaseName: String): String {
	return camelCaseName.replace(Regex("([^_A-Z])([A-Z])"), "$1-$2").toLowerCase()
}

data class KOperation(val name: String,
											val input: KotlinType?,
											val output: KotlinType,
											val fields: List<KField>) {

	val returnTypeDeclaration: String = output.returnTypeDeclaration()
	val returnOrNothing: String = output.returnOrNothing()
	val inputName: String? = input?.toKotlinString()
	val outputName: String = output.toKotlinString()

}

data class KField(val name: String,
									val type: KotlinType,
									val variableName: String,
									val variableType: String,
									val required: Boolean) {
	fun toStringSuffix(): String =
			when {
				type == KotlinTypes.String -> ""
				type == KotlinTypes.Boolean -> " ?: false"
				required -> ".toString()"
				else -> "?.toString()"
			}

	fun toCliName(): String {
		return com.codingue.koops.gen.toCliName(name)
	}

	fun convertEnums(): String {
		val convertEnums = type.convertEnums()
		if (convertEnums.isNotEmpty() && !required) {
			return "?$convertEnums"
		}
		return convertEnums
	}

}
