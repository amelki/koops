
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.workmail.AmazonWorkMail
import com.amazonaws.services.workmail.model.*

var codingue.koops.core.Environment.workmail: AmazonWorkMail
	get() = this.capabilities[AmazonWorkMail::class.java.name] as AmazonWorkMail
	set(workmail) {
		this.capabilities[AmazonWorkMail::class.java.name] = workmail
	}

@Generated
class AmazonWorkMailFunctions(val block: Block)

infix fun AwsContinuation.workmail(init: AmazonWorkMailFunctions.() -> Unit) {
	AmazonWorkMailFunctions(shell).apply(init)
}

			

fun AmazonWorkMailFunctions.associateDelegateToResource(organizationId: String, resourceId: String, entityId: String, init: AmazonWorkMailAssociateDelegateToResourceCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailAssociateDelegateToResourceCommand(organizationId, resourceId, entityId).apply(init))
}

@Generated
class AmazonWorkMailAssociateDelegateToResourceCommand(val organizationId: String, val resourceId: String, val entityId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest> {



	override fun build(): com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest {
		val input = com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest()
		input.setOrganizationId(this.organizationId)
		input.setResourceId(this.resourceId)
		input.setEntityId(this.entityId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.associateDelegateToResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail associate-delegate-to-resource")
				.argument("organization-id", organizationId)
				.argument("resource-id", resourceId)
				.argument("entity-id", entityId)
	}

}


fun AmazonWorkMailFunctions.associateMemberToGroup(organizationId: String, groupId: String, memberId: String, init: AmazonWorkMailAssociateMemberToGroupCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailAssociateMemberToGroupCommand(organizationId, groupId, memberId).apply(init))
}

@Generated
class AmazonWorkMailAssociateMemberToGroupCommand(val organizationId: String, val groupId: String, val memberId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest> {



	override fun build(): com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest {
		val input = com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest()
		input.setOrganizationId(this.organizationId)
		input.setGroupId(this.groupId)
		input.setMemberId(this.memberId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.associateMemberToGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail associate-member-to-group")
				.argument("organization-id", organizationId)
				.argument("group-id", groupId)
				.argument("member-id", memberId)
	}

}


fun AmazonWorkMailFunctions.createAlias(organizationId: String, entityId: String, alias: String, init: AmazonWorkMailCreateAliasCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailCreateAliasCommand(organizationId, entityId, alias).apply(init))
}

@Generated
class AmazonWorkMailCreateAliasCommand(val organizationId: String, val entityId: String, val alias: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.CreateAliasRequest> {



	override fun build(): com.amazonaws.services.workmail.model.CreateAliasRequest {
		val input = com.amazonaws.services.workmail.model.CreateAliasRequest()
		input.setOrganizationId(this.organizationId)
		input.setEntityId(this.entityId)
		input.setAlias(this.alias)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.createAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail create-alias")
				.argument("organization-id", organizationId)
				.argument("entity-id", entityId)
				.argument("alias", alias)
	}

}


fun AmazonWorkMailFunctions.createGroup(organizationId: String, name: String, init: AmazonWorkMailCreateGroupCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailCreateGroupCommand(organizationId, name).apply(init))
}

@Generated
class AmazonWorkMailCreateGroupCommand(val organizationId: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.CreateGroupRequest> {



	override fun build(): com.amazonaws.services.workmail.model.CreateGroupRequest {
		val input = com.amazonaws.services.workmail.model.CreateGroupRequest()
		input.setOrganizationId(this.organizationId)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.createGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail create-group")
				.argument("organization-id", organizationId)
				.argument("name", name)
	}

}


fun AmazonWorkMailFunctions.createResource(organizationId: String, name: String, type: ResourceType, init: AmazonWorkMailCreateResourceCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailCreateResourceCommand(organizationId, name, type).apply(init))
}

@Generated
class AmazonWorkMailCreateResourceCommand(val organizationId: String, val name: String, val type: ResourceType) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.CreateResourceRequest> {



	override fun build(): com.amazonaws.services.workmail.model.CreateResourceRequest {
		val input = com.amazonaws.services.workmail.model.CreateResourceRequest()
		input.setOrganizationId(this.organizationId)
		input.setName(this.name)
		input.setType(this.type.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.createResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail create-resource")
				.argument("organization-id", organizationId)
				.argument("name", name)
				.argument("type", type.toString())
	}

}


fun AmazonWorkMailFunctions.createUser(organizationId: String, name: String, displayName: String, password: String, init: AmazonWorkMailCreateUserCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailCreateUserCommand(organizationId, name, displayName, password).apply(init))
}

@Generated
class AmazonWorkMailCreateUserCommand(val organizationId: String, val name: String, val displayName: String, val password: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.CreateUserRequest> {



	override fun build(): com.amazonaws.services.workmail.model.CreateUserRequest {
		val input = com.amazonaws.services.workmail.model.CreateUserRequest()
		input.setOrganizationId(this.organizationId)
		input.setName(this.name)
		input.setDisplayName(this.displayName)
		input.setPassword(this.password)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.createUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail create-user")
				.argument("organization-id", organizationId)
				.argument("name", name)
				.argument("display-name", displayName)
				.argument("password", password)
	}

}


fun AmazonWorkMailFunctions.deleteAlias(organizationId: String, entityId: String, alias: String, init: AmazonWorkMailDeleteAliasCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailDeleteAliasCommand(organizationId, entityId, alias).apply(init))
}

@Generated
class AmazonWorkMailDeleteAliasCommand(val organizationId: String, val entityId: String, val alias: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DeleteAliasRequest> {



	override fun build(): com.amazonaws.services.workmail.model.DeleteAliasRequest {
		val input = com.amazonaws.services.workmail.model.DeleteAliasRequest()
		input.setOrganizationId(this.organizationId)
		input.setEntityId(this.entityId)
		input.setAlias(this.alias)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.deleteAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail delete-alias")
				.argument("organization-id", organizationId)
				.argument("entity-id", entityId)
				.argument("alias", alias)
	}

}


fun AmazonWorkMailFunctions.deleteGroup(organizationId: String, groupId: String, init: AmazonWorkMailDeleteGroupCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailDeleteGroupCommand(organizationId, groupId).apply(init))
}

@Generated
class AmazonWorkMailDeleteGroupCommand(val organizationId: String, val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DeleteGroupRequest> {



	override fun build(): com.amazonaws.services.workmail.model.DeleteGroupRequest {
		val input = com.amazonaws.services.workmail.model.DeleteGroupRequest()
		input.setOrganizationId(this.organizationId)
		input.setGroupId(this.groupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.deleteGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail delete-group")
				.argument("organization-id", organizationId)
				.argument("group-id", groupId)
	}

}


fun AmazonWorkMailFunctions.deleteResource(organizationId: String, resourceId: String, init: AmazonWorkMailDeleteResourceCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailDeleteResourceCommand(organizationId, resourceId).apply(init))
}

@Generated
class AmazonWorkMailDeleteResourceCommand(val organizationId: String, val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DeleteResourceRequest> {



	override fun build(): com.amazonaws.services.workmail.model.DeleteResourceRequest {
		val input = com.amazonaws.services.workmail.model.DeleteResourceRequest()
		input.setOrganizationId(this.organizationId)
		input.setResourceId(this.resourceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.deleteResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail delete-resource")
				.argument("organization-id", organizationId)
				.argument("resource-id", resourceId)
	}

}


fun AmazonWorkMailFunctions.deleteUser(organizationId: String, userId: String, init: AmazonWorkMailDeleteUserCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailDeleteUserCommand(organizationId, userId).apply(init))
}

@Generated
class AmazonWorkMailDeleteUserCommand(val organizationId: String, val userId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DeleteUserRequest> {



	override fun build(): com.amazonaws.services.workmail.model.DeleteUserRequest {
		val input = com.amazonaws.services.workmail.model.DeleteUserRequest()
		input.setOrganizationId(this.organizationId)
		input.setUserId(this.userId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.deleteUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail delete-user")
				.argument("organization-id", organizationId)
				.argument("user-id", userId)
	}

}


fun AmazonWorkMailFunctions.deregisterFromWorkMail(organizationId: String, entityId: String, init: AmazonWorkMailDeregisterFromWorkMailCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailDeregisterFromWorkMailCommand(organizationId, entityId).apply(init))
}

@Generated
class AmazonWorkMailDeregisterFromWorkMailCommand(val organizationId: String, val entityId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest> {



	override fun build(): com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest {
		val input = com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest()
		input.setOrganizationId(this.organizationId)
		input.setEntityId(this.entityId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.deregisterFromWorkMail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail deregister-from-work-mail")
				.argument("organization-id", organizationId)
				.argument("entity-id", entityId)
	}

}


fun AmazonWorkMailFunctions.describeGroup(organizationId: String, groupId: String, init: AmazonWorkMailDescribeGroupCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailDescribeGroupCommand(organizationId, groupId).apply(init))
}

@Generated
class AmazonWorkMailDescribeGroupCommand(val organizationId: String, val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DescribeGroupRequest> {



	override fun build(): com.amazonaws.services.workmail.model.DescribeGroupRequest {
		val input = com.amazonaws.services.workmail.model.DescribeGroupRequest()
		input.setOrganizationId(this.organizationId)
		input.setGroupId(this.groupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.describeGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail describe-group")
				.argument("organization-id", organizationId)
				.argument("group-id", groupId)
	}

}


fun AmazonWorkMailFunctions.describeOrganization(organizationId: String, init: AmazonWorkMailDescribeOrganizationCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailDescribeOrganizationCommand(organizationId).apply(init))
}

@Generated
class AmazonWorkMailDescribeOrganizationCommand(val organizationId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DescribeOrganizationRequest> {



	override fun build(): com.amazonaws.services.workmail.model.DescribeOrganizationRequest {
		val input = com.amazonaws.services.workmail.model.DescribeOrganizationRequest()
		input.setOrganizationId(this.organizationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.describeOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail describe-organization")
				.argument("organization-id", organizationId)
	}

}


fun AmazonWorkMailFunctions.describeResource(organizationId: String, resourceId: String, init: AmazonWorkMailDescribeResourceCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailDescribeResourceCommand(organizationId, resourceId).apply(init))
}

@Generated
class AmazonWorkMailDescribeResourceCommand(val organizationId: String, val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DescribeResourceRequest> {



	override fun build(): com.amazonaws.services.workmail.model.DescribeResourceRequest {
		val input = com.amazonaws.services.workmail.model.DescribeResourceRequest()
		input.setOrganizationId(this.organizationId)
		input.setResourceId(this.resourceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.describeResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail describe-resource")
				.argument("organization-id", organizationId)
				.argument("resource-id", resourceId)
	}

}


fun AmazonWorkMailFunctions.describeUser(organizationId: String, userId: String, init: AmazonWorkMailDescribeUserCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailDescribeUserCommand(organizationId, userId).apply(init))
}

@Generated
class AmazonWorkMailDescribeUserCommand(val organizationId: String, val userId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DescribeUserRequest> {



	override fun build(): com.amazonaws.services.workmail.model.DescribeUserRequest {
		val input = com.amazonaws.services.workmail.model.DescribeUserRequest()
		input.setOrganizationId(this.organizationId)
		input.setUserId(this.userId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.describeUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail describe-user")
				.argument("organization-id", organizationId)
				.argument("user-id", userId)
	}

}


fun AmazonWorkMailFunctions.disassociateDelegateFromResource(organizationId: String, resourceId: String, entityId: String, init: AmazonWorkMailDisassociateDelegateFromResourceCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailDisassociateDelegateFromResourceCommand(organizationId, resourceId, entityId).apply(init))
}

@Generated
class AmazonWorkMailDisassociateDelegateFromResourceCommand(val organizationId: String, val resourceId: String, val entityId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest> {



	override fun build(): com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest {
		val input = com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest()
		input.setOrganizationId(this.organizationId)
		input.setResourceId(this.resourceId)
		input.setEntityId(this.entityId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.disassociateDelegateFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail disassociate-delegate-from-resource")
				.argument("organization-id", organizationId)
				.argument("resource-id", resourceId)
				.argument("entity-id", entityId)
	}

}


fun AmazonWorkMailFunctions.disassociateMemberFromGroup(organizationId: String, groupId: String, memberId: String, init: AmazonWorkMailDisassociateMemberFromGroupCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailDisassociateMemberFromGroupCommand(organizationId, groupId, memberId).apply(init))
}

@Generated
class AmazonWorkMailDisassociateMemberFromGroupCommand(val organizationId: String, val groupId: String, val memberId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest> {



	override fun build(): com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest {
		val input = com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest()
		input.setOrganizationId(this.organizationId)
		input.setGroupId(this.groupId)
		input.setMemberId(this.memberId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.disassociateMemberFromGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail disassociate-member-from-group")
				.argument("organization-id", organizationId)
				.argument("group-id", groupId)
				.argument("member-id", memberId)
	}

}


fun AmazonWorkMailFunctions.listAliases(organizationId: String, entityId: String, init: AmazonWorkMailListAliasesCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailListAliasesCommand(organizationId, entityId).apply(init))
}

@Generated
class AmazonWorkMailListAliasesCommand(val organizationId: String, val entityId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.ListAliasesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.workmail.model.ListAliasesRequest {
		val input = com.amazonaws.services.workmail.model.ListAliasesRequest()
		input.setOrganizationId(this.organizationId)
		input.setEntityId(this.entityId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.listAliases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail list-aliases")
				.argument("organization-id", organizationId)
				.argument("entity-id", entityId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonWorkMailFunctions.listGroupMembers(organizationId: String, groupId: String, init: AmazonWorkMailListGroupMembersCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailListGroupMembersCommand(organizationId, groupId).apply(init))
}

@Generated
class AmazonWorkMailListGroupMembersCommand(val organizationId: String, val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.ListGroupMembersRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.workmail.model.ListGroupMembersRequest {
		val input = com.amazonaws.services.workmail.model.ListGroupMembersRequest()
		input.setOrganizationId(this.organizationId)
		input.setGroupId(this.groupId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.listGroupMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail list-group-members")
				.argument("organization-id", organizationId)
				.argument("group-id", groupId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonWorkMailFunctions.listGroups(organizationId: String, init: AmazonWorkMailListGroupsCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailListGroupsCommand(organizationId).apply(init))
}

@Generated
class AmazonWorkMailListGroupsCommand(val organizationId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.ListGroupsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.workmail.model.ListGroupsRequest {
		val input = com.amazonaws.services.workmail.model.ListGroupsRequest()
		input.setOrganizationId(this.organizationId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.listGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail list-groups")
				.argument("organization-id", organizationId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonWorkMailFunctions.listOrganizations(init: AmazonWorkMailListOrganizationsCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailListOrganizationsCommand().apply(init))
}

@Generated
class AmazonWorkMailListOrganizationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.ListOrganizationsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.workmail.model.ListOrganizationsRequest {
		val input = com.amazonaws.services.workmail.model.ListOrganizationsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.listOrganizations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail list-organizations")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonWorkMailFunctions.listResourceDelegates(organizationId: String, resourceId: String, init: AmazonWorkMailListResourceDelegatesCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailListResourceDelegatesCommand(organizationId, resourceId).apply(init))
}

@Generated
class AmazonWorkMailListResourceDelegatesCommand(val organizationId: String, val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.ListResourceDelegatesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.workmail.model.ListResourceDelegatesRequest {
		val input = com.amazonaws.services.workmail.model.ListResourceDelegatesRequest()
		input.setOrganizationId(this.organizationId)
		input.setResourceId(this.resourceId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.listResourceDelegates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail list-resource-delegates")
				.argument("organization-id", organizationId)
				.argument("resource-id", resourceId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonWorkMailFunctions.listResources(organizationId: String, init: AmazonWorkMailListResourcesCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailListResourcesCommand(organizationId).apply(init))
}

@Generated
class AmazonWorkMailListResourcesCommand(val organizationId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.ListResourcesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.workmail.model.ListResourcesRequest {
		val input = com.amazonaws.services.workmail.model.ListResourcesRequest()
		input.setOrganizationId(this.organizationId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.listResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail list-resources")
				.argument("organization-id", organizationId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonWorkMailFunctions.listUsers(organizationId: String, init: AmazonWorkMailListUsersCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailListUsersCommand(organizationId).apply(init))
}

@Generated
class AmazonWorkMailListUsersCommand(val organizationId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.ListUsersRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.workmail.model.ListUsersRequest {
		val input = com.amazonaws.services.workmail.model.ListUsersRequest()
		input.setOrganizationId(this.organizationId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.listUsers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail list-users")
				.argument("organization-id", organizationId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonWorkMailFunctions.registerToWorkMail(organizationId: String, entityId: String, email: String, init: AmazonWorkMailRegisterToWorkMailCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailRegisterToWorkMailCommand(organizationId, entityId, email).apply(init))
}

@Generated
class AmazonWorkMailRegisterToWorkMailCommand(val organizationId: String, val entityId: String, val email: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.RegisterToWorkMailRequest> {



	override fun build(): com.amazonaws.services.workmail.model.RegisterToWorkMailRequest {
		val input = com.amazonaws.services.workmail.model.RegisterToWorkMailRequest()
		input.setOrganizationId(this.organizationId)
		input.setEntityId(this.entityId)
		input.setEmail(this.email)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.registerToWorkMail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail register-to-work-mail")
				.argument("organization-id", organizationId)
				.argument("entity-id", entityId)
				.argument("email", email)
	}

}


fun AmazonWorkMailFunctions.resetPassword(organizationId: String, userId: String, password: String, init: AmazonWorkMailResetPasswordCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailResetPasswordCommand(organizationId, userId, password).apply(init))
}

@Generated
class AmazonWorkMailResetPasswordCommand(val organizationId: String, val userId: String, val password: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.ResetPasswordRequest> {



	override fun build(): com.amazonaws.services.workmail.model.ResetPasswordRequest {
		val input = com.amazonaws.services.workmail.model.ResetPasswordRequest()
		input.setOrganizationId(this.organizationId)
		input.setUserId(this.userId)
		input.setPassword(this.password)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.resetPassword(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail reset-password")
				.argument("organization-id", organizationId)
				.argument("user-id", userId)
				.argument("password", password)
	}

}


fun AmazonWorkMailFunctions.updatePrimaryEmailAddress(organizationId: String, entityId: String, email: String, init: AmazonWorkMailUpdatePrimaryEmailAddressCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailUpdatePrimaryEmailAddressCommand(organizationId, entityId, email).apply(init))
}

@Generated
class AmazonWorkMailUpdatePrimaryEmailAddressCommand(val organizationId: String, val entityId: String, val email: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest> {



	override fun build(): com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest {
		val input = com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest()
		input.setOrganizationId(this.organizationId)
		input.setEntityId(this.entityId)
		input.setEmail(this.email)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.updatePrimaryEmailAddress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail update-primary-email-address")
				.argument("organization-id", organizationId)
				.argument("entity-id", entityId)
				.argument("email", email)
	}

}


fun AmazonWorkMailFunctions.updateResource(organizationId: String, resourceId: String, init: AmazonWorkMailUpdateResourceCommand.() -> Unit) {
	this.block.declare(AmazonWorkMailUpdateResourceCommand(organizationId, resourceId).apply(init))
}

@Generated
class AmazonWorkMailUpdateResourceCommand(val organizationId: String, val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.UpdateResourceRequest> {

	var name: String? = null
	var bookingOptions: com.amazonaws.services.workmail.model.BookingOptions? = null

	override fun build(): com.amazonaws.services.workmail.model.UpdateResourceRequest {
		val input = com.amazonaws.services.workmail.model.UpdateResourceRequest()
		input.setOrganizationId(this.organizationId)
		input.setResourceId(this.resourceId)
		input.setName(this.name)
		input.setBookingOptions(this.bookingOptions)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.workmail.updateResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail update-resource")
				.argument("organization-id", organizationId)
				.argument("resource-id", resourceId)
				.argument("name", name)
				.argument("booking-options", bookingOptions?.toString())
	}

}
