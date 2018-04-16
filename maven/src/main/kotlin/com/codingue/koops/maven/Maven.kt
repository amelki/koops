package com.codingue.koops.maven

import com.codingue.koops.common.applyIfNotNull
import com.codingue.koops.core.*
import org.apache.maven.shared.invoker.DefaultInvocationRequest
import org.apache.maven.shared.invoker.DefaultInvoker
import org.apache.maven.shared.invoker.InvokerLogger
import java.io.File
import java.io.PrintWriter
import java.io.StringWriter

private const val MAVEN_HOME_ATTRIBUTE: String = "mavenHome"

var Environment.mavenHome: String?
	get() {
		return this.capabilities[MAVEN_HOME_ATTRIBUTE] as String?
	}
	set(mavenHome) {
		if (mavenHome == null) {
			this.capabilities.remove(MAVEN_HOME_ATTRIBUTE)
		} else {
			this.capabilities[MAVEN_HOME_ATTRIBUTE] = mavenHome
		}
	}

val Success = Maven.Status.Success
val Failed = Maven.Status.Failed

@CliMarker
class Maven(private val goals: List<Goal>) : Command<Maven.Result> {
	override fun commandName() = "maven"

	enum class Goal {
		Clean, Install, Validate, Compile, Test, Package, Verify, Deploy
	}

	var pom = "pom.xml"

	enum class Status {
		Success,
		Failed
	}

	inner class Result(val out: List<String>, val err: List<String>, val exitCode: Int, val exception: Exception?): Verifiable<Result> {
		override infix fun verifies(f: Result.() -> Boolean) {
			if (!f()) {
				throw VerificationException(this@Maven, "Wrong expected result")
			}
		}
		infix fun verifies(status: Status) {
			verifies({ exitCode == status.ordinal })
		}
	}

	override fun description(): String? = "mvn ${goals.joinToString(" ") { it.name.toLowerCase() }}"

	override fun eval(environment: Environment): Result {
		val outputs = mutableListOf<String>()
		val errors = mutableListOf<String>()
		val request = DefaultInvocationRequest()
		request.pomFile = File(pom)
		request.goals = this.goals.map { it.name.toLowerCase() }
//		request.baseDirectory = environment.resolvedWorkingDir()
		request.isBatchMode = true
		request.setOutputHandler {
			display(environment, it)
			outputs.add(it)
		}
		request.setErrorHandler {
			display(environment, it)
			errors.add(it)
		}
		val invoker = DefaultInvoker()
		if (environment.mavenHome != null) {
			invoker.mavenHome = environment.resolvePath(environment.mavenHome!!)
		}
		invoker.logger = MyInvokerLogger(environment, 3)
//		invoker.logger = PrintStreamLogger(System.err, 1)
		invoker.workingDirectory = environment.resolvedWorkingDir()
		val result = invoker.execute(request)
		if (environment.progress) print("\r")
		return Result(outputs, errors, result.exitCode, result.executionException)
	}

	override fun dryRun(): Result {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	private inner class MyInvokerLogger(val environment: Environment, var th: Int): InvokerLogger {

		private fun log(level: Int, message: String?, error: Throwable?) {
			if (level <= th) {
				if (message != null || error != null) {
					val buffer = StringBuffer()
					when (level) {
						0 -> buffer.append("[FATAL]")
						1 -> buffer.append("[ERROR]")
						2 -> buffer.append("[WARN]")
						3 -> buffer.append("[INFO]")
						4 -> buffer.append("[DEBUG]")
					}

					buffer.append(' ')
					if (message != null) {
						buffer.append(message)
					}

					if (error != null) {
						val writer = StringWriter()
						val pWriter = PrintWriter(writer)
						error.printStackTrace(pWriter)
						if (message != null) {
							buffer.append('\n')
						}

						buffer.append("Error:\n")
						buffer.append(writer.toString())
					}
					this@Maven.display(environment, buffer.toString())
				}
			}
		}

		override fun debug(message: String) {
			this.log(4, message, null as Throwable?)
		}

		override fun debug(message: String, throwable: Throwable) {
			this.log(4, message, throwable)
		}

		override fun info(message: String) {
			this.log(3, message, null as Throwable?)
		}

		override fun info(message: String, throwable: Throwable) {
			this.log(3, message, throwable)
		}

		override fun warn(message: String) {
			this.log(2, message, null as Throwable?)
		}

		override fun warn(message: String, throwable: Throwable) {
			this.log(2, message, throwable)
		}

		override fun error(message: String) {
			this.log(1, message, null as Throwable?)
		}

		override fun error(message: String, throwable: Throwable) {
			this.log(1, message, throwable)
		}

		override fun fatalError(message: String) {
			this.log(0, message, null as Throwable?)
		}

		override fun fatalError(message: String, throwable: Throwable) {
			this.log(0, message, throwable)
		}

		override fun isDebugEnabled(): Boolean {
			return th >= 4
		}

		override fun isErrorEnabled(): Boolean {
			return th >= 1
		}

		override fun isFatalErrorEnabled(): Boolean {
			return th >= 0
		}

		override fun isInfoEnabled(): Boolean {
			return th >= 3
		}

		override fun isWarnEnabled(): Boolean {
			return th >= 2
		}

		override fun getThreshold(): Int {
			return th
		}

		override fun setThreshold(threshold: Int) {
			this.th = threshold
		}

	}

}

fun Block.mvn(goal1: Maven.Goal, vararg goals: Maven.Goal, init: (Maven.() -> Unit)? = null): Maven.Result {
	val all = listOf(goal1).plus(goals)
	return declare(Maven(all).applyIfNotNull(init, { init!!() })) as Maven.Result
}

val Clean = Maven.Goal.Clean
val Install = Maven.Goal.Install
val Validate = Maven.Goal.Validate
val Compile = Maven.Goal.Compile
val Deploy = Maven.Goal.Deploy
val Test = Maven.Goal.Test
val Package = Maven.Goal.Package
val Verify = Maven.Goal.Verify
