
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

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

infix fun AwsContinuation.servicediscovery(init: AWSServiceDiscoveryFunctions.() -> Unit) {
	AWSServiceDiscoveryFunctions(shell).apply(init)
}

			

fun AWSServiceDiscoveryFunctions.createPrivateDnsNamespace(name: String, vpc: String, init: AWSServiceDiscoveryCreatePrivateDnsNamespaceCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryCreatePrivateDnsNamespaceCommand(name, vpc).apply(init))
}

@Generated
class AWSServiceDiscoveryCreatePrivateDnsNamespaceCommand(val name: String, val vpc: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.CreatePrivateDnsNamespaceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.createPrivateDnsNamespace(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery create-private-dns-namespace")
				.argument("name", name)
				.argument("creator-request-id", creatorRequestId)
				.argument("description", description)
				.argument("vpc", vpc)
	}

}


fun AWSServiceDiscoveryFunctions.createPublicDnsNamespace(name: String, init: AWSServiceDiscoveryCreatePublicDnsNamespaceCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryCreatePublicDnsNamespaceCommand(name).apply(init))
}

@Generated
class AWSServiceDiscoveryCreatePublicDnsNamespaceCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceRequest> {

	var creatorRequestId: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceRequest {
		val input = com.amazonaws.services.servicediscovery.model.CreatePublicDnsNamespaceRequest()
		input.setName(this.name)
		input.setCreatorRequestId(this.creatorRequestId)
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.createPublicDnsNamespace(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery create-public-dns-namespace")
				.argument("name", name)
				.argument("creator-request-id", creatorRequestId)
				.argument("description", description)
	}

}


fun AWSServiceDiscoveryFunctions.createService(name: String, dnsConfig: com.amazonaws.services.servicediscovery.model.DnsConfig, init: AWSServiceDiscoveryCreateServiceCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryCreateServiceCommand(name, dnsConfig).apply(init))
}

@Generated
class AWSServiceDiscoveryCreateServiceCommand(val name: String, val dnsConfig: com.amazonaws.services.servicediscovery.model.DnsConfig) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.CreateServiceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.createService(build())
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


fun AWSServiceDiscoveryFunctions.deleteNamespace(id: String, init: AWSServiceDiscoveryDeleteNamespaceCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryDeleteNamespaceCommand(id).apply(init))
}

@Generated
class AWSServiceDiscoveryDeleteNamespaceCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.DeleteNamespaceRequest> {



	override fun build(): com.amazonaws.services.servicediscovery.model.DeleteNamespaceRequest {
		val input = com.amazonaws.services.servicediscovery.model.DeleteNamespaceRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.deleteNamespace(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery delete-namespace")
				.argument("id", id)
	}

}


fun AWSServiceDiscoveryFunctions.deleteService(id: String, init: AWSServiceDiscoveryDeleteServiceCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryDeleteServiceCommand(id).apply(init))
}

@Generated
class AWSServiceDiscoveryDeleteServiceCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.DeleteServiceRequest> {



	override fun build(): com.amazonaws.services.servicediscovery.model.DeleteServiceRequest {
		val input = com.amazonaws.services.servicediscovery.model.DeleteServiceRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.deleteService(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery delete-service")
				.argument("id", id)
	}

}


fun AWSServiceDiscoveryFunctions.deregisterInstance(serviceId: String, instanceId: String, init: AWSServiceDiscoveryDeregisterInstanceCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryDeregisterInstanceCommand(serviceId, instanceId).apply(init))
}

@Generated
class AWSServiceDiscoveryDeregisterInstanceCommand(val serviceId: String, val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.DeregisterInstanceRequest> {



	override fun build(): com.amazonaws.services.servicediscovery.model.DeregisterInstanceRequest {
		val input = com.amazonaws.services.servicediscovery.model.DeregisterInstanceRequest()
		input.setServiceId(this.serviceId)
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.deregisterInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery deregister-instance")
				.argument("service-id", serviceId)
				.argument("instance-id", instanceId)
	}

}


fun AWSServiceDiscoveryFunctions.getInstance(serviceId: String, instanceId: String, init: AWSServiceDiscoveryGetInstanceCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryGetInstanceCommand(serviceId, instanceId).apply(init))
}

@Generated
class AWSServiceDiscoveryGetInstanceCommand(val serviceId: String, val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.GetInstanceRequest> {



	override fun build(): com.amazonaws.services.servicediscovery.model.GetInstanceRequest {
		val input = com.amazonaws.services.servicediscovery.model.GetInstanceRequest()
		input.setServiceId(this.serviceId)
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.getInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery get-instance")
				.argument("service-id", serviceId)
				.argument("instance-id", instanceId)
	}

}


fun AWSServiceDiscoveryFunctions.getInstancesHealthStatus(serviceId: String, init: AWSServiceDiscoveryGetInstancesHealthStatusCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryGetInstancesHealthStatusCommand(serviceId).apply(init))
}

