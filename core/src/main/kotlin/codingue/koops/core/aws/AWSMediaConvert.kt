
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.mediaconvert.AWSMediaConvert
import com.amazonaws.services.mediaconvert.model.*

var codingue.koops.core.Environment.mediaconvert: AWSMediaConvert
	get() = this.capabilities[AWSMediaConvert::class.java.name] as AWSMediaConvert
	set(mediaconvert) {
		this.capabilities[AWSMediaConvert::class.java.name] = mediaconvert
	}

@Generated
class AWSMediaConvertFunctions(val block: Block)

infix fun AwsContinuation.mediaconvert(init: AWSMediaConvertFunctions.() -> Unit) {
	AWSMediaConvertFunctions(shell).apply(init)
}

			

fun AWSMediaConvertFunctions.cancelJob(id: String, init: AWSMediaConvertCancelJobCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertCancelJobCommand(id).apply(init))
}

@Generated
class AWSMediaConvertCancelJobCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.CancelJobRequest> {



	override fun build(): com.amazonaws.services.mediaconvert.model.CancelJobRequest {
		val input = com.amazonaws.services.mediaconvert.model.CancelJobRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.cancelJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert cancel-job")
				.argument("id", id)
	}

}


fun AWSMediaConvertFunctions.createJob(init: AWSMediaConvertCreateJobCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertCreateJobCommand().apply(init))
}

@Generated
class AWSMediaConvertCreateJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.CreateJobRequest> {

	var clientRequestToken: String? = null
	var jobTemplate: String? = null
	var queue: String? = null
	var role: String? = null
	var settings: com.amazonaws.services.mediaconvert.model.JobSettings? = null
	var userMetadata: Map<String, String>? = null

	override fun build(): com.amazonaws.services.mediaconvert.model.CreateJobRequest {
		val input = com.amazonaws.services.mediaconvert.model.CreateJobRequest()
		input.setClientRequestToken(this.clientRequestToken)
		input.setJobTemplate(this.jobTemplate)
		input.setQueue(this.queue)
		input.setRole(this.role)
		input.setSettings(this.settings)
		input.setUserMetadata(this.userMetadata)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.createJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert create-job")
				.argument("client-request-token", clientRequestToken)
				.argument("job-template", jobTemplate)
				.argument("queue", queue)
				.argument("role", role)
				.argument("settings", settings?.toString())
				.argument("user-metadata", userMetadata?.toString())
	}

}


fun AWSMediaConvertFunctions.createJobTemplate(init: AWSMediaConvertCreateJobTemplateCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertCreateJobTemplateCommand().apply(init))
}

@Generated
class AWSMediaConvertCreateJobTemplateCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.CreateJobTemplateRequest> {

	var category: String? = null
	var description: String? = null
	var name: String? = null
	var queue: String? = null
	var settings: com.amazonaws.services.mediaconvert.model.JobTemplateSettings? = null

	override fun build(): com.amazonaws.services.mediaconvert.model.CreateJobTemplateRequest {
		val input = com.amazonaws.services.mediaconvert.model.CreateJobTemplateRequest()
		input.setCategory(this.category)
		input.setDescription(this.description)
		input.setName(this.name)
		input.setQueue(this.queue)
		input.setSettings(this.settings)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.createJobTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert create-job-template")
				.argument("category", category)
				.argument("description", description)
				.argument("name", name)
				.argument("queue", queue)
				.argument("settings", settings?.toString())
	}

}


fun AWSMediaConvertFunctions.createPreset(init: AWSMediaConvertCreatePresetCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertCreatePresetCommand().apply(init))
}

@Generated
class AWSMediaConvertCreatePresetCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.CreatePresetRequest> {

	var category: String? = null
	var description: String? = null
	var name: String? = null
	var settings: com.amazonaws.services.mediaconvert.model.PresetSettings? = null

	override fun build(): com.amazonaws.services.mediaconvert.model.CreatePresetRequest {
		val input = com.amazonaws.services.mediaconvert.model.CreatePresetRequest()
		input.setCategory(this.category)
		input.setDescription(this.description)
		input.setName(this.name)
		input.setSettings(this.settings)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.createPreset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert create-preset")
				.argument("category", category)
				.argument("description", description)
				.argument("name", name)
				.argument("settings", settings?.toString())
	}

}


fun AWSMediaConvertFunctions.createQueue(init: AWSMediaConvertCreateQueueCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertCreateQueueCommand().apply(init))
}

@Generated
class AWSMediaConvertCreateQueueCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.CreateQueueRequest> {

