package codingue.koops.core

infix fun <T> Block.json(init: Json.() -> T): T {
	val jsonCommand = Json(this.environment)
	val result = jsonCommand.run(init)
	this.declare(jsonCommand)
	return result
}

class Json(environment: Environment) : Block(environment) {
	val map = HashMap<String, Any>()
	override fun eval(environment: Environment): Any {
		return map
	}

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
fun <T> Block.log(init: CommandLog.() -> T): T {
	val jsonCommand = CommandLog(this.environment)
	val result = jsonCommand.run(init)
	declare(jsonCommand)
	return result
}


class CommandLog(environment: Environment) : JsonArray(environment) {
	override fun declare(command: Command<*>): Any? {
		val result = super.declare(command)
		add {
			json {
				set("command", command.title())
				set("result", result)
			}
		}
		return result
	}
}