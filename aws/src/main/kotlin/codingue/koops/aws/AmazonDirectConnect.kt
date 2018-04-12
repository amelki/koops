
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.directconnect.*
import com.amazonaws.services.directconnect.model.*

var codingue.koops.core.Environment.directconnect: AmazonDirectConnect
	get() {
		var service = this.capabilities["aws-directconnect"]
		if (service == null) {
			service = AmazonDirectConnectClientBuilder.standard().build()
			this.capabilities["aws-directconnect"] = service
		}
		return service as AmazonDirectConnect
	}
	set(directconnect) {
		this.capabilities["aws-directconnect"] = directconnect
	}

@Generated
class AmazonDirectConnectFunctions(val block: Block)

infix fun <T> AwsContinuation.directconnect(init: AmazonDirectConnectFunctions.() -> T): T {
	return AmazonDirectConnectFunctions(shell).run(init)
}

			

fun AmazonDirectConnectFunctions.allocateConnectionOnInterconnect(init: AmazonDirectConnectAllocateConnectionOnInterconnectCommand.() -> Unit): com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectResult {
	return this.block.declare(AmazonDirectConnectAllocateConnectionOnInterconnectCommand().apply(init)) as com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectResult
}

@Generated
class AmazonDirectConnectAllocateConnectionOnInterconnectCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectRequest, com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectResult> {

	var bandwidth: String? = null
	var connectionName: String? = null
	var ownerAccount: String? = null
	var interconnectId: String? = null
	var vlan: Int? = 0

