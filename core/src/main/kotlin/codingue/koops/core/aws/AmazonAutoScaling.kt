
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.autoscaling.AmazonAutoScaling
import com.amazonaws.services.autoscaling.model.*

var codingue.koops.core.Environment.autoscaling: AmazonAutoScaling
	get() = this.capabilities[AmazonAutoScaling::class.java.name] as AmazonAutoScaling
	set(autoscaling) {
		this.capabilities[AmazonAutoScaling::class.java.name] = autoscaling
	}

@Generated
class AmazonAutoScalingFunctions(val block: Block)

infix fun AwsContinuation.autoscaling(init: AmazonAutoScalingFunctions.() -> Unit) {
	AmazonAutoScalingFunctions(shell).apply(init)
}

			

fun AmazonAutoScalingFunctions.attachInstances(autoScalingGroupName: String, init: AmazonAutoScalingAttachInstancesCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingAttachInstancesCommand(autoScalingGroupName).apply(init))
}

@Generated
class AmazonAutoScalingAttachInstancesCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.AttachInstancesRequest> {

	var instanceIds: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.AttachInstancesRequest {
		val input = com.amazonaws.services.autoscaling.model.AttachInstancesRequest()
		input.setInstanceIds(this.instanceIds)
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.attachInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling attach-instances")
				.argument("instance-ids", instanceIds?.toString())
				.argument("auto-scaling-group-name", autoScalingGroupName)
	}

}


fun AmazonAutoScalingFunctions.attachLoadBalancerTargetGroups(autoScalingGroupName: String, targetGroupARNs: List<String>, init: AmazonAutoScalingAttachLoadBalancerTargetGroupsCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingAttachLoadBalancerTargetGroupsCommand(autoScalingGroupName, targetGroupARNs).apply(init))
}

@Generated
class AmazonAutoScalingAttachLoadBalancerTargetGroupsCommand(val autoScalingGroupName: String, val targetGroupARNs: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsRequest {
		val input = com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setTargetGroupARNs(this.targetGroupARNs)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.attachLoadBalancerTargetGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling attach-load-balancer-target-groups")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("target-group-arns", targetGroupARNs.toString())
	}

}


fun AmazonAutoScalingFunctions.attachLoadBalancers(autoScalingGroupName: String, loadBalancerNames: List<String>, init: AmazonAutoScalingAttachLoadBalancersCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingAttachLoadBalancersCommand(autoScalingGroupName, loadBalancerNames).apply(init))
}

@Generated
class AmazonAutoScalingAttachLoadBalancersCommand(val autoScalingGroupName: String, val loadBalancerNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.AttachLoadBalancersRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.AttachLoadBalancersRequest {
		val input = com.amazonaws.services.autoscaling.model.AttachLoadBalancersRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setLoadBalancerNames(this.loadBalancerNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.attachLoadBalancers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling attach-load-balancers")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("load-balancer-names", loadBalancerNames.toString())
	}

}


fun AmazonAutoScalingFunctions.completeLifecycleAction(lifecycleHookName: String, autoScalingGroupName: String, lifecycleActionResult: String, init: AmazonAutoScalingCompleteLifecycleActionCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingCompleteLifecycleActionCommand(lifecycleHookName, autoScalingGroupName, lifecycleActionResult).apply(init))
}

@Generated
class AmazonAutoScalingCompleteLifecycleActionCommand(val lifecycleHookName: String, val autoScalingGroupName: String, val lifecycleActionResult: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.CompleteLifecycleActionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.completeLifecycleAction(build())
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


fun AmazonAutoScalingFunctions.createAutoScalingGroup(autoScalingGroupName: String, minSize: Int, maxSize: Int, init: AmazonAutoScalingCreateAutoScalingGroupCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingCreateAutoScalingGroupCommand(autoScalingGroupName, minSize, maxSize).apply(init))
}

@Generated
class AmazonAutoScalingCreateAutoScalingGroupCommand(val autoScalingGroupName: String, val minSize: Int, val maxSize: Int) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.createAutoScalingGroup(build())
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


