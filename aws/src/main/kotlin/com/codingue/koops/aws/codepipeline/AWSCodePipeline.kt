
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.codepipeline

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.codepipeline.*
import com.amazonaws.services.codepipeline.model.*

var com.codingue.koops.core.Environment.codepipeline: AWSCodePipeline
	get() {
		var service = this.capabilities["aws-codepipeline"]
		if (service == null) {
			service = AWSCodePipelineClientBuilder.standard().build()
			this.capabilities["aws-codepipeline"] = service
		}
		return service as AWSCodePipeline
	}
	set(codepipeline) {
		this.capabilities["aws-codepipeline"] = codepipeline
	}

@Generated
class AWSCodePipelineFunctions(val block: Block)

infix fun <T> AwsContinuation.codepipeline(init: AWSCodePipelineFunctions.() -> T): T {
	return AWSCodePipelineFunctions(shell).run(init)
}

			

fun AWSCodePipelineFunctions.acknowledgeJob(init: (AWSCodePipelineAcknowledgeJobCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.AcknowledgeJobResult {
	return this.block.declare(AWSCodePipelineAcknowledgeJobCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.AcknowledgeJobResult
}

@Generated
class AWSCodePipelineAcknowledgeJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest, com.amazonaws.services.codepipeline.model.AcknowledgeJobResult> {

	var jobId: String? = null
	var nonce: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest {
		val input = com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest()
		input.setJobId(this.jobId)
		input.setNonce(this.nonce)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.AcknowledgeJobResult {
	  return com.amazonaws.services.codepipeline.model.AcknowledgeJobResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.AcknowledgeJobResult {
		return environment.codepipeline.acknowledgeJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline acknowledge-job")
				.argument("job-id", jobId)
				.argument("nonce", nonce)
	}

}


fun AWSCodePipelineFunctions.acknowledgeThirdPartyJob(init: (AWSCodePipelineAcknowledgeThirdPartyJobCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobResult {
	return this.block.declare(AWSCodePipelineAcknowledgeThirdPartyJobCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobResult
}

@Generated
class AWSCodePipelineAcknowledgeThirdPartyJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest, com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobResult {
	  return com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobResult {
		return environment.codepipeline.acknowledgeThirdPartyJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline acknowledge-third-party-job")
				.argument("job-id", jobId)
				.argument("nonce", nonce)
				.argument("client-token", clientToken)
	}

}


fun AWSCodePipelineFunctions.createCustomActionType(init: (AWSCodePipelineCreateCustomActionTypeCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.CreateCustomActionTypeResult {
	return this.block.declare(AWSCodePipelineCreateCustomActionTypeCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.CreateCustomActionTypeResult
}

@Generated
class AWSCodePipelineCreateCustomActionTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest, com.amazonaws.services.codepipeline.model.CreateCustomActionTypeResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.CreateCustomActionTypeResult {
	  return com.amazonaws.services.codepipeline.model.CreateCustomActionTypeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.CreateCustomActionTypeResult {
		return environment.codepipeline.createCustomActionType(build())
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


fun AWSCodePipelineFunctions.createPipeline(init: (AWSCodePipelineCreatePipelineCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.CreatePipelineResult {
	return this.block.declare(AWSCodePipelineCreatePipelineCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.CreatePipelineResult
}

@Generated
class AWSCodePipelineCreatePipelineCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.CreatePipelineRequest, com.amazonaws.services.codepipeline.model.CreatePipelineResult> {

	var pipeline: com.amazonaws.services.codepipeline.model.PipelineDeclaration? = null

	override fun build(): com.amazonaws.services.codepipeline.model.CreatePipelineRequest {
		val input = com.amazonaws.services.codepipeline.model.CreatePipelineRequest()
		input.setPipeline(this.pipeline)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.CreatePipelineResult {
	  return com.amazonaws.services.codepipeline.model.CreatePipelineResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.CreatePipelineResult {
		return environment.codepipeline.createPipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline create-pipeline")
				.argument("pipeline", pipeline?.toString())
	}

}


fun AWSCodePipelineFunctions.deleteCustomActionType(init: (AWSCodePipelineDeleteCustomActionTypeCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeResult {
	return this.block.declare(AWSCodePipelineDeleteCustomActionTypeCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeResult
}

@Generated
class AWSCodePipelineDeleteCustomActionTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest, com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeResult {
	  return com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeResult {
		return environment.codepipeline.deleteCustomActionType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline delete-custom-action-type")
				.argument("category", category?.toString())
				.argument("provider", provider)
				.argument("version", version)
	}

}


fun AWSCodePipelineFunctions.deletePipeline(init: (AWSCodePipelineDeletePipelineCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.DeletePipelineResult {
	return this.block.declare(AWSCodePipelineDeletePipelineCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.DeletePipelineResult
}

@Generated
class AWSCodePipelineDeletePipelineCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.DeletePipelineRequest, com.amazonaws.services.codepipeline.model.DeletePipelineResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.DeletePipelineRequest {
		val input = com.amazonaws.services.codepipeline.model.DeletePipelineRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.DeletePipelineResult {
	  return com.amazonaws.services.codepipeline.model.DeletePipelineResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.DeletePipelineResult {
		return environment.codepipeline.deletePipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline delete-pipeline")
				.argument("name", name)
	}

}


fun AWSCodePipelineFunctions.disableStageTransition(init: (AWSCodePipelineDisableStageTransitionCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.DisableStageTransitionResult {
	return this.block.declare(AWSCodePipelineDisableStageTransitionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.DisableStageTransitionResult
}

@Generated
class AWSCodePipelineDisableStageTransitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest, com.amazonaws.services.codepipeline.model.DisableStageTransitionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.DisableStageTransitionResult {
	  return com.amazonaws.services.codepipeline.model.DisableStageTransitionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.DisableStageTransitionResult {
		return environment.codepipeline.disableStageTransition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline disable-stage-transition")
				.argument("pipeline-name", pipelineName)
				.argument("stage-name", stageName)
				.argument("transition-type", transitionType?.toString())
				.argument("reason", reason)
	}

}


fun AWSCodePipelineFunctions.enableStageTransition(init: (AWSCodePipelineEnableStageTransitionCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.EnableStageTransitionResult {
	return this.block.declare(AWSCodePipelineEnableStageTransitionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.EnableStageTransitionResult
}

@Generated
class AWSCodePipelineEnableStageTransitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest, com.amazonaws.services.codepipeline.model.EnableStageTransitionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.EnableStageTransitionResult {
	  return com.amazonaws.services.codepipeline.model.EnableStageTransitionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.EnableStageTransitionResult {
		return environment.codepipeline.enableStageTransition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline enable-stage-transition")
				.argument("pipeline-name", pipelineName)
				.argument("stage-name", stageName)
				.argument("transition-type", transitionType?.toString())
	}

}


fun AWSCodePipelineFunctions.getJobDetails(init: (AWSCodePipelineGetJobDetailsCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.GetJobDetailsResult {
	return this.block.declare(AWSCodePipelineGetJobDetailsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.GetJobDetailsResult
}

@Generated
class AWSCodePipelineGetJobDetailsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.GetJobDetailsRequest, com.amazonaws.services.codepipeline.model.GetJobDetailsResult> {

	var jobId: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.GetJobDetailsRequest {
		val input = com.amazonaws.services.codepipeline.model.GetJobDetailsRequest()
		input.setJobId(this.jobId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.GetJobDetailsResult {
	  return com.amazonaws.services.codepipeline.model.GetJobDetailsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.GetJobDetailsResult {
		return environment.codepipeline.getJobDetails(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline get-job-details")
				.argument("job-id", jobId)
	}

}


fun AWSCodePipelineFunctions.getPipeline(init: (AWSCodePipelineGetPipelineCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.GetPipelineResult {
	return this.block.declare(AWSCodePipelineGetPipelineCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.GetPipelineResult
}

@Generated
class AWSCodePipelineGetPipelineCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.GetPipelineRequest, com.amazonaws.services.codepipeline.model.GetPipelineResult> {

	var name: String? = null
	var version: Int? = 0

	override fun build(): com.amazonaws.services.codepipeline.model.GetPipelineRequest {
		val input = com.amazonaws.services.codepipeline.model.GetPipelineRequest()
		input.setName(this.name)
		input.setVersion(this.version)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.GetPipelineResult {
	  return com.amazonaws.services.codepipeline.model.GetPipelineResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.GetPipelineResult {
		return environment.codepipeline.getPipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline get-pipeline")
				.argument("name", name)
				.argument("version", version?.toString())
	}

}


fun AWSCodePipelineFunctions.getPipelineExecution(init: (AWSCodePipelineGetPipelineExecutionCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.GetPipelineExecutionResult {
	return this.block.declare(AWSCodePipelineGetPipelineExecutionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.GetPipelineExecutionResult
}

@Generated
class AWSCodePipelineGetPipelineExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest, com.amazonaws.services.codepipeline.model.GetPipelineExecutionResult> {

	var pipelineName: String? = null
	var pipelineExecutionId: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest {
		val input = com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest()
		input.setPipelineName(this.pipelineName)
		input.setPipelineExecutionId(this.pipelineExecutionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.GetPipelineExecutionResult {
	  return com.amazonaws.services.codepipeline.model.GetPipelineExecutionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.GetPipelineExecutionResult {
		return environment.codepipeline.getPipelineExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline get-pipeline-execution")
				.argument("pipeline-name", pipelineName)
				.argument("pipeline-execution-id", pipelineExecutionId)
	}

}


fun AWSCodePipelineFunctions.getPipelineState(init: (AWSCodePipelineGetPipelineStateCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.GetPipelineStateResult {
	return this.block.declare(AWSCodePipelineGetPipelineStateCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.GetPipelineStateResult
}

@Generated
class AWSCodePipelineGetPipelineStateCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.GetPipelineStateRequest, com.amazonaws.services.codepipeline.model.GetPipelineStateResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.GetPipelineStateRequest {
		val input = com.amazonaws.services.codepipeline.model.GetPipelineStateRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.GetPipelineStateResult {
	  return com.amazonaws.services.codepipeline.model.GetPipelineStateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.GetPipelineStateResult {
		return environment.codepipeline.getPipelineState(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline get-pipeline-state")
				.argument("name", name)
	}

}


fun AWSCodePipelineFunctions.getThirdPartyJobDetails(init: (AWSCodePipelineGetThirdPartyJobDetailsCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsResult {
	return this.block.declare(AWSCodePipelineGetThirdPartyJobDetailsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsResult
}

@Generated
class AWSCodePipelineGetThirdPartyJobDetailsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest, com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsResult> {

	var jobId: String? = null
	var clientToken: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest {
		val input = com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest()
		input.setJobId(this.jobId)
		input.setClientToken(this.clientToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsResult {
	  return com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsResult {
		return environment.codepipeline.getThirdPartyJobDetails(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline get-third-party-job-details")
				.argument("job-id", jobId)
				.argument("client-token", clientToken)
	}

}


fun AWSCodePipelineFunctions.listActionTypes(init: (AWSCodePipelineListActionTypesCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.ListActionTypesResult {
	return this.block.declare(AWSCodePipelineListActionTypesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.ListActionTypesResult
}

@Generated
class AWSCodePipelineListActionTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.ListActionTypesRequest, com.amazonaws.services.codepipeline.model.ListActionTypesResult> {

	var actionOwnerFilter: ActionOwner? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.ListActionTypesRequest {
		val input = com.amazonaws.services.codepipeline.model.ListActionTypesRequest()
		input.setActionOwnerFilter(this.actionOwnerFilter?.toString())
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.ListActionTypesResult {
	  return com.amazonaws.services.codepipeline.model.ListActionTypesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.ListActionTypesResult {
		return environment.codepipeline.listActionTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline list-action-types")
				.argument("action-owner-filter", actionOwnerFilter?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCodePipelineFunctions.listPipelineExecutions(init: (AWSCodePipelineListPipelineExecutionsCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.ListPipelineExecutionsResult {
	return this.block.declare(AWSCodePipelineListPipelineExecutionsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.ListPipelineExecutionsResult
}

@Generated
class AWSCodePipelineListPipelineExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest, com.amazonaws.services.codepipeline.model.ListPipelineExecutionsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.ListPipelineExecutionsResult {
	  return com.amazonaws.services.codepipeline.model.ListPipelineExecutionsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.ListPipelineExecutionsResult {
		return environment.codepipeline.listPipelineExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline list-pipeline-executions")
				.argument("pipeline-name", pipelineName)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCodePipelineFunctions.listPipelines(init: (AWSCodePipelineListPipelinesCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.ListPipelinesResult {
	return this.block.declare(AWSCodePipelineListPipelinesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.ListPipelinesResult
}

@Generated
class AWSCodePipelineListPipelinesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.ListPipelinesRequest, com.amazonaws.services.codepipeline.model.ListPipelinesResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.ListPipelinesRequest {
		val input = com.amazonaws.services.codepipeline.model.ListPipelinesRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.ListPipelinesResult {
	  return com.amazonaws.services.codepipeline.model.ListPipelinesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.ListPipelinesResult {
		return environment.codepipeline.listPipelines(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline list-pipelines")
				.argument("next-token", nextToken)
	}

}


fun AWSCodePipelineFunctions.pollForJobs(init: (AWSCodePipelinePollForJobsCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.PollForJobsResult {
	return this.block.declare(AWSCodePipelinePollForJobsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.PollForJobsResult
}

@Generated
class AWSCodePipelinePollForJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.PollForJobsRequest, com.amazonaws.services.codepipeline.model.PollForJobsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.PollForJobsResult {
	  return com.amazonaws.services.codepipeline.model.PollForJobsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.PollForJobsResult {
		return environment.codepipeline.pollForJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline poll-for-jobs")
				.argument("action-type-id", actionTypeId?.toString())
				.argument("max-batch-size", maxBatchSize?.toString())
				.argument("query-param", queryParam?.toString())
	}

}


fun AWSCodePipelineFunctions.pollForThirdPartyJobs(init: (AWSCodePipelinePollForThirdPartyJobsCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsResult {
	return this.block.declare(AWSCodePipelinePollForThirdPartyJobsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsResult
}

@Generated
class AWSCodePipelinePollForThirdPartyJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest, com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsResult> {

	var actionTypeId: com.amazonaws.services.codepipeline.model.ActionTypeId? = null
	var maxBatchSize: Int? = 0

	override fun build(): com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest {
		val input = com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest()
		input.setActionTypeId(this.actionTypeId)
		input.setMaxBatchSize(this.maxBatchSize)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsResult {
	  return com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsResult {
		return environment.codepipeline.pollForThirdPartyJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline poll-for-third-party-jobs")
				.argument("action-type-id", actionTypeId?.toString())
				.argument("max-batch-size", maxBatchSize?.toString())
	}

}


fun AWSCodePipelineFunctions.putActionRevision(init: (AWSCodePipelinePutActionRevisionCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.PutActionRevisionResult {
	return this.block.declare(AWSCodePipelinePutActionRevisionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.PutActionRevisionResult
}

@Generated
class AWSCodePipelinePutActionRevisionCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.PutActionRevisionRequest, com.amazonaws.services.codepipeline.model.PutActionRevisionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.PutActionRevisionResult {
	  return com.amazonaws.services.codepipeline.model.PutActionRevisionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.PutActionRevisionResult {
		return environment.codepipeline.putActionRevision(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline put-action-revision")
				.argument("pipeline-name", pipelineName)
				.argument("stage-name", stageName)
				.argument("action-name", actionName)
				.argument("action-revision", actionRevision?.toString())
	}

}


fun AWSCodePipelineFunctions.putApprovalResult(init: (AWSCodePipelinePutApprovalResultCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.PutApprovalResultResult {
	return this.block.declare(AWSCodePipelinePutApprovalResultCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.PutApprovalResultResult
}

@Generated
class AWSCodePipelinePutApprovalResultCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.PutApprovalResultRequest, com.amazonaws.services.codepipeline.model.PutApprovalResultResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.PutApprovalResultResult {
	  return com.amazonaws.services.codepipeline.model.PutApprovalResultResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.PutApprovalResultResult {
		return environment.codepipeline.putApprovalResult(build())
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


fun AWSCodePipelineFunctions.putJobFailureResult(init: (AWSCodePipelinePutJobFailureResultCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.PutJobFailureResultResult {
	return this.block.declare(AWSCodePipelinePutJobFailureResultCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.PutJobFailureResultResult
}

@Generated
class AWSCodePipelinePutJobFailureResultCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest, com.amazonaws.services.codepipeline.model.PutJobFailureResultResult> {

	var jobId: String? = null
	var failureDetails: com.amazonaws.services.codepipeline.model.FailureDetails? = null

	override fun build(): com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest {
		val input = com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest()
		input.setJobId(this.jobId)
		input.setFailureDetails(this.failureDetails)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.PutJobFailureResultResult {
	  return com.amazonaws.services.codepipeline.model.PutJobFailureResultResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.PutJobFailureResultResult {
		return environment.codepipeline.putJobFailureResult(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline put-job-failure-result")
				.argument("job-id", jobId)
				.argument("failure-details", failureDetails?.toString())
	}

}


fun AWSCodePipelineFunctions.putJobSuccessResult(init: (AWSCodePipelinePutJobSuccessResultCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.PutJobSuccessResultResult {
	return this.block.declare(AWSCodePipelinePutJobSuccessResultCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.PutJobSuccessResultResult
}

@Generated
class AWSCodePipelinePutJobSuccessResultCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest, com.amazonaws.services.codepipeline.model.PutJobSuccessResultResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.PutJobSuccessResultResult {
	  return com.amazonaws.services.codepipeline.model.PutJobSuccessResultResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.PutJobSuccessResultResult {
		return environment.codepipeline.putJobSuccessResult(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline put-job-success-result")
				.argument("job-id", jobId)
				.argument("current-revision", currentRevision?.toString())
				.argument("continuation-token", continuationToken)
				.argument("execution-details", executionDetails?.toString())
	}

}


fun AWSCodePipelineFunctions.putThirdPartyJobFailureResult(init: (AWSCodePipelinePutThirdPartyJobFailureResultCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultResult {
	return this.block.declare(AWSCodePipelinePutThirdPartyJobFailureResultCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultResult
}

@Generated
class AWSCodePipelinePutThirdPartyJobFailureResultCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest, com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultResult {
	  return com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultResult {
		return environment.codepipeline.putThirdPartyJobFailureResult(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline put-third-party-job-failure-result")
				.argument("job-id", jobId)
				.argument("client-token", clientToken)
				.argument("failure-details", failureDetails?.toString())
	}

}


fun AWSCodePipelineFunctions.putThirdPartyJobSuccessResult(init: (AWSCodePipelinePutThirdPartyJobSuccessResultCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultResult {
	return this.block.declare(AWSCodePipelinePutThirdPartyJobSuccessResultCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultResult
}

@Generated
class AWSCodePipelinePutThirdPartyJobSuccessResultCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest, com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultResult {
	  return com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultResult {
		return environment.codepipeline.putThirdPartyJobSuccessResult(build())
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


fun AWSCodePipelineFunctions.retryStageExecution(init: (AWSCodePipelineRetryStageExecutionCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.RetryStageExecutionResult {
	return this.block.declare(AWSCodePipelineRetryStageExecutionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.RetryStageExecutionResult
}

@Generated
class AWSCodePipelineRetryStageExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest, com.amazonaws.services.codepipeline.model.RetryStageExecutionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.RetryStageExecutionResult {
	  return com.amazonaws.services.codepipeline.model.RetryStageExecutionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.RetryStageExecutionResult {
		return environment.codepipeline.retryStageExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline retry-stage-execution")
				.argument("pipeline-name", pipelineName)
				.argument("stage-name", stageName)
				.argument("pipeline-execution-id", pipelineExecutionId)
				.argument("retry-mode", retryMode?.toString())
	}

}


fun AWSCodePipelineFunctions.startPipelineExecution(init: (AWSCodePipelineStartPipelineExecutionCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.StartPipelineExecutionResult {
	return this.block.declare(AWSCodePipelineStartPipelineExecutionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.StartPipelineExecutionResult
}

@Generated
class AWSCodePipelineStartPipelineExecutionCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest, com.amazonaws.services.codepipeline.model.StartPipelineExecutionResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest {
		val input = com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.StartPipelineExecutionResult {
	  return com.amazonaws.services.codepipeline.model.StartPipelineExecutionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.StartPipelineExecutionResult {
		return environment.codepipeline.startPipelineExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline start-pipeline-execution")
				.argument("name", name)
	}

}


fun AWSCodePipelineFunctions.updatePipeline(init: (AWSCodePipelineUpdatePipelineCommand.() -> Unit)? = null): com.amazonaws.services.codepipeline.model.UpdatePipelineResult {
	return this.block.declare(AWSCodePipelineUpdatePipelineCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codepipeline.model.UpdatePipelineResult
}

@Generated
class AWSCodePipelineUpdatePipelineCommand() : AmazonWebServiceCommand<com.amazonaws.services.codepipeline.model.UpdatePipelineRequest, com.amazonaws.services.codepipeline.model.UpdatePipelineResult> {

	var pipeline: com.amazonaws.services.codepipeline.model.PipelineDeclaration? = null

	override fun build(): com.amazonaws.services.codepipeline.model.UpdatePipelineRequest {
		val input = com.amazonaws.services.codepipeline.model.UpdatePipelineRequest()
		input.setPipeline(this.pipeline)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codepipeline.model.UpdatePipelineResult {
	  return com.amazonaws.services.codepipeline.model.UpdatePipelineResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codepipeline.model.UpdatePipelineResult {
		return environment.codepipeline.updatePipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codepipeline update-pipeline")
				.argument("pipeline", pipeline?.toString())
	}

}
