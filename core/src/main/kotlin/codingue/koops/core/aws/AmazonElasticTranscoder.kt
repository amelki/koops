
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder
import com.amazonaws.services.elastictranscoder.model.*

var codingue.koops.core.Environment.elastictranscoder: AmazonElasticTranscoder
	get() = this.capabilities[AmazonElasticTranscoder::class.java.name] as AmazonElasticTranscoder
	set(elastictranscoder) {
		this.capabilities[AmazonElasticTranscoder::class.java.name] = elastictranscoder
	}

@Generated
class AmazonElasticTranscoderFunctions(val block: Block)

infix fun AwsContinuation.elastictranscoder(init: AmazonElasticTranscoderFunctions.() -> Unit) {
	AmazonElasticTranscoderFunctions(shell).apply(init)
}

			

fun AmazonElasticTranscoderFunctions.cancelJob(id: String, init: AmazonElasticTranscoderCancelJobCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderCancelJobCommand(id).apply(init))
}

@Generated
class AmazonElasticTranscoderCancelJobCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.CancelJobRequest> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.CancelJobRequest {
		val input = com.amazonaws.services.elastictranscoder.model.CancelJobRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.cancelJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder cancel-job")
				.argument("id", id)
	}

}


fun AmazonElasticTranscoderFunctions.createJob(pipelineId: String, init: AmazonElasticTranscoderCreateJobCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderCreateJobCommand(pipelineId).apply(init))
}

@Generated
class AmazonElasticTranscoderCreateJobCommand(val pipelineId: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.CreateJobRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.createJob(build())
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


fun AmazonElasticTranscoderFunctions.createPipeline(name: String, inputBucket: String, role: String, init: AmazonElasticTranscoderCreatePipelineCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderCreatePipelineCommand(name, inputBucket, role).apply(init))
}

@Generated
class AmazonElasticTranscoderCreatePipelineCommand(val name: String, val inputBucket: String, val role: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.CreatePipelineRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.createPipeline(build())
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


fun AmazonElasticTranscoderFunctions.createPreset(name: String, container: String, init: AmazonElasticTranscoderCreatePresetCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderCreatePresetCommand(name, container).apply(init))
}

@Generated
class AmazonElasticTranscoderCreatePresetCommand(val name: String, val container: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.CreatePresetRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.createPreset(build())
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


fun AmazonElasticTranscoderFunctions.deletePipeline(id: String, init: AmazonElasticTranscoderDeletePipelineCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderDeletePipelineCommand(id).apply(init))
}

@Generated
class AmazonElasticTranscoderDeletePipelineCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest {
		val input = com.amazonaws.services.elastictranscoder.model.DeletePipelineRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.deletePipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder delete-pipeline")
				.argument("id", id)
	}

}


fun AmazonElasticTranscoderFunctions.deletePreset(id: String, init: AmazonElasticTranscoderDeletePresetCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderDeletePresetCommand(id).apply(init))
}

@Generated
class AmazonElasticTranscoderDeletePresetCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.DeletePresetRequest> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.DeletePresetRequest {
		val input = com.amazonaws.services.elastictranscoder.model.DeletePresetRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.deletePreset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder delete-preset")
				.argument("id", id)
	}

}


fun AmazonElasticTranscoderFunctions.listJobsByPipeline(pipelineId: String, init: AmazonElasticTranscoderListJobsByPipelineCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderListJobsByPipelineCommand(pipelineId).apply(init))
}

@Generated
class AmazonElasticTranscoderListJobsByPipelineCommand(val pipelineId: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest> {

	var ascending: String? = null
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest {
		val input = com.amazonaws.services.elastictranscoder.model.ListJobsByPipelineRequest()
		input.setPipelineId(this.pipelineId)
		input.setAscending(this.ascending)
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.listJobsByPipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder list-jobs-by-pipeline")
				.argument("pipeline-id", pipelineId)
				.argument("ascending", ascending)
				.argument("page-token", pageToken)
	}

}


fun AmazonElasticTranscoderFunctions.listJobsByStatus(status: String, init: AmazonElasticTranscoderListJobsByStatusCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderListJobsByStatusCommand(status).apply(init))
}

@Generated
class AmazonElasticTranscoderListJobsByStatusCommand(val status: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest> {

	var ascending: String? = null
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest {
		val input = com.amazonaws.services.elastictranscoder.model.ListJobsByStatusRequest()
		input.setStatus(this.status)
		input.setAscending(this.ascending)
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.listJobsByStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder list-jobs-by-status")
				.argument("status", status)
				.argument("ascending", ascending)
				.argument("page-token", pageToken)
	}

}


fun AmazonElasticTranscoderFunctions.listPipelines(init: AmazonElasticTranscoderListPipelinesCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderListPipelinesCommand().apply(init))
}

@Generated
class AmazonElasticTranscoderListPipelinesCommand() : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest> {

