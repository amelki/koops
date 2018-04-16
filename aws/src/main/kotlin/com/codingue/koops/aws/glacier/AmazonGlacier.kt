
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.glacier

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.glacier.*
import com.amazonaws.services.glacier.model.*

var com.codingue.koops.core.Environment.glacier: AmazonGlacier
	get() {
		var service = this.capabilities["aws-glacier"]
		if (service == null) {
			service = AmazonGlacierClientBuilder.standard().build()
			this.capabilities["aws-glacier"] = service
		}
		return service as AmazonGlacier
	}
	set(glacier) {
		this.capabilities["aws-glacier"] = glacier
	}

@Generated
class AmazonGlacierFunctions(val block: Block)

infix fun <T> AwsContinuation.glacier(init: AmazonGlacierFunctions.() -> T): T {
	return AmazonGlacierFunctions(shell).run(init)
}

			

fun AmazonGlacierFunctions.abortMultipartUpload(init: (AmazonGlacierAbortMultipartUploadCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.AbortMultipartUploadResult {
	return this.block.declare(AmazonGlacierAbortMultipartUploadCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.AbortMultipartUploadResult
}

@Generated
class AmazonGlacierAbortMultipartUploadCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.AbortMultipartUploadRequest, com.amazonaws.services.glacier.model.AbortMultipartUploadResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.AbortMultipartUploadResult {
	  return com.amazonaws.services.glacier.model.AbortMultipartUploadResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.AbortMultipartUploadResult {
		return environment.glacier.abortMultipartUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier abort-multipart-upload")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("upload-id", uploadId)
	}

}


fun AmazonGlacierFunctions.abortVaultLock(init: (AmazonGlacierAbortVaultLockCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.AbortVaultLockResult {
	return this.block.declare(AmazonGlacierAbortVaultLockCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.AbortVaultLockResult
}

@Generated
class AmazonGlacierAbortVaultLockCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.AbortVaultLockRequest, com.amazonaws.services.glacier.model.AbortVaultLockResult> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.AbortVaultLockRequest {
		val input = com.amazonaws.services.glacier.model.AbortVaultLockRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glacier.model.AbortVaultLockResult {
	  return com.amazonaws.services.glacier.model.AbortVaultLockResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.AbortVaultLockResult {
		return environment.glacier.abortVaultLock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier abort-vault-lock")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.addTagsToVault(init: (AmazonGlacierAddTagsToVaultCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.AddTagsToVaultResult {
	return this.block.declare(AmazonGlacierAddTagsToVaultCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.AddTagsToVaultResult
}

@Generated
class AmazonGlacierAddTagsToVaultCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.AddTagsToVaultRequest, com.amazonaws.services.glacier.model.AddTagsToVaultResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.AddTagsToVaultResult {
	  return com.amazonaws.services.glacier.model.AddTagsToVaultResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.AddTagsToVaultResult {
		return environment.glacier.addTagsToVault(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier add-tags-to-vault")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("tags", tags?.toString())
	}

}


fun AmazonGlacierFunctions.completeMultipartUpload(init: (AmazonGlacierCompleteMultipartUploadCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.CompleteMultipartUploadResult {
	return this.block.declare(AmazonGlacierCompleteMultipartUploadCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.CompleteMultipartUploadResult
}

@Generated
class AmazonGlacierCompleteMultipartUploadCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.CompleteMultipartUploadRequest, com.amazonaws.services.glacier.model.CompleteMultipartUploadResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.CompleteMultipartUploadResult {
	  return com.amazonaws.services.glacier.model.CompleteMultipartUploadResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.CompleteMultipartUploadResult {
		return environment.glacier.completeMultipartUpload(build())
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


fun AmazonGlacierFunctions.completeVaultLock(init: (AmazonGlacierCompleteVaultLockCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.CompleteVaultLockResult {
	return this.block.declare(AmazonGlacierCompleteVaultLockCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.CompleteVaultLockResult
}

@Generated
class AmazonGlacierCompleteVaultLockCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.CompleteVaultLockRequest, com.amazonaws.services.glacier.model.CompleteVaultLockResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.CompleteVaultLockResult {
	  return com.amazonaws.services.glacier.model.CompleteVaultLockResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.CompleteVaultLockResult {
		return environment.glacier.completeVaultLock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier complete-vault-lock")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("lock-id", lockId)
	}

}


fun AmazonGlacierFunctions.createVault(init: (AmazonGlacierCreateVaultCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.CreateVaultResult {
	return this.block.declare(AmazonGlacierCreateVaultCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.CreateVaultResult
}

@Generated
class AmazonGlacierCreateVaultCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.CreateVaultRequest, com.amazonaws.services.glacier.model.CreateVaultResult> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.CreateVaultRequest {
		val input = com.amazonaws.services.glacier.model.CreateVaultRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glacier.model.CreateVaultResult {
	  return com.amazonaws.services.glacier.model.CreateVaultResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.CreateVaultResult {
		return environment.glacier.createVault(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier create-vault")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.deleteArchive(init: (AmazonGlacierDeleteArchiveCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.DeleteArchiveResult {
	return this.block.declare(AmazonGlacierDeleteArchiveCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.DeleteArchiveResult
}

@Generated
class AmazonGlacierDeleteArchiveCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.DeleteArchiveRequest, com.amazonaws.services.glacier.model.DeleteArchiveResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.DeleteArchiveResult {
	  return com.amazonaws.services.glacier.model.DeleteArchiveResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.DeleteArchiveResult {
		return environment.glacier.deleteArchive(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier delete-archive")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("archive-id", archiveId)
	}

}


fun AmazonGlacierFunctions.deleteVault(init: (AmazonGlacierDeleteVaultCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.DeleteVaultResult {
	return this.block.declare(AmazonGlacierDeleteVaultCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.DeleteVaultResult
}

@Generated
class AmazonGlacierDeleteVaultCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.DeleteVaultRequest, com.amazonaws.services.glacier.model.DeleteVaultResult> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.DeleteVaultRequest {
		val input = com.amazonaws.services.glacier.model.DeleteVaultRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glacier.model.DeleteVaultResult {
	  return com.amazonaws.services.glacier.model.DeleteVaultResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.DeleteVaultResult {
		return environment.glacier.deleteVault(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier delete-vault")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.deleteVaultAccessPolicy(init: (AmazonGlacierDeleteVaultAccessPolicyCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyResult {
	return this.block.declare(AmazonGlacierDeleteVaultAccessPolicyCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyResult
}

@Generated
class AmazonGlacierDeleteVaultAccessPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyRequest, com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyResult> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyRequest {
		val input = com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyResult {
	  return com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyResult {
		return environment.glacier.deleteVaultAccessPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier delete-vault-access-policy")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.deleteVaultNotifications(init: (AmazonGlacierDeleteVaultNotificationsCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.DeleteVaultNotificationsResult {
	return this.block.declare(AmazonGlacierDeleteVaultNotificationsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.DeleteVaultNotificationsResult
}

@Generated
class AmazonGlacierDeleteVaultNotificationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.DeleteVaultNotificationsRequest, com.amazonaws.services.glacier.model.DeleteVaultNotificationsResult> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.DeleteVaultNotificationsRequest {
		val input = com.amazonaws.services.glacier.model.DeleteVaultNotificationsRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glacier.model.DeleteVaultNotificationsResult {
	  return com.amazonaws.services.glacier.model.DeleteVaultNotificationsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.DeleteVaultNotificationsResult {
		return environment.glacier.deleteVaultNotifications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier delete-vault-notifications")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.describeJob(init: (AmazonGlacierDescribeJobCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.DescribeJobResult {
	return this.block.declare(AmazonGlacierDescribeJobCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.DescribeJobResult
}

@Generated
class AmazonGlacierDescribeJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.DescribeJobRequest, com.amazonaws.services.glacier.model.DescribeJobResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.DescribeJobResult {
	  return com.amazonaws.services.glacier.model.DescribeJobResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.DescribeJobResult {
		return environment.glacier.describeJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier describe-job")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("job-id", jobId)
	}

}


fun AmazonGlacierFunctions.describeVault(init: (AmazonGlacierDescribeVaultCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.DescribeVaultResult {
	return this.block.declare(AmazonGlacierDescribeVaultCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.DescribeVaultResult
}

@Generated
class AmazonGlacierDescribeVaultCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.DescribeVaultRequest, com.amazonaws.services.glacier.model.DescribeVaultResult> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.DescribeVaultRequest {
		val input = com.amazonaws.services.glacier.model.DescribeVaultRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glacier.model.DescribeVaultResult {
	  return com.amazonaws.services.glacier.model.DescribeVaultResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.DescribeVaultResult {
		return environment.glacier.describeVault(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier describe-vault")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.getDataRetrievalPolicy(init: (AmazonGlacierGetDataRetrievalPolicyCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.GetDataRetrievalPolicyResult {
	return this.block.declare(AmazonGlacierGetDataRetrievalPolicyCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.GetDataRetrievalPolicyResult
}

@Generated
class AmazonGlacierGetDataRetrievalPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.GetDataRetrievalPolicyRequest, com.amazonaws.services.glacier.model.GetDataRetrievalPolicyResult> {

	var accountId: String? = null

	override fun build(): com.amazonaws.services.glacier.model.GetDataRetrievalPolicyRequest {
		val input = com.amazonaws.services.glacier.model.GetDataRetrievalPolicyRequest()
		input.setAccountId(this.accountId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glacier.model.GetDataRetrievalPolicyResult {
	  return com.amazonaws.services.glacier.model.GetDataRetrievalPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.GetDataRetrievalPolicyResult {
		return environment.glacier.getDataRetrievalPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier get-data-retrieval-policy")
				.argument("account-id", accountId)
	}

}


fun AmazonGlacierFunctions.getJobOutput(init: (AmazonGlacierGetJobOutputCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.GetJobOutputResult {
	return this.block.declare(AmazonGlacierGetJobOutputCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.GetJobOutputResult
}

@Generated
class AmazonGlacierGetJobOutputCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.GetJobOutputRequest, com.amazonaws.services.glacier.model.GetJobOutputResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.GetJobOutputResult {
	  return com.amazonaws.services.glacier.model.GetJobOutputResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.GetJobOutputResult {
		return environment.glacier.getJobOutput(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier get-job-output")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("job-id", jobId)
				.argument("range", range)
	}

}


fun AmazonGlacierFunctions.getVaultAccessPolicy(init: (AmazonGlacierGetVaultAccessPolicyCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.GetVaultAccessPolicyResult {
	return this.block.declare(AmazonGlacierGetVaultAccessPolicyCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.GetVaultAccessPolicyResult
}

@Generated
class AmazonGlacierGetVaultAccessPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.GetVaultAccessPolicyRequest, com.amazonaws.services.glacier.model.GetVaultAccessPolicyResult> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.GetVaultAccessPolicyRequest {
		val input = com.amazonaws.services.glacier.model.GetVaultAccessPolicyRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glacier.model.GetVaultAccessPolicyResult {
	  return com.amazonaws.services.glacier.model.GetVaultAccessPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.GetVaultAccessPolicyResult {
		return environment.glacier.getVaultAccessPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier get-vault-access-policy")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.getVaultLock(init: (AmazonGlacierGetVaultLockCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.GetVaultLockResult {
	return this.block.declare(AmazonGlacierGetVaultLockCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.GetVaultLockResult
}

@Generated
class AmazonGlacierGetVaultLockCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.GetVaultLockRequest, com.amazonaws.services.glacier.model.GetVaultLockResult> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.GetVaultLockRequest {
		val input = com.amazonaws.services.glacier.model.GetVaultLockRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glacier.model.GetVaultLockResult {
	  return com.amazonaws.services.glacier.model.GetVaultLockResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.GetVaultLockResult {
		return environment.glacier.getVaultLock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier get-vault-lock")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.getVaultNotifications(init: (AmazonGlacierGetVaultNotificationsCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.GetVaultNotificationsResult {
	return this.block.declare(AmazonGlacierGetVaultNotificationsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.GetVaultNotificationsResult
}

@Generated
class AmazonGlacierGetVaultNotificationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.GetVaultNotificationsRequest, com.amazonaws.services.glacier.model.GetVaultNotificationsResult> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.GetVaultNotificationsRequest {
		val input = com.amazonaws.services.glacier.model.GetVaultNotificationsRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glacier.model.GetVaultNotificationsResult {
	  return com.amazonaws.services.glacier.model.GetVaultNotificationsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.GetVaultNotificationsResult {
		return environment.glacier.getVaultNotifications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier get-vault-notifications")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.initiateJob(init: (AmazonGlacierInitiateJobCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.InitiateJobResult {
	return this.block.declare(AmazonGlacierInitiateJobCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.InitiateJobResult
}

@Generated
class AmazonGlacierInitiateJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.InitiateJobRequest, com.amazonaws.services.glacier.model.InitiateJobResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.InitiateJobResult {
	  return com.amazonaws.services.glacier.model.InitiateJobResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.InitiateJobResult {
		return environment.glacier.initiateJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier initiate-job")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("job-parameters", jobParameters?.toString())
	}

}


fun AmazonGlacierFunctions.initiateMultipartUpload(init: (AmazonGlacierInitiateMultipartUploadCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.InitiateMultipartUploadResult {
	return this.block.declare(AmazonGlacierInitiateMultipartUploadCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.InitiateMultipartUploadResult
}

@Generated
class AmazonGlacierInitiateMultipartUploadCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.InitiateMultipartUploadRequest, com.amazonaws.services.glacier.model.InitiateMultipartUploadResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.InitiateMultipartUploadResult {
	  return com.amazonaws.services.glacier.model.InitiateMultipartUploadResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.InitiateMultipartUploadResult {
		return environment.glacier.initiateMultipartUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier initiate-multipart-upload")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("archive-description", archiveDescription)
				.argument("part-size", partSize)
	}

}


fun AmazonGlacierFunctions.initiateVaultLock(init: (AmazonGlacierInitiateVaultLockCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.InitiateVaultLockResult {
	return this.block.declare(AmazonGlacierInitiateVaultLockCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.InitiateVaultLockResult
}

@Generated
class AmazonGlacierInitiateVaultLockCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.InitiateVaultLockRequest, com.amazonaws.services.glacier.model.InitiateVaultLockResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.InitiateVaultLockResult {
	  return com.amazonaws.services.glacier.model.InitiateVaultLockResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.InitiateVaultLockResult {
		return environment.glacier.initiateVaultLock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier initiate-vault-lock")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("policy", policy?.toString())
	}

}


fun AmazonGlacierFunctions.listJobs(init: (AmazonGlacierListJobsCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.ListJobsResult {
	return this.block.declare(AmazonGlacierListJobsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.ListJobsResult
}

@Generated
class AmazonGlacierListJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.ListJobsRequest, com.amazonaws.services.glacier.model.ListJobsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.ListJobsResult {
	  return com.amazonaws.services.glacier.model.ListJobsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.ListJobsResult {
		return environment.glacier.listJobs(build())
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


fun AmazonGlacierFunctions.listMultipartUploads(init: (AmazonGlacierListMultipartUploadsCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.ListMultipartUploadsResult {
	return this.block.declare(AmazonGlacierListMultipartUploadsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.ListMultipartUploadsResult
}

@Generated
class AmazonGlacierListMultipartUploadsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.ListMultipartUploadsRequest, com.amazonaws.services.glacier.model.ListMultipartUploadsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.ListMultipartUploadsResult {
	  return com.amazonaws.services.glacier.model.ListMultipartUploadsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.ListMultipartUploadsResult {
		return environment.glacier.listMultipartUploads(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier list-multipart-uploads")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("limit", limit)
				.argument("upload-id-marker", uploadIdMarker)
	}

}


fun AmazonGlacierFunctions.listParts(init: (AmazonGlacierListPartsCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.ListPartsResult {
	return this.block.declare(AmazonGlacierListPartsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.ListPartsResult
}

@Generated
class AmazonGlacierListPartsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.ListPartsRequest, com.amazonaws.services.glacier.model.ListPartsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.ListPartsResult {
	  return com.amazonaws.services.glacier.model.ListPartsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.ListPartsResult {
		return environment.glacier.listParts(build())
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


fun AmazonGlacierFunctions.listProvisionedCapacity(init: (AmazonGlacierListProvisionedCapacityCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.ListProvisionedCapacityResult {
	return this.block.declare(AmazonGlacierListProvisionedCapacityCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.ListProvisionedCapacityResult
}

@Generated
class AmazonGlacierListProvisionedCapacityCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.ListProvisionedCapacityRequest, com.amazonaws.services.glacier.model.ListProvisionedCapacityResult> {

	var accountId: String? = null

	override fun build(): com.amazonaws.services.glacier.model.ListProvisionedCapacityRequest {
		val input = com.amazonaws.services.glacier.model.ListProvisionedCapacityRequest()
		input.setAccountId(this.accountId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glacier.model.ListProvisionedCapacityResult {
	  return com.amazonaws.services.glacier.model.ListProvisionedCapacityResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.ListProvisionedCapacityResult {
		return environment.glacier.listProvisionedCapacity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier list-provisioned-capacity")
				.argument("account-id", accountId)
	}

}


fun AmazonGlacierFunctions.listTagsForVault(init: (AmazonGlacierListTagsForVaultCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.ListTagsForVaultResult {
	return this.block.declare(AmazonGlacierListTagsForVaultCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.ListTagsForVaultResult
}

@Generated
class AmazonGlacierListTagsForVaultCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.ListTagsForVaultRequest, com.amazonaws.services.glacier.model.ListTagsForVaultResult> {

	var accountId: String? = null
	var vaultName: String? = null

	override fun build(): com.amazonaws.services.glacier.model.ListTagsForVaultRequest {
		val input = com.amazonaws.services.glacier.model.ListTagsForVaultRequest()
		input.setAccountId(this.accountId)
		input.setVaultName(this.vaultName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glacier.model.ListTagsForVaultResult {
	  return com.amazonaws.services.glacier.model.ListTagsForVaultResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.ListTagsForVaultResult {
		return environment.glacier.listTagsForVault(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier list-tags-for-vault")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
	}

}


fun AmazonGlacierFunctions.listVaults(init: (AmazonGlacierListVaultsCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.ListVaultsResult {
	return this.block.declare(AmazonGlacierListVaultsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.ListVaultsResult
}

@Generated
class AmazonGlacierListVaultsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.ListVaultsRequest, com.amazonaws.services.glacier.model.ListVaultsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.ListVaultsResult {
	  return com.amazonaws.services.glacier.model.ListVaultsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.ListVaultsResult {
		return environment.glacier.listVaults(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier list-vaults")
				.argument("account-id", accountId)
				.argument("marker", marker)
				.argument("limit", limit)
	}

}


fun AmazonGlacierFunctions.purchaseProvisionedCapacity(init: (AmazonGlacierPurchaseProvisionedCapacityCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityResult {
	return this.block.declare(AmazonGlacierPurchaseProvisionedCapacityCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityResult
}

@Generated
class AmazonGlacierPurchaseProvisionedCapacityCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityRequest, com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityResult> {

	var accountId: String? = null

	override fun build(): com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityRequest {
		val input = com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityRequest()
		input.setAccountId(this.accountId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityResult {
	  return com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityResult {
		return environment.glacier.purchaseProvisionedCapacity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier purchase-provisioned-capacity")
				.argument("account-id", accountId)
	}

}


fun AmazonGlacierFunctions.removeTagsFromVault(init: (AmazonGlacierRemoveTagsFromVaultCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.RemoveTagsFromVaultResult {
	return this.block.declare(AmazonGlacierRemoveTagsFromVaultCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.RemoveTagsFromVaultResult
}

@Generated
class AmazonGlacierRemoveTagsFromVaultCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.RemoveTagsFromVaultRequest, com.amazonaws.services.glacier.model.RemoveTagsFromVaultResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.RemoveTagsFromVaultResult {
	  return com.amazonaws.services.glacier.model.RemoveTagsFromVaultResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.RemoveTagsFromVaultResult {
		return environment.glacier.removeTagsFromVault(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier remove-tags-from-vault")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("tag-keys", tagKeys?.toString())
	}

}


fun AmazonGlacierFunctions.setDataRetrievalPolicy(init: (AmazonGlacierSetDataRetrievalPolicyCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.SetDataRetrievalPolicyResult {
	return this.block.declare(AmazonGlacierSetDataRetrievalPolicyCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.SetDataRetrievalPolicyResult
}

@Generated
class AmazonGlacierSetDataRetrievalPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.SetDataRetrievalPolicyRequest, com.amazonaws.services.glacier.model.SetDataRetrievalPolicyResult> {

	var accountId: String? = null
	var policy: com.amazonaws.services.glacier.model.DataRetrievalPolicy? = null

	override fun build(): com.amazonaws.services.glacier.model.SetDataRetrievalPolicyRequest {
		val input = com.amazonaws.services.glacier.model.SetDataRetrievalPolicyRequest()
		input.setAccountId(this.accountId)
		input.setPolicy(this.policy)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.glacier.model.SetDataRetrievalPolicyResult {
	  return com.amazonaws.services.glacier.model.SetDataRetrievalPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.SetDataRetrievalPolicyResult {
		return environment.glacier.setDataRetrievalPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier set-data-retrieval-policy")
				.argument("account-id", accountId)
				.argument("policy", policy?.toString())
	}

}


fun AmazonGlacierFunctions.setVaultAccessPolicy(init: (AmazonGlacierSetVaultAccessPolicyCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.SetVaultAccessPolicyResult {
	return this.block.declare(AmazonGlacierSetVaultAccessPolicyCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.SetVaultAccessPolicyResult
}

@Generated
class AmazonGlacierSetVaultAccessPolicyCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.SetVaultAccessPolicyRequest, com.amazonaws.services.glacier.model.SetVaultAccessPolicyResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.SetVaultAccessPolicyResult {
	  return com.amazonaws.services.glacier.model.SetVaultAccessPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.SetVaultAccessPolicyResult {
		return environment.glacier.setVaultAccessPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier set-vault-access-policy")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("policy", policy?.toString())
	}

}


fun AmazonGlacierFunctions.setVaultNotifications(init: (AmazonGlacierSetVaultNotificationsCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.SetVaultNotificationsResult {
	return this.block.declare(AmazonGlacierSetVaultNotificationsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.SetVaultNotificationsResult
}

@Generated
class AmazonGlacierSetVaultNotificationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.SetVaultNotificationsRequest, com.amazonaws.services.glacier.model.SetVaultNotificationsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.SetVaultNotificationsResult {
	  return com.amazonaws.services.glacier.model.SetVaultNotificationsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.SetVaultNotificationsResult {
		return environment.glacier.setVaultNotifications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws glacier set-vault-notifications")
				.argument("account-id", accountId)
				.argument("vault-name", vaultName)
				.argument("vault-notification-config", vaultNotificationConfig?.toString())
	}

}


fun AmazonGlacierFunctions.uploadArchive(init: (AmazonGlacierUploadArchiveCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.UploadArchiveResult {
	return this.block.declare(AmazonGlacierUploadArchiveCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.UploadArchiveResult
}

@Generated
class AmazonGlacierUploadArchiveCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.UploadArchiveRequest, com.amazonaws.services.glacier.model.UploadArchiveResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.UploadArchiveResult {
	  return com.amazonaws.services.glacier.model.UploadArchiveResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.UploadArchiveResult {
		return environment.glacier.uploadArchive(build())
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


fun AmazonGlacierFunctions.uploadMultipartPart(init: (AmazonGlacierUploadMultipartPartCommand.() -> Unit)? = null): com.amazonaws.services.glacier.model.UploadMultipartPartResult {
	return this.block.declare(AmazonGlacierUploadMultipartPartCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.glacier.model.UploadMultipartPartResult
}

@Generated
class AmazonGlacierUploadMultipartPartCommand() : AmazonWebServiceCommand<com.amazonaws.services.glacier.model.UploadMultipartPartRequest, com.amazonaws.services.glacier.model.UploadMultipartPartResult> {

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

	
	override fun dryResult(): com.amazonaws.services.glacier.model.UploadMultipartPartResult {
	  return com.amazonaws.services.glacier.model.UploadMultipartPartResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.glacier.model.UploadMultipartPartResult {
		return environment.glacier.uploadMultipartPart(build())
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
