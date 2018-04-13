package codingue.koops.core

@DslMarker
annotation class CliMarker

@CliMarker
interface Command<out T: Any?> {
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
