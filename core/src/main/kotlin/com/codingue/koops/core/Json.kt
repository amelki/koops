package com.codingue.koops.core

infix fun <T> Block.json(init: Json.() -> T): T {
	val jsonCommand = Json(this.environment)
	val result = jsonCommand.run(init)
	this.declare(jsonCommand)
	return result
}

open class Json(environment: Environment) : Block(environment) {
	val map = HashMap<String, Any>()
	override fun eval(environment: Environment): Any {
		return map
	}

	override fun commandName() = "json"

	override fun dryRun(): Any {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	fun set(name: String, value: Any?): Any? {
		if (value != null) {
			map[name] = value
		}
		return value
	}

	fun set(name: String, init: Block.() -> Unit): Any? {
		val result = Block(environment).apply(init).doEval(environment)
		return set(name, result)
	}

	fun setIf(predicate: Boolean, name: String, init: Block.() -> Unit): Any? {
		if (predicate) {
			val result = Block(environment).apply(init).doEval(environment)
			return set(name, result)
		}
		return null
	}

}

infix fun <T> Block.jsonArray(init: JsonArray.() -> T): T {
	val jsonCommand = JsonArray(this.environment)
	val result = jsonCommand.run(init)
	declare(jsonCommand)
	return result
}

open class JsonArray(environment: Environment) : Block(environment) {
	val list = mutableListOf<Any>()
	override fun eval(environment: Environment): Any? {
		return list
	}

	override fun commandName() = "json-array"

	override fun dryRun(): Any {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	fun add(value: Any?): Any? {
		if (value != null) {
			list.add(value)
		}
		return value
	}

	fun add(init: Block.() -> Unit): Any? {
		val result = Block(environment).apply(init).eval(environment)
		return add(result)
	}

	fun addIf(predicate: Boolean, init: Block.() -> Unit): Any? {
		if (predicate) {
			return add(init)
		}
		return null
	}

	fun addAll(init: Block.() -> Unit): Any? {
		val result = Block(environment).apply(init).evalAll().filterNotNull()
		result.map { add(it) }
		return result
	}

	fun addAllIf(predicate: Boolean, init: Block.() -> Unit): Any? {
		if (predicate) {
			return addAll(init)
		}
		return null
	}

}

/**
 * A block that creates an array with the result of each command declared
 */
fun Print.jsonCommandResults(init: Block.() -> Any): Any {
	val jsonCommand = JsonCommandResults(this.environment)
	return try {
		jsonCommand.run(init).also {
			jsonCommand.set("status", "completed")
			declare(jsonCommand)
		}
	} catch (e: CommandException) {
		jsonCommand.set("status", "stopped")
		jsonCommand.set("exception", object {
			val command = e.command.description()
			val message = e.message
			val exception = e.cause
		})
		declare(jsonCommand)
		return e
	}
}

class JsonCommandResults(environment: Environment) : Json(environment) {

	private val results = mutableListOf<Result>()
	override fun commandName() = "json-command-result"

	init {
		map["results"] = results
	}

	data class Result(val command: String, val result: Any?)

	override fun declare(command: Command<*>): Any? {
		val result = super.declare(command)
		results.add(Result(command.description() ?: command.toString(), result))
		return result
	}
}

