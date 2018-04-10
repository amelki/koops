
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.iotjobsdataplane.AWSIoTJobsDataPlane
import com.amazonaws.services.iotjobsdataplane.model.*

var codingue.koops.core.Environment.iot_jobs_data: AWSIoTJobsDataPlane
	get() = this.capabilities[AWSIoTJobsDataPlane::class.java.name] as AWSIoTJobsDataPlane
	set(iot_jobs_data) {
		this.capabilities[AWSIoTJobsDataPlane::class.java.name] = iot_jobs_data
	}

@Generated
class AWSIoTJobsDataPlaneFunctions(val block: Block)

infix fun AwsContinuation.iot_jobs_data(init: AWSIoTJobsDataPlaneFunctions.() -> Unit) {
	AWSIoTJobsDataPlaneFunctions(shell).apply(init)
}

			

fun AWSIoTJobsDataPlaneFunctions.describeJobExecution(init: AWSIoTJobsDataPlaneDescribeJobExecutionCommand.() -> Unit) {
	this.block.declare(AWSIoTJobsDataPlaneDescribeJobExecutionCommand().apply(init))
}

@Generated
class AWSIoTJobsDataPlaneDescribeJobExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iot_jobs_data.describeJobExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iot-jobs-data describe-job-execution")
				.argument("job-id", jobId)
				.argument("thing-name", thingName)
				.option("include-job-document", includeJobDocument ?: false)
				.argument("execution-number", executionNumber?.toString())
	}

}


fun AWSIoTJobsDataPlaneFunctions.getPendingJobExecutions(init: AWSIoTJobsDataPlaneGetPendingJobExecutionsCommand.() -> Unit) {
	this.block.declare(AWSIoTJobsDataPlaneGetPendingJobExecutionsCommand().apply(init))
}

@Generated
class AWSIoTJobsDataPlaneGetPendingJobExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest> {

	var thingName: String? = null

	override fun build(): com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest {
		val input = com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest()
		input.setThingName(this.thingName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iot_jobs_data.getPendingJobExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iot-jobs-data get-pending-job-executions")
				.argument("thing-name", thingName)
	}

}


fun AWSIoTJobsDataPlaneFunctions.startNextPendingJobExecution(init: AWSIoTJobsDataPlaneStartNextPendingJobExecutionCommand.() -> Unit) {
	this.block.declare(AWSIoTJobsDataPlaneStartNextPendingJobExecutionCommand().apply(init))
}

@Generated
class AWSIoTJobsDataPlaneStartNextPendingJobExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest> {

	var thingName: String? = null
	var statusDetails: Map<String, String>? = null

	override fun build(): com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest {
		val input = com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest()
		input.setThingName(this.thingName)
		input.setStatusDetails(this.statusDetails)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iot_jobs_data.startNextPendingJobExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iot-jobs-data start-next-pending-job-execution")
				.argument("thing-name", thingName)
				.argument("status-details", statusDetails?.toString())
	}

}


fun AWSIoTJobsDataPlaneFunctions.updateJobExecution(init: AWSIoTJobsDataPlaneUpdateJobExecutionCommand.() -> Unit) {
	this.block.declare(AWSIoTJobsDataPlaneUpdateJobExecutionCommand().apply(init))
}

@Generated
class AWSIoTJobsDataPlaneUpdateJobExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iot_jobs_data.updateJobExecution(build())
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
