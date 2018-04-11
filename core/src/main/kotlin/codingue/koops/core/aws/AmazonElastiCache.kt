
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
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

infix fun <T> AwsContinuation.elasticache(init: AmazonElastiCacheFunctions.() -> T): T {
	return AmazonElastiCacheFunctions(shell).run(init)
}

			

fun AmazonElastiCacheFunctions.addTagsToResource(resourceName: String, tags: List<com.amazonaws.services.elasticache.model.Tag>, init: AmazonElastiCacheAddTagsToResourceCommand.() -> Unit): com.amazonaws.services.elasticache.model.AddTagsToResourceResult {
	return this.block.declare(AmazonElastiCacheAddTagsToResourceCommand(resourceName, tags).apply(init)) as com.amazonaws.services.elasticache.model.AddTagsToResourceResult
}

@Generated
class AmazonElastiCacheAddTagsToResourceCommand(val resourceName: String, val tags: List<com.amazonaws.services.elasticache.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.AddTagsToResourceRequest, com.amazonaws.services.elasticache.model.AddTagsToResourceResult> {



	override fun build(): com.amazonaws.services.elasticache.model.AddTagsToResourceRequest {
		val input = com.amazonaws.services.elasticache.model.AddTagsToResourceRequest()
		input.setResourceName(this.resourceName)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.AddTagsToResourceResult {
	  return com.amazonaws.services.elasticache.model.AddTagsToResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.AddTagsToResourceResult {
		return environment.elasticache.addTagsToResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache add-tags-to-resource")
				.argument("resource-name", resourceName)
				.argument("tags", tags.toString())
	}

}


fun AmazonElastiCacheFunctions.authorizeCacheSecurityGroupIngress(cacheSecurityGroupName: String, eC2SecurityGroupName: String, eC2SecurityGroupOwnerId: String, init: AmazonElastiCacheAuthorizeCacheSecurityGroupIngressCommand.() -> Unit): com.amazonaws.services.elasticache.model.CacheSecurityGroup {
	return this.block.declare(AmazonElastiCacheAuthorizeCacheSecurityGroupIngressCommand(cacheSecurityGroupName, eC2SecurityGroupName, eC2SecurityGroupOwnerId).apply(init)) as com.amazonaws.services.elasticache.model.CacheSecurityGroup
}

@Generated
class AmazonElastiCacheAuthorizeCacheSecurityGroupIngressCommand(val cacheSecurityGroupName: String, val eC2SecurityGroupName: String, val eC2SecurityGroupOwnerId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest, com.amazonaws.services.elasticache.model.CacheSecurityGroup> {



	override fun build(): com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest {
		val input = com.amazonaws.services.elasticache.model.AuthorizeCacheSecurityGroupIngressRequest()
		input.setCacheSecurityGroupName(this.cacheSecurityGroupName)
		input.setEC2SecurityGroupName(this.eC2SecurityGroupName)
		input.setEC2SecurityGroupOwnerId(this.eC2SecurityGroupOwnerId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.CacheSecurityGroup {
	  return com.amazonaws.services.elasticache.model.CacheSecurityGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.CacheSecurityGroup {
		return environment.elasticache.authorizeCacheSecurityGroupIngress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache authorize-cache-security-group-ingress")
				.argument("cache-security-group-name", cacheSecurityGroupName)
				.argument("ec2-security-group-name", eC2SecurityGroupName)
				.argument("ec2-security-group-owner-id", eC2SecurityGroupOwnerId)
	}

}


fun AmazonElastiCacheFunctions.copySnapshot(sourceSnapshotName: String, targetSnapshotName: String, init: AmazonElastiCacheCopySnapshotCommand.() -> Unit): com.amazonaws.services.elasticache.model.Snapshot {
	return this.block.declare(AmazonElastiCacheCopySnapshotCommand(sourceSnapshotName, targetSnapshotName).apply(init)) as com.amazonaws.services.elasticache.model.Snapshot
}

@Generated
class AmazonElastiCacheCopySnapshotCommand(val sourceSnapshotName: String, val targetSnapshotName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.CopySnapshotRequest, com.amazonaws.services.elasticache.model.Snapshot> {

	var targetBucket: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.CopySnapshotRequest {
		val input = com.amazonaws.services.elasticache.model.CopySnapshotRequest()
		input.setSourceSnapshotName(this.sourceSnapshotName)
		input.setTargetSnapshotName(this.targetSnapshotName)
		input.setTargetBucket(this.targetBucket)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.Snapshot {
	  return com.amazonaws.services.elasticache.model.Snapshot()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.Snapshot {
		return environment.elasticache.copySnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache copy-snapshot")
				.argument("source-snapshot-name", sourceSnapshotName)
				.argument("target-snapshot-name", targetSnapshotName)
				.argument("target-bucket", targetBucket)
	}

}


fun AmazonElastiCacheFunctions.createCacheCluster(cacheClusterId: String, init: AmazonElastiCacheCreateCacheClusterCommand.() -> Unit): com.amazonaws.services.elasticache.model.CacheCluster {
	return this.block.declare(AmazonElastiCacheCreateCacheClusterCommand(cacheClusterId).apply(init)) as com.amazonaws.services.elasticache.model.CacheCluster
}

@Generated
class AmazonElastiCacheCreateCacheClusterCommand(val cacheClusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.CreateCacheClusterRequest, com.amazonaws.services.elasticache.model.CacheCluster> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.CacheCluster {
	  return com.amazonaws.services.elasticache.model.CacheCluster()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.CacheCluster {
		return environment.elasticache.createCacheCluster(build())
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


fun AmazonElastiCacheFunctions.createCacheParameterGroup(cacheParameterGroupName: String, cacheParameterGroupFamily: String, description: String, init: AmazonElastiCacheCreateCacheParameterGroupCommand.() -> Unit): com.amazonaws.services.elasticache.model.CacheParameterGroup {
	return this.block.declare(AmazonElastiCacheCreateCacheParameterGroupCommand(cacheParameterGroupName, cacheParameterGroupFamily, description).apply(init)) as com.amazonaws.services.elasticache.model.CacheParameterGroup
}

@Generated
class AmazonElastiCacheCreateCacheParameterGroupCommand(val cacheParameterGroupName: String, val cacheParameterGroupFamily: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest, com.amazonaws.services.elasticache.model.CacheParameterGroup> {



	override fun build(): com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest {
		val input = com.amazonaws.services.elasticache.model.CreateCacheParameterGroupRequest()
		input.setCacheParameterGroupName(this.cacheParameterGroupName)
		input.setCacheParameterGroupFamily(this.cacheParameterGroupFamily)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.CacheParameterGroup {
	  return com.amazonaws.services.elasticache.model.CacheParameterGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.CacheParameterGroup {
		return environment.elasticache.createCacheParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache create-cache-parameter-group")
				.argument("cache-parameter-group-name", cacheParameterGroupName)
				.argument("cache-parameter-group-family", cacheParameterGroupFamily)
				.argument("description", description)
	}

}


fun AmazonElastiCacheFunctions.createCacheSecurityGroup(cacheSecurityGroupName: String, description: String, init: AmazonElastiCacheCreateCacheSecurityGroupCommand.() -> Unit): com.amazonaws.services.elasticache.model.CacheSecurityGroup {
	return this.block.declare(AmazonElastiCacheCreateCacheSecurityGroupCommand(cacheSecurityGroupName, description).apply(init)) as com.amazonaws.services.elasticache.model.CacheSecurityGroup
}

@Generated
class AmazonElastiCacheCreateCacheSecurityGroupCommand(val cacheSecurityGroupName: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest, com.amazonaws.services.elasticache.model.CacheSecurityGroup> {



	override fun build(): com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest {
		val input = com.amazonaws.services.elasticache.model.CreateCacheSecurityGroupRequest()
		input.setCacheSecurityGroupName(this.cacheSecurityGroupName)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.CacheSecurityGroup {
	  return com.amazonaws.services.elasticache.model.CacheSecurityGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.CacheSecurityGroup {
		return environment.elasticache.createCacheSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache create-cache-security-group")
				.argument("cache-security-group-name", cacheSecurityGroupName)
				.argument("description", description)
	}

}


fun AmazonElastiCacheFunctions.createCacheSubnetGroup(cacheSubnetGroupName: String, cacheSubnetGroupDescription: String, subnetIds: List<String>, init: AmazonElastiCacheCreateCacheSubnetGroupCommand.() -> Unit): com.amazonaws.services.elasticache.model.CacheSubnetGroup {
	return this.block.declare(AmazonElastiCacheCreateCacheSubnetGroupCommand(cacheSubnetGroupName, cacheSubnetGroupDescription, subnetIds).apply(init)) as com.amazonaws.services.elasticache.model.CacheSubnetGroup
}

@Generated
class AmazonElastiCacheCreateCacheSubnetGroupCommand(val cacheSubnetGroupName: String, val cacheSubnetGroupDescription: String, val subnetIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest, com.amazonaws.services.elasticache.model.CacheSubnetGroup> {



	override fun build(): com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest {
		val input = com.amazonaws.services.elasticache.model.CreateCacheSubnetGroupRequest()
		input.setCacheSubnetGroupName(this.cacheSubnetGroupName)
		input.setCacheSubnetGroupDescription(this.cacheSubnetGroupDescription)
		input.setSubnetIds(this.subnetIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.CacheSubnetGroup {
	  return com.amazonaws.services.elasticache.model.CacheSubnetGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.CacheSubnetGroup {
		return environment.elasticache.createCacheSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache create-cache-subnet-group")
				.argument("cache-subnet-group-name", cacheSubnetGroupName)
				.argument("cache-subnet-group-description", cacheSubnetGroupDescription)
				.argument("subnet-ids", subnetIds.toString())
	}

}


fun AmazonElastiCacheFunctions.createReplicationGroup(replicationGroupId: String, replicationGroupDescription: String, init: AmazonElastiCacheCreateReplicationGroupCommand.() -> Unit): com.amazonaws.services.elasticache.model.ReplicationGroup {
	return this.block.declare(AmazonElastiCacheCreateReplicationGroupCommand(replicationGroupId, replicationGroupDescription).apply(init)) as com.amazonaws.services.elasticache.model.ReplicationGroup
}

@Generated
class AmazonElastiCacheCreateReplicationGroupCommand(val replicationGroupId: String, val replicationGroupDescription: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.CreateReplicationGroupRequest, com.amazonaws.services.elasticache.model.ReplicationGroup> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.ReplicationGroup {
	  return com.amazonaws.services.elasticache.model.ReplicationGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.ReplicationGroup {
		return environment.elasticache.createReplicationGroup(build())
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


fun AmazonElastiCacheFunctions.createSnapshot(snapshotName: String, init: AmazonElastiCacheCreateSnapshotCommand.() -> Unit): com.amazonaws.services.elasticache.model.Snapshot {
	return this.block.declare(AmazonElastiCacheCreateSnapshotCommand(snapshotName).apply(init)) as com.amazonaws.services.elasticache.model.Snapshot
}

@Generated
class AmazonElastiCacheCreateSnapshotCommand(val snapshotName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.CreateSnapshotRequest, com.amazonaws.services.elasticache.model.Snapshot> {

	var replicationGroupId: String? = null
	var cacheClusterId: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.CreateSnapshotRequest {
		val input = com.amazonaws.services.elasticache.model.CreateSnapshotRequest()
		input.setReplicationGroupId(this.replicationGroupId)
		input.setCacheClusterId(this.cacheClusterId)
		input.setSnapshotName(this.snapshotName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.Snapshot {
	  return com.amazonaws.services.elasticache.model.Snapshot()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.Snapshot {
		return environment.elasticache.createSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache create-snapshot")
				.argument("replication-group-id", replicationGroupId)
				.argument("cache-cluster-id", cacheClusterId)
				.argument("snapshot-name", snapshotName)
	}

}


fun AmazonElastiCacheFunctions.deleteCacheCluster(cacheClusterId: String, init: AmazonElastiCacheDeleteCacheClusterCommand.() -> Unit): com.amazonaws.services.elasticache.model.CacheCluster {
	return this.block.declare(AmazonElastiCacheDeleteCacheClusterCommand(cacheClusterId).apply(init)) as com.amazonaws.services.elasticache.model.CacheCluster
}

@Generated
class AmazonElastiCacheDeleteCacheClusterCommand(val cacheClusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest, com.amazonaws.services.elasticache.model.CacheCluster> {

	var finalSnapshotIdentifier: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest {
		val input = com.amazonaws.services.elasticache.model.DeleteCacheClusterRequest()
		input.setCacheClusterId(this.cacheClusterId)
		input.setFinalSnapshotIdentifier(this.finalSnapshotIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.CacheCluster {
	  return com.amazonaws.services.elasticache.model.CacheCluster()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.CacheCluster {
		return environment.elasticache.deleteCacheCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache delete-cache-cluster")
				.argument("cache-cluster-id", cacheClusterId)
				.argument("final-snapshot-identifier", finalSnapshotIdentifier)
	}

}


fun AmazonElastiCacheFunctions.deleteCacheParameterGroup(cacheParameterGroupName: String, init: AmazonElastiCacheDeleteCacheParameterGroupCommand.() -> Unit): com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupResult {
	return this.block.declare(AmazonElastiCacheDeleteCacheParameterGroupCommand(cacheParameterGroupName).apply(init)) as com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupResult
}

@Generated
class AmazonElastiCacheDeleteCacheParameterGroupCommand(val cacheParameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest, com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupResult> {



	override fun build(): com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest {
		val input = com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupRequest()
		input.setCacheParameterGroupName(this.cacheParameterGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupResult {
	  return com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.DeleteCacheParameterGroupResult {
		return environment.elasticache.deleteCacheParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache delete-cache-parameter-group")
				.argument("cache-parameter-group-name", cacheParameterGroupName)
	}

}


fun AmazonElastiCacheFunctions.deleteCacheSecurityGroup(cacheSecurityGroupName: String, init: AmazonElastiCacheDeleteCacheSecurityGroupCommand.() -> Unit): com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupResult {
	return this.block.declare(AmazonElastiCacheDeleteCacheSecurityGroupCommand(cacheSecurityGroupName).apply(init)) as com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupResult
}

@Generated
class AmazonElastiCacheDeleteCacheSecurityGroupCommand(val cacheSecurityGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest, com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupResult> {



	override fun build(): com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest {
		val input = com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupRequest()
		input.setCacheSecurityGroupName(this.cacheSecurityGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupResult {
	  return com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.DeleteCacheSecurityGroupResult {
		return environment.elasticache.deleteCacheSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache delete-cache-security-group")
				.argument("cache-security-group-name", cacheSecurityGroupName)
	}

}


fun AmazonElastiCacheFunctions.deleteCacheSubnetGroup(cacheSubnetGroupName: String, init: AmazonElastiCacheDeleteCacheSubnetGroupCommand.() -> Unit): com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupResult {
	return this.block.declare(AmazonElastiCacheDeleteCacheSubnetGroupCommand(cacheSubnetGroupName).apply(init)) as com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupResult
}

@Generated
class AmazonElastiCacheDeleteCacheSubnetGroupCommand(val cacheSubnetGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest, com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupResult> {



	override fun build(): com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest {
		val input = com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupRequest()
		input.setCacheSubnetGroupName(this.cacheSubnetGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupResult {
	  return com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.DeleteCacheSubnetGroupResult {
		return environment.elasticache.deleteCacheSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache delete-cache-subnet-group")
				.argument("cache-subnet-group-name", cacheSubnetGroupName)
	}

}


fun AmazonElastiCacheFunctions.deleteReplicationGroup(replicationGroupId: String, init: AmazonElastiCacheDeleteReplicationGroupCommand.() -> Unit): com.amazonaws.services.elasticache.model.ReplicationGroup {
	return this.block.declare(AmazonElastiCacheDeleteReplicationGroupCommand(replicationGroupId).apply(init)) as com.amazonaws.services.elasticache.model.ReplicationGroup
}

@Generated
class AmazonElastiCacheDeleteReplicationGroupCommand(val replicationGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest, com.amazonaws.services.elasticache.model.ReplicationGroup> {

	var retainPrimaryCluster: Boolean? = false
	var finalSnapshotIdentifier: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest {
		val input = com.amazonaws.services.elasticache.model.DeleteReplicationGroupRequest()
		input.setReplicationGroupId(this.replicationGroupId)
		input.setRetainPrimaryCluster(this.retainPrimaryCluster)
		input.setFinalSnapshotIdentifier(this.finalSnapshotIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.ReplicationGroup {
	  return com.amazonaws.services.elasticache.model.ReplicationGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.ReplicationGroup {
		return environment.elasticache.deleteReplicationGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache delete-replication-group")
				.argument("replication-group-id", replicationGroupId)
				.option("retain-primary-cluster", retainPrimaryCluster ?: false)
				.argument("final-snapshot-identifier", finalSnapshotIdentifier)
	}

}


fun AmazonElastiCacheFunctions.deleteSnapshot(snapshotName: String, init: AmazonElastiCacheDeleteSnapshotCommand.() -> Unit): com.amazonaws.services.elasticache.model.Snapshot {
	return this.block.declare(AmazonElastiCacheDeleteSnapshotCommand(snapshotName).apply(init)) as com.amazonaws.services.elasticache.model.Snapshot
}

@Generated
class AmazonElastiCacheDeleteSnapshotCommand(val snapshotName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DeleteSnapshotRequest, com.amazonaws.services.elasticache.model.Snapshot> {



	override fun build(): com.amazonaws.services.elasticache.model.DeleteSnapshotRequest {
		val input = com.amazonaws.services.elasticache.model.DeleteSnapshotRequest()
		input.setSnapshotName(this.snapshotName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.Snapshot {
	  return com.amazonaws.services.elasticache.model.Snapshot()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.Snapshot {
		return environment.elasticache.deleteSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache delete-snapshot")
				.argument("snapshot-name", snapshotName)
	}

}


fun AmazonElastiCacheFunctions.describeCacheClusters(init: AmazonElastiCacheDescribeCacheClustersCommand.() -> Unit): com.amazonaws.services.elasticache.model.DescribeCacheClustersResult {
	return this.block.declare(AmazonElastiCacheDescribeCacheClustersCommand().apply(init)) as com.amazonaws.services.elasticache.model.DescribeCacheClustersResult
}

@Generated
class AmazonElastiCacheDescribeCacheClustersCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeCacheClustersRequest, com.amazonaws.services.elasticache.model.DescribeCacheClustersResult> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.DescribeCacheClustersResult {
	  return com.amazonaws.services.elasticache.model.DescribeCacheClustersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.DescribeCacheClustersResult {
		return environment.elasticache.describeCacheClusters(build())
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


fun AmazonElastiCacheFunctions.describeCacheEngineVersions(init: AmazonElastiCacheDescribeCacheEngineVersionsCommand.() -> Unit): com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult {
	return this.block.declare(AmazonElastiCacheDescribeCacheEngineVersionsCommand().apply(init)) as com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult
}

@Generated
class AmazonElastiCacheDescribeCacheEngineVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsRequest, com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult {
	  return com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.DescribeCacheEngineVersionsResult {
		return environment.elasticache.describeCacheEngineVersions(build())
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


fun AmazonElastiCacheFunctions.describeCacheParameterGroups(init: AmazonElastiCacheDescribeCacheParameterGroupsCommand.() -> Unit): com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult {
	return this.block.declare(AmazonElastiCacheDescribeCacheParameterGroupsCommand().apply(init)) as com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult
}

@Generated
class AmazonElastiCacheDescribeCacheParameterGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsRequest, com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult {
	  return com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.DescribeCacheParameterGroupsResult {
		return environment.elasticache.describeCacheParameterGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-cache-parameter-groups")
				.argument("cache-parameter-group-name", cacheParameterGroupName)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElastiCacheFunctions.describeCacheParameters(cacheParameterGroupName: String, init: AmazonElastiCacheDescribeCacheParametersCommand.() -> Unit): com.amazonaws.services.elasticache.model.DescribeCacheParametersResult {
	return this.block.declare(AmazonElastiCacheDescribeCacheParametersCommand(cacheParameterGroupName).apply(init)) as com.amazonaws.services.elasticache.model.DescribeCacheParametersResult
}

@Generated
class AmazonElastiCacheDescribeCacheParametersCommand(val cacheParameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeCacheParametersRequest, com.amazonaws.services.elasticache.model.DescribeCacheParametersResult> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.DescribeCacheParametersResult {
	  return com.amazonaws.services.elasticache.model.DescribeCacheParametersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.DescribeCacheParametersResult {
		return environment.elasticache.describeCacheParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-cache-parameters")
				.argument("cache-parameter-group-name", cacheParameterGroupName)
				.argument("source", source)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElastiCacheFunctions.describeCacheSecurityGroups(init: AmazonElastiCacheDescribeCacheSecurityGroupsCommand.() -> Unit): com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult {
	return this.block.declare(AmazonElastiCacheDescribeCacheSecurityGroupsCommand().apply(init)) as com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult
}

@Generated
class AmazonElastiCacheDescribeCacheSecurityGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsRequest, com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult {
	  return com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.DescribeCacheSecurityGroupsResult {
		return environment.elasticache.describeCacheSecurityGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-cache-security-groups")
				.argument("cache-security-group-name", cacheSecurityGroupName)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElastiCacheFunctions.describeCacheSubnetGroups(init: AmazonElastiCacheDescribeCacheSubnetGroupsCommand.() -> Unit): com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult {
	return this.block.declare(AmazonElastiCacheDescribeCacheSubnetGroupsCommand().apply(init)) as com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult
}

@Generated
class AmazonElastiCacheDescribeCacheSubnetGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsRequest, com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult {
	  return com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.DescribeCacheSubnetGroupsResult {
		return environment.elasticache.describeCacheSubnetGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-cache-subnet-groups")
				.argument("cache-subnet-group-name", cacheSubnetGroupName)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElastiCacheFunctions.describeEngineDefaultParameters(cacheParameterGroupFamily: String, init: AmazonElastiCacheDescribeEngineDefaultParametersCommand.() -> Unit): com.amazonaws.services.elasticache.model.EngineDefaults {
	return this.block.declare(AmazonElastiCacheDescribeEngineDefaultParametersCommand(cacheParameterGroupFamily).apply(init)) as com.amazonaws.services.elasticache.model.EngineDefaults
}

@Generated
class AmazonElastiCacheDescribeEngineDefaultParametersCommand(val cacheParameterGroupFamily: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest, com.amazonaws.services.elasticache.model.EngineDefaults> {

	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest {
		val input = com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest()
		input.setCacheParameterGroupFamily(this.cacheParameterGroupFamily)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.EngineDefaults {
	  return com.amazonaws.services.elasticache.model.EngineDefaults()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.EngineDefaults {
		return environment.elasticache.describeEngineDefaultParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-engine-default-parameters")
				.argument("cache-parameter-group-family", cacheParameterGroupFamily)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElastiCacheFunctions.describeEvents(init: AmazonElastiCacheDescribeEventsCommand.() -> Unit): com.amazonaws.services.elasticache.model.DescribeEventsResult {
	return this.block.declare(AmazonElastiCacheDescribeEventsCommand().apply(init)) as com.amazonaws.services.elasticache.model.DescribeEventsResult
}

@Generated
class AmazonElastiCacheDescribeEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeEventsRequest, com.amazonaws.services.elasticache.model.DescribeEventsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.DescribeEventsResult {
	  return com.amazonaws.services.elasticache.model.DescribeEventsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.DescribeEventsResult {
		return environment.elasticache.describeEvents(build())
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


fun AmazonElastiCacheFunctions.describeReplicationGroups(init: AmazonElastiCacheDescribeReplicationGroupsCommand.() -> Unit): com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult {
	return this.block.declare(AmazonElastiCacheDescribeReplicationGroupsCommand().apply(init)) as com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult
}

@Generated
class AmazonElastiCacheDescribeReplicationGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeReplicationGroupsRequest, com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult {
	  return com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.DescribeReplicationGroupsResult {
		return environment.elasticache.describeReplicationGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache describe-replication-groups")
				.argument("replication-group-id", replicationGroupId)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElastiCacheFunctions.describeReservedCacheNodes(init: AmazonElastiCacheDescribeReservedCacheNodesCommand.() -> Unit): com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult {
	return this.block.declare(AmazonElastiCacheDescribeReservedCacheNodesCommand().apply(init)) as com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult
}

@Generated
class AmazonElastiCacheDescribeReservedCacheNodesCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesRequest, com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult {
	  return com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesResult {
		return environment.elasticache.describeReservedCacheNodes(build())
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


fun AmazonElastiCacheFunctions.describeReservedCacheNodesOfferings(init: AmazonElastiCacheDescribeReservedCacheNodesOfferingsCommand.() -> Unit): com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult {
	return this.block.declare(AmazonElastiCacheDescribeReservedCacheNodesOfferingsCommand().apply(init)) as com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult
}

@Generated
class AmazonElastiCacheDescribeReservedCacheNodesOfferingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsRequest, com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult {
	  return com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.DescribeReservedCacheNodesOfferingsResult {
		return environment.elasticache.describeReservedCacheNodesOfferings(build())
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


fun AmazonElastiCacheFunctions.describeSnapshots(init: AmazonElastiCacheDescribeSnapshotsCommand.() -> Unit): com.amazonaws.services.elasticache.model.DescribeSnapshotsResult {
	return this.block.declare(AmazonElastiCacheDescribeSnapshotsCommand().apply(init)) as com.amazonaws.services.elasticache.model.DescribeSnapshotsResult
}

@Generated
class AmazonElastiCacheDescribeSnapshotsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.DescribeSnapshotsRequest, com.amazonaws.services.elasticache.model.DescribeSnapshotsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.DescribeSnapshotsResult {
	  return com.amazonaws.services.elasticache.model.DescribeSnapshotsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.DescribeSnapshotsResult {
		return environment.elasticache.describeSnapshots(build())
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


fun AmazonElastiCacheFunctions.listAllowedNodeTypeModifications(init: AmazonElastiCacheListAllowedNodeTypeModificationsCommand.() -> Unit): com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult {
	return this.block.declare(AmazonElastiCacheListAllowedNodeTypeModificationsCommand().apply(init)) as com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult
}

@Generated
class AmazonElastiCacheListAllowedNodeTypeModificationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest, com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult> {

	var cacheClusterId: String? = null
	var replicationGroupId: String? = null

	override fun build(): com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest {
		val input = com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsRequest()
		input.setCacheClusterId(this.cacheClusterId)
		input.setReplicationGroupId(this.replicationGroupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult {
	  return com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.ListAllowedNodeTypeModificationsResult {
		return environment.elasticache.listAllowedNodeTypeModifications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache list-allowed-node-type-modifications")
				.argument("cache-cluster-id", cacheClusterId)
				.argument("replication-group-id", replicationGroupId)
	}

}


fun AmazonElastiCacheFunctions.listTagsForResource(resourceName: String, init: AmazonElastiCacheListTagsForResourceCommand.() -> Unit): com.amazonaws.services.elasticache.model.ListTagsForResourceResult {
	return this.block.declare(AmazonElastiCacheListTagsForResourceCommand(resourceName).apply(init)) as com.amazonaws.services.elasticache.model.ListTagsForResourceResult
}

@Generated
class AmazonElastiCacheListTagsForResourceCommand(val resourceName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.ListTagsForResourceRequest, com.amazonaws.services.elasticache.model.ListTagsForResourceResult> {



	override fun build(): com.amazonaws.services.elasticache.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.elasticache.model.ListTagsForResourceRequest()
		input.setResourceName(this.resourceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.ListTagsForResourceResult {
	  return com.amazonaws.services.elasticache.model.ListTagsForResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.ListTagsForResourceResult {
		return environment.elasticache.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache list-tags-for-resource")
				.argument("resource-name", resourceName)
	}

}


fun AmazonElastiCacheFunctions.modifyCacheCluster(cacheClusterId: String, init: AmazonElastiCacheModifyCacheClusterCommand.() -> Unit): com.amazonaws.services.elasticache.model.CacheCluster {
	return this.block.declare(AmazonElastiCacheModifyCacheClusterCommand(cacheClusterId).apply(init)) as com.amazonaws.services.elasticache.model.CacheCluster
}

@Generated
class AmazonElastiCacheModifyCacheClusterCommand(val cacheClusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.ModifyCacheClusterRequest, com.amazonaws.services.elasticache.model.CacheCluster> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.CacheCluster {
	  return com.amazonaws.services.elasticache.model.CacheCluster()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.CacheCluster {
		return environment.elasticache.modifyCacheCluster(build())
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


fun AmazonElastiCacheFunctions.modifyCacheParameterGroup(cacheParameterGroupName: String, parameterNameValues: List<com.amazonaws.services.elasticache.model.ParameterNameValue>, init: AmazonElastiCacheModifyCacheParameterGroupCommand.() -> Unit): com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupResult {
	return this.block.declare(AmazonElastiCacheModifyCacheParameterGroupCommand(cacheParameterGroupName, parameterNameValues).apply(init)) as com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupResult
}

@Generated
class AmazonElastiCacheModifyCacheParameterGroupCommand(val cacheParameterGroupName: String, val parameterNameValues: List<com.amazonaws.services.elasticache.model.ParameterNameValue>) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest, com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupResult> {



	override fun build(): com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest {
		val input = com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupRequest()
		input.setCacheParameterGroupName(this.cacheParameterGroupName)
		input.setParameterNameValues(this.parameterNameValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupResult {
	  return com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.ModifyCacheParameterGroupResult {
		return environment.elasticache.modifyCacheParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache modify-cache-parameter-group")
				.argument("cache-parameter-group-name", cacheParameterGroupName)
				.argument("parameter-name-values", parameterNameValues.toString())
	}

}


fun AmazonElastiCacheFunctions.modifyCacheSubnetGroup(cacheSubnetGroupName: String, init: AmazonElastiCacheModifyCacheSubnetGroupCommand.() -> Unit): com.amazonaws.services.elasticache.model.CacheSubnetGroup {
	return this.block.declare(AmazonElastiCacheModifyCacheSubnetGroupCommand(cacheSubnetGroupName).apply(init)) as com.amazonaws.services.elasticache.model.CacheSubnetGroup
}

@Generated
class AmazonElastiCacheModifyCacheSubnetGroupCommand(val cacheSubnetGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest, com.amazonaws.services.elasticache.model.CacheSubnetGroup> {

	var cacheSubnetGroupDescription: String? = null
	var subnetIds: List<String>? = null

	override fun build(): com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest {
		val input = com.amazonaws.services.elasticache.model.ModifyCacheSubnetGroupRequest()
		input.setCacheSubnetGroupName(this.cacheSubnetGroupName)
		input.setCacheSubnetGroupDescription(this.cacheSubnetGroupDescription)
		input.setSubnetIds(this.subnetIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.CacheSubnetGroup {
	  return com.amazonaws.services.elasticache.model.CacheSubnetGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.CacheSubnetGroup {
		return environment.elasticache.modifyCacheSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache modify-cache-subnet-group")
				.argument("cache-subnet-group-name", cacheSubnetGroupName)
				.argument("cache-subnet-group-description", cacheSubnetGroupDescription)
				.argument("subnet-ids", subnetIds?.toString())
	}

}


fun AmazonElastiCacheFunctions.modifyReplicationGroup(replicationGroupId: String, init: AmazonElastiCacheModifyReplicationGroupCommand.() -> Unit): com.amazonaws.services.elasticache.model.ReplicationGroup {
	return this.block.declare(AmazonElastiCacheModifyReplicationGroupCommand(replicationGroupId).apply(init)) as com.amazonaws.services.elasticache.model.ReplicationGroup
}

@Generated
class AmazonElastiCacheModifyReplicationGroupCommand(val replicationGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.ModifyReplicationGroupRequest, com.amazonaws.services.elasticache.model.ReplicationGroup> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.ReplicationGroup {
	  return com.amazonaws.services.elasticache.model.ReplicationGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.ReplicationGroup {
		return environment.elasticache.modifyReplicationGroup(build())
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


fun AmazonElastiCacheFunctions.modifyReplicationGroupShardConfiguration(replicationGroupId: String, nodeGroupCount: Int, applyImmediately: Boolean, init: AmazonElastiCacheModifyReplicationGroupShardConfigurationCommand.() -> Unit): com.amazonaws.services.elasticache.model.ReplicationGroup {
	return this.block.declare(AmazonElastiCacheModifyReplicationGroupShardConfigurationCommand(replicationGroupId, nodeGroupCount, applyImmediately).apply(init)) as com.amazonaws.services.elasticache.model.ReplicationGroup
}

@Generated
class AmazonElastiCacheModifyReplicationGroupShardConfigurationCommand(val replicationGroupId: String, val nodeGroupCount: Int, val applyImmediately: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.ModifyReplicationGroupShardConfigurationRequest, com.amazonaws.services.elasticache.model.ReplicationGroup> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.ReplicationGroup {
	  return com.amazonaws.services.elasticache.model.ReplicationGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.ReplicationGroup {
		return environment.elasticache.modifyReplicationGroupShardConfiguration(build())
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


fun AmazonElastiCacheFunctions.purchaseReservedCacheNodesOffering(reservedCacheNodesOfferingId: String, init: AmazonElastiCachePurchaseReservedCacheNodesOfferingCommand.() -> Unit): com.amazonaws.services.elasticache.model.ReservedCacheNode {
	return this.block.declare(AmazonElastiCachePurchaseReservedCacheNodesOfferingCommand(reservedCacheNodesOfferingId).apply(init)) as com.amazonaws.services.elasticache.model.ReservedCacheNode
}

@Generated
class AmazonElastiCachePurchaseReservedCacheNodesOfferingCommand(val reservedCacheNodesOfferingId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest, com.amazonaws.services.elasticache.model.ReservedCacheNode> {

	var reservedCacheNodeId: String? = null
	var cacheNodeCount: Int? = 0

	override fun build(): com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest {
		val input = com.amazonaws.services.elasticache.model.PurchaseReservedCacheNodesOfferingRequest()
		input.setReservedCacheNodesOfferingId(this.reservedCacheNodesOfferingId)
		input.setReservedCacheNodeId(this.reservedCacheNodeId)
		input.setCacheNodeCount(this.cacheNodeCount)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.ReservedCacheNode {
	  return com.amazonaws.services.elasticache.model.ReservedCacheNode()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.ReservedCacheNode {
		return environment.elasticache.purchaseReservedCacheNodesOffering(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache purchase-reserved-cache-nodes-offering")
				.argument("reserved-cache-nodes-offering-id", reservedCacheNodesOfferingId)
				.argument("reserved-cache-node-id", reservedCacheNodeId)
				.argument("cache-node-count", cacheNodeCount?.toString())
	}

}


fun AmazonElastiCacheFunctions.rebootCacheCluster(cacheClusterId: String, cacheNodeIdsToReboot: List<String>, init: AmazonElastiCacheRebootCacheClusterCommand.() -> Unit): com.amazonaws.services.elasticache.model.CacheCluster {
	return this.block.declare(AmazonElastiCacheRebootCacheClusterCommand(cacheClusterId, cacheNodeIdsToReboot).apply(init)) as com.amazonaws.services.elasticache.model.CacheCluster
}

@Generated
class AmazonElastiCacheRebootCacheClusterCommand(val cacheClusterId: String, val cacheNodeIdsToReboot: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.RebootCacheClusterRequest, com.amazonaws.services.elasticache.model.CacheCluster> {



	override fun build(): com.amazonaws.services.elasticache.model.RebootCacheClusterRequest {
		val input = com.amazonaws.services.elasticache.model.RebootCacheClusterRequest()
		input.setCacheClusterId(this.cacheClusterId)
		input.setCacheNodeIdsToReboot(this.cacheNodeIdsToReboot)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.CacheCluster {
	  return com.amazonaws.services.elasticache.model.CacheCluster()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.CacheCluster {
		return environment.elasticache.rebootCacheCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache reboot-cache-cluster")
				.argument("cache-cluster-id", cacheClusterId)
				.argument("cache-node-ids-to-reboot", cacheNodeIdsToReboot.toString())
	}

}


fun AmazonElastiCacheFunctions.removeTagsFromResource(resourceName: String, tagKeys: List<String>, init: AmazonElastiCacheRemoveTagsFromResourceCommand.() -> Unit): com.amazonaws.services.elasticache.model.RemoveTagsFromResourceResult {
	return this.block.declare(AmazonElastiCacheRemoveTagsFromResourceCommand(resourceName, tagKeys).apply(init)) as com.amazonaws.services.elasticache.model.RemoveTagsFromResourceResult
}

@Generated
class AmazonElastiCacheRemoveTagsFromResourceCommand(val resourceName: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest, com.amazonaws.services.elasticache.model.RemoveTagsFromResourceResult> {



	override fun build(): com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest {
		val input = com.amazonaws.services.elasticache.model.RemoveTagsFromResourceRequest()
		input.setResourceName(this.resourceName)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.RemoveTagsFromResourceResult {
	  return com.amazonaws.services.elasticache.model.RemoveTagsFromResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.RemoveTagsFromResourceResult {
		return environment.elasticache.removeTagsFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache remove-tags-from-resource")
				.argument("resource-name", resourceName)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonElastiCacheFunctions.resetCacheParameterGroup(cacheParameterGroupName: String, init: AmazonElastiCacheResetCacheParameterGroupCommand.() -> Unit): com.amazonaws.services.elasticache.model.ResetCacheParameterGroupResult {
	return this.block.declare(AmazonElastiCacheResetCacheParameterGroupCommand(cacheParameterGroupName).apply(init)) as com.amazonaws.services.elasticache.model.ResetCacheParameterGroupResult
}

@Generated
class AmazonElastiCacheResetCacheParameterGroupCommand(val cacheParameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest, com.amazonaws.services.elasticache.model.ResetCacheParameterGroupResult> {

	var resetAllParameters: Boolean? = false
	var parameterNameValues: List<com.amazonaws.services.elasticache.model.ParameterNameValue>? = null

	override fun build(): com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest {
		val input = com.amazonaws.services.elasticache.model.ResetCacheParameterGroupRequest()
		input.setCacheParameterGroupName(this.cacheParameterGroupName)
		input.setResetAllParameters(this.resetAllParameters)
		input.setParameterNameValues(this.parameterNameValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.ResetCacheParameterGroupResult {
	  return com.amazonaws.services.elasticache.model.ResetCacheParameterGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.ResetCacheParameterGroupResult {
		return environment.elasticache.resetCacheParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache reset-cache-parameter-group")
				.argument("cache-parameter-group-name", cacheParameterGroupName)
				.option("reset-all-parameters", resetAllParameters ?: false)
				.argument("parameter-name-values", parameterNameValues?.toString())
	}

}


fun AmazonElastiCacheFunctions.revokeCacheSecurityGroupIngress(cacheSecurityGroupName: String, eC2SecurityGroupName: String, eC2SecurityGroupOwnerId: String, init: AmazonElastiCacheRevokeCacheSecurityGroupIngressCommand.() -> Unit): com.amazonaws.services.elasticache.model.CacheSecurityGroup {
	return this.block.declare(AmazonElastiCacheRevokeCacheSecurityGroupIngressCommand(cacheSecurityGroupName, eC2SecurityGroupName, eC2SecurityGroupOwnerId).apply(init)) as com.amazonaws.services.elasticache.model.CacheSecurityGroup
}

@Generated
class AmazonElastiCacheRevokeCacheSecurityGroupIngressCommand(val cacheSecurityGroupName: String, val eC2SecurityGroupName: String, val eC2SecurityGroupOwnerId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest, com.amazonaws.services.elasticache.model.CacheSecurityGroup> {



	override fun build(): com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest {
		val input = com.amazonaws.services.elasticache.model.RevokeCacheSecurityGroupIngressRequest()
		input.setCacheSecurityGroupName(this.cacheSecurityGroupName)
		input.setEC2SecurityGroupName(this.eC2SecurityGroupName)
		input.setEC2SecurityGroupOwnerId(this.eC2SecurityGroupOwnerId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.CacheSecurityGroup {
	  return com.amazonaws.services.elasticache.model.CacheSecurityGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.CacheSecurityGroup {
		return environment.elasticache.revokeCacheSecurityGroupIngress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache revoke-cache-security-group-ingress")
				.argument("cache-security-group-name", cacheSecurityGroupName)
				.argument("ec2-security-group-name", eC2SecurityGroupName)
				.argument("ec2-security-group-owner-id", eC2SecurityGroupOwnerId)
	}

}


fun AmazonElastiCacheFunctions.testFailover(replicationGroupId: String, nodeGroupId: String, init: AmazonElastiCacheTestFailoverCommand.() -> Unit): com.amazonaws.services.elasticache.model.ReplicationGroup {
	return this.block.declare(AmazonElastiCacheTestFailoverCommand(replicationGroupId, nodeGroupId).apply(init)) as com.amazonaws.services.elasticache.model.ReplicationGroup
}

@Generated
class AmazonElastiCacheTestFailoverCommand(val replicationGroupId: String, val nodeGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticache.model.TestFailoverRequest, com.amazonaws.services.elasticache.model.ReplicationGroup> {



	override fun build(): com.amazonaws.services.elasticache.model.TestFailoverRequest {
		val input = com.amazonaws.services.elasticache.model.TestFailoverRequest()
		input.setReplicationGroupId(this.replicationGroupId)
		input.setNodeGroupId(this.nodeGroupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticache.model.ReplicationGroup {
	  return com.amazonaws.services.elasticache.model.ReplicationGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticache.model.ReplicationGroup {
		return environment.elasticache.testFailover(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticache test-failover")
				.argument("replication-group-id", replicationGroupId)
				.argument("node-group-id", nodeGroupId)
	}

}
