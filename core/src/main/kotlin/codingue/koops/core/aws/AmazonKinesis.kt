
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
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

infix fun AwsContinuation.kinesis(init: AmazonKinesisFunctions.() -> Unit) {
	AmazonKinesisFunctions(shell).apply(init)
}

			

fun AmazonKinesisFunctions.addTagsToStream(streamName: String, tags: Map<String, String>, init: AmazonKinesisAddTagsToStreamCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAddTagsToStreamCommand(streamName, tags).apply(init))
}

@Generated
class AmazonKinesisAddTagsToStreamCommand(val streamName: String, val tags: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.AddTagsToStreamRequest> {



	override fun build(): com.amazonaws.services.kinesis.model.AddTagsToStreamRequest {
		val input = com.amazonaws.services.kinesis.model.AddTagsToStreamRequest()
		input.setStreamName(this.streamName)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.addTagsToStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis add-tags-to-stream")
				.argument("stream-name", streamName)
				.argument("tags", tags.toString())
	}

}


fun AmazonKinesisFunctions.createStream(streamName: String, shardCount: Int, init: AmazonKinesisCreateStreamCommand.() -> Unit) {
	this.block.declare(AmazonKinesisCreateStreamCommand(streamName, shardCount).apply(init))
}

@Generated
class AmazonKinesisCreateStreamCommand(val streamName: String, val shardCount: Int) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.CreateStreamRequest> {



	override fun build(): com.amazonaws.services.kinesis.model.CreateStreamRequest {
		val input = com.amazonaws.services.kinesis.model.CreateStreamRequest()
		input.setStreamName(this.streamName)
		input.setShardCount(this.shardCount)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.createStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis create-stream")
				.argument("stream-name", streamName)
				.argument("shard-count", shardCount.toString())
	}

}


fun AmazonKinesisFunctions.decreaseStreamRetentionPeriod(streamName: String, retentionPeriodHours: Int, init: AmazonKinesisDecreaseStreamRetentionPeriodCommand.() -> Unit) {
	this.block.declare(AmazonKinesisDecreaseStreamRetentionPeriodCommand(streamName, retentionPeriodHours).apply(init))
}

@Generated
class AmazonKinesisDecreaseStreamRetentionPeriodCommand(val streamName: String, val retentionPeriodHours: Int) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodRequest> {



	override fun build(): com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodRequest {
		val input = com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodRequest()
		input.setStreamName(this.streamName)
		input.setRetentionPeriodHours(this.retentionPeriodHours)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.decreaseStreamRetentionPeriod(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis decrease-stream-retention-period")
				.argument("stream-name", streamName)
				.argument("retention-period-hours", retentionPeriodHours.toString())
	}

}


fun AmazonKinesisFunctions.deleteStream(streamName: String, init: AmazonKinesisDeleteStreamCommand.() -> Unit) {
	this.block.declare(AmazonKinesisDeleteStreamCommand(streamName).apply(init))
}

@Generated
class AmazonKinesisDeleteStreamCommand(val streamName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.DeleteStreamRequest> {



	override fun build(): com.amazonaws.services.kinesis.model.DeleteStreamRequest {
		val input = com.amazonaws.services.kinesis.model.DeleteStreamRequest()
		input.setStreamName(this.streamName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.deleteStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis delete-stream")
				.argument("stream-name", streamName)
	}

}


fun AmazonKinesisFunctions.describeLimits(init: AmazonKinesisDescribeLimitsCommand.() -> Unit) {
	this.block.declare(AmazonKinesisDescribeLimitsCommand().apply(init))
}

@Generated
class AmazonKinesisDescribeLimitsCommand() : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.DescribeLimitsRequest> {



	override fun build(): com.amazonaws.services.kinesis.model.DescribeLimitsRequest {
		val input = com.amazonaws.services.kinesis.model.DescribeLimitsRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.describeLimits(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis describe-limits")

	}

}


fun AmazonKinesisFunctions.describeStream(streamName: String, init: AmazonKinesisDescribeStreamCommand.() -> Unit) {
	this.block.declare(AmazonKinesisDescribeStreamCommand(streamName).apply(init))
}

@Generated
class AmazonKinesisDescribeStreamCommand(val streamName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.DescribeStreamRequest> {

	var limit: Int? = 0
	var exclusiveStartShardId: String? = null

	override fun build(): com.amazonaws.services.kinesis.model.DescribeStreamRequest {
		val input = com.amazonaws.services.kinesis.model.DescribeStreamRequest()
		input.setStreamName(this.streamName)
		input.setLimit(this.limit)
		input.setExclusiveStartShardId(this.exclusiveStartShardId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.describeStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis describe-stream")
				.argument("stream-name", streamName)
				.argument("limit", limit?.toString())
				.argument("exclusive-start-shard-id", exclusiveStartShardId)
	}

}


fun AmazonKinesisFunctions.describeStreamSummary(streamName: String, init: AmazonKinesisDescribeStreamSummaryCommand.() -> Unit) {
	this.block.declare(AmazonKinesisDescribeStreamSummaryCommand(streamName).apply(init))
}

@Generated
class AmazonKinesisDescribeStreamSummaryCommand(val streamName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.DescribeStreamSummaryRequest> {



	override fun build(): com.amazonaws.services.kinesis.model.DescribeStreamSummaryRequest {
		val input = com.amazonaws.services.kinesis.model.DescribeStreamSummaryRequest()
		input.setStreamName(this.streamName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.describeStreamSummary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis describe-stream-summary")
				.argument("stream-name", streamName)
	}

}


fun AmazonKinesisFunctions.disableEnhancedMonitoring(streamName: String, shardLevelMetrics: List<MetricsName>, init: AmazonKinesisDisableEnhancedMonitoringCommand.() -> Unit) {
	this.block.declare(AmazonKinesisDisableEnhancedMonitoringCommand(streamName, shardLevelMetrics).apply(init))
}

@Generated
class AmazonKinesisDisableEnhancedMonitoringCommand(val streamName: String, val shardLevelMetrics: List<MetricsName>) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest> {



	override fun build(): com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest {
		val input = com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest()
		input.setStreamName(this.streamName)
		input.setShardLevelMetrics(this.shardLevelMetrics.map { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.disableEnhancedMonitoring(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis disable-enhanced-monitoring")
				.argument("stream-name", streamName)
				.argument("shard-level-metrics", shardLevelMetrics.toString())
	}

}


fun AmazonKinesisFunctions.enableEnhancedMonitoring(streamName: String, shardLevelMetrics: List<MetricsName>, init: AmazonKinesisEnableEnhancedMonitoringCommand.() -> Unit) {
	this.block.declare(AmazonKinesisEnableEnhancedMonitoringCommand(streamName, shardLevelMetrics).apply(init))
}

@Generated
class AmazonKinesisEnableEnhancedMonitoringCommand(val streamName: String, val shardLevelMetrics: List<MetricsName>) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest> {



	override fun build(): com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest {
		val input = com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest()
		input.setStreamName(this.streamName)
		input.setShardLevelMetrics(this.shardLevelMetrics.map { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.enableEnhancedMonitoring(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis enable-enhanced-monitoring")
				.argument("stream-name", streamName)
				.argument("shard-level-metrics", shardLevelMetrics.toString())
	}

}


fun AmazonKinesisFunctions.getRecords(shardIterator: String, init: AmazonKinesisGetRecordsCommand.() -> Unit) {
	this.block.declare(AmazonKinesisGetRecordsCommand(shardIterator).apply(init))
}

@Generated
class AmazonKinesisGetRecordsCommand(val shardIterator: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.GetRecordsRequest> {

	var limit: Int? = 0

	override fun build(): com.amazonaws.services.kinesis.model.GetRecordsRequest {
		val input = com.amazonaws.services.kinesis.model.GetRecordsRequest()
		input.setShardIterator(this.shardIterator)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.getRecords(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis get-records")
				.argument("shard-iterator", shardIterator)
				.argument("limit", limit?.toString())
	}

}


fun AmazonKinesisFunctions.getShardIterator(streamName: String, shardId: String, shardIteratorType: ShardIteratorType, init: AmazonKinesisGetShardIteratorCommand.() -> Unit) {
	this.block.declare(AmazonKinesisGetShardIteratorCommand(streamName, shardId, shardIteratorType).apply(init))
}

@Generated
class AmazonKinesisGetShardIteratorCommand(val streamName: String, val shardId: String, val shardIteratorType: ShardIteratorType) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.GetShardIteratorRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.getShardIterator(build())
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


fun AmazonKinesisFunctions.increaseStreamRetentionPeriod(streamName: String, retentionPeriodHours: Int, init: AmazonKinesisIncreaseStreamRetentionPeriodCommand.() -> Unit) {
	this.block.declare(AmazonKinesisIncreaseStreamRetentionPeriodCommand(streamName, retentionPeriodHours).apply(init))
}

@Generated
class AmazonKinesisIncreaseStreamRetentionPeriodCommand(val streamName: String, val retentionPeriodHours: Int) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodRequest> {



	override fun build(): com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodRequest {
		val input = com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodRequest()
		input.setStreamName(this.streamName)
		input.setRetentionPeriodHours(this.retentionPeriodHours)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.increaseStreamRetentionPeriod(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis increase-stream-retention-period")
				.argument("stream-name", streamName)
				.argument("retention-period-hours", retentionPeriodHours.toString())
	}

}


fun AmazonKinesisFunctions.listShards(init: AmazonKinesisListShardsCommand.() -> Unit) {
	this.block.declare(AmazonKinesisListShardsCommand().apply(init))
}

@Generated
class AmazonKinesisListShardsCommand() : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.ListShardsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.listShards(build())
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


fun AmazonKinesisFunctions.listStreams(init: AmazonKinesisListStreamsCommand.() -> Unit) {
	this.block.declare(AmazonKinesisListStreamsCommand().apply(init))
}

@Generated
class AmazonKinesisListStreamsCommand() : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.ListStreamsRequest> {

	var limit: Int? = 0
	var exclusiveStartStreamName: String? = null

	override fun build(): com.amazonaws.services.kinesis.model.ListStreamsRequest {
		val input = com.amazonaws.services.kinesis.model.ListStreamsRequest()
		input.setLimit(this.limit)
		input.setExclusiveStartStreamName(this.exclusiveStartStreamName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.listStreams(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis list-streams")
				.argument("limit", limit?.toString())
				.argument("exclusive-start-stream-name", exclusiveStartStreamName)
	}

}


fun AmazonKinesisFunctions.listTagsForStream(streamName: String, init: AmazonKinesisListTagsForStreamCommand.() -> Unit) {
	this.block.declare(AmazonKinesisListTagsForStreamCommand(streamName).apply(init))
}

@Generated
class AmazonKinesisListTagsForStreamCommand(val streamName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.ListTagsForStreamRequest> {

	var exclusiveStartTagKey: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.kinesis.model.ListTagsForStreamRequest {
		val input = com.amazonaws.services.kinesis.model.ListTagsForStreamRequest()
		input.setStreamName(this.streamName)
		input.setExclusiveStartTagKey(this.exclusiveStartTagKey)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.listTagsForStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis list-tags-for-stream")
				.argument("stream-name", streamName)
				.argument("exclusive-start-tag-key", exclusiveStartTagKey)
				.argument("limit", limit?.toString())
	}

}


fun AmazonKinesisFunctions.mergeShards(streamName: String, shardToMerge: String, adjacentShardToMerge: String, init: AmazonKinesisMergeShardsCommand.() -> Unit) {
	this.block.declare(AmazonKinesisMergeShardsCommand(streamName, shardToMerge, adjacentShardToMerge).apply(init))
}

@Generated
class AmazonKinesisMergeShardsCommand(val streamName: String, val shardToMerge: String, val adjacentShardToMerge: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.MergeShardsRequest> {



	override fun build(): com.amazonaws.services.kinesis.model.MergeShardsRequest {
		val input = com.amazonaws.services.kinesis.model.MergeShardsRequest()
		input.setStreamName(this.streamName)
		input.setShardToMerge(this.shardToMerge)
		input.setAdjacentShardToMerge(this.adjacentShardToMerge)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.mergeShards(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis merge-shards")
				.argument("stream-name", streamName)
				.argument("shard-to-merge", shardToMerge)
				.argument("adjacent-shard-to-merge", adjacentShardToMerge)
	}

}


fun AmazonKinesisFunctions.putRecord(streamName: String, data: java.nio.ByteBuffer, partitionKey: String, init: AmazonKinesisPutRecordCommand.() -> Unit) {
	this.block.declare(AmazonKinesisPutRecordCommand(streamName, data, partitionKey).apply(init))
}

@Generated
class AmazonKinesisPutRecordCommand(val streamName: String, val data: java.nio.ByteBuffer, val partitionKey: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.PutRecordRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.putRecord(build())
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


fun AmazonKinesisFunctions.putRecords(records: List<com.amazonaws.services.kinesis.model.PutRecordsRequestEntry>, streamName: String, init: AmazonKinesisPutRecordsCommand.() -> Unit) {
	this.block.declare(AmazonKinesisPutRecordsCommand(records, streamName).apply(init))
}

@Generated
class AmazonKinesisPutRecordsCommand(val records: List<com.amazonaws.services.kinesis.model.PutRecordsRequestEntry>, val streamName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.PutRecordsRequest> {



	override fun build(): com.amazonaws.services.kinesis.model.PutRecordsRequest {
		val input = com.amazonaws.services.kinesis.model.PutRecordsRequest()
		input.setRecords(this.records)
		input.setStreamName(this.streamName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.putRecords(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis put-records")
				.argument("records", records.toString())
				.argument("stream-name", streamName)
	}

}


fun AmazonKinesisFunctions.removeTagsFromStream(streamName: String, tagKeys: List<String>, init: AmazonKinesisRemoveTagsFromStreamCommand.() -> Unit) {
	this.block.declare(AmazonKinesisRemoveTagsFromStreamCommand(streamName, tagKeys).apply(init))
}

@Generated
class AmazonKinesisRemoveTagsFromStreamCommand(val streamName: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.RemoveTagsFromStreamRequest> {



	override fun build(): com.amazonaws.services.kinesis.model.RemoveTagsFromStreamRequest {
		val input = com.amazonaws.services.kinesis.model.RemoveTagsFromStreamRequest()
		input.setStreamName(this.streamName)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.removeTagsFromStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis remove-tags-from-stream")
				.argument("stream-name", streamName)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonKinesisFunctions.splitShard(streamName: String, shardToSplit: String, newStartingHashKey: String, init: AmazonKinesisSplitShardCommand.() -> Unit) {
	this.block.declare(AmazonKinesisSplitShardCommand(streamName, shardToSplit, newStartingHashKey).apply(init))
}

@Generated
class AmazonKinesisSplitShardCommand(val streamName: String, val shardToSplit: String, val newStartingHashKey: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.SplitShardRequest> {



	override fun build(): com.amazonaws.services.kinesis.model.SplitShardRequest {
		val input = com.amazonaws.services.kinesis.model.SplitShardRequest()
		input.setStreamName(this.streamName)
		input.setShardToSplit(this.shardToSplit)
		input.setNewStartingHashKey(this.newStartingHashKey)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.splitShard(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis split-shard")
				.argument("stream-name", streamName)
				.argument("shard-to-split", shardToSplit)
				.argument("new-starting-hash-key", newStartingHashKey)
	}

}


fun AmazonKinesisFunctions.startStreamEncryption(streamName: String, encryptionType: EncryptionType, keyId: String, init: AmazonKinesisStartStreamEncryptionCommand.() -> Unit) {
	this.block.declare(AmazonKinesisStartStreamEncryptionCommand(streamName, encryptionType, keyId).apply(init))
}

@Generated
class AmazonKinesisStartStreamEncryptionCommand(val streamName: String, val encryptionType: EncryptionType, val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.StartStreamEncryptionRequest> {



	override fun build(): com.amazonaws.services.kinesis.model.StartStreamEncryptionRequest {
		val input = com.amazonaws.services.kinesis.model.StartStreamEncryptionRequest()
		input.setStreamName(this.streamName)
		input.setEncryptionType(this.encryptionType.toString())
		input.setKeyId(this.keyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.startStreamEncryption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis start-stream-encryption")
				.argument("stream-name", streamName)
				.argument("encryption-type", encryptionType.toString())
				.argument("key-id", keyId)
	}

}


fun AmazonKinesisFunctions.stopStreamEncryption(streamName: String, encryptionType: EncryptionType, keyId: String, init: AmazonKinesisStopStreamEncryptionCommand.() -> Unit) {
	this.block.declare(AmazonKinesisStopStreamEncryptionCommand(streamName, encryptionType, keyId).apply(init))
}

@Generated
class AmazonKinesisStopStreamEncryptionCommand(val streamName: String, val encryptionType: EncryptionType, val keyId: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.StopStreamEncryptionRequest> {



	override fun build(): com.amazonaws.services.kinesis.model.StopStreamEncryptionRequest {
		val input = com.amazonaws.services.kinesis.model.StopStreamEncryptionRequest()
		input.setStreamName(this.streamName)
		input.setEncryptionType(this.encryptionType.toString())
		input.setKeyId(this.keyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.stopStreamEncryption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis stop-stream-encryption")
				.argument("stream-name", streamName)
				.argument("encryption-type", encryptionType.toString())
				.argument("key-id", keyId)
	}

}


fun AmazonKinesisFunctions.updateShardCount(streamName: String, targetShardCount: Int, scalingType: ScalingType, init: AmazonKinesisUpdateShardCountCommand.() -> Unit) {
	this.block.declare(AmazonKinesisUpdateShardCountCommand(streamName, targetShardCount, scalingType).apply(init))
}

@Generated
class AmazonKinesisUpdateShardCountCommand(val streamName: String, val targetShardCount: Int, val scalingType: ScalingType) : AmazonWebServiceCommand<com.amazonaws.services.kinesis.model.UpdateShardCountRequest> {



	override fun build(): com.amazonaws.services.kinesis.model.UpdateShardCountRequest {
		val input = com.amazonaws.services.kinesis.model.UpdateShardCountRequest()
		input.setStreamName(this.streamName)
		input.setTargetShardCount(this.targetShardCount)
		input.setScalingType(this.scalingType.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesis.updateShardCount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesis update-shard-count")
				.argument("stream-name", streamName)
				.argument("target-shard-count", targetShardCount.toString())
				.argument("scaling-type", scalingType.toString())
	}

}
