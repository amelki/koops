
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.workspaces.AmazonWorkspaces
import com.amazonaws.services.workspaces.model.*

var codingue.koops.core.Environment.workspaces: AmazonWorkspaces
	get() = this.capabilities[AmazonWorkspaces::class.java.name] as AmazonWorkspaces
	set(workspaces) {
		this.capabilities[AmazonWorkspaces::class.java.name] = workspaces
	}

@Generated
class AmazonWorkspacesFunctions(val block: Block)

infix fun AwsContinuation.workspaces(init: AmazonWorkspacesFunctions.() -> Unit) {
	AmazonWorkspacesFunctions(shell).apply(init)
}

			

fun AmazonWorkspacesFunctions.createTags(resourceId: String, tags: List<com.amazonaws.services.workspaces.model.Tag>, init: AmazonWorkspacesCreateTagsCommand.() -> Unit) {
	this.block.declare(AmazonWorkspacesCreateTagsCommand(resourceId, tags).apply(init))
}

@Generated
class AmazonWorkspacesCreateTagsCommand(val resourceId: String, val tags: List<com.amazonaws.services.workspaces.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.CreateTagsRequest> {



	override fun build(): com.amazonaws.services.workspaces.model.CreateTagsRequest {
		val input = com.amazonaws.services.workspaces.model.CreateTagsRequest()
		input.setResourceId(this.resourceId)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workspaces.createTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces create-tags")
				.argument("resource-id", resourceId)
				.argument("tags", tags.toString())
	}

}


fun AmazonWorkspacesFunctions.createWorkspaces(workspaces: List<com.amazonaws.services.workspaces.model.WorkspaceRequest>, init: AmazonWorkspacesCreateWorkspacesCommand.() -> Unit) {
	this.block.declare(AmazonWorkspacesCreateWorkspacesCommand(workspaces).apply(init))
}

@Generated
class AmazonWorkspacesCreateWorkspacesCommand(val workspaces: List<com.amazonaws.services.workspaces.model.WorkspaceRequest>) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.CreateWorkspacesRequest> {



	override fun build(): com.amazonaws.services.workspaces.model.CreateWorkspacesRequest {
		val input = com.amazonaws.services.workspaces.model.CreateWorkspacesRequest()
		input.setWorkspaces(this.workspaces)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workspaces.createWorkspaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces create-workspaces")
				.argument("workspaces", workspaces.toString())
	}

}


fun AmazonWorkspacesFunctions.deleteTags(resourceId: String, tagKeys: List<String>, init: AmazonWorkspacesDeleteTagsCommand.() -> Unit) {
	this.block.declare(AmazonWorkspacesDeleteTagsCommand(resourceId, tagKeys).apply(init))
}

@Generated
class AmazonWorkspacesDeleteTagsCommand(val resourceId: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.DeleteTagsRequest> {



	override fun build(): com.amazonaws.services.workspaces.model.DeleteTagsRequest {
		val input = com.amazonaws.services.workspaces.model.DeleteTagsRequest()
		input.setResourceId(this.resourceId)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workspaces.deleteTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces delete-tags")
				.argument("resource-id", resourceId)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonWorkspacesFunctions.describeTags(resourceId: String, init: AmazonWorkspacesDescribeTagsCommand.() -> Unit) {
	this.block.declare(AmazonWorkspacesDescribeTagsCommand(resourceId).apply(init))
}

@Generated
class AmazonWorkspacesDescribeTagsCommand(val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.DescribeTagsRequest> {



	override fun build(): com.amazonaws.services.workspaces.model.DescribeTagsRequest {
		val input = com.amazonaws.services.workspaces.model.DescribeTagsRequest()
		input.setResourceId(this.resourceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workspaces.describeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces describe-tags")
				.argument("resource-id", resourceId)
	}

}


fun AmazonWorkspacesFunctions.describeWorkspaceBundles(init: AmazonWorkspacesDescribeWorkspaceBundlesCommand.() -> Unit) {
	this.block.declare(AmazonWorkspacesDescribeWorkspaceBundlesCommand().apply(init))
}

@Generated
class AmazonWorkspacesDescribeWorkspaceBundlesCommand() : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesRequest> {

	var bundleIds: List<String>? = null
	var owner: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesRequest {
		val input = com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesRequest()
		input.setBundleIds(this.bundleIds)
		input.setOwner(this.owner)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workspaces.describeWorkspaceBundles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces describe-workspace-bundles")
				.argument("bundle-ids", bundleIds?.toString())
				.argument("owner", owner)
				.argument("next-token", nextToken)
	}

}


fun AmazonWorkspacesFunctions.describeWorkspaceDirectories(init: AmazonWorkspacesDescribeWorkspaceDirectoriesCommand.() -> Unit) {
	this.block.declare(AmazonWorkspacesDescribeWorkspaceDirectoriesCommand().apply(init))
}

@Generated
class AmazonWorkspacesDescribeWorkspaceDirectoriesCommand() : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest> {

	var directoryIds: List<String>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest {
		val input = com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest()
		input.setDirectoryIds(this.directoryIds)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workspaces.describeWorkspaceDirectories(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces describe-workspace-directories")
				.argument("directory-ids", directoryIds?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonWorkspacesFunctions.describeWorkspaces(init: AmazonWorkspacesDescribeWorkspacesCommand.() -> Unit) {
	this.block.declare(AmazonWorkspacesDescribeWorkspacesCommand().apply(init))
}

@Generated
class AmazonWorkspacesDescribeWorkspacesCommand() : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.DescribeWorkspacesRequest> {

	var workspaceIds: List<String>? = null
	var directoryId: String? = null
	var userName: String? = null
	var bundleId: String? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.workspaces.model.DescribeWorkspacesRequest {
		val input = com.amazonaws.services.workspaces.model.DescribeWorkspacesRequest()
		input.setWorkspaceIds(this.workspaceIds)
		input.setDirectoryId(this.directoryId)
		input.setUserName(this.userName)
		input.setBundleId(this.bundleId)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workspaces.describeWorkspaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces describe-workspaces")
				.argument("workspace-ids", workspaceIds?.toString())
				.argument("directory-id", directoryId)
				.argument("user-name", userName)
				.argument("bundle-id", bundleId)
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonWorkspacesFunctions.describeWorkspacesConnectionStatus(init: AmazonWorkspacesDescribeWorkspacesConnectionStatusCommand.() -> Unit) {
	this.block.declare(AmazonWorkspacesDescribeWorkspacesConnectionStatusCommand().apply(init))
}

@Generated
class AmazonWorkspacesDescribeWorkspacesConnectionStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest> {

	var workspaceIds: List<String>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest {
		val input = com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest()
		input.setWorkspaceIds(this.workspaceIds)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workspaces.describeWorkspacesConnectionStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces describe-workspaces-connection-status")
				.argument("workspace-ids", workspaceIds?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonWorkspacesFunctions.modifyWorkspaceProperties(workspaceId: String, workspaceProperties: com.amazonaws.services.workspaces.model.WorkspaceProperties, init: AmazonWorkspacesModifyWorkspacePropertiesCommand.() -> Unit) {
	this.block.declare(AmazonWorkspacesModifyWorkspacePropertiesCommand(workspaceId, workspaceProperties).apply(init))
}

@Generated
class AmazonWorkspacesModifyWorkspacePropertiesCommand(val workspaceId: String, val workspaceProperties: com.amazonaws.services.workspaces.model.WorkspaceProperties) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest> {



	override fun build(): com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest {
		val input = com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest()
		input.setWorkspaceId(this.workspaceId)
		input.setWorkspaceProperties(this.workspaceProperties)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workspaces.modifyWorkspaceProperties(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces modify-workspace-properties")
				.argument("workspace-id", workspaceId)
				.argument("workspace-properties", workspaceProperties.toString())
	}

}


fun AmazonWorkspacesFunctions.rebootWorkspaces(rebootWorkspaceRequests: List<com.amazonaws.services.workspaces.model.RebootRequest>, init: AmazonWorkspacesRebootWorkspacesCommand.() -> Unit) {
	this.block.declare(AmazonWorkspacesRebootWorkspacesCommand(rebootWorkspaceRequests).apply(init))
}

@Generated
class AmazonWorkspacesRebootWorkspacesCommand(val rebootWorkspaceRequests: List<com.amazonaws.services.workspaces.model.RebootRequest>) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.RebootWorkspacesRequest> {



	override fun build(): com.amazonaws.services.workspaces.model.RebootWorkspacesRequest {
		val input = com.amazonaws.services.workspaces.model.RebootWorkspacesRequest()
		input.setRebootWorkspaceRequests(this.rebootWorkspaceRequests)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workspaces.rebootWorkspaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces reboot-workspaces")
				.argument("reboot-workspace-requests", rebootWorkspaceRequests.toString())
	}

}


fun AmazonWorkspacesFunctions.rebuildWorkspaces(rebuildWorkspaceRequests: List<com.amazonaws.services.workspaces.model.RebuildRequest>, init: AmazonWorkspacesRebuildWorkspacesCommand.() -> Unit) {
	this.block.declare(AmazonWorkspacesRebuildWorkspacesCommand(rebuildWorkspaceRequests).apply(init))
}

@Generated
class AmazonWorkspacesRebuildWorkspacesCommand(val rebuildWorkspaceRequests: List<com.amazonaws.services.workspaces.model.RebuildRequest>) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest> {



	override fun build(): com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest {
		val input = com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest()
		input.setRebuildWorkspaceRequests(this.rebuildWorkspaceRequests)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workspaces.rebuildWorkspaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces rebuild-workspaces")
				.argument("rebuild-workspace-requests", rebuildWorkspaceRequests.toString())
	}

}


fun AmazonWorkspacesFunctions.startWorkspaces(startWorkspaceRequests: List<com.amazonaws.services.workspaces.model.StartRequest>, init: AmazonWorkspacesStartWorkspacesCommand.() -> Unit) {
	this.block.declare(AmazonWorkspacesStartWorkspacesCommand(startWorkspaceRequests).apply(init))
}

@Generated
class AmazonWorkspacesStartWorkspacesCommand(val startWorkspaceRequests: List<com.amazonaws.services.workspaces.model.StartRequest>) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.StartWorkspacesRequest> {



	override fun build(): com.amazonaws.services.workspaces.model.StartWorkspacesRequest {
		val input = com.amazonaws.services.workspaces.model.StartWorkspacesRequest()
		input.setStartWorkspaceRequests(this.startWorkspaceRequests)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workspaces.startWorkspaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces start-workspaces")
				.argument("start-workspace-requests", startWorkspaceRequests.toString())
	}

}


fun AmazonWorkspacesFunctions.stopWorkspaces(stopWorkspaceRequests: List<com.amazonaws.services.workspaces.model.StopRequest>, init: AmazonWorkspacesStopWorkspacesCommand.() -> Unit) {
	this.block.declare(AmazonWorkspacesStopWorkspacesCommand(stopWorkspaceRequests).apply(init))
}

@Generated
class AmazonWorkspacesStopWorkspacesCommand(val stopWorkspaceRequests: List<com.amazonaws.services.workspaces.model.StopRequest>) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.StopWorkspacesRequest> {



	override fun build(): com.amazonaws.services.workspaces.model.StopWorkspacesRequest {
		val input = com.amazonaws.services.workspaces.model.StopWorkspacesRequest()
		input.setStopWorkspaceRequests(this.stopWorkspaceRequests)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workspaces.stopWorkspaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces stop-workspaces")
				.argument("stop-workspace-requests", stopWorkspaceRequests.toString())
	}

}


fun AmazonWorkspacesFunctions.terminateWorkspaces(terminateWorkspaceRequests: List<com.amazonaws.services.workspaces.model.TerminateRequest>, init: AmazonWorkspacesTerminateWorkspacesCommand.() -> Unit) {
	this.block.declare(AmazonWorkspacesTerminateWorkspacesCommand(terminateWorkspaceRequests).apply(init))
}

@Generated
class AmazonWorkspacesTerminateWorkspacesCommand(val terminateWorkspaceRequests: List<com.amazonaws.services.workspaces.model.TerminateRequest>) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest> {



	override fun build(): com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest {
		val input = com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest()
		input.setTerminateWorkspaceRequests(this.terminateWorkspaceRequests)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workspaces.terminateWorkspaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces terminate-workspaces")
				.argument("terminate-workspace-requests", terminateWorkspaceRequests.toString())
	}

}
