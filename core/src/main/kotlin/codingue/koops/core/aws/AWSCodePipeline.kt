
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.codepipeline.AWSCodePipeline
import com.amazonaws.services.codepipeline.model.*

var codingue.koops.core.Environment.codepipeline: AWSCodePipeline
	get() = this.capabilities[AWSCodePipeline::class.java.name] as AWSCodePipeline
	set(codepipeline) {
		this.capabilities[AWSCodePipeline::class.java.name] = codepipeline
	}

@Generated
class AWSCodePipelineFunctions(val block: Block)

infix fun AwsContinuation.codepipeline(init: AWSCodePipelineFunctions.() -> Unit) {
	AWSCodePipelineFunctions(shell).apply(init)
}

			

fun AWSCodePipelineFunctions.acknowledgeJob(init: AWSCodePipelineAcknowledgeJobCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineAcknowledgeJobCommand().apply(init))
}

@Generated
class AWSCodePipelineAcknowledgeJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest> {

	var jobId: String? = null
	var nonce: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest {
		val input = com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest()
		input.setJobId(this.jobId)
		input.setNonce(this.nonce)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.acknowledgeJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline acknowledge-job")
				.argument("job-id", jobId)
				.argument("nonce", nonce)
	}

}


fun AWSCodePipelineFunctions.acknowledgeThirdPartyJob(init: AWSCodePipelineAcknowledgeThirdPartyJobCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineAcknowledgeThirdPartyJobCommand().apply(init))
}

@Generated
class AWSCodePipelineAcknowledgeThirdPartyJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest> {

	var jobId: String? = null
	var nonce: String? = null
	var clientToken: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest {
		val input = com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest()
		input.setJobId(this.jobId)
		input.setNonce(this.nonce)
		input.setClientToken(this.clientToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.acknowledgeThirdPartyJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline acknowledge-third-party-job")
				.argument("job-id", jobId)
				.argument("nonce", nonce)
				.argument("client-token", clientToken)
	}

}


fun AWSCodePipelineFunctions.createCustomActionType(init: AWSCodePipelineCreateCustomActionTypeCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineCreateCustomActionTypeCommand().apply(init))
}

@Generated
class AWSCodePipelineCreateCustomActionTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest> {

	var category: ActionCategory? = null
	var provider: String? = null
	var version: String? = null
	var settings: com.amazonaws.services.codepipeline.model.ActionTypeSettings? = null
	var configurationProperties: List<com.amazonaws.services.codepipeline.model.ActionConfigurationProperty>? = null
	var inputArtifactDetails: com.amazonaws.services.codepipeline.model.ArtifactDetails? = null
	var outputArtifactDetails: com.amazonaws.services.codepipeline.model.ArtifactDetails? = null

	override fun build(): com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest {
		val input = com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest()
		input.setCategory(this.category?.toString())
		input.setProvider(this.provider)
		input.setVersion(this.version)
		input.setSettings(this.settings)
		input.setConfigurationProperties(this.configurationProperties)
		input.setInputArtifactDetails(this.inputArtifactDetails)
		input.setOutputArtifactDetails(this.outputArtifactDetails)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.createCustomActionType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline create-custom-action-type")
				.argument("category", category?.toString())
				.argument("provider", provider)
				.argument("version", version)
				.argument("settings", settings?.toString())
				.argument("configuration-properties", configurationProperties?.toString())
				.argument("input-artifact-details", inputArtifactDetails?.toString())
				.argument("output-artifact-details", outputArtifactDetails?.toString())
	}

}


fun AWSCodePipelineFunctions.createPipeline(init: AWSCodePipelineCreatePipelineCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineCreatePipelineCommand().apply(init))
}

@Generated
class AWSCodePipelineCreatePipelineCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.CreatePipelineRequest> {

	var pipeline: com.amazonaws.services.codepipeline.model.PipelineDeclaration? = null

	override fun build(): com.amazonaws.services.codepipeline.model.CreatePipelineRequest {
		val input = com.amazonaws.services.codepipeline.model.CreatePipelineRequest()
		input.setPipeline(this.pipeline)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.createPipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline create-pipeline")
				.argument("pipeline", pipeline?.toString())
	}

}


