
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.fms.AWSFMS
import com.amazonaws.services.fms.model.*

var codingue.koops.core.Environment.fms: AWSFMS
	get() = this.capabilities[AWSFMS::class.java.name] as AWSFMS
	set(fms) {
		this.capabilities[AWSFMS::class.java.name] = fms
	}

@Generated
class AWSFMSFunctions(val block: Block)

infix fun AwsContinuation.fms(init: AWSFMSFunctions.() -> Unit) {
	AWSFMSFunctions(shell).apply(init)
}

			

fun AWSFMSFunctions.associateAdminAccount(adminAccount: String, init: AWSFMSAssociateAdminAccountCommand.() -> Unit) {
	this.block.declare(AWSFMSAssociateAdminAccountCommand(adminAccount).apply(init))
}

@Generated
class AWSFMSAssociateAdminAccountCommand(val adminAccount: String) : AmazonWebServiceCommand<com.amazonaws.services.fms.model.AssociateAdminAccountRequest> {



	override fun build(): com.amazonaws.services.fms.model.AssociateAdminAccountRequest {
		val input = com.amazonaws.services.fms.model.AssociateAdminAccountRequest()
		input.setAdminAccount(this.adminAccount)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.fms.associateAdminAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms associate-admin-account")
				.argument("admin-account", adminAccount)
	}

}


fun AWSFMSFunctions.deleteNotificationChannel(init: AWSFMSDeleteNotificationChannelCommand.() -> Unit) {
	this.block.declare(AWSFMSDeleteNotificationChannelCommand().apply(init))
}

@Generated
class AWSFMSDeleteNotificationChannelCommand() : AmazonWebServiceCommand<com.amazonaws.services.fms.model.DeleteNotificationChannelRequest> {



	override fun build(): com.amazonaws.services.fms.model.DeleteNotificationChannelRequest {
		val input = com.amazonaws.services.fms.model.DeleteNotificationChannelRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.fms.deleteNotificationChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms delete-notification-channel")

	}

}


fun AWSFMSFunctions.deletePolicy(policyId: String, init: AWSFMSDeletePolicyCommand.() -> Unit) {
	this.block.declare(AWSFMSDeletePolicyCommand(policyId).apply(init))
}

@Generated
class AWSFMSDeletePolicyCommand(val policyId: String) : AmazonWebServiceCommand<com.amazonaws.services.fms.model.DeletePolicyRequest> {



	override fun build(): com.amazonaws.services.fms.model.DeletePolicyRequest {
		val input = com.amazonaws.services.fms.model.DeletePolicyRequest()
		input.setPolicyId(this.policyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.fms.deletePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms delete-policy")
				.argument("policy-id", policyId)
	}

}


fun AWSFMSFunctions.disassociateAdminAccount(init: AWSFMSDisassociateAdminAccountCommand.() -> Unit) {
	this.block.declare(AWSFMSDisassociateAdminAccountCommand().apply(init))
}

@Generated
class AWSFMSDisassociateAdminAccountCommand() : AmazonWebServiceCommand<com.amazonaws.services.fms.model.DisassociateAdminAccountRequest> {



	override fun build(): com.amazonaws.services.fms.model.DisassociateAdminAccountRequest {
		val input = com.amazonaws.services.fms.model.DisassociateAdminAccountRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.fms.disassociateAdminAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms disassociate-admin-account")

	}

}


fun AWSFMSFunctions.getAdminAccount(init: AWSFMSGetAdminAccountCommand.() -> Unit) {
	this.block.declare(AWSFMSGetAdminAccountCommand().apply(init))
}

@Generated
class AWSFMSGetAdminAccountCommand() : AmazonWebServiceCommand<com.amazonaws.services.fms.model.GetAdminAccountRequest> {



	override fun build(): com.amazonaws.services.fms.model.GetAdminAccountRequest {
		val input = com.amazonaws.services.fms.model.GetAdminAccountRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.fms.getAdminAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms get-admin-account")

	}

}


fun AWSFMSFunctions.getComplianceDetail(policyId: String, memberAccount: String, init: AWSFMSGetComplianceDetailCommand.() -> Unit) {
	this.block.declare(AWSFMSGetComplianceDetailCommand(policyId, memberAccount).apply(init))
}

@Generated
class AWSFMSGetComplianceDetailCommand(val policyId: String, val memberAccount: String) : AmazonWebServiceCommand<com.amazonaws.services.fms.model.GetComplianceDetailRequest> {



