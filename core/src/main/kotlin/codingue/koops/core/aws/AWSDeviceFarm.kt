
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.devicefarm.AWSDeviceFarm
import com.amazonaws.services.devicefarm.model.*

var codingue.koops.core.Environment.devicefarm: AWSDeviceFarm
	get() = this.capabilities[AWSDeviceFarm::class.java.name] as AWSDeviceFarm
	set(devicefarm) {
		this.capabilities[AWSDeviceFarm::class.java.name] = devicefarm
	}

@Generated
class AWSDeviceFarmFunctions(val block: Block)

infix fun AwsContinuation.devicefarm(init: AWSDeviceFarmFunctions.() -> Unit) {
	AWSDeviceFarmFunctions(shell).apply(init)
}

			

fun AWSDeviceFarmFunctions.createDevicePool(init: AWSDeviceFarmCreateDevicePoolCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmCreateDevicePoolCommand().apply(init))
}

@Generated
class AWSDeviceFarmCreateDevicePoolCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.CreateDevicePoolRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.createDevicePool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm create-device-pool")
				.argument("project-arn", projectArn)
				.argument("name", name)
				.argument("description", description)
				.argument("rules", rules?.toString())
	}

}


fun AWSDeviceFarmFunctions.createInstanceProfile(init: AWSDeviceFarmCreateInstanceProfileCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmCreateInstanceProfileCommand().apply(init))
}

@Generated
class AWSDeviceFarmCreateInstanceProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.CreateInstanceProfileRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.createInstanceProfile(build())
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


fun AWSDeviceFarmFunctions.createNetworkProfile(init: AWSDeviceFarmCreateNetworkProfileCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmCreateNetworkProfileCommand().apply(init))
}

@Generated
class AWSDeviceFarmCreateNetworkProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.CreateNetworkProfileRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.createNetworkProfile(build())
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


fun AWSDeviceFarmFunctions.createProject(init: AWSDeviceFarmCreateProjectCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmCreateProjectCommand().apply(init))
}

@Generated
class AWSDeviceFarmCreateProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.CreateProjectRequest> {

	var name: String? = null
	var defaultJobTimeoutMinutes: Int? = 0

	override fun build(): com.amazonaws.services.devicefarm.model.CreateProjectRequest {
		val input = com.amazonaws.services.devicefarm.model.CreateProjectRequest()
		input.setName(this.name)
		input.setDefaultJobTimeoutMinutes(this.defaultJobTimeoutMinutes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.createProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm create-project")
				.argument("name", name)
				.argument("default-job-timeout-minutes", defaultJobTimeoutMinutes?.toString())
	}

}


fun AWSDeviceFarmFunctions.createRemoteAccessSession(init: AWSDeviceFarmCreateRemoteAccessSessionCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmCreateRemoteAccessSessionCommand().apply(init))
}

@Generated
class AWSDeviceFarmCreateRemoteAccessSessionCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.createRemoteAccessSession(build())
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


fun AWSDeviceFarmFunctions.createUpload(init: AWSDeviceFarmCreateUploadCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmCreateUploadCommand().apply(init))
}

@Generated
class AWSDeviceFarmCreateUploadCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.CreateUploadRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.createUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm create-upload")
				.argument("project-arn", projectArn)
				.argument("name", name)
				.argument("type", type?.toString())
				.argument("content-type", contentType)
	}

}


fun AWSDeviceFarmFunctions.deleteDevicePool(init: AWSDeviceFarmDeleteDevicePoolCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmDeleteDevicePoolCommand().apply(init))
}

@Generated
class AWSDeviceFarmDeleteDevicePoolCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest {
		val input = com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.deleteDevicePool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm delete-device-pool")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.deleteInstanceProfile(init: AWSDeviceFarmDeleteInstanceProfileCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmDeleteInstanceProfileCommand().apply(init))
}

@Generated
class AWSDeviceFarmDeleteInstanceProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest {
		val input = com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.deleteInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm delete-instance-profile")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.deleteNetworkProfile(init: AWSDeviceFarmDeleteNetworkProfileCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmDeleteNetworkProfileCommand().apply(init))
}

