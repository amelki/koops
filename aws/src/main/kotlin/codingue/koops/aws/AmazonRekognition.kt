
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.rekognition.*
import com.amazonaws.services.rekognition.model.*

var codingue.koops.core.Environment.rekognition: AmazonRekognition
	get() {
		var service = this.capabilities["aws-rekognition"]
		if (service == null) {
			service = AmazonRekognitionClientBuilder.standard().build()
			this.capabilities["aws-rekognition"] = service
		}
		return service as AmazonRekognition
	}
	set(rekognition) {
		this.capabilities["aws-rekognition"] = rekognition
	}

@Generated
class AmazonRekognitionFunctions(val block: Block)

infix fun <T> AwsContinuation.rekognition(init: AmazonRekognitionFunctions.() -> T): T {
	return AmazonRekognitionFunctions(shell).run(init)
}

			

fun AmazonRekognitionFunctions.compareFaces(sourceImage: com.amazonaws.services.rekognition.model.Image, targetImage: com.amazonaws.services.rekognition.model.Image, init: AmazonRekognitionCompareFacesCommand.() -> Unit): com.amazonaws.services.rekognition.model.CompareFacesResult {
	return this.block.declare(AmazonRekognitionCompareFacesCommand(sourceImage, targetImage).apply(init)) as com.amazonaws.services.rekognition.model.CompareFacesResult
}

@Generated
class AmazonRekognitionCompareFacesCommand(val sourceImage: com.amazonaws.services.rekognition.model.Image, val targetImage: com.amazonaws.services.rekognition.model.Image) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.CompareFacesRequest, com.amazonaws.services.rekognition.model.CompareFacesResult> {

	var similarityThreshold: Float? = 0f

