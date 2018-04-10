
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.clouddirectory.AmazonCloudDirectory
import com.amazonaws.services.clouddirectory.model.*

var codingue.koops.core.Environment.clouddirectory: AmazonCloudDirectory
	get() = this.capabilities[AmazonCloudDirectory::class.java.name] as AmazonCloudDirectory
	set(clouddirectory) {
		this.capabilities[AmazonCloudDirectory::class.java.name] = clouddirectory
	}

@Generated
class AmazonCloudDirectoryFunctions(val block: Block)

infix fun AwsContinuation.clouddirectory(init: AmazonCloudDirectoryFunctions.() -> Unit) {
	AmazonCloudDirectoryFunctions(shell).apply(init)
}

			

fun AmazonCloudDirectoryFunctions.addFacetToObject(directoryArn: String, schemaFacet: com.amazonaws.services.clouddirectory.model.SchemaFacet, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryAddFacetToObjectCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryAddFacetToObjectCommand(directoryArn, schemaFacet, objectReference).apply(init))
}

@Generated
class AmazonCloudDirectoryAddFacetToObjectCommand(val directoryArn: String, val schemaFacet: com.amazonaws.services.clouddirectory.model.SchemaFacet, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest> {

	var objectAttributeList: List<com.amazonaws.services.clouddirectory.model.AttributeKeyAndValue>? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest {
		val input = com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setSchemaFacet(this.schemaFacet)
		input.setObjectAttributeList(this.objectAttributeList)
		input.setObjectReference(this.objectReference)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.addFacetToObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory add-facet-to-object")
				.argument("directory-arn", directoryArn)
				.argument("schema-facet", schemaFacet.toString())
				.argument("object-attribute-list", objectAttributeList?.toString())
				.argument("object-reference", objectReference.toString())
	}

}


fun AmazonCloudDirectoryFunctions.applySchema(publishedSchemaArn: String, directoryArn: String, init: AmazonCloudDirectoryApplySchemaCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryApplySchemaCommand(publishedSchemaArn, directoryArn).apply(init))
}

@Generated
class AmazonCloudDirectoryApplySchemaCommand(val publishedSchemaArn: String, val directoryArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ApplySchemaRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.ApplySchemaRequest {
		val input = com.amazonaws.services.clouddirectory.model.ApplySchemaRequest()
		input.setPublishedSchemaArn(this.publishedSchemaArn)
		input.setDirectoryArn(this.directoryArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.applySchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory apply-schema")
				.argument("published-schema-arn", publishedSchemaArn)
				.argument("directory-arn", directoryArn)
	}

}


fun AmazonCloudDirectoryFunctions.attachObject(directoryArn: String, parentReference: com.amazonaws.services.clouddirectory.model.ObjectReference, childReference: com.amazonaws.services.clouddirectory.model.ObjectReference, linkName: String, init: AmazonCloudDirectoryAttachObjectCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryAttachObjectCommand(directoryArn, parentReference, childReference, linkName).apply(init))
}

@Generated
class AmazonCloudDirectoryAttachObjectCommand(val directoryArn: String, val parentReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val childReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val linkName: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.AttachObjectRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.AttachObjectRequest {
		val input = com.amazonaws.services.clouddirectory.model.AttachObjectRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setParentReference(this.parentReference)
		input.setChildReference(this.childReference)
		input.setLinkName(this.linkName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.attachObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory attach-object")
				.argument("directory-arn", directoryArn)
				.argument("parent-reference", parentReference.toString())
				.argument("child-reference", childReference.toString())
				.argument("link-name", linkName)
	}

}


fun AmazonCloudDirectoryFunctions.attachPolicy(policyReference: com.amazonaws.services.clouddirectory.model.ObjectReference, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryAttachPolicyCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryAttachPolicyCommand(policyReference, objectReference).apply(init))
}

@Generated
class AmazonCloudDirectoryAttachPolicyCommand(val policyReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.AttachPolicyRequest> {

	var directoryArn: String? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.AttachPolicyRequest {
		val input = com.amazonaws.services.clouddirectory.model.AttachPolicyRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setPolicyReference(this.policyReference)
		input.setObjectReference(this.objectReference)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.attachPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory attach-policy")
				.argument("directory-arn", directoryArn)
				.argument("policy-reference", policyReference.toString())
				.argument("object-reference", objectReference.toString())
	}

}


fun AmazonCloudDirectoryFunctions.attachToIndex(directoryArn: String, indexReference: com.amazonaws.services.clouddirectory.model.ObjectReference, targetReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryAttachToIndexCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryAttachToIndexCommand(directoryArn, indexReference, targetReference).apply(init))
}

