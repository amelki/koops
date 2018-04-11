
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.importexport.AmazonImportExport
import com.amazonaws.services.importexport.model.*

var codingue.koops.core.Environment.importexport: AmazonImportExport
	get() = this.capabilities[AmazonImportExport::class.java.name] as AmazonImportExport
	set(importexport) {
		this.capabilities[AmazonImportExport::class.java.name] = importexport
	}

@Generated
class AmazonImportExportFunctions(val block: Block)

infix fun <T> AwsContinuation.importexport(init: AmazonImportExportFunctions.() -> T): T {
	return AmazonImportExportFunctions(shell).run(init)
}

			

fun AmazonImportExportFunctions.cancelJob(jobId: String, init: AmazonImportExportCancelJobCommand.() -> Unit): com.amazonaws.services.importexport.model.CancelJobResult {
	return this.block.declare(AmazonImportExportCancelJobCommand(jobId).apply(init)) as com.amazonaws.services.importexport.model.CancelJobResult
}

@Generated
class AmazonImportExportCancelJobCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.importexport.model.CancelJobRequest, com.amazonaws.services.importexport.model.CancelJobResult> {

	var aPIVersion: String? = null

	override fun build(): com.amazonaws.services.importexport.model.CancelJobRequest {
		val input = com.amazonaws.services.importexport.model.CancelJobRequest()
		input.setJobId(this.jobId)
		input.setAPIVersion(this.aPIVersion)
		return input
	}

