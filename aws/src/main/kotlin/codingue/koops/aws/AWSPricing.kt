
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.pricing.*
import com.amazonaws.services.pricing.model.*

var codingue.koops.core.Environment.pricing: AWSPricing
	get() {
		var service = this.capabilities["aws-pricing"]
		if (service == null) {
			service = AWSPricingClientBuilder.standard().build()
			this.capabilities["aws-pricing"] = service
		}
		return service as AWSPricing
	}
	set(pricing) {
		this.capabilities["aws-pricing"] = pricing
	}

@Generated
class AWSPricingFunctions(val block: Block)

infix fun <T> AwsContinuation.pricing(init: AWSPricingFunctions.() -> T): T {
	return AWSPricingFunctions(shell).run(init)
}

			

fun AWSPricingFunctions.describeServices(init: AWSPricingDescribeServicesCommand.() -> Unit): com.amazonaws.services.pricing.model.DescribeServicesResult {
	return this.block.declare(AWSPricingDescribeServicesCommand().apply(init)) as com.amazonaws.services.pricing.model.DescribeServicesResult
}

@Generated
class AWSPricingDescribeServicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.pricing.model.DescribeServicesRequest, com.amazonaws.services.pricing.model.DescribeServicesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.pricing.model.DescribeServicesResult {
	  return com.amazonaws.services.pricing.model.DescribeServicesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pricing.model.DescribeServicesResult {
		return environment.pricing.describeServices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws pricing describe-services")
				.argument("service-code", serviceCode)
				.argument("format-version", formatVersion)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSPricingFunctions.getAttributeValues(serviceCode: String, attributeName: String, init: AWSPricingGetAttributeValuesCommand.() -> Unit): com.amazonaws.services.pricing.model.GetAttributeValuesResult {
	return this.block.declare(AWSPricingGetAttributeValuesCommand(serviceCode, attributeName).apply(init)) as com.amazonaws.services.pricing.model.GetAttributeValuesResult
}

@Generated
class AWSPricingGetAttributeValuesCommand(val serviceCode: String, val attributeName: String) : AmazonWebServiceCommand<com.amazonaws.services.pricing.model.GetAttributeValuesRequest, com.amazonaws.services.pricing.model.GetAttributeValuesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.pricing.model.GetAttributeValuesResult {
	  return com.amazonaws.services.pricing.model.GetAttributeValuesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pricing.model.GetAttributeValuesResult {
		return environment.pricing.getAttributeValues(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws pricing get-attribute-values")
				.argument("service-code", serviceCode)
				.argument("attribute-name", attributeName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSPricingFunctions.getProducts(init: AWSPricingGetProductsCommand.() -> Unit): com.amazonaws.services.pricing.model.GetProductsResult {
	return this.block.declare(AWSPricingGetProductsCommand().apply(init)) as com.amazonaws.services.pricing.model.GetProductsResult
}

@Generated
class AWSPricingGetProductsCommand() : AmazonWebServiceCommand<com.amazonaws.services.pricing.model.GetProductsRequest, com.amazonaws.services.pricing.model.GetProductsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.pricing.model.GetProductsResult {
	  return com.amazonaws.services.pricing.model.GetProductsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.pricing.model.GetProductsResult {
		return environment.pricing.getProducts(build())
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
