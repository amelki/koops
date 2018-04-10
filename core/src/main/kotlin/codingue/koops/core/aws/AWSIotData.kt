
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.iotdata.AWSIotData
import com.amazonaws.services.iotdata.model.*

var codingue.koops.core.Environment.iotdata: AWSIotData
	get() = this.capabilities[AWSIotData::class.java.name] as AWSIotData
	set(iotdata) {
		this.capabilities[AWSIotData::class.java.name] = iotdata
	}

@Generated
class AWSIotDataFunctions(val block: Block)

infix fun AwsContinuation.iotdata(init: AWSIotDataFunctions.() -> Unit) {
	AWSIotDataFunctions(shell).apply(init)
}

			

fun AWSIotDataFunctions.deleteThingShadow(init: AWSIotDataDeleteThingShadowCommand.() -> Unit) {
	this.block.declare(AWSIotDataDeleteThingShadowCommand().apply(init))
}

@Generated
class AWSIotDataDeleteThingShadowCommand() : AmazonWebServiceCommand<com.amazonaws.services.iotdata.model.DeleteThingShadowRequest> {

	var thingName: String? = null

	override fun build(): com.amazonaws.services.iotdata.model.DeleteThingShadowRequest {
		val input = com.amazonaws.services.iotdata.model.DeleteThingShadowRequest()
		input.setThingName(this.thingName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iotdata.deleteThingShadow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iotdata delete-thing-shadow")
				.argument("thing-name", thingName)
	}

}


fun AWSIotDataFunctions.getThingShadow(init: AWSIotDataGetThingShadowCommand.() -> Unit) {
	this.block.declare(AWSIotDataGetThingShadowCommand().apply(init))
}

@Generated
class AWSIotDataGetThingShadowCommand() : AmazonWebServiceCommand<com.amazonaws.services.iotdata.model.GetThingShadowRequest> {

	var thingName: String? = null

	override fun build(): com.amazonaws.services.iotdata.model.GetThingShadowRequest {
		val input = com.amazonaws.services.iotdata.model.GetThingShadowRequest()
		input.setThingName(this.thingName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iotdata.getThingShadow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iotdata get-thing-shadow")
				.argument("thing-name", thingName)
	}

}


fun AWSIotDataFunctions.publish(init: AWSIotDataPublishCommand.() -> Unit) {
	this.block.declare(AWSIotDataPublishCommand().apply(init))
}

@Generated
class AWSIotDataPublishCommand() : AmazonWebServiceCommand<com.amazonaws.services.iotdata.model.PublishRequest> {

	var topic: String? = null
	var qos: Int? = 0
	var payload: java.nio.ByteBuffer? = null

	override fun build(): com.amazonaws.services.iotdata.model.PublishRequest {
		val input = com.amazonaws.services.iotdata.model.PublishRequest()
		input.setTopic(this.topic)
		input.setQos(this.qos)
		input.setPayload(this.payload)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iotdata.publish(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iotdata publish")
				.argument("topic", topic)
				.argument("qos", qos?.toString())
				.argument("payload", payload?.toString())
	}

}


fun AWSIotDataFunctions.updateThingShadow(init: AWSIotDataUpdateThingShadowCommand.() -> Unit) {
	this.block.declare(AWSIotDataUpdateThingShadowCommand().apply(init))
}

@Generated
class AWSIotDataUpdateThingShadowCommand() : AmazonWebServiceCommand<com.amazonaws.services.iotdata.model.UpdateThingShadowRequest> {

	var thingName: String? = null
	var payload: java.nio.ByteBuffer? = null

	override fun build(): com.amazonaws.services.iotdata.model.UpdateThingShadowRequest {
		val input = com.amazonaws.services.iotdata.model.UpdateThingShadowRequest()
		input.setThingName(this.thingName)
		input.setPayload(this.payload)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.iotdata.updateThingShadow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iotdata update-thing-shadow")
				.argument("thing-name", thingName)
				.argument("payload", payload?.toString())
	}

}
