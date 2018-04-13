package codingue.koops.core

import codingue.koops.common.applyIfNotNull
import org.apache.maven.shared.invoker.DefaultInvocationRequest
import org.apache.maven.shared.invoker.DefaultInvoker
import org.apache.maven.shared.invoker.InvocationResult
import java.io.File

@CliMarker
class Maven(private val goals: List<Maven.Goal>) : Command<InvocationResult> {

	enum class Goal {
		Clean, Install, Validate, Compile, Test, Package, Verify, Deploy
	}

	var pom = "pom.xml"

	override fun eval(environment: Environment): InvocationResult {
		val request = DefaultInvocationRequest()
		request.pomFile = File(pom)
		request.goals = this.goals.map { it.name.toLowerCase() }
		request.baseDirectory = environment.resolvedWorkingDir()
		val invoker = DefaultInvoker()
		return invoker.execute(request)
	}

	override fun dryRun(): InvocationResult {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}
}

fun Block.mvn(goal1: Maven.Goal, vararg goals: Maven.Goal, init: (Maven.() -> Unit)? = null): InvocationResult {
	val all = listOf(goal1).plus(goals)
	return declare(Maven(all).applyIfNotNull(init, { init!! })) as InvocationResult
}

val Clean = Maven.Goal.Clean
val Install = Maven.Goal.Install
val Validate = Maven.Goal.Validate
val Compile = Maven.Goal.Compile
val Deploy = Maven.Goal.Deploy
val Test = Maven.Goal.Test
val Package = Maven.Goal.Package
val Verify = Maven.Goal.Verify
