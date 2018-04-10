
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce
import com.amazonaws.services.elasticmapreduce.model.*

var codingue.koops.core.Environment.elasticmapreduce: AmazonElasticMapReduce
	get() = this.capabilities[AmazonElasticMapReduce::class.java.name] as AmazonElasticMapReduce
	set(elasticmapreduce) {
		this.capabilities[AmazonElasticMapReduce::class.java.name] = elasticmapreduce
	}

@Generated
class AmazonElasticMapReduceFunctions(val block: Block)

infix fun AwsContinuation.elasticmapreduce(init: AmazonElasticMapReduceFunctions.() -> Unit) {
	AmazonElasticMapReduceFunctions(shell).apply(init)
}

			

fun AmazonElasticMapReduceFunctions.addInstanceFleet(clusterId: String, instanceFleet: com.amazonaws.services.elasticmapreduce.model.InstanceFleetConfig, init: AmazonElasticMapReduceAddInstanceFleetCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceAddInstanceFleetCommand(clusterId, instanceFleet).apply(init))
}

@Generated
class AmazonElasticMapReduceAddInstanceFleetCommand(val clusterId: String, val instanceFleet: com.amazonaws.services.elasticmapreduce.model.InstanceFleetConfig) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetRequest> {



	override fun build(): com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.AddInstanceFleetRequest()
		input.setClusterId(this.clusterId)
		input.setInstanceFleet(this.instanceFleet)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.addInstanceFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce add-instance-fleet")
				.argument("cluster-id", clusterId)
				.argument("instance-fleet", instanceFleet.toString())
	}

}


fun AmazonElasticMapReduceFunctions.addInstanceGroups(instanceGroups: List<com.amazonaws.services.elasticmapreduce.model.InstanceGroupConfig>, jobFlowId: String, init: AmazonElasticMapReduceAddInstanceGroupsCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceAddInstanceGroupsCommand(instanceGroups, jobFlowId).apply(init))
}

@Generated
class AmazonElasticMapReduceAddInstanceGroupsCommand(val instanceGroups: List<com.amazonaws.services.elasticmapreduce.model.InstanceGroupConfig>, val jobFlowId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsRequest> {



	override fun build(): com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.AddInstanceGroupsRequest()
		input.setInstanceGroups(this.instanceGroups)
		input.setJobFlowId(this.jobFlowId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.addInstanceGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce add-instance-groups")
				.argument("instance-groups", instanceGroups.toString())
				.argument("job-flow-id", jobFlowId)
	}

}


fun AmazonElasticMapReduceFunctions.addJobFlowSteps(jobFlowId: String, steps: List<com.amazonaws.services.elasticmapreduce.model.StepConfig>, init: AmazonElasticMapReduceAddJobFlowStepsCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceAddJobFlowStepsCommand(jobFlowId, steps).apply(init))
}

@Generated
class AmazonElasticMapReduceAddJobFlowStepsCommand(val jobFlowId: String, val steps: List<com.amazonaws.services.elasticmapreduce.model.StepConfig>) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsRequest> {



	override fun build(): com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.AddJobFlowStepsRequest()
		input.setJobFlowId(this.jobFlowId)
		input.setSteps(this.steps)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.addJobFlowSteps(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce add-job-flow-steps")
				.argument("job-flow-id", jobFlowId)
				.argument("steps", steps.toString())
	}

}


fun AmazonElasticMapReduceFunctions.addTags(resourceId: String, tags: List<com.amazonaws.services.elasticmapreduce.model.Tag>, init: AmazonElasticMapReduceAddTagsCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceAddTagsCommand(resourceId, tags).apply(init))
}

@Generated
class AmazonElasticMapReduceAddTagsCommand(val resourceId: String, val tags: List<com.amazonaws.services.elasticmapreduce.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.AddTagsRequest> {



	override fun build(): com.amazonaws.services.elasticmapreduce.model.AddTagsRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.AddTagsRequest()
		input.setResourceId(this.resourceId)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.addTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce add-tags")
				.argument("resource-id", resourceId)
				.argument("tags", tags.toString())
	}

}


