
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.acmpca.AWSACMPCA
import com.amazonaws.services.acmpca.model.*

var codingue.koops.core.Environment.acm_pca: AWSACMPCA
	get() = this.capabilities[AWSACMPCA::class.java.name] as AWSACMPCA
	set(acm_pca) {
		this.capabilities[AWSACMPCA::class.java.name] = acm_pca
	}

@Generated
class AWSACMPCAFunctions(val block: Block)

infix fun AwsContinuation.acm_pca(init: AWSACMPCAFunctions.() -> Unit) {
	AWSACMPCAFunctions(shell).apply(init)
}

			

fun AWSACMPCAFunctions.createCertificateAuthority(certificateAuthorityConfiguration: com.amazonaws.services.acmpca.model.CertificateAuthorityConfiguration, certificateAuthorityType: CertificateAuthorityType, init: AWSACMPCACreateCertificateAuthorityCommand.() -> Unit) {
	this.block.declare(AWSACMPCACreateCertificateAuthorityCommand(certificateAuthorityConfiguration, certificateAuthorityType).apply(init))
}

@Generated
class AWSACMPCACreateCertificateAuthorityCommand(val certificateAuthorityConfiguration: com.amazonaws.services.acmpca.model.CertificateAuthorityConfiguration, val certificateAuthorityType: CertificateAuthorityType) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.CreateCertificateAuthorityRequest> {

	var revocationConfiguration: com.amazonaws.services.acmpca.model.RevocationConfiguration? = null
	var idempotencyToken: String? = null

