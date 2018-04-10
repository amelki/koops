
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.mediapackage.AWSMediaPackage
import com.amazonaws.services.mediapackage.model.*

var codingue.koops.core.Environment.mediapackage: AWSMediaPackage
	get() = this.capabilities[AWSMediaPackage::class.java.name] as AWSMediaPackage
	set(mediapackage) {
		this.capabilities[AWSMediaPackage::class.java.name] = mediapackage
	}

@Generated
class AWSMediaPackageFunctions(val block: Block)

infix fun AwsContinuation.mediapackage(init: AWSMediaPackageFunctions.() -> Unit) {
	AWSMediaPackageFunctions(shell).apply(init)
}

			

fun AWSMediaPackageFunctions.createChannel(id: String, init: AWSMediaPackageCreateChannelCommand.() -> Unit) {
	this.block.declare(AWSMediaPackageCreateChannelCommand(id).apply(init))
}

@Generated
class AWSMediaPackageCreateChannelCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.CreateChannelRequest> {

	var description: String? = null

	override fun build(): com.amazonaws.services.mediapackage.model.CreateChannelRequest {
		val input = com.amazonaws.services.mediapackage.model.CreateChannelRequest()
		input.setDescription(this.description)
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediapackage.createChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage create-channel")
				.argument("description", description)
				.argument("id", id)
	}

}


fun AWSMediaPackageFunctions.createOriginEndpoint(channelId: String, id: String, init: AWSMediaPackageCreateOriginEndpointCommand.() -> Unit) {
	this.block.declare(AWSMediaPackageCreateOriginEndpointCommand(channelId, id).apply(init))
}

