
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.datapipeline.DataPipeline
import com.amazonaws.services.datapipeline.model.*

var codingue.koops.core.Environment.datapipeline: DataPipeline
	get() = this.capabilities[DataPipeline::class.java.name] as DataPipeline
	set(datapipeline) {
		this.capabilities[DataPipeline::class.java.name] = datapipeline
	}

@Generated
class DataPipelineFunctions(val block: Block)

infix fun AwsContinuation.datapipeline(init: DataPipelineFunctions.() -> Unit) {
	DataPipelineFunctions(shell).apply(init)
}

			

fun DataPipelineFunctions.activatePipeline(init: DataPipelineActivatePipelineCommand.() -> Unit) {
	this.block.declare(DataPipelineActivatePipelineCommand().apply(init))
}

@Generated
class DataPipelineActivatePipelineCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.ActivatePipelineRequest> {

	var pipelineId: String? = null
	var parameterValues: List<com.amazonaws.services.datapipeline.model.ParameterValue>? = null
	var startTimestamp: java.util.Date? = null

	override fun build(): com.amazonaws.services.datapipeline.model.ActivatePipelineRequest {
		val input = com.amazonaws.services.datapipeline.model.ActivatePipelineRequest()
		input.setPipelineId(this.pipelineId)
		input.setParameterValues(this.parameterValues)
		input.setStartTimestamp(this.startTimestamp)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.activatePipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline activate-pipeline")
				.argument("pipeline-id", pipelineId)
				.argument("parameter-values", parameterValues?.toString())
				.argument("start-timestamp", startTimestamp?.toString())
	}

}


fun DataPipelineFunctions.addTags(init: DataPipelineAddTagsCommand.() -> Unit) {
	this.block.declare(DataPipelineAddTagsCommand().apply(init))
}

@Generated
class DataPipelineAddTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.AddTagsRequest> {

	var pipelineId: String? = null
	var tags: List<com.amazonaws.services.datapipeline.model.Tag>? = null

	override fun build(): com.amazonaws.services.datapipeline.model.AddTagsRequest {
		val input = com.amazonaws.services.datapipeline.model.AddTagsRequest()
		input.setPipelineId(this.pipelineId)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.addTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline add-tags")
				.argument("pipeline-id", pipelineId)
				.argument("tags", tags?.toString())
	}

}


fun DataPipelineFunctions.createPipeline(init: DataPipelineCreatePipelineCommand.() -> Unit) {
	this.block.declare(DataPipelineCreatePipelineCommand().apply(init))
}

@Generated
class DataPipelineCreatePipelineCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.CreatePipelineRequest> {

	var name: String? = null
	var uniqueId: String? = null
	var description: String? = null
	var tags: List<com.amazonaws.services.datapipeline.model.Tag>? = null

	override fun build(): com.amazonaws.services.datapipeline.model.CreatePipelineRequest {
		val input = com.amazonaws.services.datapipeline.model.CreatePipelineRequest()
		input.setName(this.name)
		input.setUniqueId(this.uniqueId)
		input.setDescription(this.description)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.createPipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline create-pipeline")
				.argument("name", name)
				.argument("unique-id", uniqueId)
				.argument("description", description)
				.argument("tags", tags?.toString())
	}

}


fun DataPipelineFunctions.deactivatePipeline(init: DataPipelineDeactivatePipelineCommand.() -> Unit) {
	this.block.declare(DataPipelineDeactivatePipelineCommand().apply(init))
}

@Generated
class DataPipelineDeactivatePipelineCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.DeactivatePipelineRequest> {

	var pipelineId: String? = null
	var cancelActive: Boolean? = false

	override fun build(): com.amazonaws.services.datapipeline.model.DeactivatePipelineRequest {
		val input = com.amazonaws.services.datapipeline.model.DeactivatePipelineRequest()
		input.setPipelineId(this.pipelineId)
		input.setCancelActive(this.cancelActive)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.deactivatePipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline deactivate-pipeline")
				.argument("pipeline-id", pipelineId)
				.option("cancel-active", cancelActive ?: false)
	}

}


fun DataPipelineFunctions.deletePipeline(init: DataPipelineDeletePipelineCommand.() -> Unit) {
	this.block.declare(DataPipelineDeletePipelineCommand().apply(init))
}

@Generated
class DataPipelineDeletePipelineCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.DeletePipelineRequest> {

	var pipelineId: String? = null

