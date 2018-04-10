
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.storagegateway.AWSStorageGateway
import com.amazonaws.services.storagegateway.model.*

var codingue.koops.core.Environment.storagegateway: AWSStorageGateway
	get() = this.capabilities[AWSStorageGateway::class.java.name] as AWSStorageGateway
	set(storagegateway) {
		this.capabilities[AWSStorageGateway::class.java.name] = storagegateway
	}

@Generated
class AWSStorageGatewayFunctions(val block: Block)

infix fun AwsContinuation.storagegateway(init: AWSStorageGatewayFunctions.() -> Unit) {
	AWSStorageGatewayFunctions(shell).apply(init)
}

			

fun AWSStorageGatewayFunctions.activateGateway(activationKey: String, gatewayName: String, gatewayTimezone: String, gatewayRegion: String, init: AWSStorageGatewayActivateGatewayCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayActivateGatewayCommand(activationKey, gatewayName, gatewayTimezone, gatewayRegion).apply(init))
}

@Generated
class AWSStorageGatewayActivateGatewayCommand(val activationKey: String, val gatewayName: String, val gatewayTimezone: String, val gatewayRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ActivateGatewayRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.activateGateway(build())
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


fun AWSStorageGatewayFunctions.addCache(gatewayARN: String, diskIds: List<String>, init: AWSStorageGatewayAddCacheCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayAddCacheCommand(gatewayARN, diskIds).apply(init))
}

@Generated
class AWSStorageGatewayAddCacheCommand(val gatewayARN: String, val diskIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.AddCacheRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.AddCacheRequest {
		val input = com.amazonaws.services.storagegateway.model.AddCacheRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setDiskIds(this.diskIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.addCache(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway add-cache")
				.argument("gateway-arn", gatewayARN)
				.argument("disk-ids", diskIds.toString())
	}

}


fun AWSStorageGatewayFunctions.addTagsToResource(resourceARN: String, tags: List<com.amazonaws.services.storagegateway.model.Tag>, init: AWSStorageGatewayAddTagsToResourceCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayAddTagsToResourceCommand(resourceARN, tags).apply(init))
}

@Generated
class AWSStorageGatewayAddTagsToResourceCommand(val resourceARN: String, val tags: List<com.amazonaws.services.storagegateway.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.AddTagsToResourceRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.AddTagsToResourceRequest {
		val input = com.amazonaws.services.storagegateway.model.AddTagsToResourceRequest()
		input.setResourceARN(this.resourceARN)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.addTagsToResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway add-tags-to-resource")
				.argument("resource-arn", resourceARN)
				.argument("tags", tags.toString())
	}

}


fun AWSStorageGatewayFunctions.addUploadBuffer(gatewayARN: String, diskIds: List<String>, init: AWSStorageGatewayAddUploadBufferCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayAddUploadBufferCommand(gatewayARN, diskIds).apply(init))
}

@Generated
class AWSStorageGatewayAddUploadBufferCommand(val gatewayARN: String, val diskIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.AddUploadBufferRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.AddUploadBufferRequest {
		val input = com.amazonaws.services.storagegateway.model.AddUploadBufferRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setDiskIds(this.diskIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.addUploadBuffer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway add-upload-buffer")
				.argument("gateway-arn", gatewayARN)
				.argument("disk-ids", diskIds.toString())
	}

}


fun AWSStorageGatewayFunctions.addWorkingStorage(gatewayARN: String, diskIds: List<String>, init: AWSStorageGatewayAddWorkingStorageCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayAddWorkingStorageCommand(gatewayARN, diskIds).apply(init))
}

@Generated
class AWSStorageGatewayAddWorkingStorageCommand(val gatewayARN: String, val diskIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.AddWorkingStorageRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.AddWorkingStorageRequest {
		val input = com.amazonaws.services.storagegateway.model.AddWorkingStorageRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setDiskIds(this.diskIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.addWorkingStorage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway add-working-storage")
				.argument("gateway-arn", gatewayARN)
				.argument("disk-ids", diskIds.toString())
	}

}


fun AWSStorageGatewayFunctions.cancelArchival(gatewayARN: String, tapeARN: String, init: AWSStorageGatewayCancelArchivalCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayCancelArchivalCommand(gatewayARN, tapeARN).apply(init))
}

