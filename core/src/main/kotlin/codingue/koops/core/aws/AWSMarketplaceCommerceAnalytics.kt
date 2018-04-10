
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.marketplacecommerceanalytics.AWSMarketplaceCommerceAnalytics
import com.amazonaws.services.marketplacecommerceanalytics.model.*

var codingue.koops.core.Environment.marketplacecommerceanalytics: AWSMarketplaceCommerceAnalytics
	get() = this.capabilities[AWSMarketplaceCommerceAnalytics::class.java.name] as AWSMarketplaceCommerceAnalytics
	set(marketplacecommerceanalytics) {
		this.capabilities[AWSMarketplaceCommerceAnalytics::class.java.name] = marketplacecommerceanalytics
	}

@Generated
class AWSMarketplaceCommerceAnalyticsFunctions(val block: Block)

infix fun AwsContinuation.marketplacecommerceanalytics(init: AWSMarketplaceCommerceAnalyticsFunctions.() -> Unit) {
	AWSMarketplaceCommerceAnalyticsFunctions(shell).apply(init)
}

			

fun AWSMarketplaceCommerceAnalyticsFunctions.generateDataSet(init: AWSMarketplaceCommerceAnalyticsGenerateDataSetCommand.() -> Unit) {
	this.block.declare(AWSMarketplaceCommerceAnalyticsGenerateDataSetCommand().apply(init))
}

@Generated
class AWSMarketplaceCommerceAnalyticsGenerateDataSetCommand() : AmazonWebServiceCommand<com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest> {

	var dataSetType: DataSetType? = null
	var dataSetPublicationDate: java.util.Date? = null
	var roleNameArn: String? = null
	var destinationS3BucketName: String? = null
	var destinationS3Prefix: String? = null
	var snsTopicArn: String? = null
	var customerDefinedValues: Map<String, String>? = null

	override fun build(): com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest {
		val input = com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest()
		input.setDataSetType(this.dataSetType?.toString())
		input.setDataSetPublicationDate(this.dataSetPublicationDate)
		input.setRoleNameArn(this.roleNameArn)
		input.setDestinationS3BucketName(this.destinationS3BucketName)
		input.setDestinationS3Prefix(this.destinationS3Prefix)
		input.setSnsTopicArn(this.snsTopicArn)
		input.setCustomerDefinedValues(this.customerDefinedValues)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.marketplacecommerceanalytics.generateDataSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws marketplacecommerceanalytics generate-data-set")
				.argument("data-set-type", dataSetType?.toString())
				.argument("data-set-publication-date", dataSetPublicationDate?.toString())
				.argument("role-name-arn", roleNameArn)
				.argument("destination-s3-bucket-name", destinationS3BucketName)
				.argument("destination-s3-prefix", destinationS3Prefix)
				.argument("sns-topic-arn", snsTopicArn)
				.argument("customer-defined-values", customerDefinedValues?.toString())
	}

}


fun AWSMarketplaceCommerceAnalyticsFunctions.startSupportDataExport(init: AWSMarketplaceCommerceAnalyticsStartSupportDataExportCommand.() -> Unit) {
	this.block.declare(AWSMarketplaceCommerceAnalyticsStartSupportDataExportCommand().apply(init))
}

@Generated
class AWSMarketplaceCommerceAnalyticsStartSupportDataExportCommand() : AmazonWebServiceCommand<com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest> {

	var dataSetType: SupportDataSetType? = null
	var fromDate: java.util.Date? = null
	var roleNameArn: String? = null
	var destinationS3BucketName: String? = null
	var destinationS3Prefix: String? = null
	var snsTopicArn: String? = null
	var customerDefinedValues: Map<String, String>? = null

	override fun build(): com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest {
		val input = com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest()
		input.setDataSetType(this.dataSetType?.toString())
		input.setFromDate(this.fromDate)
		input.setRoleNameArn(this.roleNameArn)
		input.setDestinationS3BucketName(this.destinationS3BucketName)
		input.setDestinationS3Prefix(this.destinationS3Prefix)
		input.setSnsTopicArn(this.snsTopicArn)
		input.setCustomerDefinedValues(this.customerDefinedValues)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.marketplacecommerceanalytics.startSupportDataExport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws marketplacecommerceanalytics start-support-data-export")
				.argument("data-set-type", dataSetType?.toString())
				.argument("from-date", fromDate?.toString())
				.argument("role-name-arn", roleNameArn)
				.argument("destination-s3-bucket-name", destinationS3BucketName)
				.argument("destination-s3-prefix", destinationS3Prefix)
				.argument("sns-topic-arn", snsTopicArn)
				.argument("customer-defined-values", customerDefinedValues?.toString())
	}

}