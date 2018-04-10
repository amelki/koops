
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.rekognition.AmazonRekognition
import com.amazonaws.services.rekognition.model.*

var codingue.koops.core.Environment.rekognition: AmazonRekognition
	get() = this.capabilities[AmazonRekognition::class.java.name] as AmazonRekognition
	set(rekognition) {
		this.capabilities[AmazonRekognition::class.java.name] = rekognition
	}

@Generated
class AmazonRekognitionFunctions(val block: Block)

infix fun AwsContinuation.rekognition(init: AmazonRekognitionFunctions.() -> Unit) {
	AmazonRekognitionFunctions(shell).apply(init)
}

			

fun AmazonRekognitionFunctions.compareFaces(sourceImage: com.amazonaws.services.rekognition.model.Image, targetImage: com.amazonaws.services.rekognition.model.Image, init: AmazonRekognitionCompareFacesCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionCompareFacesCommand(sourceImage, targetImage).apply(init))
}

@Generated
class AmazonRekognitionCompareFacesCommand(val sourceImage: com.amazonaws.services.rekognition.model.Image, val targetImage: com.amazonaws.services.rekognition.model.Image) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.CompareFacesRequest> {

	var similarityThreshold: Float? = 0f

	override fun build(): com.amazonaws.services.rekognition.model.CompareFacesRequest {
		val input = com.amazonaws.services.rekognition.model.CompareFacesRequest()
		input.setSourceImage(this.sourceImage)
		input.setTargetImage(this.targetImage)
		input.setSimilarityThreshold(this.similarityThreshold)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.compareFaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition compare-faces")
				.argument("source-image", sourceImage.toString())
				.argument("target-image", targetImage.toString())
				.argument("similarity-threshold", similarityThreshold?.toString())
	}

}


fun AmazonRekognitionFunctions.createCollection(collectionId: String, init: AmazonRekognitionCreateCollectionCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionCreateCollectionCommand(collectionId).apply(init))
}

