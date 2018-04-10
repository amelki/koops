
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
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

infix fun AwsContinuation.organizations(init: AWSOrganizationsFunctions.() -> Unit) {
	AWSOrganizationsFunctions(shell).apply(init)
}

			

fun AWSOrganizationsFunctions.acceptHandshake(handshakeId: String, init: AWSOrganizationsAcceptHandshakeCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsAcceptHandshakeCommand(handshakeId).apply(init))
}

@Generated
class AWSOrganizationsAcceptHandshakeCommand(val handshakeId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.AcceptHandshakeRequest> {



	override fun build(): com.amazonaws.services.organizations.model.AcceptHandshakeRequest {
		val input = com.amazonaws.services.organizations.model.AcceptHandshakeRequest()
		input.setHandshakeId(this.handshakeId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.acceptHandshake(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations accept-handshake")
				.argument("handshake-id", handshakeId)
	}

}


fun AWSOrganizationsFunctions.attachPolicy(policyId: String, targetId: String, init: AWSOrganizationsAttachPolicyCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsAttachPolicyCommand(policyId, targetId).apply(init))
}

@Generated
class AWSOrganizationsAttachPolicyCommand(val policyId: String, val targetId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.AttachPolicyRequest> {



	override fun build(): com.amazonaws.services.organizations.model.AttachPolicyRequest {
		val input = com.amazonaws.services.organizations.model.AttachPolicyRequest()
		input.setPolicyId(this.policyId)
		input.setTargetId(this.targetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.attachPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations attach-policy")
				.argument("policy-id", policyId)
				.argument("target-id", targetId)
	}

}


fun AWSOrganizationsFunctions.cancelHandshake(handshakeId: String, init: AWSOrganizationsCancelHandshakeCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsCancelHandshakeCommand(handshakeId).apply(init))
}

@Generated
class AWSOrganizationsCancelHandshakeCommand(val handshakeId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.CancelHandshakeRequest> {



	override fun build(): com.amazonaws.services.organizations.model.CancelHandshakeRequest {
		val input = com.amazonaws.services.organizations.model.CancelHandshakeRequest()
		input.setHandshakeId(this.handshakeId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.cancelHandshake(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations cancel-handshake")
				.argument("handshake-id", handshakeId)
	}

}


fun AWSOrganizationsFunctions.createAccount(email: String, accountName: String, init: AWSOrganizationsCreateAccountCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsCreateAccountCommand(email, accountName).apply(init))
}

@Generated
class AWSOrganizationsCreateAccountCommand(val email: String, val accountName: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.CreateAccountRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.createAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations create-account")
				.argument("email", email)
				.argument("account-name", accountName)
				.argument("role-name", roleName)
				.argument("iam-user-access-to-billing", iamUserAccessToBilling?.toString())
	}

}


fun AWSOrganizationsFunctions.createOrganization(init: AWSOrganizationsCreateOrganizationCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsCreateOrganizationCommand().apply(init))
}

@Generated
class AWSOrganizationsCreateOrganizationCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.CreateOrganizationRequest> {

	var featureSet: OrganizationFeatureSet? = null

	override fun build(): com.amazonaws.services.organizations.model.CreateOrganizationRequest {
		val input = com.amazonaws.services.organizations.model.CreateOrganizationRequest()
		input.setFeatureSet(this.featureSet?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.createOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations create-organization")
				.argument("feature-set", featureSet?.toString())
	}

}


fun AWSOrganizationsFunctions.createOrganizationalUnit(parentId: String, name: String, init: AWSOrganizationsCreateOrganizationalUnitCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsCreateOrganizationalUnitCommand(parentId, name).apply(init))
}

@Generated
class AWSOrganizationsCreateOrganizationalUnitCommand(val parentId: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.CreateOrganizationalUnitRequest> {



	override fun build(): com.amazonaws.services.organizations.model.CreateOrganizationalUnitRequest {
		val input = com.amazonaws.services.organizations.model.CreateOrganizationalUnitRequest()
		input.setParentId(this.parentId)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.createOrganizationalUnit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations create-organizational-unit")
				.argument("parent-id", parentId)
				.argument("name", name)
	}

}


fun AWSOrganizationsFunctions.createPolicy(content: String, description: String, name: String, type: PolicyType, init: AWSOrganizationsCreatePolicyCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsCreatePolicyCommand(content, description, name, type).apply(init))
}

@Generated
class AWSOrganizationsCreatePolicyCommand(val content: String, val description: String, val name: String, val type: PolicyType) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.CreatePolicyRequest> {



	override fun build(): com.amazonaws.services.organizations.model.CreatePolicyRequest {
		val input = com.amazonaws.services.organizations.model.CreatePolicyRequest()
		input.setContent(this.content)
		input.setDescription(this.description)
		input.setName(this.name)
		input.setType(this.type.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.createPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations create-policy")
				.argument("content", content)
				.argument("description", description)
				.argument("name", name)
				.argument("type", type.toString())
	}

}


fun AWSOrganizationsFunctions.declineHandshake(handshakeId: String, init: AWSOrganizationsDeclineHandshakeCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsDeclineHandshakeCommand(handshakeId).apply(init))
}

@Generated
class AWSOrganizationsDeclineHandshakeCommand(val handshakeId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DeclineHandshakeRequest> {



	override fun build(): com.amazonaws.services.organizations.model.DeclineHandshakeRequest {
		val input = com.amazonaws.services.organizations.model.DeclineHandshakeRequest()
		input.setHandshakeId(this.handshakeId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.declineHandshake(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations decline-handshake")
				.argument("handshake-id", handshakeId)
	}

}


fun AWSOrganizationsFunctions.deleteOrganization(init: AWSOrganizationsDeleteOrganizationCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsDeleteOrganizationCommand().apply(init))
}

@Generated
class AWSOrganizationsDeleteOrganizationCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DeleteOrganizationRequest> {



	override fun build(): com.amazonaws.services.organizations.model.DeleteOrganizationRequest {
		val input = com.amazonaws.services.organizations.model.DeleteOrganizationRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.deleteOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations delete-organization")

	}

}


fun AWSOrganizationsFunctions.deleteOrganizationalUnit(organizationalUnitId: String, init: AWSOrganizationsDeleteOrganizationalUnitCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsDeleteOrganizationalUnitCommand(organizationalUnitId).apply(init))
}

@Generated
class AWSOrganizationsDeleteOrganizationalUnitCommand(val organizationalUnitId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DeleteOrganizationalUnitRequest> {



	override fun build(): com.amazonaws.services.organizations.model.DeleteOrganizationalUnitRequest {
		val input = com.amazonaws.services.organizations.model.DeleteOrganizationalUnitRequest()
		input.setOrganizationalUnitId(this.organizationalUnitId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.deleteOrganizationalUnit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations delete-organizational-unit")
				.argument("organizational-unit-id", organizationalUnitId)
	}

}


fun AWSOrganizationsFunctions.deletePolicy(policyId: String, init: AWSOrganizationsDeletePolicyCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsDeletePolicyCommand(policyId).apply(init))
}

@Generated
class AWSOrganizationsDeletePolicyCommand(val policyId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DeletePolicyRequest> {



	override fun build(): com.amazonaws.services.organizations.model.DeletePolicyRequest {
		val input = com.amazonaws.services.organizations.model.DeletePolicyRequest()
		input.setPolicyId(this.policyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.deletePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations delete-policy")
				.argument("policy-id", policyId)
	}

}


fun AWSOrganizationsFunctions.describeAccount(accountId: String, init: AWSOrganizationsDescribeAccountCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsDescribeAccountCommand(accountId).apply(init))
}

@Generated
class AWSOrganizationsDescribeAccountCommand(val accountId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DescribeAccountRequest> {



	override fun build(): com.amazonaws.services.organizations.model.DescribeAccountRequest {
		val input = com.amazonaws.services.organizations.model.DescribeAccountRequest()
		input.setAccountId(this.accountId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.describeAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations describe-account")
				.argument("account-id", accountId)
	}

}


fun AWSOrganizationsFunctions.describeCreateAccountStatus(createAccountRequestId: String, init: AWSOrganizationsDescribeCreateAccountStatusCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsDescribeCreateAccountStatusCommand(createAccountRequestId).apply(init))
}

@Generated
class AWSOrganizationsDescribeCreateAccountStatusCommand(val createAccountRequestId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DescribeCreateAccountStatusRequest> {



	override fun build(): com.amazonaws.services.organizations.model.DescribeCreateAccountStatusRequest {
		val input = com.amazonaws.services.organizations.model.DescribeCreateAccountStatusRequest()
		input.setCreateAccountRequestId(this.createAccountRequestId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.describeCreateAccountStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations describe-create-account-status")
				.argument("create-account-request-id", createAccountRequestId)
	}

}


fun AWSOrganizationsFunctions.describeHandshake(handshakeId: String, init: AWSOrganizationsDescribeHandshakeCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsDescribeHandshakeCommand(handshakeId).apply(init))
}

@Generated
class AWSOrganizationsDescribeHandshakeCommand(val handshakeId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DescribeHandshakeRequest> {



	override fun build(): com.amazonaws.services.organizations.model.DescribeHandshakeRequest {
		val input = com.amazonaws.services.organizations.model.DescribeHandshakeRequest()
		input.setHandshakeId(this.handshakeId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.describeHandshake(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations describe-handshake")
				.argument("handshake-id", handshakeId)
	}

}


fun AWSOrganizationsFunctions.describeOrganization(init: AWSOrganizationsDescribeOrganizationCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsDescribeOrganizationCommand().apply(init))
}

@Generated
class AWSOrganizationsDescribeOrganizationCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DescribeOrganizationRequest> {



	override fun build(): com.amazonaws.services.organizations.model.DescribeOrganizationRequest {
		val input = com.amazonaws.services.organizations.model.DescribeOrganizationRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.describeOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations describe-organization")

	}

}


fun AWSOrganizationsFunctions.describeOrganizationalUnit(organizationalUnitId: String, init: AWSOrganizationsDescribeOrganizationalUnitCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsDescribeOrganizationalUnitCommand(organizationalUnitId).apply(init))
}

@Generated
class AWSOrganizationsDescribeOrganizationalUnitCommand(val organizationalUnitId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DescribeOrganizationalUnitRequest> {



	override fun build(): com.amazonaws.services.organizations.model.DescribeOrganizationalUnitRequest {
		val input = com.amazonaws.services.organizations.model.DescribeOrganizationalUnitRequest()
		input.setOrganizationalUnitId(this.organizationalUnitId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.describeOrganizationalUnit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations describe-organizational-unit")
				.argument("organizational-unit-id", organizationalUnitId)
	}

}


fun AWSOrganizationsFunctions.describePolicy(policyId: String, init: AWSOrganizationsDescribePolicyCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsDescribePolicyCommand(policyId).apply(init))
}

@Generated
class AWSOrganizationsDescribePolicyCommand(val policyId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DescribePolicyRequest> {



	override fun build(): com.amazonaws.services.organizations.model.DescribePolicyRequest {
		val input = com.amazonaws.services.organizations.model.DescribePolicyRequest()
		input.setPolicyId(this.policyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.describePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations describe-policy")
				.argument("policy-id", policyId)
	}

}


fun AWSOrganizationsFunctions.detachPolicy(policyId: String, targetId: String, init: AWSOrganizationsDetachPolicyCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsDetachPolicyCommand(policyId, targetId).apply(init))
}

@Generated
class AWSOrganizationsDetachPolicyCommand(val policyId: String, val targetId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DetachPolicyRequest> {



	override fun build(): com.amazonaws.services.organizations.model.DetachPolicyRequest {
		val input = com.amazonaws.services.organizations.model.DetachPolicyRequest()
		input.setPolicyId(this.policyId)
		input.setTargetId(this.targetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.detachPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations detach-policy")
				.argument("policy-id", policyId)
				.argument("target-id", targetId)
	}

}


fun AWSOrganizationsFunctions.disableAWSServiceAccess(servicePrincipal: String, init: AWSOrganizationsDisableAWSServiceAccessCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsDisableAWSServiceAccessCommand(servicePrincipal).apply(init))
}

@Generated
class AWSOrganizationsDisableAWSServiceAccessCommand(val servicePrincipal: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DisableAWSServiceAccessRequest> {



	override fun build(): com.amazonaws.services.organizations.model.DisableAWSServiceAccessRequest {
		val input = com.amazonaws.services.organizations.model.DisableAWSServiceAccessRequest()
		input.setServicePrincipal(this.servicePrincipal)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.disableAWSServiceAccess(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations disable-awsservice-access")
				.argument("service-principal", servicePrincipal)
	}

}


fun AWSOrganizationsFunctions.disablePolicyType(rootId: String, policyType: PolicyType, init: AWSOrganizationsDisablePolicyTypeCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsDisablePolicyTypeCommand(rootId, policyType).apply(init))
}

@Generated
class AWSOrganizationsDisablePolicyTypeCommand(val rootId: String, val policyType: PolicyType) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.DisablePolicyTypeRequest> {



	override fun build(): com.amazonaws.services.organizations.model.DisablePolicyTypeRequest {
		val input = com.amazonaws.services.organizations.model.DisablePolicyTypeRequest()
		input.setRootId(this.rootId)
		input.setPolicyType(this.policyType.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.disablePolicyType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations disable-policy-type")
				.argument("root-id", rootId)
				.argument("policy-type", policyType.toString())
	}

}


fun AWSOrganizationsFunctions.enableAWSServiceAccess(servicePrincipal: String, init: AWSOrganizationsEnableAWSServiceAccessCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsEnableAWSServiceAccessCommand(servicePrincipal).apply(init))
}

@Generated
class AWSOrganizationsEnableAWSServiceAccessCommand(val servicePrincipal: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.EnableAWSServiceAccessRequest> {



	override fun build(): com.amazonaws.services.organizations.model.EnableAWSServiceAccessRequest {
		val input = com.amazonaws.services.organizations.model.EnableAWSServiceAccessRequest()
		input.setServicePrincipal(this.servicePrincipal)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.enableAWSServiceAccess(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations enable-awsservice-access")
				.argument("service-principal", servicePrincipal)
	}

}


fun AWSOrganizationsFunctions.enableAllFeatures(init: AWSOrganizationsEnableAllFeaturesCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsEnableAllFeaturesCommand().apply(init))
}

@Generated
class AWSOrganizationsEnableAllFeaturesCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.EnableAllFeaturesRequest> {



	override fun build(): com.amazonaws.services.organizations.model.EnableAllFeaturesRequest {
		val input = com.amazonaws.services.organizations.model.EnableAllFeaturesRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.enableAllFeatures(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations enable-all-features")

	}

}


fun AWSOrganizationsFunctions.enablePolicyType(rootId: String, policyType: PolicyType, init: AWSOrganizationsEnablePolicyTypeCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsEnablePolicyTypeCommand(rootId, policyType).apply(init))
}

@Generated
class AWSOrganizationsEnablePolicyTypeCommand(val rootId: String, val policyType: PolicyType) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.EnablePolicyTypeRequest> {



	override fun build(): com.amazonaws.services.organizations.model.EnablePolicyTypeRequest {
		val input = com.amazonaws.services.organizations.model.EnablePolicyTypeRequest()
		input.setRootId(this.rootId)
		input.setPolicyType(this.policyType.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.enablePolicyType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations enable-policy-type")
				.argument("root-id", rootId)
				.argument("policy-type", policyType.toString())
	}

}


fun AWSOrganizationsFunctions.inviteAccountToOrganization(target: com.amazonaws.services.organizations.model.HandshakeParty, init: AWSOrganizationsInviteAccountToOrganizationCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsInviteAccountToOrganizationCommand(target).apply(init))
}

@Generated
class AWSOrganizationsInviteAccountToOrganizationCommand(val target: com.amazonaws.services.organizations.model.HandshakeParty) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.InviteAccountToOrganizationRequest> {

	var notes: String? = null

	override fun build(): com.amazonaws.services.organizations.model.InviteAccountToOrganizationRequest {
		val input = com.amazonaws.services.organizations.model.InviteAccountToOrganizationRequest()
		input.setTarget(this.target)
		input.setNotes(this.notes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.inviteAccountToOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations invite-account-to-organization")
				.argument("target", target.toString())
				.argument("notes", notes)
	}

}


fun AWSOrganizationsFunctions.leaveOrganization(init: AWSOrganizationsLeaveOrganizationCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsLeaveOrganizationCommand().apply(init))
}

@Generated
class AWSOrganizationsLeaveOrganizationCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.LeaveOrganizationRequest> {



	override fun build(): com.amazonaws.services.organizations.model.LeaveOrganizationRequest {
		val input = com.amazonaws.services.organizations.model.LeaveOrganizationRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.leaveOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations leave-organization")

	}

}


fun AWSOrganizationsFunctions.listAWSServiceAccessForOrganization(init: AWSOrganizationsListAWSServiceAccessForOrganizationCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsListAWSServiceAccessForOrganizationCommand().apply(init))
}

@Generated
class AWSOrganizationsListAWSServiceAccessForOrganizationCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationRequest {
		val input = com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.listAWSServiceAccessForOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-awsservice-access-for-organization")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listAccounts(init: AWSOrganizationsListAccountsCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsListAccountsCommand().apply(init))
}

@Generated
class AWSOrganizationsListAccountsCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListAccountsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListAccountsRequest {
		val input = com.amazonaws.services.organizations.model.ListAccountsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.listAccounts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-accounts")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listAccountsForParent(parentId: String, init: AWSOrganizationsListAccountsForParentCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsListAccountsForParentCommand(parentId).apply(init))
}

@Generated
class AWSOrganizationsListAccountsForParentCommand(val parentId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListAccountsForParentRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListAccountsForParentRequest {
		val input = com.amazonaws.services.organizations.model.ListAccountsForParentRequest()
		input.setParentId(this.parentId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.listAccountsForParent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-accounts-for-parent")
				.argument("parent-id", parentId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listChildren(parentId: String, childType: ChildType, init: AWSOrganizationsListChildrenCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsListChildrenCommand(parentId, childType).apply(init))
}

@Generated
class AWSOrganizationsListChildrenCommand(val parentId: String, val childType: ChildType) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListChildrenRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.listChildren(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-children")
				.argument("parent-id", parentId)
				.argument("child-type", childType.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listCreateAccountStatus(init: AWSOrganizationsListCreateAccountStatusCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsListCreateAccountStatusCommand().apply(init))
}

@Generated
class AWSOrganizationsListCreateAccountStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListCreateAccountStatusRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.listCreateAccountStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-create-account-status")
				.argument("states", states?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listHandshakesForAccount(init: AWSOrganizationsListHandshakesForAccountCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsListHandshakesForAccountCommand().apply(init))
}

@Generated
class AWSOrganizationsListHandshakesForAccountCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListHandshakesForAccountRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.listHandshakesForAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-handshakes-for-account")
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listHandshakesForOrganization(init: AWSOrganizationsListHandshakesForOrganizationCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsListHandshakesForOrganizationCommand().apply(init))
}

@Generated
class AWSOrganizationsListHandshakesForOrganizationCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListHandshakesForOrganizationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.listHandshakesForOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-handshakes-for-organization")
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listOrganizationalUnitsForParent(parentId: String, init: AWSOrganizationsListOrganizationalUnitsForParentCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsListOrganizationalUnitsForParentCommand(parentId).apply(init))
}

@Generated
class AWSOrganizationsListOrganizationalUnitsForParentCommand(val parentId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentRequest {
		val input = com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentRequest()
		input.setParentId(this.parentId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.listOrganizationalUnitsForParent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-organizational-units-for-parent")
				.argument("parent-id", parentId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listParents(childId: String, init: AWSOrganizationsListParentsCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsListParentsCommand(childId).apply(init))
}

@Generated
class AWSOrganizationsListParentsCommand(val childId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListParentsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListParentsRequest {
		val input = com.amazonaws.services.organizations.model.ListParentsRequest()
		input.setChildId(this.childId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.listParents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-parents")
				.argument("child-id", childId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listPolicies(filter: PolicyType, init: AWSOrganizationsListPoliciesCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsListPoliciesCommand(filter).apply(init))
}

@Generated
class AWSOrganizationsListPoliciesCommand(val filter: PolicyType) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListPoliciesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListPoliciesRequest {
		val input = com.amazonaws.services.organizations.model.ListPoliciesRequest()
		input.setFilter(this.filter.toString())
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.listPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-policies")
				.argument("filter", filter.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listPoliciesForTarget(targetId: String, filter: PolicyType, init: AWSOrganizationsListPoliciesForTargetCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsListPoliciesForTargetCommand(targetId, filter).apply(init))
}

@Generated
class AWSOrganizationsListPoliciesForTargetCommand(val targetId: String, val filter: PolicyType) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListPoliciesForTargetRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.listPoliciesForTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-policies-for-target")
				.argument("target-id", targetId)
				.argument("filter", filter.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listRoots(init: AWSOrganizationsListRootsCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsListRootsCommand().apply(init))
}

@Generated
class AWSOrganizationsListRootsCommand() : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListRootsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListRootsRequest {
		val input = com.amazonaws.services.organizations.model.ListRootsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.listRoots(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-roots")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.listTargetsForPolicy(policyId: String, init: AWSOrganizationsListTargetsForPolicyCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsListTargetsForPolicyCommand(policyId).apply(init))
}

@Generated
class AWSOrganizationsListTargetsForPolicyCommand(val policyId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.ListTargetsForPolicyRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.organizations.model.ListTargetsForPolicyRequest {
		val input = com.amazonaws.services.organizations.model.ListTargetsForPolicyRequest()
		input.setPolicyId(this.policyId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.listTargetsForPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations list-targets-for-policy")
				.argument("policy-id", policyId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOrganizationsFunctions.moveAccount(accountId: String, sourceParentId: String, destinationParentId: String, init: AWSOrganizationsMoveAccountCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsMoveAccountCommand(accountId, sourceParentId, destinationParentId).apply(init))
}

@Generated
class AWSOrganizationsMoveAccountCommand(val accountId: String, val sourceParentId: String, val destinationParentId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.MoveAccountRequest> {



	override fun build(): com.amazonaws.services.organizations.model.MoveAccountRequest {
		val input = com.amazonaws.services.organizations.model.MoveAccountRequest()
		input.setAccountId(this.accountId)
		input.setSourceParentId(this.sourceParentId)
		input.setDestinationParentId(this.destinationParentId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.moveAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations move-account")
				.argument("account-id", accountId)
				.argument("source-parent-id", sourceParentId)
				.argument("destination-parent-id", destinationParentId)
	}

}


fun AWSOrganizationsFunctions.removeAccountFromOrganization(accountId: String, init: AWSOrganizationsRemoveAccountFromOrganizationCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsRemoveAccountFromOrganizationCommand(accountId).apply(init))
}

@Generated
class AWSOrganizationsRemoveAccountFromOrganizationCommand(val accountId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationRequest> {



	override fun build(): com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationRequest {
		val input = com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationRequest()
		input.setAccountId(this.accountId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.removeAccountFromOrganization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations remove-account-from-organization")
				.argument("account-id", accountId)
	}

}


fun AWSOrganizationsFunctions.updateOrganizationalUnit(organizationalUnitId: String, init: AWSOrganizationsUpdateOrganizationalUnitCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsUpdateOrganizationalUnitCommand(organizationalUnitId).apply(init))
}

@Generated
class AWSOrganizationsUpdateOrganizationalUnitCommand(val organizationalUnitId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.UpdateOrganizationalUnitRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.organizations.model.UpdateOrganizationalUnitRequest {
		val input = com.amazonaws.services.organizations.model.UpdateOrganizationalUnitRequest()
		input.setOrganizationalUnitId(this.organizationalUnitId)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.updateOrganizationalUnit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations update-organizational-unit")
				.argument("organizational-unit-id", organizationalUnitId)
				.argument("name", name)
	}

}


fun AWSOrganizationsFunctions.updatePolicy(policyId: String, init: AWSOrganizationsUpdatePolicyCommand.() -> Unit) {
	this.block.declare(AWSOrganizationsUpdatePolicyCommand(policyId).apply(init))
}

@Generated
class AWSOrganizationsUpdatePolicyCommand(val policyId: String) : AmazonWebServiceCommand<com.amazonaws.services.organizations.model.UpdatePolicyRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.organizations.updatePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws organizations update-policy")
				.argument("policy-id", policyId)
				.argument("name", name)
				.argument("description", description)
				.argument("content", content)
	}

}
