
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.opsworks.AWSOpsWorks
import com.amazonaws.services.opsworks.model.*

var codingue.koops.core.Environment.opsworks: AWSOpsWorks
	get() = this.capabilities[AWSOpsWorks::class.java.name] as AWSOpsWorks
	set(opsworks) {
		this.capabilities[AWSOpsWorks::class.java.name] = opsworks
	}

@Generated
class AWSOpsWorksFunctions(val block: Block)

infix fun AwsContinuation.opsworks(init: AWSOpsWorksFunctions.() -> Unit) {
	AWSOpsWorksFunctions(shell).apply(init)
}

			

fun AWSOpsWorksFunctions.assignInstance(instanceId: String, layerIds: List<String>, init: AWSOpsWorksAssignInstanceCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksAssignInstanceCommand(instanceId, layerIds).apply(init))
}

@Generated
class AWSOpsWorksAssignInstanceCommand(val instanceId: String, val layerIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.AssignInstanceRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.AssignInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.AssignInstanceRequest()
		input.setInstanceId(this.instanceId)
		input.setLayerIds(this.layerIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.assignInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks assign-instance")
				.argument("instance-id", instanceId)
				.argument("layer-ids", layerIds.toString())
	}

}


fun AWSOpsWorksFunctions.assignVolume(volumeId: String, init: AWSOpsWorksAssignVolumeCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksAssignVolumeCommand(volumeId).apply(init))
}

@Generated
class AWSOpsWorksAssignVolumeCommand(val volumeId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.AssignVolumeRequest> {

	var instanceId: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.AssignVolumeRequest {
		val input = com.amazonaws.services.opsworks.model.AssignVolumeRequest()
		input.setVolumeId(this.volumeId)
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.assignVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks assign-volume")
				.argument("volume-id", volumeId)
				.argument("instance-id", instanceId)
	}

}


fun AWSOpsWorksFunctions.associateElasticIp(elasticIp: String, init: AWSOpsWorksAssociateElasticIpCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksAssociateElasticIpCommand(elasticIp).apply(init))
}

@Generated
class AWSOpsWorksAssociateElasticIpCommand(val elasticIp: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.AssociateElasticIpRequest> {

	var instanceId: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.AssociateElasticIpRequest {
		val input = com.amazonaws.services.opsworks.model.AssociateElasticIpRequest()
		input.setElasticIp(this.elasticIp)
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.associateElasticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks associate-elastic-ip")
				.argument("elastic-ip", elasticIp)
				.argument("instance-id", instanceId)
	}

}


fun AWSOpsWorksFunctions.attachElasticLoadBalancer(elasticLoadBalancerName: String, layerId: String, init: AWSOpsWorksAttachElasticLoadBalancerCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksAttachElasticLoadBalancerCommand(elasticLoadBalancerName, layerId).apply(init))
}

@Generated
class AWSOpsWorksAttachElasticLoadBalancerCommand(val elasticLoadBalancerName: String, val layerId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest {
		val input = com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest()
		input.setElasticLoadBalancerName(this.elasticLoadBalancerName)
		input.setLayerId(this.layerId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.attachElasticLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks attach-elastic-load-balancer")
				.argument("elastic-load-balancer-name", elasticLoadBalancerName)
				.argument("layer-id", layerId)
	}

}


fun AWSOpsWorksFunctions.cloneStack(sourceStackId: String, serviceRoleArn: String, init: AWSOpsWorksCloneStackCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCloneStackCommand(sourceStackId, serviceRoleArn).apply(init))
}

@Generated
class AWSOpsWorksCloneStackCommand(val sourceStackId: String, val serviceRoleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.CloneStackRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.cloneStack(build())
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


fun AWSOpsWorksFunctions.createApp(stackId: String, name: String, type: AppType, init: AWSOpsWorksCreateAppCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCreateAppCommand(stackId, name, type).apply(init))
}

@Generated
class AWSOpsWorksCreateAppCommand(val stackId: String, val name: String, val type: AppType) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.CreateAppRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.createApp(build())
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


fun AWSOpsWorksFunctions.createDeployment(stackId: String, command: com.amazonaws.services.opsworks.model.DeploymentCommand, init: AWSOpsWorksCreateDeploymentCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCreateDeploymentCommand(stackId, command).apply(init))
}

@Generated
class AWSOpsWorksCreateDeploymentCommand(val stackId: String, val command: com.amazonaws.services.opsworks.model.DeploymentCommand) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.CreateDeploymentRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.createDeployment(build())
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


fun AWSOpsWorksFunctions.createInstance(stackId: String, layerIds: List<String>, instanceType: String, init: AWSOpsWorksCreateInstanceCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCreateInstanceCommand(stackId, layerIds, instanceType).apply(init))
}