fun AWSCodePipelineFunctions.deleteCustomActionType(init: AWSCodePipelineDeleteCustomActionTypeCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineDeleteCustomActionTypeCommand().apply(init))
}

@Generated
class AWSCodePipelineDeleteCustomActionTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest> {

	var category: ActionCategory? = null
	var provider: String? = null
	var version: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest {
		val input = com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest()
		input.setCategory(this.category?.toString())
		input.setProvider(this.provider)
		input.setVersion(this.version)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.deleteCustomActionType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline delete-custom-action-type")
				.argument("category", category?.toString())
				.argument("provider", provider)
				.argument("version", version)
	}

}


fun AWSCodePipelineFunctions.deletePipeline(init: AWSCodePipelineDeletePipelineCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineDeletePipelineCommand().apply(init))
}

@Generated
class AWSCodePipelineDeletePipelineCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.DeletePipelineRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.DeletePipelineRequest {
		val input = com.amazonaws.services.codepipeline.model.DeletePipelineRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.deletePipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline delete-pipeline")
				.argument("name", name)
	}

}


fun AWSCodePipelineFunctions.disableStageTransition(init: AWSCodePipelineDisableStageTransitionCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineDisableStageTransitionCommand().apply(init))
}

@Generated
class AWSCodePipelineDisableStageTransitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest> {

	var pipelineName: String? = null
	var stageName: String? = null
	var transitionType: StageTransitionType? = null
	var reason: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest {
		val input = com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest()
		input.setPipelineName(this.pipelineName)
		input.setStageName(this.stageName)
		input.setTransitionType(this.transitionType?.toString())
		input.setReason(this.reason)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.disableStageTransition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline disable-stage-transition")
				.argument("pipeline-name", pipelineName)
				.argument("stage-name", stageName)
				.argument("transition-type", transitionType?.toString())
				.argument("reason", reason)
	}

}


fun AWSCodePipelineFunctions.enableStageTransition(init: AWSCodePipelineEnableStageTransitionCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineEnableStageTransitionCommand().apply(init))
}

@Generated
class AWSCodePipelineEnableStageTransitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest> {

	var pipelineName: String? = null
	var stageName: String? = null
	var transitionType: StageTransitionType? = null

	override fun build(): com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest {
		val input = com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest()
		input.setPipelineName(this.pipelineName)
		input.setStageName(this.stageName)
		input.setTransitionType(this.transitionType?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.enableStageTransition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline enable-stage-transition")
				.argument("pipeline-name", pipelineName)
				.argument("stage-name", stageName)
				.argument("transition-type", transitionType?.toString())
	}

}


fun AWSCodePipelineFunctions.getJobDetails(init: AWSCodePipelineGetJobDetailsCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineGetJobDetailsCommand().apply(init))
}

@Generated
class AWSCodePipelineGetJobDetailsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.GetJobDetailsRequest> {

	var jobId: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.GetJobDetailsRequest {
		val input = com.amazonaws.services.codepipeline.model.GetJobDetailsRequest()
		input.setJobId(this.jobId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.getJobDetails(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline get-job-details")
				.argument("job-id", jobId)
	}

}


fun AWSCodePipelineFunctions.getPipeline(init: AWSCodePipelineGetPipelineCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineGetPipelineCommand().apply(init))
}

@Generated
class AWSCodePipelineGetPipelineCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.GetPipelineRequest> {

	var name: String? = null
	var version: Int? = 0

	override fun build(): com.amazonaws.services.codepipeline.model.GetPipelineRequest {
		val input = com.amazonaws.services.codepipeline.model.GetPipelineRequest()
		input.setName(this.name)
		input.setVersion(this.version)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.getPipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline get-pipeline")
				.argument("name", name)
				.argument("version", version?.toString())
	}

}


fun AWSCodePipelineFunctions.getPipelineExecution(init: AWSCodePipelineGetPipelineExecutionCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineGetPipelineExecutionCommand().apply(init))
}

@Generated
class AWSCodePipelineGetPipelineExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest> {

