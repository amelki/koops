
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.devicefarm

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.devicefarm.*
import com.amazonaws.services.devicefarm.model.*

var codingue.koops.core.Environment.devicefarm: AWSDeviceFarm
	get() {
		var service = this.capabilities["aws-devicefarm"]
		if (service == null) {
			service = AWSDeviceFarmClientBuilder.standard().build()
			this.capabilities["aws-devicefarm"] = service
		}
		return service as AWSDeviceFarm
	}
	set(devicefarm) {
		this.capabilities["aws-devicefarm"] = devicefarm
	}

@Generated
class AWSDeviceFarmFunctions(val block: Block)

infix fun <T> AwsContinuation.devicefarm(init: AWSDeviceFarmFunctions.() -> T): T {
	return AWSDeviceFarmFunctions(shell).run(init)
}

			

fun AWSDeviceFarmFunctions.createDevicePool(init: AWSDeviceFarmCreateDevicePoolCommand.() -> Unit): com.amazonaws.services.devicefarm.model.CreateDevicePoolResult {
	return this.block.declare(AWSDeviceFarmCreateDevicePoolCommand().apply(init)) as com.amazonaws.services.devicefarm.model.CreateDevicePoolResult
}

@Generated
class AWSDeviceFarmCreateDevicePoolCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.CreateDevicePoolRequest, com.amazonaws.services.devicefarm.model.CreateDevicePoolResult> {

	var projectArn: String? = null
	var name: String? = null
	var description: String? = null
	var rules: List<com.amazonaws.services.devicefarm.model.Rule>? = null

