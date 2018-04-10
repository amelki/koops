
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.appstream.AmazonAppStream
import com.amazonaws.services.appstream.model.*

var codingue.koops.core.Environment.appstream: AmazonAppStream
	get() = this.capabilities[AmazonAppStream::class.java.name] as AmazonAppStream
	set(appstream) {
		this.capabilities[AmazonAppStream::class.java.name] = appstream
	}

@Generated
class AmazonAppStreamFunctions(val block: Block)

infix fun AwsContinuation.appstream(init: AmazonAppStreamFunctions.() -> Unit) {
	AmazonAppStreamFunctions(shell).apply(init)
}

			

fun AmazonAppStreamFunctions.associateFleet(fleetName: String, stackName: String, init: AmazonAppStreamAssociateFleetCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamAssociateFleetCommand(fleetName, stackName).apply(init))
}

@Generated
class AmazonAppStreamAssociateFleetCommand(val fleetName: String, val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.AssociateFleetRequest> {



	override fun build(): com.amazonaws.services.appstream.model.AssociateFleetRequest {
		val input = com.amazonaws.services.appstream.model.AssociateFleetRequest()
		input.setFleetName(this.fleetName)
		input.setStackName(this.stackName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.associateFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream associate-fleet")
				.argument("fleet-name", fleetName)
				.argument("stack-name", stackName)
	}

}


fun AmazonAppStreamFunctions.copyImage(sourceImageName: String, destinationImageName: String, destinationRegion: String, init: AmazonAppStreamCopyImageCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamCopyImageCommand(sourceImageName, destinationImageName, destinationRegion).apply(init))
}

@Generated
class AmazonAppStreamCopyImageCommand(val sourceImageName: String, val destinationImageName: String, val destinationRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.CopyImageRequest> {

	var destinationImageDescription: String? = null

	override fun build(): com.amazonaws.services.appstream.model.CopyImageRequest {
		val input = com.amazonaws.services.appstream.model.CopyImageRequest()
		input.setSourceImageName(this.sourceImageName)
		input.setDestinationImageName(this.destinationImageName)
		input.setDestinationRegion(this.destinationRegion)
		input.setDestinationImageDescription(this.destinationImageDescription)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.copyImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream copy-image")
				.argument("source-image-name", sourceImageName)
				.argument("destination-image-name", destinationImageName)
				.argument("destination-region", destinationRegion)
				.argument("destination-image-description", destinationImageDescription)
	}

}


fun AmazonAppStreamFunctions.createDirectoryConfig(directoryName: String, organizationalUnitDistinguishedNames: List<String>, serviceAccountCredentials: com.amazonaws.services.appstream.model.ServiceAccountCredentials, init: AmazonAppStreamCreateDirectoryConfigCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamCreateDirectoryConfigCommand(directoryName, organizationalUnitDistinguishedNames, serviceAccountCredentials).apply(init))
}

@Generated
class AmazonAppStreamCreateDirectoryConfigCommand(val directoryName: String, val organizationalUnitDistinguishedNames: List<String>, val serviceAccountCredentials: com.amazonaws.services.appstream.model.ServiceAccountCredentials) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest> {



	override fun build(): com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest {
		val input = com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest()
		input.setDirectoryName(this.directoryName)
		input.setOrganizationalUnitDistinguishedNames(this.organizationalUnitDistinguishedNames)
		input.setServiceAccountCredentials(this.serviceAccountCredentials)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.createDirectoryConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream create-directory-config")
				.argument("directory-name", directoryName)
				.argument("organizational-unit-distinguished-names", organizationalUnitDistinguishedNames.toString())
				.argument("service-account-credentials", serviceAccountCredentials.toString())
	}

}


fun AmazonAppStreamFunctions.createFleet(name: String, imageName: String, instanceType: String, computeCapacity: com.amazonaws.services.appstream.model.ComputeCapacity, init: AmazonAppStreamCreateFleetCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamCreateFleetCommand(name, imageName, instanceType, computeCapacity).apply(init))
}

@Generated
class AmazonAppStreamCreateFleetCommand(val name: String, val imageName: String, val instanceType: String, val computeCapacity: com.amazonaws.services.appstream.model.ComputeCapacity) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.CreateFleetRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.createFleet(build())
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


fun AmazonAppStreamFunctions.createImageBuilder(name: String, imageName: String, instanceType: String, init: AmazonAppStreamCreateImageBuilderCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamCreateImageBuilderCommand(name, imageName, instanceType).apply(init))
}

@Generated
class AmazonAppStreamCreateImageBuilderCommand(val name: String, val imageName: String, val instanceType: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.CreateImageBuilderRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.createImageBuilder(build())
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


fun AmazonAppStreamFunctions.createImageBuilderStreamingURL(name: String, init: AmazonAppStreamCreateImageBuilderStreamingURLCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamCreateImageBuilderStreamingURLCommand(name).apply(init))
}

