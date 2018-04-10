
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.route53domains.AmazonRoute53Domains
import com.amazonaws.services.route53domains.model.*

var codingue.koops.core.Environment.route53domains: AmazonRoute53Domains
	get() = this.capabilities[AmazonRoute53Domains::class.java.name] as AmazonRoute53Domains
	set(route53domains) {
		this.capabilities[AmazonRoute53Domains::class.java.name] = route53domains
	}

@Generated
class AmazonRoute53DomainsFunctions(val block: Block)

infix fun AwsContinuation.route53domains(init: AmazonRoute53DomainsFunctions.() -> Unit) {
	AmazonRoute53DomainsFunctions(shell).apply(init)
}

			

fun AmazonRoute53DomainsFunctions.checkDomainAvailability(domainName: String, init: AmazonRoute53DomainsCheckDomainAvailabilityCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsCheckDomainAvailabilityCommand(domainName).apply(init))
}

@Generated
class AmazonRoute53DomainsCheckDomainAvailabilityCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest> {

	var idnLangCode: String? = null

	override fun build(): com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest {
		val input = com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest()
		input.setDomainName(this.domainName)
		input.setIdnLangCode(this.idnLangCode)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.checkDomainAvailability(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains check-domain-availability")
				.argument("domain-name", domainName)
				.argument("idn-lang-code", idnLangCode)
	}

}


fun AmazonRoute53DomainsFunctions.checkDomainTransferability(domainName: String, init: AmazonRoute53DomainsCheckDomainTransferabilityCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsCheckDomainTransferabilityCommand(domainName).apply(init))
}

@Generated
class AmazonRoute53DomainsCheckDomainTransferabilityCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest> {

	var authCode: String? = null

	override fun build(): com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest {
		val input = com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest()
		input.setDomainName(this.domainName)
		input.setAuthCode(this.authCode)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.checkDomainTransferability(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains check-domain-transferability")
				.argument("domain-name", domainName)
				.argument("auth-code", authCode)
	}

}


fun AmazonRoute53DomainsFunctions.deleteTagsForDomain(domainName: String, tagsToDelete: List<String>, init: AmazonRoute53DomainsDeleteTagsForDomainCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsDeleteTagsForDomainCommand(domainName, tagsToDelete).apply(init))
}

@Generated
class AmazonRoute53DomainsDeleteTagsForDomainCommand(val domainName: String, val tagsToDelete: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest> {



	override fun build(): com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest {
		val input = com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest()
		input.setDomainName(this.domainName)
		input.setTagsToDelete(this.tagsToDelete)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.deleteTagsForDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains delete-tags-for-domain")
				.argument("domain-name", domainName)
				.argument("tags-to-delete", tagsToDelete.toString())
	}

}


fun AmazonRoute53DomainsFunctions.disableDomainAutoRenew(domainName: String, init: AmazonRoute53DomainsDisableDomainAutoRenewCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsDisableDomainAutoRenewCommand(domainName).apply(init))
}

@Generated
class AmazonRoute53DomainsDisableDomainAutoRenewCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest> {



