#!/usr/bin/env kscript

import com.amazonaws.auth.PropertiesFileCredentialsProvider
import com.amazonaws.regions.Regions
import com.amazonaws.services.lambda.AWSLambdaClientBuilder
import com.amazonaws.services.s3.AmazonS3ClientBuilder
import com.codingue.koops.aws.aws
import com.codingue.koops.aws.lambda.*
import com.codingue.koops.aws.s3.*
import com.codingue.koops.core.*
import java.io.File

val environment = env {
	val credentialsProvider = PropertiesFileCredentialsProvider("credentials.properties")
	val region = Regions.US_EAST_1
	s3 = AmazonS3ClientBuilder.standard()
			.withCredentials(credentialsProvider)
			.withRegion(region)
			.build()
	lambda = AWSLambdaClientBuilder.standard()
			.withCredentials(credentialsProvider)
			.withRegion(region)
			.build()
}

script(environment) {
	aws s3 {
		putObject("mybucket", "the key", File("foo.jar"))
	}
	aws lambda {
		updateFunctionCode("myfunc") {
			s3Bucket = "mybucket"
			s3Key = "foo.jar"
		}
		publishVersion("my func") {
			description = "this is version bla bla"
		}
	}
}