fun AmazonElasticMapReduceFunctions.cancelSteps(init: AmazonElasticMapReduceCancelStepsCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceCancelStepsCommand().apply(init))
}

@Generated
class AmazonElasticMapReduceCancelStepsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.CancelStepsRequest> {

	var clusterId: String? = null
	var stepIds: List<String>? = null

	override fun build(): com.amazonaws.services.elasticmapreduce.model.CancelStepsRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.CancelStepsRequest()
		input.setClusterId(this.clusterId)
		input.setStepIds(this.stepIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.cancelSteps(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce cancel-steps")
				.argument("cluster-id", clusterId)
				.argument("step-ids", stepIds?.toString())
	}

}


fun AmazonElasticMapReduceFunctions.createSecurityConfiguration(name: String, securityConfiguration: String, init: AmazonElasticMapReduceCreateSecurityConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceCreateSecurityConfigurationCommand(name, securityConfiguration).apply(init))
}

@Generated
class AmazonElasticMapReduceCreateSecurityConfigurationCommand(val name: String, val securityConfiguration: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationRequest> {



	override fun build(): com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.CreateSecurityConfigurationRequest()
		input.setName(this.name)
		input.setSecurityConfiguration(this.securityConfiguration)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.createSecurityConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce create-security-configuration")
				.argument("name", name)
				.argument("security-configuration", securityConfiguration)
	}

}


fun AmazonElasticMapReduceFunctions.deleteSecurityConfiguration(name: String, init: AmazonElasticMapReduceDeleteSecurityConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceDeleteSecurityConfigurationCommand(name).apply(init))
}

@Generated
class AmazonElasticMapReduceDeleteSecurityConfigurationCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationRequest> {



	override fun build(): com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.DeleteSecurityConfigurationRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.deleteSecurityConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce delete-security-configuration")
				.argument("name", name)
	}

}


fun AmazonElasticMapReduceFunctions.describeCluster(clusterId: String, init: AmazonElasticMapReduceDescribeClusterCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceDescribeClusterCommand(clusterId).apply(init))
}

@Generated
class AmazonElasticMapReduceDescribeClusterCommand(val clusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.DescribeClusterRequest> {



	override fun build(): com.amazonaws.services.elasticmapreduce.model.DescribeClusterRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.DescribeClusterRequest()
		input.setClusterId(this.clusterId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.describeCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce describe-cluster")
				.argument("cluster-id", clusterId)
	}

}


fun AmazonElasticMapReduceFunctions.describeJobFlows(init: AmazonElasticMapReduceDescribeJobFlowsCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceDescribeJobFlowsCommand().apply(init))
}

@Generated
class AmazonElasticMapReduceDescribeJobFlowsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsRequest> {

	var createdAfter: java.util.Date? = null
	var createdBefore: java.util.Date? = null
	var jobFlowIds: List<String>? = null
	var jobFlowStates: List<JobFlowExecutionState>? = null

	override fun build(): com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.DescribeJobFlowsRequest()
		input.setCreatedAfter(this.createdAfter)
		input.setCreatedBefore(this.createdBefore)
		input.setJobFlowIds(this.jobFlowIds)
		input.setJobFlowStates(this.jobFlowStates?.map { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.describeJobFlows(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce describe-job-flows")
				.argument("created-after", createdAfter?.toString())
				.argument("created-before", createdBefore?.toString())
				.argument("job-flow-ids", jobFlowIds?.toString())
				.argument("job-flow-states", jobFlowStates?.toString())
	}

}


fun AmazonElasticMapReduceFunctions.describeSecurityConfiguration(name: String, init: AmazonElasticMapReduceDescribeSecurityConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceDescribeSecurityConfigurationCommand(name).apply(init))
}

@Generated
class AmazonElasticMapReduceDescribeSecurityConfigurationCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationRequest> {



	override fun build(): com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.DescribeSecurityConfigurationRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.describeSecurityConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce describe-security-configuration")
				.argument("name", name)
	}

}


fun AmazonElasticMapReduceFunctions.describeStep(clusterId: String, stepId: String, init: AmazonElasticMapReduceDescribeStepCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceDescribeStepCommand(clusterId, stepId).apply(init))
}

