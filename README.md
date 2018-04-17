# Kotlin Ops

## Purpose

Koops is Kotlin-based scripting language aimed at running command line tools commonly used in devops 
day-to-day work, such as maven, gradle, docker, git, AWS SDK, Google Cloud SDK etc.

It's an alternative to `python` or `bash` scripting, combining a simple way of calling commands with 
the power of the Kotlin language. 

## Getting Started

Here is an example of a `koops` script:

```kotlin
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
```

## Installation

Any koops snippet being a Kotlin snippet, you can run it in any regular Kotlin program, just like 
 [this one](samples/src/main/kotlin/com/codingue/koops/samples/Helloworld.kt).
 
But more interestingly, you can run `koops` as a simple Kotlin script, using [kscript](https://github.com/holgerbrandl/kscript).

The easiest is to install Kotlin, Kscript and Koops using [sdkman](http://sdkman.io/install.html):

```bash
curl -s "http://get.koops.codingue.com" | bash  # install sdkman, kotlin, maven, kscript and koops
```

You can then run any .kts script:

```bash
koops -s <script.kts>
```


## Status

This is a very first shot. More information to come soon

# License
The source files found in this project are licensed under the [Apache License 2.0](LICENSE).
