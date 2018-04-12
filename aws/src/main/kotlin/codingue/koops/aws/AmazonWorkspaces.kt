
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.workspaces.*
import com.amazonaws.services.workspaces.model.*

var codingue.koops.core.Environment.workspaces: AmazonWorkspaces
	get() {
		var service = this.capabilities["aws-workspaces"]
		if (service == null) {
			service = AmazonWorkspacesClientBuilder.standard().build()
			this.capabilities["aws-workspaces"] = service
		}
		return service as AmazonWorkspaces
	}
	set(workspaces) {
		this.capabilities["aws-workspaces"] = workspaces
	}

@Generated
class AmazonWorkspacesFunctions(val block: Block)

infix fun <T> AwsContinuation.workspaces(init: AmazonWorkspacesFunctions.() -> T): T {
	return AmazonWorkspacesFunctions(shell).run(init)
}

			

fun AmazonWorkspacesFunctions.createTags(resourceId: String, tags: List<com.amazonaws.services.workspaces.model.Tag>, init: AmazonWorkspacesCreateTagsCommand.() -> Unit): com.amazonaws.services.workspaces.model.CreateTagsResult {
	return this.block.declare(AmazonWorkspacesCreateTagsCommand(resourceId, tags).apply(init)) as com.amazonaws.services.workspaces.model.CreateTagsResult
}

