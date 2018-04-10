
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.directory.AWSDirectoryService
import com.amazonaws.services.directory.model.*

var codingue.koops.core.Environment.ds: AWSDirectoryService
	get() = this.capabilities[AWSDirectoryService::class.java.name] as AWSDirectoryService
	set(ds) {
		this.capabilities[AWSDirectoryService::class.java.name] = ds
	}

@Generated
class AWSDirectoryServiceFunctions(val block: Block)

infix fun AwsContinuation.ds(init: AWSDirectoryServiceFunctions.() -> Unit) {
	AWSDirectoryServiceFunctions(shell).apply(init)
}

			

fun AWSDirectoryServiceFunctions.addIpRoutes(directoryId: String, ipRoutes: List<com.amazonaws.services.directory.model.IpRoute>, init: AWSDirectoryServiceAddIpRoutesCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceAddIpRoutesCommand(directoryId, ipRoutes).apply(init))
}

@Generated
class AWSDirectoryServiceAddIpRoutesCommand(val directoryId: String, val ipRoutes: List<com.amazonaws.services.directory.model.IpRoute>) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.AddIpRoutesRequest> {

	var updateSecurityGroupForDirectoryControllers: Boolean? = false

	override fun build(): com.amazonaws.services.directory.model.AddIpRoutesRequest {
		val input = com.amazonaws.services.directory.model.AddIpRoutesRequest()
		input.setDirectoryId(this.directoryId)
		input.setIpRoutes(this.ipRoutes)
		input.setUpdateSecurityGroupForDirectoryControllers(this.updateSecurityGroupForDirectoryControllers)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.addIpRoutes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds add-ip-routes")
				.argument("directory-id", directoryId)
				.argument("ip-routes", ipRoutes.toString())
				.option("update-security-group-for-directory-controllers", updateSecurityGroupForDirectoryControllers ?: false)
	}

}


fun AWSDirectoryServiceFunctions.addTagsToResource(resourceId: String, tags: List<com.amazonaws.services.directory.model.Tag>, init: AWSDirectoryServiceAddTagsToResourceCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceAddTagsToResourceCommand(resourceId, tags).apply(init))
}

@Generated
class AWSDirectoryServiceAddTagsToResourceCommand(val resourceId: String, val tags: List<com.amazonaws.services.directory.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.AddTagsToResourceRequest> {



	override fun build(): com.amazonaws.services.directory.model.AddTagsToResourceRequest {
		val input = com.amazonaws.services.directory.model.AddTagsToResourceRequest()
		input.setResourceId(this.resourceId)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.addTagsToResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds add-tags-to-resource")
				.argument("resource-id", resourceId)
				.argument("tags", tags.toString())
	}

}


fun AWSDirectoryServiceFunctions.cancelSchemaExtension(directoryId: String, schemaExtensionId: String, init: AWSDirectoryServiceCancelSchemaExtensionCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceCancelSchemaExtensionCommand(directoryId, schemaExtensionId).apply(init))
}

