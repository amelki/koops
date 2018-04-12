package codingue.koops.core

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

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

@CliMarker
class Pretty(environment: Environment): Block(environment) {
	private val commands = mutableListOf<Command<*>>()

	override fun toString(): String {
		return "pretty { $commands }"
	}

	override fun declare(command: Command<*>) {
		val any = super.declare(command)
		commands.add(command)
		jacksonObjectMapper().writerWithDefaultPrettyPrinter().writeValue(System.err, any)
	}

	override fun eval(environment: Environment) {
		// Does nothing
	}

	override fun dryRun() {
		// Does nothing
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
