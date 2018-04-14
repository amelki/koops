
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.logs

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.logs.*
import com.amazonaws.services.logs.model.*

var codingue.koops.core.Environment.logs: AWSLogs
	get() {
		var service = this.capabilities["aws-logs"]
		if (service == null) {
			service = AWSLogsClientBuilder.standard().build()
			this.capabilities["aws-logs"] = service
		}
		return service as AWSLogs
	}
	set(logs) {
		this.capabilities["aws-logs"] = logs
	}

@Generated
class AWSLogsFunctions(val block: Block)

infix fun <T> AwsContinuation.logs(init: AWSLogsFunctions.() -> T): T {
	return AWSLogsFunctions(shell).run(init)
}

			

fun AWSLogsFunctions.associateKmsKey(init: AWSLogsAssociateKmsKeyCommand.() -> Unit): com.amazonaws.services.logs.model.AssociateKmsKeyResult {
	return this.block.declare(AWSLogsAssociateKmsKeyCommand().apply(init)) as com.amazonaws.services.logs.model.AssociateKmsKeyResult
}

@Generated
class AWSLogsAssociateKmsKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.AssociateKmsKeyRequest, com.amazonaws.services.logs.model.AssociateKmsKeyResult> {

	var logGroupName: String? = null
	var kmsKeyId: String? = null

