
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.cognitosync.AmazonCognitoSync
import com.amazonaws.services.cognitosync.model.*

var codingue.koops.core.Environment.cognito_sync: AmazonCognitoSync
	get() = this.capabilities[AmazonCognitoSync::class.java.name] as AmazonCognitoSync
	set(cognito_sync) {
		this.capabilities[AmazonCognitoSync::class.java.name] = cognito_sync
	}

@Generated
class AmazonCognitoSyncFunctions(val block: Block)

infix fun AwsContinuation.cognito_sync(init: AmazonCognitoSyncFunctions.() -> Unit) {
	AmazonCognitoSyncFunctions(shell).apply(init)
}

			

fun AmazonCognitoSyncFunctions.bulkPublish(identityPoolId: String, init: AmazonCognitoSyncBulkPublishCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncBulkPublishCommand(identityPoolId).apply(init))
}

@Generated
class AmazonCognitoSyncBulkPublishCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.BulkPublishRequest> {



	override fun build(): com.amazonaws.services.cognitosync.model.BulkPublishRequest {
		val input = com.amazonaws.services.cognitosync.model.BulkPublishRequest()
		input.setIdentityPoolId(this.identityPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.bulkPublish(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync bulk-publish")
				.argument("identity-pool-id", identityPoolId)
	}

}


fun AmazonCognitoSyncFunctions.deleteDataset(identityPoolId: String, identityId: String, datasetName: String, init: AmazonCognitoSyncDeleteDatasetCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncDeleteDatasetCommand(identityPoolId, identityId, datasetName).apply(init))
}

@Generated
class AmazonCognitoSyncDeleteDatasetCommand(val identityPoolId: String, val identityId: String, val datasetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.DeleteDatasetRequest> {



	override fun build(): com.amazonaws.services.cognitosync.model.DeleteDatasetRequest {
		val input = com.amazonaws.services.cognitosync.model.DeleteDatasetRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		input.setDatasetName(this.datasetName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.deleteDataset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync delete-dataset")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
				.argument("dataset-name", datasetName)
	}

}


fun AmazonCognitoSyncFunctions.describeDataset(identityPoolId: String, identityId: String, datasetName: String, init: AmazonCognitoSyncDescribeDatasetCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncDescribeDatasetCommand(identityPoolId, identityId, datasetName).apply(init))
}

@Generated
class AmazonCognitoSyncDescribeDatasetCommand(val identityPoolId: String, val identityId: String, val datasetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.DescribeDatasetRequest> {



	override fun build(): com.amazonaws.services.cognitosync.model.DescribeDatasetRequest {
		val input = com.amazonaws.services.cognitosync.model.DescribeDatasetRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		input.setDatasetName(this.datasetName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.describeDataset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync describe-dataset")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
				.argument("dataset-name", datasetName)
	}

}


fun AmazonCognitoSyncFunctions.describeIdentityPoolUsage(identityPoolId: String, init: AmazonCognitoSyncDescribeIdentityPoolUsageCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncDescribeIdentityPoolUsageCommand(identityPoolId).apply(init))
}

@Generated
class AmazonCognitoSyncDescribeIdentityPoolUsageCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest> {



	override fun build(): com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest {
		val input = com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest()
		input.setIdentityPoolId(this.identityPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.describeIdentityPoolUsage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync describe-identity-pool-usage")
				.argument("identity-pool-id", identityPoolId)
	}

}


fun AmazonCognitoSyncFunctions.describeIdentityUsage(identityPoolId: String, identityId: String, init: AmazonCognitoSyncDescribeIdentityUsageCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncDescribeIdentityUsageCommand(identityPoolId, identityId).apply(init))
}

@Generated
class AmazonCognitoSyncDescribeIdentityUsageCommand(val identityPoolId: String, val identityId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest> {



	override fun build(): com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest {
		val input = com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.describeIdentityUsage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync describe-identity-usage")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
	}

}


fun AmazonCognitoSyncFunctions.getBulkPublishDetails(identityPoolId: String, init: AmazonCognitoSyncGetBulkPublishDetailsCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncGetBulkPublishDetailsCommand(identityPoolId).apply(init))
}

@Generated
class AmazonCognitoSyncGetBulkPublishDetailsCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest> {



	override fun build(): com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest {
		val input = com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest()
		input.setIdentityPoolId(this.identityPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.getBulkPublishDetails(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync get-bulk-publish-details")
				.argument("identity-pool-id", identityPoolId)
	}

}


fun AmazonCognitoSyncFunctions.getCognitoEvents(identityPoolId: String, init: AmazonCognitoSyncGetCognitoEventsCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncGetCognitoEventsCommand(identityPoolId).apply(init))
}

@Generated
class AmazonCognitoSyncGetCognitoEventsCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest> {



	override fun build(): com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest {
		val input = com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest()
		input.setIdentityPoolId(this.identityPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.getCognitoEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync get-cognito-events")
				.argument("identity-pool-id", identityPoolId)
	}

}


fun AmazonCognitoSyncFunctions.getIdentityPoolConfiguration(identityPoolId: String, init: AmazonCognitoSyncGetIdentityPoolConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncGetIdentityPoolConfigurationCommand(identityPoolId).apply(init))
}

@Generated
class AmazonCognitoSyncGetIdentityPoolConfigurationCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest> {



	override fun build(): com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest {
		val input = com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest()
		input.setIdentityPoolId(this.identityPoolId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.getIdentityPoolConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync get-identity-pool-configuration")
				.argument("identity-pool-id", identityPoolId)
	}

}


fun AmazonCognitoSyncFunctions.listDatasets(identityPoolId: String, identityId: String, init: AmazonCognitoSyncListDatasetsCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncListDatasetsCommand(identityPoolId, identityId).apply(init))
}

@Generated
class AmazonCognitoSyncListDatasetsCommand(val identityPoolId: String, val identityId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.ListDatasetsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.cognitosync.model.ListDatasetsRequest {
		val input = com.amazonaws.services.cognitosync.model.ListDatasetsRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.listDatasets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync list-datasets")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCognitoSyncFunctions.listIdentityPoolUsage(init: AmazonCognitoSyncListIdentityPoolUsageCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncListIdentityPoolUsageCommand().apply(init))
}

@Generated
class AmazonCognitoSyncListIdentityPoolUsageCommand() : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest {
		val input = com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.listIdentityPoolUsage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync list-identity-pool-usage")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCognitoSyncFunctions.listRecords(identityPoolId: String, identityId: String, datasetName: String, init: AmazonCognitoSyncListRecordsCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncListRecordsCommand(identityPoolId, identityId, datasetName).apply(init))
}

@Generated
class AmazonCognitoSyncListRecordsCommand(val identityPoolId: String, val identityId: String, val datasetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.ListRecordsRequest> {

	var lastSyncCount: Long? = 0L
	var nextToken: String? = null
	var maxResults: Int? = 0
	var syncSessionToken: String? = null

	override fun build(): com.amazonaws.services.cognitosync.model.ListRecordsRequest {
		val input = com.amazonaws.services.cognitosync.model.ListRecordsRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		input.setDatasetName(this.datasetName)
		input.setLastSyncCount(this.lastSyncCount)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setSyncSessionToken(this.syncSessionToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.listRecords(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync list-records")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
				.argument("dataset-name", datasetName)
				.argument("last-sync-count", lastSyncCount?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("sync-session-token", syncSessionToken)
	}

}


fun AmazonCognitoSyncFunctions.registerDevice(identityPoolId: String, identityId: String, platform: Platform, token: String, init: AmazonCognitoSyncRegisterDeviceCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncRegisterDeviceCommand(identityPoolId, identityId, platform, token).apply(init))
}

@Generated
class AmazonCognitoSyncRegisterDeviceCommand(val identityPoolId: String, val identityId: String, val platform: Platform, val token: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.RegisterDeviceRequest> {



	override fun build(): com.amazonaws.services.cognitosync.model.RegisterDeviceRequest {
		val input = com.amazonaws.services.cognitosync.model.RegisterDeviceRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		input.setPlatform(this.platform.toString())
		input.setToken(this.token)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.registerDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync register-device")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
				.argument("platform", platform.toString())
				.argument("token", token)
	}

}


fun AmazonCognitoSyncFunctions.setCognitoEvents(identityPoolId: String, events: Map<String, String>, init: AmazonCognitoSyncSetCognitoEventsCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncSetCognitoEventsCommand(identityPoolId, events).apply(init))
}

@Generated
class AmazonCognitoSyncSetCognitoEventsCommand(val identityPoolId: String, val events: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest> {



	override fun build(): com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest {
		val input = com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setEvents(this.events)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.setCognitoEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync set-cognito-events")
				.argument("identity-pool-id", identityPoolId)
				.argument("events", events.toString())
	}

}


fun AmazonCognitoSyncFunctions.setIdentityPoolConfiguration(identityPoolId: String, init: AmazonCognitoSyncSetIdentityPoolConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncSetIdentityPoolConfigurationCommand(identityPoolId).apply(init))
}

@Generated
class AmazonCognitoSyncSetIdentityPoolConfigurationCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest> {

	var pushSync: com.amazonaws.services.cognitosync.model.PushSync? = null
	var cognitoStreams: com.amazonaws.services.cognitosync.model.CognitoStreams? = null

	override fun build(): com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest {
		val input = com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setPushSync(this.pushSync)
		input.setCognitoStreams(this.cognitoStreams)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.setIdentityPoolConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync set-identity-pool-configuration")
				.argument("identity-pool-id", identityPoolId)
				.argument("push-sync", pushSync?.toString())
				.argument("cognito-streams", cognitoStreams?.toString())
	}

}


fun AmazonCognitoSyncFunctions.subscribeToDataset(identityPoolId: String, identityId: String, datasetName: String, deviceId: String, init: AmazonCognitoSyncSubscribeToDatasetCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncSubscribeToDatasetCommand(identityPoolId, identityId, datasetName, deviceId).apply(init))
}

@Generated
class AmazonCognitoSyncSubscribeToDatasetCommand(val identityPoolId: String, val identityId: String, val datasetName: String, val deviceId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest> {



	override fun build(): com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest {
		val input = com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		input.setDatasetName(this.datasetName)
		input.setDeviceId(this.deviceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.subscribeToDataset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync subscribe-to-dataset")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
				.argument("dataset-name", datasetName)
				.argument("device-id", deviceId)
	}

}


fun AmazonCognitoSyncFunctions.unsubscribeFromDataset(identityPoolId: String, identityId: String, datasetName: String, deviceId: String, init: AmazonCognitoSyncUnsubscribeFromDatasetCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncUnsubscribeFromDatasetCommand(identityPoolId, identityId, datasetName, deviceId).apply(init))
}

@Generated
class AmazonCognitoSyncUnsubscribeFromDatasetCommand(val identityPoolId: String, val identityId: String, val datasetName: String, val deviceId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest> {



	override fun build(): com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest {
		val input = com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		input.setDatasetName(this.datasetName)
		input.setDeviceId(this.deviceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.unsubscribeFromDataset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync unsubscribe-from-dataset")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
				.argument("dataset-name", datasetName)
				.argument("device-id", deviceId)
	}

}


fun AmazonCognitoSyncFunctions.updateRecords(identityPoolId: String, identityId: String, datasetName: String, syncSessionToken: String, init: AmazonCognitoSyncUpdateRecordsCommand.() -> Unit) {
	this.block.declare(AmazonCognitoSyncUpdateRecordsCommand(identityPoolId, identityId, datasetName, syncSessionToken).apply(init))
}

@Generated
class AmazonCognitoSyncUpdateRecordsCommand(val identityPoolId: String, val identityId: String, val datasetName: String, val syncSessionToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.UpdateRecordsRequest> {

	var deviceId: String? = null
	var recordPatches: List<com.amazonaws.services.cognitosync.model.RecordPatch>? = null
	var clientContext: String? = null

	override fun build(): com.amazonaws.services.cognitosync.model.UpdateRecordsRequest {
		val input = com.amazonaws.services.cognitosync.model.UpdateRecordsRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		input.setDatasetName(this.datasetName)
		input.setDeviceId(this.deviceId)
		input.setRecordPatches(this.recordPatches)
		input.setSyncSessionToken(this.syncSessionToken)
		input.setClientContext(this.clientContext)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cognito_sync.updateRecords(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync update-records")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
				.argument("dataset-name", datasetName)
				.argument("device-id", deviceId)
				.argument("record-patches", recordPatches?.toString())
				.argument("sync-session-token", syncSessionToken)
				.argument("client-context", clientContext)
	}

}