	var description: String? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.mediaconvert.model.CreateQueueRequest {
		val input = com.amazonaws.services.mediaconvert.model.CreateQueueRequest()
		input.setDescription(this.description)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.createQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert create-queue")
				.argument("description", description)
				.argument("name", name)
	}

}


fun AWSMediaConvertFunctions.deleteJobTemplate(name: String, init: AWSMediaConvertDeleteJobTemplateCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertDeleteJobTemplateCommand(name).apply(init))
}

@Generated
class AWSMediaConvertDeleteJobTemplateCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest> {



	override fun build(): com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest {
		val input = com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.deleteJobTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert delete-job-template")
				.argument("name", name)
	}

}


fun AWSMediaConvertFunctions.deletePreset(name: String, init: AWSMediaConvertDeletePresetCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertDeletePresetCommand(name).apply(init))
}

@Generated
class AWSMediaConvertDeletePresetCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.DeletePresetRequest> {



	override fun build(): com.amazonaws.services.mediaconvert.model.DeletePresetRequest {
		val input = com.amazonaws.services.mediaconvert.model.DeletePresetRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.deletePreset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert delete-preset")
				.argument("name", name)
	}

}


fun AWSMediaConvertFunctions.deleteQueue(name: String, init: AWSMediaConvertDeleteQueueCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertDeleteQueueCommand(name).apply(init))
}

@Generated
class AWSMediaConvertDeleteQueueCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.DeleteQueueRequest> {



	override fun build(): com.amazonaws.services.mediaconvert.model.DeleteQueueRequest {
		val input = com.amazonaws.services.mediaconvert.model.DeleteQueueRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.deleteQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert delete-queue")
				.argument("name", name)
	}

}


fun AWSMediaConvertFunctions.describeEndpoints(init: AWSMediaConvertDescribeEndpointsCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertDescribeEndpointsCommand().apply(init))
}

@Generated
class AWSMediaConvertDescribeEndpointsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest {
		val input = com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.describeEndpoints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert describe-endpoints")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMediaConvertFunctions.getJob(id: String, init: AWSMediaConvertGetJobCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertGetJobCommand(id).apply(init))
}

@Generated
class AWSMediaConvertGetJobCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.GetJobRequest> {



	override fun build(): com.amazonaws.services.mediaconvert.model.GetJobRequest {
		val input = com.amazonaws.services.mediaconvert.model.GetJobRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.getJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert get-job")
				.argument("id", id)
	}

}


fun AWSMediaConvertFunctions.getJobTemplate(name: String, init: AWSMediaConvertGetJobTemplateCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertGetJobTemplateCommand(name).apply(init))
}

@Generated
class AWSMediaConvertGetJobTemplateCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest> {



	override fun build(): com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest {
		val input = com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.getJobTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert get-job-template")
				.argument("name", name)
	}

}


fun AWSMediaConvertFunctions.getPreset(name: String, init: AWSMediaConvertGetPresetCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertGetPresetCommand(name).apply(init))
}

@Generated
class AWSMediaConvertGetPresetCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.GetPresetRequest> {



	override fun build(): com.amazonaws.services.mediaconvert.model.GetPresetRequest {
		val input = com.amazonaws.services.mediaconvert.model.GetPresetRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.getPreset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert get-preset")
				.argument("name", name)
	}

}


fun AWSMediaConvertFunctions.getQueue(name: String, init: AWSMediaConvertGetQueueCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertGetQueueCommand(name).apply(init))
}

@Generated
class AWSMediaConvertGetQueueCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.GetQueueRequest> {



	override fun build(): com.amazonaws.services.mediaconvert.model.GetQueueRequest {
		val input = com.amazonaws.services.mediaconvert.model.GetQueueRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.getQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert get-queue")
				.argument("name", name)
	}

}


fun AWSMediaConvertFunctions.listJobTemplates(init: AWSMediaConvertListJobTemplatesCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertListJobTemplatesCommand().apply(init))
}

@Generated
class AWSMediaConvertListJobTemplatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.ListJobTemplatesRequest> {

	var category: String? = null
	var listBy: JobTemplateListBy? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var order: Order? = null

	override fun build(): com.amazonaws.services.mediaconvert.model.ListJobTemplatesRequest {
		val input = com.amazonaws.services.mediaconvert.model.ListJobTemplatesRequest()
		input.setCategory(this.category)
		input.setListBy(this.listBy?.toString())
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setOrder(this.order?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.listJobTemplates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert list-job-templates")
				.argument("category", category)
				.argument("list-by", listBy?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("order", order?.toString())
	}

}


fun AWSMediaConvertFunctions.listJobs(init: AWSMediaConvertListJobsCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertListJobsCommand().apply(init))
}

@Generated
class AWSMediaConvertListJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.ListJobsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null
	var order: Order? = null
	var queue: String? = null
	var status: JobStatus? = null

