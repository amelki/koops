
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.databasemigrationservice.AWSDatabaseMigrationService
import com.amazonaws.services.databasemigrationservice.model.*

var codingue.koops.core.Environment.dms: AWSDatabaseMigrationService
	get() = this.capabilities[AWSDatabaseMigrationService::class.java.name] as AWSDatabaseMigrationService
	set(dms) {
		this.capabilities[AWSDatabaseMigrationService::class.java.name] = dms
	}

@Generated
class AWSDatabaseMigrationServiceFunctions(val block: Block)

infix fun AwsContinuation.dms(init: AWSDatabaseMigrationServiceFunctions.() -> Unit) {
	AWSDatabaseMigrationServiceFunctions(shell).apply(init)
}

			

fun AWSDatabaseMigrationServiceFunctions.addTagsToResource(resourceArn: String, tags: List<com.amazonaws.services.databasemigrationservice.model.Tag>, init: AWSDatabaseMigrationServiceAddTagsToResourceCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceAddTagsToResourceCommand(resourceArn, tags).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceAddTagsToResourceCommand(val resourceArn: String, val tags: List<com.amazonaws.services.databasemigrationservice.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.addTagsToResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms add-tags-to-resource")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.createEndpoint(endpointIdentifier: String, endpointType: ReplicationEndpointTypeValue, engineName: String, init: AWSDatabaseMigrationServiceCreateEndpointCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceCreateEndpointCommand(endpointIdentifier, endpointType, engineName).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceCreateEndpointCommand(val endpointIdentifier: String, val endpointType: ReplicationEndpointTypeValue, val engineName: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.CreateEndpointRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.createEndpoint(build())
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


fun AWSDatabaseMigrationServiceFunctions.createEventSubscription(subscriptionName: String, snsTopicArn: String, init: AWSDatabaseMigrationServiceCreateEventSubscriptionCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceCreateEventSubscriptionCommand(subscriptionName, snsTopicArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceCreateEventSubscriptionCommand(val subscriptionName: String, val snsTopicArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.createEventSubscription(build())
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


fun AWSDatabaseMigrationServiceFunctions.createReplicationInstance(replicationInstanceIdentifier: String, replicationInstanceClass: String, init: AWSDatabaseMigrationServiceCreateReplicationInstanceCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceCreateReplicationInstanceCommand(replicationInstanceIdentifier, replicationInstanceClass).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceCreateReplicationInstanceCommand(val replicationInstanceIdentifier: String, val replicationInstanceClass: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.createReplicationInstance(build())
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


fun AWSDatabaseMigrationServiceFunctions.createReplicationSubnetGroup(replicationSubnetGroupIdentifier: String, replicationSubnetGroupDescription: String, subnetIds: List<String>, init: AWSDatabaseMigrationServiceCreateReplicationSubnetGroupCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceCreateReplicationSubnetGroupCommand(replicationSubnetGroupIdentifier, replicationSubnetGroupDescription, subnetIds).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceCreateReplicationSubnetGroupCommand(val replicationSubnetGroupIdentifier: String, val replicationSubnetGroupDescription: String, val subnetIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest> {

	var tags: List<com.amazonaws.services.databasemigrationservice.model.Tag>? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest()
		input.setReplicationSubnetGroupIdentifier(this.replicationSubnetGroupIdentifier)
		input.setReplicationSubnetGroupDescription(this.replicationSubnetGroupDescription)
		input.setSubnetIds(this.subnetIds)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.createReplicationSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms create-replication-subnet-group")
				.argument("replication-subnet-group-identifier", replicationSubnetGroupIdentifier)
				.argument("replication-subnet-group-description", replicationSubnetGroupDescription)
				.argument("subnet-ids", subnetIds.toString())
				.argument("tags", tags?.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.createReplicationTask(replicationTaskIdentifier: String, sourceEndpointArn: String, targetEndpointArn: String, replicationInstanceArn: String, migrationType: MigrationTypeValue, tableMappings: String, init: AWSDatabaseMigrationServiceCreateReplicationTaskCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceCreateReplicationTaskCommand(replicationTaskIdentifier, sourceEndpointArn, targetEndpointArn, replicationInstanceArn, migrationType, tableMappings).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceCreateReplicationTaskCommand(val replicationTaskIdentifier: String, val sourceEndpointArn: String, val targetEndpointArn: String, val replicationInstanceArn: String, val migrationType: MigrationTypeValue, val tableMappings: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.createReplicationTask(build())
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


fun AWSDatabaseMigrationServiceFunctions.deleteCertificate(certificateArn: String, init: AWSDatabaseMigrationServiceDeleteCertificateCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDeleteCertificateCommand(certificateArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDeleteCertificateCommand(val certificateArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest()
		input.setCertificateArn(this.certificateArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.deleteCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms delete-certificate")
				.argument("certificate-arn", certificateArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.deleteEndpoint(endpointArn: String, init: AWSDatabaseMigrationServiceDeleteEndpointCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDeleteEndpointCommand(endpointArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDeleteEndpointCommand(val endpointArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest()
		input.setEndpointArn(this.endpointArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.deleteEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms delete-endpoint")
				.argument("endpoint-arn", endpointArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.deleteEventSubscription(subscriptionName: String, init: AWSDatabaseMigrationServiceDeleteEventSubscriptionCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDeleteEventSubscriptionCommand(subscriptionName).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDeleteEventSubscriptionCommand(val subscriptionName: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest()
		input.setSubscriptionName(this.subscriptionName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.deleteEventSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms delete-event-subscription")
				.argument("subscription-name", subscriptionName)
	}

}


fun AWSDatabaseMigrationServiceFunctions.deleteReplicationInstance(replicationInstanceArn: String, init: AWSDatabaseMigrationServiceDeleteReplicationInstanceCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDeleteReplicationInstanceCommand(replicationInstanceArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDeleteReplicationInstanceCommand(val replicationInstanceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest()
		input.setReplicationInstanceArn(this.replicationInstanceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.deleteReplicationInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms delete-replication-instance")
				.argument("replication-instance-arn", replicationInstanceArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.deleteReplicationSubnetGroup(replicationSubnetGroupIdentifier: String, init: AWSDatabaseMigrationServiceDeleteReplicationSubnetGroupCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDeleteReplicationSubnetGroupCommand(replicationSubnetGroupIdentifier).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDeleteReplicationSubnetGroupCommand(val replicationSubnetGroupIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest()
		input.setReplicationSubnetGroupIdentifier(this.replicationSubnetGroupIdentifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.deleteReplicationSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms delete-replication-subnet-group")
				.argument("replication-subnet-group-identifier", replicationSubnetGroupIdentifier)
	}

}


fun AWSDatabaseMigrationServiceFunctions.deleteReplicationTask(replicationTaskArn: String, init: AWSDatabaseMigrationServiceDeleteReplicationTaskCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDeleteReplicationTaskCommand(replicationTaskArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDeleteReplicationTaskCommand(val replicationTaskArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest()
		input.setReplicationTaskArn(this.replicationTaskArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.deleteReplicationTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms delete-replication-task")
				.argument("replication-task-arn", replicationTaskArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeAccountAttributes(init: AWSDatabaseMigrationServiceDescribeAccountAttributesCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeAccountAttributesCommand().apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeAccountAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeAccountAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-account-attributes")

	}

}


fun AWSDatabaseMigrationServiceFunctions.describeCertificates(init: AWSDatabaseMigrationServiceDescribeCertificatesCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeCertificatesCommand().apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-certificates")
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeConnections(init: AWSDatabaseMigrationServiceDescribeConnectionsCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeConnectionsCommand().apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeConnectionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeConnections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-connections")
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeEndpointTypes(init: AWSDatabaseMigrationServiceDescribeEndpointTypesCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeEndpointTypesCommand().apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeEndpointTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeEndpointTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-endpoint-types")
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeEndpoints(init: AWSDatabaseMigrationServiceDescribeEndpointsCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeEndpointsCommand().apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeEndpointsCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeEndpoints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-endpoints")
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeEventCategories(init: AWSDatabaseMigrationServiceDescribeEventCategoriesCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeEventCategoriesCommand().apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeEventCategoriesCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest> {

	var sourceType: String? = null
	var filters: List<com.amazonaws.services.databasemigrationservice.model.Filter>? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest()
		input.setSourceType(this.sourceType)
		input.setFilters(this.filters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeEventCategories(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-event-categories")
				.argument("source-type", sourceType)
				.argument("filters", filters?.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeEventSubscriptions(init: AWSDatabaseMigrationServiceDescribeEventSubscriptionsCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeEventSubscriptionsCommand().apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeEventSubscriptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeEventSubscriptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-event-subscriptions")
				.argument("subscription-name", subscriptionName)
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeEvents(init: AWSDatabaseMigrationServiceDescribeEventsCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeEventsCommand().apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeEventsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeEvents(build())
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


fun AWSDatabaseMigrationServiceFunctions.describeOrderableReplicationInstances(init: AWSDatabaseMigrationServiceDescribeOrderableReplicationInstancesCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeOrderableReplicationInstancesCommand().apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeOrderableReplicationInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest> {

	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest()
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeOrderableReplicationInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-orderable-replication-instances")
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeRefreshSchemasStatus(endpointArn: String, init: AWSDatabaseMigrationServiceDescribeRefreshSchemasStatusCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeRefreshSchemasStatusCommand(endpointArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeRefreshSchemasStatusCommand(val endpointArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest()
		input.setEndpointArn(this.endpointArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeRefreshSchemasStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-refresh-schemas-status")
				.argument("endpoint-arn", endpointArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeReplicationInstanceTaskLogs(replicationInstanceArn: String, init: AWSDatabaseMigrationServiceDescribeReplicationInstanceTaskLogsCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeReplicationInstanceTaskLogsCommand(replicationInstanceArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeReplicationInstanceTaskLogsCommand(val replicationInstanceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest> {

	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest()
		input.setReplicationInstanceArn(this.replicationInstanceArn)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeReplicationInstanceTaskLogs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-replication-instance-task-logs")
				.argument("replication-instance-arn", replicationInstanceArn)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeReplicationInstances(init: AWSDatabaseMigrationServiceDescribeReplicationInstancesCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeReplicationInstancesCommand().apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeReplicationInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeReplicationInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-replication-instances")
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeReplicationSubnetGroups(init: AWSDatabaseMigrationServiceDescribeReplicationSubnetGroupsCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeReplicationSubnetGroupsCommand().apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeReplicationSubnetGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeReplicationSubnetGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-replication-subnet-groups")
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeReplicationTaskAssessmentResults(init: AWSDatabaseMigrationServiceDescribeReplicationTaskAssessmentResultsCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeReplicationTaskAssessmentResultsCommand().apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeReplicationTaskAssessmentResultsCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeReplicationTaskAssessmentResults(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-replication-task-assessment-results")
				.argument("replication-task-arn", replicationTaskArn)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeReplicationTasks(init: AWSDatabaseMigrationServiceDescribeReplicationTasksCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeReplicationTasksCommand().apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeReplicationTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeReplicationTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-replication-tasks")
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeSchemas(endpointArn: String, init: AWSDatabaseMigrationServiceDescribeSchemasCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeSchemasCommand(endpointArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeSchemasCommand(val endpointArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest> {

	var maxRecords: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest()
		input.setEndpointArn(this.endpointArn)
		input.setMaxRecords(this.maxRecords)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeSchemas(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-schemas")
				.argument("endpoint-arn", endpointArn)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
	}

}


fun AWSDatabaseMigrationServiceFunctions.describeTableStatistics(replicationTaskArn: String, init: AWSDatabaseMigrationServiceDescribeTableStatisticsCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceDescribeTableStatisticsCommand(replicationTaskArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceDescribeTableStatisticsCommand(val replicationTaskArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.describeTableStatistics(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms describe-table-statistics")
				.argument("replication-task-arn", replicationTaskArn)
				.argument("max-records", maxRecords?.toString())
				.argument("marker", marker)
				.argument("filters", filters?.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.importCertificate(certificateIdentifier: String, init: AWSDatabaseMigrationServiceImportCertificateCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceImportCertificateCommand(certificateIdentifier).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceImportCertificateCommand(val certificateIdentifier: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.ImportCertificateRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.importCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms import-certificate")
				.argument("certificate-identifier", certificateIdentifier)
				.argument("certificate-pem", certificatePem)
				.argument("certificate-wallet", certificateWallet?.toString())
				.argument("tags", tags?.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.listTagsForResource(resourceArn: String, init: AWSDatabaseMigrationServiceListTagsForResourceCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceListTagsForResourceCommand(resourceArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceListTagsForResourceCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms list-tags-for-resource")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.modifyEndpoint(endpointArn: String, init: AWSDatabaseMigrationServiceModifyEndpointCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceModifyEndpointCommand(endpointArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceModifyEndpointCommand(val endpointArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.ModifyEndpointRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.modifyEndpoint(build())
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


fun AWSDatabaseMigrationServiceFunctions.modifyEventSubscription(subscriptionName: String, init: AWSDatabaseMigrationServiceModifyEventSubscriptionCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceModifyEventSubscriptionCommand(subscriptionName).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceModifyEventSubscriptionCommand(val subscriptionName: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.modifyEventSubscription(build())
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


fun AWSDatabaseMigrationServiceFunctions.modifyReplicationInstance(replicationInstanceArn: String, init: AWSDatabaseMigrationServiceModifyReplicationInstanceCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceModifyReplicationInstanceCommand(replicationInstanceArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceModifyReplicationInstanceCommand(val replicationInstanceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.modifyReplicationInstance(build())
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


fun AWSDatabaseMigrationServiceFunctions.modifyReplicationSubnetGroup(replicationSubnetGroupIdentifier: String, subnetIds: List<String>, init: AWSDatabaseMigrationServiceModifyReplicationSubnetGroupCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceModifyReplicationSubnetGroupCommand(replicationSubnetGroupIdentifier, subnetIds).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceModifyReplicationSubnetGroupCommand(val replicationSubnetGroupIdentifier: String, val subnetIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest> {

	var replicationSubnetGroupDescription: String? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest()
		input.setReplicationSubnetGroupIdentifier(this.replicationSubnetGroupIdentifier)
		input.setReplicationSubnetGroupDescription(this.replicationSubnetGroupDescription)
		input.setSubnetIds(this.subnetIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.modifyReplicationSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms modify-replication-subnet-group")
				.argument("replication-subnet-group-identifier", replicationSubnetGroupIdentifier)
				.argument("replication-subnet-group-description", replicationSubnetGroupDescription)
				.argument("subnet-ids", subnetIds.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.modifyReplicationTask(replicationTaskArn: String, init: AWSDatabaseMigrationServiceModifyReplicationTaskCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceModifyReplicationTaskCommand(replicationTaskArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceModifyReplicationTaskCommand(val replicationTaskArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.modifyReplicationTask(build())
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


fun AWSDatabaseMigrationServiceFunctions.rebootReplicationInstance(replicationInstanceArn: String, init: AWSDatabaseMigrationServiceRebootReplicationInstanceCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceRebootReplicationInstanceCommand(replicationInstanceArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceRebootReplicationInstanceCommand(val replicationInstanceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest> {

	var forceFailover: Boolean? = false

	override fun build(): com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest()
		input.setReplicationInstanceArn(this.replicationInstanceArn)
		input.setForceFailover(this.forceFailover)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.rebootReplicationInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms reboot-replication-instance")
				.argument("replication-instance-arn", replicationInstanceArn)
				.option("force-failover", forceFailover ?: false)
	}

}


fun AWSDatabaseMigrationServiceFunctions.refreshSchemas(endpointArn: String, replicationInstanceArn: String, init: AWSDatabaseMigrationServiceRefreshSchemasCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceRefreshSchemasCommand(endpointArn, replicationInstanceArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceRefreshSchemasCommand(val endpointArn: String, val replicationInstanceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest()
		input.setEndpointArn(this.endpointArn)
		input.setReplicationInstanceArn(this.replicationInstanceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.refreshSchemas(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms refresh-schemas")
				.argument("endpoint-arn", endpointArn)
				.argument("replication-instance-arn", replicationInstanceArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.reloadTables(replicationTaskArn: String, tablesToReload: List<com.amazonaws.services.databasemigrationservice.model.TableToReload>, init: AWSDatabaseMigrationServiceReloadTablesCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceReloadTablesCommand(replicationTaskArn, tablesToReload).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceReloadTablesCommand(val replicationTaskArn: String, val tablesToReload: List<com.amazonaws.services.databasemigrationservice.model.TableToReload>) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest()
		input.setReplicationTaskArn(this.replicationTaskArn)
		input.setTablesToReload(this.tablesToReload)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.reloadTables(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms reload-tables")
				.argument("replication-task-arn", replicationTaskArn)
				.argument("tables-to-reload", tablesToReload.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.removeTagsFromResource(resourceArn: String, tagKeys: List<String>, init: AWSDatabaseMigrationServiceRemoveTagsFromResourceCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceRemoveTagsFromResourceCommand(resourceArn, tagKeys).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceRemoveTagsFromResourceCommand(val resourceArn: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.removeTagsFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms remove-tags-from-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.startReplicationTask(replicationTaskArn: String, startReplicationTaskType: StartReplicationTaskTypeValue, init: AWSDatabaseMigrationServiceStartReplicationTaskCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceStartReplicationTaskCommand(replicationTaskArn, startReplicationTaskType).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceStartReplicationTaskCommand(val replicationTaskArn: String, val startReplicationTaskType: StartReplicationTaskTypeValue) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest> {

	var cdcStartTime: java.util.Date? = null

	override fun build(): com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest()
		input.setReplicationTaskArn(this.replicationTaskArn)
		input.setStartReplicationTaskType(this.startReplicationTaskType.toString())
		input.setCdcStartTime(this.cdcStartTime)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.startReplicationTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms start-replication-task")
				.argument("replication-task-arn", replicationTaskArn)
				.argument("start-replication-task-type", startReplicationTaskType.toString())
				.argument("cdc-start-time", cdcStartTime?.toString())
	}

}


fun AWSDatabaseMigrationServiceFunctions.startReplicationTaskAssessment(replicationTaskArn: String, init: AWSDatabaseMigrationServiceStartReplicationTaskAssessmentCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceStartReplicationTaskAssessmentCommand(replicationTaskArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceStartReplicationTaskAssessmentCommand(val replicationTaskArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest()
		input.setReplicationTaskArn(this.replicationTaskArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.startReplicationTaskAssessment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms start-replication-task-assessment")
				.argument("replication-task-arn", replicationTaskArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.stopReplicationTask(replicationTaskArn: String, init: AWSDatabaseMigrationServiceStopReplicationTaskCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceStopReplicationTaskCommand(replicationTaskArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceStopReplicationTaskCommand(val replicationTaskArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest()
		input.setReplicationTaskArn(this.replicationTaskArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.stopReplicationTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms stop-replication-task")
				.argument("replication-task-arn", replicationTaskArn)
	}

}


fun AWSDatabaseMigrationServiceFunctions.testConnection(replicationInstanceArn: String, endpointArn: String, init: AWSDatabaseMigrationServiceTestConnectionCommand.() -> Unit) {
	this.block.declare(AWSDatabaseMigrationServiceTestConnectionCommand(replicationInstanceArn, endpointArn).apply(init))
}

@Generated
class AWSDatabaseMigrationServiceTestConnectionCommand(val replicationInstanceArn: String, val endpointArn: String) : AmazonWebServiceCommand<com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest> {



	override fun build(): com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest {
		val input = com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest()
		input.setReplicationInstanceArn(this.replicationInstanceArn)
		input.setEndpointArn(this.endpointArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dms.testConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dms test-connection")
				.argument("replication-instance-arn", replicationInstanceArn)
				.argument("endpoint-arn", endpointArn)
	}

}