fun AmazonAutoScalingFunctions.createLaunchConfiguration(launchConfigurationName: String, init: AmazonAutoScalingCreateLaunchConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingCreateLaunchConfigurationCommand(launchConfigurationName).apply(init))
}

@Generated
class AmazonAutoScalingCreateLaunchConfigurationCommand(val launchConfigurationName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.createLaunchConfiguration(build())
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


fun AmazonAutoScalingFunctions.createOrUpdateTags(tags: List<com.amazonaws.services.autoscaling.model.Tag>, init: AmazonAutoScalingCreateOrUpdateTagsCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingCreateOrUpdateTagsCommand(tags).apply(init))
}

@Generated
class AmazonAutoScalingCreateOrUpdateTagsCommand(val tags: List<com.amazonaws.services.autoscaling.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsRequest {
		val input = com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsRequest()
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.createOrUpdateTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling create-or-update-tags")
				.argument("tags", tags.toString())
	}

}


fun AmazonAutoScalingFunctions.deleteAutoScalingGroup(autoScalingGroupName: String, init: AmazonAutoScalingDeleteAutoScalingGroupCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDeleteAutoScalingGroupCommand(autoScalingGroupName).apply(init))
}

@Generated
class AmazonAutoScalingDeleteAutoScalingGroupCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupRequest> {

	var forceDelete: Boolean? = false

	override fun build(): com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupRequest {
		val input = com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setForceDelete(this.forceDelete)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.deleteAutoScalingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling delete-auto-scaling-group")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.option("force-delete", forceDelete ?: false)
	}

}


fun AmazonAutoScalingFunctions.deleteLaunchConfiguration(launchConfigurationName: String, init: AmazonAutoScalingDeleteLaunchConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDeleteLaunchConfigurationCommand(launchConfigurationName).apply(init))
}

@Generated
class AmazonAutoScalingDeleteLaunchConfigurationCommand(val launchConfigurationName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationRequest {
		val input = com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationRequest()
		input.setLaunchConfigurationName(this.launchConfigurationName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.deleteLaunchConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling delete-launch-configuration")
				.argument("launch-configuration-name", launchConfigurationName)
	}

}


fun AmazonAutoScalingFunctions.deleteLifecycleHook(lifecycleHookName: String, autoScalingGroupName: String, init: AmazonAutoScalingDeleteLifecycleHookCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDeleteLifecycleHookCommand(lifecycleHookName, autoScalingGroupName).apply(init))
}

@Generated
class AmazonAutoScalingDeleteLifecycleHookCommand(val lifecycleHookName: String, val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DeleteLifecycleHookRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.DeleteLifecycleHookRequest {
		val input = com.amazonaws.services.autoscaling.model.DeleteLifecycleHookRequest()
		input.setLifecycleHookName(this.lifecycleHookName)
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.deleteLifecycleHook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling delete-lifecycle-hook")
				.argument("lifecycle-hook-name", lifecycleHookName)
				.argument("auto-scaling-group-name", autoScalingGroupName)
	}

}


fun AmazonAutoScalingFunctions.deleteNotificationConfiguration(autoScalingGroupName: String, topicARN: String, init: AmazonAutoScalingDeleteNotificationConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDeleteNotificationConfigurationCommand(autoScalingGroupName, topicARN).apply(init))
}

@Generated
class AmazonAutoScalingDeleteNotificationConfigurationCommand(val autoScalingGroupName: String, val topicARN: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationRequest {
		val input = com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setTopicARN(this.topicARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.deleteNotificationConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling delete-notification-configuration")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("topic-arn", topicARN)
	}

}


fun AmazonAutoScalingFunctions.deletePolicy(policyName: String, init: AmazonAutoScalingDeletePolicyCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDeletePolicyCommand(policyName).apply(init))
}

