package codingue.koops.samples

import codingue.koops.aws.lambda
import codingue.koops.aws.updateFunctionCode
import codingue.koops.core.*

fun main(args: Array<String>) {
	val environment = env {
		workingDir = "~/Code/playground/listserv"
	}
	// JSON pretty print each result of each command declared inside this block
	pretty(environment) {
		// Capture all command results in a JSON Array
		log {
			// mvn clean install
			val buildStatus = mvn(Clean, Install)
			if (buildStatus.exitCode == 0) {
				// If the build is successful, upload to S3 and update Lambda
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
	}
}
