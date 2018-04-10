
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.costandusagereport.AWSCostAndUsageReport
import com.amazonaws.services.costandusagereport.model.*

var codingue.koops.core.Environment.cur: AWSCostAndUsageReport
	get() = this.capabilities[AWSCostAndUsageReport::class.java.name] as AWSCostAndUsageReport
	set(cur) {
		this.capabilities[AWSCostAndUsageReport::class.java.name] = cur
	}

@Generated
class AWSCostAndUsageReportFunctions(val block: Block)

infix fun AwsContinuation.cur(init: AWSCostAndUsageReportFunctions.() -> Unit) {
	AWSCostAndUsageReportFunctions(shell).apply(init)
}

			

fun AWSCostAndUsageReportFunctions.deleteReportDefinition(init: AWSCostAndUsageReportDeleteReportDefinitionCommand.() -> Unit) {
	this.block.declare(AWSCostAndUsageReportDeleteReportDefinitionCommand().apply(init))
}

@Generated
class AWSCostAndUsageReportDeleteReportDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest> {

	var reportName: String? = null

	override fun build(): com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest {
		val input = com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest()
		input.setReportName(this.reportName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cur.deleteReportDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cur delete-report-definition")
				.argument("report-name", reportName)
	}

}


fun AWSCostAndUsageReportFunctions.describeReportDefinitions(init: AWSCostAndUsageReportDescribeReportDefinitionsCommand.() -> Unit) {
	this.block.declare(AWSCostAndUsageReportDescribeReportDefinitionsCommand().apply(init))
}

@Generated
class AWSCostAndUsageReportDescribeReportDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest {
		val input = com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cur.describeReportDefinitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cur describe-report-definitions")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCostAndUsageReportFunctions.putReportDefinition(reportDefinition: com.amazonaws.services.costandusagereport.model.ReportDefinition, init: AWSCostAndUsageReportPutReportDefinitionCommand.() -> Unit) {
	this.block.declare(AWSCostAndUsageReportPutReportDefinitionCommand(reportDefinition).apply(init))
}

@Generated
class AWSCostAndUsageReportPutReportDefinitionCommand(val reportDefinition: com.amazonaws.services.costandusagereport.model.ReportDefinition) : AmazonWebServiceCommand<com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest> {



	override fun build(): com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest {
		val input = com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest()
		input.setReportDefinition(this.reportDefinition)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cur.putReportDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cur put-report-definition")
				.argument("report-definition", reportDefinition.toString())
	}

}