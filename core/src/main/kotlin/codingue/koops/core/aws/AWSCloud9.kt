
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.cloud9.AWSCloud9
import com.amazonaws.services.cloud9.model.*

var codingue.koops.core.Environment.cloud9: AWSCloud9
	get() = this.capabilities[AWSCloud9::class.java.name] as AWSCloud9
	set(cloud9) {
		this.capabilities[AWSCloud9::class.java.name] = cloud9
	}

@Generated
class AWSCloud9Functions(val block: Block)

infix fun AwsContinuation.cloud9(init: AWSCloud9Functions.() -> Unit) {
	AWSCloud9Functions(shell).apply(init)
}

			

fun AWSCloud9Functions.createEnvironmentEC2(init: AWSCloud9CreateEnvironmentEC2Command.() -> Unit) {
	this.block.declare(AWSCloud9CreateEnvironmentEC2Command().apply(init))
}

@Generated
class AWSCloud9CreateEnvironmentEC2Command() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request> {

	var name: String? = null
	var description: String? = null
	var clientRequestToken: String? = null
	var instanceType: String? = null
	var subnetId: String? = null
	var automaticStopTimeMinutes: Int? = 0
	var ownerArn: String? = null

	override fun build(): com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request {
		val input = com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setClientRequestToken(this.clientRequestToken)
		input.setInstanceType(this.instanceType)
		input.setSubnetId(this.subnetId)
		input.setAutomaticStopTimeMinutes(this.automaticStopTimeMinutes)
		input.setOwnerArn(this.ownerArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloud9.createEnvironmentEC2(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 create-environment-ec2")
				.argument("name", name)
				.argument("description", description)
				.argument("client-request-token", clientRequestToken)
				.argument("instance-type", instanceType)
				.argument("subnet-id", subnetId)
				.argument("automatic-stop-time-minutes", automaticStopTimeMinutes?.toString())
				.argument("owner-arn", ownerArn)
	}

}


fun AWSCloud9Functions.createEnvironmentMembership(init: AWSCloud9CreateEnvironmentMembershipCommand.() -> Unit) {
	this.block.declare(AWSCloud9CreateEnvironmentMembershipCommand().apply(init))
}

@Generated
class AWSCloud9CreateEnvironmentMembershipCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest> {

	var environmentId: String? = null
	var userArn: String? = null
	var permissions: MemberPermissions? = null

	override fun build(): com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest {
		val input = com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest()
		input.setEnvironmentId(this.environmentId)
		input.setUserArn(this.userArn)
		input.setPermissions(this.permissions?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloud9.createEnvironmentMembership(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 create-environment-membership")
				.argument("environment-id", environmentId)
				.argument("user-arn", userArn)
				.argument("permissions", permissions?.toString())
	}

}


fun AWSCloud9Functions.deleteEnvironment(init: AWSCloud9DeleteEnvironmentCommand.() -> Unit) {
	this.block.declare(AWSCloud9DeleteEnvironmentCommand().apply(init))
}

@Generated
class AWSCloud9DeleteEnvironmentCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest> {

	var environmentId: String? = null

	override fun build(): com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest {
		val input = com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest()
		input.setEnvironmentId(this.environmentId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloud9.deleteEnvironment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 delete-environment")
				.argument("environment-id", environmentId)
	}

}


fun AWSCloud9Functions.deleteEnvironmentMembership(init: AWSCloud9DeleteEnvironmentMembershipCommand.() -> Unit) {
	this.block.declare(AWSCloud9DeleteEnvironmentMembershipCommand().apply(init))
}

@Generated
class AWSCloud9DeleteEnvironmentMembershipCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest> {

	var environmentId: String? = null
	var userArn: String? = null

	override fun build(): com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest {
		val input = com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest()
		input.setEnvironmentId(this.environmentId)
		input.setUserArn(this.userArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloud9.deleteEnvironmentMembership(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 delete-environment-membership")
				.argument("environment-id", environmentId)
				.argument("user-arn", userArn)
	}

}


fun AWSCloud9Functions.describeEnvironmentMemberships(init: AWSCloud9DescribeEnvironmentMembershipsCommand.() -> Unit) {
	this.block.declare(AWSCloud9DescribeEnvironmentMembershipsCommand().apply(init))
}

@Generated
class AWSCloud9DescribeEnvironmentMembershipsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest> {

	var userArn: String? = null
	var environmentId: String? = null
	var permissions: List<Permissions>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest {
		val input = com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest()
		input.setUserArn(this.userArn)
		input.setEnvironmentId(this.environmentId)
		input.setPermissions(this.permissions?.map { it.toString() })
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloud9.describeEnvironmentMemberships(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 describe-environment-memberships")
				.argument("user-arn", userArn)
				.argument("environment-id", environmentId)
				.argument("permissions", permissions?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCloud9Functions.describeEnvironmentStatus(init: AWSCloud9DescribeEnvironmentStatusCommand.() -> Unit) {
	this.block.declare(AWSCloud9DescribeEnvironmentStatusCommand().apply(init))
}

@Generated
class AWSCloud9DescribeEnvironmentStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest> {

	var environmentId: String? = null

	override fun build(): com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest {
		val input = com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest()
		input.setEnvironmentId(this.environmentId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloud9.describeEnvironmentStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 describe-environment-status")
				.argument("environment-id", environmentId)
	}

}


fun AWSCloud9Functions.describeEnvironments(init: AWSCloud9DescribeEnvironmentsCommand.() -> Unit) {
	this.block.declare(AWSCloud9DescribeEnvironmentsCommand().apply(init))
}

@Generated
class AWSCloud9DescribeEnvironmentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest> {

	var environmentIds: List<String>? = null

	override fun build(): com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest {
		val input = com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest()
		input.setEnvironmentIds(this.environmentIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloud9.describeEnvironments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 describe-environments")
				.argument("environment-ids", environmentIds?.toString())
	}

}


fun AWSCloud9Functions.listEnvironments(init: AWSCloud9ListEnvironmentsCommand.() -> Unit) {
	this.block.declare(AWSCloud9ListEnvironmentsCommand().apply(init))
}

@Generated
class AWSCloud9ListEnvironmentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.ListEnvironmentsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.cloud9.model.ListEnvironmentsRequest {
		val input = com.amazonaws.services.cloud9.model.ListEnvironmentsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloud9.listEnvironments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 list-environments")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCloud9Functions.updateEnvironment(init: AWSCloud9UpdateEnvironmentCommand.() -> Unit) {
	this.block.declare(AWSCloud9UpdateEnvironmentCommand().apply(init))
}

@Generated
class AWSCloud9UpdateEnvironmentCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest> {

	var environmentId: String? = null
	var name: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest {
		val input = com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest()
		input.setEnvironmentId(this.environmentId)
		input.setName(this.name)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloud9.updateEnvironment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 update-environment")
				.argument("environment-id", environmentId)
				.argument("name", name)
				.argument("description", description)
	}

}


fun AWSCloud9Functions.updateEnvironmentMembership(init: AWSCloud9UpdateEnvironmentMembershipCommand.() -> Unit) {
	this.block.declare(AWSCloud9UpdateEnvironmentMembershipCommand().apply(init))
}

@Generated
class AWSCloud9UpdateEnvironmentMembershipCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest> {

	var environmentId: String? = null
	var userArn: String? = null
	var permissions: MemberPermissions? = null

	override fun build(): com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest {
		val input = com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest()
		input.setEnvironmentId(this.environmentId)
		input.setUserArn(this.userArn)
		input.setPermissions(this.permissions?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloud9.updateEnvironmentMembership(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 update-environment-membership")
				.argument("environment-id", environmentId)
				.argument("user-arn", userArn)
				.argument("permissions", permissions?.toString())
	}

}