	override fun build(): com.amazonaws.services.rekognition.model.CompareFacesRequest {
		val input = com.amazonaws.services.rekognition.model.CompareFacesRequest()
		input.setSourceImage(this.sourceImage)
		input.setTargetImage(this.targetImage)
		input.setSimilarityThreshold(this.similarityThreshold)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.CompareFacesResult {
	  return com.amazonaws.services.rekognition.model.CompareFacesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.CompareFacesResult {
		return environment.rekognition.compareFaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition compare-faces")
				.argument("source-image", sourceImage.toString())
				.argument("target-image", targetImage.toString())
				.argument("similarity-threshold", similarityThreshold?.toString())
	}

}


fun AmazonRekognitionFunctions.createCollection(collectionId: String, init: AmazonRekognitionCreateCollectionCommand.() -> Unit): com.amazonaws.services.rekognition.model.CreateCollectionResult {
	return this.block.declare(AmazonRekognitionCreateCollectionCommand(collectionId).apply(init)) as com.amazonaws.services.rekognition.model.CreateCollectionResult
}

@Generated
class AmazonRekognitionCreateCollectionCommand(val collectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.CreateCollectionRequest, com.amazonaws.services.rekognition.model.CreateCollectionResult> {



	override fun build(): com.amazonaws.services.rekognition.model.CreateCollectionRequest {
		val input = com.amazonaws.services.rekognition.model.CreateCollectionRequest()
		input.setCollectionId(this.collectionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.CreateCollectionResult {
	  return com.amazonaws.services.rekognition.model.CreateCollectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.CreateCollectionResult {
		return environment.rekognition.createCollection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition create-collection")
				.argument("collection-id", collectionId)
	}

}


fun AmazonRekognitionFunctions.createStreamProcessor(input: com.amazonaws.services.rekognition.model.StreamProcessorInput, output: com.amazonaws.services.rekognition.model.StreamProcessorOutput, name: String, settings: com.amazonaws.services.rekognition.model.StreamProcessorSettings, roleArn: String, init: AmazonRekognitionCreateStreamProcessorCommand.() -> Unit): com.amazonaws.services.rekognition.model.CreateStreamProcessorResult {
	return this.block.declare(AmazonRekognitionCreateStreamProcessorCommand(input, output, name, settings, roleArn).apply(init)) as com.amazonaws.services.rekognition.model.CreateStreamProcessorResult
}

@Generated
class AmazonRekognitionCreateStreamProcessorCommand(val input: com.amazonaws.services.rekognition.model.StreamProcessorInput, val output: com.amazonaws.services.rekognition.model.StreamProcessorOutput, val name: String, val settings: com.amazonaws.services.rekognition.model.StreamProcessorSettings, val roleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.CreateStreamProcessorRequest, com.amazonaws.services.rekognition.model.CreateStreamProcessorResult> {



	override fun build(): com.amazonaws.services.rekognition.model.CreateStreamProcessorRequest {
		val input = com.amazonaws.services.rekognition.model.CreateStreamProcessorRequest()
		input.setInput(this.input)
		input.setOutput(this.output)
		input.setName(this.name)
		input.setSettings(this.settings)
		input.setRoleArn(this.roleArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.CreateStreamProcessorResult {
	  return com.amazonaws.services.rekognition.model.CreateStreamProcessorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.CreateStreamProcessorResult {
		return environment.rekognition.createStreamProcessor(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition create-stream-processor")
				.argument("input", input.toString())
				.argument("output", output.toString())
				.argument("name", name)
				.argument("settings", settings.toString())
				.argument("role-arn", roleArn)
	}

}


fun AmazonRekognitionFunctions.deleteCollection(collectionId: String, init: AmazonRekognitionDeleteCollectionCommand.() -> Unit): com.amazonaws.services.rekognition.model.DeleteCollectionResult {
	return this.block.declare(AmazonRekognitionDeleteCollectionCommand(collectionId).apply(init)) as com.amazonaws.services.rekognition.model.DeleteCollectionResult
}

@Generated
class AmazonRekognitionDeleteCollectionCommand(val collectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.DeleteCollectionRequest, com.amazonaws.services.rekognition.model.DeleteCollectionResult> {



	override fun build(): com.amazonaws.services.rekognition.model.DeleteCollectionRequest {
		val input = com.amazonaws.services.rekognition.model.DeleteCollectionRequest()
		input.setCollectionId(this.collectionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.DeleteCollectionResult {
	  return com.amazonaws.services.rekognition.model.DeleteCollectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.DeleteCollectionResult {
		return environment.rekognition.deleteCollection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition delete-collection")
				.argument("collection-id", collectionId)
	}

}


fun AmazonRekognitionFunctions.deleteFaces(collectionId: String, faceIds: List<String>, init: AmazonRekognitionDeleteFacesCommand.() -> Unit): com.amazonaws.services.rekognition.model.DeleteFacesResult {
	return this.block.declare(AmazonRekognitionDeleteFacesCommand(collectionId, faceIds).apply(init)) as com.amazonaws.services.rekognition.model.DeleteFacesResult
}

@Generated
class AmazonRekognitionDeleteFacesCommand(val collectionId: String, val faceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.DeleteFacesRequest, com.amazonaws.services.rekognition.model.DeleteFacesResult> {



	override fun build(): com.amazonaws.services.rekognition.model.DeleteFacesRequest {
		val input = com.amazonaws.services.rekognition.model.DeleteFacesRequest()
		input.setCollectionId(this.collectionId)
		input.setFaceIds(this.faceIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.DeleteFacesResult {
	  return com.amazonaws.services.rekognition.model.DeleteFacesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.DeleteFacesResult {
		return environment.rekognition.deleteFaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition delete-faces")
				.argument("collection-id", collectionId)
				.argument("face-ids", faceIds.toString())
	}

}


fun AmazonRekognitionFunctions.deleteStreamProcessor(name: String, init: AmazonRekognitionDeleteStreamProcessorCommand.() -> Unit): com.amazonaws.services.rekognition.model.DeleteStreamProcessorResult {
	return this.block.declare(AmazonRekognitionDeleteStreamProcessorCommand(name).apply(init)) as com.amazonaws.services.rekognition.model.DeleteStreamProcessorResult
}

@Generated
class AmazonRekognitionDeleteStreamProcessorCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.DeleteStreamProcessorRequest, com.amazonaws.services.rekognition.model.DeleteStreamProcessorResult> {



	override fun build(): com.amazonaws.services.rekognition.model.DeleteStreamProcessorRequest {
		val input = com.amazonaws.services.rekognition.model.DeleteStreamProcessorRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.DeleteStreamProcessorResult {
	  return com.amazonaws.services.rekognition.model.DeleteStreamProcessorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.DeleteStreamProcessorResult {
		return environment.rekognition.deleteStreamProcessor(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition delete-stream-processor")
				.argument("name", name)
	}

}


fun AmazonRekognitionFunctions.describeStreamProcessor(name: String, init: AmazonRekognitionDescribeStreamProcessorCommand.() -> Unit): com.amazonaws.services.rekognition.model.DescribeStreamProcessorResult {
	return this.block.declare(AmazonRekognitionDescribeStreamProcessorCommand(name).apply(init)) as com.amazonaws.services.rekognition.model.DescribeStreamProcessorResult
}

@Generated
class AmazonRekognitionDescribeStreamProcessorCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.DescribeStreamProcessorRequest, com.amazonaws.services.rekognition.model.DescribeStreamProcessorResult> {



	override fun build(): com.amazonaws.services.rekognition.model.DescribeStreamProcessorRequest {
		val input = com.amazonaws.services.rekognition.model.DescribeStreamProcessorRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.DescribeStreamProcessorResult {
	  return com.amazonaws.services.rekognition.model.DescribeStreamProcessorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.DescribeStreamProcessorResult {
		return environment.rekognition.describeStreamProcessor(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition describe-stream-processor")
				.argument("name", name)
	}

}


fun AmazonRekognitionFunctions.detectFaces(image: com.amazonaws.services.rekognition.model.Image, init: AmazonRekognitionDetectFacesCommand.() -> Unit): com.amazonaws.services.rekognition.model.DetectFacesResult {
	return this.block.declare(AmazonRekognitionDetectFacesCommand(image).apply(init)) as com.amazonaws.services.rekognition.model.DetectFacesResult
}

@Generated
class AmazonRekognitionDetectFacesCommand(val image: com.amazonaws.services.rekognition.model.Image) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.DetectFacesRequest, com.amazonaws.services.rekognition.model.DetectFacesResult> {

	var attributes: List<Attribute>? = null

	override fun build(): com.amazonaws.services.rekognition.model.DetectFacesRequest {
		val input = com.amazonaws.services.rekognition.model.DetectFacesRequest()
		input.setImage(this.image)
		input.setAttributes(this.attributes?.map { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.DetectFacesResult {
	  return com.amazonaws.services.rekognition.model.DetectFacesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.DetectFacesResult {
		return environment.rekognition.detectFaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition detect-faces")
				.argument("image", image.toString())
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonRekognitionFunctions.detectLabels(image: com.amazonaws.services.rekognition.model.Image, init: AmazonRekognitionDetectLabelsCommand.() -> Unit): com.amazonaws.services.rekognition.model.DetectLabelsResult {
	return this.block.declare(AmazonRekognitionDetectLabelsCommand(image).apply(init)) as com.amazonaws.services.rekognition.model.DetectLabelsResult
}

@Generated
class AmazonRekognitionDetectLabelsCommand(val image: com.amazonaws.services.rekognition.model.Image) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.DetectLabelsRequest, com.amazonaws.services.rekognition.model.DetectLabelsResult> {

	var maxLabels: Int? = 0
	var minConfidence: Float? = 0f

	override fun build(): com.amazonaws.services.rekognition.model.DetectLabelsRequest {
		val input = com.amazonaws.services.rekognition.model.DetectLabelsRequest()
		input.setImage(this.image)
		input.setMaxLabels(this.maxLabels)
		input.setMinConfidence(this.minConfidence)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.DetectLabelsResult {
	  return com.amazonaws.services.rekognition.model.DetectLabelsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.DetectLabelsResult {
		return environment.rekognition.detectLabels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition detect-labels")
				.argument("image", image.toString())
				.argument("max-labels", maxLabels?.toString())
				.argument("min-confidence", minConfidence?.toString())
	}

}


fun AmazonRekognitionFunctions.detectModerationLabels(image: com.amazonaws.services.rekognition.model.Image, init: AmazonRekognitionDetectModerationLabelsCommand.() -> Unit): com.amazonaws.services.rekognition.model.DetectModerationLabelsResult {
	return this.block.declare(AmazonRekognitionDetectModerationLabelsCommand(image).apply(init)) as com.amazonaws.services.rekognition.model.DetectModerationLabelsResult
}

@Generated
class AmazonRekognitionDetectModerationLabelsCommand(val image: com.amazonaws.services.rekognition.model.Image) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.DetectModerationLabelsRequest, com.amazonaws.services.rekognition.model.DetectModerationLabelsResult> {

	var minConfidence: Float? = 0f

	override fun build(): com.amazonaws.services.rekognition.model.DetectModerationLabelsRequest {
		val input = com.amazonaws.services.rekognition.model.DetectModerationLabelsRequest()
		input.setImage(this.image)
		input.setMinConfidence(this.minConfidence)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.DetectModerationLabelsResult {
	  return com.amazonaws.services.rekognition.model.DetectModerationLabelsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.DetectModerationLabelsResult {
		return environment.rekognition.detectModerationLabels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition detect-moderation-labels")
				.argument("image", image.toString())
				.argument("min-confidence", minConfidence?.toString())
	}

}


fun AmazonRekognitionFunctions.detectText(image: com.amazonaws.services.rekognition.model.Image, init: AmazonRekognitionDetectTextCommand.() -> Unit): com.amazonaws.services.rekognition.model.DetectTextResult {
	return this.block.declare(AmazonRekognitionDetectTextCommand(image).apply(init)) as com.amazonaws.services.rekognition.model.DetectTextResult
}

@Generated
class AmazonRekognitionDetectTextCommand(val image: com.amazonaws.services.rekognition.model.Image) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.DetectTextRequest, com.amazonaws.services.rekognition.model.DetectTextResult> {



	override fun build(): com.amazonaws.services.rekognition.model.DetectTextRequest {
		val input = com.amazonaws.services.rekognition.model.DetectTextRequest()
		input.setImage(this.image)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.DetectTextResult {
	  return com.amazonaws.services.rekognition.model.DetectTextResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.DetectTextResult {
		return environment.rekognition.detectText(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition detect-text")
				.argument("image", image.toString())
	}

}


fun AmazonRekognitionFunctions.getCelebrityInfo(id: String, init: AmazonRekognitionGetCelebrityInfoCommand.() -> Unit): com.amazonaws.services.rekognition.model.GetCelebrityInfoResult {
	return this.block.declare(AmazonRekognitionGetCelebrityInfoCommand(id).apply(init)) as com.amazonaws.services.rekognition.model.GetCelebrityInfoResult
}

@Generated
class AmazonRekognitionGetCelebrityInfoCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.GetCelebrityInfoRequest, com.amazonaws.services.rekognition.model.GetCelebrityInfoResult> {



	override fun build(): com.amazonaws.services.rekognition.model.GetCelebrityInfoRequest {
		val input = com.amazonaws.services.rekognition.model.GetCelebrityInfoRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.GetCelebrityInfoResult {
	  return com.amazonaws.services.rekognition.model.GetCelebrityInfoResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.GetCelebrityInfoResult {
		return environment.rekognition.getCelebrityInfo(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition get-celebrity-info")
				.argument("id", id)
	}

}


fun AmazonRekognitionFunctions.getCelebrityRecognition(jobId: String, init: AmazonRekognitionGetCelebrityRecognitionCommand.() -> Unit): com.amazonaws.services.rekognition.model.GetCelebrityRecognitionResult {
	return this.block.declare(AmazonRekognitionGetCelebrityRecognitionCommand(jobId).apply(init)) as com.amazonaws.services.rekognition.model.GetCelebrityRecognitionResult
}

@Generated
class AmazonRekognitionGetCelebrityRecognitionCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.GetCelebrityRecognitionRequest, com.amazonaws.services.rekognition.model.GetCelebrityRecognitionResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null
	var sortBy: CelebrityRecognitionSortBy? = null

	override fun build(): com.amazonaws.services.rekognition.model.GetCelebrityRecognitionRequest {
		val input = com.amazonaws.services.rekognition.model.GetCelebrityRecognitionRequest()
		input.setJobId(this.jobId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setSortBy(this.sortBy?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.GetCelebrityRecognitionResult {
	  return com.amazonaws.services.rekognition.model.GetCelebrityRecognitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.GetCelebrityRecognitionResult {
		return environment.rekognition.getCelebrityRecognition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition get-celebrity-recognition")
				.argument("job-id", jobId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("sort-by", sortBy?.toString())
	}

}


fun AmazonRekognitionFunctions.getContentModeration(jobId: String, init: AmazonRekognitionGetContentModerationCommand.() -> Unit): com.amazonaws.services.rekognition.model.GetContentModerationResult {
	return this.block.declare(AmazonRekognitionGetContentModerationCommand(jobId).apply(init)) as com.amazonaws.services.rekognition.model.GetContentModerationResult
}

@Generated
class AmazonRekognitionGetContentModerationCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.GetContentModerationRequest, com.amazonaws.services.rekognition.model.GetContentModerationResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null
	var sortBy: ContentModerationSortBy? = null

	override fun build(): com.amazonaws.services.rekognition.model.GetContentModerationRequest {
		val input = com.amazonaws.services.rekognition.model.GetContentModerationRequest()
		input.setJobId(this.jobId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setSortBy(this.sortBy?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.GetContentModerationResult {
	  return com.amazonaws.services.rekognition.model.GetContentModerationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.GetContentModerationResult {
		return environment.rekognition.getContentModeration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition get-content-moderation")
				.argument("job-id", jobId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("sort-by", sortBy?.toString())
	}

}


fun AmazonRekognitionFunctions.getFaceDetection(jobId: String, init: AmazonRekognitionGetFaceDetectionCommand.() -> Unit): com.amazonaws.services.rekognition.model.GetFaceDetectionResult {
	return this.block.declare(AmazonRekognitionGetFaceDetectionCommand(jobId).apply(init)) as com.amazonaws.services.rekognition.model.GetFaceDetectionResult
}

@Generated
class AmazonRekognitionGetFaceDetectionCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.GetFaceDetectionRequest, com.amazonaws.services.rekognition.model.GetFaceDetectionResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.rekognition.model.GetFaceDetectionRequest {
		val input = com.amazonaws.services.rekognition.model.GetFaceDetectionRequest()
		input.setJobId(this.jobId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.GetFaceDetectionResult {
	  return com.amazonaws.services.rekognition.model.GetFaceDetectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.GetFaceDetectionResult {
		return environment.rekognition.getFaceDetection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition get-face-detection")
				.argument("job-id", jobId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonRekognitionFunctions.getFaceSearch(jobId: String, init: AmazonRekognitionGetFaceSearchCommand.() -> Unit): com.amazonaws.services.rekognition.model.GetFaceSearchResult {
	return this.block.declare(AmazonRekognitionGetFaceSearchCommand(jobId).apply(init)) as com.amazonaws.services.rekognition.model.GetFaceSearchResult
}

@Generated
class AmazonRekognitionGetFaceSearchCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.GetFaceSearchRequest, com.amazonaws.services.rekognition.model.GetFaceSearchResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null
	var sortBy: FaceSearchSortBy? = null

	override fun build(): com.amazonaws.services.rekognition.model.GetFaceSearchRequest {
		val input = com.amazonaws.services.rekognition.model.GetFaceSearchRequest()
		input.setJobId(this.jobId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setSortBy(this.sortBy?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.GetFaceSearchResult {
	  return com.amazonaws.services.rekognition.model.GetFaceSearchResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.GetFaceSearchResult {
		return environment.rekognition.getFaceSearch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition get-face-search")
				.argument("job-id", jobId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("sort-by", sortBy?.toString())
	}

}


fun AmazonRekognitionFunctions.getLabelDetection(jobId: String, init: AmazonRekognitionGetLabelDetectionCommand.() -> Unit): com.amazonaws.services.rekognition.model.GetLabelDetectionResult {
	return this.block.declare(AmazonRekognitionGetLabelDetectionCommand(jobId).apply(init)) as com.amazonaws.services.rekognition.model.GetLabelDetectionResult
}

@Generated
class AmazonRekognitionGetLabelDetectionCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.GetLabelDetectionRequest, com.amazonaws.services.rekognition.model.GetLabelDetectionResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null
	var sortBy: LabelDetectionSortBy? = null

	override fun build(): com.amazonaws.services.rekognition.model.GetLabelDetectionRequest {
		val input = com.amazonaws.services.rekognition.model.GetLabelDetectionRequest()
		input.setJobId(this.jobId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setSortBy(this.sortBy?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.GetLabelDetectionResult {
	  return com.amazonaws.services.rekognition.model.GetLabelDetectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.GetLabelDetectionResult {
		return environment.rekognition.getLabelDetection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition get-label-detection")
				.argument("job-id", jobId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("sort-by", sortBy?.toString())
	}

}


fun AmazonRekognitionFunctions.getPersonTracking(jobId: String, init: AmazonRekognitionGetPersonTrackingCommand.() -> Unit): com.amazonaws.services.rekognition.model.GetPersonTrackingResult {
	return this.block.declare(AmazonRekognitionGetPersonTrackingCommand(jobId).apply(init)) as com.amazonaws.services.rekognition.model.GetPersonTrackingResult
}

@Generated
class AmazonRekognitionGetPersonTrackingCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.GetPersonTrackingRequest, com.amazonaws.services.rekognition.model.GetPersonTrackingResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null
	var sortBy: PersonTrackingSortBy? = null

	override fun build(): com.amazonaws.services.rekognition.model.GetPersonTrackingRequest {
		val input = com.amazonaws.services.rekognition.model.GetPersonTrackingRequest()
		input.setJobId(this.jobId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setSortBy(this.sortBy?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.GetPersonTrackingResult {
	  return com.amazonaws.services.rekognition.model.GetPersonTrackingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.GetPersonTrackingResult {
		return environment.rekognition.getPersonTracking(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition get-person-tracking")
				.argument("job-id", jobId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("sort-by", sortBy?.toString())
	}

}


fun AmazonRekognitionFunctions.indexFaces(collectionId: String, image: com.amazonaws.services.rekognition.model.Image, init: AmazonRekognitionIndexFacesCommand.() -> Unit): com.amazonaws.services.rekognition.model.IndexFacesResult {
	return this.block.declare(AmazonRekognitionIndexFacesCommand(collectionId, image).apply(init)) as com.amazonaws.services.rekognition.model.IndexFacesResult
}

@Generated
class AmazonRekognitionIndexFacesCommand(val collectionId: String, val image: com.amazonaws.services.rekognition.model.Image) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.IndexFacesRequest, com.amazonaws.services.rekognition.model.IndexFacesResult> {

	var externalImageId: String? = null
	var detectionAttributes: List<Attribute>? = null

	override fun build(): com.amazonaws.services.rekognition.model.IndexFacesRequest {
		val input = com.amazonaws.services.rekognition.model.IndexFacesRequest()
		input.setCollectionId(this.collectionId)
		input.setImage(this.image)
		input.setExternalImageId(this.externalImageId)
		input.setDetectionAttributes(this.detectionAttributes?.map { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.IndexFacesResult {
	  return com.amazonaws.services.rekognition.model.IndexFacesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.IndexFacesResult {
		return environment.rekognition.indexFaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition index-faces")
				.argument("collection-id", collectionId)
				.argument("image", image.toString())
				.argument("external-image-id", externalImageId)
				.argument("detection-attributes", detectionAttributes?.toString())
	}

}


fun AmazonRekognitionFunctions.listCollections(init: AmazonRekognitionListCollectionsCommand.() -> Unit): com.amazonaws.services.rekognition.model.ListCollectionsResult {
	return this.block.declare(AmazonRekognitionListCollectionsCommand().apply(init)) as com.amazonaws.services.rekognition.model.ListCollectionsResult
}

@Generated
class AmazonRekognitionListCollectionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.ListCollectionsRequest, com.amazonaws.services.rekognition.model.ListCollectionsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.rekognition.model.ListCollectionsRequest {
		val input = com.amazonaws.services.rekognition.model.ListCollectionsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.ListCollectionsResult {
	  return com.amazonaws.services.rekognition.model.ListCollectionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.ListCollectionsResult {
		return environment.rekognition.listCollections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition list-collections")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonRekognitionFunctions.listFaces(collectionId: String, init: AmazonRekognitionListFacesCommand.() -> Unit): com.amazonaws.services.rekognition.model.ListFacesResult {
	return this.block.declare(AmazonRekognitionListFacesCommand(collectionId).apply(init)) as com.amazonaws.services.rekognition.model.ListFacesResult
}

@Generated
class AmazonRekognitionListFacesCommand(val collectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.ListFacesRequest, com.amazonaws.services.rekognition.model.ListFacesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.rekognition.model.ListFacesRequest {
		val input = com.amazonaws.services.rekognition.model.ListFacesRequest()
		input.setCollectionId(this.collectionId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.ListFacesResult {
	  return com.amazonaws.services.rekognition.model.ListFacesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.ListFacesResult {
		return environment.rekognition.listFaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition list-faces")
				.argument("collection-id", collectionId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonRekognitionFunctions.listStreamProcessors(init: AmazonRekognitionListStreamProcessorsCommand.() -> Unit): com.amazonaws.services.rekognition.model.ListStreamProcessorsResult {
	return this.block.declare(AmazonRekognitionListStreamProcessorsCommand().apply(init)) as com.amazonaws.services.rekognition.model.ListStreamProcessorsResult
}

@Generated
class AmazonRekognitionListStreamProcessorsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.ListStreamProcessorsRequest, com.amazonaws.services.rekognition.model.ListStreamProcessorsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.rekognition.model.ListStreamProcessorsRequest {
		val input = com.amazonaws.services.rekognition.model.ListStreamProcessorsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.ListStreamProcessorsResult {
	  return com.amazonaws.services.rekognition.model.ListStreamProcessorsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.ListStreamProcessorsResult {
		return environment.rekognition.listStreamProcessors(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition list-stream-processors")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonRekognitionFunctions.recognizeCelebrities(image: com.amazonaws.services.rekognition.model.Image, init: AmazonRekognitionRecognizeCelebritiesCommand.() -> Unit): com.amazonaws.services.rekognition.model.RecognizeCelebritiesResult {
	return this.block.declare(AmazonRekognitionRecognizeCelebritiesCommand(image).apply(init)) as com.amazonaws.services.rekognition.model.RecognizeCelebritiesResult
}

@Generated
class AmazonRekognitionRecognizeCelebritiesCommand(val image: com.amazonaws.services.rekognition.model.Image) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.RecognizeCelebritiesRequest, com.amazonaws.services.rekognition.model.RecognizeCelebritiesResult> {



	override fun build(): com.amazonaws.services.rekognition.model.RecognizeCelebritiesRequest {
		val input = com.amazonaws.services.rekognition.model.RecognizeCelebritiesRequest()
		input.setImage(this.image)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.RecognizeCelebritiesResult {
	  return com.amazonaws.services.rekognition.model.RecognizeCelebritiesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.RecognizeCelebritiesResult {
		return environment.rekognition.recognizeCelebrities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition recognize-celebrities")
				.argument("image", image.toString())
	}

}


fun AmazonRekognitionFunctions.searchFaces(collectionId: String, faceId: String, init: AmazonRekognitionSearchFacesCommand.() -> Unit): com.amazonaws.services.rekognition.model.SearchFacesResult {
	return this.block.declare(AmazonRekognitionSearchFacesCommand(collectionId, faceId).apply(init)) as com.amazonaws.services.rekognition.model.SearchFacesResult
}

@Generated
class AmazonRekognitionSearchFacesCommand(val collectionId: String, val faceId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.SearchFacesRequest, com.amazonaws.services.rekognition.model.SearchFacesResult> {

	var maxFaces: Int? = 0
	var faceMatchThreshold: Float? = 0f

	override fun build(): com.amazonaws.services.rekognition.model.SearchFacesRequest {
		val input = com.amazonaws.services.rekognition.model.SearchFacesRequest()
		input.setCollectionId(this.collectionId)
		input.setFaceId(this.faceId)
		input.setMaxFaces(this.maxFaces)
		input.setFaceMatchThreshold(this.faceMatchThreshold)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.SearchFacesResult {
	  return com.amazonaws.services.rekognition.model.SearchFacesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.SearchFacesResult {
		return environment.rekognition.searchFaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition search-faces")
				.argument("collection-id", collectionId)
				.argument("face-id", faceId)
				.argument("max-faces", maxFaces?.toString())
				.argument("face-match-threshold", faceMatchThreshold?.toString())
	}

}


fun AmazonRekognitionFunctions.searchFacesByImage(collectionId: String, image: com.amazonaws.services.rekognition.model.Image, init: AmazonRekognitionSearchFacesByImageCommand.() -> Unit): com.amazonaws.services.rekognition.model.SearchFacesByImageResult {
	return this.block.declare(AmazonRekognitionSearchFacesByImageCommand(collectionId, image).apply(init)) as com.amazonaws.services.rekognition.model.SearchFacesByImageResult
}

@Generated
class AmazonRekognitionSearchFacesByImageCommand(val collectionId: String, val image: com.amazonaws.services.rekognition.model.Image) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.SearchFacesByImageRequest, com.amazonaws.services.rekognition.model.SearchFacesByImageResult> {

	var maxFaces: Int? = 0
	var faceMatchThreshold: Float? = 0f

	override fun build(): com.amazonaws.services.rekognition.model.SearchFacesByImageRequest {
		val input = com.amazonaws.services.rekognition.model.SearchFacesByImageRequest()
		input.setCollectionId(this.collectionId)
		input.setImage(this.image)
		input.setMaxFaces(this.maxFaces)
		input.setFaceMatchThreshold(this.faceMatchThreshold)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.SearchFacesByImageResult {
	  return com.amazonaws.services.rekognition.model.SearchFacesByImageResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.SearchFacesByImageResult {
		return environment.rekognition.searchFacesByImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition search-faces-by-image")
				.argument("collection-id", collectionId)
				.argument("image", image.toString())
				.argument("max-faces", maxFaces?.toString())
				.argument("face-match-threshold", faceMatchThreshold?.toString())
	}

}


fun AmazonRekognitionFunctions.startCelebrityRecognition(video: com.amazonaws.services.rekognition.model.Video, init: AmazonRekognitionStartCelebrityRecognitionCommand.() -> Unit): com.amazonaws.services.rekognition.model.StartCelebrityRecognitionResult {
	return this.block.declare(AmazonRekognitionStartCelebrityRecognitionCommand(video).apply(init)) as com.amazonaws.services.rekognition.model.StartCelebrityRecognitionResult
}

@Generated
class AmazonRekognitionStartCelebrityRecognitionCommand(val video: com.amazonaws.services.rekognition.model.Video) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.StartCelebrityRecognitionRequest, com.amazonaws.services.rekognition.model.StartCelebrityRecognitionResult> {

	var clientRequestToken: String? = null
	var notificationChannel: com.amazonaws.services.rekognition.model.NotificationChannel? = null
	var jobTag: String? = null

	override fun build(): com.amazonaws.services.rekognition.model.StartCelebrityRecognitionRequest {
		val input = com.amazonaws.services.rekognition.model.StartCelebrityRecognitionRequest()
		input.setVideo(this.video)
		input.setClientRequestToken(this.clientRequestToken)
		input.setNotificationChannel(this.notificationChannel)
		input.setJobTag(this.jobTag)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.StartCelebrityRecognitionResult {
	  return com.amazonaws.services.rekognition.model.StartCelebrityRecognitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.StartCelebrityRecognitionResult {
		return environment.rekognition.startCelebrityRecognition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition start-celebrity-recognition")
				.argument("video", video.toString())
				.argument("client-request-token", clientRequestToken)
				.argument("notification-channel", notificationChannel?.toString())
				.argument("job-tag", jobTag)
	}

}


fun AmazonRekognitionFunctions.startContentModeration(video: com.amazonaws.services.rekognition.model.Video, init: AmazonRekognitionStartContentModerationCommand.() -> Unit): com.amazonaws.services.rekognition.model.StartContentModerationResult {
	return this.block.declare(AmazonRekognitionStartContentModerationCommand(video).apply(init)) as com.amazonaws.services.rekognition.model.StartContentModerationResult
}

@Generated
class AmazonRekognitionStartContentModerationCommand(val video: com.amazonaws.services.rekognition.model.Video) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.StartContentModerationRequest, com.amazonaws.services.rekognition.model.StartContentModerationResult> {

	var minConfidence: Float? = 0f
	var clientRequestToken: String? = null
	var notificationChannel: com.amazonaws.services.rekognition.model.NotificationChannel? = null
	var jobTag: String? = null

	override fun build(): com.amazonaws.services.rekognition.model.StartContentModerationRequest {
		val input = com.amazonaws.services.rekognition.model.StartContentModerationRequest()
		input.setVideo(this.video)
		input.setMinConfidence(this.minConfidence)
		input.setClientRequestToken(this.clientRequestToken)
		input.setNotificationChannel(this.notificationChannel)
		input.setJobTag(this.jobTag)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.StartContentModerationResult {
	  return com.amazonaws.services.rekognition.model.StartContentModerationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.StartContentModerationResult {
		return environment.rekognition.startContentModeration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition start-content-moderation")
				.argument("video", video.toString())
				.argument("min-confidence", minConfidence?.toString())
				.argument("client-request-token", clientRequestToken)
				.argument("notification-channel", notificationChannel?.toString())
				.argument("job-tag", jobTag)
	}

}


fun AmazonRekognitionFunctions.startFaceDetection(video: com.amazonaws.services.rekognition.model.Video, init: AmazonRekognitionStartFaceDetectionCommand.() -> Unit): com.amazonaws.services.rekognition.model.StartFaceDetectionResult {
	return this.block.declare(AmazonRekognitionStartFaceDetectionCommand(video).apply(init)) as com.amazonaws.services.rekognition.model.StartFaceDetectionResult
}

@Generated
class AmazonRekognitionStartFaceDetectionCommand(val video: com.amazonaws.services.rekognition.model.Video) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.StartFaceDetectionRequest, com.amazonaws.services.rekognition.model.StartFaceDetectionResult> {

	var clientRequestToken: String? = null
	var notificationChannel: com.amazonaws.services.rekognition.model.NotificationChannel? = null
	var faceAttributes: FaceAttributes? = null
	var jobTag: String? = null

	override fun build(): com.amazonaws.services.rekognition.model.StartFaceDetectionRequest {
		val input = com.amazonaws.services.rekognition.model.StartFaceDetectionRequest()
		input.setVideo(this.video)
		input.setClientRequestToken(this.clientRequestToken)
		input.setNotificationChannel(this.notificationChannel)
		input.setFaceAttributes(this.faceAttributes?.toString())
		input.setJobTag(this.jobTag)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.StartFaceDetectionResult {
	  return com.amazonaws.services.rekognition.model.StartFaceDetectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.StartFaceDetectionResult {
		return environment.rekognition.startFaceDetection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition start-face-detection")
				.argument("video", video.toString())
				.argument("client-request-token", clientRequestToken)
				.argument("notification-channel", notificationChannel?.toString())
				.argument("face-attributes", faceAttributes?.toString())
				.argument("job-tag", jobTag)
	}

}


fun AmazonRekognitionFunctions.startFaceSearch(video: com.amazonaws.services.rekognition.model.Video, collectionId: String, init: AmazonRekognitionStartFaceSearchCommand.() -> Unit): com.amazonaws.services.rekognition.model.StartFaceSearchResult {
	return this.block.declare(AmazonRekognitionStartFaceSearchCommand(video, collectionId).apply(init)) as com.amazonaws.services.rekognition.model.StartFaceSearchResult
}

@Generated
class AmazonRekognitionStartFaceSearchCommand(val video: com.amazonaws.services.rekognition.model.Video, val collectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.StartFaceSearchRequest, com.amazonaws.services.rekognition.model.StartFaceSearchResult> {

	var clientRequestToken: String? = null
	var faceMatchThreshold: Float? = 0f
	var notificationChannel: com.amazonaws.services.rekognition.model.NotificationChannel? = null
	var jobTag: String? = null

	override fun build(): com.amazonaws.services.rekognition.model.StartFaceSearchRequest {
		val input = com.amazonaws.services.rekognition.model.StartFaceSearchRequest()
		input.setVideo(this.video)
		input.setClientRequestToken(this.clientRequestToken)
		input.setFaceMatchThreshold(this.faceMatchThreshold)
		input.setCollectionId(this.collectionId)
		input.setNotificationChannel(this.notificationChannel)
		input.setJobTag(this.jobTag)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.StartFaceSearchResult {
	  return com.amazonaws.services.rekognition.model.StartFaceSearchResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.StartFaceSearchResult {
		return environment.rekognition.startFaceSearch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition start-face-search")
				.argument("video", video.toString())
				.argument("client-request-token", clientRequestToken)
				.argument("face-match-threshold", faceMatchThreshold?.toString())
				.argument("collection-id", collectionId)
				.argument("notification-channel", notificationChannel?.toString())
				.argument("job-tag", jobTag)
	}

}


fun AmazonRekognitionFunctions.startLabelDetection(video: com.amazonaws.services.rekognition.model.Video, init: AmazonRekognitionStartLabelDetectionCommand.() -> Unit): com.amazonaws.services.rekognition.model.StartLabelDetectionResult {
	return this.block.declare(AmazonRekognitionStartLabelDetectionCommand(video).apply(init)) as com.amazonaws.services.rekognition.model.StartLabelDetectionResult
}

@Generated
class AmazonRekognitionStartLabelDetectionCommand(val video: com.amazonaws.services.rekognition.model.Video) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.StartLabelDetectionRequest, com.amazonaws.services.rekognition.model.StartLabelDetectionResult> {

	var clientRequestToken: String? = null
	var minConfidence: Float? = 0f
	var notificationChannel: com.amazonaws.services.rekognition.model.NotificationChannel? = null
	var jobTag: String? = null

	override fun build(): com.amazonaws.services.rekognition.model.StartLabelDetectionRequest {
		val input = com.amazonaws.services.rekognition.model.StartLabelDetectionRequest()
		input.setVideo(this.video)
		input.setClientRequestToken(this.clientRequestToken)
		input.setMinConfidence(this.minConfidence)
		input.setNotificationChannel(this.notificationChannel)
		input.setJobTag(this.jobTag)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.StartLabelDetectionResult {
	  return com.amazonaws.services.rekognition.model.StartLabelDetectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.StartLabelDetectionResult {
		return environment.rekognition.startLabelDetection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition start-label-detection")
				.argument("video", video.toString())
				.argument("client-request-token", clientRequestToken)
				.argument("min-confidence", minConfidence?.toString())
				.argument("notification-channel", notificationChannel?.toString())
				.argument("job-tag", jobTag)
	}

}


fun AmazonRekognitionFunctions.startPersonTracking(video: com.amazonaws.services.rekognition.model.Video, init: AmazonRekognitionStartPersonTrackingCommand.() -> Unit): com.amazonaws.services.rekognition.model.StartPersonTrackingResult {
	return this.block.declare(AmazonRekognitionStartPersonTrackingCommand(video).apply(init)) as com.amazonaws.services.rekognition.model.StartPersonTrackingResult
}

@Generated
class AmazonRekognitionStartPersonTrackingCommand(val video: com.amazonaws.services.rekognition.model.Video) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.StartPersonTrackingRequest, com.amazonaws.services.rekognition.model.StartPersonTrackingResult> {

	var clientRequestToken: String? = null
	var notificationChannel: com.amazonaws.services.rekognition.model.NotificationChannel? = null
	var jobTag: String? = null

	override fun build(): com.amazonaws.services.rekognition.model.StartPersonTrackingRequest {
		val input = com.amazonaws.services.rekognition.model.StartPersonTrackingRequest()
		input.setVideo(this.video)
		input.setClientRequestToken(this.clientRequestToken)
		input.setNotificationChannel(this.notificationChannel)
		input.setJobTag(this.jobTag)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.StartPersonTrackingResult {
	  return com.amazonaws.services.rekognition.model.StartPersonTrackingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.StartPersonTrackingResult {
		return environment.rekognition.startPersonTracking(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition start-person-tracking")
				.argument("video", video.toString())
				.argument("client-request-token", clientRequestToken)
				.argument("notification-channel", notificationChannel?.toString())
				.argument("job-tag", jobTag)
	}

}


fun AmazonRekognitionFunctions.startStreamProcessor(name: String, init: AmazonRekognitionStartStreamProcessorCommand.() -> Unit): com.amazonaws.services.rekognition.model.StartStreamProcessorResult {
	return this.block.declare(AmazonRekognitionStartStreamProcessorCommand(name).apply(init)) as com.amazonaws.services.rekognition.model.StartStreamProcessorResult
}

@Generated
class AmazonRekognitionStartStreamProcessorCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.StartStreamProcessorRequest, com.amazonaws.services.rekognition.model.StartStreamProcessorResult> {



	override fun build(): com.amazonaws.services.rekognition.model.StartStreamProcessorRequest {
		val input = com.amazonaws.services.rekognition.model.StartStreamProcessorRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.StartStreamProcessorResult {
	  return com.amazonaws.services.rekognition.model.StartStreamProcessorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.StartStreamProcessorResult {
		return environment.rekognition.startStreamProcessor(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition start-stream-processor")
				.argument("name", name)
	}

}


fun AmazonRekognitionFunctions.stopStreamProcessor(name: String, init: AmazonRekognitionStopStreamProcessorCommand.() -> Unit): com.amazonaws.services.rekognition.model.StopStreamProcessorResult {
	return this.block.declare(AmazonRekognitionStopStreamProcessorCommand(name).apply(init)) as com.amazonaws.services.rekognition.model.StopStreamProcessorResult
}

@Generated
class AmazonRekognitionStopStreamProcessorCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.StopStreamProcessorRequest, com.amazonaws.services.rekognition.model.StopStreamProcessorResult> {



	override fun build(): com.amazonaws.services.rekognition.model.StopStreamProcessorRequest {
		val input = com.amazonaws.services.rekognition.model.StopStreamProcessorRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.rekognition.model.StopStreamProcessorResult {
	  return com.amazonaws.services.rekognition.model.StopStreamProcessorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.rekognition.model.StopStreamProcessorResult {
		return environment.rekognition.stopStreamProcessor(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition stop-stream-processor")
				.argument("name", name)
	}

}
