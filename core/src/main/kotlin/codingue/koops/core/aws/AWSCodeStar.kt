
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

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

infix fun AwsContinuation.codestar(init: AWSCodeStarFunctions.() -> Unit) {
	AWSCodeStarFunctions(shell).apply(init)
}

			

fun AWSCodeStarFunctions.associateTeamMember(init: AWSCodeStarAssociateTeamMemberCommand.() -> Unit) {
	this.block.declare(AWSCodeStarAssociateTeamMemberCommand().apply(init))
}

@Generated
class AWSCodeStarAssociateTeamMemberCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.AssociateTeamMemberRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.associateTeamMember(build())
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


fun AWSCodeStarFunctions.createProject(init: AWSCodeStarCreateProjectCommand.() -> Unit) {
	this.block.declare(AWSCodeStarCreateProjectCommand().apply(init))
}

@Generated
class AWSCodeStarCreateProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.CreateProjectRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.createProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar create-project")
				.argument("name", name)
				.argument("id", id)
				.argument("description", description)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AWSCodeStarFunctions.createUserProfile(init: AWSCodeStarCreateUserProfileCommand.() -> Unit) {
	this.block.declare(AWSCodeStarCreateUserProfileCommand().apply(init))
}

@Generated
class AWSCodeStarCreateUserProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.CreateUserProfileRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.createUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar create-user-profile")
				.argument("user-arn", userArn)
				.argument("display-name", displayName)
				.argument("email-address", emailAddress)
				.argument("ssh-public-key", sshPublicKey)
	}

}


fun AWSCodeStarFunctions.deleteProject(init: AWSCodeStarDeleteProjectCommand.() -> Unit) {
	this.block.declare(AWSCodeStarDeleteProjectCommand().apply(init))
}

@Generated
class AWSCodeStarDeleteProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.DeleteProjectRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.deleteProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar delete-project")
				.argument("id", id)
				.argument("client-request-token", clientRequestToken)
				.option("delete-stack", deleteStack ?: false)
	}

}


fun AWSCodeStarFunctions.deleteUserProfile(init: AWSCodeStarDeleteUserProfileCommand.() -> Unit) {
	this.block.declare(AWSCodeStarDeleteUserProfileCommand().apply(init))
}

@Generated
class AWSCodeStarDeleteUserProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.DeleteUserProfileRequest> {

	var userArn: String? = null

	override fun build(): com.amazonaws.services.codestar.model.DeleteUserProfileRequest {
		val input = com.amazonaws.services.codestar.model.DeleteUserProfileRequest()
		input.setUserArn(this.userArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.deleteUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar delete-user-profile")
				.argument("user-arn", userArn)
	}

}


fun AWSCodeStarFunctions.describeProject(init: AWSCodeStarDescribeProjectCommand.() -> Unit) {
	this.block.declare(AWSCodeStarDescribeProjectCommand().apply(init))
}

@Generated
class AWSCodeStarDescribeProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.DescribeProjectRequest> {

	var id: String? = null

	override fun build(): com.amazonaws.services.codestar.model.DescribeProjectRequest {
		val input = com.amazonaws.services.codestar.model.DescribeProjectRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.describeProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar describe-project")
				.argument("id", id)
	}

}


fun AWSCodeStarFunctions.describeUserProfile(init: AWSCodeStarDescribeUserProfileCommand.() -> Unit) {
	this.block.declare(AWSCodeStarDescribeUserProfileCommand().apply(init))
}

@Generated
class AWSCodeStarDescribeUserProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.DescribeUserProfileRequest> {

	var userArn: String? = null

	override fun build(): com.amazonaws.services.codestar.model.DescribeUserProfileRequest {
		val input = com.amazonaws.services.codestar.model.DescribeUserProfileRequest()
		input.setUserArn(this.userArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.describeUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar describe-user-profile")
				.argument("user-arn", userArn)
	}

}


fun AWSCodeStarFunctions.disassociateTeamMember(init: AWSCodeStarDisassociateTeamMemberCommand.() -> Unit) {
	this.block.declare(AWSCodeStarDisassociateTeamMemberCommand().apply(init))
}

@Generated
class AWSCodeStarDisassociateTeamMemberCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest> {

	var projectId: String? = null
	var userArn: String? = null

