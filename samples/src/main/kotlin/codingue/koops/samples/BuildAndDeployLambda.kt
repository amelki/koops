package codingue.koops.samples

import codingue.koops.core.*
import codingue.koops.maven.*
import codingue.koops.aws.*
import codingue.koops.aws.lambda.*
import codingue.koops.aws.s3.*

fun main(args: Array<String>) {
	val environment = env {
		workingDir = "~/Code/playground/listserv"
	}
	// Prints a JSON array made of a the descriptor and the result of each command executed inside this block
	log(environment) {
		// Run mvn clean install command, making sure the build is successful
		mvn(Clean, Install) verifies Success
		// If the build is successful, upload to S3
		aws s3 {
			putObject("listserv1", "lambda/target/lambda-1.0-SNAPSHOT.jar")
		}
		// And update our lambda with the uploaded content
		aws lambda {
			updateFunctionCode("listserv") {
				s3Bucket = "listserv1"
				s3Key = "lambda-1.0-SNAPSHOT.jar"
			}
			publishVersion("listserv")
		}
	}
}