	override fun build(): com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectRequest {
		val input = com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectRequest()
		input.setBandwidth(this.bandwidth)
		input.setConnectionName(this.connectionName)
		input.setOwnerAccount(this.ownerAccount)
		input.setInterconnectId(this.interconnectId)
		input.setVlan(this.vlan)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectResult {
	  return com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectResult {
		return environment.directconnect.allocateConnectionOnInterconnect(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect allocate-connection-on-interconnect")
				.argument("bandwidth", bandwidth)
				.argument("connection-name", connectionName)
				.argument("owner-account", ownerAccount)
				.argument("interconnect-id", interconnectId)
				.argument("vlan", vlan?.toString())
	}

}


fun AmazonDirectConnectFunctions.allocateHostedConnection(init: AmazonDirectConnectAllocateHostedConnectionCommand.() -> Unit): com.amazonaws.services.directconnect.model.AllocateHostedConnectionResult {
	return this.block.declare(AmazonDirectConnectAllocateHostedConnectionCommand().apply(init)) as com.amazonaws.services.directconnect.model.AllocateHostedConnectionResult
}

@Generated
class AmazonDirectConnectAllocateHostedConnectionCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.AllocateHostedConnectionRequest, com.amazonaws.services.directconnect.model.AllocateHostedConnectionResult> {

	var connectionId: String? = null
	var ownerAccount: String? = null
	var bandwidth: String? = null
	var connectionName: String? = null
	var vlan: Int? = 0

	override fun build(): com.amazonaws.services.directconnect.model.AllocateHostedConnectionRequest {
		val input = com.amazonaws.services.directconnect.model.AllocateHostedConnectionRequest()
		input.setConnectionId(this.connectionId)
		input.setOwnerAccount(this.ownerAccount)
		input.setBandwidth(this.bandwidth)
		input.setConnectionName(this.connectionName)
		input.setVlan(this.vlan)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.AllocateHostedConnectionResult {
	  return com.amazonaws.services.directconnect.model.AllocateHostedConnectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.AllocateHostedConnectionResult {
		return environment.directconnect.allocateHostedConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect allocate-hosted-connection")
				.argument("connection-id", connectionId)
				.argument("owner-account", ownerAccount)
				.argument("bandwidth", bandwidth)
				.argument("connection-name", connectionName)
				.argument("vlan", vlan?.toString())
	}

}


fun AmazonDirectConnectFunctions.allocatePrivateVirtualInterface(init: AmazonDirectConnectAllocatePrivateVirtualInterfaceCommand.() -> Unit): com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceResult {
	return this.block.declare(AmazonDirectConnectAllocatePrivateVirtualInterfaceCommand().apply(init)) as com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceResult
}

@Generated
class AmazonDirectConnectAllocatePrivateVirtualInterfaceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceRequest, com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceResult> {

	var connectionId: String? = null
	var ownerAccount: String? = null
	var newPrivateVirtualInterfaceAllocation: com.amazonaws.services.directconnect.model.NewPrivateVirtualInterfaceAllocation? = null

	override fun build(): com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceRequest {
		val input = com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceRequest()
		input.setConnectionId(this.connectionId)
		input.setOwnerAccount(this.ownerAccount)
		input.setNewPrivateVirtualInterfaceAllocation(this.newPrivateVirtualInterfaceAllocation)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceResult {
	  return com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceResult {
		return environment.directconnect.allocatePrivateVirtualInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect allocate-private-virtual-interface")
				.argument("connection-id", connectionId)
				.argument("owner-account", ownerAccount)
				.argument("new-private-virtual-interface-allocation", newPrivateVirtualInterfaceAllocation?.toString())
	}

}


fun AmazonDirectConnectFunctions.allocatePublicVirtualInterface(init: AmazonDirectConnectAllocatePublicVirtualInterfaceCommand.() -> Unit): com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceResult {
	return this.block.declare(AmazonDirectConnectAllocatePublicVirtualInterfaceCommand().apply(init)) as com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceResult
}

@Generated
class AmazonDirectConnectAllocatePublicVirtualInterfaceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceRequest, com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceResult> {

	var connectionId: String? = null
	var ownerAccount: String? = null
	var newPublicVirtualInterfaceAllocation: com.amazonaws.services.directconnect.model.NewPublicVirtualInterfaceAllocation? = null

	override fun build(): com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceRequest {
		val input = com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceRequest()
		input.setConnectionId(this.connectionId)
		input.setOwnerAccount(this.ownerAccount)
		input.setNewPublicVirtualInterfaceAllocation(this.newPublicVirtualInterfaceAllocation)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceResult {
	  return com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceResult {
		return environment.directconnect.allocatePublicVirtualInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect allocate-public-virtual-interface")
				.argument("connection-id", connectionId)
				.argument("owner-account", ownerAccount)
				.argument("new-public-virtual-interface-allocation", newPublicVirtualInterfaceAllocation?.toString())
	}

}


fun AmazonDirectConnectFunctions.associateConnectionWithLag(init: AmazonDirectConnectAssociateConnectionWithLagCommand.() -> Unit): com.amazonaws.services.directconnect.model.AssociateConnectionWithLagResult {
	return this.block.declare(AmazonDirectConnectAssociateConnectionWithLagCommand().apply(init)) as com.amazonaws.services.directconnect.model.AssociateConnectionWithLagResult
}

@Generated
class AmazonDirectConnectAssociateConnectionWithLagCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.AssociateConnectionWithLagRequest, com.amazonaws.services.directconnect.model.AssociateConnectionWithLagResult> {

	var connectionId: String? = null
	var lagId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.AssociateConnectionWithLagRequest {
		val input = com.amazonaws.services.directconnect.model.AssociateConnectionWithLagRequest()
		input.setConnectionId(this.connectionId)
		input.setLagId(this.lagId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.AssociateConnectionWithLagResult {
	  return com.amazonaws.services.directconnect.model.AssociateConnectionWithLagResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.AssociateConnectionWithLagResult {
		return environment.directconnect.associateConnectionWithLag(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect associate-connection-with-lag")
				.argument("connection-id", connectionId)
				.argument("lag-id", lagId)
	}

}


fun AmazonDirectConnectFunctions.associateHostedConnection(init: AmazonDirectConnectAssociateHostedConnectionCommand.() -> Unit): com.amazonaws.services.directconnect.model.AssociateHostedConnectionResult {
	return this.block.declare(AmazonDirectConnectAssociateHostedConnectionCommand().apply(init)) as com.amazonaws.services.directconnect.model.AssociateHostedConnectionResult
}

@Generated
class AmazonDirectConnectAssociateHostedConnectionCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.AssociateHostedConnectionRequest, com.amazonaws.services.directconnect.model.AssociateHostedConnectionResult> {

	var connectionId: String? = null
	var parentConnectionId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.AssociateHostedConnectionRequest {
		val input = com.amazonaws.services.directconnect.model.AssociateHostedConnectionRequest()
		input.setConnectionId(this.connectionId)
		input.setParentConnectionId(this.parentConnectionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.AssociateHostedConnectionResult {
	  return com.amazonaws.services.directconnect.model.AssociateHostedConnectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.AssociateHostedConnectionResult {
		return environment.directconnect.associateHostedConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect associate-hosted-connection")
				.argument("connection-id", connectionId)
				.argument("parent-connection-id", parentConnectionId)
	}

}


fun AmazonDirectConnectFunctions.associateVirtualInterface(init: AmazonDirectConnectAssociateVirtualInterfaceCommand.() -> Unit): com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceResult {
	return this.block.declare(AmazonDirectConnectAssociateVirtualInterfaceCommand().apply(init)) as com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceResult
}

@Generated
class AmazonDirectConnectAssociateVirtualInterfaceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceRequest, com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceResult> {

	var virtualInterfaceId: String? = null
	var connectionId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceRequest {
		val input = com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceRequest()
		input.setVirtualInterfaceId(this.virtualInterfaceId)
		input.setConnectionId(this.connectionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceResult {
	  return com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceResult {
		return environment.directconnect.associateVirtualInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect associate-virtual-interface")
				.argument("virtual-interface-id", virtualInterfaceId)
				.argument("connection-id", connectionId)
	}

}


fun AmazonDirectConnectFunctions.confirmConnection(init: AmazonDirectConnectConfirmConnectionCommand.() -> Unit): com.amazonaws.services.directconnect.model.ConfirmConnectionResult {
	return this.block.declare(AmazonDirectConnectConfirmConnectionCommand().apply(init)) as com.amazonaws.services.directconnect.model.ConfirmConnectionResult
}

@Generated
class AmazonDirectConnectConfirmConnectionCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.ConfirmConnectionRequest, com.amazonaws.services.directconnect.model.ConfirmConnectionResult> {

	var connectionId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.ConfirmConnectionRequest {
		val input = com.amazonaws.services.directconnect.model.ConfirmConnectionRequest()
		input.setConnectionId(this.connectionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.ConfirmConnectionResult {
	  return com.amazonaws.services.directconnect.model.ConfirmConnectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.ConfirmConnectionResult {
		return environment.directconnect.confirmConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect confirm-connection")
				.argument("connection-id", connectionId)
	}

}


fun AmazonDirectConnectFunctions.confirmPrivateVirtualInterface(init: AmazonDirectConnectConfirmPrivateVirtualInterfaceCommand.() -> Unit): com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceResult {
	return this.block.declare(AmazonDirectConnectConfirmPrivateVirtualInterfaceCommand().apply(init)) as com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceResult
}

@Generated
class AmazonDirectConnectConfirmPrivateVirtualInterfaceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceRequest, com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceResult> {

	var virtualInterfaceId: String? = null
	var virtualGatewayId: String? = null
	var directConnectGatewayId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceRequest {
		val input = com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceRequest()
		input.setVirtualInterfaceId(this.virtualInterfaceId)
		input.setVirtualGatewayId(this.virtualGatewayId)
		input.setDirectConnectGatewayId(this.directConnectGatewayId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceResult {
	  return com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceResult {
		return environment.directconnect.confirmPrivateVirtualInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect confirm-private-virtual-interface")
				.argument("virtual-interface-id", virtualInterfaceId)
				.argument("virtual-gateway-id", virtualGatewayId)
				.argument("direct-connect-gateway-id", directConnectGatewayId)
	}

}


fun AmazonDirectConnectFunctions.confirmPublicVirtualInterface(init: AmazonDirectConnectConfirmPublicVirtualInterfaceCommand.() -> Unit): com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceResult {
	return this.block.declare(AmazonDirectConnectConfirmPublicVirtualInterfaceCommand().apply(init)) as com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceResult
}

@Generated
class AmazonDirectConnectConfirmPublicVirtualInterfaceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceRequest, com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceResult> {

	var virtualInterfaceId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceRequest {
		val input = com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceRequest()
		input.setVirtualInterfaceId(this.virtualInterfaceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceResult {
	  return com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceResult {
		return environment.directconnect.confirmPublicVirtualInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect confirm-public-virtual-interface")
				.argument("virtual-interface-id", virtualInterfaceId)
	}

}


fun AmazonDirectConnectFunctions.createBGPPeer(init: AmazonDirectConnectCreateBGPPeerCommand.() -> Unit): com.amazonaws.services.directconnect.model.CreateBGPPeerResult {
	return this.block.declare(AmazonDirectConnectCreateBGPPeerCommand().apply(init)) as com.amazonaws.services.directconnect.model.CreateBGPPeerResult
}

@Generated
class AmazonDirectConnectCreateBGPPeerCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.CreateBGPPeerRequest, com.amazonaws.services.directconnect.model.CreateBGPPeerResult> {

	var virtualInterfaceId: String? = null
	var newBGPPeer: com.amazonaws.services.directconnect.model.NewBGPPeer? = null

	override fun build(): com.amazonaws.services.directconnect.model.CreateBGPPeerRequest {
		val input = com.amazonaws.services.directconnect.model.CreateBGPPeerRequest()
		input.setVirtualInterfaceId(this.virtualInterfaceId)
		input.setNewBGPPeer(this.newBGPPeer)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.CreateBGPPeerResult {
	  return com.amazonaws.services.directconnect.model.CreateBGPPeerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.CreateBGPPeerResult {
		return environment.directconnect.createBGPPeer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect create-bgppeer")
				.argument("virtual-interface-id", virtualInterfaceId)
				.argument("new-bgppeer", newBGPPeer?.toString())
	}

}


fun AmazonDirectConnectFunctions.createConnection(init: AmazonDirectConnectCreateConnectionCommand.() -> Unit): com.amazonaws.services.directconnect.model.CreateConnectionResult {
	return this.block.declare(AmazonDirectConnectCreateConnectionCommand().apply(init)) as com.amazonaws.services.directconnect.model.CreateConnectionResult
}

@Generated
class AmazonDirectConnectCreateConnectionCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.CreateConnectionRequest, com.amazonaws.services.directconnect.model.CreateConnectionResult> {

	var location: String? = null
	var bandwidth: String? = null
	var connectionName: String? = null
	var lagId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.CreateConnectionRequest {
		val input = com.amazonaws.services.directconnect.model.CreateConnectionRequest()
		input.setLocation(this.location)
		input.setBandwidth(this.bandwidth)
		input.setConnectionName(this.connectionName)
		input.setLagId(this.lagId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.CreateConnectionResult {
	  return com.amazonaws.services.directconnect.model.CreateConnectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.CreateConnectionResult {
		return environment.directconnect.createConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect create-connection")
				.argument("location", location)
				.argument("bandwidth", bandwidth)
				.argument("connection-name", connectionName)
				.argument("lag-id", lagId)
	}

}


fun AmazonDirectConnectFunctions.createDirectConnectGateway(init: AmazonDirectConnectCreateDirectConnectGatewayCommand.() -> Unit): com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayResult {
	return this.block.declare(AmazonDirectConnectCreateDirectConnectGatewayCommand().apply(init)) as com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayResult
}

@Generated
class AmazonDirectConnectCreateDirectConnectGatewayCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayRequest, com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayResult> {

	var directConnectGatewayName: String? = null
	var amazonSideAsn: Long? = 0L

	override fun build(): com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayRequest {
		val input = com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayRequest()
		input.setDirectConnectGatewayName(this.directConnectGatewayName)
		input.setAmazonSideAsn(this.amazonSideAsn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayResult {
	  return com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayResult {
		return environment.directconnect.createDirectConnectGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect create-direct-connect-gateway")
				.argument("direct-connect-gateway-name", directConnectGatewayName)
				.argument("amazon-side-asn", amazonSideAsn?.toString())
	}

}


fun AmazonDirectConnectFunctions.createDirectConnectGatewayAssociation(init: AmazonDirectConnectCreateDirectConnectGatewayAssociationCommand.() -> Unit): com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationResult {
	return this.block.declare(AmazonDirectConnectCreateDirectConnectGatewayAssociationCommand().apply(init)) as com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationResult
}

@Generated
class AmazonDirectConnectCreateDirectConnectGatewayAssociationCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationRequest, com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationResult> {

	var directConnectGatewayId: String? = null
	var virtualGatewayId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationRequest {
		val input = com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationRequest()
		input.setDirectConnectGatewayId(this.directConnectGatewayId)
		input.setVirtualGatewayId(this.virtualGatewayId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationResult {
	  return com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationResult {
		return environment.directconnect.createDirectConnectGatewayAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect create-direct-connect-gateway-association")
				.argument("direct-connect-gateway-id", directConnectGatewayId)
				.argument("virtual-gateway-id", virtualGatewayId)
	}

}


fun AmazonDirectConnectFunctions.createInterconnect(init: AmazonDirectConnectCreateInterconnectCommand.() -> Unit): com.amazonaws.services.directconnect.model.CreateInterconnectResult {
	return this.block.declare(AmazonDirectConnectCreateInterconnectCommand().apply(init)) as com.amazonaws.services.directconnect.model.CreateInterconnectResult
}

@Generated
class AmazonDirectConnectCreateInterconnectCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.CreateInterconnectRequest, com.amazonaws.services.directconnect.model.CreateInterconnectResult> {

	var interconnectName: String? = null
	var bandwidth: String? = null
	var location: String? = null
	var lagId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.CreateInterconnectRequest {
		val input = com.amazonaws.services.directconnect.model.CreateInterconnectRequest()
		input.setInterconnectName(this.interconnectName)
		input.setBandwidth(this.bandwidth)
		input.setLocation(this.location)
		input.setLagId(this.lagId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.CreateInterconnectResult {
	  return com.amazonaws.services.directconnect.model.CreateInterconnectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.CreateInterconnectResult {
		return environment.directconnect.createInterconnect(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect create-interconnect")
				.argument("interconnect-name", interconnectName)
				.argument("bandwidth", bandwidth)
				.argument("location", location)
				.argument("lag-id", lagId)
	}

}


fun AmazonDirectConnectFunctions.createLag(init: AmazonDirectConnectCreateLagCommand.() -> Unit): com.amazonaws.services.directconnect.model.CreateLagResult {
	return this.block.declare(AmazonDirectConnectCreateLagCommand().apply(init)) as com.amazonaws.services.directconnect.model.CreateLagResult
}

@Generated
class AmazonDirectConnectCreateLagCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.CreateLagRequest, com.amazonaws.services.directconnect.model.CreateLagResult> {

	var numberOfConnections: Int? = 0
	var location: String? = null
	var connectionsBandwidth: String? = null
	var lagName: String? = null
	var connectionId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.CreateLagRequest {
		val input = com.amazonaws.services.directconnect.model.CreateLagRequest()
		input.setNumberOfConnections(this.numberOfConnections)
		input.setLocation(this.location)
		input.setConnectionsBandwidth(this.connectionsBandwidth)
		input.setLagName(this.lagName)
		input.setConnectionId(this.connectionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.CreateLagResult {
	  return com.amazonaws.services.directconnect.model.CreateLagResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.CreateLagResult {
		return environment.directconnect.createLag(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect create-lag")
				.argument("number-of-connections", numberOfConnections?.toString())
				.argument("location", location)
				.argument("connections-bandwidth", connectionsBandwidth)
				.argument("lag-name", lagName)
				.argument("connection-id", connectionId)
	}

}


fun AmazonDirectConnectFunctions.createPrivateVirtualInterface(init: AmazonDirectConnectCreatePrivateVirtualInterfaceCommand.() -> Unit): com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceResult {
	return this.block.declare(AmazonDirectConnectCreatePrivateVirtualInterfaceCommand().apply(init)) as com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceResult
}

@Generated
class AmazonDirectConnectCreatePrivateVirtualInterfaceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceRequest, com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceResult> {

	var connectionId: String? = null
	var newPrivateVirtualInterface: com.amazonaws.services.directconnect.model.NewPrivateVirtualInterface? = null

	override fun build(): com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceRequest {
		val input = com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceRequest()
		input.setConnectionId(this.connectionId)
		input.setNewPrivateVirtualInterface(this.newPrivateVirtualInterface)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceResult {
	  return com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceResult {
		return environment.directconnect.createPrivateVirtualInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect create-private-virtual-interface")
				.argument("connection-id", connectionId)
				.argument("new-private-virtual-interface", newPrivateVirtualInterface?.toString())
	}

}


fun AmazonDirectConnectFunctions.createPublicVirtualInterface(init: AmazonDirectConnectCreatePublicVirtualInterfaceCommand.() -> Unit): com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceResult {
	return this.block.declare(AmazonDirectConnectCreatePublicVirtualInterfaceCommand().apply(init)) as com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceResult
}

@Generated
class AmazonDirectConnectCreatePublicVirtualInterfaceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceRequest, com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceResult> {

	var connectionId: String? = null
	var newPublicVirtualInterface: com.amazonaws.services.directconnect.model.NewPublicVirtualInterface? = null

	override fun build(): com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceRequest {
		val input = com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceRequest()
		input.setConnectionId(this.connectionId)
		input.setNewPublicVirtualInterface(this.newPublicVirtualInterface)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceResult {
	  return com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceResult {
		return environment.directconnect.createPublicVirtualInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect create-public-virtual-interface")
				.argument("connection-id", connectionId)
				.argument("new-public-virtual-interface", newPublicVirtualInterface?.toString())
	}

}


fun AmazonDirectConnectFunctions.deleteBGPPeer(init: AmazonDirectConnectDeleteBGPPeerCommand.() -> Unit): com.amazonaws.services.directconnect.model.DeleteBGPPeerResult {
	return this.block.declare(AmazonDirectConnectDeleteBGPPeerCommand().apply(init)) as com.amazonaws.services.directconnect.model.DeleteBGPPeerResult
}

@Generated
class AmazonDirectConnectDeleteBGPPeerCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DeleteBGPPeerRequest, com.amazonaws.services.directconnect.model.DeleteBGPPeerResult> {

	var virtualInterfaceId: String? = null
	var asn: Int? = 0
	var customerAddress: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DeleteBGPPeerRequest {
		val input = com.amazonaws.services.directconnect.model.DeleteBGPPeerRequest()
		input.setVirtualInterfaceId(this.virtualInterfaceId)
		input.setAsn(this.asn)
		input.setCustomerAddress(this.customerAddress)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DeleteBGPPeerResult {
	  return com.amazonaws.services.directconnect.model.DeleteBGPPeerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DeleteBGPPeerResult {
		return environment.directconnect.deleteBGPPeer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect delete-bgppeer")
				.argument("virtual-interface-id", virtualInterfaceId)
				.argument("asn", asn?.toString())
				.argument("customer-address", customerAddress)
	}

}


fun AmazonDirectConnectFunctions.deleteConnection(init: AmazonDirectConnectDeleteConnectionCommand.() -> Unit): com.amazonaws.services.directconnect.model.DeleteConnectionResult {
	return this.block.declare(AmazonDirectConnectDeleteConnectionCommand().apply(init)) as com.amazonaws.services.directconnect.model.DeleteConnectionResult
}

@Generated
class AmazonDirectConnectDeleteConnectionCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DeleteConnectionRequest, com.amazonaws.services.directconnect.model.DeleteConnectionResult> {

	var connectionId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DeleteConnectionRequest {
		val input = com.amazonaws.services.directconnect.model.DeleteConnectionRequest()
		input.setConnectionId(this.connectionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DeleteConnectionResult {
	  return com.amazonaws.services.directconnect.model.DeleteConnectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DeleteConnectionResult {
		return environment.directconnect.deleteConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect delete-connection")
				.argument("connection-id", connectionId)
	}

}


fun AmazonDirectConnectFunctions.deleteDirectConnectGateway(init: AmazonDirectConnectDeleteDirectConnectGatewayCommand.() -> Unit): com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayResult {
	return this.block.declare(AmazonDirectConnectDeleteDirectConnectGatewayCommand().apply(init)) as com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayResult
}

@Generated
class AmazonDirectConnectDeleteDirectConnectGatewayCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayRequest, com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayResult> {

	var directConnectGatewayId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayRequest {
		val input = com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayRequest()
		input.setDirectConnectGatewayId(this.directConnectGatewayId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayResult {
	  return com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayResult {
		return environment.directconnect.deleteDirectConnectGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect delete-direct-connect-gateway")
				.argument("direct-connect-gateway-id", directConnectGatewayId)
	}

}


fun AmazonDirectConnectFunctions.deleteDirectConnectGatewayAssociation(init: AmazonDirectConnectDeleteDirectConnectGatewayAssociationCommand.() -> Unit): com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationResult {
	return this.block.declare(AmazonDirectConnectDeleteDirectConnectGatewayAssociationCommand().apply(init)) as com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationResult
}

@Generated
class AmazonDirectConnectDeleteDirectConnectGatewayAssociationCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationRequest, com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationResult> {

	var directConnectGatewayId: String? = null
	var virtualGatewayId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationRequest {
		val input = com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationRequest()
		input.setDirectConnectGatewayId(this.directConnectGatewayId)
		input.setVirtualGatewayId(this.virtualGatewayId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationResult {
	  return com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationResult {
		return environment.directconnect.deleteDirectConnectGatewayAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect delete-direct-connect-gateway-association")
				.argument("direct-connect-gateway-id", directConnectGatewayId)
				.argument("virtual-gateway-id", virtualGatewayId)
	}

}


fun AmazonDirectConnectFunctions.deleteInterconnect(init: AmazonDirectConnectDeleteInterconnectCommand.() -> Unit): com.amazonaws.services.directconnect.model.DeleteInterconnectResult {
	return this.block.declare(AmazonDirectConnectDeleteInterconnectCommand().apply(init)) as com.amazonaws.services.directconnect.model.DeleteInterconnectResult
}

@Generated
class AmazonDirectConnectDeleteInterconnectCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DeleteInterconnectRequest, com.amazonaws.services.directconnect.model.DeleteInterconnectResult> {

	var interconnectId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DeleteInterconnectRequest {
		val input = com.amazonaws.services.directconnect.model.DeleteInterconnectRequest()
		input.setInterconnectId(this.interconnectId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DeleteInterconnectResult {
	  return com.amazonaws.services.directconnect.model.DeleteInterconnectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DeleteInterconnectResult {
		return environment.directconnect.deleteInterconnect(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect delete-interconnect")
				.argument("interconnect-id", interconnectId)
	}

}


fun AmazonDirectConnectFunctions.deleteLag(init: AmazonDirectConnectDeleteLagCommand.() -> Unit): com.amazonaws.services.directconnect.model.DeleteLagResult {
	return this.block.declare(AmazonDirectConnectDeleteLagCommand().apply(init)) as com.amazonaws.services.directconnect.model.DeleteLagResult
}

@Generated
class AmazonDirectConnectDeleteLagCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DeleteLagRequest, com.amazonaws.services.directconnect.model.DeleteLagResult> {

	var lagId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DeleteLagRequest {
		val input = com.amazonaws.services.directconnect.model.DeleteLagRequest()
		input.setLagId(this.lagId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DeleteLagResult {
	  return com.amazonaws.services.directconnect.model.DeleteLagResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DeleteLagResult {
		return environment.directconnect.deleteLag(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect delete-lag")
				.argument("lag-id", lagId)
	}

}


fun AmazonDirectConnectFunctions.deleteVirtualInterface(init: AmazonDirectConnectDeleteVirtualInterfaceCommand.() -> Unit): com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceResult {
	return this.block.declare(AmazonDirectConnectDeleteVirtualInterfaceCommand().apply(init)) as com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceResult
}

@Generated
class AmazonDirectConnectDeleteVirtualInterfaceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceRequest, com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceResult> {

	var virtualInterfaceId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceRequest {
		val input = com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceRequest()
		input.setVirtualInterfaceId(this.virtualInterfaceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceResult {
	  return com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceResult {
		return environment.directconnect.deleteVirtualInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect delete-virtual-interface")
				.argument("virtual-interface-id", virtualInterfaceId)
	}

}


fun AmazonDirectConnectFunctions.describeConnectionLoa(init: AmazonDirectConnectDescribeConnectionLoaCommand.() -> Unit): com.amazonaws.services.directconnect.model.DescribeConnectionLoaResult {
	return this.block.declare(AmazonDirectConnectDescribeConnectionLoaCommand().apply(init)) as com.amazonaws.services.directconnect.model.DescribeConnectionLoaResult
}

@Generated
class AmazonDirectConnectDescribeConnectionLoaCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeConnectionLoaRequest, com.amazonaws.services.directconnect.model.DescribeConnectionLoaResult> {

	var connectionId: String? = null
	var providerName: String? = null
	var loaContentType: LoaContentType? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeConnectionLoaRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeConnectionLoaRequest()
		input.setConnectionId(this.connectionId)
		input.setProviderName(this.providerName)
		input.setLoaContentType(this.loaContentType?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DescribeConnectionLoaResult {
	  return com.amazonaws.services.directconnect.model.DescribeConnectionLoaResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DescribeConnectionLoaResult {
		return environment.directconnect.describeConnectionLoa(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-connection-loa")
				.argument("connection-id", connectionId)
				.argument("provider-name", providerName)
				.argument("loa-content-type", loaContentType?.toString())
	}

}


fun AmazonDirectConnectFunctions.describeConnections(init: AmazonDirectConnectDescribeConnectionsCommand.() -> Unit): com.amazonaws.services.directconnect.model.DescribeConnectionsResult {
	return this.block.declare(AmazonDirectConnectDescribeConnectionsCommand().apply(init)) as com.amazonaws.services.directconnect.model.DescribeConnectionsResult
}

@Generated
class AmazonDirectConnectDescribeConnectionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeConnectionsRequest, com.amazonaws.services.directconnect.model.DescribeConnectionsResult> {

	var connectionId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeConnectionsRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeConnectionsRequest()
		input.setConnectionId(this.connectionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DescribeConnectionsResult {
	  return com.amazonaws.services.directconnect.model.DescribeConnectionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DescribeConnectionsResult {
		return environment.directconnect.describeConnections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-connections")
				.argument("connection-id", connectionId)
	}

}


fun AmazonDirectConnectFunctions.describeConnectionsOnInterconnect(init: AmazonDirectConnectDescribeConnectionsOnInterconnectCommand.() -> Unit): com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectResult {
	return this.block.declare(AmazonDirectConnectDescribeConnectionsOnInterconnectCommand().apply(init)) as com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectResult
}

@Generated
class AmazonDirectConnectDescribeConnectionsOnInterconnectCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectRequest, com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectResult> {

	var interconnectId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectRequest()
		input.setInterconnectId(this.interconnectId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectResult {
	  return com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectResult {
		return environment.directconnect.describeConnectionsOnInterconnect(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-connections-on-interconnect")
				.argument("interconnect-id", interconnectId)
	}

}


fun AmazonDirectConnectFunctions.describeDirectConnectGatewayAssociations(init: AmazonDirectConnectDescribeDirectConnectGatewayAssociationsCommand.() -> Unit): com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsResult {
	return this.block.declare(AmazonDirectConnectDescribeDirectConnectGatewayAssociationsCommand().apply(init)) as com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsResult
}

@Generated
class AmazonDirectConnectDescribeDirectConnectGatewayAssociationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsRequest, com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsResult> {

	var directConnectGatewayId: String? = null
	var virtualGatewayId: String? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsRequest()
		input.setDirectConnectGatewayId(this.directConnectGatewayId)
		input.setVirtualGatewayId(this.virtualGatewayId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsResult {
	  return com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsResult {
		return environment.directconnect.describeDirectConnectGatewayAssociations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-direct-connect-gateway-associations")
				.argument("direct-connect-gateway-id", directConnectGatewayId)
				.argument("virtual-gateway-id", virtualGatewayId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDirectConnectFunctions.describeDirectConnectGatewayAttachments(init: AmazonDirectConnectDescribeDirectConnectGatewayAttachmentsCommand.() -> Unit): com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsResult {
	return this.block.declare(AmazonDirectConnectDescribeDirectConnectGatewayAttachmentsCommand().apply(init)) as com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsResult
}

@Generated
class AmazonDirectConnectDescribeDirectConnectGatewayAttachmentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsRequest, com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsResult> {

	var directConnectGatewayId: String? = null
	var virtualInterfaceId: String? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsRequest()
		input.setDirectConnectGatewayId(this.directConnectGatewayId)
		input.setVirtualInterfaceId(this.virtualInterfaceId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsResult {
	  return com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsResult {
		return environment.directconnect.describeDirectConnectGatewayAttachments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-direct-connect-gateway-attachments")
				.argument("direct-connect-gateway-id", directConnectGatewayId)
				.argument("virtual-interface-id", virtualInterfaceId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDirectConnectFunctions.describeDirectConnectGateways(init: AmazonDirectConnectDescribeDirectConnectGatewaysCommand.() -> Unit): com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysResult {
	return this.block.declare(AmazonDirectConnectDescribeDirectConnectGatewaysCommand().apply(init)) as com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysResult
}

@Generated
class AmazonDirectConnectDescribeDirectConnectGatewaysCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysRequest, com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysResult> {

	var directConnectGatewayId: String? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysRequest()
		input.setDirectConnectGatewayId(this.directConnectGatewayId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysResult {
	  return com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysResult {
		return environment.directconnect.describeDirectConnectGateways(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-direct-connect-gateways")
				.argument("direct-connect-gateway-id", directConnectGatewayId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDirectConnectFunctions.describeHostedConnections(init: AmazonDirectConnectDescribeHostedConnectionsCommand.() -> Unit): com.amazonaws.services.directconnect.model.DescribeHostedConnectionsResult {
	return this.block.declare(AmazonDirectConnectDescribeHostedConnectionsCommand().apply(init)) as com.amazonaws.services.directconnect.model.DescribeHostedConnectionsResult
}

@Generated
class AmazonDirectConnectDescribeHostedConnectionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeHostedConnectionsRequest, com.amazonaws.services.directconnect.model.DescribeHostedConnectionsResult> {

	var connectionId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeHostedConnectionsRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeHostedConnectionsRequest()
		input.setConnectionId(this.connectionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DescribeHostedConnectionsResult {
	  return com.amazonaws.services.directconnect.model.DescribeHostedConnectionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DescribeHostedConnectionsResult {
		return environment.directconnect.describeHostedConnections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-hosted-connections")
				.argument("connection-id", connectionId)
	}

}


fun AmazonDirectConnectFunctions.describeInterconnectLoa(init: AmazonDirectConnectDescribeInterconnectLoaCommand.() -> Unit): com.amazonaws.services.directconnect.model.DescribeInterconnectLoaResult {
	return this.block.declare(AmazonDirectConnectDescribeInterconnectLoaCommand().apply(init)) as com.amazonaws.services.directconnect.model.DescribeInterconnectLoaResult
}

@Generated
class AmazonDirectConnectDescribeInterconnectLoaCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeInterconnectLoaRequest, com.amazonaws.services.directconnect.model.DescribeInterconnectLoaResult> {

	var interconnectId: String? = null
	var providerName: String? = null
	var loaContentType: LoaContentType? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeInterconnectLoaRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeInterconnectLoaRequest()
		input.setInterconnectId(this.interconnectId)
		input.setProviderName(this.providerName)
		input.setLoaContentType(this.loaContentType?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DescribeInterconnectLoaResult {
	  return com.amazonaws.services.directconnect.model.DescribeInterconnectLoaResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DescribeInterconnectLoaResult {
		return environment.directconnect.describeInterconnectLoa(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-interconnect-loa")
				.argument("interconnect-id", interconnectId)
				.argument("provider-name", providerName)
				.argument("loa-content-type", loaContentType?.toString())
	}

}


fun AmazonDirectConnectFunctions.describeInterconnects(init: AmazonDirectConnectDescribeInterconnectsCommand.() -> Unit): com.amazonaws.services.directconnect.model.DescribeInterconnectsResult {
	return this.block.declare(AmazonDirectConnectDescribeInterconnectsCommand().apply(init)) as com.amazonaws.services.directconnect.model.DescribeInterconnectsResult
}

@Generated
class AmazonDirectConnectDescribeInterconnectsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeInterconnectsRequest, com.amazonaws.services.directconnect.model.DescribeInterconnectsResult> {

	var interconnectId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeInterconnectsRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeInterconnectsRequest()
		input.setInterconnectId(this.interconnectId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DescribeInterconnectsResult {
	  return com.amazonaws.services.directconnect.model.DescribeInterconnectsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DescribeInterconnectsResult {
		return environment.directconnect.describeInterconnects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-interconnects")
				.argument("interconnect-id", interconnectId)
	}

}


fun AmazonDirectConnectFunctions.describeLags(init: AmazonDirectConnectDescribeLagsCommand.() -> Unit): com.amazonaws.services.directconnect.model.DescribeLagsResult {
	return this.block.declare(AmazonDirectConnectDescribeLagsCommand().apply(init)) as com.amazonaws.services.directconnect.model.DescribeLagsResult
}

@Generated
class AmazonDirectConnectDescribeLagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeLagsRequest, com.amazonaws.services.directconnect.model.DescribeLagsResult> {

	var lagId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeLagsRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeLagsRequest()
		input.setLagId(this.lagId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DescribeLagsResult {
	  return com.amazonaws.services.directconnect.model.DescribeLagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DescribeLagsResult {
		return environment.directconnect.describeLags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-lags")
				.argument("lag-id", lagId)
	}

}


fun AmazonDirectConnectFunctions.describeLoa(init: AmazonDirectConnectDescribeLoaCommand.() -> Unit): com.amazonaws.services.directconnect.model.DescribeLoaResult {
	return this.block.declare(AmazonDirectConnectDescribeLoaCommand().apply(init)) as com.amazonaws.services.directconnect.model.DescribeLoaResult
}

@Generated
class AmazonDirectConnectDescribeLoaCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeLoaRequest, com.amazonaws.services.directconnect.model.DescribeLoaResult> {

	var connectionId: String? = null
	var providerName: String? = null
	var loaContentType: LoaContentType? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeLoaRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeLoaRequest()
		input.setConnectionId(this.connectionId)
		input.setProviderName(this.providerName)
		input.setLoaContentType(this.loaContentType?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DescribeLoaResult {
	  return com.amazonaws.services.directconnect.model.DescribeLoaResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DescribeLoaResult {
		return environment.directconnect.describeLoa(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-loa")
				.argument("connection-id", connectionId)
				.argument("provider-name", providerName)
				.argument("loa-content-type", loaContentType?.toString())
	}

}


fun AmazonDirectConnectFunctions.describeLocations(init: AmazonDirectConnectDescribeLocationsCommand.() -> Unit): com.amazonaws.services.directconnect.model.DescribeLocationsResult {
	return this.block.declare(AmazonDirectConnectDescribeLocationsCommand().apply(init)) as com.amazonaws.services.directconnect.model.DescribeLocationsResult
}

@Generated
class AmazonDirectConnectDescribeLocationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeLocationsRequest, com.amazonaws.services.directconnect.model.DescribeLocationsResult> {



	override fun build(): com.amazonaws.services.directconnect.model.DescribeLocationsRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeLocationsRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DescribeLocationsResult {
	  return com.amazonaws.services.directconnect.model.DescribeLocationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DescribeLocationsResult {
		return environment.directconnect.describeLocations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-locations")

	}

}


fun AmazonDirectConnectFunctions.describeTags(init: AmazonDirectConnectDescribeTagsCommand.() -> Unit): com.amazonaws.services.directconnect.model.DescribeTagsResult {
	return this.block.declare(AmazonDirectConnectDescribeTagsCommand().apply(init)) as com.amazonaws.services.directconnect.model.DescribeTagsResult
}

@Generated
class AmazonDirectConnectDescribeTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeTagsRequest, com.amazonaws.services.directconnect.model.DescribeTagsResult> {

	var resourceArns: List<String>? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeTagsRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeTagsRequest()
		input.setResourceArns(this.resourceArns)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DescribeTagsResult {
	  return com.amazonaws.services.directconnect.model.DescribeTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DescribeTagsResult {
		return environment.directconnect.describeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-tags")
				.argument("resource-arns", resourceArns?.toString())
	}

}


fun AmazonDirectConnectFunctions.describeVirtualGateways(init: AmazonDirectConnectDescribeVirtualGatewaysCommand.() -> Unit): com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysResult {
	return this.block.declare(AmazonDirectConnectDescribeVirtualGatewaysCommand().apply(init)) as com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysResult
}

@Generated
class AmazonDirectConnectDescribeVirtualGatewaysCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysRequest, com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysResult> {



	override fun build(): com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysResult {
	  return com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysResult {
		return environment.directconnect.describeVirtualGateways(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-virtual-gateways")

	}

}


fun AmazonDirectConnectFunctions.describeVirtualInterfaces(init: AmazonDirectConnectDescribeVirtualInterfacesCommand.() -> Unit): com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesResult {
	return this.block.declare(AmazonDirectConnectDescribeVirtualInterfacesCommand().apply(init)) as com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesResult
}

@Generated
class AmazonDirectConnectDescribeVirtualInterfacesCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesRequest, com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesResult> {

	var connectionId: String? = null
	var virtualInterfaceId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesRequest()
		input.setConnectionId(this.connectionId)
		input.setVirtualInterfaceId(this.virtualInterfaceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesResult {
	  return com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesResult {
		return environment.directconnect.describeVirtualInterfaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-virtual-interfaces")
				.argument("connection-id", connectionId)
				.argument("virtual-interface-id", virtualInterfaceId)
	}

}


fun AmazonDirectConnectFunctions.disassociateConnectionFromLag(init: AmazonDirectConnectDisassociateConnectionFromLagCommand.() -> Unit): com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagResult {
	return this.block.declare(AmazonDirectConnectDisassociateConnectionFromLagCommand().apply(init)) as com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagResult
}

@Generated
class AmazonDirectConnectDisassociateConnectionFromLagCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagRequest, com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagResult> {

	var connectionId: String? = null
	var lagId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagRequest {
		val input = com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagRequest()
		input.setConnectionId(this.connectionId)
		input.setLagId(this.lagId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagResult {
	  return com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagResult {
		return environment.directconnect.disassociateConnectionFromLag(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect disassociate-connection-from-lag")
				.argument("connection-id", connectionId)
				.argument("lag-id", lagId)
	}

}


fun AmazonDirectConnectFunctions.tagResource(init: AmazonDirectConnectTagResourceCommand.() -> Unit): com.amazonaws.services.directconnect.model.TagResourceResult {
	return this.block.declare(AmazonDirectConnectTagResourceCommand().apply(init)) as com.amazonaws.services.directconnect.model.TagResourceResult
}

@Generated
class AmazonDirectConnectTagResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.TagResourceRequest, com.amazonaws.services.directconnect.model.TagResourceResult> {

	var resourceArn: String? = null
	var tags: List<com.amazonaws.services.directconnect.model.Tag>? = null

	override fun build(): com.amazonaws.services.directconnect.model.TagResourceRequest {
		val input = com.amazonaws.services.directconnect.model.TagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.TagResourceResult {
	  return com.amazonaws.services.directconnect.model.TagResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.TagResourceResult {
		return environment.directconnect.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect tag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags?.toString())
	}

}


fun AmazonDirectConnectFunctions.untagResource(init: AmazonDirectConnectUntagResourceCommand.() -> Unit): com.amazonaws.services.directconnect.model.UntagResourceResult {
	return this.block.declare(AmazonDirectConnectUntagResourceCommand().apply(init)) as com.amazonaws.services.directconnect.model.UntagResourceResult
}

@Generated
class AmazonDirectConnectUntagResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.UntagResourceRequest, com.amazonaws.services.directconnect.model.UntagResourceResult> {

	var resourceArn: String? = null
	var tagKeys: List<String>? = null

	override fun build(): com.amazonaws.services.directconnect.model.UntagResourceRequest {
		val input = com.amazonaws.services.directconnect.model.UntagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.UntagResourceResult {
	  return com.amazonaws.services.directconnect.model.UntagResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.UntagResourceResult {
		return environment.directconnect.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect untag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-keys", tagKeys?.toString())
	}

}


fun AmazonDirectConnectFunctions.updateLag(init: AmazonDirectConnectUpdateLagCommand.() -> Unit): com.amazonaws.services.directconnect.model.UpdateLagResult {
	return this.block.declare(AmazonDirectConnectUpdateLagCommand().apply(init)) as com.amazonaws.services.directconnect.model.UpdateLagResult
}

@Generated
class AmazonDirectConnectUpdateLagCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.UpdateLagRequest, com.amazonaws.services.directconnect.model.UpdateLagResult> {

	var lagId: String? = null
	var lagName: String? = null
	var minimumLinks: Int? = 0

	override fun build(): com.amazonaws.services.directconnect.model.UpdateLagRequest {
		val input = com.amazonaws.services.directconnect.model.UpdateLagRequest()
		input.setLagId(this.lagId)
		input.setLagName(this.lagName)
		input.setMinimumLinks(this.minimumLinks)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.directconnect.model.UpdateLagResult {
	  return com.amazonaws.services.directconnect.model.UpdateLagResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.directconnect.model.UpdateLagResult {
		return environment.directconnect.updateLag(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect update-lag")
				.argument("lag-id", lagId)
				.argument("lag-name", lagName)
				.argument("minimum-links", minimumLinks?.toString())
	}

}
