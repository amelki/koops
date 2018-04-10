
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.directconnect.AmazonDirectConnect
import com.amazonaws.services.directconnect.model.*

var codingue.koops.core.Environment.directconnect: AmazonDirectConnect
	get() = this.capabilities[AmazonDirectConnect::class.java.name] as AmazonDirectConnect
	set(directconnect) {
		this.capabilities[AmazonDirectConnect::class.java.name] = directconnect
	}

@Generated
class AmazonDirectConnectFunctions(val block: Block)

infix fun AwsContinuation.directconnect(init: AmazonDirectConnectFunctions.() -> Unit) {
	AmazonDirectConnectFunctions(shell).apply(init)
}

			

fun AmazonDirectConnectFunctions.allocateConnectionOnInterconnect(init: AmazonDirectConnectAllocateConnectionOnInterconnectCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectAllocateConnectionOnInterconnectCommand().apply(init))
}

@Generated
class AmazonDirectConnectAllocateConnectionOnInterconnectCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.allocateConnectionOnInterconnect(build())
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


fun AmazonDirectConnectFunctions.allocateHostedConnection(init: AmazonDirectConnectAllocateHostedConnectionCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectAllocateHostedConnectionCommand().apply(init))
}

@Generated
class AmazonDirectConnectAllocateHostedConnectionCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.AllocateHostedConnectionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.allocateHostedConnection(build())
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


fun AmazonDirectConnectFunctions.allocatePrivateVirtualInterface(init: AmazonDirectConnectAllocatePrivateVirtualInterfaceCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectAllocatePrivateVirtualInterfaceCommand().apply(init))
}

@Generated
class AmazonDirectConnectAllocatePrivateVirtualInterfaceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.allocatePrivateVirtualInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect allocate-private-virtual-interface")
				.argument("connection-id", connectionId)
				.argument("owner-account", ownerAccount)
				.argument("new-private-virtual-interface-allocation", newPrivateVirtualInterfaceAllocation?.toString())
	}

}


fun AmazonDirectConnectFunctions.allocatePublicVirtualInterface(init: AmazonDirectConnectAllocatePublicVirtualInterfaceCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectAllocatePublicVirtualInterfaceCommand().apply(init))
}

@Generated
class AmazonDirectConnectAllocatePublicVirtualInterfaceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.allocatePublicVirtualInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect allocate-public-virtual-interface")
				.argument("connection-id", connectionId)
				.argument("owner-account", ownerAccount)
				.argument("new-public-virtual-interface-allocation", newPublicVirtualInterfaceAllocation?.toString())
	}

}


fun AmazonDirectConnectFunctions.associateConnectionWithLag(init: AmazonDirectConnectAssociateConnectionWithLagCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectAssociateConnectionWithLagCommand().apply(init))
}

@Generated
class AmazonDirectConnectAssociateConnectionWithLagCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.AssociateConnectionWithLagRequest> {

	var connectionId: String? = null
	var lagId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.AssociateConnectionWithLagRequest {
		val input = com.amazonaws.services.directconnect.model.AssociateConnectionWithLagRequest()
		input.setConnectionId(this.connectionId)
		input.setLagId(this.lagId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.associateConnectionWithLag(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect associate-connection-with-lag")
				.argument("connection-id", connectionId)
				.argument("lag-id", lagId)
	}

}


fun AmazonDirectConnectFunctions.associateHostedConnection(init: AmazonDirectConnectAssociateHostedConnectionCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectAssociateHostedConnectionCommand().apply(init))
}

@Generated
class AmazonDirectConnectAssociateHostedConnectionCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.AssociateHostedConnectionRequest> {

	var connectionId: String? = null
	var parentConnectionId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.AssociateHostedConnectionRequest {
		val input = com.amazonaws.services.directconnect.model.AssociateHostedConnectionRequest()
		input.setConnectionId(this.connectionId)
		input.setParentConnectionId(this.parentConnectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.associateHostedConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect associate-hosted-connection")
				.argument("connection-id", connectionId)
				.argument("parent-connection-id", parentConnectionId)
	}

}


fun AmazonDirectConnectFunctions.associateVirtualInterface(init: AmazonDirectConnectAssociateVirtualInterfaceCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectAssociateVirtualInterfaceCommand().apply(init))
}

@Generated
class AmazonDirectConnectAssociateVirtualInterfaceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceRequest> {