@Generated
class AmazonElasticMapReduceDescribeStepCommand(val clusterId: String, val stepId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.DescribeStepRequest> {



	override fun build(): com.amazonaws.services.elasticmapreduce.model.DescribeStepRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.DescribeStepRequest()
		input.setClusterId(this.clusterId)
		input.setStepId(this.stepId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.describeStep(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce describe-step")
				.argument("cluster-id", clusterId)
				.argument("step-id", stepId)
	}

}


fun AmazonElasticMapReduceFunctions.listBootstrapActions(clusterId: String, init: AmazonElasticMapReduceListBootstrapActionsCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceListBootstrapActionsCommand(clusterId).apply(init))
}

@Generated
class AmazonElasticMapReduceListBootstrapActionsCommand(val clusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsRequest> {

	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.ListBootstrapActionsRequest()
		input.setClusterId(this.clusterId)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.listBootstrapActions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce list-bootstrap-actions")
				.argument("cluster-id", clusterId)
				.argument("marker", marker)
	}

}


fun AmazonElasticMapReduceFunctions.listClusters(init: AmazonElasticMapReduceListClustersCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceListClustersCommand().apply(init))
}

@Generated
class AmazonElasticMapReduceListClustersCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.ListClustersRequest> {

	var createdAfter: java.util.Date? = null
	var createdBefore: java.util.Date? = null
	var clusterStates: List<ClusterState>? = null
	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticmapreduce.model.ListClustersRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.ListClustersRequest()
		input.setCreatedAfter(this.createdAfter)
		input.setCreatedBefore(this.createdBefore)
		input.setClusterStates(this.clusterStates?.map { it.toString() })
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.listClusters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce list-clusters")
				.argument("created-after", createdAfter?.toString())
				.argument("created-before", createdBefore?.toString())
				.argument("cluster-states", clusterStates?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElasticMapReduceFunctions.listInstanceFleets(clusterId: String, init: AmazonElasticMapReduceListInstanceFleetsCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceListInstanceFleetsCommand(clusterId).apply(init))
}

@Generated
class AmazonElasticMapReduceListInstanceFleetsCommand(val clusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsRequest> {

	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.ListInstanceFleetsRequest()
		input.setClusterId(this.clusterId)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.listInstanceFleets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce list-instance-fleets")
				.argument("cluster-id", clusterId)
				.argument("marker", marker)
	}

}


fun AmazonElasticMapReduceFunctions.listInstanceGroups(clusterId: String, init: AmazonElasticMapReduceListInstanceGroupsCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceListInstanceGroupsCommand(clusterId).apply(init))
}

@Generated
class AmazonElasticMapReduceListInstanceGroupsCommand(val clusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsRequest> {

	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.ListInstanceGroupsRequest()
		input.setClusterId(this.clusterId)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.listInstanceGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce list-instance-groups")
				.argument("cluster-id", clusterId)
				.argument("marker", marker)
	}

}


fun AmazonElasticMapReduceFunctions.listInstances(clusterId: String, init: AmazonElasticMapReduceListInstancesCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceListInstancesCommand(clusterId).apply(init))
}

@Generated
class AmazonElasticMapReduceListInstancesCommand(val clusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.ListInstancesRequest> {

	var instanceGroupId: String? = null
	var instanceGroupTypes: List<InstanceGroupType>? = null
	var instanceFleetId: String? = null
	var instanceFleetType: InstanceFleetType? = null
	var instanceStates: List<InstanceState>? = null
	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticmapreduce.model.ListInstancesRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.ListInstancesRequest()
		input.setClusterId(this.clusterId)
		input.setInstanceGroupId(this.instanceGroupId)
		input.setInstanceGroupTypes(this.instanceGroupTypes?.map { it.toString() })
		input.setInstanceFleetId(this.instanceFleetId)
		input.setInstanceFleetType(this.instanceFleetType?.toString())
		input.setInstanceStates(this.instanceStates?.map { it.toString() })
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.listInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce list-instances")
				.argument("cluster-id", clusterId)
				.argument("instance-group-id", instanceGroupId)
				.argument("instance-group-types", instanceGroupTypes?.toString())
				.argument("instance-fleet-id", instanceFleetId)
				.argument("instance-fleet-type", instanceFleetType?.toString())
				.argument("instance-states", instanceStates?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElasticMapReduceFunctions.listSecurityConfigurations(init: AmazonElasticMapReduceListSecurityConfigurationsCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceListSecurityConfigurationsCommand().apply(init))
}

@Generated
class AmazonElasticMapReduceListSecurityConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsRequest> {

	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.ListSecurityConfigurationsRequest()
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.listSecurityConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce list-security-configurations")
				.argument("marker", marker)
	}

}


fun AmazonElasticMapReduceFunctions.listSteps(clusterId: String, init: AmazonElasticMapReduceListStepsCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceListStepsCommand(clusterId).apply(init))
}

