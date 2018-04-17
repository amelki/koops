#!/usr/bin/env kscript

import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.codingue.koops.aws.ec2.*
import com.codingue.koops.aws.s3.*

script {
	aws ec2 {
		describeInstances {
			maxResults = 10
		}
	}
	aws s3 {
		listBuckets()
	}
}