@Generated
class AmazonAutoScalingDeletePolicyCommand(val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DeletePolicyRequest> {

	var autoScalingGroupName: String? = null

	override fun build(): com.amazonaws.services.autoscaling.model.DeletePolicyRequest {
		val input = com.amazonaws.services.autoscaling.model.DeletePolicyRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setPolicyName(this.policyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.deletePolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling delete-policy")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("policy-name", policyName)
	}

}


fun AmazonAutoScalingFunctions.deleteScheduledAction(autoScalingGroupName: String, scheduledActionName: String, init: AmazonAutoScalingDeleteScheduledActionCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDeleteScheduledActionCommand(autoScalingGroupName, scheduledActionName).apply(init))
}

@Generated
class AmazonAutoScalingDeleteScheduledActionCommand(val autoScalingGroupName: String, val scheduledActionName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DeleteScheduledActionRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.DeleteScheduledActionRequest {
		val input = com.amazonaws.services.autoscaling.model.DeleteScheduledActionRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setScheduledActionName(this.scheduledActionName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.deleteScheduledAction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling delete-scheduled-action")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("scheduled-action-name", scheduledActionName)
	}

}


fun AmazonAutoScalingFunctions.deleteTags(tags: List<com.amazonaws.services.autoscaling.model.Tag>, init: AmazonAutoScalingDeleteTagsCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDeleteTagsCommand(tags).apply(init))
}

@Generated
class AmazonAutoScalingDeleteTagsCommand(val tags: List<com.amazonaws.services.autoscaling.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DeleteTagsRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.DeleteTagsRequest {
		val input = com.amazonaws.services.autoscaling.model.DeleteTagsRequest()
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.deleteTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling delete-tags")
				.argument("tags", tags.toString())
	}

}


fun AmazonAutoScalingFunctions.describeAccountLimits(init: AmazonAutoScalingDescribeAccountLimitsCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeAccountLimitsCommand().apply(init))
}

@Generated
class AmazonAutoScalingDescribeAccountLimitsCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeAccountLimitsRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.DescribeAccountLimitsRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeAccountLimitsRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeAccountLimits(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-account-limits")

	}

}


fun AmazonAutoScalingFunctions.describeAdjustmentTypes(init: AmazonAutoScalingDescribeAdjustmentTypesCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeAdjustmentTypesCommand().apply(init))
}

@Generated
class AmazonAutoScalingDescribeAdjustmentTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeAdjustmentTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-adjustment-types")

	}

}


fun AmazonAutoScalingFunctions.describeAutoScalingGroups(init: AmazonAutoScalingDescribeAutoScalingGroupsCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeAutoScalingGroupsCommand().apply(init))
}

@Generated
class AmazonAutoScalingDescribeAutoScalingGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeAutoScalingGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-auto-scaling-groups")
				.argument("auto-scaling-group-names", autoScalingGroupNames?.toString())
				.argument("next-token", nextToken)
				.argument("max-records", maxRecords?.toString())
	}

}


fun AmazonAutoScalingFunctions.describeAutoScalingInstances(init: AmazonAutoScalingDescribeAutoScalingInstancesCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeAutoScalingInstancesCommand().apply(init))
}

@Generated
class AmazonAutoScalingDescribeAutoScalingInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeAutoScalingInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-auto-scaling-instances")
				.argument("instance-ids", instanceIds?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonAutoScalingFunctions.describeAutoScalingNotificationTypes(init: AmazonAutoScalingDescribeAutoScalingNotificationTypesCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeAutoScalingNotificationTypesCommand().apply(init))
}

@Generated
class AmazonAutoScalingDescribeAutoScalingNotificationTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeAutoScalingNotificationTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-auto-scaling-notification-types")

	}

}


fun AmazonAutoScalingFunctions.describeLaunchConfigurations(init: AmazonAutoScalingDescribeLaunchConfigurationsCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeLaunchConfigurationsCommand().apply(init))
}

@Generated
class AmazonAutoScalingDescribeLaunchConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeLaunchConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-launch-configurations")
				.argument("launch-configuration-names", launchConfigurationNames?.toString())
				.argument("next-token", nextToken)
				.argument("max-records", maxRecords?.toString())
	}

}


