
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.mediapackage

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.mediapackage.*
import com.amazonaws.services.mediapackage.model.*

var com.codingue.koops.core.Environment.mediapackage: AWSMediaPackage
	get() {
		var service = this.capabilities["aws-mediapackage"]
		if (service == null) {
			service = AWSMediaPackageClientBuilder.standard().build()
			this.capabilities["aws-mediapackage"] = service
		}
		return service as AWSMediaPackage
	}
	set(mediapackage) {
		this.capabilities["aws-mediapackage"] = mediapackage
	}

@Generated
class AWSMediaPackageFunctions(val block: Block)

infix fun <T> AwsContinuation.mediapackage(init: AWSMediaPackageFunctions.() -> T): T {
	return AWSMediaPackageFunctions(shell).run(init)
}

			

fun AWSMediaPackageFunctions.createChannel(id: String, init: (AWSMediaPackageCreateChannelCommand.() -> Unit)? = null): com.amazonaws.services.mediapackage.model.CreateChannelResult {
	return this.block.declare(AWSMediaPackageCreateChannelCommand(id).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mediapackage.model.CreateChannelResult
}

@Generated
class AWSMediaPackageCreateChannelCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.CreateChannelRequest, com.amazonaws.services.mediapackage.model.CreateChannelResult> {

	var description: String? = null

	override fun build(): com.amazonaws.services.mediapackage.model.CreateChannelRequest {
		val input = com.amazonaws.services.mediapackage.model.CreateChannelRequest()
		input.setDescription(this.description)
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediapackage.model.CreateChannelResult {
	  return com.amazonaws.services.mediapackage.model.CreateChannelResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mediapackage.model.CreateChannelResult {
		return environment.mediapackage.createChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage create-channel")
				.argument("description", description)
				.argument("id", id)
	}

}


fun AWSMediaPackageFunctions.createOriginEndpoint(channelId: String, id: String, init: (AWSMediaPackageCreateOriginEndpointCommand.() -> Unit)? = null): com.amazonaws.services.mediapackage.model.CreateOriginEndpointResult {
	return this.block.declare(AWSMediaPackageCreateOriginEndpointCommand(channelId, id).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mediapackage.model.CreateOriginEndpointResult
}

@Generated
class AWSMediaPackageCreateOriginEndpointCommand(val channelId: String, val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.CreateOriginEndpointRequest, com.amazonaws.services.mediapackage.model.CreateOriginEndpointResult> {

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

	
	override fun dryResult(): com.amazonaws.services.mediapackage.model.CreateOriginEndpointResult {
	  return com.amazonaws.services.mediapackage.model.CreateOriginEndpointResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mediapackage.model.CreateOriginEndpointResult {
		return environment.mediapackage.createOriginEndpoint(build())
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


fun AWSMediaPackageFunctions.deleteChannel(id: String, init: (AWSMediaPackageDeleteChannelCommand.() -> Unit)? = null): com.amazonaws.services.mediapackage.model.DeleteChannelResult {
	return this.block.declare(AWSMediaPackageDeleteChannelCommand(id).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mediapackage.model.DeleteChannelResult
}

@Generated
class AWSMediaPackageDeleteChannelCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.DeleteChannelRequest, com.amazonaws.services.mediapackage.model.DeleteChannelResult> {



	override fun build(): com.amazonaws.services.mediapackage.model.DeleteChannelRequest {
		val input = com.amazonaws.services.mediapackage.model.DeleteChannelRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediapackage.model.DeleteChannelResult {
	  return com.amazonaws.services.mediapackage.model.DeleteChannelResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mediapackage.model.DeleteChannelResult {
		return environment.mediapackage.deleteChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage delete-channel")
				.argument("id", id)
	}

}


fun AWSMediaPackageFunctions.deleteOriginEndpoint(id: String, init: (AWSMediaPackageDeleteOriginEndpointCommand.() -> Unit)? = null): com.amazonaws.services.mediapackage.model.DeleteOriginEndpointResult {
	return this.block.declare(AWSMediaPackageDeleteOriginEndpointCommand(id).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mediapackage.model.DeleteOriginEndpointResult
}

@Generated
class AWSMediaPackageDeleteOriginEndpointCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest, com.amazonaws.services.mediapackage.model.DeleteOriginEndpointResult> {



	override fun build(): com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest {
		val input = com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediapackage.model.DeleteOriginEndpointResult {
	  return com.amazonaws.services.mediapackage.model.DeleteOriginEndpointResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mediapackage.model.DeleteOriginEndpointResult {
		return environment.mediapackage.deleteOriginEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage delete-origin-endpoint")
				.argument("id", id)
	}

}


fun AWSMediaPackageFunctions.describeChannel(id: String, init: (AWSMediaPackageDescribeChannelCommand.() -> Unit)? = null): com.amazonaws.services.mediapackage.model.DescribeChannelResult {
	return this.block.declare(AWSMediaPackageDescribeChannelCommand(id).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mediapackage.model.DescribeChannelResult
}

@Generated
class AWSMediaPackageDescribeChannelCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.DescribeChannelRequest, com.amazonaws.services.mediapackage.model.DescribeChannelResult> {



	override fun build(): com.amazonaws.services.mediapackage.model.DescribeChannelRequest {
		val input = com.amazonaws.services.mediapackage.model.DescribeChannelRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediapackage.model.DescribeChannelResult {
	  return com.amazonaws.services.mediapackage.model.DescribeChannelResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mediapackage.model.DescribeChannelResult {
		return environment.mediapackage.describeChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage describe-channel")
				.argument("id", id)
	}

}


fun AWSMediaPackageFunctions.describeOriginEndpoint(id: String, init: (AWSMediaPackageDescribeOriginEndpointCommand.() -> Unit)? = null): com.amazonaws.services.mediapackage.model.DescribeOriginEndpointResult {
	return this.block.declare(AWSMediaPackageDescribeOriginEndpointCommand(id).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mediapackage.model.DescribeOriginEndpointResult
}

@Generated
class AWSMediaPackageDescribeOriginEndpointCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest, com.amazonaws.services.mediapackage.model.DescribeOriginEndpointResult> {



	override fun build(): com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest {
		val input = com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediapackage.model.DescribeOriginEndpointResult {
	  return com.amazonaws.services.mediapackage.model.DescribeOriginEndpointResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mediapackage.model.DescribeOriginEndpointResult {
		return environment.mediapackage.describeOriginEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage describe-origin-endpoint")
				.argument("id", id)
	}

}


fun AWSMediaPackageFunctions.listChannels(init: (AWSMediaPackageListChannelsCommand.() -> Unit)? = null): com.amazonaws.services.mediapackage.model.ListChannelsResult {
	return this.block.declare(AWSMediaPackageListChannelsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mediapackage.model.ListChannelsResult
}

@Generated
class AWSMediaPackageListChannelsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.ListChannelsRequest, com.amazonaws.services.mediapackage.model.ListChannelsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mediapackage.model.ListChannelsRequest {
		val input = com.amazonaws.services.mediapackage.model.ListChannelsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediapackage.model.ListChannelsResult {
	  return com.amazonaws.services.mediapackage.model.ListChannelsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mediapackage.model.ListChannelsResult {
		return environment.mediapackage.listChannels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage list-channels")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMediaPackageFunctions.listOriginEndpoints(init: (AWSMediaPackageListOriginEndpointsCommand.() -> Unit)? = null): com.amazonaws.services.mediapackage.model.ListOriginEndpointsResult {
	return this.block.declare(AWSMediaPackageListOriginEndpointsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mediapackage.model.ListOriginEndpointsResult
}

@Generated
class AWSMediaPackageListOriginEndpointsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.ListOriginEndpointsRequest, com.amazonaws.services.mediapackage.model.ListOriginEndpointsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.mediapackage.model.ListOriginEndpointsResult {
	  return com.amazonaws.services.mediapackage.model.ListOriginEndpointsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mediapackage.model.ListOriginEndpointsResult {
		return environment.mediapackage.listOriginEndpoints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage list-origin-endpoints")
				.argument("channel-id", channelId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMediaPackageFunctions.rotateChannelCredentials(id: String, init: (AWSMediaPackageRotateChannelCredentialsCommand.() -> Unit)? = null): com.amazonaws.services.mediapackage.model.RotateChannelCredentialsResult {
	return this.block.declare(AWSMediaPackageRotateChannelCredentialsCommand(id).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mediapackage.model.RotateChannelCredentialsResult
}

@Generated
class AWSMediaPackageRotateChannelCredentialsCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest, com.amazonaws.services.mediapackage.model.RotateChannelCredentialsResult> {



	override fun build(): com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest {
		val input = com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediapackage.model.RotateChannelCredentialsResult {
	  return com.amazonaws.services.mediapackage.model.RotateChannelCredentialsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mediapackage.model.RotateChannelCredentialsResult {
		return environment.mediapackage.rotateChannelCredentials(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage rotate-channel-credentials")
				.argument("id", id)
	}

}


fun AWSMediaPackageFunctions.updateChannel(id: String, init: (AWSMediaPackageUpdateChannelCommand.() -> Unit)? = null): com.amazonaws.services.mediapackage.model.UpdateChannelResult {
	return this.block.declare(AWSMediaPackageUpdateChannelCommand(id).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mediapackage.model.UpdateChannelResult
}

@Generated
class AWSMediaPackageUpdateChannelCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.UpdateChannelRequest, com.amazonaws.services.mediapackage.model.UpdateChannelResult> {

	var description: String? = null

	override fun build(): com.amazonaws.services.mediapackage.model.UpdateChannelRequest {
		val input = com.amazonaws.services.mediapackage.model.UpdateChannelRequest()
		input.setDescription(this.description)
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediapackage.model.UpdateChannelResult {
	  return com.amazonaws.services.mediapackage.model.UpdateChannelResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mediapackage.model.UpdateChannelResult {
		return environment.mediapackage.updateChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediapackage update-channel")
				.argument("description", description)
				.argument("id", id)
	}

}


fun AWSMediaPackageFunctions.updateOriginEndpoint(id: String, init: (AWSMediaPackageUpdateOriginEndpointCommand.() -> Unit)? = null): com.amazonaws.services.mediapackage.model.UpdateOriginEndpointResult {
	return this.block.declare(AWSMediaPackageUpdateOriginEndpointCommand(id).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.mediapackage.model.UpdateOriginEndpointResult
}

@Generated
class AWSMediaPackageUpdateOriginEndpointCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.mediapackage.model.UpdateOriginEndpointRequest, com.amazonaws.services.mediapackage.model.UpdateOriginEndpointResult> {

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

	
	override fun dryResult(): com.amazonaws.services.mediapackage.model.UpdateOriginEndpointResult {
	  return com.amazonaws.services.mediapackage.model.UpdateOriginEndpointResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.mediapackage.model.UpdateOriginEndpointResult {
		return environment.mediapackage.updateOriginEndpoint(build())
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
