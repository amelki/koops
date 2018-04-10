
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.config.AmazonConfig
import com.amazonaws.services.config.model.*

var codingue.koops.core.Environment.config: AmazonConfig
	get() = this.capabilities[AmazonConfig::class.java.name] as AmazonConfig
	set(config) {
		this.capabilities[AmazonConfig::class.java.name] = config
	}

@Generated
class AmazonConfigFunctions(val block: Block)

infix fun AwsContinuation.config(init: AmazonConfigFunctions.() -> Unit) {
	AmazonConfigFunctions(shell).apply(init)
}

			

fun AmazonConfigFunctions.batchGetResourceConfig(init: AmazonConfigBatchGetResourceConfigCommand.() -> Unit) {
	this.block.declare(AmazonConfigBatchGetResourceConfigCommand().apply(init))
}

@Generated
class AmazonConfigBatchGetResourceConfigCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.BatchGetResourceConfigRequest> {

	var resourceKeys: List<com.amazonaws.services.config.model.ResourceKey>? = null

	override fun build(): com.amazonaws.services.config.model.BatchGetResourceConfigRequest {
		val input = com.amazonaws.services.config.model.BatchGetResourceConfigRequest()
		input.setResourceKeys(this.resourceKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.batchGetResourceConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config batch-get-resource-config")
				.argument("resource-keys", resourceKeys?.toString())
	}

}


fun AmazonConfigFunctions.deleteAggregationAuthorization(authorizedAccountId: String, authorizedAwsRegion: String, init: AmazonConfigDeleteAggregationAuthorizationCommand.() -> Unit) {
	this.block.declare(AmazonConfigDeleteAggregationAuthorizationCommand(authorizedAccountId, authorizedAwsRegion).apply(init))
}

@Generated
class AmazonConfigDeleteAggregationAuthorizationCommand(val authorizedAccountId: String, val authorizedAwsRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest> {



	override fun build(): com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest {
		val input = com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest()
		input.setAuthorizedAccountId(this.authorizedAccountId)
		input.setAuthorizedAwsRegion(this.authorizedAwsRegion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.deleteAggregationAuthorization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config delete-aggregation-authorization")
				.argument("authorized-account-id", authorizedAccountId)
				.argument("authorized-aws-region", authorizedAwsRegion)
	}

}


fun AmazonConfigFunctions.deleteConfigRule(configRuleName: String, init: AmazonConfigDeleteConfigRuleCommand.() -> Unit) {
	this.block.declare(AmazonConfigDeleteConfigRuleCommand(configRuleName).apply(init))
}

@Generated
class AmazonConfigDeleteConfigRuleCommand(val configRuleName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DeleteConfigRuleRequest> {



	override fun build(): com.amazonaws.services.config.model.DeleteConfigRuleRequest {
		val input = com.amazonaws.services.config.model.DeleteConfigRuleRequest()
		input.setConfigRuleName(this.configRuleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.deleteConfigRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config delete-config-rule")
				.argument("config-rule-name", configRuleName)
	}

}


fun AmazonConfigFunctions.deleteConfigurationAggregator(configurationAggregatorName: String, init: AmazonConfigDeleteConfigurationAggregatorCommand.() -> Unit) {
	this.block.declare(AmazonConfigDeleteConfigurationAggregatorCommand(configurationAggregatorName).apply(init))
}

@Generated
class AmazonConfigDeleteConfigurationAggregatorCommand(val configurationAggregatorName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest> {



	override fun build(): com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest {
		val input = com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest()
		input.setConfigurationAggregatorName(this.configurationAggregatorName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.deleteConfigurationAggregator(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config delete-configuration-aggregator")
				.argument("configuration-aggregator-name", configurationAggregatorName)
	}

}


fun AmazonConfigFunctions.deleteConfigurationRecorder(configurationRecorderName: String, init: AmazonConfigDeleteConfigurationRecorderCommand.() -> Unit) {
	this.block.declare(AmazonConfigDeleteConfigurationRecorderCommand(configurationRecorderName).apply(init))
}

@Generated
class AmazonConfigDeleteConfigurationRecorderCommand(val configurationRecorderName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest> {



	override fun build(): com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest {
		val input = com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest()
		input.setConfigurationRecorderName(this.configurationRecorderName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.deleteConfigurationRecorder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config delete-configuration-recorder")
				.argument("configuration-recorder-name", configurationRecorderName)
	}

}


fun AmazonConfigFunctions.deleteDeliveryChannel(deliveryChannelName: String, init: AmazonConfigDeleteDeliveryChannelCommand.() -> Unit) {
	this.block.declare(AmazonConfigDeleteDeliveryChannelCommand(deliveryChannelName).apply(init))
}

@Generated
class AmazonConfigDeleteDeliveryChannelCommand(val deliveryChannelName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DeleteDeliveryChannelRequest> {



	override fun build(): com.amazonaws.services.config.model.DeleteDeliveryChannelRequest {
		val input = com.amazonaws.services.config.model.DeleteDeliveryChannelRequest()
		input.setDeliveryChannelName(this.deliveryChannelName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.deleteDeliveryChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config delete-delivery-channel")
				.argument("delivery-channel-name", deliveryChannelName)
	}

}


fun AmazonConfigFunctions.deleteEvaluationResults(configRuleName: String, init: AmazonConfigDeleteEvaluationResultsCommand.() -> Unit) {
	this.block.declare(AmazonConfigDeleteEvaluationResultsCommand(configRuleName).apply(init))
}

@Generated
class AmazonConfigDeleteEvaluationResultsCommand(val configRuleName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DeleteEvaluationResultsRequest> {



	override fun build(): com.amazonaws.services.config.model.DeleteEvaluationResultsRequest {
		val input = com.amazonaws.services.config.model.DeleteEvaluationResultsRequest()
		input.setConfigRuleName(this.configRuleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.deleteEvaluationResults(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config delete-evaluation-results")
				.argument("config-rule-name", configRuleName)
	}

}


fun AmazonConfigFunctions.deletePendingAggregationRequest(requesterAccountId: String, requesterAwsRegion: String, init: AmazonConfigDeletePendingAggregationRequestCommand.() -> Unit) {
	this.block.declare(AmazonConfigDeletePendingAggregationRequestCommand(requesterAccountId, requesterAwsRegion).apply(init))
}

@Generated
class AmazonConfigDeletePendingAggregationRequestCommand(val requesterAccountId: String, val requesterAwsRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest> {



	override fun build(): com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest {
		val input = com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest()
		input.setRequesterAccountId(this.requesterAccountId)
		input.setRequesterAwsRegion(this.requesterAwsRegion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.deletePendingAggregationRequest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config delete-pending-aggregation-request")
				.argument("requester-account-id", requesterAccountId)
				.argument("requester-aws-region", requesterAwsRegion)
	}

}


fun AmazonConfigFunctions.deliverConfigSnapshot(init: AmazonConfigDeliverConfigSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonConfigDeliverConfigSnapshotCommand().apply(init))
}

@Generated
class AmazonConfigDeliverConfigSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DeliverConfigSnapshotRequest> {

	var deliveryChannelName: String? = null

	override fun build(): com.amazonaws.services.config.model.DeliverConfigSnapshotRequest {
		val input = com.amazonaws.services.config.model.DeliverConfigSnapshotRequest()
		input.setDeliveryChannelName(this.deliveryChannelName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.deliverConfigSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config deliver-config-snapshot")
				.argument("delivery-channel-name", deliveryChannelName)
	}

}


fun AmazonConfigFunctions.describeAggregateComplianceByConfigRules(configurationAggregatorName: String, init: AmazonConfigDescribeAggregateComplianceByConfigRulesCommand.() -> Unit) {
	this.block.declare(AmazonConfigDescribeAggregateComplianceByConfigRulesCommand(configurationAggregatorName).apply(init))
}

@Generated
class AmazonConfigDescribeAggregateComplianceByConfigRulesCommand(val configurationAggregatorName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesRequest> {

	var filters: com.amazonaws.services.config.model.ConfigRuleComplianceFilters? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesRequest {
		val input = com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesRequest()
		input.setConfigurationAggregatorName(this.configurationAggregatorName)
		input.setFilters(this.filters)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.describeAggregateComplianceByConfigRules(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-aggregate-compliance-by-config-rules")
				.argument("configuration-aggregator-name", configurationAggregatorName)
				.argument("filters", filters?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.describeAggregationAuthorizations(init: AmazonConfigDescribeAggregationAuthorizationsCommand.() -> Unit) {
	this.block.declare(AmazonConfigDescribeAggregationAuthorizationsCommand().apply(init))
}

@Generated
class AmazonConfigDescribeAggregationAuthorizationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest> {

	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest {
		val input = com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest()
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.describeAggregationAuthorizations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-aggregation-authorizations")
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.describeComplianceByConfigRule(init: AmazonConfigDescribeComplianceByConfigRuleCommand.() -> Unit) {
	this.block.declare(AmazonConfigDescribeComplianceByConfigRuleCommand().apply(init))
}

@Generated
class AmazonConfigDescribeComplianceByConfigRuleCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeComplianceByConfigRuleRequest> {

	var configRuleNames: List<String>? = null
	var complianceTypes: List<ComplianceType>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.config.model.DescribeComplianceByConfigRuleRequest {
		val input = com.amazonaws.services.config.model.DescribeComplianceByConfigRuleRequest()
		input.setConfigRuleNames(this.configRuleNames)
		input.setComplianceTypes(this.complianceTypes?.map { it.toString() })
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.describeComplianceByConfigRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-compliance-by-config-rule")
				.argument("config-rule-names", configRuleNames?.toString())
				.argument("compliance-types", complianceTypes?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.describeComplianceByResource(init: AmazonConfigDescribeComplianceByResourceCommand.() -> Unit) {
	this.block.declare(AmazonConfigDescribeComplianceByResourceCommand().apply(init))
}

@Generated
class AmazonConfigDescribeComplianceByResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeComplianceByResourceRequest> {

	var resourceType: String? = null
	var resourceId: String? = null
	var complianceTypes: List<ComplianceType>? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.config.model.DescribeComplianceByResourceRequest {
		val input = com.amazonaws.services.config.model.DescribeComplianceByResourceRequest()
		input.setResourceType(this.resourceType)
		input.setResourceId(this.resourceId)
		input.setComplianceTypes(this.complianceTypes?.map { it.toString() })
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.describeComplianceByResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-compliance-by-resource")
				.argument("resource-type", resourceType)
				.argument("resource-id", resourceId)
				.argument("compliance-types", complianceTypes?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.describeConfigRuleEvaluationStatus(init: AmazonConfigDescribeConfigRuleEvaluationStatusCommand.() -> Unit) {
	this.block.declare(AmazonConfigDescribeConfigRuleEvaluationStatusCommand().apply(init))
}

@Generated
class AmazonConfigDescribeConfigRuleEvaluationStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusRequest> {

	var configRuleNames: List<String>? = null
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusRequest {
		val input = com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusRequest()
		input.setConfigRuleNames(this.configRuleNames)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.describeConfigRuleEvaluationStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-config-rule-evaluation-status")
				.argument("config-rule-names", configRuleNames?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AmazonConfigFunctions.describeConfigRules(init: AmazonConfigDescribeConfigRulesCommand.() -> Unit) {
	this.block.declare(AmazonConfigDescribeConfigRulesCommand().apply(init))
}

@Generated
class AmazonConfigDescribeConfigRulesCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeConfigRulesRequest> {

	var configRuleNames: List<String>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.config.model.DescribeConfigRulesRequest {
		val input = com.amazonaws.services.config.model.DescribeConfigRulesRequest()
		input.setConfigRuleNames(this.configRuleNames)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.describeConfigRules(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-config-rules")
				.argument("config-rule-names", configRuleNames?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.describeConfigurationAggregatorSourcesStatus(configurationAggregatorName: String, init: AmazonConfigDescribeConfigurationAggregatorSourcesStatusCommand.() -> Unit) {
	this.block.declare(AmazonConfigDescribeConfigurationAggregatorSourcesStatusCommand(configurationAggregatorName).apply(init))
}

@Generated
class AmazonConfigDescribeConfigurationAggregatorSourcesStatusCommand(val configurationAggregatorName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusRequest> {

	var updateStatus: List<AggregatedSourceStatusType>? = null
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusRequest {
		val input = com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusRequest()
		input.setConfigurationAggregatorName(this.configurationAggregatorName)
		input.setUpdateStatus(this.updateStatus?.map { it.toString() })
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.describeConfigurationAggregatorSourcesStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-configuration-aggregator-sources-status")
				.argument("configuration-aggregator-name", configurationAggregatorName)
				.argument("update-status", updateStatus?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AmazonConfigFunctions.describeConfigurationAggregators(init: AmazonConfigDescribeConfigurationAggregatorsCommand.() -> Unit) {
	this.block.declare(AmazonConfigDescribeConfigurationAggregatorsCommand().apply(init))
}

@Generated
class AmazonConfigDescribeConfigurationAggregatorsCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeConfigurationAggregatorsRequest> {

	var configurationAggregatorNames: List<String>? = null
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.config.model.DescribeConfigurationAggregatorsRequest {
		val input = com.amazonaws.services.config.model.DescribeConfigurationAggregatorsRequest()
		input.setConfigurationAggregatorNames(this.configurationAggregatorNames)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.describeConfigurationAggregators(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-configuration-aggregators")
				.argument("configuration-aggregator-names", configurationAggregatorNames?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AmazonConfigFunctions.describeConfigurationRecorderStatus(init: AmazonConfigDescribeConfigurationRecorderStatusCommand.() -> Unit) {
	this.block.declare(AmazonConfigDescribeConfigurationRecorderStatusCommand().apply(init))
}

@Generated
class AmazonConfigDescribeConfigurationRecorderStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest> {

	var configurationRecorderNames: List<String>? = null

	override fun build(): com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest {
		val input = com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest()
		input.setConfigurationRecorderNames(this.configurationRecorderNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.describeConfigurationRecorderStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-configuration-recorder-status")
				.argument("configuration-recorder-names", configurationRecorderNames?.toString())
	}

}


fun AmazonConfigFunctions.describeConfigurationRecorders(init: AmazonConfigDescribeConfigurationRecordersCommand.() -> Unit) {
	this.block.declare(AmazonConfigDescribeConfigurationRecordersCommand().apply(init))
}

@Generated
class AmazonConfigDescribeConfigurationRecordersCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest> {

	var configurationRecorderNames: List<String>? = null

	override fun build(): com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest {
		val input = com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest()
		input.setConfigurationRecorderNames(this.configurationRecorderNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.describeConfigurationRecorders(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-configuration-recorders")
				.argument("configuration-recorder-names", configurationRecorderNames?.toString())
	}

}


fun AmazonConfigFunctions.describeDeliveryChannelStatus(init: AmazonConfigDescribeDeliveryChannelStatusCommand.() -> Unit) {
	this.block.declare(AmazonConfigDescribeDeliveryChannelStatusCommand().apply(init))
}

@Generated
class AmazonConfigDescribeDeliveryChannelStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest> {

	var deliveryChannelNames: List<String>? = null

	override fun build(): com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest {
		val input = com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest()
		input.setDeliveryChannelNames(this.deliveryChannelNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.describeDeliveryChannelStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-delivery-channel-status")
				.argument("delivery-channel-names", deliveryChannelNames?.toString())
	}

}


fun AmazonConfigFunctions.describeDeliveryChannels(init: AmazonConfigDescribeDeliveryChannelsCommand.() -> Unit) {
	this.block.declare(AmazonConfigDescribeDeliveryChannelsCommand().apply(init))
}

@Generated
class AmazonConfigDescribeDeliveryChannelsCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest> {

	var deliveryChannelNames: List<String>? = null

	override fun build(): com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest {
		val input = com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest()
		input.setDeliveryChannelNames(this.deliveryChannelNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.describeDeliveryChannels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-delivery-channels")
				.argument("delivery-channel-names", deliveryChannelNames?.toString())
	}

}


fun AmazonConfigFunctions.describePendingAggregationRequests(init: AmazonConfigDescribePendingAggregationRequestsCommand.() -> Unit) {
	this.block.declare(AmazonConfigDescribePendingAggregationRequestsCommand().apply(init))
}

@Generated
class AmazonConfigDescribePendingAggregationRequestsCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest> {

	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest {
		val input = com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest()
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.describePendingAggregationRequests(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-pending-aggregation-requests")
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.getAggregateComplianceDetailsByConfigRule(configurationAggregatorName: String, configRuleName: String, accountId: String, awsRegion: String, init: AmazonConfigGetAggregateComplianceDetailsByConfigRuleCommand.() -> Unit) {
	this.block.declare(AmazonConfigGetAggregateComplianceDetailsByConfigRuleCommand(configurationAggregatorName, configRuleName, accountId, awsRegion).apply(init))
}

@Generated
class AmazonConfigGetAggregateComplianceDetailsByConfigRuleCommand(val configurationAggregatorName: String, val configRuleName: String, val accountId: String, val awsRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleRequest> {

	var complianceType: ComplianceType? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleRequest {
		val input = com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleRequest()
		input.setConfigurationAggregatorName(this.configurationAggregatorName)
		input.setConfigRuleName(this.configRuleName)
		input.setAccountId(this.accountId)
		input.setAwsRegion(this.awsRegion)
		input.setComplianceType(this.complianceType?.toString())
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.getAggregateComplianceDetailsByConfigRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config get-aggregate-compliance-details-by-config-rule")
				.argument("configuration-aggregator-name", configurationAggregatorName)
				.argument("config-rule-name", configRuleName)
				.argument("account-id", accountId)
				.argument("aws-region", awsRegion)
				.argument("compliance-type", complianceType?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.getAggregateConfigRuleComplianceSummary(configurationAggregatorName: String, init: AmazonConfigGetAggregateConfigRuleComplianceSummaryCommand.() -> Unit) {
	this.block.declare(AmazonConfigGetAggregateConfigRuleComplianceSummaryCommand(configurationAggregatorName).apply(init))
}

@Generated
class AmazonConfigGetAggregateConfigRuleComplianceSummaryCommand(val configurationAggregatorName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryRequest> {

	var filters: com.amazonaws.services.config.model.ConfigRuleComplianceSummaryFilters? = null
	var groupByKey: ConfigRuleComplianceSummaryGroupKey? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryRequest {
		val input = com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryRequest()
		input.setConfigurationAggregatorName(this.configurationAggregatorName)
		input.setFilters(this.filters)
		input.setGroupByKey(this.groupByKey?.toString())
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.getAggregateConfigRuleComplianceSummary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config get-aggregate-config-rule-compliance-summary")
				.argument("configuration-aggregator-name", configurationAggregatorName)
				.argument("filters", filters?.toString())
				.argument("group-by-key", groupByKey?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.getComplianceDetailsByConfigRule(configRuleName: String, init: AmazonConfigGetComplianceDetailsByConfigRuleCommand.() -> Unit) {
	this.block.declare(AmazonConfigGetComplianceDetailsByConfigRuleCommand(configRuleName).apply(init))
}

@Generated
class AmazonConfigGetComplianceDetailsByConfigRuleCommand(val configRuleName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleRequest> {

	var complianceTypes: List<ComplianceType>? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleRequest {
		val input = com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleRequest()
		input.setConfigRuleName(this.configRuleName)
		input.setComplianceTypes(this.complianceTypes?.map { it.toString() })
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.getComplianceDetailsByConfigRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config get-compliance-details-by-config-rule")
				.argument("config-rule-name", configRuleName)
				.argument("compliance-types", complianceTypes?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.getComplianceDetailsByResource(resourceType: String, resourceId: String, init: AmazonConfigGetComplianceDetailsByResourceCommand.() -> Unit) {
	this.block.declare(AmazonConfigGetComplianceDetailsByResourceCommand(resourceType, resourceId).apply(init))
}

@Generated
class AmazonConfigGetComplianceDetailsByResourceCommand(val resourceType: String, val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.GetComplianceDetailsByResourceRequest> {

	var complianceTypes: List<ComplianceType>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.config.model.GetComplianceDetailsByResourceRequest {
		val input = com.amazonaws.services.config.model.GetComplianceDetailsByResourceRequest()
		input.setResourceType(this.resourceType)
		input.setResourceId(this.resourceId)
		input.setComplianceTypes(this.complianceTypes?.map { it.toString() })
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.getComplianceDetailsByResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config get-compliance-details-by-resource")
				.argument("resource-type", resourceType)
				.argument("resource-id", resourceId)
				.argument("compliance-types", complianceTypes?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.getComplianceSummaryByConfigRule(init: AmazonConfigGetComplianceSummaryByConfigRuleCommand.() -> Unit) {
	this.block.declare(AmazonConfigGetComplianceSummaryByConfigRuleCommand().apply(init))
}

@Generated
class AmazonConfigGetComplianceSummaryByConfigRuleCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest> {



	override fun build(): com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest {
		val input = com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.getComplianceSummaryByConfigRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config get-compliance-summary-by-config-rule")

	}

}


fun AmazonConfigFunctions.getComplianceSummaryByResourceType(init: AmazonConfigGetComplianceSummaryByResourceTypeCommand.() -> Unit) {
	this.block.declare(AmazonConfigGetComplianceSummaryByResourceTypeCommand().apply(init))
}

@Generated
class AmazonConfigGetComplianceSummaryByResourceTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest> {

	var resourceTypes: List<String>? = null

	override fun build(): com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest {
		val input = com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest()
		input.setResourceTypes(this.resourceTypes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.getComplianceSummaryByResourceType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config get-compliance-summary-by-resource-type")
				.argument("resource-types", resourceTypes?.toString())
	}

}


fun AmazonConfigFunctions.getDiscoveredResourceCounts(init: AmazonConfigGetDiscoveredResourceCountsCommand.() -> Unit) {
	this.block.declare(AmazonConfigGetDiscoveredResourceCountsCommand().apply(init))
}

@Generated
class AmazonConfigGetDiscoveredResourceCountsCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.GetDiscoveredResourceCountsRequest> {

	var resourceTypes: List<String>? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.config.model.GetDiscoveredResourceCountsRequest {
		val input = com.amazonaws.services.config.model.GetDiscoveredResourceCountsRequest()
		input.setResourceTypes(this.resourceTypes)
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.getDiscoveredResourceCounts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config get-discovered-resource-counts")
				.argument("resource-types", resourceTypes?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.getResourceConfigHistory(init: AmazonConfigGetResourceConfigHistoryCommand.() -> Unit) {
	this.block.declare(AmazonConfigGetResourceConfigHistoryCommand().apply(init))
}

@Generated
class AmazonConfigGetResourceConfigHistoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.GetResourceConfigHistoryRequest> {

	var resourceType: ResourceType? = null
	var resourceId: String? = null
	var laterTime: java.util.Date? = null
	var earlierTime: java.util.Date? = null
	var chronologicalOrder: ChronologicalOrder? = null
	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.config.model.GetResourceConfigHistoryRequest {
		val input = com.amazonaws.services.config.model.GetResourceConfigHistoryRequest()
		input.setResourceType(this.resourceType?.toString())
		input.setResourceId(this.resourceId)
		input.setLaterTime(this.laterTime)
		input.setEarlierTime(this.earlierTime)
		input.setChronologicalOrder(this.chronologicalOrder?.toString())
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.getResourceConfigHistory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config get-resource-config-history")
				.argument("resource-type", resourceType?.toString())
				.argument("resource-id", resourceId)
				.argument("later-time", laterTime?.toString())
				.argument("earlier-time", earlierTime?.toString())
				.argument("chronological-order", chronologicalOrder?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.listDiscoveredResources(init: AmazonConfigListDiscoveredResourcesCommand.() -> Unit) {
	this.block.declare(AmazonConfigListDiscoveredResourcesCommand().apply(init))
}

@Generated
class AmazonConfigListDiscoveredResourcesCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.ListDiscoveredResourcesRequest> {

	var resourceType: ResourceType? = null
	var resourceIds: List<String>? = null
	var resourceName: String? = null
	var limit: Int? = 0
	var includeDeletedResources: Boolean? = false
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.config.model.ListDiscoveredResourcesRequest {
		val input = com.amazonaws.services.config.model.ListDiscoveredResourcesRequest()
		input.setResourceType(this.resourceType?.toString())
		input.setResourceIds(this.resourceIds)
		input.setResourceName(this.resourceName)
		input.setLimit(this.limit)
		input.setIncludeDeletedResources(this.includeDeletedResources)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.listDiscoveredResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config list-discovered-resources")
				.argument("resource-type", resourceType?.toString())
				.argument("resource-ids", resourceIds?.toString())
				.argument("resource-name", resourceName)
				.argument("limit", limit?.toString())
				.option("include-deleted-resources", includeDeletedResources ?: false)
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.putAggregationAuthorization(authorizedAccountId: String, authorizedAwsRegion: String, init: AmazonConfigPutAggregationAuthorizationCommand.() -> Unit) {
	this.block.declare(AmazonConfigPutAggregationAuthorizationCommand(authorizedAccountId, authorizedAwsRegion).apply(init))
}

@Generated
class AmazonConfigPutAggregationAuthorizationCommand(val authorizedAccountId: String, val authorizedAwsRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.PutAggregationAuthorizationRequest> {



	override fun build(): com.amazonaws.services.config.model.PutAggregationAuthorizationRequest {
		val input = com.amazonaws.services.config.model.PutAggregationAuthorizationRequest()
		input.setAuthorizedAccountId(this.authorizedAccountId)
		input.setAuthorizedAwsRegion(this.authorizedAwsRegion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.putAggregationAuthorization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config put-aggregation-authorization")
				.argument("authorized-account-id", authorizedAccountId)
				.argument("authorized-aws-region", authorizedAwsRegion)
	}

}


fun AmazonConfigFunctions.putConfigRule(configRule: com.amazonaws.services.config.model.ConfigRule, init: AmazonConfigPutConfigRuleCommand.() -> Unit) {
	this.block.declare(AmazonConfigPutConfigRuleCommand(configRule).apply(init))
}

@Generated
class AmazonConfigPutConfigRuleCommand(val configRule: com.amazonaws.services.config.model.ConfigRule) : AmazonWebServiceCommand<com.amazonaws.services.config.model.PutConfigRuleRequest> {



	override fun build(): com.amazonaws.services.config.model.PutConfigRuleRequest {
		val input = com.amazonaws.services.config.model.PutConfigRuleRequest()
		input.setConfigRule(this.configRule)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.putConfigRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config put-config-rule")
				.argument("config-rule", configRule.toString())
	}

}


fun AmazonConfigFunctions.putConfigurationAggregator(configurationAggregatorName: String, init: AmazonConfigPutConfigurationAggregatorCommand.() -> Unit) {
	this.block.declare(AmazonConfigPutConfigurationAggregatorCommand(configurationAggregatorName).apply(init))
}

@Generated
class AmazonConfigPutConfigurationAggregatorCommand(val configurationAggregatorName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.PutConfigurationAggregatorRequest> {

	var accountAggregationSources: List<com.amazonaws.services.config.model.AccountAggregationSource>? = null
	var organizationAggregationSource: com.amazonaws.services.config.model.OrganizationAggregationSource? = null

	override fun build(): com.amazonaws.services.config.model.PutConfigurationAggregatorRequest {
		val input = com.amazonaws.services.config.model.PutConfigurationAggregatorRequest()
		input.setConfigurationAggregatorName(this.configurationAggregatorName)
		input.setAccountAggregationSources(this.accountAggregationSources)
		input.setOrganizationAggregationSource(this.organizationAggregationSource)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.putConfigurationAggregator(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config put-configuration-aggregator")
				.argument("configuration-aggregator-name", configurationAggregatorName)
				.argument("account-aggregation-sources", accountAggregationSources?.toString())
				.argument("organization-aggregation-source", organizationAggregationSource?.toString())
	}

}


fun AmazonConfigFunctions.putConfigurationRecorder(configurationRecorder: com.amazonaws.services.config.model.ConfigurationRecorder, init: AmazonConfigPutConfigurationRecorderCommand.() -> Unit) {
	this.block.declare(AmazonConfigPutConfigurationRecorderCommand(configurationRecorder).apply(init))
}

@Generated
class AmazonConfigPutConfigurationRecorderCommand(val configurationRecorder: com.amazonaws.services.config.model.ConfigurationRecorder) : AmazonWebServiceCommand<com.amazonaws.services.config.model.PutConfigurationRecorderRequest> {



	override fun build(): com.amazonaws.services.config.model.PutConfigurationRecorderRequest {
		val input = com.amazonaws.services.config.model.PutConfigurationRecorderRequest()
		input.setConfigurationRecorder(this.configurationRecorder)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.putConfigurationRecorder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config put-configuration-recorder")
				.argument("configuration-recorder", configurationRecorder.toString())
	}

}


fun AmazonConfigFunctions.putDeliveryChannel(deliveryChannel: com.amazonaws.services.config.model.DeliveryChannel, init: AmazonConfigPutDeliveryChannelCommand.() -> Unit) {
	this.block.declare(AmazonConfigPutDeliveryChannelCommand(deliveryChannel).apply(init))
}

@Generated
class AmazonConfigPutDeliveryChannelCommand(val deliveryChannel: com.amazonaws.services.config.model.DeliveryChannel) : AmazonWebServiceCommand<com.amazonaws.services.config.model.PutDeliveryChannelRequest> {



	override fun build(): com.amazonaws.services.config.model.PutDeliveryChannelRequest {
		val input = com.amazonaws.services.config.model.PutDeliveryChannelRequest()
		input.setDeliveryChannel(this.deliveryChannel)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.putDeliveryChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config put-delivery-channel")
				.argument("delivery-channel", deliveryChannel.toString())
	}

}


fun AmazonConfigFunctions.putEvaluations(resultToken: String, init: AmazonConfigPutEvaluationsCommand.() -> Unit) {
	this.block.declare(AmazonConfigPutEvaluationsCommand(resultToken).apply(init))
}

@Generated
class AmazonConfigPutEvaluationsCommand(val resultToken: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.PutEvaluationsRequest> {

	var evaluations: List<com.amazonaws.services.config.model.Evaluation>? = null
	var testMode: Boolean? = false

	override fun build(): com.amazonaws.services.config.model.PutEvaluationsRequest {
		val input = com.amazonaws.services.config.model.PutEvaluationsRequest()
		input.setEvaluations(this.evaluations)
		input.setResultToken(this.resultToken)
		input.setTestMode(this.testMode)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.putEvaluations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config put-evaluations")
				.argument("evaluations", evaluations?.toString())
				.argument("result-token", resultToken)
				.option("test-mode", testMode ?: false)
	}

}


fun AmazonConfigFunctions.startConfigRulesEvaluation(init: AmazonConfigStartConfigRulesEvaluationCommand.() -> Unit) {
	this.block.declare(AmazonConfigStartConfigRulesEvaluationCommand().apply(init))
}

@Generated
class AmazonConfigStartConfigRulesEvaluationCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest> {

	var configRuleNames: List<String>? = null

	override fun build(): com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest {
		val input = com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest()
		input.setConfigRuleNames(this.configRuleNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.startConfigRulesEvaluation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config start-config-rules-evaluation")
				.argument("config-rule-names", configRuleNames?.toString())
	}

}


fun AmazonConfigFunctions.startConfigurationRecorder(configurationRecorderName: String, init: AmazonConfigStartConfigurationRecorderCommand.() -> Unit) {
	this.block.declare(AmazonConfigStartConfigurationRecorderCommand(configurationRecorderName).apply(init))
}

@Generated
class AmazonConfigStartConfigurationRecorderCommand(val configurationRecorderName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.StartConfigurationRecorderRequest> {



	override fun build(): com.amazonaws.services.config.model.StartConfigurationRecorderRequest {
		val input = com.amazonaws.services.config.model.StartConfigurationRecorderRequest()
		input.setConfigurationRecorderName(this.configurationRecorderName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.startConfigurationRecorder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config start-configuration-recorder")
				.argument("configuration-recorder-name", configurationRecorderName)
	}

}


fun AmazonConfigFunctions.stopConfigurationRecorder(configurationRecorderName: String, init: AmazonConfigStopConfigurationRecorderCommand.() -> Unit) {
	this.block.declare(AmazonConfigStopConfigurationRecorderCommand(configurationRecorderName).apply(init))
}

@Generated
class AmazonConfigStopConfigurationRecorderCommand(val configurationRecorderName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.StopConfigurationRecorderRequest> {



	override fun build(): com.amazonaws.services.config.model.StopConfigurationRecorderRequest {
		val input = com.amazonaws.services.config.model.StopConfigurationRecorderRequest()
		input.setConfigurationRecorderName(this.configurationRecorderName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.config.stopConfigurationRecorder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config stop-configuration-recorder")
				.argument("configuration-recorder-name", configurationRecorderName)
	}

}
