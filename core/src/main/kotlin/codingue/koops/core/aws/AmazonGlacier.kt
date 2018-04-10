
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.glacier.AmazonGlacier
import com.amazonaws.services.glacier.model.*

var codingue.koops.core.Environment.glacier: AmazonGlacier
	get() = this.capabilities[AmazonGlacier::class.java.name] as AmazonGlacier
	set(glacier) {
		this.capabilities[AmazonGlacier::class.java.name] = glacier
	}

@Generated
class AmazonGlacierFunctions(val block: Block)

infix fun AwsContinuation.glacier(init: AmazonGlacierFunctions.() -> Unit) {
	AmazonGlacierFunctions(shell).apply(init)
}

			

fun AmazonGlacierFunctions.abortMultipartUpload(init: AmazonGlacierAbortMultipartUploadCommand.() -> Unit) {
	this.block.declare(AmazonGlacierAbortMultipartUploadCommand().apply(init))
}

@Generated
class AmazonGlacierAbortMultipartUploadCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.AbortMultipartUploadRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var uploadId: String? = null

	override fun build(): com.amazonaws.services.glacier.model.AbortMultipartUploadRequest {
		val input = com.amazonaws.services.glacier.model.AbortMultipartUploadRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setUploadId(this.uploadId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.abortMultipartUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier abort-multipart-upload")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("upload-id", uploadId)
	}

}


fun AmazonGlacierFunctions.abortVaultLock(init: AmazonGlacierAbortVaultLockCommand.() -> Unit) {
	this.block.declare(AmazonGlacierAbortVaultLockCommand().apply(init))
}

@Generated
class AmazonGlacierAbortVaultLockCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.AbortVaultLockRequest> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.AbortVaultLockRequest {
		val input = com.amazonaws.services.glacier.model.AbortVaultLockRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.abortVaultLock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier abort-vault-lock")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.addTagsToVault(init: AmazonGlacierAddTagsToVaultCommand.() -> Unit) {
	this.block.declare(AmazonGlacierAddTagsToVaultCommand().apply(init))
}

@Generated
class AmazonGlacierAddTagsToVaultCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.AddTagsToVaultRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var tags: Map<String, String>? = null

	override fun build(): com.amazonaws.services.glacier.model.AddTagsToVaultRequest {
		val input = com.amazonaws.services.glacier.model.AddTagsToVaultRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.addTagsToVault(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier add-tags-to-vault")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("tags", tags?.toString())
	}

}


fun AmazonGlacierFunctions.completeMultipartUpload(init: AmazonGlacierCompleteMultipartUploadCommand.() -> Unit) {
	this.block.declare(AmazonGlacierCompleteMultipartUploadCommand().apply(init))
}

@Generated
class AmazonGlacierCompleteMultipartUploadCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.CompleteMultipartUploadRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var uploadId: String? = null
	var archiveSize: String? = null
	var checksum: String? = null

	override fun build(): com.amazonaws.services.glacier.model.CompleteMultipartUploadRequest {
		val input = com.amazonaws.services.glacier.model.CompleteMultipartUploadRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setUploadId(this.uploadId)
		input.setArchiveSize(this.archiveSize)
		input.setChecksum(this.checksum)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.completeMultipartUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier complete-multipart-upload")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("upload-id", uploadId)
				.argument("archive-size", archiveSize)
				.argument("checksum", checksum)
	}

}


fun AmazonGlacierFunctions.completeVaultLock(init: AmazonGlacierCompleteVaultLockCommand.() -> Unit) {
	this.block.declare(AmazonGlacierCompleteVaultLockCommand().apply(init))
}

@Generated
class AmazonGlacierCompleteVaultLockCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.CompleteVaultLockRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var lockId: String? = null

	override fun build(): com.amazonaws.services.glacier.model.CompleteVaultLockRequest {
		val input = com.amazonaws.services.glacier.model.CompleteVaultLockRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setLockId(this.lockId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.completeVaultLock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier complete-vault-lock")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("lock-id", lockId)
	}

}


fun AmazonGlacierFunctions.createVault(init: AmazonGlacierCreateVaultCommand.() -> Unit) {
	this.block.declare(AmazonGlacierCreateVaultCommand().apply(init))
}

@Generated
class AmazonGlacierCreateVaultCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.CreateVaultRequest> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.CreateVaultRequest {
		val input = com.amazonaws.services.glacier.model.CreateVaultRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.createVault(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier create-vault")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.deleteArchive(init: AmazonGlacierDeleteArchiveCommand.() -> Unit) {
	this.block.declare(AmazonGlacierDeleteArchiveCommand().apply(init))
}

@Generated
class AmazonGlacierDeleteArchiveCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.DeleteArchiveRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var archiveId: String? = null

