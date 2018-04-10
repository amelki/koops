
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.lightsail.AmazonLightsail
import com.amazonaws.services.lightsail.model.*

var codingue.koops.core.Environment.lightsail: AmazonLightsail
	get() = this.capabilities[AmazonLightsail::class.java.name] as AmazonLightsail
	set(lightsail) {
		this.capabilities[AmazonLightsail::class.java.name] = lightsail
	}

@Generated
class AmazonLightsailFunctions(val block: Block)

infix fun AwsContinuation.lightsail(init: AmazonLightsailFunctions.() -> Unit) {
	AmazonLightsailFunctions(shell).apply(init)
}

			

fun AmazonLightsailFunctions.allocateStaticIp(init: AmazonLightsailAllocateStaticIpCommand.() -> Unit) {
	this.block.declare(AmazonLightsailAllocateStaticIpCommand().apply(init))
}

@Generated
class AmazonLightsailAllocateStaticIpCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.AllocateStaticIpRequest> {

	var staticIpName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.AllocateStaticIpRequest {
		val input = com.amazonaws.services.lightsail.model.AllocateStaticIpRequest()
		input.setStaticIpName(this.staticIpName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.allocateStaticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail allocate-static-ip")
				.argument("static-ip-name", staticIpName)
	}

}


fun AmazonLightsailFunctions.attachDisk(init: AmazonLightsailAttachDiskCommand.() -> Unit) {
	this.block.declare(AmazonLightsailAttachDiskCommand().apply(init))
}

@Generated
class AmazonLightsailAttachDiskCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.AttachDiskRequest> {

	var diskName: String? = null
	var instanceName: String? = null
	var diskPath: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.AttachDiskRequest {
		val input = com.amazonaws.services.lightsail.model.AttachDiskRequest()
		input.setDiskName(this.diskName)
		input.setInstanceName(this.instanceName)
		input.setDiskPath(this.diskPath)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.attachDisk(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail attach-disk")
				.argument("disk-name", diskName)
				.argument("instance-name", instanceName)
				.argument("disk-path", diskPath)
	}

}


fun AmazonLightsailFunctions.attachInstancesToLoadBalancer(init: AmazonLightsailAttachInstancesToLoadBalancerCommand.() -> Unit) {
	this.block.declare(AmazonLightsailAttachInstancesToLoadBalancerCommand().apply(init))
}

@Generated
class AmazonLightsailAttachInstancesToLoadBalancerCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerRequest> {

	var loadBalancerName: String? = null
	var instanceNames: List<String>? = null

	override fun build(): com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerRequest {
		val input = com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setInstanceNames(this.instanceNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.attachInstancesToLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail attach-instances-to-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
				.argument("instance-names", instanceNames?.toString())
	}

}


fun AmazonLightsailFunctions.attachLoadBalancerTlsCertificate(init: AmazonLightsailAttachLoadBalancerTlsCertificateCommand.() -> Unit) {
	this.block.declare(AmazonLightsailAttachLoadBalancerTlsCertificateCommand().apply(init))
}

@Generated
class AmazonLightsailAttachLoadBalancerTlsCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateRequest> {

	var loadBalancerName: String? = null
	var certificateName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateRequest {
		val input = com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setCertificateName(this.certificateName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.attachLoadBalancerTlsCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail attach-load-balancer-tls-certificate")
				.argument("load-balancer-name", loadBalancerName)
				.argument("certificate-name", certificateName)
	}

}


fun AmazonLightsailFunctions.attachStaticIp(init: AmazonLightsailAttachStaticIpCommand.() -> Unit) {
	this.block.declare(AmazonLightsailAttachStaticIpCommand().apply(init))
}

@Generated
class AmazonLightsailAttachStaticIpCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.AttachStaticIpRequest> {