@Generated
class AmazonRekognitionCreateCollectionCommand(val collectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.CreateCollectionRequest> {



	override fun build(): com.amazonaws.services.rekognition.model.CreateCollectionRequest {
		val input = com.amazonaws.services.rekognition.model.CreateCollectionRequest()
		input.setCollectionId(this.collectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.createCollection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition create-collection")
				.argument("collection-id", collectionId)
	}

}


fun AmazonRekognitionFunctions.createStreamProcessor(input: com.amazonaws.services.rekognition.model.StreamProcessorInput, output: com.amazonaws.services.rekognition.model.StreamProcessorOutput, name: String, settings: com.amazonaws.services.rekognition.model.StreamProcessorSettings, roleArn: String, init: AmazonRekognitionCreateStreamProcessorCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionCreateStreamProcessorCommand(input, output, name, settings, roleArn).apply(init))
}

@Generated
class AmazonRekognitionCreateStreamProcessorCommand(val input: com.amazonaws.services.rekognition.model.StreamProcessorInput, val output: com.amazonaws.services.rekognition.model.StreamProcessorOutput, val name: String, val settings: com.amazonaws.services.rekognition.model.StreamProcessorSettings, val roleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.CreateStreamProcessorRequest> {



	override fun build(): com.amazonaws.services.rekognition.model.CreateStreamProcessorRequest {
		val input = com.amazonaws.services.rekognition.model.CreateStreamProcessorRequest()
		input.setInput(this.input)
		input.setOutput(this.output)
		input.setName(this.name)
		input.setSettings(this.settings)
		input.setRoleArn(this.roleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.createStreamProcessor(build())
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


fun AmazonRekognitionFunctions.deleteCollection(collectionId: String, init: AmazonRekognitionDeleteCollectionCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionDeleteCollectionCommand(collectionId).apply(init))
}

@Generated
class AmazonRekognitionDeleteCollectionCommand(val collectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.DeleteCollectionRequest> {



	override fun build(): com.amazonaws.services.rekognition.model.DeleteCollectionRequest {
		val input = com.amazonaws.services.rekognition.model.DeleteCollectionRequest()
		input.setCollectionId(this.collectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.deleteCollection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition delete-collection")
				.argument("collection-id", collectionId)
	}

}


fun AmazonRekognitionFunctions.deleteFaces(collectionId: String, faceIds: List<String>, init: AmazonRekognitionDeleteFacesCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionDeleteFacesCommand(collectionId, faceIds).apply(init))
}

@Generated
class AmazonRekognitionDeleteFacesCommand(val collectionId: String, val faceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.DeleteFacesRequest> {



	override fun build(): com.amazonaws.services.rekognition.model.DeleteFacesRequest {
		val input = com.amazonaws.services.rekognition.model.DeleteFacesRequest()
		input.setCollectionId(this.collectionId)
		input.setFaceIds(this.faceIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.deleteFaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition delete-faces")
				.argument("collection-id", collectionId)
				.argument("face-ids", faceIds.toString())
	}

}


fun AmazonRekognitionFunctions.deleteStreamProcessor(name: String, init: AmazonRekognitionDeleteStreamProcessorCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionDeleteStreamProcessorCommand(name).apply(init))
}

@Generated
class AmazonRekognitionDeleteStreamProcessorCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.DeleteStreamProcessorRequest> {



	override fun build(): com.amazonaws.services.rekognition.model.DeleteStreamProcessorRequest {
		val input = com.amazonaws.services.rekognition.model.DeleteStreamProcessorRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.deleteStreamProcessor(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition delete-stream-processor")
				.argument("name", name)
	}

}


fun AmazonRekognitionFunctions.describeStreamProcessor(name: String, init: AmazonRekognitionDescribeStreamProcessorCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionDescribeStreamProcessorCommand(name).apply(init))
}

@Generated
class AmazonRekognitionDescribeStreamProcessorCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.DescribeStreamProcessorRequest> {



	override fun build(): com.amazonaws.services.rekognition.model.DescribeStreamProcessorRequest {
		val input = com.amazonaws.services.rekognition.model.DescribeStreamProcessorRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.describeStreamProcessor(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition describe-stream-processor")
				.argument("name", name)
	}

}


fun AmazonRekognitionFunctions.detectFaces(image: com.amazonaws.services.rekognition.model.Image, init: AmazonRekognitionDetectFacesCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionDetectFacesCommand(image).apply(init))
}

@Generated
class AmazonRekognitionDetectFacesCommand(val image: com.amazonaws.services.rekognition.model.Image) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.DetectFacesRequest> {

	var attributes: List<Attribute>? = null

	override fun build(): com.amazonaws.services.rekognition.model.DetectFacesRequest {
		val input = com.amazonaws.services.rekognition.model.DetectFacesRequest()
		input.setImage(this.image)
		input.setAttributes(this.attributes?.map { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.detectFaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition detect-faces")
				.argument("image", image.toString())
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonRekognitionFunctions.detectLabels(image: com.amazonaws.services.rekognition.model.Image, init: AmazonRekognitionDetectLabelsCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionDetectLabelsCommand(image).apply(init))
}

@Generated
class AmazonRekognitionDetectLabelsCommand(val image: com.amazonaws.services.rekognition.model.Image) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.DetectLabelsRequest> {

	var maxLabels: Int? = 0
	var minConfidence: Float? = 0f

	override fun build(): com.amazonaws.services.rekognition.model.DetectLabelsRequest {
		val input = com.amazonaws.services.rekognition.model.DetectLabelsRequest()
		input.setImage(this.image)
		input.setMaxLabels(this.maxLabels)
		input.setMinConfidence(this.minConfidence)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.detectLabels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition detect-labels")
				.argument("image", image.toString())
				.argument("max-labels", maxLabels?.toString())
				.argument("min-confidence", minConfidence?.toString())
	}

}


fun AmazonRekognitionFunctions.detectModerationLabels(image: com.amazonaws.services.rekognition.model.Image, init: AmazonRekognitionDetectModerationLabelsCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionDetectModerationLabelsCommand(image).apply(init))
}

@Generated
class AmazonRekognitionDetectModerationLabelsCommand(val image: com.amazonaws.services.rekognition.model.Image) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.DetectModerationLabelsRequest> {

	var minConfidence: Float? = 0f

	override fun build(): com.amazonaws.services.rekognition.model.DetectModerationLabelsRequest {
		val input = com.amazonaws.services.rekognition.model.DetectModerationLabelsRequest()
		input.setImage(this.image)
		input.setMinConfidence(this.minConfidence)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.detectModerationLabels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition detect-moderation-labels")
				.argument("image", image.toString())
				.argument("min-confidence", minConfidence?.toString())
	}

}


fun AmazonRekognitionFunctions.detectText(image: com.amazonaws.services.rekognition.model.Image, init: AmazonRekognitionDetectTextCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionDetectTextCommand(image).apply(init))
}

@Generated
class AmazonRekognitionDetectTextCommand(val image: com.amazonaws.services.rekognition.model.Image) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.DetectTextRequest> {



	override fun build(): com.amazonaws.services.rekognition.model.DetectTextRequest {
		val input = com.amazonaws.services.rekognition.model.DetectTextRequest()
		input.setImage(this.image)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.detectText(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition detect-text")
				.argument("image", image.toString())
	}

}


fun AmazonRekognitionFunctions.getCelebrityInfo(id: String, init: AmazonRekognitionGetCelebrityInfoCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionGetCelebrityInfoCommand(id).apply(init))
}

@Generated
class AmazonRekognitionGetCelebrityInfoCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.GetCelebrityInfoRequest> {



	override fun build(): com.amazonaws.services.rekognition.model.GetCelebrityInfoRequest {
		val input = com.amazonaws.services.rekognition.model.GetCelebrityInfoRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.getCelebrityInfo(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition get-celebrity-info")
				.argument("id", id)
	}

}


fun AmazonRekognitionFunctions.getCelebrityRecognition(jobId: String, init: AmazonRekognitionGetCelebrityRecognitionCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionGetCelebrityRecognitionCommand(jobId).apply(init))
}

@Generated
class AmazonRekognitionGetCelebrityRecognitionCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.GetCelebrityRecognitionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.getCelebrityRecognition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition get-celebrity-recognition")
				.argument("job-id", jobId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("sort-by", sortBy?.toString())
	}

}


fun AmazonRekognitionFunctions.getContentModeration(jobId: String, init: AmazonRekognitionGetContentModerationCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionGetContentModerationCommand(jobId).apply(init))
}

@Generated
class AmazonRekognitionGetContentModerationCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.GetContentModerationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.getContentModeration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition get-content-moderation")
				.argument("job-id", jobId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("sort-by", sortBy?.toString())
	}

}


fun AmazonRekognitionFunctions.getFaceDetection(jobId: String, init: AmazonRekognitionGetFaceDetectionCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionGetFaceDetectionCommand(jobId).apply(init))
}

@Generated
class AmazonRekognitionGetFaceDetectionCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.GetFaceDetectionRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.rekognition.model.GetFaceDetectionRequest {
		val input = com.amazonaws.services.rekognition.model.GetFaceDetectionRequest()
		input.setJobId(this.jobId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.getFaceDetection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition get-face-detection")
				.argument("job-id", jobId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonRekognitionFunctions.getFaceSearch(jobId: String, init: AmazonRekognitionGetFaceSearchCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionGetFaceSearchCommand(jobId).apply(init))
}

@Generated
class AmazonRekognitionGetFaceSearchCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.GetFaceSearchRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.getFaceSearch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition get-face-search")
				.argument("job-id", jobId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("sort-by", sortBy?.toString())
	}

}


fun AmazonRekognitionFunctions.getLabelDetection(jobId: String, init: AmazonRekognitionGetLabelDetectionCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionGetLabelDetectionCommand(jobId).apply(init))
}

@Generated
class AmazonRekognitionGetLabelDetectionCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.GetLabelDetectionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.getLabelDetection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition get-label-detection")
				.argument("job-id", jobId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("sort-by", sortBy?.toString())
	}

}


fun AmazonRekognitionFunctions.getPersonTracking(jobId: String, init: AmazonRekognitionGetPersonTrackingCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionGetPersonTrackingCommand(jobId).apply(init))
}

@Generated
class AmazonRekognitionGetPersonTrackingCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.GetPersonTrackingRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.getPersonTracking(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition get-person-tracking")
				.argument("job-id", jobId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("sort-by", sortBy?.toString())
	}

}


fun AmazonRekognitionFunctions.indexFaces(collectionId: String, image: com.amazonaws.services.rekognition.model.Image, init: AmazonRekognitionIndexFacesCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionIndexFacesCommand(collectionId, image).apply(init))
}

