
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.connect.AmazonConnect
import com.amazonaws.services.connect.model.*

var codingue.koops.core.Environment.connect: AmazonConnect
	get() = this.capabilities[AmazonConnect::class.java.name] as AmazonConnect
	set(connect) {
		this.capabilities[AmazonConnect::class.java.name] = connect
	}

@Generated
class AmazonConnectFunctions(val block: Block)

infix fun AwsContinuation.connect(init: AmazonConnectFunctions.() -> Unit) {
	AmazonConnectFunctions(shell).apply(init)
}

			

fun AmazonConnectFunctions.startOutboundVoiceContact(destinationPhoneNumber: String, contactFlowId: String, instanceId: String, init: AmazonConnectStartOutboundVoiceContactCommand.() -> Unit) {
	this.block.declare(AmazonConnectStartOutboundVoiceContactCommand(destinationPhoneNumber, contactFlowId, instanceId).apply(init))
}

@Generated
class AmazonConnectStartOutboundVoiceContactCommand(val destinationPhoneNumber: String, val contactFlowId: String, val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.connect.model.StartOutboundVoiceContactRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.connect.startOutboundVoiceContact(build())
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


fun AmazonConnectFunctions.stopContact(contactId: String, instanceId: String, init: AmazonConnectStopContactCommand.() -> Unit) {
	this.block.declare(AmazonConnectStopContactCommand(contactId, instanceId).apply(init))
}

@Generated
class AmazonConnectStopContactCommand(val contactId: String, val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.connect.model.StopContactRequest> {



	override fun build(): com.amazonaws.services.connect.model.StopContactRequest {
		val input = com.amazonaws.services.connect.model.StopContactRequest()
		input.setContactId(this.contactId)
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.connect.stopContact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws connect stop-contact")
				.argument("contact-id", contactId)
				.argument("instance-id", instanceId)
	}

}
