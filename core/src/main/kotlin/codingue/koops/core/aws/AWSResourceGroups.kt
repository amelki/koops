
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.resourcegroups.AWSResourceGroups
import com.amazonaws.services.resourcegroups.model.*

var codingue.koops.core.Environment.resource_groups: AWSResourceGroups
	get() = this.capabilities[AWSResourceGroups::class.java.name] as AWSResourceGroups
	set(resource_groups) {
		this.capabilities[AWSResourceGroups::class.java.name] = resource_groups
	}

@Generated
class AWSResourceGroupsFunctions(val block: Block)

infix fun AwsContinuation.resource_groups(init: AWSResourceGroupsFunctions.() -> Unit) {
	AWSResourceGroupsFunctions(shell).apply(init)
}

			

fun AWSResourceGroupsFunctions.createGroup(name: String, resourceQuery: com.amazonaws.services.resourcegroups.model.ResourceQuery, init: AWSResourceGroupsCreateGroupCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsCreateGroupCommand(name, resourceQuery).apply(init))
}

@Generated
class AWSResourceGroupsCreateGroupCommand(val name: String, val resourceQuery: com.amazonaws.services.resourcegroups.model.ResourceQuery) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.CreateGroupRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.resource_groups.createGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups create-group")
				.argument("name", name)
				.argument("description", description)
				.argument("resource-query", resourceQuery.toString())
				.argument("tags", tags?.toString())
	}

}


fun AWSResourceGroupsFunctions.deleteGroup(groupName: String, init: AWSResourceGroupsDeleteGroupCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsDeleteGroupCommand(groupName).apply(init))
}

@Generated
class AWSResourceGroupsDeleteGroupCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.DeleteGroupRequest> {



	override fun build(): com.amazonaws.services.resourcegroups.model.DeleteGroupRequest {
		val input = com.amazonaws.services.resourcegroups.model.DeleteGroupRequest()
		input.setGroupName(this.groupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.resource_groups.deleteGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups delete-group")
				.argument("group-name", groupName)
	}

}


fun AWSResourceGroupsFunctions.getGroup(groupName: String, init: AWSResourceGroupsGetGroupCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsGetGroupCommand(groupName).apply(init))
}

@Generated
class AWSResourceGroupsGetGroupCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.GetGroupRequest> {



	override fun build(): com.amazonaws.services.resourcegroups.model.GetGroupRequest {
		val input = com.amazonaws.services.resourcegroups.model.GetGroupRequest()
		input.setGroupName(this.groupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.resource_groups.getGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups get-group")
				.argument("group-name", groupName)
	}

}


fun AWSResourceGroupsFunctions.getGroupQuery(groupName: String, init: AWSResourceGroupsGetGroupQueryCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsGetGroupQueryCommand(groupName).apply(init))
}

@Generated
class AWSResourceGroupsGetGroupQueryCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest> {



	override fun build(): com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest {
		val input = com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest()
		input.setGroupName(this.groupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.resource_groups.getGroupQuery(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups get-group-query")
				.argument("group-name", groupName)
	}

}


fun AWSResourceGroupsFunctions.getTags(arn: String, init: AWSResourceGroupsGetTagsCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsGetTagsCommand(arn).apply(init))
}

@Generated
class AWSResourceGroupsGetTagsCommand(val arn: String) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.GetTagsRequest> {



	override fun build(): com.amazonaws.services.resourcegroups.model.GetTagsRequest {
		val input = com.amazonaws.services.resourcegroups.model.GetTagsRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.resource_groups.getTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups get-tags")
				.argument("arn", arn)
	}

}


fun AWSResourceGroupsFunctions.listGroupResources(groupName: String, init: AWSResourceGroupsListGroupResourcesCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsListGroupResourcesCommand(groupName).apply(init))
}

