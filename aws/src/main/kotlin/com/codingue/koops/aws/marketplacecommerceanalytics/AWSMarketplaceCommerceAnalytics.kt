
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.marketplacecommerceanalytics

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.marketplacecommerceanalytics.*
import com.amazonaws.services.marketplacecommerceanalytics.model.*

var com.codingue.koops.core.Environment.marketplacecommerceanalytics: AWSMarketplaceCommerceAnalytics
	get() {
		var service = this.capabilities["aws-marketplacecommerceanalytics"]
		if (service == null) {
			service = AWSMarketplaceCommerceAnalyticsClientBuilder.standard().build()
			this.capabilities["aws-marketplacecommerceanalytics"] = service
		}
		return service as AWSMarketplaceCommerceAnalytics
	}
	set(marketplacecommerceanalytics) {
		this.capabilities["aws-marketplacecommerceanalytics"] = marketplacecommerceanalytics
	}

@Generated
class AWSMarketplaceCommerceAnalyticsFunctions(val block: Script)

infix fun <T> AwsContinuation.marketplacecommerceanalytics(init: AWSMarketplaceCommerceAnalyticsFunctions.() -> T): T {
	return AWSMarketplaceCommerceAnalyticsFunctions(shell).run(init)
}

			

fun AWSMarketplaceCommerceAnalyticsFunctions.generateDataSet(init: (AWSMarketplaceCommerceAnalyticsGenerateDataSetCommand.() -> Unit)? = null): com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetResult {
	return this.block.declare(AWSMarketplaceCommerceAnalyticsGenerateDataSetCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetResult
}

@Generated
class AWSMarketplaceCommerceAnalyticsGenerateDataSetCommand() : AmazonWebServiceCommand<com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetRequest, com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetResult> {

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

	
	override fun dryResult(): com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetResult {
	  return com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.marketplacecommerceanalytics.model.GenerateDataSetResult {
		return environment.marketplacecommerceanalytics.generateDataSet(build())
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


fun AWSMarketplaceCommerceAnalyticsFunctions.startSupportDataExport(init: (AWSMarketplaceCommerceAnalyticsStartSupportDataExportCommand.() -> Unit)? = null): com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportResult {
	return this.block.declare(AWSMarketplaceCommerceAnalyticsStartSupportDataExportCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportResult
}

@Generated
class AWSMarketplaceCommerceAnalyticsStartSupportDataExportCommand() : AmazonWebServiceCommand<com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportRequest, com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportResult> {

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

	
	override fun dryResult(): com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportResult {
	  return com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.marketplacecommerceanalytics.model.StartSupportDataExportResult {
		return environment.marketplacecommerceanalytics.startSupportDataExport(build())
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