@Generated
class AmazonCloudDirectoryAttachToIndexCommand(val directoryArn: String, val indexReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val targetReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.AttachToIndexRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.AttachToIndexRequest {
		val input = com.amazonaws.services.clouddirectory.model.AttachToIndexRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setIndexReference(this.indexReference)
		input.setTargetReference(this.targetReference)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.attachToIndex(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory attach-to-index")
				.argument("directory-arn", directoryArn)
				.argument("index-reference", indexReference.toString())
				.argument("target-reference", targetReference.toString())
	}

}


fun AmazonCloudDirectoryFunctions.attachTypedLink(directoryArn: String, sourceObjectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, targetObjectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, typedLinkFacet: com.amazonaws.services.clouddirectory.model.TypedLinkSchemaAndFacetName, attributes: List<com.amazonaws.services.clouddirectory.model.AttributeNameAndValue>, init: AmazonCloudDirectoryAttachTypedLinkCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryAttachTypedLinkCommand(directoryArn, sourceObjectReference, targetObjectReference, typedLinkFacet, attributes).apply(init))
}

@Generated
class AmazonCloudDirectoryAttachTypedLinkCommand(val directoryArn: String, val sourceObjectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val targetObjectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val typedLinkFacet: com.amazonaws.services.clouddirectory.model.TypedLinkSchemaAndFacetName, val attributes: List<com.amazonaws.services.clouddirectory.model.AttributeNameAndValue>) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest {
		val input = com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setSourceObjectReference(this.sourceObjectReference)
		input.setTargetObjectReference(this.targetObjectReference)
		input.setTypedLinkFacet(this.typedLinkFacet)
		input.setAttributes(this.attributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.attachTypedLink(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory attach-typed-link")
				.argument("directory-arn", directoryArn)
				.argument("source-object-reference", sourceObjectReference.toString())
				.argument("target-object-reference", targetObjectReference.toString())
				.argument("typed-link-facet", typedLinkFacet.toString())
				.argument("attributes", attributes.toString())
	}

}


fun AmazonCloudDirectoryFunctions.batchRead(directoryArn: String, operations: List<com.amazonaws.services.clouddirectory.model.BatchReadOperation>, init: AmazonCloudDirectoryBatchReadCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryBatchReadCommand(directoryArn, operations).apply(init))
}