	var virtualInterfaceId: String? = null
	var connectionId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceRequest {
		val input = com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceRequest()
		input.setVirtualInterfaceId(this.virtualInterfaceId)
		input.setConnectionId(this.connectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.associateVirtualInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect associate-virtual-interface")
				.argument("virtual-interface-id", virtualInterfaceId)
				.argument("connection-id", connectionId)
	}

}


fun AmazonDirectConnectFunctions.confirmConnection(init: AmazonDirectConnectConfirmConnectionCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectConfirmConnectionCommand().apply(init))
}

@Generated
class AmazonDirectConnectConfirmConnectionCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.ConfirmConnectionRequest> {

	var connectionId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.ConfirmConnectionRequest {
		val input = com.amazonaws.services.directconnect.model.ConfirmConnectionRequest()
		input.setConnectionId(this.connectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.confirmConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect confirm-connection")
				.argument("connection-id", connectionId)
	}

}


fun AmazonDirectConnectFunctions.confirmPrivateVirtualInterface(init: AmazonDirectConnectConfirmPrivateVirtualInterfaceCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectConfirmPrivateVirtualInterfaceCommand().apply(init))
}

@Generated
class AmazonDirectConnectConfirmPrivateVirtualInterfaceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.confirmPrivateVirtualInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect confirm-private-virtual-interface")
				.argument("virtual-interface-id", virtualInterfaceId)
				.argument("virtual-gateway-id", virtualGatewayId)
				.argument("direct-connect-gateway-id", directConnectGatewayId)
	}

}


fun AmazonDirectConnectFunctions.confirmPublicVirtualInterface(init: AmazonDirectConnectConfirmPublicVirtualInterfaceCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectConfirmPublicVirtualInterfaceCommand().apply(init))
}

@Generated
class AmazonDirectConnectConfirmPublicVirtualInterfaceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceRequest> {

	var virtualInterfaceId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceRequest {
		val input = com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceRequest()
		input.setVirtualInterfaceId(this.virtualInterfaceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.confirmPublicVirtualInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect confirm-public-virtual-interface")
				.argument("virtual-interface-id", virtualInterfaceId)
	}

}


fun AmazonDirectConnectFunctions.createBGPPeer(init: AmazonDirectConnectCreateBGPPeerCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectCreateBGPPeerCommand().apply(init))
}

@Generated
class AmazonDirectConnectCreateBGPPeerCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.CreateBGPPeerRequest> {

	var virtualInterfaceId: String? = null
	var newBGPPeer: com.amazonaws.services.directconnect.model.NewBGPPeer? = null

	override fun build(): com.amazonaws.services.directconnect.model.CreateBGPPeerRequest {
		val input = com.amazonaws.services.directconnect.model.CreateBGPPeerRequest()
		input.setVirtualInterfaceId(this.virtualInterfaceId)
		input.setNewBGPPeer(this.newBGPPeer)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.createBGPPeer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect create-bgppeer")
				.argument("virtual-interface-id", virtualInterfaceId)
				.argument("new-bgppeer", newBGPPeer?.toString())
	}

}


fun AmazonDirectConnectFunctions.createConnection(init: AmazonDirectConnectCreateConnectionCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectCreateConnectionCommand().apply(init))
}

@Generated
class AmazonDirectConnectCreateConnectionCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.CreateConnectionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.createConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect create-connection")
				.argument("location", location)
				.argument("bandwidth", bandwidth)
				.argument("connection-name", connectionName)
				.argument("lag-id", lagId)
	}

}


fun AmazonDirectConnectFunctions.createDirectConnectGateway(init: AmazonDirectConnectCreateDirectConnectGatewayCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectCreateDirectConnectGatewayCommand().apply(init))
}

@Generated
class AmazonDirectConnectCreateDirectConnectGatewayCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayRequest> {

	var directConnectGatewayName: String? = null
	var amazonSideAsn: Long? = 0L