fun AmazonAutoScalingFunctions.describeLifecycleHookTypes(init: AmazonAutoScalingDescribeLifecycleHookTypesCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeLifecycleHookTypesCommand().apply(init))
}

@Generated
class AmazonAutoScalingDescribeLifecycleHookTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeLifecycleHookTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-lifecycle-hook-types")

	}

}


fun AmazonAutoScalingFunctions.describeLifecycleHooks(autoScalingGroupName: String, init: AmazonAutoScalingDescribeLifecycleHooksCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeLifecycleHooksCommand(autoScalingGroupName).apply(init))
}

@Generated
class AmazonAutoScalingDescribeLifecycleHooksCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksRequest> {

	var lifecycleHookNames: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setLifecycleHookNames(this.lifecycleHookNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeLifecycleHooks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-lifecycle-hooks")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("lifecycle-hook-names", lifecycleHookNames?.toString())
	}

}


fun AmazonAutoScalingFunctions.describeLoadBalancerTargetGroups(autoScalingGroupName: String, init: AmazonAutoScalingDescribeLoadBalancerTargetGroupsCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeLoadBalancerTargetGroupsCommand(autoScalingGroupName).apply(init))
}

@Generated
class AmazonAutoScalingDescribeLoadBalancerTargetGroupsCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsRequest> {

	var nextToken: String? = null
	var maxRecords: Int? = 0

	override fun build(): com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setNextToken(this.nextToken)
		input.setMaxRecords(this.maxRecords)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeLoadBalancerTargetGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-load-balancer-target-groups")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("next-token", nextToken)
				.argument("max-records", maxRecords?.toString())
	}

}


fun AmazonAutoScalingFunctions.describeLoadBalancers(autoScalingGroupName: String, init: AmazonAutoScalingDescribeLoadBalancersCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeLoadBalancersCommand(autoScalingGroupName).apply(init))
}

@Generated
class AmazonAutoScalingDescribeLoadBalancersCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeLoadBalancersRequest> {

	var nextToken: String? = null
	var maxRecords: Int? = 0

	override fun build(): com.amazonaws.services.autoscaling.model.DescribeLoadBalancersRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeLoadBalancersRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setNextToken(this.nextToken)
		input.setMaxRecords(this.maxRecords)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeLoadBalancers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-load-balancers")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("next-token", nextToken)
				.argument("max-records", maxRecords?.toString())
	}

}


fun AmazonAutoScalingFunctions.describeMetricCollectionTypes(init: AmazonAutoScalingDescribeMetricCollectionTypesCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeMetricCollectionTypesCommand().apply(init))
}

@Generated
class AmazonAutoScalingDescribeMetricCollectionTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeMetricCollectionTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-metric-collection-types")

	}

}


fun AmazonAutoScalingFunctions.describeNotificationConfigurations(init: AmazonAutoScalingDescribeNotificationConfigurationsCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeNotificationConfigurationsCommand().apply(init))
}

@Generated
class AmazonAutoScalingDescribeNotificationConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeNotificationConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-notification-configurations")
				.argument("auto-scaling-group-names", autoScalingGroupNames?.toString())
				.argument("next-token", nextToken)
				.argument("max-records", maxRecords?.toString())
	}

}


fun AmazonAutoScalingFunctions.describePolicies(init: AmazonAutoScalingDescribePoliciesCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribePoliciesCommand().apply(init))
}

@Generated
class AmazonAutoScalingDescribePoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribePoliciesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describePolicies(build())
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


fun AmazonAutoScalingFunctions.describeScalingActivities(init: AmazonAutoScalingDescribeScalingActivitiesCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeScalingActivitiesCommand().apply(init))
}

@Generated
class AmazonAutoScalingDescribeScalingActivitiesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeScalingActivities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-scaling-activities")
				.argument("activity-ids", activityIds?.toString())
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("max-records", maxRecords?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonAutoScalingFunctions.describeScalingProcessTypes(init: AmazonAutoScalingDescribeScalingProcessTypesCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeScalingProcessTypesCommand().apply(init))
}

