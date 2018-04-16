
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.ecr

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.ecr.*

var com.codingue.koops.core.Environment.ecr: AmazonECR
	get() {
		var service = this.capabilities["aws-ecr"]
		if (service == null) {
			service = AmazonECRClientBuilder.standard().build()
			this.capabilities["aws-ecr"] = service
		}
		return service as AmazonECR
	}
	set(ecr) {
		this.capabilities["aws-ecr"] = ecr
	}

@Generated
class AmazonECRFunctions(val block: Script)

infix fun <T> AwsContinuation.ecr(init: AmazonECRFunctions.() -> T): T {
	return AmazonECRFunctions(shell).run(init)
}

			

fun AmazonECRFunctions.batchCheckLayerAvailability(init: (AmazonECRBatchCheckLayerAvailabilityCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityResult {
	return this.block.declare(AmazonECRBatchCheckLayerAvailabilityCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityResult
}

@Generated
class AmazonECRBatchCheckLayerAvailabilityCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityRequest, com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityResult> {

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

	
	override fun dryResult(): com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityResult {
	  return com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.BatchCheckLayerAvailabilityResult {
		return environment.ecr.batchCheckLayerAvailability(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr batch-check-layer-availability")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("layer-digests", layerDigests?.toString())
	}

}


fun AmazonECRFunctions.batchDeleteImage(init: (AmazonECRBatchDeleteImageCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.BatchDeleteImageResult {
	return this.block.declare(AmazonECRBatchDeleteImageCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.BatchDeleteImageResult
}

@Generated
class AmazonECRBatchDeleteImageCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.BatchDeleteImageRequest, com.amazonaws.services.ecr.model.BatchDeleteImageResult> {

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

	
	override fun dryResult(): com.amazonaws.services.ecr.model.BatchDeleteImageResult {
	  return com.amazonaws.services.ecr.model.BatchDeleteImageResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.BatchDeleteImageResult {
		return environment.ecr.batchDeleteImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr batch-delete-image")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("image-ids", imageIds?.toString())
	}

}


fun AmazonECRFunctions.batchGetImage(init: (AmazonECRBatchGetImageCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.BatchGetImageResult {
	return this.block.declare(AmazonECRBatchGetImageCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.BatchGetImageResult
}

@Generated
class AmazonECRBatchGetImageCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.BatchGetImageRequest, com.amazonaws.services.ecr.model.BatchGetImageResult> {

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

	
	override fun dryResult(): com.amazonaws.services.ecr.model.BatchGetImageResult {
	  return com.amazonaws.services.ecr.model.BatchGetImageResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.BatchGetImageResult {
		return environment.ecr.batchGetImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr batch-get-image")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("image-ids", imageIds?.toString())
				.argument("accepted-media-types", acceptedMediaTypes?.toString())
	}

}


fun AmazonECRFunctions.completeLayerUpload(init: (AmazonECRCompleteLayerUploadCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.CompleteLayerUploadResult {
	return this.block.declare(AmazonECRCompleteLayerUploadCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.CompleteLayerUploadResult
}

@Generated
class AmazonECRCompleteLayerUploadCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.CompleteLayerUploadRequest, com.amazonaws.services.ecr.model.CompleteLayerUploadResult> {

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

	
	override fun dryResult(): com.amazonaws.services.ecr.model.CompleteLayerUploadResult {
	  return com.amazonaws.services.ecr.model.CompleteLayerUploadResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.CompleteLayerUploadResult {
		return environment.ecr.completeLayerUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr complete-layer-upload")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("upload-id", uploadId)
				.argument("layer-digests", layerDigests?.toString())
	}

}


fun AmazonECRFunctions.createRepository(init: (AmazonECRCreateRepositoryCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.CreateRepositoryResult {
	return this.block.declare(AmazonECRCreateRepositoryCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.CreateRepositoryResult
}

@Generated
class AmazonECRCreateRepositoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.CreateRepositoryRequest, com.amazonaws.services.ecr.model.CreateRepositoryResult> {

	var repositoryName: String? = null

	override fun build(): com.amazonaws.services.ecr.model.CreateRepositoryRequest {
		val input = com.amazonaws.services.ecr.model.CreateRepositoryRequest()
		input.setRepositoryName(this.repositoryName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecr.model.CreateRepositoryResult {
	  return com.amazonaws.services.ecr.model.CreateRepositoryResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.CreateRepositoryResult {
		return environment.ecr.createRepository(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr create-repository")
				.argument("repository-name", repositoryName)
	}

}


fun AmazonECRFunctions.deleteLifecyclePolicy(init: (AmazonECRDeleteLifecyclePolicyCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.DeleteLifecyclePolicyResult {
	return this.block.declare(AmazonECRDeleteLifecyclePolicyCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.DeleteLifecyclePolicyResult
}

@Generated
class AmazonECRDeleteLifecyclePolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest, com.amazonaws.services.ecr.model.DeleteLifecyclePolicyResult> {

	var registryId: String? = null
	var repositoryName: String? = null

	override fun build(): com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest {
		val input = com.amazonaws.services.ecr.model.DeleteLifecyclePolicyRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecr.model.DeleteLifecyclePolicyResult {
	  return com.amazonaws.services.ecr.model.DeleteLifecyclePolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.DeleteLifecyclePolicyResult {
		return environment.ecr.deleteLifecyclePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr delete-lifecycle-policy")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
	}

}


fun AmazonECRFunctions.deleteRepository(init: (AmazonECRDeleteRepositoryCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.DeleteRepositoryResult {
	return this.block.declare(AmazonECRDeleteRepositoryCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.DeleteRepositoryResult
}

@Generated
class AmazonECRDeleteRepositoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.DeleteRepositoryRequest, com.amazonaws.services.ecr.model.DeleteRepositoryResult> {

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

	
	override fun dryResult(): com.amazonaws.services.ecr.model.DeleteRepositoryResult {
	  return com.amazonaws.services.ecr.model.DeleteRepositoryResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.DeleteRepositoryResult {
		return environment.ecr.deleteRepository(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr delete-repository")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.option("force", force ?: false)
	}

}


fun AmazonECRFunctions.deleteRepositoryPolicy(init: (AmazonECRDeleteRepositoryPolicyCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.DeleteRepositoryPolicyResult {
	return this.block.declare(AmazonECRDeleteRepositoryPolicyCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.DeleteRepositoryPolicyResult
}

@Generated
class AmazonECRDeleteRepositoryPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest, com.amazonaws.services.ecr.model.DeleteRepositoryPolicyResult> {

	var registryId: String? = null
	var repositoryName: String? = null

	override fun build(): com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest {
		val input = com.amazonaws.services.ecr.model.DeleteRepositoryPolicyRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecr.model.DeleteRepositoryPolicyResult {
	  return com.amazonaws.services.ecr.model.DeleteRepositoryPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.DeleteRepositoryPolicyResult {
		return environment.ecr.deleteRepositoryPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr delete-repository-policy")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
	}

}


fun AmazonECRFunctions.describeImages(init: (AmazonECRDescribeImagesCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.DescribeImagesResult {
	return this.block.declare(AmazonECRDescribeImagesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.DescribeImagesResult
}

@Generated
class AmazonECRDescribeImagesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.DescribeImagesRequest, com.amazonaws.services.ecr.model.DescribeImagesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.ecr.model.DescribeImagesResult {
	  return com.amazonaws.services.ecr.model.DescribeImagesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.DescribeImagesResult {
		return environment.ecr.describeImages(build())
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


fun AmazonECRFunctions.describeRepositories(init: (AmazonECRDescribeRepositoriesCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.DescribeRepositoriesResult {
	return this.block.declare(AmazonECRDescribeRepositoriesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.DescribeRepositoriesResult
}

@Generated
class AmazonECRDescribeRepositoriesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.DescribeRepositoriesRequest, com.amazonaws.services.ecr.model.DescribeRepositoriesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.ecr.model.DescribeRepositoriesResult {
	  return com.amazonaws.services.ecr.model.DescribeRepositoriesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.DescribeRepositoriesResult {
		return environment.ecr.describeRepositories(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr describe-repositories")
				.argument("registry-id", registryId)
				.argument("repository-names", repositoryNames?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonECRFunctions.getAuthorizationToken(init: (AmazonECRGetAuthorizationTokenCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.GetAuthorizationTokenResult {
	return this.block.declare(AmazonECRGetAuthorizationTokenCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.GetAuthorizationTokenResult
}

@Generated
class AmazonECRGetAuthorizationTokenCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest, com.amazonaws.services.ecr.model.GetAuthorizationTokenResult> {

	var registryIds: List<String>? = null

	override fun build(): com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest {
		val input = com.amazonaws.services.ecr.model.GetAuthorizationTokenRequest()
		input.setRegistryIds(this.registryIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecr.model.GetAuthorizationTokenResult {
	  return com.amazonaws.services.ecr.model.GetAuthorizationTokenResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.GetAuthorizationTokenResult {
		return environment.ecr.getAuthorizationToken(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr get-authorization-token")
				.argument("registry-ids", registryIds?.toString())
	}

}


fun AmazonECRFunctions.getDownloadUrlForLayer(init: (AmazonECRGetDownloadUrlForLayerCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.GetDownloadUrlForLayerResult {
	return this.block.declare(AmazonECRGetDownloadUrlForLayerCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.GetDownloadUrlForLayerResult
}

@Generated
class AmazonECRGetDownloadUrlForLayerCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.GetDownloadUrlForLayerRequest, com.amazonaws.services.ecr.model.GetDownloadUrlForLayerResult> {

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

	
	override fun dryResult(): com.amazonaws.services.ecr.model.GetDownloadUrlForLayerResult {
	  return com.amazonaws.services.ecr.model.GetDownloadUrlForLayerResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.GetDownloadUrlForLayerResult {
		return environment.ecr.getDownloadUrlForLayer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr get-download-url-for-layer")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("layer-digest", layerDigest)
	}

}


fun AmazonECRFunctions.getLifecyclePolicy(init: (AmazonECRGetLifecyclePolicyCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.GetLifecyclePolicyResult {
	return this.block.declare(AmazonECRGetLifecyclePolicyCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.GetLifecyclePolicyResult
}

@Generated
class AmazonECRGetLifecyclePolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest, com.amazonaws.services.ecr.model.GetLifecyclePolicyResult> {

	var registryId: String? = null
	var repositoryName: String? = null

	override fun build(): com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest {
		val input = com.amazonaws.services.ecr.model.GetLifecyclePolicyRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecr.model.GetLifecyclePolicyResult {
	  return com.amazonaws.services.ecr.model.GetLifecyclePolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.GetLifecyclePolicyResult {
		return environment.ecr.getLifecyclePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr get-lifecycle-policy")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
	}

}


fun AmazonECRFunctions.getLifecyclePolicyPreview(init: (AmazonECRGetLifecyclePolicyPreviewCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewResult {
	return this.block.declare(AmazonECRGetLifecyclePolicyPreviewCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewResult
}

@Generated
class AmazonECRGetLifecyclePolicyPreviewCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewRequest, com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewResult> {

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

	
	override fun dryResult(): com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewResult {
	  return com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.GetLifecyclePolicyPreviewResult {
		return environment.ecr.getLifecyclePolicyPreview(build())
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


fun AmazonECRFunctions.getRepositoryPolicy(init: (AmazonECRGetRepositoryPolicyCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.GetRepositoryPolicyResult {
	return this.block.declare(AmazonECRGetRepositoryPolicyCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.GetRepositoryPolicyResult
}

@Generated
class AmazonECRGetRepositoryPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest, com.amazonaws.services.ecr.model.GetRepositoryPolicyResult> {

	var registryId: String? = null
	var repositoryName: String? = null

	override fun build(): com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest {
		val input = com.amazonaws.services.ecr.model.GetRepositoryPolicyRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecr.model.GetRepositoryPolicyResult {
	  return com.amazonaws.services.ecr.model.GetRepositoryPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.GetRepositoryPolicyResult {
		return environment.ecr.getRepositoryPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr get-repository-policy")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
	}

}


fun AmazonECRFunctions.initiateLayerUpload(init: (AmazonECRInitiateLayerUploadCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.InitiateLayerUploadResult {
	return this.block.declare(AmazonECRInitiateLayerUploadCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.InitiateLayerUploadResult
}

@Generated
class AmazonECRInitiateLayerUploadCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.InitiateLayerUploadRequest, com.amazonaws.services.ecr.model.InitiateLayerUploadResult> {

	var registryId: String? = null
	var repositoryName: String? = null

	override fun build(): com.amazonaws.services.ecr.model.InitiateLayerUploadRequest {
		val input = com.amazonaws.services.ecr.model.InitiateLayerUploadRequest()
		input.setRegistryId(this.registryId)
		input.setRepositoryName(this.repositoryName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecr.model.InitiateLayerUploadResult {
	  return com.amazonaws.services.ecr.model.InitiateLayerUploadResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.InitiateLayerUploadResult {
		return environment.ecr.initiateLayerUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr initiate-layer-upload")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
	}

}


fun AmazonECRFunctions.listImages(init: (AmazonECRListImagesCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.ListImagesResult {
	return this.block.declare(AmazonECRListImagesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.ListImagesResult
}

@Generated
class AmazonECRListImagesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.ListImagesRequest, com.amazonaws.services.ecr.model.ListImagesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.ecr.model.ListImagesResult {
	  return com.amazonaws.services.ecr.model.ListImagesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.ListImagesResult {
		return environment.ecr.listImages(build())
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


fun AmazonECRFunctions.putImage(init: (AmazonECRPutImageCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.PutImageResult {
	return this.block.declare(AmazonECRPutImageCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.PutImageResult
}

@Generated
class AmazonECRPutImageCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.PutImageRequest, com.amazonaws.services.ecr.model.PutImageResult> {

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

	
	override fun dryResult(): com.amazonaws.services.ecr.model.PutImageResult {
	  return com.amazonaws.services.ecr.model.PutImageResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.PutImageResult {
		return environment.ecr.putImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr put-image")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("image-manifest", imageManifest)
				.argument("image-tag", imageTag)
	}

}


fun AmazonECRFunctions.putLifecyclePolicy(init: (AmazonECRPutLifecyclePolicyCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.PutLifecyclePolicyResult {
	return this.block.declare(AmazonECRPutLifecyclePolicyCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.PutLifecyclePolicyResult
}

@Generated
class AmazonECRPutLifecyclePolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.PutLifecyclePolicyRequest, com.amazonaws.services.ecr.model.PutLifecyclePolicyResult> {

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

	
	override fun dryResult(): com.amazonaws.services.ecr.model.PutLifecyclePolicyResult {
	  return com.amazonaws.services.ecr.model.PutLifecyclePolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.PutLifecyclePolicyResult {
		return environment.ecr.putLifecyclePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr put-lifecycle-policy")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("lifecycle-policy-text", lifecyclePolicyText)
	}

}


fun AmazonECRFunctions.setRepositoryPolicy(init: (AmazonECRSetRepositoryPolicyCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.SetRepositoryPolicyResult {
	return this.block.declare(AmazonECRSetRepositoryPolicyCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.SetRepositoryPolicyResult
}

@Generated
class AmazonECRSetRepositoryPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.SetRepositoryPolicyRequest, com.amazonaws.services.ecr.model.SetRepositoryPolicyResult> {

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

	
	override fun dryResult(): com.amazonaws.services.ecr.model.SetRepositoryPolicyResult {
	  return com.amazonaws.services.ecr.model.SetRepositoryPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.SetRepositoryPolicyResult {
		return environment.ecr.setRepositoryPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr set-repository-policy")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("policy-text", policyText)
				.option("force", force ?: false)
	}

}


fun AmazonECRFunctions.startLifecyclePolicyPreview(init: (AmazonECRStartLifecyclePolicyPreviewCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewResult {
	return this.block.declare(AmazonECRStartLifecyclePolicyPreviewCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewResult
}

@Generated
class AmazonECRStartLifecyclePolicyPreviewCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewRequest, com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewResult> {

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

	
	override fun dryResult(): com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewResult {
	  return com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.StartLifecyclePolicyPreviewResult {
		return environment.ecr.startLifecyclePolicyPreview(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecr start-lifecycle-policy-preview")
				.argument("registry-id", registryId)
				.argument("repository-name", repositoryName)
				.argument("lifecycle-policy-text", lifecyclePolicyText)
	}

}


fun AmazonECRFunctions.uploadLayerPart(init: (AmazonECRUploadLayerPartCommand.() -> Unit)? = null): com.amazonaws.services.ecr.model.UploadLayerPartResult {
	return this.block.declare(AmazonECRUploadLayerPartCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.ecr.model.UploadLayerPartResult
}

@Generated
class AmazonECRUploadLayerPartCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecr.model.UploadLayerPartRequest, com.amazonaws.services.ecr.model.UploadLayerPartResult> {

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

	
	override fun dryResult(): com.amazonaws.services.ecr.model.UploadLayerPartResult {
	  return com.amazonaws.services.ecr.model.UploadLayerPartResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.ecr.model.UploadLayerPartResult {
		return environment.ecr.uploadLayerPart(build())
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
