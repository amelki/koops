package com.codingue.koops.core

@CliMarker
class Deferred(private val init: Script.() -> Unit): Command<Any> {
	override fun commandName() = "deferred"

	override fun description(): String? = null

	override fun eval(environment: Environment) {
		// Eval does nothing => must be explicitely run when needed
	}

	override fun dryRun() {
		// Does nothing
	}

	fun run(environment: Environment): Any = Script(environment).apply(init)

}