@Generated
class AWSDirectoryServiceCancelSchemaExtensionCommand(val directoryId: String, val schemaExtensionId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.CancelSchemaExtensionRequest> {



	override fun build(): com.amazonaws.services.directory.model.CancelSchemaExtensionRequest {
		val input = com.amazonaws.services.directory.model.CancelSchemaExtensionRequest()
		input.setDirectoryId(this.directoryId)
		input.setSchemaExtensionId(this.schemaExtensionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.cancelSchemaExtension(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds cancel-schema-extension")
				.argument("directory-id", directoryId)
				.argument("schema-extension-id", schemaExtensionId)
	}

}


fun AWSDirectoryServiceFunctions.connectDirectory(name: String, password: String, size: DirectorySize, connectSettings: com.amazonaws.services.directory.model.DirectoryConnectSettings, init: AWSDirectoryServiceConnectDirectoryCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceConnectDirectoryCommand(name, password, size, connectSettings).apply(init))
}

@Generated
class AWSDirectoryServiceConnectDirectoryCommand(val name: String, val password: String, val size: DirectorySize, val connectSettings: com.amazonaws.services.directory.model.DirectoryConnectSettings) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.ConnectDirectoryRequest> {

	var shortName: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.directory.model.ConnectDirectoryRequest {
		val input = com.amazonaws.services.directory.model.ConnectDirectoryRequest()
		input.setName(this.name)
		input.setShortName(this.shortName)
		input.setPassword(this.password)
		input.setDescription(this.description)
		input.setSize(this.size.toString())
		input.setConnectSettings(this.connectSettings)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.connectDirectory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds connect-directory")
				.argument("name", name)
				.argument("short-name", shortName)
				.argument("password", password)
				.argument("description", description)
				.argument("size", size.toString())
				.argument("connect-settings", connectSettings.toString())
	}

}


fun AWSDirectoryServiceFunctions.createAlias(directoryId: String, alias: String, init: AWSDirectoryServiceCreateAliasCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceCreateAliasCommand(directoryId, alias).apply(init))
}

@Generated
class AWSDirectoryServiceCreateAliasCommand(val directoryId: String, val alias: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.CreateAliasRequest> {



	override fun build(): com.amazonaws.services.directory.model.CreateAliasRequest {
		val input = com.amazonaws.services.directory.model.CreateAliasRequest()
		input.setDirectoryId(this.directoryId)
		input.setAlias(this.alias)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.createAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds create-alias")
				.argument("directory-id", directoryId)
				.argument("alias", alias)
	}

}


fun AWSDirectoryServiceFunctions.createComputer(directoryId: String, computerName: String, password: String, init: AWSDirectoryServiceCreateComputerCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceCreateComputerCommand(directoryId, computerName, password).apply(init))
}

@Generated
class AWSDirectoryServiceCreateComputerCommand(val directoryId: String, val computerName: String, val password: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.CreateComputerRequest> {

	var organizationalUnitDistinguishedName: String? = null
	var computerAttributes: List<com.amazonaws.services.directory.model.Attribute>? = null

	override fun build(): com.amazonaws.services.directory.model.CreateComputerRequest {
		val input = com.amazonaws.services.directory.model.CreateComputerRequest()
		input.setDirectoryId(this.directoryId)
		input.setComputerName(this.computerName)
		input.setPassword(this.password)
		input.setOrganizationalUnitDistinguishedName(this.organizationalUnitDistinguishedName)
		input.setComputerAttributes(this.computerAttributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.createComputer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds create-computer")
				.argument("directory-id", directoryId)
				.argument("computer-name", computerName)
				.argument("password", password)
				.argument("organizational-unit-distinguished-name", organizationalUnitDistinguishedName)
				.argument("computer-attributes", computerAttributes?.toString())
	}

}


fun AWSDirectoryServiceFunctions.createConditionalForwarder(directoryId: String, remoteDomainName: String, dnsIpAddrs: List<String>, init: AWSDirectoryServiceCreateConditionalForwarderCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceCreateConditionalForwarderCommand(directoryId, remoteDomainName, dnsIpAddrs).apply(init))
}

@Generated
class AWSDirectoryServiceCreateConditionalForwarderCommand(val directoryId: String, val remoteDomainName: String, val dnsIpAddrs: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.CreateConditionalForwarderRequest> {



	override fun build(): com.amazonaws.services.directory.model.CreateConditionalForwarderRequest {
		val input = com.amazonaws.services.directory.model.CreateConditionalForwarderRequest()
		input.setDirectoryId(this.directoryId)
		input.setRemoteDomainName(this.remoteDomainName)
		input.setDnsIpAddrs(this.dnsIpAddrs)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.createConditionalForwarder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds create-conditional-forwarder")
				.argument("directory-id", directoryId)
				.argument("remote-domain-name", remoteDomainName)
				.argument("dns-ip-addrs", dnsIpAddrs.toString())
	}

}


fun AWSDirectoryServiceFunctions.createDirectory(name: String, password: String, size: DirectorySize, init: AWSDirectoryServiceCreateDirectoryCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceCreateDirectoryCommand(name, password, size).apply(init))
}

@Generated
class AWSDirectoryServiceCreateDirectoryCommand(val name: String, val password: String, val size: DirectorySize) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.CreateDirectoryRequest> {

	var shortName: String? = null
	var description: String? = null
	var vpcSettings: com.amazonaws.services.directory.model.DirectoryVpcSettings? = null

	override fun build(): com.amazonaws.services.directory.model.CreateDirectoryRequest {
		val input = com.amazonaws.services.directory.model.CreateDirectoryRequest()
		input.setName(this.name)
		input.setShortName(this.shortName)
		input.setPassword(this.password)
		input.setDescription(this.description)
		input.setSize(this.size.toString())
		input.setVpcSettings(this.vpcSettings)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.createDirectory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds create-directory")
				.argument("name", name)
				.argument("short-name", shortName)
				.argument("password", password)
				.argument("description", description)
				.argument("size", size.toString())
				.argument("vpc-settings", vpcSettings?.toString())
	}

}


fun AWSDirectoryServiceFunctions.createMicrosoftAD(name: String, password: String, vpcSettings: com.amazonaws.services.directory.model.DirectoryVpcSettings, init: AWSDirectoryServiceCreateMicrosoftADCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceCreateMicrosoftADCommand(name, password, vpcSettings).apply(init))
}

@Generated
class AWSDirectoryServiceCreateMicrosoftADCommand(val name: String, val password: String, val vpcSettings: com.amazonaws.services.directory.model.DirectoryVpcSettings) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.CreateMicrosoftADRequest> {

	var shortName: String? = null
	var description: String? = null
	var edition: DirectoryEdition? = null

	override fun build(): com.amazonaws.services.directory.model.CreateMicrosoftADRequest {
		val input = com.amazonaws.services.directory.model.CreateMicrosoftADRequest()
		input.setName(this.name)
		input.setShortName(this.shortName)
		input.setPassword(this.password)
		input.setDescription(this.description)
		input.setVpcSettings(this.vpcSettings)
		input.setEdition(this.edition?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.createMicrosoftAD(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds create-microsoft-ad")
				.argument("name", name)
				.argument("short-name", shortName)
				.argument("password", password)
				.argument("description", description)
				.argument("vpc-settings", vpcSettings.toString())
				.argument("edition", edition?.toString())
	}

}


fun AWSDirectoryServiceFunctions.createSnapshot(directoryId: String, init: AWSDirectoryServiceCreateSnapshotCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceCreateSnapshotCommand(directoryId).apply(init))
}

@Generated
class AWSDirectoryServiceCreateSnapshotCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.CreateSnapshotRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.directory.model.CreateSnapshotRequest {
		val input = com.amazonaws.services.directory.model.CreateSnapshotRequest()
		input.setDirectoryId(this.directoryId)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.createSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds create-snapshot")
				.argument("directory-id", directoryId)
				.argument("name", name)
	}

}


fun AWSDirectoryServiceFunctions.createTrust(directoryId: String, remoteDomainName: String, trustPassword: String, trustDirection: TrustDirection, init: AWSDirectoryServiceCreateTrustCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceCreateTrustCommand(directoryId, remoteDomainName, trustPassword, trustDirection).apply(init))
}

