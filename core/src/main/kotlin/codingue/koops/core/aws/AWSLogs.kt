
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.logs.AWSLogs
import com.amazonaws.services.logs.model.*

var codingue.koops.core.Environment.logs: AWSLogs
	get() = this.capabilities[AWSLogs::class.java.name] as AWSLogs
	set(logs) {
		this.capabilities[AWSLogs::class.java.name] = logs
	}

@Generated
class AWSLogsFunctions(val block: Block)

infix fun AwsContinuation.logs(init: AWSLogsFunctions.() -> Unit) {
	AWSLogsFunctions(shell).apply(init)
}

			

fun AWSLogsFunctions.associateKmsKey(init: AWSLogsAssociateKmsKeyCommand.() -> Unit) {
	this.block.declare(AWSLogsAssociateKmsKeyCommand().apply(init))
}

@Generated
class AWSLogsAssociateKmsKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.AssociateKmsKeyRequest> {

	var logGroupName: String? = null
	var kmsKeyId: String? = null

	override fun build(): com.amazonaws.services.logs.model.AssociateKmsKeyRequest {
		val input = com.amazonaws.services.logs.model.AssociateKmsKeyRequest()
		input.setLogGroupName(this.logGroupName)
		input.setKmsKeyId(this.kmsKeyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.associateKmsKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs associate-kms-key")
				.argument("log-group-name", logGroupName)
				.argument("kms-key-id", kmsKeyId)
	}

}


fun AWSLogsFunctions.cancelExportTask(init: AWSLogsCancelExportTaskCommand.() -> Unit) {
	this.block.declare(AWSLogsCancelExportTaskCommand().apply(init))
}

@Generated
class AWSLogsCancelExportTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.CancelExportTaskRequest> {

	var taskId: String? = null

	override fun build(): com.amazonaws.services.logs.model.CancelExportTaskRequest {
		val input = com.amazonaws.services.logs.model.CancelExportTaskRequest()
		input.setTaskId(this.taskId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.cancelExportTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs cancel-export-task")
				.argument("task-id", taskId)
	}

}


fun AWSLogsFunctions.createExportTask(init: AWSLogsCreateExportTaskCommand.() -> Unit) {
	this.block.declare(AWSLogsCreateExportTaskCommand().apply(init))
}

@Generated
class AWSLogsCreateExportTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.CreateExportTaskRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.createExportTask(build())
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


fun AWSLogsFunctions.createLogGroup(init: AWSLogsCreateLogGroupCommand.() -> Unit) {
	this.block.declare(AWSLogsCreateLogGroupCommand().apply(init))
}

@Generated
class AWSLogsCreateLogGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.CreateLogGroupRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.createLogGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs create-log-group")
				.argument("log-group-name", logGroupName)
				.argument("kms-key-id", kmsKeyId)
				.argument("tags", tags?.toString())
	}

}


fun AWSLogsFunctions.createLogStream(init: AWSLogsCreateLogStreamCommand.() -> Unit) {
	this.block.declare(AWSLogsCreateLogStreamCommand().apply(init))
}

@Generated
class AWSLogsCreateLogStreamCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.CreateLogStreamRequest> {

	var logGroupName: String? = null
	var logStreamName: String? = null

	override fun build(): com.amazonaws.services.logs.model.CreateLogStreamRequest {
		val input = com.amazonaws.services.logs.model.CreateLogStreamRequest()
		input.setLogGroupName(this.logGroupName)
		input.setLogStreamName(this.logStreamName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.createLogStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs create-log-stream")
				.argument("log-group-name", logGroupName)
				.argument("log-stream-name", logStreamName)
	}

}


fun AWSLogsFunctions.deleteDestination(init: AWSLogsDeleteDestinationCommand.() -> Unit) {
	this.block.declare(AWSLogsDeleteDestinationCommand().apply(init))
}

@Generated
class AWSLogsDeleteDestinationCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DeleteDestinationRequest> {

	var destinationName: String? = null

