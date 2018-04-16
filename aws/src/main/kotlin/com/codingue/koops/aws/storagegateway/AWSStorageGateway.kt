
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.storagegateway

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.storagegateway.*
import com.amazonaws.services.storagegateway.model.*

var com.codingue.koops.core.Environment.storagegateway: AWSStorageGateway
	get() {
		var service = this.capabilities["aws-storagegateway"]
		if (service == null) {
			service = AWSStorageGatewayClientBuilder.standard().build()
			this.capabilities["aws-storagegateway"] = service
		}
		return service as AWSStorageGateway
	}
	set(storagegateway) {
		this.capabilities["aws-storagegateway"] = storagegateway
	}

@Generated
class AWSStorageGatewayFunctions(val block: Block)

infix fun <T> AwsContinuation.storagegateway(init: AWSStorageGatewayFunctions.() -> T): T {
	return AWSStorageGatewayFunctions(shell).run(init)
}

			

fun AWSStorageGatewayFunctions.activateGateway(activationKey: String, gatewayName: String, gatewayTimezone: String, gatewayRegion: String, init: (AWSStorageGatewayActivateGatewayCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.ActivateGatewayResult {
	return this.block.declare(AWSStorageGatewayActivateGatewayCommand(activationKey, gatewayName, gatewayTimezone, gatewayRegion).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.ActivateGatewayResult
}

@Generated
class AWSStorageGatewayActivateGatewayCommand(val activationKey: String, val gatewayName: String, val gatewayTimezone: String, val gatewayRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ActivateGatewayRequest, com.amazonaws.services.storagegateway.model.ActivateGatewayResult> {

	var gatewayType: String? = null
	var tapeDriveType: String? = null
	var mediumChangerType: String? = null

	override fun build(): com.amazonaws.services.storagegateway.model.ActivateGatewayRequest {
		val input = com.amazonaws.services.storagegateway.model.ActivateGatewayRequest()
		input.setActivationKey(this.activationKey)
		input.setGatewayName(this.gatewayName)
		input.setGatewayTimezone(this.gatewayTimezone)
		input.setGatewayRegion(this.gatewayRegion)
		input.setGatewayType(this.gatewayType)
		input.setTapeDriveType(this.tapeDriveType)
		input.setMediumChangerType(this.mediumChangerType)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.ActivateGatewayResult {
	  return com.amazonaws.services.storagegateway.model.ActivateGatewayResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.ActivateGatewayResult {
		return environment.storagegateway.activateGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway activate-gateway")
				.argument("activation-key", activationKey)
				.argument("gateway-name", gatewayName)
				.argument("gateway-timezone", gatewayTimezone)
				.argument("gateway-region", gatewayRegion)
				.argument("gateway-type", gatewayType)
				.argument("tape-drive-type", tapeDriveType)
				.argument("medium-changer-type", mediumChangerType)
	}

}


fun AWSStorageGatewayFunctions.addCache(gatewayARN: String, diskIds: List<String>, init: (AWSStorageGatewayAddCacheCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.AddCacheResult {
	return this.block.declare(AWSStorageGatewayAddCacheCommand(gatewayARN, diskIds).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.AddCacheResult
}

@Generated
class AWSStorageGatewayAddCacheCommand(val gatewayARN: String, val diskIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.AddCacheRequest, com.amazonaws.services.storagegateway.model.AddCacheResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.AddCacheRequest {
		val input = com.amazonaws.services.storagegateway.model.AddCacheRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setDiskIds(this.diskIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.AddCacheResult {
	  return com.amazonaws.services.storagegateway.model.AddCacheResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.AddCacheResult {
		return environment.storagegateway.addCache(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway add-cache")
				.argument("gateway-arn", gatewayARN)
				.argument("disk-ids", diskIds.toString())
	}

}


fun AWSStorageGatewayFunctions.addTagsToResource(resourceARN: String, tags: List<com.amazonaws.services.storagegateway.model.Tag>, init: (AWSStorageGatewayAddTagsToResourceCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.AddTagsToResourceResult {
	return this.block.declare(AWSStorageGatewayAddTagsToResourceCommand(resourceARN, tags).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.AddTagsToResourceResult
}

@Generated
class AWSStorageGatewayAddTagsToResourceCommand(val resourceARN: String, val tags: List<com.amazonaws.services.storagegateway.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.AddTagsToResourceRequest, com.amazonaws.services.storagegateway.model.AddTagsToResourceResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.AddTagsToResourceRequest {
		val input = com.amazonaws.services.storagegateway.model.AddTagsToResourceRequest()
		input.setResourceARN(this.resourceARN)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.AddTagsToResourceResult {
	  return com.amazonaws.services.storagegateway.model.AddTagsToResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.AddTagsToResourceResult {
		return environment.storagegateway.addTagsToResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway add-tags-to-resource")
				.argument("resource-arn", resourceARN)
				.argument("tags", tags.toString())
	}

}


fun AWSStorageGatewayFunctions.addUploadBuffer(gatewayARN: String, diskIds: List<String>, init: (AWSStorageGatewayAddUploadBufferCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.AddUploadBufferResult {
	return this.block.declare(AWSStorageGatewayAddUploadBufferCommand(gatewayARN, diskIds).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.AddUploadBufferResult
}

@Generated
class AWSStorageGatewayAddUploadBufferCommand(val gatewayARN: String, val diskIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.AddUploadBufferRequest, com.amazonaws.services.storagegateway.model.AddUploadBufferResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.AddUploadBufferRequest {
		val input = com.amazonaws.services.storagegateway.model.AddUploadBufferRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setDiskIds(this.diskIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.AddUploadBufferResult {
	  return com.amazonaws.services.storagegateway.model.AddUploadBufferResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.AddUploadBufferResult {
		return environment.storagegateway.addUploadBuffer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway add-upload-buffer")
				.argument("gateway-arn", gatewayARN)
				.argument("disk-ids", diskIds.toString())
	}

}


fun AWSStorageGatewayFunctions.addWorkingStorage(gatewayARN: String, diskIds: List<String>, init: (AWSStorageGatewayAddWorkingStorageCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.AddWorkingStorageResult {
	return this.block.declare(AWSStorageGatewayAddWorkingStorageCommand(gatewayARN, diskIds).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.AddWorkingStorageResult
}

@Generated
class AWSStorageGatewayAddWorkingStorageCommand(val gatewayARN: String, val diskIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.AddWorkingStorageRequest, com.amazonaws.services.storagegateway.model.AddWorkingStorageResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.AddWorkingStorageRequest {
		val input = com.amazonaws.services.storagegateway.model.AddWorkingStorageRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setDiskIds(this.diskIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.AddWorkingStorageResult {
	  return com.amazonaws.services.storagegateway.model.AddWorkingStorageResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.AddWorkingStorageResult {
		return environment.storagegateway.addWorkingStorage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway add-working-storage")
				.argument("gateway-arn", gatewayARN)
				.argument("disk-ids", diskIds.toString())
	}

}


fun AWSStorageGatewayFunctions.cancelArchival(gatewayARN: String, tapeARN: String, init: (AWSStorageGatewayCancelArchivalCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.CancelArchivalResult {
	return this.block.declare(AWSStorageGatewayCancelArchivalCommand(gatewayARN, tapeARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.CancelArchivalResult
}

@Generated
class AWSStorageGatewayCancelArchivalCommand(val gatewayARN: String, val tapeARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CancelArchivalRequest, com.amazonaws.services.storagegateway.model.CancelArchivalResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.CancelArchivalRequest {
		val input = com.amazonaws.services.storagegateway.model.CancelArchivalRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setTapeARN(this.tapeARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.CancelArchivalResult {
	  return com.amazonaws.services.storagegateway.model.CancelArchivalResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.CancelArchivalResult {
		return environment.storagegateway.cancelArchival(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway cancel-archival")
				.argument("gateway-arn", gatewayARN)
				.argument("tape-arn", tapeARN)
	}

}


fun AWSStorageGatewayFunctions.cancelRetrieval(gatewayARN: String, tapeARN: String, init: (AWSStorageGatewayCancelRetrievalCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.CancelRetrievalResult {
	return this.block.declare(AWSStorageGatewayCancelRetrievalCommand(gatewayARN, tapeARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.CancelRetrievalResult
}

@Generated
class AWSStorageGatewayCancelRetrievalCommand(val gatewayARN: String, val tapeARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CancelRetrievalRequest, com.amazonaws.services.storagegateway.model.CancelRetrievalResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.CancelRetrievalRequest {
		val input = com.amazonaws.services.storagegateway.model.CancelRetrievalRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setTapeARN(this.tapeARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.CancelRetrievalResult {
	  return com.amazonaws.services.storagegateway.model.CancelRetrievalResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.CancelRetrievalResult {
		return environment.storagegateway.cancelRetrieval(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway cancel-retrieval")
				.argument("gateway-arn", gatewayARN)
				.argument("tape-arn", tapeARN)
	}

}


fun AWSStorageGatewayFunctions.createCachediSCSIVolume(gatewayARN: String, volumeSizeInBytes: Long, targetName: String, networkInterfaceId: String, clientToken: String, init: (AWSStorageGatewayCreateCachediSCSIVolumeCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeResult {
	return this.block.declare(AWSStorageGatewayCreateCachediSCSIVolumeCommand(gatewayARN, volumeSizeInBytes, targetName, networkInterfaceId, clientToken).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeResult
}

@Generated
class AWSStorageGatewayCreateCachediSCSIVolumeCommand(val gatewayARN: String, val volumeSizeInBytes: Long, val targetName: String, val networkInterfaceId: String, val clientToken: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeRequest, com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeResult> {

	var snapshotId: String? = null
	var sourceVolumeARN: String? = null

	override fun build(): com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeRequest {
		val input = com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setVolumeSizeInBytes(this.volumeSizeInBytes)
		input.setSnapshotId(this.snapshotId)
		input.setTargetName(this.targetName)
		input.setSourceVolumeARN(this.sourceVolumeARN)
		input.setNetworkInterfaceId(this.networkInterfaceId)
		input.setClientToken(this.clientToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeResult {
	  return com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeResult {
		return environment.storagegateway.createCachediSCSIVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway create-cachedi-scsivolume")
				.argument("gateway-arn", gatewayARN)
				.argument("volume-size-in-bytes", volumeSizeInBytes.toString())
				.argument("snapshot-id", snapshotId)
				.argument("target-name", targetName)
				.argument("source-volume-arn", sourceVolumeARN)
				.argument("network-interface-id", networkInterfaceId)
				.argument("client-token", clientToken)
	}

}


fun AWSStorageGatewayFunctions.createNFSFileShare(clientToken: String, gatewayARN: String, role: String, locationARN: String, init: (AWSStorageGatewayCreateNFSFileShareCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.CreateNFSFileShareResult {
	return this.block.declare(AWSStorageGatewayCreateNFSFileShareCommand(clientToken, gatewayARN, role, locationARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.CreateNFSFileShareResult
}

@Generated
class AWSStorageGatewayCreateNFSFileShareCommand(val clientToken: String, val gatewayARN: String, val role: String, val locationARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CreateNFSFileShareRequest, com.amazonaws.services.storagegateway.model.CreateNFSFileShareResult> {

	var nFSFileShareDefaults: com.amazonaws.services.storagegateway.model.NFSFileShareDefaults? = null
	var kMSEncrypted: Boolean? = false
	var kMSKey: String? = null
	var defaultStorageClass: String? = null
	var objectACL: ObjectACL? = null
	var clientList: List<String>? = null
	var squash: String? = null
	var readOnly: Boolean? = false
	var guessMIMETypeEnabled: Boolean? = false
	var requesterPays: Boolean? = false

	override fun build(): com.amazonaws.services.storagegateway.model.CreateNFSFileShareRequest {
		val input = com.amazonaws.services.storagegateway.model.CreateNFSFileShareRequest()
		input.setClientToken(this.clientToken)
		input.setNFSFileShareDefaults(this.nFSFileShareDefaults)
		input.setGatewayARN(this.gatewayARN)
		input.setKMSEncrypted(this.kMSEncrypted)
		input.setKMSKey(this.kMSKey)
		input.setRole(this.role)
		input.setLocationARN(this.locationARN)
		input.setDefaultStorageClass(this.defaultStorageClass)
		input.setObjectACL(this.objectACL?.toString())
		input.setClientList(this.clientList)
		input.setSquash(this.squash)
		input.setReadOnly(this.readOnly)
		input.setGuessMIMETypeEnabled(this.guessMIMETypeEnabled)
		input.setRequesterPays(this.requesterPays)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.CreateNFSFileShareResult {
	  return com.amazonaws.services.storagegateway.model.CreateNFSFileShareResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.CreateNFSFileShareResult {
		return environment.storagegateway.createNFSFileShare(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway create-nfsfile-share")
				.argument("client-token", clientToken)
				.argument("nfsfile-share-defaults", nFSFileShareDefaults?.toString())
				.argument("gateway-arn", gatewayARN)
				.option("kmsencrypted", kMSEncrypted ?: false)
				.argument("kmskey", kMSKey)
				.argument("role", role)
				.argument("location-arn", locationARN)
				.argument("default-storage-class", defaultStorageClass)
				.argument("object-acl", objectACL?.toString())
				.argument("client-list", clientList?.toString())
				.argument("squash", squash)
				.option("read-only", readOnly ?: false)
				.option("guess-mimetype-enabled", guessMIMETypeEnabled ?: false)
				.option("requester-pays", requesterPays ?: false)
	}

}


fun AWSStorageGatewayFunctions.createSnapshot(volumeARN: String, snapshotDescription: String, init: (AWSStorageGatewayCreateSnapshotCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.CreateSnapshotResult {
	return this.block.declare(AWSStorageGatewayCreateSnapshotCommand(volumeARN, snapshotDescription).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.CreateSnapshotResult
}

@Generated
class AWSStorageGatewayCreateSnapshotCommand(val volumeARN: String, val snapshotDescription: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CreateSnapshotRequest, com.amazonaws.services.storagegateway.model.CreateSnapshotResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.CreateSnapshotRequest {
		val input = com.amazonaws.services.storagegateway.model.CreateSnapshotRequest()
		input.setVolumeARN(this.volumeARN)
		input.setSnapshotDescription(this.snapshotDescription)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.CreateSnapshotResult {
	  return com.amazonaws.services.storagegateway.model.CreateSnapshotResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.CreateSnapshotResult {
		return environment.storagegateway.createSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway create-snapshot")
				.argument("volume-arn", volumeARN)
				.argument("snapshot-description", snapshotDescription)
	}

}


fun AWSStorageGatewayFunctions.createSnapshotFromVolumeRecoveryPoint(volumeARN: String, snapshotDescription: String, init: (AWSStorageGatewayCreateSnapshotFromVolumeRecoveryPointCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointResult {
	return this.block.declare(AWSStorageGatewayCreateSnapshotFromVolumeRecoveryPointCommand(volumeARN, snapshotDescription).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointResult
}

@Generated
class AWSStorageGatewayCreateSnapshotFromVolumeRecoveryPointCommand(val volumeARN: String, val snapshotDescription: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointRequest, com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointRequest {
		val input = com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointRequest()
		input.setVolumeARN(this.volumeARN)
		input.setSnapshotDescription(this.snapshotDescription)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointResult {
	  return com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointResult {
		return environment.storagegateway.createSnapshotFromVolumeRecoveryPoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway create-snapshot-from-volume-recovery-point")
				.argument("volume-arn", volumeARN)
				.argument("snapshot-description", snapshotDescription)
	}

}


fun AWSStorageGatewayFunctions.createStorediSCSIVolume(gatewayARN: String, diskId: String, preserveExistingData: Boolean, targetName: String, networkInterfaceId: String, init: (AWSStorageGatewayCreateStorediSCSIVolumeCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeResult {
	return this.block.declare(AWSStorageGatewayCreateStorediSCSIVolumeCommand(gatewayARN, diskId, preserveExistingData, targetName, networkInterfaceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeResult
}

@Generated
class AWSStorageGatewayCreateStorediSCSIVolumeCommand(val gatewayARN: String, val diskId: String, val preserveExistingData: Boolean, val targetName: String, val networkInterfaceId: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeRequest, com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeResult> {

	var snapshotId: String? = null

	override fun build(): com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeRequest {
		val input = com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setDiskId(this.diskId)
		input.setSnapshotId(this.snapshotId)
		input.setPreserveExistingData(this.preserveExistingData)
		input.setTargetName(this.targetName)
		input.setNetworkInterfaceId(this.networkInterfaceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeResult {
	  return com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeResult {
		return environment.storagegateway.createStorediSCSIVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway create-storedi-scsivolume")
				.argument("gateway-arn", gatewayARN)
				.argument("disk-id", diskId)
				.argument("snapshot-id", snapshotId)
				.option("preserve-existing-data", preserveExistingData ?: false)
				.argument("target-name", targetName)
				.argument("network-interface-id", networkInterfaceId)
	}

}


fun AWSStorageGatewayFunctions.createTapeWithBarcode(gatewayARN: String, tapeSizeInBytes: Long, tapeBarcode: String, init: (AWSStorageGatewayCreateTapeWithBarcodeCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeResult {
	return this.block.declare(AWSStorageGatewayCreateTapeWithBarcodeCommand(gatewayARN, tapeSizeInBytes, tapeBarcode).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeResult
}

@Generated
class AWSStorageGatewayCreateTapeWithBarcodeCommand(val gatewayARN: String, val tapeSizeInBytes: Long, val tapeBarcode: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeRequest, com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeRequest {
		val input = com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setTapeSizeInBytes(this.tapeSizeInBytes)
		input.setTapeBarcode(this.tapeBarcode)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeResult {
	  return com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeResult {
		return environment.storagegateway.createTapeWithBarcode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway create-tape-with-barcode")
				.argument("gateway-arn", gatewayARN)
				.argument("tape-size-in-bytes", tapeSizeInBytes.toString())
				.argument("tape-barcode", tapeBarcode)
	}

}


fun AWSStorageGatewayFunctions.createTapes(gatewayARN: String, tapeSizeInBytes: Long, clientToken: String, numTapesToCreate: Int, tapeBarcodePrefix: String, init: (AWSStorageGatewayCreateTapesCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.CreateTapesResult {
	return this.block.declare(AWSStorageGatewayCreateTapesCommand(gatewayARN, tapeSizeInBytes, clientToken, numTapesToCreate, tapeBarcodePrefix).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.CreateTapesResult
}

@Generated
class AWSStorageGatewayCreateTapesCommand(val gatewayARN: String, val tapeSizeInBytes: Long, val clientToken: String, val numTapesToCreate: Int, val tapeBarcodePrefix: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CreateTapesRequest, com.amazonaws.services.storagegateway.model.CreateTapesResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.CreateTapesRequest {
		val input = com.amazonaws.services.storagegateway.model.CreateTapesRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setTapeSizeInBytes(this.tapeSizeInBytes)
		input.setClientToken(this.clientToken)
		input.setNumTapesToCreate(this.numTapesToCreate)
		input.setTapeBarcodePrefix(this.tapeBarcodePrefix)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.CreateTapesResult {
	  return com.amazonaws.services.storagegateway.model.CreateTapesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.CreateTapesResult {
		return environment.storagegateway.createTapes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway create-tapes")
				.argument("gateway-arn", gatewayARN)
				.argument("tape-size-in-bytes", tapeSizeInBytes.toString())
				.argument("client-token", clientToken)
				.argument("num-tapes-to-create", numTapesToCreate.toString())
				.argument("tape-barcode-prefix", tapeBarcodePrefix)
	}

}


fun AWSStorageGatewayFunctions.deleteBandwidthRateLimit(gatewayARN: String, bandwidthType: String, init: (AWSStorageGatewayDeleteBandwidthRateLimitCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitResult {
	return this.block.declare(AWSStorageGatewayDeleteBandwidthRateLimitCommand(gatewayARN, bandwidthType).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitResult
}

@Generated
class AWSStorageGatewayDeleteBandwidthRateLimitCommand(val gatewayARN: String, val bandwidthType: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitRequest, com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitRequest {
		val input = com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setBandwidthType(this.bandwidthType)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitResult {
	  return com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitResult {
		return environment.storagegateway.deleteBandwidthRateLimit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway delete-bandwidth-rate-limit")
				.argument("gateway-arn", gatewayARN)
				.argument("bandwidth-type", bandwidthType)
	}

}


fun AWSStorageGatewayFunctions.deleteChapCredentials(targetARN: String, initiatorName: String, init: (AWSStorageGatewayDeleteChapCredentialsCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DeleteChapCredentialsResult {
	return this.block.declare(AWSStorageGatewayDeleteChapCredentialsCommand(targetARN, initiatorName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DeleteChapCredentialsResult
}

@Generated
class AWSStorageGatewayDeleteChapCredentialsCommand(val targetARN: String, val initiatorName: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DeleteChapCredentialsRequest, com.amazonaws.services.storagegateway.model.DeleteChapCredentialsResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DeleteChapCredentialsRequest {
		val input = com.amazonaws.services.storagegateway.model.DeleteChapCredentialsRequest()
		input.setTargetARN(this.targetARN)
		input.setInitiatorName(this.initiatorName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DeleteChapCredentialsResult {
	  return com.amazonaws.services.storagegateway.model.DeleteChapCredentialsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DeleteChapCredentialsResult {
		return environment.storagegateway.deleteChapCredentials(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway delete-chap-credentials")
				.argument("target-arn", targetARN)
				.argument("initiator-name", initiatorName)
	}

}


fun AWSStorageGatewayFunctions.deleteFileShare(fileShareARN: String, init: (AWSStorageGatewayDeleteFileShareCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DeleteFileShareResult {
	return this.block.declare(AWSStorageGatewayDeleteFileShareCommand(fileShareARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DeleteFileShareResult
}

@Generated
class AWSStorageGatewayDeleteFileShareCommand(val fileShareARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DeleteFileShareRequest, com.amazonaws.services.storagegateway.model.DeleteFileShareResult> {

	var forceDelete: Boolean? = false

	override fun build(): com.amazonaws.services.storagegateway.model.DeleteFileShareRequest {
		val input = com.amazonaws.services.storagegateway.model.DeleteFileShareRequest()
		input.setFileShareARN(this.fileShareARN)
		input.setForceDelete(this.forceDelete)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DeleteFileShareResult {
	  return com.amazonaws.services.storagegateway.model.DeleteFileShareResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DeleteFileShareResult {
		return environment.storagegateway.deleteFileShare(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway delete-file-share")
				.argument("file-share-arn", fileShareARN)
				.option("force-delete", forceDelete ?: false)
	}

}


fun AWSStorageGatewayFunctions.deleteGateway(gatewayARN: String, init: (AWSStorageGatewayDeleteGatewayCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DeleteGatewayResult {
	return this.block.declare(AWSStorageGatewayDeleteGatewayCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DeleteGatewayResult
}

@Generated
class AWSStorageGatewayDeleteGatewayCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DeleteGatewayRequest, com.amazonaws.services.storagegateway.model.DeleteGatewayResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DeleteGatewayRequest {
		val input = com.amazonaws.services.storagegateway.model.DeleteGatewayRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DeleteGatewayResult {
	  return com.amazonaws.services.storagegateway.model.DeleteGatewayResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DeleteGatewayResult {
		return environment.storagegateway.deleteGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway delete-gateway")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.deleteSnapshotSchedule(volumeARN: String, init: (AWSStorageGatewayDeleteSnapshotScheduleCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleResult {
	return this.block.declare(AWSStorageGatewayDeleteSnapshotScheduleCommand(volumeARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleResult
}

@Generated
class AWSStorageGatewayDeleteSnapshotScheduleCommand(val volumeARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleRequest, com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleRequest {
		val input = com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleRequest()
		input.setVolumeARN(this.volumeARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleResult {
	  return com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleResult {
		return environment.storagegateway.deleteSnapshotSchedule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway delete-snapshot-schedule")
				.argument("volume-arn", volumeARN)
	}

}


fun AWSStorageGatewayFunctions.deleteTape(gatewayARN: String, tapeARN: String, init: (AWSStorageGatewayDeleteTapeCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DeleteTapeResult {
	return this.block.declare(AWSStorageGatewayDeleteTapeCommand(gatewayARN, tapeARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DeleteTapeResult
}

@Generated
class AWSStorageGatewayDeleteTapeCommand(val gatewayARN: String, val tapeARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DeleteTapeRequest, com.amazonaws.services.storagegateway.model.DeleteTapeResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DeleteTapeRequest {
		val input = com.amazonaws.services.storagegateway.model.DeleteTapeRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setTapeARN(this.tapeARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DeleteTapeResult {
	  return com.amazonaws.services.storagegateway.model.DeleteTapeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DeleteTapeResult {
		return environment.storagegateway.deleteTape(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway delete-tape")
				.argument("gateway-arn", gatewayARN)
				.argument("tape-arn", tapeARN)
	}

}


fun AWSStorageGatewayFunctions.deleteTapeArchive(tapeARN: String, init: (AWSStorageGatewayDeleteTapeArchiveCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DeleteTapeArchiveResult {
	return this.block.declare(AWSStorageGatewayDeleteTapeArchiveCommand(tapeARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DeleteTapeArchiveResult
}

@Generated
class AWSStorageGatewayDeleteTapeArchiveCommand(val tapeARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DeleteTapeArchiveRequest, com.amazonaws.services.storagegateway.model.DeleteTapeArchiveResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DeleteTapeArchiveRequest {
		val input = com.amazonaws.services.storagegateway.model.DeleteTapeArchiveRequest()
		input.setTapeARN(this.tapeARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DeleteTapeArchiveResult {
	  return com.amazonaws.services.storagegateway.model.DeleteTapeArchiveResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DeleteTapeArchiveResult {
		return environment.storagegateway.deleteTapeArchive(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway delete-tape-archive")
				.argument("tape-arn", tapeARN)
	}

}


fun AWSStorageGatewayFunctions.deleteVolume(volumeARN: String, init: (AWSStorageGatewayDeleteVolumeCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DeleteVolumeResult {
	return this.block.declare(AWSStorageGatewayDeleteVolumeCommand(volumeARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DeleteVolumeResult
}

@Generated
class AWSStorageGatewayDeleteVolumeCommand(val volumeARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DeleteVolumeRequest, com.amazonaws.services.storagegateway.model.DeleteVolumeResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DeleteVolumeRequest {
		val input = com.amazonaws.services.storagegateway.model.DeleteVolumeRequest()
		input.setVolumeARN(this.volumeARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DeleteVolumeResult {
	  return com.amazonaws.services.storagegateway.model.DeleteVolumeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DeleteVolumeResult {
		return environment.storagegateway.deleteVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway delete-volume")
				.argument("volume-arn", volumeARN)
	}

}


fun AWSStorageGatewayFunctions.describeBandwidthRateLimit(gatewayARN: String, init: (AWSStorageGatewayDescribeBandwidthRateLimitCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitResult {
	return this.block.declare(AWSStorageGatewayDescribeBandwidthRateLimitCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitResult
}

@Generated
class AWSStorageGatewayDescribeBandwidthRateLimitCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitRequest, com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitResult {
	  return com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitResult {
		return environment.storagegateway.describeBandwidthRateLimit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-bandwidth-rate-limit")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.describeCache(gatewayARN: String, init: (AWSStorageGatewayDescribeCacheCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DescribeCacheResult {
	return this.block.declare(AWSStorageGatewayDescribeCacheCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DescribeCacheResult
}

@Generated
class AWSStorageGatewayDescribeCacheCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeCacheRequest, com.amazonaws.services.storagegateway.model.DescribeCacheResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeCacheRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeCacheRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DescribeCacheResult {
	  return com.amazonaws.services.storagegateway.model.DescribeCacheResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DescribeCacheResult {
		return environment.storagegateway.describeCache(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-cache")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.describeCachediSCSIVolumes(volumeARNs: List<String>, init: (AWSStorageGatewayDescribeCachediSCSIVolumesCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesResult {
	return this.block.declare(AWSStorageGatewayDescribeCachediSCSIVolumesCommand(volumeARNs).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesResult
}

@Generated
class AWSStorageGatewayDescribeCachediSCSIVolumesCommand(val volumeARNs: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesRequest, com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesRequest()
		input.setVolumeARNs(this.volumeARNs)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesResult {
	  return com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesResult {
		return environment.storagegateway.describeCachediSCSIVolumes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-cachedi-scsivolumes")
				.argument("volume-arns", volumeARNs.toString())
	}

}


fun AWSStorageGatewayFunctions.describeChapCredentials(targetARN: String, init: (AWSStorageGatewayDescribeChapCredentialsCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DescribeChapCredentialsResult {
	return this.block.declare(AWSStorageGatewayDescribeChapCredentialsCommand(targetARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DescribeChapCredentialsResult
}

@Generated
class AWSStorageGatewayDescribeChapCredentialsCommand(val targetARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeChapCredentialsRequest, com.amazonaws.services.storagegateway.model.DescribeChapCredentialsResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeChapCredentialsRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeChapCredentialsRequest()
		input.setTargetARN(this.targetARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DescribeChapCredentialsResult {
	  return com.amazonaws.services.storagegateway.model.DescribeChapCredentialsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DescribeChapCredentialsResult {
		return environment.storagegateway.describeChapCredentials(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-chap-credentials")
				.argument("target-arn", targetARN)
	}

}


fun AWSStorageGatewayFunctions.describeGatewayInformation(gatewayARN: String, init: (AWSStorageGatewayDescribeGatewayInformationCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DescribeGatewayInformationResult {
	return this.block.declare(AWSStorageGatewayDescribeGatewayInformationCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DescribeGatewayInformationResult
}

@Generated
class AWSStorageGatewayDescribeGatewayInformationCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeGatewayInformationRequest, com.amazonaws.services.storagegateway.model.DescribeGatewayInformationResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeGatewayInformationRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeGatewayInformationRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DescribeGatewayInformationResult {
	  return com.amazonaws.services.storagegateway.model.DescribeGatewayInformationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DescribeGatewayInformationResult {
		return environment.storagegateway.describeGatewayInformation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-gateway-information")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.describeMaintenanceStartTime(gatewayARN: String, init: (AWSStorageGatewayDescribeMaintenanceStartTimeCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeResult {
	return this.block.declare(AWSStorageGatewayDescribeMaintenanceStartTimeCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeResult
}

@Generated
class AWSStorageGatewayDescribeMaintenanceStartTimeCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeRequest, com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeResult {
	  return com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeResult {
		return environment.storagegateway.describeMaintenanceStartTime(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-maintenance-start-time")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.describeNFSFileShares(fileShareARNList: List<String>, init: (AWSStorageGatewayDescribeNFSFileSharesCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesResult {
	return this.block.declare(AWSStorageGatewayDescribeNFSFileSharesCommand(fileShareARNList).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesResult
}

@Generated
class AWSStorageGatewayDescribeNFSFileSharesCommand(val fileShareARNList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesRequest, com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesRequest()
		input.setFileShareARNList(this.fileShareARNList)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesResult {
	  return com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesResult {
		return environment.storagegateway.describeNFSFileShares(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-nfsfile-shares")
				.argument("file-share-arnlist", fileShareARNList.toString())
	}

}


fun AWSStorageGatewayFunctions.describeSnapshotSchedule(volumeARN: String, init: (AWSStorageGatewayDescribeSnapshotScheduleCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleResult {
	return this.block.declare(AWSStorageGatewayDescribeSnapshotScheduleCommand(volumeARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleResult
}

@Generated
class AWSStorageGatewayDescribeSnapshotScheduleCommand(val volumeARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleRequest, com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleRequest()
		input.setVolumeARN(this.volumeARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleResult {
	  return com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleResult {
		return environment.storagegateway.describeSnapshotSchedule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-snapshot-schedule")
				.argument("volume-arn", volumeARN)
	}

}


fun AWSStorageGatewayFunctions.describeStorediSCSIVolumes(volumeARNs: List<String>, init: (AWSStorageGatewayDescribeStorediSCSIVolumesCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesResult {
	return this.block.declare(AWSStorageGatewayDescribeStorediSCSIVolumesCommand(volumeARNs).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesResult
}

@Generated
class AWSStorageGatewayDescribeStorediSCSIVolumesCommand(val volumeARNs: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesRequest, com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesRequest()
		input.setVolumeARNs(this.volumeARNs)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesResult {
	  return com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesResult {
		return environment.storagegateway.describeStorediSCSIVolumes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-storedi-scsivolumes")
				.argument("volume-arns", volumeARNs.toString())
	}

}


fun AWSStorageGatewayFunctions.describeTapeArchives(init: (AWSStorageGatewayDescribeTapeArchivesCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DescribeTapeArchivesResult {
	return this.block.declare(AWSStorageGatewayDescribeTapeArchivesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DescribeTapeArchivesResult
}

@Generated
class AWSStorageGatewayDescribeTapeArchivesCommand() : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeTapeArchivesRequest, com.amazonaws.services.storagegateway.model.DescribeTapeArchivesResult> {

	var tapeARNs: List<String>? = null
	var marker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.storagegateway.model.DescribeTapeArchivesRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeTapeArchivesRequest()
		input.setTapeARNs(this.tapeARNs)
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DescribeTapeArchivesResult {
	  return com.amazonaws.services.storagegateway.model.DescribeTapeArchivesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DescribeTapeArchivesResult {
		return environment.storagegateway.describeTapeArchives(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-tape-archives")
				.argument("tape-arns", tapeARNs?.toString())
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AWSStorageGatewayFunctions.describeTapeRecoveryPoints(gatewayARN: String, init: (AWSStorageGatewayDescribeTapeRecoveryPointsCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsResult {
	return this.block.declare(AWSStorageGatewayDescribeTapeRecoveryPointsCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsResult
}

@Generated
class AWSStorageGatewayDescribeTapeRecoveryPointsCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsRequest, com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsResult> {

	var marker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsResult {
	  return com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsResult {
		return environment.storagegateway.describeTapeRecoveryPoints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-tape-recovery-points")
				.argument("gateway-arn", gatewayARN)
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AWSStorageGatewayFunctions.describeTapes(gatewayARN: String, init: (AWSStorageGatewayDescribeTapesCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DescribeTapesResult {
	return this.block.declare(AWSStorageGatewayDescribeTapesCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DescribeTapesResult
}

@Generated
class AWSStorageGatewayDescribeTapesCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeTapesRequest, com.amazonaws.services.storagegateway.model.DescribeTapesResult> {

	var tapeARNs: List<String>? = null
	var marker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.storagegateway.model.DescribeTapesRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeTapesRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setTapeARNs(this.tapeARNs)
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DescribeTapesResult {
	  return com.amazonaws.services.storagegateway.model.DescribeTapesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DescribeTapesResult {
		return environment.storagegateway.describeTapes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-tapes")
				.argument("gateway-arn", gatewayARN)
				.argument("tape-arns", tapeARNs?.toString())
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AWSStorageGatewayFunctions.describeUploadBuffer(gatewayARN: String, init: (AWSStorageGatewayDescribeUploadBufferCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DescribeUploadBufferResult {
	return this.block.declare(AWSStorageGatewayDescribeUploadBufferCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DescribeUploadBufferResult
}

@Generated
class AWSStorageGatewayDescribeUploadBufferCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeUploadBufferRequest, com.amazonaws.services.storagegateway.model.DescribeUploadBufferResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeUploadBufferRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeUploadBufferRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DescribeUploadBufferResult {
	  return com.amazonaws.services.storagegateway.model.DescribeUploadBufferResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DescribeUploadBufferResult {
		return environment.storagegateway.describeUploadBuffer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-upload-buffer")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.describeVTLDevices(gatewayARN: String, init: (AWSStorageGatewayDescribeVTLDevicesCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DescribeVTLDevicesResult {
	return this.block.declare(AWSStorageGatewayDescribeVTLDevicesCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DescribeVTLDevicesResult
}

@Generated
class AWSStorageGatewayDescribeVTLDevicesCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeVTLDevicesRequest, com.amazonaws.services.storagegateway.model.DescribeVTLDevicesResult> {

	var vTLDeviceARNs: List<String>? = null
	var marker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.storagegateway.model.DescribeVTLDevicesRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeVTLDevicesRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setVTLDeviceARNs(this.vTLDeviceARNs)
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DescribeVTLDevicesResult {
	  return com.amazonaws.services.storagegateway.model.DescribeVTLDevicesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DescribeVTLDevicesResult {
		return environment.storagegateway.describeVTLDevices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-vtldevices")
				.argument("gateway-arn", gatewayARN)
				.argument("vtldevice-arns", vTLDeviceARNs?.toString())
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AWSStorageGatewayFunctions.describeWorkingStorage(gatewayARN: String, init: (AWSStorageGatewayDescribeWorkingStorageCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DescribeWorkingStorageResult {
	return this.block.declare(AWSStorageGatewayDescribeWorkingStorageCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DescribeWorkingStorageResult
}

@Generated
class AWSStorageGatewayDescribeWorkingStorageCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeWorkingStorageRequest, com.amazonaws.services.storagegateway.model.DescribeWorkingStorageResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeWorkingStorageRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeWorkingStorageRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DescribeWorkingStorageResult {
	  return com.amazonaws.services.storagegateway.model.DescribeWorkingStorageResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DescribeWorkingStorageResult {
		return environment.storagegateway.describeWorkingStorage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-working-storage")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.disableGateway(gatewayARN: String, init: (AWSStorageGatewayDisableGatewayCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.DisableGatewayResult {
	return this.block.declare(AWSStorageGatewayDisableGatewayCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.DisableGatewayResult
}

@Generated
class AWSStorageGatewayDisableGatewayCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DisableGatewayRequest, com.amazonaws.services.storagegateway.model.DisableGatewayResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.DisableGatewayRequest {
		val input = com.amazonaws.services.storagegateway.model.DisableGatewayRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.DisableGatewayResult {
	  return com.amazonaws.services.storagegateway.model.DisableGatewayResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.DisableGatewayResult {
		return environment.storagegateway.disableGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway disable-gateway")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.listFileShares(init: (AWSStorageGatewayListFileSharesCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.ListFileSharesResult {
	return this.block.declare(AWSStorageGatewayListFileSharesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.ListFileSharesResult
}

@Generated
class AWSStorageGatewayListFileSharesCommand() : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ListFileSharesRequest, com.amazonaws.services.storagegateway.model.ListFileSharesResult> {

	var gatewayARN: String? = null
	var limit: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.storagegateway.model.ListFileSharesRequest {
		val input = com.amazonaws.services.storagegateway.model.ListFileSharesRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setLimit(this.limit)
		input.setMarker(this.marker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.ListFileSharesResult {
	  return com.amazonaws.services.storagegateway.model.ListFileSharesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.ListFileSharesResult {
		return environment.storagegateway.listFileShares(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway list-file-shares")
				.argument("gateway-arn", gatewayARN)
				.argument("limit", limit?.toString())
				.argument("marker", marker)
	}

}


fun AWSStorageGatewayFunctions.listGateways(init: (AWSStorageGatewayListGatewaysCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.ListGatewaysResult {
	return this.block.declare(AWSStorageGatewayListGatewaysCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.ListGatewaysResult
}

@Generated
class AWSStorageGatewayListGatewaysCommand() : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ListGatewaysRequest, com.amazonaws.services.storagegateway.model.ListGatewaysResult> {

	var marker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.storagegateway.model.ListGatewaysRequest {
		val input = com.amazonaws.services.storagegateway.model.ListGatewaysRequest()
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.ListGatewaysResult {
	  return com.amazonaws.services.storagegateway.model.ListGatewaysResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.ListGatewaysResult {
		return environment.storagegateway.listGateways(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway list-gateways")
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AWSStorageGatewayFunctions.listLocalDisks(gatewayARN: String, init: (AWSStorageGatewayListLocalDisksCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.ListLocalDisksResult {
	return this.block.declare(AWSStorageGatewayListLocalDisksCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.ListLocalDisksResult
}

@Generated
class AWSStorageGatewayListLocalDisksCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ListLocalDisksRequest, com.amazonaws.services.storagegateway.model.ListLocalDisksResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.ListLocalDisksRequest {
		val input = com.amazonaws.services.storagegateway.model.ListLocalDisksRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.ListLocalDisksResult {
	  return com.amazonaws.services.storagegateway.model.ListLocalDisksResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.ListLocalDisksResult {
		return environment.storagegateway.listLocalDisks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway list-local-disks")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.listTagsForResource(resourceARN: String, init: (AWSStorageGatewayListTagsForResourceCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.ListTagsForResourceResult {
	return this.block.declare(AWSStorageGatewayListTagsForResourceCommand(resourceARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.ListTagsForResourceResult
}

@Generated
class AWSStorageGatewayListTagsForResourceCommand(val resourceARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ListTagsForResourceRequest, com.amazonaws.services.storagegateway.model.ListTagsForResourceResult> {

	var marker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.storagegateway.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.storagegateway.model.ListTagsForResourceRequest()
		input.setResourceARN(this.resourceARN)
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.ListTagsForResourceResult {
	  return com.amazonaws.services.storagegateway.model.ListTagsForResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.ListTagsForResourceResult {
		return environment.storagegateway.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway list-tags-for-resource")
				.argument("resource-arn", resourceARN)
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AWSStorageGatewayFunctions.listTapes(init: (AWSStorageGatewayListTapesCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.ListTapesResult {
	return this.block.declare(AWSStorageGatewayListTapesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.ListTapesResult
}

@Generated
class AWSStorageGatewayListTapesCommand() : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ListTapesRequest, com.amazonaws.services.storagegateway.model.ListTapesResult> {

	var tapeARNs: List<String>? = null
	var marker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.storagegateway.model.ListTapesRequest {
		val input = com.amazonaws.services.storagegateway.model.ListTapesRequest()
		input.setTapeARNs(this.tapeARNs)
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.ListTapesResult {
	  return com.amazonaws.services.storagegateway.model.ListTapesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.ListTapesResult {
		return environment.storagegateway.listTapes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway list-tapes")
				.argument("tape-arns", tapeARNs?.toString())
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AWSStorageGatewayFunctions.listVolumeInitiators(volumeARN: String, init: (AWSStorageGatewayListVolumeInitiatorsCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsResult {
	return this.block.declare(AWSStorageGatewayListVolumeInitiatorsCommand(volumeARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsResult
}

@Generated
class AWSStorageGatewayListVolumeInitiatorsCommand(val volumeARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsRequest, com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsRequest {
		val input = com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsRequest()
		input.setVolumeARN(this.volumeARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsResult {
	  return com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsResult {
		return environment.storagegateway.listVolumeInitiators(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway list-volume-initiators")
				.argument("volume-arn", volumeARN)
	}

}


fun AWSStorageGatewayFunctions.listVolumeRecoveryPoints(gatewayARN: String, init: (AWSStorageGatewayListVolumeRecoveryPointsCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsResult {
	return this.block.declare(AWSStorageGatewayListVolumeRecoveryPointsCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsResult
}

@Generated
class AWSStorageGatewayListVolumeRecoveryPointsCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsRequest, com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsRequest {
		val input = com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsResult {
	  return com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsResult {
		return environment.storagegateway.listVolumeRecoveryPoints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway list-volume-recovery-points")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.listVolumes(init: (AWSStorageGatewayListVolumesCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.ListVolumesResult {
	return this.block.declare(AWSStorageGatewayListVolumesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.ListVolumesResult
}

@Generated
class AWSStorageGatewayListVolumesCommand() : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ListVolumesRequest, com.amazonaws.services.storagegateway.model.ListVolumesResult> {

	var gatewayARN: String? = null
	var marker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.storagegateway.model.ListVolumesRequest {
		val input = com.amazonaws.services.storagegateway.model.ListVolumesRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.ListVolumesResult {
	  return com.amazonaws.services.storagegateway.model.ListVolumesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.ListVolumesResult {
		return environment.storagegateway.listVolumes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway list-volumes")
				.argument("gateway-arn", gatewayARN)
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AWSStorageGatewayFunctions.notifyWhenUploaded(fileShareARN: String, init: (AWSStorageGatewayNotifyWhenUploadedCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.NotifyWhenUploadedResult {
	return this.block.declare(AWSStorageGatewayNotifyWhenUploadedCommand(fileShareARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.NotifyWhenUploadedResult
}

@Generated
class AWSStorageGatewayNotifyWhenUploadedCommand(val fileShareARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.NotifyWhenUploadedRequest, com.amazonaws.services.storagegateway.model.NotifyWhenUploadedResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.NotifyWhenUploadedRequest {
		val input = com.amazonaws.services.storagegateway.model.NotifyWhenUploadedRequest()
		input.setFileShareARN(this.fileShareARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.NotifyWhenUploadedResult {
	  return com.amazonaws.services.storagegateway.model.NotifyWhenUploadedResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.NotifyWhenUploadedResult {
		return environment.storagegateway.notifyWhenUploaded(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway notify-when-uploaded")
				.argument("file-share-arn", fileShareARN)
	}

}


fun AWSStorageGatewayFunctions.refreshCache(fileShareARN: String, init: (AWSStorageGatewayRefreshCacheCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.RefreshCacheResult {
	return this.block.declare(AWSStorageGatewayRefreshCacheCommand(fileShareARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.RefreshCacheResult
}

@Generated
class AWSStorageGatewayRefreshCacheCommand(val fileShareARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.RefreshCacheRequest, com.amazonaws.services.storagegateway.model.RefreshCacheResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.RefreshCacheRequest {
		val input = com.amazonaws.services.storagegateway.model.RefreshCacheRequest()
		input.setFileShareARN(this.fileShareARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.RefreshCacheResult {
	  return com.amazonaws.services.storagegateway.model.RefreshCacheResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.RefreshCacheResult {
		return environment.storagegateway.refreshCache(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway refresh-cache")
				.argument("file-share-arn", fileShareARN)
	}

}


fun AWSStorageGatewayFunctions.removeTagsFromResource(resourceARN: String, tagKeys: List<String>, init: (AWSStorageGatewayRemoveTagsFromResourceCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceResult {
	return this.block.declare(AWSStorageGatewayRemoveTagsFromResourceCommand(resourceARN, tagKeys).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceResult
}

@Generated
class AWSStorageGatewayRemoveTagsFromResourceCommand(val resourceARN: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceRequest, com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceRequest {
		val input = com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceRequest()
		input.setResourceARN(this.resourceARN)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceResult {
	  return com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceResult {
		return environment.storagegateway.removeTagsFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway remove-tags-from-resource")
				.argument("resource-arn", resourceARN)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSStorageGatewayFunctions.resetCache(gatewayARN: String, init: (AWSStorageGatewayResetCacheCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.ResetCacheResult {
	return this.block.declare(AWSStorageGatewayResetCacheCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.ResetCacheResult
}

@Generated
class AWSStorageGatewayResetCacheCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ResetCacheRequest, com.amazonaws.services.storagegateway.model.ResetCacheResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.ResetCacheRequest {
		val input = com.amazonaws.services.storagegateway.model.ResetCacheRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.ResetCacheResult {
	  return com.amazonaws.services.storagegateway.model.ResetCacheResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.ResetCacheResult {
		return environment.storagegateway.resetCache(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway reset-cache")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.retrieveTapeArchive(tapeARN: String, gatewayARN: String, init: (AWSStorageGatewayRetrieveTapeArchiveCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveResult {
	return this.block.declare(AWSStorageGatewayRetrieveTapeArchiveCommand(tapeARN, gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveResult
}

@Generated
class AWSStorageGatewayRetrieveTapeArchiveCommand(val tapeARN: String, val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveRequest, com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveRequest {
		val input = com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveRequest()
		input.setTapeARN(this.tapeARN)
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveResult {
	  return com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveResult {
		return environment.storagegateway.retrieveTapeArchive(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway retrieve-tape-archive")
				.argument("tape-arn", tapeARN)
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.retrieveTapeRecoveryPoint(tapeARN: String, gatewayARN: String, init: (AWSStorageGatewayRetrieveTapeRecoveryPointCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointResult {
	return this.block.declare(AWSStorageGatewayRetrieveTapeRecoveryPointCommand(tapeARN, gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointResult
}

@Generated
class AWSStorageGatewayRetrieveTapeRecoveryPointCommand(val tapeARN: String, val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointRequest, com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointRequest {
		val input = com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointRequest()
		input.setTapeARN(this.tapeARN)
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointResult {
	  return com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointResult {
		return environment.storagegateway.retrieveTapeRecoveryPoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway retrieve-tape-recovery-point")
				.argument("tape-arn", tapeARN)
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.setLocalConsolePassword(gatewayARN: String, localConsolePassword: String, init: (AWSStorageGatewaySetLocalConsolePasswordCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordResult {
	return this.block.declare(AWSStorageGatewaySetLocalConsolePasswordCommand(gatewayARN, localConsolePassword).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordResult
}

@Generated
class AWSStorageGatewaySetLocalConsolePasswordCommand(val gatewayARN: String, val localConsolePassword: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordRequest, com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordRequest {
		val input = com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setLocalConsolePassword(this.localConsolePassword)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordResult {
	  return com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordResult {
		return environment.storagegateway.setLocalConsolePassword(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway set-local-console-password")
				.argument("gateway-arn", gatewayARN)
				.argument("local-console-password", localConsolePassword)
	}

}


fun AWSStorageGatewayFunctions.shutdownGateway(gatewayARN: String, init: (AWSStorageGatewayShutdownGatewayCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.ShutdownGatewayResult {
	return this.block.declare(AWSStorageGatewayShutdownGatewayCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.ShutdownGatewayResult
}

@Generated
class AWSStorageGatewayShutdownGatewayCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ShutdownGatewayRequest, com.amazonaws.services.storagegateway.model.ShutdownGatewayResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.ShutdownGatewayRequest {
		val input = com.amazonaws.services.storagegateway.model.ShutdownGatewayRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.ShutdownGatewayResult {
	  return com.amazonaws.services.storagegateway.model.ShutdownGatewayResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.ShutdownGatewayResult {
		return environment.storagegateway.shutdownGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway shutdown-gateway")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.startGateway(gatewayARN: String, init: (AWSStorageGatewayStartGatewayCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.StartGatewayResult {
	return this.block.declare(AWSStorageGatewayStartGatewayCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.StartGatewayResult
}

@Generated
class AWSStorageGatewayStartGatewayCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.StartGatewayRequest, com.amazonaws.services.storagegateway.model.StartGatewayResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.StartGatewayRequest {
		val input = com.amazonaws.services.storagegateway.model.StartGatewayRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.StartGatewayResult {
	  return com.amazonaws.services.storagegateway.model.StartGatewayResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.StartGatewayResult {
		return environment.storagegateway.startGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway start-gateway")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.updateBandwidthRateLimit(gatewayARN: String, init: (AWSStorageGatewayUpdateBandwidthRateLimitCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitResult {
	return this.block.declare(AWSStorageGatewayUpdateBandwidthRateLimitCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitResult
}

@Generated
class AWSStorageGatewayUpdateBandwidthRateLimitCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitRequest, com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitResult> {

	var averageUploadRateLimitInBitsPerSec: Long? = 0L
	var averageDownloadRateLimitInBitsPerSec: Long? = 0L

	override fun build(): com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitRequest {
		val input = com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setAverageUploadRateLimitInBitsPerSec(this.averageUploadRateLimitInBitsPerSec)
		input.setAverageDownloadRateLimitInBitsPerSec(this.averageDownloadRateLimitInBitsPerSec)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitResult {
	  return com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitResult {
		return environment.storagegateway.updateBandwidthRateLimit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway update-bandwidth-rate-limit")
				.argument("gateway-arn", gatewayARN)
				.argument("average-upload-rate-limit-in-bits-per-sec", averageUploadRateLimitInBitsPerSec?.toString())
				.argument("average-download-rate-limit-in-bits-per-sec", averageDownloadRateLimitInBitsPerSec?.toString())
	}

}


fun AWSStorageGatewayFunctions.updateChapCredentials(targetARN: String, secretToAuthenticateInitiator: String, initiatorName: String, init: (AWSStorageGatewayUpdateChapCredentialsCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.UpdateChapCredentialsResult {
	return this.block.declare(AWSStorageGatewayUpdateChapCredentialsCommand(targetARN, secretToAuthenticateInitiator, initiatorName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.UpdateChapCredentialsResult
}

@Generated
class AWSStorageGatewayUpdateChapCredentialsCommand(val targetARN: String, val secretToAuthenticateInitiator: String, val initiatorName: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.UpdateChapCredentialsRequest, com.amazonaws.services.storagegateway.model.UpdateChapCredentialsResult> {

	var secretToAuthenticateTarget: String? = null

	override fun build(): com.amazonaws.services.storagegateway.model.UpdateChapCredentialsRequest {
		val input = com.amazonaws.services.storagegateway.model.UpdateChapCredentialsRequest()
		input.setTargetARN(this.targetARN)
		input.setSecretToAuthenticateInitiator(this.secretToAuthenticateInitiator)
		input.setInitiatorName(this.initiatorName)
		input.setSecretToAuthenticateTarget(this.secretToAuthenticateTarget)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.UpdateChapCredentialsResult {
	  return com.amazonaws.services.storagegateway.model.UpdateChapCredentialsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.UpdateChapCredentialsResult {
		return environment.storagegateway.updateChapCredentials(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway update-chap-credentials")
				.argument("target-arn", targetARN)
				.argument("secret-to-authenticate-initiator", secretToAuthenticateInitiator)
				.argument("initiator-name", initiatorName)
				.argument("secret-to-authenticate-target", secretToAuthenticateTarget)
	}

}


fun AWSStorageGatewayFunctions.updateGatewayInformation(gatewayARN: String, init: (AWSStorageGatewayUpdateGatewayInformationCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.UpdateGatewayInformationResult {
	return this.block.declare(AWSStorageGatewayUpdateGatewayInformationCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.UpdateGatewayInformationResult
}

@Generated
class AWSStorageGatewayUpdateGatewayInformationCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.UpdateGatewayInformationRequest, com.amazonaws.services.storagegateway.model.UpdateGatewayInformationResult> {

	var gatewayName: String? = null
	var gatewayTimezone: String? = null

	override fun build(): com.amazonaws.services.storagegateway.model.UpdateGatewayInformationRequest {
		val input = com.amazonaws.services.storagegateway.model.UpdateGatewayInformationRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setGatewayName(this.gatewayName)
		input.setGatewayTimezone(this.gatewayTimezone)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.UpdateGatewayInformationResult {
	  return com.amazonaws.services.storagegateway.model.UpdateGatewayInformationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.UpdateGatewayInformationResult {
		return environment.storagegateway.updateGatewayInformation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway update-gateway-information")
				.argument("gateway-arn", gatewayARN)
				.argument("gateway-name", gatewayName)
				.argument("gateway-timezone", gatewayTimezone)
	}

}


fun AWSStorageGatewayFunctions.updateGatewaySoftwareNow(gatewayARN: String, init: (AWSStorageGatewayUpdateGatewaySoftwareNowCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowResult {
	return this.block.declare(AWSStorageGatewayUpdateGatewaySoftwareNowCommand(gatewayARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowResult
}

@Generated
class AWSStorageGatewayUpdateGatewaySoftwareNowCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowRequest, com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowRequest {
		val input = com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowResult {
	  return com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowResult {
		return environment.storagegateway.updateGatewaySoftwareNow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway update-gateway-software-now")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.updateMaintenanceStartTime(gatewayARN: String, hourOfDay: Int, minuteOfHour: Int, dayOfWeek: Int, init: (AWSStorageGatewayUpdateMaintenanceStartTimeCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeResult {
	return this.block.declare(AWSStorageGatewayUpdateMaintenanceStartTimeCommand(gatewayARN, hourOfDay, minuteOfHour, dayOfWeek).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeResult
}

@Generated
class AWSStorageGatewayUpdateMaintenanceStartTimeCommand(val gatewayARN: String, val hourOfDay: Int, val minuteOfHour: Int, val dayOfWeek: Int) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeRequest, com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeRequest {
		val input = com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setHourOfDay(this.hourOfDay)
		input.setMinuteOfHour(this.minuteOfHour)
		input.setDayOfWeek(this.dayOfWeek)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeResult {
	  return com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeResult {
		return environment.storagegateway.updateMaintenanceStartTime(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway update-maintenance-start-time")
				.argument("gateway-arn", gatewayARN)
				.argument("hour-of-day", hourOfDay.toString())
				.argument("minute-of-hour", minuteOfHour.toString())
				.argument("day-of-week", dayOfWeek.toString())
	}

}


fun AWSStorageGatewayFunctions.updateNFSFileShare(fileShareARN: String, init: (AWSStorageGatewayUpdateNFSFileShareCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.UpdateNFSFileShareResult {
	return this.block.declare(AWSStorageGatewayUpdateNFSFileShareCommand(fileShareARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.UpdateNFSFileShareResult
}

@Generated
class AWSStorageGatewayUpdateNFSFileShareCommand(val fileShareARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.UpdateNFSFileShareRequest, com.amazonaws.services.storagegateway.model.UpdateNFSFileShareResult> {

	var kMSEncrypted: Boolean? = false
	var kMSKey: String? = null
	var nFSFileShareDefaults: com.amazonaws.services.storagegateway.model.NFSFileShareDefaults? = null
	var defaultStorageClass: String? = null
	var objectACL: ObjectACL? = null
	var clientList: List<String>? = null
	var squash: String? = null
	var readOnly: Boolean? = false
	var guessMIMETypeEnabled: Boolean? = false
	var requesterPays: Boolean? = false

	override fun build(): com.amazonaws.services.storagegateway.model.UpdateNFSFileShareRequest {
		val input = com.amazonaws.services.storagegateway.model.UpdateNFSFileShareRequest()
		input.setFileShareARN(this.fileShareARN)
		input.setKMSEncrypted(this.kMSEncrypted)
		input.setKMSKey(this.kMSKey)
		input.setNFSFileShareDefaults(this.nFSFileShareDefaults)
		input.setDefaultStorageClass(this.defaultStorageClass)
		input.setObjectACL(this.objectACL?.toString())
		input.setClientList(this.clientList)
		input.setSquash(this.squash)
		input.setReadOnly(this.readOnly)
		input.setGuessMIMETypeEnabled(this.guessMIMETypeEnabled)
		input.setRequesterPays(this.requesterPays)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.UpdateNFSFileShareResult {
	  return com.amazonaws.services.storagegateway.model.UpdateNFSFileShareResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.UpdateNFSFileShareResult {
		return environment.storagegateway.updateNFSFileShare(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway update-nfsfile-share")
				.argument("file-share-arn", fileShareARN)
				.option("kmsencrypted", kMSEncrypted ?: false)
				.argument("kmskey", kMSKey)
				.argument("nfsfile-share-defaults", nFSFileShareDefaults?.toString())
				.argument("default-storage-class", defaultStorageClass)
				.argument("object-acl", objectACL?.toString())
				.argument("client-list", clientList?.toString())
				.argument("squash", squash)
				.option("read-only", readOnly ?: false)
				.option("guess-mimetype-enabled", guessMIMETypeEnabled ?: false)
				.option("requester-pays", requesterPays ?: false)
	}

}


fun AWSStorageGatewayFunctions.updateSnapshotSchedule(volumeARN: String, startAt: Int, recurrenceInHours: Int, init: (AWSStorageGatewayUpdateSnapshotScheduleCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleResult {
	return this.block.declare(AWSStorageGatewayUpdateSnapshotScheduleCommand(volumeARN, startAt, recurrenceInHours).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleResult
}

@Generated
class AWSStorageGatewayUpdateSnapshotScheduleCommand(val volumeARN: String, val startAt: Int, val recurrenceInHours: Int) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleRequest, com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleResult> {

	var description: String? = null

	override fun build(): com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleRequest {
		val input = com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleRequest()
		input.setVolumeARN(this.volumeARN)
		input.setStartAt(this.startAt)
		input.setRecurrenceInHours(this.recurrenceInHours)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleResult {
	  return com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleResult {
		return environment.storagegateway.updateSnapshotSchedule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway update-snapshot-schedule")
				.argument("volume-arn", volumeARN)
				.argument("start-at", startAt.toString())
				.argument("recurrence-in-hours", recurrenceInHours.toString())
				.argument("description", description)
	}

}


fun AWSStorageGatewayFunctions.updateVTLDeviceType(vTLDeviceARN: String, deviceType: String, init: (AWSStorageGatewayUpdateVTLDeviceTypeCommand.() -> Unit)? = null): com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeResult {
	return this.block.declare(AWSStorageGatewayUpdateVTLDeviceTypeCommand(vTLDeviceARN, deviceType).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeResult
}

@Generated
class AWSStorageGatewayUpdateVTLDeviceTypeCommand(val vTLDeviceARN: String, val deviceType: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeRequest, com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeResult> {



	override fun build(): com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeRequest {
		val input = com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeRequest()
		input.setVTLDeviceARN(this.vTLDeviceARN)
		input.setDeviceType(this.deviceType)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeResult {
	  return com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeResult {
		return environment.storagegateway.updateVTLDeviceType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway update-vtldevice-type")
				.argument("vtldevice-arn", vTLDeviceARN)
				.argument("device-type", deviceType)
	}

}
