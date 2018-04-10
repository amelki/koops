
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
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

infix fun AwsContinuation.cloudfront(init: AmazonCloudFrontFunctions.() -> Unit) {
	AmazonCloudFrontFunctions(shell).apply(init)
}

			

fun AmazonCloudFrontFunctions.createCloudFrontOriginAccessIdentity(cloudFrontOriginAccessIdentityConfig: com.amazonaws.services.cloudfront.model.CloudFrontOriginAccessIdentityConfig, init: AmazonCloudFrontCreateCloudFrontOriginAccessIdentityCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontCreateCloudFrontOriginAccessIdentityCommand(cloudFrontOriginAccessIdentityConfig).apply(init))
}

@Generated
class AmazonCloudFrontCreateCloudFrontOriginAccessIdentityCommand(val cloudFrontOriginAccessIdentityConfig: com.amazonaws.services.cloudfront.model.CloudFrontOriginAccessIdentityConfig) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest {
		val input = com.amazonaws.services.cloudfront.model.CreateCloudFrontOriginAccessIdentityRequest()
		input.setCloudFrontOriginAccessIdentityConfig(this.cloudFrontOriginAccessIdentityConfig)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.createCloudFrontOriginAccessIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-cloud-front-origin-access-identity")
				.argument("cloud-front-origin-access-identity-config", cloudFrontOriginAccessIdentityConfig.toString())
	}

}


fun AmazonCloudFrontFunctions.createDistribution(distributionConfig: com.amazonaws.services.cloudfront.model.DistributionConfig, init: AmazonCloudFrontCreateDistributionCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontCreateDistributionCommand(distributionConfig).apply(init))
}

@Generated
class AmazonCloudFrontCreateDistributionCommand(val distributionConfig: com.amazonaws.services.cloudfront.model.DistributionConfig) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreateDistributionRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreateDistributionRequest {
		val input = com.amazonaws.services.cloudfront.model.CreateDistributionRequest()
		input.setDistributionConfig(this.distributionConfig)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.createDistribution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-distribution")
				.argument("distribution-config", distributionConfig.toString())
	}

}


fun AmazonCloudFrontFunctions.createDistributionWithTags(distributionConfigWithTags: com.amazonaws.services.cloudfront.model.DistributionConfigWithTags, init: AmazonCloudFrontCreateDistributionWithTagsCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontCreateDistributionWithTagsCommand(distributionConfigWithTags).apply(init))
}

@Generated
class AmazonCloudFrontCreateDistributionWithTagsCommand(val distributionConfigWithTags: com.amazonaws.services.cloudfront.model.DistributionConfigWithTags) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest {
		val input = com.amazonaws.services.cloudfront.model.CreateDistributionWithTagsRequest()
		input.setDistributionConfigWithTags(this.distributionConfigWithTags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.createDistributionWithTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-distribution-with-tags")
				.argument("distribution-config-with-tags", distributionConfigWithTags.toString())
	}

}


fun AmazonCloudFrontFunctions.createFieldLevelEncryptionConfig(fieldLevelEncryptionConfig: com.amazonaws.services.cloudfront.model.FieldLevelEncryptionConfig, init: AmazonCloudFrontCreateFieldLevelEncryptionConfigCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontCreateFieldLevelEncryptionConfigCommand(fieldLevelEncryptionConfig).apply(init))
}

@Generated
class AmazonCloudFrontCreateFieldLevelEncryptionConfigCommand(val fieldLevelEncryptionConfig: com.amazonaws.services.cloudfront.model.FieldLevelEncryptionConfig) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionConfigRequest()
		input.setFieldLevelEncryptionConfig(this.fieldLevelEncryptionConfig)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.createFieldLevelEncryptionConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-field-level-encryption-config")
				.argument("field-level-encryption-config", fieldLevelEncryptionConfig.toString())
	}

}


