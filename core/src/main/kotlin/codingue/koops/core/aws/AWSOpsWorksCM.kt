
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.opsworkscm.AWSOpsWorksCM
import com.amazonaws.services.opsworkscm.model.*

var codingue.koops.core.Environment.opsworks_cm: AWSOpsWorksCM
	get() = this.capabilities[AWSOpsWorksCM::class.java.name] as AWSOpsWorksCM
	set(opsworks_cm) {
		this.capabilities[AWSOpsWorksCM::class.java.name] = opsworks_cm
	}

@Generated
class AWSOpsWorksCMFunctions(val block: Block)

infix fun AwsContinuation.opsworks_cm(init: AWSOpsWorksCMFunctions.() -> Unit) {
	AWSOpsWorksCMFunctions(shell).apply(init)
}

			

fun AWSOpsWorksCMFunctions.associateNode(serverName: String, nodeName: String, engineAttributes: List<com.amazonaws.services.opsworkscm.model.EngineAttribute>, init: AWSOpsWorksCMAssociateNodeCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCMAssociateNodeCommand(serverName, nodeName, engineAttributes).apply(init))
}

@Generated
class AWSOpsWorksCMAssociateNodeCommand(val serverName: String, val nodeName: String, val engineAttributes: List<com.amazonaws.services.opsworkscm.model.EngineAttribute>) : AmazonWebServiceCommand<com.amazonaws.services.opsworkscm.model.AssociateNodeRequest> {



	override fun build(): com.amazonaws.services.opsworkscm.model.AssociateNodeRequest {
		val input = com.amazonaws.services.opsworkscm.model.AssociateNodeRequest()
		input.setServerName(this.serverName)
		input.setNodeName(this.nodeName)
		input.setEngineAttributes(this.engineAttributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks_cm.associateNode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks-cm associate-node")
				.argument("server-name", serverName)
				.argument("node-name", nodeName)
				.argument("engine-attributes", engineAttributes.toString())
	}

}


fun AWSOpsWorksCMFunctions.createBackup(serverName: String, init: AWSOpsWorksCMCreateBackupCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCMCreateBackupCommand(serverName).apply(init))
}

@Generated
class AWSOpsWorksCMCreateBackupCommand(val serverName: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworkscm.model.CreateBackupRequest> {

	var description: String? = null

	override fun build(): com.amazonaws.services.opsworkscm.model.CreateBackupRequest {
		val input = com.amazonaws.services.opsworkscm.model.CreateBackupRequest()
		input.setServerName(this.serverName)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks_cm.createBackup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks-cm create-backup")
				.argument("server-name", serverName)
				.argument("description", description)
	}

}


fun AWSOpsWorksCMFunctions.createServer(serverName: String, instanceProfileArn: String, instanceType: String, serviceRoleArn: String, init: AWSOpsWorksCMCreateServerCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCMCreateServerCommand(serverName, instanceProfileArn, instanceType, serviceRoleArn).apply(init))
}

