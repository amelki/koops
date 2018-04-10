
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.support.AWSSupport
import com.amazonaws.services.support.model.*

var codingue.koops.core.Environment.support: AWSSupport
	get() = this.capabilities[AWSSupport::class.java.name] as AWSSupport
	set(support) {
		this.capabilities[AWSSupport::class.java.name] = support
	}

@Generated
class AWSSupportFunctions(val block: Block)

infix fun AwsContinuation.support(init: AWSSupportFunctions.() -> Unit) {
	AWSSupportFunctions(shell).apply(init)
}

			

fun AWSSupportFunctions.addAttachmentsToSet(init: AWSSupportAddAttachmentsToSetCommand.() -> Unit) {
	this.block.declare(AWSSupportAddAttachmentsToSetCommand().apply(init))
}

@Generated
class AWSSupportAddAttachmentsToSetCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.AddAttachmentsToSetRequest> {

	var attachmentSetId: String? = null
	var attachments: List<com.amazonaws.services.support.model.Attachment>? = null

	override fun build(): com.amazonaws.services.support.model.AddAttachmentsToSetRequest {
		val input = com.amazonaws.services.support.model.AddAttachmentsToSetRequest()
		input.setAttachmentSetId(this.attachmentSetId)
		input.setAttachments(this.attachments)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.support.addAttachmentsToSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support add-attachments-to-set")
				.argument("attachment-set-id", attachmentSetId)
				.argument("attachments", attachments?.toString())
	}

}


fun AWSSupportFunctions.addCommunicationToCase(init: AWSSupportAddCommunicationToCaseCommand.() -> Unit) {
	this.block.declare(AWSSupportAddCommunicationToCaseCommand().apply(init))
}

@Generated
class AWSSupportAddCommunicationToCaseCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.AddCommunicationToCaseRequest> {

	var caseId: String? = null
	var communicationBody: String? = null
	var ccEmailAddresses: List<String>? = null
	var attachmentSetId: String? = null

