
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.dax.AmazonDax
import com.amazonaws.services.dax.model.*

var codingue.koops.core.Environment.dax: AmazonDax
	get() = this.capabilities[AmazonDax::class.java.name] as AmazonDax
	set(dax) {
		this.capabilities[AmazonDax::class.java.name] = dax
	}

@Generated
class AmazonDaxFunctions(val block: Block)

infix fun AwsContinuation.dax(init: AmazonDaxFunctions.() -> Unit) {
	AmazonDaxFunctions(shell).apply(init)
}

			

fun AmazonDaxFunctions.createCluster(clusterName: String, nodeType: String, replicationFactor: Int, iamRoleArn: String, init: AmazonDaxCreateClusterCommand.() -> Unit) {
	this.block.declare(AmazonDaxCreateClusterCommand(clusterName, nodeType, replicationFactor, iamRoleArn).apply(init))
}

@Generated
class AmazonDaxCreateClusterCommand(val clusterName: String, val nodeType: String, val replicationFactor: Int, val iamRoleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.CreateClusterRequest> {

	var description: String? = null
	var availabilityZones: List<String>? = null
	var subnetGroupName: String? = null
	var securityGroupIds: List<String>? = null
	var preferredMaintenanceWindow: String? = null
	var notificationTopicArn: String? = null
	var parameterGroupName: String? = null
	var tags: List<com.amazonaws.services.dax.model.Tag>? = null

	override fun build(): com.amazonaws.services.dax.model.CreateClusterRequest {
		val input = com.amazonaws.services.dax.model.CreateClusterRequest()
		input.setClusterName(this.clusterName)
		input.setNodeType(this.nodeType)
		input.setDescription(this.description)
		input.setReplicationFactor(this.replicationFactor)
		input.setAvailabilityZones(this.availabilityZones)
		input.setSubnetGroupName(this.subnetGroupName)
		input.setSecurityGroupIds(this.securityGroupIds)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setNotificationTopicArn(this.notificationTopicArn)
		input.setIamRoleArn(this.iamRoleArn)
		input.setParameterGroupName(this.parameterGroupName)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.createCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax create-cluster")
				.argument("cluster-name", clusterName)
				.argument("node-type", nodeType)
				.argument("description", description)
				.argument("replication-factor", replicationFactor.toString())
				.argument("availability-zones", availabilityZones?.toString())
				.argument("subnet-group-name", subnetGroupName)
				.argument("security-group-ids", securityGroupIds?.toString())
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.argument("notification-topic-arn", notificationTopicArn)
				.argument("iam-role-arn", iamRoleArn)
				.argument("parameter-group-name", parameterGroupName)
				.argument("tags", tags?.toString())
	}

}


fun AmazonDaxFunctions.createParameterGroup(parameterGroupName: String, init: AmazonDaxCreateParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonDaxCreateParameterGroupCommand(parameterGroupName).apply(init))
}

