
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.kinesis.AmazonKinesis
import com.amazonaws.services.kinesis.model.*

var codingue.koops.core.Environment.kinesis: AmazonKinesis
	get() = this.capabilities[AmazonKinesis::class.java.name] as AmazonKinesis
	set(kinesis) {
		this.capabilities[AmazonKinesis::class.java.name] = kinesis
	}

@Generated
class AmazonKinesisFunctions(val block: Block)

infix fun <T> AwsContinuation.kinesis(init: AmazonKinesisFunctions.() -> T): T {
	return AmazonKinesisFunctions(shell).run(init)
}

			

fun AmazonKinesisFunctions.addTagsToStream(streamName: String, tags: Map<String, String>, init: AmazonKinesisAddTagsToStreamCommand.() -> Unit): com.amazonaws.services.kinesis.model.AddTagsToStreamResult {
	return this.block.declare(AmazonKinesisAddTagsToStreamCommand(streamName, tags).apply(init)) as com.amazonaws.services.kinesis.model.AddTagsToStreamResult
}

@Generated
class AmazonKinesisAddTagsToStreamCommand(val streamName: String, val tags: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.AddTagsToStreamRequest, com.amazonaws.services.kinesis.model.AddTagsToStreamResult> {



	override fun build(): com.amazonaws.services.kinesis.model.AddTagsToStreamRequest {
		val input = com.amazonaws.services.kinesis.model.AddTagsToStreamRequest()
		input.setStreamName(this.streamName)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.AddTagsToStreamResult {
	  return com.amazonaws.services.kinesis.model.AddTagsToStreamResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.AddTagsToStreamResult {
		return environment.kinesis.addTagsToStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis add-tags-to-stream")
				.argument("stream-name", streamName)
				.argument("tags", tags.toString())
	}

}


fun AmazonKinesisFunctions.createStream(streamName: String, shardCount: Int, init: AmazonKinesisCreateStreamCommand.() -> Unit): com.amazonaws.services.kinesis.model.CreateStreamResult {
	return this.block.declare(AmazonKinesisCreateStreamCommand(streamName, shardCount).apply(init)) as com.amazonaws.services.kinesis.model.CreateStreamResult
}

@Generated
class AmazonKinesisCreateStreamCommand(val streamName: String, val shardCount: Int) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.CreateStreamRequest, com.amazonaws.services.kinesis.model.CreateStreamResult> {



	override fun build(): com.amazonaws.services.kinesis.model.CreateStreamRequest {
		val input = com.amazonaws.services.kinesis.model.CreateStreamRequest()
		input.setStreamName(this.streamName)
		input.setShardCount(this.shardCount)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.CreateStreamResult {
	  return com.amazonaws.services.kinesis.model.CreateStreamResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.CreateStreamResult {
		return environment.kinesis.createStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis create-stream")
				.argument("stream-name", streamName)
				.argument("shard-count", shardCount.toString())
	}

}


fun AmazonKinesisFunctions.decreaseStreamRetentionPeriod(streamName: String, retentionPeriodHours: Int, init: AmazonKinesisDecreaseStreamRetentionPeriodCommand.() -> Unit): com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodResult {
	return this.block.declare(AmazonKinesisDecreaseStreamRetentionPeriodCommand(streamName, retentionPeriodHours).apply(init)) as com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodResult
}

@Generated
class AmazonKinesisDecreaseStreamRetentionPeriodCommand(val streamName: String, val retentionPeriodHours: Int) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodRequest, com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodResult> {



	override fun build(): com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodRequest {
		val input = com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodRequest()
		input.setStreamName(this.streamName)
		input.setRetentionPeriodHours(this.retentionPeriodHours)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodResult {
	  return com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodResult {
		return environment.kinesis.decreaseStreamRetentionPeriod(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis decrease-stream-retention-period")
				.argument("stream-name", streamName)
				.argument("retention-period-hours", retentionPeriodHours.toString())
	}

}


fun AmazonKinesisFunctions.deleteStream(streamName: String, init: AmazonKinesisDeleteStreamCommand.() -> Unit): com.amazonaws.services.kinesis.model.DeleteStreamResult {
	return this.block.declare(AmazonKinesisDeleteStreamCommand(streamName).apply(init)) as com.amazonaws.services.kinesis.model.DeleteStreamResult
}

@Generated
class AmazonKinesisDeleteStreamCommand(val streamName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.DeleteStreamRequest, com.amazonaws.services.kinesis.model.DeleteStreamResult> {



	override fun build(): com.amazonaws.services.kinesis.model.DeleteStreamRequest {
		val input = com.amazonaws.services.kinesis.model.DeleteStreamRequest()
		input.setStreamName(this.streamName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.DeleteStreamResult {
	  return com.amazonaws.services.kinesis.model.DeleteStreamResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.DeleteStreamResult {
		return environment.kinesis.deleteStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis delete-stream")
				.argument("stream-name", streamName)
	}

}


fun AmazonKinesisFunctions.describeLimits(init: AmazonKinesisDescribeLimitsCommand.() -> Unit): com.amazonaws.services.kinesis.model.DescribeLimitsResult {
	return this.block.declare(AmazonKinesisDescribeLimitsCommand().apply(init)) as com.amazonaws.services.kinesis.model.DescribeLimitsResult
}

@Generated
class AmazonKinesisDescribeLimitsCommand() : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.DescribeLimitsRequest, com.amazonaws.services.kinesis.model.DescribeLimitsResult> {



	override fun build(): com.amazonaws.services.kinesis.model.DescribeLimitsRequest {
		val input = com.amazonaws.services.kinesis.model.DescribeLimitsRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.DescribeLimitsResult {
	  return com.amazonaws.services.kinesis.model.DescribeLimitsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.DescribeLimitsResult {
		return environment.kinesis.describeLimits(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis describe-limits")

	}

}


fun AmazonKinesisFunctions.describeStream(streamName: String, init: AmazonKinesisDescribeStreamCommand.() -> Unit): com.amazonaws.services.kinesis.model.DescribeStreamResult {
	return this.block.declare(AmazonKinesisDescribeStreamCommand(streamName).apply(init)) as com.amazonaws.services.kinesis.model.DescribeStreamResult
}

@Generated
class AmazonKinesisDescribeStreamCommand(val streamName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.DescribeStreamRequest, com.amazonaws.services.kinesis.model.DescribeStreamResult> {

	var limit: Int? = 0
	var exclusiveStartShardId: String? = null

	override fun build(): com.amazonaws.services.kinesis.model.DescribeStreamRequest {
		val input = com.amazonaws.services.kinesis.model.DescribeStreamRequest()
		input.setStreamName(this.streamName)
		input.setLimit(this.limit)
		input.setExclusiveStartShardId(this.exclusiveStartShardId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.DescribeStreamResult {
	  return com.amazonaws.services.kinesis.model.DescribeStreamResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.DescribeStreamResult {
		return environment.kinesis.describeStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis describe-stream")
				.argument("stream-name", streamName)
				.argument("limit", limit?.toString())
				.argument("exclusive-start-shard-id", exclusiveStartShardId)
	}

}


fun AmazonKinesisFunctions.describeStreamSummary(streamName: String, init: AmazonKinesisDescribeStreamSummaryCommand.() -> Unit): com.amazonaws.services.kinesis.model.DescribeStreamSummaryResult {
	return this.block.declare(AmazonKinesisDescribeStreamSummaryCommand(streamName).apply(init)) as com.amazonaws.services.kinesis.model.DescribeStreamSummaryResult
}

@Generated
class AmazonKinesisDescribeStreamSummaryCommand(val streamName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.DescribeStreamSummaryRequest, com.amazonaws.services.kinesis.model.DescribeStreamSummaryResult> {



	override fun build(): com.amazonaws.services.kinesis.model.DescribeStreamSummaryRequest {
		val input = com.amazonaws.services.kinesis.model.DescribeStreamSummaryRequest()
		input.setStreamName(this.streamName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.DescribeStreamSummaryResult {
	  return com.amazonaws.services.kinesis.model.DescribeStreamSummaryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.DescribeStreamSummaryResult {
		return environment.kinesis.describeStreamSummary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis describe-stream-summary")
				.argument("stream-name", streamName)
	}

}


fun AmazonKinesisFunctions.disableEnhancedMonitoring(streamName: String, shardLevelMetrics: List<MetricsName>, init: AmazonKinesisDisableEnhancedMonitoringCommand.() -> Unit): com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringResult {
	return this.block.declare(AmazonKinesisDisableEnhancedMonitoringCommand(streamName, shardLevelMetrics).apply(init)) as com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringResult
}

@Generated
class AmazonKinesisDisableEnhancedMonitoringCommand(val streamName: String, val shardLevelMetrics: List<MetricsName>) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest, com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringResult> {



	override fun build(): com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest {
		val input = com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest()
		input.setStreamName(this.streamName)
		input.setShardLevelMetrics(this.shardLevelMetrics.map { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringResult {
	  return com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringResult {
		return environment.kinesis.disableEnhancedMonitoring(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis disable-enhanced-monitoring")
				.argument("stream-name", streamName)
				.argument("shard-level-metrics", shardLevelMetrics.toString())
	}

}


fun AmazonKinesisFunctions.enableEnhancedMonitoring(streamName: String, shardLevelMetrics: List<MetricsName>, init: AmazonKinesisEnableEnhancedMonitoringCommand.() -> Unit): com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult {
	return this.block.declare(AmazonKinesisEnableEnhancedMonitoringCommand(streamName, shardLevelMetrics).apply(init)) as com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult
}

@Generated
class AmazonKinesisEnableEnhancedMonitoringCommand(val streamName: String, val shardLevelMetrics: List<MetricsName>) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest, com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult> {



	override fun build(): com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest {
		val input = com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest()
		input.setStreamName(this.streamName)
		input.setShardLevelMetrics(this.shardLevelMetrics.map { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult {
	  return com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult {
		return environment.kinesis.enableEnhancedMonitoring(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis enable-enhanced-monitoring")
				.argument("stream-name", streamName)
				.argument("shard-level-metrics", shardLevelMetrics.toString())
	}

}


fun AmazonKinesisFunctions.getRecords(shardIterator: String, init: AmazonKinesisGetRecordsCommand.() -> Unit): com.amazonaws.services.kinesis.model.GetRecordsResult {
	return this.block.declare(AmazonKinesisGetRecordsCommand(shardIterator).apply(init)) as com.amazonaws.services.kinesis.model.GetRecordsResult
}

@Generated
class AmazonKinesisGetRecordsCommand(val shardIterator: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.GetRecordsRequest, com.amazonaws.services.kinesis.model.GetRecordsResult> {

	var limit: Int? = 0

	override fun build(): com.amazonaws.services.kinesis.model.GetRecordsRequest {
		val input = com.amazonaws.services.kinesis.model.GetRecordsRequest()
		input.setShardIterator(this.shardIterator)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.GetRecordsResult {
	  return com.amazonaws.services.kinesis.model.GetRecordsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.GetRecordsResult {
		return environment.kinesis.getRecords(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis get-records")
				.argument("shard-iterator", shardIterator)
				.argument("limit", limit?.toString())
	}

}


fun AmazonKinesisFunctions.getShardIterator(streamName: String, shardId: String, shardIteratorType: ShardIteratorType, init: AmazonKinesisGetShardIteratorCommand.() -> Unit): com.amazonaws.services.kinesis.model.GetShardIteratorResult {
	return this.block.declare(AmazonKinesisGetShardIteratorCommand(streamName, shardId, shardIteratorType).apply(init)) as com.amazonaws.services.kinesis.model.GetShardIteratorResult
}

@Generated
class AmazonKinesisGetShardIteratorCommand(val streamName: String, val shardId: String, val shardIteratorType: ShardIteratorType) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.GetShardIteratorRequest, com.amazonaws.services.kinesis.model.GetShardIteratorResult> {

	var startingSequenceNumber: String? = null
	var timestamp: java.util.Date? = null

	override fun build(): com.amazonaws.services.kinesis.model.GetShardIteratorRequest {
		val input = com.amazonaws.services.kinesis.model.GetShardIteratorRequest()
		input.setStreamName(this.streamName)
		input.setShardId(this.shardId)
		input.setShardIteratorType(this.shardIteratorType.toString())
		input.setStartingSequenceNumber(this.startingSequenceNumber)
		input.setTimestamp(this.timestamp)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.GetShardIteratorResult {
	  return com.amazonaws.services.kinesis.model.GetShardIteratorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.GetShardIteratorResult {
		return environment.kinesis.getShardIterator(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis get-shard-iterator")
				.argument("stream-name", streamName)
				.argument("shard-id", shardId)
				.argument("shard-iterator-type", shardIteratorType.toString())
				.argument("starting-sequence-number", startingSequenceNumber)
				.argument("timestamp", timestamp?.toString())
	}

}


fun AmazonKinesisFunctions.increaseStreamRetentionPeriod(streamName: String, retentionPeriodHours: Int, init: AmazonKinesisIncreaseStreamRetentionPeriodCommand.() -> Unit): com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodResult {
	return this.block.declare(AmazonKinesisIncreaseStreamRetentionPeriodCommand(streamName, retentionPeriodHours).apply(init)) as com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodResult
}

@Generated
class AmazonKinesisIncreaseStreamRetentionPeriodCommand(val streamName: String, val retentionPeriodHours: Int) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodRequest, com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodResult> {



	override fun build(): com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodRequest {
		val input = com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodRequest()
		input.setStreamName(this.streamName)
		input.setRetentionPeriodHours(this.retentionPeriodHours)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodResult {
	  return com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodResult {
		return environment.kinesis.increaseStreamRetentionPeriod(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis increase-stream-retention-period")
				.argument("stream-name", streamName)
				.argument("retention-period-hours", retentionPeriodHours.toString())
	}

}


fun AmazonKinesisFunctions.listShards(init: AmazonKinesisListShardsCommand.() -> Unit): com.amazonaws.services.kinesis.model.ListShardsResult {
	return this.block.declare(AmazonKinesisListShardsCommand().apply(init)) as com.amazonaws.services.kinesis.model.ListShardsResult
}

@Generated
class AmazonKinesisListShardsCommand() : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.ListShardsRequest, com.amazonaws.services.kinesis.model.ListShardsResult> {

	var streamName: String? = null
	var nextToken: String? = null
	var exclusiveStartShardId: String? = null
	var maxResults: Int? = 0
	var streamCreationTimestamp: java.util.Date? = null

	override fun build(): com.amazonaws.services.kinesis.model.ListShardsRequest {
		val input = com.amazonaws.services.kinesis.model.ListShardsRequest()
		input.setStreamName(this.streamName)
		input.setNextToken(this.nextToken)
		input.setExclusiveStartShardId(this.exclusiveStartShardId)
		input.setMaxResults(this.maxResults)
		input.setStreamCreationTimestamp(this.streamCreationTimestamp)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.ListShardsResult {
	  return com.amazonaws.services.kinesis.model.ListShardsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.ListShardsResult {
		return environment.kinesis.listShards(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis list-shards")
				.argument("stream-name", streamName)
				.argument("next-token", nextToken)
				.argument("exclusive-start-shard-id", exclusiveStartShardId)
				.argument("max-results", maxResults?.toString())
				.argument("stream-creation-timestamp", streamCreationTimestamp?.toString())
	}

}


fun AmazonKinesisFunctions.listStreams(init: AmazonKinesisListStreamsCommand.() -> Unit): com.amazonaws.services.kinesis.model.ListStreamsResult {
	return this.block.declare(AmazonKinesisListStreamsCommand().apply(init)) as com.amazonaws.services.kinesis.model.ListStreamsResult
}

@Generated
class AmazonKinesisListStreamsCommand() : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.ListStreamsRequest, com.amazonaws.services.kinesis.model.ListStreamsResult> {

	var limit: Int? = 0
	var exclusiveStartStreamName: String? = null

	override fun build(): com.amazonaws.services.kinesis.model.ListStreamsRequest {
		val input = com.amazonaws.services.kinesis.model.ListStreamsRequest()
		input.setLimit(this.limit)
		input.setExclusiveStartStreamName(this.exclusiveStartStreamName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.ListStreamsResult {
	  return com.amazonaws.services.kinesis.model.ListStreamsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.ListStreamsResult {
		return environment.kinesis.listStreams(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis list-streams")
				.argument("limit", limit?.toString())
				.argument("exclusive-start-stream-name", exclusiveStartStreamName)
	}

}


fun AmazonKinesisFunctions.listTagsForStream(streamName: String, init: AmazonKinesisListTagsForStreamCommand.() -> Unit): com.amazonaws.services.kinesis.model.ListTagsForStreamResult {
	return this.block.declare(AmazonKinesisListTagsForStreamCommand(streamName).apply(init)) as com.amazonaws.services.kinesis.model.ListTagsForStreamResult
}

@Generated
class AmazonKinesisListTagsForStreamCommand(val streamName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.ListTagsForStreamRequest, com.amazonaws.services.kinesis.model.ListTagsForStreamResult> {

	var exclusiveStartTagKey: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.kinesis.model.ListTagsForStreamRequest {
		val input = com.amazonaws.services.kinesis.model.ListTagsForStreamRequest()
		input.setStreamName(this.streamName)
		input.setExclusiveStartTagKey(this.exclusiveStartTagKey)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.ListTagsForStreamResult {
	  return com.amazonaws.services.kinesis.model.ListTagsForStreamResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.ListTagsForStreamResult {
		return environment.kinesis.listTagsForStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis list-tags-for-stream")
				.argument("stream-name", streamName)
				.argument("exclusive-start-tag-key", exclusiveStartTagKey)
				.argument("limit", limit?.toString())
	}

}


fun AmazonKinesisFunctions.mergeShards(streamName: String, shardToMerge: String, adjacentShardToMerge: String, init: AmazonKinesisMergeShardsCommand.() -> Unit): com.amazonaws.services.kinesis.model.MergeShardsResult {
	return this.block.declare(AmazonKinesisMergeShardsCommand(streamName, shardToMerge, adjacentShardToMerge).apply(init)) as com.amazonaws.services.kinesis.model.MergeShardsResult
}

@Generated
class AmazonKinesisMergeShardsCommand(val streamName: String, val shardToMerge: String, val adjacentShardToMerge: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.MergeShardsRequest, com.amazonaws.services.kinesis.model.MergeShardsResult> {



	override fun build(): com.amazonaws.services.kinesis.model.MergeShardsRequest {
		val input = com.amazonaws.services.kinesis.model.MergeShardsRequest()
		input.setStreamName(this.streamName)
		input.setShardToMerge(this.shardToMerge)
		input.setAdjacentShardToMerge(this.adjacentShardToMerge)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.MergeShardsResult {
	  return com.amazonaws.services.kinesis.model.MergeShardsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.MergeShardsResult {
		return environment.kinesis.mergeShards(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis merge-shards")
				.argument("stream-name", streamName)
				.argument("shard-to-merge", shardToMerge)
				.argument("adjacent-shard-to-merge", adjacentShardToMerge)
	}

}


fun AmazonKinesisFunctions.putRecord(streamName: String, data: java.nio.ByteBuffer, partitionKey: String, init: AmazonKinesisPutRecordCommand.() -> Unit): com.amazonaws.services.kinesis.model.PutRecordResult {
	return this.block.declare(AmazonKinesisPutRecordCommand(streamName, data, partitionKey).apply(init)) as com.amazonaws.services.kinesis.model.PutRecordResult
}

@Generated
class AmazonKinesisPutRecordCommand(val streamName: String, val data: java.nio.ByteBuffer, val partitionKey: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.PutRecordRequest, com.amazonaws.services.kinesis.model.PutRecordResult> {

	var explicitHashKey: String? = null
	var sequenceNumberForOrdering: String? = null

	override fun build(): com.amazonaws.services.kinesis.model.PutRecordRequest {
		val input = com.amazonaws.services.kinesis.model.PutRecordRequest()
		input.setStreamName(this.streamName)
		input.setData(this.data)
		input.setPartitionKey(this.partitionKey)
		input.setExplicitHashKey(this.explicitHashKey)
		input.setSequenceNumberForOrdering(this.sequenceNumberForOrdering)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.PutRecordResult {
	  return com.amazonaws.services.kinesis.model.PutRecordResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.PutRecordResult {
		return environment.kinesis.putRecord(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis put-record")
				.argument("stream-name", streamName)
				.argument("data", data.toString())
				.argument("partition-key", partitionKey)
				.argument("explicit-hash-key", explicitHashKey)
				.argument("sequence-number-for-ordering", sequenceNumberForOrdering)
	}

}


fun AmazonKinesisFunctions.putRecords(records: List<com.amazonaws.services.kinesis.model.PutRecordsRequestEntry>, streamName: String, init: AmazonKinesisPutRecordsCommand.() -> Unit): com.amazonaws.services.kinesis.model.PutRecordsResult {
	return this.block.declare(AmazonKinesisPutRecordsCommand(records, streamName).apply(init)) as com.amazonaws.services.kinesis.model.PutRecordsResult
}

@Generated
class AmazonKinesisPutRecordsCommand(val records: List<com.amazonaws.services.kinesis.model.PutRecordsRequestEntry>, val streamName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.PutRecordsRequest, com.amazonaws.services.kinesis.model.PutRecordsResult> {



	override fun build(): com.amazonaws.services.kinesis.model.PutRecordsRequest {
		val input = com.amazonaws.services.kinesis.model.PutRecordsRequest()
		input.setRecords(this.records)
		input.setStreamName(this.streamName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.PutRecordsResult {
	  return com.amazonaws.services.kinesis.model.PutRecordsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.PutRecordsResult {
		return environment.kinesis.putRecords(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis put-records")
				.argument("records", records.toString())
				.argument("stream-name", streamName)
	}

}


fun AmazonKinesisFunctions.removeTagsFromStream(streamName: String, tagKeys: List<String>, init: AmazonKinesisRemoveTagsFromStreamCommand.() -> Unit): com.amazonaws.services.kinesis.model.RemoveTagsFromStreamResult {
	return this.block.declare(AmazonKinesisRemoveTagsFromStreamCommand(streamName, tagKeys).apply(init)) as com.amazonaws.services.kinesis.model.RemoveTagsFromStreamResult
}

@Generated
class AmazonKinesisRemoveTagsFromStreamCommand(val streamName: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.RemoveTagsFromStreamRequest, com.amazonaws.services.kinesis.model.RemoveTagsFromStreamResult> {



	override fun build(): com.amazonaws.services.kinesis.model.RemoveTagsFromStreamRequest {
		val input = com.amazonaws.services.kinesis.model.RemoveTagsFromStreamRequest()
		input.setStreamName(this.streamName)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.RemoveTagsFromStreamResult {
	  return com.amazonaws.services.kinesis.model.RemoveTagsFromStreamResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.RemoveTagsFromStreamResult {
		return environment.kinesis.removeTagsFromStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis remove-tags-from-stream")
				.argument("stream-name", streamName)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonKinesisFunctions.splitShard(streamName: String, shardToSplit: String, newStartingHashKey: String, init: AmazonKinesisSplitShardCommand.() -> Unit): com.amazonaws.services.kinesis.model.SplitShardResult {
	return this.block.declare(AmazonKinesisSplitShardCommand(streamName, shardToSplit, newStartingHashKey).apply(init)) as com.amazonaws.services.kinesis.model.SplitShardResult
}

@Generated
class AmazonKinesisSplitShardCommand(val streamName: String, val shardToSplit: String, val newStartingHashKey: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.SplitShardRequest, com.amazonaws.services.kinesis.model.SplitShardResult> {



	override fun build(): com.amazonaws.services.kinesis.model.SplitShardRequest {
		val input = com.amazonaws.services.kinesis.model.SplitShardRequest()
		input.setStreamName(this.streamName)
		input.setShardToSplit(this.shardToSplit)
		input.setNewStartingHashKey(this.newStartingHashKey)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.SplitShardResult {
	  return com.amazonaws.services.kinesis.model.SplitShardResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.SplitShardResult {
		return environment.kinesis.splitShard(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis split-shard")
				.argument("stream-name", streamName)
				.argument("shard-to-split", shardToSplit)
				.argument("new-starting-hash-key", newStartingHashKey)
	}

}


fun AmazonKinesisFunctions.startStreamEncryption(streamName: String, encryptionType: EncryptionType, keyId: String, init: AmazonKinesisStartStreamEncryptionCommand.() -> Unit): com.amazonaws.services.kinesis.model.StartStreamEncryptionResult {
	return this.block.declare(AmazonKinesisStartStreamEncryptionCommand(streamName, encryptionType, keyId).apply(init)) as com.amazonaws.services.kinesis.model.StartStreamEncryptionResult
}

@Generated
class AmazonKinesisStartStreamEncryptionCommand(val streamName: String, val encryptionType: EncryptionType, val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.StartStreamEncryptionRequest, com.amazonaws.services.kinesis.model.StartStreamEncryptionResult> {



	override fun build(): com.amazonaws.services.kinesis.model.StartStreamEncryptionRequest {
		val input = com.amazonaws.services.kinesis.model.StartStreamEncryptionRequest()
		input.setStreamName(this.streamName)
		input.setEncryptionType(this.encryptionType.toString())
		input.setKeyId(this.keyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.StartStreamEncryptionResult {
	  return com.amazonaws.services.kinesis.model.StartStreamEncryptionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.StartStreamEncryptionResult {
		return environment.kinesis.startStreamEncryption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis start-stream-encryption")
				.argument("stream-name", streamName)
				.argument("encryption-type", encryptionType.toString())
				.argument("key-id", keyId)
	}

}


fun AmazonKinesisFunctions.stopStreamEncryption(streamName: String, encryptionType: EncryptionType, keyId: String, init: AmazonKinesisStopStreamEncryptionCommand.() -> Unit): com.amazonaws.services.kinesis.model.StopStreamEncryptionResult {
	return this.block.declare(AmazonKinesisStopStreamEncryptionCommand(streamName, encryptionType, keyId).apply(init)) as com.amazonaws.services.kinesis.model.StopStreamEncryptionResult
}

@Generated
class AmazonKinesisStopStreamEncryptionCommand(val streamName: String, val encryptionType: EncryptionType, val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.StopStreamEncryptionRequest, com.amazonaws.services.kinesis.model.StopStreamEncryptionResult> {



	override fun build(): com.amazonaws.services.kinesis.model.StopStreamEncryptionRequest {
		val input = com.amazonaws.services.kinesis.model.StopStreamEncryptionRequest()
		input.setStreamName(this.streamName)
		input.setEncryptionType(this.encryptionType.toString())
		input.setKeyId(this.keyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.StopStreamEncryptionResult {
	  return com.amazonaws.services.kinesis.model.StopStreamEncryptionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.StopStreamEncryptionResult {
		return environment.kinesis.stopStreamEncryption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis stop-stream-encryption")
				.argument("stream-name", streamName)
				.argument("encryption-type", encryptionType.toString())
				.argument("key-id", keyId)
	}

}


fun AmazonKinesisFunctions.updateShardCount(streamName: String, targetShardCount: Int, scalingType: ScalingType, init: AmazonKinesisUpdateShardCountCommand.() -> Unit): com.amazonaws.services.kinesis.model.UpdateShardCountResult {
	return this.block.declare(AmazonKinesisUpdateShardCountCommand(streamName, targetShardCount, scalingType).apply(init)) as com.amazonaws.services.kinesis.model.UpdateShardCountResult
}

@Generated
class AmazonKinesisUpdateShardCountCommand(val streamName: String, val targetShardCount: Int, val scalingType: ScalingType) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.UpdateShardCountRequest, com.amazonaws.services.kinesis.model.UpdateShardCountResult> {



	override fun build(): com.amazonaws.services.kinesis.model.UpdateShardCountRequest {
		val input = com.amazonaws.services.kinesis.model.UpdateShardCountRequest()
		input.setStreamName(this.streamName)
		input.setTargetShardCount(this.targetShardCount)
		input.setScalingType(this.scalingType.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesis.model.UpdateShardCountResult {
	  return com.amazonaws.services.kinesis.model.UpdateShardCountResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesis.model.UpdateShardCountResult {
		return environment.kinesis.updateShardCount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis update-shard-count")
				.argument("stream-name", streamName)
				.argument("target-shard-count", targetShardCount.toString())
				.argument("scaling-type", scalingType.toString())
	}

}