@Generated
class AWSStorageGatewayCancelArchivalCommand(val gatewayARN: String, val tapeARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CancelArchivalRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.CancelArchivalRequest {
		val input = com.amazonaws.services.storagegateway.model.CancelArchivalRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setTapeARN(this.tapeARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.cancelArchival(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway cancel-archival")
				.argument("gateway-arn", gatewayARN)
				.argument("tape-arn", tapeARN)
	}

}


fun AWSStorageGatewayFunctions.cancelRetrieval(gatewayARN: String, tapeARN: String, init: AWSStorageGatewayCancelRetrievalCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayCancelRetrievalCommand(gatewayARN, tapeARN).apply(init))
}

@Generated
class AWSStorageGatewayCancelRetrievalCommand(val gatewayARN: String, val tapeARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CancelRetrievalRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.CancelRetrievalRequest {
		val input = com.amazonaws.services.storagegateway.model.CancelRetrievalRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setTapeARN(this.tapeARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.cancelRetrieval(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway cancel-retrieval")
				.argument("gateway-arn", gatewayARN)
				.argument("tape-arn", tapeARN)
	}

}


fun AWSStorageGatewayFunctions.createCachediSCSIVolume(gatewayARN: String, volumeSizeInBytes: Long, targetName: String, networkInterfaceId: String, clientToken: String, init: AWSStorageGatewayCreateCachediSCSIVolumeCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayCreateCachediSCSIVolumeCommand(gatewayARN, volumeSizeInBytes, targetName, networkInterfaceId, clientToken).apply(init))
}

@Generated
class AWSStorageGatewayCreateCachediSCSIVolumeCommand(val gatewayARN: String, val volumeSizeInBytes: Long, val targetName: String, val networkInterfaceId: String, val clientToken: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.createCachediSCSIVolume(build())
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


fun AWSStorageGatewayFunctions.createNFSFileShare(clientToken: String, gatewayARN: String, role: String, locationARN: String, init: AWSStorageGatewayCreateNFSFileShareCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayCreateNFSFileShareCommand(clientToken, gatewayARN, role, locationARN).apply(init))
}

@Generated
class AWSStorageGatewayCreateNFSFileShareCommand(val clientToken: String, val gatewayARN: String, val role: String, val locationARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CreateNFSFileShareRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.createNFSFileShare(build())
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


fun AWSStorageGatewayFunctions.createSnapshot(volumeARN: String, snapshotDescription: String, init: AWSStorageGatewayCreateSnapshotCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayCreateSnapshotCommand(volumeARN, snapshotDescription).apply(init))
}

@Generated
class AWSStorageGatewayCreateSnapshotCommand(val volumeARN: String, val snapshotDescription: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CreateSnapshotRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.CreateSnapshotRequest {
		val input = com.amazonaws.services.storagegateway.model.CreateSnapshotRequest()
		input.setVolumeARN(this.volumeARN)
		input.setSnapshotDescription(this.snapshotDescription)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.createSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway create-snapshot")
				.argument("volume-arn", volumeARN)
				.argument("snapshot-description", snapshotDescription)
	}

}


fun AWSStorageGatewayFunctions.createSnapshotFromVolumeRecoveryPoint(volumeARN: String, snapshotDescription: String, init: AWSStorageGatewayCreateSnapshotFromVolumeRecoveryPointCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayCreateSnapshotFromVolumeRecoveryPointCommand(volumeARN, snapshotDescription).apply(init))
}

@Generated
class AWSStorageGatewayCreateSnapshotFromVolumeRecoveryPointCommand(val volumeARN: String, val snapshotDescription: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointRequest {
		val input = com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointRequest()
		input.setVolumeARN(this.volumeARN)
		input.setSnapshotDescription(this.snapshotDescription)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.createSnapshotFromVolumeRecoveryPoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway create-snapshot-from-volume-recovery-point")
				.argument("volume-arn", volumeARN)
				.argument("snapshot-description", snapshotDescription)
	}

}


fun AWSStorageGatewayFunctions.createStorediSCSIVolume(gatewayARN: String, diskId: String, preserveExistingData: Boolean, targetName: String, networkInterfaceId: String, init: AWSStorageGatewayCreateStorediSCSIVolumeCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayCreateStorediSCSIVolumeCommand(gatewayARN, diskId, preserveExistingData, targetName, networkInterfaceId).apply(init))
}

@Generated
class AWSStorageGatewayCreateStorediSCSIVolumeCommand(val gatewayARN: String, val diskId: String, val preserveExistingData: Boolean, val targetName: String, val networkInterfaceId: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.createStorediSCSIVolume(build())
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


fun AWSStorageGatewayFunctions.createTapeWithBarcode(gatewayARN: String, tapeSizeInBytes: Long, tapeBarcode: String, init: AWSStorageGatewayCreateTapeWithBarcodeCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayCreateTapeWithBarcodeCommand(gatewayARN, tapeSizeInBytes, tapeBarcode).apply(init))
}

