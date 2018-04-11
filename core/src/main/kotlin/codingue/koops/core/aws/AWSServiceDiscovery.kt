
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.servicediscovery.AWSServiceDiscovery
import com.amazonaws.services.servicediscovery.model.*

var codingue.koops.core.Environment.servicediscovery: AWSServiceDiscovery
	get() = this.capabilities[AWSServiceDiscovery::class.java.name] as AWSServiceDiscovery
	set(servicediscovery) {
		this.capabilities[AWSServiceDiscovery::class.java.name] = servicediscovery
	}

@Generated
class AWSServiceDiscoveryFunctions(val block: Block)

infix fun <T> AwsContinuation.servicediscovery(init: AWSServiceDiscoveryFunctions.() -> T): T {
	return AWSServiceDiscoveryFunctions(shell).run(init)
}

			

fun AWSServiceDiscoveryFunctions.createPrivateDnsNamespace(name: String, vpc: String, init: AWSServiceDiscoveryCreatePrivateDnsNamespaceCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceResult {
	return this.block.declare(AWSServiceDiscoveryCreatePrivateDnsNamespaceCommand(name, vpc).apply(init)) as com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceResult
}

@Generated
class AWSServiceDiscoveryCreatePrivateDnsNamespaceCommand(val name: String, val vpc: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceRequest, com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceResult> {

	var creatorRequestId: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceRequest {
		val input = com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceRequest()
		input.setName(this.name)
		input.setCreatorRequestId(this.creatorRequestId)
		input.setDescription(this.description)
		input.setVpc(this.vpc)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceResult {
	  return com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceResult {
		return environment.servicediscovery.createPrivateDnsNamespace(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery create-private-dns-namespace")
				.argument("name", name)
				.argument("creator-request-id", creatorRequestId)
				.argument("description", description)
				.argument("vpc", vpc)
	}

}


fun AWSServiceDiscoveryFunctions.createPublicDnsNamespace(name: String, init: AWSServiceDiscoveryCreatePublicDnsNamespaceCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceResult {
	return this.block.declare(AWSServiceDiscoveryCreatePublicDnsNamespaceCommand(name).apply(init)) as com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceResult
}

@Generated
class AWSServiceDiscoveryCreatePublicDnsNamespaceCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceRequest, com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceResult> {

	var creatorRequestId: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceRequest {
		val input = com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceRequest()
		input.setName(this.name)
		input.setCreatorRequestId(this.creatorRequestId)
		input.setDescription(this.description)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceResult {
	  return com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceResult {
		return environment.servicediscovery.createPublicDnsNamespace(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery create-public-dns-namespace")
				.argument("name", name)
				.argument("creator-request-id", creatorRequestId)
				.argument("description", description)
	}

}


fun AWSServiceDiscoveryFunctions.createService(name: String, dnsConfig: com.amazonaws.services.servicediscovery.model.DnsConfig, init: AWSServiceDiscoveryCreateServiceCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.CreateServiceResult {
	return this.block.declare(AWSServiceDiscoveryCreateServiceCommand(name, dnsConfig).apply(init)) as com.amazonaws.services.servicediscovery.model.CreateServiceResult
}

@Generated
class AWSServiceDiscoveryCreateServiceCommand(val name: String, val dnsConfig: com.amazonaws.services.servicediscovery.model.DnsConfig) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.CreateServiceRequest, com.amazonaws.services.servicediscovery.model.CreateServiceResult> {

	var creatorRequestId: String? = null
	var description: String? = null
	var healthCheckConfig: com.amazonaws.services.servicediscovery.model.HealthCheckConfig? = null
	var healthCheckCustomConfig: com.amazonaws.services.servicediscovery.model.HealthCheckCustomConfig? = null

	override fun build(): com.amazonaws.services.servicediscovery.model.CreateServiceRequest {
		val input = com.amazonaws.services.servicediscovery.model.CreateServiceRequest()
		input.setName(this.name)
		input.setCreatorRequestId(this.creatorRequestId)
		input.setDescription(this.description)
		input.setDnsConfig(this.dnsConfig)
		input.setHealthCheckConfig(this.healthCheckConfig)
		input.setHealthCheckCustomConfig(this.healthCheckCustomConfig)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.CreateServiceResult {
	  return com.amazonaws.services.servicediscovery.model.CreateServiceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.CreateServiceResult {
		return environment.servicediscovery.createService(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery create-service")
				.argument("name", name)
				.argument("creator-request-id", creatorRequestId)
				.argument("description", description)
				.argument("dns-config", dnsConfig.toString())
				.argument("health-check-config", healthCheckConfig?.toString())
				.argument("health-check-custom-config", healthCheckCustomConfig?.toString())
	}

}


fun AWSServiceDiscoveryFunctions.deleteNamespace(id: String, init: AWSServiceDiscoveryDeleteNamespaceCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.DeleteNamespaceResult {
	return this.block.declare(AWSServiceDiscoveryDeleteNamespaceCommand(id).apply(init)) as com.amazonaws.services.servicediscovery.model.DeleteNamespaceResult
}

@Generated
class AWSServiceDiscoveryDeleteNamespaceCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.DeleteNamespaceRequest, com.amazonaws.services.servicediscovery.model.DeleteNamespaceResult> {



	override fun build(): com.amazonaws.services.servicediscovery.model.DeleteNamespaceRequest {
		val input = com.amazonaws.services.servicediscovery.model.DeleteNamespaceRequest()
		input.setId(this.id)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.DeleteNamespaceResult {
	  return com.amazonaws.services.servicediscovery.model.DeleteNamespaceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.DeleteNamespaceResult {
		return environment.servicediscovery.deleteNamespace(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery delete-namespace")
				.argument("id", id)
	}

}


fun AWSServiceDiscoveryFunctions.deleteService(id: String, init: AWSServiceDiscoveryDeleteServiceCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.DeleteServiceResult {
	return this.block.declare(AWSServiceDiscoveryDeleteServiceCommand(id).apply(init)) as com.amazonaws.services.servicediscovery.model.DeleteServiceResult
}

@Generated
class AWSServiceDiscoveryDeleteServiceCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.DeleteServiceRequest, com.amazonaws.services.servicediscovery.model.DeleteServiceResult> {



	override fun build(): com.amazonaws.services.servicediscovery.model.DeleteServiceRequest {
		val input = com.amazonaws.services.servicediscovery.model.DeleteServiceRequest()
		input.setId(this.id)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.DeleteServiceResult {
	  return com.amazonaws.services.servicediscovery.model.DeleteServiceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.DeleteServiceResult {
		return environment.servicediscovery.deleteService(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery delete-service")
				.argument("id", id)
	}

}


fun AWSServiceDiscoveryFunctions.deregisterInstance(serviceId: String, instanceId: String, init: AWSServiceDiscoveryDeregisterInstanceCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.DeregisterInstanceResult {
	return this.block.declare(AWSServiceDiscoveryDeregisterInstanceCommand(serviceId, instanceId).apply(init)) as com.amazonaws.services.servicediscovery.model.DeregisterInstanceResult
}

@Generated
class AWSServiceDiscoveryDeregisterInstanceCommand(val serviceId: String, val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.DeregisterInstanceRequest, com.amazonaws.services.servicediscovery.model.DeregisterInstanceResult> {



	override fun build(): com.amazonaws.services.servicediscovery.model.DeregisterInstanceRequest {
		val input = com.amazonaws.services.servicediscovery.model.DeregisterInstanceRequest()
		input.setServiceId(this.serviceId)
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.DeregisterInstanceResult {
	  return com.amazonaws.services.servicediscovery.model.DeregisterInstanceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.DeregisterInstanceResult {
		return environment.servicediscovery.deregisterInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery deregister-instance")
				.argument("service-id", serviceId)
				.argument("instance-id", instanceId)
	}

}


fun AWSServiceDiscoveryFunctions.getInstance(serviceId: String, instanceId: String, init: AWSServiceDiscoveryGetInstanceCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.GetInstanceResult {
	return this.block.declare(AWSServiceDiscoveryGetInstanceCommand(serviceId, instanceId).apply(init)) as com.amazonaws.services.servicediscovery.model.GetInstanceResult
}

@Generated
class AWSServiceDiscoveryGetInstanceCommand(val serviceId: String, val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.GetInstanceRequest, com.amazonaws.services.servicediscovery.model.GetInstanceResult> {



	override fun build(): com.amazonaws.services.servicediscovery.model.GetInstanceRequest {
		val input = com.amazonaws.services.servicediscovery.model.GetInstanceRequest()
		input.setServiceId(this.serviceId)
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.GetInstanceResult {
	  return com.amazonaws.services.servicediscovery.model.GetInstanceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.GetInstanceResult {
		return environment.servicediscovery.getInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery get-instance")
				.argument("service-id", serviceId)
				.argument("instance-id", instanceId)
	}

}


fun AWSServiceDiscoveryFunctions.getInstancesHealthStatus(serviceId: String, init: AWSServiceDiscoveryGetInstancesHealthStatusCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusResult {
	return this.block.declare(AWSServiceDiscoveryGetInstancesHealthStatusCommand(serviceId).apply(init)) as com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusResult
}

@Generated
class AWSServiceDiscoveryGetInstancesHealthStatusCommand(val serviceId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusRequest, com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusResult> {

	var instances: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusRequest {
		val input = com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusRequest()
		input.setServiceId(this.serviceId)
		input.setInstances(this.instances)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusResult {
	  return com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusResult {
		return environment.servicediscovery.getInstancesHealthStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery get-instances-health-status")
				.argument("service-id", serviceId)
				.argument("instances", instances?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSServiceDiscoveryFunctions.getNamespace(id: String, init: AWSServiceDiscoveryGetNamespaceCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.GetNamespaceResult {
	return this.block.declare(AWSServiceDiscoveryGetNamespaceCommand(id).apply(init)) as com.amazonaws.services.servicediscovery.model.GetNamespaceResult
}

@Generated
class AWSServiceDiscoveryGetNamespaceCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.GetNamespaceRequest, com.amazonaws.services.servicediscovery.model.GetNamespaceResult> {



	override fun build(): com.amazonaws.services.servicediscovery.model.GetNamespaceRequest {
		val input = com.amazonaws.services.servicediscovery.model.GetNamespaceRequest()
		input.setId(this.id)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.GetNamespaceResult {
	  return com.amazonaws.services.servicediscovery.model.GetNamespaceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.GetNamespaceResult {
		return environment.servicediscovery.getNamespace(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery get-namespace")
				.argument("id", id)
	}

}


fun AWSServiceDiscoveryFunctions.getOperation(operationId: String, init: AWSServiceDiscoveryGetOperationCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.GetOperationResult {
	return this.block.declare(AWSServiceDiscoveryGetOperationCommand(operationId).apply(init)) as com.amazonaws.services.servicediscovery.model.GetOperationResult
}

@Generated
class AWSServiceDiscoveryGetOperationCommand(val operationId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.GetOperationRequest, com.amazonaws.services.servicediscovery.model.GetOperationResult> {



	override fun build(): com.amazonaws.services.servicediscovery.model.GetOperationRequest {
		val input = com.amazonaws.services.servicediscovery.model.GetOperationRequest()
		input.setOperationId(this.operationId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.GetOperationResult {
	  return com.amazonaws.services.servicediscovery.model.GetOperationResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.GetOperationResult {
		return environment.servicediscovery.getOperation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery get-operation")
				.argument("operation-id", operationId)
	}

}


fun AWSServiceDiscoveryFunctions.getService(id: String, init: AWSServiceDiscoveryGetServiceCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.GetServiceResult {
	return this.block.declare(AWSServiceDiscoveryGetServiceCommand(id).apply(init)) as com.amazonaws.services.servicediscovery.model.GetServiceResult
}

@Generated
class AWSServiceDiscoveryGetServiceCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.GetServiceRequest, com.amazonaws.services.servicediscovery.model.GetServiceResult> {



	override fun build(): com.amazonaws.services.servicediscovery.model.GetServiceRequest {
		val input = com.amazonaws.services.servicediscovery.model.GetServiceRequest()
		input.setId(this.id)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.GetServiceResult {
	  return com.amazonaws.services.servicediscovery.model.GetServiceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.GetServiceResult {
		return environment.servicediscovery.getService(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery get-service")
				.argument("id", id)
	}

}


fun AWSServiceDiscoveryFunctions.listInstances(serviceId: String, init: AWSServiceDiscoveryListInstancesCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.ListInstancesResult {
	return this.block.declare(AWSServiceDiscoveryListInstancesCommand(serviceId).apply(init)) as com.amazonaws.services.servicediscovery.model.ListInstancesResult
}

@Generated
class AWSServiceDiscoveryListInstancesCommand(val serviceId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.ListInstancesRequest, com.amazonaws.services.servicediscovery.model.ListInstancesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.servicediscovery.model.ListInstancesRequest {
		val input = com.amazonaws.services.servicediscovery.model.ListInstancesRequest()
		input.setServiceId(this.serviceId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.ListInstancesResult {
	  return com.amazonaws.services.servicediscovery.model.ListInstancesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.ListInstancesResult {
		return environment.servicediscovery.listInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery list-instances")
				.argument("service-id", serviceId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSServiceDiscoveryFunctions.listNamespaces(init: AWSServiceDiscoveryListNamespacesCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.ListNamespacesResult {
	return this.block.declare(AWSServiceDiscoveryListNamespacesCommand().apply(init)) as com.amazonaws.services.servicediscovery.model.ListNamespacesResult
}

@Generated
class AWSServiceDiscoveryListNamespacesCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.ListNamespacesRequest, com.amazonaws.services.servicediscovery.model.ListNamespacesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var filters: List<com.amazonaws.services.servicediscovery.model.NamespaceFilter>? = null

	override fun build(): com.amazonaws.services.servicediscovery.model.ListNamespacesRequest {
		val input = com.amazonaws.services.servicediscovery.model.ListNamespacesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setFilters(this.filters)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.ListNamespacesResult {
	  return com.amazonaws.services.servicediscovery.model.ListNamespacesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.ListNamespacesResult {
		return environment.servicediscovery.listNamespaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery list-namespaces")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
	}

}


fun AWSServiceDiscoveryFunctions.listOperations(init: AWSServiceDiscoveryListOperationsCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.ListOperationsResult {
	return this.block.declare(AWSServiceDiscoveryListOperationsCommand().apply(init)) as com.amazonaws.services.servicediscovery.model.ListOperationsResult
}

@Generated
class AWSServiceDiscoveryListOperationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.ListOperationsRequest, com.amazonaws.services.servicediscovery.model.ListOperationsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var filters: List<com.amazonaws.services.servicediscovery.model.OperationFilter>? = null

	override fun build(): com.amazonaws.services.servicediscovery.model.ListOperationsRequest {
		val input = com.amazonaws.services.servicediscovery.model.ListOperationsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setFilters(this.filters)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.ListOperationsResult {
	  return com.amazonaws.services.servicediscovery.model.ListOperationsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.ListOperationsResult {
		return environment.servicediscovery.listOperations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery list-operations")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
	}

}


fun AWSServiceDiscoveryFunctions.listServices(init: AWSServiceDiscoveryListServicesCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.ListServicesResult {
	return this.block.declare(AWSServiceDiscoveryListServicesCommand().apply(init)) as com.amazonaws.services.servicediscovery.model.ListServicesResult
}

@Generated
class AWSServiceDiscoveryListServicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.ListServicesRequest, com.amazonaws.services.servicediscovery.model.ListServicesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var filters: List<com.amazonaws.services.servicediscovery.model.ServiceFilter>? = null

	override fun build(): com.amazonaws.services.servicediscovery.model.ListServicesRequest {
		val input = com.amazonaws.services.servicediscovery.model.ListServicesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setFilters(this.filters)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.ListServicesResult {
	  return com.amazonaws.services.servicediscovery.model.ListServicesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.ListServicesResult {
		return environment.servicediscovery.listServices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery list-services")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
	}

}


fun AWSServiceDiscoveryFunctions.registerInstance(serviceId: String, instanceId: String, attributes: Map<String, String>, init: AWSServiceDiscoveryRegisterInstanceCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.RegisterInstanceResult {
	return this.block.declare(AWSServiceDiscoveryRegisterInstanceCommand(serviceId, instanceId, attributes).apply(init)) as com.amazonaws.services.servicediscovery.model.RegisterInstanceResult
}

@Generated
class AWSServiceDiscoveryRegisterInstanceCommand(val serviceId: String, val instanceId: String, val attributes: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.RegisterInstanceRequest, com.amazonaws.services.servicediscovery.model.RegisterInstanceResult> {

	var creatorRequestId: String? = null

	override fun build(): com.amazonaws.services.servicediscovery.model.RegisterInstanceRequest {
		val input = com.amazonaws.services.servicediscovery.model.RegisterInstanceRequest()
		input.setServiceId(this.serviceId)
		input.setInstanceId(this.instanceId)
		input.setCreatorRequestId(this.creatorRequestId)
		input.setAttributes(this.attributes)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.RegisterInstanceResult {
	  return com.amazonaws.services.servicediscovery.model.RegisterInstanceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.RegisterInstanceResult {
		return environment.servicediscovery.registerInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery register-instance")
				.argument("service-id", serviceId)
				.argument("instance-id", instanceId)
				.argument("creator-request-id", creatorRequestId)
				.argument("attributes", attributes.toString())
	}

}


fun AWSServiceDiscoveryFunctions.updateInstanceCustomHealthStatus(serviceId: String, instanceId: String, status: CustomHealthStatus, init: AWSServiceDiscoveryUpdateInstanceCustomHealthStatusCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusResult {
	return this.block.declare(AWSServiceDiscoveryUpdateInstanceCustomHealthStatusCommand(serviceId, instanceId, status).apply(init)) as com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusResult
}

@Generated
class AWSServiceDiscoveryUpdateInstanceCustomHealthStatusCommand(val serviceId: String, val instanceId: String, val status: CustomHealthStatus) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusRequest, com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusResult> {



	override fun build(): com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusRequest {
		val input = com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusRequest()
		input.setServiceId(this.serviceId)
		input.setInstanceId(this.instanceId)
		input.setStatus(this.status.toString())
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusResult {
	  return com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusResult {
		return environment.servicediscovery.updateInstanceCustomHealthStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery update-instance-custom-health-status")
				.argument("service-id", serviceId)
				.argument("instance-id", instanceId)
				.argument("status", status.toString())
	}

}


fun AWSServiceDiscoveryFunctions.updateService(id: String, service: com.amazonaws.services.servicediscovery.model.ServiceChange, init: AWSServiceDiscoveryUpdateServiceCommand.() -> Unit): com.amazonaws.services.servicediscovery.model.UpdateServiceResult {
	return this.block.declare(AWSServiceDiscoveryUpdateServiceCommand(id, service).apply(init)) as com.amazonaws.services.servicediscovery.model.UpdateServiceResult
}

@Generated
class AWSServiceDiscoveryUpdateServiceCommand(val id: String, val service: com.amazonaws.services.servicediscovery.model.ServiceChange) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.UpdateServiceRequest, com.amazonaws.services.servicediscovery.model.UpdateServiceResult> {



	override fun build(): com.amazonaws.services.servicediscovery.model.UpdateServiceRequest {
		val input = com.amazonaws.services.servicediscovery.model.UpdateServiceRequest()
		input.setId(this.id)
		input.setService(this.service)
		return input
	}

	override fun dryResult(): com.amazonaws.services.servicediscovery.model.UpdateServiceResult {
	  return com.amazonaws.services.servicediscovery.model.UpdateServiceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.servicediscovery.model.UpdateServiceResult {
		return environment.servicediscovery.updateService(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery update-service")
				.argument("id", id)
				.argument("service", service.toString())
	}

}
