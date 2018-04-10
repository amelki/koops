
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.secretsmanager.AWSSecretsManager
import com.amazonaws.services.secretsmanager.model.*

var codingue.koops.core.Environment.secretsmanager: AWSSecretsManager
	get() = this.capabilities[AWSSecretsManager::class.java.name] as AWSSecretsManager
	set(secretsmanager) {
		this.capabilities[AWSSecretsManager::class.java.name] = secretsmanager
	}

@Generated
class AWSSecretsManagerFunctions(val block: Block)

infix fun AwsContinuation.secretsmanager(init: AWSSecretsManagerFunctions.() -> Unit) {
	AWSSecretsManagerFunctions(shell).apply(init)
}

			

fun AWSSecretsManagerFunctions.cancelRotateSecret(secretId: String, init: AWSSecretsManagerCancelRotateSecretCommand.() -> Unit) {
	this.block.declare(AWSSecretsManagerCancelRotateSecretCommand(secretId).apply(init))
}

@Generated
class AWSSecretsManagerCancelRotateSecretCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.CancelRotateSecretRequest> {



	override fun build(): com.amazonaws.services.secretsmanager.model.CancelRotateSecretRequest {
		val input = com.amazonaws.services.secretsmanager.model.CancelRotateSecretRequest()
		input.setSecretId(this.secretId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.secretsmanager.cancelRotateSecret(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager cancel-rotate-secret")
				.argument("secret-id", secretId)
	}

}


fun AWSSecretsManagerFunctions.createSecret(name: String, init: AWSSecretsManagerCreateSecretCommand.() -> Unit) {
	this.block.declare(AWSSecretsManagerCreateSecretCommand(name).apply(init))
}

@Generated
class AWSSecretsManagerCreateSecretCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.CreateSecretRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.secretsmanager.createSecret(build())
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


fun AWSSecretsManagerFunctions.deleteSecret(secretId: String, init: AWSSecretsManagerDeleteSecretCommand.() -> Unit) {
	this.block.declare(AWSSecretsManagerDeleteSecretCommand(secretId).apply(init))
}

@Generated
class AWSSecretsManagerDeleteSecretCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.DeleteSecretRequest> {

	var recoveryWindowInDays: Long? = 0L

	override fun build(): com.amazonaws.services.secretsmanager.model.DeleteSecretRequest {
		val input = com.amazonaws.services.secretsmanager.model.DeleteSecretRequest()
		input.setSecretId(this.secretId)
		input.setRecoveryWindowInDays(this.recoveryWindowInDays)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.secretsmanager.deleteSecret(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager delete-secret")
				.argument("secret-id", secretId)
				.argument("recovery-window-in-days", recoveryWindowInDays?.toString())
	}

}


fun AWSSecretsManagerFunctions.describeSecret(secretId: String, init: AWSSecretsManagerDescribeSecretCommand.() -> Unit) {
	this.block.declare(AWSSecretsManagerDescribeSecretCommand(secretId).apply(init))
}

@Generated
class AWSSecretsManagerDescribeSecretCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.DescribeSecretRequest> {



	override fun build(): com.amazonaws.services.secretsmanager.model.DescribeSecretRequest {
		val input = com.amazonaws.services.secretsmanager.model.DescribeSecretRequest()
		input.setSecretId(this.secretId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.secretsmanager.describeSecret(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager describe-secret")
				.argument("secret-id", secretId)
	}

}


fun AWSSecretsManagerFunctions.getRandomPassword(init: AWSSecretsManagerGetRandomPasswordCommand.() -> Unit) {
	this.block.declare(AWSSecretsManagerGetRandomPasswordCommand().apply(init))
}

@Generated
class AWSSecretsManagerGetRandomPasswordCommand() : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.GetRandomPasswordRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.secretsmanager.getRandomPassword(build())
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


fun AWSSecretsManagerFunctions.getSecretValue(secretId: String, init: AWSSecretsManagerGetSecretValueCommand.() -> Unit) {
	this.block.declare(AWSSecretsManagerGetSecretValueCommand(secretId).apply(init))
}

@Generated
class AWSSecretsManagerGetSecretValueCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.GetSecretValueRequest> {

	var versionId: String? = null
	var versionStage: String? = null

	override fun build(): com.amazonaws.services.secretsmanager.model.GetSecretValueRequest {
		val input = com.amazonaws.services.secretsmanager.model.GetSecretValueRequest()
		input.setSecretId(this.secretId)
		input.setVersionId(this.versionId)
		input.setVersionStage(this.versionStage)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.secretsmanager.getSecretValue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager get-secret-value")
				.argument("secret-id", secretId)
				.argument("version-id", versionId)
				.argument("version-stage", versionStage)
	}

}


fun AWSSecretsManagerFunctions.listSecretVersionIds(secretId: String, init: AWSSecretsManagerListSecretVersionIdsCommand.() -> Unit) {
	this.block.declare(AWSSecretsManagerListSecretVersionIdsCommand(secretId).apply(init))
}

@Generated
class AWSSecretsManagerListSecretVersionIdsCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.ListSecretVersionIdsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.secretsmanager.listSecretVersionIds(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager list-secret-version-ids")
				.argument("secret-id", secretId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.option("include-deprecated", includeDeprecated ?: false)
	}

}


fun AWSSecretsManagerFunctions.listSecrets(init: AWSSecretsManagerListSecretsCommand.() -> Unit) {
	this.block.declare(AWSSecretsManagerListSecretsCommand().apply(init))
}

@Generated
class AWSSecretsManagerListSecretsCommand() : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.ListSecretsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.secretsmanager.model.ListSecretsRequest {
		val input = com.amazonaws.services.secretsmanager.model.ListSecretsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.secretsmanager.listSecrets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager list-secrets")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSSecretsManagerFunctions.putSecretValue(secretId: String, init: AWSSecretsManagerPutSecretValueCommand.() -> Unit) {
	this.block.declare(AWSSecretsManagerPutSecretValueCommand(secretId).apply(init))
}

@Generated
class AWSSecretsManagerPutSecretValueCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.PutSecretValueRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.secretsmanager.putSecretValue(build())
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


fun AWSSecretsManagerFunctions.restoreSecret(secretId: String, init: AWSSecretsManagerRestoreSecretCommand.() -> Unit) {
	this.block.declare(AWSSecretsManagerRestoreSecretCommand(secretId).apply(init))
}

@Generated
class AWSSecretsManagerRestoreSecretCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.RestoreSecretRequest> {



	override fun build(): com.amazonaws.services.secretsmanager.model.RestoreSecretRequest {
		val input = com.amazonaws.services.secretsmanager.model.RestoreSecretRequest()
		input.setSecretId(this.secretId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.secretsmanager.restoreSecret(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager restore-secret")
				.argument("secret-id", secretId)
	}

}


fun AWSSecretsManagerFunctions.rotateSecret(secretId: String, init: AWSSecretsManagerRotateSecretCommand.() -> Unit) {
	this.block.declare(AWSSecretsManagerRotateSecretCommand(secretId).apply(init))
}

@Generated
class AWSSecretsManagerRotateSecretCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.RotateSecretRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.secretsmanager.rotateSecret(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager rotate-secret")
				.argument("secret-id", secretId)
				.argument("client-request-token", clientRequestToken)
				.argument("rotation-lambda-arn", rotationLambdaARN)
				.argument("rotation-rules", rotationRules?.toString())
	}

}


fun AWSSecretsManagerFunctions.tagResource(secretId: String, tags: List<com.amazonaws.services.secretsmanager.model.Tag>, init: AWSSecretsManagerTagResourceCommand.() -> Unit) {
	this.block.declare(AWSSecretsManagerTagResourceCommand(secretId, tags).apply(init))
}

@Generated
class AWSSecretsManagerTagResourceCommand(val secretId: String, val tags: List<com.amazonaws.services.secretsmanager.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.TagResourceRequest> {



	override fun build(): com.amazonaws.services.secretsmanager.model.TagResourceRequest {
		val input = com.amazonaws.services.secretsmanager.model.TagResourceRequest()
		input.setSecretId(this.secretId)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.secretsmanager.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager tag-resource")
				.argument("secret-id", secretId)
				.argument("tags", tags.toString())
	}

}


fun AWSSecretsManagerFunctions.untagResource(secretId: String, tagKeys: List<String>, init: AWSSecretsManagerUntagResourceCommand.() -> Unit) {
	this.block.declare(AWSSecretsManagerUntagResourceCommand(secretId, tagKeys).apply(init))
}

@Generated
class AWSSecretsManagerUntagResourceCommand(val secretId: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.UntagResourceRequest> {



	override fun build(): com.amazonaws.services.secretsmanager.model.UntagResourceRequest {
		val input = com.amazonaws.services.secretsmanager.model.UntagResourceRequest()
		input.setSecretId(this.secretId)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.secretsmanager.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager untag-resource")
				.argument("secret-id", secretId)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSSecretsManagerFunctions.updateSecret(secretId: String, init: AWSSecretsManagerUpdateSecretCommand.() -> Unit) {
	this.block.declare(AWSSecretsManagerUpdateSecretCommand(secretId).apply(init))
}

@Generated
class AWSSecretsManagerUpdateSecretCommand(val secretId: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.UpdateSecretRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.secretsmanager.updateSecret(build())
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


fun AWSSecretsManagerFunctions.updateSecretVersionStage(secretId: String, versionStage: String, init: AWSSecretsManagerUpdateSecretVersionStageCommand.() -> Unit) {
	this.block.declare(AWSSecretsManagerUpdateSecretVersionStageCommand(secretId, versionStage).apply(init))
}

@Generated
class AWSSecretsManagerUpdateSecretVersionStageCommand(val secretId: String, val versionStage: String) : AmazonWebServiceCommand<com.amazonaws.services.secretsmanager.model.UpdateSecretVersionStageRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.secretsmanager.updateSecretVersionStage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws secretsmanager update-secret-version-stage")
				.argument("secret-id", secretId)
				.argument("version-stage", versionStage)
				.argument("remove-from-version-id", removeFromVersionId)
				.argument("move-to-version-id", moveToVersionId)
	}

}