	override fun build(): com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest {
		val input = com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.disableDomainAutoRenew(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains disable-domain-auto-renew")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.disableDomainTransferLock(domainName: String, init: AmazonRoute53DomainsDisableDomainTransferLockCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsDisableDomainTransferLockCommand(domainName).apply(init))
}

@Generated
class AmazonRoute53DomainsDisableDomainTransferLockCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest> {



	override fun build(): com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest {
		val input = com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.disableDomainTransferLock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains disable-domain-transfer-lock")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.enableDomainAutoRenew(domainName: String, init: AmazonRoute53DomainsEnableDomainAutoRenewCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsEnableDomainAutoRenewCommand(domainName).apply(init))
}

@Generated
class AmazonRoute53DomainsEnableDomainAutoRenewCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest> {



	override fun build(): com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest {
		val input = com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.enableDomainAutoRenew(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains enable-domain-auto-renew")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.enableDomainTransferLock(domainName: String, init: AmazonRoute53DomainsEnableDomainTransferLockCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsEnableDomainTransferLockCommand(domainName).apply(init))
}

@Generated
class AmazonRoute53DomainsEnableDomainTransferLockCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest> {



	override fun build(): com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest {
		val input = com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.enableDomainTransferLock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains enable-domain-transfer-lock")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.getContactReachabilityStatus(init: AmazonRoute53DomainsGetContactReachabilityStatusCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsGetContactReachabilityStatusCommand().apply(init))
}

@Generated
class AmazonRoute53DomainsGetContactReachabilityStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest> {

	var domainName: String? = null

	override fun build(): com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest {
		val input = com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.getContactReachabilityStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains get-contact-reachability-status")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.getDomainDetail(domainName: String, init: AmazonRoute53DomainsGetDomainDetailCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsGetDomainDetailCommand(domainName).apply(init))
}

@Generated
class AmazonRoute53DomainsGetDomainDetailCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.GetDomainDetailRequest> {



	override fun build(): com.amazonaws.services.route53domains.model.GetDomainDetailRequest {
		val input = com.amazonaws.services.route53domains.model.GetDomainDetailRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.getDomainDetail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains get-domain-detail")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.getDomainSuggestions(domainName: String, suggestionCount: Int, onlyAvailable: Boolean, init: AmazonRoute53DomainsGetDomainSuggestionsCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsGetDomainSuggestionsCommand(domainName, suggestionCount, onlyAvailable).apply(init))
}

@Generated
class AmazonRoute53DomainsGetDomainSuggestionsCommand(val domainName: String, val suggestionCount: Int, val onlyAvailable: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest> {



	override fun build(): com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest {
		val input = com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest()
		input.setDomainName(this.domainName)
		input.setSuggestionCount(this.suggestionCount)
		input.setOnlyAvailable(this.onlyAvailable)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.getDomainSuggestions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains get-domain-suggestions")
				.argument("domain-name", domainName)
				.argument("suggestion-count", suggestionCount.toString())
				.option("only-available", onlyAvailable ?: false)
	}

}


fun AmazonRoute53DomainsFunctions.getOperationDetail(operationId: String, init: AmazonRoute53DomainsGetOperationDetailCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsGetOperationDetailCommand(operationId).apply(init))
}

@Generated
class AmazonRoute53DomainsGetOperationDetailCommand(val operationId: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.GetOperationDetailRequest> {



	override fun build(): com.amazonaws.services.route53domains.model.GetOperationDetailRequest {
		val input = com.amazonaws.services.route53domains.model.GetOperationDetailRequest()
		input.setOperationId(this.operationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.getOperationDetail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains get-operation-detail")
				.argument("operation-id", operationId)
	}

}


fun AmazonRoute53DomainsFunctions.listDomains(init: AmazonRoute53DomainsListDomainsCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsListDomainsCommand().apply(init))
}

@Generated
class AmazonRoute53DomainsListDomainsCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.ListDomainsRequest> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.route53domains.model.ListDomainsRequest {
		val input = com.amazonaws.services.route53domains.model.ListDomainsRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.listDomains(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains list-domains")
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonRoute53DomainsFunctions.listOperations(init: AmazonRoute53DomainsListOperationsCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsListOperationsCommand().apply(init))
}

@Generated
class AmazonRoute53DomainsListOperationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.ListOperationsRequest> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.route53domains.model.ListOperationsRequest {
		val input = com.amazonaws.services.route53domains.model.ListOperationsRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.listOperations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains list-operations")
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonRoute53DomainsFunctions.listTagsForDomain(domainName: String, init: AmazonRoute53DomainsListTagsForDomainCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsListTagsForDomainCommand(domainName).apply(init))
}

@Generated
class AmazonRoute53DomainsListTagsForDomainCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.ListTagsForDomainRequest> {



	override fun build(): com.amazonaws.services.route53domains.model.ListTagsForDomainRequest {
		val input = com.amazonaws.services.route53domains.model.ListTagsForDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.listTagsForDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains list-tags-for-domain")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.registerDomain(domainName: String, durationInYears: Int, adminContact: com.amazonaws.services.route53domains.model.ContactDetail, registrantContact: com.amazonaws.services.route53domains.model.ContactDetail, techContact: com.amazonaws.services.route53domains.model.ContactDetail, init: AmazonRoute53DomainsRegisterDomainCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsRegisterDomainCommand(domainName, durationInYears, adminContact, registrantContact, techContact).apply(init))
}

@Generated
class AmazonRoute53DomainsRegisterDomainCommand(val domainName: String, val durationInYears: Int, val adminContact: com.amazonaws.services.route53domains.model.ContactDetail, val registrantContact: com.amazonaws.services.route53domains.model.ContactDetail, val techContact: com.amazonaws.services.route53domains.model.ContactDetail) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.RegisterDomainRequest> {

	var idnLangCode: String? = null
	var autoRenew: Boolean? = false
	var privacyProtectAdminContact: Boolean? = false
	var privacyProtectRegistrantContact: Boolean? = false
	var privacyProtectTechContact: Boolean? = false

	override fun build(): com.amazonaws.services.route53domains.model.RegisterDomainRequest {
		val input = com.amazonaws.services.route53domains.model.RegisterDomainRequest()
		input.setDomainName(this.domainName)
		input.setIdnLangCode(this.idnLangCode)
		input.setDurationInYears(this.durationInYears)
		input.setAutoRenew(this.autoRenew)
		input.setAdminContact(this.adminContact)
		input.setRegistrantContact(this.registrantContact)
		input.setTechContact(this.techContact)
		input.setPrivacyProtectAdminContact(this.privacyProtectAdminContact)
		input.setPrivacyProtectRegistrantContact(this.privacyProtectRegistrantContact)
		input.setPrivacyProtectTechContact(this.privacyProtectTechContact)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.registerDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains register-domain")
				.argument("domain-name", domainName)
				.argument("idn-lang-code", idnLangCode)
				.argument("duration-in-years", durationInYears.toString())
				.option("auto-renew", autoRenew ?: false)
				.argument("admin-contact", adminContact.toString())
				.argument("registrant-contact", registrantContact.toString())
				.argument("tech-contact", techContact.toString())
				.option("privacy-protect-admin-contact", privacyProtectAdminContact ?: false)
				.option("privacy-protect-registrant-contact", privacyProtectRegistrantContact ?: false)
				.option("privacy-protect-tech-contact", privacyProtectTechContact ?: false)
	}

}


fun AmazonRoute53DomainsFunctions.renewDomain(domainName: String, currentExpiryYear: Int, init: AmazonRoute53DomainsRenewDomainCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsRenewDomainCommand(domainName, currentExpiryYear).apply(init))
}

@Generated
class AmazonRoute53DomainsRenewDomainCommand(val domainName: String, val currentExpiryYear: Int) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.RenewDomainRequest> {

	var durationInYears: Int? = 0

	override fun build(): com.amazonaws.services.route53domains.model.RenewDomainRequest {
		val input = com.amazonaws.services.route53domains.model.RenewDomainRequest()
		input.setDomainName(this.domainName)
		input.setDurationInYears(this.durationInYears)
		input.setCurrentExpiryYear(this.currentExpiryYear)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.renewDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains renew-domain")
				.argument("domain-name", domainName)
				.argument("duration-in-years", durationInYears?.toString())
				.argument("current-expiry-year", currentExpiryYear.toString())
	}

}


fun AmazonRoute53DomainsFunctions.resendContactReachabilityEmail(init: AmazonRoute53DomainsResendContactReachabilityEmailCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsResendContactReachabilityEmailCommand().apply(init))
}

@Generated
class AmazonRoute53DomainsResendContactReachabilityEmailCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest> {

	var domainName: String? = null

	override fun build(): com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest {
		val input = com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.resendContactReachabilityEmail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains resend-contact-reachability-email")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.retrieveDomainAuthCode(domainName: String, init: AmazonRoute53DomainsRetrieveDomainAuthCodeCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsRetrieveDomainAuthCodeCommand(domainName).apply(init))
}

@Generated
class AmazonRoute53DomainsRetrieveDomainAuthCodeCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest> {



	override fun build(): com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest {
		val input = com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.retrieveDomainAuthCode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains retrieve-domain-auth-code")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.transferDomain(domainName: String, durationInYears: Int, adminContact: com.amazonaws.services.route53domains.model.ContactDetail, registrantContact: com.amazonaws.services.route53domains.model.ContactDetail, techContact: com.amazonaws.services.route53domains.model.ContactDetail, init: AmazonRoute53DomainsTransferDomainCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsTransferDomainCommand(domainName, durationInYears, adminContact, registrantContact, techContact).apply(init))
}

@Generated
class AmazonRoute53DomainsTransferDomainCommand(val domainName: String, val durationInYears: Int, val adminContact: com.amazonaws.services.route53domains.model.ContactDetail, val registrantContact: com.amazonaws.services.route53domains.model.ContactDetail, val techContact: com.amazonaws.services.route53domains.model.ContactDetail) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.TransferDomainRequest> {

	var idnLangCode: String? = null
	var nameservers: List<com.amazonaws.services.route53domains.model.Nameserver>? = null
	var authCode: String? = null
	var autoRenew: Boolean? = false
	var privacyProtectAdminContact: Boolean? = false
	var privacyProtectRegistrantContact: Boolean? = false
	var privacyProtectTechContact: Boolean? = false

	override fun build(): com.amazonaws.services.route53domains.model.TransferDomainRequest {
		val input = com.amazonaws.services.route53domains.model.TransferDomainRequest()
		input.setDomainName(this.domainName)
		input.setIdnLangCode(this.idnLangCode)
		input.setDurationInYears(this.durationInYears)
		input.setNameservers(this.nameservers)
		input.setAuthCode(this.authCode)
		input.setAutoRenew(this.autoRenew)
		input.setAdminContact(this.adminContact)
		input.setRegistrantContact(this.registrantContact)
		input.setTechContact(this.techContact)
		input.setPrivacyProtectAdminContact(this.privacyProtectAdminContact)
		input.setPrivacyProtectRegistrantContact(this.privacyProtectRegistrantContact)
		input.setPrivacyProtectTechContact(this.privacyProtectTechContact)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.transferDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains transfer-domain")
				.argument("domain-name", domainName)
				.argument("idn-lang-code", idnLangCode)
				.argument("duration-in-years", durationInYears.toString())
				.argument("nameservers", nameservers?.toString())
				.argument("auth-code", authCode)
				.option("auto-renew", autoRenew ?: false)
				.argument("admin-contact", adminContact.toString())
				.argument("registrant-contact", registrantContact.toString())
				.argument("tech-contact", techContact.toString())
				.option("privacy-protect-admin-contact", privacyProtectAdminContact ?: false)
				.option("privacy-protect-registrant-contact", privacyProtectRegistrantContact ?: false)
				.option("privacy-protect-tech-contact", privacyProtectTechContact ?: false)
	}

}


fun AmazonRoute53DomainsFunctions.updateDomainContact(domainName: String, init: AmazonRoute53DomainsUpdateDomainContactCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsUpdateDomainContactCommand(domainName).apply(init))
}

@Generated
class AmazonRoute53DomainsUpdateDomainContactCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.UpdateDomainContactRequest> {

	var adminContact: com.amazonaws.services.route53domains.model.ContactDetail? = null
	var registrantContact: com.amazonaws.services.route53domains.model.ContactDetail? = null
	var techContact: com.amazonaws.services.route53domains.model.ContactDetail? = null

	override fun build(): com.amazonaws.services.route53domains.model.UpdateDomainContactRequest {
		val input = com.amazonaws.services.route53domains.model.UpdateDomainContactRequest()
		input.setDomainName(this.domainName)
		input.setAdminContact(this.adminContact)
		input.setRegistrantContact(this.registrantContact)
		input.setTechContact(this.techContact)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.updateDomainContact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains update-domain-contact")
				.argument("domain-name", domainName)
				.argument("admin-contact", adminContact?.toString())
				.argument("registrant-contact", registrantContact?.toString())
				.argument("tech-contact", techContact?.toString())
	}

}


fun AmazonRoute53DomainsFunctions.updateDomainContactPrivacy(domainName: String, init: AmazonRoute53DomainsUpdateDomainContactPrivacyCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsUpdateDomainContactPrivacyCommand(domainName).apply(init))
}

@Generated
class AmazonRoute53DomainsUpdateDomainContactPrivacyCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyRequest> {

	var adminPrivacy: Boolean? = false
	var registrantPrivacy: Boolean? = false
	var techPrivacy: Boolean? = false

	override fun build(): com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyRequest {
		val input = com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyRequest()
		input.setDomainName(this.domainName)
		input.setAdminPrivacy(this.adminPrivacy)
		input.setRegistrantPrivacy(this.registrantPrivacy)
		input.setTechPrivacy(this.techPrivacy)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.updateDomainContactPrivacy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains update-domain-contact-privacy")
				.argument("domain-name", domainName)
				.option("admin-privacy", adminPrivacy ?: false)
				.option("registrant-privacy", registrantPrivacy ?: false)
				.option("tech-privacy", techPrivacy ?: false)
	}

}


fun AmazonRoute53DomainsFunctions.updateDomainNameservers(domainName: String, nameservers: List<com.amazonaws.services.route53domains.model.Nameserver>, init: AmazonRoute53DomainsUpdateDomainNameserversCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsUpdateDomainNameserversCommand(domainName, nameservers).apply(init))
}

@Generated
class AmazonRoute53DomainsUpdateDomainNameserversCommand(val domainName: String, val nameservers: List<com.amazonaws.services.route53domains.model.Nameserver>) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest> {

	var fIAuthKey: String? = null

	override fun build(): com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest {
		val input = com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest()
		input.setDomainName(this.domainName)
		input.setFIAuthKey(this.fIAuthKey)
		input.setNameservers(this.nameservers)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.updateDomainNameservers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains update-domain-nameservers")
				.argument("domain-name", domainName)
				.argument("fiauth-key", fIAuthKey)
				.argument("nameservers", nameservers.toString())
	}

}


fun AmazonRoute53DomainsFunctions.updateTagsForDomain(domainName: String, init: AmazonRoute53DomainsUpdateTagsForDomainCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsUpdateTagsForDomainCommand(domainName).apply(init))
}

@Generated
class AmazonRoute53DomainsUpdateTagsForDomainCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest> {

	var tagsToUpdate: List<com.amazonaws.services.route53domains.model.Tag>? = null

	override fun build(): com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest {
		val input = com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest()
		input.setDomainName(this.domainName)
		input.setTagsToUpdate(this.tagsToUpdate)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.updateTagsForDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains update-tags-for-domain")
				.argument("domain-name", domainName)
				.argument("tags-to-update", tagsToUpdate?.toString())
	}

}


fun AmazonRoute53DomainsFunctions.viewBilling(init: AmazonRoute53DomainsViewBillingCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DomainsViewBillingCommand().apply(init))
}

@Generated
class AmazonRoute53DomainsViewBillingCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.ViewBillingRequest> {

	var start: java.util.Date? = null
	var end: java.util.Date? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.route53domains.model.ViewBillingRequest {
		val input = com.amazonaws.services.route53domains.model.ViewBillingRequest()
		input.setStart(this.start)
		input.setEnd(this.end)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53domains.viewBilling(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains view-billing")
				.argument("start", start?.toString())
				.argument("end", end?.toString())
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}