@Generated
class AmazonAppStreamCreateImageBuilderStreamingURLCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest> {

	var validity: Long? = 0L

	override fun build(): com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest {
		val input = com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest()
		input.setName(this.name)
		input.setValidity(this.validity)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.createImageBuilderStreamingURL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream create-image-builder-streaming-url")
				.argument("name", name)
				.argument("validity", validity?.toString())
	}

}


fun AmazonAppStreamFunctions.createStack(name: String, init: AmazonAppStreamCreateStackCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamCreateStackCommand(name).apply(init))
}

@Generated
class AmazonAppStreamCreateStackCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.CreateStackRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.createStack(build())
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


fun AmazonAppStreamFunctions.createStreamingURL(stackName: String, fleetName: String, userId: String, init: AmazonAppStreamCreateStreamingURLCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamCreateStreamingURLCommand(stackName, fleetName, userId).apply(init))
}

@Generated
class AmazonAppStreamCreateStreamingURLCommand(val stackName: String, val fleetName: String, val userId: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.CreateStreamingURLRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.createStreamingURL(build())
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


fun AmazonAppStreamFunctions.deleteDirectoryConfig(directoryName: String, init: AmazonAppStreamDeleteDirectoryConfigCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamDeleteDirectoryConfigCommand(directoryName).apply(init))
}

@Generated
class AmazonAppStreamDeleteDirectoryConfigCommand(val directoryName: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest> {



	override fun build(): com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest {
		val input = com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest()
		input.setDirectoryName(this.directoryName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.deleteDirectoryConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream delete-directory-config")
				.argument("directory-name", directoryName)
	}

}


fun AmazonAppStreamFunctions.deleteFleet(name: String, init: AmazonAppStreamDeleteFleetCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamDeleteFleetCommand(name).apply(init))
}

@Generated
class AmazonAppStreamDeleteFleetCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DeleteFleetRequest> {



	override fun build(): com.amazonaws.services.appstream.model.DeleteFleetRequest {
		val input = com.amazonaws.services.appstream.model.DeleteFleetRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.deleteFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream delete-fleet")
				.argument("name", name)
	}

}


fun AmazonAppStreamFunctions.deleteImage(name: String, init: AmazonAppStreamDeleteImageCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamDeleteImageCommand(name).apply(init))
}

@Generated
class AmazonAppStreamDeleteImageCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DeleteImageRequest> {



	override fun build(): com.amazonaws.services.appstream.model.DeleteImageRequest {
		val input = com.amazonaws.services.appstream.model.DeleteImageRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.deleteImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream delete-image")
				.argument("name", name)
	}

}


fun AmazonAppStreamFunctions.deleteImageBuilder(name: String, init: AmazonAppStreamDeleteImageBuilderCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamDeleteImageBuilderCommand(name).apply(init))
}

@Generated
class AmazonAppStreamDeleteImageBuilderCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DeleteImageBuilderRequest> {



	override fun build(): com.amazonaws.services.appstream.model.DeleteImageBuilderRequest {
		val input = com.amazonaws.services.appstream.model.DeleteImageBuilderRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.deleteImageBuilder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream delete-image-builder")
				.argument("name", name)
	}

}


fun AmazonAppStreamFunctions.deleteStack(name: String, init: AmazonAppStreamDeleteStackCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamDeleteStackCommand(name).apply(init))
}

@Generated
class AmazonAppStreamDeleteStackCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DeleteStackRequest> {



	override fun build(): com.amazonaws.services.appstream.model.DeleteStackRequest {
		val input = com.amazonaws.services.appstream.model.DeleteStackRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.deleteStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream delete-stack")
				.argument("name", name)
	}

}


fun AmazonAppStreamFunctions.describeDirectoryConfigs(init: AmazonAppStreamDescribeDirectoryConfigsCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamDescribeDirectoryConfigsCommand().apply(init))
}

@Generated
class AmazonAppStreamDescribeDirectoryConfigsCommand() : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DescribeDirectoryConfigsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.describeDirectoryConfigs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream describe-directory-configs")
				.argument("directory-names", directoryNames?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonAppStreamFunctions.describeFleets(init: AmazonAppStreamDescribeFleetsCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamDescribeFleetsCommand().apply(init))
}

@Generated
class AmazonAppStreamDescribeFleetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DescribeFleetsRequest> {

