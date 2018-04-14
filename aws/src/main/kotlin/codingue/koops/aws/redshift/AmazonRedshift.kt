
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.redshift

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.redshift.*
import com.amazonaws.services.redshift.model.*

var codingue.koops.core.Environment.redshift: AmazonRedshift
	get() {
		var service = this.capabilities["aws-redshift"]
		if (service == null) {
			service = AmazonRedshiftClientBuilder.standard().build()
			this.capabilities["aws-redshift"] = service
		}
		return service as AmazonRedshift
	}
	set(redshift) {
		this.capabilities["aws-redshift"] = redshift
	}

@Generated
class AmazonRedshiftFunctions(val block: Block)

infix fun <T> AwsContinuation.redshift(init: AmazonRedshiftFunctions.() -> T): T {
	return AmazonRedshiftFunctions(shell).run(init)
}

			

fun AmazonRedshiftFunctions.authorizeClusterSecurityGroupIngress(clusterSecurityGroupName: String, init: AmazonRedshiftAuthorizeClusterSecurityGroupIngressCommand.() -> Unit): com.amazonaws.services.redshift.model.ClusterSecurityGroup {
	return this.block.declare(AmazonRedshiftAuthorizeClusterSecurityGroupIngressCommand(clusterSecurityGroupName).apply(init)) as com.amazonaws.services.redshift.model.ClusterSecurityGroup
}

