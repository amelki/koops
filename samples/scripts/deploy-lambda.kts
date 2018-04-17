#!/usr/bin/env kscript

import com.codingue.koops.core.*
import com.codingue.koops.maven.*
import com.codingue.koops.aws.*
import com.codingue.koops.aws.lambda.*
import com.codingue.koops.aws.s3.*

script {
	// Run mvn clean install command, making sure the build is successful
	mvn(Clean, Install) verifies Success
	// If the build is successful, upload to S3
	aws s3 {
		putObject("mybucket", "target/myproject.jar")
	}
	// And update our lambda with the uploaded content
	aws lambda {
		val updateFunctionCodeResult = updateFunctionCode("mylambda") {
			s3Bucket = "mybucket"
			s3Key = "myproject.jar"
		}
		publishVersion("mylambda", {
			codeSha256 = updateFunctionCodeResult.codeSha256
		})
	}
}