	var names: List<String>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.appstream.model.DescribeFleetsRequest {
		val input = com.amazonaws.services.appstream.model.DescribeFleetsRequest()
		input.setNames(this.names)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.describeFleets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream describe-fleets")
				.argument("names", names?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonAppStreamFunctions.describeImageBuilders(init: AmazonAppStreamDescribeImageBuildersCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamDescribeImageBuildersCommand().apply(init))
}

@Generated
class AmazonAppStreamDescribeImageBuildersCommand() : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DescribeImageBuildersRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.describeImageBuilders(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream describe-image-builders")
				.argument("names", names?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonAppStreamFunctions.describeImages(init: AmazonAppStreamDescribeImagesCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamDescribeImagesCommand().apply(init))
}

@Generated
class AmazonAppStreamDescribeImagesCommand() : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DescribeImagesRequest> {

	var names: List<String>? = null

	override fun build(): com.amazonaws.services.appstream.model.DescribeImagesRequest {
		val input = com.amazonaws.services.appstream.model.DescribeImagesRequest()
		input.setNames(this.names)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.describeImages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream describe-images")
				.argument("names", names?.toString())
	}

}


fun AmazonAppStreamFunctions.describeSessions(stackName: String, fleetName: String, init: AmazonAppStreamDescribeSessionsCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamDescribeSessionsCommand(stackName, fleetName).apply(init))
}

@Generated
class AmazonAppStreamDescribeSessionsCommand(val stackName: String, val fleetName: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DescribeSessionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.describeSessions(build())
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


fun AmazonAppStreamFunctions.describeStacks(init: AmazonAppStreamDescribeStacksCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamDescribeStacksCommand().apply(init))
}

@Generated
class AmazonAppStreamDescribeStacksCommand() : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DescribeStacksRequest> {

	var names: List<String>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.appstream.model.DescribeStacksRequest {
		val input = com.amazonaws.services.appstream.model.DescribeStacksRequest()
		input.setNames(this.names)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.describeStacks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream describe-stacks")
				.argument("names", names?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonAppStreamFunctions.disassociateFleet(fleetName: String, stackName: String, init: AmazonAppStreamDisassociateFleetCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamDisassociateFleetCommand(fleetName, stackName).apply(init))
}

@Generated
class AmazonAppStreamDisassociateFleetCommand(val fleetName: String, val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.DisassociateFleetRequest> {



	override fun build(): com.amazonaws.services.appstream.model.DisassociateFleetRequest {
		val input = com.amazonaws.services.appstream.model.DisassociateFleetRequest()
		input.setFleetName(this.fleetName)
		input.setStackName(this.stackName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.disassociateFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream disassociate-fleet")
				.argument("fleet-name", fleetName)
				.argument("stack-name", stackName)
	}

}


fun AmazonAppStreamFunctions.expireSession(sessionId: String, init: AmazonAppStreamExpireSessionCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamExpireSessionCommand(sessionId).apply(init))
}

@Generated
class AmazonAppStreamExpireSessionCommand(val sessionId: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.ExpireSessionRequest> {



	override fun build(): com.amazonaws.services.appstream.model.ExpireSessionRequest {
		val input = com.amazonaws.services.appstream.model.ExpireSessionRequest()
		input.setSessionId(this.sessionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.expireSession(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream expire-session")
				.argument("session-id", sessionId)
	}

}


fun AmazonAppStreamFunctions.listAssociatedFleets(stackName: String, init: AmazonAppStreamListAssociatedFleetsCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamListAssociatedFleetsCommand(stackName).apply(init))
}

@Generated
class AmazonAppStreamListAssociatedFleetsCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest {
		val input = com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest()
		input.setStackName(this.stackName)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.listAssociatedFleets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream list-associated-fleets")
				.argument("stack-name", stackName)
				.argument("next-token", nextToken)
	}

}


fun AmazonAppStreamFunctions.listAssociatedStacks(fleetName: String, init: AmazonAppStreamListAssociatedStacksCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamListAssociatedStacksCommand(fleetName).apply(init))
}

@Generated
class AmazonAppStreamListAssociatedStacksCommand(val fleetName: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.ListAssociatedStacksRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.appstream.model.ListAssociatedStacksRequest {
		val input = com.amazonaws.services.appstream.model.ListAssociatedStacksRequest()
		input.setFleetName(this.fleetName)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.listAssociatedStacks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream list-associated-stacks")
				.argument("fleet-name", fleetName)
				.argument("next-token", nextToken)
	}

}


fun AmazonAppStreamFunctions.listTagsForResource(resourceArn: String, init: AmazonAppStreamListTagsForResourceCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamListTagsForResourceCommand(resourceArn).apply(init))
}

@Generated
class AmazonAppStreamListTagsForResourceCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.ListTagsForResourceRequest> {



	override fun build(): com.amazonaws.services.appstream.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.appstream.model.ListTagsForResourceRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream list-tags-for-resource")
				.argument("resource-arn", resourceArn)
	}

}


fun AmazonAppStreamFunctions.startFleet(name: String, init: AmazonAppStreamStartFleetCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamStartFleetCommand(name).apply(init))
}

@Generated
class AmazonAppStreamStartFleetCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.StartFleetRequest> {



	override fun build(): com.amazonaws.services.appstream.model.StartFleetRequest {
		val input = com.amazonaws.services.appstream.model.StartFleetRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.startFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream start-fleet")
				.argument("name", name)
	}

}


fun AmazonAppStreamFunctions.startImageBuilder(name: String, init: AmazonAppStreamStartImageBuilderCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamStartImageBuilderCommand(name).apply(init))
}

@Generated
class AmazonAppStreamStartImageBuilderCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.StartImageBuilderRequest> {

