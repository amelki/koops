package codingue.koops.samples

import codingue.koops.core.*
import codingue.koops.aws.*


fun main(args: Array<String>) {
	pretty {
		indentLevel = 4
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
