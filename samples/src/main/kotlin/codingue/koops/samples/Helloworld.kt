package codingue.koops.samples

import codingue.koops.core.*
import codingue.koops.aws.*
import codingue.koops.aws.s3.*
import codingue.koops.aws.ec2.*

fun main(args: Array<String>) {
	log {
		aws ec2 {
			describeInstances {
				maxResults = 10
			}
		}
		aws s3 {
			listBuckets()
		}
	}
}
