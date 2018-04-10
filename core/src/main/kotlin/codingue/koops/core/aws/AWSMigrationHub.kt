
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.migrationhub.AWSMigrationHub
import com.amazonaws.services.migrationhub.model.*

var codingue.koops.core.Environment.mgh: AWSMigrationHub
	get() = this.capabilities[AWSMigrationHub::class.java.name] as AWSMigrationHub
	set(mgh) {
		this.capabilities[AWSMigrationHub::class.java.name] = mgh
	}

@Generated
class AWSMigrationHubFunctions(val block: Block)

infix fun AwsContinuation.mgh(init: AWSMigrationHubFunctions.() -> Unit) {
	AWSMigrationHubFunctions(shell).apply(init)
}

			

fun AWSMigrationHubFunctions.associateCreatedArtifact(progressUpdateStream: String, migrationTaskName: String, createdArtifact: com.amazonaws.services.migrationhub.model.CreatedArtifact, init: AWSMigrationHubAssociateCreatedArtifactCommand.() -> Unit) {
	this.block.declare(AWSMigrationHubAssociateCreatedArtifactCommand(progressUpdateStream, migrationTaskName, createdArtifact).apply(init))
}

@Generated
class AWSMigrationHubAssociateCreatedArtifactCommand(val progressUpdateStream: String, val migrationTaskName: String, val createdArtifact: com.amazonaws.services.migrationhub.model.CreatedArtifact) : AmazonWebServiceCommand<com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactRequest> {

	var dryRun: Boolean? = false

	override fun build(): com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactRequest {
		val input = com.amazonaws.services.migrationhub.model.AssociateCreatedArtifactRequest()
		input.setProgressUpdateStream(this.progressUpdateStream)
		input.setMigrationTaskName(this.migrationTaskName)
		input.setCreatedArtifact(this.createdArtifact)
		input.setDryRun(this.dryRun)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mgh.associateCreatedArtifact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mgh associate-created-artifact")
				.argument("progress-update-stream", progressUpdateStream)
				.argument("migration-task-name", migrationTaskName)
				.argument("created-artifact", createdArtifact.toString())
				.option("dry-run", dryRun ?: false)
	}

}


fun AWSMigrationHubFunctions.associateDiscoveredResource(progressUpdateStream: String, migrationTaskName: String, discoveredResource: com.amazonaws.services.migrationhub.model.DiscoveredResource, init: AWSMigrationHubAssociateDiscoveredResourceCommand.() -> Unit) {
	this.block.declare(AWSMigrationHubAssociateDiscoveredResourceCommand(progressUpdateStream, migrationTaskName, discoveredResource).apply(init))
}

@Generated
class AWSMigrationHubAssociateDiscoveredResourceCommand(val progressUpdateStream: String, val migrationTaskName: String, val discoveredResource: com.amazonaws.services.migrationhub.model.DiscoveredResource) : AmazonWebServiceCommand<com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceRequest> {

	var dryRun: Boolean? = false

	override fun build(): com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceRequest {
		val input = com.amazonaws.services.migrationhub.model.AssociateDiscoveredResourceRequest()
		input.setProgressUpdateStream(this.progressUpdateStream)
		input.setMigrationTaskName(this.migrationTaskName)
		input.setDiscoveredResource(this.discoveredResource)
		input.setDryRun(this.dryRun)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mgh.associateDiscoveredResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mgh associate-discovered-resource")
				.argument("progress-update-stream", progressUpdateStream)
				.argument("migration-task-name", migrationTaskName)
				.argument("discovered-resource", discoveredResource.toString())
				.option("dry-run", dryRun ?: false)
	}

}


fun AWSMigrationHubFunctions.createProgressUpdateStream(progressUpdateStreamName: String, init: AWSMigrationHubCreateProgressUpdateStreamCommand.() -> Unit) {
	this.block.declare(AWSMigrationHubCreateProgressUpdateStreamCommand(progressUpdateStreamName).apply(init))
}

@Generated
class AWSMigrationHubCreateProgressUpdateStreamCommand(val progressUpdateStreamName: String) : AmazonWebServiceCommand<com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamRequest> {

	var dryRun: Boolean? = false

	override fun build(): com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamRequest {
		val input = com.amazonaws.services.migrationhub.model.CreateProgressUpdateStreamRequest()
		input.setProgressUpdateStreamName(this.progressUpdateStreamName)
		input.setDryRun(this.dryRun)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mgh.createProgressUpdateStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mgh create-progress-update-stream")
				.argument("progress-update-stream-name", progressUpdateStreamName)
				.option("dry-run", dryRun ?: false)
	}

}


