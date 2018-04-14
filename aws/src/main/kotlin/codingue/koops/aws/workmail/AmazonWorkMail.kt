
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.workmail

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.workmail.*
import com.amazonaws.services.workmail.model.*

var codingue.koops.core.Environment.workmail: AmazonWorkMail
	get() {
		var service = this.capabilities["aws-workmail"]
		if (service == null) {
			service = AmazonWorkMailClientBuilder.standard().build()
			this.capabilities["aws-workmail"] = service
		}
		return service as AmazonWorkMail
	}
	set(workmail) {
		this.capabilities["aws-workmail"] = workmail
	}

@Generated
class AmazonWorkMailFunctions(val block: Block)

infix fun <T> AwsContinuation.workmail(init: AmazonWorkMailFunctions.() -> T): T {
	return AmazonWorkMailFunctions(shell).run(init)
}

			

fun AmazonWorkMailFunctions.associateDelegateToResource(organizationId: String, resourceId: String, entityId: String, init: AmazonWorkMailAssociateDelegateToResourceCommand.() -> Unit): com.amazonaws.services.workmail.model.AssociateDelegateToResourceResult {
	return this.block.declare(AmazonWorkMailAssociateDelegateToResourceCommand(organizationId, resourceId, entityId).apply(init)) as com.amazonaws.services.workmail.model.AssociateDelegateToResourceResult
}