	override fun build(): com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayRequest {
		val input = com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayRequest()
		input.setDirectConnectGatewayName(this.directConnectGatewayName)
		input.setAmazonSideAsn(this.amazonSideAsn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.createDirectConnectGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect create-direct-connect-gateway")
				.argument("direct-connect-gateway-name", directConnectGatewayName)
				.argument("amazon-side-asn", amazonSideAsn?.toString())
	}

}


fun AmazonDirectConnectFunctions.createDirectConnectGatewayAssociation(init: AmazonDirectConnectCreateDirectConnectGatewayAssociationCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectCreateDirectConnectGatewayAssociationCommand().apply(init))
}

@Generated
class AmazonDirectConnectCreateDirectConnectGatewayAssociationCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationRequest> {

	var directConnectGatewayId: String? = null
	var virtualGatewayId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationRequest {
		val input = com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationRequest()
		input.setDirectConnectGatewayId(this.directConnectGatewayId)
		input.setVirtualGatewayId(this.virtualGatewayId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.createDirectConnectGatewayAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect create-direct-connect-gateway-association")
				.argument("direct-connect-gateway-id", directConnectGatewayId)
				.argument("virtual-gateway-id", virtualGatewayId)
	}

}


fun AmazonDirectConnectFunctions.createInterconnect(init: AmazonDirectConnectCreateInterconnectCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectCreateInterconnectCommand().apply(init))
}

@Generated
class AmazonDirectConnectCreateInterconnectCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.CreateInterconnectRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.createInterconnect(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect create-interconnect")
				.argument("interconnect-name", interconnectName)
				.argument("bandwidth", bandwidth)
				.argument("location", location)
				.argument("lag-id", lagId)
	}

}


fun AmazonDirectConnectFunctions.createLag(init: AmazonDirectConnectCreateLagCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectCreateLagCommand().apply(init))
}

@Generated
class AmazonDirectConnectCreateLagCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.CreateLagRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.createLag(build())
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


fun AmazonDirectConnectFunctions.createPrivateVirtualInterface(init: AmazonDirectConnectCreatePrivateVirtualInterfaceCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectCreatePrivateVirtualInterfaceCommand().apply(init))
}

@Generated
class AmazonDirectConnectCreatePrivateVirtualInterfaceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceRequest> {

	var connectionId: String? = null
	var newPrivateVirtualInterface: com.amazonaws.services.directconnect.model.NewPrivateVirtualInterface? = null

	override fun build(): com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceRequest {
		val input = com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceRequest()
		input.setConnectionId(this.connectionId)
		input.setNewPrivateVirtualInterface(this.newPrivateVirtualInterface)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.createPrivateVirtualInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect create-private-virtual-interface")
				.argument("connection-id", connectionId)
				.argument("new-private-virtual-interface", newPrivateVirtualInterface?.toString())
	}

}


fun AmazonDirectConnectFunctions.createPublicVirtualInterface(init: AmazonDirectConnectCreatePublicVirtualInterfaceCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectCreatePublicVirtualInterfaceCommand().apply(init))
}

@Generated
class AmazonDirectConnectCreatePublicVirtualInterfaceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceRequest> {

	var connectionId: String? = null
	var newPublicVirtualInterface: com.amazonaws.services.directconnect.model.NewPublicVirtualInterface? = null

	override fun build(): com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceRequest {
		val input = com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceRequest()
		input.setConnectionId(this.connectionId)
		input.setNewPublicVirtualInterface(this.newPublicVirtualInterface)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.createPublicVirtualInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect create-public-virtual-interface")
				.argument("connection-id", connectionId)
				.argument("new-public-virtual-interface", newPublicVirtualInterface?.toString())
	}

}


fun AmazonDirectConnectFunctions.deleteBGPPeer(init: AmazonDirectConnectDeleteBGPPeerCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDeleteBGPPeerCommand().apply(init))
}

@Generated
class AmazonDirectConnectDeleteBGPPeerCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DeleteBGPPeerRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.deleteBGPPeer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect delete-bgppeer")
				.argument("virtual-interface-id", virtualInterfaceId)
				.argument("asn", asn?.toString())
				.argument("customer-address", customerAddress)
	}

}


fun AmazonDirectConnectFunctions.deleteConnection(init: AmazonDirectConnectDeleteConnectionCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDeleteConnectionCommand().apply(init))
}

@Generated
class AmazonDirectConnectDeleteConnectionCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DeleteConnectionRequest> {

