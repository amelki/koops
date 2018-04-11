package codingue.koops.samples

import codingue.koops.core.*
import codingue.koops.core.aws.*
import com.amazonaws.auth.PropertiesFileCredentialsProvider
import com.amazonaws.regions.Regions
import com.amazonaws.services.lambda.AWSLambdaClientBuilder
import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.AmazonS3ClientBuilder
import java.io.File

fun main(args: Array<String>) {
	block {
		aws ec2 {
			describeInstances {
				maxResults = 10
			}
		}
	}
}