@Generated
class AmazonDaxCreateParameterGroupCommand(val parameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.CreateParameterGroupRequest> {

	var description: String? = null

	override fun build(): com.amazonaws.services.dax.model.CreateParameterGroupRequest {
		val input = com.amazonaws.services.dax.model.CreateParameterGroupRequest()
		input.setParameterGroupName(this.parameterGroupName)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.createParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax create-parameter-group")
				.argument("parameter-group-name", parameterGroupName)
				.argument("description", description)
	}

}


fun AmazonDaxFunctions.createSubnetGroup(subnetGroupName: String, subnetIds: List<String>, init: AmazonDaxCreateSubnetGroupCommand.() -> Unit) {
	this.block.declare(AmazonDaxCreateSubnetGroupCommand(subnetGroupName, subnetIds).apply(init))
}

@Generated
class AmazonDaxCreateSubnetGroupCommand(val subnetGroupName: String, val subnetIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.CreateSubnetGroupRequest> {

	var description: String? = null

	override fun build(): com.amazonaws.services.dax.model.CreateSubnetGroupRequest {
		val input = com.amazonaws.services.dax.model.CreateSubnetGroupRequest()
		input.setSubnetGroupName(this.subnetGroupName)
		input.setDescription(this.description)
		input.setSubnetIds(this.subnetIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.createSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax create-subnet-group")
				.argument("subnet-group-name", subnetGroupName)
				.argument("description", description)
				.argument("subnet-ids", subnetIds.toString())
	}

}


fun AmazonDaxFunctions.decreaseReplicationFactor(clusterName: String, newReplicationFactor: Int, init: AmazonDaxDecreaseReplicationFactorCommand.() -> Unit) {
	this.block.declare(AmazonDaxDecreaseReplicationFactorCommand(clusterName, newReplicationFactor).apply(init))
}

@Generated
class AmazonDaxDecreaseReplicationFactorCommand(val clusterName: String, val newReplicationFactor: Int) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DecreaseReplicationFactorRequest> {

	var availabilityZones: List<String>? = null
	var nodeIdsToRemove: List<String>? = null

	override fun build(): com.amazonaws.services.dax.model.DecreaseReplicationFactorRequest {
		val input = com.amazonaws.services.dax.model.DecreaseReplicationFactorRequest()
		input.setClusterName(this.clusterName)
		input.setNewReplicationFactor(this.newReplicationFactor)
		input.setAvailabilityZones(this.availabilityZones)
		input.setNodeIdsToRemove(this.nodeIdsToRemove)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.decreaseReplicationFactor(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax decrease-replication-factor")
				.argument("cluster-name", clusterName)
				.argument("new-replication-factor", newReplicationFactor.toString())
				.argument("availability-zones", availabilityZones?.toString())
				.argument("node-ids-to-remove", nodeIdsToRemove?.toString())
	}

}


fun AmazonDaxFunctions.deleteCluster(clusterName: String, init: AmazonDaxDeleteClusterCommand.() -> Unit) {
	this.block.declare(AmazonDaxDeleteClusterCommand(clusterName).apply(init))
}

@Generated
class AmazonDaxDeleteClusterCommand(val clusterName: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DeleteClusterRequest> {



	override fun build(): com.amazonaws.services.dax.model.DeleteClusterRequest {
		val input = com.amazonaws.services.dax.model.DeleteClusterRequest()
		input.setClusterName(this.clusterName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.deleteCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax delete-cluster")
				.argument("cluster-name", clusterName)
	}

}


fun AmazonDaxFunctions.deleteParameterGroup(parameterGroupName: String, init: AmazonDaxDeleteParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonDaxDeleteParameterGroupCommand(parameterGroupName).apply(init))
}

@Generated
class AmazonDaxDeleteParameterGroupCommand(val parameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DeleteParameterGroupRequest> {



	override fun build(): com.amazonaws.services.dax.model.DeleteParameterGroupRequest {
		val input = com.amazonaws.services.dax.model.DeleteParameterGroupRequest()
		input.setParameterGroupName(this.parameterGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.deleteParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax delete-parameter-group")
				.argument("parameter-group-name", parameterGroupName)
	}

}


fun AmazonDaxFunctions.deleteSubnetGroup(subnetGroupName: String, init: AmazonDaxDeleteSubnetGroupCommand.() -> Unit) {
	this.block.declare(AmazonDaxDeleteSubnetGroupCommand(subnetGroupName).apply(init))
}

@Generated
class AmazonDaxDeleteSubnetGroupCommand(val subnetGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DeleteSubnetGroupRequest> {



	override fun build(): com.amazonaws.services.dax.model.DeleteSubnetGroupRequest {
		val input = com.amazonaws.services.dax.model.DeleteSubnetGroupRequest()
		input.setSubnetGroupName(this.subnetGroupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.deleteSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax delete-subnet-group")
				.argument("subnet-group-name", subnetGroupName)
	}

}


fun AmazonDaxFunctions.describeClusters(init: AmazonDaxDescribeClustersCommand.() -> Unit) {
	this.block.declare(AmazonDaxDescribeClustersCommand().apply(init))
}

@Generated
class AmazonDaxDescribeClustersCommand() : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DescribeClustersRequest> {

	var clusterNames: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.dax.model.DescribeClustersRequest {
		val input = com.amazonaws.services.dax.model.DescribeClustersRequest()
		input.setClusterNames(this.clusterNames)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.describeClusters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax describe-clusters")
				.argument("cluster-names", clusterNames?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDaxFunctions.describeDefaultParameters(init: AmazonDaxDescribeDefaultParametersCommand.() -> Unit) {
	this.block.declare(AmazonDaxDescribeDefaultParametersCommand().apply(init))
}

@Generated
class AmazonDaxDescribeDefaultParametersCommand() : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DescribeDefaultParametersRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.dax.model.DescribeDefaultParametersRequest {
		val input = com.amazonaws.services.dax.model.DescribeDefaultParametersRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.describeDefaultParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax describe-default-parameters")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDaxFunctions.describeEvents(init: AmazonDaxDescribeEventsCommand.() -> Unit) {
	this.block.declare(AmazonDaxDescribeEventsCommand().apply(init))
}

@Generated
class AmazonDaxDescribeEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DescribeEventsRequest> {

	var sourceName: String? = null
	var sourceType: SourceType? = null
	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null
	var duration: Int? = 0
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.dax.model.DescribeEventsRequest {
		val input = com.amazonaws.services.dax.model.DescribeEventsRequest()
		input.setSourceName(this.sourceName)
		input.setSourceType(this.sourceType?.toString())
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setDuration(this.duration)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.describeEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax describe-events")
				.argument("source-name", sourceName)
				.argument("source-type", sourceType?.toString())
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("duration", duration?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDaxFunctions.describeParameterGroups(init: AmazonDaxDescribeParameterGroupsCommand.() -> Unit) {
	this.block.declare(AmazonDaxDescribeParameterGroupsCommand().apply(init))
}

@Generated
class AmazonDaxDescribeParameterGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DescribeParameterGroupsRequest> {

	var parameterGroupNames: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.dax.model.DescribeParameterGroupsRequest {
		val input = com.amazonaws.services.dax.model.DescribeParameterGroupsRequest()
		input.setParameterGroupNames(this.parameterGroupNames)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.describeParameterGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax describe-parameter-groups")
				.argument("parameter-group-names", parameterGroupNames?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDaxFunctions.describeParameters(parameterGroupName: String, init: AmazonDaxDescribeParametersCommand.() -> Unit) {
	this.block.declare(AmazonDaxDescribeParametersCommand(parameterGroupName).apply(init))
}

@Generated
class AmazonDaxDescribeParametersCommand(val parameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DescribeParametersRequest> {

	var source: String? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.dax.model.DescribeParametersRequest {
		val input = com.amazonaws.services.dax.model.DescribeParametersRequest()
		input.setParameterGroupName(this.parameterGroupName)
		input.setSource(this.source)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.describeParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax describe-parameters")
				.argument("parameter-group-name", parameterGroupName)
				.argument("source", source)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDaxFunctions.describeSubnetGroups(init: AmazonDaxDescribeSubnetGroupsCommand.() -> Unit) {
	this.block.declare(AmazonDaxDescribeSubnetGroupsCommand().apply(init))
}

@Generated
class AmazonDaxDescribeSubnetGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DescribeSubnetGroupsRequest> {

	var subnetGroupNames: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.dax.model.DescribeSubnetGroupsRequest {
		val input = com.amazonaws.services.dax.model.DescribeSubnetGroupsRequest()
		input.setSubnetGroupNames(this.subnetGroupNames)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.describeSubnetGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax describe-subnet-groups")
				.argument("subnet-group-names", subnetGroupNames?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDaxFunctions.increaseReplicationFactor(clusterName: String, newReplicationFactor: Int, init: AmazonDaxIncreaseReplicationFactorCommand.() -> Unit) {
	this.block.declare(AmazonDaxIncreaseReplicationFactorCommand(clusterName, newReplicationFactor).apply(init))
}

@Generated
class AmazonDaxIncreaseReplicationFactorCommand(val clusterName: String, val newReplicationFactor: Int) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.IncreaseReplicationFactorRequest> {

	var availabilityZones: List<String>? = null

	override fun build(): com.amazonaws.services.dax.model.IncreaseReplicationFactorRequest {
		val input = com.amazonaws.services.dax.model.IncreaseReplicationFactorRequest()
		input.setClusterName(this.clusterName)
		input.setNewReplicationFactor(this.newReplicationFactor)
		input.setAvailabilityZones(this.availabilityZones)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.increaseReplicationFactor(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax increase-replication-factor")
				.argument("cluster-name", clusterName)
				.argument("new-replication-factor", newReplicationFactor.toString())
				.argument("availability-zones", availabilityZones?.toString())
	}

}


fun AmazonDaxFunctions.listTags(resourceName: String, init: AmazonDaxListTagsCommand.() -> Unit) {
	this.block.declare(AmazonDaxListTagsCommand(resourceName).apply(init))
}

@Generated
class AmazonDaxListTagsCommand(val resourceName: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.ListTagsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.dax.model.ListTagsRequest {
		val input = com.amazonaws.services.dax.model.ListTagsRequest()
		input.setResourceName(this.resourceName)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.listTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax list-tags")
				.argument("resource-name", resourceName)
				.argument("next-token", nextToken)
	}

}


fun AmazonDaxFunctions.rebootNode(clusterName: String, nodeId: String, init: AmazonDaxRebootNodeCommand.() -> Unit) {
	this.block.declare(AmazonDaxRebootNodeCommand(clusterName, nodeId).apply(init))
}

@Generated
class AmazonDaxRebootNodeCommand(val clusterName: String, val nodeId: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.RebootNodeRequest> {



	override fun build(): com.amazonaws.services.dax.model.RebootNodeRequest {
		val input = com.amazonaws.services.dax.model.RebootNodeRequest()
		input.setClusterName(this.clusterName)
		input.setNodeId(this.nodeId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.rebootNode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax reboot-node")
				.argument("cluster-name", clusterName)
				.argument("node-id", nodeId)
	}

}


fun AmazonDaxFunctions.tagResource(resourceName: String, tags: List<com.amazonaws.services.dax.model.Tag>, init: AmazonDaxTagResourceCommand.() -> Unit) {
	this.block.declare(AmazonDaxTagResourceCommand(resourceName, tags).apply(init))
}

@Generated
class AmazonDaxTagResourceCommand(val resourceName: String, val tags: List<com.amazonaws.services.dax.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.TagResourceRequest> {



	override fun build(): com.amazonaws.services.dax.model.TagResourceRequest {
		val input = com.amazonaws.services.dax.model.TagResourceRequest()
		input.setResourceName(this.resourceName)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax tag-resource")
				.argument("resource-name", resourceName)
				.argument("tags", tags.toString())
	}

}


fun AmazonDaxFunctions.untagResource(resourceName: String, tagKeys: List<String>, init: AmazonDaxUntagResourceCommand.() -> Unit) {
	this.block.declare(AmazonDaxUntagResourceCommand(resourceName, tagKeys).apply(init))
}

@Generated
class AmazonDaxUntagResourceCommand(val resourceName: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.UntagResourceRequest> {



	override fun build(): com.amazonaws.services.dax.model.UntagResourceRequest {
		val input = com.amazonaws.services.dax.model.UntagResourceRequest()
		input.setResourceName(this.resourceName)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax untag-resource")
				.argument("resource-name", resourceName)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonDaxFunctions.updateCluster(clusterName: String, init: AmazonDaxUpdateClusterCommand.() -> Unit) {
	this.block.declare(AmazonDaxUpdateClusterCommand(clusterName).apply(init))
}

@Generated
class AmazonDaxUpdateClusterCommand(val clusterName: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.UpdateClusterRequest> {

	var description: String? = null
	var preferredMaintenanceWindow: String? = null
	var notificationTopicArn: String? = null
	var notificationTopicStatus: String? = null
	var parameterGroupName: String? = null
	var securityGroupIds: List<String>? = null

	override fun build(): com.amazonaws.services.dax.model.UpdateClusterRequest {
		val input = com.amazonaws.services.dax.model.UpdateClusterRequest()
		input.setClusterName(this.clusterName)
		input.setDescription(this.description)
		input.setPreferredMaintenanceWindow(this.preferredMaintenanceWindow)
		input.setNotificationTopicArn(this.notificationTopicArn)
		input.setNotificationTopicStatus(this.notificationTopicStatus)
		input.setParameterGroupName(this.parameterGroupName)
		input.setSecurityGroupIds(this.securityGroupIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.updateCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax update-cluster")
				.argument("cluster-name", clusterName)
				.argument("description", description)
				.argument("preferred-maintenance-window", preferredMaintenanceWindow)
				.argument("notification-topic-arn", notificationTopicArn)
				.argument("notification-topic-status", notificationTopicStatus)
				.argument("parameter-group-name", parameterGroupName)
				.argument("security-group-ids", securityGroupIds?.toString())
	}

}


fun AmazonDaxFunctions.updateParameterGroup(parameterGroupName: String, parameterNameValues: List<com.amazonaws.services.dax.model.ParameterNameValue>, init: AmazonDaxUpdateParameterGroupCommand.() -> Unit) {
	this.block.declare(AmazonDaxUpdateParameterGroupCommand(parameterGroupName, parameterNameValues).apply(init))
}

@Generated
class AmazonDaxUpdateParameterGroupCommand(val parameterGroupName: String, val parameterNameValues: List<com.amazonaws.services.dax.model.ParameterNameValue>) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.UpdateParameterGroupRequest> {



	override fun build(): com.amazonaws.services.dax.model.UpdateParameterGroupRequest {
		val input = com.amazonaws.services.dax.model.UpdateParameterGroupRequest()
		input.setParameterGroupName(this.parameterGroupName)
		input.setParameterNameValues(this.parameterNameValues)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.updateParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax update-parameter-group")
				.argument("parameter-group-name", parameterGroupName)
				.argument("parameter-name-values", parameterNameValues.toString())
	}

}


fun AmazonDaxFunctions.updateSubnetGroup(subnetGroupName: String, init: AmazonDaxUpdateSubnetGroupCommand.() -> Unit) {
	this.block.declare(AmazonDaxUpdateSubnetGroupCommand(subnetGroupName).apply(init))
}

@Generated
class AmazonDaxUpdateSubnetGroupCommand(val subnetGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.UpdateSubnetGroupRequest> {

	var description: String? = null
	var subnetIds: List<String>? = null

	override fun build(): com.amazonaws.services.dax.model.UpdateSubnetGroupRequest {
		val input = com.amazonaws.services.dax.model.UpdateSubnetGroupRequest()
		input.setSubnetGroupName(this.subnetGroupName)
		input.setDescription(this.description)
		input.setSubnetIds(this.subnetIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.dax.updateSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax update-subnet-group")
				.argument("subnet-group-name", subnetGroupName)
				.argument("description", description)
				.argument("subnet-ids", subnetIds?.toString())
	}

}