@Generated
class AmazonAutoScalingDescribeScalingProcessTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeScalingProcessTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-scaling-process-types")

	}

}


fun AmazonAutoScalingFunctions.describeScheduledActions(init: AmazonAutoScalingDescribeScheduledActionsCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeScheduledActionsCommand().apply(init))
}

@Generated
class AmazonAutoScalingDescribeScheduledActionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeScheduledActionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeScheduledActions(build())
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


fun AmazonAutoScalingFunctions.describeTags(init: AmazonAutoScalingDescribeTagsCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeTagsCommand().apply(init))
}

@Generated
class AmazonAutoScalingDescribeTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeTagsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-tags")
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-records", maxRecords?.toString())
	}

}


fun AmazonAutoScalingFunctions.describeTerminationPolicyTypes(init: AmazonAutoScalingDescribeTerminationPolicyTypesCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDescribeTerminationPolicyTypesCommand().apply(init))
}

@Generated
class AmazonAutoScalingDescribeTerminationPolicyTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesRequest {
		val input = com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.describeTerminationPolicyTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling describe-termination-policy-types")

	}

}


fun AmazonAutoScalingFunctions.detachInstances(autoScalingGroupName: String, shouldDecrementDesiredCapacity: Boolean, init: AmazonAutoScalingDetachInstancesCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDetachInstancesCommand(autoScalingGroupName, shouldDecrementDesiredCapacity).apply(init))
}

@Generated
class AmazonAutoScalingDetachInstancesCommand(val autoScalingGroupName: String, val shouldDecrementDesiredCapacity: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DetachInstancesRequest> {

	var instanceIds: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.DetachInstancesRequest {
		val input = com.amazonaws.services.autoscaling.model.DetachInstancesRequest()
		input.setInstanceIds(this.instanceIds)
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setShouldDecrementDesiredCapacity(this.shouldDecrementDesiredCapacity)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.detachInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling detach-instances")
				.argument("instance-ids", instanceIds?.toString())
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.option("should-decrement-desired-capacity", shouldDecrementDesiredCapacity ?: false)
	}

}


fun AmazonAutoScalingFunctions.detachLoadBalancerTargetGroups(autoScalingGroupName: String, targetGroupARNs: List<String>, init: AmazonAutoScalingDetachLoadBalancerTargetGroupsCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDetachLoadBalancerTargetGroupsCommand(autoScalingGroupName, targetGroupARNs).apply(init))
}

@Generated
class AmazonAutoScalingDetachLoadBalancerTargetGroupsCommand(val autoScalingGroupName: String, val targetGroupARNs: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsRequest {
		val input = com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setTargetGroupARNs(this.targetGroupARNs)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.detachLoadBalancerTargetGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling detach-load-balancer-target-groups")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("target-group-arns", targetGroupARNs.toString())
	}

}


fun AmazonAutoScalingFunctions.detachLoadBalancers(autoScalingGroupName: String, loadBalancerNames: List<String>, init: AmazonAutoScalingDetachLoadBalancersCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDetachLoadBalancersCommand(autoScalingGroupName, loadBalancerNames).apply(init))
}

@Generated
class AmazonAutoScalingDetachLoadBalancersCommand(val autoScalingGroupName: String, val loadBalancerNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DetachLoadBalancersRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.DetachLoadBalancersRequest {
		val input = com.amazonaws.services.autoscaling.model.DetachLoadBalancersRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setLoadBalancerNames(this.loadBalancerNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.detachLoadBalancers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling detach-load-balancers")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("load-balancer-names", loadBalancerNames.toString())
	}

}


fun AmazonAutoScalingFunctions.disableMetricsCollection(autoScalingGroupName: String, init: AmazonAutoScalingDisableMetricsCollectionCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingDisableMetricsCollectionCommand(autoScalingGroupName).apply(init))
}

@Generated
class AmazonAutoScalingDisableMetricsCollectionCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.DisableMetricsCollectionRequest> {