@Generated
class AmazonCloudDirectoryBatchReadCommand(val directoryArn: String, val operations: List<com.amazonaws.services.clouddirectory.model.BatchReadOperation>) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.BatchReadRequest> {

	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.BatchReadRequest {
		val input = com.amazonaws.services.clouddirectory.model.BatchReadRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setOperations(this.operations)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.batchRead(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory batch-read")
				.argument("directory-arn", directoryArn)
				.argument("operations", operations.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.batchWrite(directoryArn: String, operations: List<com.amazonaws.services.clouddirectory.model.BatchWriteOperation>, init: AmazonCloudDirectoryBatchWriteCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryBatchWriteCommand(directoryArn, operations).apply(init))
}

@Generated
class AmazonCloudDirectoryBatchWriteCommand(val directoryArn: String, val operations: List<com.amazonaws.services.clouddirectory.model.BatchWriteOperation>) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.BatchWriteRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.BatchWriteRequest {
		val input = com.amazonaws.services.clouddirectory.model.BatchWriteRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setOperations(this.operations)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.batchWrite(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory batch-write")
				.argument("directory-arn", directoryArn)
				.argument("operations", operations.toString())
	}

}


fun AmazonCloudDirectoryFunctions.createDirectory(name: String, schemaArn: String, init: AmazonCloudDirectoryCreateDirectoryCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryCreateDirectoryCommand(name, schemaArn).apply(init))
}

@Generated
class AmazonCloudDirectoryCreateDirectoryCommand(val name: String, val schemaArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest {
		val input = com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest()
		input.setName(this.name)
		input.setSchemaArn(this.schemaArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.createDirectory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory create-directory")
				.argument("name", name)
				.argument("schema-arn", schemaArn)
	}

}


fun AmazonCloudDirectoryFunctions.createFacet(schemaArn: String, name: String, objectType: ObjectType, init: AmazonCloudDirectoryCreateFacetCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryCreateFacetCommand(schemaArn, name, objectType).apply(init))
}

@Generated
class AmazonCloudDirectoryCreateFacetCommand(val schemaArn: String, val name: String, val objectType: ObjectType) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.CreateFacetRequest> {

	var attributes: List<com.amazonaws.services.clouddirectory.model.FacetAttribute>? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.CreateFacetRequest {
		val input = com.amazonaws.services.clouddirectory.model.CreateFacetRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		input.setAttributes(this.attributes)
		input.setObjectType(this.objectType.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.createFacet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory create-facet")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
				.argument("attributes", attributes?.toString())
				.argument("object-type", objectType.toString())
	}

}


fun AmazonCloudDirectoryFunctions.createIndex(directoryArn: String, orderedIndexedAttributeList: List<com.amazonaws.services.clouddirectory.model.AttributeKey>, isUnique: Boolean, init: AmazonCloudDirectoryCreateIndexCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryCreateIndexCommand(directoryArn, orderedIndexedAttributeList, isUnique).apply(init))
}

@Generated
class AmazonCloudDirectoryCreateIndexCommand(val directoryArn: String, val orderedIndexedAttributeList: List<com.amazonaws.services.clouddirectory.model.AttributeKey>, val isUnique: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.CreateIndexRequest> {

	var parentReference: com.amazonaws.services.clouddirectory.model.ObjectReference? = null
	var linkName: String? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.CreateIndexRequest {
		val input = com.amazonaws.services.clouddirectory.model.CreateIndexRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setOrderedIndexedAttributeList(this.orderedIndexedAttributeList)
		input.setIsUnique(this.isUnique)
		input.setParentReference(this.parentReference)
		input.setLinkName(this.linkName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.createIndex(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory create-index")
				.argument("directory-arn", directoryArn)
				.argument("ordered-indexed-attribute-list", orderedIndexedAttributeList.toString())
				.option("is-unique", isUnique ?: false)
				.argument("parent-reference", parentReference?.toString())
				.argument("link-name", linkName)
	}

}


fun AmazonCloudDirectoryFunctions.createObject(directoryArn: String, schemaFacets: List<com.amazonaws.services.clouddirectory.model.SchemaFacet>, init: AmazonCloudDirectoryCreateObjectCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryCreateObjectCommand(directoryArn, schemaFacets).apply(init))
}

@Generated
class AmazonCloudDirectoryCreateObjectCommand(val directoryArn: String, val schemaFacets: List<com.amazonaws.services.clouddirectory.model.SchemaFacet>) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.CreateObjectRequest> {

	var objectAttributeList: List<com.amazonaws.services.clouddirectory.model.AttributeKeyAndValue>? = null
	var parentReference: com.amazonaws.services.clouddirectory.model.ObjectReference? = null
	var linkName: String? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.CreateObjectRequest {
		val input = com.amazonaws.services.clouddirectory.model.CreateObjectRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setSchemaFacets(this.schemaFacets)
		input.setObjectAttributeList(this.objectAttributeList)
		input.setParentReference(this.parentReference)
		input.setLinkName(this.linkName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.createObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory create-object")
				.argument("directory-arn", directoryArn)
				.argument("schema-facets", schemaFacets.toString())
				.argument("object-attribute-list", objectAttributeList?.toString())
				.argument("parent-reference", parentReference?.toString())
				.argument("link-name", linkName)
	}

}


fun AmazonCloudDirectoryFunctions.createSchema(name: String, init: AmazonCloudDirectoryCreateSchemaCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryCreateSchemaCommand(name).apply(init))
}

@Generated
class AmazonCloudDirectoryCreateSchemaCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.CreateSchemaRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.CreateSchemaRequest {
		val input = com.amazonaws.services.clouddirectory.model.CreateSchemaRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.createSchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory create-schema")
				.argument("name", name)
	}

}


fun AmazonCloudDirectoryFunctions.createTypedLinkFacet(schemaArn: String, facet: com.amazonaws.services.clouddirectory.model.TypedLinkFacet, init: AmazonCloudDirectoryCreateTypedLinkFacetCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryCreateTypedLinkFacetCommand(schemaArn, facet).apply(init))
}

@Generated
class AmazonCloudDirectoryCreateTypedLinkFacetCommand(val schemaArn: String, val facet: com.amazonaws.services.clouddirectory.model.TypedLinkFacet) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest {
		val input = com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest()
		input.setSchemaArn(this.schemaArn)
		input.setFacet(this.facet)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.createTypedLinkFacet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory create-typed-link-facet")
				.argument("schema-arn", schemaArn)
				.argument("facet", facet.toString())
	}

}


fun AmazonCloudDirectoryFunctions.deleteDirectory(directoryArn: String, init: AmazonCloudDirectoryDeleteDirectoryCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryDeleteDirectoryCommand(directoryArn).apply(init))
}

@Generated
class AmazonCloudDirectoryDeleteDirectoryCommand(val directoryArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest {
		val input = com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest()
		input.setDirectoryArn(this.directoryArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.deleteDirectory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory delete-directory")
				.argument("directory-arn", directoryArn)
	}

}


fun AmazonCloudDirectoryFunctions.deleteFacet(schemaArn: String, name: String, init: AmazonCloudDirectoryDeleteFacetCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryDeleteFacetCommand(schemaArn, name).apply(init))
}

@Generated
class AmazonCloudDirectoryDeleteFacetCommand(val schemaArn: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DeleteFacetRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DeleteFacetRequest {
		val input = com.amazonaws.services.clouddirectory.model.DeleteFacetRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.deleteFacet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory delete-facet")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
	}

}


fun AmazonCloudDirectoryFunctions.deleteObject(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryDeleteObjectCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryDeleteObjectCommand(directoryArn, objectReference).apply(init))
}

@Generated
class AmazonCloudDirectoryDeleteObjectCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DeleteObjectRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DeleteObjectRequest {
		val input = com.amazonaws.services.clouddirectory.model.DeleteObjectRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.deleteObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory delete-object")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
	}

}


fun AmazonCloudDirectoryFunctions.deleteSchema(schemaArn: String, init: AmazonCloudDirectoryDeleteSchemaCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryDeleteSchemaCommand(schemaArn).apply(init))
}

@Generated
class AmazonCloudDirectoryDeleteSchemaCommand(val schemaArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest {
		val input = com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest()
		input.setSchemaArn(this.schemaArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.deleteSchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory delete-schema")
				.argument("schema-arn", schemaArn)
	}

}


fun AmazonCloudDirectoryFunctions.deleteTypedLinkFacet(schemaArn: String, name: String, init: AmazonCloudDirectoryDeleteTypedLinkFacetCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryDeleteTypedLinkFacetCommand(schemaArn, name).apply(init))
}