fun AWSMigrationHubFunctions.deleteProgressUpdateStream(progressUpdateStreamName: String, init: AWSMigrationHubDeleteProgressUpdateStreamCommand.() -> Unit) {
	this.block.declare(AWSMigrationHubDeleteProgressUpdateStreamCommand(progressUpdateStreamName).apply(init))
}

@Generated
class AWSMigrationHubDeleteProgressUpdateStreamCommand(val progressUpdateStreamName: String) : AmazonWebServiceCommand<com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamRequest> {

	var dryRun: Boolean? = false

	override fun build(): com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamRequest {
		val input = com.amazonaws.services.migrationhub.model.DeleteProgressUpdateStreamRequest()
		input.setProgressUpdateStreamName(this.progressUpdateStreamName)
		input.setDryRun(this.dryRun)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mgh.deleteProgressUpdateStream(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mgh delete-progress-update-stream")
				.argument("progress-update-stream-name", progressUpdateStreamName)
				.option("dry-run", dryRun ?: false)
	}

}


fun AWSMigrationHubFunctions.describeApplicationState(applicationId: String, init: AWSMigrationHubDescribeApplicationStateCommand.() -> Unit) {
	this.block.declare(AWSMigrationHubDescribeApplicationStateCommand(applicationId).apply(init))
}

@Generated
class AWSMigrationHubDescribeApplicationStateCommand(val applicationId: String) : AmazonWebServiceCommand<com.amazonaws.services.migrationhub.model.DescribeApplicationStateRequest> {



