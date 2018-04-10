
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.elasticache.AmazonElastiCache
import com.amazonaws.services.elasticache.model.*

var codingue.koops.core.Environment.elasticache: AmazonElastiCache
	get() = this.capabilities[AmazonElastiCache::class.java.name] as AmazonElastiCache
	set(elasticache) {
		this.capabilities[AmazonElastiCache::class.java.name] = elasticache
	}

@Generated
class AmazonElastiCacheFunctions(val block: Block)

infix fun AwsContinuation.elasticache(init: AmazonElastiCacheFunctions.() -> Unit) {
	AmazonElastiCacheFunctions(shell).apply(init)
}

			

fun AmazonElastiCacheFunctions.addTagsToResource(resourceName: String, tags: List<com.amazonaws.services.elasticache.model.Tag>, init: AmazonElastiCacheAddTagsToResourceCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheAddTagsToResourceCommand(resourceName, tags).apply(init))
}

@Generated
class AmazonElastiCacheAddTagsToResourceCommand(val resourceName: String, val tags: List<com.amazonaws.services.elasticache.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.AddTagsToResourceRequest> {



	override fun build(): com.amazonaws.services.elasticache.model.AddTagsToResourceRequest {
		val input = com.amazonaws.services.elasticache.model.AddTagsToResourceRequest()
		input.setResourceName(this.resourceName)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.addTagsToResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache add-tags-to-resource")
				.argument("resource-name", resourceName)
				.argument("tags", tags.toString())
	}

}


fun AmazonElastiCacheFunctions.authorizeCacheSecurityGroupIngress(cacheSecurityGroupName: String, eC2SecurityGroupName: String, eC2SecurityGroupOwnerId: String, init: AmazonElastiCacheAuthorizeCacheSecurityGroupIngressCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheAuthorizeCacheSecurityGroupIngressCommand(cacheSecurityGroupName, eC2SecurityGroupName, eC2SecurityGroupOwnerId).apply(init))
}