	override fun build(): com.amazonaws.services.datapipeline.model.DeletePipelineRequest {
		val input = com.amazonaws.services.datapipeline.model.DeletePipelineRequest()
		input.setPipelineId(this.pipelineId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.deletePipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline delete-pipeline")
				.argument("pipeline-id", pipelineId)
	}

}


fun DataPipelineFunctions.describeObjects(init: DataPipelineDescribeObjectsCommand.() -> Unit) {
	this.block.declare(DataPipelineDescribeObjectsCommand().apply(init))
}

@Generated
class DataPipelineDescribeObjectsCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.DescribeObjectsRequest> {

	var pipelineId: String? = null
	var objectIds: List<String>? = null
	var evaluateExpressions: Boolean? = false
	var marker: String? = null

	override fun build(): com.amazonaws.services.datapipeline.model.DescribeObjectsRequest {
		val input = com.amazonaws.services.datapipeline.model.DescribeObjectsRequest()
		input.setPipelineId(this.pipelineId)
		input.setObjectIds(this.objectIds)
		input.setEvaluateExpressions(this.evaluateExpressions)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.describeObjects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline describe-objects")
				.argument("pipeline-id", pipelineId)
				.argument("object-ids", objectIds?.toString())
				.option("evaluate-expressions", evaluateExpressions ?: false)
				.argument("marker", marker)
	}

}


fun DataPipelineFunctions.describePipelines(init: DataPipelineDescribePipelinesCommand.() -> Unit) {
	this.block.declare(DataPipelineDescribePipelinesCommand().apply(init))
}

@Generated
class DataPipelineDescribePipelinesCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.DescribePipelinesRequest> {

	var pipelineIds: List<String>? = null