	var metrics: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.DisableMetricsCollectionRequest {
		val input = com.amazonaws.services.autoscaling.model.DisableMetricsCollectionRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setMetrics(this.metrics)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.disableMetricsCollection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling disable-metrics-collection")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("metrics", metrics?.toString())
	}

}


fun AmazonAutoScalingFunctions.enableMetricsCollection(autoScalingGroupName: String, granularity: String, init: AmazonAutoScalingEnableMetricsCollectionCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingEnableMetricsCollectionCommand(autoScalingGroupName, granularity).apply(init))
}

@Generated
class AmazonAutoScalingEnableMetricsCollectionCommand(val autoScalingGroupName: String, val granularity: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.EnableMetricsCollectionRequest> {

	var metrics: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.EnableMetricsCollectionRequest {
		val input = com.amazonaws.services.autoscaling.model.EnableMetricsCollectionRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setMetrics(this.metrics)
		input.setGranularity(this.granularity)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.enableMetricsCollection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling enable-metrics-collection")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("metrics", metrics?.toString())
				.argument("granularity", granularity)
	}

}


fun AmazonAutoScalingFunctions.enterStandby(autoScalingGroupName: String, shouldDecrementDesiredCapacity: Boolean, init: AmazonAutoScalingEnterStandbyCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingEnterStandbyCommand(autoScalingGroupName, shouldDecrementDesiredCapacity).apply(init))
}

@Generated
class AmazonAutoScalingEnterStandbyCommand(val autoScalingGroupName: String, val shouldDecrementDesiredCapacity: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.EnterStandbyRequest> {

	var instanceIds: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.EnterStandbyRequest {
		val input = com.amazonaws.services.autoscaling.model.EnterStandbyRequest()
		input.setInstanceIds(this.instanceIds)
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setShouldDecrementDesiredCapacity(this.shouldDecrementDesiredCapacity)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.enterStandby(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling enter-standby")
				.argument("instance-ids", instanceIds?.toString())
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.option("should-decrement-desired-capacity", shouldDecrementDesiredCapacity ?: false)
	}

}


fun AmazonAutoScalingFunctions.executePolicy(policyName: String, init: AmazonAutoScalingExecutePolicyCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingExecutePolicyCommand(policyName).apply(init))
}

@Generated
class AmazonAutoScalingExecutePolicyCommand(val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.ExecutePolicyRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.executePolicy(build())
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


fun AmazonAutoScalingFunctions.exitStandby(autoScalingGroupName: String, init: AmazonAutoScalingExitStandbyCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingExitStandbyCommand(autoScalingGroupName).apply(init))
}

@Generated
class AmazonAutoScalingExitStandbyCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.ExitStandbyRequest> {

	var instanceIds: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.ExitStandbyRequest {
		val input = com.amazonaws.services.autoscaling.model.ExitStandbyRequest()
		input.setInstanceIds(this.instanceIds)
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.exitStandby(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling exit-standby")
				.argument("instance-ids", instanceIds?.toString())
				.argument("auto-scaling-group-name", autoScalingGroupName)
	}

}


fun AmazonAutoScalingFunctions.putLifecycleHook(lifecycleHookName: String, autoScalingGroupName: String, init: AmazonAutoScalingPutLifecycleHookCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingPutLifecycleHookCommand(lifecycleHookName, autoScalingGroupName).apply(init))
}

@Generated
class AmazonAutoScalingPutLifecycleHookCommand(val lifecycleHookName: String, val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.PutLifecycleHookRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.putLifecycleHook(build())
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


fun AmazonAutoScalingFunctions.putNotificationConfiguration(autoScalingGroupName: String, topicARN: String, notificationTypes: List<String>, init: AmazonAutoScalingPutNotificationConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingPutNotificationConfigurationCommand(autoScalingGroupName, topicARN, notificationTypes).apply(init))
}

@Generated
class AmazonAutoScalingPutNotificationConfigurationCommand(val autoScalingGroupName: String, val topicARN: String, val notificationTypes: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.PutNotificationConfigurationRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.PutNotificationConfigurationRequest {
		val input = com.amazonaws.services.autoscaling.model.PutNotificationConfigurationRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setTopicARN(this.topicARN)
		input.setNotificationTypes(this.notificationTypes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.putNotificationConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling put-notification-configuration")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("topic-arn", topicARN)
				.argument("notification-types", notificationTypes.toString())
	}

}


fun AmazonAutoScalingFunctions.putScalingPolicy(autoScalingGroupName: String, policyName: String, init: AmazonAutoScalingPutScalingPolicyCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingPutScalingPolicyCommand(autoScalingGroupName, policyName).apply(init))
}

@Generated
class AmazonAutoScalingPutScalingPolicyCommand(val autoScalingGroupName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.PutScalingPolicyRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.putScalingPolicy(build())
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


fun AmazonAutoScalingFunctions.putScheduledUpdateGroupAction(autoScalingGroupName: String, scheduledActionName: String, init: AmazonAutoScalingPutScheduledUpdateGroupActionCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingPutScheduledUpdateGroupActionCommand(autoScalingGroupName, scheduledActionName).apply(init))
}

@Generated
class AmazonAutoScalingPutScheduledUpdateGroupActionCommand(val autoScalingGroupName: String, val scheduledActionName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.putScheduledUpdateGroupAction(build())
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


fun AmazonAutoScalingFunctions.recordLifecycleActionHeartbeat(lifecycleHookName: String, autoScalingGroupName: String, init: AmazonAutoScalingRecordLifecycleActionHeartbeatCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingRecordLifecycleActionHeartbeatCommand(lifecycleHookName, autoScalingGroupName).apply(init))
}

@Generated
class AmazonAutoScalingRecordLifecycleActionHeartbeatCommand(val lifecycleHookName: String, val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.recordLifecycleActionHeartbeat(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling record-lifecycle-action-heartbeat")
				.argument("lifecycle-hook-name", lifecycleHookName)
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("lifecycle-action-token", lifecycleActionToken)
				.argument("instance-id", instanceId)
	}

}


fun AmazonAutoScalingFunctions.resumeProcesses(autoScalingGroupName: String, init: AmazonAutoScalingResumeProcessesCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingResumeProcessesCommand(autoScalingGroupName).apply(init))
}