	var ascending: String? = null
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest {
		val input = com.amazonaws.services.elastictranscoder.model.ListPipelinesRequest()
		input.setAscending(this.ascending)
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.listPipelines(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder list-pipelines")
				.argument("ascending", ascending)
				.argument("page-token", pageToken)
	}

}


fun AmazonElasticTranscoderFunctions.listPresets(init: AmazonElasticTranscoderListPresetsCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderListPresetsCommand().apply(init))
}

@Generated
class AmazonElasticTranscoderListPresetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.ListPresetsRequest> {

	var ascending: String? = null
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.elastictranscoder.model.ListPresetsRequest {
		val input = com.amazonaws.services.elastictranscoder.model.ListPresetsRequest()
		input.setAscending(this.ascending)
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.listPresets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder list-presets")
				.argument("ascending", ascending)
				.argument("page-token", pageToken)
	}

}


fun AmazonElasticTranscoderFunctions.readJob(id: String, init: AmazonElasticTranscoderReadJobCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderReadJobCommand(id).apply(init))
}

@Generated
class AmazonElasticTranscoderReadJobCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.ReadJobRequest> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.ReadJobRequest {
		val input = com.amazonaws.services.elastictranscoder.model.ReadJobRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.readJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder read-job")
				.argument("id", id)
	}

}


fun AmazonElasticTranscoderFunctions.readPipeline(id: String, init: AmazonElasticTranscoderReadPipelineCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderReadPipelineCommand(id).apply(init))
}

@Generated
class AmazonElasticTranscoderReadPipelineCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest {
		val input = com.amazonaws.services.elastictranscoder.model.ReadPipelineRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.readPipeline(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder read-pipeline")
				.argument("id", id)
	}

}


fun AmazonElasticTranscoderFunctions.readPreset(id: String, init: AmazonElasticTranscoderReadPresetCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderReadPresetCommand(id).apply(init))
}

@Generated
class AmazonElasticTranscoderReadPresetCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.ReadPresetRequest> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.ReadPresetRequest {
		val input = com.amazonaws.services.elastictranscoder.model.ReadPresetRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.readPreset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder read-preset")
				.argument("id", id)
	}

}


fun AmazonElasticTranscoderFunctions.testRole(role: String, inputBucket: String, outputBucket: String, topics: List<String>, init: AmazonElasticTranscoderTestRoleCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderTestRoleCommand(role, inputBucket, outputBucket, topics).apply(init))
}

@Generated
class AmazonElasticTranscoderTestRoleCommand(val role: String, val inputBucket: String, val outputBucket: String, val topics: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.TestRoleRequest> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.TestRoleRequest {
		val input = com.amazonaws.services.elastictranscoder.model.TestRoleRequest()
		input.setRole(this.role)
		input.setInputBucket(this.inputBucket)
		input.setOutputBucket(this.outputBucket)
		input.setTopics(this.topics)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.testRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder test-role")
				.argument("role", role)
				.argument("input-bucket", inputBucket)
				.argument("output-bucket", outputBucket)
				.argument("topics", topics.toString())
	}

}


fun AmazonElasticTranscoderFunctions.updatePipeline(id: String, init: AmazonElasticTranscoderUpdatePipelineCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderUpdatePipelineCommand(id).apply(init))
}

@Generated
class AmazonElasticTranscoderUpdatePipelineCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.UpdatePipelineRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.updatePipeline(build())
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


fun AmazonElasticTranscoderFunctions.updatePipelineNotifications(id: String, notifications: com.amazonaws.services.elastictranscoder.model.Notifications, init: AmazonElasticTranscoderUpdatePipelineNotificationsCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderUpdatePipelineNotificationsCommand(id, notifications).apply(init))
}

@Generated
class AmazonElasticTranscoderUpdatePipelineNotificationsCommand(val id: String, val notifications: com.amazonaws.services.elastictranscoder.model.Notifications) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest {
		val input = com.amazonaws.services.elastictranscoder.model.UpdatePipelineNotificationsRequest()
		input.setId(this.id)
		input.setNotifications(this.notifications)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.updatePipelineNotifications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder update-pipeline-notifications")
				.argument("id", id)
				.argument("notifications", notifications.toString())
	}

}


fun AmazonElasticTranscoderFunctions.updatePipelineStatus(id: String, status: String, init: AmazonElasticTranscoderUpdatePipelineStatusCommand.() -> Unit) {
	this.block.declare(AmazonElasticTranscoderUpdatePipelineStatusCommand(id, status).apply(init))
}

@Generated
class AmazonElasticTranscoderUpdatePipelineStatusCommand(val id: String, val status: String) : AmazonWebServiceCommand<com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest> {



	override fun build(): com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest {
		val input = com.amazonaws.services.elastictranscoder.model.UpdatePipelineStatusRequest()
		input.setId(this.id)
		input.setStatus(this.status)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elastictranscoder.updatePipelineStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elastictranscoder update-pipeline-status")
				.argument("id", id)
				.argument("status", status)
	}

}
