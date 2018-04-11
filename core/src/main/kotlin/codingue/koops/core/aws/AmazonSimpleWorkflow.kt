
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow
import com.amazonaws.services.simpleworkflow.model.*

var codingue.koops.core.Environment.swf: AmazonSimpleWorkflow
	get() = this.capabilities[AmazonSimpleWorkflow::class.java.name] as AmazonSimpleWorkflow
	set(swf) {
		this.capabilities[AmazonSimpleWorkflow::class.java.name] = swf
	}

@Generated
class AmazonSimpleWorkflowFunctions(val block: Block)

infix fun <T> AwsContinuation.swf(init: AmazonSimpleWorkflowFunctions.() -> T): T {
	return AmazonSimpleWorkflowFunctions(shell).run(init)
}

			

fun AmazonSimpleWorkflowFunctions.countClosedWorkflowExecutions(init: AmazonSimpleWorkflowCountClosedWorkflowExecutionsCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount {
	return this.block.declare(AmazonSimpleWorkflowCountClosedWorkflowExecutionsCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount
}

@Generated
class AmazonSimpleWorkflowCountClosedWorkflowExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.CountClosedWorkflowExecutionsRequest, com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount> {

	var domain: String? = null
	var startTimeFilter: com.amazonaws.services.simpleworkflow.model.ExecutionTimeFilter? = null
	var closeTimeFilter: com.amazonaws.services.simpleworkflow.model.ExecutionTimeFilter? = null
	var executionFilter: com.amazonaws.services.simpleworkflow.model.WorkflowExecutionFilter? = null
	var typeFilter: com.amazonaws.services.simpleworkflow.model.WorkflowTypeFilter? = null
	var tagFilter: com.amazonaws.services.simpleworkflow.model.TagFilter? = null
	var closeStatusFilter: com.amazonaws.services.simpleworkflow.model.CloseStatusFilter? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.CountClosedWorkflowExecutionsRequest {
		val input = com.amazonaws.services.simpleworkflow.model.CountClosedWorkflowExecutionsRequest()
		input.setDomain(this.domain)
		input.setStartTimeFilter(this.startTimeFilter)
		input.setCloseTimeFilter(this.closeTimeFilter)
		input.setExecutionFilter(this.executionFilter)
		input.setTypeFilter(this.typeFilter)
		input.setTagFilter(this.tagFilter)
		input.setCloseStatusFilter(this.closeStatusFilter)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount {
	  return com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount {
		return environment.swf.countClosedWorkflowExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf count-closed-workflow-executions")
				.argument("domain", domain)
				.argument("start-time-filter", startTimeFilter?.toString())
				.argument("close-time-filter", closeTimeFilter?.toString())
				.argument("execution-filter", executionFilter?.toString())
				.argument("type-filter", typeFilter?.toString())
				.argument("tag-filter", tagFilter?.toString())
				.argument("close-status-filter", closeStatusFilter?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.countOpenWorkflowExecutions(init: AmazonSimpleWorkflowCountOpenWorkflowExecutionsCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount {
	return this.block.declare(AmazonSimpleWorkflowCountOpenWorkflowExecutionsCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount
}

@Generated
class AmazonSimpleWorkflowCountOpenWorkflowExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.CountOpenWorkflowExecutionsRequest, com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount> {

	var domain: String? = null
	var startTimeFilter: com.amazonaws.services.simpleworkflow.model.ExecutionTimeFilter? = null
	var typeFilter: com.amazonaws.services.simpleworkflow.model.WorkflowTypeFilter? = null
	var tagFilter: com.amazonaws.services.simpleworkflow.model.TagFilter? = null
	var executionFilter: com.amazonaws.services.simpleworkflow.model.WorkflowExecutionFilter? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.CountOpenWorkflowExecutionsRequest {
		val input = com.amazonaws.services.simpleworkflow.model.CountOpenWorkflowExecutionsRequest()
		input.setDomain(this.domain)
		input.setStartTimeFilter(this.startTimeFilter)
		input.setTypeFilter(this.typeFilter)
		input.setTagFilter(this.tagFilter)
		input.setExecutionFilter(this.executionFilter)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount {
	  return com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCount {
		return environment.swf.countOpenWorkflowExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf count-open-workflow-executions")
				.argument("domain", domain)
				.argument("start-time-filter", startTimeFilter?.toString())
				.argument("type-filter", typeFilter?.toString())
				.argument("tag-filter", tagFilter?.toString())
				.argument("execution-filter", executionFilter?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.countPendingActivityTasks(init: AmazonSimpleWorkflowCountPendingActivityTasksCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.PendingTaskCount {
	return this.block.declare(AmazonSimpleWorkflowCountPendingActivityTasksCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.PendingTaskCount
}

@Generated
class AmazonSimpleWorkflowCountPendingActivityTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.CountPendingActivityTasksRequest, com.amazonaws.services.simpleworkflow.model.PendingTaskCount> {

	var domain: String? = null
	var taskList: com.amazonaws.services.simpleworkflow.model.TaskList? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.CountPendingActivityTasksRequest {
		val input = com.amazonaws.services.simpleworkflow.model.CountPendingActivityTasksRequest()
		input.setDomain(this.domain)
		input.setTaskList(this.taskList)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.PendingTaskCount {
	  return com.amazonaws.services.simpleworkflow.model.PendingTaskCount()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.PendingTaskCount {
		return environment.swf.countPendingActivityTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf count-pending-activity-tasks")
				.argument("domain", domain)
				.argument("task-list", taskList?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.countPendingDecisionTasks(init: AmazonSimpleWorkflowCountPendingDecisionTasksCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.PendingTaskCount {
	return this.block.declare(AmazonSimpleWorkflowCountPendingDecisionTasksCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.PendingTaskCount
}

@Generated
class AmazonSimpleWorkflowCountPendingDecisionTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.CountPendingDecisionTasksRequest, com.amazonaws.services.simpleworkflow.model.PendingTaskCount> {

	var domain: String? = null
	var taskList: com.amazonaws.services.simpleworkflow.model.TaskList? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.CountPendingDecisionTasksRequest {
		val input = com.amazonaws.services.simpleworkflow.model.CountPendingDecisionTasksRequest()
		input.setDomain(this.domain)
		input.setTaskList(this.taskList)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.PendingTaskCount {
	  return com.amazonaws.services.simpleworkflow.model.PendingTaskCount()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.PendingTaskCount {
		return environment.swf.countPendingDecisionTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf count-pending-decision-tasks")
				.argument("domain", domain)
				.argument("task-list", taskList?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.deprecateActivityType(init: AmazonSimpleWorkflowDeprecateActivityTypeCommand.() -> Unit): codingue.koops.core.VoidResult {
	return this.block.declare(AmazonSimpleWorkflowDeprecateActivityTypeCommand().apply(init)) as codingue.koops.core.VoidResult
}

@Generated
class AmazonSimpleWorkflowDeprecateActivityTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.DeprecateActivityTypeRequest, codingue.koops.core.VoidResult> {

	var domain: String? = null
	var activityType: com.amazonaws.services.simpleworkflow.model.ActivityType? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.DeprecateActivityTypeRequest {
		val input = com.amazonaws.services.simpleworkflow.model.DeprecateActivityTypeRequest()
		input.setDomain(this.domain)
		input.setActivityType(this.activityType)
		return input
	}

	override fun dryResult(): codingue.koops.core.VoidResult {
	  return codingue.koops.core.VoidResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): codingue.koops.core.VoidResult {
		return environment.swf.deprecateActivityType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf deprecate-activity-type")
				.argument("domain", domain)
				.argument("activity-type", activityType?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.deprecateDomain(init: AmazonSimpleWorkflowDeprecateDomainCommand.() -> Unit): codingue.koops.core.VoidResult {
	return this.block.declare(AmazonSimpleWorkflowDeprecateDomainCommand().apply(init)) as codingue.koops.core.VoidResult
}

@Generated
class AmazonSimpleWorkflowDeprecateDomainCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.DeprecateDomainRequest, codingue.koops.core.VoidResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.DeprecateDomainRequest {
		val input = com.amazonaws.services.simpleworkflow.model.DeprecateDomainRequest()
		input.setName(this.name)
		return input
	}

	override fun dryResult(): codingue.koops.core.VoidResult {
	  return codingue.koops.core.VoidResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): codingue.koops.core.VoidResult {
		return environment.swf.deprecateDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf deprecate-domain")
				.argument("name", name)
	}

}


fun AmazonSimpleWorkflowFunctions.deprecateWorkflowType(init: AmazonSimpleWorkflowDeprecateWorkflowTypeCommand.() -> Unit): codingue.koops.core.VoidResult {
	return this.block.declare(AmazonSimpleWorkflowDeprecateWorkflowTypeCommand().apply(init)) as codingue.koops.core.VoidResult
}

@Generated
class AmazonSimpleWorkflowDeprecateWorkflowTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.DeprecateWorkflowTypeRequest, codingue.koops.core.VoidResult> {

	var domain: String? = null
	var workflowType: com.amazonaws.services.simpleworkflow.model.WorkflowType? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.DeprecateWorkflowTypeRequest {
		val input = com.amazonaws.services.simpleworkflow.model.DeprecateWorkflowTypeRequest()
		input.setDomain(this.domain)
		input.setWorkflowType(this.workflowType)
		return input
	}

	override fun dryResult(): codingue.koops.core.VoidResult {
	  return codingue.koops.core.VoidResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): codingue.koops.core.VoidResult {
		return environment.swf.deprecateWorkflowType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf deprecate-workflow-type")
				.argument("domain", domain)
				.argument("workflow-type", workflowType?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.describeActivityType(init: AmazonSimpleWorkflowDescribeActivityTypeCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.ActivityTypeDetail {
	return this.block.declare(AmazonSimpleWorkflowDescribeActivityTypeCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.ActivityTypeDetail
}

@Generated
class AmazonSimpleWorkflowDescribeActivityTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.DescribeActivityTypeRequest, com.amazonaws.services.simpleworkflow.model.ActivityTypeDetail> {

	var domain: String? = null
	var activityType: com.amazonaws.services.simpleworkflow.model.ActivityType? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.DescribeActivityTypeRequest {
		val input = com.amazonaws.services.simpleworkflow.model.DescribeActivityTypeRequest()
		input.setDomain(this.domain)
		input.setActivityType(this.activityType)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.ActivityTypeDetail {
	  return com.amazonaws.services.simpleworkflow.model.ActivityTypeDetail()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.ActivityTypeDetail {
		return environment.swf.describeActivityType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf describe-activity-type")
				.argument("domain", domain)
				.argument("activity-type", activityType?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.describeDomain(init: AmazonSimpleWorkflowDescribeDomainCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.DomainDetail {
	return this.block.declare(AmazonSimpleWorkflowDescribeDomainCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.DomainDetail
}

@Generated
class AmazonSimpleWorkflowDescribeDomainCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.DescribeDomainRequest, com.amazonaws.services.simpleworkflow.model.DomainDetail> {

	var name: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.DescribeDomainRequest {
		val input = com.amazonaws.services.simpleworkflow.model.DescribeDomainRequest()
		input.setName(this.name)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.DomainDetail {
	  return com.amazonaws.services.simpleworkflow.model.DomainDetail()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.DomainDetail {
		return environment.swf.describeDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf describe-domain")
				.argument("name", name)
	}

}


fun AmazonSimpleWorkflowFunctions.describeWorkflowExecution(init: AmazonSimpleWorkflowDescribeWorkflowExecutionCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.WorkflowExecutionDetail {
	return this.block.declare(AmazonSimpleWorkflowDescribeWorkflowExecutionCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.WorkflowExecutionDetail
}

@Generated
class AmazonSimpleWorkflowDescribeWorkflowExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.DescribeWorkflowExecutionRequest, com.amazonaws.services.simpleworkflow.model.WorkflowExecutionDetail> {

	var domain: String? = null
	var execution: com.amazonaws.services.simpleworkflow.model.WorkflowExecution? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.DescribeWorkflowExecutionRequest {
		val input = com.amazonaws.services.simpleworkflow.model.DescribeWorkflowExecutionRequest()
		input.setDomain(this.domain)
		input.setExecution(this.execution)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.WorkflowExecutionDetail {
	  return com.amazonaws.services.simpleworkflow.model.WorkflowExecutionDetail()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.WorkflowExecutionDetail {
		return environment.swf.describeWorkflowExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf describe-workflow-execution")
				.argument("domain", domain)
				.argument("execution", execution?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.describeWorkflowType(init: AmazonSimpleWorkflowDescribeWorkflowTypeCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.WorkflowTypeDetail {
	return this.block.declare(AmazonSimpleWorkflowDescribeWorkflowTypeCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.WorkflowTypeDetail
}

@Generated
class AmazonSimpleWorkflowDescribeWorkflowTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.DescribeWorkflowTypeRequest, com.amazonaws.services.simpleworkflow.model.WorkflowTypeDetail> {

	var domain: String? = null
	var workflowType: com.amazonaws.services.simpleworkflow.model.WorkflowType? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.DescribeWorkflowTypeRequest {
		val input = com.amazonaws.services.simpleworkflow.model.DescribeWorkflowTypeRequest()
		input.setDomain(this.domain)
		input.setWorkflowType(this.workflowType)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.WorkflowTypeDetail {
	  return com.amazonaws.services.simpleworkflow.model.WorkflowTypeDetail()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.WorkflowTypeDetail {
		return environment.swf.describeWorkflowType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf describe-workflow-type")
				.argument("domain", domain)
				.argument("workflow-type", workflowType?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.getWorkflowExecutionHistory(init: AmazonSimpleWorkflowGetWorkflowExecutionHistoryCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.History {
	return this.block.declare(AmazonSimpleWorkflowGetWorkflowExecutionHistoryCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.History
}

@Generated
class AmazonSimpleWorkflowGetWorkflowExecutionHistoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.GetWorkflowExecutionHistoryRequest, com.amazonaws.services.simpleworkflow.model.History> {

	var domain: String? = null
	var execution: com.amazonaws.services.simpleworkflow.model.WorkflowExecution? = null
	var nextPageToken: String? = null
	var maximumPageSize: Int? = 0
	var reverseOrder: Boolean? = false

	override fun build(): com.amazonaws.services.simpleworkflow.model.GetWorkflowExecutionHistoryRequest {
		val input = com.amazonaws.services.simpleworkflow.model.GetWorkflowExecutionHistoryRequest()
		input.setDomain(this.domain)
		input.setExecution(this.execution)
		input.setNextPageToken(this.nextPageToken)
		input.setMaximumPageSize(this.maximumPageSize)
		input.setReverseOrder(this.reverseOrder)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.History {
	  return com.amazonaws.services.simpleworkflow.model.History()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.History {
		return environment.swf.getWorkflowExecutionHistory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf get-workflow-execution-history")
				.argument("domain", domain)
				.argument("execution", execution?.toString())
				.argument("next-page-token", nextPageToken)
				.argument("maximum-page-size", maximumPageSize?.toString())
				.option("reverse-order", reverseOrder ?: false)
	}

}


fun AmazonSimpleWorkflowFunctions.listActivityTypes(init: AmazonSimpleWorkflowListActivityTypesCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.ActivityTypeInfos {
	return this.block.declare(AmazonSimpleWorkflowListActivityTypesCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.ActivityTypeInfos
}

@Generated
class AmazonSimpleWorkflowListActivityTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.ListActivityTypesRequest, com.amazonaws.services.simpleworkflow.model.ActivityTypeInfos> {

	var domain: String? = null
	var name: String? = null
	var registrationStatus: RegistrationStatus? = null
	var nextPageToken: String? = null
	var maximumPageSize: Int? = 0
	var reverseOrder: Boolean? = false

	override fun build(): com.amazonaws.services.simpleworkflow.model.ListActivityTypesRequest {
		val input = com.amazonaws.services.simpleworkflow.model.ListActivityTypesRequest()
		input.setDomain(this.domain)
		input.setName(this.name)
		input.setRegistrationStatus(this.registrationStatus?.toString())
		input.setNextPageToken(this.nextPageToken)
		input.setMaximumPageSize(this.maximumPageSize)
		input.setReverseOrder(this.reverseOrder)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.ActivityTypeInfos {
	  return com.amazonaws.services.simpleworkflow.model.ActivityTypeInfos()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.ActivityTypeInfos {
		return environment.swf.listActivityTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf list-activity-types")
				.argument("domain", domain)
				.argument("name", name)
				.argument("registration-status", registrationStatus?.toString())
				.argument("next-page-token", nextPageToken)
				.argument("maximum-page-size", maximumPageSize?.toString())
				.option("reverse-order", reverseOrder ?: false)
	}

}


fun AmazonSimpleWorkflowFunctions.listClosedWorkflowExecutions(init: AmazonSimpleWorkflowListClosedWorkflowExecutionsCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos {
	return this.block.declare(AmazonSimpleWorkflowListClosedWorkflowExecutionsCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos
}

@Generated
class AmazonSimpleWorkflowListClosedWorkflowExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.ListClosedWorkflowExecutionsRequest, com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos> {

	var domain: String? = null
	var startTimeFilter: com.amazonaws.services.simpleworkflow.model.ExecutionTimeFilter? = null
	var closeTimeFilter: com.amazonaws.services.simpleworkflow.model.ExecutionTimeFilter? = null
	var executionFilter: com.amazonaws.services.simpleworkflow.model.WorkflowExecutionFilter? = null
	var closeStatusFilter: com.amazonaws.services.simpleworkflow.model.CloseStatusFilter? = null
	var typeFilter: com.amazonaws.services.simpleworkflow.model.WorkflowTypeFilter? = null
	var tagFilter: com.amazonaws.services.simpleworkflow.model.TagFilter? = null
	var nextPageToken: String? = null
	var maximumPageSize: Int? = 0
	var reverseOrder: Boolean? = false

	override fun build(): com.amazonaws.services.simpleworkflow.model.ListClosedWorkflowExecutionsRequest {
		val input = com.amazonaws.services.simpleworkflow.model.ListClosedWorkflowExecutionsRequest()
		input.setDomain(this.domain)
		input.setStartTimeFilter(this.startTimeFilter)
		input.setCloseTimeFilter(this.closeTimeFilter)
		input.setExecutionFilter(this.executionFilter)
		input.setCloseStatusFilter(this.closeStatusFilter)
		input.setTypeFilter(this.typeFilter)
		input.setTagFilter(this.tagFilter)
		input.setNextPageToken(this.nextPageToken)
		input.setMaximumPageSize(this.maximumPageSize)
		input.setReverseOrder(this.reverseOrder)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos {
	  return com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos {
		return environment.swf.listClosedWorkflowExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf list-closed-workflow-executions")
				.argument("domain", domain)
				.argument("start-time-filter", startTimeFilter?.toString())
				.argument("close-time-filter", closeTimeFilter?.toString())
				.argument("execution-filter", executionFilter?.toString())
				.argument("close-status-filter", closeStatusFilter?.toString())
				.argument("type-filter", typeFilter?.toString())
				.argument("tag-filter", tagFilter?.toString())
				.argument("next-page-token", nextPageToken)
				.argument("maximum-page-size", maximumPageSize?.toString())
				.option("reverse-order", reverseOrder ?: false)
	}

}


fun AmazonSimpleWorkflowFunctions.listDomains(init: AmazonSimpleWorkflowListDomainsCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.DomainInfos {
	return this.block.declare(AmazonSimpleWorkflowListDomainsCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.DomainInfos
}

@Generated
class AmazonSimpleWorkflowListDomainsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.ListDomainsRequest, com.amazonaws.services.simpleworkflow.model.DomainInfos> {

	var nextPageToken: String? = null
	var registrationStatus: RegistrationStatus? = null
	var maximumPageSize: Int? = 0
	var reverseOrder: Boolean? = false

	override fun build(): com.amazonaws.services.simpleworkflow.model.ListDomainsRequest {
		val input = com.amazonaws.services.simpleworkflow.model.ListDomainsRequest()
		input.setNextPageToken(this.nextPageToken)
		input.setRegistrationStatus(this.registrationStatus?.toString())
		input.setMaximumPageSize(this.maximumPageSize)
		input.setReverseOrder(this.reverseOrder)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.DomainInfos {
	  return com.amazonaws.services.simpleworkflow.model.DomainInfos()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.DomainInfos {
		return environment.swf.listDomains(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf list-domains")
				.argument("next-page-token", nextPageToken)
				.argument("registration-status", registrationStatus?.toString())
				.argument("maximum-page-size", maximumPageSize?.toString())
				.option("reverse-order", reverseOrder ?: false)
	}

}


fun AmazonSimpleWorkflowFunctions.listOpenWorkflowExecutions(init: AmazonSimpleWorkflowListOpenWorkflowExecutionsCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos {
	return this.block.declare(AmazonSimpleWorkflowListOpenWorkflowExecutionsCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos
}

@Generated
class AmazonSimpleWorkflowListOpenWorkflowExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.ListOpenWorkflowExecutionsRequest, com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos> {

	var domain: String? = null
	var startTimeFilter: com.amazonaws.services.simpleworkflow.model.ExecutionTimeFilter? = null
	var typeFilter: com.amazonaws.services.simpleworkflow.model.WorkflowTypeFilter? = null
	var tagFilter: com.amazonaws.services.simpleworkflow.model.TagFilter? = null
	var nextPageToken: String? = null
	var maximumPageSize: Int? = 0
	var reverseOrder: Boolean? = false
	var executionFilter: com.amazonaws.services.simpleworkflow.model.WorkflowExecutionFilter? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.ListOpenWorkflowExecutionsRequest {
		val input = com.amazonaws.services.simpleworkflow.model.ListOpenWorkflowExecutionsRequest()
		input.setDomain(this.domain)
		input.setStartTimeFilter(this.startTimeFilter)
		input.setTypeFilter(this.typeFilter)
		input.setTagFilter(this.tagFilter)
		input.setNextPageToken(this.nextPageToken)
		input.setMaximumPageSize(this.maximumPageSize)
		input.setReverseOrder(this.reverseOrder)
		input.setExecutionFilter(this.executionFilter)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos {
	  return com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfos {
		return environment.swf.listOpenWorkflowExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf list-open-workflow-executions")
				.argument("domain", domain)
				.argument("start-time-filter", startTimeFilter?.toString())
				.argument("type-filter", typeFilter?.toString())
				.argument("tag-filter", tagFilter?.toString())
				.argument("next-page-token", nextPageToken)
				.argument("maximum-page-size", maximumPageSize?.toString())
				.option("reverse-order", reverseOrder ?: false)
				.argument("execution-filter", executionFilter?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.listWorkflowTypes(init: AmazonSimpleWorkflowListWorkflowTypesCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.WorkflowTypeInfos {
	return this.block.declare(AmazonSimpleWorkflowListWorkflowTypesCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.WorkflowTypeInfos
}

@Generated
class AmazonSimpleWorkflowListWorkflowTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.ListWorkflowTypesRequest, com.amazonaws.services.simpleworkflow.model.WorkflowTypeInfos> {

	var domain: String? = null
	var name: String? = null
	var registrationStatus: RegistrationStatus? = null
	var nextPageToken: String? = null
	var maximumPageSize: Int? = 0
	var reverseOrder: Boolean? = false

	override fun build(): com.amazonaws.services.simpleworkflow.model.ListWorkflowTypesRequest {
		val input = com.amazonaws.services.simpleworkflow.model.ListWorkflowTypesRequest()
		input.setDomain(this.domain)
		input.setName(this.name)
		input.setRegistrationStatus(this.registrationStatus?.toString())
		input.setNextPageToken(this.nextPageToken)
		input.setMaximumPageSize(this.maximumPageSize)
		input.setReverseOrder(this.reverseOrder)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.WorkflowTypeInfos {
	  return com.amazonaws.services.simpleworkflow.model.WorkflowTypeInfos()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.WorkflowTypeInfos {
		return environment.swf.listWorkflowTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf list-workflow-types")
				.argument("domain", domain)
				.argument("name", name)
				.argument("registration-status", registrationStatus?.toString())
				.argument("next-page-token", nextPageToken)
				.argument("maximum-page-size", maximumPageSize?.toString())
				.option("reverse-order", reverseOrder ?: false)
	}

}


fun AmazonSimpleWorkflowFunctions.pollForActivityTask(init: AmazonSimpleWorkflowPollForActivityTaskCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.ActivityTask {
	return this.block.declare(AmazonSimpleWorkflowPollForActivityTaskCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.ActivityTask
}

@Generated
class AmazonSimpleWorkflowPollForActivityTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.PollForActivityTaskRequest, com.amazonaws.services.simpleworkflow.model.ActivityTask> {

	var domain: String? = null
	var taskList: com.amazonaws.services.simpleworkflow.model.TaskList? = null
	var identity: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.PollForActivityTaskRequest {
		val input = com.amazonaws.services.simpleworkflow.model.PollForActivityTaskRequest()
		input.setDomain(this.domain)
		input.setTaskList(this.taskList)
		input.setIdentity(this.identity)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.ActivityTask {
	  return com.amazonaws.services.simpleworkflow.model.ActivityTask()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.ActivityTask {
		return environment.swf.pollForActivityTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf poll-for-activity-task")
				.argument("domain", domain)
				.argument("task-list", taskList?.toString())
				.argument("identity", identity)
	}

}


fun AmazonSimpleWorkflowFunctions.pollForDecisionTask(init: AmazonSimpleWorkflowPollForDecisionTaskCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.DecisionTask {
	return this.block.declare(AmazonSimpleWorkflowPollForDecisionTaskCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.DecisionTask
}

@Generated
class AmazonSimpleWorkflowPollForDecisionTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.PollForDecisionTaskRequest, com.amazonaws.services.simpleworkflow.model.DecisionTask> {

	var domain: String? = null
	var taskList: com.amazonaws.services.simpleworkflow.model.TaskList? = null
	var identity: String? = null
	var nextPageToken: String? = null
	var maximumPageSize: Int? = 0
	var reverseOrder: Boolean? = false

	override fun build(): com.amazonaws.services.simpleworkflow.model.PollForDecisionTaskRequest {
		val input = com.amazonaws.services.simpleworkflow.model.PollForDecisionTaskRequest()
		input.setDomain(this.domain)
		input.setTaskList(this.taskList)
		input.setIdentity(this.identity)
		input.setNextPageToken(this.nextPageToken)
		input.setMaximumPageSize(this.maximumPageSize)
		input.setReverseOrder(this.reverseOrder)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.DecisionTask {
	  return com.amazonaws.services.simpleworkflow.model.DecisionTask()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.DecisionTask {
		return environment.swf.pollForDecisionTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf poll-for-decision-task")
				.argument("domain", domain)
				.argument("task-list", taskList?.toString())
				.argument("identity", identity)
				.argument("next-page-token", nextPageToken)
				.argument("maximum-page-size", maximumPageSize?.toString())
				.option("reverse-order", reverseOrder ?: false)
	}

}


fun AmazonSimpleWorkflowFunctions.recordActivityTaskHeartbeat(init: AmazonSimpleWorkflowRecordActivityTaskHeartbeatCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.ActivityTaskStatus {
	return this.block.declare(AmazonSimpleWorkflowRecordActivityTaskHeartbeatCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.ActivityTaskStatus
}

@Generated
class AmazonSimpleWorkflowRecordActivityTaskHeartbeatCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RecordActivityTaskHeartbeatRequest, com.amazonaws.services.simpleworkflow.model.ActivityTaskStatus> {

	var taskToken: String? = null
	var details: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.RecordActivityTaskHeartbeatRequest {
		val input = com.amazonaws.services.simpleworkflow.model.RecordActivityTaskHeartbeatRequest()
		input.setTaskToken(this.taskToken)
		input.setDetails(this.details)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.ActivityTaskStatus {
	  return com.amazonaws.services.simpleworkflow.model.ActivityTaskStatus()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.ActivityTaskStatus {
		return environment.swf.recordActivityTaskHeartbeat(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf record-activity-task-heartbeat")
				.argument("task-token", taskToken)
				.argument("details", details)
	}

}


fun AmazonSimpleWorkflowFunctions.registerActivityType(init: AmazonSimpleWorkflowRegisterActivityTypeCommand.() -> Unit): codingue.koops.core.VoidResult {
	return this.block.declare(AmazonSimpleWorkflowRegisterActivityTypeCommand().apply(init)) as codingue.koops.core.VoidResult
}

@Generated
class AmazonSimpleWorkflowRegisterActivityTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RegisterActivityTypeRequest, codingue.koops.core.VoidResult> {

	var domain: String? = null
	var name: String? = null
	var version: String? = null
	var description: String? = null
	var defaultTaskStartToCloseTimeout: String? = null
	var defaultTaskHeartbeatTimeout: String? = null
	var defaultTaskList: com.amazonaws.services.simpleworkflow.model.TaskList? = null
	var defaultTaskPriority: String? = null
	var defaultTaskScheduleToStartTimeout: String? = null
	var defaultTaskScheduleToCloseTimeout: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.RegisterActivityTypeRequest {
		val input = com.amazonaws.services.simpleworkflow.model.RegisterActivityTypeRequest()
		input.setDomain(this.domain)
		input.setName(this.name)
		input.setVersion(this.version)
		input.setDescription(this.description)
		input.setDefaultTaskStartToCloseTimeout(this.defaultTaskStartToCloseTimeout)
		input.setDefaultTaskHeartbeatTimeout(this.defaultTaskHeartbeatTimeout)
		input.setDefaultTaskList(this.defaultTaskList)
		input.setDefaultTaskPriority(this.defaultTaskPriority)
		input.setDefaultTaskScheduleToStartTimeout(this.defaultTaskScheduleToStartTimeout)
		input.setDefaultTaskScheduleToCloseTimeout(this.defaultTaskScheduleToCloseTimeout)
		return input
	}

	override fun dryResult(): codingue.koops.core.VoidResult {
	  return codingue.koops.core.VoidResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): codingue.koops.core.VoidResult {
		return environment.swf.registerActivityType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf register-activity-type")
				.argument("domain", domain)
				.argument("name", name)
				.argument("version", version)
				.argument("description", description)
				.argument("default-task-start-to-close-timeout", defaultTaskStartToCloseTimeout)
				.argument("default-task-heartbeat-timeout", defaultTaskHeartbeatTimeout)
				.argument("default-task-list", defaultTaskList?.toString())
				.argument("default-task-priority", defaultTaskPriority)
				.argument("default-task-schedule-to-start-timeout", defaultTaskScheduleToStartTimeout)
				.argument("default-task-schedule-to-close-timeout", defaultTaskScheduleToCloseTimeout)
	}

}


fun AmazonSimpleWorkflowFunctions.registerDomain(init: AmazonSimpleWorkflowRegisterDomainCommand.() -> Unit): codingue.koops.core.VoidResult {
	return this.block.declare(AmazonSimpleWorkflowRegisterDomainCommand().apply(init)) as codingue.koops.core.VoidResult
}

@Generated
class AmazonSimpleWorkflowRegisterDomainCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RegisterDomainRequest, codingue.koops.core.VoidResult> {

	var name: String? = null
	var description: String? = null
	var workflowExecutionRetentionPeriodInDays: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.RegisterDomainRequest {
		val input = com.amazonaws.services.simpleworkflow.model.RegisterDomainRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setWorkflowExecutionRetentionPeriodInDays(this.workflowExecutionRetentionPeriodInDays)
		return input
	}

	override fun dryResult(): codingue.koops.core.VoidResult {
	  return codingue.koops.core.VoidResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): codingue.koops.core.VoidResult {
		return environment.swf.registerDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf register-domain")
				.argument("name", name)
				.argument("description", description)
				.argument("workflow-execution-retention-period-in-days", workflowExecutionRetentionPeriodInDays)
	}

}


fun AmazonSimpleWorkflowFunctions.registerWorkflowType(init: AmazonSimpleWorkflowRegisterWorkflowTypeCommand.() -> Unit): codingue.koops.core.VoidResult {
	return this.block.declare(AmazonSimpleWorkflowRegisterWorkflowTypeCommand().apply(init)) as codingue.koops.core.VoidResult
}

@Generated
class AmazonSimpleWorkflowRegisterWorkflowTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RegisterWorkflowTypeRequest, codingue.koops.core.VoidResult> {

	var domain: String? = null
	var name: String? = null
	var version: String? = null
	var description: String? = null
	var defaultTaskStartToCloseTimeout: String? = null
	var defaultExecutionStartToCloseTimeout: String? = null
	var defaultTaskList: com.amazonaws.services.simpleworkflow.model.TaskList? = null
	var defaultTaskPriority: String? = null
	var defaultChildPolicy: ChildPolicy? = null
	var defaultLambdaRole: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.RegisterWorkflowTypeRequest {
		val input = com.amazonaws.services.simpleworkflow.model.RegisterWorkflowTypeRequest()
		input.setDomain(this.domain)
		input.setName(this.name)
		input.setVersion(this.version)
		input.setDescription(this.description)
		input.setDefaultTaskStartToCloseTimeout(this.defaultTaskStartToCloseTimeout)
		input.setDefaultExecutionStartToCloseTimeout(this.defaultExecutionStartToCloseTimeout)
		input.setDefaultTaskList(this.defaultTaskList)
		input.setDefaultTaskPriority(this.defaultTaskPriority)
		input.setDefaultChildPolicy(this.defaultChildPolicy?.toString())
		input.setDefaultLambdaRole(this.defaultLambdaRole)
		return input
	}

	override fun dryResult(): codingue.koops.core.VoidResult {
	  return codingue.koops.core.VoidResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): codingue.koops.core.VoidResult {
		return environment.swf.registerWorkflowType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf register-workflow-type")
				.argument("domain", domain)
				.argument("name", name)
				.argument("version", version)
				.argument("description", description)
				.argument("default-task-start-to-close-timeout", defaultTaskStartToCloseTimeout)
				.argument("default-execution-start-to-close-timeout", defaultExecutionStartToCloseTimeout)
				.argument("default-task-list", defaultTaskList?.toString())
				.argument("default-task-priority", defaultTaskPriority)
				.argument("default-child-policy", defaultChildPolicy?.toString())
				.argument("default-lambda-role", defaultLambdaRole)
	}

}


fun AmazonSimpleWorkflowFunctions.requestCancelWorkflowExecution(init: AmazonSimpleWorkflowRequestCancelWorkflowExecutionCommand.() -> Unit): codingue.koops.core.VoidResult {
	return this.block.declare(AmazonSimpleWorkflowRequestCancelWorkflowExecutionCommand().apply(init)) as codingue.koops.core.VoidResult
}

@Generated
class AmazonSimpleWorkflowRequestCancelWorkflowExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RequestCancelWorkflowExecutionRequest, codingue.koops.core.VoidResult> {

	var domain: String? = null
	var workflowId: String? = null
	var runId: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.RequestCancelWorkflowExecutionRequest {
		val input = com.amazonaws.services.simpleworkflow.model.RequestCancelWorkflowExecutionRequest()
		input.setDomain(this.domain)
		input.setWorkflowId(this.workflowId)
		input.setRunId(this.runId)
		return input
	}

	override fun dryResult(): codingue.koops.core.VoidResult {
	  return codingue.koops.core.VoidResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): codingue.koops.core.VoidResult {
		return environment.swf.requestCancelWorkflowExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf request-cancel-workflow-execution")
				.argument("domain", domain)
				.argument("workflow-id", workflowId)
				.argument("run-id", runId)
	}

}


fun AmazonSimpleWorkflowFunctions.respondActivityTaskCanceled(init: AmazonSimpleWorkflowRespondActivityTaskCanceledCommand.() -> Unit): codingue.koops.core.VoidResult {
	return this.block.declare(AmazonSimpleWorkflowRespondActivityTaskCanceledCommand().apply(init)) as codingue.koops.core.VoidResult
}

@Generated
class AmazonSimpleWorkflowRespondActivityTaskCanceledCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCanceledRequest, codingue.koops.core.VoidResult> {

	var taskToken: String? = null
	var details: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCanceledRequest {
		val input = com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCanceledRequest()
		input.setTaskToken(this.taskToken)
		input.setDetails(this.details)
		return input
	}

	override fun dryResult(): codingue.koops.core.VoidResult {
	  return codingue.koops.core.VoidResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): codingue.koops.core.VoidResult {
		return environment.swf.respondActivityTaskCanceled(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf respond-activity-task-canceled")
				.argument("task-token", taskToken)
				.argument("details", details)
	}

}


fun AmazonSimpleWorkflowFunctions.respondActivityTaskCompleted(init: AmazonSimpleWorkflowRespondActivityTaskCompletedCommand.() -> Unit): codingue.koops.core.VoidResult {
	return this.block.declare(AmazonSimpleWorkflowRespondActivityTaskCompletedCommand().apply(init)) as codingue.koops.core.VoidResult
}

@Generated
class AmazonSimpleWorkflowRespondActivityTaskCompletedCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCompletedRequest, codingue.koops.core.VoidResult> {

	var taskToken: String? = null
	var result: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCompletedRequest {
		val input = com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCompletedRequest()
		input.setTaskToken(this.taskToken)
		input.setResult(this.result)
		return input
	}

	override fun dryResult(): codingue.koops.core.VoidResult {
	  return codingue.koops.core.VoidResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): codingue.koops.core.VoidResult {
		return environment.swf.respondActivityTaskCompleted(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf respond-activity-task-completed")
				.argument("task-token", taskToken)
				.argument("result", result)
	}

}


fun AmazonSimpleWorkflowFunctions.respondActivityTaskFailed(init: AmazonSimpleWorkflowRespondActivityTaskFailedCommand.() -> Unit): codingue.koops.core.VoidResult {
	return this.block.declare(AmazonSimpleWorkflowRespondActivityTaskFailedCommand().apply(init)) as codingue.koops.core.VoidResult
}

@Generated
class AmazonSimpleWorkflowRespondActivityTaskFailedCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RespondActivityTaskFailedRequest, codingue.koops.core.VoidResult> {

	var taskToken: String? = null
	var reason: String? = null
	var details: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.RespondActivityTaskFailedRequest {
		val input = com.amazonaws.services.simpleworkflow.model.RespondActivityTaskFailedRequest()
		input.setTaskToken(this.taskToken)
		input.setReason(this.reason)
		input.setDetails(this.details)
		return input
	}

	override fun dryResult(): codingue.koops.core.VoidResult {
	  return codingue.koops.core.VoidResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): codingue.koops.core.VoidResult {
		return environment.swf.respondActivityTaskFailed(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf respond-activity-task-failed")
				.argument("task-token", taskToken)
				.argument("reason", reason)
				.argument("details", details)
	}

}


fun AmazonSimpleWorkflowFunctions.respondDecisionTaskCompleted(init: AmazonSimpleWorkflowRespondDecisionTaskCompletedCommand.() -> Unit): codingue.koops.core.VoidResult {
	return this.block.declare(AmazonSimpleWorkflowRespondDecisionTaskCompletedCommand().apply(init)) as codingue.koops.core.VoidResult
}

@Generated
class AmazonSimpleWorkflowRespondDecisionTaskCompletedCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RespondDecisionTaskCompletedRequest, codingue.koops.core.VoidResult> {

	var taskToken: String? = null
	var decisions: List<com.amazonaws.services.simpleworkflow.model.Decision>? = null
	var executionContext: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.RespondDecisionTaskCompletedRequest {
		val input = com.amazonaws.services.simpleworkflow.model.RespondDecisionTaskCompletedRequest()
		input.setTaskToken(this.taskToken)
		input.setDecisions(this.decisions)
		input.setExecutionContext(this.executionContext)
		return input
	}

	override fun dryResult(): codingue.koops.core.VoidResult {
	  return codingue.koops.core.VoidResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): codingue.koops.core.VoidResult {
		return environment.swf.respondDecisionTaskCompleted(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf respond-decision-task-completed")
				.argument("task-token", taskToken)
				.argument("decisions", decisions?.toString())
				.argument("execution-context", executionContext)
	}

}


fun AmazonSimpleWorkflowFunctions.signalWorkflowExecution(init: AmazonSimpleWorkflowSignalWorkflowExecutionCommand.() -> Unit): codingue.koops.core.VoidResult {
	return this.block.declare(AmazonSimpleWorkflowSignalWorkflowExecutionCommand().apply(init)) as codingue.koops.core.VoidResult
}

@Generated
class AmazonSimpleWorkflowSignalWorkflowExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.SignalWorkflowExecutionRequest, codingue.koops.core.VoidResult> {

	var domain: String? = null
	var workflowId: String? = null
	var runId: String? = null
	var signalName: String? = null
	var input: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.SignalWorkflowExecutionRequest {
		val input = com.amazonaws.services.simpleworkflow.model.SignalWorkflowExecutionRequest()
		input.setDomain(this.domain)
		input.setWorkflowId(this.workflowId)
		input.setRunId(this.runId)
		input.setSignalName(this.signalName)
		input.setInput(this.input)
		return input
	}

	override fun dryResult(): codingue.koops.core.VoidResult {
	  return codingue.koops.core.VoidResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): codingue.koops.core.VoidResult {
		return environment.swf.signalWorkflowExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf signal-workflow-execution")
				.argument("domain", domain)
				.argument("workflow-id", workflowId)
				.argument("run-id", runId)
				.argument("signal-name", signalName)
				.argument("input", input)
	}

}


fun AmazonSimpleWorkflowFunctions.startWorkflowExecution(init: AmazonSimpleWorkflowStartWorkflowExecutionCommand.() -> Unit): com.amazonaws.services.simpleworkflow.model.Run {
	return this.block.declare(AmazonSimpleWorkflowStartWorkflowExecutionCommand().apply(init)) as com.amazonaws.services.simpleworkflow.model.Run
}

@Generated
class AmazonSimpleWorkflowStartWorkflowExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.StartWorkflowExecutionRequest, com.amazonaws.services.simpleworkflow.model.Run> {

	var domain: String? = null
	var workflowId: String? = null
	var workflowType: com.amazonaws.services.simpleworkflow.model.WorkflowType? = null
	var taskList: com.amazonaws.services.simpleworkflow.model.TaskList? = null
	var taskPriority: String? = null
	var input: String? = null
	var executionStartToCloseTimeout: String? = null
	var tagList: List<String>? = null
	var taskStartToCloseTimeout: String? = null
	var childPolicy: ChildPolicy? = null
	var lambdaRole: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.StartWorkflowExecutionRequest {
		val input = com.amazonaws.services.simpleworkflow.model.StartWorkflowExecutionRequest()
		input.setDomain(this.domain)
		input.setWorkflowId(this.workflowId)
		input.setWorkflowType(this.workflowType)
		input.setTaskList(this.taskList)
		input.setTaskPriority(this.taskPriority)
		input.setInput(this.input)
		input.setExecutionStartToCloseTimeout(this.executionStartToCloseTimeout)
		input.setTagList(this.tagList)
		input.setTaskStartToCloseTimeout(this.taskStartToCloseTimeout)
		input.setChildPolicy(this.childPolicy?.toString())
		input.setLambdaRole(this.lambdaRole)
		return input
	}

	override fun dryResult(): com.amazonaws.services.simpleworkflow.model.Run {
	  return com.amazonaws.services.simpleworkflow.model.Run()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleworkflow.model.Run {
		return environment.swf.startWorkflowExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf start-workflow-execution")
				.argument("domain", domain)
				.argument("workflow-id", workflowId)
				.argument("workflow-type", workflowType?.toString())
				.argument("task-list", taskList?.toString())
				.argument("task-priority", taskPriority)
				.argument("input", input)
				.argument("execution-start-to-close-timeout", executionStartToCloseTimeout)
				.argument("tag-list", tagList?.toString())
				.argument("task-start-to-close-timeout", taskStartToCloseTimeout)
				.argument("child-policy", childPolicy?.toString())
				.argument("lambda-role", lambdaRole)
	}

}


fun AmazonSimpleWorkflowFunctions.terminateWorkflowExecution(init: AmazonSimpleWorkflowTerminateWorkflowExecutionCommand.() -> Unit): codingue.koops.core.VoidResult {
	return this.block.declare(AmazonSimpleWorkflowTerminateWorkflowExecutionCommand().apply(init)) as codingue.koops.core.VoidResult
}

@Generated
class AmazonSimpleWorkflowTerminateWorkflowExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.TerminateWorkflowExecutionRequest, codingue.koops.core.VoidResult> {

	var domain: String? = null
	var workflowId: String? = null
	var runId: String? = null
	var reason: String? = null
	var details: String? = null
	var childPolicy: ChildPolicy? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.TerminateWorkflowExecutionRequest {
		val input = com.amazonaws.services.simpleworkflow.model.TerminateWorkflowExecutionRequest()
		input.setDomain(this.domain)
		input.setWorkflowId(this.workflowId)
		input.setRunId(this.runId)
		input.setReason(this.reason)
		input.setDetails(this.details)
		input.setChildPolicy(this.childPolicy?.toString())
		return input
	}

	override fun dryResult(): codingue.koops.core.VoidResult {
	  return codingue.koops.core.VoidResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): codingue.koops.core.VoidResult {
		return environment.swf.terminateWorkflowExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf terminate-workflow-execution")
				.argument("domain", domain)
				.argument("workflow-id", workflowId)
				.argument("run-id", runId)
				.argument("reason", reason)
				.argument("details", details)
				.argument("child-policy", childPolicy?.toString())
	}

}
