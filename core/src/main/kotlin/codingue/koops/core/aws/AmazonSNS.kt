
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.sns.AmazonSNS
import com.amazonaws.services.sns.model.*

var codingue.koops.core.Environment.sns: AmazonSNS
	get() = this.capabilities[AmazonSNS::class.java.name] as AmazonSNS
	set(sns) {
		this.capabilities[AmazonSNS::class.java.name] = sns
	}

@Generated
class AmazonSNSFunctions(val block: Block)

infix fun <T> AwsContinuation.sns(init: AmazonSNSFunctions.() -> T): T {
	return AmazonSNSFunctions(shell).run(init)
}

			

fun AmazonSNSFunctions.addPermission(topicArn: String, label: String, init: AmazonSNSAddPermissionCommand.() -> Unit): com.amazonaws.services.sns.model.AddPermissionResult {
	return this.block.declare(AmazonSNSAddPermissionCommand(topicArn, label).apply(init)) as com.amazonaws.services.sns.model.AddPermissionResult
}

@Generated
class AmazonSNSAddPermissionCommand(val topicArn: String, val label: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.AddPermissionRequest, com.amazonaws.services.sns.model.AddPermissionResult> {

	var aWSAccountIds: List<String>? = null
	var actionNames: List<String>? = null

	override fun build(): com.amazonaws.services.sns.model.AddPermissionRequest {
		val input = com.amazonaws.services.sns.model.AddPermissionRequest()
		input.setTopicArn(this.topicArn)
		input.setLabel(this.label)
		input.setAWSAccountIds(this.aWSAccountIds)
		input.setActionNames(this.actionNames)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.AddPermissionResult {
	  return com.amazonaws.services.sns.model.AddPermissionResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.AddPermissionResult {
		return environment.sns.addPermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns add-permission")
				.argument("topic-arn", topicArn)
				.argument("label", label)
				.argument("awsaccount-ids", aWSAccountIds?.toString())
				.argument("action-names", actionNames?.toString())
	}

}


fun AmazonSNSFunctions.checkIfPhoneNumberIsOptedOut(init: AmazonSNSCheckIfPhoneNumberIsOptedOutCommand.() -> Unit): com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutResult {
	return this.block.declare(AmazonSNSCheckIfPhoneNumberIsOptedOutCommand().apply(init)) as com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutResult
}

@Generated
class AmazonSNSCheckIfPhoneNumberIsOptedOutCommand() : AmazonWebServiceCommand<com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest, com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutResult> {

	var phoneNumber: String? = null

	override fun build(): com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest {
		val input = com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest()
		input.setPhoneNumber(this.phoneNumber)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutResult {
	  return com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutResult {
		return environment.sns.checkIfPhoneNumberIsOptedOut(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns check-if-phone-number-is-opted-out")
				.argument("phone-number", phoneNumber)
	}

}


fun AmazonSNSFunctions.confirmSubscription(topicArn: String, token: String, init: AmazonSNSConfirmSubscriptionCommand.() -> Unit): com.amazonaws.services.sns.model.ConfirmSubscriptionResult {
	return this.block.declare(AmazonSNSConfirmSubscriptionCommand(topicArn, token).apply(init)) as com.amazonaws.services.sns.model.ConfirmSubscriptionResult
}

@Generated
class AmazonSNSConfirmSubscriptionCommand(val topicArn: String, val token: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.ConfirmSubscriptionRequest, com.amazonaws.services.sns.model.ConfirmSubscriptionResult> {

	var authenticateOnUnsubscribe: String? = null

	override fun build(): com.amazonaws.services.sns.model.ConfirmSubscriptionRequest {
		val input = com.amazonaws.services.sns.model.ConfirmSubscriptionRequest()
		input.setTopicArn(this.topicArn)
		input.setToken(this.token)
		input.setAuthenticateOnUnsubscribe(this.authenticateOnUnsubscribe)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.ConfirmSubscriptionResult {
	  return com.amazonaws.services.sns.model.ConfirmSubscriptionResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.ConfirmSubscriptionResult {
		return environment.sns.confirmSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns confirm-subscription")
				.argument("topic-arn", topicArn)
				.argument("token", token)
				.argument("authenticate-on-unsubscribe", authenticateOnUnsubscribe)
	}

}


fun AmazonSNSFunctions.createPlatformApplication(name: String, platform: String, attributes: Map<String, String>, init: AmazonSNSCreatePlatformApplicationCommand.() -> Unit): com.amazonaws.services.sns.model.CreatePlatformApplicationResult {
	return this.block.declare(AmazonSNSCreatePlatformApplicationCommand(name, platform, attributes).apply(init)) as com.amazonaws.services.sns.model.CreatePlatformApplicationResult
}

@Generated
class AmazonSNSCreatePlatformApplicationCommand(val name: String, val platform: String, val attributes: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.CreatePlatformApplicationRequest, com.amazonaws.services.sns.model.CreatePlatformApplicationResult> {



	override fun build(): com.amazonaws.services.sns.model.CreatePlatformApplicationRequest {
		val input = com.amazonaws.services.sns.model.CreatePlatformApplicationRequest()
		input.setName(this.name)
		input.setPlatform(this.platform)
		input.setAttributes(this.attributes)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.CreatePlatformApplicationResult {
	  return com.amazonaws.services.sns.model.CreatePlatformApplicationResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.CreatePlatformApplicationResult {
		return environment.sns.createPlatformApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns create-platform-application")
				.argument("name", name)
				.argument("platform", platform)
				.argument("attributes", attributes.toString())
	}

}


fun AmazonSNSFunctions.createPlatformEndpoint(platformApplicationArn: String, token: String, init: AmazonSNSCreatePlatformEndpointCommand.() -> Unit): com.amazonaws.services.sns.model.CreatePlatformEndpointResult {
	return this.block.declare(AmazonSNSCreatePlatformEndpointCommand(platformApplicationArn, token).apply(init)) as com.amazonaws.services.sns.model.CreatePlatformEndpointResult
}

@Generated
class AmazonSNSCreatePlatformEndpointCommand(val platformApplicationArn: String, val token: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.CreatePlatformEndpointRequest, com.amazonaws.services.sns.model.CreatePlatformEndpointResult> {

	var customUserData: String? = null
	var attributes: Map<String, String>? = null

	override fun build(): com.amazonaws.services.sns.model.CreatePlatformEndpointRequest {
		val input = com.amazonaws.services.sns.model.CreatePlatformEndpointRequest()
		input.setPlatformApplicationArn(this.platformApplicationArn)
		input.setToken(this.token)
		input.setCustomUserData(this.customUserData)
		input.setAttributes(this.attributes)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.CreatePlatformEndpointResult {
	  return com.amazonaws.services.sns.model.CreatePlatformEndpointResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.CreatePlatformEndpointResult {
		return environment.sns.createPlatformEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns create-platform-endpoint")
				.argument("platform-application-arn", platformApplicationArn)
				.argument("token", token)
				.argument("custom-user-data", customUserData)
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonSNSFunctions.createTopic(name: String, init: AmazonSNSCreateTopicCommand.() -> Unit): com.amazonaws.services.sns.model.CreateTopicResult {
	return this.block.declare(AmazonSNSCreateTopicCommand(name).apply(init)) as com.amazonaws.services.sns.model.CreateTopicResult
}

@Generated
class AmazonSNSCreateTopicCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.CreateTopicRequest, com.amazonaws.services.sns.model.CreateTopicResult> {



	override fun build(): com.amazonaws.services.sns.model.CreateTopicRequest {
		val input = com.amazonaws.services.sns.model.CreateTopicRequest()
		input.setName(this.name)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.CreateTopicResult {
	  return com.amazonaws.services.sns.model.CreateTopicResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.CreateTopicResult {
		return environment.sns.createTopic(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns create-topic")
				.argument("name", name)
	}

}


fun AmazonSNSFunctions.deleteEndpoint(endpointArn: String, init: AmazonSNSDeleteEndpointCommand.() -> Unit): com.amazonaws.services.sns.model.DeleteEndpointResult {
	return this.block.declare(AmazonSNSDeleteEndpointCommand(endpointArn).apply(init)) as com.amazonaws.services.sns.model.DeleteEndpointResult
}

@Generated
class AmazonSNSDeleteEndpointCommand(val endpointArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.DeleteEndpointRequest, com.amazonaws.services.sns.model.DeleteEndpointResult> {



	override fun build(): com.amazonaws.services.sns.model.DeleteEndpointRequest {
		val input = com.amazonaws.services.sns.model.DeleteEndpointRequest()
		input.setEndpointArn(this.endpointArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.DeleteEndpointResult {
	  return com.amazonaws.services.sns.model.DeleteEndpointResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.DeleteEndpointResult {
		return environment.sns.deleteEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns delete-endpoint")
				.argument("endpoint-arn", endpointArn)
	}

}


fun AmazonSNSFunctions.deletePlatformApplication(platformApplicationArn: String, init: AmazonSNSDeletePlatformApplicationCommand.() -> Unit): com.amazonaws.services.sns.model.DeletePlatformApplicationResult {
	return this.block.declare(AmazonSNSDeletePlatformApplicationCommand(platformApplicationArn).apply(init)) as com.amazonaws.services.sns.model.DeletePlatformApplicationResult
}

@Generated
class AmazonSNSDeletePlatformApplicationCommand(val platformApplicationArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.DeletePlatformApplicationRequest, com.amazonaws.services.sns.model.DeletePlatformApplicationResult> {



	override fun build(): com.amazonaws.services.sns.model.DeletePlatformApplicationRequest {
		val input = com.amazonaws.services.sns.model.DeletePlatformApplicationRequest()
		input.setPlatformApplicationArn(this.platformApplicationArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.DeletePlatformApplicationResult {
	  return com.amazonaws.services.sns.model.DeletePlatformApplicationResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.DeletePlatformApplicationResult {
		return environment.sns.deletePlatformApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns delete-platform-application")
				.argument("platform-application-arn", platformApplicationArn)
	}

}


fun AmazonSNSFunctions.deleteTopic(topicArn: String, init: AmazonSNSDeleteTopicCommand.() -> Unit): com.amazonaws.services.sns.model.DeleteTopicResult {
	return this.block.declare(AmazonSNSDeleteTopicCommand(topicArn).apply(init)) as com.amazonaws.services.sns.model.DeleteTopicResult
}

@Generated
class AmazonSNSDeleteTopicCommand(val topicArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.DeleteTopicRequest, com.amazonaws.services.sns.model.DeleteTopicResult> {



	override fun build(): com.amazonaws.services.sns.model.DeleteTopicRequest {
		val input = com.amazonaws.services.sns.model.DeleteTopicRequest()
		input.setTopicArn(this.topicArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.DeleteTopicResult {
	  return com.amazonaws.services.sns.model.DeleteTopicResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.DeleteTopicResult {
		return environment.sns.deleteTopic(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns delete-topic")
				.argument("topic-arn", topicArn)
	}

}


fun AmazonSNSFunctions.getEndpointAttributes(endpointArn: String, init: AmazonSNSGetEndpointAttributesCommand.() -> Unit): com.amazonaws.services.sns.model.GetEndpointAttributesResult {
	return this.block.declare(AmazonSNSGetEndpointAttributesCommand(endpointArn).apply(init)) as com.amazonaws.services.sns.model.GetEndpointAttributesResult
}

@Generated
class AmazonSNSGetEndpointAttributesCommand(val endpointArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.GetEndpointAttributesRequest, com.amazonaws.services.sns.model.GetEndpointAttributesResult> {



	override fun build(): com.amazonaws.services.sns.model.GetEndpointAttributesRequest {
		val input = com.amazonaws.services.sns.model.GetEndpointAttributesRequest()
		input.setEndpointArn(this.endpointArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.GetEndpointAttributesResult {
	  return com.amazonaws.services.sns.model.GetEndpointAttributesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.GetEndpointAttributesResult {
		return environment.sns.getEndpointAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns get-endpoint-attributes")
				.argument("endpoint-arn", endpointArn)
	}

}


fun AmazonSNSFunctions.getPlatformApplicationAttributes(platformApplicationArn: String, init: AmazonSNSGetPlatformApplicationAttributesCommand.() -> Unit): com.amazonaws.services.sns.model.GetPlatformApplicationAttributesResult {
	return this.block.declare(AmazonSNSGetPlatformApplicationAttributesCommand(platformApplicationArn).apply(init)) as com.amazonaws.services.sns.model.GetPlatformApplicationAttributesResult
}

@Generated
class AmazonSNSGetPlatformApplicationAttributesCommand(val platformApplicationArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest, com.amazonaws.services.sns.model.GetPlatformApplicationAttributesResult> {



	override fun build(): com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest {
		val input = com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest()
		input.setPlatformApplicationArn(this.platformApplicationArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.GetPlatformApplicationAttributesResult {
	  return com.amazonaws.services.sns.model.GetPlatformApplicationAttributesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.GetPlatformApplicationAttributesResult {
		return environment.sns.getPlatformApplicationAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns get-platform-application-attributes")
				.argument("platform-application-arn", platformApplicationArn)
	}

}


fun AmazonSNSFunctions.getSMSAttributes(init: AmazonSNSGetSMSAttributesCommand.() -> Unit): com.amazonaws.services.sns.model.GetSMSAttributesResult {
	return this.block.declare(AmazonSNSGetSMSAttributesCommand().apply(init)) as com.amazonaws.services.sns.model.GetSMSAttributesResult
}

@Generated
class AmazonSNSGetSMSAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.sns.model.GetSMSAttributesRequest, com.amazonaws.services.sns.model.GetSMSAttributesResult> {

	var attributes: List<String>? = null

	override fun build(): com.amazonaws.services.sns.model.GetSMSAttributesRequest {
		val input = com.amazonaws.services.sns.model.GetSMSAttributesRequest()
		input.setAttributes(this.attributes)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.GetSMSAttributesResult {
	  return com.amazonaws.services.sns.model.GetSMSAttributesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.GetSMSAttributesResult {
		return environment.sns.getSMSAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns get-smsattributes")
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonSNSFunctions.getSubscriptionAttributes(subscriptionArn: String, init: AmazonSNSGetSubscriptionAttributesCommand.() -> Unit): com.amazonaws.services.sns.model.GetSubscriptionAttributesResult {
	return this.block.declare(AmazonSNSGetSubscriptionAttributesCommand(subscriptionArn).apply(init)) as com.amazonaws.services.sns.model.GetSubscriptionAttributesResult
}

@Generated
class AmazonSNSGetSubscriptionAttributesCommand(val subscriptionArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest, com.amazonaws.services.sns.model.GetSubscriptionAttributesResult> {



	override fun build(): com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest {
		val input = com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest()
		input.setSubscriptionArn(this.subscriptionArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.GetSubscriptionAttributesResult {
	  return com.amazonaws.services.sns.model.GetSubscriptionAttributesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.GetSubscriptionAttributesResult {
		return environment.sns.getSubscriptionAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns get-subscription-attributes")
				.argument("subscription-arn", subscriptionArn)
	}

}


fun AmazonSNSFunctions.getTopicAttributes(topicArn: String, init: AmazonSNSGetTopicAttributesCommand.() -> Unit): com.amazonaws.services.sns.model.GetTopicAttributesResult {
	return this.block.declare(AmazonSNSGetTopicAttributesCommand(topicArn).apply(init)) as com.amazonaws.services.sns.model.GetTopicAttributesResult
}

@Generated
class AmazonSNSGetTopicAttributesCommand(val topicArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.GetTopicAttributesRequest, com.amazonaws.services.sns.model.GetTopicAttributesResult> {



	override fun build(): com.amazonaws.services.sns.model.GetTopicAttributesRequest {
		val input = com.amazonaws.services.sns.model.GetTopicAttributesRequest()
		input.setTopicArn(this.topicArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.GetTopicAttributesResult {
	  return com.amazonaws.services.sns.model.GetTopicAttributesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.GetTopicAttributesResult {
		return environment.sns.getTopicAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns get-topic-attributes")
				.argument("topic-arn", topicArn)
	}

}


fun AmazonSNSFunctions.listEndpointsByPlatformApplication(platformApplicationArn: String, init: AmazonSNSListEndpointsByPlatformApplicationCommand.() -> Unit): com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationResult {
	return this.block.declare(AmazonSNSListEndpointsByPlatformApplicationCommand(platformApplicationArn).apply(init)) as com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationResult
}

@Generated
class AmazonSNSListEndpointsByPlatformApplicationCommand(val platformApplicationArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest, com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest {
		val input = com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest()
		input.setPlatformApplicationArn(this.platformApplicationArn)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationResult {
	  return com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationResult {
		return environment.sns.listEndpointsByPlatformApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns list-endpoints-by-platform-application")
				.argument("platform-application-arn", platformApplicationArn)
				.argument("next-token", nextToken)
	}

}


fun AmazonSNSFunctions.listPhoneNumbersOptedOut(init: AmazonSNSListPhoneNumbersOptedOutCommand.() -> Unit): com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutResult {
	return this.block.declare(AmazonSNSListPhoneNumbersOptedOutCommand().apply(init)) as com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutResult
}

@Generated
class AmazonSNSListPhoneNumbersOptedOutCommand() : AmazonWebServiceCommand<com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutRequest, com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutRequest {
		val input = com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutResult {
	  return com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutResult {
		return environment.sns.listPhoneNumbersOptedOut(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns list-phone-numbers-opted-out")
				.argument("next-token", nextToken)
	}

}


fun AmazonSNSFunctions.listPlatformApplications(init: AmazonSNSListPlatformApplicationsCommand.() -> Unit): com.amazonaws.services.sns.model.ListPlatformApplicationsResult {
	return this.block.declare(AmazonSNSListPlatformApplicationsCommand().apply(init)) as com.amazonaws.services.sns.model.ListPlatformApplicationsResult
}

@Generated
class AmazonSNSListPlatformApplicationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.sns.model.ListPlatformApplicationsRequest, com.amazonaws.services.sns.model.ListPlatformApplicationsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.sns.model.ListPlatformApplicationsRequest {
		val input = com.amazonaws.services.sns.model.ListPlatformApplicationsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.ListPlatformApplicationsResult {
	  return com.amazonaws.services.sns.model.ListPlatformApplicationsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.ListPlatformApplicationsResult {
		return environment.sns.listPlatformApplications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns list-platform-applications")
				.argument("next-token", nextToken)
	}

}


fun AmazonSNSFunctions.listSubscriptions(init: AmazonSNSListSubscriptionsCommand.() -> Unit): com.amazonaws.services.sns.model.ListSubscriptionsResult {
	return this.block.declare(AmazonSNSListSubscriptionsCommand().apply(init)) as com.amazonaws.services.sns.model.ListSubscriptionsResult
}

@Generated
class AmazonSNSListSubscriptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.sns.model.ListSubscriptionsRequest, com.amazonaws.services.sns.model.ListSubscriptionsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.sns.model.ListSubscriptionsRequest {
		val input = com.amazonaws.services.sns.model.ListSubscriptionsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.ListSubscriptionsResult {
	  return com.amazonaws.services.sns.model.ListSubscriptionsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.ListSubscriptionsResult {
		return environment.sns.listSubscriptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns list-subscriptions")
				.argument("next-token", nextToken)
	}

}


fun AmazonSNSFunctions.listSubscriptionsByTopic(topicArn: String, init: AmazonSNSListSubscriptionsByTopicCommand.() -> Unit): com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult {
	return this.block.declare(AmazonSNSListSubscriptionsByTopicCommand(topicArn).apply(init)) as com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult
}

@Generated
class AmazonSNSListSubscriptionsByTopicCommand(val topicArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.ListSubscriptionsByTopicRequest, com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.sns.model.ListSubscriptionsByTopicRequest {
		val input = com.amazonaws.services.sns.model.ListSubscriptionsByTopicRequest()
		input.setTopicArn(this.topicArn)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult {
	  return com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult {
		return environment.sns.listSubscriptionsByTopic(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns list-subscriptions-by-topic")
				.argument("topic-arn", topicArn)
				.argument("next-token", nextToken)
	}

}


fun AmazonSNSFunctions.listTopics(init: AmazonSNSListTopicsCommand.() -> Unit): com.amazonaws.services.sns.model.ListTopicsResult {
	return this.block.declare(AmazonSNSListTopicsCommand().apply(init)) as com.amazonaws.services.sns.model.ListTopicsResult
}

@Generated
class AmazonSNSListTopicsCommand() : AmazonWebServiceCommand<com.amazonaws.services.sns.model.ListTopicsRequest, com.amazonaws.services.sns.model.ListTopicsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.sns.model.ListTopicsRequest {
		val input = com.amazonaws.services.sns.model.ListTopicsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.ListTopicsResult {
	  return com.amazonaws.services.sns.model.ListTopicsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.ListTopicsResult {
		return environment.sns.listTopics(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns list-topics")
				.argument("next-token", nextToken)
	}

}


fun AmazonSNSFunctions.optInPhoneNumber(init: AmazonSNSOptInPhoneNumberCommand.() -> Unit): com.amazonaws.services.sns.model.OptInPhoneNumberResult {
	return this.block.declare(AmazonSNSOptInPhoneNumberCommand().apply(init)) as com.amazonaws.services.sns.model.OptInPhoneNumberResult
}

@Generated
class AmazonSNSOptInPhoneNumberCommand() : AmazonWebServiceCommand<com.amazonaws.services.sns.model.OptInPhoneNumberRequest, com.amazonaws.services.sns.model.OptInPhoneNumberResult> {

	var phoneNumber: String? = null

	override fun build(): com.amazonaws.services.sns.model.OptInPhoneNumberRequest {
		val input = com.amazonaws.services.sns.model.OptInPhoneNumberRequest()
		input.setPhoneNumber(this.phoneNumber)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.OptInPhoneNumberResult {
	  return com.amazonaws.services.sns.model.OptInPhoneNumberResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.OptInPhoneNumberResult {
		return environment.sns.optInPhoneNumber(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns opt-in-phone-number")
				.argument("phone-number", phoneNumber)
	}

}


fun AmazonSNSFunctions.publish(message: String, init: AmazonSNSPublishCommand.() -> Unit): com.amazonaws.services.sns.model.PublishResult {
	return this.block.declare(AmazonSNSPublishCommand(message).apply(init)) as com.amazonaws.services.sns.model.PublishResult
}

@Generated
class AmazonSNSPublishCommand(val message: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.PublishRequest, com.amazonaws.services.sns.model.PublishResult> {

	var topicArn: String? = null
	var targetArn: String? = null
	var phoneNumber: String? = null
	var subject: String? = null
	var messageStructure: String? = null
	var messageAttributes: Map<String, com.amazonaws.services.sns.model.MessageAttributeValue>? = null

	override fun build(): com.amazonaws.services.sns.model.PublishRequest {
		val input = com.amazonaws.services.sns.model.PublishRequest()
		input.setTopicArn(this.topicArn)
		input.setTargetArn(this.targetArn)
		input.setPhoneNumber(this.phoneNumber)
		input.setMessage(this.message)
		input.setSubject(this.subject)
		input.setMessageStructure(this.messageStructure)
		input.setMessageAttributes(this.messageAttributes)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.PublishResult {
	  return com.amazonaws.services.sns.model.PublishResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.PublishResult {
		return environment.sns.publish(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns publish")
				.argument("topic-arn", topicArn)
				.argument("target-arn", targetArn)
				.argument("phone-number", phoneNumber)
				.argument("message", message)
				.argument("subject", subject)
				.argument("message-structure", messageStructure)
				.argument("message-attributes", messageAttributes?.toString())
	}

}


fun AmazonSNSFunctions.removePermission(topicArn: String, label: String, init: AmazonSNSRemovePermissionCommand.() -> Unit): com.amazonaws.services.sns.model.RemovePermissionResult {
	return this.block.declare(AmazonSNSRemovePermissionCommand(topicArn, label).apply(init)) as com.amazonaws.services.sns.model.RemovePermissionResult
}

@Generated
class AmazonSNSRemovePermissionCommand(val topicArn: String, val label: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.RemovePermissionRequest, com.amazonaws.services.sns.model.RemovePermissionResult> {



	override fun build(): com.amazonaws.services.sns.model.RemovePermissionRequest {
		val input = com.amazonaws.services.sns.model.RemovePermissionRequest()
		input.setTopicArn(this.topicArn)
		input.setLabel(this.label)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.RemovePermissionResult {
	  return com.amazonaws.services.sns.model.RemovePermissionResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.RemovePermissionResult {
		return environment.sns.removePermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns remove-permission")
				.argument("topic-arn", topicArn)
				.argument("label", label)
	}

}


fun AmazonSNSFunctions.setEndpointAttributes(endpointArn: String, attributes: Map<String, String>, init: AmazonSNSSetEndpointAttributesCommand.() -> Unit): com.amazonaws.services.sns.model.SetEndpointAttributesResult {
	return this.block.declare(AmazonSNSSetEndpointAttributesCommand(endpointArn, attributes).apply(init)) as com.amazonaws.services.sns.model.SetEndpointAttributesResult
}

@Generated
class AmazonSNSSetEndpointAttributesCommand(val endpointArn: String, val attributes: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.SetEndpointAttributesRequest, com.amazonaws.services.sns.model.SetEndpointAttributesResult> {



	override fun build(): com.amazonaws.services.sns.model.SetEndpointAttributesRequest {
		val input = com.amazonaws.services.sns.model.SetEndpointAttributesRequest()
		input.setEndpointArn(this.endpointArn)
		input.setAttributes(this.attributes)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.SetEndpointAttributesResult {
	  return com.amazonaws.services.sns.model.SetEndpointAttributesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.SetEndpointAttributesResult {
		return environment.sns.setEndpointAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns set-endpoint-attributes")
				.argument("endpoint-arn", endpointArn)
				.argument("attributes", attributes.toString())
	}

}


fun AmazonSNSFunctions.setPlatformApplicationAttributes(platformApplicationArn: String, attributes: Map<String, String>, init: AmazonSNSSetPlatformApplicationAttributesCommand.() -> Unit): com.amazonaws.services.sns.model.SetPlatformApplicationAttributesResult {
	return this.block.declare(AmazonSNSSetPlatformApplicationAttributesCommand(platformApplicationArn, attributes).apply(init)) as com.amazonaws.services.sns.model.SetPlatformApplicationAttributesResult
}

@Generated
class AmazonSNSSetPlatformApplicationAttributesCommand(val platformApplicationArn: String, val attributes: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest, com.amazonaws.services.sns.model.SetPlatformApplicationAttributesResult> {



	override fun build(): com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest {
		val input = com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest()
		input.setPlatformApplicationArn(this.platformApplicationArn)
		input.setAttributes(this.attributes)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.SetPlatformApplicationAttributesResult {
	  return com.amazonaws.services.sns.model.SetPlatformApplicationAttributesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.SetPlatformApplicationAttributesResult {
		return environment.sns.setPlatformApplicationAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns set-platform-application-attributes")
				.argument("platform-application-arn", platformApplicationArn)
				.argument("attributes", attributes.toString())
	}

}


fun AmazonSNSFunctions.setSMSAttributes(init: AmazonSNSSetSMSAttributesCommand.() -> Unit): com.amazonaws.services.sns.model.SetSMSAttributesResult {
	return this.block.declare(AmazonSNSSetSMSAttributesCommand().apply(init)) as com.amazonaws.services.sns.model.SetSMSAttributesResult
}

@Generated
class AmazonSNSSetSMSAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.sns.model.SetSMSAttributesRequest, com.amazonaws.services.sns.model.SetSMSAttributesResult> {

	var attributes: Map<String, String>? = null

	override fun build(): com.amazonaws.services.sns.model.SetSMSAttributesRequest {
		val input = com.amazonaws.services.sns.model.SetSMSAttributesRequest()
		input.setAttributes(this.attributes)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.SetSMSAttributesResult {
	  return com.amazonaws.services.sns.model.SetSMSAttributesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.SetSMSAttributesResult {
		return environment.sns.setSMSAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns set-smsattributes")
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonSNSFunctions.setSubscriptionAttributes(subscriptionArn: String, attributeName: String, init: AmazonSNSSetSubscriptionAttributesCommand.() -> Unit): com.amazonaws.services.sns.model.SetSubscriptionAttributesResult {
	return this.block.declare(AmazonSNSSetSubscriptionAttributesCommand(subscriptionArn, attributeName).apply(init)) as com.amazonaws.services.sns.model.SetSubscriptionAttributesResult
}

@Generated
class AmazonSNSSetSubscriptionAttributesCommand(val subscriptionArn: String, val attributeName: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.SetSubscriptionAttributesRequest, com.amazonaws.services.sns.model.SetSubscriptionAttributesResult> {

	var attributeValue: String? = null

	override fun build(): com.amazonaws.services.sns.model.SetSubscriptionAttributesRequest {
		val input = com.amazonaws.services.sns.model.SetSubscriptionAttributesRequest()
		input.setSubscriptionArn(this.subscriptionArn)
		input.setAttributeName(this.attributeName)
		input.setAttributeValue(this.attributeValue)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.SetSubscriptionAttributesResult {
	  return com.amazonaws.services.sns.model.SetSubscriptionAttributesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.SetSubscriptionAttributesResult {
		return environment.sns.setSubscriptionAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns set-subscription-attributes")
				.argument("subscription-arn", subscriptionArn)
				.argument("attribute-name", attributeName)
				.argument("attribute-value", attributeValue)
	}

}


fun AmazonSNSFunctions.setTopicAttributes(topicArn: String, attributeName: String, init: AmazonSNSSetTopicAttributesCommand.() -> Unit): com.amazonaws.services.sns.model.SetTopicAttributesResult {
	return this.block.declare(AmazonSNSSetTopicAttributesCommand(topicArn, attributeName).apply(init)) as com.amazonaws.services.sns.model.SetTopicAttributesResult
}

@Generated
class AmazonSNSSetTopicAttributesCommand(val topicArn: String, val attributeName: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.SetTopicAttributesRequest, com.amazonaws.services.sns.model.SetTopicAttributesResult> {

	var attributeValue: String? = null

	override fun build(): com.amazonaws.services.sns.model.SetTopicAttributesRequest {
		val input = com.amazonaws.services.sns.model.SetTopicAttributesRequest()
		input.setTopicArn(this.topicArn)
		input.setAttributeName(this.attributeName)
		input.setAttributeValue(this.attributeValue)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.SetTopicAttributesResult {
	  return com.amazonaws.services.sns.model.SetTopicAttributesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.SetTopicAttributesResult {
		return environment.sns.setTopicAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns set-topic-attributes")
				.argument("topic-arn", topicArn)
				.argument("attribute-name", attributeName)
				.argument("attribute-value", attributeValue)
	}

}


fun AmazonSNSFunctions.subscribe(topicArn: String, protocol: String, init: AmazonSNSSubscribeCommand.() -> Unit): com.amazonaws.services.sns.model.SubscribeResult {
	return this.block.declare(AmazonSNSSubscribeCommand(topicArn, protocol).apply(init)) as com.amazonaws.services.sns.model.SubscribeResult
}

@Generated
class AmazonSNSSubscribeCommand(val topicArn: String, val protocol: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.SubscribeRequest, com.amazonaws.services.sns.model.SubscribeResult> {

	var endpoint: String? = null

	override fun build(): com.amazonaws.services.sns.model.SubscribeRequest {
		val input = com.amazonaws.services.sns.model.SubscribeRequest()
		input.setTopicArn(this.topicArn)
		input.setProtocol(this.protocol)
		input.setEndpoint(this.endpoint)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.SubscribeResult {
	  return com.amazonaws.services.sns.model.SubscribeResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.SubscribeResult {
		return environment.sns.subscribe(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns subscribe")
				.argument("topic-arn", topicArn)
				.argument("protocol", protocol)
				.argument("endpoint", endpoint)
	}

}


fun AmazonSNSFunctions.unsubscribe(subscriptionArn: String, init: AmazonSNSUnsubscribeCommand.() -> Unit): com.amazonaws.services.sns.model.UnsubscribeResult {
	return this.block.declare(AmazonSNSUnsubscribeCommand(subscriptionArn).apply(init)) as com.amazonaws.services.sns.model.UnsubscribeResult
}

@Generated
class AmazonSNSUnsubscribeCommand(val subscriptionArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.UnsubscribeRequest, com.amazonaws.services.sns.model.UnsubscribeResult> {



	override fun build(): com.amazonaws.services.sns.model.UnsubscribeRequest {
		val input = com.amazonaws.services.sns.model.UnsubscribeRequest()
		input.setSubscriptionArn(this.subscriptionArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.sns.model.UnsubscribeResult {
	  return com.amazonaws.services.sns.model.UnsubscribeResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sns.model.UnsubscribeResult {
		return environment.sns.unsubscribe(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns unsubscribe")
				.argument("subscription-arn", subscriptionArn)
	}

}