@Generated
class AmazonAutoScalingResumeProcessesCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.ResumeProcessesRequest> {

	var scalingProcesses: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.ResumeProcessesRequest {
		val input = com.amazonaws.services.autoscaling.model.ResumeProcessesRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setScalingProcesses(this.scalingProcesses)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.resumeProcesses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling resume-processes")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("scaling-processes", scalingProcesses?.toString())
	}

}


fun AmazonAutoScalingFunctions.setDesiredCapacity(autoScalingGroupName: String, desiredCapacity: Int, init: AmazonAutoScalingSetDesiredCapacityCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingSetDesiredCapacityCommand(autoScalingGroupName, desiredCapacity).apply(init))
}

@Generated
class AmazonAutoScalingSetDesiredCapacityCommand(val autoScalingGroupName: String, val desiredCapacity: Int) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.SetDesiredCapacityRequest> {

	var honorCooldown: Boolean? = false

	override fun build(): com.amazonaws.services.autoscaling.model.SetDesiredCapacityRequest {
		val input = com.amazonaws.services.autoscaling.model.SetDesiredCapacityRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setDesiredCapacity(this.desiredCapacity)
		input.setHonorCooldown(this.honorCooldown)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.setDesiredCapacity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling set-desired-capacity")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("desired-capacity", desiredCapacity.toString())
				.option("honor-cooldown", honorCooldown ?: false)
	}

}


fun AmazonAutoScalingFunctions.setInstanceHealth(instanceId: String, healthStatus: String, init: AmazonAutoScalingSetInstanceHealthCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingSetInstanceHealthCommand(instanceId, healthStatus).apply(init))
}