@Generated
class AWSOpsWorksCreateInstanceCommand(val stackId: String, val layerIds: List<String>, val instanceType: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.CreateInstanceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.createInstance(build())
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


fun AWSOpsWorksFunctions.createLayer(stackId: String, type: LayerType, name: String, shortname: String, init: AWSOpsWorksCreateLayerCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCreateLayerCommand(stackId, type, name, shortname).apply(init))
}

@Generated
class AWSOpsWorksCreateLayerCommand(val stackId: String, val type: LayerType, val name: String, val shortname: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.CreateLayerRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.createLayer(build())
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


fun AWSOpsWorksFunctions.createStack(name: String, region: String, serviceRoleArn: String, defaultInstanceProfileArn: String, init: AWSOpsWorksCreateStackCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCreateStackCommand(name, region, serviceRoleArn, defaultInstanceProfileArn).apply(init))
}

@Generated
class AWSOpsWorksCreateStackCommand(val name: String, val region: String, val serviceRoleArn: String, val defaultInstanceProfileArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.CreateStackRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.createStack(build())
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


fun AWSOpsWorksFunctions.createUserProfile(iamUserArn: String, init: AWSOpsWorksCreateUserProfileCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksCreateUserProfileCommand(iamUserArn).apply(init))
}

@Generated
class AWSOpsWorksCreateUserProfileCommand(val iamUserArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.CreateUserProfileRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.createUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks create-user-profile")
				.argument("iam-user-arn", iamUserArn)
				.argument("ssh-username", sshUsername)
				.argument("ssh-public-key", sshPublicKey)
				.option("allow-self-management", allowSelfManagement ?: false)
	}

}


fun AWSOpsWorksFunctions.deleteApp(appId: String, init: AWSOpsWorksDeleteAppCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDeleteAppCommand(appId).apply(init))
}

@Generated
class AWSOpsWorksDeleteAppCommand(val appId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeleteAppRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DeleteAppRequest {
		val input = com.amazonaws.services.opsworks.model.DeleteAppRequest()
		input.setAppId(this.appId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.deleteApp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks delete-app")
				.argument("app-id", appId)
	}

}


fun AWSOpsWorksFunctions.deleteInstance(instanceId: String, init: AWSOpsWorksDeleteInstanceCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDeleteInstanceCommand(instanceId).apply(init))
}

@Generated
class AWSOpsWorksDeleteInstanceCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeleteInstanceRequest> {

	var deleteElasticIp: Boolean? = false
	var deleteVolumes: Boolean? = false

	override fun build(): com.amazonaws.services.opsworks.model.DeleteInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.DeleteInstanceRequest()
		input.setInstanceId(this.instanceId)
		input.setDeleteElasticIp(this.deleteElasticIp)
		input.setDeleteVolumes(this.deleteVolumes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.deleteInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks delete-instance")
				.argument("instance-id", instanceId)
				.option("delete-elastic-ip", deleteElasticIp ?: false)
				.option("delete-volumes", deleteVolumes ?: false)
	}

}


fun AWSOpsWorksFunctions.deleteLayer(layerId: String, init: AWSOpsWorksDeleteLayerCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDeleteLayerCommand(layerId).apply(init))
}

@Generated
class AWSOpsWorksDeleteLayerCommand(val layerId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeleteLayerRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DeleteLayerRequest {
		val input = com.amazonaws.services.opsworks.model.DeleteLayerRequest()
		input.setLayerId(this.layerId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.deleteLayer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks delete-layer")
				.argument("layer-id", layerId)
	}

}


fun AWSOpsWorksFunctions.deleteStack(stackId: String, init: AWSOpsWorksDeleteStackCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDeleteStackCommand(stackId).apply(init))
}

