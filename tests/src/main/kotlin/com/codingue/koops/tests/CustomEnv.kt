package com.codingue.koops.tests

import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.codingue.koops.aws.s3.*
import com.codingue.koops.aws.lambda.*
import com.amazonaws.auth.PropertiesFileCredentialsProvider
import com.amazonaws.regions.Regions
import com.amazonaws.services.lambda.AWSLambdaClientBuilder
import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.AmazonS3ClientBuilder
import java.io.File

fun main(args: Array<String>) {
	val credentialsProvider = PropertiesFileCredentialsProvider("credentials.properties")
	val region = Regions.US_EAST_1
	val s3: AmazonS3 = AmazonS3ClientBuilder.standard()
			.withCredentials(credentialsProvider)
			.withRegion(region)
			.build()
	val lambda = AWSLambdaClientBuilder.standard()
			.withCredentials(credentialsProvider)
			.withRegion(region)
			.build()
	val environment = Environment()
	environment.s3 = s3
	environment.lambda = lambda

	environment.dryRun = true

	script(environment) {
		system cd "/mydir/mysubdir"
		aws s3 {
			putObject("mybucket", "the key", File("foo.jar"))
		}
		aws lambda {
			updateFunctionCode("myfunc") {
				s3Bucket = "mybucket"
				s3Key = "foo.jar"
			}
			println("Bon ben c'est cool")
			publishVersion("my func") {
				description = "this is version bla bla"
			}
		}
		val d = com.codingue.koops.core.deferred {
			system {
				cd("foo/bar from deferred")
			}
		}
		system {
			cd("/foo/bar")
			cd("/hello/world")
		}
		d.run(environment)
	}
}
