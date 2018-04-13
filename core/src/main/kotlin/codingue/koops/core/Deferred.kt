package codingue.koops.core

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