	override fun build(): com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest {
		val input = com.amazonaws.services.codestar.model.DisassociateTeamMemberRequest()
		input.setProjectId(this.projectId)
		input.setUserArn(this.userArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.disassociateTeamMember(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar disassociate-team-member")
				.argument("project-id", projectId)
				.argument("user-arn", userArn)
	}

}


fun AWSCodeStarFunctions.listProjects(init: AWSCodeStarListProjectsCommand.() -> Unit) {
	this.block.declare(AWSCodeStarListProjectsCommand().apply(init))
}

@Generated
class AWSCodeStarListProjectsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.ListProjectsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.codestar.model.ListProjectsRequest {
		val input = com.amazonaws.services.codestar.model.ListProjectsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.listProjects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar list-projects")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCodeStarFunctions.listResources(init: AWSCodeStarListResourcesCommand.() -> Unit) {
	this.block.declare(AWSCodeStarListResourcesCommand().apply(init))
}

@Generated
class AWSCodeStarListResourcesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.ListResourcesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.listResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar list-resources")
				.argument("project-id", projectId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCodeStarFunctions.listTagsForProject(init: AWSCodeStarListTagsForProjectCommand.() -> Unit) {
	this.block.declare(AWSCodeStarListTagsForProjectCommand().apply(init))
}

@Generated
class AWSCodeStarListTagsForProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.ListTagsForProjectRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.listTagsForProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar list-tags-for-project")
				.argument("id", id)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCodeStarFunctions.listTeamMembers(init: AWSCodeStarListTeamMembersCommand.() -> Unit) {
	this.block.declare(AWSCodeStarListTeamMembersCommand().apply(init))
}

@Generated
class AWSCodeStarListTeamMembersCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.ListTeamMembersRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.listTeamMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar list-team-members")
				.argument("project-id", projectId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCodeStarFunctions.listUserProfiles(init: AWSCodeStarListUserProfilesCommand.() -> Unit) {
	this.block.declare(AWSCodeStarListUserProfilesCommand().apply(init))
}

@Generated
class AWSCodeStarListUserProfilesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.ListUserProfilesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.codestar.model.ListUserProfilesRequest {
		val input = com.amazonaws.services.codestar.model.ListUserProfilesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.listUserProfiles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar list-user-profiles")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCodeStarFunctions.tagProject(init: AWSCodeStarTagProjectCommand.() -> Unit) {
	this.block.declare(AWSCodeStarTagProjectCommand().apply(init))
}

@Generated
class AWSCodeStarTagProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.TagProjectRequest> {

	var id: String? = null
	var tags: Map<String, String>? = null

	override fun build(): com.amazonaws.services.codestar.model.TagProjectRequest {
		val input = com.amazonaws.services.codestar.model.TagProjectRequest()
		input.setId(this.id)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.tagProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar tag-project")
				.argument("id", id)
				.argument("tags", tags?.toString())
	}

}


fun AWSCodeStarFunctions.untagProject(init: AWSCodeStarUntagProjectCommand.() -> Unit) {
	this.block.declare(AWSCodeStarUntagProjectCommand().apply(init))
}

@Generated
class AWSCodeStarUntagProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.UntagProjectRequest> {

	var id: String? = null
	var tags: List<String>? = null

	override fun build(): com.amazonaws.services.codestar.model.UntagProjectRequest {
		val input = com.amazonaws.services.codestar.model.UntagProjectRequest()
		input.setId(this.id)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.untagProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar untag-project")
				.argument("id", id)
				.argument("tags", tags?.toString())
	}

}


fun AWSCodeStarFunctions.updateProject(init: AWSCodeStarUpdateProjectCommand.() -> Unit) {
	this.block.declare(AWSCodeStarUpdateProjectCommand().apply(init))
}

@Generated
class AWSCodeStarUpdateProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.UpdateProjectRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.updateProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar update-project")
				.argument("id", id)
				.argument("name", name)
				.argument("description", description)
	}

}


fun AWSCodeStarFunctions.updateTeamMember(init: AWSCodeStarUpdateTeamMemberCommand.() -> Unit) {
	this.block.declare(AWSCodeStarUpdateTeamMemberCommand().apply(init))
}

@Generated
class AWSCodeStarUpdateTeamMemberCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.UpdateTeamMemberRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.updateTeamMember(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar update-team-member")
				.argument("project-id", projectId)
				.argument("user-arn", userArn)
				.argument("project-role", projectRole)
				.option("remote-access-allowed", remoteAccessAllowed ?: false)
	}

}


fun AWSCodeStarFunctions.updateUserProfile(init: AWSCodeStarUpdateUserProfileCommand.() -> Unit) {
	this.block.declare(AWSCodeStarUpdateUserProfileCommand().apply(init))
}

@Generated
class AWSCodeStarUpdateUserProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.codestar.model.UpdateUserProfileRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codestar.updateUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codestar update-user-profile")
				.argument("user-arn", userArn)
				.argument("display-name", displayName)
				.argument("email-address", emailAddress)
				.argument("ssh-public-key", sshPublicKey)
	}

}
