
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.medialive.AWSMediaLive
import com.amazonaws.services.medialive.model.*

var codingue.koops.core.Environment.medialive: AWSMediaLive
	get() = this.capabilities[AWSMediaLive::class.java.name] as AWSMediaLive
	set(medialive) {
		this.capabilities[AWSMediaLive::class.java.name] = medialive
	}

@Generated
class AWSMediaLiveFunctions(val block: Block)

infix fun AwsContinuation.medialive(init: AWSMediaLiveFunctions.() -> Unit) {
	AWSMediaLiveFunctions(shell).apply(init)
}

			

fun AWSMediaLiveFunctions.createChannel(init: AWSMediaLiveCreateChannelCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveCreateChannelCommand().apply(init))
}

@Generated
class AWSMediaLiveCreateChannelCommand() : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.CreateChannelRequest> {

	var destinations: List<com.amazonaws.services.medialive.model.OutputDestination>? = null
	var encoderSettings: com.amazonaws.services.medialive.model.EncoderSettings? = null
	var inputAttachments: List<com.amazonaws.services.medialive.model.InputAttachment>? = null
	var inputSpecification: com.amazonaws.services.medialive.model.InputSpecification? = null
	var name: String? = null
	var requestId: String? = null
	var reserved: String? = null
	var roleArn: String? = null

	override fun build(): com.amazonaws.services.medialive.model.CreateChannelRequest {
		val input = com.amazonaws.services.medialive.model.CreateChannelRequest()
		input.setDestinations(this.destinations)
		input.setEncoderSettings(this.encoderSettings)
		input.setInputAttachments(this.inputAttachments)
		input.setInputSpecification(this.inputSpecification)
		input.setName(this.name)
		input.setRequestId(this.requestId)
		input.setReserved(this.reserved)
		input.setRoleArn(this.roleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.createChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive create-channel")
				.argument("destinations", destinations?.toString())
				.argument("encoder-settings", encoderSettings?.toString())
				.argument("input-attachments", inputAttachments?.toString())
				.argument("input-specification", inputSpecification?.toString())
				.argument("name", name)
				.argument("request-id", requestId)
				.argument("reserved", reserved)
				.argument("role-arn", roleArn)
	}

}


fun AWSMediaLiveFunctions.createInput(init: AWSMediaLiveCreateInputCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveCreateInputCommand().apply(init))
}

@Generated
class AWSMediaLiveCreateInputCommand() : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.CreateInputRequest> {

	var destinations: List<com.amazonaws.services.medialive.model.InputDestinationRequest>? = null
	var inputSecurityGroups: List<String>? = null
	var name: String? = null
	var requestId: String? = null
	var sources: List<com.amazonaws.services.medialive.model.InputSourceRequest>? = null
	var type: InputType? = null

	override fun build(): com.amazonaws.services.medialive.model.CreateInputRequest {
		val input = com.amazonaws.services.medialive.model.CreateInputRequest()
		input.setDestinations(this.destinations)
		input.setInputSecurityGroups(this.inputSecurityGroups)
		input.setName(this.name)
		input.setRequestId(this.requestId)
		input.setSources(this.sources)
		input.setType(this.type?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.createInput(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive create-input")
				.argument("destinations", destinations?.toString())
				.argument("input-security-groups", inputSecurityGroups?.toString())
				.argument("name", name)
				.argument("request-id", requestId)
				.argument("sources", sources?.toString())
				.argument("type", type?.toString())
	}

}


fun AWSMediaLiveFunctions.createInputSecurityGroup(init: AWSMediaLiveCreateInputSecurityGroupCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveCreateInputSecurityGroupCommand().apply(init))
}

@Generated
class AWSMediaLiveCreateInputSecurityGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest> {

	var whitelistRules: List<com.amazonaws.services.medialive.model.InputWhitelistRuleCidr>? = null

	override fun build(): com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest {
		val input = com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest()
		input.setWhitelistRules(this.whitelistRules)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.createInputSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive create-input-security-group")
				.argument("whitelist-rules", whitelistRules?.toString())
	}

}


fun AWSMediaLiveFunctions.deleteChannel(channelId: String, init: AWSMediaLiveDeleteChannelCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveDeleteChannelCommand(channelId).apply(init))
}