@Generated
class AWSResourceGroupsListGroupResourcesCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest {
		val input = com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest()
		input.setGroupName(this.groupName)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.resource_groups.listGroupResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups list-group-resources")
				.argument("group-name", groupName)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSResourceGroupsFunctions.listGroups(init: AWSResourceGroupsListGroupsCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsListGroupsCommand().apply(init))
}

@Generated
class AWSResourceGroupsListGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.ListGroupsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.resourcegroups.model.ListGroupsRequest {
		val input = com.amazonaws.services.resourcegroups.model.ListGroupsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.resource_groups.listGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups list-groups")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSResourceGroupsFunctions.searchResources(resourceQuery: com.amazonaws.services.resourcegroups.model.ResourceQuery, init: AWSResourceGroupsSearchResourcesCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsSearchResourcesCommand(resourceQuery).apply(init))
}

@Generated
class AWSResourceGroupsSearchResourcesCommand(val resourceQuery: com.amazonaws.services.resourcegroups.model.ResourceQuery) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.SearchResourcesRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.resourcegroups.model.SearchResourcesRequest {
		val input = com.amazonaws.services.resourcegroups.model.SearchResourcesRequest()
		input.setResourceQuery(this.resourceQuery)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.resource_groups.searchResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups search-resources")
				.argument("resource-query", resourceQuery.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSResourceGroupsFunctions.tag(arn: String, tags: Map<String, String>, init: AWSResourceGroupsTagCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsTagCommand(arn, tags).apply(init))
}

@Generated
class AWSResourceGroupsTagCommand(val arn: String, val tags: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.TagRequest> {



	override fun build(): com.amazonaws.services.resourcegroups.model.TagRequest {
		val input = com.amazonaws.services.resourcegroups.model.TagRequest()
		input.setArn(this.arn)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.resource_groups.tag(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups tag")
				.argument("arn", arn)
				.argument("tags", tags.toString())
	}

}


fun AWSResourceGroupsFunctions.untag(arn: String, keys: List<String>, init: AWSResourceGroupsUntagCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsUntagCommand(arn, keys).apply(init))
}

@Generated
class AWSResourceGroupsUntagCommand(val arn: String, val keys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.UntagRequest> {



	override fun build(): com.amazonaws.services.resourcegroups.model.UntagRequest {
		val input = com.amazonaws.services.resourcegroups.model.UntagRequest()
		input.setArn(this.arn)
		input.setKeys(this.keys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.resource_groups.untag(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups untag")
				.argument("arn", arn)
				.argument("keys", keys.toString())
	}

}


fun AWSResourceGroupsFunctions.updateGroup(groupName: String, init: AWSResourceGroupsUpdateGroupCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsUpdateGroupCommand(groupName).apply(init))
}

@Generated
class AWSResourceGroupsUpdateGroupCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.UpdateGroupRequest> {

	var description: String? = null

	override fun build(): com.amazonaws.services.resourcegroups.model.UpdateGroupRequest {
		val input = com.amazonaws.services.resourcegroups.model.UpdateGroupRequest()
		input.setGroupName(this.groupName)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.resource_groups.updateGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups update-group")
				.argument("group-name", groupName)
				.argument("description", description)
	}

}


fun AWSResourceGroupsFunctions.updateGroupQuery(groupName: String, resourceQuery: com.amazonaws.services.resourcegroups.model.ResourceQuery, init: AWSResourceGroupsUpdateGroupQueryCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsUpdateGroupQueryCommand(groupName, resourceQuery).apply(init))
}

@Generated
class AWSResourceGroupsUpdateGroupQueryCommand(val groupName: String, val resourceQuery: com.amazonaws.services.resourcegroups.model.ResourceQuery) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest> {



	override fun build(): com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest {
		val input = com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest()
		input.setGroupName(this.groupName)
		input.setResourceQuery(this.resourceQuery)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.resource_groups.updateGroupQuery(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws resource-groups update-group-query")
				.argument("group-name", groupName)
				.argument("resource-query", resourceQuery.toString())
	}

}