@Generated
class AWSDeviceFarmDeleteNetworkProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest {
		val input = com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.deleteNetworkProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm delete-network-profile")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.deleteProject(init: AWSDeviceFarmDeleteProjectCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmDeleteProjectCommand().apply(init))
}

@Generated
class AWSDeviceFarmDeleteProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.DeleteProjectRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.DeleteProjectRequest {
		val input = com.amazonaws.services.devicefarm.model.DeleteProjectRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.deleteProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm delete-project")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.deleteRemoteAccessSession(init: AWSDeviceFarmDeleteRemoteAccessSessionCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmDeleteRemoteAccessSessionCommand().apply(init))
}

@Generated
class AWSDeviceFarmDeleteRemoteAccessSessionCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest {
		val input = com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.deleteRemoteAccessSession(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm delete-remote-access-session")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.deleteRun(init: AWSDeviceFarmDeleteRunCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmDeleteRunCommand().apply(init))
}

@Generated
class AWSDeviceFarmDeleteRunCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.DeleteRunRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.DeleteRunRequest {
		val input = com.amazonaws.services.devicefarm.model.DeleteRunRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.deleteRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm delete-run")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.deleteUpload(init: AWSDeviceFarmDeleteUploadCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmDeleteUploadCommand().apply(init))
}

@Generated
class AWSDeviceFarmDeleteUploadCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.DeleteUploadRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.DeleteUploadRequest {
		val input = com.amazonaws.services.devicefarm.model.DeleteUploadRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.deleteUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm delete-upload")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getAccountSettings(init: AWSDeviceFarmGetAccountSettingsCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmGetAccountSettingsCommand().apply(init))
}

@Generated
class AWSDeviceFarmGetAccountSettingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest> {



	override fun build(): com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest {
		val input = com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.getAccountSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-account-settings")

	}

}


fun AWSDeviceFarmFunctions.getDevice(init: AWSDeviceFarmGetDeviceCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmGetDeviceCommand().apply(init))
}

@Generated
class AWSDeviceFarmGetDeviceCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetDeviceRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetDeviceRequest {
		val input = com.amazonaws.services.devicefarm.model.GetDeviceRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.getDevice(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-device")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getDeviceInstance(init: AWSDeviceFarmGetDeviceInstanceCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmGetDeviceInstanceCommand().apply(init))
}

@Generated
class AWSDeviceFarmGetDeviceInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest {
		val input = com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.getDeviceInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-device-instance")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getDevicePool(init: AWSDeviceFarmGetDevicePoolCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmGetDevicePoolCommand().apply(init))
}

@Generated
class AWSDeviceFarmGetDevicePoolCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetDevicePoolRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetDevicePoolRequest {
		val input = com.amazonaws.services.devicefarm.model.GetDevicePoolRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.getDevicePool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-device-pool")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getDevicePoolCompatibility(init: AWSDeviceFarmGetDevicePoolCompatibilityCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmGetDevicePoolCompatibilityCommand().apply(init))
}

@Generated
class AWSDeviceFarmGetDevicePoolCompatibilityCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.getDevicePoolCompatibility(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-device-pool-compatibility")
				.argument("device-pool-arn", devicePoolArn)
				.argument("app-arn", appArn)
				.argument("test-type", testType?.toString())
				.argument("test", test?.toString())
	}

}


fun AWSDeviceFarmFunctions.getInstanceProfile(init: AWSDeviceFarmGetInstanceProfileCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmGetInstanceProfileCommand().apply(init))
}

@Generated
class AWSDeviceFarmGetInstanceProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest {
		val input = com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.getInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-instance-profile")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getJob(init: AWSDeviceFarmGetJobCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmGetJobCommand().apply(init))
}

@Generated
class AWSDeviceFarmGetJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetJobRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetJobRequest {
		val input = com.amazonaws.services.devicefarm.model.GetJobRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.getJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-job")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getNetworkProfile(init: AWSDeviceFarmGetNetworkProfileCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmGetNetworkProfileCommand().apply(init))
}