	override fun dryResult(): com.amazonaws.services.importexport.model.CancelJobResult {
	  return com.amazonaws.services.importexport.model.CancelJobResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.importexport.model.CancelJobResult {
		return environment.importexport.cancelJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws importexport cancel-job")
				.argument("job-id", jobId)
				.argument("apiversion", aPIVersion)
	}

}


fun AmazonImportExportFunctions.createJob(jobType: JobType, manifest: String, validateOnly: Boolean, init: AmazonImportExportCreateJobCommand.() -> Unit): com.amazonaws.services.importexport.model.CreateJobResult {
	return this.block.declare(AmazonImportExportCreateJobCommand(jobType, manifest, validateOnly).apply(init)) as com.amazonaws.services.importexport.model.CreateJobResult
}

@Generated
class AmazonImportExportCreateJobCommand(val jobType: JobType, val manifest: String, val validateOnly: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.importexport.model.CreateJobRequest, com.amazonaws.services.importexport.model.CreateJobResult> {

	var manifestAddendum: String? = null
	var aPIVersion: String? = null

	override fun build(): com.amazonaws.services.importexport.model.CreateJobRequest {
		val input = com.amazonaws.services.importexport.model.CreateJobRequest()
		input.setJobType(this.jobType.toString())
		input.setManifest(this.manifest)
		input.setManifestAddendum(this.manifestAddendum)
		input.setValidateOnly(this.validateOnly)
		input.setAPIVersion(this.aPIVersion)
		return input
	}

	override fun dryResult(): com.amazonaws.services.importexport.model.CreateJobResult {
	  return com.amazonaws.services.importexport.model.CreateJobResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.importexport.model.CreateJobResult {
		return environment.importexport.createJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws importexport create-job")
				.argument("job-type", jobType.toString())
				.argument("manifest", manifest)
				.argument("manifest-addendum", manifestAddendum)
				.option("validate-only", validateOnly ?: false)
				.argument("apiversion", aPIVersion)
	}

}


fun AmazonImportExportFunctions.getShippingLabel(init: AmazonImportExportGetShippingLabelCommand.() -> Unit): com.amazonaws.services.importexport.model.GetShippingLabelResult {
	return this.block.declare(AmazonImportExportGetShippingLabelCommand().apply(init)) as com.amazonaws.services.importexport.model.GetShippingLabelResult
}

@Generated
class AmazonImportExportGetShippingLabelCommand() : AmazonWebServiceCommand<com.amazonaws.services.importexport.model.GetShippingLabelRequest, com.amazonaws.services.importexport.model.GetShippingLabelResult> {

	var jobIds: List<String>? = null
	var name: String? = null
	var company: String? = null
	var phoneNumber: String? = null
	var country: String? = null
	var stateOrProvince: String? = null
	var city: String? = null
	var postalCode: String? = null
	var street1: String? = null
	var street2: String? = null
	var street3: String? = null
	var aPIVersion: String? = null

	override fun build(): com.amazonaws.services.importexport.model.GetShippingLabelRequest {
		val input = com.amazonaws.services.importexport.model.GetShippingLabelRequest()
		input.setJobIds(this.jobIds)
		input.setName(this.name)
		input.setCompany(this.company)
		input.setPhoneNumber(this.phoneNumber)
		input.setCountry(this.country)
		input.setStateOrProvince(this.stateOrProvince)
		input.setCity(this.city)
		input.setPostalCode(this.postalCode)
		input.setStreet1(this.street1)
		input.setStreet2(this.street2)
		input.setStreet3(this.street3)
		input.setAPIVersion(this.aPIVersion)
		return input
	}

	override fun dryResult(): com.amazonaws.services.importexport.model.GetShippingLabelResult {
	  return com.amazonaws.services.importexport.model.GetShippingLabelResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.importexport.model.GetShippingLabelResult {
		return environment.importexport.getShippingLabel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws importexport get-shipping-label")
				.argument("job-ids", jobIds?.toString())
				.argument("name", name)
				.argument("company", company)
				.argument("phone-number", phoneNumber)
				.argument("country", country)
				.argument("state-or-province", stateOrProvince)
				.argument("city", city)
				.argument("postal-code", postalCode)
				.argument("street1", street1)
				.argument("street2", street2)
				.argument("street3", street3)
				.argument("apiversion", aPIVersion)
	}

}


fun AmazonImportExportFunctions.getStatus(jobId: String, init: AmazonImportExportGetStatusCommand.() -> Unit): com.amazonaws.services.importexport.model.GetStatusResult {
	return this.block.declare(AmazonImportExportGetStatusCommand(jobId).apply(init)) as com.amazonaws.services.importexport.model.GetStatusResult
}

@Generated
class AmazonImportExportGetStatusCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.importexport.model.GetStatusRequest, com.amazonaws.services.importexport.model.GetStatusResult> {

	var aPIVersion: String? = null

	override fun build(): com.amazonaws.services.importexport.model.GetStatusRequest {
		val input = com.amazonaws.services.importexport.model.GetStatusRequest()
		input.setJobId(this.jobId)
		input.setAPIVersion(this.aPIVersion)
		return input
	}

	override fun dryResult(): com.amazonaws.services.importexport.model.GetStatusResult {
	  return com.amazonaws.services.importexport.model.GetStatusResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.importexport.model.GetStatusResult {
		return environment.importexport.getStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws importexport get-status")
				.argument("job-id", jobId)
				.argument("apiversion", aPIVersion)
	}

}


fun AmazonImportExportFunctions.listJobs(init: AmazonImportExportListJobsCommand.() -> Unit): com.amazonaws.services.importexport.model.ListJobsResult {
	return this.block.declare(AmazonImportExportListJobsCommand().apply(init)) as com.amazonaws.services.importexport.model.ListJobsResult
}

@Generated
class AmazonImportExportListJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.importexport.model.ListJobsRequest, com.amazonaws.services.importexport.model.ListJobsResult> {

	var maxJobs: Int? = 0
	var marker: String? = null
	var aPIVersion: String? = null

	override fun build(): com.amazonaws.services.importexport.model.ListJobsRequest {
		val input = com.amazonaws.services.importexport.model.ListJobsRequest()
		input.setMaxJobs(this.maxJobs)
		input.setMarker(this.marker)
		input.setAPIVersion(this.aPIVersion)
		return input
	}

	override fun dryResult(): com.amazonaws.services.importexport.model.ListJobsResult {
	  return com.amazonaws.services.importexport.model.ListJobsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.importexport.model.ListJobsResult {
		return environment.importexport.listJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws importexport list-jobs")
				.argument("max-jobs", maxJobs?.toString())
				.argument("marker", marker)
				.argument("apiversion", aPIVersion)
	}

}


fun AmazonImportExportFunctions.updateJob(jobId: String, manifest: String, jobType: JobType, validateOnly: Boolean, init: AmazonImportExportUpdateJobCommand.() -> Unit): com.amazonaws.services.importexport.model.UpdateJobResult {
	return this.block.declare(AmazonImportExportUpdateJobCommand(jobId, manifest, jobType, validateOnly).apply(init)) as com.amazonaws.services.importexport.model.UpdateJobResult
}

@Generated
class AmazonImportExportUpdateJobCommand(val jobId: String, val manifest: String, val jobType: JobType, val validateOnly: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.importexport.model.UpdateJobRequest, com.amazonaws.services.importexport.model.UpdateJobResult> {

	var aPIVersion: String? = null

	override fun build(): com.amazonaws.services.importexport.model.UpdateJobRequest {
		val input = com.amazonaws.services.importexport.model.UpdateJobRequest()
		input.setJobId(this.jobId)
		input.setManifest(this.manifest)
		input.setJobType(this.jobType.toString())
		input.setValidateOnly(this.validateOnly)
		input.setAPIVersion(this.aPIVersion)
		return input
	}

	override fun dryResult(): com.amazonaws.services.importexport.model.UpdateJobResult {
	  return com.amazonaws.services.importexport.model.UpdateJobResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.importexport.model.UpdateJobResult {
		return environment.importexport.updateJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws importexport update-job")
				.argument("job-id", jobId)
				.argument("manifest", manifest)
				.argument("job-type", jobType.toString())
				.option("validate-only", validateOnly ?: false)
				.argument("apiversion", aPIVersion)
	}

}
