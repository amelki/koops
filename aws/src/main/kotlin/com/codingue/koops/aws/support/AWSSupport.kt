
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.support

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.support.*

var com.codingue.koops.core.Environment.support: AWSSupport
	get() {
		var service = this.capabilities["aws-support"]
		if (service == null) {
			service = AWSSupportClientBuilder.standard().build()
			this.capabilities["aws-support"] = service
		}
		return service as AWSSupport
	}
	set(support) {
		this.capabilities["aws-support"] = support
	}

@Generated
class AWSSupportFunctions(val block: Script)

infix fun <T> AwsContinuation.support(init: AWSSupportFunctions.() -> T): T {
	return AWSSupportFunctions(shell).run(init)
}

			

fun AWSSupportFunctions.addAttachmentsToSet(init: (AWSSupportAddAttachmentsToSetCommand.() -> Unit)? = null): com.amazonaws.services.support.model.AddAttachmentsToSetResult {
	return this.block.declare(AWSSupportAddAttachmentsToSetCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.support.model.AddAttachmentsToSetResult
}

@Generated
class AWSSupportAddAttachmentsToSetCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.AddAttachmentsToSetRequest, com.amazonaws.services.support.model.AddAttachmentsToSetResult> {

	var attachmentSetId: String? = null
	var attachments: List<com.amazonaws.services.support.model.Attachment>? = null

	override fun build(): com.amazonaws.services.support.model.AddAttachmentsToSetRequest {
		val input = com.amazonaws.services.support.model.AddAttachmentsToSetRequest()
		input.setAttachmentSetId(this.attachmentSetId)
		input.setAttachments(this.attachments)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.support.model.AddAttachmentsToSetResult {
	  return com.amazonaws.services.support.model.AddAttachmentsToSetResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.support.model.AddAttachmentsToSetResult {
		return environment.support.addAttachmentsToSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support add-attachments-to-set")
				.argument("attachment-set-id", attachmentSetId)
				.argument("attachments", attachments?.toString())
	}

}


fun AWSSupportFunctions.addCommunicationToCase(init: (AWSSupportAddCommunicationToCaseCommand.() -> Unit)? = null): com.amazonaws.services.support.model.AddCommunicationToCaseResult {
	return this.block.declare(AWSSupportAddCommunicationToCaseCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.support.model.AddCommunicationToCaseResult
}

@Generated
class AWSSupportAddCommunicationToCaseCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.AddCommunicationToCaseRequest, com.amazonaws.services.support.model.AddCommunicationToCaseResult> {

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

	
	override fun dryResult(): com.amazonaws.services.support.model.AddCommunicationToCaseResult {
	  return com.amazonaws.services.support.model.AddCommunicationToCaseResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.support.model.AddCommunicationToCaseResult {
		return environment.support.addCommunicationToCase(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support add-communication-to-case")
				.argument("case-id", caseId)
				.argument("communication-body", communicationBody)
				.argument("cc-email-addresses", ccEmailAddresses?.toString())
				.argument("attachment-set-id", attachmentSetId)
	}

}


fun AWSSupportFunctions.createCase(init: (AWSSupportCreateCaseCommand.() -> Unit)? = null): com.amazonaws.services.support.model.CreateCaseResult {
	return this.block.declare(AWSSupportCreateCaseCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.support.model.CreateCaseResult
}

@Generated
class AWSSupportCreateCaseCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.CreateCaseRequest, com.amazonaws.services.support.model.CreateCaseResult> {

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

	
	override fun dryResult(): com.amazonaws.services.support.model.CreateCaseResult {
	  return com.amazonaws.services.support.model.CreateCaseResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.support.model.CreateCaseResult {
		return environment.support.createCase(build())
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


fun AWSSupportFunctions.describeAttachment(init: (AWSSupportDescribeAttachmentCommand.() -> Unit)? = null): com.amazonaws.services.support.model.DescribeAttachmentResult {
	return this.block.declare(AWSSupportDescribeAttachmentCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.support.model.DescribeAttachmentResult
}

@Generated
class AWSSupportDescribeAttachmentCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeAttachmentRequest, com.amazonaws.services.support.model.DescribeAttachmentResult> {

	var attachmentId: String? = null

	override fun build(): com.amazonaws.services.support.model.DescribeAttachmentRequest {
		val input = com.amazonaws.services.support.model.DescribeAttachmentRequest()
		input.setAttachmentId(this.attachmentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.support.model.DescribeAttachmentResult {
	  return com.amazonaws.services.support.model.DescribeAttachmentResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.support.model.DescribeAttachmentResult {
		return environment.support.describeAttachment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support describe-attachment")
				.argument("attachment-id", attachmentId)
	}

}


fun AWSSupportFunctions.describeCases(init: (AWSSupportDescribeCasesCommand.() -> Unit)? = null): com.amazonaws.services.support.model.DescribeCasesResult {
	return this.block.declare(AWSSupportDescribeCasesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.support.model.DescribeCasesResult
}

@Generated
class AWSSupportDescribeCasesCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeCasesRequest, com.amazonaws.services.support.model.DescribeCasesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.support.model.DescribeCasesResult {
	  return com.amazonaws.services.support.model.DescribeCasesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.support.model.DescribeCasesResult {
		return environment.support.describeCases(build())
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


fun AWSSupportFunctions.describeCommunications(init: (AWSSupportDescribeCommunicationsCommand.() -> Unit)? = null): com.amazonaws.services.support.model.DescribeCommunicationsResult {
	return this.block.declare(AWSSupportDescribeCommunicationsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.support.model.DescribeCommunicationsResult
}

@Generated
class AWSSupportDescribeCommunicationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeCommunicationsRequest, com.amazonaws.services.support.model.DescribeCommunicationsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.support.model.DescribeCommunicationsResult {
	  return com.amazonaws.services.support.model.DescribeCommunicationsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.support.model.DescribeCommunicationsResult {
		return environment.support.describeCommunications(build())
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


fun AWSSupportFunctions.describeServices(init: (AWSSupportDescribeServicesCommand.() -> Unit)? = null): com.amazonaws.services.support.model.DescribeServicesResult {
	return this.block.declare(AWSSupportDescribeServicesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.support.model.DescribeServicesResult
}

@Generated
class AWSSupportDescribeServicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeServicesRequest, com.amazonaws.services.support.model.DescribeServicesResult> {

	var serviceCodeList: List<String>? = null
	var language: String? = null

	override fun build(): com.amazonaws.services.support.model.DescribeServicesRequest {
		val input = com.amazonaws.services.support.model.DescribeServicesRequest()
		input.setServiceCodeList(this.serviceCodeList)
		input.setLanguage(this.language)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.support.model.DescribeServicesResult {
	  return com.amazonaws.services.support.model.DescribeServicesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.support.model.DescribeServicesResult {
		return environment.support.describeServices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support describe-services")
				.argument("service-code-list", serviceCodeList?.toString())
				.argument("language", language)
	}

}


fun AWSSupportFunctions.describeSeverityLevels(init: (AWSSupportDescribeSeverityLevelsCommand.() -> Unit)? = null): com.amazonaws.services.support.model.DescribeSeverityLevelsResult {
	return this.block.declare(AWSSupportDescribeSeverityLevelsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.support.model.DescribeSeverityLevelsResult
}

@Generated
class AWSSupportDescribeSeverityLevelsCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeSeverityLevelsRequest, com.amazonaws.services.support.model.DescribeSeverityLevelsResult> {

	var language: String? = null

	override fun build(): com.amazonaws.services.support.model.DescribeSeverityLevelsRequest {
		val input = com.amazonaws.services.support.model.DescribeSeverityLevelsRequest()
		input.setLanguage(this.language)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.support.model.DescribeSeverityLevelsResult {
	  return com.amazonaws.services.support.model.DescribeSeverityLevelsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.support.model.DescribeSeverityLevelsResult {
		return environment.support.describeSeverityLevels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support describe-severity-levels")
				.argument("language", language)
	}

}


fun AWSSupportFunctions.describeTrustedAdvisorCheckRefreshStatuses(init: (AWSSupportDescribeTrustedAdvisorCheckRefreshStatusesCommand.() -> Unit)? = null): com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesResult {
	return this.block.declare(AWSSupportDescribeTrustedAdvisorCheckRefreshStatusesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesResult
}

@Generated
class AWSSupportDescribeTrustedAdvisorCheckRefreshStatusesCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesRequest, com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesResult> {

	var checkIds: List<String>? = null

	override fun build(): com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesRequest {
		val input = com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesRequest()
		input.setCheckIds(this.checkIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesResult {
	  return com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesResult {
		return environment.support.describeTrustedAdvisorCheckRefreshStatuses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support describe-trusted-advisor-check-refresh-statuses")
				.argument("check-ids", checkIds?.toString())
	}

}


fun AWSSupportFunctions.describeTrustedAdvisorCheckResult(init: (AWSSupportDescribeTrustedAdvisorCheckResultCommand.() -> Unit)? = null): com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultResult {
	return this.block.declare(AWSSupportDescribeTrustedAdvisorCheckResultCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultResult
}

@Generated
class AWSSupportDescribeTrustedAdvisorCheckResultCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultRequest, com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultResult> {

	var checkId: String? = null
	var language: String? = null

	override fun build(): com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultRequest {
		val input = com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultRequest()
		input.setCheckId(this.checkId)
		input.setLanguage(this.language)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultResult {
	  return com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultResult {
		return environment.support.describeTrustedAdvisorCheckResult(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support describe-trusted-advisor-check-result")
				.argument("check-id", checkId)
				.argument("language", language)
	}

}


fun AWSSupportFunctions.describeTrustedAdvisorCheckSummaries(init: (AWSSupportDescribeTrustedAdvisorCheckSummariesCommand.() -> Unit)? = null): com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesResult {
	return this.block.declare(AWSSupportDescribeTrustedAdvisorCheckSummariesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesResult
}

@Generated
class AWSSupportDescribeTrustedAdvisorCheckSummariesCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesRequest, com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesResult> {

	var checkIds: List<String>? = null

	override fun build(): com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesRequest {
		val input = com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesRequest()
		input.setCheckIds(this.checkIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesResult {
	  return com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesResult {
		return environment.support.describeTrustedAdvisorCheckSummaries(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support describe-trusted-advisor-check-summaries")
				.argument("check-ids", checkIds?.toString())
	}

}


fun AWSSupportFunctions.describeTrustedAdvisorChecks(init: (AWSSupportDescribeTrustedAdvisorChecksCommand.() -> Unit)? = null): com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksResult {
	return this.block.declare(AWSSupportDescribeTrustedAdvisorChecksCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksResult
}

@Generated
class AWSSupportDescribeTrustedAdvisorChecksCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksRequest, com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksResult> {

	var language: String? = null

	override fun build(): com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksRequest {
		val input = com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksRequest()
		input.setLanguage(this.language)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksResult {
	  return com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksResult {
		return environment.support.describeTrustedAdvisorChecks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support describe-trusted-advisor-checks")
				.argument("language", language)
	}

}


fun AWSSupportFunctions.refreshTrustedAdvisorCheck(init: (AWSSupportRefreshTrustedAdvisorCheckCommand.() -> Unit)? = null): com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckResult {
	return this.block.declare(AWSSupportRefreshTrustedAdvisorCheckCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckResult
}

@Generated
class AWSSupportRefreshTrustedAdvisorCheckCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckRequest, com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckResult> {

	var checkId: String? = null

	override fun build(): com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckRequest {
		val input = com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckRequest()
		input.setCheckId(this.checkId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckResult {
	  return com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckResult {
		return environment.support.refreshTrustedAdvisorCheck(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support refresh-trusted-advisor-check")
				.argument("check-id", checkId)
	}

}


fun AWSSupportFunctions.resolveCase(init: (AWSSupportResolveCaseCommand.() -> Unit)? = null): com.amazonaws.services.support.model.ResolveCaseResult {
	return this.block.declare(AWSSupportResolveCaseCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.support.model.ResolveCaseResult
}

@Generated
class AWSSupportResolveCaseCommand() : AmazonWebServiceCommand<com.amazonaws.services.support.model.ResolveCaseRequest, com.amazonaws.services.support.model.ResolveCaseResult> {

	var caseId: String? = null

	override fun build(): com.amazonaws.services.support.model.ResolveCaseRequest {
		val input = com.amazonaws.services.support.model.ResolveCaseRequest()
		input.setCaseId(this.caseId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.support.model.ResolveCaseResult {
	  return com.amazonaws.services.support.model.ResolveCaseResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.support.model.ResolveCaseResult {
		return environment.support.resolveCase(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws support resolve-case")
				.argument("case-id", caseId)
	}

}
