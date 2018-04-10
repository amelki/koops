
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

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

infix fun AwsContinuation.inspector(init: AmazonInspectorFunctions.() -> Unit) {
	AmazonInspectorFunctions(shell).apply(init)
}

			

fun AmazonInspectorFunctions.addAttributesToFindings(init: AmazonInspectorAddAttributesToFindingsCommand.() -> Unit) {
	this.block.declare(AmazonInspectorAddAttributesToFindingsCommand().apply(init))
}

@Generated
class AmazonInspectorAddAttributesToFindingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest> {

	var findingArns: List<String>? = null
	var attributes: List<com.amazonaws.services.inspector.model.Attribute>? = null

	override fun build(): com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest {
		val input = com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest()
		input.setFindingArns(this.findingArns)
		input.setAttributes(this.attributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.addAttributesToFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector add-attributes-to-findings")
				.argument("finding-arns", findingArns?.toString())
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonInspectorFunctions.createAssessmentTarget(init: AmazonInspectorCreateAssessmentTargetCommand.() -> Unit) {
	this.block.declare(AmazonInspectorCreateAssessmentTargetCommand().apply(init))
}

@Generated
class AmazonInspectorCreateAssessmentTargetCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest> {

	var assessmentTargetName: String? = null
	var resourceGroupArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest {
		val input = com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest()
		input.setAssessmentTargetName(this.assessmentTargetName)
		input.setResourceGroupArn(this.resourceGroupArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.createAssessmentTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector create-assessment-target")
				.argument("assessment-target-name", assessmentTargetName)
				.argument("resource-group-arn", resourceGroupArn)
	}

}


fun AmazonInspectorFunctions.createAssessmentTemplate(init: AmazonInspectorCreateAssessmentTemplateCommand.() -> Unit) {
	this.block.declare(AmazonInspectorCreateAssessmentTemplateCommand().apply(init))
}

@Generated
class AmazonInspectorCreateAssessmentTemplateCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.CreateAssessmentTemplateRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.createAssessmentTemplate(build())
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


fun AmazonInspectorFunctions.createResourceGroup(init: AmazonInspectorCreateResourceGroupCommand.() -> Unit) {
	this.block.declare(AmazonInspectorCreateResourceGroupCommand().apply(init))
}

@Generated
class AmazonInspectorCreateResourceGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.CreateResourceGroupRequest> {

	var resourceGroupTags: List<com.amazonaws.services.inspector.model.ResourceGroupTag>? = null

	override fun build(): com.amazonaws.services.inspector.model.CreateResourceGroupRequest {
		val input = com.amazonaws.services.inspector.model.CreateResourceGroupRequest()
		input.setResourceGroupTags(this.resourceGroupTags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.createResourceGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector create-resource-group")
				.argument("resource-group-tags", resourceGroupTags?.toString())
	}

}


fun AmazonInspectorFunctions.deleteAssessmentRun(init: AmazonInspectorDeleteAssessmentRunCommand.() -> Unit) {
	this.block.declare(AmazonInspectorDeleteAssessmentRunCommand().apply(init))
}

@Generated
class AmazonInspectorDeleteAssessmentRunCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest> {

	var assessmentRunArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest {
		val input = com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest()
		input.setAssessmentRunArn(this.assessmentRunArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.deleteAssessmentRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector delete-assessment-run")
				.argument("assessment-run-arn", assessmentRunArn)
	}

}


fun AmazonInspectorFunctions.deleteAssessmentTarget(init: AmazonInspectorDeleteAssessmentTargetCommand.() -> Unit) {
	this.block.declare(AmazonInspectorDeleteAssessmentTargetCommand().apply(init))
}

@Generated
class AmazonInspectorDeleteAssessmentTargetCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest> {

	var assessmentTargetArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest {
		val input = com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest()
		input.setAssessmentTargetArn(this.assessmentTargetArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.deleteAssessmentTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector delete-assessment-target")
				.argument("assessment-target-arn", assessmentTargetArn)
	}

}


fun AmazonInspectorFunctions.deleteAssessmentTemplate(init: AmazonInspectorDeleteAssessmentTemplateCommand.() -> Unit) {
	this.block.declare(AmazonInspectorDeleteAssessmentTemplateCommand().apply(init))
}

@Generated
class AmazonInspectorDeleteAssessmentTemplateCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest> {

	var assessmentTemplateArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest {
		val input = com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest()
		input.setAssessmentTemplateArn(this.assessmentTemplateArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.deleteAssessmentTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector delete-assessment-template")
				.argument("assessment-template-arn", assessmentTemplateArn)
	}

}


fun AmazonInspectorFunctions.describeAssessmentRuns(init: AmazonInspectorDescribeAssessmentRunsCommand.() -> Unit) {
	this.block.declare(AmazonInspectorDescribeAssessmentRunsCommand().apply(init))
}

@Generated
class AmazonInspectorDescribeAssessmentRunsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest> {

	var assessmentRunArns: List<String>? = null

	override fun build(): com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest {
		val input = com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest()
		input.setAssessmentRunArns(this.assessmentRunArns)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.describeAssessmentRuns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector describe-assessment-runs")
				.argument("assessment-run-arns", assessmentRunArns?.toString())
	}

}


fun AmazonInspectorFunctions.describeAssessmentTargets(init: AmazonInspectorDescribeAssessmentTargetsCommand.() -> Unit) {
	this.block.declare(AmazonInspectorDescribeAssessmentTargetsCommand().apply(init))
}

@Generated
class AmazonInspectorDescribeAssessmentTargetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest> {

	var assessmentTargetArns: List<String>? = null

	override fun build(): com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest {
		val input = com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest()
		input.setAssessmentTargetArns(this.assessmentTargetArns)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.describeAssessmentTargets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector describe-assessment-targets")
				.argument("assessment-target-arns", assessmentTargetArns?.toString())
	}

}


fun AmazonInspectorFunctions.describeAssessmentTemplates(init: AmazonInspectorDescribeAssessmentTemplatesCommand.() -> Unit) {
	this.block.declare(AmazonInspectorDescribeAssessmentTemplatesCommand().apply(init))
}

@Generated
class AmazonInspectorDescribeAssessmentTemplatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest> {

	var assessmentTemplateArns: List<String>? = null

	override fun build(): com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest {
		val input = com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest()
		input.setAssessmentTemplateArns(this.assessmentTemplateArns)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.describeAssessmentTemplates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector describe-assessment-templates")
				.argument("assessment-template-arns", assessmentTemplateArns?.toString())
	}

}


fun AmazonInspectorFunctions.describeCrossAccountAccessRole(init: AmazonInspectorDescribeCrossAccountAccessRoleCommand.() -> Unit) {
	this.block.declare(AmazonInspectorDescribeCrossAccountAccessRoleCommand().apply(init))
}

@Generated
class AmazonInspectorDescribeCrossAccountAccessRoleCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest> {



	override fun build(): com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest {
		val input = com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.describeCrossAccountAccessRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector describe-cross-account-access-role")

	}

}


fun AmazonInspectorFunctions.describeFindings(init: AmazonInspectorDescribeFindingsCommand.() -> Unit) {
	this.block.declare(AmazonInspectorDescribeFindingsCommand().apply(init))
}

@Generated
class AmazonInspectorDescribeFindingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DescribeFindingsRequest> {

	var findingArns: List<String>? = null
	var locale: Locale? = null

	override fun build(): com.amazonaws.services.inspector.model.DescribeFindingsRequest {
		val input = com.amazonaws.services.inspector.model.DescribeFindingsRequest()
		input.setFindingArns(this.findingArns)
		input.setLocale(this.locale?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.describeFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector describe-findings")
				.argument("finding-arns", findingArns?.toString())
				.argument("locale", locale?.toString())
	}

}


fun AmazonInspectorFunctions.describeResourceGroups(init: AmazonInspectorDescribeResourceGroupsCommand.() -> Unit) {
	this.block.declare(AmazonInspectorDescribeResourceGroupsCommand().apply(init))
}

@Generated
class AmazonInspectorDescribeResourceGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest> {

	var resourceGroupArns: List<String>? = null

	override fun build(): com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest {
		val input = com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest()
		input.setResourceGroupArns(this.resourceGroupArns)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.describeResourceGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector describe-resource-groups")
				.argument("resource-group-arns", resourceGroupArns?.toString())
	}

}


fun AmazonInspectorFunctions.describeRulesPackages(init: AmazonInspectorDescribeRulesPackagesCommand.() -> Unit) {
	this.block.declare(AmazonInspectorDescribeRulesPackagesCommand().apply(init))
}

@Generated
class AmazonInspectorDescribeRulesPackagesCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest> {

	var rulesPackageArns: List<String>? = null
	var locale: Locale? = null

	override fun build(): com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest {
		val input = com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest()
		input.setRulesPackageArns(this.rulesPackageArns)
		input.setLocale(this.locale?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.describeRulesPackages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector describe-rules-packages")
				.argument("rules-package-arns", rulesPackageArns?.toString())
				.argument("locale", locale?.toString())
	}

}


fun AmazonInspectorFunctions.getAssessmentReport(init: AmazonInspectorGetAssessmentReportCommand.() -> Unit) {
	this.block.declare(AmazonInspectorGetAssessmentReportCommand().apply(init))
}

@Generated
class AmazonInspectorGetAssessmentReportCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.GetAssessmentReportRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.getAssessmentReport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector get-assessment-report")
				.argument("assessment-run-arn", assessmentRunArn)
				.argument("report-file-format", reportFileFormat?.toString())
				.argument("report-type", reportType?.toString())
	}

}


fun AmazonInspectorFunctions.getTelemetryMetadata(init: AmazonInspectorGetTelemetryMetadataCommand.() -> Unit) {
	this.block.declare(AmazonInspectorGetTelemetryMetadataCommand().apply(init))
}

@Generated
class AmazonInspectorGetTelemetryMetadataCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest> {

	var assessmentRunArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest {
		val input = com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest()
		input.setAssessmentRunArn(this.assessmentRunArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.getTelemetryMetadata(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector get-telemetry-metadata")
				.argument("assessment-run-arn", assessmentRunArn)
	}

}


fun AmazonInspectorFunctions.listAssessmentRunAgents(init: AmazonInspectorListAssessmentRunAgentsCommand.() -> Unit) {
	this.block.declare(AmazonInspectorListAssessmentRunAgentsCommand().apply(init))
}

@Generated
class AmazonInspectorListAssessmentRunAgentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.ListAssessmentRunAgentsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.listAssessmentRunAgents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector list-assessment-run-agents")
				.argument("assessment-run-arn", assessmentRunArn)
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonInspectorFunctions.listAssessmentRuns(init: AmazonInspectorListAssessmentRunsCommand.() -> Unit) {
	this.block.declare(AmazonInspectorListAssessmentRunsCommand().apply(init))
}

@Generated
class AmazonInspectorListAssessmentRunsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.ListAssessmentRunsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.listAssessmentRuns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector list-assessment-runs")
				.argument("assessment-template-arns", assessmentTemplateArns?.toString())
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonInspectorFunctions.listAssessmentTargets(init: AmazonInspectorListAssessmentTargetsCommand.() -> Unit) {
	this.block.declare(AmazonInspectorListAssessmentTargetsCommand().apply(init))
}

@Generated
class AmazonInspectorListAssessmentTargetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.ListAssessmentTargetsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.listAssessmentTargets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector list-assessment-targets")
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonInspectorFunctions.listAssessmentTemplates(init: AmazonInspectorListAssessmentTemplatesCommand.() -> Unit) {
	this.block.declare(AmazonInspectorListAssessmentTemplatesCommand().apply(init))
}

@Generated
class AmazonInspectorListAssessmentTemplatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.ListAssessmentTemplatesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.listAssessmentTemplates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector list-assessment-templates")
				.argument("assessment-target-arns", assessmentTargetArns?.toString())
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonInspectorFunctions.listEventSubscriptions(init: AmazonInspectorListEventSubscriptionsCommand.() -> Unit) {
	this.block.declare(AmazonInspectorListEventSubscriptionsCommand().apply(init))
}

@Generated
class AmazonInspectorListEventSubscriptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.ListEventSubscriptionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.listEventSubscriptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector list-event-subscriptions")
				.argument("resource-arn", resourceArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonInspectorFunctions.listFindings(init: AmazonInspectorListFindingsCommand.() -> Unit) {
	this.block.declare(AmazonInspectorListFindingsCommand().apply(init))
}

@Generated
class AmazonInspectorListFindingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.ListFindingsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.listFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector list-findings")
				.argument("assessment-run-arns", assessmentRunArns?.toString())
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonInspectorFunctions.listRulesPackages(init: AmazonInspectorListRulesPackagesCommand.() -> Unit) {
	this.block.declare(AmazonInspectorListRulesPackagesCommand().apply(init))
}

@Generated
class AmazonInspectorListRulesPackagesCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.ListRulesPackagesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.inspector.model.ListRulesPackagesRequest {
		val input = com.amazonaws.services.inspector.model.ListRulesPackagesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.listRulesPackages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector list-rules-packages")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonInspectorFunctions.listTagsForResource(init: AmazonInspectorListTagsForResourceCommand.() -> Unit) {
	this.block.declare(AmazonInspectorListTagsForResourceCommand().apply(init))
}

@Generated
class AmazonInspectorListTagsForResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.ListTagsForResourceRequest> {

	var resourceArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.inspector.model.ListTagsForResourceRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector list-tags-for-resource")
				.argument("resource-arn", resourceArn)
	}

}


fun AmazonInspectorFunctions.previewAgents(init: AmazonInspectorPreviewAgentsCommand.() -> Unit) {
	this.block.declare(AmazonInspectorPreviewAgentsCommand().apply(init))
}

@Generated
class AmazonInspectorPreviewAgentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.PreviewAgentsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.previewAgents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector preview-agents")
				.argument("preview-agents-arn", previewAgentsArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonInspectorFunctions.registerCrossAccountAccessRole(init: AmazonInspectorRegisterCrossAccountAccessRoleCommand.() -> Unit) {
	this.block.declare(AmazonInspectorRegisterCrossAccountAccessRoleCommand().apply(init))
}

@Generated
class AmazonInspectorRegisterCrossAccountAccessRoleCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest> {

	var roleArn: String? = null

	override fun build(): com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest {
		val input = com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest()
		input.setRoleArn(this.roleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.registerCrossAccountAccessRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector register-cross-account-access-role")
				.argument("role-arn", roleArn)
	}

}


fun AmazonInspectorFunctions.removeAttributesFromFindings(init: AmazonInspectorRemoveAttributesFromFindingsCommand.() -> Unit) {
	this.block.declare(AmazonInspectorRemoveAttributesFromFindingsCommand().apply(init))
}

@Generated
class AmazonInspectorRemoveAttributesFromFindingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest> {

	var findingArns: List<String>? = null
	var attributeKeys: List<String>? = null

	override fun build(): com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest {
		val input = com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest()
		input.setFindingArns(this.findingArns)
		input.setAttributeKeys(this.attributeKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.removeAttributesFromFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector remove-attributes-from-findings")
				.argument("finding-arns", findingArns?.toString())
				.argument("attribute-keys", attributeKeys?.toString())
	}

}


fun AmazonInspectorFunctions.setTagsForResource(init: AmazonInspectorSetTagsForResourceCommand.() -> Unit) {
	this.block.declare(AmazonInspectorSetTagsForResourceCommand().apply(init))
}

@Generated
class AmazonInspectorSetTagsForResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.SetTagsForResourceRequest> {

	var resourceArn: String? = null
	var tags: List<com.amazonaws.services.inspector.model.Tag>? = null

	override fun build(): com.amazonaws.services.inspector.model.SetTagsForResourceRequest {
		val input = com.amazonaws.services.inspector.model.SetTagsForResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.setTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector set-tags-for-resource")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags?.toString())
	}

}


fun AmazonInspectorFunctions.startAssessmentRun(init: AmazonInspectorStartAssessmentRunCommand.() -> Unit) {
	this.block.declare(AmazonInspectorStartAssessmentRunCommand().apply(init))
}

@Generated
class AmazonInspectorStartAssessmentRunCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.StartAssessmentRunRequest> {

	var assessmentTemplateArn: String? = null
	var assessmentRunName: String? = null

	override fun build(): com.amazonaws.services.inspector.model.StartAssessmentRunRequest {
		val input = com.amazonaws.services.inspector.model.StartAssessmentRunRequest()
		input.setAssessmentTemplateArn(this.assessmentTemplateArn)
		input.setAssessmentRunName(this.assessmentRunName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.startAssessmentRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector start-assessment-run")
				.argument("assessment-template-arn", assessmentTemplateArn)
				.argument("assessment-run-name", assessmentRunName)
	}

}


fun AmazonInspectorFunctions.stopAssessmentRun(init: AmazonInspectorStopAssessmentRunCommand.() -> Unit) {
	this.block.declare(AmazonInspectorStopAssessmentRunCommand().apply(init))
}

@Generated
class AmazonInspectorStopAssessmentRunCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.StopAssessmentRunRequest> {

	var assessmentRunArn: String? = null
	var stopAction: StopAction? = null

	override fun build(): com.amazonaws.services.inspector.model.StopAssessmentRunRequest {
		val input = com.amazonaws.services.inspector.model.StopAssessmentRunRequest()
		input.setAssessmentRunArn(this.assessmentRunArn)
		input.setStopAction(this.stopAction?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.stopAssessmentRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector stop-assessment-run")
				.argument("assessment-run-arn", assessmentRunArn)
				.argument("stop-action", stopAction?.toString())
	}

}


fun AmazonInspectorFunctions.subscribeToEvent(init: AmazonInspectorSubscribeToEventCommand.() -> Unit) {
	this.block.declare(AmazonInspectorSubscribeToEventCommand().apply(init))
}

@Generated
class AmazonInspectorSubscribeToEventCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.SubscribeToEventRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.subscribeToEvent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector subscribe-to-event")
				.argument("resource-arn", resourceArn)
				.argument("event", event?.toString())
				.argument("topic-arn", topicArn)
	}

}


fun AmazonInspectorFunctions.unsubscribeFromEvent(init: AmazonInspectorUnsubscribeFromEventCommand.() -> Unit) {
	this.block.declare(AmazonInspectorUnsubscribeFromEventCommand().apply(init))
}

@Generated
class AmazonInspectorUnsubscribeFromEventCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.UnsubscribeFromEventRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.unsubscribeFromEvent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector unsubscribe-from-event")
				.argument("resource-arn", resourceArn)
				.argument("event", event?.toString())
				.argument("topic-arn", topicArn)
	}

}


fun AmazonInspectorFunctions.updateAssessmentTarget(init: AmazonInspectorUpdateAssessmentTargetCommand.() -> Unit) {
	this.block.declare(AmazonInspectorUpdateAssessmentTargetCommand().apply(init))
}

@Generated
class AmazonInspectorUpdateAssessmentTargetCommand() : AmazonWebServiceCommand<com.amazonaws.services.inspector.model.UpdateAssessmentTargetRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.inspector.updateAssessmentTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws inspector update-assessment-target")
				.argument("assessment-target-arn", assessmentTargetArn)
				.argument("assessment-target-name", assessmentTargetName)
				.argument("resource-group-arn", resourceGroupArn)
	}

}
