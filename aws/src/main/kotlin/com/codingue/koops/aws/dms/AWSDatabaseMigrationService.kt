
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.dms

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.databasemigrationservice.*
import com.amazonaws.services.databasemigrationservice.model.*

var com.codingue.koops.core.Environment.dms: AWSDatabaseMigrationService
	get() {
		var service = this.capabilities["aws-dms"]
		if (service == null) {
			service = AWSDatabaseMigrationServiceClientBuilder.standard().build()
			this.capabilities["aws-dms"] = service
		}
		return service as AWSDatabaseMigrationService
	}
	set(dms) {
		this.capabilities["aws-dms"] = dms
	}

@Generated
class AWSDatabaseMigrationServiceFunctions(val block: Block)

infix fun <T> AwsContinuation.dms(init: AWSDatabaseMigrationServiceFunctions.() -> T): T {
	return AWSDatabaseMigrationServiceFunctions(shell).run(init)
}

			

fun AWSDatabaseMigrationServiceFunctions.addTagsToResource(resourceArn: String, tags: List<com.amazonaws.services.databasemigrationservice.model.Tag>, init: (AWSDatabaseMigrationServiceAddTagsToResourceCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceResult {
	return this.block.declare(AWSDatabaseMigrationServiceAddTagsToResourceCommand(resourceArn, tags).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceResult
}

@Generated
class AWSDatabaseMigrationServiceAddTagsToResourceCommand(val resourceArn: String, val tags: List<com.amazonaws.services.databasemigrationservice.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest, com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceResult> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceResult {
	  return com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceResult {
		return environment.dms.addTagsToResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms add-tags-to-resource")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.createEndpoint(endpointIdentifier: String, endpointType: ReplicationEndpointTypeValue, engineName: String, init: (AWSDatabaseMigrationServiceCreateEndpointCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.CreateEndpointResult {
	return this.block.declare(AWSDatabaseMigrationServiceCreateEndpointCommand(endpointIdentifier, endpointType, engineName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.CreateEndpointResult
}

@Generated
class AWSDatabaseMigrationServiceCreateEndpointCommand(val endpointIdentifier: String, val endpointType: ReplicationEndpointTypeValue, val engineName: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.CreateEndpointRequest, com.amazonaws.services.databasemigrationservice.model.CreateEndpointResult> {

	var username: String? = null
	var password: String? = null
	var serverName: String? = null
	var port: Int? = 0
	var databaseName: String? = null
	var extraConnectionAttributes: String? = null
	var kmsKeyId: String? = null
	var tags: List<com.amazonaws.services.databasemigrationservice.model.Tag>? = null
	var certificateArn: String? = null
	var sslMode: DmsSslModeValue? = null
	var dynamoDbSettings: com.amazonaws.services.databasemigrationservice.model.DynamoDbSettings? = null
	var s3Settings: com.amazonaws.services.databasemigrationservice.model.S3Settings? = null
	var mongoDbSettings: com.amazonaws.services.databasemigrationservice.model.MongoDbSettings? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.CreateEndpointRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.CreateEndpointRequest()
		input.setEndpointIdentifier(this.endpointIdentifier)
		input.setEndpointType(this.endpointType.toString())
		input.setEngineName(this.engineName)
		input.setUsername(this.username)
		input.setPassword(this.password)
		input.setServerName(this.serverName)
		input.setPort(this.port)
		input.setDatabaseName(this.databaseName)
		input.setExtraConnectionAttributes(this.extraConnectionAttributes)
		input.setKmsKeyId(this.kmsKeyId)
		input.setTags(this.tags)
		input.setCertificateArn(this.certificateArn)
		input.setSslMode(this.sslMode?.toString())
		input.setDynamoDbSettings(this.dynamoDbSettings)
		input.setS3Settings(this.s3Settings)
		input.setMongoDbSettings(this.mongoDbSettings)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.CreateEndpointResult {
	  return com.amazonaws.services.databasemigrationservice.model.CreateEndpointResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.CreateEndpointResult {
		return environment.dms.createEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms create-endpoint")
				.argument("endpoint-identifier", endpointIdentifier)
				.argument("endpoint-type", endpointType.toString())
				.argument("engine-name", engineName)
				.argument("username", username)
				.argument("password", password)
				.argument("server-name", serverName)
				.argument("port", port?.toString())
				.argument("database-name", databaseName)
				.argument("extra-connection-attributes", extraConnectionAttributes)
				.argument("kms-key-id", kmsKeyId)
				.argument("tags", tags?.toString())
				.argument("certificate-arn", certificateArn)
				.argument("ssl-mode", sslMode?.toString())
				.argument("dynamo-db-settings", dynamoDbSettings?.toString())
				.argument("s3-settings", s3Settings?.toString())
				.argument("mongo-db-settings", mongoDbSettings?.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.createEventSubscription(subscriptionName: String, snsTopicArn: String, init: (AWSDatabaseMigrationServiceCreateEventSubscriptionCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionResult {
	return this.block.declare(AWSDatabaseMigrationServiceCreateEventSubscriptionCommand(subscriptionName, snsTopicArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionResult
}

@Generated
class AWSDatabaseMigrationServiceCreateEventSubscriptionCommand(val subscriptionName: String, val snsTopicArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionRequest, com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionResult> {

	var sourceType: String? = null
	var eventCategories: List<String>? = null
	var sourceIds: List<String>? = null
	var enabled: Boolean? = false
	var tags: List<com.amazonaws.services.databasemigrationservice.model.Tag>? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionRequest()
		input.setSubscriptionName(this.subscriptionName)
		input.setSnsTopicArn(this.snsTopicArn)
		input.setSourceType(this.sourceType)
		input.setEventCategories(this.eventCategories)
		input.setSourceIds(this.sourceIds)
		input.setEnabled(this.enabled)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionResult {
	  return com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionResult {
		return environment.dms.createEventSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms create-event-subscription")
				.argument("subscription-name", subscriptionName)
				.argument("sns-topic-arn", snsTopicArn)
				.argument("source-type", sourceType)
				.argument("event-categories", eventCategories?.toString())
				.argument("source-ids", sourceIds?.toString())
				.option("enabled", enabled ?: false)
				.argument("tags", tags?.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.createReplicationInstance(replicationInstanceIdentifier: String, replicationInstanceClass: String, init: (AWSDatabaseMigrationServiceCreateReplicationInstanceCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceResult {
	return this.block.declare(AWSDatabaseMigrationServiceCreateReplicationInstanceCommand(replicationInstanceIdentifier, replicationInstanceClass).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceResult
}

@Generated
class AWSDatabaseMigrationServiceCreateReplicationInstanceCommand(val replicationInstanceIdentifier: String, val replicationInstanceClass: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceRequest, com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceResult> {

	var allocatedStorage: Int? = 0
	var vpcSecurityGroupIds: List<String>? = null
	var availabilityZone: String? = null
	var replicationSubnetGroupIdentifier: String? = null
	var preferredMaintenanceWindow: String? = null
	var multiAZ: Boolean? = false
	var engineVersion: String? = null
	var autoMinorVersionUpgrade: Boolean? = false
	var tags: List<com.amazonaws.services.databasemigrationservice.model.Tag>? = null
	var kmsKeyId: String? = null
	var publiclyAccessible: Boolean? = false

	override fun build(): com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceRequest()
		input.setReplicationInstanceIdentifier(this.replicationInstanceIdentifier)
		input.setAllocatedStorage(this.allocatedStorage)
		input.setReplicationInstanceClass(this.replicationInstanceClass)
		input.setVpcSecurityGroupIds(this.vpcSecurityGroupIds)
		input.setAvailabilityZone(this.availabilityZone)
		input.setReplicationSubnetGroupIdentifier(this.replicationSubnetGroupIdentifier)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setMultiAZ(this.multiAZ)
		input.setEngineVersion(this.engineVersion)
		input.setAutoMinorVersionUpgrade(this.autoMinorVersionUpgrade)
		input.setTags(this.tags)
		input.setKmsKeyId(this.kmsKeyId)
		input.setPubliclyAccessible(this.publiclyAccessible)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceResult {
	  return com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceResult {
		return environment.dms.createReplicationInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms create-replication-instance")
				.argument("replication-instance-identifier", replicationInstanceIdentifier)
				.argument("allocated-storage", allocatedStorage?.toString())
				.argument("replication-instance-class", replicationInstanceClass)
				.argument("vpc-security-group-ids", vpcSecurityGroupIds?.toString())
				.argument("availability-zone", availabilityZone)
				.argument("replication-subnet-group-identifier", replicationSubnetGroupIdentifier)
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.option("multi-az", multiAZ ?: false)
				.argument("engine-version", engineVersion)
				.option("auto-minor-version-upgrade", autoMinorVersionUpgrade ?: false)
				.argument("tags", tags?.toString())
				.argument("kms-key-id", kmsKeyId)
				.option("publicly-accessible", publiclyAccessible ?: false)
	}

}


fun AWSDatabaseMigrationServiceFunctions.createReplicationSubnetGroup(replicationSubnetGroupIdentifier: String, replicationSubnetGroupDescription: String, subnetIds: List<String>, init: (AWSDatabaseMigrationServiceCreateReplicationSubnetGroupCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupResult {
	return this.block.declare(AWSDatabaseMigrationServiceCreateReplicationSubnetGroupCommand(replicationSubnetGroupIdentifier, replicationSubnetGroupDescription, subnetIds).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupResult
}

@Generated
class AWSDatabaseMigrationServiceCreateReplicationSubnetGroupCommand(val replicationSubnetGroupIdentifier: String, val replicationSubnetGroupDescription: String, val subnetIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest, com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupResult> {

	var tags: List<com.amazonaws.services.databasemigrationservice.model.Tag>? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest()
		input.setReplicationSubnetGroupIdentifier(this.replicationSubnetGroupIdentifier)
		input.setReplicationSubnetGroupDescription(this.replicationSubnetGroupDescription)
		input.setSubnetIds(this.subnetIds)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupResult {
	  return com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupResult {
		return environment.dms.createReplicationSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms create-replication-subnet-group")
				.argument("replication-subnet-group-identifier", replicationSubnetGroupIdentifier)
				.argument("replication-subnet-group-description", replicationSubnetGroupDescription)
				.argument("subnet-ids", subnetIds.toString())
				.argument("tags", tags?.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.createReplicationTask(replicationTaskIdentifier: String, sourceEndpointArn: String, targetEndpointArn: String, replicationInstanceArn: String, migrationType: MigrationTypeValue, tableMappings: String, init: (AWSDatabaseMigrationServiceCreateReplicationTaskCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskResult {
	return this.block.declare(AWSDatabaseMigrationServiceCreateReplicationTaskCommand(replicationTaskIdentifier, sourceEndpointArn, targetEndpointArn, replicationInstanceArn, migrationType, tableMappings).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskResult
}

@Generated
class AWSDatabaseMigrationServiceCreateReplicationTaskCommand(val replicationTaskIdentifier: String, val sourceEndpointArn: String, val targetEndpointArn: String, val replicationInstanceArn: String, val migrationType: MigrationTypeValue, val tableMappings: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest, com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskResult> {

	var replicationTaskSettings: String? = null
	var cdcStartTime: java.util.Date? = null
	var tags: List<com.amazonaws.services.databasemigrationservice.model.Tag>? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest()
		input.setReplicationTaskIdentifier(this.replicationTaskIdentifier)
		input.setSourceEndpointArn(this.sourceEndpointArn)
		input.setTargetEndpointArn(this.targetEndpointArn)
		input.setReplicationInstanceArn(this.replicationInstanceArn)
		input.setMigrationType(this.migrationType.toString())
		input.setTableMappings(this.tableMappings)
		input.setReplicationTaskSettings(this.replicationTaskSettings)
		input.setCdcStartTime(this.cdcStartTime)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskResult {
	  return com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskResult {
		return environment.dms.createReplicationTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms create-replication-task")
				.argument("replication-task-identifier", replicationTaskIdentifier)
				.argument("source-endpoint-arn", sourceEndpointArn)
				.argument("target-endpoint-arn", targetEndpointArn)
				.argument("replication-instance-arn", replicationInstanceArn)
				.argument("migration-type", migrationType.toString())
				.argument("table-mappings", tableMappings)
				.argument("replication-task-settings", replicationTaskSettings)
				.argument("cdc-start-time", cdcStartTime?.toString())
				.argument("tags", tags?.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.deleteCertificate(certificateArn: String, init: (AWSDatabaseMigrationServiceDeleteCertificateCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DeleteCertificateResult {
	return this.block.declare(AWSDatabaseMigrationServiceDeleteCertificateCommand(certificateArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DeleteCertificateResult
}

@Generated
class AWSDatabaseMigrationServiceDeleteCertificateCommand(val certificateArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest, com.amazonaws.services.databasemigrationservice.model.DeleteCertificateResult> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest()
		input.setCertificateArn(this.certificateArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DeleteCertificateResult {
	  return com.amazonaws.services.databasemigrationservice.model.DeleteCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DeleteCertificateResult {
		return environment.dms.deleteCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms delete-certificate")
				.argument("certificate-arn", certificateArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.deleteEndpoint(endpointArn: String, init: (AWSDatabaseMigrationServiceDeleteEndpointCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DeleteEndpointResult {
	return this.block.declare(AWSDatabaseMigrationServiceDeleteEndpointCommand(endpointArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DeleteEndpointResult
}

@Generated
class AWSDatabaseMigrationServiceDeleteEndpointCommand(val endpointArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest, com.amazonaws.services.databasemigrationservice.model.DeleteEndpointResult> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest()
		input.setEndpointArn(this.endpointArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DeleteEndpointResult {
	  return com.amazonaws.services.databasemigrationservice.model.DeleteEndpointResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DeleteEndpointResult {
		return environment.dms.deleteEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms delete-endpoint")
				.argument("endpoint-arn", endpointArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.deleteEventSubscription(subscriptionName: String, init: (AWSDatabaseMigrationServiceDeleteEventSubscriptionCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionResult {
	return this.block.declare(AWSDatabaseMigrationServiceDeleteEventSubscriptionCommand(subscriptionName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionResult
}

@Generated
class AWSDatabaseMigrationServiceDeleteEventSubscriptionCommand(val subscriptionName: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest, com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionResult> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest()
		input.setSubscriptionName(this.subscriptionName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionResult {
	  return com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionResult {
		return environment.dms.deleteEventSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms delete-event-subscription")
				.argument("subscription-name", subscriptionName)
	}

}


fun AWSDatabaseMigrationServiceFunctions.deleteReplicationInstance(replicationInstanceArn: String, init: (AWSDatabaseMigrationServiceDeleteReplicationInstanceCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceResult {
	return this.block.declare(AWSDatabaseMigrationServiceDeleteReplicationInstanceCommand(replicationInstanceArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceResult
}

@Generated
class AWSDatabaseMigrationServiceDeleteReplicationInstanceCommand(val replicationInstanceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest, com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceResult> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest()
		input.setReplicationInstanceArn(this.replicationInstanceArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceResult {
	  return com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceResult {
		return environment.dms.deleteReplicationInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms delete-replication-instance")
				.argument("replication-instance-arn", replicationInstanceArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.deleteReplicationSubnetGroup(replicationSubnetGroupIdentifier: String, init: (AWSDatabaseMigrationServiceDeleteReplicationSubnetGroupCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupResult {
	return this.block.declare(AWSDatabaseMigrationServiceDeleteReplicationSubnetGroupCommand(replicationSubnetGroupIdentifier).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupResult
}

@Generated
class AWSDatabaseMigrationServiceDeleteReplicationSubnetGroupCommand(val replicationSubnetGroupIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest, com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupResult> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest()
		input.setReplicationSubnetGroupIdentifier(this.replicationSubnetGroupIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupResult {
	  return com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupResult {
		return environment.dms.deleteReplicationSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms delete-replication-subnet-group")
				.argument("replication-subnet-group-identifier", replicationSubnetGroupIdentifier)
	}

}


fun AWSDatabaseMigrationServiceFunctions.deleteReplicationTask(replicationTaskArn: String, init: (AWSDatabaseMigrationServiceDeleteReplicationTaskCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskResult {
	return this.block.declare(AWSDatabaseMigrationServiceDeleteReplicationTaskCommand(replicationTaskArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskResult
}

@Generated
class AWSDatabaseMigrationServiceDeleteReplicationTaskCommand(val replicationTaskArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest, com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskResult> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest()
		input.setReplicationTaskArn(this.replicationTaskArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskResult {
	  return com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskResult {
		return environment.dms.deleteReplicationTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms delete-replication-task")
				.argument("replication-task-arn", replicationTaskArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeAccountAttributes(init: (AWSDatabaseMigrationServiceDescribeAccountAttributesCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeAccountAttributesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeAccountAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest, com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesResult> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesResult {
		return environment.dms.describeAccountAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-account-attributes")

	}

}


fun AWSDatabaseMigrationServiceFunctions.describeCertificates(init: (AWSDatabaseMigrationServiceDescribeCertificatesCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeCertificatesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesRequest, com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesResult> {

	var filters: List<com.amazonaws.services.databasemigrationservice.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesRequest()
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesResult {
		return environment.dms.describeCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-certificates")
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeConnections(init: (AWSDatabaseMigrationServiceDescribeConnectionsCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeConnectionsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeConnectionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsRequest, com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsResult> {

	var filters: List<com.amazonaws.services.databasemigrationservice.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsRequest()
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsResult {
		return environment.dms.describeConnections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-connections")
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeEndpointTypes(init: (AWSDatabaseMigrationServiceDescribeEndpointTypesCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeEndpointTypesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeEndpointTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesRequest, com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesResult> {

	var filters: List<com.amazonaws.services.databasemigrationservice.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesRequest()
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesResult {
		return environment.dms.describeEndpointTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-endpoint-types")
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeEndpoints(init: (AWSDatabaseMigrationServiceDescribeEndpointsCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeEndpointsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeEndpointsCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsRequest, com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsResult> {

	var filters: List<com.amazonaws.services.databasemigrationservice.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsRequest()
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsResult {
		return environment.dms.describeEndpoints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-endpoints")
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeEventCategories(init: (AWSDatabaseMigrationServiceDescribeEventCategoriesCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeEventCategoriesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeEventCategoriesCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest, com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesResult> {

	var sourceType: String? = null
	var filters: List<com.amazonaws.services.databasemigrationservice.model.Filter>? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest()
		input.setSourceType(this.sourceType)
		input.setFilters(this.filters)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesResult {
		return environment.dms.describeEventCategories(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-event-categories")
				.argument("source-type", sourceType)
				.argument("filters", filters?.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeEventSubscriptions(init: (AWSDatabaseMigrationServiceDescribeEventSubscriptionsCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeEventSubscriptionsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeEventSubscriptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsRequest, com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsResult> {

	var subscriptionName: String? = null
	var filters: List<com.amazonaws.services.databasemigrationservice.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsRequest()
		input.setSubscriptionName(this.subscriptionName)
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsResult {
		return environment.dms.describeEventSubscriptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-event-subscriptions")
				.argument("subscription-name", subscriptionName)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeEvents(init: (AWSDatabaseMigrationServiceDescribeEventsCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeEventsResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeEventsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeEventsResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeEventsRequest, com.amazonaws.services.databasemigrationservice.model.DescribeEventsResult> {

	var sourceIdentifier: String? = null
	var sourceType: SourceType? = null
	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null
	var duration: Int? = 0
	var eventCategories: List<String>? = null
	var filters: List<com.amazonaws.services.databasemigrationservice.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeEventsRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeEventsRequest()
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

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeEventsResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeEventsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeEventsResult {
		return environment.dms.describeEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-events")
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


fun AWSDatabaseMigrationServiceFunctions.describeOrderableReplicationInstances(init: (AWSDatabaseMigrationServiceDescribeOrderableReplicationInstancesCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeOrderableReplicationInstancesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeOrderableReplicationInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest, com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesResult> {

	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest()
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesResult {
		return environment.dms.describeOrderableReplicationInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-orderable-replication-instances")
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeRefreshSchemasStatus(endpointArn: String, init: (AWSDatabaseMigrationServiceDescribeRefreshSchemasStatusCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeRefreshSchemasStatusCommand(endpointArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeRefreshSchemasStatusCommand(val endpointArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest, com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusResult> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest()
		input.setEndpointArn(this.endpointArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusResult {
		return environment.dms.describeRefreshSchemasStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-refresh-schemas-status")
				.argument("endpoint-arn", endpointArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeReplicationInstanceTaskLogs(replicationInstanceArn: String, init: (AWSDatabaseMigrationServiceDescribeReplicationInstanceTaskLogsCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeReplicationInstanceTaskLogsCommand(replicationInstanceArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeReplicationInstanceTaskLogsCommand(val replicationInstanceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest, com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsResult> {

	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest()
		input.setReplicationInstanceArn(this.replicationInstanceArn)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsResult {
		return environment.dms.describeReplicationInstanceTaskLogs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-replication-instance-task-logs")
				.argument("replication-instance-arn", replicationInstanceArn)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeReplicationInstances(init: (AWSDatabaseMigrationServiceDescribeReplicationInstancesCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeReplicationInstancesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeReplicationInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesRequest, com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesResult> {

	var filters: List<com.amazonaws.services.databasemigrationservice.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesRequest()
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesResult {
		return environment.dms.describeReplicationInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-replication-instances")
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeReplicationSubnetGroups(init: (AWSDatabaseMigrationServiceDescribeReplicationSubnetGroupsCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeReplicationSubnetGroupsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeReplicationSubnetGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsRequest, com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsResult> {

	var filters: List<com.amazonaws.services.databasemigrationservice.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsRequest()
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsResult {
		return environment.dms.describeReplicationSubnetGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-replication-subnet-groups")
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeReplicationTaskAssessmentResults(init: (AWSDatabaseMigrationServiceDescribeReplicationTaskAssessmentResultsCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeReplicationTaskAssessmentResultsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeReplicationTaskAssessmentResultsCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsRequest, com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsResult> {

	var replicationTaskArn: String? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsRequest()
		input.setReplicationTaskArn(this.replicationTaskArn)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsResult {
		return environment.dms.describeReplicationTaskAssessmentResults(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-replication-task-assessment-results")
				.argument("replication-task-arn", replicationTaskArn)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeReplicationTasks(init: (AWSDatabaseMigrationServiceDescribeReplicationTasksCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeReplicationTasksCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeReplicationTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksRequest, com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksResult> {

	var filters: List<com.amazonaws.services.databasemigrationservice.model.Filter>? = null
	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksRequest()
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksResult {
		return environment.dms.describeReplicationTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-replication-tasks")
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeSchemas(endpointArn: String, init: (AWSDatabaseMigrationServiceDescribeSchemasCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeSchemasResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeSchemasCommand(endpointArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeSchemasResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeSchemasCommand(val endpointArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest, com.amazonaws.services.databasemigrationservice.model.DescribeSchemasResult> {

	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest()
		input.setEndpointArn(this.endpointArn)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeSchemasResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeSchemasResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeSchemasResult {
		return environment.dms.describeSchemas(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-schemas")
				.argument("endpoint-arn", endpointArn)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeTableStatistics(replicationTaskArn: String, init: (AWSDatabaseMigrationServiceDescribeTableStatisticsCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsResult {
	return this.block.declare(AWSDatabaseMigrationServiceDescribeTableStatisticsCommand(replicationTaskArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsResult
}

@Generated
class AWSDatabaseMigrationServiceDescribeTableStatisticsCommand(val replicationTaskArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsRequest, com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsResult> {

	var maxRecords: Int? = 0
	var marker: String? = null
	var filters: List<com.amazonaws.services.databasemigrationservice.model.Filter>? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsRequest()
		input.setReplicationTaskArn(this.replicationTaskArn)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		input.setFilters(this.filters)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsResult {
	  return com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsResult {
		return environment.dms.describeTableStatistics(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-table-statistics")
				.argument("replication-task-arn", replicationTaskArn)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.argument("filters", filters?.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.importCertificate(certificateIdentifier: String, init: (AWSDatabaseMigrationServiceImportCertificateCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.ImportCertificateResult {
	return this.block.declare(AWSDatabaseMigrationServiceImportCertificateCommand(certificateIdentifier).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.ImportCertificateResult
}

@Generated
class AWSDatabaseMigrationServiceImportCertificateCommand(val certificateIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.ImportCertificateRequest, com.amazonaws.services.databasemigrationservice.model.ImportCertificateResult> {

	var certificatePem: String? = null
	var certificateWallet: java.nio.ByteBuffer? = null
	var tags: List<com.amazonaws.services.databasemigrationservice.model.Tag>? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.ImportCertificateRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.ImportCertificateRequest()
		input.setCertificateIdentifier(this.certificateIdentifier)
		input.setCertificatePem(this.certificatePem)
		input.setCertificateWallet(this.certificateWallet)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.ImportCertificateResult {
	  return com.amazonaws.services.databasemigrationservice.model.ImportCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.ImportCertificateResult {
		return environment.dms.importCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms import-certificate")
				.argument("certificate-identifier", certificateIdentifier)
				.argument("certificate-pem", certificatePem)
				.argument("certificate-wallet", certificateWallet?.toString())
				.argument("tags", tags?.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.listTagsForResource(resourceArn: String, init: (AWSDatabaseMigrationServiceListTagsForResourceCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceResult {
	return this.block.declare(AWSDatabaseMigrationServiceListTagsForResourceCommand(resourceArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceResult
}

@Generated
class AWSDatabaseMigrationServiceListTagsForResourceCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest, com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceResult> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceResult {
	  return com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceResult {
		return environment.dms.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms list-tags-for-resource")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.modifyEndpoint(endpointArn: String, init: (AWSDatabaseMigrationServiceModifyEndpointCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.ModifyEndpointResult {
	return this.block.declare(AWSDatabaseMigrationServiceModifyEndpointCommand(endpointArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.ModifyEndpointResult
}

@Generated
class AWSDatabaseMigrationServiceModifyEndpointCommand(val endpointArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.ModifyEndpointRequest, com.amazonaws.services.databasemigrationservice.model.ModifyEndpointResult> {

	var endpointIdentifier: String? = null
	var endpointType: ReplicationEndpointTypeValue? = null
	var engineName: String? = null
	var username: String? = null
	var password: String? = null
	var serverName: String? = null
	var port: Int? = 0
	var databaseName: String? = null
	var extraConnectionAttributes: String? = null
	var certificateArn: String? = null
	var sslMode: DmsSslModeValue? = null
	var dynamoDbSettings: com.amazonaws.services.databasemigrationservice.model.DynamoDbSettings? = null
	var s3Settings: com.amazonaws.services.databasemigrationservice.model.S3Settings? = null
	var mongoDbSettings: com.amazonaws.services.databasemigrationservice.model.MongoDbSettings? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.ModifyEndpointRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.ModifyEndpointRequest()
		input.setEndpointArn(this.endpointArn)
		input.setEndpointIdentifier(this.endpointIdentifier)
		input.setEndpointType(this.endpointType?.toString())
		input.setEngineName(this.engineName)
		input.setUsername(this.username)
		input.setPassword(this.password)
		input.setServerName(this.serverName)
		input.setPort(this.port)
		input.setDatabaseName(this.databaseName)
		input.setExtraConnectionAttributes(this.extraConnectionAttributes)
		input.setCertificateArn(this.certificateArn)
		input.setSslMode(this.sslMode?.toString())
		input.setDynamoDbSettings(this.dynamoDbSettings)
		input.setS3Settings(this.s3Settings)
		input.setMongoDbSettings(this.mongoDbSettings)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.ModifyEndpointResult {
	  return com.amazonaws.services.databasemigrationservice.model.ModifyEndpointResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.ModifyEndpointResult {
		return environment.dms.modifyEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms modify-endpoint")
				.argument("endpoint-arn", endpointArn)
				.argument("endpoint-identifier", endpointIdentifier)
				.argument("endpoint-type", endpointType?.toString())
				.argument("engine-name", engineName)
				.argument("username", username)
				.argument("password", password)
				.argument("server-name", serverName)
				.argument("port", port?.toString())
				.argument("database-name", databaseName)
				.argument("extra-connection-attributes", extraConnectionAttributes)
				.argument("certificate-arn", certificateArn)
				.argument("ssl-mode", sslMode?.toString())
				.argument("dynamo-db-settings", dynamoDbSettings?.toString())
				.argument("s3-settings", s3Settings?.toString())
				.argument("mongo-db-settings", mongoDbSettings?.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.modifyEventSubscription(subscriptionName: String, init: (AWSDatabaseMigrationServiceModifyEventSubscriptionCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionResult {
	return this.block.declare(AWSDatabaseMigrationServiceModifyEventSubscriptionCommand(subscriptionName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionResult
}

@Generated
class AWSDatabaseMigrationServiceModifyEventSubscriptionCommand(val subscriptionName: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionRequest, com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionResult> {

	var snsTopicArn: String? = null
	var sourceType: String? = null
	var eventCategories: List<String>? = null
	var enabled: Boolean? = false

	override fun build(): com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionRequest()
		input.setSubscriptionName(this.subscriptionName)
		input.setSnsTopicArn(this.snsTopicArn)
		input.setSourceType(this.sourceType)
		input.setEventCategories(this.eventCategories)
		input.setEnabled(this.enabled)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionResult {
	  return com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionResult {
		return environment.dms.modifyEventSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms modify-event-subscription")
				.argument("subscription-name", subscriptionName)
				.argument("sns-topic-arn", snsTopicArn)
				.argument("source-type", sourceType)
				.argument("event-categories", eventCategories?.toString())
				.option("enabled", enabled ?: false)
	}

}


fun AWSDatabaseMigrationServiceFunctions.modifyReplicationInstance(replicationInstanceArn: String, init: (AWSDatabaseMigrationServiceModifyReplicationInstanceCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceResult {
	return this.block.declare(AWSDatabaseMigrationServiceModifyReplicationInstanceCommand(replicationInstanceArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceResult
}

@Generated
class AWSDatabaseMigrationServiceModifyReplicationInstanceCommand(val replicationInstanceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceRequest, com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceResult> {

	var allocatedStorage: Int? = 0
	var applyImmediately: Boolean? = false
	var replicationInstanceClass: String? = null
	var vpcSecurityGroupIds: List<String>? = null
	var preferredMaintenanceWindow: String? = null
	var multiAZ: Boolean? = false
	var engineVersion: String? = null
	var allowMajorVersionUpgrade: Boolean? = false
	var autoMinorVersionUpgrade: Boolean? = false
	var replicationInstanceIdentifier: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceRequest()
		input.setReplicationInstanceArn(this.replicationInstanceArn)
		input.setAllocatedStorage(this.allocatedStorage)
		input.setApplyImmediately(this.applyImmediately)
		input.setReplicationInstanceClass(this.replicationInstanceClass)
		input.setVpcSecurityGroupIds(this.vpcSecurityGroupIds)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setMultiAZ(this.multiAZ)
		input.setEngineVersion(this.engineVersion)
		input.setAllowMajorVersionUpgrade(this.allowMajorVersionUpgrade)
		input.setAutoMinorVersionUpgrade(this.autoMinorVersionUpgrade)
		input.setReplicationInstanceIdentifier(this.replicationInstanceIdentifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceResult {
	  return com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceResult {
		return environment.dms.modifyReplicationInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms modify-replication-instance")
				.argument("replication-instance-arn", replicationInstanceArn)
				.argument("allocated-storage", allocatedStorage?.toString())
				.option("apply-immediately", applyImmediately ?: false)
				.argument("replication-instance-class", replicationInstanceClass)
				.argument("vpc-security-group-ids", vpcSecurityGroupIds?.toString())
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.option("multi-az", multiAZ ?: false)
				.argument("engine-version", engineVersion)
				.option("allow-major-version-upgrade", allowMajorVersionUpgrade ?: false)
				.option("auto-minor-version-upgrade", autoMinorVersionUpgrade ?: false)
				.argument("replication-instance-identifier", replicationInstanceIdentifier)
	}

}


fun AWSDatabaseMigrationServiceFunctions.modifyReplicationSubnetGroup(replicationSubnetGroupIdentifier: String, subnetIds: List<String>, init: (AWSDatabaseMigrationServiceModifyReplicationSubnetGroupCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupResult {
	return this.block.declare(AWSDatabaseMigrationServiceModifyReplicationSubnetGroupCommand(replicationSubnetGroupIdentifier, subnetIds).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupResult
}

@Generated
class AWSDatabaseMigrationServiceModifyReplicationSubnetGroupCommand(val replicationSubnetGroupIdentifier: String, val subnetIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest, com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupResult> {

	var replicationSubnetGroupDescription: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest()
		input.setReplicationSubnetGroupIdentifier(this.replicationSubnetGroupIdentifier)
		input.setReplicationSubnetGroupDescription(this.replicationSubnetGroupDescription)
		input.setSubnetIds(this.subnetIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupResult {
	  return com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupResult {
		return environment.dms.modifyReplicationSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms modify-replication-subnet-group")
				.argument("replication-subnet-group-identifier", replicationSubnetGroupIdentifier)
				.argument("replication-subnet-group-description", replicationSubnetGroupDescription)
				.argument("subnet-ids", subnetIds.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.modifyReplicationTask(replicationTaskArn: String, init: (AWSDatabaseMigrationServiceModifyReplicationTaskCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskResult {
	return this.block.declare(AWSDatabaseMigrationServiceModifyReplicationTaskCommand(replicationTaskArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskResult
}

@Generated
class AWSDatabaseMigrationServiceModifyReplicationTaskCommand(val replicationTaskArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskRequest, com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskResult> {

	var replicationTaskIdentifier: String? = null
	var migrationType: MigrationTypeValue? = null
	var tableMappings: String? = null
	var replicationTaskSettings: String? = null
	var cdcStartTime: java.util.Date? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskRequest()
		input.setReplicationTaskArn(this.replicationTaskArn)
		input.setReplicationTaskIdentifier(this.replicationTaskIdentifier)
		input.setMigrationType(this.migrationType?.toString())
		input.setTableMappings(this.tableMappings)
		input.setReplicationTaskSettings(this.replicationTaskSettings)
		input.setCdcStartTime(this.cdcStartTime)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskResult {
	  return com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskResult {
		return environment.dms.modifyReplicationTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms modify-replication-task")
				.argument("replication-task-arn", replicationTaskArn)
				.argument("replication-task-identifier", replicationTaskIdentifier)
				.argument("migration-type", migrationType?.toString())
				.argument("table-mappings", tableMappings)
				.argument("replication-task-settings", replicationTaskSettings)
				.argument("cdc-start-time", cdcStartTime?.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.rebootReplicationInstance(replicationInstanceArn: String, init: (AWSDatabaseMigrationServiceRebootReplicationInstanceCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceResult {
	return this.block.declare(AWSDatabaseMigrationServiceRebootReplicationInstanceCommand(replicationInstanceArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceResult
}

@Generated
class AWSDatabaseMigrationServiceRebootReplicationInstanceCommand(val replicationInstanceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest, com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceResult> {

	var forceFailover: Boolean? = false

	override fun build(): com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest()
		input.setReplicationInstanceArn(this.replicationInstanceArn)
		input.setForceFailover(this.forceFailover)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceResult {
	  return com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceResult {
		return environment.dms.rebootReplicationInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms reboot-replication-instance")
				.argument("replication-instance-arn", replicationInstanceArn)
				.option("force-failover", forceFailover ?: false)
	}

}


fun AWSDatabaseMigrationServiceFunctions.refreshSchemas(endpointArn: String, replicationInstanceArn: String, init: (AWSDatabaseMigrationServiceRefreshSchemasCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.RefreshSchemasResult {
	return this.block.declare(AWSDatabaseMigrationServiceRefreshSchemasCommand(endpointArn, replicationInstanceArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.RefreshSchemasResult
}

@Generated
class AWSDatabaseMigrationServiceRefreshSchemasCommand(val endpointArn: String, val replicationInstanceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest, com.amazonaws.services.databasemigrationservice.model.RefreshSchemasResult> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest()
		input.setEndpointArn(this.endpointArn)
		input.setReplicationInstanceArn(this.replicationInstanceArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.RefreshSchemasResult {
	  return com.amazonaws.services.databasemigrationservice.model.RefreshSchemasResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.RefreshSchemasResult {
		return environment.dms.refreshSchemas(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms refresh-schemas")
				.argument("endpoint-arn", endpointArn)
				.argument("replication-instance-arn", replicationInstanceArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.reloadTables(replicationTaskArn: String, tablesToReload: List<com.amazonaws.services.databasemigrationservice.model.TableToReload>, init: (AWSDatabaseMigrationServiceReloadTablesCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.ReloadTablesResult {
	return this.block.declare(AWSDatabaseMigrationServiceReloadTablesCommand(replicationTaskArn, tablesToReload).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.ReloadTablesResult
}

@Generated
class AWSDatabaseMigrationServiceReloadTablesCommand(val replicationTaskArn: String, val tablesToReload: List<com.amazonaws.services.databasemigrationservice.model.TableToReload>) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest, com.amazonaws.services.databasemigrationservice.model.ReloadTablesResult> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest()
		input.setReplicationTaskArn(this.replicationTaskArn)
		input.setTablesToReload(this.tablesToReload)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.ReloadTablesResult {
	  return com.amazonaws.services.databasemigrationservice.model.ReloadTablesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.ReloadTablesResult {
		return environment.dms.reloadTables(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms reload-tables")
				.argument("replication-task-arn", replicationTaskArn)
				.argument("tables-to-reload", tablesToReload.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.removeTagsFromResource(resourceArn: String, tagKeys: List<String>, init: (AWSDatabaseMigrationServiceRemoveTagsFromResourceCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceResult {
	return this.block.declare(AWSDatabaseMigrationServiceRemoveTagsFromResourceCommand(resourceArn, tagKeys).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceResult
}

@Generated
class AWSDatabaseMigrationServiceRemoveTagsFromResourceCommand(val resourceArn: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest, com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceResult> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceResult {
	  return com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceResult {
		return environment.dms.removeTagsFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms remove-tags-from-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.startReplicationTask(replicationTaskArn: String, startReplicationTaskType: StartReplicationTaskTypeValue, init: (AWSDatabaseMigrationServiceStartReplicationTaskCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskResult {
	return this.block.declare(AWSDatabaseMigrationServiceStartReplicationTaskCommand(replicationTaskArn, startReplicationTaskType).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskResult
}

@Generated
class AWSDatabaseMigrationServiceStartReplicationTaskCommand(val replicationTaskArn: String, val startReplicationTaskType: StartReplicationTaskTypeValue) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest, com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskResult> {

	var cdcStartTime: java.util.Date? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest()
		input.setReplicationTaskArn(this.replicationTaskArn)
		input.setStartReplicationTaskType(this.startReplicationTaskType.toString())
		input.setCdcStartTime(this.cdcStartTime)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskResult {
	  return com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskResult {
		return environment.dms.startReplicationTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms start-replication-task")
				.argument("replication-task-arn", replicationTaskArn)
				.argument("start-replication-task-type", startReplicationTaskType.toString())
				.argument("cdc-start-time", cdcStartTime?.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.startReplicationTaskAssessment(replicationTaskArn: String, init: (AWSDatabaseMigrationServiceStartReplicationTaskAssessmentCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentResult {
	return this.block.declare(AWSDatabaseMigrationServiceStartReplicationTaskAssessmentCommand(replicationTaskArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentResult
}

@Generated
class AWSDatabaseMigrationServiceStartReplicationTaskAssessmentCommand(val replicationTaskArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest, com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentResult> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest()
		input.setReplicationTaskArn(this.replicationTaskArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentResult {
	  return com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentResult {
		return environment.dms.startReplicationTaskAssessment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms start-replication-task-assessment")
				.argument("replication-task-arn", replicationTaskArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.stopReplicationTask(replicationTaskArn: String, init: (AWSDatabaseMigrationServiceStopReplicationTaskCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskResult {
	return this.block.declare(AWSDatabaseMigrationServiceStopReplicationTaskCommand(replicationTaskArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskResult
}

@Generated
class AWSDatabaseMigrationServiceStopReplicationTaskCommand(val replicationTaskArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest, com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskResult> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest()
		input.setReplicationTaskArn(this.replicationTaskArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskResult {
	  return com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskResult {
		return environment.dms.stopReplicationTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms stop-replication-task")
				.argument("replication-task-arn", replicationTaskArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.testConnection(replicationInstanceArn: String, endpointArn: String, init: (AWSDatabaseMigrationServiceTestConnectionCommand.() -> Unit)? = null): com.amazonaws.services.databasemigrationservice.model.TestConnectionResult {
	return this.block.declare(AWSDatabaseMigrationServiceTestConnectionCommand(replicationInstanceArn, endpointArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.databasemigrationservice.model.TestConnectionResult
}

@Generated
class AWSDatabaseMigrationServiceTestConnectionCommand(val replicationInstanceArn: String, val endpointArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest, com.amazonaws.services.databasemigrationservice.model.TestConnectionResult> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest()
		input.setReplicationInstanceArn(this.replicationInstanceArn)
		input.setEndpointArn(this.endpointArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.databasemigrationservice.model.TestConnectionResult {
	  return com.amazonaws.services.databasemigrationservice.model.TestConnectionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.databasemigrationservice.model.TestConnectionResult {
		return environment.dms.testConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms test-connection")
				.argument("replication-instance-arn", replicationInstanceArn)
				.argument("endpoint-arn", endpointArn)
	}

}