	override fun build(): com.amazonaws.services.logs.model.AssociateKmsKeyRequest {
		val input = com.amazonaws.services.logs.model.AssociateKmsKeyRequest()
		input.setLogGroupName(this.logGroupName)
		input.setKmsKeyId(this.kmsKeyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.AssociateKmsKeyResult {
	  return com.amazonaws.services.logs.model.AssociateKmsKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.AssociateKmsKeyResult {
		return environment.logs.associateKmsKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs associate-kms-key")
				.argument("log-group-name", logGroupName)
				.argument("kms-key-id", kmsKeyId)
	}

}


fun AWSLogsFunctions.cancelExportTask(init: AWSLogsCancelExportTaskCommand.() -> Unit): com.amazonaws.services.logs.model.CancelExportTaskResult {
	return this.block.declare(AWSLogsCancelExportTaskCommand().apply(init)) as com.amazonaws.services.logs.model.CancelExportTaskResult
}

@Generated
class AWSLogsCancelExportTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.CancelExportTaskRequest, com.amazonaws.services.logs.model.CancelExportTaskResult> {

	var taskId: String? = null

	override fun build(): com.amazonaws.services.logs.model.CancelExportTaskRequest {
		val input = com.amazonaws.services.logs.model.CancelExportTaskRequest()
		input.setTaskId(this.taskId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.CancelExportTaskResult {
	  return com.amazonaws.services.logs.model.CancelExportTaskResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.CancelExportTaskResult {
		return environment.logs.cancelExportTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs cancel-export-task")
				.argument("task-id", taskId)
	}

}


fun AWSLogsFunctions.createExportTask(init: AWSLogsCreateExportTaskCommand.() -> Unit): com.amazonaws.services.logs.model.CreateExportTaskResult {
	return this.block.declare(AWSLogsCreateExportTaskCommand().apply(init)) as com.amazonaws.services.logs.model.CreateExportTaskResult
}

@Generated
class AWSLogsCreateExportTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.CreateExportTaskRequest, com.amazonaws.services.logs.model.CreateExportTaskResult> {

	var taskName: String? = null
	var logGroupName: String? = null
	var logStreamNamePrefix: String? = null
	var from: Long? = 0L
	var to: Long? = 0L
	var destination: String? = null
	var destinationPrefix: String? = null

	override fun build(): com.amazonaws.services.logs.model.CreateExportTaskRequest {
		val input = com.amazonaws.services.logs.model.CreateExportTaskRequest()
		input.setTaskName(this.taskName)
		input.setLogGroupName(this.logGroupName)
		input.setLogStreamNamePrefix(this.logStreamNamePrefix)
		input.setFrom(this.from)
		input.setTo(this.to)
		input.setDestination(this.destination)
		input.setDestinationPrefix(this.destinationPrefix)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.CreateExportTaskResult {
	  return com.amazonaws.services.logs.model.CreateExportTaskResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.CreateExportTaskResult {
		return environment.logs.createExportTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs create-export-task")
				.argument("task-name", taskName)
				.argument("log-group-name", logGroupName)
				.argument("log-stream-name-prefix", logStreamNamePrefix)
				.argument("from", from?.toString())
				.argument("to", to?.toString())
				.argument("destination", destination)
				.argument("destination-prefix", destinationPrefix)
	}

}


fun AWSLogsFunctions.createLogGroup(init: AWSLogsCreateLogGroupCommand.() -> Unit): com.amazonaws.services.logs.model.CreateLogGroupResult {
	return this.block.declare(AWSLogsCreateLogGroupCommand().apply(init)) as com.amazonaws.services.logs.model.CreateLogGroupResult
}

@Generated
class AWSLogsCreateLogGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.CreateLogGroupRequest, com.amazonaws.services.logs.model.CreateLogGroupResult> {

	var logGroupName: String? = null
	var kmsKeyId: String? = null
	var tags: Map<String, String>? = null

	override fun build(): com.amazonaws.services.logs.model.CreateLogGroupRequest {
		val input = com.amazonaws.services.logs.model.CreateLogGroupRequest()
		input.setLogGroupName(this.logGroupName)
		input.setKmsKeyId(this.kmsKeyId)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.CreateLogGroupResult {
	  return com.amazonaws.services.logs.model.CreateLogGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.CreateLogGroupResult {
		return environment.logs.createLogGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs create-log-group")
				.argument("log-group-name", logGroupName)
				.argument("kms-key-id", kmsKeyId)
				.argument("tags", tags?.toString())
	}

}


fun AWSLogsFunctions.createLogStream(init: AWSLogsCreateLogStreamCommand.() -> Unit): com.amazonaws.services.logs.model.CreateLogStreamResult {
	return this.block.declare(AWSLogsCreateLogStreamCommand().apply(init)) as com.amazonaws.services.logs.model.CreateLogStreamResult
}

@Generated
class AWSLogsCreateLogStreamCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.CreateLogStreamRequest, com.amazonaws.services.logs.model.CreateLogStreamResult> {

	var logGroupName: String? = null
	var logStreamName: String? = null

	override fun build(): com.amazonaws.services.logs.model.CreateLogStreamRequest {
		val input = com.amazonaws.services.logs.model.CreateLogStreamRequest()
		input.setLogGroupName(this.logGroupName)
		input.setLogStreamName(this.logStreamName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.CreateLogStreamResult {
	  return com.amazonaws.services.logs.model.CreateLogStreamResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.CreateLogStreamResult {
		return environment.logs.createLogStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs create-log-stream")
				.argument("log-group-name", logGroupName)
				.argument("log-stream-name", logStreamName)
	}

}


fun AWSLogsFunctions.deleteDestination(init: AWSLogsDeleteDestinationCommand.() -> Unit): com.amazonaws.services.logs.model.DeleteDestinationResult {
	return this.block.declare(AWSLogsDeleteDestinationCommand().apply(init)) as com.amazonaws.services.logs.model.DeleteDestinationResult
}

@Generated
class AWSLogsDeleteDestinationCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DeleteDestinationRequest, com.amazonaws.services.logs.model.DeleteDestinationResult> {

	var destinationName: String? = null

	override fun build(): com.amazonaws.services.logs.model.DeleteDestinationRequest {
		val input = com.amazonaws.services.logs.model.DeleteDestinationRequest()
		input.setDestinationName(this.destinationName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.DeleteDestinationResult {
	  return com.amazonaws.services.logs.model.DeleteDestinationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.DeleteDestinationResult {
		return environment.logs.deleteDestination(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs delete-destination")
				.argument("destination-name", destinationName)
	}

}


fun AWSLogsFunctions.deleteLogGroup(init: AWSLogsDeleteLogGroupCommand.() -> Unit): com.amazonaws.services.logs.model.DeleteLogGroupResult {
	return this.block.declare(AWSLogsDeleteLogGroupCommand().apply(init)) as com.amazonaws.services.logs.model.DeleteLogGroupResult
}

@Generated
class AWSLogsDeleteLogGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DeleteLogGroupRequest, com.amazonaws.services.logs.model.DeleteLogGroupResult> {

	var logGroupName: String? = null

	override fun build(): com.amazonaws.services.logs.model.DeleteLogGroupRequest {
		val input = com.amazonaws.services.logs.model.DeleteLogGroupRequest()
		input.setLogGroupName(this.logGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.DeleteLogGroupResult {
	  return com.amazonaws.services.logs.model.DeleteLogGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.DeleteLogGroupResult {
		return environment.logs.deleteLogGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs delete-log-group")
				.argument("log-group-name", logGroupName)
	}

}


fun AWSLogsFunctions.deleteLogStream(init: AWSLogsDeleteLogStreamCommand.() -> Unit): com.amazonaws.services.logs.model.DeleteLogStreamResult {
	return this.block.declare(AWSLogsDeleteLogStreamCommand().apply(init)) as com.amazonaws.services.logs.model.DeleteLogStreamResult
}

@Generated
class AWSLogsDeleteLogStreamCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DeleteLogStreamRequest, com.amazonaws.services.logs.model.DeleteLogStreamResult> {

	var logGroupName: String? = null
	var logStreamName: String? = null

	override fun build(): com.amazonaws.services.logs.model.DeleteLogStreamRequest {
		val input = com.amazonaws.services.logs.model.DeleteLogStreamRequest()
		input.setLogGroupName(this.logGroupName)
		input.setLogStreamName(this.logStreamName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.DeleteLogStreamResult {
	  return com.amazonaws.services.logs.model.DeleteLogStreamResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.DeleteLogStreamResult {
		return environment.logs.deleteLogStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs delete-log-stream")
				.argument("log-group-name", logGroupName)
				.argument("log-stream-name", logStreamName)
	}

}


fun AWSLogsFunctions.deleteMetricFilter(init: AWSLogsDeleteMetricFilterCommand.() -> Unit): com.amazonaws.services.logs.model.DeleteMetricFilterResult {
	return this.block.declare(AWSLogsDeleteMetricFilterCommand().apply(init)) as com.amazonaws.services.logs.model.DeleteMetricFilterResult
}

@Generated
class AWSLogsDeleteMetricFilterCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DeleteMetricFilterRequest, com.amazonaws.services.logs.model.DeleteMetricFilterResult> {

	var logGroupName: String? = null
	var filterName: String? = null

	override fun build(): com.amazonaws.services.logs.model.DeleteMetricFilterRequest {
		val input = com.amazonaws.services.logs.model.DeleteMetricFilterRequest()
		input.setLogGroupName(this.logGroupName)
		input.setFilterName(this.filterName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.DeleteMetricFilterResult {
	  return com.amazonaws.services.logs.model.DeleteMetricFilterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.DeleteMetricFilterResult {
		return environment.logs.deleteMetricFilter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs delete-metric-filter")
				.argument("log-group-name", logGroupName)
				.argument("filter-name", filterName)
	}

}


fun AWSLogsFunctions.deleteResourcePolicy(init: AWSLogsDeleteResourcePolicyCommand.() -> Unit): com.amazonaws.services.logs.model.DeleteResourcePolicyResult {
	return this.block.declare(AWSLogsDeleteResourcePolicyCommand().apply(init)) as com.amazonaws.services.logs.model.DeleteResourcePolicyResult
}

@Generated
class AWSLogsDeleteResourcePolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DeleteResourcePolicyRequest, com.amazonaws.services.logs.model.DeleteResourcePolicyResult> {

	var policyName: String? = null

	override fun build(): com.amazonaws.services.logs.model.DeleteResourcePolicyRequest {
		val input = com.amazonaws.services.logs.model.DeleteResourcePolicyRequest()
		input.setPolicyName(this.policyName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.DeleteResourcePolicyResult {
	  return com.amazonaws.services.logs.model.DeleteResourcePolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.DeleteResourcePolicyResult {
		return environment.logs.deleteResourcePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs delete-resource-policy")
				.argument("policy-name", policyName)
	}

}


fun AWSLogsFunctions.deleteRetentionPolicy(init: AWSLogsDeleteRetentionPolicyCommand.() -> Unit): com.amazonaws.services.logs.model.DeleteRetentionPolicyResult {
	return this.block.declare(AWSLogsDeleteRetentionPolicyCommand().apply(init)) as com.amazonaws.services.logs.model.DeleteRetentionPolicyResult
}

@Generated
class AWSLogsDeleteRetentionPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DeleteRetentionPolicyRequest, com.amazonaws.services.logs.model.DeleteRetentionPolicyResult> {

	var logGroupName: String? = null

	override fun build(): com.amazonaws.services.logs.model.DeleteRetentionPolicyRequest {
		val input = com.amazonaws.services.logs.model.DeleteRetentionPolicyRequest()
		input.setLogGroupName(this.logGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.DeleteRetentionPolicyResult {
	  return com.amazonaws.services.logs.model.DeleteRetentionPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.DeleteRetentionPolicyResult {
		return environment.logs.deleteRetentionPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs delete-retention-policy")
				.argument("log-group-name", logGroupName)
	}

}


fun AWSLogsFunctions.deleteSubscriptionFilter(init: AWSLogsDeleteSubscriptionFilterCommand.() -> Unit): com.amazonaws.services.logs.model.DeleteSubscriptionFilterResult {
	return this.block.declare(AWSLogsDeleteSubscriptionFilterCommand().apply(init)) as com.amazonaws.services.logs.model.DeleteSubscriptionFilterResult
}

@Generated
class AWSLogsDeleteSubscriptionFilterCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DeleteSubscriptionFilterRequest, com.amazonaws.services.logs.model.DeleteSubscriptionFilterResult> {

	var logGroupName: String? = null
	var filterName: String? = null

	override fun build(): com.amazonaws.services.logs.model.DeleteSubscriptionFilterRequest {
		val input = com.amazonaws.services.logs.model.DeleteSubscriptionFilterRequest()
		input.setLogGroupName(this.logGroupName)
		input.setFilterName(this.filterName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.DeleteSubscriptionFilterResult {
	  return com.amazonaws.services.logs.model.DeleteSubscriptionFilterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.DeleteSubscriptionFilterResult {
		return environment.logs.deleteSubscriptionFilter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs delete-subscription-filter")
				.argument("log-group-name", logGroupName)
				.argument("filter-name", filterName)
	}

}


fun AWSLogsFunctions.describeDestinations(init: AWSLogsDescribeDestinationsCommand.() -> Unit): com.amazonaws.services.logs.model.DescribeDestinationsResult {
	return this.block.declare(AWSLogsDescribeDestinationsCommand().apply(init)) as com.amazonaws.services.logs.model.DescribeDestinationsResult
}

@Generated
class AWSLogsDescribeDestinationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DescribeDestinationsRequest, com.amazonaws.services.logs.model.DescribeDestinationsResult> {

	var destinationNamePrefix: String? = null
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.logs.model.DescribeDestinationsRequest {
		val input = com.amazonaws.services.logs.model.DescribeDestinationsRequest()
		input.setDestinationNamePrefix(this.destinationNamePrefix)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.DescribeDestinationsResult {
	  return com.amazonaws.services.logs.model.DescribeDestinationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.DescribeDestinationsResult {
		return environment.logs.describeDestinations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs describe-destinations")
				.argument("destination-name-prefix", destinationNamePrefix)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSLogsFunctions.describeExportTasks(init: AWSLogsDescribeExportTasksCommand.() -> Unit): com.amazonaws.services.logs.model.DescribeExportTasksResult {
	return this.block.declare(AWSLogsDescribeExportTasksCommand().apply(init)) as com.amazonaws.services.logs.model.DescribeExportTasksResult
}

@Generated
class AWSLogsDescribeExportTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DescribeExportTasksRequest, com.amazonaws.services.logs.model.DescribeExportTasksResult> {

	var taskId: String? = null
	var statusCode: ExportTaskStatusCode? = null
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.logs.model.DescribeExportTasksRequest {
		val input = com.amazonaws.services.logs.model.DescribeExportTasksRequest()
		input.setTaskId(this.taskId)
		input.setStatusCode(this.statusCode?.toString())
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.DescribeExportTasksResult {
	  return com.amazonaws.services.logs.model.DescribeExportTasksResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.DescribeExportTasksResult {
		return environment.logs.describeExportTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs describe-export-tasks")
				.argument("task-id", taskId)
				.argument("status-code", statusCode?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSLogsFunctions.describeLogGroups(init: AWSLogsDescribeLogGroupsCommand.() -> Unit): com.amazonaws.services.logs.model.DescribeLogGroupsResult {
	return this.block.declare(AWSLogsDescribeLogGroupsCommand().apply(init)) as com.amazonaws.services.logs.model.DescribeLogGroupsResult
}

@Generated
class AWSLogsDescribeLogGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DescribeLogGroupsRequest, com.amazonaws.services.logs.model.DescribeLogGroupsResult> {

	var logGroupNamePrefix: String? = null
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.logs.model.DescribeLogGroupsRequest {
		val input = com.amazonaws.services.logs.model.DescribeLogGroupsRequest()
		input.setLogGroupNamePrefix(this.logGroupNamePrefix)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.DescribeLogGroupsResult {
	  return com.amazonaws.services.logs.model.DescribeLogGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.DescribeLogGroupsResult {
		return environment.logs.describeLogGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs describe-log-groups")
				.argument("log-group-name-prefix", logGroupNamePrefix)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSLogsFunctions.describeLogStreams(init: AWSLogsDescribeLogStreamsCommand.() -> Unit): com.amazonaws.services.logs.model.DescribeLogStreamsResult {
	return this.block.declare(AWSLogsDescribeLogStreamsCommand().apply(init)) as com.amazonaws.services.logs.model.DescribeLogStreamsResult
}

@Generated
class AWSLogsDescribeLogStreamsCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DescribeLogStreamsRequest, com.amazonaws.services.logs.model.DescribeLogStreamsResult> {

	var logGroupName: String? = null
	var logStreamNamePrefix: String? = null
	var orderBy: OrderBy? = null
	var descending: Boolean? = false
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.logs.model.DescribeLogStreamsRequest {
		val input = com.amazonaws.services.logs.model.DescribeLogStreamsRequest()
		input.setLogGroupName(this.logGroupName)
		input.setLogStreamNamePrefix(this.logStreamNamePrefix)
		input.setOrderBy(this.orderBy?.toString())
		input.setDescending(this.descending)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.DescribeLogStreamsResult {
	  return com.amazonaws.services.logs.model.DescribeLogStreamsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.DescribeLogStreamsResult {
		return environment.logs.describeLogStreams(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs describe-log-streams")
				.argument("log-group-name", logGroupName)
				.argument("log-stream-name-prefix", logStreamNamePrefix)
				.argument("order-by", orderBy?.toString())
				.option("descending", descending ?: false)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSLogsFunctions.describeMetricFilters(init: AWSLogsDescribeMetricFiltersCommand.() -> Unit): com.amazonaws.services.logs.model.DescribeMetricFiltersResult {
	return this.block.declare(AWSLogsDescribeMetricFiltersCommand().apply(init)) as com.amazonaws.services.logs.model.DescribeMetricFiltersResult
}

@Generated
class AWSLogsDescribeMetricFiltersCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DescribeMetricFiltersRequest, com.amazonaws.services.logs.model.DescribeMetricFiltersResult> {

	var logGroupName: String? = null
	var filterNamePrefix: String? = null
	var nextToken: String? = null
	var limit: Int? = 0
	var metricName: String? = null
	var metricNamespace: String? = null

	override fun build(): com.amazonaws.services.logs.model.DescribeMetricFiltersRequest {
		val input = com.amazonaws.services.logs.model.DescribeMetricFiltersRequest()
		input.setLogGroupName(this.logGroupName)
		input.setFilterNamePrefix(this.filterNamePrefix)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		input.setMetricName(this.metricName)
		input.setMetricNamespace(this.metricNamespace)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.DescribeMetricFiltersResult {
	  return com.amazonaws.services.logs.model.DescribeMetricFiltersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.DescribeMetricFiltersResult {
		return environment.logs.describeMetricFilters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs describe-metric-filters")
				.argument("log-group-name", logGroupName)
				.argument("filter-name-prefix", filterNamePrefix)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
				.argument("metric-name", metricName)
				.argument("metric-namespace", metricNamespace)
	}

}


fun AWSLogsFunctions.describeResourcePolicies(init: AWSLogsDescribeResourcePoliciesCommand.() -> Unit): com.amazonaws.services.logs.model.DescribeResourcePoliciesResult {
	return this.block.declare(AWSLogsDescribeResourcePoliciesCommand().apply(init)) as com.amazonaws.services.logs.model.DescribeResourcePoliciesResult
}

@Generated
class AWSLogsDescribeResourcePoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DescribeResourcePoliciesRequest, com.amazonaws.services.logs.model.DescribeResourcePoliciesResult> {

	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.logs.model.DescribeResourcePoliciesRequest {
		val input = com.amazonaws.services.logs.model.DescribeResourcePoliciesRequest()
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.DescribeResourcePoliciesResult {
	  return com.amazonaws.services.logs.model.DescribeResourcePoliciesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.DescribeResourcePoliciesResult {
		return environment.logs.describeResourcePolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs describe-resource-policies")
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSLogsFunctions.describeSubscriptionFilters(init: AWSLogsDescribeSubscriptionFiltersCommand.() -> Unit): com.amazonaws.services.logs.model.DescribeSubscriptionFiltersResult {
	return this.block.declare(AWSLogsDescribeSubscriptionFiltersCommand().apply(init)) as com.amazonaws.services.logs.model.DescribeSubscriptionFiltersResult
}

@Generated
class AWSLogsDescribeSubscriptionFiltersCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DescribeSubscriptionFiltersRequest, com.amazonaws.services.logs.model.DescribeSubscriptionFiltersResult> {

	var logGroupName: String? = null
	var filterNamePrefix: String? = null
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.logs.model.DescribeSubscriptionFiltersRequest {
		val input = com.amazonaws.services.logs.model.DescribeSubscriptionFiltersRequest()
		input.setLogGroupName(this.logGroupName)
		input.setFilterNamePrefix(this.filterNamePrefix)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.DescribeSubscriptionFiltersResult {
	  return com.amazonaws.services.logs.model.DescribeSubscriptionFiltersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.DescribeSubscriptionFiltersResult {
		return environment.logs.describeSubscriptionFilters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs describe-subscription-filters")
				.argument("log-group-name", logGroupName)
				.argument("filter-name-prefix", filterNamePrefix)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSLogsFunctions.disassociateKmsKey(init: AWSLogsDisassociateKmsKeyCommand.() -> Unit): com.amazonaws.services.logs.model.DisassociateKmsKeyResult {
	return this.block.declare(AWSLogsDisassociateKmsKeyCommand().apply(init)) as com.amazonaws.services.logs.model.DisassociateKmsKeyResult
}

@Generated
class AWSLogsDisassociateKmsKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DisassociateKmsKeyRequest, com.amazonaws.services.logs.model.DisassociateKmsKeyResult> {

	var logGroupName: String? = null

	override fun build(): com.amazonaws.services.logs.model.DisassociateKmsKeyRequest {
		val input = com.amazonaws.services.logs.model.DisassociateKmsKeyRequest()
		input.setLogGroupName(this.logGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.DisassociateKmsKeyResult {
	  return com.amazonaws.services.logs.model.DisassociateKmsKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.DisassociateKmsKeyResult {
		return environment.logs.disassociateKmsKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs disassociate-kms-key")
				.argument("log-group-name", logGroupName)
	}

}


fun AWSLogsFunctions.filterLogEvents(init: AWSLogsFilterLogEventsCommand.() -> Unit): com.amazonaws.services.logs.model.FilterLogEventsResult {
	return this.block.declare(AWSLogsFilterLogEventsCommand().apply(init)) as com.amazonaws.services.logs.model.FilterLogEventsResult
}

@Generated
class AWSLogsFilterLogEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.FilterLogEventsRequest, com.amazonaws.services.logs.model.FilterLogEventsResult> {

	var logGroupName: String? = null
	var logStreamNames: List<String>? = null
	var startTime: Long? = 0L
	var endTime: Long? = 0L
	var filterPattern: String? = null
	var nextToken: String? = null
	var limit: Int? = 0
	var interleaved: Boolean? = false

	override fun build(): com.amazonaws.services.logs.model.FilterLogEventsRequest {
		val input = com.amazonaws.services.logs.model.FilterLogEventsRequest()
		input.setLogGroupName(this.logGroupName)
		input.setLogStreamNames(this.logStreamNames)
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setFilterPattern(this.filterPattern)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		input.setInterleaved(this.interleaved)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.FilterLogEventsResult {
	  return com.amazonaws.services.logs.model.FilterLogEventsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.FilterLogEventsResult {
		return environment.logs.filterLogEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs filter-log-events")
				.argument("log-group-name", logGroupName)
				.argument("log-stream-names", logStreamNames?.toString())
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("filter-pattern", filterPattern)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
				.option("interleaved", interleaved ?: false)
	}

}


fun AWSLogsFunctions.getLogEvents(init: AWSLogsGetLogEventsCommand.() -> Unit): com.amazonaws.services.logs.model.GetLogEventsResult {
	return this.block.declare(AWSLogsGetLogEventsCommand().apply(init)) as com.amazonaws.services.logs.model.GetLogEventsResult
}

@Generated
class AWSLogsGetLogEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.GetLogEventsRequest, com.amazonaws.services.logs.model.GetLogEventsResult> {

	var logGroupName: String? = null
	var logStreamName: String? = null
	var startTime: Long? = 0L
	var endTime: Long? = 0L
	var nextToken: String? = null
	var limit: Int? = 0
	var startFromHead: Boolean? = false

	override fun build(): com.amazonaws.services.logs.model.GetLogEventsRequest {
		val input = com.amazonaws.services.logs.model.GetLogEventsRequest()
		input.setLogGroupName(this.logGroupName)
		input.setLogStreamName(this.logStreamName)
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		input.setStartFromHead(this.startFromHead)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.GetLogEventsResult {
	  return com.amazonaws.services.logs.model.GetLogEventsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.GetLogEventsResult {
		return environment.logs.getLogEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs get-log-events")
				.argument("log-group-name", logGroupName)
				.argument("log-stream-name", logStreamName)
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
				.option("start-from-head", startFromHead ?: false)
	}

}


fun AWSLogsFunctions.listTagsLogGroup(init: AWSLogsListTagsLogGroupCommand.() -> Unit): com.amazonaws.services.logs.model.ListTagsLogGroupResult {
	return this.block.declare(AWSLogsListTagsLogGroupCommand().apply(init)) as com.amazonaws.services.logs.model.ListTagsLogGroupResult
}

@Generated
class AWSLogsListTagsLogGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.ListTagsLogGroupRequest, com.amazonaws.services.logs.model.ListTagsLogGroupResult> {

	var logGroupName: String? = null

	override fun build(): com.amazonaws.services.logs.model.ListTagsLogGroupRequest {
		val input = com.amazonaws.services.logs.model.ListTagsLogGroupRequest()
		input.setLogGroupName(this.logGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.ListTagsLogGroupResult {
	  return com.amazonaws.services.logs.model.ListTagsLogGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.ListTagsLogGroupResult {
		return environment.logs.listTagsLogGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs list-tags-log-group")
				.argument("log-group-name", logGroupName)
	}

}


fun AWSLogsFunctions.putDestination(init: AWSLogsPutDestinationCommand.() -> Unit): com.amazonaws.services.logs.model.PutDestinationResult {
	return this.block.declare(AWSLogsPutDestinationCommand().apply(init)) as com.amazonaws.services.logs.model.PutDestinationResult
}

@Generated
class AWSLogsPutDestinationCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.PutDestinationRequest, com.amazonaws.services.logs.model.PutDestinationResult> {

	var destinationName: String? = null
	var targetArn: String? = null
	var roleArn: String? = null

	override fun build(): com.amazonaws.services.logs.model.PutDestinationRequest {
		val input = com.amazonaws.services.logs.model.PutDestinationRequest()
		input.setDestinationName(this.destinationName)
		input.setTargetArn(this.targetArn)
		input.setRoleArn(this.roleArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.PutDestinationResult {
	  return com.amazonaws.services.logs.model.PutDestinationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.PutDestinationResult {
		return environment.logs.putDestination(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs put-destination")
				.argument("destination-name", destinationName)
				.argument("target-arn", targetArn)
				.argument("role-arn", roleArn)
	}

}


fun AWSLogsFunctions.putDestinationPolicy(init: AWSLogsPutDestinationPolicyCommand.() -> Unit): com.amazonaws.services.logs.model.PutDestinationPolicyResult {
	return this.block.declare(AWSLogsPutDestinationPolicyCommand().apply(init)) as com.amazonaws.services.logs.model.PutDestinationPolicyResult
}

@Generated
class AWSLogsPutDestinationPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.PutDestinationPolicyRequest, com.amazonaws.services.logs.model.PutDestinationPolicyResult> {

	var destinationName: String? = null
	var accessPolicy: String? = null

	override fun build(): com.amazonaws.services.logs.model.PutDestinationPolicyRequest {
		val input = com.amazonaws.services.logs.model.PutDestinationPolicyRequest()
		input.setDestinationName(this.destinationName)
		input.setAccessPolicy(this.accessPolicy)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.PutDestinationPolicyResult {
	  return com.amazonaws.services.logs.model.PutDestinationPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.PutDestinationPolicyResult {
		return environment.logs.putDestinationPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs put-destination-policy")
				.argument("destination-name", destinationName)
				.argument("access-policy", accessPolicy)
	}

}


fun AWSLogsFunctions.putLogEvents(init: AWSLogsPutLogEventsCommand.() -> Unit): com.amazonaws.services.logs.model.PutLogEventsResult {
	return this.block.declare(AWSLogsPutLogEventsCommand().apply(init)) as com.amazonaws.services.logs.model.PutLogEventsResult
}

@Generated
class AWSLogsPutLogEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.PutLogEventsRequest, com.amazonaws.services.logs.model.PutLogEventsResult> {

	var logGroupName: String? = null
	var logStreamName: String? = null
	var logEvents: List<com.amazonaws.services.logs.model.InputLogEvent>? = null
	var sequenceToken: String? = null

	override fun build(): com.amazonaws.services.logs.model.PutLogEventsRequest {
		val input = com.amazonaws.services.logs.model.PutLogEventsRequest()
		input.setLogGroupName(this.logGroupName)
		input.setLogStreamName(this.logStreamName)
		input.setLogEvents(this.logEvents)
		input.setSequenceToken(this.sequenceToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.PutLogEventsResult {
	  return com.amazonaws.services.logs.model.PutLogEventsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.PutLogEventsResult {
		return environment.logs.putLogEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs put-log-events")
				.argument("log-group-name", logGroupName)
				.argument("log-stream-name", logStreamName)
				.argument("log-events", logEvents?.toString())
				.argument("sequence-token", sequenceToken)
	}

}


fun AWSLogsFunctions.putMetricFilter(init: AWSLogsPutMetricFilterCommand.() -> Unit): com.amazonaws.services.logs.model.PutMetricFilterResult {
	return this.block.declare(AWSLogsPutMetricFilterCommand().apply(init)) as com.amazonaws.services.logs.model.PutMetricFilterResult
}

@Generated
class AWSLogsPutMetricFilterCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.PutMetricFilterRequest, com.amazonaws.services.logs.model.PutMetricFilterResult> {

	var logGroupName: String? = null
	var filterName: String? = null
	var filterPattern: String? = null
	var metricTransformations: List<com.amazonaws.services.logs.model.MetricTransformation>? = null

	override fun build(): com.amazonaws.services.logs.model.PutMetricFilterRequest {
		val input = com.amazonaws.services.logs.model.PutMetricFilterRequest()
		input.setLogGroupName(this.logGroupName)
		input.setFilterName(this.filterName)
		input.setFilterPattern(this.filterPattern)
		input.setMetricTransformations(this.metricTransformations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.PutMetricFilterResult {
	  return com.amazonaws.services.logs.model.PutMetricFilterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.PutMetricFilterResult {
		return environment.logs.putMetricFilter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs put-metric-filter")
				.argument("log-group-name", logGroupName)
				.argument("filter-name", filterName)
				.argument("filter-pattern", filterPattern)
				.argument("metric-transformations", metricTransformations?.toString())
	}

}


fun AWSLogsFunctions.putResourcePolicy(init: AWSLogsPutResourcePolicyCommand.() -> Unit): com.amazonaws.services.logs.model.PutResourcePolicyResult {
	return this.block.declare(AWSLogsPutResourcePolicyCommand().apply(init)) as com.amazonaws.services.logs.model.PutResourcePolicyResult
}

@Generated
class AWSLogsPutResourcePolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.PutResourcePolicyRequest, com.amazonaws.services.logs.model.PutResourcePolicyResult> {

	var policyName: String? = null
	var policyDocument: String? = null

	override fun build(): com.amazonaws.services.logs.model.PutResourcePolicyRequest {
		val input = com.amazonaws.services.logs.model.PutResourcePolicyRequest()
		input.setPolicyName(this.policyName)
		input.setPolicyDocument(this.policyDocument)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.PutResourcePolicyResult {
	  return com.amazonaws.services.logs.model.PutResourcePolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.PutResourcePolicyResult {
		return environment.logs.putResourcePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs put-resource-policy")
				.argument("policy-name", policyName)
				.argument("policy-document", policyDocument)
	}

}


fun AWSLogsFunctions.putRetentionPolicy(init: AWSLogsPutRetentionPolicyCommand.() -> Unit): com.amazonaws.services.logs.model.PutRetentionPolicyResult {
	return this.block.declare(AWSLogsPutRetentionPolicyCommand().apply(init)) as com.amazonaws.services.logs.model.PutRetentionPolicyResult
}

@Generated
class AWSLogsPutRetentionPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.PutRetentionPolicyRequest, com.amazonaws.services.logs.model.PutRetentionPolicyResult> {

	var logGroupName: String? = null
	var retentionInDays: Int? = 0

	override fun build(): com.amazonaws.services.logs.model.PutRetentionPolicyRequest {
		val input = com.amazonaws.services.logs.model.PutRetentionPolicyRequest()
		input.setLogGroupName(this.logGroupName)
		input.setRetentionInDays(this.retentionInDays)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.PutRetentionPolicyResult {
	  return com.amazonaws.services.logs.model.PutRetentionPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.PutRetentionPolicyResult {
		return environment.logs.putRetentionPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs put-retention-policy")
				.argument("log-group-name", logGroupName)
				.argument("retention-in-days", retentionInDays?.toString())
	}

}


fun AWSLogsFunctions.putSubscriptionFilter(init: AWSLogsPutSubscriptionFilterCommand.() -> Unit): com.amazonaws.services.logs.model.PutSubscriptionFilterResult {
	return this.block.declare(AWSLogsPutSubscriptionFilterCommand().apply(init)) as com.amazonaws.services.logs.model.PutSubscriptionFilterResult
}

@Generated
class AWSLogsPutSubscriptionFilterCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.PutSubscriptionFilterRequest, com.amazonaws.services.logs.model.PutSubscriptionFilterResult> {

	var logGroupName: String? = null
	var filterName: String? = null
	var filterPattern: String? = null
	var destinationArn: String? = null
	var roleArn: String? = null
	var distribution: Distribution? = null

	override fun build(): com.amazonaws.services.logs.model.PutSubscriptionFilterRequest {
		val input = com.amazonaws.services.logs.model.PutSubscriptionFilterRequest()
		input.setLogGroupName(this.logGroupName)
		input.setFilterName(this.filterName)
		input.setFilterPattern(this.filterPattern)
		input.setDestinationArn(this.destinationArn)
		input.setRoleArn(this.roleArn)
		input.setDistribution(this.distribution?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.PutSubscriptionFilterResult {
	  return com.amazonaws.services.logs.model.PutSubscriptionFilterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.PutSubscriptionFilterResult {
		return environment.logs.putSubscriptionFilter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs put-subscription-filter")
				.argument("log-group-name", logGroupName)
				.argument("filter-name", filterName)
				.argument("filter-pattern", filterPattern)
				.argument("destination-arn", destinationArn)
				.argument("role-arn", roleArn)
				.argument("distribution", distribution?.toString())
	}

}


fun AWSLogsFunctions.tagLogGroup(init: AWSLogsTagLogGroupCommand.() -> Unit): com.amazonaws.services.logs.model.TagLogGroupResult {
	return this.block.declare(AWSLogsTagLogGroupCommand().apply(init)) as com.amazonaws.services.logs.model.TagLogGroupResult
}

@Generated
class AWSLogsTagLogGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.TagLogGroupRequest, com.amazonaws.services.logs.model.TagLogGroupResult> {

	var logGroupName: String? = null
	var tags: Map<String, String>? = null

	override fun build(): com.amazonaws.services.logs.model.TagLogGroupRequest {
		val input = com.amazonaws.services.logs.model.TagLogGroupRequest()
		input.setLogGroupName(this.logGroupName)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.TagLogGroupResult {
	  return com.amazonaws.services.logs.model.TagLogGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.TagLogGroupResult {
		return environment.logs.tagLogGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs tag-log-group")
				.argument("log-group-name", logGroupName)
				.argument("tags", tags?.toString())
	}

}


fun AWSLogsFunctions.testMetricFilter(init: AWSLogsTestMetricFilterCommand.() -> Unit): com.amazonaws.services.logs.model.TestMetricFilterResult {
	return this.block.declare(AWSLogsTestMetricFilterCommand().apply(init)) as com.amazonaws.services.logs.model.TestMetricFilterResult
}

@Generated
class AWSLogsTestMetricFilterCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.TestMetricFilterRequest, com.amazonaws.services.logs.model.TestMetricFilterResult> {

	var filterPattern: String? = null
	var logEventMessages: List<String>? = null

	override fun build(): com.amazonaws.services.logs.model.TestMetricFilterRequest {
		val input = com.amazonaws.services.logs.model.TestMetricFilterRequest()
		input.setFilterPattern(this.filterPattern)
		input.setLogEventMessages(this.logEventMessages)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.TestMetricFilterResult {
	  return com.amazonaws.services.logs.model.TestMetricFilterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.TestMetricFilterResult {
		return environment.logs.testMetricFilter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs test-metric-filter")
				.argument("filter-pattern", filterPattern)
				.argument("log-event-messages", logEventMessages?.toString())
	}

}


fun AWSLogsFunctions.untagLogGroup(init: AWSLogsUntagLogGroupCommand.() -> Unit): com.amazonaws.services.logs.model.UntagLogGroupResult {
	return this.block.declare(AWSLogsUntagLogGroupCommand().apply(init)) as com.amazonaws.services.logs.model.UntagLogGroupResult
}

@Generated
class AWSLogsUntagLogGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.UntagLogGroupRequest, com.amazonaws.services.logs.model.UntagLogGroupResult> {

	var logGroupName: String? = null
	var tags: List<String>? = null

	override fun build(): com.amazonaws.services.logs.model.UntagLogGroupRequest {
		val input = com.amazonaws.services.logs.model.UntagLogGroupRequest()
		input.setLogGroupName(this.logGroupName)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.logs.model.UntagLogGroupResult {
	  return com.amazonaws.services.logs.model.UntagLogGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.logs.model.UntagLogGroupResult {
		return environment.logs.untagLogGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs untag-log-group")
				.argument("log-group-name", logGroupName)
				.argument("tags", tags?.toString())
	}

}
