package com.codingue.koops.samples

import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.codingue.koops.aws.ec2.*
import com.codingue.koops.aws.s3.*

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