@Generated
class AmazonElastiCacheAuthorizeCacheSecurityGroupIngressCommand(val cacheSecurityGroupName: String, val eC2SecurityGroupName: String, val eC2SecurityGroupOwnerId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest> {



	override fun build(): com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest {
		val input = com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest()
		input.setCacheSecurityGroupName(this.cacheSecurityGroupName)
		input.setEC2SecurityGroupName(this.eC2SecurityGroupName)
		input.setEC2SecurityGroupOwnerId(this.eC2SecurityGroupOwnerId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.authorizeCacheSecurityGroupIngress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache authorize-cache-security-group-ingress")
				.argument("cache-security-group-name", cacheSecurityGroupName)
				.argument("ec2-security-group-name", eC2SecurityGroupName)
				.argument("ec2-security-group-owner-id", eC2SecurityGroupOwnerId)
	}

}


fun AmazonElastiCacheFunctions.copySnapshot(sourceSnapshotName: String, targetSnapshotName: String, init: AmazonElastiCacheCopySnapshotCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheCopySnapshotCommand(sourceSnapshotName, targetSnapshotName).apply(init))
}

@Generated
class AmazonElastiCacheCopySnapshotCommand(val sourceSnapshotName: String, val targetSnapshotName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.CopySnapshotRequest> {

	var targetBucket: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.CopySnapshotRequest {
		val input = com.amazonaws.services.elasticache.model.CopySnapshotRequest()
		input.setSourceSnapshotName(this.sourceSnapshotName)
		input.setTargetSnapshotName(this.targetSnapshotName)
		input.setTargetBucket(this.targetBucket)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.copySnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache copy-snapshot")
				.argument("source-snapshot-name", sourceSnapshotName)
				.argument("target-snapshot-name", targetSnapshotName)
				.argument("target-bucket", targetBucket)
	}

}


fun AmazonElastiCacheFunctions.createCacheCluster(cacheClusterId: String, init: AmazonElastiCacheCreateCacheClusterCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheCreateCacheClusterCommand(cacheClusterId).apply(init))
}

@Generated
class AmazonElastiCacheCreateCacheClusterCommand(val cacheClusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.CreateCacheClusterRequest> {

	var replicationGroupId: String? = null
	var aZMode: AZMode? = null
	var preferredAvailabilityZone: String? = null
	var preferredAvailabilityZones: List<String>? = null
	var numCacheNodes: Int? = 0
	var cacheNodeType: String? = null
	var engine: String? = null
	var engineVersion: String? = null
	var cacheParameterGroupName: String? = null
	var cacheSubnetGroupName: String? = null
	var cacheSecurityGroupNames: List<String>? = null
	var securityGroupIds: List<String>? = null
	var tags: List<com.amazonaws.services.elasticache.model.Tag>? = null
	var snapshotArns: List<String>? = null
	var snapshotName: String? = null
	var preferredMaintenanceWindow: String? = null
	var port: Int? = 0
	var notificationTopicArn: String? = null
	var autoMinorVersionUpgrade: Boolean? = false
	var snapshotRetentionLimit: Int? = 0
	var snapshotWindow: String? = null
	var authToken: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.CreateCacheClusterRequest {
		val input = com.amazonaws.services.elasticache.model.CreateCacheClusterRequest()
		input.setCacheClusterId(this.cacheClusterId)
		input.setReplicationGroupId(this.replicationGroupId)
		input.setAZMode(this.aZMode?.toString())
		input.setPreferredAvailabilityZone(this.preferredAvailabilityZone)
		input.setPreferredAvailabilityZones(this.preferredAvailabilityZones)
		input.setNumCacheNodes(this.numCacheNodes)
		input.setCacheNodeType(this.cacheNodeType)
		input.setEngine(this.engine)
		input.setEngineVersion(this.engineVersion)
		input.setCacheParameterGroupName(this.cacheParameterGroupName)
		input.setCacheSubnetGroupName(this.cacheSubnetGroupName)
		input.setCacheSecurityGroupNames(this.cacheSecurityGroupNames)
		input.setSecurityGroupIds(this.securityGroupIds)
		input.setTags(this.tags)
		input.setSnapshotArns(this.snapshotArns)
		input.setSnapshotName(this.snapshotName)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setPort(this.port)
		input.setNotificationTopicArn(this.notificationTopicArn)
		input.setAutoMinorVersionUpgrade(this.autoMinorVersionUpgrade)
		input.setSnapshotRetentionLimit(this.snapshotRetentionLimit)
		input.setSnapshotWindow(this.snapshotWindow)
		input.setAuthToken(this.authToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.createCacheCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache create-cache-cluster")
				.argument("cache-cluster-id", cacheClusterId)
				.argument("replication-group-id", replicationGroupId)
				.argument("azmode", aZMode?.toString())
				.argument("preferred-availability-zone", preferredAvailabilityZone)
				.argument("preferred-availability-zones", preferredAvailabilityZones?.toString())
				.argument("num-cache-nodes", numCacheNodes?.toString())
				.argument("cache-node-type", cacheNodeType)
				.argument("engine", engine)
				.argument("engine-version", engineVersion)
				.argument("cache-parameter-group-name", cacheParameterGroupName)
				.argument("cache-subnet-group-name", cacheSubnetGroupName)
				.argument("cache-security-group-names", cacheSecurityGroupNames?.toString())
				.argument("security-group-ids", securityGroupIds?.toString())
				.argument("tags", tags?.toString())
				.argument("snapshot-arns", snapshotArns?.toString())
				.argument("snapshot-name", snapshotName)
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.argument("port", port?.toString())
				.argument("notification-topic-arn", notificationTopicArn)
				.option("auto-minor-version-upgrade", autoMinorVersionUpgrade ?: false)
				.argument("snapshot-retention-limit", snapshotRetentionLimit?.toString())
				.argument("snapshot-window", snapshotWindow)
				.argument("auth-token", authToken)
	}

}


fun AmazonElastiCacheFunctions.createCacheParameterGroup(cacheParameterGroupName: String, cacheParameterGroupFamily: String, description: String, init: AmazonElastiCacheCreateCacheParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheCreateCacheParameterGroupCommand(cacheParameterGroupName, cacheParameterGroupFamily, description).apply(init))
}

@Generated
class AmazonElastiCacheCreateCacheParameterGroupCommand(val cacheParameterGroupName: String, val cacheParameterGroupFamily: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest> {



	override fun build(): com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest {
		val input = com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest()
		input.setCacheParameterGroupName(this.cacheParameterGroupName)
		input.setCacheParameterGroupFamily(this.cacheParameterGroupFamily)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.createCacheParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache create-cache-parameter-group")
				.argument("cache-parameter-group-name", cacheParameterGroupName)
				.argument("cache-parameter-group-family", cacheParameterGroupFamily)
				.argument("description", description)
	}

}


fun AmazonElastiCacheFunctions.createCacheSecurityGroup(cacheSecurityGroupName: String, description: String, init: AmazonElastiCacheCreateCacheSecurityGroupCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheCreateCacheSecurityGroupCommand(cacheSecurityGroupName, description).apply(init))
}

@Generated
class AmazonElastiCacheCreateCacheSecurityGroupCommand(val cacheSecurityGroupName: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest> {



	override fun build(): com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest {
		val input = com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest()
		input.setCacheSecurityGroupName(this.cacheSecurityGroupName)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.createCacheSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache create-cache-security-group")
				.argument("cache-security-group-name", cacheSecurityGroupName)
				.argument("description", description)
	}

}


fun AmazonElastiCacheFunctions.createCacheSubnetGroup(cacheSubnetGroupName: String, cacheSubnetGroupDescription: String, subnetIds: List<String>, init: AmazonElastiCacheCreateCacheSubnetGroupCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheCreateCacheSubnetGroupCommand(cacheSubnetGroupName, cacheSubnetGroupDescription, subnetIds).apply(init))
}

@Generated
class AmazonElastiCacheCreateCacheSubnetGroupCommand(val cacheSubnetGroupName: String, val cacheSubnetGroupDescription: String, val subnetIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest> {



	override fun build(): com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest {
		val input = com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest()
		input.setCacheSubnetGroupName(this.cacheSubnetGroupName)
		input.setCacheSubnetGroupDescription(this.cacheSubnetGroupDescription)
		input.setSubnetIds(this.subnetIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.createCacheSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache create-cache-subnet-group")
				.argument("cache-subnet-group-name", cacheSubnetGroupName)
				.argument("cache-subnet-group-description", cacheSubnetGroupDescription)
				.argument("subnet-ids", subnetIds.toString())
	}

}


fun AmazonElastiCacheFunctions.createReplicationGroup(replicationGroupId: String, replicationGroupDescription: String, init: AmazonElastiCacheCreateReplicationGroupCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheCreateReplicationGroupCommand(replicationGroupId, replicationGroupDescription).apply(init))
}

@Generated
class AmazonElastiCacheCreateReplicationGroupCommand(val replicationGroupId: String, val replicationGroupDescription: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.CreateReplicationGroupRequest> {

	var primaryClusterId: String? = null
	var automaticFailoverEnabled: Boolean? = false
	var numCacheClusters: Int? = 0
	var preferredCacheClusterAZs: List<String>? = null
	var numNodeGroups: Int? = 0
	var replicasPerNodeGroup: Int? = 0
	var nodeGroupConfiguration: List<com.amazonaws.services.elasticache.model.NodeGroupConfiguration>? = null
	var cacheNodeType: String? = null
	var engine: String? = null
	var engineVersion: String? = null
	var cacheParameterGroupName: String? = null
	var cacheSubnetGroupName: String? = null
	var cacheSecurityGroupNames: List<String>? = null
	var securityGroupIds: List<String>? = null
	var tags: List<com.amazonaws.services.elasticache.model.Tag>? = null
	var snapshotArns: List<String>? = null
	var snapshotName: String? = null
	var preferredMaintenanceWindow: String? = null
	var port: Int? = 0
	var notificationTopicArn: String? = null
	var autoMinorVersionUpgrade: Boolean? = false
	var snapshotRetentionLimit: Int? = 0
	var snapshotWindow: String? = null
	var authToken: String? = null
	var transitEncryptionEnabled: Boolean? = false
	var atRestEncryptionEnabled: Boolean? = false

	override fun build(): com.amazonaws.services.elasticache.model.CreateReplicationGroupRequest {
		val input = com.amazonaws.services.elasticache.model.CreateReplicationGroupRequest()
		input.setReplicationGroupId(this.replicationGroupId)
		input.setReplicationGroupDescription(this.replicationGroupDescription)
		input.setPrimaryClusterId(this.primaryClusterId)
		input.setAutomaticFailoverEnabled(this.automaticFailoverEnabled)
		input.setNumCacheClusters(this.numCacheClusters)
		input.setPreferredCacheClusterAZs(this.preferredCacheClusterAZs)
		input.setNumNodeGroups(this.numNodeGroups)
		input.setReplicasPerNodeGroup(this.replicasPerNodeGroup)
		input.setNodeGroupConfiguration(this.nodeGroupConfiguration)
		input.setCacheNodeType(this.cacheNodeType)
		input.setEngine(this.engine)
		input.setEngineVersion(this.engineVersion)
		input.setCacheParameterGroupName(this.cacheParameterGroupName)
		input.setCacheSubnetGroupName(this.cacheSubnetGroupName)
		input.setCacheSecurityGroupNames(this.cacheSecurityGroupNames)
		input.setSecurityGroupIds(this.securityGroupIds)
		input.setTags(this.tags)
		input.setSnapshotArns(this.snapshotArns)
		input.setSnapshotName(this.snapshotName)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setPort(this.port)
		input.setNotificationTopicArn(this.notificationTopicArn)
		input.setAutoMinorVersionUpgrade(this.autoMinorVersionUpgrade)
		input.setSnapshotRetentionLimit(this.snapshotRetentionLimit)
		input.setSnapshotWindow(this.snapshotWindow)
		input.setAuthToken(this.authToken)
		input.setTransitEncryptionEnabled(this.transitEncryptionEnabled)
		input.setAtRestEncryptionEnabled(this.atRestEncryptionEnabled)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.createReplicationGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache create-replication-group")
				.argument("replication-group-id", replicationGroupId)
				.argument("replication-group-description", replicationGroupDescription)
				.argument("primary-cluster-id", primaryClusterId)
				.option("automatic-failover-enabled", automaticFailoverEnabled ?: false)
				.argument("num-cache-clusters", numCacheClusters?.toString())
				.argument("preferred-cache-cluster-azs", preferredCacheClusterAZs?.toString())
				.argument("num-node-groups", numNodeGroups?.toString())
				.argument("replicas-per-node-group", replicasPerNodeGroup?.toString())
				.argument("node-group-configuration", nodeGroupConfiguration?.toString())
				.argument("cache-node-type", cacheNodeType)
				.argument("engine", engine)
				.argument("engine-version", engineVersion)
				.argument("cache-parameter-group-name", cacheParameterGroupName)
				.argument("cache-subnet-group-name", cacheSubnetGroupName)
				.argument("cache-security-group-names", cacheSecurityGroupNames?.toString())
				.argument("security-group-ids", securityGroupIds?.toString())
				.argument("tags", tags?.toString())
				.argument("snapshot-arns", snapshotArns?.toString())
				.argument("snapshot-name", snapshotName)
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.argument("port", port?.toString())
				.argument("notification-topic-arn", notificationTopicArn)
				.option("auto-minor-version-upgrade", autoMinorVersionUpgrade ?: false)
				.argument("snapshot-retention-limit", snapshotRetentionLimit?.toString())
				.argument("snapshot-window", snapshotWindow)
				.argument("auth-token", authToken)
				.option("transit-encryption-enabled", transitEncryptionEnabled ?: false)
				.option("at-rest-encryption-enabled", atRestEncryptionEnabled ?: false)
	}

}


fun AmazonElastiCacheFunctions.createSnapshot(snapshotName: String, init: AmazonElastiCacheCreateSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheCreateSnapshotCommand(snapshotName).apply(init))
}

@Generated
class AmazonElastiCacheCreateSnapshotCommand(val snapshotName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.CreateSnapshotRequest> {

	var replicationGroupId: String? = null
	var cacheClusterId: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.CreateSnapshotRequest {
		val input = com.amazonaws.services.elasticache.model.CreateSnapshotRequest()
		input.setReplicationGroupId(this.replicationGroupId)
		input.setCacheClusterId(this.cacheClusterId)
		input.setSnapshotName(this.snapshotName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.createSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache create-snapshot")
				.argument("replication-group-id", replicationGroupId)
				.argument("cache-cluster-id", cacheClusterId)
				.argument("snapshot-name", snapshotName)
	}

}


fun AmazonElastiCacheFunctions.deleteCacheCluster(cacheClusterId: String, init: AmazonElastiCacheDeleteCacheClusterCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDeleteCacheClusterCommand(cacheClusterId).apply(init))
}

@Generated
class AmazonElastiCacheDeleteCacheClusterCommand(val cacheClusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest> {

	var finalSnapshotIdentifier: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest {
		val input = com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest()
		input.setCacheClusterId(this.cacheClusterId)
		input.setFinalSnapshotIdentifier(this.finalSnapshotIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.deleteCacheCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache delete-cache-cluster")
				.argument("cache-cluster-id", cacheClusterId)
				.argument("final-snapshot-identifier", finalSnapshotIdentifier)
	}

}


fun AmazonElastiCacheFunctions.deleteCacheParameterGroup(cacheParameterGroupName: String, init: AmazonElastiCacheDeleteCacheParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDeleteCacheParameterGroupCommand(cacheParameterGroupName).apply(init))
}

@Generated
class AmazonElastiCacheDeleteCacheParameterGroupCommand(val cacheParameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest> {



	override fun build(): com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest {
		val input = com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest()
		input.setCacheParameterGroupName(this.cacheParameterGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.deleteCacheParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache delete-cache-parameter-group")
				.argument("cache-parameter-group-name", cacheParameterGroupName)
	}

}


fun AmazonElastiCacheFunctions.deleteCacheSecurityGroup(cacheSecurityGroupName: String, init: AmazonElastiCacheDeleteCacheSecurityGroupCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDeleteCacheSecurityGroupCommand(cacheSecurityGroupName).apply(init))
}

@Generated
class AmazonElastiCacheDeleteCacheSecurityGroupCommand(val cacheSecurityGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest> {



	override fun build(): com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest {
		val input = com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest()
		input.setCacheSecurityGroupName(this.cacheSecurityGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.deleteCacheSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache delete-cache-security-group")
				.argument("cache-security-group-name", cacheSecurityGroupName)
	}

}


fun AmazonElastiCacheFunctions.deleteCacheSubnetGroup(cacheSubnetGroupName: String, init: AmazonElastiCacheDeleteCacheSubnetGroupCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDeleteCacheSubnetGroupCommand(cacheSubnetGroupName).apply(init))
}

@Generated
class AmazonElastiCacheDeleteCacheSubnetGroupCommand(val cacheSubnetGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest> {



	override fun build(): com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest {
		val input = com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest()
		input.setCacheSubnetGroupName(this.cacheSubnetGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.deleteCacheSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache delete-cache-subnet-group")
				.argument("cache-subnet-group-name", cacheSubnetGroupName)
	}

}


fun AmazonElastiCacheFunctions.deleteReplicationGroup(replicationGroupId: String, init: AmazonElastiCacheDeleteReplicationGroupCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDeleteReplicationGroupCommand(replicationGroupId).apply(init))
}

@Generated
class AmazonElastiCacheDeleteReplicationGroupCommand(val replicationGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest> {

	var retainPrimaryCluster: Boolean? = false
	var finalSnapshotIdentifier: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest {
		val input = com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest()
		input.setReplicationGroupId(this.replicationGroupId)
		input.setRetainPrimaryCluster(this.retainPrimaryCluster)
		input.setFinalSnapshotIdentifier(this.finalSnapshotIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.deleteReplicationGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache delete-replication-group")
				.argument("replication-group-id", replicationGroupId)
				.option("retain-primary-cluster", retainPrimaryCluster ?: false)
				.argument("final-snapshot-identifier", finalSnapshotIdentifier)
	}

}


fun AmazonElastiCacheFunctions.deleteSnapshot(snapshotName: String, init: AmazonElastiCacheDeleteSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDeleteSnapshotCommand(snapshotName).apply(init))
}

@Generated
class AmazonElastiCacheDeleteSnapshotCommand(val snapshotName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DeleteSnapshotRequest> {



	override fun build(): com.amazonaws.services.elasticache.model.DeleteSnapshotRequest {
		val input = com.amazonaws.services.elasticache.model.DeleteSnapshotRequest()
		input.setSnapshotName(this.snapshotName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.deleteSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache delete-snapshot")
				.argument("snapshot-name", snapshotName)
	}

}


fun AmazonElastiCacheFunctions.describeCacheClusters(init: AmazonElastiCacheDescribeCacheClustersCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDescribeCacheClustersCommand().apply(init))
}

@Generated
class AmazonElastiCacheDescribeCacheClustersCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeCacheClustersRequest> {

	var cacheClusterId: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null
	var showCacheNodeInfo: Boolean? = false
	var showCacheClustersNotInReplicationGroups: Boolean? = false

	override fun build(): com.amazonaws.services.elasticache.model.DescribeCacheClustersRequest {
		val input = com.amazonaws.services.elasticache.model.DescribeCacheClustersRequest()
		input.setCacheClusterId(this.cacheClusterId)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setShowCacheNodeInfo(this.showCacheNodeInfo)
		input.setShowCacheClustersNotInReplicationGroups(this.showCacheClustersNotInReplicationGroups)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.describeCacheClusters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-cache-clusters")
				.argument("cache-cluster-id", cacheClusterId)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.option("show-cache-node-info", showCacheNodeInfo ?: false)
				.option("show-cache-clusters-not-in-replication-groups", showCacheClustersNotInReplicationGroups ?: false)
	}

}


fun AmazonElastiCacheFunctions.describeCacheEngineVersions(init: AmazonElastiCacheDescribeCacheEngineVersionsCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDescribeCacheEngineVersionsCommand().apply(init))
}

@Generated
class AmazonElastiCacheDescribeCacheEngineVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsRequest> {

	var engine: String? = null
	var engineVersion: String? = null
	var cacheParameterGroupFamily: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null
	var defaultOnly: Boolean? = false

	override fun build(): com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsRequest {
		val input = com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsRequest()
		input.setEngine(this.engine)
		input.setEngineVersion(this.engineVersion)
		input.setCacheParameterGroupFamily(this.cacheParameterGroupFamily)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setDefaultOnly(this.defaultOnly)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.describeCacheEngineVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-cache-engine-versions")
				.argument("engine", engine)
				.argument("engine-version", engineVersion)
				.argument("cache-parameter-group-family", cacheParameterGroupFamily)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.option("default-only", defaultOnly ?: false)
	}

}


fun AmazonElastiCacheFunctions.describeCacheParameterGroups(init: AmazonElastiCacheDescribeCacheParameterGroupsCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDescribeCacheParameterGroupsCommand().apply(init))
}

@Generated
class AmazonElastiCacheDescribeCacheParameterGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsRequest> {

	var cacheParameterGroupName: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsRequest {
		val input = com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsRequest()
		input.setCacheParameterGroupName(this.cacheParameterGroupName)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.describeCacheParameterGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-cache-parameter-groups")
				.argument("cache-parameter-group-name", cacheParameterGroupName)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElastiCacheFunctions.describeCacheParameters(cacheParameterGroupName: String, init: AmazonElastiCacheDescribeCacheParametersCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDescribeCacheParametersCommand(cacheParameterGroupName).apply(init))
}

@Generated
class AmazonElastiCacheDescribeCacheParametersCommand(val cacheParameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeCacheParametersRequest> {

	var source: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.DescribeCacheParametersRequest {
		val input = com.amazonaws.services.elasticache.model.DescribeCacheParametersRequest()
		input.setCacheParameterGroupName(this.cacheParameterGroupName)
		input.setSource(this.source)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.describeCacheParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-cache-parameters")
				.argument("cache-parameter-group-name", cacheParameterGroupName)
				.argument("source", source)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElastiCacheFunctions.describeCacheSecurityGroups(init: AmazonElastiCacheDescribeCacheSecurityGroupsCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDescribeCacheSecurityGroupsCommand().apply(init))
}

@Generated
class AmazonElastiCacheDescribeCacheSecurityGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsRequest> {

	var cacheSecurityGroupName: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsRequest {
		val input = com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsRequest()
		input.setCacheSecurityGroupName(this.cacheSecurityGroupName)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.describeCacheSecurityGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-cache-security-groups")
				.argument("cache-security-group-name", cacheSecurityGroupName)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElastiCacheFunctions.describeCacheSubnetGroups(init: AmazonElastiCacheDescribeCacheSubnetGroupsCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDescribeCacheSubnetGroupsCommand().apply(init))
}

@Generated
class AmazonElastiCacheDescribeCacheSubnetGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsRequest> {

	var cacheSubnetGroupName: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsRequest {
		val input = com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsRequest()
		input.setCacheSubnetGroupName(this.cacheSubnetGroupName)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.describeCacheSubnetGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-cache-subnet-groups")
				.argument("cache-subnet-group-name", cacheSubnetGroupName)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElastiCacheFunctions.describeEngineDefaultParameters(cacheParameterGroupFamily: String, init: AmazonElastiCacheDescribeEngineDefaultParametersCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDescribeEngineDefaultParametersCommand(cacheParameterGroupFamily).apply(init))
}

@Generated
class AmazonElastiCacheDescribeEngineDefaultParametersCommand(val cacheParameterGroupFamily: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest> {

	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest {
		val input = com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest()
		input.setCacheParameterGroupFamily(this.cacheParameterGroupFamily)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.describeEngineDefaultParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-engine-default-parameters")
				.argument("cache-parameter-group-family", cacheParameterGroupFamily)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElastiCacheFunctions.describeEvents(init: AmazonElastiCacheDescribeEventsCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDescribeEventsCommand().apply(init))
}

@Generated
class AmazonElastiCacheDescribeEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeEventsRequest> {

	var sourceIdentifier: String? = null
	var sourceType: SourceType? = null
	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null
	var duration: Int? = 0
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.DescribeEventsRequest {
		val input = com.amazonaws.services.elasticache.model.DescribeEventsRequest()
		input.setSourceIdentifier(this.sourceIdentifier)
		input.setSourceType(this.sourceType?.toString())
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setDuration(this.duration)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.describeEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-events")
				.argument("source-identifier", sourceIdentifier)
				.argument("source-type", sourceType?.toString())
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("duration", duration?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElastiCacheFunctions.describeReplicationGroups(init: AmazonElastiCacheDescribeReplicationGroupsCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDescribeReplicationGroupsCommand().apply(init))
}

@Generated
class AmazonElastiCacheDescribeReplicationGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeReplicationGroupsRequest> {

	var replicationGroupId: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.DescribeReplicationGroupsRequest {
		val input = com.amazonaws.services.elasticache.model.DescribeReplicationGroupsRequest()
		input.setReplicationGroupId(this.replicationGroupId)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.describeReplicationGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-replication-groups")
				.argument("replication-group-id", replicationGroupId)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElastiCacheFunctions.describeReservedCacheNodes(init: AmazonElastiCacheDescribeReservedCacheNodesCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDescribeReservedCacheNodesCommand().apply(init))
}

@Generated
class AmazonElastiCacheDescribeReservedCacheNodesCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesRequest> {

	var reservedCacheNodeId: String? = null
	var reservedCacheNodesOfferingId: String? = null
	var cacheNodeType: String? = null
	var duration: String? = null
	var productDescription: String? = null
	var offeringType: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesRequest {
		val input = com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesRequest()
		input.setReservedCacheNodeId(this.reservedCacheNodeId)
		input.setReservedCacheNodesOfferingId(this.reservedCacheNodesOfferingId)
		input.setCacheNodeType(this.cacheNodeType)
		input.setDuration(this.duration)
		input.setProductDescription(this.productDescription)
		input.setOfferingType(this.offeringType)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.describeReservedCacheNodes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-reserved-cache-nodes")
				.argument("reserved-cache-node-id", reservedCacheNodeId)
				.argument("reserved-cache-nodes-offering-id", reservedCacheNodesOfferingId)
				.argument("cache-node-type", cacheNodeType)
				.argument("duration", duration)
				.argument("product-description", productDescription)
				.argument("offering-type", offeringType)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElastiCacheFunctions.describeReservedCacheNodesOfferings(init: AmazonElastiCacheDescribeReservedCacheNodesOfferingsCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDescribeReservedCacheNodesOfferingsCommand().apply(init))
}

@Generated
class AmazonElastiCacheDescribeReservedCacheNodesOfferingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsRequest> {

	var reservedCacheNodesOfferingId: String? = null
	var cacheNodeType: String? = null
	var duration: String? = null
	var productDescription: String? = null
	var offeringType: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsRequest {
		val input = com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsRequest()
		input.setReservedCacheNodesOfferingId(this.reservedCacheNodesOfferingId)
		input.setCacheNodeType(this.cacheNodeType)
		input.setDuration(this.duration)
		input.setProductDescription(this.productDescription)
		input.setOfferingType(this.offeringType)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.describeReservedCacheNodesOfferings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-reserved-cache-nodes-offerings")
				.argument("reserved-cache-nodes-offering-id", reservedCacheNodesOfferingId)
				.argument("cache-node-type", cacheNodeType)
				.argument("duration", duration)
				.argument("product-description", productDescription)
				.argument("offering-type", offeringType)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElastiCacheFunctions.describeSnapshots(init: AmazonElastiCacheDescribeSnapshotsCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheDescribeSnapshotsCommand().apply(init))
}

@Generated
class AmazonElastiCacheDescribeSnapshotsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeSnapshotsRequest> {

	var replicationGroupId: String? = null
	var cacheClusterId: String? = null
	var snapshotName: String? = null
	var snapshotSource: String? = null
	var marker: String? = null
	var maxRecords: Int? = 0
	var showNodeGroupConfig: Boolean? = false

	override fun build(): com.amazonaws.services.elasticache.model.DescribeSnapshotsRequest {
		val input = com.amazonaws.services.elasticache.model.DescribeSnapshotsRequest()
		input.setReplicationGroupId(this.replicationGroupId)
		input.setCacheClusterId(this.cacheClusterId)
		input.setSnapshotName(this.snapshotName)
		input.setSnapshotSource(this.snapshotSource)
		input.setMarker(this.marker)
		input.setMaxRecords(this.maxRecords)
		input.setShowNodeGroupConfig(this.showNodeGroupConfig)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.describeSnapshots(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-snapshots")
				.argument("replication-group-id", replicationGroupId)
				.argument("cache-cluster-id", cacheClusterId)
				.argument("snapshot-name", snapshotName)
				.argument("snapshot-source", snapshotSource)
				.argument("marker", marker)
				.argument("max-records", maxRecords?.toString())
				.option("show-node-group-config", showNodeGroupConfig ?: false)
	}

}


fun AmazonElastiCacheFunctions.listAllowedNodeTypeModifications(init: AmazonElastiCacheListAllowedNodeTypeModificationsCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheListAllowedNodeTypeModificationsCommand().apply(init))
}

@Generated
class AmazonElastiCacheListAllowedNodeTypeModificationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest> {

	var cacheClusterId: String? = null
	var replicationGroupId: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest {
		val input = com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest()
		input.setCacheClusterId(this.cacheClusterId)
		input.setReplicationGroupId(this.replicationGroupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.listAllowedNodeTypeModifications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache list-allowed-node-type-modifications")
				.argument("cache-cluster-id", cacheClusterId)
				.argument("replication-group-id", replicationGroupId)
	}

}


fun AmazonElastiCacheFunctions.listTagsForResource(resourceName: String, init: AmazonElastiCacheListTagsForResourceCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheListTagsForResourceCommand(resourceName).apply(init))
}

@Generated
class AmazonElastiCacheListTagsForResourceCommand(val resourceName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.ListTagsForResourceRequest> {



	override fun build(): com.amazonaws.services.elasticache.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.elasticache.model.ListTagsForResourceRequest()
		input.setResourceName(this.resourceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache list-tags-for-resource")
				.argument("resource-name", resourceName)
	}

}


fun AmazonElastiCacheFunctions.modifyCacheCluster(cacheClusterId: String, init: AmazonElastiCacheModifyCacheClusterCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheModifyCacheClusterCommand(cacheClusterId).apply(init))
}

@Generated
class AmazonElastiCacheModifyCacheClusterCommand(val cacheClusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.ModifyCacheClusterRequest> {

	var numCacheNodes: Int? = 0
	var cacheNodeIdsToRemove: List<String>? = null
	var aZMode: AZMode? = null
	var newAvailabilityZones: List<String>? = null
	var cacheSecurityGroupNames: List<String>? = null
	var securityGroupIds: List<String>? = null
	var preferredMaintenanceWindow: String? = null
	var notificationTopicArn: String? = null
	var cacheParameterGroupName: String? = null
	var notificationTopicStatus: String? = null
	var applyImmediately: Boolean? = false
	var engineVersion: String? = null
	var autoMinorVersionUpgrade: Boolean? = false
	var snapshotRetentionLimit: Int? = 0
	var snapshotWindow: String? = null
	var cacheNodeType: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.ModifyCacheClusterRequest {
		val input = com.amazonaws.services.elasticache.model.ModifyCacheClusterRequest()
		input.setCacheClusterId(this.cacheClusterId)
		input.setNumCacheNodes(this.numCacheNodes)
		input.setCacheNodeIdsToRemove(this.cacheNodeIdsToRemove)
		input.setAZMode(this.aZMode?.toString())
		input.setNewAvailabilityZones(this.newAvailabilityZones)
		input.setCacheSecurityGroupNames(this.cacheSecurityGroupNames)
		input.setSecurityGroupIds(this.securityGroupIds)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setNotificationTopicArn(this.notificationTopicArn)
		input.setCacheParameterGroupName(this.cacheParameterGroupName)
		input.setNotificationTopicStatus(this.notificationTopicStatus)
		input.setApplyImmediately(this.applyImmediately)
		input.setEngineVersion(this.engineVersion)
		input.setAutoMinorVersionUpgrade(this.autoMinorVersionUpgrade)
		input.setSnapshotRetentionLimit(this.snapshotRetentionLimit)
		input.setSnapshotWindow(this.snapshotWindow)
		input.setCacheNodeType(this.cacheNodeType)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.modifyCacheCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache modify-cache-cluster")
				.argument("cache-cluster-id", cacheClusterId)
				.argument("num-cache-nodes", numCacheNodes?.toString())
				.argument("cache-node-ids-to-remove", cacheNodeIdsToRemove?.toString())
				.argument("azmode", aZMode?.toString())
				.argument("new-availability-zones", newAvailabilityZones?.toString())
				.argument("cache-security-group-names", cacheSecurityGroupNames?.toString())
				.argument("security-group-ids", securityGroupIds?.toString())
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.argument("notification-topic-arn", notificationTopicArn)
				.argument("cache-parameter-group-name", cacheParameterGroupName)
				.argument("notification-topic-status", notificationTopicStatus)
				.option("apply-immediately", applyImmediately ?: false)
				.argument("engine-version", engineVersion)
				.option("auto-minor-version-upgrade", autoMinorVersionUpgrade ?: false)
				.argument("snapshot-retention-limit", snapshotRetentionLimit?.toString())
				.argument("snapshot-window", snapshotWindow)
				.argument("cache-node-type", cacheNodeType)
	}

}


fun AmazonElastiCacheFunctions.modifyCacheParameterGroup(cacheParameterGroupName: String, parameterNameValues: List<com.amazonaws.services.elasticache.model.ParameterNameValue>, init: AmazonElastiCacheModifyCacheParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheModifyCacheParameterGroupCommand(cacheParameterGroupName, parameterNameValues).apply(init))
}

@Generated
class AmazonElastiCacheModifyCacheParameterGroupCommand(val cacheParameterGroupName: String, val parameterNameValues: List<com.amazonaws.services.elasticache.model.ParameterNameValue>) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest> {



	override fun build(): com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest {
		val input = com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest()
		input.setCacheParameterGroupName(this.cacheParameterGroupName)
		input.setParameterNameValues(this.parameterNameValues)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.modifyCacheParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache modify-cache-parameter-group")
				.argument("cache-parameter-group-name", cacheParameterGroupName)
				.argument("parameter-name-values", parameterNameValues.toString())
	}

}


fun AmazonElastiCacheFunctions.modifyCacheSubnetGroup(cacheSubnetGroupName: String, init: AmazonElastiCacheModifyCacheSubnetGroupCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheModifyCacheSubnetGroupCommand(cacheSubnetGroupName).apply(init))
}

@Generated
class AmazonElastiCacheModifyCacheSubnetGroupCommand(val cacheSubnetGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest> {

	var cacheSubnetGroupDescription: String? = null
	var subnetIds: List<String>? = null

	override fun build(): com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest {
		val input = com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest()
		input.setCacheSubnetGroupName(this.cacheSubnetGroupName)
		input.setCacheSubnetGroupDescription(this.cacheSubnetGroupDescription)
		input.setSubnetIds(this.subnetIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.modifyCacheSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache modify-cache-subnet-group")
				.argument("cache-subnet-group-name", cacheSubnetGroupName)
				.argument("cache-subnet-group-description", cacheSubnetGroupDescription)
				.argument("subnet-ids", subnetIds?.toString())
	}

}


fun AmazonElastiCacheFunctions.modifyReplicationGroup(replicationGroupId: String, init: AmazonElastiCacheModifyReplicationGroupCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheModifyReplicationGroupCommand(replicationGroupId).apply(init))
}

@Generated
class AmazonElastiCacheModifyReplicationGroupCommand(val replicationGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.ModifyReplicationGroupRequest> {

	var replicationGroupDescription: String? = null
	var primaryClusterId: String? = null
	var snapshottingClusterId: String? = null
	var automaticFailoverEnabled: Boolean? = false
	var cacheSecurityGroupNames: List<String>? = null
	var securityGroupIds: List<String>? = null
	var preferredMaintenanceWindow: String? = null
	var notificationTopicArn: String? = null
	var cacheParameterGroupName: String? = null
	var notificationTopicStatus: String? = null
	var applyImmediately: Boolean? = false
	var engineVersion: String? = null
	var autoMinorVersionUpgrade: Boolean? = false
	var snapshotRetentionLimit: Int? = 0
	var snapshotWindow: String? = null
	var cacheNodeType: String? = null
	var nodeGroupId: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.ModifyReplicationGroupRequest {
		val input = com.amazonaws.services.elasticache.model.ModifyReplicationGroupRequest()
		input.setReplicationGroupId(this.replicationGroupId)
		input.setReplicationGroupDescription(this.replicationGroupDescription)
		input.setPrimaryClusterId(this.primaryClusterId)
		input.setSnapshottingClusterId(this.snapshottingClusterId)
		input.setAutomaticFailoverEnabled(this.automaticFailoverEnabled)
		input.setCacheSecurityGroupNames(this.cacheSecurityGroupNames)
		input.setSecurityGroupIds(this.securityGroupIds)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setNotificationTopicArn(this.notificationTopicArn)
		input.setCacheParameterGroupName(this.cacheParameterGroupName)
		input.setNotificationTopicStatus(this.notificationTopicStatus)
		input.setApplyImmediately(this.applyImmediately)
		input.setEngineVersion(this.engineVersion)
		input.setAutoMinorVersionUpgrade(this.autoMinorVersionUpgrade)
		input.setSnapshotRetentionLimit(this.snapshotRetentionLimit)
		input.setSnapshotWindow(this.snapshotWindow)
		input.setCacheNodeType(this.cacheNodeType)
		input.setNodeGroupId(this.nodeGroupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.modifyReplicationGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache modify-replication-group")
				.argument("replication-group-id", replicationGroupId)
				.argument("replication-group-description", replicationGroupDescription)
				.argument("primary-cluster-id", primaryClusterId)
				.argument("snapshotting-cluster-id", snapshottingClusterId)
				.option("automatic-failover-enabled", automaticFailoverEnabled ?: false)
				.argument("cache-security-group-names", cacheSecurityGroupNames?.toString())
				.argument("security-group-ids", securityGroupIds?.toString())
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.argument("notification-topic-arn", notificationTopicArn)
				.argument("cache-parameter-group-name", cacheParameterGroupName)
				.argument("notification-topic-status", notificationTopicStatus)
				.option("apply-immediately", applyImmediately ?: false)
				.argument("engine-version", engineVersion)
				.option("auto-minor-version-upgrade", autoMinorVersionUpgrade ?: false)
				.argument("snapshot-retention-limit", snapshotRetentionLimit?.toString())
				.argument("snapshot-window", snapshotWindow)
				.argument("cache-node-type", cacheNodeType)
				.argument("node-group-id", nodeGroupId)
	}

}


fun AmazonElastiCacheFunctions.modifyReplicationGroupShardConfiguration(replicationGroupId: String, nodeGroupCount: Int, applyImmediately: Boolean, init: AmazonElastiCacheModifyReplicationGroupShardConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheModifyReplicationGroupShardConfigurationCommand(replicationGroupId, nodeGroupCount, applyImmediately).apply(init))
}

@Generated
class AmazonElastiCacheModifyReplicationGroupShardConfigurationCommand(val replicationGroupId: String, val nodeGroupCount: Int, val applyImmediately: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.ModifyReplicationGroupShardConfigurationRequest> {

	var reshardingConfiguration: List<com.amazonaws.services.elasticache.model.ReshardingConfiguration>? = null
	var nodeGroupsToRemove: List<String>? = null

	override fun build(): com.amazonaws.services.elasticache.model.ModifyReplicationGroupShardConfigurationRequest {
		val input = com.amazonaws.services.elasticache.model.ModifyReplicationGroupShardConfigurationRequest()
		input.setReplicationGroupId(this.replicationGroupId)
		input.setNodeGroupCount(this.nodeGroupCount)
		input.setApplyImmediately(this.applyImmediately)
		input.setReshardingConfiguration(this.reshardingConfiguration)
		input.setNodeGroupsToRemove(this.nodeGroupsToRemove)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.modifyReplicationGroupShardConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache modify-replication-group-shard-configuration")
				.argument("replication-group-id", replicationGroupId)
				.argument("node-group-count", nodeGroupCount.toString())
				.option("apply-immediately", applyImmediately ?: false)
				.argument("resharding-configuration", reshardingConfiguration?.toString())
				.argument("node-groups-to-remove", nodeGroupsToRemove?.toString())
	}

}


fun AmazonElastiCacheFunctions.purchaseReservedCacheNodesOffering(reservedCacheNodesOfferingId: String, init: AmazonElastiCachePurchaseReservedCacheNodesOfferingCommand.() -> Unit) {
	this.block.declare(AmazonElastiCachePurchaseReservedCacheNodesOfferingCommand(reservedCacheNodesOfferingId).apply(init))
}

@Generated
class AmazonElastiCachePurchaseReservedCacheNodesOfferingCommand(val reservedCacheNodesOfferingId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest> {

	var reservedCacheNodeId: String? = null
	var cacheNodeCount: Int? = 0

	override fun build(): com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest {
		val input = com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest()
		input.setReservedCacheNodesOfferingId(this.reservedCacheNodesOfferingId)
		input.setReservedCacheNodeId(this.reservedCacheNodeId)
		input.setCacheNodeCount(this.cacheNodeCount)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.purchaseReservedCacheNodesOffering(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache purchase-reserved-cache-nodes-offering")
				.argument("reserved-cache-nodes-offering-id", reservedCacheNodesOfferingId)
				.argument("reserved-cache-node-id", reservedCacheNodeId)
				.argument("cache-node-count", cacheNodeCount?.toString())
	}

}


fun AmazonElastiCacheFunctions.rebootCacheCluster(cacheClusterId: String, cacheNodeIdsToReboot: List<String>, init: AmazonElastiCacheRebootCacheClusterCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheRebootCacheClusterCommand(cacheClusterId, cacheNodeIdsToReboot).apply(init))
}

@Generated
class AmazonElastiCacheRebootCacheClusterCommand(val cacheClusterId: String, val cacheNodeIdsToReboot: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.RebootCacheClusterRequest> {



	override fun build(): com.amazonaws.services.elasticache.model.RebootCacheClusterRequest {
		val input = com.amazonaws.services.elasticache.model.RebootCacheClusterRequest()
		input.setCacheClusterId(this.cacheClusterId)
		input.setCacheNodeIdsToReboot(this.cacheNodeIdsToReboot)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.rebootCacheCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache reboot-cache-cluster")
				.argument("cache-cluster-id", cacheClusterId)
				.argument("cache-node-ids-to-reboot", cacheNodeIdsToReboot.toString())
	}

}


fun AmazonElastiCacheFunctions.removeTagsFromResource(resourceName: String, tagKeys: List<String>, init: AmazonElastiCacheRemoveTagsFromResourceCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheRemoveTagsFromResourceCommand(resourceName, tagKeys).apply(init))
}

@Generated
class AmazonElastiCacheRemoveTagsFromResourceCommand(val resourceName: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest> {



	override fun build(): com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest {
		val input = com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest()
		input.setResourceName(this.resourceName)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.removeTagsFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache remove-tags-from-resource")
				.argument("resource-name", resourceName)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonElastiCacheFunctions.resetCacheParameterGroup(cacheParameterGroupName: String, init: AmazonElastiCacheResetCacheParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheResetCacheParameterGroupCommand(cacheParameterGroupName).apply(init))
}

@Generated
class AmazonElastiCacheResetCacheParameterGroupCommand(val cacheParameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest> {

	var resetAllParameters: Boolean? = false
	var parameterNameValues: List<com.amazonaws.services.elasticache.model.ParameterNameValue>? = null

	override fun build(): com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest {
		val input = com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest()
		input.setCacheParameterGroupName(this.cacheParameterGroupName)
		input.setResetAllParameters(this.resetAllParameters)
		input.setParameterNameValues(this.parameterNameValues)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.resetCacheParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache reset-cache-parameter-group")
				.argument("cache-parameter-group-name", cacheParameterGroupName)
				.option("reset-all-parameters", resetAllParameters ?: false)
				.argument("parameter-name-values", parameterNameValues?.toString())
	}

}


fun AmazonElastiCacheFunctions.revokeCacheSecurityGroupIngress(cacheSecurityGroupName: String, eC2SecurityGroupName: String, eC2SecurityGroupOwnerId: String, init: AmazonElastiCacheRevokeCacheSecurityGroupIngressCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheRevokeCacheSecurityGroupIngressCommand(cacheSecurityGroupName, eC2SecurityGroupName, eC2SecurityGroupOwnerId).apply(init))
}

@Generated
class AmazonElastiCacheRevokeCacheSecurityGroupIngressCommand(val cacheSecurityGroupName: String, val eC2SecurityGroupName: String, val eC2SecurityGroupOwnerId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest> {



	override fun build(): com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest {
		val input = com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest()
		input.setCacheSecurityGroupName(this.cacheSecurityGroupName)
		input.setEC2SecurityGroupName(this.eC2SecurityGroupName)
		input.setEC2SecurityGroupOwnerId(this.eC2SecurityGroupOwnerId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.revokeCacheSecurityGroupIngress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache revoke-cache-security-group-ingress")
				.argument("cache-security-group-name", cacheSecurityGroupName)
				.argument("ec2-security-group-name", eC2SecurityGroupName)
				.argument("ec2-security-group-owner-id", eC2SecurityGroupOwnerId)
	}

}


fun AmazonElastiCacheFunctions.testFailover(replicationGroupId: String, nodeGroupId: String, init: AmazonElastiCacheTestFailoverCommand.() -> Unit) {
	this.block.declare(AmazonElastiCacheTestFailoverCommand(replicationGroupId, nodeGroupId).apply(init))
}

@Generated
class AmazonElastiCacheTestFailoverCommand(val replicationGroupId: String, val nodeGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.TestFailoverRequest> {



	override fun build(): com.amazonaws.services.elasticache.model.TestFailoverRequest {
		val input = com.amazonaws.services.elasticache.model.TestFailoverRequest()
		input.setReplicationGroupId(this.replicationGroupId)
		input.setNodeGroupId(this.nodeGroupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticache.testFailover(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache test-failover")
				.argument("replication-group-id", replicationGroupId)
				.argument("node-group-id", nodeGroupId)
	}

}
