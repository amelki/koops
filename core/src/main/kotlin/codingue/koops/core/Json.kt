package codingue.koops.core

infix fun <T> Block.json(init: Json.() -> T): T {
	val jsonCommand = Json(this.environment)
	val result = jsonCommand.run(init)
	declare(jsonCommand)
	return result
}


class Json(val environment: Environment): Command<Any> {
	val map = HashMap<String, Any>()
	override fun eval(environment: Environment): Any {
		return map
	}

	override fun dryRun(): Any {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	fun set(name: String, init: Block.() -> Unit): Any {
		map[name] = Block(environment).apply(init).eval(environment)
		return this
	}

}