@Generated
class AmazonCloudDirectoryDeleteTypedLinkFacetCommand(val schemaArn: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest {
		val input = com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.deleteTypedLinkFacet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory delete-typed-link-facet")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
	}

}


fun AmazonCloudDirectoryFunctions.detachFromIndex(directoryArn: String, indexReference: com.amazonaws.services.clouddirectory.model.ObjectReference, targetReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryDetachFromIndexCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryDetachFromIndexCommand(directoryArn, indexReference, targetReference).apply(init))
}

@Generated
class AmazonCloudDirectoryDetachFromIndexCommand(val directoryArn: String, val indexReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val targetReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest {
		val input = com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setIndexReference(this.indexReference)
		input.setTargetReference(this.targetReference)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.detachFromIndex(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory detach-from-index")
				.argument("directory-arn", directoryArn)
				.argument("index-reference", indexReference.toString())
				.argument("target-reference", targetReference.toString())
	}

}


fun AmazonCloudDirectoryFunctions.detachObject(directoryArn: String, parentReference: com.amazonaws.services.clouddirectory.model.ObjectReference, linkName: String, init: AmazonCloudDirectoryDetachObjectCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryDetachObjectCommand(directoryArn, parentReference, linkName).apply(init))
}

@Generated
class AmazonCloudDirectoryDetachObjectCommand(val directoryArn: String, val parentReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val linkName: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DetachObjectRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DetachObjectRequest {
		val input = com.amazonaws.services.clouddirectory.model.DetachObjectRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setParentReference(this.parentReference)
		input.setLinkName(this.linkName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.detachObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory detach-object")
				.argument("directory-arn", directoryArn)
				.argument("parent-reference", parentReference.toString())
				.argument("link-name", linkName)
	}

}


fun AmazonCloudDirectoryFunctions.detachPolicy(directoryArn: String, policyReference: com.amazonaws.services.clouddirectory.model.ObjectReference, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryDetachPolicyCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryDetachPolicyCommand(directoryArn, policyReference, objectReference).apply(init))
}

@Generated
class AmazonCloudDirectoryDetachPolicyCommand(val directoryArn: String, val policyReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DetachPolicyRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DetachPolicyRequest {
		val input = com.amazonaws.services.clouddirectory.model.DetachPolicyRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setPolicyReference(this.policyReference)
		input.setObjectReference(this.objectReference)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.detachPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory detach-policy")
				.argument("directory-arn", directoryArn)
				.argument("policy-reference", policyReference.toString())
				.argument("object-reference", objectReference.toString())
	}

}


fun AmazonCloudDirectoryFunctions.detachTypedLink(directoryArn: String, typedLinkSpecifier: com.amazonaws.services.clouddirectory.model.TypedLinkSpecifier, init: AmazonCloudDirectoryDetachTypedLinkCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryDetachTypedLinkCommand(directoryArn, typedLinkSpecifier).apply(init))
}

@Generated
class AmazonCloudDirectoryDetachTypedLinkCommand(val directoryArn: String, val typedLinkSpecifier: com.amazonaws.services.clouddirectory.model.TypedLinkSpecifier) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest {
		val input = com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setTypedLinkSpecifier(this.typedLinkSpecifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.detachTypedLink(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory detach-typed-link")
				.argument("directory-arn", directoryArn)
				.argument("typed-link-specifier", typedLinkSpecifier.toString())
	}

}


fun AmazonCloudDirectoryFunctions.disableDirectory(directoryArn: String, init: AmazonCloudDirectoryDisableDirectoryCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryDisableDirectoryCommand(directoryArn).apply(init))
}

@Generated
class AmazonCloudDirectoryDisableDirectoryCommand(val directoryArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest {
		val input = com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest()
		input.setDirectoryArn(this.directoryArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.disableDirectory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory disable-directory")
				.argument("directory-arn", directoryArn)
	}

}


fun AmazonCloudDirectoryFunctions.enableDirectory(directoryArn: String, init: AmazonCloudDirectoryEnableDirectoryCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryEnableDirectoryCommand(directoryArn).apply(init))
}

@Generated
class AmazonCloudDirectoryEnableDirectoryCommand(val directoryArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest {
		val input = com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest()
		input.setDirectoryArn(this.directoryArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.enableDirectory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory enable-directory")
				.argument("directory-arn", directoryArn)
	}

}


fun AmazonCloudDirectoryFunctions.getAppliedSchemaVersion(schemaArn: String, init: AmazonCloudDirectoryGetAppliedSchemaVersionCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryGetAppliedSchemaVersionCommand(schemaArn).apply(init))
}

@Generated
class AmazonCloudDirectoryGetAppliedSchemaVersionCommand(val schemaArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest {
		val input = com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest()
		input.setSchemaArn(this.schemaArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.getAppliedSchemaVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory get-applied-schema-version")
				.argument("schema-arn", schemaArn)
	}

}


fun AmazonCloudDirectoryFunctions.getDirectory(directoryArn: String, init: AmazonCloudDirectoryGetDirectoryCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryGetDirectoryCommand(directoryArn).apply(init))
}

