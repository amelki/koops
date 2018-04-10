
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.rds.AmazonRDS
import com.amazonaws.services.rds.model.*

var codingue.koops.core.Environment.rds: AmazonRDS
	get() = this.capabilities[AmazonRDS::class.java.name] as AmazonRDS
	set(rds) {
		this.capabilities[AmazonRDS::class.java.name] = rds
	}

@Generated
class AmazonRDSFunctions(val block: Block)

infix fun AwsContinuation.rds(init: AmazonRDSFunctions.() -> Unit) {
	AmazonRDSFunctions(shell).apply(init)
}

			

fun AmazonRDSFunctions.addRoleToDBCluster(dBClusterIdentifier: String, roleArn: String, init: AmazonRDSAddRoleToDBClusterCommand.() -> Unit) {
	this.block.declare(AmazonRDSAddRoleToDBClusterCommand(dBClusterIdentifier, roleArn).apply(init))
}

@Generated
class AmazonRDSAddRoleToDBClusterCommand(val dBClusterIdentifier: String, val roleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.AddRoleToDBClusterRequest> {



	override fun build(): com.amazonaws.services.rds.model.AddRoleToDBClusterRequest {
		val input = com.amazonaws.services.rds.model.AddRoleToDBClusterRequest()
		input.setDBClusterIdentifier(this.dBClusterIdentifier)
		input.setRoleArn(this.roleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.addRoleToDBCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds add-role-to-dbcluster")
				.argument("dbcluster-identifier", dBClusterIdentifier)
				.argument("role-arn", roleArn)
	}

}


fun AmazonRDSFunctions.addSourceIdentifierToSubscription(subscriptionName: String, sourceIdentifier: String, init: AmazonRDSAddSourceIdentifierToSubscriptionCommand.() -> Unit) {
	this.block.declare(AmazonRDSAddSourceIdentifierToSubscriptionCommand(subscriptionName, sourceIdentifier).apply(init))
}

@Generated
class AmazonRDSAddSourceIdentifierToSubscriptionCommand(val subscriptionName: String, val sourceIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.AddSourceIdentifierToSubscriptionRequest> {



	override fun build(): com.amazonaws.services.rds.model.AddSourceIdentifierToSubscriptionRequest {
		val input = com.amazonaws.services.rds.model.AddSourceIdentifierToSubscriptionRequest()
		input.setSubscriptionName(this.subscriptionName)
		input.setSourceIdentifier(this.sourceIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.addSourceIdentifierToSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds add-source-identifier-to-subscription")
				.argument("subscription-name", subscriptionName)
				.argument("source-identifier", sourceIdentifier)
	}

}


fun AmazonRDSFunctions.addTagsToResource(resourceName: String, tags: List<com.amazonaws.services.rds.model.Tag>, init: AmazonRDSAddTagsToResourceCommand.() -> Unit) {
	this.block.declare(AmazonRDSAddTagsToResourceCommand(resourceName, tags).apply(init))
}

@Generated
class AmazonRDSAddTagsToResourceCommand(val resourceName: String, val tags: List<com.amazonaws.services.rds.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.AddTagsToResourceRequest> {



	override fun build(): com.amazonaws.services.rds.model.AddTagsToResourceRequest {
		val input = com.amazonaws.services.rds.model.AddTagsToResourceRequest()
		input.setResourceName(this.resourceName)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.addTagsToResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds add-tags-to-resource")
				.argument("resource-name", resourceName)
				.argument("tags", tags.toString())
	}

}


fun AmazonRDSFunctions.applyPendingMaintenanceAction(resourceIdentifier: String, applyAction: String, optInType: String, init: AmazonRDSApplyPendingMaintenanceActionCommand.() -> Unit) {
	this.block.declare(AmazonRDSApplyPendingMaintenanceActionCommand(resourceIdentifier, applyAction, optInType).apply(init))
}

@Generated
class AmazonRDSApplyPendingMaintenanceActionCommand(val resourceIdentifier: String, val applyAction: String, val optInType: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.ApplyPendingMaintenanceActionRequest> {



	override fun build(): com.amazonaws.services.rds.model.ApplyPendingMaintenanceActionRequest {
		val input = com.amazonaws.services.rds.model.ApplyPendingMaintenanceActionRequest()
		input.setResourceIdentifier(this.resourceIdentifier)
		input.setApplyAction(this.applyAction)
		input.setOptInType(this.optInType)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.applyPendingMaintenanceAction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds apply-pending-maintenance-action")
				.argument("resource-identifier", resourceIdentifier)
				.argument("apply-action", applyAction)
				.argument("opt-in-type", optInType)
	}

}


fun AmazonRDSFunctions.authorizeDBSecurityGroupIngress(dBSecurityGroupName: String, init: AmazonRDSAuthorizeDBSecurityGroupIngressCommand.() -> Unit) {
	this.block.declare(AmazonRDSAuthorizeDBSecurityGroupIngressCommand(dBSecurityGroupName).apply(init))
}

@Generated
class AmazonRDSAuthorizeDBSecurityGroupIngressCommand(val dBSecurityGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.AuthorizeDBSecurityGroupIngressRequest> {

	var cIDRIP: String? = null
	var eC2SecurityGroupName: String? = null
	var eC2SecurityGroupId: String? = null
	var eC2SecurityGroupOwnerId: String? = null

	override fun build(): com.amazonaws.services.rds.model.AuthorizeDBSecurityGroupIngressRequest {
		val input = com.amazonaws.services.rds.model.AuthorizeDBSecurityGroupIngressRequest()
		input.setDBSecurityGroupName(this.dBSecurityGroupName)
		input.setCIDRIP(this.cIDRIP)
		input.setEC2SecurityGroupName(this.eC2SecurityGroupName)
		input.setEC2SecurityGroupId(this.eC2SecurityGroupId)
		input.setEC2SecurityGroupOwnerId(this.eC2SecurityGroupOwnerId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.authorizeDBSecurityGroupIngress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds authorize-dbsecurity-group-ingress")
				.argument("dbsecurity-group-name", dBSecurityGroupName)
				.argument("cidrip", cIDRIP)
				.argument("ec2-security-group-name", eC2SecurityGroupName)
				.argument("ec2-security-group-id", eC2SecurityGroupId)
				.argument("ec2-security-group-owner-id", eC2SecurityGroupOwnerId)
	}

}


fun AmazonRDSFunctions.copyDBClusterParameterGroup(sourceDBClusterParameterGroupIdentifier: String, targetDBClusterParameterGroupIdentifier: String, targetDBClusterParameterGroupDescription: String, init: AmazonRDSCopyDBClusterParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSCopyDBClusterParameterGroupCommand(sourceDBClusterParameterGroupIdentifier, targetDBClusterParameterGroupIdentifier, targetDBClusterParameterGroupDescription).apply(init))
}

@Generated
class AmazonRDSCopyDBClusterParameterGroupCommand(val sourceDBClusterParameterGroupIdentifier: String, val targetDBClusterParameterGroupIdentifier: String, val targetDBClusterParameterGroupDescription: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.CopyDBClusterParameterGroupRequest> {

	var tags: List<com.amazonaws.services.rds.model.Tag>? = null

	override fun build(): com.amazonaws.services.rds.model.CopyDBClusterParameterGroupRequest {
		val input = com.amazonaws.services.rds.model.CopyDBClusterParameterGroupRequest()
		input.setSourceDBClusterParameterGroupIdentifier(this.sourceDBClusterParameterGroupIdentifier)
		input.setTargetDBClusterParameterGroupIdentifier(this.targetDBClusterParameterGroupIdentifier)
		input.setTargetDBClusterParameterGroupDescription(this.targetDBClusterParameterGroupDescription)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.copyDBClusterParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds copy-dbcluster-parameter-group")
				.argument("source-dbcluster-parameter-group-identifier", sourceDBClusterParameterGroupIdentifier)
				.argument("target-dbcluster-parameter-group-identifier", targetDBClusterParameterGroupIdentifier)
				.argument("target-dbcluster-parameter-group-description", targetDBClusterParameterGroupDescription)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRDSFunctions.copyDBClusterSnapshot(sourceDBClusterSnapshotIdentifier: String, targetDBClusterSnapshotIdentifier: String, init: AmazonRDSCopyDBClusterSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonRDSCopyDBClusterSnapshotCommand(sourceDBClusterSnapshotIdentifier, targetDBClusterSnapshotIdentifier).apply(init))
}

@Generated
class AmazonRDSCopyDBClusterSnapshotCommand(val sourceDBClusterSnapshotIdentifier: String, val targetDBClusterSnapshotIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.CopyDBClusterSnapshotRequest> {

	var kmsKeyId: String? = null
	var preSignedUrl: String? = null
	var copyTags: Boolean? = false
	var tags: List<com.amazonaws.services.rds.model.Tag>? = null
	var sourceRegion: String? = null

	override fun build(): com.amazonaws.services.rds.model.CopyDBClusterSnapshotRequest {
		val input = com.amazonaws.services.rds.model.CopyDBClusterSnapshotRequest()
		input.setSourceDBClusterSnapshotIdentifier(this.sourceDBClusterSnapshotIdentifier)
		input.setTargetDBClusterSnapshotIdentifier(this.targetDBClusterSnapshotIdentifier)
		input.setKmsKeyId(this.kmsKeyId)
		input.setPreSignedUrl(this.preSignedUrl)
		input.setCopyTags(this.copyTags)
		input.setTags(this.tags)
		input.setSourceRegion(this.sourceRegion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.copyDBClusterSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds copy-dbcluster-snapshot")
				.argument("source-dbcluster-snapshot-identifier", sourceDBClusterSnapshotIdentifier)
				.argument("target-dbcluster-snapshot-identifier", targetDBClusterSnapshotIdentifier)
				.argument("kms-key-id", kmsKeyId)
				.argument("pre-signed-url", preSignedUrl)
				.option("copy-tags", copyTags ?: false)
				.argument("tags", tags?.toString())
				.argument("source-region", sourceRegion)
	}

}


fun AmazonRDSFunctions.copyDBParameterGroup(sourceDBParameterGroupIdentifier: String, targetDBParameterGroupIdentifier: String, targetDBParameterGroupDescription: String, init: AmazonRDSCopyDBParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSCopyDBParameterGroupCommand(sourceDBParameterGroupIdentifier, targetDBParameterGroupIdentifier, targetDBParameterGroupDescription).apply(init))
}

@Generated
class AmazonRDSCopyDBParameterGroupCommand(val sourceDBParameterGroupIdentifier: String, val targetDBParameterGroupIdentifier: String, val targetDBParameterGroupDescription: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.CopyDBParameterGroupRequest> {

	var tags: List<com.amazonaws.services.rds.model.Tag>? = null

	override fun build(): com.amazonaws.services.rds.model.CopyDBParameterGroupRequest {
		val input = com.amazonaws.services.rds.model.CopyDBParameterGroupRequest()
		input.setSourceDBParameterGroupIdentifier(this.sourceDBParameterGroupIdentifier)
		input.setTargetDBParameterGroupIdentifier(this.targetDBParameterGroupIdentifier)
		input.setTargetDBParameterGroupDescription(this.targetDBParameterGroupDescription)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.copyDBParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds copy-dbparameter-group")
				.argument("source-dbparameter-group-identifier", sourceDBParameterGroupIdentifier)
				.argument("target-dbparameter-group-identifier", targetDBParameterGroupIdentifier)
				.argument("target-dbparameter-group-description", targetDBParameterGroupDescription)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRDSFunctions.copyDBSnapshot(sourceDBSnapshotIdentifier: String, targetDBSnapshotIdentifier: String, init: AmazonRDSCopyDBSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonRDSCopyDBSnapshotCommand(sourceDBSnapshotIdentifier, targetDBSnapshotIdentifier).apply(init))
}

@Generated
class AmazonRDSCopyDBSnapshotCommand(val sourceDBSnapshotIdentifier: String, val targetDBSnapshotIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.CopyDBSnapshotRequest> {

	var kmsKeyId: String? = null
	var tags: List<com.amazonaws.services.rds.model.Tag>? = null
	var copyTags: Boolean? = false
	var preSignedUrl: String? = null
	var optionGroupName: String? = null
	var sourceRegion: String? = null

	override fun build(): com.amazonaws.services.rds.model.CopyDBSnapshotRequest {
		val input = com.amazonaws.services.rds.model.CopyDBSnapshotRequest()
		input.setSourceDBSnapshotIdentifier(this.sourceDBSnapshotIdentifier)
		input.setTargetDBSnapshotIdentifier(this.targetDBSnapshotIdentifier)
		input.setKmsKeyId(this.kmsKeyId)
		input.setTags(this.tags)
		input.setCopyTags(this.copyTags)
		input.setPreSignedUrl(this.preSignedUrl)
		input.setOptionGroupName(this.optionGroupName)
		input.setSourceRegion(this.sourceRegion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.copyDBSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds copy-dbsnapshot")
				.argument("source-dbsnapshot-identifier", sourceDBSnapshotIdentifier)
				.argument("target-dbsnapshot-identifier", targetDBSnapshotIdentifier)
				.argument("kms-key-id", kmsKeyId)
				.argument("tags", tags?.toString())
				.option("copy-tags", copyTags ?: false)
				.argument("pre-signed-url", preSignedUrl)
				.argument("option-group-name", optionGroupName)
				.argument("source-region", sourceRegion)
	}

}


fun AmazonRDSFunctions.copyOptionGroup(sourceOptionGroupIdentifier: String, targetOptionGroupIdentifier: String, targetOptionGroupDescription: String, init: AmazonRDSCopyOptionGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSCopyOptionGroupCommand(sourceOptionGroupIdentifier, targetOptionGroupIdentifier, targetOptionGroupDescription).apply(init))
}

@Generated
class AmazonRDSCopyOptionGroupCommand(val sourceOptionGroupIdentifier: String, val targetOptionGroupIdentifier: String, val targetOptionGroupDescription: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.CopyOptionGroupRequest> {

	var tags: List<com.amazonaws.services.rds.model.Tag>? = null

	override fun build(): com.amazonaws.services.rds.model.CopyOptionGroupRequest {
		val input = com.amazonaws.services.rds.model.CopyOptionGroupRequest()
		input.setSourceOptionGroupIdentifier(this.sourceOptionGroupIdentifier)
		input.setTargetOptionGroupIdentifier(this.targetOptionGroupIdentifier)
		input.setTargetOptionGroupDescription(this.targetOptionGroupDescription)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.copyOptionGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds copy-option-group")
				.argument("source-option-group-identifier", sourceOptionGroupIdentifier)
				.argument("target-option-group-identifier", targetOptionGroupIdentifier)
				.argument("target-option-group-description", targetOptionGroupDescription)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRDSFunctions.createDBCluster(dBClusterIdentifier: String, engine: String, init: AmazonRDSCreateDBClusterCommand.() -> Unit) {
	this.block.declare(AmazonRDSCreateDBClusterCommand(dBClusterIdentifier, engine).apply(init))
}

@Generated
class AmazonRDSCreateDBClusterCommand(val dBClusterIdentifier: String, val engine: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.CreateDBClusterRequest> {

	var availabilityZones: List<String>? = null
	var backupRetentionPeriod: Int? = 0
	var characterSetName: String? = null
	var databaseName: String? = null
	var dBClusterParameterGroupName: String? = null
	var vpcSecurityGroupIds: List<String>? = null
	var dBSubnetGroupName: String? = null
	var engineVersion: String? = null
	var port: Int? = 0
	var masterUsername: String? = null
	var masterUserPassword: String? = null
	var optionGroupName: String? = null
	var preferredBackupWindow: String? = null
	var preferredMaintenanceWindow: String? = null
	var replicationSourceIdentifier: String? = null
	var tags: List<com.amazonaws.services.rds.model.Tag>? = null
	var storageEncrypted: Boolean? = false
	var kmsKeyId: String? = null
	var preSignedUrl: String? = null
	var enableIAMDatabaseAuthentication: Boolean? = false
	var sourceRegion: String? = null

	override fun build(): com.amazonaws.services.rds.model.CreateDBClusterRequest {
		val input = com.amazonaws.services.rds.model.CreateDBClusterRequest()
		input.setAvailabilityZones(this.availabilityZones)
		input.setBackupRetentionPeriod(this.backupRetentionPeriod)
		input.setCharacterSetName(this.characterSetName)
		input.setDatabaseName(this.databaseName)
		input.setDBClusterIdentifier(this.dBClusterIdentifier)
		input.setDBClusterParameterGroupName(this.dBClusterParameterGroupName)
		input.setVpcSecurityGroupIds(this.vpcSecurityGroupIds)
		input.setDBSubnetGroupName(this.dBSubnetGroupName)
		input.setEngine(this.engine)
		input.setEngineVersion(this.engineVersion)
		input.setPort(this.port)
		input.setMasterUsername(this.masterUsername)
		input.setMasterUserPassword(this.masterUserPassword)
		input.setOptionGroupName(this.optionGroupName)
		input.setPreferredBackupWindow(this.preferredBackupWindow)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setReplicationSourceIdentifier(this.replicationSourceIdentifier)
		input.setTags(this.tags)
		input.setStorageEncrypted(this.storageEncrypted)
		input.setKmsKeyId(this.kmsKeyId)
		input.setPreSignedUrl(this.preSignedUrl)
		input.setEnableIAMDatabaseAuthentication(this.enableIAMDatabaseAuthentication)
		input.setSourceRegion(this.sourceRegion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.createDBCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds create-dbcluster")
				.argument("availability-zones", availabilityZones?.toString())
				.argument("backup-retention-period", backupRetentionPeriod?.toString())
				.argument("character-set-name", characterSetName)
				.argument("database-name", databaseName)
				.argument("dbcluster-identifier", dBClusterIdentifier)
				.argument("dbcluster-parameter-group-name", dBClusterParameterGroupName)
				.argument("vpc-security-group-ids", vpcSecurityGroupIds?.toString())
				.argument("dbsubnet-group-name", dBSubnetGroupName)
				.argument("engine", engine)
				.argument("engine-version", engineVersion)
				.argument("port", port?.toString())
				.argument("master-username", masterUsername)
				.argument("master-user-password", masterUserPassword)
				.argument("option-group-name", optionGroupName)
				.argument("preferred-backup-window", preferredBackupWindow)
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.argument("replication-source-identifier", replicationSourceIdentifier)
				.argument("tags", tags?.toString())
				.option("storage-encrypted", storageEncrypted ?: false)
				.argument("kms-key-id", kmsKeyId)
				.argument("pre-signed-url", preSignedUrl)
				.option("enable-iamdatabase-authentication", enableIAMDatabaseAuthentication ?: false)
				.argument("source-region", sourceRegion)
	}

}


fun AmazonRDSFunctions.createDBClusterParameterGroup(dBClusterParameterGroupName: String, dBParameterGroupFamily: String, description: String, init: AmazonRDSCreateDBClusterParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSCreateDBClusterParameterGroupCommand(dBClusterParameterGroupName, dBParameterGroupFamily, description).apply(init))
}

@Generated
class AmazonRDSCreateDBClusterParameterGroupCommand(val dBClusterParameterGroupName: String, val dBParameterGroupFamily: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.CreateDBClusterParameterGroupRequest> {

	var tags: List<com.amazonaws.services.rds.model.Tag>? = null

	override fun build(): com.amazonaws.services.rds.model.CreateDBClusterParameterGroupRequest {
		val input = com.amazonaws.services.rds.model.CreateDBClusterParameterGroupRequest()
		input.setDBClusterParameterGroupName(this.dBClusterParameterGroupName)
		input.setDBParameterGroupFamily(this.dBParameterGroupFamily)
		input.setDescription(this.description)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.createDBClusterParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds create-dbcluster-parameter-group")
				.argument("dbcluster-parameter-group-name", dBClusterParameterGroupName)
				.argument("dbparameter-group-family", dBParameterGroupFamily)
				.argument("description", description)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRDSFunctions.createDBClusterSnapshot(dBClusterSnapshotIdentifier: String, dBClusterIdentifier: String, init: AmazonRDSCreateDBClusterSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonRDSCreateDBClusterSnapshotCommand(dBClusterSnapshotIdentifier, dBClusterIdentifier).apply(init))
}

@Generated
class AmazonRDSCreateDBClusterSnapshotCommand(val dBClusterSnapshotIdentifier: String, val dBClusterIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.CreateDBClusterSnapshotRequest> {

	var tags: List<com.amazonaws.services.rds.model.Tag>? = null

	override fun build(): com.amazonaws.services.rds.model.CreateDBClusterSnapshotRequest {
		val input = com.amazonaws.services.rds.model.CreateDBClusterSnapshotRequest()
		input.setDBClusterSnapshotIdentifier(this.dBClusterSnapshotIdentifier)
		input.setDBClusterIdentifier(this.dBClusterIdentifier)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.createDBClusterSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds create-dbcluster-snapshot")
				.argument("dbcluster-snapshot-identifier", dBClusterSnapshotIdentifier)
				.argument("dbcluster-identifier", dBClusterIdentifier)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRDSFunctions.createDBInstance(dBInstanceIdentifier: String, dBInstanceClass: String, engine: String, init: AmazonRDSCreateDBInstanceCommand.() -> Unit) {
	this.block.declare(AmazonRDSCreateDBInstanceCommand(dBInstanceIdentifier, dBInstanceClass, engine).apply(init))
}

@Generated
class AmazonRDSCreateDBInstanceCommand(val dBInstanceIdentifier: String, val dBInstanceClass: String, val engine: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.CreateDBInstanceRequest> {

	var dBName: String? = null
	var allocatedStorage: Int? = 0
	var masterUsername: String? = null
	var masterUserPassword: String? = null
	var dBSecurityGroups: List<String>? = null
	var vpcSecurityGroupIds: List<String>? = null
	var availabilityZone: String? = null
	var dBSubnetGroupName: String? = null
	var preferredMaintenanceWindow: String? = null
	var dBParameterGroupName: String? = null
	var backupRetentionPeriod: Int? = 0
	var preferredBackupWindow: String? = null
	var port: Int? = 0
	var multiAZ: Boolean? = false
	var engineVersion: String? = null
	var autoMinorVersionUpgrade: Boolean? = false
	var licenseModel: String? = null
	var iops: Int? = 0
	var optionGroupName: String? = null
	var characterSetName: String? = null
	var publiclyAccessible: Boolean? = false
	var tags: List<com.amazonaws.services.rds.model.Tag>? = null
	var dBClusterIdentifier: String? = null
	var storageType: String? = null
	var tdeCredentialArn: String? = null
	var tdeCredentialPassword: String? = null
	var storageEncrypted: Boolean? = false
	var kmsKeyId: String? = null
	var domain: String? = null
	var copyTagsToSnapshot: Boolean? = false
	var monitoringInterval: Int? = 0
	var monitoringRoleArn: String? = null
	var domainIAMRoleName: String? = null
	var promotionTier: Int? = 0
	var timezone: String? = null
	var enableIAMDatabaseAuthentication: Boolean? = false
	var enablePerformanceInsights: Boolean? = false
	var performanceInsightsKMSKeyId: String? = null
	var enableCloudwatchLogsExports: List<String>? = null

	override fun build(): com.amazonaws.services.rds.model.CreateDBInstanceRequest {
		val input = com.amazonaws.services.rds.model.CreateDBInstanceRequest()
		input.setDBName(this.dBName)
		input.setDBInstanceIdentifier(this.dBInstanceIdentifier)
		input.setAllocatedStorage(this.allocatedStorage)
		input.setDBInstanceClass(this.dBInstanceClass)
		input.setEngine(this.engine)
		input.setMasterUsername(this.masterUsername)
		input.setMasterUserPassword(this.masterUserPassword)
		input.setDBSecurityGroups(this.dBSecurityGroups)
		input.setVpcSecurityGroupIds(this.vpcSecurityGroupIds)
		input.setAvailabilityZone(this.availabilityZone)
		input.setDBSubnetGroupName(this.dBSubnetGroupName)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setDBParameterGroupName(this.dBParameterGroupName)
		input.setBackupRetentionPeriod(this.backupRetentionPeriod)
		input.setPreferredBackupWindow(this.preferredBackupWindow)
		input.setPort(this.port)
		input.setMultiAZ(this.multiAZ)
		input.setEngineVersion(this.engineVersion)
		input.setAutoMinorVersionUpgrade(this.autoMinorVersionUpgrade)
		input.setLicenseModel(this.licenseModel)
		input.setIops(this.iops)
		input.setOptionGroupName(this.optionGroupName)
		input.setCharacterSetName(this.characterSetName)
		input.setPubliclyAccessible(this.publiclyAccessible)
		input.setTags(this.tags)
		input.setDBClusterIdentifier(this.dBClusterIdentifier)
		input.setStorageType(this.storageType)
		input.setTdeCredentialArn(this.tdeCredentialArn)
		input.setTdeCredentialPassword(this.tdeCredentialPassword)
		input.setStorageEncrypted(this.storageEncrypted)
		input.setKmsKeyId(this.kmsKeyId)
		input.setDomain(this.domain)
		input.setCopyTagsToSnapshot(this.copyTagsToSnapshot)
		input.setMonitoringInterval(this.monitoringInterval)
		input.setMonitoringRoleArn(this.monitoringRoleArn)
		input.setDomainIAMRoleName(this.domainIAMRoleName)
		input.setPromotionTier(this.promotionTier)
		input.setTimezone(this.timezone)
		input.setEnableIAMDatabaseAuthentication(this.enableIAMDatabaseAuthentication)
		input.setEnablePerformanceInsights(this.enablePerformanceInsights)
		input.setPerformanceInsightsKMSKeyId(this.performanceInsightsKMSKeyId)
		input.setEnableCloudwatchLogsExports(this.enableCloudwatchLogsExports)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.createDBInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds create-dbinstance")
				.argument("dbname", dBName)
				.argument("dbinstance-identifier", dBInstanceIdentifier)
				.argument("allocated-storage", allocatedStorage?.toString())
				.argument("dbinstance-class", dBInstanceClass)
				.argument("engine", engine)
				.argument("master-username", masterUsername)
				.argument("master-user-password", masterUserPassword)
				.argument("dbsecurity-groups", dBSecurityGroups?.toString())
				.argument("vpc-security-group-ids", vpcSecurityGroupIds?.toString())
				.argument("availability-zone", availabilityZone)
				.argument("dbsubnet-group-name", dBSubnetGroupName)
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.argument("dbparameter-group-name", dBParameterGroupName)
				.argument("backup-retention-period", backupRetentionPeriod?.toString())
				.argument("preferred-backup-window", preferredBackupWindow)
				.argument("port", port?.toString())
				.option("multi-az", multiAZ ?: false)
				.argument("engine-version", engineVersion)
				.option("auto-minor-version-upgrade", autoMinorVersionUpgrade ?: false)
				.argument("license-model", licenseModel)
				.argument("iops", iops?.toString())
				.argument("option-group-name", optionGroupName)
				.argument("character-set-name", characterSetName)
				.option("publicly-accessible", publiclyAccessible ?: false)
				.argument("tags", tags?.toString())
				.argument("dbcluster-identifier", dBClusterIdentifier)
				.argument("storage-type", storageType)
				.argument("tde-credential-arn", tdeCredentialArn)
				.argument("tde-credential-password", tdeCredentialPassword)
				.option("storage-encrypted", storageEncrypted ?: false)
				.argument("kms-key-id", kmsKeyId)
				.argument("domain", domain)
				.option("copy-tags-to-snapshot", copyTagsToSnapshot ?: false)
				.argument("monitoring-interval", monitoringInterval?.toString())
				.argument("monitoring-role-arn", monitoringRoleArn)
				.argument("domain-iamrole-name", domainIAMRoleName)
				.argument("promotion-tier", promotionTier?.toString())
				.argument("timezone", timezone)
				.option("enable-iamdatabase-authentication", enableIAMDatabaseAuthentication ?: false)
				.option("enable-performance-insights", enablePerformanceInsights ?: false)
				.argument("performance-insights-kmskey-id", performanceInsightsKMSKeyId)
				.argument("enable-cloudwatch-logs-exports", enableCloudwatchLogsExports?.toString())
	}

}


fun AmazonRDSFunctions.createDBInstanceReadReplica(dBInstanceIdentifier: String, sourceDBInstanceIdentifier: String, init: AmazonRDSCreateDBInstanceReadReplicaCommand.() -> Unit) {
	this.block.declare(AmazonRDSCreateDBInstanceReadReplicaCommand(dBInstanceIdentifier, sourceDBInstanceIdentifier).apply(init))
}

@Generated
class AmazonRDSCreateDBInstanceReadReplicaCommand(val dBInstanceIdentifier: String, val sourceDBInstanceIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.CreateDBInstanceReadReplicaRequest> {

	var dBInstanceClass: String? = null
	var availabilityZone: String? = null
	var port: Int? = 0
	var multiAZ: Boolean? = false
	var autoMinorVersionUpgrade: Boolean? = false
	var iops: Int? = 0
	var optionGroupName: String? = null
	var publiclyAccessible: Boolean? = false
	var tags: List<com.amazonaws.services.rds.model.Tag>? = null
	var dBSubnetGroupName: String? = null
	var storageType: String? = null
	var copyTagsToSnapshot: Boolean? = false
	var monitoringInterval: Int? = 0
	var monitoringRoleArn: String? = null
	var kmsKeyId: String? = null
	var preSignedUrl: String? = null
	var enableIAMDatabaseAuthentication: Boolean? = false
	var enablePerformanceInsights: Boolean? = false
	var performanceInsightsKMSKeyId: String? = null
	var enableCloudwatchLogsExports: List<String>? = null
	var sourceRegion: String? = null

	override fun build(): com.amazonaws.services.rds.model.CreateDBInstanceReadReplicaRequest {
		val input = com.amazonaws.services.rds.model.CreateDBInstanceReadReplicaRequest()
		input.setDBInstanceIdentifier(this.dBInstanceIdentifier)
		input.setSourceDBInstanceIdentifier(this.sourceDBInstanceIdentifier)
		input.setDBInstanceClass(this.dBInstanceClass)
		input.setAvailabilityZone(this.availabilityZone)
		input.setPort(this.port)
		input.setMultiAZ(this.multiAZ)
		input.setAutoMinorVersionUpgrade(this.autoMinorVersionUpgrade)
		input.setIops(this.iops)
		input.setOptionGroupName(this.optionGroupName)
		input.setPubliclyAccessible(this.publiclyAccessible)
		input.setTags(this.tags)
		input.setDBSubnetGroupName(this.dBSubnetGroupName)
		input.setStorageType(this.storageType)
		input.setCopyTagsToSnapshot(this.copyTagsToSnapshot)
		input.setMonitoringInterval(this.monitoringInterval)
		input.setMonitoringRoleArn(this.monitoringRoleArn)
		input.setKmsKeyId(this.kmsKeyId)
		input.setPreSignedUrl(this.preSignedUrl)
		input.setEnableIAMDatabaseAuthentication(this.enableIAMDatabaseAuthentication)
		input.setEnablePerformanceInsights(this.enablePerformanceInsights)
		input.setPerformanceInsightsKMSKeyId(this.performanceInsightsKMSKeyId)
		input.setEnableCloudwatchLogsExports(this.enableCloudwatchLogsExports)
		input.setSourceRegion(this.sourceRegion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.createDBInstanceReadReplica(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds create-dbinstance-read-replica")
				.argument("dbinstance-identifier", dBInstanceIdentifier)
				.argument("source-dbinstance-identifier", sourceDBInstanceIdentifier)
				.argument("dbinstance-class", dBInstanceClass)
				.argument("availability-zone", availabilityZone)
				.argument("port", port?.toString())
				.option("multi-az", multiAZ ?: false)
				.option("auto-minor-version-upgrade", autoMinorVersionUpgrade ?: false)
				.argument("iops", iops?.toString())
				.argument("option-group-name", optionGroupName)
				.option("publicly-accessible", publiclyAccessible ?: false)
				.argument("tags", tags?.toString())
				.argument("dbsubnet-group-name", dBSubnetGroupName)
				.argument("storage-type", storageType)
				.option("copy-tags-to-snapshot", copyTagsToSnapshot ?: false)
				.argument("monitoring-interval", monitoringInterval?.toString())
				.argument("monitoring-role-arn", monitoringRoleArn)
				.argument("kms-key-id", kmsKeyId)
				.argument("pre-signed-url", preSignedUrl)
				.option("enable-iamdatabase-authentication", enableIAMDatabaseAuthentication ?: false)
				.option("enable-performance-insights", enablePerformanceInsights ?: false)
				.argument("performance-insights-kmskey-id", performanceInsightsKMSKeyId)
				.argument("enable-cloudwatch-logs-exports", enableCloudwatchLogsExports?.toString())
				.argument("source-region", sourceRegion)
	}

}


fun AmazonRDSFunctions.createDBParameterGroup(dBParameterGroupName: String, dBParameterGroupFamily: String, description: String, init: AmazonRDSCreateDBParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSCreateDBParameterGroupCommand(dBParameterGroupName, dBParameterGroupFamily, description).apply(init))
}

@Generated
class AmazonRDSCreateDBParameterGroupCommand(val dBParameterGroupName: String, val dBParameterGroupFamily: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.CreateDBParameterGroupRequest> {

	var tags: List<com.amazonaws.services.rds.model.Tag>? = null

	override fun build(): com.amazonaws.services.rds.model.CreateDBParameterGroupRequest {
		val input = com.amazonaws.services.rds.model.CreateDBParameterGroupRequest()
		input.setDBParameterGroupName(this.dBParameterGroupName)
		input.setDBParameterGroupFamily(this.dBParameterGroupFamily)
		input.setDescription(this.description)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.createDBParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds create-dbparameter-group")
				.argument("dbparameter-group-name", dBParameterGroupName)
				.argument("dbparameter-group-family", dBParameterGroupFamily)
				.argument("description", description)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRDSFunctions.createDBSecurityGroup(dBSecurityGroupName: String, dBSecurityGroupDescription: String, init: AmazonRDSCreateDBSecurityGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSCreateDBSecurityGroupCommand(dBSecurityGroupName, dBSecurityGroupDescription).apply(init))
}

@Generated
class AmazonRDSCreateDBSecurityGroupCommand(val dBSecurityGroupName: String, val dBSecurityGroupDescription: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.CreateDBSecurityGroupRequest> {

	var tags: List<com.amazonaws.services.rds.model.Tag>? = null

	override fun build(): com.amazonaws.services.rds.model.CreateDBSecurityGroupRequest {
		val input = com.amazonaws.services.rds.model.CreateDBSecurityGroupRequest()
		input.setDBSecurityGroupName(this.dBSecurityGroupName)
		input.setDBSecurityGroupDescription(this.dBSecurityGroupDescription)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.createDBSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds create-dbsecurity-group")
				.argument("dbsecurity-group-name", dBSecurityGroupName)
				.argument("dbsecurity-group-description", dBSecurityGroupDescription)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRDSFunctions.createDBSnapshot(dBSnapshotIdentifier: String, dBInstanceIdentifier: String, init: AmazonRDSCreateDBSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonRDSCreateDBSnapshotCommand(dBSnapshotIdentifier, dBInstanceIdentifier).apply(init))
}

@Generated
class AmazonRDSCreateDBSnapshotCommand(val dBSnapshotIdentifier: String, val dBInstanceIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.CreateDBSnapshotRequest> {

	var tags: List<com.amazonaws.services.rds.model.Tag>? = null

	override fun build(): com.amazonaws.services.rds.model.CreateDBSnapshotRequest {
		val input = com.amazonaws.services.rds.model.CreateDBSnapshotRequest()
		input.setDBSnapshotIdentifier(this.dBSnapshotIdentifier)
		input.setDBInstanceIdentifier(this.dBInstanceIdentifier)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.createDBSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds create-dbsnapshot")
				.argument("dbsnapshot-identifier", dBSnapshotIdentifier)
				.argument("dbinstance-identifier", dBInstanceIdentifier)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRDSFunctions.createDBSubnetGroup(dBSubnetGroupName: String, dBSubnetGroupDescription: String, subnetIds: List<String>, init: AmazonRDSCreateDBSubnetGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSCreateDBSubnetGroupCommand(dBSubnetGroupName, dBSubnetGroupDescription, subnetIds).apply(init))
}

@Generated
class AmazonRDSCreateDBSubnetGroupCommand(val dBSubnetGroupName: String, val dBSubnetGroupDescription: String, val subnetIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.CreateDBSubnetGroupRequest> {

	var tags: List<com.amazonaws.services.rds.model.Tag>? = null

	override fun build(): com.amazonaws.services.rds.model.CreateDBSubnetGroupRequest {
		val input = com.amazonaws.services.rds.model.CreateDBSubnetGroupRequest()
		input.setDBSubnetGroupName(this.dBSubnetGroupName)
		input.setDBSubnetGroupDescription(this.dBSubnetGroupDescription)
		input.setSubnetIds(this.subnetIds)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.createDBSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds create-dbsubnet-group")
				.argument("dbsubnet-group-name", dBSubnetGroupName)
				.argument("dbsubnet-group-description", dBSubnetGroupDescription)
				.argument("subnet-ids", subnetIds.toString())
				.argument("tags", tags?.toString())
	}

}


fun AmazonRDSFunctions.createEventSubscription(subscriptionName: String, snsTopicArn: String, init: AmazonRDSCreateEventSubscriptionCommand.() -> Unit) {
	this.block.declare(AmazonRDSCreateEventSubscriptionCommand(subscriptionName, snsTopicArn).apply(init))
}

@Generated
class AmazonRDSCreateEventSubscriptionCommand(val subscriptionName: String, val snsTopicArn: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.CreateEventSubscriptionRequest> {

	var sourceType: String? = null
	var eventCategories: List<String>? = null
	var sourceIds: List<String>? = null
	var enabled: Boolean? = false
	var tags: List<com.amazonaws.services.rds.model.Tag>? = null

	override fun build(): com.amazonaws.services.rds.model.CreateEventSubscriptionRequest {
		val input = com.amazonaws.services.rds.model.CreateEventSubscriptionRequest()
		input.setSubscriptionName(this.subscriptionName)
		input.setSnsTopicArn(this.snsTopicArn)
		input.setSourceType(this.sourceType)
		input.setEventCategories(this.eventCategories)
		input.setSourceIds(this.sourceIds)
		input.setEnabled(this.enabled)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.createEventSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds create-event-subscription")
				.argument("subscription-name", subscriptionName)
				.argument("sns-topic-arn", snsTopicArn)
				.argument("source-type", sourceType)
				.argument("event-categories", eventCategories?.toString())
				.argument("source-ids", sourceIds?.toString())
				.option("enabled", enabled ?: false)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRDSFunctions.createOptionGroup(optionGroupName: String, engineName: String, majorEngineVersion: String, optionGroupDescription: String, init: AmazonRDSCreateOptionGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSCreateOptionGroupCommand(optionGroupName, engineName, majorEngineVersion, optionGroupDescription).apply(init))
}

@Generated
class AmazonRDSCreateOptionGroupCommand(val optionGroupName: String, val engineName: String, val majorEngineVersion: String, val optionGroupDescription: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.CreateOptionGroupRequest> {

	var tags: List<com.amazonaws.services.rds.model.Tag>? = null

	override fun build(): com.amazonaws.services.rds.model.CreateOptionGroupRequest {
		val input = com.amazonaws.services.rds.model.CreateOptionGroupRequest()
		input.setOptionGroupName(this.optionGroupName)
		input.setEngineName(this.engineName)
		input.setMajorEngineVersion(this.majorEngineVersion)
		input.setOptionGroupDescription(this.optionGroupDescription)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.createOptionGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds create-option-group")
				.argument("option-group-name", optionGroupName)
				.argument("engine-name", engineName)
				.argument("major-engine-version", majorEngineVersion)
				.argument("option-group-description", optionGroupDescription)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRDSFunctions.deleteDBCluster(dBClusterIdentifier: String, init: AmazonRDSDeleteDBClusterCommand.() -> Unit) {
	this.block.declare(AmazonRDSDeleteDBClusterCommand(dBClusterIdentifier).apply(init))
}

@Generated
class AmazonRDSDeleteDBClusterCommand(val dBClusterIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DeleteDBClusterRequest> {

	var skipFinalSnapshot: Boolean? = false
	var finalDBSnapshotIdentifier: String? = null

	override fun build(): com.amazonaws.services.rds.model.DeleteDBClusterRequest {
		val input = com.amazonaws.services.rds.model.DeleteDBClusterRequest()
		input.setDBClusterIdentifier(this.dBClusterIdentifier)
		input.setSkipFinalSnapshot(this.skipFinalSnapshot)
		input.setFinalDBSnapshotIdentifier(this.finalDBSnapshotIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.deleteDBCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds delete-dbcluster")
				.argument("dbcluster-identifier", dBClusterIdentifier)
				.option("skip-final-snapshot", skipFinalSnapshot ?: false)
				.argument("final-dbsnapshot-identifier", finalDBSnapshotIdentifier)
	}

}


fun AmazonRDSFunctions.deleteDBClusterParameterGroup(dBClusterParameterGroupName: String, init: AmazonRDSDeleteDBClusterParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSDeleteDBClusterParameterGroupCommand(dBClusterParameterGroupName).apply(init))
}

@Generated
class AmazonRDSDeleteDBClusterParameterGroupCommand(val dBClusterParameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupRequest> {



	override fun build(): com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupRequest {
		val input = com.amazonaws.services.rds.model.DeleteDBClusterParameterGroupRequest()
		input.setDBClusterParameterGroupName(this.dBClusterParameterGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.deleteDBClusterParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds delete-dbcluster-parameter-group")
				.argument("dbcluster-parameter-group-name", dBClusterParameterGroupName)
	}

}


fun AmazonRDSFunctions.deleteDBClusterSnapshot(dBClusterSnapshotIdentifier: String, init: AmazonRDSDeleteDBClusterSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonRDSDeleteDBClusterSnapshotCommand(dBClusterSnapshotIdentifier).apply(init))
}

@Generated
class AmazonRDSDeleteDBClusterSnapshotCommand(val dBClusterSnapshotIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DeleteDBClusterSnapshotRequest> {



	override fun build(): com.amazonaws.services.rds.model.DeleteDBClusterSnapshotRequest {
		val input = com.amazonaws.services.rds.model.DeleteDBClusterSnapshotRequest()
		input.setDBClusterSnapshotIdentifier(this.dBClusterSnapshotIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.deleteDBClusterSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds delete-dbcluster-snapshot")
				.argument("dbcluster-snapshot-identifier", dBClusterSnapshotIdentifier)
	}

}


fun AmazonRDSFunctions.deleteDBInstance(dBInstanceIdentifier: String, init: AmazonRDSDeleteDBInstanceCommand.() -> Unit) {
	this.block.declare(AmazonRDSDeleteDBInstanceCommand(dBInstanceIdentifier).apply(init))
}

@Generated
class AmazonRDSDeleteDBInstanceCommand(val dBInstanceIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DeleteDBInstanceRequest> {

	var skipFinalSnapshot: Boolean? = false
	var finalDBSnapshotIdentifier: String? = null

	override fun build(): com.amazonaws.services.rds.model.DeleteDBInstanceRequest {
		val input = com.amazonaws.services.rds.model.DeleteDBInstanceRequest()
		input.setDBInstanceIdentifier(this.dBInstanceIdentifier)
		input.setSkipFinalSnapshot(this.skipFinalSnapshot)
		input.setFinalDBSnapshotIdentifier(this.finalDBSnapshotIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.deleteDBInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds delete-dbinstance")
				.argument("dbinstance-identifier", dBInstanceIdentifier)
				.option("skip-final-snapshot", skipFinalSnapshot ?: false)
				.argument("final-dbsnapshot-identifier", finalDBSnapshotIdentifier)
	}

}


fun AmazonRDSFunctions.deleteDBParameterGroup(dBParameterGroupName: String, init: AmazonRDSDeleteDBParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSDeleteDBParameterGroupCommand(dBParameterGroupName).apply(init))
}

@Generated
class AmazonRDSDeleteDBParameterGroupCommand(val dBParameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DeleteDBParameterGroupRequest> {



	override fun build(): com.amazonaws.services.rds.model.DeleteDBParameterGroupRequest {
		val input = com.amazonaws.services.rds.model.DeleteDBParameterGroupRequest()
		input.setDBParameterGroupName(this.dBParameterGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.deleteDBParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds delete-dbparameter-group")
				.argument("dbparameter-group-name", dBParameterGroupName)
	}

}


fun AmazonRDSFunctions.deleteDBSecurityGroup(dBSecurityGroupName: String, init: AmazonRDSDeleteDBSecurityGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSDeleteDBSecurityGroupCommand(dBSecurityGroupName).apply(init))
}

@Generated
class AmazonRDSDeleteDBSecurityGroupCommand(val dBSecurityGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DeleteDBSecurityGroupRequest> {



	override fun build(): com.amazonaws.services.rds.model.DeleteDBSecurityGroupRequest {
		val input = com.amazonaws.services.rds.model.DeleteDBSecurityGroupRequest()
		input.setDBSecurityGroupName(this.dBSecurityGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.deleteDBSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds delete-dbsecurity-group")
				.argument("dbsecurity-group-name", dBSecurityGroupName)
	}

}


fun AmazonRDSFunctions.deleteDBSnapshot(dBSnapshotIdentifier: String, init: AmazonRDSDeleteDBSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonRDSDeleteDBSnapshotCommand(dBSnapshotIdentifier).apply(init))
}

@Generated
class AmazonRDSDeleteDBSnapshotCommand(val dBSnapshotIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DeleteDBSnapshotRequest> {



	override fun build(): com.amazonaws.services.rds.model.DeleteDBSnapshotRequest {
		val input = com.amazonaws.services.rds.model.DeleteDBSnapshotRequest()
		input.setDBSnapshotIdentifier(this.dBSnapshotIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.deleteDBSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds delete-dbsnapshot")
				.argument("dbsnapshot-identifier", dBSnapshotIdentifier)
	}

}


fun AmazonRDSFunctions.deleteDBSubnetGroup(dBSubnetGroupName: String, init: AmazonRDSDeleteDBSubnetGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSDeleteDBSubnetGroupCommand(dBSubnetGroupName).apply(init))
}

@Generated
class AmazonRDSDeleteDBSubnetGroupCommand(val dBSubnetGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DeleteDBSubnetGroupRequest> {



	override fun build(): com.amazonaws.services.rds.model.DeleteDBSubnetGroupRequest {
		val input = com.amazonaws.services.rds.model.DeleteDBSubnetGroupRequest()
		input.setDBSubnetGroupName(this.dBSubnetGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.deleteDBSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds delete-dbsubnet-group")
				.argument("dbsubnet-group-name", dBSubnetGroupName)
	}

}


fun AmazonRDSFunctions.deleteEventSubscription(subscriptionName: String, init: AmazonRDSDeleteEventSubscriptionCommand.() -> Unit) {
	this.block.declare(AmazonRDSDeleteEventSubscriptionCommand(subscriptionName).apply(init))
}

@Generated
class AmazonRDSDeleteEventSubscriptionCommand(val subscriptionName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DeleteEventSubscriptionRequest> {



	override fun build(): com.amazonaws.services.rds.model.DeleteEventSubscriptionRequest {
		val input = com.amazonaws.services.rds.model.DeleteEventSubscriptionRequest()
		input.setSubscriptionName(this.subscriptionName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.deleteEventSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds delete-event-subscription")
				.argument("subscription-name", subscriptionName)
	}

}


fun AmazonRDSFunctions.deleteOptionGroup(optionGroupName: String, init: AmazonRDSDeleteOptionGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSDeleteOptionGroupCommand(optionGroupName).apply(init))
}

@Generated
class AmazonRDSDeleteOptionGroupCommand(val optionGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DeleteOptionGroupRequest> {



	override fun build(): com.amazonaws.services.rds.model.DeleteOptionGroupRequest {
		val input = com.amazonaws.services.rds.model.DeleteOptionGroupRequest()
		input.setOptionGroupName(this.optionGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.deleteOptionGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds delete-option-group")
				.argument("option-group-name", optionGroupName)
	}

}


fun AmazonRDSFunctions.describeAccountAttributes(init: AmazonRDSDescribeAccountAttributesCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeAccountAttributesCommand().apply(init))
}

@Generated
class AmazonRDSDescribeAccountAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeAccountAttributesRequest> {



	override fun build(): com.amazonaws.services.rds.model.DescribeAccountAttributesRequest {
		val input = com.amazonaws.services.rds.model.DescribeAccountAttributesRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeAccountAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-account-attributes")

	}

}


fun AmazonRDSFunctions.describeCertificates(init: AmazonRDSDescribeCertificatesCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeCertificatesCommand().apply(init))
}

@Generated
class AmazonRDSDescribeCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeCertificatesRequest> {

	var certificateIdentifier: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeCertificatesRequest {
		val input = com.amazonaws.services.rds.model.DescribeCertificatesRequest()
		input.setCertificateIdentifier(this.certificateIdentifier)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-certificates")
				.argument("certificate-identifier", certificateIdentifier)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeDBClusterParameterGroups(init: AmazonRDSDescribeDBClusterParameterGroupsCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeDBClusterParameterGroupsCommand().apply(init))
}

@Generated
class AmazonRDSDescribeDBClusterParameterGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsRequest> {

	var dBClusterParameterGroupName: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsRequest {
		val input = com.amazonaws.services.rds.model.DescribeDBClusterParameterGroupsRequest()
		input.setDBClusterParameterGroupName(this.dBClusterParameterGroupName)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeDBClusterParameterGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-dbcluster-parameter-groups")
				.argument("dbcluster-parameter-group-name", dBClusterParameterGroupName)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeDBClusterParameters(dBClusterParameterGroupName: String, init: AmazonRDSDescribeDBClusterParametersCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeDBClusterParametersCommand(dBClusterParameterGroupName).apply(init))
}

@Generated
class AmazonRDSDescribeDBClusterParametersCommand(val dBClusterParameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeDBClusterParametersRequest> {

	var source: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeDBClusterParametersRequest {
		val input = com.amazonaws.services.rds.model.DescribeDBClusterParametersRequest()
		input.setDBClusterParameterGroupName(this.dBClusterParameterGroupName)
		input.setSource(this.source)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeDBClusterParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-dbcluster-parameters")
				.argument("dbcluster-parameter-group-name", dBClusterParameterGroupName)
				.argument("source", source)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeDBClusterSnapshotAttributes(dBClusterSnapshotIdentifier: String, init: AmazonRDSDescribeDBClusterSnapshotAttributesCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeDBClusterSnapshotAttributesCommand(dBClusterSnapshotIdentifier).apply(init))
}

@Generated
class AmazonRDSDescribeDBClusterSnapshotAttributesCommand(val dBClusterSnapshotIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeDBClusterSnapshotAttributesRequest> {



	override fun build(): com.amazonaws.services.rds.model.DescribeDBClusterSnapshotAttributesRequest {
		val input = com.amazonaws.services.rds.model.DescribeDBClusterSnapshotAttributesRequest()
		input.setDBClusterSnapshotIdentifier(this.dBClusterSnapshotIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeDBClusterSnapshotAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-dbcluster-snapshot-attributes")
				.argument("dbcluster-snapshot-identifier", dBClusterSnapshotIdentifier)
	}

}


fun AmazonRDSFunctions.describeDBClusterSnapshots(init: AmazonRDSDescribeDBClusterSnapshotsCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeDBClusterSnapshotsCommand().apply(init))
}

@Generated
class AmazonRDSDescribeDBClusterSnapshotsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsRequest> {

	var dBClusterIdentifier: String? = null
	var dBClusterSnapshotIdentifier: String? = null
	var snapshotType: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null
	var includeShared: Boolean? = false
	var includePublic: Boolean? = false

	override fun build(): com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsRequest {
		val input = com.amazonaws.services.rds.model.DescribeDBClusterSnapshotsRequest()
		input.setDBClusterIdentifier(this.dBClusterIdentifier)
		input.setDBClusterSnapshotIdentifier(this.dBClusterSnapshotIdentifier)
		input.setSnapshotType(this.snapshotType)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setIncludeShared(this.includeShared)
		input.setIncludePublic(this.includePublic)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeDBClusterSnapshots(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-dbcluster-snapshots")
				.argument("dbcluster-identifier", dBClusterIdentifier)
				.argument("dbcluster-snapshot-identifier", dBClusterSnapshotIdentifier)
				.argument("snapshot-type", snapshotType)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.option("include-shared", includeShared ?: false)
				.option("include-public", includePublic ?: false)
	}

}


fun AmazonRDSFunctions.describeDBClusters(init: AmazonRDSDescribeDBClustersCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeDBClustersCommand().apply(init))
}

@Generated
class AmazonRDSDescribeDBClustersCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeDBClustersRequest> {

	var dBClusterIdentifier: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeDBClustersRequest {
		val input = com.amazonaws.services.rds.model.DescribeDBClustersRequest()
		input.setDBClusterIdentifier(this.dBClusterIdentifier)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeDBClusters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-dbclusters")
				.argument("dbcluster-identifier", dBClusterIdentifier)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeDBEngineVersions(init: AmazonRDSDescribeDBEngineVersionsCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeDBEngineVersionsCommand().apply(init))
}

@Generated
class AmazonRDSDescribeDBEngineVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeDBEngineVersionsRequest> {

	var engine: String? = null
	var engineVersion: String? = null
	var dBParameterGroupFamily: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null
	var defaultOnly: Boolean? = false
	var listSupportedCharacterSets: Boolean? = false
	var listSupportedTimezones: Boolean? = false

	override fun build(): com.amazonaws.services.rds.model.DescribeDBEngineVersionsRequest {
		val input = com.amazonaws.services.rds.model.DescribeDBEngineVersionsRequest()
		input.setEngine(this.engine)
		input.setEngineVersion(this.engineVersion)
		input.setDBParameterGroupFamily(this.dBParameterGroupFamily)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setDefaultOnly(this.defaultOnly)
		input.setListSupportedCharacterSets(this.listSupportedCharacterSets)
		input.setListSupportedTimezones(this.listSupportedTimezones)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeDBEngineVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-dbengine-versions")
				.argument("engine", engine)
				.argument("engine-version", engineVersion)
				.argument("dbparameter-group-family", dBParameterGroupFamily)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.option("default-only", defaultOnly ?: false)
				.option("list-supported-character-sets", listSupportedCharacterSets ?: false)
				.option("list-supported-timezones", listSupportedTimezones ?: false)
	}

}


fun AmazonRDSFunctions.describeDBInstances(init: AmazonRDSDescribeDBInstancesCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeDBInstancesCommand().apply(init))
}

@Generated
class AmazonRDSDescribeDBInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeDBInstancesRequest> {

	var dBInstanceIdentifier: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeDBInstancesRequest {
		val input = com.amazonaws.services.rds.model.DescribeDBInstancesRequest()
		input.setDBInstanceIdentifier(this.dBInstanceIdentifier)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeDBInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-dbinstances")
				.argument("dbinstance-identifier", dBInstanceIdentifier)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeDBLogFiles(dBInstanceIdentifier: String, init: AmazonRDSDescribeDBLogFilesCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeDBLogFilesCommand(dBInstanceIdentifier).apply(init))
}

@Generated
class AmazonRDSDescribeDBLogFilesCommand(val dBInstanceIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeDBLogFilesRequest> {

	var filenameContains: String? = null
	var fileLastWritten: Long? = 0L
	var fileSize: Long? = 0L
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeDBLogFilesRequest {
		val input = com.amazonaws.services.rds.model.DescribeDBLogFilesRequest()
		input.setDBInstanceIdentifier(this.dBInstanceIdentifier)
		input.setFilenameContains(this.filenameContains)
		input.setFileLastWritten(this.fileLastWritten)
		input.setFileSize(this.fileSize)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeDBLogFiles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-dblog-files")
				.argument("dbinstance-identifier", dBInstanceIdentifier)
				.argument("filename-contains", filenameContains)
				.argument("file-last-written", fileLastWritten?.toString())
				.argument("file-size", fileSize?.toString())
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeDBParameterGroups(init: AmazonRDSDescribeDBParameterGroupsCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeDBParameterGroupsCommand().apply(init))
}

@Generated
class AmazonRDSDescribeDBParameterGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeDBParameterGroupsRequest> {

	var dBParameterGroupName: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeDBParameterGroupsRequest {
		val input = com.amazonaws.services.rds.model.DescribeDBParameterGroupsRequest()
		input.setDBParameterGroupName(this.dBParameterGroupName)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeDBParameterGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-dbparameter-groups")
				.argument("dbparameter-group-name", dBParameterGroupName)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeDBParameters(dBParameterGroupName: String, init: AmazonRDSDescribeDBParametersCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeDBParametersCommand(dBParameterGroupName).apply(init))
}

@Generated
class AmazonRDSDescribeDBParametersCommand(val dBParameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeDBParametersRequest> {

	var source: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeDBParametersRequest {
		val input = com.amazonaws.services.rds.model.DescribeDBParametersRequest()
		input.setDBParameterGroupName(this.dBParameterGroupName)
		input.setSource(this.source)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeDBParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-dbparameters")
				.argument("dbparameter-group-name", dBParameterGroupName)
				.argument("source", source)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeDBSecurityGroups(init: AmazonRDSDescribeDBSecurityGroupsCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeDBSecurityGroupsCommand().apply(init))
}

@Generated
class AmazonRDSDescribeDBSecurityGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeDBSecurityGroupsRequest> {

	var dBSecurityGroupName: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeDBSecurityGroupsRequest {
		val input = com.amazonaws.services.rds.model.DescribeDBSecurityGroupsRequest()
		input.setDBSecurityGroupName(this.dBSecurityGroupName)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeDBSecurityGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-dbsecurity-groups")
				.argument("dbsecurity-group-name", dBSecurityGroupName)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeDBSnapshotAttributes(dBSnapshotIdentifier: String, init: AmazonRDSDescribeDBSnapshotAttributesCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeDBSnapshotAttributesCommand(dBSnapshotIdentifier).apply(init))
}

@Generated
class AmazonRDSDescribeDBSnapshotAttributesCommand(val dBSnapshotIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeDBSnapshotAttributesRequest> {



	override fun build(): com.amazonaws.services.rds.model.DescribeDBSnapshotAttributesRequest {
		val input = com.amazonaws.services.rds.model.DescribeDBSnapshotAttributesRequest()
		input.setDBSnapshotIdentifier(this.dBSnapshotIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeDBSnapshotAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-dbsnapshot-attributes")
				.argument("dbsnapshot-identifier", dBSnapshotIdentifier)
	}

}


fun AmazonRDSFunctions.describeDBSnapshots(init: AmazonRDSDescribeDBSnapshotsCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeDBSnapshotsCommand().apply(init))
}

@Generated
class AmazonRDSDescribeDBSnapshotsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeDBSnapshotsRequest> {

	var dBInstanceIdentifier: String? = null
	var dBSnapshotIdentifier: String? = null
	var snapshotType: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null
	var includeShared: Boolean? = false
	var includePublic: Boolean? = false

	override fun build(): com.amazonaws.services.rds.model.DescribeDBSnapshotsRequest {
		val input = com.amazonaws.services.rds.model.DescribeDBSnapshotsRequest()
		input.setDBInstanceIdentifier(this.dBInstanceIdentifier)
		input.setDBSnapshotIdentifier(this.dBSnapshotIdentifier)
		input.setSnapshotType(this.snapshotType)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setIncludeShared(this.includeShared)
		input.setIncludePublic(this.includePublic)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeDBSnapshots(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-dbsnapshots")
				.argument("dbinstance-identifier", dBInstanceIdentifier)
				.argument("dbsnapshot-identifier", dBSnapshotIdentifier)
				.argument("snapshot-type", snapshotType)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.option("include-shared", includeShared ?: false)
				.option("include-public", includePublic ?: false)
	}

}


fun AmazonRDSFunctions.describeDBSubnetGroups(init: AmazonRDSDescribeDBSubnetGroupsCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeDBSubnetGroupsCommand().apply(init))
}

@Generated
class AmazonRDSDescribeDBSubnetGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeDBSubnetGroupsRequest> {

	var dBSubnetGroupName: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeDBSubnetGroupsRequest {
		val input = com.amazonaws.services.rds.model.DescribeDBSubnetGroupsRequest()
		input.setDBSubnetGroupName(this.dBSubnetGroupName)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeDBSubnetGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-dbsubnet-groups")
				.argument("dbsubnet-group-name", dBSubnetGroupName)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeEngineDefaultClusterParameters(dBParameterGroupFamily: String, init: AmazonRDSDescribeEngineDefaultClusterParametersCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeEngineDefaultClusterParametersCommand(dBParameterGroupFamily).apply(init))
}

@Generated
class AmazonRDSDescribeEngineDefaultClusterParametersCommand(val dBParameterGroupFamily: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeEngineDefaultClusterParametersRequest> {

	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeEngineDefaultClusterParametersRequest {
		val input = com.amazonaws.services.rds.model.DescribeEngineDefaultClusterParametersRequest()
		input.setDBParameterGroupFamily(this.dBParameterGroupFamily)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeEngineDefaultClusterParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-engine-default-cluster-parameters")
				.argument("dbparameter-group-family", dBParameterGroupFamily)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeEngineDefaultParameters(dBParameterGroupFamily: String, init: AmazonRDSDescribeEngineDefaultParametersCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeEngineDefaultParametersCommand(dBParameterGroupFamily).apply(init))
}

@Generated
class AmazonRDSDescribeEngineDefaultParametersCommand(val dBParameterGroupFamily: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeEngineDefaultParametersRequest> {

	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeEngineDefaultParametersRequest {
		val input = com.amazonaws.services.rds.model.DescribeEngineDefaultParametersRequest()
		input.setDBParameterGroupFamily(this.dBParameterGroupFamily)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeEngineDefaultParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-engine-default-parameters")
				.argument("dbparameter-group-family", dBParameterGroupFamily)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeEventCategories(init: AmazonRDSDescribeEventCategoriesCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeEventCategoriesCommand().apply(init))
}

@Generated
class AmazonRDSDescribeEventCategoriesCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeEventCategoriesRequest> {

	var sourceType: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeEventCategoriesRequest {
		val input = com.amazonaws.services.rds.model.DescribeEventCategoriesRequest()
		input.setSourceType(this.sourceType)
		input.setFilters(this.filters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeEventCategories(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-event-categories")
				.argument("source-type", sourceType)
				.argument("filters", filters?.toString())
	}

}


fun AmazonRDSFunctions.describeEventSubscriptions(init: AmazonRDSDescribeEventSubscriptionsCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeEventSubscriptionsCommand().apply(init))
}

@Generated
class AmazonRDSDescribeEventSubscriptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeEventSubscriptionsRequest> {

	var subscriptionName: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeEventSubscriptionsRequest {
		val input = com.amazonaws.services.rds.model.DescribeEventSubscriptionsRequest()
		input.setSubscriptionName(this.subscriptionName)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeEventSubscriptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-event-subscriptions")
				.argument("subscription-name", subscriptionName)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeEvents(init: AmazonRDSDescribeEventsCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeEventsCommand().apply(init))
}

@Generated
class AmazonRDSDescribeEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeEventsRequest> {

	var sourceIdentifier: String? = null
	var sourceType: SourceType? = null
	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null
	var duration: Int? = 0
	var eventCategories: List<String>? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeEventsRequest {
		val input = com.amazonaws.services.rds.model.DescribeEventsRequest()
		input.setSourceIdentifier(this.sourceIdentifier)
		input.setSourceType(this.sourceType?.toString())
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setDuration(this.duration)
		input.setEventCategories(this.eventCategories)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-events")
				.argument("source-identifier", sourceIdentifier)
				.argument("source-type", sourceType?.toString())
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("duration", duration?.toString())
				.argument("event-categories", eventCategories?.toString())
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeOptionGroupOptions(engineName: String, init: AmazonRDSDescribeOptionGroupOptionsCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeOptionGroupOptionsCommand(engineName).apply(init))
}

@Generated
class AmazonRDSDescribeOptionGroupOptionsCommand(val engineName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeOptionGroupOptionsRequest> {

	var majorEngineVersion: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeOptionGroupOptionsRequest {
		val input = com.amazonaws.services.rds.model.DescribeOptionGroupOptionsRequest()
		input.setEngineName(this.engineName)
		input.setMajorEngineVersion(this.majorEngineVersion)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeOptionGroupOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-option-group-options")
				.argument("engine-name", engineName)
				.argument("major-engine-version", majorEngineVersion)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeOptionGroups(init: AmazonRDSDescribeOptionGroupsCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeOptionGroupsCommand().apply(init))
}

@Generated
class AmazonRDSDescribeOptionGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeOptionGroupsRequest> {

	var optionGroupName: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var marker: String? = null
	var maxRecords: Int? = 0
	var engineName: String? = null
	var majorEngineVersion: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeOptionGroupsRequest {
		val input = com.amazonaws.services.rds.model.DescribeOptionGroupsRequest()
		input.setOptionGroupName(this.optionGroupName)
		input.setFilters(this.filters)
		input.setMarker(this.marker)
		input.setMaxRecords(this.maxRecords)
		input.setEngineName(this.engineName)
		input.setMajorEngineVersion(this.majorEngineVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeOptionGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-option-groups")
				.argument("option-group-name", optionGroupName)
				.argument("filters", filters?.toString())
				.argument("marker", marker)
				.argument("max-records", maxRecords?.toString())
				.argument("engine-name", engineName)
				.argument("major-engine-version", majorEngineVersion)
	}

}


fun AmazonRDSFunctions.describeOrderableDBInstanceOptions(engine: String, init: AmazonRDSDescribeOrderableDBInstanceOptionsCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeOrderableDBInstanceOptionsCommand(engine).apply(init))
}

@Generated
class AmazonRDSDescribeOrderableDBInstanceOptionsCommand(val engine: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsRequest> {

	var engineVersion: String? = null
	var dBInstanceClass: String? = null
	var licenseModel: String? = null
	var vpc: Boolean? = false
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsRequest {
		val input = com.amazonaws.services.rds.model.DescribeOrderableDBInstanceOptionsRequest()
		input.setEngine(this.engine)
		input.setEngineVersion(this.engineVersion)
		input.setDBInstanceClass(this.dBInstanceClass)
		input.setLicenseModel(this.licenseModel)
		input.setVpc(this.vpc)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeOrderableDBInstanceOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-orderable-dbinstance-options")
				.argument("engine", engine)
				.argument("engine-version", engineVersion)
				.argument("dbinstance-class", dBInstanceClass)
				.argument("license-model", licenseModel)
				.option("vpc", vpc ?: false)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describePendingMaintenanceActions(init: AmazonRDSDescribePendingMaintenanceActionsCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribePendingMaintenanceActionsCommand().apply(init))
}

@Generated
class AmazonRDSDescribePendingMaintenanceActionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsRequest> {

	var resourceIdentifier: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var marker: String? = null
	var maxRecords: Int? = 0

	override fun build(): com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsRequest {
		val input = com.amazonaws.services.rds.model.DescribePendingMaintenanceActionsRequest()
		input.setResourceIdentifier(this.resourceIdentifier)
		input.setFilters(this.filters)
		input.setMarker(this.marker)
		input.setMaxRecords(this.maxRecords)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describePendingMaintenanceActions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-pending-maintenance-actions")
				.argument("resource-identifier", resourceIdentifier)
				.argument("filters", filters?.toString())
				.argument("marker", marker)
				.argument("max-records", maxRecords?.toString())
	}

}


fun AmazonRDSFunctions.describeReservedDBInstances(init: AmazonRDSDescribeReservedDBInstancesCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeReservedDBInstancesCommand().apply(init))
}

@Generated
class AmazonRDSDescribeReservedDBInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeReservedDBInstancesRequest> {

	var reservedDBInstanceId: String? = null
	var reservedDBInstancesOfferingId: String? = null
	var dBInstanceClass: String? = null
	var duration: String? = null
	var productDescription: String? = null
	var offeringType: String? = null
	var multiAZ: Boolean? = false
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeReservedDBInstancesRequest {
		val input = com.amazonaws.services.rds.model.DescribeReservedDBInstancesRequest()
		input.setReservedDBInstanceId(this.reservedDBInstanceId)
		input.setReservedDBInstancesOfferingId(this.reservedDBInstancesOfferingId)
		input.setDBInstanceClass(this.dBInstanceClass)
		input.setDuration(this.duration)
		input.setProductDescription(this.productDescription)
		input.setOfferingType(this.offeringType)
		input.setMultiAZ(this.multiAZ)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeReservedDBInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-reserved-dbinstances")
				.argument("reserved-dbinstance-id", reservedDBInstanceId)
				.argument("reserved-dbinstances-offering-id", reservedDBInstancesOfferingId)
				.argument("dbinstance-class", dBInstanceClass)
				.argument("duration", duration)
				.argument("product-description", productDescription)
				.argument("offering-type", offeringType)
				.option("multi-az", multiAZ ?: false)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeReservedDBInstancesOfferings(init: AmazonRDSDescribeReservedDBInstancesOfferingsCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeReservedDBInstancesOfferingsCommand().apply(init))
}

@Generated
class AmazonRDSDescribeReservedDBInstancesOfferingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsRequest> {

	var reservedDBInstancesOfferingId: String? = null
	var dBInstanceClass: String? = null
	var duration: String? = null
	var productDescription: String? = null
	var offeringType: String? = null
	var multiAZ: Boolean? = false
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsRequest {
		val input = com.amazonaws.services.rds.model.DescribeReservedDBInstancesOfferingsRequest()
		input.setReservedDBInstancesOfferingId(this.reservedDBInstancesOfferingId)
		input.setDBInstanceClass(this.dBInstanceClass)
		input.setDuration(this.duration)
		input.setProductDescription(this.productDescription)
		input.setOfferingType(this.offeringType)
		input.setMultiAZ(this.multiAZ)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeReservedDBInstancesOfferings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-reserved-dbinstances-offerings")
				.argument("reserved-dbinstances-offering-id", reservedDBInstancesOfferingId)
				.argument("dbinstance-class", dBInstanceClass)
				.argument("duration", duration)
				.argument("product-description", productDescription)
				.argument("offering-type", offeringType)
				.option("multi-az", multiAZ ?: false)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRDSFunctions.describeSourceRegions(init: AmazonRDSDescribeSourceRegionsCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeSourceRegionsCommand().apply(init))
}

@Generated
class AmazonRDSDescribeSourceRegionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeSourceRegionsRequest> {

	var regionName: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null
	var filters: List<com.amazonaws.services.rds.model.Filter>? = null

	override fun build(): com.amazonaws.services.rds.model.DescribeSourceRegionsRequest {
		val input = com.amazonaws.services.rds.model.DescribeSourceRegionsRequest()
		input.setRegionName(this.regionName)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setFilters(this.filters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeSourceRegions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-source-regions")
				.argument("region-name", regionName)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.argument("filters", filters?.toString())
	}

}


fun AmazonRDSFunctions.describeValidDBInstanceModifications(dBInstanceIdentifier: String, init: AmazonRDSDescribeValidDBInstanceModificationsCommand.() -> Unit) {
	this.block.declare(AmazonRDSDescribeValidDBInstanceModificationsCommand(dBInstanceIdentifier).apply(init))
}

@Generated
class AmazonRDSDescribeValidDBInstanceModificationsCommand(val dBInstanceIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DescribeValidDBInstanceModificationsRequest> {



	override fun build(): com.amazonaws.services.rds.model.DescribeValidDBInstanceModificationsRequest {
		val input = com.amazonaws.services.rds.model.DescribeValidDBInstanceModificationsRequest()
		input.setDBInstanceIdentifier(this.dBInstanceIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.describeValidDBInstanceModifications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds describe-valid-dbinstance-modifications")
				.argument("dbinstance-identifier", dBInstanceIdentifier)
	}

}


fun AmazonRDSFunctions.downloadDBLogFilePortion(dBInstanceIdentifier: String, logFileName: String, init: AmazonRDSDownloadDBLogFilePortionCommand.() -> Unit) {
	this.block.declare(AmazonRDSDownloadDBLogFilePortionCommand(dBInstanceIdentifier, logFileName).apply(init))
}

@Generated
class AmazonRDSDownloadDBLogFilePortionCommand(val dBInstanceIdentifier: String, val logFileName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.DownloadDBLogFilePortionRequest> {

	var marker: String? = null
	var numberOfLines: Int? = 0

	override fun build(): com.amazonaws.services.rds.model.DownloadDBLogFilePortionRequest {
		val input = com.amazonaws.services.rds.model.DownloadDBLogFilePortionRequest()
		input.setDBInstanceIdentifier(this.dBInstanceIdentifier)
		input.setLogFileName(this.logFileName)
		input.setMarker(this.marker)
		input.setNumberOfLines(this.numberOfLines)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.downloadDBLogFilePortion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds download-dblog-file-portion")
				.argument("dbinstance-identifier", dBInstanceIdentifier)
				.argument("log-file-name", logFileName)
				.argument("marker", marker)
				.argument("number-of-lines", numberOfLines?.toString())
	}

}


fun AmazonRDSFunctions.failoverDBCluster(init: AmazonRDSFailoverDBClusterCommand.() -> Unit) {
	this.block.declare(AmazonRDSFailoverDBClusterCommand().apply(init))
}

@Generated
class AmazonRDSFailoverDBClusterCommand() : AmazonWebServiceCommand<com.amazonaws.services.rds.model.FailoverDBClusterRequest> {

	var dBClusterIdentifier: String? = null
	var targetDBInstanceIdentifier: String? = null

	override fun build(): com.amazonaws.services.rds.model.FailoverDBClusterRequest {
		val input = com.amazonaws.services.rds.model.FailoverDBClusterRequest()
		input.setDBClusterIdentifier(this.dBClusterIdentifier)
		input.setTargetDBInstanceIdentifier(this.targetDBInstanceIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.failoverDBCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds failover-dbcluster")
				.argument("dbcluster-identifier", dBClusterIdentifier)
				.argument("target-dbinstance-identifier", targetDBInstanceIdentifier)
	}

}


fun AmazonRDSFunctions.listTagsForResource(resourceName: String, init: AmazonRDSListTagsForResourceCommand.() -> Unit) {
	this.block.declare(AmazonRDSListTagsForResourceCommand(resourceName).apply(init))
}

@Generated
class AmazonRDSListTagsForResourceCommand(val resourceName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.ListTagsForResourceRequest> {

	var filters: List<com.amazonaws.services.rds.model.Filter>? = null

	override fun build(): com.amazonaws.services.rds.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.rds.model.ListTagsForResourceRequest()
		input.setResourceName(this.resourceName)
		input.setFilters(this.filters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds list-tags-for-resource")
				.argument("resource-name", resourceName)
				.argument("filters", filters?.toString())
	}

}


fun AmazonRDSFunctions.modifyDBCluster(dBClusterIdentifier: String, init: AmazonRDSModifyDBClusterCommand.() -> Unit) {
	this.block.declare(AmazonRDSModifyDBClusterCommand(dBClusterIdentifier).apply(init))
}

@Generated
class AmazonRDSModifyDBClusterCommand(val dBClusterIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.ModifyDBClusterRequest> {

	var newDBClusterIdentifier: String? = null
	var applyImmediately: Boolean? = false
	var backupRetentionPeriod: Int? = 0
	var dBClusterParameterGroupName: String? = null
	var vpcSecurityGroupIds: List<String>? = null
	var port: Int? = 0
	var masterUserPassword: String? = null
	var optionGroupName: String? = null
	var preferredBackupWindow: String? = null
	var preferredMaintenanceWindow: String? = null
	var enableIAMDatabaseAuthentication: Boolean? = false

	override fun build(): com.amazonaws.services.rds.model.ModifyDBClusterRequest {
		val input = com.amazonaws.services.rds.model.ModifyDBClusterRequest()
		input.setDBClusterIdentifier(this.dBClusterIdentifier)
		input.setNewDBClusterIdentifier(this.newDBClusterIdentifier)
		input.setApplyImmediately(this.applyImmediately)
		input.setBackupRetentionPeriod(this.backupRetentionPeriod)
		input.setDBClusterParameterGroupName(this.dBClusterParameterGroupName)
		input.setVpcSecurityGroupIds(this.vpcSecurityGroupIds)
		input.setPort(this.port)
		input.setMasterUserPassword(this.masterUserPassword)
		input.setOptionGroupName(this.optionGroupName)
		input.setPreferredBackupWindow(this.preferredBackupWindow)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setEnableIAMDatabaseAuthentication(this.enableIAMDatabaseAuthentication)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.modifyDBCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds modify-dbcluster")
				.argument("dbcluster-identifier", dBClusterIdentifier)
				.argument("new-dbcluster-identifier", newDBClusterIdentifier)
				.option("apply-immediately", applyImmediately ?: false)
				.argument("backup-retention-period", backupRetentionPeriod?.toString())
				.argument("dbcluster-parameter-group-name", dBClusterParameterGroupName)
				.argument("vpc-security-group-ids", vpcSecurityGroupIds?.toString())
				.argument("port", port?.toString())
				.argument("master-user-password", masterUserPassword)
				.argument("option-group-name", optionGroupName)
				.argument("preferred-backup-window", preferredBackupWindow)
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.option("enable-iamdatabase-authentication", enableIAMDatabaseAuthentication ?: false)
	}

}


fun AmazonRDSFunctions.modifyDBClusterParameterGroup(dBClusterParameterGroupName: String, parameters: List<com.amazonaws.services.rds.model.Parameter>, init: AmazonRDSModifyDBClusterParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSModifyDBClusterParameterGroupCommand(dBClusterParameterGroupName, parameters).apply(init))
}

@Generated
class AmazonRDSModifyDBClusterParameterGroupCommand(val dBClusterParameterGroupName: String, val parameters: List<com.amazonaws.services.rds.model.Parameter>) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupRequest> {



	override fun build(): com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupRequest {
		val input = com.amazonaws.services.rds.model.ModifyDBClusterParameterGroupRequest()
		input.setDBClusterParameterGroupName(this.dBClusterParameterGroupName)
		input.setParameters(this.parameters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.modifyDBClusterParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds modify-dbcluster-parameter-group")
				.argument("dbcluster-parameter-group-name", dBClusterParameterGroupName)
				.argument("parameters", parameters.toString())
	}

}


fun AmazonRDSFunctions.modifyDBClusterSnapshotAttribute(dBClusterSnapshotIdentifier: String, attributeName: String, init: AmazonRDSModifyDBClusterSnapshotAttributeCommand.() -> Unit) {
	this.block.declare(AmazonRDSModifyDBClusterSnapshotAttributeCommand(dBClusterSnapshotIdentifier, attributeName).apply(init))
}

@Generated
class AmazonRDSModifyDBClusterSnapshotAttributeCommand(val dBClusterSnapshotIdentifier: String, val attributeName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.ModifyDBClusterSnapshotAttributeRequest> {

	var valuesToAdd: List<String>? = null
	var valuesToRemove: List<String>? = null

	override fun build(): com.amazonaws.services.rds.model.ModifyDBClusterSnapshotAttributeRequest {
		val input = com.amazonaws.services.rds.model.ModifyDBClusterSnapshotAttributeRequest()
		input.setDBClusterSnapshotIdentifier(this.dBClusterSnapshotIdentifier)
		input.setAttributeName(this.attributeName)
		input.setValuesToAdd(this.valuesToAdd)
		input.setValuesToRemove(this.valuesToRemove)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.modifyDBClusterSnapshotAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds modify-dbcluster-snapshot-attribute")
				.argument("dbcluster-snapshot-identifier", dBClusterSnapshotIdentifier)
				.argument("attribute-name", attributeName)
				.argument("values-to-add", valuesToAdd?.toString())
				.argument("values-to-remove", valuesToRemove?.toString())
	}

}


fun AmazonRDSFunctions.modifyDBInstance(dBInstanceIdentifier: String, init: AmazonRDSModifyDBInstanceCommand.() -> Unit) {
	this.block.declare(AmazonRDSModifyDBInstanceCommand(dBInstanceIdentifier).apply(init))
}

@Generated
class AmazonRDSModifyDBInstanceCommand(val dBInstanceIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.ModifyDBInstanceRequest> {

	var allocatedStorage: Int? = 0
	var dBInstanceClass: String? = null
	var dBSubnetGroupName: String? = null
	var dBSecurityGroups: List<String>? = null
	var vpcSecurityGroupIds: List<String>? = null
	var applyImmediately: Boolean? = false
	var masterUserPassword: String? = null
	var dBParameterGroupName: String? = null
	var backupRetentionPeriod: Int? = 0
	var preferredBackupWindow: String? = null
	var preferredMaintenanceWindow: String? = null
	var multiAZ: Boolean? = false
	var engineVersion: String? = null
	var allowMajorVersionUpgrade: Boolean? = false
	var autoMinorVersionUpgrade: Boolean? = false
	var licenseModel: String? = null
	var iops: Int? = 0
	var optionGroupName: String? = null
	var newDBInstanceIdentifier: String? = null
	var storageType: String? = null
	var tdeCredentialArn: String? = null
	var tdeCredentialPassword: String? = null
	var cACertificateIdentifier: String? = null
	var domain: String? = null
	var copyTagsToSnapshot: Boolean? = false
	var monitoringInterval: Int? = 0
	var dBPortNumber: Int? = 0
	var publiclyAccessible: Boolean? = false
	var monitoringRoleArn: String? = null
	var domainIAMRoleName: String? = null
	var promotionTier: Int? = 0
	var enableIAMDatabaseAuthentication: Boolean? = false
	var enablePerformanceInsights: Boolean? = false
	var performanceInsightsKMSKeyId: String? = null
	var cloudwatchLogsExportConfiguration: com.amazonaws.services.rds.model.CloudwatchLogsExportConfiguration? = null

	override fun build(): com.amazonaws.services.rds.model.ModifyDBInstanceRequest {
		val input = com.amazonaws.services.rds.model.ModifyDBInstanceRequest()
		input.setDBInstanceIdentifier(this.dBInstanceIdentifier)
		input.setAllocatedStorage(this.allocatedStorage)
		input.setDBInstanceClass(this.dBInstanceClass)
		input.setDBSubnetGroupName(this.dBSubnetGroupName)
		input.setDBSecurityGroups(this.dBSecurityGroups)
		input.setVpcSecurityGroupIds(this.vpcSecurityGroupIds)
		input.setApplyImmediately(this.applyImmediately)
		input.setMasterUserPassword(this.masterUserPassword)
		input.setDBParameterGroupName(this.dBParameterGroupName)
		input.setBackupRetentionPeriod(this.backupRetentionPeriod)
		input.setPreferredBackupWindow(this.preferredBackupWindow)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setMultiAZ(this.multiAZ)
		input.setEngineVersion(this.engineVersion)
		input.setAllowMajorVersionUpgrade(this.allowMajorVersionUpgrade)
		input.setAutoMinorVersionUpgrade(this.autoMinorVersionUpgrade)
		input.setLicenseModel(this.licenseModel)
		input.setIops(this.iops)
		input.setOptionGroupName(this.optionGroupName)
		input.setNewDBInstanceIdentifier(this.newDBInstanceIdentifier)
		input.setStorageType(this.storageType)
		input.setTdeCredentialArn(this.tdeCredentialArn)
		input.setTdeCredentialPassword(this.tdeCredentialPassword)
		input.setCACertificateIdentifier(this.cACertificateIdentifier)
		input.setDomain(this.domain)
		input.setCopyTagsToSnapshot(this.copyTagsToSnapshot)
		input.setMonitoringInterval(this.monitoringInterval)
		input.setDBPortNumber(this.dBPortNumber)
		input.setPubliclyAccessible(this.publiclyAccessible)
		input.setMonitoringRoleArn(this.monitoringRoleArn)
		input.setDomainIAMRoleName(this.domainIAMRoleName)
		input.setPromotionTier(this.promotionTier)
		input.setEnableIAMDatabaseAuthentication(this.enableIAMDatabaseAuthentication)
		input.setEnablePerformanceInsights(this.enablePerformanceInsights)
		input.setPerformanceInsightsKMSKeyId(this.performanceInsightsKMSKeyId)
		input.setCloudwatchLogsExportConfiguration(this.cloudwatchLogsExportConfiguration)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.modifyDBInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds modify-dbinstance")
				.argument("dbinstance-identifier", dBInstanceIdentifier)
				.argument("allocated-storage", allocatedStorage?.toString())
				.argument("dbinstance-class", dBInstanceClass)
				.argument("dbsubnet-group-name", dBSubnetGroupName)
				.argument("dbsecurity-groups", dBSecurityGroups?.toString())
				.argument("vpc-security-group-ids", vpcSecurityGroupIds?.toString())
				.option("apply-immediately", applyImmediately ?: false)
				.argument("master-user-password", masterUserPassword)
				.argument("dbparameter-group-name", dBParameterGroupName)
				.argument("backup-retention-period", backupRetentionPeriod?.toString())
				.argument("preferred-backup-window", preferredBackupWindow)
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.option("multi-az", multiAZ ?: false)
				.argument("engine-version", engineVersion)
				.option("allow-major-version-upgrade", allowMajorVersionUpgrade ?: false)
				.option("auto-minor-version-upgrade", autoMinorVersionUpgrade ?: false)
				.argument("license-model", licenseModel)
				.argument("iops", iops?.toString())
				.argument("option-group-name", optionGroupName)
				.argument("new-dbinstance-identifier", newDBInstanceIdentifier)
				.argument("storage-type", storageType)
				.argument("tde-credential-arn", tdeCredentialArn)
				.argument("tde-credential-password", tdeCredentialPassword)
				.argument("cacertificate-identifier", cACertificateIdentifier)
				.argument("domain", domain)
				.option("copy-tags-to-snapshot", copyTagsToSnapshot ?: false)
				.argument("monitoring-interval", monitoringInterval?.toString())
				.argument("dbport-number", dBPortNumber?.toString())
				.option("publicly-accessible", publiclyAccessible ?: false)
				.argument("monitoring-role-arn", monitoringRoleArn)
				.argument("domain-iamrole-name", domainIAMRoleName)
				.argument("promotion-tier", promotionTier?.toString())
				.option("enable-iamdatabase-authentication", enableIAMDatabaseAuthentication ?: false)
				.option("enable-performance-insights", enablePerformanceInsights ?: false)
				.argument("performance-insights-kmskey-id", performanceInsightsKMSKeyId)
				.argument("cloudwatch-logs-export-configuration", cloudwatchLogsExportConfiguration?.toString())
	}

}


fun AmazonRDSFunctions.modifyDBParameterGroup(dBParameterGroupName: String, parameters: List<com.amazonaws.services.rds.model.Parameter>, init: AmazonRDSModifyDBParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSModifyDBParameterGroupCommand(dBParameterGroupName, parameters).apply(init))
}

@Generated
class AmazonRDSModifyDBParameterGroupCommand(val dBParameterGroupName: String, val parameters: List<com.amazonaws.services.rds.model.Parameter>) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.ModifyDBParameterGroupRequest> {



	override fun build(): com.amazonaws.services.rds.model.ModifyDBParameterGroupRequest {
		val input = com.amazonaws.services.rds.model.ModifyDBParameterGroupRequest()
		input.setDBParameterGroupName(this.dBParameterGroupName)
		input.setParameters(this.parameters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.modifyDBParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds modify-dbparameter-group")
				.argument("dbparameter-group-name", dBParameterGroupName)
				.argument("parameters", parameters.toString())
	}

}


fun AmazonRDSFunctions.modifyDBSnapshot(dBSnapshotIdentifier: String, init: AmazonRDSModifyDBSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonRDSModifyDBSnapshotCommand(dBSnapshotIdentifier).apply(init))
}

@Generated
class AmazonRDSModifyDBSnapshotCommand(val dBSnapshotIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.ModifyDBSnapshotRequest> {

	var engineVersion: String? = null
	var optionGroupName: String? = null

	override fun build(): com.amazonaws.services.rds.model.ModifyDBSnapshotRequest {
		val input = com.amazonaws.services.rds.model.ModifyDBSnapshotRequest()
		input.setDBSnapshotIdentifier(this.dBSnapshotIdentifier)
		input.setEngineVersion(this.engineVersion)
		input.setOptionGroupName(this.optionGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.modifyDBSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds modify-dbsnapshot")
				.argument("dbsnapshot-identifier", dBSnapshotIdentifier)
				.argument("engine-version", engineVersion)
				.argument("option-group-name", optionGroupName)
	}

}


fun AmazonRDSFunctions.modifyDBSnapshotAttribute(dBSnapshotIdentifier: String, attributeName: String, init: AmazonRDSModifyDBSnapshotAttributeCommand.() -> Unit) {
	this.block.declare(AmazonRDSModifyDBSnapshotAttributeCommand(dBSnapshotIdentifier, attributeName).apply(init))
}

@Generated
class AmazonRDSModifyDBSnapshotAttributeCommand(val dBSnapshotIdentifier: String, val attributeName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.ModifyDBSnapshotAttributeRequest> {

	var valuesToAdd: List<String>? = null
	var valuesToRemove: List<String>? = null

	override fun build(): com.amazonaws.services.rds.model.ModifyDBSnapshotAttributeRequest {
		val input = com.amazonaws.services.rds.model.ModifyDBSnapshotAttributeRequest()
		input.setDBSnapshotIdentifier(this.dBSnapshotIdentifier)
		input.setAttributeName(this.attributeName)
		input.setValuesToAdd(this.valuesToAdd)
		input.setValuesToRemove(this.valuesToRemove)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.modifyDBSnapshotAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds modify-dbsnapshot-attribute")
				.argument("dbsnapshot-identifier", dBSnapshotIdentifier)
				.argument("attribute-name", attributeName)
				.argument("values-to-add", valuesToAdd?.toString())
				.argument("values-to-remove", valuesToRemove?.toString())
	}

}


fun AmazonRDSFunctions.modifyDBSubnetGroup(dBSubnetGroupName: String, subnetIds: List<String>, init: AmazonRDSModifyDBSubnetGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSModifyDBSubnetGroupCommand(dBSubnetGroupName, subnetIds).apply(init))
}

@Generated
class AmazonRDSModifyDBSubnetGroupCommand(val dBSubnetGroupName: String, val subnetIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.ModifyDBSubnetGroupRequest> {

	var dBSubnetGroupDescription: String? = null

	override fun build(): com.amazonaws.services.rds.model.ModifyDBSubnetGroupRequest {
		val input = com.amazonaws.services.rds.model.ModifyDBSubnetGroupRequest()
		input.setDBSubnetGroupName(this.dBSubnetGroupName)
		input.setDBSubnetGroupDescription(this.dBSubnetGroupDescription)
		input.setSubnetIds(this.subnetIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.modifyDBSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds modify-dbsubnet-group")
				.argument("dbsubnet-group-name", dBSubnetGroupName)
				.argument("dbsubnet-group-description", dBSubnetGroupDescription)
				.argument("subnet-ids", subnetIds.toString())
	}

}


fun AmazonRDSFunctions.modifyEventSubscription(subscriptionName: String, init: AmazonRDSModifyEventSubscriptionCommand.() -> Unit) {
	this.block.declare(AmazonRDSModifyEventSubscriptionCommand(subscriptionName).apply(init))
}

@Generated
class AmazonRDSModifyEventSubscriptionCommand(val subscriptionName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.ModifyEventSubscriptionRequest> {

	var snsTopicArn: String? = null
	var sourceType: String? = null
	var eventCategories: List<String>? = null
	var enabled: Boolean? = false

	override fun build(): com.amazonaws.services.rds.model.ModifyEventSubscriptionRequest {
		val input = com.amazonaws.services.rds.model.ModifyEventSubscriptionRequest()
		input.setSubscriptionName(this.subscriptionName)
		input.setSnsTopicArn(this.snsTopicArn)
		input.setSourceType(this.sourceType)
		input.setEventCategories(this.eventCategories)
		input.setEnabled(this.enabled)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.modifyEventSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds modify-event-subscription")
				.argument("subscription-name", subscriptionName)
				.argument("sns-topic-arn", snsTopicArn)
				.argument("source-type", sourceType)
				.argument("event-categories", eventCategories?.toString())
				.option("enabled", enabled ?: false)
	}

}


fun AmazonRDSFunctions.modifyOptionGroup(optionGroupName: String, init: AmazonRDSModifyOptionGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSModifyOptionGroupCommand(optionGroupName).apply(init))
}

@Generated
class AmazonRDSModifyOptionGroupCommand(val optionGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.ModifyOptionGroupRequest> {

	var optionsToInclude: List<com.amazonaws.services.rds.model.OptionConfiguration>? = null
	var optionsToRemove: List<String>? = null
	var applyImmediately: Boolean? = false

	override fun build(): com.amazonaws.services.rds.model.ModifyOptionGroupRequest {
		val input = com.amazonaws.services.rds.model.ModifyOptionGroupRequest()
		input.setOptionGroupName(this.optionGroupName)
		input.setOptionsToInclude(this.optionsToInclude)
		input.setOptionsToRemove(this.optionsToRemove)
		input.setApplyImmediately(this.applyImmediately)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.modifyOptionGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds modify-option-group")
				.argument("option-group-name", optionGroupName)
				.argument("options-to-include", optionsToInclude?.toString())
				.argument("options-to-remove", optionsToRemove?.toString())
				.option("apply-immediately", applyImmediately ?: false)
	}

}


fun AmazonRDSFunctions.promoteReadReplica(dBInstanceIdentifier: String, init: AmazonRDSPromoteReadReplicaCommand.() -> Unit) {
	this.block.declare(AmazonRDSPromoteReadReplicaCommand(dBInstanceIdentifier).apply(init))
}

@Generated
class AmazonRDSPromoteReadReplicaCommand(val dBInstanceIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.PromoteReadReplicaRequest> {

	var backupRetentionPeriod: Int? = 0
	var preferredBackupWindow: String? = null

	override fun build(): com.amazonaws.services.rds.model.PromoteReadReplicaRequest {
		val input = com.amazonaws.services.rds.model.PromoteReadReplicaRequest()
		input.setDBInstanceIdentifier(this.dBInstanceIdentifier)
		input.setBackupRetentionPeriod(this.backupRetentionPeriod)
		input.setPreferredBackupWindow(this.preferredBackupWindow)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.promoteReadReplica(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds promote-read-replica")
				.argument("dbinstance-identifier", dBInstanceIdentifier)
				.argument("backup-retention-period", backupRetentionPeriod?.toString())
				.argument("preferred-backup-window", preferredBackupWindow)
	}

}


fun AmazonRDSFunctions.promoteReadReplicaDBCluster(dBClusterIdentifier: String, init: AmazonRDSPromoteReadReplicaDBClusterCommand.() -> Unit) {
	this.block.declare(AmazonRDSPromoteReadReplicaDBClusterCommand(dBClusterIdentifier).apply(init))
}

@Generated
class AmazonRDSPromoteReadReplicaDBClusterCommand(val dBClusterIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.PromoteReadReplicaDBClusterRequest> {



	override fun build(): com.amazonaws.services.rds.model.PromoteReadReplicaDBClusterRequest {
		val input = com.amazonaws.services.rds.model.PromoteReadReplicaDBClusterRequest()
		input.setDBClusterIdentifier(this.dBClusterIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.promoteReadReplicaDBCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds promote-read-replica-dbcluster")
				.argument("dbcluster-identifier", dBClusterIdentifier)
	}

}


fun AmazonRDSFunctions.purchaseReservedDBInstancesOffering(reservedDBInstancesOfferingId: String, init: AmazonRDSPurchaseReservedDBInstancesOfferingCommand.() -> Unit) {
	this.block.declare(AmazonRDSPurchaseReservedDBInstancesOfferingCommand(reservedDBInstancesOfferingId).apply(init))
}

@Generated
class AmazonRDSPurchaseReservedDBInstancesOfferingCommand(val reservedDBInstancesOfferingId: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.PurchaseReservedDBInstancesOfferingRequest> {

	var reservedDBInstanceId: String? = null
	var dBInstanceCount: Int? = 0
	var tags: List<com.amazonaws.services.rds.model.Tag>? = null

	override fun build(): com.amazonaws.services.rds.model.PurchaseReservedDBInstancesOfferingRequest {
		val input = com.amazonaws.services.rds.model.PurchaseReservedDBInstancesOfferingRequest()
		input.setReservedDBInstancesOfferingId(this.reservedDBInstancesOfferingId)
		input.setReservedDBInstanceId(this.reservedDBInstanceId)
		input.setDBInstanceCount(this.dBInstanceCount)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.purchaseReservedDBInstancesOffering(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds purchase-reserved-dbinstances-offering")
				.argument("reserved-dbinstances-offering-id", reservedDBInstancesOfferingId)
				.argument("reserved-dbinstance-id", reservedDBInstanceId)
				.argument("dbinstance-count", dBInstanceCount?.toString())
				.argument("tags", tags?.toString())
	}

}


fun AmazonRDSFunctions.rebootDBInstance(dBInstanceIdentifier: String, init: AmazonRDSRebootDBInstanceCommand.() -> Unit) {
	this.block.declare(AmazonRDSRebootDBInstanceCommand(dBInstanceIdentifier).apply(init))
}

@Generated
class AmazonRDSRebootDBInstanceCommand(val dBInstanceIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.RebootDBInstanceRequest> {

	var forceFailover: Boolean? = false

	override fun build(): com.amazonaws.services.rds.model.RebootDBInstanceRequest {
		val input = com.amazonaws.services.rds.model.RebootDBInstanceRequest()
		input.setDBInstanceIdentifier(this.dBInstanceIdentifier)
		input.setForceFailover(this.forceFailover)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.rebootDBInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds reboot-dbinstance")
				.argument("dbinstance-identifier", dBInstanceIdentifier)
				.option("force-failover", forceFailover ?: false)
	}

}


fun AmazonRDSFunctions.removeRoleFromDBCluster(dBClusterIdentifier: String, roleArn: String, init: AmazonRDSRemoveRoleFromDBClusterCommand.() -> Unit) {
	this.block.declare(AmazonRDSRemoveRoleFromDBClusterCommand(dBClusterIdentifier, roleArn).apply(init))
}

@Generated
class AmazonRDSRemoveRoleFromDBClusterCommand(val dBClusterIdentifier: String, val roleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.RemoveRoleFromDBClusterRequest> {



	override fun build(): com.amazonaws.services.rds.model.RemoveRoleFromDBClusterRequest {
		val input = com.amazonaws.services.rds.model.RemoveRoleFromDBClusterRequest()
		input.setDBClusterIdentifier(this.dBClusterIdentifier)
		input.setRoleArn(this.roleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.removeRoleFromDBCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds remove-role-from-dbcluster")
				.argument("dbcluster-identifier", dBClusterIdentifier)
				.argument("role-arn", roleArn)
	}

}


fun AmazonRDSFunctions.removeSourceIdentifierFromSubscription(subscriptionName: String, sourceIdentifier: String, init: AmazonRDSRemoveSourceIdentifierFromSubscriptionCommand.() -> Unit) {
	this.block.declare(AmazonRDSRemoveSourceIdentifierFromSubscriptionCommand(subscriptionName, sourceIdentifier).apply(init))
}

@Generated
class AmazonRDSRemoveSourceIdentifierFromSubscriptionCommand(val subscriptionName: String, val sourceIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.RemoveSourceIdentifierFromSubscriptionRequest> {



	override fun build(): com.amazonaws.services.rds.model.RemoveSourceIdentifierFromSubscriptionRequest {
		val input = com.amazonaws.services.rds.model.RemoveSourceIdentifierFromSubscriptionRequest()
		input.setSubscriptionName(this.subscriptionName)
		input.setSourceIdentifier(this.sourceIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.removeSourceIdentifierFromSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds remove-source-identifier-from-subscription")
				.argument("subscription-name", subscriptionName)
				.argument("source-identifier", sourceIdentifier)
	}

}


fun AmazonRDSFunctions.removeTagsFromResource(resourceName: String, tagKeys: List<String>, init: AmazonRDSRemoveTagsFromResourceCommand.() -> Unit) {
	this.block.declare(AmazonRDSRemoveTagsFromResourceCommand(resourceName, tagKeys).apply(init))
}

@Generated
class AmazonRDSRemoveTagsFromResourceCommand(val resourceName: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.RemoveTagsFromResourceRequest> {



	override fun build(): com.amazonaws.services.rds.model.RemoveTagsFromResourceRequest {
		val input = com.amazonaws.services.rds.model.RemoveTagsFromResourceRequest()
		input.setResourceName(this.resourceName)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.removeTagsFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds remove-tags-from-resource")
				.argument("resource-name", resourceName)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonRDSFunctions.resetDBClusterParameterGroup(dBClusterParameterGroupName: String, init: AmazonRDSResetDBClusterParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSResetDBClusterParameterGroupCommand(dBClusterParameterGroupName).apply(init))
}

@Generated
class AmazonRDSResetDBClusterParameterGroupCommand(val dBClusterParameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.ResetDBClusterParameterGroupRequest> {

	var resetAllParameters: Boolean? = false
	var parameters: List<com.amazonaws.services.rds.model.Parameter>? = null

	override fun build(): com.amazonaws.services.rds.model.ResetDBClusterParameterGroupRequest {
		val input = com.amazonaws.services.rds.model.ResetDBClusterParameterGroupRequest()
		input.setDBClusterParameterGroupName(this.dBClusterParameterGroupName)
		input.setResetAllParameters(this.resetAllParameters)
		input.setParameters(this.parameters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.resetDBClusterParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds reset-dbcluster-parameter-group")
				.argument("dbcluster-parameter-group-name", dBClusterParameterGroupName)
				.option("reset-all-parameters", resetAllParameters ?: false)
				.argument("parameters", parameters?.toString())
	}

}


fun AmazonRDSFunctions.resetDBParameterGroup(dBParameterGroupName: String, init: AmazonRDSResetDBParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonRDSResetDBParameterGroupCommand(dBParameterGroupName).apply(init))
}

@Generated
class AmazonRDSResetDBParameterGroupCommand(val dBParameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.ResetDBParameterGroupRequest> {

	var resetAllParameters: Boolean? = false
	var parameters: List<com.amazonaws.services.rds.model.Parameter>? = null

	override fun build(): com.amazonaws.services.rds.model.ResetDBParameterGroupRequest {
		val input = com.amazonaws.services.rds.model.ResetDBParameterGroupRequest()
		input.setDBParameterGroupName(this.dBParameterGroupName)
		input.setResetAllParameters(this.resetAllParameters)
		input.setParameters(this.parameters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.resetDBParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds reset-dbparameter-group")
				.argument("dbparameter-group-name", dBParameterGroupName)
				.option("reset-all-parameters", resetAllParameters ?: false)
				.argument("parameters", parameters?.toString())
	}

}


fun AmazonRDSFunctions.restoreDBClusterFromS3(dBClusterIdentifier: String, engine: String, masterUsername: String, masterUserPassword: String, sourceEngine: String, sourceEngineVersion: String, s3BucketName: String, s3IngestionRoleArn: String, init: AmazonRDSRestoreDBClusterFromS3Command.() -> Unit) {
	this.block.declare(AmazonRDSRestoreDBClusterFromS3Command(dBClusterIdentifier, engine, masterUsername, masterUserPassword, sourceEngine, sourceEngineVersion, s3BucketName, s3IngestionRoleArn).apply(init))
}

@Generated
class AmazonRDSRestoreDBClusterFromS3Command(val dBClusterIdentifier: String, val engine: String, val masterUsername: String, val masterUserPassword: String, val sourceEngine: String, val sourceEngineVersion: String, val s3BucketName: String, val s3IngestionRoleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.RestoreDBClusterFromS3Request> {

	var availabilityZones: List<String>? = null
	var backupRetentionPeriod: Int? = 0
	var characterSetName: String? = null
	var databaseName: String? = null
	var dBClusterParameterGroupName: String? = null
	var vpcSecurityGroupIds: List<String>? = null
	var dBSubnetGroupName: String? = null
	var engineVersion: String? = null
	var port: Int? = 0
	var optionGroupName: String? = null
	var preferredBackupWindow: String? = null
	var preferredMaintenanceWindow: String? = null
	var tags: List<com.amazonaws.services.rds.model.Tag>? = null
	var storageEncrypted: Boolean? = false
	var kmsKeyId: String? = null
	var enableIAMDatabaseAuthentication: Boolean? = false
	var s3Prefix: String? = null

	override fun build(): com.amazonaws.services.rds.model.RestoreDBClusterFromS3Request {
		val input = com.amazonaws.services.rds.model.RestoreDBClusterFromS3Request()
		input.setAvailabilityZones(this.availabilityZones)
		input.setBackupRetentionPeriod(this.backupRetentionPeriod)
		input.setCharacterSetName(this.characterSetName)
		input.setDatabaseName(this.databaseName)
		input.setDBClusterIdentifier(this.dBClusterIdentifier)
		input.setDBClusterParameterGroupName(this.dBClusterParameterGroupName)
		input.setVpcSecurityGroupIds(this.vpcSecurityGroupIds)
		input.setDBSubnetGroupName(this.dBSubnetGroupName)
		input.setEngine(this.engine)
		input.setEngineVersion(this.engineVersion)
		input.setPort(this.port)
		input.setMasterUsername(this.masterUsername)
		input.setMasterUserPassword(this.masterUserPassword)
		input.setOptionGroupName(this.optionGroupName)
		input.setPreferredBackupWindow(this.preferredBackupWindow)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setTags(this.tags)
		input.setStorageEncrypted(this.storageEncrypted)
		input.setKmsKeyId(this.kmsKeyId)
		input.setEnableIAMDatabaseAuthentication(this.enableIAMDatabaseAuthentication)
		input.setSourceEngine(this.sourceEngine)
		input.setSourceEngineVersion(this.sourceEngineVersion)
		input.setS3BucketName(this.s3BucketName)
		input.setS3Prefix(this.s3Prefix)
		input.setS3IngestionRoleArn(this.s3IngestionRoleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.restoreDBClusterFromS3(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds restore-dbcluster-from-s3")
				.argument("availability-zones", availabilityZones?.toString())
				.argument("backup-retention-period", backupRetentionPeriod?.toString())
				.argument("character-set-name", characterSetName)
				.argument("database-name", databaseName)
				.argument("dbcluster-identifier", dBClusterIdentifier)
				.argument("dbcluster-parameter-group-name", dBClusterParameterGroupName)
				.argument("vpc-security-group-ids", vpcSecurityGroupIds?.toString())
				.argument("dbsubnet-group-name", dBSubnetGroupName)
				.argument("engine", engine)
				.argument("engine-version", engineVersion)
				.argument("port", port?.toString())
				.argument("master-username", masterUsername)
				.argument("master-user-password", masterUserPassword)
				.argument("option-group-name", optionGroupName)
				.argument("preferred-backup-window", preferredBackupWindow)
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.argument("tags", tags?.toString())
				.option("storage-encrypted", storageEncrypted ?: false)
				.argument("kms-key-id", kmsKeyId)
				.option("enable-iamdatabase-authentication", enableIAMDatabaseAuthentication ?: false)
				.argument("source-engine", sourceEngine)
				.argument("source-engine-version", sourceEngineVersion)
				.argument("s3-bucket-name", s3BucketName)
				.argument("s3-prefix", s3Prefix)
				.argument("s3-ingestion-role-arn", s3IngestionRoleArn)
	}

}


fun AmazonRDSFunctions.restoreDBClusterFromSnapshot(dBClusterIdentifier: String, snapshotIdentifier: String, engine: String, init: AmazonRDSRestoreDBClusterFromSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonRDSRestoreDBClusterFromSnapshotCommand(dBClusterIdentifier, snapshotIdentifier, engine).apply(init))
}

@Generated
class AmazonRDSRestoreDBClusterFromSnapshotCommand(val dBClusterIdentifier: String, val snapshotIdentifier: String, val engine: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.RestoreDBClusterFromSnapshotRequest> {

	var availabilityZones: List<String>? = null
	var engineVersion: String? = null
	var port: Int? = 0
	var dBSubnetGroupName: String? = null
	var databaseName: String? = null
	var optionGroupName: String? = null
	var vpcSecurityGroupIds: List<String>? = null
	var tags: List<com.amazonaws.services.rds.model.Tag>? = null
	var kmsKeyId: String? = null
	var enableIAMDatabaseAuthentication: Boolean? = false

	override fun build(): com.amazonaws.services.rds.model.RestoreDBClusterFromSnapshotRequest {
		val input = com.amazonaws.services.rds.model.RestoreDBClusterFromSnapshotRequest()
		input.setAvailabilityZones(this.availabilityZones)
		input.setDBClusterIdentifier(this.dBClusterIdentifier)
		input.setSnapshotIdentifier(this.snapshotIdentifier)
		input.setEngine(this.engine)
		input.setEngineVersion(this.engineVersion)
		input.setPort(this.port)
		input.setDBSubnetGroupName(this.dBSubnetGroupName)
		input.setDatabaseName(this.databaseName)
		input.setOptionGroupName(this.optionGroupName)
		input.setVpcSecurityGroupIds(this.vpcSecurityGroupIds)
		input.setTags(this.tags)
		input.setKmsKeyId(this.kmsKeyId)
		input.setEnableIAMDatabaseAuthentication(this.enableIAMDatabaseAuthentication)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.restoreDBClusterFromSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds restore-dbcluster-from-snapshot")
				.argument("availability-zones", availabilityZones?.toString())
				.argument("dbcluster-identifier", dBClusterIdentifier)
				.argument("snapshot-identifier", snapshotIdentifier)
				.argument("engine", engine)
				.argument("engine-version", engineVersion)
				.argument("port", port?.toString())
				.argument("dbsubnet-group-name", dBSubnetGroupName)
				.argument("database-name", databaseName)
				.argument("option-group-name", optionGroupName)
				.argument("vpc-security-group-ids", vpcSecurityGroupIds?.toString())
				.argument("tags", tags?.toString())
				.argument("kms-key-id", kmsKeyId)
				.option("enable-iamdatabase-authentication", enableIAMDatabaseAuthentication ?: false)
	}

}


fun AmazonRDSFunctions.restoreDBClusterToPointInTime(dBClusterIdentifier: String, sourceDBClusterIdentifier: String, init: AmazonRDSRestoreDBClusterToPointInTimeCommand.() -> Unit) {
	this.block.declare(AmazonRDSRestoreDBClusterToPointInTimeCommand(dBClusterIdentifier, sourceDBClusterIdentifier).apply(init))
}

@Generated
class AmazonRDSRestoreDBClusterToPointInTimeCommand(val dBClusterIdentifier: String, val sourceDBClusterIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.RestoreDBClusterToPointInTimeRequest> {

	var restoreType: String? = null
	var restoreToTime: java.util.Date? = null
	var useLatestRestorableTime: Boolean? = false
	var port: Int? = 0
	var dBSubnetGroupName: String? = null
	var optionGroupName: String? = null
	var vpcSecurityGroupIds: List<String>? = null
	var tags: List<com.amazonaws.services.rds.model.Tag>? = null
	var kmsKeyId: String? = null
	var enableIAMDatabaseAuthentication: Boolean? = false

	override fun build(): com.amazonaws.services.rds.model.RestoreDBClusterToPointInTimeRequest {
		val input = com.amazonaws.services.rds.model.RestoreDBClusterToPointInTimeRequest()
		input.setDBClusterIdentifier(this.dBClusterIdentifier)
		input.setRestoreType(this.restoreType)
		input.setSourceDBClusterIdentifier(this.sourceDBClusterIdentifier)
		input.setRestoreToTime(this.restoreToTime)
		input.setUseLatestRestorableTime(this.useLatestRestorableTime)
		input.setPort(this.port)
		input.setDBSubnetGroupName(this.dBSubnetGroupName)
		input.setOptionGroupName(this.optionGroupName)
		input.setVpcSecurityGroupIds(this.vpcSecurityGroupIds)
		input.setTags(this.tags)
		input.setKmsKeyId(this.kmsKeyId)
		input.setEnableIAMDatabaseAuthentication(this.enableIAMDatabaseAuthentication)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.restoreDBClusterToPointInTime(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds restore-dbcluster-to-point-in-time")
				.argument("dbcluster-identifier", dBClusterIdentifier)
				.argument("restore-type", restoreType)
				.argument("source-dbcluster-identifier", sourceDBClusterIdentifier)
				.argument("restore-to-time", restoreToTime?.toString())
				.option("use-latest-restorable-time", useLatestRestorableTime ?: false)
				.argument("port", port?.toString())
				.argument("dbsubnet-group-name", dBSubnetGroupName)
				.argument("option-group-name", optionGroupName)
				.argument("vpc-security-group-ids", vpcSecurityGroupIds?.toString())
				.argument("tags", tags?.toString())
				.argument("kms-key-id", kmsKeyId)
				.option("enable-iamdatabase-authentication", enableIAMDatabaseAuthentication ?: false)
	}

}


fun AmazonRDSFunctions.restoreDBInstanceFromDBSnapshot(dBInstanceIdentifier: String, dBSnapshotIdentifier: String, init: AmazonRDSRestoreDBInstanceFromDBSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonRDSRestoreDBInstanceFromDBSnapshotCommand(dBInstanceIdentifier, dBSnapshotIdentifier).apply(init))
}

@Generated
class AmazonRDSRestoreDBInstanceFromDBSnapshotCommand(val dBInstanceIdentifier: String, val dBSnapshotIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.RestoreDBInstanceFromDBSnapshotRequest> {

	var dBInstanceClass: String? = null
	var port: Int? = 0
	var availabilityZone: String? = null
	var dBSubnetGroupName: String? = null
	var multiAZ: Boolean? = false
	var publiclyAccessible: Boolean? = false
	var autoMinorVersionUpgrade: Boolean? = false
	var licenseModel: String? = null
	var dBName: String? = null
	var engine: String? = null
	var iops: Int? = 0
	var optionGroupName: String? = null
	var tags: List<com.amazonaws.services.rds.model.Tag>? = null
	var storageType: String? = null
	var tdeCredentialArn: String? = null
	var tdeCredentialPassword: String? = null
	var domain: String? = null
	var copyTagsToSnapshot: Boolean? = false
	var domainIAMRoleName: String? = null
	var enableIAMDatabaseAuthentication: Boolean? = false
	var enableCloudwatchLogsExports: List<String>? = null

	override fun build(): com.amazonaws.services.rds.model.RestoreDBInstanceFromDBSnapshotRequest {
		val input = com.amazonaws.services.rds.model.RestoreDBInstanceFromDBSnapshotRequest()
		input.setDBInstanceIdentifier(this.dBInstanceIdentifier)
		input.setDBSnapshotIdentifier(this.dBSnapshotIdentifier)
		input.setDBInstanceClass(this.dBInstanceClass)
		input.setPort(this.port)
		input.setAvailabilityZone(this.availabilityZone)
		input.setDBSubnetGroupName(this.dBSubnetGroupName)
		input.setMultiAZ(this.multiAZ)
		input.setPubliclyAccessible(this.publiclyAccessible)
		input.setAutoMinorVersionUpgrade(this.autoMinorVersionUpgrade)
		input.setLicenseModel(this.licenseModel)
		input.setDBName(this.dBName)
		input.setEngine(this.engine)
		input.setIops(this.iops)
		input.setOptionGroupName(this.optionGroupName)
		input.setTags(this.tags)
		input.setStorageType(this.storageType)
		input.setTdeCredentialArn(this.tdeCredentialArn)
		input.setTdeCredentialPassword(this.tdeCredentialPassword)
		input.setDomain(this.domain)
		input.setCopyTagsToSnapshot(this.copyTagsToSnapshot)
		input.setDomainIAMRoleName(this.domainIAMRoleName)
		input.setEnableIAMDatabaseAuthentication(this.enableIAMDatabaseAuthentication)
		input.setEnableCloudwatchLogsExports(this.enableCloudwatchLogsExports)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.restoreDBInstanceFromDBSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds restore-dbinstance-from-dbsnapshot")
				.argument("dbinstance-identifier", dBInstanceIdentifier)
				.argument("dbsnapshot-identifier", dBSnapshotIdentifier)
				.argument("dbinstance-class", dBInstanceClass)
				.argument("port", port?.toString())
				.argument("availability-zone", availabilityZone)
				.argument("dbsubnet-group-name", dBSubnetGroupName)
				.option("multi-az", multiAZ ?: false)
				.option("publicly-accessible", publiclyAccessible ?: false)
				.option("auto-minor-version-upgrade", autoMinorVersionUpgrade ?: false)
				.argument("license-model", licenseModel)
				.argument("dbname", dBName)
				.argument("engine", engine)
				.argument("iops", iops?.toString())
				.argument("option-group-name", optionGroupName)
				.argument("tags", tags?.toString())
				.argument("storage-type", storageType)
				.argument("tde-credential-arn", tdeCredentialArn)
				.argument("tde-credential-password", tdeCredentialPassword)
				.argument("domain", domain)
				.option("copy-tags-to-snapshot", copyTagsToSnapshot ?: false)
				.argument("domain-iamrole-name", domainIAMRoleName)
				.option("enable-iamdatabase-authentication", enableIAMDatabaseAuthentication ?: false)
				.argument("enable-cloudwatch-logs-exports", enableCloudwatchLogsExports?.toString())
	}

}


fun AmazonRDSFunctions.restoreDBInstanceFromS3(dBInstanceIdentifier: String, dBInstanceClass: String, engine: String, sourceEngine: String, sourceEngineVersion: String, s3BucketName: String, s3IngestionRoleArn: String, init: AmazonRDSRestoreDBInstanceFromS3Command.() -> Unit) {
	this.block.declare(AmazonRDSRestoreDBInstanceFromS3Command(dBInstanceIdentifier, dBInstanceClass, engine, sourceEngine, sourceEngineVersion, s3BucketName, s3IngestionRoleArn).apply(init))
}

@Generated
class AmazonRDSRestoreDBInstanceFromS3Command(val dBInstanceIdentifier: String, val dBInstanceClass: String, val engine: String, val sourceEngine: String, val sourceEngineVersion: String, val s3BucketName: String, val s3IngestionRoleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.RestoreDBInstanceFromS3Request> {

	var dBName: String? = null
	var allocatedStorage: Int? = 0
	var masterUsername: String? = null
	var masterUserPassword: String? = null
	var dBSecurityGroups: List<String>? = null
	var vpcSecurityGroupIds: List<String>? = null
	var availabilityZone: String? = null
	var dBSubnetGroupName: String? = null
	var preferredMaintenanceWindow: String? = null
	var dBParameterGroupName: String? = null
	var backupRetentionPeriod: Int? = 0
	var preferredBackupWindow: String? = null
	var port: Int? = 0
	var multiAZ: Boolean? = false
	var engineVersion: String? = null
	var autoMinorVersionUpgrade: Boolean? = false
	var licenseModel: String? = null
	var iops: Int? = 0
	var optionGroupName: String? = null
	var publiclyAccessible: Boolean? = false
	var tags: List<com.amazonaws.services.rds.model.Tag>? = null
	var storageType: String? = null
	var storageEncrypted: Boolean? = false
	var kmsKeyId: String? = null
	var copyTagsToSnapshot: Boolean? = false
	var monitoringInterval: Int? = 0
	var monitoringRoleArn: String? = null
	var enableIAMDatabaseAuthentication: Boolean? = false
	var s3Prefix: String? = null
	var enablePerformanceInsights: Boolean? = false
	var performanceInsightsKMSKeyId: String? = null
	var enableCloudwatchLogsExports: List<String>? = null

	override fun build(): com.amazonaws.services.rds.model.RestoreDBInstanceFromS3Request {
		val input = com.amazonaws.services.rds.model.RestoreDBInstanceFromS3Request()
		input.setDBName(this.dBName)
		input.setDBInstanceIdentifier(this.dBInstanceIdentifier)
		input.setAllocatedStorage(this.allocatedStorage)
		input.setDBInstanceClass(this.dBInstanceClass)
		input.setEngine(this.engine)
		input.setMasterUsername(this.masterUsername)
		input.setMasterUserPassword(this.masterUserPassword)
		input.setDBSecurityGroups(this.dBSecurityGroups)
		input.setVpcSecurityGroupIds(this.vpcSecurityGroupIds)
		input.setAvailabilityZone(this.availabilityZone)
		input.setDBSubnetGroupName(this.dBSubnetGroupName)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setDBParameterGroupName(this.dBParameterGroupName)
		input.setBackupRetentionPeriod(this.backupRetentionPeriod)
		input.setPreferredBackupWindow(this.preferredBackupWindow)
		input.setPort(this.port)
		input.setMultiAZ(this.multiAZ)
		input.setEngineVersion(this.engineVersion)
		input.setAutoMinorVersionUpgrade(this.autoMinorVersionUpgrade)
		input.setLicenseModel(this.licenseModel)
		input.setIops(this.iops)
		input.setOptionGroupName(this.optionGroupName)
		input.setPubliclyAccessible(this.publiclyAccessible)
		input.setTags(this.tags)
		input.setStorageType(this.storageType)
		input.setStorageEncrypted(this.storageEncrypted)
		input.setKmsKeyId(this.kmsKeyId)
		input.setCopyTagsToSnapshot(this.copyTagsToSnapshot)
		input.setMonitoringInterval(this.monitoringInterval)
		input.setMonitoringRoleArn(this.monitoringRoleArn)
		input.setEnableIAMDatabaseAuthentication(this.enableIAMDatabaseAuthentication)
		input.setSourceEngine(this.sourceEngine)
		input.setSourceEngineVersion(this.sourceEngineVersion)
		input.setS3BucketName(this.s3BucketName)
		input.setS3Prefix(this.s3Prefix)
		input.setS3IngestionRoleArn(this.s3IngestionRoleArn)
		input.setEnablePerformanceInsights(this.enablePerformanceInsights)
		input.setPerformanceInsightsKMSKeyId(this.performanceInsightsKMSKeyId)
		input.setEnableCloudwatchLogsExports(this.enableCloudwatchLogsExports)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.restoreDBInstanceFromS3(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds restore-dbinstance-from-s3")
				.argument("dbname", dBName)
				.argument("dbinstance-identifier", dBInstanceIdentifier)
				.argument("allocated-storage", allocatedStorage?.toString())
				.argument("dbinstance-class", dBInstanceClass)
				.argument("engine", engine)
				.argument("master-username", masterUsername)
				.argument("master-user-password", masterUserPassword)
				.argument("dbsecurity-groups", dBSecurityGroups?.toString())
				.argument("vpc-security-group-ids", vpcSecurityGroupIds?.toString())
				.argument("availability-zone", availabilityZone)
				.argument("dbsubnet-group-name", dBSubnetGroupName)
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.argument("dbparameter-group-name", dBParameterGroupName)
				.argument("backup-retention-period", backupRetentionPeriod?.toString())
				.argument("preferred-backup-window", preferredBackupWindow)
				.argument("port", port?.toString())
				.option("multi-az", multiAZ ?: false)
				.argument("engine-version", engineVersion)
				.option("auto-minor-version-upgrade", autoMinorVersionUpgrade ?: false)
				.argument("license-model", licenseModel)
				.argument("iops", iops?.toString())
				.argument("option-group-name", optionGroupName)
				.option("publicly-accessible", publiclyAccessible ?: false)
				.argument("tags", tags?.toString())
				.argument("storage-type", storageType)
				.option("storage-encrypted", storageEncrypted ?: false)
				.argument("kms-key-id", kmsKeyId)
				.option("copy-tags-to-snapshot", copyTagsToSnapshot ?: false)
				.argument("monitoring-interval", monitoringInterval?.toString())
				.argument("monitoring-role-arn", monitoringRoleArn)
				.option("enable-iamdatabase-authentication", enableIAMDatabaseAuthentication ?: false)
				.argument("source-engine", sourceEngine)
				.argument("source-engine-version", sourceEngineVersion)
				.argument("s3-bucket-name", s3BucketName)
				.argument("s3-prefix", s3Prefix)
				.argument("s3-ingestion-role-arn", s3IngestionRoleArn)
				.option("enable-performance-insights", enablePerformanceInsights ?: false)
				.argument("performance-insights-kmskey-id", performanceInsightsKMSKeyId)
				.argument("enable-cloudwatch-logs-exports", enableCloudwatchLogsExports?.toString())
	}

}


fun AmazonRDSFunctions.restoreDBInstanceToPointInTime(sourceDBInstanceIdentifier: String, targetDBInstanceIdentifier: String, init: AmazonRDSRestoreDBInstanceToPointInTimeCommand.() -> Unit) {
	this.block.declare(AmazonRDSRestoreDBInstanceToPointInTimeCommand(sourceDBInstanceIdentifier, targetDBInstanceIdentifier).apply(init))
}

@Generated
class AmazonRDSRestoreDBInstanceToPointInTimeCommand(val sourceDBInstanceIdentifier: String, val targetDBInstanceIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.RestoreDBInstanceToPointInTimeRequest> {

	var restoreTime: java.util.Date? = null
	var useLatestRestorableTime: Boolean? = false
	var dBInstanceClass: String? = null
	var port: Int? = 0
	var availabilityZone: String? = null
	var dBSubnetGroupName: String? = null
	var multiAZ: Boolean? = false
	var publiclyAccessible: Boolean? = false
	var autoMinorVersionUpgrade: Boolean? = false
	var licenseModel: String? = null
	var dBName: String? = null
	var engine: String? = null
	var iops: Int? = 0
	var optionGroupName: String? = null
	var copyTagsToSnapshot: Boolean? = false
	var tags: List<com.amazonaws.services.rds.model.Tag>? = null
	var storageType: String? = null
	var tdeCredentialArn: String? = null
	var tdeCredentialPassword: String? = null
	var domain: String? = null
	var domainIAMRoleName: String? = null
	var enableIAMDatabaseAuthentication: Boolean? = false
	var enableCloudwatchLogsExports: List<String>? = null

	override fun build(): com.amazonaws.services.rds.model.RestoreDBInstanceToPointInTimeRequest {
		val input = com.amazonaws.services.rds.model.RestoreDBInstanceToPointInTimeRequest()
		input.setSourceDBInstanceIdentifier(this.sourceDBInstanceIdentifier)
		input.setTargetDBInstanceIdentifier(this.targetDBInstanceIdentifier)
		input.setRestoreTime(this.restoreTime)
		input.setUseLatestRestorableTime(this.useLatestRestorableTime)
		input.setDBInstanceClass(this.dBInstanceClass)
		input.setPort(this.port)
		input.setAvailabilityZone(this.availabilityZone)
		input.setDBSubnetGroupName(this.dBSubnetGroupName)
		input.setMultiAZ(this.multiAZ)
		input.setPubliclyAccessible(this.publiclyAccessible)
		input.setAutoMinorVersionUpgrade(this.autoMinorVersionUpgrade)
		input.setLicenseModel(this.licenseModel)
		input.setDBName(this.dBName)
		input.setEngine(this.engine)
		input.setIops(this.iops)
		input.setOptionGroupName(this.optionGroupName)
		input.setCopyTagsToSnapshot(this.copyTagsToSnapshot)
		input.setTags(this.tags)
		input.setStorageType(this.storageType)
		input.setTdeCredentialArn(this.tdeCredentialArn)
		input.setTdeCredentialPassword(this.tdeCredentialPassword)
		input.setDomain(this.domain)
		input.setDomainIAMRoleName(this.domainIAMRoleName)
		input.setEnableIAMDatabaseAuthentication(this.enableIAMDatabaseAuthentication)
		input.setEnableCloudwatchLogsExports(this.enableCloudwatchLogsExports)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.restoreDBInstanceToPointInTime(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds restore-dbinstance-to-point-in-time")
				.argument("source-dbinstance-identifier", sourceDBInstanceIdentifier)
				.argument("target-dbinstance-identifier", targetDBInstanceIdentifier)
				.argument("restore-time", restoreTime?.toString())
				.option("use-latest-restorable-time", useLatestRestorableTime ?: false)
				.argument("dbinstance-class", dBInstanceClass)
				.argument("port", port?.toString())
				.argument("availability-zone", availabilityZone)
				.argument("dbsubnet-group-name", dBSubnetGroupName)
				.option("multi-az", multiAZ ?: false)
				.option("publicly-accessible", publiclyAccessible ?: false)
				.option("auto-minor-version-upgrade", autoMinorVersionUpgrade ?: false)
				.argument("license-model", licenseModel)
				.argument("dbname", dBName)
				.argument("engine", engine)
				.argument("iops", iops?.toString())
				.argument("option-group-name", optionGroupName)
				.option("copy-tags-to-snapshot", copyTagsToSnapshot ?: false)
				.argument("tags", tags?.toString())
				.argument("storage-type", storageType)
				.argument("tde-credential-arn", tdeCredentialArn)
				.argument("tde-credential-password", tdeCredentialPassword)
				.argument("domain", domain)
				.argument("domain-iamrole-name", domainIAMRoleName)
				.option("enable-iamdatabase-authentication", enableIAMDatabaseAuthentication ?: false)
				.argument("enable-cloudwatch-logs-exports", enableCloudwatchLogsExports?.toString())
	}

}


fun AmazonRDSFunctions.revokeDBSecurityGroupIngress(dBSecurityGroupName: String, init: AmazonRDSRevokeDBSecurityGroupIngressCommand.() -> Unit) {
	this.block.declare(AmazonRDSRevokeDBSecurityGroupIngressCommand(dBSecurityGroupName).apply(init))
}

@Generated
class AmazonRDSRevokeDBSecurityGroupIngressCommand(val dBSecurityGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.RevokeDBSecurityGroupIngressRequest> {

	var cIDRIP: String? = null
	var eC2SecurityGroupName: String? = null
	var eC2SecurityGroupId: String? = null
	var eC2SecurityGroupOwnerId: String? = null

	override fun build(): com.amazonaws.services.rds.model.RevokeDBSecurityGroupIngressRequest {
		val input = com.amazonaws.services.rds.model.RevokeDBSecurityGroupIngressRequest()
		input.setDBSecurityGroupName(this.dBSecurityGroupName)
		input.setCIDRIP(this.cIDRIP)
		input.setEC2SecurityGroupName(this.eC2SecurityGroupName)
		input.setEC2SecurityGroupId(this.eC2SecurityGroupId)
		input.setEC2SecurityGroupOwnerId(this.eC2SecurityGroupOwnerId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.revokeDBSecurityGroupIngress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds revoke-dbsecurity-group-ingress")
				.argument("dbsecurity-group-name", dBSecurityGroupName)
				.argument("cidrip", cIDRIP)
				.argument("ec2-security-group-name", eC2SecurityGroupName)
				.argument("ec2-security-group-id", eC2SecurityGroupId)
				.argument("ec2-security-group-owner-id", eC2SecurityGroupOwnerId)
	}

}


fun AmazonRDSFunctions.startDBInstance(dBInstanceIdentifier: String, init: AmazonRDSStartDBInstanceCommand.() -> Unit) {
	this.block.declare(AmazonRDSStartDBInstanceCommand(dBInstanceIdentifier).apply(init))
}

@Generated
class AmazonRDSStartDBInstanceCommand(val dBInstanceIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.StartDBInstanceRequest> {



	override fun build(): com.amazonaws.services.rds.model.StartDBInstanceRequest {
		val input = com.amazonaws.services.rds.model.StartDBInstanceRequest()
		input.setDBInstanceIdentifier(this.dBInstanceIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.startDBInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds start-dbinstance")
				.argument("dbinstance-identifier", dBInstanceIdentifier)
	}

}


fun AmazonRDSFunctions.stopDBInstance(dBInstanceIdentifier: String, init: AmazonRDSStopDBInstanceCommand.() -> Unit) {
	this.block.declare(AmazonRDSStopDBInstanceCommand(dBInstanceIdentifier).apply(init))
}

@Generated
class AmazonRDSStopDBInstanceCommand(val dBInstanceIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.rds.model.StopDBInstanceRequest> {

	var dBSnapshotIdentifier: String? = null

	override fun build(): com.amazonaws.services.rds.model.StopDBInstanceRequest {
		val input = com.amazonaws.services.rds.model.StopDBInstanceRequest()
		input.setDBInstanceIdentifier(this.dBInstanceIdentifier)
		input.setDBSnapshotIdentifier(this.dBSnapshotIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.rds.stopDBInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws rds stop-dbinstance")
				.argument("dbinstance-identifier", dBInstanceIdentifier)
				.argument("dbsnapshot-identifier", dBSnapshotIdentifier)
	}

}