	override fun build(): com.amazonaws.services.support.model.AddCommunicationToCaseRequest {
		val input = com.amazonaws.services.support.model.AddCommunicationToCaseRequest()
		input.setCaseId(this.caseId)
		input.setCommunicationBody(this.communicationBody)
		input.setCcEmailAddresses(this.ccEmailAddresses)
		input.setAttachmentSetId(this.attachmentSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.support.addCommunicationToCase(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support add-communication-to-case")
				.argument("case-id", caseId)
				.argument("communication-body", communicationBody)
				.argument("cc-email-addresses", ccEmailAddresses?.toString())
				.argument("attachment-set-id", attachmentSetId)
	}

}


fun AWSSupportFunctions.createCase(init: AWSSupportCreateCaseCommand.() -> Unit) {
	this.block.declare(AWSSupportCreateCaseCommand().apply(init))
}

@Generated
class AWSSupportCreateCaseCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.CreateCaseRequest> {

	var subject: String? = null
	var serviceCode: String? = null
	var severityCode: String? = null
	var categoryCode: String? = null
	var communicationBody: String? = null
	var ccEmailAddresses: List<String>? = null
	var language: String? = null
	var issueType: String? = null
	var attachmentSetId: String? = null

	override fun build(): com.amazonaws.services.support.model.CreateCaseRequest {
		val input = com.amazonaws.services.support.model.CreateCaseRequest()
		input.setSubject(this.subject)
		input.setServiceCode(this.serviceCode)
		input.setSeverityCode(this.severityCode)
		input.setCategoryCode(this.categoryCode)
		input.setCommunicationBody(this.communicationBody)
		input.setCcEmailAddresses(this.ccEmailAddresses)
		input.setLanguage(this.language)
		input.setIssueType(this.issueType)
		input.setAttachmentSetId(this.attachmentSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.support.createCase(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support create-case")
				.argument("subject", subject)
				.argument("service-code", serviceCode)
				.argument("severity-code", severityCode)
				.argument("category-code", categoryCode)
				.argument("communication-body", communicationBody)
				.argument("cc-email-addresses", ccEmailAddresses?.toString())
				.argument("language", language)
				.argument("issue-type", issueType)
				.argument("attachment-set-id", attachmentSetId)
	}

}


fun AWSSupportFunctions.describeAttachment(init: AWSSupportDescribeAttachmentCommand.() -> Unit) {
	this.block.declare(AWSSupportDescribeAttachmentCommand().apply(init))
}

@Generated
class AWSSupportDescribeAttachmentCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeAttachmentRequest> {

	var attachmentId: String? = null

	override fun build(): com.amazonaws.services.support.model.DescribeAttachmentRequest {
		val input = com.amazonaws.services.support.model.DescribeAttachmentRequest()
		input.setAttachmentId(this.attachmentId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.support.describeAttachment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support describe-attachment")
				.argument("attachment-id", attachmentId)
	}

}


fun AWSSupportFunctions.describeCases(init: AWSSupportDescribeCasesCommand.() -> Unit) {
	this.block.declare(AWSSupportDescribeCasesCommand().apply(init))
}

@Generated
class AWSSupportDescribeCasesCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeCasesRequest> {

	var caseIdList: List<String>? = null
	var displayId: String? = null
	var afterTime: String? = null
	var beforeTime: String? = null
	var includeResolvedCases: Boolean? = false
	var nextToken: String? = null
	var maxResults: Int? = 0
	var language: String? = null
	var includeCommunications: Boolean? = false

	override fun build(): com.amazonaws.services.support.model.DescribeCasesRequest {
		val input = com.amazonaws.services.support.model.DescribeCasesRequest()
		input.setCaseIdList(this.caseIdList)
		input.setDisplayId(this.displayId)
		input.setAfterTime(this.afterTime)
		input.setBeforeTime(this.beforeTime)
		input.setIncludeResolvedCases(this.includeResolvedCases)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setLanguage(this.language)
		input.setIncludeCommunications(this.includeCommunications)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.support.describeCases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support describe-cases")
				.argument("case-id-list", caseIdList?.toString())
				.argument("display-id", displayId)
				.argument("after-time", afterTime)
				.argument("before-time", beforeTime)
				.option("include-resolved-cases", includeResolvedCases ?: false)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("language", language)
				.option("include-communications", includeCommunications ?: false)
	}

}


fun AWSSupportFunctions.describeCommunications(init: AWSSupportDescribeCommunicationsCommand.() -> Unit) {
	this.block.declare(AWSSupportDescribeCommunicationsCommand().apply(init))
}

@Generated
class AWSSupportDescribeCommunicationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeCommunicationsRequest> {

	var caseId: String? = null
	var beforeTime: String? = null
	var afterTime: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.support.model.DescribeCommunicationsRequest {
		val input = com.amazonaws.services.support.model.DescribeCommunicationsRequest()
		input.setCaseId(this.caseId)
		input.setBeforeTime(this.beforeTime)
		input.setAfterTime(this.afterTime)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.support.describeCommunications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support describe-communications")
				.argument("case-id", caseId)
				.argument("before-time", beforeTime)
				.argument("after-time", afterTime)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSSupportFunctions.describeServices(init: AWSSupportDescribeServicesCommand.() -> Unit) {
	this.block.declare(AWSSupportDescribeServicesCommand().apply(init))
}

@Generated
class AWSSupportDescribeServicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeServicesRequest> {

	var serviceCodeList: List<String>? = null
	var language: String? = null

	override fun build(): com.amazonaws.services.support.model.DescribeServicesRequest {
		val input = com.amazonaws.services.support.model.DescribeServicesRequest()
		input.setServiceCodeList(this.serviceCodeList)
		input.setLanguage(this.language)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.support.describeServices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support describe-services")
				.argument("service-code-list", serviceCodeList?.toString())
				.argument("language", language)
	}

}


fun AWSSupportFunctions.describeSeverityLevels(init: AWSSupportDescribeSeverityLevelsCommand.() -> Unit) {
	this.block.declare(AWSSupportDescribeSeverityLevelsCommand().apply(init))
}

@Generated
class AWSSupportDescribeSeverityLevelsCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeSeverityLevelsRequest> {

	var language: String? = null

	override fun build(): com.amazonaws.services.support.model.DescribeSeverityLevelsRequest {
		val input = com.amazonaws.services.support.model.DescribeSeverityLevelsRequest()
		input.setLanguage(this.language)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.support.describeSeverityLevels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support describe-severity-levels")
				.argument("language", language)
	}

}


fun AWSSupportFunctions.describeTrustedAdvisorCheckRefreshStatuses(init: AWSSupportDescribeTrustedAdvisorCheckRefreshStatusesCommand.() -> Unit) {
	this.block.declare(AWSSupportDescribeTrustedAdvisorCheckRefreshStatusesCommand().apply(init))
}

@Generated
class AWSSupportDescribeTrustedAdvisorCheckRefreshStatusesCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesRequest> {

	var checkIds: List<String>? = null

	override fun build(): com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesRequest {
		val input = com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesRequest()
		input.setCheckIds(this.checkIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.support.describeTrustedAdvisorCheckRefreshStatuses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support describe-trusted-advisor-check-refresh-statuses")
				.argument("check-ids", checkIds?.toString())
	}

}


fun AWSSupportFunctions.describeTrustedAdvisorCheckResult(init: AWSSupportDescribeTrustedAdvisorCheckResultCommand.() -> Unit) {
	this.block.declare(AWSSupportDescribeTrustedAdvisorCheckResultCommand().apply(init))
}

@Generated
class AWSSupportDescribeTrustedAdvisorCheckResultCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultRequest> {

	var checkId: String? = null
	var language: String? = null

	override fun build(): com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultRequest {
		val input = com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultRequest()
		input.setCheckId(this.checkId)
		input.setLanguage(this.language)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.support.describeTrustedAdvisorCheckResult(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support describe-trusted-advisor-check-result")
				.argument("check-id", checkId)
				.argument("language", language)
	}

}


fun AWSSupportFunctions.describeTrustedAdvisorCheckSummaries(init: AWSSupportDescribeTrustedAdvisorCheckSummariesCommand.() -> Unit) {
	this.block.declare(AWSSupportDescribeTrustedAdvisorCheckSummariesCommand().apply(init))
}

@Generated
class AWSSupportDescribeTrustedAdvisorCheckSummariesCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesRequest> {

	var checkIds: List<String>? = null

	override fun build(): com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesRequest {
		val input = com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesRequest()
		input.setCheckIds(this.checkIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.support.describeTrustedAdvisorCheckSummaries(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support describe-trusted-advisor-check-summaries")
				.argument("check-ids", checkIds?.toString())
	}

}


fun AWSSupportFunctions.describeTrustedAdvisorChecks(init: AWSSupportDescribeTrustedAdvisorChecksCommand.() -> Unit) {
	this.block.declare(AWSSupportDescribeTrustedAdvisorChecksCommand().apply(init))
}

@Generated
class AWSSupportDescribeTrustedAdvisorChecksCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksRequest> {

	var language: String? = null

	override fun build(): com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksRequest {
		val input = com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksRequest()
		input.setLanguage(this.language)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.support.describeTrustedAdvisorChecks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support describe-trusted-advisor-checks")
				.argument("language", language)
	}

}


fun AWSSupportFunctions.refreshTrustedAdvisorCheck(init: AWSSupportRefreshTrustedAdvisorCheckCommand.() -> Unit) {
	this.block.declare(AWSSupportRefreshTrustedAdvisorCheckCommand().apply(init))
}

@Generated
class AWSSupportRefreshTrustedAdvisorCheckCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckRequest> {

	var checkId: String? = null

	override fun build(): com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckRequest {
		val input = com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckRequest()
		input.setCheckId(this.checkId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.support.refreshTrustedAdvisorCheck(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support refresh-trusted-advisor-check")
				.argument("check-id", checkId)
	}

}


fun AWSSupportFunctions.resolveCase(init: AWSSupportResolveCaseCommand.() -> Unit) {
	this.block.declare(AWSSupportResolveCaseCommand().apply(init))
}

@Generated
class AWSSupportResolveCaseCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.ResolveCaseRequest> {

	var caseId: String? = null

	override fun build(): com.amazonaws.services.support.model.ResolveCaseRequest {
		val input = com.amazonaws.services.support.model.ResolveCaseRequest()
		input.setCaseId(this.caseId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.support.resolveCase(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support resolve-case")
				.argument("case-id", caseId)
	}

}
