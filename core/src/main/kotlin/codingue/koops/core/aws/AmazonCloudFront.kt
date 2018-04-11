
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.cloudfront.AmazonCloudFront
import com.amazonaws.services.cloudfront.model.*

var codingue.koops.core.Environment.cloudfront: AmazonCloudFront
	get() = this.capabilities[AmazonCloudFront::class.java.name] as AmazonCloudFront
	set(cloudfront) {
		this.capabilities[AmazonCloudFront::class.java.name] = cloudfront
	}

@Generated
class AmazonCloudFrontFunctions(val block: Block)

infix fun <T> AwsContinuation.cloudfront(init: AmazonCloudFrontFunctions.() -> T): T {
	return AmazonCloudFrontFunctions(shell).run(init)
}

			

fun AmazonCloudFrontFunctions.createCloudFrontOriginAccessIdentity(cloudFrontOriginAccessIdentityConfig: com.amazonaws.services.cloudfront.model.CloudFrontOriginAccessIdentityConfig, init: AmazonCloudFrontCreateCloudFrontOriginAccessIdentityCommand.() -> Unit): com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityResult {
	return this.block.declare(AmazonCloudFrontCreateCloudFrontOriginAccessIdentityCommand(cloudFrontOriginAccessIdentityConfig).apply(init)) as com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityResult
}