fun AmazonCloudFrontFunctions.createFieldLevelEncryptionProfile(fieldLevelEncryptionProfileConfig: com.amazonaws.services.cloudfront.model.FieldLevelEncryptionProfileConfig, init: AmazonCloudFrontCreateFieldLevelEncryptionProfileCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontCreateFieldLevelEncryptionProfileCommand(fieldLevelEncryptionProfileConfig).apply(init))
}

@Generated
class AmazonCloudFrontCreateFieldLevelEncryptionProfileCommand(val fieldLevelEncryptionProfileConfig: com.amazonaws.services.cloudfront.model.FieldLevelEncryptionProfileConfig) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest {
		val input = com.amazonaws.services.cloudfront.model.CreateFieldLevelEncryptionProfileRequest()
		input.setFieldLevelEncryptionProfileConfig(this.fieldLevelEncryptionProfileConfig)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.createFieldLevelEncryptionProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-field-level-encryption-profile")
				.argument("field-level-encryption-profile-config", fieldLevelEncryptionProfileConfig.toString())
	}

}


fun AmazonCloudFrontFunctions.createInvalidation(distributionId: String, invalidationBatch: com.amazonaws.services.cloudfront.model.InvalidationBatch, init: AmazonCloudFrontCreateInvalidationCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontCreateInvalidationCommand(distributionId, invalidationBatch).apply(init))
}

@Generated
class AmazonCloudFrontCreateInvalidationCommand(val distributionId: String, val invalidationBatch: com.amazonaws.services.cloudfront.model.InvalidationBatch) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreateInvalidationRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreateInvalidationRequest {
		val input = com.amazonaws.services.cloudfront.model.CreateInvalidationRequest()
		input.setDistributionId(this.distributionId)
		input.setInvalidationBatch(this.invalidationBatch)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.createInvalidation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-invalidation")
				.argument("distribution-id", distributionId)
				.argument("invalidation-batch", invalidationBatch.toString())
	}

}


fun AmazonCloudFrontFunctions.createPublicKey(publicKeyConfig: com.amazonaws.services.cloudfront.model.PublicKeyConfig, init: AmazonCloudFrontCreatePublicKeyCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontCreatePublicKeyCommand(publicKeyConfig).apply(init))
}

@Generated
class AmazonCloudFrontCreatePublicKeyCommand(val publicKeyConfig: com.amazonaws.services.cloudfront.model.PublicKeyConfig) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest {
		val input = com.amazonaws.services.cloudfront.model.CreatePublicKeyRequest()
		input.setPublicKeyConfig(this.publicKeyConfig)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.createPublicKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-public-key")
				.argument("public-key-config", publicKeyConfig.toString())
	}

}


fun AmazonCloudFrontFunctions.createStreamingDistribution(streamingDistributionConfig: com.amazonaws.services.cloudfront.model.StreamingDistributionConfig, init: AmazonCloudFrontCreateStreamingDistributionCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontCreateStreamingDistributionCommand(streamingDistributionConfig).apply(init))
}

@Generated
class AmazonCloudFrontCreateStreamingDistributionCommand(val streamingDistributionConfig: com.amazonaws.services.cloudfront.model.StreamingDistributionConfig) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest {
		val input = com.amazonaws.services.cloudfront.model.CreateStreamingDistributionRequest()
		input.setStreamingDistributionConfig(this.streamingDistributionConfig)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.createStreamingDistribution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-streaming-distribution")
				.argument("streaming-distribution-config", streamingDistributionConfig.toString())
	}

}


fun AmazonCloudFrontFunctions.createStreamingDistributionWithTags(streamingDistributionConfigWithTags: com.amazonaws.services.cloudfront.model.StreamingDistributionConfigWithTags, init: AmazonCloudFrontCreateStreamingDistributionWithTagsCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontCreateStreamingDistributionWithTagsCommand(streamingDistributionConfigWithTags).apply(init))
}

