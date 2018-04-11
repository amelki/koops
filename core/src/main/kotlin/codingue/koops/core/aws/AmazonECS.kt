
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.ecs.AmazonECS
import com.amazonaws.services.ecs.model.*

var codingue.koops.core.Environment.ecs: AmazonECS
	get() = this.capabilities[AmazonECS::class.java.name] as AmazonECS
	set(ecs) {
		this.capabilities[AmazonECS::class.java.name] = ecs
	}

@Generated
class AmazonECSFunctions(val block: Block)

infix fun <T> AwsContinuation.ecs(init: AmazonECSFunctions.() -> T): T {
	return AmazonECSFunctions(shell).run(init)
}

			

fun AmazonECSFunctions.createCluster(init: AmazonECSCreateClusterCommand.() -> Unit): com.amazonaws.services.ecs.model.CreateClusterResult {
	return this.block.declare(AmazonECSCreateClusterCommand().apply(init)) as com.amazonaws.services.ecs.model.CreateClusterResult
}

@Generated
class AmazonECSCreateClusterCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.CreateClusterRequest, com.amazonaws.services.ecs.model.CreateClusterResult> {

	var clusterName: String? = null

	override fun build(): com.amazonaws.services.ecs.model.CreateClusterRequest {
		val input = com.amazonaws.services.ecs.model.CreateClusterRequest()
		input.setClusterName(this.clusterName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.CreateClusterResult {
	  return com.amazonaws.services.ecs.model.CreateClusterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.CreateClusterResult {
		return environment.ecs.createCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs create-cluster")
				.argument("cluster-name", clusterName)
	}

}


fun AmazonECSFunctions.createService(init: AmazonECSCreateServiceCommand.() -> Unit): com.amazonaws.services.ecs.model.CreateServiceResult {
	return this.block.declare(AmazonECSCreateServiceCommand().apply(init)) as com.amazonaws.services.ecs.model.CreateServiceResult
}

@Generated
class AmazonECSCreateServiceCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.CreateServiceRequest, com.amazonaws.services.ecs.model.CreateServiceResult> {

	var cluster: String? = null
	var serviceName: String? = null
	var taskDefinition: String? = null
	var loadBalancers: List<com.amazonaws.services.ecs.model.LoadBalancer>? = null
	var serviceRegistries: List<com.amazonaws.services.ecs.model.ServiceRegistry>? = null
	var desiredCount: Int? = 0
	var clientToken: String? = null
	var launchType: LaunchType? = null
	var platformVersion: String? = null
	var role: String? = null
	var deploymentConfiguration: com.amazonaws.services.ecs.model.DeploymentConfiguration? = null
	var placementConstraints: List<com.amazonaws.services.ecs.model.PlacementConstraint>? = null
	var placementStrategy: List<com.amazonaws.services.ecs.model.PlacementStrategy>? = null
	var networkConfiguration: com.amazonaws.services.ecs.model.NetworkConfiguration? = null
	var healthCheckGracePeriodSeconds: Int? = 0

	override fun build(): com.amazonaws.services.ecs.model.CreateServiceRequest {
		val input = com.amazonaws.services.ecs.model.CreateServiceRequest()
		input.setCluster(this.cluster)
		input.setServiceName(this.serviceName)
		input.setTaskDefinition(this.taskDefinition)
		input.setLoadBalancers(this.loadBalancers)
		input.setServiceRegistries(this.serviceRegistries)
		input.setDesiredCount(this.desiredCount)
		input.setClientToken(this.clientToken)
		input.setLaunchType(this.launchType?.toString())
		input.setPlatformVersion(this.platformVersion)
		input.setRole(this.role)
		input.setDeploymentConfiguration(this.deploymentConfiguration)
		input.setPlacementConstraints(this.placementConstraints)
		input.setPlacementStrategy(this.placementStrategy)
		input.setNetworkConfiguration(this.networkConfiguration)
		input.setHealthCheckGracePeriodSeconds(this.healthCheckGracePeriodSeconds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.CreateServiceResult {
	  return com.amazonaws.services.ecs.model.CreateServiceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.CreateServiceResult {
		return environment.ecs.createService(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs create-service")
				.argument("cluster", cluster)
				.argument("service-name", serviceName)
				.argument("task-definition", taskDefinition)
				.argument("load-balancers", loadBalancers?.toString())
				.argument("service-registries", serviceRegistries?.toString())
				.argument("desired-count", desiredCount?.toString())
				.argument("client-token", clientToken)
				.argument("launch-type", launchType?.toString())
				.argument("platform-version", platformVersion)
				.argument("role", role)
				.argument("deployment-configuration", deploymentConfiguration?.toString())
				.argument("placement-constraints", placementConstraints?.toString())
				.argument("placement-strategy", placementStrategy?.toString())
				.argument("network-configuration", networkConfiguration?.toString())
				.argument("health-check-grace-period-seconds", healthCheckGracePeriodSeconds?.toString())
	}

}


fun AmazonECSFunctions.deleteAttributes(init: AmazonECSDeleteAttributesCommand.() -> Unit): com.amazonaws.services.ecs.model.DeleteAttributesResult {
	return this.block.declare(AmazonECSDeleteAttributesCommand().apply(init)) as com.amazonaws.services.ecs.model.DeleteAttributesResult
}

@Generated
class AmazonECSDeleteAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DeleteAttributesRequest, com.amazonaws.services.ecs.model.DeleteAttributesResult> {

	var cluster: String? = null
	var attributes: List<com.amazonaws.services.ecs.model.Attribute>? = null

	override fun build(): com.amazonaws.services.ecs.model.DeleteAttributesRequest {
		val input = com.amazonaws.services.ecs.model.DeleteAttributesRequest()
		input.setCluster(this.cluster)
		input.setAttributes(this.attributes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.DeleteAttributesResult {
	  return com.amazonaws.services.ecs.model.DeleteAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.DeleteAttributesResult {
		return environment.ecs.deleteAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs delete-attributes")
				.argument("cluster", cluster)
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonECSFunctions.deleteCluster(init: AmazonECSDeleteClusterCommand.() -> Unit): com.amazonaws.services.ecs.model.DeleteClusterResult {
	return this.block.declare(AmazonECSDeleteClusterCommand().apply(init)) as com.amazonaws.services.ecs.model.DeleteClusterResult
}

@Generated
class AmazonECSDeleteClusterCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DeleteClusterRequest, com.amazonaws.services.ecs.model.DeleteClusterResult> {

	var cluster: String? = null

	override fun build(): com.amazonaws.services.ecs.model.DeleteClusterRequest {
		val input = com.amazonaws.services.ecs.model.DeleteClusterRequest()
		input.setCluster(this.cluster)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.DeleteClusterResult {
	  return com.amazonaws.services.ecs.model.DeleteClusterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.DeleteClusterResult {
		return environment.ecs.deleteCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs delete-cluster")
				.argument("cluster", cluster)
	}

}


fun AmazonECSFunctions.deleteService(init: AmazonECSDeleteServiceCommand.() -> Unit): com.amazonaws.services.ecs.model.DeleteServiceResult {
	return this.block.declare(AmazonECSDeleteServiceCommand().apply(init)) as com.amazonaws.services.ecs.model.DeleteServiceResult
}

@Generated
class AmazonECSDeleteServiceCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DeleteServiceRequest, com.amazonaws.services.ecs.model.DeleteServiceResult> {

	var cluster: String? = null
	var service: String? = null

	override fun build(): com.amazonaws.services.ecs.model.DeleteServiceRequest {
		val input = com.amazonaws.services.ecs.model.DeleteServiceRequest()
		input.setCluster(this.cluster)
		input.setService(this.service)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.DeleteServiceResult {
	  return com.amazonaws.services.ecs.model.DeleteServiceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.DeleteServiceResult {
		return environment.ecs.deleteService(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs delete-service")
				.argument("cluster", cluster)
				.argument("service", service)
	}

}


fun AmazonECSFunctions.deregisterContainerInstance(init: AmazonECSDeregisterContainerInstanceCommand.() -> Unit): com.amazonaws.services.ecs.model.DeregisterContainerInstanceResult {
	return this.block.declare(AmazonECSDeregisterContainerInstanceCommand().apply(init)) as com.amazonaws.services.ecs.model.DeregisterContainerInstanceResult
}

@Generated
class AmazonECSDeregisterContainerInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DeregisterContainerInstanceRequest, com.amazonaws.services.ecs.model.DeregisterContainerInstanceResult> {

	var cluster: String? = null
	var containerInstance: String? = null
	var force: Boolean? = false

	override fun build(): com.amazonaws.services.ecs.model.DeregisterContainerInstanceRequest {
		val input = com.amazonaws.services.ecs.model.DeregisterContainerInstanceRequest()
		input.setCluster(this.cluster)
		input.setContainerInstance(this.containerInstance)
		input.setForce(this.force)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.DeregisterContainerInstanceResult {
	  return com.amazonaws.services.ecs.model.DeregisterContainerInstanceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.DeregisterContainerInstanceResult {
		return environment.ecs.deregisterContainerInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs deregister-container-instance")
				.argument("cluster", cluster)
				.argument("container-instance", containerInstance)
				.option("force", force ?: false)
	}

}


fun AmazonECSFunctions.deregisterTaskDefinition(init: AmazonECSDeregisterTaskDefinitionCommand.() -> Unit): com.amazonaws.services.ecs.model.DeregisterTaskDefinitionResult {
	return this.block.declare(AmazonECSDeregisterTaskDefinitionCommand().apply(init)) as com.amazonaws.services.ecs.model.DeregisterTaskDefinitionResult
}

@Generated
class AmazonECSDeregisterTaskDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DeregisterTaskDefinitionRequest, com.amazonaws.services.ecs.model.DeregisterTaskDefinitionResult> {

	var taskDefinition: String? = null

	override fun build(): com.amazonaws.services.ecs.model.DeregisterTaskDefinitionRequest {
		val input = com.amazonaws.services.ecs.model.DeregisterTaskDefinitionRequest()
		input.setTaskDefinition(this.taskDefinition)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.DeregisterTaskDefinitionResult {
	  return com.amazonaws.services.ecs.model.DeregisterTaskDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.DeregisterTaskDefinitionResult {
		return environment.ecs.deregisterTaskDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs deregister-task-definition")
				.argument("task-definition", taskDefinition)
	}

}


fun AmazonECSFunctions.describeClusters(init: AmazonECSDescribeClustersCommand.() -> Unit): com.amazonaws.services.ecs.model.DescribeClustersResult {
	return this.block.declare(AmazonECSDescribeClustersCommand().apply(init)) as com.amazonaws.services.ecs.model.DescribeClustersResult
}

@Generated
class AmazonECSDescribeClustersCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DescribeClustersRequest, com.amazonaws.services.ecs.model.DescribeClustersResult> {

	var clusters: List<String>? = null
	var include: List<ClusterField>? = null

	override fun build(): com.amazonaws.services.ecs.model.DescribeClustersRequest {
		val input = com.amazonaws.services.ecs.model.DescribeClustersRequest()
		input.setClusters(this.clusters)
		input.setInclude(this.include?.map { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.DescribeClustersResult {
	  return com.amazonaws.services.ecs.model.DescribeClustersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.DescribeClustersResult {
		return environment.ecs.describeClusters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs describe-clusters")
				.argument("clusters", clusters?.toString())
				.argument("include", include?.toString())
	}

}


fun AmazonECSFunctions.describeContainerInstances(init: AmazonECSDescribeContainerInstancesCommand.() -> Unit): com.amazonaws.services.ecs.model.DescribeContainerInstancesResult {
	return this.block.declare(AmazonECSDescribeContainerInstancesCommand().apply(init)) as com.amazonaws.services.ecs.model.DescribeContainerInstancesResult
}

@Generated
class AmazonECSDescribeContainerInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DescribeContainerInstancesRequest, com.amazonaws.services.ecs.model.DescribeContainerInstancesResult> {

	var cluster: String? = null
	var containerInstances: List<String>? = null

	override fun build(): com.amazonaws.services.ecs.model.DescribeContainerInstancesRequest {
		val input = com.amazonaws.services.ecs.model.DescribeContainerInstancesRequest()
		input.setCluster(this.cluster)
		input.setContainerInstances(this.containerInstances)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.DescribeContainerInstancesResult {
	  return com.amazonaws.services.ecs.model.DescribeContainerInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.DescribeContainerInstancesResult {
		return environment.ecs.describeContainerInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs describe-container-instances")
				.argument("cluster", cluster)
				.argument("container-instances", containerInstances?.toString())
	}

}


fun AmazonECSFunctions.describeServices(init: AmazonECSDescribeServicesCommand.() -> Unit): com.amazonaws.services.ecs.model.DescribeServicesResult {
	return this.block.declare(AmazonECSDescribeServicesCommand().apply(init)) as com.amazonaws.services.ecs.model.DescribeServicesResult
}

@Generated
class AmazonECSDescribeServicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DescribeServicesRequest, com.amazonaws.services.ecs.model.DescribeServicesResult> {

	var cluster: String? = null
	var services: List<String>? = null

	override fun build(): com.amazonaws.services.ecs.model.DescribeServicesRequest {
		val input = com.amazonaws.services.ecs.model.DescribeServicesRequest()
		input.setCluster(this.cluster)
		input.setServices(this.services)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.DescribeServicesResult {
	  return com.amazonaws.services.ecs.model.DescribeServicesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.DescribeServicesResult {
		return environment.ecs.describeServices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs describe-services")
				.argument("cluster", cluster)
				.argument("services", services?.toString())
	}

}


fun AmazonECSFunctions.describeTaskDefinition(init: AmazonECSDescribeTaskDefinitionCommand.() -> Unit): com.amazonaws.services.ecs.model.DescribeTaskDefinitionResult {
	return this.block.declare(AmazonECSDescribeTaskDefinitionCommand().apply(init)) as com.amazonaws.services.ecs.model.DescribeTaskDefinitionResult
}

@Generated
class AmazonECSDescribeTaskDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DescribeTaskDefinitionRequest, com.amazonaws.services.ecs.model.DescribeTaskDefinitionResult> {

	var taskDefinition: String? = null

	override fun build(): com.amazonaws.services.ecs.model.DescribeTaskDefinitionRequest {
		val input = com.amazonaws.services.ecs.model.DescribeTaskDefinitionRequest()
		input.setTaskDefinition(this.taskDefinition)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.DescribeTaskDefinitionResult {
	  return com.amazonaws.services.ecs.model.DescribeTaskDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.DescribeTaskDefinitionResult {
		return environment.ecs.describeTaskDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs describe-task-definition")
				.argument("task-definition", taskDefinition)
	}

}


fun AmazonECSFunctions.describeTasks(init: AmazonECSDescribeTasksCommand.() -> Unit): com.amazonaws.services.ecs.model.DescribeTasksResult {
	return this.block.declare(AmazonECSDescribeTasksCommand().apply(init)) as com.amazonaws.services.ecs.model.DescribeTasksResult
}

@Generated
class AmazonECSDescribeTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DescribeTasksRequest, com.amazonaws.services.ecs.model.DescribeTasksResult> {

	var cluster: String? = null
	var tasks: List<String>? = null

	override fun build(): com.amazonaws.services.ecs.model.DescribeTasksRequest {
		val input = com.amazonaws.services.ecs.model.DescribeTasksRequest()
		input.setCluster(this.cluster)
		input.setTasks(this.tasks)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.DescribeTasksResult {
	  return com.amazonaws.services.ecs.model.DescribeTasksResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.DescribeTasksResult {
		return environment.ecs.describeTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs describe-tasks")
				.argument("cluster", cluster)
				.argument("tasks", tasks?.toString())
	}

}


fun AmazonECSFunctions.discoverPollEndpoint(init: AmazonECSDiscoverPollEndpointCommand.() -> Unit): com.amazonaws.services.ecs.model.DiscoverPollEndpointResult {
	return this.block.declare(AmazonECSDiscoverPollEndpointCommand().apply(init)) as com.amazonaws.services.ecs.model.DiscoverPollEndpointResult
}

@Generated
class AmazonECSDiscoverPollEndpointCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DiscoverPollEndpointRequest, com.amazonaws.services.ecs.model.DiscoverPollEndpointResult> {

	var containerInstance: String? = null
	var cluster: String? = null

	override fun build(): com.amazonaws.services.ecs.model.DiscoverPollEndpointRequest {
		val input = com.amazonaws.services.ecs.model.DiscoverPollEndpointRequest()
		input.setContainerInstance(this.containerInstance)
		input.setCluster(this.cluster)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.DiscoverPollEndpointResult {
	  return com.amazonaws.services.ecs.model.DiscoverPollEndpointResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.DiscoverPollEndpointResult {
		return environment.ecs.discoverPollEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs discover-poll-endpoint")
				.argument("container-instance", containerInstance)
				.argument("cluster", cluster)
	}

}


fun AmazonECSFunctions.listAttributes(init: AmazonECSListAttributesCommand.() -> Unit): com.amazonaws.services.ecs.model.ListAttributesResult {
	return this.block.declare(AmazonECSListAttributesCommand().apply(init)) as com.amazonaws.services.ecs.model.ListAttributesResult
}

@Generated
class AmazonECSListAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.ListAttributesRequest, com.amazonaws.services.ecs.model.ListAttributesResult> {

	var cluster: String? = null
	var targetType: TargetType? = null
	var attributeName: String? = null
	var attributeValue: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.ecs.model.ListAttributesRequest {
		val input = com.amazonaws.services.ecs.model.ListAttributesRequest()
		input.setCluster(this.cluster)
		input.setTargetType(this.targetType?.toString())
		input.setAttributeName(this.attributeName)
		input.setAttributeValue(this.attributeValue)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.ListAttributesResult {
	  return com.amazonaws.services.ecs.model.ListAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.ListAttributesResult {
		return environment.ecs.listAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs list-attributes")
				.argument("cluster", cluster)
				.argument("target-type", targetType?.toString())
				.argument("attribute-name", attributeName)
				.argument("attribute-value", attributeValue)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonECSFunctions.listClusters(init: AmazonECSListClustersCommand.() -> Unit): com.amazonaws.services.ecs.model.ListClustersResult {
	return this.block.declare(AmazonECSListClustersCommand().apply(init)) as com.amazonaws.services.ecs.model.ListClustersResult
}

@Generated
class AmazonECSListClustersCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.ListClustersRequest, com.amazonaws.services.ecs.model.ListClustersResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.ecs.model.ListClustersRequest {
		val input = com.amazonaws.services.ecs.model.ListClustersRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.ListClustersResult {
	  return com.amazonaws.services.ecs.model.ListClustersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.ListClustersResult {
		return environment.ecs.listClusters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs list-clusters")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonECSFunctions.listContainerInstances(init: AmazonECSListContainerInstancesCommand.() -> Unit): com.amazonaws.services.ecs.model.ListContainerInstancesResult {
	return this.block.declare(AmazonECSListContainerInstancesCommand().apply(init)) as com.amazonaws.services.ecs.model.ListContainerInstancesResult
}

@Generated
class AmazonECSListContainerInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.ListContainerInstancesRequest, com.amazonaws.services.ecs.model.ListContainerInstancesResult> {

	var cluster: String? = null
	var filter: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var status: ContainerInstanceStatus? = null

	override fun build(): com.amazonaws.services.ecs.model.ListContainerInstancesRequest {
		val input = com.amazonaws.services.ecs.model.ListContainerInstancesRequest()
		input.setCluster(this.cluster)
		input.setFilter(this.filter)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setStatus(this.status?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.ListContainerInstancesResult {
	  return com.amazonaws.services.ecs.model.ListContainerInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.ListContainerInstancesResult {
		return environment.ecs.listContainerInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs list-container-instances")
				.argument("cluster", cluster)
				.argument("filter", filter)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("status", status?.toString())
	}

}


fun AmazonECSFunctions.listServices(init: AmazonECSListServicesCommand.() -> Unit): com.amazonaws.services.ecs.model.ListServicesResult {
	return this.block.declare(AmazonECSListServicesCommand().apply(init)) as com.amazonaws.services.ecs.model.ListServicesResult
}

@Generated
class AmazonECSListServicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.ListServicesRequest, com.amazonaws.services.ecs.model.ListServicesResult> {

	var cluster: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var launchType: LaunchType? = null

	override fun build(): com.amazonaws.services.ecs.model.ListServicesRequest {
		val input = com.amazonaws.services.ecs.model.ListServicesRequest()
		input.setCluster(this.cluster)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setLaunchType(this.launchType?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.ListServicesResult {
	  return com.amazonaws.services.ecs.model.ListServicesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.ListServicesResult {
		return environment.ecs.listServices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs list-services")
				.argument("cluster", cluster)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("launch-type", launchType?.toString())
	}

}


fun AmazonECSFunctions.listTaskDefinitionFamilies(init: AmazonECSListTaskDefinitionFamiliesCommand.() -> Unit): com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesResult {
	return this.block.declare(AmazonECSListTaskDefinitionFamiliesCommand().apply(init)) as com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesResult
}

@Generated
class AmazonECSListTaskDefinitionFamiliesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesRequest, com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesResult> {

	var familyPrefix: String? = null
	var status: TaskDefinitionFamilyStatus? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesRequest {
		val input = com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesRequest()
		input.setFamilyPrefix(this.familyPrefix)
		input.setStatus(this.status?.toString())
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesResult {
	  return com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesResult {
		return environment.ecs.listTaskDefinitionFamilies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs list-task-definition-families")
				.argument("family-prefix", familyPrefix)
				.argument("status", status?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonECSFunctions.listTaskDefinitions(init: AmazonECSListTaskDefinitionsCommand.() -> Unit): com.amazonaws.services.ecs.model.ListTaskDefinitionsResult {
	return this.block.declare(AmazonECSListTaskDefinitionsCommand().apply(init)) as com.amazonaws.services.ecs.model.ListTaskDefinitionsResult
}

@Generated
class AmazonECSListTaskDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.ListTaskDefinitionsRequest, com.amazonaws.services.ecs.model.ListTaskDefinitionsResult> {

	var familyPrefix: String? = null
	var status: TaskDefinitionStatus? = null
	var sort: SortOrder? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.ecs.model.ListTaskDefinitionsRequest {
		val input = com.amazonaws.services.ecs.model.ListTaskDefinitionsRequest()
		input.setFamilyPrefix(this.familyPrefix)
		input.setStatus(this.status?.toString())
		input.setSort(this.sort?.toString())
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.ListTaskDefinitionsResult {
	  return com.amazonaws.services.ecs.model.ListTaskDefinitionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.ListTaskDefinitionsResult {
		return environment.ecs.listTaskDefinitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs list-task-definitions")
				.argument("family-prefix", familyPrefix)
				.argument("status", status?.toString())
				.argument("sort", sort?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonECSFunctions.listTasks(init: AmazonECSListTasksCommand.() -> Unit): com.amazonaws.services.ecs.model.ListTasksResult {
	return this.block.declare(AmazonECSListTasksCommand().apply(init)) as com.amazonaws.services.ecs.model.ListTasksResult
}

@Generated
class AmazonECSListTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.ListTasksRequest, com.amazonaws.services.ecs.model.ListTasksResult> {

	var cluster: String? = null
	var containerInstance: String? = null
	var family: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var startedBy: String? = null
	var serviceName: String? = null
	var desiredStatus: DesiredStatus? = null
	var launchType: LaunchType? = null

	override fun build(): com.amazonaws.services.ecs.model.ListTasksRequest {
		val input = com.amazonaws.services.ecs.model.ListTasksRequest()
		input.setCluster(this.cluster)
		input.setContainerInstance(this.containerInstance)
		input.setFamily(this.family)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setStartedBy(this.startedBy)
		input.setServiceName(this.serviceName)
		input.setDesiredStatus(this.desiredStatus?.toString())
		input.setLaunchType(this.launchType?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.ListTasksResult {
	  return com.amazonaws.services.ecs.model.ListTasksResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.ListTasksResult {
		return environment.ecs.listTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs list-tasks")
				.argument("cluster", cluster)
				.argument("container-instance", containerInstance)
				.argument("family", family)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("started-by", startedBy)
				.argument("service-name", serviceName)
				.argument("desired-status", desiredStatus?.toString())
				.argument("launch-type", launchType?.toString())
	}

}


fun AmazonECSFunctions.putAttributes(init: AmazonECSPutAttributesCommand.() -> Unit): com.amazonaws.services.ecs.model.PutAttributesResult {
	return this.block.declare(AmazonECSPutAttributesCommand().apply(init)) as com.amazonaws.services.ecs.model.PutAttributesResult
}

@Generated
class AmazonECSPutAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.PutAttributesRequest, com.amazonaws.services.ecs.model.PutAttributesResult> {

	var cluster: String? = null
	var attributes: List<com.amazonaws.services.ecs.model.Attribute>? = null

	override fun build(): com.amazonaws.services.ecs.model.PutAttributesRequest {
		val input = com.amazonaws.services.ecs.model.PutAttributesRequest()
		input.setCluster(this.cluster)
		input.setAttributes(this.attributes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.PutAttributesResult {
	  return com.amazonaws.services.ecs.model.PutAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.PutAttributesResult {
		return environment.ecs.putAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs put-attributes")
				.argument("cluster", cluster)
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonECSFunctions.registerContainerInstance(init: AmazonECSRegisterContainerInstanceCommand.() -> Unit): com.amazonaws.services.ecs.model.RegisterContainerInstanceResult {
	return this.block.declare(AmazonECSRegisterContainerInstanceCommand().apply(init)) as com.amazonaws.services.ecs.model.RegisterContainerInstanceResult
}

@Generated
class AmazonECSRegisterContainerInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.RegisterContainerInstanceRequest, com.amazonaws.services.ecs.model.RegisterContainerInstanceResult> {

	var cluster: String? = null
	var instanceIdentityDocument: String? = null
	var instanceIdentityDocumentSignature: String? = null
	var totalResources: List<com.amazonaws.services.ecs.model.Resource>? = null
	var versionInfo: com.amazonaws.services.ecs.model.VersionInfo? = null
	var containerInstanceArn: String? = null
	var attributes: List<com.amazonaws.services.ecs.model.Attribute>? = null

	override fun build(): com.amazonaws.services.ecs.model.RegisterContainerInstanceRequest {
		val input = com.amazonaws.services.ecs.model.RegisterContainerInstanceRequest()
		input.setCluster(this.cluster)
		input.setInstanceIdentityDocument(this.instanceIdentityDocument)
		input.setInstanceIdentityDocumentSignature(this.instanceIdentityDocumentSignature)
		input.setTotalResources(this.totalResources)
		input.setVersionInfo(this.versionInfo)
		input.setContainerInstanceArn(this.containerInstanceArn)
		input.setAttributes(this.attributes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.RegisterContainerInstanceResult {
	  return com.amazonaws.services.ecs.model.RegisterContainerInstanceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.RegisterContainerInstanceResult {
		return environment.ecs.registerContainerInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs register-container-instance")
				.argument("cluster", cluster)
				.argument("instance-identity-document", instanceIdentityDocument)
				.argument("instance-identity-document-signature", instanceIdentityDocumentSignature)
				.argument("total-resources", totalResources?.toString())
				.argument("version-info", versionInfo?.toString())
				.argument("container-instance-arn", containerInstanceArn)
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonECSFunctions.registerTaskDefinition(init: AmazonECSRegisterTaskDefinitionCommand.() -> Unit): com.amazonaws.services.ecs.model.RegisterTaskDefinitionResult {
	return this.block.declare(AmazonECSRegisterTaskDefinitionCommand().apply(init)) as com.amazonaws.services.ecs.model.RegisterTaskDefinitionResult
}

@Generated
class AmazonECSRegisterTaskDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.RegisterTaskDefinitionRequest, com.amazonaws.services.ecs.model.RegisterTaskDefinitionResult> {

	var family: String? = null
	var taskRoleArn: String? = null
	var executionRoleArn: String? = null
	var networkMode: NetworkMode? = null
	var containerDefinitions: List<com.amazonaws.services.ecs.model.ContainerDefinition>? = null
	var volumes: List<com.amazonaws.services.ecs.model.Volume>? = null
	var placementConstraints: List<com.amazonaws.services.ecs.model.TaskDefinitionPlacementConstraint>? = null
	var requiresCompatibilities: List<Compatibility>? = null
	var cpu: String? = null
	var memory: String? = null

	override fun build(): com.amazonaws.services.ecs.model.RegisterTaskDefinitionRequest {
		val input = com.amazonaws.services.ecs.model.RegisterTaskDefinitionRequest()
		input.setFamily(this.family)
		input.setTaskRoleArn(this.taskRoleArn)
		input.setExecutionRoleArn(this.executionRoleArn)
		input.setNetworkMode(this.networkMode?.toString())
		input.setContainerDefinitions(this.containerDefinitions)
		input.setVolumes(this.volumes)
		input.setPlacementConstraints(this.placementConstraints)
		input.setRequiresCompatibilities(this.requiresCompatibilities?.map { it.toString() })
		input.setCpu(this.cpu)
		input.setMemory(this.memory)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.RegisterTaskDefinitionResult {
	  return com.amazonaws.services.ecs.model.RegisterTaskDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.RegisterTaskDefinitionResult {
		return environment.ecs.registerTaskDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs register-task-definition")
				.argument("family", family)
				.argument("task-role-arn", taskRoleArn)
				.argument("execution-role-arn", executionRoleArn)
				.argument("network-mode", networkMode?.toString())
				.argument("container-definitions", containerDefinitions?.toString())
				.argument("volumes", volumes?.toString())
				.argument("placement-constraints", placementConstraints?.toString())
				.argument("requires-compatibilities", requiresCompatibilities?.toString())
				.argument("cpu", cpu)
				.argument("memory", memory)
	}

}


fun AmazonECSFunctions.runTask(init: AmazonECSRunTaskCommand.() -> Unit): com.amazonaws.services.ecs.model.RunTaskResult {
	return this.block.declare(AmazonECSRunTaskCommand().apply(init)) as com.amazonaws.services.ecs.model.RunTaskResult
}

@Generated
class AmazonECSRunTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.RunTaskRequest, com.amazonaws.services.ecs.model.RunTaskResult> {

	var cluster: String? = null
	var taskDefinition: String? = null
	var overrides: com.amazonaws.services.ecs.model.TaskOverride? = null
	var count: Int? = 0
	var startedBy: String? = null
	var group: String? = null
	var placementConstraints: List<com.amazonaws.services.ecs.model.PlacementConstraint>? = null
	var placementStrategy: List<com.amazonaws.services.ecs.model.PlacementStrategy>? = null
	var launchType: LaunchType? = null
	var platformVersion: String? = null
	var networkConfiguration: com.amazonaws.services.ecs.model.NetworkConfiguration? = null

	override fun build(): com.amazonaws.services.ecs.model.RunTaskRequest {
		val input = com.amazonaws.services.ecs.model.RunTaskRequest()
		input.setCluster(this.cluster)
		input.setTaskDefinition(this.taskDefinition)
		input.setOverrides(this.overrides)
		input.setCount(this.count)
		input.setStartedBy(this.startedBy)
		input.setGroup(this.group)
		input.setPlacementConstraints(this.placementConstraints)
		input.setPlacementStrategy(this.placementStrategy)
		input.setLaunchType(this.launchType?.toString())
		input.setPlatformVersion(this.platformVersion)
		input.setNetworkConfiguration(this.networkConfiguration)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.RunTaskResult {
	  return com.amazonaws.services.ecs.model.RunTaskResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.RunTaskResult {
		return environment.ecs.runTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs run-task")
				.argument("cluster", cluster)
				.argument("task-definition", taskDefinition)
				.argument("overrides", overrides?.toString())
				.argument("count", count?.toString())
				.argument("started-by", startedBy)
				.argument("group", group)
				.argument("placement-constraints", placementConstraints?.toString())
				.argument("placement-strategy", placementStrategy?.toString())
				.argument("launch-type", launchType?.toString())
				.argument("platform-version", platformVersion)
				.argument("network-configuration", networkConfiguration?.toString())
	}

}


fun AmazonECSFunctions.startTask(init: AmazonECSStartTaskCommand.() -> Unit): com.amazonaws.services.ecs.model.StartTaskResult {
	return this.block.declare(AmazonECSStartTaskCommand().apply(init)) as com.amazonaws.services.ecs.model.StartTaskResult
}

@Generated
class AmazonECSStartTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.StartTaskRequest, com.amazonaws.services.ecs.model.StartTaskResult> {

	var cluster: String? = null
	var taskDefinition: String? = null
	var overrides: com.amazonaws.services.ecs.model.TaskOverride? = null
	var containerInstances: List<String>? = null
	var startedBy: String? = null
	var group: String? = null
	var networkConfiguration: com.amazonaws.services.ecs.model.NetworkConfiguration? = null

	override fun build(): com.amazonaws.services.ecs.model.StartTaskRequest {
		val input = com.amazonaws.services.ecs.model.StartTaskRequest()
		input.setCluster(this.cluster)
		input.setTaskDefinition(this.taskDefinition)
		input.setOverrides(this.overrides)
		input.setContainerInstances(this.containerInstances)
		input.setStartedBy(this.startedBy)
		input.setGroup(this.group)
		input.setNetworkConfiguration(this.networkConfiguration)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.StartTaskResult {
	  return com.amazonaws.services.ecs.model.StartTaskResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.StartTaskResult {
		return environment.ecs.startTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs start-task")
				.argument("cluster", cluster)
				.argument("task-definition", taskDefinition)
				.argument("overrides", overrides?.toString())
				.argument("container-instances", containerInstances?.toString())
				.argument("started-by", startedBy)
				.argument("group", group)
				.argument("network-configuration", networkConfiguration?.toString())
	}

}


fun AmazonECSFunctions.stopTask(init: AmazonECSStopTaskCommand.() -> Unit): com.amazonaws.services.ecs.model.StopTaskResult {
	return this.block.declare(AmazonECSStopTaskCommand().apply(init)) as com.amazonaws.services.ecs.model.StopTaskResult
}

@Generated
class AmazonECSStopTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.StopTaskRequest, com.amazonaws.services.ecs.model.StopTaskResult> {

	var cluster: String? = null
	var task: String? = null
	var reason: String? = null

	override fun build(): com.amazonaws.services.ecs.model.StopTaskRequest {
		val input = com.amazonaws.services.ecs.model.StopTaskRequest()
		input.setCluster(this.cluster)
		input.setTask(this.task)
		input.setReason(this.reason)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.StopTaskResult {
	  return com.amazonaws.services.ecs.model.StopTaskResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.StopTaskResult {
		return environment.ecs.stopTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs stop-task")
				.argument("cluster", cluster)
				.argument("task", task)
				.argument("reason", reason)
	}

}


fun AmazonECSFunctions.submitContainerStateChange(init: AmazonECSSubmitContainerStateChangeCommand.() -> Unit): com.amazonaws.services.ecs.model.SubmitContainerStateChangeResult {
	return this.block.declare(AmazonECSSubmitContainerStateChangeCommand().apply(init)) as com.amazonaws.services.ecs.model.SubmitContainerStateChangeResult
}

@Generated
class AmazonECSSubmitContainerStateChangeCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.SubmitContainerStateChangeRequest, com.amazonaws.services.ecs.model.SubmitContainerStateChangeResult> {

	var cluster: String? = null
	var task: String? = null
	var containerName: String? = null
	var status: String? = null
	var exitCode: Int? = 0
	var reason: String? = null
	var networkBindings: List<com.amazonaws.services.ecs.model.NetworkBinding>? = null

	override fun build(): com.amazonaws.services.ecs.model.SubmitContainerStateChangeRequest {
		val input = com.amazonaws.services.ecs.model.SubmitContainerStateChangeRequest()
		input.setCluster(this.cluster)
		input.setTask(this.task)
		input.setContainerName(this.containerName)
		input.setStatus(this.status)
		input.setExitCode(this.exitCode)
		input.setReason(this.reason)
		input.setNetworkBindings(this.networkBindings)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.SubmitContainerStateChangeResult {
	  return com.amazonaws.services.ecs.model.SubmitContainerStateChangeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.SubmitContainerStateChangeResult {
		return environment.ecs.submitContainerStateChange(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs submit-container-state-change")
				.argument("cluster", cluster)
				.argument("task", task)
				.argument("container-name", containerName)
				.argument("status", status)
				.argument("exit-code", exitCode?.toString())
				.argument("reason", reason)
				.argument("network-bindings", networkBindings?.toString())
	}

}


fun AmazonECSFunctions.submitTaskStateChange(init: AmazonECSSubmitTaskStateChangeCommand.() -> Unit): com.amazonaws.services.ecs.model.SubmitTaskStateChangeResult {
	return this.block.declare(AmazonECSSubmitTaskStateChangeCommand().apply(init)) as com.amazonaws.services.ecs.model.SubmitTaskStateChangeResult
}

@Generated
class AmazonECSSubmitTaskStateChangeCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.SubmitTaskStateChangeRequest, com.amazonaws.services.ecs.model.SubmitTaskStateChangeResult> {

	var cluster: String? = null
	var task: String? = null
	var status: String? = null
	var reason: String? = null
	var containers: List<com.amazonaws.services.ecs.model.ContainerStateChange>? = null
	var attachments: List<com.amazonaws.services.ecs.model.AttachmentStateChange>? = null
	var pullStartedAt: java.util.Date? = null
	var pullStoppedAt: java.util.Date? = null
	var executionStoppedAt: java.util.Date? = null

	override fun build(): com.amazonaws.services.ecs.model.SubmitTaskStateChangeRequest {
		val input = com.amazonaws.services.ecs.model.SubmitTaskStateChangeRequest()
		input.setCluster(this.cluster)
		input.setTask(this.task)
		input.setStatus(this.status)
		input.setReason(this.reason)
		input.setContainers(this.containers)
		input.setAttachments(this.attachments)
		input.setPullStartedAt(this.pullStartedAt)
		input.setPullStoppedAt(this.pullStoppedAt)
		input.setExecutionStoppedAt(this.executionStoppedAt)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.SubmitTaskStateChangeResult {
	  return com.amazonaws.services.ecs.model.SubmitTaskStateChangeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.SubmitTaskStateChangeResult {
		return environment.ecs.submitTaskStateChange(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs submit-task-state-change")
				.argument("cluster", cluster)
				.argument("task", task)
				.argument("status", status)
				.argument("reason", reason)
				.argument("containers", containers?.toString())
				.argument("attachments", attachments?.toString())
				.argument("pull-started-at", pullStartedAt?.toString())
				.argument("pull-stopped-at", pullStoppedAt?.toString())
				.argument("execution-stopped-at", executionStoppedAt?.toString())
	}

}


fun AmazonECSFunctions.updateContainerAgent(init: AmazonECSUpdateContainerAgentCommand.() -> Unit): com.amazonaws.services.ecs.model.UpdateContainerAgentResult {
	return this.block.declare(AmazonECSUpdateContainerAgentCommand().apply(init)) as com.amazonaws.services.ecs.model.UpdateContainerAgentResult
}

@Generated
class AmazonECSUpdateContainerAgentCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.UpdateContainerAgentRequest, com.amazonaws.services.ecs.model.UpdateContainerAgentResult> {

	var cluster: String? = null
	var containerInstance: String? = null

	override fun build(): com.amazonaws.services.ecs.model.UpdateContainerAgentRequest {
		val input = com.amazonaws.services.ecs.model.UpdateContainerAgentRequest()
		input.setCluster(this.cluster)
		input.setContainerInstance(this.containerInstance)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.UpdateContainerAgentResult {
	  return com.amazonaws.services.ecs.model.UpdateContainerAgentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.UpdateContainerAgentResult {
		return environment.ecs.updateContainerAgent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs update-container-agent")
				.argument("cluster", cluster)
				.argument("container-instance", containerInstance)
	}

}


fun AmazonECSFunctions.updateContainerInstancesState(init: AmazonECSUpdateContainerInstancesStateCommand.() -> Unit): com.amazonaws.services.ecs.model.UpdateContainerInstancesStateResult {
	return this.block.declare(AmazonECSUpdateContainerInstancesStateCommand().apply(init)) as com.amazonaws.services.ecs.model.UpdateContainerInstancesStateResult
}

@Generated
class AmazonECSUpdateContainerInstancesStateCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.UpdateContainerInstancesStateRequest, com.amazonaws.services.ecs.model.UpdateContainerInstancesStateResult> {

	var cluster: String? = null
	var containerInstances: List<String>? = null
	var status: ContainerInstanceStatus? = null

	override fun build(): com.amazonaws.services.ecs.model.UpdateContainerInstancesStateRequest {
		val input = com.amazonaws.services.ecs.model.UpdateContainerInstancesStateRequest()
		input.setCluster(this.cluster)
		input.setContainerInstances(this.containerInstances)
		input.setStatus(this.status?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.UpdateContainerInstancesStateResult {
	  return com.amazonaws.services.ecs.model.UpdateContainerInstancesStateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.UpdateContainerInstancesStateResult {
		return environment.ecs.updateContainerInstancesState(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs update-container-instances-state")
				.argument("cluster", cluster)
				.argument("container-instances", containerInstances?.toString())
				.argument("status", status?.toString())
	}

}


fun AmazonECSFunctions.updateService(init: AmazonECSUpdateServiceCommand.() -> Unit): com.amazonaws.services.ecs.model.UpdateServiceResult {
	return this.block.declare(AmazonECSUpdateServiceCommand().apply(init)) as com.amazonaws.services.ecs.model.UpdateServiceResult
}

@Generated
class AmazonECSUpdateServiceCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.UpdateServiceRequest, com.amazonaws.services.ecs.model.UpdateServiceResult> {

	var cluster: String? = null
	var service: String? = null
	var desiredCount: Int? = 0
	var taskDefinition: String? = null
	var deploymentConfiguration: com.amazonaws.services.ecs.model.DeploymentConfiguration? = null
	var networkConfiguration: com.amazonaws.services.ecs.model.NetworkConfiguration? = null
	var platformVersion: String? = null
	var forceNewDeployment: Boolean? = false
	var healthCheckGracePeriodSeconds: Int? = 0

	override fun build(): com.amazonaws.services.ecs.model.UpdateServiceRequest {
		val input = com.amazonaws.services.ecs.model.UpdateServiceRequest()
		input.setCluster(this.cluster)
		input.setService(this.service)
		input.setDesiredCount(this.desiredCount)
		input.setTaskDefinition(this.taskDefinition)
		input.setDeploymentConfiguration(this.deploymentConfiguration)
		input.setNetworkConfiguration(this.networkConfiguration)
		input.setPlatformVersion(this.platformVersion)
		input.setForceNewDeployment(this.forceNewDeployment)
		input.setHealthCheckGracePeriodSeconds(this.healthCheckGracePeriodSeconds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.ecs.model.UpdateServiceResult {
	  return com.amazonaws.services.ecs.model.UpdateServiceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.ecs.model.UpdateServiceResult {
		return environment.ecs.updateService(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs update-service")
				.argument("cluster", cluster)
				.argument("service", service)
				.argument("desired-count", desiredCount?.toString())
				.argument("task-definition", taskDefinition)
				.argument("deployment-configuration", deploymentConfiguration?.toString())
				.argument("network-configuration", networkConfiguration?.toString())
				.argument("platform-version", platformVersion)
				.option("force-new-deployment", forceNewDeployment ?: false)
				.argument("health-check-grace-period-seconds", healthCheckGracePeriodSeconds?.toString())
	}

}
