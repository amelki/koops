package codingue.koops.maven

import codingue.koops.common.applyIfNotNull
import codingue.koops.core.*
import org.apache.maven.shared.invoker.DefaultInvocationRequest
import org.apache.maven.shared.invoker.DefaultInvoker
import org.apache.maven.shared.invoker.PrintStreamLogger
import java.io.File

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

	enum class Goal {
		Clean, Install, Validate, Compile, Test, Package, Verify, Deploy
	}

	var pom = "pom.xml"
	var progressInPlace = true

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

	override fun title(): String? = "mvn ${goals.joinToString(" ") { it.name.toLowerCase() }}"

	override fun eval(environment: Environment): Result {
		val outputs = mutableListOf<String>()
		val errors = mutableListOf<String>()
		val request = DefaultInvocationRequest()
		request.pomFile = File(pom)
		request.goals = this.goals.map { it.name.toLowerCase() }
//		request.baseDirectory = environment.resolvedWorkingDir()
		request.isBatchMode = true
		request.setOutputHandler {
			if (progressInPlace) print("\r")
			print(it)
			outputs.add(it)
		}
		request.setErrorHandler {
			if (progressInPlace) print("\r")
			print(it)
			errors.add(it)
		}
		val invoker = DefaultInvoker()
		if (environment.mavenHome != null) {
			invoker.mavenHome = environment.resolvePath(environment.mavenHome!!)
		}
		invoker.logger = PrintStreamLogger(System.err, 1)
		invoker.workingDirectory = environment.resolvedWorkingDir()
		val result = invoker.execute(request)
		if (progressInPlace) print("\r")
		return Result(outputs, errors, result.exitCode, result.executionException)
	}

	override fun dryRun(): Result {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}
}

fun Block.mvn(goal1: Maven.Goal, vararg goals: Maven.Goal, init: (Maven.() -> Unit)? = null): Maven.Result {
	val all = listOf(goal1).plus(goals)
	return declare(Maven(all).applyIfNotNull(init, { init!! })) as Maven.Result
}

val Clean = Maven.Goal.Clean
val Install = Maven.Goal.Install
val Validate = Maven.Goal.Validate
val Compile = Maven.Goal.Compile
val Deploy = Maven.Goal.Deploy
val Test = Maven.Goal.Test
val Package = Maven.Goal.Package
val Verify = Maven.Goal.Verify