@Generated
class AWSDeviceFarmGetNetworkProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest {
		val input = com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.getNetworkProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-network-profile")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getOfferingStatus(init: AWSDeviceFarmGetOfferingStatusCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmGetOfferingStatusCommand().apply(init))
}

@Generated
class AWSDeviceFarmGetOfferingStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest {
		val input = com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.getOfferingStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-offering-status")
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.getProject(init: AWSDeviceFarmGetProjectCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmGetProjectCommand().apply(init))
}

@Generated
class AWSDeviceFarmGetProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetProjectRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetProjectRequest {
		val input = com.amazonaws.services.devicefarm.model.GetProjectRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.getProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-project")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getRemoteAccessSession(init: AWSDeviceFarmGetRemoteAccessSessionCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmGetRemoteAccessSessionCommand().apply(init))
}

@Generated
class AWSDeviceFarmGetRemoteAccessSessionCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest {
		val input = com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.getRemoteAccessSession(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-remote-access-session")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getRun(init: AWSDeviceFarmGetRunCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmGetRunCommand().apply(init))
}

@Generated
class AWSDeviceFarmGetRunCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetRunRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetRunRequest {
		val input = com.amazonaws.services.devicefarm.model.GetRunRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.getRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-run")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getSuite(init: AWSDeviceFarmGetSuiteCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmGetSuiteCommand().apply(init))
}

@Generated
class AWSDeviceFarmGetSuiteCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetSuiteRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetSuiteRequest {
		val input = com.amazonaws.services.devicefarm.model.GetSuiteRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.getSuite(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-suite")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getTest(init: AWSDeviceFarmGetTestCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmGetTestCommand().apply(init))
}

@Generated
class AWSDeviceFarmGetTestCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetTestRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetTestRequest {
		val input = com.amazonaws.services.devicefarm.model.GetTestRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.getTest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-test")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.getUpload(init: AWSDeviceFarmGetUploadCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmGetUploadCommand().apply(init))
}

@Generated
class AWSDeviceFarmGetUploadCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.GetUploadRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.GetUploadRequest {
		val input = com.amazonaws.services.devicefarm.model.GetUploadRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.getUpload(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm get-upload")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.installToRemoteAccessSession(init: AWSDeviceFarmInstallToRemoteAccessSessionCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmInstallToRemoteAccessSessionCommand().apply(init))
}

@Generated
class AWSDeviceFarmInstallToRemoteAccessSessionCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest> {

