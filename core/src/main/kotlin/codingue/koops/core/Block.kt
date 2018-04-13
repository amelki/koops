package codingue.koops.core


@DslMarker
annotation class CliMarker

@CliMarker
interface Command<out T: Any> {
	fun eval(environment: Environment): T
	fun dryRun(): T
	fun title(): String?
	fun doEval(environment: Environment): T {
		val title = title()
		if (title != null && environment.progress) print("Executing $title")
		return eval(environment).also {
			if (title != null && environment.progress) print("\r")
		}
	}
}

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


@CliMarker
class Deferred(private val init: Block.() -> Unit): Command<Any> {

	override fun title(): String? = null

	override fun eval(environment: Environment) {
		// Eval does nothing => must be explicitely run when needed
	}

	override fun dryRun() {
		// Does nothing
	}

	fun run(environment: Environment): Any = Block(environment).apply(init)

}
