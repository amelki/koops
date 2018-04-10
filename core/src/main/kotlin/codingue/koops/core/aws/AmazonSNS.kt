
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

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

infix fun AwsContinuation.sns(init: AmazonSNSFunctions.() -> Unit) {
	AmazonSNSFunctions(shell).apply(init)
}

			

fun AmazonSNSFunctions.addPermission(topicArn: String, label: String, init: AmazonSNSAddPermissionCommand.() -> Unit) {
	this.block.declare(AmazonSNSAddPermissionCommand(topicArn, label).apply(init))
}

@Generated
class AmazonSNSAddPermissionCommand(val topicArn: String, val label: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.AddPermissionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.addPermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns add-permission")
				.argument("topic-arn", topicArn)
				.argument("label", label)
				.argument("awsaccount-ids", aWSAccountIds?.toString())
				.argument("action-names", actionNames?.toString())
	}

}


fun AmazonSNSFunctions.checkIfPhoneNumberIsOptedOut(init: AmazonSNSCheckIfPhoneNumberIsOptedOutCommand.() -> Unit) {
	this.block.declare(AmazonSNSCheckIfPhoneNumberIsOptedOutCommand().apply(init))
}

@Generated
class AmazonSNSCheckIfPhoneNumberIsOptedOutCommand() : AmazonWebServiceCommand<com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest> {

	var phoneNumber: String? = null

