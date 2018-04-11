
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.codedeploy.AmazonCodeDeploy
import com.amazonaws.services.codedeploy.model.*

var codingue.koops.core.Environment.codedeploy: AmazonCodeDeploy
	get() = this.capabilities[AmazonCodeDeploy::class.java.name] as AmazonCodeDeploy
	set(codedeploy) {
		this.capabilities[AmazonCodeDeploy::class.java.name] = codedeploy
	}

@Generated
class AmazonCodeDeployFunctions(val block: Block)

infix fun <T> AwsContinuation.codedeploy(init: AmazonCodeDeployFunctions.() -> T): T {
	return AmazonCodeDeployFunctions(shell).run(init)
}

			

fun AmazonCodeDeployFunctions.addTagsToOnPremisesInstances(init: AmazonCodeDeployAddTagsToOnPremisesInstancesCommand.() -> Unit): com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesResult {
	return this.block.declare(AmazonCodeDeployAddTagsToOnPremisesInstancesCommand().apply(init)) as com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesResult
}

@Generated
class AmazonCodeDeployAddTagsToOnPremisesInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesRequest, com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesResult> {

	var tags: List<com.amazonaws.services.codedeploy.model.Tag>? = null
	var instanceNames: List<String>? = null

	override fun build(): com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesRequest {
		val input = com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesRequest()
		input.setTags(this.tags)
		input.setInstanceNames(this.instanceNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesResult {
	  return com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesResult {
		return environment.codedeploy.addTagsToOnPremisesInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy add-tags-to-on-premises-instances")
				.argument("tags", tags?.toString())
				.argument("instance-names", instanceNames?.toString())
	}

}


fun AmazonCodeDeployFunctions.batchGetApplicationRevisions(init: AmazonCodeDeployBatchGetApplicationRevisionsCommand.() -> Unit): com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsResult {
	return this.block.declare(AmazonCodeDeployBatchGetApplicationRevisionsCommand().apply(init)) as com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsResult
}

@Generated
class AmazonCodeDeployBatchGetApplicationRevisionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsRequest, com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsResult> {

	var applicationName: String? = null
	var revisions: List<com.amazonaws.services.codedeploy.model.RevisionLocation>? = null

	override fun build(): com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsRequest {
		val input = com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsRequest()
		input.setApplicationName(this.applicationName)
		input.setRevisions(this.revisions)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsResult {
	  return com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsResult {
		return environment.codedeploy.batchGetApplicationRevisions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy batch-get-application-revisions")
				.argument("application-name", applicationName)
				.argument("revisions", revisions?.toString())
	}

}


fun AmazonCodeDeployFunctions.batchGetApplications(init: AmazonCodeDeployBatchGetApplicationsCommand.() -> Unit): com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult {
	return this.block.declare(AmazonCodeDeployBatchGetApplicationsCommand().apply(init)) as com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult
}

@Generated
class AmazonCodeDeployBatchGetApplicationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.BatchGetApplicationsRequest, com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult> {

	var applicationNames: List<String>? = null

	override fun build(): com.amazonaws.services.codedeploy.model.BatchGetApplicationsRequest {
		val input = com.amazonaws.services.codedeploy.model.BatchGetApplicationsRequest()
		input.setApplicationNames(this.applicationNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult {
	  return com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult {
		return environment.codedeploy.batchGetApplications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy batch-get-applications")
				.argument("application-names", applicationNames?.toString())
	}

}


fun AmazonCodeDeployFunctions.batchGetDeploymentGroups(init: AmazonCodeDeployBatchGetDeploymentGroupsCommand.() -> Unit): com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsResult {
	return this.block.declare(AmazonCodeDeployBatchGetDeploymentGroupsCommand().apply(init)) as com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsResult
}

@Generated
class AmazonCodeDeployBatchGetDeploymentGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsRequest, com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsResult> {

	var applicationName: String? = null
	var deploymentGroupNames: List<String>? = null

	override fun build(): com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsRequest {
		val input = com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsRequest()
		input.setApplicationName(this.applicationName)
		input.setDeploymentGroupNames(this.deploymentGroupNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsResult {
	  return com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsResult {
		return environment.codedeploy.batchGetDeploymentGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy batch-get-deployment-groups")
				.argument("application-name", applicationName)
				.argument("deployment-group-names", deploymentGroupNames?.toString())
	}

}


fun AmazonCodeDeployFunctions.batchGetDeploymentInstances(init: AmazonCodeDeployBatchGetDeploymentInstancesCommand.() -> Unit): com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesResult {
	return this.block.declare(AmazonCodeDeployBatchGetDeploymentInstancesCommand().apply(init)) as com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesResult
}

@Generated
class AmazonCodeDeployBatchGetDeploymentInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesRequest, com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesResult> {

	var deploymentId: String? = null
	var instanceIds: List<String>? = null

	override fun build(): com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesRequest {
		val input = com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesRequest()
		input.setDeploymentId(this.deploymentId)
		input.setInstanceIds(this.instanceIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesResult {
	  return com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesResult {
		return environment.codedeploy.batchGetDeploymentInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy batch-get-deployment-instances")
				.argument("deployment-id", deploymentId)
				.argument("instance-ids", instanceIds?.toString())
	}

}


fun AmazonCodeDeployFunctions.batchGetDeployments(init: AmazonCodeDeployBatchGetDeploymentsCommand.() -> Unit): com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult {
	return this.block.declare(AmazonCodeDeployBatchGetDeploymentsCommand().apply(init)) as com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult
}

@Generated
class AmazonCodeDeployBatchGetDeploymentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.BatchGetDeploymentsRequest, com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult> {

	var deploymentIds: List<String>? = null

	override fun build(): com.amazonaws.services.codedeploy.model.BatchGetDeploymentsRequest {
		val input = com.amazonaws.services.codedeploy.model.BatchGetDeploymentsRequest()
		input.setDeploymentIds(this.deploymentIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult {
	  return com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult {
		return environment.codedeploy.batchGetDeployments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy batch-get-deployments")
				.argument("deployment-ids", deploymentIds?.toString())
	}

}


fun AmazonCodeDeployFunctions.batchGetOnPremisesInstances(init: AmazonCodeDeployBatchGetOnPremisesInstancesCommand.() -> Unit): com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult {
	return this.block.declare(AmazonCodeDeployBatchGetOnPremisesInstancesCommand().apply(init)) as com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult
}

@Generated
class AmazonCodeDeployBatchGetOnPremisesInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesRequest, com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult> {

	var instanceNames: List<String>? = null

	override fun build(): com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesRequest {
		val input = com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesRequest()
		input.setInstanceNames(this.instanceNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult {
	  return com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult {
		return environment.codedeploy.batchGetOnPremisesInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy batch-get-on-premises-instances")
				.argument("instance-names", instanceNames?.toString())
	}

}


fun AmazonCodeDeployFunctions.continueDeployment(init: AmazonCodeDeployContinueDeploymentCommand.() -> Unit): com.amazonaws.services.codedeploy.model.ContinueDeploymentResult {
	return this.block.declare(AmazonCodeDeployContinueDeploymentCommand().apply(init)) as com.amazonaws.services.codedeploy.model.ContinueDeploymentResult
}

@Generated
class AmazonCodeDeployContinueDeploymentCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.ContinueDeploymentRequest, com.amazonaws.services.codedeploy.model.ContinueDeploymentResult> {

	var deploymentId: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.ContinueDeploymentRequest {
		val input = com.amazonaws.services.codedeploy.model.ContinueDeploymentRequest()
		input.setDeploymentId(this.deploymentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.ContinueDeploymentResult {
	  return com.amazonaws.services.codedeploy.model.ContinueDeploymentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.ContinueDeploymentResult {
		return environment.codedeploy.continueDeployment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy continue-deployment")
				.argument("deployment-id", deploymentId)
	}

}


fun AmazonCodeDeployFunctions.createApplication(init: AmazonCodeDeployCreateApplicationCommand.() -> Unit): com.amazonaws.services.codedeploy.model.CreateApplicationResult {
	return this.block.declare(AmazonCodeDeployCreateApplicationCommand().apply(init)) as com.amazonaws.services.codedeploy.model.CreateApplicationResult
}

@Generated
class AmazonCodeDeployCreateApplicationCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.CreateApplicationRequest, com.amazonaws.services.codedeploy.model.CreateApplicationResult> {

	var applicationName: String? = null
	var computePlatform: ComputePlatform? = null

	override fun build(): com.amazonaws.services.codedeploy.model.CreateApplicationRequest {
		val input = com.amazonaws.services.codedeploy.model.CreateApplicationRequest()
		input.setApplicationName(this.applicationName)
		input.setComputePlatform(this.computePlatform?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.CreateApplicationResult {
	  return com.amazonaws.services.codedeploy.model.CreateApplicationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.CreateApplicationResult {
		return environment.codedeploy.createApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy create-application")
				.argument("application-name", applicationName)
				.argument("compute-platform", computePlatform?.toString())
	}

}


fun AmazonCodeDeployFunctions.createDeployment(init: AmazonCodeDeployCreateDeploymentCommand.() -> Unit): com.amazonaws.services.codedeploy.model.CreateDeploymentResult {
	return this.block.declare(AmazonCodeDeployCreateDeploymentCommand().apply(init)) as com.amazonaws.services.codedeploy.model.CreateDeploymentResult
}

@Generated
class AmazonCodeDeployCreateDeploymentCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.CreateDeploymentRequest, com.amazonaws.services.codedeploy.model.CreateDeploymentResult> {

	var applicationName: String? = null
	var deploymentGroupName: String? = null
	var revision: com.amazonaws.services.codedeploy.model.RevisionLocation? = null
	var deploymentConfigName: String? = null
	var description: String? = null
	var ignoreApplicationStopFailures: Boolean? = false
	var targetInstances: com.amazonaws.services.codedeploy.model.TargetInstances? = null
	var autoRollbackConfiguration: com.amazonaws.services.codedeploy.model.AutoRollbackConfiguration? = null
	var updateOutdatedInstancesOnly: Boolean? = false
	var fileExistsBehavior: FileExistsBehavior? = null

	override fun build(): com.amazonaws.services.codedeploy.model.CreateDeploymentRequest {
		val input = com.amazonaws.services.codedeploy.model.CreateDeploymentRequest()
		input.setApplicationName(this.applicationName)
		input.setDeploymentGroupName(this.deploymentGroupName)
		input.setRevision(this.revision)
		input.setDeploymentConfigName(this.deploymentConfigName)
		input.setDescription(this.description)
		input.setIgnoreApplicationStopFailures(this.ignoreApplicationStopFailures)
		input.setTargetInstances(this.targetInstances)
		input.setAutoRollbackConfiguration(this.autoRollbackConfiguration)
		input.setUpdateOutdatedInstancesOnly(this.updateOutdatedInstancesOnly)
		input.setFileExistsBehavior(this.fileExistsBehavior?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.CreateDeploymentResult {
	  return com.amazonaws.services.codedeploy.model.CreateDeploymentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.CreateDeploymentResult {
		return environment.codedeploy.createDeployment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy create-deployment")
				.argument("application-name", applicationName)
				.argument("deployment-group-name", deploymentGroupName)
				.argument("revision", revision?.toString())
				.argument("deployment-config-name", deploymentConfigName)
				.argument("description", description)
				.option("ignore-application-stop-failures", ignoreApplicationStopFailures ?: false)
				.argument("target-instances", targetInstances?.toString())
				.argument("auto-rollback-configuration", autoRollbackConfiguration?.toString())
				.option("update-outdated-instances-only", updateOutdatedInstancesOnly ?: false)
				.argument("file-exists-behavior", fileExistsBehavior?.toString())
	}

}


fun AmazonCodeDeployFunctions.createDeploymentConfig(init: AmazonCodeDeployCreateDeploymentConfigCommand.() -> Unit): com.amazonaws.services.codedeploy.model.CreateDeploymentConfigResult {
	return this.block.declare(AmazonCodeDeployCreateDeploymentConfigCommand().apply(init)) as com.amazonaws.services.codedeploy.model.CreateDeploymentConfigResult
}

@Generated
class AmazonCodeDeployCreateDeploymentConfigCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.CreateDeploymentConfigRequest, com.amazonaws.services.codedeploy.model.CreateDeploymentConfigResult> {

	var deploymentConfigName: String? = null
	var minimumHealthyHosts: com.amazonaws.services.codedeploy.model.MinimumHealthyHosts? = null
	var trafficRoutingConfig: com.amazonaws.services.codedeploy.model.TrafficRoutingConfig? = null
	var computePlatform: ComputePlatform? = null

	override fun build(): com.amazonaws.services.codedeploy.model.CreateDeploymentConfigRequest {
		val input = com.amazonaws.services.codedeploy.model.CreateDeploymentConfigRequest()
		input.setDeploymentConfigName(this.deploymentConfigName)
		input.setMinimumHealthyHosts(this.minimumHealthyHosts)
		input.setTrafficRoutingConfig(this.trafficRoutingConfig)
		input.setComputePlatform(this.computePlatform?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.CreateDeploymentConfigResult {
	  return com.amazonaws.services.codedeploy.model.CreateDeploymentConfigResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.CreateDeploymentConfigResult {
		return environment.codedeploy.createDeploymentConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy create-deployment-config")
				.argument("deployment-config-name", deploymentConfigName)
				.argument("minimum-healthy-hosts", minimumHealthyHosts?.toString())
				.argument("traffic-routing-config", trafficRoutingConfig?.toString())
				.argument("compute-platform", computePlatform?.toString())
	}

}


fun AmazonCodeDeployFunctions.createDeploymentGroup(init: AmazonCodeDeployCreateDeploymentGroupCommand.() -> Unit): com.amazonaws.services.codedeploy.model.CreateDeploymentGroupResult {
	return this.block.declare(AmazonCodeDeployCreateDeploymentGroupCommand().apply(init)) as com.amazonaws.services.codedeploy.model.CreateDeploymentGroupResult
}

@Generated
class AmazonCodeDeployCreateDeploymentGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.CreateDeploymentGroupRequest, com.amazonaws.services.codedeploy.model.CreateDeploymentGroupResult> {

	var applicationName: String? = null
	var deploymentGroupName: String? = null
	var deploymentConfigName: String? = null
	var ec2TagFilters: List<com.amazonaws.services.codedeploy.model.EC2TagFilter>? = null
	var onPremisesInstanceTagFilters: List<com.amazonaws.services.codedeploy.model.TagFilter>? = null
	var autoScalingGroups: List<String>? = null
	var serviceRoleArn: String? = null
	var triggerConfigurations: List<com.amazonaws.services.codedeploy.model.TriggerConfig>? = null
	var alarmConfiguration: com.amazonaws.services.codedeploy.model.AlarmConfiguration? = null
	var autoRollbackConfiguration: com.amazonaws.services.codedeploy.model.AutoRollbackConfiguration? = null
	var deploymentStyle: com.amazonaws.services.codedeploy.model.DeploymentStyle? = null
	var blueGreenDeploymentConfiguration: com.amazonaws.services.codedeploy.model.BlueGreenDeploymentConfiguration? = null
	var loadBalancerInfo: com.amazonaws.services.codedeploy.model.LoadBalancerInfo? = null
	var ec2TagSet: com.amazonaws.services.codedeploy.model.EC2TagSet? = null
	var onPremisesTagSet: com.amazonaws.services.codedeploy.model.OnPremisesTagSet? = null

	override fun build(): com.amazonaws.services.codedeploy.model.CreateDeploymentGroupRequest {
		val input = com.amazonaws.services.codedeploy.model.CreateDeploymentGroupRequest()
		input.setApplicationName(this.applicationName)
		input.setDeploymentGroupName(this.deploymentGroupName)
		input.setDeploymentConfigName(this.deploymentConfigName)
		input.setEc2TagFilters(this.ec2TagFilters)
		input.setOnPremisesInstanceTagFilters(this.onPremisesInstanceTagFilters)
		input.setAutoScalingGroups(this.autoScalingGroups)
		input.setServiceRoleArn(this.serviceRoleArn)
		input.setTriggerConfigurations(this.triggerConfigurations)
		input.setAlarmConfiguration(this.alarmConfiguration)
		input.setAutoRollbackConfiguration(this.autoRollbackConfiguration)
		input.setDeploymentStyle(this.deploymentStyle)
		input.setBlueGreenDeploymentConfiguration(this.blueGreenDeploymentConfiguration)
		input.setLoadBalancerInfo(this.loadBalancerInfo)
		input.setEc2TagSet(this.ec2TagSet)
		input.setOnPremisesTagSet(this.onPremisesTagSet)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.CreateDeploymentGroupResult {
	  return com.amazonaws.services.codedeploy.model.CreateDeploymentGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.CreateDeploymentGroupResult {
		return environment.codedeploy.createDeploymentGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy create-deployment-group")
				.argument("application-name", applicationName)
				.argument("deployment-group-name", deploymentGroupName)
				.argument("deployment-config-name", deploymentConfigName)
				.argument("ec2-tag-filters", ec2TagFilters?.toString())
				.argument("on-premises-instance-tag-filters", onPremisesInstanceTagFilters?.toString())
				.argument("auto-scaling-groups", autoScalingGroups?.toString())
				.argument("service-role-arn", serviceRoleArn)
				.argument("trigger-configurations", triggerConfigurations?.toString())
				.argument("alarm-configuration", alarmConfiguration?.toString())
				.argument("auto-rollback-configuration", autoRollbackConfiguration?.toString())
				.argument("deployment-style", deploymentStyle?.toString())
				.argument("blue-green-deployment-configuration", blueGreenDeploymentConfiguration?.toString())
				.argument("load-balancer-info", loadBalancerInfo?.toString())
				.argument("ec2-tag-set", ec2TagSet?.toString())
				.argument("on-premises-tag-set", onPremisesTagSet?.toString())
	}

}


fun AmazonCodeDeployFunctions.deleteApplication(init: AmazonCodeDeployDeleteApplicationCommand.() -> Unit): com.amazonaws.services.codedeploy.model.DeleteApplicationResult {
	return this.block.declare(AmazonCodeDeployDeleteApplicationCommand().apply(init)) as com.amazonaws.services.codedeploy.model.DeleteApplicationResult
}

@Generated
class AmazonCodeDeployDeleteApplicationCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.DeleteApplicationRequest, com.amazonaws.services.codedeploy.model.DeleteApplicationResult> {

	var applicationName: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.DeleteApplicationRequest {
		val input = com.amazonaws.services.codedeploy.model.DeleteApplicationRequest()
		input.setApplicationName(this.applicationName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.DeleteApplicationResult {
	  return com.amazonaws.services.codedeploy.model.DeleteApplicationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.DeleteApplicationResult {
		return environment.codedeploy.deleteApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy delete-application")
				.argument("application-name", applicationName)
	}

}


fun AmazonCodeDeployFunctions.deleteDeploymentConfig(init: AmazonCodeDeployDeleteDeploymentConfigCommand.() -> Unit): com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigResult {
	return this.block.declare(AmazonCodeDeployDeleteDeploymentConfigCommand().apply(init)) as com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigResult
}

@Generated
class AmazonCodeDeployDeleteDeploymentConfigCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigRequest, com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigResult> {

	var deploymentConfigName: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigRequest {
		val input = com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigRequest()
		input.setDeploymentConfigName(this.deploymentConfigName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigResult {
	  return com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigResult {
		return environment.codedeploy.deleteDeploymentConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy delete-deployment-config")
				.argument("deployment-config-name", deploymentConfigName)
	}

}


fun AmazonCodeDeployFunctions.deleteDeploymentGroup(init: AmazonCodeDeployDeleteDeploymentGroupCommand.() -> Unit): com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupResult {
	return this.block.declare(AmazonCodeDeployDeleteDeploymentGroupCommand().apply(init)) as com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupResult
}

@Generated
class AmazonCodeDeployDeleteDeploymentGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupRequest, com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupResult> {

	var applicationName: String? = null
	var deploymentGroupName: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupRequest {
		val input = com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupRequest()
		input.setApplicationName(this.applicationName)
		input.setDeploymentGroupName(this.deploymentGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupResult {
	  return com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupResult {
		return environment.codedeploy.deleteDeploymentGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy delete-deployment-group")
				.argument("application-name", applicationName)
				.argument("deployment-group-name", deploymentGroupName)
	}

}


fun AmazonCodeDeployFunctions.deleteGitHubAccountToken(init: AmazonCodeDeployDeleteGitHubAccountTokenCommand.() -> Unit): com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenResult {
	return this.block.declare(AmazonCodeDeployDeleteGitHubAccountTokenCommand().apply(init)) as com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenResult
}

@Generated
class AmazonCodeDeployDeleteGitHubAccountTokenCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenRequest, com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenResult> {

	var tokenName: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenRequest {
		val input = com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenRequest()
		input.setTokenName(this.tokenName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenResult {
	  return com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenResult {
		return environment.codedeploy.deleteGitHubAccountToken(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy delete-git-hub-account-token")
				.argument("token-name", tokenName)
	}

}


fun AmazonCodeDeployFunctions.deregisterOnPremisesInstance(init: AmazonCodeDeployDeregisterOnPremisesInstanceCommand.() -> Unit): com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceResult {
	return this.block.declare(AmazonCodeDeployDeregisterOnPremisesInstanceCommand().apply(init)) as com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceResult
}

@Generated
class AmazonCodeDeployDeregisterOnPremisesInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceRequest, com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceResult> {

	var instanceName: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceRequest {
		val input = com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceRequest()
		input.setInstanceName(this.instanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceResult {
	  return com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceResult {
		return environment.codedeploy.deregisterOnPremisesInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy deregister-on-premises-instance")
				.argument("instance-name", instanceName)
	}

}


fun AmazonCodeDeployFunctions.getApplication(init: AmazonCodeDeployGetApplicationCommand.() -> Unit): com.amazonaws.services.codedeploy.model.GetApplicationResult {
	return this.block.declare(AmazonCodeDeployGetApplicationCommand().apply(init)) as com.amazonaws.services.codedeploy.model.GetApplicationResult
}

@Generated
class AmazonCodeDeployGetApplicationCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.GetApplicationRequest, com.amazonaws.services.codedeploy.model.GetApplicationResult> {

	var applicationName: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.GetApplicationRequest {
		val input = com.amazonaws.services.codedeploy.model.GetApplicationRequest()
		input.setApplicationName(this.applicationName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.GetApplicationResult {
	  return com.amazonaws.services.codedeploy.model.GetApplicationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.GetApplicationResult {
		return environment.codedeploy.getApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy get-application")
				.argument("application-name", applicationName)
	}

}


fun AmazonCodeDeployFunctions.getApplicationRevision(init: AmazonCodeDeployGetApplicationRevisionCommand.() -> Unit): com.amazonaws.services.codedeploy.model.GetApplicationRevisionResult {
	return this.block.declare(AmazonCodeDeployGetApplicationRevisionCommand().apply(init)) as com.amazonaws.services.codedeploy.model.GetApplicationRevisionResult
}

@Generated
class AmazonCodeDeployGetApplicationRevisionCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.GetApplicationRevisionRequest, com.amazonaws.services.codedeploy.model.GetApplicationRevisionResult> {

	var applicationName: String? = null
	var revision: com.amazonaws.services.codedeploy.model.RevisionLocation? = null

	override fun build(): com.amazonaws.services.codedeploy.model.GetApplicationRevisionRequest {
		val input = com.amazonaws.services.codedeploy.model.GetApplicationRevisionRequest()
		input.setApplicationName(this.applicationName)
		input.setRevision(this.revision)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.GetApplicationRevisionResult {
	  return com.amazonaws.services.codedeploy.model.GetApplicationRevisionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.GetApplicationRevisionResult {
		return environment.codedeploy.getApplicationRevision(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy get-application-revision")
				.argument("application-name", applicationName)
				.argument("revision", revision?.toString())
	}

}


fun AmazonCodeDeployFunctions.getDeployment(init: AmazonCodeDeployGetDeploymentCommand.() -> Unit): com.amazonaws.services.codedeploy.model.GetDeploymentResult {
	return this.block.declare(AmazonCodeDeployGetDeploymentCommand().apply(init)) as com.amazonaws.services.codedeploy.model.GetDeploymentResult
}

@Generated
class AmazonCodeDeployGetDeploymentCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.GetDeploymentRequest, com.amazonaws.services.codedeploy.model.GetDeploymentResult> {

	var deploymentId: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.GetDeploymentRequest {
		val input = com.amazonaws.services.codedeploy.model.GetDeploymentRequest()
		input.setDeploymentId(this.deploymentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.GetDeploymentResult {
	  return com.amazonaws.services.codedeploy.model.GetDeploymentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.GetDeploymentResult {
		return environment.codedeploy.getDeployment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy get-deployment")
				.argument("deployment-id", deploymentId)
	}

}


fun AmazonCodeDeployFunctions.getDeploymentConfig(init: AmazonCodeDeployGetDeploymentConfigCommand.() -> Unit): com.amazonaws.services.codedeploy.model.GetDeploymentConfigResult {
	return this.block.declare(AmazonCodeDeployGetDeploymentConfigCommand().apply(init)) as com.amazonaws.services.codedeploy.model.GetDeploymentConfigResult
}

@Generated
class AmazonCodeDeployGetDeploymentConfigCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.GetDeploymentConfigRequest, com.amazonaws.services.codedeploy.model.GetDeploymentConfigResult> {

	var deploymentConfigName: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.GetDeploymentConfigRequest {
		val input = com.amazonaws.services.codedeploy.model.GetDeploymentConfigRequest()
		input.setDeploymentConfigName(this.deploymentConfigName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.GetDeploymentConfigResult {
	  return com.amazonaws.services.codedeploy.model.GetDeploymentConfigResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.GetDeploymentConfigResult {
		return environment.codedeploy.getDeploymentConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy get-deployment-config")
				.argument("deployment-config-name", deploymentConfigName)
	}

}


fun AmazonCodeDeployFunctions.getDeploymentGroup(init: AmazonCodeDeployGetDeploymentGroupCommand.() -> Unit): com.amazonaws.services.codedeploy.model.GetDeploymentGroupResult {
	return this.block.declare(AmazonCodeDeployGetDeploymentGroupCommand().apply(init)) as com.amazonaws.services.codedeploy.model.GetDeploymentGroupResult
}

@Generated
class AmazonCodeDeployGetDeploymentGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.GetDeploymentGroupRequest, com.amazonaws.services.codedeploy.model.GetDeploymentGroupResult> {

	var applicationName: String? = null
	var deploymentGroupName: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.GetDeploymentGroupRequest {
		val input = com.amazonaws.services.codedeploy.model.GetDeploymentGroupRequest()
		input.setApplicationName(this.applicationName)
		input.setDeploymentGroupName(this.deploymentGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.GetDeploymentGroupResult {
	  return com.amazonaws.services.codedeploy.model.GetDeploymentGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.GetDeploymentGroupResult {
		return environment.codedeploy.getDeploymentGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy get-deployment-group")
				.argument("application-name", applicationName)
				.argument("deployment-group-name", deploymentGroupName)
	}

}


fun AmazonCodeDeployFunctions.getDeploymentInstance(init: AmazonCodeDeployGetDeploymentInstanceCommand.() -> Unit): com.amazonaws.services.codedeploy.model.GetDeploymentInstanceResult {
	return this.block.declare(AmazonCodeDeployGetDeploymentInstanceCommand().apply(init)) as com.amazonaws.services.codedeploy.model.GetDeploymentInstanceResult
}

@Generated
class AmazonCodeDeployGetDeploymentInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.GetDeploymentInstanceRequest, com.amazonaws.services.codedeploy.model.GetDeploymentInstanceResult> {

	var deploymentId: String? = null
	var instanceId: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.GetDeploymentInstanceRequest {
		val input = com.amazonaws.services.codedeploy.model.GetDeploymentInstanceRequest()
		input.setDeploymentId(this.deploymentId)
		input.setInstanceId(this.instanceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.GetDeploymentInstanceResult {
	  return com.amazonaws.services.codedeploy.model.GetDeploymentInstanceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.GetDeploymentInstanceResult {
		return environment.codedeploy.getDeploymentInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy get-deployment-instance")
				.argument("deployment-id", deploymentId)
				.argument("instance-id", instanceId)
	}

}


fun AmazonCodeDeployFunctions.getOnPremisesInstance(init: AmazonCodeDeployGetOnPremisesInstanceCommand.() -> Unit): com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceResult {
	return this.block.declare(AmazonCodeDeployGetOnPremisesInstanceCommand().apply(init)) as com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceResult
}

@Generated
class AmazonCodeDeployGetOnPremisesInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceRequest, com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceResult> {

	var instanceName: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceRequest {
		val input = com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceRequest()
		input.setInstanceName(this.instanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceResult {
	  return com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceResult {
		return environment.codedeploy.getOnPremisesInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy get-on-premises-instance")
				.argument("instance-name", instanceName)
	}

}


fun AmazonCodeDeployFunctions.listApplicationRevisions(init: AmazonCodeDeployListApplicationRevisionsCommand.() -> Unit): com.amazonaws.services.codedeploy.model.ListApplicationRevisionsResult {
	return this.block.declare(AmazonCodeDeployListApplicationRevisionsCommand().apply(init)) as com.amazonaws.services.codedeploy.model.ListApplicationRevisionsResult
}

@Generated
class AmazonCodeDeployListApplicationRevisionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.ListApplicationRevisionsRequest, com.amazonaws.services.codedeploy.model.ListApplicationRevisionsResult> {

	var applicationName: String? = null
	var sortBy: ApplicationRevisionSortBy? = null
	var sortOrder: SortOrder? = null
	var s3Bucket: String? = null
	var s3KeyPrefix: String? = null
	var deployed: ListStateFilterAction? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.ListApplicationRevisionsRequest {
		val input = com.amazonaws.services.codedeploy.model.ListApplicationRevisionsRequest()
		input.setApplicationName(this.applicationName)
		input.setSortBy(this.sortBy?.toString())
		input.setSortOrder(this.sortOrder?.toString())
		input.setS3Bucket(this.s3Bucket)
		input.setS3KeyPrefix(this.s3KeyPrefix)
		input.setDeployed(this.deployed?.toString())
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.ListApplicationRevisionsResult {
	  return com.amazonaws.services.codedeploy.model.ListApplicationRevisionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.ListApplicationRevisionsResult {
		return environment.codedeploy.listApplicationRevisions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy list-application-revisions")
				.argument("application-name", applicationName)
				.argument("sort-by", sortBy?.toString())
				.argument("sort-order", sortOrder?.toString())
				.argument("s3-bucket", s3Bucket)
				.argument("s3-key-prefix", s3KeyPrefix)
				.argument("deployed", deployed?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonCodeDeployFunctions.listApplications(init: AmazonCodeDeployListApplicationsCommand.() -> Unit): com.amazonaws.services.codedeploy.model.ListApplicationsResult {
	return this.block.declare(AmazonCodeDeployListApplicationsCommand().apply(init)) as com.amazonaws.services.codedeploy.model.ListApplicationsResult
}

@Generated
class AmazonCodeDeployListApplicationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.ListApplicationsRequest, com.amazonaws.services.codedeploy.model.ListApplicationsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.ListApplicationsRequest {
		val input = com.amazonaws.services.codedeploy.model.ListApplicationsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.ListApplicationsResult {
	  return com.amazonaws.services.codedeploy.model.ListApplicationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.ListApplicationsResult {
		return environment.codedeploy.listApplications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy list-applications")
				.argument("next-token", nextToken)
	}

}


fun AmazonCodeDeployFunctions.listDeploymentConfigs(init: AmazonCodeDeployListDeploymentConfigsCommand.() -> Unit): com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult {
	return this.block.declare(AmazonCodeDeployListDeploymentConfigsCommand().apply(init)) as com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult
}

@Generated
class AmazonCodeDeployListDeploymentConfigsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.ListDeploymentConfigsRequest, com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.ListDeploymentConfigsRequest {
		val input = com.amazonaws.services.codedeploy.model.ListDeploymentConfigsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult {
	  return com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult {
		return environment.codedeploy.listDeploymentConfigs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy list-deployment-configs")
				.argument("next-token", nextToken)
	}

}


fun AmazonCodeDeployFunctions.listDeploymentGroups(init: AmazonCodeDeployListDeploymentGroupsCommand.() -> Unit): com.amazonaws.services.codedeploy.model.ListDeploymentGroupsResult {
	return this.block.declare(AmazonCodeDeployListDeploymentGroupsCommand().apply(init)) as com.amazonaws.services.codedeploy.model.ListDeploymentGroupsResult
}

@Generated
class AmazonCodeDeployListDeploymentGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.ListDeploymentGroupsRequest, com.amazonaws.services.codedeploy.model.ListDeploymentGroupsResult> {

	var applicationName: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.ListDeploymentGroupsRequest {
		val input = com.amazonaws.services.codedeploy.model.ListDeploymentGroupsRequest()
		input.setApplicationName(this.applicationName)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.ListDeploymentGroupsResult {
	  return com.amazonaws.services.codedeploy.model.ListDeploymentGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.ListDeploymentGroupsResult {
		return environment.codedeploy.listDeploymentGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy list-deployment-groups")
				.argument("application-name", applicationName)
				.argument("next-token", nextToken)
	}

}


fun AmazonCodeDeployFunctions.listDeploymentInstances(init: AmazonCodeDeployListDeploymentInstancesCommand.() -> Unit): com.amazonaws.services.codedeploy.model.ListDeploymentInstancesResult {
	return this.block.declare(AmazonCodeDeployListDeploymentInstancesCommand().apply(init)) as com.amazonaws.services.codedeploy.model.ListDeploymentInstancesResult
}

@Generated
class AmazonCodeDeployListDeploymentInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.ListDeploymentInstancesRequest, com.amazonaws.services.codedeploy.model.ListDeploymentInstancesResult> {

	var deploymentId: String? = null
	var nextToken: String? = null
	var instanceStatusFilter: List<InstanceStatus>? = null
	var instanceTypeFilter: List<InstanceType>? = null

	override fun build(): com.amazonaws.services.codedeploy.model.ListDeploymentInstancesRequest {
		val input = com.amazonaws.services.codedeploy.model.ListDeploymentInstancesRequest()
		input.setDeploymentId(this.deploymentId)
		input.setNextToken(this.nextToken)
		input.setInstanceStatusFilter(this.instanceStatusFilter?.map { it.toString() })
		input.setInstanceTypeFilter(this.instanceTypeFilter?.map { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.ListDeploymentInstancesResult {
	  return com.amazonaws.services.codedeploy.model.ListDeploymentInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.ListDeploymentInstancesResult {
		return environment.codedeploy.listDeploymentInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy list-deployment-instances")
				.argument("deployment-id", deploymentId)
				.argument("next-token", nextToken)
				.argument("instance-status-filter", instanceStatusFilter?.toString())
				.argument("instance-type-filter", instanceTypeFilter?.toString())
	}

}


fun AmazonCodeDeployFunctions.listDeployments(init: AmazonCodeDeployListDeploymentsCommand.() -> Unit): com.amazonaws.services.codedeploy.model.ListDeploymentsResult {
	return this.block.declare(AmazonCodeDeployListDeploymentsCommand().apply(init)) as com.amazonaws.services.codedeploy.model.ListDeploymentsResult
}

@Generated
class AmazonCodeDeployListDeploymentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.ListDeploymentsRequest, com.amazonaws.services.codedeploy.model.ListDeploymentsResult> {

	var applicationName: String? = null
	var deploymentGroupName: String? = null
	var includeOnlyStatuses: List<DeploymentStatus>? = null
	var createTimeRange: com.amazonaws.services.codedeploy.model.TimeRange? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.ListDeploymentsRequest {
		val input = com.amazonaws.services.codedeploy.model.ListDeploymentsRequest()
		input.setApplicationName(this.applicationName)
		input.setDeploymentGroupName(this.deploymentGroupName)
		input.setIncludeOnlyStatuses(this.includeOnlyStatuses?.map { it.toString() })
		input.setCreateTimeRange(this.createTimeRange)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.ListDeploymentsResult {
	  return com.amazonaws.services.codedeploy.model.ListDeploymentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.ListDeploymentsResult {
		return environment.codedeploy.listDeployments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy list-deployments")
				.argument("application-name", applicationName)
				.argument("deployment-group-name", deploymentGroupName)
				.argument("include-only-statuses", includeOnlyStatuses?.toString())
				.argument("create-time-range", createTimeRange?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonCodeDeployFunctions.listGitHubAccountTokenNames(init: AmazonCodeDeployListGitHubAccountTokenNamesCommand.() -> Unit): com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesResult {
	return this.block.declare(AmazonCodeDeployListGitHubAccountTokenNamesCommand().apply(init)) as com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesResult
}

@Generated
class AmazonCodeDeployListGitHubAccountTokenNamesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesRequest, com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesRequest {
		val input = com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesResult {
	  return com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesResult {
		return environment.codedeploy.listGitHubAccountTokenNames(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy list-git-hub-account-token-names")
				.argument("next-token", nextToken)
	}

}


fun AmazonCodeDeployFunctions.listOnPremisesInstances(init: AmazonCodeDeployListOnPremisesInstancesCommand.() -> Unit): com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult {
	return this.block.declare(AmazonCodeDeployListOnPremisesInstancesCommand().apply(init)) as com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult
}

@Generated
class AmazonCodeDeployListOnPremisesInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesRequest, com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult> {

	var registrationStatus: RegistrationStatus? = null
	var tagFilters: List<com.amazonaws.services.codedeploy.model.TagFilter>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesRequest {
		val input = com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesRequest()
		input.setRegistrationStatus(this.registrationStatus?.toString())
		input.setTagFilters(this.tagFilters)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult {
	  return com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult {
		return environment.codedeploy.listOnPremisesInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy list-on-premises-instances")
				.argument("registration-status", registrationStatus?.toString())
				.argument("tag-filters", tagFilters?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonCodeDeployFunctions.putLifecycleEventHookExecutionStatus(init: AmazonCodeDeployPutLifecycleEventHookExecutionStatusCommand.() -> Unit): com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusResult {
	return this.block.declare(AmazonCodeDeployPutLifecycleEventHookExecutionStatusCommand().apply(init)) as com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusResult
}

@Generated
class AmazonCodeDeployPutLifecycleEventHookExecutionStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusRequest, com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusResult> {

	var deploymentId: String? = null
	var lifecycleEventHookExecutionId: String? = null
	var status: LifecycleEventStatus? = null

	override fun build(): com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusRequest {
		val input = com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusRequest()
		input.setDeploymentId(this.deploymentId)
		input.setLifecycleEventHookExecutionId(this.lifecycleEventHookExecutionId)
		input.setStatus(this.status?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusResult {
	  return com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusResult {
		return environment.codedeploy.putLifecycleEventHookExecutionStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy put-lifecycle-event-hook-execution-status")
				.argument("deployment-id", deploymentId)
				.argument("lifecycle-event-hook-execution-id", lifecycleEventHookExecutionId)
				.argument("status", status?.toString())
	}

}


fun AmazonCodeDeployFunctions.registerApplicationRevision(init: AmazonCodeDeployRegisterApplicationRevisionCommand.() -> Unit): com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionResult {
	return this.block.declare(AmazonCodeDeployRegisterApplicationRevisionCommand().apply(init)) as com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionResult
}

@Generated
class AmazonCodeDeployRegisterApplicationRevisionCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionRequest, com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionResult> {

	var applicationName: String? = null
	var description: String? = null
	var revision: com.amazonaws.services.codedeploy.model.RevisionLocation? = null

	override fun build(): com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionRequest {
		val input = com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionRequest()
		input.setApplicationName(this.applicationName)
		input.setDescription(this.description)
		input.setRevision(this.revision)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionResult {
	  return com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionResult {
		return environment.codedeploy.registerApplicationRevision(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy register-application-revision")
				.argument("application-name", applicationName)
				.argument("description", description)
				.argument("revision", revision?.toString())
	}

}


fun AmazonCodeDeployFunctions.registerOnPremisesInstance(init: AmazonCodeDeployRegisterOnPremisesInstanceCommand.() -> Unit): com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceResult {
	return this.block.declare(AmazonCodeDeployRegisterOnPremisesInstanceCommand().apply(init)) as com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceResult
}

@Generated
class AmazonCodeDeployRegisterOnPremisesInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceRequest, com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceResult> {

	var instanceName: String? = null
	var iamSessionArn: String? = null
	var iamUserArn: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceRequest {
		val input = com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceRequest()
		input.setInstanceName(this.instanceName)
		input.setIamSessionArn(this.iamSessionArn)
		input.setIamUserArn(this.iamUserArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceResult {
	  return com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceResult {
		return environment.codedeploy.registerOnPremisesInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy register-on-premises-instance")
				.argument("instance-name", instanceName)
				.argument("iam-session-arn", iamSessionArn)
				.argument("iam-user-arn", iamUserArn)
	}

}


fun AmazonCodeDeployFunctions.removeTagsFromOnPremisesInstances(init: AmazonCodeDeployRemoveTagsFromOnPremisesInstancesCommand.() -> Unit): com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesResult {
	return this.block.declare(AmazonCodeDeployRemoveTagsFromOnPremisesInstancesCommand().apply(init)) as com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesResult
}

@Generated
class AmazonCodeDeployRemoveTagsFromOnPremisesInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesRequest, com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesResult> {

	var tags: List<com.amazonaws.services.codedeploy.model.Tag>? = null
	var instanceNames: List<String>? = null

	override fun build(): com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesRequest {
		val input = com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesRequest()
		input.setTags(this.tags)
		input.setInstanceNames(this.instanceNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesResult {
	  return com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesResult {
		return environment.codedeploy.removeTagsFromOnPremisesInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy remove-tags-from-on-premises-instances")
				.argument("tags", tags?.toString())
				.argument("instance-names", instanceNames?.toString())
	}

}


fun AmazonCodeDeployFunctions.skipWaitTimeForInstanceTermination(init: AmazonCodeDeploySkipWaitTimeForInstanceTerminationCommand.() -> Unit): com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationResult {
	return this.block.declare(AmazonCodeDeploySkipWaitTimeForInstanceTerminationCommand().apply(init)) as com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationResult
}

@Generated
class AmazonCodeDeploySkipWaitTimeForInstanceTerminationCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationRequest, com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationResult> {

	var deploymentId: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationRequest {
		val input = com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationRequest()
		input.setDeploymentId(this.deploymentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationResult {
	  return com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationResult {
		return environment.codedeploy.skipWaitTimeForInstanceTermination(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy skip-wait-time-for-instance-termination")
				.argument("deployment-id", deploymentId)
	}

}


fun AmazonCodeDeployFunctions.stopDeployment(init: AmazonCodeDeployStopDeploymentCommand.() -> Unit): com.amazonaws.services.codedeploy.model.StopDeploymentResult {
	return this.block.declare(AmazonCodeDeployStopDeploymentCommand().apply(init)) as com.amazonaws.services.codedeploy.model.StopDeploymentResult
}

@Generated
class AmazonCodeDeployStopDeploymentCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.StopDeploymentRequest, com.amazonaws.services.codedeploy.model.StopDeploymentResult> {

	var deploymentId: String? = null
	var autoRollbackEnabled: Boolean? = false

	override fun build(): com.amazonaws.services.codedeploy.model.StopDeploymentRequest {
		val input = com.amazonaws.services.codedeploy.model.StopDeploymentRequest()
		input.setDeploymentId(this.deploymentId)
		input.setAutoRollbackEnabled(this.autoRollbackEnabled)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.StopDeploymentResult {
	  return com.amazonaws.services.codedeploy.model.StopDeploymentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.StopDeploymentResult {
		return environment.codedeploy.stopDeployment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy stop-deployment")
				.argument("deployment-id", deploymentId)
				.option("auto-rollback-enabled", autoRollbackEnabled ?: false)
	}

}


fun AmazonCodeDeployFunctions.updateApplication(init: AmazonCodeDeployUpdateApplicationCommand.() -> Unit): com.amazonaws.services.codedeploy.model.UpdateApplicationResult {
	return this.block.declare(AmazonCodeDeployUpdateApplicationCommand().apply(init)) as com.amazonaws.services.codedeploy.model.UpdateApplicationResult
}

@Generated
class AmazonCodeDeployUpdateApplicationCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.UpdateApplicationRequest, com.amazonaws.services.codedeploy.model.UpdateApplicationResult> {

	var applicationName: String? = null
	var newApplicationName: String? = null

	override fun build(): com.amazonaws.services.codedeploy.model.UpdateApplicationRequest {
		val input = com.amazonaws.services.codedeploy.model.UpdateApplicationRequest()
		input.setApplicationName(this.applicationName)
		input.setNewApplicationName(this.newApplicationName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.UpdateApplicationResult {
	  return com.amazonaws.services.codedeploy.model.UpdateApplicationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.UpdateApplicationResult {
		return environment.codedeploy.updateApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy update-application")
				.argument("application-name", applicationName)
				.argument("new-application-name", newApplicationName)
	}

}


fun AmazonCodeDeployFunctions.updateDeploymentGroup(init: AmazonCodeDeployUpdateDeploymentGroupCommand.() -> Unit): com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupResult {
	return this.block.declare(AmazonCodeDeployUpdateDeploymentGroupCommand().apply(init)) as com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupResult
}

@Generated
class AmazonCodeDeployUpdateDeploymentGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupRequest, com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupResult> {

	var applicationName: String? = null
	var currentDeploymentGroupName: String? = null
	var newDeploymentGroupName: String? = null
	var deploymentConfigName: String? = null
	var ec2TagFilters: List<com.amazonaws.services.codedeploy.model.EC2TagFilter>? = null
	var onPremisesInstanceTagFilters: List<com.amazonaws.services.codedeploy.model.TagFilter>? = null
	var autoScalingGroups: List<String>? = null
	var serviceRoleArn: String? = null
	var triggerConfigurations: List<com.amazonaws.services.codedeploy.model.TriggerConfig>? = null
	var alarmConfiguration: com.amazonaws.services.codedeploy.model.AlarmConfiguration? = null
	var autoRollbackConfiguration: com.amazonaws.services.codedeploy.model.AutoRollbackConfiguration? = null
	var deploymentStyle: com.amazonaws.services.codedeploy.model.DeploymentStyle? = null
	var blueGreenDeploymentConfiguration: com.amazonaws.services.codedeploy.model.BlueGreenDeploymentConfiguration? = null
	var loadBalancerInfo: com.amazonaws.services.codedeploy.model.LoadBalancerInfo? = null
	var ec2TagSet: com.amazonaws.services.codedeploy.model.EC2TagSet? = null
	var onPremisesTagSet: com.amazonaws.services.codedeploy.model.OnPremisesTagSet? = null

	override fun build(): com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupRequest {
		val input = com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentDeploymentGroupName(this.currentDeploymentGroupName)
		input.setNewDeploymentGroupName(this.newDeploymentGroupName)
		input.setDeploymentConfigName(this.deploymentConfigName)
		input.setEc2TagFilters(this.ec2TagFilters)
		input.setOnPremisesInstanceTagFilters(this.onPremisesInstanceTagFilters)
		input.setAutoScalingGroups(this.autoScalingGroups)
		input.setServiceRoleArn(this.serviceRoleArn)
		input.setTriggerConfigurations(this.triggerConfigurations)
		input.setAlarmConfiguration(this.alarmConfiguration)
		input.setAutoRollbackConfiguration(this.autoRollbackConfiguration)
		input.setDeploymentStyle(this.deploymentStyle)
		input.setBlueGreenDeploymentConfiguration(this.blueGreenDeploymentConfiguration)
		input.setLoadBalancerInfo(this.loadBalancerInfo)
		input.setEc2TagSet(this.ec2TagSet)
		input.setOnPremisesTagSet(this.onPremisesTagSet)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupResult {
	  return com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupResult {
		return environment.codedeploy.updateDeploymentGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codedeploy update-deployment-group")
				.argument("application-name", applicationName)
				.argument("current-deployment-group-name", currentDeploymentGroupName)
				.argument("new-deployment-group-name", newDeploymentGroupName)
				.argument("deployment-config-name", deploymentConfigName)
				.argument("ec2-tag-filters", ec2TagFilters?.toString())
				.argument("on-premises-instance-tag-filters", onPremisesInstanceTagFilters?.toString())
				.argument("auto-scaling-groups", autoScalingGroups?.toString())
				.argument("service-role-arn", serviceRoleArn)
				.argument("trigger-configurations", triggerConfigurations?.toString())
				.argument("alarm-configuration", alarmConfiguration?.toString())
				.argument("auto-rollback-configuration", autoRollbackConfiguration?.toString())
				.argument("deployment-style", deploymentStyle?.toString())
				.argument("blue-green-deployment-configuration", blueGreenDeploymentConfiguration?.toString())
				.argument("load-balancer-info", loadBalancerInfo?.toString())
				.argument("ec2-tag-set", ec2TagSet?.toString())
				.argument("on-premises-tag-set", onPremisesTagSet?.toString())
	}

}
