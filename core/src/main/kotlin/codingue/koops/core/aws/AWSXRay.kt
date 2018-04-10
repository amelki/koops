
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.xray.AWSXRay
import com.amazonaws.services.xray.model.*

var codingue.koops.core.Environment.xray: AWSXRay
	get() = this.capabilities[AWSXRay::class.java.name] as AWSXRay
	set(xray) {
		this.capabilities[AWSXRay::class.java.name] = xray
	}

@Generated
class AWSXRayFunctions(val block: Block)

infix fun AwsContinuation.xray(init: AWSXRayFunctions.() -> Unit) {
	AWSXRayFunctions(shell).apply(init)
}

			

fun AWSXRayFunctions.batchGetTraces(traceIds: List<String>, init: AWSXRayBatchGetTracesCommand.() -> Unit) {
	this.block.declare(AWSXRayBatchGetTracesCommand(traceIds).apply(init))
}

@Generated
class AWSXRayBatchGetTracesCommand(val traceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.xray.model.BatchGetTracesRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.xray.model.BatchGetTracesRequest {
		val input = com.amazonaws.services.xray.model.BatchGetTracesRequest()
		input.setTraceIds(this.traceIds)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.xray.batchGetTraces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws xray batch-get-traces")
				.argument("trace-ids", traceIds.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSXRayFunctions.getServiceGraph(startTime: java.util.Date, endTime: java.util.Date, init: AWSXRayGetServiceGraphCommand.() -> Unit) {
	this.block.declare(AWSXRayGetServiceGraphCommand(startTime, endTime).apply(init))
}

@Generated
class AWSXRayGetServiceGraphCommand(val startTime: java.util.Date, val endTime: java.util.Date) : AmazonWebServiceCommand<com.amazonaws.services.xray.model.GetServiceGraphRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.xray.model.GetServiceGraphRequest {
		val input = com.amazonaws.services.xray.model.GetServiceGraphRequest()
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.xray.getServiceGraph(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws xray get-service-graph")
				.argument("start-time", startTime.toString())
				.argument("end-time", endTime.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSXRayFunctions.getTraceGraph(traceIds: List<String>, init: AWSXRayGetTraceGraphCommand.() -> Unit) {
	this.block.declare(AWSXRayGetTraceGraphCommand(traceIds).apply(init))
}

@Generated
class AWSXRayGetTraceGraphCommand(val traceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.xray.model.GetTraceGraphRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.xray.model.GetTraceGraphRequest {
		val input = com.amazonaws.services.xray.model.GetTraceGraphRequest()
		input.setTraceIds(this.traceIds)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.xray.getTraceGraph(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws xray get-trace-graph")
				.argument("trace-ids", traceIds.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSXRayFunctions.getTraceSummaries(startTime: java.util.Date, endTime: java.util.Date, init: AWSXRayGetTraceSummariesCommand.() -> Unit) {
	this.block.declare(AWSXRayGetTraceSummariesCommand(startTime, endTime).apply(init))
}

@Generated
class AWSXRayGetTraceSummariesCommand(val startTime: java.util.Date, val endTime: java.util.Date) : AmazonWebServiceCommand<com.amazonaws.services.xray.model.GetTraceSummariesRequest> {

	var sampling: Boolean? = false
	var filterExpression: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.xray.model.GetTraceSummariesRequest {
		val input = com.amazonaws.services.xray.model.GetTraceSummariesRequest()
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setSampling(this.sampling)
		input.setFilterExpression(this.filterExpression)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.xray.getTraceSummaries(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws xray get-trace-summaries")
				.argument("start-time", startTime.toString())
				.argument("end-time", endTime.toString())
				.option("sampling", sampling ?: false)
				.argument("filter-expression", filterExpression)
				.argument("next-token", nextToken)
	}

}


fun AWSXRayFunctions.putTelemetryRecords(telemetryRecords: List<com.amazonaws.services.xray.model.TelemetryRecord>, init: AWSXRayPutTelemetryRecordsCommand.() -> Unit) {
	this.block.declare(AWSXRayPutTelemetryRecordsCommand(telemetryRecords).apply(init))
}

@Generated
class AWSXRayPutTelemetryRecordsCommand(val telemetryRecords: List<com.amazonaws.services.xray.model.TelemetryRecord>) : AmazonWebServiceCommand<com.amazonaws.services.xray.model.PutTelemetryRecordsRequest> {

	var eC2InstanceId: String? = null
	var hostname: String? = null
	var resourceARN: String? = null

	override fun build(): com.amazonaws.services.xray.model.PutTelemetryRecordsRequest {
		val input = com.amazonaws.services.xray.model.PutTelemetryRecordsRequest()
		input.setTelemetryRecords(this.telemetryRecords)
		input.setEC2InstanceId(this.eC2InstanceId)
		input.setHostname(this.hostname)
		input.setResourceARN(this.resourceARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.xray.putTelemetryRecords(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws xray put-telemetry-records")
				.argument("telemetry-records", telemetryRecords.toString())
				.argument("ec2-instance-id", eC2InstanceId)
				.argument("hostname", hostname)
				.argument("resource-arn", resourceARN)
	}

}


fun AWSXRayFunctions.putTraceSegments(traceSegmentDocuments: List<String>, init: AWSXRayPutTraceSegmentsCommand.() -> Unit) {
	this.block.declare(AWSXRayPutTraceSegmentsCommand(traceSegmentDocuments).apply(init))
}

@Generated
class AWSXRayPutTraceSegmentsCommand(val traceSegmentDocuments: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.xray.model.PutTraceSegmentsRequest> {



	override fun build(): com.amazonaws.services.xray.model.PutTraceSegmentsRequest {
		val input = com.amazonaws.services.xray.model.PutTraceSegmentsRequest()
		input.setTraceSegmentDocuments(this.traceSegmentDocuments)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.xray.putTraceSegments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws xray put-trace-segments")
				.argument("trace-segment-documents", traceSegmentDocuments.toString())
	}

}