@Generated
class AmazonWorkspacesCreateTagsCommand(val resourceId: String, val tags: List<com.amazonaws.services.workspaces.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.CreateTagsRequest, com.amazonaws.services.workspaces.model.CreateTagsResult> {



	override fun build(): com.amazonaws.services.workspaces.model.CreateTagsRequest {
		val input = com.amazonaws.services.workspaces.model.CreateTagsRequest()
		input.setResourceId(this.resourceId)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workspaces.model.CreateTagsResult {
	  return com.amazonaws.services.workspaces.model.CreateTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workspaces.model.CreateTagsResult {
		return environment.workspaces.createTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces create-tags")
				.argument("resource-id", resourceId)
				.argument("tags", tags.toString())
	}

}


fun AmazonWorkspacesFunctions.createWorkspaces(workspaces: List<com.amazonaws.services.workspaces.model.WorkspaceRequest>, init: AmazonWorkspacesCreateWorkspacesCommand.() -> Unit): com.amazonaws.services.workspaces.model.CreateWorkspacesResult {
	return this.block.declare(AmazonWorkspacesCreateWorkspacesCommand(workspaces).apply(init)) as com.amazonaws.services.workspaces.model.CreateWorkspacesResult
}

@Generated
class AmazonWorkspacesCreateWorkspacesCommand(val workspaces: List<com.amazonaws.services.workspaces.model.WorkspaceRequest>) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.CreateWorkspacesRequest, com.amazonaws.services.workspaces.model.CreateWorkspacesResult> {



	override fun build(): com.amazonaws.services.workspaces.model.CreateWorkspacesRequest {
		val input = com.amazonaws.services.workspaces.model.CreateWorkspacesRequest()
		input.setWorkspaces(this.workspaces)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workspaces.model.CreateWorkspacesResult {
	  return com.amazonaws.services.workspaces.model.CreateWorkspacesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workspaces.model.CreateWorkspacesResult {
		return environment.workspaces.createWorkspaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces create-workspaces")
				.argument("workspaces", workspaces.toString())
	}

}


fun AmazonWorkspacesFunctions.deleteTags(resourceId: String, tagKeys: List<String>, init: AmazonWorkspacesDeleteTagsCommand.() -> Unit): com.amazonaws.services.workspaces.model.DeleteTagsResult {
	return this.block.declare(AmazonWorkspacesDeleteTagsCommand(resourceId, tagKeys).apply(init)) as com.amazonaws.services.workspaces.model.DeleteTagsResult
}

@Generated
class AmazonWorkspacesDeleteTagsCommand(val resourceId: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.DeleteTagsRequest, com.amazonaws.services.workspaces.model.DeleteTagsResult> {



	override fun build(): com.amazonaws.services.workspaces.model.DeleteTagsRequest {
		val input = com.amazonaws.services.workspaces.model.DeleteTagsRequest()
		input.setResourceId(this.resourceId)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workspaces.model.DeleteTagsResult {
	  return com.amazonaws.services.workspaces.model.DeleteTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workspaces.model.DeleteTagsResult {
		return environment.workspaces.deleteTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces delete-tags")
				.argument("resource-id", resourceId)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonWorkspacesFunctions.describeTags(resourceId: String, init: AmazonWorkspacesDescribeTagsCommand.() -> Unit): com.amazonaws.services.workspaces.model.DescribeTagsResult {
	return this.block.declare(AmazonWorkspacesDescribeTagsCommand(resourceId).apply(init)) as com.amazonaws.services.workspaces.model.DescribeTagsResult
}

@Generated
class AmazonWorkspacesDescribeTagsCommand(val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.DescribeTagsRequest, com.amazonaws.services.workspaces.model.DescribeTagsResult> {



	override fun build(): com.amazonaws.services.workspaces.model.DescribeTagsRequest {
		val input = com.amazonaws.services.workspaces.model.DescribeTagsRequest()
		input.setResourceId(this.resourceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workspaces.model.DescribeTagsResult {
	  return com.amazonaws.services.workspaces.model.DescribeTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workspaces.model.DescribeTagsResult {
		return environment.workspaces.describeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces describe-tags")
				.argument("resource-id", resourceId)
	}

}


fun AmazonWorkspacesFunctions.describeWorkspaceBundles(init: AmazonWorkspacesDescribeWorkspaceBundlesCommand.() -> Unit): com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult {
	return this.block.declare(AmazonWorkspacesDescribeWorkspaceBundlesCommand().apply(init)) as com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult
}

@Generated
class AmazonWorkspacesDescribeWorkspaceBundlesCommand() : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesRequest, com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult {
	  return com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult {
		return environment.workspaces.describeWorkspaceBundles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces describe-workspace-bundles")
				.argument("bundle-ids", bundleIds?.toString())
				.argument("owner", owner)
				.argument("next-token", nextToken)
	}

}


fun AmazonWorkspacesFunctions.describeWorkspaceDirectories(init: AmazonWorkspacesDescribeWorkspaceDirectoriesCommand.() -> Unit): com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult {
	return this.block.declare(AmazonWorkspacesDescribeWorkspaceDirectoriesCommand().apply(init)) as com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult
}

@Generated
class AmazonWorkspacesDescribeWorkspaceDirectoriesCommand() : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest, com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult> {

	var directoryIds: List<String>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest {
		val input = com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest()
		input.setDirectoryIds(this.directoryIds)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult {
	  return com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult {
		return environment.workspaces.describeWorkspaceDirectories(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces describe-workspace-directories")
				.argument("directory-ids", directoryIds?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonWorkspacesFunctions.describeWorkspaces(init: AmazonWorkspacesDescribeWorkspacesCommand.() -> Unit): com.amazonaws.services.workspaces.model.DescribeWorkspacesResult {
	return this.block.declare(AmazonWorkspacesDescribeWorkspacesCommand().apply(init)) as com.amazonaws.services.workspaces.model.DescribeWorkspacesResult
}

@Generated
class AmazonWorkspacesDescribeWorkspacesCommand() : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.DescribeWorkspacesRequest, com.amazonaws.services.workspaces.model.DescribeWorkspacesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.workspaces.model.DescribeWorkspacesResult {
	  return com.amazonaws.services.workspaces.model.DescribeWorkspacesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workspaces.model.DescribeWorkspacesResult {
		return environment.workspaces.describeWorkspaces(build())
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


fun AmazonWorkspacesFunctions.describeWorkspacesConnectionStatus(init: AmazonWorkspacesDescribeWorkspacesConnectionStatusCommand.() -> Unit): com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusResult {
	return this.block.declare(AmazonWorkspacesDescribeWorkspacesConnectionStatusCommand().apply(init)) as com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusResult
}

@Generated
class AmazonWorkspacesDescribeWorkspacesConnectionStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest, com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusResult> {

	var workspaceIds: List<String>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest {
		val input = com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest()
		input.setWorkspaceIds(this.workspaceIds)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusResult {
	  return com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusResult {
		return environment.workspaces.describeWorkspacesConnectionStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces describe-workspaces-connection-status")
				.argument("workspace-ids", workspaceIds?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonWorkspacesFunctions.modifyWorkspaceProperties(workspaceId: String, workspaceProperties: com.amazonaws.services.workspaces.model.WorkspaceProperties, init: AmazonWorkspacesModifyWorkspacePropertiesCommand.() -> Unit): com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesResult {
	return this.block.declare(AmazonWorkspacesModifyWorkspacePropertiesCommand(workspaceId, workspaceProperties).apply(init)) as com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesResult
}

@Generated
class AmazonWorkspacesModifyWorkspacePropertiesCommand(val workspaceId: String, val workspaceProperties: com.amazonaws.services.workspaces.model.WorkspaceProperties) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest, com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesResult> {



	override fun build(): com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest {
		val input = com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest()
		input.setWorkspaceId(this.workspaceId)
		input.setWorkspaceProperties(this.workspaceProperties)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesResult {
	  return com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesResult {
		return environment.workspaces.modifyWorkspaceProperties(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces modify-workspace-properties")
				.argument("workspace-id", workspaceId)
				.argument("workspace-properties", workspaceProperties.toString())
	}

}


fun AmazonWorkspacesFunctions.rebootWorkspaces(rebootWorkspaceRequests: List<com.amazonaws.services.workspaces.model.RebootRequest>, init: AmazonWorkspacesRebootWorkspacesCommand.() -> Unit): com.amazonaws.services.workspaces.model.RebootWorkspacesResult {
	return this.block.declare(AmazonWorkspacesRebootWorkspacesCommand(rebootWorkspaceRequests).apply(init)) as com.amazonaws.services.workspaces.model.RebootWorkspacesResult
}

@Generated
class AmazonWorkspacesRebootWorkspacesCommand(val rebootWorkspaceRequests: List<com.amazonaws.services.workspaces.model.RebootRequest>) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.RebootWorkspacesRequest, com.amazonaws.services.workspaces.model.RebootWorkspacesResult> {



	override fun build(): com.amazonaws.services.workspaces.model.RebootWorkspacesRequest {
		val input = com.amazonaws.services.workspaces.model.RebootWorkspacesRequest()
		input.setRebootWorkspaceRequests(this.rebootWorkspaceRequests)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workspaces.model.RebootWorkspacesResult {
	  return com.amazonaws.services.workspaces.model.RebootWorkspacesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workspaces.model.RebootWorkspacesResult {
		return environment.workspaces.rebootWorkspaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces reboot-workspaces")
				.argument("reboot-workspace-requests", rebootWorkspaceRequests.toString())
	}

}


fun AmazonWorkspacesFunctions.rebuildWorkspaces(rebuildWorkspaceRequests: List<com.amazonaws.services.workspaces.model.RebuildRequest>, init: AmazonWorkspacesRebuildWorkspacesCommand.() -> Unit): com.amazonaws.services.workspaces.model.RebuildWorkspacesResult {
	return this.block.declare(AmazonWorkspacesRebuildWorkspacesCommand(rebuildWorkspaceRequests).apply(init)) as com.amazonaws.services.workspaces.model.RebuildWorkspacesResult
}

@Generated
class AmazonWorkspacesRebuildWorkspacesCommand(val rebuildWorkspaceRequests: List<com.amazonaws.services.workspaces.model.RebuildRequest>) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest, com.amazonaws.services.workspaces.model.RebuildWorkspacesResult> {



	override fun build(): com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest {
		val input = com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest()
		input.setRebuildWorkspaceRequests(this.rebuildWorkspaceRequests)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workspaces.model.RebuildWorkspacesResult {
	  return com.amazonaws.services.workspaces.model.RebuildWorkspacesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workspaces.model.RebuildWorkspacesResult {
		return environment.workspaces.rebuildWorkspaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces rebuild-workspaces")
				.argument("rebuild-workspace-requests", rebuildWorkspaceRequests.toString())
	}

}


fun AmazonWorkspacesFunctions.startWorkspaces(startWorkspaceRequests: List<com.amazonaws.services.workspaces.model.StartRequest>, init: AmazonWorkspacesStartWorkspacesCommand.() -> Unit): com.amazonaws.services.workspaces.model.StartWorkspacesResult {
	return this.block.declare(AmazonWorkspacesStartWorkspacesCommand(startWorkspaceRequests).apply(init)) as com.amazonaws.services.workspaces.model.StartWorkspacesResult
}

@Generated
class AmazonWorkspacesStartWorkspacesCommand(val startWorkspaceRequests: List<com.amazonaws.services.workspaces.model.StartRequest>) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.StartWorkspacesRequest, com.amazonaws.services.workspaces.model.StartWorkspacesResult> {



	override fun build(): com.amazonaws.services.workspaces.model.StartWorkspacesRequest {
		val input = com.amazonaws.services.workspaces.model.StartWorkspacesRequest()
		input.setStartWorkspaceRequests(this.startWorkspaceRequests)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workspaces.model.StartWorkspacesResult {
	  return com.amazonaws.services.workspaces.model.StartWorkspacesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workspaces.model.StartWorkspacesResult {
		return environment.workspaces.startWorkspaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces start-workspaces")
				.argument("start-workspace-requests", startWorkspaceRequests.toString())
	}

}


fun AmazonWorkspacesFunctions.stopWorkspaces(stopWorkspaceRequests: List<com.amazonaws.services.workspaces.model.StopRequest>, init: AmazonWorkspacesStopWorkspacesCommand.() -> Unit): com.amazonaws.services.workspaces.model.StopWorkspacesResult {
	return this.block.declare(AmazonWorkspacesStopWorkspacesCommand(stopWorkspaceRequests).apply(init)) as com.amazonaws.services.workspaces.model.StopWorkspacesResult
}

@Generated
class AmazonWorkspacesStopWorkspacesCommand(val stopWorkspaceRequests: List<com.amazonaws.services.workspaces.model.StopRequest>) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.StopWorkspacesRequest, com.amazonaws.services.workspaces.model.StopWorkspacesResult> {



	override fun build(): com.amazonaws.services.workspaces.model.StopWorkspacesRequest {
		val input = com.amazonaws.services.workspaces.model.StopWorkspacesRequest()
		input.setStopWorkspaceRequests(this.stopWorkspaceRequests)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workspaces.model.StopWorkspacesResult {
	  return com.amazonaws.services.workspaces.model.StopWorkspacesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workspaces.model.StopWorkspacesResult {
		return environment.workspaces.stopWorkspaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces stop-workspaces")
				.argument("stop-workspace-requests", stopWorkspaceRequests.toString())
	}

}


fun AmazonWorkspacesFunctions.terminateWorkspaces(terminateWorkspaceRequests: List<com.amazonaws.services.workspaces.model.TerminateRequest>, init: AmazonWorkspacesTerminateWorkspacesCommand.() -> Unit): com.amazonaws.services.workspaces.model.TerminateWorkspacesResult {
	return this.block.declare(AmazonWorkspacesTerminateWorkspacesCommand(terminateWorkspaceRequests).apply(init)) as com.amazonaws.services.workspaces.model.TerminateWorkspacesResult
}

@Generated
class AmazonWorkspacesTerminateWorkspacesCommand(val terminateWorkspaceRequests: List<com.amazonaws.services.workspaces.model.TerminateRequest>) : AmazonWebServiceCommand<com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest, com.amazonaws.services.workspaces.model.TerminateWorkspacesResult> {



	override fun build(): com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest {
		val input = com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest()
		input.setTerminateWorkspaceRequests(this.terminateWorkspaceRequests)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workspaces.model.TerminateWorkspacesResult {
	  return com.amazonaws.services.workspaces.model.TerminateWorkspacesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workspaces.model.TerminateWorkspacesResult {
		return environment.workspaces.terminateWorkspaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workspaces terminate-workspaces")
				.argument("terminate-workspace-requests", terminateWorkspaceRequests.toString())
	}

}
