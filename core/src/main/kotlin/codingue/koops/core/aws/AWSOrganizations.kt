
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.organizations.AWSOrganizations
import com.amazonaws.services.organizations.model.*

var codingue.koops.core.Environment.organizations: AWSOrganizations
	get() = this.capabilities[AWSOrganizations::class.java.name] as AWSOrganizations
	set(organizations) {
		this.capabilities[AWSOrganizations::class.java.name] = organizations
	}

@Generated
class AWSOrganizationsFunctions(val block: Block)

infix fun <T> AwsContinuation.organizations(init: AWSOrganizationsFunctions.() -> T): T {
	return AWSOrganizationsFunctions(shell).run(init)
}

			

fun AWSOrganizationsFunctions.acceptHandshake(handshakeId: String, init: AWSOrganizationsAcceptHandshakeCommand.() -> Unit): com.amazonaws.services.organizations.model.AcceptHandshakeResult {
	return this.block.declare(AWSOrganizationsAcceptHandshakeCommand(handshakeId).apply(init)) as com.amazonaws.services.organizations.model.AcceptHandshakeResult
}

@Generated
class AWSOrganizationsAcceptHandshakeCommand(val handshakeId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.AcceptHandshakeRequest, com.amazonaws.services.organizations.model.AcceptHandshakeResult> {



	override fun build(): com.amazonaws.services.organizations.model.AcceptHandshakeRequest {
		val input = com.amazonaws.services.organizations.model.AcceptHandshakeRequest()
		input.setHandshakeId(this.handshakeId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.AcceptHandshakeResult {
	  return com.amazonaws.services.organizations.model.AcceptHandshakeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.AcceptHandshakeResult {
		return environment.organizations.acceptHandshake(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations accept-handshake")
				.argument("handshake-id", handshakeId)
	}

}


fun AWSOrganizationsFunctions.attachPolicy(policyId: String, targetId: String, init: AWSOrganizationsAttachPolicyCommand.() -> Unit): com.amazonaws.services.organizations.model.AttachPolicyResult {
	return this.block.declare(AWSOrganizationsAttachPolicyCommand(policyId, targetId).apply(init)) as com.amazonaws.services.organizations.model.AttachPolicyResult
}

@Generated
class AWSOrganizationsAttachPolicyCommand(val policyId: String, val targetId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.AttachPolicyRequest, com.amazonaws.services.organizations.model.AttachPolicyResult> {



	override fun build(): com.amazonaws.services.organizations.model.AttachPolicyRequest {
		val input = com.amazonaws.services.organizations.model.AttachPolicyRequest()
		input.setPolicyId(this.policyId)
		input.setTargetId(this.targetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.AttachPolicyResult {
	  return com.amazonaws.services.organizations.model.AttachPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.AttachPolicyResult {
		return environment.organizations.attachPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations attach-policy")
				.argument("policy-id", policyId)
				.argument("target-id", targetId)
	}

}


fun AWSOrganizationsFunctions.cancelHandshake(handshakeId: String, init: AWSOrganizationsCancelHandshakeCommand.() -> Unit): com.amazonaws.services.organizations.model.CancelHandshakeResult {
	return this.block.declare(AWSOrganizationsCancelHandshakeCommand(handshakeId).apply(init)) as com.amazonaws.services.organizations.model.CancelHandshakeResult
}

@Generated
class AWSOrganizationsCancelHandshakeCommand(val handshakeId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.CancelHandshakeRequest, com.amazonaws.services.organizations.model.CancelHandshakeResult> {



	override fun build(): com.amazonaws.services.organizations.model.CancelHandshakeRequest {
		val input = com.amazonaws.services.organizations.model.CancelHandshakeRequest()
		input.setHandshakeId(this.handshakeId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.CancelHandshakeResult {
	  return com.amazonaws.services.organizations.model.CancelHandshakeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.CancelHandshakeResult {
		return environment.organizations.cancelHandshake(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations cancel-handshake")
				.argument("handshake-id", handshakeId)
	}

}


fun AWSOrganizationsFunctions.createAccount(email: String, accountName: String, init: AWSOrganizationsCreateAccountCommand.() -> Unit): com.amazonaws.services.organizations.model.CreateAccountResult {
	return this.block.declare(AWSOrganizationsCreateAccountCommand(email, accountName).apply(init)) as com.amazonaws.services.organizations.model.CreateAccountResult
}

@Generated
class AWSOrganizationsCreateAccountCommand(val email: String, val accountName: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.CreateAccountRequest, com.amazonaws.services.organizations.model.CreateAccountResult> {

	var roleName: String? = null
	var iamUserAccessToBilling: IAMUserAccessToBilling? = null

	override fun build(): com.amazonaws.services.organizations.model.CreateAccountRequest {
		val input = com.amazonaws.services.organizations.model.CreateAccountRequest()
		input.setEmail(this.email)
		input.setAccountName(this.accountName)
		input.setRoleName(this.roleName)
		input.setIamUserAccessToBilling(this.iamUserAccessToBilling?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.CreateAccountResult {
	  return com.amazonaws.services.organizations.model.CreateAccountResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.CreateAccountResult {
		return environment.organizations.createAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations create-account")
				.argument("email", email)
				.argument("account-name", accountName)
				.argument("role-name", roleName)
				.argument("iam-user-access-to-billing", iamUserAccessToBilling?.toString())
	}

}


fun AWSOrganizationsFunctions.createOrganization(init: AWSOrganizationsCreateOrganizationCommand.() -> Unit): com.amazonaws.services.organizations.model.CreateOrganizationResult {
	return this.block.declare(AWSOrganizationsCreateOrganizationCommand().apply(init)) as com.amazonaws.services.organizations.model.CreateOrganizationResult
}

@Generated
class AWSOrganizationsCreateOrganizationCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.CreateOrganizationRequest, com.amazonaws.services.organizations.model.CreateOrganizationResult> {

	var featureSet: OrganizationFeatureSet? = null

	override fun build(): com.amazonaws.services.organizations.model.CreateOrganizationRequest {
		val input = com.amazonaws.services.organizations.model.CreateOrganizationRequest()
		input.setFeatureSet(this.featureSet?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.CreateOrganizationResult {
	  return com.amazonaws.services.organizations.model.CreateOrganizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.CreateOrganizationResult {
		return environment.organizations.createOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations create-organization")
				.argument("feature-set", featureSet?.toString())
	}

}


fun AWSOrganizationsFunctions.createOrganizationalUnit(parentId: String, name: String, init: AWSOrganizationsCreateOrganizationalUnitCommand.() -> Unit): com.amazonaws.services.organizations.model.CreateOrganizationalUnitResult {
	return this.block.declare(AWSOrganizationsCreateOrganizationalUnitCommand(parentId, name).apply(init)) as com.amazonaws.services.organizations.model.CreateOrganizationalUnitResult
}

@Generated
class AWSOrganizationsCreateOrganizationalUnitCommand(val parentId: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.CreateOrganizationalUnitRequest, com.amazonaws.services.organizations.model.CreateOrganizationalUnitResult> {



	override fun build(): com.amazonaws.services.organizations.model.CreateOrganizationalUnitRequest {
		val input = com.amazonaws.services.organizations.model.CreateOrganizationalUnitRequest()
		input.setParentId(this.parentId)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.CreateOrganizationalUnitResult {
	  return com.amazonaws.services.organizations.model.CreateOrganizationalUnitResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.CreateOrganizationalUnitResult {
		return environment.organizations.createOrganizationalUnit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations create-organizational-unit")
				.argument("parent-id", parentId)
				.argument("name", name)
	}

}


fun AWSOrganizationsFunctions.createPolicy(content: String, description: String, name: String, type: PolicyType, init: AWSOrganizationsCreatePolicyCommand.() -> Unit): com.amazonaws.services.organizations.model.CreatePolicyResult {
	return this.block.declare(AWSOrganizationsCreatePolicyCommand(content, description, name, type).apply(init)) as com.amazonaws.services.organizations.model.CreatePolicyResult
}

@Generated
class AWSOrganizationsCreatePolicyCommand(val content: String, val description: String, val name: String, val type: PolicyType) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.CreatePolicyRequest, com.amazonaws.services.organizations.model.CreatePolicyResult> {



	override fun build(): com.amazonaws.services.organizations.model.CreatePolicyRequest {
		val input = com.amazonaws.services.organizations.model.CreatePolicyRequest()
		input.setContent(this.content)
		input.setDescription(this.description)
		input.setName(this.name)
		input.setType(this.type.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.CreatePolicyResult {
	  return com.amazonaws.services.organizations.model.CreatePolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.CreatePolicyResult {
		return environment.organizations.createPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations create-policy")
				.argument("content", content)
				.argument("description", description)
				.argument("name", name)
				.argument("type", type.toString())
	}

}


fun AWSOrganizationsFunctions.declineHandshake(handshakeId: String, init: AWSOrganizationsDeclineHandshakeCommand.() -> Unit): com.amazonaws.services.organizations.model.DeclineHandshakeResult {
	return this.block.declare(AWSOrganizationsDeclineHandshakeCommand(handshakeId).apply(init)) as com.amazonaws.services.organizations.model.DeclineHandshakeResult
}

@Generated
class AWSOrganizationsDeclineHandshakeCommand(val handshakeId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DeclineHandshakeRequest, com.amazonaws.services.organizations.model.DeclineHandshakeResult> {



	override fun build(): com.amazonaws.services.organizations.model.DeclineHandshakeRequest {
		val input = com.amazonaws.services.organizations.model.DeclineHandshakeRequest()
		input.setHandshakeId(this.handshakeId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.DeclineHandshakeResult {
	  return com.amazonaws.services.organizations.model.DeclineHandshakeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.DeclineHandshakeResult {
		return environment.organizations.declineHandshake(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations decline-handshake")
				.argument("handshake-id", handshakeId)
	}

}


fun AWSOrganizationsFunctions.deleteOrganization(init: AWSOrganizationsDeleteOrganizationCommand.() -> Unit): com.amazonaws.services.organizations.model.DeleteOrganizationResult {
	return this.block.declare(AWSOrganizationsDeleteOrganizationCommand().apply(init)) as com.amazonaws.services.organizations.model.DeleteOrganizationResult
}

@Generated
class AWSOrganizationsDeleteOrganizationCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DeleteOrganizationRequest, com.amazonaws.services.organizations.model.DeleteOrganizationResult> {



	override fun build(): com.amazonaws.services.organizations.model.DeleteOrganizationRequest {
		val input = com.amazonaws.services.organizations.model.DeleteOrganizationRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.DeleteOrganizationResult {
	  return com.amazonaws.services.organizations.model.DeleteOrganizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.DeleteOrganizationResult {
		return environment.organizations.deleteOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations delete-organization")

	}

}


fun AWSOrganizationsFunctions.deleteOrganizationalUnit(organizationalUnitId: String, init: AWSOrganizationsDeleteOrganizationalUnitCommand.() -> Unit): com.amazonaws.services.organizations.model.DeleteOrganizationalUnitResult {
	return this.block.declare(AWSOrganizationsDeleteOrganizationalUnitCommand(organizationalUnitId).apply(init)) as com.amazonaws.services.organizations.model.DeleteOrganizationalUnitResult
}

@Generated
class AWSOrganizationsDeleteOrganizationalUnitCommand(val organizationalUnitId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DeleteOrganizationalUnitRequest, com.amazonaws.services.organizations.model.DeleteOrganizationalUnitResult> {



	override fun build(): com.amazonaws.services.organizations.model.DeleteOrganizationalUnitRequest {
		val input = com.amazonaws.services.organizations.model.DeleteOrganizationalUnitRequest()
		input.setOrganizationalUnitId(this.organizationalUnitId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.DeleteOrganizationalUnitResult {
	  return com.amazonaws.services.organizations.model.DeleteOrganizationalUnitResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.DeleteOrganizationalUnitResult {
		return environment.organizations.deleteOrganizationalUnit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations delete-organizational-unit")
				.argument("organizational-unit-id", organizationalUnitId)
	}

}


fun AWSOrganizationsFunctions.deletePolicy(policyId: String, init: AWSOrganizationsDeletePolicyCommand.() -> Unit): com.amazonaws.services.organizations.model.DeletePolicyResult {
	return this.block.declare(AWSOrganizationsDeletePolicyCommand(policyId).apply(init)) as com.amazonaws.services.organizations.model.DeletePolicyResult
}

@Generated
class AWSOrganizationsDeletePolicyCommand(val policyId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DeletePolicyRequest, com.amazonaws.services.organizations.model.DeletePolicyResult> {



	override fun build(): com.amazonaws.services.organizations.model.DeletePolicyRequest {
		val input = com.amazonaws.services.organizations.model.DeletePolicyRequest()
		input.setPolicyId(this.policyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.DeletePolicyResult {
	  return com.amazonaws.services.organizations.model.DeletePolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.DeletePolicyResult {
		return environment.organizations.deletePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations delete-policy")
				.argument("policy-id", policyId)
	}

}


fun AWSOrganizationsFunctions.describeAccount(accountId: String, init: AWSOrganizationsDescribeAccountCommand.() -> Unit): com.amazonaws.services.organizations.model.DescribeAccountResult {
	return this.block.declare(AWSOrganizationsDescribeAccountCommand(accountId).apply(init)) as com.amazonaws.services.organizations.model.DescribeAccountResult
}

@Generated
class AWSOrganizationsDescribeAccountCommand(val accountId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DescribeAccountRequest, com.amazonaws.services.organizations.model.DescribeAccountResult> {



	override fun build(): com.amazonaws.services.organizations.model.DescribeAccountRequest {
		val input = com.amazonaws.services.organizations.model.DescribeAccountRequest()
		input.setAccountId(this.accountId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.DescribeAccountResult {
	  return com.amazonaws.services.organizations.model.DescribeAccountResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.DescribeAccountResult {
		return environment.organizations.describeAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations describe-account")
				.argument("account-id", accountId)
	}

}


fun AWSOrganizationsFunctions.describeCreateAccountStatus(createAccountRequestId: String, init: AWSOrganizationsDescribeCreateAccountStatusCommand.() -> Unit): com.amazonaws.services.organizations.model.DescribeCreateAccountStatusResult {
	return this.block.declare(AWSOrganizationsDescribeCreateAccountStatusCommand(createAccountRequestId).apply(init)) as com.amazonaws.services.organizations.model.DescribeCreateAccountStatusResult
}

@Generated
class AWSOrganizationsDescribeCreateAccountStatusCommand(val createAccountRequestId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DescribeCreateAccountStatusRequest, com.amazonaws.services.organizations.model.DescribeCreateAccountStatusResult> {



	override fun build(): com.amazonaws.services.organizations.model.DescribeCreateAccountStatusRequest {
		val input = com.amazonaws.services.organizations.model.DescribeCreateAccountStatusRequest()
		input.setCreateAccountRequestId(this.createAccountRequestId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.DescribeCreateAccountStatusResult {
	  return com.amazonaws.services.organizations.model.DescribeCreateAccountStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.DescribeCreateAccountStatusResult {
		return environment.organizations.describeCreateAccountStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations describe-create-account-status")
				.argument("create-account-request-id", createAccountRequestId)
	}

}


fun AWSOrganizationsFunctions.describeHandshake(handshakeId: String, init: AWSOrganizationsDescribeHandshakeCommand.() -> Unit): com.amazonaws.services.organizations.model.DescribeHandshakeResult {
	return this.block.declare(AWSOrganizationsDescribeHandshakeCommand(handshakeId).apply(init)) as com.amazonaws.services.organizations.model.DescribeHandshakeResult
}

@Generated
class AWSOrganizationsDescribeHandshakeCommand(val handshakeId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DescribeHandshakeRequest, com.amazonaws.services.organizations.model.DescribeHandshakeResult> {



	override fun build(): com.amazonaws.services.organizations.model.DescribeHandshakeRequest {
		val input = com.amazonaws.services.organizations.model.DescribeHandshakeRequest()
		input.setHandshakeId(this.handshakeId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.DescribeHandshakeResult {
	  return com.amazonaws.services.organizations.model.DescribeHandshakeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.DescribeHandshakeResult {
		return environment.organizations.describeHandshake(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations describe-handshake")
				.argument("handshake-id", handshakeId)
	}

}


fun AWSOrganizationsFunctions.describeOrganization(init: AWSOrganizationsDescribeOrganizationCommand.() -> Unit): com.amazonaws.services.organizations.model.DescribeOrganizationResult {
	return this.block.declare(AWSOrganizationsDescribeOrganizationCommand().apply(init)) as com.amazonaws.services.organizations.model.DescribeOrganizationResult
}

@Generated
class AWSOrganizationsDescribeOrganizationCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DescribeOrganizationRequest, com.amazonaws.services.organizations.model.DescribeOrganizationResult> {



	override fun build(): com.amazonaws.services.organizations.model.DescribeOrganizationRequest {
		val input = com.amazonaws.services.organizations.model.DescribeOrganizationRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.DescribeOrganizationResult {
	  return com.amazonaws.services.organizations.model.DescribeOrganizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.DescribeOrganizationResult {
		return environment.organizations.describeOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations describe-organization")

	}

}


fun AWSOrganizationsFunctions.describeOrganizationalUnit(organizationalUnitId: String, init: AWSOrganizationsDescribeOrganizationalUnitCommand.() -> Unit): com.amazonaws.services.organizations.model.DescribeOrganizationalUnitResult {
	return this.block.declare(AWSOrganizationsDescribeOrganizationalUnitCommand(organizationalUnitId).apply(init)) as com.amazonaws.services.organizations.model.DescribeOrganizationalUnitResult
}

@Generated
class AWSOrganizationsDescribeOrganizationalUnitCommand(val organizationalUnitId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DescribeOrganizationalUnitRequest, com.amazonaws.services.organizations.model.DescribeOrganizationalUnitResult> {



	override fun build(): com.amazonaws.services.organizations.model.DescribeOrganizationalUnitRequest {
		val input = com.amazonaws.services.organizations.model.DescribeOrganizationalUnitRequest()
		input.setOrganizationalUnitId(this.organizationalUnitId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.DescribeOrganizationalUnitResult {
	  return com.amazonaws.services.organizations.model.DescribeOrganizationalUnitResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.DescribeOrganizationalUnitResult {
		return environment.organizations.describeOrganizationalUnit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations describe-organizational-unit")
				.argument("organizational-unit-id", organizationalUnitId)
	}

}


fun AWSOrganizationsFunctions.describePolicy(policyId: String, init: AWSOrganizationsDescribePolicyCommand.() -> Unit): com.amazonaws.services.organizations.model.DescribePolicyResult {
	return this.block.declare(AWSOrganizationsDescribePolicyCommand(policyId).apply(init)) as com.amazonaws.services.organizations.model.DescribePolicyResult
}

@Generated
class AWSOrganizationsDescribePolicyCommand(val policyId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DescribePolicyRequest, com.amazonaws.services.organizations.model.DescribePolicyResult> {



	override fun build(): com.amazonaws.services.organizations.model.DescribePolicyRequest {
		val input = com.amazonaws.services.organizations.model.DescribePolicyRequest()
		input.setPolicyId(this.policyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.DescribePolicyResult {
	  return com.amazonaws.services.organizations.model.DescribePolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.DescribePolicyResult {
		return environment.organizations.describePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations describe-policy")
				.argument("policy-id", policyId)
	}

}


fun AWSOrganizationsFunctions.detachPolicy(policyId: String, targetId: String, init: AWSOrganizationsDetachPolicyCommand.() -> Unit): com.amazonaws.services.organizations.model.DetachPolicyResult {
	return this.block.declare(AWSOrganizationsDetachPolicyCommand(policyId, targetId).apply(init)) as com.amazonaws.services.organizations.model.DetachPolicyResult
}

@Generated
class AWSOrganizationsDetachPolicyCommand(val policyId: String, val targetId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DetachPolicyRequest, com.amazonaws.services.organizations.model.DetachPolicyResult> {



	override fun build(): com.amazonaws.services.organizations.model.DetachPolicyRequest {
		val input = com.amazonaws.services.organizations.model.DetachPolicyRequest()
		input.setPolicyId(this.policyId)
		input.setTargetId(this.targetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.DetachPolicyResult {
	  return com.amazonaws.services.organizations.model.DetachPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.DetachPolicyResult {
		return environment.organizations.detachPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations detach-policy")
				.argument("policy-id", policyId)
				.argument("target-id", targetId)
	}

}


fun AWSOrganizationsFunctions.disableAWSServiceAccess(servicePrincipal: String, init: AWSOrganizationsDisableAWSServiceAccessCommand.() -> Unit): com.amazonaws.services.organizations.model.DisableAWSServiceAccessResult {
	return this.block.declare(AWSOrganizationsDisableAWSServiceAccessCommand(servicePrincipal).apply(init)) as com.amazonaws.services.organizations.model.DisableAWSServiceAccessResult
}

@Generated
class AWSOrganizationsDisableAWSServiceAccessCommand(val servicePrincipal: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DisableAWSServiceAccessRequest, com.amazonaws.services.organizations.model.DisableAWSServiceAccessResult> {



	override fun build(): com.amazonaws.services.organizations.model.DisableAWSServiceAccessRequest {
		val input = com.amazonaws.services.organizations.model.DisableAWSServiceAccessRequest()
		input.setServicePrincipal(this.servicePrincipal)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.DisableAWSServiceAccessResult {
	  return com.amazonaws.services.organizations.model.DisableAWSServiceAccessResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.DisableAWSServiceAccessResult {
		return environment.organizations.disableAWSServiceAccess(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations disable-awsservice-access")
				.argument("service-principal", servicePrincipal)
	}

}


fun AWSOrganizationsFunctions.disablePolicyType(rootId: String, policyType: PolicyType, init: AWSOrganizationsDisablePolicyTypeCommand.() -> Unit): com.amazonaws.services.organizations.model.DisablePolicyTypeResult {
	return this.block.declare(AWSOrganizationsDisablePolicyTypeCommand(rootId, policyType).apply(init)) as com.amazonaws.services.organizations.model.DisablePolicyTypeResult
}

@Generated
class AWSOrganizationsDisablePolicyTypeCommand(val rootId: String, val policyType: PolicyType) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DisablePolicyTypeRequest, com.amazonaws.services.organizations.model.DisablePolicyTypeResult> {



	override fun build(): com.amazonaws.services.organizations.model.DisablePolicyTypeRequest {
		val input = com.amazonaws.services.organizations.model.DisablePolicyTypeRequest()
		input.setRootId(this.rootId)
		input.setPolicyType(this.policyType.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.DisablePolicyTypeResult {
	  return com.amazonaws.services.organizations.model.DisablePolicyTypeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.DisablePolicyTypeResult {
		return environment.organizations.disablePolicyType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations disable-policy-type")
				.argument("root-id", rootId)
				.argument("policy-type", policyType.toString())
	}

}


fun AWSOrganizationsFunctions.enableAWSServiceAccess(servicePrincipal: String, init: AWSOrganizationsEnableAWSServiceAccessCommand.() -> Unit): com.amazonaws.services.organizations.model.EnableAWSServiceAccessResult {
	return this.block.declare(AWSOrganizationsEnableAWSServiceAccessCommand(servicePrincipal).apply(init)) as com.amazonaws.services.organizations.model.EnableAWSServiceAccessResult
}

@Generated
class AWSOrganizationsEnableAWSServiceAccessCommand(val servicePrincipal: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.EnableAWSServiceAccessRequest, com.amazonaws.services.organizations.model.EnableAWSServiceAccessResult> {



	override fun build(): com.amazonaws.services.organizations.model.EnableAWSServiceAccessRequest {
		val input = com.amazonaws.services.organizations.model.EnableAWSServiceAccessRequest()
		input.setServicePrincipal(this.servicePrincipal)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.EnableAWSServiceAccessResult {
	  return com.amazonaws.services.organizations.model.EnableAWSServiceAccessResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.EnableAWSServiceAccessResult {
		return environment.organizations.enableAWSServiceAccess(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations enable-awsservice-access")
				.argument("service-principal", servicePrincipal)
	}

}


fun AWSOrganizationsFunctions.enableAllFeatures(init: AWSOrganizationsEnableAllFeaturesCommand.() -> Unit): com.amazonaws.services.organizations.model.EnableAllFeaturesResult {
	return this.block.declare(AWSOrganizationsEnableAllFeaturesCommand().apply(init)) as com.amazonaws.services.organizations.model.EnableAllFeaturesResult
}

@Generated
class AWSOrganizationsEnableAllFeaturesCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.EnableAllFeaturesRequest, com.amazonaws.services.organizations.model.EnableAllFeaturesResult> {



	override fun build(): com.amazonaws.services.organizations.model.EnableAllFeaturesRequest {
		val input = com.amazonaws.services.organizations.model.EnableAllFeaturesRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.EnableAllFeaturesResult {
	  return com.amazonaws.services.organizations.model.EnableAllFeaturesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.EnableAllFeaturesResult {
		return environment.organizations.enableAllFeatures(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations enable-all-features")

	}

}


fun AWSOrganizationsFunctions.enablePolicyType(rootId: String, policyType: PolicyType, init: AWSOrganizationsEnablePolicyTypeCommand.() -> Unit): com.amazonaws.services.organizations.model.EnablePolicyTypeResult {
	return this.block.declare(AWSOrganizationsEnablePolicyTypeCommand(rootId, policyType).apply(init)) as com.amazonaws.services.organizations.model.EnablePolicyTypeResult
}

@Generated
class AWSOrganizationsEnablePolicyTypeCommand(val rootId: String, val policyType: PolicyType) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.EnablePolicyTypeRequest, com.amazonaws.services.organizations.model.EnablePolicyTypeResult> {



	override fun build(): com.amazonaws.services.organizations.model.EnablePolicyTypeRequest {
		val input = com.amazonaws.services.organizations.model.EnablePolicyTypeRequest()
		input.setRootId(this.rootId)
		input.setPolicyType(this.policyType.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.EnablePolicyTypeResult {
	  return com.amazonaws.services.organizations.model.EnablePolicyTypeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.EnablePolicyTypeResult {
		return environment.organizations.enablePolicyType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations enable-policy-type")
				.argument("root-id", rootId)
				.argument("policy-type", policyType.toString())
	}

}


fun AWSOrganizationsFunctions.inviteAccountToOrganization(target: com.amazonaws.services.organizations.model.HandshakeParty, init: AWSOrganizationsInviteAccountToOrganizationCommand.() -> Unit): com.amazonaws.services.organizations.model.InviteAccountToOrganizationResult {
	return this.block.declare(AWSOrganizationsInviteAccountToOrganizationCommand(target).apply(init)) as com.amazonaws.services.organizations.model.InviteAccountToOrganizationResult
}

@Generated
class AWSOrganizationsInviteAccountToOrganizationCommand(val target: com.amazonaws.services.organizations.model.HandshakeParty) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.InviteAccountToOrganizationRequest, com.amazonaws.services.organizations.model.InviteAccountToOrganizationResult> {

	var notes: String? = null

	override fun build(): com.amazonaws.services.organizations.model.InviteAccountToOrganizationRequest {
		val input = com.amazonaws.services.organizations.model.InviteAccountToOrganizationRequest()
		input.setTarget(this.target)
		input.setNotes(this.notes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.InviteAccountToOrganizationResult {
	  return com.amazonaws.services.organizations.model.InviteAccountToOrganizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.InviteAccountToOrganizationResult {
		return environment.organizations.inviteAccountToOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations invite-account-to-organization")
				.argument("target", target.toString())
				.argument("notes", notes)
	}

}


fun AWSOrganizationsFunctions.leaveOrganization(init: AWSOrganizationsLeaveOrganizationCommand.() -> Unit): com.amazonaws.services.organizations.model.LeaveOrganizationResult {
	return this.block.declare(AWSOrganizationsLeaveOrganizationCommand().apply(init)) as com.amazonaws.services.organizations.model.LeaveOrganizationResult
}

@Generated
class AWSOrganizationsLeaveOrganizationCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.LeaveOrganizationRequest, com.amazonaws.services.organizations.model.LeaveOrganizationResult> {



	override fun build(): com.amazonaws.services.organizations.model.LeaveOrganizationRequest {
		val input = com.amazonaws.services.organizations.model.LeaveOrganizationRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.LeaveOrganizationResult {
	  return com.amazonaws.services.organizations.model.LeaveOrganizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.LeaveOrganizationResult {
		return environment.organizations.leaveOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations leave-organization")

	}

}


fun AWSOrganizationsFunctions.listAWSServiceAccessForOrganization(init: AWSOrganizationsListAWSServiceAccessForOrganizationCommand.() -> Unit): com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationResult {
	return this.block.declare(AWSOrganizationsListAWSServiceAccessForOrganizationCommand().apply(init)) as com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationResult
}

@Generated
class AWSOrganizationsListAWSServiceAccessForOrganizationCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationRequest, com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationRequest {
		val input = com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationResult {
	  return com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationResult {
		return environment.organizations.listAWSServiceAccessForOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-awsservice-access-for-organization")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listAccounts(init: AWSOrganizationsListAccountsCommand.() -> Unit): com.amazonaws.services.organizations.model.ListAccountsResult {
	return this.block.declare(AWSOrganizationsListAccountsCommand().apply(init)) as com.amazonaws.services.organizations.model.ListAccountsResult
}

@Generated
class AWSOrganizationsListAccountsCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListAccountsRequest, com.amazonaws.services.organizations.model.ListAccountsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListAccountsRequest {
		val input = com.amazonaws.services.organizations.model.ListAccountsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.ListAccountsResult {
	  return com.amazonaws.services.organizations.model.ListAccountsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.ListAccountsResult {
		return environment.organizations.listAccounts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-accounts")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listAccountsForParent(parentId: String, init: AWSOrganizationsListAccountsForParentCommand.() -> Unit): com.amazonaws.services.organizations.model.ListAccountsForParentResult {
	return this.block.declare(AWSOrganizationsListAccountsForParentCommand(parentId).apply(init)) as com.amazonaws.services.organizations.model.ListAccountsForParentResult
}

@Generated
class AWSOrganizationsListAccountsForParentCommand(val parentId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListAccountsForParentRequest, com.amazonaws.services.organizations.model.ListAccountsForParentResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListAccountsForParentRequest {
		val input = com.amazonaws.services.organizations.model.ListAccountsForParentRequest()
		input.setParentId(this.parentId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.ListAccountsForParentResult {
	  return com.amazonaws.services.organizations.model.ListAccountsForParentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.ListAccountsForParentResult {
		return environment.organizations.listAccountsForParent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-accounts-for-parent")
				.argument("parent-id", parentId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listChildren(parentId: String, childType: ChildType, init: AWSOrganizationsListChildrenCommand.() -> Unit): com.amazonaws.services.organizations.model.ListChildrenResult {
	return this.block.declare(AWSOrganizationsListChildrenCommand(parentId, childType).apply(init)) as com.amazonaws.services.organizations.model.ListChildrenResult
}

@Generated
class AWSOrganizationsListChildrenCommand(val parentId: String, val childType: ChildType) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListChildrenRequest, com.amazonaws.services.organizations.model.ListChildrenResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListChildrenRequest {
		val input = com.amazonaws.services.organizations.model.ListChildrenRequest()
		input.setParentId(this.parentId)
		input.setChildType(this.childType.toString())
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.ListChildrenResult {
	  return com.amazonaws.services.organizations.model.ListChildrenResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.ListChildrenResult {
		return environment.organizations.listChildren(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-children")
				.argument("parent-id", parentId)
				.argument("child-type", childType.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listCreateAccountStatus(init: AWSOrganizationsListCreateAccountStatusCommand.() -> Unit): com.amazonaws.services.organizations.model.ListCreateAccountStatusResult {
	return this.block.declare(AWSOrganizationsListCreateAccountStatusCommand().apply(init)) as com.amazonaws.services.organizations.model.ListCreateAccountStatusResult
}

@Generated
class AWSOrganizationsListCreateAccountStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListCreateAccountStatusRequest, com.amazonaws.services.organizations.model.ListCreateAccountStatusResult> {

	var states: List<CreateAccountState>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListCreateAccountStatusRequest {
		val input = com.amazonaws.services.organizations.model.ListCreateAccountStatusRequest()
		input.setStates(this.states?.map { it.toString() })
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.ListCreateAccountStatusResult {
	  return com.amazonaws.services.organizations.model.ListCreateAccountStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.ListCreateAccountStatusResult {
		return environment.organizations.listCreateAccountStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-create-account-status")
				.argument("states", states?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listHandshakesForAccount(init: AWSOrganizationsListHandshakesForAccountCommand.() -> Unit): com.amazonaws.services.organizations.model.ListHandshakesForAccountResult {
	return this.block.declare(AWSOrganizationsListHandshakesForAccountCommand().apply(init)) as com.amazonaws.services.organizations.model.ListHandshakesForAccountResult
}

@Generated
class AWSOrganizationsListHandshakesForAccountCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListHandshakesForAccountRequest, com.amazonaws.services.organizations.model.ListHandshakesForAccountResult> {

	var filter: com.amazonaws.services.organizations.model.HandshakeFilter? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListHandshakesForAccountRequest {
		val input = com.amazonaws.services.organizations.model.ListHandshakesForAccountRequest()
		input.setFilter(this.filter)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.ListHandshakesForAccountResult {
	  return com.amazonaws.services.organizations.model.ListHandshakesForAccountResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.ListHandshakesForAccountResult {
		return environment.organizations.listHandshakesForAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-handshakes-for-account")
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listHandshakesForOrganization(init: AWSOrganizationsListHandshakesForOrganizationCommand.() -> Unit): com.amazonaws.services.organizations.model.ListHandshakesForOrganizationResult {
	return this.block.declare(AWSOrganizationsListHandshakesForOrganizationCommand().apply(init)) as com.amazonaws.services.organizations.model.ListHandshakesForOrganizationResult
}

@Generated
class AWSOrganizationsListHandshakesForOrganizationCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListHandshakesForOrganizationRequest, com.amazonaws.services.organizations.model.ListHandshakesForOrganizationResult> {

	var filter: com.amazonaws.services.organizations.model.HandshakeFilter? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListHandshakesForOrganizationRequest {
		val input = com.amazonaws.services.organizations.model.ListHandshakesForOrganizationRequest()
		input.setFilter(this.filter)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.ListHandshakesForOrganizationResult {
	  return com.amazonaws.services.organizations.model.ListHandshakesForOrganizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.ListHandshakesForOrganizationResult {
		return environment.organizations.listHandshakesForOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-handshakes-for-organization")
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listOrganizationalUnitsForParent(parentId: String, init: AWSOrganizationsListOrganizationalUnitsForParentCommand.() -> Unit): com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentResult {
	return this.block.declare(AWSOrganizationsListOrganizationalUnitsForParentCommand(parentId).apply(init)) as com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentResult
}

@Generated
class AWSOrganizationsListOrganizationalUnitsForParentCommand(val parentId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentRequest, com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentRequest {
		val input = com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentRequest()
		input.setParentId(this.parentId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentResult {
	  return com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentResult {
		return environment.organizations.listOrganizationalUnitsForParent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-organizational-units-for-parent")
				.argument("parent-id", parentId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listParents(childId: String, init: AWSOrganizationsListParentsCommand.() -> Unit): com.amazonaws.services.organizations.model.ListParentsResult {
	return this.block.declare(AWSOrganizationsListParentsCommand(childId).apply(init)) as com.amazonaws.services.organizations.model.ListParentsResult
}

@Generated
class AWSOrganizationsListParentsCommand(val childId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListParentsRequest, com.amazonaws.services.organizations.model.ListParentsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListParentsRequest {
		val input = com.amazonaws.services.organizations.model.ListParentsRequest()
		input.setChildId(this.childId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.ListParentsResult {
	  return com.amazonaws.services.organizations.model.ListParentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.ListParentsResult {
		return environment.organizations.listParents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-parents")
				.argument("child-id", childId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listPolicies(filter: PolicyType, init: AWSOrganizationsListPoliciesCommand.() -> Unit): com.amazonaws.services.organizations.model.ListPoliciesResult {
	return this.block.declare(AWSOrganizationsListPoliciesCommand(filter).apply(init)) as com.amazonaws.services.organizations.model.ListPoliciesResult
}

@Generated
class AWSOrganizationsListPoliciesCommand(val filter: PolicyType) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListPoliciesRequest, com.amazonaws.services.organizations.model.ListPoliciesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListPoliciesRequest {
		val input = com.amazonaws.services.organizations.model.ListPoliciesRequest()
		input.setFilter(this.filter.toString())
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.ListPoliciesResult {
	  return com.amazonaws.services.organizations.model.ListPoliciesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.ListPoliciesResult {
		return environment.organizations.listPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-policies")
				.argument("filter", filter.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listPoliciesForTarget(targetId: String, filter: PolicyType, init: AWSOrganizationsListPoliciesForTargetCommand.() -> Unit): com.amazonaws.services.organizations.model.ListPoliciesForTargetResult {
	return this.block.declare(AWSOrganizationsListPoliciesForTargetCommand(targetId, filter).apply(init)) as com.amazonaws.services.organizations.model.ListPoliciesForTargetResult
}

@Generated
class AWSOrganizationsListPoliciesForTargetCommand(val targetId: String, val filter: PolicyType) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListPoliciesForTargetRequest, com.amazonaws.services.organizations.model.ListPoliciesForTargetResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListPoliciesForTargetRequest {
		val input = com.amazonaws.services.organizations.model.ListPoliciesForTargetRequest()
		input.setTargetId(this.targetId)
		input.setFilter(this.filter.toString())
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.ListPoliciesForTargetResult {
	  return com.amazonaws.services.organizations.model.ListPoliciesForTargetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.ListPoliciesForTargetResult {
		return environment.organizations.listPoliciesForTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-policies-for-target")
				.argument("target-id", targetId)
				.argument("filter", filter.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listRoots(init: AWSOrganizationsListRootsCommand.() -> Unit): com.amazonaws.services.organizations.model.ListRootsResult {
	return this.block.declare(AWSOrganizationsListRootsCommand().apply(init)) as com.amazonaws.services.organizations.model.ListRootsResult
}

@Generated
class AWSOrganizationsListRootsCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListRootsRequest, com.amazonaws.services.organizations.model.ListRootsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListRootsRequest {
		val input = com.amazonaws.services.organizations.model.ListRootsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.ListRootsResult {
	  return com.amazonaws.services.organizations.model.ListRootsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.ListRootsResult {
		return environment.organizations.listRoots(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-roots")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listTargetsForPolicy(policyId: String, init: AWSOrganizationsListTargetsForPolicyCommand.() -> Unit): com.amazonaws.services.organizations.model.ListTargetsForPolicyResult {
	return this.block.declare(AWSOrganizationsListTargetsForPolicyCommand(policyId).apply(init)) as com.amazonaws.services.organizations.model.ListTargetsForPolicyResult
}

@Generated
class AWSOrganizationsListTargetsForPolicyCommand(val policyId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListTargetsForPolicyRequest, com.amazonaws.services.organizations.model.ListTargetsForPolicyResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListTargetsForPolicyRequest {
		val input = com.amazonaws.services.organizations.model.ListTargetsForPolicyRequest()
		input.setPolicyId(this.policyId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.ListTargetsForPolicyResult {
	  return com.amazonaws.services.organizations.model.ListTargetsForPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.ListTargetsForPolicyResult {
		return environment.organizations.listTargetsForPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-targets-for-policy")
				.argument("policy-id", policyId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.moveAccount(accountId: String, sourceParentId: String, destinationParentId: String, init: AWSOrganizationsMoveAccountCommand.() -> Unit): com.amazonaws.services.organizations.model.MoveAccountResult {
	return this.block.declare(AWSOrganizationsMoveAccountCommand(accountId, sourceParentId, destinationParentId).apply(init)) as com.amazonaws.services.organizations.model.MoveAccountResult
}

@Generated
class AWSOrganizationsMoveAccountCommand(val accountId: String, val sourceParentId: String, val destinationParentId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.MoveAccountRequest, com.amazonaws.services.organizations.model.MoveAccountResult> {



	override fun build(): com.amazonaws.services.organizations.model.MoveAccountRequest {
		val input = com.amazonaws.services.organizations.model.MoveAccountRequest()
		input.setAccountId(this.accountId)
		input.setSourceParentId(this.sourceParentId)
		input.setDestinationParentId(this.destinationParentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.MoveAccountResult {
	  return com.amazonaws.services.organizations.model.MoveAccountResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.MoveAccountResult {
		return environment.organizations.moveAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations move-account")
				.argument("account-id", accountId)
				.argument("source-parent-id", sourceParentId)
				.argument("destination-parent-id", destinationParentId)
	}

}


fun AWSOrganizationsFunctions.removeAccountFromOrganization(accountId: String, init: AWSOrganizationsRemoveAccountFromOrganizationCommand.() -> Unit): com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationResult {
	return this.block.declare(AWSOrganizationsRemoveAccountFromOrganizationCommand(accountId).apply(init)) as com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationResult
}

@Generated
class AWSOrganizationsRemoveAccountFromOrganizationCommand(val accountId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationRequest, com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationResult> {



	override fun build(): com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationRequest {
		val input = com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationRequest()
		input.setAccountId(this.accountId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationResult {
	  return com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationResult {
		return environment.organizations.removeAccountFromOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations remove-account-from-organization")
				.argument("account-id", accountId)
	}

}


fun AWSOrganizationsFunctions.updateOrganizationalUnit(organizationalUnitId: String, init: AWSOrganizationsUpdateOrganizationalUnitCommand.() -> Unit): com.amazonaws.services.organizations.model.UpdateOrganizationalUnitResult {
	return this.block.declare(AWSOrganizationsUpdateOrganizationalUnitCommand(organizationalUnitId).apply(init)) as com.amazonaws.services.organizations.model.UpdateOrganizationalUnitResult
}

@Generated
class AWSOrganizationsUpdateOrganizationalUnitCommand(val organizationalUnitId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.UpdateOrganizationalUnitRequest, com.amazonaws.services.organizations.model.UpdateOrganizationalUnitResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.organizations.model.UpdateOrganizationalUnitRequest {
		val input = com.amazonaws.services.organizations.model.UpdateOrganizationalUnitRequest()
		input.setOrganizationalUnitId(this.organizationalUnitId)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.UpdateOrganizationalUnitResult {
	  return com.amazonaws.services.organizations.model.UpdateOrganizationalUnitResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.UpdateOrganizationalUnitResult {
		return environment.organizations.updateOrganizationalUnit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations update-organizational-unit")
				.argument("organizational-unit-id", organizationalUnitId)
				.argument("name", name)
	}

}


fun AWSOrganizationsFunctions.updatePolicy(policyId: String, init: AWSOrganizationsUpdatePolicyCommand.() -> Unit): com.amazonaws.services.organizations.model.UpdatePolicyResult {
	return this.block.declare(AWSOrganizationsUpdatePolicyCommand(policyId).apply(init)) as com.amazonaws.services.organizations.model.UpdatePolicyResult
}

@Generated
class AWSOrganizationsUpdatePolicyCommand(val policyId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.UpdatePolicyRequest, com.amazonaws.services.organizations.model.UpdatePolicyResult> {

	var name: String? = null
	var description: String? = null
	var content: String? = null

	override fun build(): com.amazonaws.services.organizations.model.UpdatePolicyRequest {
		val input = com.amazonaws.services.organizations.model.UpdatePolicyRequest()
		input.setPolicyId(this.policyId)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setContent(this.content)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.organizations.model.UpdatePolicyResult {
	  return com.amazonaws.services.organizations.model.UpdatePolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.organizations.model.UpdatePolicyResult {
		return environment.organizations.updatePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations update-policy")
				.argument("policy-id", policyId)
				.argument("name", name)
				.argument("description", description)
				.argument("content", content)
	}

}
