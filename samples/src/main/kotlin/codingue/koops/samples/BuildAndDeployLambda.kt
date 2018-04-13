package codingue.koops.samples

import codingue.koops.aws.lambda
import codingue.koops.aws.updateFunctionCode
import codingue.koops.core.*

fun main(args: Array<String>) {
	val environment = env {
		workingDir = "~/Code/playground/listserv"
	}
	block(environment) {
		mvn(Clean, Install)
		aws s3 {
			putObject("listserv1", "lambda/target/lambda-1.0-SNAPSHOT.jar")
		}
		aws lambda {
			updateFunctionCode("listserv") {
				s3Bucket = "listserv1"
				s3Key = "lambda-1.0-SNAPSHOT.jar"
			}
		}
		println("Lambda function deployed successfully")
	}
}
