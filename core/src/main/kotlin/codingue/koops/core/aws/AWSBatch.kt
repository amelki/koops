
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

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

infix fun <T> AwsContinuation.batch(init: AWSBatchFunctions.() -> T): T {
	return AWSBatchFunctions(shell).run(init)
}

			

fun AWSBatchFunctions.cancelJob(init: AWSBatchCancelJobCommand.() -> Unit): com.amazonaws.services.batch.model.CancelJobResult {
	return this.block.declare(AWSBatchCancelJobCommand().apply(init)) as com.amazonaws.services.batch.model.CancelJobResult
}

@Generated
class AWSBatchCancelJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.CancelJobRequest, com.amazonaws.services.batch.model.CancelJobResult> {

	var jobId: String? = null
	var reason: String? = null

	override fun build(): com.amazonaws.services.batch.model.CancelJobRequest {
		val input = com.amazonaws.services.batch.model.CancelJobRequest()
		input.setJobId(this.jobId)
		input.setReason(this.reason)
		return input
	}

	override fun dryResult(): com.amazonaws.services.batch.model.CancelJobResult {
	  return com.amazonaws.services.batch.model.CancelJobResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.batch.model.CancelJobResult {
		return environment.batch.cancelJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch cancel-job")
				.argument("job-id", jobId)
				.argument("reason", reason)
	}

}


fun AWSBatchFunctions.createComputeEnvironment(init: AWSBatchCreateComputeEnvironmentCommand.() -> Unit): com.amazonaws.services.batch.model.CreateComputeEnvironmentResult {
	return this.block.declare(AWSBatchCreateComputeEnvironmentCommand().apply(init)) as com.amazonaws.services.batch.model.CreateComputeEnvironmentResult
}

@Generated
class AWSBatchCreateComputeEnvironmentCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest, com.amazonaws.services.batch.model.CreateComputeEnvironmentResult> {

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

