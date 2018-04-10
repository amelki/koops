
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
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

infix fun AwsContinuation.ecs(init: AmazonECSFunctions.() -> Unit) {
	AmazonECSFunctions(shell).apply(init)
}

			

fun AmazonECSFunctions.createCluster(init: AmazonECSCreateClusterCommand.() -> Unit) {
	this.block.declare(AmazonECSCreateClusterCommand().apply(init))
}

@Generated
class AmazonECSCreateClusterCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.CreateClusterRequest> {

	var clusterName: String? = null

	override fun build(): com.amazonaws.services.ecs.model.CreateClusterRequest {
		val input = com.amazonaws.services.ecs.model.CreateClusterRequest()
		input.setClusterName(this.clusterName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.createCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs create-cluster")
				.argument("cluster-name", clusterName)
	}

}


fun AmazonECSFunctions.createService(init: AmazonECSCreateServiceCommand.() -> Unit) {
	this.block.declare(AmazonECSCreateServiceCommand().apply(init))
}

@Generated
class AmazonECSCreateServiceCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.CreateServiceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.createService(build())
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


fun AmazonECSFunctions.deleteAttributes(init: AmazonECSDeleteAttributesCommand.() -> Unit) {
	this.block.declare(AmazonECSDeleteAttributesCommand().apply(init))
}

@Generated
class AmazonECSDeleteAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DeleteAttributesRequest> {

	var cluster: String? = null
	var attributes: List<com.amazonaws.services.ecs.model.Attribute>? = null

