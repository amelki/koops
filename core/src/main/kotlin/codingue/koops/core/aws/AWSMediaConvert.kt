
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.mediaconvert.AWSMediaConvert
import com.amazonaws.services.mediaconvert.AWSMediaConvertClientBuilder
import com.amazonaws.services.mediaconvert.model.*

var codingue.koops.core.Environment.mediaconvert: AWSMediaConvert
	get() {
		var service = this.capabilities[AWSMediaConvert::class.java.name]
		if (service == null) {
			service = AWSMediaConvertClientBuilder.standard().build()
			mediaconvert = service
		}
		return service as AWSMediaConvert
	}
	set(mediaconvert) {
		this.capabilities[AWSMediaConvert::class.java.name] = mediaconvert
	}

@Generated
class AWSMediaConvertFunctions(val block: Block)

infix fun <T> AwsContinuation.mediaconvert(init: AWSMediaConvertFunctions.() -> T): T {
	return AWSMediaConvertFunctions(shell).run(init)
}

			

fun AWSMediaConvertFunctions.cancelJob(id: String, init: AWSMediaConvertCancelJobCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.CancelJobResult {
	return this.block.declare(AWSMediaConvertCancelJobCommand(id).apply(init)) as com.amazonaws.services.mediaconvert.model.CancelJobResult
}

@Generated
class AWSMediaConvertCancelJobCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.CancelJobRequest, com.amazonaws.services.mediaconvert.model.CancelJobResult> {



	override fun build(): com.amazonaws.services.mediaconvert.model.CancelJobRequest {
		val input = com.amazonaws.services.mediaconvert.model.CancelJobRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.CancelJobResult {
	  return com.amazonaws.services.mediaconvert.model.CancelJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.CancelJobResult {
		return environment.mediaconvert.cancelJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert cancel-job")
				.argument("id", id)
	}

}


fun AWSMediaConvertFunctions.createJob(init: AWSMediaConvertCreateJobCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.CreateJobResult {
	return this.block.declare(AWSMediaConvertCreateJobCommand().apply(init)) as com.amazonaws.services.mediaconvert.model.CreateJobResult
}

@Generated
class AWSMediaConvertCreateJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.CreateJobRequest, com.amazonaws.services.mediaconvert.model.CreateJobResult> {

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

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.CreateJobResult {
	  return com.amazonaws.services.mediaconvert.model.CreateJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.CreateJobResult {
		return environment.mediaconvert.createJob(build())
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


fun AWSMediaConvertFunctions.createJobTemplate(init: AWSMediaConvertCreateJobTemplateCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.CreateJobTemplateResult {
	return this.block.declare(AWSMediaConvertCreateJobTemplateCommand().apply(init)) as com.amazonaws.services.mediaconvert.model.CreateJobTemplateResult
}

@Generated
class AWSMediaConvertCreateJobTemplateCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.CreateJobTemplateRequest, com.amazonaws.services.mediaconvert.model.CreateJobTemplateResult> {

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

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.CreateJobTemplateResult {
	  return com.amazonaws.services.mediaconvert.model.CreateJobTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.CreateJobTemplateResult {
		return environment.mediaconvert.createJobTemplate(build())
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


fun AWSMediaConvertFunctions.createPreset(init: AWSMediaConvertCreatePresetCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.CreatePresetResult {
	return this.block.declare(AWSMediaConvertCreatePresetCommand().apply(init)) as com.amazonaws.services.mediaconvert.model.CreatePresetResult
}

@Generated
class AWSMediaConvertCreatePresetCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.CreatePresetRequest, com.amazonaws.services.mediaconvert.model.CreatePresetResult> {

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

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.CreatePresetResult {
	  return com.amazonaws.services.mediaconvert.model.CreatePresetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.CreatePresetResult {
		return environment.mediaconvert.createPreset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert create-preset")
				.argument("category", category)
				.argument("description", description)
				.argument("name", name)
				.argument("settings", settings?.toString())
	}

}


fun AWSMediaConvertFunctions.createQueue(init: AWSMediaConvertCreateQueueCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.CreateQueueResult {
	return this.block.declare(AWSMediaConvertCreateQueueCommand().apply(init)) as com.amazonaws.services.mediaconvert.model.CreateQueueResult
}

@Generated
class AWSMediaConvertCreateQueueCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.CreateQueueRequest, com.amazonaws.services.mediaconvert.model.CreateQueueResult> {

	var description: String? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.mediaconvert.model.CreateQueueRequest {
		val input = com.amazonaws.services.mediaconvert.model.CreateQueueRequest()
		input.setDescription(this.description)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.CreateQueueResult {
	  return com.amazonaws.services.mediaconvert.model.CreateQueueResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.CreateQueueResult {
		return environment.mediaconvert.createQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert create-queue")
				.argument("description", description)
				.argument("name", name)
	}

}


fun AWSMediaConvertFunctions.deleteJobTemplate(name: String, init: AWSMediaConvertDeleteJobTemplateCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.DeleteJobTemplateResult {
	return this.block.declare(AWSMediaConvertDeleteJobTemplateCommand(name).apply(init)) as com.amazonaws.services.mediaconvert.model.DeleteJobTemplateResult
}

@Generated
class AWSMediaConvertDeleteJobTemplateCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest, com.amazonaws.services.mediaconvert.model.DeleteJobTemplateResult> {



	override fun build(): com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest {
		val input = com.amazonaws.services.mediaconvert.model.DeleteJobTemplateRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.DeleteJobTemplateResult {
	  return com.amazonaws.services.mediaconvert.model.DeleteJobTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.DeleteJobTemplateResult {
		return environment.mediaconvert.deleteJobTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert delete-job-template")
				.argument("name", name)
	}

}


fun AWSMediaConvertFunctions.deletePreset(name: String, init: AWSMediaConvertDeletePresetCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.DeletePresetResult {
	return this.block.declare(AWSMediaConvertDeletePresetCommand(name).apply(init)) as com.amazonaws.services.mediaconvert.model.DeletePresetResult
}

@Generated
class AWSMediaConvertDeletePresetCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.DeletePresetRequest, com.amazonaws.services.mediaconvert.model.DeletePresetResult> {



	override fun build(): com.amazonaws.services.mediaconvert.model.DeletePresetRequest {
		val input = com.amazonaws.services.mediaconvert.model.DeletePresetRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.DeletePresetResult {
	  return com.amazonaws.services.mediaconvert.model.DeletePresetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.DeletePresetResult {
		return environment.mediaconvert.deletePreset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert delete-preset")
				.argument("name", name)
	}

}


fun AWSMediaConvertFunctions.deleteQueue(name: String, init: AWSMediaConvertDeleteQueueCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.DeleteQueueResult {
	return this.block.declare(AWSMediaConvertDeleteQueueCommand(name).apply(init)) as com.amazonaws.services.mediaconvert.model.DeleteQueueResult
}

@Generated
class AWSMediaConvertDeleteQueueCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.DeleteQueueRequest, com.amazonaws.services.mediaconvert.model.DeleteQueueResult> {



	override fun build(): com.amazonaws.services.mediaconvert.model.DeleteQueueRequest {
		val input = com.amazonaws.services.mediaconvert.model.DeleteQueueRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.DeleteQueueResult {
	  return com.amazonaws.services.mediaconvert.model.DeleteQueueResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.DeleteQueueResult {
		return environment.mediaconvert.deleteQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert delete-queue")
				.argument("name", name)
	}

}


fun AWSMediaConvertFunctions.describeEndpoints(init: AWSMediaConvertDescribeEndpointsCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.DescribeEndpointsResult {
	return this.block.declare(AWSMediaConvertDescribeEndpointsCommand().apply(init)) as com.amazonaws.services.mediaconvert.model.DescribeEndpointsResult
}

@Generated
class AWSMediaConvertDescribeEndpointsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest, com.amazonaws.services.mediaconvert.model.DescribeEndpointsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest {
		val input = com.amazonaws.services.mediaconvert.model.DescribeEndpointsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.DescribeEndpointsResult {
	  return com.amazonaws.services.mediaconvert.model.DescribeEndpointsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.DescribeEndpointsResult {
		return environment.mediaconvert.describeEndpoints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert describe-endpoints")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMediaConvertFunctions.getJob(id: String, init: AWSMediaConvertGetJobCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.GetJobResult {
	return this.block.declare(AWSMediaConvertGetJobCommand(id).apply(init)) as com.amazonaws.services.mediaconvert.model.GetJobResult
}

@Generated
class AWSMediaConvertGetJobCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.GetJobRequest, com.amazonaws.services.mediaconvert.model.GetJobResult> {



	override fun build(): com.amazonaws.services.mediaconvert.model.GetJobRequest {
		val input = com.amazonaws.services.mediaconvert.model.GetJobRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.GetJobResult {
	  return com.amazonaws.services.mediaconvert.model.GetJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.GetJobResult {
		return environment.mediaconvert.getJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert get-job")
				.argument("id", id)
	}

}


fun AWSMediaConvertFunctions.getJobTemplate(name: String, init: AWSMediaConvertGetJobTemplateCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.GetJobTemplateResult {
	return this.block.declare(AWSMediaConvertGetJobTemplateCommand(name).apply(init)) as com.amazonaws.services.mediaconvert.model.GetJobTemplateResult
}

@Generated
class AWSMediaConvertGetJobTemplateCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest, com.amazonaws.services.mediaconvert.model.GetJobTemplateResult> {



	override fun build(): com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest {
		val input = com.amazonaws.services.mediaconvert.model.GetJobTemplateRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.GetJobTemplateResult {
	  return com.amazonaws.services.mediaconvert.model.GetJobTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.GetJobTemplateResult {
		return environment.mediaconvert.getJobTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert get-job-template")
				.argument("name", name)
	}

}


fun AWSMediaConvertFunctions.getPreset(name: String, init: AWSMediaConvertGetPresetCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.GetPresetResult {
	return this.block.declare(AWSMediaConvertGetPresetCommand(name).apply(init)) as com.amazonaws.services.mediaconvert.model.GetPresetResult
}

@Generated
class AWSMediaConvertGetPresetCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.GetPresetRequest, com.amazonaws.services.mediaconvert.model.GetPresetResult> {



	override fun build(): com.amazonaws.services.mediaconvert.model.GetPresetRequest {
		val input = com.amazonaws.services.mediaconvert.model.GetPresetRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.GetPresetResult {
	  return com.amazonaws.services.mediaconvert.model.GetPresetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.GetPresetResult {
		return environment.mediaconvert.getPreset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert get-preset")
				.argument("name", name)
	}

}


fun AWSMediaConvertFunctions.getQueue(name: String, init: AWSMediaConvertGetQueueCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.GetQueueResult {
	return this.block.declare(AWSMediaConvertGetQueueCommand(name).apply(init)) as com.amazonaws.services.mediaconvert.model.GetQueueResult
}

@Generated
class AWSMediaConvertGetQueueCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.GetQueueRequest, com.amazonaws.services.mediaconvert.model.GetQueueResult> {



	override fun build(): com.amazonaws.services.mediaconvert.model.GetQueueRequest {
		val input = com.amazonaws.services.mediaconvert.model.GetQueueRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.GetQueueResult {
	  return com.amazonaws.services.mediaconvert.model.GetQueueResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.GetQueueResult {
		return environment.mediaconvert.getQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert get-queue")
				.argument("name", name)
	}

}


fun AWSMediaConvertFunctions.listJobTemplates(init: AWSMediaConvertListJobTemplatesCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.ListJobTemplatesResult {
	return this.block.declare(AWSMediaConvertListJobTemplatesCommand().apply(init)) as com.amazonaws.services.mediaconvert.model.ListJobTemplatesResult
}

@Generated
class AWSMediaConvertListJobTemplatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.ListJobTemplatesRequest, com.amazonaws.services.mediaconvert.model.ListJobTemplatesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.ListJobTemplatesResult {
	  return com.amazonaws.services.mediaconvert.model.ListJobTemplatesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.ListJobTemplatesResult {
		return environment.mediaconvert.listJobTemplates(build())
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


fun AWSMediaConvertFunctions.listJobs(init: AWSMediaConvertListJobsCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.ListJobsResult {
	return this.block.declare(AWSMediaConvertListJobsCommand().apply(init)) as com.amazonaws.services.mediaconvert.model.ListJobsResult
}

@Generated
class AWSMediaConvertListJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.ListJobsRequest, com.amazonaws.services.mediaconvert.model.ListJobsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.ListJobsResult {
	  return com.amazonaws.services.mediaconvert.model.ListJobsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.ListJobsResult {
		return environment.mediaconvert.listJobs(build())
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


fun AWSMediaConvertFunctions.listPresets(init: AWSMediaConvertListPresetsCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.ListPresetsResult {
	return this.block.declare(AWSMediaConvertListPresetsCommand().apply(init)) as com.amazonaws.services.mediaconvert.model.ListPresetsResult
}

@Generated
class AWSMediaConvertListPresetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.ListPresetsRequest, com.amazonaws.services.mediaconvert.model.ListPresetsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.ListPresetsResult {
	  return com.amazonaws.services.mediaconvert.model.ListPresetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.ListPresetsResult {
		return environment.mediaconvert.listPresets(build())
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


fun AWSMediaConvertFunctions.listQueues(init: AWSMediaConvertListQueuesCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.ListQueuesResult {
	return this.block.declare(AWSMediaConvertListQueuesCommand().apply(init)) as com.amazonaws.services.mediaconvert.model.ListQueuesResult
}

@Generated
class AWSMediaConvertListQueuesCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.ListQueuesRequest, com.amazonaws.services.mediaconvert.model.ListQueuesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.ListQueuesResult {
	  return com.amazonaws.services.mediaconvert.model.ListQueuesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.ListQueuesResult {
		return environment.mediaconvert.listQueues(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert list-queues")
				.argument("list-by", listBy?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("order", order?.toString())
	}

}


fun AWSMediaConvertFunctions.updateJobTemplate(name: String, init: AWSMediaConvertUpdateJobTemplateCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.UpdateJobTemplateResult {
	return this.block.declare(AWSMediaConvertUpdateJobTemplateCommand(name).apply(init)) as com.amazonaws.services.mediaconvert.model.UpdateJobTemplateResult
}

@Generated
class AWSMediaConvertUpdateJobTemplateCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.UpdateJobTemplateRequest, com.amazonaws.services.mediaconvert.model.UpdateJobTemplateResult> {

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

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.UpdateJobTemplateResult {
	  return com.amazonaws.services.mediaconvert.model.UpdateJobTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.UpdateJobTemplateResult {
		return environment.mediaconvert.updateJobTemplate(build())
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


fun AWSMediaConvertFunctions.updatePreset(name: String, init: AWSMediaConvertUpdatePresetCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.UpdatePresetResult {
	return this.block.declare(AWSMediaConvertUpdatePresetCommand(name).apply(init)) as com.amazonaws.services.mediaconvert.model.UpdatePresetResult
}

@Generated
class AWSMediaConvertUpdatePresetCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.UpdatePresetRequest, com.amazonaws.services.mediaconvert.model.UpdatePresetResult> {

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

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.UpdatePresetResult {
	  return com.amazonaws.services.mediaconvert.model.UpdatePresetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.UpdatePresetResult {
		return environment.mediaconvert.updatePreset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert update-preset")
				.argument("category", category)
				.argument("description", description)
				.argument("name", name)
				.argument("settings", settings?.toString())
	}

}


fun AWSMediaConvertFunctions.updateQueue(name: String, init: AWSMediaConvertUpdateQueueCommand.() -> Unit): com.amazonaws.services.mediaconvert.model.UpdateQueueResult {
	return this.block.declare(AWSMediaConvertUpdateQueueCommand(name).apply(init)) as com.amazonaws.services.mediaconvert.model.UpdateQueueResult
}

@Generated
class AWSMediaConvertUpdateQueueCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.mediaconvert.model.UpdateQueueRequest, com.amazonaws.services.mediaconvert.model.UpdateQueueResult> {

	var description: String? = null
	var status: QueueStatus? = null

	override fun build(): com.amazonaws.services.mediaconvert.model.UpdateQueueRequest {
		val input = com.amazonaws.services.mediaconvert.model.UpdateQueueRequest()
		input.setDescription(this.description)
		input.setName(this.name)
		input.setStatus(this.status?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediaconvert.model.UpdateQueueResult {
	  return com.amazonaws.services.mediaconvert.model.UpdateQueueResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediaconvert.model.UpdateQueueResult {
		return environment.mediaconvert.updateQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediaconvert update-queue")
				.argument("description", description)
				.argument("name", name)
				.argument("status", status?.toString())
	}

}
