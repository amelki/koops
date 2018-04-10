
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.batch.AWSBatch
import com.amazonaws.services.batch.model.*

var codingue.koops.core.Environment.batch: AWSBatch
	get() = this.capabilities[AWSBatch::class.java.name] as AWSBatch
	set(batch) {
		this.capabilities[AWSBatch::class.java.name] = batch
	}

@Generated
class AWSBatchFunctions(val block: Block)

infix fun AwsContinuation.batch(init: AWSBatchFunctions.() -> Unit) {
	AWSBatchFunctions(shell).apply(init)
}

			

fun AWSBatchFunctions.cancelJob(init: AWSBatchCancelJobCommand.() -> Unit) {
	this.block.declare(AWSBatchCancelJobCommand().apply(init))
}

@Generated
class AWSBatchCancelJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.CancelJobRequest> {

	var jobId: String? = null
	var reason: String? = null

	override fun build(): com.amazonaws.services.batch.model.CancelJobRequest {
		val input = com.amazonaws.services.batch.model.CancelJobRequest()
		input.setJobId(this.jobId)
		input.setReason(this.reason)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.batch.cancelJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch cancel-job")
				.argument("job-id", jobId)
				.argument("reason", reason)
	}

}


fun AWSBatchFunctions.createComputeEnvironment(init: AWSBatchCreateComputeEnvironmentCommand.() -> Unit) {
	this.block.declare(AWSBatchCreateComputeEnvironmentCommand().apply(init))
}

@Generated
class AWSBatchCreateComputeEnvironmentCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest> {

	var computeEnvironmentName: String? = null
	var type: CEType? = null
	var state: CEState? = null
	var computeResources: com.amazonaws.services.batch.model.ComputeResource? = null
	var serviceRole: String? = null

	override fun build(): com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest {
		val input = com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest()
		input.setComputeEnvironmentName(this.computeEnvironmentName)
		input.setType(this.type?.toString())
		input.setState(this.state?.toString())
		input.setComputeResources(this.computeResources)
		input.setServiceRole(this.serviceRole)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.batch.createComputeEnvironment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch create-compute-environment")
				.argument("compute-environment-name", computeEnvironmentName)
				.argument("type", type?.toString())
				.argument("state", state?.toString())
				.argument("compute-resources", computeResources?.toString())
				.argument("service-role", serviceRole)
	}

}


fun AWSBatchFunctions.createJobQueue(init: AWSBatchCreateJobQueueCommand.() -> Unit) {
	this.block.declare(AWSBatchCreateJobQueueCommand().apply(init))
}

@Generated
class AWSBatchCreateJobQueueCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.CreateJobQueueRequest> {

	var jobQueueName: String? = null
	var state: JQState? = null
	var priority: Int? = 0
	var computeEnvironmentOrder: List<com.amazonaws.services.batch.model.ComputeEnvironmentOrder>? = null

	override fun build(): com.amazonaws.services.batch.model.CreateJobQueueRequest {
		val input = com.amazonaws.services.batch.model.CreateJobQueueRequest()
		input.setJobQueueName(this.jobQueueName)
		input.setState(this.state?.toString())
		input.setPriority(this.priority)
		input.setComputeEnvironmentOrder(this.computeEnvironmentOrder)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.batch.createJobQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch create-job-queue")
				.argument("job-queue-name", jobQueueName)
				.argument("state", state?.toString())
				.argument("priority", priority?.toString())
				.argument("compute-environment-order", computeEnvironmentOrder?.toString())
	}

}


fun AWSBatchFunctions.deleteComputeEnvironment(init: AWSBatchDeleteComputeEnvironmentCommand.() -> Unit) {
	this.block.declare(AWSBatchDeleteComputeEnvironmentCommand().apply(init))
}

@Generated
class AWSBatchDeleteComputeEnvironmentCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest> {

	var computeEnvironment: String? = null

	override fun build(): com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest {
		val input = com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest()
		input.setComputeEnvironment(this.computeEnvironment)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.batch.deleteComputeEnvironment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch delete-compute-environment")
				.argument("compute-environment", computeEnvironment)
	}

}


fun AWSBatchFunctions.deleteJobQueue(init: AWSBatchDeleteJobQueueCommand.() -> Unit) {
	this.block.declare(AWSBatchDeleteJobQueueCommand().apply(init))
}

@Generated
class AWSBatchDeleteJobQueueCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.DeleteJobQueueRequest> {

	var jobQueue: String? = null

	override fun build(): com.amazonaws.services.batch.model.DeleteJobQueueRequest {
		val input = com.amazonaws.services.batch.model.DeleteJobQueueRequest()
		input.setJobQueue(this.jobQueue)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.batch.deleteJobQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch delete-job-queue")
				.argument("job-queue", jobQueue)
	}

}


fun AWSBatchFunctions.deregisterJobDefinition(init: AWSBatchDeregisterJobDefinitionCommand.() -> Unit) {
	this.block.declare(AWSBatchDeregisterJobDefinitionCommand().apply(init))
}

