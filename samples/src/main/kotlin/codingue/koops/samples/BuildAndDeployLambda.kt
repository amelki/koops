package codingue.koops.samples

import codingue.koops.aws.lambda
import codingue.koops.aws.updateFunctionCode
import codingue.koops.core.*
import com.amazonaws.services.lambda.model.UpdateFunctionCodeResult

fun main(args: Array<String>) {
	val environment = env {
		workingDir = "~/Code/playground/listserv"
	}
	pretty(environment) {
		json {
			val buildStatus = mvn(Clean, Install)
			set("maven", buildStatus)
			setIf(buildStatus.exitCode == 0, "lambda") {
				updateMyLambda("listserv",
											 "listserv1",
											 "lambda/target/lambda-1.0-SNAPSHOT.jar")
			}
		}
	}
}

fun Block.updateMyLambda(functionName: String, bucketName: String, jarPath: String): UpdateFunctionCodeResult {
	return run {
		aws s3 {
			putObject(bucketName, jarPath)
		}
		aws lambda {
			updateFunctionCode(functionName) {
				s3Bucket = bucketName
				s3Key = jarPath.substringAfterLast("/")
			}
		}
	}
}