
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
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

infix fun <T> AwsContinuation.medialive(init: AWSMediaLiveFunctions.() -> T): T {
	return AWSMediaLiveFunctions(shell).run(init)
}

			

fun AWSMediaLiveFunctions.createChannel(init: AWSMediaLiveCreateChannelCommand.() -> Unit): com.amazonaws.services.medialive.model.CreateChannelResult {
	return this.block.declare(AWSMediaLiveCreateChannelCommand().apply(init)) as com.amazonaws.services.medialive.model.CreateChannelResult
}

@Generated
class AWSMediaLiveCreateChannelCommand() : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.CreateChannelRequest, com.amazonaws.services.medialive.model.CreateChannelResult> {

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

	
	override fun dryResult(): com.amazonaws.services.medialive.model.CreateChannelResult {
	  return com.amazonaws.services.medialive.model.CreateChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.CreateChannelResult {
		return environment.medialive.createChannel(build())
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


fun AWSMediaLiveFunctions.createInput(init: AWSMediaLiveCreateInputCommand.() -> Unit): com.amazonaws.services.medialive.model.CreateInputResult {
	return this.block.declare(AWSMediaLiveCreateInputCommand().apply(init)) as com.amazonaws.services.medialive.model.CreateInputResult
}

@Generated
class AWSMediaLiveCreateInputCommand() : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.CreateInputRequest, com.amazonaws.services.medialive.model.CreateInputResult> {

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

	
	override fun dryResult(): com.amazonaws.services.medialive.model.CreateInputResult {
	  return com.amazonaws.services.medialive.model.CreateInputResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.CreateInputResult {
		return environment.medialive.createInput(build())
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


fun AWSMediaLiveFunctions.createInputSecurityGroup(init: AWSMediaLiveCreateInputSecurityGroupCommand.() -> Unit): com.amazonaws.services.medialive.model.CreateInputSecurityGroupResult {
	return this.block.declare(AWSMediaLiveCreateInputSecurityGroupCommand().apply(init)) as com.amazonaws.services.medialive.model.CreateInputSecurityGroupResult
}

@Generated
class AWSMediaLiveCreateInputSecurityGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest, com.amazonaws.services.medialive.model.CreateInputSecurityGroupResult> {

	var whitelistRules: List<com.amazonaws.services.medialive.model.InputWhitelistRuleCidr>? = null

	override fun build(): com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest {
		val input = com.amazonaws.services.medialive.model.CreateInputSecurityGroupRequest()
		input.setWhitelistRules(this.whitelistRules)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.medialive.model.CreateInputSecurityGroupResult {
	  return com.amazonaws.services.medialive.model.CreateInputSecurityGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.CreateInputSecurityGroupResult {
		return environment.medialive.createInputSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive create-input-security-group")
				.argument("whitelist-rules", whitelistRules?.toString())
	}

}


fun AWSMediaLiveFunctions.deleteChannel(channelId: String, init: AWSMediaLiveDeleteChannelCommand.() -> Unit): com.amazonaws.services.medialive.model.DeleteChannelResult {
	return this.block.declare(AWSMediaLiveDeleteChannelCommand(channelId).apply(init)) as com.amazonaws.services.medialive.model.DeleteChannelResult
}

@Generated
class AWSMediaLiveDeleteChannelCommand(val channelId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.DeleteChannelRequest, com.amazonaws.services.medialive.model.DeleteChannelResult> {



	override fun build(): com.amazonaws.services.medialive.model.DeleteChannelRequest {
		val input = com.amazonaws.services.medialive.model.DeleteChannelRequest()
		input.setChannelId(this.channelId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.medialive.model.DeleteChannelResult {
	  return com.amazonaws.services.medialive.model.DeleteChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.DeleteChannelResult {
		return environment.medialive.deleteChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive delete-channel")
				.argument("channel-id", channelId)
	}

}


fun AWSMediaLiveFunctions.deleteInput(inputId: String, init: AWSMediaLiveDeleteInputCommand.() -> Unit): com.amazonaws.services.medialive.model.DeleteInputResult {
	return this.block.declare(AWSMediaLiveDeleteInputCommand(inputId).apply(init)) as com.amazonaws.services.medialive.model.DeleteInputResult
}

@Generated
class AWSMediaLiveDeleteInputCommand(val inputId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.DeleteInputRequest, com.amazonaws.services.medialive.model.DeleteInputResult> {



	override fun build(): com.amazonaws.services.medialive.model.DeleteInputRequest {
		val input = com.amazonaws.services.medialive.model.DeleteInputRequest()
		input.setInputId(this.inputId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.medialive.model.DeleteInputResult {
	  return com.amazonaws.services.medialive.model.DeleteInputResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.DeleteInputResult {
		return environment.medialive.deleteInput(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive delete-input")
				.argument("input-id", inputId)
	}

}


fun AWSMediaLiveFunctions.deleteInputSecurityGroup(inputSecurityGroupId: String, init: AWSMediaLiveDeleteInputSecurityGroupCommand.() -> Unit): com.amazonaws.services.medialive.model.DeleteInputSecurityGroupResult {
	return this.block.declare(AWSMediaLiveDeleteInputSecurityGroupCommand(inputSecurityGroupId).apply(init)) as com.amazonaws.services.medialive.model.DeleteInputSecurityGroupResult
}

@Generated
class AWSMediaLiveDeleteInputSecurityGroupCommand(val inputSecurityGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest, com.amazonaws.services.medialive.model.DeleteInputSecurityGroupResult> {



	override fun build(): com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest {
		val input = com.amazonaws.services.medialive.model.DeleteInputSecurityGroupRequest()
		input.setInputSecurityGroupId(this.inputSecurityGroupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.medialive.model.DeleteInputSecurityGroupResult {
	  return com.amazonaws.services.medialive.model.DeleteInputSecurityGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.DeleteInputSecurityGroupResult {
		return environment.medialive.deleteInputSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive delete-input-security-group")
				.argument("input-security-group-id", inputSecurityGroupId)
	}

}


fun AWSMediaLiveFunctions.describeChannel(channelId: String, init: AWSMediaLiveDescribeChannelCommand.() -> Unit): com.amazonaws.services.medialive.model.DescribeChannelResult {
	return this.block.declare(AWSMediaLiveDescribeChannelCommand(channelId).apply(init)) as com.amazonaws.services.medialive.model.DescribeChannelResult
}

@Generated
class AWSMediaLiveDescribeChannelCommand(val channelId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.DescribeChannelRequest, com.amazonaws.services.medialive.model.DescribeChannelResult> {



	override fun build(): com.amazonaws.services.medialive.model.DescribeChannelRequest {
		val input = com.amazonaws.services.medialive.model.DescribeChannelRequest()
		input.setChannelId(this.channelId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.medialive.model.DescribeChannelResult {
	  return com.amazonaws.services.medialive.model.DescribeChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.DescribeChannelResult {
		return environment.medialive.describeChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive describe-channel")
				.argument("channel-id", channelId)
	}

}


fun AWSMediaLiveFunctions.describeInput(inputId: String, init: AWSMediaLiveDescribeInputCommand.() -> Unit): com.amazonaws.services.medialive.model.DescribeInputResult {
	return this.block.declare(AWSMediaLiveDescribeInputCommand(inputId).apply(init)) as com.amazonaws.services.medialive.model.DescribeInputResult
}

@Generated
class AWSMediaLiveDescribeInputCommand(val inputId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.DescribeInputRequest, com.amazonaws.services.medialive.model.DescribeInputResult> {



	override fun build(): com.amazonaws.services.medialive.model.DescribeInputRequest {
		val input = com.amazonaws.services.medialive.model.DescribeInputRequest()
		input.setInputId(this.inputId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.medialive.model.DescribeInputResult {
	  return com.amazonaws.services.medialive.model.DescribeInputResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.DescribeInputResult {
		return environment.medialive.describeInput(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive describe-input")
				.argument("input-id", inputId)
	}

}


fun AWSMediaLiveFunctions.describeInputSecurityGroup(inputSecurityGroupId: String, init: AWSMediaLiveDescribeInputSecurityGroupCommand.() -> Unit): com.amazonaws.services.medialive.model.DescribeInputSecurityGroupResult {
	return this.block.declare(AWSMediaLiveDescribeInputSecurityGroupCommand(inputSecurityGroupId).apply(init)) as com.amazonaws.services.medialive.model.DescribeInputSecurityGroupResult
}

@Generated
class AWSMediaLiveDescribeInputSecurityGroupCommand(val inputSecurityGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest, com.amazonaws.services.medialive.model.DescribeInputSecurityGroupResult> {



	override fun build(): com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest {
		val input = com.amazonaws.services.medialive.model.DescribeInputSecurityGroupRequest()
		input.setInputSecurityGroupId(this.inputSecurityGroupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.medialive.model.DescribeInputSecurityGroupResult {
	  return com.amazonaws.services.medialive.model.DescribeInputSecurityGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.DescribeInputSecurityGroupResult {
		return environment.medialive.describeInputSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive describe-input-security-group")
				.argument("input-security-group-id", inputSecurityGroupId)
	}

}


fun AWSMediaLiveFunctions.listChannels(init: AWSMediaLiveListChannelsCommand.() -> Unit): com.amazonaws.services.medialive.model.ListChannelsResult {
	return this.block.declare(AWSMediaLiveListChannelsCommand().apply(init)) as com.amazonaws.services.medialive.model.ListChannelsResult
}

@Generated
class AWSMediaLiveListChannelsCommand() : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.ListChannelsRequest, com.amazonaws.services.medialive.model.ListChannelsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.medialive.model.ListChannelsRequest {
		val input = com.amazonaws.services.medialive.model.ListChannelsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.medialive.model.ListChannelsResult {
	  return com.amazonaws.services.medialive.model.ListChannelsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.ListChannelsResult {
		return environment.medialive.listChannels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive list-channels")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMediaLiveFunctions.listInputSecurityGroups(init: AWSMediaLiveListInputSecurityGroupsCommand.() -> Unit): com.amazonaws.services.medialive.model.ListInputSecurityGroupsResult {
	return this.block.declare(AWSMediaLiveListInputSecurityGroupsCommand().apply(init)) as com.amazonaws.services.medialive.model.ListInputSecurityGroupsResult
}

@Generated
class AWSMediaLiveListInputSecurityGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest, com.amazonaws.services.medialive.model.ListInputSecurityGroupsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest {
		val input = com.amazonaws.services.medialive.model.ListInputSecurityGroupsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.medialive.model.ListInputSecurityGroupsResult {
	  return com.amazonaws.services.medialive.model.ListInputSecurityGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.ListInputSecurityGroupsResult {
		return environment.medialive.listInputSecurityGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive list-input-security-groups")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMediaLiveFunctions.listInputs(init: AWSMediaLiveListInputsCommand.() -> Unit): com.amazonaws.services.medialive.model.ListInputsResult {
	return this.block.declare(AWSMediaLiveListInputsCommand().apply(init)) as com.amazonaws.services.medialive.model.ListInputsResult
}

@Generated
class AWSMediaLiveListInputsCommand() : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.ListInputsRequest, com.amazonaws.services.medialive.model.ListInputsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.medialive.model.ListInputsRequest {
		val input = com.amazonaws.services.medialive.model.ListInputsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.medialive.model.ListInputsResult {
	  return com.amazonaws.services.medialive.model.ListInputsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.ListInputsResult {
		return environment.medialive.listInputs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive list-inputs")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMediaLiveFunctions.startChannel(channelId: String, init: AWSMediaLiveStartChannelCommand.() -> Unit): com.amazonaws.services.medialive.model.StartChannelResult {
	return this.block.declare(AWSMediaLiveStartChannelCommand(channelId).apply(init)) as com.amazonaws.services.medialive.model.StartChannelResult
}

@Generated
class AWSMediaLiveStartChannelCommand(val channelId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.StartChannelRequest, com.amazonaws.services.medialive.model.StartChannelResult> {



	override fun build(): com.amazonaws.services.medialive.model.StartChannelRequest {
		val input = com.amazonaws.services.medialive.model.StartChannelRequest()
		input.setChannelId(this.channelId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.medialive.model.StartChannelResult {
	  return com.amazonaws.services.medialive.model.StartChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.StartChannelResult {
		return environment.medialive.startChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive start-channel")
				.argument("channel-id", channelId)
	}

}


fun AWSMediaLiveFunctions.stopChannel(channelId: String, init: AWSMediaLiveStopChannelCommand.() -> Unit): com.amazonaws.services.medialive.model.StopChannelResult {
	return this.block.declare(AWSMediaLiveStopChannelCommand(channelId).apply(init)) as com.amazonaws.services.medialive.model.StopChannelResult
}

@Generated
class AWSMediaLiveStopChannelCommand(val channelId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.StopChannelRequest, com.amazonaws.services.medialive.model.StopChannelResult> {



	override fun build(): com.amazonaws.services.medialive.model.StopChannelRequest {
		val input = com.amazonaws.services.medialive.model.StopChannelRequest()
		input.setChannelId(this.channelId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.medialive.model.StopChannelResult {
	  return com.amazonaws.services.medialive.model.StopChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.StopChannelResult {
		return environment.medialive.stopChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive stop-channel")
				.argument("channel-id", channelId)
	}

}


fun AWSMediaLiveFunctions.updateChannel(channelId: String, init: AWSMediaLiveUpdateChannelCommand.() -> Unit): com.amazonaws.services.medialive.model.UpdateChannelResult {
	return this.block.declare(AWSMediaLiveUpdateChannelCommand(channelId).apply(init)) as com.amazonaws.services.medialive.model.UpdateChannelResult
}

@Generated
class AWSMediaLiveUpdateChannelCommand(val channelId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.UpdateChannelRequest, com.amazonaws.services.medialive.model.UpdateChannelResult> {

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

	
	override fun dryResult(): com.amazonaws.services.medialive.model.UpdateChannelResult {
	  return com.amazonaws.services.medialive.model.UpdateChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.UpdateChannelResult {
		return environment.medialive.updateChannel(build())
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


fun AWSMediaLiveFunctions.updateInput(inputId: String, init: AWSMediaLiveUpdateInputCommand.() -> Unit): com.amazonaws.services.medialive.model.UpdateInputResult {
	return this.block.declare(AWSMediaLiveUpdateInputCommand(inputId).apply(init)) as com.amazonaws.services.medialive.model.UpdateInputResult
}

@Generated
class AWSMediaLiveUpdateInputCommand(val inputId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.UpdateInputRequest, com.amazonaws.services.medialive.model.UpdateInputResult> {

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

	
	override fun dryResult(): com.amazonaws.services.medialive.model.UpdateInputResult {
	  return com.amazonaws.services.medialive.model.UpdateInputResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.UpdateInputResult {
		return environment.medialive.updateInput(build())
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


fun AWSMediaLiveFunctions.updateInputSecurityGroup(inputSecurityGroupId: String, init: AWSMediaLiveUpdateInputSecurityGroupCommand.() -> Unit): com.amazonaws.services.medialive.model.UpdateInputSecurityGroupResult {
	return this.block.declare(AWSMediaLiveUpdateInputSecurityGroupCommand(inputSecurityGroupId).apply(init)) as com.amazonaws.services.medialive.model.UpdateInputSecurityGroupResult
}

@Generated
class AWSMediaLiveUpdateInputSecurityGroupCommand(val inputSecurityGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest, com.amazonaws.services.medialive.model.UpdateInputSecurityGroupResult> {

	var whitelistRules: List<com.amazonaws.services.medialive.model.InputWhitelistRuleCidr>? = null

	override fun build(): com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest {
		val input = com.amazonaws.services.medialive.model.UpdateInputSecurityGroupRequest()
		input.setInputSecurityGroupId(this.inputSecurityGroupId)
		input.setWhitelistRules(this.whitelistRules)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.medialive.model.UpdateInputSecurityGroupResult {
	  return com.amazonaws.services.medialive.model.UpdateInputSecurityGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.medialive.model.UpdateInputSecurityGroupResult {
		return environment.medialive.updateInputSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws medialive update-input-security-group")
				.argument("input-security-group-id", inputSecurityGroupId)
				.argument("whitelist-rules", whitelistRules?.toString())
	}

}
