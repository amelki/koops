
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.cognitosync.*
import com.amazonaws.services.cognitosync.model.*

var codingue.koops.core.Environment.cognito_sync: AmazonCognitoSync
	get() {
		var service = this.capabilities["aws-cognito_sync"]
		if (service == null) {
			service = AmazonCognitoSyncClientBuilder.standard().build()
			this.capabilities["aws-cognito_sync"] = service
		}
		return service as AmazonCognitoSync
	}
	set(cognito_sync) {
		this.capabilities["aws-cognito_sync"] = cognito_sync
	}

@Generated
class AmazonCognitoSyncFunctions(val block: Block)

infix fun <T> AwsContinuation.cognito_sync(init: AmazonCognitoSyncFunctions.() -> T): T {
	return AmazonCognitoSyncFunctions(shell).run(init)
}

			

fun AmazonCognitoSyncFunctions.bulkPublish(identityPoolId: String, init: AmazonCognitoSyncBulkPublishCommand.() -> Unit): com.amazonaws.services.cognitosync.model.BulkPublishResult {
	return this.block.declare(AmazonCognitoSyncBulkPublishCommand(identityPoolId).apply(init)) as com.amazonaws.services.cognitosync.model.BulkPublishResult
}

@Generated
class AmazonCognitoSyncBulkPublishCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.BulkPublishRequest, com.amazonaws.services.cognitosync.model.BulkPublishResult> {



