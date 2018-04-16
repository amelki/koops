package com.codingue.koops.samples

import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.codingue.koops.aws.s3.*
import com.codingue.koops.aws.lambda.*
import com.codingue.koops.maven.*

fun main(args: Array<String>) {
	val environment = com.codingue.koops.core.env {
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
			val updateFunctionCodeResult = updateFunctionCode("listserv") {
				s3Bucket = "listserv1"
				s3Key = "lambda-1.0-SNAPSHOT.jar"
			}
			publishVersion("listserv", {
				codeSha256 = updateFunctionCodeResult.codeSha256
			})
		}
	}
}
