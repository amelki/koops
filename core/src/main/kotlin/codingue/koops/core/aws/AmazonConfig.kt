
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.config.AmazonConfig
import com.amazonaws.services.config.AmazonConfigClientBuilder
import com.amazonaws.services.config.model.*

var codingue.koops.core.Environment.config: AmazonConfig
	get() {
		var service = this.capabilities[AmazonConfig::class.java.name]
		if (service == null) {
			service = AmazonConfigClientBuilder.standard().build()
			config = service
		}
		return service as AmazonConfig
	}
	set(config) {
		this.capabilities[AmazonConfig::class.java.name] = config
	}

@Generated
class AmazonConfigFunctions(val block: Block)

infix fun <T> AwsContinuation.config(init: AmazonConfigFunctions.() -> T): T {
	return AmazonConfigFunctions(shell).run(init)
}

			

fun AmazonConfigFunctions.batchGetResourceConfig(init: AmazonConfigBatchGetResourceConfigCommand.() -> Unit): com.amazonaws.services.config.model.BatchGetResourceConfigResult {
	return this.block.declare(AmazonConfigBatchGetResourceConfigCommand().apply(init)) as com.amazonaws.services.config.model.BatchGetResourceConfigResult
}

@Generated
class AmazonConfigBatchGetResourceConfigCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.BatchGetResourceConfigRequest, com.amazonaws.services.config.model.BatchGetResourceConfigResult> {

	var resourceKeys: List<com.amazonaws.services.config.model.ResourceKey>? = null

