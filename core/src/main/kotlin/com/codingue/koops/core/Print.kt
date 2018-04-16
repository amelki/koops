package com.codingue.koops.core

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.*
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import java.io.PrintStream
import java.io.PrintWriter

private const val ANSI_RESET = "\u001B[0m"
private const val ANSI_BLACK = "\u001B[30m"
private const val ANSI_RED = "\u001B[31m"
private const val ANSI_GREEN = "\u001B[32m"
private const val ANSI_YELLOW = "\u001B[33m"
private const val ANSI_BLUE = "\u001B[34m"
private const val ANSI_PURPLE = "\u001B[35m"
private const val ANSI_CYAN = "\u001B[36m"
private const val ANSI_WHITE = "\u001B[37m"


val Environment.printConfig: PrintConfig
	get() {
		var service = this.capabilities[PrintConfig::class.java.name]
		if (service == null) {
			service = PrintConfig()
			this.capabilities[PrintConfig::class.java.name] = service
		}
		return service as PrintConfig
	}

class PrintConfig {

	val jsonFeatures = JsonFeatures()

	enum class Format {
		Json, ToString
	}

	var writer: PrintWriter? = null
	var stream: PrintStream? = System.out

	class JsonFeatures {
		var colorMap: (JsonItem) -> JsonColor = defaultMap
		var indentLevel: Int = 2
		var includeNullFields = false
		var includeEmptyArrays = false
		var withColors = true
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

private val defaultMap: (item: JsonItem) -> JsonColor = {
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
internal class JsonPrettyPrinter(val out: PrintWriter, val printConfig: PrintConfig) {

	fun indent(i: Int): String {
		return String(CharArray(i * printConfig.jsonFeatures.indentLevel)).replace('\u0000', ' ')
	}

	fun printNode(node: JsonNode, indent: Int) {
		when (node.nodeType) {
			JsonNodeType.ARRAY -> this.printArray(node as ArrayNode, indent)
			JsonNodeType.BOOLEAN -> this.printBoolean(node as BooleanNode)
			JsonNodeType.NULL -> this.printNull(node as NullNode)
			JsonNodeType.NUMBER -> this.printNumber(node as ValueNode)
			JsonNodeType.OBJECT -> this.printObject(node as ObjectNode, indent)
			JsonNodeType.STRING -> this.printString(node as TextNode)
			JsonNodeType.BINARY -> this.printBinary(node as BinaryNode)
			else -> throw IllegalStateException("Unknown type ${node.nodeType}")
		}
	}

	private fun printString(node: TextNode) {
		out.print("\"")
		val text = node.asText()
		if (text.isNotEmpty()) {
			printColor(text, JsonItem.String)
		}
		out.print("\"")
	}

	private fun printBinary(node: BinaryNode) {
		out.print("\"")
		val text = node.asText()
		if (text.isNotEmpty()) {
			printColor(text, JsonItem.String)
		}
		out.print("\"")
	}

	private fun printColor(text: String, type: JsonItem) {
		if (printConfig.jsonFeatures.withColors) {
			out.print(printConfig.jsonFeatures.colorMap(type).ansiColor)
		}
		out.print(text)
		if (printConfig.jsonFeatures.withColors) {
			out.print(ANSI_RESET)
		}
	}

	private fun printObject(node: ObjectNode, indent: Int) {
		out.println("{")
		val fields = node.fields().asSequence()
		var size = node.size()
		fields.filter {
			when {
				it.value.isNull -> {
					size--
					printConfig.jsonFeatures.includeNullFields
				}
				(it.value.isArray && it.value.size() == 0) -> {
					size--
					printConfig.jsonFeatures.includeEmptyArrays
				}
				else -> true
			}
		}.forEachIndexed { index, entry ->
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

	private fun printNumber(node: ValueNode) {
		printColor(node.asText(), JsonItem.Number)
	}

	private fun printNull(node: NullNode) {
		printColor(node.asText(), JsonItem.Null)
	}

	private fun printBoolean(node: BooleanNode) {
		printColor(node.asText(), JsonItem.Boolean)
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
