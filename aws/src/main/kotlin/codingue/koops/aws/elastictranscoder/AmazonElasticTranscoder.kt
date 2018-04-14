
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.elastictranscoder

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.elastictranscoder.*
import com.amazonaws.services.elastictranscoder.model.*

var codingue.koops.core.Environment.elastictranscoder: AmazonElasticTranscoder
	get() {
		var service = this.capabilities["aws-elastictranscoder"]
		if (service == null) {
			service = AmazonElasticTranscoderClientBuilder.standard().build()
			this.capabilities["aws-elastictranscoder"] = service
		}
		return service as AmazonElasticTranscoder
	}
	set(elastictranscoder) {
		this.capabilities["aws-elastictranscoder"] = elastictranscoder
	}

@Generated
class AmazonElasticTranscoderFunctions(val block: Block)

infix fun <T> AwsContinuation.elastictranscoder(init: AmazonElasticTranscoderFunctions.() -> T): T {
	return AmazonElasticTranscoderFunctions(shell).run(init)
}

			

fun AmazonElasticTranscoderFunctions.cancelJob(id: String, init: AmazonElasticTranscoderCancelJobCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.CancelJobResult {
	return this.block.declare(AmazonElasticTranscoderCancelJobCommand(id).apply(init)) as com.amazonaws.services.elastictranscoder.model.CancelJobResult
}

@Generated
class AmazonElasticTranscoderCancelJobCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.CancelJobRequest, com.amazonaws.services.elastictranscoder.model.CancelJobResult> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.CancelJobRequest {
		val input = com.amazonaws.services.elastictranscoder.model.CancelJobRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.CancelJobResult {
	  return com.amazonaws.services.elastictranscoder.model.CancelJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.CancelJobResult {
		return environment.elastictranscoder.cancelJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder cancel-job")
				.argument("id", id)
	}

}


fun AmazonElasticTranscoderFunctions.createJob(pipelineId: String, init: AmazonElasticTranscoderCreateJobCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.CreateJobResult {
	return this.block.declare(AmazonElasticTranscoderCreateJobCommand(pipelineId).apply(init)) as com.amazonaws.services.elastictranscoder.model.CreateJobResult
}

@Generated
class AmazonElasticTranscoderCreateJobCommand(val pipelineId: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.CreateJobRequest, com.amazonaws.services.elastictranscoder.model.CreateJobResult> {

	var input: com.amazonaws.services.elastictranscoder.model.JobInput? = null
	var inputs: List<com.amazonaws.services.elastictranscoder.model.JobInput>? = null
	var output: com.amazonaws.services.elastictranscoder.model.CreateJobOutput? = null
	var outputs: List<com.amazonaws.services.elastictranscoder.model.CreateJobOutput>? = null
	var outputKeyPrefix: String? = null
	var playlists: List<com.amazonaws.services.elastictranscoder.model.CreateJobPlaylist>? = null
	var userMetadata: Map<String, String>? = null

	override fun build(): com.amazonaws.services.elastictranscoder.model.CreateJobRequest {
		val input = com.amazonaws.services.elastictranscoder.model.CreateJobRequest()
		input.setPipelineId(this.pipelineId)
		input.setInput(this.input)
		input.setInputs(this.inputs)
		input.setOutput(this.output)
		input.setOutputs(this.outputs)
		input.setOutputKeyPrefix(this.outputKeyPrefix)
		input.setPlaylists(this.playlists)
		input.setUserMetadata(this.userMetadata)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.CreateJobResult {
	  return com.amazonaws.services.elastictranscoder.model.CreateJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.CreateJobResult {
		return environment.elastictranscoder.createJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder create-job")
				.argument("pipeline-id", pipelineId)
				.argument("input", input?.toString())
				.argument("inputs", inputs?.toString())
				.argument("output", output?.toString())
				.argument("outputs", outputs?.toString())
				.argument("output-key-prefix", outputKeyPrefix)
				.argument("playlists", playlists?.toString())
				.argument("user-metadata", userMetadata?.toString())
	}

}


fun AmazonElasticTranscoderFunctions.createPipeline(name: String, inputBucket: String, role: String, init: AmazonElasticTranscoderCreatePipelineCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.CreatePipelineResult {
	return this.block.declare(AmazonElasticTranscoderCreatePipelineCommand(name, inputBucket, role).apply(init)) as com.amazonaws.services.elastictranscoder.model.CreatePipelineResult
}

@Generated
class AmazonElasticTranscoderCreatePipelineCommand(val name: String, val inputBucket: String, val role: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.CreatePipelineRequest, com.amazonaws.services.elastictranscoder.model.CreatePipelineResult> {

	var outputBucket: String? = null
	var awsKmsKeyArn: String? = null
	var notifications: com.amazonaws.services.elastictranscoder.model.Notifications? = null
	var contentConfig: com.amazonaws.services.elastictranscoder.model.PipelineOutputConfig? = null
	var thumbnailConfig: com.amazonaws.services.elastictranscoder.model.PipelineOutputConfig? = null

	override fun build(): com.amazonaws.services.elastictranscoder.model.CreatePipelineRequest {
		val input = com.amazonaws.services.elastictranscoder.model.CreatePipelineRequest()
		input.setName(this.name)
		input.setInputBucket(this.inputBucket)
		input.setOutputBucket(this.outputBucket)
		input.setRole(this.role)
		input.setAwsKmsKeyArn(this.awsKmsKeyArn)
		input.setNotifications(this.notifications)
		input.setContentConfig(this.contentConfig)
		input.setThumbnailConfig(this.thumbnailConfig)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.CreatePipelineResult {
	  return com.amazonaws.services.elastictranscoder.model.CreatePipelineResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.CreatePipelineResult {
		return environment.elastictranscoder.createPipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder create-pipeline")
				.argument("name", name)
				.argument("input-bucket", inputBucket)
				.argument("output-bucket", outputBucket)
				.argument("role", role)
				.argument("aws-kms-key-arn", awsKmsKeyArn)
				.argument("notifications", notifications?.toString())
				.argument("content-config", contentConfig?.toString())
				.argument("thumbnail-config", thumbnailConfig?.toString())
	}

}


fun AmazonElasticTranscoderFunctions.createPreset(name: String, container: String, init: AmazonElasticTranscoderCreatePresetCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.CreatePresetResult {
	return this.block.declare(AmazonElasticTranscoderCreatePresetCommand(name, container).apply(init)) as com.amazonaws.services.elastictranscoder.model.CreatePresetResult
}

@Generated
class AmazonElasticTranscoderCreatePresetCommand(val name: String, val container: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.CreatePresetRequest, com.amazonaws.services.elastictranscoder.model.CreatePresetResult> {

	var description: String? = null
	var video: com.amazonaws.services.elastictranscoder.model.VideoParameters? = null
	var audio: com.amazonaws.services.elastictranscoder.model.AudioParameters? = null
	var thumbnails: com.amazonaws.services.elastictranscoder.model.Thumbnails? = null

	override fun build(): com.amazonaws.services.elastictranscoder.model.CreatePresetRequest {
		val input = com.amazonaws.services.elastictranscoder.model.CreatePresetRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setContainer(this.container)
		input.setVideo(this.video)
		input.setAudio(this.audio)
		input.setThumbnails(this.thumbnails)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.CreatePresetResult {
	  return com.amazonaws.services.elastictranscoder.model.CreatePresetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.CreatePresetResult {
		return environment.elastictranscoder.createPreset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder create-preset")
				.argument("name", name)
				.argument("description", description)
				.argument("container", container)
				.argument("video", video?.toString())
				.argument("audio", audio?.toString())
				.argument("thumbnails", thumbnails?.toString())
	}

}


fun AmazonElasticTranscoderFunctions.deletePipeline(id: String, init: AmazonElasticTranscoderDeletePipelineCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.DeletePipelineResult {
	return this.block.declare(AmazonElasticTranscoderDeletePipelineCommand(id).apply(init)) as com.amazonaws.services.elastictranscoder.model.DeletePipelineResult
}

@Generated
class AmazonElasticTranscoderDeletePipelineCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest, com.amazonaws.services.elastictranscoder.model.DeletePipelineResult> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest {
		val input = com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.DeletePipelineResult {
	  return com.amazonaws.services.elastictranscoder.model.DeletePipelineResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.DeletePipelineResult {
		return environment.elastictranscoder.deletePipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder delete-pipeline")
				.argument("id", id)
	}

}


fun AmazonElasticTranscoderFunctions.deletePreset(id: String, init: AmazonElasticTranscoderDeletePresetCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.DeletePresetResult {
	return this.block.declare(AmazonElasticTranscoderDeletePresetCommand(id).apply(init)) as com.amazonaws.services.elastictranscoder.model.DeletePresetResult
}

@Generated
class AmazonElasticTranscoderDeletePresetCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.DeletePresetRequest, com.amazonaws.services.elastictranscoder.model.DeletePresetResult> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.DeletePresetRequest {
		val input = com.amazonaws.services.elastictranscoder.model.DeletePresetRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.DeletePresetResult {
	  return com.amazonaws.services.elastictranscoder.model.DeletePresetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.DeletePresetResult {
		return environment.elastictranscoder.deletePreset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder delete-preset")
				.argument("id", id)
	}

}


fun AmazonElasticTranscoderFunctions.listJobsByPipeline(pipelineId: String, init: AmazonElasticTranscoderListJobsByPipelineCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineResult {
	return this.block.declare(AmazonElasticTranscoderListJobsByPipelineCommand(pipelineId).apply(init)) as com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineResult
}

@Generated
class AmazonElasticTranscoderListJobsByPipelineCommand(val pipelineId: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest, com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineResult> {

	var ascending: String? = null
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest {
		val input = com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest()
		input.setPipelineId(this.pipelineId)
		input.setAscending(this.ascending)
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineResult {
	  return com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineResult {
		return environment.elastictranscoder.listJobsByPipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder list-jobs-by-pipeline")
				.argument("pipeline-id", pipelineId)
				.argument("ascending", ascending)
				.argument("page-token", pageToken)
	}

}


fun AmazonElasticTranscoderFunctions.listJobsByStatus(status: String, init: AmazonElasticTranscoderListJobsByStatusCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.ListJobsByStatusResult {
	return this.block.declare(AmazonElasticTranscoderListJobsByStatusCommand(status).apply(init)) as com.amazonaws.services.elastictranscoder.model.ListJobsByStatusResult
}

@Generated
class AmazonElasticTranscoderListJobsByStatusCommand(val status: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest, com.amazonaws.services.elastictranscoder.model.ListJobsByStatusResult> {

	var ascending: String? = null
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest {
		val input = com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest()
		input.setStatus(this.status)
		input.setAscending(this.ascending)
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.ListJobsByStatusResult {
	  return com.amazonaws.services.elastictranscoder.model.ListJobsByStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.ListJobsByStatusResult {
		return environment.elastictranscoder.listJobsByStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder list-jobs-by-status")
				.argument("status", status)
				.argument("ascending", ascending)
				.argument("page-token", pageToken)
	}

}


fun AmazonElasticTranscoderFunctions.listPipelines(init: AmazonElasticTranscoderListPipelinesCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.ListPipelinesResult {
	return this.block.declare(AmazonElasticTranscoderListPipelinesCommand().apply(init)) as com.amazonaws.services.elastictranscoder.model.ListPipelinesResult
}

@Generated
class AmazonElasticTranscoderListPipelinesCommand() : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest, com.amazonaws.services.elastictranscoder.model.ListPipelinesResult> {

	var ascending: String? = null
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest {
		val input = com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest()
		input.setAscending(this.ascending)
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.ListPipelinesResult {
	  return com.amazonaws.services.elastictranscoder.model.ListPipelinesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.ListPipelinesResult {
		return environment.elastictranscoder.listPipelines(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder list-pipelines")
				.argument("ascending", ascending)
				.argument("page-token", pageToken)
	}

}


fun AmazonElasticTranscoderFunctions.listPresets(init: AmazonElasticTranscoderListPresetsCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.ListPresetsResult {
	return this.block.declare(AmazonElasticTranscoderListPresetsCommand().apply(init)) as com.amazonaws.services.elastictranscoder.model.ListPresetsResult
}

@Generated
class AmazonElasticTranscoderListPresetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.ListPresetsRequest, com.amazonaws.services.elastictranscoder.model.ListPresetsResult> {

	var ascending: String? = null
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.elastictranscoder.model.ListPresetsRequest {
		val input = com.amazonaws.services.elastictranscoder.model.ListPresetsRequest()
		input.setAscending(this.ascending)
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.ListPresetsResult {
	  return com.amazonaws.services.elastictranscoder.model.ListPresetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.ListPresetsResult {
		return environment.elastictranscoder.listPresets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder list-presets")
				.argument("ascending", ascending)
				.argument("page-token", pageToken)
	}

}


fun AmazonElasticTranscoderFunctions.readJob(id: String, init: AmazonElasticTranscoderReadJobCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.ReadJobResult {
	return this.block.declare(AmazonElasticTranscoderReadJobCommand(id).apply(init)) as com.amazonaws.services.elastictranscoder.model.ReadJobResult
}

@Generated
class AmazonElasticTranscoderReadJobCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.ReadJobRequest, com.amazonaws.services.elastictranscoder.model.ReadJobResult> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.ReadJobRequest {
		val input = com.amazonaws.services.elastictranscoder.model.ReadJobRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.ReadJobResult {
	  return com.amazonaws.services.elastictranscoder.model.ReadJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.ReadJobResult {
		return environment.elastictranscoder.readJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder read-job")
				.argument("id", id)
	}

}


fun AmazonElasticTranscoderFunctions.readPipeline(id: String, init: AmazonElasticTranscoderReadPipelineCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.ReadPipelineResult {
	return this.block.declare(AmazonElasticTranscoderReadPipelineCommand(id).apply(init)) as com.amazonaws.services.elastictranscoder.model.ReadPipelineResult
}

@Generated
class AmazonElasticTranscoderReadPipelineCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest, com.amazonaws.services.elastictranscoder.model.ReadPipelineResult> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest {
		val input = com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.ReadPipelineResult {
	  return com.amazonaws.services.elastictranscoder.model.ReadPipelineResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.ReadPipelineResult {
		return environment.elastictranscoder.readPipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder read-pipeline")
				.argument("id", id)
	}

}


fun AmazonElasticTranscoderFunctions.readPreset(id: String, init: AmazonElasticTranscoderReadPresetCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.ReadPresetResult {
	return this.block.declare(AmazonElasticTranscoderReadPresetCommand(id).apply(init)) as com.amazonaws.services.elastictranscoder.model.ReadPresetResult
}

@Generated
class AmazonElasticTranscoderReadPresetCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.ReadPresetRequest, com.amazonaws.services.elastictranscoder.model.ReadPresetResult> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.ReadPresetRequest {
		val input = com.amazonaws.services.elastictranscoder.model.ReadPresetRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.ReadPresetResult {
	  return com.amazonaws.services.elastictranscoder.model.ReadPresetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.ReadPresetResult {
		return environment.elastictranscoder.readPreset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder read-preset")
				.argument("id", id)
	}

}


fun AmazonElasticTranscoderFunctions.testRole(role: String, inputBucket: String, outputBucket: String, topics: List<String>, init: AmazonElasticTranscoderTestRoleCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.TestRoleResult {
	return this.block.declare(AmazonElasticTranscoderTestRoleCommand(role, inputBucket, outputBucket, topics).apply(init)) as com.amazonaws.services.elastictranscoder.model.TestRoleResult
}

@Generated
class AmazonElasticTranscoderTestRoleCommand(val role: String, val inputBucket: String, val outputBucket: String, val topics: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.TestRoleRequest, com.amazonaws.services.elastictranscoder.model.TestRoleResult> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.TestRoleRequest {
		val input = com.amazonaws.services.elastictranscoder.model.TestRoleRequest()
		input.setRole(this.role)
		input.setInputBucket(this.inputBucket)
		input.setOutputBucket(this.outputBucket)
		input.setTopics(this.topics)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.TestRoleResult {
	  return com.amazonaws.services.elastictranscoder.model.TestRoleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.TestRoleResult {
		return environment.elastictranscoder.testRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder test-role")
				.argument("role", role)
				.argument("input-bucket", inputBucket)
				.argument("output-bucket", outputBucket)
				.argument("topics", topics.toString())
	}

}


fun AmazonElasticTranscoderFunctions.updatePipeline(id: String, init: AmazonElasticTranscoderUpdatePipelineCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.UpdatePipelineResult {
	return this.block.declare(AmazonElasticTranscoderUpdatePipelineCommand(id).apply(init)) as com.amazonaws.services.elastictranscoder.model.UpdatePipelineResult
}

@Generated
class AmazonElasticTranscoderUpdatePipelineCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.UpdatePipelineRequest, com.amazonaws.services.elastictranscoder.model.UpdatePipelineResult> {

	var name: String? = null
	var inputBucket: String? = null
	var role: String? = null
	var awsKmsKeyArn: String? = null
	var notifications: com.amazonaws.services.elastictranscoder.model.Notifications? = null
	var contentConfig: com.amazonaws.services.elastictranscoder.model.PipelineOutputConfig? = null
	var thumbnailConfig: com.amazonaws.services.elastictranscoder.model.PipelineOutputConfig? = null

	override fun build(): com.amazonaws.services.elastictranscoder.model.UpdatePipelineRequest {
		val input = com.amazonaws.services.elastictranscoder.model.UpdatePipelineRequest()
		input.setId(this.id)
		input.setName(this.name)
		input.setInputBucket(this.inputBucket)
		input.setRole(this.role)
		input.setAwsKmsKeyArn(this.awsKmsKeyArn)
		input.setNotifications(this.notifications)
		input.setContentConfig(this.contentConfig)
		input.setThumbnailConfig(this.thumbnailConfig)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.UpdatePipelineResult {
	  return com.amazonaws.services.elastictranscoder.model.UpdatePipelineResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.UpdatePipelineResult {
		return environment.elastictranscoder.updatePipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder update-pipeline")
				.argument("id", id)
				.argument("name", name)
				.argument("input-bucket", inputBucket)
				.argument("role", role)
				.argument("aws-kms-key-arn", awsKmsKeyArn)
				.argument("notifications", notifications?.toString())
				.argument("content-config", contentConfig?.toString())
				.argument("thumbnail-config", thumbnailConfig?.toString())
	}

}


fun AmazonElasticTranscoderFunctions.updatePipelineNotifications(id: String, notifications: com.amazonaws.services.elastictranscoder.model.Notifications, init: AmazonElasticTranscoderUpdatePipelineNotificationsCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsResult {
	return this.block.declare(AmazonElasticTranscoderUpdatePipelineNotificationsCommand(id, notifications).apply(init)) as com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsResult
}

@Generated
class AmazonElasticTranscoderUpdatePipelineNotificationsCommand(val id: String, val notifications: com.amazonaws.services.elastictranscoder.model.Notifications) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest, com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsResult> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest {
		val input = com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest()
		input.setId(this.id)
		input.setNotifications(this.notifications)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsResult {
	  return com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsResult {
		return environment.elastictranscoder.updatePipelineNotifications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder update-pipeline-notifications")
				.argument("id", id)
				.argument("notifications", notifications.toString())
	}

}


fun AmazonElasticTranscoderFunctions.updatePipelineStatus(id: String, status: String, init: AmazonElasticTranscoderUpdatePipelineStatusCommand.() -> Unit): com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusResult {
	return this.block.declare(AmazonElasticTranscoderUpdatePipelineStatusCommand(id, status).apply(init)) as com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusResult
}

@Generated
class AmazonElasticTranscoderUpdatePipelineStatusCommand(val id: String, val status: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest, com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusResult> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest {
		val input = com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest()
		input.setId(this.id)
		input.setStatus(this.status)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusResult {
	  return com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusResult {
		return environment.elastictranscoder.updatePipelineStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder update-pipeline-status")
				.argument("id", id)
				.argument("status", status)
	}

}