@Generated
class AmazonWorkMailAssociateDelegateToResourceCommand(val organizationId: String, val resourceId: String, val entityId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest, com.amazonaws.services.workmail.model.AssociateDelegateToResourceResult> {



	override fun build(): com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest {
		val input = com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest()
		input.setOrganizationId(this.organizationId)
		input.setResourceId(this.resourceId)
		input.setEntityId(this.entityId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.AssociateDelegateToResourceResult {
	  return com.amazonaws.services.workmail.model.AssociateDelegateToResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.AssociateDelegateToResourceResult {
		return environment.workmail.associateDelegateToResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail associate-delegate-to-resource")
				.argument("organization-id", organizationId)
				.argument("resource-id", resourceId)
				.argument("entity-id", entityId)
	}

}


fun AmazonWorkMailFunctions.associateMemberToGroup(organizationId: String, groupId: String, memberId: String, init: AmazonWorkMailAssociateMemberToGroupCommand.() -> Unit): com.amazonaws.services.workmail.model.AssociateMemberToGroupResult {
	return this.block.declare(AmazonWorkMailAssociateMemberToGroupCommand(organizationId, groupId, memberId).apply(init)) as com.amazonaws.services.workmail.model.AssociateMemberToGroupResult
}

@Generated
class AmazonWorkMailAssociateMemberToGroupCommand(val organizationId: String, val groupId: String, val memberId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest, com.amazonaws.services.workmail.model.AssociateMemberToGroupResult> {



	override fun build(): com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest {
		val input = com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest()
		input.setOrganizationId(this.organizationId)
		input.setGroupId(this.groupId)
		input.setMemberId(this.memberId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.AssociateMemberToGroupResult {
	  return com.amazonaws.services.workmail.model.AssociateMemberToGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.AssociateMemberToGroupResult {
		return environment.workmail.associateMemberToGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail associate-member-to-group")
				.argument("organization-id", organizationId)
				.argument("group-id", groupId)
				.argument("member-id", memberId)
	}

}


fun AmazonWorkMailFunctions.createAlias(organizationId: String, entityId: String, alias: String, init: AmazonWorkMailCreateAliasCommand.() -> Unit): com.amazonaws.services.workmail.model.CreateAliasResult {
	return this.block.declare(AmazonWorkMailCreateAliasCommand(organizationId, entityId, alias).apply(init)) as com.amazonaws.services.workmail.model.CreateAliasResult
}

@Generated
class AmazonWorkMailCreateAliasCommand(val organizationId: String, val entityId: String, val alias: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.CreateAliasRequest, com.amazonaws.services.workmail.model.CreateAliasResult> {



	override fun build(): com.amazonaws.services.workmail.model.CreateAliasRequest {
		val input = com.amazonaws.services.workmail.model.CreateAliasRequest()
		input.setOrganizationId(this.organizationId)
		input.setEntityId(this.entityId)
		input.setAlias(this.alias)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.CreateAliasResult {
	  return com.amazonaws.services.workmail.model.CreateAliasResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.CreateAliasResult {
		return environment.workmail.createAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail create-alias")
				.argument("organization-id", organizationId)
				.argument("entity-id", entityId)
				.argument("alias", alias)
	}

}


fun AmazonWorkMailFunctions.createGroup(organizationId: String, name: String, init: AmazonWorkMailCreateGroupCommand.() -> Unit): com.amazonaws.services.workmail.model.CreateGroupResult {
	return this.block.declare(AmazonWorkMailCreateGroupCommand(organizationId, name).apply(init)) as com.amazonaws.services.workmail.model.CreateGroupResult
}

@Generated
class AmazonWorkMailCreateGroupCommand(val organizationId: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.CreateGroupRequest, com.amazonaws.services.workmail.model.CreateGroupResult> {



	override fun build(): com.amazonaws.services.workmail.model.CreateGroupRequest {
		val input = com.amazonaws.services.workmail.model.CreateGroupRequest()
		input.setOrganizationId(this.organizationId)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.CreateGroupResult {
	  return com.amazonaws.services.workmail.model.CreateGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.CreateGroupResult {
		return environment.workmail.createGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail create-group")
				.argument("organization-id", organizationId)
				.argument("name", name)
	}

}


fun AmazonWorkMailFunctions.createResource(organizationId: String, name: String, type: ResourceType, init: AmazonWorkMailCreateResourceCommand.() -> Unit): com.amazonaws.services.workmail.model.CreateResourceResult {
	return this.block.declare(AmazonWorkMailCreateResourceCommand(organizationId, name, type).apply(init)) as com.amazonaws.services.workmail.model.CreateResourceResult
}

@Generated
class AmazonWorkMailCreateResourceCommand(val organizationId: String, val name: String, val type: ResourceType) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.CreateResourceRequest, com.amazonaws.services.workmail.model.CreateResourceResult> {



	override fun build(): com.amazonaws.services.workmail.model.CreateResourceRequest {
		val input = com.amazonaws.services.workmail.model.CreateResourceRequest()
		input.setOrganizationId(this.organizationId)
		input.setName(this.name)
		input.setType(this.type.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.CreateResourceResult {
	  return com.amazonaws.services.workmail.model.CreateResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.CreateResourceResult {
		return environment.workmail.createResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail create-resource")
				.argument("organization-id", organizationId)
				.argument("name", name)
				.argument("type", type.toString())
	}

}


fun AmazonWorkMailFunctions.createUser(organizationId: String, name: String, displayName: String, password: String, init: AmazonWorkMailCreateUserCommand.() -> Unit): com.amazonaws.services.workmail.model.CreateUserResult {
	return this.block.declare(AmazonWorkMailCreateUserCommand(organizationId, name, displayName, password).apply(init)) as com.amazonaws.services.workmail.model.CreateUserResult
}

@Generated
class AmazonWorkMailCreateUserCommand(val organizationId: String, val name: String, val displayName: String, val password: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.CreateUserRequest, com.amazonaws.services.workmail.model.CreateUserResult> {



	override fun build(): com.amazonaws.services.workmail.model.CreateUserRequest {
		val input = com.amazonaws.services.workmail.model.CreateUserRequest()
		input.setOrganizationId(this.organizationId)
		input.setName(this.name)
		input.setDisplayName(this.displayName)
		input.setPassword(this.password)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.CreateUserResult {
	  return com.amazonaws.services.workmail.model.CreateUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.CreateUserResult {
		return environment.workmail.createUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail create-user")
				.argument("organization-id", organizationId)
				.argument("name", name)
				.argument("display-name", displayName)
				.argument("password", password)
	}

}


fun AmazonWorkMailFunctions.deleteAlias(organizationId: String, entityId: String, alias: String, init: AmazonWorkMailDeleteAliasCommand.() -> Unit): com.amazonaws.services.workmail.model.DeleteAliasResult {
	return this.block.declare(AmazonWorkMailDeleteAliasCommand(organizationId, entityId, alias).apply(init)) as com.amazonaws.services.workmail.model.DeleteAliasResult
}

@Generated
class AmazonWorkMailDeleteAliasCommand(val organizationId: String, val entityId: String, val alias: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DeleteAliasRequest, com.amazonaws.services.workmail.model.DeleteAliasResult> {



	override fun build(): com.amazonaws.services.workmail.model.DeleteAliasRequest {
		val input = com.amazonaws.services.workmail.model.DeleteAliasRequest()
		input.setOrganizationId(this.organizationId)
		input.setEntityId(this.entityId)
		input.setAlias(this.alias)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.DeleteAliasResult {
	  return com.amazonaws.services.workmail.model.DeleteAliasResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.DeleteAliasResult {
		return environment.workmail.deleteAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail delete-alias")
				.argument("organization-id", organizationId)
				.argument("entity-id", entityId)
				.argument("alias", alias)
	}

}


fun AmazonWorkMailFunctions.deleteGroup(organizationId: String, groupId: String, init: AmazonWorkMailDeleteGroupCommand.() -> Unit): com.amazonaws.services.workmail.model.DeleteGroupResult {
	return this.block.declare(AmazonWorkMailDeleteGroupCommand(organizationId, groupId).apply(init)) as com.amazonaws.services.workmail.model.DeleteGroupResult
}

@Generated
class AmazonWorkMailDeleteGroupCommand(val organizationId: String, val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DeleteGroupRequest, com.amazonaws.services.workmail.model.DeleteGroupResult> {



	override fun build(): com.amazonaws.services.workmail.model.DeleteGroupRequest {
		val input = com.amazonaws.services.workmail.model.DeleteGroupRequest()
		input.setOrganizationId(this.organizationId)
		input.setGroupId(this.groupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.DeleteGroupResult {
	  return com.amazonaws.services.workmail.model.DeleteGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.DeleteGroupResult {
		return environment.workmail.deleteGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail delete-group")
				.argument("organization-id", organizationId)
				.argument("group-id", groupId)
	}

}


fun AmazonWorkMailFunctions.deleteResource(organizationId: String, resourceId: String, init: AmazonWorkMailDeleteResourceCommand.() -> Unit): com.amazonaws.services.workmail.model.DeleteResourceResult {
	return this.block.declare(AmazonWorkMailDeleteResourceCommand(organizationId, resourceId).apply(init)) as com.amazonaws.services.workmail.model.DeleteResourceResult
}

@Generated
class AmazonWorkMailDeleteResourceCommand(val organizationId: String, val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DeleteResourceRequest, com.amazonaws.services.workmail.model.DeleteResourceResult> {



	override fun build(): com.amazonaws.services.workmail.model.DeleteResourceRequest {
		val input = com.amazonaws.services.workmail.model.DeleteResourceRequest()
		input.setOrganizationId(this.organizationId)
		input.setResourceId(this.resourceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.DeleteResourceResult {
	  return com.amazonaws.services.workmail.model.DeleteResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.DeleteResourceResult {
		return environment.workmail.deleteResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail delete-resource")
				.argument("organization-id", organizationId)
				.argument("resource-id", resourceId)
	}

}


fun AmazonWorkMailFunctions.deleteUser(organizationId: String, userId: String, init: AmazonWorkMailDeleteUserCommand.() -> Unit): com.amazonaws.services.workmail.model.DeleteUserResult {
	return this.block.declare(AmazonWorkMailDeleteUserCommand(organizationId, userId).apply(init)) as com.amazonaws.services.workmail.model.DeleteUserResult
}

@Generated
class AmazonWorkMailDeleteUserCommand(val organizationId: String, val userId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DeleteUserRequest, com.amazonaws.services.workmail.model.DeleteUserResult> {



	override fun build(): com.amazonaws.services.workmail.model.DeleteUserRequest {
		val input = com.amazonaws.services.workmail.model.DeleteUserRequest()
		input.setOrganizationId(this.organizationId)
		input.setUserId(this.userId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.DeleteUserResult {
	  return com.amazonaws.services.workmail.model.DeleteUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.DeleteUserResult {
		return environment.workmail.deleteUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail delete-user")
				.argument("organization-id", organizationId)
				.argument("user-id", userId)
	}

}


fun AmazonWorkMailFunctions.deregisterFromWorkMail(organizationId: String, entityId: String, init: AmazonWorkMailDeregisterFromWorkMailCommand.() -> Unit): com.amazonaws.services.workmail.model.DeregisterFromWorkMailResult {
	return this.block.declare(AmazonWorkMailDeregisterFromWorkMailCommand(organizationId, entityId).apply(init)) as com.amazonaws.services.workmail.model.DeregisterFromWorkMailResult
}

@Generated
class AmazonWorkMailDeregisterFromWorkMailCommand(val organizationId: String, val entityId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest, com.amazonaws.services.workmail.model.DeregisterFromWorkMailResult> {



	override fun build(): com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest {
		val input = com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest()
		input.setOrganizationId(this.organizationId)
		input.setEntityId(this.entityId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.DeregisterFromWorkMailResult {
	  return com.amazonaws.services.workmail.model.DeregisterFromWorkMailResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.DeregisterFromWorkMailResult {
		return environment.workmail.deregisterFromWorkMail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail deregister-from-work-mail")
				.argument("organization-id", organizationId)
				.argument("entity-id", entityId)
	}

}


fun AmazonWorkMailFunctions.describeGroup(organizationId: String, groupId: String, init: AmazonWorkMailDescribeGroupCommand.() -> Unit): com.amazonaws.services.workmail.model.DescribeGroupResult {
	return this.block.declare(AmazonWorkMailDescribeGroupCommand(organizationId, groupId).apply(init)) as com.amazonaws.services.workmail.model.DescribeGroupResult
}

@Generated
class AmazonWorkMailDescribeGroupCommand(val organizationId: String, val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DescribeGroupRequest, com.amazonaws.services.workmail.model.DescribeGroupResult> {



	override fun build(): com.amazonaws.services.workmail.model.DescribeGroupRequest {
		val input = com.amazonaws.services.workmail.model.DescribeGroupRequest()
		input.setOrganizationId(this.organizationId)
		input.setGroupId(this.groupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.DescribeGroupResult {
	  return com.amazonaws.services.workmail.model.DescribeGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.DescribeGroupResult {
		return environment.workmail.describeGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail describe-group")
				.argument("organization-id", organizationId)
				.argument("group-id", groupId)
	}

}


fun AmazonWorkMailFunctions.describeOrganization(organizationId: String, init: AmazonWorkMailDescribeOrganizationCommand.() -> Unit): com.amazonaws.services.workmail.model.DescribeOrganizationResult {
	return this.block.declare(AmazonWorkMailDescribeOrganizationCommand(organizationId).apply(init)) as com.amazonaws.services.workmail.model.DescribeOrganizationResult
}

@Generated
class AmazonWorkMailDescribeOrganizationCommand(val organizationId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DescribeOrganizationRequest, com.amazonaws.services.workmail.model.DescribeOrganizationResult> {



	override fun build(): com.amazonaws.services.workmail.model.DescribeOrganizationRequest {
		val input = com.amazonaws.services.workmail.model.DescribeOrganizationRequest()
		input.setOrganizationId(this.organizationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.DescribeOrganizationResult {
	  return com.amazonaws.services.workmail.model.DescribeOrganizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.DescribeOrganizationResult {
		return environment.workmail.describeOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail describe-organization")
				.argument("organization-id", organizationId)
	}

}


fun AmazonWorkMailFunctions.describeResource(organizationId: String, resourceId: String, init: AmazonWorkMailDescribeResourceCommand.() -> Unit): com.amazonaws.services.workmail.model.DescribeResourceResult {
	return this.block.declare(AmazonWorkMailDescribeResourceCommand(organizationId, resourceId).apply(init)) as com.amazonaws.services.workmail.model.DescribeResourceResult
}

@Generated
class AmazonWorkMailDescribeResourceCommand(val organizationId: String, val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DescribeResourceRequest, com.amazonaws.services.workmail.model.DescribeResourceResult> {



	override fun build(): com.amazonaws.services.workmail.model.DescribeResourceRequest {
		val input = com.amazonaws.services.workmail.model.DescribeResourceRequest()
		input.setOrganizationId(this.organizationId)
		input.setResourceId(this.resourceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.DescribeResourceResult {
	  return com.amazonaws.services.workmail.model.DescribeResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.DescribeResourceResult {
		return environment.workmail.describeResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail describe-resource")
				.argument("organization-id", organizationId)
				.argument("resource-id", resourceId)
	}

}


fun AmazonWorkMailFunctions.describeUser(organizationId: String, userId: String, init: AmazonWorkMailDescribeUserCommand.() -> Unit): com.amazonaws.services.workmail.model.DescribeUserResult {
	return this.block.declare(AmazonWorkMailDescribeUserCommand(organizationId, userId).apply(init)) as com.amazonaws.services.workmail.model.DescribeUserResult
}

@Generated
class AmazonWorkMailDescribeUserCommand(val organizationId: String, val userId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DescribeUserRequest, com.amazonaws.services.workmail.model.DescribeUserResult> {



	override fun build(): com.amazonaws.services.workmail.model.DescribeUserRequest {
		val input = com.amazonaws.services.workmail.model.DescribeUserRequest()
		input.setOrganizationId(this.organizationId)
		input.setUserId(this.userId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.DescribeUserResult {
	  return com.amazonaws.services.workmail.model.DescribeUserResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.DescribeUserResult {
		return environment.workmail.describeUser(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail describe-user")
				.argument("organization-id", organizationId)
				.argument("user-id", userId)
	}

}


fun AmazonWorkMailFunctions.disassociateDelegateFromResource(organizationId: String, resourceId: String, entityId: String, init: AmazonWorkMailDisassociateDelegateFromResourceCommand.() -> Unit): com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceResult {
	return this.block.declare(AmazonWorkMailDisassociateDelegateFromResourceCommand(organizationId, resourceId, entityId).apply(init)) as com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceResult
}

@Generated
class AmazonWorkMailDisassociateDelegateFromResourceCommand(val organizationId: String, val resourceId: String, val entityId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest, com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceResult> {



	override fun build(): com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest {
		val input = com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest()
		input.setOrganizationId(this.organizationId)
		input.setResourceId(this.resourceId)
		input.setEntityId(this.entityId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceResult {
	  return com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceResult {
		return environment.workmail.disassociateDelegateFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail disassociate-delegate-from-resource")
				.argument("organization-id", organizationId)
				.argument("resource-id", resourceId)
				.argument("entity-id", entityId)
	}

}


fun AmazonWorkMailFunctions.disassociateMemberFromGroup(organizationId: String, groupId: String, memberId: String, init: AmazonWorkMailDisassociateMemberFromGroupCommand.() -> Unit): com.amazonaws.services.workmail.model.DisassociateMemberFromGroupResult {
	return this.block.declare(AmazonWorkMailDisassociateMemberFromGroupCommand(organizationId, groupId, memberId).apply(init)) as com.amazonaws.services.workmail.model.DisassociateMemberFromGroupResult
}

@Generated
class AmazonWorkMailDisassociateMemberFromGroupCommand(val organizationId: String, val groupId: String, val memberId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest, com.amazonaws.services.workmail.model.DisassociateMemberFromGroupResult> {



	override fun build(): com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest {
		val input = com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest()
		input.setOrganizationId(this.organizationId)
		input.setGroupId(this.groupId)
		input.setMemberId(this.memberId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.DisassociateMemberFromGroupResult {
	  return com.amazonaws.services.workmail.model.DisassociateMemberFromGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.DisassociateMemberFromGroupResult {
		return environment.workmail.disassociateMemberFromGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail disassociate-member-from-group")
				.argument("organization-id", organizationId)
				.argument("group-id", groupId)
				.argument("member-id", memberId)
	}

}


fun AmazonWorkMailFunctions.listAliases(organizationId: String, entityId: String, init: AmazonWorkMailListAliasesCommand.() -> Unit): com.amazonaws.services.workmail.model.ListAliasesResult {
	return this.block.declare(AmazonWorkMailListAliasesCommand(organizationId, entityId).apply(init)) as com.amazonaws.services.workmail.model.ListAliasesResult
}

@Generated
class AmazonWorkMailListAliasesCommand(val organizationId: String, val entityId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.ListAliasesRequest, com.amazonaws.services.workmail.model.ListAliasesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.workmail.model.ListAliasesResult {
	  return com.amazonaws.services.workmail.model.ListAliasesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.ListAliasesResult {
		return environment.workmail.listAliases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail list-aliases")
				.argument("organization-id", organizationId)
				.argument("entity-id", entityId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonWorkMailFunctions.listGroupMembers(organizationId: String, groupId: String, init: AmazonWorkMailListGroupMembersCommand.() -> Unit): com.amazonaws.services.workmail.model.ListGroupMembersResult {
	return this.block.declare(AmazonWorkMailListGroupMembersCommand(organizationId, groupId).apply(init)) as com.amazonaws.services.workmail.model.ListGroupMembersResult
}

@Generated
class AmazonWorkMailListGroupMembersCommand(val organizationId: String, val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.ListGroupMembersRequest, com.amazonaws.services.workmail.model.ListGroupMembersResult> {

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

	
	override fun dryResult(): com.amazonaws.services.workmail.model.ListGroupMembersResult {
	  return com.amazonaws.services.workmail.model.ListGroupMembersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.ListGroupMembersResult {
		return environment.workmail.listGroupMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail list-group-members")
				.argument("organization-id", organizationId)
				.argument("group-id", groupId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonWorkMailFunctions.listGroups(organizationId: String, init: AmazonWorkMailListGroupsCommand.() -> Unit): com.amazonaws.services.workmail.model.ListGroupsResult {
	return this.block.declare(AmazonWorkMailListGroupsCommand(organizationId).apply(init)) as com.amazonaws.services.workmail.model.ListGroupsResult
}

@Generated
class AmazonWorkMailListGroupsCommand(val organizationId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.ListGroupsRequest, com.amazonaws.services.workmail.model.ListGroupsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.workmail.model.ListGroupsRequest {
		val input = com.amazonaws.services.workmail.model.ListGroupsRequest()
		input.setOrganizationId(this.organizationId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.ListGroupsResult {
	  return com.amazonaws.services.workmail.model.ListGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.ListGroupsResult {
		return environment.workmail.listGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail list-groups")
				.argument("organization-id", organizationId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonWorkMailFunctions.listOrganizations(init: AmazonWorkMailListOrganizationsCommand.() -> Unit): com.amazonaws.services.workmail.model.ListOrganizationsResult {
	return this.block.declare(AmazonWorkMailListOrganizationsCommand().apply(init)) as com.amazonaws.services.workmail.model.ListOrganizationsResult
}

@Generated
class AmazonWorkMailListOrganizationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.ListOrganizationsRequest, com.amazonaws.services.workmail.model.ListOrganizationsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.workmail.model.ListOrganizationsRequest {
		val input = com.amazonaws.services.workmail.model.ListOrganizationsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.ListOrganizationsResult {
	  return com.amazonaws.services.workmail.model.ListOrganizationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.ListOrganizationsResult {
		return environment.workmail.listOrganizations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail list-organizations")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonWorkMailFunctions.listResourceDelegates(organizationId: String, resourceId: String, init: AmazonWorkMailListResourceDelegatesCommand.() -> Unit): com.amazonaws.services.workmail.model.ListResourceDelegatesResult {
	return this.block.declare(AmazonWorkMailListResourceDelegatesCommand(organizationId, resourceId).apply(init)) as com.amazonaws.services.workmail.model.ListResourceDelegatesResult
}

@Generated
class AmazonWorkMailListResourceDelegatesCommand(val organizationId: String, val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.ListResourceDelegatesRequest, com.amazonaws.services.workmail.model.ListResourceDelegatesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.workmail.model.ListResourceDelegatesResult {
	  return com.amazonaws.services.workmail.model.ListResourceDelegatesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.ListResourceDelegatesResult {
		return environment.workmail.listResourceDelegates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail list-resource-delegates")
				.argument("organization-id", organizationId)
				.argument("resource-id", resourceId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonWorkMailFunctions.listResources(organizationId: String, init: AmazonWorkMailListResourcesCommand.() -> Unit): com.amazonaws.services.workmail.model.ListResourcesResult {
	return this.block.declare(AmazonWorkMailListResourcesCommand(organizationId).apply(init)) as com.amazonaws.services.workmail.model.ListResourcesResult
}

@Generated
class AmazonWorkMailListResourcesCommand(val organizationId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.ListResourcesRequest, com.amazonaws.services.workmail.model.ListResourcesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.workmail.model.ListResourcesRequest {
		val input = com.amazonaws.services.workmail.model.ListResourcesRequest()
		input.setOrganizationId(this.organizationId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.ListResourcesResult {
	  return com.amazonaws.services.workmail.model.ListResourcesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.ListResourcesResult {
		return environment.workmail.listResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail list-resources")
				.argument("organization-id", organizationId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonWorkMailFunctions.listUsers(organizationId: String, init: AmazonWorkMailListUsersCommand.() -> Unit): com.amazonaws.services.workmail.model.ListUsersResult {
	return this.block.declare(AmazonWorkMailListUsersCommand(organizationId).apply(init)) as com.amazonaws.services.workmail.model.ListUsersResult
}

@Generated
class AmazonWorkMailListUsersCommand(val organizationId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.ListUsersRequest, com.amazonaws.services.workmail.model.ListUsersResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.workmail.model.ListUsersRequest {
		val input = com.amazonaws.services.workmail.model.ListUsersRequest()
		input.setOrganizationId(this.organizationId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.ListUsersResult {
	  return com.amazonaws.services.workmail.model.ListUsersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.ListUsersResult {
		return environment.workmail.listUsers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail list-users")
				.argument("organization-id", organizationId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonWorkMailFunctions.registerToWorkMail(organizationId: String, entityId: String, email: String, init: AmazonWorkMailRegisterToWorkMailCommand.() -> Unit): com.amazonaws.services.workmail.model.RegisterToWorkMailResult {
	return this.block.declare(AmazonWorkMailRegisterToWorkMailCommand(organizationId, entityId, email).apply(init)) as com.amazonaws.services.workmail.model.RegisterToWorkMailResult
}

@Generated
class AmazonWorkMailRegisterToWorkMailCommand(val organizationId: String, val entityId: String, val email: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.RegisterToWorkMailRequest, com.amazonaws.services.workmail.model.RegisterToWorkMailResult> {



	override fun build(): com.amazonaws.services.workmail.model.RegisterToWorkMailRequest {
		val input = com.amazonaws.services.workmail.model.RegisterToWorkMailRequest()
		input.setOrganizationId(this.organizationId)
		input.setEntityId(this.entityId)
		input.setEmail(this.email)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.RegisterToWorkMailResult {
	  return com.amazonaws.services.workmail.model.RegisterToWorkMailResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.RegisterToWorkMailResult {
		return environment.workmail.registerToWorkMail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail register-to-work-mail")
				.argument("organization-id", organizationId)
				.argument("entity-id", entityId)
				.argument("email", email)
	}

}


fun AmazonWorkMailFunctions.resetPassword(organizationId: String, userId: String, password: String, init: AmazonWorkMailResetPasswordCommand.() -> Unit): com.amazonaws.services.workmail.model.ResetPasswordResult {
	return this.block.declare(AmazonWorkMailResetPasswordCommand(organizationId, userId, password).apply(init)) as com.amazonaws.services.workmail.model.ResetPasswordResult
}

@Generated
class AmazonWorkMailResetPasswordCommand(val organizationId: String, val userId: String, val password: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.ResetPasswordRequest, com.amazonaws.services.workmail.model.ResetPasswordResult> {



	override fun build(): com.amazonaws.services.workmail.model.ResetPasswordRequest {
		val input = com.amazonaws.services.workmail.model.ResetPasswordRequest()
		input.setOrganizationId(this.organizationId)
		input.setUserId(this.userId)
		input.setPassword(this.password)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.ResetPasswordResult {
	  return com.amazonaws.services.workmail.model.ResetPasswordResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.ResetPasswordResult {
		return environment.workmail.resetPassword(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail reset-password")
				.argument("organization-id", organizationId)
				.argument("user-id", userId)
				.argument("password", password)
	}

}


fun AmazonWorkMailFunctions.updatePrimaryEmailAddress(organizationId: String, entityId: String, email: String, init: AmazonWorkMailUpdatePrimaryEmailAddressCommand.() -> Unit): com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressResult {
	return this.block.declare(AmazonWorkMailUpdatePrimaryEmailAddressCommand(organizationId, entityId, email).apply(init)) as com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressResult
}

@Generated
class AmazonWorkMailUpdatePrimaryEmailAddressCommand(val organizationId: String, val entityId: String, val email: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest, com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressResult> {



	override fun build(): com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest {
		val input = com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest()
		input.setOrganizationId(this.organizationId)
		input.setEntityId(this.entityId)
		input.setEmail(this.email)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressResult {
	  return com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressResult {
		return environment.workmail.updatePrimaryEmailAddress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail update-primary-email-address")
				.argument("organization-id", organizationId)
				.argument("entity-id", entityId)
				.argument("email", email)
	}

}


fun AmazonWorkMailFunctions.updateResource(organizationId: String, resourceId: String, init: AmazonWorkMailUpdateResourceCommand.() -> Unit): com.amazonaws.services.workmail.model.UpdateResourceResult {
	return this.block.declare(AmazonWorkMailUpdateResourceCommand(organizationId, resourceId).apply(init)) as com.amazonaws.services.workmail.model.UpdateResourceResult
}

@Generated
class AmazonWorkMailUpdateResourceCommand(val organizationId: String, val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.workmail.model.UpdateResourceRequest, com.amazonaws.services.workmail.model.UpdateResourceResult> {

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

	
	override fun dryResult(): com.amazonaws.services.workmail.model.UpdateResourceResult {
	  return com.amazonaws.services.workmail.model.UpdateResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.workmail.model.UpdateResourceResult {
		return environment.workmail.updateResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws workmail update-resource")
				.argument("organization-id", organizationId)
				.argument("resource-id", resourceId)
				.argument("name", name)
				.argument("booking-options", bookingOptions?.toString())
	}

}