	var remoteAccessSessionArn: String? = null
	var appArn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest {
		val input = com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest()
		input.setRemoteAccessSessionArn(this.remoteAccessSessionArn)
		input.setAppArn(this.appArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.installToRemoteAccessSession(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm install-to-remote-access-session")
				.argument("remote-access-session-arn", remoteAccessSessionArn)
				.argument("app-arn", appArn)
	}

}


fun AWSDeviceFarmFunctions.listArtifacts(init: AWSDeviceFarmListArtifactsCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListArtifactsCommand().apply(init))
}

@Generated
class AWSDeviceFarmListArtifactsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListArtifactsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listArtifacts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-artifacts")
				.argument("arn", arn)
				.argument("type", type?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listDeviceInstances(init: AWSDeviceFarmListDeviceInstancesCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListDeviceInstancesCommand().apply(init))
}

@Generated
class AWSDeviceFarmListDeviceInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest {
		val input = com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listDeviceInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-device-instances")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listDevicePools(init: AWSDeviceFarmListDevicePoolsCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListDevicePoolsCommand().apply(init))
}

@Generated
class AWSDeviceFarmListDevicePoolsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListDevicePoolsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listDevicePools(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-device-pools")
				.argument("arn", arn)
				.argument("type", type?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listDevices(init: AWSDeviceFarmListDevicesCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListDevicesCommand().apply(init))
}

@Generated
class AWSDeviceFarmListDevicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListDevicesRequest> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListDevicesRequest {
		val input = com.amazonaws.services.devicefarm.model.ListDevicesRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listDevices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-devices")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listInstanceProfiles(init: AWSDeviceFarmListInstanceProfilesCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListInstanceProfilesCommand().apply(init))
}

@Generated
class AWSDeviceFarmListInstanceProfilesCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest {
		val input = com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listInstanceProfiles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-instance-profiles")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listJobs(init: AWSDeviceFarmListJobsCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListJobsCommand().apply(init))
}

@Generated
class AWSDeviceFarmListJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListJobsRequest> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListJobsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListJobsRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-jobs")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listNetworkProfiles(init: AWSDeviceFarmListNetworkProfilesCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListNetworkProfilesCommand().apply(init))
}

@Generated
class AWSDeviceFarmListNetworkProfilesCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListNetworkProfilesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listNetworkProfiles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-network-profiles")
				.argument("arn", arn)
				.argument("type", type?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listOfferingPromotions(init: AWSDeviceFarmListOfferingPromotionsCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListOfferingPromotionsCommand().apply(init))
}

@Generated
class AWSDeviceFarmListOfferingPromotionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listOfferingPromotions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-offering-promotions")
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listOfferingTransactions(init: AWSDeviceFarmListOfferingTransactionsCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListOfferingTransactionsCommand().apply(init))
}

@Generated
class AWSDeviceFarmListOfferingTransactionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listOfferingTransactions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-offering-transactions")
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listOfferings(init: AWSDeviceFarmListOfferingsCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListOfferingsCommand().apply(init))
}

@Generated
class AWSDeviceFarmListOfferingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListOfferingsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListOfferingsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListOfferingsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listOfferings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-offerings")
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listProjects(init: AWSDeviceFarmListProjectsCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListProjectsCommand().apply(init))
}

@Generated
class AWSDeviceFarmListProjectsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListProjectsRequest> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListProjectsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListProjectsRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listProjects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-projects")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listRemoteAccessSessions(init: AWSDeviceFarmListRemoteAccessSessionsCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListRemoteAccessSessionsCommand().apply(init))
}

@Generated
class AWSDeviceFarmListRemoteAccessSessionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listRemoteAccessSessions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-remote-access-sessions")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listRuns(init: AWSDeviceFarmListRunsCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListRunsCommand().apply(init))
}

@Generated
class AWSDeviceFarmListRunsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListRunsRequest> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListRunsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListRunsRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listRuns(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-runs")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listSamples(init: AWSDeviceFarmListSamplesCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListSamplesCommand().apply(init))
}

@Generated
class AWSDeviceFarmListSamplesCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListSamplesRequest> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListSamplesRequest {
		val input = com.amazonaws.services.devicefarm.model.ListSamplesRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listSamples(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-samples")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listSuites(init: AWSDeviceFarmListSuitesCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListSuitesCommand().apply(init))
}

@Generated
class AWSDeviceFarmListSuitesCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListSuitesRequest> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListSuitesRequest {
		val input = com.amazonaws.services.devicefarm.model.ListSuitesRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listSuites(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-suites")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listTests(init: AWSDeviceFarmListTestsCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListTestsCommand().apply(init))
}

@Generated
class AWSDeviceFarmListTestsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListTestsRequest> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListTestsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListTestsRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listTests(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-tests")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listUniqueProblems(init: AWSDeviceFarmListUniqueProblemsCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListUniqueProblemsCommand().apply(init))
}

@Generated
class AWSDeviceFarmListUniqueProblemsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listUniqueProblems(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-unique-problems")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.listUploads(init: AWSDeviceFarmListUploadsCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmListUploadsCommand().apply(init))
}

@Generated
class AWSDeviceFarmListUploadsCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ListUploadsRequest> {

	var arn: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.ListUploadsRequest {
		val input = com.amazonaws.services.devicefarm.model.ListUploadsRequest()
		input.setArn(this.arn)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.listUploads(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm list-uploads")
				.argument("arn", arn)
				.argument("next-token", nextToken)
	}

}


fun AWSDeviceFarmFunctions.purchaseOffering(init: AWSDeviceFarmPurchaseOfferingCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmPurchaseOfferingCommand().apply(init))
}

@Generated
class AWSDeviceFarmPurchaseOfferingCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.PurchaseOfferingRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.purchaseOffering(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm purchase-offering")
				.argument("offering-id", offeringId)
				.argument("quantity", quantity?.toString())
				.argument("offering-promotion-id", offeringPromotionId)
	}

}


fun AWSDeviceFarmFunctions.renewOffering(init: AWSDeviceFarmRenewOfferingCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmRenewOfferingCommand().apply(init))
}

