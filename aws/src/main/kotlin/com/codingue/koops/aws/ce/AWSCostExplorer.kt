
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.ce

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.costexplorer.*
import com.amazonaws.services.costexplorer.model.*

var com.codingue.koops.core.Environment.ce: AWSCostExplorer
	get() {
		var service = this.capabilities["aws-ce"]
		if (service == null) {
			service = AWSCostExplorerClientBuilder.standard().build()
			this.capabilities["aws-ce"] = service
		}
		return service as AWSCostExplorer
	}
	set(ce) {
		this.capabilities["aws-ce"] = ce
	}

@Generated
class AWSCostExplorerFunctions(val block: Script)

infix fun <T> AwsContinuation.ce(init: AWSCostExplorerFunctions.() -> T): T {
	return AWSCostExplorerFunctions(shell).run(init)
}

			

fun AWSCostExplorerFunctions.getCostAndUsage(init: (AWSCostExplorerGetCostAndUsageCommand.() -> Unit)? = null): com.amazonaws.services.costexplorer.model.GetCostAndUsageResult {
	return this.block.declare(AWSCostExplorerGetCostAndUsageCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.costexplorer.model.GetCostAndUsageResult
}

@Generated
class AWSCostExplorerGetCostAndUsageCommand() : AmazonWebServiceCommand<com.amazonaws.services.costexplorer.model.GetCostAndUsageRequest, com.amazonaws.services.costexplorer.model.GetCostAndUsageResult> {

	var timePeriod: com.amazonaws.services.costexplorer.model.DateInterval? = null
	var granularity: Granularity? = null
	var filter: com.amazonaws.services.costexplorer.model.Expression? = null
	var metrics: List<String>? = null
	var groupBy: List<com.amazonaws.services.costexplorer.model.GroupDefinition>? = null
	var nextPageToken: String? = null

	override fun build(): com.amazonaws.services.costexplorer.model.GetCostAndUsageRequest {
		val input = com.amazonaws.services.costexplorer.model.GetCostAndUsageRequest()
		input.setTimePeriod(this.timePeriod)
		input.setGranularity(this.granularity?.toString())
		input.setFilter(this.filter)
		input.setMetrics(this.metrics)
		input.setGroupBy(this.groupBy)
		input.setNextPageToken(this.nextPageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.costexplorer.model.GetCostAndUsageResult {
	  return com.amazonaws.services.costexplorer.model.GetCostAndUsageResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.costexplorer.model.GetCostAndUsageResult {
		return environment.ce.getCostAndUsage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ce get-cost-and-usage")
				.argument("time-period", timePeriod?.toString())
				.argument("granularity", granularity?.toString())
				.argument("filter", filter?.toString())
				.argument("metrics", metrics?.toString())
				.argument("group-by", groupBy?.toString())
				.argument("next-page-token", nextPageToken)
	}

}


fun AWSCostExplorerFunctions.getDimensionValues(timePeriod: com.amazonaws.services.costexplorer.model.DateInterval, dimension: Dimension, init: (AWSCostExplorerGetDimensionValuesCommand.() -> Unit)? = null): com.amazonaws.services.costexplorer.model.GetDimensionValuesResult {
	return this.block.declare(AWSCostExplorerGetDimensionValuesCommand(timePeriod, dimension).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.costexplorer.model.GetDimensionValuesResult
}

@Generated
class AWSCostExplorerGetDimensionValuesCommand(val timePeriod: com.amazonaws.services.costexplorer.model.DateInterval, val dimension: Dimension) : AmazonWebServiceCommand<com.amazonaws.services.costexplorer.model.GetDimensionValuesRequest, com.amazonaws.services.costexplorer.model.GetDimensionValuesResult> {

	var searchString: String? = null
	var context: Context? = null
	var nextPageToken: String? = null

	override fun build(): com.amazonaws.services.costexplorer.model.GetDimensionValuesRequest {
		val input = com.amazonaws.services.costexplorer.model.GetDimensionValuesRequest()
		input.setSearchString(this.searchString)
		input.setTimePeriod(this.timePeriod)
		input.setDimension(this.dimension.toString())
		input.setContext(this.context?.toString())
		input.setNextPageToken(this.nextPageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.costexplorer.model.GetDimensionValuesResult {
	  return com.amazonaws.services.costexplorer.model.GetDimensionValuesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.costexplorer.model.GetDimensionValuesResult {
		return environment.ce.getDimensionValues(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ce get-dimension-values")
				.argument("search-string", searchString)
				.argument("time-period", timePeriod.toString())
				.argument("dimension", dimension.toString())
				.argument("context", context?.toString())
				.argument("next-page-token", nextPageToken)
	}

}


fun AWSCostExplorerFunctions.getReservationCoverage(timePeriod: com.amazonaws.services.costexplorer.model.DateInterval, init: (AWSCostExplorerGetReservationCoverageCommand.() -> Unit)? = null): com.amazonaws.services.costexplorer.model.GetReservationCoverageResult {
	return this.block.declare(AWSCostExplorerGetReservationCoverageCommand(timePeriod).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.costexplorer.model.GetReservationCoverageResult
}

@Generated
class AWSCostExplorerGetReservationCoverageCommand(val timePeriod: com.amazonaws.services.costexplorer.model.DateInterval) : AmazonWebServiceCommand<com.amazonaws.services.costexplorer.model.GetReservationCoverageRequest, com.amazonaws.services.costexplorer.model.GetReservationCoverageResult> {

	var groupBy: List<com.amazonaws.services.costexplorer.model.GroupDefinition>? = null
	var granularity: Granularity? = null
	var filter: com.amazonaws.services.costexplorer.model.Expression? = null
	var nextPageToken: String? = null

	override fun build(): com.amazonaws.services.costexplorer.model.GetReservationCoverageRequest {
		val input = com.amazonaws.services.costexplorer.model.GetReservationCoverageRequest()
		input.setTimePeriod(this.timePeriod)
		input.setGroupBy(this.groupBy)
		input.setGranularity(this.granularity?.toString())
		input.setFilter(this.filter)
		input.setNextPageToken(this.nextPageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.costexplorer.model.GetReservationCoverageResult {
	  return com.amazonaws.services.costexplorer.model.GetReservationCoverageResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.costexplorer.model.GetReservationCoverageResult {
		return environment.ce.getReservationCoverage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ce get-reservation-coverage")
				.argument("time-period", timePeriod.toString())
				.argument("group-by", groupBy?.toString())
				.argument("granularity", granularity?.toString())
				.argument("filter", filter?.toString())
				.argument("next-page-token", nextPageToken)
	}

}


fun AWSCostExplorerFunctions.getReservationPurchaseRecommendation(service: String, init: (AWSCostExplorerGetReservationPurchaseRecommendationCommand.() -> Unit)? = null): com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationResult {
	return this.block.declare(AWSCostExplorerGetReservationPurchaseRecommendationCommand(service).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationResult
}

@Generated
class AWSCostExplorerGetReservationPurchaseRecommendationCommand(val service: String) : AmazonWebServiceCommand<com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationRequest, com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationResult> {

	var accountId: String? = null
	var accountScope: AccountScope? = null
	var lookbackPeriodInDays: LookbackPeriodInDays? = null
	var termInYears: TermInYears? = null
	var paymentOption: PaymentOption? = null
	var serviceSpecification: com.amazonaws.services.costexplorer.model.ServiceSpecification? = null
	var pageSize: Int? = 0
	var nextPageToken: String? = null

	override fun build(): com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationRequest {
		val input = com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationRequest()
		input.setAccountId(this.accountId)
		input.setService(this.service)
		input.setAccountScope(this.accountScope?.toString())
		input.setLookbackPeriodInDays(this.lookbackPeriodInDays?.toString())
		input.setTermInYears(this.termInYears?.toString())
		input.setPaymentOption(this.paymentOption?.toString())
		input.setServiceSpecification(this.serviceSpecification)
		input.setPageSize(this.pageSize)
		input.setNextPageToken(this.nextPageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationResult {
	  return com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationResult {
		return environment.ce.getReservationPurchaseRecommendation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ce get-reservation-purchase-recommendation")
				.argument("account-id", accountId)
				.argument("service", service)
				.argument("account-scope", accountScope?.toString())
				.argument("lookback-period-in-days", lookbackPeriodInDays?.toString())
				.argument("term-in-years", termInYears?.toString())
				.argument("payment-option", paymentOption?.toString())
				.argument("service-specification", serviceSpecification?.toString())
				.argument("page-size", pageSize?.toString())
				.argument("next-page-token", nextPageToken)
	}

}


fun AWSCostExplorerFunctions.getReservationUtilization(timePeriod: com.amazonaws.services.costexplorer.model.DateInterval, init: (AWSCostExplorerGetReservationUtilizationCommand.() -> Unit)? = null): com.amazonaws.services.costexplorer.model.GetReservationUtilizationResult {
	return this.block.declare(AWSCostExplorerGetReservationUtilizationCommand(timePeriod).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.costexplorer.model.GetReservationUtilizationResult
}

@Generated
class AWSCostExplorerGetReservationUtilizationCommand(val timePeriod: com.amazonaws.services.costexplorer.model.DateInterval) : AmazonWebServiceCommand<com.amazonaws.services.costexplorer.model.GetReservationUtilizationRequest, com.amazonaws.services.costexplorer.model.GetReservationUtilizationResult> {

	var groupBy: List<com.amazonaws.services.costexplorer.model.GroupDefinition>? = null
	var granularity: Granularity? = null
	var filter: com.amazonaws.services.costexplorer.model.Expression? = null
	var nextPageToken: String? = null

	override fun build(): com.amazonaws.services.costexplorer.model.GetReservationUtilizationRequest {
		val input = com.amazonaws.services.costexplorer.model.GetReservationUtilizationRequest()
		input.setTimePeriod(this.timePeriod)
		input.setGroupBy(this.groupBy)
		input.setGranularity(this.granularity?.toString())
		input.setFilter(this.filter)
		input.setNextPageToken(this.nextPageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.costexplorer.model.GetReservationUtilizationResult {
	  return com.amazonaws.services.costexplorer.model.GetReservationUtilizationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.costexplorer.model.GetReservationUtilizationResult {
		return environment.ce.getReservationUtilization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ce get-reservation-utilization")
				.argument("time-period", timePeriod.toString())
				.argument("group-by", groupBy?.toString())
				.argument("granularity", granularity?.toString())
				.argument("filter", filter?.toString())
				.argument("next-page-token", nextPageToken)
	}

}


fun AWSCostExplorerFunctions.getTags(timePeriod: com.amazonaws.services.costexplorer.model.DateInterval, init: (AWSCostExplorerGetTagsCommand.() -> Unit)? = null): com.amazonaws.services.costexplorer.model.GetTagsResult {
	return this.block.declare(AWSCostExplorerGetTagsCommand(timePeriod).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.costexplorer.model.GetTagsResult
}

@Generated
class AWSCostExplorerGetTagsCommand(val timePeriod: com.amazonaws.services.costexplorer.model.DateInterval) : AmazonWebServiceCommand<com.amazonaws.services.costexplorer.model.GetTagsRequest, com.amazonaws.services.costexplorer.model.GetTagsResult> {

	var searchString: String? = null
	var tagKey: String? = null
	var nextPageToken: String? = null

	override fun build(): com.amazonaws.services.costexplorer.model.GetTagsRequest {
		val input = com.amazonaws.services.costexplorer.model.GetTagsRequest()
		input.setSearchString(this.searchString)
		input.setTimePeriod(this.timePeriod)
		input.setTagKey(this.tagKey)
		input.setNextPageToken(this.nextPageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.costexplorer.model.GetTagsResult {
	  return com.amazonaws.services.costexplorer.model.GetTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.costexplorer.model.GetTagsResult {
		return environment.ce.getTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ce get-tags")
				.argument("search-string", searchString)
				.argument("time-period", timePeriod.toString())
				.argument("tag-key", tagKey)
				.argument("next-page-token", nextPageToken)
	}

}