	var appstreamAgentVersion: String? = null

	override fun build(): com.amazonaws.services.appstream.model.StartImageBuilderRequest {
		val input = com.amazonaws.services.appstream.model.StartImageBuilderRequest()
		input.setName(this.name)
		input.setAppstreamAgentVersion(this.appstreamAgentVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.startImageBuilder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream start-image-builder")
				.argument("name", name)
				.argument("appstream-agent-version", appstreamAgentVersion)
	}

}


fun AmazonAppStreamFunctions.stopFleet(name: String, init: AmazonAppStreamStopFleetCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamStopFleetCommand(name).apply(init))
}

@Generated
class AmazonAppStreamStopFleetCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.StopFleetRequest> {



	override fun build(): com.amazonaws.services.appstream.model.StopFleetRequest {
		val input = com.amazonaws.services.appstream.model.StopFleetRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.stopFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream stop-fleet")
				.argument("name", name)
	}

}


fun AmazonAppStreamFunctions.stopImageBuilder(name: String, init: AmazonAppStreamStopImageBuilderCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamStopImageBuilderCommand(name).apply(init))
}

@Generated
class AmazonAppStreamStopImageBuilderCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.StopImageBuilderRequest> {



	override fun build(): com.amazonaws.services.appstream.model.StopImageBuilderRequest {
		val input = com.amazonaws.services.appstream.model.StopImageBuilderRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.stopImageBuilder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream stop-image-builder")
				.argument("name", name)
	}

}


fun AmazonAppStreamFunctions.tagResource(resourceArn: String, tags: Map<String, String>, init: AmazonAppStreamTagResourceCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamTagResourceCommand(resourceArn, tags).apply(init))
}

@Generated
class AmazonAppStreamTagResourceCommand(val resourceArn: String, val tags: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.TagResourceRequest> {



	override fun build(): com.amazonaws.services.appstream.model.TagResourceRequest {
		val input = com.amazonaws.services.appstream.model.TagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream tag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags.toString())
	}

}


fun AmazonAppStreamFunctions.untagResource(resourceArn: String, tagKeys: List<String>, init: AmazonAppStreamUntagResourceCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamUntagResourceCommand(resourceArn, tagKeys).apply(init))
}

@Generated
class AmazonAppStreamUntagResourceCommand(val resourceArn: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.UntagResourceRequest> {



	override fun build(): com.amazonaws.services.appstream.model.UntagResourceRequest {
		val input = com.amazonaws.services.appstream.model.UntagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream untag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonAppStreamFunctions.updateDirectoryConfig(directoryName: String, init: AmazonAppStreamUpdateDirectoryConfigCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamUpdateDirectoryConfigCommand(directoryName).apply(init))
}

@Generated
class AmazonAppStreamUpdateDirectoryConfigCommand(val directoryName: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest> {

	var organizationalUnitDistinguishedNames: List<String>? = null
	var serviceAccountCredentials: com.amazonaws.services.appstream.model.ServiceAccountCredentials? = null

	override fun build(): com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest {
		val input = com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest()
		input.setDirectoryName(this.directoryName)
		input.setOrganizationalUnitDistinguishedNames(this.organizationalUnitDistinguishedNames)
		input.setServiceAccountCredentials(this.serviceAccountCredentials)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.updateDirectoryConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appstream update-directory-config")
				.argument("directory-name", directoryName)
				.argument("organizational-unit-distinguished-names", organizationalUnitDistinguishedNames?.toString())
				.argument("service-account-credentials", serviceAccountCredentials?.toString())
	}

}


fun AmazonAppStreamFunctions.updateFleet(name: String, init: AmazonAppStreamUpdateFleetCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamUpdateFleetCommand(name).apply(init))
}

@Generated
class AmazonAppStreamUpdateFleetCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.UpdateFleetRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.updateFleet(build())
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


fun AmazonAppStreamFunctions.updateStack(name: String, init: AmazonAppStreamUpdateStackCommand.() -> Unit) {
	this.block.declare(AmazonAppStreamUpdateStackCommand(name).apply(init))
}

@Generated
class AmazonAppStreamUpdateStackCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.appstream.model.UpdateStackRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appstream.updateStack(build())
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
