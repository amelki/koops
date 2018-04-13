package codingue.koops.core

infix fun <T> Block.json(init: Json.() -> T): T {
	val jsonCommand = Json(this.environment)
	val result = jsonCommand.run(init)
	declare(jsonCommand)
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

	fun set(name: String, value: Any): Any {
		map[name] = value
		return value
	}

	fun set(name: String, init: Block.() -> Unit): Any {
		val result = Block(environment).apply(init).eval(environment)
		return set(name, result)
	}

	fun setIf(predicate: Boolean, name: String, init: Block.() -> Unit): Any? {
		if (predicate) {
			val result = Block(environment).apply(init).eval(environment)
			return set(name, result)
		}
		return null
	}

}
