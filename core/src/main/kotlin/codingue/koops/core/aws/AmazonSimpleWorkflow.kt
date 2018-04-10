
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

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

infix fun AwsContinuation.swf(init: AmazonSimpleWorkflowFunctions.() -> Unit) {
	AmazonSimpleWorkflowFunctions(shell).apply(init)
}

			

fun AmazonSimpleWorkflowFunctions.countClosedWorkflowExecutions(init: AmazonSimpleWorkflowCountClosedWorkflowExecutionsCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowCountClosedWorkflowExecutionsCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowCountClosedWorkflowExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.CountClosedWorkflowExecutionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.countClosedWorkflowExecutions(build())
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


fun AmazonSimpleWorkflowFunctions.countOpenWorkflowExecutions(init: AmazonSimpleWorkflowCountOpenWorkflowExecutionsCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowCountOpenWorkflowExecutionsCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowCountOpenWorkflowExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.CountOpenWorkflowExecutionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.countOpenWorkflowExecutions(build())
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


fun AmazonSimpleWorkflowFunctions.countPendingActivityTasks(init: AmazonSimpleWorkflowCountPendingActivityTasksCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowCountPendingActivityTasksCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowCountPendingActivityTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.CountPendingActivityTasksRequest> {

	var domain: String? = null
	var taskList: com.amazonaws.services.simpleworkflow.model.TaskList? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.CountPendingActivityTasksRequest {
		val input = com.amazonaws.services.simpleworkflow.model.CountPendingActivityTasksRequest()
		input.setDomain(this.domain)
		input.setTaskList(this.taskList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.countPendingActivityTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf count-pending-activity-tasks")
				.argument("domain", domain)
				.argument("task-list", taskList?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.countPendingDecisionTasks(init: AmazonSimpleWorkflowCountPendingDecisionTasksCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowCountPendingDecisionTasksCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowCountPendingDecisionTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.CountPendingDecisionTasksRequest> {

	var domain: String? = null
	var taskList: com.amazonaws.services.simpleworkflow.model.TaskList? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.CountPendingDecisionTasksRequest {
		val input = com.amazonaws.services.simpleworkflow.model.CountPendingDecisionTasksRequest()
		input.setDomain(this.domain)
		input.setTaskList(this.taskList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.countPendingDecisionTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf count-pending-decision-tasks")
				.argument("domain", domain)
				.argument("task-list", taskList?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.deprecateActivityType(init: AmazonSimpleWorkflowDeprecateActivityTypeCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowDeprecateActivityTypeCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowDeprecateActivityTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.DeprecateActivityTypeRequest> {

	var domain: String? = null
	var activityType: com.amazonaws.services.simpleworkflow.model.ActivityType? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.DeprecateActivityTypeRequest {
		val input = com.amazonaws.services.simpleworkflow.model.DeprecateActivityTypeRequest()
		input.setDomain(this.domain)
		input.setActivityType(this.activityType)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.deprecateActivityType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf deprecate-activity-type")
				.argument("domain", domain)
				.argument("activity-type", activityType?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.deprecateDomain(init: AmazonSimpleWorkflowDeprecateDomainCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowDeprecateDomainCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowDeprecateDomainCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.DeprecateDomainRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.DeprecateDomainRequest {
		val input = com.amazonaws.services.simpleworkflow.model.DeprecateDomainRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.deprecateDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf deprecate-domain")
				.argument("name", name)
	}

}


fun AmazonSimpleWorkflowFunctions.deprecateWorkflowType(init: AmazonSimpleWorkflowDeprecateWorkflowTypeCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowDeprecateWorkflowTypeCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowDeprecateWorkflowTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.DeprecateWorkflowTypeRequest> {

	var domain: String? = null
	var workflowType: com.amazonaws.services.simpleworkflow.model.WorkflowType? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.DeprecateWorkflowTypeRequest {
		val input = com.amazonaws.services.simpleworkflow.model.DeprecateWorkflowTypeRequest()
		input.setDomain(this.domain)
		input.setWorkflowType(this.workflowType)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.deprecateWorkflowType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf deprecate-workflow-type")
				.argument("domain", domain)
				.argument("workflow-type", workflowType?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.describeActivityType(init: AmazonSimpleWorkflowDescribeActivityTypeCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowDescribeActivityTypeCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowDescribeActivityTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.DescribeActivityTypeRequest> {

	var domain: String? = null
	var activityType: com.amazonaws.services.simpleworkflow.model.ActivityType? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.DescribeActivityTypeRequest {
		val input = com.amazonaws.services.simpleworkflow.model.DescribeActivityTypeRequest()
		input.setDomain(this.domain)
		input.setActivityType(this.activityType)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.describeActivityType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf describe-activity-type")
				.argument("domain", domain)
				.argument("activity-type", activityType?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.describeDomain(init: AmazonSimpleWorkflowDescribeDomainCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowDescribeDomainCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowDescribeDomainCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.DescribeDomainRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.DescribeDomainRequest {
		val input = com.amazonaws.services.simpleworkflow.model.DescribeDomainRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.describeDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf describe-domain")
				.argument("name", name)
	}

}


fun AmazonSimpleWorkflowFunctions.describeWorkflowExecution(init: AmazonSimpleWorkflowDescribeWorkflowExecutionCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowDescribeWorkflowExecutionCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowDescribeWorkflowExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.DescribeWorkflowExecutionRequest> {

	var domain: String? = null
	var execution: com.amazonaws.services.simpleworkflow.model.WorkflowExecution? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.DescribeWorkflowExecutionRequest {
		val input = com.amazonaws.services.simpleworkflow.model.DescribeWorkflowExecutionRequest()
		input.setDomain(this.domain)
		input.setExecution(this.execution)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.describeWorkflowExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf describe-workflow-execution")
				.argument("domain", domain)
				.argument("execution", execution?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.describeWorkflowType(init: AmazonSimpleWorkflowDescribeWorkflowTypeCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowDescribeWorkflowTypeCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowDescribeWorkflowTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.DescribeWorkflowTypeRequest> {

	var domain: String? = null
	var workflowType: com.amazonaws.services.simpleworkflow.model.WorkflowType? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.DescribeWorkflowTypeRequest {
		val input = com.amazonaws.services.simpleworkflow.model.DescribeWorkflowTypeRequest()
		input.setDomain(this.domain)
		input.setWorkflowType(this.workflowType)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.describeWorkflowType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf describe-workflow-type")
				.argument("domain", domain)
				.argument("workflow-type", workflowType?.toString())
	}

}


fun AmazonSimpleWorkflowFunctions.getWorkflowExecutionHistory(init: AmazonSimpleWorkflowGetWorkflowExecutionHistoryCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowGetWorkflowExecutionHistoryCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowGetWorkflowExecutionHistoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.GetWorkflowExecutionHistoryRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.getWorkflowExecutionHistory(build())
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


fun AmazonSimpleWorkflowFunctions.listActivityTypes(init: AmazonSimpleWorkflowListActivityTypesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowListActivityTypesCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowListActivityTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.ListActivityTypesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.listActivityTypes(build())
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


fun AmazonSimpleWorkflowFunctions.listClosedWorkflowExecutions(init: AmazonSimpleWorkflowListClosedWorkflowExecutionsCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowListClosedWorkflowExecutionsCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowListClosedWorkflowExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.ListClosedWorkflowExecutionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.listClosedWorkflowExecutions(build())
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


fun AmazonSimpleWorkflowFunctions.listDomains(init: AmazonSimpleWorkflowListDomainsCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowListDomainsCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowListDomainsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.ListDomainsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.listDomains(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf list-domains")
				.argument("next-page-token", nextPageToken)
				.argument("registration-status", registrationStatus?.toString())
				.argument("maximum-page-size", maximumPageSize?.toString())
				.option("reverse-order", reverseOrder ?: false)
	}

}


fun AmazonSimpleWorkflowFunctions.listOpenWorkflowExecutions(init: AmazonSimpleWorkflowListOpenWorkflowExecutionsCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowListOpenWorkflowExecutionsCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowListOpenWorkflowExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.ListOpenWorkflowExecutionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.listOpenWorkflowExecutions(build())
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


fun AmazonSimpleWorkflowFunctions.listWorkflowTypes(init: AmazonSimpleWorkflowListWorkflowTypesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowListWorkflowTypesCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowListWorkflowTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.ListWorkflowTypesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.listWorkflowTypes(build())
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


fun AmazonSimpleWorkflowFunctions.pollForActivityTask(init: AmazonSimpleWorkflowPollForActivityTaskCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowPollForActivityTaskCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowPollForActivityTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.PollForActivityTaskRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.pollForActivityTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf poll-for-activity-task")
				.argument("domain", domain)
				.argument("task-list", taskList?.toString())
				.argument("identity", identity)
	}

}


fun AmazonSimpleWorkflowFunctions.pollForDecisionTask(init: AmazonSimpleWorkflowPollForDecisionTaskCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowPollForDecisionTaskCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowPollForDecisionTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.PollForDecisionTaskRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.pollForDecisionTask(build())
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


fun AmazonSimpleWorkflowFunctions.recordActivityTaskHeartbeat(init: AmazonSimpleWorkflowRecordActivityTaskHeartbeatCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowRecordActivityTaskHeartbeatCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowRecordActivityTaskHeartbeatCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RecordActivityTaskHeartbeatRequest> {

	var taskToken: String? = null
	var details: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.RecordActivityTaskHeartbeatRequest {
		val input = com.amazonaws.services.simpleworkflow.model.RecordActivityTaskHeartbeatRequest()
		input.setTaskToken(this.taskToken)
		input.setDetails(this.details)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.recordActivityTaskHeartbeat(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf record-activity-task-heartbeat")
				.argument("task-token", taskToken)
				.argument("details", details)
	}

}


fun AmazonSimpleWorkflowFunctions.registerActivityType(init: AmazonSimpleWorkflowRegisterActivityTypeCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowRegisterActivityTypeCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowRegisterActivityTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RegisterActivityTypeRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.registerActivityType(build())
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


fun AmazonSimpleWorkflowFunctions.registerDomain(init: AmazonSimpleWorkflowRegisterDomainCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowRegisterDomainCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowRegisterDomainCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RegisterDomainRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.registerDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf register-domain")
				.argument("name", name)
				.argument("description", description)
				.argument("workflow-execution-retention-period-in-days", workflowExecutionRetentionPeriodInDays)
	}

}


fun AmazonSimpleWorkflowFunctions.registerWorkflowType(init: AmazonSimpleWorkflowRegisterWorkflowTypeCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowRegisterWorkflowTypeCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowRegisterWorkflowTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RegisterWorkflowTypeRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.registerWorkflowType(build())
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


fun AmazonSimpleWorkflowFunctions.requestCancelWorkflowExecution(init: AmazonSimpleWorkflowRequestCancelWorkflowExecutionCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowRequestCancelWorkflowExecutionCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowRequestCancelWorkflowExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RequestCancelWorkflowExecutionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.requestCancelWorkflowExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf request-cancel-workflow-execution")
				.argument("domain", domain)
				.argument("workflow-id", workflowId)
				.argument("run-id", runId)
	}

}


fun AmazonSimpleWorkflowFunctions.respondActivityTaskCanceled(init: AmazonSimpleWorkflowRespondActivityTaskCanceledCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowRespondActivityTaskCanceledCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowRespondActivityTaskCanceledCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCanceledRequest> {

	var taskToken: String? = null
	var details: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCanceledRequest {
		val input = com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCanceledRequest()
		input.setTaskToken(this.taskToken)
		input.setDetails(this.details)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.respondActivityTaskCanceled(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf respond-activity-task-canceled")
				.argument("task-token", taskToken)
				.argument("details", details)
	}

}


fun AmazonSimpleWorkflowFunctions.respondActivityTaskCompleted(init: AmazonSimpleWorkflowRespondActivityTaskCompletedCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowRespondActivityTaskCompletedCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowRespondActivityTaskCompletedCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCompletedRequest> {

	var taskToken: String? = null
	var result: String? = null

	override fun build(): com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCompletedRequest {
		val input = com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCompletedRequest()
		input.setTaskToken(this.taskToken)
		input.setResult(this.result)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.respondActivityTaskCompleted(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf respond-activity-task-completed")
				.argument("task-token", taskToken)
				.argument("result", result)
	}

}


fun AmazonSimpleWorkflowFunctions.respondActivityTaskFailed(init: AmazonSimpleWorkflowRespondActivityTaskFailedCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowRespondActivityTaskFailedCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowRespondActivityTaskFailedCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RespondActivityTaskFailedRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.respondActivityTaskFailed(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf respond-activity-task-failed")
				.argument("task-token", taskToken)
				.argument("reason", reason)
				.argument("details", details)
	}

}


fun AmazonSimpleWorkflowFunctions.respondDecisionTaskCompleted(init: AmazonSimpleWorkflowRespondDecisionTaskCompletedCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowRespondDecisionTaskCompletedCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowRespondDecisionTaskCompletedCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.RespondDecisionTaskCompletedRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.respondDecisionTaskCompleted(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws swf respond-decision-task-completed")
				.argument("task-token", taskToken)
				.argument("decisions", decisions?.toString())
				.argument("execution-context", executionContext)
	}

}


fun AmazonSimpleWorkflowFunctions.signalWorkflowExecution(init: AmazonSimpleWorkflowSignalWorkflowExecutionCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowSignalWorkflowExecutionCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowSignalWorkflowExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.SignalWorkflowExecutionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.signalWorkflowExecution(build())
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


fun AmazonSimpleWorkflowFunctions.startWorkflowExecution(init: AmazonSimpleWorkflowStartWorkflowExecutionCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowStartWorkflowExecutionCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowStartWorkflowExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.StartWorkflowExecutionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.startWorkflowExecution(build())
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


fun AmazonSimpleWorkflowFunctions.terminateWorkflowExecution(init: AmazonSimpleWorkflowTerminateWorkflowExecutionCommand.() -> Unit) {
	this.block.declare(AmazonSimpleWorkflowTerminateWorkflowExecutionCommand().apply(init))
}

@Generated
class AmazonSimpleWorkflowTerminateWorkflowExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleworkflow.model.TerminateWorkflowExecutionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.swf.terminateWorkflowExecution(build())
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