@Generated
class AWSBatchDeregisterJobDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest> {

	var jobDefinition: String? = null

	override fun build(): com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest {
		val input = com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest()
		input.setJobDefinition(this.jobDefinition)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.batch.deregisterJobDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch deregister-job-definition")
				.argument("job-definition", jobDefinition)
	}

}


fun AWSBatchFunctions.describeComputeEnvironments(init: AWSBatchDescribeComputeEnvironmentsCommand.() -> Unit) {
	this.block.declare(AWSBatchDescribeComputeEnvironmentsCommand().apply(init))
}

@Generated
class AWSBatchDescribeComputeEnvironmentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest> {

	var computeEnvironments: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest {
		val input = com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest()
		input.setComputeEnvironments(this.computeEnvironments)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.batch.describeComputeEnvironments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch describe-compute-environments")
				.argument("compute-environments", computeEnvironments?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSBatchFunctions.describeJobDefinitions(init: AWSBatchDescribeJobDefinitionsCommand.() -> Unit) {
	this.block.declare(AWSBatchDescribeJobDefinitionsCommand().apply(init))
}

@Generated
class AWSBatchDescribeJobDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest> {

	var jobDefinitions: List<String>? = null
	var maxResults: Int? = 0
	var jobDefinitionName: String? = null
	var status: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest {
		val input = com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest()
		input.setJobDefinitions(this.jobDefinitions)
		input.setMaxResults(this.maxResults)
		input.setJobDefinitionName(this.jobDefinitionName)
		input.setStatus(this.status)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.batch.describeJobDefinitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch describe-job-definitions")
				.argument("job-definitions", jobDefinitions?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("job-definition-name", jobDefinitionName)
				.argument("status", status)
				.argument("next-token", nextToken)
	}

}


fun AWSBatchFunctions.describeJobQueues(init: AWSBatchDescribeJobQueuesCommand.() -> Unit) {
	this.block.declare(AWSBatchDescribeJobQueuesCommand().apply(init))
}

@Generated
class AWSBatchDescribeJobQueuesCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.DescribeJobQueuesRequest> {

	var jobQueues: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.batch.model.DescribeJobQueuesRequest {
		val input = com.amazonaws.services.batch.model.DescribeJobQueuesRequest()
		input.setJobQueues(this.jobQueues)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.batch.describeJobQueues(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch describe-job-queues")
				.argument("job-queues", jobQueues?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSBatchFunctions.describeJobs(init: AWSBatchDescribeJobsCommand.() -> Unit) {
	this.block.declare(AWSBatchDescribeJobsCommand().apply(init))
}

@Generated
class AWSBatchDescribeJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.DescribeJobsRequest> {

	var jobs: List<String>? = null

	override fun build(): com.amazonaws.services.batch.model.DescribeJobsRequest {
		val input = com.amazonaws.services.batch.model.DescribeJobsRequest()
		input.setJobs(this.jobs)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.batch.describeJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch describe-jobs")
				.argument("jobs", jobs?.toString())
	}

}


fun AWSBatchFunctions.listJobs(init: AWSBatchListJobsCommand.() -> Unit) {
	this.block.declare(AWSBatchListJobsCommand().apply(init))
}

@Generated
class AWSBatchListJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.ListJobsRequest> {

	var jobQueue: String? = null
	var arrayJobId: String? = null
	var jobStatus: JobStatus? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.batch.model.ListJobsRequest {
		val input = com.amazonaws.services.batch.model.ListJobsRequest()
		input.setJobQueue(this.jobQueue)
		input.setArrayJobId(this.arrayJobId)
		input.setJobStatus(this.jobStatus?.toString())
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.batch.listJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch list-jobs")
				.argument("job-queue", jobQueue)
				.argument("array-job-id", arrayJobId)
				.argument("job-status", jobStatus?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSBatchFunctions.registerJobDefinition(init: AWSBatchRegisterJobDefinitionCommand.() -> Unit) {
	this.block.declare(AWSBatchRegisterJobDefinitionCommand().apply(init))
}

@Generated
class AWSBatchRegisterJobDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.RegisterJobDefinitionRequest> {

	var jobDefinitionName: String? = null
	var type: JobDefinitionType? = null
	var parameters: Map<String, String>? = null
	var containerProperties: com.amazonaws.services.batch.model.ContainerProperties? = null
	var retryStrategy: com.amazonaws.services.batch.model.RetryStrategy? = null
	var timeout: com.amazonaws.services.batch.model.JobTimeout? = null

	override fun build(): com.amazonaws.services.batch.model.RegisterJobDefinitionRequest {
		val input = com.amazonaws.services.batch.model.RegisterJobDefinitionRequest()
		input.setJobDefinitionName(this.jobDefinitionName)
		input.setType(this.type?.toString())
		input.setParameters(this.parameters)
		input.setContainerProperties(this.containerProperties)
		input.setRetryStrategy(this.retryStrategy)
		input.setTimeout(this.timeout)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.batch.registerJobDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch register-job-definition")
				.argument("job-definition-name", jobDefinitionName)
				.argument("type", type?.toString())
				.argument("parameters", parameters?.toString())
				.argument("container-properties", containerProperties?.toString())
				.argument("retry-strategy", retryStrategy?.toString())
				.argument("timeout", timeout?.toString())
	}

}


fun AWSBatchFunctions.submitJob(init: AWSBatchSubmitJobCommand.() -> Unit) {
	this.block.declare(AWSBatchSubmitJobCommand().apply(init))
}

@Generated
class AWSBatchSubmitJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.SubmitJobRequest> {

	var jobName: String? = null
	var jobQueue: String? = null
	var arrayProperties: com.amazonaws.services.batch.model.ArrayProperties? = null
	var dependsOn: List<com.amazonaws.services.batch.model.JobDependency>? = null
	var jobDefinition: String? = null
	var parameters: Map<String, String>? = null
	var containerOverrides: com.amazonaws.services.batch.model.ContainerOverrides? = null
	var retryStrategy: com.amazonaws.services.batch.model.RetryStrategy? = null
	var timeout: com.amazonaws.services.batch.model.JobTimeout? = null

	override fun build(): com.amazonaws.services.batch.model.SubmitJobRequest {
		val input = com.amazonaws.services.batch.model.SubmitJobRequest()
		input.setJobName(this.jobName)
		input.setJobQueue(this.jobQueue)
		input.setArrayProperties(this.arrayProperties)
		input.setDependsOn(this.dependsOn)
		input.setJobDefinition(this.jobDefinition)
		input.setParameters(this.parameters)
		input.setContainerOverrides(this.containerOverrides)
		input.setRetryStrategy(this.retryStrategy)
		input.setTimeout(this.timeout)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.batch.submitJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch submit-job")
				.argument("job-name", jobName)
				.argument("job-queue", jobQueue)
				.argument("array-properties", arrayProperties?.toString())
				.argument("depends-on", dependsOn?.toString())
				.argument("job-definition", jobDefinition)
				.argument("parameters", parameters?.toString())
				.argument("container-overrides", containerOverrides?.toString())
				.argument("retry-strategy", retryStrategy?.toString())
				.argument("timeout", timeout?.toString())
	}

}


fun AWSBatchFunctions.terminateJob(init: AWSBatchTerminateJobCommand.() -> Unit) {
	this.block.declare(AWSBatchTerminateJobCommand().apply(init))
}

@Generated
class AWSBatchTerminateJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.TerminateJobRequest> {

	var jobId: String? = null
	var reason: String? = null

	override fun build(): com.amazonaws.services.batch.model.TerminateJobRequest {
		val input = com.amazonaws.services.batch.model.TerminateJobRequest()
		input.setJobId(this.jobId)
		input.setReason(this.reason)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.batch.terminateJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch terminate-job")
				.argument("job-id", jobId)
				.argument("reason", reason)
	}

}


fun AWSBatchFunctions.updateComputeEnvironment(init: AWSBatchUpdateComputeEnvironmentCommand.() -> Unit) {
	this.block.declare(AWSBatchUpdateComputeEnvironmentCommand().apply(init))
}

@Generated
class AWSBatchUpdateComputeEnvironmentCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest> {

	var computeEnvironment: String? = null
	var state: CEState? = null
	var computeResources: com.amazonaws.services.batch.model.ComputeResourceUpdate? = null
	var serviceRole: String? = null

	override fun build(): com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest {
		val input = com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest()
		input.setComputeEnvironment(this.computeEnvironment)
		input.setState(this.state?.toString())
		input.setComputeResources(this.computeResources)
		input.setServiceRole(this.serviceRole)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.batch.updateComputeEnvironment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch update-compute-environment")
				.argument("compute-environment", computeEnvironment)
				.argument("state", state?.toString())
				.argument("compute-resources", computeResources?.toString())
				.argument("service-role", serviceRole)
	}

}


fun AWSBatchFunctions.updateJobQueue(init: AWSBatchUpdateJobQueueCommand.() -> Unit) {
	this.block.declare(AWSBatchUpdateJobQueueCommand().apply(init))
}

@Generated
class AWSBatchUpdateJobQueueCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.UpdateJobQueueRequest> {

	var jobQueue: String? = null
	var state: JQState? = null
	var priority: Int? = 0
	var computeEnvironmentOrder: List<com.amazonaws.services.batch.model.ComputeEnvironmentOrder>? = null

	override fun build(): com.amazonaws.services.batch.model.UpdateJobQueueRequest {
		val input = com.amazonaws.services.batch.model.UpdateJobQueueRequest()
		input.setJobQueue(this.jobQueue)
		input.setState(this.state?.toString())
		input.setPriority(this.priority)
		input.setComputeEnvironmentOrder(this.computeEnvironmentOrder)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.batch.updateJobQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch update-job-queue")
				.argument("job-queue", jobQueue)
				.argument("state", state?.toString())
				.argument("priority", priority?.toString())
				.argument("compute-environment-order", computeEnvironmentOrder?.toString())
	}

}
