package codingue.koops.core

@DslMarker
annotation class CliMarker

@CliMarker
interface Command<out T : Any?> {
	fun eval(environment: Environment): T
	fun dryRun(): T
	fun title(): String?

	fun doEval(environment: Environment): T {
		val title = title()
		if (title != null && environment.progress) print("[koops] $title")
		return try {
			eval(environment)
		} catch (e: Exception) {
			when (e) {
				is CommandException -> throw e
				else -> throw CommandException(this, e.message, e)
			}
		}.also {
			if (title != null && environment.progress) print("\r")
		}
	}

}
