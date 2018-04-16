
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.xray

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.xray.*

var com.codingue.koops.core.Environment.xray: AWSXRay
	get() {
		var service = this.capabilities["aws-xray"]
		if (service == null) {
			service = AWSXRayClientBuilder.standard().build()
			this.capabilities["aws-xray"] = service
		}
		return service as AWSXRay
	}
	set(xray) {
		this.capabilities["aws-xray"] = xray
	}

@Generated
class AWSXRayFunctions(val block: Script)

infix fun <T> AwsContinuation.xray(init: AWSXRayFunctions.() -> T): T {
	return AWSXRayFunctions(shell).run(init)
}

			

fun AWSXRayFunctions.batchGetTraces(traceIds: List<String>, init: (AWSXRayBatchGetTracesCommand.() -> Unit)? = null): com.amazonaws.services.xray.model.BatchGetTracesResult {
	return this.block.declare(AWSXRayBatchGetTracesCommand(traceIds).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.xray.model.BatchGetTracesResult
}

@Generated
class AWSXRayBatchGetTracesCommand(val traceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.xray.model.BatchGetTracesRequest, com.amazonaws.services.xray.model.BatchGetTracesResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.xray.model.BatchGetTracesRequest {
		val input = com.amazonaws.services.xray.model.BatchGetTracesRequest()
		input.setTraceIds(this.traceIds)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.xray.model.BatchGetTracesResult {
	  return com.amazonaws.services.xray.model.BatchGetTracesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.xray.model.BatchGetTracesResult {
		return environment.xray.batchGetTraces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws xray batch-get-traces")
				.argument("trace-ids", traceIds.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSXRayFunctions.getServiceGraph(startTime: java.util.Date, endTime: java.util.Date, init: (AWSXRayGetServiceGraphCommand.() -> Unit)? = null): com.amazonaws.services.xray.model.GetServiceGraphResult {
	return this.block.declare(AWSXRayGetServiceGraphCommand(startTime, endTime).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.xray.model.GetServiceGraphResult
}

@Generated
class AWSXRayGetServiceGraphCommand(val startTime: java.util.Date, val endTime: java.util.Date) : AmazonWebServiceCommand<com.amazonaws.services.xray.model.GetServiceGraphRequest, com.amazonaws.services.xray.model.GetServiceGraphResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.xray.model.GetServiceGraphRequest {
		val input = com.amazonaws.services.xray.model.GetServiceGraphRequest()
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.xray.model.GetServiceGraphResult {
	  return com.amazonaws.services.xray.model.GetServiceGraphResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.xray.model.GetServiceGraphResult {
		return environment.xray.getServiceGraph(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws xray get-service-graph")
				.argument("start-time", startTime.toString())
				.argument("end-time", endTime.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSXRayFunctions.getTraceGraph(traceIds: List<String>, init: (AWSXRayGetTraceGraphCommand.() -> Unit)? = null): com.amazonaws.services.xray.model.GetTraceGraphResult {
	return this.block.declare(AWSXRayGetTraceGraphCommand(traceIds).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.xray.model.GetTraceGraphResult
}

@Generated
class AWSXRayGetTraceGraphCommand(val traceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.xray.model.GetTraceGraphRequest, com.amazonaws.services.xray.model.GetTraceGraphResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.xray.model.GetTraceGraphRequest {
		val input = com.amazonaws.services.xray.model.GetTraceGraphRequest()
		input.setTraceIds(this.traceIds)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.xray.model.GetTraceGraphResult {
	  return com.amazonaws.services.xray.model.GetTraceGraphResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.xray.model.GetTraceGraphResult {
		return environment.xray.getTraceGraph(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws xray get-trace-graph")
				.argument("trace-ids", traceIds.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSXRayFunctions.getTraceSummaries(startTime: java.util.Date, endTime: java.util.Date, init: (AWSXRayGetTraceSummariesCommand.() -> Unit)? = null): com.amazonaws.services.xray.model.GetTraceSummariesResult {
	return this.block.declare(AWSXRayGetTraceSummariesCommand(startTime, endTime).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.xray.model.GetTraceSummariesResult
}

@Generated
class AWSXRayGetTraceSummariesCommand(val startTime: java.util.Date, val endTime: java.util.Date) : AmazonWebServiceCommand<com.amazonaws.services.xray.model.GetTraceSummariesRequest, com.amazonaws.services.xray.model.GetTraceSummariesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.xray.model.GetTraceSummariesResult {
	  return com.amazonaws.services.xray.model.GetTraceSummariesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.xray.model.GetTraceSummariesResult {
		return environment.xray.getTraceSummaries(build())
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


fun AWSXRayFunctions.putTelemetryRecords(telemetryRecords: List<com.amazonaws.services.xray.model.TelemetryRecord>, init: (AWSXRayPutTelemetryRecordsCommand.() -> Unit)? = null): com.amazonaws.services.xray.model.PutTelemetryRecordsResult {
	return this.block.declare(AWSXRayPutTelemetryRecordsCommand(telemetryRecords).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.xray.model.PutTelemetryRecordsResult
}

@Generated
class AWSXRayPutTelemetryRecordsCommand(val telemetryRecords: List<com.amazonaws.services.xray.model.TelemetryRecord>) : AmazonWebServiceCommand<com.amazonaws.services.xray.model.PutTelemetryRecordsRequest, com.amazonaws.services.xray.model.PutTelemetryRecordsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.xray.model.PutTelemetryRecordsResult {
	  return com.amazonaws.services.xray.model.PutTelemetryRecordsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.xray.model.PutTelemetryRecordsResult {
		return environment.xray.putTelemetryRecords(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws xray put-telemetry-records")
				.argument("telemetry-records", telemetryRecords.toString())
				.argument("ec2-instance-id", eC2InstanceId)
				.argument("hostname", hostname)
				.argument("resource-arn", resourceARN)
	}

}


fun AWSXRayFunctions.putTraceSegments(traceSegmentDocuments: List<String>, init: (AWSXRayPutTraceSegmentsCommand.() -> Unit)? = null): com.amazonaws.services.xray.model.PutTraceSegmentsResult {
	return this.block.declare(AWSXRayPutTraceSegmentsCommand(traceSegmentDocuments).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.xray.model.PutTraceSegmentsResult
}

@Generated
class AWSXRayPutTraceSegmentsCommand(val traceSegmentDocuments: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.xray.model.PutTraceSegmentsRequest, com.amazonaws.services.xray.model.PutTraceSegmentsResult> {



	override fun build(): com.amazonaws.services.xray.model.PutTraceSegmentsRequest {
		val input = com.amazonaws.services.xray.model.PutTraceSegmentsRequest()
		input.setTraceSegmentDocuments(this.traceSegmentDocuments)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.xray.model.PutTraceSegmentsResult {
	  return com.amazonaws.services.xray.model.PutTraceSegmentsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.xray.model.PutTraceSegmentsResult {
		return environment.xray.putTraceSegments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws xray put-trace-segments")
				.argument("trace-segment-documents", traceSegmentDocuments.toString())
	}

}
