
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.resource_groups

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.resourcegroups.*
import com.amazonaws.services.resourcegroups.model.*

var com.codingue.koops.core.Environment.resource_groups: AWSResourceGroups
	get() {
		var service = this.capabilities["aws-resource_groups"]
		if (service == null) {
			service = AWSResourceGroupsClientBuilder.standard().build()
			this.capabilities["aws-resource_groups"] = service
		}
		return service as AWSResourceGroups
	}
	set(resource_groups) {
		this.capabilities["aws-resource_groups"] = resource_groups
	}

@Generated
class AWSResourceGroupsFunctions(val block: Block)

infix fun <T> AwsContinuation.resource_groups(init: AWSResourceGroupsFunctions.() -> T): T {
	return AWSResourceGroupsFunctions(shell).run(init)
}

			

fun AWSResourceGroupsFunctions.createGroup(name: String, resourceQuery: com.amazonaws.services.resourcegroups.model.ResourceQuery, init: (AWSResourceGroupsCreateGroupCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroups.model.CreateGroupResult {
	return this.block.declare(AWSResourceGroupsCreateGroupCommand(name, resourceQuery).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroups.model.CreateGroupResult
}

@Generated
class AWSResourceGroupsCreateGroupCommand(val name: String, val resourceQuery: com.amazonaws.services.resourcegroups.model.ResourceQuery) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.CreateGroupRequest, com.amazonaws.services.resourcegroups.model.CreateGroupResult> {

	var description: String? = null
	var tags: Map<String, String>? = null

	override fun build(): com.amazonaws.services.resourcegroups.model.CreateGroupRequest {
		val input = com.amazonaws.services.resourcegroups.model.CreateGroupRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setResourceQuery(this.resourceQuery)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroups.model.CreateGroupResult {
	  return com.amazonaws.services.resourcegroups.model.CreateGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroups.model.CreateGroupResult {
		return environment.resource_groups.createGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups create-group")
				.argument("name", name)
				.argument("description", description)
				.argument("resource-query", resourceQuery.toString())
				.argument("tags", tags?.toString())
	}

}


fun AWSResourceGroupsFunctions.deleteGroup(groupName: String, init: (AWSResourceGroupsDeleteGroupCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroups.model.DeleteGroupResult {
	return this.block.declare(AWSResourceGroupsDeleteGroupCommand(groupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroups.model.DeleteGroupResult
}

@Generated
class AWSResourceGroupsDeleteGroupCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.DeleteGroupRequest, com.amazonaws.services.resourcegroups.model.DeleteGroupResult> {



	override fun build(): com.amazonaws.services.resourcegroups.model.DeleteGroupRequest {
		val input = com.amazonaws.services.resourcegroups.model.DeleteGroupRequest()
		input.setGroupName(this.groupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroups.model.DeleteGroupResult {
	  return com.amazonaws.services.resourcegroups.model.DeleteGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroups.model.DeleteGroupResult {
		return environment.resource_groups.deleteGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups delete-group")
				.argument("group-name", groupName)
	}

}


fun AWSResourceGroupsFunctions.getGroup(groupName: String, init: (AWSResourceGroupsGetGroupCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroups.model.GetGroupResult {
	return this.block.declare(AWSResourceGroupsGetGroupCommand(groupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroups.model.GetGroupResult
}

@Generated
class AWSResourceGroupsGetGroupCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.GetGroupRequest, com.amazonaws.services.resourcegroups.model.GetGroupResult> {



	override fun build(): com.amazonaws.services.resourcegroups.model.GetGroupRequest {
		val input = com.amazonaws.services.resourcegroups.model.GetGroupRequest()
		input.setGroupName(this.groupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroups.model.GetGroupResult {
	  return com.amazonaws.services.resourcegroups.model.GetGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroups.model.GetGroupResult {
		return environment.resource_groups.getGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups get-group")
				.argument("group-name", groupName)
	}

}


fun AWSResourceGroupsFunctions.getGroupQuery(groupName: String, init: (AWSResourceGroupsGetGroupQueryCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroups.model.GetGroupQueryResult {
	return this.block.declare(AWSResourceGroupsGetGroupQueryCommand(groupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroups.model.GetGroupQueryResult
}

@Generated
class AWSResourceGroupsGetGroupQueryCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest, com.amazonaws.services.resourcegroups.model.GetGroupQueryResult> {



	override fun build(): com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest {
		val input = com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest()
		input.setGroupName(this.groupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroups.model.GetGroupQueryResult {
	  return com.amazonaws.services.resourcegroups.model.GetGroupQueryResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroups.model.GetGroupQueryResult {
		return environment.resource_groups.getGroupQuery(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups get-group-query")
				.argument("group-name", groupName)
	}

}


fun AWSResourceGroupsFunctions.getTags(arn: String, init: (AWSResourceGroupsGetTagsCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroups.model.GetTagsResult {
	return this.block.declare(AWSResourceGroupsGetTagsCommand(arn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroups.model.GetTagsResult
}

@Generated
class AWSResourceGroupsGetTagsCommand(val arn: String) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.GetTagsRequest, com.amazonaws.services.resourcegroups.model.GetTagsResult> {



	override fun build(): com.amazonaws.services.resourcegroups.model.GetTagsRequest {
		val input = com.amazonaws.services.resourcegroups.model.GetTagsRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroups.model.GetTagsResult {
	  return com.amazonaws.services.resourcegroups.model.GetTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroups.model.GetTagsResult {
		return environment.resource_groups.getTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups get-tags")
				.argument("arn", arn)
	}

}


fun AWSResourceGroupsFunctions.listGroupResources(groupName: String, init: (AWSResourceGroupsListGroupResourcesCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroups.model.ListGroupResourcesResult {
	return this.block.declare(AWSResourceGroupsListGroupResourcesCommand(groupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroups.model.ListGroupResourcesResult
}

@Generated
class AWSResourceGroupsListGroupResourcesCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest, com.amazonaws.services.resourcegroups.model.ListGroupResourcesResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest {
		val input = com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest()
		input.setGroupName(this.groupName)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroups.model.ListGroupResourcesResult {
	  return com.amazonaws.services.resourcegroups.model.ListGroupResourcesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroups.model.ListGroupResourcesResult {
		return environment.resource_groups.listGroupResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups list-group-resources")
				.argument("group-name", groupName)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSResourceGroupsFunctions.listGroups(init: (AWSResourceGroupsListGroupsCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroups.model.ListGroupsResult {
	return this.block.declare(AWSResourceGroupsListGroupsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroups.model.ListGroupsResult
}

@Generated
class AWSResourceGroupsListGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.ListGroupsRequest, com.amazonaws.services.resourcegroups.model.ListGroupsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.resourcegroups.model.ListGroupsRequest {
		val input = com.amazonaws.services.resourcegroups.model.ListGroupsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroups.model.ListGroupsResult {
	  return com.amazonaws.services.resourcegroups.model.ListGroupsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroups.model.ListGroupsResult {
		return environment.resource_groups.listGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups list-groups")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSResourceGroupsFunctions.searchResources(resourceQuery: com.amazonaws.services.resourcegroups.model.ResourceQuery, init: (AWSResourceGroupsSearchResourcesCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroups.model.SearchResourcesResult {
	return this.block.declare(AWSResourceGroupsSearchResourcesCommand(resourceQuery).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroups.model.SearchResourcesResult
}

@Generated
class AWSResourceGroupsSearchResourcesCommand(val resourceQuery: com.amazonaws.services.resourcegroups.model.ResourceQuery) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.SearchResourcesRequest, com.amazonaws.services.resourcegroups.model.SearchResourcesResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.resourcegroups.model.SearchResourcesRequest {
		val input = com.amazonaws.services.resourcegroups.model.SearchResourcesRequest()
		input.setResourceQuery(this.resourceQuery)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroups.model.SearchResourcesResult {
	  return com.amazonaws.services.resourcegroups.model.SearchResourcesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroups.model.SearchResourcesResult {
		return environment.resource_groups.searchResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups search-resources")
				.argument("resource-query", resourceQuery.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSResourceGroupsFunctions.tag(arn: String, tags: Map<String, String>, init: (AWSResourceGroupsTagCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroups.model.TagResult {
	return this.block.declare(AWSResourceGroupsTagCommand(arn, tags).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroups.model.TagResult
}

@Generated
class AWSResourceGroupsTagCommand(val arn: String, val tags: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.TagRequest, com.amazonaws.services.resourcegroups.model.TagResult> {



	override fun build(): com.amazonaws.services.resourcegroups.model.TagRequest {
		val input = com.amazonaws.services.resourcegroups.model.TagRequest()
		input.setArn(this.arn)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroups.model.TagResult {
	  return com.amazonaws.services.resourcegroups.model.TagResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroups.model.TagResult {
		return environment.resource_groups.tag(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups tag")
				.argument("arn", arn)
				.argument("tags", tags.toString())
	}

}


fun AWSResourceGroupsFunctions.untag(arn: String, keys: List<String>, init: (AWSResourceGroupsUntagCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroups.model.UntagResult {
	return this.block.declare(AWSResourceGroupsUntagCommand(arn, keys).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroups.model.UntagResult
}

@Generated
class AWSResourceGroupsUntagCommand(val arn: String, val keys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.UntagRequest, com.amazonaws.services.resourcegroups.model.UntagResult> {



	override fun build(): com.amazonaws.services.resourcegroups.model.UntagRequest {
		val input = com.amazonaws.services.resourcegroups.model.UntagRequest()
		input.setArn(this.arn)
		input.setKeys(this.keys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroups.model.UntagResult {
	  return com.amazonaws.services.resourcegroups.model.UntagResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroups.model.UntagResult {
		return environment.resource_groups.untag(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups untag")
				.argument("arn", arn)
				.argument("keys", keys.toString())
	}

}


fun AWSResourceGroupsFunctions.updateGroup(groupName: String, init: (AWSResourceGroupsUpdateGroupCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroups.model.UpdateGroupResult {
	return this.block.declare(AWSResourceGroupsUpdateGroupCommand(groupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroups.model.UpdateGroupResult
}

@Generated
class AWSResourceGroupsUpdateGroupCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.UpdateGroupRequest, com.amazonaws.services.resourcegroups.model.UpdateGroupResult> {

	var description: String? = null

	override fun build(): com.amazonaws.services.resourcegroups.model.UpdateGroupRequest {
		val input = com.amazonaws.services.resourcegroups.model.UpdateGroupRequest()
		input.setGroupName(this.groupName)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroups.model.UpdateGroupResult {
	  return com.amazonaws.services.resourcegroups.model.UpdateGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroups.model.UpdateGroupResult {
		return environment.resource_groups.updateGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups update-group")
				.argument("group-name", groupName)
				.argument("description", description)
	}

}


fun AWSResourceGroupsFunctions.updateGroupQuery(groupName: String, resourceQuery: com.amazonaws.services.resourcegroups.model.ResourceQuery, init: (AWSResourceGroupsUpdateGroupQueryCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroups.model.UpdateGroupQueryResult {
	return this.block.declare(AWSResourceGroupsUpdateGroupQueryCommand(groupName, resourceQuery).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroups.model.UpdateGroupQueryResult
}

@Generated
class AWSResourceGroupsUpdateGroupQueryCommand(val groupName: String, val resourceQuery: com.amazonaws.services.resourcegroups.model.ResourceQuery) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest, com.amazonaws.services.resourcegroups.model.UpdateGroupQueryResult> {



	override fun build(): com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest {
		val input = com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest()
		input.setGroupName(this.groupName)
		input.setResourceQuery(this.resourceQuery)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroups.model.UpdateGroupQueryResult {
	  return com.amazonaws.services.resourcegroups.model.UpdateGroupQueryResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroups.model.UpdateGroupQueryResult {
		return environment.resource_groups.updateGroupQuery(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups update-group-query")
				.argument("group-name", groupName)
				.argument("resource-query", resourceQuery.toString())
	}

}