	override fun build(): com.amazonaws.services.acmpca.model.CreateCertificateAuthorityRequest {
		val input = com.amazonaws.services.acmpca.model.CreateCertificateAuthorityRequest()
		input.setCertificateAuthorityConfiguration(this.certificateAuthorityConfiguration)
		input.setRevocationConfiguration(this.revocationConfiguration)
		input.setCertificateAuthorityType(this.certificateAuthorityType.toString())
		input.setIdempotencyToken(this.idempotencyToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm_pca.createCertificateAuthority(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca create-certificate-authority")
				.argument("certificate-authority-configuration", certificateAuthorityConfiguration.toString())
				.argument("revocation-configuration", revocationConfiguration?.toString())
				.argument("certificate-authority-type", certificateAuthorityType.toString())
				.argument("idempotency-token", idempotencyToken)
	}

}


fun AWSACMPCAFunctions.createCertificateAuthorityAuditReport(certificateAuthorityArn: String, s3BucketName: String, auditReportResponseFormat: AuditReportResponseFormat, init: AWSACMPCACreateCertificateAuthorityAuditReportCommand.() -> Unit) {
	this.block.declare(AWSACMPCACreateCertificateAuthorityAuditReportCommand(certificateAuthorityArn, s3BucketName, auditReportResponseFormat).apply(init))
}

@Generated
class AWSACMPCACreateCertificateAuthorityAuditReportCommand(val certificateAuthorityArn: String, val s3BucketName: String, val auditReportResponseFormat: AuditReportResponseFormat) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportRequest> {



	override fun build(): com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportRequest {
		val input = com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setS3BucketName(this.s3BucketName)
		input.setAuditReportResponseFormat(this.auditReportResponseFormat.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm_pca.createCertificateAuthorityAuditReport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca create-certificate-authority-audit-report")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("s3-bucket-name", s3BucketName)
				.argument("audit-report-response-format", auditReportResponseFormat.toString())
	}

}


fun AWSACMPCAFunctions.deleteCertificateAuthority(certificateAuthorityArn: String, init: AWSACMPCADeleteCertificateAuthorityCommand.() -> Unit) {
	this.block.declare(AWSACMPCADeleteCertificateAuthorityCommand(certificateAuthorityArn).apply(init))
}

@Generated
class AWSACMPCADeleteCertificateAuthorityCommand(val certificateAuthorityArn: String) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityRequest> {



	override fun build(): com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityRequest {
		val input = com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm_pca.deleteCertificateAuthority(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca delete-certificate-authority")
				.argument("certificate-authority-arn", certificateAuthorityArn)
	}

}


fun AWSACMPCAFunctions.describeCertificateAuthority(certificateAuthorityArn: String, init: AWSACMPCADescribeCertificateAuthorityCommand.() -> Unit) {
	this.block.declare(AWSACMPCADescribeCertificateAuthorityCommand(certificateAuthorityArn).apply(init))
}

@Generated
class AWSACMPCADescribeCertificateAuthorityCommand(val certificateAuthorityArn: String) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityRequest> {



	override fun build(): com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityRequest {
		val input = com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm_pca.describeCertificateAuthority(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca describe-certificate-authority")
				.argument("certificate-authority-arn", certificateAuthorityArn)
	}

}


fun AWSACMPCAFunctions.describeCertificateAuthorityAuditReport(certificateAuthorityArn: String, auditReportId: String, init: AWSACMPCADescribeCertificateAuthorityAuditReportCommand.() -> Unit) {
	this.block.declare(AWSACMPCADescribeCertificateAuthorityAuditReportCommand(certificateAuthorityArn, auditReportId).apply(init))
}

@Generated
class AWSACMPCADescribeCertificateAuthorityAuditReportCommand(val certificateAuthorityArn: String, val auditReportId: String) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportRequest> {



	override fun build(): com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportRequest {
		val input = com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setAuditReportId(this.auditReportId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm_pca.describeCertificateAuthorityAuditReport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca describe-certificate-authority-audit-report")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("audit-report-id", auditReportId)
	}

}


fun AWSACMPCAFunctions.getCertificate(certificateAuthorityArn: String, certificateArn: String, init: AWSACMPCAGetCertificateCommand.() -> Unit) {
	this.block.declare(AWSACMPCAGetCertificateCommand(certificateAuthorityArn, certificateArn).apply(init))
}

@Generated
class AWSACMPCAGetCertificateCommand(val certificateAuthorityArn: String, val certificateArn: String) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.GetCertificateRequest> {



	override fun build(): com.amazonaws.services.acmpca.model.GetCertificateRequest {
		val input = com.amazonaws.services.acmpca.model.GetCertificateRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setCertificateArn(this.certificateArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm_pca.getCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca get-certificate")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("certificate-arn", certificateArn)
	}

}


fun AWSACMPCAFunctions.getCertificateAuthorityCertificate(certificateAuthorityArn: String, init: AWSACMPCAGetCertificateAuthorityCertificateCommand.() -> Unit) {
	this.block.declare(AWSACMPCAGetCertificateAuthorityCertificateCommand(certificateAuthorityArn).apply(init))
}

@Generated
class AWSACMPCAGetCertificateAuthorityCertificateCommand(val certificateAuthorityArn: String) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateRequest> {



	override fun build(): com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateRequest {
		val input = com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm_pca.getCertificateAuthorityCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca get-certificate-authority-certificate")
				.argument("certificate-authority-arn", certificateAuthorityArn)
	}

}


fun AWSACMPCAFunctions.getCertificateAuthorityCsr(certificateAuthorityArn: String, init: AWSACMPCAGetCertificateAuthorityCsrCommand.() -> Unit) {
	this.block.declare(AWSACMPCAGetCertificateAuthorityCsrCommand(certificateAuthorityArn).apply(init))
}

@Generated
class AWSACMPCAGetCertificateAuthorityCsrCommand(val certificateAuthorityArn: String) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrRequest> {



	override fun build(): com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrRequest {
		val input = com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm_pca.getCertificateAuthorityCsr(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca get-certificate-authority-csr")
				.argument("certificate-authority-arn", certificateAuthorityArn)
	}

}


fun AWSACMPCAFunctions.importCertificateAuthorityCertificate(certificateAuthorityArn: String, certificate: java.nio.ByteBuffer, certificateChain: java.nio.ByteBuffer, init: AWSACMPCAImportCertificateAuthorityCertificateCommand.() -> Unit) {
	this.block.declare(AWSACMPCAImportCertificateAuthorityCertificateCommand(certificateAuthorityArn, certificate, certificateChain).apply(init))
}

@Generated
class AWSACMPCAImportCertificateAuthorityCertificateCommand(val certificateAuthorityArn: String, val certificate: java.nio.ByteBuffer, val certificateChain: java.nio.ByteBuffer) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateRequest> {



	override fun build(): com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateRequest {
		val input = com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setCertificate(this.certificate)
		input.setCertificateChain(this.certificateChain)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm_pca.importCertificateAuthorityCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca import-certificate-authority-certificate")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("certificate", certificate.toString())
				.argument("certificate-chain", certificateChain.toString())
	}

}


fun AWSACMPCAFunctions.issueCertificate(certificateAuthorityArn: String, csr: java.nio.ByteBuffer, signingAlgorithm: SigningAlgorithm, validity: com.amazonaws.services.acmpca.model.Validity, init: AWSACMPCAIssueCertificateCommand.() -> Unit) {
	this.block.declare(AWSACMPCAIssueCertificateCommand(certificateAuthorityArn, csr, signingAlgorithm, validity).apply(init))
}

@Generated
class AWSACMPCAIssueCertificateCommand(val certificateAuthorityArn: String, val csr: java.nio.ByteBuffer, val signingAlgorithm: SigningAlgorithm, val validity: com.amazonaws.services.acmpca.model.Validity) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.IssueCertificateRequest> {

	var idempotencyToken: String? = null

	override fun build(): com.amazonaws.services.acmpca.model.IssueCertificateRequest {
		val input = com.amazonaws.services.acmpca.model.IssueCertificateRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setCsr(this.csr)
		input.setSigningAlgorithm(this.signingAlgorithm.toString())
		input.setValidity(this.validity)
		input.setIdempotencyToken(this.idempotencyToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm_pca.issueCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca issue-certificate")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("csr", csr.toString())
				.argument("signing-algorithm", signingAlgorithm.toString())
				.argument("validity", validity.toString())
				.argument("idempotency-token", idempotencyToken)
	}

}


fun AWSACMPCAFunctions.listCertificateAuthorities(init: AWSACMPCAListCertificateAuthoritiesCommand.() -> Unit) {
	this.block.declare(AWSACMPCAListCertificateAuthoritiesCommand().apply(init))
}

@Generated
class AWSACMPCAListCertificateAuthoritiesCommand() : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesRequest {
		val input = com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm_pca.listCertificateAuthorities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca list-certificate-authorities")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSACMPCAFunctions.listTags(certificateAuthorityArn: String, init: AWSACMPCAListTagsCommand.() -> Unit) {
	this.block.declare(AWSACMPCAListTagsCommand(certificateAuthorityArn).apply(init))
}

@Generated
class AWSACMPCAListTagsCommand(val certificateAuthorityArn: String) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.ListTagsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.acmpca.model.ListTagsRequest {
		val input = com.amazonaws.services.acmpca.model.ListTagsRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm_pca.listTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca list-tags")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSACMPCAFunctions.revokeCertificate(certificateAuthorityArn: String, certificateSerial: String, revocationReason: RevocationReason, init: AWSACMPCARevokeCertificateCommand.() -> Unit) {
	this.block.declare(AWSACMPCARevokeCertificateCommand(certificateAuthorityArn, certificateSerial, revocationReason).apply(init))
}

@Generated
class AWSACMPCARevokeCertificateCommand(val certificateAuthorityArn: String, val certificateSerial: String, val revocationReason: RevocationReason) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.RevokeCertificateRequest> {



	override fun build(): com.amazonaws.services.acmpca.model.RevokeCertificateRequest {
		val input = com.amazonaws.services.acmpca.model.RevokeCertificateRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setCertificateSerial(this.certificateSerial)
		input.setRevocationReason(this.revocationReason.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm_pca.revokeCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca revoke-certificate")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("certificate-serial", certificateSerial)
				.argument("revocation-reason", revocationReason.toString())
	}

}


fun AWSACMPCAFunctions.tagCertificateAuthority(certificateAuthorityArn: String, tags: List<com.amazonaws.services.acmpca.model.Tag>, init: AWSACMPCATagCertificateAuthorityCommand.() -> Unit) {
	this.block.declare(AWSACMPCATagCertificateAuthorityCommand(certificateAuthorityArn, tags).apply(init))
}

@Generated
class AWSACMPCATagCertificateAuthorityCommand(val certificateAuthorityArn: String, val tags: List<com.amazonaws.services.acmpca.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.TagCertificateAuthorityRequest> {



	override fun build(): com.amazonaws.services.acmpca.model.TagCertificateAuthorityRequest {
		val input = com.amazonaws.services.acmpca.model.TagCertificateAuthorityRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm_pca.tagCertificateAuthority(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca tag-certificate-authority")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("tags", tags.toString())
	}

}


fun AWSACMPCAFunctions.untagCertificateAuthority(certificateAuthorityArn: String, tags: List<com.amazonaws.services.acmpca.model.Tag>, init: AWSACMPCAUntagCertificateAuthorityCommand.() -> Unit) {
	this.block.declare(AWSACMPCAUntagCertificateAuthorityCommand(certificateAuthorityArn, tags).apply(init))
}

@Generated
class AWSACMPCAUntagCertificateAuthorityCommand(val certificateAuthorityArn: String, val tags: List<com.amazonaws.services.acmpca.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.UntagCertificateAuthorityRequest> {



	override fun build(): com.amazonaws.services.acmpca.model.UntagCertificateAuthorityRequest {
		val input = com.amazonaws.services.acmpca.model.UntagCertificateAuthorityRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm_pca.untagCertificateAuthority(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca untag-certificate-authority")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("tags", tags.toString())
	}

}


fun AWSACMPCAFunctions.updateCertificateAuthority(certificateAuthorityArn: String, init: AWSACMPCAUpdateCertificateAuthorityCommand.() -> Unit) {
	this.block.declare(AWSACMPCAUpdateCertificateAuthorityCommand(certificateAuthorityArn).apply(init))
}

@Generated
class AWSACMPCAUpdateCertificateAuthorityCommand(val certificateAuthorityArn: String) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityRequest> {

	var revocationConfiguration: com.amazonaws.services.acmpca.model.RevocationConfiguration? = null
	var status: CertificateAuthorityStatus? = null

	override fun build(): com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityRequest {
		val input = com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setRevocationConfiguration(this.revocationConfiguration)
		input.setStatus(this.status?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.acm_pca.updateCertificateAuthority(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca update-certificate-authority")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("revocation-configuration", revocationConfiguration?.toString())
				.argument("status", status?.toString())
	}

}