@Generated
class AWSOpsWorksCMCreateServerCommand(val serverName: String, val instanceProfileArn: String, val instanceType: String, val serviceRoleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworkscm.model.CreateServerRequest> {

	var associatePublicIpAddress: Boolean? = false
	var disableAutomatedBackup: Boolean? = false
	var engine: String? = null
	var engineModel: String? = null
	var engineVersion: String? = null
	var engineAttributes: List<com.amazonaws.services.opsworkscm.model.EngineAttribute>? = null
	var backupRetentionCount: Int? = 0
	var keyPair: String? = null
	var preferredMaintenanceWindow: String? = null
	var preferredBackupWindow: String? = null
	var securityGroupIds: List<String>? = null
	var subnetIds: List<String>? = null
	var backupId: String? = null

	override fun build(): com.amazonaws.services.opsworkscm.model.CreateServerRequest {
		val input = com.amazonaws.services.opsworkscm.model.CreateServerRequest()
		input.setAssociatePublicIpAddress(this.associatePublicIpAddress)
		input.setDisableAutomatedBackup(this.disableAutomatedBackup)
		input.setEngine(this.engine)
		input.setEngineModel(this.engineModel)
		input.setEngineVersion(this.engineVersion)
		input.setEngineAttributes(this.engineAttributes)
		input.setBackupRetentionCount(this.backupRetentionCount)
		input.setServerName(this.serverName)
		input.setInstanceProfileArn(this.instanceProfileArn)
		input.setInstanceType(this.instanceType)
		input.setKeyPair(this.keyPair)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setPreferredBackupWindow(this.preferredBackupWindow)
		input.setSecurityGroupIds(this.securityGroupIds)
		input.setServiceRoleArn(this.serviceRoleArn)
		input.setSubnetIds(this.subnetIds)
		input.setBackupId(this.backupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks_cm.createServer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks-cm create-server")
				.option("associate-public-ip-address", associatePublicIpAddress ?: false)
				.option("disable-automated-backup", disableAutomatedBackup ?: false)
				.argument("engine", engine)
				.argument("engine-model", engineModel)
				.argument("engine-version", engineVersion)
				.argument("engine-attributes", engineAttributes?.toString())
				.argument("backup-retention-count", backupRetentionCount?.toString())
				.argument("server-name", serverName)
				.argument("instance-profile-arn", instanceProfileArn)
				.argument("instance-type", instanceType)
				.argument("key-pair", keyPair)
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.argument("preferred-backup-window", preferredBackupWindow)
				.argument("security-group-ids", securityGroupIds?.toString())
				.argument("service-role-arn", serviceRoleArn)
				.argument("subnet-ids", subnetIds?.toString())
				.argument("backup-id", backupId)
	}

}


fun AWSOpsWorksCMFunctions.deleteBackup(backupId: String, init: AWSOpsWorksCMDeleteBackupCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCMDeleteBackupCommand(backupId).apply(init))
}

@Generated
class AWSOpsWorksCMDeleteBackupCommand(val backupId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworkscm.model.DeleteBackupRequest> {



	override fun build(): com.amazonaws.services.opsworkscm.model.DeleteBackupRequest {
		val input = com.amazonaws.services.opsworkscm.model.DeleteBackupRequest()
		input.setBackupId(this.backupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks_cm.deleteBackup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks-cm delete-backup")
				.argument("backup-id", backupId)
	}

}


fun AWSOpsWorksCMFunctions.deleteServer(serverName: String, init: AWSOpsWorksCMDeleteServerCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCMDeleteServerCommand(serverName).apply(init))
}

@Generated
class AWSOpsWorksCMDeleteServerCommand(val serverName: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworkscm.model.DeleteServerRequest> {



	override fun build(): com.amazonaws.services.opsworkscm.model.DeleteServerRequest {
		val input = com.amazonaws.services.opsworkscm.model.DeleteServerRequest()
		input.setServerName(this.serverName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks_cm.deleteServer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks-cm delete-server")
				.argument("server-name", serverName)
	}

}


fun AWSOpsWorksCMFunctions.describeAccountAttributes(init: AWSOpsWorksCMDescribeAccountAttributesCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCMDescribeAccountAttributesCommand().apply(init))
}

@Generated
class AWSOpsWorksCMDescribeAccountAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest> {



	override fun build(): com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest {
		val input = com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks_cm.describeAccountAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks-cm describe-account-attributes")

	}

}


fun AWSOpsWorksCMFunctions.describeBackups(init: AWSOpsWorksCMDescribeBackupsCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCMDescribeBackupsCommand().apply(init))
}

@Generated
class AWSOpsWorksCMDescribeBackupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest> {

	var backupId: String? = null
	var serverName: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest {
		val input = com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest()
		input.setBackupId(this.backupId)
		input.setServerName(this.serverName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks_cm.describeBackups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks-cm describe-backups")
				.argument("backup-id", backupId)
				.argument("server-name", serverName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOpsWorksCMFunctions.describeEvents(serverName: String, init: AWSOpsWorksCMDescribeEventsCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCMDescribeEventsCommand(serverName).apply(init))
}

@Generated
class AWSOpsWorksCMDescribeEventsCommand(val serverName: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworkscm.model.DescribeEventsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.opsworkscm.model.DescribeEventsRequest {
		val input = com.amazonaws.services.opsworkscm.model.DescribeEventsRequest()
		input.setServerName(this.serverName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks_cm.describeEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks-cm describe-events")
				.argument("server-name", serverName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOpsWorksCMFunctions.describeNodeAssociationStatus(nodeAssociationStatusToken: String, serverName: String, init: AWSOpsWorksCMDescribeNodeAssociationStatusCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCMDescribeNodeAssociationStatusCommand(nodeAssociationStatusToken, serverName).apply(init))
}

@Generated
class AWSOpsWorksCMDescribeNodeAssociationStatusCommand(val nodeAssociationStatusToken: String, val serverName: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest> {



	override fun build(): com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest {
		val input = com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest()
		input.setNodeAssociationStatusToken(this.nodeAssociationStatusToken)
		input.setServerName(this.serverName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks_cm.describeNodeAssociationStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks-cm describe-node-association-status")
				.argument("node-association-status-token", nodeAssociationStatusToken)
				.argument("server-name", serverName)
	}

}


fun AWSOpsWorksCMFunctions.describeServers(init: AWSOpsWorksCMDescribeServersCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCMDescribeServersCommand().apply(init))
}

@Generated
class AWSOpsWorksCMDescribeServersCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworkscm.model.DescribeServersRequest> {

	var serverName: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.opsworkscm.model.DescribeServersRequest {
		val input = com.amazonaws.services.opsworkscm.model.DescribeServersRequest()
		input.setServerName(this.serverName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks_cm.describeServers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks-cm describe-servers")
				.argument("server-name", serverName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOpsWorksCMFunctions.disassociateNode(serverName: String, nodeName: String, init: AWSOpsWorksCMDisassociateNodeCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCMDisassociateNodeCommand(serverName, nodeName).apply(init))
}

@Generated
class AWSOpsWorksCMDisassociateNodeCommand(val serverName: String, val nodeName: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest> {

	var engineAttributes: List<com.amazonaws.services.opsworkscm.model.EngineAttribute>? = null

	override fun build(): com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest {
		val input = com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest()
		input.setServerName(this.serverName)
		input.setNodeName(this.nodeName)
		input.setEngineAttributes(this.engineAttributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks_cm.disassociateNode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks-cm disassociate-node")
				.argument("server-name", serverName)
				.argument("node-name", nodeName)
				.argument("engine-attributes", engineAttributes?.toString())
	}

}


fun AWSOpsWorksCMFunctions.restoreServer(backupId: String, serverName: String, init: AWSOpsWorksCMRestoreServerCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCMRestoreServerCommand(backupId, serverName).apply(init))
}

@Generated
class AWSOpsWorksCMRestoreServerCommand(val backupId: String, val serverName: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworkscm.model.RestoreServerRequest> {

	var instanceType: String? = null
	var keyPair: String? = null

	override fun build(): com.amazonaws.services.opsworkscm.model.RestoreServerRequest {
		val input = com.amazonaws.services.opsworkscm.model.RestoreServerRequest()
		input.setBackupId(this.backupId)
		input.setServerName(this.serverName)
		input.setInstanceType(this.instanceType)
		input.setKeyPair(this.keyPair)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks_cm.restoreServer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks-cm restore-server")
				.argument("backup-id", backupId)
				.argument("server-name", serverName)
				.argument("instance-type", instanceType)
				.argument("key-pair", keyPair)
	}

}


fun AWSOpsWorksCMFunctions.startMaintenance(serverName: String, init: AWSOpsWorksCMStartMaintenanceCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCMStartMaintenanceCommand(serverName).apply(init))
}

@Generated
class AWSOpsWorksCMStartMaintenanceCommand(val serverName: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest> {

	var engineAttributes: List<com.amazonaws.services.opsworkscm.model.EngineAttribute>? = null

	override fun build(): com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest {
		val input = com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest()
		input.setServerName(this.serverName)
		input.setEngineAttributes(this.engineAttributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks_cm.startMaintenance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks-cm start-maintenance")
				.argument("server-name", serverName)
				.argument("engine-attributes", engineAttributes?.toString())
	}

}


fun AWSOpsWorksCMFunctions.updateServer(serverName: String, init: AWSOpsWorksCMUpdateServerCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCMUpdateServerCommand(serverName).apply(init))
}

@Generated
class AWSOpsWorksCMUpdateServerCommand(val serverName: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworkscm.model.UpdateServerRequest> {

	var disableAutomatedBackup: Boolean? = false
	var backupRetentionCount: Int? = 0
	var preferredMaintenanceWindow: String? = null
	var preferredBackupWindow: String? = null

	override fun build(): com.amazonaws.services.opsworkscm.model.UpdateServerRequest {
		val input = com.amazonaws.services.opsworkscm.model.UpdateServerRequest()
		input.setDisableAutomatedBackup(this.disableAutomatedBackup)
		input.setBackupRetentionCount(this.backupRetentionCount)
		input.setServerName(this.serverName)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setPreferredBackupWindow(this.preferredBackupWindow)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks_cm.updateServer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks-cm update-server")
				.option("disable-automated-backup", disableAutomatedBackup ?: false)
				.argument("backup-retention-count", backupRetentionCount?.toString())
				.argument("server-name", serverName)
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.argument("preferred-backup-window", preferredBackupWindow)
	}

}


fun AWSOpsWorksCMFunctions.updateServerEngineAttributes(serverName: String, attributeName: String, init: AWSOpsWorksCMUpdateServerEngineAttributesCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCMUpdateServerEngineAttributesCommand(serverName, attributeName).apply(init))
}

@Generated
class AWSOpsWorksCMUpdateServerEngineAttributesCommand(val serverName: String, val attributeName: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest> {

	var attributeValue: String? = null

	override fun build(): com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest {
		val input = com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest()
		input.setServerName(this.serverName)
		input.setAttributeName(this.attributeName)
		input.setAttributeValue(this.attributeValue)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks_cm.updateServerEngineAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks-cm update-server-engine-attributes")
				.argument("server-name", serverName)
				.argument("attribute-name", attributeName)
				.argument("attribute-value", attributeValue)
	}

}
