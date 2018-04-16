package com.codingue.koops.core

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import java.io.PrintStream
import java.io.PrintWriter

val Json = Script.ReportType.Json
val ToString = Script.ReportType.ToString

@CliMarker
open class Script(var environment: Environment) : Command<Any?> {

	private val objectMapper: ObjectMapper = jacksonObjectMapper()

	private val report = Report()
	var reportAs: ReportType = ReportType.Json

	enum class ReportType {
		Json, ToString, None
	}

	enum class Status {
		NotStarted, Completed, Stopped
	}

	class Result(val command: String, val value: Any?)

	class Report(val results: MutableList<Result> = mutableListOf()) {
		var status: Status = Status.NotStarted
		var exception: Exception? = null
	}

	override fun description(): String? {
		return null
	}

	override fun commandName() = "script"

	override fun toString(): String {
		return "script { ${report.results.map { it.command.toString() }} }"
	}

	fun declare(anonymousBlock: () -> Any, anonymousDryRun: (() -> Unit)? = null): Any? {
		return declare(object : Command<Any> {
			override fun eval(environment: Environment): Any {
				return anonymousBlock()
			}

			override fun commandName() = "anonymous"

			override fun description(): String? = null

			override fun dryRun() {
				if (anonymousDryRun == null) {
					println("Executing anonymous $anonymousBlock")
				} else {
					anonymousDryRun()
				}
			}
		})
	}

	open fun declare(command: Command<*>): Any? {
		return if (environment.dryRun) {
			command.dryRun()
		} else {
			command.doEval(environment)
		}.also {
			report.results.add(Result(command.description()?: commandName(), it))
		}
	}

	internal fun applyInit(environment: Environment, init: Script.() -> Any?): Script {
		try {
			this.run(init)
			report.status = Status.Completed
		} catch (e: CommandException) {
			if (reportAs != ReportType.None) {
				report.status = Status.Stopped
				report.exception = e
			} else {
				throw e
			}
		}
		val w = environment.printConfig.writer ?: PrintWriter(environment.printConfig.stream)
		when (reportAs) {
			ReportType.Json -> {
				val jsonNode = objectMapper.valueToTree<JsonNode>(report)
				JsonPrettyPrinter(w, environment.printConfig).printNode(jsonNode, 0)
				w.flush()
				w.println()
			}
			ReportType.ToString -> {
				w.println(report.toString())
			}
			else -> {
				// Do nothing
			}
		}
		return this
	}

	override fun eval(environment: Environment): Any? {
		return report.results.lastOrNull()?.value
	}

	fun evalAll(): List<Any?> {
		return report.results.map { it.value }
	}

	override fun dryRun(): Any {
		return ""
	}

}
