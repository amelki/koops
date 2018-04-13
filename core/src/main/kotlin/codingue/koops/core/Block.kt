package codingue.koops.core

@CliMarker
open class Block(var environment: Environment): Command<Any> {
	private val commands = mutableListOf<Command<*>>()
	private var result: Any? = null

	override fun title(): String? {
		return null
	}

	override fun toString(): String {
		return "block { $commands }"
	}

	fun declare(anonymousBlock: () -> Any, anonymousDryRun: (() -> Unit)? = null): Any? {
		return declare(object: Command<Any> {
			override fun eval(environment: Environment): Any {
				return anonymousBlock()
			}

			override fun title(): String? = null

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
		val res = if (environment.dryRun) {
			command.dryRun()
		} else {
			command.doEval(environment)
		}
		result = res
		return res
	}

	override fun eval(environment: Environment): Any {
		return result!!
	}

	override fun dryRun(): Any {
		return ""
	}

}