@Generated
class AWSOpsWorksDeleteStackCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeleteStackRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DeleteStackRequest {
		val input = com.amazonaws.services.opsworks.model.DeleteStackRequest()
		input.setStackId(this.stackId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.deleteStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks delete-stack")
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.deleteUserProfile(iamUserArn: String, init: AWSOpsWorksDeleteUserProfileCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDeleteUserProfileCommand(iamUserArn).apply(init))
}

@Generated
class AWSOpsWorksDeleteUserProfileCommand(val iamUserArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeleteUserProfileRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DeleteUserProfileRequest {
		val input = com.amazonaws.services.opsworks.model.DeleteUserProfileRequest()
		input.setIamUserArn(this.iamUserArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.deleteUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks delete-user-profile")
				.argument("iam-user-arn", iamUserArn)
	}

}


fun AWSOpsWorksFunctions.deregisterEcsCluster(ecsClusterArn: String, init: AWSOpsWorksDeregisterEcsClusterCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDeregisterEcsClusterCommand(ecsClusterArn).apply(init))
}

@Generated
class AWSOpsWorksDeregisterEcsClusterCommand(val ecsClusterArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest {
		val input = com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest()
		input.setEcsClusterArn(this.ecsClusterArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.deregisterEcsCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks deregister-ecs-cluster")
				.argument("ecs-cluster-arn", ecsClusterArn)
	}

}


fun AWSOpsWorksFunctions.deregisterElasticIp(elasticIp: String, init: AWSOpsWorksDeregisterElasticIpCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDeregisterElasticIpCommand(elasticIp).apply(init))
}

@Generated
class AWSOpsWorksDeregisterElasticIpCommand(val elasticIp: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest {
		val input = com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest()
		input.setElasticIp(this.elasticIp)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.deregisterElasticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks deregister-elastic-ip")
				.argument("elastic-ip", elasticIp)
	}

}


fun AWSOpsWorksFunctions.deregisterInstance(instanceId: String, init: AWSOpsWorksDeregisterInstanceCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDeregisterInstanceCommand(instanceId).apply(init))
}

@Generated
class AWSOpsWorksDeregisterInstanceCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeregisterInstanceRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DeregisterInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.DeregisterInstanceRequest()
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.deregisterInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks deregister-instance")
				.argument("instance-id", instanceId)
	}

}


fun AWSOpsWorksFunctions.deregisterRdsDbInstance(rdsDbInstanceArn: String, init: AWSOpsWorksDeregisterRdsDbInstanceCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDeregisterRdsDbInstanceCommand(rdsDbInstanceArn).apply(init))
}

@Generated
class AWSOpsWorksDeregisterRdsDbInstanceCommand(val rdsDbInstanceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest()
		input.setRdsDbInstanceArn(this.rdsDbInstanceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.deregisterRdsDbInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks deregister-rds-db-instance")
				.argument("rds-db-instance-arn", rdsDbInstanceArn)
	}

}


fun AWSOpsWorksFunctions.deregisterVolume(volumeId: String, init: AWSOpsWorksDeregisterVolumeCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDeregisterVolumeCommand(volumeId).apply(init))
}