@Generated
class AmazonCloudFrontCreateStreamingDistributionWithTagsCommand(val streamingDistributionConfigWithTags: com.amazonaws.services.cloudfront.model.StreamingDistributionConfigWithTags) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest {
		val input = com.amazonaws.services.cloudfront.model.CreateStreamingDistributionWithTagsRequest()
		input.setStreamingDistributionConfigWithTags(this.streamingDistributionConfigWithTags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.createStreamingDistributionWithTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront create-streaming-distribution-with-tags")
				.argument("streaming-distribution-config-with-tags", streamingDistributionConfigWithTags.toString())
	}

}


fun AmazonCloudFrontFunctions.deleteCloudFrontOriginAccessIdentity(id: String, init: AmazonCloudFrontDeleteCloudFrontOriginAccessIdentityCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontDeleteCloudFrontOriginAccessIdentityCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontDeleteCloudFrontOriginAccessIdentityCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest {
		val input = com.amazonaws.services.cloudfront.model.DeleteCloudFrontOriginAccessIdentityRequest()
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.deleteCloudFrontOriginAccessIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront delete-cloud-front-origin-access-identity")
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.deleteDistribution(id: String, init: AmazonCloudFrontDeleteDistributionCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontDeleteDistributionCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontDeleteDistributionCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.DeleteDistributionRequest> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.DeleteDistributionRequest {
		val input = com.amazonaws.services.cloudfront.model.DeleteDistributionRequest()
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.deleteDistribution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront delete-distribution")
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.deleteFieldLevelEncryptionConfig(id: String, init: AmazonCloudFrontDeleteFieldLevelEncryptionConfigCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontDeleteFieldLevelEncryptionConfigCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontDeleteFieldLevelEncryptionConfigCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionConfigRequest()
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.deleteFieldLevelEncryptionConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront delete-field-level-encryption-config")
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.deleteFieldLevelEncryptionProfile(id: String, init: AmazonCloudFrontDeleteFieldLevelEncryptionProfileCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontDeleteFieldLevelEncryptionProfileCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontDeleteFieldLevelEncryptionProfileCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest {
		val input = com.amazonaws.services.cloudfront.model.DeleteFieldLevelEncryptionProfileRequest()
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.deleteFieldLevelEncryptionProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront delete-field-level-encryption-profile")
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.deletePublicKey(id: String, init: AmazonCloudFrontDeletePublicKeyCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontDeletePublicKeyCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontDeletePublicKeyCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest {
		val input = com.amazonaws.services.cloudfront.model.DeletePublicKeyRequest()
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.deletePublicKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront delete-public-key")
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.deleteServiceLinkedRole(roleName: String, init: AmazonCloudFrontDeleteServiceLinkedRoleCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontDeleteServiceLinkedRoleCommand(roleName).apply(init))
}

@Generated
class AmazonCloudFrontDeleteServiceLinkedRoleCommand(val roleName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.DeleteServiceLinkedRoleRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.DeleteServiceLinkedRoleRequest {
		val input = com.amazonaws.services.cloudfront.model.DeleteServiceLinkedRoleRequest()
		input.setRoleName(this.roleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.deleteServiceLinkedRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront delete-service-linked-role")
				.argument("role-name", roleName)
	}

}


fun AmazonCloudFrontFunctions.deleteStreamingDistribution(id: String, init: AmazonCloudFrontDeleteStreamingDistributionCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontDeleteStreamingDistributionCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontDeleteStreamingDistributionCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest {
		val input = com.amazonaws.services.cloudfront.model.DeleteStreamingDistributionRequest()
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.deleteStreamingDistribution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront delete-streaming-distribution")
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.getCloudFrontOriginAccessIdentity(id: String, init: AmazonCloudFrontGetCloudFrontOriginAccessIdentityCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontGetCloudFrontOriginAccessIdentityCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontGetCloudFrontOriginAccessIdentityCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest {
		val input = com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.getCloudFrontOriginAccessIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-cloud-front-origin-access-identity")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getCloudFrontOriginAccessIdentityConfig(id: String, init: AmazonCloudFrontGetCloudFrontOriginAccessIdentityConfigCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontGetCloudFrontOriginAccessIdentityConfigCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontGetCloudFrontOriginAccessIdentityConfigCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.GetCloudFrontOriginAccessIdentityConfigRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.getCloudFrontOriginAccessIdentityConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-cloud-front-origin-access-identity-config")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getDistribution(id: String, init: AmazonCloudFrontGetDistributionCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontGetDistributionCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontGetDistributionCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetDistributionRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetDistributionRequest {
		val input = com.amazonaws.services.cloudfront.model.GetDistributionRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.getDistribution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-distribution")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getDistributionConfig(id: String, init: AmazonCloudFrontGetDistributionConfigCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontGetDistributionConfigCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontGetDistributionConfigCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.GetDistributionConfigRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.getDistributionConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-distribution-config")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getFieldLevelEncryption(id: String, init: AmazonCloudFrontGetFieldLevelEncryptionCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontGetFieldLevelEncryptionCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontGetFieldLevelEncryptionCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest {
		val input = com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.getFieldLevelEncryption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-field-level-encryption")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getFieldLevelEncryptionConfig(id: String, init: AmazonCloudFrontGetFieldLevelEncryptionConfigCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontGetFieldLevelEncryptionConfigCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontGetFieldLevelEncryptionConfigCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionConfigRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.getFieldLevelEncryptionConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-field-level-encryption-config")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getFieldLevelEncryptionProfile(id: String, init: AmazonCloudFrontGetFieldLevelEncryptionProfileCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontGetFieldLevelEncryptionProfileCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontGetFieldLevelEncryptionProfileCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest {
		val input = com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.getFieldLevelEncryptionProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-field-level-encryption-profile")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getFieldLevelEncryptionProfileConfig(id: String, init: AmazonCloudFrontGetFieldLevelEncryptionProfileConfigCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontGetFieldLevelEncryptionProfileConfigCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontGetFieldLevelEncryptionProfileConfigCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.GetFieldLevelEncryptionProfileConfigRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.getFieldLevelEncryptionProfileConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-field-level-encryption-profile-config")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getInvalidation(distributionId: String, id: String, init: AmazonCloudFrontGetInvalidationCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontGetInvalidationCommand(distributionId, id).apply(init))
}

@Generated
class AmazonCloudFrontGetInvalidationCommand(val distributionId: String, val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetInvalidationRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetInvalidationRequest {
		val input = com.amazonaws.services.cloudfront.model.GetInvalidationRequest()
		input.setDistributionId(this.distributionId)
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.getInvalidation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-invalidation")
				.argument("distribution-id", distributionId)
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getPublicKey(id: String, init: AmazonCloudFrontGetPublicKeyCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontGetPublicKeyCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontGetPublicKeyCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetPublicKeyRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetPublicKeyRequest {
		val input = com.amazonaws.services.cloudfront.model.GetPublicKeyRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.getPublicKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-public-key")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getPublicKeyConfig(id: String, init: AmazonCloudFrontGetPublicKeyConfigCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontGetPublicKeyConfigCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontGetPublicKeyConfigCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.GetPublicKeyConfigRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.getPublicKeyConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-public-key-config")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getStreamingDistribution(id: String, init: AmazonCloudFrontGetStreamingDistributionCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontGetStreamingDistributionCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontGetStreamingDistributionCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest {
		val input = com.amazonaws.services.cloudfront.model.GetStreamingDistributionRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.getStreamingDistribution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-streaming-distribution")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.getStreamingDistributionConfig(id: String, init: AmazonCloudFrontGetStreamingDistributionConfigCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontGetStreamingDistributionConfigCommand(id).apply(init))
}

@Generated
class AmazonCloudFrontGetStreamingDistributionConfigCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.GetStreamingDistributionConfigRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.getStreamingDistributionConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront get-streaming-distribution-config")
				.argument("id", id)
	}

}


fun AmazonCloudFrontFunctions.listCloudFrontOriginAccessIdentities(init: AmazonCloudFrontListCloudFrontOriginAccessIdentitiesCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontListCloudFrontOriginAccessIdentitiesCommand().apply(init))
}

@Generated
class AmazonCloudFrontListCloudFrontOriginAccessIdentitiesCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest {
		val input = com.amazonaws.services.cloudfront.model.ListCloudFrontOriginAccessIdentitiesRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.listCloudFrontOriginAccessIdentities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-cloud-front-origin-access-identities")
				.argument("marker", marker)
				.argument("max-items", maxItems)
	}

}


fun AmazonCloudFrontFunctions.listDistributions(init: AmazonCloudFrontListDistributionsCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontListDistributionsCommand().apply(init))
}

@Generated
class AmazonCloudFrontListDistributionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListDistributionsRequest> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.ListDistributionsRequest {
		val input = com.amazonaws.services.cloudfront.model.ListDistributionsRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.listDistributions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-distributions")
				.argument("marker", marker)
				.argument("max-items", maxItems)
	}

}


fun AmazonCloudFrontFunctions.listDistributionsByWebACLId(webACLId: String, init: AmazonCloudFrontListDistributionsByWebACLIdCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontListDistributionsByWebACLIdCommand(webACLId).apply(init))
}

@Generated
class AmazonCloudFrontListDistributionsByWebACLIdCommand(val webACLId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest {
		val input = com.amazonaws.services.cloudfront.model.ListDistributionsByWebACLIdRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		input.setWebACLId(this.webACLId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.listDistributionsByWebACLId(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-distributions-by-web-aclid")
				.argument("marker", marker)
				.argument("max-items", maxItems)
				.argument("web-aclid", webACLId)
	}

}


fun AmazonCloudFrontFunctions.listFieldLevelEncryptionConfigs(init: AmazonCloudFrontListFieldLevelEncryptionConfigsCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontListFieldLevelEncryptionConfigsCommand().apply(init))
}

@Generated
class AmazonCloudFrontListFieldLevelEncryptionConfigsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest {
		val input = com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionConfigsRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.listFieldLevelEncryptionConfigs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-field-level-encryption-configs")
				.argument("marker", marker)
				.argument("max-items", maxItems)
	}

}


fun AmazonCloudFrontFunctions.listFieldLevelEncryptionProfiles(init: AmazonCloudFrontListFieldLevelEncryptionProfilesCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontListFieldLevelEncryptionProfilesCommand().apply(init))
}

@Generated
class AmazonCloudFrontListFieldLevelEncryptionProfilesCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest {
		val input = com.amazonaws.services.cloudfront.model.ListFieldLevelEncryptionProfilesRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.listFieldLevelEncryptionProfiles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-field-level-encryption-profiles")
				.argument("marker", marker)
				.argument("max-items", maxItems)
	}

}


fun AmazonCloudFrontFunctions.listInvalidations(distributionId: String, init: AmazonCloudFrontListInvalidationsCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontListInvalidationsCommand(distributionId).apply(init))
}

@Generated
class AmazonCloudFrontListInvalidationsCommand(val distributionId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListInvalidationsRequest> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.ListInvalidationsRequest {
		val input = com.amazonaws.services.cloudfront.model.ListInvalidationsRequest()
		input.setDistributionId(this.distributionId)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.listInvalidations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-invalidations")
				.argument("distribution-id", distributionId)
				.argument("marker", marker)
				.argument("max-items", maxItems)
	}

}


fun AmazonCloudFrontFunctions.listPublicKeys(init: AmazonCloudFrontListPublicKeysCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontListPublicKeysCommand().apply(init))
}

@Generated
class AmazonCloudFrontListPublicKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListPublicKeysRequest> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.ListPublicKeysRequest {
		val input = com.amazonaws.services.cloudfront.model.ListPublicKeysRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.listPublicKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-public-keys")
				.argument("marker", marker)
				.argument("max-items", maxItems)
	}

}


fun AmazonCloudFrontFunctions.listStreamingDistributions(init: AmazonCloudFrontListStreamingDistributionsCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontListStreamingDistributionsCommand().apply(init))
}

@Generated
class AmazonCloudFrontListStreamingDistributionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest {
		val input = com.amazonaws.services.cloudfront.model.ListStreamingDistributionsRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.listStreamingDistributions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-streaming-distributions")
				.argument("marker", marker)
				.argument("max-items", maxItems)
	}

}


fun AmazonCloudFrontFunctions.listTagsForResource(resource: String, init: AmazonCloudFrontListTagsForResourceCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontListTagsForResourceCommand(resource).apply(init))
}

@Generated
class AmazonCloudFrontListTagsForResourceCommand(val resource: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.cloudfront.model.ListTagsForResourceRequest()
		input.setResource(this.resource)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront list-tags-for-resource")
				.argument("resource", resource)
	}

}


fun AmazonCloudFrontFunctions.tagResource(resource: String, tags: com.amazonaws.services.cloudfront.model.Tags, init: AmazonCloudFrontTagResourceCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontTagResourceCommand(resource, tags).apply(init))
}

@Generated
class AmazonCloudFrontTagResourceCommand(val resource: String, val tags: com.amazonaws.services.cloudfront.model.Tags) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.TagResourceRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.TagResourceRequest {
		val input = com.amazonaws.services.cloudfront.model.TagResourceRequest()
		input.setResource(this.resource)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront tag-resource")
				.argument("resource", resource)
				.argument("tags", tags.toString())
	}

}