@Generated
class AmazonAutoScalingSetInstanceHealthCommand(val instanceId: String, val healthStatus: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.SetInstanceHealthRequest> {

	var shouldRespectGracePeriod: Boolean? = false

	override fun build(): com.amazonaws.services.autoscaling.model.SetInstanceHealthRequest {
		val input = com.amazonaws.services.autoscaling.model.SetInstanceHealthRequest()
		input.setInstanceId(this.instanceId)
		input.setHealthStatus(this.healthStatus)
		input.setShouldRespectGracePeriod(this.shouldRespectGracePeriod)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.setInstanceHealth(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling set-instance-health")
				.argument("instance-id", instanceId)
				.argument("health-status", healthStatus)
				.option("should-respect-grace-period", shouldRespectGracePeriod ?: false)
	}

}


fun AmazonAutoScalingFunctions.setInstanceProtection(instanceIds: List<String>, autoScalingGroupName: String, protectedFromScaleIn: Boolean, init: AmazonAutoScalingSetInstanceProtectionCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingSetInstanceProtectionCommand(instanceIds, autoScalingGroupName, protectedFromScaleIn).apply(init))
}

@Generated
class AmazonAutoScalingSetInstanceProtectionCommand(val instanceIds: List<String>, val autoScalingGroupName: String, val protectedFromScaleIn: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.SetInstanceProtectionRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.SetInstanceProtectionRequest {
		val input = com.amazonaws.services.autoscaling.model.SetInstanceProtectionRequest()
		input.setInstanceIds(this.instanceIds)
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setProtectedFromScaleIn(this.protectedFromScaleIn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.setInstanceProtection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling set-instance-protection")
				.argument("instance-ids", instanceIds.toString())
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.option("protected-from-scale-in", protectedFromScaleIn ?: false)
	}

}


fun AmazonAutoScalingFunctions.suspendProcesses(autoScalingGroupName: String, init: AmazonAutoScalingSuspendProcessesCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingSuspendProcessesCommand(autoScalingGroupName).apply(init))
}

@Generated
class AmazonAutoScalingSuspendProcessesCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.SuspendProcessesRequest> {

	var scalingProcesses: List<String>? = null

	override fun build(): com.amazonaws.services.autoscaling.model.SuspendProcessesRequest {
		val input = com.amazonaws.services.autoscaling.model.SuspendProcessesRequest()
		input.setAutoScalingGroupName(this.autoScalingGroupName)
		input.setScalingProcesses(this.scalingProcesses)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.suspendProcesses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling suspend-processes")
				.argument("auto-scaling-group-name", autoScalingGroupName)
				.argument("scaling-processes", scalingProcesses?.toString())
	}

}


fun AmazonAutoScalingFunctions.terminateInstanceInAutoScalingGroup(instanceId: String, shouldDecrementDesiredCapacity: Boolean, init: AmazonAutoScalingTerminateInstanceInAutoScalingGroupCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingTerminateInstanceInAutoScalingGroupCommand(instanceId, shouldDecrementDesiredCapacity).apply(init))
}

@Generated
class AmazonAutoScalingTerminateInstanceInAutoScalingGroupCommand(val instanceId: String, val shouldDecrementDesiredCapacity: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupRequest> {



	override fun build(): com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupRequest {
		val input = com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupRequest()
		input.setInstanceId(this.instanceId)
		input.setShouldDecrementDesiredCapacity(this.shouldDecrementDesiredCapacity)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.terminateInstanceInAutoScalingGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling terminate-instance-in-auto-scaling-group")
				.argument("instance-id", instanceId)
				.option("should-decrement-desired-capacity", shouldDecrementDesiredCapacity ?: false)
	}

}


fun AmazonAutoScalingFunctions.updateAutoScalingGroup(autoScalingGroupName: String, init: AmazonAutoScalingUpdateAutoScalingGroupCommand.() -> Unit) {
	this.block.declare(AmazonAutoScalingUpdateAutoScalingGroupCommand(autoScalingGroupName).apply(init))
}

@Generated
class AmazonAutoScalingUpdateAutoScalingGroupCommand(val autoScalingGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling.updateAutoScalingGroup(build())
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