	override fun build(): com.amazonaws.services.datapipeline.model.DescribePipelinesRequest {
		val input = com.amazonaws.services.datapipeline.model.DescribePipelinesRequest()
		input.setPipelineIds(this.pipelineIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.describePipelines(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline describe-pipelines")
				.argument("pipeline-ids", pipelineIds?.toString())
	}

}


fun DataPipelineFunctions.evaluateExpression(init: DataPipelineEvaluateExpressionCommand.() -> Unit) {
	this.block.declare(DataPipelineEvaluateExpressionCommand().apply(init))
}

@Generated
class DataPipelineEvaluateExpressionCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.EvaluateExpressionRequest> {

	var pipelineId: String? = null
	var objectId: String? = null
	var expression: String? = null

	override fun build(): com.amazonaws.services.datapipeline.model.EvaluateExpressionRequest {
		val input = com.amazonaws.services.datapipeline.model.EvaluateExpressionRequest()
		input.setPipelineId(this.pipelineId)
		input.setObjectId(this.objectId)
		input.setExpression(this.expression)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.evaluateExpression(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline evaluate-expression")
				.argument("pipeline-id", pipelineId)
				.argument("object-id", objectId)
				.argument("expression", expression)
	}

}


fun DataPipelineFunctions.getPipelineDefinition(init: DataPipelineGetPipelineDefinitionCommand.() -> Unit) {
	this.block.declare(DataPipelineGetPipelineDefinitionCommand().apply(init))
}

@Generated
class DataPipelineGetPipelineDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.GetPipelineDefinitionRequest> {

	var pipelineId: String? = null
	var version: String? = null

	override fun build(): com.amazonaws.services.datapipeline.model.GetPipelineDefinitionRequest {
		val input = com.amazonaws.services.datapipeline.model.GetPipelineDefinitionRequest()
		input.setPipelineId(this.pipelineId)
		input.setVersion(this.version)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.getPipelineDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline get-pipeline-definition")
				.argument("pipeline-id", pipelineId)
				.argument("version", version)
	}

}


fun DataPipelineFunctions.listPipelines(init: DataPipelineListPipelinesCommand.() -> Unit) {
	this.block.declare(DataPipelineListPipelinesCommand().apply(init))
}

@Generated
class DataPipelineListPipelinesCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.ListPipelinesRequest> {

	var marker: String? = null

	override fun build(): com.amazonaws.services.datapipeline.model.ListPipelinesRequest {
		val input = com.amazonaws.services.datapipeline.model.ListPipelinesRequest()
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.listPipelines(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline list-pipelines")
				.argument("marker", marker)
	}

}


fun DataPipelineFunctions.pollForTask(init: DataPipelinePollForTaskCommand.() -> Unit) {
	this.block.declare(DataPipelinePollForTaskCommand().apply(init))
}

@Generated
class DataPipelinePollForTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.PollForTaskRequest> {

	var workerGroup: String? = null
	var hostname: String? = null
	var instanceIdentity: com.amazonaws.services.datapipeline.model.InstanceIdentity? = null

	override fun build(): com.amazonaws.services.datapipeline.model.PollForTaskRequest {
		val input = com.amazonaws.services.datapipeline.model.PollForTaskRequest()
		input.setWorkerGroup(this.workerGroup)
		input.setHostname(this.hostname)
		input.setInstanceIdentity(this.instanceIdentity)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.pollForTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline poll-for-task")
				.argument("worker-group", workerGroup)
				.argument("hostname", hostname)
				.argument("instance-identity", instanceIdentity?.toString())
	}

}


fun DataPipelineFunctions.putPipelineDefinition(init: DataPipelinePutPipelineDefinitionCommand.() -> Unit) {
	this.block.declare(DataPipelinePutPipelineDefinitionCommand().apply(init))
}

@Generated
class DataPipelinePutPipelineDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.PutPipelineDefinitionRequest> {

	var pipelineId: String? = null
	var pipelineObjects: List<com.amazonaws.services.datapipeline.model.PipelineObject>? = null
	var parameterObjects: List<com.amazonaws.services.datapipeline.model.ParameterObject>? = null
	var parameterValues: List<com.amazonaws.services.datapipeline.model.ParameterValue>? = null

	override fun build(): com.amazonaws.services.datapipeline.model.PutPipelineDefinitionRequest {
		val input = com.amazonaws.services.datapipeline.model.PutPipelineDefinitionRequest()
		input.setPipelineId(this.pipelineId)
		input.setPipelineObjects(this.pipelineObjects)
		input.setParameterObjects(this.parameterObjects)
		input.setParameterValues(this.parameterValues)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.putPipelineDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline put-pipeline-definition")
				.argument("pipeline-id", pipelineId)
				.argument("pipeline-objects", pipelineObjects?.toString())
				.argument("parameter-objects", parameterObjects?.toString())
				.argument("parameter-values", parameterValues?.toString())
	}

}


fun DataPipelineFunctions.queryObjects(init: DataPipelineQueryObjectsCommand.() -> Unit) {
	this.block.declare(DataPipelineQueryObjectsCommand().apply(init))
}

@Generated
class DataPipelineQueryObjectsCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.QueryObjectsRequest> {

	var pipelineId: String? = null
	var query: com.amazonaws.services.datapipeline.model.Query? = null
	var sphere: String? = null
	var marker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.datapipeline.model.QueryObjectsRequest {
		val input = com.amazonaws.services.datapipeline.model.QueryObjectsRequest()
		input.setPipelineId(this.pipelineId)
		input.setQuery(this.query)
		input.setSphere(this.sphere)
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.queryObjects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline query-objects")
				.argument("pipeline-id", pipelineId)
				.argument("query", query?.toString())
				.argument("sphere", sphere)
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun DataPipelineFunctions.removeTags(init: DataPipelineRemoveTagsCommand.() -> Unit) {
	this.block.declare(DataPipelineRemoveTagsCommand().apply(init))
}

@Generated
class DataPipelineRemoveTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.RemoveTagsRequest> {

	var pipelineId: String? = null
	var tagKeys: List<String>? = null

	override fun build(): com.amazonaws.services.datapipeline.model.RemoveTagsRequest {
		val input = com.amazonaws.services.datapipeline.model.RemoveTagsRequest()
		input.setPipelineId(this.pipelineId)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.removeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline remove-tags")
				.argument("pipeline-id", pipelineId)
				.argument("tag-keys", tagKeys?.toString())
	}

}


fun DataPipelineFunctions.reportTaskProgress(init: DataPipelineReportTaskProgressCommand.() -> Unit) {
	this.block.declare(DataPipelineReportTaskProgressCommand().apply(init))
}

@Generated
class DataPipelineReportTaskProgressCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.ReportTaskProgressRequest> {

	var taskId: String? = null
	var fields: List<com.amazonaws.services.datapipeline.model.Field>? = null

	override fun build(): com.amazonaws.services.datapipeline.model.ReportTaskProgressRequest {
		val input = com.amazonaws.services.datapipeline.model.ReportTaskProgressRequest()
		input.setTaskId(this.taskId)
		input.setFields(this.fields)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.reportTaskProgress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline report-task-progress")
				.argument("task-id", taskId)
				.argument("fields", fields?.toString())
	}

}


fun DataPipelineFunctions.reportTaskRunnerHeartbeat(init: DataPipelineReportTaskRunnerHeartbeatCommand.() -> Unit) {
	this.block.declare(DataPipelineReportTaskRunnerHeartbeatCommand().apply(init))
}

@Generated
class DataPipelineReportTaskRunnerHeartbeatCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatRequest> {

	var taskrunnerId: String? = null
	var workerGroup: String? = null
	var hostname: String? = null

	override fun build(): com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatRequest {
		val input = com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatRequest()
		input.setTaskrunnerId(this.taskrunnerId)
		input.setWorkerGroup(this.workerGroup)
		input.setHostname(this.hostname)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.reportTaskRunnerHeartbeat(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline report-task-runner-heartbeat")
				.argument("taskrunner-id", taskrunnerId)
				.argument("worker-group", workerGroup)
				.argument("hostname", hostname)
	}

}


fun DataPipelineFunctions.setStatus(init: DataPipelineSetStatusCommand.() -> Unit) {
	this.block.declare(DataPipelineSetStatusCommand().apply(init))
}

@Generated
class DataPipelineSetStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.SetStatusRequest> {

	var pipelineId: String? = null
	var objectIds: List<String>? = null
	var status: String? = null

	override fun build(): com.amazonaws.services.datapipeline.model.SetStatusRequest {
		val input = com.amazonaws.services.datapipeline.model.SetStatusRequest()
		input.setPipelineId(this.pipelineId)
		input.setObjectIds(this.objectIds)
		input.setStatus(this.status)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.setStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline set-status")
				.argument("pipeline-id", pipelineId)
				.argument("object-ids", objectIds?.toString())
				.argument("status", status)
	}

}


fun DataPipelineFunctions.setTaskStatus(init: DataPipelineSetTaskStatusCommand.() -> Unit) {
	this.block.declare(DataPipelineSetTaskStatusCommand().apply(init))
}

@Generated
class DataPipelineSetTaskStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.SetTaskStatusRequest> {

	var taskId: String? = null
	var taskStatus: TaskStatus? = null
	var errorId: String? = null
	var errorMessage: String? = null
	var errorStackTrace: String? = null

	override fun build(): com.amazonaws.services.datapipeline.model.SetTaskStatusRequest {
		val input = com.amazonaws.services.datapipeline.model.SetTaskStatusRequest()
		input.setTaskId(this.taskId)
		input.setTaskStatus(this.taskStatus?.toString())
		input.setErrorId(this.errorId)
		input.setErrorMessage(this.errorMessage)
		input.setErrorStackTrace(this.errorStackTrace)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.setTaskStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline set-task-status")
				.argument("task-id", taskId)
				.argument("task-status", taskStatus?.toString())
				.argument("error-id", errorId)
				.argument("error-message", errorMessage)
				.argument("error-stack-trace", errorStackTrace)
	}

}


fun DataPipelineFunctions.validatePipelineDefinition(init: DataPipelineValidatePipelineDefinitionCommand.() -> Unit) {
	this.block.declare(DataPipelineValidatePipelineDefinitionCommand().apply(init))
}

@Generated
class DataPipelineValidatePipelineDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionRequest> {

	var pipelineId: String? = null
	var pipelineObjects: List<com.amazonaws.services.datapipeline.model.PipelineObject>? = null
	var parameterObjects: List<com.amazonaws.services.datapipeline.model.ParameterObject>? = null
	var parameterValues: List<com.amazonaws.services.datapipeline.model.ParameterValue>? = null

	override fun build(): com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionRequest {
		val input = com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionRequest()
		input.setPipelineId(this.pipelineId)
		input.setPipelineObjects(this.pipelineObjects)
		input.setParameterObjects(this.parameterObjects)
		input.setParameterValues(this.parameterValues)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.datapipeline.validatePipelineDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline validate-pipeline-definition")
				.argument("pipeline-id", pipelineId)
				.argument("pipeline-objects", pipelineObjects?.toString())
				.argument("parameter-objects", parameterObjects?.toString())
				.argument("parameter-values", parameterValues?.toString())
	}

}