@Generated
class AmazonElasticMapReduceListStepsCommand(val clusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.ListStepsRequest> {

	var stepStates: List<StepState>? = null
	var stepIds: List<String>? = null
	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticmapreduce.model.ListStepsRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.ListStepsRequest()
		input.setClusterId(this.clusterId)
		input.setStepStates(this.stepStates?.map { it.toString() })
		input.setStepIds(this.stepIds)
		input.setMarker(this.marker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.listSteps(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce list-steps")
				.argument("cluster-id", clusterId)
				.argument("step-states", stepStates?.toString())
				.argument("step-ids", stepIds?.toString())
				.argument("marker", marker)
	}

}


fun AmazonElasticMapReduceFunctions.modifyInstanceFleet(clusterId: String, instanceFleet: com.amazonaws.services.elasticmapreduce.model.InstanceFleetModifyConfig, init: AmazonElasticMapReduceModifyInstanceFleetCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceModifyInstanceFleetCommand(clusterId, instanceFleet).apply(init))
}

@Generated
class AmazonElasticMapReduceModifyInstanceFleetCommand(val clusterId: String, val instanceFleet: com.amazonaws.services.elasticmapreduce.model.InstanceFleetModifyConfig) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetRequest> {



	override fun build(): com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.ModifyInstanceFleetRequest()
		input.setClusterId(this.clusterId)
		input.setInstanceFleet(this.instanceFleet)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.modifyInstanceFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce modify-instance-fleet")
				.argument("cluster-id", clusterId)
				.argument("instance-fleet", instanceFleet.toString())
	}

}


fun AmazonElasticMapReduceFunctions.modifyInstanceGroups(init: AmazonElasticMapReduceModifyInstanceGroupsCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceModifyInstanceGroupsCommand().apply(init))
}

@Generated
class AmazonElasticMapReduceModifyInstanceGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsRequest> {

	var clusterId: String? = null
	var instanceGroups: List<com.amazonaws.services.elasticmapreduce.model.InstanceGroupModifyConfig>? = null

	override fun build(): com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.ModifyInstanceGroupsRequest()
		input.setClusterId(this.clusterId)
		input.setInstanceGroups(this.instanceGroups)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.modifyInstanceGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce modify-instance-groups")
				.argument("cluster-id", clusterId)
				.argument("instance-groups", instanceGroups?.toString())
	}

}


fun AmazonElasticMapReduceFunctions.putAutoScalingPolicy(clusterId: String, instanceGroupId: String, autoScalingPolicy: com.amazonaws.services.elasticmapreduce.model.AutoScalingPolicy, init: AmazonElasticMapReducePutAutoScalingPolicyCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReducePutAutoScalingPolicyCommand(clusterId, instanceGroupId, autoScalingPolicy).apply(init))
}

@Generated
class AmazonElasticMapReducePutAutoScalingPolicyCommand(val clusterId: String, val instanceGroupId: String, val autoScalingPolicy: com.amazonaws.services.elasticmapreduce.model.AutoScalingPolicy) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyRequest> {



	override fun build(): com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.PutAutoScalingPolicyRequest()
		input.setClusterId(this.clusterId)
		input.setInstanceGroupId(this.instanceGroupId)
		input.setAutoScalingPolicy(this.autoScalingPolicy)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.putAutoScalingPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce put-auto-scaling-policy")
				.argument("cluster-id", clusterId)
				.argument("instance-group-id", instanceGroupId)
				.argument("auto-scaling-policy", autoScalingPolicy.toString())
	}

}