@Generated
class AWSStorageGatewayCreateTapeWithBarcodeCommand(val gatewayARN: String, val tapeSizeInBytes: Long, val tapeBarcode: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeRequest {
		val input = com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setTapeSizeInBytes(this.tapeSizeInBytes)
		input.setTapeBarcode(this.tapeBarcode)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.createTapeWithBarcode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway create-tape-with-barcode")
				.argument("gateway-arn", gatewayARN)
				.argument("tape-size-in-bytes", tapeSizeInBytes.toString())
				.argument("tape-barcode", tapeBarcode)
	}

}


fun AWSStorageGatewayFunctions.createTapes(gatewayARN: String, tapeSizeInBytes: Long, clientToken: String, numTapesToCreate: Int, tapeBarcodePrefix: String, init: AWSStorageGatewayCreateTapesCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayCreateTapesCommand(gatewayARN, tapeSizeInBytes, clientToken, numTapesToCreate, tapeBarcodePrefix).apply(init))
}

@Generated
class AWSStorageGatewayCreateTapesCommand(val gatewayARN: String, val tapeSizeInBytes: Long, val clientToken: String, val numTapesToCreate: Int, val tapeBarcodePrefix: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.CreateTapesRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.CreateTapesRequest {
		val input = com.amazonaws.services.storagegateway.model.CreateTapesRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setTapeSizeInBytes(this.tapeSizeInBytes)
		input.setClientToken(this.clientToken)
		input.setNumTapesToCreate(this.numTapesToCreate)
		input.setTapeBarcodePrefix(this.tapeBarcodePrefix)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.createTapes(build())
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


fun AWSStorageGatewayFunctions.deleteBandwidthRateLimit(gatewayARN: String, bandwidthType: String, init: AWSStorageGatewayDeleteBandwidthRateLimitCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDeleteBandwidthRateLimitCommand(gatewayARN, bandwidthType).apply(init))
}

@Generated
class AWSStorageGatewayDeleteBandwidthRateLimitCommand(val gatewayARN: String, val bandwidthType: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitRequest {
		val input = com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setBandwidthType(this.bandwidthType)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.deleteBandwidthRateLimit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway delete-bandwidth-rate-limit")
				.argument("gateway-arn", gatewayARN)
				.argument("bandwidth-type", bandwidthType)
	}

}


fun AWSStorageGatewayFunctions.deleteChapCredentials(targetARN: String, initiatorName: String, init: AWSStorageGatewayDeleteChapCredentialsCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDeleteChapCredentialsCommand(targetARN, initiatorName).apply(init))
}

