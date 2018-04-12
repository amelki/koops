
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.fms.*
import com.amazonaws.services.fms.model.*

var codingue.koops.core.Environment.fms: AWSFMS
	get() {
		var service = this.capabilities["aws-fms"]
		if (service == null) {
			service = AWSFMSClientBuilder.standard().build()
			this.capabilities["aws-fms"] = service
		}
		return service as AWSFMS
	}
	set(fms) {
		this.capabilities["aws-fms"] = fms
	}

@Generated
class AWSFMSFunctions(val block: Block)

infix fun <T> AwsContinuation.fms(init: AWSFMSFunctions.() -> T): T {
	return AWSFMSFunctions(shell).run(init)
}

			

fun AWSFMSFunctions.associateAdminAccount(adminAccount: String, init: AWSFMSAssociateAdminAccountCommand.() -> Unit): com.amazonaws.services.fms.model.AssociateAdminAccountResult {
	return this.block.declare(AWSFMSAssociateAdminAccountCommand(adminAccount).apply(init)) as com.amazonaws.services.fms.model.AssociateAdminAccountResult
}

@Generated
class AWSFMSAssociateAdminAccountCommand(val adminAccount: String) : AmazonWebServiceCommand<com.amazonaws.services.fms.model.AssociateAdminAccountRequest, com.amazonaws.services.fms.model.AssociateAdminAccountResult> {



