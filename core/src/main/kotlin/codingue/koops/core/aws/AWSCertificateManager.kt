
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.certificatemanager.AWSCertificateManager
import com.amazonaws.services.certificatemanager.model.*

var codingue.koops.core.Environment.acm: AWSCertificateManager
	get() = this.capabilities[AWSCertificateManager::class.java.name] as AWSCertificateManager
	set(acm) {
		this.capabilities[AWSCertificateManager::class.java.name] = acm
	}

@Generated
class AWSCertificateManagerFunctions(val block: Block)

infix fun AwsContinuation.acm(init: AWSCertificateManagerFunctions.() -> Unit) {
	AWSCertificateManagerFunctions(shell).apply(init)
}

			

fun AWSCertificateManagerFunctions.addTagsToCertificate(certificateArn: String, tags: List<com.amazonaws.services.certificatemanager.model.Tag>, init: AWSCertificateManagerAddTagsToCertificateCommand.() -> Unit) {
	this.block.declare(AWSCertificateManagerAddTagsToCertificateCommand(certificateArn, tags).apply(init))
}

@Generated
class AWSCertificateManagerAddTagsToCertificateCommand(val certificateArn: String, val tags: List<com.amazonaws.services.certificatemanager.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.certificatemanager.model.AddTagsToCertificateRequest> {



	override fun build(): com.amazonaws.services.certificatemanager.model.AddTagsToCertificateRequest {
		val input = com.amazonaws.services.certificatemanager.model.AddTagsToCertificateRequest()
		input.setCertificateArn(this.certificateArn)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm.addTagsToCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm add-tags-to-certificate")
				.argument("certificate-arn", certificateArn)
				.argument("tags", tags.toString())
	}

}


fun AWSCertificateManagerFunctions.deleteCertificate(certificateArn: String, init: AWSCertificateManagerDeleteCertificateCommand.() -> Unit) {
	this.block.declare(AWSCertificateManagerDeleteCertificateCommand(certificateArn).apply(init))
}

@Generated
class AWSCertificateManagerDeleteCertificateCommand(val certificateArn: String) : AmazonWebServiceCommand<com.amazonaws.services.certificatemanager.model.DeleteCertificateRequest> {



	override fun build(): com.amazonaws.services.certificatemanager.model.DeleteCertificateRequest {
		val input = com.amazonaws.services.certificatemanager.model.DeleteCertificateRequest()
		input.setCertificateArn(this.certificateArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm.deleteCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm delete-certificate")
				.argument("certificate-arn", certificateArn)
	}

}


fun AWSCertificateManagerFunctions.describeCertificate(certificateArn: String, init: AWSCertificateManagerDescribeCertificateCommand.() -> Unit) {
	this.block.declare(AWSCertificateManagerDescribeCertificateCommand(certificateArn).apply(init))
}

@Generated
class AWSCertificateManagerDescribeCertificateCommand(val certificateArn: String) : AmazonWebServiceCommand<com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest> {



	override fun build(): com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest {
		val input = com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest()
		input.setCertificateArn(this.certificateArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm.describeCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm describe-certificate")
				.argument("certificate-arn", certificateArn)
	}

}


fun AWSCertificateManagerFunctions.exportCertificate(certificateArn: String, passphrase: java.nio.ByteBuffer, init: AWSCertificateManagerExportCertificateCommand.() -> Unit) {
	this.block.declare(AWSCertificateManagerExportCertificateCommand(certificateArn, passphrase).apply(init))
}

@Generated
class AWSCertificateManagerExportCertificateCommand(val certificateArn: String, val passphrase: java.nio.ByteBuffer) : AmazonWebServiceCommand<com.amazonaws.services.certificatemanager.model.ExportCertificateRequest> {



	override fun build(): com.amazonaws.services.certificatemanager.model.ExportCertificateRequest {
		val input = com.amazonaws.services.certificatemanager.model.ExportCertificateRequest()
		input.setCertificateArn(this.certificateArn)
		input.setPassphrase(this.passphrase)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm.exportCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm export-certificate")
				.argument("certificate-arn", certificateArn)
				.argument("passphrase", passphrase.toString())
	}

}


fun AWSCertificateManagerFunctions.getCertificate(certificateArn: String, init: AWSCertificateManagerGetCertificateCommand.() -> Unit) {
	this.block.declare(AWSCertificateManagerGetCertificateCommand(certificateArn).apply(init))
}

@Generated
class AWSCertificateManagerGetCertificateCommand(val certificateArn: String) : AmazonWebServiceCommand<com.amazonaws.services.certificatemanager.model.GetCertificateRequest> {



	override fun build(): com.amazonaws.services.certificatemanager.model.GetCertificateRequest {
		val input = com.amazonaws.services.certificatemanager.model.GetCertificateRequest()
		input.setCertificateArn(this.certificateArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm.getCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm get-certificate")
				.argument("certificate-arn", certificateArn)
	}

}


fun AWSCertificateManagerFunctions.importCertificate(certificate: java.nio.ByteBuffer, privateKey: java.nio.ByteBuffer, init: AWSCertificateManagerImportCertificateCommand.() -> Unit) {
	this.block.declare(AWSCertificateManagerImportCertificateCommand(certificate, privateKey).apply(init))
}

@Generated
class AWSCertificateManagerImportCertificateCommand(val certificate: java.nio.ByteBuffer, val privateKey: java.nio.ByteBuffer) : AmazonWebServiceCommand<com.amazonaws.services.certificatemanager.model.ImportCertificateRequest> {

	var certificateArn: String? = null
	var certificateChain: java.nio.ByteBuffer? = null

	override fun build(): com.amazonaws.services.certificatemanager.model.ImportCertificateRequest {
		val input = com.amazonaws.services.certificatemanager.model.ImportCertificateRequest()
		input.setCertificateArn(this.certificateArn)
		input.setCertificate(this.certificate)
		input.setPrivateKey(this.privateKey)
		input.setCertificateChain(this.certificateChain)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm.importCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm import-certificate")
				.argument("certificate-arn", certificateArn)
				.argument("certificate", certificate.toString())
				.argument("private-key", privateKey.toString())
				.argument("certificate-chain", certificateChain?.toString())
	}

}


fun AWSCertificateManagerFunctions.listCertificates(init: AWSCertificateManagerListCertificatesCommand.() -> Unit) {
	this.block.declare(AWSCertificateManagerListCertificatesCommand().apply(init))
}

@Generated
class AWSCertificateManagerListCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.certificatemanager.model.ListCertificatesRequest> {

	var certificateStatuses: List<CertificateStatus>? = null
	var includes: com.amazonaws.services.certificatemanager.model.Filters? = null
	var nextToken: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.certificatemanager.model.ListCertificatesRequest {
		val input = com.amazonaws.services.certificatemanager.model.ListCertificatesRequest()
		input.setCertificateStatuses(this.certificateStatuses?.map { it.toString() })
		input.setIncludes(this.includes)
		input.setNextToken(this.nextToken)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm.listCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm list-certificates")
				.argument("certificate-statuses", certificateStatuses?.toString())
				.argument("includes", includes?.toString())
				.argument("next-token", nextToken)
				.argument("max-items", maxItems?.toString())
	}

}


fun AWSCertificateManagerFunctions.listTagsForCertificate(certificateArn: String, init: AWSCertificateManagerListTagsForCertificateCommand.() -> Unit) {
	this.block.declare(AWSCertificateManagerListTagsForCertificateCommand(certificateArn).apply(init))
}

@Generated
class AWSCertificateManagerListTagsForCertificateCommand(val certificateArn: String) : AmazonWebServiceCommand<com.amazonaws.services.certificatemanager.model.ListTagsForCertificateRequest> {



	override fun build(): com.amazonaws.services.certificatemanager.model.ListTagsForCertificateRequest {
		val input = com.amazonaws.services.certificatemanager.model.ListTagsForCertificateRequest()
		input.setCertificateArn(this.certificateArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm.listTagsForCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm list-tags-for-certificate")
				.argument("certificate-arn", certificateArn)
	}

}


fun AWSCertificateManagerFunctions.removeTagsFromCertificate(certificateArn: String, tags: List<com.amazonaws.services.certificatemanager.model.Tag>, init: AWSCertificateManagerRemoveTagsFromCertificateCommand.() -> Unit) {
	this.block.declare(AWSCertificateManagerRemoveTagsFromCertificateCommand(certificateArn, tags).apply(init))
}

@Generated
class AWSCertificateManagerRemoveTagsFromCertificateCommand(val certificateArn: String, val tags: List<com.amazonaws.services.certificatemanager.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateRequest> {



	override fun build(): com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateRequest {
		val input = com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateRequest()
		input.setCertificateArn(this.certificateArn)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm.removeTagsFromCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm remove-tags-from-certificate")
				.argument("certificate-arn", certificateArn)
				.argument("tags", tags.toString())
	}

}


fun AWSCertificateManagerFunctions.requestCertificate(domainName: String, init: AWSCertificateManagerRequestCertificateCommand.() -> Unit) {
	this.block.declare(AWSCertificateManagerRequestCertificateCommand(domainName).apply(init))
}

@Generated
class AWSCertificateManagerRequestCertificateCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.certificatemanager.model.RequestCertificateRequest> {

	var validationMethod: ValidationMethod? = null
	var subjectAlternativeNames: List<String>? = null
	var idempotencyToken: String? = null
	var domainValidationOptions: List<com.amazonaws.services.certificatemanager.model.DomainValidationOption>? = null
	var options: com.amazonaws.services.certificatemanager.model.CertificateOptions? = null
	var certificateAuthorityArn: String? = null

	override fun build(): com.amazonaws.services.certificatemanager.model.RequestCertificateRequest {
		val input = com.amazonaws.services.certificatemanager.model.RequestCertificateRequest()
		input.setDomainName(this.domainName)
		input.setValidationMethod(this.validationMethod?.toString())
		input.setSubjectAlternativeNames(this.subjectAlternativeNames)
		input.setIdempotencyToken(this.idempotencyToken)
		input.setDomainValidationOptions(this.domainValidationOptions)
		input.setOptions(this.options)
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm.requestCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm request-certificate")
				.argument("domain-name", domainName)
				.argument("validation-method", validationMethod?.toString())
				.argument("subject-alternative-names", subjectAlternativeNames?.toString())
				.argument("idempotency-token", idempotencyToken)
				.argument("domain-validation-options", domainValidationOptions?.toString())
				.argument("options", options?.toString())
				.argument("certificate-authority-arn", certificateAuthorityArn)
	}

}


fun AWSCertificateManagerFunctions.resendValidationEmail(certificateArn: String, domain: String, validationDomain: String, init: AWSCertificateManagerResendValidationEmailCommand.() -> Unit) {
	this.block.declare(AWSCertificateManagerResendValidationEmailCommand(certificateArn, domain, validationDomain).apply(init))
}

@Generated
class AWSCertificateManagerResendValidationEmailCommand(val certificateArn: String, val domain: String, val validationDomain: String) : AmazonWebServiceCommand<com.amazonaws.services.certificatemanager.model.ResendValidationEmailRequest> {



	override fun build(): com.amazonaws.services.certificatemanager.model.ResendValidationEmailRequest {
		val input = com.amazonaws.services.certificatemanager.model.ResendValidationEmailRequest()
		input.setCertificateArn(this.certificateArn)
		input.setDomain(this.domain)
		input.setValidationDomain(this.validationDomain)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm.resendValidationEmail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm resend-validation-email")
				.argument("certificate-arn", certificateArn)
				.argument("domain", domain)
				.argument("validation-domain", validationDomain)
	}

}


fun AWSCertificateManagerFunctions.updateCertificateOptions(certificateArn: String, options: com.amazonaws.services.certificatemanager.model.CertificateOptions, init: AWSCertificateManagerUpdateCertificateOptionsCommand.() -> Unit) {
	this.block.declare(AWSCertificateManagerUpdateCertificateOptionsCommand(certificateArn, options).apply(init))
}

@Generated
class AWSCertificateManagerUpdateCertificateOptionsCommand(val certificateArn: String, val options: com.amazonaws.services.certificatemanager.model.CertificateOptions) : AmazonWebServiceCommand<com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsRequest> {



	override fun build(): com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsRequest {
		val input = com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsRequest()
		input.setCertificateArn(this.certificateArn)
		input.setOptions(this.options)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm.updateCertificateOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm update-certificate-options")
				.argument("certificate-arn", certificateArn)
				.argument("options", options.toString())
	}

}