	override fun build(): com.amazonaws.services.ecs.model.DeleteAttributesRequest {
		val input = com.amazonaws.services.ecs.model.DeleteAttributesRequest()
		input.setCluster(this.cluster)
		input.setAttributes(this.attributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.deleteAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs delete-attributes")
				.argument("cluster", cluster)
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonECSFunctions.deleteCluster(init: AmazonECSDeleteClusterCommand.() -> Unit) {
	this.block.declare(AmazonECSDeleteClusterCommand().apply(init))
}

@Generated
class AmazonECSDeleteClusterCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DeleteClusterRequest> {

	var cluster: String? = null

	override fun build(): com.amazonaws.services.ecs.model.DeleteClusterRequest {
		val input = com.amazonaws.services.ecs.model.DeleteClusterRequest()
		input.setCluster(this.cluster)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.deleteCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs delete-cluster")
				.argument("cluster", cluster)
	}

}


fun AmazonECSFunctions.deleteService(init: AmazonECSDeleteServiceCommand.() -> Unit) {
	this.block.declare(AmazonECSDeleteServiceCommand().apply(init))
}

@Generated
class AmazonECSDeleteServiceCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DeleteServiceRequest> {

	var cluster: String? = null
	var service: String? = null

	override fun build(): com.amazonaws.services.ecs.model.DeleteServiceRequest {
		val input = com.amazonaws.services.ecs.model.DeleteServiceRequest()
		input.setCluster(this.cluster)
		input.setService(this.service)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.deleteService(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs delete-service")
				.argument("cluster", cluster)
				.argument("service", service)
	}

}


fun AmazonECSFunctions.deregisterContainerInstance(init: AmazonECSDeregisterContainerInstanceCommand.() -> Unit) {
	this.block.declare(AmazonECSDeregisterContainerInstanceCommand().apply(init))
}

@Generated
class AmazonECSDeregisterContainerInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DeregisterContainerInstanceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.deregisterContainerInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs deregister-container-instance")
				.argument("cluster", cluster)
				.argument("container-instance", containerInstance)
				.option("force", force ?: false)
	}

}


fun AmazonECSFunctions.deregisterTaskDefinition(init: AmazonECSDeregisterTaskDefinitionCommand.() -> Unit) {
	this.block.declare(AmazonECSDeregisterTaskDefinitionCommand().apply(init))
}

@Generated
class AmazonECSDeregisterTaskDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DeregisterTaskDefinitionRequest> {

	var taskDefinition: String? = null

	override fun build(): com.amazonaws.services.ecs.model.DeregisterTaskDefinitionRequest {
		val input = com.amazonaws.services.ecs.model.DeregisterTaskDefinitionRequest()
		input.setTaskDefinition(this.taskDefinition)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.deregisterTaskDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs deregister-task-definition")
				.argument("task-definition", taskDefinition)
	}

}


fun AmazonECSFunctions.describeClusters(init: AmazonECSDescribeClustersCommand.() -> Unit) {
	this.block.declare(AmazonECSDescribeClustersCommand().apply(init))
}

@Generated
class AmazonECSDescribeClustersCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DescribeClustersRequest> {

	var clusters: List<String>? = null
	var include: List<ClusterField>? = null

	override fun build(): com.amazonaws.services.ecs.model.DescribeClustersRequest {
		val input = com.amazonaws.services.ecs.model.DescribeClustersRequest()
		input.setClusters(this.clusters)
		input.setInclude(this.include?.map { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.describeClusters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs describe-clusters")
				.argument("clusters", clusters?.toString())
				.argument("include", include?.toString())
	}

}


fun AmazonECSFunctions.describeContainerInstances(init: AmazonECSDescribeContainerInstancesCommand.() -> Unit) {
	this.block.declare(AmazonECSDescribeContainerInstancesCommand().apply(init))
}

@Generated
class AmazonECSDescribeContainerInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DescribeContainerInstancesRequest> {

	var cluster: String? = null
	var containerInstances: List<String>? = null

	override fun build(): com.amazonaws.services.ecs.model.DescribeContainerInstancesRequest {
		val input = com.amazonaws.services.ecs.model.DescribeContainerInstancesRequest()
		input.setCluster(this.cluster)
		input.setContainerInstances(this.containerInstances)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.describeContainerInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs describe-container-instances")
				.argument("cluster", cluster)
				.argument("container-instances", containerInstances?.toString())
	}

}


fun AmazonECSFunctions.describeServices(init: AmazonECSDescribeServicesCommand.() -> Unit) {
	this.block.declare(AmazonECSDescribeServicesCommand().apply(init))
}

@Generated
class AmazonECSDescribeServicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DescribeServicesRequest> {

	var cluster: String? = null
	var services: List<String>? = null

	override fun build(): com.amazonaws.services.ecs.model.DescribeServicesRequest {
		val input = com.amazonaws.services.ecs.model.DescribeServicesRequest()
		input.setCluster(this.cluster)
		input.setServices(this.services)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.describeServices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs describe-services")
				.argument("cluster", cluster)
				.argument("services", services?.toString())
	}

}


fun AmazonECSFunctions.describeTaskDefinition(init: AmazonECSDescribeTaskDefinitionCommand.() -> Unit) {
	this.block.declare(AmazonECSDescribeTaskDefinitionCommand().apply(init))
}

@Generated
class AmazonECSDescribeTaskDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DescribeTaskDefinitionRequest> {

	var taskDefinition: String? = null

	override fun build(): com.amazonaws.services.ecs.model.DescribeTaskDefinitionRequest {
		val input = com.amazonaws.services.ecs.model.DescribeTaskDefinitionRequest()
		input.setTaskDefinition(this.taskDefinition)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.describeTaskDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs describe-task-definition")
				.argument("task-definition", taskDefinition)
	}

}


fun AmazonECSFunctions.describeTasks(init: AmazonECSDescribeTasksCommand.() -> Unit) {
	this.block.declare(AmazonECSDescribeTasksCommand().apply(init))
}

@Generated
class AmazonECSDescribeTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DescribeTasksRequest> {

	var cluster: String? = null
	var tasks: List<String>? = null

	override fun build(): com.amazonaws.services.ecs.model.DescribeTasksRequest {
		val input = com.amazonaws.services.ecs.model.DescribeTasksRequest()
		input.setCluster(this.cluster)
		input.setTasks(this.tasks)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.describeTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs describe-tasks")
				.argument("cluster", cluster)
				.argument("tasks", tasks?.toString())
	}

}


fun AmazonECSFunctions.discoverPollEndpoint(init: AmazonECSDiscoverPollEndpointCommand.() -> Unit) {
	this.block.declare(AmazonECSDiscoverPollEndpointCommand().apply(init))
}

@Generated
class AmazonECSDiscoverPollEndpointCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.DiscoverPollEndpointRequest> {

	var containerInstance: String? = null
	var cluster: String? = null

	override fun build(): com.amazonaws.services.ecs.model.DiscoverPollEndpointRequest {
		val input = com.amazonaws.services.ecs.model.DiscoverPollEndpointRequest()
		input.setContainerInstance(this.containerInstance)
		input.setCluster(this.cluster)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.discoverPollEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs discover-poll-endpoint")
				.argument("container-instance", containerInstance)
				.argument("cluster", cluster)
	}

}


fun AmazonECSFunctions.listAttributes(init: AmazonECSListAttributesCommand.() -> Unit) {
	this.block.declare(AmazonECSListAttributesCommand().apply(init))
}

@Generated
class AmazonECSListAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.ListAttributesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.listAttributes(build())
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


fun AmazonECSFunctions.listClusters(init: AmazonECSListClustersCommand.() -> Unit) {
	this.block.declare(AmazonECSListClustersCommand().apply(init))
}

@Generated
class AmazonECSListClustersCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.ListClustersRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.ecs.model.ListClustersRequest {
		val input = com.amazonaws.services.ecs.model.ListClustersRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.listClusters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs list-clusters")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonECSFunctions.listContainerInstances(init: AmazonECSListContainerInstancesCommand.() -> Unit) {
	this.block.declare(AmazonECSListContainerInstancesCommand().apply(init))
}

@Generated
class AmazonECSListContainerInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.ListContainerInstancesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.listContainerInstances(build())
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


fun AmazonECSFunctions.listServices(init: AmazonECSListServicesCommand.() -> Unit) {
	this.block.declare(AmazonECSListServicesCommand().apply(init))
}

@Generated
class AmazonECSListServicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.ListServicesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.listServices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs list-services")
				.argument("cluster", cluster)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("launch-type", launchType?.toString())
	}

}


fun AmazonECSFunctions.listTaskDefinitionFamilies(init: AmazonECSListTaskDefinitionFamiliesCommand.() -> Unit) {
	this.block.declare(AmazonECSListTaskDefinitionFamiliesCommand().apply(init))
}

@Generated
class AmazonECSListTaskDefinitionFamiliesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.ListTaskDefinitionFamiliesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.listTaskDefinitionFamilies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs list-task-definition-families")
				.argument("family-prefix", familyPrefix)
				.argument("status", status?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonECSFunctions.listTaskDefinitions(init: AmazonECSListTaskDefinitionsCommand.() -> Unit) {
	this.block.declare(AmazonECSListTaskDefinitionsCommand().apply(init))
}

@Generated
class AmazonECSListTaskDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.ListTaskDefinitionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.listTaskDefinitions(build())
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


fun AmazonECSFunctions.listTasks(init: AmazonECSListTasksCommand.() -> Unit) {
	this.block.declare(AmazonECSListTasksCommand().apply(init))
}

@Generated
class AmazonECSListTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.ListTasksRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.listTasks(build())
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


fun AmazonECSFunctions.putAttributes(init: AmazonECSPutAttributesCommand.() -> Unit) {
	this.block.declare(AmazonECSPutAttributesCommand().apply(init))
}

@Generated
class AmazonECSPutAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.PutAttributesRequest> {

	var cluster: String? = null
	var attributes: List<com.amazonaws.services.ecs.model.Attribute>? = null

	override fun build(): com.amazonaws.services.ecs.model.PutAttributesRequest {
		val input = com.amazonaws.services.ecs.model.PutAttributesRequest()
		input.setCluster(this.cluster)
		input.setAttributes(this.attributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.putAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs put-attributes")
				.argument("cluster", cluster)
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonECSFunctions.registerContainerInstance(init: AmazonECSRegisterContainerInstanceCommand.() -> Unit) {
	this.block.declare(AmazonECSRegisterContainerInstanceCommand().apply(init))
}

@Generated
class AmazonECSRegisterContainerInstanceCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.RegisterContainerInstanceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.registerContainerInstance(build())
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


fun AmazonECSFunctions.registerTaskDefinition(init: AmazonECSRegisterTaskDefinitionCommand.() -> Unit) {
	this.block.declare(AmazonECSRegisterTaskDefinitionCommand().apply(init))
}

@Generated
class AmazonECSRegisterTaskDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.RegisterTaskDefinitionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.registerTaskDefinition(build())
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


fun AmazonECSFunctions.runTask(init: AmazonECSRunTaskCommand.() -> Unit) {
	this.block.declare(AmazonECSRunTaskCommand().apply(init))
}

@Generated
class AmazonECSRunTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.RunTaskRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.runTask(build())
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


fun AmazonECSFunctions.startTask(init: AmazonECSStartTaskCommand.() -> Unit) {
	this.block.declare(AmazonECSStartTaskCommand().apply(init))
}

@Generated
class AmazonECSStartTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.StartTaskRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.startTask(build())
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


fun AmazonECSFunctions.stopTask(init: AmazonECSStopTaskCommand.() -> Unit) {
	this.block.declare(AmazonECSStopTaskCommand().apply(init))
}

@Generated
class AmazonECSStopTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.StopTaskRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.stopTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs stop-task")
				.argument("cluster", cluster)
				.argument("task", task)
				.argument("reason", reason)
	}

}


fun AmazonECSFunctions.submitContainerStateChange(init: AmazonECSSubmitContainerStateChangeCommand.() -> Unit) {
	this.block.declare(AmazonECSSubmitContainerStateChangeCommand().apply(init))
}

@Generated
class AmazonECSSubmitContainerStateChangeCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.SubmitContainerStateChangeRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.submitContainerStateChange(build())
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


fun AmazonECSFunctions.submitTaskStateChange(init: AmazonECSSubmitTaskStateChangeCommand.() -> Unit) {
	this.block.declare(AmazonECSSubmitTaskStateChangeCommand().apply(init))
}

@Generated
class AmazonECSSubmitTaskStateChangeCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.SubmitTaskStateChangeRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.submitTaskStateChange(build())
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


fun AmazonECSFunctions.updateContainerAgent(init: AmazonECSUpdateContainerAgentCommand.() -> Unit) {
	this.block.declare(AmazonECSUpdateContainerAgentCommand().apply(init))
}

@Generated
class AmazonECSUpdateContainerAgentCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.UpdateContainerAgentRequest> {

	var cluster: String? = null
	var containerInstance: String? = null

	override fun build(): com.amazonaws.services.ecs.model.UpdateContainerAgentRequest {
		val input = com.amazonaws.services.ecs.model.UpdateContainerAgentRequest()
		input.setCluster(this.cluster)
		input.setContainerInstance(this.containerInstance)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.updateContainerAgent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs update-container-agent")
				.argument("cluster", cluster)
				.argument("container-instance", containerInstance)
	}

}


fun AmazonECSFunctions.updateContainerInstancesState(init: AmazonECSUpdateContainerInstancesStateCommand.() -> Unit) {
	this.block.declare(AmazonECSUpdateContainerInstancesStateCommand().apply(init))
}

@Generated
class AmazonECSUpdateContainerInstancesStateCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.UpdateContainerInstancesStateRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.updateContainerInstancesState(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ecs update-container-instances-state")
				.argument("cluster", cluster)
				.argument("container-instances", containerInstances?.toString())
				.argument("status", status?.toString())
	}

}


fun AmazonECSFunctions.updateService(init: AmazonECSUpdateServiceCommand.() -> Unit) {
	this.block.declare(AmazonECSUpdateServiceCommand().apply(init))
}

@Generated
class AmazonECSUpdateServiceCommand() : AmazonWebServiceCommand<com.amazonaws.services.ecs.model.UpdateServiceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ecs.updateService(build())
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
