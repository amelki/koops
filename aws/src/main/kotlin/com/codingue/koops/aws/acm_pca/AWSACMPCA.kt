
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.acm_pca

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.acmpca.*
import com.amazonaws.services.acmpca.model.*

var com.codingue.koops.core.Environment.acm_pca: AWSACMPCA
	get() {
		var service = this.capabilities["aws-acm_pca"]
		if (service == null) {
			service = AWSACMPCAClientBuilder.standard().build()
			this.capabilities["aws-acm_pca"] = service
		}
		return service as AWSACMPCA
	}
	set(acm_pca) {
		this.capabilities["aws-acm_pca"] = acm_pca
	}

@Generated
class AWSACMPCAFunctions(val block: Block)

infix fun <T> AwsContinuation.acm_pca(init: AWSACMPCAFunctions.() -> T): T {
	return AWSACMPCAFunctions(shell).run(init)
}

			

fun AWSACMPCAFunctions.createCertificateAuthority(certificateAuthorityConfiguration: com.amazonaws.services.acmpca.model.CertificateAuthorityConfiguration, certificateAuthorityType: CertificateAuthorityType, init: (AWSACMPCACreateCertificateAuthorityCommand.() -> Unit)? = null): com.amazonaws.services.acmpca.model.CreateCertificateAuthorityResult {
	return this.block.declare(AWSACMPCACreateCertificateAuthorityCommand(certificateAuthorityConfiguration, certificateAuthorityType).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.acmpca.model.CreateCertificateAuthorityResult
}

@Generated
class AWSACMPCACreateCertificateAuthorityCommand(val certificateAuthorityConfiguration: com.amazonaws.services.acmpca.model.CertificateAuthorityConfiguration, val certificateAuthorityType: CertificateAuthorityType) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.CreateCertificateAuthorityRequest, com.amazonaws.services.acmpca.model.CreateCertificateAuthorityResult> {

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

	
	override fun dryResult(): com.amazonaws.services.acmpca.model.CreateCertificateAuthorityResult {
	  return com.amazonaws.services.acmpca.model.CreateCertificateAuthorityResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.acmpca.model.CreateCertificateAuthorityResult {
		return environment.acm_pca.createCertificateAuthority(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca create-certificate-authority")
				.argument("certificate-authority-configuration", certificateAuthorityConfiguration.toString())
				.argument("revocation-configuration", revocationConfiguration?.toString())
				.argument("certificate-authority-type", certificateAuthorityType.toString())
				.argument("idempotency-token", idempotencyToken)
	}

}


fun AWSACMPCAFunctions.createCertificateAuthorityAuditReport(certificateAuthorityArn: String, s3BucketName: String, auditReportResponseFormat: AuditReportResponseFormat, init: (AWSACMPCACreateCertificateAuthorityAuditReportCommand.() -> Unit)? = null): com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportResult {
	return this.block.declare(AWSACMPCACreateCertificateAuthorityAuditReportCommand(certificateAuthorityArn, s3BucketName, auditReportResponseFormat).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportResult
}

@Generated
class AWSACMPCACreateCertificateAuthorityAuditReportCommand(val certificateAuthorityArn: String, val s3BucketName: String, val auditReportResponseFormat: AuditReportResponseFormat) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportRequest, com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportResult> {



	override fun build(): com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportRequest {
		val input = com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setS3BucketName(this.s3BucketName)
		input.setAuditReportResponseFormat(this.auditReportResponseFormat.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportResult {
	  return com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportResult {
		return environment.acm_pca.createCertificateAuthorityAuditReport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca create-certificate-authority-audit-report")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("s3-bucket-name", s3BucketName)
				.argument("audit-report-response-format", auditReportResponseFormat.toString())
	}

}


fun AWSACMPCAFunctions.deleteCertificateAuthority(certificateAuthorityArn: String, init: (AWSACMPCADeleteCertificateAuthorityCommand.() -> Unit)? = null): com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityResult {
	return this.block.declare(AWSACMPCADeleteCertificateAuthorityCommand(certificateAuthorityArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityResult
}

@Generated
class AWSACMPCADeleteCertificateAuthorityCommand(val certificateAuthorityArn: String) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityRequest, com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityResult> {



	override fun build(): com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityRequest {
		val input = com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityResult {
	  return com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityResult {
		return environment.acm_pca.deleteCertificateAuthority(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca delete-certificate-authority")
				.argument("certificate-authority-arn", certificateAuthorityArn)
	}

}


fun AWSACMPCAFunctions.describeCertificateAuthority(certificateAuthorityArn: String, init: (AWSACMPCADescribeCertificateAuthorityCommand.() -> Unit)? = null): com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityResult {
	return this.block.declare(AWSACMPCADescribeCertificateAuthorityCommand(certificateAuthorityArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityResult
}

@Generated
class AWSACMPCADescribeCertificateAuthorityCommand(val certificateAuthorityArn: String) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityRequest, com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityResult> {



	override fun build(): com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityRequest {
		val input = com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityResult {
	  return com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityResult {
		return environment.acm_pca.describeCertificateAuthority(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca describe-certificate-authority")
				.argument("certificate-authority-arn", certificateAuthorityArn)
	}

}


fun AWSACMPCAFunctions.describeCertificateAuthorityAuditReport(certificateAuthorityArn: String, auditReportId: String, init: (AWSACMPCADescribeCertificateAuthorityAuditReportCommand.() -> Unit)? = null): com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportResult {
	return this.block.declare(AWSACMPCADescribeCertificateAuthorityAuditReportCommand(certificateAuthorityArn, auditReportId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportResult
}

@Generated
class AWSACMPCADescribeCertificateAuthorityAuditReportCommand(val certificateAuthorityArn: String, val auditReportId: String) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportRequest, com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportResult> {



	override fun build(): com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportRequest {
		val input = com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setAuditReportId(this.auditReportId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportResult {
	  return com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportResult {
		return environment.acm_pca.describeCertificateAuthorityAuditReport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca describe-certificate-authority-audit-report")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("audit-report-id", auditReportId)
	}

}


fun AWSACMPCAFunctions.getCertificate(certificateAuthorityArn: String, certificateArn: String, init: (AWSACMPCAGetCertificateCommand.() -> Unit)? = null): com.amazonaws.services.acmpca.model.GetCertificateResult {
	return this.block.declare(AWSACMPCAGetCertificateCommand(certificateAuthorityArn, certificateArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.acmpca.model.GetCertificateResult
}

@Generated
class AWSACMPCAGetCertificateCommand(val certificateAuthorityArn: String, val certificateArn: String) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.GetCertificateRequest, com.amazonaws.services.acmpca.model.GetCertificateResult> {



	override fun build(): com.amazonaws.services.acmpca.model.GetCertificateRequest {
		val input = com.amazonaws.services.acmpca.model.GetCertificateRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setCertificateArn(this.certificateArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.acmpca.model.GetCertificateResult {
	  return com.amazonaws.services.acmpca.model.GetCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.acmpca.model.GetCertificateResult {
		return environment.acm_pca.getCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca get-certificate")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("certificate-arn", certificateArn)
	}

}


fun AWSACMPCAFunctions.getCertificateAuthorityCertificate(certificateAuthorityArn: String, init: (AWSACMPCAGetCertificateAuthorityCertificateCommand.() -> Unit)? = null): com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateResult {
	return this.block.declare(AWSACMPCAGetCertificateAuthorityCertificateCommand(certificateAuthorityArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateResult
}

@Generated
class AWSACMPCAGetCertificateAuthorityCertificateCommand(val certificateAuthorityArn: String) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateRequest, com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateResult> {



	override fun build(): com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateRequest {
		val input = com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateResult {
	  return com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateResult {
		return environment.acm_pca.getCertificateAuthorityCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca get-certificate-authority-certificate")
				.argument("certificate-authority-arn", certificateAuthorityArn)
	}

}


fun AWSACMPCAFunctions.getCertificateAuthorityCsr(certificateAuthorityArn: String, init: (AWSACMPCAGetCertificateAuthorityCsrCommand.() -> Unit)? = null): com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrResult {
	return this.block.declare(AWSACMPCAGetCertificateAuthorityCsrCommand(certificateAuthorityArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrResult
}

@Generated
class AWSACMPCAGetCertificateAuthorityCsrCommand(val certificateAuthorityArn: String) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrRequest, com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrResult> {



	override fun build(): com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrRequest {
		val input = com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrResult {
	  return com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrResult {
		return environment.acm_pca.getCertificateAuthorityCsr(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca get-certificate-authority-csr")
				.argument("certificate-authority-arn", certificateAuthorityArn)
	}

}


fun AWSACMPCAFunctions.importCertificateAuthorityCertificate(certificateAuthorityArn: String, certificate: java.nio.ByteBuffer, certificateChain: java.nio.ByteBuffer, init: (AWSACMPCAImportCertificateAuthorityCertificateCommand.() -> Unit)? = null): com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateResult {
	return this.block.declare(AWSACMPCAImportCertificateAuthorityCertificateCommand(certificateAuthorityArn, certificate, certificateChain).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateResult
}

@Generated
class AWSACMPCAImportCertificateAuthorityCertificateCommand(val certificateAuthorityArn: String, val certificate: java.nio.ByteBuffer, val certificateChain: java.nio.ByteBuffer) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateRequest, com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateResult> {



	override fun build(): com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateRequest {
		val input = com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setCertificate(this.certificate)
		input.setCertificateChain(this.certificateChain)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateResult {
	  return com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateResult {
		return environment.acm_pca.importCertificateAuthorityCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca import-certificate-authority-certificate")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("certificate", certificate.toString())
				.argument("certificate-chain", certificateChain.toString())
	}

}


fun AWSACMPCAFunctions.issueCertificate(certificateAuthorityArn: String, csr: java.nio.ByteBuffer, signingAlgorithm: SigningAlgorithm, validity: com.amazonaws.services.acmpca.model.Validity, init: (AWSACMPCAIssueCertificateCommand.() -> Unit)? = null): com.amazonaws.services.acmpca.model.IssueCertificateResult {
	return this.block.declare(AWSACMPCAIssueCertificateCommand(certificateAuthorityArn, csr, signingAlgorithm, validity).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.acmpca.model.IssueCertificateResult
}

@Generated
class AWSACMPCAIssueCertificateCommand(val certificateAuthorityArn: String, val csr: java.nio.ByteBuffer, val signingAlgorithm: SigningAlgorithm, val validity: com.amazonaws.services.acmpca.model.Validity) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.IssueCertificateRequest, com.amazonaws.services.acmpca.model.IssueCertificateResult> {

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

	
	override fun dryResult(): com.amazonaws.services.acmpca.model.IssueCertificateResult {
	  return com.amazonaws.services.acmpca.model.IssueCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.acmpca.model.IssueCertificateResult {
		return environment.acm_pca.issueCertificate(build())
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


fun AWSACMPCAFunctions.listCertificateAuthorities(init: (AWSACMPCAListCertificateAuthoritiesCommand.() -> Unit)? = null): com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesResult {
	return this.block.declare(AWSACMPCAListCertificateAuthoritiesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesResult
}

@Generated
class AWSACMPCAListCertificateAuthoritiesCommand() : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesRequest, com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesRequest {
		val input = com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesResult {
	  return com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesResult {
		return environment.acm_pca.listCertificateAuthorities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca list-certificate-authorities")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSACMPCAFunctions.listTags(certificateAuthorityArn: String, init: (AWSACMPCAListTagsCommand.() -> Unit)? = null): com.amazonaws.services.acmpca.model.ListTagsResult {
	return this.block.declare(AWSACMPCAListTagsCommand(certificateAuthorityArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.acmpca.model.ListTagsResult
}

@Generated
class AWSACMPCAListTagsCommand(val certificateAuthorityArn: String) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.ListTagsRequest, com.amazonaws.services.acmpca.model.ListTagsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.acmpca.model.ListTagsRequest {
		val input = com.amazonaws.services.acmpca.model.ListTagsRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.acmpca.model.ListTagsResult {
	  return com.amazonaws.services.acmpca.model.ListTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.acmpca.model.ListTagsResult {
		return environment.acm_pca.listTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca list-tags")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSACMPCAFunctions.revokeCertificate(certificateAuthorityArn: String, certificateSerial: String, revocationReason: RevocationReason, init: (AWSACMPCARevokeCertificateCommand.() -> Unit)? = null): com.amazonaws.services.acmpca.model.RevokeCertificateResult {
	return this.block.declare(AWSACMPCARevokeCertificateCommand(certificateAuthorityArn, certificateSerial, revocationReason).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.acmpca.model.RevokeCertificateResult
}

@Generated
class AWSACMPCARevokeCertificateCommand(val certificateAuthorityArn: String, val certificateSerial: String, val revocationReason: RevocationReason) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.RevokeCertificateRequest, com.amazonaws.services.acmpca.model.RevokeCertificateResult> {



	override fun build(): com.amazonaws.services.acmpca.model.RevokeCertificateRequest {
		val input = com.amazonaws.services.acmpca.model.RevokeCertificateRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setCertificateSerial(this.certificateSerial)
		input.setRevocationReason(this.revocationReason.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.acmpca.model.RevokeCertificateResult {
	  return com.amazonaws.services.acmpca.model.RevokeCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.acmpca.model.RevokeCertificateResult {
		return environment.acm_pca.revokeCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca revoke-certificate")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("certificate-serial", certificateSerial)
				.argument("revocation-reason", revocationReason.toString())
	}

}


fun AWSACMPCAFunctions.tagCertificateAuthority(certificateAuthorityArn: String, tags: List<com.amazonaws.services.acmpca.model.Tag>, init: (AWSACMPCATagCertificateAuthorityCommand.() -> Unit)? = null): com.amazonaws.services.acmpca.model.TagCertificateAuthorityResult {
	return this.block.declare(AWSACMPCATagCertificateAuthorityCommand(certificateAuthorityArn, tags).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.acmpca.model.TagCertificateAuthorityResult
}

@Generated
class AWSACMPCATagCertificateAuthorityCommand(val certificateAuthorityArn: String, val tags: List<com.amazonaws.services.acmpca.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.TagCertificateAuthorityRequest, com.amazonaws.services.acmpca.model.TagCertificateAuthorityResult> {



	override fun build(): com.amazonaws.services.acmpca.model.TagCertificateAuthorityRequest {
		val input = com.amazonaws.services.acmpca.model.TagCertificateAuthorityRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.acmpca.model.TagCertificateAuthorityResult {
	  return com.amazonaws.services.acmpca.model.TagCertificateAuthorityResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.acmpca.model.TagCertificateAuthorityResult {
		return environment.acm_pca.tagCertificateAuthority(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca tag-certificate-authority")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("tags", tags.toString())
	}

}


fun AWSACMPCAFunctions.untagCertificateAuthority(certificateAuthorityArn: String, tags: List<com.amazonaws.services.acmpca.model.Tag>, init: (AWSACMPCAUntagCertificateAuthorityCommand.() -> Unit)? = null): com.amazonaws.services.acmpca.model.UntagCertificateAuthorityResult {
	return this.block.declare(AWSACMPCAUntagCertificateAuthorityCommand(certificateAuthorityArn, tags).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.acmpca.model.UntagCertificateAuthorityResult
}

@Generated
class AWSACMPCAUntagCertificateAuthorityCommand(val certificateAuthorityArn: String, val tags: List<com.amazonaws.services.acmpca.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.UntagCertificateAuthorityRequest, com.amazonaws.services.acmpca.model.UntagCertificateAuthorityResult> {



	override fun build(): com.amazonaws.services.acmpca.model.UntagCertificateAuthorityRequest {
		val input = com.amazonaws.services.acmpca.model.UntagCertificateAuthorityRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.acmpca.model.UntagCertificateAuthorityResult {
	  return com.amazonaws.services.acmpca.model.UntagCertificateAuthorityResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.acmpca.model.UntagCertificateAuthorityResult {
		return environment.acm_pca.untagCertificateAuthority(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca untag-certificate-authority")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("tags", tags.toString())
	}

}


fun AWSACMPCAFunctions.updateCertificateAuthority(certificateAuthorityArn: String, init: (AWSACMPCAUpdateCertificateAuthorityCommand.() -> Unit)? = null): com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityResult {
	return this.block.declare(AWSACMPCAUpdateCertificateAuthorityCommand(certificateAuthorityArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityResult
}

@Generated
class AWSACMPCAUpdateCertificateAuthorityCommand(val certificateAuthorityArn: String) : AmazonWebServiceCommand<com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityRequest, com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityResult> {

	var revocationConfiguration: com.amazonaws.services.acmpca.model.RevocationConfiguration? = null
	var status: CertificateAuthorityStatus? = null

	override fun build(): com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityRequest {
		val input = com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityRequest()
		input.setCertificateAuthorityArn(this.certificateAuthorityArn)
		input.setRevocationConfiguration(this.revocationConfiguration)
		input.setStatus(this.status?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityResult {
	  return com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityResult {
		return environment.acm_pca.updateCertificateAuthority(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws acm-pca update-certificate-authority")
				.argument("certificate-authority-arn", certificateAuthorityArn)
				.argument("revocation-configuration", revocationConfiguration?.toString())
				.argument("status", status?.toString())
	}

}
