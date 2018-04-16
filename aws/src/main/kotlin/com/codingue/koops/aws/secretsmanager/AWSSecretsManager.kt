
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.secretsmanager

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.secretsmanager.*

var com.codingue.koops.core.Environment.secretsmanager: AWSSecretsManager
	get() {
		var service = this.capabilities["aws-secretsmanager"]
		if (service == null) {
			service = AWSSecretsManagerClientBuilder.standard().build()
			this.capabilities["aws-secretsmanager"] = service
		}
		return service as AWSSecretsManager
	}
	set(secretsmanager) {
		this.capabilities["aws-secretsmanager"] = secretsmanager
	}

@Generated
class AWSSecretsManagerFunctions(val block: Script)

infix fun <T> AwsContinuation.secretsmanager(init: AWSSecretsManagerFunctions.() -> T): T {
	return AWSSecretsManagerFunctions(shell).run(init)
}

			

fun AWSSecretsManagerFunctions.cancelRotateSecret(secretId: String, init: (AWSSecretsManagerCancelRotateSecretCommand.() -> Unit)? = null): com.amazonaws.services.secretsmanager.model.CancelRotateSecretResult {
	return this.block.declare(AWSSecretsManagerCancelRotateSecretCommand(secretId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.secretsmanager.model.CancelRotateSecretResult
}

@Generated
class AWSSecretsManagerCancelRotateSecretCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.CancelRotateSecretRequest, com.amazonaws.services.secretsmanager.model.CancelRotateSecretResult> {



	override fun build(): com.amazonaws.services.secretsmanager.model.CancelRotateSecretRequest {
		val input = com.amazonaws.services.secretsmanager.model.CancelRotateSecretRequest()
		input.setSecretId(this.secretId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.secretsmanager.model.CancelRotateSecretResult {
	  return com.amazonaws.services.secretsmanager.model.CancelRotateSecretResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.secretsmanager.model.CancelRotateSecretResult {
		return environment.secretsmanager.cancelRotateSecret(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager cancel-rotate-secret")
				.argument("secret-id", secretId)
	}

}


fun AWSSecretsManagerFunctions.createSecret(name: String, init: (AWSSecretsManagerCreateSecretCommand.() -> Unit)? = null): com.amazonaws.services.secretsmanager.model.CreateSecretResult {
	return this.block.declare(AWSSecretsManagerCreateSecretCommand(name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.secretsmanager.model.CreateSecretResult
}

@Generated
class AWSSecretsManagerCreateSecretCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.CreateSecretRequest, com.amazonaws.services.secretsmanager.model.CreateSecretResult> {

	var clientRequestToken: String? = null
	var description: String? = null
	var kmsKeyId: String? = null
	var secretBinary: java.nio.ByteBuffer? = null
	var secretString: String? = null
	var tags: List<com.amazonaws.services.secretsmanager.model.Tag>? = null

	override fun build(): com.amazonaws.services.secretsmanager.model.CreateSecretRequest {
		val input = com.amazonaws.services.secretsmanager.model.CreateSecretRequest()
		input.setName(this.name)
		input.setClientRequestToken(this.clientRequestToken)
		input.setDescription(this.description)
		input.setKmsKeyId(this.kmsKeyId)
		input.setSecretBinary(this.secretBinary)
		input.setSecretString(this.secretString)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.secretsmanager.model.CreateSecretResult {
	  return com.amazonaws.services.secretsmanager.model.CreateSecretResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.secretsmanager.model.CreateSecretResult {
		return environment.secretsmanager.createSecret(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager create-secret")
				.argument("name", name)
				.argument("client-request-token", clientRequestToken)
				.argument("description", description)
				.argument("kms-key-id", kmsKeyId)
				.argument("secret-binary", secretBinary?.toString())
				.argument("secret-string", secretString)
				.argument("tags", tags?.toString())
	}

}


fun AWSSecretsManagerFunctions.deleteSecret(secretId: String, init: (AWSSecretsManagerDeleteSecretCommand.() -> Unit)? = null): com.amazonaws.services.secretsmanager.model.DeleteSecretResult {
	return this.block.declare(AWSSecretsManagerDeleteSecretCommand(secretId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.secretsmanager.model.DeleteSecretResult
}

@Generated
class AWSSecretsManagerDeleteSecretCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.DeleteSecretRequest, com.amazonaws.services.secretsmanager.model.DeleteSecretResult> {

	var recoveryWindowInDays: Long? = 0L

	override fun build(): com.amazonaws.services.secretsmanager.model.DeleteSecretRequest {
		val input = com.amazonaws.services.secretsmanager.model.DeleteSecretRequest()
		input.setSecretId(this.secretId)
		input.setRecoveryWindowInDays(this.recoveryWindowInDays)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.secretsmanager.model.DeleteSecretResult {
	  return com.amazonaws.services.secretsmanager.model.DeleteSecretResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.secretsmanager.model.DeleteSecretResult {
		return environment.secretsmanager.deleteSecret(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager delete-secret")
				.argument("secret-id", secretId)
				.argument("recovery-window-in-days", recoveryWindowInDays?.toString())
	}

}


fun AWSSecretsManagerFunctions.describeSecret(secretId: String, init: (AWSSecretsManagerDescribeSecretCommand.() -> Unit)? = null): com.amazonaws.services.secretsmanager.model.DescribeSecretResult {
	return this.block.declare(AWSSecretsManagerDescribeSecretCommand(secretId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.secretsmanager.model.DescribeSecretResult
}

@Generated
class AWSSecretsManagerDescribeSecretCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.DescribeSecretRequest, com.amazonaws.services.secretsmanager.model.DescribeSecretResult> {



	override fun build(): com.amazonaws.services.secretsmanager.model.DescribeSecretRequest {
		val input = com.amazonaws.services.secretsmanager.model.DescribeSecretRequest()
		input.setSecretId(this.secretId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.secretsmanager.model.DescribeSecretResult {
	  return com.amazonaws.services.secretsmanager.model.DescribeSecretResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.secretsmanager.model.DescribeSecretResult {
		return environment.secretsmanager.describeSecret(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager describe-secret")
				.argument("secret-id", secretId)
	}

}


fun AWSSecretsManagerFunctions.getRandomPassword(init: (AWSSecretsManagerGetRandomPasswordCommand.() -> Unit)? = null): com.amazonaws.services.secretsmanager.model.GetRandomPasswordResult {
	return this.block.declare(AWSSecretsManagerGetRandomPasswordCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.secretsmanager.model.GetRandomPasswordResult
}

@Generated
class AWSSecretsManagerGetRandomPasswordCommand() : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.GetRandomPasswordRequest, com.amazonaws.services.secretsmanager.model.GetRandomPasswordResult> {

	var passwordLength: Long? = 0L
	var excludeCharacters: String? = null
	var excludeNumbers: Boolean? = false
	var excludePunctuation: Boolean? = false
	var excludeUppercase: Boolean? = false
	var excludeLowercase: Boolean? = false
	var includeSpace: Boolean? = false
	var requireEachIncludedType: Boolean? = false

	override fun build(): com.amazonaws.services.secretsmanager.model.GetRandomPasswordRequest {
		val input = com.amazonaws.services.secretsmanager.model.GetRandomPasswordRequest()
		input.setPasswordLength(this.passwordLength)
		input.setExcludeCharacters(this.excludeCharacters)
		input.setExcludeNumbers(this.excludeNumbers)
		input.setExcludePunctuation(this.excludePunctuation)
		input.setExcludeUppercase(this.excludeUppercase)
		input.setExcludeLowercase(this.excludeLowercase)
		input.setIncludeSpace(this.includeSpace)
		input.setRequireEachIncludedType(this.requireEachIncludedType)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.secretsmanager.model.GetRandomPasswordResult {
	  return com.amazonaws.services.secretsmanager.model.GetRandomPasswordResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.secretsmanager.model.GetRandomPasswordResult {
		return environment.secretsmanager.getRandomPassword(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager get-random-password")
				.argument("password-length", passwordLength?.toString())
				.argument("exclude-characters", excludeCharacters)
				.option("exclude-numbers", excludeNumbers ?: false)
				.option("exclude-punctuation", excludePunctuation ?: false)
				.option("exclude-uppercase", excludeUppercase ?: false)
				.option("exclude-lowercase", excludeLowercase ?: false)
				.option("include-space", includeSpace ?: false)
				.option("require-each-included-type", requireEachIncludedType ?: false)
	}

}


fun AWSSecretsManagerFunctions.getSecretValue(secretId: String, init: (AWSSecretsManagerGetSecretValueCommand.() -> Unit)? = null): com.amazonaws.services.secretsmanager.model.GetSecretValueResult {
	return this.block.declare(AWSSecretsManagerGetSecretValueCommand(secretId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.secretsmanager.model.GetSecretValueResult
}

@Generated
class AWSSecretsManagerGetSecretValueCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.GetSecretValueRequest, com.amazonaws.services.secretsmanager.model.GetSecretValueResult> {

	var versionId: String? = null
	var versionStage: String? = null

	override fun build(): com.amazonaws.services.secretsmanager.model.GetSecretValueRequest {
		val input = com.amazonaws.services.secretsmanager.model.GetSecretValueRequest()
		input.setSecretId(this.secretId)
		input.setVersionId(this.versionId)
		input.setVersionStage(this.versionStage)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.secretsmanager.model.GetSecretValueResult {
	  return com.amazonaws.services.secretsmanager.model.GetSecretValueResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.secretsmanager.model.GetSecretValueResult {
		return environment.secretsmanager.getSecretValue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager get-secret-value")
				.argument("secret-id", secretId)
				.argument("version-id", versionId)
				.argument("version-stage", versionStage)
	}

}


fun AWSSecretsManagerFunctions.listSecretVersionIds(secretId: String, init: (AWSSecretsManagerListSecretVersionIdsCommand.() -> Unit)? = null): com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsResult {
	return this.block.declare(AWSSecretsManagerListSecretVersionIdsCommand(secretId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsResult
}

@Generated
class AWSSecretsManagerListSecretVersionIdsCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsRequest, com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null
	var includeDeprecated: Boolean? = false

	override fun build(): com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsRequest {
		val input = com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsRequest()
		input.setSecretId(this.secretId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setIncludeDeprecated(this.includeDeprecated)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsResult {
	  return com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsResult {
		return environment.secretsmanager.listSecretVersionIds(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager list-secret-version-ids")
				.argument("secret-id", secretId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.option("include-deprecated", includeDeprecated ?: false)
	}

}


fun AWSSecretsManagerFunctions.listSecrets(init: (AWSSecretsManagerListSecretsCommand.() -> Unit)? = null): com.amazonaws.services.secretsmanager.model.ListSecretsResult {
	return this.block.declare(AWSSecretsManagerListSecretsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.secretsmanager.model.ListSecretsResult
}

@Generated
class AWSSecretsManagerListSecretsCommand() : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.ListSecretsRequest, com.amazonaws.services.secretsmanager.model.ListSecretsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.secretsmanager.model.ListSecretsRequest {
		val input = com.amazonaws.services.secretsmanager.model.ListSecretsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.secretsmanager.model.ListSecretsResult {
	  return com.amazonaws.services.secretsmanager.model.ListSecretsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.secretsmanager.model.ListSecretsResult {
		return environment.secretsmanager.listSecrets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager list-secrets")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSecretsManagerFunctions.putSecretValue(secretId: String, init: (AWSSecretsManagerPutSecretValueCommand.() -> Unit)? = null): com.amazonaws.services.secretsmanager.model.PutSecretValueResult {
	return this.block.declare(AWSSecretsManagerPutSecretValueCommand(secretId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.secretsmanager.model.PutSecretValueResult
}

@Generated
class AWSSecretsManagerPutSecretValueCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.PutSecretValueRequest, com.amazonaws.services.secretsmanager.model.PutSecretValueResult> {

	var clientRequestToken: String? = null
	var secretBinary: java.nio.ByteBuffer? = null
	var secretString: String? = null
	var versionStages: List<String>? = null

	override fun build(): com.amazonaws.services.secretsmanager.model.PutSecretValueRequest {
		val input = com.amazonaws.services.secretsmanager.model.PutSecretValueRequest()
		input.setSecretId(this.secretId)
		input.setClientRequestToken(this.clientRequestToken)
		input.setSecretBinary(this.secretBinary)
		input.setSecretString(this.secretString)
		input.setVersionStages(this.versionStages)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.secretsmanager.model.PutSecretValueResult {
	  return com.amazonaws.services.secretsmanager.model.PutSecretValueResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.secretsmanager.model.PutSecretValueResult {
		return environment.secretsmanager.putSecretValue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager put-secret-value")
				.argument("secret-id", secretId)
				.argument("client-request-token", clientRequestToken)
				.argument("secret-binary", secretBinary?.toString())
				.argument("secret-string", secretString)
				.argument("version-stages", versionStages?.toString())
	}

}


fun AWSSecretsManagerFunctions.restoreSecret(secretId: String, init: (AWSSecretsManagerRestoreSecretCommand.() -> Unit)? = null): com.amazonaws.services.secretsmanager.model.RestoreSecretResult {
	return this.block.declare(AWSSecretsManagerRestoreSecretCommand(secretId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.secretsmanager.model.RestoreSecretResult
}

@Generated
class AWSSecretsManagerRestoreSecretCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.RestoreSecretRequest, com.amazonaws.services.secretsmanager.model.RestoreSecretResult> {



	override fun build(): com.amazonaws.services.secretsmanager.model.RestoreSecretRequest {
		val input = com.amazonaws.services.secretsmanager.model.RestoreSecretRequest()
		input.setSecretId(this.secretId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.secretsmanager.model.RestoreSecretResult {
	  return com.amazonaws.services.secretsmanager.model.RestoreSecretResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.secretsmanager.model.RestoreSecretResult {
		return environment.secretsmanager.restoreSecret(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager restore-secret")
				.argument("secret-id", secretId)
	}

}


fun AWSSecretsManagerFunctions.rotateSecret(secretId: String, init: (AWSSecretsManagerRotateSecretCommand.() -> Unit)? = null): com.amazonaws.services.secretsmanager.model.RotateSecretResult {
	return this.block.declare(AWSSecretsManagerRotateSecretCommand(secretId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.secretsmanager.model.RotateSecretResult
}

@Generated
class AWSSecretsManagerRotateSecretCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.RotateSecretRequest, com.amazonaws.services.secretsmanager.model.RotateSecretResult> {

	var clientRequestToken: String? = null
	var rotationLambdaARN: String? = null
	var rotationRules: com.amazonaws.services.secretsmanager.model.RotationRulesType? = null

	override fun build(): com.amazonaws.services.secretsmanager.model.RotateSecretRequest {
		val input = com.amazonaws.services.secretsmanager.model.RotateSecretRequest()
		input.setSecretId(this.secretId)
		input.setClientRequestToken(this.clientRequestToken)
		input.setRotationLambdaARN(this.rotationLambdaARN)
		input.setRotationRules(this.rotationRules)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.secretsmanager.model.RotateSecretResult {
	  return com.amazonaws.services.secretsmanager.model.RotateSecretResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.secretsmanager.model.RotateSecretResult {
		return environment.secretsmanager.rotateSecret(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager rotate-secret")
				.argument("secret-id", secretId)
				.argument("client-request-token", clientRequestToken)
				.argument("rotation-lambda-arn", rotationLambdaARN)
				.argument("rotation-rules", rotationRules?.toString())
	}

}


fun AWSSecretsManagerFunctions.tagResource(secretId: String, tags: List<com.amazonaws.services.secretsmanager.model.Tag>, init: (AWSSecretsManagerTagResourceCommand.() -> Unit)? = null): com.amazonaws.services.secretsmanager.model.TagResourceResult {
	return this.block.declare(AWSSecretsManagerTagResourceCommand(secretId, tags).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.secretsmanager.model.TagResourceResult
}

@Generated
class AWSSecretsManagerTagResourceCommand(val secretId: String, val tags: List<com.amazonaws.services.secretsmanager.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.TagResourceRequest, com.amazonaws.services.secretsmanager.model.TagResourceResult> {



	override fun build(): com.amazonaws.services.secretsmanager.model.TagResourceRequest {
		val input = com.amazonaws.services.secretsmanager.model.TagResourceRequest()
		input.setSecretId(this.secretId)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.secretsmanager.model.TagResourceResult {
	  return com.amazonaws.services.secretsmanager.model.TagResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.secretsmanager.model.TagResourceResult {
		return environment.secretsmanager.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager tag-resource")
				.argument("secret-id", secretId)
				.argument("tags", tags.toString())
	}

}


fun AWSSecretsManagerFunctions.untagResource(secretId: String, tagKeys: List<String>, init: (AWSSecretsManagerUntagResourceCommand.() -> Unit)? = null): com.amazonaws.services.secretsmanager.model.UntagResourceResult {
	return this.block.declare(AWSSecretsManagerUntagResourceCommand(secretId, tagKeys).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.secretsmanager.model.UntagResourceResult
}

@Generated
class AWSSecretsManagerUntagResourceCommand(val secretId: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.UntagResourceRequest, com.amazonaws.services.secretsmanager.model.UntagResourceResult> {



	override fun build(): com.amazonaws.services.secretsmanager.model.UntagResourceRequest {
		val input = com.amazonaws.services.secretsmanager.model.UntagResourceRequest()
		input.setSecretId(this.secretId)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.secretsmanager.model.UntagResourceResult {
	  return com.amazonaws.services.secretsmanager.model.UntagResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.secretsmanager.model.UntagResourceResult {
		return environment.secretsmanager.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager untag-resource")
				.argument("secret-id", secretId)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSSecretsManagerFunctions.updateSecret(secretId: String, init: (AWSSecretsManagerUpdateSecretCommand.() -> Unit)? = null): com.amazonaws.services.secretsmanager.model.UpdateSecretResult {
	return this.block.declare(AWSSecretsManagerUpdateSecretCommand(secretId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.secretsmanager.model.UpdateSecretResult
}

@Generated
class AWSSecretsManagerUpdateSecretCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.UpdateSecretRequest, com.amazonaws.services.secretsmanager.model.UpdateSecretResult> {

	var clientRequestToken: String? = null
	var description: String? = null
	var kmsKeyId: String? = null
	var secretBinary: java.nio.ByteBuffer? = null
	var secretString: String? = null

	override fun build(): com.amazonaws.services.secretsmanager.model.UpdateSecretRequest {
		val input = com.amazonaws.services.secretsmanager.model.UpdateSecretRequest()
		input.setSecretId(this.secretId)
		input.setClientRequestToken(this.clientRequestToken)
		input.setDescription(this.description)
		input.setKmsKeyId(this.kmsKeyId)
		input.setSecretBinary(this.secretBinary)
		input.setSecretString(this.secretString)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.secretsmanager.model.UpdateSecretResult {
	  return com.amazonaws.services.secretsmanager.model.UpdateSecretResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.secretsmanager.model.UpdateSecretResult {
		return environment.secretsmanager.updateSecret(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager update-secret")
				.argument("secret-id", secretId)
				.argument("client-request-token", clientRequestToken)
				.argument("description", description)
				.argument("kms-key-id", kmsKeyId)
				.argument("secret-binary", secretBinary?.toString())
				.argument("secret-string", secretString)
	}

}


fun AWSSecretsManagerFunctions.updateSecretVersionStage(secretId: String, versionStage: String, init: (AWSSecretsManagerUpdateSecretVersionStageCommand.() -> Unit)? = null): com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageResult {
	return this.block.declare(AWSSecretsManagerUpdateSecretVersionStageCommand(secretId, versionStage).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageResult
}

@Generated
class AWSSecretsManagerUpdateSecretVersionStageCommand(val secretId: String, val versionStage: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageRequest, com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageResult> {

	var removeFromVersionId: String? = null
	var moveToVersionId: String? = null

	override fun build(): com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageRequest {
		val input = com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageRequest()
		input.setSecretId(this.secretId)
		input.setVersionStage(this.versionStage)
		input.setRemoveFromVersionId(this.removeFromVersionId)
		input.setMoveToVersionId(this.moveToVersionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageResult {
	  return com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageResult {
		return environment.secretsmanager.updateSecretVersionStage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager update-secret-version-stage")
				.argument("secret-id", secretId)
				.argument("version-stage", versionStage)
				.argument("remove-from-version-id", removeFromVersionId)
				.argument("move-to-version-id", moveToVersionId)
	}

}
