
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.inspector.AmazonInspector
import com.amazonaws.services.inspector.model.*

var codingue.koops.core.Environment.inspector: AmazonInspector
	get() = this.capabilities[AmazonInspector::class.java.name] as AmazonInspector
	set(inspector) {
		this.capabilities[AmazonInspector::class.java.name] = inspector
	}

@Generated
class AmazonInspectorFunctions(val block: Block)

infix fun <T> AwsContinuation.inspector(init: AmazonInspectorFunctions.() -> T): T {
	return AmazonInspectorFunctions(shell).run(init)
}

			

fun AmazonInspectorFunctions.addAttributesToFindings(init: AmazonInspectorAddAttributesToFindingsCommand.() -> Unit): com.amazonaws.services.inspector.model.AddAttributesToFindingsResult {
	return this.block.declare(AmazonInspectorAddAttributesToFindingsCommand().apply(init)) as com.amazonaws.services.inspector.model.AddAttributesToFindingsResult
}

@Generated
class AmazonInspectorAddAttributesToFindingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest, com.amazonaws.services.inspector.model.AddAttributesToFindingsResult> {

	var findingArns: List<String>? = null
	var attributes: List<com.amazonaws.services.inspector.model.Attribute>? = null

	override fun build(): com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest {
		val input = com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest()
		input.setFindingArns(this.findingArns)
		input.setAttributes(this.attributes)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.AddAttributesToFindingsResult {
	  return com.amazonaws.services.inspector.model.AddAttributesToFindingsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.AddAttributesToFindingsResult {
		return environment.inspector.addAttributesToFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector add-attributes-to-findings")
				.argument("finding-arns", findingArns?.toString())
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonInspectorFunctions.createAssessmentTarget(init: AmazonInspectorCreateAssessmentTargetCommand.() -> Unit): com.amazonaws.services.inspector.model.CreateAssessmentTargetResult {
	return this.block.declare(AmazonInspectorCreateAssessmentTargetCommand().apply(init)) as com.amazonaws.services.inspector.model.CreateAssessmentTargetResult
}

@Generated
class AmazonInspectorCreateAssessmentTargetCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest, com.amazonaws.services.inspector.model.CreateAssessmentTargetResult> {

	var assessmentTargetName: String? = null
	var resourceGroupArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest {
		val input = com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest()
		input.setAssessmentTargetName(this.assessmentTargetName)
		input.setResourceGroupArn(this.resourceGroupArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.CreateAssessmentTargetResult {
	  return com.amazonaws.services.inspector.model.CreateAssessmentTargetResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.CreateAssessmentTargetResult {
		return environment.inspector.createAssessmentTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector create-assessment-target")
				.argument("assessment-target-name", assessmentTargetName)
				.argument("resource-group-arn", resourceGroupArn)
	}

}


fun AmazonInspectorFunctions.createAssessmentTemplate(init: AmazonInspectorCreateAssessmentTemplateCommand.() -> Unit): com.amazonaws.services.inspector.model.CreateAssessmentTemplateResult {
	return this.block.declare(AmazonInspectorCreateAssessmentTemplateCommand().apply(init)) as com.amazonaws.services.inspector.model.CreateAssessmentTemplateResult
}

@Generated
class AmazonInspectorCreateAssessmentTemplateCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.CreateAssessmentTemplateRequest, com.amazonaws.services.inspector.model.CreateAssessmentTemplateResult> {

	var assessmentTargetArn: String? = null
	var assessmentTemplateName: String? = null
	var durationInSeconds: Int? = 0
	var rulesPackageArns: List<String>? = null
	var userAttributesForFindings: List<com.amazonaws.services.inspector.model.Attribute>? = null

	override fun build(): com.amazonaws.services.inspector.model.CreateAssessmentTemplateRequest {
		val input = com.amazonaws.services.inspector.model.CreateAssessmentTemplateRequest()
		input.setAssessmentTargetArn(this.assessmentTargetArn)
		input.setAssessmentTemplateName(this.assessmentTemplateName)
		input.setDurationInSeconds(this.durationInSeconds)
		input.setRulesPackageArns(this.rulesPackageArns)
		input.setUserAttributesForFindings(this.userAttributesForFindings)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.CreateAssessmentTemplateResult {
	  return com.amazonaws.services.inspector.model.CreateAssessmentTemplateResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.CreateAssessmentTemplateResult {
		return environment.inspector.createAssessmentTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector create-assessment-template")
				.argument("assessment-target-arn", assessmentTargetArn)
				.argument("assessment-template-name", assessmentTemplateName)
				.argument("duration-in-seconds", durationInSeconds?.toString())
				.argument("rules-package-arns", rulesPackageArns?.toString())
				.argument("user-attributes-for-findings", userAttributesForFindings?.toString())
	}

}


fun AmazonInspectorFunctions.createResourceGroup(init: AmazonInspectorCreateResourceGroupCommand.() -> Unit): com.amazonaws.services.inspector.model.CreateResourceGroupResult {
	return this.block.declare(AmazonInspectorCreateResourceGroupCommand().apply(init)) as com.amazonaws.services.inspector.model.CreateResourceGroupResult
}

@Generated
class AmazonInspectorCreateResourceGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.CreateResourceGroupRequest, com.amazonaws.services.inspector.model.CreateResourceGroupResult> {

	var resourceGroupTags: List<com.amazonaws.services.inspector.model.ResourceGroupTag>? = null

	override fun build(): com.amazonaws.services.inspector.model.CreateResourceGroupRequest {
		val input = com.amazonaws.services.inspector.model.CreateResourceGroupRequest()
		input.setResourceGroupTags(this.resourceGroupTags)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.CreateResourceGroupResult {
	  return com.amazonaws.services.inspector.model.CreateResourceGroupResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.CreateResourceGroupResult {
		return environment.inspector.createResourceGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector create-resource-group")
				.argument("resource-group-tags", resourceGroupTags?.toString())
	}

}


fun AmazonInspectorFunctions.deleteAssessmentRun(init: AmazonInspectorDeleteAssessmentRunCommand.() -> Unit): com.amazonaws.services.inspector.model.DeleteAssessmentRunResult {
	return this.block.declare(AmazonInspectorDeleteAssessmentRunCommand().apply(init)) as com.amazonaws.services.inspector.model.DeleteAssessmentRunResult
}

@Generated
class AmazonInspectorDeleteAssessmentRunCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest, com.amazonaws.services.inspector.model.DeleteAssessmentRunResult> {

	var assessmentRunArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest {
		val input = com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest()
		input.setAssessmentRunArn(this.assessmentRunArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.DeleteAssessmentRunResult {
	  return com.amazonaws.services.inspector.model.DeleteAssessmentRunResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.DeleteAssessmentRunResult {
		return environment.inspector.deleteAssessmentRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector delete-assessment-run")
				.argument("assessment-run-arn", assessmentRunArn)
	}

}


fun AmazonInspectorFunctions.deleteAssessmentTarget(init: AmazonInspectorDeleteAssessmentTargetCommand.() -> Unit): com.amazonaws.services.inspector.model.DeleteAssessmentTargetResult {
	return this.block.declare(AmazonInspectorDeleteAssessmentTargetCommand().apply(init)) as com.amazonaws.services.inspector.model.DeleteAssessmentTargetResult
}

@Generated
class AmazonInspectorDeleteAssessmentTargetCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest, com.amazonaws.services.inspector.model.DeleteAssessmentTargetResult> {

	var assessmentTargetArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest {
		val input = com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest()
		input.setAssessmentTargetArn(this.assessmentTargetArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.DeleteAssessmentTargetResult {
	  return com.amazonaws.services.inspector.model.DeleteAssessmentTargetResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.DeleteAssessmentTargetResult {
		return environment.inspector.deleteAssessmentTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector delete-assessment-target")
				.argument("assessment-target-arn", assessmentTargetArn)
	}

}


fun AmazonInspectorFunctions.deleteAssessmentTemplate(init: AmazonInspectorDeleteAssessmentTemplateCommand.() -> Unit): com.amazonaws.services.inspector.model.DeleteAssessmentTemplateResult {
	return this.block.declare(AmazonInspectorDeleteAssessmentTemplateCommand().apply(init)) as com.amazonaws.services.inspector.model.DeleteAssessmentTemplateResult
}

@Generated
class AmazonInspectorDeleteAssessmentTemplateCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest, com.amazonaws.services.inspector.model.DeleteAssessmentTemplateResult> {

	var assessmentTemplateArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest {
		val input = com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest()
		input.setAssessmentTemplateArn(this.assessmentTemplateArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.DeleteAssessmentTemplateResult {
	  return com.amazonaws.services.inspector.model.DeleteAssessmentTemplateResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.DeleteAssessmentTemplateResult {
		return environment.inspector.deleteAssessmentTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector delete-assessment-template")
				.argument("assessment-template-arn", assessmentTemplateArn)
	}

}


fun AmazonInspectorFunctions.describeAssessmentRuns(init: AmazonInspectorDescribeAssessmentRunsCommand.() -> Unit): com.amazonaws.services.inspector.model.DescribeAssessmentRunsResult {
	return this.block.declare(AmazonInspectorDescribeAssessmentRunsCommand().apply(init)) as com.amazonaws.services.inspector.model.DescribeAssessmentRunsResult
}

@Generated
class AmazonInspectorDescribeAssessmentRunsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest, com.amazonaws.services.inspector.model.DescribeAssessmentRunsResult> {

	var assessmentRunArns: List<String>? = null

	override fun build(): com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest {
		val input = com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest()
		input.setAssessmentRunArns(this.assessmentRunArns)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.DescribeAssessmentRunsResult {
	  return com.amazonaws.services.inspector.model.DescribeAssessmentRunsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.DescribeAssessmentRunsResult {
		return environment.inspector.describeAssessmentRuns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector describe-assessment-runs")
				.argument("assessment-run-arns", assessmentRunArns?.toString())
	}

}


fun AmazonInspectorFunctions.describeAssessmentTargets(init: AmazonInspectorDescribeAssessmentTargetsCommand.() -> Unit): com.amazonaws.services.inspector.model.DescribeAssessmentTargetsResult {
	return this.block.declare(AmazonInspectorDescribeAssessmentTargetsCommand().apply(init)) as com.amazonaws.services.inspector.model.DescribeAssessmentTargetsResult
}

@Generated
class AmazonInspectorDescribeAssessmentTargetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest, com.amazonaws.services.inspector.model.DescribeAssessmentTargetsResult> {

	var assessmentTargetArns: List<String>? = null

	override fun build(): com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest {
		val input = com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest()
		input.setAssessmentTargetArns(this.assessmentTargetArns)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.DescribeAssessmentTargetsResult {
	  return com.amazonaws.services.inspector.model.DescribeAssessmentTargetsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.DescribeAssessmentTargetsResult {
		return environment.inspector.describeAssessmentTargets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector describe-assessment-targets")
				.argument("assessment-target-arns", assessmentTargetArns?.toString())
	}

}


fun AmazonInspectorFunctions.describeAssessmentTemplates(init: AmazonInspectorDescribeAssessmentTemplatesCommand.() -> Unit): com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesResult {
	return this.block.declare(AmazonInspectorDescribeAssessmentTemplatesCommand().apply(init)) as com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesResult
}

@Generated
class AmazonInspectorDescribeAssessmentTemplatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest, com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesResult> {

	var assessmentTemplateArns: List<String>? = null

	override fun build(): com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest {
		val input = com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest()
		input.setAssessmentTemplateArns(this.assessmentTemplateArns)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesResult {
	  return com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesResult {
		return environment.inspector.describeAssessmentTemplates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector describe-assessment-templates")
				.argument("assessment-template-arns", assessmentTemplateArns?.toString())
	}

}


fun AmazonInspectorFunctions.describeCrossAccountAccessRole(init: AmazonInspectorDescribeCrossAccountAccessRoleCommand.() -> Unit): com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleResult {
	return this.block.declare(AmazonInspectorDescribeCrossAccountAccessRoleCommand().apply(init)) as com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleResult
}

@Generated
class AmazonInspectorDescribeCrossAccountAccessRoleCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest, com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleResult> {



	override fun build(): com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest {
		val input = com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest()

		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleResult {
	  return com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleResult {
		return environment.inspector.describeCrossAccountAccessRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector describe-cross-account-access-role")

	}

}


fun AmazonInspectorFunctions.describeFindings(init: AmazonInspectorDescribeFindingsCommand.() -> Unit): com.amazonaws.services.inspector.model.DescribeFindingsResult {
	return this.block.declare(AmazonInspectorDescribeFindingsCommand().apply(init)) as com.amazonaws.services.inspector.model.DescribeFindingsResult
}

@Generated
class AmazonInspectorDescribeFindingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DescribeFindingsRequest, com.amazonaws.services.inspector.model.DescribeFindingsResult> {

	var findingArns: List<String>? = null
	var locale: Locale? = null

	override fun build(): com.amazonaws.services.inspector.model.DescribeFindingsRequest {
		val input = com.amazonaws.services.inspector.model.DescribeFindingsRequest()
		input.setFindingArns(this.findingArns)
		input.setLocale(this.locale?.toString())
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.DescribeFindingsResult {
	  return com.amazonaws.services.inspector.model.DescribeFindingsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.DescribeFindingsResult {
		return environment.inspector.describeFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector describe-findings")
				.argument("finding-arns", findingArns?.toString())
				.argument("locale", locale?.toString())
	}

}


fun AmazonInspectorFunctions.describeResourceGroups(init: AmazonInspectorDescribeResourceGroupsCommand.() -> Unit): com.amazonaws.services.inspector.model.DescribeResourceGroupsResult {
	return this.block.declare(AmazonInspectorDescribeResourceGroupsCommand().apply(init)) as com.amazonaws.services.inspector.model.DescribeResourceGroupsResult
}

@Generated
class AmazonInspectorDescribeResourceGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest, com.amazonaws.services.inspector.model.DescribeResourceGroupsResult> {

	var resourceGroupArns: List<String>? = null

	override fun build(): com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest {
		val input = com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest()
		input.setResourceGroupArns(this.resourceGroupArns)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.DescribeResourceGroupsResult {
	  return com.amazonaws.services.inspector.model.DescribeResourceGroupsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.DescribeResourceGroupsResult {
		return environment.inspector.describeResourceGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector describe-resource-groups")
				.argument("resource-group-arns", resourceGroupArns?.toString())
	}

}


fun AmazonInspectorFunctions.describeRulesPackages(init: AmazonInspectorDescribeRulesPackagesCommand.() -> Unit): com.amazonaws.services.inspector.model.DescribeRulesPackagesResult {
	return this.block.declare(AmazonInspectorDescribeRulesPackagesCommand().apply(init)) as com.amazonaws.services.inspector.model.DescribeRulesPackagesResult
}

@Generated
class AmazonInspectorDescribeRulesPackagesCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest, com.amazonaws.services.inspector.model.DescribeRulesPackagesResult> {

	var rulesPackageArns: List<String>? = null
	var locale: Locale? = null

	override fun build(): com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest {
		val input = com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest()
		input.setRulesPackageArns(this.rulesPackageArns)
		input.setLocale(this.locale?.toString())
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.DescribeRulesPackagesResult {
	  return com.amazonaws.services.inspector.model.DescribeRulesPackagesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.DescribeRulesPackagesResult {
		return environment.inspector.describeRulesPackages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector describe-rules-packages")
				.argument("rules-package-arns", rulesPackageArns?.toString())
				.argument("locale", locale?.toString())
	}

}


fun AmazonInspectorFunctions.getAssessmentReport(init: AmazonInspectorGetAssessmentReportCommand.() -> Unit): com.amazonaws.services.inspector.model.GetAssessmentReportResult {
	return this.block.declare(AmazonInspectorGetAssessmentReportCommand().apply(init)) as com.amazonaws.services.inspector.model.GetAssessmentReportResult
}

@Generated
class AmazonInspectorGetAssessmentReportCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.GetAssessmentReportRequest, com.amazonaws.services.inspector.model.GetAssessmentReportResult> {

	var assessmentRunArn: String? = null
	var reportFileFormat: ReportFileFormat? = null
	var reportType: ReportType? = null

	override fun build(): com.amazonaws.services.inspector.model.GetAssessmentReportRequest {
		val input = com.amazonaws.services.inspector.model.GetAssessmentReportRequest()
		input.setAssessmentRunArn(this.assessmentRunArn)
		input.setReportFileFormat(this.reportFileFormat?.toString())
		input.setReportType(this.reportType?.toString())
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.GetAssessmentReportResult {
	  return com.amazonaws.services.inspector.model.GetAssessmentReportResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.GetAssessmentReportResult {
		return environment.inspector.getAssessmentReport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector get-assessment-report")
				.argument("assessment-run-arn", assessmentRunArn)
				.argument("report-file-format", reportFileFormat?.toString())
				.argument("report-type", reportType?.toString())
	}

}


fun AmazonInspectorFunctions.getTelemetryMetadata(init: AmazonInspectorGetTelemetryMetadataCommand.() -> Unit): com.amazonaws.services.inspector.model.GetTelemetryMetadataResult {
	return this.block.declare(AmazonInspectorGetTelemetryMetadataCommand().apply(init)) as com.amazonaws.services.inspector.model.GetTelemetryMetadataResult
}

@Generated
class AmazonInspectorGetTelemetryMetadataCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest, com.amazonaws.services.inspector.model.GetTelemetryMetadataResult> {

	var assessmentRunArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest {
		val input = com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest()
		input.setAssessmentRunArn(this.assessmentRunArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.GetTelemetryMetadataResult {
	  return com.amazonaws.services.inspector.model.GetTelemetryMetadataResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.GetTelemetryMetadataResult {
		return environment.inspector.getTelemetryMetadata(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector get-telemetry-metadata")
				.argument("assessment-run-arn", assessmentRunArn)
	}

}


fun AmazonInspectorFunctions.listAssessmentRunAgents(init: AmazonInspectorListAssessmentRunAgentsCommand.() -> Unit): com.amazonaws.services.inspector.model.ListAssessmentRunAgentsResult {
	return this.block.declare(AmazonInspectorListAssessmentRunAgentsCommand().apply(init)) as com.amazonaws.services.inspector.model.ListAssessmentRunAgentsResult
}

@Generated
class AmazonInspectorListAssessmentRunAgentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.ListAssessmentRunAgentsRequest, com.amazonaws.services.inspector.model.ListAssessmentRunAgentsResult> {

	var assessmentRunArn: String? = null
	var filter: com.amazonaws.services.inspector.model.AgentFilter? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.inspector.model.ListAssessmentRunAgentsRequest {
		val input = com.amazonaws.services.inspector.model.ListAssessmentRunAgentsRequest()
		input.setAssessmentRunArn(this.assessmentRunArn)
		input.setFilter(this.filter)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.ListAssessmentRunAgentsResult {
	  return com.amazonaws.services.inspector.model.ListAssessmentRunAgentsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.ListAssessmentRunAgentsResult {
		return environment.inspector.listAssessmentRunAgents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector list-assessment-run-agents")
				.argument("assessment-run-arn", assessmentRunArn)
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonInspectorFunctions.listAssessmentRuns(init: AmazonInspectorListAssessmentRunsCommand.() -> Unit): com.amazonaws.services.inspector.model.ListAssessmentRunsResult {
	return this.block.declare(AmazonInspectorListAssessmentRunsCommand().apply(init)) as com.amazonaws.services.inspector.model.ListAssessmentRunsResult
}

@Generated
class AmazonInspectorListAssessmentRunsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.ListAssessmentRunsRequest, com.amazonaws.services.inspector.model.ListAssessmentRunsResult> {

	var assessmentTemplateArns: List<String>? = null
	var filter: com.amazonaws.services.inspector.model.AssessmentRunFilter? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.inspector.model.ListAssessmentRunsRequest {
		val input = com.amazonaws.services.inspector.model.ListAssessmentRunsRequest()
		input.setAssessmentTemplateArns(this.assessmentTemplateArns)
		input.setFilter(this.filter)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.ListAssessmentRunsResult {
	  return com.amazonaws.services.inspector.model.ListAssessmentRunsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.ListAssessmentRunsResult {
		return environment.inspector.listAssessmentRuns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector list-assessment-runs")
				.argument("assessment-template-arns", assessmentTemplateArns?.toString())
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonInspectorFunctions.listAssessmentTargets(init: AmazonInspectorListAssessmentTargetsCommand.() -> Unit): com.amazonaws.services.inspector.model.ListAssessmentTargetsResult {
	return this.block.declare(AmazonInspectorListAssessmentTargetsCommand().apply(init)) as com.amazonaws.services.inspector.model.ListAssessmentTargetsResult
}

@Generated
class AmazonInspectorListAssessmentTargetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.ListAssessmentTargetsRequest, com.amazonaws.services.inspector.model.ListAssessmentTargetsResult> {

	var filter: com.amazonaws.services.inspector.model.AssessmentTargetFilter? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.inspector.model.ListAssessmentTargetsRequest {
		val input = com.amazonaws.services.inspector.model.ListAssessmentTargetsRequest()
		input.setFilter(this.filter)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.ListAssessmentTargetsResult {
	  return com.amazonaws.services.inspector.model.ListAssessmentTargetsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.ListAssessmentTargetsResult {
		return environment.inspector.listAssessmentTargets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector list-assessment-targets")
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonInspectorFunctions.listAssessmentTemplates(init: AmazonInspectorListAssessmentTemplatesCommand.() -> Unit): com.amazonaws.services.inspector.model.ListAssessmentTemplatesResult {
	return this.block.declare(AmazonInspectorListAssessmentTemplatesCommand().apply(init)) as com.amazonaws.services.inspector.model.ListAssessmentTemplatesResult
}

@Generated
class AmazonInspectorListAssessmentTemplatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.ListAssessmentTemplatesRequest, com.amazonaws.services.inspector.model.ListAssessmentTemplatesResult> {

	var assessmentTargetArns: List<String>? = null
	var filter: com.amazonaws.services.inspector.model.AssessmentTemplateFilter? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.inspector.model.ListAssessmentTemplatesRequest {
		val input = com.amazonaws.services.inspector.model.ListAssessmentTemplatesRequest()
		input.setAssessmentTargetArns(this.assessmentTargetArns)
		input.setFilter(this.filter)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.ListAssessmentTemplatesResult {
	  return com.amazonaws.services.inspector.model.ListAssessmentTemplatesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.ListAssessmentTemplatesResult {
		return environment.inspector.listAssessmentTemplates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector list-assessment-templates")
				.argument("assessment-target-arns", assessmentTargetArns?.toString())
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonInspectorFunctions.listEventSubscriptions(init: AmazonInspectorListEventSubscriptionsCommand.() -> Unit): com.amazonaws.services.inspector.model.ListEventSubscriptionsResult {
	return this.block.declare(AmazonInspectorListEventSubscriptionsCommand().apply(init)) as com.amazonaws.services.inspector.model.ListEventSubscriptionsResult
}

@Generated
class AmazonInspectorListEventSubscriptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.ListEventSubscriptionsRequest, com.amazonaws.services.inspector.model.ListEventSubscriptionsResult> {

	var resourceArn: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.inspector.model.ListEventSubscriptionsRequest {
		val input = com.amazonaws.services.inspector.model.ListEventSubscriptionsRequest()
		input.setResourceArn(this.resourceArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.ListEventSubscriptionsResult {
	  return com.amazonaws.services.inspector.model.ListEventSubscriptionsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.ListEventSubscriptionsResult {
		return environment.inspector.listEventSubscriptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector list-event-subscriptions")
				.argument("resource-arn", resourceArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonInspectorFunctions.listFindings(init: AmazonInspectorListFindingsCommand.() -> Unit): com.amazonaws.services.inspector.model.ListFindingsResult {
	return this.block.declare(AmazonInspectorListFindingsCommand().apply(init)) as com.amazonaws.services.inspector.model.ListFindingsResult
}

@Generated
class AmazonInspectorListFindingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.ListFindingsRequest, com.amazonaws.services.inspector.model.ListFindingsResult> {

	var assessmentRunArns: List<String>? = null
	var filter: com.amazonaws.services.inspector.model.FindingFilter? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.inspector.model.ListFindingsRequest {
		val input = com.amazonaws.services.inspector.model.ListFindingsRequest()
		input.setAssessmentRunArns(this.assessmentRunArns)
		input.setFilter(this.filter)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.ListFindingsResult {
	  return com.amazonaws.services.inspector.model.ListFindingsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.ListFindingsResult {
		return environment.inspector.listFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector list-findings")
				.argument("assessment-run-arns", assessmentRunArns?.toString())
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonInspectorFunctions.listRulesPackages(init: AmazonInspectorListRulesPackagesCommand.() -> Unit): com.amazonaws.services.inspector.model.ListRulesPackagesResult {
	return this.block.declare(AmazonInspectorListRulesPackagesCommand().apply(init)) as com.amazonaws.services.inspector.model.ListRulesPackagesResult
}

@Generated
class AmazonInspectorListRulesPackagesCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.ListRulesPackagesRequest, com.amazonaws.services.inspector.model.ListRulesPackagesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.inspector.model.ListRulesPackagesRequest {
		val input = com.amazonaws.services.inspector.model.ListRulesPackagesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.ListRulesPackagesResult {
	  return com.amazonaws.services.inspector.model.ListRulesPackagesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.ListRulesPackagesResult {
		return environment.inspector.listRulesPackages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector list-rules-packages")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonInspectorFunctions.listTagsForResource(init: AmazonInspectorListTagsForResourceCommand.() -> Unit): com.amazonaws.services.inspector.model.ListTagsForResourceResult {
	return this.block.declare(AmazonInspectorListTagsForResourceCommand().apply(init)) as com.amazonaws.services.inspector.model.ListTagsForResourceResult
}

@Generated
class AmazonInspectorListTagsForResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.ListTagsForResourceRequest, com.amazonaws.services.inspector.model.ListTagsForResourceResult> {

	var resourceArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.inspector.model.ListTagsForResourceRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.ListTagsForResourceResult {
	  return com.amazonaws.services.inspector.model.ListTagsForResourceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.ListTagsForResourceResult {
		return environment.inspector.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector list-tags-for-resource")
				.argument("resource-arn", resourceArn)
	}

}


fun AmazonInspectorFunctions.previewAgents(init: AmazonInspectorPreviewAgentsCommand.() -> Unit): com.amazonaws.services.inspector.model.PreviewAgentsResult {
	return this.block.declare(AmazonInspectorPreviewAgentsCommand().apply(init)) as com.amazonaws.services.inspector.model.PreviewAgentsResult
}

@Generated
class AmazonInspectorPreviewAgentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.PreviewAgentsRequest, com.amazonaws.services.inspector.model.PreviewAgentsResult> {

	var previewAgentsArn: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.inspector.model.PreviewAgentsRequest {
		val input = com.amazonaws.services.inspector.model.PreviewAgentsRequest()
		input.setPreviewAgentsArn(this.previewAgentsArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.PreviewAgentsResult {
	  return com.amazonaws.services.inspector.model.PreviewAgentsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.PreviewAgentsResult {
		return environment.inspector.previewAgents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector preview-agents")
				.argument("preview-agents-arn", previewAgentsArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonInspectorFunctions.registerCrossAccountAccessRole(init: AmazonInspectorRegisterCrossAccountAccessRoleCommand.() -> Unit): com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleResult {
	return this.block.declare(AmazonInspectorRegisterCrossAccountAccessRoleCommand().apply(init)) as com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleResult
}

@Generated
class AmazonInspectorRegisterCrossAccountAccessRoleCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest, com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleResult> {

	var roleArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest {
		val input = com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest()
		input.setRoleArn(this.roleArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleResult {
	  return com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleResult {
		return environment.inspector.registerCrossAccountAccessRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector register-cross-account-access-role")
				.argument("role-arn", roleArn)
	}

}


fun AmazonInspectorFunctions.removeAttributesFromFindings(init: AmazonInspectorRemoveAttributesFromFindingsCommand.() -> Unit): com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsResult {
	return this.block.declare(AmazonInspectorRemoveAttributesFromFindingsCommand().apply(init)) as com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsResult
}

@Generated
class AmazonInspectorRemoveAttributesFromFindingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest, com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsResult> {

	var findingArns: List<String>? = null
	var attributeKeys: List<String>? = null

	override fun build(): com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest {
		val input = com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest()
		input.setFindingArns(this.findingArns)
		input.setAttributeKeys(this.attributeKeys)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsResult {
	  return com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsResult {
		return environment.inspector.removeAttributesFromFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector remove-attributes-from-findings")
				.argument("finding-arns", findingArns?.toString())
				.argument("attribute-keys", attributeKeys?.toString())
	}

}


fun AmazonInspectorFunctions.setTagsForResource(init: AmazonInspectorSetTagsForResourceCommand.() -> Unit): com.amazonaws.services.inspector.model.SetTagsForResourceResult {
	return this.block.declare(AmazonInspectorSetTagsForResourceCommand().apply(init)) as com.amazonaws.services.inspector.model.SetTagsForResourceResult
}

@Generated
class AmazonInspectorSetTagsForResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.SetTagsForResourceRequest, com.amazonaws.services.inspector.model.SetTagsForResourceResult> {

	var resourceArn: String? = null
	var tags: List<com.amazonaws.services.inspector.model.Tag>? = null

	override fun build(): com.amazonaws.services.inspector.model.SetTagsForResourceRequest {
		val input = com.amazonaws.services.inspector.model.SetTagsForResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.SetTagsForResourceResult {
	  return com.amazonaws.services.inspector.model.SetTagsForResourceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.SetTagsForResourceResult {
		return environment.inspector.setTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector set-tags-for-resource")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags?.toString())
	}

}


fun AmazonInspectorFunctions.startAssessmentRun(init: AmazonInspectorStartAssessmentRunCommand.() -> Unit): com.amazonaws.services.inspector.model.StartAssessmentRunResult {
	return this.block.declare(AmazonInspectorStartAssessmentRunCommand().apply(init)) as com.amazonaws.services.inspector.model.StartAssessmentRunResult
}

@Generated
class AmazonInspectorStartAssessmentRunCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.StartAssessmentRunRequest, com.amazonaws.services.inspector.model.StartAssessmentRunResult> {

	var assessmentTemplateArn: String? = null
	var assessmentRunName: String? = null

	override fun build(): com.amazonaws.services.inspector.model.StartAssessmentRunRequest {
		val input = com.amazonaws.services.inspector.model.StartAssessmentRunRequest()
		input.setAssessmentTemplateArn(this.assessmentTemplateArn)
		input.setAssessmentRunName(this.assessmentRunName)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.StartAssessmentRunResult {
	  return com.amazonaws.services.inspector.model.StartAssessmentRunResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.StartAssessmentRunResult {
		return environment.inspector.startAssessmentRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector start-assessment-run")
				.argument("assessment-template-arn", assessmentTemplateArn)
				.argument("assessment-run-name", assessmentRunName)
	}

}


fun AmazonInspectorFunctions.stopAssessmentRun(init: AmazonInspectorStopAssessmentRunCommand.() -> Unit): com.amazonaws.services.inspector.model.StopAssessmentRunResult {
	return this.block.declare(AmazonInspectorStopAssessmentRunCommand().apply(init)) as com.amazonaws.services.inspector.model.StopAssessmentRunResult
}

@Generated
class AmazonInspectorStopAssessmentRunCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.StopAssessmentRunRequest, com.amazonaws.services.inspector.model.StopAssessmentRunResult> {

	var assessmentRunArn: String? = null
	var stopAction: StopAction? = null

	override fun build(): com.amazonaws.services.inspector.model.StopAssessmentRunRequest {
		val input = com.amazonaws.services.inspector.model.StopAssessmentRunRequest()
		input.setAssessmentRunArn(this.assessmentRunArn)
		input.setStopAction(this.stopAction?.toString())
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.StopAssessmentRunResult {
	  return com.amazonaws.services.inspector.model.StopAssessmentRunResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.StopAssessmentRunResult {
		return environment.inspector.stopAssessmentRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector stop-assessment-run")
				.argument("assessment-run-arn", assessmentRunArn)
				.argument("stop-action", stopAction?.toString())
	}

}


fun AmazonInspectorFunctions.subscribeToEvent(init: AmazonInspectorSubscribeToEventCommand.() -> Unit): com.amazonaws.services.inspector.model.SubscribeToEventResult {
	return this.block.declare(AmazonInspectorSubscribeToEventCommand().apply(init)) as com.amazonaws.services.inspector.model.SubscribeToEventResult
}

@Generated
class AmazonInspectorSubscribeToEventCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.SubscribeToEventRequest, com.amazonaws.services.inspector.model.SubscribeToEventResult> {

	var resourceArn: String? = null
	var event: InspectorEvent? = null
	var topicArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.SubscribeToEventRequest {
		val input = com.amazonaws.services.inspector.model.SubscribeToEventRequest()
		input.setResourceArn(this.resourceArn)
		input.setEvent(this.event?.toString())
		input.setTopicArn(this.topicArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.SubscribeToEventResult {
	  return com.amazonaws.services.inspector.model.SubscribeToEventResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.SubscribeToEventResult {
		return environment.inspector.subscribeToEvent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector subscribe-to-event")
				.argument("resource-arn", resourceArn)
				.argument("event", event?.toString())
				.argument("topic-arn", topicArn)
	}

}


fun AmazonInspectorFunctions.unsubscribeFromEvent(init: AmazonInspectorUnsubscribeFromEventCommand.() -> Unit): com.amazonaws.services.inspector.model.UnsubscribeFromEventResult {
	return this.block.declare(AmazonInspectorUnsubscribeFromEventCommand().apply(init)) as com.amazonaws.services.inspector.model.UnsubscribeFromEventResult
}

@Generated
class AmazonInspectorUnsubscribeFromEventCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.UnsubscribeFromEventRequest, com.amazonaws.services.inspector.model.UnsubscribeFromEventResult> {

	var resourceArn: String? = null
	var event: InspectorEvent? = null
	var topicArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.UnsubscribeFromEventRequest {
		val input = com.amazonaws.services.inspector.model.UnsubscribeFromEventRequest()
		input.setResourceArn(this.resourceArn)
		input.setEvent(this.event?.toString())
		input.setTopicArn(this.topicArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.UnsubscribeFromEventResult {
	  return com.amazonaws.services.inspector.model.UnsubscribeFromEventResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.UnsubscribeFromEventResult {
		return environment.inspector.unsubscribeFromEvent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector unsubscribe-from-event")
				.argument("resource-arn", resourceArn)
				.argument("event", event?.toString())
				.argument("topic-arn", topicArn)
	}

}


fun AmazonInspectorFunctions.updateAssessmentTarget(init: AmazonInspectorUpdateAssessmentTargetCommand.() -> Unit): com.amazonaws.services.inspector.model.UpdateAssessmentTargetResult {
	return this.block.declare(AmazonInspectorUpdateAssessmentTargetCommand().apply(init)) as com.amazonaws.services.inspector.model.UpdateAssessmentTargetResult
}

@Generated
class AmazonInspectorUpdateAssessmentTargetCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.UpdateAssessmentTargetRequest, com.amazonaws.services.inspector.model.UpdateAssessmentTargetResult> {

	var assessmentTargetArn: String? = null
	var assessmentTargetName: String? = null
	var resourceGroupArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.UpdateAssessmentTargetRequest {
		val input = com.amazonaws.services.inspector.model.UpdateAssessmentTargetRequest()
		input.setAssessmentTargetArn(this.assessmentTargetArn)
		input.setAssessmentTargetName(this.assessmentTargetName)
		input.setResourceGroupArn(this.resourceGroupArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.inspector.model.UpdateAssessmentTargetResult {
	  return com.amazonaws.services.inspector.model.UpdateAssessmentTargetResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.inspector.model.UpdateAssessmentTargetResult {
		return environment.inspector.updateAssessmentTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector update-assessment-target")
				.argument("assessment-target-arn", assessmentTargetArn)
				.argument("assessment-target-name", assessmentTargetName)
				.argument("resource-group-arn", resourceGroupArn)
	}

}
