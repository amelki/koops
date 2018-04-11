
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.codestar.AWSCodeStar
import com.amazonaws.services.codestar.model.*

var codingue.koops.core.Environment.codestar: AWSCodeStar
	get() = this.capabilities[AWSCodeStar::class.java.name] as AWSCodeStar
	set(codestar) {
		this.capabilities[AWSCodeStar::class.java.name] = codestar
	}

@Generated
class AWSCodeStarFunctions(val block: Block)

infix fun <T> AwsContinuation.codestar(init: AWSCodeStarFunctions.() -> T): T {
	return AWSCodeStarFunctions(shell).run(init)
}

			

fun AWSCodeStarFunctions.associateTeamMember(init: AWSCodeStarAssociateTeamMemberCommand.() -> Unit): com.amazonaws.services.codestar.model.AssociateTeamMemberResult {
	return this.block.declare(AWSCodeStarAssociateTeamMemberCommand().apply(init)) as com.amazonaws.services.codestar.model.AssociateTeamMemberResult
}

@Generated
class AWSCodeStarAssociateTeamMemberCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.AssociateTeamMemberRequest, com.amazonaws.services.codestar.model.AssociateTeamMemberResult> {

	var projectId: String? = null
	var clientRequestToken: String? = null
	var userArn: String? = null
	var projectRole: String? = null
	var remoteAccessAllowed: Boolean? = false

