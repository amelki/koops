
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.states

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.stepfunctions.*
import com.amazonaws.services.stepfunctions.model.*

var codingue.koops.core.Environment.states: AWSStepFunctions
	get() {
		var service = this.capabilities["aws-states"]
		if (service == null) {
			service = AWSStepFunctionsClientBuilder.standard().build()
			this.capabilities["aws-states"] = service
		}
		return service as AWSStepFunctions
	}
	set(states) {
		this.capabilities["aws-states"] = states
	}

@Generated
class AWSStepFunctionsFunctions(val block: Block)

infix fun <T> AwsContinuation.states(init: AWSStepFunctionsFunctions.() -> T): T {
	return AWSStepFunctionsFunctions(shell).run(init)
}

			

fun AWSStepFunctionsFunctions.createActivity(init: AWSStepFunctionsCreateActivityCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.CreateActivityResult {
	return this.block.declare(AWSStepFunctionsCreateActivityCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.CreateActivityResult
}

@Generated
class AWSStepFunctionsCreateActivityCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.CreateActivityRequest, com.amazonaws.services.stepfunctions.model.CreateActivityResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.CreateActivityRequest {
		val input = com.amazonaws.services.stepfunctions.model.CreateActivityRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.CreateActivityResult {
	  return com.amazonaws.services.stepfunctions.model.CreateActivityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.CreateActivityResult {
		return environment.states.createActivity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states create-activity")
				.argument("name", name)
	}

}


fun AWSStepFunctionsFunctions.createStateMachine(init: AWSStepFunctionsCreateStateMachineCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.CreateStateMachineResult {
	return this.block.declare(AWSStepFunctionsCreateStateMachineCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.CreateStateMachineResult
}

@Generated
class AWSStepFunctionsCreateStateMachineCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest, com.amazonaws.services.stepfunctions.model.CreateStateMachineResult> {

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

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.CreateStateMachineResult {
	  return com.amazonaws.services.stepfunctions.model.CreateStateMachineResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.CreateStateMachineResult {
		return environment.states.createStateMachine(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states create-state-machine")
				.argument("name", name)
				.argument("definition", definition)
				.argument("role-arn", roleArn)
	}

}


fun AWSStepFunctionsFunctions.deleteActivity(init: AWSStepFunctionsDeleteActivityCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.DeleteActivityResult {
	return this.block.declare(AWSStepFunctionsDeleteActivityCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.DeleteActivityResult
}

@Generated
class AWSStepFunctionsDeleteActivityCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.DeleteActivityRequest, com.amazonaws.services.stepfunctions.model.DeleteActivityResult> {

	var activityArn: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.DeleteActivityRequest {
		val input = com.amazonaws.services.stepfunctions.model.DeleteActivityRequest()
		input.setActivityArn(this.activityArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.DeleteActivityResult {
	  return com.amazonaws.services.stepfunctions.model.DeleteActivityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.DeleteActivityResult {
		return environment.states.deleteActivity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states delete-activity")
				.argument("activity-arn", activityArn)
	}

}


fun AWSStepFunctionsFunctions.deleteStateMachine(init: AWSStepFunctionsDeleteStateMachineCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.DeleteStateMachineResult {
	return this.block.declare(AWSStepFunctionsDeleteStateMachineCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.DeleteStateMachineResult
}

@Generated
class AWSStepFunctionsDeleteStateMachineCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest, com.amazonaws.services.stepfunctions.model.DeleteStateMachineResult> {

	var stateMachineArn: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest {
		val input = com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest()
		input.setStateMachineArn(this.stateMachineArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.DeleteStateMachineResult {
	  return com.amazonaws.services.stepfunctions.model.DeleteStateMachineResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.DeleteStateMachineResult {
		return environment.states.deleteStateMachine(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states delete-state-machine")
				.argument("state-machine-arn", stateMachineArn)
	}

}


fun AWSStepFunctionsFunctions.describeActivity(init: AWSStepFunctionsDescribeActivityCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.DescribeActivityResult {
	return this.block.declare(AWSStepFunctionsDescribeActivityCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.DescribeActivityResult
}

@Generated
class AWSStepFunctionsDescribeActivityCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.DescribeActivityRequest, com.amazonaws.services.stepfunctions.model.DescribeActivityResult> {

	var activityArn: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.DescribeActivityRequest {
		val input = com.amazonaws.services.stepfunctions.model.DescribeActivityRequest()
		input.setActivityArn(this.activityArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.DescribeActivityResult {
	  return com.amazonaws.services.stepfunctions.model.DescribeActivityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.DescribeActivityResult {
		return environment.states.describeActivity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states describe-activity")
				.argument("activity-arn", activityArn)
	}

}


fun AWSStepFunctionsFunctions.describeExecution(init: AWSStepFunctionsDescribeExecutionCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.DescribeExecutionResult {
	return this.block.declare(AWSStepFunctionsDescribeExecutionCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.DescribeExecutionResult
}

@Generated
class AWSStepFunctionsDescribeExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest, com.amazonaws.services.stepfunctions.model.DescribeExecutionResult> {

	var executionArn: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest {
		val input = com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest()
		input.setExecutionArn(this.executionArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.DescribeExecutionResult {
	  return com.amazonaws.services.stepfunctions.model.DescribeExecutionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.DescribeExecutionResult {
		return environment.states.describeExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states describe-execution")
				.argument("execution-arn", executionArn)
	}

}


fun AWSStepFunctionsFunctions.describeStateMachine(init: AWSStepFunctionsDescribeStateMachineCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.DescribeStateMachineResult {
	return this.block.declare(AWSStepFunctionsDescribeStateMachineCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.DescribeStateMachineResult
}

@Generated
class AWSStepFunctionsDescribeStateMachineCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest, com.amazonaws.services.stepfunctions.model.DescribeStateMachineResult> {

	var stateMachineArn: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest {
		val input = com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest()
		input.setStateMachineArn(this.stateMachineArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.DescribeStateMachineResult {
	  return com.amazonaws.services.stepfunctions.model.DescribeStateMachineResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.DescribeStateMachineResult {
		return environment.states.describeStateMachine(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states describe-state-machine")
				.argument("state-machine-arn", stateMachineArn)
	}

}


fun AWSStepFunctionsFunctions.describeStateMachineForExecution(init: AWSStepFunctionsDescribeStateMachineForExecutionCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionResult {
	return this.block.declare(AWSStepFunctionsDescribeStateMachineForExecutionCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionResult
}

@Generated
class AWSStepFunctionsDescribeStateMachineForExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest, com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionResult> {

	var executionArn: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest {
		val input = com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest()
		input.setExecutionArn(this.executionArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionResult {
	  return com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionResult {
		return environment.states.describeStateMachineForExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states describe-state-machine-for-execution")
				.argument("execution-arn", executionArn)
	}

}


fun AWSStepFunctionsFunctions.getActivityTask(init: AWSStepFunctionsGetActivityTaskCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.GetActivityTaskResult {
	return this.block.declare(AWSStepFunctionsGetActivityTaskCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.GetActivityTaskResult
}

@Generated
class AWSStepFunctionsGetActivityTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest, com.amazonaws.services.stepfunctions.model.GetActivityTaskResult> {

	var activityArn: String? = null
	var workerName: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest {
		val input = com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest()
		input.setActivityArn(this.activityArn)
		input.setWorkerName(this.workerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.GetActivityTaskResult {
	  return com.amazonaws.services.stepfunctions.model.GetActivityTaskResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.GetActivityTaskResult {
		return environment.states.getActivityTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states get-activity-task")
				.argument("activity-arn", activityArn)
				.argument("worker-name", workerName)
	}

}


fun AWSStepFunctionsFunctions.getExecutionHistory(init: AWSStepFunctionsGetExecutionHistoryCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.GetExecutionHistoryResult {
	return this.block.declare(AWSStepFunctionsGetExecutionHistoryCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.GetExecutionHistoryResult
}

@Generated
class AWSStepFunctionsGetExecutionHistoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest, com.amazonaws.services.stepfunctions.model.GetExecutionHistoryResult> {

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

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.GetExecutionHistoryResult {
	  return com.amazonaws.services.stepfunctions.model.GetExecutionHistoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.GetExecutionHistoryResult {
		return environment.states.getExecutionHistory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states get-execution-history")
				.argument("execution-arn", executionArn)
				.argument("max-results", maxResults?.toString())
				.option("reverse-order", reverseOrder ?: false)
				.argument("next-token", nextToken)
	}

}


fun AWSStepFunctionsFunctions.listActivities(init: AWSStepFunctionsListActivitiesCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.ListActivitiesResult {
	return this.block.declare(AWSStepFunctionsListActivitiesCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.ListActivitiesResult
}

@Generated
class AWSStepFunctionsListActivitiesCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.ListActivitiesRequest, com.amazonaws.services.stepfunctions.model.ListActivitiesResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.ListActivitiesRequest {
		val input = com.amazonaws.services.stepfunctions.model.ListActivitiesRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.ListActivitiesResult {
	  return com.amazonaws.services.stepfunctions.model.ListActivitiesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.ListActivitiesResult {
		return environment.states.listActivities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states list-activities")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSStepFunctionsFunctions.listExecutions(init: AWSStepFunctionsListExecutionsCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.ListExecutionsResult {
	return this.block.declare(AWSStepFunctionsListExecutionsCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.ListExecutionsResult
}

@Generated
class AWSStepFunctionsListExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.ListExecutionsRequest, com.amazonaws.services.stepfunctions.model.ListExecutionsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.ListExecutionsResult {
	  return com.amazonaws.services.stepfunctions.model.ListExecutionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.ListExecutionsResult {
		return environment.states.listExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states list-executions")
				.argument("state-machine-arn", stateMachineArn)
				.argument("status-filter", statusFilter?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSStepFunctionsFunctions.listStateMachines(init: AWSStepFunctionsListStateMachinesCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.ListStateMachinesResult {
	return this.block.declare(AWSStepFunctionsListStateMachinesCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.ListStateMachinesResult
}

@Generated
class AWSStepFunctionsListStateMachinesCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest, com.amazonaws.services.stepfunctions.model.ListStateMachinesResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest {
		val input = com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.ListStateMachinesResult {
	  return com.amazonaws.services.stepfunctions.model.ListStateMachinesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.ListStateMachinesResult {
		return environment.states.listStateMachines(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states list-state-machines")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSStepFunctionsFunctions.sendTaskFailure(init: AWSStepFunctionsSendTaskFailureCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.SendTaskFailureResult {
	return this.block.declare(AWSStepFunctionsSendTaskFailureCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.SendTaskFailureResult
}

@Generated
class AWSStepFunctionsSendTaskFailureCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest, com.amazonaws.services.stepfunctions.model.SendTaskFailureResult> {

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

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.SendTaskFailureResult {
	  return com.amazonaws.services.stepfunctions.model.SendTaskFailureResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.SendTaskFailureResult {
		return environment.states.sendTaskFailure(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states send-task-failure")
				.argument("task-token", taskToken)
				.argument("error", error)
				.argument("cause", cause)
	}

}


fun AWSStepFunctionsFunctions.sendTaskHeartbeat(init: AWSStepFunctionsSendTaskHeartbeatCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatResult {
	return this.block.declare(AWSStepFunctionsSendTaskHeartbeatCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatResult
}

@Generated
class AWSStepFunctionsSendTaskHeartbeatCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest, com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatResult> {

	var taskToken: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest {
		val input = com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest()
		input.setTaskToken(this.taskToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatResult {
	  return com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatResult {
		return environment.states.sendTaskHeartbeat(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states send-task-heartbeat")
				.argument("task-token", taskToken)
	}

}


fun AWSStepFunctionsFunctions.sendTaskSuccess(init: AWSStepFunctionsSendTaskSuccessCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.SendTaskSuccessResult {
	return this.block.declare(AWSStepFunctionsSendTaskSuccessCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.SendTaskSuccessResult
}

@Generated
class AWSStepFunctionsSendTaskSuccessCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest, com.amazonaws.services.stepfunctions.model.SendTaskSuccessResult> {

	var taskToken: String? = null
	var output: String? = null

	override fun build(): com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest {
		val input = com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest()
		input.setTaskToken(this.taskToken)
		input.setOutput(this.output)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.SendTaskSuccessResult {
	  return com.amazonaws.services.stepfunctions.model.SendTaskSuccessResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.SendTaskSuccessResult {
		return environment.states.sendTaskSuccess(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states send-task-success")
				.argument("task-token", taskToken)
				.argument("output", output)
	}

}


fun AWSStepFunctionsFunctions.startExecution(init: AWSStepFunctionsStartExecutionCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.StartExecutionResult {
	return this.block.declare(AWSStepFunctionsStartExecutionCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.StartExecutionResult
}

@Generated
class AWSStepFunctionsStartExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.StartExecutionRequest, com.amazonaws.services.stepfunctions.model.StartExecutionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.StartExecutionResult {
	  return com.amazonaws.services.stepfunctions.model.StartExecutionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.StartExecutionResult {
		return environment.states.startExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states start-execution")
				.argument("state-machine-arn", stateMachineArn)
				.argument("name", name)
				.argument("input", input)
	}

}


fun AWSStepFunctionsFunctions.stopExecution(init: AWSStepFunctionsStopExecutionCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.StopExecutionResult {
	return this.block.declare(AWSStepFunctionsStopExecutionCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.StopExecutionResult
}

@Generated
class AWSStepFunctionsStopExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.StopExecutionRequest, com.amazonaws.services.stepfunctions.model.StopExecutionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.StopExecutionResult {
	  return com.amazonaws.services.stepfunctions.model.StopExecutionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.StopExecutionResult {
		return environment.states.stopExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states stop-execution")
				.argument("execution-arn", executionArn)
				.argument("error", error)
				.argument("cause", cause)
	}

}


fun AWSStepFunctionsFunctions.updateStateMachine(init: AWSStepFunctionsUpdateStateMachineCommand.() -> Unit): com.amazonaws.services.stepfunctions.model.UpdateStateMachineResult {
	return this.block.declare(AWSStepFunctionsUpdateStateMachineCommand().apply(init)) as com.amazonaws.services.stepfunctions.model.UpdateStateMachineResult
}

@Generated
class AWSStepFunctionsUpdateStateMachineCommand() : AmazonWebServiceCommand<com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest, com.amazonaws.services.stepfunctions.model.UpdateStateMachineResult> {

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

	
	override fun dryResult(): com.amazonaws.services.stepfunctions.model.UpdateStateMachineResult {
	  return com.amazonaws.services.stepfunctions.model.UpdateStateMachineResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.stepfunctions.model.UpdateStateMachineResult {
		return environment.states.updateStateMachine(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws states update-state-machine")
				.argument("state-machine-arn", stateMachineArn)
				.argument("definition", definition)
				.argument("role-arn", roleArn)
	}

}