@Generated
class AmazonCloudFrontCreateCloudFrontOriginAccessIdentityCommand(val cloudFrontOriginAccessIdentityConfig: com.amazonaws.services.cloudfront.model.CloudFrontOriginAccessIdentityConfig) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest, com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest {
		val input = com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest()
		input.setCloudFrontOriginAccessIdentityConfig(this.cloudFrontOriginAccessIdentityConfig)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityResult {
	  return com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityResult {
		return environment.cloudfront.createCloudFrontOriginAccessIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-cloud-front-origin-access-identity")
				.argument("cloud-front-origin-access-identity-config", cloudFrontOriginAccessIdentityConfig.toString())
	}

}


fun AmazonCloudFrontFunctions.createDistribution(distributionConfig: com.amazonaws.services.cloudfront.model.DistributionConfig, init: AmazonCloudFrontCreateDistributionCommand.() -> Unit): com.amazonaws.services.cloudfront.model.CreateDistributionResult {
	return this.block.declare(AmazonCloudFrontCreateDistributionCommand(distributionConfig).apply(init)) as com.amazonaws.services.cloudfront.model.CreateDistributionResult
}

@Generated
class AmazonCloudFrontCreateDistributionCommand(val distributionConfig: com.amazonaws.services.cloudfront.model.DistributionConfig) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreateDistributionRequest, com.amazonaws.services.cloudfront.model.CreateDistributionResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreateDistributionRequest {
		val input = com.amazonaws.services.cloudfront.model.CreateDistributionRequest()
		input.setDistributionConfig(this.distributionConfig)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.CreateDistributionResult {
	  return com.amazonaws.services.cloudfront.model.CreateDistributionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.CreateDistributionResult {
		return environment.cloudfront.createDistribution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-distribution")
				.argument("distribution-config", distributionConfig.toString())
	}

}


fun AmazonCloudFrontFunctions.createDistributionWithTags(distributionConfigWithTags: com.amazonaws.services.cloudfront.model.DistributionConfigWithTags, init: AmazonCloudFrontCreateDistributionWithTagsCommand.() -> Unit): com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsResult {
	return this.block.declare(AmazonCloudFrontCreateDistributionWithTagsCommand(distributionConfigWithTags).apply(init)) as com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsResult
}

@Generated
class AmazonCloudFrontCreateDistributionWithTagsCommand(val distributionConfigWithTags: com.amazonaws.services.cloudfront.model.DistributionConfigWithTags) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest, com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest {
		val input = com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest()
		input.setDistributionConfigWithTags(this.distributionConfigWithTags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsResult {
	  return com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsResult {
		return environment.cloudfront.createDistributionWithTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-distribution-with-tags")
				.argument("distribution-config-with-tags", distributionConfigWithTags.toString())
	}

}


fun AmazonCloudFrontFunctions.createFieldLevelEncryptionConfig(fieldLevelEncryptionConfig: com.amazonaws.services.cloudfront.model.FieldLevelEncryptionConfig, init: AmazonCloudFrontCreateFieldLevelEncryptionConfigCommand.() -> Unit): com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigResult {
	return this.block.declare(AmazonCloudFrontCreateFieldLevelEncryptionConfigCommand(fieldLevelEncryptionConfig).apply(init)) as com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigResult
}

@Generated
class AmazonCloudFrontCreateFieldLevelEncryptionConfigCommand(val fieldLevelEncryptionConfig: com.amazonaws.services.cloudfront.model.FieldLevelEncryptionConfig) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest, com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest()
		input.setFieldLevelEncryptionConfig(this.fieldLevelEncryptionConfig)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigResult {
	  return com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigResult {
		return environment.cloudfront.createFieldLevelEncryptionConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-field-level-encryption-config")
				.argument("field-level-encryption-config", fieldLevelEncryptionConfig.toString())
	}

}


fun AmazonCloudFrontFunctions.createFieldLevelEncryptionProfile(fieldLevelEncryptionProfileConfig: com.amazonaws.services.cloudfront.model.FieldLevelEncryptionProfileConfig, init: AmazonCloudFrontCreateFieldLevelEncryptionProfileCommand.() -> Unit): com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileResult {
	return this.block.declare(AmazonCloudFrontCreateFieldLevelEncryptionProfileCommand(fieldLevelEncryptionProfileConfig).apply(init)) as com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileResult
}

@Generated
class AmazonCloudFrontCreateFieldLevelEncryptionProfileCommand(val fieldLevelEncryptionProfileConfig: com.amazonaws.services.cloudfront.model.FieldLevelEncryptionProfileConfig) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest, com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest {
		val input = com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest()
		input.setFieldLevelEncryptionProfileConfig(this.fieldLevelEncryptionProfileConfig)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileResult {
	  return com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileResult {
		return environment.cloudfront.createFieldLevelEncryptionProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-field-level-encryption-profile")
				.argument("field-level-encryption-profile-config", fieldLevelEncryptionProfileConfig.toString())
	}

}


fun AmazonCloudFrontFunctions.createInvalidation(distributionId: String, invalidationBatch: com.amazonaws.services.cloudfront.model.InvalidationBatch, init: AmazonCloudFrontCreateInvalidationCommand.() -> Unit): com.amazonaws.services.cloudfront.model.CreateInvalidationResult {
	return this.block.declare(AmazonCloudFrontCreateInvalidationCommand(distributionId, invalidationBatch).apply(init)) as com.amazonaws.services.cloudfront.model.CreateInvalidationResult
}

@Generated
class AmazonCloudFrontCreateInvalidationCommand(val distributionId: String, val invalidationBatch: com.amazonaws.services.cloudfront.model.InvalidationBatch) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreateInvalidationRequest, com.amazonaws.services.cloudfront.model.CreateInvalidationResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreateInvalidationRequest {
		val input = com.amazonaws.services.cloudfront.model.CreateInvalidationRequest()
		input.setDistributionId(this.distributionId)
		input.setInvalidationBatch(this.invalidationBatch)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.CreateInvalidationResult {
	  return com.amazonaws.services.cloudfront.model.CreateInvalidationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.CreateInvalidationResult {
		return environment.cloudfront.createInvalidation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-invalidation")
				.argument("distribution-id", distributionId)
				.argument("invalidation-batch", invalidationBatch.toString())
	}

}


fun AmazonCloudFrontFunctions.createPublicKey(publicKeyConfig: com.amazonaws.services.cloudfront.model.PublicKeyConfig, init: AmazonCloudFrontCreatePublicKeyCommand.() -> Unit): com.amazonaws.services.cloudfront.model.CreatePublicKeyResult {
	return this.block.declare(AmazonCloudFrontCreatePublicKeyCommand(publicKeyConfig).apply(init)) as com.amazonaws.services.cloudfront.model.CreatePublicKeyResult
}

@Generated
class AmazonCloudFrontCreatePublicKeyCommand(val publicKeyConfig: com.amazonaws.services.cloudfront.model.PublicKeyConfig) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest, com.amazonaws.services.cloudfront.model.CreatePublicKeyResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest {
		val input = com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest()
		input.setPublicKeyConfig(this.publicKeyConfig)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.CreatePublicKeyResult {
	  return com.amazonaws.services.cloudfront.model.CreatePublicKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.CreatePublicKeyResult {
		return environment.cloudfront.createPublicKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-public-key")
				.argument("public-key-config", publicKeyConfig.toString())
	}

}


fun AmazonCloudFrontFunctions.createStreamingDistribution(streamingDistributionConfig: com.amazonaws.services.cloudfront.model.StreamingDistributionConfig, init: AmazonCloudFrontCreateStreamingDistributionCommand.() -> Unit): com.amazonaws.services.cloudfront.model.CreateStreamingDistributionResult {
	return this.block.declare(AmazonCloudFrontCreateStreamingDistributionCommand(streamingDistributionConfig).apply(init)) as com.amazonaws.services.cloudfront.model.CreateStreamingDistributionResult
}

@Generated
class AmazonCloudFrontCreateStreamingDistributionCommand(val streamingDistributionConfig: com.amazonaws.services.cloudfront.model.StreamingDistributionConfig) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest, com.amazonaws.services.cloudfront.model.CreateStreamingDistributionResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest {
		val input = com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest()
		input.setStreamingDistributionConfig(this.streamingDistributionConfig)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.CreateStreamingDistributionResult {
	  return com.amazonaws.services.cloudfront.model.CreateStreamingDistributionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.CreateStreamingDistributionResult {
		return environment.cloudfront.createStreamingDistribution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-streaming-distribution")
				.argument("streaming-distribution-config", streamingDistributionConfig.toString())
	}

}


fun AmazonCloudFrontFunctions.createStreamingDistributionWithTags(streamingDistributionConfigWithTags: com.amazonaws.services.cloudfront.model.StreamingDistributionConfigWithTags, init: AmazonCloudFrontCreateStreamingDistributionWithTagsCommand.() -> Unit): com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsResult {
	return this.block.declare(AmazonCloudFrontCreateStreamingDistributionWithTagsCommand(streamingDistributionConfigWithTags).apply(init)) as com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsResult
}

@Generated
class AmazonCloudFrontCreateStreamingDistributionWithTagsCommand(val streamingDistributionConfigWithTags: com.amazonaws.services.cloudfront.model.StreamingDistributionConfigWithTags) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest, com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest {
		val input = com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest()
		input.setStreamingDistributionConfigWithTags(this.streamingDistributionConfigWithTags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsResult {
	  return com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsResult {
		return environment.cloudfront.createStreamingDistributionWithTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-streaming-distribution-with-tags")
				.argument("streaming-distribution-config-with-tags", streamingDistributionConfigWithTags.toString())
	}

}


fun AmazonCloudFrontFunctions.deleteCloudFrontOriginAccessIdentity(id: String, init: AmazonCloudFrontDeleteCloudFrontOriginAccessIdentityCommand.() -> Unit): com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityResult {
	return this.block.declare(AmazonCloudFrontDeleteCloudFrontOriginAccessIdentityCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityResult
}

@Generated
class AmazonCloudFrontDeleteCloudFrontOriginAccessIdentityCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest, com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityResult> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest {
		val input = com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest()
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityResult {
	  return com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityResult {
		return environment.cloudfront.deleteCloudFrontOriginAccessIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront delete-cloud-front-origin-access-identity")
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.deleteDistribution(id: String, init: AmazonCloudFrontDeleteDistributionCommand.() -> Unit): com.amazonaws.services.cloudfront.model.DeleteDistributionResult {
	return this.block.declare(AmazonCloudFrontDeleteDistributionCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.DeleteDistributionResult
}

@Generated
class AmazonCloudFrontDeleteDistributionCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.DeleteDistributionRequest, com.amazonaws.services.cloudfront.model.DeleteDistributionResult> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.DeleteDistributionRequest {
		val input = com.amazonaws.services.cloudfront.model.DeleteDistributionRequest()
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.DeleteDistributionResult {
	  return com.amazonaws.services.cloudfront.model.DeleteDistributionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.DeleteDistributionResult {
		return environment.cloudfront.deleteDistribution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront delete-distribution")
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.deleteFieldLevelEncryptionConfig(id: String, init: AmazonCloudFrontDeleteFieldLevelEncryptionConfigCommand.() -> Unit): com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigResult {
	return this.block.declare(AmazonCloudFrontDeleteFieldLevelEncryptionConfigCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigResult
}

@Generated
class AmazonCloudFrontDeleteFieldLevelEncryptionConfigCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest, com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigResult> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest()
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigResult {
	  return com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigResult {
		return environment.cloudfront.deleteFieldLevelEncryptionConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront delete-field-level-encryption-config")
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.deleteFieldLevelEncryptionProfile(id: String, init: AmazonCloudFrontDeleteFieldLevelEncryptionProfileCommand.() -> Unit): com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileResult {
	return this.block.declare(AmazonCloudFrontDeleteFieldLevelEncryptionProfileCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileResult
}

@Generated
class AmazonCloudFrontDeleteFieldLevelEncryptionProfileCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest, com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileResult> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest {
		val input = com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest()
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileResult {
	  return com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileResult {
		return environment.cloudfront.deleteFieldLevelEncryptionProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront delete-field-level-encryption-profile")
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.deletePublicKey(id: String, init: AmazonCloudFrontDeletePublicKeyCommand.() -> Unit): com.amazonaws.services.cloudfront.model.DeletePublicKeyResult {
	return this.block.declare(AmazonCloudFrontDeletePublicKeyCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.DeletePublicKeyResult
}

@Generated
class AmazonCloudFrontDeletePublicKeyCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest, com.amazonaws.services.cloudfront.model.DeletePublicKeyResult> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest {
		val input = com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest()
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.DeletePublicKeyResult {
	  return com.amazonaws.services.cloudfront.model.DeletePublicKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.DeletePublicKeyResult {
		return environment.cloudfront.deletePublicKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront delete-public-key")
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.deleteServiceLinkedRole(roleName: String, init: AmazonCloudFrontDeleteServiceLinkedRoleCommand.() -> Unit): com.amazonaws.services.cloudfront.model.DeleteServiceLinkedRoleResult {
	return this.block.declare(AmazonCloudFrontDeleteServiceLinkedRoleCommand(roleName).apply(init)) as com.amazonaws.services.cloudfront.model.DeleteServiceLinkedRoleResult
}

@Generated
class AmazonCloudFrontDeleteServiceLinkedRoleCommand(val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.DeleteServiceLinkedRoleRequest, com.amazonaws.services.cloudfront.model.DeleteServiceLinkedRoleResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.DeleteServiceLinkedRoleRequest {
		val input = com.amazonaws.services.cloudfront.model.DeleteServiceLinkedRoleRequest()
		input.setRoleName(this.roleName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.DeleteServiceLinkedRoleResult {
	  return com.amazonaws.services.cloudfront.model.DeleteServiceLinkedRoleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.DeleteServiceLinkedRoleResult {
		return environment.cloudfront.deleteServiceLinkedRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront delete-service-linked-role")
				.argument("role-name", roleName)
	}

}


fun AmazonCloudFrontFunctions.deleteStreamingDistribution(id: String, init: AmazonCloudFrontDeleteStreamingDistributionCommand.() -> Unit): com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionResult {
	return this.block.declare(AmazonCloudFrontDeleteStreamingDistributionCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionResult
}

@Generated
class AmazonCloudFrontDeleteStreamingDistributionCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest, com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionResult> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest {
		val input = com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest()
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionResult {
	  return com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionResult {
		return environment.cloudfront.deleteStreamingDistribution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront delete-streaming-distribution")
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.getCloudFrontOriginAccessIdentity(id: String, init: AmazonCloudFrontGetCloudFrontOriginAccessIdentityCommand.() -> Unit): com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityResult {
	return this.block.declare(AmazonCloudFrontGetCloudFrontOriginAccessIdentityCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityResult
}

@Generated
class AmazonCloudFrontGetCloudFrontOriginAccessIdentityCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest, com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest {
		val input = com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityResult {
	  return com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityResult {
		return environment.cloudfront.getCloudFrontOriginAccessIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-cloud-front-origin-access-identity")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getCloudFrontOriginAccessIdentityConfig(id: String, init: AmazonCloudFrontGetCloudFrontOriginAccessIdentityConfigCommand.() -> Unit): com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigResult {
	return this.block.declare(AmazonCloudFrontGetCloudFrontOriginAccessIdentityConfigCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigResult
}

@Generated
class AmazonCloudFrontGetCloudFrontOriginAccessIdentityConfigCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest, com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigResult {
	  return com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigResult {
		return environment.cloudfront.getCloudFrontOriginAccessIdentityConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-cloud-front-origin-access-identity-config")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getDistribution(id: String, init: AmazonCloudFrontGetDistributionCommand.() -> Unit): com.amazonaws.services.cloudfront.model.GetDistributionResult {
	return this.block.declare(AmazonCloudFrontGetDistributionCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.GetDistributionResult
}

@Generated
class AmazonCloudFrontGetDistributionCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetDistributionRequest, com.amazonaws.services.cloudfront.model.GetDistributionResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetDistributionRequest {
		val input = com.amazonaws.services.cloudfront.model.GetDistributionRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.GetDistributionResult {
	  return com.amazonaws.services.cloudfront.model.GetDistributionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.GetDistributionResult {
		return environment.cloudfront.getDistribution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-distribution")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getDistributionConfig(id: String, init: AmazonCloudFrontGetDistributionConfigCommand.() -> Unit): com.amazonaws.services.cloudfront.model.GetDistributionConfigResult {
	return this.block.declare(AmazonCloudFrontGetDistributionConfigCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.GetDistributionConfigResult
}

@Generated
class AmazonCloudFrontGetDistributionConfigCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest, com.amazonaws.services.cloudfront.model.GetDistributionConfigResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.GetDistributionConfigResult {
	  return com.amazonaws.services.cloudfront.model.GetDistributionConfigResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.GetDistributionConfigResult {
		return environment.cloudfront.getDistributionConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-distribution-config")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getFieldLevelEncryption(id: String, init: AmazonCloudFrontGetFieldLevelEncryptionCommand.() -> Unit): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionResult {
	return this.block.declare(AmazonCloudFrontGetFieldLevelEncryptionCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionResult
}

@Generated
class AmazonCloudFrontGetFieldLevelEncryptionCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest, com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest {
		val input = com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionResult {
	  return com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionResult {
		return environment.cloudfront.getFieldLevelEncryption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-field-level-encryption")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getFieldLevelEncryptionConfig(id: String, init: AmazonCloudFrontGetFieldLevelEncryptionConfigCommand.() -> Unit): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigResult {
	return this.block.declare(AmazonCloudFrontGetFieldLevelEncryptionConfigCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigResult
}

@Generated
class AmazonCloudFrontGetFieldLevelEncryptionConfigCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest, com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigResult {
	  return com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigResult {
		return environment.cloudfront.getFieldLevelEncryptionConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-field-level-encryption-config")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getFieldLevelEncryptionProfile(id: String, init: AmazonCloudFrontGetFieldLevelEncryptionProfileCommand.() -> Unit): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileResult {
	return this.block.declare(AmazonCloudFrontGetFieldLevelEncryptionProfileCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileResult
}

@Generated
class AmazonCloudFrontGetFieldLevelEncryptionProfileCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest, com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest {
		val input = com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileResult {
	  return com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileResult {
		return environment.cloudfront.getFieldLevelEncryptionProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-field-level-encryption-profile")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getFieldLevelEncryptionProfileConfig(id: String, init: AmazonCloudFrontGetFieldLevelEncryptionProfileConfigCommand.() -> Unit): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigResult {
	return this.block.declare(AmazonCloudFrontGetFieldLevelEncryptionProfileConfigCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigResult
}

@Generated
class AmazonCloudFrontGetFieldLevelEncryptionProfileConfigCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest, com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigResult {
	  return com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigResult {
		return environment.cloudfront.getFieldLevelEncryptionProfileConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-field-level-encryption-profile-config")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getInvalidation(distributionId: String, id: String, init: AmazonCloudFrontGetInvalidationCommand.() -> Unit): com.amazonaws.services.cloudfront.model.GetInvalidationResult {
	return this.block.declare(AmazonCloudFrontGetInvalidationCommand(distributionId, id).apply(init)) as com.amazonaws.services.cloudfront.model.GetInvalidationResult
}

@Generated
class AmazonCloudFrontGetInvalidationCommand(val distributionId: String, val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetInvalidationRequest, com.amazonaws.services.cloudfront.model.GetInvalidationResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetInvalidationRequest {
		val input = com.amazonaws.services.cloudfront.model.GetInvalidationRequest()
		input.setDistributionId(this.distributionId)
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.GetInvalidationResult {
	  return com.amazonaws.services.cloudfront.model.GetInvalidationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.GetInvalidationResult {
		return environment.cloudfront.getInvalidation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-invalidation")
				.argument("distribution-id", distributionId)
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getPublicKey(id: String, init: AmazonCloudFrontGetPublicKeyCommand.() -> Unit): com.amazonaws.services.cloudfront.model.GetPublicKeyResult {
	return this.block.declare(AmazonCloudFrontGetPublicKeyCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.GetPublicKeyResult
}

@Generated
class AmazonCloudFrontGetPublicKeyCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetPublicKeyRequest, com.amazonaws.services.cloudfront.model.GetPublicKeyResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetPublicKeyRequest {
		val input = com.amazonaws.services.cloudfront.model.GetPublicKeyRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.GetPublicKeyResult {
	  return com.amazonaws.services.cloudfront.model.GetPublicKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.GetPublicKeyResult {
		return environment.cloudfront.getPublicKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-public-key")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getPublicKeyConfig(id: String, init: AmazonCloudFrontGetPublicKeyConfigCommand.() -> Unit): com.amazonaws.services.cloudfront.model.GetPublicKeyConfigResult {
	return this.block.declare(AmazonCloudFrontGetPublicKeyConfigCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.GetPublicKeyConfigResult
}

@Generated
class AmazonCloudFrontGetPublicKeyConfigCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest, com.amazonaws.services.cloudfront.model.GetPublicKeyConfigResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.GetPublicKeyConfigResult {
	  return com.amazonaws.services.cloudfront.model.GetPublicKeyConfigResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.GetPublicKeyConfigResult {
		return environment.cloudfront.getPublicKeyConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-public-key-config")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getStreamingDistribution(id: String, init: AmazonCloudFrontGetStreamingDistributionCommand.() -> Unit): com.amazonaws.services.cloudfront.model.GetStreamingDistributionResult {
	return this.block.declare(AmazonCloudFrontGetStreamingDistributionCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.GetStreamingDistributionResult
}

@Generated
class AmazonCloudFrontGetStreamingDistributionCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest, com.amazonaws.services.cloudfront.model.GetStreamingDistributionResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest {
		val input = com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.GetStreamingDistributionResult {
	  return com.amazonaws.services.cloudfront.model.GetStreamingDistributionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.GetStreamingDistributionResult {
		return environment.cloudfront.getStreamingDistribution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-streaming-distribution")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getStreamingDistributionConfig(id: String, init: AmazonCloudFrontGetStreamingDistributionConfigCommand.() -> Unit): com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigResult {
	return this.block.declare(AmazonCloudFrontGetStreamingDistributionConfigCommand(id).apply(init)) as com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigResult
}

@Generated
class AmazonCloudFrontGetStreamingDistributionConfigCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest, com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigResult {
	  return com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigResult {
		return environment.cloudfront.getStreamingDistributionConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-streaming-distribution-config")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.listCloudFrontOriginAccessIdentities(init: AmazonCloudFrontListCloudFrontOriginAccessIdentitiesCommand.() -> Unit): com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesResult {
	return this.block.declare(AmazonCloudFrontListCloudFrontOriginAccessIdentitiesCommand().apply(init)) as com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesResult
}

@Generated
class AmazonCloudFrontListCloudFrontOriginAccessIdentitiesCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest, com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesResult> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest {
		val input = com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesResult {
	  return com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesResult {
		return environment.cloudfront.listCloudFrontOriginAccessIdentities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-cloud-front-origin-access-identities")
				.argument("marker", marker)
				.argument("max-items", maxItems)
	}

}


fun AmazonCloudFrontFunctions.listDistributions(init: AmazonCloudFrontListDistributionsCommand.() -> Unit): com.amazonaws.services.cloudfront.model.ListDistributionsResult {
	return this.block.declare(AmazonCloudFrontListDistributionsCommand().apply(init)) as com.amazonaws.services.cloudfront.model.ListDistributionsResult
}

@Generated
class AmazonCloudFrontListDistributionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListDistributionsRequest, com.amazonaws.services.cloudfront.model.ListDistributionsResult> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.ListDistributionsRequest {
		val input = com.amazonaws.services.cloudfront.model.ListDistributionsRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.ListDistributionsResult {
	  return com.amazonaws.services.cloudfront.model.ListDistributionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.ListDistributionsResult {
		return environment.cloudfront.listDistributions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-distributions")
				.argument("marker", marker)
				.argument("max-items", maxItems)
	}

}


fun AmazonCloudFrontFunctions.listDistributionsByWebACLId(webACLId: String, init: AmazonCloudFrontListDistributionsByWebACLIdCommand.() -> Unit): com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdResult {
	return this.block.declare(AmazonCloudFrontListDistributionsByWebACLIdCommand(webACLId).apply(init)) as com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdResult
}

@Generated
class AmazonCloudFrontListDistributionsByWebACLIdCommand(val webACLId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest, com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdResult> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest {
		val input = com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		input.setWebACLId(this.webACLId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdResult {
	  return com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdResult {
		return environment.cloudfront.listDistributionsByWebACLId(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-distributions-by-web-aclid")
				.argument("marker", marker)
				.argument("max-items", maxItems)
				.argument("web-aclid", webACLId)
	}

}


fun AmazonCloudFrontFunctions.listFieldLevelEncryptionConfigs(init: AmazonCloudFrontListFieldLevelEncryptionConfigsCommand.() -> Unit): com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsResult {
	return this.block.declare(AmazonCloudFrontListFieldLevelEncryptionConfigsCommand().apply(init)) as com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsResult
}

@Generated
class AmazonCloudFrontListFieldLevelEncryptionConfigsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest, com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsResult> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest {
		val input = com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsResult {
	  return com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsResult {
		return environment.cloudfront.listFieldLevelEncryptionConfigs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-field-level-encryption-configs")
				.argument("marker", marker)
				.argument("max-items", maxItems)
	}

}


fun AmazonCloudFrontFunctions.listFieldLevelEncryptionProfiles(init: AmazonCloudFrontListFieldLevelEncryptionProfilesCommand.() -> Unit): com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesResult {
	return this.block.declare(AmazonCloudFrontListFieldLevelEncryptionProfilesCommand().apply(init)) as com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesResult
}

@Generated
class AmazonCloudFrontListFieldLevelEncryptionProfilesCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest, com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesResult> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest {
		val input = com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesResult {
	  return com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesResult {
		return environment.cloudfront.listFieldLevelEncryptionProfiles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-field-level-encryption-profiles")
				.argument("marker", marker)
				.argument("max-items", maxItems)
	}

}


fun AmazonCloudFrontFunctions.listInvalidations(distributionId: String, init: AmazonCloudFrontListInvalidationsCommand.() -> Unit): com.amazonaws.services.cloudfront.model.ListInvalidationsResult {
	return this.block.declare(AmazonCloudFrontListInvalidationsCommand(distributionId).apply(init)) as com.amazonaws.services.cloudfront.model.ListInvalidationsResult
}

@Generated
class AmazonCloudFrontListInvalidationsCommand(val distributionId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListInvalidationsRequest, com.amazonaws.services.cloudfront.model.ListInvalidationsResult> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.ListInvalidationsRequest {
		val input = com.amazonaws.services.cloudfront.model.ListInvalidationsRequest()
		input.setDistributionId(this.distributionId)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.ListInvalidationsResult {
	  return com.amazonaws.services.cloudfront.model.ListInvalidationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.ListInvalidationsResult {
		return environment.cloudfront.listInvalidations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-invalidations")
				.argument("distribution-id", distributionId)
				.argument("marker", marker)
				.argument("max-items", maxItems)
	}

}


fun AmazonCloudFrontFunctions.listPublicKeys(init: AmazonCloudFrontListPublicKeysCommand.() -> Unit): com.amazonaws.services.cloudfront.model.ListPublicKeysResult {
	return this.block.declare(AmazonCloudFrontListPublicKeysCommand().apply(init)) as com.amazonaws.services.cloudfront.model.ListPublicKeysResult
}

@Generated
class AmazonCloudFrontListPublicKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListPublicKeysRequest, com.amazonaws.services.cloudfront.model.ListPublicKeysResult> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.ListPublicKeysRequest {
		val input = com.amazonaws.services.cloudfront.model.ListPublicKeysRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.ListPublicKeysResult {
	  return com.amazonaws.services.cloudfront.model.ListPublicKeysResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.ListPublicKeysResult {
		return environment.cloudfront.listPublicKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-public-keys")
				.argument("marker", marker)
				.argument("max-items", maxItems)
	}

}


fun AmazonCloudFrontFunctions.listStreamingDistributions(init: AmazonCloudFrontListStreamingDistributionsCommand.() -> Unit): com.amazonaws.services.cloudfront.model.ListStreamingDistributionsResult {
	return this.block.declare(AmazonCloudFrontListStreamingDistributionsCommand().apply(init)) as com.amazonaws.services.cloudfront.model.ListStreamingDistributionsResult
}

@Generated
class AmazonCloudFrontListStreamingDistributionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest, com.amazonaws.services.cloudfront.model.ListStreamingDistributionsResult> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest {
		val input = com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.ListStreamingDistributionsResult {
	  return com.amazonaws.services.cloudfront.model.ListStreamingDistributionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.ListStreamingDistributionsResult {
		return environment.cloudfront.listStreamingDistributions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-streaming-distributions")
				.argument("marker", marker)
				.argument("max-items", maxItems)
	}

}


fun AmazonCloudFrontFunctions.listTagsForResource(resource: String, init: AmazonCloudFrontListTagsForResourceCommand.() -> Unit): com.amazonaws.services.cloudfront.model.ListTagsForResourceResult {
	return this.block.declare(AmazonCloudFrontListTagsForResourceCommand(resource).apply(init)) as com.amazonaws.services.cloudfront.model.ListTagsForResourceResult
}

@Generated
class AmazonCloudFrontListTagsForResourceCommand(val resource: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest, com.amazonaws.services.cloudfront.model.ListTagsForResourceResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest()
		input.setResource(this.resource)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.ListTagsForResourceResult {
	  return com.amazonaws.services.cloudfront.model.ListTagsForResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.ListTagsForResourceResult {
		return environment.cloudfront.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-tags-for-resource")
				.argument("resource", resource)
	}

}


fun AmazonCloudFrontFunctions.tagResource(resource: String, tags: com.amazonaws.services.cloudfront.model.Tags, init: AmazonCloudFrontTagResourceCommand.() -> Unit): com.amazonaws.services.cloudfront.model.TagResourceResult {
	return this.block.declare(AmazonCloudFrontTagResourceCommand(resource, tags).apply(init)) as com.amazonaws.services.cloudfront.model.TagResourceResult
}

@Generated
class AmazonCloudFrontTagResourceCommand(val resource: String, val tags: com.amazonaws.services.cloudfront.model.Tags) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.TagResourceRequest, com.amazonaws.services.cloudfront.model.TagResourceResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.TagResourceRequest {
		val input = com.amazonaws.services.cloudfront.model.TagResourceRequest()
		input.setResource(this.resource)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.TagResourceResult {
	  return com.amazonaws.services.cloudfront.model.TagResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.TagResourceResult {
		return environment.cloudfront.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront tag-resource")
				.argument("resource", resource)
				.argument("tags", tags.toString())
	}

}


fun AmazonCloudFrontFunctions.untagResource(resource: String, tagKeys: com.amazonaws.services.cloudfront.model.TagKeys, init: AmazonCloudFrontUntagResourceCommand.() -> Unit): com.amazonaws.services.cloudfront.model.UntagResourceResult {
	return this.block.declare(AmazonCloudFrontUntagResourceCommand(resource, tagKeys).apply(init)) as com.amazonaws.services.cloudfront.model.UntagResourceResult
}

@Generated
class AmazonCloudFrontUntagResourceCommand(val resource: String, val tagKeys: com.amazonaws.services.cloudfront.model.TagKeys) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.UntagResourceRequest, com.amazonaws.services.cloudfront.model.UntagResourceResult> {



	override fun build(): com.amazonaws.services.cloudfront.model.UntagResourceRequest {
		val input = com.amazonaws.services.cloudfront.model.UntagResourceRequest()
		input.setResource(this.resource)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.UntagResourceResult {
	  return com.amazonaws.services.cloudfront.model.UntagResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.UntagResourceResult {
		return environment.cloudfront.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront untag-resource")
				.argument("resource", resource)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonCloudFrontFunctions.updateCloudFrontOriginAccessIdentity(cloudFrontOriginAccessIdentityConfig: com.amazonaws.services.cloudfront.model.CloudFrontOriginAccessIdentityConfig, id: String, init: AmazonCloudFrontUpdateCloudFrontOriginAccessIdentityCommand.() -> Unit): com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityResult {
	return this.block.declare(AmazonCloudFrontUpdateCloudFrontOriginAccessIdentityCommand(cloudFrontOriginAccessIdentityConfig, id).apply(init)) as com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityResult
}

@Generated
class AmazonCloudFrontUpdateCloudFrontOriginAccessIdentityCommand(val cloudFrontOriginAccessIdentityConfig: com.amazonaws.services.cloudfront.model.CloudFrontOriginAccessIdentityConfig, val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest, com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityResult> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest {
		val input = com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest()
		input.setCloudFrontOriginAccessIdentityConfig(this.cloudFrontOriginAccessIdentityConfig)
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityResult {
	  return com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityResult {
		return environment.cloudfront.updateCloudFrontOriginAccessIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront update-cloud-front-origin-access-identity")
				.argument("cloud-front-origin-access-identity-config", cloudFrontOriginAccessIdentityConfig.toString())
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.updateDistribution(distributionConfig: com.amazonaws.services.cloudfront.model.DistributionConfig, id: String, init: AmazonCloudFrontUpdateDistributionCommand.() -> Unit): com.amazonaws.services.cloudfront.model.UpdateDistributionResult {
	return this.block.declare(AmazonCloudFrontUpdateDistributionCommand(distributionConfig, id).apply(init)) as com.amazonaws.services.cloudfront.model.UpdateDistributionResult
}

@Generated
class AmazonCloudFrontUpdateDistributionCommand(val distributionConfig: com.amazonaws.services.cloudfront.model.DistributionConfig, val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.UpdateDistributionRequest, com.amazonaws.services.cloudfront.model.UpdateDistributionResult> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.UpdateDistributionRequest {
		val input = com.amazonaws.services.cloudfront.model.UpdateDistributionRequest()
		input.setDistributionConfig(this.distributionConfig)
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.UpdateDistributionResult {
	  return com.amazonaws.services.cloudfront.model.UpdateDistributionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.UpdateDistributionResult {
		return environment.cloudfront.updateDistribution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront update-distribution")
				.argument("distribution-config", distributionConfig.toString())
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.updateFieldLevelEncryptionConfig(fieldLevelEncryptionConfig: com.amazonaws.services.cloudfront.model.FieldLevelEncryptionConfig, id: String, init: AmazonCloudFrontUpdateFieldLevelEncryptionConfigCommand.() -> Unit): com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigResult {
	return this.block.declare(AmazonCloudFrontUpdateFieldLevelEncryptionConfigCommand(fieldLevelEncryptionConfig, id).apply(init)) as com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigResult
}

@Generated
class AmazonCloudFrontUpdateFieldLevelEncryptionConfigCommand(val fieldLevelEncryptionConfig: com.amazonaws.services.cloudfront.model.FieldLevelEncryptionConfig, val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest, com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigResult> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest()
		input.setFieldLevelEncryptionConfig(this.fieldLevelEncryptionConfig)
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigResult {
	  return com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigResult {
		return environment.cloudfront.updateFieldLevelEncryptionConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront update-field-level-encryption-config")
				.argument("field-level-encryption-config", fieldLevelEncryptionConfig.toString())
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.updateFieldLevelEncryptionProfile(fieldLevelEncryptionProfileConfig: com.amazonaws.services.cloudfront.model.FieldLevelEncryptionProfileConfig, id: String, init: AmazonCloudFrontUpdateFieldLevelEncryptionProfileCommand.() -> Unit): com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileResult {
	return this.block.declare(AmazonCloudFrontUpdateFieldLevelEncryptionProfileCommand(fieldLevelEncryptionProfileConfig, id).apply(init)) as com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileResult
}

@Generated
class AmazonCloudFrontUpdateFieldLevelEncryptionProfileCommand(val fieldLevelEncryptionProfileConfig: com.amazonaws.services.cloudfront.model.FieldLevelEncryptionProfileConfig, val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest, com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileResult> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest {
		val input = com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest()
		input.setFieldLevelEncryptionProfileConfig(this.fieldLevelEncryptionProfileConfig)
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileResult {
	  return com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileResult {
		return environment.cloudfront.updateFieldLevelEncryptionProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront update-field-level-encryption-profile")
				.argument("field-level-encryption-profile-config", fieldLevelEncryptionProfileConfig.toString())
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.updatePublicKey(publicKeyConfig: com.amazonaws.services.cloudfront.model.PublicKeyConfig, id: String, init: AmazonCloudFrontUpdatePublicKeyCommand.() -> Unit): com.amazonaws.services.cloudfront.model.UpdatePublicKeyResult {
	return this.block.declare(AmazonCloudFrontUpdatePublicKeyCommand(publicKeyConfig, id).apply(init)) as com.amazonaws.services.cloudfront.model.UpdatePublicKeyResult
}

@Generated
class AmazonCloudFrontUpdatePublicKeyCommand(val publicKeyConfig: com.amazonaws.services.cloudfront.model.PublicKeyConfig, val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest, com.amazonaws.services.cloudfront.model.UpdatePublicKeyResult> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest {
		val input = com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest()
		input.setPublicKeyConfig(this.publicKeyConfig)
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.UpdatePublicKeyResult {
	  return com.amazonaws.services.cloudfront.model.UpdatePublicKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.UpdatePublicKeyResult {
		return environment.cloudfront.updatePublicKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront update-public-key")
				.argument("public-key-config", publicKeyConfig.toString())
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.updateStreamingDistribution(streamingDistributionConfig: com.amazonaws.services.cloudfront.model.StreamingDistributionConfig, id: String, init: AmazonCloudFrontUpdateStreamingDistributionCommand.() -> Unit): com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionResult {
	return this.block.declare(AmazonCloudFrontUpdateStreamingDistributionCommand(streamingDistributionConfig, id).apply(init)) as com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionResult
}

@Generated
class AmazonCloudFrontUpdateStreamingDistributionCommand(val streamingDistributionConfig: com.amazonaws.services.cloudfront.model.StreamingDistributionConfig, val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest, com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionResult> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest {
		val input = com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest()
		input.setStreamingDistributionConfig(this.streamingDistributionConfig)
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionResult {
	  return com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionResult {
		return environment.cloudfront.updateStreamingDistribution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront update-streaming-distribution")
				.argument("streaming-distribution-config", streamingDistributionConfig.toString())
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}
