
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

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

infix fun AwsContinuation.importexport(init: AmazonImportExportFunctions.() -> Unit) {
	AmazonImportExportFunctions(shell).apply(init)
}

			

fun AmazonImportExportFunctions.cancelJob(jobId: String, init: AmazonImportExportCancelJobCommand.() -> Unit) {
	this.block.declare(AmazonImportExportCancelJobCommand(jobId).apply(init))
}

@Generated
class AmazonImportExportCancelJobCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.importexport.model.CancelJobRequest> {

	var aPIVersion: String? = null

	override fun build(): com.amazonaws.services.importexport.model.CancelJobRequest {
		val input = com.amazonaws.services.importexport.model.CancelJobRequest()
		input.setJobId(this.jobId)
		input.setAPIVersion(this.aPIVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.importexport.cancelJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws importexport cancel-job")
				.argument("job-id", jobId)
				.argument("apiversion", aPIVersion)
	}

}


fun AmazonImportExportFunctions.createJob(jobType: JobType, manifest: String, validateOnly: Boolean, init: AmazonImportExportCreateJobCommand.() -> Unit) {
	this.block.declare(AmazonImportExportCreateJobCommand(jobType, manifest, validateOnly).apply(init))
}

@Generated
class AmazonImportExportCreateJobCommand(val jobType: JobType, val manifest: String, val validateOnly: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.importexport.model.CreateJobRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.importexport.createJob(build())
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


fun AmazonImportExportFunctions.getShippingLabel(init: AmazonImportExportGetShippingLabelCommand.() -> Unit) {
	this.block.declare(AmazonImportExportGetShippingLabelCommand().apply(init))
}

@Generated
class AmazonImportExportGetShippingLabelCommand() : AmazonWebServiceCommand<com.amazonaws.services.importexport.model.GetShippingLabelRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.importexport.getShippingLabel(build())
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


fun AmazonImportExportFunctions.getStatus(jobId: String, init: AmazonImportExportGetStatusCommand.() -> Unit) {
	this.block.declare(AmazonImportExportGetStatusCommand(jobId).apply(init))
}

@Generated
class AmazonImportExportGetStatusCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.importexport.model.GetStatusRequest> {

	var aPIVersion: String? = null

	override fun build(): com.amazonaws.services.importexport.model.GetStatusRequest {
		val input = com.amazonaws.services.importexport.model.GetStatusRequest()
		input.setJobId(this.jobId)
		input.setAPIVersion(this.aPIVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.importexport.getStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws importexport get-status")
				.argument("job-id", jobId)
				.argument("apiversion", aPIVersion)
	}

}


fun AmazonImportExportFunctions.listJobs(init: AmazonImportExportListJobsCommand.() -> Unit) {
	this.block.declare(AmazonImportExportListJobsCommand().apply(init))
}

@Generated
class AmazonImportExportListJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.importexport.model.ListJobsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.importexport.listJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws importexport list-jobs")
				.argument("max-jobs", maxJobs?.toString())
				.argument("marker", marker)
				.argument("apiversion", aPIVersion)
	}

}


fun AmazonImportExportFunctions.updateJob(jobId: String, manifest: String, jobType: JobType, validateOnly: Boolean, init: AmazonImportExportUpdateJobCommand.() -> Unit) {
	this.block.declare(AmazonImportExportUpdateJobCommand(jobId, manifest, jobType, validateOnly).apply(init))
}

@Generated
class AmazonImportExportUpdateJobCommand(val jobId: String, val manifest: String, val jobType: JobType, val validateOnly: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.importexport.model.UpdateJobRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.importexport.updateJob(build())
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