@Generated
class AmazonRedshiftAuthorizeClusterSecurityGroupIngressCommand(val clusterSecurityGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.AuthorizeClusterSecurityGroupIngressRequest, com.amazonaws.services.redshift.model.ClusterSecurityGroup> {

	var cIDRIP: String? = null
	var eC2SecurityGroupName: String? = null
	var eC2SecurityGroupOwnerId: String? = null

	override fun build(): com.amazonaws.services.redshift.model.AuthorizeClusterSecurityGroupIngressRequest {
		val input = com.amazonaws.services.redshift.model.AuthorizeClusterSecurityGroupIngressRequest()
		input.setClusterSecurityGroupName(this.clusterSecurityGroupName)
		input.setCIDRIP(this.cIDRIP)
		input.setEC2SecurityGroupName(this.eC2SecurityGroupName)
		input.setEC2SecurityGroupOwnerId(this.eC2SecurityGroupOwnerId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.ClusterSecurityGroup {
	  return com.amazonaws.services.redshift.model.ClusterSecurityGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.ClusterSecurityGroup {
		return environment.redshift.authorizeClusterSecurityGroupIngress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift authorize-cluster-security-group-ingress")
				.argument("cluster-security-group-name", clusterSecurityGroupName)
				.argument("cidrip", cIDRIP)
				.argument("ec2-security-group-name", eC2SecurityGroupName)
				.argument("ec2-security-group-owner-id", eC2SecurityGroupOwnerId)
	}

}


fun AmazonRedshiftFunctions.authorizeSnapshotAccess(snapshotIdentifier: String, accountWithRestoreAccess: String, init: AmazonRedshiftAuthorizeSnapshotAccessCommand.() -> Unit): com.amazonaws.services.redshift.model.Snapshot {
	return this.block.declare(AmazonRedshiftAuthorizeSnapshotAccessCommand(snapshotIdentifier, accountWithRestoreAccess).apply(init)) as com.amazonaws.services.redshift.model.Snapshot
}

@Generated
class AmazonRedshiftAuthorizeSnapshotAccessCommand(val snapshotIdentifier: String, val accountWithRestoreAccess: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.AuthorizeSnapshotAccessRequest, com.amazonaws.services.redshift.model.Snapshot> {

	var snapshotClusterIdentifier: String? = null

	override fun build(): com.amazonaws.services.redshift.model.AuthorizeSnapshotAccessRequest {
		val input = com.amazonaws.services.redshift.model.AuthorizeSnapshotAccessRequest()
		input.setSnapshotIdentifier(this.snapshotIdentifier)
		input.setSnapshotClusterIdentifier(this.snapshotClusterIdentifier)
		input.setAccountWithRestoreAccess(this.accountWithRestoreAccess)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.Snapshot {
	  return com.amazonaws.services.redshift.model.Snapshot()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.Snapshot {
		return environment.redshift.authorizeSnapshotAccess(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift authorize-snapshot-access")
				.argument("snapshot-identifier", snapshotIdentifier)
				.argument("snapshot-cluster-identifier", snapshotClusterIdentifier)
				.argument("account-with-restore-access", accountWithRestoreAccess)
	}

}


fun AmazonRedshiftFunctions.copyClusterSnapshot(sourceSnapshotIdentifier: String, targetSnapshotIdentifier: String, init: AmazonRedshiftCopyClusterSnapshotCommand.() -> Unit): com.amazonaws.services.redshift.model.Snapshot {
	return this.block.declare(AmazonRedshiftCopyClusterSnapshotCommand(sourceSnapshotIdentifier, targetSnapshotIdentifier).apply(init)) as com.amazonaws.services.redshift.model.Snapshot
}

@Generated
class AmazonRedshiftCopyClusterSnapshotCommand(val sourceSnapshotIdentifier: String, val targetSnapshotIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.CopyClusterSnapshotRequest, com.amazonaws.services.redshift.model.Snapshot> {

	var sourceSnapshotClusterIdentifier: String? = null

	override fun build(): com.amazonaws.services.redshift.model.CopyClusterSnapshotRequest {
		val input = com.amazonaws.services.redshift.model.CopyClusterSnapshotRequest()
		input.setSourceSnapshotIdentifier(this.sourceSnapshotIdentifier)
		input.setSourceSnapshotClusterIdentifier(this.sourceSnapshotClusterIdentifier)
		input.setTargetSnapshotIdentifier(this.targetSnapshotIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.Snapshot {
	  return com.amazonaws.services.redshift.model.Snapshot()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.Snapshot {
		return environment.redshift.copyClusterSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift copy-cluster-snapshot")
				.argument("source-snapshot-identifier", sourceSnapshotIdentifier)
				.argument("source-snapshot-cluster-identifier", sourceSnapshotClusterIdentifier)
				.argument("target-snapshot-identifier", targetSnapshotIdentifier)
	}

}


fun AmazonRedshiftFunctions.createCluster(clusterIdentifier: String, nodeType: String, masterUsername: String, masterUserPassword: String, init: AmazonRedshiftCreateClusterCommand.() -> Unit): com.amazonaws.services.redshift.model.Cluster {
	return this.block.declare(AmazonRedshiftCreateClusterCommand(clusterIdentifier, nodeType, masterUsername, masterUserPassword).apply(init)) as com.amazonaws.services.redshift.model.Cluster
}

@Generated
class AmazonRedshiftCreateClusterCommand(val clusterIdentifier: String, val nodeType: String, val masterUsername: String, val masterUserPassword: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.CreateClusterRequest, com.amazonaws.services.redshift.model.Cluster> {

	var dBName: String? = null
	var clusterType: String? = null
	var clusterSecurityGroups: List<String>? = null
	var vpcSecurityGroupIds: List<String>? = null
	var clusterSubnetGroupName: String? = null
	var availabilityZone: String? = null
	var preferredMaintenanceWindow: String? = null
	var clusterParameterGroupName: String? = null
	var automatedSnapshotRetentionPeriod: Int? = 0
	var port: Int? = 0
	var clusterVersion: String? = null
	var allowVersionUpgrade: Boolean? = false
	var numberOfNodes: Int? = 0
	var publiclyAccessible: Boolean? = false
	var encrypted: Boolean? = false
	var hsmClientCertificateIdentifier: String? = null
	var hsmConfigurationIdentifier: String? = null
	var elasticIp: String? = null
	var tags: List<com.amazonaws.services.redshift.model.Tag>? = null
	var kmsKeyId: String? = null
	var enhancedVpcRouting: Boolean? = false
	var additionalInfo: String? = null
	var iamRoles: List<String>? = null

	override fun build(): com.amazonaws.services.redshift.model.CreateClusterRequest {
		val input = com.amazonaws.services.redshift.model.CreateClusterRequest()
		input.setDBName(this.dBName)
		input.setClusterIdentifier(this.clusterIdentifier)
		input.setClusterType(this.clusterType)
		input.setNodeType(this.nodeType)
		input.setMasterUsername(this.masterUsername)
		input.setMasterUserPassword(this.masterUserPassword)
		input.setClusterSecurityGroups(this.clusterSecurityGroups)
		input.setVpcSecurityGroupIds(this.vpcSecurityGroupIds)
		input.setClusterSubnetGroupName(this.clusterSubnetGroupName)
		input.setAvailabilityZone(this.availabilityZone)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setClusterParameterGroupName(this.clusterParameterGroupName)
		input.setAutomatedSnapshotRetentionPeriod(this.automatedSnapshotRetentionPeriod)
		input.setPort(this.port)
		input.setClusterVersion(this.clusterVersion)
		input.setAllowVersionUpgrade(this.allowVersionUpgrade)
		input.setNumberOfNodes(this.numberOfNodes)
		input.setPubliclyAccessible(this.publiclyAccessible)
		input.setEncrypted(this.encrypted)
		input.setHsmClientCertificateIdentifier(this.hsmClientCertificateIdentifier)
		input.setHsmConfigurationIdentifier(this.hsmConfigurationIdentifier)
		input.setElasticIp(this.elasticIp)
		input.setTags(this.tags)
		input.setKmsKeyId(this.kmsKeyId)
		input.setEnhancedVpcRouting(this.enhancedVpcRouting)
		input.setAdditionalInfo(this.additionalInfo)
		input.setIamRoles(this.iamRoles)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.Cluster {
	  return com.amazonaws.services.redshift.model.Cluster()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.Cluster {
		return environment.redshift.createCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift create-cluster")
				.argument("dbname", dBName)
				.argument("cluster-identifier", clusterIdentifier)
				.argument("cluster-type", clusterType)
				.argument("node-type", nodeType)
				.argument("master-username", masterUsername)
				.argument("master-user-password", masterUserPassword)
				.argument("cluster-security-groups", clusterSecurityGroups?.toString())
				.argument("vpc-security-group-ids", vpcSecurityGroupIds?.toString())
				.argument("cluster-subnet-group-name", clusterSubnetGroupName)
				.argument("availability-zone", availabilityZone)
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.argument("cluster-parameter-group-name", clusterParameterGroupName)
				.argument("automated-snapshot-retention-period", automatedSnapshotRetentionPeriod?.toString())
				.argument("port", port?.toString())
				.argument("cluster-version", clusterVersion)
				.option("allow-version-upgrade", allowVersionUpgrade ?: false)
				.argument("number-of-nodes", numberOfNodes?.toString())
				.option("publicly-accessible", publiclyAccessible ?: false)
				.option("encrypted", encrypted ?: false)
				.argument("hsm-client-certificate-identifier", hsmClientCertificateIdentifier)
				.argument("hsm-configuration-identifier", hsmConfigurationIdentifier)
				.argument("elastic-ip", elasticIp)
				.argument("tags", tags?.toString())
				.argument("kms-key-id", kmsKeyId)
				.option("enhanced-vpc-routing", enhancedVpcRouting ?: false)
				.argument("additional-info", additionalInfo)
				.argument("iam-roles", iamRoles?.toString())
	}

}


fun AmazonRedshiftFunctions.createClusterParameterGroup(parameterGroupName: String, parameterGroupFamily: String, description: String, init: AmazonRedshiftCreateClusterParameterGroupCommand.() -> Unit): com.amazonaws.services.redshift.model.ClusterParameterGroup {
	return this.block.declare(AmazonRedshiftCreateClusterParameterGroupCommand(parameterGroupName, parameterGroupFamily, description).apply(init)) as com.amazonaws.services.redshift.model.ClusterParameterGroup
}

@Generated
class AmazonRedshiftCreateClusterParameterGroupCommand(val parameterGroupName: String, val parameterGroupFamily: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.CreateClusterParameterGroupRequest, com.amazonaws.services.redshift.model.ClusterParameterGroup> {

	var tags: List<com.amazonaws.services.redshift.model.Tag>? = null

	override fun build(): com.amazonaws.services.redshift.model.CreateClusterParameterGroupRequest {
		val input = com.amazonaws.services.redshift.model.CreateClusterParameterGroupRequest()
		input.setParameterGroupName(this.parameterGroupName)
		input.setParameterGroupFamily(this.parameterGroupFamily)
		input.setDescription(this.description)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.ClusterParameterGroup {
	  return com.amazonaws.services.redshift.model.ClusterParameterGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.ClusterParameterGroup {
		return environment.redshift.createClusterParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift create-cluster-parameter-group")
				.argument("parameter-group-name", parameterGroupName)
				.argument("parameter-group-family", parameterGroupFamily)
				.argument("description", description)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRedshiftFunctions.createClusterSecurityGroup(clusterSecurityGroupName: String, description: String, init: AmazonRedshiftCreateClusterSecurityGroupCommand.() -> Unit): com.amazonaws.services.redshift.model.ClusterSecurityGroup {
	return this.block.declare(AmazonRedshiftCreateClusterSecurityGroupCommand(clusterSecurityGroupName, description).apply(init)) as com.amazonaws.services.redshift.model.ClusterSecurityGroup
}

@Generated
class AmazonRedshiftCreateClusterSecurityGroupCommand(val clusterSecurityGroupName: String, val description: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.CreateClusterSecurityGroupRequest, com.amazonaws.services.redshift.model.ClusterSecurityGroup> {

	var tags: List<com.amazonaws.services.redshift.model.Tag>? = null

	override fun build(): com.amazonaws.services.redshift.model.CreateClusterSecurityGroupRequest {
		val input = com.amazonaws.services.redshift.model.CreateClusterSecurityGroupRequest()
		input.setClusterSecurityGroupName(this.clusterSecurityGroupName)
		input.setDescription(this.description)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.ClusterSecurityGroup {
	  return com.amazonaws.services.redshift.model.ClusterSecurityGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.ClusterSecurityGroup {
		return environment.redshift.createClusterSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift create-cluster-security-group")
				.argument("cluster-security-group-name", clusterSecurityGroupName)
				.argument("description", description)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRedshiftFunctions.createClusterSnapshot(snapshotIdentifier: String, clusterIdentifier: String, init: AmazonRedshiftCreateClusterSnapshotCommand.() -> Unit): com.amazonaws.services.redshift.model.Snapshot {
	return this.block.declare(AmazonRedshiftCreateClusterSnapshotCommand(snapshotIdentifier, clusterIdentifier).apply(init)) as com.amazonaws.services.redshift.model.Snapshot
}

@Generated
class AmazonRedshiftCreateClusterSnapshotCommand(val snapshotIdentifier: String, val clusterIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.CreateClusterSnapshotRequest, com.amazonaws.services.redshift.model.Snapshot> {

	var tags: List<com.amazonaws.services.redshift.model.Tag>? = null

	override fun build(): com.amazonaws.services.redshift.model.CreateClusterSnapshotRequest {
		val input = com.amazonaws.services.redshift.model.CreateClusterSnapshotRequest()
		input.setSnapshotIdentifier(this.snapshotIdentifier)
		input.setClusterIdentifier(this.clusterIdentifier)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.Snapshot {
	  return com.amazonaws.services.redshift.model.Snapshot()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.Snapshot {
		return environment.redshift.createClusterSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift create-cluster-snapshot")
				.argument("snapshot-identifier", snapshotIdentifier)
				.argument("cluster-identifier", clusterIdentifier)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRedshiftFunctions.createClusterSubnetGroup(clusterSubnetGroupName: String, description: String, subnetIds: List<String>, init: AmazonRedshiftCreateClusterSubnetGroupCommand.() -> Unit): com.amazonaws.services.redshift.model.ClusterSubnetGroup {
	return this.block.declare(AmazonRedshiftCreateClusterSubnetGroupCommand(clusterSubnetGroupName, description, subnetIds).apply(init)) as com.amazonaws.services.redshift.model.ClusterSubnetGroup
}

@Generated
class AmazonRedshiftCreateClusterSubnetGroupCommand(val clusterSubnetGroupName: String, val description: String, val subnetIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.CreateClusterSubnetGroupRequest, com.amazonaws.services.redshift.model.ClusterSubnetGroup> {

	var tags: List<com.amazonaws.services.redshift.model.Tag>? = null

	override fun build(): com.amazonaws.services.redshift.model.CreateClusterSubnetGroupRequest {
		val input = com.amazonaws.services.redshift.model.CreateClusterSubnetGroupRequest()
		input.setClusterSubnetGroupName(this.clusterSubnetGroupName)
		input.setDescription(this.description)
		input.setSubnetIds(this.subnetIds)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.ClusterSubnetGroup {
	  return com.amazonaws.services.redshift.model.ClusterSubnetGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.ClusterSubnetGroup {
		return environment.redshift.createClusterSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift create-cluster-subnet-group")
				.argument("cluster-subnet-group-name", clusterSubnetGroupName)
				.argument("description", description)
				.argument("subnet-ids", subnetIds.toString())
				.argument("tags", tags?.toString())
	}

}


fun AmazonRedshiftFunctions.createEventSubscription(subscriptionName: String, snsTopicArn: String, init: AmazonRedshiftCreateEventSubscriptionCommand.() -> Unit): com.amazonaws.services.redshift.model.EventSubscription {
	return this.block.declare(AmazonRedshiftCreateEventSubscriptionCommand(subscriptionName, snsTopicArn).apply(init)) as com.amazonaws.services.redshift.model.EventSubscription
}

@Generated
class AmazonRedshiftCreateEventSubscriptionCommand(val subscriptionName: String, val snsTopicArn: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.CreateEventSubscriptionRequest, com.amazonaws.services.redshift.model.EventSubscription> {

	var sourceType: String? = null
	var sourceIds: List<String>? = null
	var eventCategories: List<String>? = null
	var severity: String? = null
	var enabled: Boolean? = false
	var tags: List<com.amazonaws.services.redshift.model.Tag>? = null

	override fun build(): com.amazonaws.services.redshift.model.CreateEventSubscriptionRequest {
		val input = com.amazonaws.services.redshift.model.CreateEventSubscriptionRequest()
		input.setSubscriptionName(this.subscriptionName)
		input.setSnsTopicArn(this.snsTopicArn)
		input.setSourceType(this.sourceType)
		input.setSourceIds(this.sourceIds)
		input.setEventCategories(this.eventCategories)
		input.setSeverity(this.severity)
		input.setEnabled(this.enabled)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.EventSubscription {
	  return com.amazonaws.services.redshift.model.EventSubscription()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.EventSubscription {
		return environment.redshift.createEventSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift create-event-subscription")
				.argument("subscription-name", subscriptionName)
				.argument("sns-topic-arn", snsTopicArn)
				.argument("source-type", sourceType)
				.argument("source-ids", sourceIds?.toString())
				.argument("event-categories", eventCategories?.toString())
				.argument("severity", severity)
				.option("enabled", enabled ?: false)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRedshiftFunctions.createHsmClientCertificate(hsmClientCertificateIdentifier: String, init: AmazonRedshiftCreateHsmClientCertificateCommand.() -> Unit): com.amazonaws.services.redshift.model.HsmClientCertificate {
	return this.block.declare(AmazonRedshiftCreateHsmClientCertificateCommand(hsmClientCertificateIdentifier).apply(init)) as com.amazonaws.services.redshift.model.HsmClientCertificate
}

@Generated
class AmazonRedshiftCreateHsmClientCertificateCommand(val hsmClientCertificateIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.CreateHsmClientCertificateRequest, com.amazonaws.services.redshift.model.HsmClientCertificate> {

	var tags: List<com.amazonaws.services.redshift.model.Tag>? = null

	override fun build(): com.amazonaws.services.redshift.model.CreateHsmClientCertificateRequest {
		val input = com.amazonaws.services.redshift.model.CreateHsmClientCertificateRequest()
		input.setHsmClientCertificateIdentifier(this.hsmClientCertificateIdentifier)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.HsmClientCertificate {
	  return com.amazonaws.services.redshift.model.HsmClientCertificate()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.HsmClientCertificate {
		return environment.redshift.createHsmClientCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift create-hsm-client-certificate")
				.argument("hsm-client-certificate-identifier", hsmClientCertificateIdentifier)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRedshiftFunctions.createHsmConfiguration(hsmConfigurationIdentifier: String, description: String, hsmIpAddress: String, hsmPartitionName: String, hsmPartitionPassword: String, hsmServerPublicCertificate: String, init: AmazonRedshiftCreateHsmConfigurationCommand.() -> Unit): com.amazonaws.services.redshift.model.HsmConfiguration {
	return this.block.declare(AmazonRedshiftCreateHsmConfigurationCommand(hsmConfigurationIdentifier, description, hsmIpAddress, hsmPartitionName, hsmPartitionPassword, hsmServerPublicCertificate).apply(init)) as com.amazonaws.services.redshift.model.HsmConfiguration
}

@Generated
class AmazonRedshiftCreateHsmConfigurationCommand(val hsmConfigurationIdentifier: String, val description: String, val hsmIpAddress: String, val hsmPartitionName: String, val hsmPartitionPassword: String, val hsmServerPublicCertificate: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.CreateHsmConfigurationRequest, com.amazonaws.services.redshift.model.HsmConfiguration> {

	var tags: List<com.amazonaws.services.redshift.model.Tag>? = null

	override fun build(): com.amazonaws.services.redshift.model.CreateHsmConfigurationRequest {
		val input = com.amazonaws.services.redshift.model.CreateHsmConfigurationRequest()
		input.setHsmConfigurationIdentifier(this.hsmConfigurationIdentifier)
		input.setDescription(this.description)
		input.setHsmIpAddress(this.hsmIpAddress)
		input.setHsmPartitionName(this.hsmPartitionName)
		input.setHsmPartitionPassword(this.hsmPartitionPassword)
		input.setHsmServerPublicCertificate(this.hsmServerPublicCertificate)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.HsmConfiguration {
	  return com.amazonaws.services.redshift.model.HsmConfiguration()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.HsmConfiguration {
		return environment.redshift.createHsmConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift create-hsm-configuration")
				.argument("hsm-configuration-identifier", hsmConfigurationIdentifier)
				.argument("description", description)
				.argument("hsm-ip-address", hsmIpAddress)
				.argument("hsm-partition-name", hsmPartitionName)
				.argument("hsm-partition-password", hsmPartitionPassword)
				.argument("hsm-server-public-certificate", hsmServerPublicCertificate)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRedshiftFunctions.createSnapshotCopyGrant(snapshotCopyGrantName: String, init: AmazonRedshiftCreateSnapshotCopyGrantCommand.() -> Unit): com.amazonaws.services.redshift.model.SnapshotCopyGrant {
	return this.block.declare(AmazonRedshiftCreateSnapshotCopyGrantCommand(snapshotCopyGrantName).apply(init)) as com.amazonaws.services.redshift.model.SnapshotCopyGrant
}

@Generated
class AmazonRedshiftCreateSnapshotCopyGrantCommand(val snapshotCopyGrantName: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.CreateSnapshotCopyGrantRequest, com.amazonaws.services.redshift.model.SnapshotCopyGrant> {

	var kmsKeyId: String? = null
	var tags: List<com.amazonaws.services.redshift.model.Tag>? = null

	override fun build(): com.amazonaws.services.redshift.model.CreateSnapshotCopyGrantRequest {
		val input = com.amazonaws.services.redshift.model.CreateSnapshotCopyGrantRequest()
		input.setSnapshotCopyGrantName(this.snapshotCopyGrantName)
		input.setKmsKeyId(this.kmsKeyId)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.SnapshotCopyGrant {
	  return com.amazonaws.services.redshift.model.SnapshotCopyGrant()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.SnapshotCopyGrant {
		return environment.redshift.createSnapshotCopyGrant(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift create-snapshot-copy-grant")
				.argument("snapshot-copy-grant-name", snapshotCopyGrantName)
				.argument("kms-key-id", kmsKeyId)
				.argument("tags", tags?.toString())
	}

}


fun AmazonRedshiftFunctions.createTags(resourceName: String, tags: List<com.amazonaws.services.redshift.model.Tag>, init: AmazonRedshiftCreateTagsCommand.() -> Unit): com.amazonaws.services.redshift.model.CreateTagsResult {
	return this.block.declare(AmazonRedshiftCreateTagsCommand(resourceName, tags).apply(init)) as com.amazonaws.services.redshift.model.CreateTagsResult
}

@Generated
class AmazonRedshiftCreateTagsCommand(val resourceName: String, val tags: List<com.amazonaws.services.redshift.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.CreateTagsRequest, com.amazonaws.services.redshift.model.CreateTagsResult> {



	override fun build(): com.amazonaws.services.redshift.model.CreateTagsRequest {
		val input = com.amazonaws.services.redshift.model.CreateTagsRequest()
		input.setResourceName(this.resourceName)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.CreateTagsResult {
	  return com.amazonaws.services.redshift.model.CreateTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.CreateTagsResult {
		return environment.redshift.createTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift create-tags")
				.argument("resource-name", resourceName)
				.argument("tags", tags.toString())
	}

}


fun AmazonRedshiftFunctions.deleteCluster(clusterIdentifier: String, init: AmazonRedshiftDeleteClusterCommand.() -> Unit): com.amazonaws.services.redshift.model.Cluster {
	return this.block.declare(AmazonRedshiftDeleteClusterCommand(clusterIdentifier).apply(init)) as com.amazonaws.services.redshift.model.Cluster
}

@Generated
class AmazonRedshiftDeleteClusterCommand(val clusterIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DeleteClusterRequest, com.amazonaws.services.redshift.model.Cluster> {

	var skipFinalClusterSnapshot: Boolean? = false
	var finalClusterSnapshotIdentifier: String? = null

	override fun build(): com.amazonaws.services.redshift.model.DeleteClusterRequest {
		val input = com.amazonaws.services.redshift.model.DeleteClusterRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		input.setSkipFinalClusterSnapshot(this.skipFinalClusterSnapshot)
		input.setFinalClusterSnapshotIdentifier(this.finalClusterSnapshotIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.Cluster {
	  return com.amazonaws.services.redshift.model.Cluster()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.Cluster {
		return environment.redshift.deleteCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift delete-cluster")
				.argument("cluster-identifier", clusterIdentifier)
				.option("skip-final-cluster-snapshot", skipFinalClusterSnapshot ?: false)
				.argument("final-cluster-snapshot-identifier", finalClusterSnapshotIdentifier)
	}

}


fun AmazonRedshiftFunctions.deleteClusterParameterGroup(parameterGroupName: String, init: AmazonRedshiftDeleteClusterParameterGroupCommand.() -> Unit): com.amazonaws.services.redshift.model.DeleteClusterParameterGroupResult {
	return this.block.declare(AmazonRedshiftDeleteClusterParameterGroupCommand(parameterGroupName).apply(init)) as com.amazonaws.services.redshift.model.DeleteClusterParameterGroupResult
}

@Generated
class AmazonRedshiftDeleteClusterParameterGroupCommand(val parameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DeleteClusterParameterGroupRequest, com.amazonaws.services.redshift.model.DeleteClusterParameterGroupResult> {



	override fun build(): com.amazonaws.services.redshift.model.DeleteClusterParameterGroupRequest {
		val input = com.amazonaws.services.redshift.model.DeleteClusterParameterGroupRequest()
		input.setParameterGroupName(this.parameterGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DeleteClusterParameterGroupResult {
	  return com.amazonaws.services.redshift.model.DeleteClusterParameterGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DeleteClusterParameterGroupResult {
		return environment.redshift.deleteClusterParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift delete-cluster-parameter-group")
				.argument("parameter-group-name", parameterGroupName)
	}

}


fun AmazonRedshiftFunctions.deleteClusterSecurityGroup(clusterSecurityGroupName: String, init: AmazonRedshiftDeleteClusterSecurityGroupCommand.() -> Unit): com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupResult {
	return this.block.declare(AmazonRedshiftDeleteClusterSecurityGroupCommand(clusterSecurityGroupName).apply(init)) as com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupResult
}

@Generated
class AmazonRedshiftDeleteClusterSecurityGroupCommand(val clusterSecurityGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupRequest, com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupResult> {



	override fun build(): com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupRequest {
		val input = com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupRequest()
		input.setClusterSecurityGroupName(this.clusterSecurityGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupResult {
	  return com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupResult {
		return environment.redshift.deleteClusterSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift delete-cluster-security-group")
				.argument("cluster-security-group-name", clusterSecurityGroupName)
	}

}


fun AmazonRedshiftFunctions.deleteClusterSnapshot(snapshotIdentifier: String, init: AmazonRedshiftDeleteClusterSnapshotCommand.() -> Unit): com.amazonaws.services.redshift.model.Snapshot {
	return this.block.declare(AmazonRedshiftDeleteClusterSnapshotCommand(snapshotIdentifier).apply(init)) as com.amazonaws.services.redshift.model.Snapshot
}

@Generated
class AmazonRedshiftDeleteClusterSnapshotCommand(val snapshotIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DeleteClusterSnapshotRequest, com.amazonaws.services.redshift.model.Snapshot> {

	var snapshotClusterIdentifier: String? = null

	override fun build(): com.amazonaws.services.redshift.model.DeleteClusterSnapshotRequest {
		val input = com.amazonaws.services.redshift.model.DeleteClusterSnapshotRequest()
		input.setSnapshotIdentifier(this.snapshotIdentifier)
		input.setSnapshotClusterIdentifier(this.snapshotClusterIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.Snapshot {
	  return com.amazonaws.services.redshift.model.Snapshot()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.Snapshot {
		return environment.redshift.deleteClusterSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift delete-cluster-snapshot")
				.argument("snapshot-identifier", snapshotIdentifier)
				.argument("snapshot-cluster-identifier", snapshotClusterIdentifier)
	}

}


fun AmazonRedshiftFunctions.deleteClusterSubnetGroup(clusterSubnetGroupName: String, init: AmazonRedshiftDeleteClusterSubnetGroupCommand.() -> Unit): com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupResult {
	return this.block.declare(AmazonRedshiftDeleteClusterSubnetGroupCommand(clusterSubnetGroupName).apply(init)) as com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupResult
}

@Generated
class AmazonRedshiftDeleteClusterSubnetGroupCommand(val clusterSubnetGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupRequest, com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupResult> {



	override fun build(): com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupRequest {
		val input = com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupRequest()
		input.setClusterSubnetGroupName(this.clusterSubnetGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupResult {
	  return com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupResult {
		return environment.redshift.deleteClusterSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift delete-cluster-subnet-group")
				.argument("cluster-subnet-group-name", clusterSubnetGroupName)
	}

}


fun AmazonRedshiftFunctions.deleteEventSubscription(subscriptionName: String, init: AmazonRedshiftDeleteEventSubscriptionCommand.() -> Unit): com.amazonaws.services.redshift.model.DeleteEventSubscriptionResult {
	return this.block.declare(AmazonRedshiftDeleteEventSubscriptionCommand(subscriptionName).apply(init)) as com.amazonaws.services.redshift.model.DeleteEventSubscriptionResult
}

@Generated
class AmazonRedshiftDeleteEventSubscriptionCommand(val subscriptionName: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DeleteEventSubscriptionRequest, com.amazonaws.services.redshift.model.DeleteEventSubscriptionResult> {



	override fun build(): com.amazonaws.services.redshift.model.DeleteEventSubscriptionRequest {
		val input = com.amazonaws.services.redshift.model.DeleteEventSubscriptionRequest()
		input.setSubscriptionName(this.subscriptionName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DeleteEventSubscriptionResult {
	  return com.amazonaws.services.redshift.model.DeleteEventSubscriptionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DeleteEventSubscriptionResult {
		return environment.redshift.deleteEventSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift delete-event-subscription")
				.argument("subscription-name", subscriptionName)
	}

}


fun AmazonRedshiftFunctions.deleteHsmClientCertificate(hsmClientCertificateIdentifier: String, init: AmazonRedshiftDeleteHsmClientCertificateCommand.() -> Unit): com.amazonaws.services.redshift.model.DeleteHsmClientCertificateResult {
	return this.block.declare(AmazonRedshiftDeleteHsmClientCertificateCommand(hsmClientCertificateIdentifier).apply(init)) as com.amazonaws.services.redshift.model.DeleteHsmClientCertificateResult
}

@Generated
class AmazonRedshiftDeleteHsmClientCertificateCommand(val hsmClientCertificateIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DeleteHsmClientCertificateRequest, com.amazonaws.services.redshift.model.DeleteHsmClientCertificateResult> {



	override fun build(): com.amazonaws.services.redshift.model.DeleteHsmClientCertificateRequest {
		val input = com.amazonaws.services.redshift.model.DeleteHsmClientCertificateRequest()
		input.setHsmClientCertificateIdentifier(this.hsmClientCertificateIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DeleteHsmClientCertificateResult {
	  return com.amazonaws.services.redshift.model.DeleteHsmClientCertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DeleteHsmClientCertificateResult {
		return environment.redshift.deleteHsmClientCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift delete-hsm-client-certificate")
				.argument("hsm-client-certificate-identifier", hsmClientCertificateIdentifier)
	}

}


fun AmazonRedshiftFunctions.deleteHsmConfiguration(hsmConfigurationIdentifier: String, init: AmazonRedshiftDeleteHsmConfigurationCommand.() -> Unit): com.amazonaws.services.redshift.model.DeleteHsmConfigurationResult {
	return this.block.declare(AmazonRedshiftDeleteHsmConfigurationCommand(hsmConfigurationIdentifier).apply(init)) as com.amazonaws.services.redshift.model.DeleteHsmConfigurationResult
}

@Generated
class AmazonRedshiftDeleteHsmConfigurationCommand(val hsmConfigurationIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DeleteHsmConfigurationRequest, com.amazonaws.services.redshift.model.DeleteHsmConfigurationResult> {



	override fun build(): com.amazonaws.services.redshift.model.DeleteHsmConfigurationRequest {
		val input = com.amazonaws.services.redshift.model.DeleteHsmConfigurationRequest()
		input.setHsmConfigurationIdentifier(this.hsmConfigurationIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DeleteHsmConfigurationResult {
	  return com.amazonaws.services.redshift.model.DeleteHsmConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DeleteHsmConfigurationResult {
		return environment.redshift.deleteHsmConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift delete-hsm-configuration")
				.argument("hsm-configuration-identifier", hsmConfigurationIdentifier)
	}

}


fun AmazonRedshiftFunctions.deleteSnapshotCopyGrant(snapshotCopyGrantName: String, init: AmazonRedshiftDeleteSnapshotCopyGrantCommand.() -> Unit): com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantResult {
	return this.block.declare(AmazonRedshiftDeleteSnapshotCopyGrantCommand(snapshotCopyGrantName).apply(init)) as com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantResult
}

@Generated
class AmazonRedshiftDeleteSnapshotCopyGrantCommand(val snapshotCopyGrantName: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantRequest, com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantResult> {



	override fun build(): com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantRequest {
		val input = com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantRequest()
		input.setSnapshotCopyGrantName(this.snapshotCopyGrantName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantResult {
	  return com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantResult {
		return environment.redshift.deleteSnapshotCopyGrant(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift delete-snapshot-copy-grant")
				.argument("snapshot-copy-grant-name", snapshotCopyGrantName)
	}

}


fun AmazonRedshiftFunctions.deleteTags(resourceName: String, tagKeys: List<String>, init: AmazonRedshiftDeleteTagsCommand.() -> Unit): com.amazonaws.services.redshift.model.DeleteTagsResult {
	return this.block.declare(AmazonRedshiftDeleteTagsCommand(resourceName, tagKeys).apply(init)) as com.amazonaws.services.redshift.model.DeleteTagsResult
}

@Generated
class AmazonRedshiftDeleteTagsCommand(val resourceName: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DeleteTagsRequest, com.amazonaws.services.redshift.model.DeleteTagsResult> {



	override fun build(): com.amazonaws.services.redshift.model.DeleteTagsRequest {
		val input = com.amazonaws.services.redshift.model.DeleteTagsRequest()
		input.setResourceName(this.resourceName)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DeleteTagsResult {
	  return com.amazonaws.services.redshift.model.DeleteTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DeleteTagsResult {
		return environment.redshift.deleteTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift delete-tags")
				.argument("resource-name", resourceName)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonRedshiftFunctions.describeClusterParameterGroups(init: AmazonRedshiftDescribeClusterParameterGroupsCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsResult {
	return this.block.declare(AmazonRedshiftDescribeClusterParameterGroupsCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsResult
}

@Generated
class AmazonRedshiftDescribeClusterParameterGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsRequest, com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsResult> {

	var parameterGroupName: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null
	var tagKeys: List<String>? = null
	var tagValues: List<String>? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsRequest {
		val input = com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsRequest()
		input.setParameterGroupName(this.parameterGroupName)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setTagKeys(this.tagKeys)
		input.setTagValues(this.tagValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsResult {
	  return com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsResult {
		return environment.redshift.describeClusterParameterGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-cluster-parameter-groups")
				.argument("parameter-group-name", parameterGroupName)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.argument("tag-keys", tagKeys?.toString())
				.argument("tag-values", tagValues?.toString())
	}

}


fun AmazonRedshiftFunctions.describeClusterParameters(parameterGroupName: String, init: AmazonRedshiftDescribeClusterParametersCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeClusterParametersResult {
	return this.block.declare(AmazonRedshiftDescribeClusterParametersCommand(parameterGroupName).apply(init)) as com.amazonaws.services.redshift.model.DescribeClusterParametersResult
}

@Generated
class AmazonRedshiftDescribeClusterParametersCommand(val parameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeClusterParametersRequest, com.amazonaws.services.redshift.model.DescribeClusterParametersResult> {

	var source: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeClusterParametersRequest {
		val input = com.amazonaws.services.redshift.model.DescribeClusterParametersRequest()
		input.setParameterGroupName(this.parameterGroupName)
		input.setSource(this.source)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeClusterParametersResult {
	  return com.amazonaws.services.redshift.model.DescribeClusterParametersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeClusterParametersResult {
		return environment.redshift.describeClusterParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-cluster-parameters")
				.argument("parameter-group-name", parameterGroupName)
				.argument("source", source)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRedshiftFunctions.describeClusterSecurityGroups(init: AmazonRedshiftDescribeClusterSecurityGroupsCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsResult {
	return this.block.declare(AmazonRedshiftDescribeClusterSecurityGroupsCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsResult
}

@Generated
class AmazonRedshiftDescribeClusterSecurityGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsRequest, com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsResult> {

	var clusterSecurityGroupName: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null
	var tagKeys: List<String>? = null
	var tagValues: List<String>? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsRequest {
		val input = com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsRequest()
		input.setClusterSecurityGroupName(this.clusterSecurityGroupName)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setTagKeys(this.tagKeys)
		input.setTagValues(this.tagValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsResult {
	  return com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsResult {
		return environment.redshift.describeClusterSecurityGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-cluster-security-groups")
				.argument("cluster-security-group-name", clusterSecurityGroupName)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.argument("tag-keys", tagKeys?.toString())
				.argument("tag-values", tagValues?.toString())
	}

}


fun AmazonRedshiftFunctions.describeClusterSnapshots(init: AmazonRedshiftDescribeClusterSnapshotsCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeClusterSnapshotsResult {
	return this.block.declare(AmazonRedshiftDescribeClusterSnapshotsCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeClusterSnapshotsResult
}

@Generated
class AmazonRedshiftDescribeClusterSnapshotsCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeClusterSnapshotsRequest, com.amazonaws.services.redshift.model.DescribeClusterSnapshotsResult> {

	var clusterIdentifier: String? = null
	var snapshotIdentifier: String? = null
	var snapshotType: String? = null
	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null
	var maxRecords: Int? = 0
	var marker: String? = null
	var ownerAccount: String? = null
	var tagKeys: List<String>? = null
	var tagValues: List<String>? = null
	var clusterExists: Boolean? = false

	override fun build(): com.amazonaws.services.redshift.model.DescribeClusterSnapshotsRequest {
		val input = com.amazonaws.services.redshift.model.DescribeClusterSnapshotsRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		input.setSnapshotIdentifier(this.snapshotIdentifier)
		input.setSnapshotType(this.snapshotType)
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setOwnerAccount(this.ownerAccount)
		input.setTagKeys(this.tagKeys)
		input.setTagValues(this.tagValues)
		input.setClusterExists(this.clusterExists)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeClusterSnapshotsResult {
	  return com.amazonaws.services.redshift.model.DescribeClusterSnapshotsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeClusterSnapshotsResult {
		return environment.redshift.describeClusterSnapshots(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-cluster-snapshots")
				.argument("cluster-identifier", clusterIdentifier)
				.argument("snapshot-identifier", snapshotIdentifier)
				.argument("snapshot-type", snapshotType)
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.argument("owner-account", ownerAccount)
				.argument("tag-keys", tagKeys?.toString())
				.argument("tag-values", tagValues?.toString())
				.option("cluster-exists", clusterExists ?: false)
	}

}


fun AmazonRedshiftFunctions.describeClusterSubnetGroups(init: AmazonRedshiftDescribeClusterSubnetGroupsCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsResult {
	return this.block.declare(AmazonRedshiftDescribeClusterSubnetGroupsCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsResult
}

@Generated
class AmazonRedshiftDescribeClusterSubnetGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsRequest, com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsResult> {

	var clusterSubnetGroupName: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null
	var tagKeys: List<String>? = null
	var tagValues: List<String>? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsRequest {
		val input = com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsRequest()
		input.setClusterSubnetGroupName(this.clusterSubnetGroupName)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setTagKeys(this.tagKeys)
		input.setTagValues(this.tagValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsResult {
	  return com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsResult {
		return environment.redshift.describeClusterSubnetGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-cluster-subnet-groups")
				.argument("cluster-subnet-group-name", clusterSubnetGroupName)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.argument("tag-keys", tagKeys?.toString())
				.argument("tag-values", tagValues?.toString())
	}

}


fun AmazonRedshiftFunctions.describeClusterVersions(init: AmazonRedshiftDescribeClusterVersionsCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeClusterVersionsResult {
	return this.block.declare(AmazonRedshiftDescribeClusterVersionsCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeClusterVersionsResult
}

@Generated
class AmazonRedshiftDescribeClusterVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeClusterVersionsRequest, com.amazonaws.services.redshift.model.DescribeClusterVersionsResult> {

	var clusterVersion: String? = null
	var clusterParameterGroupFamily: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeClusterVersionsRequest {
		val input = com.amazonaws.services.redshift.model.DescribeClusterVersionsRequest()
		input.setClusterVersion(this.clusterVersion)
		input.setClusterParameterGroupFamily(this.clusterParameterGroupFamily)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeClusterVersionsResult {
	  return com.amazonaws.services.redshift.model.DescribeClusterVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeClusterVersionsResult {
		return environment.redshift.describeClusterVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-cluster-versions")
				.argument("cluster-version", clusterVersion)
				.argument("cluster-parameter-group-family", clusterParameterGroupFamily)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRedshiftFunctions.describeClusters(init: AmazonRedshiftDescribeClustersCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeClustersResult {
	return this.block.declare(AmazonRedshiftDescribeClustersCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeClustersResult
}

@Generated
class AmazonRedshiftDescribeClustersCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeClustersRequest, com.amazonaws.services.redshift.model.DescribeClustersResult> {

	var clusterIdentifier: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null
	var tagKeys: List<String>? = null
	var tagValues: List<String>? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeClustersRequest {
		val input = com.amazonaws.services.redshift.model.DescribeClustersRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setTagKeys(this.tagKeys)
		input.setTagValues(this.tagValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeClustersResult {
	  return com.amazonaws.services.redshift.model.DescribeClustersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeClustersResult {
		return environment.redshift.describeClusters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-clusters")
				.argument("cluster-identifier", clusterIdentifier)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.argument("tag-keys", tagKeys?.toString())
				.argument("tag-values", tagValues?.toString())
	}

}


fun AmazonRedshiftFunctions.describeDefaultClusterParameters(parameterGroupFamily: String, init: AmazonRedshiftDescribeDefaultClusterParametersCommand.() -> Unit): com.amazonaws.services.redshift.model.DefaultClusterParameters {
	return this.block.declare(AmazonRedshiftDescribeDefaultClusterParametersCommand(parameterGroupFamily).apply(init)) as com.amazonaws.services.redshift.model.DefaultClusterParameters
}

@Generated
class AmazonRedshiftDescribeDefaultClusterParametersCommand(val parameterGroupFamily: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeDefaultClusterParametersRequest, com.amazonaws.services.redshift.model.DefaultClusterParameters> {

	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeDefaultClusterParametersRequest {
		val input = com.amazonaws.services.redshift.model.DescribeDefaultClusterParametersRequest()
		input.setParameterGroupFamily(this.parameterGroupFamily)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DefaultClusterParameters {
	  return com.amazonaws.services.redshift.model.DefaultClusterParameters()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DefaultClusterParameters {
		return environment.redshift.describeDefaultClusterParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-default-cluster-parameters")
				.argument("parameter-group-family", parameterGroupFamily)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRedshiftFunctions.describeEventCategories(init: AmazonRedshiftDescribeEventCategoriesCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeEventCategoriesResult {
	return this.block.declare(AmazonRedshiftDescribeEventCategoriesCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeEventCategoriesResult
}

@Generated
class AmazonRedshiftDescribeEventCategoriesCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeEventCategoriesRequest, com.amazonaws.services.redshift.model.DescribeEventCategoriesResult> {

	var sourceType: String? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeEventCategoriesRequest {
		val input = com.amazonaws.services.redshift.model.DescribeEventCategoriesRequest()
		input.setSourceType(this.sourceType)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeEventCategoriesResult {
	  return com.amazonaws.services.redshift.model.DescribeEventCategoriesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeEventCategoriesResult {
		return environment.redshift.describeEventCategories(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-event-categories")
				.argument("source-type", sourceType)
	}

}


fun AmazonRedshiftFunctions.describeEventSubscriptions(init: AmazonRedshiftDescribeEventSubscriptionsCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeEventSubscriptionsResult {
	return this.block.declare(AmazonRedshiftDescribeEventSubscriptionsCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeEventSubscriptionsResult
}

@Generated
class AmazonRedshiftDescribeEventSubscriptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeEventSubscriptionsRequest, com.amazonaws.services.redshift.model.DescribeEventSubscriptionsResult> {

	var subscriptionName: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null
	var tagKeys: List<String>? = null
	var tagValues: List<String>? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeEventSubscriptionsRequest {
		val input = com.amazonaws.services.redshift.model.DescribeEventSubscriptionsRequest()
		input.setSubscriptionName(this.subscriptionName)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setTagKeys(this.tagKeys)
		input.setTagValues(this.tagValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeEventSubscriptionsResult {
	  return com.amazonaws.services.redshift.model.DescribeEventSubscriptionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeEventSubscriptionsResult {
		return environment.redshift.describeEventSubscriptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-event-subscriptions")
				.argument("subscription-name", subscriptionName)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.argument("tag-keys", tagKeys?.toString())
				.argument("tag-values", tagValues?.toString())
	}

}


fun AmazonRedshiftFunctions.describeEvents(init: AmazonRedshiftDescribeEventsCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeEventsResult {
	return this.block.declare(AmazonRedshiftDescribeEventsCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeEventsResult
}

@Generated
class AmazonRedshiftDescribeEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeEventsRequest, com.amazonaws.services.redshift.model.DescribeEventsResult> {

	var sourceIdentifier: String? = null
	var sourceType: SourceType? = null
	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null
	var duration: Int? = 0
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeEventsRequest {
		val input = com.amazonaws.services.redshift.model.DescribeEventsRequest()
		input.setSourceIdentifier(this.sourceIdentifier)
		input.setSourceType(this.sourceType?.toString())
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setDuration(this.duration)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeEventsResult {
	  return com.amazonaws.services.redshift.model.DescribeEventsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeEventsResult {
		return environment.redshift.describeEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-events")
				.argument("source-identifier", sourceIdentifier)
				.argument("source-type", sourceType?.toString())
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("duration", duration?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRedshiftFunctions.describeHsmClientCertificates(init: AmazonRedshiftDescribeHsmClientCertificatesCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesResult {
	return this.block.declare(AmazonRedshiftDescribeHsmClientCertificatesCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesResult
}

@Generated
class AmazonRedshiftDescribeHsmClientCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesRequest, com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesResult> {

	var hsmClientCertificateIdentifier: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null
	var tagKeys: List<String>? = null
	var tagValues: List<String>? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesRequest {
		val input = com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesRequest()
		input.setHsmClientCertificateIdentifier(this.hsmClientCertificateIdentifier)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setTagKeys(this.tagKeys)
		input.setTagValues(this.tagValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesResult {
	  return com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesResult {
		return environment.redshift.describeHsmClientCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-hsm-client-certificates")
				.argument("hsm-client-certificate-identifier", hsmClientCertificateIdentifier)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.argument("tag-keys", tagKeys?.toString())
				.argument("tag-values", tagValues?.toString())
	}

}


fun AmazonRedshiftFunctions.describeHsmConfigurations(init: AmazonRedshiftDescribeHsmConfigurationsCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeHsmConfigurationsResult {
	return this.block.declare(AmazonRedshiftDescribeHsmConfigurationsCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeHsmConfigurationsResult
}

@Generated
class AmazonRedshiftDescribeHsmConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeHsmConfigurationsRequest, com.amazonaws.services.redshift.model.DescribeHsmConfigurationsResult> {

	var hsmConfigurationIdentifier: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null
	var tagKeys: List<String>? = null
	var tagValues: List<String>? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeHsmConfigurationsRequest {
		val input = com.amazonaws.services.redshift.model.DescribeHsmConfigurationsRequest()
		input.setHsmConfigurationIdentifier(this.hsmConfigurationIdentifier)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setTagKeys(this.tagKeys)
		input.setTagValues(this.tagValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeHsmConfigurationsResult {
	  return com.amazonaws.services.redshift.model.DescribeHsmConfigurationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeHsmConfigurationsResult {
		return environment.redshift.describeHsmConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-hsm-configurations")
				.argument("hsm-configuration-identifier", hsmConfigurationIdentifier)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.argument("tag-keys", tagKeys?.toString())
				.argument("tag-values", tagValues?.toString())
	}

}


fun AmazonRedshiftFunctions.describeLoggingStatus(clusterIdentifier: String, init: AmazonRedshiftDescribeLoggingStatusCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeLoggingStatusResult {
	return this.block.declare(AmazonRedshiftDescribeLoggingStatusCommand(clusterIdentifier).apply(init)) as com.amazonaws.services.redshift.model.DescribeLoggingStatusResult
}

@Generated
class AmazonRedshiftDescribeLoggingStatusCommand(val clusterIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeLoggingStatusRequest, com.amazonaws.services.redshift.model.DescribeLoggingStatusResult> {



	override fun build(): com.amazonaws.services.redshift.model.DescribeLoggingStatusRequest {
		val input = com.amazonaws.services.redshift.model.DescribeLoggingStatusRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeLoggingStatusResult {
	  return com.amazonaws.services.redshift.model.DescribeLoggingStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeLoggingStatusResult {
		return environment.redshift.describeLoggingStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-logging-status")
				.argument("cluster-identifier", clusterIdentifier)
	}

}


fun AmazonRedshiftFunctions.describeOrderableClusterOptions(init: AmazonRedshiftDescribeOrderableClusterOptionsCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsResult {
	return this.block.declare(AmazonRedshiftDescribeOrderableClusterOptionsCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsResult
}

@Generated
class AmazonRedshiftDescribeOrderableClusterOptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsRequest, com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsResult> {

	var clusterVersion: String? = null
	var nodeType: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsRequest {
		val input = com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsRequest()
		input.setClusterVersion(this.clusterVersion)
		input.setNodeType(this.nodeType)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsResult {
	  return com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsResult {
		return environment.redshift.describeOrderableClusterOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-orderable-cluster-options")
				.argument("cluster-version", clusterVersion)
				.argument("node-type", nodeType)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRedshiftFunctions.describeReservedNodeOfferings(init: AmazonRedshiftDescribeReservedNodeOfferingsCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsResult {
	return this.block.declare(AmazonRedshiftDescribeReservedNodeOfferingsCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsResult
}

@Generated
class AmazonRedshiftDescribeReservedNodeOfferingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsRequest, com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsResult> {

	var reservedNodeOfferingId: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsRequest {
		val input = com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsRequest()
		input.setReservedNodeOfferingId(this.reservedNodeOfferingId)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsResult {
	  return com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsResult {
		return environment.redshift.describeReservedNodeOfferings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-reserved-node-offerings")
				.argument("reserved-node-offering-id", reservedNodeOfferingId)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRedshiftFunctions.describeReservedNodes(init: AmazonRedshiftDescribeReservedNodesCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeReservedNodesResult {
	return this.block.declare(AmazonRedshiftDescribeReservedNodesCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeReservedNodesResult
}

@Generated
class AmazonRedshiftDescribeReservedNodesCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeReservedNodesRequest, com.amazonaws.services.redshift.model.DescribeReservedNodesResult> {

	var reservedNodeId: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeReservedNodesRequest {
		val input = com.amazonaws.services.redshift.model.DescribeReservedNodesRequest()
		input.setReservedNodeId(this.reservedNodeId)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeReservedNodesResult {
	  return com.amazonaws.services.redshift.model.DescribeReservedNodesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeReservedNodesResult {
		return environment.redshift.describeReservedNodes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-reserved-nodes")
				.argument("reserved-node-id", reservedNodeId)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRedshiftFunctions.describeResize(clusterIdentifier: String, init: AmazonRedshiftDescribeResizeCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeResizeResult {
	return this.block.declare(AmazonRedshiftDescribeResizeCommand(clusterIdentifier).apply(init)) as com.amazonaws.services.redshift.model.DescribeResizeResult
}

@Generated
class AmazonRedshiftDescribeResizeCommand(val clusterIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeResizeRequest, com.amazonaws.services.redshift.model.DescribeResizeResult> {



	override fun build(): com.amazonaws.services.redshift.model.DescribeResizeRequest {
		val input = com.amazonaws.services.redshift.model.DescribeResizeRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeResizeResult {
	  return com.amazonaws.services.redshift.model.DescribeResizeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeResizeResult {
		return environment.redshift.describeResize(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-resize")
				.argument("cluster-identifier", clusterIdentifier)
	}

}


fun AmazonRedshiftFunctions.describeSnapshotCopyGrants(init: AmazonRedshiftDescribeSnapshotCopyGrantsCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsResult {
	return this.block.declare(AmazonRedshiftDescribeSnapshotCopyGrantsCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsResult
}

@Generated
class AmazonRedshiftDescribeSnapshotCopyGrantsCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsRequest, com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsResult> {

	var snapshotCopyGrantName: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null
	var tagKeys: List<String>? = null
	var tagValues: List<String>? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsRequest {
		val input = com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsRequest()
		input.setSnapshotCopyGrantName(this.snapshotCopyGrantName)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setTagKeys(this.tagKeys)
		input.setTagValues(this.tagValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsResult {
	  return com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsResult {
		return environment.redshift.describeSnapshotCopyGrants(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-snapshot-copy-grants")
				.argument("snapshot-copy-grant-name", snapshotCopyGrantName)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.argument("tag-keys", tagKeys?.toString())
				.argument("tag-values", tagValues?.toString())
	}

}


fun AmazonRedshiftFunctions.describeTableRestoreStatus(init: AmazonRedshiftDescribeTableRestoreStatusCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeTableRestoreStatusResult {
	return this.block.declare(AmazonRedshiftDescribeTableRestoreStatusCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeTableRestoreStatusResult
}

@Generated
class AmazonRedshiftDescribeTableRestoreStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeTableRestoreStatusRequest, com.amazonaws.services.redshift.model.DescribeTableRestoreStatusResult> {

	var clusterIdentifier: String? = null
	var tableRestoreRequestId: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeTableRestoreStatusRequest {
		val input = com.amazonaws.services.redshift.model.DescribeTableRestoreStatusRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		input.setTableRestoreRequestId(this.tableRestoreRequestId)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeTableRestoreStatusResult {
	  return com.amazonaws.services.redshift.model.DescribeTableRestoreStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeTableRestoreStatusResult {
		return environment.redshift.describeTableRestoreStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-table-restore-status")
				.argument("cluster-identifier", clusterIdentifier)
				.argument("table-restore-request-id", tableRestoreRequestId)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AmazonRedshiftFunctions.describeTags(init: AmazonRedshiftDescribeTagsCommand.() -> Unit): com.amazonaws.services.redshift.model.DescribeTagsResult {
	return this.block.declare(AmazonRedshiftDescribeTagsCommand().apply(init)) as com.amazonaws.services.redshift.model.DescribeTagsResult
}

@Generated
class AmazonRedshiftDescribeTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DescribeTagsRequest, com.amazonaws.services.redshift.model.DescribeTagsResult> {

	var resourceName: String? = null
	var resourceType: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null
	var tagKeys: List<String>? = null
	var tagValues: List<String>? = null

	override fun build(): com.amazonaws.services.redshift.model.DescribeTagsRequest {
		val input = com.amazonaws.services.redshift.model.DescribeTagsRequest()
		input.setResourceName(this.resourceName)
		input.setResourceType(this.resourceType)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setTagKeys(this.tagKeys)
		input.setTagValues(this.tagValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DescribeTagsResult {
	  return com.amazonaws.services.redshift.model.DescribeTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DescribeTagsResult {
		return environment.redshift.describeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift describe-tags")
				.argument("resource-name", resourceName)
				.argument("resource-type", resourceType)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.argument("tag-keys", tagKeys?.toString())
				.argument("tag-values", tagValues?.toString())
	}

}


fun AmazonRedshiftFunctions.disableLogging(clusterIdentifier: String, init: AmazonRedshiftDisableLoggingCommand.() -> Unit): com.amazonaws.services.redshift.model.DisableLoggingResult {
	return this.block.declare(AmazonRedshiftDisableLoggingCommand(clusterIdentifier).apply(init)) as com.amazonaws.services.redshift.model.DisableLoggingResult
}

@Generated
class AmazonRedshiftDisableLoggingCommand(val clusterIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DisableLoggingRequest, com.amazonaws.services.redshift.model.DisableLoggingResult> {



	override fun build(): com.amazonaws.services.redshift.model.DisableLoggingRequest {
		val input = com.amazonaws.services.redshift.model.DisableLoggingRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.DisableLoggingResult {
	  return com.amazonaws.services.redshift.model.DisableLoggingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.DisableLoggingResult {
		return environment.redshift.disableLogging(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift disable-logging")
				.argument("cluster-identifier", clusterIdentifier)
	}

}


fun AmazonRedshiftFunctions.disableSnapshotCopy(clusterIdentifier: String, init: AmazonRedshiftDisableSnapshotCopyCommand.() -> Unit): com.amazonaws.services.redshift.model.Cluster {
	return this.block.declare(AmazonRedshiftDisableSnapshotCopyCommand(clusterIdentifier).apply(init)) as com.amazonaws.services.redshift.model.Cluster
}

@Generated
class AmazonRedshiftDisableSnapshotCopyCommand(val clusterIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.DisableSnapshotCopyRequest, com.amazonaws.services.redshift.model.Cluster> {



	override fun build(): com.amazonaws.services.redshift.model.DisableSnapshotCopyRequest {
		val input = com.amazonaws.services.redshift.model.DisableSnapshotCopyRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.Cluster {
	  return com.amazonaws.services.redshift.model.Cluster()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.Cluster {
		return environment.redshift.disableSnapshotCopy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift disable-snapshot-copy")
				.argument("cluster-identifier", clusterIdentifier)
	}

}


fun AmazonRedshiftFunctions.enableLogging(clusterIdentifier: String, bucketName: String, init: AmazonRedshiftEnableLoggingCommand.() -> Unit): com.amazonaws.services.redshift.model.EnableLoggingResult {
	return this.block.declare(AmazonRedshiftEnableLoggingCommand(clusterIdentifier, bucketName).apply(init)) as com.amazonaws.services.redshift.model.EnableLoggingResult
}

@Generated
class AmazonRedshiftEnableLoggingCommand(val clusterIdentifier: String, val bucketName: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.EnableLoggingRequest, com.amazonaws.services.redshift.model.EnableLoggingResult> {

	var s3KeyPrefix: String? = null

	override fun build(): com.amazonaws.services.redshift.model.EnableLoggingRequest {
		val input = com.amazonaws.services.redshift.model.EnableLoggingRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		input.setBucketName(this.bucketName)
		input.setS3KeyPrefix(this.s3KeyPrefix)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.EnableLoggingResult {
	  return com.amazonaws.services.redshift.model.EnableLoggingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.EnableLoggingResult {
		return environment.redshift.enableLogging(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift enable-logging")
				.argument("cluster-identifier", clusterIdentifier)
				.argument("bucket-name", bucketName)
				.argument("s3-key-prefix", s3KeyPrefix)
	}

}


fun AmazonRedshiftFunctions.enableSnapshotCopy(clusterIdentifier: String, destinationRegion: String, init: AmazonRedshiftEnableSnapshotCopyCommand.() -> Unit): com.amazonaws.services.redshift.model.Cluster {
	return this.block.declare(AmazonRedshiftEnableSnapshotCopyCommand(clusterIdentifier, destinationRegion).apply(init)) as com.amazonaws.services.redshift.model.Cluster
}

@Generated
class AmazonRedshiftEnableSnapshotCopyCommand(val clusterIdentifier: String, val destinationRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.EnableSnapshotCopyRequest, com.amazonaws.services.redshift.model.Cluster> {

	var retentionPeriod: Int? = 0
	var snapshotCopyGrantName: String? = null

	override fun build(): com.amazonaws.services.redshift.model.EnableSnapshotCopyRequest {
		val input = com.amazonaws.services.redshift.model.EnableSnapshotCopyRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		input.setDestinationRegion(this.destinationRegion)
		input.setRetentionPeriod(this.retentionPeriod)
		input.setSnapshotCopyGrantName(this.snapshotCopyGrantName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.Cluster {
	  return com.amazonaws.services.redshift.model.Cluster()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.Cluster {
		return environment.redshift.enableSnapshotCopy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift enable-snapshot-copy")
				.argument("cluster-identifier", clusterIdentifier)
				.argument("destination-region", destinationRegion)
				.argument("retention-period", retentionPeriod?.toString())
				.argument("snapshot-copy-grant-name", snapshotCopyGrantName)
	}

}


fun AmazonRedshiftFunctions.getClusterCredentials(dbUser: String, clusterIdentifier: String, init: AmazonRedshiftGetClusterCredentialsCommand.() -> Unit): com.amazonaws.services.redshift.model.GetClusterCredentialsResult {
	return this.block.declare(AmazonRedshiftGetClusterCredentialsCommand(dbUser, clusterIdentifier).apply(init)) as com.amazonaws.services.redshift.model.GetClusterCredentialsResult
}

@Generated
class AmazonRedshiftGetClusterCredentialsCommand(val dbUser: String, val clusterIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.GetClusterCredentialsRequest, com.amazonaws.services.redshift.model.GetClusterCredentialsResult> {

	var dbName: String? = null
	var durationSeconds: Int? = 0
	var autoCreate: Boolean? = false
	var dbGroups: List<String>? = null

	override fun build(): com.amazonaws.services.redshift.model.GetClusterCredentialsRequest {
		val input = com.amazonaws.services.redshift.model.GetClusterCredentialsRequest()
		input.setDbUser(this.dbUser)
		input.setDbName(this.dbName)
		input.setClusterIdentifier(this.clusterIdentifier)
		input.setDurationSeconds(this.durationSeconds)
		input.setAutoCreate(this.autoCreate)
		input.setDbGroups(this.dbGroups)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.GetClusterCredentialsResult {
	  return com.amazonaws.services.redshift.model.GetClusterCredentialsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.GetClusterCredentialsResult {
		return environment.redshift.getClusterCredentials(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift get-cluster-credentials")
				.argument("db-user", dbUser)
				.argument("db-name", dbName)
				.argument("cluster-identifier", clusterIdentifier)
				.argument("duration-seconds", durationSeconds?.toString())
				.option("auto-create", autoCreate ?: false)
				.argument("db-groups", dbGroups?.toString())
	}

}


fun AmazonRedshiftFunctions.modifyCluster(clusterIdentifier: String, init: AmazonRedshiftModifyClusterCommand.() -> Unit): com.amazonaws.services.redshift.model.Cluster {
	return this.block.declare(AmazonRedshiftModifyClusterCommand(clusterIdentifier).apply(init)) as com.amazonaws.services.redshift.model.Cluster
}

@Generated
class AmazonRedshiftModifyClusterCommand(val clusterIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.ModifyClusterRequest, com.amazonaws.services.redshift.model.Cluster> {

	var clusterType: String? = null
	var nodeType: String? = null
	var numberOfNodes: Int? = 0
	var clusterSecurityGroups: List<String>? = null
	var vpcSecurityGroupIds: List<String>? = null
	var masterUserPassword: String? = null
	var clusterParameterGroupName: String? = null
	var automatedSnapshotRetentionPeriod: Int? = 0
	var preferredMaintenanceWindow: String? = null
	var clusterVersion: String? = null
	var allowVersionUpgrade: Boolean? = false
	var hsmClientCertificateIdentifier: String? = null
	var hsmConfigurationIdentifier: String? = null
	var newClusterIdentifier: String? = null
	var publiclyAccessible: Boolean? = false
	var elasticIp: String? = null
	var enhancedVpcRouting: Boolean? = false

	override fun build(): com.amazonaws.services.redshift.model.ModifyClusterRequest {
		val input = com.amazonaws.services.redshift.model.ModifyClusterRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		input.setClusterType(this.clusterType)
		input.setNodeType(this.nodeType)
		input.setNumberOfNodes(this.numberOfNodes)
		input.setClusterSecurityGroups(this.clusterSecurityGroups)
		input.setVpcSecurityGroupIds(this.vpcSecurityGroupIds)
		input.setMasterUserPassword(this.masterUserPassword)
		input.setClusterParameterGroupName(this.clusterParameterGroupName)
		input.setAutomatedSnapshotRetentionPeriod(this.automatedSnapshotRetentionPeriod)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setClusterVersion(this.clusterVersion)
		input.setAllowVersionUpgrade(this.allowVersionUpgrade)
		input.setHsmClientCertificateIdentifier(this.hsmClientCertificateIdentifier)
		input.setHsmConfigurationIdentifier(this.hsmConfigurationIdentifier)
		input.setNewClusterIdentifier(this.newClusterIdentifier)
		input.setPubliclyAccessible(this.publiclyAccessible)
		input.setElasticIp(this.elasticIp)
		input.setEnhancedVpcRouting(this.enhancedVpcRouting)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.Cluster {
	  return com.amazonaws.services.redshift.model.Cluster()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.Cluster {
		return environment.redshift.modifyCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift modify-cluster")
				.argument("cluster-identifier", clusterIdentifier)
				.argument("cluster-type", clusterType)
				.argument("node-type", nodeType)
				.argument("number-of-nodes", numberOfNodes?.toString())
				.argument("cluster-security-groups", clusterSecurityGroups?.toString())
				.argument("vpc-security-group-ids", vpcSecurityGroupIds?.toString())
				.argument("master-user-password", masterUserPassword)
				.argument("cluster-parameter-group-name", clusterParameterGroupName)
				.argument("automated-snapshot-retention-period", automatedSnapshotRetentionPeriod?.toString())
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.argument("cluster-version", clusterVersion)
				.option("allow-version-upgrade", allowVersionUpgrade ?: false)
				.argument("hsm-client-certificate-identifier", hsmClientCertificateIdentifier)
				.argument("hsm-configuration-identifier", hsmConfigurationIdentifier)
				.argument("new-cluster-identifier", newClusterIdentifier)
				.option("publicly-accessible", publiclyAccessible ?: false)
				.argument("elastic-ip", elasticIp)
				.option("enhanced-vpc-routing", enhancedVpcRouting ?: false)
	}

}


fun AmazonRedshiftFunctions.modifyClusterIamRoles(clusterIdentifier: String, init: AmazonRedshiftModifyClusterIamRolesCommand.() -> Unit): com.amazonaws.services.redshift.model.Cluster {
	return this.block.declare(AmazonRedshiftModifyClusterIamRolesCommand(clusterIdentifier).apply(init)) as com.amazonaws.services.redshift.model.Cluster
}

@Generated
class AmazonRedshiftModifyClusterIamRolesCommand(val clusterIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.ModifyClusterIamRolesRequest, com.amazonaws.services.redshift.model.Cluster> {

	var addIamRoles: List<String>? = null
	var removeIamRoles: List<String>? = null

	override fun build(): com.amazonaws.services.redshift.model.ModifyClusterIamRolesRequest {
		val input = com.amazonaws.services.redshift.model.ModifyClusterIamRolesRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		input.setAddIamRoles(this.addIamRoles)
		input.setRemoveIamRoles(this.removeIamRoles)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.Cluster {
	  return com.amazonaws.services.redshift.model.Cluster()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.Cluster {
		return environment.redshift.modifyClusterIamRoles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift modify-cluster-iam-roles")
				.argument("cluster-identifier", clusterIdentifier)
				.argument("add-iam-roles", addIamRoles?.toString())
				.argument("remove-iam-roles", removeIamRoles?.toString())
	}

}


fun AmazonRedshiftFunctions.modifyClusterParameterGroup(parameterGroupName: String, parameters: List<com.amazonaws.services.redshift.model.Parameter>, init: AmazonRedshiftModifyClusterParameterGroupCommand.() -> Unit): com.amazonaws.services.redshift.model.ModifyClusterParameterGroupResult {
	return this.block.declare(AmazonRedshiftModifyClusterParameterGroupCommand(parameterGroupName, parameters).apply(init)) as com.amazonaws.services.redshift.model.ModifyClusterParameterGroupResult
}

@Generated
class AmazonRedshiftModifyClusterParameterGroupCommand(val parameterGroupName: String, val parameters: List<com.amazonaws.services.redshift.model.Parameter>) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.ModifyClusterParameterGroupRequest, com.amazonaws.services.redshift.model.ModifyClusterParameterGroupResult> {



	override fun build(): com.amazonaws.services.redshift.model.ModifyClusterParameterGroupRequest {
		val input = com.amazonaws.services.redshift.model.ModifyClusterParameterGroupRequest()
		input.setParameterGroupName(this.parameterGroupName)
		input.setParameters(this.parameters)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.ModifyClusterParameterGroupResult {
	  return com.amazonaws.services.redshift.model.ModifyClusterParameterGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.ModifyClusterParameterGroupResult {
		return environment.redshift.modifyClusterParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift modify-cluster-parameter-group")
				.argument("parameter-group-name", parameterGroupName)
				.argument("parameters", parameters.toString())
	}

}


fun AmazonRedshiftFunctions.modifyClusterSubnetGroup(clusterSubnetGroupName: String, subnetIds: List<String>, init: AmazonRedshiftModifyClusterSubnetGroupCommand.() -> Unit): com.amazonaws.services.redshift.model.ClusterSubnetGroup {
	return this.block.declare(AmazonRedshiftModifyClusterSubnetGroupCommand(clusterSubnetGroupName, subnetIds).apply(init)) as com.amazonaws.services.redshift.model.ClusterSubnetGroup
}

@Generated
class AmazonRedshiftModifyClusterSubnetGroupCommand(val clusterSubnetGroupName: String, val subnetIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.ModifyClusterSubnetGroupRequest, com.amazonaws.services.redshift.model.ClusterSubnetGroup> {

	var description: String? = null

	override fun build(): com.amazonaws.services.redshift.model.ModifyClusterSubnetGroupRequest {
		val input = com.amazonaws.services.redshift.model.ModifyClusterSubnetGroupRequest()
		input.setClusterSubnetGroupName(this.clusterSubnetGroupName)
		input.setDescription(this.description)
		input.setSubnetIds(this.subnetIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.ClusterSubnetGroup {
	  return com.amazonaws.services.redshift.model.ClusterSubnetGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.ClusterSubnetGroup {
		return environment.redshift.modifyClusterSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift modify-cluster-subnet-group")
				.argument("cluster-subnet-group-name", clusterSubnetGroupName)
				.argument("description", description)
				.argument("subnet-ids", subnetIds.toString())
	}

}


fun AmazonRedshiftFunctions.modifyEventSubscription(subscriptionName: String, init: AmazonRedshiftModifyEventSubscriptionCommand.() -> Unit): com.amazonaws.services.redshift.model.EventSubscription {
	return this.block.declare(AmazonRedshiftModifyEventSubscriptionCommand(subscriptionName).apply(init)) as com.amazonaws.services.redshift.model.EventSubscription
}

@Generated
class AmazonRedshiftModifyEventSubscriptionCommand(val subscriptionName: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.ModifyEventSubscriptionRequest, com.amazonaws.services.redshift.model.EventSubscription> {

	var snsTopicArn: String? = null
	var sourceType: String? = null
	var sourceIds: List<String>? = null
	var eventCategories: List<String>? = null
	var severity: String? = null
	var enabled: Boolean? = false

	override fun build(): com.amazonaws.services.redshift.model.ModifyEventSubscriptionRequest {
		val input = com.amazonaws.services.redshift.model.ModifyEventSubscriptionRequest()
		input.setSubscriptionName(this.subscriptionName)
		input.setSnsTopicArn(this.snsTopicArn)
		input.setSourceType(this.sourceType)
		input.setSourceIds(this.sourceIds)
		input.setEventCategories(this.eventCategories)
		input.setSeverity(this.severity)
		input.setEnabled(this.enabled)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.EventSubscription {
	  return com.amazonaws.services.redshift.model.EventSubscription()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.EventSubscription {
		return environment.redshift.modifyEventSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift modify-event-subscription")
				.argument("subscription-name", subscriptionName)
				.argument("sns-topic-arn", snsTopicArn)
				.argument("source-type", sourceType)
				.argument("source-ids", sourceIds?.toString())
				.argument("event-categories", eventCategories?.toString())
				.argument("severity", severity)
				.option("enabled", enabled ?: false)
	}

}


fun AmazonRedshiftFunctions.modifySnapshotCopyRetentionPeriod(clusterIdentifier: String, retentionPeriod: Int, init: AmazonRedshiftModifySnapshotCopyRetentionPeriodCommand.() -> Unit): com.amazonaws.services.redshift.model.Cluster {
	return this.block.declare(AmazonRedshiftModifySnapshotCopyRetentionPeriodCommand(clusterIdentifier, retentionPeriod).apply(init)) as com.amazonaws.services.redshift.model.Cluster
}

@Generated
class AmazonRedshiftModifySnapshotCopyRetentionPeriodCommand(val clusterIdentifier: String, val retentionPeriod: Int) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.ModifySnapshotCopyRetentionPeriodRequest, com.amazonaws.services.redshift.model.Cluster> {



	override fun build(): com.amazonaws.services.redshift.model.ModifySnapshotCopyRetentionPeriodRequest {
		val input = com.amazonaws.services.redshift.model.ModifySnapshotCopyRetentionPeriodRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		input.setRetentionPeriod(this.retentionPeriod)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.Cluster {
	  return com.amazonaws.services.redshift.model.Cluster()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.Cluster {
		return environment.redshift.modifySnapshotCopyRetentionPeriod(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift modify-snapshot-copy-retention-period")
				.argument("cluster-identifier", clusterIdentifier)
				.argument("retention-period", retentionPeriod.toString())
	}

}


fun AmazonRedshiftFunctions.purchaseReservedNodeOffering(reservedNodeOfferingId: String, init: AmazonRedshiftPurchaseReservedNodeOfferingCommand.() -> Unit): com.amazonaws.services.redshift.model.ReservedNode {
	return this.block.declare(AmazonRedshiftPurchaseReservedNodeOfferingCommand(reservedNodeOfferingId).apply(init)) as com.amazonaws.services.redshift.model.ReservedNode
}

@Generated
class AmazonRedshiftPurchaseReservedNodeOfferingCommand(val reservedNodeOfferingId: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.PurchaseReservedNodeOfferingRequest, com.amazonaws.services.redshift.model.ReservedNode> {

	var nodeCount: Int? = 0

	override fun build(): com.amazonaws.services.redshift.model.PurchaseReservedNodeOfferingRequest {
		val input = com.amazonaws.services.redshift.model.PurchaseReservedNodeOfferingRequest()
		input.setReservedNodeOfferingId(this.reservedNodeOfferingId)
		input.setNodeCount(this.nodeCount)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.ReservedNode {
	  return com.amazonaws.services.redshift.model.ReservedNode()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.ReservedNode {
		return environment.redshift.purchaseReservedNodeOffering(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift purchase-reserved-node-offering")
				.argument("reserved-node-offering-id", reservedNodeOfferingId)
				.argument("node-count", nodeCount?.toString())
	}

}


fun AmazonRedshiftFunctions.rebootCluster(clusterIdentifier: String, init: AmazonRedshiftRebootClusterCommand.() -> Unit): com.amazonaws.services.redshift.model.Cluster {
	return this.block.declare(AmazonRedshiftRebootClusterCommand(clusterIdentifier).apply(init)) as com.amazonaws.services.redshift.model.Cluster
}

@Generated
class AmazonRedshiftRebootClusterCommand(val clusterIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.RebootClusterRequest, com.amazonaws.services.redshift.model.Cluster> {



	override fun build(): com.amazonaws.services.redshift.model.RebootClusterRequest {
		val input = com.amazonaws.services.redshift.model.RebootClusterRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.Cluster {
	  return com.amazonaws.services.redshift.model.Cluster()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.Cluster {
		return environment.redshift.rebootCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift reboot-cluster")
				.argument("cluster-identifier", clusterIdentifier)
	}

}


fun AmazonRedshiftFunctions.resetClusterParameterGroup(parameterGroupName: String, init: AmazonRedshiftResetClusterParameterGroupCommand.() -> Unit): com.amazonaws.services.redshift.model.ResetClusterParameterGroupResult {
	return this.block.declare(AmazonRedshiftResetClusterParameterGroupCommand(parameterGroupName).apply(init)) as com.amazonaws.services.redshift.model.ResetClusterParameterGroupResult
}

@Generated
class AmazonRedshiftResetClusterParameterGroupCommand(val parameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.ResetClusterParameterGroupRequest, com.amazonaws.services.redshift.model.ResetClusterParameterGroupResult> {

	var resetAllParameters: Boolean? = false
	var parameters: List<com.amazonaws.services.redshift.model.Parameter>? = null

	override fun build(): com.amazonaws.services.redshift.model.ResetClusterParameterGroupRequest {
		val input = com.amazonaws.services.redshift.model.ResetClusterParameterGroupRequest()
		input.setParameterGroupName(this.parameterGroupName)
		input.setResetAllParameters(this.resetAllParameters)
		input.setParameters(this.parameters)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.ResetClusterParameterGroupResult {
	  return com.amazonaws.services.redshift.model.ResetClusterParameterGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.ResetClusterParameterGroupResult {
		return environment.redshift.resetClusterParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift reset-cluster-parameter-group")
				.argument("parameter-group-name", parameterGroupName)
				.option("reset-all-parameters", resetAllParameters ?: false)
				.argument("parameters", parameters?.toString())
	}

}


fun AmazonRedshiftFunctions.restoreFromClusterSnapshot(clusterIdentifier: String, snapshotIdentifier: String, init: AmazonRedshiftRestoreFromClusterSnapshotCommand.() -> Unit): com.amazonaws.services.redshift.model.Cluster {
	return this.block.declare(AmazonRedshiftRestoreFromClusterSnapshotCommand(clusterIdentifier, snapshotIdentifier).apply(init)) as com.amazonaws.services.redshift.model.Cluster
}

@Generated
class AmazonRedshiftRestoreFromClusterSnapshotCommand(val clusterIdentifier: String, val snapshotIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.RestoreFromClusterSnapshotRequest, com.amazonaws.services.redshift.model.Cluster> {

	var snapshotClusterIdentifier: String? = null
	var port: Int? = 0
	var availabilityZone: String? = null
	var allowVersionUpgrade: Boolean? = false
	var clusterSubnetGroupName: String? = null
	var publiclyAccessible: Boolean? = false
	var ownerAccount: String? = null
	var hsmClientCertificateIdentifier: String? = null
	var hsmConfigurationIdentifier: String? = null
	var elasticIp: String? = null
	var clusterParameterGroupName: String? = null
	var clusterSecurityGroups: List<String>? = null
	var vpcSecurityGroupIds: List<String>? = null
	var preferredMaintenanceWindow: String? = null
	var automatedSnapshotRetentionPeriod: Int? = 0
	var kmsKeyId: String? = null
	var nodeType: String? = null
	var enhancedVpcRouting: Boolean? = false
	var additionalInfo: String? = null
	var iamRoles: List<String>? = null

	override fun build(): com.amazonaws.services.redshift.model.RestoreFromClusterSnapshotRequest {
		val input = com.amazonaws.services.redshift.model.RestoreFromClusterSnapshotRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		input.setSnapshotIdentifier(this.snapshotIdentifier)
		input.setSnapshotClusterIdentifier(this.snapshotClusterIdentifier)
		input.setPort(this.port)
		input.setAvailabilityZone(this.availabilityZone)
		input.setAllowVersionUpgrade(this.allowVersionUpgrade)
		input.setClusterSubnetGroupName(this.clusterSubnetGroupName)
		input.setPubliclyAccessible(this.publiclyAccessible)
		input.setOwnerAccount(this.ownerAccount)
		input.setHsmClientCertificateIdentifier(this.hsmClientCertificateIdentifier)
		input.setHsmConfigurationIdentifier(this.hsmConfigurationIdentifier)
		input.setElasticIp(this.elasticIp)
		input.setClusterParameterGroupName(this.clusterParameterGroupName)
		input.setClusterSecurityGroups(this.clusterSecurityGroups)
		input.setVpcSecurityGroupIds(this.vpcSecurityGroupIds)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setAutomatedSnapshotRetentionPeriod(this.automatedSnapshotRetentionPeriod)
		input.setKmsKeyId(this.kmsKeyId)
		input.setNodeType(this.nodeType)
		input.setEnhancedVpcRouting(this.enhancedVpcRouting)
		input.setAdditionalInfo(this.additionalInfo)
		input.setIamRoles(this.iamRoles)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.Cluster {
	  return com.amazonaws.services.redshift.model.Cluster()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.Cluster {
		return environment.redshift.restoreFromClusterSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift restore-from-cluster-snapshot")
				.argument("cluster-identifier", clusterIdentifier)
				.argument("snapshot-identifier", snapshotIdentifier)
				.argument("snapshot-cluster-identifier", snapshotClusterIdentifier)
				.argument("port", port?.toString())
				.argument("availability-zone", availabilityZone)
				.option("allow-version-upgrade", allowVersionUpgrade ?: false)
				.argument("cluster-subnet-group-name", clusterSubnetGroupName)
				.option("publicly-accessible", publiclyAccessible ?: false)
				.argument("owner-account", ownerAccount)
				.argument("hsm-client-certificate-identifier", hsmClientCertificateIdentifier)
				.argument("hsm-configuration-identifier", hsmConfigurationIdentifier)
				.argument("elastic-ip", elasticIp)
				.argument("cluster-parameter-group-name", clusterParameterGroupName)
				.argument("cluster-security-groups", clusterSecurityGroups?.toString())
				.argument("vpc-security-group-ids", vpcSecurityGroupIds?.toString())
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.argument("automated-snapshot-retention-period", automatedSnapshotRetentionPeriod?.toString())
				.argument("kms-key-id", kmsKeyId)
				.argument("node-type", nodeType)
				.option("enhanced-vpc-routing", enhancedVpcRouting ?: false)
				.argument("additional-info", additionalInfo)
				.argument("iam-roles", iamRoles?.toString())
	}

}


fun AmazonRedshiftFunctions.restoreTableFromClusterSnapshot(clusterIdentifier: String, snapshotIdentifier: String, sourceDatabaseName: String, sourceTableName: String, newTableName: String, init: AmazonRedshiftRestoreTableFromClusterSnapshotCommand.() -> Unit): com.amazonaws.services.redshift.model.TableRestoreStatus {
	return this.block.declare(AmazonRedshiftRestoreTableFromClusterSnapshotCommand(clusterIdentifier, snapshotIdentifier, sourceDatabaseName, sourceTableName, newTableName).apply(init)) as com.amazonaws.services.redshift.model.TableRestoreStatus
}

@Generated
class AmazonRedshiftRestoreTableFromClusterSnapshotCommand(val clusterIdentifier: String, val snapshotIdentifier: String, val sourceDatabaseName: String, val sourceTableName: String, val newTableName: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.RestoreTableFromClusterSnapshotRequest, com.amazonaws.services.redshift.model.TableRestoreStatus> {

	var sourceSchemaName: String? = null
	var targetDatabaseName: String? = null
	var targetSchemaName: String? = null

	override fun build(): com.amazonaws.services.redshift.model.RestoreTableFromClusterSnapshotRequest {
		val input = com.amazonaws.services.redshift.model.RestoreTableFromClusterSnapshotRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		input.setSnapshotIdentifier(this.snapshotIdentifier)
		input.setSourceDatabaseName(this.sourceDatabaseName)
		input.setSourceSchemaName(this.sourceSchemaName)
		input.setSourceTableName(this.sourceTableName)
		input.setTargetDatabaseName(this.targetDatabaseName)
		input.setTargetSchemaName(this.targetSchemaName)
		input.setNewTableName(this.newTableName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.TableRestoreStatus {
	  return com.amazonaws.services.redshift.model.TableRestoreStatus()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.TableRestoreStatus {
		return environment.redshift.restoreTableFromClusterSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift restore-table-from-cluster-snapshot")
				.argument("cluster-identifier", clusterIdentifier)
				.argument("snapshot-identifier", snapshotIdentifier)
				.argument("source-database-name", sourceDatabaseName)
				.argument("source-schema-name", sourceSchemaName)
				.argument("source-table-name", sourceTableName)
				.argument("target-database-name", targetDatabaseName)
				.argument("target-schema-name", targetSchemaName)
				.argument("new-table-name", newTableName)
	}

}


fun AmazonRedshiftFunctions.revokeClusterSecurityGroupIngress(clusterSecurityGroupName: String, init: AmazonRedshiftRevokeClusterSecurityGroupIngressCommand.() -> Unit): com.amazonaws.services.redshift.model.ClusterSecurityGroup {
	return this.block.declare(AmazonRedshiftRevokeClusterSecurityGroupIngressCommand(clusterSecurityGroupName).apply(init)) as com.amazonaws.services.redshift.model.ClusterSecurityGroup
}

@Generated
class AmazonRedshiftRevokeClusterSecurityGroupIngressCommand(val clusterSecurityGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.RevokeClusterSecurityGroupIngressRequest, com.amazonaws.services.redshift.model.ClusterSecurityGroup> {

	var cIDRIP: String? = null
	var eC2SecurityGroupName: String? = null
	var eC2SecurityGroupOwnerId: String? = null

	override fun build(): com.amazonaws.services.redshift.model.RevokeClusterSecurityGroupIngressRequest {
		val input = com.amazonaws.services.redshift.model.RevokeClusterSecurityGroupIngressRequest()
		input.setClusterSecurityGroupName(this.clusterSecurityGroupName)
		input.setCIDRIP(this.cIDRIP)
		input.setEC2SecurityGroupName(this.eC2SecurityGroupName)
		input.setEC2SecurityGroupOwnerId(this.eC2SecurityGroupOwnerId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.ClusterSecurityGroup {
	  return com.amazonaws.services.redshift.model.ClusterSecurityGroup()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.ClusterSecurityGroup {
		return environment.redshift.revokeClusterSecurityGroupIngress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift revoke-cluster-security-group-ingress")
				.argument("cluster-security-group-name", clusterSecurityGroupName)
				.argument("cidrip", cIDRIP)
				.argument("ec2-security-group-name", eC2SecurityGroupName)
				.argument("ec2-security-group-owner-id", eC2SecurityGroupOwnerId)
	}

}


fun AmazonRedshiftFunctions.revokeSnapshotAccess(snapshotIdentifier: String, accountWithRestoreAccess: String, init: AmazonRedshiftRevokeSnapshotAccessCommand.() -> Unit): com.amazonaws.services.redshift.model.Snapshot {
	return this.block.declare(AmazonRedshiftRevokeSnapshotAccessCommand(snapshotIdentifier, accountWithRestoreAccess).apply(init)) as com.amazonaws.services.redshift.model.Snapshot
}

@Generated
class AmazonRedshiftRevokeSnapshotAccessCommand(val snapshotIdentifier: String, val accountWithRestoreAccess: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.RevokeSnapshotAccessRequest, com.amazonaws.services.redshift.model.Snapshot> {

	var snapshotClusterIdentifier: String? = null

	override fun build(): com.amazonaws.services.redshift.model.RevokeSnapshotAccessRequest {
		val input = com.amazonaws.services.redshift.model.RevokeSnapshotAccessRequest()
		input.setSnapshotIdentifier(this.snapshotIdentifier)
		input.setSnapshotClusterIdentifier(this.snapshotClusterIdentifier)
		input.setAccountWithRestoreAccess(this.accountWithRestoreAccess)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.Snapshot {
	  return com.amazonaws.services.redshift.model.Snapshot()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.Snapshot {
		return environment.redshift.revokeSnapshotAccess(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift revoke-snapshot-access")
				.argument("snapshot-identifier", snapshotIdentifier)
				.argument("snapshot-cluster-identifier", snapshotClusterIdentifier)
				.argument("account-with-restore-access", accountWithRestoreAccess)
	}

}


fun AmazonRedshiftFunctions.rotateEncryptionKey(clusterIdentifier: String, init: AmazonRedshiftRotateEncryptionKeyCommand.() -> Unit): com.amazonaws.services.redshift.model.Cluster {
	return this.block.declare(AmazonRedshiftRotateEncryptionKeyCommand(clusterIdentifier).apply(init)) as com.amazonaws.services.redshift.model.Cluster
}

@Generated
class AmazonRedshiftRotateEncryptionKeyCommand(val clusterIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.redshift.model.RotateEncryptionKeyRequest, com.amazonaws.services.redshift.model.Cluster> {



	override fun build(): com.amazonaws.services.redshift.model.RotateEncryptionKeyRequest {
		val input = com.amazonaws.services.redshift.model.RotateEncryptionKeyRequest()
		input.setClusterIdentifier(this.clusterIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.redshift.model.Cluster {
	  return com.amazonaws.services.redshift.model.Cluster()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.redshift.model.Cluster {
		return environment.redshift.rotateEncryptionKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws redshift rotate-encryption-key")
				.argument("cluster-identifier", clusterIdentifier)
	}

}
