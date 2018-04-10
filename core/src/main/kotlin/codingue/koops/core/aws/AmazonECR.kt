
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.ecr.AmazonECR
import com.amazonaws.services.ecr.model.*

var codingue.koops.core.Environment.ecr: AmazonECR
	get() = this.capabilities[AmazonECR::class.java.name] as AmazonECR
	set(ecr) {
		this.capabilities[AmazonECR::class.java.name] = ecr
	}

@Generated
class AmazonECRFunctions(val block: Block)

infix fun AwsContinuation.ecr(init: AmazonECRFunctions.() -> Unit) {
	AmazonECRFunctions(shell).apply(init)
}

			

fun AmazonECRFunctions.batchCheckLayerAvailability(init: AmazonECRBatchCheckLayerAvailabilityCommand.() -> Unit) {
	this.block.declare(AmazonECRBatchCheckLayerAvailabilityCommand().apply(init))
}

@Generated
class AmazonECRBatchCheckLayerAvailabilityCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityRequest> {

	var registryId: String? = null
	var repositoryName: String? = null
	var layerDigests: List<String>? = null

	override fun build(): com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityRequest {
		val input = com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		input.setLayerDigests(this.layerDigests)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.batchCheckLayerAvailability(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr batch-check-layer-availability")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("layer-digests", layerDigests?.toString())
	}

}


fun AmazonECRFunctions.batchDeleteImage(init: AmazonECRBatchDeleteImageCommand.() -> Unit) {
	this.block.declare(AmazonECRBatchDeleteImageCommand().apply(init))
}

@Generated
class AmazonECRBatchDeleteImageCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.BatchDeleteImageRequest> {

	var registryId: String? = null
	var repositoryName: String? = null
	var imageIds: List<com.amazonaws.services.ecr.model.ImageIdentifier>? = null

	override fun build(): com.amazonaws.services.ecr.model.BatchDeleteImageRequest {
		val input = com.amazonaws.services.ecr.model.BatchDeleteImageRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		input.setImageIds(this.imageIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.batchDeleteImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr batch-delete-image")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("image-ids", imageIds?.toString())
	}

}


fun AmazonECRFunctions.batchGetImage(init: AmazonECRBatchGetImageCommand.() -> Unit) {
	this.block.declare(AmazonECRBatchGetImageCommand().apply(init))
}

@Generated
class AmazonECRBatchGetImageCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.BatchGetImageRequest> {

	var registryId: String? = null
	var repositoryName: String? = null
	var imageIds: List<com.amazonaws.services.ecr.model.ImageIdentifier>? = null
	var acceptedMediaTypes: List<String>? = null

	override fun build(): com.amazonaws.services.ecr.model.BatchGetImageRequest {
		val input = com.amazonaws.services.ecr.model.BatchGetImageRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		input.setImageIds(this.imageIds)
		input.setAcceptedMediaTypes(this.acceptedMediaTypes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.batchGetImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr batch-get-image")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("image-ids", imageIds?.toString())
				.argument("accepted-media-types", acceptedMediaTypes?.toString())
	}

}


fun AmazonECRFunctions.completeLayerUpload(init: AmazonECRCompleteLayerUploadCommand.() -> Unit) {
	this.block.declare(AmazonECRCompleteLayerUploadCommand().apply(init))
}

@Generated
class AmazonECRCompleteLayerUploadCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.CompleteLayerUploadRequest> {

	var registryId: String? = null
	var repositoryName: String? = null
	var uploadId: String? = null
	var layerDigests: List<String>? = null

	override fun build(): com.amazonaws.services.ecr.model.CompleteLayerUploadRequest {
		val input = com.amazonaws.services.ecr.model.CompleteLayerUploadRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		input.setUploadId(this.uploadId)
		input.setLayerDigests(this.layerDigests)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.completeLayerUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr complete-layer-upload")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("upload-id", uploadId)
				.argument("layer-digests", layerDigests?.toString())
	}

}


fun AmazonECRFunctions.createRepository(init: AmazonECRCreateRepositoryCommand.() -> Unit) {
	this.block.declare(AmazonECRCreateRepositoryCommand().apply(init))
}

@Generated
class AmazonECRCreateRepositoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.CreateRepositoryRequest> {