	override fun build(): com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest {
		val input = com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest()
		input.setPhoneNumber(this.phoneNumber)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.checkIfPhoneNumberIsOptedOut(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns check-if-phone-number-is-opted-out")
				.argument("phone-number", phoneNumber)
	}

}


fun AmazonSNSFunctions.confirmSubscription(topicArn: String, token: String, init: AmazonSNSConfirmSubscriptionCommand.() -> Unit) {
	this.block.declare(AmazonSNSConfirmSubscriptionCommand(topicArn, token).apply(init))
}

@Generated
class AmazonSNSConfirmSubscriptionCommand(val topicArn: String, val token: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.ConfirmSubscriptionRequest> {

	var authenticateOnUnsubscribe: String? = null

	override fun build(): com.amazonaws.services.sns.model.ConfirmSubscriptionRequest {
		val input = com.amazonaws.services.sns.model.ConfirmSubscriptionRequest()
		input.setTopicArn(this.topicArn)
		input.setToken(this.token)
		input.setAuthenticateOnUnsubscribe(this.authenticateOnUnsubscribe)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.confirmSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns confirm-subscription")
				.argument("topic-arn", topicArn)
				.argument("token", token)
				.argument("authenticate-on-unsubscribe", authenticateOnUnsubscribe)
	}

}


fun AmazonSNSFunctions.createPlatformApplication(name: String, platform: String, attributes: Map<String, String>, init: AmazonSNSCreatePlatformApplicationCommand.() -> Unit) {
	this.block.declare(AmazonSNSCreatePlatformApplicationCommand(name, platform, attributes).apply(init))
}

@Generated
class AmazonSNSCreatePlatformApplicationCommand(val name: String, val platform: String, val attributes: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.CreatePlatformApplicationRequest> {



	override fun build(): com.amazonaws.services.sns.model.CreatePlatformApplicationRequest {
		val input = com.amazonaws.services.sns.model.CreatePlatformApplicationRequest()
		input.setName(this.name)
		input.setPlatform(this.platform)
		input.setAttributes(this.attributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.createPlatformApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns create-platform-application")
				.argument("name", name)
				.argument("platform", platform)
				.argument("attributes", attributes.toString())
	}

}


fun AmazonSNSFunctions.createPlatformEndpoint(platformApplicationArn: String, token: String, init: AmazonSNSCreatePlatformEndpointCommand.() -> Unit) {
	this.block.declare(AmazonSNSCreatePlatformEndpointCommand(platformApplicationArn, token).apply(init))
}

@Generated
class AmazonSNSCreatePlatformEndpointCommand(val platformApplicationArn: String, val token: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.CreatePlatformEndpointRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.createPlatformEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns create-platform-endpoint")
				.argument("platform-application-arn", platformApplicationArn)
				.argument("token", token)
				.argument("custom-user-data", customUserData)
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonSNSFunctions.createTopic(name: String, init: AmazonSNSCreateTopicCommand.() -> Unit) {
	this.block.declare(AmazonSNSCreateTopicCommand(name).apply(init))
}

@Generated
class AmazonSNSCreateTopicCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.CreateTopicRequest> {



	override fun build(): com.amazonaws.services.sns.model.CreateTopicRequest {
		val input = com.amazonaws.services.sns.model.CreateTopicRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.createTopic(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns create-topic")
				.argument("name", name)
	}

}


fun AmazonSNSFunctions.deleteEndpoint(endpointArn: String, init: AmazonSNSDeleteEndpointCommand.() -> Unit) {
	this.block.declare(AmazonSNSDeleteEndpointCommand(endpointArn).apply(init))
}

@Generated
class AmazonSNSDeleteEndpointCommand(val endpointArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.DeleteEndpointRequest> {



	override fun build(): com.amazonaws.services.sns.model.DeleteEndpointRequest {
		val input = com.amazonaws.services.sns.model.DeleteEndpointRequest()
		input.setEndpointArn(this.endpointArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.deleteEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns delete-endpoint")
				.argument("endpoint-arn", endpointArn)
	}

}


fun AmazonSNSFunctions.deletePlatformApplication(platformApplicationArn: String, init: AmazonSNSDeletePlatformApplicationCommand.() -> Unit) {
	this.block.declare(AmazonSNSDeletePlatformApplicationCommand(platformApplicationArn).apply(init))
}

@Generated
class AmazonSNSDeletePlatformApplicationCommand(val platformApplicationArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.DeletePlatformApplicationRequest> {



	override fun build(): com.amazonaws.services.sns.model.DeletePlatformApplicationRequest {
		val input = com.amazonaws.services.sns.model.DeletePlatformApplicationRequest()
		input.setPlatformApplicationArn(this.platformApplicationArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.deletePlatformApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns delete-platform-application")
				.argument("platform-application-arn", platformApplicationArn)
	}

}


fun AmazonSNSFunctions.deleteTopic(topicArn: String, init: AmazonSNSDeleteTopicCommand.() -> Unit) {
	this.block.declare(AmazonSNSDeleteTopicCommand(topicArn).apply(init))
}

@Generated
class AmazonSNSDeleteTopicCommand(val topicArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.DeleteTopicRequest> {



	override fun build(): com.amazonaws.services.sns.model.DeleteTopicRequest {
		val input = com.amazonaws.services.sns.model.DeleteTopicRequest()
		input.setTopicArn(this.topicArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.deleteTopic(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns delete-topic")
				.argument("topic-arn", topicArn)
	}

}


fun AmazonSNSFunctions.getEndpointAttributes(endpointArn: String, init: AmazonSNSGetEndpointAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSNSGetEndpointAttributesCommand(endpointArn).apply(init))
}

@Generated
class AmazonSNSGetEndpointAttributesCommand(val endpointArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.GetEndpointAttributesRequest> {



	override fun build(): com.amazonaws.services.sns.model.GetEndpointAttributesRequest {
		val input = com.amazonaws.services.sns.model.GetEndpointAttributesRequest()
		input.setEndpointArn(this.endpointArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.getEndpointAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns get-endpoint-attributes")
				.argument("endpoint-arn", endpointArn)
	}

}


fun AmazonSNSFunctions.getPlatformApplicationAttributes(platformApplicationArn: String, init: AmazonSNSGetPlatformApplicationAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSNSGetPlatformApplicationAttributesCommand(platformApplicationArn).apply(init))
}

@Generated
class AmazonSNSGetPlatformApplicationAttributesCommand(val platformApplicationArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest> {



	override fun build(): com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest {
		val input = com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest()
		input.setPlatformApplicationArn(this.platformApplicationArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.getPlatformApplicationAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns get-platform-application-attributes")
				.argument("platform-application-arn", platformApplicationArn)
	}

}


fun AmazonSNSFunctions.getSMSAttributes(init: AmazonSNSGetSMSAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSNSGetSMSAttributesCommand().apply(init))
}

@Generated
class AmazonSNSGetSMSAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.sns.model.GetSMSAttributesRequest> {

	var attributes: List<String>? = null

	override fun build(): com.amazonaws.services.sns.model.GetSMSAttributesRequest {
		val input = com.amazonaws.services.sns.model.GetSMSAttributesRequest()
		input.setAttributes(this.attributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.getSMSAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns get-smsattributes")
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonSNSFunctions.getSubscriptionAttributes(subscriptionArn: String, init: AmazonSNSGetSubscriptionAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSNSGetSubscriptionAttributesCommand(subscriptionArn).apply(init))
}

@Generated
class AmazonSNSGetSubscriptionAttributesCommand(val subscriptionArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest> {



	override fun build(): com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest {
		val input = com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest()
		input.setSubscriptionArn(this.subscriptionArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.getSubscriptionAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns get-subscription-attributes")
				.argument("subscription-arn", subscriptionArn)
	}

}


fun AmazonSNSFunctions.getTopicAttributes(topicArn: String, init: AmazonSNSGetTopicAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSNSGetTopicAttributesCommand(topicArn).apply(init))
}

@Generated
class AmazonSNSGetTopicAttributesCommand(val topicArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.GetTopicAttributesRequest> {



	override fun build(): com.amazonaws.services.sns.model.GetTopicAttributesRequest {
		val input = com.amazonaws.services.sns.model.GetTopicAttributesRequest()
		input.setTopicArn(this.topicArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.getTopicAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns get-topic-attributes")
				.argument("topic-arn", topicArn)
	}

}


fun AmazonSNSFunctions.listEndpointsByPlatformApplication(platformApplicationArn: String, init: AmazonSNSListEndpointsByPlatformApplicationCommand.() -> Unit) {
	this.block.declare(AmazonSNSListEndpointsByPlatformApplicationCommand(platformApplicationArn).apply(init))
}

@Generated
class AmazonSNSListEndpointsByPlatformApplicationCommand(val platformApplicationArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest {
		val input = com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest()
		input.setPlatformApplicationArn(this.platformApplicationArn)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.listEndpointsByPlatformApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns list-endpoints-by-platform-application")
				.argument("platform-application-arn", platformApplicationArn)
				.argument("next-token", nextToken)
	}

}


fun AmazonSNSFunctions.listPhoneNumbersOptedOut(init: AmazonSNSListPhoneNumbersOptedOutCommand.() -> Unit) {
	this.block.declare(AmazonSNSListPhoneNumbersOptedOutCommand().apply(init))
}

@Generated
class AmazonSNSListPhoneNumbersOptedOutCommand() : AmazonWebServiceCommand<com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutRequest {
		val input = com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.listPhoneNumbersOptedOut(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns list-phone-numbers-opted-out")
				.argument("next-token", nextToken)
	}

}


fun AmazonSNSFunctions.listPlatformApplications(init: AmazonSNSListPlatformApplicationsCommand.() -> Unit) {
	this.block.declare(AmazonSNSListPlatformApplicationsCommand().apply(init))
}

@Generated
class AmazonSNSListPlatformApplicationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.sns.model.ListPlatformApplicationsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.sns.model.ListPlatformApplicationsRequest {
		val input = com.amazonaws.services.sns.model.ListPlatformApplicationsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.listPlatformApplications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns list-platform-applications")
				.argument("next-token", nextToken)
	}

}


fun AmazonSNSFunctions.listSubscriptions(init: AmazonSNSListSubscriptionsCommand.() -> Unit) {
	this.block.declare(AmazonSNSListSubscriptionsCommand().apply(init))
}

@Generated
class AmazonSNSListSubscriptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.sns.model.ListSubscriptionsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.sns.model.ListSubscriptionsRequest {
		val input = com.amazonaws.services.sns.model.ListSubscriptionsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.listSubscriptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns list-subscriptions")
				.argument("next-token", nextToken)
	}

}


fun AmazonSNSFunctions.listSubscriptionsByTopic(topicArn: String, init: AmazonSNSListSubscriptionsByTopicCommand.() -> Unit) {
	this.block.declare(AmazonSNSListSubscriptionsByTopicCommand(topicArn).apply(init))
}

@Generated
class AmazonSNSListSubscriptionsByTopicCommand(val topicArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.ListSubscriptionsByTopicRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.sns.model.ListSubscriptionsByTopicRequest {
		val input = com.amazonaws.services.sns.model.ListSubscriptionsByTopicRequest()
		input.setTopicArn(this.topicArn)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.listSubscriptionsByTopic(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns list-subscriptions-by-topic")
				.argument("topic-arn", topicArn)
				.argument("next-token", nextToken)
	}

}


fun AmazonSNSFunctions.listTopics(init: AmazonSNSListTopicsCommand.() -> Unit) {
	this.block.declare(AmazonSNSListTopicsCommand().apply(init))
}

@Generated
class AmazonSNSListTopicsCommand() : AmazonWebServiceCommand<com.amazonaws.services.sns.model.ListTopicsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.sns.model.ListTopicsRequest {
		val input = com.amazonaws.services.sns.model.ListTopicsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.listTopics(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns list-topics")
				.argument("next-token", nextToken)
	}

}


fun AmazonSNSFunctions.optInPhoneNumber(init: AmazonSNSOptInPhoneNumberCommand.() -> Unit) {
	this.block.declare(AmazonSNSOptInPhoneNumberCommand().apply(init))
}

@Generated
class AmazonSNSOptInPhoneNumberCommand() : AmazonWebServiceCommand<com.amazonaws.services.sns.model.OptInPhoneNumberRequest> {

	var phoneNumber: String? = null

	override fun build(): com.amazonaws.services.sns.model.OptInPhoneNumberRequest {
		val input = com.amazonaws.services.sns.model.OptInPhoneNumberRequest()
		input.setPhoneNumber(this.phoneNumber)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.optInPhoneNumber(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns opt-in-phone-number")
				.argument("phone-number", phoneNumber)
	}

}


fun AmazonSNSFunctions.publish(message: String, init: AmazonSNSPublishCommand.() -> Unit) {
	this.block.declare(AmazonSNSPublishCommand(message).apply(init))
}

@Generated
class AmazonSNSPublishCommand(val message: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.PublishRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.publish(build())
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


fun AmazonSNSFunctions.removePermission(topicArn: String, label: String, init: AmazonSNSRemovePermissionCommand.() -> Unit) {
	this.block.declare(AmazonSNSRemovePermissionCommand(topicArn, label).apply(init))
}

@Generated
class AmazonSNSRemovePermissionCommand(val topicArn: String, val label: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.RemovePermissionRequest> {



	override fun build(): com.amazonaws.services.sns.model.RemovePermissionRequest {
		val input = com.amazonaws.services.sns.model.RemovePermissionRequest()
		input.setTopicArn(this.topicArn)
		input.setLabel(this.label)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.removePermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns remove-permission")
				.argument("topic-arn", topicArn)
				.argument("label", label)
	}

}


fun AmazonSNSFunctions.setEndpointAttributes(endpointArn: String, attributes: Map<String, String>, init: AmazonSNSSetEndpointAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSNSSetEndpointAttributesCommand(endpointArn, attributes).apply(init))
}

@Generated
class AmazonSNSSetEndpointAttributesCommand(val endpointArn: String, val attributes: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.SetEndpointAttributesRequest> {



	override fun build(): com.amazonaws.services.sns.model.SetEndpointAttributesRequest {
		val input = com.amazonaws.services.sns.model.SetEndpointAttributesRequest()
		input.setEndpointArn(this.endpointArn)
		input.setAttributes(this.attributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.setEndpointAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns set-endpoint-attributes")
				.argument("endpoint-arn", endpointArn)
				.argument("attributes", attributes.toString())
	}

}


fun AmazonSNSFunctions.setPlatformApplicationAttributes(platformApplicationArn: String, attributes: Map<String, String>, init: AmazonSNSSetPlatformApplicationAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSNSSetPlatformApplicationAttributesCommand(platformApplicationArn, attributes).apply(init))
}

@Generated
class AmazonSNSSetPlatformApplicationAttributesCommand(val platformApplicationArn: String, val attributes: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest> {



	override fun build(): com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest {
		val input = com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest()
		input.setPlatformApplicationArn(this.platformApplicationArn)
		input.setAttributes(this.attributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.setPlatformApplicationAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns set-platform-application-attributes")
				.argument("platform-application-arn", platformApplicationArn)
				.argument("attributes", attributes.toString())
	}

}


fun AmazonSNSFunctions.setSMSAttributes(init: AmazonSNSSetSMSAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSNSSetSMSAttributesCommand().apply(init))
}

@Generated
class AmazonSNSSetSMSAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.sns.model.SetSMSAttributesRequest> {

	var attributes: Map<String, String>? = null

	override fun build(): com.amazonaws.services.sns.model.SetSMSAttributesRequest {
		val input = com.amazonaws.services.sns.model.SetSMSAttributesRequest()
		input.setAttributes(this.attributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.setSMSAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns set-smsattributes")
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonSNSFunctions.setSubscriptionAttributes(subscriptionArn: String, attributeName: String, init: AmazonSNSSetSubscriptionAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSNSSetSubscriptionAttributesCommand(subscriptionArn, attributeName).apply(init))
}

@Generated
class AmazonSNSSetSubscriptionAttributesCommand(val subscriptionArn: String, val attributeName: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.SetSubscriptionAttributesRequest> {

	var attributeValue: String? = null

	override fun build(): com.amazonaws.services.sns.model.SetSubscriptionAttributesRequest {
		val input = com.amazonaws.services.sns.model.SetSubscriptionAttributesRequest()
		input.setSubscriptionArn(this.subscriptionArn)
		input.setAttributeName(this.attributeName)
		input.setAttributeValue(this.attributeValue)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.setSubscriptionAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns set-subscription-attributes")
				.argument("subscription-arn", subscriptionArn)
				.argument("attribute-name", attributeName)
				.argument("attribute-value", attributeValue)
	}

}


fun AmazonSNSFunctions.setTopicAttributes(topicArn: String, attributeName: String, init: AmazonSNSSetTopicAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSNSSetTopicAttributesCommand(topicArn, attributeName).apply(init))
}

@Generated
class AmazonSNSSetTopicAttributesCommand(val topicArn: String, val attributeName: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.SetTopicAttributesRequest> {

	var attributeValue: String? = null

	override fun build(): com.amazonaws.services.sns.model.SetTopicAttributesRequest {
		val input = com.amazonaws.services.sns.model.SetTopicAttributesRequest()
		input.setTopicArn(this.topicArn)
		input.setAttributeName(this.attributeName)
		input.setAttributeValue(this.attributeValue)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.setTopicAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns set-topic-attributes")
				.argument("topic-arn", topicArn)
				.argument("attribute-name", attributeName)
				.argument("attribute-value", attributeValue)
	}

}


fun AmazonSNSFunctions.subscribe(topicArn: String, protocol: String, init: AmazonSNSSubscribeCommand.() -> Unit) {
	this.block.declare(AmazonSNSSubscribeCommand(topicArn, protocol).apply(init))
}

@Generated
class AmazonSNSSubscribeCommand(val topicArn: String, val protocol: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.SubscribeRequest> {

	var endpoint: String? = null

	override fun build(): com.amazonaws.services.sns.model.SubscribeRequest {
		val input = com.amazonaws.services.sns.model.SubscribeRequest()
		input.setTopicArn(this.topicArn)
		input.setProtocol(this.protocol)
		input.setEndpoint(this.endpoint)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.subscribe(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns subscribe")
				.argument("topic-arn", topicArn)
				.argument("protocol", protocol)
				.argument("endpoint", endpoint)
	}

}


fun AmazonSNSFunctions.unsubscribe(subscriptionArn: String, init: AmazonSNSUnsubscribeCommand.() -> Unit) {
	this.block.declare(AmazonSNSUnsubscribeCommand(subscriptionArn).apply(init))
}

@Generated
class AmazonSNSUnsubscribeCommand(val subscriptionArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sns.model.UnsubscribeRequest> {



	override fun build(): com.amazonaws.services.sns.model.UnsubscribeRequest {
		val input = com.amazonaws.services.sns.model.UnsubscribeRequest()
		input.setSubscriptionArn(this.subscriptionArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sns.unsubscribe(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sns unsubscribe")
				.argument("subscription-arn", subscriptionArn)
	}

}