	override fun build(): com.amazonaws.services.glacier.model.DeleteArchiveRequest {
		val input = com.amazonaws.services.glacier.model.DeleteArchiveRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setArchiveId(this.archiveId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.deleteArchive(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier delete-archive")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("archive-id", archiveId)
	}

}


fun AmazonGlacierFunctions.deleteVault(init: AmazonGlacierDeleteVaultCommand.() -> Unit) {
	this.block.declare(AmazonGlacierDeleteVaultCommand().apply(init))
}

@Generated
class AmazonGlacierDeleteVaultCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.DeleteVaultRequest> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.DeleteVaultRequest {
		val input = com.amazonaws.services.glacier.model.DeleteVaultRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.deleteVault(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier delete-vault")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.deleteVaultAccessPolicy(init: AmazonGlacierDeleteVaultAccessPolicyCommand.() -> Unit) {
	this.block.declare(AmazonGlacierDeleteVaultAccessPolicyCommand().apply(init))
}

@Generated
class AmazonGlacierDeleteVaultAccessPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyRequest> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyRequest {
		val input = com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.deleteVaultAccessPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier delete-vault-access-policy")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.deleteVaultNotifications(init: AmazonGlacierDeleteVaultNotificationsCommand.() -> Unit) {
	this.block.declare(AmazonGlacierDeleteVaultNotificationsCommand().apply(init))
}

@Generated
class AmazonGlacierDeleteVaultNotificationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.DeleteVaultNotificationsRequest> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.DeleteVaultNotificationsRequest {
		val input = com.amazonaws.services.glacier.model.DeleteVaultNotificationsRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.deleteVaultNotifications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier delete-vault-notifications")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.describeJob(init: AmazonGlacierDescribeJobCommand.() -> Unit) {
	this.block.declare(AmazonGlacierDescribeJobCommand().apply(init))
}

@Generated
class AmazonGlacierDescribeJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.DescribeJobRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var jobId: String? = null

	override fun build(): com.amazonaws.services.glacier.model.DescribeJobRequest {
		val input = com.amazonaws.services.glacier.model.DescribeJobRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setJobId(this.jobId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.describeJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier describe-job")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("job-id", jobId)
	}

}


fun AmazonGlacierFunctions.describeVault(init: AmazonGlacierDescribeVaultCommand.() -> Unit) {
	this.block.declare(AmazonGlacierDescribeVaultCommand().apply(init))
}

@Generated
class AmazonGlacierDescribeVaultCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.DescribeVaultRequest> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.DescribeVaultRequest {
		val input = com.amazonaws.services.glacier.model.DescribeVaultRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.describeVault(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier describe-vault")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.getDataRetrievalPolicy(init: AmazonGlacierGetDataRetrievalPolicyCommand.() -> Unit) {
	this.block.declare(AmazonGlacierGetDataRetrievalPolicyCommand().apply(init))
}

@Generated
class AmazonGlacierGetDataRetrievalPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.GetDataRetrievalPolicyRequest> {

	var accountId: String? = null

	override fun build(): com.amazonaws.services.glacier.model.GetDataRetrievalPolicyRequest {
		val input = com.amazonaws.services.glacier.model.GetDataRetrievalPolicyRequest()
		input.setAccountId(this.accountId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.getDataRetrievalPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier get-data-retrieval-policy")
				.argument("account-id", accountId)
	}

}


fun AmazonGlacierFunctions.getJobOutput(init: AmazonGlacierGetJobOutputCommand.() -> Unit) {
	this.block.declare(AmazonGlacierGetJobOutputCommand().apply(init))
}

@Generated
class AmazonGlacierGetJobOutputCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.GetJobOutputRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var jobId: String? = null
	var range: String? = null

	override fun build(): com.amazonaws.services.glacier.model.GetJobOutputRequest {
		val input = com.amazonaws.services.glacier.model.GetJobOutputRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setJobId(this.jobId)
		input.setRange(this.range)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.getJobOutput(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier get-job-output")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("job-id", jobId)
				.argument("range", range)
	}

}


fun AmazonGlacierFunctions.getVaultAccessPolicy(init: AmazonGlacierGetVaultAccessPolicyCommand.() -> Unit) {
	this.block.declare(AmazonGlacierGetVaultAccessPolicyCommand().apply(init))
}

@Generated
class AmazonGlacierGetVaultAccessPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.GetVaultAccessPolicyRequest> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.GetVaultAccessPolicyRequest {
		val input = com.amazonaws.services.glacier.model.GetVaultAccessPolicyRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.getVaultAccessPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier get-vault-access-policy")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.getVaultLock(init: AmazonGlacierGetVaultLockCommand.() -> Unit) {
	this.block.declare(AmazonGlacierGetVaultLockCommand().apply(init))
}

@Generated
class AmazonGlacierGetVaultLockCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.GetVaultLockRequest> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.GetVaultLockRequest {
		val input = com.amazonaws.services.glacier.model.GetVaultLockRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.getVaultLock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier get-vault-lock")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.getVaultNotifications(init: AmazonGlacierGetVaultNotificationsCommand.() -> Unit) {
	this.block.declare(AmazonGlacierGetVaultNotificationsCommand().apply(init))
}

@Generated
class AmazonGlacierGetVaultNotificationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.GetVaultNotificationsRequest> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.GetVaultNotificationsRequest {
		val input = com.amazonaws.services.glacier.model.GetVaultNotificationsRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.getVaultNotifications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier get-vault-notifications")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.initiateJob(init: AmazonGlacierInitiateJobCommand.() -> Unit) {
	this.block.declare(AmazonGlacierInitiateJobCommand().apply(init))
}

@Generated
class AmazonGlacierInitiateJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.InitiateJobRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var jobParameters: com.amazonaws.services.glacier.model.JobParameters? = null

	override fun build(): com.amazonaws.services.glacier.model.InitiateJobRequest {
		val input = com.amazonaws.services.glacier.model.InitiateJobRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setJobParameters(this.jobParameters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.initiateJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier initiate-job")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("job-parameters", jobParameters?.toString())
	}

}


fun AmazonGlacierFunctions.initiateMultipartUpload(init: AmazonGlacierInitiateMultipartUploadCommand.() -> Unit) {
	this.block.declare(AmazonGlacierInitiateMultipartUploadCommand().apply(init))
}

@Generated
class AmazonGlacierInitiateMultipartUploadCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.InitiateMultipartUploadRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var archiveDescription: String? = null
	var partSize: String? = null

	override fun build(): com.amazonaws.services.glacier.model.InitiateMultipartUploadRequest {
		val input = com.amazonaws.services.glacier.model.InitiateMultipartUploadRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setArchiveDescription(this.archiveDescription)
		input.setPartSize(this.partSize)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.initiateMultipartUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier initiate-multipart-upload")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("archive-description", archiveDescription)
				.argument("part-size", partSize)
	}

}


fun AmazonGlacierFunctions.initiateVaultLock(init: AmazonGlacierInitiateVaultLockCommand.() -> Unit) {
	this.block.declare(AmazonGlacierInitiateVaultLockCommand().apply(init))
}

@Generated
class AmazonGlacierInitiateVaultLockCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.InitiateVaultLockRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var policy: com.amazonaws.services.glacier.model.VaultLockPolicy? = null

	override fun build(): com.amazonaws.services.glacier.model.InitiateVaultLockRequest {
		val input = com.amazonaws.services.glacier.model.InitiateVaultLockRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setPolicy(this.policy)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.initiateVaultLock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier initiate-vault-lock")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("policy", policy?.toString())
	}

}


fun AmazonGlacierFunctions.listJobs(init: AmazonGlacierListJobsCommand.() -> Unit) {
	this.block.declare(AmazonGlacierListJobsCommand().apply(init))
}

@Generated
class AmazonGlacierListJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.ListJobsRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var limit: String? = null
	var marker: String? = null
	var statuscode: String? = null
	var completed: String? = null

	override fun build(): com.amazonaws.services.glacier.model.ListJobsRequest {
		val input = com.amazonaws.services.glacier.model.ListJobsRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		input.setStatuscode(this.statuscode)
		input.setCompleted(this.completed)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.listJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier list-jobs")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("limit", limit)
				.argument("marker", marker)
				.argument("statuscode", statuscode)
				.argument("completed", completed)
	}

}


fun AmazonGlacierFunctions.listMultipartUploads(init: AmazonGlacierListMultipartUploadsCommand.() -> Unit) {
	this.block.declare(AmazonGlacierListMultipartUploadsCommand().apply(init))
}

@Generated
class AmazonGlacierListMultipartUploadsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.ListMultipartUploadsRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var limit: String? = null
	var uploadIdMarker: String? = null

	override fun build(): com.amazonaws.services.glacier.model.ListMultipartUploadsRequest {
		val input = com.amazonaws.services.glacier.model.ListMultipartUploadsRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setLimit(this.limit)
		input.setUploadIdMarker(this.uploadIdMarker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.listMultipartUploads(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier list-multipart-uploads")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("limit", limit)
				.argument("upload-id-marker", uploadIdMarker)
	}

}


fun AmazonGlacierFunctions.listParts(init: AmazonGlacierListPartsCommand.() -> Unit) {
	this.block.declare(AmazonGlacierListPartsCommand().apply(init))
}

@Generated
class AmazonGlacierListPartsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.ListPartsRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var uploadId: String? = null
	var marker: String? = null
	var limit: String? = null

	override fun build(): com.amazonaws.services.glacier.model.ListPartsRequest {
		val input = com.amazonaws.services.glacier.model.ListPartsRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setUploadId(this.uploadId)
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.listParts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier list-parts")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("upload-id", uploadId)
				.argument("marker", marker)
				.argument("limit", limit)
	}

}


fun AmazonGlacierFunctions.listProvisionedCapacity(init: AmazonGlacierListProvisionedCapacityCommand.() -> Unit) {
	this.block.declare(AmazonGlacierListProvisionedCapacityCommand().apply(init))
}

@Generated
class AmazonGlacierListProvisionedCapacityCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.ListProvisionedCapacityRequest> {

	var accountId: String? = null

	override fun build(): com.amazonaws.services.glacier.model.ListProvisionedCapacityRequest {
		val input = com.amazonaws.services.glacier.model.ListProvisionedCapacityRequest()
		input.setAccountId(this.accountId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.listProvisionedCapacity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier list-provisioned-capacity")
				.argument("account-id", accountId)
	}

}


fun AmazonGlacierFunctions.listTagsForVault(init: AmazonGlacierListTagsForVaultCommand.() -> Unit) {
	this.block.declare(AmazonGlacierListTagsForVaultCommand().apply(init))
}

@Generated
class AmazonGlacierListTagsForVaultCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.ListTagsForVaultRequest> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.ListTagsForVaultRequest {
		val input = com.amazonaws.services.glacier.model.ListTagsForVaultRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.listTagsForVault(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier list-tags-for-vault")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.listVaults(init: AmazonGlacierListVaultsCommand.() -> Unit) {
	this.block.declare(AmazonGlacierListVaultsCommand().apply(init))
}

@Generated
class AmazonGlacierListVaultsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.ListVaultsRequest> {

	var accountId: String? = null
	var marker: String? = null
	var limit: String? = null

	override fun build(): com.amazonaws.services.glacier.model.ListVaultsRequest {
		val input = com.amazonaws.services.glacier.model.ListVaultsRequest()
		input.setAccountId(this.accountId)
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.listVaults(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier list-vaults")
				.argument("account-id", accountId)
				.argument("marker", marker)
				.argument("limit", limit)
	}

}


fun AmazonGlacierFunctions.purchaseProvisionedCapacity(init: AmazonGlacierPurchaseProvisionedCapacityCommand.() -> Unit) {
	this.block.declare(AmazonGlacierPurchaseProvisionedCapacityCommand().apply(init))
}

@Generated
class AmazonGlacierPurchaseProvisionedCapacityCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityRequest> {

	var accountId: String? = null

	override fun build(): com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityRequest {
		val input = com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityRequest()
		input.setAccountId(this.accountId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.purchaseProvisionedCapacity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier purchase-provisioned-capacity")
				.argument("account-id", accountId)
	}

}


fun AmazonGlacierFunctions.removeTagsFromVault(init: AmazonGlacierRemoveTagsFromVaultCommand.() -> Unit) {
	this.block.declare(AmazonGlacierRemoveTagsFromVaultCommand().apply(init))
}

@Generated
class AmazonGlacierRemoveTagsFromVaultCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.RemoveTagsFromVaultRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var tagKeys: List<String>? = null

	override fun build(): com.amazonaws.services.glacier.model.RemoveTagsFromVaultRequest {
		val input = com.amazonaws.services.glacier.model.RemoveTagsFromVaultRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.removeTagsFromVault(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier remove-tags-from-vault")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("tag-keys", tagKeys?.toString())
	}

}


fun AmazonGlacierFunctions.setDataRetrievalPolicy(init: AmazonGlacierSetDataRetrievalPolicyCommand.() -> Unit) {
	this.block.declare(AmazonGlacierSetDataRetrievalPolicyCommand().apply(init))
}

@Generated
class AmazonGlacierSetDataRetrievalPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.SetDataRetrievalPolicyRequest> {

	var accountId: String? = null
	var policy: com.amazonaws.services.glacier.model.DataRetrievalPolicy? = null

	override fun build(): com.amazonaws.services.glacier.model.SetDataRetrievalPolicyRequest {
		val input = com.amazonaws.services.glacier.model.SetDataRetrievalPolicyRequest()
		input.setAccountId(this.accountId)
		input.setPolicy(this.policy)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.setDataRetrievalPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier set-data-retrieval-policy")
				.argument("account-id", accountId)
				.argument("policy", policy?.toString())
	}

}


fun AmazonGlacierFunctions.setVaultAccessPolicy(init: AmazonGlacierSetVaultAccessPolicyCommand.() -> Unit) {
	this.block.declare(AmazonGlacierSetVaultAccessPolicyCommand().apply(init))
}

@Generated
class AmazonGlacierSetVaultAccessPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.SetVaultAccessPolicyRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var policy: com.amazonaws.services.glacier.model.VaultAccessPolicy? = null

	override fun build(): com.amazonaws.services.glacier.model.SetVaultAccessPolicyRequest {
		val input = com.amazonaws.services.glacier.model.SetVaultAccessPolicyRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setPolicy(this.policy)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.setVaultAccessPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier set-vault-access-policy")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("policy", policy?.toString())
	}

}


fun AmazonGlacierFunctions.setVaultNotifications(init: AmazonGlacierSetVaultNotificationsCommand.() -> Unit) {
	this.block.declare(AmazonGlacierSetVaultNotificationsCommand().apply(init))
}

@Generated
class AmazonGlacierSetVaultNotificationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.SetVaultNotificationsRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var vaultNotificationConfig: com.amazonaws.services.glacier.model.VaultNotificationConfig? = null

	override fun build(): com.amazonaws.services.glacier.model.SetVaultNotificationsRequest {
		val input = com.amazonaws.services.glacier.model.SetVaultNotificationsRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setVaultNotificationConfig(this.vaultNotificationConfig)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.setVaultNotifications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier set-vault-notifications")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("vault-notification-config", vaultNotificationConfig?.toString())
	}

}


fun AmazonGlacierFunctions.uploadArchive(init: AmazonGlacierUploadArchiveCommand.() -> Unit) {
	this.block.declare(AmazonGlacierUploadArchiveCommand().apply(init))
}

@Generated
class AmazonGlacierUploadArchiveCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.UploadArchiveRequest> {

	var vaultName: String? = null
	var accountId: String? = null
	var archiveDescription: String? = null
	var checksum: String? = null
	var body: java.io.InputStream? = null
	var contentLength: Long? = 0L

	override fun build(): com.amazonaws.services.glacier.model.UploadArchiveRequest {
		val input = com.amazonaws.services.glacier.model.UploadArchiveRequest()
		input.setVaultName(this.vaultName)
		input.setAccountId(this.accountId)
		input.setArchiveDescription(this.archiveDescription)
		input.setChecksum(this.checksum)
		input.setBody(this.body)
		input.setContentLength(this.contentLength)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.uploadArchive(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier upload-archive")
				.argument("vault-name", vaultName)
				.argument("account-id", accountId)
				.argument("archive-description", archiveDescription)
				.argument("checksum", checksum)
				.argument("body", body?.toString())
				.argument("content-length", contentLength?.toString())
	}

}


fun AmazonGlacierFunctions.uploadMultipartPart(init: AmazonGlacierUploadMultipartPartCommand.() -> Unit) {
	this.block.declare(AmazonGlacierUploadMultipartPartCommand().apply(init))
}

@Generated
class AmazonGlacierUploadMultipartPartCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.UploadMultipartPartRequest> {

	var accountId: String? = null
	var vaultName: String? = null
	var uploadId: String? = null
	var checksum: String? = null
	var range: String? = null
	var body: java.io.InputStream? = null

	override fun build(): com.amazonaws.services.glacier.model.UploadMultipartPartRequest {
		val input = com.amazonaws.services.glacier.model.UploadMultipartPartRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		input.setUploadId(this.uploadId)
		input.setChecksum(this.checksum)
		input.setRange(this.range)
		input.setBody(this.body)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.glacier.uploadMultipartPart(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier upload-multipart-part")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("upload-id", uploadId)
				.argument("checksum", checksum)
				.argument("range", range)
				.argument("body", body?.toString())
	}

}
