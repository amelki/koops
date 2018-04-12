
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.autoscaling.*
import com.amazonaws.services.autoscaling.model.*

var codingue.koops.core.Environment.autoscaling: AmazonAutoScaling
	get() {
		var service = this.capabilities["aws-autoscaling"]
		if (service == null) {
			service = AmazonAutoScalingClientBuilder.standard().build()
			this.capabilities["aws-autoscaling"] = service
		}
		return service as AmazonAutoScaling
	}
	set(autoscaling) {
		this.capabilities["aws-autoscaling"] = autoscaling
	}

@Generated
class AmazonAutoScalingFunctions(val block: Block)

infix fun <T> AwsContinuation.autoscaling(init: AmazonAutoScalingFunctions.() -> T): T {
	return AmazonAutoScalingFunctions(shell).run(init)
}

			

fun AmazonAutoScalingFunctions.attachInstances(autoScalingGroupName: String, init: AmazonAutoScalingAttachInstancesCommand.() -> Unit): com.amazonaws.services.autoscaling.model.AttachInstancesResult {
	return this.block.declare(AmazonAutoScalingAttachInstancesCommand(autoScalingGroupName).apply(init)) as com.amazonaws.services.autoscaling.model.AttachInstancesResult
}

@Generated
class AmazonAutoScalingAttachInstancesCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.AttachInstancesRequest, com.amazonaws.services.autoscaling.model.AttachInstancesResult> {