	override fun build(): com.amazonaws.services.mediaconvert.model.ListJobsRequest {
		val input = com.amazonaws.services.mediaconvert.model.ListJobsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setOrder(this.order?.toString())
		input.setQueue(this.queue)
		input.setStatus(this.status?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.listJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert list-jobs")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("order", order?.toString())
				.argument("queue", queue)
				.argument("status", status?.toString())
	}

}


fun AWSMediaConvertFunctions.listPresets(init: AWSMediaConvertListPresetsCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertListPresetsCommand().apply(init))
}

@Generated
class AWSMediaConvertListPresetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.ListPresetsRequest> {

	var category: String? = null
	var listBy: PresetListBy? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var order: Order? = null

	override fun build(): com.amazonaws.services.mediaconvert.model.ListPresetsRequest {
		val input = com.amazonaws.services.mediaconvert.model.ListPresetsRequest()
		input.setCategory(this.category)
		input.setListBy(this.listBy?.toString())
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setOrder(this.order?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.listPresets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert list-presets")
				.argument("category", category)
				.argument("list-by", listBy?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("order", order?.toString())
	}

}


fun AWSMediaConvertFunctions.listQueues(init: AWSMediaConvertListQueuesCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertListQueuesCommand().apply(init))
}

@Generated
class AWSMediaConvertListQueuesCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.ListQueuesRequest> {

	var listBy: QueueListBy? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var order: Order? = null

	override fun build(): com.amazonaws.services.mediaconvert.model.ListQueuesRequest {
		val input = com.amazonaws.services.mediaconvert.model.ListQueuesRequest()
		input.setListBy(this.listBy?.toString())
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setOrder(this.order?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.listQueues(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert list-queues")
				.argument("list-by", listBy?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("order", order?.toString())
	}

}


fun AWSMediaConvertFunctions.updateJobTemplate(name: String, init: AWSMediaConvertUpdateJobTemplateCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertUpdateJobTemplateCommand(name).apply(init))
}

@Generated
class AWSMediaConvertUpdateJobTemplateCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.UpdateJobTemplateRequest> {

	var category: String? = null
	var description: String? = null
	var queue: String? = null
	var settings: com.amazonaws.services.mediaconvert.model.JobTemplateSettings? = null

	override fun build(): com.amazonaws.services.mediaconvert.model.UpdateJobTemplateRequest {
		val input = com.amazonaws.services.mediaconvert.model.UpdateJobTemplateRequest()
		input.setCategory(this.category)
		input.setDescription(this.description)
		input.setName(this.name)
		input.setQueue(this.queue)
		input.setSettings(this.settings)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.updateJobTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert update-job-template")
				.argument("category", category)
				.argument("description", description)
				.argument("name", name)
				.argument("queue", queue)
				.argument("settings", settings?.toString())
	}

}


fun AWSMediaConvertFunctions.updatePreset(name: String, init: AWSMediaConvertUpdatePresetCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertUpdatePresetCommand(name).apply(init))
}

@Generated
class AWSMediaConvertUpdatePresetCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.UpdatePresetRequest> {

	var category: String? = null
	var description: String? = null
	var settings: com.amazonaws.services.mediaconvert.model.PresetSettings? = null

	override fun build(): com.amazonaws.services.mediaconvert.model.UpdatePresetRequest {
		val input = com.amazonaws.services.mediaconvert.model.UpdatePresetRequest()
		input.setCategory(this.category)
		input.setDescription(this.description)
		input.setName(this.name)
		input.setSettings(this.settings)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.updatePreset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert update-preset")
				.argument("category", category)
				.argument("description", description)
				.argument("name", name)
				.argument("settings", settings?.toString())
	}

}


fun AWSMediaConvertFunctions.updateQueue(name: String, init: AWSMediaConvertUpdateQueueCommand.() -> Unit) {
	this.block.declare(AWSMediaConvertUpdateQueueCommand(name).apply(init))
}

@Generated
class AWSMediaConvertUpdateQueueCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.UpdateQueueRequest> {

	var description: String? = null
	var status: QueueStatus? = null

	override fun build(): com.amazonaws.services.mediaconvert.model.UpdateQueueRequest {
		val input = com.amazonaws.services.mediaconvert.model.UpdateQueueRequest()
		input.setDescription(this.description)
		input.setName(this.name)
		input.setStatus(this.status?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediaconvert.updateQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert update-queue")
				.argument("description", description)
				.argument("name", name)
				.argument("status", status?.toString())
	}

}