	var connectionId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DeleteConnectionRequest {
		val input = com.amazonaws.services.directconnect.model.DeleteConnectionRequest()
		input.setConnectionId(this.connectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.deleteConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect delete-connection")
				.argument("connection-id", connectionId)
	}

}


fun AmazonDirectConnectFunctions.deleteDirectConnectGateway(init: AmazonDirectConnectDeleteDirectConnectGatewayCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDeleteDirectConnectGatewayCommand().apply(init))
}

@Generated
class AmazonDirectConnectDeleteDirectConnectGatewayCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayRequest> {

	var directConnectGatewayId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayRequest {
		val input = com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayRequest()
		input.setDirectConnectGatewayId(this.directConnectGatewayId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.deleteDirectConnectGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect delete-direct-connect-gateway")
				.argument("direct-connect-gateway-id", directConnectGatewayId)
	}

}


fun AmazonDirectConnectFunctions.deleteDirectConnectGatewayAssociation(init: AmazonDirectConnectDeleteDirectConnectGatewayAssociationCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDeleteDirectConnectGatewayAssociationCommand().apply(init))
}

@Generated
class AmazonDirectConnectDeleteDirectConnectGatewayAssociationCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationRequest> {

	var directConnectGatewayId: String? = null
	var virtualGatewayId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationRequest {
		val input = com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationRequest()
		input.setDirectConnectGatewayId(this.directConnectGatewayId)
		input.setVirtualGatewayId(this.virtualGatewayId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.deleteDirectConnectGatewayAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect delete-direct-connect-gateway-association")
				.argument("direct-connect-gateway-id", directConnectGatewayId)
				.argument("virtual-gateway-id", virtualGatewayId)
	}

}


fun AmazonDirectConnectFunctions.deleteInterconnect(init: AmazonDirectConnectDeleteInterconnectCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDeleteInterconnectCommand().apply(init))
}

@Generated
class AmazonDirectConnectDeleteInterconnectCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DeleteInterconnectRequest> {

	var interconnectId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DeleteInterconnectRequest {
		val input = com.amazonaws.services.directconnect.model.DeleteInterconnectRequest()
		input.setInterconnectId(this.interconnectId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.deleteInterconnect(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect delete-interconnect")
				.argument("interconnect-id", interconnectId)
	}

}


fun AmazonDirectConnectFunctions.deleteLag(init: AmazonDirectConnectDeleteLagCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDeleteLagCommand().apply(init))
}

@Generated
class AmazonDirectConnectDeleteLagCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DeleteLagRequest> {

	var lagId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DeleteLagRequest {
		val input = com.amazonaws.services.directconnect.model.DeleteLagRequest()
		input.setLagId(this.lagId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.deleteLag(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect delete-lag")
				.argument("lag-id", lagId)
	}

}


fun AmazonDirectConnectFunctions.deleteVirtualInterface(init: AmazonDirectConnectDeleteVirtualInterfaceCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDeleteVirtualInterfaceCommand().apply(init))
}

@Generated
class AmazonDirectConnectDeleteVirtualInterfaceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceRequest> {

	var virtualInterfaceId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceRequest {
		val input = com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceRequest()
		input.setVirtualInterfaceId(this.virtualInterfaceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.deleteVirtualInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect delete-virtual-interface")
				.argument("virtual-interface-id", virtualInterfaceId)
	}

}


fun AmazonDirectConnectFunctions.describeConnectionLoa(init: AmazonDirectConnectDescribeConnectionLoaCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDescribeConnectionLoaCommand().apply(init))
}

@Generated
class AmazonDirectConnectDescribeConnectionLoaCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeConnectionLoaRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.describeConnectionLoa(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-connection-loa")
				.argument("connection-id", connectionId)
				.argument("provider-name", providerName)
				.argument("loa-content-type", loaContentType?.toString())
	}

}


fun AmazonDirectConnectFunctions.describeConnections(init: AmazonDirectConnectDescribeConnectionsCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDescribeConnectionsCommand().apply(init))
}

@Generated
class AmazonDirectConnectDescribeConnectionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeConnectionsRequest> {

	var connectionId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeConnectionsRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeConnectionsRequest()
		input.setConnectionId(this.connectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.describeConnections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-connections")
				.argument("connection-id", connectionId)
	}

}


