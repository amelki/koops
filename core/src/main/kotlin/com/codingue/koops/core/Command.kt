package com.codingue.koops.core

@DslMarker
annotation class CliMarker

@CliMarker
interface Command<out T : Any?> {
	fun eval(environment: Environment): T
	fun dryRun(): T
	fun description(): String?
	fun commandName(): String

	fun doEval(environment: Environment): T {
		val description = description()
		return try {
			if (description != null) {
				doDisplay(environment, "[koops] $description")
			}
			eval(environment)
		} catch (e: Exception) {
			when (e) {
				is CommandException -> throw e
				else -> throw CommandException(this, e.message, e)
			}
		} finally {
			if (description != null && environment.progress) {
				print("%-${environment.maxColumns}s".format(" "))
				print("\r")
			}
		}
	}

	fun display(environment: Environment, str: String) {
		doDisplay(environment, "[koops][${commandName()}] $str")
	}

	private fun doDisplay(environment: Environment, str: String) {
		if (environment.progress) {
			var s = str
			if (s.length > environment.maxColumns) {
				s = s.substring(0, environment.maxColumns)
			}
			print("%-${environment.maxColumns}s".format(s))
			print("\r")
		} else {
			println(str)
		}
	}

}
