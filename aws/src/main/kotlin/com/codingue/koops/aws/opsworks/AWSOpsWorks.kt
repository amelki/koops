
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.opsworks

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.opsworks.*
import com.amazonaws.services.opsworks.model.*

var com.codingue.koops.core.Environment.opsworks: AWSOpsWorks
	get() {
		var service = this.capabilities["aws-opsworks"]
		if (service == null) {
			service = AWSOpsWorksClientBuilder.standard().build()
			this.capabilities["aws-opsworks"] = service
		}
		return service as AWSOpsWorks
	}
	set(opsworks) {
		this.capabilities["aws-opsworks"] = opsworks
	}

@Generated
class AWSOpsWorksFunctions(val block: Script)

infix fun <T> AwsContinuation.opsworks(init: AWSOpsWorksFunctions.() -> T): T {
	return AWSOpsWorksFunctions(shell).run(init)
}

			

fun AWSOpsWorksFunctions.assignInstance(instanceId: String, layerIds: List<String>, init: (AWSOpsWorksAssignInstanceCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.AssignInstanceResult {
	return this.block.declare(AWSOpsWorksAssignInstanceCommand(instanceId, layerIds).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.AssignInstanceResult
}

@Generated
class AWSOpsWorksAssignInstanceCommand(val instanceId: String, val layerIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.AssignInstanceRequest, com.amazonaws.services.opsworks.model.AssignInstanceResult> {



	override fun build(): com.amazonaws.services.opsworks.model.AssignInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.AssignInstanceRequest()
		input.setInstanceId(this.instanceId)
		input.setLayerIds(this.layerIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.AssignInstanceResult {
	  return com.amazonaws.services.opsworks.model.AssignInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.AssignInstanceResult {
		return environment.opsworks.assignInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks assign-instance")
				.argument("instance-id", instanceId)
				.argument("layer-ids", layerIds.toString())
	}

}


fun AWSOpsWorksFunctions.assignVolume(volumeId: String, init: (AWSOpsWorksAssignVolumeCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.AssignVolumeResult {
	return this.block.declare(AWSOpsWorksAssignVolumeCommand(volumeId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.AssignVolumeResult
}

@Generated
class AWSOpsWorksAssignVolumeCommand(val volumeId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.AssignVolumeRequest, com.amazonaws.services.opsworks.model.AssignVolumeResult> {

	var instanceId: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.AssignVolumeRequest {
		val input = com.amazonaws.services.opsworks.model.AssignVolumeRequest()
		input.setVolumeId(this.volumeId)
		input.setInstanceId(this.instanceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.AssignVolumeResult {
	  return com.amazonaws.services.opsworks.model.AssignVolumeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.AssignVolumeResult {
		return environment.opsworks.assignVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks assign-volume")
				.argument("volume-id", volumeId)
				.argument("instance-id", instanceId)
	}

}


fun AWSOpsWorksFunctions.associateElasticIp(elasticIp: String, init: (AWSOpsWorksAssociateElasticIpCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.AssociateElasticIpResult {
	return this.block.declare(AWSOpsWorksAssociateElasticIpCommand(elasticIp).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.AssociateElasticIpResult
}

@Generated
class AWSOpsWorksAssociateElasticIpCommand(val elasticIp: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.AssociateElasticIpRequest, com.amazonaws.services.opsworks.model.AssociateElasticIpResult> {

	var instanceId: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.AssociateElasticIpRequest {
		val input = com.amazonaws.services.opsworks.model.AssociateElasticIpRequest()
		input.setElasticIp(this.elasticIp)
		input.setInstanceId(this.instanceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.AssociateElasticIpResult {
	  return com.amazonaws.services.opsworks.model.AssociateElasticIpResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.AssociateElasticIpResult {
		return environment.opsworks.associateElasticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks associate-elastic-ip")
				.argument("elastic-ip", elasticIp)
				.argument("instance-id", instanceId)
	}

}


fun AWSOpsWorksFunctions.attachElasticLoadBalancer(elasticLoadBalancerName: String, layerId: String, init: (AWSOpsWorksAttachElasticLoadBalancerCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerResult {
	return this.block.declare(AWSOpsWorksAttachElasticLoadBalancerCommand(elasticLoadBalancerName, layerId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerResult
}

@Generated
class AWSOpsWorksAttachElasticLoadBalancerCommand(val elasticLoadBalancerName: String, val layerId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest, com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerResult> {



	override fun build(): com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest {
		val input = com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest()
		input.setElasticLoadBalancerName(this.elasticLoadBalancerName)
		input.setLayerId(this.layerId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerResult {
	  return com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerResult {
		return environment.opsworks.attachElasticLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks attach-elastic-load-balancer")
				.argument("elastic-load-balancer-name", elasticLoadBalancerName)
				.argument("layer-id", layerId)
	}

}


fun AWSOpsWorksFunctions.cloneStack(sourceStackId: String, serviceRoleArn: String, init: (AWSOpsWorksCloneStackCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.CloneStackResult {
	return this.block.declare(AWSOpsWorksCloneStackCommand(sourceStackId, serviceRoleArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.CloneStackResult
}

@Generated
class AWSOpsWorksCloneStackCommand(val sourceStackId: String, val serviceRoleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.CloneStackRequest, com.amazonaws.services.opsworks.model.CloneStackResult> {

	var name: String? = null
	var region: String? = null
	var vpcId: String? = null
	var attributes: Map<StackAttributesKeys, String>? = null
	var defaultInstanceProfileArn: String? = null
	var defaultOs: String? = null
	var hostnameTheme: String? = null
	var defaultAvailabilityZone: String? = null
	var defaultSubnetId: String? = null
	var customJson: String? = null
	var configurationManager: com.amazonaws.services.opsworks.model.StackConfigurationManager? = null
	var chefConfiguration: com.amazonaws.services.opsworks.model.ChefConfiguration? = null
	var useCustomCookbooks: Boolean? = false
	var useOpsworksSecurityGroups: Boolean? = false
	var customCookbooksSource: com.amazonaws.services.opsworks.model.Source? = null
	var defaultSshKeyName: String? = null
	var clonePermissions: Boolean? = false
	var cloneAppIds: List<String>? = null
	var defaultRootDeviceType: RootDeviceType? = null
	var agentVersion: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.CloneStackRequest {
		val input = com.amazonaws.services.opsworks.model.CloneStackRequest()
		input.setSourceStackId(this.sourceStackId)
		input.setName(this.name)
		input.setRegion(this.region)
		input.setVpcId(this.vpcId)
		input.setAttributes(this.attributes?.mapKeys { it.toString() })
		input.setServiceRoleArn(this.serviceRoleArn)
		input.setDefaultInstanceProfileArn(this.defaultInstanceProfileArn)
		input.setDefaultOs(this.defaultOs)
		input.setHostnameTheme(this.hostnameTheme)
		input.setDefaultAvailabilityZone(this.defaultAvailabilityZone)
		input.setDefaultSubnetId(this.defaultSubnetId)
		input.setCustomJson(this.customJson)
		input.setConfigurationManager(this.configurationManager)
		input.setChefConfiguration(this.chefConfiguration)
		input.setUseCustomCookbooks(this.useCustomCookbooks)
		input.setUseOpsworksSecurityGroups(this.useOpsworksSecurityGroups)
		input.setCustomCookbooksSource(this.customCookbooksSource)
		input.setDefaultSshKeyName(this.defaultSshKeyName)
		input.setClonePermissions(this.clonePermissions)
		input.setCloneAppIds(this.cloneAppIds)
		input.setDefaultRootDeviceType(this.defaultRootDeviceType?.toString())
		input.setAgentVersion(this.agentVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.CloneStackResult {
	  return com.amazonaws.services.opsworks.model.CloneStackResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.CloneStackResult {
		return environment.opsworks.cloneStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks clone-stack")
				.argument("source-stack-id", sourceStackId)
				.argument("name", name)
				.argument("region", region)
				.argument("vpc-id", vpcId)
				.argument("attributes", attributes?.toString())
				.argument("service-role-arn", serviceRoleArn)
				.argument("default-instance-profile-arn", defaultInstanceProfileArn)
				.argument("default-os", defaultOs)
				.argument("hostname-theme", hostnameTheme)
				.argument("default-availability-zone", defaultAvailabilityZone)
				.argument("default-subnet-id", defaultSubnetId)
				.argument("custom-json", customJson)
				.argument("configuration-manager", configurationManager?.toString())
				.argument("chef-configuration", chefConfiguration?.toString())
				.option("use-custom-cookbooks", useCustomCookbooks ?: false)
				.option("use-opsworks-security-groups", useOpsworksSecurityGroups ?: false)
				.argument("custom-cookbooks-source", customCookbooksSource?.toString())
				.argument("default-ssh-key-name", defaultSshKeyName)
				.option("clone-permissions", clonePermissions ?: false)
				.argument("clone-app-ids", cloneAppIds?.toString())
				.argument("default-root-device-type", defaultRootDeviceType?.toString())
				.argument("agent-version", agentVersion)
	}

}


fun AWSOpsWorksFunctions.createApp(stackId: String, name: String, type: AppType, init: (AWSOpsWorksCreateAppCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.CreateAppResult {
	return this.block.declare(AWSOpsWorksCreateAppCommand(stackId, name, type).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.CreateAppResult
}

@Generated
class AWSOpsWorksCreateAppCommand(val stackId: String, val name: String, val type: AppType) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.CreateAppRequest, com.amazonaws.services.opsworks.model.CreateAppResult> {

	var shortname: String? = null
	var description: String? = null
	var dataSources: List<com.amazonaws.services.opsworks.model.DataSource>? = null
	var appSource: com.amazonaws.services.opsworks.model.Source? = null
	var domains: List<String>? = null
	var enableSsl: Boolean? = false
	var sslConfiguration: com.amazonaws.services.opsworks.model.SslConfiguration? = null
	var attributes: Map<AppAttributesKeys, String>? = null
	var environment: List<com.amazonaws.services.opsworks.model.EnvironmentVariable>? = null

	override fun build(): com.amazonaws.services.opsworks.model.CreateAppRequest {
		val input = com.amazonaws.services.opsworks.model.CreateAppRequest()
		input.setStackId(this.stackId)
		input.setShortname(this.shortname)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setDataSources(this.dataSources)
		input.setType(this.type.toString())
		input.setAppSource(this.appSource)
		input.setDomains(this.domains)
		input.setEnableSsl(this.enableSsl)
		input.setSslConfiguration(this.sslConfiguration)
		input.setAttributes(this.attributes?.mapKeys { it.toString() })
		input.setEnvironment(this.environment)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.CreateAppResult {
	  return com.amazonaws.services.opsworks.model.CreateAppResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.CreateAppResult {
		return environment.opsworks.createApp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks create-app")
				.argument("stack-id", stackId)
				.argument("shortname", shortname)
				.argument("name", name)
				.argument("description", description)
				.argument("data-sources", dataSources?.toString())
				.argument("type", type.toString())
				.argument("app-source", appSource?.toString())
				.argument("domains", domains?.toString())
				.option("enable-ssl", enableSsl ?: false)
				.argument("ssl-configuration", sslConfiguration?.toString())
				.argument("attributes", attributes?.toString())
				.argument("environment", environment?.toString())
	}

}


fun AWSOpsWorksFunctions.createDeployment(stackId: String, command: com.amazonaws.services.opsworks.model.DeploymentCommand, init: (AWSOpsWorksCreateDeploymentCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.CreateDeploymentResult {
	return this.block.declare(AWSOpsWorksCreateDeploymentCommand(stackId, command).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.CreateDeploymentResult
}

@Generated
class AWSOpsWorksCreateDeploymentCommand(val stackId: String, val command: com.amazonaws.services.opsworks.model.DeploymentCommand) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.CreateDeploymentRequest, com.amazonaws.services.opsworks.model.CreateDeploymentResult> {

	var appId: String? = null
	var instanceIds: List<String>? = null
	var layerIds: List<String>? = null
	var comment: String? = null
	var customJson: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.CreateDeploymentRequest {
		val input = com.amazonaws.services.opsworks.model.CreateDeploymentRequest()
		input.setStackId(this.stackId)
		input.setAppId(this.appId)
		input.setInstanceIds(this.instanceIds)
		input.setLayerIds(this.layerIds)
		input.setCommand(this.command)
		input.setComment(this.comment)
		input.setCustomJson(this.customJson)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.CreateDeploymentResult {
	  return com.amazonaws.services.opsworks.model.CreateDeploymentResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.CreateDeploymentResult {
		return environment.opsworks.createDeployment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks create-deployment")
				.argument("stack-id", stackId)
				.argument("app-id", appId)
				.argument("instance-ids", instanceIds?.toString())
				.argument("layer-ids", layerIds?.toString())
				.argument("command", command.toString())
				.argument("comment", comment)
				.argument("custom-json", customJson)
	}

}


fun AWSOpsWorksFunctions.createInstance(stackId: String, layerIds: List<String>, instanceType: String, init: (AWSOpsWorksCreateInstanceCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.CreateInstanceResult {
	return this.block.declare(AWSOpsWorksCreateInstanceCommand(stackId, layerIds, instanceType).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.CreateInstanceResult
}

@Generated
class AWSOpsWorksCreateInstanceCommand(val stackId: String, val layerIds: List<String>, val instanceType: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.CreateInstanceRequest, com.amazonaws.services.opsworks.model.CreateInstanceResult> {

	var autoScalingType: AutoScalingType? = null
	var hostname: String? = null
	var os: String? = null
	var amiId: String? = null
	var sshKeyName: String? = null
	var availabilityZone: String? = null
	var virtualizationType: String? = null
	var subnetId: String? = null
	var architecture: Architecture? = null
	var rootDeviceType: RootDeviceType? = null
	var blockDeviceMappings: List<com.amazonaws.services.opsworks.model.BlockDeviceMapping>? = null
	var installUpdatesOnBoot: Boolean? = false
	var ebsOptimized: Boolean? = false
	var agentVersion: String? = null
	var tenancy: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.CreateInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.CreateInstanceRequest()
		input.setStackId(this.stackId)
		input.setLayerIds(this.layerIds)
		input.setInstanceType(this.instanceType)
		input.setAutoScalingType(this.autoScalingType?.toString())
		input.setHostname(this.hostname)
		input.setOs(this.os)
		input.setAmiId(this.amiId)
		input.setSshKeyName(this.sshKeyName)
		input.setAvailabilityZone(this.availabilityZone)
		input.setVirtualizationType(this.virtualizationType)
		input.setSubnetId(this.subnetId)
		input.setArchitecture(this.architecture?.toString())
		input.setRootDeviceType(this.rootDeviceType?.toString())
		input.setBlockDeviceMappings(this.blockDeviceMappings)
		input.setInstallUpdatesOnBoot(this.installUpdatesOnBoot)
		input.setEbsOptimized(this.ebsOptimized)
		input.setAgentVersion(this.agentVersion)
		input.setTenancy(this.tenancy)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.CreateInstanceResult {
	  return com.amazonaws.services.opsworks.model.CreateInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.CreateInstanceResult {
		return environment.opsworks.createInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks create-instance")
				.argument("stack-id", stackId)
				.argument("layer-ids", layerIds.toString())
				.argument("instance-type", instanceType)
				.argument("auto-scaling-type", autoScalingType?.toString())
				.argument("hostname", hostname)
				.argument("os", os)
				.argument("ami-id", amiId)
				.argument("ssh-key-name", sshKeyName)
				.argument("availability-zone", availabilityZone)
				.argument("virtualization-type", virtualizationType)
				.argument("subnet-id", subnetId)
				.argument("architecture", architecture?.toString())
				.argument("root-device-type", rootDeviceType?.toString())
				.argument("block-device-mappings", blockDeviceMappings?.toString())
				.option("install-updates-on-boot", installUpdatesOnBoot ?: false)
				.option("ebs-optimized", ebsOptimized ?: false)
				.argument("agent-version", agentVersion)
				.argument("tenancy", tenancy)
	}

}


fun AWSOpsWorksFunctions.createLayer(stackId: String, type: LayerType, name: String, shortname: String, init: (AWSOpsWorksCreateLayerCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.CreateLayerResult {
	return this.block.declare(AWSOpsWorksCreateLayerCommand(stackId, type, name, shortname).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.CreateLayerResult
}

@Generated
class AWSOpsWorksCreateLayerCommand(val stackId: String, val type: LayerType, val name: String, val shortname: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.CreateLayerRequest, com.amazonaws.services.opsworks.model.CreateLayerResult> {

	var attributes: Map<LayerAttributesKeys, String>? = null
	var cloudWatchLogsConfiguration: com.amazonaws.services.opsworks.model.CloudWatchLogsConfiguration? = null
	var customInstanceProfileArn: String? = null
	var customJson: String? = null
	var customSecurityGroupIds: List<String>? = null
	var packages: List<String>? = null
	var volumeConfigurations: List<com.amazonaws.services.opsworks.model.VolumeConfiguration>? = null
	var enableAutoHealing: Boolean? = false
	var autoAssignElasticIps: Boolean? = false
	var autoAssignPublicIps: Boolean? = false
	var customRecipes: com.amazonaws.services.opsworks.model.Recipes? = null
	var installUpdatesOnBoot: Boolean? = false
	var useEbsOptimizedInstances: Boolean? = false
	var lifecycleEventConfiguration: com.amazonaws.services.opsworks.model.LifecycleEventConfiguration? = null

	override fun build(): com.amazonaws.services.opsworks.model.CreateLayerRequest {
		val input = com.amazonaws.services.opsworks.model.CreateLayerRequest()
		input.setStackId(this.stackId)
		input.setType(this.type.toString())
		input.setName(this.name)
		input.setShortname(this.shortname)
		input.setAttributes(this.attributes?.mapKeys { it.toString() })
		input.setCloudWatchLogsConfiguration(this.cloudWatchLogsConfiguration)
		input.setCustomInstanceProfileArn(this.customInstanceProfileArn)
		input.setCustomJson(this.customJson)
		input.setCustomSecurityGroupIds(this.customSecurityGroupIds)
		input.setPackages(this.packages)
		input.setVolumeConfigurations(this.volumeConfigurations)
		input.setEnableAutoHealing(this.enableAutoHealing)
		input.setAutoAssignElasticIps(this.autoAssignElasticIps)
		input.setAutoAssignPublicIps(this.autoAssignPublicIps)
		input.setCustomRecipes(this.customRecipes)
		input.setInstallUpdatesOnBoot(this.installUpdatesOnBoot)
		input.setUseEbsOptimizedInstances(this.useEbsOptimizedInstances)
		input.setLifecycleEventConfiguration(this.lifecycleEventConfiguration)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.CreateLayerResult {
	  return com.amazonaws.services.opsworks.model.CreateLayerResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.CreateLayerResult {
		return environment.opsworks.createLayer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks create-layer")
				.argument("stack-id", stackId)
				.argument("type", type.toString())
				.argument("name", name)
				.argument("shortname", shortname)
				.argument("attributes", attributes?.toString())
				.argument("cloud-watch-logs-configuration", cloudWatchLogsConfiguration?.toString())
				.argument("custom-instance-profile-arn", customInstanceProfileArn)
				.argument("custom-json", customJson)
				.argument("custom-security-group-ids", customSecurityGroupIds?.toString())
				.argument("packages", packages?.toString())
				.argument("volume-configurations", volumeConfigurations?.toString())
				.option("enable-auto-healing", enableAutoHealing ?: false)
				.option("auto-assign-elastic-ips", autoAssignElasticIps ?: false)
				.option("auto-assign-public-ips", autoAssignPublicIps ?: false)
				.argument("custom-recipes", customRecipes?.toString())
				.option("install-updates-on-boot", installUpdatesOnBoot ?: false)
				.option("use-ebs-optimized-instances", useEbsOptimizedInstances ?: false)
				.argument("lifecycle-event-configuration", lifecycleEventConfiguration?.toString())
	}

}


fun AWSOpsWorksFunctions.createStack(name: String, region: String, serviceRoleArn: String, defaultInstanceProfileArn: String, init: (AWSOpsWorksCreateStackCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.CreateStackResult {
	return this.block.declare(AWSOpsWorksCreateStackCommand(name, region, serviceRoleArn, defaultInstanceProfileArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.CreateStackResult
}

@Generated
class AWSOpsWorksCreateStackCommand(val name: String, val region: String, val serviceRoleArn: String, val defaultInstanceProfileArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.CreateStackRequest, com.amazonaws.services.opsworks.model.CreateStackResult> {

	var vpcId: String? = null
	var attributes: Map<StackAttributesKeys, String>? = null
	var defaultOs: String? = null
	var hostnameTheme: String? = null
	var defaultAvailabilityZone: String? = null
	var defaultSubnetId: String? = null
	var customJson: String? = null
	var configurationManager: com.amazonaws.services.opsworks.model.StackConfigurationManager? = null
	var chefConfiguration: com.amazonaws.services.opsworks.model.ChefConfiguration? = null
	var useCustomCookbooks: Boolean? = false
	var useOpsworksSecurityGroups: Boolean? = false
	var customCookbooksSource: com.amazonaws.services.opsworks.model.Source? = null
	var defaultSshKeyName: String? = null
	var defaultRootDeviceType: RootDeviceType? = null
	var agentVersion: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.CreateStackRequest {
		val input = com.amazonaws.services.opsworks.model.CreateStackRequest()
		input.setName(this.name)
		input.setRegion(this.region)
		input.setVpcId(this.vpcId)
		input.setAttributes(this.attributes?.mapKeys { it.toString() })
		input.setServiceRoleArn(this.serviceRoleArn)
		input.setDefaultInstanceProfileArn(this.defaultInstanceProfileArn)
		input.setDefaultOs(this.defaultOs)
		input.setHostnameTheme(this.hostnameTheme)
		input.setDefaultAvailabilityZone(this.defaultAvailabilityZone)
		input.setDefaultSubnetId(this.defaultSubnetId)
		input.setCustomJson(this.customJson)
		input.setConfigurationManager(this.configurationManager)
		input.setChefConfiguration(this.chefConfiguration)
		input.setUseCustomCookbooks(this.useCustomCookbooks)
		input.setUseOpsworksSecurityGroups(this.useOpsworksSecurityGroups)
		input.setCustomCookbooksSource(this.customCookbooksSource)
		input.setDefaultSshKeyName(this.defaultSshKeyName)
		input.setDefaultRootDeviceType(this.defaultRootDeviceType?.toString())
		input.setAgentVersion(this.agentVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.CreateStackResult {
	  return com.amazonaws.services.opsworks.model.CreateStackResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.CreateStackResult {
		return environment.opsworks.createStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks create-stack")
				.argument("name", name)
				.argument("region", region)
				.argument("vpc-id", vpcId)
				.argument("attributes", attributes?.toString())
				.argument("service-role-arn", serviceRoleArn)
				.argument("default-instance-profile-arn", defaultInstanceProfileArn)
				.argument("default-os", defaultOs)
				.argument("hostname-theme", hostnameTheme)
				.argument("default-availability-zone", defaultAvailabilityZone)
				.argument("default-subnet-id", defaultSubnetId)
				.argument("custom-json", customJson)
				.argument("configuration-manager", configurationManager?.toString())
				.argument("chef-configuration", chefConfiguration?.toString())
				.option("use-custom-cookbooks", useCustomCookbooks ?: false)
				.option("use-opsworks-security-groups", useOpsworksSecurityGroups ?: false)
				.argument("custom-cookbooks-source", customCookbooksSource?.toString())
				.argument("default-ssh-key-name", defaultSshKeyName)
				.argument("default-root-device-type", defaultRootDeviceType?.toString())
				.argument("agent-version", agentVersion)
	}

}


fun AWSOpsWorksFunctions.createUserProfile(iamUserArn: String, init: (AWSOpsWorksCreateUserProfileCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.CreateUserProfileResult {
	return this.block.declare(AWSOpsWorksCreateUserProfileCommand(iamUserArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.CreateUserProfileResult
}

@Generated
class AWSOpsWorksCreateUserProfileCommand(val iamUserArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.CreateUserProfileRequest, com.amazonaws.services.opsworks.model.CreateUserProfileResult> {

	var sshUsername: String? = null
	var sshPublicKey: String? = null
	var allowSelfManagement: Boolean? = false

	override fun build(): com.amazonaws.services.opsworks.model.CreateUserProfileRequest {
		val input = com.amazonaws.services.opsworks.model.CreateUserProfileRequest()
		input.setIamUserArn(this.iamUserArn)
		input.setSshUsername(this.sshUsername)
		input.setSshPublicKey(this.sshPublicKey)
		input.setAllowSelfManagement(this.allowSelfManagement)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.CreateUserProfileResult {
	  return com.amazonaws.services.opsworks.model.CreateUserProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.CreateUserProfileResult {
		return environment.opsworks.createUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks create-user-profile")
				.argument("iam-user-arn", iamUserArn)
				.argument("ssh-username", sshUsername)
				.argument("ssh-public-key", sshPublicKey)
				.option("allow-self-management", allowSelfManagement ?: false)
	}

}


fun AWSOpsWorksFunctions.deleteApp(appId: String, init: (AWSOpsWorksDeleteAppCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DeleteAppResult {
	return this.block.declare(AWSOpsWorksDeleteAppCommand(appId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DeleteAppResult
}

@Generated
class AWSOpsWorksDeleteAppCommand(val appId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeleteAppRequest, com.amazonaws.services.opsworks.model.DeleteAppResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DeleteAppRequest {
		val input = com.amazonaws.services.opsworks.model.DeleteAppRequest()
		input.setAppId(this.appId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DeleteAppResult {
	  return com.amazonaws.services.opsworks.model.DeleteAppResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DeleteAppResult {
		return environment.opsworks.deleteApp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks delete-app")
				.argument("app-id", appId)
	}

}


fun AWSOpsWorksFunctions.deleteInstance(instanceId: String, init: (AWSOpsWorksDeleteInstanceCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DeleteInstanceResult {
	return this.block.declare(AWSOpsWorksDeleteInstanceCommand(instanceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DeleteInstanceResult
}

@Generated
class AWSOpsWorksDeleteInstanceCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeleteInstanceRequest, com.amazonaws.services.opsworks.model.DeleteInstanceResult> {

	var deleteElasticIp: Boolean? = false
	var deleteVolumes: Boolean? = false

	override fun build(): com.amazonaws.services.opsworks.model.DeleteInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.DeleteInstanceRequest()
		input.setInstanceId(this.instanceId)
		input.setDeleteElasticIp(this.deleteElasticIp)
		input.setDeleteVolumes(this.deleteVolumes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DeleteInstanceResult {
	  return com.amazonaws.services.opsworks.model.DeleteInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DeleteInstanceResult {
		return environment.opsworks.deleteInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks delete-instance")
				.argument("instance-id", instanceId)
				.option("delete-elastic-ip", deleteElasticIp ?: false)
				.option("delete-volumes", deleteVolumes ?: false)
	}

}


fun AWSOpsWorksFunctions.deleteLayer(layerId: String, init: (AWSOpsWorksDeleteLayerCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DeleteLayerResult {
	return this.block.declare(AWSOpsWorksDeleteLayerCommand(layerId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DeleteLayerResult
}

@Generated
class AWSOpsWorksDeleteLayerCommand(val layerId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeleteLayerRequest, com.amazonaws.services.opsworks.model.DeleteLayerResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DeleteLayerRequest {
		val input = com.amazonaws.services.opsworks.model.DeleteLayerRequest()
		input.setLayerId(this.layerId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DeleteLayerResult {
	  return com.amazonaws.services.opsworks.model.DeleteLayerResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DeleteLayerResult {
		return environment.opsworks.deleteLayer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks delete-layer")
				.argument("layer-id", layerId)
	}

}


fun AWSOpsWorksFunctions.deleteStack(stackId: String, init: (AWSOpsWorksDeleteStackCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DeleteStackResult {
	return this.block.declare(AWSOpsWorksDeleteStackCommand(stackId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DeleteStackResult
}

@Generated
class AWSOpsWorksDeleteStackCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeleteStackRequest, com.amazonaws.services.opsworks.model.DeleteStackResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DeleteStackRequest {
		val input = com.amazonaws.services.opsworks.model.DeleteStackRequest()
		input.setStackId(this.stackId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DeleteStackResult {
	  return com.amazonaws.services.opsworks.model.DeleteStackResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DeleteStackResult {
		return environment.opsworks.deleteStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks delete-stack")
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.deleteUserProfile(iamUserArn: String, init: (AWSOpsWorksDeleteUserProfileCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DeleteUserProfileResult {
	return this.block.declare(AWSOpsWorksDeleteUserProfileCommand(iamUserArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DeleteUserProfileResult
}

@Generated
class AWSOpsWorksDeleteUserProfileCommand(val iamUserArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeleteUserProfileRequest, com.amazonaws.services.opsworks.model.DeleteUserProfileResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DeleteUserProfileRequest {
		val input = com.amazonaws.services.opsworks.model.DeleteUserProfileRequest()
		input.setIamUserArn(this.iamUserArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DeleteUserProfileResult {
	  return com.amazonaws.services.opsworks.model.DeleteUserProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DeleteUserProfileResult {
		return environment.opsworks.deleteUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks delete-user-profile")
				.argument("iam-user-arn", iamUserArn)
	}

}


fun AWSOpsWorksFunctions.deregisterEcsCluster(ecsClusterArn: String, init: (AWSOpsWorksDeregisterEcsClusterCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DeregisterEcsClusterResult {
	return this.block.declare(AWSOpsWorksDeregisterEcsClusterCommand(ecsClusterArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DeregisterEcsClusterResult
}

@Generated
class AWSOpsWorksDeregisterEcsClusterCommand(val ecsClusterArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest, com.amazonaws.services.opsworks.model.DeregisterEcsClusterResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest {
		val input = com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest()
		input.setEcsClusterArn(this.ecsClusterArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DeregisterEcsClusterResult {
	  return com.amazonaws.services.opsworks.model.DeregisterEcsClusterResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DeregisterEcsClusterResult {
		return environment.opsworks.deregisterEcsCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks deregister-ecs-cluster")
				.argument("ecs-cluster-arn", ecsClusterArn)
	}

}


fun AWSOpsWorksFunctions.deregisterElasticIp(elasticIp: String, init: (AWSOpsWorksDeregisterElasticIpCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DeregisterElasticIpResult {
	return this.block.declare(AWSOpsWorksDeregisterElasticIpCommand(elasticIp).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DeregisterElasticIpResult
}

@Generated
class AWSOpsWorksDeregisterElasticIpCommand(val elasticIp: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest, com.amazonaws.services.opsworks.model.DeregisterElasticIpResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest {
		val input = com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest()
		input.setElasticIp(this.elasticIp)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DeregisterElasticIpResult {
	  return com.amazonaws.services.opsworks.model.DeregisterElasticIpResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DeregisterElasticIpResult {
		return environment.opsworks.deregisterElasticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks deregister-elastic-ip")
				.argument("elastic-ip", elasticIp)
	}

}


fun AWSOpsWorksFunctions.deregisterInstance(instanceId: String, init: (AWSOpsWorksDeregisterInstanceCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DeregisterInstanceResult {
	return this.block.declare(AWSOpsWorksDeregisterInstanceCommand(instanceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DeregisterInstanceResult
}

@Generated
class AWSOpsWorksDeregisterInstanceCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeregisterInstanceRequest, com.amazonaws.services.opsworks.model.DeregisterInstanceResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DeregisterInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.DeregisterInstanceRequest()
		input.setInstanceId(this.instanceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DeregisterInstanceResult {
	  return com.amazonaws.services.opsworks.model.DeregisterInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DeregisterInstanceResult {
		return environment.opsworks.deregisterInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks deregister-instance")
				.argument("instance-id", instanceId)
	}

}


fun AWSOpsWorksFunctions.deregisterRdsDbInstance(rdsDbInstanceArn: String, init: (AWSOpsWorksDeregisterRdsDbInstanceCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceResult {
	return this.block.declare(AWSOpsWorksDeregisterRdsDbInstanceCommand(rdsDbInstanceArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceResult
}

@Generated
class AWSOpsWorksDeregisterRdsDbInstanceCommand(val rdsDbInstanceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest, com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest()
		input.setRdsDbInstanceArn(this.rdsDbInstanceArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceResult {
	  return com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceResult {
		return environment.opsworks.deregisterRdsDbInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks deregister-rds-db-instance")
				.argument("rds-db-instance-arn", rdsDbInstanceArn)
	}

}


fun AWSOpsWorksFunctions.deregisterVolume(volumeId: String, init: (AWSOpsWorksDeregisterVolumeCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DeregisterVolumeResult {
	return this.block.declare(AWSOpsWorksDeregisterVolumeCommand(volumeId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DeregisterVolumeResult
}

@Generated
class AWSOpsWorksDeregisterVolumeCommand(val volumeId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeregisterVolumeRequest, com.amazonaws.services.opsworks.model.DeregisterVolumeResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DeregisterVolumeRequest {
		val input = com.amazonaws.services.opsworks.model.DeregisterVolumeRequest()
		input.setVolumeId(this.volumeId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DeregisterVolumeResult {
	  return com.amazonaws.services.opsworks.model.DeregisterVolumeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DeregisterVolumeResult {
		return environment.opsworks.deregisterVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks deregister-volume")
				.argument("volume-id", volumeId)
	}

}


fun AWSOpsWorksFunctions.describeAgentVersions(init: (AWSOpsWorksDescribeAgentVersionsCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeAgentVersionsResult {
	return this.block.declare(AWSOpsWorksDescribeAgentVersionsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeAgentVersionsResult
}

@Generated
class AWSOpsWorksDescribeAgentVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest, com.amazonaws.services.opsworks.model.DescribeAgentVersionsResult> {

	var stackId: String? = null
	var configurationManager: com.amazonaws.services.opsworks.model.StackConfigurationManager? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest()
		input.setStackId(this.stackId)
		input.setConfigurationManager(this.configurationManager)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeAgentVersionsResult {
	  return com.amazonaws.services.opsworks.model.DescribeAgentVersionsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeAgentVersionsResult {
		return environment.opsworks.describeAgentVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-agent-versions")
				.argument("stack-id", stackId)
				.argument("configuration-manager", configurationManager?.toString())
	}

}


fun AWSOpsWorksFunctions.describeApps(init: (AWSOpsWorksDescribeAppsCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeAppsResult {
	return this.block.declare(AWSOpsWorksDescribeAppsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeAppsResult
}

@Generated
class AWSOpsWorksDescribeAppsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeAppsRequest, com.amazonaws.services.opsworks.model.DescribeAppsResult> {

	var stackId: String? = null
	var appIds: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeAppsRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeAppsRequest()
		input.setStackId(this.stackId)
		input.setAppIds(this.appIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeAppsResult {
	  return com.amazonaws.services.opsworks.model.DescribeAppsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeAppsResult {
		return environment.opsworks.describeApps(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-apps")
				.argument("stack-id", stackId)
				.argument("app-ids", appIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeCommands(init: (AWSOpsWorksDescribeCommandsCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeCommandsResult {
	return this.block.declare(AWSOpsWorksDescribeCommandsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeCommandsResult
}

@Generated
class AWSOpsWorksDescribeCommandsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeCommandsRequest, com.amazonaws.services.opsworks.model.DescribeCommandsResult> {

	var deploymentId: String? = null
	var instanceId: String? = null
	var commandIds: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeCommandsRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeCommandsRequest()
		input.setDeploymentId(this.deploymentId)
		input.setInstanceId(this.instanceId)
		input.setCommandIds(this.commandIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeCommandsResult {
	  return com.amazonaws.services.opsworks.model.DescribeCommandsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeCommandsResult {
		return environment.opsworks.describeCommands(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-commands")
				.argument("deployment-id", deploymentId)
				.argument("instance-id", instanceId)
				.argument("command-ids", commandIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeDeployments(init: (AWSOpsWorksDescribeDeploymentsCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeDeploymentsResult {
	return this.block.declare(AWSOpsWorksDescribeDeploymentsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeDeploymentsResult
}

@Generated
class AWSOpsWorksDescribeDeploymentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest, com.amazonaws.services.opsworks.model.DescribeDeploymentsResult> {

	var stackId: String? = null
	var appId: String? = null
	var deploymentIds: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest()
		input.setStackId(this.stackId)
		input.setAppId(this.appId)
		input.setDeploymentIds(this.deploymentIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeDeploymentsResult {
	  return com.amazonaws.services.opsworks.model.DescribeDeploymentsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeDeploymentsResult {
		return environment.opsworks.describeDeployments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-deployments")
				.argument("stack-id", stackId)
				.argument("app-id", appId)
				.argument("deployment-ids", deploymentIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeEcsClusters(init: (AWSOpsWorksDescribeEcsClustersCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeEcsClustersResult {
	return this.block.declare(AWSOpsWorksDescribeEcsClustersCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeEcsClustersResult
}

@Generated
class AWSOpsWorksDescribeEcsClustersCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeEcsClustersRequest, com.amazonaws.services.opsworks.model.DescribeEcsClustersResult> {

	var ecsClusterArns: List<String>? = null
	var stackId: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.opsworks.model.DescribeEcsClustersRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeEcsClustersRequest()
		input.setEcsClusterArns(this.ecsClusterArns)
		input.setStackId(this.stackId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeEcsClustersResult {
	  return com.amazonaws.services.opsworks.model.DescribeEcsClustersResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeEcsClustersResult {
		return environment.opsworks.describeEcsClusters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-ecs-clusters")
				.argument("ecs-cluster-arns", ecsClusterArns?.toString())
				.argument("stack-id", stackId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOpsWorksFunctions.describeElasticIps(init: (AWSOpsWorksDescribeElasticIpsCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeElasticIpsResult {
	return this.block.declare(AWSOpsWorksDescribeElasticIpsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeElasticIpsResult
}

@Generated
class AWSOpsWorksDescribeElasticIpsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeElasticIpsRequest, com.amazonaws.services.opsworks.model.DescribeElasticIpsResult> {

	var instanceId: String? = null
	var stackId: String? = null
	var ips: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeElasticIpsRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeElasticIpsRequest()
		input.setInstanceId(this.instanceId)
		input.setStackId(this.stackId)
		input.setIps(this.ips)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeElasticIpsResult {
	  return com.amazonaws.services.opsworks.model.DescribeElasticIpsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeElasticIpsResult {
		return environment.opsworks.describeElasticIps(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-elastic-ips")
				.argument("instance-id", instanceId)
				.argument("stack-id", stackId)
				.argument("ips", ips?.toString())
	}

}


fun AWSOpsWorksFunctions.describeElasticLoadBalancers(init: (AWSOpsWorksDescribeElasticLoadBalancersCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersResult {
	return this.block.declare(AWSOpsWorksDescribeElasticLoadBalancersCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersResult
}

@Generated
class AWSOpsWorksDescribeElasticLoadBalancersCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest, com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersResult> {

	var stackId: String? = null
	var layerIds: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest()
		input.setStackId(this.stackId)
		input.setLayerIds(this.layerIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersResult {
	  return com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersResult {
		return environment.opsworks.describeElasticLoadBalancers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-elastic-load-balancers")
				.argument("stack-id", stackId)
				.argument("layer-ids", layerIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeInstances(init: (AWSOpsWorksDescribeInstancesCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeInstancesResult {
	return this.block.declare(AWSOpsWorksDescribeInstancesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeInstancesResult
}

@Generated
class AWSOpsWorksDescribeInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeInstancesRequest, com.amazonaws.services.opsworks.model.DescribeInstancesResult> {

	var stackId: String? = null
	var layerId: String? = null
	var instanceIds: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeInstancesRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeInstancesRequest()
		input.setStackId(this.stackId)
		input.setLayerId(this.layerId)
		input.setInstanceIds(this.instanceIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeInstancesResult {
	  return com.amazonaws.services.opsworks.model.DescribeInstancesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeInstancesResult {
		return environment.opsworks.describeInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-instances")
				.argument("stack-id", stackId)
				.argument("layer-id", layerId)
				.argument("instance-ids", instanceIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeLayers(init: (AWSOpsWorksDescribeLayersCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeLayersResult {
	return this.block.declare(AWSOpsWorksDescribeLayersCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeLayersResult
}

@Generated
class AWSOpsWorksDescribeLayersCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeLayersRequest, com.amazonaws.services.opsworks.model.DescribeLayersResult> {

	var stackId: String? = null
	var layerIds: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeLayersRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeLayersRequest()
		input.setStackId(this.stackId)
		input.setLayerIds(this.layerIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeLayersResult {
	  return com.amazonaws.services.opsworks.model.DescribeLayersResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeLayersResult {
		return environment.opsworks.describeLayers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-layers")
				.argument("stack-id", stackId)
				.argument("layer-ids", layerIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeLoadBasedAutoScaling(layerIds: List<String>, init: (AWSOpsWorksDescribeLoadBasedAutoScalingCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingResult {
	return this.block.declare(AWSOpsWorksDescribeLoadBasedAutoScalingCommand(layerIds).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingResult
}

@Generated
class AWSOpsWorksDescribeLoadBasedAutoScalingCommand(val layerIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest, com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest()
		input.setLayerIds(this.layerIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingResult {
	  return com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingResult {
		return environment.opsworks.describeLoadBasedAutoScaling(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-load-based-auto-scaling")
				.argument("layer-ids", layerIds.toString())
	}

}


fun AWSOpsWorksFunctions.describeMyUserProfile(init: (AWSOpsWorksDescribeMyUserProfileCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeMyUserProfileResult {
	return this.block.declare(AWSOpsWorksDescribeMyUserProfileCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeMyUserProfileResult
}

@Generated
class AWSOpsWorksDescribeMyUserProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest, com.amazonaws.services.opsworks.model.DescribeMyUserProfileResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeMyUserProfileResult {
	  return com.amazonaws.services.opsworks.model.DescribeMyUserProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeMyUserProfileResult {
		return environment.opsworks.describeMyUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-my-user-profile")

	}

}


fun AWSOpsWorksFunctions.describeOperatingSystems(init: (AWSOpsWorksDescribeOperatingSystemsCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeOperatingSystemsResult {
	return this.block.declare(AWSOpsWorksDescribeOperatingSystemsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeOperatingSystemsResult
}

@Generated
class AWSOpsWorksDescribeOperatingSystemsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest, com.amazonaws.services.opsworks.model.DescribeOperatingSystemsResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeOperatingSystemsResult {
	  return com.amazonaws.services.opsworks.model.DescribeOperatingSystemsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeOperatingSystemsResult {
		return environment.opsworks.describeOperatingSystems(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-operating-systems")

	}

}


fun AWSOpsWorksFunctions.describePermissions(init: (AWSOpsWorksDescribePermissionsCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribePermissionsResult {
	return this.block.declare(AWSOpsWorksDescribePermissionsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribePermissionsResult
}

@Generated
class AWSOpsWorksDescribePermissionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribePermissionsRequest, com.amazonaws.services.opsworks.model.DescribePermissionsResult> {

	var iamUserArn: String? = null
	var stackId: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribePermissionsRequest {
		val input = com.amazonaws.services.opsworks.model.DescribePermissionsRequest()
		input.setIamUserArn(this.iamUserArn)
		input.setStackId(this.stackId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribePermissionsResult {
	  return com.amazonaws.services.opsworks.model.DescribePermissionsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribePermissionsResult {
		return environment.opsworks.describePermissions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-permissions")
				.argument("iam-user-arn", iamUserArn)
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.describeRaidArrays(init: (AWSOpsWorksDescribeRaidArraysCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeRaidArraysResult {
	return this.block.declare(AWSOpsWorksDescribeRaidArraysCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeRaidArraysResult
}

@Generated
class AWSOpsWorksDescribeRaidArraysCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeRaidArraysRequest, com.amazonaws.services.opsworks.model.DescribeRaidArraysResult> {

	var instanceId: String? = null
	var stackId: String? = null
	var raidArrayIds: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeRaidArraysRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeRaidArraysRequest()
		input.setInstanceId(this.instanceId)
		input.setStackId(this.stackId)
		input.setRaidArrayIds(this.raidArrayIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeRaidArraysResult {
	  return com.amazonaws.services.opsworks.model.DescribeRaidArraysResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeRaidArraysResult {
		return environment.opsworks.describeRaidArrays(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-raid-arrays")
				.argument("instance-id", instanceId)
				.argument("stack-id", stackId)
				.argument("raid-array-ids", raidArrayIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeRdsDbInstances(stackId: String, init: (AWSOpsWorksDescribeRdsDbInstancesCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesResult {
	return this.block.declare(AWSOpsWorksDescribeRdsDbInstancesCommand(stackId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesResult
}

@Generated
class AWSOpsWorksDescribeRdsDbInstancesCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest, com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesResult> {

	var rdsDbInstanceArns: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest()
		input.setStackId(this.stackId)
		input.setRdsDbInstanceArns(this.rdsDbInstanceArns)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesResult {
	  return com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesResult {
		return environment.opsworks.describeRdsDbInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-rds-db-instances")
				.argument("stack-id", stackId)
				.argument("rds-db-instance-arns", rdsDbInstanceArns?.toString())
	}

}


fun AWSOpsWorksFunctions.describeServiceErrors(init: (AWSOpsWorksDescribeServiceErrorsCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeServiceErrorsResult {
	return this.block.declare(AWSOpsWorksDescribeServiceErrorsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeServiceErrorsResult
}

@Generated
class AWSOpsWorksDescribeServiceErrorsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeServiceErrorsRequest, com.amazonaws.services.opsworks.model.DescribeServiceErrorsResult> {

	var stackId: String? = null
	var instanceId: String? = null
	var serviceErrorIds: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeServiceErrorsRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeServiceErrorsRequest()
		input.setStackId(this.stackId)
		input.setInstanceId(this.instanceId)
		input.setServiceErrorIds(this.serviceErrorIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeServiceErrorsResult {
	  return com.amazonaws.services.opsworks.model.DescribeServiceErrorsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeServiceErrorsResult {
		return environment.opsworks.describeServiceErrors(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-service-errors")
				.argument("stack-id", stackId)
				.argument("instance-id", instanceId)
				.argument("service-error-ids", serviceErrorIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeStackProvisioningParameters(stackId: String, init: (AWSOpsWorksDescribeStackProvisioningParametersCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersResult {
	return this.block.declare(AWSOpsWorksDescribeStackProvisioningParametersCommand(stackId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersResult
}

@Generated
class AWSOpsWorksDescribeStackProvisioningParametersCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest, com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest()
		input.setStackId(this.stackId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersResult {
	  return com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersResult {
		return environment.opsworks.describeStackProvisioningParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-stack-provisioning-parameters")
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.describeStackSummary(stackId: String, init: (AWSOpsWorksDescribeStackSummaryCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeStackSummaryResult {
	return this.block.declare(AWSOpsWorksDescribeStackSummaryCommand(stackId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeStackSummaryResult
}

@Generated
class AWSOpsWorksDescribeStackSummaryCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest, com.amazonaws.services.opsworks.model.DescribeStackSummaryResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest()
		input.setStackId(this.stackId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeStackSummaryResult {
	  return com.amazonaws.services.opsworks.model.DescribeStackSummaryResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeStackSummaryResult {
		return environment.opsworks.describeStackSummary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-stack-summary")
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.describeStacks(init: (AWSOpsWorksDescribeStacksCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeStacksResult {
	return this.block.declare(AWSOpsWorksDescribeStacksCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeStacksResult
}

@Generated
class AWSOpsWorksDescribeStacksCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeStacksRequest, com.amazonaws.services.opsworks.model.DescribeStacksResult> {

	var stackIds: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeStacksRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeStacksRequest()
		input.setStackIds(this.stackIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeStacksResult {
	  return com.amazonaws.services.opsworks.model.DescribeStacksResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeStacksResult {
		return environment.opsworks.describeStacks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-stacks")
				.argument("stack-ids", stackIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeTimeBasedAutoScaling(instanceIds: List<String>, init: (AWSOpsWorksDescribeTimeBasedAutoScalingCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingResult {
	return this.block.declare(AWSOpsWorksDescribeTimeBasedAutoScalingCommand(instanceIds).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingResult
}

@Generated
class AWSOpsWorksDescribeTimeBasedAutoScalingCommand(val instanceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest, com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest()
		input.setInstanceIds(this.instanceIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingResult {
	  return com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingResult {
		return environment.opsworks.describeTimeBasedAutoScaling(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-time-based-auto-scaling")
				.argument("instance-ids", instanceIds.toString())
	}

}


fun AWSOpsWorksFunctions.describeUserProfiles(init: (AWSOpsWorksDescribeUserProfilesCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeUserProfilesResult {
	return this.block.declare(AWSOpsWorksDescribeUserProfilesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeUserProfilesResult
}

@Generated
class AWSOpsWorksDescribeUserProfilesCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest, com.amazonaws.services.opsworks.model.DescribeUserProfilesResult> {

	var iamUserArns: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest()
		input.setIamUserArns(this.iamUserArns)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeUserProfilesResult {
	  return com.amazonaws.services.opsworks.model.DescribeUserProfilesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeUserProfilesResult {
		return environment.opsworks.describeUserProfiles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-user-profiles")
				.argument("iam-user-arns", iamUserArns?.toString())
	}

}


fun AWSOpsWorksFunctions.describeVolumes(init: (AWSOpsWorksDescribeVolumesCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DescribeVolumesResult {
	return this.block.declare(AWSOpsWorksDescribeVolumesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DescribeVolumesResult
}

@Generated
class AWSOpsWorksDescribeVolumesCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeVolumesRequest, com.amazonaws.services.opsworks.model.DescribeVolumesResult> {

	var instanceId: String? = null
	var stackId: String? = null
	var raidArrayId: String? = null
	var volumeIds: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeVolumesRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeVolumesRequest()
		input.setInstanceId(this.instanceId)
		input.setStackId(this.stackId)
		input.setRaidArrayId(this.raidArrayId)
		input.setVolumeIds(this.volumeIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DescribeVolumesResult {
	  return com.amazonaws.services.opsworks.model.DescribeVolumesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DescribeVolumesResult {
		return environment.opsworks.describeVolumes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-volumes")
				.argument("instance-id", instanceId)
				.argument("stack-id", stackId)
				.argument("raid-array-id", raidArrayId)
				.argument("volume-ids", volumeIds?.toString())
	}

}


fun AWSOpsWorksFunctions.detachElasticLoadBalancer(elasticLoadBalancerName: String, layerId: String, init: (AWSOpsWorksDetachElasticLoadBalancerCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerResult {
	return this.block.declare(AWSOpsWorksDetachElasticLoadBalancerCommand(elasticLoadBalancerName, layerId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerResult
}

@Generated
class AWSOpsWorksDetachElasticLoadBalancerCommand(val elasticLoadBalancerName: String, val layerId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest, com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest {
		val input = com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest()
		input.setElasticLoadBalancerName(this.elasticLoadBalancerName)
		input.setLayerId(this.layerId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerResult {
	  return com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerResult {
		return environment.opsworks.detachElasticLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks detach-elastic-load-balancer")
				.argument("elastic-load-balancer-name", elasticLoadBalancerName)
				.argument("layer-id", layerId)
	}

}


fun AWSOpsWorksFunctions.disassociateElasticIp(elasticIp: String, init: (AWSOpsWorksDisassociateElasticIpCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.DisassociateElasticIpResult {
	return this.block.declare(AWSOpsWorksDisassociateElasticIpCommand(elasticIp).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.DisassociateElasticIpResult
}

@Generated
class AWSOpsWorksDisassociateElasticIpCommand(val elasticIp: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest, com.amazonaws.services.opsworks.model.DisassociateElasticIpResult> {



	override fun build(): com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest {
		val input = com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest()
		input.setElasticIp(this.elasticIp)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.DisassociateElasticIpResult {
	  return com.amazonaws.services.opsworks.model.DisassociateElasticIpResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.DisassociateElasticIpResult {
		return environment.opsworks.disassociateElasticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks disassociate-elastic-ip")
				.argument("elastic-ip", elasticIp)
	}

}


fun AWSOpsWorksFunctions.getHostnameSuggestion(layerId: String, init: (AWSOpsWorksGetHostnameSuggestionCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.GetHostnameSuggestionResult {
	return this.block.declare(AWSOpsWorksGetHostnameSuggestionCommand(layerId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.GetHostnameSuggestionResult
}

@Generated
class AWSOpsWorksGetHostnameSuggestionCommand(val layerId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest, com.amazonaws.services.opsworks.model.GetHostnameSuggestionResult> {



	override fun build(): com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest {
		val input = com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest()
		input.setLayerId(this.layerId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.GetHostnameSuggestionResult {
	  return com.amazonaws.services.opsworks.model.GetHostnameSuggestionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.GetHostnameSuggestionResult {
		return environment.opsworks.getHostnameSuggestion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks get-hostname-suggestion")
				.argument("layer-id", layerId)
	}

}


fun AWSOpsWorksFunctions.grantAccess(instanceId: String, init: (AWSOpsWorksGrantAccessCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.GrantAccessResult {
	return this.block.declare(AWSOpsWorksGrantAccessCommand(instanceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.GrantAccessResult
}

@Generated
class AWSOpsWorksGrantAccessCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.GrantAccessRequest, com.amazonaws.services.opsworks.model.GrantAccessResult> {

	var validForInMinutes: Int? = 0

	override fun build(): com.amazonaws.services.opsworks.model.GrantAccessRequest {
		val input = com.amazonaws.services.opsworks.model.GrantAccessRequest()
		input.setInstanceId(this.instanceId)
		input.setValidForInMinutes(this.validForInMinutes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.GrantAccessResult {
	  return com.amazonaws.services.opsworks.model.GrantAccessResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.GrantAccessResult {
		return environment.opsworks.grantAccess(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks grant-access")
				.argument("instance-id", instanceId)
				.argument("valid-for-in-minutes", validForInMinutes?.toString())
	}

}


fun AWSOpsWorksFunctions.listTags(resourceArn: String, init: (AWSOpsWorksListTagsCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.ListTagsResult {
	return this.block.declare(AWSOpsWorksListTagsCommand(resourceArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.ListTagsResult
}

@Generated
class AWSOpsWorksListTagsCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.ListTagsRequest, com.amazonaws.services.opsworks.model.ListTagsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.ListTagsRequest {
		val input = com.amazonaws.services.opsworks.model.ListTagsRequest()
		input.setResourceArn(this.resourceArn)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.ListTagsResult {
	  return com.amazonaws.services.opsworks.model.ListTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.ListTagsResult {
		return environment.opsworks.listTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks list-tags")
				.argument("resource-arn", resourceArn)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSOpsWorksFunctions.rebootInstance(instanceId: String, init: (AWSOpsWorksRebootInstanceCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.RebootInstanceResult {
	return this.block.declare(AWSOpsWorksRebootInstanceCommand(instanceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.RebootInstanceResult
}

@Generated
class AWSOpsWorksRebootInstanceCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.RebootInstanceRequest, com.amazonaws.services.opsworks.model.RebootInstanceResult> {



	override fun build(): com.amazonaws.services.opsworks.model.RebootInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.RebootInstanceRequest()
		input.setInstanceId(this.instanceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.RebootInstanceResult {
	  return com.amazonaws.services.opsworks.model.RebootInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.RebootInstanceResult {
		return environment.opsworks.rebootInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks reboot-instance")
				.argument("instance-id", instanceId)
	}

}


fun AWSOpsWorksFunctions.registerEcsCluster(ecsClusterArn: String, stackId: String, init: (AWSOpsWorksRegisterEcsClusterCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.RegisterEcsClusterResult {
	return this.block.declare(AWSOpsWorksRegisterEcsClusterCommand(ecsClusterArn, stackId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.RegisterEcsClusterResult
}

@Generated
class AWSOpsWorksRegisterEcsClusterCommand(val ecsClusterArn: String, val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest, com.amazonaws.services.opsworks.model.RegisterEcsClusterResult> {



	override fun build(): com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest {
		val input = com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest()
		input.setEcsClusterArn(this.ecsClusterArn)
		input.setStackId(this.stackId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.RegisterEcsClusterResult {
	  return com.amazonaws.services.opsworks.model.RegisterEcsClusterResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.RegisterEcsClusterResult {
		return environment.opsworks.registerEcsCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks register-ecs-cluster")
				.argument("ecs-cluster-arn", ecsClusterArn)
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.registerElasticIp(elasticIp: String, stackId: String, init: (AWSOpsWorksRegisterElasticIpCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.RegisterElasticIpResult {
	return this.block.declare(AWSOpsWorksRegisterElasticIpCommand(elasticIp, stackId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.RegisterElasticIpResult
}

@Generated
class AWSOpsWorksRegisterElasticIpCommand(val elasticIp: String, val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.RegisterElasticIpRequest, com.amazonaws.services.opsworks.model.RegisterElasticIpResult> {



	override fun build(): com.amazonaws.services.opsworks.model.RegisterElasticIpRequest {
		val input = com.amazonaws.services.opsworks.model.RegisterElasticIpRequest()
		input.setElasticIp(this.elasticIp)
		input.setStackId(this.stackId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.RegisterElasticIpResult {
	  return com.amazonaws.services.opsworks.model.RegisterElasticIpResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.RegisterElasticIpResult {
		return environment.opsworks.registerElasticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks register-elastic-ip")
				.argument("elastic-ip", elasticIp)
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.registerInstance(stackId: String, init: (AWSOpsWorksRegisterInstanceCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.RegisterInstanceResult {
	return this.block.declare(AWSOpsWorksRegisterInstanceCommand(stackId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.RegisterInstanceResult
}

@Generated
class AWSOpsWorksRegisterInstanceCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.RegisterInstanceRequest, com.amazonaws.services.opsworks.model.RegisterInstanceResult> {

	var hostname: String? = null
	var publicIp: String? = null
	var privateIp: String? = null
	var rsaPublicKey: String? = null
	var rsaPublicKeyFingerprint: String? = null
	var instanceIdentity: com.amazonaws.services.opsworks.model.InstanceIdentity? = null

	override fun build(): com.amazonaws.services.opsworks.model.RegisterInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.RegisterInstanceRequest()
		input.setStackId(this.stackId)
		input.setHostname(this.hostname)
		input.setPublicIp(this.publicIp)
		input.setPrivateIp(this.privateIp)
		input.setRsaPublicKey(this.rsaPublicKey)
		input.setRsaPublicKeyFingerprint(this.rsaPublicKeyFingerprint)
		input.setInstanceIdentity(this.instanceIdentity)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.RegisterInstanceResult {
	  return com.amazonaws.services.opsworks.model.RegisterInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.RegisterInstanceResult {
		return environment.opsworks.registerInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks register-instance")
				.argument("stack-id", stackId)
				.argument("hostname", hostname)
				.argument("public-ip", publicIp)
				.argument("private-ip", privateIp)
				.argument("rsa-public-key", rsaPublicKey)
				.argument("rsa-public-key-fingerprint", rsaPublicKeyFingerprint)
				.argument("instance-identity", instanceIdentity?.toString())
	}

}


fun AWSOpsWorksFunctions.registerRdsDbInstance(stackId: String, rdsDbInstanceArn: String, dbUser: String, dbPassword: String, init: (AWSOpsWorksRegisterRdsDbInstanceCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceResult {
	return this.block.declare(AWSOpsWorksRegisterRdsDbInstanceCommand(stackId, rdsDbInstanceArn, dbUser, dbPassword).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceResult
}

@Generated
class AWSOpsWorksRegisterRdsDbInstanceCommand(val stackId: String, val rdsDbInstanceArn: String, val dbUser: String, val dbPassword: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest, com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceResult> {



	override fun build(): com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest()
		input.setStackId(this.stackId)
		input.setRdsDbInstanceArn(this.rdsDbInstanceArn)
		input.setDbUser(this.dbUser)
		input.setDbPassword(this.dbPassword)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceResult {
	  return com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceResult {
		return environment.opsworks.registerRdsDbInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks register-rds-db-instance")
				.argument("stack-id", stackId)
				.argument("rds-db-instance-arn", rdsDbInstanceArn)
				.argument("db-user", dbUser)
				.argument("db-password", dbPassword)
	}

}


fun AWSOpsWorksFunctions.registerVolume(stackId: String, init: (AWSOpsWorksRegisterVolumeCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.RegisterVolumeResult {
	return this.block.declare(AWSOpsWorksRegisterVolumeCommand(stackId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.RegisterVolumeResult
}

@Generated
class AWSOpsWorksRegisterVolumeCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.RegisterVolumeRequest, com.amazonaws.services.opsworks.model.RegisterVolumeResult> {

	var ec2VolumeId: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.RegisterVolumeRequest {
		val input = com.amazonaws.services.opsworks.model.RegisterVolumeRequest()
		input.setEc2VolumeId(this.ec2VolumeId)
		input.setStackId(this.stackId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.RegisterVolumeResult {
	  return com.amazonaws.services.opsworks.model.RegisterVolumeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.RegisterVolumeResult {
		return environment.opsworks.registerVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks register-volume")
				.argument("ec2-volume-id", ec2VolumeId)
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.setLoadBasedAutoScaling(layerId: String, init: (AWSOpsWorksSetLoadBasedAutoScalingCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingResult {
	return this.block.declare(AWSOpsWorksSetLoadBasedAutoScalingCommand(layerId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingResult
}

@Generated
class AWSOpsWorksSetLoadBasedAutoScalingCommand(val layerId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingRequest, com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingResult> {

	var enable: Boolean? = false
	var upScaling: com.amazonaws.services.opsworks.model.AutoScalingThresholds? = null
	var downScaling: com.amazonaws.services.opsworks.model.AutoScalingThresholds? = null

	override fun build(): com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingRequest {
		val input = com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingRequest()
		input.setLayerId(this.layerId)
		input.setEnable(this.enable)
		input.setUpScaling(this.upScaling)
		input.setDownScaling(this.downScaling)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingResult {
	  return com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingResult {
		return environment.opsworks.setLoadBasedAutoScaling(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks set-load-based-auto-scaling")
				.argument("layer-id", layerId)
				.option("enable", enable ?: false)
				.argument("up-scaling", upScaling?.toString())
				.argument("down-scaling", downScaling?.toString())
	}

}


fun AWSOpsWorksFunctions.setPermission(stackId: String, iamUserArn: String, init: (AWSOpsWorksSetPermissionCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.SetPermissionResult {
	return this.block.declare(AWSOpsWorksSetPermissionCommand(stackId, iamUserArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.SetPermissionResult
}

@Generated
class AWSOpsWorksSetPermissionCommand(val stackId: String, val iamUserArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.SetPermissionRequest, com.amazonaws.services.opsworks.model.SetPermissionResult> {

	var allowSsh: Boolean? = false
	var allowSudo: Boolean? = false
	var level: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.SetPermissionRequest {
		val input = com.amazonaws.services.opsworks.model.SetPermissionRequest()
		input.setStackId(this.stackId)
		input.setIamUserArn(this.iamUserArn)
		input.setAllowSsh(this.allowSsh)
		input.setAllowSudo(this.allowSudo)
		input.setLevel(this.level)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.SetPermissionResult {
	  return com.amazonaws.services.opsworks.model.SetPermissionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.SetPermissionResult {
		return environment.opsworks.setPermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks set-permission")
				.argument("stack-id", stackId)
				.argument("iam-user-arn", iamUserArn)
				.option("allow-ssh", allowSsh ?: false)
				.option("allow-sudo", allowSudo ?: false)
				.argument("level", level)
	}

}


fun AWSOpsWorksFunctions.setTimeBasedAutoScaling(instanceId: String, init: (AWSOpsWorksSetTimeBasedAutoScalingCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingResult {
	return this.block.declare(AWSOpsWorksSetTimeBasedAutoScalingCommand(instanceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingResult
}

@Generated
class AWSOpsWorksSetTimeBasedAutoScalingCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest, com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingResult> {

	var autoScalingSchedule: com.amazonaws.services.opsworks.model.WeeklyAutoScalingSchedule? = null

	override fun build(): com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest {
		val input = com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest()
		input.setInstanceId(this.instanceId)
		input.setAutoScalingSchedule(this.autoScalingSchedule)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingResult {
	  return com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingResult {
		return environment.opsworks.setTimeBasedAutoScaling(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks set-time-based-auto-scaling")
				.argument("instance-id", instanceId)
				.argument("auto-scaling-schedule", autoScalingSchedule?.toString())
	}

}


fun AWSOpsWorksFunctions.startInstance(instanceId: String, init: (AWSOpsWorksStartInstanceCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.StartInstanceResult {
	return this.block.declare(AWSOpsWorksStartInstanceCommand(instanceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.StartInstanceResult
}

@Generated
class AWSOpsWorksStartInstanceCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.StartInstanceRequest, com.amazonaws.services.opsworks.model.StartInstanceResult> {



	override fun build(): com.amazonaws.services.opsworks.model.StartInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.StartInstanceRequest()
		input.setInstanceId(this.instanceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.StartInstanceResult {
	  return com.amazonaws.services.opsworks.model.StartInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.StartInstanceResult {
		return environment.opsworks.startInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks start-instance")
				.argument("instance-id", instanceId)
	}

}


fun AWSOpsWorksFunctions.startStack(stackId: String, init: (AWSOpsWorksStartStackCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.StartStackResult {
	return this.block.declare(AWSOpsWorksStartStackCommand(stackId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.StartStackResult
}

@Generated
class AWSOpsWorksStartStackCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.StartStackRequest, com.amazonaws.services.opsworks.model.StartStackResult> {



	override fun build(): com.amazonaws.services.opsworks.model.StartStackRequest {
		val input = com.amazonaws.services.opsworks.model.StartStackRequest()
		input.setStackId(this.stackId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.StartStackResult {
	  return com.amazonaws.services.opsworks.model.StartStackResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.StartStackResult {
		return environment.opsworks.startStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks start-stack")
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.stopInstance(instanceId: String, init: (AWSOpsWorksStopInstanceCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.StopInstanceResult {
	return this.block.declare(AWSOpsWorksStopInstanceCommand(instanceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.StopInstanceResult
}

@Generated
class AWSOpsWorksStopInstanceCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.StopInstanceRequest, com.amazonaws.services.opsworks.model.StopInstanceResult> {

	var force: Boolean? = false

	override fun build(): com.amazonaws.services.opsworks.model.StopInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.StopInstanceRequest()
		input.setInstanceId(this.instanceId)
		input.setForce(this.force)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.StopInstanceResult {
	  return com.amazonaws.services.opsworks.model.StopInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.StopInstanceResult {
		return environment.opsworks.stopInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks stop-instance")
				.argument("instance-id", instanceId)
				.option("force", force ?: false)
	}

}


fun AWSOpsWorksFunctions.stopStack(stackId: String, init: (AWSOpsWorksStopStackCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.StopStackResult {
	return this.block.declare(AWSOpsWorksStopStackCommand(stackId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.StopStackResult
}

@Generated
class AWSOpsWorksStopStackCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.StopStackRequest, com.amazonaws.services.opsworks.model.StopStackResult> {



	override fun build(): com.amazonaws.services.opsworks.model.StopStackRequest {
		val input = com.amazonaws.services.opsworks.model.StopStackRequest()
		input.setStackId(this.stackId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.StopStackResult {
	  return com.amazonaws.services.opsworks.model.StopStackResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.StopStackResult {
		return environment.opsworks.stopStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks stop-stack")
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.tagResource(resourceArn: String, tags: Map<String, String>, init: (AWSOpsWorksTagResourceCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.TagResourceResult {
	return this.block.declare(AWSOpsWorksTagResourceCommand(resourceArn, tags).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.TagResourceResult
}

@Generated
class AWSOpsWorksTagResourceCommand(val resourceArn: String, val tags: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.TagResourceRequest, com.amazonaws.services.opsworks.model.TagResourceResult> {



	override fun build(): com.amazonaws.services.opsworks.model.TagResourceRequest {
		val input = com.amazonaws.services.opsworks.model.TagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.TagResourceResult {
	  return com.amazonaws.services.opsworks.model.TagResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.TagResourceResult {
		return environment.opsworks.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks tag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags.toString())
	}

}


fun AWSOpsWorksFunctions.unassignInstance(instanceId: String, init: (AWSOpsWorksUnassignInstanceCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.UnassignInstanceResult {
	return this.block.declare(AWSOpsWorksUnassignInstanceCommand(instanceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.UnassignInstanceResult
}

@Generated
class AWSOpsWorksUnassignInstanceCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UnassignInstanceRequest, com.amazonaws.services.opsworks.model.UnassignInstanceResult> {



	override fun build(): com.amazonaws.services.opsworks.model.UnassignInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.UnassignInstanceRequest()
		input.setInstanceId(this.instanceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.UnassignInstanceResult {
	  return com.amazonaws.services.opsworks.model.UnassignInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.UnassignInstanceResult {
		return environment.opsworks.unassignInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks unassign-instance")
				.argument("instance-id", instanceId)
	}

}


fun AWSOpsWorksFunctions.unassignVolume(volumeId: String, init: (AWSOpsWorksUnassignVolumeCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.UnassignVolumeResult {
	return this.block.declare(AWSOpsWorksUnassignVolumeCommand(volumeId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.UnassignVolumeResult
}

@Generated
class AWSOpsWorksUnassignVolumeCommand(val volumeId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UnassignVolumeRequest, com.amazonaws.services.opsworks.model.UnassignVolumeResult> {



	override fun build(): com.amazonaws.services.opsworks.model.UnassignVolumeRequest {
		val input = com.amazonaws.services.opsworks.model.UnassignVolumeRequest()
		input.setVolumeId(this.volumeId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.UnassignVolumeResult {
	  return com.amazonaws.services.opsworks.model.UnassignVolumeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.UnassignVolumeResult {
		return environment.opsworks.unassignVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks unassign-volume")
				.argument("volume-id", volumeId)
	}

}


fun AWSOpsWorksFunctions.untagResource(resourceArn: String, tagKeys: List<String>, init: (AWSOpsWorksUntagResourceCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.UntagResourceResult {
	return this.block.declare(AWSOpsWorksUntagResourceCommand(resourceArn, tagKeys).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.UntagResourceResult
}

@Generated
class AWSOpsWorksUntagResourceCommand(val resourceArn: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UntagResourceRequest, com.amazonaws.services.opsworks.model.UntagResourceResult> {



	override fun build(): com.amazonaws.services.opsworks.model.UntagResourceRequest {
		val input = com.amazonaws.services.opsworks.model.UntagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.UntagResourceResult {
	  return com.amazonaws.services.opsworks.model.UntagResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.UntagResourceResult {
		return environment.opsworks.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks untag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSOpsWorksFunctions.updateApp(appId: String, init: (AWSOpsWorksUpdateAppCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.UpdateAppResult {
	return this.block.declare(AWSOpsWorksUpdateAppCommand(appId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.UpdateAppResult
}

@Generated
class AWSOpsWorksUpdateAppCommand(val appId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateAppRequest, com.amazonaws.services.opsworks.model.UpdateAppResult> {

	var name: String? = null
	var description: String? = null
	var dataSources: List<com.amazonaws.services.opsworks.model.DataSource>? = null
	var type: AppType? = null
	var appSource: com.amazonaws.services.opsworks.model.Source? = null
	var domains: List<String>? = null
	var enableSsl: Boolean? = false
	var sslConfiguration: com.amazonaws.services.opsworks.model.SslConfiguration? = null
	var attributes: Map<AppAttributesKeys, String>? = null
	var environment: List<com.amazonaws.services.opsworks.model.EnvironmentVariable>? = null

	override fun build(): com.amazonaws.services.opsworks.model.UpdateAppRequest {
		val input = com.amazonaws.services.opsworks.model.UpdateAppRequest()
		input.setAppId(this.appId)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setDataSources(this.dataSources)
		input.setType(this.type?.toString())
		input.setAppSource(this.appSource)
		input.setDomains(this.domains)
		input.setEnableSsl(this.enableSsl)
		input.setSslConfiguration(this.sslConfiguration)
		input.setAttributes(this.attributes?.mapKeys { it.toString() })
		input.setEnvironment(this.environment)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.UpdateAppResult {
	  return com.amazonaws.services.opsworks.model.UpdateAppResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.UpdateAppResult {
		return environment.opsworks.updateApp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks update-app")
				.argument("app-id", appId)
				.argument("name", name)
				.argument("description", description)
				.argument("data-sources", dataSources?.toString())
				.argument("type", type?.toString())
				.argument("app-source", appSource?.toString())
				.argument("domains", domains?.toString())
				.option("enable-ssl", enableSsl ?: false)
				.argument("ssl-configuration", sslConfiguration?.toString())
				.argument("attributes", attributes?.toString())
				.argument("environment", environment?.toString())
	}

}


fun AWSOpsWorksFunctions.updateElasticIp(elasticIp: String, init: (AWSOpsWorksUpdateElasticIpCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.UpdateElasticIpResult {
	return this.block.declare(AWSOpsWorksUpdateElasticIpCommand(elasticIp).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.UpdateElasticIpResult
}

@Generated
class AWSOpsWorksUpdateElasticIpCommand(val elasticIp: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateElasticIpRequest, com.amazonaws.services.opsworks.model.UpdateElasticIpResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.UpdateElasticIpRequest {
		val input = com.amazonaws.services.opsworks.model.UpdateElasticIpRequest()
		input.setElasticIp(this.elasticIp)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.UpdateElasticIpResult {
	  return com.amazonaws.services.opsworks.model.UpdateElasticIpResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.UpdateElasticIpResult {
		return environment.opsworks.updateElasticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks update-elastic-ip")
				.argument("elastic-ip", elasticIp)
				.argument("name", name)
	}

}


fun AWSOpsWorksFunctions.updateInstance(instanceId: String, init: (AWSOpsWorksUpdateInstanceCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.UpdateInstanceResult {
	return this.block.declare(AWSOpsWorksUpdateInstanceCommand(instanceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.UpdateInstanceResult
}

@Generated
class AWSOpsWorksUpdateInstanceCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateInstanceRequest, com.amazonaws.services.opsworks.model.UpdateInstanceResult> {

	var layerIds: List<String>? = null
	var instanceType: String? = null
	var autoScalingType: AutoScalingType? = null
	var hostname: String? = null
	var os: String? = null
	var amiId: String? = null
	var sshKeyName: String? = null
	var architecture: Architecture? = null
	var installUpdatesOnBoot: Boolean? = false
	var ebsOptimized: Boolean? = false
	var agentVersion: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.UpdateInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.UpdateInstanceRequest()
		input.setInstanceId(this.instanceId)
		input.setLayerIds(this.layerIds)
		input.setInstanceType(this.instanceType)
		input.setAutoScalingType(this.autoScalingType?.toString())
		input.setHostname(this.hostname)
		input.setOs(this.os)
		input.setAmiId(this.amiId)
		input.setSshKeyName(this.sshKeyName)
		input.setArchitecture(this.architecture?.toString())
		input.setInstallUpdatesOnBoot(this.installUpdatesOnBoot)
		input.setEbsOptimized(this.ebsOptimized)
		input.setAgentVersion(this.agentVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.UpdateInstanceResult {
	  return com.amazonaws.services.opsworks.model.UpdateInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.UpdateInstanceResult {
		return environment.opsworks.updateInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks update-instance")
				.argument("instance-id", instanceId)
				.argument("layer-ids", layerIds?.toString())
				.argument("instance-type", instanceType)
				.argument("auto-scaling-type", autoScalingType?.toString())
				.argument("hostname", hostname)
				.argument("os", os)
				.argument("ami-id", amiId)
				.argument("ssh-key-name", sshKeyName)
				.argument("architecture", architecture?.toString())
				.option("install-updates-on-boot", installUpdatesOnBoot ?: false)
				.option("ebs-optimized", ebsOptimized ?: false)
				.argument("agent-version", agentVersion)
	}

}


fun AWSOpsWorksFunctions.updateLayer(layerId: String, init: (AWSOpsWorksUpdateLayerCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.UpdateLayerResult {
	return this.block.declare(AWSOpsWorksUpdateLayerCommand(layerId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.UpdateLayerResult
}

@Generated
class AWSOpsWorksUpdateLayerCommand(val layerId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateLayerRequest, com.amazonaws.services.opsworks.model.UpdateLayerResult> {

	var name: String? = null
	var shortname: String? = null
	var attributes: Map<LayerAttributesKeys, String>? = null
	var cloudWatchLogsConfiguration: com.amazonaws.services.opsworks.model.CloudWatchLogsConfiguration? = null
	var customInstanceProfileArn: String? = null
	var customJson: String? = null
	var customSecurityGroupIds: List<String>? = null
	var packages: List<String>? = null
	var volumeConfigurations: List<com.amazonaws.services.opsworks.model.VolumeConfiguration>? = null
	var enableAutoHealing: Boolean? = false
	var autoAssignElasticIps: Boolean? = false
	var autoAssignPublicIps: Boolean? = false
	var customRecipes: com.amazonaws.services.opsworks.model.Recipes? = null
	var installUpdatesOnBoot: Boolean? = false
	var useEbsOptimizedInstances: Boolean? = false
	var lifecycleEventConfiguration: com.amazonaws.services.opsworks.model.LifecycleEventConfiguration? = null

	override fun build(): com.amazonaws.services.opsworks.model.UpdateLayerRequest {
		val input = com.amazonaws.services.opsworks.model.UpdateLayerRequest()
		input.setLayerId(this.layerId)
		input.setName(this.name)
		input.setShortname(this.shortname)
		input.setAttributes(this.attributes?.mapKeys { it.toString() })
		input.setCloudWatchLogsConfiguration(this.cloudWatchLogsConfiguration)
		input.setCustomInstanceProfileArn(this.customInstanceProfileArn)
		input.setCustomJson(this.customJson)
		input.setCustomSecurityGroupIds(this.customSecurityGroupIds)
		input.setPackages(this.packages)
		input.setVolumeConfigurations(this.volumeConfigurations)
		input.setEnableAutoHealing(this.enableAutoHealing)
		input.setAutoAssignElasticIps(this.autoAssignElasticIps)
		input.setAutoAssignPublicIps(this.autoAssignPublicIps)
		input.setCustomRecipes(this.customRecipes)
		input.setInstallUpdatesOnBoot(this.installUpdatesOnBoot)
		input.setUseEbsOptimizedInstances(this.useEbsOptimizedInstances)
		input.setLifecycleEventConfiguration(this.lifecycleEventConfiguration)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.UpdateLayerResult {
	  return com.amazonaws.services.opsworks.model.UpdateLayerResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.UpdateLayerResult {
		return environment.opsworks.updateLayer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks update-layer")
				.argument("layer-id", layerId)
				.argument("name", name)
				.argument("shortname", shortname)
				.argument("attributes", attributes?.toString())
				.argument("cloud-watch-logs-configuration", cloudWatchLogsConfiguration?.toString())
				.argument("custom-instance-profile-arn", customInstanceProfileArn)
				.argument("custom-json", customJson)
				.argument("custom-security-group-ids", customSecurityGroupIds?.toString())
				.argument("packages", packages?.toString())
				.argument("volume-configurations", volumeConfigurations?.toString())
				.option("enable-auto-healing", enableAutoHealing ?: false)
				.option("auto-assign-elastic-ips", autoAssignElasticIps ?: false)
				.option("auto-assign-public-ips", autoAssignPublicIps ?: false)
				.argument("custom-recipes", customRecipes?.toString())
				.option("install-updates-on-boot", installUpdatesOnBoot ?: false)
				.option("use-ebs-optimized-instances", useEbsOptimizedInstances ?: false)
				.argument("lifecycle-event-configuration", lifecycleEventConfiguration?.toString())
	}

}


fun AWSOpsWorksFunctions.updateMyUserProfile(init: (AWSOpsWorksUpdateMyUserProfileCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.UpdateMyUserProfileResult {
	return this.block.declare(AWSOpsWorksUpdateMyUserProfileCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.UpdateMyUserProfileResult
}

@Generated
class AWSOpsWorksUpdateMyUserProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest, com.amazonaws.services.opsworks.model.UpdateMyUserProfileResult> {

	var sshPublicKey: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest {
		val input = com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest()
		input.setSshPublicKey(this.sshPublicKey)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.UpdateMyUserProfileResult {
	  return com.amazonaws.services.opsworks.model.UpdateMyUserProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.UpdateMyUserProfileResult {
		return environment.opsworks.updateMyUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks update-my-user-profile")
				.argument("ssh-public-key", sshPublicKey)
	}

}


fun AWSOpsWorksFunctions.updateRdsDbInstance(rdsDbInstanceArn: String, init: (AWSOpsWorksUpdateRdsDbInstanceCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceResult {
	return this.block.declare(AWSOpsWorksUpdateRdsDbInstanceCommand(rdsDbInstanceArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceResult
}

@Generated
class AWSOpsWorksUpdateRdsDbInstanceCommand(val rdsDbInstanceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest, com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceResult> {

	var dbUser: String? = null
	var dbPassword: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest()
		input.setRdsDbInstanceArn(this.rdsDbInstanceArn)
		input.setDbUser(this.dbUser)
		input.setDbPassword(this.dbPassword)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceResult {
	  return com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceResult {
		return environment.opsworks.updateRdsDbInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks update-rds-db-instance")
				.argument("rds-db-instance-arn", rdsDbInstanceArn)
				.argument("db-user", dbUser)
				.argument("db-password", dbPassword)
	}

}


fun AWSOpsWorksFunctions.updateStack(stackId: String, init: (AWSOpsWorksUpdateStackCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.UpdateStackResult {
	return this.block.declare(AWSOpsWorksUpdateStackCommand(stackId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.UpdateStackResult
}

@Generated
class AWSOpsWorksUpdateStackCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateStackRequest, com.amazonaws.services.opsworks.model.UpdateStackResult> {

	var name: String? = null
	var attributes: Map<StackAttributesKeys, String>? = null
	var serviceRoleArn: String? = null
	var defaultInstanceProfileArn: String? = null
	var defaultOs: String? = null
	var hostnameTheme: String? = null
	var defaultAvailabilityZone: String? = null
	var defaultSubnetId: String? = null
	var customJson: String? = null
	var configurationManager: com.amazonaws.services.opsworks.model.StackConfigurationManager? = null
	var chefConfiguration: com.amazonaws.services.opsworks.model.ChefConfiguration? = null
	var useCustomCookbooks: Boolean? = false
	var customCookbooksSource: com.amazonaws.services.opsworks.model.Source? = null
	var defaultSshKeyName: String? = null
	var defaultRootDeviceType: RootDeviceType? = null
	var useOpsworksSecurityGroups: Boolean? = false
	var agentVersion: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.UpdateStackRequest {
		val input = com.amazonaws.services.opsworks.model.UpdateStackRequest()
		input.setStackId(this.stackId)
		input.setName(this.name)
		input.setAttributes(this.attributes?.mapKeys { it.toString() })
		input.setServiceRoleArn(this.serviceRoleArn)
		input.setDefaultInstanceProfileArn(this.defaultInstanceProfileArn)
		input.setDefaultOs(this.defaultOs)
		input.setHostnameTheme(this.hostnameTheme)
		input.setDefaultAvailabilityZone(this.defaultAvailabilityZone)
		input.setDefaultSubnetId(this.defaultSubnetId)
		input.setCustomJson(this.customJson)
		input.setConfigurationManager(this.configurationManager)
		input.setChefConfiguration(this.chefConfiguration)
		input.setUseCustomCookbooks(this.useCustomCookbooks)
		input.setCustomCookbooksSource(this.customCookbooksSource)
		input.setDefaultSshKeyName(this.defaultSshKeyName)
		input.setDefaultRootDeviceType(this.defaultRootDeviceType?.toString())
		input.setUseOpsworksSecurityGroups(this.useOpsworksSecurityGroups)
		input.setAgentVersion(this.agentVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.UpdateStackResult {
	  return com.amazonaws.services.opsworks.model.UpdateStackResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.UpdateStackResult {
		return environment.opsworks.updateStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks update-stack")
				.argument("stack-id", stackId)
				.argument("name", name)
				.argument("attributes", attributes?.toString())
				.argument("service-role-arn", serviceRoleArn)
				.argument("default-instance-profile-arn", defaultInstanceProfileArn)
				.argument("default-os", defaultOs)
				.argument("hostname-theme", hostnameTheme)
				.argument("default-availability-zone", defaultAvailabilityZone)
				.argument("default-subnet-id", defaultSubnetId)
				.argument("custom-json", customJson)
				.argument("configuration-manager", configurationManager?.toString())
				.argument("chef-configuration", chefConfiguration?.toString())
				.option("use-custom-cookbooks", useCustomCookbooks ?: false)
				.argument("custom-cookbooks-source", customCookbooksSource?.toString())
				.argument("default-ssh-key-name", defaultSshKeyName)
				.argument("default-root-device-type", defaultRootDeviceType?.toString())
				.option("use-opsworks-security-groups", useOpsworksSecurityGroups ?: false)
				.argument("agent-version", agentVersion)
	}

}


fun AWSOpsWorksFunctions.updateUserProfile(iamUserArn: String, init: (AWSOpsWorksUpdateUserProfileCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.UpdateUserProfileResult {
	return this.block.declare(AWSOpsWorksUpdateUserProfileCommand(iamUserArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.UpdateUserProfileResult
}

@Generated
class AWSOpsWorksUpdateUserProfileCommand(val iamUserArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateUserProfileRequest, com.amazonaws.services.opsworks.model.UpdateUserProfileResult> {

	var sshUsername: String? = null
	var sshPublicKey: String? = null
	var allowSelfManagement: Boolean? = false

	override fun build(): com.amazonaws.services.opsworks.model.UpdateUserProfileRequest {
		val input = com.amazonaws.services.opsworks.model.UpdateUserProfileRequest()
		input.setIamUserArn(this.iamUserArn)
		input.setSshUsername(this.sshUsername)
		input.setSshPublicKey(this.sshPublicKey)
		input.setAllowSelfManagement(this.allowSelfManagement)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.UpdateUserProfileResult {
	  return com.amazonaws.services.opsworks.model.UpdateUserProfileResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.UpdateUserProfileResult {
		return environment.opsworks.updateUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks update-user-profile")
				.argument("iam-user-arn", iamUserArn)
				.argument("ssh-username", sshUsername)
				.argument("ssh-public-key", sshPublicKey)
				.option("allow-self-management", allowSelfManagement ?: false)
	}

}


fun AWSOpsWorksFunctions.updateVolume(volumeId: String, init: (AWSOpsWorksUpdateVolumeCommand.() -> Unit)? = null): com.amazonaws.services.opsworks.model.UpdateVolumeResult {
	return this.block.declare(AWSOpsWorksUpdateVolumeCommand(volumeId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.opsworks.model.UpdateVolumeResult
}

@Generated
class AWSOpsWorksUpdateVolumeCommand(val volumeId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateVolumeRequest, com.amazonaws.services.opsworks.model.UpdateVolumeResult> {

	var name: String? = null
	var mountPoint: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.UpdateVolumeRequest {
		val input = com.amazonaws.services.opsworks.model.UpdateVolumeRequest()
		input.setVolumeId(this.volumeId)
		input.setName(this.name)
		input.setMountPoint(this.mountPoint)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.opsworks.model.UpdateVolumeResult {
	  return com.amazonaws.services.opsworks.model.UpdateVolumeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.opsworks.model.UpdateVolumeResult {
		return environment.opsworks.updateVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks update-volume")
				.argument("volume-id", volumeId)
				.argument("name", name)
				.argument("mount-point", mountPoint)
	}

}