fun AmazonDirectConnectFunctions.describeConnectionsOnInterconnect(init: AmazonDirectConnectDescribeConnectionsOnInterconnectCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDescribeConnectionsOnInterconnectCommand().apply(init))
}

@Generated
class AmazonDirectConnectDescribeConnectionsOnInterconnectCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectRequest> {

	var interconnectId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectRequest()
		input.setInterconnectId(this.interconnectId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.describeConnectionsOnInterconnect(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-connections-on-interconnect")
				.argument("interconnect-id", interconnectId)
	}

}


fun AmazonDirectConnectFunctions.describeDirectConnectGatewayAssociations(init: AmazonDirectConnectDescribeDirectConnectGatewayAssociationsCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDescribeDirectConnectGatewayAssociationsCommand().apply(init))
}

@Generated
class AmazonDirectConnectDescribeDirectConnectGatewayAssociationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.describeDirectConnectGatewayAssociations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-direct-connect-gateway-associations")
				.argument("direct-connect-gateway-id", directConnectGatewayId)
				.argument("virtual-gateway-id", virtualGatewayId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDirectConnectFunctions.describeDirectConnectGatewayAttachments(init: AmazonDirectConnectDescribeDirectConnectGatewayAttachmentsCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDescribeDirectConnectGatewayAttachmentsCommand().apply(init))
}

@Generated
class AmazonDirectConnectDescribeDirectConnectGatewayAttachmentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.describeDirectConnectGatewayAttachments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-direct-connect-gateway-attachments")
				.argument("direct-connect-gateway-id", directConnectGatewayId)
				.argument("virtual-interface-id", virtualInterfaceId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDirectConnectFunctions.describeDirectConnectGateways(init: AmazonDirectConnectDescribeDirectConnectGatewaysCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDescribeDirectConnectGatewaysCommand().apply(init))
}

@Generated
class AmazonDirectConnectDescribeDirectConnectGatewaysCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.describeDirectConnectGateways(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-direct-connect-gateways")
				.argument("direct-connect-gateway-id", directConnectGatewayId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonDirectConnectFunctions.describeHostedConnections(init: AmazonDirectConnectDescribeHostedConnectionsCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDescribeHostedConnectionsCommand().apply(init))
}

@Generated
class AmazonDirectConnectDescribeHostedConnectionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeHostedConnectionsRequest> {

	var connectionId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeHostedConnectionsRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeHostedConnectionsRequest()
		input.setConnectionId(this.connectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.describeHostedConnections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-hosted-connections")
				.argument("connection-id", connectionId)
	}

}


fun AmazonDirectConnectFunctions.describeInterconnectLoa(init: AmazonDirectConnectDescribeInterconnectLoaCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDescribeInterconnectLoaCommand().apply(init))
}

@Generated
class AmazonDirectConnectDescribeInterconnectLoaCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeInterconnectLoaRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.describeInterconnectLoa(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-interconnect-loa")
				.argument("interconnect-id", interconnectId)
				.argument("provider-name", providerName)
				.argument("loa-content-type", loaContentType?.toString())
	}

}


fun AmazonDirectConnectFunctions.describeInterconnects(init: AmazonDirectConnectDescribeInterconnectsCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDescribeInterconnectsCommand().apply(init))
}

@Generated
class AmazonDirectConnectDescribeInterconnectsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeInterconnectsRequest> {

	var interconnectId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeInterconnectsRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeInterconnectsRequest()
		input.setInterconnectId(this.interconnectId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.describeInterconnects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-interconnects")
				.argument("interconnect-id", interconnectId)
	}

}


fun AmazonDirectConnectFunctions.describeLags(init: AmazonDirectConnectDescribeLagsCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDescribeLagsCommand().apply(init))
}

@Generated
class AmazonDirectConnectDescribeLagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeLagsRequest> {

	var lagId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeLagsRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeLagsRequest()
		input.setLagId(this.lagId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.describeLags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-lags")
				.argument("lag-id", lagId)
	}

}


fun AmazonDirectConnectFunctions.describeLoa(init: AmazonDirectConnectDescribeLoaCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDescribeLoaCommand().apply(init))
}

@Generated
class AmazonDirectConnectDescribeLoaCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeLoaRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.describeLoa(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-loa")
				.argument("connection-id", connectionId)
				.argument("provider-name", providerName)
				.argument("loa-content-type", loaContentType?.toString())
	}

}


