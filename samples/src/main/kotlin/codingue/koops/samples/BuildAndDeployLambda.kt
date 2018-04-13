package codingue.koops.samples

import codingue.koops.aws.lambda
import codingue.koops.aws.updateFunctionCode
import codingue.koops.core.*
import com.amazonaws.services.lambda.model.UpdateFunctionCodeResult
import org.apache.maven.shared.invoker.InvocationResult

fun main(args: Array<String>) {
	val environment = env {
		workingDir = "~/Code/playground/listserv"
	}
	pretty(environment) {
		json {
			val buildStatus = set("maven") {
				mvn(Clean, Install)
			} as InvocationResult
			set("lambda") {
				when (buildStatus.exitCode) {
					0 -> updateMyLambda("listserv",
															"listserv1",
															"lambda/target/lambda-1.0-SNAPSHOT.jar")
					else -> "Error executing maven goals: ${buildStatus.executionException}"
				}
			}
		}
	}
}

fun Block.updateMyLambda(functionName: String, bucketName: String, jarPath: String): UpdateFunctionCodeResult {
	return run {
		aws s3 {
			putObject("listserv1", "lambda/target/lambda-1.0-SNAPSHOT.jar")
		}
		aws lambda {
			updateFunctionCode("listserv") {
				s3Bucket = "listserv1"
				s3Key = "lambda-1.0-SNAPSHOT.jar"
			}
		}
	}
}