@Generated
class AWSMediaLiveDeleteChannelCommand(val channelId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.DeleteChannelRequest> {



	override fun build(): com.amazonaws.services.medialive.model.DeleteChannelRequest {
		val input = com.amazonaws.services.medialive.model.DeleteChannelRequest()
		input.setChannelId(this.channelId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.deleteChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive delete-channel")
				.argument("channel-id", channelId)
	}

}


fun AWSMediaLiveFunctions.deleteInput(inputId: String, init: AWSMediaLiveDeleteInputCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveDeleteInputCommand(inputId).apply(init))
}

@Generated
class AWSMediaLiveDeleteInputCommand(val inputId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.DeleteInputRequest> {



	override fun build(): com.amazonaws.services.medialive.model.DeleteInputRequest {
		val input = com.amazonaws.services.medialive.model.DeleteInputRequest()
		input.setInputId(this.inputId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.deleteInput(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive delete-input")
				.argument("input-id", inputId)
	}

}


fun AWSMediaLiveFunctions.deleteInputSecurityGroup(inputSecurityGroupId: String, init: AWSMediaLiveDeleteInputSecurityGroupCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveDeleteInputSecurityGroupCommand(inputSecurityGroupId).apply(init))
}

@Generated
class AWSMediaLiveDeleteInputSecurityGroupCommand(val inputSecurityGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest> {



	override fun build(): com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest {
		val input = com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest()
		input.setInputSecurityGroupId(this.inputSecurityGroupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.deleteInputSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive delete-input-security-group")
				.argument("input-security-group-id", inputSecurityGroupId)
	}

}


fun AWSMediaLiveFunctions.describeChannel(channelId: String, init: AWSMediaLiveDescribeChannelCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveDescribeChannelCommand(channelId).apply(init))
}

@Generated
class AWSMediaLiveDescribeChannelCommand(val channelId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.DescribeChannelRequest> {



	override fun build(): com.amazonaws.services.medialive.model.DescribeChannelRequest {
		val input = com.amazonaws.services.medialive.model.DescribeChannelRequest()
		input.setChannelId(this.channelId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.describeChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive describe-channel")
				.argument("channel-id", channelId)
	}

}


fun AWSMediaLiveFunctions.describeInput(inputId: String, init: AWSMediaLiveDescribeInputCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveDescribeInputCommand(inputId).apply(init))
}

@Generated
class AWSMediaLiveDescribeInputCommand(val inputId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.DescribeInputRequest> {



	override fun build(): com.amazonaws.services.medialive.model.DescribeInputRequest {
		val input = com.amazonaws.services.medialive.model.DescribeInputRequest()
		input.setInputId(this.inputId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.describeInput(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive describe-input")
				.argument("input-id", inputId)
	}

}


fun AWSMediaLiveFunctions.describeInputSecurityGroup(inputSecurityGroupId: String, init: AWSMediaLiveDescribeInputSecurityGroupCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveDescribeInputSecurityGroupCommand(inputSecurityGroupId).apply(init))
}

@Generated
class AWSMediaLiveDescribeInputSecurityGroupCommand(val inputSecurityGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest> {



	override fun build(): com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest {
		val input = com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest()
		input.setInputSecurityGroupId(this.inputSecurityGroupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.describeInputSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive describe-input-security-group")
				.argument("input-security-group-id", inputSecurityGroupId)
	}

}


fun AWSMediaLiveFunctions.listChannels(init: AWSMediaLiveListChannelsCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveListChannelsCommand().apply(init))
}

@Generated
class AWSMediaLiveListChannelsCommand() : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.ListChannelsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.medialive.model.ListChannelsRequest {
		val input = com.amazonaws.services.medialive.model.ListChannelsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.listChannels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive list-channels")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMediaLiveFunctions.listInputSecurityGroups(init: AWSMediaLiveListInputSecurityGroupsCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveListInputSecurityGroupsCommand().apply(init))
}

@Generated
class AWSMediaLiveListInputSecurityGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest {
		val input = com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.listInputSecurityGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive list-input-security-groups")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMediaLiveFunctions.listInputs(init: AWSMediaLiveListInputsCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveListInputsCommand().apply(init))
}

@Generated
class AWSMediaLiveListInputsCommand() : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.ListInputsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.medialive.model.ListInputsRequest {
		val input = com.amazonaws.services.medialive.model.ListInputsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.listInputs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive list-inputs")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMediaLiveFunctions.startChannel(channelId: String, init: AWSMediaLiveStartChannelCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveStartChannelCommand(channelId).apply(init))
}

@Generated
class AWSMediaLiveStartChannelCommand(val channelId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.StartChannelRequest> {



	override fun build(): com.amazonaws.services.medialive.model.StartChannelRequest {
		val input = com.amazonaws.services.medialive.model.StartChannelRequest()
		input.setChannelId(this.channelId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.startChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive start-channel")
				.argument("channel-id", channelId)
	}

}


fun AWSMediaLiveFunctions.stopChannel(channelId: String, init: AWSMediaLiveStopChannelCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveStopChannelCommand(channelId).apply(init))
}

@Generated
class AWSMediaLiveStopChannelCommand(val channelId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.StopChannelRequest> {



	override fun build(): com.amazonaws.services.medialive.model.StopChannelRequest {
		val input = com.amazonaws.services.medialive.model.StopChannelRequest()
		input.setChannelId(this.channelId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.stopChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive stop-channel")
				.argument("channel-id", channelId)
	}

}


fun AWSMediaLiveFunctions.updateChannel(channelId: String, init: AWSMediaLiveUpdateChannelCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveUpdateChannelCommand(channelId).apply(init))
}

@Generated
class AWSMediaLiveUpdateChannelCommand(val channelId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.UpdateChannelRequest> {

	var destinations: List<com.amazonaws.services.medialive.model.OutputDestination>? = null
	var encoderSettings: com.amazonaws.services.medialive.model.EncoderSettings? = null
	var inputAttachments: List<com.amazonaws.services.medialive.model.InputAttachment>? = null
	var inputSpecification: com.amazonaws.services.medialive.model.InputSpecification? = null
	var name: String? = null
	var roleArn: String? = null

	override fun build(): com.amazonaws.services.medialive.model.UpdateChannelRequest {
		val input = com.amazonaws.services.medialive.model.UpdateChannelRequest()
		input.setChannelId(this.channelId)
		input.setDestinations(this.destinations)
		input.setEncoderSettings(this.encoderSettings)
		input.setInputAttachments(this.inputAttachments)
		input.setInputSpecification(this.inputSpecification)
		input.setName(this.name)
		input.setRoleArn(this.roleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.updateChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive update-channel")
				.argument("channel-id", channelId)
				.argument("destinations", destinations?.toString())
				.argument("encoder-settings", encoderSettings?.toString())
				.argument("input-attachments", inputAttachments?.toString())
				.argument("input-specification", inputSpecification?.toString())
				.argument("name", name)
				.argument("role-arn", roleArn)
	}

}


fun AWSMediaLiveFunctions.updateInput(inputId: String, init: AWSMediaLiveUpdateInputCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveUpdateInputCommand(inputId).apply(init))
}

@Generated
class AWSMediaLiveUpdateInputCommand(val inputId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.UpdateInputRequest> {

	var destinations: List<com.amazonaws.services.medialive.model.InputDestinationRequest>? = null
	var inputSecurityGroups: List<String>? = null
	var name: String? = null
	var sources: List<com.amazonaws.services.medialive.model.InputSourceRequest>? = null

	override fun build(): com.amazonaws.services.medialive.model.UpdateInputRequest {
		val input = com.amazonaws.services.medialive.model.UpdateInputRequest()
		input.setDestinations(this.destinations)
		input.setInputId(this.inputId)
		input.setInputSecurityGroups(this.inputSecurityGroups)
		input.setName(this.name)
		input.setSources(this.sources)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.updateInput(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive update-input")
				.argument("destinations", destinations?.toString())
				.argument("input-id", inputId)
				.argument("input-security-groups", inputSecurityGroups?.toString())
				.argument("name", name)
				.argument("sources", sources?.toString())
	}

}


fun AWSMediaLiveFunctions.updateInputSecurityGroup(inputSecurityGroupId: String, init: AWSMediaLiveUpdateInputSecurityGroupCommand.() -> Unit) {
	this.block.declare(AWSMediaLiveUpdateInputSecurityGroupCommand(inputSecurityGroupId).apply(init))
}

@Generated
class AWSMediaLiveUpdateInputSecurityGroupCommand(val inputSecurityGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest> {

	var whitelistRules: List<com.amazonaws.services.medialive.model.InputWhitelistRuleCidr>? = null

	override fun build(): com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest {
		val input = com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest()
		input.setInputSecurityGroupId(this.inputSecurityGroupId)
		input.setWhitelistRules(this.whitelistRules)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.medialive.updateInputSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive update-input-security-group")
				.argument("input-security-group-id", inputSecurityGroupId)
				.argument("whitelist-rules", whitelistRules?.toString())
	}

}
