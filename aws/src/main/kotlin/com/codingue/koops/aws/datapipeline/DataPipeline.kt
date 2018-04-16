
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.datapipeline

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.datapipeline.*
import com.amazonaws.services.datapipeline.model.*

var com.codingue.koops.core.Environment.datapipeline: DataPipeline
	get() {
		var service = this.capabilities["aws-datapipeline"]
		if (service == null) {
			service = DataPipelineClientBuilder.standard().build()
			this.capabilities["aws-datapipeline"] = service
		}
		return service as DataPipeline
	}
	set(datapipeline) {
		this.capabilities["aws-datapipeline"] = datapipeline
	}

@Generated
class DataPipelineFunctions(val block: Block)

infix fun <T> AwsContinuation.datapipeline(init: DataPipelineFunctions.() -> T): T {
	return DataPipelineFunctions(shell).run(init)
}

			

fun DataPipelineFunctions.activatePipeline(init: (DataPipelineActivatePipelineCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.ActivatePipelineResult {
	return this.block.declare(DataPipelineActivatePipelineCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.ActivatePipelineResult
}

@Generated
class DataPipelineActivatePipelineCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.ActivatePipelineRequest, com.amazonaws.services.datapipeline.model.ActivatePipelineResult> {

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

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.ActivatePipelineResult {
	  return com.amazonaws.services.datapipeline.model.ActivatePipelineResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.ActivatePipelineResult {
		return environment.datapipeline.activatePipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline activate-pipeline")
				.argument("pipeline-id", pipelineId)
				.argument("parameter-values", parameterValues?.toString())
				.argument("start-timestamp", startTimestamp?.toString())
	}

}


fun DataPipelineFunctions.addTags(init: (DataPipelineAddTagsCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.AddTagsResult {
	return this.block.declare(DataPipelineAddTagsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.AddTagsResult
}

@Generated
class DataPipelineAddTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.AddTagsRequest, com.amazonaws.services.datapipeline.model.AddTagsResult> {

	var pipelineId: String? = null
	var tags: List<com.amazonaws.services.datapipeline.model.Tag>? = null

	override fun build(): com.amazonaws.services.datapipeline.model.AddTagsRequest {
		val input = com.amazonaws.services.datapipeline.model.AddTagsRequest()
		input.setPipelineId(this.pipelineId)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.AddTagsResult {
	  return com.amazonaws.services.datapipeline.model.AddTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.AddTagsResult {
		return environment.datapipeline.addTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline add-tags")
				.argument("pipeline-id", pipelineId)
				.argument("tags", tags?.toString())
	}

}


fun DataPipelineFunctions.createPipeline(init: (DataPipelineCreatePipelineCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.CreatePipelineResult {
	return this.block.declare(DataPipelineCreatePipelineCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.CreatePipelineResult
}

@Generated
class DataPipelineCreatePipelineCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.CreatePipelineRequest, com.amazonaws.services.datapipeline.model.CreatePipelineResult> {

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

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.CreatePipelineResult {
	  return com.amazonaws.services.datapipeline.model.CreatePipelineResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.CreatePipelineResult {
		return environment.datapipeline.createPipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline create-pipeline")
				.argument("name", name)
				.argument("unique-id", uniqueId)
				.argument("description", description)
				.argument("tags", tags?.toString())
	}

}


fun DataPipelineFunctions.deactivatePipeline(init: (DataPipelineDeactivatePipelineCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.DeactivatePipelineResult {
	return this.block.declare(DataPipelineDeactivatePipelineCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.DeactivatePipelineResult
}

@Generated
class DataPipelineDeactivatePipelineCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.DeactivatePipelineRequest, com.amazonaws.services.datapipeline.model.DeactivatePipelineResult> {

	var pipelineId: String? = null
	var cancelActive: Boolean? = false

	override fun build(): com.amazonaws.services.datapipeline.model.DeactivatePipelineRequest {
		val input = com.amazonaws.services.datapipeline.model.DeactivatePipelineRequest()
		input.setPipelineId(this.pipelineId)
		input.setCancelActive(this.cancelActive)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.DeactivatePipelineResult {
	  return com.amazonaws.services.datapipeline.model.DeactivatePipelineResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.DeactivatePipelineResult {
		return environment.datapipeline.deactivatePipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline deactivate-pipeline")
				.argument("pipeline-id", pipelineId)
				.option("cancel-active", cancelActive ?: false)
	}

}


fun DataPipelineFunctions.deletePipeline(init: (DataPipelineDeletePipelineCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.DeletePipelineResult {
	return this.block.declare(DataPipelineDeletePipelineCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.DeletePipelineResult
}

@Generated
class DataPipelineDeletePipelineCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.DeletePipelineRequest, com.amazonaws.services.datapipeline.model.DeletePipelineResult> {

	var pipelineId: String? = null

	override fun build(): com.amazonaws.services.datapipeline.model.DeletePipelineRequest {
		val input = com.amazonaws.services.datapipeline.model.DeletePipelineRequest()
		input.setPipelineId(this.pipelineId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.DeletePipelineResult {
	  return com.amazonaws.services.datapipeline.model.DeletePipelineResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.DeletePipelineResult {
		return environment.datapipeline.deletePipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline delete-pipeline")
				.argument("pipeline-id", pipelineId)
	}

}


fun DataPipelineFunctions.describeObjects(init: (DataPipelineDescribeObjectsCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.DescribeObjectsResult {
	return this.block.declare(DataPipelineDescribeObjectsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.DescribeObjectsResult
}

@Generated
class DataPipelineDescribeObjectsCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.DescribeObjectsRequest, com.amazonaws.services.datapipeline.model.DescribeObjectsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.DescribeObjectsResult {
	  return com.amazonaws.services.datapipeline.model.DescribeObjectsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.DescribeObjectsResult {
		return environment.datapipeline.describeObjects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline describe-objects")
				.argument("pipeline-id", pipelineId)
				.argument("object-ids", objectIds?.toString())
				.option("evaluate-expressions", evaluateExpressions ?: false)
				.argument("marker", marker)
	}

}


fun DataPipelineFunctions.describePipelines(init: (DataPipelineDescribePipelinesCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.DescribePipelinesResult {
	return this.block.declare(DataPipelineDescribePipelinesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.DescribePipelinesResult
}

@Generated
class DataPipelineDescribePipelinesCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.DescribePipelinesRequest, com.amazonaws.services.datapipeline.model.DescribePipelinesResult> {

	var pipelineIds: List<String>? = null

	override fun build(): com.amazonaws.services.datapipeline.model.DescribePipelinesRequest {
		val input = com.amazonaws.services.datapipeline.model.DescribePipelinesRequest()
		input.setPipelineIds(this.pipelineIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.DescribePipelinesResult {
	  return com.amazonaws.services.datapipeline.model.DescribePipelinesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.DescribePipelinesResult {
		return environment.datapipeline.describePipelines(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline describe-pipelines")
				.argument("pipeline-ids", pipelineIds?.toString())
	}

}


fun DataPipelineFunctions.evaluateExpression(init: (DataPipelineEvaluateExpressionCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.EvaluateExpressionResult {
	return this.block.declare(DataPipelineEvaluateExpressionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.EvaluateExpressionResult
}

@Generated
class DataPipelineEvaluateExpressionCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.EvaluateExpressionRequest, com.amazonaws.services.datapipeline.model.EvaluateExpressionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.EvaluateExpressionResult {
	  return com.amazonaws.services.datapipeline.model.EvaluateExpressionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.EvaluateExpressionResult {
		return environment.datapipeline.evaluateExpression(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline evaluate-expression")
				.argument("pipeline-id", pipelineId)
				.argument("object-id", objectId)
				.argument("expression", expression)
	}

}


fun DataPipelineFunctions.getPipelineDefinition(init: (DataPipelineGetPipelineDefinitionCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.GetPipelineDefinitionResult {
	return this.block.declare(DataPipelineGetPipelineDefinitionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.GetPipelineDefinitionResult
}

@Generated
class DataPipelineGetPipelineDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.GetPipelineDefinitionRequest, com.amazonaws.services.datapipeline.model.GetPipelineDefinitionResult> {

	var pipelineId: String? = null
	var version: String? = null

	override fun build(): com.amazonaws.services.datapipeline.model.GetPipelineDefinitionRequest {
		val input = com.amazonaws.services.datapipeline.model.GetPipelineDefinitionRequest()
		input.setPipelineId(this.pipelineId)
		input.setVersion(this.version)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.GetPipelineDefinitionResult {
	  return com.amazonaws.services.datapipeline.model.GetPipelineDefinitionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.GetPipelineDefinitionResult {
		return environment.datapipeline.getPipelineDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline get-pipeline-definition")
				.argument("pipeline-id", pipelineId)
				.argument("version", version)
	}

}


fun DataPipelineFunctions.listPipelines(init: (DataPipelineListPipelinesCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.ListPipelinesResult {
	return this.block.declare(DataPipelineListPipelinesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.ListPipelinesResult
}

@Generated
class DataPipelineListPipelinesCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.ListPipelinesRequest, com.amazonaws.services.datapipeline.model.ListPipelinesResult> {

	var marker: String? = null

	override fun build(): com.amazonaws.services.datapipeline.model.ListPipelinesRequest {
		val input = com.amazonaws.services.datapipeline.model.ListPipelinesRequest()
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.ListPipelinesResult {
	  return com.amazonaws.services.datapipeline.model.ListPipelinesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.ListPipelinesResult {
		return environment.datapipeline.listPipelines(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline list-pipelines")
				.argument("marker", marker)
	}

}


fun DataPipelineFunctions.pollForTask(init: (DataPipelinePollForTaskCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.PollForTaskResult {
	return this.block.declare(DataPipelinePollForTaskCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.PollForTaskResult
}

@Generated
class DataPipelinePollForTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.PollForTaskRequest, com.amazonaws.services.datapipeline.model.PollForTaskResult> {

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

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.PollForTaskResult {
	  return com.amazonaws.services.datapipeline.model.PollForTaskResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.PollForTaskResult {
		return environment.datapipeline.pollForTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline poll-for-task")
				.argument("worker-group", workerGroup)
				.argument("hostname", hostname)
				.argument("instance-identity", instanceIdentity?.toString())
	}

}


fun DataPipelineFunctions.putPipelineDefinition(init: (DataPipelinePutPipelineDefinitionCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.PutPipelineDefinitionResult {
	return this.block.declare(DataPipelinePutPipelineDefinitionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.PutPipelineDefinitionResult
}

@Generated
class DataPipelinePutPipelineDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.PutPipelineDefinitionRequest, com.amazonaws.services.datapipeline.model.PutPipelineDefinitionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.PutPipelineDefinitionResult {
	  return com.amazonaws.services.datapipeline.model.PutPipelineDefinitionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.PutPipelineDefinitionResult {
		return environment.datapipeline.putPipelineDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline put-pipeline-definition")
				.argument("pipeline-id", pipelineId)
				.argument("pipeline-objects", pipelineObjects?.toString())
				.argument("parameter-objects", parameterObjects?.toString())
				.argument("parameter-values", parameterValues?.toString())
	}

}


fun DataPipelineFunctions.queryObjects(init: (DataPipelineQueryObjectsCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.QueryObjectsResult {
	return this.block.declare(DataPipelineQueryObjectsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.QueryObjectsResult
}

@Generated
class DataPipelineQueryObjectsCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.QueryObjectsRequest, com.amazonaws.services.datapipeline.model.QueryObjectsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.QueryObjectsResult {
	  return com.amazonaws.services.datapipeline.model.QueryObjectsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.QueryObjectsResult {
		return environment.datapipeline.queryObjects(build())
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


fun DataPipelineFunctions.removeTags(init: (DataPipelineRemoveTagsCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.RemoveTagsResult {
	return this.block.declare(DataPipelineRemoveTagsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.RemoveTagsResult
}

@Generated
class DataPipelineRemoveTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.RemoveTagsRequest, com.amazonaws.services.datapipeline.model.RemoveTagsResult> {

	var pipelineId: String? = null
	var tagKeys: List<String>? = null

	override fun build(): com.amazonaws.services.datapipeline.model.RemoveTagsRequest {
		val input = com.amazonaws.services.datapipeline.model.RemoveTagsRequest()
		input.setPipelineId(this.pipelineId)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.RemoveTagsResult {
	  return com.amazonaws.services.datapipeline.model.RemoveTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.RemoveTagsResult {
		return environment.datapipeline.removeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline remove-tags")
				.argument("pipeline-id", pipelineId)
				.argument("tag-keys", tagKeys?.toString())
	}

}


fun DataPipelineFunctions.reportTaskProgress(init: (DataPipelineReportTaskProgressCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.ReportTaskProgressResult {
	return this.block.declare(DataPipelineReportTaskProgressCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.ReportTaskProgressResult
}

@Generated
class DataPipelineReportTaskProgressCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.ReportTaskProgressRequest, com.amazonaws.services.datapipeline.model.ReportTaskProgressResult> {

	var taskId: String? = null
	var fields: List<com.amazonaws.services.datapipeline.model.Field>? = null

	override fun build(): com.amazonaws.services.datapipeline.model.ReportTaskProgressRequest {
		val input = com.amazonaws.services.datapipeline.model.ReportTaskProgressRequest()
		input.setTaskId(this.taskId)
		input.setFields(this.fields)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.ReportTaskProgressResult {
	  return com.amazonaws.services.datapipeline.model.ReportTaskProgressResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.ReportTaskProgressResult {
		return environment.datapipeline.reportTaskProgress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline report-task-progress")
				.argument("task-id", taskId)
				.argument("fields", fields?.toString())
	}

}


fun DataPipelineFunctions.reportTaskRunnerHeartbeat(init: (DataPipelineReportTaskRunnerHeartbeatCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatResult {
	return this.block.declare(DataPipelineReportTaskRunnerHeartbeatCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatResult
}

@Generated
class DataPipelineReportTaskRunnerHeartbeatCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatRequest, com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatResult> {

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

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatResult {
	  return com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatResult {
		return environment.datapipeline.reportTaskRunnerHeartbeat(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline report-task-runner-heartbeat")
				.argument("taskrunner-id", taskrunnerId)
				.argument("worker-group", workerGroup)
				.argument("hostname", hostname)
	}

}


fun DataPipelineFunctions.setStatus(init: (DataPipelineSetStatusCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.SetStatusResult {
	return this.block.declare(DataPipelineSetStatusCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.SetStatusResult
}

@Generated
class DataPipelineSetStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.SetStatusRequest, com.amazonaws.services.datapipeline.model.SetStatusResult> {

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

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.SetStatusResult {
	  return com.amazonaws.services.datapipeline.model.SetStatusResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.SetStatusResult {
		return environment.datapipeline.setStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline set-status")
				.argument("pipeline-id", pipelineId)
				.argument("object-ids", objectIds?.toString())
				.argument("status", status)
	}

}


fun DataPipelineFunctions.setTaskStatus(init: (DataPipelineSetTaskStatusCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.SetTaskStatusResult {
	return this.block.declare(DataPipelineSetTaskStatusCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.SetTaskStatusResult
}

@Generated
class DataPipelineSetTaskStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.SetTaskStatusRequest, com.amazonaws.services.datapipeline.model.SetTaskStatusResult> {

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

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.SetTaskStatusResult {
	  return com.amazonaws.services.datapipeline.model.SetTaskStatusResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.SetTaskStatusResult {
		return environment.datapipeline.setTaskStatus(build())
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


fun DataPipelineFunctions.validatePipelineDefinition(init: (DataPipelineValidatePipelineDefinitionCommand.() -> Unit)? = null): com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionResult {
	return this.block.declare(DataPipelineValidatePipelineDefinitionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionResult
}

@Generated
class DataPipelineValidatePipelineDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionRequest, com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionResult {
	  return com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionResult {
		return environment.datapipeline.validatePipelineDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws datapipeline validate-pipeline-definition")
				.argument("pipeline-id", pipelineId)
				.argument("pipeline-objects", pipelineObjects?.toString())
				.argument("parameter-objects", parameterObjects?.toString())
				.argument("parameter-values", parameterValues?.toString())
	}

}
