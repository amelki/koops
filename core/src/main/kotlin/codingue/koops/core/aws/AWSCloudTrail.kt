
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.cloudtrail.AWSCloudTrail
import com.amazonaws.services.cloudtrail.model.*

var codingue.koops.core.Environment.cloudtrail: AWSCloudTrail
	get() = this.capabilities[AWSCloudTrail::class.java.name] as AWSCloudTrail
	set(cloudtrail) {
		this.capabilities[AWSCloudTrail::class.java.name] = cloudtrail
	}

@Generated
class AWSCloudTrailFunctions(val block: Block)

infix fun AwsContinuation.cloudtrail(init: AWSCloudTrailFunctions.() -> Unit) {
	AWSCloudTrailFunctions(shell).apply(init)
}

			

fun AWSCloudTrailFunctions.addTags(resourceId: String, init: AWSCloudTrailAddTagsCommand.() -> Unit) {
	this.block.declare(AWSCloudTrailAddTagsCommand(resourceId).apply(init))
}

@Generated
class AWSCloudTrailAddTagsCommand(val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudtrail.model.AddTagsRequest> {

	var tagsList: List<com.amazonaws.services.cloudtrail.model.Tag>? = null

	override fun build(): com.amazonaws.services.cloudtrail.model.AddTagsRequest {
		val input = com.amazonaws.services.cloudtrail.model.AddTagsRequest()
		input.setResourceId(this.resourceId)
		input.setTagsList(this.tagsList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudtrail.addTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudtrail add-tags")
				.argument("resource-id", resourceId)
				.argument("tags-list", tagsList?.toString())
	}

}


fun AWSCloudTrailFunctions.createTrail(name: String, s3BucketName: String, init: AWSCloudTrailCreateTrailCommand.() -> Unit) {
	this.block.declare(AWSCloudTrailCreateTrailCommand(name, s3BucketName).apply(init))
}

@Generated
class AWSCloudTrailCreateTrailCommand(val name: String, val s3BucketName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudtrail.model.CreateTrailRequest> {

	var s3KeyPrefix: String? = null
	var snsTopicName: String? = null
	var includeGlobalServiceEvents: Boolean? = false
	var isMultiRegionTrail: Boolean? = false
	var enableLogFileValidation: Boolean? = false
	var cloudWatchLogsLogGroupArn: String? = null
	var cloudWatchLogsRoleArn: String? = null
	var kmsKeyId: String? = null

	override fun build(): com.amazonaws.services.cloudtrail.model.CreateTrailRequest {
		val input = com.amazonaws.services.cloudtrail.model.CreateTrailRequest()
		input.setName(this.name)
		input.setS3BucketName(this.s3BucketName)
		input.setS3KeyPrefix(this.s3KeyPrefix)
		input.setSnsTopicName(this.snsTopicName)
		input.setIncludeGlobalServiceEvents(this.includeGlobalServiceEvents)
		input.setIsMultiRegionTrail(this.isMultiRegionTrail)
		input.setEnableLogFileValidation(this.enableLogFileValidation)
		input.setCloudWatchLogsLogGroupArn(this.cloudWatchLogsLogGroupArn)
		input.setCloudWatchLogsRoleArn(this.cloudWatchLogsRoleArn)
		input.setKmsKeyId(this.kmsKeyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudtrail.createTrail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudtrail create-trail")
				.argument("name", name)
				.argument("s3-bucket-name", s3BucketName)
				.argument("s3-key-prefix", s3KeyPrefix)
				.argument("sns-topic-name", snsTopicName)
				.option("include-global-service-events", includeGlobalServiceEvents ?: false)
				.option("is-multi-region-trail", isMultiRegionTrail ?: false)
				.option("enable-log-file-validation", enableLogFileValidation ?: false)
				.argument("cloud-watch-logs-log-group-arn", cloudWatchLogsLogGroupArn)
				.argument("cloud-watch-logs-role-arn", cloudWatchLogsRoleArn)
				.argument("kms-key-id", kmsKeyId)
	}

}


fun AWSCloudTrailFunctions.deleteTrail(name: String, init: AWSCloudTrailDeleteTrailCommand.() -> Unit) {
	this.block.declare(AWSCloudTrailDeleteTrailCommand(name).apply(init))
}

@Generated
class AWSCloudTrailDeleteTrailCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudtrail.model.DeleteTrailRequest> {



	override fun build(): com.amazonaws.services.cloudtrail.model.DeleteTrailRequest {
		val input = com.amazonaws.services.cloudtrail.model.DeleteTrailRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudtrail.deleteTrail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudtrail delete-trail")
				.argument("name", name)
	}

}


fun AWSCloudTrailFunctions.describeTrails(init: AWSCloudTrailDescribeTrailsCommand.() -> Unit) {
	this.block.declare(AWSCloudTrailDescribeTrailsCommand().apply(init))
}

@Generated
class AWSCloudTrailDescribeTrailsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudtrail.model.DescribeTrailsRequest> {

	var trailNameList: List<String>? = null
	var includeShadowTrails: Boolean? = false

	override fun build(): com.amazonaws.services.cloudtrail.model.DescribeTrailsRequest {
		val input = com.amazonaws.services.cloudtrail.model.DescribeTrailsRequest()
		input.setTrailNameList(this.trailNameList)
		input.setIncludeShadowTrails(this.includeShadowTrails)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudtrail.describeTrails(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudtrail describe-trails")
				.argument("trail-name-list", trailNameList?.toString())
				.option("include-shadow-trails", includeShadowTrails ?: false)
	}

}


fun AWSCloudTrailFunctions.getEventSelectors(trailName: String, init: AWSCloudTrailGetEventSelectorsCommand.() -> Unit) {
	this.block.declare(AWSCloudTrailGetEventSelectorsCommand(trailName).apply(init))
}

@Generated
class AWSCloudTrailGetEventSelectorsCommand(val trailName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudtrail.model.GetEventSelectorsRequest> {



	override fun build(): com.amazonaws.services.cloudtrail.model.GetEventSelectorsRequest {
		val input = com.amazonaws.services.cloudtrail.model.GetEventSelectorsRequest()
		input.setTrailName(this.trailName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudtrail.getEventSelectors(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudtrail get-event-selectors")
				.argument("trail-name", trailName)
	}

}


fun AWSCloudTrailFunctions.getTrailStatus(name: String, init: AWSCloudTrailGetTrailStatusCommand.() -> Unit) {
	this.block.declare(AWSCloudTrailGetTrailStatusCommand(name).apply(init))
}

@Generated
class AWSCloudTrailGetTrailStatusCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudtrail.model.GetTrailStatusRequest> {



	override fun build(): com.amazonaws.services.cloudtrail.model.GetTrailStatusRequest {
		val input = com.amazonaws.services.cloudtrail.model.GetTrailStatusRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudtrail.getTrailStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudtrail get-trail-status")
				.argument("name", name)
	}

}


fun AWSCloudTrailFunctions.listPublicKeys(init: AWSCloudTrailListPublicKeysCommand.() -> Unit) {
	this.block.declare(AWSCloudTrailListPublicKeysCommand().apply(init))
}

@Generated
class AWSCloudTrailListPublicKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudtrail.model.ListPublicKeysRequest> {

	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudtrail.model.ListPublicKeysRequest {
		val input = com.amazonaws.services.cloudtrail.model.ListPublicKeysRequest()
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudtrail.listPublicKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudtrail list-public-keys")
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCloudTrailFunctions.listTags(resourceIdList: List<String>, init: AWSCloudTrailListTagsCommand.() -> Unit) {
	this.block.declare(AWSCloudTrailListTagsCommand(resourceIdList).apply(init))
}

@Generated
class AWSCloudTrailListTagsCommand(val resourceIdList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudtrail.model.ListTagsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudtrail.model.ListTagsRequest {
		val input = com.amazonaws.services.cloudtrail.model.ListTagsRequest()
		input.setResourceIdList(this.resourceIdList)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudtrail.listTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudtrail list-tags")
				.argument("resource-id-list", resourceIdList.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCloudTrailFunctions.lookupEvents(init: AWSCloudTrailLookupEventsCommand.() -> Unit) {
	this.block.declare(AWSCloudTrailLookupEventsCommand().apply(init))
}

@Generated
class AWSCloudTrailLookupEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudtrail.model.LookupEventsRequest> {

	var lookupAttributes: List<com.amazonaws.services.cloudtrail.model.LookupAttribute>? = null
	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudtrail.model.LookupEventsRequest {
		val input = com.amazonaws.services.cloudtrail.model.LookupEventsRequest()
		input.setLookupAttributes(this.lookupAttributes)
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudtrail.lookupEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudtrail lookup-events")
				.argument("lookup-attributes", lookupAttributes?.toString())
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCloudTrailFunctions.putEventSelectors(trailName: String, eventSelectors: List<com.amazonaws.services.cloudtrail.model.EventSelector>, init: AWSCloudTrailPutEventSelectorsCommand.() -> Unit) {
	this.block.declare(AWSCloudTrailPutEventSelectorsCommand(trailName, eventSelectors).apply(init))
}

@Generated
class AWSCloudTrailPutEventSelectorsCommand(val trailName: String, val eventSelectors: List<com.amazonaws.services.cloudtrail.model.EventSelector>) : AmazonWebServiceCommand<com.amazonaws.services.cloudtrail.model.PutEventSelectorsRequest> {



	override fun build(): com.amazonaws.services.cloudtrail.model.PutEventSelectorsRequest {
		val input = com.amazonaws.services.cloudtrail.model.PutEventSelectorsRequest()
		input.setTrailName(this.trailName)
		input.setEventSelectors(this.eventSelectors)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudtrail.putEventSelectors(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudtrail put-event-selectors")
				.argument("trail-name", trailName)
				.argument("event-selectors", eventSelectors.toString())
	}

}


fun AWSCloudTrailFunctions.removeTags(resourceId: String, init: AWSCloudTrailRemoveTagsCommand.() -> Unit) {
	this.block.declare(AWSCloudTrailRemoveTagsCommand(resourceId).apply(init))
}

@Generated
class AWSCloudTrailRemoveTagsCommand(val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudtrail.model.RemoveTagsRequest> {

	var tagsList: List<com.amazonaws.services.cloudtrail.model.Tag>? = null

	override fun build(): com.amazonaws.services.cloudtrail.model.RemoveTagsRequest {
		val input = com.amazonaws.services.cloudtrail.model.RemoveTagsRequest()
		input.setResourceId(this.resourceId)
		input.setTagsList(this.tagsList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudtrail.removeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudtrail remove-tags")
				.argument("resource-id", resourceId)
				.argument("tags-list", tagsList?.toString())
	}

}


fun AWSCloudTrailFunctions.startLogging(name: String, init: AWSCloudTrailStartLoggingCommand.() -> Unit) {
	this.block.declare(AWSCloudTrailStartLoggingCommand(name).apply(init))
}

@Generated
class AWSCloudTrailStartLoggingCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudtrail.model.StartLoggingRequest> {



	override fun build(): com.amazonaws.services.cloudtrail.model.StartLoggingRequest {
		val input = com.amazonaws.services.cloudtrail.model.StartLoggingRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudtrail.startLogging(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudtrail start-logging")
				.argument("name", name)
	}

}


fun AWSCloudTrailFunctions.stopLogging(name: String, init: AWSCloudTrailStopLoggingCommand.() -> Unit) {
	this.block.declare(AWSCloudTrailStopLoggingCommand(name).apply(init))
}

@Generated
class AWSCloudTrailStopLoggingCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudtrail.model.StopLoggingRequest> {



	override fun build(): com.amazonaws.services.cloudtrail.model.StopLoggingRequest {
		val input = com.amazonaws.services.cloudtrail.model.StopLoggingRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudtrail.stopLogging(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudtrail stop-logging")
				.argument("name", name)
	}

}


fun AWSCloudTrailFunctions.updateTrail(name: String, init: AWSCloudTrailUpdateTrailCommand.() -> Unit) {
	this.block.declare(AWSCloudTrailUpdateTrailCommand(name).apply(init))
}

@Generated
class AWSCloudTrailUpdateTrailCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudtrail.model.UpdateTrailRequest> {

	var s3BucketName: String? = null
	var s3KeyPrefix: String? = null
	var snsTopicName: String? = null
	var includeGlobalServiceEvents: Boolean? = false
	var isMultiRegionTrail: Boolean? = false
	var enableLogFileValidation: Boolean? = false
	var cloudWatchLogsLogGroupArn: String? = null
	var cloudWatchLogsRoleArn: String? = null
	var kmsKeyId: String? = null

	override fun build(): com.amazonaws.services.cloudtrail.model.UpdateTrailRequest {
		val input = com.amazonaws.services.cloudtrail.model.UpdateTrailRequest()
		input.setName(this.name)
		input.setS3BucketName(this.s3BucketName)
		input.setS3KeyPrefix(this.s3KeyPrefix)
		input.setSnsTopicName(this.snsTopicName)
		input.setIncludeGlobalServiceEvents(this.includeGlobalServiceEvents)
		input.setIsMultiRegionTrail(this.isMultiRegionTrail)
		input.setEnableLogFileValidation(this.enableLogFileValidation)
		input.setCloudWatchLogsLogGroupArn(this.cloudWatchLogsLogGroupArn)
		input.setCloudWatchLogsRoleArn(this.cloudWatchLogsRoleArn)
		input.setKmsKeyId(this.kmsKeyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudtrail.updateTrail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudtrail update-trail")
				.argument("name", name)
				.argument("s3-bucket-name", s3BucketName)
				.argument("s3-key-prefix", s3KeyPrefix)
				.argument("sns-topic-name", snsTopicName)
				.option("include-global-service-events", includeGlobalServiceEvents ?: false)
				.option("is-multi-region-trail", isMultiRegionTrail ?: false)
				.option("enable-log-file-validation", enableLogFileValidation ?: false)
				.argument("cloud-watch-logs-log-group-arn", cloudWatchLogsLogGroupArn)
				.argument("cloud-watch-logs-role-arn", cloudWatchLogsRoleArn)
				.argument("kms-key-id", kmsKeyId)
	}

}