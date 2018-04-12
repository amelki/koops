package codingue.koops.core

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import java.io.*
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.*
import com.fasterxml.jackson.databind.node.*
import java.io.IOException
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode


@DslMarker
annotation class CliMarker

open class Environment(var dryRun: Boolean = false) {
	val capabilities = HashMap<String, Any>()
}

@CliMarker
interface Command<out T: Any> {
	fun eval(environment: Environment): T
	fun dryRun(): T
}

@CliMarker
open class Block(var environment: Environment): Command<Any> {
	private val commands = mutableListOf<Command<*>>()

	override fun toString(): String {
		return "block { $commands }"
	}

	fun declare(anonymousBlock: () -> Any, anonymousDryRun: (() -> Unit)? = null): Any? {
		return declare(object: Command<Any> {
			override fun eval(environment: Environment): Any {
				return anonymousBlock()
			}
			override fun dryRun() {
				if (anonymousDryRun == null) {
					println("Executing anonymous $anonymousBlock")
				} else {
					anonymousDryRun()
				}
			}
		})
	}

	open fun declare(command: Command<*>): Any {
		commands.add(command)
		return if (environment.dryRun) {
			command.dryRun()
		} else {
			command.eval(environment)
		}
	}

	override fun eval(environment: Environment) {
		// Does nothing
	}

	override fun dryRun() {
		// Does nothing
	}

}

private const val ANSI_RESET = "\u001B[0m"
private const val ANSI_BLACK = "\u001B[30m"
private const val ANSI_RED = "\u001B[31m"
private const val ANSI_GREEN = "\u001B[32m"
private const val ANSI_YELLOW = "\u001B[33m"
private const val ANSI_BLUE = "\u001B[34m"
private const val ANSI_PURPLE = "\u001B[35m"
private const val ANSI_CYAN = "\u001B[36m"
private const val ANSI_WHITE = "\u001B[37m"

@CliMarker
class Pretty(environment: Environment): Block(environment) {
	private val commands = mutableListOf<Command<*>>()
	private val objectMapper: ObjectMapper = jacksonObjectMapper()

	var writer: PrintWriter? = null
	var stream: PrintStream? = System.out
	var colorMap: (JsonItem) -> JsonColor = defaultMap
	var indentLevel: Int = 2

	init {
		objectMapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false)
	}

	override fun toString(): String {
		return "pretty { $commands }"
	}

	override fun declare(command: Command<*>): Any {
		val any = super.declare(command)
		val jsonNode = objectMapper.valueToTree<JsonNode>(any)
		jsonNode.nodeType
		val w = writer ?: PrintWriter(stream)
		JsonPrettyPrinter(w, indentLevel, colorMap).printNode(jsonNode, 0)
		w.println()
		w.flush()
		return any
	}

}

enum class JsonItem {
	Number, String, Null, Field, Boolean
}

enum class JsonColor(val ansiColor: String) {
	Black(ANSI_BLACK),
	Red(ANSI_RED),
	Green(ANSI_GREEN),
	Yellow(ANSI_YELLOW),
	Blue(ANSI_BLUE),
	Purple(ANSI_PURPLE),
	Cyan(ANSI_CYAN),
	White(ANSI_WHITE)
}

val defaultMap: (item: JsonItem) -> JsonColor = {
	when (it) {
		JsonItem.Boolean -> JsonColor.Green
		JsonItem.String -> JsonColor.Red
		JsonItem.Number -> JsonColor.Green
		JsonItem.Field -> JsonColor.Blue
		JsonItem.Null -> JsonColor.Yellow
	}
}

/**
 * Write our own pretty printer, with colorization - Jackson does not seem to provide any easy way
 * of doing this easily via serialization configuration
 */
private class JsonPrettyPrinter(val out: PrintWriter, val indentLevel: Int, val colorMap: (JsonItem) -> JsonColor) {

	fun indent(i: Int): String {
		return String(CharArray(i * indentLevel)).replace('\u0000', ' ')
	}

	fun printNode(node: JsonNode, indent: Int) {
		when (node.nodeType) {
			JsonNodeType.ARRAY -> this.printArray(node as ArrayNode, indent)
			JsonNodeType.BINARY -> this.printBinary(node as BinaryNode, indent)
			JsonNodeType.BOOLEAN -> this.printBoolean(node as BooleanNode, indent)
			JsonNodeType.MISSING -> this.printMissing(node as MissingNode, indent)
			JsonNodeType.NULL -> this.printNull(node as NullNode, indent)
			JsonNodeType.NUMBER -> this.printNumber(node as ValueNode, indent)
			JsonNodeType.OBJECT -> this.printObject(node as ObjectNode, indent)
			JsonNodeType.POJO -> this.printPojo(node as POJONode, indent)
			JsonNodeType.STRING -> this.printString(node as TextNode, indent)
			else -> throw IllegalStateException("Unknown type ${node.nodeType}")
		}
	}

	private fun printString(node: TextNode, indent: Int) {
		out.print("\"")
		val text = node.asText()
		if (text.isNotEmpty()) {
			out.print(ANSI_RED)
			out.print(text)
			out.print(ANSI_RESET)
		}
		out.print("\"")
	}

	private fun printPojo(pojoNode: POJONode, indent: Int) {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	private fun printColor(text: String, type: JsonItem) {
		out.print(colorMap(type).ansiColor)
		out.print(text)
		out.print(ANSI_RESET)
	}

	private fun printObject(node: ObjectNode, indent: Int) {
		out.println("{")
		val fields = node.fields().asSequence()
		val size = node.size()
		fields.forEachIndexed { index, entry ->
			out.print(indent(indent + 1))
			out.print("\"")
			printColor(entry.key, JsonItem.Field)
			out.print("\": ")
			printNode(entry.value, indent + 1)
			if (index < size - 1) {
				out.print(",")
			}
			out.println()
		}
		out.print(indent(indent))
		out.print("}")
	}

	private fun printNumber(node: ValueNode, indent: Int) {
		printColor(node.asText(), JsonItem.Number)
	}

	private fun printNull(node: NullNode, indent: Int) {
		printColor(node.asText(), JsonItem.Null)
	}

	private fun printMissing(node: MissingNode, indent: Int) {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	private fun printBoolean(node: BooleanNode, indent: Int) {
		printColor(node.asText(), JsonItem.Boolean)
	}

	private fun printBinary(binaryNode: BinaryNode, indent: Int) {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	private fun printArray(node: ArrayNode, indent: Int) {
		if (node.size() == 0) {
			out.print("[]")
		} else {
			out.println("[")
			node.forEachIndexed { index, jsonNode ->
				out.print(indent(indent + 1))
				this.printNode(jsonNode, indent + 1)
				if (index < node.size() - 1) {
					out.println(",")
				} else {
					out.println()
				}
			}
			out.print(indent(indent))
			out.print("]")
		}
	}
}


@CliMarker
class Deferred(private val init: Block.() -> Unit): Command<Any> {

	override fun eval(environment: Environment) {
		// Eval does nothing => must be explicitely run when needed
	}

	override fun dryRun() {
		// Does nothing
	}

	fun run(environment: Environment): Any = Block(environment).apply(init)

}

fun block(environment: Environment, block: Block.() -> Unit): Block {
	return Block(environment).apply(block)
}

fun block(block: Block.() -> Unit): Block {
	return block(Environment(), block)
}

fun pretty(init: Pretty.() -> Unit): Pretty {
	return Pretty(Environment()).apply(init)
}

fun deferred(init: Block.() -> Unit): Deferred {
	return Deferred(init)
}
