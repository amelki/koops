
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.appstream

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.appstream.*
import com.amazonaws.services.appstream.model.*

var com.codingue.koops.core.Environment.appstream: AmazonAppStream
	get() {
		var service = this.capabilities["aws-appstream"]
		if (service == null) {
			service = AmazonAppStreamClientBuilder.standard().build()
			this.capabilities["aws-appstream"] = service
		}
		return service as AmazonAppStream
	}
	set(appstream) {
		this.capabilities["aws-appstream"] = appstream
	}

@Generated
class AmazonAppStreamFunctions(val block: Script)

infix fun <T> AwsContinuation.appstream(init: AmazonAppStreamFunctions.() -> T): T {
	return AmazonAppStreamFunctions(shell).run(init)
}

			

fun AmazonAppStreamFunctions.associateFleet(fleetName: String, stackName: String, init: (AmazonAppStreamAssociateFleetCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.AssociateFleetResult {
	return this.block.declare(AmazonAppStreamAssociateFleetCommand(fleetName, stackName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.AssociateFleetResult
}

@Generated
class AmazonAppStreamAssociateFleetCommand(val fleetName: String, val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.AssociateFleetRequest, com.amazonaws.services.appstream.model.AssociateFleetResult> {



	override fun build(): com.amazonaws.services.appstream.model.AssociateFleetRequest {
		val input = com.amazonaws.services.appstream.model.AssociateFleetRequest()
		input.setFleetName(this.fleetName)
		input.setStackName(this.stackName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.AssociateFleetResult {
	  return com.amazonaws.services.appstream.model.AssociateFleetResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.AssociateFleetResult {
		return environment.appstream.associateFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream associate-fleet")
				.argument("fleet-name", fleetName)
				.argument("stack-name", stackName)
	}

}


fun AmazonAppStreamFunctions.copyImage(sourceImageName: String, destinationImageName: String, destinationRegion: String, init: (AmazonAppStreamCopyImageCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.CopyImageResult {
	return this.block.declare(AmazonAppStreamCopyImageCommand(sourceImageName, destinationImageName, destinationRegion).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.CopyImageResult
}

@Generated
class AmazonAppStreamCopyImageCommand(val sourceImageName: String, val destinationImageName: String, val destinationRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.CopyImageRequest, com.amazonaws.services.appstream.model.CopyImageResult> {

	var destinationImageDescription: String? = null

	override fun build(): com.amazonaws.services.appstream.model.CopyImageRequest {
		val input = com.amazonaws.services.appstream.model.CopyImageRequest()
		input.setSourceImageName(this.sourceImageName)
		input.setDestinationImageName(this.destinationImageName)
		input.setDestinationRegion(this.destinationRegion)
		input.setDestinationImageDescription(this.destinationImageDescription)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.CopyImageResult {
	  return com.amazonaws.services.appstream.model.CopyImageResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.CopyImageResult {
		return environment.appstream.copyImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream copy-image")
				.argument("source-image-name", sourceImageName)
				.argument("destination-image-name", destinationImageName)
				.argument("destination-region", destinationRegion)
				.argument("destination-image-description", destinationImageDescription)
	}

}


fun AmazonAppStreamFunctions.createDirectoryConfig(directoryName: String, organizationalUnitDistinguishedNames: List<String>, serviceAccountCredentials: com.amazonaws.services.appstream.model.ServiceAccountCredentials, init: (AmazonAppStreamCreateDirectoryConfigCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.CreateDirectoryConfigResult {
	return this.block.declare(AmazonAppStreamCreateDirectoryConfigCommand(directoryName, organizationalUnitDistinguishedNames, serviceAccountCredentials).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.CreateDirectoryConfigResult
}

@Generated
class AmazonAppStreamCreateDirectoryConfigCommand(val directoryName: String, val organizationalUnitDistinguishedNames: List<String>, val serviceAccountCredentials: com.amazonaws.services.appstream.model.ServiceAccountCredentials) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest, com.amazonaws.services.appstream.model.CreateDirectoryConfigResult> {



	override fun build(): com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest {
		val input = com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest()
		input.setDirectoryName(this.directoryName)
		input.setOrganizationalUnitDistinguishedNames(this.organizationalUnitDistinguishedNames)
		input.setServiceAccountCredentials(this.serviceAccountCredentials)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.CreateDirectoryConfigResult {
	  return com.amazonaws.services.appstream.model.CreateDirectoryConfigResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.CreateDirectoryConfigResult {
		return environment.appstream.createDirectoryConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream create-directory-config")
				.argument("directory-name", directoryName)
				.argument("organizational-unit-distinguished-names", organizationalUnitDistinguishedNames.toString())
				.argument("service-account-credentials", serviceAccountCredentials.toString())
	}

}


fun AmazonAppStreamFunctions.createFleet(name: String, imageName: String, instanceType: String, computeCapacity: com.amazonaws.services.appstream.model.ComputeCapacity, init: (AmazonAppStreamCreateFleetCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.CreateFleetResult {
	return this.block.declare(AmazonAppStreamCreateFleetCommand(name, imageName, instanceType, computeCapacity).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.CreateFleetResult
}

@Generated
class AmazonAppStreamCreateFleetCommand(val name: String, val imageName: String, val instanceType: String, val computeCapacity: com.amazonaws.services.appstream.model.ComputeCapacity) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.CreateFleetRequest, com.amazonaws.services.appstream.model.CreateFleetResult> {

	var fleetType: FleetType? = null
	var vpcConfig: com.amazonaws.services.appstream.model.VpcConfig? = null
	var maxUserDurationInSeconds: Int? = 0
	var disconnectTimeoutInSeconds: Int? = 0
	var description: String? = null
	var displayName: String? = null
	var enableDefaultInternetAccess: Boolean? = false
	var domainJoinInfo: com.amazonaws.services.appstream.model.DomainJoinInfo? = null

	override fun build(): com.amazonaws.services.appstream.model.CreateFleetRequest {
		val input = com.amazonaws.services.appstream.model.CreateFleetRequest()
		input.setName(this.name)
		input.setImageName(this.imageName)
		input.setInstanceType(this.instanceType)
		input.setFleetType(this.fleetType?.toString())
		input.setComputeCapacity(this.computeCapacity)
		input.setVpcConfig(this.vpcConfig)
		input.setMaxUserDurationInSeconds(this.maxUserDurationInSeconds)
		input.setDisconnectTimeoutInSeconds(this.disconnectTimeoutInSeconds)
		input.setDescription(this.description)
		input.setDisplayName(this.displayName)
		input.setEnableDefaultInternetAccess(this.enableDefaultInternetAccess)
		input.setDomainJoinInfo(this.domainJoinInfo)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.CreateFleetResult {
	  return com.amazonaws.services.appstream.model.CreateFleetResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.CreateFleetResult {
		return environment.appstream.createFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream create-fleet")
				.argument("name", name)
				.argument("image-name", imageName)
				.argument("instance-type", instanceType)
				.argument("fleet-type", fleetType?.toString())
				.argument("compute-capacity", computeCapacity.toString())
				.argument("vpc-config", vpcConfig?.toString())
				.argument("max-user-duration-in-seconds", maxUserDurationInSeconds?.toString())
				.argument("disconnect-timeout-in-seconds", disconnectTimeoutInSeconds?.toString())
				.argument("description", description)
				.argument("display-name", displayName)
				.option("enable-default-internet-access", enableDefaultInternetAccess ?: false)
				.argument("domain-join-info", domainJoinInfo?.toString())
	}

}


fun AmazonAppStreamFunctions.createImageBuilder(name: String, imageName: String, instanceType: String, init: (AmazonAppStreamCreateImageBuilderCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.CreateImageBuilderResult {
	return this.block.declare(AmazonAppStreamCreateImageBuilderCommand(name, imageName, instanceType).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.CreateImageBuilderResult
}

@Generated
class AmazonAppStreamCreateImageBuilderCommand(val name: String, val imageName: String, val instanceType: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.CreateImageBuilderRequest, com.amazonaws.services.appstream.model.CreateImageBuilderResult> {

	var description: String? = null
	var displayName: String? = null
	var vpcConfig: com.amazonaws.services.appstream.model.VpcConfig? = null
	var enableDefaultInternetAccess: Boolean? = false
	var domainJoinInfo: com.amazonaws.services.appstream.model.DomainJoinInfo? = null
	var appstreamAgentVersion: String? = null

	override fun build(): com.amazonaws.services.appstream.model.CreateImageBuilderRequest {
		val input = com.amazonaws.services.appstream.model.CreateImageBuilderRequest()
		input.setName(this.name)
		input.setImageName(this.imageName)
		input.setInstanceType(this.instanceType)
		input.setDescription(this.description)
		input.setDisplayName(this.displayName)
		input.setVpcConfig(this.vpcConfig)
		input.setEnableDefaultInternetAccess(this.enableDefaultInternetAccess)
		input.setDomainJoinInfo(this.domainJoinInfo)
		input.setAppstreamAgentVersion(this.appstreamAgentVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.CreateImageBuilderResult {
	  return com.amazonaws.services.appstream.model.CreateImageBuilderResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.CreateImageBuilderResult {
		return environment.appstream.createImageBuilder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream create-image-builder")
				.argument("name", name)
				.argument("image-name", imageName)
				.argument("instance-type", instanceType)
				.argument("description", description)
				.argument("display-name", displayName)
				.argument("vpc-config", vpcConfig?.toString())
				.option("enable-default-internet-access", enableDefaultInternetAccess ?: false)
				.argument("domain-join-info", domainJoinInfo?.toString())
				.argument("appstream-agent-version", appstreamAgentVersion)
	}

}


fun AmazonAppStreamFunctions.createImageBuilderStreamingURL(name: String, init: (AmazonAppStreamCreateImageBuilderStreamingURLCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLResult {
	return this.block.declare(AmazonAppStreamCreateImageBuilderStreamingURLCommand(name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLResult
}

@Generated
class AmazonAppStreamCreateImageBuilderStreamingURLCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest, com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLResult> {

	var validity: Long? = 0L

	override fun build(): com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest {
		val input = com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest()
		input.setName(this.name)
		input.setValidity(this.validity)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLResult {
	  return com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLResult {
		return environment.appstream.createImageBuilderStreamingURL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream create-image-builder-streaming-url")
				.argument("name", name)
				.argument("validity", validity?.toString())
	}

}


fun AmazonAppStreamFunctions.createStack(name: String, init: (AmazonAppStreamCreateStackCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.CreateStackResult {
	return this.block.declare(AmazonAppStreamCreateStackCommand(name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.CreateStackResult
}

@Generated
class AmazonAppStreamCreateStackCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.CreateStackRequest, com.amazonaws.services.appstream.model.CreateStackResult> {

	var description: String? = null
	var displayName: String? = null
	var storageConnectors: List<com.amazonaws.services.appstream.model.StorageConnector>? = null
	var redirectURL: String? = null
	var feedbackURL: String? = null

	override fun build(): com.amazonaws.services.appstream.model.CreateStackRequest {
		val input = com.amazonaws.services.appstream.model.CreateStackRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setDisplayName(this.displayName)
		input.setStorageConnectors(this.storageConnectors)
		input.setRedirectURL(this.redirectURL)
		input.setFeedbackURL(this.feedbackURL)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.CreateStackResult {
	  return com.amazonaws.services.appstream.model.CreateStackResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.CreateStackResult {
		return environment.appstream.createStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream create-stack")
				.argument("name", name)
				.argument("description", description)
				.argument("display-name", displayName)
				.argument("storage-connectors", storageConnectors?.toString())
				.argument("redirect-url", redirectURL)
				.argument("feedback-url", feedbackURL)
	}

}


fun AmazonAppStreamFunctions.createStreamingURL(stackName: String, fleetName: String, userId: String, init: (AmazonAppStreamCreateStreamingURLCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.CreateStreamingURLResult {
	return this.block.declare(AmazonAppStreamCreateStreamingURLCommand(stackName, fleetName, userId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.CreateStreamingURLResult
}

@Generated
class AmazonAppStreamCreateStreamingURLCommand(val stackName: String, val fleetName: String, val userId: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.CreateStreamingURLRequest, com.amazonaws.services.appstream.model.CreateStreamingURLResult> {

	var applicationId: String? = null
	var validity: Long? = 0L
	var sessionContext: String? = null

	override fun build(): com.amazonaws.services.appstream.model.CreateStreamingURLRequest {
		val input = com.amazonaws.services.appstream.model.CreateStreamingURLRequest()
		input.setStackName(this.stackName)
		input.setFleetName(this.fleetName)
		input.setUserId(this.userId)
		input.setApplicationId(this.applicationId)
		input.setValidity(this.validity)
		input.setSessionContext(this.sessionContext)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.CreateStreamingURLResult {
	  return com.amazonaws.services.appstream.model.CreateStreamingURLResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.CreateStreamingURLResult {
		return environment.appstream.createStreamingURL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream create-streaming-url")
				.argument("stack-name", stackName)
				.argument("fleet-name", fleetName)
				.argument("user-id", userId)
				.argument("application-id", applicationId)
				.argument("validity", validity?.toString())
				.argument("session-context", sessionContext)
	}

}


fun AmazonAppStreamFunctions.deleteDirectoryConfig(directoryName: String, init: (AmazonAppStreamDeleteDirectoryConfigCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.DeleteDirectoryConfigResult {
	return this.block.declare(AmazonAppStreamDeleteDirectoryConfigCommand(directoryName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.DeleteDirectoryConfigResult
}

@Generated
class AmazonAppStreamDeleteDirectoryConfigCommand(val directoryName: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest, com.amazonaws.services.appstream.model.DeleteDirectoryConfigResult> {



	override fun build(): com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest {
		val input = com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest()
		input.setDirectoryName(this.directoryName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.DeleteDirectoryConfigResult {
	  return com.amazonaws.services.appstream.model.DeleteDirectoryConfigResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.DeleteDirectoryConfigResult {
		return environment.appstream.deleteDirectoryConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream delete-directory-config")
				.argument("directory-name", directoryName)
	}

}


fun AmazonAppStreamFunctions.deleteFleet(name: String, init: (AmazonAppStreamDeleteFleetCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.DeleteFleetResult {
	return this.block.declare(AmazonAppStreamDeleteFleetCommand(name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.DeleteFleetResult
}

@Generated
class AmazonAppStreamDeleteFleetCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DeleteFleetRequest, com.amazonaws.services.appstream.model.DeleteFleetResult> {



	override fun build(): com.amazonaws.services.appstream.model.DeleteFleetRequest {
		val input = com.amazonaws.services.appstream.model.DeleteFleetRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.DeleteFleetResult {
	  return com.amazonaws.services.appstream.model.DeleteFleetResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.DeleteFleetResult {
		return environment.appstream.deleteFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream delete-fleet")
				.argument("name", name)
	}

}


fun AmazonAppStreamFunctions.deleteImage(name: String, init: (AmazonAppStreamDeleteImageCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.DeleteImageResult {
	return this.block.declare(AmazonAppStreamDeleteImageCommand(name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.DeleteImageResult
}

@Generated
class AmazonAppStreamDeleteImageCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DeleteImageRequest, com.amazonaws.services.appstream.model.DeleteImageResult> {



	override fun build(): com.amazonaws.services.appstream.model.DeleteImageRequest {
		val input = com.amazonaws.services.appstream.model.DeleteImageRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.DeleteImageResult {
	  return com.amazonaws.services.appstream.model.DeleteImageResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.DeleteImageResult {
		return environment.appstream.deleteImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream delete-image")
				.argument("name", name)
	}

}


fun AmazonAppStreamFunctions.deleteImageBuilder(name: String, init: (AmazonAppStreamDeleteImageBuilderCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.DeleteImageBuilderResult {
	return this.block.declare(AmazonAppStreamDeleteImageBuilderCommand(name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.DeleteImageBuilderResult
}

@Generated
class AmazonAppStreamDeleteImageBuilderCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DeleteImageBuilderRequest, com.amazonaws.services.appstream.model.DeleteImageBuilderResult> {



	override fun build(): com.amazonaws.services.appstream.model.DeleteImageBuilderRequest {
		val input = com.amazonaws.services.appstream.model.DeleteImageBuilderRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.DeleteImageBuilderResult {
	  return com.amazonaws.services.appstream.model.DeleteImageBuilderResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.DeleteImageBuilderResult {
		return environment.appstream.deleteImageBuilder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream delete-image-builder")
				.argument("name", name)
	}

}


fun AmazonAppStreamFunctions.deleteStack(name: String, init: (AmazonAppStreamDeleteStackCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.DeleteStackResult {
	return this.block.declare(AmazonAppStreamDeleteStackCommand(name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.DeleteStackResult
}

@Generated
class AmazonAppStreamDeleteStackCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DeleteStackRequest, com.amazonaws.services.appstream.model.DeleteStackResult> {



	override fun build(): com.amazonaws.services.appstream.model.DeleteStackRequest {
		val input = com.amazonaws.services.appstream.model.DeleteStackRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.DeleteStackResult {
	  return com.amazonaws.services.appstream.model.DeleteStackResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.DeleteStackResult {
		return environment.appstream.deleteStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream delete-stack")
				.argument("name", name)
	}

}


fun AmazonAppStreamFunctions.describeDirectoryConfigs(init: (AmazonAppStreamDescribeDirectoryConfigsCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.DescribeDirectoryConfigsResult {
	return this.block.declare(AmazonAppStreamDescribeDirectoryConfigsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.DescribeDirectoryConfigsResult
}

@Generated
class AmazonAppStreamDescribeDirectoryConfigsCommand() : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DescribeDirectoryConfigsRequest, com.amazonaws.services.appstream.model.DescribeDirectoryConfigsResult> {

	var directoryNames: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.appstream.model.DescribeDirectoryConfigsRequest {
		val input = com.amazonaws.services.appstream.model.DescribeDirectoryConfigsRequest()
		input.setDirectoryNames(this.directoryNames)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.DescribeDirectoryConfigsResult {
	  return com.amazonaws.services.appstream.model.DescribeDirectoryConfigsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.DescribeDirectoryConfigsResult {
		return environment.appstream.describeDirectoryConfigs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream describe-directory-configs")
				.argument("directory-names", directoryNames?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonAppStreamFunctions.describeFleets(init: (AmazonAppStreamDescribeFleetsCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.DescribeFleetsResult {
	return this.block.declare(AmazonAppStreamDescribeFleetsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.DescribeFleetsResult
}

@Generated
class AmazonAppStreamDescribeFleetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DescribeFleetsRequest, com.amazonaws.services.appstream.model.DescribeFleetsResult> {

	var names: List<String>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.appstream.model.DescribeFleetsRequest {
		val input = com.amazonaws.services.appstream.model.DescribeFleetsRequest()
		input.setNames(this.names)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.DescribeFleetsResult {
	  return com.amazonaws.services.appstream.model.DescribeFleetsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.DescribeFleetsResult {
		return environment.appstream.describeFleets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream describe-fleets")
				.argument("names", names?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonAppStreamFunctions.describeImageBuilders(init: (AmazonAppStreamDescribeImageBuildersCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.DescribeImageBuildersResult {
	return this.block.declare(AmazonAppStreamDescribeImageBuildersCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.DescribeImageBuildersResult
}

@Generated
class AmazonAppStreamDescribeImageBuildersCommand() : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DescribeImageBuildersRequest, com.amazonaws.services.appstream.model.DescribeImageBuildersResult> {

	var names: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.appstream.model.DescribeImageBuildersRequest {
		val input = com.amazonaws.services.appstream.model.DescribeImageBuildersRequest()
		input.setNames(this.names)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.DescribeImageBuildersResult {
	  return com.amazonaws.services.appstream.model.DescribeImageBuildersResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.DescribeImageBuildersResult {
		return environment.appstream.describeImageBuilders(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream describe-image-builders")
				.argument("names", names?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonAppStreamFunctions.describeImages(init: (AmazonAppStreamDescribeImagesCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.DescribeImagesResult {
	return this.block.declare(AmazonAppStreamDescribeImagesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.DescribeImagesResult
}

@Generated
class AmazonAppStreamDescribeImagesCommand() : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DescribeImagesRequest, com.amazonaws.services.appstream.model.DescribeImagesResult> {

	var names: List<String>? = null

	override fun build(): com.amazonaws.services.appstream.model.DescribeImagesRequest {
		val input = com.amazonaws.services.appstream.model.DescribeImagesRequest()
		input.setNames(this.names)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.DescribeImagesResult {
	  return com.amazonaws.services.appstream.model.DescribeImagesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.DescribeImagesResult {
		return environment.appstream.describeImages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream describe-images")
				.argument("names", names?.toString())
	}

}


fun AmazonAppStreamFunctions.describeSessions(stackName: String, fleetName: String, init: (AmazonAppStreamDescribeSessionsCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.DescribeSessionsResult {
	return this.block.declare(AmazonAppStreamDescribeSessionsCommand(stackName, fleetName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.DescribeSessionsResult
}

@Generated
class AmazonAppStreamDescribeSessionsCommand(val stackName: String, val fleetName: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DescribeSessionsRequest, com.amazonaws.services.appstream.model.DescribeSessionsResult> {

	var userId: String? = null
	var nextToken: String? = null
	var limit: Int? = 0
	var authenticationType: AuthenticationType? = null

	override fun build(): com.amazonaws.services.appstream.model.DescribeSessionsRequest {
		val input = com.amazonaws.services.appstream.model.DescribeSessionsRequest()
		input.setStackName(this.stackName)
		input.setFleetName(this.fleetName)
		input.setUserId(this.userId)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		input.setAuthenticationType(this.authenticationType?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.DescribeSessionsResult {
	  return com.amazonaws.services.appstream.model.DescribeSessionsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.DescribeSessionsResult {
		return environment.appstream.describeSessions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream describe-sessions")
				.argument("stack-name", stackName)
				.argument("fleet-name", fleetName)
				.argument("user-id", userId)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
				.argument("authentication-type", authenticationType?.toString())
	}

}


fun AmazonAppStreamFunctions.describeStacks(init: (AmazonAppStreamDescribeStacksCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.DescribeStacksResult {
	return this.block.declare(AmazonAppStreamDescribeStacksCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.DescribeStacksResult
}

@Generated
class AmazonAppStreamDescribeStacksCommand() : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DescribeStacksRequest, com.amazonaws.services.appstream.model.DescribeStacksResult> {

	var names: List<String>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.appstream.model.DescribeStacksRequest {
		val input = com.amazonaws.services.appstream.model.DescribeStacksRequest()
		input.setNames(this.names)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.DescribeStacksResult {
	  return com.amazonaws.services.appstream.model.DescribeStacksResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.DescribeStacksResult {
		return environment.appstream.describeStacks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream describe-stacks")
				.argument("names", names?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonAppStreamFunctions.disassociateFleet(fleetName: String, stackName: String, init: (AmazonAppStreamDisassociateFleetCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.DisassociateFleetResult {
	return this.block.declare(AmazonAppStreamDisassociateFleetCommand(fleetName, stackName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.DisassociateFleetResult
}

@Generated
class AmazonAppStreamDisassociateFleetCommand(val fleetName: String, val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DisassociateFleetRequest, com.amazonaws.services.appstream.model.DisassociateFleetResult> {



	override fun build(): com.amazonaws.services.appstream.model.DisassociateFleetRequest {
		val input = com.amazonaws.services.appstream.model.DisassociateFleetRequest()
		input.setFleetName(this.fleetName)
		input.setStackName(this.stackName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.DisassociateFleetResult {
	  return com.amazonaws.services.appstream.model.DisassociateFleetResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.DisassociateFleetResult {
		return environment.appstream.disassociateFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream disassociate-fleet")
				.argument("fleet-name", fleetName)
				.argument("stack-name", stackName)
	}

}


fun AmazonAppStreamFunctions.expireSession(sessionId: String, init: (AmazonAppStreamExpireSessionCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.ExpireSessionResult {
	return this.block.declare(AmazonAppStreamExpireSessionCommand(sessionId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.ExpireSessionResult
}

@Generated
class AmazonAppStreamExpireSessionCommand(val sessionId: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.ExpireSessionRequest, com.amazonaws.services.appstream.model.ExpireSessionResult> {



	override fun build(): com.amazonaws.services.appstream.model.ExpireSessionRequest {
		val input = com.amazonaws.services.appstream.model.ExpireSessionRequest()
		input.setSessionId(this.sessionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.ExpireSessionResult {
	  return com.amazonaws.services.appstream.model.ExpireSessionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.ExpireSessionResult {
		return environment.appstream.expireSession(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream expire-session")
				.argument("session-id", sessionId)
	}

}


fun AmazonAppStreamFunctions.listAssociatedFleets(stackName: String, init: (AmazonAppStreamListAssociatedFleetsCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.ListAssociatedFleetsResult {
	return this.block.declare(AmazonAppStreamListAssociatedFleetsCommand(stackName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.ListAssociatedFleetsResult
}

@Generated
class AmazonAppStreamListAssociatedFleetsCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest, com.amazonaws.services.appstream.model.ListAssociatedFleetsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest {
		val input = com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest()
		input.setStackName(this.stackName)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.ListAssociatedFleetsResult {
	  return com.amazonaws.services.appstream.model.ListAssociatedFleetsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.ListAssociatedFleetsResult {
		return environment.appstream.listAssociatedFleets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream list-associated-fleets")
				.argument("stack-name", stackName)
				.argument("next-token", nextToken)
	}

}


fun AmazonAppStreamFunctions.listAssociatedStacks(fleetName: String, init: (AmazonAppStreamListAssociatedStacksCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.ListAssociatedStacksResult {
	return this.block.declare(AmazonAppStreamListAssociatedStacksCommand(fleetName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.ListAssociatedStacksResult
}

@Generated
class AmazonAppStreamListAssociatedStacksCommand(val fleetName: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.ListAssociatedStacksRequest, com.amazonaws.services.appstream.model.ListAssociatedStacksResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.appstream.model.ListAssociatedStacksRequest {
		val input = com.amazonaws.services.appstream.model.ListAssociatedStacksRequest()
		input.setFleetName(this.fleetName)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.ListAssociatedStacksResult {
	  return com.amazonaws.services.appstream.model.ListAssociatedStacksResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.ListAssociatedStacksResult {
		return environment.appstream.listAssociatedStacks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream list-associated-stacks")
				.argument("fleet-name", fleetName)
				.argument("next-token", nextToken)
	}

}


fun AmazonAppStreamFunctions.listTagsForResource(resourceArn: String, init: (AmazonAppStreamListTagsForResourceCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.ListTagsForResourceResult {
	return this.block.declare(AmazonAppStreamListTagsForResourceCommand(resourceArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.ListTagsForResourceResult
}

@Generated
class AmazonAppStreamListTagsForResourceCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.ListTagsForResourceRequest, com.amazonaws.services.appstream.model.ListTagsForResourceResult> {



	override fun build(): com.amazonaws.services.appstream.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.appstream.model.ListTagsForResourceRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.ListTagsForResourceResult {
	  return com.amazonaws.services.appstream.model.ListTagsForResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.ListTagsForResourceResult {
		return environment.appstream.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream list-tags-for-resource")
				.argument("resource-arn", resourceArn)
	}

}


fun AmazonAppStreamFunctions.startFleet(name: String, init: (AmazonAppStreamStartFleetCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.StartFleetResult {
	return this.block.declare(AmazonAppStreamStartFleetCommand(name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.StartFleetResult
}

@Generated
class AmazonAppStreamStartFleetCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.StartFleetRequest, com.amazonaws.services.appstream.model.StartFleetResult> {



	override fun build(): com.amazonaws.services.appstream.model.StartFleetRequest {
		val input = com.amazonaws.services.appstream.model.StartFleetRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.StartFleetResult {
	  return com.amazonaws.services.appstream.model.StartFleetResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.StartFleetResult {
		return environment.appstream.startFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream start-fleet")
				.argument("name", name)
	}

}


fun AmazonAppStreamFunctions.startImageBuilder(name: String, init: (AmazonAppStreamStartImageBuilderCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.StartImageBuilderResult {
	return this.block.declare(AmazonAppStreamStartImageBuilderCommand(name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.StartImageBuilderResult
}

@Generated
class AmazonAppStreamStartImageBuilderCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.StartImageBuilderRequest, com.amazonaws.services.appstream.model.StartImageBuilderResult> {

	var appstreamAgentVersion: String? = null

	override fun build(): com.amazonaws.services.appstream.model.StartImageBuilderRequest {
		val input = com.amazonaws.services.appstream.model.StartImageBuilderRequest()
		input.setName(this.name)
		input.setAppstreamAgentVersion(this.appstreamAgentVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.StartImageBuilderResult {
	  return com.amazonaws.services.appstream.model.StartImageBuilderResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.StartImageBuilderResult {
		return environment.appstream.startImageBuilder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream start-image-builder")
				.argument("name", name)
				.argument("appstream-agent-version", appstreamAgentVersion)
	}

}


fun AmazonAppStreamFunctions.stopFleet(name: String, init: (AmazonAppStreamStopFleetCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.StopFleetResult {
	return this.block.declare(AmazonAppStreamStopFleetCommand(name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.StopFleetResult
}

@Generated
class AmazonAppStreamStopFleetCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.StopFleetRequest, com.amazonaws.services.appstream.model.StopFleetResult> {



	override fun build(): com.amazonaws.services.appstream.model.StopFleetRequest {
		val input = com.amazonaws.services.appstream.model.StopFleetRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.StopFleetResult {
	  return com.amazonaws.services.appstream.model.StopFleetResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.StopFleetResult {
		return environment.appstream.stopFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream stop-fleet")
				.argument("name", name)
	}

}


fun AmazonAppStreamFunctions.stopImageBuilder(name: String, init: (AmazonAppStreamStopImageBuilderCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.StopImageBuilderResult {
	return this.block.declare(AmazonAppStreamStopImageBuilderCommand(name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.StopImageBuilderResult
}

@Generated
class AmazonAppStreamStopImageBuilderCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.StopImageBuilderRequest, com.amazonaws.services.appstream.model.StopImageBuilderResult> {



	override fun build(): com.amazonaws.services.appstream.model.StopImageBuilderRequest {
		val input = com.amazonaws.services.appstream.model.StopImageBuilderRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.StopImageBuilderResult {
	  return com.amazonaws.services.appstream.model.StopImageBuilderResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.StopImageBuilderResult {
		return environment.appstream.stopImageBuilder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream stop-image-builder")
				.argument("name", name)
	}

}


fun AmazonAppStreamFunctions.tagResource(resourceArn: String, tags: Map<String, String>, init: (AmazonAppStreamTagResourceCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.TagResourceResult {
	return this.block.declare(AmazonAppStreamTagResourceCommand(resourceArn, tags).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.TagResourceResult
}

@Generated
class AmazonAppStreamTagResourceCommand(val resourceArn: String, val tags: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.TagResourceRequest, com.amazonaws.services.appstream.model.TagResourceResult> {



	override fun build(): com.amazonaws.services.appstream.model.TagResourceRequest {
		val input = com.amazonaws.services.appstream.model.TagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.TagResourceResult {
	  return com.amazonaws.services.appstream.model.TagResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.TagResourceResult {
		return environment.appstream.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream tag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags.toString())
	}

}


fun AmazonAppStreamFunctions.untagResource(resourceArn: String, tagKeys: List<String>, init: (AmazonAppStreamUntagResourceCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.UntagResourceResult {
	return this.block.declare(AmazonAppStreamUntagResourceCommand(resourceArn, tagKeys).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.UntagResourceResult
}

@Generated
class AmazonAppStreamUntagResourceCommand(val resourceArn: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.UntagResourceRequest, com.amazonaws.services.appstream.model.UntagResourceResult> {



	override fun build(): com.amazonaws.services.appstream.model.UntagResourceRequest {
		val input = com.amazonaws.services.appstream.model.UntagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.UntagResourceResult {
	  return com.amazonaws.services.appstream.model.UntagResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.UntagResourceResult {
		return environment.appstream.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream untag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonAppStreamFunctions.updateDirectoryConfig(directoryName: String, init: (AmazonAppStreamUpdateDirectoryConfigCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.UpdateDirectoryConfigResult {
	return this.block.declare(AmazonAppStreamUpdateDirectoryConfigCommand(directoryName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.UpdateDirectoryConfigResult
}

@Generated
class AmazonAppStreamUpdateDirectoryConfigCommand(val directoryName: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest, com.amazonaws.services.appstream.model.UpdateDirectoryConfigResult> {

	var organizationalUnitDistinguishedNames: List<String>? = null
	var serviceAccountCredentials: com.amazonaws.services.appstream.model.ServiceAccountCredentials? = null

	override fun build(): com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest {
		val input = com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest()
		input.setDirectoryName(this.directoryName)
		input.setOrganizationalUnitDistinguishedNames(this.organizationalUnitDistinguishedNames)
		input.setServiceAccountCredentials(this.serviceAccountCredentials)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.UpdateDirectoryConfigResult {
	  return com.amazonaws.services.appstream.model.UpdateDirectoryConfigResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.UpdateDirectoryConfigResult {
		return environment.appstream.updateDirectoryConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream update-directory-config")
				.argument("directory-name", directoryName)
				.argument("organizational-unit-distinguished-names", organizationalUnitDistinguishedNames?.toString())
				.argument("service-account-credentials", serviceAccountCredentials?.toString())
	}

}


fun AmazonAppStreamFunctions.updateFleet(name: String, init: (AmazonAppStreamUpdateFleetCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.UpdateFleetResult {
	return this.block.declare(AmazonAppStreamUpdateFleetCommand(name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.UpdateFleetResult
}

@Generated
class AmazonAppStreamUpdateFleetCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.UpdateFleetRequest, com.amazonaws.services.appstream.model.UpdateFleetResult> {

	var imageName: String? = null
	var instanceType: String? = null
	var computeCapacity: com.amazonaws.services.appstream.model.ComputeCapacity? = null
	var vpcConfig: com.amazonaws.services.appstream.model.VpcConfig? = null
	var maxUserDurationInSeconds: Int? = 0
	var disconnectTimeoutInSeconds: Int? = 0
	var deleteVpcConfig: Boolean? = false
	var description: String? = null
	var displayName: String? = null
	var enableDefaultInternetAccess: Boolean? = false
	var domainJoinInfo: com.amazonaws.services.appstream.model.DomainJoinInfo? = null
	var attributesToDelete: List<FleetAttribute>? = null

	override fun build(): com.amazonaws.services.appstream.model.UpdateFleetRequest {
		val input = com.amazonaws.services.appstream.model.UpdateFleetRequest()
		input.setImageName(this.imageName)
		input.setName(this.name)
		input.setInstanceType(this.instanceType)
		input.setComputeCapacity(this.computeCapacity)
		input.setVpcConfig(this.vpcConfig)
		input.setMaxUserDurationInSeconds(this.maxUserDurationInSeconds)
		input.setDisconnectTimeoutInSeconds(this.disconnectTimeoutInSeconds)
		input.setDeleteVpcConfig(this.deleteVpcConfig)
		input.setDescription(this.description)
		input.setDisplayName(this.displayName)
		input.setEnableDefaultInternetAccess(this.enableDefaultInternetAccess)
		input.setDomainJoinInfo(this.domainJoinInfo)
		input.setAttributesToDelete(this.attributesToDelete?.map { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.UpdateFleetResult {
	  return com.amazonaws.services.appstream.model.UpdateFleetResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.UpdateFleetResult {
		return environment.appstream.updateFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream update-fleet")
				.argument("image-name", imageName)
				.argument("name", name)
				.argument("instance-type", instanceType)
				.argument("compute-capacity", computeCapacity?.toString())
				.argument("vpc-config", vpcConfig?.toString())
				.argument("max-user-duration-in-seconds", maxUserDurationInSeconds?.toString())
				.argument("disconnect-timeout-in-seconds", disconnectTimeoutInSeconds?.toString())
				.option("delete-vpc-config", deleteVpcConfig ?: false)
				.argument("description", description)
				.argument("display-name", displayName)
				.option("enable-default-internet-access", enableDefaultInternetAccess ?: false)
				.argument("domain-join-info", domainJoinInfo?.toString())
				.argument("attributes-to-delete", attributesToDelete?.toString())
	}

}


fun AmazonAppStreamFunctions.updateStack(name: String, init: (AmazonAppStreamUpdateStackCommand.() -> Unit)? = null): com.amazonaws.services.appstream.model.UpdateStackResult {
	return this.block.declare(AmazonAppStreamUpdateStackCommand(name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.appstream.model.UpdateStackResult
}

@Generated
class AmazonAppStreamUpdateStackCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.UpdateStackRequest, com.amazonaws.services.appstream.model.UpdateStackResult> {

	var displayName: String? = null
	var description: String? = null
	var storageConnectors: List<com.amazonaws.services.appstream.model.StorageConnector>? = null
	var deleteStorageConnectors: Boolean? = false
	var redirectURL: String? = null
	var feedbackURL: String? = null
	var attributesToDelete: List<StackAttribute>? = null

	override fun build(): com.amazonaws.services.appstream.model.UpdateStackRequest {
		val input = com.amazonaws.services.appstream.model.UpdateStackRequest()
		input.setDisplayName(this.displayName)
		input.setDescription(this.description)
		input.setName(this.name)
		input.setStorageConnectors(this.storageConnectors)
		input.setDeleteStorageConnectors(this.deleteStorageConnectors)
		input.setRedirectURL(this.redirectURL)
		input.setFeedbackURL(this.feedbackURL)
		input.setAttributesToDelete(this.attributesToDelete?.map { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.appstream.model.UpdateStackResult {
	  return com.amazonaws.services.appstream.model.UpdateStackResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.appstream.model.UpdateStackResult {
		return environment.appstream.updateStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream update-stack")
				.argument("display-name", displayName)
				.argument("description", description)
				.argument("name", name)
				.argument("storage-connectors", storageConnectors?.toString())
				.option("delete-storage-connectors", deleteStorageConnectors ?: false)
				.argument("redirect-url", redirectURL)
				.argument("feedback-url", feedbackURL)
				.argument("attributes-to-delete", attributesToDelete?.toString())
	}

}
