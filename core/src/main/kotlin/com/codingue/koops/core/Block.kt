package com.codingue.koops.core

@CliMarker
open class Block(var environment: Environment) : Command<Any?> {
	private val results = mutableListOf<Result>()

	class Result(val command: Command<*>, val value: Any?)

	override fun description(): String? {
		return null
	}

	override fun commandName() = "block"

	override fun toString(): String {
		return "block { ${results.map { it.command.toString() }} }"
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
		val res = if (environment.dryRun) {
			command.dryRun()
		} else {
			command.doEval(environment)
		}
		results.add(Result(command, res))
		return res
	}

	override fun eval(environment: Environment): Any? {
		return results.lastOrNull()?.value
	}

	fun evalAll(): List<Any?> {
		return results.map { it.value }
	}

	override fun dryRun(): Any {
		return ""
	}

}