@Generated
class AWSDirectoryServiceCreateTrustCommand(val directoryId: String, val remoteDomainName: String, val trustPassword: String, val trustDirection: TrustDirection) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.CreateTrustRequest> {

	var trustType: TrustType? = null
	var conditionalForwarderIpAddrs: List<String>? = null

	override fun build(): com.amazonaws.services.directory.model.CreateTrustRequest {
		val input = com.amazonaws.services.directory.model.CreateTrustRequest()
		input.setDirectoryId(this.directoryId)
		input.setRemoteDomainName(this.remoteDomainName)
		input.setTrustPassword(this.trustPassword)
		input.setTrustDirection(this.trustDirection.toString())
		input.setTrustType(this.trustType?.toString())
		input.setConditionalForwarderIpAddrs(this.conditionalForwarderIpAddrs)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.createTrust(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds create-trust")
				.argument("directory-id", directoryId)
				.argument("remote-domain-name", remoteDomainName)
				.argument("trust-password", trustPassword)
				.argument("trust-direction", trustDirection.toString())
				.argument("trust-type", trustType?.toString())
				.argument("conditional-forwarder-ip-addrs", conditionalForwarderIpAddrs?.toString())
	}

}


fun AWSDirectoryServiceFunctions.deleteConditionalForwarder(directoryId: String, remoteDomainName: String, init: AWSDirectoryServiceDeleteConditionalForwarderCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceDeleteConditionalForwarderCommand(directoryId, remoteDomainName).apply(init))
}