	var instanceIds: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.AttachInstancesRequest {
		val input = com.amazonaws.services.autoscaling.model.AttachInstancesRequest()
		input.setInstanceIds(this.instanceIds)
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.AttachInstancesResult {
	  return com.amazonaws.services.autoscaling.model.AttachInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.AttachInstancesResult {
		return environment.autoscaling.attachInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling attach-instances")
				.argument("instance-ids", instanceIds?.toString())
				.argument("auto-scaling-group-name", autoScalingGroupName)
	}

}


fun AmazonAutoScalingFunctions.attachLoadBalancerTargetGroups(autoScalingGroupName: String, targetGroupARNs: List<String>, init: AmazonAutoScalingAttachLoadBalancerTargetGroupsCommand.() -> Unit): com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsResult {
	return this.block.declare(AmazonAutoScalingAttachLoadBalancerTargetGroupsCommand(autoScalingGroupName, targetGroupARNs).apply(init)) as com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsResult
}

@Generated
class AmazonAutoScalingAttachLoadBalancerTargetGroupsCommand(val autoScalingGroupName: String, val targetGroupARNs: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsRequest, com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsRequest {
		val input = com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setTargetGroupARNs(this.targetGroupARNs)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsResult {
	  return com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsResult {
		return environment.autoscaling.attachLoadBalancerTargetGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling attach-load-balancer-target-groups")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("target-group-arns", targetGroupARNs.toString())
	}

}


fun AmazonAutoScalingFunctions.attachLoadBalancers(autoScalingGroupName: String, loadBalancerNames: List<String>, init: AmazonAutoScalingAttachLoadBalancersCommand.() -> Unit): com.amazonaws.services.autoscaling.model.AttachLoadBalancersResult {
	return this.block.declare(AmazonAutoScalingAttachLoadBalancersCommand(autoScalingGroupName, loadBalancerNames).apply(init)) as com.amazonaws.services.autoscaling.model.AttachLoadBalancersResult
}

@Generated
class AmazonAutoScalingAttachLoadBalancersCommand(val autoScalingGroupName: String, val loadBalancerNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.AttachLoadBalancersRequest, com.amazonaws.services.autoscaling.model.AttachLoadBalancersResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.AttachLoadBalancersRequest {
		val input = com.amazonaws.services.autoscaling.model.AttachLoadBalancersRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setLoadBalancerNames(this.loadBalancerNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.AttachLoadBalancersResult {
	  return com.amazonaws.services.autoscaling.model.AttachLoadBalancersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.AttachLoadBalancersResult {
		return environment.autoscaling.attachLoadBalancers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling attach-load-balancers")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("load-balancer-names", loadBalancerNames.toString())
	}

}


fun AmazonAutoScalingFunctions.completeLifecycleAction(lifecycleHookName: String, autoScalingGroupName: String, lifecycleActionResult: String, init: AmazonAutoScalingCompleteLifecycleActionCommand.() -> Unit): com.amazonaws.services.autoscaling.model.CompleteLifecycleActionResult {
	return this.block.declare(AmazonAutoScalingCompleteLifecycleActionCommand(lifecycleHookName, autoScalingGroupName, lifecycleActionResult).apply(init)) as com.amazonaws.services.autoscaling.model.CompleteLifecycleActionResult
}

@Generated
class AmazonAutoScalingCompleteLifecycleActionCommand(val lifecycleHookName: String, val autoScalingGroupName: String, val lifecycleActionResult: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.CompleteLifecycleActionRequest, com.amazonaws.services.autoscaling.model.CompleteLifecycleActionResult> {

	var lifecycleActionToken: String? = null
	var instanceId: String? = null

	override fun build(): com.amazonaws.services.autoscaling.model.CompleteLifecycleActionRequest {
		val input = com.amazonaws.services.autoscaling.model.CompleteLifecycleActionRequest()
		input.setLifecycleHookName(this.lifecycleHookName)
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setLifecycleActionToken(this.lifecycleActionToken)
		input.setLifecycleActionResult(this.lifecycleActionResult)
		input.setInstanceId(this.instanceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.CompleteLifecycleActionResult {
	  return com.amazonaws.services.autoscaling.model.CompleteLifecycleActionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.CompleteLifecycleActionResult {
		return environment.autoscaling.completeLifecycleAction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling complete-lifecycle-action")
				.argument("lifecycle-hook-name", lifecycleHookName)
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("lifecycle-action-token", lifecycleActionToken)
				.argument("lifecycle-action-result", lifecycleActionResult)
				.argument("instance-id", instanceId)
	}

}


fun AmazonAutoScalingFunctions.createAutoScalingGroup(autoScalingGroupName: String, minSize: Int, maxSize: Int, init: AmazonAutoScalingCreateAutoScalingGroupCommand.() -> Unit): com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupResult {
	return this.block.declare(AmazonAutoScalingCreateAutoScalingGroupCommand(autoScalingGroupName, minSize, maxSize).apply(init)) as com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupResult
}

@Generated
class AmazonAutoScalingCreateAutoScalingGroupCommand(val autoScalingGroupName: String, val minSize: Int, val maxSize: Int) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupRequest, com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupResult> {

	var launchConfigurationName: String? = null
	var launchTemplate: com.amazonaws.services.autoscaling.model.LaunchTemplateSpecification? = null
	var instanceId: String? = null
	var desiredCapacity: Int? = 0
	var defaultCooldown: Int? = 0
	var availabilityZones: List<String>? = null
	var loadBalancerNames: List<String>? = null
	var targetGroupARNs: List<String>? = null
	var healthCheckType: String? = null
	var healthCheckGracePeriod: Int? = 0
	var placementGroup: String? = null
	var vPCZoneIdentifier: String? = null
	var terminationPolicies: List<String>? = null
	var newInstancesProtectedFromScaleIn: Boolean? = false
	var lifecycleHookSpecificationList: List<com.amazonaws.services.autoscaling.model.LifecycleHookSpecification>? = null
	var tags: List<com.amazonaws.services.autoscaling.model.Tag>? = null
	var serviceLinkedRoleARN: String? = null

	override fun build(): com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupRequest {
		val input = com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setLaunchConfigurationName(this.launchConfigurationName)
		input.setLaunchTemplate(this.launchTemplate)
		input.setInstanceId(this.instanceId)
		input.setMinSize(this.minSize)
		input.setMaxSize(this.maxSize)
		input.setDesiredCapacity(this.desiredCapacity)
		input.setDefaultCooldown(this.defaultCooldown)
		input.setAvailabilityZones(this.availabilityZones)
		input.setLoadBalancerNames(this.loadBalancerNames)
		input.setTargetGroupARNs(this.targetGroupARNs)
		input.setHealthCheckType(this.healthCheckType)
		input.setHealthCheckGracePeriod(this.healthCheckGracePeriod)
		input.setPlacementGroup(this.placementGroup)
		input.setVPCZoneIdentifier(this.vPCZoneIdentifier)
		input.setTerminationPolicies(this.terminationPolicies)
		input.setNewInstancesProtectedFromScaleIn(this.newInstancesProtectedFromScaleIn)
		input.setLifecycleHookSpecificationList(this.lifecycleHookSpecificationList)
		input.setTags(this.tags)
		input.setServiceLinkedRoleARN(this.serviceLinkedRoleARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupResult {
	  return com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupResult {
		return environment.autoscaling.createAutoScalingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling create-auto-scaling-group")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("launch-configuration-name", launchConfigurationName)
				.argument("launch-template", launchTemplate?.toString())
				.argument("instance-id", instanceId)
				.argument("min-size", minSize.toString())
				.argument("max-size", maxSize.toString())
				.argument("desired-capacity", desiredCapacity?.toString())
				.argument("default-cooldown", defaultCooldown?.toString())
				.argument("availability-zones", availabilityZones?.toString())
				.argument("load-balancer-names", loadBalancerNames?.toString())
				.argument("target-group-arns", targetGroupARNs?.toString())
				.argument("health-check-type", healthCheckType)
				.argument("health-check-grace-period", healthCheckGracePeriod?.toString())
				.argument("placement-group", placementGroup)
				.argument("vpczone-identifier", vPCZoneIdentifier)
				.argument("termination-policies", terminationPolicies?.toString())
				.option("new-instances-protected-from-scale-in", newInstancesProtectedFromScaleIn ?: false)
				.argument("lifecycle-hook-specification-list", lifecycleHookSpecificationList?.toString())
				.argument("tags", tags?.toString())
				.argument("service-linked-role-arn", serviceLinkedRoleARN)
	}

}


fun AmazonAutoScalingFunctions.createLaunchConfiguration(launchConfigurationName: String, init: AmazonAutoScalingCreateLaunchConfigurationCommand.() -> Unit): com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationResult {
	return this.block.declare(AmazonAutoScalingCreateLaunchConfigurationCommand(launchConfigurationName).apply(init)) as com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationResult
}

@Generated
class AmazonAutoScalingCreateLaunchConfigurationCommand(val launchConfigurationName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationRequest, com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationResult> {

	var imageId: String? = null
	var keyName: String? = null
	var securityGroups: List<String>? = null
	var classicLinkVPCId: String? = null
	var classicLinkVPCSecurityGroups: List<String>? = null
	var userData: String? = null
	var instanceId: String? = null
	var instanceType: String? = null
	var kernelId: String? = null
	var ramdiskId: String? = null
	var blockDeviceMappings: List<com.amazonaws.services.autoscaling.model.BlockDeviceMapping>? = null
	var instanceMonitoring: com.amazonaws.services.autoscaling.model.InstanceMonitoring? = null
	var spotPrice: String? = null
	var iamInstanceProfile: String? = null
	var ebsOptimized: Boolean? = false
	var associatePublicIpAddress: Boolean? = false
	var placementTenancy: String? = null

	override fun build(): com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationRequest {
		val input = com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationRequest()
		input.setLaunchConfigurationName(this.launchConfigurationName)
		input.setImageId(this.imageId)
		input.setKeyName(this.keyName)
		input.setSecurityGroups(this.securityGroups)
		input.setClassicLinkVPCId(this.classicLinkVPCId)
		input.setClassicLinkVPCSecurityGroups(this.classicLinkVPCSecurityGroups)
		input.setUserData(this.userData)
		input.setInstanceId(this.instanceId)
		input.setInstanceType(this.instanceType)
		input.setKernelId(this.kernelId)
		input.setRamdiskId(this.ramdiskId)
		input.setBlockDeviceMappings(this.blockDeviceMappings)
		input.setInstanceMonitoring(this.instanceMonitoring)
		input.setSpotPrice(this.spotPrice)
		input.setIamInstanceProfile(this.iamInstanceProfile)
		input.setEbsOptimized(this.ebsOptimized)
		input.setAssociatePublicIpAddress(this.associatePublicIpAddress)
		input.setPlacementTenancy(this.placementTenancy)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationResult {
	  return com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationResult {
		return environment.autoscaling.createLaunchConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling create-launch-configuration")
				.argument("launch-configuration-name", launchConfigurationName)
				.argument("image-id", imageId)
				.argument("key-name", keyName)
				.argument("security-groups", securityGroups?.toString())
				.argument("classic-link-vpcid", classicLinkVPCId)
				.argument("classic-link-vpcsecurity-groups", classicLinkVPCSecurityGroups?.toString())
				.argument("user-data", userData)
				.argument("instance-id", instanceId)
				.argument("instance-type", instanceType)
				.argument("kernel-id", kernelId)
				.argument("ramdisk-id", ramdiskId)
				.argument("block-device-mappings", blockDeviceMappings?.toString())
				.argument("instance-monitoring", instanceMonitoring?.toString())
				.argument("spot-price", spotPrice)
				.argument("iam-instance-profile", iamInstanceProfile)
				.option("ebs-optimized", ebsOptimized ?: false)
				.option("associate-public-ip-address", associatePublicIpAddress ?: false)
				.argument("placement-tenancy", placementTenancy)
	}

}


fun AmazonAutoScalingFunctions.createOrUpdateTags(tags: List<com.amazonaws.services.autoscaling.model.Tag>, init: AmazonAutoScalingCreateOrUpdateTagsCommand.() -> Unit): com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsResult {
	return this.block.declare(AmazonAutoScalingCreateOrUpdateTagsCommand(tags).apply(init)) as com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsResult
}

@Generated
class AmazonAutoScalingCreateOrUpdateTagsCommand(val tags: List<com.amazonaws.services.autoscaling.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsRequest, com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsRequest {
		val input = com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsRequest()
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsResult {
	  return com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsResult {
		return environment.autoscaling.createOrUpdateTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling create-or-update-tags")
				.argument("tags", tags.toString())
	}

}


fun AmazonAutoScalingFunctions.deleteAutoScalingGroup(autoScalingGroupName: String, init: AmazonAutoScalingDeleteAutoScalingGroupCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupResult {
	return this.block.declare(AmazonAutoScalingDeleteAutoScalingGroupCommand(autoScalingGroupName).apply(init)) as com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupResult
}

@Generated
class AmazonAutoScalingDeleteAutoScalingGroupCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupRequest, com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupResult> {

	var forceDelete: Boolean? = false

	override fun build(): com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupRequest {
		val input = com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setForceDelete(this.forceDelete)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupResult {
	  return com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupResult {
		return environment.autoscaling.deleteAutoScalingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling delete-auto-scaling-group")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.option("force-delete", forceDelete ?: false)
	}

}


fun AmazonAutoScalingFunctions.deleteLaunchConfiguration(launchConfigurationName: String, init: AmazonAutoScalingDeleteLaunchConfigurationCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationResult {
	return this.block.declare(AmazonAutoScalingDeleteLaunchConfigurationCommand(launchConfigurationName).apply(init)) as com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationResult
}

@Generated
class AmazonAutoScalingDeleteLaunchConfigurationCommand(val launchConfigurationName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationRequest, com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationRequest {
		val input = com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationRequest()
		input.setLaunchConfigurationName(this.launchConfigurationName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationResult {
	  return com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationResult {
		return environment.autoscaling.deleteLaunchConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling delete-launch-configuration")
				.argument("launch-configuration-name", launchConfigurationName)
	}

}


fun AmazonAutoScalingFunctions.deleteLifecycleHook(lifecycleHookName: String, autoScalingGroupName: String, init: AmazonAutoScalingDeleteLifecycleHookCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DeleteLifecycleHookResult {
	return this.block.declare(AmazonAutoScalingDeleteLifecycleHookCommand(lifecycleHookName, autoScalingGroupName).apply(init)) as com.amazonaws.services.autoscaling.model.DeleteLifecycleHookResult
}

@Generated
class AmazonAutoScalingDeleteLifecycleHookCommand(val lifecycleHookName: String, val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DeleteLifecycleHookRequest, com.amazonaws.services.autoscaling.model.DeleteLifecycleHookResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.DeleteLifecycleHookRequest {
		val input = com.amazonaws.services.autoscaling.model.DeleteLifecycleHookRequest()
		input.setLifecycleHookName(this.lifecycleHookName)
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DeleteLifecycleHookResult {
	  return com.amazonaws.services.autoscaling.model.DeleteLifecycleHookResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DeleteLifecycleHookResult {
		return environment.autoscaling.deleteLifecycleHook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling delete-lifecycle-hook")
				.argument("lifecycle-hook-name", lifecycleHookName)
				.argument("auto-scaling-group-name", autoScalingGroupName)
	}

}


fun AmazonAutoScalingFunctions.deleteNotificationConfiguration(autoScalingGroupName: String, topicARN: String, init: AmazonAutoScalingDeleteNotificationConfigurationCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationResult {
	return this.block.declare(AmazonAutoScalingDeleteNotificationConfigurationCommand(autoScalingGroupName, topicARN).apply(init)) as com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationResult
}

@Generated
class AmazonAutoScalingDeleteNotificationConfigurationCommand(val autoScalingGroupName: String, val topicARN: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationRequest, com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationRequest {
		val input = com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setTopicARN(this.topicARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationResult {
	  return com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationResult {
		return environment.autoscaling.deleteNotificationConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling delete-notification-configuration")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("topic-arn", topicARN)
	}

}


fun AmazonAutoScalingFunctions.deletePolicy(policyName: String, init: AmazonAutoScalingDeletePolicyCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DeletePolicyResult {
	return this.block.declare(AmazonAutoScalingDeletePolicyCommand(policyName).apply(init)) as com.amazonaws.services.autoscaling.model.DeletePolicyResult
}

@Generated
class AmazonAutoScalingDeletePolicyCommand(val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DeletePolicyRequest, com.amazonaws.services.autoscaling.model.DeletePolicyResult> {

	var autoScalingGroupName: String? = null

	override fun build(): com.amazonaws.services.autoscaling.model.DeletePolicyRequest {
		val input = com.amazonaws.services.autoscaling.model.DeletePolicyRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setPolicyName(this.policyName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DeletePolicyResult {
	  return com.amazonaws.services.autoscaling.model.DeletePolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DeletePolicyResult {
		return environment.autoscaling.deletePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling delete-policy")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("policy-name", policyName)
	}

}


fun AmazonAutoScalingFunctions.deleteScheduledAction(autoScalingGroupName: String, scheduledActionName: String, init: AmazonAutoScalingDeleteScheduledActionCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DeleteScheduledActionResult {
	return this.block.declare(AmazonAutoScalingDeleteScheduledActionCommand(autoScalingGroupName, scheduledActionName).apply(init)) as com.amazonaws.services.autoscaling.model.DeleteScheduledActionResult
}

@Generated
class AmazonAutoScalingDeleteScheduledActionCommand(val autoScalingGroupName: String, val scheduledActionName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DeleteScheduledActionRequest, com.amazonaws.services.autoscaling.model.DeleteScheduledActionResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.DeleteScheduledActionRequest {
		val input = com.amazonaws.services.autoscaling.model.DeleteScheduledActionRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setScheduledActionName(this.scheduledActionName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DeleteScheduledActionResult {
	  return com.amazonaws.services.autoscaling.model.DeleteScheduledActionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DeleteScheduledActionResult {
		return environment.autoscaling.deleteScheduledAction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling delete-scheduled-action")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("scheduled-action-name", scheduledActionName)
	}

}


fun AmazonAutoScalingFunctions.deleteTags(tags: List<com.amazonaws.services.autoscaling.model.Tag>, init: AmazonAutoScalingDeleteTagsCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DeleteTagsResult {
	return this.block.declare(AmazonAutoScalingDeleteTagsCommand(tags).apply(init)) as com.amazonaws.services.autoscaling.model.DeleteTagsResult
}

@Generated
class AmazonAutoScalingDeleteTagsCommand(val tags: List<com.amazonaws.services.autoscaling.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DeleteTagsRequest, com.amazonaws.services.autoscaling.model.DeleteTagsResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.DeleteTagsRequest {
		val input = com.amazonaws.services.autoscaling.model.DeleteTagsRequest()
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DeleteTagsResult {
	  return com.amazonaws.services.autoscaling.model.DeleteTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DeleteTagsResult {
		return environment.autoscaling.deleteTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling delete-tags")
				.argument("tags", tags.toString())
	}

}


fun AmazonAutoScalingFunctions.describeAccountLimits(init: AmazonAutoScalingDescribeAccountLimitsCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeAccountLimitsResult {
	return this.block.declare(AmazonAutoScalingDescribeAccountLimitsCommand().apply(init)) as com.amazonaws.services.autoscaling.model.DescribeAccountLimitsResult
}

@Generated
class AmazonAutoScalingDescribeAccountLimitsCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeAccountLimitsRequest, com.amazonaws.services.autoscaling.model.DescribeAccountLimitsResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.DescribeAccountLimitsRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeAccountLimitsRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeAccountLimitsResult {
	  return com.amazonaws.services.autoscaling.model.DescribeAccountLimitsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeAccountLimitsResult {
		return environment.autoscaling.describeAccountLimits(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-account-limits")

	}

}


fun AmazonAutoScalingFunctions.describeAdjustmentTypes(init: AmazonAutoScalingDescribeAdjustmentTypesCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesResult {
	return this.block.declare(AmazonAutoScalingDescribeAdjustmentTypesCommand().apply(init)) as com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesResult
}

@Generated
class AmazonAutoScalingDescribeAdjustmentTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesRequest, com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesResult {
	  return com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesResult {
		return environment.autoscaling.describeAdjustmentTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-adjustment-types")

	}

}


fun AmazonAutoScalingFunctions.describeAutoScalingGroups(init: AmazonAutoScalingDescribeAutoScalingGroupsCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsResult {
	return this.block.declare(AmazonAutoScalingDescribeAutoScalingGroupsCommand().apply(init)) as com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsResult
}

@Generated
class AmazonAutoScalingDescribeAutoScalingGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsRequest, com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsResult> {

	var autoScalingGroupNames: List<String>? = null
	var nextToken: String? = null
	var maxRecords: Int? = 0

	override fun build(): com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsRequest()
		input.setAutoScalingGroupNames(this.autoScalingGroupNames)
		input.setNextToken(this.nextToken)
		input.setMaxRecords(this.maxRecords)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsResult {
	  return com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsResult {
		return environment.autoscaling.describeAutoScalingGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-auto-scaling-groups")
				.argument("auto-scaling-group-names", autoScalingGroupNames?.toString())
				.argument("next-token", nextToken)
				.argument("max-records", maxRecords?.toString())
	}

}


fun AmazonAutoScalingFunctions.describeAutoScalingInstances(init: AmazonAutoScalingDescribeAutoScalingInstancesCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesResult {
	return this.block.declare(AmazonAutoScalingDescribeAutoScalingInstancesCommand().apply(init)) as com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesResult
}

@Generated
class AmazonAutoScalingDescribeAutoScalingInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesRequest, com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesResult> {

	var instanceIds: List<String>? = null
	var maxRecords: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesRequest()
		input.setInstanceIds(this.instanceIds)
		input.setMaxRecords(this.maxRecords)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesResult {
	  return com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesResult {
		return environment.autoscaling.describeAutoScalingInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-auto-scaling-instances")
				.argument("instance-ids", instanceIds?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonAutoScalingFunctions.describeAutoScalingNotificationTypes(init: AmazonAutoScalingDescribeAutoScalingNotificationTypesCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesResult {
	return this.block.declare(AmazonAutoScalingDescribeAutoScalingNotificationTypesCommand().apply(init)) as com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesResult
}

@Generated
class AmazonAutoScalingDescribeAutoScalingNotificationTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesRequest, com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesResult {
	  return com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesResult {
		return environment.autoscaling.describeAutoScalingNotificationTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-auto-scaling-notification-types")

	}

}


fun AmazonAutoScalingFunctions.describeLaunchConfigurations(init: AmazonAutoScalingDescribeLaunchConfigurationsCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsResult {
	return this.block.declare(AmazonAutoScalingDescribeLaunchConfigurationsCommand().apply(init)) as com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsResult
}

@Generated
class AmazonAutoScalingDescribeLaunchConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsRequest, com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsResult> {

	var launchConfigurationNames: List<String>? = null
	var nextToken: String? = null
	var maxRecords: Int? = 0

	override fun build(): com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsRequest()
		input.setLaunchConfigurationNames(this.launchConfigurationNames)
		input.setNextToken(this.nextToken)
		input.setMaxRecords(this.maxRecords)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsResult {
	  return com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsResult {
		return environment.autoscaling.describeLaunchConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-launch-configurations")
				.argument("launch-configuration-names", launchConfigurationNames?.toString())
				.argument("next-token", nextToken)
				.argument("max-records", maxRecords?.toString())
	}

}


fun AmazonAutoScalingFunctions.describeLifecycleHookTypes(init: AmazonAutoScalingDescribeLifecycleHookTypesCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesResult {
	return this.block.declare(AmazonAutoScalingDescribeLifecycleHookTypesCommand().apply(init)) as com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesResult
}

@Generated
class AmazonAutoScalingDescribeLifecycleHookTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesRequest, com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesResult {
	  return com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesResult {
		return environment.autoscaling.describeLifecycleHookTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-lifecycle-hook-types")

	}

}


fun AmazonAutoScalingFunctions.describeLifecycleHooks(autoScalingGroupName: String, init: AmazonAutoScalingDescribeLifecycleHooksCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksResult {
	return this.block.declare(AmazonAutoScalingDescribeLifecycleHooksCommand(autoScalingGroupName).apply(init)) as com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksResult
}

@Generated
class AmazonAutoScalingDescribeLifecycleHooksCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksRequest, com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksResult> {

	var lifecycleHookNames: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setLifecycleHookNames(this.lifecycleHookNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksResult {
	  return com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksResult {
		return environment.autoscaling.describeLifecycleHooks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-lifecycle-hooks")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("lifecycle-hook-names", lifecycleHookNames?.toString())
	}

}


fun AmazonAutoScalingFunctions.describeLoadBalancerTargetGroups(autoScalingGroupName: String, init: AmazonAutoScalingDescribeLoadBalancerTargetGroupsCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsResult {
	return this.block.declare(AmazonAutoScalingDescribeLoadBalancerTargetGroupsCommand(autoScalingGroupName).apply(init)) as com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsResult
}

@Generated
class AmazonAutoScalingDescribeLoadBalancerTargetGroupsCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsRequest, com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsResult> {

	var nextToken: String? = null
	var maxRecords: Int? = 0

	override fun build(): com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setNextToken(this.nextToken)
		input.setMaxRecords(this.maxRecords)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsResult {
	  return com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsResult {
		return environment.autoscaling.describeLoadBalancerTargetGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-load-balancer-target-groups")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("next-token", nextToken)
				.argument("max-records", maxRecords?.toString())
	}

}


fun AmazonAutoScalingFunctions.describeLoadBalancers(autoScalingGroupName: String, init: AmazonAutoScalingDescribeLoadBalancersCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeLoadBalancersResult {
	return this.block.declare(AmazonAutoScalingDescribeLoadBalancersCommand(autoScalingGroupName).apply(init)) as com.amazonaws.services.autoscaling.model.DescribeLoadBalancersResult
}

@Generated
class AmazonAutoScalingDescribeLoadBalancersCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeLoadBalancersRequest, com.amazonaws.services.autoscaling.model.DescribeLoadBalancersResult> {

	var nextToken: String? = null
	var maxRecords: Int? = 0

	override fun build(): com.amazonaws.services.autoscaling.model.DescribeLoadBalancersRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeLoadBalancersRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setNextToken(this.nextToken)
		input.setMaxRecords(this.maxRecords)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeLoadBalancersResult {
	  return com.amazonaws.services.autoscaling.model.DescribeLoadBalancersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeLoadBalancersResult {
		return environment.autoscaling.describeLoadBalancers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-load-balancers")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("next-token", nextToken)
				.argument("max-records", maxRecords?.toString())
	}

}


fun AmazonAutoScalingFunctions.describeMetricCollectionTypes(init: AmazonAutoScalingDescribeMetricCollectionTypesCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesResult {
	return this.block.declare(AmazonAutoScalingDescribeMetricCollectionTypesCommand().apply(init)) as com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesResult
}

@Generated
class AmazonAutoScalingDescribeMetricCollectionTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesRequest, com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesResult {
	  return com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesResult {
		return environment.autoscaling.describeMetricCollectionTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-metric-collection-types")

	}

}


fun AmazonAutoScalingFunctions.describeNotificationConfigurations(init: AmazonAutoScalingDescribeNotificationConfigurationsCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsResult {
	return this.block.declare(AmazonAutoScalingDescribeNotificationConfigurationsCommand().apply(init)) as com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsResult
}

@Generated
class AmazonAutoScalingDescribeNotificationConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsRequest, com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsResult> {

	var autoScalingGroupNames: List<String>? = null
	var nextToken: String? = null
	var maxRecords: Int? = 0

	override fun build(): com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsRequest()
		input.setAutoScalingGroupNames(this.autoScalingGroupNames)
		input.setNextToken(this.nextToken)
		input.setMaxRecords(this.maxRecords)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsResult {
	  return com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsResult {
		return environment.autoscaling.describeNotificationConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-notification-configurations")
				.argument("auto-scaling-group-names", autoScalingGroupNames?.toString())
				.argument("next-token", nextToken)
				.argument("max-records", maxRecords?.toString())
	}

}


fun AmazonAutoScalingFunctions.describePolicies(init: AmazonAutoScalingDescribePoliciesCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribePoliciesResult {
	return this.block.declare(AmazonAutoScalingDescribePoliciesCommand().apply(init)) as com.amazonaws.services.autoscaling.model.DescribePoliciesResult
}

@Generated
class AmazonAutoScalingDescribePoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribePoliciesRequest, com.amazonaws.services.autoscaling.model.DescribePoliciesResult> {

	var autoScalingGroupName: String? = null
	var policyNames: List<String>? = null
	var policyTypes: List<String>? = null
	var nextToken: String? = null
	var maxRecords: Int? = 0

	override fun build(): com.amazonaws.services.autoscaling.model.DescribePoliciesRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribePoliciesRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setPolicyNames(this.policyNames)
		input.setPolicyTypes(this.policyTypes)
		input.setNextToken(this.nextToken)
		input.setMaxRecords(this.maxRecords)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribePoliciesResult {
	  return com.amazonaws.services.autoscaling.model.DescribePoliciesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribePoliciesResult {
		return environment.autoscaling.describePolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-policies")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("policy-names", policyNames?.toString())
				.argument("policy-types", policyTypes?.toString())
				.argument("next-token", nextToken)
				.argument("max-records", maxRecords?.toString())
	}

}


fun AmazonAutoScalingFunctions.describeScalingActivities(init: AmazonAutoScalingDescribeScalingActivitiesCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesResult {
	return this.block.declare(AmazonAutoScalingDescribeScalingActivitiesCommand().apply(init)) as com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesResult
}

@Generated
class AmazonAutoScalingDescribeScalingActivitiesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesRequest, com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesResult> {

	var activityIds: List<String>? = null
	var autoScalingGroupName: String? = null
	var maxRecords: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesRequest()
		input.setActivityIds(this.activityIds)
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setMaxRecords(this.maxRecords)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesResult {
	  return com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesResult {
		return environment.autoscaling.describeScalingActivities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-scaling-activities")
				.argument("activity-ids", activityIds?.toString())
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("max-records", maxRecords?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonAutoScalingFunctions.describeScalingProcessTypes(init: AmazonAutoScalingDescribeScalingProcessTypesCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesResult {
	return this.block.declare(AmazonAutoScalingDescribeScalingProcessTypesCommand().apply(init)) as com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesResult
}

@Generated
class AmazonAutoScalingDescribeScalingProcessTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesRequest, com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesResult {
	  return com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesResult {
		return environment.autoscaling.describeScalingProcessTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-scaling-process-types")

	}

}


fun AmazonAutoScalingFunctions.describeScheduledActions(init: AmazonAutoScalingDescribeScheduledActionsCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeScheduledActionsResult {
	return this.block.declare(AmazonAutoScalingDescribeScheduledActionsCommand().apply(init)) as com.amazonaws.services.autoscaling.model.DescribeScheduledActionsResult
}

@Generated
class AmazonAutoScalingDescribeScheduledActionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeScheduledActionsRequest, com.amazonaws.services.autoscaling.model.DescribeScheduledActionsResult> {

	var autoScalingGroupName: String? = null
	var scheduledActionNames: List<String>? = null
	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null
	var nextToken: String? = null
	var maxRecords: Int? = 0

	override fun build(): com.amazonaws.services.autoscaling.model.DescribeScheduledActionsRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeScheduledActionsRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setScheduledActionNames(this.scheduledActionNames)
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setNextToken(this.nextToken)
		input.setMaxRecords(this.maxRecords)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeScheduledActionsResult {
	  return com.amazonaws.services.autoscaling.model.DescribeScheduledActionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeScheduledActionsResult {
		return environment.autoscaling.describeScheduledActions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-scheduled-actions")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("scheduled-action-names", scheduledActionNames?.toString())
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("next-token", nextToken)
				.argument("max-records", maxRecords?.toString())
	}

}


fun AmazonAutoScalingFunctions.describeTags(init: AmazonAutoScalingDescribeTagsCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeTagsResult {
	return this.block.declare(AmazonAutoScalingDescribeTagsCommand().apply(init)) as com.amazonaws.services.autoscaling.model.DescribeTagsResult
}

@Generated
class AmazonAutoScalingDescribeTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeTagsRequest, com.amazonaws.services.autoscaling.model.DescribeTagsResult> {

	var filters: List<com.amazonaws.services.autoscaling.model.Filter>? = null
	var nextToken: String? = null
	var maxRecords: Int? = 0

	override fun build(): com.amazonaws.services.autoscaling.model.DescribeTagsRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeTagsRequest()
		input.setFilters(this.filters)
		input.setNextToken(this.nextToken)
		input.setMaxRecords(this.maxRecords)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeTagsResult {
	  return com.amazonaws.services.autoscaling.model.DescribeTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeTagsResult {
		return environment.autoscaling.describeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-tags")
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-records", maxRecords?.toString())
	}

}


fun AmazonAutoScalingFunctions.describeTerminationPolicyTypes(init: AmazonAutoScalingDescribeTerminationPolicyTypesCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesResult {
	return this.block.declare(AmazonAutoScalingDescribeTerminationPolicyTypesCommand().apply(init)) as com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesResult
}

@Generated
class AmazonAutoScalingDescribeTerminationPolicyTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesRequest, com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesResult {
	  return com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesResult {
		return environment.autoscaling.describeTerminationPolicyTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-termination-policy-types")

	}

}


fun AmazonAutoScalingFunctions.detachInstances(autoScalingGroupName: String, shouldDecrementDesiredCapacity: Boolean, init: AmazonAutoScalingDetachInstancesCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DetachInstancesResult {
	return this.block.declare(AmazonAutoScalingDetachInstancesCommand(autoScalingGroupName, shouldDecrementDesiredCapacity).apply(init)) as com.amazonaws.services.autoscaling.model.DetachInstancesResult
}

@Generated
class AmazonAutoScalingDetachInstancesCommand(val autoScalingGroupName: String, val shouldDecrementDesiredCapacity: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DetachInstancesRequest, com.amazonaws.services.autoscaling.model.DetachInstancesResult> {

	var instanceIds: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.DetachInstancesRequest {
		val input = com.amazonaws.services.autoscaling.model.DetachInstancesRequest()
		input.setInstanceIds(this.instanceIds)
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setShouldDecrementDesiredCapacity(this.shouldDecrementDesiredCapacity)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DetachInstancesResult {
	  return com.amazonaws.services.autoscaling.model.DetachInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DetachInstancesResult {
		return environment.autoscaling.detachInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling detach-instances")
				.argument("instance-ids", instanceIds?.toString())
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.option("should-decrement-desired-capacity", shouldDecrementDesiredCapacity ?: false)
	}

}


fun AmazonAutoScalingFunctions.detachLoadBalancerTargetGroups(autoScalingGroupName: String, targetGroupARNs: List<String>, init: AmazonAutoScalingDetachLoadBalancerTargetGroupsCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsResult {
	return this.block.declare(AmazonAutoScalingDetachLoadBalancerTargetGroupsCommand(autoScalingGroupName, targetGroupARNs).apply(init)) as com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsResult
}

@Generated
class AmazonAutoScalingDetachLoadBalancerTargetGroupsCommand(val autoScalingGroupName: String, val targetGroupARNs: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsRequest, com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsRequest {
		val input = com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setTargetGroupARNs(this.targetGroupARNs)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsResult {
	  return com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsResult {
		return environment.autoscaling.detachLoadBalancerTargetGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling detach-load-balancer-target-groups")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("target-group-arns", targetGroupARNs.toString())
	}

}


fun AmazonAutoScalingFunctions.detachLoadBalancers(autoScalingGroupName: String, loadBalancerNames: List<String>, init: AmazonAutoScalingDetachLoadBalancersCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DetachLoadBalancersResult {
	return this.block.declare(AmazonAutoScalingDetachLoadBalancersCommand(autoScalingGroupName, loadBalancerNames).apply(init)) as com.amazonaws.services.autoscaling.model.DetachLoadBalancersResult
}

@Generated
class AmazonAutoScalingDetachLoadBalancersCommand(val autoScalingGroupName: String, val loadBalancerNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DetachLoadBalancersRequest, com.amazonaws.services.autoscaling.model.DetachLoadBalancersResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.DetachLoadBalancersRequest {
		val input = com.amazonaws.services.autoscaling.model.DetachLoadBalancersRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setLoadBalancerNames(this.loadBalancerNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DetachLoadBalancersResult {
	  return com.amazonaws.services.autoscaling.model.DetachLoadBalancersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DetachLoadBalancersResult {
		return environment.autoscaling.detachLoadBalancers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling detach-load-balancers")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("load-balancer-names", loadBalancerNames.toString())
	}

}


fun AmazonAutoScalingFunctions.disableMetricsCollection(autoScalingGroupName: String, init: AmazonAutoScalingDisableMetricsCollectionCommand.() -> Unit): com.amazonaws.services.autoscaling.model.DisableMetricsCollectionResult {
	return this.block.declare(AmazonAutoScalingDisableMetricsCollectionCommand(autoScalingGroupName).apply(init)) as com.amazonaws.services.autoscaling.model.DisableMetricsCollectionResult
}

@Generated
class AmazonAutoScalingDisableMetricsCollectionCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DisableMetricsCollectionRequest, com.amazonaws.services.autoscaling.model.DisableMetricsCollectionResult> {

	var metrics: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.DisableMetricsCollectionRequest {
		val input = com.amazonaws.services.autoscaling.model.DisableMetricsCollectionRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setMetrics(this.metrics)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.DisableMetricsCollectionResult {
	  return com.amazonaws.services.autoscaling.model.DisableMetricsCollectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.DisableMetricsCollectionResult {
		return environment.autoscaling.disableMetricsCollection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling disable-metrics-collection")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("metrics", metrics?.toString())
	}

}


fun AmazonAutoScalingFunctions.enableMetricsCollection(autoScalingGroupName: String, granularity: String, init: AmazonAutoScalingEnableMetricsCollectionCommand.() -> Unit): com.amazonaws.services.autoscaling.model.EnableMetricsCollectionResult {
	return this.block.declare(AmazonAutoScalingEnableMetricsCollectionCommand(autoScalingGroupName, granularity).apply(init)) as com.amazonaws.services.autoscaling.model.EnableMetricsCollectionResult
}

@Generated
class AmazonAutoScalingEnableMetricsCollectionCommand(val autoScalingGroupName: String, val granularity: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.EnableMetricsCollectionRequest, com.amazonaws.services.autoscaling.model.EnableMetricsCollectionResult> {

	var metrics: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.EnableMetricsCollectionRequest {
		val input = com.amazonaws.services.autoscaling.model.EnableMetricsCollectionRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setMetrics(this.metrics)
		input.setGranularity(this.granularity)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.EnableMetricsCollectionResult {
	  return com.amazonaws.services.autoscaling.model.EnableMetricsCollectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.EnableMetricsCollectionResult {
		return environment.autoscaling.enableMetricsCollection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling enable-metrics-collection")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("metrics", metrics?.toString())
				.argument("granularity", granularity)
	}

}


fun AmazonAutoScalingFunctions.enterStandby(autoScalingGroupName: String, shouldDecrementDesiredCapacity: Boolean, init: AmazonAutoScalingEnterStandbyCommand.() -> Unit): com.amazonaws.services.autoscaling.model.EnterStandbyResult {
	return this.block.declare(AmazonAutoScalingEnterStandbyCommand(autoScalingGroupName, shouldDecrementDesiredCapacity).apply(init)) as com.amazonaws.services.autoscaling.model.EnterStandbyResult
}

@Generated
class AmazonAutoScalingEnterStandbyCommand(val autoScalingGroupName: String, val shouldDecrementDesiredCapacity: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.EnterStandbyRequest, com.amazonaws.services.autoscaling.model.EnterStandbyResult> {

	var instanceIds: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.EnterStandbyRequest {
		val input = com.amazonaws.services.autoscaling.model.EnterStandbyRequest()
		input.setInstanceIds(this.instanceIds)
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setShouldDecrementDesiredCapacity(this.shouldDecrementDesiredCapacity)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.EnterStandbyResult {
	  return com.amazonaws.services.autoscaling.model.EnterStandbyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.EnterStandbyResult {
		return environment.autoscaling.enterStandby(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling enter-standby")
				.argument("instance-ids", instanceIds?.toString())
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.option("should-decrement-desired-capacity", shouldDecrementDesiredCapacity ?: false)
	}

}


fun AmazonAutoScalingFunctions.executePolicy(policyName: String, init: AmazonAutoScalingExecutePolicyCommand.() -> Unit): com.amazonaws.services.autoscaling.model.ExecutePolicyResult {
	return this.block.declare(AmazonAutoScalingExecutePolicyCommand(policyName).apply(init)) as com.amazonaws.services.autoscaling.model.ExecutePolicyResult
}

@Generated
class AmazonAutoScalingExecutePolicyCommand(val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.ExecutePolicyRequest, com.amazonaws.services.autoscaling.model.ExecutePolicyResult> {

	var autoScalingGroupName: String? = null
	var honorCooldown: Boolean? = false
	var metricValue: Double? = 0.0
	var breachThreshold: Double? = 0.0

	override fun build(): com.amazonaws.services.autoscaling.model.ExecutePolicyRequest {
		val input = com.amazonaws.services.autoscaling.model.ExecutePolicyRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setPolicyName(this.policyName)
		input.setHonorCooldown(this.honorCooldown)
		input.setMetricValue(this.metricValue)
		input.setBreachThreshold(this.breachThreshold)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.ExecutePolicyResult {
	  return com.amazonaws.services.autoscaling.model.ExecutePolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.ExecutePolicyResult {
		return environment.autoscaling.executePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling execute-policy")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("policy-name", policyName)
				.option("honor-cooldown", honorCooldown ?: false)
				.argument("metric-value", metricValue?.toString())
				.argument("breach-threshold", breachThreshold?.toString())
	}

}


fun AmazonAutoScalingFunctions.exitStandby(autoScalingGroupName: String, init: AmazonAutoScalingExitStandbyCommand.() -> Unit): com.amazonaws.services.autoscaling.model.ExitStandbyResult {
	return this.block.declare(AmazonAutoScalingExitStandbyCommand(autoScalingGroupName).apply(init)) as com.amazonaws.services.autoscaling.model.ExitStandbyResult
}

@Generated
class AmazonAutoScalingExitStandbyCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.ExitStandbyRequest, com.amazonaws.services.autoscaling.model.ExitStandbyResult> {

	var instanceIds: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.ExitStandbyRequest {
		val input = com.amazonaws.services.autoscaling.model.ExitStandbyRequest()
		input.setInstanceIds(this.instanceIds)
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.ExitStandbyResult {
	  return com.amazonaws.services.autoscaling.model.ExitStandbyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.ExitStandbyResult {
		return environment.autoscaling.exitStandby(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling exit-standby")
				.argument("instance-ids", instanceIds?.toString())
				.argument("auto-scaling-group-name", autoScalingGroupName)
	}

}


fun AmazonAutoScalingFunctions.putLifecycleHook(lifecycleHookName: String, autoScalingGroupName: String, init: AmazonAutoScalingPutLifecycleHookCommand.() -> Unit): com.amazonaws.services.autoscaling.model.PutLifecycleHookResult {
	return this.block.declare(AmazonAutoScalingPutLifecycleHookCommand(lifecycleHookName, autoScalingGroupName).apply(init)) as com.amazonaws.services.autoscaling.model.PutLifecycleHookResult
}

@Generated
class AmazonAutoScalingPutLifecycleHookCommand(val lifecycleHookName: String, val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.PutLifecycleHookRequest, com.amazonaws.services.autoscaling.model.PutLifecycleHookResult> {

	var lifecycleTransition: String? = null
	var roleARN: String? = null
	var notificationTargetARN: String? = null
	var notificationMetadata: String? = null
	var heartbeatTimeout: Int? = 0
	var defaultResult: String? = null

	override fun build(): com.amazonaws.services.autoscaling.model.PutLifecycleHookRequest {
		val input = com.amazonaws.services.autoscaling.model.PutLifecycleHookRequest()
		input.setLifecycleHookName(this.lifecycleHookName)
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setLifecycleTransition(this.lifecycleTransition)
		input.setRoleARN(this.roleARN)
		input.setNotificationTargetARN(this.notificationTargetARN)
		input.setNotificationMetadata(this.notificationMetadata)
		input.setHeartbeatTimeout(this.heartbeatTimeout)
		input.setDefaultResult(this.defaultResult)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.PutLifecycleHookResult {
	  return com.amazonaws.services.autoscaling.model.PutLifecycleHookResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.PutLifecycleHookResult {
		return environment.autoscaling.putLifecycleHook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling put-lifecycle-hook")
				.argument("lifecycle-hook-name", lifecycleHookName)
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("lifecycle-transition", lifecycleTransition)
				.argument("role-arn", roleARN)
				.argument("notification-target-arn", notificationTargetARN)
				.argument("notification-metadata", notificationMetadata)
				.argument("heartbeat-timeout", heartbeatTimeout?.toString())
				.argument("default-result", defaultResult)
	}

}


fun AmazonAutoScalingFunctions.putNotificationConfiguration(autoScalingGroupName: String, topicARN: String, notificationTypes: List<String>, init: AmazonAutoScalingPutNotificationConfigurationCommand.() -> Unit): com.amazonaws.services.autoscaling.model.PutNotificationConfigurationResult {
	return this.block.declare(AmazonAutoScalingPutNotificationConfigurationCommand(autoScalingGroupName, topicARN, notificationTypes).apply(init)) as com.amazonaws.services.autoscaling.model.PutNotificationConfigurationResult
}

@Generated
class AmazonAutoScalingPutNotificationConfigurationCommand(val autoScalingGroupName: String, val topicARN: String, val notificationTypes: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.PutNotificationConfigurationRequest, com.amazonaws.services.autoscaling.model.PutNotificationConfigurationResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.PutNotificationConfigurationRequest {
		val input = com.amazonaws.services.autoscaling.model.PutNotificationConfigurationRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setTopicARN(this.topicARN)
		input.setNotificationTypes(this.notificationTypes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.PutNotificationConfigurationResult {
	  return com.amazonaws.services.autoscaling.model.PutNotificationConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.PutNotificationConfigurationResult {
		return environment.autoscaling.putNotificationConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling put-notification-configuration")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("topic-arn", topicARN)
				.argument("notification-types", notificationTypes.toString())
	}

}


fun AmazonAutoScalingFunctions.putScalingPolicy(autoScalingGroupName: String, policyName: String, init: AmazonAutoScalingPutScalingPolicyCommand.() -> Unit): com.amazonaws.services.autoscaling.model.PutScalingPolicyResult {
	return this.block.declare(AmazonAutoScalingPutScalingPolicyCommand(autoScalingGroupName, policyName).apply(init)) as com.amazonaws.services.autoscaling.model.PutScalingPolicyResult
}

@Generated
class AmazonAutoScalingPutScalingPolicyCommand(val autoScalingGroupName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.PutScalingPolicyRequest, com.amazonaws.services.autoscaling.model.PutScalingPolicyResult> {

	var policyType: String? = null
	var adjustmentType: String? = null
	var minAdjustmentStep: Int? = 0
	var minAdjustmentMagnitude: Int? = 0
	var scalingAdjustment: Int? = 0
	var cooldown: Int? = 0
	var metricAggregationType: String? = null
	var stepAdjustments: List<com.amazonaws.services.autoscaling.model.StepAdjustment>? = null
	var estimatedInstanceWarmup: Int? = 0
	var targetTrackingConfiguration: com.amazonaws.services.autoscaling.model.TargetTrackingConfiguration? = null

	override fun build(): com.amazonaws.services.autoscaling.model.PutScalingPolicyRequest {
		val input = com.amazonaws.services.autoscaling.model.PutScalingPolicyRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setPolicyName(this.policyName)
		input.setPolicyType(this.policyType)
		input.setAdjustmentType(this.adjustmentType)
		input.setMinAdjustmentStep(this.minAdjustmentStep)
		input.setMinAdjustmentMagnitude(this.minAdjustmentMagnitude)
		input.setScalingAdjustment(this.scalingAdjustment)
		input.setCooldown(this.cooldown)
		input.setMetricAggregationType(this.metricAggregationType)
		input.setStepAdjustments(this.stepAdjustments)
		input.setEstimatedInstanceWarmup(this.estimatedInstanceWarmup)
		input.setTargetTrackingConfiguration(this.targetTrackingConfiguration)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.PutScalingPolicyResult {
	  return com.amazonaws.services.autoscaling.model.PutScalingPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.PutScalingPolicyResult {
		return environment.autoscaling.putScalingPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling put-scaling-policy")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("policy-name", policyName)
				.argument("policy-type", policyType)
				.argument("adjustment-type", adjustmentType)
				.argument("min-adjustment-step", minAdjustmentStep?.toString())
				.argument("min-adjustment-magnitude", minAdjustmentMagnitude?.toString())
				.argument("scaling-adjustment", scalingAdjustment?.toString())
				.argument("cooldown", cooldown?.toString())
				.argument("metric-aggregation-type", metricAggregationType)
				.argument("step-adjustments", stepAdjustments?.toString())
				.argument("estimated-instance-warmup", estimatedInstanceWarmup?.toString())
				.argument("target-tracking-configuration", targetTrackingConfiguration?.toString())
	}

}


fun AmazonAutoScalingFunctions.putScheduledUpdateGroupAction(autoScalingGroupName: String, scheduledActionName: String, init: AmazonAutoScalingPutScheduledUpdateGroupActionCommand.() -> Unit): com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionResult {
	return this.block.declare(AmazonAutoScalingPutScheduledUpdateGroupActionCommand(autoScalingGroupName, scheduledActionName).apply(init)) as com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionResult
}

@Generated
class AmazonAutoScalingPutScheduledUpdateGroupActionCommand(val autoScalingGroupName: String, val scheduledActionName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionRequest, com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionResult> {

	var time: java.util.Date? = null
	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null
	var recurrence: String? = null
	var minSize: Int? = 0
	var maxSize: Int? = 0
	var desiredCapacity: Int? = 0

	override fun build(): com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionRequest {
		val input = com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setScheduledActionName(this.scheduledActionName)
		input.setTime(this.time)
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setRecurrence(this.recurrence)
		input.setMinSize(this.minSize)
		input.setMaxSize(this.maxSize)
		input.setDesiredCapacity(this.desiredCapacity)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionResult {
	  return com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionResult {
		return environment.autoscaling.putScheduledUpdateGroupAction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling put-scheduled-update-group-action")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("scheduled-action-name", scheduledActionName)
				.argument("time", time?.toString())
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("recurrence", recurrence)
				.argument("min-size", minSize?.toString())
				.argument("max-size", maxSize?.toString())
				.argument("desired-capacity", desiredCapacity?.toString())
	}

}


fun AmazonAutoScalingFunctions.recordLifecycleActionHeartbeat(lifecycleHookName: String, autoScalingGroupName: String, init: AmazonAutoScalingRecordLifecycleActionHeartbeatCommand.() -> Unit): com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatResult {
	return this.block.declare(AmazonAutoScalingRecordLifecycleActionHeartbeatCommand(lifecycleHookName, autoScalingGroupName).apply(init)) as com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatResult
}

@Generated
class AmazonAutoScalingRecordLifecycleActionHeartbeatCommand(val lifecycleHookName: String, val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatRequest, com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatResult> {

	var lifecycleActionToken: String? = null
	var instanceId: String? = null

	override fun build(): com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatRequest {
		val input = com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatRequest()
		input.setLifecycleHookName(this.lifecycleHookName)
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setLifecycleActionToken(this.lifecycleActionToken)
		input.setInstanceId(this.instanceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatResult {
	  return com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatResult {
		return environment.autoscaling.recordLifecycleActionHeartbeat(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling record-lifecycle-action-heartbeat")
				.argument("lifecycle-hook-name", lifecycleHookName)
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("lifecycle-action-token", lifecycleActionToken)
				.argument("instance-id", instanceId)
	}

}


fun AmazonAutoScalingFunctions.resumeProcesses(autoScalingGroupName: String, init: AmazonAutoScalingResumeProcessesCommand.() -> Unit): com.amazonaws.services.autoscaling.model.ResumeProcessesResult {
	return this.block.declare(AmazonAutoScalingResumeProcessesCommand(autoScalingGroupName).apply(init)) as com.amazonaws.services.autoscaling.model.ResumeProcessesResult
}

@Generated
class AmazonAutoScalingResumeProcessesCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.ResumeProcessesRequest, com.amazonaws.services.autoscaling.model.ResumeProcessesResult> {

	var scalingProcesses: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.ResumeProcessesRequest {
		val input = com.amazonaws.services.autoscaling.model.ResumeProcessesRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setScalingProcesses(this.scalingProcesses)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.ResumeProcessesResult {
	  return com.amazonaws.services.autoscaling.model.ResumeProcessesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.ResumeProcessesResult {
		return environment.autoscaling.resumeProcesses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling resume-processes")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("scaling-processes", scalingProcesses?.toString())
	}

}


fun AmazonAutoScalingFunctions.setDesiredCapacity(autoScalingGroupName: String, desiredCapacity: Int, init: AmazonAutoScalingSetDesiredCapacityCommand.() -> Unit): com.amazonaws.services.autoscaling.model.SetDesiredCapacityResult {
	return this.block.declare(AmazonAutoScalingSetDesiredCapacityCommand(autoScalingGroupName, desiredCapacity).apply(init)) as com.amazonaws.services.autoscaling.model.SetDesiredCapacityResult
}

@Generated
class AmazonAutoScalingSetDesiredCapacityCommand(val autoScalingGroupName: String, val desiredCapacity: Int) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.SetDesiredCapacityRequest, com.amazonaws.services.autoscaling.model.SetDesiredCapacityResult> {

	var honorCooldown: Boolean? = false

	override fun build(): com.amazonaws.services.autoscaling.model.SetDesiredCapacityRequest {
		val input = com.amazonaws.services.autoscaling.model.SetDesiredCapacityRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setDesiredCapacity(this.desiredCapacity)
		input.setHonorCooldown(this.honorCooldown)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.SetDesiredCapacityResult {
	  return com.amazonaws.services.autoscaling.model.SetDesiredCapacityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.SetDesiredCapacityResult {
		return environment.autoscaling.setDesiredCapacity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling set-desired-capacity")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("desired-capacity", desiredCapacity.toString())
				.option("honor-cooldown", honorCooldown ?: false)
	}

}


fun AmazonAutoScalingFunctions.setInstanceHealth(instanceId: String, healthStatus: String, init: AmazonAutoScalingSetInstanceHealthCommand.() -> Unit): com.amazonaws.services.autoscaling.model.SetInstanceHealthResult {
	return this.block.declare(AmazonAutoScalingSetInstanceHealthCommand(instanceId, healthStatus).apply(init)) as com.amazonaws.services.autoscaling.model.SetInstanceHealthResult
}

@Generated
class AmazonAutoScalingSetInstanceHealthCommand(val instanceId: String, val healthStatus: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.SetInstanceHealthRequest, com.amazonaws.services.autoscaling.model.SetInstanceHealthResult> {

	var shouldRespectGracePeriod: Boolean? = false

	override fun build(): com.amazonaws.services.autoscaling.model.SetInstanceHealthRequest {
		val input = com.amazonaws.services.autoscaling.model.SetInstanceHealthRequest()
		input.setInstanceId(this.instanceId)
		input.setHealthStatus(this.healthStatus)
		input.setShouldRespectGracePeriod(this.shouldRespectGracePeriod)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.SetInstanceHealthResult {
	  return com.amazonaws.services.autoscaling.model.SetInstanceHealthResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.SetInstanceHealthResult {
		return environment.autoscaling.setInstanceHealth(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling set-instance-health")
				.argument("instance-id", instanceId)
				.argument("health-status", healthStatus)
				.option("should-respect-grace-period", shouldRespectGracePeriod ?: false)
	}

}


fun AmazonAutoScalingFunctions.setInstanceProtection(instanceIds: List<String>, autoScalingGroupName: String, protectedFromScaleIn: Boolean, init: AmazonAutoScalingSetInstanceProtectionCommand.() -> Unit): com.amazonaws.services.autoscaling.model.SetInstanceProtectionResult {
	return this.block.declare(AmazonAutoScalingSetInstanceProtectionCommand(instanceIds, autoScalingGroupName, protectedFromScaleIn).apply(init)) as com.amazonaws.services.autoscaling.model.SetInstanceProtectionResult
}

@Generated
class AmazonAutoScalingSetInstanceProtectionCommand(val instanceIds: List<String>, val autoScalingGroupName: String, val protectedFromScaleIn: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.SetInstanceProtectionRequest, com.amazonaws.services.autoscaling.model.SetInstanceProtectionResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.SetInstanceProtectionRequest {
		val input = com.amazonaws.services.autoscaling.model.SetInstanceProtectionRequest()
		input.setInstanceIds(this.instanceIds)
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setProtectedFromScaleIn(this.protectedFromScaleIn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.SetInstanceProtectionResult {
	  return com.amazonaws.services.autoscaling.model.SetInstanceProtectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.SetInstanceProtectionResult {
		return environment.autoscaling.setInstanceProtection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling set-instance-protection")
				.argument("instance-ids", instanceIds.toString())
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.option("protected-from-scale-in", protectedFromScaleIn ?: false)
	}

}


fun AmazonAutoScalingFunctions.suspendProcesses(autoScalingGroupName: String, init: AmazonAutoScalingSuspendProcessesCommand.() -> Unit): com.amazonaws.services.autoscaling.model.SuspendProcessesResult {
	return this.block.declare(AmazonAutoScalingSuspendProcessesCommand(autoScalingGroupName).apply(init)) as com.amazonaws.services.autoscaling.model.SuspendProcessesResult
}

@Generated
class AmazonAutoScalingSuspendProcessesCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.SuspendProcessesRequest, com.amazonaws.services.autoscaling.model.SuspendProcessesResult> {

	var scalingProcesses: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.SuspendProcessesRequest {
		val input = com.amazonaws.services.autoscaling.model.SuspendProcessesRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setScalingProcesses(this.scalingProcesses)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.SuspendProcessesResult {
	  return com.amazonaws.services.autoscaling.model.SuspendProcessesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.SuspendProcessesResult {
		return environment.autoscaling.suspendProcesses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling suspend-processes")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("scaling-processes", scalingProcesses?.toString())
	}

}


fun AmazonAutoScalingFunctions.terminateInstanceInAutoScalingGroup(instanceId: String, shouldDecrementDesiredCapacity: Boolean, init: AmazonAutoScalingTerminateInstanceInAutoScalingGroupCommand.() -> Unit): com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupResult {
	return this.block.declare(AmazonAutoScalingTerminateInstanceInAutoScalingGroupCommand(instanceId, shouldDecrementDesiredCapacity).apply(init)) as com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupResult
}

@Generated
class AmazonAutoScalingTerminateInstanceInAutoScalingGroupCommand(val instanceId: String, val shouldDecrementDesiredCapacity: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupRequest, com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupResult> {



	override fun build(): com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupRequest {
		val input = com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupRequest()
		input.setInstanceId(this.instanceId)
		input.setShouldDecrementDesiredCapacity(this.shouldDecrementDesiredCapacity)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupResult {
	  return com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupResult {
		return environment.autoscaling.terminateInstanceInAutoScalingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling terminate-instance-in-auto-scaling-group")
				.argument("instance-id", instanceId)
				.option("should-decrement-desired-capacity", shouldDecrementDesiredCapacity ?: false)
	}

}


fun AmazonAutoScalingFunctions.updateAutoScalingGroup(autoScalingGroupName: String, init: AmazonAutoScalingUpdateAutoScalingGroupCommand.() -> Unit): com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupResult {
	return this.block.declare(AmazonAutoScalingUpdateAutoScalingGroupCommand(autoScalingGroupName).apply(init)) as com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupResult
}

@Generated
class AmazonAutoScalingUpdateAutoScalingGroupCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupRequest, com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupResult> {

	var launchConfigurationName: String? = null
	var launchTemplate: com.amazonaws.services.autoscaling.model.LaunchTemplateSpecification? = null
	var minSize: Int? = 0
	var maxSize: Int? = 0
	var desiredCapacity: Int? = 0
	var defaultCooldown: Int? = 0
	var availabilityZones: List<String>? = null
	var healthCheckType: String? = null
	var healthCheckGracePeriod: Int? = 0
	var placementGroup: String? = null
	var vPCZoneIdentifier: String? = null
	var terminationPolicies: List<String>? = null
	var newInstancesProtectedFromScaleIn: Boolean? = false
	var serviceLinkedRoleARN: String? = null

	override fun build(): com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupRequest {
		val input = com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setLaunchConfigurationName(this.launchConfigurationName)
		input.setLaunchTemplate(this.launchTemplate)
		input.setMinSize(this.minSize)
		input.setMaxSize(this.maxSize)
		input.setDesiredCapacity(this.desiredCapacity)
		input.setDefaultCooldown(this.defaultCooldown)
		input.setAvailabilityZones(this.availabilityZones)
		input.setHealthCheckType(this.healthCheckType)
		input.setHealthCheckGracePeriod(this.healthCheckGracePeriod)
		input.setPlacementGroup(this.placementGroup)
		input.setVPCZoneIdentifier(this.vPCZoneIdentifier)
		input.setTerminationPolicies(this.terminationPolicies)
		input.setNewInstancesProtectedFromScaleIn(this.newInstancesProtectedFromScaleIn)
		input.setServiceLinkedRoleARN(this.serviceLinkedRoleARN)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupResult {
	  return com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupResult {
		return environment.autoscaling.updateAutoScalingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling update-auto-scaling-group")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("launch-configuration-name", launchConfigurationName)
				.argument("launch-template", launchTemplate?.toString())
				.argument("min-size", minSize?.toString())
				.argument("max-size", maxSize?.toString())
				.argument("desired-capacity", desiredCapacity?.toString())
				.argument("default-cooldown", defaultCooldown?.toString())
				.argument("availability-zones", availabilityZones?.toString())
				.argument("health-check-type", healthCheckType)
				.argument("health-check-grace-period", healthCheckGracePeriod?.toString())
				.argument("placement-group", placementGroup)
				.argument("vpczone-identifier", vPCZoneIdentifier)
				.argument("termination-policies", terminationPolicies?.toString())
				.option("new-instances-protected-from-scale-in", newInstancesProtectedFromScaleIn ?: false)
				.argument("service-linked-role-arn", serviceLinkedRoleARN)
	}

}