	var pipelineName: String? = null
	var pipelineExecutionId: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest {
		val input = com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest()
		input.setPipelineName(this.pipelineName)
		input.setPipelineExecutionId(this.pipelineExecutionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.getPipelineExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline get-pipeline-execution")
				.argument("pipeline-name", pipelineName)
				.argument("pipeline-execution-id", pipelineExecutionId)
	}

}


fun AWSCodePipelineFunctions.getPipelineState(init: AWSCodePipelineGetPipelineStateCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineGetPipelineStateCommand().apply(init))
}

@Generated
class AWSCodePipelineGetPipelineStateCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.GetPipelineStateRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.GetPipelineStateRequest {
		val input = com.amazonaws.services.codepipeline.model.GetPipelineStateRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.getPipelineState(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline get-pipeline-state")
				.argument("name", name)
	}

}


fun AWSCodePipelineFunctions.getThirdPartyJobDetails(init: AWSCodePipelineGetThirdPartyJobDetailsCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineGetThirdPartyJobDetailsCommand().apply(init))
}

@Generated
class AWSCodePipelineGetThirdPartyJobDetailsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest> {

	var jobId: String? = null
	var clientToken: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest {
		val input = com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest()
		input.setJobId(this.jobId)
		input.setClientToken(this.clientToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.getThirdPartyJobDetails(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline get-third-party-job-details")
				.argument("job-id", jobId)
				.argument("client-token", clientToken)
	}

}


fun AWSCodePipelineFunctions.listActionTypes(init: AWSCodePipelineListActionTypesCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineListActionTypesCommand().apply(init))
}

@Generated
class AWSCodePipelineListActionTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.ListActionTypesRequest> {

