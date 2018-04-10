
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehose
import com.amazonaws.services.kinesisfirehose.model.*

var codingue.koops.core.Environment.firehose: AmazonKinesisFirehose
	get() = this.capabilities[AmazonKinesisFirehose::class.java.name] as AmazonKinesisFirehose
	set(firehose) {
		this.capabilities[AmazonKinesisFirehose::class.java.name] = firehose
	}

@Generated
class AmazonKinesisFirehoseFunctions(val block: Block)

infix fun AwsContinuation.firehose(init: AmazonKinesisFirehoseFunctions.() -> Unit) {
	AmazonKinesisFirehoseFunctions(shell).apply(init)
}

			

fun AmazonKinesisFirehoseFunctions.createDeliveryStream(deliveryStreamName: String, init: AmazonKinesisFirehoseCreateDeliveryStreamCommand.() -> Unit) {
	this.block.declare(AmazonKinesisFirehoseCreateDeliveryStreamCommand(deliveryStreamName).apply(init))
}

@Generated
class AmazonKinesisFirehoseCreateDeliveryStreamCommand(val deliveryStreamName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisfirehose.model.CreateDeliveryStreamRequest> {

	var deliveryStreamType: DeliveryStreamType? = null
	var kinesisStreamSourceConfiguration: com.amazonaws.services.kinesisfirehose.model.KinesisStreamSourceConfiguration? = null
	var s3DestinationConfiguration: com.amazonaws.services.kinesisfirehose.model.S3DestinationConfiguration? = null
	var extendedS3DestinationConfiguration: com.amazonaws.services.kinesisfirehose.model.ExtendedS3DestinationConfiguration? = null
	var redshiftDestinationConfiguration: com.amazonaws.services.kinesisfirehose.model.RedshiftDestinationConfiguration? = null
	var elasticsearchDestinationConfiguration: com.amazonaws.services.kinesisfirehose.model.ElasticsearchDestinationConfiguration? = null
	var splunkDestinationConfiguration: com.amazonaws.services.kinesisfirehose.model.SplunkDestinationConfiguration? = null

	override fun build(): com.amazonaws.services.kinesisfirehose.model.CreateDeliveryStreamRequest {
		val input = com.amazonaws.services.kinesisfirehose.model.CreateDeliveryStreamRequest()
		input.setDeliveryStreamName(this.deliveryStreamName)
		input.setDeliveryStreamType(this.deliveryStreamType?.toString())
		input.setKinesisStreamSourceConfiguration(this.kinesisStreamSourceConfiguration)
		input.setS3DestinationConfiguration(this.s3DestinationConfiguration)
		input.setExtendedS3DestinationConfiguration(this.extendedS3DestinationConfiguration)
		input.setRedshiftDestinationConfiguration(this.redshiftDestinationConfiguration)
		input.setElasticsearchDestinationConfiguration(this.elasticsearchDestinationConfiguration)
		input.setSplunkDestinationConfiguration(this.splunkDestinationConfiguration)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.firehose.createDeliveryStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws firehose create-delivery-stream")
				.argument("delivery-stream-name", deliveryStreamName)
				.argument("delivery-stream-type", deliveryStreamType?.toString())
				.argument("kinesis-stream-source-configuration", kinesisStreamSourceConfiguration?.toString())
				.argument("s3-destination-configuration", s3DestinationConfiguration?.toString())
				.argument("extended-s3-destination-configuration", extendedS3DestinationConfiguration?.toString())
				.argument("redshift-destination-configuration", redshiftDestinationConfiguration?.toString())
				.argument("elasticsearch-destination-configuration", elasticsearchDestinationConfiguration?.toString())
				.argument("splunk-destination-configuration", splunkDestinationConfiguration?.toString())
	}

}


fun AmazonKinesisFirehoseFunctions.deleteDeliveryStream(deliveryStreamName: String, init: AmazonKinesisFirehoseDeleteDeliveryStreamCommand.() -> Unit) {
	this.block.declare(AmazonKinesisFirehoseDeleteDeliveryStreamCommand(deliveryStreamName).apply(init))
}

@Generated
class AmazonKinesisFirehoseDeleteDeliveryStreamCommand(val deliveryStreamName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisfirehose.model.DeleteDeliveryStreamRequest> {



	override fun build(): com.amazonaws.services.kinesisfirehose.model.DeleteDeliveryStreamRequest {
		val input = com.amazonaws.services.kinesisfirehose.model.DeleteDeliveryStreamRequest()
		input.setDeliveryStreamName(this.deliveryStreamName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.firehose.deleteDeliveryStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws firehose delete-delivery-stream")
				.argument("delivery-stream-name", deliveryStreamName)
	}

}


fun AmazonKinesisFirehoseFunctions.describeDeliveryStream(deliveryStreamName: String, init: AmazonKinesisFirehoseDescribeDeliveryStreamCommand.() -> Unit) {
	this.block.declare(AmazonKinesisFirehoseDescribeDeliveryStreamCommand(deliveryStreamName).apply(init))
}

@Generated
class AmazonKinesisFirehoseDescribeDeliveryStreamCommand(val deliveryStreamName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisfirehose.model.DescribeDeliveryStreamRequest> {

	var limit: Int? = 0
	var exclusiveStartDestinationId: String? = null

	override fun build(): com.amazonaws.services.kinesisfirehose.model.DescribeDeliveryStreamRequest {
		val input = com.amazonaws.services.kinesisfirehose.model.DescribeDeliveryStreamRequest()
		input.setDeliveryStreamName(this.deliveryStreamName)
		input.setLimit(this.limit)
		input.setExclusiveStartDestinationId(this.exclusiveStartDestinationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.firehose.describeDeliveryStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws firehose describe-delivery-stream")
				.argument("delivery-stream-name", deliveryStreamName)
				.argument("limit", limit?.toString())
				.argument("exclusive-start-destination-id", exclusiveStartDestinationId)
	}

}


fun AmazonKinesisFirehoseFunctions.listDeliveryStreams(init: AmazonKinesisFirehoseListDeliveryStreamsCommand.() -> Unit) {
	this.block.declare(AmazonKinesisFirehoseListDeliveryStreamsCommand().apply(init))
}

@Generated
class AmazonKinesisFirehoseListDeliveryStreamsCommand() : AmazonWebServiceCommand<com.amazonaws.services.kinesisfirehose.model.ListDeliveryStreamsRequest> {

	var limit: Int? = 0
	var deliveryStreamType: DeliveryStreamType? = null
	var exclusiveStartDeliveryStreamName: String? = null

	override fun build(): com.amazonaws.services.kinesisfirehose.model.ListDeliveryStreamsRequest {
		val input = com.amazonaws.services.kinesisfirehose.model.ListDeliveryStreamsRequest()
		input.setLimit(this.limit)
		input.setDeliveryStreamType(this.deliveryStreamType?.toString())
		input.setExclusiveStartDeliveryStreamName(this.exclusiveStartDeliveryStreamName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.firehose.listDeliveryStreams(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws firehose list-delivery-streams")
				.argument("limit", limit?.toString())
				.argument("delivery-stream-type", deliveryStreamType?.toString())
				.argument("exclusive-start-delivery-stream-name", exclusiveStartDeliveryStreamName)
	}

}


fun AmazonKinesisFirehoseFunctions.putRecord(deliveryStreamName: String, record: com.amazonaws.services.kinesisfirehose.model.Record, init: AmazonKinesisFirehosePutRecordCommand.() -> Unit) {
	this.block.declare(AmazonKinesisFirehosePutRecordCommand(deliveryStreamName, record).apply(init))
}

@Generated
class AmazonKinesisFirehosePutRecordCommand(val deliveryStreamName: String, val record: com.amazonaws.services.kinesisfirehose.model.Record) : AmazonWebServiceCommand<com.amazonaws.services.kinesisfirehose.model.PutRecordRequest> {



	override fun build(): com.amazonaws.services.kinesisfirehose.model.PutRecordRequest {
		val input = com.amazonaws.services.kinesisfirehose.model.PutRecordRequest()
		input.setDeliveryStreamName(this.deliveryStreamName)
		input.setRecord(this.record)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.firehose.putRecord(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws firehose put-record")
				.argument("delivery-stream-name", deliveryStreamName)
				.argument("record", record.toString())
	}

}


fun AmazonKinesisFirehoseFunctions.putRecordBatch(deliveryStreamName: String, records: List<com.amazonaws.services.kinesisfirehose.model.Record>, init: AmazonKinesisFirehosePutRecordBatchCommand.() -> Unit) {
	this.block.declare(AmazonKinesisFirehosePutRecordBatchCommand(deliveryStreamName, records).apply(init))
}

@Generated
class AmazonKinesisFirehosePutRecordBatchCommand(val deliveryStreamName: String, val records: List<com.amazonaws.services.kinesisfirehose.model.Record>) : AmazonWebServiceCommand<com.amazonaws.services.kinesisfirehose.model.PutRecordBatchRequest> {



	override fun build(): com.amazonaws.services.kinesisfirehose.model.PutRecordBatchRequest {
		val input = com.amazonaws.services.kinesisfirehose.model.PutRecordBatchRequest()
		input.setDeliveryStreamName(this.deliveryStreamName)
		input.setRecords(this.records)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.firehose.putRecordBatch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws firehose put-record-batch")
				.argument("delivery-stream-name", deliveryStreamName)
				.argument("records", records.toString())
	}

}


fun AmazonKinesisFirehoseFunctions.updateDestination(deliveryStreamName: String, currentDeliveryStreamVersionId: String, destinationId: String, init: AmazonKinesisFirehoseUpdateDestinationCommand.() -> Unit) {
	this.block.declare(AmazonKinesisFirehoseUpdateDestinationCommand(deliveryStreamName, currentDeliveryStreamVersionId, destinationId).apply(init))
}

@Generated
class AmazonKinesisFirehoseUpdateDestinationCommand(val deliveryStreamName: String, val currentDeliveryStreamVersionId: String, val destinationId: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisfirehose.model.UpdateDestinationRequest> {

	var s3DestinationUpdate: com.amazonaws.services.kinesisfirehose.model.S3DestinationUpdate? = null
	var extendedS3DestinationUpdate: com.amazonaws.services.kinesisfirehose.model.ExtendedS3DestinationUpdate? = null
	var redshiftDestinationUpdate: com.amazonaws.services.kinesisfirehose.model.RedshiftDestinationUpdate? = null
	var elasticsearchDestinationUpdate: com.amazonaws.services.kinesisfirehose.model.ElasticsearchDestinationUpdate? = null
	var splunkDestinationUpdate: com.amazonaws.services.kinesisfirehose.model.SplunkDestinationUpdate? = null

	override fun build(): com.amazonaws.services.kinesisfirehose.model.UpdateDestinationRequest {
		val input = com.amazonaws.services.kinesisfirehose.model.UpdateDestinationRequest()
		input.setDeliveryStreamName(this.deliveryStreamName)
		input.setCurrentDeliveryStreamVersionId(this.currentDeliveryStreamVersionId)
		input.setDestinationId(this.destinationId)
		input.setS3DestinationUpdate(this.s3DestinationUpdate)
		input.setExtendedS3DestinationUpdate(this.extendedS3DestinationUpdate)
		input.setRedshiftDestinationUpdate(this.redshiftDestinationUpdate)
		input.setElasticsearchDestinationUpdate(this.elasticsearchDestinationUpdate)
		input.setSplunkDestinationUpdate(this.splunkDestinationUpdate)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.firehose.updateDestination(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws firehose update-destination")
				.argument("delivery-stream-name", deliveryStreamName)
				.argument("current-delivery-stream-version-id", currentDeliveryStreamVersionId)
				.argument("destination-id", destinationId)
				.argument("s3-destination-update", s3DestinationUpdate?.toString())
				.argument("extended-s3-destination-update", extendedS3DestinationUpdate?.toString())
				.argument("redshift-destination-update", redshiftDestinationUpdate?.toString())
				.argument("elasticsearch-destination-update", elasticsearchDestinationUpdate?.toString())
				.argument("splunk-destination-update", splunkDestinationUpdate?.toString())
	}

}
