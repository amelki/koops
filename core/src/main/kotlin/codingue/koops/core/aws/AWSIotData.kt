
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
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

infix fun <T> AwsContinuation.iotdata(init: AWSIotDataFunctions.() -> T): T {
	return AWSIotDataFunctions(shell).run(init)
}

			

fun AWSIotDataFunctions.deleteThingShadow(init: AWSIotDataDeleteThingShadowCommand.() -> Unit): com.amazonaws.services.iotdata.model.DeleteThingShadowResult {
	return this.block.declare(AWSIotDataDeleteThingShadowCommand().apply(init)) as com.amazonaws.services.iotdata.model.DeleteThingShadowResult
}

@Generated
class AWSIotDataDeleteThingShadowCommand() : AmazonWebServiceCommand<com.amazonaws.services.iotdata.model.DeleteThingShadowRequest, com.amazonaws.services.iotdata.model.DeleteThingShadowResult> {

	var thingName: String? = null

	override fun build(): com.amazonaws.services.iotdata.model.DeleteThingShadowRequest {
		val input = com.amazonaws.services.iotdata.model.DeleteThingShadowRequest()
		input.setThingName(this.thingName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iotdata.model.DeleteThingShadowResult {
	  return com.amazonaws.services.iotdata.model.DeleteThingShadowResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iotdata.model.DeleteThingShadowResult {
		return environment.iotdata.deleteThingShadow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iotdata delete-thing-shadow")
				.argument("thing-name", thingName)
	}

}


fun AWSIotDataFunctions.getThingShadow(init: AWSIotDataGetThingShadowCommand.() -> Unit): com.amazonaws.services.iotdata.model.GetThingShadowResult {
	return this.block.declare(AWSIotDataGetThingShadowCommand().apply(init)) as com.amazonaws.services.iotdata.model.GetThingShadowResult
}

@Generated
class AWSIotDataGetThingShadowCommand() : AmazonWebServiceCommand<com.amazonaws.services.iotdata.model.GetThingShadowRequest, com.amazonaws.services.iotdata.model.GetThingShadowResult> {

	var thingName: String? = null

	override fun build(): com.amazonaws.services.iotdata.model.GetThingShadowRequest {
		val input = com.amazonaws.services.iotdata.model.GetThingShadowRequest()
		input.setThingName(this.thingName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iotdata.model.GetThingShadowResult {
	  return com.amazonaws.services.iotdata.model.GetThingShadowResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iotdata.model.GetThingShadowResult {
		return environment.iotdata.getThingShadow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iotdata get-thing-shadow")
				.argument("thing-name", thingName)
	}

}


fun AWSIotDataFunctions.publish(init: AWSIotDataPublishCommand.() -> Unit): com.amazonaws.services.iotdata.model.PublishResult {
	return this.block.declare(AWSIotDataPublishCommand().apply(init)) as com.amazonaws.services.iotdata.model.PublishResult
}

@Generated
class AWSIotDataPublishCommand() : AmazonWebServiceCommand<com.amazonaws.services.iotdata.model.PublishRequest, com.amazonaws.services.iotdata.model.PublishResult> {

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

	
	override fun dryResult(): com.amazonaws.services.iotdata.model.PublishResult {
	  return com.amazonaws.services.iotdata.model.PublishResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iotdata.model.PublishResult {
		return environment.iotdata.publish(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iotdata publish")
				.argument("topic", topic)
				.argument("qos", qos?.toString())
				.argument("payload", payload?.toString())
	}

}


fun AWSIotDataFunctions.updateThingShadow(init: AWSIotDataUpdateThingShadowCommand.() -> Unit): com.amazonaws.services.iotdata.model.UpdateThingShadowResult {
	return this.block.declare(AWSIotDataUpdateThingShadowCommand().apply(init)) as com.amazonaws.services.iotdata.model.UpdateThingShadowResult
}

@Generated
class AWSIotDataUpdateThingShadowCommand() : AmazonWebServiceCommand<com.amazonaws.services.iotdata.model.UpdateThingShadowRequest, com.amazonaws.services.iotdata.model.UpdateThingShadowResult> {

	var thingName: String? = null
	var payload: java.nio.ByteBuffer? = null

	override fun build(): com.amazonaws.services.iotdata.model.UpdateThingShadowRequest {
		val input = com.amazonaws.services.iotdata.model.UpdateThingShadowRequest()
		input.setThingName(this.thingName)
		input.setPayload(this.payload)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.iotdata.model.UpdateThingShadowResult {
	  return com.amazonaws.services.iotdata.model.UpdateThingShadowResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.iotdata.model.UpdateThingShadowResult {
		return environment.iotdata.updateThingShadow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws iotdata update-thing-shadow")
				.argument("thing-name", thingName)
				.argument("payload", payload?.toString())
	}

}
