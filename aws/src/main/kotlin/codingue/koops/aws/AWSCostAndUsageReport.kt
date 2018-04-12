
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.costandusagereport.*
import com.amazonaws.services.costandusagereport.model.*

var codingue.koops.core.Environment.cur: AWSCostAndUsageReport
	get() {
		var service = this.capabilities["aws-cur"]
		if (service == null) {
			service = AWSCostAndUsageReportClientBuilder.standard().build()
			this.capabilities["aws-cur"] = service
		}
		return service as AWSCostAndUsageReport
	}
	set(cur) {
		this.capabilities["aws-cur"] = cur
	}

@Generated
class AWSCostAndUsageReportFunctions(val block: Block)

infix fun <T> AwsContinuation.cur(init: AWSCostAndUsageReportFunctions.() -> T): T {
	return AWSCostAndUsageReportFunctions(shell).run(init)
}

			

fun AWSCostAndUsageReportFunctions.deleteReportDefinition(init: AWSCostAndUsageReportDeleteReportDefinitionCommand.() -> Unit): com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionResult {
	return this.block.declare(AWSCostAndUsageReportDeleteReportDefinitionCommand().apply(init)) as com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionResult
}

@Generated
class AWSCostAndUsageReportDeleteReportDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest, com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionResult> {

	var reportName: String? = null

	override fun build(): com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest {
		val input = com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest()
		input.setReportName(this.reportName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionResult {
	  return com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionResult {
		return environment.cur.deleteReportDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cur delete-report-definition")
				.argument("report-name", reportName)
	}

}


fun AWSCostAndUsageReportFunctions.describeReportDefinitions(init: AWSCostAndUsageReportDescribeReportDefinitionsCommand.() -> Unit): com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsResult {
	return this.block.declare(AWSCostAndUsageReportDescribeReportDefinitionsCommand().apply(init)) as com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsResult
}

@Generated
class AWSCostAndUsageReportDescribeReportDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest, com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest {
		val input = com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsResult {
	  return com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsResult {
		return environment.cur.describeReportDefinitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cur describe-report-definitions")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCostAndUsageReportFunctions.putReportDefinition(reportDefinition: com.amazonaws.services.costandusagereport.model.ReportDefinition, init: AWSCostAndUsageReportPutReportDefinitionCommand.() -> Unit): com.amazonaws.services.costandusagereport.model.PutReportDefinitionResult {
	return this.block.declare(AWSCostAndUsageReportPutReportDefinitionCommand(reportDefinition).apply(init)) as com.amazonaws.services.costandusagereport.model.PutReportDefinitionResult
}

@Generated
class AWSCostAndUsageReportPutReportDefinitionCommand(val reportDefinition: com.amazonaws.services.costandusagereport.model.ReportDefinition) : AmazonWebServiceCommand<com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest, com.amazonaws.services.costandusagereport.model.PutReportDefinitionResult> {



	override fun build(): com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest {
		val input = com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest()
		input.setReportDefinition(this.reportDefinition)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.costandusagereport.model.PutReportDefinitionResult {
	  return com.amazonaws.services.costandusagereport.model.PutReportDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.costandusagereport.model.PutReportDefinitionResult {
		return environment.cur.putReportDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cur put-report-definition")
				.argument("report-definition", reportDefinition.toString())
	}

}
