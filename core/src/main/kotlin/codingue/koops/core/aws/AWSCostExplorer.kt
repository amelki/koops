
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.costexplorer.AWSCostExplorer
import com.amazonaws.services.costexplorer.model.*

var codingue.koops.core.Environment.ce: AWSCostExplorer
	get() = this.capabilities[AWSCostExplorer::class.java.name] as AWSCostExplorer
	set(ce) {
		this.capabilities[AWSCostExplorer::class.java.name] = ce
	}

@Generated
class AWSCostExplorerFunctions(val block: Block)

infix fun AwsContinuation.ce(init: AWSCostExplorerFunctions.() -> Unit) {
	AWSCostExplorerFunctions(shell).apply(init)
}

			

fun AWSCostExplorerFunctions.getCostAndUsage(init: AWSCostExplorerGetCostAndUsageCommand.() -> Unit) {
	this.block.declare(AWSCostExplorerGetCostAndUsageCommand().apply(init))
}

@Generated
class AWSCostExplorerGetCostAndUsageCommand() : AmazonWebServiceCommand<com.amazonaws.services.costexplorer.model.GetCostAndUsageRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ce.getCostAndUsage(build())
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


fun AWSCostExplorerFunctions.getDimensionValues(timePeriod: com.amazonaws.services.costexplorer.model.DateInterval, dimension: Dimension, init: AWSCostExplorerGetDimensionValuesCommand.() -> Unit) {
	this.block.declare(AWSCostExplorerGetDimensionValuesCommand(timePeriod, dimension).apply(init))
}

@Generated
class AWSCostExplorerGetDimensionValuesCommand(val timePeriod: com.amazonaws.services.costexplorer.model.DateInterval, val dimension: Dimension) : AmazonWebServiceCommand<com.amazonaws.services.costexplorer.model.GetDimensionValuesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ce.getDimensionValues(build())
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


fun AWSCostExplorerFunctions.getReservationCoverage(timePeriod: com.amazonaws.services.costexplorer.model.DateInterval, init: AWSCostExplorerGetReservationCoverageCommand.() -> Unit) {
	this.block.declare(AWSCostExplorerGetReservationCoverageCommand(timePeriod).apply(init))
}

@Generated
class AWSCostExplorerGetReservationCoverageCommand(val timePeriod: com.amazonaws.services.costexplorer.model.DateInterval) : AmazonWebServiceCommand<com.amazonaws.services.costexplorer.model.GetReservationCoverageRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ce.getReservationCoverage(build())
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


fun AWSCostExplorerFunctions.getReservationPurchaseRecommendation(service: String, init: AWSCostExplorerGetReservationPurchaseRecommendationCommand.() -> Unit) {
	this.block.declare(AWSCostExplorerGetReservationPurchaseRecommendationCommand(service).apply(init))
}

@Generated
class AWSCostExplorerGetReservationPurchaseRecommendationCommand(val service: String) : AmazonWebServiceCommand<com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ce.getReservationPurchaseRecommendation(build())
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


fun AWSCostExplorerFunctions.getReservationUtilization(timePeriod: com.amazonaws.services.costexplorer.model.DateInterval, init: AWSCostExplorerGetReservationUtilizationCommand.() -> Unit) {
	this.block.declare(AWSCostExplorerGetReservationUtilizationCommand(timePeriod).apply(init))
}

@Generated
class AWSCostExplorerGetReservationUtilizationCommand(val timePeriod: com.amazonaws.services.costexplorer.model.DateInterval) : AmazonWebServiceCommand<com.amazonaws.services.costexplorer.model.GetReservationUtilizationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ce.getReservationUtilization(build())
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


fun AWSCostExplorerFunctions.getTags(timePeriod: com.amazonaws.services.costexplorer.model.DateInterval, init: AWSCostExplorerGetTagsCommand.() -> Unit) {
	this.block.declare(AWSCostExplorerGetTagsCommand(timePeriod).apply(init))
}

@Generated
class AWSCostExplorerGetTagsCommand(val timePeriod: com.amazonaws.services.costexplorer.model.DateInterval) : AmazonWebServiceCommand<com.amazonaws.services.costexplorer.model.GetTagsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ce.getTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ce get-tags")
				.argument("search-string", searchString)
				.argument("time-period", timePeriod.toString())
				.argument("tag-key", tagKey)
				.argument("next-page-token", nextPageToken)
	}

}