@Generated
class AWSServiceDiscoveryGetInstancesHealthStatusCommand(val serviceId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.GetInstancesHealthStatusRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.getInstancesHealthStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery get-instances-health-status")
				.argument("service-id", serviceId)
				.argument("instances", instances?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSServiceDiscoveryFunctions.getNamespace(id: String, init: AWSServiceDiscoveryGetNamespaceCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryGetNamespaceCommand(id).apply(init))
}

@Generated
class AWSServiceDiscoveryGetNamespaceCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.GetNamespaceRequest> {



	override fun build(): com.amazonaws.services.servicediscovery.model.GetNamespaceRequest {
		val input = com.amazonaws.services.servicediscovery.model.GetNamespaceRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.getNamespace(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery get-namespace")
				.argument("id", id)
	}

}


fun AWSServiceDiscoveryFunctions.getOperation(operationId: String, init: AWSServiceDiscoveryGetOperationCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryGetOperationCommand(operationId).apply(init))
}

@Generated
class AWSServiceDiscoveryGetOperationCommand(val operationId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.GetOperationRequest> {



	override fun build(): com.amazonaws.services.servicediscovery.model.GetOperationRequest {
		val input = com.amazonaws.services.servicediscovery.model.GetOperationRequest()
		input.setOperationId(this.operationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.getOperation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery get-operation")
				.argument("operation-id", operationId)
	}

}


fun AWSServiceDiscoveryFunctions.getService(id: String, init: AWSServiceDiscoveryGetServiceCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryGetServiceCommand(id).apply(init))
}

@Generated
class AWSServiceDiscoveryGetServiceCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.GetServiceRequest> {



	override fun build(): com.amazonaws.services.servicediscovery.model.GetServiceRequest {
		val input = com.amazonaws.services.servicediscovery.model.GetServiceRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.getService(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery get-service")
				.argument("id", id)
	}

}


fun AWSServiceDiscoveryFunctions.listInstances(serviceId: String, init: AWSServiceDiscoveryListInstancesCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryListInstancesCommand(serviceId).apply(init))
}

@Generated
class AWSServiceDiscoveryListInstancesCommand(val serviceId: String) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.ListInstancesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.servicediscovery.model.ListInstancesRequest {
		val input = com.amazonaws.services.servicediscovery.model.ListInstancesRequest()
		input.setServiceId(this.serviceId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.listInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery list-instances")
				.argument("service-id", serviceId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSServiceDiscoveryFunctions.listNamespaces(init: AWSServiceDiscoveryListNamespacesCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryListNamespacesCommand().apply(init))
}

@Generated
class AWSServiceDiscoveryListNamespacesCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.ListNamespacesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.listNamespaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery list-namespaces")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
	}

}


fun AWSServiceDiscoveryFunctions.listOperations(init: AWSServiceDiscoveryListOperationsCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryListOperationsCommand().apply(init))
}

@Generated
class AWSServiceDiscoveryListOperationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.ListOperationsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.listOperations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery list-operations")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
	}

}


fun AWSServiceDiscoveryFunctions.listServices(init: AWSServiceDiscoveryListServicesCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryListServicesCommand().apply(init))
}

@Generated
class AWSServiceDiscoveryListServicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.ListServicesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.listServices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery list-services")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
	}

}


fun AWSServiceDiscoveryFunctions.registerInstance(serviceId: String, instanceId: String, attributes: Map<String, String>, init: AWSServiceDiscoveryRegisterInstanceCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryRegisterInstanceCommand(serviceId, instanceId, attributes).apply(init))
}

@Generated
class AWSServiceDiscoveryRegisterInstanceCommand(val serviceId: String, val instanceId: String, val attributes: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.RegisterInstanceRequest> {

	var creatorRequestId: String? = null

	override fun build(): com.amazonaws.services.servicediscovery.model.RegisterInstanceRequest {
		val input = com.amazonaws.services.servicediscovery.model.RegisterInstanceRequest()
		input.setServiceId(this.serviceId)
		input.setInstanceId(this.instanceId)
		input.setCreatorRequestId(this.creatorRequestId)
		input.setAttributes(this.attributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.registerInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery register-instance")
				.argument("service-id", serviceId)
				.argument("instance-id", instanceId)
				.argument("creator-request-id", creatorRequestId)
				.argument("attributes", attributes.toString())
	}

}


fun AWSServiceDiscoveryFunctions.updateInstanceCustomHealthStatus(serviceId: String, instanceId: String, status: CustomHealthStatus, init: AWSServiceDiscoveryUpdateInstanceCustomHealthStatusCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryUpdateInstanceCustomHealthStatusCommand(serviceId, instanceId, status).apply(init))
}

@Generated
class AWSServiceDiscoveryUpdateInstanceCustomHealthStatusCommand(val serviceId: String, val instanceId: String, val status: CustomHealthStatus) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusRequest> {



	override fun build(): com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusRequest {
		val input = com.amazonaws.services.servicediscovery.model.UpdateInstanceCustomHealthStatusRequest()
		input.setServiceId(this.serviceId)
		input.setInstanceId(this.instanceId)
		input.setStatus(this.status.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.updateInstanceCustomHealthStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery update-instance-custom-health-status")
				.argument("service-id", serviceId)
				.argument("instance-id", instanceId)
				.argument("status", status.toString())
	}

}


fun AWSServiceDiscoveryFunctions.updateService(id: String, service: com.amazonaws.services.servicediscovery.model.ServiceChange, init: AWSServiceDiscoveryUpdateServiceCommand.() -> Unit) {
	this.block.declare(AWSServiceDiscoveryUpdateServiceCommand(id, service).apply(init))
}

@Generated
class AWSServiceDiscoveryUpdateServiceCommand(val id: String, val service: com.amazonaws.services.servicediscovery.model.ServiceChange) : AmazonWebServiceCommand<com.amazonaws.services.servicediscovery.model.UpdateServiceRequest> {



	override fun build(): com.amazonaws.services.servicediscovery.model.UpdateServiceRequest {
		val input = com.amazonaws.services.servicediscovery.model.UpdateServiceRequest()
		input.setId(this.id)
		input.setService(this.service)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.servicediscovery.updateService(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws servicediscovery update-service")
				.argument("id", id)
				.argument("service", service.toString())
	}

}
