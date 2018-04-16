
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.connect

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.connect.*

var com.codingue.koops.core.Environment.connect: AmazonConnect
	get() {
		var service = this.capabilities["aws-connect"]
		if (service == null) {
			service = AmazonConnectClientBuilder.standard().build()
			this.capabilities["aws-connect"] = service
		}
		return service as AmazonConnect
	}
	set(connect) {
		this.capabilities["aws-connect"] = connect
	}

@Generated
class AmazonConnectFunctions(val block: Script)

infix fun <T> AwsContinuation.connect(init: AmazonConnectFunctions.() -> T): T {
	return AmazonConnectFunctions(shell).run(init)
}

			

fun AmazonConnectFunctions.startOutboundVoiceContact(destinationPhoneNumber: String, contactFlowId: String, instanceId: String, init: (AmazonConnectStartOutboundVoiceContactCommand.() -> Unit)? = null): com.amazonaws.services.connect.model.StartOutboundVoiceContactResult {
	return this.block.declare(AmazonConnectStartOutboundVoiceContactCommand(destinationPhoneNumber, contactFlowId, instanceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.connect.model.StartOutboundVoiceContactResult
}

@Generated
class AmazonConnectStartOutboundVoiceContactCommand(val destinationPhoneNumber: String, val contactFlowId: String, val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.connect.model.StartOutboundVoiceContactRequest, com.amazonaws.services.connect.model.StartOutboundVoiceContactResult> {

	var clientToken: String? = null
	var sourcePhoneNumber: String? = null
	var queueId: String? = null
	var attributes: Map<String, String>? = null

	override fun build(): com.amazonaws.services.connect.model.StartOutboundVoiceContactRequest {
		val input = com.amazonaws.services.connect.model.StartOutboundVoiceContactRequest()
		input.setDestinationPhoneNumber(this.destinationPhoneNumber)
		input.setContactFlowId(this.contactFlowId)
		input.setInstanceId(this.instanceId)
		input.setClientToken(this.clientToken)
		input.setSourcePhoneNumber(this.sourcePhoneNumber)
		input.setQueueId(this.queueId)
		input.setAttributes(this.attributes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.connect.model.StartOutboundVoiceContactResult {
	  return com.amazonaws.services.connect.model.StartOutboundVoiceContactResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.connect.model.StartOutboundVoiceContactResult {
		return environment.connect.startOutboundVoiceContact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws connect start-outbound-voice-contact")
				.argument("destination-phone-number", destinationPhoneNumber)
				.argument("contact-flow-id", contactFlowId)
				.argument("instance-id", instanceId)
				.argument("client-token", clientToken)
				.argument("source-phone-number", sourcePhoneNumber)
				.argument("queue-id", queueId)
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonConnectFunctions.stopContact(contactId: String, instanceId: String, init: (AmazonConnectStopContactCommand.() -> Unit)? = null): com.amazonaws.services.connect.model.StopContactResult {
	return this.block.declare(AmazonConnectStopContactCommand(contactId, instanceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.connect.model.StopContactResult
}

@Generated
class AmazonConnectStopContactCommand(val contactId: String, val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.connect.model.StopContactRequest, com.amazonaws.services.connect.model.StopContactResult> {



	override fun build(): com.amazonaws.services.connect.model.StopContactRequest {
		val input = com.amazonaws.services.connect.model.StopContactRequest()
		input.setContactId(this.contactId)
		input.setInstanceId(this.instanceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.connect.model.StopContactResult {
	  return com.amazonaws.services.connect.model.StopContactResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.connect.model.StopContactResult {
		return environment.connect.stopContact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws connect stop-contact")
				.argument("contact-id", contactId)
				.argument("instance-id", instanceId)
	}

}
