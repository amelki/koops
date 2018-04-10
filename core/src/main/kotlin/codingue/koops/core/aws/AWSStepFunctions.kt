
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.stepfunctions.AWSStepFunctions
import com.amazonaws.services.stepfunctions.model.*

var codingue.koops.core.Environment.states: AWSStepFunctions
	get() = this.capabilities[AWSStepFunctions::class.java.name] as AWSStepFunctions
	set(states) {
		this.capabilities[AWSStepFunctions::class.java.name] = states
	}

@Generated
class AWSStepFunctionsFunctions(val block: Block)

infix fun AwsContinuation.states(init: AWSStepFunctionsFunctions.() -> Unit) {
	AWSStepFunctionsFunctions(shell).apply(init)
}

			

fun AWSStepFunctionsFunctions.createActivity(init: AWSStepFunctionsCreateActivityCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsCreateActivityCommand().apply(init))
}

@Generated
class AWSStepFunctionsCreateActivityCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.CreateActivityRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.CreateActivityRequest {
		val input = com.amazonaws.services.stepfunctions.model.CreateActivityRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.createActivity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states create-activity")
				.argument("name", name)
	}

}


fun AWSStepFunctionsFunctions.createStateMachine(init: AWSStepFunctionsCreateStateMachineCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsCreateStateMachineCommand().apply(init))
}

@Generated
class AWSStepFunctionsCreateStateMachineCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest> {

	var name: String? = null
	var definition: String? = null
	var roleArn: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest {
		val input = com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest()
		input.setName(this.name)
		input.setDefinition(this.definition)
		input.setRoleArn(this.roleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.createStateMachine(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states create-state-machine")
				.argument("name", name)
				.argument("definition", definition)
				.argument("role-arn", roleArn)
	}

}


fun AWSStepFunctionsFunctions.deleteActivity(init: AWSStepFunctionsDeleteActivityCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsDeleteActivityCommand().apply(init))
}

@Generated
class AWSStepFunctionsDeleteActivityCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.DeleteActivityRequest> {

	var activityArn: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.DeleteActivityRequest {
		val input = com.amazonaws.services.stepfunctions.model.DeleteActivityRequest()
		input.setActivityArn(this.activityArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.deleteActivity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states delete-activity")
				.argument("activity-arn", activityArn)
	}

}


fun AWSStepFunctionsFunctions.deleteStateMachine(init: AWSStepFunctionsDeleteStateMachineCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsDeleteStateMachineCommand().apply(init))
}

@Generated
class AWSStepFunctionsDeleteStateMachineCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest> {

	var stateMachineArn: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest {
		val input = com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest()
		input.setStateMachineArn(this.stateMachineArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.deleteStateMachine(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states delete-state-machine")
				.argument("state-machine-arn", stateMachineArn)
	}

}


fun AWSStepFunctionsFunctions.describeActivity(init: AWSStepFunctionsDescribeActivityCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsDescribeActivityCommand().apply(init))
}

@Generated
class AWSStepFunctionsDescribeActivityCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.DescribeActivityRequest> {

	var activityArn: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.DescribeActivityRequest {
		val input = com.amazonaws.services.stepfunctions.model.DescribeActivityRequest()
		input.setActivityArn(this.activityArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.describeActivity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states describe-activity")
				.argument("activity-arn", activityArn)
	}

}


fun AWSStepFunctionsFunctions.describeExecution(init: AWSStepFunctionsDescribeExecutionCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsDescribeExecutionCommand().apply(init))
}

@Generated
class AWSStepFunctionsDescribeExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest> {

	var executionArn: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest {
		val input = com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest()
		input.setExecutionArn(this.executionArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.describeExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states describe-execution")
				.argument("execution-arn", executionArn)
	}

}


fun AWSStepFunctionsFunctions.describeStateMachine(init: AWSStepFunctionsDescribeStateMachineCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsDescribeStateMachineCommand().apply(init))
}

@Generated
class AWSStepFunctionsDescribeStateMachineCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest> {

	var stateMachineArn: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest {
		val input = com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest()
		input.setStateMachineArn(this.stateMachineArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.describeStateMachine(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states describe-state-machine")
				.argument("state-machine-arn", stateMachineArn)
	}

}


fun AWSStepFunctionsFunctions.describeStateMachineForExecution(init: AWSStepFunctionsDescribeStateMachineForExecutionCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsDescribeStateMachineForExecutionCommand().apply(init))
}

@Generated
class AWSStepFunctionsDescribeStateMachineForExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest> {

	var executionArn: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest {
		val input = com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest()
		input.setExecutionArn(this.executionArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.describeStateMachineForExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states describe-state-machine-for-execution")
				.argument("execution-arn", executionArn)
	}

}


fun AWSStepFunctionsFunctions.getActivityTask(init: AWSStepFunctionsGetActivityTaskCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsGetActivityTaskCommand().apply(init))
}

@Generated
class AWSStepFunctionsGetActivityTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest> {

	var activityArn: String? = null
	var workerName: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest {
		val input = com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest()
		input.setActivityArn(this.activityArn)
		input.setWorkerName(this.workerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.getActivityTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states get-activity-task")
				.argument("activity-arn", activityArn)
				.argument("worker-name", workerName)
	}

}


fun AWSStepFunctionsFunctions.getExecutionHistory(init: AWSStepFunctionsGetExecutionHistoryCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsGetExecutionHistoryCommand().apply(init))
}

@Generated
class AWSStepFunctionsGetExecutionHistoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest> {