	override fun build(): com.amazonaws.services.fms.model.AssociateAdminAccountRequest {
		val input = com.amazonaws.services.fms.model.AssociateAdminAccountRequest()
		input.setAdminAccount(this.adminAccount)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.fms.model.AssociateAdminAccountResult {
	  return com.amazonaws.services.fms.model.AssociateAdminAccountResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.fms.model.AssociateAdminAccountResult {
		return environment.fms.associateAdminAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms associate-admin-account")
				.argument("admin-account", adminAccount)
	}

}


fun AWSFMSFunctions.deleteNotificationChannel(init: AWSFMSDeleteNotificationChannelCommand.() -> Unit): com.amazonaws.services.fms.model.DeleteNotificationChannelResult {
	return this.block.declare(AWSFMSDeleteNotificationChannelCommand().apply(init)) as com.amazonaws.services.fms.model.DeleteNotificationChannelResult
}

@Generated
class AWSFMSDeleteNotificationChannelCommand() : AmazonWebServiceCommand<com.amazonaws.services.fms.model.DeleteNotificationChannelRequest, com.amazonaws.services.fms.model.DeleteNotificationChannelResult> {



	override fun build(): com.amazonaws.services.fms.model.DeleteNotificationChannelRequest {
		val input = com.amazonaws.services.fms.model.DeleteNotificationChannelRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.fms.model.DeleteNotificationChannelResult {
	  return com.amazonaws.services.fms.model.DeleteNotificationChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.fms.model.DeleteNotificationChannelResult {
		return environment.fms.deleteNotificationChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms delete-notification-channel")

	}

}


fun AWSFMSFunctions.deletePolicy(policyId: String, init: AWSFMSDeletePolicyCommand.() -> Unit): com.amazonaws.services.fms.model.DeletePolicyResult {
	return this.block.declare(AWSFMSDeletePolicyCommand(policyId).apply(init)) as com.amazonaws.services.fms.model.DeletePolicyResult
}

@Generated
class AWSFMSDeletePolicyCommand(val policyId: String) : AmazonWebServiceCommand<com.amazonaws.services.fms.model.DeletePolicyRequest, com.amazonaws.services.fms.model.DeletePolicyResult> {



	override fun build(): com.amazonaws.services.fms.model.DeletePolicyRequest {
		val input = com.amazonaws.services.fms.model.DeletePolicyRequest()
		input.setPolicyId(this.policyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.fms.model.DeletePolicyResult {
	  return com.amazonaws.services.fms.model.DeletePolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.fms.model.DeletePolicyResult {
		return environment.fms.deletePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms delete-policy")
				.argument("policy-id", policyId)
	}

}


fun AWSFMSFunctions.disassociateAdminAccount(init: AWSFMSDisassociateAdminAccountCommand.() -> Unit): com.amazonaws.services.fms.model.DisassociateAdminAccountResult {
	return this.block.declare(AWSFMSDisassociateAdminAccountCommand().apply(init)) as com.amazonaws.services.fms.model.DisassociateAdminAccountResult
}

@Generated
class AWSFMSDisassociateAdminAccountCommand() : AmazonWebServiceCommand<com.amazonaws.services.fms.model.DisassociateAdminAccountRequest, com.amazonaws.services.fms.model.DisassociateAdminAccountResult> {



	override fun build(): com.amazonaws.services.fms.model.DisassociateAdminAccountRequest {
		val input = com.amazonaws.services.fms.model.DisassociateAdminAccountRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.fms.model.DisassociateAdminAccountResult {
	  return com.amazonaws.services.fms.model.DisassociateAdminAccountResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.fms.model.DisassociateAdminAccountResult {
		return environment.fms.disassociateAdminAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms disassociate-admin-account")

	}

}


fun AWSFMSFunctions.getAdminAccount(init: AWSFMSGetAdminAccountCommand.() -> Unit): com.amazonaws.services.fms.model.GetAdminAccountResult {
	return this.block.declare(AWSFMSGetAdminAccountCommand().apply(init)) as com.amazonaws.services.fms.model.GetAdminAccountResult
}

@Generated
class AWSFMSGetAdminAccountCommand() : AmazonWebServiceCommand<com.amazonaws.services.fms.model.GetAdminAccountRequest, com.amazonaws.services.fms.model.GetAdminAccountResult> {



	override fun build(): com.amazonaws.services.fms.model.GetAdminAccountRequest {
		val input = com.amazonaws.services.fms.model.GetAdminAccountRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.fms.model.GetAdminAccountResult {
	  return com.amazonaws.services.fms.model.GetAdminAccountResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.fms.model.GetAdminAccountResult {
		return environment.fms.getAdminAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms get-admin-account")

	}

}


fun AWSFMSFunctions.getComplianceDetail(policyId: String, memberAccount: String, init: AWSFMSGetComplianceDetailCommand.() -> Unit): com.amazonaws.services.fms.model.GetComplianceDetailResult {
	return this.block.declare(AWSFMSGetComplianceDetailCommand(policyId, memberAccount).apply(init)) as com.amazonaws.services.fms.model.GetComplianceDetailResult
}

@Generated
class AWSFMSGetComplianceDetailCommand(val policyId: String, val memberAccount: String) : AmazonWebServiceCommand<com.amazonaws.services.fms.model.GetComplianceDetailRequest, com.amazonaws.services.fms.model.GetComplianceDetailResult> {



	override fun build(): com.amazonaws.services.fms.model.GetComplianceDetailRequest {
		val input = com.amazonaws.services.fms.model.GetComplianceDetailRequest()
		input.setPolicyId(this.policyId)
		input.setMemberAccount(this.memberAccount)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.fms.model.GetComplianceDetailResult {
	  return com.amazonaws.services.fms.model.GetComplianceDetailResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.fms.model.GetComplianceDetailResult {
		return environment.fms.getComplianceDetail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms get-compliance-detail")
				.argument("policy-id", policyId)
				.argument("member-account", memberAccount)
	}

}


fun AWSFMSFunctions.getNotificationChannel(init: AWSFMSGetNotificationChannelCommand.() -> Unit): com.amazonaws.services.fms.model.GetNotificationChannelResult {
	return this.block.declare(AWSFMSGetNotificationChannelCommand().apply(init)) as com.amazonaws.services.fms.model.GetNotificationChannelResult
}

@Generated
class AWSFMSGetNotificationChannelCommand() : AmazonWebServiceCommand<com.amazonaws.services.fms.model.GetNotificationChannelRequest, com.amazonaws.services.fms.model.GetNotificationChannelResult> {



	override fun build(): com.amazonaws.services.fms.model.GetNotificationChannelRequest {
		val input = com.amazonaws.services.fms.model.GetNotificationChannelRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.fms.model.GetNotificationChannelResult {
	  return com.amazonaws.services.fms.model.GetNotificationChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.fms.model.GetNotificationChannelResult {
		return environment.fms.getNotificationChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms get-notification-channel")

	}

}


fun AWSFMSFunctions.getPolicy(policyId: String, init: AWSFMSGetPolicyCommand.() -> Unit): com.amazonaws.services.fms.model.GetPolicyResult {
	return this.block.declare(AWSFMSGetPolicyCommand(policyId).apply(init)) as com.amazonaws.services.fms.model.GetPolicyResult
}

@Generated
class AWSFMSGetPolicyCommand(val policyId: String) : AmazonWebServiceCommand<com.amazonaws.services.fms.model.GetPolicyRequest, com.amazonaws.services.fms.model.GetPolicyResult> {



	override fun build(): com.amazonaws.services.fms.model.GetPolicyRequest {
		val input = com.amazonaws.services.fms.model.GetPolicyRequest()
		input.setPolicyId(this.policyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.fms.model.GetPolicyResult {
	  return com.amazonaws.services.fms.model.GetPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.fms.model.GetPolicyResult {
		return environment.fms.getPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms get-policy")
				.argument("policy-id", policyId)
	}

}


fun AWSFMSFunctions.listComplianceStatus(policyId: String, init: AWSFMSListComplianceStatusCommand.() -> Unit): com.amazonaws.services.fms.model.ListComplianceStatusResult {
	return this.block.declare(AWSFMSListComplianceStatusCommand(policyId).apply(init)) as com.amazonaws.services.fms.model.ListComplianceStatusResult
}

@Generated
class AWSFMSListComplianceStatusCommand(val policyId: String) : AmazonWebServiceCommand<com.amazonaws.services.fms.model.ListComplianceStatusRequest, com.amazonaws.services.fms.model.ListComplianceStatusResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.fms.model.ListComplianceStatusRequest {
		val input = com.amazonaws.services.fms.model.ListComplianceStatusRequest()
		input.setPolicyId(this.policyId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.fms.model.ListComplianceStatusResult {
	  return com.amazonaws.services.fms.model.ListComplianceStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.fms.model.ListComplianceStatusResult {
		return environment.fms.listComplianceStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms list-compliance-status")
				.argument("policy-id", policyId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSFMSFunctions.listPolicies(init: AWSFMSListPoliciesCommand.() -> Unit): com.amazonaws.services.fms.model.ListPoliciesResult {
	return this.block.declare(AWSFMSListPoliciesCommand().apply(init)) as com.amazonaws.services.fms.model.ListPoliciesResult
}

@Generated
class AWSFMSListPoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.fms.model.ListPoliciesRequest, com.amazonaws.services.fms.model.ListPoliciesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.fms.model.ListPoliciesRequest {
		val input = com.amazonaws.services.fms.model.ListPoliciesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.fms.model.ListPoliciesResult {
	  return com.amazonaws.services.fms.model.ListPoliciesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.fms.model.ListPoliciesResult {
		return environment.fms.listPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms list-policies")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSFMSFunctions.putNotificationChannel(snsTopicArn: String, snsRoleName: String, init: AWSFMSPutNotificationChannelCommand.() -> Unit): com.amazonaws.services.fms.model.PutNotificationChannelResult {
	return this.block.declare(AWSFMSPutNotificationChannelCommand(snsTopicArn, snsRoleName).apply(init)) as com.amazonaws.services.fms.model.PutNotificationChannelResult
}

@Generated
class AWSFMSPutNotificationChannelCommand(val snsTopicArn: String, val snsRoleName: String) : AmazonWebServiceCommand<com.amazonaws.services.fms.model.PutNotificationChannelRequest, com.amazonaws.services.fms.model.PutNotificationChannelResult> {



	override fun build(): com.amazonaws.services.fms.model.PutNotificationChannelRequest {
		val input = com.amazonaws.services.fms.model.PutNotificationChannelRequest()
		input.setSnsTopicArn(this.snsTopicArn)
		input.setSnsRoleName(this.snsRoleName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.fms.model.PutNotificationChannelResult {
	  return com.amazonaws.services.fms.model.PutNotificationChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.fms.model.PutNotificationChannelResult {
		return environment.fms.putNotificationChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms put-notification-channel")
				.argument("sns-topic-arn", snsTopicArn)
				.argument("sns-role-name", snsRoleName)
	}

}


fun AWSFMSFunctions.putPolicy(policy: com.amazonaws.services.fms.model.Policy, init: AWSFMSPutPolicyCommand.() -> Unit): com.amazonaws.services.fms.model.PutPolicyResult {
	return this.block.declare(AWSFMSPutPolicyCommand(policy).apply(init)) as com.amazonaws.services.fms.model.PutPolicyResult
}

@Generated
class AWSFMSPutPolicyCommand(val policy: com.amazonaws.services.fms.model.Policy) : AmazonWebServiceCommand<com.amazonaws.services.fms.model.PutPolicyRequest, com.amazonaws.services.fms.model.PutPolicyResult> {



	override fun build(): com.amazonaws.services.fms.model.PutPolicyRequest {
		val input = com.amazonaws.services.fms.model.PutPolicyRequest()
		input.setPolicy(this.policy)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.fms.model.PutPolicyResult {
	  return com.amazonaws.services.fms.model.PutPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.fms.model.PutPolicyResult {
		return environment.fms.putPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws fms put-policy")
				.argument("policy", policy.toString())
	}

}
