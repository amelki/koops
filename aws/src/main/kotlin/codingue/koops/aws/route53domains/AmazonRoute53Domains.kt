
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.route53domains

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.route53domains.*
import com.amazonaws.services.route53domains.model.*

var codingue.koops.core.Environment.route53domains: AmazonRoute53Domains
	get() {
		var service = this.capabilities["aws-route53domains"]
		if (service == null) {
			service = AmazonRoute53DomainsClientBuilder.standard().build()
			this.capabilities["aws-route53domains"] = service
		}
		return service as AmazonRoute53Domains
	}
	set(route53domains) {
		this.capabilities["aws-route53domains"] = route53domains
	}

@Generated
class AmazonRoute53DomainsFunctions(val block: Block)

infix fun <T> AwsContinuation.route53domains(init: AmazonRoute53DomainsFunctions.() -> T): T {
	return AmazonRoute53DomainsFunctions(shell).run(init)
}

			

fun AmazonRoute53DomainsFunctions.checkDomainAvailability(domainName: String, init: AmazonRoute53DomainsCheckDomainAvailabilityCommand.() -> Unit): com.amazonaws.services.route53domains.model.CheckDomainAvailabilityResult {
	return this.block.declare(AmazonRoute53DomainsCheckDomainAvailabilityCommand(domainName).apply(init)) as com.amazonaws.services.route53domains.model.CheckDomainAvailabilityResult
}

@Generated
class AmazonRoute53DomainsCheckDomainAvailabilityCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest, com.amazonaws.services.route53domains.model.CheckDomainAvailabilityResult> {

	var idnLangCode: String? = null

