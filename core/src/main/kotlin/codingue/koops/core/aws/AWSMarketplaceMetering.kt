
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.marketplacemetering.AWSMarketplaceMetering
import com.amazonaws.services.marketplacemetering.model.*

var codingue.koops.core.Environment.meteringmarketplace: AWSMarketplaceMetering
	get() = this.capabilities[AWSMarketplaceMetering::class.java.name] as AWSMarketplaceMetering
	set(meteringmarketplace) {
		this.capabilities[AWSMarketplaceMetering::class.java.name] = meteringmarketplace
	}

@Generated
class AWSMarketplaceMeteringFunctions(val block: Block)

infix fun AwsContinuation.meteringmarketplace(init: AWSMarketplaceMeteringFunctions.() -> Unit) {
	AWSMarketplaceMeteringFunctions(shell).apply(init)
}

			

fun AWSMarketplaceMeteringFunctions.batchMeterUsage(usageRecords: List<com.amazonaws.services.marketplacemetering.model.UsageRecord>, productCode: String, init: AWSMarketplaceMeteringBatchMeterUsageCommand.() -> Unit) {
	this.block.declare(AWSMarketplaceMeteringBatchMeterUsageCommand(usageRecords, productCode).apply(init))
}

@Generated
class AWSMarketplaceMeteringBatchMeterUsageCommand(val usageRecords: List<com.amazonaws.services.marketplacemetering.model.UsageRecord>, val productCode: String) : AmazonWebServiceCommand<com.amazonaws.services.marketplacemetering.model.BatchMeterUsageRequest> {



	override fun build(): com.amazonaws.services.marketplacemetering.model.BatchMeterUsageRequest {
		val input = com.amazonaws.services.marketplacemetering.model.BatchMeterUsageRequest()
		input.setUsageRecords(this.usageRecords)
		input.setProductCode(this.productCode)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.meteringmarketplace.batchMeterUsage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws meteringmarketplace batch-meter-usage")
				.argument("usage-records", usageRecords.toString())
				.argument("product-code", productCode)
	}

}


fun AWSMarketplaceMeteringFunctions.meterUsage(productCode: String, timestamp: java.util.Date, usageDimension: String, usageQuantity: Int, dryRun: Boolean, init: AWSMarketplaceMeteringMeterUsageCommand.() -> Unit) {
	this.block.declare(AWSMarketplaceMeteringMeterUsageCommand(productCode, timestamp, usageDimension, usageQuantity, dryRun).apply(init))
}

@Generated
class AWSMarketplaceMeteringMeterUsageCommand(val productCode: String, val timestamp: java.util.Date, val usageDimension: String, val usageQuantity: Int, val dryRun: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.marketplacemetering.model.MeterUsageRequest> {



	override fun build(): com.amazonaws.services.marketplacemetering.model.MeterUsageRequest {
		val input = com.amazonaws.services.marketplacemetering.model.MeterUsageRequest()
		input.setProductCode(this.productCode)
		input.setTimestamp(this.timestamp)
		input.setUsageDimension(this.usageDimension)
		input.setUsageQuantity(this.usageQuantity)
		input.setDryRun(this.dryRun)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.meteringmarketplace.meterUsage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws meteringmarketplace meter-usage")
				.argument("product-code", productCode)
				.argument("timestamp", timestamp.toString())
				.argument("usage-dimension", usageDimension)
				.argument("usage-quantity", usageQuantity.toString())
				.option("dry-run", dryRun ?: false)
	}

}


fun AWSMarketplaceMeteringFunctions.resolveCustomer(registrationToken: String, init: AWSMarketplaceMeteringResolveCustomerCommand.() -> Unit) {
	this.block.declare(AWSMarketplaceMeteringResolveCustomerCommand(registrationToken).apply(init))
}

@Generated
class AWSMarketplaceMeteringResolveCustomerCommand(val registrationToken: String) : AmazonWebServiceCommand<com.amazonaws.services.marketplacemetering.model.ResolveCustomerRequest> {



	override fun build(): com.amazonaws.services.marketplacemetering.model.ResolveCustomerRequest {
		val input = com.amazonaws.services.marketplacemetering.model.ResolveCustomerRequest()
		input.setRegistrationToken(this.registrationToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.meteringmarketplace.resolveCustomer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws meteringmarketplace resolve-customer")
				.argument("registration-token", registrationToken)
	}

}