fun AmazonDirectConnectFunctions.describeLocations(init: AmazonDirectConnectDescribeLocationsCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDescribeLocationsCommand().apply(init))
}

@Generated
class AmazonDirectConnectDescribeLocationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeLocationsRequest> {



	override fun build(): com.amazonaws.services.directconnect.model.DescribeLocationsRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeLocationsRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.describeLocations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-locations")

	}

}


fun AmazonDirectConnectFunctions.describeTags(init: AmazonDirectConnectDescribeTagsCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDescribeTagsCommand().apply(init))
}

@Generated
class AmazonDirectConnectDescribeTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeTagsRequest> {

	var resourceArns: List<String>? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeTagsRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeTagsRequest()
		input.setResourceArns(this.resourceArns)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.describeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-tags")
				.argument("resource-arns", resourceArns?.toString())
	}

}


fun AmazonDirectConnectFunctions.describeVirtualGateways(init: AmazonDirectConnectDescribeVirtualGatewaysCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDescribeVirtualGatewaysCommand().apply(init))
}

@Generated
class AmazonDirectConnectDescribeVirtualGatewaysCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysRequest> {



	override fun build(): com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.describeVirtualGateways(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-virtual-gateways")

	}

}


fun AmazonDirectConnectFunctions.describeVirtualInterfaces(init: AmazonDirectConnectDescribeVirtualInterfacesCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDescribeVirtualInterfacesCommand().apply(init))
}

@Generated
class AmazonDirectConnectDescribeVirtualInterfacesCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesRequest> {

	var connectionId: String? = null
	var virtualInterfaceId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesRequest {
		val input = com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesRequest()
		input.setConnectionId(this.connectionId)
		input.setVirtualInterfaceId(this.virtualInterfaceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.describeVirtualInterfaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect describe-virtual-interfaces")
				.argument("connection-id", connectionId)
				.argument("virtual-interface-id", virtualInterfaceId)
	}

}


fun AmazonDirectConnectFunctions.disassociateConnectionFromLag(init: AmazonDirectConnectDisassociateConnectionFromLagCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectDisassociateConnectionFromLagCommand().apply(init))
}

@Generated
class AmazonDirectConnectDisassociateConnectionFromLagCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagRequest> {

	var connectionId: String? = null
	var lagId: String? = null

	override fun build(): com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagRequest {
		val input = com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagRequest()
		input.setConnectionId(this.connectionId)
		input.setLagId(this.lagId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.disassociateConnectionFromLag(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect disassociate-connection-from-lag")
				.argument("connection-id", connectionId)
				.argument("lag-id", lagId)
	}

}


fun AmazonDirectConnectFunctions.tagResource(init: AmazonDirectConnectTagResourceCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectTagResourceCommand().apply(init))
}

@Generated
class AmazonDirectConnectTagResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.TagResourceRequest> {

	var resourceArn: String? = null
	var tags: List<com.amazonaws.services.directconnect.model.Tag>? = null

	override fun build(): com.amazonaws.services.directconnect.model.TagResourceRequest {
		val input = com.amazonaws.services.directconnect.model.TagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect tag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags?.toString())
	}

}


fun AmazonDirectConnectFunctions.untagResource(init: AmazonDirectConnectUntagResourceCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectUntagResourceCommand().apply(init))
}

@Generated
class AmazonDirectConnectUntagResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.UntagResourceRequest> {

	var resourceArn: String? = null
	var tagKeys: List<String>? = null

	override fun build(): com.amazonaws.services.directconnect.model.UntagResourceRequest {
		val input = com.amazonaws.services.directconnect.model.UntagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect untag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-keys", tagKeys?.toString())
	}

}


fun AmazonDirectConnectFunctions.updateLag(init: AmazonDirectConnectUpdateLagCommand.() -> Unit) {
	this.block.declare(AmazonDirectConnectUpdateLagCommand().apply(init))
}

@Generated
class AmazonDirectConnectUpdateLagCommand() : AmazonWebServiceCommand<com.amazonaws.services.directconnect.model.UpdateLagRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.directconnect.updateLag(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws directconnect update-lag")
				.argument("lag-id", lagId)
				.argument("lag-name", lagName)
				.argument("minimum-links", minimumLinks?.toString())
	}

}