fun AmazonCloudFrontFunctions.untagResource(resource: String, tagKeys: com.amazonaws.services.cloudfront.model.TagKeys, init: AmazonCloudFrontUntagResourceCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontUntagResourceCommand(resource, tagKeys).apply(init))
}

@Generated
class AmazonCloudFrontUntagResourceCommand(val resource: String, val tagKeys: com.amazonaws.services.cloudfront.model.TagKeys) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.UntagResourceRequest> {



	override fun build(): com.amazonaws.services.cloudfront.model.UntagResourceRequest {
		val input = com.amazonaws.services.cloudfront.model.UntagResourceRequest()
		input.setResource(this.resource)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront untag-resource")
				.argument("resource", resource)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonCloudFrontFunctions.updateCloudFrontOriginAccessIdentity(cloudFrontOriginAccessIdentityConfig: com.amazonaws.services.cloudfront.model.CloudFrontOriginAccessIdentityConfig, id: String, init: AmazonCloudFrontUpdateCloudFrontOriginAccessIdentityCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontUpdateCloudFrontOriginAccessIdentityCommand(cloudFrontOriginAccessIdentityConfig, id).apply(init))
}

@Generated
class AmazonCloudFrontUpdateCloudFrontOriginAccessIdentityCommand(val cloudFrontOriginAccessIdentityConfig: com.amazonaws.services.cloudfront.model.CloudFrontOriginAccessIdentityConfig, val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest {
		val input = com.amazonaws.services.cloudfront.model.UpdateCloudFrontOriginAccessIdentityRequest()
		input.setCloudFrontOriginAccessIdentityConfig(this.cloudFrontOriginAccessIdentityConfig)
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.updateCloudFrontOriginAccessIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront update-cloud-front-origin-access-identity")
				.argument("cloud-front-origin-access-identity-config", cloudFrontOriginAccessIdentityConfig.toString())
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.updateDistribution(distributionConfig: com.amazonaws.services.cloudfront.model.DistributionConfig, id: String, init: AmazonCloudFrontUpdateDistributionCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontUpdateDistributionCommand(distributionConfig, id).apply(init))
}

@Generated
class AmazonCloudFrontUpdateDistributionCommand(val distributionConfig: com.amazonaws.services.cloudfront.model.DistributionConfig, val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.UpdateDistributionRequest> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.UpdateDistributionRequest {
		val input = com.amazonaws.services.cloudfront.model.UpdateDistributionRequest()
		input.setDistributionConfig(this.distributionConfig)
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.updateDistribution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront update-distribution")
				.argument("distribution-config", distributionConfig.toString())
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.updateFieldLevelEncryptionConfig(fieldLevelEncryptionConfig: com.amazonaws.services.cloudfront.model.FieldLevelEncryptionConfig, id: String, init: AmazonCloudFrontUpdateFieldLevelEncryptionConfigCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontUpdateFieldLevelEncryptionConfigCommand(fieldLevelEncryptionConfig, id).apply(init))
}

@Generated
class AmazonCloudFrontUpdateFieldLevelEncryptionConfigCommand(val fieldLevelEncryptionConfig: com.amazonaws.services.cloudfront.model.FieldLevelEncryptionConfig, val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest {
		val input = com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionConfigRequest()
		input.setFieldLevelEncryptionConfig(this.fieldLevelEncryptionConfig)
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.updateFieldLevelEncryptionConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront update-field-level-encryption-config")
				.argument("field-level-encryption-config", fieldLevelEncryptionConfig.toString())
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.updateFieldLevelEncryptionProfile(fieldLevelEncryptionProfileConfig: com.amazonaws.services.cloudfront.model.FieldLevelEncryptionProfileConfig, id: String, init: AmazonCloudFrontUpdateFieldLevelEncryptionProfileCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontUpdateFieldLevelEncryptionProfileCommand(fieldLevelEncryptionProfileConfig, id).apply(init))
}

@Generated
class AmazonCloudFrontUpdateFieldLevelEncryptionProfileCommand(val fieldLevelEncryptionProfileConfig: com.amazonaws.services.cloudfront.model.FieldLevelEncryptionProfileConfig, val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest {
		val input = com.amazonaws.services.cloudfront.model.UpdateFieldLevelEncryptionProfileRequest()
		input.setFieldLevelEncryptionProfileConfig(this.fieldLevelEncryptionProfileConfig)
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.updateFieldLevelEncryptionProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront update-field-level-encryption-profile")
				.argument("field-level-encryption-profile-config", fieldLevelEncryptionProfileConfig.toString())
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.updatePublicKey(publicKeyConfig: com.amazonaws.services.cloudfront.model.PublicKeyConfig, id: String, init: AmazonCloudFrontUpdatePublicKeyCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontUpdatePublicKeyCommand(publicKeyConfig, id).apply(init))
}

@Generated
class AmazonCloudFrontUpdatePublicKeyCommand(val publicKeyConfig: com.amazonaws.services.cloudfront.model.PublicKeyConfig, val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest {
		val input = com.amazonaws.services.cloudfront.model.UpdatePublicKeyRequest()
		input.setPublicKeyConfig(this.publicKeyConfig)
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.updatePublicKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront update-public-key")
				.argument("public-key-config", publicKeyConfig.toString())
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}


fun AmazonCloudFrontFunctions.updateStreamingDistribution(streamingDistributionConfig: com.amazonaws.services.cloudfront.model.StreamingDistributionConfig, id: String, init: AmazonCloudFrontUpdateStreamingDistributionCommand.() -> Unit) {
	this.block.declare(AmazonCloudFrontUpdateStreamingDistributionCommand(streamingDistributionConfig, id).apply(init))
}

@Generated
class AmazonCloudFrontUpdateStreamingDistributionCommand(val streamingDistributionConfig: com.amazonaws.services.cloudfront.model.StreamingDistributionConfig, val id: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest> {

	var ifMatch: String? = null

	override fun build(): com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest {
		val input = com.amazonaws.services.cloudfront.model.UpdateStreamingDistributionRequest()
		input.setStreamingDistributionConfig(this.streamingDistributionConfig)
		input.setId(this.id)
		input.setIfMatch(this.ifMatch)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudfront.updateStreamingDistribution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudfront update-streaming-distribution")
				.argument("streaming-distribution-config", streamingDistributionConfig.toString())
				.argument("id", id)
				.argument("if-match", ifMatch)
	}

}