	override fun build(): com.amazonaws.services.migrationhub.model.DescribeApplicationStateRequest {
		val input = com.amazonaws.services.migrationhub.model.DescribeApplicationStateRequest()
		input.setApplicationId(this.applicationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mgh.describeApplicationState(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mgh describe-application-state")
				.argument("application-id", applicationId)
	}

}


fun AWSMigrationHubFunctions.describeMigrationTask(progressUpdateStream: String, migrationTaskName: String, init: AWSMigrationHubDescribeMigrationTaskCommand.() -> Unit) {
	this.block.declare(AWSMigrationHubDescribeMigrationTaskCommand(progressUpdateStream, migrationTaskName).apply(init))
}

@Generated
class AWSMigrationHubDescribeMigrationTaskCommand(val progressUpdateStream: String, val migrationTaskName: String) : AmazonWebServiceCommand<com.amazonaws.services.migrationhub.model.DescribeMigrationTaskRequest> {



	override fun build(): com.amazonaws.services.migrationhub.model.DescribeMigrationTaskRequest {
		val input = com.amazonaws.services.migrationhub.model.DescribeMigrationTaskRequest()
		input.setProgressUpdateStream(this.progressUpdateStream)
		input.setMigrationTaskName(this.migrationTaskName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mgh.describeMigrationTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mgh describe-migration-task")
				.argument("progress-update-stream", progressUpdateStream)
				.argument("migration-task-name", migrationTaskName)
	}

}


fun AWSMigrationHubFunctions.disassociateCreatedArtifact(progressUpdateStream: String, migrationTaskName: String, createdArtifactName: String, init: AWSMigrationHubDisassociateCreatedArtifactCommand.() -> Unit) {
	this.block.declare(AWSMigrationHubDisassociateCreatedArtifactCommand(progressUpdateStream, migrationTaskName, createdArtifactName).apply(init))
}

@Generated
class AWSMigrationHubDisassociateCreatedArtifactCommand(val progressUpdateStream: String, val migrationTaskName: String, val createdArtifactName: String) : AmazonWebServiceCommand<com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactRequest> {

	var dryRun: Boolean? = false

	override fun build(): com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactRequest {
		val input = com.amazonaws.services.migrationhub.model.DisassociateCreatedArtifactRequest()
		input.setProgressUpdateStream(this.progressUpdateStream)
		input.setMigrationTaskName(this.migrationTaskName)
		input.setCreatedArtifactName(this.createdArtifactName)
		input.setDryRun(this.dryRun)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mgh.disassociateCreatedArtifact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mgh disassociate-created-artifact")
				.argument("progress-update-stream", progressUpdateStream)
				.argument("migration-task-name", migrationTaskName)
				.argument("created-artifact-name", createdArtifactName)
				.option("dry-run", dryRun ?: false)
	}

}


fun AWSMigrationHubFunctions.disassociateDiscoveredResource(progressUpdateStream: String, migrationTaskName: String, configurationId: String, init: AWSMigrationHubDisassociateDiscoveredResourceCommand.() -> Unit) {
	this.block.declare(AWSMigrationHubDisassociateDiscoveredResourceCommand(progressUpdateStream, migrationTaskName, configurationId).apply(init))
}

@Generated
class AWSMigrationHubDisassociateDiscoveredResourceCommand(val progressUpdateStream: String, val migrationTaskName: String, val configurationId: String) : AmazonWebServiceCommand<com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceRequest> {

	var dryRun: Boolean? = false

	override fun build(): com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceRequest {
		val input = com.amazonaws.services.migrationhub.model.DisassociateDiscoveredResourceRequest()
		input.setProgressUpdateStream(this.progressUpdateStream)
		input.setMigrationTaskName(this.migrationTaskName)
		input.setConfigurationId(this.configurationId)
		input.setDryRun(this.dryRun)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mgh.disassociateDiscoveredResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mgh disassociate-discovered-resource")
				.argument("progress-update-stream", progressUpdateStream)
				.argument("migration-task-name", migrationTaskName)
				.argument("configuration-id", configurationId)
				.option("dry-run", dryRun ?: false)
	}

}


fun AWSMigrationHubFunctions.importMigrationTask(progressUpdateStream: String, migrationTaskName: String, init: AWSMigrationHubImportMigrationTaskCommand.() -> Unit) {
	this.block.declare(AWSMigrationHubImportMigrationTaskCommand(progressUpdateStream, migrationTaskName).apply(init))
}

@Generated
class AWSMigrationHubImportMigrationTaskCommand(val progressUpdateStream: String, val migrationTaskName: String) : AmazonWebServiceCommand<com.amazonaws.services.migrationhub.model.ImportMigrationTaskRequest> {

	var dryRun: Boolean? = false

	override fun build(): com.amazonaws.services.migrationhub.model.ImportMigrationTaskRequest {
		val input = com.amazonaws.services.migrationhub.model.ImportMigrationTaskRequest()
		input.setProgressUpdateStream(this.progressUpdateStream)
		input.setMigrationTaskName(this.migrationTaskName)
		input.setDryRun(this.dryRun)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mgh.importMigrationTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mgh import-migration-task")
				.argument("progress-update-stream", progressUpdateStream)
				.argument("migration-task-name", migrationTaskName)
				.option("dry-run", dryRun ?: false)
	}

}


fun AWSMigrationHubFunctions.listCreatedArtifacts(progressUpdateStream: String, migrationTaskName: String, init: AWSMigrationHubListCreatedArtifactsCommand.() -> Unit) {
	this.block.declare(AWSMigrationHubListCreatedArtifactsCommand(progressUpdateStream, migrationTaskName).apply(init))
}

@Generated
class AWSMigrationHubListCreatedArtifactsCommand(val progressUpdateStream: String, val migrationTaskName: String) : AmazonWebServiceCommand<com.amazonaws.services.migrationhub.model.ListCreatedArtifactsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.migrationhub.model.ListCreatedArtifactsRequest {
		val input = com.amazonaws.services.migrationhub.model.ListCreatedArtifactsRequest()
		input.setProgressUpdateStream(this.progressUpdateStream)
		input.setMigrationTaskName(this.migrationTaskName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mgh.listCreatedArtifacts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mgh list-created-artifacts")
				.argument("progress-update-stream", progressUpdateStream)
				.argument("migration-task-name", migrationTaskName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSMigrationHubFunctions.listDiscoveredResources(progressUpdateStream: String, migrationTaskName: String, init: AWSMigrationHubListDiscoveredResourcesCommand.() -> Unit) {
	this.block.declare(AWSMigrationHubListDiscoveredResourcesCommand(progressUpdateStream, migrationTaskName).apply(init))
}

@Generated
class AWSMigrationHubListDiscoveredResourcesCommand(val progressUpdateStream: String, val migrationTaskName: String) : AmazonWebServiceCommand<com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesRequest {
		val input = com.amazonaws.services.migrationhub.model.ListDiscoveredResourcesRequest()
		input.setProgressUpdateStream(this.progressUpdateStream)
		input.setMigrationTaskName(this.migrationTaskName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mgh.listDiscoveredResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mgh list-discovered-resources")
				.argument("progress-update-stream", progressUpdateStream)
				.argument("migration-task-name", migrationTaskName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSMigrationHubFunctions.listMigrationTasks(init: AWSMigrationHubListMigrationTasksCommand.() -> Unit) {
	this.block.declare(AWSMigrationHubListMigrationTasksCommand().apply(init))
}

@Generated
class AWSMigrationHubListMigrationTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.migrationhub.model.ListMigrationTasksRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var resourceName: String? = null

	override fun build(): com.amazonaws.services.migrationhub.model.ListMigrationTasksRequest {
		val input = com.amazonaws.services.migrationhub.model.ListMigrationTasksRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setResourceName(this.resourceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mgh.listMigrationTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mgh list-migration-tasks")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("resource-name", resourceName)
	}

}


fun AWSMigrationHubFunctions.listProgressUpdateStreams(init: AWSMigrationHubListProgressUpdateStreamsCommand.() -> Unit) {
	this.block.declare(AWSMigrationHubListProgressUpdateStreamsCommand().apply(init))
}

@Generated
class AWSMigrationHubListProgressUpdateStreamsCommand() : AmazonWebServiceCommand<com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsRequest {
		val input = com.amazonaws.services.migrationhub.model.ListProgressUpdateStreamsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mgh.listProgressUpdateStreams(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mgh list-progress-update-streams")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSMigrationHubFunctions.notifyApplicationState(applicationId: String, status: ApplicationStatus, init: AWSMigrationHubNotifyApplicationStateCommand.() -> Unit) {
	this.block.declare(AWSMigrationHubNotifyApplicationStateCommand(applicationId, status).apply(init))
}

@Generated
class AWSMigrationHubNotifyApplicationStateCommand(val applicationId: String, val status: ApplicationStatus) : AmazonWebServiceCommand<com.amazonaws.services.migrationhub.model.NotifyApplicationStateRequest> {

	var dryRun: Boolean? = false

	override fun build(): com.amazonaws.services.migrationhub.model.NotifyApplicationStateRequest {
		val input = com.amazonaws.services.migrationhub.model.NotifyApplicationStateRequest()
		input.setApplicationId(this.applicationId)
		input.setStatus(this.status.toString())
		input.setDryRun(this.dryRun)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mgh.notifyApplicationState(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mgh notify-application-state")
				.argument("application-id", applicationId)
				.argument("status", status.toString())
				.option("dry-run", dryRun ?: false)
	}

}


fun AWSMigrationHubFunctions.notifyMigrationTaskState(progressUpdateStream: String, migrationTaskName: String, task: com.amazonaws.services.migrationhub.model.Task, updateDateTime: java.util.Date, nextUpdateSeconds: Int, init: AWSMigrationHubNotifyMigrationTaskStateCommand.() -> Unit) {
	this.block.declare(AWSMigrationHubNotifyMigrationTaskStateCommand(progressUpdateStream, migrationTaskName, task, updateDateTime, nextUpdateSeconds).apply(init))
}

@Generated
class AWSMigrationHubNotifyMigrationTaskStateCommand(val progressUpdateStream: String, val migrationTaskName: String, val task: com.amazonaws.services.migrationhub.model.Task, val updateDateTime: java.util.Date, val nextUpdateSeconds: Int) : AmazonWebServiceCommand<com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateRequest> {

	var dryRun: Boolean? = false

	override fun build(): com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateRequest {
		val input = com.amazonaws.services.migrationhub.model.NotifyMigrationTaskStateRequest()
		input.setProgressUpdateStream(this.progressUpdateStream)
		input.setMigrationTaskName(this.migrationTaskName)
		input.setTask(this.task)
		input.setUpdateDateTime(this.updateDateTime)
		input.setNextUpdateSeconds(this.nextUpdateSeconds)
		input.setDryRun(this.dryRun)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mgh.notifyMigrationTaskState(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mgh notify-migration-task-state")
				.argument("progress-update-stream", progressUpdateStream)
				.argument("migration-task-name", migrationTaskName)
				.argument("task", task.toString())
				.argument("update-date-time", updateDateTime.toString())
				.argument("next-update-seconds", nextUpdateSeconds.toString())
				.option("dry-run", dryRun ?: false)
	}

}


fun AWSMigrationHubFunctions.putResourceAttributes(progressUpdateStream: String, migrationTaskName: String, resourceAttributeList: List<com.amazonaws.services.migrationhub.model.ResourceAttribute>, init: AWSMigrationHubPutResourceAttributesCommand.() -> Unit) {
	this.block.declare(AWSMigrationHubPutResourceAttributesCommand(progressUpdateStream, migrationTaskName, resourceAttributeList).apply(init))
}

@Generated
class AWSMigrationHubPutResourceAttributesCommand(val progressUpdateStream: String, val migrationTaskName: String, val resourceAttributeList: List<com.amazonaws.services.migrationhub.model.ResourceAttribute>) : AmazonWebServiceCommand<com.amazonaws.services.migrationhub.model.PutResourceAttributesRequest> {

	var dryRun: Boolean? = false

	override fun build(): com.amazonaws.services.migrationhub.model.PutResourceAttributesRequest {
		val input = com.amazonaws.services.migrationhub.model.PutResourceAttributesRequest()
		input.setProgressUpdateStream(this.progressUpdateStream)
		input.setMigrationTaskName(this.migrationTaskName)
		input.setResourceAttributeList(this.resourceAttributeList)
		input.setDryRun(this.dryRun)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mgh.putResourceAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mgh put-resource-attributes")
				.argument("progress-update-stream", progressUpdateStream)
				.argument("migration-task-name", migrationTaskName)
				.argument("resource-attribute-list", resourceAttributeList.toString())
				.option("dry-run", dryRun ?: false)
	}

}
