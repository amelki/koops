
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.dynamodbstreams

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.dynamodbv2.*
import com.amazonaws.services.dynamodbv2.model.*

var codingue.koops.core.Environment.dynamodbstreams: AmazonDynamoDBStreams
	get() {
		var service = this.capabilities["aws-dynamodbstreams"]
		if (service == null) {
			service = AmazonDynamoDBStreamsClientBuilder.standard().build()
			this.capabilities["aws-dynamodbstreams"] = service
		}
		return service as AmazonDynamoDBStreams
	}
	set(dynamodbstreams) {
		this.capabilities["aws-dynamodbstreams"] = dynamodbstreams
	}

@Generated
class AmazonDynamoDBStreamsFunctions(val block: Block)

infix fun <T> AwsContinuation.dynamodbstreams(init: AmazonDynamoDBStreamsFunctions.() -> T): T {
	return AmazonDynamoDBStreamsFunctions(shell).run(init)
}

			

fun AmazonDynamoDBStreamsFunctions.describeStream(streamArn: String, init: AmazonDynamoDBStreamsDescribeStreamCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.DescribeStreamResult {
	return this.block.declare(AmazonDynamoDBStreamsDescribeStreamCommand(streamArn).apply(init)) as com.amazonaws.services.dynamodbv2.model.DescribeStreamResult
}

@Generated
class AmazonDynamoDBStreamsDescribeStreamCommand(val streamArn: String) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest, com.amazonaws.services.dynamodbv2.model.DescribeStreamResult> {

	var limit: Int? = 0
	var exclusiveStartShardId: String? = null

	override fun build(): com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest {
		val input = com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest()
		input.setStreamArn(this.streamArn)
		input.setLimit(this.limit)
		input.setExclusiveStartShardId(this.exclusiveStartShardId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.DescribeStreamResult {
	  return com.amazonaws.services.dynamodbv2.model.DescribeStreamResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.DescribeStreamResult {
		return environment.dynamodbstreams.describeStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodbstreams describe-stream")
				.argument("stream-arn", streamArn)
				.argument("limit", limit?.toString())
				.argument("exclusive-start-shard-id", exclusiveStartShardId)
	}

}


fun AmazonDynamoDBStreamsFunctions.getRecords(shardIterator: String, init: AmazonDynamoDBStreamsGetRecordsCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.GetRecordsResult {
	return this.block.declare(AmazonDynamoDBStreamsGetRecordsCommand(shardIterator).apply(init)) as com.amazonaws.services.dynamodbv2.model.GetRecordsResult
}

@Generated
class AmazonDynamoDBStreamsGetRecordsCommand(val shardIterator: String) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.GetRecordsRequest, com.amazonaws.services.dynamodbv2.model.GetRecordsResult> {

	var limit: Int? = 0

	override fun build(): com.amazonaws.services.dynamodbv2.model.GetRecordsRequest {
		val input = com.amazonaws.services.dynamodbv2.model.GetRecordsRequest()
		input.setShardIterator(this.shardIterator)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.GetRecordsResult {
	  return com.amazonaws.services.dynamodbv2.model.GetRecordsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.GetRecordsResult {
		return environment.dynamodbstreams.getRecords(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodbstreams get-records")
				.argument("shard-iterator", shardIterator)
				.argument("limit", limit?.toString())
	}

}


fun AmazonDynamoDBStreamsFunctions.getShardIterator(streamArn: String, shardId: String, shardIteratorType: ShardIteratorType, init: AmazonDynamoDBStreamsGetShardIteratorCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult {
	return this.block.declare(AmazonDynamoDBStreamsGetShardIteratorCommand(streamArn, shardId, shardIteratorType).apply(init)) as com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult
}

@Generated
class AmazonDynamoDBStreamsGetShardIteratorCommand(val streamArn: String, val shardId: String, val shardIteratorType: ShardIteratorType) : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest, com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult> {

	var sequenceNumber: String? = null

	override fun build(): com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest {
		val input = com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest()
		input.setStreamArn(this.streamArn)
		input.setShardId(this.shardId)
		input.setShardIteratorType(this.shardIteratorType.toString())
		input.setSequenceNumber(this.sequenceNumber)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult {
	  return com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult {
		return environment.dynamodbstreams.getShardIterator(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodbstreams get-shard-iterator")
				.argument("stream-arn", streamArn)
				.argument("shard-id", shardId)
				.argument("shard-iterator-type", shardIteratorType.toString())
				.argument("sequence-number", sequenceNumber)
	}

}


fun AmazonDynamoDBStreamsFunctions.listStreams(init: AmazonDynamoDBStreamsListStreamsCommand.() -> Unit): com.amazonaws.services.dynamodbv2.model.ListStreamsResult {
	return this.block.declare(AmazonDynamoDBStreamsListStreamsCommand().apply(init)) as com.amazonaws.services.dynamodbv2.model.ListStreamsResult
}

@Generated
class AmazonDynamoDBStreamsListStreamsCommand() : AmazonWebServiceCommand<com.amazonaws.services.dynamodbv2.model.ListStreamsRequest, com.amazonaws.services.dynamodbv2.model.ListStreamsResult> {

	var tableName: String? = null
	var limit: Int? = 0
	var exclusiveStartStreamArn: String? = null

	override fun build(): com.amazonaws.services.dynamodbv2.model.ListStreamsRequest {
		val input = com.amazonaws.services.dynamodbv2.model.ListStreamsRequest()
		input.setTableName(this.tableName)
		input.setLimit(this.limit)
		input.setExclusiveStartStreamArn(this.exclusiveStartStreamArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dynamodbv2.model.ListStreamsResult {
	  return com.amazonaws.services.dynamodbv2.model.ListStreamsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.dynamodbv2.model.ListStreamsResult {
		return environment.dynamodbstreams.listStreams(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dynamodbstreams list-streams")
				.argument("table-name", tableName)
				.argument("limit", limit?.toString())
				.argument("exclusive-start-stream-arn", exclusiveStartStreamArn)
	}

}