@Generated
class AWSStorageGatewayDeleteChapCredentialsCommand(val targetARN: String, val initiatorName: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DeleteChapCredentialsRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DeleteChapCredentialsRequest {
		val input = com.amazonaws.services.storagegateway.model.DeleteChapCredentialsRequest()
		input.setTargetARN(this.targetARN)
		input.setInitiatorName(this.initiatorName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.deleteChapCredentials(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway delete-chap-credentials")
				.argument("target-arn", targetARN)
				.argument("initiator-name", initiatorName)
	}

}


fun AWSStorageGatewayFunctions.deleteFileShare(fileShareARN: String, init: AWSStorageGatewayDeleteFileShareCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDeleteFileShareCommand(fileShareARN).apply(init))
}

@Generated
class AWSStorageGatewayDeleteFileShareCommand(val fileShareARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DeleteFileShareRequest> {

	var forceDelete: Boolean? = false

	override fun build(): com.amazonaws.services.storagegateway.model.DeleteFileShareRequest {
		val input = com.amazonaws.services.storagegateway.model.DeleteFileShareRequest()
		input.setFileShareARN(this.fileShareARN)
		input.setForceDelete(this.forceDelete)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.deleteFileShare(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway delete-file-share")
				.argument("file-share-arn", fileShareARN)
				.option("force-delete", forceDelete ?: false)
	}

}


fun AWSStorageGatewayFunctions.deleteGateway(gatewayARN: String, init: AWSStorageGatewayDeleteGatewayCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDeleteGatewayCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayDeleteGatewayCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DeleteGatewayRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DeleteGatewayRequest {
		val input = com.amazonaws.services.storagegateway.model.DeleteGatewayRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.deleteGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway delete-gateway")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.deleteSnapshotSchedule(volumeARN: String, init: AWSStorageGatewayDeleteSnapshotScheduleCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDeleteSnapshotScheduleCommand(volumeARN).apply(init))
}

@Generated
class AWSStorageGatewayDeleteSnapshotScheduleCommand(val volumeARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleRequest {
		val input = com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleRequest()
		input.setVolumeARN(this.volumeARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.deleteSnapshotSchedule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway delete-snapshot-schedule")
				.argument("volume-arn", volumeARN)
	}

}


fun AWSStorageGatewayFunctions.deleteTape(gatewayARN: String, tapeARN: String, init: AWSStorageGatewayDeleteTapeCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDeleteTapeCommand(gatewayARN, tapeARN).apply(init))
}

@Generated
class AWSStorageGatewayDeleteTapeCommand(val gatewayARN: String, val tapeARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DeleteTapeRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DeleteTapeRequest {
		val input = com.amazonaws.services.storagegateway.model.DeleteTapeRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setTapeARN(this.tapeARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.deleteTape(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway delete-tape")
				.argument("gateway-arn", gatewayARN)
				.argument("tape-arn", tapeARN)
	}

}


fun AWSStorageGatewayFunctions.deleteTapeArchive(tapeARN: String, init: AWSStorageGatewayDeleteTapeArchiveCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDeleteTapeArchiveCommand(tapeARN).apply(init))
}

@Generated
class AWSStorageGatewayDeleteTapeArchiveCommand(val tapeARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DeleteTapeArchiveRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DeleteTapeArchiveRequest {
		val input = com.amazonaws.services.storagegateway.model.DeleteTapeArchiveRequest()
		input.setTapeARN(this.tapeARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.deleteTapeArchive(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway delete-tape-archive")
				.argument("tape-arn", tapeARN)
	}

}


fun AWSStorageGatewayFunctions.deleteVolume(volumeARN: String, init: AWSStorageGatewayDeleteVolumeCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDeleteVolumeCommand(volumeARN).apply(init))
}

@Generated
class AWSStorageGatewayDeleteVolumeCommand(val volumeARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DeleteVolumeRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DeleteVolumeRequest {
		val input = com.amazonaws.services.storagegateway.model.DeleteVolumeRequest()
		input.setVolumeARN(this.volumeARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.deleteVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway delete-volume")
				.argument("volume-arn", volumeARN)
	}

}


fun AWSStorageGatewayFunctions.describeBandwidthRateLimit(gatewayARN: String, init: AWSStorageGatewayDescribeBandwidthRateLimitCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDescribeBandwidthRateLimitCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayDescribeBandwidthRateLimitCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.describeBandwidthRateLimit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-bandwidth-rate-limit")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.describeCache(gatewayARN: String, init: AWSStorageGatewayDescribeCacheCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDescribeCacheCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayDescribeCacheCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeCacheRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeCacheRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeCacheRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.describeCache(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-cache")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.describeCachediSCSIVolumes(volumeARNs: List<String>, init: AWSStorageGatewayDescribeCachediSCSIVolumesCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDescribeCachediSCSIVolumesCommand(volumeARNs).apply(init))
}

@Generated
class AWSStorageGatewayDescribeCachediSCSIVolumesCommand(val volumeARNs: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesRequest()
		input.setVolumeARNs(this.volumeARNs)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.describeCachediSCSIVolumes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-cachedi-scsivolumes")
				.argument("volume-arns", volumeARNs.toString())
	}

}


fun AWSStorageGatewayFunctions.describeChapCredentials(targetARN: String, init: AWSStorageGatewayDescribeChapCredentialsCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDescribeChapCredentialsCommand(targetARN).apply(init))
}

@Generated
class AWSStorageGatewayDescribeChapCredentialsCommand(val targetARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeChapCredentialsRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeChapCredentialsRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeChapCredentialsRequest()
		input.setTargetARN(this.targetARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.describeChapCredentials(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-chap-credentials")
				.argument("target-arn", targetARN)
	}

}


fun AWSStorageGatewayFunctions.describeGatewayInformation(gatewayARN: String, init: AWSStorageGatewayDescribeGatewayInformationCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDescribeGatewayInformationCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayDescribeGatewayInformationCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeGatewayInformationRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeGatewayInformationRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeGatewayInformationRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.describeGatewayInformation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-gateway-information")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.describeMaintenanceStartTime(gatewayARN: String, init: AWSStorageGatewayDescribeMaintenanceStartTimeCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDescribeMaintenanceStartTimeCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayDescribeMaintenanceStartTimeCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.describeMaintenanceStartTime(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-maintenance-start-time")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.describeNFSFileShares(fileShareARNList: List<String>, init: AWSStorageGatewayDescribeNFSFileSharesCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDescribeNFSFileSharesCommand(fileShareARNList).apply(init))
}

@Generated
class AWSStorageGatewayDescribeNFSFileSharesCommand(val fileShareARNList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesRequest()
		input.setFileShareARNList(this.fileShareARNList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.describeNFSFileShares(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-nfsfile-shares")
				.argument("file-share-arnlist", fileShareARNList.toString())
	}

}


fun AWSStorageGatewayFunctions.describeSnapshotSchedule(volumeARN: String, init: AWSStorageGatewayDescribeSnapshotScheduleCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDescribeSnapshotScheduleCommand(volumeARN).apply(init))
}

@Generated
class AWSStorageGatewayDescribeSnapshotScheduleCommand(val volumeARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleRequest()
		input.setVolumeARN(this.volumeARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.describeSnapshotSchedule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-snapshot-schedule")
				.argument("volume-arn", volumeARN)
	}

}


fun AWSStorageGatewayFunctions.describeStorediSCSIVolumes(volumeARNs: List<String>, init: AWSStorageGatewayDescribeStorediSCSIVolumesCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDescribeStorediSCSIVolumesCommand(volumeARNs).apply(init))
}

@Generated
class AWSStorageGatewayDescribeStorediSCSIVolumesCommand(val volumeARNs: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesRequest()
		input.setVolumeARNs(this.volumeARNs)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.describeStorediSCSIVolumes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-storedi-scsivolumes")
				.argument("volume-arns", volumeARNs.toString())
	}

}


fun AWSStorageGatewayFunctions.describeTapeArchives(init: AWSStorageGatewayDescribeTapeArchivesCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDescribeTapeArchivesCommand().apply(init))
}

@Generated
class AWSStorageGatewayDescribeTapeArchivesCommand() : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeTapeArchivesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.describeTapeArchives(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-tape-archives")
				.argument("tape-arns", tapeARNs?.toString())
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AWSStorageGatewayFunctions.describeTapeRecoveryPoints(gatewayARN: String, init: AWSStorageGatewayDescribeTapeRecoveryPointsCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDescribeTapeRecoveryPointsCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayDescribeTapeRecoveryPointsCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsRequest> {

	var marker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.describeTapeRecoveryPoints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-tape-recovery-points")
				.argument("gateway-arn", gatewayARN)
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AWSStorageGatewayFunctions.describeTapes(gatewayARN: String, init: AWSStorageGatewayDescribeTapesCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDescribeTapesCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayDescribeTapesCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeTapesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.describeTapes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-tapes")
				.argument("gateway-arn", gatewayARN)
				.argument("tape-arns", tapeARNs?.toString())
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AWSStorageGatewayFunctions.describeUploadBuffer(gatewayARN: String, init: AWSStorageGatewayDescribeUploadBufferCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDescribeUploadBufferCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayDescribeUploadBufferCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeUploadBufferRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeUploadBufferRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeUploadBufferRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.describeUploadBuffer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-upload-buffer")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.describeVTLDevices(gatewayARN: String, init: AWSStorageGatewayDescribeVTLDevicesCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDescribeVTLDevicesCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayDescribeVTLDevicesCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeVTLDevicesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.describeVTLDevices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-vtldevices")
				.argument("gateway-arn", gatewayARN)
				.argument("vtldevice-arns", vTLDeviceARNs?.toString())
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AWSStorageGatewayFunctions.describeWorkingStorage(gatewayARN: String, init: AWSStorageGatewayDescribeWorkingStorageCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDescribeWorkingStorageCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayDescribeWorkingStorageCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DescribeWorkingStorageRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DescribeWorkingStorageRequest {
		val input = com.amazonaws.services.storagegateway.model.DescribeWorkingStorageRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.describeWorkingStorage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway describe-working-storage")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.disableGateway(gatewayARN: String, init: AWSStorageGatewayDisableGatewayCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayDisableGatewayCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayDisableGatewayCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.DisableGatewayRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.DisableGatewayRequest {
		val input = com.amazonaws.services.storagegateway.model.DisableGatewayRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.disableGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway disable-gateway")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.listFileShares(init: AWSStorageGatewayListFileSharesCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayListFileSharesCommand().apply(init))
}

@Generated
class AWSStorageGatewayListFileSharesCommand() : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ListFileSharesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.listFileShares(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway list-file-shares")
				.argument("gateway-arn", gatewayARN)
				.argument("limit", limit?.toString())
				.argument("marker", marker)
	}

}


fun AWSStorageGatewayFunctions.listGateways(init: AWSStorageGatewayListGatewaysCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayListGatewaysCommand().apply(init))
}

@Generated
class AWSStorageGatewayListGatewaysCommand() : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ListGatewaysRequest> {

	var marker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.storagegateway.model.ListGatewaysRequest {
		val input = com.amazonaws.services.storagegateway.model.ListGatewaysRequest()
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.listGateways(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway list-gateways")
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AWSStorageGatewayFunctions.listLocalDisks(gatewayARN: String, init: AWSStorageGatewayListLocalDisksCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayListLocalDisksCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayListLocalDisksCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ListLocalDisksRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.ListLocalDisksRequest {
		val input = com.amazonaws.services.storagegateway.model.ListLocalDisksRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.listLocalDisks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway list-local-disks")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.listTagsForResource(resourceARN: String, init: AWSStorageGatewayListTagsForResourceCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayListTagsForResourceCommand(resourceARN).apply(init))
}

@Generated
class AWSStorageGatewayListTagsForResourceCommand(val resourceARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ListTagsForResourceRequest> {

	var marker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.storagegateway.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.storagegateway.model.ListTagsForResourceRequest()
		input.setResourceARN(this.resourceARN)
		input.setMarker(this.marker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway list-tags-for-resource")
				.argument("resource-arn", resourceARN)
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AWSStorageGatewayFunctions.listTapes(init: AWSStorageGatewayListTapesCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayListTapesCommand().apply(init))
}

@Generated
class AWSStorageGatewayListTapesCommand() : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ListTapesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.listTapes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway list-tapes")
				.argument("tape-arns", tapeARNs?.toString())
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AWSStorageGatewayFunctions.listVolumeInitiators(volumeARN: String, init: AWSStorageGatewayListVolumeInitiatorsCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayListVolumeInitiatorsCommand(volumeARN).apply(init))
}

@Generated
class AWSStorageGatewayListVolumeInitiatorsCommand(val volumeARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsRequest {
		val input = com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsRequest()
		input.setVolumeARN(this.volumeARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.listVolumeInitiators(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway list-volume-initiators")
				.argument("volume-arn", volumeARN)
	}

}


fun AWSStorageGatewayFunctions.listVolumeRecoveryPoints(gatewayARN: String, init: AWSStorageGatewayListVolumeRecoveryPointsCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayListVolumeRecoveryPointsCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayListVolumeRecoveryPointsCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsRequest {
		val input = com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.listVolumeRecoveryPoints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway list-volume-recovery-points")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.listVolumes(init: AWSStorageGatewayListVolumesCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayListVolumesCommand().apply(init))
}

@Generated
class AWSStorageGatewayListVolumesCommand() : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ListVolumesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.listVolumes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway list-volumes")
				.argument("gateway-arn", gatewayARN)
				.argument("marker", marker)
				.argument("limit", limit?.toString())
	}

}


fun AWSStorageGatewayFunctions.notifyWhenUploaded(fileShareARN: String, init: AWSStorageGatewayNotifyWhenUploadedCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayNotifyWhenUploadedCommand(fileShareARN).apply(init))
}

@Generated
class AWSStorageGatewayNotifyWhenUploadedCommand(val fileShareARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.NotifyWhenUploadedRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.NotifyWhenUploadedRequest {
		val input = com.amazonaws.services.storagegateway.model.NotifyWhenUploadedRequest()
		input.setFileShareARN(this.fileShareARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.notifyWhenUploaded(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway notify-when-uploaded")
				.argument("file-share-arn", fileShareARN)
	}

}


fun AWSStorageGatewayFunctions.refreshCache(fileShareARN: String, init: AWSStorageGatewayRefreshCacheCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayRefreshCacheCommand(fileShareARN).apply(init))
}

@Generated
class AWSStorageGatewayRefreshCacheCommand(val fileShareARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.RefreshCacheRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.RefreshCacheRequest {
		val input = com.amazonaws.services.storagegateway.model.RefreshCacheRequest()
		input.setFileShareARN(this.fileShareARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.refreshCache(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway refresh-cache")
				.argument("file-share-arn", fileShareARN)
	}

}


fun AWSStorageGatewayFunctions.removeTagsFromResource(resourceARN: String, tagKeys: List<String>, init: AWSStorageGatewayRemoveTagsFromResourceCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayRemoveTagsFromResourceCommand(resourceARN, tagKeys).apply(init))
}

@Generated
class AWSStorageGatewayRemoveTagsFromResourceCommand(val resourceARN: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceRequest {
		val input = com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceRequest()
		input.setResourceARN(this.resourceARN)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.removeTagsFromResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway remove-tags-from-resource")
				.argument("resource-arn", resourceARN)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSStorageGatewayFunctions.resetCache(gatewayARN: String, init: AWSStorageGatewayResetCacheCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayResetCacheCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayResetCacheCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ResetCacheRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.ResetCacheRequest {
		val input = com.amazonaws.services.storagegateway.model.ResetCacheRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.resetCache(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway reset-cache")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.retrieveTapeArchive(tapeARN: String, gatewayARN: String, init: AWSStorageGatewayRetrieveTapeArchiveCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayRetrieveTapeArchiveCommand(tapeARN, gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayRetrieveTapeArchiveCommand(val tapeARN: String, val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveRequest {
		val input = com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveRequest()
		input.setTapeARN(this.tapeARN)
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.retrieveTapeArchive(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway retrieve-tape-archive")
				.argument("tape-arn", tapeARN)
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.retrieveTapeRecoveryPoint(tapeARN: String, gatewayARN: String, init: AWSStorageGatewayRetrieveTapeRecoveryPointCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayRetrieveTapeRecoveryPointCommand(tapeARN, gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayRetrieveTapeRecoveryPointCommand(val tapeARN: String, val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointRequest {
		val input = com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointRequest()
		input.setTapeARN(this.tapeARN)
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.retrieveTapeRecoveryPoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway retrieve-tape-recovery-point")
				.argument("tape-arn", tapeARN)
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.setLocalConsolePassword(gatewayARN: String, localConsolePassword: String, init: AWSStorageGatewaySetLocalConsolePasswordCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewaySetLocalConsolePasswordCommand(gatewayARN, localConsolePassword).apply(init))
}

@Generated
class AWSStorageGatewaySetLocalConsolePasswordCommand(val gatewayARN: String, val localConsolePassword: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordRequest {
		val input = com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setLocalConsolePassword(this.localConsolePassword)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.setLocalConsolePassword(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway set-local-console-password")
				.argument("gateway-arn", gatewayARN)
				.argument("local-console-password", localConsolePassword)
	}

}


fun AWSStorageGatewayFunctions.shutdownGateway(gatewayARN: String, init: AWSStorageGatewayShutdownGatewayCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayShutdownGatewayCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayShutdownGatewayCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.ShutdownGatewayRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.ShutdownGatewayRequest {
		val input = com.amazonaws.services.storagegateway.model.ShutdownGatewayRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.shutdownGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway shutdown-gateway")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.startGateway(gatewayARN: String, init: AWSStorageGatewayStartGatewayCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayStartGatewayCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayStartGatewayCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.StartGatewayRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.StartGatewayRequest {
		val input = com.amazonaws.services.storagegateway.model.StartGatewayRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.startGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway start-gateway")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.updateBandwidthRateLimit(gatewayARN: String, init: AWSStorageGatewayUpdateBandwidthRateLimitCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayUpdateBandwidthRateLimitCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayUpdateBandwidthRateLimitCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitRequest> {

	var averageUploadRateLimitInBitsPerSec: Long? = 0L
	var averageDownloadRateLimitInBitsPerSec: Long? = 0L

	override fun build(): com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitRequest {
		val input = com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setAverageUploadRateLimitInBitsPerSec(this.averageUploadRateLimitInBitsPerSec)
		input.setAverageDownloadRateLimitInBitsPerSec(this.averageDownloadRateLimitInBitsPerSec)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.updateBandwidthRateLimit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway update-bandwidth-rate-limit")
				.argument("gateway-arn", gatewayARN)
				.argument("average-upload-rate-limit-in-bits-per-sec", averageUploadRateLimitInBitsPerSec?.toString())
				.argument("average-download-rate-limit-in-bits-per-sec", averageDownloadRateLimitInBitsPerSec?.toString())
	}

}


fun AWSStorageGatewayFunctions.updateChapCredentials(targetARN: String, secretToAuthenticateInitiator: String, initiatorName: String, init: AWSStorageGatewayUpdateChapCredentialsCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayUpdateChapCredentialsCommand(targetARN, secretToAuthenticateInitiator, initiatorName).apply(init))
}

@Generated
class AWSStorageGatewayUpdateChapCredentialsCommand(val targetARN: String, val secretToAuthenticateInitiator: String, val initiatorName: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.UpdateChapCredentialsRequest> {

	var secretToAuthenticateTarget: String? = null

	override fun build(): com.amazonaws.services.storagegateway.model.UpdateChapCredentialsRequest {
		val input = com.amazonaws.services.storagegateway.model.UpdateChapCredentialsRequest()
		input.setTargetARN(this.targetARN)
		input.setSecretToAuthenticateInitiator(this.secretToAuthenticateInitiator)
		input.setInitiatorName(this.initiatorName)
		input.setSecretToAuthenticateTarget(this.secretToAuthenticateTarget)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.updateChapCredentials(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway update-chap-credentials")
				.argument("target-arn", targetARN)
				.argument("secret-to-authenticate-initiator", secretToAuthenticateInitiator)
				.argument("initiator-name", initiatorName)
				.argument("secret-to-authenticate-target", secretToAuthenticateTarget)
	}

}


fun AWSStorageGatewayFunctions.updateGatewayInformation(gatewayARN: String, init: AWSStorageGatewayUpdateGatewayInformationCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayUpdateGatewayInformationCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayUpdateGatewayInformationCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.UpdateGatewayInformationRequest> {

	var gatewayName: String? = null
	var gatewayTimezone: String? = null

	override fun build(): com.amazonaws.services.storagegateway.model.UpdateGatewayInformationRequest {
		val input = com.amazonaws.services.storagegateway.model.UpdateGatewayInformationRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setGatewayName(this.gatewayName)
		input.setGatewayTimezone(this.gatewayTimezone)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.updateGatewayInformation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway update-gateway-information")
				.argument("gateway-arn", gatewayARN)
				.argument("gateway-name", gatewayName)
				.argument("gateway-timezone", gatewayTimezone)
	}

}


fun AWSStorageGatewayFunctions.updateGatewaySoftwareNow(gatewayARN: String, init: AWSStorageGatewayUpdateGatewaySoftwareNowCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayUpdateGatewaySoftwareNowCommand(gatewayARN).apply(init))
}

@Generated
class AWSStorageGatewayUpdateGatewaySoftwareNowCommand(val gatewayARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowRequest {
		val input = com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowRequest()
		input.setGatewayARN(this.gatewayARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.updateGatewaySoftwareNow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway update-gateway-software-now")
				.argument("gateway-arn", gatewayARN)
	}

}


fun AWSStorageGatewayFunctions.updateMaintenanceStartTime(gatewayARN: String, hourOfDay: Int, minuteOfHour: Int, dayOfWeek: Int, init: AWSStorageGatewayUpdateMaintenanceStartTimeCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayUpdateMaintenanceStartTimeCommand(gatewayARN, hourOfDay, minuteOfHour, dayOfWeek).apply(init))
}

@Generated
class AWSStorageGatewayUpdateMaintenanceStartTimeCommand(val gatewayARN: String, val hourOfDay: Int, val minuteOfHour: Int, val dayOfWeek: Int) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeRequest {
		val input = com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeRequest()
		input.setGatewayARN(this.gatewayARN)
		input.setHourOfDay(this.hourOfDay)
		input.setMinuteOfHour(this.minuteOfHour)
		input.setDayOfWeek(this.dayOfWeek)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.updateMaintenanceStartTime(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway update-maintenance-start-time")
				.argument("gateway-arn", gatewayARN)
				.argument("hour-of-day", hourOfDay.toString())
				.argument("minute-of-hour", minuteOfHour.toString())
				.argument("day-of-week", dayOfWeek.toString())
	}

}


fun AWSStorageGatewayFunctions.updateNFSFileShare(fileShareARN: String, init: AWSStorageGatewayUpdateNFSFileShareCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayUpdateNFSFileShareCommand(fileShareARN).apply(init))
}

@Generated
class AWSStorageGatewayUpdateNFSFileShareCommand(val fileShareARN: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.UpdateNFSFileShareRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.updateNFSFileShare(build())
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


fun AWSStorageGatewayFunctions.updateSnapshotSchedule(volumeARN: String, startAt: Int, recurrenceInHours: Int, init: AWSStorageGatewayUpdateSnapshotScheduleCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayUpdateSnapshotScheduleCommand(volumeARN, startAt, recurrenceInHours).apply(init))
}

@Generated
class AWSStorageGatewayUpdateSnapshotScheduleCommand(val volumeARN: String, val startAt: Int, val recurrenceInHours: Int) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleRequest> {

	var description: String? = null

	override fun build(): com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleRequest {
		val input = com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleRequest()
		input.setVolumeARN(this.volumeARN)
		input.setStartAt(this.startAt)
		input.setRecurrenceInHours(this.recurrenceInHours)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.updateSnapshotSchedule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway update-snapshot-schedule")
				.argument("volume-arn", volumeARN)
				.argument("start-at", startAt.toString())
				.argument("recurrence-in-hours", recurrenceInHours.toString())
				.argument("description", description)
	}

}


fun AWSStorageGatewayFunctions.updateVTLDeviceType(vTLDeviceARN: String, deviceType: String, init: AWSStorageGatewayUpdateVTLDeviceTypeCommand.() -> Unit) {
	this.block.declare(AWSStorageGatewayUpdateVTLDeviceTypeCommand(vTLDeviceARN, deviceType).apply(init))
}

@Generated
class AWSStorageGatewayUpdateVTLDeviceTypeCommand(val vTLDeviceARN: String, val deviceType: String) : AmazonWebServiceCommand<com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeRequest> {



	override fun build(): com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeRequest {
		val input = com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeRequest()
		input.setVTLDeviceARN(this.vTLDeviceARN)
		input.setDeviceType(this.deviceType)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.storagegateway.updateVTLDeviceType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws storagegateway update-vtldevice-type")
				.argument("vtldevice-arn", vTLDeviceARN)
				.argument("device-type", deviceType)
	}

}
