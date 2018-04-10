
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.guardduty.AmazonGuardDuty
import com.amazonaws.services.guardduty.model.*

var codingue.koops.core.Environment.guardduty: AmazonGuardDuty
	get() = this.capabilities[AmazonGuardDuty::class.java.name] as AmazonGuardDuty
	set(guardduty) {
		this.capabilities[AmazonGuardDuty::class.java.name] = guardduty
	}

@Generated
class AmazonGuardDutyFunctions(val block: Block)

infix fun AwsContinuation.guardduty(init: AmazonGuardDutyFunctions.() -> Unit) {
	AmazonGuardDutyFunctions(shell).apply(init)
}

			

fun AmazonGuardDutyFunctions.acceptInvitation(detectorId: String, init: AmazonGuardDutyAcceptInvitationCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyAcceptInvitationCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyAcceptInvitationCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.AcceptInvitationRequest> {

	var invitationId: String? = null
	var masterId: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.AcceptInvitationRequest {
		val input = com.amazonaws.services.guardduty.model.AcceptInvitationRequest()
		input.setDetectorId(this.detectorId)
		input.setInvitationId(this.invitationId)
		input.setMasterId(this.masterId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.acceptInvitation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty accept-invitation")
				.argument("detector-id", detectorId)
				.argument("invitation-id", invitationId)
				.argument("master-id", masterId)
	}

}


fun AmazonGuardDutyFunctions.archiveFindings(detectorId: String, init: AmazonGuardDutyArchiveFindingsCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyArchiveFindingsCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyArchiveFindingsCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.ArchiveFindingsRequest> {

	var findingIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.ArchiveFindingsRequest {
		val input = com.amazonaws.services.guardduty.model.ArchiveFindingsRequest()
		input.setDetectorId(this.detectorId)
		input.setFindingIds(this.findingIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.archiveFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty archive-findings")
				.argument("detector-id", detectorId)
				.argument("finding-ids", findingIds?.toString())
	}

}


fun AmazonGuardDutyFunctions.createDetector(init: AmazonGuardDutyCreateDetectorCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyCreateDetectorCommand().apply(init))
}

@Generated
class AmazonGuardDutyCreateDetectorCommand() : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.CreateDetectorRequest> {

	var enable: Boolean? = false

	override fun build(): com.amazonaws.services.guardduty.model.CreateDetectorRequest {
		val input = com.amazonaws.services.guardduty.model.CreateDetectorRequest()
		input.setEnable(this.enable)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.createDetector(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty create-detector")
				.option("enable", enable ?: false)
	}

}


fun AmazonGuardDutyFunctions.createIPSet(detectorId: String, init: AmazonGuardDutyCreateIPSetCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyCreateIPSetCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyCreateIPSetCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.CreateIPSetRequest> {

	var activate: Boolean? = false
	var format: IpSetFormat? = null
	var location: String? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.CreateIPSetRequest {
		val input = com.amazonaws.services.guardduty.model.CreateIPSetRequest()
		input.setActivate(this.activate)
		input.setDetectorId(this.detectorId)
		input.setFormat(this.format?.toString())
		input.setLocation(this.location)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.createIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty create-ipset")
				.option("activate", activate ?: false)
				.argument("detector-id", detectorId)
				.argument("format", format?.toString())
				.argument("location", location)
				.argument("name", name)
	}

}


fun AmazonGuardDutyFunctions.createMembers(detectorId: String, init: AmazonGuardDutyCreateMembersCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyCreateMembersCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyCreateMembersCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.CreateMembersRequest> {

	var accountDetails: List<com.amazonaws.services.guardduty.model.AccountDetail>? = null

	override fun build(): com.amazonaws.services.guardduty.model.CreateMembersRequest {
		val input = com.amazonaws.services.guardduty.model.CreateMembersRequest()
		input.setAccountDetails(this.accountDetails)
		input.setDetectorId(this.detectorId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.createMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty create-members")
				.argument("account-details", accountDetails?.toString())
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.createSampleFindings(detectorId: String, init: AmazonGuardDutyCreateSampleFindingsCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyCreateSampleFindingsCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyCreateSampleFindingsCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest> {

	var findingTypes: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest {
		val input = com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest()
		input.setDetectorId(this.detectorId)
		input.setFindingTypes(this.findingTypes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.createSampleFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty create-sample-findings")
				.argument("detector-id", detectorId)
				.argument("finding-types", findingTypes?.toString())
	}

}


fun AmazonGuardDutyFunctions.createThreatIntelSet(detectorId: String, init: AmazonGuardDutyCreateThreatIntelSetCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyCreateThreatIntelSetCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyCreateThreatIntelSetCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.CreateThreatIntelSetRequest> {

	var activate: Boolean? = false
	var format: ThreatIntelSetFormat? = null
	var location: String? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.CreateThreatIntelSetRequest {
		val input = com.amazonaws.services.guardduty.model.CreateThreatIntelSetRequest()
		input.setActivate(this.activate)
		input.setDetectorId(this.detectorId)
		input.setFormat(this.format?.toString())
		input.setLocation(this.location)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.createThreatIntelSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty create-threat-intel-set")
				.option("activate", activate ?: false)
				.argument("detector-id", detectorId)
				.argument("format", format?.toString())
				.argument("location", location)
				.argument("name", name)
	}

}


fun AmazonGuardDutyFunctions.declineInvitations(init: AmazonGuardDutyDeclineInvitationsCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyDeclineInvitationsCommand().apply(init))
}

@Generated
class AmazonGuardDutyDeclineInvitationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.DeclineInvitationsRequest> {

	var accountIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.DeclineInvitationsRequest {
		val input = com.amazonaws.services.guardduty.model.DeclineInvitationsRequest()
		input.setAccountIds(this.accountIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.declineInvitations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty decline-invitations")
				.argument("account-ids", accountIds?.toString())
	}

}


fun AmazonGuardDutyFunctions.deleteDetector(detectorId: String, init: AmazonGuardDutyDeleteDetectorCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyDeleteDetectorCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyDeleteDetectorCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.DeleteDetectorRequest> {



	override fun build(): com.amazonaws.services.guardduty.model.DeleteDetectorRequest {
		val input = com.amazonaws.services.guardduty.model.DeleteDetectorRequest()
		input.setDetectorId(this.detectorId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.deleteDetector(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty delete-detector")
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.deleteIPSet(detectorId: String, ipSetId: String, init: AmazonGuardDutyDeleteIPSetCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyDeleteIPSetCommand(detectorId, ipSetId).apply(init))
}

@Generated
class AmazonGuardDutyDeleteIPSetCommand(val detectorId: String, val ipSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.DeleteIPSetRequest> {



	override fun build(): com.amazonaws.services.guardduty.model.DeleteIPSetRequest {
		val input = com.amazonaws.services.guardduty.model.DeleteIPSetRequest()
		input.setDetectorId(this.detectorId)
		input.setIpSetId(this.ipSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.deleteIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty delete-ipset")
				.argument("detector-id", detectorId)
				.argument("ip-set-id", ipSetId)
	}

}


fun AmazonGuardDutyFunctions.deleteInvitations(init: AmazonGuardDutyDeleteInvitationsCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyDeleteInvitationsCommand().apply(init))
}

@Generated
class AmazonGuardDutyDeleteInvitationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.DeleteInvitationsRequest> {

	var accountIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.DeleteInvitationsRequest {
		val input = com.amazonaws.services.guardduty.model.DeleteInvitationsRequest()
		input.setAccountIds(this.accountIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.deleteInvitations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty delete-invitations")
				.argument("account-ids", accountIds?.toString())
	}

}


fun AmazonGuardDutyFunctions.deleteMembers(detectorId: String, init: AmazonGuardDutyDeleteMembersCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyDeleteMembersCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyDeleteMembersCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.DeleteMembersRequest> {

	var accountIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.DeleteMembersRequest {
		val input = com.amazonaws.services.guardduty.model.DeleteMembersRequest()
		input.setAccountIds(this.accountIds)
		input.setDetectorId(this.detectorId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.deleteMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty delete-members")
				.argument("account-ids", accountIds?.toString())
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.deleteThreatIntelSet(detectorId: String, threatIntelSetId: String, init: AmazonGuardDutyDeleteThreatIntelSetCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyDeleteThreatIntelSetCommand(detectorId, threatIntelSetId).apply(init))
}

@Generated
class AmazonGuardDutyDeleteThreatIntelSetCommand(val detectorId: String, val threatIntelSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest> {



	override fun build(): com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest {
		val input = com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest()
		input.setDetectorId(this.detectorId)
		input.setThreatIntelSetId(this.threatIntelSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.deleteThreatIntelSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty delete-threat-intel-set")
				.argument("detector-id", detectorId)
				.argument("threat-intel-set-id", threatIntelSetId)
	}

}


fun AmazonGuardDutyFunctions.disassociateFromMasterAccount(detectorId: String, init: AmazonGuardDutyDisassociateFromMasterAccountCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyDisassociateFromMasterAccountCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyDisassociateFromMasterAccountCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest> {



	override fun build(): com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest {
		val input = com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest()
		input.setDetectorId(this.detectorId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.disassociateFromMasterAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty disassociate-from-master-account")
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.disassociateMembers(detectorId: String, init: AmazonGuardDutyDisassociateMembersCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyDisassociateMembersCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyDisassociateMembersCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.DisassociateMembersRequest> {

	var accountIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.DisassociateMembersRequest {
		val input = com.amazonaws.services.guardduty.model.DisassociateMembersRequest()
		input.setAccountIds(this.accountIds)
		input.setDetectorId(this.detectorId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.disassociateMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty disassociate-members")
				.argument("account-ids", accountIds?.toString())
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.getDetector(detectorId: String, init: AmazonGuardDutyGetDetectorCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyGetDetectorCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyGetDetectorCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.GetDetectorRequest> {



	override fun build(): com.amazonaws.services.guardduty.model.GetDetectorRequest {
		val input = com.amazonaws.services.guardduty.model.GetDetectorRequest()
		input.setDetectorId(this.detectorId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.getDetector(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty get-detector")
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.getFindings(detectorId: String, init: AmazonGuardDutyGetFindingsCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyGetFindingsCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyGetFindingsCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.GetFindingsRequest> {

	var findingIds: List<String>? = null
	var sortCriteria: com.amazonaws.services.guardduty.model.SortCriteria? = null

	override fun build(): com.amazonaws.services.guardduty.model.GetFindingsRequest {
		val input = com.amazonaws.services.guardduty.model.GetFindingsRequest()
		input.setDetectorId(this.detectorId)
		input.setFindingIds(this.findingIds)
		input.setSortCriteria(this.sortCriteria)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.getFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty get-findings")
				.argument("detector-id", detectorId)
				.argument("finding-ids", findingIds?.toString())
				.argument("sort-criteria", sortCriteria?.toString())
	}

}


fun AmazonGuardDutyFunctions.getFindingsStatistics(detectorId: String, init: AmazonGuardDutyGetFindingsStatisticsCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyGetFindingsStatisticsCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyGetFindingsStatisticsCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest> {

	var findingCriteria: com.amazonaws.services.guardduty.model.FindingCriteria? = null
	var findingStatisticTypes: List<FindingStatisticType>? = null

	override fun build(): com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest {
		val input = com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest()
		input.setDetectorId(this.detectorId)
		input.setFindingCriteria(this.findingCriteria)
		input.setFindingStatisticTypes(this.findingStatisticTypes?.map { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.getFindingsStatistics(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty get-findings-statistics")
				.argument("detector-id", detectorId)
				.argument("finding-criteria", findingCriteria?.toString())
				.argument("finding-statistic-types", findingStatisticTypes?.toString())
	}

}


fun AmazonGuardDutyFunctions.getIPSet(detectorId: String, ipSetId: String, init: AmazonGuardDutyGetIPSetCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyGetIPSetCommand(detectorId, ipSetId).apply(init))
}

@Generated
class AmazonGuardDutyGetIPSetCommand(val detectorId: String, val ipSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.GetIPSetRequest> {



	override fun build(): com.amazonaws.services.guardduty.model.GetIPSetRequest {
		val input = com.amazonaws.services.guardduty.model.GetIPSetRequest()
		input.setDetectorId(this.detectorId)
		input.setIpSetId(this.ipSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.getIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty get-ipset")
				.argument("detector-id", detectorId)
				.argument("ip-set-id", ipSetId)
	}

}


fun AmazonGuardDutyFunctions.getInvitationsCount(init: AmazonGuardDutyGetInvitationsCountCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyGetInvitationsCountCommand().apply(init))
}

@Generated
class AmazonGuardDutyGetInvitationsCountCommand() : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.GetInvitationsCountRequest> {



	override fun build(): com.amazonaws.services.guardduty.model.GetInvitationsCountRequest {
		val input = com.amazonaws.services.guardduty.model.GetInvitationsCountRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.getInvitationsCount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty get-invitations-count")

	}

}


fun AmazonGuardDutyFunctions.getMasterAccount(detectorId: String, init: AmazonGuardDutyGetMasterAccountCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyGetMasterAccountCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyGetMasterAccountCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.GetMasterAccountRequest> {



	override fun build(): com.amazonaws.services.guardduty.model.GetMasterAccountRequest {
		val input = com.amazonaws.services.guardduty.model.GetMasterAccountRequest()
		input.setDetectorId(this.detectorId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.getMasterAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty get-master-account")
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.getMembers(detectorId: String, init: AmazonGuardDutyGetMembersCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyGetMembersCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyGetMembersCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.GetMembersRequest> {

	var accountIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.GetMembersRequest {
		val input = com.amazonaws.services.guardduty.model.GetMembersRequest()
		input.setAccountIds(this.accountIds)
		input.setDetectorId(this.detectorId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.getMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty get-members")
				.argument("account-ids", accountIds?.toString())
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.getThreatIntelSet(detectorId: String, threatIntelSetId: String, init: AmazonGuardDutyGetThreatIntelSetCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyGetThreatIntelSetCommand(detectorId, threatIntelSetId).apply(init))
}

@Generated
class AmazonGuardDutyGetThreatIntelSetCommand(val detectorId: String, val threatIntelSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest> {



	override fun build(): com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest {
		val input = com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest()
		input.setDetectorId(this.detectorId)
		input.setThreatIntelSetId(this.threatIntelSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.getThreatIntelSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty get-threat-intel-set")
				.argument("detector-id", detectorId)
				.argument("threat-intel-set-id", threatIntelSetId)
	}

}


fun AmazonGuardDutyFunctions.inviteMembers(detectorId: String, init: AmazonGuardDutyInviteMembersCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyInviteMembersCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyInviteMembersCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.InviteMembersRequest> {

	var accountIds: List<String>? = null
	var message: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.InviteMembersRequest {
		val input = com.amazonaws.services.guardduty.model.InviteMembersRequest()
		input.setAccountIds(this.accountIds)
		input.setDetectorId(this.detectorId)
		input.setMessage(this.message)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.inviteMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty invite-members")
				.argument("account-ids", accountIds?.toString())
				.argument("detector-id", detectorId)
				.argument("message", message)
	}

}


fun AmazonGuardDutyFunctions.listDetectors(init: AmazonGuardDutyListDetectorsCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyListDetectorsCommand().apply(init))
}

@Generated
class AmazonGuardDutyListDetectorsCommand() : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.ListDetectorsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.ListDetectorsRequest {
		val input = com.amazonaws.services.guardduty.model.ListDetectorsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.listDetectors(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty list-detectors")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGuardDutyFunctions.listFindings(detectorId: String, init: AmazonGuardDutyListFindingsCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyListFindingsCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyListFindingsCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.ListFindingsRequest> {

	var findingCriteria: com.amazonaws.services.guardduty.model.FindingCriteria? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var sortCriteria: com.amazonaws.services.guardduty.model.SortCriteria? = null

	override fun build(): com.amazonaws.services.guardduty.model.ListFindingsRequest {
		val input = com.amazonaws.services.guardduty.model.ListFindingsRequest()
		input.setDetectorId(this.detectorId)
		input.setFindingCriteria(this.findingCriteria)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setSortCriteria(this.sortCriteria)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.listFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty list-findings")
				.argument("detector-id", detectorId)
				.argument("finding-criteria", findingCriteria?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("sort-criteria", sortCriteria?.toString())
	}

}


fun AmazonGuardDutyFunctions.listIPSets(detectorId: String, init: AmazonGuardDutyListIPSetsCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyListIPSetsCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyListIPSetsCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.ListIPSetsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.ListIPSetsRequest {
		val input = com.amazonaws.services.guardduty.model.ListIPSetsRequest()
		input.setDetectorId(this.detectorId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.listIPSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty list-ipsets")
				.argument("detector-id", detectorId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGuardDutyFunctions.listInvitations(init: AmazonGuardDutyListInvitationsCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyListInvitationsCommand().apply(init))
}

@Generated
class AmazonGuardDutyListInvitationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.ListInvitationsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.ListInvitationsRequest {
		val input = com.amazonaws.services.guardduty.model.ListInvitationsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.listInvitations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty list-invitations")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGuardDutyFunctions.listMembers(detectorId: String, init: AmazonGuardDutyListMembersCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyListMembersCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyListMembersCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.ListMembersRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null
	var onlyAssociated: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.ListMembersRequest {
		val input = com.amazonaws.services.guardduty.model.ListMembersRequest()
		input.setDetectorId(this.detectorId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setOnlyAssociated(this.onlyAssociated)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.listMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty list-members")
				.argument("detector-id", detectorId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("only-associated", onlyAssociated)
	}

}


fun AmazonGuardDutyFunctions.listThreatIntelSets(detectorId: String, init: AmazonGuardDutyListThreatIntelSetsCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyListThreatIntelSetsCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyListThreatIntelSetsCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest {
		val input = com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest()
		input.setDetectorId(this.detectorId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.listThreatIntelSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty list-threat-intel-sets")
				.argument("detector-id", detectorId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGuardDutyFunctions.startMonitoringMembers(detectorId: String, init: AmazonGuardDutyStartMonitoringMembersCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyStartMonitoringMembersCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyStartMonitoringMembersCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest> {

	var accountIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest {
		val input = com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest()
		input.setAccountIds(this.accountIds)
		input.setDetectorId(this.detectorId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.startMonitoringMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty start-monitoring-members")
				.argument("account-ids", accountIds?.toString())
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.stopMonitoringMembers(detectorId: String, init: AmazonGuardDutyStopMonitoringMembersCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyStopMonitoringMembersCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyStopMonitoringMembersCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest> {

	var accountIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest {
		val input = com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest()
		input.setAccountIds(this.accountIds)
		input.setDetectorId(this.detectorId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.stopMonitoringMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty stop-monitoring-members")
				.argument("account-ids", accountIds?.toString())
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.unarchiveFindings(detectorId: String, init: AmazonGuardDutyUnarchiveFindingsCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyUnarchiveFindingsCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyUnarchiveFindingsCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest> {

	var findingIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest {
		val input = com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest()
		input.setDetectorId(this.detectorId)
		input.setFindingIds(this.findingIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.unarchiveFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty unarchive-findings")
				.argument("detector-id", detectorId)
				.argument("finding-ids", findingIds?.toString())
	}

}


fun AmazonGuardDutyFunctions.updateDetector(detectorId: String, init: AmazonGuardDutyUpdateDetectorCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyUpdateDetectorCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyUpdateDetectorCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.UpdateDetectorRequest> {

	var enable: Boolean? = false

	override fun build(): com.amazonaws.services.guardduty.model.UpdateDetectorRequest {
		val input = com.amazonaws.services.guardduty.model.UpdateDetectorRequest()
		input.setDetectorId(this.detectorId)
		input.setEnable(this.enable)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.updateDetector(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty update-detector")
				.argument("detector-id", detectorId)
				.option("enable", enable ?: false)
	}

}


fun AmazonGuardDutyFunctions.updateFindingsFeedback(detectorId: String, init: AmazonGuardDutyUpdateFindingsFeedbackCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyUpdateFindingsFeedbackCommand(detectorId).apply(init))
}

@Generated
class AmazonGuardDutyUpdateFindingsFeedbackCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackRequest> {

	var comments: String? = null
	var feedback: Feedback? = null
	var findingIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackRequest {
		val input = com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackRequest()
		input.setComments(this.comments)
		input.setDetectorId(this.detectorId)
		input.setFeedback(this.feedback?.toString())
		input.setFindingIds(this.findingIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.updateFindingsFeedback(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty update-findings-feedback")
				.argument("comments", comments)
				.argument("detector-id", detectorId)
				.argument("feedback", feedback?.toString())
				.argument("finding-ids", findingIds?.toString())
	}

}


fun AmazonGuardDutyFunctions.updateIPSet(detectorId: String, ipSetId: String, init: AmazonGuardDutyUpdateIPSetCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyUpdateIPSetCommand(detectorId, ipSetId).apply(init))
}

@Generated
class AmazonGuardDutyUpdateIPSetCommand(val detectorId: String, val ipSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.UpdateIPSetRequest> {

	var activate: Boolean? = false
	var location: String? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.UpdateIPSetRequest {
		val input = com.amazonaws.services.guardduty.model.UpdateIPSetRequest()
		input.setActivate(this.activate)
		input.setDetectorId(this.detectorId)
		input.setIpSetId(this.ipSetId)
		input.setLocation(this.location)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.updateIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty update-ipset")
				.option("activate", activate ?: false)
				.argument("detector-id", detectorId)
				.argument("ip-set-id", ipSetId)
				.argument("location", location)
				.argument("name", name)
	}

}


fun AmazonGuardDutyFunctions.updateThreatIntelSet(detectorId: String, threatIntelSetId: String, init: AmazonGuardDutyUpdateThreatIntelSetCommand.() -> Unit) {
	this.block.declare(AmazonGuardDutyUpdateThreatIntelSetCommand(detectorId, threatIntelSetId).apply(init))
}

@Generated
class AmazonGuardDutyUpdateThreatIntelSetCommand(val detectorId: String, val threatIntelSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.UpdateThreatIntelSetRequest> {

	var activate: Boolean? = false
	var location: String? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.UpdateThreatIntelSetRequest {
		val input = com.amazonaws.services.guardduty.model.UpdateThreatIntelSetRequest()
		input.setActivate(this.activate)
		input.setDetectorId(this.detectorId)
		input.setLocation(this.location)
		input.setName(this.name)
		input.setThreatIntelSetId(this.threatIntelSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.guardduty.updateThreatIntelSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty update-threat-intel-set")
				.option("activate", activate ?: false)
				.argument("detector-id", detectorId)
				.argument("location", location)
				.argument("name", name)
				.argument("threat-intel-set-id", threatIntelSetId)
	}

}