@Generated
class AWSDirectoryServiceDeleteConditionalForwarderCommand(val directoryId: String, val remoteDomainName: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest> {



	override fun build(): com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest {
		val input = com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest()
		input.setDirectoryId(this.directoryId)
		input.setRemoteDomainName(this.remoteDomainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.deleteConditionalForwarder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds delete-conditional-forwarder")
				.argument("directory-id", directoryId)
				.argument("remote-domain-name", remoteDomainName)
	}

}


fun AWSDirectoryServiceFunctions.deleteDirectory(directoryId: String, init: AWSDirectoryServiceDeleteDirectoryCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceDeleteDirectoryCommand(directoryId).apply(init))
}

@Generated
class AWSDirectoryServiceDeleteDirectoryCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DeleteDirectoryRequest> {



	override fun build(): com.amazonaws.services.directory.model.DeleteDirectoryRequest {
		val input = com.amazonaws.services.directory.model.DeleteDirectoryRequest()
		input.setDirectoryId(this.directoryId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.deleteDirectory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds delete-directory")
				.argument("directory-id", directoryId)
	}

}


fun AWSDirectoryServiceFunctions.deleteSnapshot(snapshotId: String, init: AWSDirectoryServiceDeleteSnapshotCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceDeleteSnapshotCommand(snapshotId).apply(init))
}

@Generated
class AWSDirectoryServiceDeleteSnapshotCommand(val snapshotId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DeleteSnapshotRequest> {



	override fun build(): com.amazonaws.services.directory.model.DeleteSnapshotRequest {
		val input = com.amazonaws.services.directory.model.DeleteSnapshotRequest()
		input.setSnapshotId(this.snapshotId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.deleteSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds delete-snapshot")
				.argument("snapshot-id", snapshotId)
	}

}


fun AWSDirectoryServiceFunctions.deleteTrust(trustId: String, init: AWSDirectoryServiceDeleteTrustCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceDeleteTrustCommand(trustId).apply(init))
}

@Generated
class AWSDirectoryServiceDeleteTrustCommand(val trustId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DeleteTrustRequest> {

	var deleteAssociatedConditionalForwarder: Boolean? = false

	override fun build(): com.amazonaws.services.directory.model.DeleteTrustRequest {
		val input = com.amazonaws.services.directory.model.DeleteTrustRequest()
		input.setTrustId(this.trustId)
		input.setDeleteAssociatedConditionalForwarder(this.deleteAssociatedConditionalForwarder)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.deleteTrust(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds delete-trust")
				.argument("trust-id", trustId)
				.option("delete-associated-conditional-forwarder", deleteAssociatedConditionalForwarder ?: false)
	}

}


fun AWSDirectoryServiceFunctions.deregisterEventTopic(directoryId: String, topicName: String, init: AWSDirectoryServiceDeregisterEventTopicCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceDeregisterEventTopicCommand(directoryId, topicName).apply(init))
}

@Generated
class AWSDirectoryServiceDeregisterEventTopicCommand(val directoryId: String, val topicName: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DeregisterEventTopicRequest> {



	override fun build(): com.amazonaws.services.directory.model.DeregisterEventTopicRequest {
		val input = com.amazonaws.services.directory.model.DeregisterEventTopicRequest()
		input.setDirectoryId(this.directoryId)
		input.setTopicName(this.topicName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.deregisterEventTopic(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds deregister-event-topic")
				.argument("directory-id", directoryId)
				.argument("topic-name", topicName)
	}

}


fun AWSDirectoryServiceFunctions.describeConditionalForwarders(directoryId: String, init: AWSDirectoryServiceDescribeConditionalForwardersCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceDescribeConditionalForwardersCommand(directoryId).apply(init))
}

@Generated
class AWSDirectoryServiceDescribeConditionalForwardersCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest> {

	var remoteDomainNames: List<String>? = null

	override fun build(): com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest {
		val input = com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest()
		input.setDirectoryId(this.directoryId)
		input.setRemoteDomainNames(this.remoteDomainNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.describeConditionalForwarders(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds describe-conditional-forwarders")
				.argument("directory-id", directoryId)
				.argument("remote-domain-names", remoteDomainNames?.toString())
	}

}


fun AWSDirectoryServiceFunctions.describeDirectories(init: AWSDirectoryServiceDescribeDirectoriesCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceDescribeDirectoriesCommand().apply(init))
}

@Generated
class AWSDirectoryServiceDescribeDirectoriesCommand() : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DescribeDirectoriesRequest> {

	var directoryIds: List<String>? = null
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.directory.model.DescribeDirectoriesRequest {
		val input = com.amazonaws.services.directory.model.DescribeDirectoriesRequest()
		input.setDirectoryIds(this.directoryIds)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.describeDirectories(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds describe-directories")
				.argument("directory-ids", directoryIds?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSDirectoryServiceFunctions.describeDomainControllers(directoryId: String, init: AWSDirectoryServiceDescribeDomainControllersCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceDescribeDomainControllersCommand(directoryId).apply(init))
}

@Generated
class AWSDirectoryServiceDescribeDomainControllersCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DescribeDomainControllersRequest> {

	var domainControllerIds: List<String>? = null
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.directory.model.DescribeDomainControllersRequest {
		val input = com.amazonaws.services.directory.model.DescribeDomainControllersRequest()
		input.setDirectoryId(this.directoryId)
		input.setDomainControllerIds(this.domainControllerIds)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.describeDomainControllers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds describe-domain-controllers")
				.argument("directory-id", directoryId)
				.argument("domain-controller-ids", domainControllerIds?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSDirectoryServiceFunctions.describeEventTopics(init: AWSDirectoryServiceDescribeEventTopicsCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceDescribeEventTopicsCommand().apply(init))
}

@Generated
class AWSDirectoryServiceDescribeEventTopicsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DescribeEventTopicsRequest> {

	var directoryId: String? = null
	var topicNames: List<String>? = null

	override fun build(): com.amazonaws.services.directory.model.DescribeEventTopicsRequest {
		val input = com.amazonaws.services.directory.model.DescribeEventTopicsRequest()
		input.setDirectoryId(this.directoryId)
		input.setTopicNames(this.topicNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.describeEventTopics(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds describe-event-topics")
				.argument("directory-id", directoryId)
				.argument("topic-names", topicNames?.toString())
	}

}


fun AWSDirectoryServiceFunctions.describeSnapshots(init: AWSDirectoryServiceDescribeSnapshotsCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceDescribeSnapshotsCommand().apply(init))
}

@Generated
class AWSDirectoryServiceDescribeSnapshotsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DescribeSnapshotsRequest> {

	var directoryId: String? = null
	var snapshotIds: List<String>? = null
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.directory.model.DescribeSnapshotsRequest {
		val input = com.amazonaws.services.directory.model.DescribeSnapshotsRequest()
		input.setDirectoryId(this.directoryId)
		input.setSnapshotIds(this.snapshotIds)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.describeSnapshots(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds describe-snapshots")
				.argument("directory-id", directoryId)
				.argument("snapshot-ids", snapshotIds?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSDirectoryServiceFunctions.describeTrusts(init: AWSDirectoryServiceDescribeTrustsCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceDescribeTrustsCommand().apply(init))
}

@Generated
class AWSDirectoryServiceDescribeTrustsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DescribeTrustsRequest> {

	var directoryId: String? = null
	var trustIds: List<String>? = null
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.directory.model.DescribeTrustsRequest {
		val input = com.amazonaws.services.directory.model.DescribeTrustsRequest()
		input.setDirectoryId(this.directoryId)
		input.setTrustIds(this.trustIds)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.describeTrusts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds describe-trusts")
				.argument("directory-id", directoryId)
				.argument("trust-ids", trustIds?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSDirectoryServiceFunctions.disableRadius(directoryId: String, init: AWSDirectoryServiceDisableRadiusCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceDisableRadiusCommand(directoryId).apply(init))
}

@Generated
class AWSDirectoryServiceDisableRadiusCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DisableRadiusRequest> {



	override fun build(): com.amazonaws.services.directory.model.DisableRadiusRequest {
		val input = com.amazonaws.services.directory.model.DisableRadiusRequest()
		input.setDirectoryId(this.directoryId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.disableRadius(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds disable-radius")
				.argument("directory-id", directoryId)
	}

}


fun AWSDirectoryServiceFunctions.disableSso(directoryId: String, init: AWSDirectoryServiceDisableSsoCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceDisableSsoCommand(directoryId).apply(init))
}

@Generated
class AWSDirectoryServiceDisableSsoCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DisableSsoRequest> {

	var userName: String? = null
	var password: String? = null

	override fun build(): com.amazonaws.services.directory.model.DisableSsoRequest {
		val input = com.amazonaws.services.directory.model.DisableSsoRequest()
		input.setDirectoryId(this.directoryId)
		input.setUserName(this.userName)
		input.setPassword(this.password)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.disableSso(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds disable-sso")
				.argument("directory-id", directoryId)
				.argument("user-name", userName)
				.argument("password", password)
	}

}


fun AWSDirectoryServiceFunctions.enableRadius(directoryId: String, radiusSettings: com.amazonaws.services.directory.model.RadiusSettings, init: AWSDirectoryServiceEnableRadiusCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceEnableRadiusCommand(directoryId, radiusSettings).apply(init))
}

@Generated
class AWSDirectoryServiceEnableRadiusCommand(val directoryId: String, val radiusSettings: com.amazonaws.services.directory.model.RadiusSettings) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.EnableRadiusRequest> {



	override fun build(): com.amazonaws.services.directory.model.EnableRadiusRequest {
		val input = com.amazonaws.services.directory.model.EnableRadiusRequest()
		input.setDirectoryId(this.directoryId)
		input.setRadiusSettings(this.radiusSettings)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.enableRadius(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds enable-radius")
				.argument("directory-id", directoryId)
				.argument("radius-settings", radiusSettings.toString())
	}

}


fun AWSDirectoryServiceFunctions.enableSso(directoryId: String, init: AWSDirectoryServiceEnableSsoCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceEnableSsoCommand(directoryId).apply(init))
}

@Generated
class AWSDirectoryServiceEnableSsoCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.EnableSsoRequest> {

	var userName: String? = null
	var password: String? = null

	override fun build(): com.amazonaws.services.directory.model.EnableSsoRequest {
		val input = com.amazonaws.services.directory.model.EnableSsoRequest()
		input.setDirectoryId(this.directoryId)
		input.setUserName(this.userName)
		input.setPassword(this.password)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.enableSso(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds enable-sso")
				.argument("directory-id", directoryId)
				.argument("user-name", userName)
				.argument("password", password)
	}

}


fun AWSDirectoryServiceFunctions.getDirectoryLimits(init: AWSDirectoryServiceGetDirectoryLimitsCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceGetDirectoryLimitsCommand().apply(init))
}

@Generated
class AWSDirectoryServiceGetDirectoryLimitsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directory.model.GetDirectoryLimitsRequest> {



	override fun build(): com.amazonaws.services.directory.model.GetDirectoryLimitsRequest {
		val input = com.amazonaws.services.directory.model.GetDirectoryLimitsRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.getDirectoryLimits(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds get-directory-limits")

	}

}


fun AWSDirectoryServiceFunctions.getSnapshotLimits(directoryId: String, init: AWSDirectoryServiceGetSnapshotLimitsCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceGetSnapshotLimitsCommand(directoryId).apply(init))
}

@Generated
class AWSDirectoryServiceGetSnapshotLimitsCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.GetSnapshotLimitsRequest> {



	override fun build(): com.amazonaws.services.directory.model.GetSnapshotLimitsRequest {
		val input = com.amazonaws.services.directory.model.GetSnapshotLimitsRequest()
		input.setDirectoryId(this.directoryId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.getSnapshotLimits(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds get-snapshot-limits")
				.argument("directory-id", directoryId)
	}

}


fun AWSDirectoryServiceFunctions.listIpRoutes(directoryId: String, init: AWSDirectoryServiceListIpRoutesCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceListIpRoutesCommand(directoryId).apply(init))
}

@Generated
class AWSDirectoryServiceListIpRoutesCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.ListIpRoutesRequest> {

	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.directory.model.ListIpRoutesRequest {
		val input = com.amazonaws.services.directory.model.ListIpRoutesRequest()
		input.setDirectoryId(this.directoryId)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.listIpRoutes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds list-ip-routes")
				.argument("directory-id", directoryId)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSDirectoryServiceFunctions.listSchemaExtensions(directoryId: String, init: AWSDirectoryServiceListSchemaExtensionsCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceListSchemaExtensionsCommand(directoryId).apply(init))
}

@Generated
class AWSDirectoryServiceListSchemaExtensionsCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.ListSchemaExtensionsRequest> {

	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.directory.model.ListSchemaExtensionsRequest {
		val input = com.amazonaws.services.directory.model.ListSchemaExtensionsRequest()
		input.setDirectoryId(this.directoryId)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.listSchemaExtensions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds list-schema-extensions")
				.argument("directory-id", directoryId)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSDirectoryServiceFunctions.listTagsForResource(resourceId: String, init: AWSDirectoryServiceListTagsForResourceCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceListTagsForResourceCommand(resourceId).apply(init))
}

@Generated
class AWSDirectoryServiceListTagsForResourceCommand(val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.ListTagsForResourceRequest> {

	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.directory.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.directory.model.ListTagsForResourceRequest()
		input.setResourceId(this.resourceId)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds list-tags-for-resource")
				.argument("resource-id", resourceId)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSDirectoryServiceFunctions.registerEventTopic(directoryId: String, topicName: String, init: AWSDirectoryServiceRegisterEventTopicCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceRegisterEventTopicCommand(directoryId, topicName).apply(init))
}

@Generated
class AWSDirectoryServiceRegisterEventTopicCommand(val directoryId: String, val topicName: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.RegisterEventTopicRequest> {



	override fun build(): com.amazonaws.services.directory.model.RegisterEventTopicRequest {
		val input = com.amazonaws.services.directory.model.RegisterEventTopicRequest()
		input.setDirectoryId(this.directoryId)
		input.setTopicName(this.topicName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.registerEventTopic(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds register-event-topic")
				.argument("directory-id", directoryId)
				.argument("topic-name", topicName)
	}

}


fun AWSDirectoryServiceFunctions.removeIpRoutes(directoryId: String, cidrIps: List<String>, init: AWSDirectoryServiceRemoveIpRoutesCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceRemoveIpRoutesCommand(directoryId, cidrIps).apply(init))
}

@Generated
class AWSDirectoryServiceRemoveIpRoutesCommand(val directoryId: String, val cidrIps: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.RemoveIpRoutesRequest> {



	override fun build(): com.amazonaws.services.directory.model.RemoveIpRoutesRequest {
		val input = com.amazonaws.services.directory.model.RemoveIpRoutesRequest()
		input.setDirectoryId(this.directoryId)
		input.setCidrIps(this.cidrIps)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.removeIpRoutes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds remove-ip-routes")
				.argument("directory-id", directoryId)
				.argument("cidr-ips", cidrIps.toString())
	}

}


fun AWSDirectoryServiceFunctions.removeTagsFromResource(resourceId: String, tagKeys: List<String>, init: AWSDirectoryServiceRemoveTagsFromResourceCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceRemoveTagsFromResourceCommand(resourceId, tagKeys).apply(init))
}

@Generated
class AWSDirectoryServiceRemoveTagsFromResourceCommand(val resourceId: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest> {



	override fun build(): com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest {
		val input = com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest()
		input.setResourceId(this.resourceId)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.removeTagsFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds remove-tags-from-resource")
				.argument("resource-id", resourceId)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSDirectoryServiceFunctions.restoreFromSnapshot(snapshotId: String, init: AWSDirectoryServiceRestoreFromSnapshotCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceRestoreFromSnapshotCommand(snapshotId).apply(init))
}

@Generated
class AWSDirectoryServiceRestoreFromSnapshotCommand(val snapshotId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.RestoreFromSnapshotRequest> {



	override fun build(): com.amazonaws.services.directory.model.RestoreFromSnapshotRequest {
		val input = com.amazonaws.services.directory.model.RestoreFromSnapshotRequest()
		input.setSnapshotId(this.snapshotId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.restoreFromSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds restore-from-snapshot")
				.argument("snapshot-id", snapshotId)
	}

}


fun AWSDirectoryServiceFunctions.startSchemaExtension(directoryId: String, createSnapshotBeforeSchemaExtension: Boolean, ldifContent: String, description: String, init: AWSDirectoryServiceStartSchemaExtensionCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceStartSchemaExtensionCommand(directoryId, createSnapshotBeforeSchemaExtension, ldifContent, description).apply(init))
}

@Generated
class AWSDirectoryServiceStartSchemaExtensionCommand(val directoryId: String, val createSnapshotBeforeSchemaExtension: Boolean, val ldifContent: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.StartSchemaExtensionRequest> {



	override fun build(): com.amazonaws.services.directory.model.StartSchemaExtensionRequest {
		val input = com.amazonaws.services.directory.model.StartSchemaExtensionRequest()
		input.setDirectoryId(this.directoryId)
		input.setCreateSnapshotBeforeSchemaExtension(this.createSnapshotBeforeSchemaExtension)
		input.setLdifContent(this.ldifContent)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.startSchemaExtension(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds start-schema-extension")
				.argument("directory-id", directoryId)
				.option("create-snapshot-before-schema-extension", createSnapshotBeforeSchemaExtension ?: false)
				.argument("ldif-content", ldifContent)
				.argument("description", description)
	}

}


fun AWSDirectoryServiceFunctions.updateConditionalForwarder(directoryId: String, remoteDomainName: String, dnsIpAddrs: List<String>, init: AWSDirectoryServiceUpdateConditionalForwarderCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceUpdateConditionalForwarderCommand(directoryId, remoteDomainName, dnsIpAddrs).apply(init))
}

@Generated
class AWSDirectoryServiceUpdateConditionalForwarderCommand(val directoryId: String, val remoteDomainName: String, val dnsIpAddrs: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest> {



	override fun build(): com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest {
		val input = com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest()
		input.setDirectoryId(this.directoryId)
		input.setRemoteDomainName(this.remoteDomainName)
		input.setDnsIpAddrs(this.dnsIpAddrs)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.updateConditionalForwarder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds update-conditional-forwarder")
				.argument("directory-id", directoryId)
				.argument("remote-domain-name", remoteDomainName)
				.argument("dns-ip-addrs", dnsIpAddrs.toString())
	}

}


fun AWSDirectoryServiceFunctions.updateNumberOfDomainControllers(directoryId: String, desiredNumber: Int, init: AWSDirectoryServiceUpdateNumberOfDomainControllersCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceUpdateNumberOfDomainControllersCommand(directoryId, desiredNumber).apply(init))
}

@Generated
class AWSDirectoryServiceUpdateNumberOfDomainControllersCommand(val directoryId: String, val desiredNumber: Int) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest> {



	override fun build(): com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest {
		val input = com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest()
		input.setDirectoryId(this.directoryId)
		input.setDesiredNumber(this.desiredNumber)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.updateNumberOfDomainControllers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds update-number-of-domain-controllers")
				.argument("directory-id", directoryId)
				.argument("desired-number", desiredNumber.toString())
	}

}


fun AWSDirectoryServiceFunctions.updateRadius(directoryId: String, radiusSettings: com.amazonaws.services.directory.model.RadiusSettings, init: AWSDirectoryServiceUpdateRadiusCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceUpdateRadiusCommand(directoryId, radiusSettings).apply(init))
}

@Generated
class AWSDirectoryServiceUpdateRadiusCommand(val directoryId: String, val radiusSettings: com.amazonaws.services.directory.model.RadiusSettings) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.UpdateRadiusRequest> {



	override fun build(): com.amazonaws.services.directory.model.UpdateRadiusRequest {
		val input = com.amazonaws.services.directory.model.UpdateRadiusRequest()
		input.setDirectoryId(this.directoryId)
		input.setRadiusSettings(this.radiusSettings)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.updateRadius(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds update-radius")
				.argument("directory-id", directoryId)
				.argument("radius-settings", radiusSettings.toString())
	}

}


fun AWSDirectoryServiceFunctions.verifyTrust(trustId: String, init: AWSDirectoryServiceVerifyTrustCommand.() -> Unit) {
	this.block.declare(AWSDirectoryServiceVerifyTrustCommand(trustId).apply(init))
}

@Generated
class AWSDirectoryServiceVerifyTrustCommand(val trustId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.VerifyTrustRequest> {



	override fun build(): com.amazonaws.services.directory.model.VerifyTrustRequest {
		val input = com.amazonaws.services.directory.model.VerifyTrustRequest()
		input.setTrustId(this.trustId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ds.verifyTrust(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds verify-trust")
				.argument("trust-id", trustId)
	}

}
