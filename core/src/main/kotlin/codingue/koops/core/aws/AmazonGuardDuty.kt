
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
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

infix fun <T> AwsContinuation.guardduty(init: AmazonGuardDutyFunctions.() -> T): T {
	return AmazonGuardDutyFunctions(shell).run(init)
}

			

fun AmazonGuardDutyFunctions.acceptInvitation(detectorId: String, init: AmazonGuardDutyAcceptInvitationCommand.() -> Unit): com.amazonaws.services.guardduty.model.AcceptInvitationResult {
	return this.block.declare(AmazonGuardDutyAcceptInvitationCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.AcceptInvitationResult
}

@Generated
class AmazonGuardDutyAcceptInvitationCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.AcceptInvitationRequest, com.amazonaws.services.guardduty.model.AcceptInvitationResult> {

	var invitationId: String? = null
	var masterId: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.AcceptInvitationRequest {
		val input = com.amazonaws.services.guardduty.model.AcceptInvitationRequest()
		input.setDetectorId(this.detectorId)
		input.setInvitationId(this.invitationId)
		input.setMasterId(this.masterId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.AcceptInvitationResult {
	  return com.amazonaws.services.guardduty.model.AcceptInvitationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.AcceptInvitationResult {
		return environment.guardduty.acceptInvitation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty accept-invitation")
				.argument("detector-id", detectorId)
				.argument("invitation-id", invitationId)
				.argument("master-id", masterId)
	}

}


fun AmazonGuardDutyFunctions.archiveFindings(detectorId: String, init: AmazonGuardDutyArchiveFindingsCommand.() -> Unit): com.amazonaws.services.guardduty.model.ArchiveFindingsResult {
	return this.block.declare(AmazonGuardDutyArchiveFindingsCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.ArchiveFindingsResult
}

@Generated
class AmazonGuardDutyArchiveFindingsCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.ArchiveFindingsRequest, com.amazonaws.services.guardduty.model.ArchiveFindingsResult> {

	var findingIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.ArchiveFindingsRequest {
		val input = com.amazonaws.services.guardduty.model.ArchiveFindingsRequest()
		input.setDetectorId(this.detectorId)
		input.setFindingIds(this.findingIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.ArchiveFindingsResult {
	  return com.amazonaws.services.guardduty.model.ArchiveFindingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.ArchiveFindingsResult {
		return environment.guardduty.archiveFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty archive-findings")
				.argument("detector-id", detectorId)
				.argument("finding-ids", findingIds?.toString())
	}

}


fun AmazonGuardDutyFunctions.createDetector(init: AmazonGuardDutyCreateDetectorCommand.() -> Unit): com.amazonaws.services.guardduty.model.CreateDetectorResult {
	return this.block.declare(AmazonGuardDutyCreateDetectorCommand().apply(init)) as com.amazonaws.services.guardduty.model.CreateDetectorResult
}

@Generated
class AmazonGuardDutyCreateDetectorCommand() : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.CreateDetectorRequest, com.amazonaws.services.guardduty.model.CreateDetectorResult> {

	var enable: Boolean? = false

	override fun build(): com.amazonaws.services.guardduty.model.CreateDetectorRequest {
		val input = com.amazonaws.services.guardduty.model.CreateDetectorRequest()
		input.setEnable(this.enable)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.CreateDetectorResult {
	  return com.amazonaws.services.guardduty.model.CreateDetectorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.CreateDetectorResult {
		return environment.guardduty.createDetector(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty create-detector")
				.option("enable", enable ?: false)
	}

}


fun AmazonGuardDutyFunctions.createIPSet(detectorId: String, init: AmazonGuardDutyCreateIPSetCommand.() -> Unit): com.amazonaws.services.guardduty.model.CreateIPSetResult {
	return this.block.declare(AmazonGuardDutyCreateIPSetCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.CreateIPSetResult
}

@Generated
class AmazonGuardDutyCreateIPSetCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.CreateIPSetRequest, com.amazonaws.services.guardduty.model.CreateIPSetResult> {

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

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.CreateIPSetResult {
	  return com.amazonaws.services.guardduty.model.CreateIPSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.CreateIPSetResult {
		return environment.guardduty.createIPSet(build())
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


fun AmazonGuardDutyFunctions.createMembers(detectorId: String, init: AmazonGuardDutyCreateMembersCommand.() -> Unit): com.amazonaws.services.guardduty.model.CreateMembersResult {
	return this.block.declare(AmazonGuardDutyCreateMembersCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.CreateMembersResult
}

@Generated
class AmazonGuardDutyCreateMembersCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.CreateMembersRequest, com.amazonaws.services.guardduty.model.CreateMembersResult> {

	var accountDetails: List<com.amazonaws.services.guardduty.model.AccountDetail>? = null

	override fun build(): com.amazonaws.services.guardduty.model.CreateMembersRequest {
		val input = com.amazonaws.services.guardduty.model.CreateMembersRequest()
		input.setAccountDetails(this.accountDetails)
		input.setDetectorId(this.detectorId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.CreateMembersResult {
	  return com.amazonaws.services.guardduty.model.CreateMembersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.CreateMembersResult {
		return environment.guardduty.createMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty create-members")
				.argument("account-details", accountDetails?.toString())
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.createSampleFindings(detectorId: String, init: AmazonGuardDutyCreateSampleFindingsCommand.() -> Unit): com.amazonaws.services.guardduty.model.CreateSampleFindingsResult {
	return this.block.declare(AmazonGuardDutyCreateSampleFindingsCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.CreateSampleFindingsResult
}

@Generated
class AmazonGuardDutyCreateSampleFindingsCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest, com.amazonaws.services.guardduty.model.CreateSampleFindingsResult> {

	var findingTypes: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest {
		val input = com.amazonaws.services.guardduty.model.CreateSampleFindingsRequest()
		input.setDetectorId(this.detectorId)
		input.setFindingTypes(this.findingTypes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.CreateSampleFindingsResult {
	  return com.amazonaws.services.guardduty.model.CreateSampleFindingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.CreateSampleFindingsResult {
		return environment.guardduty.createSampleFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty create-sample-findings")
				.argument("detector-id", detectorId)
				.argument("finding-types", findingTypes?.toString())
	}

}


fun AmazonGuardDutyFunctions.createThreatIntelSet(detectorId: String, init: AmazonGuardDutyCreateThreatIntelSetCommand.() -> Unit): com.amazonaws.services.guardduty.model.CreateThreatIntelSetResult {
	return this.block.declare(AmazonGuardDutyCreateThreatIntelSetCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.CreateThreatIntelSetResult
}

@Generated
class AmazonGuardDutyCreateThreatIntelSetCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.CreateThreatIntelSetRequest, com.amazonaws.services.guardduty.model.CreateThreatIntelSetResult> {

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

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.CreateThreatIntelSetResult {
	  return com.amazonaws.services.guardduty.model.CreateThreatIntelSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.CreateThreatIntelSetResult {
		return environment.guardduty.createThreatIntelSet(build())
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


fun AmazonGuardDutyFunctions.declineInvitations(init: AmazonGuardDutyDeclineInvitationsCommand.() -> Unit): com.amazonaws.services.guardduty.model.DeclineInvitationsResult {
	return this.block.declare(AmazonGuardDutyDeclineInvitationsCommand().apply(init)) as com.amazonaws.services.guardduty.model.DeclineInvitationsResult
}

@Generated
class AmazonGuardDutyDeclineInvitationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.DeclineInvitationsRequest, com.amazonaws.services.guardduty.model.DeclineInvitationsResult> {

	var accountIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.DeclineInvitationsRequest {
		val input = com.amazonaws.services.guardduty.model.DeclineInvitationsRequest()
		input.setAccountIds(this.accountIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.DeclineInvitationsResult {
	  return com.amazonaws.services.guardduty.model.DeclineInvitationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.DeclineInvitationsResult {
		return environment.guardduty.declineInvitations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty decline-invitations")
				.argument("account-ids", accountIds?.toString())
	}

}


fun AmazonGuardDutyFunctions.deleteDetector(detectorId: String, init: AmazonGuardDutyDeleteDetectorCommand.() -> Unit): com.amazonaws.services.guardduty.model.DeleteDetectorResult {
	return this.block.declare(AmazonGuardDutyDeleteDetectorCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.DeleteDetectorResult
}

@Generated
class AmazonGuardDutyDeleteDetectorCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.DeleteDetectorRequest, com.amazonaws.services.guardduty.model.DeleteDetectorResult> {



	override fun build(): com.amazonaws.services.guardduty.model.DeleteDetectorRequest {
		val input = com.amazonaws.services.guardduty.model.DeleteDetectorRequest()
		input.setDetectorId(this.detectorId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.DeleteDetectorResult {
	  return com.amazonaws.services.guardduty.model.DeleteDetectorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.DeleteDetectorResult {
		return environment.guardduty.deleteDetector(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty delete-detector")
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.deleteIPSet(detectorId: String, ipSetId: String, init: AmazonGuardDutyDeleteIPSetCommand.() -> Unit): com.amazonaws.services.guardduty.model.DeleteIPSetResult {
	return this.block.declare(AmazonGuardDutyDeleteIPSetCommand(detectorId, ipSetId).apply(init)) as com.amazonaws.services.guardduty.model.DeleteIPSetResult
}

@Generated
class AmazonGuardDutyDeleteIPSetCommand(val detectorId: String, val ipSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.DeleteIPSetRequest, com.amazonaws.services.guardduty.model.DeleteIPSetResult> {



	override fun build(): com.amazonaws.services.guardduty.model.DeleteIPSetRequest {
		val input = com.amazonaws.services.guardduty.model.DeleteIPSetRequest()
		input.setDetectorId(this.detectorId)
		input.setIpSetId(this.ipSetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.DeleteIPSetResult {
	  return com.amazonaws.services.guardduty.model.DeleteIPSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.DeleteIPSetResult {
		return environment.guardduty.deleteIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty delete-ipset")
				.argument("detector-id", detectorId)
				.argument("ip-set-id", ipSetId)
	}

}


fun AmazonGuardDutyFunctions.deleteInvitations(init: AmazonGuardDutyDeleteInvitationsCommand.() -> Unit): com.amazonaws.services.guardduty.model.DeleteInvitationsResult {
	return this.block.declare(AmazonGuardDutyDeleteInvitationsCommand().apply(init)) as com.amazonaws.services.guardduty.model.DeleteInvitationsResult
}

@Generated
class AmazonGuardDutyDeleteInvitationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.DeleteInvitationsRequest, com.amazonaws.services.guardduty.model.DeleteInvitationsResult> {

	var accountIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.DeleteInvitationsRequest {
		val input = com.amazonaws.services.guardduty.model.DeleteInvitationsRequest()
		input.setAccountIds(this.accountIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.DeleteInvitationsResult {
	  return com.amazonaws.services.guardduty.model.DeleteInvitationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.DeleteInvitationsResult {
		return environment.guardduty.deleteInvitations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty delete-invitations")
				.argument("account-ids", accountIds?.toString())
	}

}


fun AmazonGuardDutyFunctions.deleteMembers(detectorId: String, init: AmazonGuardDutyDeleteMembersCommand.() -> Unit): com.amazonaws.services.guardduty.model.DeleteMembersResult {
	return this.block.declare(AmazonGuardDutyDeleteMembersCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.DeleteMembersResult
}

@Generated
class AmazonGuardDutyDeleteMembersCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.DeleteMembersRequest, com.amazonaws.services.guardduty.model.DeleteMembersResult> {

	var accountIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.DeleteMembersRequest {
		val input = com.amazonaws.services.guardduty.model.DeleteMembersRequest()
		input.setAccountIds(this.accountIds)
		input.setDetectorId(this.detectorId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.DeleteMembersResult {
	  return com.amazonaws.services.guardduty.model.DeleteMembersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.DeleteMembersResult {
		return environment.guardduty.deleteMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty delete-members")
				.argument("account-ids", accountIds?.toString())
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.deleteThreatIntelSet(detectorId: String, threatIntelSetId: String, init: AmazonGuardDutyDeleteThreatIntelSetCommand.() -> Unit): com.amazonaws.services.guardduty.model.DeleteThreatIntelSetResult {
	return this.block.declare(AmazonGuardDutyDeleteThreatIntelSetCommand(detectorId, threatIntelSetId).apply(init)) as com.amazonaws.services.guardduty.model.DeleteThreatIntelSetResult
}

@Generated
class AmazonGuardDutyDeleteThreatIntelSetCommand(val detectorId: String, val threatIntelSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest, com.amazonaws.services.guardduty.model.DeleteThreatIntelSetResult> {



	override fun build(): com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest {
		val input = com.amazonaws.services.guardduty.model.DeleteThreatIntelSetRequest()
		input.setDetectorId(this.detectorId)
		input.setThreatIntelSetId(this.threatIntelSetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.DeleteThreatIntelSetResult {
	  return com.amazonaws.services.guardduty.model.DeleteThreatIntelSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.DeleteThreatIntelSetResult {
		return environment.guardduty.deleteThreatIntelSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty delete-threat-intel-set")
				.argument("detector-id", detectorId)
				.argument("threat-intel-set-id", threatIntelSetId)
	}

}


fun AmazonGuardDutyFunctions.disassociateFromMasterAccount(detectorId: String, init: AmazonGuardDutyDisassociateFromMasterAccountCommand.() -> Unit): com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountResult {
	return this.block.declare(AmazonGuardDutyDisassociateFromMasterAccountCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountResult
}

@Generated
class AmazonGuardDutyDisassociateFromMasterAccountCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest, com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountResult> {



	override fun build(): com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest {
		val input = com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountRequest()
		input.setDetectorId(this.detectorId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountResult {
	  return com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.DisassociateFromMasterAccountResult {
		return environment.guardduty.disassociateFromMasterAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty disassociate-from-master-account")
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.disassociateMembers(detectorId: String, init: AmazonGuardDutyDisassociateMembersCommand.() -> Unit): com.amazonaws.services.guardduty.model.DisassociateMembersResult {
	return this.block.declare(AmazonGuardDutyDisassociateMembersCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.DisassociateMembersResult
}

@Generated
class AmazonGuardDutyDisassociateMembersCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.DisassociateMembersRequest, com.amazonaws.services.guardduty.model.DisassociateMembersResult> {

	var accountIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.DisassociateMembersRequest {
		val input = com.amazonaws.services.guardduty.model.DisassociateMembersRequest()
		input.setAccountIds(this.accountIds)
		input.setDetectorId(this.detectorId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.DisassociateMembersResult {
	  return com.amazonaws.services.guardduty.model.DisassociateMembersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.DisassociateMembersResult {
		return environment.guardduty.disassociateMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty disassociate-members")
				.argument("account-ids", accountIds?.toString())
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.getDetector(detectorId: String, init: AmazonGuardDutyGetDetectorCommand.() -> Unit): com.amazonaws.services.guardduty.model.GetDetectorResult {
	return this.block.declare(AmazonGuardDutyGetDetectorCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.GetDetectorResult
}

@Generated
class AmazonGuardDutyGetDetectorCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.GetDetectorRequest, com.amazonaws.services.guardduty.model.GetDetectorResult> {



	override fun build(): com.amazonaws.services.guardduty.model.GetDetectorRequest {
		val input = com.amazonaws.services.guardduty.model.GetDetectorRequest()
		input.setDetectorId(this.detectorId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.GetDetectorResult {
	  return com.amazonaws.services.guardduty.model.GetDetectorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.GetDetectorResult {
		return environment.guardduty.getDetector(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty get-detector")
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.getFindings(detectorId: String, init: AmazonGuardDutyGetFindingsCommand.() -> Unit): com.amazonaws.services.guardduty.model.GetFindingsResult {
	return this.block.declare(AmazonGuardDutyGetFindingsCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.GetFindingsResult
}

@Generated
class AmazonGuardDutyGetFindingsCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.GetFindingsRequest, com.amazonaws.services.guardduty.model.GetFindingsResult> {

	var findingIds: List<String>? = null
	var sortCriteria: com.amazonaws.services.guardduty.model.SortCriteria? = null

	override fun build(): com.amazonaws.services.guardduty.model.GetFindingsRequest {
		val input = com.amazonaws.services.guardduty.model.GetFindingsRequest()
		input.setDetectorId(this.detectorId)
		input.setFindingIds(this.findingIds)
		input.setSortCriteria(this.sortCriteria)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.GetFindingsResult {
	  return com.amazonaws.services.guardduty.model.GetFindingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.GetFindingsResult {
		return environment.guardduty.getFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty get-findings")
				.argument("detector-id", detectorId)
				.argument("finding-ids", findingIds?.toString())
				.argument("sort-criteria", sortCriteria?.toString())
	}

}


fun AmazonGuardDutyFunctions.getFindingsStatistics(detectorId: String, init: AmazonGuardDutyGetFindingsStatisticsCommand.() -> Unit): com.amazonaws.services.guardduty.model.GetFindingsStatisticsResult {
	return this.block.declare(AmazonGuardDutyGetFindingsStatisticsCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.GetFindingsStatisticsResult
}

@Generated
class AmazonGuardDutyGetFindingsStatisticsCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest, com.amazonaws.services.guardduty.model.GetFindingsStatisticsResult> {

	var findingCriteria: com.amazonaws.services.guardduty.model.FindingCriteria? = null
	var findingStatisticTypes: List<FindingStatisticType>? = null

	override fun build(): com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest {
		val input = com.amazonaws.services.guardduty.model.GetFindingsStatisticsRequest()
		input.setDetectorId(this.detectorId)
		input.setFindingCriteria(this.findingCriteria)
		input.setFindingStatisticTypes(this.findingStatisticTypes?.map { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.GetFindingsStatisticsResult {
	  return com.amazonaws.services.guardduty.model.GetFindingsStatisticsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.GetFindingsStatisticsResult {
		return environment.guardduty.getFindingsStatistics(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty get-findings-statistics")
				.argument("detector-id", detectorId)
				.argument("finding-criteria", findingCriteria?.toString())
				.argument("finding-statistic-types", findingStatisticTypes?.toString())
	}

}


fun AmazonGuardDutyFunctions.getIPSet(detectorId: String, ipSetId: String, init: AmazonGuardDutyGetIPSetCommand.() -> Unit): com.amazonaws.services.guardduty.model.GetIPSetResult {
	return this.block.declare(AmazonGuardDutyGetIPSetCommand(detectorId, ipSetId).apply(init)) as com.amazonaws.services.guardduty.model.GetIPSetResult
}

@Generated
class AmazonGuardDutyGetIPSetCommand(val detectorId: String, val ipSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.GetIPSetRequest, com.amazonaws.services.guardduty.model.GetIPSetResult> {



	override fun build(): com.amazonaws.services.guardduty.model.GetIPSetRequest {
		val input = com.amazonaws.services.guardduty.model.GetIPSetRequest()
		input.setDetectorId(this.detectorId)
		input.setIpSetId(this.ipSetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.GetIPSetResult {
	  return com.amazonaws.services.guardduty.model.GetIPSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.GetIPSetResult {
		return environment.guardduty.getIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty get-ipset")
				.argument("detector-id", detectorId)
				.argument("ip-set-id", ipSetId)
	}

}


fun AmazonGuardDutyFunctions.getInvitationsCount(init: AmazonGuardDutyGetInvitationsCountCommand.() -> Unit): com.amazonaws.services.guardduty.model.GetInvitationsCountResult {
	return this.block.declare(AmazonGuardDutyGetInvitationsCountCommand().apply(init)) as com.amazonaws.services.guardduty.model.GetInvitationsCountResult
}

@Generated
class AmazonGuardDutyGetInvitationsCountCommand() : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.GetInvitationsCountRequest, com.amazonaws.services.guardduty.model.GetInvitationsCountResult> {



	override fun build(): com.amazonaws.services.guardduty.model.GetInvitationsCountRequest {
		val input = com.amazonaws.services.guardduty.model.GetInvitationsCountRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.GetInvitationsCountResult {
	  return com.amazonaws.services.guardduty.model.GetInvitationsCountResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.GetInvitationsCountResult {
		return environment.guardduty.getInvitationsCount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty get-invitations-count")

	}

}


fun AmazonGuardDutyFunctions.getMasterAccount(detectorId: String, init: AmazonGuardDutyGetMasterAccountCommand.() -> Unit): com.amazonaws.services.guardduty.model.GetMasterAccountResult {
	return this.block.declare(AmazonGuardDutyGetMasterAccountCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.GetMasterAccountResult
}

@Generated
class AmazonGuardDutyGetMasterAccountCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.GetMasterAccountRequest, com.amazonaws.services.guardduty.model.GetMasterAccountResult> {



	override fun build(): com.amazonaws.services.guardduty.model.GetMasterAccountRequest {
		val input = com.amazonaws.services.guardduty.model.GetMasterAccountRequest()
		input.setDetectorId(this.detectorId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.GetMasterAccountResult {
	  return com.amazonaws.services.guardduty.model.GetMasterAccountResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.GetMasterAccountResult {
		return environment.guardduty.getMasterAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty get-master-account")
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.getMembers(detectorId: String, init: AmazonGuardDutyGetMembersCommand.() -> Unit): com.amazonaws.services.guardduty.model.GetMembersResult {
	return this.block.declare(AmazonGuardDutyGetMembersCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.GetMembersResult
}

@Generated
class AmazonGuardDutyGetMembersCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.GetMembersRequest, com.amazonaws.services.guardduty.model.GetMembersResult> {

	var accountIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.GetMembersRequest {
		val input = com.amazonaws.services.guardduty.model.GetMembersRequest()
		input.setAccountIds(this.accountIds)
		input.setDetectorId(this.detectorId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.GetMembersResult {
	  return com.amazonaws.services.guardduty.model.GetMembersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.GetMembersResult {
		return environment.guardduty.getMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty get-members")
				.argument("account-ids", accountIds?.toString())
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.getThreatIntelSet(detectorId: String, threatIntelSetId: String, init: AmazonGuardDutyGetThreatIntelSetCommand.() -> Unit): com.amazonaws.services.guardduty.model.GetThreatIntelSetResult {
	return this.block.declare(AmazonGuardDutyGetThreatIntelSetCommand(detectorId, threatIntelSetId).apply(init)) as com.amazonaws.services.guardduty.model.GetThreatIntelSetResult
}

@Generated
class AmazonGuardDutyGetThreatIntelSetCommand(val detectorId: String, val threatIntelSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest, com.amazonaws.services.guardduty.model.GetThreatIntelSetResult> {



	override fun build(): com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest {
		val input = com.amazonaws.services.guardduty.model.GetThreatIntelSetRequest()
		input.setDetectorId(this.detectorId)
		input.setThreatIntelSetId(this.threatIntelSetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.GetThreatIntelSetResult {
	  return com.amazonaws.services.guardduty.model.GetThreatIntelSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.GetThreatIntelSetResult {
		return environment.guardduty.getThreatIntelSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty get-threat-intel-set")
				.argument("detector-id", detectorId)
				.argument("threat-intel-set-id", threatIntelSetId)
	}

}


fun AmazonGuardDutyFunctions.inviteMembers(detectorId: String, init: AmazonGuardDutyInviteMembersCommand.() -> Unit): com.amazonaws.services.guardduty.model.InviteMembersResult {
	return this.block.declare(AmazonGuardDutyInviteMembersCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.InviteMembersResult
}

@Generated
class AmazonGuardDutyInviteMembersCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.InviteMembersRequest, com.amazonaws.services.guardduty.model.InviteMembersResult> {

	var accountIds: List<String>? = null
	var message: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.InviteMembersRequest {
		val input = com.amazonaws.services.guardduty.model.InviteMembersRequest()
		input.setAccountIds(this.accountIds)
		input.setDetectorId(this.detectorId)
		input.setMessage(this.message)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.InviteMembersResult {
	  return com.amazonaws.services.guardduty.model.InviteMembersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.InviteMembersResult {
		return environment.guardduty.inviteMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty invite-members")
				.argument("account-ids", accountIds?.toString())
				.argument("detector-id", detectorId)
				.argument("message", message)
	}

}


fun AmazonGuardDutyFunctions.listDetectors(init: AmazonGuardDutyListDetectorsCommand.() -> Unit): com.amazonaws.services.guardduty.model.ListDetectorsResult {
	return this.block.declare(AmazonGuardDutyListDetectorsCommand().apply(init)) as com.amazonaws.services.guardduty.model.ListDetectorsResult
}

@Generated
class AmazonGuardDutyListDetectorsCommand() : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.ListDetectorsRequest, com.amazonaws.services.guardduty.model.ListDetectorsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.ListDetectorsRequest {
		val input = com.amazonaws.services.guardduty.model.ListDetectorsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.ListDetectorsResult {
	  return com.amazonaws.services.guardduty.model.ListDetectorsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.ListDetectorsResult {
		return environment.guardduty.listDetectors(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty list-detectors")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGuardDutyFunctions.listFindings(detectorId: String, init: AmazonGuardDutyListFindingsCommand.() -> Unit): com.amazonaws.services.guardduty.model.ListFindingsResult {
	return this.block.declare(AmazonGuardDutyListFindingsCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.ListFindingsResult
}

@Generated
class AmazonGuardDutyListFindingsCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.ListFindingsRequest, com.amazonaws.services.guardduty.model.ListFindingsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.ListFindingsResult {
	  return com.amazonaws.services.guardduty.model.ListFindingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.ListFindingsResult {
		return environment.guardduty.listFindings(build())
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


fun AmazonGuardDutyFunctions.listIPSets(detectorId: String, init: AmazonGuardDutyListIPSetsCommand.() -> Unit): com.amazonaws.services.guardduty.model.ListIPSetsResult {
	return this.block.declare(AmazonGuardDutyListIPSetsCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.ListIPSetsResult
}

@Generated
class AmazonGuardDutyListIPSetsCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.ListIPSetsRequest, com.amazonaws.services.guardduty.model.ListIPSetsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.ListIPSetsRequest {
		val input = com.amazonaws.services.guardduty.model.ListIPSetsRequest()
		input.setDetectorId(this.detectorId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.ListIPSetsResult {
	  return com.amazonaws.services.guardduty.model.ListIPSetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.ListIPSetsResult {
		return environment.guardduty.listIPSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty list-ipsets")
				.argument("detector-id", detectorId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGuardDutyFunctions.listInvitations(init: AmazonGuardDutyListInvitationsCommand.() -> Unit): com.amazonaws.services.guardduty.model.ListInvitationsResult {
	return this.block.declare(AmazonGuardDutyListInvitationsCommand().apply(init)) as com.amazonaws.services.guardduty.model.ListInvitationsResult
}

@Generated
class AmazonGuardDutyListInvitationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.ListInvitationsRequest, com.amazonaws.services.guardduty.model.ListInvitationsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.ListInvitationsRequest {
		val input = com.amazonaws.services.guardduty.model.ListInvitationsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.ListInvitationsResult {
	  return com.amazonaws.services.guardduty.model.ListInvitationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.ListInvitationsResult {
		return environment.guardduty.listInvitations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty list-invitations")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGuardDutyFunctions.listMembers(detectorId: String, init: AmazonGuardDutyListMembersCommand.() -> Unit): com.amazonaws.services.guardduty.model.ListMembersResult {
	return this.block.declare(AmazonGuardDutyListMembersCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.ListMembersResult
}

@Generated
class AmazonGuardDutyListMembersCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.ListMembersRequest, com.amazonaws.services.guardduty.model.ListMembersResult> {

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

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.ListMembersResult {
	  return com.amazonaws.services.guardduty.model.ListMembersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.ListMembersResult {
		return environment.guardduty.listMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty list-members")
				.argument("detector-id", detectorId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("only-associated", onlyAssociated)
	}

}


fun AmazonGuardDutyFunctions.listThreatIntelSets(detectorId: String, init: AmazonGuardDutyListThreatIntelSetsCommand.() -> Unit): com.amazonaws.services.guardduty.model.ListThreatIntelSetsResult {
	return this.block.declare(AmazonGuardDutyListThreatIntelSetsCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.ListThreatIntelSetsResult
}

@Generated
class AmazonGuardDutyListThreatIntelSetsCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest, com.amazonaws.services.guardduty.model.ListThreatIntelSetsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest {
		val input = com.amazonaws.services.guardduty.model.ListThreatIntelSetsRequest()
		input.setDetectorId(this.detectorId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.ListThreatIntelSetsResult {
	  return com.amazonaws.services.guardduty.model.ListThreatIntelSetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.ListThreatIntelSetsResult {
		return environment.guardduty.listThreatIntelSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty list-threat-intel-sets")
				.argument("detector-id", detectorId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonGuardDutyFunctions.startMonitoringMembers(detectorId: String, init: AmazonGuardDutyStartMonitoringMembersCommand.() -> Unit): com.amazonaws.services.guardduty.model.StartMonitoringMembersResult {
	return this.block.declare(AmazonGuardDutyStartMonitoringMembersCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.StartMonitoringMembersResult
}

@Generated
class AmazonGuardDutyStartMonitoringMembersCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest, com.amazonaws.services.guardduty.model.StartMonitoringMembersResult> {

	var accountIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest {
		val input = com.amazonaws.services.guardduty.model.StartMonitoringMembersRequest()
		input.setAccountIds(this.accountIds)
		input.setDetectorId(this.detectorId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.StartMonitoringMembersResult {
	  return com.amazonaws.services.guardduty.model.StartMonitoringMembersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.StartMonitoringMembersResult {
		return environment.guardduty.startMonitoringMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty start-monitoring-members")
				.argument("account-ids", accountIds?.toString())
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.stopMonitoringMembers(detectorId: String, init: AmazonGuardDutyStopMonitoringMembersCommand.() -> Unit): com.amazonaws.services.guardduty.model.StopMonitoringMembersResult {
	return this.block.declare(AmazonGuardDutyStopMonitoringMembersCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.StopMonitoringMembersResult
}

@Generated
class AmazonGuardDutyStopMonitoringMembersCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest, com.amazonaws.services.guardduty.model.StopMonitoringMembersResult> {

	var accountIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest {
		val input = com.amazonaws.services.guardduty.model.StopMonitoringMembersRequest()
		input.setAccountIds(this.accountIds)
		input.setDetectorId(this.detectorId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.StopMonitoringMembersResult {
	  return com.amazonaws.services.guardduty.model.StopMonitoringMembersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.StopMonitoringMembersResult {
		return environment.guardduty.stopMonitoringMembers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty stop-monitoring-members")
				.argument("account-ids", accountIds?.toString())
				.argument("detector-id", detectorId)
	}

}


fun AmazonGuardDutyFunctions.unarchiveFindings(detectorId: String, init: AmazonGuardDutyUnarchiveFindingsCommand.() -> Unit): com.amazonaws.services.guardduty.model.UnarchiveFindingsResult {
	return this.block.declare(AmazonGuardDutyUnarchiveFindingsCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.UnarchiveFindingsResult
}

@Generated
class AmazonGuardDutyUnarchiveFindingsCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest, com.amazonaws.services.guardduty.model.UnarchiveFindingsResult> {

	var findingIds: List<String>? = null

	override fun build(): com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest {
		val input = com.amazonaws.services.guardduty.model.UnarchiveFindingsRequest()
		input.setDetectorId(this.detectorId)
		input.setFindingIds(this.findingIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.UnarchiveFindingsResult {
	  return com.amazonaws.services.guardduty.model.UnarchiveFindingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.UnarchiveFindingsResult {
		return environment.guardduty.unarchiveFindings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty unarchive-findings")
				.argument("detector-id", detectorId)
				.argument("finding-ids", findingIds?.toString())
	}

}


fun AmazonGuardDutyFunctions.updateDetector(detectorId: String, init: AmazonGuardDutyUpdateDetectorCommand.() -> Unit): com.amazonaws.services.guardduty.model.UpdateDetectorResult {
	return this.block.declare(AmazonGuardDutyUpdateDetectorCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.UpdateDetectorResult
}

@Generated
class AmazonGuardDutyUpdateDetectorCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.UpdateDetectorRequest, com.amazonaws.services.guardduty.model.UpdateDetectorResult> {

	var enable: Boolean? = false

	override fun build(): com.amazonaws.services.guardduty.model.UpdateDetectorRequest {
		val input = com.amazonaws.services.guardduty.model.UpdateDetectorRequest()
		input.setDetectorId(this.detectorId)
		input.setEnable(this.enable)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.UpdateDetectorResult {
	  return com.amazonaws.services.guardduty.model.UpdateDetectorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.UpdateDetectorResult {
		return environment.guardduty.updateDetector(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty update-detector")
				.argument("detector-id", detectorId)
				.option("enable", enable ?: false)
	}

}


fun AmazonGuardDutyFunctions.updateFindingsFeedback(detectorId: String, init: AmazonGuardDutyUpdateFindingsFeedbackCommand.() -> Unit): com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackResult {
	return this.block.declare(AmazonGuardDutyUpdateFindingsFeedbackCommand(detectorId).apply(init)) as com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackResult
}

@Generated
class AmazonGuardDutyUpdateFindingsFeedbackCommand(val detectorId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackRequest, com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackResult> {

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

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackResult {
	  return com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.UpdateFindingsFeedbackResult {
		return environment.guardduty.updateFindingsFeedback(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws guardduty update-findings-feedback")
				.argument("comments", comments)
				.argument("detector-id", detectorId)
				.argument("feedback", feedback?.toString())
				.argument("finding-ids", findingIds?.toString())
	}

}


fun AmazonGuardDutyFunctions.updateIPSet(detectorId: String, ipSetId: String, init: AmazonGuardDutyUpdateIPSetCommand.() -> Unit): com.amazonaws.services.guardduty.model.UpdateIPSetResult {
	return this.block.declare(AmazonGuardDutyUpdateIPSetCommand(detectorId, ipSetId).apply(init)) as com.amazonaws.services.guardduty.model.UpdateIPSetResult
}

@Generated
class AmazonGuardDutyUpdateIPSetCommand(val detectorId: String, val ipSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.UpdateIPSetRequest, com.amazonaws.services.guardduty.model.UpdateIPSetResult> {

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

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.UpdateIPSetResult {
	  return com.amazonaws.services.guardduty.model.UpdateIPSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.UpdateIPSetResult {
		return environment.guardduty.updateIPSet(build())
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


fun AmazonGuardDutyFunctions.updateThreatIntelSet(detectorId: String, threatIntelSetId: String, init: AmazonGuardDutyUpdateThreatIntelSetCommand.() -> Unit): com.amazonaws.services.guardduty.model.UpdateThreatIntelSetResult {
	return this.block.declare(AmazonGuardDutyUpdateThreatIntelSetCommand(detectorId, threatIntelSetId).apply(init)) as com.amazonaws.services.guardduty.model.UpdateThreatIntelSetResult
}

@Generated
class AmazonGuardDutyUpdateThreatIntelSetCommand(val detectorId: String, val threatIntelSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.guardduty.model.UpdateThreatIntelSetRequest, com.amazonaws.services.guardduty.model.UpdateThreatIntelSetResult> {

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

	
	override fun dryResult(): com.amazonaws.services.guardduty.model.UpdateThreatIntelSetResult {
	  return com.amazonaws.services.guardduty.model.UpdateThreatIntelSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.guardduty.model.UpdateThreatIntelSetResult {
		return environment.guardduty.updateThreatIntelSet(build())
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