	override fun build(): com.amazonaws.services.cognitosync.model.BulkPublishRequest {
		val input = com.amazonaws.services.cognitosync.model.BulkPublishRequest()
		input.setIdentityPoolId(this.identityPoolId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.BulkPublishResult {
	  return com.amazonaws.services.cognitosync.model.BulkPublishResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.BulkPublishResult {
		return environment.cognito_sync.bulkPublish(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync bulk-publish")
				.argument("identity-pool-id", identityPoolId)
	}

}


fun AmazonCognitoSyncFunctions.deleteDataset(identityPoolId: String, identityId: String, datasetName: String, init: AmazonCognitoSyncDeleteDatasetCommand.() -> Unit): com.amazonaws.services.cognitosync.model.DeleteDatasetResult {
	return this.block.declare(AmazonCognitoSyncDeleteDatasetCommand(identityPoolId, identityId, datasetName).apply(init)) as com.amazonaws.services.cognitosync.model.DeleteDatasetResult
}

@Generated
class AmazonCognitoSyncDeleteDatasetCommand(val identityPoolId: String, val identityId: String, val datasetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.DeleteDatasetRequest, com.amazonaws.services.cognitosync.model.DeleteDatasetResult> {



	override fun build(): com.amazonaws.services.cognitosync.model.DeleteDatasetRequest {
		val input = com.amazonaws.services.cognitosync.model.DeleteDatasetRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		input.setDatasetName(this.datasetName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.DeleteDatasetResult {
	  return com.amazonaws.services.cognitosync.model.DeleteDatasetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.DeleteDatasetResult {
		return environment.cognito_sync.deleteDataset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync delete-dataset")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
				.argument("dataset-name", datasetName)
	}

}


fun AmazonCognitoSyncFunctions.describeDataset(identityPoolId: String, identityId: String, datasetName: String, init: AmazonCognitoSyncDescribeDatasetCommand.() -> Unit): com.amazonaws.services.cognitosync.model.DescribeDatasetResult {
	return this.block.declare(AmazonCognitoSyncDescribeDatasetCommand(identityPoolId, identityId, datasetName).apply(init)) as com.amazonaws.services.cognitosync.model.DescribeDatasetResult
}

@Generated
class AmazonCognitoSyncDescribeDatasetCommand(val identityPoolId: String, val identityId: String, val datasetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.DescribeDatasetRequest, com.amazonaws.services.cognitosync.model.DescribeDatasetResult> {



	override fun build(): com.amazonaws.services.cognitosync.model.DescribeDatasetRequest {
		val input = com.amazonaws.services.cognitosync.model.DescribeDatasetRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		input.setDatasetName(this.datasetName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.DescribeDatasetResult {
	  return com.amazonaws.services.cognitosync.model.DescribeDatasetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.DescribeDatasetResult {
		return environment.cognito_sync.describeDataset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync describe-dataset")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
				.argument("dataset-name", datasetName)
	}

}


fun AmazonCognitoSyncFunctions.describeIdentityPoolUsage(identityPoolId: String, init: AmazonCognitoSyncDescribeIdentityPoolUsageCommand.() -> Unit): com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageResult {
	return this.block.declare(AmazonCognitoSyncDescribeIdentityPoolUsageCommand(identityPoolId).apply(init)) as com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageResult
}

@Generated
class AmazonCognitoSyncDescribeIdentityPoolUsageCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest, com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageResult> {



	override fun build(): com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest {
		val input = com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageRequest()
		input.setIdentityPoolId(this.identityPoolId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageResult {
	  return com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.DescribeIdentityPoolUsageResult {
		return environment.cognito_sync.describeIdentityPoolUsage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync describe-identity-pool-usage")
				.argument("identity-pool-id", identityPoolId)
	}

}


fun AmazonCognitoSyncFunctions.describeIdentityUsage(identityPoolId: String, identityId: String, init: AmazonCognitoSyncDescribeIdentityUsageCommand.() -> Unit): com.amazonaws.services.cognitosync.model.DescribeIdentityUsageResult {
	return this.block.declare(AmazonCognitoSyncDescribeIdentityUsageCommand(identityPoolId, identityId).apply(init)) as com.amazonaws.services.cognitosync.model.DescribeIdentityUsageResult
}

@Generated
class AmazonCognitoSyncDescribeIdentityUsageCommand(val identityPoolId: String, val identityId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest, com.amazonaws.services.cognitosync.model.DescribeIdentityUsageResult> {



	override fun build(): com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest {
		val input = com.amazonaws.services.cognitosync.model.DescribeIdentityUsageRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.DescribeIdentityUsageResult {
	  return com.amazonaws.services.cognitosync.model.DescribeIdentityUsageResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.DescribeIdentityUsageResult {
		return environment.cognito_sync.describeIdentityUsage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync describe-identity-usage")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
	}

}


fun AmazonCognitoSyncFunctions.getBulkPublishDetails(identityPoolId: String, init: AmazonCognitoSyncGetBulkPublishDetailsCommand.() -> Unit): com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsResult {
	return this.block.declare(AmazonCognitoSyncGetBulkPublishDetailsCommand(identityPoolId).apply(init)) as com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsResult
}

@Generated
class AmazonCognitoSyncGetBulkPublishDetailsCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest, com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsResult> {



	override fun build(): com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest {
		val input = com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsRequest()
		input.setIdentityPoolId(this.identityPoolId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsResult {
	  return com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.GetBulkPublishDetailsResult {
		return environment.cognito_sync.getBulkPublishDetails(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync get-bulk-publish-details")
				.argument("identity-pool-id", identityPoolId)
	}

}


fun AmazonCognitoSyncFunctions.getCognitoEvents(identityPoolId: String, init: AmazonCognitoSyncGetCognitoEventsCommand.() -> Unit): com.amazonaws.services.cognitosync.model.GetCognitoEventsResult {
	return this.block.declare(AmazonCognitoSyncGetCognitoEventsCommand(identityPoolId).apply(init)) as com.amazonaws.services.cognitosync.model.GetCognitoEventsResult
}

@Generated
class AmazonCognitoSyncGetCognitoEventsCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest, com.amazonaws.services.cognitosync.model.GetCognitoEventsResult> {



	override fun build(): com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest {
		val input = com.amazonaws.services.cognitosync.model.GetCognitoEventsRequest()
		input.setIdentityPoolId(this.identityPoolId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.GetCognitoEventsResult {
	  return com.amazonaws.services.cognitosync.model.GetCognitoEventsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.GetCognitoEventsResult {
		return environment.cognito_sync.getCognitoEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync get-cognito-events")
				.argument("identity-pool-id", identityPoolId)
	}

}


fun AmazonCognitoSyncFunctions.getIdentityPoolConfiguration(identityPoolId: String, init: AmazonCognitoSyncGetIdentityPoolConfigurationCommand.() -> Unit): com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationResult {
	return this.block.declare(AmazonCognitoSyncGetIdentityPoolConfigurationCommand(identityPoolId).apply(init)) as com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationResult
}

@Generated
class AmazonCognitoSyncGetIdentityPoolConfigurationCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest, com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationResult> {



	override fun build(): com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest {
		val input = com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationRequest()
		input.setIdentityPoolId(this.identityPoolId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationResult {
	  return com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.GetIdentityPoolConfigurationResult {
		return environment.cognito_sync.getIdentityPoolConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync get-identity-pool-configuration")
				.argument("identity-pool-id", identityPoolId)
	}

}


fun AmazonCognitoSyncFunctions.listDatasets(identityPoolId: String, identityId: String, init: AmazonCognitoSyncListDatasetsCommand.() -> Unit): com.amazonaws.services.cognitosync.model.ListDatasetsResult {
	return this.block.declare(AmazonCognitoSyncListDatasetsCommand(identityPoolId, identityId).apply(init)) as com.amazonaws.services.cognitosync.model.ListDatasetsResult
}

@Generated
class AmazonCognitoSyncListDatasetsCommand(val identityPoolId: String, val identityId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.ListDatasetsRequest, com.amazonaws.services.cognitosync.model.ListDatasetsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.ListDatasetsResult {
	  return com.amazonaws.services.cognitosync.model.ListDatasetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.ListDatasetsResult {
		return environment.cognito_sync.listDatasets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync list-datasets")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCognitoSyncFunctions.listIdentityPoolUsage(init: AmazonCognitoSyncListIdentityPoolUsageCommand.() -> Unit): com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageResult {
	return this.block.declare(AmazonCognitoSyncListIdentityPoolUsageCommand().apply(init)) as com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageResult
}

@Generated
class AmazonCognitoSyncListIdentityPoolUsageCommand() : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest, com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest {
		val input = com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageResult {
	  return com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.ListIdentityPoolUsageResult {
		return environment.cognito_sync.listIdentityPoolUsage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync list-identity-pool-usage")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCognitoSyncFunctions.listRecords(identityPoolId: String, identityId: String, datasetName: String, init: AmazonCognitoSyncListRecordsCommand.() -> Unit): com.amazonaws.services.cognitosync.model.ListRecordsResult {
	return this.block.declare(AmazonCognitoSyncListRecordsCommand(identityPoolId, identityId, datasetName).apply(init)) as com.amazonaws.services.cognitosync.model.ListRecordsResult
}

@Generated
class AmazonCognitoSyncListRecordsCommand(val identityPoolId: String, val identityId: String, val datasetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.ListRecordsRequest, com.amazonaws.services.cognitosync.model.ListRecordsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.ListRecordsResult {
	  return com.amazonaws.services.cognitosync.model.ListRecordsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.ListRecordsResult {
		return environment.cognito_sync.listRecords(build())
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


fun AmazonCognitoSyncFunctions.registerDevice(identityPoolId: String, identityId: String, platform: Platform, token: String, init: AmazonCognitoSyncRegisterDeviceCommand.() -> Unit): com.amazonaws.services.cognitosync.model.RegisterDeviceResult {
	return this.block.declare(AmazonCognitoSyncRegisterDeviceCommand(identityPoolId, identityId, platform, token).apply(init)) as com.amazonaws.services.cognitosync.model.RegisterDeviceResult
}

@Generated
class AmazonCognitoSyncRegisterDeviceCommand(val identityPoolId: String, val identityId: String, val platform: Platform, val token: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.RegisterDeviceRequest, com.amazonaws.services.cognitosync.model.RegisterDeviceResult> {



	override fun build(): com.amazonaws.services.cognitosync.model.RegisterDeviceRequest {
		val input = com.amazonaws.services.cognitosync.model.RegisterDeviceRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		input.setPlatform(this.platform.toString())
		input.setToken(this.token)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.RegisterDeviceResult {
	  return com.amazonaws.services.cognitosync.model.RegisterDeviceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.RegisterDeviceResult {
		return environment.cognito_sync.registerDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync register-device")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
				.argument("platform", platform.toString())
				.argument("token", token)
	}

}


fun AmazonCognitoSyncFunctions.setCognitoEvents(identityPoolId: String, events: Map<String, String>, init: AmazonCognitoSyncSetCognitoEventsCommand.() -> Unit): com.amazonaws.services.cognitosync.model.SetCognitoEventsResult {
	return this.block.declare(AmazonCognitoSyncSetCognitoEventsCommand(identityPoolId, events).apply(init)) as com.amazonaws.services.cognitosync.model.SetCognitoEventsResult
}

@Generated
class AmazonCognitoSyncSetCognitoEventsCommand(val identityPoolId: String, val events: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest, com.amazonaws.services.cognitosync.model.SetCognitoEventsResult> {



	override fun build(): com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest {
		val input = com.amazonaws.services.cognitosync.model.SetCognitoEventsRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setEvents(this.events)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.SetCognitoEventsResult {
	  return com.amazonaws.services.cognitosync.model.SetCognitoEventsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.SetCognitoEventsResult {
		return environment.cognito_sync.setCognitoEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync set-cognito-events")
				.argument("identity-pool-id", identityPoolId)
				.argument("events", events.toString())
	}

}


fun AmazonCognitoSyncFunctions.setIdentityPoolConfiguration(identityPoolId: String, init: AmazonCognitoSyncSetIdentityPoolConfigurationCommand.() -> Unit): com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationResult {
	return this.block.declare(AmazonCognitoSyncSetIdentityPoolConfigurationCommand(identityPoolId).apply(init)) as com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationResult
}

@Generated
class AmazonCognitoSyncSetIdentityPoolConfigurationCommand(val identityPoolId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest, com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationResult> {

	var pushSync: com.amazonaws.services.cognitosync.model.PushSync? = null
	var cognitoStreams: com.amazonaws.services.cognitosync.model.CognitoStreams? = null

	override fun build(): com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest {
		val input = com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setPushSync(this.pushSync)
		input.setCognitoStreams(this.cognitoStreams)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationResult {
	  return com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.SetIdentityPoolConfigurationResult {
		return environment.cognito_sync.setIdentityPoolConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync set-identity-pool-configuration")
				.argument("identity-pool-id", identityPoolId)
				.argument("push-sync", pushSync?.toString())
				.argument("cognito-streams", cognitoStreams?.toString())
	}

}


fun AmazonCognitoSyncFunctions.subscribeToDataset(identityPoolId: String, identityId: String, datasetName: String, deviceId: String, init: AmazonCognitoSyncSubscribeToDatasetCommand.() -> Unit): com.amazonaws.services.cognitosync.model.SubscribeToDatasetResult {
	return this.block.declare(AmazonCognitoSyncSubscribeToDatasetCommand(identityPoolId, identityId, datasetName, deviceId).apply(init)) as com.amazonaws.services.cognitosync.model.SubscribeToDatasetResult
}

@Generated
class AmazonCognitoSyncSubscribeToDatasetCommand(val identityPoolId: String, val identityId: String, val datasetName: String, val deviceId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest, com.amazonaws.services.cognitosync.model.SubscribeToDatasetResult> {



	override fun build(): com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest {
		val input = com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		input.setDatasetName(this.datasetName)
		input.setDeviceId(this.deviceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.SubscribeToDatasetResult {
	  return com.amazonaws.services.cognitosync.model.SubscribeToDatasetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.SubscribeToDatasetResult {
		return environment.cognito_sync.subscribeToDataset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync subscribe-to-dataset")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
				.argument("dataset-name", datasetName)
				.argument("device-id", deviceId)
	}

}


fun AmazonCognitoSyncFunctions.unsubscribeFromDataset(identityPoolId: String, identityId: String, datasetName: String, deviceId: String, init: AmazonCognitoSyncUnsubscribeFromDatasetCommand.() -> Unit): com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult {
	return this.block.declare(AmazonCognitoSyncUnsubscribeFromDatasetCommand(identityPoolId, identityId, datasetName, deviceId).apply(init)) as com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult
}

@Generated
class AmazonCognitoSyncUnsubscribeFromDatasetCommand(val identityPoolId: String, val identityId: String, val datasetName: String, val deviceId: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest, com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult> {



	override fun build(): com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest {
		val input = com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest()
		input.setIdentityPoolId(this.identityPoolId)
		input.setIdentityId(this.identityId)
		input.setDatasetName(this.datasetName)
		input.setDeviceId(this.deviceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult {
	  return com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetResult {
		return environment.cognito_sync.unsubscribeFromDataset(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cognito-sync unsubscribe-from-dataset")
				.argument("identity-pool-id", identityPoolId)
				.argument("identity-id", identityId)
				.argument("dataset-name", datasetName)
				.argument("device-id", deviceId)
	}

}


fun AmazonCognitoSyncFunctions.updateRecords(identityPoolId: String, identityId: String, datasetName: String, syncSessionToken: String, init: AmazonCognitoSyncUpdateRecordsCommand.() -> Unit): com.amazonaws.services.cognitosync.model.UpdateRecordsResult {
	return this.block.declare(AmazonCognitoSyncUpdateRecordsCommand(identityPoolId, identityId, datasetName, syncSessionToken).apply(init)) as com.amazonaws.services.cognitosync.model.UpdateRecordsResult
}

@Generated
class AmazonCognitoSyncUpdateRecordsCommand(val identityPoolId: String, val identityId: String, val datasetName: String, val syncSessionToken: String) : AmazonWebServiceCommand<com.amazonaws.services.cognitosync.model.UpdateRecordsRequest, com.amazonaws.services.cognitosync.model.UpdateRecordsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cognitosync.model.UpdateRecordsResult {
	  return com.amazonaws.services.cognitosync.model.UpdateRecordsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cognitosync.model.UpdateRecordsResult {
		return environment.cognito_sync.updateRecords(build())
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
