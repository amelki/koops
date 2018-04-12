package codingue.koops.samples

import codingue.koops.core.*
import codingue.koops.aws.*


fun main(args: Array<String>) {
	pretty {
		aws ec2 {
			describeInstances {
				maxResults = 10
			}
		}
	}
}