@Generated
class AmazonCloudDirectoryGetDirectoryCommand(val directoryArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.GetDirectoryRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.GetDirectoryRequest {
		val input = com.amazonaws.services.clouddirectory.model.GetDirectoryRequest()
		input.setDirectoryArn(this.directoryArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.getDirectory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory get-directory")
				.argument("directory-arn", directoryArn)
	}

}


fun AmazonCloudDirectoryFunctions.getFacet(schemaArn: String, name: String, init: AmazonCloudDirectoryGetFacetCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryGetFacetCommand(schemaArn, name).apply(init))
}

@Generated
class AmazonCloudDirectoryGetFacetCommand(val schemaArn: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.GetFacetRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.GetFacetRequest {
		val input = com.amazonaws.services.clouddirectory.model.GetFacetRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.getFacet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory get-facet")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
	}

}


fun AmazonCloudDirectoryFunctions.getObjectInformation(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryGetObjectInformationCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryGetObjectInformationCommand(directoryArn, objectReference).apply(init))
}

@Generated
class AmazonCloudDirectoryGetObjectInformationCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest> {

	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest {
		val input = com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.getObjectInformation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory get-object-information")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.getSchemaAsJson(schemaArn: String, init: AmazonCloudDirectoryGetSchemaAsJsonCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryGetSchemaAsJsonCommand(schemaArn).apply(init))
}

@Generated
class AmazonCloudDirectoryGetSchemaAsJsonCommand(val schemaArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest {
		val input = com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest()
		input.setSchemaArn(this.schemaArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.getSchemaAsJson(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory get-schema-as-json")
				.argument("schema-arn", schemaArn)
	}

}


fun AmazonCloudDirectoryFunctions.getTypedLinkFacetInformation(schemaArn: String, name: String, init: AmazonCloudDirectoryGetTypedLinkFacetInformationCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryGetTypedLinkFacetInformationCommand(schemaArn, name).apply(init))
}

@Generated
class AmazonCloudDirectoryGetTypedLinkFacetInformationCommand(val schemaArn: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest {
		val input = com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.getTypedLinkFacetInformation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory get-typed-link-facet-information")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
	}

}


fun AmazonCloudDirectoryFunctions.listAppliedSchemaArns(directoryArn: String, init: AmazonCloudDirectoryListAppliedSchemaArnsCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListAppliedSchemaArnsCommand(directoryArn).apply(init))
}

@Generated
class AmazonCloudDirectoryListAppliedSchemaArnsCommand(val directoryArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest> {

	var schemaArn: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setSchemaArn(this.schemaArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listAppliedSchemaArns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-applied-schema-arns")
				.argument("directory-arn", directoryArn)
				.argument("schema-arn", schemaArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listAttachedIndices(directoryArn: String, targetReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListAttachedIndicesCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListAttachedIndicesCommand(directoryArn, targetReference).apply(init))
}

@Generated
class AmazonCloudDirectoryListAttachedIndicesCommand(val directoryArn: String, val targetReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setTargetReference(this.targetReference)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listAttachedIndices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-attached-indices")
				.argument("directory-arn", directoryArn)
				.argument("target-reference", targetReference.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listDevelopmentSchemaArns(init: AmazonCloudDirectoryListDevelopmentSchemaArnsCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListDevelopmentSchemaArnsCommand().apply(init))
}

@Generated
class AmazonCloudDirectoryListDevelopmentSchemaArnsCommand() : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listDevelopmentSchemaArns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-development-schema-arns")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listDirectories(init: AmazonCloudDirectoryListDirectoriesCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListDirectoriesCommand().apply(init))
}

@Generated
class AmazonCloudDirectoryListDirectoriesCommand() : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var state: DirectoryState? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setState(this.state?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listDirectories(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-directories")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("state", state?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listFacetAttributes(schemaArn: String, name: String, init: AmazonCloudDirectoryListFacetAttributesCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListFacetAttributesCommand(schemaArn, name).apply(init))
}

@Generated
class AmazonCloudDirectoryListFacetAttributesCommand(val schemaArn: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listFacetAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-facet-attributes")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listFacetNames(schemaArn: String, init: AmazonCloudDirectoryListFacetNamesCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListFacetNamesCommand(schemaArn).apply(init))
}

@Generated
class AmazonCloudDirectoryListFacetNamesCommand(val schemaArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest()
		input.setSchemaArn(this.schemaArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listFacetNames(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-facet-names")
				.argument("schema-arn", schemaArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listIncomingTypedLinks(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListIncomingTypedLinksCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListIncomingTypedLinksCommand(directoryArn, objectReference).apply(init))
}

@Generated
class AmazonCloudDirectoryListIncomingTypedLinksCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest> {

	var filterAttributeRanges: List<com.amazonaws.services.clouddirectory.model.TypedLinkAttributeRange>? = null
	var filterTypedLink: com.amazonaws.services.clouddirectory.model.TypedLinkSchemaAndFacetName? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setFilterAttributeRanges(this.filterAttributeRanges)
		input.setFilterTypedLink(this.filterTypedLink)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listIncomingTypedLinks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-incoming-typed-links")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("filter-attribute-ranges", filterAttributeRanges?.toString())
				.argument("filter-typed-link", filterTypedLink?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listIndex(directoryArn: String, indexReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListIndexCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListIndexCommand(directoryArn, indexReference).apply(init))
}

@Generated
class AmazonCloudDirectoryListIndexCommand(val directoryArn: String, val indexReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListIndexRequest> {

	var rangesOnIndexedValues: List<com.amazonaws.services.clouddirectory.model.ObjectAttributeRange>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListIndexRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListIndexRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setRangesOnIndexedValues(this.rangesOnIndexedValues)
		input.setIndexReference(this.indexReference)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listIndex(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-index")
				.argument("directory-arn", directoryArn)
				.argument("ranges-on-indexed-values", rangesOnIndexedValues?.toString())
				.argument("index-reference", indexReference.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listObjectAttributes(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListObjectAttributesCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListObjectAttributesCommand(directoryArn, objectReference).apply(init))
}

@Generated
class AmazonCloudDirectoryListObjectAttributesCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var consistencyLevel: ConsistencyLevel? = null
	var facetFilter: com.amazonaws.services.clouddirectory.model.SchemaFacet? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		input.setFacetFilter(this.facetFilter)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listObjectAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-object-attributes")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("consistency-level", consistencyLevel?.toString())
				.argument("facet-filter", facetFilter?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listObjectChildren(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListObjectChildrenCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListObjectChildrenCommand(directoryArn, objectReference).apply(init))
}

@Generated
class AmazonCloudDirectoryListObjectChildrenCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listObjectChildren(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-object-children")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listObjectParentPaths(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListObjectParentPathsCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListObjectParentPathsCommand(directoryArn, objectReference).apply(init))
}

@Generated
class AmazonCloudDirectoryListObjectParentPathsCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listObjectParentPaths(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-object-parent-paths")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listObjectParents(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListObjectParentsCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListObjectParentsCommand(directoryArn, objectReference).apply(init))
}

@Generated
class AmazonCloudDirectoryListObjectParentsCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listObjectParents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-object-parents")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listObjectPolicies(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListObjectPoliciesCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListObjectPoliciesCommand(directoryArn, objectReference).apply(init))
}

@Generated
class AmazonCloudDirectoryListObjectPoliciesCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listObjectPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-object-policies")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listOutgoingTypedLinks(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListOutgoingTypedLinksCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListOutgoingTypedLinksCommand(directoryArn, objectReference).apply(init))
}

@Generated
class AmazonCloudDirectoryListOutgoingTypedLinksCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest> {

	var filterAttributeRanges: List<com.amazonaws.services.clouddirectory.model.TypedLinkAttributeRange>? = null
	var filterTypedLink: com.amazonaws.services.clouddirectory.model.TypedLinkSchemaAndFacetName? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setFilterAttributeRanges(this.filterAttributeRanges)
		input.setFilterTypedLink(this.filterTypedLink)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listOutgoingTypedLinks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-outgoing-typed-links")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("filter-attribute-ranges", filterAttributeRanges?.toString())
				.argument("filter-typed-link", filterTypedLink?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listPolicyAttachments(directoryArn: String, policyReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryListPolicyAttachmentsCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListPolicyAttachmentsCommand(directoryArn, policyReference).apply(init))
}

@Generated
class AmazonCloudDirectoryListPolicyAttachmentsCommand(val directoryArn: String, val policyReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var consistencyLevel: ConsistencyLevel? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setPolicyReference(this.policyReference)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setConsistencyLevel(this.consistencyLevel?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listPolicyAttachments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-policy-attachments")
				.argument("directory-arn", directoryArn)
				.argument("policy-reference", policyReference.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("consistency-level", consistencyLevel?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listPublishedSchemaArns(init: AmazonCloudDirectoryListPublishedSchemaArnsCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListPublishedSchemaArnsCommand().apply(init))
}

@Generated
class AmazonCloudDirectoryListPublishedSchemaArnsCommand() : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest> {

	var schemaArn: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest()
		input.setSchemaArn(this.schemaArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listPublishedSchemaArns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-published-schema-arns")
				.argument("schema-arn", schemaArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listTagsForResource(resourceArn: String, init: AmazonCloudDirectoryListTagsForResourceCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListTagsForResourceCommand(resourceArn).apply(init))
}

@Generated
class AmazonCloudDirectoryListTagsForResourceCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-tags-for-resource")
				.argument("resource-arn", resourceArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listTypedLinkFacetAttributes(schemaArn: String, name: String, init: AmazonCloudDirectoryListTypedLinkFacetAttributesCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListTypedLinkFacetAttributesCommand(schemaArn, name).apply(init))
}

@Generated
class AmazonCloudDirectoryListTypedLinkFacetAttributesCommand(val schemaArn: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listTypedLinkFacetAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-typed-link-facet-attributes")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.listTypedLinkFacetNames(schemaArn: String, init: AmazonCloudDirectoryListTypedLinkFacetNamesCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryListTypedLinkFacetNamesCommand(schemaArn).apply(init))
}

@Generated
class AmazonCloudDirectoryListTypedLinkFacetNamesCommand(val schemaArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest {
		val input = com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest()
		input.setSchemaArn(this.schemaArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.listTypedLinkFacetNames(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory list-typed-link-facet-names")
				.argument("schema-arn", schemaArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.lookupPolicy(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryLookupPolicyCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryLookupPolicyCommand(directoryArn, objectReference).apply(init))
}

@Generated
class AmazonCloudDirectoryLookupPolicyCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.LookupPolicyRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.clouddirectory.model.LookupPolicyRequest {
		val input = com.amazonaws.services.clouddirectory.model.LookupPolicyRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.lookupPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory lookup-policy")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.publishSchema(developmentSchemaArn: String, version: String, init: AmazonCloudDirectoryPublishSchemaCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryPublishSchemaCommand(developmentSchemaArn, version).apply(init))
}

@Generated
class AmazonCloudDirectoryPublishSchemaCommand(val developmentSchemaArn: String, val version: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.PublishSchemaRequest> {

	var minorVersion: String? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.PublishSchemaRequest {
		val input = com.amazonaws.services.clouddirectory.model.PublishSchemaRequest()
		input.setDevelopmentSchemaArn(this.developmentSchemaArn)
		input.setVersion(this.version)
		input.setMinorVersion(this.minorVersion)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.publishSchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory publish-schema")
				.argument("development-schema-arn", developmentSchemaArn)
				.argument("version", version)
				.argument("minor-version", minorVersion)
				.argument("name", name)
	}

}


fun AmazonCloudDirectoryFunctions.putSchemaFromJson(schemaArn: String, document: String, init: AmazonCloudDirectoryPutSchemaFromJsonCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryPutSchemaFromJsonCommand(schemaArn, document).apply(init))
}

@Generated
class AmazonCloudDirectoryPutSchemaFromJsonCommand(val schemaArn: String, val document: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest {
		val input = com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest()
		input.setSchemaArn(this.schemaArn)
		input.setDocument(this.document)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.putSchemaFromJson(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory put-schema-from-json")
				.argument("schema-arn", schemaArn)
				.argument("document", document)
	}

}


fun AmazonCloudDirectoryFunctions.removeFacetFromObject(directoryArn: String, schemaFacet: com.amazonaws.services.clouddirectory.model.SchemaFacet, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, init: AmazonCloudDirectoryRemoveFacetFromObjectCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryRemoveFacetFromObjectCommand(directoryArn, schemaFacet, objectReference).apply(init))
}

@Generated
class AmazonCloudDirectoryRemoveFacetFromObjectCommand(val directoryArn: String, val schemaFacet: com.amazonaws.services.clouddirectory.model.SchemaFacet, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest {
		val input = com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setSchemaFacet(this.schemaFacet)
		input.setObjectReference(this.objectReference)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.removeFacetFromObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory remove-facet-from-object")
				.argument("directory-arn", directoryArn)
				.argument("schema-facet", schemaFacet.toString())
				.argument("object-reference", objectReference.toString())
	}

}


fun AmazonCloudDirectoryFunctions.tagResource(resourceArn: String, tags: List<com.amazonaws.services.clouddirectory.model.Tag>, init: AmazonCloudDirectoryTagResourceCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryTagResourceCommand(resourceArn, tags).apply(init))
}

@Generated
class AmazonCloudDirectoryTagResourceCommand(val resourceArn: String, val tags: List<com.amazonaws.services.clouddirectory.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.TagResourceRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.TagResourceRequest {
		val input = com.amazonaws.services.clouddirectory.model.TagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory tag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags.toString())
	}

}


fun AmazonCloudDirectoryFunctions.untagResource(resourceArn: String, tagKeys: List<String>, init: AmazonCloudDirectoryUntagResourceCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryUntagResourceCommand(resourceArn, tagKeys).apply(init))
}

@Generated
class AmazonCloudDirectoryUntagResourceCommand(val resourceArn: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.UntagResourceRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.UntagResourceRequest {
		val input = com.amazonaws.services.clouddirectory.model.UntagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory untag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonCloudDirectoryFunctions.updateFacet(schemaArn: String, name: String, init: AmazonCloudDirectoryUpdateFacetCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryUpdateFacetCommand(schemaArn, name).apply(init))
}

@Generated
class AmazonCloudDirectoryUpdateFacetCommand(val schemaArn: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.UpdateFacetRequest> {

	var attributeUpdates: List<com.amazonaws.services.clouddirectory.model.FacetAttributeUpdate>? = null
	var objectType: ObjectType? = null

	override fun build(): com.amazonaws.services.clouddirectory.model.UpdateFacetRequest {
		val input = com.amazonaws.services.clouddirectory.model.UpdateFacetRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		input.setAttributeUpdates(this.attributeUpdates)
		input.setObjectType(this.objectType?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.updateFacet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory update-facet")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
				.argument("attribute-updates", attributeUpdates?.toString())
				.argument("object-type", objectType?.toString())
	}

}


fun AmazonCloudDirectoryFunctions.updateObjectAttributes(directoryArn: String, objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, attributeUpdates: List<com.amazonaws.services.clouddirectory.model.ObjectAttributeUpdate>, init: AmazonCloudDirectoryUpdateObjectAttributesCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryUpdateObjectAttributesCommand(directoryArn, objectReference, attributeUpdates).apply(init))
}

@Generated
class AmazonCloudDirectoryUpdateObjectAttributesCommand(val directoryArn: String, val objectReference: com.amazonaws.services.clouddirectory.model.ObjectReference, val attributeUpdates: List<com.amazonaws.services.clouddirectory.model.ObjectAttributeUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest {
		val input = com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest()
		input.setDirectoryArn(this.directoryArn)
		input.setObjectReference(this.objectReference)
		input.setAttributeUpdates(this.attributeUpdates)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.updateObjectAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory update-object-attributes")
				.argument("directory-arn", directoryArn)
				.argument("object-reference", objectReference.toString())
				.argument("attribute-updates", attributeUpdates.toString())
	}

}


fun AmazonCloudDirectoryFunctions.updateSchema(schemaArn: String, name: String, init: AmazonCloudDirectoryUpdateSchemaCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryUpdateSchemaCommand(schemaArn, name).apply(init))
}

@Generated
class AmazonCloudDirectoryUpdateSchemaCommand(val schemaArn: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest {
		val input = com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.updateSchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory update-schema")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
	}

}


fun AmazonCloudDirectoryFunctions.updateTypedLinkFacet(schemaArn: String, name: String, attributeUpdates: List<com.amazonaws.services.clouddirectory.model.TypedLinkFacetAttributeUpdate>, identityAttributeOrder: List<String>, init: AmazonCloudDirectoryUpdateTypedLinkFacetCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryUpdateTypedLinkFacetCommand(schemaArn, name, attributeUpdates, identityAttributeOrder).apply(init))
}

@Generated
class AmazonCloudDirectoryUpdateTypedLinkFacetCommand(val schemaArn: String, val name: String, val attributeUpdates: List<com.amazonaws.services.clouddirectory.model.TypedLinkFacetAttributeUpdate>, val identityAttributeOrder: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest> {



	override fun build(): com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest {
		val input = com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest()
		input.setSchemaArn(this.schemaArn)
		input.setName(this.name)
		input.setAttributeUpdates(this.attributeUpdates)
		input.setIdentityAttributeOrder(this.identityAttributeOrder)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.updateTypedLinkFacet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory update-typed-link-facet")
				.argument("schema-arn", schemaArn)
				.argument("name", name)
				.argument("attribute-updates", attributeUpdates.toString())
				.argument("identity-attribute-order", identityAttributeOrder.toString())
	}

}


fun AmazonCloudDirectoryFunctions.upgradeAppliedSchema(publishedSchemaArn: String, directoryArn: String, init: AmazonCloudDirectoryUpgradeAppliedSchemaCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryUpgradeAppliedSchemaCommand(publishedSchemaArn, directoryArn).apply(init))
}

@Generated
class AmazonCloudDirectoryUpgradeAppliedSchemaCommand(val publishedSchemaArn: String, val directoryArn: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest> {

	var dryRun: Boolean? = false

	override fun build(): com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest {
		val input = com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest()
		input.setPublishedSchemaArn(this.publishedSchemaArn)
		input.setDirectoryArn(this.directoryArn)
		input.setDryRun(this.dryRun)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.upgradeAppliedSchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory upgrade-applied-schema")
				.argument("published-schema-arn", publishedSchemaArn)
				.argument("directory-arn", directoryArn)
				.option("dry-run", dryRun ?: false)
	}

}


fun AmazonCloudDirectoryFunctions.upgradePublishedSchema(developmentSchemaArn: String, publishedSchemaArn: String, minorVersion: String, init: AmazonCloudDirectoryUpgradePublishedSchemaCommand.() -> Unit) {
	this.block.declare(AmazonCloudDirectoryUpgradePublishedSchemaCommand(developmentSchemaArn, publishedSchemaArn, minorVersion).apply(init))
}

@Generated
class AmazonCloudDirectoryUpgradePublishedSchemaCommand(val developmentSchemaArn: String, val publishedSchemaArn: String, val minorVersion: String) : AmazonWebServiceCommand<com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest> {

	var dryRun: Boolean? = false

	override fun build(): com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest {
		val input = com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest()
		input.setDevelopmentSchemaArn(this.developmentSchemaArn)
		input.setPublishedSchemaArn(this.publishedSchemaArn)
		input.setMinorVersion(this.minorVersion)
		input.setDryRun(this.dryRun)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.clouddirectory.upgradePublishedSchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws clouddirectory upgrade-published-schema")
				.argument("development-schema-arn", developmentSchemaArn)
				.argument("published-schema-arn", publishedSchemaArn)
				.argument("minor-version", minorVersion)
				.option("dry-run", dryRun ?: false)
	}

}