fun AmazonElasticMapReduceFunctions.removeAutoScalingPolicy(clusterId: String, instanceGroupId: String, init: AmazonElasticMapReduceRemoveAutoScalingPolicyCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceRemoveAutoScalingPolicyCommand(clusterId, instanceGroupId).apply(init))
}

@Generated
class AmazonElasticMapReduceRemoveAutoScalingPolicyCommand(val clusterId: String, val instanceGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyRequest> {



	override fun build(): com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.RemoveAutoScalingPolicyRequest()
		input.setClusterId(this.clusterId)
		input.setInstanceGroupId(this.instanceGroupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.removeAutoScalingPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce remove-auto-scaling-policy")
				.argument("cluster-id", clusterId)
				.argument("instance-group-id", instanceGroupId)
	}

}


fun AmazonElasticMapReduceFunctions.removeTags(resourceId: String, tagKeys: List<String>, init: AmazonElasticMapReduceRemoveTagsCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceRemoveTagsCommand(resourceId, tagKeys).apply(init))
}

@Generated
class AmazonElasticMapReduceRemoveTagsCommand(val resourceId: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.RemoveTagsRequest> {



	override fun build(): com.amazonaws.services.elasticmapreduce.model.RemoveTagsRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.RemoveTagsRequest()
		input.setResourceId(this.resourceId)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.removeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce remove-tags")
				.argument("resource-id", resourceId)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonElasticMapReduceFunctions.runJobFlow(name: String, instances: com.amazonaws.services.elasticmapreduce.model.JobFlowInstancesConfig, init: AmazonElasticMapReduceRunJobFlowCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceRunJobFlowCommand(name, instances).apply(init))
}

@Generated
class AmazonElasticMapReduceRunJobFlowCommand(val name: String, val instances: com.amazonaws.services.elasticmapreduce.model.JobFlowInstancesConfig) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest> {

	var logUri: String? = null
	var additionalInfo: String? = null
	var amiVersion: String? = null
	var releaseLabel: String? = null
	var steps: List<com.amazonaws.services.elasticmapreduce.model.StepConfig>? = null
	var bootstrapActions: List<com.amazonaws.services.elasticmapreduce.model.BootstrapActionConfig>? = null
	var supportedProducts: List<String>? = null
	var newSupportedProducts: List<com.amazonaws.services.elasticmapreduce.model.SupportedProductConfig>? = null
	var applications: List<com.amazonaws.services.elasticmapreduce.model.Application>? = null
	var configurations: List<com.amazonaws.services.elasticmapreduce.model.Configuration>? = null
	var visibleToAllUsers: Boolean? = false
	var jobFlowRole: String? = null
	var serviceRole: String? = null
	var tags: List<com.amazonaws.services.elasticmapreduce.model.Tag>? = null
	var securityConfiguration: String? = null
	var autoScalingRole: String? = null
	var scaleDownBehavior: ScaleDownBehavior? = null
	var customAmiId: String? = null
	var ebsRootVolumeSize: Int? = 0
	var repoUpgradeOnBoot: RepoUpgradeOnBoot? = null
	var kerberosAttributes: com.amazonaws.services.elasticmapreduce.model.KerberosAttributes? = null

	override fun build(): com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest()
		input.setName(this.name)
		input.setLogUri(this.logUri)
		input.setAdditionalInfo(this.additionalInfo)
		input.setAmiVersion(this.amiVersion)
		input.setReleaseLabel(this.releaseLabel)
		input.setInstances(this.instances)
		input.setSteps(this.steps)
		input.setBootstrapActions(this.bootstrapActions)
		input.setSupportedProducts(this.supportedProducts)
		input.setNewSupportedProducts(this.newSupportedProducts)
		input.setApplications(this.applications)
		input.setConfigurations(this.configurations)
		input.setVisibleToAllUsers(this.visibleToAllUsers)
		input.setJobFlowRole(this.jobFlowRole)
		input.setServiceRole(this.serviceRole)
		input.setTags(this.tags)
		input.setSecurityConfiguration(this.securityConfiguration)
		input.setAutoScalingRole(this.autoScalingRole)
		input.setScaleDownBehavior(this.scaleDownBehavior?.toString())
		input.setCustomAmiId(this.customAmiId)
		input.setEbsRootVolumeSize(this.ebsRootVolumeSize)
		input.setRepoUpgradeOnBoot(this.repoUpgradeOnBoot?.toString())
		input.setKerberosAttributes(this.kerberosAttributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.runJobFlow(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce run-job-flow")
				.argument("name", name)
				.argument("log-uri", logUri)
				.argument("additional-info", additionalInfo)
				.argument("ami-version", amiVersion)
				.argument("release-label", releaseLabel)
				.argument("instances", instances.toString())
				.argument("steps", steps?.toString())
				.argument("bootstrap-actions", bootstrapActions?.toString())
				.argument("supported-products", supportedProducts?.toString())
				.argument("new-supported-products", newSupportedProducts?.toString())
				.argument("applications", applications?.toString())
				.argument("configurations", configurations?.toString())
				.option("visible-to-all-users", visibleToAllUsers ?: false)
				.argument("job-flow-role", jobFlowRole)
				.argument("service-role", serviceRole)
				.argument("tags", tags?.toString())
				.argument("security-configuration", securityConfiguration)
				.argument("auto-scaling-role", autoScalingRole)
				.argument("scale-down-behavior", scaleDownBehavior?.toString())
				.argument("custom-ami-id", customAmiId)
				.argument("ebs-root-volume-size", ebsRootVolumeSize?.toString())
				.argument("repo-upgrade-on-boot", repoUpgradeOnBoot?.toString())
				.argument("kerberos-attributes", kerberosAttributes?.toString())
	}

}


fun AmazonElasticMapReduceFunctions.setTerminationProtection(jobFlowIds: List<String>, terminationProtected: Boolean, init: AmazonElasticMapReduceSetTerminationProtectionCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceSetTerminationProtectionCommand(jobFlowIds, terminationProtected).apply(init))
}

@Generated
class AmazonElasticMapReduceSetTerminationProtectionCommand(val jobFlowIds: List<String>, val terminationProtected: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionRequest> {



	override fun build(): com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.SetTerminationProtectionRequest()
		input.setJobFlowIds(this.jobFlowIds)
		input.setTerminationProtected(this.terminationProtected)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.setTerminationProtection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce set-termination-protection")
				.argument("job-flow-ids", jobFlowIds.toString())
				.option("termination-protected", terminationProtected ?: false)
	}

}


fun AmazonElasticMapReduceFunctions.setVisibleToAllUsers(jobFlowIds: List<String>, visibleToAllUsers: Boolean, init: AmazonElasticMapReduceSetVisibleToAllUsersCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceSetVisibleToAllUsersCommand(jobFlowIds, visibleToAllUsers).apply(init))
}