	override fun build(): com.amazonaws.services.config.model.BatchGetResourceConfigRequest {
		val input = com.amazonaws.services.config.model.BatchGetResourceConfigRequest()
		input.setResourceKeys(this.resourceKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.BatchGetResourceConfigResult {
	  return com.amazonaws.services.config.model.BatchGetResourceConfigResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.BatchGetResourceConfigResult {
		return environment.config.batchGetResourceConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config batch-get-resource-config")
				.argument("resource-keys", resourceKeys?.toString())
	}

}


fun AmazonConfigFunctions.deleteAggregationAuthorization(authorizedAccountId: String, authorizedAwsRegion: String, init: AmazonConfigDeleteAggregationAuthorizationCommand.() -> Unit): com.amazonaws.services.config.model.DeleteAggregationAuthorizationResult {
	return this.block.declare(AmazonConfigDeleteAggregationAuthorizationCommand(authorizedAccountId, authorizedAwsRegion).apply(init)) as com.amazonaws.services.config.model.DeleteAggregationAuthorizationResult
}

@Generated
class AmazonConfigDeleteAggregationAuthorizationCommand(val authorizedAccountId: String, val authorizedAwsRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest, com.amazonaws.services.config.model.DeleteAggregationAuthorizationResult> {



	override fun build(): com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest {
		val input = com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest()
		input.setAuthorizedAccountId(this.authorizedAccountId)
		input.setAuthorizedAwsRegion(this.authorizedAwsRegion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.DeleteAggregationAuthorizationResult {
	  return com.amazonaws.services.config.model.DeleteAggregationAuthorizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DeleteAggregationAuthorizationResult {
		return environment.config.deleteAggregationAuthorization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config delete-aggregation-authorization")
				.argument("authorized-account-id", authorizedAccountId)
				.argument("authorized-aws-region", authorizedAwsRegion)
	}

}


fun AmazonConfigFunctions.deleteConfigRule(configRuleName: String, init: AmazonConfigDeleteConfigRuleCommand.() -> Unit): com.amazonaws.services.config.model.DeleteConfigRuleResult {
	return this.block.declare(AmazonConfigDeleteConfigRuleCommand(configRuleName).apply(init)) as com.amazonaws.services.config.model.DeleteConfigRuleResult
}

@Generated
class AmazonConfigDeleteConfigRuleCommand(val configRuleName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DeleteConfigRuleRequest, com.amazonaws.services.config.model.DeleteConfigRuleResult> {



	override fun build(): com.amazonaws.services.config.model.DeleteConfigRuleRequest {
		val input = com.amazonaws.services.config.model.DeleteConfigRuleRequest()
		input.setConfigRuleName(this.configRuleName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.DeleteConfigRuleResult {
	  return com.amazonaws.services.config.model.DeleteConfigRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DeleteConfigRuleResult {
		return environment.config.deleteConfigRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config delete-config-rule")
				.argument("config-rule-name", configRuleName)
	}

}


fun AmazonConfigFunctions.deleteConfigurationAggregator(configurationAggregatorName: String, init: AmazonConfigDeleteConfigurationAggregatorCommand.() -> Unit): com.amazonaws.services.config.model.DeleteConfigurationAggregatorResult {
	return this.block.declare(AmazonConfigDeleteConfigurationAggregatorCommand(configurationAggregatorName).apply(init)) as com.amazonaws.services.config.model.DeleteConfigurationAggregatorResult
}

@Generated
class AmazonConfigDeleteConfigurationAggregatorCommand(val configurationAggregatorName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest, com.amazonaws.services.config.model.DeleteConfigurationAggregatorResult> {



	override fun build(): com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest {
		val input = com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest()
		input.setConfigurationAggregatorName(this.configurationAggregatorName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.DeleteConfigurationAggregatorResult {
	  return com.amazonaws.services.config.model.DeleteConfigurationAggregatorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DeleteConfigurationAggregatorResult {
		return environment.config.deleteConfigurationAggregator(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config delete-configuration-aggregator")
				.argument("configuration-aggregator-name", configurationAggregatorName)
	}

}


fun AmazonConfigFunctions.deleteConfigurationRecorder(configurationRecorderName: String, init: AmazonConfigDeleteConfigurationRecorderCommand.() -> Unit): com.amazonaws.services.config.model.DeleteConfigurationRecorderResult {
	return this.block.declare(AmazonConfigDeleteConfigurationRecorderCommand(configurationRecorderName).apply(init)) as com.amazonaws.services.config.model.DeleteConfigurationRecorderResult
}

@Generated
class AmazonConfigDeleteConfigurationRecorderCommand(val configurationRecorderName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest, com.amazonaws.services.config.model.DeleteConfigurationRecorderResult> {



	override fun build(): com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest {
		val input = com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest()
		input.setConfigurationRecorderName(this.configurationRecorderName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.DeleteConfigurationRecorderResult {
	  return com.amazonaws.services.config.model.DeleteConfigurationRecorderResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DeleteConfigurationRecorderResult {
		return environment.config.deleteConfigurationRecorder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config delete-configuration-recorder")
				.argument("configuration-recorder-name", configurationRecorderName)
	}

}


fun AmazonConfigFunctions.deleteDeliveryChannel(deliveryChannelName: String, init: AmazonConfigDeleteDeliveryChannelCommand.() -> Unit): com.amazonaws.services.config.model.DeleteDeliveryChannelResult {
	return this.block.declare(AmazonConfigDeleteDeliveryChannelCommand(deliveryChannelName).apply(init)) as com.amazonaws.services.config.model.DeleteDeliveryChannelResult
}

@Generated
class AmazonConfigDeleteDeliveryChannelCommand(val deliveryChannelName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DeleteDeliveryChannelRequest, com.amazonaws.services.config.model.DeleteDeliveryChannelResult> {



	override fun build(): com.amazonaws.services.config.model.DeleteDeliveryChannelRequest {
		val input = com.amazonaws.services.config.model.DeleteDeliveryChannelRequest()
		input.setDeliveryChannelName(this.deliveryChannelName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.DeleteDeliveryChannelResult {
	  return com.amazonaws.services.config.model.DeleteDeliveryChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DeleteDeliveryChannelResult {
		return environment.config.deleteDeliveryChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config delete-delivery-channel")
				.argument("delivery-channel-name", deliveryChannelName)
	}

}


fun AmazonConfigFunctions.deleteEvaluationResults(configRuleName: String, init: AmazonConfigDeleteEvaluationResultsCommand.() -> Unit): com.amazonaws.services.config.model.DeleteEvaluationResultsResult {
	return this.block.declare(AmazonConfigDeleteEvaluationResultsCommand(configRuleName).apply(init)) as com.amazonaws.services.config.model.DeleteEvaluationResultsResult
}

@Generated
class AmazonConfigDeleteEvaluationResultsCommand(val configRuleName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DeleteEvaluationResultsRequest, com.amazonaws.services.config.model.DeleteEvaluationResultsResult> {



	override fun build(): com.amazonaws.services.config.model.DeleteEvaluationResultsRequest {
		val input = com.amazonaws.services.config.model.DeleteEvaluationResultsRequest()
		input.setConfigRuleName(this.configRuleName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.DeleteEvaluationResultsResult {
	  return com.amazonaws.services.config.model.DeleteEvaluationResultsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DeleteEvaluationResultsResult {
		return environment.config.deleteEvaluationResults(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config delete-evaluation-results")
				.argument("config-rule-name", configRuleName)
	}

}


fun AmazonConfigFunctions.deletePendingAggregationRequest(requesterAccountId: String, requesterAwsRegion: String, init: AmazonConfigDeletePendingAggregationRequestCommand.() -> Unit): com.amazonaws.services.config.model.DeletePendingAggregationRequestResult {
	return this.block.declare(AmazonConfigDeletePendingAggregationRequestCommand(requesterAccountId, requesterAwsRegion).apply(init)) as com.amazonaws.services.config.model.DeletePendingAggregationRequestResult
}

@Generated
class AmazonConfigDeletePendingAggregationRequestCommand(val requesterAccountId: String, val requesterAwsRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest, com.amazonaws.services.config.model.DeletePendingAggregationRequestResult> {



	override fun build(): com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest {
		val input = com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest()
		input.setRequesterAccountId(this.requesterAccountId)
		input.setRequesterAwsRegion(this.requesterAwsRegion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.DeletePendingAggregationRequestResult {
	  return com.amazonaws.services.config.model.DeletePendingAggregationRequestResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DeletePendingAggregationRequestResult {
		return environment.config.deletePendingAggregationRequest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config delete-pending-aggregation-request")
				.argument("requester-account-id", requesterAccountId)
				.argument("requester-aws-region", requesterAwsRegion)
	}

}


fun AmazonConfigFunctions.deliverConfigSnapshot(init: AmazonConfigDeliverConfigSnapshotCommand.() -> Unit): com.amazonaws.services.config.model.DeliverConfigSnapshotResult {
	return this.block.declare(AmazonConfigDeliverConfigSnapshotCommand().apply(init)) as com.amazonaws.services.config.model.DeliverConfigSnapshotResult
}

@Generated
class AmazonConfigDeliverConfigSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DeliverConfigSnapshotRequest, com.amazonaws.services.config.model.DeliverConfigSnapshotResult> {

	var deliveryChannelName: String? = null

	override fun build(): com.amazonaws.services.config.model.DeliverConfigSnapshotRequest {
		val input = com.amazonaws.services.config.model.DeliverConfigSnapshotRequest()
		input.setDeliveryChannelName(this.deliveryChannelName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.DeliverConfigSnapshotResult {
	  return com.amazonaws.services.config.model.DeliverConfigSnapshotResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DeliverConfigSnapshotResult {
		return environment.config.deliverConfigSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config deliver-config-snapshot")
				.argument("delivery-channel-name", deliveryChannelName)
	}

}


fun AmazonConfigFunctions.describeAggregateComplianceByConfigRules(configurationAggregatorName: String, init: AmazonConfigDescribeAggregateComplianceByConfigRulesCommand.() -> Unit): com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesResult {
	return this.block.declare(AmazonConfigDescribeAggregateComplianceByConfigRulesCommand(configurationAggregatorName).apply(init)) as com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesResult
}

@Generated
class AmazonConfigDescribeAggregateComplianceByConfigRulesCommand(val configurationAggregatorName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesRequest, com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesResult {
	  return com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesResult {
		return environment.config.describeAggregateComplianceByConfigRules(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-aggregate-compliance-by-config-rules")
				.argument("configuration-aggregator-name", configurationAggregatorName)
				.argument("filters", filters?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.describeAggregationAuthorizations(init: AmazonConfigDescribeAggregationAuthorizationsCommand.() -> Unit): com.amazonaws.services.config.model.DescribeAggregationAuthorizationsResult {
	return this.block.declare(AmazonConfigDescribeAggregationAuthorizationsCommand().apply(init)) as com.amazonaws.services.config.model.DescribeAggregationAuthorizationsResult
}

@Generated
class AmazonConfigDescribeAggregationAuthorizationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest, com.amazonaws.services.config.model.DescribeAggregationAuthorizationsResult> {

	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest {
		val input = com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest()
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.DescribeAggregationAuthorizationsResult {
	  return com.amazonaws.services.config.model.DescribeAggregationAuthorizationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DescribeAggregationAuthorizationsResult {
		return environment.config.describeAggregationAuthorizations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-aggregation-authorizations")
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.describeComplianceByConfigRule(init: AmazonConfigDescribeComplianceByConfigRuleCommand.() -> Unit): com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult {
	return this.block.declare(AmazonConfigDescribeComplianceByConfigRuleCommand().apply(init)) as com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult
}

@Generated
class AmazonConfigDescribeComplianceByConfigRuleCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeComplianceByConfigRuleRequest, com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult> {

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

	
	override fun dryResult(): com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult {
	  return com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult {
		return environment.config.describeComplianceByConfigRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-compliance-by-config-rule")
				.argument("config-rule-names", configRuleNames?.toString())
				.argument("compliance-types", complianceTypes?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.describeComplianceByResource(init: AmazonConfigDescribeComplianceByResourceCommand.() -> Unit): com.amazonaws.services.config.model.DescribeComplianceByResourceResult {
	return this.block.declare(AmazonConfigDescribeComplianceByResourceCommand().apply(init)) as com.amazonaws.services.config.model.DescribeComplianceByResourceResult
}

@Generated
class AmazonConfigDescribeComplianceByResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeComplianceByResourceRequest, com.amazonaws.services.config.model.DescribeComplianceByResourceResult> {

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

	
	override fun dryResult(): com.amazonaws.services.config.model.DescribeComplianceByResourceResult {
	  return com.amazonaws.services.config.model.DescribeComplianceByResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DescribeComplianceByResourceResult {
		return environment.config.describeComplianceByResource(build())
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


fun AmazonConfigFunctions.describeConfigRuleEvaluationStatus(init: AmazonConfigDescribeConfigRuleEvaluationStatusCommand.() -> Unit): com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult {
	return this.block.declare(AmazonConfigDescribeConfigRuleEvaluationStatusCommand().apply(init)) as com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult
}

@Generated
class AmazonConfigDescribeConfigRuleEvaluationStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusRequest, com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult> {

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

	
	override fun dryResult(): com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult {
	  return com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult {
		return environment.config.describeConfigRuleEvaluationStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-config-rule-evaluation-status")
				.argument("config-rule-names", configRuleNames?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AmazonConfigFunctions.describeConfigRules(init: AmazonConfigDescribeConfigRulesCommand.() -> Unit): com.amazonaws.services.config.model.DescribeConfigRulesResult {
	return this.block.declare(AmazonConfigDescribeConfigRulesCommand().apply(init)) as com.amazonaws.services.config.model.DescribeConfigRulesResult
}

@Generated
class AmazonConfigDescribeConfigRulesCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeConfigRulesRequest, com.amazonaws.services.config.model.DescribeConfigRulesResult> {

	var configRuleNames: List<String>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.config.model.DescribeConfigRulesRequest {
		val input = com.amazonaws.services.config.model.DescribeConfigRulesRequest()
		input.setConfigRuleNames(this.configRuleNames)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.DescribeConfigRulesResult {
	  return com.amazonaws.services.config.model.DescribeConfigRulesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DescribeConfigRulesResult {
		return environment.config.describeConfigRules(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-config-rules")
				.argument("config-rule-names", configRuleNames?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.describeConfigurationAggregatorSourcesStatus(configurationAggregatorName: String, init: AmazonConfigDescribeConfigurationAggregatorSourcesStatusCommand.() -> Unit): com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusResult {
	return this.block.declare(AmazonConfigDescribeConfigurationAggregatorSourcesStatusCommand(configurationAggregatorName).apply(init)) as com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusResult
}

@Generated
class AmazonConfigDescribeConfigurationAggregatorSourcesStatusCommand(val configurationAggregatorName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusRequest, com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusResult> {

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

	
	override fun dryResult(): com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusResult {
	  return com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusResult {
		return environment.config.describeConfigurationAggregatorSourcesStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-configuration-aggregator-sources-status")
				.argument("configuration-aggregator-name", configurationAggregatorName)
				.argument("update-status", updateStatus?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AmazonConfigFunctions.describeConfigurationAggregators(init: AmazonConfigDescribeConfigurationAggregatorsCommand.() -> Unit): com.amazonaws.services.config.model.DescribeConfigurationAggregatorsResult {
	return this.block.declare(AmazonConfigDescribeConfigurationAggregatorsCommand().apply(init)) as com.amazonaws.services.config.model.DescribeConfigurationAggregatorsResult
}

@Generated
class AmazonConfigDescribeConfigurationAggregatorsCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeConfigurationAggregatorsRequest, com.amazonaws.services.config.model.DescribeConfigurationAggregatorsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.config.model.DescribeConfigurationAggregatorsResult {
	  return com.amazonaws.services.config.model.DescribeConfigurationAggregatorsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DescribeConfigurationAggregatorsResult {
		return environment.config.describeConfigurationAggregators(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-configuration-aggregators")
				.argument("configuration-aggregator-names", configurationAggregatorNames?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AmazonConfigFunctions.describeConfigurationRecorderStatus(init: AmazonConfigDescribeConfigurationRecorderStatusCommand.() -> Unit): com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult {
	return this.block.declare(AmazonConfigDescribeConfigurationRecorderStatusCommand().apply(init)) as com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult
}

@Generated
class AmazonConfigDescribeConfigurationRecorderStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest, com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult> {

	var configurationRecorderNames: List<String>? = null

	override fun build(): com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest {
		val input = com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest()
		input.setConfigurationRecorderNames(this.configurationRecorderNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult {
	  return com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult {
		return environment.config.describeConfigurationRecorderStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-configuration-recorder-status")
				.argument("configuration-recorder-names", configurationRecorderNames?.toString())
	}

}


fun AmazonConfigFunctions.describeConfigurationRecorders(init: AmazonConfigDescribeConfigurationRecordersCommand.() -> Unit): com.amazonaws.services.config.model.DescribeConfigurationRecordersResult {
	return this.block.declare(AmazonConfigDescribeConfigurationRecordersCommand().apply(init)) as com.amazonaws.services.config.model.DescribeConfigurationRecordersResult
}

@Generated
class AmazonConfigDescribeConfigurationRecordersCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest, com.amazonaws.services.config.model.DescribeConfigurationRecordersResult> {

	var configurationRecorderNames: List<String>? = null

	override fun build(): com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest {
		val input = com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest()
		input.setConfigurationRecorderNames(this.configurationRecorderNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.DescribeConfigurationRecordersResult {
	  return com.amazonaws.services.config.model.DescribeConfigurationRecordersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DescribeConfigurationRecordersResult {
		return environment.config.describeConfigurationRecorders(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-configuration-recorders")
				.argument("configuration-recorder-names", configurationRecorderNames?.toString())
	}

}


fun AmazonConfigFunctions.describeDeliveryChannelStatus(init: AmazonConfigDescribeDeliveryChannelStatusCommand.() -> Unit): com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult {
	return this.block.declare(AmazonConfigDescribeDeliveryChannelStatusCommand().apply(init)) as com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult
}

@Generated
class AmazonConfigDescribeDeliveryChannelStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest, com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult> {

	var deliveryChannelNames: List<String>? = null

	override fun build(): com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest {
		val input = com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest()
		input.setDeliveryChannelNames(this.deliveryChannelNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult {
	  return com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult {
		return environment.config.describeDeliveryChannelStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-delivery-channel-status")
				.argument("delivery-channel-names", deliveryChannelNames?.toString())
	}

}


fun AmazonConfigFunctions.describeDeliveryChannels(init: AmazonConfigDescribeDeliveryChannelsCommand.() -> Unit): com.amazonaws.services.config.model.DescribeDeliveryChannelsResult {
	return this.block.declare(AmazonConfigDescribeDeliveryChannelsCommand().apply(init)) as com.amazonaws.services.config.model.DescribeDeliveryChannelsResult
}

@Generated
class AmazonConfigDescribeDeliveryChannelsCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest, com.amazonaws.services.config.model.DescribeDeliveryChannelsResult> {

	var deliveryChannelNames: List<String>? = null

	override fun build(): com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest {
		val input = com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest()
		input.setDeliveryChannelNames(this.deliveryChannelNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.DescribeDeliveryChannelsResult {
	  return com.amazonaws.services.config.model.DescribeDeliveryChannelsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DescribeDeliveryChannelsResult {
		return environment.config.describeDeliveryChannels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-delivery-channels")
				.argument("delivery-channel-names", deliveryChannelNames?.toString())
	}

}


fun AmazonConfigFunctions.describePendingAggregationRequests(init: AmazonConfigDescribePendingAggregationRequestsCommand.() -> Unit): com.amazonaws.services.config.model.DescribePendingAggregationRequestsResult {
	return this.block.declare(AmazonConfigDescribePendingAggregationRequestsCommand().apply(init)) as com.amazonaws.services.config.model.DescribePendingAggregationRequestsResult
}

@Generated
class AmazonConfigDescribePendingAggregationRequestsCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest, com.amazonaws.services.config.model.DescribePendingAggregationRequestsResult> {

	var limit: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest {
		val input = com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest()
		input.setLimit(this.limit)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.DescribePendingAggregationRequestsResult {
	  return com.amazonaws.services.config.model.DescribePendingAggregationRequestsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.DescribePendingAggregationRequestsResult {
		return environment.config.describePendingAggregationRequests(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config describe-pending-aggregation-requests")
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.getAggregateComplianceDetailsByConfigRule(configurationAggregatorName: String, configRuleName: String, accountId: String, awsRegion: String, init: AmazonConfigGetAggregateComplianceDetailsByConfigRuleCommand.() -> Unit): com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleResult {
	return this.block.declare(AmazonConfigGetAggregateComplianceDetailsByConfigRuleCommand(configurationAggregatorName, configRuleName, accountId, awsRegion).apply(init)) as com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleResult
}

@Generated
class AmazonConfigGetAggregateComplianceDetailsByConfigRuleCommand(val configurationAggregatorName: String, val configRuleName: String, val accountId: String, val awsRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleRequest, com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleResult> {

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

	
	override fun dryResult(): com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleResult {
	  return com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleResult {
		return environment.config.getAggregateComplianceDetailsByConfigRule(build())
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


fun AmazonConfigFunctions.getAggregateConfigRuleComplianceSummary(configurationAggregatorName: String, init: AmazonConfigGetAggregateConfigRuleComplianceSummaryCommand.() -> Unit): com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryResult {
	return this.block.declare(AmazonConfigGetAggregateConfigRuleComplianceSummaryCommand(configurationAggregatorName).apply(init)) as com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryResult
}

@Generated
class AmazonConfigGetAggregateConfigRuleComplianceSummaryCommand(val configurationAggregatorName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryRequest, com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryResult> {

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

	
	override fun dryResult(): com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryResult {
	  return com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryResult {
		return environment.config.getAggregateConfigRuleComplianceSummary(build())
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


fun AmazonConfigFunctions.getComplianceDetailsByConfigRule(configRuleName: String, init: AmazonConfigGetComplianceDetailsByConfigRuleCommand.() -> Unit): com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleResult {
	return this.block.declare(AmazonConfigGetComplianceDetailsByConfigRuleCommand(configRuleName).apply(init)) as com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleResult
}

@Generated
class AmazonConfigGetComplianceDetailsByConfigRuleCommand(val configRuleName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleRequest, com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleResult> {

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

	
	override fun dryResult(): com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleResult {
	  return com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleResult {
		return environment.config.getComplianceDetailsByConfigRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config get-compliance-details-by-config-rule")
				.argument("config-rule-name", configRuleName)
				.argument("compliance-types", complianceTypes?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.getComplianceDetailsByResource(resourceType: String, resourceId: String, init: AmazonConfigGetComplianceDetailsByResourceCommand.() -> Unit): com.amazonaws.services.config.model.GetComplianceDetailsByResourceResult {
	return this.block.declare(AmazonConfigGetComplianceDetailsByResourceCommand(resourceType, resourceId).apply(init)) as com.amazonaws.services.config.model.GetComplianceDetailsByResourceResult
}

@Generated
class AmazonConfigGetComplianceDetailsByResourceCommand(val resourceType: String, val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.GetComplianceDetailsByResourceRequest, com.amazonaws.services.config.model.GetComplianceDetailsByResourceResult> {

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

	
	override fun dryResult(): com.amazonaws.services.config.model.GetComplianceDetailsByResourceResult {
	  return com.amazonaws.services.config.model.GetComplianceDetailsByResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.GetComplianceDetailsByResourceResult {
		return environment.config.getComplianceDetailsByResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config get-compliance-details-by-resource")
				.argument("resource-type", resourceType)
				.argument("resource-id", resourceId)
				.argument("compliance-types", complianceTypes?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.getComplianceSummaryByConfigRule(init: AmazonConfigGetComplianceSummaryByConfigRuleCommand.() -> Unit): com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult {
	return this.block.declare(AmazonConfigGetComplianceSummaryByConfigRuleCommand().apply(init)) as com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult
}

@Generated
class AmazonConfigGetComplianceSummaryByConfigRuleCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest, com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult> {



	override fun build(): com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest {
		val input = com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult {
	  return com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult {
		return environment.config.getComplianceSummaryByConfigRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config get-compliance-summary-by-config-rule")

	}

}


fun AmazonConfigFunctions.getComplianceSummaryByResourceType(init: AmazonConfigGetComplianceSummaryByResourceTypeCommand.() -> Unit): com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult {
	return this.block.declare(AmazonConfigGetComplianceSummaryByResourceTypeCommand().apply(init)) as com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult
}

@Generated
class AmazonConfigGetComplianceSummaryByResourceTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest, com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult> {

	var resourceTypes: List<String>? = null

	override fun build(): com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest {
		val input = com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest()
		input.setResourceTypes(this.resourceTypes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult {
	  return com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult {
		return environment.config.getComplianceSummaryByResourceType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config get-compliance-summary-by-resource-type")
				.argument("resource-types", resourceTypes?.toString())
	}

}


fun AmazonConfigFunctions.getDiscoveredResourceCounts(init: AmazonConfigGetDiscoveredResourceCountsCommand.() -> Unit): com.amazonaws.services.config.model.GetDiscoveredResourceCountsResult {
	return this.block.declare(AmazonConfigGetDiscoveredResourceCountsCommand().apply(init)) as com.amazonaws.services.config.model.GetDiscoveredResourceCountsResult
}

@Generated
class AmazonConfigGetDiscoveredResourceCountsCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.GetDiscoveredResourceCountsRequest, com.amazonaws.services.config.model.GetDiscoveredResourceCountsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.config.model.GetDiscoveredResourceCountsResult {
	  return com.amazonaws.services.config.model.GetDiscoveredResourceCountsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.GetDiscoveredResourceCountsResult {
		return environment.config.getDiscoveredResourceCounts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config get-discovered-resource-counts")
				.argument("resource-types", resourceTypes?.toString())
				.argument("limit", limit?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonConfigFunctions.getResourceConfigHistory(init: AmazonConfigGetResourceConfigHistoryCommand.() -> Unit): com.amazonaws.services.config.model.GetResourceConfigHistoryResult {
	return this.block.declare(AmazonConfigGetResourceConfigHistoryCommand().apply(init)) as com.amazonaws.services.config.model.GetResourceConfigHistoryResult
}

@Generated
class AmazonConfigGetResourceConfigHistoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.GetResourceConfigHistoryRequest, com.amazonaws.services.config.model.GetResourceConfigHistoryResult> {

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

	
	override fun dryResult(): com.amazonaws.services.config.model.GetResourceConfigHistoryResult {
	  return com.amazonaws.services.config.model.GetResourceConfigHistoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.GetResourceConfigHistoryResult {
		return environment.config.getResourceConfigHistory(build())
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


fun AmazonConfigFunctions.listDiscoveredResources(init: AmazonConfigListDiscoveredResourcesCommand.() -> Unit): com.amazonaws.services.config.model.ListDiscoveredResourcesResult {
	return this.block.declare(AmazonConfigListDiscoveredResourcesCommand().apply(init)) as com.amazonaws.services.config.model.ListDiscoveredResourcesResult
}

@Generated
class AmazonConfigListDiscoveredResourcesCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.ListDiscoveredResourcesRequest, com.amazonaws.services.config.model.ListDiscoveredResourcesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.config.model.ListDiscoveredResourcesResult {
	  return com.amazonaws.services.config.model.ListDiscoveredResourcesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.ListDiscoveredResourcesResult {
		return environment.config.listDiscoveredResources(build())
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


fun AmazonConfigFunctions.putAggregationAuthorization(authorizedAccountId: String, authorizedAwsRegion: String, init: AmazonConfigPutAggregationAuthorizationCommand.() -> Unit): com.amazonaws.services.config.model.PutAggregationAuthorizationResult {
	return this.block.declare(AmazonConfigPutAggregationAuthorizationCommand(authorizedAccountId, authorizedAwsRegion).apply(init)) as com.amazonaws.services.config.model.PutAggregationAuthorizationResult
}

@Generated
class AmazonConfigPutAggregationAuthorizationCommand(val authorizedAccountId: String, val authorizedAwsRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.PutAggregationAuthorizationRequest, com.amazonaws.services.config.model.PutAggregationAuthorizationResult> {



	override fun build(): com.amazonaws.services.config.model.PutAggregationAuthorizationRequest {
		val input = com.amazonaws.services.config.model.PutAggregationAuthorizationRequest()
		input.setAuthorizedAccountId(this.authorizedAccountId)
		input.setAuthorizedAwsRegion(this.authorizedAwsRegion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.PutAggregationAuthorizationResult {
	  return com.amazonaws.services.config.model.PutAggregationAuthorizationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.PutAggregationAuthorizationResult {
		return environment.config.putAggregationAuthorization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config put-aggregation-authorization")
				.argument("authorized-account-id", authorizedAccountId)
				.argument("authorized-aws-region", authorizedAwsRegion)
	}

}


fun AmazonConfigFunctions.putConfigRule(configRule: com.amazonaws.services.config.model.ConfigRule, init: AmazonConfigPutConfigRuleCommand.() -> Unit): com.amazonaws.services.config.model.PutConfigRuleResult {
	return this.block.declare(AmazonConfigPutConfigRuleCommand(configRule).apply(init)) as com.amazonaws.services.config.model.PutConfigRuleResult
}

@Generated
class AmazonConfigPutConfigRuleCommand(val configRule: com.amazonaws.services.config.model.ConfigRule) : AmazonWebServiceCommand<com.amazonaws.services.config.model.PutConfigRuleRequest, com.amazonaws.services.config.model.PutConfigRuleResult> {



	override fun build(): com.amazonaws.services.config.model.PutConfigRuleRequest {
		val input = com.amazonaws.services.config.model.PutConfigRuleRequest()
		input.setConfigRule(this.configRule)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.PutConfigRuleResult {
	  return com.amazonaws.services.config.model.PutConfigRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.PutConfigRuleResult {
		return environment.config.putConfigRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config put-config-rule")
				.argument("config-rule", configRule.toString())
	}

}


fun AmazonConfigFunctions.putConfigurationAggregator(configurationAggregatorName: String, init: AmazonConfigPutConfigurationAggregatorCommand.() -> Unit): com.amazonaws.services.config.model.PutConfigurationAggregatorResult {
	return this.block.declare(AmazonConfigPutConfigurationAggregatorCommand(configurationAggregatorName).apply(init)) as com.amazonaws.services.config.model.PutConfigurationAggregatorResult
}

@Generated
class AmazonConfigPutConfigurationAggregatorCommand(val configurationAggregatorName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.PutConfigurationAggregatorRequest, com.amazonaws.services.config.model.PutConfigurationAggregatorResult> {

	var accountAggregationSources: List<com.amazonaws.services.config.model.AccountAggregationSource>? = null
	var organizationAggregationSource: com.amazonaws.services.config.model.OrganizationAggregationSource? = null

	override fun build(): com.amazonaws.services.config.model.PutConfigurationAggregatorRequest {
		val input = com.amazonaws.services.config.model.PutConfigurationAggregatorRequest()
		input.setConfigurationAggregatorName(this.configurationAggregatorName)
		input.setAccountAggregationSources(this.accountAggregationSources)
		input.setOrganizationAggregationSource(this.organizationAggregationSource)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.PutConfigurationAggregatorResult {
	  return com.amazonaws.services.config.model.PutConfigurationAggregatorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.PutConfigurationAggregatorResult {
		return environment.config.putConfigurationAggregator(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config put-configuration-aggregator")
				.argument("configuration-aggregator-name", configurationAggregatorName)
				.argument("account-aggregation-sources", accountAggregationSources?.toString())
				.argument("organization-aggregation-source", organizationAggregationSource?.toString())
	}

}


fun AmazonConfigFunctions.putConfigurationRecorder(configurationRecorder: com.amazonaws.services.config.model.ConfigurationRecorder, init: AmazonConfigPutConfigurationRecorderCommand.() -> Unit): com.amazonaws.services.config.model.PutConfigurationRecorderResult {
	return this.block.declare(AmazonConfigPutConfigurationRecorderCommand(configurationRecorder).apply(init)) as com.amazonaws.services.config.model.PutConfigurationRecorderResult
}

@Generated
class AmazonConfigPutConfigurationRecorderCommand(val configurationRecorder: com.amazonaws.services.config.model.ConfigurationRecorder) : AmazonWebServiceCommand<com.amazonaws.services.config.model.PutConfigurationRecorderRequest, com.amazonaws.services.config.model.PutConfigurationRecorderResult> {



	override fun build(): com.amazonaws.services.config.model.PutConfigurationRecorderRequest {
		val input = com.amazonaws.services.config.model.PutConfigurationRecorderRequest()
		input.setConfigurationRecorder(this.configurationRecorder)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.PutConfigurationRecorderResult {
	  return com.amazonaws.services.config.model.PutConfigurationRecorderResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.PutConfigurationRecorderResult {
		return environment.config.putConfigurationRecorder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config put-configuration-recorder")
				.argument("configuration-recorder", configurationRecorder.toString())
	}

}


fun AmazonConfigFunctions.putDeliveryChannel(deliveryChannel: com.amazonaws.services.config.model.DeliveryChannel, init: AmazonConfigPutDeliveryChannelCommand.() -> Unit): com.amazonaws.services.config.model.PutDeliveryChannelResult {
	return this.block.declare(AmazonConfigPutDeliveryChannelCommand(deliveryChannel).apply(init)) as com.amazonaws.services.config.model.PutDeliveryChannelResult
}

@Generated
class AmazonConfigPutDeliveryChannelCommand(val deliveryChannel: com.amazonaws.services.config.model.DeliveryChannel) : AmazonWebServiceCommand<com.amazonaws.services.config.model.PutDeliveryChannelRequest, com.amazonaws.services.config.model.PutDeliveryChannelResult> {



	override fun build(): com.amazonaws.services.config.model.PutDeliveryChannelRequest {
		val input = com.amazonaws.services.config.model.PutDeliveryChannelRequest()
		input.setDeliveryChannel(this.deliveryChannel)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.PutDeliveryChannelResult {
	  return com.amazonaws.services.config.model.PutDeliveryChannelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.PutDeliveryChannelResult {
		return environment.config.putDeliveryChannel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config put-delivery-channel")
				.argument("delivery-channel", deliveryChannel.toString())
	}

}


fun AmazonConfigFunctions.putEvaluations(resultToken: String, init: AmazonConfigPutEvaluationsCommand.() -> Unit): com.amazonaws.services.config.model.PutEvaluationsResult {
	return this.block.declare(AmazonConfigPutEvaluationsCommand(resultToken).apply(init)) as com.amazonaws.services.config.model.PutEvaluationsResult
}

@Generated
class AmazonConfigPutEvaluationsCommand(val resultToken: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.PutEvaluationsRequest, com.amazonaws.services.config.model.PutEvaluationsResult> {

	var evaluations: List<com.amazonaws.services.config.model.Evaluation>? = null
	var testMode: Boolean? = false

	override fun build(): com.amazonaws.services.config.model.PutEvaluationsRequest {
		val input = com.amazonaws.services.config.model.PutEvaluationsRequest()
		input.setEvaluations(this.evaluations)
		input.setResultToken(this.resultToken)
		input.setTestMode(this.testMode)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.PutEvaluationsResult {
	  return com.amazonaws.services.config.model.PutEvaluationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.PutEvaluationsResult {
		return environment.config.putEvaluations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config put-evaluations")
				.argument("evaluations", evaluations?.toString())
				.argument("result-token", resultToken)
				.option("test-mode", testMode ?: false)
	}

}


fun AmazonConfigFunctions.startConfigRulesEvaluation(init: AmazonConfigStartConfigRulesEvaluationCommand.() -> Unit): com.amazonaws.services.config.model.StartConfigRulesEvaluationResult {
	return this.block.declare(AmazonConfigStartConfigRulesEvaluationCommand().apply(init)) as com.amazonaws.services.config.model.StartConfigRulesEvaluationResult
}

@Generated
class AmazonConfigStartConfigRulesEvaluationCommand() : AmazonWebServiceCommand<com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest, com.amazonaws.services.config.model.StartConfigRulesEvaluationResult> {

	var configRuleNames: List<String>? = null

	override fun build(): com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest {
		val input = com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest()
		input.setConfigRuleNames(this.configRuleNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.StartConfigRulesEvaluationResult {
	  return com.amazonaws.services.config.model.StartConfigRulesEvaluationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.StartConfigRulesEvaluationResult {
		return environment.config.startConfigRulesEvaluation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config start-config-rules-evaluation")
				.argument("config-rule-names", configRuleNames?.toString())
	}

}


fun AmazonConfigFunctions.startConfigurationRecorder(configurationRecorderName: String, init: AmazonConfigStartConfigurationRecorderCommand.() -> Unit): com.amazonaws.services.config.model.StartConfigurationRecorderResult {
	return this.block.declare(AmazonConfigStartConfigurationRecorderCommand(configurationRecorderName).apply(init)) as com.amazonaws.services.config.model.StartConfigurationRecorderResult
}

@Generated
class AmazonConfigStartConfigurationRecorderCommand(val configurationRecorderName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.StartConfigurationRecorderRequest, com.amazonaws.services.config.model.StartConfigurationRecorderResult> {



	override fun build(): com.amazonaws.services.config.model.StartConfigurationRecorderRequest {
		val input = com.amazonaws.services.config.model.StartConfigurationRecorderRequest()
		input.setConfigurationRecorderName(this.configurationRecorderName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.StartConfigurationRecorderResult {
	  return com.amazonaws.services.config.model.StartConfigurationRecorderResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.StartConfigurationRecorderResult {
		return environment.config.startConfigurationRecorder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config start-configuration-recorder")
				.argument("configuration-recorder-name", configurationRecorderName)
	}

}


fun AmazonConfigFunctions.stopConfigurationRecorder(configurationRecorderName: String, init: AmazonConfigStopConfigurationRecorderCommand.() -> Unit): com.amazonaws.services.config.model.StopConfigurationRecorderResult {
	return this.block.declare(AmazonConfigStopConfigurationRecorderCommand(configurationRecorderName).apply(init)) as com.amazonaws.services.config.model.StopConfigurationRecorderResult
}

@Generated
class AmazonConfigStopConfigurationRecorderCommand(val configurationRecorderName: String) : AmazonWebServiceCommand<com.amazonaws.services.config.model.StopConfigurationRecorderRequest, com.amazonaws.services.config.model.StopConfigurationRecorderResult> {



	override fun build(): com.amazonaws.services.config.model.StopConfigurationRecorderRequest {
		val input = com.amazonaws.services.config.model.StopConfigurationRecorderRequest()
		input.setConfigurationRecorderName(this.configurationRecorderName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.config.model.StopConfigurationRecorderResult {
	  return com.amazonaws.services.config.model.StopConfigurationRecorderResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.config.model.StopConfigurationRecorderResult {
		return environment.config.stopConfigurationRecorder(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws config stop-configuration-recorder")
				.argument("configuration-recorder-name", configurationRecorderName)
	}

}