	override fun build(): com.amazonaws.services.codestar.model.AssociateTeamMemberRequest {
		val input = com.amazonaws.services.codestar.model.AssociateTeamMemberRequest()
		input.setProjectId(this.projectId)
		input.setClientRequestToken(this.clientRequestToken)
		input.setUserArn(this.userArn)
		input.setProjectRole(this.projectRole)
		input.setRemoteAccessAllowed(this.remoteAccessAllowed)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.AssociateTeamMemberResult {
	  return com.amazonaws.services.codestar.model.AssociateTeamMemberResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.AssociateTeamMemberResult {
		return environment.codestar.associateTeamMember(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar associate-team-member")
				.argument("project-id", projectId)
				.argument("client-request-token", clientRequestToken)
				.argument("user-arn", userArn)
				.argument("project-role", projectRole)
				.option("remote-access-allowed", remoteAccessAllowed ?: false)
	}

}


fun AWSCodeStarFunctions.createProject(init: AWSCodeStarCreateProjectCommand.() -> Unit): com.amazonaws.services.codestar.model.CreateProjectResult {
	return this.block.declare(AWSCodeStarCreateProjectCommand().apply(init)) as com.amazonaws.services.codestar.model.CreateProjectResult
}

@Generated
class AWSCodeStarCreateProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.CreateProjectRequest, com.amazonaws.services.codestar.model.CreateProjectResult> {

	var name: String? = null
	var id: String? = null
	var description: String? = null
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.codestar.model.CreateProjectRequest {
		val input = com.amazonaws.services.codestar.model.CreateProjectRequest()
		input.setName(this.name)
		input.setId(this.id)
		input.setDescription(this.description)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.CreateProjectResult {
	  return com.amazonaws.services.codestar.model.CreateProjectResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.CreateProjectResult {
		return environment.codestar.createProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar create-project")
				.argument("name", name)
				.argument("id", id)
				.argument("description", description)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AWSCodeStarFunctions.createUserProfile(init: AWSCodeStarCreateUserProfileCommand.() -> Unit): com.amazonaws.services.codestar.model.CreateUserProfileResult {
	return this.block.declare(AWSCodeStarCreateUserProfileCommand().apply(init)) as com.amazonaws.services.codestar.model.CreateUserProfileResult
}

@Generated
class AWSCodeStarCreateUserProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.CreateUserProfileRequest, com.amazonaws.services.codestar.model.CreateUserProfileResult> {

	var userArn: String? = null
	var displayName: String? = null
	var emailAddress: String? = null
	var sshPublicKey: String? = null

	override fun build(): com.amazonaws.services.codestar.model.CreateUserProfileRequest {
		val input = com.amazonaws.services.codestar.model.CreateUserProfileRequest()
		input.setUserArn(this.userArn)
		input.setDisplayName(this.displayName)
		input.setEmailAddress(this.emailAddress)
		input.setSshPublicKey(this.sshPublicKey)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.CreateUserProfileResult {
	  return com.amazonaws.services.codestar.model.CreateUserProfileResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.CreateUserProfileResult {
		return environment.codestar.createUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar create-user-profile")
				.argument("user-arn", userArn)
				.argument("display-name", displayName)
				.argument("email-address", emailAddress)
				.argument("ssh-public-key", sshPublicKey)
	}

}


fun AWSCodeStarFunctions.deleteProject(init: AWSCodeStarDeleteProjectCommand.() -> Unit): com.amazonaws.services.codestar.model.DeleteProjectResult {
	return this.block.declare(AWSCodeStarDeleteProjectCommand().apply(init)) as com.amazonaws.services.codestar.model.DeleteProjectResult
}

@Generated
class AWSCodeStarDeleteProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.DeleteProjectRequest, com.amazonaws.services.codestar.model.DeleteProjectResult> {

	var id: String? = null
	var clientRequestToken: String? = null
	var deleteStack: Boolean? = false

	override fun build(): com.amazonaws.services.codestar.model.DeleteProjectRequest {
		val input = com.amazonaws.services.codestar.model.DeleteProjectRequest()
		input.setId(this.id)
		input.setClientRequestToken(this.clientRequestToken)
		input.setDeleteStack(this.deleteStack)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.DeleteProjectResult {
	  return com.amazonaws.services.codestar.model.DeleteProjectResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.DeleteProjectResult {
		return environment.codestar.deleteProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar delete-project")
				.argument("id", id)
				.argument("client-request-token", clientRequestToken)
				.option("delete-stack", deleteStack ?: false)
	}

}


fun AWSCodeStarFunctions.deleteUserProfile(init: AWSCodeStarDeleteUserProfileCommand.() -> Unit): com.amazonaws.services.codestar.model.DeleteUserProfileResult {
	return this.block.declare(AWSCodeStarDeleteUserProfileCommand().apply(init)) as com.amazonaws.services.codestar.model.DeleteUserProfileResult
}

@Generated
class AWSCodeStarDeleteUserProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.DeleteUserProfileRequest, com.amazonaws.services.codestar.model.DeleteUserProfileResult> {

	var userArn: String? = null

	override fun build(): com.amazonaws.services.codestar.model.DeleteUserProfileRequest {
		val input = com.amazonaws.services.codestar.model.DeleteUserProfileRequest()
		input.setUserArn(this.userArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.DeleteUserProfileResult {
	  return com.amazonaws.services.codestar.model.DeleteUserProfileResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.DeleteUserProfileResult {
		return environment.codestar.deleteUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar delete-user-profile")
				.argument("user-arn", userArn)
	}

}


fun AWSCodeStarFunctions.describeProject(init: AWSCodeStarDescribeProjectCommand.() -> Unit): com.amazonaws.services.codestar.model.DescribeProjectResult {
	return this.block.declare(AWSCodeStarDescribeProjectCommand().apply(init)) as com.amazonaws.services.codestar.model.DescribeProjectResult
}

@Generated
class AWSCodeStarDescribeProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.DescribeProjectRequest, com.amazonaws.services.codestar.model.DescribeProjectResult> {

	var id: String? = null

	override fun build(): com.amazonaws.services.codestar.model.DescribeProjectRequest {
		val input = com.amazonaws.services.codestar.model.DescribeProjectRequest()
		input.setId(this.id)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.DescribeProjectResult {
	  return com.amazonaws.services.codestar.model.DescribeProjectResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.DescribeProjectResult {
		return environment.codestar.describeProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar describe-project")
				.argument("id", id)
	}

}


fun AWSCodeStarFunctions.describeUserProfile(init: AWSCodeStarDescribeUserProfileCommand.() -> Unit): com.amazonaws.services.codestar.model.DescribeUserProfileResult {
	return this.block.declare(AWSCodeStarDescribeUserProfileCommand().apply(init)) as com.amazonaws.services.codestar.model.DescribeUserProfileResult
}

@Generated
class AWSCodeStarDescribeUserProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.DescribeUserProfileRequest, com.amazonaws.services.codestar.model.DescribeUserProfileResult> {

	var userArn: String? = null

	override fun build(): com.amazonaws.services.codestar.model.DescribeUserProfileRequest {
		val input = com.amazonaws.services.codestar.model.DescribeUserProfileRequest()
		input.setUserArn(this.userArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.DescribeUserProfileResult {
	  return com.amazonaws.services.codestar.model.DescribeUserProfileResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.DescribeUserProfileResult {
		return environment.codestar.describeUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar describe-user-profile")
				.argument("user-arn", userArn)
	}

}


fun AWSCodeStarFunctions.disassociateTeamMember(init: AWSCodeStarDisassociateTeamMemberCommand.() -> Unit): com.amazonaws.services.codestar.model.DisassociateTeamMemberResult {
	return this.block.declare(AWSCodeStarDisassociateTeamMemberCommand().apply(init)) as com.amazonaws.services.codestar.model.DisassociateTeamMemberResult
}

@Generated
class AWSCodeStarDisassociateTeamMemberCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest, com.amazonaws.services.codestar.model.DisassociateTeamMemberResult> {

	var projectId: String? = null
	var userArn: String? = null

	override fun build(): com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest {
		val input = com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest()
		input.setProjectId(this.projectId)
		input.setUserArn(this.userArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.DisassociateTeamMemberResult {
	  return com.amazonaws.services.codestar.model.DisassociateTeamMemberResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.DisassociateTeamMemberResult {
		return environment.codestar.disassociateTeamMember(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar disassociate-team-member")
				.argument("project-id", projectId)
				.argument("user-arn", userArn)
	}

}


fun AWSCodeStarFunctions.listProjects(init: AWSCodeStarListProjectsCommand.() -> Unit): com.amazonaws.services.codestar.model.ListProjectsResult {
	return this.block.declare(AWSCodeStarListProjectsCommand().apply(init)) as com.amazonaws.services.codestar.model.ListProjectsResult
}

@Generated
class AWSCodeStarListProjectsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.ListProjectsRequest, com.amazonaws.services.codestar.model.ListProjectsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.codestar.model.ListProjectsRequest {
		val input = com.amazonaws.services.codestar.model.ListProjectsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.ListProjectsResult {
	  return com.amazonaws.services.codestar.model.ListProjectsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.ListProjectsResult {
		return environment.codestar.listProjects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar list-projects")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCodeStarFunctions.listResources(init: AWSCodeStarListResourcesCommand.() -> Unit): com.amazonaws.services.codestar.model.ListResourcesResult {
	return this.block.declare(AWSCodeStarListResourcesCommand().apply(init)) as com.amazonaws.services.codestar.model.ListResourcesResult
}

@Generated
class AWSCodeStarListResourcesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.ListResourcesRequest, com.amazonaws.services.codestar.model.ListResourcesResult> {

	var projectId: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.codestar.model.ListResourcesRequest {
		val input = com.amazonaws.services.codestar.model.ListResourcesRequest()
		input.setProjectId(this.projectId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.ListResourcesResult {
	  return com.amazonaws.services.codestar.model.ListResourcesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.ListResourcesResult {
		return environment.codestar.listResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar list-resources")
				.argument("project-id", projectId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCodeStarFunctions.listTagsForProject(init: AWSCodeStarListTagsForProjectCommand.() -> Unit): com.amazonaws.services.codestar.model.ListTagsForProjectResult {
	return this.block.declare(AWSCodeStarListTagsForProjectCommand().apply(init)) as com.amazonaws.services.codestar.model.ListTagsForProjectResult
}

@Generated
class AWSCodeStarListTagsForProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.ListTagsForProjectRequest, com.amazonaws.services.codestar.model.ListTagsForProjectResult> {

	var id: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.codestar.model.ListTagsForProjectRequest {
		val input = com.amazonaws.services.codestar.model.ListTagsForProjectRequest()
		input.setId(this.id)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.ListTagsForProjectResult {
	  return com.amazonaws.services.codestar.model.ListTagsForProjectResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.ListTagsForProjectResult {
		return environment.codestar.listTagsForProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar list-tags-for-project")
				.argument("id", id)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCodeStarFunctions.listTeamMembers(init: AWSCodeStarListTeamMembersCommand.() -> Unit): com.amazonaws.services.codestar.model.ListTeamMembersResult {
	return this.block.declare(AWSCodeStarListTeamMembersCommand().apply(init)) as com.amazonaws.services.codestar.model.ListTeamMembersResult
}

@Generated
class AWSCodeStarListTeamMembersCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.ListTeamMembersRequest, com.amazonaws.services.codestar.model.ListTeamMembersResult> {

	var projectId: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.codestar.model.ListTeamMembersRequest {
		val input = com.amazonaws.services.codestar.model.ListTeamMembersRequest()
		input.setProjectId(this.projectId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.ListTeamMembersResult {
	  return com.amazonaws.services.codestar.model.ListTeamMembersResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.ListTeamMembersResult {
		return environment.codestar.listTeamMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar list-team-members")
				.argument("project-id", projectId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCodeStarFunctions.listUserProfiles(init: AWSCodeStarListUserProfilesCommand.() -> Unit): com.amazonaws.services.codestar.model.ListUserProfilesResult {
	return this.block.declare(AWSCodeStarListUserProfilesCommand().apply(init)) as com.amazonaws.services.codestar.model.ListUserProfilesResult
}

@Generated
class AWSCodeStarListUserProfilesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.ListUserProfilesRequest, com.amazonaws.services.codestar.model.ListUserProfilesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.codestar.model.ListUserProfilesRequest {
		val input = com.amazonaws.services.codestar.model.ListUserProfilesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.ListUserProfilesResult {
	  return com.amazonaws.services.codestar.model.ListUserProfilesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.ListUserProfilesResult {
		return environment.codestar.listUserProfiles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar list-user-profiles")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCodeStarFunctions.tagProject(init: AWSCodeStarTagProjectCommand.() -> Unit): com.amazonaws.services.codestar.model.TagProjectResult {
	return this.block.declare(AWSCodeStarTagProjectCommand().apply(init)) as com.amazonaws.services.codestar.model.TagProjectResult
}

@Generated
class AWSCodeStarTagProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.TagProjectRequest, com.amazonaws.services.codestar.model.TagProjectResult> {

	var id: String? = null
	var tags: Map<String, String>? = null

	override fun build(): com.amazonaws.services.codestar.model.TagProjectRequest {
		val input = com.amazonaws.services.codestar.model.TagProjectRequest()
		input.setId(this.id)
		input.setTags(this.tags)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.TagProjectResult {
	  return com.amazonaws.services.codestar.model.TagProjectResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.TagProjectResult {
		return environment.codestar.tagProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar tag-project")
				.argument("id", id)
				.argument("tags", tags?.toString())
	}

}


fun AWSCodeStarFunctions.untagProject(init: AWSCodeStarUntagProjectCommand.() -> Unit): com.amazonaws.services.codestar.model.UntagProjectResult {
	return this.block.declare(AWSCodeStarUntagProjectCommand().apply(init)) as com.amazonaws.services.codestar.model.UntagProjectResult
}

@Generated
class AWSCodeStarUntagProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.UntagProjectRequest, com.amazonaws.services.codestar.model.UntagProjectResult> {

	var id: String? = null
	var tags: List<String>? = null

	override fun build(): com.amazonaws.services.codestar.model.UntagProjectRequest {
		val input = com.amazonaws.services.codestar.model.UntagProjectRequest()
		input.setId(this.id)
		input.setTags(this.tags)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.UntagProjectResult {
	  return com.amazonaws.services.codestar.model.UntagProjectResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.UntagProjectResult {
		return environment.codestar.untagProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar untag-project")
				.argument("id", id)
				.argument("tags", tags?.toString())
	}

}


fun AWSCodeStarFunctions.updateProject(init: AWSCodeStarUpdateProjectCommand.() -> Unit): com.amazonaws.services.codestar.model.UpdateProjectResult {
	return this.block.declare(AWSCodeStarUpdateProjectCommand().apply(init)) as com.amazonaws.services.codestar.model.UpdateProjectResult
}

@Generated
class AWSCodeStarUpdateProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.UpdateProjectRequest, com.amazonaws.services.codestar.model.UpdateProjectResult> {

	var id: String? = null
	var name: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.codestar.model.UpdateProjectRequest {
		val input = com.amazonaws.services.codestar.model.UpdateProjectRequest()
		input.setId(this.id)
		input.setName(this.name)
		input.setDescription(this.description)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.UpdateProjectResult {
	  return com.amazonaws.services.codestar.model.UpdateProjectResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.UpdateProjectResult {
		return environment.codestar.updateProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar update-project")
				.argument("id", id)
				.argument("name", name)
				.argument("description", description)
	}

}


fun AWSCodeStarFunctions.updateTeamMember(init: AWSCodeStarUpdateTeamMemberCommand.() -> Unit): com.amazonaws.services.codestar.model.UpdateTeamMemberResult {
	return this.block.declare(AWSCodeStarUpdateTeamMemberCommand().apply(init)) as com.amazonaws.services.codestar.model.UpdateTeamMemberResult
}

@Generated
class AWSCodeStarUpdateTeamMemberCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.UpdateTeamMemberRequest, com.amazonaws.services.codestar.model.UpdateTeamMemberResult> {

	var projectId: String? = null
	var userArn: String? = null
	var projectRole: String? = null
	var remoteAccessAllowed: Boolean? = false

	override fun build(): com.amazonaws.services.codestar.model.UpdateTeamMemberRequest {
		val input = com.amazonaws.services.codestar.model.UpdateTeamMemberRequest()
		input.setProjectId(this.projectId)
		input.setUserArn(this.userArn)
		input.setProjectRole(this.projectRole)
		input.setRemoteAccessAllowed(this.remoteAccessAllowed)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.UpdateTeamMemberResult {
	  return com.amazonaws.services.codestar.model.UpdateTeamMemberResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.UpdateTeamMemberResult {
		return environment.codestar.updateTeamMember(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar update-team-member")
				.argument("project-id", projectId)
				.argument("user-arn", userArn)
				.argument("project-role", projectRole)
				.option("remote-access-allowed", remoteAccessAllowed ?: false)
	}

}


fun AWSCodeStarFunctions.updateUserProfile(init: AWSCodeStarUpdateUserProfileCommand.() -> Unit): com.amazonaws.services.codestar.model.UpdateUserProfileResult {
	return this.block.declare(AWSCodeStarUpdateUserProfileCommand().apply(init)) as com.amazonaws.services.codestar.model.UpdateUserProfileResult
}

@Generated
class AWSCodeStarUpdateUserProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.UpdateUserProfileRequest, com.amazonaws.services.codestar.model.UpdateUserProfileResult> {

	var userArn: String? = null
	var displayName: String? = null
	var emailAddress: String? = null
	var sshPublicKey: String? = null

	override fun build(): com.amazonaws.services.codestar.model.UpdateUserProfileRequest {
		val input = com.amazonaws.services.codestar.model.UpdateUserProfileRequest()
		input.setUserArn(this.userArn)
		input.setDisplayName(this.displayName)
		input.setEmailAddress(this.emailAddress)
		input.setSshPublicKey(this.sshPublicKey)
		return input
	}

	override fun dryResult(): com.amazonaws.services.codestar.model.UpdateUserProfileResult {
	  return com.amazonaws.services.codestar.model.UpdateUserProfileResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codestar.model.UpdateUserProfileResult {
		return environment.codestar.updateUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar update-user-profile")
				.argument("user-arn", userArn)
				.argument("display-name", displayName)
				.argument("email-address", emailAddress)
				.argument("ssh-public-key", sshPublicKey)
	}

}