@Generated
class AmazonElasticMapReduceSetVisibleToAllUsersCommand(val jobFlowIds: List<String>, val visibleToAllUsers: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersRequest> {



	override fun build(): com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.SetVisibleToAllUsersRequest()
		input.setJobFlowIds(this.jobFlowIds)
		input.setVisibleToAllUsers(this.visibleToAllUsers)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.setVisibleToAllUsers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce set-visible-to-all-users")
				.argument("job-flow-ids", jobFlowIds.toString())
				.option("visible-to-all-users", visibleToAllUsers ?: false)
	}

}


fun AmazonElasticMapReduceFunctions.terminateJobFlows(jobFlowIds: List<String>, init: AmazonElasticMapReduceTerminateJobFlowsCommand.() -> Unit) {
	this.block.declare(AmazonElasticMapReduceTerminateJobFlowsCommand(jobFlowIds).apply(init))
}

@Generated
class AmazonElasticMapReduceTerminateJobFlowsCommand(val jobFlowIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsRequest> {



	override fun build(): com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsRequest {
		val input = com.amazonaws.services.elasticmapreduce.model.TerminateJobFlowsRequest()
		input.setJobFlowIds(this.jobFlowIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticmapreduce.terminateJobFlows(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticmapreduce terminate-job-flows")
				.argument("job-flow-ids", jobFlowIds.toString())
	}

}
