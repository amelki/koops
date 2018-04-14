
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.cloud9

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.cloud9.*
import com.amazonaws.services.cloud9.model.*

var codingue.koops.core.Environment.cloud9: AWSCloud9
	get() {
		var service = this.capabilities["aws-cloud9"]
		if (service == null) {
			service = AWSCloud9ClientBuilder.standard().build()
			this.capabilities["aws-cloud9"] = service
		}
		return service as AWSCloud9
	}
	set(cloud9) {
		this.capabilities["aws-cloud9"] = cloud9
	}

@Generated
class AWSCloud9Functions(val block: Block)

infix fun <T> AwsContinuation.cloud9(init: AWSCloud9Functions.() -> T): T {
	return AWSCloud9Functions(shell).run(init)
}

			

fun AWSCloud9Functions.createEnvironmentEC2(init: AWSCloud9CreateEnvironmentEC2Command.() -> Unit): com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Result {
	return this.block.declare(AWSCloud9CreateEnvironmentEC2Command().apply(init)) as com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Result
}

@Generated
class AWSCloud9CreateEnvironmentEC2Command() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request, com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Result> {

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

	
	override fun dryResult(): com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Result {
	  return com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Result()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Result {
		return environment.cloud9.createEnvironmentEC2(build())
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


fun AWSCloud9Functions.createEnvironmentMembership(init: AWSCloud9CreateEnvironmentMembershipCommand.() -> Unit): com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipResult {
	return this.block.declare(AWSCloud9CreateEnvironmentMembershipCommand().apply(init)) as com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipResult
}

@Generated
class AWSCloud9CreateEnvironmentMembershipCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest, com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipResult {
	  return com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipResult {
		return environment.cloud9.createEnvironmentMembership(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 create-environment-membership")
				.argument("environment-id", environmentId)
				.argument("user-arn", userArn)
				.argument("permissions", permissions?.toString())
	}

}


fun AWSCloud9Functions.deleteEnvironment(init: AWSCloud9DeleteEnvironmentCommand.() -> Unit): com.amazonaws.services.cloud9.model.DeleteEnvironmentResult {
	return this.block.declare(AWSCloud9DeleteEnvironmentCommand().apply(init)) as com.amazonaws.services.cloud9.model.DeleteEnvironmentResult
}

@Generated
class AWSCloud9DeleteEnvironmentCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest, com.amazonaws.services.cloud9.model.DeleteEnvironmentResult> {

	var environmentId: String? = null

	override fun build(): com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest {
		val input = com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest()
		input.setEnvironmentId(this.environmentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloud9.model.DeleteEnvironmentResult {
	  return com.amazonaws.services.cloud9.model.DeleteEnvironmentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloud9.model.DeleteEnvironmentResult {
		return environment.cloud9.deleteEnvironment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 delete-environment")
				.argument("environment-id", environmentId)
	}

}


fun AWSCloud9Functions.deleteEnvironmentMembership(init: AWSCloud9DeleteEnvironmentMembershipCommand.() -> Unit): com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipResult {
	return this.block.declare(AWSCloud9DeleteEnvironmentMembershipCommand().apply(init)) as com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipResult
}

@Generated
class AWSCloud9DeleteEnvironmentMembershipCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest, com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipResult> {

	var environmentId: String? = null
	var userArn: String? = null

	override fun build(): com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest {
		val input = com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest()
		input.setEnvironmentId(this.environmentId)
		input.setUserArn(this.userArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipResult {
	  return com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipResult {
		return environment.cloud9.deleteEnvironmentMembership(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 delete-environment-membership")
				.argument("environment-id", environmentId)
				.argument("user-arn", userArn)
	}

}


fun AWSCloud9Functions.describeEnvironmentMemberships(init: AWSCloud9DescribeEnvironmentMembershipsCommand.() -> Unit): com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsResult {
	return this.block.declare(AWSCloud9DescribeEnvironmentMembershipsCommand().apply(init)) as com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsResult
}

@Generated
class AWSCloud9DescribeEnvironmentMembershipsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest, com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsResult {
	  return com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsResult {
		return environment.cloud9.describeEnvironmentMemberships(build())
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


fun AWSCloud9Functions.describeEnvironmentStatus(init: AWSCloud9DescribeEnvironmentStatusCommand.() -> Unit): com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusResult {
	return this.block.declare(AWSCloud9DescribeEnvironmentStatusCommand().apply(init)) as com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusResult
}

@Generated
class AWSCloud9DescribeEnvironmentStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest, com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusResult> {

	var environmentId: String? = null

	override fun build(): com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest {
		val input = com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest()
		input.setEnvironmentId(this.environmentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusResult {
	  return com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusResult {
		return environment.cloud9.describeEnvironmentStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 describe-environment-status")
				.argument("environment-id", environmentId)
	}

}


fun AWSCloud9Functions.describeEnvironments(init: AWSCloud9DescribeEnvironmentsCommand.() -> Unit): com.amazonaws.services.cloud9.model.DescribeEnvironmentsResult {
	return this.block.declare(AWSCloud9DescribeEnvironmentsCommand().apply(init)) as com.amazonaws.services.cloud9.model.DescribeEnvironmentsResult
}

@Generated
class AWSCloud9DescribeEnvironmentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest, com.amazonaws.services.cloud9.model.DescribeEnvironmentsResult> {

	var environmentIds: List<String>? = null

	override fun build(): com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest {
		val input = com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest()
		input.setEnvironmentIds(this.environmentIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloud9.model.DescribeEnvironmentsResult {
	  return com.amazonaws.services.cloud9.model.DescribeEnvironmentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloud9.model.DescribeEnvironmentsResult {
		return environment.cloud9.describeEnvironments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 describe-environments")
				.argument("environment-ids", environmentIds?.toString())
	}

}


fun AWSCloud9Functions.listEnvironments(init: AWSCloud9ListEnvironmentsCommand.() -> Unit): com.amazonaws.services.cloud9.model.ListEnvironmentsResult {
	return this.block.declare(AWSCloud9ListEnvironmentsCommand().apply(init)) as com.amazonaws.services.cloud9.model.ListEnvironmentsResult
}

@Generated
class AWSCloud9ListEnvironmentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.ListEnvironmentsRequest, com.amazonaws.services.cloud9.model.ListEnvironmentsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.cloud9.model.ListEnvironmentsRequest {
		val input = com.amazonaws.services.cloud9.model.ListEnvironmentsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloud9.model.ListEnvironmentsResult {
	  return com.amazonaws.services.cloud9.model.ListEnvironmentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloud9.model.ListEnvironmentsResult {
		return environment.cloud9.listEnvironments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 list-environments")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCloud9Functions.updateEnvironment(init: AWSCloud9UpdateEnvironmentCommand.() -> Unit): com.amazonaws.services.cloud9.model.UpdateEnvironmentResult {
	return this.block.declare(AWSCloud9UpdateEnvironmentCommand().apply(init)) as com.amazonaws.services.cloud9.model.UpdateEnvironmentResult
}

@Generated
class AWSCloud9UpdateEnvironmentCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest, com.amazonaws.services.cloud9.model.UpdateEnvironmentResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloud9.model.UpdateEnvironmentResult {
	  return com.amazonaws.services.cloud9.model.UpdateEnvironmentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloud9.model.UpdateEnvironmentResult {
		return environment.cloud9.updateEnvironment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 update-environment")
				.argument("environment-id", environmentId)
				.argument("name", name)
				.argument("description", description)
	}

}


fun AWSCloud9Functions.updateEnvironmentMembership(init: AWSCloud9UpdateEnvironmentMembershipCommand.() -> Unit): com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipResult {
	return this.block.declare(AWSCloud9UpdateEnvironmentMembershipCommand().apply(init)) as com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipResult
}

@Generated
class AWSCloud9UpdateEnvironmentMembershipCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest, com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipResult {
	  return com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipResult {
		return environment.cloud9.updateEnvironmentMembership(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloud9 update-environment-membership")
				.argument("environment-id", environmentId)
				.argument("user-arn", userArn)
				.argument("permissions", permissions?.toString())
	}

}