	override fun build(): com.amazonaws.services.logs.model.DeleteDestinationRequest {
		val input = com.amazonaws.services.logs.model.DeleteDestinationRequest()
		input.setDestinationName(this.destinationName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.deleteDestination(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs delete-destination")
				.argument("destination-name", destinationName)
	}

}


fun AWSLogsFunctions.deleteLogGroup(init: AWSLogsDeleteLogGroupCommand.() -> Unit) {
	this.block.declare(AWSLogsDeleteLogGroupCommand().apply(init))
}

@Generated
class AWSLogsDeleteLogGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DeleteLogGroupRequest> {

	var logGroupName: String? = null

	override fun build(): com.amazonaws.services.logs.model.DeleteLogGroupRequest {
		val input = com.amazonaws.services.logs.model.DeleteLogGroupRequest()
		input.setLogGroupName(this.logGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.deleteLogGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs delete-log-group")
				.argument("log-group-name", logGroupName)
	}

}


fun AWSLogsFunctions.deleteLogStream(init: AWSLogsDeleteLogStreamCommand.() -> Unit) {
	this.block.declare(AWSLogsDeleteLogStreamCommand().apply(init))
}

@Generated
class AWSLogsDeleteLogStreamCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DeleteLogStreamRequest> {

	var logGroupName: String? = null
	var logStreamName: String? = null

	override fun build(): com.amazonaws.services.logs.model.DeleteLogStreamRequest {
		val input = com.amazonaws.services.logs.model.DeleteLogStreamRequest()
		input.setLogGroupName(this.logGroupName)
		input.setLogStreamName(this.logStreamName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.deleteLogStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs delete-log-stream")
				.argument("log-group-name", logGroupName)
				.argument("log-stream-name", logStreamName)
	}

}


fun AWSLogsFunctions.deleteMetricFilter(init: AWSLogsDeleteMetricFilterCommand.() -> Unit) {
	this.block.declare(AWSLogsDeleteMetricFilterCommand().apply(init))
}

@Generated
class AWSLogsDeleteMetricFilterCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DeleteMetricFilterRequest> {

	var logGroupName: String? = null
	var filterName: String? = null

	override fun build(): com.amazonaws.services.logs.model.DeleteMetricFilterRequest {
		val input = com.amazonaws.services.logs.model.DeleteMetricFilterRequest()
		input.setLogGroupName(this.logGroupName)
		input.setFilterName(this.filterName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.deleteMetricFilter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs delete-metric-filter")
				.argument("log-group-name", logGroupName)
				.argument("filter-name", filterName)
	}

}


fun AWSLogsFunctions.deleteResourcePolicy(init: AWSLogsDeleteResourcePolicyCommand.() -> Unit) {
	this.block.declare(AWSLogsDeleteResourcePolicyCommand().apply(init))
}

@Generated
class AWSLogsDeleteResourcePolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DeleteResourcePolicyRequest> {

	var policyName: String? = null

	override fun build(): com.amazonaws.services.logs.model.DeleteResourcePolicyRequest {
		val input = com.amazonaws.services.logs.model.DeleteResourcePolicyRequest()
		input.setPolicyName(this.policyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.deleteResourcePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs delete-resource-policy")
				.argument("policy-name", policyName)
	}

}


fun AWSLogsFunctions.deleteRetentionPolicy(init: AWSLogsDeleteRetentionPolicyCommand.() -> Unit) {
	this.block.declare(AWSLogsDeleteRetentionPolicyCommand().apply(init))
}

@Generated
class AWSLogsDeleteRetentionPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DeleteRetentionPolicyRequest> {

	var logGroupName: String? = null

	override fun build(): com.amazonaws.services.logs.model.DeleteRetentionPolicyRequest {
		val input = com.amazonaws.services.logs.model.DeleteRetentionPolicyRequest()
		input.setLogGroupName(this.logGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.deleteRetentionPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs delete-retention-policy")
				.argument("log-group-name", logGroupName)
	}

}


fun AWSLogsFunctions.deleteSubscriptionFilter(init: AWSLogsDeleteSubscriptionFilterCommand.() -> Unit) {
	this.block.declare(AWSLogsDeleteSubscriptionFilterCommand().apply(init))
}

@Generated
class AWSLogsDeleteSubscriptionFilterCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DeleteSubscriptionFilterRequest> {

	var logGroupName: String? = null
	var filterName: String? = null

	override fun build(): com.amazonaws.services.logs.model.DeleteSubscriptionFilterRequest {
		val input = com.amazonaws.services.logs.model.DeleteSubscriptionFilterRequest()
		input.setLogGroupName(this.logGroupName)
		input.setFilterName(this.filterName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.deleteSubscriptionFilter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs delete-subscription-filter")
				.argument("log-group-name", logGroupName)
				.argument("filter-name", filterName)
	}

}


fun AWSLogsFunctions.describeDestinations(init: AWSLogsDescribeDestinationsCommand.() -> Unit) {
	this.block.declare(AWSLogsDescribeDestinationsCommand().apply(init))
}

@Generated
class AWSLogsDescribeDestinationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DescribeDestinationsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.describeDestinations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs describe-destinations")
				.argument("destination-name-prefix", destinationNamePrefix)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSLogsFunctions.describeExportTasks(init: AWSLogsDescribeExportTasksCommand.() -> Unit) {
	this.block.declare(AWSLogsDescribeExportTasksCommand().apply(init))
}

@Generated
class AWSLogsDescribeExportTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DescribeExportTasksRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.describeExportTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs describe-export-tasks")
				.argument("task-id", taskId)
				.argument("status-code", statusCode?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSLogsFunctions.describeLogGroups(init: AWSLogsDescribeLogGroupsCommand.() -> Unit) {
	this.block.declare(AWSLogsDescribeLogGroupsCommand().apply(init))
}

@Generated
class AWSLogsDescribeLogGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DescribeLogGroupsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.describeLogGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs describe-log-groups")
				.argument("log-group-name-prefix", logGroupNamePrefix)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSLogsFunctions.describeLogStreams(init: AWSLogsDescribeLogStreamsCommand.() -> Unit) {
	this.block.declare(AWSLogsDescribeLogStreamsCommand().apply(init))
}

@Generated
class AWSLogsDescribeLogStreamsCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DescribeLogStreamsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.describeLogStreams(build())
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


fun AWSLogsFunctions.describeMetricFilters(init: AWSLogsDescribeMetricFiltersCommand.() -> Unit) {
	this.block.declare(AWSLogsDescribeMetricFiltersCommand().apply(init))
}

@Generated
class AWSLogsDescribeMetricFiltersCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DescribeMetricFiltersRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.describeMetricFilters(build())
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


fun AWSLogsFunctions.describeResourcePolicies(init: AWSLogsDescribeResourcePoliciesCommand.() -> Unit) {
	this.block.declare(AWSLogsDescribeResourcePoliciesCommand().apply(init))
}

@Generated
class AWSLogsDescribeResourcePoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DescribeResourcePoliciesRequest> {

	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.logs.model.DescribeResourcePoliciesRequest {
		val input = com.amazonaws.services.logs.model.DescribeResourcePoliciesRequest()
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.describeResourcePolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs describe-resource-policies")
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSLogsFunctions.describeSubscriptionFilters(init: AWSLogsDescribeSubscriptionFiltersCommand.() -> Unit) {
	this.block.declare(AWSLogsDescribeSubscriptionFiltersCommand().apply(init))
}

@Generated
class AWSLogsDescribeSubscriptionFiltersCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DescribeSubscriptionFiltersRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.describeSubscriptionFilters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs describe-subscription-filters")
				.argument("log-group-name", logGroupName)
				.argument("filter-name-prefix", filterNamePrefix)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSLogsFunctions.disassociateKmsKey(init: AWSLogsDisassociateKmsKeyCommand.() -> Unit) {
	this.block.declare(AWSLogsDisassociateKmsKeyCommand().apply(init))
}

@Generated
class AWSLogsDisassociateKmsKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.DisassociateKmsKeyRequest> {

	var logGroupName: String? = null

	override fun build(): com.amazonaws.services.logs.model.DisassociateKmsKeyRequest {
		val input = com.amazonaws.services.logs.model.DisassociateKmsKeyRequest()
		input.setLogGroupName(this.logGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.disassociateKmsKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs disassociate-kms-key")
				.argument("log-group-name", logGroupName)
	}

}


fun AWSLogsFunctions.filterLogEvents(init: AWSLogsFilterLogEventsCommand.() -> Unit) {
	this.block.declare(AWSLogsFilterLogEventsCommand().apply(init))
}

@Generated
class AWSLogsFilterLogEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.FilterLogEventsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.filterLogEvents(build())
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


fun AWSLogsFunctions.getLogEvents(init: AWSLogsGetLogEventsCommand.() -> Unit) {
	this.block.declare(AWSLogsGetLogEventsCommand().apply(init))
}

@Generated
class AWSLogsGetLogEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.GetLogEventsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.getLogEvents(build())
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


fun AWSLogsFunctions.listTagsLogGroup(init: AWSLogsListTagsLogGroupCommand.() -> Unit) {
	this.block.declare(AWSLogsListTagsLogGroupCommand().apply(init))
}

@Generated
class AWSLogsListTagsLogGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.ListTagsLogGroupRequest> {

	var logGroupName: String? = null

	override fun build(): com.amazonaws.services.logs.model.ListTagsLogGroupRequest {
		val input = com.amazonaws.services.logs.model.ListTagsLogGroupRequest()
		input.setLogGroupName(this.logGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.listTagsLogGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs list-tags-log-group")
				.argument("log-group-name", logGroupName)
	}

}


fun AWSLogsFunctions.putDestination(init: AWSLogsPutDestinationCommand.() -> Unit) {
	this.block.declare(AWSLogsPutDestinationCommand().apply(init))
}

@Generated
class AWSLogsPutDestinationCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.PutDestinationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.putDestination(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs put-destination")
				.argument("destination-name", destinationName)
				.argument("target-arn", targetArn)
				.argument("role-arn", roleArn)
	}

}


fun AWSLogsFunctions.putDestinationPolicy(init: AWSLogsPutDestinationPolicyCommand.() -> Unit) {
	this.block.declare(AWSLogsPutDestinationPolicyCommand().apply(init))
}

@Generated
class AWSLogsPutDestinationPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.PutDestinationPolicyRequest> {

	var destinationName: String? = null
	var accessPolicy: String? = null

	override fun build(): com.amazonaws.services.logs.model.PutDestinationPolicyRequest {
		val input = com.amazonaws.services.logs.model.PutDestinationPolicyRequest()
		input.setDestinationName(this.destinationName)
		input.setAccessPolicy(this.accessPolicy)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.putDestinationPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs put-destination-policy")
				.argument("destination-name", destinationName)
				.argument("access-policy", accessPolicy)
	}

}


fun AWSLogsFunctions.putLogEvents(init: AWSLogsPutLogEventsCommand.() -> Unit) {
	this.block.declare(AWSLogsPutLogEventsCommand().apply(init))
}

@Generated
class AWSLogsPutLogEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.PutLogEventsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.putLogEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs put-log-events")
				.argument("log-group-name", logGroupName)
				.argument("log-stream-name", logStreamName)
				.argument("log-events", logEvents?.toString())
				.argument("sequence-token", sequenceToken)
	}

}


fun AWSLogsFunctions.putMetricFilter(init: AWSLogsPutMetricFilterCommand.() -> Unit) {
	this.block.declare(AWSLogsPutMetricFilterCommand().apply(init))
}

@Generated
class AWSLogsPutMetricFilterCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.PutMetricFilterRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.putMetricFilter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs put-metric-filter")
				.argument("log-group-name", logGroupName)
				.argument("filter-name", filterName)
				.argument("filter-pattern", filterPattern)
				.argument("metric-transformations", metricTransformations?.toString())
	}

}


fun AWSLogsFunctions.putResourcePolicy(init: AWSLogsPutResourcePolicyCommand.() -> Unit) {
	this.block.declare(AWSLogsPutResourcePolicyCommand().apply(init))
}

@Generated
class AWSLogsPutResourcePolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.PutResourcePolicyRequest> {

	var policyName: String? = null
	var policyDocument: String? = null

	override fun build(): com.amazonaws.services.logs.model.PutResourcePolicyRequest {
		val input = com.amazonaws.services.logs.model.PutResourcePolicyRequest()
		input.setPolicyName(this.policyName)
		input.setPolicyDocument(this.policyDocument)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.putResourcePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs put-resource-policy")
				.argument("policy-name", policyName)
				.argument("policy-document", policyDocument)
	}

}


fun AWSLogsFunctions.putRetentionPolicy(init: AWSLogsPutRetentionPolicyCommand.() -> Unit) {
	this.block.declare(AWSLogsPutRetentionPolicyCommand().apply(init))
}

@Generated
class AWSLogsPutRetentionPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.PutRetentionPolicyRequest> {

	var logGroupName: String? = null
	var retentionInDays: Int? = 0

	override fun build(): com.amazonaws.services.logs.model.PutRetentionPolicyRequest {
		val input = com.amazonaws.services.logs.model.PutRetentionPolicyRequest()
		input.setLogGroupName(this.logGroupName)
		input.setRetentionInDays(this.retentionInDays)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.putRetentionPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs put-retention-policy")
				.argument("log-group-name", logGroupName)
				.argument("retention-in-days", retentionInDays?.toString())
	}

}


fun AWSLogsFunctions.putSubscriptionFilter(init: AWSLogsPutSubscriptionFilterCommand.() -> Unit) {
	this.block.declare(AWSLogsPutSubscriptionFilterCommand().apply(init))
}

@Generated
class AWSLogsPutSubscriptionFilterCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.PutSubscriptionFilterRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.putSubscriptionFilter(build())
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


fun AWSLogsFunctions.tagLogGroup(init: AWSLogsTagLogGroupCommand.() -> Unit) {
	this.block.declare(AWSLogsTagLogGroupCommand().apply(init))
}

@Generated
class AWSLogsTagLogGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.TagLogGroupRequest> {

	var logGroupName: String? = null
	var tags: Map<String, String>? = null

	override fun build(): com.amazonaws.services.logs.model.TagLogGroupRequest {
		val input = com.amazonaws.services.logs.model.TagLogGroupRequest()
		input.setLogGroupName(this.logGroupName)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.tagLogGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs tag-log-group")
				.argument("log-group-name", logGroupName)
				.argument("tags", tags?.toString())
	}

}


fun AWSLogsFunctions.testMetricFilter(init: AWSLogsTestMetricFilterCommand.() -> Unit) {
	this.block.declare(AWSLogsTestMetricFilterCommand().apply(init))
}

@Generated
class AWSLogsTestMetricFilterCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.TestMetricFilterRequest> {

	var filterPattern: String? = null
	var logEventMessages: List<String>? = null

	override fun build(): com.amazonaws.services.logs.model.TestMetricFilterRequest {
		val input = com.amazonaws.services.logs.model.TestMetricFilterRequest()
		input.setFilterPattern(this.filterPattern)
		input.setLogEventMessages(this.logEventMessages)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.testMetricFilter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs test-metric-filter")
				.argument("filter-pattern", filterPattern)
				.argument("log-event-messages", logEventMessages?.toString())
	}

}


fun AWSLogsFunctions.untagLogGroup(init: AWSLogsUntagLogGroupCommand.() -> Unit) {
	this.block.declare(AWSLogsUntagLogGroupCommand().apply(init))
}

@Generated
class AWSLogsUntagLogGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.logs.model.UntagLogGroupRequest> {

	var logGroupName: String? = null
	var tags: List<String>? = null

	override fun build(): com.amazonaws.services.logs.model.UntagLogGroupRequest {
		val input = com.amazonaws.services.logs.model.UntagLogGroupRequest()
		input.setLogGroupName(this.logGroupName)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.logs.untagLogGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws logs untag-log-group")
				.argument("log-group-name", logGroupName)
				.argument("tags", tags?.toString())
	}

}
