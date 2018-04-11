
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
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

infix fun <T> AwsContinuation.ds(init: AWSDirectoryServiceFunctions.() -> T): T {
	return AWSDirectoryServiceFunctions(shell).run(init)
}

			

fun AWSDirectoryServiceFunctions.addIpRoutes(directoryId: String, ipRoutes: List<com.amazonaws.services.directory.model.IpRoute>, init: AWSDirectoryServiceAddIpRoutesCommand.() -> Unit): com.amazonaws.services.directory.model.AddIpRoutesResult {
	return this.block.declare(AWSDirectoryServiceAddIpRoutesCommand(directoryId, ipRoutes).apply(init)) as com.amazonaws.services.directory.model.AddIpRoutesResult
}

@Generated
class AWSDirectoryServiceAddIpRoutesCommand(val directoryId: String, val ipRoutes: List<com.amazonaws.services.directory.model.IpRoute>) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.AddIpRoutesRequest, com.amazonaws.services.directory.model.AddIpRoutesResult> {

	var updateSecurityGroupForDirectoryControllers: Boolean? = false

	override fun build(): com.amazonaws.services.directory.model.AddIpRoutesRequest {
		val input = com.amazonaws.services.directory.model.AddIpRoutesRequest()
		input.setDirectoryId(this.directoryId)
		input.setIpRoutes(this.ipRoutes)
		input.setUpdateSecurityGroupForDirectoryControllers(this.updateSecurityGroupForDirectoryControllers)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.AddIpRoutesResult {
	  return com.amazonaws.services.directory.model.AddIpRoutesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.AddIpRoutesResult {
		return environment.ds.addIpRoutes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds add-ip-routes")
				.argument("directory-id", directoryId)
				.argument("ip-routes", ipRoutes.toString())
				.option("update-security-group-for-directory-controllers", updateSecurityGroupForDirectoryControllers ?: false)
	}

}


fun AWSDirectoryServiceFunctions.addTagsToResource(resourceId: String, tags: List<com.amazonaws.services.directory.model.Tag>, init: AWSDirectoryServiceAddTagsToResourceCommand.() -> Unit): com.amazonaws.services.directory.model.AddTagsToResourceResult {
	return this.block.declare(AWSDirectoryServiceAddTagsToResourceCommand(resourceId, tags).apply(init)) as com.amazonaws.services.directory.model.AddTagsToResourceResult
}

@Generated
class AWSDirectoryServiceAddTagsToResourceCommand(val resourceId: String, val tags: List<com.amazonaws.services.directory.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.AddTagsToResourceRequest, com.amazonaws.services.directory.model.AddTagsToResourceResult> {



	override fun build(): com.amazonaws.services.directory.model.AddTagsToResourceRequest {
		val input = com.amazonaws.services.directory.model.AddTagsToResourceRequest()
		input.setResourceId(this.resourceId)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.AddTagsToResourceResult {
	  return com.amazonaws.services.directory.model.AddTagsToResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.AddTagsToResourceResult {
		return environment.ds.addTagsToResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds add-tags-to-resource")
				.argument("resource-id", resourceId)
				.argument("tags", tags.toString())
	}

}


fun AWSDirectoryServiceFunctions.cancelSchemaExtension(directoryId: String, schemaExtensionId: String, init: AWSDirectoryServiceCancelSchemaExtensionCommand.() -> Unit): com.amazonaws.services.directory.model.CancelSchemaExtensionResult {
	return this.block.declare(AWSDirectoryServiceCancelSchemaExtensionCommand(directoryId, schemaExtensionId).apply(init)) as com.amazonaws.services.directory.model.CancelSchemaExtensionResult
}

@Generated
class AWSDirectoryServiceCancelSchemaExtensionCommand(val directoryId: String, val schemaExtensionId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.CancelSchemaExtensionRequest, com.amazonaws.services.directory.model.CancelSchemaExtensionResult> {



	override fun build(): com.amazonaws.services.directory.model.CancelSchemaExtensionRequest {
		val input = com.amazonaws.services.directory.model.CancelSchemaExtensionRequest()
		input.setDirectoryId(this.directoryId)
		input.setSchemaExtensionId(this.schemaExtensionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.CancelSchemaExtensionResult {
	  return com.amazonaws.services.directory.model.CancelSchemaExtensionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.CancelSchemaExtensionResult {
		return environment.ds.cancelSchemaExtension(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds cancel-schema-extension")
				.argument("directory-id", directoryId)
				.argument("schema-extension-id", schemaExtensionId)
	}

}


fun AWSDirectoryServiceFunctions.connectDirectory(name: String, password: String, size: DirectorySize, connectSettings: com.amazonaws.services.directory.model.DirectoryConnectSettings, init: AWSDirectoryServiceConnectDirectoryCommand.() -> Unit): com.amazonaws.services.directory.model.ConnectDirectoryResult {
	return this.block.declare(AWSDirectoryServiceConnectDirectoryCommand(name, password, size, connectSettings).apply(init)) as com.amazonaws.services.directory.model.ConnectDirectoryResult
}

@Generated
class AWSDirectoryServiceConnectDirectoryCommand(val name: String, val password: String, val size: DirectorySize, val connectSettings: com.amazonaws.services.directory.model.DirectoryConnectSettings) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.ConnectDirectoryRequest, com.amazonaws.services.directory.model.ConnectDirectoryResult> {

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

	
	override fun dryResult(): com.amazonaws.services.directory.model.ConnectDirectoryResult {
	  return com.amazonaws.services.directory.model.ConnectDirectoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.ConnectDirectoryResult {
		return environment.ds.connectDirectory(build())
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


fun AWSDirectoryServiceFunctions.createAlias(directoryId: String, alias: String, init: AWSDirectoryServiceCreateAliasCommand.() -> Unit): com.amazonaws.services.directory.model.CreateAliasResult {
	return this.block.declare(AWSDirectoryServiceCreateAliasCommand(directoryId, alias).apply(init)) as com.amazonaws.services.directory.model.CreateAliasResult
}

@Generated
class AWSDirectoryServiceCreateAliasCommand(val directoryId: String, val alias: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.CreateAliasRequest, com.amazonaws.services.directory.model.CreateAliasResult> {



	override fun build(): com.amazonaws.services.directory.model.CreateAliasRequest {
		val input = com.amazonaws.services.directory.model.CreateAliasRequest()
		input.setDirectoryId(this.directoryId)
		input.setAlias(this.alias)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.CreateAliasResult {
	  return com.amazonaws.services.directory.model.CreateAliasResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.CreateAliasResult {
		return environment.ds.createAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds create-alias")
				.argument("directory-id", directoryId)
				.argument("alias", alias)
	}

}


fun AWSDirectoryServiceFunctions.createComputer(directoryId: String, computerName: String, password: String, init: AWSDirectoryServiceCreateComputerCommand.() -> Unit): com.amazonaws.services.directory.model.CreateComputerResult {
	return this.block.declare(AWSDirectoryServiceCreateComputerCommand(directoryId, computerName, password).apply(init)) as com.amazonaws.services.directory.model.CreateComputerResult
}

@Generated
class AWSDirectoryServiceCreateComputerCommand(val directoryId: String, val computerName: String, val password: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.CreateComputerRequest, com.amazonaws.services.directory.model.CreateComputerResult> {

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

	
	override fun dryResult(): com.amazonaws.services.directory.model.CreateComputerResult {
	  return com.amazonaws.services.directory.model.CreateComputerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.CreateComputerResult {
		return environment.ds.createComputer(build())
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


fun AWSDirectoryServiceFunctions.createConditionalForwarder(directoryId: String, remoteDomainName: String, dnsIpAddrs: List<String>, init: AWSDirectoryServiceCreateConditionalForwarderCommand.() -> Unit): com.amazonaws.services.directory.model.CreateConditionalForwarderResult {
	return this.block.declare(AWSDirectoryServiceCreateConditionalForwarderCommand(directoryId, remoteDomainName, dnsIpAddrs).apply(init)) as com.amazonaws.services.directory.model.CreateConditionalForwarderResult
}

@Generated
class AWSDirectoryServiceCreateConditionalForwarderCommand(val directoryId: String, val remoteDomainName: String, val dnsIpAddrs: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.CreateConditionalForwarderRequest, com.amazonaws.services.directory.model.CreateConditionalForwarderResult> {



	override fun build(): com.amazonaws.services.directory.model.CreateConditionalForwarderRequest {
		val input = com.amazonaws.services.directory.model.CreateConditionalForwarderRequest()
		input.setDirectoryId(this.directoryId)
		input.setRemoteDomainName(this.remoteDomainName)
		input.setDnsIpAddrs(this.dnsIpAddrs)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.CreateConditionalForwarderResult {
	  return com.amazonaws.services.directory.model.CreateConditionalForwarderResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.CreateConditionalForwarderResult {
		return environment.ds.createConditionalForwarder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds create-conditional-forwarder")
				.argument("directory-id", directoryId)
				.argument("remote-domain-name", remoteDomainName)
				.argument("dns-ip-addrs", dnsIpAddrs.toString())
	}

}


fun AWSDirectoryServiceFunctions.createDirectory(name: String, password: String, size: DirectorySize, init: AWSDirectoryServiceCreateDirectoryCommand.() -> Unit): com.amazonaws.services.directory.model.CreateDirectoryResult {
	return this.block.declare(AWSDirectoryServiceCreateDirectoryCommand(name, password, size).apply(init)) as com.amazonaws.services.directory.model.CreateDirectoryResult
}

@Generated
class AWSDirectoryServiceCreateDirectoryCommand(val name: String, val password: String, val size: DirectorySize) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.CreateDirectoryRequest, com.amazonaws.services.directory.model.CreateDirectoryResult> {

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

	
	override fun dryResult(): com.amazonaws.services.directory.model.CreateDirectoryResult {
	  return com.amazonaws.services.directory.model.CreateDirectoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.CreateDirectoryResult {
		return environment.ds.createDirectory(build())
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


fun AWSDirectoryServiceFunctions.createMicrosoftAD(name: String, password: String, vpcSettings: com.amazonaws.services.directory.model.DirectoryVpcSettings, init: AWSDirectoryServiceCreateMicrosoftADCommand.() -> Unit): com.amazonaws.services.directory.model.CreateMicrosoftADResult {
	return this.block.declare(AWSDirectoryServiceCreateMicrosoftADCommand(name, password, vpcSettings).apply(init)) as com.amazonaws.services.directory.model.CreateMicrosoftADResult
}

@Generated
class AWSDirectoryServiceCreateMicrosoftADCommand(val name: String, val password: String, val vpcSettings: com.amazonaws.services.directory.model.DirectoryVpcSettings) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.CreateMicrosoftADRequest, com.amazonaws.services.directory.model.CreateMicrosoftADResult> {

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

	
	override fun dryResult(): com.amazonaws.services.directory.model.CreateMicrosoftADResult {
	  return com.amazonaws.services.directory.model.CreateMicrosoftADResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.CreateMicrosoftADResult {
		return environment.ds.createMicrosoftAD(build())
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


fun AWSDirectoryServiceFunctions.createSnapshot(directoryId: String, init: AWSDirectoryServiceCreateSnapshotCommand.() -> Unit): com.amazonaws.services.directory.model.CreateSnapshotResult {
	return this.block.declare(AWSDirectoryServiceCreateSnapshotCommand(directoryId).apply(init)) as com.amazonaws.services.directory.model.CreateSnapshotResult
}

@Generated
class AWSDirectoryServiceCreateSnapshotCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.CreateSnapshotRequest, com.amazonaws.services.directory.model.CreateSnapshotResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.directory.model.CreateSnapshotRequest {
		val input = com.amazonaws.services.directory.model.CreateSnapshotRequest()
		input.setDirectoryId(this.directoryId)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.CreateSnapshotResult {
	  return com.amazonaws.services.directory.model.CreateSnapshotResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.CreateSnapshotResult {
		return environment.ds.createSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds create-snapshot")
				.argument("directory-id", directoryId)
				.argument("name", name)
	}

}


fun AWSDirectoryServiceFunctions.createTrust(directoryId: String, remoteDomainName: String, trustPassword: String, trustDirection: TrustDirection, init: AWSDirectoryServiceCreateTrustCommand.() -> Unit): com.amazonaws.services.directory.model.CreateTrustResult {
	return this.block.declare(AWSDirectoryServiceCreateTrustCommand(directoryId, remoteDomainName, trustPassword, trustDirection).apply(init)) as com.amazonaws.services.directory.model.CreateTrustResult
}

@Generated
class AWSDirectoryServiceCreateTrustCommand(val directoryId: String, val remoteDomainName: String, val trustPassword: String, val trustDirection: TrustDirection) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.CreateTrustRequest, com.amazonaws.services.directory.model.CreateTrustResult> {

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

	
	override fun dryResult(): com.amazonaws.services.directory.model.CreateTrustResult {
	  return com.amazonaws.services.directory.model.CreateTrustResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.CreateTrustResult {
		return environment.ds.createTrust(build())
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


fun AWSDirectoryServiceFunctions.deleteConditionalForwarder(directoryId: String, remoteDomainName: String, init: AWSDirectoryServiceDeleteConditionalForwarderCommand.() -> Unit): com.amazonaws.services.directory.model.DeleteConditionalForwarderResult {
	return this.block.declare(AWSDirectoryServiceDeleteConditionalForwarderCommand(directoryId, remoteDomainName).apply(init)) as com.amazonaws.services.directory.model.DeleteConditionalForwarderResult
}

@Generated
class AWSDirectoryServiceDeleteConditionalForwarderCommand(val directoryId: String, val remoteDomainName: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest, com.amazonaws.services.directory.model.DeleteConditionalForwarderResult> {



	override fun build(): com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest {
		val input = com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest()
		input.setDirectoryId(this.directoryId)
		input.setRemoteDomainName(this.remoteDomainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.DeleteConditionalForwarderResult {
	  return com.amazonaws.services.directory.model.DeleteConditionalForwarderResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.DeleteConditionalForwarderResult {
		return environment.ds.deleteConditionalForwarder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds delete-conditional-forwarder")
				.argument("directory-id", directoryId)
				.argument("remote-domain-name", remoteDomainName)
	}

}


fun AWSDirectoryServiceFunctions.deleteDirectory(directoryId: String, init: AWSDirectoryServiceDeleteDirectoryCommand.() -> Unit): com.amazonaws.services.directory.model.DeleteDirectoryResult {
	return this.block.declare(AWSDirectoryServiceDeleteDirectoryCommand(directoryId).apply(init)) as com.amazonaws.services.directory.model.DeleteDirectoryResult
}

@Generated
class AWSDirectoryServiceDeleteDirectoryCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DeleteDirectoryRequest, com.amazonaws.services.directory.model.DeleteDirectoryResult> {



	override fun build(): com.amazonaws.services.directory.model.DeleteDirectoryRequest {
		val input = com.amazonaws.services.directory.model.DeleteDirectoryRequest()
		input.setDirectoryId(this.directoryId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.DeleteDirectoryResult {
	  return com.amazonaws.services.directory.model.DeleteDirectoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.DeleteDirectoryResult {
		return environment.ds.deleteDirectory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds delete-directory")
				.argument("directory-id", directoryId)
	}

}


fun AWSDirectoryServiceFunctions.deleteSnapshot(snapshotId: String, init: AWSDirectoryServiceDeleteSnapshotCommand.() -> Unit): com.amazonaws.services.directory.model.DeleteSnapshotResult {
	return this.block.declare(AWSDirectoryServiceDeleteSnapshotCommand(snapshotId).apply(init)) as com.amazonaws.services.directory.model.DeleteSnapshotResult
}

@Generated
class AWSDirectoryServiceDeleteSnapshotCommand(val snapshotId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DeleteSnapshotRequest, com.amazonaws.services.directory.model.DeleteSnapshotResult> {



	override fun build(): com.amazonaws.services.directory.model.DeleteSnapshotRequest {
		val input = com.amazonaws.services.directory.model.DeleteSnapshotRequest()
		input.setSnapshotId(this.snapshotId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.DeleteSnapshotResult {
	  return com.amazonaws.services.directory.model.DeleteSnapshotResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.DeleteSnapshotResult {
		return environment.ds.deleteSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds delete-snapshot")
				.argument("snapshot-id", snapshotId)
	}

}


fun AWSDirectoryServiceFunctions.deleteTrust(trustId: String, init: AWSDirectoryServiceDeleteTrustCommand.() -> Unit): com.amazonaws.services.directory.model.DeleteTrustResult {
	return this.block.declare(AWSDirectoryServiceDeleteTrustCommand(trustId).apply(init)) as com.amazonaws.services.directory.model.DeleteTrustResult
}

@Generated
class AWSDirectoryServiceDeleteTrustCommand(val trustId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DeleteTrustRequest, com.amazonaws.services.directory.model.DeleteTrustResult> {

	var deleteAssociatedConditionalForwarder: Boolean? = false

	override fun build(): com.amazonaws.services.directory.model.DeleteTrustRequest {
		val input = com.amazonaws.services.directory.model.DeleteTrustRequest()
		input.setTrustId(this.trustId)
		input.setDeleteAssociatedConditionalForwarder(this.deleteAssociatedConditionalForwarder)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.DeleteTrustResult {
	  return com.amazonaws.services.directory.model.DeleteTrustResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.DeleteTrustResult {
		return environment.ds.deleteTrust(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds delete-trust")
				.argument("trust-id", trustId)
				.option("delete-associated-conditional-forwarder", deleteAssociatedConditionalForwarder ?: false)
	}

}


fun AWSDirectoryServiceFunctions.deregisterEventTopic(directoryId: String, topicName: String, init: AWSDirectoryServiceDeregisterEventTopicCommand.() -> Unit): com.amazonaws.services.directory.model.DeregisterEventTopicResult {
	return this.block.declare(AWSDirectoryServiceDeregisterEventTopicCommand(directoryId, topicName).apply(init)) as com.amazonaws.services.directory.model.DeregisterEventTopicResult
}

@Generated
class AWSDirectoryServiceDeregisterEventTopicCommand(val directoryId: String, val topicName: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DeregisterEventTopicRequest, com.amazonaws.services.directory.model.DeregisterEventTopicResult> {



	override fun build(): com.amazonaws.services.directory.model.DeregisterEventTopicRequest {
		val input = com.amazonaws.services.directory.model.DeregisterEventTopicRequest()
		input.setDirectoryId(this.directoryId)
		input.setTopicName(this.topicName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.DeregisterEventTopicResult {
	  return com.amazonaws.services.directory.model.DeregisterEventTopicResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.DeregisterEventTopicResult {
		return environment.ds.deregisterEventTopic(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds deregister-event-topic")
				.argument("directory-id", directoryId)
				.argument("topic-name", topicName)
	}

}


fun AWSDirectoryServiceFunctions.describeConditionalForwarders(directoryId: String, init: AWSDirectoryServiceDescribeConditionalForwardersCommand.() -> Unit): com.amazonaws.services.directory.model.DescribeConditionalForwardersResult {
	return this.block.declare(AWSDirectoryServiceDescribeConditionalForwardersCommand(directoryId).apply(init)) as com.amazonaws.services.directory.model.DescribeConditionalForwardersResult
}

@Generated
class AWSDirectoryServiceDescribeConditionalForwardersCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest, com.amazonaws.services.directory.model.DescribeConditionalForwardersResult> {

	var remoteDomainNames: List<String>? = null

	override fun build(): com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest {
		val input = com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest()
		input.setDirectoryId(this.directoryId)
		input.setRemoteDomainNames(this.remoteDomainNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.DescribeConditionalForwardersResult {
	  return com.amazonaws.services.directory.model.DescribeConditionalForwardersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.DescribeConditionalForwardersResult {
		return environment.ds.describeConditionalForwarders(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds describe-conditional-forwarders")
				.argument("directory-id", directoryId)
				.argument("remote-domain-names", remoteDomainNames?.toString())
	}

}


fun AWSDirectoryServiceFunctions.describeDirectories(init: AWSDirectoryServiceDescribeDirectoriesCommand.() -> Unit): com.amazonaws.services.directory.model.DescribeDirectoriesResult {
	return this.block.declare(AWSDirectoryServiceDescribeDirectoriesCommand().apply(init)) as com.amazonaws.services.directory.model.DescribeDirectoriesResult
}

@Generated
class AWSDirectoryServiceDescribeDirectoriesCommand() : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DescribeDirectoriesRequest, com.amazonaws.services.directory.model.DescribeDirectoriesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.directory.model.DescribeDirectoriesResult {
	  return com.amazonaws.services.directory.model.DescribeDirectoriesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.DescribeDirectoriesResult {
		return environment.ds.describeDirectories(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds describe-directories")
				.argument("directory-ids", directoryIds?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSDirectoryServiceFunctions.describeDomainControllers(directoryId: String, init: AWSDirectoryServiceDescribeDomainControllersCommand.() -> Unit): com.amazonaws.services.directory.model.DescribeDomainControllersResult {
	return this.block.declare(AWSDirectoryServiceDescribeDomainControllersCommand(directoryId).apply(init)) as com.amazonaws.services.directory.model.DescribeDomainControllersResult
}

@Generated
class AWSDirectoryServiceDescribeDomainControllersCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DescribeDomainControllersRequest, com.amazonaws.services.directory.model.DescribeDomainControllersResult> {

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

	
	override fun dryResult(): com.amazonaws.services.directory.model.DescribeDomainControllersResult {
	  return com.amazonaws.services.directory.model.DescribeDomainControllersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.DescribeDomainControllersResult {
		return environment.ds.describeDomainControllers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds describe-domain-controllers")
				.argument("directory-id", directoryId)
				.argument("domain-controller-ids", domainControllerIds?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSDirectoryServiceFunctions.describeEventTopics(init: AWSDirectoryServiceDescribeEventTopicsCommand.() -> Unit): com.amazonaws.services.directory.model.DescribeEventTopicsResult {
	return this.block.declare(AWSDirectoryServiceDescribeEventTopicsCommand().apply(init)) as com.amazonaws.services.directory.model.DescribeEventTopicsResult
}

@Generated
class AWSDirectoryServiceDescribeEventTopicsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DescribeEventTopicsRequest, com.amazonaws.services.directory.model.DescribeEventTopicsResult> {

	var directoryId: String? = null
	var topicNames: List<String>? = null

	override fun build(): com.amazonaws.services.directory.model.DescribeEventTopicsRequest {
		val input = com.amazonaws.services.directory.model.DescribeEventTopicsRequest()
		input.setDirectoryId(this.directoryId)
		input.setTopicNames(this.topicNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.DescribeEventTopicsResult {
	  return com.amazonaws.services.directory.model.DescribeEventTopicsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.DescribeEventTopicsResult {
		return environment.ds.describeEventTopics(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds describe-event-topics")
				.argument("directory-id", directoryId)
				.argument("topic-names", topicNames?.toString())
	}

}


fun AWSDirectoryServiceFunctions.describeSnapshots(init: AWSDirectoryServiceDescribeSnapshotsCommand.() -> Unit): com.amazonaws.services.directory.model.DescribeSnapshotsResult {
	return this.block.declare(AWSDirectoryServiceDescribeSnapshotsCommand().apply(init)) as com.amazonaws.services.directory.model.DescribeSnapshotsResult
}

@Generated
class AWSDirectoryServiceDescribeSnapshotsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DescribeSnapshotsRequest, com.amazonaws.services.directory.model.DescribeSnapshotsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.directory.model.DescribeSnapshotsResult {
	  return com.amazonaws.services.directory.model.DescribeSnapshotsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.DescribeSnapshotsResult {
		return environment.ds.describeSnapshots(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds describe-snapshots")
				.argument("directory-id", directoryId)
				.argument("snapshot-ids", snapshotIds?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSDirectoryServiceFunctions.describeTrusts(init: AWSDirectoryServiceDescribeTrustsCommand.() -> Unit): com.amazonaws.services.directory.model.DescribeTrustsResult {
	return this.block.declare(AWSDirectoryServiceDescribeTrustsCommand().apply(init)) as com.amazonaws.services.directory.model.DescribeTrustsResult
}

@Generated
class AWSDirectoryServiceDescribeTrustsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DescribeTrustsRequest, com.amazonaws.services.directory.model.DescribeTrustsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.directory.model.DescribeTrustsResult {
	  return com.amazonaws.services.directory.model.DescribeTrustsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.DescribeTrustsResult {
		return environment.ds.describeTrusts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds describe-trusts")
				.argument("directory-id", directoryId)
				.argument("trust-ids", trustIds?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSDirectoryServiceFunctions.disableRadius(directoryId: String, init: AWSDirectoryServiceDisableRadiusCommand.() -> Unit): com.amazonaws.services.directory.model.DisableRadiusResult {
	return this.block.declare(AWSDirectoryServiceDisableRadiusCommand(directoryId).apply(init)) as com.amazonaws.services.directory.model.DisableRadiusResult
}

@Generated
class AWSDirectoryServiceDisableRadiusCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DisableRadiusRequest, com.amazonaws.services.directory.model.DisableRadiusResult> {



	override fun build(): com.amazonaws.services.directory.model.DisableRadiusRequest {
		val input = com.amazonaws.services.directory.model.DisableRadiusRequest()
		input.setDirectoryId(this.directoryId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.DisableRadiusResult {
	  return com.amazonaws.services.directory.model.DisableRadiusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.DisableRadiusResult {
		return environment.ds.disableRadius(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds disable-radius")
				.argument("directory-id", directoryId)
	}

}


fun AWSDirectoryServiceFunctions.disableSso(directoryId: String, init: AWSDirectoryServiceDisableSsoCommand.() -> Unit): com.amazonaws.services.directory.model.DisableSsoResult {
	return this.block.declare(AWSDirectoryServiceDisableSsoCommand(directoryId).apply(init)) as com.amazonaws.services.directory.model.DisableSsoResult
}

@Generated
class AWSDirectoryServiceDisableSsoCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.DisableSsoRequest, com.amazonaws.services.directory.model.DisableSsoResult> {

	var userName: String? = null
	var password: String? = null

	override fun build(): com.amazonaws.services.directory.model.DisableSsoRequest {
		val input = com.amazonaws.services.directory.model.DisableSsoRequest()
		input.setDirectoryId(this.directoryId)
		input.setUserName(this.userName)
		input.setPassword(this.password)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.DisableSsoResult {
	  return com.amazonaws.services.directory.model.DisableSsoResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.DisableSsoResult {
		return environment.ds.disableSso(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds disable-sso")
				.argument("directory-id", directoryId)
				.argument("user-name", userName)
				.argument("password", password)
	}

}


fun AWSDirectoryServiceFunctions.enableRadius(directoryId: String, radiusSettings: com.amazonaws.services.directory.model.RadiusSettings, init: AWSDirectoryServiceEnableRadiusCommand.() -> Unit): com.amazonaws.services.directory.model.EnableRadiusResult {
	return this.block.declare(AWSDirectoryServiceEnableRadiusCommand(directoryId, radiusSettings).apply(init)) as com.amazonaws.services.directory.model.EnableRadiusResult
}

@Generated
class AWSDirectoryServiceEnableRadiusCommand(val directoryId: String, val radiusSettings: com.amazonaws.services.directory.model.RadiusSettings) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.EnableRadiusRequest, com.amazonaws.services.directory.model.EnableRadiusResult> {



	override fun build(): com.amazonaws.services.directory.model.EnableRadiusRequest {
		val input = com.amazonaws.services.directory.model.EnableRadiusRequest()
		input.setDirectoryId(this.directoryId)
		input.setRadiusSettings(this.radiusSettings)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.EnableRadiusResult {
	  return com.amazonaws.services.directory.model.EnableRadiusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.EnableRadiusResult {
		return environment.ds.enableRadius(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds enable-radius")
				.argument("directory-id", directoryId)
				.argument("radius-settings", radiusSettings.toString())
	}

}


fun AWSDirectoryServiceFunctions.enableSso(directoryId: String, init: AWSDirectoryServiceEnableSsoCommand.() -> Unit): com.amazonaws.services.directory.model.EnableSsoResult {
	return this.block.declare(AWSDirectoryServiceEnableSsoCommand(directoryId).apply(init)) as com.amazonaws.services.directory.model.EnableSsoResult
}

@Generated
class AWSDirectoryServiceEnableSsoCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.EnableSsoRequest, com.amazonaws.services.directory.model.EnableSsoResult> {

	var userName: String? = null
	var password: String? = null

	override fun build(): com.amazonaws.services.directory.model.EnableSsoRequest {
		val input = com.amazonaws.services.directory.model.EnableSsoRequest()
		input.setDirectoryId(this.directoryId)
		input.setUserName(this.userName)
		input.setPassword(this.password)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.EnableSsoResult {
	  return com.amazonaws.services.directory.model.EnableSsoResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.EnableSsoResult {
		return environment.ds.enableSso(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds enable-sso")
				.argument("directory-id", directoryId)
				.argument("user-name", userName)
				.argument("password", password)
	}

}


fun AWSDirectoryServiceFunctions.getDirectoryLimits(init: AWSDirectoryServiceGetDirectoryLimitsCommand.() -> Unit): com.amazonaws.services.directory.model.GetDirectoryLimitsResult {
	return this.block.declare(AWSDirectoryServiceGetDirectoryLimitsCommand().apply(init)) as com.amazonaws.services.directory.model.GetDirectoryLimitsResult
}

@Generated
class AWSDirectoryServiceGetDirectoryLimitsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directory.model.GetDirectoryLimitsRequest, com.amazonaws.services.directory.model.GetDirectoryLimitsResult> {



	override fun build(): com.amazonaws.services.directory.model.GetDirectoryLimitsRequest {
		val input = com.amazonaws.services.directory.model.GetDirectoryLimitsRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.GetDirectoryLimitsResult {
	  return com.amazonaws.services.directory.model.GetDirectoryLimitsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.GetDirectoryLimitsResult {
		return environment.ds.getDirectoryLimits(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds get-directory-limits")

	}

}


fun AWSDirectoryServiceFunctions.getSnapshotLimits(directoryId: String, init: AWSDirectoryServiceGetSnapshotLimitsCommand.() -> Unit): com.amazonaws.services.directory.model.GetSnapshotLimitsResult {
	return this.block.declare(AWSDirectoryServiceGetSnapshotLimitsCommand(directoryId).apply(init)) as com.amazonaws.services.directory.model.GetSnapshotLimitsResult
}

@Generated
class AWSDirectoryServiceGetSnapshotLimitsCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.GetSnapshotLimitsRequest, com.amazonaws.services.directory.model.GetSnapshotLimitsResult> {



	override fun build(): com.amazonaws.services.directory.model.GetSnapshotLimitsRequest {
		val input = com.amazonaws.services.directory.model.GetSnapshotLimitsRequest()
		input.setDirectoryId(this.directoryId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.GetSnapshotLimitsResult {
	  return com.amazonaws.services.directory.model.GetSnapshotLimitsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.GetSnapshotLimitsResult {
		return environment.ds.getSnapshotLimits(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds get-snapshot-limits")
				.argument("directory-id", directoryId)
	}

}


fun AWSDirectoryServiceFunctions.listIpRoutes(directoryId: String, init: AWSDirectoryServiceListIpRoutesCommand.() -> Unit): com.amazonaws.services.directory.model.ListIpRoutesResult {
	return this.block.declare(AWSDirectoryServiceListIpRoutesCommand(directoryId).apply(init)) as com.amazonaws.services.directory.model.ListIpRoutesResult
}

@Generated
class AWSDirectoryServiceListIpRoutesCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.ListIpRoutesRequest, com.amazonaws.services.directory.model.ListIpRoutesResult> {

	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.directory.model.ListIpRoutesRequest {
		val input = com.amazonaws.services.directory.model.ListIpRoutesRequest()
		input.setDirectoryId(this.directoryId)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.ListIpRoutesResult {
	  return com.amazonaws.services.directory.model.ListIpRoutesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.ListIpRoutesResult {
		return environment.ds.listIpRoutes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds list-ip-routes")
				.argument("directory-id", directoryId)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSDirectoryServiceFunctions.listSchemaExtensions(directoryId: String, init: AWSDirectoryServiceListSchemaExtensionsCommand.() -> Unit): com.amazonaws.services.directory.model.ListSchemaExtensionsResult {
	return this.block.declare(AWSDirectoryServiceListSchemaExtensionsCommand(directoryId).apply(init)) as com.amazonaws.services.directory.model.ListSchemaExtensionsResult
}

@Generated
class AWSDirectoryServiceListSchemaExtensionsCommand(val directoryId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.ListSchemaExtensionsRequest, com.amazonaws.services.directory.model.ListSchemaExtensionsResult> {

	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.directory.model.ListSchemaExtensionsRequest {
		val input = com.amazonaws.services.directory.model.ListSchemaExtensionsRequest()
		input.setDirectoryId(this.directoryId)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.ListSchemaExtensionsResult {
	  return com.amazonaws.services.directory.model.ListSchemaExtensionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.ListSchemaExtensionsResult {
		return environment.ds.listSchemaExtensions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds list-schema-extensions")
				.argument("directory-id", directoryId)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSDirectoryServiceFunctions.listTagsForResource(resourceId: String, init: AWSDirectoryServiceListTagsForResourceCommand.() -> Unit): com.amazonaws.services.directory.model.ListTagsForResourceResult {
	return this.block.declare(AWSDirectoryServiceListTagsForResourceCommand(resourceId).apply(init)) as com.amazonaws.services.directory.model.ListTagsForResourceResult
}

@Generated
class AWSDirectoryServiceListTagsForResourceCommand(val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.ListTagsForResourceRequest, com.amazonaws.services.directory.model.ListTagsForResourceResult> {

	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.directory.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.directory.model.ListTagsForResourceRequest()
		input.setResourceId(this.resourceId)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.ListTagsForResourceResult {
	  return com.amazonaws.services.directory.model.ListTagsForResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.ListTagsForResourceResult {
		return environment.ds.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds list-tags-for-resource")
				.argument("resource-id", resourceId)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AWSDirectoryServiceFunctions.registerEventTopic(directoryId: String, topicName: String, init: AWSDirectoryServiceRegisterEventTopicCommand.() -> Unit): com.amazonaws.services.directory.model.RegisterEventTopicResult {
	return this.block.declare(AWSDirectoryServiceRegisterEventTopicCommand(directoryId, topicName).apply(init)) as com.amazonaws.services.directory.model.RegisterEventTopicResult
}

@Generated
class AWSDirectoryServiceRegisterEventTopicCommand(val directoryId: String, val topicName: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.RegisterEventTopicRequest, com.amazonaws.services.directory.model.RegisterEventTopicResult> {



	override fun build(): com.amazonaws.services.directory.model.RegisterEventTopicRequest {
		val input = com.amazonaws.services.directory.model.RegisterEventTopicRequest()
		input.setDirectoryId(this.directoryId)
		input.setTopicName(this.topicName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.RegisterEventTopicResult {
	  return com.amazonaws.services.directory.model.RegisterEventTopicResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.RegisterEventTopicResult {
		return environment.ds.registerEventTopic(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds register-event-topic")
				.argument("directory-id", directoryId)
				.argument("topic-name", topicName)
	}

}


fun AWSDirectoryServiceFunctions.removeIpRoutes(directoryId: String, cidrIps: List<String>, init: AWSDirectoryServiceRemoveIpRoutesCommand.() -> Unit): com.amazonaws.services.directory.model.RemoveIpRoutesResult {
	return this.block.declare(AWSDirectoryServiceRemoveIpRoutesCommand(directoryId, cidrIps).apply(init)) as com.amazonaws.services.directory.model.RemoveIpRoutesResult
}

@Generated
class AWSDirectoryServiceRemoveIpRoutesCommand(val directoryId: String, val cidrIps: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.RemoveIpRoutesRequest, com.amazonaws.services.directory.model.RemoveIpRoutesResult> {



	override fun build(): com.amazonaws.services.directory.model.RemoveIpRoutesRequest {
		val input = com.amazonaws.services.directory.model.RemoveIpRoutesRequest()
		input.setDirectoryId(this.directoryId)
		input.setCidrIps(this.cidrIps)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.RemoveIpRoutesResult {
	  return com.amazonaws.services.directory.model.RemoveIpRoutesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.RemoveIpRoutesResult {
		return environment.ds.removeIpRoutes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds remove-ip-routes")
				.argument("directory-id", directoryId)
				.argument("cidr-ips", cidrIps.toString())
	}

}


fun AWSDirectoryServiceFunctions.removeTagsFromResource(resourceId: String, tagKeys: List<String>, init: AWSDirectoryServiceRemoveTagsFromResourceCommand.() -> Unit): com.amazonaws.services.directory.model.RemoveTagsFromResourceResult {
	return this.block.declare(AWSDirectoryServiceRemoveTagsFromResourceCommand(resourceId, tagKeys).apply(init)) as com.amazonaws.services.directory.model.RemoveTagsFromResourceResult
}

@Generated
class AWSDirectoryServiceRemoveTagsFromResourceCommand(val resourceId: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest, com.amazonaws.services.directory.model.RemoveTagsFromResourceResult> {



	override fun build(): com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest {
		val input = com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest()
		input.setResourceId(this.resourceId)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.RemoveTagsFromResourceResult {
	  return com.amazonaws.services.directory.model.RemoveTagsFromResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.RemoveTagsFromResourceResult {
		return environment.ds.removeTagsFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds remove-tags-from-resource")
				.argument("resource-id", resourceId)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSDirectoryServiceFunctions.restoreFromSnapshot(snapshotId: String, init: AWSDirectoryServiceRestoreFromSnapshotCommand.() -> Unit): com.amazonaws.services.directory.model.RestoreFromSnapshotResult {
	return this.block.declare(AWSDirectoryServiceRestoreFromSnapshotCommand(snapshotId).apply(init)) as com.amazonaws.services.directory.model.RestoreFromSnapshotResult
}

@Generated
class AWSDirectoryServiceRestoreFromSnapshotCommand(val snapshotId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.RestoreFromSnapshotRequest, com.amazonaws.services.directory.model.RestoreFromSnapshotResult> {



	override fun build(): com.amazonaws.services.directory.model.RestoreFromSnapshotRequest {
		val input = com.amazonaws.services.directory.model.RestoreFromSnapshotRequest()
		input.setSnapshotId(this.snapshotId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.RestoreFromSnapshotResult {
	  return com.amazonaws.services.directory.model.RestoreFromSnapshotResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.RestoreFromSnapshotResult {
		return environment.ds.restoreFromSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds restore-from-snapshot")
				.argument("snapshot-id", snapshotId)
	}

}


fun AWSDirectoryServiceFunctions.startSchemaExtension(directoryId: String, createSnapshotBeforeSchemaExtension: Boolean, ldifContent: String, description: String, init: AWSDirectoryServiceStartSchemaExtensionCommand.() -> Unit): com.amazonaws.services.directory.model.StartSchemaExtensionResult {
	return this.block.declare(AWSDirectoryServiceStartSchemaExtensionCommand(directoryId, createSnapshotBeforeSchemaExtension, ldifContent, description).apply(init)) as com.amazonaws.services.directory.model.StartSchemaExtensionResult
}

@Generated
class AWSDirectoryServiceStartSchemaExtensionCommand(val directoryId: String, val createSnapshotBeforeSchemaExtension: Boolean, val ldifContent: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.StartSchemaExtensionRequest, com.amazonaws.services.directory.model.StartSchemaExtensionResult> {



	override fun build(): com.amazonaws.services.directory.model.StartSchemaExtensionRequest {
		val input = com.amazonaws.services.directory.model.StartSchemaExtensionRequest()
		input.setDirectoryId(this.directoryId)
		input.setCreateSnapshotBeforeSchemaExtension(this.createSnapshotBeforeSchemaExtension)
		input.setLdifContent(this.ldifContent)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.StartSchemaExtensionResult {
	  return com.amazonaws.services.directory.model.StartSchemaExtensionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.StartSchemaExtensionResult {
		return environment.ds.startSchemaExtension(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds start-schema-extension")
				.argument("directory-id", directoryId)
				.option("create-snapshot-before-schema-extension", createSnapshotBeforeSchemaExtension ?: false)
				.argument("ldif-content", ldifContent)
				.argument("description", description)
	}

}


fun AWSDirectoryServiceFunctions.updateConditionalForwarder(directoryId: String, remoteDomainName: String, dnsIpAddrs: List<String>, init: AWSDirectoryServiceUpdateConditionalForwarderCommand.() -> Unit): com.amazonaws.services.directory.model.UpdateConditionalForwarderResult {
	return this.block.declare(AWSDirectoryServiceUpdateConditionalForwarderCommand(directoryId, remoteDomainName, dnsIpAddrs).apply(init)) as com.amazonaws.services.directory.model.UpdateConditionalForwarderResult
}

@Generated
class AWSDirectoryServiceUpdateConditionalForwarderCommand(val directoryId: String, val remoteDomainName: String, val dnsIpAddrs: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest, com.amazonaws.services.directory.model.UpdateConditionalForwarderResult> {



	override fun build(): com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest {
		val input = com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest()
		input.setDirectoryId(this.directoryId)
		input.setRemoteDomainName(this.remoteDomainName)
		input.setDnsIpAddrs(this.dnsIpAddrs)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.UpdateConditionalForwarderResult {
	  return com.amazonaws.services.directory.model.UpdateConditionalForwarderResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.UpdateConditionalForwarderResult {
		return environment.ds.updateConditionalForwarder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds update-conditional-forwarder")
				.argument("directory-id", directoryId)
				.argument("remote-domain-name", remoteDomainName)
				.argument("dns-ip-addrs", dnsIpAddrs.toString())
	}

}


fun AWSDirectoryServiceFunctions.updateNumberOfDomainControllers(directoryId: String, desiredNumber: Int, init: AWSDirectoryServiceUpdateNumberOfDomainControllersCommand.() -> Unit): com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersResult {
	return this.block.declare(AWSDirectoryServiceUpdateNumberOfDomainControllersCommand(directoryId, desiredNumber).apply(init)) as com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersResult
}

@Generated
class AWSDirectoryServiceUpdateNumberOfDomainControllersCommand(val directoryId: String, val desiredNumber: Int) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest, com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersResult> {



	override fun build(): com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest {
		val input = com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest()
		input.setDirectoryId(this.directoryId)
		input.setDesiredNumber(this.desiredNumber)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersResult {
	  return com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersResult {
		return environment.ds.updateNumberOfDomainControllers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds update-number-of-domain-controllers")
				.argument("directory-id", directoryId)
				.argument("desired-number", desiredNumber.toString())
	}

}


fun AWSDirectoryServiceFunctions.updateRadius(directoryId: String, radiusSettings: com.amazonaws.services.directory.model.RadiusSettings, init: AWSDirectoryServiceUpdateRadiusCommand.() -> Unit): com.amazonaws.services.directory.model.UpdateRadiusResult {
	return this.block.declare(AWSDirectoryServiceUpdateRadiusCommand(directoryId, radiusSettings).apply(init)) as com.amazonaws.services.directory.model.UpdateRadiusResult
}

@Generated
class AWSDirectoryServiceUpdateRadiusCommand(val directoryId: String, val radiusSettings: com.amazonaws.services.directory.model.RadiusSettings) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.UpdateRadiusRequest, com.amazonaws.services.directory.model.UpdateRadiusResult> {



	override fun build(): com.amazonaws.services.directory.model.UpdateRadiusRequest {
		val input = com.amazonaws.services.directory.model.UpdateRadiusRequest()
		input.setDirectoryId(this.directoryId)
		input.setRadiusSettings(this.radiusSettings)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.UpdateRadiusResult {
	  return com.amazonaws.services.directory.model.UpdateRadiusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.UpdateRadiusResult {
		return environment.ds.updateRadius(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds update-radius")
				.argument("directory-id", directoryId)
				.argument("radius-settings", radiusSettings.toString())
	}

}


fun AWSDirectoryServiceFunctions.verifyTrust(trustId: String, init: AWSDirectoryServiceVerifyTrustCommand.() -> Unit): com.amazonaws.services.directory.model.VerifyTrustResult {
	return this.block.declare(AWSDirectoryServiceVerifyTrustCommand(trustId).apply(init)) as com.amazonaws.services.directory.model.VerifyTrustResult
}

@Generated
class AWSDirectoryServiceVerifyTrustCommand(val trustId: String) : AmazonWebServiceCommand<com.amazonaws.services.directory.model.VerifyTrustRequest, com.amazonaws.services.directory.model.VerifyTrustResult> {



	override fun build(): com.amazonaws.services.directory.model.VerifyTrustRequest {
		val input = com.amazonaws.services.directory.model.VerifyTrustRequest()
		input.setTrustId(this.trustId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directory.model.VerifyTrustResult {
	  return com.amazonaws.services.directory.model.VerifyTrustResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directory.model.VerifyTrustResult {
		return environment.ds.verifyTrust(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ds verify-trust")
				.argument("trust-id", trustId)
	}

}