@Generated
class AmazonRekognitionIndexFacesCommand(val collectionId: String, val image: com.amazonaws.services.rekognition.model.Image) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.IndexFacesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.indexFaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition index-faces")
				.argument("collection-id", collectionId)
				.argument("image", image.toString())
				.argument("external-image-id", externalImageId)
				.argument("detection-attributes", detectionAttributes?.toString())
	}

}


fun AmazonRekognitionFunctions.listCollections(init: AmazonRekognitionListCollectionsCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionListCollectionsCommand().apply(init))
}

@Generated
class AmazonRekognitionListCollectionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.ListCollectionsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.rekognition.model.ListCollectionsRequest {
		val input = com.amazonaws.services.rekognition.model.ListCollectionsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.listCollections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition list-collections")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonRekognitionFunctions.listFaces(collectionId: String, init: AmazonRekognitionListFacesCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionListFacesCommand(collectionId).apply(init))
}

@Generated
class AmazonRekognitionListFacesCommand(val collectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.ListFacesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.rekognition.model.ListFacesRequest {
		val input = com.amazonaws.services.rekognition.model.ListFacesRequest()
		input.setCollectionId(this.collectionId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.listFaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition list-faces")
				.argument("collection-id", collectionId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonRekognitionFunctions.listStreamProcessors(init: AmazonRekognitionListStreamProcessorsCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionListStreamProcessorsCommand().apply(init))
}

@Generated
class AmazonRekognitionListStreamProcessorsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.ListStreamProcessorsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.rekognition.model.ListStreamProcessorsRequest {
		val input = com.amazonaws.services.rekognition.model.ListStreamProcessorsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.listStreamProcessors(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition list-stream-processors")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonRekognitionFunctions.recognizeCelebrities(image: com.amazonaws.services.rekognition.model.Image, init: AmazonRekognitionRecognizeCelebritiesCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionRecognizeCelebritiesCommand(image).apply(init))
}

@Generated
class AmazonRekognitionRecognizeCelebritiesCommand(val image: com.amazonaws.services.rekognition.model.Image) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.RecognizeCelebritiesRequest> {



	override fun build(): com.amazonaws.services.rekognition.model.RecognizeCelebritiesRequest {
		val input = com.amazonaws.services.rekognition.model.RecognizeCelebritiesRequest()
		input.setImage(this.image)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.recognizeCelebrities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition recognize-celebrities")
				.argument("image", image.toString())
	}

}


fun AmazonRekognitionFunctions.searchFaces(collectionId: String, faceId: String, init: AmazonRekognitionSearchFacesCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionSearchFacesCommand(collectionId, faceId).apply(init))
}

@Generated
class AmazonRekognitionSearchFacesCommand(val collectionId: String, val faceId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.SearchFacesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.searchFaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition search-faces")
				.argument("collection-id", collectionId)
				.argument("face-id", faceId)
				.argument("max-faces", maxFaces?.toString())
				.argument("face-match-threshold", faceMatchThreshold?.toString())
	}

}


fun AmazonRekognitionFunctions.searchFacesByImage(collectionId: String, image: com.amazonaws.services.rekognition.model.Image, init: AmazonRekognitionSearchFacesByImageCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionSearchFacesByImageCommand(collectionId, image).apply(init))
}

@Generated
class AmazonRekognitionSearchFacesByImageCommand(val collectionId: String, val image: com.amazonaws.services.rekognition.model.Image) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.SearchFacesByImageRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.searchFacesByImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition search-faces-by-image")
				.argument("collection-id", collectionId)
				.argument("image", image.toString())
				.argument("max-faces", maxFaces?.toString())
				.argument("face-match-threshold", faceMatchThreshold?.toString())
	}

}


