
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.dax

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.dax.*
import com.amazonaws.services.dax.model.*

var com.codingue.koops.core.Environment.dax: AmazonDax
	get() {
		var service = this.capabilities["aws-dax"]
		if (service == null) {
			service = AmazonDaxClientBuilder.standard().build()
			this.capabilities["aws-dax"] = service
		}
		return service as AmazonDax
	}
	set(dax) {
		this.capabilities["aws-dax"] = dax
	}

@Generated
class AmazonDaxFunctions(val block: Script)

infix fun <T> AwsContinuation.dax(init: AmazonDaxFunctions.() -> T): T {
	return AmazonDaxFunctions(shell).run(init)
}

			

fun AmazonDaxFunctions.createCluster(clusterName: String, nodeType: String, replicationFactor: Int, iamRoleArn: String, init: (AmazonDaxCreateClusterCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.CreateClusterResult {
	return this.block.declare(AmazonDaxCreateClusterCommand(clusterName, nodeType, replicationFactor, iamRoleArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.CreateClusterResult
}

@Generated
class AmazonDaxCreateClusterCommand(val clusterName: String, val nodeType: String, val replicationFactor: Int, val iamRoleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.CreateClusterRequest, com.amazonaws.services.dax.model.CreateClusterResult> {

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

	
	override fun dryResult(): com.amazonaws.services.dax.model.CreateClusterResult {
	  return com.amazonaws.services.dax.model.CreateClusterResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.CreateClusterResult {
		return environment.dax.createCluster(build())
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


fun AmazonDaxFunctions.createParameterGroup(parameterGroupName: String, init: (AmazonDaxCreateParameterGroupCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.CreateParameterGroupResult {
	return this.block.declare(AmazonDaxCreateParameterGroupCommand(parameterGroupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.CreateParameterGroupResult
}

@Generated
class AmazonDaxCreateParameterGroupCommand(val parameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.CreateParameterGroupRequest, com.amazonaws.services.dax.model.CreateParameterGroupResult> {

	var description: String? = null

	override fun build(): com.amazonaws.services.dax.model.CreateParameterGroupRequest {
		val input = com.amazonaws.services.dax.model.CreateParameterGroupRequest()
		input.setParameterGroupName(this.parameterGroupName)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dax.model.CreateParameterGroupResult {
	  return com.amazonaws.services.dax.model.CreateParameterGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.CreateParameterGroupResult {
		return environment.dax.createParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax create-parameter-group")
				.argument("parameter-group-name", parameterGroupName)
				.argument("description", description)
	}

}


fun AmazonDaxFunctions.createSubnetGroup(subnetGroupName: String, subnetIds: List<String>, init: (AmazonDaxCreateSubnetGroupCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.CreateSubnetGroupResult {
	return this.block.declare(AmazonDaxCreateSubnetGroupCommand(subnetGroupName, subnetIds).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.CreateSubnetGroupResult
}

@Generated
class AmazonDaxCreateSubnetGroupCommand(val subnetGroupName: String, val subnetIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.CreateSubnetGroupRequest, com.amazonaws.services.dax.model.CreateSubnetGroupResult> {

	var description: String? = null

	override fun build(): com.amazonaws.services.dax.model.CreateSubnetGroupRequest {
		val input = com.amazonaws.services.dax.model.CreateSubnetGroupRequest()
		input.setSubnetGroupName(this.subnetGroupName)
		input.setDescription(this.description)
		input.setSubnetIds(this.subnetIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dax.model.CreateSubnetGroupResult {
	  return com.amazonaws.services.dax.model.CreateSubnetGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.CreateSubnetGroupResult {
		return environment.dax.createSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax create-subnet-group")
				.argument("subnet-group-name", subnetGroupName)
				.argument("description", description)
				.argument("subnet-ids", subnetIds.toString())
	}

}


fun AmazonDaxFunctions.decreaseReplicationFactor(clusterName: String, newReplicationFactor: Int, init: (AmazonDaxDecreaseReplicationFactorCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.DecreaseReplicationFactorResult {
	return this.block.declare(AmazonDaxDecreaseReplicationFactorCommand(clusterName, newReplicationFactor).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.DecreaseReplicationFactorResult
}

@Generated
class AmazonDaxDecreaseReplicationFactorCommand(val clusterName: String, val newReplicationFactor: Int) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DecreaseReplicationFactorRequest, com.amazonaws.services.dax.model.DecreaseReplicationFactorResult> {

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

	
	override fun dryResult(): com.amazonaws.services.dax.model.DecreaseReplicationFactorResult {
	  return com.amazonaws.services.dax.model.DecreaseReplicationFactorResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.DecreaseReplicationFactorResult {
		return environment.dax.decreaseReplicationFactor(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax decrease-replication-factor")
				.argument("cluster-name", clusterName)
				.argument("new-replication-factor", newReplicationFactor.toString())
				.argument("availability-zones", availabilityZones?.toString())
				.argument("node-ids-to-remove", nodeIdsToRemove?.toString())
	}

}


fun AmazonDaxFunctions.deleteCluster(clusterName: String, init: (AmazonDaxDeleteClusterCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.DeleteClusterResult {
	return this.block.declare(AmazonDaxDeleteClusterCommand(clusterName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.DeleteClusterResult
}

@Generated
class AmazonDaxDeleteClusterCommand(val clusterName: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DeleteClusterRequest, com.amazonaws.services.dax.model.DeleteClusterResult> {



	override fun build(): com.amazonaws.services.dax.model.DeleteClusterRequest {
		val input = com.amazonaws.services.dax.model.DeleteClusterRequest()
		input.setClusterName(this.clusterName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dax.model.DeleteClusterResult {
	  return com.amazonaws.services.dax.model.DeleteClusterResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.DeleteClusterResult {
		return environment.dax.deleteCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax delete-cluster")
				.argument("cluster-name", clusterName)
	}

}


fun AmazonDaxFunctions.deleteParameterGroup(parameterGroupName: String, init: (AmazonDaxDeleteParameterGroupCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.DeleteParameterGroupResult {
	return this.block.declare(AmazonDaxDeleteParameterGroupCommand(parameterGroupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.DeleteParameterGroupResult
}

@Generated
class AmazonDaxDeleteParameterGroupCommand(val parameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DeleteParameterGroupRequest, com.amazonaws.services.dax.model.DeleteParameterGroupResult> {



	override fun build(): com.amazonaws.services.dax.model.DeleteParameterGroupRequest {
		val input = com.amazonaws.services.dax.model.DeleteParameterGroupRequest()
		input.setParameterGroupName(this.parameterGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dax.model.DeleteParameterGroupResult {
	  return com.amazonaws.services.dax.model.DeleteParameterGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.DeleteParameterGroupResult {
		return environment.dax.deleteParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax delete-parameter-group")
				.argument("parameter-group-name", parameterGroupName)
	}

}


fun AmazonDaxFunctions.deleteSubnetGroup(subnetGroupName: String, init: (AmazonDaxDeleteSubnetGroupCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.DeleteSubnetGroupResult {
	return this.block.declare(AmazonDaxDeleteSubnetGroupCommand(subnetGroupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.DeleteSubnetGroupResult
}

@Generated
class AmazonDaxDeleteSubnetGroupCommand(val subnetGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DeleteSubnetGroupRequest, com.amazonaws.services.dax.model.DeleteSubnetGroupResult> {



	override fun build(): com.amazonaws.services.dax.model.DeleteSubnetGroupRequest {
		val input = com.amazonaws.services.dax.model.DeleteSubnetGroupRequest()
		input.setSubnetGroupName(this.subnetGroupName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dax.model.DeleteSubnetGroupResult {
	  return com.amazonaws.services.dax.model.DeleteSubnetGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.DeleteSubnetGroupResult {
		return environment.dax.deleteSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax delete-subnet-group")
				.argument("subnet-group-name", subnetGroupName)
	}

}


fun AmazonDaxFunctions.describeClusters(init: (AmazonDaxDescribeClustersCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.DescribeClustersResult {
	return this.block.declare(AmazonDaxDescribeClustersCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.DescribeClustersResult
}

@Generated
class AmazonDaxDescribeClustersCommand() : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DescribeClustersRequest, com.amazonaws.services.dax.model.DescribeClustersResult> {

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

	
	override fun dryResult(): com.amazonaws.services.dax.model.DescribeClustersResult {
	  return com.amazonaws.services.dax.model.DescribeClustersResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.DescribeClustersResult {
		return environment.dax.describeClusters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax describe-clusters")
				.argument("cluster-names", clusterNames?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDaxFunctions.describeDefaultParameters(init: (AmazonDaxDescribeDefaultParametersCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.DescribeDefaultParametersResult {
	return this.block.declare(AmazonDaxDescribeDefaultParametersCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.DescribeDefaultParametersResult
}

@Generated
class AmazonDaxDescribeDefaultParametersCommand() : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DescribeDefaultParametersRequest, com.amazonaws.services.dax.model.DescribeDefaultParametersResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.dax.model.DescribeDefaultParametersRequest {
		val input = com.amazonaws.services.dax.model.DescribeDefaultParametersRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dax.model.DescribeDefaultParametersResult {
	  return com.amazonaws.services.dax.model.DescribeDefaultParametersResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.DescribeDefaultParametersResult {
		return environment.dax.describeDefaultParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax describe-default-parameters")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDaxFunctions.describeEvents(init: (AmazonDaxDescribeEventsCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.DescribeEventsResult {
	return this.block.declare(AmazonDaxDescribeEventsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.DescribeEventsResult
}

@Generated
class AmazonDaxDescribeEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DescribeEventsRequest, com.amazonaws.services.dax.model.DescribeEventsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.dax.model.DescribeEventsResult {
	  return com.amazonaws.services.dax.model.DescribeEventsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.DescribeEventsResult {
		return environment.dax.describeEvents(build())
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


fun AmazonDaxFunctions.describeParameterGroups(init: (AmazonDaxDescribeParameterGroupsCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.DescribeParameterGroupsResult {
	return this.block.declare(AmazonDaxDescribeParameterGroupsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.DescribeParameterGroupsResult
}

@Generated
class AmazonDaxDescribeParameterGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DescribeParameterGroupsRequest, com.amazonaws.services.dax.model.DescribeParameterGroupsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.dax.model.DescribeParameterGroupsResult {
	  return com.amazonaws.services.dax.model.DescribeParameterGroupsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.DescribeParameterGroupsResult {
		return environment.dax.describeParameterGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax describe-parameter-groups")
				.argument("parameter-group-names", parameterGroupNames?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDaxFunctions.describeParameters(parameterGroupName: String, init: (AmazonDaxDescribeParametersCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.DescribeParametersResult {
	return this.block.declare(AmazonDaxDescribeParametersCommand(parameterGroupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.DescribeParametersResult
}

@Generated
class AmazonDaxDescribeParametersCommand(val parameterGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DescribeParametersRequest, com.amazonaws.services.dax.model.DescribeParametersResult> {

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

	
	override fun dryResult(): com.amazonaws.services.dax.model.DescribeParametersResult {
	  return com.amazonaws.services.dax.model.DescribeParametersResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.DescribeParametersResult {
		return environment.dax.describeParameters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax describe-parameters")
				.argument("parameter-group-name", parameterGroupName)
				.argument("source", source)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDaxFunctions.describeSubnetGroups(init: (AmazonDaxDescribeSubnetGroupsCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.DescribeSubnetGroupsResult {
	return this.block.declare(AmazonDaxDescribeSubnetGroupsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.DescribeSubnetGroupsResult
}

@Generated
class AmazonDaxDescribeSubnetGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.dax.model.DescribeSubnetGroupsRequest, com.amazonaws.services.dax.model.DescribeSubnetGroupsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.dax.model.DescribeSubnetGroupsResult {
	  return com.amazonaws.services.dax.model.DescribeSubnetGroupsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.DescribeSubnetGroupsResult {
		return environment.dax.describeSubnetGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax describe-subnet-groups")
				.argument("subnet-group-names", subnetGroupNames?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDaxFunctions.increaseReplicationFactor(clusterName: String, newReplicationFactor: Int, init: (AmazonDaxIncreaseReplicationFactorCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.IncreaseReplicationFactorResult {
	return this.block.declare(AmazonDaxIncreaseReplicationFactorCommand(clusterName, newReplicationFactor).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.IncreaseReplicationFactorResult
}

@Generated
class AmazonDaxIncreaseReplicationFactorCommand(val clusterName: String, val newReplicationFactor: Int) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.IncreaseReplicationFactorRequest, com.amazonaws.services.dax.model.IncreaseReplicationFactorResult> {

	var availabilityZones: List<String>? = null

	override fun build(): com.amazonaws.services.dax.model.IncreaseReplicationFactorRequest {
		val input = com.amazonaws.services.dax.model.IncreaseReplicationFactorRequest()
		input.setClusterName(this.clusterName)
		input.setNewReplicationFactor(this.newReplicationFactor)
		input.setAvailabilityZones(this.availabilityZones)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dax.model.IncreaseReplicationFactorResult {
	  return com.amazonaws.services.dax.model.IncreaseReplicationFactorResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.IncreaseReplicationFactorResult {
		return environment.dax.increaseReplicationFactor(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax increase-replication-factor")
				.argument("cluster-name", clusterName)
				.argument("new-replication-factor", newReplicationFactor.toString())
				.argument("availability-zones", availabilityZones?.toString())
	}

}


fun AmazonDaxFunctions.listTags(resourceName: String, init: (AmazonDaxListTagsCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.ListTagsResult {
	return this.block.declare(AmazonDaxListTagsCommand(resourceName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.ListTagsResult
}

@Generated
class AmazonDaxListTagsCommand(val resourceName: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.ListTagsRequest, com.amazonaws.services.dax.model.ListTagsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.dax.model.ListTagsRequest {
		val input = com.amazonaws.services.dax.model.ListTagsRequest()
		input.setResourceName(this.resourceName)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dax.model.ListTagsResult {
	  return com.amazonaws.services.dax.model.ListTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.ListTagsResult {
		return environment.dax.listTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax list-tags")
				.argument("resource-name", resourceName)
				.argument("next-token", nextToken)
	}

}


fun AmazonDaxFunctions.rebootNode(clusterName: String, nodeId: String, init: (AmazonDaxRebootNodeCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.RebootNodeResult {
	return this.block.declare(AmazonDaxRebootNodeCommand(clusterName, nodeId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.RebootNodeResult
}

@Generated
class AmazonDaxRebootNodeCommand(val clusterName: String, val nodeId: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.RebootNodeRequest, com.amazonaws.services.dax.model.RebootNodeResult> {



	override fun build(): com.amazonaws.services.dax.model.RebootNodeRequest {
		val input = com.amazonaws.services.dax.model.RebootNodeRequest()
		input.setClusterName(this.clusterName)
		input.setNodeId(this.nodeId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dax.model.RebootNodeResult {
	  return com.amazonaws.services.dax.model.RebootNodeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.RebootNodeResult {
		return environment.dax.rebootNode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax reboot-node")
				.argument("cluster-name", clusterName)
				.argument("node-id", nodeId)
	}

}


fun AmazonDaxFunctions.tagResource(resourceName: String, tags: List<com.amazonaws.services.dax.model.Tag>, init: (AmazonDaxTagResourceCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.TagResourceResult {
	return this.block.declare(AmazonDaxTagResourceCommand(resourceName, tags).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.TagResourceResult
}

@Generated
class AmazonDaxTagResourceCommand(val resourceName: String, val tags: List<com.amazonaws.services.dax.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.TagResourceRequest, com.amazonaws.services.dax.model.TagResourceResult> {



	override fun build(): com.amazonaws.services.dax.model.TagResourceRequest {
		val input = com.amazonaws.services.dax.model.TagResourceRequest()
		input.setResourceName(this.resourceName)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dax.model.TagResourceResult {
	  return com.amazonaws.services.dax.model.TagResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.TagResourceResult {
		return environment.dax.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax tag-resource")
				.argument("resource-name", resourceName)
				.argument("tags", tags.toString())
	}

}


fun AmazonDaxFunctions.untagResource(resourceName: String, tagKeys: List<String>, init: (AmazonDaxUntagResourceCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.UntagResourceResult {
	return this.block.declare(AmazonDaxUntagResourceCommand(resourceName, tagKeys).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.UntagResourceResult
}

@Generated
class AmazonDaxUntagResourceCommand(val resourceName: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.UntagResourceRequest, com.amazonaws.services.dax.model.UntagResourceResult> {



	override fun build(): com.amazonaws.services.dax.model.UntagResourceRequest {
		val input = com.amazonaws.services.dax.model.UntagResourceRequest()
		input.setResourceName(this.resourceName)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dax.model.UntagResourceResult {
	  return com.amazonaws.services.dax.model.UntagResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.UntagResourceResult {
		return environment.dax.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax untag-resource")
				.argument("resource-name", resourceName)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonDaxFunctions.updateCluster(clusterName: String, init: (AmazonDaxUpdateClusterCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.UpdateClusterResult {
	return this.block.declare(AmazonDaxUpdateClusterCommand(clusterName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.UpdateClusterResult
}

@Generated
class AmazonDaxUpdateClusterCommand(val clusterName: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.UpdateClusterRequest, com.amazonaws.services.dax.model.UpdateClusterResult> {

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

	
	override fun dryResult(): com.amazonaws.services.dax.model.UpdateClusterResult {
	  return com.amazonaws.services.dax.model.UpdateClusterResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.UpdateClusterResult {
		return environment.dax.updateCluster(build())
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


fun AmazonDaxFunctions.updateParameterGroup(parameterGroupName: String, parameterNameValues: List<com.amazonaws.services.dax.model.ParameterNameValue>, init: (AmazonDaxUpdateParameterGroupCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.UpdateParameterGroupResult {
	return this.block.declare(AmazonDaxUpdateParameterGroupCommand(parameterGroupName, parameterNameValues).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.UpdateParameterGroupResult
}

@Generated
class AmazonDaxUpdateParameterGroupCommand(val parameterGroupName: String, val parameterNameValues: List<com.amazonaws.services.dax.model.ParameterNameValue>) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.UpdateParameterGroupRequest, com.amazonaws.services.dax.model.UpdateParameterGroupResult> {



	override fun build(): com.amazonaws.services.dax.model.UpdateParameterGroupRequest {
		val input = com.amazonaws.services.dax.model.UpdateParameterGroupRequest()
		input.setParameterGroupName(this.parameterGroupName)
		input.setParameterNameValues(this.parameterNameValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dax.model.UpdateParameterGroupResult {
	  return com.amazonaws.services.dax.model.UpdateParameterGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.UpdateParameterGroupResult {
		return environment.dax.updateParameterGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax update-parameter-group")
				.argument("parameter-group-name", parameterGroupName)
				.argument("parameter-name-values", parameterNameValues.toString())
	}

}


fun AmazonDaxFunctions.updateSubnetGroup(subnetGroupName: String, init: (AmazonDaxUpdateSubnetGroupCommand.() -> Unit)? = null): com.amazonaws.services.dax.model.UpdateSubnetGroupResult {
	return this.block.declare(AmazonDaxUpdateSubnetGroupCommand(subnetGroupName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.dax.model.UpdateSubnetGroupResult
}

@Generated
class AmazonDaxUpdateSubnetGroupCommand(val subnetGroupName: String) : AmazonWebServiceCommand<com.amazonaws.services.dax.model.UpdateSubnetGroupRequest, com.amazonaws.services.dax.model.UpdateSubnetGroupResult> {

	var description: String? = null
	var subnetIds: List<String>? = null

	override fun build(): com.amazonaws.services.dax.model.UpdateSubnetGroupRequest {
		val input = com.amazonaws.services.dax.model.UpdateSubnetGroupRequest()
		input.setSubnetGroupName(this.subnetGroupName)
		input.setDescription(this.description)
		input.setSubnetIds(this.subnetIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.dax.model.UpdateSubnetGroupResult {
	  return com.amazonaws.services.dax.model.UpdateSubnetGroupResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.dax.model.UpdateSubnetGroupResult {
		return environment.dax.updateSubnetGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws dax update-subnet-group")
				.argument("subnet-group-name", subnetGroupName)
				.argument("description", description)
				.argument("subnet-ids", subnetIds?.toString())
	}

}