	var executionArn: String? = null
	var maxResults: Int? = 0
	var reverseOrder: Boolean? = false
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest {
		val input = com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest()
		input.setExecutionArn(this.executionArn)
		input.setMaxResults(this.maxResults)
		input.setReverseOrder(this.reverseOrder)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.getExecutionHistory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states get-execution-history")
				.argument("execution-arn", executionArn)
				.argument("max-results", maxResults?.toString())
				.option("reverse-order", reverseOrder ?: false)
				.argument("next-token", nextToken)
	}

}


fun AWSStepFunctionsFunctions.listActivities(init: AWSStepFunctionsListActivitiesCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsListActivitiesCommand().apply(init))
}

@Generated
class AWSStepFunctionsListActivitiesCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.ListActivitiesRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.ListActivitiesRequest {
		val input = com.amazonaws.services.stepfunctions.model.ListActivitiesRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.listActivities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states list-activities")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSStepFunctionsFunctions.listExecutions(init: AWSStepFunctionsListExecutionsCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsListExecutionsCommand().apply(init))
}

@Generated
class AWSStepFunctionsListExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.ListExecutionsRequest> {

	var stateMachineArn: String? = null
	var statusFilter: ExecutionStatus? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.ListExecutionsRequest {
		val input = com.amazonaws.services.stepfunctions.model.ListExecutionsRequest()
		input.setStateMachineArn(this.stateMachineArn)
		input.setStatusFilter(this.statusFilter?.toString())
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.listExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states list-executions")
				.argument("state-machine-arn", stateMachineArn)
				.argument("status-filter", statusFilter?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSStepFunctionsFunctions.listStateMachines(init: AWSStepFunctionsListStateMachinesCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsListStateMachinesCommand().apply(init))
}

@Generated
class AWSStepFunctionsListStateMachinesCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest {
		val input = com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.listStateMachines(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states list-state-machines")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSStepFunctionsFunctions.sendTaskFailure(init: AWSStepFunctionsSendTaskFailureCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsSendTaskFailureCommand().apply(init))
}

@Generated
class AWSStepFunctionsSendTaskFailureCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest> {

	var taskToken: String? = null
	var error: String? = null
	var cause: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest {
		val input = com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest()
		input.setTaskToken(this.taskToken)
		input.setError(this.error)
		input.setCause(this.cause)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.sendTaskFailure(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states send-task-failure")
				.argument("task-token", taskToken)
				.argument("error", error)
				.argument("cause", cause)
	}

}


fun AWSStepFunctionsFunctions.sendTaskHeartbeat(init: AWSStepFunctionsSendTaskHeartbeatCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsSendTaskHeartbeatCommand().apply(init))
}

@Generated
class AWSStepFunctionsSendTaskHeartbeatCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest> {

	var taskToken: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest {
		val input = com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest()
		input.setTaskToken(this.taskToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.sendTaskHeartbeat(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states send-task-heartbeat")
				.argument("task-token", taskToken)
	}

}


fun AWSStepFunctionsFunctions.sendTaskSuccess(init: AWSStepFunctionsSendTaskSuccessCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsSendTaskSuccessCommand().apply(init))
}

@Generated
class AWSStepFunctionsSendTaskSuccessCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest> {

	var taskToken: String? = null
	var output: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest {
		val input = com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest()
		input.setTaskToken(this.taskToken)
		input.setOutput(this.output)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.sendTaskSuccess(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states send-task-success")
				.argument("task-token", taskToken)
				.argument("output", output)
	}

}


fun AWSStepFunctionsFunctions.startExecution(init: AWSStepFunctionsStartExecutionCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsStartExecutionCommand().apply(init))
}

@Generated
class AWSStepFunctionsStartExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.StartExecutionRequest> {

	var stateMachineArn: String? = null
	var name: String? = null
	var input: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.StartExecutionRequest {
		val input = com.amazonaws.services.stepfunctions.model.StartExecutionRequest()
		input.setStateMachineArn(this.stateMachineArn)
		input.setName(this.name)
		input.setInput(this.input)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.startExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states start-execution")
				.argument("state-machine-arn", stateMachineArn)
				.argument("name", name)
				.argument("input", input)
	}

}


fun AWSStepFunctionsFunctions.stopExecution(init: AWSStepFunctionsStopExecutionCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsStopExecutionCommand().apply(init))
}

@Generated
class AWSStepFunctionsStopExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.StopExecutionRequest> {

	var executionArn: String? = null
	var error: String? = null
	var cause: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.StopExecutionRequest {
		val input = com.amazonaws.services.stepfunctions.model.StopExecutionRequest()
		input.setExecutionArn(this.executionArn)
		input.setError(this.error)
		input.setCause(this.cause)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.stopExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states stop-execution")
				.argument("execution-arn", executionArn)
				.argument("error", error)
				.argument("cause", cause)
	}

}


fun AWSStepFunctionsFunctions.updateStateMachine(init: AWSStepFunctionsUpdateStateMachineCommand.() -> Unit) {
	this.block.declare(AWSStepFunctionsUpdateStateMachineCommand().apply(init))
}

@Generated
class AWSStepFunctionsUpdateStateMachineCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest> {

	var stateMachineArn: String? = null
	var definition: String? = null
	var roleArn: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest {
		val input = com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest()
		input.setStateMachineArn(this.stateMachineArn)
		input.setDefinition(this.definition)
		input.setRoleArn(this.roleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.states.updateStateMachine(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states update-state-machine")
				.argument("state-machine-arn", stateMachineArn)
				.argument("definition", definition)
				.argument("role-arn", roleArn)
	}

}
