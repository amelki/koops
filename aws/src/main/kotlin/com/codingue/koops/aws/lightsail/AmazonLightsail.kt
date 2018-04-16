
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.lightsail

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.lightsail.*
import com.amazonaws.services.lightsail.model.*

var com.codingue.koops.core.Environment.lightsail: AmazonLightsail
	get() {
		var service = this.capabilities["aws-lightsail"]
		if (service == null) {
			service = AmazonLightsailClientBuilder.standard().build()
			this.capabilities["aws-lightsail"] = service
		}
		return service as AmazonLightsail
	}
	set(lightsail) {
		this.capabilities["aws-lightsail"] = lightsail
	}

@Generated
class AmazonLightsailFunctions(val block: Script)

infix fun <T> AwsContinuation.lightsail(init: AmazonLightsailFunctions.() -> T): T {
	return AmazonLightsailFunctions(shell).run(init)
}

			

fun AmazonLightsailFunctions.allocateStaticIp(init: (AmazonLightsailAllocateStaticIpCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.AllocateStaticIpResult {
	return this.block.declare(AmazonLightsailAllocateStaticIpCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.AllocateStaticIpResult
}

@Generated
class AmazonLightsailAllocateStaticIpCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.AllocateStaticIpRequest, com.amazonaws.services.lightsail.model.AllocateStaticIpResult> {

	var staticIpName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.AllocateStaticIpRequest {
		val input = com.amazonaws.services.lightsail.model.AllocateStaticIpRequest()
		input.setStaticIpName(this.staticIpName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.AllocateStaticIpResult {
	  return com.amazonaws.services.lightsail.model.AllocateStaticIpResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.AllocateStaticIpResult {
		return environment.lightsail.allocateStaticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail allocate-static-ip")
				.argument("static-ip-name", staticIpName)
	}

}


fun AmazonLightsailFunctions.attachDisk(init: (AmazonLightsailAttachDiskCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.AttachDiskResult {
	return this.block.declare(AmazonLightsailAttachDiskCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.AttachDiskResult
}

@Generated
class AmazonLightsailAttachDiskCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.AttachDiskRequest, com.amazonaws.services.lightsail.model.AttachDiskResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.AttachDiskResult {
	  return com.amazonaws.services.lightsail.model.AttachDiskResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.AttachDiskResult {
		return environment.lightsail.attachDisk(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail attach-disk")
				.argument("disk-name", diskName)
				.argument("instance-name", instanceName)
				.argument("disk-path", diskPath)
	}

}


fun AmazonLightsailFunctions.attachInstancesToLoadBalancer(init: (AmazonLightsailAttachInstancesToLoadBalancerCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerResult {
	return this.block.declare(AmazonLightsailAttachInstancesToLoadBalancerCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerResult
}

@Generated
class AmazonLightsailAttachInstancesToLoadBalancerCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerRequest, com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerResult> {

	var loadBalancerName: String? = null
	var instanceNames: List<String>? = null

	override fun build(): com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerRequest {
		val input = com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setInstanceNames(this.instanceNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerResult {
	  return com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerResult {
		return environment.lightsail.attachInstancesToLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail attach-instances-to-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
				.argument("instance-names", instanceNames?.toString())
	}

}


fun AmazonLightsailFunctions.attachLoadBalancerTlsCertificate(init: (AmazonLightsailAttachLoadBalancerTlsCertificateCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateResult {
	return this.block.declare(AmazonLightsailAttachLoadBalancerTlsCertificateCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateResult
}

@Generated
class AmazonLightsailAttachLoadBalancerTlsCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateRequest, com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateResult> {

	var loadBalancerName: String? = null
	var certificateName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateRequest {
		val input = com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setCertificateName(this.certificateName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateResult {
	  return com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateResult {
		return environment.lightsail.attachLoadBalancerTlsCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail attach-load-balancer-tls-certificate")
				.argument("load-balancer-name", loadBalancerName)
				.argument("certificate-name", certificateName)
	}

}


fun AmazonLightsailFunctions.attachStaticIp(init: (AmazonLightsailAttachStaticIpCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.AttachStaticIpResult {
	return this.block.declare(AmazonLightsailAttachStaticIpCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.AttachStaticIpResult
}

@Generated
class AmazonLightsailAttachStaticIpCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.AttachStaticIpRequest, com.amazonaws.services.lightsail.model.AttachStaticIpResult> {

	var staticIpName: String? = null
	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.AttachStaticIpRequest {
		val input = com.amazonaws.services.lightsail.model.AttachStaticIpRequest()
		input.setStaticIpName(this.staticIpName)
		input.setInstanceName(this.instanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.AttachStaticIpResult {
	  return com.amazonaws.services.lightsail.model.AttachStaticIpResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.AttachStaticIpResult {
		return environment.lightsail.attachStaticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail attach-static-ip")
				.argument("static-ip-name", staticIpName)
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.closeInstancePublicPorts(init: (AmazonLightsailCloseInstancePublicPortsCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.CloseInstancePublicPortsResult {
	return this.block.declare(AmazonLightsailCloseInstancePublicPortsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.CloseInstancePublicPortsResult
}

@Generated
class AmazonLightsailCloseInstancePublicPortsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CloseInstancePublicPortsRequest, com.amazonaws.services.lightsail.model.CloseInstancePublicPortsResult> {

	var portInfo: com.amazonaws.services.lightsail.model.PortInfo? = null
	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.CloseInstancePublicPortsRequest {
		val input = com.amazonaws.services.lightsail.model.CloseInstancePublicPortsRequest()
		input.setPortInfo(this.portInfo)
		input.setInstanceName(this.instanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.CloseInstancePublicPortsResult {
	  return com.amazonaws.services.lightsail.model.CloseInstancePublicPortsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.CloseInstancePublicPortsResult {
		return environment.lightsail.closeInstancePublicPorts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail close-instance-public-ports")
				.argument("port-info", portInfo?.toString())
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.createDisk(init: (AmazonLightsailCreateDiskCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.CreateDiskResult {
	return this.block.declare(AmazonLightsailCreateDiskCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.CreateDiskResult
}

@Generated
class AmazonLightsailCreateDiskCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateDiskRequest, com.amazonaws.services.lightsail.model.CreateDiskResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.CreateDiskResult {
	  return com.amazonaws.services.lightsail.model.CreateDiskResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.CreateDiskResult {
		return environment.lightsail.createDisk(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-disk")
				.argument("disk-name", diskName)
				.argument("availability-zone", availabilityZone)
				.argument("size-in-gb", sizeInGb?.toString())
	}

}


fun AmazonLightsailFunctions.createDiskFromSnapshot(init: (AmazonLightsailCreateDiskFromSnapshotCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotResult {
	return this.block.declare(AmazonLightsailCreateDiskFromSnapshotCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotResult
}

@Generated
class AmazonLightsailCreateDiskFromSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotRequest, com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotResult {
	  return com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotResult {
		return environment.lightsail.createDiskFromSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-disk-from-snapshot")
				.argument("disk-name", diskName)
				.argument("disk-snapshot-name", diskSnapshotName)
				.argument("availability-zone", availabilityZone)
				.argument("size-in-gb", sizeInGb?.toString())
	}

}


fun AmazonLightsailFunctions.createDiskSnapshot(init: (AmazonLightsailCreateDiskSnapshotCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.CreateDiskSnapshotResult {
	return this.block.declare(AmazonLightsailCreateDiskSnapshotCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.CreateDiskSnapshotResult
}

@Generated
class AmazonLightsailCreateDiskSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateDiskSnapshotRequest, com.amazonaws.services.lightsail.model.CreateDiskSnapshotResult> {

	var diskName: String? = null
	var diskSnapshotName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.CreateDiskSnapshotRequest {
		val input = com.amazonaws.services.lightsail.model.CreateDiskSnapshotRequest()
		input.setDiskName(this.diskName)
		input.setDiskSnapshotName(this.diskSnapshotName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.CreateDiskSnapshotResult {
	  return com.amazonaws.services.lightsail.model.CreateDiskSnapshotResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.CreateDiskSnapshotResult {
		return environment.lightsail.createDiskSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-disk-snapshot")
				.argument("disk-name", diskName)
				.argument("disk-snapshot-name", diskSnapshotName)
	}

}


fun AmazonLightsailFunctions.createDomain(init: (AmazonLightsailCreateDomainCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.CreateDomainResult {
	return this.block.declare(AmazonLightsailCreateDomainCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.CreateDomainResult
}

@Generated
class AmazonLightsailCreateDomainCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateDomainRequest, com.amazonaws.services.lightsail.model.CreateDomainResult> {

	var domainName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.CreateDomainRequest {
		val input = com.amazonaws.services.lightsail.model.CreateDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.CreateDomainResult {
	  return com.amazonaws.services.lightsail.model.CreateDomainResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.CreateDomainResult {
		return environment.lightsail.createDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-domain")
				.argument("domain-name", domainName)
	}

}


fun AmazonLightsailFunctions.createDomainEntry(init: (AmazonLightsailCreateDomainEntryCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.CreateDomainEntryResult {
	return this.block.declare(AmazonLightsailCreateDomainEntryCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.CreateDomainEntryResult
}

@Generated
class AmazonLightsailCreateDomainEntryCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateDomainEntryRequest, com.amazonaws.services.lightsail.model.CreateDomainEntryResult> {

	var domainName: String? = null
	var domainEntry: com.amazonaws.services.lightsail.model.DomainEntry? = null

	override fun build(): com.amazonaws.services.lightsail.model.CreateDomainEntryRequest {
		val input = com.amazonaws.services.lightsail.model.CreateDomainEntryRequest()
		input.setDomainName(this.domainName)
		input.setDomainEntry(this.domainEntry)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.CreateDomainEntryResult {
	  return com.amazonaws.services.lightsail.model.CreateDomainEntryResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.CreateDomainEntryResult {
		return environment.lightsail.createDomainEntry(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-domain-entry")
				.argument("domain-name", domainName)
				.argument("domain-entry", domainEntry?.toString())
	}

}


fun AmazonLightsailFunctions.createInstanceSnapshot(init: (AmazonLightsailCreateInstanceSnapshotCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.CreateInstanceSnapshotResult {
	return this.block.declare(AmazonLightsailCreateInstanceSnapshotCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.CreateInstanceSnapshotResult
}

@Generated
class AmazonLightsailCreateInstanceSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest, com.amazonaws.services.lightsail.model.CreateInstanceSnapshotResult> {

	var instanceSnapshotName: String? = null
	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest {
		val input = com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest()
		input.setInstanceSnapshotName(this.instanceSnapshotName)
		input.setInstanceName(this.instanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.CreateInstanceSnapshotResult {
	  return com.amazonaws.services.lightsail.model.CreateInstanceSnapshotResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.CreateInstanceSnapshotResult {
		return environment.lightsail.createInstanceSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-instance-snapshot")
				.argument("instance-snapshot-name", instanceSnapshotName)
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.createInstances(init: (AmazonLightsailCreateInstancesCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.CreateInstancesResult {
	return this.block.declare(AmazonLightsailCreateInstancesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.CreateInstancesResult
}

@Generated
class AmazonLightsailCreateInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateInstancesRequest, com.amazonaws.services.lightsail.model.CreateInstancesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.CreateInstancesResult {
	  return com.amazonaws.services.lightsail.model.CreateInstancesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.CreateInstancesResult {
		return environment.lightsail.createInstances(build())
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


fun AmazonLightsailFunctions.createInstancesFromSnapshot(init: (AmazonLightsailCreateInstancesFromSnapshotCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotResult {
	return this.block.declare(AmazonLightsailCreateInstancesFromSnapshotCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotResult
}

@Generated
class AmazonLightsailCreateInstancesFromSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotRequest, com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotResult {
	  return com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotResult {
		return environment.lightsail.createInstancesFromSnapshot(build())
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


fun AmazonLightsailFunctions.createKeyPair(init: (AmazonLightsailCreateKeyPairCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.CreateKeyPairResult {
	return this.block.declare(AmazonLightsailCreateKeyPairCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.CreateKeyPairResult
}

@Generated
class AmazonLightsailCreateKeyPairCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateKeyPairRequest, com.amazonaws.services.lightsail.model.CreateKeyPairResult> {

	var keyPairName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.CreateKeyPairRequest {
		val input = com.amazonaws.services.lightsail.model.CreateKeyPairRequest()
		input.setKeyPairName(this.keyPairName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.CreateKeyPairResult {
	  return com.amazonaws.services.lightsail.model.CreateKeyPairResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.CreateKeyPairResult {
		return environment.lightsail.createKeyPair(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-key-pair")
				.argument("key-pair-name", keyPairName)
	}

}


fun AmazonLightsailFunctions.createLoadBalancer(init: (AmazonLightsailCreateLoadBalancerCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.CreateLoadBalancerResult {
	return this.block.declare(AmazonLightsailCreateLoadBalancerCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.CreateLoadBalancerResult
}

@Generated
class AmazonLightsailCreateLoadBalancerCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateLoadBalancerRequest, com.amazonaws.services.lightsail.model.CreateLoadBalancerResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.CreateLoadBalancerResult {
	  return com.amazonaws.services.lightsail.model.CreateLoadBalancerResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.CreateLoadBalancerResult {
		return environment.lightsail.createLoadBalancer(build())
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


fun AmazonLightsailFunctions.createLoadBalancerTlsCertificate(init: (AmazonLightsailCreateLoadBalancerTlsCertificateCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateResult {
	return this.block.declare(AmazonLightsailCreateLoadBalancerTlsCertificateCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateResult
}

@Generated
class AmazonLightsailCreateLoadBalancerTlsCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateRequest, com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateResult {
	  return com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateResult {
		return environment.lightsail.createLoadBalancerTlsCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail create-load-balancer-tls-certificate")
				.argument("load-balancer-name", loadBalancerName)
				.argument("certificate-name", certificateName)
				.argument("certificate-domain-name", certificateDomainName)
				.argument("certificate-alternative-names", certificateAlternativeNames?.toString())
	}

}


fun AmazonLightsailFunctions.deleteDisk(init: (AmazonLightsailDeleteDiskCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.DeleteDiskResult {
	return this.block.declare(AmazonLightsailDeleteDiskCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.DeleteDiskResult
}

@Generated
class AmazonLightsailDeleteDiskCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteDiskRequest, com.amazonaws.services.lightsail.model.DeleteDiskResult> {

	var diskName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DeleteDiskRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteDiskRequest()
		input.setDiskName(this.diskName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.DeleteDiskResult {
	  return com.amazonaws.services.lightsail.model.DeleteDiskResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.DeleteDiskResult {
		return environment.lightsail.deleteDisk(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-disk")
				.argument("disk-name", diskName)
	}

}


fun AmazonLightsailFunctions.deleteDiskSnapshot(init: (AmazonLightsailDeleteDiskSnapshotCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.DeleteDiskSnapshotResult {
	return this.block.declare(AmazonLightsailDeleteDiskSnapshotCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.DeleteDiskSnapshotResult
}

@Generated
class AmazonLightsailDeleteDiskSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteDiskSnapshotRequest, com.amazonaws.services.lightsail.model.DeleteDiskSnapshotResult> {

	var diskSnapshotName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DeleteDiskSnapshotRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteDiskSnapshotRequest()
		input.setDiskSnapshotName(this.diskSnapshotName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.DeleteDiskSnapshotResult {
	  return com.amazonaws.services.lightsail.model.DeleteDiskSnapshotResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.DeleteDiskSnapshotResult {
		return environment.lightsail.deleteDiskSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-disk-snapshot")
				.argument("disk-snapshot-name", diskSnapshotName)
	}

}


fun AmazonLightsailFunctions.deleteDomain(init: (AmazonLightsailDeleteDomainCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.DeleteDomainResult {
	return this.block.declare(AmazonLightsailDeleteDomainCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.DeleteDomainResult
}

@Generated
class AmazonLightsailDeleteDomainCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteDomainRequest, com.amazonaws.services.lightsail.model.DeleteDomainResult> {

	var domainName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DeleteDomainRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.DeleteDomainResult {
	  return com.amazonaws.services.lightsail.model.DeleteDomainResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.DeleteDomainResult {
		return environment.lightsail.deleteDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-domain")
				.argument("domain-name", domainName)
	}

}


fun AmazonLightsailFunctions.deleteDomainEntry(init: (AmazonLightsailDeleteDomainEntryCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.DeleteDomainEntryResult {
	return this.block.declare(AmazonLightsailDeleteDomainEntryCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.DeleteDomainEntryResult
}

@Generated
class AmazonLightsailDeleteDomainEntryCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteDomainEntryRequest, com.amazonaws.services.lightsail.model.DeleteDomainEntryResult> {

	var domainName: String? = null
	var domainEntry: com.amazonaws.services.lightsail.model.DomainEntry? = null

	override fun build(): com.amazonaws.services.lightsail.model.DeleteDomainEntryRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteDomainEntryRequest()
		input.setDomainName(this.domainName)
		input.setDomainEntry(this.domainEntry)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.DeleteDomainEntryResult {
	  return com.amazonaws.services.lightsail.model.DeleteDomainEntryResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.DeleteDomainEntryResult {
		return environment.lightsail.deleteDomainEntry(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-domain-entry")
				.argument("domain-name", domainName)
				.argument("domain-entry", domainEntry?.toString())
	}

}


fun AmazonLightsailFunctions.deleteInstance(init: (AmazonLightsailDeleteInstanceCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.DeleteInstanceResult {
	return this.block.declare(AmazonLightsailDeleteInstanceCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.DeleteInstanceResult
}

@Generated
class AmazonLightsailDeleteInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteInstanceRequest, com.amazonaws.services.lightsail.model.DeleteInstanceResult> {

	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DeleteInstanceRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteInstanceRequest()
		input.setInstanceName(this.instanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.DeleteInstanceResult {
	  return com.amazonaws.services.lightsail.model.DeleteInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.DeleteInstanceResult {
		return environment.lightsail.deleteInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-instance")
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.deleteInstanceSnapshot(init: (AmazonLightsailDeleteInstanceSnapshotCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotResult {
	return this.block.declare(AmazonLightsailDeleteInstanceSnapshotCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotResult
}

@Generated
class AmazonLightsailDeleteInstanceSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotRequest, com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotResult> {

	var instanceSnapshotName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotRequest()
		input.setInstanceSnapshotName(this.instanceSnapshotName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotResult {
	  return com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotResult {
		return environment.lightsail.deleteInstanceSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-instance-snapshot")
				.argument("instance-snapshot-name", instanceSnapshotName)
	}

}


fun AmazonLightsailFunctions.deleteKeyPair(init: (AmazonLightsailDeleteKeyPairCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.DeleteKeyPairResult {
	return this.block.declare(AmazonLightsailDeleteKeyPairCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.DeleteKeyPairResult
}

@Generated
class AmazonLightsailDeleteKeyPairCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteKeyPairRequest, com.amazonaws.services.lightsail.model.DeleteKeyPairResult> {

	var keyPairName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DeleteKeyPairRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteKeyPairRequest()
		input.setKeyPairName(this.keyPairName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.DeleteKeyPairResult {
	  return com.amazonaws.services.lightsail.model.DeleteKeyPairResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.DeleteKeyPairResult {
		return environment.lightsail.deleteKeyPair(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-key-pair")
				.argument("key-pair-name", keyPairName)
	}

}


fun AmazonLightsailFunctions.deleteLoadBalancer(init: (AmazonLightsailDeleteLoadBalancerCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.DeleteLoadBalancerResult {
	return this.block.declare(AmazonLightsailDeleteLoadBalancerCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.DeleteLoadBalancerResult
}

@Generated
class AmazonLightsailDeleteLoadBalancerCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteLoadBalancerRequest, com.amazonaws.services.lightsail.model.DeleteLoadBalancerResult> {

	var loadBalancerName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DeleteLoadBalancerRequest {
		val input = com.amazonaws.services.lightsail.model.DeleteLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.DeleteLoadBalancerResult {
	  return com.amazonaws.services.lightsail.model.DeleteLoadBalancerResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.DeleteLoadBalancerResult {
		return environment.lightsail.deleteLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
	}

}


fun AmazonLightsailFunctions.deleteLoadBalancerTlsCertificate(init: (AmazonLightsailDeleteLoadBalancerTlsCertificateCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateResult {
	return this.block.declare(AmazonLightsailDeleteLoadBalancerTlsCertificateCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateResult
}

@Generated
class AmazonLightsailDeleteLoadBalancerTlsCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateRequest, com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateResult {
	  return com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateResult {
		return environment.lightsail.deleteLoadBalancerTlsCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail delete-load-balancer-tls-certificate")
				.argument("load-balancer-name", loadBalancerName)
				.argument("certificate-name", certificateName)
				.option("force", force ?: false)
	}

}


fun AmazonLightsailFunctions.detachDisk(init: (AmazonLightsailDetachDiskCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.DetachDiskResult {
	return this.block.declare(AmazonLightsailDetachDiskCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.DetachDiskResult
}

@Generated
class AmazonLightsailDetachDiskCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DetachDiskRequest, com.amazonaws.services.lightsail.model.DetachDiskResult> {

	var diskName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DetachDiskRequest {
		val input = com.amazonaws.services.lightsail.model.DetachDiskRequest()
		input.setDiskName(this.diskName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.DetachDiskResult {
	  return com.amazonaws.services.lightsail.model.DetachDiskResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.DetachDiskResult {
		return environment.lightsail.detachDisk(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail detach-disk")
				.argument("disk-name", diskName)
	}

}


fun AmazonLightsailFunctions.detachInstancesFromLoadBalancer(init: (AmazonLightsailDetachInstancesFromLoadBalancerCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerResult {
	return this.block.declare(AmazonLightsailDetachInstancesFromLoadBalancerCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerResult
}

@Generated
class AmazonLightsailDetachInstancesFromLoadBalancerCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerRequest, com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerResult> {

	var loadBalancerName: String? = null
	var instanceNames: List<String>? = null

	override fun build(): com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerRequest {
		val input = com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setInstanceNames(this.instanceNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerResult {
	  return com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerResult {
		return environment.lightsail.detachInstancesFromLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail detach-instances-from-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
				.argument("instance-names", instanceNames?.toString())
	}

}


fun AmazonLightsailFunctions.detachStaticIp(init: (AmazonLightsailDetachStaticIpCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.DetachStaticIpResult {
	return this.block.declare(AmazonLightsailDetachStaticIpCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.DetachStaticIpResult
}

@Generated
class AmazonLightsailDetachStaticIpCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DetachStaticIpRequest, com.amazonaws.services.lightsail.model.DetachStaticIpResult> {

	var staticIpName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.DetachStaticIpRequest {
		val input = com.amazonaws.services.lightsail.model.DetachStaticIpRequest()
		input.setStaticIpName(this.staticIpName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.DetachStaticIpResult {
	  return com.amazonaws.services.lightsail.model.DetachStaticIpResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.DetachStaticIpResult {
		return environment.lightsail.detachStaticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail detach-static-ip")
				.argument("static-ip-name", staticIpName)
	}

}


fun AmazonLightsailFunctions.downloadDefaultKeyPair(init: (AmazonLightsailDownloadDefaultKeyPairCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairResult {
	return this.block.declare(AmazonLightsailDownloadDefaultKeyPairCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairResult
}

@Generated
class AmazonLightsailDownloadDefaultKeyPairCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairRequest, com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairResult> {



	override fun build(): com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairRequest {
		val input = com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairResult {
	  return com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairResult {
		return environment.lightsail.downloadDefaultKeyPair(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail download-default-key-pair")

	}

}


fun AmazonLightsailFunctions.getActiveNames(init: (AmazonLightsailGetActiveNamesCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetActiveNamesResult {
	return this.block.declare(AmazonLightsailGetActiveNamesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetActiveNamesResult
}

@Generated
class AmazonLightsailGetActiveNamesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetActiveNamesRequest, com.amazonaws.services.lightsail.model.GetActiveNamesResult> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetActiveNamesRequest {
		val input = com.amazonaws.services.lightsail.model.GetActiveNamesRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetActiveNamesResult {
	  return com.amazonaws.services.lightsail.model.GetActiveNamesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetActiveNamesResult {
		return environment.lightsail.getActiveNames(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-active-names")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getBlueprints(init: (AmazonLightsailGetBlueprintsCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetBlueprintsResult {
	return this.block.declare(AmazonLightsailGetBlueprintsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetBlueprintsResult
}

@Generated
class AmazonLightsailGetBlueprintsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetBlueprintsRequest, com.amazonaws.services.lightsail.model.GetBlueprintsResult> {

	var includeInactive: Boolean? = false
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetBlueprintsRequest {
		val input = com.amazonaws.services.lightsail.model.GetBlueprintsRequest()
		input.setIncludeInactive(this.includeInactive)
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetBlueprintsResult {
	  return com.amazonaws.services.lightsail.model.GetBlueprintsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetBlueprintsResult {
		return environment.lightsail.getBlueprints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-blueprints")
				.option("include-inactive", includeInactive ?: false)
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getBundles(init: (AmazonLightsailGetBundlesCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetBundlesResult {
	return this.block.declare(AmazonLightsailGetBundlesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetBundlesResult
}

@Generated
class AmazonLightsailGetBundlesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetBundlesRequest, com.amazonaws.services.lightsail.model.GetBundlesResult> {

	var includeInactive: Boolean? = false
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetBundlesRequest {
		val input = com.amazonaws.services.lightsail.model.GetBundlesRequest()
		input.setIncludeInactive(this.includeInactive)
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetBundlesResult {
	  return com.amazonaws.services.lightsail.model.GetBundlesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetBundlesResult {
		return environment.lightsail.getBundles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-bundles")
				.option("include-inactive", includeInactive ?: false)
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getDisk(init: (AmazonLightsailGetDiskCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetDiskResult {
	return this.block.declare(AmazonLightsailGetDiskCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetDiskResult
}

@Generated
class AmazonLightsailGetDiskCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetDiskRequest, com.amazonaws.services.lightsail.model.GetDiskResult> {

	var diskName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetDiskRequest {
		val input = com.amazonaws.services.lightsail.model.GetDiskRequest()
		input.setDiskName(this.diskName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetDiskResult {
	  return com.amazonaws.services.lightsail.model.GetDiskResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetDiskResult {
		return environment.lightsail.getDisk(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-disk")
				.argument("disk-name", diskName)
	}

}


fun AmazonLightsailFunctions.getDiskSnapshot(init: (AmazonLightsailGetDiskSnapshotCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetDiskSnapshotResult {
	return this.block.declare(AmazonLightsailGetDiskSnapshotCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetDiskSnapshotResult
}

@Generated
class AmazonLightsailGetDiskSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetDiskSnapshotRequest, com.amazonaws.services.lightsail.model.GetDiskSnapshotResult> {

	var diskSnapshotName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetDiskSnapshotRequest {
		val input = com.amazonaws.services.lightsail.model.GetDiskSnapshotRequest()
		input.setDiskSnapshotName(this.diskSnapshotName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetDiskSnapshotResult {
	  return com.amazonaws.services.lightsail.model.GetDiskSnapshotResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetDiskSnapshotResult {
		return environment.lightsail.getDiskSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-disk-snapshot")
				.argument("disk-snapshot-name", diskSnapshotName)
	}

}


fun AmazonLightsailFunctions.getDiskSnapshots(init: (AmazonLightsailGetDiskSnapshotsCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetDiskSnapshotsResult {
	return this.block.declare(AmazonLightsailGetDiskSnapshotsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetDiskSnapshotsResult
}

@Generated
class AmazonLightsailGetDiskSnapshotsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetDiskSnapshotsRequest, com.amazonaws.services.lightsail.model.GetDiskSnapshotsResult> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetDiskSnapshotsRequest {
		val input = com.amazonaws.services.lightsail.model.GetDiskSnapshotsRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetDiskSnapshotsResult {
	  return com.amazonaws.services.lightsail.model.GetDiskSnapshotsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetDiskSnapshotsResult {
		return environment.lightsail.getDiskSnapshots(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-disk-snapshots")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getDisks(init: (AmazonLightsailGetDisksCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetDisksResult {
	return this.block.declare(AmazonLightsailGetDisksCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetDisksResult
}

@Generated
class AmazonLightsailGetDisksCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetDisksRequest, com.amazonaws.services.lightsail.model.GetDisksResult> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetDisksRequest {
		val input = com.amazonaws.services.lightsail.model.GetDisksRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetDisksResult {
	  return com.amazonaws.services.lightsail.model.GetDisksResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetDisksResult {
		return environment.lightsail.getDisks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-disks")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getDomain(init: (AmazonLightsailGetDomainCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetDomainResult {
	return this.block.declare(AmazonLightsailGetDomainCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetDomainResult
}

@Generated
class AmazonLightsailGetDomainCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetDomainRequest, com.amazonaws.services.lightsail.model.GetDomainResult> {

	var domainName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetDomainRequest {
		val input = com.amazonaws.services.lightsail.model.GetDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetDomainResult {
	  return com.amazonaws.services.lightsail.model.GetDomainResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetDomainResult {
		return environment.lightsail.getDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-domain")
				.argument("domain-name", domainName)
	}

}


fun AmazonLightsailFunctions.getDomains(init: (AmazonLightsailGetDomainsCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetDomainsResult {
	return this.block.declare(AmazonLightsailGetDomainsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetDomainsResult
}

@Generated
class AmazonLightsailGetDomainsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetDomainsRequest, com.amazonaws.services.lightsail.model.GetDomainsResult> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetDomainsRequest {
		val input = com.amazonaws.services.lightsail.model.GetDomainsRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetDomainsResult {
	  return com.amazonaws.services.lightsail.model.GetDomainsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetDomainsResult {
		return environment.lightsail.getDomains(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-domains")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getInstance(init: (AmazonLightsailGetInstanceCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetInstanceResult {
	return this.block.declare(AmazonLightsailGetInstanceCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetInstanceResult
}

@Generated
class AmazonLightsailGetInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetInstanceRequest, com.amazonaws.services.lightsail.model.GetInstanceResult> {

	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetInstanceRequest {
		val input = com.amazonaws.services.lightsail.model.GetInstanceRequest()
		input.setInstanceName(this.instanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetInstanceResult {
	  return com.amazonaws.services.lightsail.model.GetInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetInstanceResult {
		return environment.lightsail.getInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-instance")
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.getInstanceAccessDetails(init: (AmazonLightsailGetInstanceAccessDetailsCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsResult {
	return this.block.declare(AmazonLightsailGetInstanceAccessDetailsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsResult
}

@Generated
class AmazonLightsailGetInstanceAccessDetailsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsRequest, com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsResult> {

	var instanceName: String? = null
	var protocol: InstanceAccessProtocol? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsRequest {
		val input = com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsRequest()
		input.setInstanceName(this.instanceName)
		input.setProtocol(this.protocol?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsResult {
	  return com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsResult {
		return environment.lightsail.getInstanceAccessDetails(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-instance-access-details")
				.argument("instance-name", instanceName)
				.argument("protocol", protocol?.toString())
	}

}


fun AmazonLightsailFunctions.getInstanceMetricData(init: (AmazonLightsailGetInstanceMetricDataCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetInstanceMetricDataResult {
	return this.block.declare(AmazonLightsailGetInstanceMetricDataCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetInstanceMetricDataResult
}

@Generated
class AmazonLightsailGetInstanceMetricDataCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetInstanceMetricDataRequest, com.amazonaws.services.lightsail.model.GetInstanceMetricDataResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetInstanceMetricDataResult {
	  return com.amazonaws.services.lightsail.model.GetInstanceMetricDataResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetInstanceMetricDataResult {
		return environment.lightsail.getInstanceMetricData(build())
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


fun AmazonLightsailFunctions.getInstancePortStates(init: (AmazonLightsailGetInstancePortStatesCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetInstancePortStatesResult {
	return this.block.declare(AmazonLightsailGetInstancePortStatesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetInstancePortStatesResult
}

@Generated
class AmazonLightsailGetInstancePortStatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetInstancePortStatesRequest, com.amazonaws.services.lightsail.model.GetInstancePortStatesResult> {

	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetInstancePortStatesRequest {
		val input = com.amazonaws.services.lightsail.model.GetInstancePortStatesRequest()
		input.setInstanceName(this.instanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetInstancePortStatesResult {
	  return com.amazonaws.services.lightsail.model.GetInstancePortStatesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetInstancePortStatesResult {
		return environment.lightsail.getInstancePortStates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-instance-port-states")
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.getInstanceSnapshot(init: (AmazonLightsailGetInstanceSnapshotCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetInstanceSnapshotResult {
	return this.block.declare(AmazonLightsailGetInstanceSnapshotCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetInstanceSnapshotResult
}

@Generated
class AmazonLightsailGetInstanceSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetInstanceSnapshotRequest, com.amazonaws.services.lightsail.model.GetInstanceSnapshotResult> {

	var instanceSnapshotName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetInstanceSnapshotRequest {
		val input = com.amazonaws.services.lightsail.model.GetInstanceSnapshotRequest()
		input.setInstanceSnapshotName(this.instanceSnapshotName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetInstanceSnapshotResult {
	  return com.amazonaws.services.lightsail.model.GetInstanceSnapshotResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetInstanceSnapshotResult {
		return environment.lightsail.getInstanceSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-instance-snapshot")
				.argument("instance-snapshot-name", instanceSnapshotName)
	}

}


fun AmazonLightsailFunctions.getInstanceSnapshots(init: (AmazonLightsailGetInstanceSnapshotsCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetInstanceSnapshotsResult {
	return this.block.declare(AmazonLightsailGetInstanceSnapshotsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetInstanceSnapshotsResult
}

@Generated
class AmazonLightsailGetInstanceSnapshotsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetInstanceSnapshotsRequest, com.amazonaws.services.lightsail.model.GetInstanceSnapshotsResult> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetInstanceSnapshotsRequest {
		val input = com.amazonaws.services.lightsail.model.GetInstanceSnapshotsRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetInstanceSnapshotsResult {
	  return com.amazonaws.services.lightsail.model.GetInstanceSnapshotsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetInstanceSnapshotsResult {
		return environment.lightsail.getInstanceSnapshots(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-instance-snapshots")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getInstanceState(init: (AmazonLightsailGetInstanceStateCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetInstanceStateResult {
	return this.block.declare(AmazonLightsailGetInstanceStateCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetInstanceStateResult
}

@Generated
class AmazonLightsailGetInstanceStateCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetInstanceStateRequest, com.amazonaws.services.lightsail.model.GetInstanceStateResult> {

	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetInstanceStateRequest {
		val input = com.amazonaws.services.lightsail.model.GetInstanceStateRequest()
		input.setInstanceName(this.instanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetInstanceStateResult {
	  return com.amazonaws.services.lightsail.model.GetInstanceStateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetInstanceStateResult {
		return environment.lightsail.getInstanceState(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-instance-state")
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.getInstances(init: (AmazonLightsailGetInstancesCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetInstancesResult {
	return this.block.declare(AmazonLightsailGetInstancesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetInstancesResult
}

@Generated
class AmazonLightsailGetInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetInstancesRequest, com.amazonaws.services.lightsail.model.GetInstancesResult> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetInstancesRequest {
		val input = com.amazonaws.services.lightsail.model.GetInstancesRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetInstancesResult {
	  return com.amazonaws.services.lightsail.model.GetInstancesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetInstancesResult {
		return environment.lightsail.getInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-instances")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getKeyPair(init: (AmazonLightsailGetKeyPairCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetKeyPairResult {
	return this.block.declare(AmazonLightsailGetKeyPairCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetKeyPairResult
}

@Generated
class AmazonLightsailGetKeyPairCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetKeyPairRequest, com.amazonaws.services.lightsail.model.GetKeyPairResult> {

	var keyPairName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetKeyPairRequest {
		val input = com.amazonaws.services.lightsail.model.GetKeyPairRequest()
		input.setKeyPairName(this.keyPairName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetKeyPairResult {
	  return com.amazonaws.services.lightsail.model.GetKeyPairResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetKeyPairResult {
		return environment.lightsail.getKeyPair(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-key-pair")
				.argument("key-pair-name", keyPairName)
	}

}


fun AmazonLightsailFunctions.getKeyPairs(init: (AmazonLightsailGetKeyPairsCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetKeyPairsResult {
	return this.block.declare(AmazonLightsailGetKeyPairsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetKeyPairsResult
}

@Generated
class AmazonLightsailGetKeyPairsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetKeyPairsRequest, com.amazonaws.services.lightsail.model.GetKeyPairsResult> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetKeyPairsRequest {
		val input = com.amazonaws.services.lightsail.model.GetKeyPairsRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetKeyPairsResult {
	  return com.amazonaws.services.lightsail.model.GetKeyPairsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetKeyPairsResult {
		return environment.lightsail.getKeyPairs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-key-pairs")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getLoadBalancer(init: (AmazonLightsailGetLoadBalancerCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetLoadBalancerResult {
	return this.block.declare(AmazonLightsailGetLoadBalancerCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetLoadBalancerResult
}

@Generated
class AmazonLightsailGetLoadBalancerCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetLoadBalancerRequest, com.amazonaws.services.lightsail.model.GetLoadBalancerResult> {

	var loadBalancerName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetLoadBalancerRequest {
		val input = com.amazonaws.services.lightsail.model.GetLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetLoadBalancerResult {
	  return com.amazonaws.services.lightsail.model.GetLoadBalancerResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetLoadBalancerResult {
		return environment.lightsail.getLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
	}

}


fun AmazonLightsailFunctions.getLoadBalancerMetricData(init: (AmazonLightsailGetLoadBalancerMetricDataCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataResult {
	return this.block.declare(AmazonLightsailGetLoadBalancerMetricDataCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataResult
}

@Generated
class AmazonLightsailGetLoadBalancerMetricDataCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataRequest, com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataResult {
	  return com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataResult {
		return environment.lightsail.getLoadBalancerMetricData(build())
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


fun AmazonLightsailFunctions.getLoadBalancerTlsCertificates(init: (AmazonLightsailGetLoadBalancerTlsCertificatesCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesResult {
	return this.block.declare(AmazonLightsailGetLoadBalancerTlsCertificatesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesResult
}

@Generated
class AmazonLightsailGetLoadBalancerTlsCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesRequest, com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesResult> {

	var loadBalancerName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesRequest {
		val input = com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesResult {
	  return com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesResult {
		return environment.lightsail.getLoadBalancerTlsCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-load-balancer-tls-certificates")
				.argument("load-balancer-name", loadBalancerName)
	}

}


fun AmazonLightsailFunctions.getLoadBalancers(init: (AmazonLightsailGetLoadBalancersCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetLoadBalancersResult {
	return this.block.declare(AmazonLightsailGetLoadBalancersCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetLoadBalancersResult
}

@Generated
class AmazonLightsailGetLoadBalancersCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetLoadBalancersRequest, com.amazonaws.services.lightsail.model.GetLoadBalancersResult> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetLoadBalancersRequest {
		val input = com.amazonaws.services.lightsail.model.GetLoadBalancersRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetLoadBalancersResult {
	  return com.amazonaws.services.lightsail.model.GetLoadBalancersResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetLoadBalancersResult {
		return environment.lightsail.getLoadBalancers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-load-balancers")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getOperation(init: (AmazonLightsailGetOperationCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetOperationResult {
	return this.block.declare(AmazonLightsailGetOperationCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetOperationResult
}

@Generated
class AmazonLightsailGetOperationCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetOperationRequest, com.amazonaws.services.lightsail.model.GetOperationResult> {

	var operationId: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetOperationRequest {
		val input = com.amazonaws.services.lightsail.model.GetOperationRequest()
		input.setOperationId(this.operationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetOperationResult {
	  return com.amazonaws.services.lightsail.model.GetOperationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetOperationResult {
		return environment.lightsail.getOperation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-operation")
				.argument("operation-id", operationId)
	}

}


fun AmazonLightsailFunctions.getOperations(init: (AmazonLightsailGetOperationsCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetOperationsResult {
	return this.block.declare(AmazonLightsailGetOperationsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetOperationsResult
}

@Generated
class AmazonLightsailGetOperationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetOperationsRequest, com.amazonaws.services.lightsail.model.GetOperationsResult> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetOperationsRequest {
		val input = com.amazonaws.services.lightsail.model.GetOperationsRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetOperationsResult {
	  return com.amazonaws.services.lightsail.model.GetOperationsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetOperationsResult {
		return environment.lightsail.getOperations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-operations")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getOperationsForResource(init: (AmazonLightsailGetOperationsForResourceCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetOperationsForResourceResult {
	return this.block.declare(AmazonLightsailGetOperationsForResourceCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetOperationsForResourceResult
}

@Generated
class AmazonLightsailGetOperationsForResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetOperationsForResourceRequest, com.amazonaws.services.lightsail.model.GetOperationsForResourceResult> {

	var resourceName: String? = null
	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetOperationsForResourceRequest {
		val input = com.amazonaws.services.lightsail.model.GetOperationsForResourceRequest()
		input.setResourceName(this.resourceName)
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetOperationsForResourceResult {
	  return com.amazonaws.services.lightsail.model.GetOperationsForResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetOperationsForResourceResult {
		return environment.lightsail.getOperationsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-operations-for-resource")
				.argument("resource-name", resourceName)
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.getRegions(init: (AmazonLightsailGetRegionsCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetRegionsResult {
	return this.block.declare(AmazonLightsailGetRegionsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetRegionsResult
}

@Generated
class AmazonLightsailGetRegionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetRegionsRequest, com.amazonaws.services.lightsail.model.GetRegionsResult> {

	var includeAvailabilityZones: Boolean? = false

	override fun build(): com.amazonaws.services.lightsail.model.GetRegionsRequest {
		val input = com.amazonaws.services.lightsail.model.GetRegionsRequest()
		input.setIncludeAvailabilityZones(this.includeAvailabilityZones)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetRegionsResult {
	  return com.amazonaws.services.lightsail.model.GetRegionsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetRegionsResult {
		return environment.lightsail.getRegions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-regions")
				.option("include-availability-zones", includeAvailabilityZones ?: false)
	}

}


fun AmazonLightsailFunctions.getStaticIp(init: (AmazonLightsailGetStaticIpCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetStaticIpResult {
	return this.block.declare(AmazonLightsailGetStaticIpCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetStaticIpResult
}

@Generated
class AmazonLightsailGetStaticIpCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetStaticIpRequest, com.amazonaws.services.lightsail.model.GetStaticIpResult> {

	var staticIpName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetStaticIpRequest {
		val input = com.amazonaws.services.lightsail.model.GetStaticIpRequest()
		input.setStaticIpName(this.staticIpName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetStaticIpResult {
	  return com.amazonaws.services.lightsail.model.GetStaticIpResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetStaticIpResult {
		return environment.lightsail.getStaticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-static-ip")
				.argument("static-ip-name", staticIpName)
	}

}


fun AmazonLightsailFunctions.getStaticIps(init: (AmazonLightsailGetStaticIpsCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.GetStaticIpsResult {
	return this.block.declare(AmazonLightsailGetStaticIpsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.GetStaticIpsResult
}

@Generated
class AmazonLightsailGetStaticIpsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.GetStaticIpsRequest, com.amazonaws.services.lightsail.model.GetStaticIpsResult> {

	var pageToken: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.GetStaticIpsRequest {
		val input = com.amazonaws.services.lightsail.model.GetStaticIpsRequest()
		input.setPageToken(this.pageToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.GetStaticIpsResult {
	  return com.amazonaws.services.lightsail.model.GetStaticIpsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.GetStaticIpsResult {
		return environment.lightsail.getStaticIps(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail get-static-ips")
				.argument("page-token", pageToken)
	}

}


fun AmazonLightsailFunctions.importKeyPair(init: (AmazonLightsailImportKeyPairCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.ImportKeyPairResult {
	return this.block.declare(AmazonLightsailImportKeyPairCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.ImportKeyPairResult
}

@Generated
class AmazonLightsailImportKeyPairCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.ImportKeyPairRequest, com.amazonaws.services.lightsail.model.ImportKeyPairResult> {

	var keyPairName: String? = null
	var publicKeyBase64: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.ImportKeyPairRequest {
		val input = com.amazonaws.services.lightsail.model.ImportKeyPairRequest()
		input.setKeyPairName(this.keyPairName)
		input.setPublicKeyBase64(this.publicKeyBase64)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.ImportKeyPairResult {
	  return com.amazonaws.services.lightsail.model.ImportKeyPairResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.ImportKeyPairResult {
		return environment.lightsail.importKeyPair(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail import-key-pair")
				.argument("key-pair-name", keyPairName)
				.argument("public-key-base64", publicKeyBase64)
	}

}


fun AmazonLightsailFunctions.isVpcPeered(init: (AmazonLightsailIsVpcPeeredCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.IsVpcPeeredResult {
	return this.block.declare(AmazonLightsailIsVpcPeeredCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.IsVpcPeeredResult
}

@Generated
class AmazonLightsailIsVpcPeeredCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.IsVpcPeeredRequest, com.amazonaws.services.lightsail.model.IsVpcPeeredResult> {



	override fun build(): com.amazonaws.services.lightsail.model.IsVpcPeeredRequest {
		val input = com.amazonaws.services.lightsail.model.IsVpcPeeredRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.IsVpcPeeredResult {
	  return com.amazonaws.services.lightsail.model.IsVpcPeeredResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.IsVpcPeeredResult {
		return environment.lightsail.isVpcPeered(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail is-vpc-peered")

	}

}


fun AmazonLightsailFunctions.openInstancePublicPorts(init: (AmazonLightsailOpenInstancePublicPortsCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.OpenInstancePublicPortsResult {
	return this.block.declare(AmazonLightsailOpenInstancePublicPortsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.OpenInstancePublicPortsResult
}

@Generated
class AmazonLightsailOpenInstancePublicPortsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.OpenInstancePublicPortsRequest, com.amazonaws.services.lightsail.model.OpenInstancePublicPortsResult> {

	var portInfo: com.amazonaws.services.lightsail.model.PortInfo? = null
	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.OpenInstancePublicPortsRequest {
		val input = com.amazonaws.services.lightsail.model.OpenInstancePublicPortsRequest()
		input.setPortInfo(this.portInfo)
		input.setInstanceName(this.instanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.OpenInstancePublicPortsResult {
	  return com.amazonaws.services.lightsail.model.OpenInstancePublicPortsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.OpenInstancePublicPortsResult {
		return environment.lightsail.openInstancePublicPorts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail open-instance-public-ports")
				.argument("port-info", portInfo?.toString())
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.peerVpc(init: (AmazonLightsailPeerVpcCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.PeerVpcResult {
	return this.block.declare(AmazonLightsailPeerVpcCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.PeerVpcResult
}

@Generated
class AmazonLightsailPeerVpcCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.PeerVpcRequest, com.amazonaws.services.lightsail.model.PeerVpcResult> {



	override fun build(): com.amazonaws.services.lightsail.model.PeerVpcRequest {
		val input = com.amazonaws.services.lightsail.model.PeerVpcRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.PeerVpcResult {
	  return com.amazonaws.services.lightsail.model.PeerVpcResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.PeerVpcResult {
		return environment.lightsail.peerVpc(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail peer-vpc")

	}

}


fun AmazonLightsailFunctions.putInstancePublicPorts(init: (AmazonLightsailPutInstancePublicPortsCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.PutInstancePublicPortsResult {
	return this.block.declare(AmazonLightsailPutInstancePublicPortsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.PutInstancePublicPortsResult
}

@Generated
class AmazonLightsailPutInstancePublicPortsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.PutInstancePublicPortsRequest, com.amazonaws.services.lightsail.model.PutInstancePublicPortsResult> {

	var portInfos: List<com.amazonaws.services.lightsail.model.PortInfo>? = null
	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.PutInstancePublicPortsRequest {
		val input = com.amazonaws.services.lightsail.model.PutInstancePublicPortsRequest()
		input.setPortInfos(this.portInfos)
		input.setInstanceName(this.instanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.PutInstancePublicPortsResult {
	  return com.amazonaws.services.lightsail.model.PutInstancePublicPortsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.PutInstancePublicPortsResult {
		return environment.lightsail.putInstancePublicPorts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail put-instance-public-ports")
				.argument("port-infos", portInfos?.toString())
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.rebootInstance(init: (AmazonLightsailRebootInstanceCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.RebootInstanceResult {
	return this.block.declare(AmazonLightsailRebootInstanceCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.RebootInstanceResult
}

@Generated
class AmazonLightsailRebootInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.RebootInstanceRequest, com.amazonaws.services.lightsail.model.RebootInstanceResult> {

	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.RebootInstanceRequest {
		val input = com.amazonaws.services.lightsail.model.RebootInstanceRequest()
		input.setInstanceName(this.instanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.RebootInstanceResult {
	  return com.amazonaws.services.lightsail.model.RebootInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.RebootInstanceResult {
		return environment.lightsail.rebootInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail reboot-instance")
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.releaseStaticIp(init: (AmazonLightsailReleaseStaticIpCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.ReleaseStaticIpResult {
	return this.block.declare(AmazonLightsailReleaseStaticIpCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.ReleaseStaticIpResult
}

@Generated
class AmazonLightsailReleaseStaticIpCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.ReleaseStaticIpRequest, com.amazonaws.services.lightsail.model.ReleaseStaticIpResult> {

	var staticIpName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.ReleaseStaticIpRequest {
		val input = com.amazonaws.services.lightsail.model.ReleaseStaticIpRequest()
		input.setStaticIpName(this.staticIpName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.ReleaseStaticIpResult {
	  return com.amazonaws.services.lightsail.model.ReleaseStaticIpResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.ReleaseStaticIpResult {
		return environment.lightsail.releaseStaticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail release-static-ip")
				.argument("static-ip-name", staticIpName)
	}

}


fun AmazonLightsailFunctions.startInstance(init: (AmazonLightsailStartInstanceCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.StartInstanceResult {
	return this.block.declare(AmazonLightsailStartInstanceCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.StartInstanceResult
}

@Generated
class AmazonLightsailStartInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.StartInstanceRequest, com.amazonaws.services.lightsail.model.StartInstanceResult> {

	var instanceName: String? = null

	override fun build(): com.amazonaws.services.lightsail.model.StartInstanceRequest {
		val input = com.amazonaws.services.lightsail.model.StartInstanceRequest()
		input.setInstanceName(this.instanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.StartInstanceResult {
	  return com.amazonaws.services.lightsail.model.StartInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.StartInstanceResult {
		return environment.lightsail.startInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail start-instance")
				.argument("instance-name", instanceName)
	}

}


fun AmazonLightsailFunctions.stopInstance(init: (AmazonLightsailStopInstanceCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.StopInstanceResult {
	return this.block.declare(AmazonLightsailStopInstanceCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.StopInstanceResult
}

@Generated
class AmazonLightsailStopInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.StopInstanceRequest, com.amazonaws.services.lightsail.model.StopInstanceResult> {

	var instanceName: String? = null
	var force: Boolean? = false

	override fun build(): com.amazonaws.services.lightsail.model.StopInstanceRequest {
		val input = com.amazonaws.services.lightsail.model.StopInstanceRequest()
		input.setInstanceName(this.instanceName)
		input.setForce(this.force)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.StopInstanceResult {
	  return com.amazonaws.services.lightsail.model.StopInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.StopInstanceResult {
		return environment.lightsail.stopInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail stop-instance")
				.argument("instance-name", instanceName)
				.option("force", force ?: false)
	}

}


fun AmazonLightsailFunctions.unpeerVpc(init: (AmazonLightsailUnpeerVpcCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.UnpeerVpcResult {
	return this.block.declare(AmazonLightsailUnpeerVpcCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.UnpeerVpcResult
}

@Generated
class AmazonLightsailUnpeerVpcCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.UnpeerVpcRequest, com.amazonaws.services.lightsail.model.UnpeerVpcResult> {



	override fun build(): com.amazonaws.services.lightsail.model.UnpeerVpcRequest {
		val input = com.amazonaws.services.lightsail.model.UnpeerVpcRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.UnpeerVpcResult {
	  return com.amazonaws.services.lightsail.model.UnpeerVpcResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.UnpeerVpcResult {
		return environment.lightsail.unpeerVpc(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail unpeer-vpc")

	}

}


fun AmazonLightsailFunctions.updateDomainEntry(init: (AmazonLightsailUpdateDomainEntryCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.UpdateDomainEntryResult {
	return this.block.declare(AmazonLightsailUpdateDomainEntryCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.UpdateDomainEntryResult
}

@Generated
class AmazonLightsailUpdateDomainEntryCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.UpdateDomainEntryRequest, com.amazonaws.services.lightsail.model.UpdateDomainEntryResult> {

	var domainName: String? = null
	var domainEntry: com.amazonaws.services.lightsail.model.DomainEntry? = null

	override fun build(): com.amazonaws.services.lightsail.model.UpdateDomainEntryRequest {
		val input = com.amazonaws.services.lightsail.model.UpdateDomainEntryRequest()
		input.setDomainName(this.domainName)
		input.setDomainEntry(this.domainEntry)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.UpdateDomainEntryResult {
	  return com.amazonaws.services.lightsail.model.UpdateDomainEntryResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.UpdateDomainEntryResult {
		return environment.lightsail.updateDomainEntry(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail update-domain-entry")
				.argument("domain-name", domainName)
				.argument("domain-entry", domainEntry?.toString())
	}

}


fun AmazonLightsailFunctions.updateLoadBalancerAttribute(init: (AmazonLightsailUpdateLoadBalancerAttributeCommand.() -> Unit)? = null): com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeResult {
	return this.block.declare(AmazonLightsailUpdateLoadBalancerAttributeCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeResult
}

@Generated
class AmazonLightsailUpdateLoadBalancerAttributeCommand() : AmazonWebServiceCommand<com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeRequest, com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeResult {
	  return com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeResult {
		return environment.lightsail.updateLoadBalancerAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lightsail update-load-balancer-attribute")
				.argument("load-balancer-name", loadBalancerName)
				.argument("attribute-name", attributeName?.toString())
				.argument("attribute-value", attributeValue)
	}

}