@Generated
class AWSDeviceFarmRenewOfferingCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.RenewOfferingRequest> {

	var offeringId: String? = null
	var quantity: Int? = 0

	override fun build(): com.amazonaws.services.devicefarm.model.RenewOfferingRequest {
		val input = com.amazonaws.services.devicefarm.model.RenewOfferingRequest()
		input.setOfferingId(this.offeringId)
		input.setQuantity(this.quantity)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.renewOffering(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm renew-offering")
				.argument("offering-id", offeringId)
				.argument("quantity", quantity?.toString())
	}

}


fun AWSDeviceFarmFunctions.scheduleRun(init: AWSDeviceFarmScheduleRunCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmScheduleRunCommand().apply(init))
}

@Generated
class AWSDeviceFarmScheduleRunCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.ScheduleRunRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.scheduleRun(build())
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


fun AWSDeviceFarmFunctions.stopRemoteAccessSession(init: AWSDeviceFarmStopRemoteAccessSessionCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmStopRemoteAccessSessionCommand().apply(init))
}

@Generated
class AWSDeviceFarmStopRemoteAccessSessionCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest {
		val input = com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.stopRemoteAccessSession(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm stop-remote-access-session")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.stopRun(init: AWSDeviceFarmStopRunCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmStopRunCommand().apply(init))
}

@Generated
class AWSDeviceFarmStopRunCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.StopRunRequest> {

	var arn: String? = null

	override fun build(): com.amazonaws.services.devicefarm.model.StopRunRequest {
		val input = com.amazonaws.services.devicefarm.model.StopRunRequest()
		input.setArn(this.arn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.stopRun(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm stop-run")
				.argument("arn", arn)
	}

}


fun AWSDeviceFarmFunctions.updateDeviceInstance(init: AWSDeviceFarmUpdateDeviceInstanceCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmUpdateDeviceInstanceCommand().apply(init))
}

@Generated
class AWSDeviceFarmUpdateDeviceInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.updateDeviceInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm update-device-instance")
				.argument("arn", arn)
				.argument("profile-arn", profileArn)
				.argument("labels", labels?.toString())
	}

}


fun AWSDeviceFarmFunctions.updateDevicePool(init: AWSDeviceFarmUpdateDevicePoolCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmUpdateDevicePoolCommand().apply(init))
}

@Generated
class AWSDeviceFarmUpdateDevicePoolCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.UpdateDevicePoolRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.updateDevicePool(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm update-device-pool")
				.argument("arn", arn)
				.argument("name", name)
				.argument("description", description)
				.argument("rules", rules?.toString())
	}

}


fun AWSDeviceFarmFunctions.updateInstanceProfile(init: AWSDeviceFarmUpdateInstanceProfileCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmUpdateInstanceProfileCommand().apply(init))
}

@Generated
class AWSDeviceFarmUpdateInstanceProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.UpdateInstanceProfileRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.updateInstanceProfile(build())
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


fun AWSDeviceFarmFunctions.updateNetworkProfile(init: AWSDeviceFarmUpdateNetworkProfileCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmUpdateNetworkProfileCommand().apply(init))
}

@Generated
class AWSDeviceFarmUpdateNetworkProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.UpdateNetworkProfileRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.updateNetworkProfile(build())
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


fun AWSDeviceFarmFunctions.updateProject(init: AWSDeviceFarmUpdateProjectCommand.() -> Unit) {
	this.block.declare(AWSDeviceFarmUpdateProjectCommand().apply(init))
}

@Generated
class AWSDeviceFarmUpdateProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.devicefarm.model.UpdateProjectRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.devicefarm.updateProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws devicefarm update-project")
				.argument("arn", arn)
				.argument("name", name)
				.argument("default-job-timeout-minutes", defaultJobTimeoutMinutes?.toString())
	}

}