	override fun build(): com.amazonaws.services.devicefarm.model.CreateDevicePoolRequest {
		val input = com.amazonaws.services.devicefarm.model.CreateDevicePoolRequest()
		input.setProjectArn(this.projectArn)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setRules(this.rules)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.CreateDevicePoolResult {
	  return com.amazonaws.services.devicefarm.model.CreateDevicePoolResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.CreateDevicePoolResult {
		return environment.devicefarm.createDevicePool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm create-device-pool")
				.argument("project-arn", projectArn)
				.argument("name", name)
				.argument("description", description)
				.argument("rules", rules?.toString())
	}

}


fun AWSDeviceFarmFunctions.createInstanceProfile(init: AWSDeviceFarmCreateInstanceProfileCommand.() -> Unit): com.amazonaws.services.devicefarm.model.CreateInstanceProfileResult {
	return this.block.declare(AWSDeviceFarmCreateInstanceProfileCommand().apply(init)) as com.amazonaws.services.devicefarm.model.CreateInstanceProfileResult
}

@Generated
class AWSDeviceFarmCreateInstanceProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.CreateInstanceProfileRequest, com.amazonaws.services.devicefarm.model.CreateInstanceProfileResult> {

	var name: String? = null
	var description: String? = null
	var packageCleanup: Boolean? = false
	var excludeAppPackagesFromCleanup: List<String>? = null
	var rebootAfterUse: Boolean? = false

	override fun build(): com.amazonaws.services.devicefarm.model.CreateInstanceProfileRequest {
		val input = com.amazonaws.services.devicefarm.model.CreateInstanceProfileRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setPackageCleanup(this.packageCleanup)
		input.setExcludeAppPackagesFromCleanup(this.excludeAppPackagesFromCleanup)
		input.setRebootAfterUse(this.rebootAfterUse)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.CreateInstanceProfileResult {
	  return com.amazonaws.services.devicefarm.model.CreateInstanceProfileResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.CreateInstanceProfileResult {
		return environment.devicefarm.createInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm create-instance-profile")
				.argument("name", name)
				.argument("description", description)
				.option("package-cleanup", packageCleanup ?: false)
				.argument("exclude-app-packages-from-cleanup", excludeAppPackagesFromCleanup?.toString())
				.option("reboot-after-use", rebootAfterUse ?: false)
	}

}


fun AWSDeviceFarmFunctions.createNetworkProfile(init: AWSDeviceFarmCreateNetworkProfileCommand.() -> Unit): com.amazonaws.services.devicefarm.model.CreateNetworkProfileResult {
	return this.block.declare(AWSDeviceFarmCreateNetworkProfileCommand().apply(init)) as com.amazonaws.services.devicefarm.model.CreateNetworkProfileResult
}

@Generated
class AWSDeviceFarmCreateNetworkProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.CreateNetworkProfileRequest, com.amazonaws.services.devicefarm.model.CreateNetworkProfileResult> {

	var projectArn: String? = null
	var name: String? = null
	var description: String? = null
	var type: NetworkProfileType? = null
	var uplinkBandwidthBits: Long? = 0L
	var downlinkBandwidthBits: Long? = 0L
	var uplinkDelayMs: Long? = 0L
	var downlinkDelayMs: Long? = 0L
	var uplinkJitterMs: Long? = 0L
	var downlinkJitterMs: Long? = 0L
	var uplinkLossPercent: Int? = 0
	var downlinkLossPercent: Int? = 0

	override fun build(): com.amazonaws.services.devicefarm.model.CreateNetworkProfileRequest {
		val input = com.amazonaws.services.devicefarm.model.CreateNetworkProfileRequest()
		input.setProjectArn(this.projectArn)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setType(this.type?.toString())
		input.setUplinkBandwidthBits(this.uplinkBandwidthBits)
		input.setDownlinkBandwidthBits(this.downlinkBandwidthBits)
		input.setUplinkDelayMs(this.uplinkDelayMs)
		input.setDownlinkDelayMs(this.downlinkDelayMs)
		input.setUplinkJitterMs(this.uplinkJitterMs)
		input.setDownlinkJitterMs(this.downlinkJitterMs)
		input.setUplinkLossPercent(this.uplinkLossPercent)
		input.setDownlinkLossPercent(this.downlinkLossPercent)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.CreateNetworkProfileResult {
	  return com.amazonaws.services.devicefarm.model.CreateNetworkProfileResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.CreateNetworkProfileResult {
		return environment.devicefarm.createNetworkProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm create-network-profile")
				.argument("project-arn", projectArn)
				.argument("name", name)
				.argument("description", description)
				.argument("type", type?.toString())
				.argument("uplink-bandwidth-bits", uplinkBandwidthBits?.toString())
				.argument("downlink-bandwidth-bits", downlinkBandwidthBits?.toString())
				.argument("uplink-delay-ms", uplinkDelayMs?.toString())
				.argument("downlink-delay-ms", downlinkDelayMs?.toString())
				.argument("uplink-jitter-ms", uplinkJitterMs?.toString())
				.argument("downlink-jitter-ms", downlinkJitterMs?.toString())
				.argument("uplink-loss-percent", uplinkLossPercent?.toString())
				.argument("downlink-loss-percent", downlinkLossPercent?.toString())
	}

}


fun AWSDeviceFarmFunctions.createProject(init: AWSDeviceFarmCreateProjectCommand.() -> Unit): com.amazonaws.services.devicefarm.model.CreateProjectResult {
	return this.block.declare(AWSDeviceFarmCreateProjectCommand().apply(init)) as com.amazonaws.services.devicefarm.model.CreateProjectResult
}

@Generated
class AWSDeviceFarmCreateProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.CreateProjectRequest, com.amazonaws.services.devicefarm.model.CreateProjectResult> {

	var name: String? = null
	var defaultJobTimeoutMinutes: Int? = 0

	override fun build(): com.amazonaws.services.devicefarm.model.CreateProjectRequest {
		val input = com.amazonaws.services.devicefarm.model.CreateProjectRequest()
		input.setName(this.name)
		input.setDefaultJobTimeoutMinutes(this.defaultJobTimeoutMinutes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.CreateProjectResult {
	  return com.amazonaws.services.devicefarm.model.CreateProjectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.CreateProjectResult {
		return environment.devicefarm.createProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm create-project")
				.argument("name", name)
				.argument("default-job-timeout-minutes", defaultJobTimeoutMinutes?.toString())
	}

}


fun AWSDeviceFarmFunctions.createRemoteAccessSession(init: AWSDeviceFarmCreateRemoteAccessSessionCommand.() -> Unit): com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionResult {
	return this.block.declare(AWSDeviceFarmCreateRemoteAccessSessionCommand().apply(init)) as com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionResult
}

@Generated
class AWSDeviceFarmCreateRemoteAccessSessionCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionRequest, com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionResult> {

	var projectArn: String? = null
	var deviceArn: String? = null
	var instanceArn: String? = null
	var sshPublicKey: String? = null
	var remoteDebugEnabled: Boolean? = false
	var remoteRecordEnabled: Boolean? = false
	var remoteRecordAppArn: String? = null
	var name: String? = null
	var clientId: String? = null
	var configuration: com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionConfiguration? = null
	var interactionMode: InteractionMode? = null
	var skipAppResign: Boolean? = false

	override fun build(): com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionRequest {
		val input = com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionRequest()
		input.setProjectArn(this.projectArn)
		input.setDeviceArn(this.deviceArn)
		input.setInstanceArn(this.instanceArn)
		input.setSshPublicKey(this.sshPublicKey)
		input.setRemoteDebugEnabled(this.remoteDebugEnabled)
		input.setRemoteRecordEnabled(this.remoteRecordEnabled)
		input.setRemoteRecordAppArn(this.remoteRecordAppArn)
		input.setName(this.name)
		input.setClientId(this.clientId)
		input.setConfiguration(this.configuration)
		input.setInteractionMode(this.interactionMode?.toString())
		input.setSkipAppResign(this.skipAppResign)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionResult {
	  return com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionResult {
		return environment.devicefarm.createRemoteAccessSession(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm create-remote-access-session")
				.argument("project-arn", projectArn)
				.argument("device-arn", deviceArn)
				.argument("instance-arn", instanceArn)
				.argument("ssh-public-key", sshPublicKey)
				.option("remote-debug-enabled", remoteDebugEnabled ?: false)
				.option("remote-record-enabled", remoteRecordEnabled ?: false)
				.argument("remote-record-app-arn", remoteRecordAppArn)
				.argument("name", name)
				.argument("client-id", clientId)
				.argument("configuration", configuration?.toString())
				.argument("interaction-mode", interactionMode?.toString())
				.option("skip-app-resign", skipAppResign ?: false)
	}

}


fun AWSDeviceFarmFunctions.createUpload(init: AWSDeviceFarmCreateUploadCommand.() -> Unit): com.amazonaws.services.devicefarm.model.CreateUploadResult {
	return this.block.declare(AWSDeviceFarmCreateUploadCommand().apply(init)) as com.amazonaws.services.devicefarm.model.CreateUploadResult
}

@Generated
class AWSDeviceFarmCreateUploadCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.CreateUploadRequest, com.amazonaws.services.devicefarm.model.CreateUploadResult> {

	var projectArn: String? = null
	var name: String? = null
	var type: UploadType? = null
	var contentType: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.CreateUploadRequest {
		val input = com.amazonaws.services.devicefarm.model.CreateUploadRequest()
		input.setProjectArn(this.projectArn)
		input.setName(this.name)
		input.setType(this.type?.toString())
		input.setContentType(this.contentType)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.CreateUploadResult {
	  return com.amazonaws.services.devicefarm.model.CreateUploadResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.CreateUploadResult {
		return environment.devicefarm.createUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm create-upload")
				.argument("project-arn", projectArn)
				.argument("name", name)
				.argument("type", type?.toString())
				.argument("content-type", contentType)
	}

}


fun AWSDeviceFarmFunctions.deleteDevicePool(init: AWSDeviceFarmDeleteDevicePoolCommand.() -> Unit): com.amazonaws.services.devicefarm.model.DeleteDevicePoolResult {
	return this.block.declare(AWSDeviceFarmDeleteDevicePoolCommand().apply(init)) as com.amazonaws.services.devicefarm.model.DeleteDevicePoolResult
}

@Generated
class AWSDeviceFarmDeleteDevicePoolCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest, com.amazonaws.services.devicefarm.model.DeleteDevicePoolResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest {
		val input = com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.DeleteDevicePoolResult {
	  return com.amazonaws.services.devicefarm.model.DeleteDevicePoolResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.DeleteDevicePoolResult {
		return environment.devicefarm.deleteDevicePool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm delete-device-pool")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.deleteInstanceProfile(init: AWSDeviceFarmDeleteInstanceProfileCommand.() -> Unit): com.amazonaws.services.devicefarm.model.DeleteInstanceProfileResult {
	return this.block.declare(AWSDeviceFarmDeleteInstanceProfileCommand().apply(init)) as com.amazonaws.services.devicefarm.model.DeleteInstanceProfileResult
}

@Generated
class AWSDeviceFarmDeleteInstanceProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest, com.amazonaws.services.devicefarm.model.DeleteInstanceProfileResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest {
		val input = com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.DeleteInstanceProfileResult {
	  return com.amazonaws.services.devicefarm.model.DeleteInstanceProfileResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.DeleteInstanceProfileResult {
		return environment.devicefarm.deleteInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm delete-instance-profile")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.deleteNetworkProfile(init: AWSDeviceFarmDeleteNetworkProfileCommand.() -> Unit): com.amazonaws.services.devicefarm.model.DeleteNetworkProfileResult {
	return this.block.declare(AWSDeviceFarmDeleteNetworkProfileCommand().apply(init)) as com.amazonaws.services.devicefarm.model.DeleteNetworkProfileResult
}

@Generated
class AWSDeviceFarmDeleteNetworkProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest, com.amazonaws.services.devicefarm.model.DeleteNetworkProfileResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest {
		val input = com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.DeleteNetworkProfileResult {
	  return com.amazonaws.services.devicefarm.model.DeleteNetworkProfileResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.DeleteNetworkProfileResult {
		return environment.devicefarm.deleteNetworkProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm delete-network-profile")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.deleteProject(init: AWSDeviceFarmDeleteProjectCommand.() -> Unit): com.amazonaws.services.devicefarm.model.DeleteProjectResult {
	return this.block.declare(AWSDeviceFarmDeleteProjectCommand().apply(init)) as com.amazonaws.services.devicefarm.model.DeleteProjectResult
}

@Generated
class AWSDeviceFarmDeleteProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.DeleteProjectRequest, com.amazonaws.services.devicefarm.model.DeleteProjectResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.DeleteProjectRequest {
		val input = com.amazonaws.services.devicefarm.model.DeleteProjectRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.DeleteProjectResult {
	  return com.amazonaws.services.devicefarm.model.DeleteProjectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.DeleteProjectResult {
		return environment.devicefarm.deleteProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm delete-project")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.deleteRemoteAccessSession(init: AWSDeviceFarmDeleteRemoteAccessSessionCommand.() -> Unit): com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionResult {
	return this.block.declare(AWSDeviceFarmDeleteRemoteAccessSessionCommand().apply(init)) as com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionResult
}

@Generated
class AWSDeviceFarmDeleteRemoteAccessSessionCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest, com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest {
		val input = com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionResult {
	  return com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionResult {
		return environment.devicefarm.deleteRemoteAccessSession(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm delete-remote-access-session")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.deleteRun(init: AWSDeviceFarmDeleteRunCommand.() -> Unit): com.amazonaws.services.devicefarm.model.DeleteRunResult {
	return this.block.declare(AWSDeviceFarmDeleteRunCommand().apply(init)) as com.amazonaws.services.devicefarm.model.DeleteRunResult
}

@Generated
class AWSDeviceFarmDeleteRunCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.DeleteRunRequest, com.amazonaws.services.devicefarm.model.DeleteRunResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.DeleteRunRequest {
		val input = com.amazonaws.services.devicefarm.model.DeleteRunRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.DeleteRunResult {
	  return com.amazonaws.services.devicefarm.model.DeleteRunResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.DeleteRunResult {
		return environment.devicefarm.deleteRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm delete-run")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.deleteUpload(init: AWSDeviceFarmDeleteUploadCommand.() -> Unit): com.amazonaws.services.devicefarm.model.DeleteUploadResult {
	return this.block.declare(AWSDeviceFarmDeleteUploadCommand().apply(init)) as com.amazonaws.services.devicefarm.model.DeleteUploadResult
}

@Generated
class AWSDeviceFarmDeleteUploadCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.DeleteUploadRequest, com.amazonaws.services.devicefarm.model.DeleteUploadResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.DeleteUploadRequest {
		val input = com.amazonaws.services.devicefarm.model.DeleteUploadRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.DeleteUploadResult {
	  return com.amazonaws.services.devicefarm.model.DeleteUploadResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.DeleteUploadResult {
		return environment.devicefarm.deleteUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm delete-upload")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getAccountSettings(init: AWSDeviceFarmGetAccountSettingsCommand.() -> Unit): com.amazonaws.services.devicefarm.model.GetAccountSettingsResult {
	return this.block.declare(AWSDeviceFarmGetAccountSettingsCommand().apply(init)) as com.amazonaws.services.devicefarm.model.GetAccountSettingsResult
}

@Generated
class AWSDeviceFarmGetAccountSettingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest, com.amazonaws.services.devicefarm.model.GetAccountSettingsResult> {



	override fun build(): com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest {
		val input = com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.GetAccountSettingsResult {
	  return com.amazonaws.services.devicefarm.model.GetAccountSettingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.GetAccountSettingsResult {
		return environment.devicefarm.getAccountSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-account-settings")

	}

}


fun AWSDeviceFarmFunctions.getDevice(init: AWSDeviceFarmGetDeviceCommand.() -> Unit): com.amazonaws.services.devicefarm.model.GetDeviceResult {
	return this.block.declare(AWSDeviceFarmGetDeviceCommand().apply(init)) as com.amazonaws.services.devicefarm.model.GetDeviceResult
}

@Generated
class AWSDeviceFarmGetDeviceCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetDeviceRequest, com.amazonaws.services.devicefarm.model.GetDeviceResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetDeviceRequest {
		val input = com.amazonaws.services.devicefarm.model.GetDeviceRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.GetDeviceResult {
	  return com.amazonaws.services.devicefarm.model.GetDeviceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.GetDeviceResult {
		return environment.devicefarm.getDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-device")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getDeviceInstance(init: AWSDeviceFarmGetDeviceInstanceCommand.() -> Unit): com.amazonaws.services.devicefarm.model.GetDeviceInstanceResult {
	return this.block.declare(AWSDeviceFarmGetDeviceInstanceCommand().apply(init)) as com.amazonaws.services.devicefarm.model.GetDeviceInstanceResult
}

@Generated
class AWSDeviceFarmGetDeviceInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest, com.amazonaws.services.devicefarm.model.GetDeviceInstanceResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest {
		val input = com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.GetDeviceInstanceResult {
	  return com.amazonaws.services.devicefarm.model.GetDeviceInstanceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.GetDeviceInstanceResult {
		return environment.devicefarm.getDeviceInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-device-instance")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getDevicePool(init: AWSDeviceFarmGetDevicePoolCommand.() -> Unit): com.amazonaws.services.devicefarm.model.GetDevicePoolResult {
	return this.block.declare(AWSDeviceFarmGetDevicePoolCommand().apply(init)) as com.amazonaws.services.devicefarm.model.GetDevicePoolResult
}

@Generated
class AWSDeviceFarmGetDevicePoolCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetDevicePoolRequest, com.amazonaws.services.devicefarm.model.GetDevicePoolResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetDevicePoolRequest {
		val input = com.amazonaws.services.devicefarm.model.GetDevicePoolRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.GetDevicePoolResult {
	  return com.amazonaws.services.devicefarm.model.GetDevicePoolResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.GetDevicePoolResult {
		return environment.devicefarm.getDevicePool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-device-pool")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getDevicePoolCompatibility(init: AWSDeviceFarmGetDevicePoolCompatibilityCommand.() -> Unit): com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityResult {
	return this.block.declare(AWSDeviceFarmGetDevicePoolCompatibilityCommand().apply(init)) as com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityResult
}

@Generated
class AWSDeviceFarmGetDevicePoolCompatibilityCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityRequest, com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityResult> {

	var devicePoolArn: String? = null
	var appArn: String? = null
	var testType: TestType? = null
	var test: com.amazonaws.services.devicefarm.model.ScheduleRunTest? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityRequest {
		val input = com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityRequest()
		input.setDevicePoolArn(this.devicePoolArn)
		input.setAppArn(this.appArn)
		input.setTestType(this.testType?.toString())
		input.setTest(this.test)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityResult {
	  return com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityResult {
		return environment.devicefarm.getDevicePoolCompatibility(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-device-pool-compatibility")
				.argument("device-pool-arn", devicePoolArn)
				.argument("app-arn", appArn)
				.argument("test-type", testType?.toString())
				.argument("test", test?.toString())
	}

}


fun AWSDeviceFarmFunctions.getInstanceProfile(init: AWSDeviceFarmGetInstanceProfileCommand.() -> Unit): com.amazonaws.services.devicefarm.model.GetInstanceProfileResult {
	return this.block.declare(AWSDeviceFarmGetInstanceProfileCommand().apply(init)) as com.amazonaws.services.devicefarm.model.GetInstanceProfileResult
}

@Generated
class AWSDeviceFarmGetInstanceProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest, com.amazonaws.services.devicefarm.model.GetInstanceProfileResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest {
		val input = com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.GetInstanceProfileResult {
	  return com.amazonaws.services.devicefarm.model.GetInstanceProfileResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.GetInstanceProfileResult {
		return environment.devicefarm.getInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-instance-profile")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getJob(init: AWSDeviceFarmGetJobCommand.() -> Unit): com.amazonaws.services.devicefarm.model.GetJobResult {
	return this.block.declare(AWSDeviceFarmGetJobCommand().apply(init)) as com.amazonaws.services.devicefarm.model.GetJobResult
}

@Generated
class AWSDeviceFarmGetJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetJobRequest, com.amazonaws.services.devicefarm.model.GetJobResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetJobRequest {
		val input = com.amazonaws.services.devicefarm.model.GetJobRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.GetJobResult {
	  return com.amazonaws.services.devicefarm.model.GetJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.GetJobResult {
		return environment.devicefarm.getJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-job")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getNetworkProfile(init: AWSDeviceFarmGetNetworkProfileCommand.() -> Unit): com.amazonaws.services.devicefarm.model.GetNetworkProfileResult {
	return this.block.declare(AWSDeviceFarmGetNetworkProfileCommand().apply(init)) as com.amazonaws.services.devicefarm.model.GetNetworkProfileResult
}

@Generated
class AWSDeviceFarmGetNetworkProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest, com.amazonaws.services.devicefarm.model.GetNetworkProfileResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest {
		val input = com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.GetNetworkProfileResult {
	  return com.amazonaws.services.devicefarm.model.GetNetworkProfileResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.GetNetworkProfileResult {
		return environment.devicefarm.getNetworkProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-network-profile")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getOfferingStatus(init: AWSDeviceFarmGetOfferingStatusCommand.() -> Unit): com.amazonaws.services.devicefarm.model.GetOfferingStatusResult {
	return this.block.declare(AWSDeviceFarmGetOfferingStatusCommand().apply(init)) as com.amazonaws.services.devicefarm.model.GetOfferingStatusResult
}

@Generated
class AWSDeviceFarmGetOfferingStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest, com.amazonaws.services.devicefarm.model.GetOfferingStatusResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest {
		val input = com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.GetOfferingStatusResult {
	  return com.amazonaws.services.devicefarm.model.GetOfferingStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.GetOfferingStatusResult {
		return environment.devicefarm.getOfferingStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-offering-status")
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.getProject(init: AWSDeviceFarmGetProjectCommand.() -> Unit): com.amazonaws.services.devicefarm.model.GetProjectResult {
	return this.block.declare(AWSDeviceFarmGetProjectCommand().apply(init)) as com.amazonaws.services.devicefarm.model.GetProjectResult
}

@Generated
class AWSDeviceFarmGetProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetProjectRequest, com.amazonaws.services.devicefarm.model.GetProjectResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetProjectRequest {
		val input = com.amazonaws.services.devicefarm.model.GetProjectRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.GetProjectResult {
	  return com.amazonaws.services.devicefarm.model.GetProjectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.GetProjectResult {
		return environment.devicefarm.getProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-project")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getRemoteAccessSession(init: AWSDeviceFarmGetRemoteAccessSessionCommand.() -> Unit): com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionResult {
	return this.block.declare(AWSDeviceFarmGetRemoteAccessSessionCommand().apply(init)) as com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionResult
}

@Generated
class AWSDeviceFarmGetRemoteAccessSessionCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest, com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest {
		val input = com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionResult {
	  return com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionResult {
		return environment.devicefarm.getRemoteAccessSession(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-remote-access-session")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getRun(init: AWSDeviceFarmGetRunCommand.() -> Unit): com.amazonaws.services.devicefarm.model.GetRunResult {
	return this.block.declare(AWSDeviceFarmGetRunCommand().apply(init)) as com.amazonaws.services.devicefarm.model.GetRunResult
}

@Generated
class AWSDeviceFarmGetRunCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetRunRequest, com.amazonaws.services.devicefarm.model.GetRunResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetRunRequest {
		val input = com.amazonaws.services.devicefarm.model.GetRunRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.GetRunResult {
	  return com.amazonaws.services.devicefarm.model.GetRunResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.GetRunResult {
		return environment.devicefarm.getRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-run")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getSuite(init: AWSDeviceFarmGetSuiteCommand.() -> Unit): com.amazonaws.services.devicefarm.model.GetSuiteResult {
	return this.block.declare(AWSDeviceFarmGetSuiteCommand().apply(init)) as com.amazonaws.services.devicefarm.model.GetSuiteResult
}

@Generated
class AWSDeviceFarmGetSuiteCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetSuiteRequest, com.amazonaws.services.devicefarm.model.GetSuiteResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetSuiteRequest {
		val input = com.amazonaws.services.devicefarm.model.GetSuiteRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.GetSuiteResult {
	  return com.amazonaws.services.devicefarm.model.GetSuiteResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.GetSuiteResult {
		return environment.devicefarm.getSuite(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-suite")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getTest(init: AWSDeviceFarmGetTestCommand.() -> Unit): com.amazonaws.services.devicefarm.model.GetTestResult {
	return this.block.declare(AWSDeviceFarmGetTestCommand().apply(init)) as com.amazonaws.services.devicefarm.model.GetTestResult
}

@Generated
class AWSDeviceFarmGetTestCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetTestRequest, com.amazonaws.services.devicefarm.model.GetTestResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetTestRequest {
		val input = com.amazonaws.services.devicefarm.model.GetTestRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.GetTestResult {
	  return com.amazonaws.services.devicefarm.model.GetTestResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.GetTestResult {
		return environment.devicefarm.getTest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-test")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getUpload(init: AWSDeviceFarmGetUploadCommand.() -> Unit): com.amazonaws.services.devicefarm.model.GetUploadResult {
	return this.block.declare(AWSDeviceFarmGetUploadCommand().apply(init)) as com.amazonaws.services.devicefarm.model.GetUploadResult
}

@Generated
class AWSDeviceFarmGetUploadCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetUploadRequest, com.amazonaws.services.devicefarm.model.GetUploadResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetUploadRequest {
		val input = com.amazonaws.services.devicefarm.model.GetUploadRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.GetUploadResult {
	  return com.amazonaws.services.devicefarm.model.GetUploadResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.GetUploadResult {
		return environment.devicefarm.getUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-upload")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.installToRemoteAccessSession(init: AWSDeviceFarmInstallToRemoteAccessSessionCommand.() -> Unit): com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionResult {
	return this.block.declare(AWSDeviceFarmInstallToRemoteAccessSessionCommand().apply(init)) as com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionResult
}

@Generated
class AWSDeviceFarmInstallToRemoteAccessSessionCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest, com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionResult> {

	var remoteAccessSessionArn: String? = null
	var appArn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest {
		val input = com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest()
		input.setRemoteAccessSessionArn(this.remoteAccessSessionArn)
		input.setAppArn(this.appArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionResult {
	  return com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionResult {
		return environment.devicefarm.installToRemoteAccessSession(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm install-to-remote-access-session")
				.argument("remote-access-session-arn", remoteAccessSessionArn)
				.argument("app-arn", appArn)
	}

}


fun AWSDeviceFarmFunctions.listArtifacts(init: AWSDeviceFarmListArtifactsCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListArtifactsResult {
	return this.block.declare(AWSDeviceFarmListArtifactsCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListArtifactsResult
}

@Generated
class AWSDeviceFarmListArtifactsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListArtifactsRequest, com.amazonaws.services.devicefarm.model.ListArtifactsResult> {

	var arn: String? = null
	var type: ArtifactCategory? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListArtifactsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListArtifactsRequest()
		input.setArn(this.arn)
		input.setType(this.type?.toString())
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListArtifactsResult {
	  return com.amazonaws.services.devicefarm.model.ListArtifactsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListArtifactsResult {
		return environment.devicefarm.listArtifacts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-artifacts")
				.argument("arn", arn)
				.argument("type", type?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listDeviceInstances(init: AWSDeviceFarmListDeviceInstancesCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListDeviceInstancesResult {
	return this.block.declare(AWSDeviceFarmListDeviceInstancesCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListDeviceInstancesResult
}

@Generated
class AWSDeviceFarmListDeviceInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest, com.amazonaws.services.devicefarm.model.ListDeviceInstancesResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest {
		val input = com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListDeviceInstancesResult {
	  return com.amazonaws.services.devicefarm.model.ListDeviceInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListDeviceInstancesResult {
		return environment.devicefarm.listDeviceInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-device-instances")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listDevicePools(init: AWSDeviceFarmListDevicePoolsCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListDevicePoolsResult {
	return this.block.declare(AWSDeviceFarmListDevicePoolsCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListDevicePoolsResult
}

@Generated
class AWSDeviceFarmListDevicePoolsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListDevicePoolsRequest, com.amazonaws.services.devicefarm.model.ListDevicePoolsResult> {

	var arn: String? = null
	var type: DevicePoolType? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListDevicePoolsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListDevicePoolsRequest()
		input.setArn(this.arn)
		input.setType(this.type?.toString())
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListDevicePoolsResult {
	  return com.amazonaws.services.devicefarm.model.ListDevicePoolsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListDevicePoolsResult {
		return environment.devicefarm.listDevicePools(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-device-pools")
				.argument("arn", arn)
				.argument("type", type?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listDevices(init: AWSDeviceFarmListDevicesCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListDevicesResult {
	return this.block.declare(AWSDeviceFarmListDevicesCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListDevicesResult
}

@Generated
class AWSDeviceFarmListDevicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListDevicesRequest, com.amazonaws.services.devicefarm.model.ListDevicesResult> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListDevicesRequest {
		val input = com.amazonaws.services.devicefarm.model.ListDevicesRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListDevicesResult {
	  return com.amazonaws.services.devicefarm.model.ListDevicesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListDevicesResult {
		return environment.devicefarm.listDevices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-devices")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listInstanceProfiles(init: AWSDeviceFarmListInstanceProfilesCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListInstanceProfilesResult {
	return this.block.declare(AWSDeviceFarmListInstanceProfilesCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListInstanceProfilesResult
}

@Generated
class AWSDeviceFarmListInstanceProfilesCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest, com.amazonaws.services.devicefarm.model.ListInstanceProfilesResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest {
		val input = com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListInstanceProfilesResult {
	  return com.amazonaws.services.devicefarm.model.ListInstanceProfilesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListInstanceProfilesResult {
		return environment.devicefarm.listInstanceProfiles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-instance-profiles")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listJobs(init: AWSDeviceFarmListJobsCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListJobsResult {
	return this.block.declare(AWSDeviceFarmListJobsCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListJobsResult
}

@Generated
class AWSDeviceFarmListJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListJobsRequest, com.amazonaws.services.devicefarm.model.ListJobsResult> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListJobsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListJobsRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListJobsResult {
	  return com.amazonaws.services.devicefarm.model.ListJobsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListJobsResult {
		return environment.devicefarm.listJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-jobs")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listNetworkProfiles(init: AWSDeviceFarmListNetworkProfilesCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListNetworkProfilesResult {
	return this.block.declare(AWSDeviceFarmListNetworkProfilesCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListNetworkProfilesResult
}

@Generated
class AWSDeviceFarmListNetworkProfilesCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListNetworkProfilesRequest, com.amazonaws.services.devicefarm.model.ListNetworkProfilesResult> {

	var arn: String? = null
	var type: NetworkProfileType? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListNetworkProfilesRequest {
		val input = com.amazonaws.services.devicefarm.model.ListNetworkProfilesRequest()
		input.setArn(this.arn)
		input.setType(this.type?.toString())
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListNetworkProfilesResult {
	  return com.amazonaws.services.devicefarm.model.ListNetworkProfilesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListNetworkProfilesResult {
		return environment.devicefarm.listNetworkProfiles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-network-profiles")
				.argument("arn", arn)
				.argument("type", type?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listOfferingPromotions(init: AWSDeviceFarmListOfferingPromotionsCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListOfferingPromotionsResult {
	return this.block.declare(AWSDeviceFarmListOfferingPromotionsCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListOfferingPromotionsResult
}

@Generated
class AWSDeviceFarmListOfferingPromotionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest, com.amazonaws.services.devicefarm.model.ListOfferingPromotionsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListOfferingPromotionsResult {
	  return com.amazonaws.services.devicefarm.model.ListOfferingPromotionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListOfferingPromotionsResult {
		return environment.devicefarm.listOfferingPromotions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-offering-promotions")
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listOfferingTransactions(init: AWSDeviceFarmListOfferingTransactionsCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListOfferingTransactionsResult {
	return this.block.declare(AWSDeviceFarmListOfferingTransactionsCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListOfferingTransactionsResult
}

@Generated
class AWSDeviceFarmListOfferingTransactionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest, com.amazonaws.services.devicefarm.model.ListOfferingTransactionsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListOfferingTransactionsResult {
	  return com.amazonaws.services.devicefarm.model.ListOfferingTransactionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListOfferingTransactionsResult {
		return environment.devicefarm.listOfferingTransactions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-offering-transactions")
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listOfferings(init: AWSDeviceFarmListOfferingsCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListOfferingsResult {
	return this.block.declare(AWSDeviceFarmListOfferingsCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListOfferingsResult
}

@Generated
class AWSDeviceFarmListOfferingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListOfferingsRequest, com.amazonaws.services.devicefarm.model.ListOfferingsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListOfferingsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListOfferingsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListOfferingsResult {
	  return com.amazonaws.services.devicefarm.model.ListOfferingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListOfferingsResult {
		return environment.devicefarm.listOfferings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-offerings")
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listProjects(init: AWSDeviceFarmListProjectsCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListProjectsResult {
	return this.block.declare(AWSDeviceFarmListProjectsCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListProjectsResult
}

@Generated
class AWSDeviceFarmListProjectsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListProjectsRequest, com.amazonaws.services.devicefarm.model.ListProjectsResult> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListProjectsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListProjectsRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListProjectsResult {
	  return com.amazonaws.services.devicefarm.model.ListProjectsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListProjectsResult {
		return environment.devicefarm.listProjects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-projects")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listRemoteAccessSessions(init: AWSDeviceFarmListRemoteAccessSessionsCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsResult {
	return this.block.declare(AWSDeviceFarmListRemoteAccessSessionsCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsResult
}

@Generated
class AWSDeviceFarmListRemoteAccessSessionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest, com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsResult> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsResult {
	  return com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsResult {
		return environment.devicefarm.listRemoteAccessSessions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-remote-access-sessions")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listRuns(init: AWSDeviceFarmListRunsCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListRunsResult {
	return this.block.declare(AWSDeviceFarmListRunsCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListRunsResult
}

@Generated
class AWSDeviceFarmListRunsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListRunsRequest, com.amazonaws.services.devicefarm.model.ListRunsResult> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListRunsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListRunsRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListRunsResult {
	  return com.amazonaws.services.devicefarm.model.ListRunsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListRunsResult {
		return environment.devicefarm.listRuns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-runs")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listSamples(init: AWSDeviceFarmListSamplesCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListSamplesResult {
	return this.block.declare(AWSDeviceFarmListSamplesCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListSamplesResult
}

@Generated
class AWSDeviceFarmListSamplesCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListSamplesRequest, com.amazonaws.services.devicefarm.model.ListSamplesResult> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListSamplesRequest {
		val input = com.amazonaws.services.devicefarm.model.ListSamplesRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListSamplesResult {
	  return com.amazonaws.services.devicefarm.model.ListSamplesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListSamplesResult {
		return environment.devicefarm.listSamples(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-samples")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listSuites(init: AWSDeviceFarmListSuitesCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListSuitesResult {
	return this.block.declare(AWSDeviceFarmListSuitesCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListSuitesResult
}

@Generated
class AWSDeviceFarmListSuitesCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListSuitesRequest, com.amazonaws.services.devicefarm.model.ListSuitesResult> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListSuitesRequest {
		val input = com.amazonaws.services.devicefarm.model.ListSuitesRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListSuitesResult {
	  return com.amazonaws.services.devicefarm.model.ListSuitesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListSuitesResult {
		return environment.devicefarm.listSuites(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-suites")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listTests(init: AWSDeviceFarmListTestsCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListTestsResult {
	return this.block.declare(AWSDeviceFarmListTestsCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListTestsResult
}

@Generated
class AWSDeviceFarmListTestsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListTestsRequest, com.amazonaws.services.devicefarm.model.ListTestsResult> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListTestsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListTestsRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListTestsResult {
	  return com.amazonaws.services.devicefarm.model.ListTestsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListTestsResult {
		return environment.devicefarm.listTests(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-tests")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listUniqueProblems(init: AWSDeviceFarmListUniqueProblemsCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListUniqueProblemsResult {
	return this.block.declare(AWSDeviceFarmListUniqueProblemsCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListUniqueProblemsResult
}

@Generated
class AWSDeviceFarmListUniqueProblemsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest, com.amazonaws.services.devicefarm.model.ListUniqueProblemsResult> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListUniqueProblemsResult {
	  return com.amazonaws.services.devicefarm.model.ListUniqueProblemsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListUniqueProblemsResult {
		return environment.devicefarm.listUniqueProblems(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-unique-problems")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listUploads(init: AWSDeviceFarmListUploadsCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ListUploadsResult {
	return this.block.declare(AWSDeviceFarmListUploadsCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ListUploadsResult
}

@Generated
class AWSDeviceFarmListUploadsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListUploadsRequest, com.amazonaws.services.devicefarm.model.ListUploadsResult> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListUploadsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListUploadsRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ListUploadsResult {
	  return com.amazonaws.services.devicefarm.model.ListUploadsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ListUploadsResult {
		return environment.devicefarm.listUploads(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-uploads")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.purchaseOffering(init: AWSDeviceFarmPurchaseOfferingCommand.() -> Unit): com.amazonaws.services.devicefarm.model.PurchaseOfferingResult {
	return this.block.declare(AWSDeviceFarmPurchaseOfferingCommand().apply(init)) as com.amazonaws.services.devicefarm.model.PurchaseOfferingResult
}

@Generated
class AWSDeviceFarmPurchaseOfferingCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.PurchaseOfferingRequest, com.amazonaws.services.devicefarm.model.PurchaseOfferingResult> {

	var offeringId: String? = null
	var quantity: Int? = 0
	var offeringPromotionId: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.PurchaseOfferingRequest {
		val input = com.amazonaws.services.devicefarm.model.PurchaseOfferingRequest()
		input.setOfferingId(this.offeringId)
		input.setQuantity(this.quantity)
		input.setOfferingPromotionId(this.offeringPromotionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.PurchaseOfferingResult {
	  return com.amazonaws.services.devicefarm.model.PurchaseOfferingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.PurchaseOfferingResult {
		return environment.devicefarm.purchaseOffering(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm purchase-offering")
				.argument("offering-id", offeringId)
				.argument("quantity", quantity?.toString())
				.argument("offering-promotion-id", offeringPromotionId)
	}

}


fun AWSDeviceFarmFunctions.renewOffering(init: AWSDeviceFarmRenewOfferingCommand.() -> Unit): com.amazonaws.services.devicefarm.model.RenewOfferingResult {
	return this.block.declare(AWSDeviceFarmRenewOfferingCommand().apply(init)) as com.amazonaws.services.devicefarm.model.RenewOfferingResult
}

@Generated
class AWSDeviceFarmRenewOfferingCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.RenewOfferingRequest, com.amazonaws.services.devicefarm.model.RenewOfferingResult> {

	var offeringId: String? = null
	var quantity: Int? = 0

	override fun build(): com.amazonaws.services.devicefarm.model.RenewOfferingRequest {
		val input = com.amazonaws.services.devicefarm.model.RenewOfferingRequest()
		input.setOfferingId(this.offeringId)
		input.setQuantity(this.quantity)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.RenewOfferingResult {
	  return com.amazonaws.services.devicefarm.model.RenewOfferingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.RenewOfferingResult {
		return environment.devicefarm.renewOffering(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm renew-offering")
				.argument("offering-id", offeringId)
				.argument("quantity", quantity?.toString())
	}

}


fun AWSDeviceFarmFunctions.scheduleRun(init: AWSDeviceFarmScheduleRunCommand.() -> Unit): com.amazonaws.services.devicefarm.model.ScheduleRunResult {
	return this.block.declare(AWSDeviceFarmScheduleRunCommand().apply(init)) as com.amazonaws.services.devicefarm.model.ScheduleRunResult
}

@Generated
class AWSDeviceFarmScheduleRunCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ScheduleRunRequest, com.amazonaws.services.devicefarm.model.ScheduleRunResult> {

	var projectArn: String? = null
	var appArn: String? = null
	var devicePoolArn: String? = null
	var name: String? = null
	var test: com.amazonaws.services.devicefarm.model.ScheduleRunTest? = null
	var configuration: com.amazonaws.services.devicefarm.model.ScheduleRunConfiguration? = null
	var executionConfiguration: com.amazonaws.services.devicefarm.model.ExecutionConfiguration? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ScheduleRunRequest {
		val input = com.amazonaws.services.devicefarm.model.ScheduleRunRequest()
		input.setProjectArn(this.projectArn)
		input.setAppArn(this.appArn)
		input.setDevicePoolArn(this.devicePoolArn)
		input.setName(this.name)
		input.setTest(this.test)
		input.setConfiguration(this.configuration)
		input.setExecutionConfiguration(this.executionConfiguration)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.ScheduleRunResult {
	  return com.amazonaws.services.devicefarm.model.ScheduleRunResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.ScheduleRunResult {
		return environment.devicefarm.scheduleRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm schedule-run")
				.argument("project-arn", projectArn)
				.argument("app-arn", appArn)
				.argument("device-pool-arn", devicePoolArn)
				.argument("name", name)
				.argument("test", test?.toString())
				.argument("configuration", configuration?.toString())
				.argument("execution-configuration", executionConfiguration?.toString())
	}

}


fun AWSDeviceFarmFunctions.stopRemoteAccessSession(init: AWSDeviceFarmStopRemoteAccessSessionCommand.() -> Unit): com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionResult {
	return this.block.declare(AWSDeviceFarmStopRemoteAccessSessionCommand().apply(init)) as com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionResult
}

@Generated
class AWSDeviceFarmStopRemoteAccessSessionCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest, com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest {
		val input = com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionResult {
	  return com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionResult {
		return environment.devicefarm.stopRemoteAccessSession(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm stop-remote-access-session")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.stopRun(init: AWSDeviceFarmStopRunCommand.() -> Unit): com.amazonaws.services.devicefarm.model.StopRunResult {
	return this.block.declare(AWSDeviceFarmStopRunCommand().apply(init)) as com.amazonaws.services.devicefarm.model.StopRunResult
}

@Generated
class AWSDeviceFarmStopRunCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.StopRunRequest, com.amazonaws.services.devicefarm.model.StopRunResult> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.StopRunRequest {
		val input = com.amazonaws.services.devicefarm.model.StopRunRequest()
		input.setArn(this.arn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.StopRunResult {
	  return com.amazonaws.services.devicefarm.model.StopRunResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.StopRunResult {
		return environment.devicefarm.stopRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm stop-run")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.updateDeviceInstance(init: AWSDeviceFarmUpdateDeviceInstanceCommand.() -> Unit): com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceResult {
	return this.block.declare(AWSDeviceFarmUpdateDeviceInstanceCommand().apply(init)) as com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceResult
}

@Generated
class AWSDeviceFarmUpdateDeviceInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceRequest, com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceResult> {

	var arn: String? = null
	var profileArn: String? = null
	var labels: List<String>? = null

	override fun build(): com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceRequest {
		val input = com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceRequest()
		input.setArn(this.arn)
		input.setProfileArn(this.profileArn)
		input.setLabels(this.labels)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceResult {
	  return com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceResult {
		return environment.devicefarm.updateDeviceInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm update-device-instance")
				.argument("arn", arn)
				.argument("profile-arn", profileArn)
				.argument("labels", labels?.toString())
	}

}


fun AWSDeviceFarmFunctions.updateDevicePool(init: AWSDeviceFarmUpdateDevicePoolCommand.() -> Unit): com.amazonaws.services.devicefarm.model.UpdateDevicePoolResult {
	return this.block.declare(AWSDeviceFarmUpdateDevicePoolCommand().apply(init)) as com.amazonaws.services.devicefarm.model.UpdateDevicePoolResult
}

@Generated
class AWSDeviceFarmUpdateDevicePoolCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.UpdateDevicePoolRequest, com.amazonaws.services.devicefarm.model.UpdateDevicePoolResult> {

	var arn: String? = null
	var name: String? = null
	var description: String? = null
	var rules: List<com.amazonaws.services.devicefarm.model.Rule>? = null

	override fun build(): com.amazonaws.services.devicefarm.model.UpdateDevicePoolRequest {
		val input = com.amazonaws.services.devicefarm.model.UpdateDevicePoolRequest()
		input.setArn(this.arn)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setRules(this.rules)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.UpdateDevicePoolResult {
	  return com.amazonaws.services.devicefarm.model.UpdateDevicePoolResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.UpdateDevicePoolResult {
		return environment.devicefarm.updateDevicePool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm update-device-pool")
				.argument("arn", arn)
				.argument("name", name)
				.argument("description", description)
				.argument("rules", rules?.toString())
	}

}


fun AWSDeviceFarmFunctions.updateInstanceProfile(init: AWSDeviceFarmUpdateInstanceProfileCommand.() -> Unit): com.amazonaws.services.devicefarm.model.UpdateInstanceProfileResult {
	return this.block.declare(AWSDeviceFarmUpdateInstanceProfileCommand().apply(init)) as com.amazonaws.services.devicefarm.model.UpdateInstanceProfileResult
}

@Generated
class AWSDeviceFarmUpdateInstanceProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.UpdateInstanceProfileRequest, com.amazonaws.services.devicefarm.model.UpdateInstanceProfileResult> {

	var arn: String? = null
	var name: String? = null
	var description: String? = null
	var packageCleanup: Boolean? = false
	var excludeAppPackagesFromCleanup: List<String>? = null
	var rebootAfterUse: Boolean? = false

	override fun build(): com.amazonaws.services.devicefarm.model.UpdateInstanceProfileRequest {
		val input = com.amazonaws.services.devicefarm.model.UpdateInstanceProfileRequest()
		input.setArn(this.arn)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setPackageCleanup(this.packageCleanup)
		input.setExcludeAppPackagesFromCleanup(this.excludeAppPackagesFromCleanup)
		input.setRebootAfterUse(this.rebootAfterUse)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.UpdateInstanceProfileResult {
	  return com.amazonaws.services.devicefarm.model.UpdateInstanceProfileResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.UpdateInstanceProfileResult {
		return environment.devicefarm.updateInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm update-instance-profile")
				.argument("arn", arn)
				.argument("name", name)
				.argument("description", description)
				.option("package-cleanup", packageCleanup ?: false)
				.argument("exclude-app-packages-from-cleanup", excludeAppPackagesFromCleanup?.toString())
				.option("reboot-after-use", rebootAfterUse ?: false)
	}

}


fun AWSDeviceFarmFunctions.updateNetworkProfile(init: AWSDeviceFarmUpdateNetworkProfileCommand.() -> Unit): com.amazonaws.services.devicefarm.model.UpdateNetworkProfileResult {
	return this.block.declare(AWSDeviceFarmUpdateNetworkProfileCommand().apply(init)) as com.amazonaws.services.devicefarm.model.UpdateNetworkProfileResult
}

@Generated
class AWSDeviceFarmUpdateNetworkProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.UpdateNetworkProfileRequest, com.amazonaws.services.devicefarm.model.UpdateNetworkProfileResult> {

	var arn: String? = null
	var name: String? = null
	var description: String? = null
	var type: NetworkProfileType? = null
	var uplinkBandwidthBits: Long? = 0L
	var downlinkBandwidthBits: Long? = 0L
	var uplinkDelayMs: Long? = 0L
	var downlinkDelayMs: Long? = 0L
	var uplinkJitterMs: Long? = 0L
	var downlinkJitterMs: Long? = 0L
	var uplinkLossPercent: Int? = 0
	var downlinkLossPercent: Int? = 0

	override fun build(): com.amazonaws.services.devicefarm.model.UpdateNetworkProfileRequest {
		val input = com.amazonaws.services.devicefarm.model.UpdateNetworkProfileRequest()
		input.setArn(this.arn)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setType(this.type?.toString())
		input.setUplinkBandwidthBits(this.uplinkBandwidthBits)
		input.setDownlinkBandwidthBits(this.downlinkBandwidthBits)
		input.setUplinkDelayMs(this.uplinkDelayMs)
		input.setDownlinkDelayMs(this.downlinkDelayMs)
		input.setUplinkJitterMs(this.uplinkJitterMs)
		input.setDownlinkJitterMs(this.downlinkJitterMs)
		input.setUplinkLossPercent(this.uplinkLossPercent)
		input.setDownlinkLossPercent(this.downlinkLossPercent)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.UpdateNetworkProfileResult {
	  return com.amazonaws.services.devicefarm.model.UpdateNetworkProfileResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.UpdateNetworkProfileResult {
		return environment.devicefarm.updateNetworkProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm update-network-profile")
				.argument("arn", arn)
				.argument("name", name)
				.argument("description", description)
				.argument("type", type?.toString())
				.argument("uplink-bandwidth-bits", uplinkBandwidthBits?.toString())
				.argument("downlink-bandwidth-bits", downlinkBandwidthBits?.toString())
				.argument("uplink-delay-ms", uplinkDelayMs?.toString())
				.argument("downlink-delay-ms", downlinkDelayMs?.toString())
				.argument("uplink-jitter-ms", uplinkJitterMs?.toString())
				.argument("downlink-jitter-ms", downlinkJitterMs?.toString())
				.argument("uplink-loss-percent", uplinkLossPercent?.toString())
				.argument("downlink-loss-percent", downlinkLossPercent?.toString())
	}

}


fun AWSDeviceFarmFunctions.updateProject(init: AWSDeviceFarmUpdateProjectCommand.() -> Unit): com.amazonaws.services.devicefarm.model.UpdateProjectResult {
	return this.block.declare(AWSDeviceFarmUpdateProjectCommand().apply(init)) as com.amazonaws.services.devicefarm.model.UpdateProjectResult
}

@Generated
class AWSDeviceFarmUpdateProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.UpdateProjectRequest, com.amazonaws.services.devicefarm.model.UpdateProjectResult> {

	var arn: String? = null
	var name: String? = null
	var defaultJobTimeoutMinutes: Int? = 0

	override fun build(): com.amazonaws.services.devicefarm.model.UpdateProjectRequest {
		val input = com.amazonaws.services.devicefarm.model.UpdateProjectRequest()
		input.setArn(this.arn)
		input.setName(this.name)
		input.setDefaultJobTimeoutMinutes(this.defaultJobTimeoutMinutes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.devicefarm.model.UpdateProjectResult {
	  return com.amazonaws.services.devicefarm.model.UpdateProjectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.devicefarm.model.UpdateProjectResult {
		return environment.devicefarm.updateProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm update-project")
				.argument("arn", arn)
				.argument("name", name)
				.argument("default-job-timeout-minutes", defaultJobTimeoutMinutes?.toString())
	}

}