fun AmazonRekognitionFunctions.startCelebrityRecognition(video: com.amazonaws.services.rekognition.model.Video, init: AmazonRekognitionStartCelebrityRecognitionCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionStartCelebrityRecognitionCommand(video).apply(init))
}

@Generated
class AmazonRekognitionStartCelebrityRecognitionCommand(val video: com.amazonaws.services.rekognition.model.Video) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.StartCelebrityRecognitionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.startCelebrityRecognition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition start-celebrity-recognition")
				.argument("video", video.toString())
				.argument("client-request-token", clientRequestToken)
				.argument("notification-channel", notificationChannel?.toString())
				.argument("job-tag", jobTag)
	}

}


fun AmazonRekognitionFunctions.startContentModeration(video: com.amazonaws.services.rekognition.model.Video, init: AmazonRekognitionStartContentModerationCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionStartContentModerationCommand(video).apply(init))
}

@Generated
class AmazonRekognitionStartContentModerationCommand(val video: com.amazonaws.services.rekognition.model.Video) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.StartContentModerationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.startContentModeration(build())
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


fun AmazonRekognitionFunctions.startFaceDetection(video: com.amazonaws.services.rekognition.model.Video, init: AmazonRekognitionStartFaceDetectionCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionStartFaceDetectionCommand(video).apply(init))
}

