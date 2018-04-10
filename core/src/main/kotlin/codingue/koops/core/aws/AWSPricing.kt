
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.pricing.AWSPricing
import com.amazonaws.services.pricing.model.*

var codingue.koops.core.Environment.pricing: AWSPricing
	get() = this.capabilities[AWSPricing::class.java.name] as AWSPricing
	set(pricing) {
		this.capabilities[AWSPricing::class.java.name] = pricing
	}

@Generated
class AWSPricingFunctions(val block: Block)

infix fun AwsContinuation.pricing(init: AWSPricingFunctions.() -> Unit) {
	AWSPricingFunctions(shell).apply(init)
}

			

fun AWSPricingFunctions.describeServices(init: AWSPricingDescribeServicesCommand.() -> Unit) {
	this.block.declare(AWSPricingDescribeServicesCommand().apply(init))
}

@Generated
class AWSPricingDescribeServicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.pricing.model.DescribeServicesRequest> {

	var serviceCode: String? = null
	var formatVersion: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.pricing.model.DescribeServicesRequest {
		val input = com.amazonaws.services.pricing.model.DescribeServicesRequest()
		input.setServiceCode(this.serviceCode)
		input.setFormatVersion(this.formatVersion)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.pricing.describeServices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws pricing describe-services")
				.argument("service-code", serviceCode)
				.argument("format-version", formatVersion)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSPricingFunctions.getAttributeValues(serviceCode: String, attributeName: String, init: AWSPricingGetAttributeValuesCommand.() -> Unit) {
	this.block.declare(AWSPricingGetAttributeValuesCommand(serviceCode, attributeName).apply(init))
}

@Generated
class AWSPricingGetAttributeValuesCommand(val serviceCode: String, val attributeName: String) : AmazonWebServiceCommand<com.amazonaws.services.pricing.model.GetAttributeValuesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.pricing.model.GetAttributeValuesRequest {
		val input = com.amazonaws.services.pricing.model.GetAttributeValuesRequest()
		input.setServiceCode(this.serviceCode)
		input.setAttributeName(this.attributeName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.pricing.getAttributeValues(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws pricing get-attribute-values")
				.argument("service-code", serviceCode)
				.argument("attribute-name", attributeName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSPricingFunctions.getProducts(init: AWSPricingGetProductsCommand.() -> Unit) {
	this.block.declare(AWSPricingGetProductsCommand().apply(init))
}

@Generated
class AWSPricingGetProductsCommand() : AmazonWebServiceCommand<com.amazonaws.services.pricing.model.GetProductsRequest> {

	var serviceCode: String? = null
	var filters: List<com.amazonaws.services.pricing.model.Filter>? = null
	var formatVersion: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.pricing.model.GetProductsRequest {
		val input = com.amazonaws.services.pricing.model.GetProductsRequest()
		input.setServiceCode(this.serviceCode)
		input.setFilters(this.filters)
		input.setFormatVersion(this.formatVersion)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.pricing.getProducts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws pricing get-products")
				.argument("service-code", serviceCode)
				.argument("filters", filters?.toString())
				.argument("format-version", formatVersion)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}