	var repositoryName: String? = null

	override fun build(): com.amazonaws.services.ecr.model.CreateRepositoryRequest {
		val input = com.amazonaws.services.ecr.model.CreateRepositoryRequest()
		input.setRepositoryName(this.repositoryName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.createRepository(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr create-repository")
				.argument("repository-name", repositoryName)
	}

}


fun AmazonECRFunctions.deleteLifecyclePolicy(init: AmazonECRDeleteLifecyclePolicyCommand.() -> Unit) {
	this.block.declare(AmazonECRDeleteLifecyclePolicyCommand().apply(init))
}

@Generated
class AmazonECRDeleteLifecyclePolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest> {

	var registryId: String? = null
	var repositoryName: String? = null

	override fun build(): com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest {
		val input = com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.deleteLifecyclePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr delete-lifecycle-policy")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
	}

}


fun AmazonECRFunctions.deleteRepository(init: AmazonECRDeleteRepositoryCommand.() -> Unit) {
	this.block.declare(AmazonECRDeleteRepositoryCommand().apply(init))
}

@Generated
class AmazonECRDeleteRepositoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.DeleteRepositoryRequest> {

	var registryId: String? = null
	var repositoryName: String? = null
	var force: Boolean? = false

	override fun build(): com.amazonaws.services.ecr.model.DeleteRepositoryRequest {
		val input = com.amazonaws.services.ecr.model.DeleteRepositoryRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		input.setForce(this.force)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.deleteRepository(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr delete-repository")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.option("force", force ?: false)
	}

}


fun AmazonECRFunctions.deleteRepositoryPolicy(init: AmazonECRDeleteRepositoryPolicyCommand.() -> Unit) {
	this.block.declare(AmazonECRDeleteRepositoryPolicyCommand().apply(init))
}

@Generated
class AmazonECRDeleteRepositoryPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest> {

	var registryId: String? = null
	var repositoryName: String? = null

	override fun build(): com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest {
		val input = com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.deleteRepositoryPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr delete-repository-policy")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
	}

}


fun AmazonECRFunctions.describeImages(init: AmazonECRDescribeImagesCommand.() -> Unit) {
	this.block.declare(AmazonECRDescribeImagesCommand().apply(init))
}

@Generated
class AmazonECRDescribeImagesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.DescribeImagesRequest> {

	var registryId: String? = null
	var repositoryName: String? = null
	var imageIds: List<com.amazonaws.services.ecr.model.ImageIdentifier>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var filter: com.amazonaws.services.ecr.model.DescribeImagesFilter? = null

	override fun build(): com.amazonaws.services.ecr.model.DescribeImagesRequest {
		val input = com.amazonaws.services.ecr.model.DescribeImagesRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		input.setImageIds(this.imageIds)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setFilter(this.filter)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.describeImages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr describe-images")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("image-ids", imageIds?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filter", filter?.toString())
	}

}


fun AmazonECRFunctions.describeRepositories(init: AmazonECRDescribeRepositoriesCommand.() -> Unit) {
	this.block.declare(AmazonECRDescribeRepositoriesCommand().apply(init))
}

@Generated
class AmazonECRDescribeRepositoriesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.DescribeRepositoriesRequest> {

	var registryId: String? = null
	var repositoryNames: List<String>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.ecr.model.DescribeRepositoriesRequest {
		val input = com.amazonaws.services.ecr.model.DescribeRepositoriesRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryNames(this.repositoryNames)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.describeRepositories(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr describe-repositories")
				.argument("registry-id", registryId)
				.argument("repository-names", repositoryNames?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonECRFunctions.getAuthorizationToken(init: AmazonECRGetAuthorizationTokenCommand.() -> Unit) {
	this.block.declare(AmazonECRGetAuthorizationTokenCommand().apply(init))
}

@Generated
class AmazonECRGetAuthorizationTokenCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest> {

	var registryIds: List<String>? = null

	override fun build(): com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest {
		val input = com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest()
		input.setRegistryIds(this.registryIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.getAuthorizationToken(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr get-authorization-token")
				.argument("registry-ids", registryIds?.toString())
	}

}


fun AmazonECRFunctions.getDownloadUrlForLayer(init: AmazonECRGetDownloadUrlForLayerCommand.() -> Unit) {
	this.block.declare(AmazonECRGetDownloadUrlForLayerCommand().apply(init))
}

@Generated
class AmazonECRGetDownloadUrlForLayerCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.GetDownloadUrlForLayerRequest> {

	var registryId: String? = null
	var repositoryName: String? = null
	var layerDigest: String? = null

	override fun build(): com.amazonaws.services.ecr.model.GetDownloadUrlForLayerRequest {
		val input = com.amazonaws.services.ecr.model.GetDownloadUrlForLayerRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		input.setLayerDigest(this.layerDigest)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.getDownloadUrlForLayer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr get-download-url-for-layer")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("layer-digest", layerDigest)
	}

}


fun AmazonECRFunctions.getLifecyclePolicy(init: AmazonECRGetLifecyclePolicyCommand.() -> Unit) {
	this.block.declare(AmazonECRGetLifecyclePolicyCommand().apply(init))
}

@Generated
class AmazonECRGetLifecyclePolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest> {

	var registryId: String? = null
	var repositoryName: String? = null

	override fun build(): com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest {
		val input = com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.getLifecyclePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr get-lifecycle-policy")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
	}

}


fun AmazonECRFunctions.getLifecyclePolicyPreview(init: AmazonECRGetLifecyclePolicyPreviewCommand.() -> Unit) {
	this.block.declare(AmazonECRGetLifecyclePolicyPreviewCommand().apply(init))
}

@Generated
class AmazonECRGetLifecyclePolicyPreviewCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewRequest> {

	var registryId: String? = null
	var repositoryName: String? = null
	var imageIds: List<com.amazonaws.services.ecr.model.ImageIdentifier>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var filter: com.amazonaws.services.ecr.model.LifecyclePolicyPreviewFilter? = null

	override fun build(): com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewRequest {
		val input = com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		input.setImageIds(this.imageIds)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setFilter(this.filter)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.getLifecyclePolicyPreview(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr get-lifecycle-policy-preview")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("image-ids", imageIds?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filter", filter?.toString())
	}

}


fun AmazonECRFunctions.getRepositoryPolicy(init: AmazonECRGetRepositoryPolicyCommand.() -> Unit) {
	this.block.declare(AmazonECRGetRepositoryPolicyCommand().apply(init))
}

@Generated
class AmazonECRGetRepositoryPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest> {

	var registryId: String? = null
	var repositoryName: String? = null

	override fun build(): com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest {
		val input = com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.getRepositoryPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr get-repository-policy")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
	}

}


fun AmazonECRFunctions.initiateLayerUpload(init: AmazonECRInitiateLayerUploadCommand.() -> Unit) {
	this.block.declare(AmazonECRInitiateLayerUploadCommand().apply(init))
}

@Generated
class AmazonECRInitiateLayerUploadCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.InitiateLayerUploadRequest> {

	var registryId: String? = null
	var repositoryName: String? = null

	override fun build(): com.amazonaws.services.ecr.model.InitiateLayerUploadRequest {
		val input = com.amazonaws.services.ecr.model.InitiateLayerUploadRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.initiateLayerUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr initiate-layer-upload")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
	}

}


fun AmazonECRFunctions.listImages(init: AmazonECRListImagesCommand.() -> Unit) {
	this.block.declare(AmazonECRListImagesCommand().apply(init))
}

@Generated
class AmazonECRListImagesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.ListImagesRequest> {

	var registryId: String? = null
	var repositoryName: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var filter: com.amazonaws.services.ecr.model.ListImagesFilter? = null

	override fun build(): com.amazonaws.services.ecr.model.ListImagesRequest {
		val input = com.amazonaws.services.ecr.model.ListImagesRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setFilter(this.filter)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.listImages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr list-images")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filter", filter?.toString())
	}

}


fun AmazonECRFunctions.putImage(init: AmazonECRPutImageCommand.() -> Unit) {
	this.block.declare(AmazonECRPutImageCommand().apply(init))
}

@Generated
class AmazonECRPutImageCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.PutImageRequest> {

	var registryId: String? = null
	var repositoryName: String? = null
	var imageManifest: String? = null
	var imageTag: String? = null

	override fun build(): com.amazonaws.services.ecr.model.PutImageRequest {
		val input = com.amazonaws.services.ecr.model.PutImageRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		input.setImageManifest(this.imageManifest)
		input.setImageTag(this.imageTag)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.putImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr put-image")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("image-manifest", imageManifest)
				.argument("image-tag", imageTag)
	}

}


fun AmazonECRFunctions.putLifecyclePolicy(init: AmazonECRPutLifecyclePolicyCommand.() -> Unit) {
	this.block.declare(AmazonECRPutLifecyclePolicyCommand().apply(init))
}

@Generated
class AmazonECRPutLifecyclePolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.PutLifecyclePolicyRequest> {

	var registryId: String? = null
	var repositoryName: String? = null
	var lifecyclePolicyText: String? = null

	override fun build(): com.amazonaws.services.ecr.model.PutLifecyclePolicyRequest {
		val input = com.amazonaws.services.ecr.model.PutLifecyclePolicyRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		input.setLifecyclePolicyText(this.lifecyclePolicyText)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.putLifecyclePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr put-lifecycle-policy")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("lifecycle-policy-text", lifecyclePolicyText)
	}

}


fun AmazonECRFunctions.setRepositoryPolicy(init: AmazonECRSetRepositoryPolicyCommand.() -> Unit) {
	this.block.declare(AmazonECRSetRepositoryPolicyCommand().apply(init))
}

@Generated
class AmazonECRSetRepositoryPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.SetRepositoryPolicyRequest> {

	var registryId: String? = null
	var repositoryName: String? = null
	var policyText: String? = null
	var force: Boolean? = false

	override fun build(): com.amazonaws.services.ecr.model.SetRepositoryPolicyRequest {
		val input = com.amazonaws.services.ecr.model.SetRepositoryPolicyRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		input.setPolicyText(this.policyText)
		input.setForce(this.force)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.setRepositoryPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr set-repository-policy")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("policy-text", policyText)
				.option("force", force ?: false)
	}

}


fun AmazonECRFunctions.startLifecyclePolicyPreview(init: AmazonECRStartLifecyclePolicyPreviewCommand.() -> Unit) {
	this.block.declare(AmazonECRStartLifecyclePolicyPreviewCommand().apply(init))
}

@Generated
class AmazonECRStartLifecyclePolicyPreviewCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewRequest> {

	var registryId: String? = null
	var repositoryName: String? = null
	var lifecyclePolicyText: String? = null

	override fun build(): com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewRequest {
		val input = com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		input.setLifecyclePolicyText(this.lifecyclePolicyText)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.startLifecyclePolicyPreview(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr start-lifecycle-policy-preview")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("lifecycle-policy-text", lifecyclePolicyText)
	}

}


fun AmazonECRFunctions.uploadLayerPart(init: AmazonECRUploadLayerPartCommand.() -> Unit) {
	this.block.declare(AmazonECRUploadLayerPartCommand().apply(init))
}

@Generated
class AmazonECRUploadLayerPartCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.UploadLayerPartRequest> {

	var registryId: String? = null
	var repositoryName: String? = null
	var uploadId: String? = null
	var partFirstByte: Long? = 0L
	var partLastByte: Long? = 0L
	var layerPartBlob: java.nio.ByteBuffer? = null

	override fun build(): com.amazonaws.services.ecr.model.UploadLayerPartRequest {
		val input = com.amazonaws.services.ecr.model.UploadLayerPartRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		input.setUploadId(this.uploadId)
		input.setPartFirstByte(this.partFirstByte)
		input.setPartLastByte(this.partLastByte)
		input.setLayerPartBlob(this.layerPartBlob)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecr.uploadLayerPart(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr upload-layer-part")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("upload-id", uploadId)
				.argument("part-first-byte", partFirstByte?.toString())
				.argument("part-last-byte", partLastByte?.toString())
				.argument("layer-part-blob", layerPartBlob?.toString())
	}

}