@Generated
class AmazonRekognitionStartFaceDetectionCommand(val video: com.amazonaws.services.rekognition.model.Video) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.StartFaceDetectionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.startFaceDetection(build())
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


fun AmazonRekognitionFunctions.startFaceSearch(video: com.amazonaws.services.rekognition.model.Video, collectionId: String, init: AmazonRekognitionStartFaceSearchCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionStartFaceSearchCommand(video, collectionId).apply(init))
}

@Generated
class AmazonRekognitionStartFaceSearchCommand(val video: com.amazonaws.services.rekognition.model.Video, val collectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.StartFaceSearchRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.startFaceSearch(build())
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


fun AmazonRekognitionFunctions.startLabelDetection(video: com.amazonaws.services.rekognition.model.Video, init: AmazonRekognitionStartLabelDetectionCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionStartLabelDetectionCommand(video).apply(init))
}

@Generated
class AmazonRekognitionStartLabelDetectionCommand(val video: com.amazonaws.services.rekognition.model.Video) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.StartLabelDetectionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.startLabelDetection(build())
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


fun AmazonRekognitionFunctions.startPersonTracking(video: com.amazonaws.services.rekognition.model.Video, init: AmazonRekognitionStartPersonTrackingCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionStartPersonTrackingCommand(video).apply(init))
}

@Generated
class AmazonRekognitionStartPersonTrackingCommand(val video: com.amazonaws.services.rekognition.model.Video) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.StartPersonTrackingRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.startPersonTracking(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition start-person-tracking")
				.argument("video", video.toString())
				.argument("client-request-token", clientRequestToken)
				.argument("notification-channel", notificationChannel?.toString())
				.argument("job-tag", jobTag)
	}

}


fun AmazonRekognitionFunctions.startStreamProcessor(name: String, init: AmazonRekognitionStartStreamProcessorCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionStartStreamProcessorCommand(name).apply(init))
}

@Generated
class AmazonRekognitionStartStreamProcessorCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.StartStreamProcessorRequest> {



	override fun build(): com.amazonaws.services.rekognition.model.StartStreamProcessorRequest {
		val input = com.amazonaws.services.rekognition.model.StartStreamProcessorRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.startStreamProcessor(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition start-stream-processor")
				.argument("name", name)
	}

}


fun AmazonRekognitionFunctions.stopStreamProcessor(name: String, init: AmazonRekognitionStopStreamProcessorCommand.() -> Unit) {
	this.block.declare(AmazonRekognitionStopStreamProcessorCommand(name).apply(init))
}

@Generated
class AmazonRekognitionStopStreamProcessorCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.rekognition.model.StopStreamProcessorRequest> {



	override fun build(): com.amazonaws.services.rekognition.model.StopStreamProcessorRequest {
		val input = com.amazonaws.services.rekognition.model.StopStreamProcessorRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rekognition.stopStreamProcessor(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rekognition stop-stream-processor")
				.argument("name", name)
	}

}
