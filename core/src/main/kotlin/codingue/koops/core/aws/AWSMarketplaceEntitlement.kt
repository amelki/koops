
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.marketplaceentitlement.AWSMarketplaceEntitlement
import com.amazonaws.services.marketplaceentitlement.model.*

var codingue.koops.core.Environment.aws_marketplace: AWSMarketplaceEntitlement
	get() = this.capabilities[AWSMarketplaceEntitlement::class.java.name] as AWSMarketplaceEntitlement
	set(aws_marketplace) {
		this.capabilities[AWSMarketplaceEntitlement::class.java.name] = aws_marketplace
	}

@Generated
class AWSMarketplaceEntitlementFunctions(val block: Block)

infix fun AwsContinuation.aws_marketplace(init: AWSMarketplaceEntitlementFunctions.() -> Unit) {
	AWSMarketplaceEntitlementFunctions(shell).apply(init)
}

			

fun AWSMarketplaceEntitlementFunctions.getEntitlements(productCode: String, init: AWSMarketplaceEntitlementGetEntitlementsCommand.() -> Unit) {
	this.block.declare(AWSMarketplaceEntitlementGetEntitlementsCommand(productCode).apply(init))
}

@Generated
class AWSMarketplaceEntitlementGetEntitlementsCommand(val productCode: String) : AmazonWebServiceCommand<com.amazonaws.services.marketplaceentitlement.model.GetEntitlementsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.aws_marketplace.getEntitlements(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws aws-marketplace get-entitlements")
				.argument("product-code", productCode)
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}