	var actionOwnerFilter: ActionOwner? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.ListActionTypesRequest {
		val input = com.amazonaws.services.codepipeline.model.ListActionTypesRequest()
		input.setActionOwnerFilter(this.actionOwnerFilter?.toString())
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.listActionTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline list-action-types")
				.argument("action-owner-filter", actionOwnerFilter?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCodePipelineFunctions.listPipelineExecutions(init: AWSCodePipelineListPipelineExecutionsCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineListPipelineExecutionsCommand().apply(init))
}

@Generated
class AWSCodePipelineListPipelineExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest> {

	var pipelineName: String? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest {
		val input = com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest()
		input.setPipelineName(this.pipelineName)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.listPipelineExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline list-pipeline-executions")
				.argument("pipeline-name", pipelineName)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCodePipelineFunctions.listPipelines(init: AWSCodePipelineListPipelinesCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineListPipelinesCommand().apply(init))
}

@Generated
class AWSCodePipelineListPipelinesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.ListPipelinesRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.ListPipelinesRequest {
		val input = com.amazonaws.services.codepipeline.model.ListPipelinesRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.listPipelines(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline list-pipelines")
				.argument("next-token", nextToken)
	}

}


fun AWSCodePipelineFunctions.pollForJobs(init: AWSCodePipelinePollForJobsCommand.() -> Unit) {
	this.block.declare(AWSCodePipelinePollForJobsCommand().apply(init))
}

@Generated
class AWSCodePipelinePollForJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.PollForJobsRequest> {

	var actionTypeId: com.amazonaws.services.codepipeline.model.ActionTypeId? = null
	var maxBatchSize: Int? = 0
	var queryParam: Map<String, String>? = null

	override fun build(): com.amazonaws.services.codepipeline.model.PollForJobsRequest {
		val input = com.amazonaws.services.codepipeline.model.PollForJobsRequest()
		input.setActionTypeId(this.actionTypeId)
		input.setMaxBatchSize(this.maxBatchSize)
		input.setQueryParam(this.queryParam)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.pollForJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline poll-for-jobs")
				.argument("action-type-id", actionTypeId?.toString())
				.argument("max-batch-size", maxBatchSize?.toString())
				.argument("query-param", queryParam?.toString())
	}

}


fun AWSCodePipelineFunctions.pollForThirdPartyJobs(init: AWSCodePipelinePollForThirdPartyJobsCommand.() -> Unit) {
	this.block.declare(AWSCodePipelinePollForThirdPartyJobsCommand().apply(init))
}

@Generated
class AWSCodePipelinePollForThirdPartyJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest> {

	var actionTypeId: com.amazonaws.services.codepipeline.model.ActionTypeId? = null
	var maxBatchSize: Int? = 0

	override fun build(): com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest {
		val input = com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest()
		input.setActionTypeId(this.actionTypeId)
		input.setMaxBatchSize(this.maxBatchSize)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.pollForThirdPartyJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline poll-for-third-party-jobs")
				.argument("action-type-id", actionTypeId?.toString())
				.argument("max-batch-size", maxBatchSize?.toString())
	}

}


fun AWSCodePipelineFunctions.putActionRevision(init: AWSCodePipelinePutActionRevisionCommand.() -> Unit) {
	this.block.declare(AWSCodePipelinePutActionRevisionCommand().apply(init))
}

@Generated
class AWSCodePipelinePutActionRevisionCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.PutActionRevisionRequest> {

	var pipelineName: String? = null
	var stageName: String? = null
	var actionName: String? = null
	var actionRevision: com.amazonaws.services.codepipeline.model.ActionRevision? = null

	override fun build(): com.amazonaws.services.codepipeline.model.PutActionRevisionRequest {
		val input = com.amazonaws.services.codepipeline.model.PutActionRevisionRequest()
		input.setPipelineName(this.pipelineName)
		input.setStageName(this.stageName)
		input.setActionName(this.actionName)
		input.setActionRevision(this.actionRevision)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.putActionRevision(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline put-action-revision")
				.argument("pipeline-name", pipelineName)
				.argument("stage-name", stageName)
				.argument("action-name", actionName)
				.argument("action-revision", actionRevision?.toString())
	}

}


fun AWSCodePipelineFunctions.putApprovalResult(init: AWSCodePipelinePutApprovalResultCommand.() -> Unit) {
	this.block.declare(AWSCodePipelinePutApprovalResultCommand().apply(init))
}

@Generated
class AWSCodePipelinePutApprovalResultCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.PutApprovalResultRequest> {

	var pipelineName: String? = null
	var stageName: String? = null
	var actionName: String? = null
	var result: com.amazonaws.services.codepipeline.model.ApprovalResult? = null
	var token: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.PutApprovalResultRequest {
		val input = com.amazonaws.services.codepipeline.model.PutApprovalResultRequest()
		input.setPipelineName(this.pipelineName)
		input.setStageName(this.stageName)
		input.setActionName(this.actionName)
		input.setResult(this.result)
		input.setToken(this.token)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.putApprovalResult(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline put-approval-result")
				.argument("pipeline-name", pipelineName)
				.argument("stage-name", stageName)
				.argument("action-name", actionName)
				.argument("result", result?.toString())
				.argument("token", token)
	}

}


fun AWSCodePipelineFunctions.putJobFailureResult(init: AWSCodePipelinePutJobFailureResultCommand.() -> Unit) {
	this.block.declare(AWSCodePipelinePutJobFailureResultCommand().apply(init))
}

@Generated
class AWSCodePipelinePutJobFailureResultCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest> {

	var jobId: String? = null
	var failureDetails: com.amazonaws.services.codepipeline.model.FailureDetails? = null

	override fun build(): com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest {
		val input = com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest()
		input.setJobId(this.jobId)
		input.setFailureDetails(this.failureDetails)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.putJobFailureResult(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline put-job-failure-result")
				.argument("job-id", jobId)
				.argument("failure-details", failureDetails?.toString())
	}

}


fun AWSCodePipelineFunctions.putJobSuccessResult(init: AWSCodePipelinePutJobSuccessResultCommand.() -> Unit) {
	this.block.declare(AWSCodePipelinePutJobSuccessResultCommand().apply(init))
}

@Generated
class AWSCodePipelinePutJobSuccessResultCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest> {

	var jobId: String? = null
	var currentRevision: com.amazonaws.services.codepipeline.model.CurrentRevision? = null
	var continuationToken: String? = null
	var executionDetails: com.amazonaws.services.codepipeline.model.ExecutionDetails? = null

	override fun build(): com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest {
		val input = com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest()
		input.setJobId(this.jobId)
		input.setCurrentRevision(this.currentRevision)
		input.setContinuationToken(this.continuationToken)
		input.setExecutionDetails(this.executionDetails)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.putJobSuccessResult(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline put-job-success-result")
				.argument("job-id", jobId)
				.argument("current-revision", currentRevision?.toString())
				.argument("continuation-token", continuationToken)
				.argument("execution-details", executionDetails?.toString())
	}

}


fun AWSCodePipelineFunctions.putThirdPartyJobFailureResult(init: AWSCodePipelinePutThirdPartyJobFailureResultCommand.() -> Unit) {
	this.block.declare(AWSCodePipelinePutThirdPartyJobFailureResultCommand().apply(init))
}

@Generated
class AWSCodePipelinePutThirdPartyJobFailureResultCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest> {

	var jobId: String? = null
	var clientToken: String? = null
	var failureDetails: com.amazonaws.services.codepipeline.model.FailureDetails? = null

	override fun build(): com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest {
		val input = com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest()
		input.setJobId(this.jobId)
		input.setClientToken(this.clientToken)
		input.setFailureDetails(this.failureDetails)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.putThirdPartyJobFailureResult(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline put-third-party-job-failure-result")
				.argument("job-id", jobId)
				.argument("client-token", clientToken)
				.argument("failure-details", failureDetails?.toString())
	}

}


fun AWSCodePipelineFunctions.putThirdPartyJobSuccessResult(init: AWSCodePipelinePutThirdPartyJobSuccessResultCommand.() -> Unit) {
	this.block.declare(AWSCodePipelinePutThirdPartyJobSuccessResultCommand().apply(init))
}

@Generated
class AWSCodePipelinePutThirdPartyJobSuccessResultCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest> {

	var jobId: String? = null
	var clientToken: String? = null
	var currentRevision: com.amazonaws.services.codepipeline.model.CurrentRevision? = null
	var continuationToken: String? = null
	var executionDetails: com.amazonaws.services.codepipeline.model.ExecutionDetails? = null

	override fun build(): com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest {
		val input = com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest()
		input.setJobId(this.jobId)
		input.setClientToken(this.clientToken)
		input.setCurrentRevision(this.currentRevision)
		input.setContinuationToken(this.continuationToken)
		input.setExecutionDetails(this.executionDetails)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.putThirdPartyJobSuccessResult(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline put-third-party-job-success-result")
				.argument("job-id", jobId)
				.argument("client-token", clientToken)
				.argument("current-revision", currentRevision?.toString())
				.argument("continuation-token", continuationToken)
				.argument("execution-details", executionDetails?.toString())
	}

}


fun AWSCodePipelineFunctions.retryStageExecution(init: AWSCodePipelineRetryStageExecutionCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineRetryStageExecutionCommand().apply(init))
}

@Generated
class AWSCodePipelineRetryStageExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest> {

	var pipelineName: String? = null
	var stageName: String? = null
	var pipelineExecutionId: String? = null
	var retryMode: StageRetryMode? = null

	override fun build(): com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest {
		val input = com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest()
		input.setPipelineName(this.pipelineName)
		input.setStageName(this.stageName)
		input.setPipelineExecutionId(this.pipelineExecutionId)
		input.setRetryMode(this.retryMode?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.retryStageExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline retry-stage-execution")
				.argument("pipeline-name", pipelineName)
				.argument("stage-name", stageName)
				.argument("pipeline-execution-id", pipelineExecutionId)
				.argument("retry-mode", retryMode?.toString())
	}

}


fun AWSCodePipelineFunctions.startPipelineExecution(init: AWSCodePipelineStartPipelineExecutionCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineStartPipelineExecutionCommand().apply(init))
}

@Generated
class AWSCodePipelineStartPipelineExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest {
		val input = com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.startPipelineExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline start-pipeline-execution")
				.argument("name", name)
	}

}


fun AWSCodePipelineFunctions.updatePipeline(init: AWSCodePipelineUpdatePipelineCommand.() -> Unit) {
	this.block.declare(AWSCodePipelineUpdatePipelineCommand().apply(init))
}

@Generated
class AWSCodePipelineUpdatePipelineCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.UpdatePipelineRequest> {

	var pipeline: com.amazonaws.services.codepipeline.model.PipelineDeclaration? = null

	override fun build(): com.amazonaws.services.codepipeline.model.UpdatePipelineRequest {
		val input = com.amazonaws.services.codepipeline.model.UpdatePipelineRequest()
		input.setPipeline(this.pipeline)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codepipeline.updatePipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline update-pipeline")
				.argument("pipeline", pipeline?.toString())
	}

}