	override fun dryResult(): com.amazonaws.services.batch.model.CreateComputeEnvironmentResult {
	  return com.amazonaws.services.batch.model.CreateComputeEnvironmentResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.batch.model.CreateComputeEnvironmentResult {
		return environment.batch.createComputeEnvironment(build())
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


fun AWSBatchFunctions.createJobQueue(init: AWSBatchCreateJobQueueCommand.() -> Unit): com.amazonaws.services.batch.model.CreateJobQueueResult {
	return this.block.declare(AWSBatchCreateJobQueueCommand().apply(init)) as com.amazonaws.services.batch.model.CreateJobQueueResult
}

@Generated
class AWSBatchCreateJobQueueCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.CreateJobQueueRequest, com.amazonaws.services.batch.model.CreateJobQueueResult> {

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

	override fun dryResult(): com.amazonaws.services.batch.model.CreateJobQueueResult {
	  return com.amazonaws.services.batch.model.CreateJobQueueResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.batch.model.CreateJobQueueResult {
		return environment.batch.createJobQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch create-job-queue")
				.argument("job-queue-name", jobQueueName)
				.argument("state", state?.toString())
				.argument("priority", priority?.toString())
				.argument("compute-environment-order", computeEnvironmentOrder?.toString())
	}

}


fun AWSBatchFunctions.deleteComputeEnvironment(init: AWSBatchDeleteComputeEnvironmentCommand.() -> Unit): com.amazonaws.services.batch.model.DeleteComputeEnvironmentResult {
	return this.block.declare(AWSBatchDeleteComputeEnvironmentCommand().apply(init)) as com.amazonaws.services.batch.model.DeleteComputeEnvironmentResult
}

@Generated
class AWSBatchDeleteComputeEnvironmentCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest, com.amazonaws.services.batch.model.DeleteComputeEnvironmentResult> {

	var computeEnvironment: String? = null

	override fun build(): com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest {
		val input = com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest()
		input.setComputeEnvironment(this.computeEnvironment)
		return input
	}

	override fun dryResult(): com.amazonaws.services.batch.model.DeleteComputeEnvironmentResult {
	  return com.amazonaws.services.batch.model.DeleteComputeEnvironmentResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.batch.model.DeleteComputeEnvironmentResult {
		return environment.batch.deleteComputeEnvironment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch delete-compute-environment")
				.argument("compute-environment", computeEnvironment)
	}

}


fun AWSBatchFunctions.deleteJobQueue(init: AWSBatchDeleteJobQueueCommand.() -> Unit): com.amazonaws.services.batch.model.DeleteJobQueueResult {
	return this.block.declare(AWSBatchDeleteJobQueueCommand().apply(init)) as com.amazonaws.services.batch.model.DeleteJobQueueResult
}

@Generated
class AWSBatchDeleteJobQueueCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.DeleteJobQueueRequest, com.amazonaws.services.batch.model.DeleteJobQueueResult> {

	var jobQueue: String? = null

	override fun build(): com.amazonaws.services.batch.model.DeleteJobQueueRequest {
		val input = com.amazonaws.services.batch.model.DeleteJobQueueRequest()
		input.setJobQueue(this.jobQueue)
		return input
	}

	override fun dryResult(): com.amazonaws.services.batch.model.DeleteJobQueueResult {
	  return com.amazonaws.services.batch.model.DeleteJobQueueResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.batch.model.DeleteJobQueueResult {
		return environment.batch.deleteJobQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch delete-job-queue")
				.argument("job-queue", jobQueue)
	}

}


fun AWSBatchFunctions.deregisterJobDefinition(init: AWSBatchDeregisterJobDefinitionCommand.() -> Unit): com.amazonaws.services.batch.model.DeregisterJobDefinitionResult {
	return this.block.declare(AWSBatchDeregisterJobDefinitionCommand().apply(init)) as com.amazonaws.services.batch.model.DeregisterJobDefinitionResult
}

@Generated
class AWSBatchDeregisterJobDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest, com.amazonaws.services.batch.model.DeregisterJobDefinitionResult> {

	var jobDefinition: String? = null

	override fun build(): com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest {
		val input = com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest()
		input.setJobDefinition(this.jobDefinition)
		return input
	}

	override fun dryResult(): com.amazonaws.services.batch.model.DeregisterJobDefinitionResult {
	  return com.amazonaws.services.batch.model.DeregisterJobDefinitionResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.batch.model.DeregisterJobDefinitionResult {
		return environment.batch.deregisterJobDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch deregister-job-definition")
				.argument("job-definition", jobDefinition)
	}

}


fun AWSBatchFunctions.describeComputeEnvironments(init: AWSBatchDescribeComputeEnvironmentsCommand.() -> Unit): com.amazonaws.services.batch.model.DescribeComputeEnvironmentsResult {
	return this.block.declare(AWSBatchDescribeComputeEnvironmentsCommand().apply(init)) as com.amazonaws.services.batch.model.DescribeComputeEnvironmentsResult
}

@Generated
class AWSBatchDescribeComputeEnvironmentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest, com.amazonaws.services.batch.model.DescribeComputeEnvironmentsResult> {

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

	override fun dryResult(): com.amazonaws.services.batch.model.DescribeComputeEnvironmentsResult {
	  return com.amazonaws.services.batch.model.DescribeComputeEnvironmentsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.batch.model.DescribeComputeEnvironmentsResult {
		return environment.batch.describeComputeEnvironments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch describe-compute-environments")
				.argument("compute-environments", computeEnvironments?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSBatchFunctions.describeJobDefinitions(init: AWSBatchDescribeJobDefinitionsCommand.() -> Unit): com.amazonaws.services.batch.model.DescribeJobDefinitionsResult {
	return this.block.declare(AWSBatchDescribeJobDefinitionsCommand().apply(init)) as com.amazonaws.services.batch.model.DescribeJobDefinitionsResult
}

@Generated
class AWSBatchDescribeJobDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest, com.amazonaws.services.batch.model.DescribeJobDefinitionsResult> {

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

	override fun dryResult(): com.amazonaws.services.batch.model.DescribeJobDefinitionsResult {
	  return com.amazonaws.services.batch.model.DescribeJobDefinitionsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.batch.model.DescribeJobDefinitionsResult {
		return environment.batch.describeJobDefinitions(build())
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


fun AWSBatchFunctions.describeJobQueues(init: AWSBatchDescribeJobQueuesCommand.() -> Unit): com.amazonaws.services.batch.model.DescribeJobQueuesResult {
	return this.block.declare(AWSBatchDescribeJobQueuesCommand().apply(init)) as com.amazonaws.services.batch.model.DescribeJobQueuesResult
}

@Generated
class AWSBatchDescribeJobQueuesCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.DescribeJobQueuesRequest, com.amazonaws.services.batch.model.DescribeJobQueuesResult> {

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

	override fun dryResult(): com.amazonaws.services.batch.model.DescribeJobQueuesResult {
	  return com.amazonaws.services.batch.model.DescribeJobQueuesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.batch.model.DescribeJobQueuesResult {
		return environment.batch.describeJobQueues(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch describe-job-queues")
				.argument("job-queues", jobQueues?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSBatchFunctions.describeJobs(init: AWSBatchDescribeJobsCommand.() -> Unit): com.amazonaws.services.batch.model.DescribeJobsResult {
	return this.block.declare(AWSBatchDescribeJobsCommand().apply(init)) as com.amazonaws.services.batch.model.DescribeJobsResult
}

@Generated
class AWSBatchDescribeJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.DescribeJobsRequest, com.amazonaws.services.batch.model.DescribeJobsResult> {

	var jobs: List<String>? = null

	override fun build(): com.amazonaws.services.batch.model.DescribeJobsRequest {
		val input = com.amazonaws.services.batch.model.DescribeJobsRequest()
		input.setJobs(this.jobs)
		return input
	}

	override fun dryResult(): com.amazonaws.services.batch.model.DescribeJobsResult {
	  return com.amazonaws.services.batch.model.DescribeJobsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.batch.model.DescribeJobsResult {
		return environment.batch.describeJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch describe-jobs")
				.argument("jobs", jobs?.toString())
	}

}


fun AWSBatchFunctions.listJobs(init: AWSBatchListJobsCommand.() -> Unit): com.amazonaws.services.batch.model.ListJobsResult {
	return this.block.declare(AWSBatchListJobsCommand().apply(init)) as com.amazonaws.services.batch.model.ListJobsResult
}

@Generated
class AWSBatchListJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.ListJobsRequest, com.amazonaws.services.batch.model.ListJobsResult> {

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

	override fun dryResult(): com.amazonaws.services.batch.model.ListJobsResult {
	  return com.amazonaws.services.batch.model.ListJobsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.batch.model.ListJobsResult {
		return environment.batch.listJobs(build())
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


fun AWSBatchFunctions.registerJobDefinition(init: AWSBatchRegisterJobDefinitionCommand.() -> Unit): com.amazonaws.services.batch.model.RegisterJobDefinitionResult {
	return this.block.declare(AWSBatchRegisterJobDefinitionCommand().apply(init)) as com.amazonaws.services.batch.model.RegisterJobDefinitionResult
}

@Generated
class AWSBatchRegisterJobDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.RegisterJobDefinitionRequest, com.amazonaws.services.batch.model.RegisterJobDefinitionResult> {

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

	override fun dryResult(): com.amazonaws.services.batch.model.RegisterJobDefinitionResult {
	  return com.amazonaws.services.batch.model.RegisterJobDefinitionResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.batch.model.RegisterJobDefinitionResult {
		return environment.batch.registerJobDefinition(build())
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


fun AWSBatchFunctions.submitJob(init: AWSBatchSubmitJobCommand.() -> Unit): com.amazonaws.services.batch.model.SubmitJobResult {
	return this.block.declare(AWSBatchSubmitJobCommand().apply(init)) as com.amazonaws.services.batch.model.SubmitJobResult
}

@Generated
class AWSBatchSubmitJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.SubmitJobRequest, com.amazonaws.services.batch.model.SubmitJobResult> {

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

	override fun dryResult(): com.amazonaws.services.batch.model.SubmitJobResult {
	  return com.amazonaws.services.batch.model.SubmitJobResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.batch.model.SubmitJobResult {
		return environment.batch.submitJob(build())
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


fun AWSBatchFunctions.terminateJob(init: AWSBatchTerminateJobCommand.() -> Unit): com.amazonaws.services.batch.model.TerminateJobResult {
	return this.block.declare(AWSBatchTerminateJobCommand().apply(init)) as com.amazonaws.services.batch.model.TerminateJobResult
}

@Generated
class AWSBatchTerminateJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.TerminateJobRequest, com.amazonaws.services.batch.model.TerminateJobResult> {

	var jobId: String? = null
	var reason: String? = null

	override fun build(): com.amazonaws.services.batch.model.TerminateJobRequest {
		val input = com.amazonaws.services.batch.model.TerminateJobRequest()
		input.setJobId(this.jobId)
		input.setReason(this.reason)
		return input
	}

	override fun dryResult(): com.amazonaws.services.batch.model.TerminateJobResult {
	  return com.amazonaws.services.batch.model.TerminateJobResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.batch.model.TerminateJobResult {
		return environment.batch.terminateJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch terminate-job")
				.argument("job-id", jobId)
				.argument("reason", reason)
	}

}


fun AWSBatchFunctions.updateComputeEnvironment(init: AWSBatchUpdateComputeEnvironmentCommand.() -> Unit): com.amazonaws.services.batch.model.UpdateComputeEnvironmentResult {
	return this.block.declare(AWSBatchUpdateComputeEnvironmentCommand().apply(init)) as com.amazonaws.services.batch.model.UpdateComputeEnvironmentResult
}

@Generated
class AWSBatchUpdateComputeEnvironmentCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest, com.amazonaws.services.batch.model.UpdateComputeEnvironmentResult> {

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

	override fun dryResult(): com.amazonaws.services.batch.model.UpdateComputeEnvironmentResult {
	  return com.amazonaws.services.batch.model.UpdateComputeEnvironmentResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.batch.model.UpdateComputeEnvironmentResult {
		return environment.batch.updateComputeEnvironment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch update-compute-environment")
				.argument("compute-environment", computeEnvironment)
				.argument("state", state?.toString())
				.argument("compute-resources", computeResources?.toString())
				.argument("service-role", serviceRole)
	}

}


fun AWSBatchFunctions.updateJobQueue(init: AWSBatchUpdateJobQueueCommand.() -> Unit): com.amazonaws.services.batch.model.UpdateJobQueueResult {
	return this.block.declare(AWSBatchUpdateJobQueueCommand().apply(init)) as com.amazonaws.services.batch.model.UpdateJobQueueResult
}

@Generated
class AWSBatchUpdateJobQueueCommand() : AmazonWebServiceCommand<com.amazonaws.services.batch.model.UpdateJobQueueRequest, com.amazonaws.services.batch.model.UpdateJobQueueResult> {

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

	override fun dryResult(): com.amazonaws.services.batch.model.UpdateJobQueueResult {
	  return com.amazonaws.services.batch.model.UpdateJobQueueResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.batch.model.UpdateJobQueueResult {
		return environment.batch.updateJobQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws batch update-job-queue")
				.argument("job-queue", jobQueue)
				.argument("state", state?.toString())
				.argument("priority", priority?.toString())
				.argument("compute-environment-order", computeEnvironmentOrder?.toString())
	}

}