@Generated
class AWSMediaPackageCreateOriginEndpointCommand(val channelId: String, val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.CreateOriginEndpointRequest> {

	var dashPackage: com.amazonaws.services.mediapackage.model.DashPackage? = null
	var description: String? = null
	var hlsPackage: com.amazonaws.services.mediapackage.model.HlsPackage? = null
	var manifestName: String? = null
	var mssPackage: com.amazonaws.services.mediapackage.model.MssPackage? = null
	var startoverWindowSeconds: Int? = 0
	var timeDelaySeconds: Int? = 0
	var whitelist: List<String>? = null

	override fun build(): com.amazonaws.services.mediapackage.model.CreateOriginEndpointRequest {
		val input = com.amazonaws.services.mediapackage.model.CreateOriginEndpointRequest()
		input.setChannelId(this.channelId)
		input.setDashPackage(this.dashPackage)
		input.setDescription(this.description)
		input.setHlsPackage(this.hlsPackage)
		input.setId(this.id)
		input.setManifestName(this.manifestName)
		input.setMssPackage(this.mssPackage)
		input.setStartoverWindowSeconds(this.startoverWindowSeconds)
		input.setTimeDelaySeconds(this.timeDelaySeconds)
		input.setWhitelist(this.whitelist)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediapackage.createOriginEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage create-origin-endpoint")
				.argument("channel-id", channelId)
				.argument("dash-package", dashPackage?.toString())
				.argument("description", description)
				.argument("hls-package", hlsPackage?.toString())
				.argument("id", id)
				.argument("manifest-name", manifestName)
				.argument("mss-package", mssPackage?.toString())
				.argument("startover-window-seconds", startoverWindowSeconds?.toString())
				.argument("time-delay-seconds", timeDelaySeconds?.toString())
				.argument("whitelist", whitelist?.toString())
	}

}


fun AWSMediaPackageFunctions.deleteChannel(id: String, init: AWSMediaPackageDeleteChannelCommand.() -> Unit) {
	this.block.declare(AWSMediaPackageDeleteChannelCommand(id).apply(init))
}

@Generated
class AWSMediaPackageDeleteChannelCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.DeleteChannelRequest> {



	override fun build(): com.amazonaws.services.mediapackage.model.DeleteChannelRequest {
		val input = com.amazonaws.services.mediapackage.model.DeleteChannelRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediapackage.deleteChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage delete-channel")
				.argument("id", id)
	}

}


fun AWSMediaPackageFunctions.deleteOriginEndpoint(id: String, init: AWSMediaPackageDeleteOriginEndpointCommand.() -> Unit) {
	this.block.declare(AWSMediaPackageDeleteOriginEndpointCommand(id).apply(init))
}

@Generated
class AWSMediaPackageDeleteOriginEndpointCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest> {



	override fun build(): com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest {
		val input = com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediapackage.deleteOriginEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage delete-origin-endpoint")
				.argument("id", id)
	}

}


fun AWSMediaPackageFunctions.describeChannel(id: String, init: AWSMediaPackageDescribeChannelCommand.() -> Unit) {
	this.block.declare(AWSMediaPackageDescribeChannelCommand(id).apply(init))
}

@Generated
class AWSMediaPackageDescribeChannelCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.DescribeChannelRequest> {



	override fun build(): com.amazonaws.services.mediapackage.model.DescribeChannelRequest {
		val input = com.amazonaws.services.mediapackage.model.DescribeChannelRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediapackage.describeChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage describe-channel")
				.argument("id", id)
	}

}


fun AWSMediaPackageFunctions.describeOriginEndpoint(id: String, init: AWSMediaPackageDescribeOriginEndpointCommand.() -> Unit) {
	this.block.declare(AWSMediaPackageDescribeOriginEndpointCommand(id).apply(init))
}

@Generated
class AWSMediaPackageDescribeOriginEndpointCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest> {



	override fun build(): com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest {
		val input = com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediapackage.describeOriginEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage describe-origin-endpoint")
				.argument("id", id)
	}

}


fun AWSMediaPackageFunctions.listChannels(init: AWSMediaPackageListChannelsCommand.() -> Unit) {
	this.block.declare(AWSMediaPackageListChannelsCommand().apply(init))
}

@Generated
class AWSMediaPackageListChannelsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.ListChannelsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mediapackage.model.ListChannelsRequest {
		val input = com.amazonaws.services.mediapackage.model.ListChannelsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediapackage.listChannels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage list-channels")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMediaPackageFunctions.listOriginEndpoints(init: AWSMediaPackageListOriginEndpointsCommand.() -> Unit) {
	this.block.declare(AWSMediaPackageListOriginEndpointsCommand().apply(init))
}

@Generated
class AWSMediaPackageListOriginEndpointsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.ListOriginEndpointsRequest> {

	var channelId: String? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mediapackage.model.ListOriginEndpointsRequest {
		val input = com.amazonaws.services.mediapackage.model.ListOriginEndpointsRequest()
		input.setChannelId(this.channelId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediapackage.listOriginEndpoints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage list-origin-endpoints")
				.argument("channel-id", channelId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMediaPackageFunctions.rotateChannelCredentials(id: String, init: AWSMediaPackageRotateChannelCredentialsCommand.() -> Unit) {
	this.block.declare(AWSMediaPackageRotateChannelCredentialsCommand(id).apply(init))
}

@Generated
class AWSMediaPackageRotateChannelCredentialsCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest> {



	override fun build(): com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest {
		val input = com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediapackage.rotateChannelCredentials(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage rotate-channel-credentials")
				.argument("id", id)
	}

}


fun AWSMediaPackageFunctions.updateChannel(id: String, init: AWSMediaPackageUpdateChannelCommand.() -> Unit) {
	this.block.declare(AWSMediaPackageUpdateChannelCommand(id).apply(init))
}

@Generated
class AWSMediaPackageUpdateChannelCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.UpdateChannelRequest> {

	var description: String? = null

	override fun build(): com.amazonaws.services.mediapackage.model.UpdateChannelRequest {
		val input = com.amazonaws.services.mediapackage.model.UpdateChannelRequest()
		input.setDescription(this.description)
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediapackage.updateChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage update-channel")
				.argument("description", description)
				.argument("id", id)
	}

}


fun AWSMediaPackageFunctions.updateOriginEndpoint(id: String, init: AWSMediaPackageUpdateOriginEndpointCommand.() -> Unit) {
	this.block.declare(AWSMediaPackageUpdateOriginEndpointCommand(id).apply(init))
}

@Generated
class AWSMediaPackageUpdateOriginEndpointCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.UpdateOriginEndpointRequest> {

	var dashPackage: com.amazonaws.services.mediapackage.model.DashPackage? = null
	var description: String? = null
	var hlsPackage: com.amazonaws.services.mediapackage.model.HlsPackage? = null
	var manifestName: String? = null
	var mssPackage: com.amazonaws.services.mediapackage.model.MssPackage? = null
	var startoverWindowSeconds: Int? = 0
	var timeDelaySeconds: Int? = 0
	var whitelist: List<String>? = null

	override fun build(): com.amazonaws.services.mediapackage.model.UpdateOriginEndpointRequest {
		val input = com.amazonaws.services.mediapackage.model.UpdateOriginEndpointRequest()
		input.setDashPackage(this.dashPackage)
		input.setDescription(this.description)
		input.setHlsPackage(this.hlsPackage)
		input.setId(this.id)
		input.setManifestName(this.manifestName)
		input.setMssPackage(this.mssPackage)
		input.setStartoverWindowSeconds(this.startoverWindowSeconds)
		input.setTimeDelaySeconds(this.timeDelaySeconds)
		input.setWhitelist(this.whitelist)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediapackage.updateOriginEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage update-origin-endpoint")
				.argument("dash-package", dashPackage?.toString())
				.argument("description", description)
				.argument("hls-package", hlsPackage?.toString())
				.argument("id", id)
				.argument("manifest-name", manifestName)
				.argument("mss-package", mssPackage?.toString())
				.argument("startover-window-seconds", startoverWindowSeconds?.toString())
				.argument("time-delay-seconds", timeDelaySeconds?.toString())
				.argument("whitelist", whitelist?.toString())
	}

}