	override fun build(): com.amazonaws.services.fms.model.GetComplianceDetailRequest {
		val input = com.amazonaws.services.fms.model.GetComplianceDetailRequest()
		input.setPolicyId(this.policyId)
		input.setMemberAccount(this.memberAccount)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.fms.getComplianceDetail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms get-compliance-detail")
				.argument("policy-id", policyId)
				.argument("member-account", memberAccount)
	}

}


fun AWSFMSFunctions.getNotificationChannel(init: AWSFMSGetNotificationChannelCommand.() -> Unit) {
	this.block.declare(AWSFMSGetNotificationChannelCommand().apply(init))
}

@Generated
class AWSFMSGetNotificationChannelCommand() : AmazonWebServiceCommand<com.amazonaws.services.fms.model.GetNotificationChannelRequest> {



	override fun build(): com.amazonaws.services.fms.model.GetNotificationChannelRequest {
		val input = com.amazonaws.services.fms.model.GetNotificationChannelRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.fms.getNotificationChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms get-notification-channel")

	}

}


fun AWSFMSFunctions.getPolicy(policyId: String, init: AWSFMSGetPolicyCommand.() -> Unit) {
	this.block.declare(AWSFMSGetPolicyCommand(policyId).apply(init))
}

@Generated
class AWSFMSGetPolicyCommand(val policyId: String) : AmazonWebServiceCommand<com.amazonaws.services.fms.model.GetPolicyRequest> {



	override fun build(): com.amazonaws.services.fms.model.GetPolicyRequest {
		val input = com.amazonaws.services.fms.model.GetPolicyRequest()
		input.setPolicyId(this.policyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.fms.getPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms get-policy")
				.argument("policy-id", policyId)
	}

}


fun AWSFMSFunctions.listComplianceStatus(policyId: String, init: AWSFMSListComplianceStatusCommand.() -> Unit) {
	this.block.declare(AWSFMSListComplianceStatusCommand(policyId).apply(init))
}

@Generated
class AWSFMSListComplianceStatusCommand(val policyId: String) : AmazonWebServiceCommand<com.amazonaws.services.fms.model.ListComplianceStatusRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.fms.model.ListComplianceStatusRequest {
		val input = com.amazonaws.services.fms.model.ListComplianceStatusRequest()
		input.setPolicyId(this.policyId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.fms.listComplianceStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms list-compliance-status")
				.argument("policy-id", policyId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSFMSFunctions.listPolicies(init: AWSFMSListPoliciesCommand.() -> Unit) {
	this.block.declare(AWSFMSListPoliciesCommand().apply(init))
}

@Generated
class AWSFMSListPoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.fms.model.ListPoliciesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.fms.model.ListPoliciesRequest {
		val input = com.amazonaws.services.fms.model.ListPoliciesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.fms.listPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms list-policies")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSFMSFunctions.putNotificationChannel(snsTopicArn: String, snsRoleName: String, init: AWSFMSPutNotificationChannelCommand.() -> Unit) {
	this.block.declare(AWSFMSPutNotificationChannelCommand(snsTopicArn, snsRoleName).apply(init))
}

@Generated
class AWSFMSPutNotificationChannelCommand(val snsTopicArn: String, val snsRoleName: String) : AmazonWebServiceCommand<com.amazonaws.services.fms.model.PutNotificationChannelRequest> {



	override fun build(): com.amazonaws.services.fms.model.PutNotificationChannelRequest {
		val input = com.amazonaws.services.fms.model.PutNotificationChannelRequest()
		input.setSnsTopicArn(this.snsTopicArn)
		input.setSnsRoleName(this.snsRoleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.fms.putNotificationChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms put-notification-channel")
				.argument("sns-topic-arn", snsTopicArn)
				.argument("sns-role-name", snsRoleName)
	}

}


fun AWSFMSFunctions.putPolicy(policy: com.amazonaws.services.fms.model.Policy, init: AWSFMSPutPolicyCommand.() -> Unit) {
	this.block.declare(AWSFMSPutPolicyCommand(policy).apply(init))
}

@Generated
class AWSFMSPutPolicyCommand(val policy: com.amazonaws.services.fms.model.Policy) : AmazonWebServiceCommand<com.amazonaws.services.fms.model.PutPolicyRequest> {



	override fun build(): com.amazonaws.services.fms.model.PutPolicyRequest {
		val input = com.amazonaws.services.fms.model.PutPolicyRequest()
		input.setPolicy(this.policy)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.fms.putPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms put-policy")
				.argument("policy", policy.toString())
	}

}
