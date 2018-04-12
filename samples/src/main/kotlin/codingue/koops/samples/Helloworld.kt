package codingue.koops.samples

import codingue.koops.core.*
import codingue.koops.aws.*

fun main(args: Array<String>) {
	pretty {
		json {
			set("instances") {
				aws ec2 {
					describeInstances {
						maxResults = 10
					}
				}
			}
			set("buckets") {
				aws s3 {
					listBuckets()
				}
			}
		}
	}
}
