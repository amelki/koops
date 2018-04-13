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

@CliMarker
interface Command<out T: Any> {
	fun eval(environment: Environment): T
	fun dryRun(): T
}

@CliMarker
open class Block(var environment: Environment): Command<Any> {
	private val commands = mutableListOf<Command<*>>()
	private var result: Any? = null

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
		val res = if (environment.dryRun) {
			command.dryRun()
		} else {
			command.eval(environment)
		}
		result = res
		return res
	}

	override fun eval(environment: Environment): Any {
		return result!!
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
