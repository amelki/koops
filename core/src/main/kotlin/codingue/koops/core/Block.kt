package codingue.koops.core

@DslMarker
annotation class CliMarker

open class Environment(var dryRun: Boolean = false) {
	val capabilities = HashMap<String, Any>()
}

@CliMarker
interface Command {
	fun eval(environment: Environment)
	fun dryRun()
}

@CliMarker
class Block(var environment: Environment): Command {
	private val commands = mutableListOf<Command>()

	override fun toString(): String {
		return "block { $commands }"
	}

	fun declare(anonymousBlock: () -> Unit, anonymousDryRun: (() -> Unit)? = null) {
		declare(object: Command {
			override fun eval(environment: Environment) {
				anonymousBlock()
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

	fun declare(command: Command) {
		commands.add(command)
		if (environment.dryRun) {
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

@CliMarker
class Deferred(private val init: Block.() -> Unit): Command {

	override fun eval(environment: Environment) {
		// Eval does nothing => must be explicitely run when needed
	}

	override fun dryRun() {
		// Does nothing
	}

	fun run(environment: Environment) = Block(environment).apply(init)

}

fun block(environment: Environment, block: Block.() -> Unit): Block {
	return Block(environment).apply(block)
}

fun deferred(init: Block.() -> Unit): Deferred {
	return Deferred(init)
}