	var staticIpName: String? = null
	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.AttachStaticIpRequest {
		val input = com.amazonaws.services.lightsail.model.AttachStaticIpRequest()
		input.setStaticIpName(this.staticIpName)
		input.setInstanceName(this.instanceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.attachStaticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail attach-static-ip")
				.argument("static-ip-name", staticIpName)
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.closeInstancePublicPorts(init: AmazonLightsailCloseInstancePublicPortsCommand.() -> Unit) {
	this.block.declare(AmazonLightsailCloseInstancePublicPortsCommand().apply(init))
}

@Generated
class AmazonLightsailCloseInstancePublicPortsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CloseInstancePublicPortsRequest> {

	var portInfo: com.amazonaws.services.lightsail.model.PortInfo? = null
	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.CloseInstancePublicPortsRequest {
		val input = com.amazonaws.services.lightsail.model.CloseInstancePublicPortsRequest()
		input.setPortInfo(this.portInfo)
		input.setInstanceName(this.instanceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.closeInstancePublicPorts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail close-instance-public-ports")
				.argument("port-info", portInfo?.toString())
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.createDisk(init: AmazonLightsailCreateDiskCommand.() -> Unit) {
	this.block.declare(AmazonLightsailCreateDiskCommand().apply(init))
}

@Generated
class AmazonLightsailCreateDiskCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateDiskRequest> {

	var diskName: String? = null
	var availabilityZone: String? = null
	var sizeInGb: Int? = 0

	override fun build(): com.amazonaws.services.lightsail.model.CreateDiskRequest {
		val input = com.amazonaws.services.lightsail.model.CreateDiskRequest()
		input.setDiskName(this.diskName)
		input.setAvailabilityZone(this.availabilityZone)
		input.setSizeInGb(this.sizeInGb)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.createDisk(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-disk")
				.argument("disk-name", diskName)
				.argument("availability-zone", availabilityZone)
				.argument("size-in-gb", sizeInGb?.toString())
	}

}


fun AmazonLightsailFunctions.createDiskFromSnapshot(init: AmazonLightsailCreateDiskFromSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonLightsailCreateDiskFromSnapshotCommand().apply(init))
}

@Generated
class AmazonLightsailCreateDiskFromSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotRequest> {

	var diskName: String? = null
	var diskSnapshotName: String? = null
	var availabilityZone: String? = null
	var sizeInGb: Int? = 0

	override fun build(): com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotRequest {
		val input = com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotRequest()
		input.setDiskName(this.diskName)
		input.setDiskSnapshotName(this.diskSnapshotName)
		input.setAvailabilityZone(this.availabilityZone)
		input.setSizeInGb(this.sizeInGb)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.createDiskFromSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-disk-from-snapshot")
				.argument("disk-name", diskName)
				.argument("disk-snapshot-name", diskSnapshotName)
				.argument("availability-zone", availabilityZone)
				.argument("size-in-gb", sizeInGb?.toString())
	}

}


fun AmazonLightsailFunctions.createDiskSnapshot(init: AmazonLightsailCreateDiskSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonLightsailCreateDiskSnapshotCommand().apply(init))
}

@Generated
class AmazonLightsailCreateDiskSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateDiskSnapshotRequest> {

	var diskName: String? = null
	var diskSnapshotName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.CreateDiskSnapshotRequest {
		val input = com.amazonaws.services.lightsail.model.CreateDiskSnapshotRequest()
		input.setDiskName(this.diskName)
		input.setDiskSnapshotName(this.diskSnapshotName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.createDiskSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-disk-snapshot")
				.argument("disk-name", diskName)
				.argument("disk-snapshot-name", diskSnapshotName)
	}

}


fun AmazonLightsailFunctions.createDomain(init: AmazonLightsailCreateDomainCommand.() -> Unit) {
	this.block.declare(AmazonLightsailCreateDomainCommand().apply(init))
}

@Generated
class AmazonLightsailCreateDomainCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateDomainRequest> {

	var domainName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.CreateDomainRequest {
		val input = com.amazonaws.services.lightsail.model.CreateDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.createDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-domain")
				.argument("domain-name", domainName)
	}

}


fun AmazonLightsailFunctions.createDomainEntry(init: AmazonLightsailCreateDomainEntryCommand.() -> Unit) {
	this.block.declare(AmazonLightsailCreateDomainEntryCommand().apply(init))
}

@Generated
class AmazonLightsailCreateDomainEntryCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateDomainEntryRequest> {

	var domainName: String? = null
	var domainEntry: com.amazonaws.services.lightsail.model.DomainEntry? = null

	override fun build(): com.amazonaws.services.lightsail.model.CreateDomainEntryRequest {
		val input = com.amazonaws.services.lightsail.model.CreateDomainEntryRequest()
		input.setDomainName(this.domainName)
		input.setDomainEntry(this.domainEntry)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.createDomainEntry(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-domain-entry")
				.argument("domain-name", domainName)
				.argument("domain-entry", domainEntry?.toString())
	}

}


fun AmazonLightsailFunctions.createInstanceSnapshot(init: AmazonLightsailCreateInstanceSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonLightsailCreateInstanceSnapshotCommand().apply(init))
}

@Generated
class AmazonLightsailCreateInstanceSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest> {

	var instanceSnapshotName: String? = null
	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest {
		val input = com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest()
		input.setInstanceSnapshotName(this.instanceSnapshotName)
		input.setInstanceName(this.instanceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.createInstanceSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-instance-snapshot")
				.argument("instance-snapshot-name", instanceSnapshotName)
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.createInstances(init: AmazonLightsailCreateInstancesCommand.() -> Unit) {
	this.block.declare(AmazonLightsailCreateInstancesCommand().apply(init))
}

@Generated
class AmazonLightsailCreateInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateInstancesRequest> {

	var instanceNames: List<String>? = null
	var availabilityZone: String? = null
	var customImageName: String? = null
	var blueprintId: String? = null
	var bundleId: String? = null
	var userData: String? = null
	var keyPairName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.CreateInstancesRequest {
		val input = com.amazonaws.services.lightsail.model.CreateInstancesRequest()
		input.setInstanceNames(this.instanceNames)
		input.setAvailabilityZone(this.availabilityZone)
		input.setCustomImageName(this.customImageName)
		input.setBlueprintId(this.blueprintId)
		input.setBundleId(this.bundleId)
		input.setUserData(this.userData)
		input.setKeyPairName(this.keyPairName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.createInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-instances")
				.argument("instance-names", instanceNames?.toString())
				.argument("availability-zone", availabilityZone)
				.argument("custom-image-name", customImageName)
				.argument("blueprint-id", blueprintId)
				.argument("bundle-id", bundleId)
				.argument("user-data", userData)
				.argument("key-pair-name", keyPairName)
	}

}


fun AmazonLightsailFunctions.createInstancesFromSnapshot(init: AmazonLightsailCreateInstancesFromSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonLightsailCreateInstancesFromSnapshotCommand().apply(init))
}

@Generated
class AmazonLightsailCreateInstancesFromSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotRequest> {

	var instanceNames: List<String>? = null
	var attachedDiskMapping: Map<String, List<com.amazonaws.services.lightsail.model.DiskMap>>? = null
	var availabilityZone: String? = null
	var instanceSnapshotName: String? = null
	var bundleId: String? = null
	var userData: String? = null
	var keyPairName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotRequest {
		val input = com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotRequest()
		input.setInstanceNames(this.instanceNames)
		input.setAttachedDiskMapping(this.attachedDiskMapping)
		input.setAvailabilityZone(this.availabilityZone)
		input.setInstanceSnapshotName(this.instanceSnapshotName)
		input.setBundleId(this.bundleId)
		input.setUserData(this.userData)
		input.setKeyPairName(this.keyPairName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.createInstancesFromSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-instances-from-snapshot")
				.argument("instance-names", instanceNames?.toString())
				.argument("attached-disk-mapping", attachedDiskMapping?.toString())
				.argument("availability-zone", availabilityZone)
				.argument("instance-snapshot-name", instanceSnapshotName)
				.argument("bundle-id", bundleId)
				.argument("user-data", userData)
				.argument("key-pair-name", keyPairName)
	}

}


fun AmazonLightsailFunctions.createKeyPair(init: AmazonLightsailCreateKeyPairCommand.() -> Unit) {
	this.block.declare(AmazonLightsailCreateKeyPairCommand().apply(init))
}

@Generated
class AmazonLightsailCreateKeyPairCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateKeyPairRequest> {

	var keyPairName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.CreateKeyPairRequest {
		val input = com.amazonaws.services.lightsail.model.CreateKeyPairRequest()
		input.setKeyPairName(this.keyPairName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.createKeyPair(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-key-pair")
				.argument("key-pair-name", keyPairName)
	}

}


fun AmazonLightsailFunctions.createLoadBalancer(init: AmazonLightsailCreateLoadBalancerCommand.() -> Unit) {
	this.block.declare(AmazonLightsailCreateLoadBalancerCommand().apply(init))
}

@Generated
class AmazonLightsailCreateLoadBalancerCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateLoadBalancerRequest> {

	var loadBalancerName: String? = null
	var instancePort: Int? = 0
	var healthCheckPath: String? = null
	var certificateName: String? = null
	var certificateDomainName: String? = null
	var certificateAlternativeNames: List<String>? = null

	override fun build(): com.amazonaws.services.lightsail.model.CreateLoadBalancerRequest {
		val input = com.amazonaws.services.lightsail.model.CreateLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setInstancePort(this.instancePort)
		input.setHealthCheckPath(this.healthCheckPath)
		input.setCertificateName(this.certificateName)
		input.setCertificateDomainName(this.certificateDomainName)
		input.setCertificateAlternativeNames(this.certificateAlternativeNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.createLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
				.argument("instance-port", instancePort?.toString())
				.argument("health-check-path", healthCheckPath)
				.argument("certificate-name", certificateName)
				.argument("certificate-domain-name", certificateDomainName)
				.argument("certificate-alternative-names", certificateAlternativeNames?.toString())
	}

}


fun AmazonLightsailFunctions.createLoadBalancerTlsCertificate(init: AmazonLightsailCreateLoadBalancerTlsCertificateCommand.() -> Unit) {
	this.block.declare(AmazonLightsailCreateLoadBalancerTlsCertificateCommand().apply(init))
}

@Generated
class AmazonLightsailCreateLoadBalancerTlsCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateRequest> {

	var loadBalancerName: String? = null
	var certificateName: String? = null
	var certificateDomainName: String? = null
	var certificateAlternativeNames: List<String>? = null

	override fun build(): com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateRequest {
		val input = com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setCertificateName(this.certificateName)
		input.setCertificateDomainName(this.certificateDomainName)
		input.setCertificateAlternativeNames(this.certificateAlternativeNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.createLoadBalancerTlsCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-load-balancer-tls-certificate")
				.argument("load-balancer-name", loadBalancerName)
				.argument("certificate-name", certificateName)
				.argument("certificate-domain-name", certificateDomainName)
				.argument("certificate-alternative-names", certificateAlternativeNames?.toString())
	}

}


fun AmazonLightsailFunctions.deleteDisk(init: AmazonLightsailDeleteDiskCommand.() -> Unit) {
	this.block.declare(AmazonLightsailDeleteDiskCommand().apply(init))
}

@Generated
class AmazonLightsailDeleteDiskCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteDiskRequest> {

	var diskName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DeleteDiskRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteDiskRequest()
		input.setDiskName(this.diskName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.deleteDisk(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-disk")
				.argument("disk-name", diskName)
	}

}


fun AmazonLightsailFunctions.deleteDiskSnapshot(init: AmazonLightsailDeleteDiskSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonLightsailDeleteDiskSnapshotCommand().apply(init))
}

@Generated
class AmazonLightsailDeleteDiskSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteDiskSnapshotRequest> {

	var diskSnapshotName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DeleteDiskSnapshotRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteDiskSnapshotRequest()
		input.setDiskSnapshotName(this.diskSnapshotName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.deleteDiskSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-disk-snapshot")
				.argument("disk-snapshot-name", diskSnapshotName)
	}

}


fun AmazonLightsailFunctions.deleteDomain(init: AmazonLightsailDeleteDomainCommand.() -> Unit) {
	this.block.declare(AmazonLightsailDeleteDomainCommand().apply(init))
}

@Generated
class AmazonLightsailDeleteDomainCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteDomainRequest> {

	var domainName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DeleteDomainRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.deleteDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-domain")
				.argument("domain-name", domainName)
	}

}


fun AmazonLightsailFunctions.deleteDomainEntry(init: AmazonLightsailDeleteDomainEntryCommand.() -> Unit) {
	this.block.declare(AmazonLightsailDeleteDomainEntryCommand().apply(init))
}

@Generated
class AmazonLightsailDeleteDomainEntryCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteDomainEntryRequest> {

	var domainName: String? = null
	var domainEntry: com.amazonaws.services.lightsail.model.DomainEntry? = null

	override fun build(): com.amazonaws.services.lightsail.model.DeleteDomainEntryRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteDomainEntryRequest()
		input.setDomainName(this.domainName)
		input.setDomainEntry(this.domainEntry)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.deleteDomainEntry(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-domain-entry")
				.argument("domain-name", domainName)
				.argument("domain-entry", domainEntry?.toString())
	}

}


fun AmazonLightsailFunctions.deleteInstance(init: AmazonLightsailDeleteInstanceCommand.() -> Unit) {
	this.block.declare(AmazonLightsailDeleteInstanceCommand().apply(init))
}

@Generated
class AmazonLightsailDeleteInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteInstanceRequest> {

	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DeleteInstanceRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteInstanceRequest()
		input.setInstanceName(this.instanceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.deleteInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-instance")
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.deleteInstanceSnapshot(init: AmazonLightsailDeleteInstanceSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonLightsailDeleteInstanceSnapshotCommand().apply(init))
}

@Generated
class AmazonLightsailDeleteInstanceSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotRequest> {

	var instanceSnapshotName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotRequest()
		input.setInstanceSnapshotName(this.instanceSnapshotName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.deleteInstanceSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-instance-snapshot")
				.argument("instance-snapshot-name", instanceSnapshotName)
	}

}


fun AmazonLightsailFunctions.deleteKeyPair(init: AmazonLightsailDeleteKeyPairCommand.() -> Unit) {
	this.block.declare(AmazonLightsailDeleteKeyPairCommand().apply(init))
}

@Generated
class AmazonLightsailDeleteKeyPairCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteKeyPairRequest> {

	var keyPairName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DeleteKeyPairRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteKeyPairRequest()
		input.setKeyPairName(this.keyPairName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.deleteKeyPair(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-key-pair")
				.argument("key-pair-name", keyPairName)
	}

}


fun AmazonLightsailFunctions.deleteLoadBalancer(init: AmazonLightsailDeleteLoadBalancerCommand.() -> Unit) {
	this.block.declare(AmazonLightsailDeleteLoadBalancerCommand().apply(init))
}

@Generated
class AmazonLightsailDeleteLoadBalancerCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteLoadBalancerRequest> {

	var loadBalancerName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DeleteLoadBalancerRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.deleteLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
	}

}


fun AmazonLightsailFunctions.deleteLoadBalancerTlsCertificate(init: AmazonLightsailDeleteLoadBalancerTlsCertificateCommand.() -> Unit) {
	this.block.declare(AmazonLightsailDeleteLoadBalancerTlsCertificateCommand().apply(init))
}

@Generated
class AmazonLightsailDeleteLoadBalancerTlsCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateRequest> {

	var loadBalancerName: String? = null
	var certificateName: String? = null
	var force: Boolean? = false

	override fun build(): com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setCertificateName(this.certificateName)
		input.setForce(this.force)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.deleteLoadBalancerTlsCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-load-balancer-tls-certificate")
				.argument("load-balancer-name", loadBalancerName)
				.argument("certificate-name", certificateName)
				.option("force", force ?: false)
	}

}


fun AmazonLightsailFunctions.detachDisk(init: AmazonLightsailDetachDiskCommand.() -> Unit) {
	this.block.declare(AmazonLightsailDetachDiskCommand().apply(init))
}

@Generated
class AmazonLightsailDetachDiskCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DetachDiskRequest> {

	var diskName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DetachDiskRequest {
		val input = com.amazonaws.services.lightsail.model.DetachDiskRequest()
		input.setDiskName(this.diskName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.detachDisk(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail detach-disk")
				.argument("disk-name", diskName)
	}

}


fun AmazonLightsailFunctions.detachInstancesFromLoadBalancer(init: AmazonLightsailDetachInstancesFromLoadBalancerCommand.() -> Unit) {
	this.block.declare(AmazonLightsailDetachInstancesFromLoadBalancerCommand().apply(init))
}

@Generated
class AmazonLightsailDetachInstancesFromLoadBalancerCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerRequest> {

	var loadBalancerName: String? = null
	var instanceNames: List<String>? = null

	override fun build(): com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerRequest {
		val input = com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setInstanceNames(this.instanceNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.detachInstancesFromLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail detach-instances-from-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
				.argument("instance-names", instanceNames?.toString())
	}

}


fun AmazonLightsailFunctions.detachStaticIp(init: AmazonLightsailDetachStaticIpCommand.() -> Unit) {
	this.block.declare(AmazonLightsailDetachStaticIpCommand().apply(init))
}

@Generated
class AmazonLightsailDetachStaticIpCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DetachStaticIpRequest> {

	var staticIpName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DetachStaticIpRequest {
		val input = com.amazonaws.services.lightsail.model.DetachStaticIpRequest()
		input.setStaticIpName(this.staticIpName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.detachStaticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail detach-static-ip")
				.argument("static-ip-name", staticIpName)
	}

}


fun AmazonLightsailFunctions.downloadDefaultKeyPair(init: AmazonLightsailDownloadDefaultKeyPairCommand.() -> Unit) {
	this.block.declare(AmazonLightsailDownloadDefaultKeyPairCommand().apply(init))
}

@Generated
class AmazonLightsailDownloadDefaultKeyPairCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairRequest> {



	override fun build(): com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairRequest {
		val input = com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.downloadDefaultKeyPair(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail download-default-key-pair")

	}

}


fun AmazonLightsailFunctions.getActiveNames(init: AmazonLightsailGetActiveNamesCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetActiveNamesCommand().apply(init))
}

@Generated
class AmazonLightsailGetActiveNamesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetActiveNamesRequest> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetActiveNamesRequest {
		val input = com.amazonaws.services.lightsail.model.GetActiveNamesRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getActiveNames(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-active-names")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getBlueprints(init: AmazonLightsailGetBlueprintsCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetBlueprintsCommand().apply(init))
}

@Generated
class AmazonLightsailGetBlueprintsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetBlueprintsRequest> {

	var includeInactive: Boolean? = false
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetBlueprintsRequest {
		val input = com.amazonaws.services.lightsail.model.GetBlueprintsRequest()
		input.setIncludeInactive(this.includeInactive)
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getBlueprints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-blueprints")
				.option("include-inactive", includeInactive ?: false)
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getBundles(init: AmazonLightsailGetBundlesCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetBundlesCommand().apply(init))
}

@Generated
class AmazonLightsailGetBundlesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetBundlesRequest> {

	var includeInactive: Boolean? = false
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetBundlesRequest {
		val input = com.amazonaws.services.lightsail.model.GetBundlesRequest()
		input.setIncludeInactive(this.includeInactive)
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getBundles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-bundles")
				.option("include-inactive", includeInactive ?: false)
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getDisk(init: AmazonLightsailGetDiskCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetDiskCommand().apply(init))
}

@Generated
class AmazonLightsailGetDiskCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetDiskRequest> {

	var diskName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetDiskRequest {
		val input = com.amazonaws.services.lightsail.model.GetDiskRequest()
		input.setDiskName(this.diskName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getDisk(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-disk")
				.argument("disk-name", diskName)
	}

}


fun AmazonLightsailFunctions.getDiskSnapshot(init: AmazonLightsailGetDiskSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetDiskSnapshotCommand().apply(init))
}

@Generated
class AmazonLightsailGetDiskSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetDiskSnapshotRequest> {

	var diskSnapshotName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetDiskSnapshotRequest {
		val input = com.amazonaws.services.lightsail.model.GetDiskSnapshotRequest()
		input.setDiskSnapshotName(this.diskSnapshotName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getDiskSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-disk-snapshot")
				.argument("disk-snapshot-name", diskSnapshotName)
	}

}


fun AmazonLightsailFunctions.getDiskSnapshots(init: AmazonLightsailGetDiskSnapshotsCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetDiskSnapshotsCommand().apply(init))
}

@Generated
class AmazonLightsailGetDiskSnapshotsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetDiskSnapshotsRequest> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetDiskSnapshotsRequest {
		val input = com.amazonaws.services.lightsail.model.GetDiskSnapshotsRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getDiskSnapshots(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-disk-snapshots")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getDisks(init: AmazonLightsailGetDisksCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetDisksCommand().apply(init))
}

@Generated
class AmazonLightsailGetDisksCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetDisksRequest> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetDisksRequest {
		val input = com.amazonaws.services.lightsail.model.GetDisksRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getDisks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-disks")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getDomain(init: AmazonLightsailGetDomainCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetDomainCommand().apply(init))
}

@Generated
class AmazonLightsailGetDomainCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetDomainRequest> {

	var domainName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetDomainRequest {
		val input = com.amazonaws.services.lightsail.model.GetDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-domain")
				.argument("domain-name", domainName)
	}

}


fun AmazonLightsailFunctions.getDomains(init: AmazonLightsailGetDomainsCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetDomainsCommand().apply(init))
}

@Generated
class AmazonLightsailGetDomainsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetDomainsRequest> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetDomainsRequest {
		val input = com.amazonaws.services.lightsail.model.GetDomainsRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getDomains(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-domains")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getInstance(init: AmazonLightsailGetInstanceCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetInstanceCommand().apply(init))
}

@Generated
class AmazonLightsailGetInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetInstanceRequest> {

	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetInstanceRequest {
		val input = com.amazonaws.services.lightsail.model.GetInstanceRequest()
		input.setInstanceName(this.instanceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-instance")
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.getInstanceAccessDetails(init: AmazonLightsailGetInstanceAccessDetailsCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetInstanceAccessDetailsCommand().apply(init))
}

@Generated
class AmazonLightsailGetInstanceAccessDetailsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsRequest> {

	var instanceName: String? = null
	var protocol: InstanceAccessProtocol? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsRequest {
		val input = com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsRequest()
		input.setInstanceName(this.instanceName)
		input.setProtocol(this.protocol?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getInstanceAccessDetails(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-instance-access-details")
				.argument("instance-name", instanceName)
				.argument("protocol", protocol?.toString())
	}

}


fun AmazonLightsailFunctions.getInstanceMetricData(init: AmazonLightsailGetInstanceMetricDataCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetInstanceMetricDataCommand().apply(init))
}

@Generated
class AmazonLightsailGetInstanceMetricDataCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetInstanceMetricDataRequest> {

	var instanceName: String? = null
	var metricName: InstanceMetricName? = null
	var period: Int? = 0
	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null
	var unit: MetricUnit? = null
	var statistics: List<MetricStatistic>? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetInstanceMetricDataRequest {
		val input = com.amazonaws.services.lightsail.model.GetInstanceMetricDataRequest()
		input.setInstanceName(this.instanceName)
		input.setMetricName(this.metricName?.toString())
		input.setPeriod(this.period)
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setUnit(this.unit?.toString())
		input.setStatistics(this.statistics?.map { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getInstanceMetricData(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-instance-metric-data")
				.argument("instance-name", instanceName)
				.argument("metric-name", metricName?.toString())
				.argument("period", period?.toString())
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("unit", unit?.toString())
				.argument("statistics", statistics?.toString())
	}

}


fun AmazonLightsailFunctions.getInstancePortStates(init: AmazonLightsailGetInstancePortStatesCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetInstancePortStatesCommand().apply(init))
}

@Generated
class AmazonLightsailGetInstancePortStatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetInstancePortStatesRequest> {

	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetInstancePortStatesRequest {
		val input = com.amazonaws.services.lightsail.model.GetInstancePortStatesRequest()
		input.setInstanceName(this.instanceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getInstancePortStates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-instance-port-states")
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.getInstanceSnapshot(init: AmazonLightsailGetInstanceSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetInstanceSnapshotCommand().apply(init))
}

@Generated
class AmazonLightsailGetInstanceSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetInstanceSnapshotRequest> {

	var instanceSnapshotName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetInstanceSnapshotRequest {
		val input = com.amazonaws.services.lightsail.model.GetInstanceSnapshotRequest()
		input.setInstanceSnapshotName(this.instanceSnapshotName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getInstanceSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-instance-snapshot")
				.argument("instance-snapshot-name", instanceSnapshotName)
	}

}


fun AmazonLightsailFunctions.getInstanceSnapshots(init: AmazonLightsailGetInstanceSnapshotsCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetInstanceSnapshotsCommand().apply(init))
}

@Generated
class AmazonLightsailGetInstanceSnapshotsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetInstanceSnapshotsRequest> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetInstanceSnapshotsRequest {
		val input = com.amazonaws.services.lightsail.model.GetInstanceSnapshotsRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getInstanceSnapshots(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-instance-snapshots")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getInstanceState(init: AmazonLightsailGetInstanceStateCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetInstanceStateCommand().apply(init))
}

@Generated
class AmazonLightsailGetInstanceStateCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetInstanceStateRequest> {

	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetInstanceStateRequest {
		val input = com.amazonaws.services.lightsail.model.GetInstanceStateRequest()
		input.setInstanceName(this.instanceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getInstanceState(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-instance-state")
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.getInstances(init: AmazonLightsailGetInstancesCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetInstancesCommand().apply(init))
}

@Generated
class AmazonLightsailGetInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetInstancesRequest> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetInstancesRequest {
		val input = com.amazonaws.services.lightsail.model.GetInstancesRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-instances")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getKeyPair(init: AmazonLightsailGetKeyPairCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetKeyPairCommand().apply(init))
}

@Generated
class AmazonLightsailGetKeyPairCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetKeyPairRequest> {

	var keyPairName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetKeyPairRequest {
		val input = com.amazonaws.services.lightsail.model.GetKeyPairRequest()
		input.setKeyPairName(this.keyPairName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getKeyPair(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-key-pair")
				.argument("key-pair-name", keyPairName)
	}

}


fun AmazonLightsailFunctions.getKeyPairs(init: AmazonLightsailGetKeyPairsCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetKeyPairsCommand().apply(init))
}

@Generated
class AmazonLightsailGetKeyPairsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetKeyPairsRequest> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetKeyPairsRequest {
		val input = com.amazonaws.services.lightsail.model.GetKeyPairsRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getKeyPairs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-key-pairs")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getLoadBalancer(init: AmazonLightsailGetLoadBalancerCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetLoadBalancerCommand().apply(init))
}

@Generated
class AmazonLightsailGetLoadBalancerCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetLoadBalancerRequest> {

	var loadBalancerName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetLoadBalancerRequest {
		val input = com.amazonaws.services.lightsail.model.GetLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
	}

}


fun AmazonLightsailFunctions.getLoadBalancerMetricData(init: AmazonLightsailGetLoadBalancerMetricDataCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetLoadBalancerMetricDataCommand().apply(init))
}

@Generated
class AmazonLightsailGetLoadBalancerMetricDataCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataRequest> {

	var loadBalancerName: String? = null
	var metricName: LoadBalancerMetricName? = null
	var period: Int? = 0
	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null
	var unit: MetricUnit? = null
	var statistics: List<MetricStatistic>? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataRequest {
		val input = com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setMetricName(this.metricName?.toString())
		input.setPeriod(this.period)
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setUnit(this.unit?.toString())
		input.setStatistics(this.statistics?.map { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getLoadBalancerMetricData(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-load-balancer-metric-data")
				.argument("load-balancer-name", loadBalancerName)
				.argument("metric-name", metricName?.toString())
				.argument("period", period?.toString())
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("unit", unit?.toString())
				.argument("statistics", statistics?.toString())
	}

}


fun AmazonLightsailFunctions.getLoadBalancerTlsCertificates(init: AmazonLightsailGetLoadBalancerTlsCertificatesCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetLoadBalancerTlsCertificatesCommand().apply(init))
}

@Generated
class AmazonLightsailGetLoadBalancerTlsCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesRequest> {

	var loadBalancerName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesRequest {
		val input = com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getLoadBalancerTlsCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-load-balancer-tls-certificates")
				.argument("load-balancer-name", loadBalancerName)
	}

}


fun AmazonLightsailFunctions.getLoadBalancers(init: AmazonLightsailGetLoadBalancersCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetLoadBalancersCommand().apply(init))
}

@Generated
class AmazonLightsailGetLoadBalancersCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetLoadBalancersRequest> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetLoadBalancersRequest {
		val input = com.amazonaws.services.lightsail.model.GetLoadBalancersRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getLoadBalancers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-load-balancers")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getOperation(init: AmazonLightsailGetOperationCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetOperationCommand().apply(init))
}

@Generated
class AmazonLightsailGetOperationCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetOperationRequest> {

	var operationId: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetOperationRequest {
		val input = com.amazonaws.services.lightsail.model.GetOperationRequest()
		input.setOperationId(this.operationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getOperation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-operation")
				.argument("operation-id", operationId)
	}

}


fun AmazonLightsailFunctions.getOperations(init: AmazonLightsailGetOperationsCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetOperationsCommand().apply(init))
}

@Generated
class AmazonLightsailGetOperationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetOperationsRequest> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetOperationsRequest {
		val input = com.amazonaws.services.lightsail.model.GetOperationsRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getOperations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-operations")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getOperationsForResource(init: AmazonLightsailGetOperationsForResourceCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetOperationsForResourceCommand().apply(init))
}

@Generated
class AmazonLightsailGetOperationsForResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetOperationsForResourceRequest> {

	var resourceName: String? = null
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetOperationsForResourceRequest {
		val input = com.amazonaws.services.lightsail.model.GetOperationsForResourceRequest()
		input.setResourceName(this.resourceName)
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getOperationsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-operations-for-resource")
				.argument("resource-name", resourceName)
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getRegions(init: AmazonLightsailGetRegionsCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetRegionsCommand().apply(init))
}

@Generated
class AmazonLightsailGetRegionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetRegionsRequest> {

	var includeAvailabilityZones: Boolean? = false

	override fun build(): com.amazonaws.services.lightsail.model.GetRegionsRequest {
		val input = com.amazonaws.services.lightsail.model.GetRegionsRequest()
		input.setIncludeAvailabilityZones(this.includeAvailabilityZones)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getRegions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-regions")
				.option("include-availability-zones", includeAvailabilityZones ?: false)
	}

}


fun AmazonLightsailFunctions.getStaticIp(init: AmazonLightsailGetStaticIpCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetStaticIpCommand().apply(init))
}

@Generated
class AmazonLightsailGetStaticIpCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetStaticIpRequest> {

	var staticIpName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetStaticIpRequest {
		val input = com.amazonaws.services.lightsail.model.GetStaticIpRequest()
		input.setStaticIpName(this.staticIpName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getStaticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-static-ip")
				.argument("static-ip-name", staticIpName)
	}

}


fun AmazonLightsailFunctions.getStaticIps(init: AmazonLightsailGetStaticIpsCommand.() -> Unit) {
	this.block.declare(AmazonLightsailGetStaticIpsCommand().apply(init))
}

@Generated
class AmazonLightsailGetStaticIpsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetStaticIpsRequest> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetStaticIpsRequest {
		val input = com.amazonaws.services.lightsail.model.GetStaticIpsRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.getStaticIps(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-static-ips")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.importKeyPair(init: AmazonLightsailImportKeyPairCommand.() -> Unit) {
	this.block.declare(AmazonLightsailImportKeyPairCommand().apply(init))
}

@Generated
class AmazonLightsailImportKeyPairCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.ImportKeyPairRequest> {

	var keyPairName: String? = null
	var publicKeyBase64: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.ImportKeyPairRequest {
		val input = com.amazonaws.services.lightsail.model.ImportKeyPairRequest()
		input.setKeyPairName(this.keyPairName)
		input.setPublicKeyBase64(this.publicKeyBase64)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.importKeyPair(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail import-key-pair")
				.argument("key-pair-name", keyPairName)
				.argument("public-key-base64", publicKeyBase64)
	}

}


fun AmazonLightsailFunctions.isVpcPeered(init: AmazonLightsailIsVpcPeeredCommand.() -> Unit) {
	this.block.declare(AmazonLightsailIsVpcPeeredCommand().apply(init))
}

@Generated
class AmazonLightsailIsVpcPeeredCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.IsVpcPeeredRequest> {



	override fun build(): com.amazonaws.services.lightsail.model.IsVpcPeeredRequest {
		val input = com.amazonaws.services.lightsail.model.IsVpcPeeredRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.isVpcPeered(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail is-vpc-peered")

	}

}


fun AmazonLightsailFunctions.openInstancePublicPorts(init: AmazonLightsailOpenInstancePublicPortsCommand.() -> Unit) {
	this.block.declare(AmazonLightsailOpenInstancePublicPortsCommand().apply(init))
}

@Generated
class AmazonLightsailOpenInstancePublicPortsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.OpenInstancePublicPortsRequest> {

	var portInfo: com.amazonaws.services.lightsail.model.PortInfo? = null
	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.OpenInstancePublicPortsRequest {
		val input = com.amazonaws.services.lightsail.model.OpenInstancePublicPortsRequest()
		input.setPortInfo(this.portInfo)
		input.setInstanceName(this.instanceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.openInstancePublicPorts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail open-instance-public-ports")
				.argument("port-info", portInfo?.toString())
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.peerVpc(init: AmazonLightsailPeerVpcCommand.() -> Unit) {
	this.block.declare(AmazonLightsailPeerVpcCommand().apply(init))
}

@Generated
class AmazonLightsailPeerVpcCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.PeerVpcRequest> {



	override fun build(): com.amazonaws.services.lightsail.model.PeerVpcRequest {
		val input = com.amazonaws.services.lightsail.model.PeerVpcRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.peerVpc(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail peer-vpc")

	}

}


fun AmazonLightsailFunctions.putInstancePublicPorts(init: AmazonLightsailPutInstancePublicPortsCommand.() -> Unit) {
	this.block.declare(AmazonLightsailPutInstancePublicPortsCommand().apply(init))
}

@Generated
class AmazonLightsailPutInstancePublicPortsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.PutInstancePublicPortsRequest> {

	var portInfos: List<com.amazonaws.services.lightsail.model.PortInfo>? = null
	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.PutInstancePublicPortsRequest {
		val input = com.amazonaws.services.lightsail.model.PutInstancePublicPortsRequest()
		input.setPortInfos(this.portInfos)
		input.setInstanceName(this.instanceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.putInstancePublicPorts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail put-instance-public-ports")
				.argument("port-infos", portInfos?.toString())
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.rebootInstance(init: AmazonLightsailRebootInstanceCommand.() -> Unit) {
	this.block.declare(AmazonLightsailRebootInstanceCommand().apply(init))
}

@Generated
class AmazonLightsailRebootInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.RebootInstanceRequest> {

	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.RebootInstanceRequest {
		val input = com.amazonaws.services.lightsail.model.RebootInstanceRequest()
		input.setInstanceName(this.instanceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.rebootInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail reboot-instance")
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.releaseStaticIp(init: AmazonLightsailReleaseStaticIpCommand.() -> Unit) {
	this.block.declare(AmazonLightsailReleaseStaticIpCommand().apply(init))
}

@Generated
class AmazonLightsailReleaseStaticIpCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.ReleaseStaticIpRequest> {

	var staticIpName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.ReleaseStaticIpRequest {
		val input = com.amazonaws.services.lightsail.model.ReleaseStaticIpRequest()
		input.setStaticIpName(this.staticIpName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.releaseStaticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail release-static-ip")
				.argument("static-ip-name", staticIpName)
	}

}


fun AmazonLightsailFunctions.startInstance(init: AmazonLightsailStartInstanceCommand.() -> Unit) {
	this.block.declare(AmazonLightsailStartInstanceCommand().apply(init))
}

@Generated
class AmazonLightsailStartInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.StartInstanceRequest> {

	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.StartInstanceRequest {
		val input = com.amazonaws.services.lightsail.model.StartInstanceRequest()
		input.setInstanceName(this.instanceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.startInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail start-instance")
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.stopInstance(init: AmazonLightsailStopInstanceCommand.() -> Unit) {
	this.block.declare(AmazonLightsailStopInstanceCommand().apply(init))
}

@Generated
class AmazonLightsailStopInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.StopInstanceRequest> {

	var instanceName: String? = null
	var force: Boolean? = false

	override fun build(): com.amazonaws.services.lightsail.model.StopInstanceRequest {
		val input = com.amazonaws.services.lightsail.model.StopInstanceRequest()
		input.setInstanceName(this.instanceName)
		input.setForce(this.force)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.stopInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail stop-instance")
				.argument("instance-name", instanceName)
				.option("force", force ?: false)
	}

}


fun AmazonLightsailFunctions.unpeerVpc(init: AmazonLightsailUnpeerVpcCommand.() -> Unit) {
	this.block.declare(AmazonLightsailUnpeerVpcCommand().apply(init))
}

@Generated
class AmazonLightsailUnpeerVpcCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.UnpeerVpcRequest> {



	override fun build(): com.amazonaws.services.lightsail.model.UnpeerVpcRequest {
		val input = com.amazonaws.services.lightsail.model.UnpeerVpcRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.unpeerVpc(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail unpeer-vpc")

	}

}


fun AmazonLightsailFunctions.updateDomainEntry(init: AmazonLightsailUpdateDomainEntryCommand.() -> Unit) {
	this.block.declare(AmazonLightsailUpdateDomainEntryCommand().apply(init))
}

@Generated
class AmazonLightsailUpdateDomainEntryCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.UpdateDomainEntryRequest> {

	var domainName: String? = null
	var domainEntry: com.amazonaws.services.lightsail.model.DomainEntry? = null

	override fun build(): com.amazonaws.services.lightsail.model.UpdateDomainEntryRequest {
		val input = com.amazonaws.services.lightsail.model.UpdateDomainEntryRequest()
		input.setDomainName(this.domainName)
		input.setDomainEntry(this.domainEntry)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.updateDomainEntry(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail update-domain-entry")
				.argument("domain-name", domainName)
				.argument("domain-entry", domainEntry?.toString())
	}

}


fun AmazonLightsailFunctions.updateLoadBalancerAttribute(init: AmazonLightsailUpdateLoadBalancerAttributeCommand.() -> Unit) {
	this.block.declare(AmazonLightsailUpdateLoadBalancerAttributeCommand().apply(init))
}

@Generated
class AmazonLightsailUpdateLoadBalancerAttributeCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeRequest> {

	var loadBalancerName: String? = null
	var attributeName: LoadBalancerAttributeName? = null
	var attributeValue: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeRequest {
		val input = com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setAttributeName(this.attributeName?.toString())
		input.setAttributeValue(this.attributeValue)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lightsail.updateLoadBalancerAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail update-load-balancer-attribute")
				.argument("load-balancer-name", loadBalancerName)
				.argument("attribute-name", attributeName?.toString())
				.argument("attribute-value", attributeValue)
	}

}
