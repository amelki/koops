
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.iot_jobs_data

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.iotjobsdataplane.*
import com.amazonaws.services.iotjobsdataplane.model.*

var codingue.koops.core.Environment.iot_jobs_data: AWSIoTJobsDataPlane
	get() {
		var service = this.capabilities["aws-iot_jobs_data"]
		if (service == null) {
			service = AWSIoTJobsDataPlaneClientBuilder.standard().build()
			this.capabilities["aws-iot_jobs_data"] = service
		}
		return service as AWSIoTJobsDataPlane
	}
	set(iot_jobs_data) {
		this.capabilities["aws-iot_jobs_data"] = iot_jobs_data
	}

@Generated
class AWSIoTJobsDataPlaneFunctions(val block: Block)

infix fun <T> AwsContinuation.iot_jobs_data(init: AWSIoTJobsDataPlaneFunctions.() -> T): T {
	return AWSIoTJobsDataPlaneFunctions(shell).run(init)
}

			

fun AWSIoTJobsDataPlaneFunctions.describeJobExecution(init: AWSIoTJobsDataPlaneDescribeJobExecutionCommand.() -> Unit): com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionResult {
	return this.block.declare(AWSIoTJobsDataPlaneDescribeJobExecutionCommand().apply(init)) as com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionResult
}

@Generated
class AWSIoTJobsDataPlaneDescribeJobExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest, com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionResult> {

	var jobId: String? = null
	var thingName: String? = null
	var includeJobDocument: Boolean? = false
	var executionNumber: Long? = 0L

	override fun build(): com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest {
		val input = com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest()
		input.setJobId(this.jobId)
		input.setThingName(this.thingName)
		input.setIncludeJobDocument(this.includeJobDocument)
		input.setExecutionNumber(this.executionNumber)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionResult {
	  return com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionResult {
		return environment.iot_jobs_data.describeJobExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iot-jobs-data describe-job-execution")
				.argument("job-id", jobId)
				.argument("thing-name", thingName)
				.option("include-job-document", includeJobDocument ?: false)
				.argument("execution-number", executionNumber?.toString())
	}

}


fun AWSIoTJobsDataPlaneFunctions.getPendingJobExecutions(init: AWSIoTJobsDataPlaneGetPendingJobExecutionsCommand.() -> Unit): com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsResult {
	return this.block.declare(AWSIoTJobsDataPlaneGetPendingJobExecutionsCommand().apply(init)) as com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsResult
}

@Generated
class AWSIoTJobsDataPlaneGetPendingJobExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest, com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsResult> {

	var thingName: String? = null

	override fun build(): com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest {
		val input = com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest()
		input.setThingName(this.thingName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsResult {
	  return com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsResult {
		return environment.iot_jobs_data.getPendingJobExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iot-jobs-data get-pending-job-executions")
				.argument("thing-name", thingName)
	}

}


fun AWSIoTJobsDataPlaneFunctions.startNextPendingJobExecution(init: AWSIoTJobsDataPlaneStartNextPendingJobExecutionCommand.() -> Unit): com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionResult {
	return this.block.declare(AWSIoTJobsDataPlaneStartNextPendingJobExecutionCommand().apply(init)) as com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionResult
}

@Generated
class AWSIoTJobsDataPlaneStartNextPendingJobExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest, com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionResult> {

	var thingName: String? = null
	var statusDetails: Map<String, String>? = null

	override fun build(): com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest {
		val input = com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest()
		input.setThingName(this.thingName)
		input.setStatusDetails(this.statusDetails)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionResult {
	  return com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionResult {
		return environment.iot_jobs_data.startNextPendingJobExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iot-jobs-data start-next-pending-job-execution")
				.argument("thing-name", thingName)
				.argument("status-details", statusDetails?.toString())
	}

}


fun AWSIoTJobsDataPlaneFunctions.updateJobExecution(init: AWSIoTJobsDataPlaneUpdateJobExecutionCommand.() -> Unit): com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionResult {
	return this.block.declare(AWSIoTJobsDataPlaneUpdateJobExecutionCommand().apply(init)) as com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionResult
}

@Generated
class AWSIoTJobsDataPlaneUpdateJobExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest, com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionResult> {

	var jobId: String? = null
	var thingName: String? = null
	var status: JobExecutionStatus? = null
	var statusDetails: Map<String, String>? = null
	var expectedVersion: Long? = 0L
	var includeJobExecutionState: Boolean? = false
	var includeJobDocument: Boolean? = false
	var executionNumber: Long? = 0L

	override fun build(): com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest {
		val input = com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest()
		input.setJobId(this.jobId)
		input.setThingName(this.thingName)
		input.setStatus(this.status?.toString())
		input.setStatusDetails(this.statusDetails)
		input.setExpectedVersion(this.expectedVersion)
		input.setIncludeJobExecutionState(this.includeJobExecutionState)
		input.setIncludeJobDocument(this.includeJobDocument)
		input.setExecutionNumber(this.executionNumber)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionResult {
	  return com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionResult {
		return environment.iot_jobs_data.updateJobExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iot-jobs-data update-job-execution")
				.argument("job-id", jobId)
				.argument("thing-name", thingName)
				.argument("status", status?.toString())
				.argument("status-details", statusDetails?.toString())
				.argument("expected-version", expectedVersion?.toString())
				.option("include-job-execution-state", includeJobExecutionState ?: false)
				.option("include-job-document", includeJobDocument ?: false)
				.argument("execution-number", executionNumber?.toString())
	}

}
