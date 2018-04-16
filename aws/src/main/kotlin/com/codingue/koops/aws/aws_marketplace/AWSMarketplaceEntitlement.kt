
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.aws_marketplace

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.marketplaceentitlement.*
import com.amazonaws.services.marketplaceentitlement.model.*

var com.codingue.koops.core.Environment.aws_marketplace: AWSMarketplaceEntitlement
	get() {
		var service = this.capabilities["aws-aws_marketplace"]
		if (service == null) {
			service = AWSMarketplaceEntitlementClientBuilder.standard().build()
			this.capabilities["aws-aws_marketplace"] = service
		}
		return service as AWSMarketplaceEntitlement
	}
	set(aws_marketplace) {
		this.capabilities["aws-aws_marketplace"] = aws_marketplace
	}

@Generated
class AWSMarketplaceEntitlementFunctions(val block: Block)

infix fun <T> AwsContinuation.aws_marketplace(init: AWSMarketplaceEntitlementFunctions.() -> T): T {
	return AWSMarketplaceEntitlementFunctions(shell).run(init)
}

			

fun AWSMarketplaceEntitlementFunctions.getEntitlements(productCode: String, init: (AWSMarketplaceEntitlementGetEntitlementsCommand.() -> Unit)? = null): com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsResult {
	return this.block.declare(AWSMarketplaceEntitlementGetEntitlementsCommand(productCode).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsResult
}

@Generated
class AWSMarketplaceEntitlementGetEntitlementsCommand(val productCode: String) : AmazonWebServiceCommand<com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest, com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsResult> {

	var filter: Map<GetEntitlementFilterName, List<String>>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest {
		val input = com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest()
		input.setProductCode(this.productCode)
		input.setFilter(this.filter?.mapKeys { it.toString() })
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsResult {
	  return com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsResult {
		return environment.aws_marketplace.getEntitlements(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws aws-marketplace get-entitlements")
				.argument("product-code", productCode)
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}