@Generated
class AWSOpsWorksDeregisterVolumeCommand(val volumeId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DeregisterVolumeRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DeregisterVolumeRequest {
		val input = com.amazonaws.services.opsworks.model.DeregisterVolumeRequest()
		input.setVolumeId(this.volumeId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.deregisterVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks deregister-volume")
				.argument("volume-id", volumeId)
	}

}


fun AWSOpsWorksFunctions.describeAgentVersions(init: AWSOpsWorksDescribeAgentVersionsCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeAgentVersionsCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribeAgentVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest> {

	var stackId: String? = null
	var configurationManager: com.amazonaws.services.opsworks.model.StackConfigurationManager? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest()
		input.setStackId(this.stackId)
		input.setConfigurationManager(this.configurationManager)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeAgentVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-agent-versions")
				.argument("stack-id", stackId)
				.argument("configuration-manager", configurationManager?.toString())
	}

}


fun AWSOpsWorksFunctions.describeApps(init: AWSOpsWorksDescribeAppsCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeAppsCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribeAppsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeAppsRequest> {

	var stackId: String? = null
	var appIds: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeAppsRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeAppsRequest()
		input.setStackId(this.stackId)
		input.setAppIds(this.appIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeApps(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-apps")
				.argument("stack-id", stackId)
				.argument("app-ids", appIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeCommands(init: AWSOpsWorksDescribeCommandsCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeCommandsCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribeCommandsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeCommandsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeCommands(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-commands")
				.argument("deployment-id", deploymentId)
				.argument("instance-id", instanceId)
				.argument("command-ids", commandIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeDeployments(init: AWSOpsWorksDescribeDeploymentsCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeDeploymentsCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribeDeploymentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeDeployments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-deployments")
				.argument("stack-id", stackId)
				.argument("app-id", appId)
				.argument("deployment-ids", deploymentIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeEcsClusters(init: AWSOpsWorksDescribeEcsClustersCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeEcsClustersCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribeEcsClustersCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeEcsClustersRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeEcsClusters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-ecs-clusters")
				.argument("ecs-cluster-arns", ecsClusterArns?.toString())
				.argument("stack-id", stackId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSOpsWorksFunctions.describeElasticIps(init: AWSOpsWorksDescribeElasticIpsCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeElasticIpsCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribeElasticIpsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeElasticIpsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeElasticIps(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-elastic-ips")
				.argument("instance-id", instanceId)
				.argument("stack-id", stackId)
				.argument("ips", ips?.toString())
	}

}


fun AWSOpsWorksFunctions.describeElasticLoadBalancers(init: AWSOpsWorksDescribeElasticLoadBalancersCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeElasticLoadBalancersCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribeElasticLoadBalancersCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest> {

	var stackId: String? = null
	var layerIds: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest()
		input.setStackId(this.stackId)
		input.setLayerIds(this.layerIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeElasticLoadBalancers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-elastic-load-balancers")
				.argument("stack-id", stackId)
				.argument("layer-ids", layerIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeInstances(init: AWSOpsWorksDescribeInstancesCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeInstancesCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribeInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeInstancesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-instances")
				.argument("stack-id", stackId)
				.argument("layer-id", layerId)
				.argument("instance-ids", instanceIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeLayers(init: AWSOpsWorksDescribeLayersCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeLayersCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribeLayersCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeLayersRequest> {

	var stackId: String? = null
	var layerIds: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeLayersRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeLayersRequest()
		input.setStackId(this.stackId)
		input.setLayerIds(this.layerIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeLayers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-layers")
				.argument("stack-id", stackId)
				.argument("layer-ids", layerIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeLoadBasedAutoScaling(layerIds: List<String>, init: AWSOpsWorksDescribeLoadBasedAutoScalingCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeLoadBasedAutoScalingCommand(layerIds).apply(init))
}

@Generated
class AWSOpsWorksDescribeLoadBasedAutoScalingCommand(val layerIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest()
		input.setLayerIds(this.layerIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeLoadBasedAutoScaling(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-load-based-auto-scaling")
				.argument("layer-ids", layerIds.toString())
	}

}


fun AWSOpsWorksFunctions.describeMyUserProfile(init: AWSOpsWorksDescribeMyUserProfileCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeMyUserProfileCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribeMyUserProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeMyUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-my-user-profile")

	}

}


fun AWSOpsWorksFunctions.describeOperatingSystems(init: AWSOpsWorksDescribeOperatingSystemsCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeOperatingSystemsCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribeOperatingSystemsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeOperatingSystems(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-operating-systems")

	}

}


fun AWSOpsWorksFunctions.describePermissions(init: AWSOpsWorksDescribePermissionsCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribePermissionsCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribePermissionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribePermissionsRequest> {

	var iamUserArn: String? = null
	var stackId: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribePermissionsRequest {
		val input = com.amazonaws.services.opsworks.model.DescribePermissionsRequest()
		input.setIamUserArn(this.iamUserArn)
		input.setStackId(this.stackId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describePermissions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-permissions")
				.argument("iam-user-arn", iamUserArn)
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.describeRaidArrays(init: AWSOpsWorksDescribeRaidArraysCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeRaidArraysCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribeRaidArraysCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeRaidArraysRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeRaidArrays(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-raid-arrays")
				.argument("instance-id", instanceId)
				.argument("stack-id", stackId)
				.argument("raid-array-ids", raidArrayIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeRdsDbInstances(stackId: String, init: AWSOpsWorksDescribeRdsDbInstancesCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeRdsDbInstancesCommand(stackId).apply(init))
}

@Generated
class AWSOpsWorksDescribeRdsDbInstancesCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest> {

	var rdsDbInstanceArns: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest()
		input.setStackId(this.stackId)
		input.setRdsDbInstanceArns(this.rdsDbInstanceArns)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeRdsDbInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-rds-db-instances")
				.argument("stack-id", stackId)
				.argument("rds-db-instance-arns", rdsDbInstanceArns?.toString())
	}

}


fun AWSOpsWorksFunctions.describeServiceErrors(init: AWSOpsWorksDescribeServiceErrorsCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeServiceErrorsCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribeServiceErrorsCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeServiceErrorsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeServiceErrors(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-service-errors")
				.argument("stack-id", stackId)
				.argument("instance-id", instanceId)
				.argument("service-error-ids", serviceErrorIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeStackProvisioningParameters(stackId: String, init: AWSOpsWorksDescribeStackProvisioningParametersCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeStackProvisioningParametersCommand(stackId).apply(init))
}

@Generated
class AWSOpsWorksDescribeStackProvisioningParametersCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest()
		input.setStackId(this.stackId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeStackProvisioningParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-stack-provisioning-parameters")
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.describeStackSummary(stackId: String, init: AWSOpsWorksDescribeStackSummaryCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeStackSummaryCommand(stackId).apply(init))
}

@Generated
class AWSOpsWorksDescribeStackSummaryCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest()
		input.setStackId(this.stackId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeStackSummary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-stack-summary")
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.describeStacks(init: AWSOpsWorksDescribeStacksCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeStacksCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribeStacksCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeStacksRequest> {

	var stackIds: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeStacksRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeStacksRequest()
		input.setStackIds(this.stackIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeStacks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-stacks")
				.argument("stack-ids", stackIds?.toString())
	}

}


fun AWSOpsWorksFunctions.describeTimeBasedAutoScaling(instanceIds: List<String>, init: AWSOpsWorksDescribeTimeBasedAutoScalingCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeTimeBasedAutoScalingCommand(instanceIds).apply(init))
}

@Generated
class AWSOpsWorksDescribeTimeBasedAutoScalingCommand(val instanceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest()
		input.setInstanceIds(this.instanceIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeTimeBasedAutoScaling(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-time-based-auto-scaling")
				.argument("instance-ids", instanceIds.toString())
	}

}


fun AWSOpsWorksFunctions.describeUserProfiles(init: AWSOpsWorksDescribeUserProfilesCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeUserProfilesCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribeUserProfilesCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest> {

	var iamUserArns: List<String>? = null

	override fun build(): com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest {
		val input = com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest()
		input.setIamUserArns(this.iamUserArns)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeUserProfiles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-user-profiles")
				.argument("iam-user-arns", iamUserArns?.toString())
	}

}


fun AWSOpsWorksFunctions.describeVolumes(init: AWSOpsWorksDescribeVolumesCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDescribeVolumesCommand().apply(init))
}

@Generated
class AWSOpsWorksDescribeVolumesCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DescribeVolumesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.describeVolumes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks describe-volumes")
				.argument("instance-id", instanceId)
				.argument("stack-id", stackId)
				.argument("raid-array-id", raidArrayId)
				.argument("volume-ids", volumeIds?.toString())
	}

}


fun AWSOpsWorksFunctions.detachElasticLoadBalancer(elasticLoadBalancerName: String, layerId: String, init: AWSOpsWorksDetachElasticLoadBalancerCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDetachElasticLoadBalancerCommand(elasticLoadBalancerName, layerId).apply(init))
}

@Generated
class AWSOpsWorksDetachElasticLoadBalancerCommand(val elasticLoadBalancerName: String, val layerId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest {
		val input = com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest()
		input.setElasticLoadBalancerName(this.elasticLoadBalancerName)
		input.setLayerId(this.layerId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.detachElasticLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks detach-elastic-load-balancer")
				.argument("elastic-load-balancer-name", elasticLoadBalancerName)
				.argument("layer-id", layerId)
	}

}


fun AWSOpsWorksFunctions.disassociateElasticIp(elasticIp: String, init: AWSOpsWorksDisassociateElasticIpCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksDisassociateElasticIpCommand(elasticIp).apply(init))
}

@Generated
class AWSOpsWorksDisassociateElasticIpCommand(val elasticIp: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest {
		val input = com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest()
		input.setElasticIp(this.elasticIp)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.disassociateElasticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks disassociate-elastic-ip")
				.argument("elastic-ip", elasticIp)
	}

}


fun AWSOpsWorksFunctions.getHostnameSuggestion(layerId: String, init: AWSOpsWorksGetHostnameSuggestionCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksGetHostnameSuggestionCommand(layerId).apply(init))
}

@Generated
class AWSOpsWorksGetHostnameSuggestionCommand(val layerId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest {
		val input = com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest()
		input.setLayerId(this.layerId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.getHostnameSuggestion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks get-hostname-suggestion")
				.argument("layer-id", layerId)
	}

}


fun AWSOpsWorksFunctions.grantAccess(instanceId: String, init: AWSOpsWorksGrantAccessCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksGrantAccessCommand(instanceId).apply(init))
}

@Generated
class AWSOpsWorksGrantAccessCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.GrantAccessRequest> {

	var validForInMinutes: Int? = 0

	override fun build(): com.amazonaws.services.opsworks.model.GrantAccessRequest {
		val input = com.amazonaws.services.opsworks.model.GrantAccessRequest()
		input.setInstanceId(this.instanceId)
		input.setValidForInMinutes(this.validForInMinutes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.grantAccess(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks grant-access")
				.argument("instance-id", instanceId)
				.argument("valid-for-in-minutes", validForInMinutes?.toString())
	}

}


fun AWSOpsWorksFunctions.listTags(resourceArn: String, init: AWSOpsWorksListTagsCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksListTagsCommand(resourceArn).apply(init))
}

@Generated
class AWSOpsWorksListTagsCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.ListTagsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.ListTagsRequest {
		val input = com.amazonaws.services.opsworks.model.ListTagsRequest()
		input.setResourceArn(this.resourceArn)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.listTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks list-tags")
				.argument("resource-arn", resourceArn)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSOpsWorksFunctions.rebootInstance(instanceId: String, init: AWSOpsWorksRebootInstanceCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksRebootInstanceCommand(instanceId).apply(init))
}

@Generated
class AWSOpsWorksRebootInstanceCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.RebootInstanceRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.RebootInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.RebootInstanceRequest()
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.rebootInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks reboot-instance")
				.argument("instance-id", instanceId)
	}

}


fun AWSOpsWorksFunctions.registerEcsCluster(ecsClusterArn: String, stackId: String, init: AWSOpsWorksRegisterEcsClusterCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksRegisterEcsClusterCommand(ecsClusterArn, stackId).apply(init))
}

@Generated
class AWSOpsWorksRegisterEcsClusterCommand(val ecsClusterArn: String, val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest {
		val input = com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest()
		input.setEcsClusterArn(this.ecsClusterArn)
		input.setStackId(this.stackId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.registerEcsCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks register-ecs-cluster")
				.argument("ecs-cluster-arn", ecsClusterArn)
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.registerElasticIp(elasticIp: String, stackId: String, init: AWSOpsWorksRegisterElasticIpCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksRegisterElasticIpCommand(elasticIp, stackId).apply(init))
}

@Generated
class AWSOpsWorksRegisterElasticIpCommand(val elasticIp: String, val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.RegisterElasticIpRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.RegisterElasticIpRequest {
		val input = com.amazonaws.services.opsworks.model.RegisterElasticIpRequest()
		input.setElasticIp(this.elasticIp)
		input.setStackId(this.stackId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.registerElasticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks register-elastic-ip")
				.argument("elastic-ip", elasticIp)
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.registerInstance(stackId: String, init: AWSOpsWorksRegisterInstanceCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksRegisterInstanceCommand(stackId).apply(init))
}

@Generated
class AWSOpsWorksRegisterInstanceCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.RegisterInstanceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.registerInstance(build())
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


fun AWSOpsWorksFunctions.registerRdsDbInstance(stackId: String, rdsDbInstanceArn: String, dbUser: String, dbPassword: String, init: AWSOpsWorksRegisterRdsDbInstanceCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksRegisterRdsDbInstanceCommand(stackId, rdsDbInstanceArn, dbUser, dbPassword).apply(init))
}

@Generated
class AWSOpsWorksRegisterRdsDbInstanceCommand(val stackId: String, val rdsDbInstanceArn: String, val dbUser: String, val dbPassword: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest()
		input.setStackId(this.stackId)
		input.setRdsDbInstanceArn(this.rdsDbInstanceArn)
		input.setDbUser(this.dbUser)
		input.setDbPassword(this.dbPassword)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.registerRdsDbInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks register-rds-db-instance")
				.argument("stack-id", stackId)
				.argument("rds-db-instance-arn", rdsDbInstanceArn)
				.argument("db-user", dbUser)
				.argument("db-password", dbPassword)
	}

}


fun AWSOpsWorksFunctions.registerVolume(stackId: String, init: AWSOpsWorksRegisterVolumeCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksRegisterVolumeCommand(stackId).apply(init))
}

@Generated
class AWSOpsWorksRegisterVolumeCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.RegisterVolumeRequest> {

	var ec2VolumeId: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.RegisterVolumeRequest {
		val input = com.amazonaws.services.opsworks.model.RegisterVolumeRequest()
		input.setEc2VolumeId(this.ec2VolumeId)
		input.setStackId(this.stackId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.registerVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks register-volume")
				.argument("ec2-volume-id", ec2VolumeId)
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.setLoadBasedAutoScaling(layerId: String, init: AWSOpsWorksSetLoadBasedAutoScalingCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksSetLoadBasedAutoScalingCommand(layerId).apply(init))
}

@Generated
class AWSOpsWorksSetLoadBasedAutoScalingCommand(val layerId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.setLoadBasedAutoScaling(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks set-load-based-auto-scaling")
				.argument("layer-id", layerId)
				.option("enable", enable ?: false)
				.argument("up-scaling", upScaling?.toString())
				.argument("down-scaling", downScaling?.toString())
	}

}


fun AWSOpsWorksFunctions.setPermission(stackId: String, iamUserArn: String, init: AWSOpsWorksSetPermissionCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksSetPermissionCommand(stackId, iamUserArn).apply(init))
}

@Generated
class AWSOpsWorksSetPermissionCommand(val stackId: String, val iamUserArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.SetPermissionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.setPermission(build())
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


fun AWSOpsWorksFunctions.setTimeBasedAutoScaling(instanceId: String, init: AWSOpsWorksSetTimeBasedAutoScalingCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksSetTimeBasedAutoScalingCommand(instanceId).apply(init))
}

@Generated
class AWSOpsWorksSetTimeBasedAutoScalingCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest> {

	var autoScalingSchedule: com.amazonaws.services.opsworks.model.WeeklyAutoScalingSchedule? = null

	override fun build(): com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest {
		val input = com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest()
		input.setInstanceId(this.instanceId)
		input.setAutoScalingSchedule(this.autoScalingSchedule)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.setTimeBasedAutoScaling(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks set-time-based-auto-scaling")
				.argument("instance-id", instanceId)
				.argument("auto-scaling-schedule", autoScalingSchedule?.toString())
	}

}


fun AWSOpsWorksFunctions.startInstance(instanceId: String, init: AWSOpsWorksStartInstanceCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksStartInstanceCommand(instanceId).apply(init))
}

@Generated
class AWSOpsWorksStartInstanceCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.StartInstanceRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.StartInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.StartInstanceRequest()
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.startInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks start-instance")
				.argument("instance-id", instanceId)
	}

}


fun AWSOpsWorksFunctions.startStack(stackId: String, init: AWSOpsWorksStartStackCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksStartStackCommand(stackId).apply(init))
}

@Generated
class AWSOpsWorksStartStackCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.StartStackRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.StartStackRequest {
		val input = com.amazonaws.services.opsworks.model.StartStackRequest()
		input.setStackId(this.stackId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.startStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks start-stack")
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.stopInstance(instanceId: String, init: AWSOpsWorksStopInstanceCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksStopInstanceCommand(instanceId).apply(init))
}

@Generated
class AWSOpsWorksStopInstanceCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.StopInstanceRequest> {

	var force: Boolean? = false

	override fun build(): com.amazonaws.services.opsworks.model.StopInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.StopInstanceRequest()
		input.setInstanceId(this.instanceId)
		input.setForce(this.force)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.stopInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks stop-instance")
				.argument("instance-id", instanceId)
				.option("force", force ?: false)
	}

}


fun AWSOpsWorksFunctions.stopStack(stackId: String, init: AWSOpsWorksStopStackCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksStopStackCommand(stackId).apply(init))
}

@Generated
class AWSOpsWorksStopStackCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.StopStackRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.StopStackRequest {
		val input = com.amazonaws.services.opsworks.model.StopStackRequest()
		input.setStackId(this.stackId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.stopStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks stop-stack")
				.argument("stack-id", stackId)
	}

}


fun AWSOpsWorksFunctions.tagResource(resourceArn: String, tags: Map<String, String>, init: AWSOpsWorksTagResourceCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksTagResourceCommand(resourceArn, tags).apply(init))
}

@Generated
class AWSOpsWorksTagResourceCommand(val resourceArn: String, val tags: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.TagResourceRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.TagResourceRequest {
		val input = com.amazonaws.services.opsworks.model.TagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks tag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags.toString())
	}

}


fun AWSOpsWorksFunctions.unassignInstance(instanceId: String, init: AWSOpsWorksUnassignInstanceCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksUnassignInstanceCommand(instanceId).apply(init))
}

@Generated
class AWSOpsWorksUnassignInstanceCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UnassignInstanceRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.UnassignInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.UnassignInstanceRequest()
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.unassignInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks unassign-instance")
				.argument("instance-id", instanceId)
	}

}


fun AWSOpsWorksFunctions.unassignVolume(volumeId: String, init: AWSOpsWorksUnassignVolumeCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksUnassignVolumeCommand(volumeId).apply(init))
}

@Generated
class AWSOpsWorksUnassignVolumeCommand(val volumeId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UnassignVolumeRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.UnassignVolumeRequest {
		val input = com.amazonaws.services.opsworks.model.UnassignVolumeRequest()
		input.setVolumeId(this.volumeId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.unassignVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks unassign-volume")
				.argument("volume-id", volumeId)
	}

}


fun AWSOpsWorksFunctions.untagResource(resourceArn: String, tagKeys: List<String>, init: AWSOpsWorksUntagResourceCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksUntagResourceCommand(resourceArn, tagKeys).apply(init))
}

@Generated
class AWSOpsWorksUntagResourceCommand(val resourceArn: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UntagResourceRequest> {



	override fun build(): com.amazonaws.services.opsworks.model.UntagResourceRequest {
		val input = com.amazonaws.services.opsworks.model.UntagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks untag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSOpsWorksFunctions.updateApp(appId: String, init: AWSOpsWorksUpdateAppCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksUpdateAppCommand(appId).apply(init))
}

@Generated
class AWSOpsWorksUpdateAppCommand(val appId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateAppRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.updateApp(build())
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


fun AWSOpsWorksFunctions.updateElasticIp(elasticIp: String, init: AWSOpsWorksUpdateElasticIpCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksUpdateElasticIpCommand(elasticIp).apply(init))
}

@Generated
class AWSOpsWorksUpdateElasticIpCommand(val elasticIp: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateElasticIpRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.UpdateElasticIpRequest {
		val input = com.amazonaws.services.opsworks.model.UpdateElasticIpRequest()
		input.setElasticIp(this.elasticIp)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.updateElasticIp(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks update-elastic-ip")
				.argument("elastic-ip", elasticIp)
				.argument("name", name)
	}

}


fun AWSOpsWorksFunctions.updateInstance(instanceId: String, init: AWSOpsWorksUpdateInstanceCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksUpdateInstanceCommand(instanceId).apply(init))
}

@Generated
class AWSOpsWorksUpdateInstanceCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateInstanceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.updateInstance(build())
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


fun AWSOpsWorksFunctions.updateLayer(layerId: String, init: AWSOpsWorksUpdateLayerCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksUpdateLayerCommand(layerId).apply(init))
}

@Generated
class AWSOpsWorksUpdateLayerCommand(val layerId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateLayerRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.updateLayer(build())
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


fun AWSOpsWorksFunctions.updateMyUserProfile(init: AWSOpsWorksUpdateMyUserProfileCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksUpdateMyUserProfileCommand().apply(init))
}

@Generated
class AWSOpsWorksUpdateMyUserProfileCommand() : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest> {

	var sshPublicKey: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest {
		val input = com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest()
		input.setSshPublicKey(this.sshPublicKey)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.updateMyUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks update-my-user-profile")
				.argument("ssh-public-key", sshPublicKey)
	}

}


fun AWSOpsWorksFunctions.updateRdsDbInstance(rdsDbInstanceArn: String, init: AWSOpsWorksUpdateRdsDbInstanceCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksUpdateRdsDbInstanceCommand(rdsDbInstanceArn).apply(init))
}

@Generated
class AWSOpsWorksUpdateRdsDbInstanceCommand(val rdsDbInstanceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest> {

	var dbUser: String? = null
	var dbPassword: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest {
		val input = com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest()
		input.setRdsDbInstanceArn(this.rdsDbInstanceArn)
		input.setDbUser(this.dbUser)
		input.setDbPassword(this.dbPassword)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.updateRdsDbInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks update-rds-db-instance")
				.argument("rds-db-instance-arn", rdsDbInstanceArn)
				.argument("db-user", dbUser)
				.argument("db-password", dbPassword)
	}

}


fun AWSOpsWorksFunctions.updateStack(stackId: String, init: AWSOpsWorksUpdateStackCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksUpdateStackCommand(stackId).apply(init))
}

@Generated
class AWSOpsWorksUpdateStackCommand(val stackId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateStackRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.updateStack(build())
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


fun AWSOpsWorksFunctions.updateUserProfile(iamUserArn: String, init: AWSOpsWorksUpdateUserProfileCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksUpdateUserProfileCommand(iamUserArn).apply(init))
}

@Generated
class AWSOpsWorksUpdateUserProfileCommand(val iamUserArn: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateUserProfileRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.updateUserProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks update-user-profile")
				.argument("iam-user-arn", iamUserArn)
				.argument("ssh-username", sshUsername)
				.argument("ssh-public-key", sshPublicKey)
				.option("allow-self-management", allowSelfManagement ?: false)
	}

}


fun AWSOpsWorksFunctions.updateVolume(volumeId: String, init: AWSOpsWorksUpdateVolumeCommand.() -> Unit) {
	this.block.declare(AWSOpsWorksUpdateVolumeCommand(volumeId).apply(init))
}

@Generated
class AWSOpsWorksUpdateVolumeCommand(val volumeId: String) : AmazonWebServiceCommand<com.amazonaws.services.opsworks.model.UpdateVolumeRequest> {

	var name: String? = null
	var mountPoint: String? = null

	override fun build(): com.amazonaws.services.opsworks.model.UpdateVolumeRequest {
		val input = com.amazonaws.services.opsworks.model.UpdateVolumeRequest()
		input.setVolumeId(this.volumeId)
		input.setName(this.name)
		input.setMountPoint(this.mountPoint)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.opsworks.updateVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws opsworks update-volume")
				.argument("volume-id", volumeId)
				.argument("name", name)
				.argument("mount-point", mountPoint)
	}

}