	override fun build(): com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest {
		val input = com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest()
		input.setDomainName(this.domainName)
		input.setIdnLangCode(this.idnLangCode)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.CheckDomainAvailabilityResult {
	  return com.amazonaws.services.route53domains.model.CheckDomainAvailabilityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.CheckDomainAvailabilityResult {
		return environment.route53domains.checkDomainAvailability(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains check-domain-availability")
				.argument("domain-name", domainName)
				.argument("idn-lang-code", idnLangCode)
	}

}


fun AmazonRoute53DomainsFunctions.checkDomainTransferability(domainName: String, init: AmazonRoute53DomainsCheckDomainTransferabilityCommand.() -> Unit): com.amazonaws.services.route53domains.model.CheckDomainTransferabilityResult {
	return this.block.declare(AmazonRoute53DomainsCheckDomainTransferabilityCommand(domainName).apply(init)) as com.amazonaws.services.route53domains.model.CheckDomainTransferabilityResult
}

@Generated
class AmazonRoute53DomainsCheckDomainTransferabilityCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest, com.amazonaws.services.route53domains.model.CheckDomainTransferabilityResult> {

	var authCode: String? = null

	override fun build(): com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest {
		val input = com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest()
		input.setDomainName(this.domainName)
		input.setAuthCode(this.authCode)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.CheckDomainTransferabilityResult {
	  return com.amazonaws.services.route53domains.model.CheckDomainTransferabilityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.CheckDomainTransferabilityResult {
		return environment.route53domains.checkDomainTransferability(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains check-domain-transferability")
				.argument("domain-name", domainName)
				.argument("auth-code", authCode)
	}

}


fun AmazonRoute53DomainsFunctions.deleteTagsForDomain(domainName: String, tagsToDelete: List<String>, init: AmazonRoute53DomainsDeleteTagsForDomainCommand.() -> Unit): com.amazonaws.services.route53domains.model.DeleteTagsForDomainResult {
	return this.block.declare(AmazonRoute53DomainsDeleteTagsForDomainCommand(domainName, tagsToDelete).apply(init)) as com.amazonaws.services.route53domains.model.DeleteTagsForDomainResult
}

@Generated
class AmazonRoute53DomainsDeleteTagsForDomainCommand(val domainName: String, val tagsToDelete: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest, com.amazonaws.services.route53domains.model.DeleteTagsForDomainResult> {



	override fun build(): com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest {
		val input = com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest()
		input.setDomainName(this.domainName)
		input.setTagsToDelete(this.tagsToDelete)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.DeleteTagsForDomainResult {
	  return com.amazonaws.services.route53domains.model.DeleteTagsForDomainResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.DeleteTagsForDomainResult {
		return environment.route53domains.deleteTagsForDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains delete-tags-for-domain")
				.argument("domain-name", domainName)
				.argument("tags-to-delete", tagsToDelete.toString())
	}

}


fun AmazonRoute53DomainsFunctions.disableDomainAutoRenew(domainName: String, init: AmazonRoute53DomainsDisableDomainAutoRenewCommand.() -> Unit): com.amazonaws.services.route53domains.model.DisableDomainAutoRenewResult {
	return this.block.declare(AmazonRoute53DomainsDisableDomainAutoRenewCommand(domainName).apply(init)) as com.amazonaws.services.route53domains.model.DisableDomainAutoRenewResult
}

@Generated
class AmazonRoute53DomainsDisableDomainAutoRenewCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest, com.amazonaws.services.route53domains.model.DisableDomainAutoRenewResult> {



	override fun build(): com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest {
		val input = com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.DisableDomainAutoRenewResult {
	  return com.amazonaws.services.route53domains.model.DisableDomainAutoRenewResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.DisableDomainAutoRenewResult {
		return environment.route53domains.disableDomainAutoRenew(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains disable-domain-auto-renew")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.disableDomainTransferLock(domainName: String, init: AmazonRoute53DomainsDisableDomainTransferLockCommand.() -> Unit): com.amazonaws.services.route53domains.model.DisableDomainTransferLockResult {
	return this.block.declare(AmazonRoute53DomainsDisableDomainTransferLockCommand(domainName).apply(init)) as com.amazonaws.services.route53domains.model.DisableDomainTransferLockResult
}

@Generated
class AmazonRoute53DomainsDisableDomainTransferLockCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest, com.amazonaws.services.route53domains.model.DisableDomainTransferLockResult> {



	override fun build(): com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest {
		val input = com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.DisableDomainTransferLockResult {
	  return com.amazonaws.services.route53domains.model.DisableDomainTransferLockResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.DisableDomainTransferLockResult {
		return environment.route53domains.disableDomainTransferLock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains disable-domain-transfer-lock")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.enableDomainAutoRenew(domainName: String, init: AmazonRoute53DomainsEnableDomainAutoRenewCommand.() -> Unit): com.amazonaws.services.route53domains.model.EnableDomainAutoRenewResult {
	return this.block.declare(AmazonRoute53DomainsEnableDomainAutoRenewCommand(domainName).apply(init)) as com.amazonaws.services.route53domains.model.EnableDomainAutoRenewResult
}

@Generated
class AmazonRoute53DomainsEnableDomainAutoRenewCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest, com.amazonaws.services.route53domains.model.EnableDomainAutoRenewResult> {



	override fun build(): com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest {
		val input = com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.EnableDomainAutoRenewResult {
	  return com.amazonaws.services.route53domains.model.EnableDomainAutoRenewResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.EnableDomainAutoRenewResult {
		return environment.route53domains.enableDomainAutoRenew(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains enable-domain-auto-renew")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.enableDomainTransferLock(domainName: String, init: AmazonRoute53DomainsEnableDomainTransferLockCommand.() -> Unit): com.amazonaws.services.route53domains.model.EnableDomainTransferLockResult {
	return this.block.declare(AmazonRoute53DomainsEnableDomainTransferLockCommand(domainName).apply(init)) as com.amazonaws.services.route53domains.model.EnableDomainTransferLockResult
}

@Generated
class AmazonRoute53DomainsEnableDomainTransferLockCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest, com.amazonaws.services.route53domains.model.EnableDomainTransferLockResult> {



	override fun build(): com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest {
		val input = com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.EnableDomainTransferLockResult {
	  return com.amazonaws.services.route53domains.model.EnableDomainTransferLockResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.EnableDomainTransferLockResult {
		return environment.route53domains.enableDomainTransferLock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains enable-domain-transfer-lock")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.getContactReachabilityStatus(init: AmazonRoute53DomainsGetContactReachabilityStatusCommand.() -> Unit): com.amazonaws.services.route53domains.model.GetContactReachabilityStatusResult {
	return this.block.declare(AmazonRoute53DomainsGetContactReachabilityStatusCommand().apply(init)) as com.amazonaws.services.route53domains.model.GetContactReachabilityStatusResult
}

@Generated
class AmazonRoute53DomainsGetContactReachabilityStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest, com.amazonaws.services.route53domains.model.GetContactReachabilityStatusResult> {

	var domainName: String? = null

	override fun build(): com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest {
		val input = com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.GetContactReachabilityStatusResult {
	  return com.amazonaws.services.route53domains.model.GetContactReachabilityStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.GetContactReachabilityStatusResult {
		return environment.route53domains.getContactReachabilityStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains get-contact-reachability-status")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.getDomainDetail(domainName: String, init: AmazonRoute53DomainsGetDomainDetailCommand.() -> Unit): com.amazonaws.services.route53domains.model.GetDomainDetailResult {
	return this.block.declare(AmazonRoute53DomainsGetDomainDetailCommand(domainName).apply(init)) as com.amazonaws.services.route53domains.model.GetDomainDetailResult
}

@Generated
class AmazonRoute53DomainsGetDomainDetailCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.GetDomainDetailRequest, com.amazonaws.services.route53domains.model.GetDomainDetailResult> {



	override fun build(): com.amazonaws.services.route53domains.model.GetDomainDetailRequest {
		val input = com.amazonaws.services.route53domains.model.GetDomainDetailRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.GetDomainDetailResult {
	  return com.amazonaws.services.route53domains.model.GetDomainDetailResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.GetDomainDetailResult {
		return environment.route53domains.getDomainDetail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains get-domain-detail")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.getDomainSuggestions(domainName: String, suggestionCount: Int, onlyAvailable: Boolean, init: AmazonRoute53DomainsGetDomainSuggestionsCommand.() -> Unit): com.amazonaws.services.route53domains.model.GetDomainSuggestionsResult {
	return this.block.declare(AmazonRoute53DomainsGetDomainSuggestionsCommand(domainName, suggestionCount, onlyAvailable).apply(init)) as com.amazonaws.services.route53domains.model.GetDomainSuggestionsResult
}

@Generated
class AmazonRoute53DomainsGetDomainSuggestionsCommand(val domainName: String, val suggestionCount: Int, val onlyAvailable: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest, com.amazonaws.services.route53domains.model.GetDomainSuggestionsResult> {



	override fun build(): com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest {
		val input = com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest()
		input.setDomainName(this.domainName)
		input.setSuggestionCount(this.suggestionCount)
		input.setOnlyAvailable(this.onlyAvailable)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.GetDomainSuggestionsResult {
	  return com.amazonaws.services.route53domains.model.GetDomainSuggestionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.GetDomainSuggestionsResult {
		return environment.route53domains.getDomainSuggestions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains get-domain-suggestions")
				.argument("domain-name", domainName)
				.argument("suggestion-count", suggestionCount.toString())
				.option("only-available", onlyAvailable ?: false)
	}

}


fun AmazonRoute53DomainsFunctions.getOperationDetail(operationId: String, init: AmazonRoute53DomainsGetOperationDetailCommand.() -> Unit): com.amazonaws.services.route53domains.model.GetOperationDetailResult {
	return this.block.declare(AmazonRoute53DomainsGetOperationDetailCommand(operationId).apply(init)) as com.amazonaws.services.route53domains.model.GetOperationDetailResult
}

@Generated
class AmazonRoute53DomainsGetOperationDetailCommand(val operationId: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.GetOperationDetailRequest, com.amazonaws.services.route53domains.model.GetOperationDetailResult> {



	override fun build(): com.amazonaws.services.route53domains.model.GetOperationDetailRequest {
		val input = com.amazonaws.services.route53domains.model.GetOperationDetailRequest()
		input.setOperationId(this.operationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.GetOperationDetailResult {
	  return com.amazonaws.services.route53domains.model.GetOperationDetailResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.GetOperationDetailResult {
		return environment.route53domains.getOperationDetail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains get-operation-detail")
				.argument("operation-id", operationId)
	}

}


fun AmazonRoute53DomainsFunctions.listDomains(init: AmazonRoute53DomainsListDomainsCommand.() -> Unit): com.amazonaws.services.route53domains.model.ListDomainsResult {
	return this.block.declare(AmazonRoute53DomainsListDomainsCommand().apply(init)) as com.amazonaws.services.route53domains.model.ListDomainsResult
}

@Generated
class AmazonRoute53DomainsListDomainsCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.ListDomainsRequest, com.amazonaws.services.route53domains.model.ListDomainsResult> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.route53domains.model.ListDomainsRequest {
		val input = com.amazonaws.services.route53domains.model.ListDomainsRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.ListDomainsResult {
	  return com.amazonaws.services.route53domains.model.ListDomainsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.ListDomainsResult {
		return environment.route53domains.listDomains(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains list-domains")
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonRoute53DomainsFunctions.listOperations(init: AmazonRoute53DomainsListOperationsCommand.() -> Unit): com.amazonaws.services.route53domains.model.ListOperationsResult {
	return this.block.declare(AmazonRoute53DomainsListOperationsCommand().apply(init)) as com.amazonaws.services.route53domains.model.ListOperationsResult
}

@Generated
class AmazonRoute53DomainsListOperationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.ListOperationsRequest, com.amazonaws.services.route53domains.model.ListOperationsResult> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.route53domains.model.ListOperationsRequest {
		val input = com.amazonaws.services.route53domains.model.ListOperationsRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.ListOperationsResult {
	  return com.amazonaws.services.route53domains.model.ListOperationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.ListOperationsResult {
		return environment.route53domains.listOperations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains list-operations")
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonRoute53DomainsFunctions.listTagsForDomain(domainName: String, init: AmazonRoute53DomainsListTagsForDomainCommand.() -> Unit): com.amazonaws.services.route53domains.model.ListTagsForDomainResult {
	return this.block.declare(AmazonRoute53DomainsListTagsForDomainCommand(domainName).apply(init)) as com.amazonaws.services.route53domains.model.ListTagsForDomainResult
}

@Generated
class AmazonRoute53DomainsListTagsForDomainCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.ListTagsForDomainRequest, com.amazonaws.services.route53domains.model.ListTagsForDomainResult> {



	override fun build(): com.amazonaws.services.route53domains.model.ListTagsForDomainRequest {
		val input = com.amazonaws.services.route53domains.model.ListTagsForDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.ListTagsForDomainResult {
	  return com.amazonaws.services.route53domains.model.ListTagsForDomainResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.ListTagsForDomainResult {
		return environment.route53domains.listTagsForDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains list-tags-for-domain")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.registerDomain(domainName: String, durationInYears: Int, adminContact: com.amazonaws.services.route53domains.model.ContactDetail, registrantContact: com.amazonaws.services.route53domains.model.ContactDetail, techContact: com.amazonaws.services.route53domains.model.ContactDetail, init: AmazonRoute53DomainsRegisterDomainCommand.() -> Unit): com.amazonaws.services.route53domains.model.RegisterDomainResult {
	return this.block.declare(AmazonRoute53DomainsRegisterDomainCommand(domainName, durationInYears, adminContact, registrantContact, techContact).apply(init)) as com.amazonaws.services.route53domains.model.RegisterDomainResult
}

@Generated
class AmazonRoute53DomainsRegisterDomainCommand(val domainName: String, val durationInYears: Int, val adminContact: com.amazonaws.services.route53domains.model.ContactDetail, val registrantContact: com.amazonaws.services.route53domains.model.ContactDetail, val techContact: com.amazonaws.services.route53domains.model.ContactDetail) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.RegisterDomainRequest, com.amazonaws.services.route53domains.model.RegisterDomainResult> {

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

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.RegisterDomainResult {
	  return com.amazonaws.services.route53domains.model.RegisterDomainResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.RegisterDomainResult {
		return environment.route53domains.registerDomain(build())
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


fun AmazonRoute53DomainsFunctions.renewDomain(domainName: String, currentExpiryYear: Int, init: AmazonRoute53DomainsRenewDomainCommand.() -> Unit): com.amazonaws.services.route53domains.model.RenewDomainResult {
	return this.block.declare(AmazonRoute53DomainsRenewDomainCommand(domainName, currentExpiryYear).apply(init)) as com.amazonaws.services.route53domains.model.RenewDomainResult
}

@Generated
class AmazonRoute53DomainsRenewDomainCommand(val domainName: String, val currentExpiryYear: Int) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.RenewDomainRequest, com.amazonaws.services.route53domains.model.RenewDomainResult> {

	var durationInYears: Int? = 0

	override fun build(): com.amazonaws.services.route53domains.model.RenewDomainRequest {
		val input = com.amazonaws.services.route53domains.model.RenewDomainRequest()
		input.setDomainName(this.domainName)
		input.setDurationInYears(this.durationInYears)
		input.setCurrentExpiryYear(this.currentExpiryYear)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.RenewDomainResult {
	  return com.amazonaws.services.route53domains.model.RenewDomainResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.RenewDomainResult {
		return environment.route53domains.renewDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains renew-domain")
				.argument("domain-name", domainName)
				.argument("duration-in-years", durationInYears?.toString())
				.argument("current-expiry-year", currentExpiryYear.toString())
	}

}


fun AmazonRoute53DomainsFunctions.resendContactReachabilityEmail(init: AmazonRoute53DomainsResendContactReachabilityEmailCommand.() -> Unit): com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailResult {
	return this.block.declare(AmazonRoute53DomainsResendContactReachabilityEmailCommand().apply(init)) as com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailResult
}

@Generated
class AmazonRoute53DomainsResendContactReachabilityEmailCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest, com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailResult> {

	var domainName: String? = null

	override fun build(): com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest {
		val input = com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailResult {
	  return com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailResult {
		return environment.route53domains.resendContactReachabilityEmail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains resend-contact-reachability-email")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.retrieveDomainAuthCode(domainName: String, init: AmazonRoute53DomainsRetrieveDomainAuthCodeCommand.() -> Unit): com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeResult {
	return this.block.declare(AmazonRoute53DomainsRetrieveDomainAuthCodeCommand(domainName).apply(init)) as com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeResult
}

@Generated
class AmazonRoute53DomainsRetrieveDomainAuthCodeCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest, com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeResult> {



	override fun build(): com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest {
		val input = com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeResult {
	  return com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeResult {
		return environment.route53domains.retrieveDomainAuthCode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains retrieve-domain-auth-code")
				.argument("domain-name", domainName)
	}

}


fun AmazonRoute53DomainsFunctions.transferDomain(domainName: String, durationInYears: Int, adminContact: com.amazonaws.services.route53domains.model.ContactDetail, registrantContact: com.amazonaws.services.route53domains.model.ContactDetail, techContact: com.amazonaws.services.route53domains.model.ContactDetail, init: AmazonRoute53DomainsTransferDomainCommand.() -> Unit): com.amazonaws.services.route53domains.model.TransferDomainResult {
	return this.block.declare(AmazonRoute53DomainsTransferDomainCommand(domainName, durationInYears, adminContact, registrantContact, techContact).apply(init)) as com.amazonaws.services.route53domains.model.TransferDomainResult
}

@Generated
class AmazonRoute53DomainsTransferDomainCommand(val domainName: String, val durationInYears: Int, val adminContact: com.amazonaws.services.route53domains.model.ContactDetail, val registrantContact: com.amazonaws.services.route53domains.model.ContactDetail, val techContact: com.amazonaws.services.route53domains.model.ContactDetail) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.TransferDomainRequest, com.amazonaws.services.route53domains.model.TransferDomainResult> {

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

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.TransferDomainResult {
	  return com.amazonaws.services.route53domains.model.TransferDomainResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.TransferDomainResult {
		return environment.route53domains.transferDomain(build())
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


fun AmazonRoute53DomainsFunctions.updateDomainContact(domainName: String, init: AmazonRoute53DomainsUpdateDomainContactCommand.() -> Unit): com.amazonaws.services.route53domains.model.UpdateDomainContactResult {
	return this.block.declare(AmazonRoute53DomainsUpdateDomainContactCommand(domainName).apply(init)) as com.amazonaws.services.route53domains.model.UpdateDomainContactResult
}

@Generated
class AmazonRoute53DomainsUpdateDomainContactCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.UpdateDomainContactRequest, com.amazonaws.services.route53domains.model.UpdateDomainContactResult> {

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

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.UpdateDomainContactResult {
	  return com.amazonaws.services.route53domains.model.UpdateDomainContactResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.UpdateDomainContactResult {
		return environment.route53domains.updateDomainContact(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains update-domain-contact")
				.argument("domain-name", domainName)
				.argument("admin-contact", adminContact?.toString())
				.argument("registrant-contact", registrantContact?.toString())
				.argument("tech-contact", techContact?.toString())
	}

}


fun AmazonRoute53DomainsFunctions.updateDomainContactPrivacy(domainName: String, init: AmazonRoute53DomainsUpdateDomainContactPrivacyCommand.() -> Unit): com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyResult {
	return this.block.declare(AmazonRoute53DomainsUpdateDomainContactPrivacyCommand(domainName).apply(init)) as com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyResult
}

@Generated
class AmazonRoute53DomainsUpdateDomainContactPrivacyCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyRequest, com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyResult> {

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

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyResult {
	  return com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyResult {
		return environment.route53domains.updateDomainContactPrivacy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains update-domain-contact-privacy")
				.argument("domain-name", domainName)
				.option("admin-privacy", adminPrivacy ?: false)
				.option("registrant-privacy", registrantPrivacy ?: false)
				.option("tech-privacy", techPrivacy ?: false)
	}

}


fun AmazonRoute53DomainsFunctions.updateDomainNameservers(domainName: String, nameservers: List<com.amazonaws.services.route53domains.model.Nameserver>, init: AmazonRoute53DomainsUpdateDomainNameserversCommand.() -> Unit): com.amazonaws.services.route53domains.model.UpdateDomainNameserversResult {
	return this.block.declare(AmazonRoute53DomainsUpdateDomainNameserversCommand(domainName, nameservers).apply(init)) as com.amazonaws.services.route53domains.model.UpdateDomainNameserversResult
}

@Generated
class AmazonRoute53DomainsUpdateDomainNameserversCommand(val domainName: String, val nameservers: List<com.amazonaws.services.route53domains.model.Nameserver>) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest, com.amazonaws.services.route53domains.model.UpdateDomainNameserversResult> {

	var fIAuthKey: String? = null

	override fun build(): com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest {
		val input = com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest()
		input.setDomainName(this.domainName)
		input.setFIAuthKey(this.fIAuthKey)
		input.setNameservers(this.nameservers)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.UpdateDomainNameserversResult {
	  return com.amazonaws.services.route53domains.model.UpdateDomainNameserversResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.UpdateDomainNameserversResult {
		return environment.route53domains.updateDomainNameservers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains update-domain-nameservers")
				.argument("domain-name", domainName)
				.argument("fiauth-key", fIAuthKey)
				.argument("nameservers", nameservers.toString())
	}

}


fun AmazonRoute53DomainsFunctions.updateTagsForDomain(domainName: String, init: AmazonRoute53DomainsUpdateTagsForDomainCommand.() -> Unit): com.amazonaws.services.route53domains.model.UpdateTagsForDomainResult {
	return this.block.declare(AmazonRoute53DomainsUpdateTagsForDomainCommand(domainName).apply(init)) as com.amazonaws.services.route53domains.model.UpdateTagsForDomainResult
}

@Generated
class AmazonRoute53DomainsUpdateTagsForDomainCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest, com.amazonaws.services.route53domains.model.UpdateTagsForDomainResult> {

	var tagsToUpdate: List<com.amazonaws.services.route53domains.model.Tag>? = null

	override fun build(): com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest {
		val input = com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest()
		input.setDomainName(this.domainName)
		input.setTagsToUpdate(this.tagsToUpdate)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.UpdateTagsForDomainResult {
	  return com.amazonaws.services.route53domains.model.UpdateTagsForDomainResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.UpdateTagsForDomainResult {
		return environment.route53domains.updateTagsForDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains update-tags-for-domain")
				.argument("domain-name", domainName)
				.argument("tags-to-update", tagsToUpdate?.toString())
	}

}


fun AmazonRoute53DomainsFunctions.viewBilling(init: AmazonRoute53DomainsViewBillingCommand.() -> Unit): com.amazonaws.services.route53domains.model.ViewBillingResult {
	return this.block.declare(AmazonRoute53DomainsViewBillingCommand().apply(init)) as com.amazonaws.services.route53domains.model.ViewBillingResult
}

@Generated
class AmazonRoute53DomainsViewBillingCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53domains.model.ViewBillingRequest, com.amazonaws.services.route53domains.model.ViewBillingResult> {

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

	
	override fun dryResult(): com.amazonaws.services.route53domains.model.ViewBillingResult {
	  return com.amazonaws.services.route53domains.model.ViewBillingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.route53domains.model.ViewBillingResult {
		return environment.route53domains.viewBilling(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53domains view-billing")
				.argument("start", start?.toString())
				.argument("end", end?.toString())
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}
