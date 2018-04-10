
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.ec2.AmazonEC2
import com.amazonaws.services.ec2.model.*

var codingue.koops.core.Environment.ec2: AmazonEC2
	get() = this.capabilities[AmazonEC2::class.java.name] as AmazonEC2
	set(ec2) {
		this.capabilities[AmazonEC2::class.java.name] = ec2
	}

@Generated
class AmazonEC2Functions(val block: Block)

infix fun AwsContinuation.ec2(init: AmazonEC2Functions.() -> Unit) {
	AmazonEC2Functions(shell).apply(init)
}

			

fun AmazonEC2Functions.acceptReservedInstancesExchangeQuote(reservedInstanceIds: List<String>, init: AmazonEC2AcceptReservedInstancesExchangeQuoteCommand.() -> Unit) {
	this.block.declare(AmazonEC2AcceptReservedInstancesExchangeQuoteCommand(reservedInstanceIds).apply(init))
}

@Generated
class AmazonEC2AcceptReservedInstancesExchangeQuoteCommand(val reservedInstanceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest> {

	var targetConfigurations: List<com.amazonaws.services.ec2.model.TargetConfigurationRequest>? = null

	override fun build(): com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest {
		val input = com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest()
		input.setReservedInstanceIds(this.reservedInstanceIds)
		input.setTargetConfigurations(this.targetConfigurations)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.acceptReservedInstancesExchangeQuote(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 accept-reserved-instances-exchange-quote")
				.argument("reserved-instance-ids", reservedInstanceIds.toString())
				.argument("target-configurations", targetConfigurations?.toString())
	}

}


fun AmazonEC2Functions.acceptVpcEndpointConnections(serviceId: String, vpcEndpointIds: List<String>, init: AmazonEC2AcceptVpcEndpointConnectionsCommand.() -> Unit) {
	this.block.declare(AmazonEC2AcceptVpcEndpointConnectionsCommand(serviceId, vpcEndpointIds).apply(init))
}

@Generated
class AmazonEC2AcceptVpcEndpointConnectionsCommand(val serviceId: String, val vpcEndpointIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsRequest> {



	override fun build(): com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsRequest {
		val input = com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsRequest()
		input.setServiceId(this.serviceId)
		input.setVpcEndpointIds(this.vpcEndpointIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.acceptVpcEndpointConnections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 accept-vpc-endpoint-connections")
				.argument("service-id", serviceId)
				.argument("vpc-endpoint-ids", vpcEndpointIds.toString())
	}

}


fun AmazonEC2Functions.acceptVpcPeeringConnection(init: AmazonEC2AcceptVpcPeeringConnectionCommand.() -> Unit) {
	this.block.declare(AmazonEC2AcceptVpcPeeringConnectionCommand().apply(init))
}

@Generated
class AmazonEC2AcceptVpcPeeringConnectionCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionRequest> {

	var vpcPeeringConnectionId: String? = null

	override fun build(): com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionRequest {
		val input = com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionRequest()
		input.setVpcPeeringConnectionId(this.vpcPeeringConnectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.acceptVpcPeeringConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 accept-vpc-peering-connection")
				.argument("vpc-peering-connection-id", vpcPeeringConnectionId)
	}

}


fun AmazonEC2Functions.allocateAddress(init: AmazonEC2AllocateAddressCommand.() -> Unit) {
	this.block.declare(AmazonEC2AllocateAddressCommand().apply(init))
}

@Generated
class AmazonEC2AllocateAddressCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AllocateAddressRequest> {

	var domain: DomainType? = null
	var address: String? = null

	override fun build(): com.amazonaws.services.ec2.model.AllocateAddressRequest {
		val input = com.amazonaws.services.ec2.model.AllocateAddressRequest()
		input.setDomain(this.domain?.toString())
		input.setAddress(this.address)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.allocateAddress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 allocate-address")
				.argument("domain", domain?.toString())
				.argument("address", address)
	}

}


fun AmazonEC2Functions.allocateHosts(availabilityZone: String, instanceType: String, quantity: Int, init: AmazonEC2AllocateHostsCommand.() -> Unit) {
	this.block.declare(AmazonEC2AllocateHostsCommand(availabilityZone, instanceType, quantity).apply(init))
}

@Generated
class AmazonEC2AllocateHostsCommand(val availabilityZone: String, val instanceType: String, val quantity: Int) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AllocateHostsRequest> {

	var autoPlacement: AutoPlacement? = null
	var clientToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.AllocateHostsRequest {
		val input = com.amazonaws.services.ec2.model.AllocateHostsRequest()
		input.setAutoPlacement(this.autoPlacement?.toString())
		input.setAvailabilityZone(this.availabilityZone)
		input.setClientToken(this.clientToken)
		input.setInstanceType(this.instanceType)
		input.setQuantity(this.quantity)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.allocateHosts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 allocate-hosts")
				.argument("auto-placement", autoPlacement?.toString())
				.argument("availability-zone", availabilityZone)
				.argument("client-token", clientToken)
				.argument("instance-type", instanceType)
				.argument("quantity", quantity.toString())
	}

}


fun AmazonEC2Functions.assignIpv6Addresses(networkInterfaceId: String, init: AmazonEC2AssignIpv6AddressesCommand.() -> Unit) {
	this.block.declare(AmazonEC2AssignIpv6AddressesCommand(networkInterfaceId).apply(init))
}

@Generated
class AmazonEC2AssignIpv6AddressesCommand(val networkInterfaceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AssignIpv6AddressesRequest> {

	var ipv6AddressCount: Int? = 0
	var ipv6Addresses: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.AssignIpv6AddressesRequest {
		val input = com.amazonaws.services.ec2.model.AssignIpv6AddressesRequest()
		input.setIpv6AddressCount(this.ipv6AddressCount)
		input.setIpv6Addresses(this.ipv6Addresses)
		input.setNetworkInterfaceId(this.networkInterfaceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.assignIpv6Addresses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 assign-ipv6-addresses")
				.argument("ipv6-address-count", ipv6AddressCount?.toString())
				.argument("ipv6-addresses", ipv6Addresses?.toString())
				.argument("network-interface-id", networkInterfaceId)
	}

}


fun AmazonEC2Functions.assignPrivateIpAddresses(networkInterfaceId: String, init: AmazonEC2AssignPrivateIpAddressesCommand.() -> Unit) {
	this.block.declare(AmazonEC2AssignPrivateIpAddressesCommand(networkInterfaceId).apply(init))
}

@Generated
class AmazonEC2AssignPrivateIpAddressesCommand(val networkInterfaceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AssignPrivateIpAddressesRequest> {

	var allowReassignment: Boolean? = false
	var privateIpAddresses: List<String>? = null
	var secondaryPrivateIpAddressCount: Int? = 0

	override fun build(): com.amazonaws.services.ec2.model.AssignPrivateIpAddressesRequest {
		val input = com.amazonaws.services.ec2.model.AssignPrivateIpAddressesRequest()
		input.setAllowReassignment(this.allowReassignment)
		input.setNetworkInterfaceId(this.networkInterfaceId)
		input.setPrivateIpAddresses(this.privateIpAddresses)
		input.setSecondaryPrivateIpAddressCount(this.secondaryPrivateIpAddressCount)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.assignPrivateIpAddresses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 assign-private-ip-addresses")
				.option("allow-reassignment", allowReassignment ?: false)
				.argument("network-interface-id", networkInterfaceId)
				.argument("private-ip-addresses", privateIpAddresses?.toString())
				.argument("secondary-private-ip-address-count", secondaryPrivateIpAddressCount?.toString())
	}

}


fun AmazonEC2Functions.associateAddress(init: AmazonEC2AssociateAddressCommand.() -> Unit) {
	this.block.declare(AmazonEC2AssociateAddressCommand().apply(init))
}

@Generated
class AmazonEC2AssociateAddressCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AssociateAddressRequest> {

	var allocationId: String? = null
	var instanceId: String? = null
	var publicIp: String? = null
	var allowReassociation: Boolean? = false
	var networkInterfaceId: String? = null
	var privateIpAddress: String? = null

	override fun build(): com.amazonaws.services.ec2.model.AssociateAddressRequest {
		val input = com.amazonaws.services.ec2.model.AssociateAddressRequest()
		input.setAllocationId(this.allocationId)
		input.setInstanceId(this.instanceId)
		input.setPublicIp(this.publicIp)
		input.setAllowReassociation(this.allowReassociation)
		input.setNetworkInterfaceId(this.networkInterfaceId)
		input.setPrivateIpAddress(this.privateIpAddress)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.associateAddress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 associate-address")
				.argument("allocation-id", allocationId)
				.argument("instance-id", instanceId)
				.argument("public-ip", publicIp)
				.option("allow-reassociation", allowReassociation ?: false)
				.argument("network-interface-id", networkInterfaceId)
				.argument("private-ip-address", privateIpAddress)
	}

}


fun AmazonEC2Functions.associateDhcpOptions(dhcpOptionsId: String, vpcId: String, init: AmazonEC2AssociateDhcpOptionsCommand.() -> Unit) {
	this.block.declare(AmazonEC2AssociateDhcpOptionsCommand(dhcpOptionsId, vpcId).apply(init))
}

@Generated
class AmazonEC2AssociateDhcpOptionsCommand(val dhcpOptionsId: String, val vpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AssociateDhcpOptionsRequest> {



	override fun build(): com.amazonaws.services.ec2.model.AssociateDhcpOptionsRequest {
		val input = com.amazonaws.services.ec2.model.AssociateDhcpOptionsRequest()
		input.setDhcpOptionsId(this.dhcpOptionsId)
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.associateDhcpOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 associate-dhcp-options")
				.argument("dhcp-options-id", dhcpOptionsId)
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.associateIamInstanceProfile(iamInstanceProfile: com.amazonaws.services.ec2.model.IamInstanceProfileSpecification, instanceId: String, init: AmazonEC2AssociateIamInstanceProfileCommand.() -> Unit) {
	this.block.declare(AmazonEC2AssociateIamInstanceProfileCommand(iamInstanceProfile, instanceId).apply(init))
}

@Generated
class AmazonEC2AssociateIamInstanceProfileCommand(val iamInstanceProfile: com.amazonaws.services.ec2.model.IamInstanceProfileSpecification, val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AssociateIamInstanceProfileRequest> {



	override fun build(): com.amazonaws.services.ec2.model.AssociateIamInstanceProfileRequest {
		val input = com.amazonaws.services.ec2.model.AssociateIamInstanceProfileRequest()
		input.setIamInstanceProfile(this.iamInstanceProfile)
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.associateIamInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 associate-iam-instance-profile")
				.argument("iam-instance-profile", iamInstanceProfile.toString())
				.argument("instance-id", instanceId)
	}

}


fun AmazonEC2Functions.associateRouteTable(routeTableId: String, subnetId: String, init: AmazonEC2AssociateRouteTableCommand.() -> Unit) {
	this.block.declare(AmazonEC2AssociateRouteTableCommand(routeTableId, subnetId).apply(init))
}

@Generated
class AmazonEC2AssociateRouteTableCommand(val routeTableId: String, val subnetId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AssociateRouteTableRequest> {



	override fun build(): com.amazonaws.services.ec2.model.AssociateRouteTableRequest {
		val input = com.amazonaws.services.ec2.model.AssociateRouteTableRequest()
		input.setRouteTableId(this.routeTableId)
		input.setSubnetId(this.subnetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.associateRouteTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 associate-route-table")
				.argument("route-table-id", routeTableId)
				.argument("subnet-id", subnetId)
	}

}


fun AmazonEC2Functions.associateSubnetCidrBlock(ipv6CidrBlock: String, subnetId: String, init: AmazonEC2AssociateSubnetCidrBlockCommand.() -> Unit) {
	this.block.declare(AmazonEC2AssociateSubnetCidrBlockCommand(ipv6CidrBlock, subnetId).apply(init))
}

@Generated
class AmazonEC2AssociateSubnetCidrBlockCommand(val ipv6CidrBlock: String, val subnetId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockRequest> {



	override fun build(): com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockRequest {
		val input = com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockRequest()
		input.setIpv6CidrBlock(this.ipv6CidrBlock)
		input.setSubnetId(this.subnetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.associateSubnetCidrBlock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 associate-subnet-cidr-block")
				.argument("ipv6-cidr-block", ipv6CidrBlock)
				.argument("subnet-id", subnetId)
	}

}


fun AmazonEC2Functions.associateVpcCidrBlock(vpcId: String, init: AmazonEC2AssociateVpcCidrBlockCommand.() -> Unit) {
	this.block.declare(AmazonEC2AssociateVpcCidrBlockCommand(vpcId).apply(init))
}

@Generated
class AmazonEC2AssociateVpcCidrBlockCommand(val vpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AssociateVpcCidrBlockRequest> {

	var amazonProvidedIpv6CidrBlock: Boolean? = false
	var cidrBlock: String? = null

	override fun build(): com.amazonaws.services.ec2.model.AssociateVpcCidrBlockRequest {
		val input = com.amazonaws.services.ec2.model.AssociateVpcCidrBlockRequest()
		input.setAmazonProvidedIpv6CidrBlock(this.amazonProvidedIpv6CidrBlock)
		input.setCidrBlock(this.cidrBlock)
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.associateVpcCidrBlock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 associate-vpc-cidr-block")
				.option("amazon-provided-ipv6-cidr-block", amazonProvidedIpv6CidrBlock ?: false)
				.argument("cidr-block", cidrBlock)
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.attachClassicLinkVpc(groups: List<String>, instanceId: String, vpcId: String, init: AmazonEC2AttachClassicLinkVpcCommand.() -> Unit) {
	this.block.declare(AmazonEC2AttachClassicLinkVpcCommand(groups, instanceId, vpcId).apply(init))
}

@Generated
class AmazonEC2AttachClassicLinkVpcCommand(val groups: List<String>, val instanceId: String, val vpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AttachClassicLinkVpcRequest> {



	override fun build(): com.amazonaws.services.ec2.model.AttachClassicLinkVpcRequest {
		val input = com.amazonaws.services.ec2.model.AttachClassicLinkVpcRequest()
		input.setGroups(this.groups)
		input.setInstanceId(this.instanceId)
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.attachClassicLinkVpc(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 attach-classic-link-vpc")
				.argument("groups", groups.toString())
				.argument("instance-id", instanceId)
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.attachInternetGateway(internetGatewayId: String, vpcId: String, init: AmazonEC2AttachInternetGatewayCommand.() -> Unit) {
	this.block.declare(AmazonEC2AttachInternetGatewayCommand(internetGatewayId, vpcId).apply(init))
}

@Generated
class AmazonEC2AttachInternetGatewayCommand(val internetGatewayId: String, val vpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AttachInternetGatewayRequest> {



	override fun build(): com.amazonaws.services.ec2.model.AttachInternetGatewayRequest {
		val input = com.amazonaws.services.ec2.model.AttachInternetGatewayRequest()
		input.setInternetGatewayId(this.internetGatewayId)
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.attachInternetGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 attach-internet-gateway")
				.argument("internet-gateway-id", internetGatewayId)
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.attachNetworkInterface(deviceIndex: Int, instanceId: String, networkInterfaceId: String, init: AmazonEC2AttachNetworkInterfaceCommand.() -> Unit) {
	this.block.declare(AmazonEC2AttachNetworkInterfaceCommand(deviceIndex, instanceId, networkInterfaceId).apply(init))
}

@Generated
class AmazonEC2AttachNetworkInterfaceCommand(val deviceIndex: Int, val instanceId: String, val networkInterfaceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AttachNetworkInterfaceRequest> {



	override fun build(): com.amazonaws.services.ec2.model.AttachNetworkInterfaceRequest {
		val input = com.amazonaws.services.ec2.model.AttachNetworkInterfaceRequest()
		input.setDeviceIndex(this.deviceIndex)
		input.setInstanceId(this.instanceId)
		input.setNetworkInterfaceId(this.networkInterfaceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.attachNetworkInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 attach-network-interface")
				.argument("device-index", deviceIndex.toString())
				.argument("instance-id", instanceId)
				.argument("network-interface-id", networkInterfaceId)
	}

}


fun AmazonEC2Functions.attachVolume(device: String, instanceId: String, volumeId: String, init: AmazonEC2AttachVolumeCommand.() -> Unit) {
	this.block.declare(AmazonEC2AttachVolumeCommand(device, instanceId, volumeId).apply(init))
}

@Generated
class AmazonEC2AttachVolumeCommand(val device: String, val instanceId: String, val volumeId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AttachVolumeRequest> {



	override fun build(): com.amazonaws.services.ec2.model.AttachVolumeRequest {
		val input = com.amazonaws.services.ec2.model.AttachVolumeRequest()
		input.setDevice(this.device)
		input.setInstanceId(this.instanceId)
		input.setVolumeId(this.volumeId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.attachVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 attach-volume")
				.argument("device", device)
				.argument("instance-id", instanceId)
				.argument("volume-id", volumeId)
	}

}


fun AmazonEC2Functions.attachVpnGateway(vpcId: String, vpnGatewayId: String, init: AmazonEC2AttachVpnGatewayCommand.() -> Unit) {
	this.block.declare(AmazonEC2AttachVpnGatewayCommand(vpcId, vpnGatewayId).apply(init))
}

@Generated
class AmazonEC2AttachVpnGatewayCommand(val vpcId: String, val vpnGatewayId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AttachVpnGatewayRequest> {



	override fun build(): com.amazonaws.services.ec2.model.AttachVpnGatewayRequest {
		val input = com.amazonaws.services.ec2.model.AttachVpnGatewayRequest()
		input.setVpcId(this.vpcId)
		input.setVpnGatewayId(this.vpnGatewayId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.attachVpnGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 attach-vpn-gateway")
				.argument("vpc-id", vpcId)
				.argument("vpn-gateway-id", vpnGatewayId)
	}

}


fun AmazonEC2Functions.authorizeSecurityGroupEgress(groupId: String, init: AmazonEC2AuthorizeSecurityGroupEgressCommand.() -> Unit) {
	this.block.declare(AmazonEC2AuthorizeSecurityGroupEgressCommand(groupId).apply(init))
}

@Generated
class AmazonEC2AuthorizeSecurityGroupEgressCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressRequest> {

	var ipPermissions: List<com.amazonaws.services.ec2.model.IpPermission>? = null
	var cidrIp: String? = null
	var fromPort: Int? = 0
	var ipProtocol: String? = null
	var toPort: Int? = 0
	var sourceSecurityGroupName: String? = null
	var sourceSecurityGroupOwnerId: String? = null

	override fun build(): com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressRequest {
		val input = com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressRequest()
		input.setGroupId(this.groupId)
		input.setIpPermissions(this.ipPermissions)
		input.setCidrIp(this.cidrIp)
		input.setFromPort(this.fromPort)
		input.setIpProtocol(this.ipProtocol)
		input.setToPort(this.toPort)
		input.setSourceSecurityGroupName(this.sourceSecurityGroupName)
		input.setSourceSecurityGroupOwnerId(this.sourceSecurityGroupOwnerId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.authorizeSecurityGroupEgress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 authorize-security-group-egress")
				.argument("group-id", groupId)
				.argument("ip-permissions", ipPermissions?.toString())
				.argument("cidr-ip", cidrIp)
				.argument("from-port", fromPort?.toString())
				.argument("ip-protocol", ipProtocol)
				.argument("to-port", toPort?.toString())
				.argument("source-security-group-name", sourceSecurityGroupName)
				.argument("source-security-group-owner-id", sourceSecurityGroupOwnerId)
	}

}


fun AmazonEC2Functions.authorizeSecurityGroupIngress(init: AmazonEC2AuthorizeSecurityGroupIngressCommand.() -> Unit) {
	this.block.declare(AmazonEC2AuthorizeSecurityGroupIngressCommand().apply(init))
}

@Generated
class AmazonEC2AuthorizeSecurityGroupIngressCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressRequest> {

	var cidrIp: String? = null
	var fromPort: Int? = 0
	var groupId: String? = null
	var groupName: String? = null
	var ipPermissions: List<com.amazonaws.services.ec2.model.IpPermission>? = null
	var ipProtocol: String? = null
	var sourceSecurityGroupName: String? = null
	var sourceSecurityGroupOwnerId: String? = null
	var toPort: Int? = 0

	override fun build(): com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressRequest {
		val input = com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressRequest()
		input.setCidrIp(this.cidrIp)
		input.setFromPort(this.fromPort)
		input.setGroupId(this.groupId)
		input.setGroupName(this.groupName)
		input.setIpPermissions(this.ipPermissions)
		input.setIpProtocol(this.ipProtocol)
		input.setSourceSecurityGroupName(this.sourceSecurityGroupName)
		input.setSourceSecurityGroupOwnerId(this.sourceSecurityGroupOwnerId)
		input.setToPort(this.toPort)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.authorizeSecurityGroupIngress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 authorize-security-group-ingress")
				.argument("cidr-ip", cidrIp)
				.argument("from-port", fromPort?.toString())
				.argument("group-id", groupId)
				.argument("group-name", groupName)
				.argument("ip-permissions", ipPermissions?.toString())
				.argument("ip-protocol", ipProtocol)
				.argument("source-security-group-name", sourceSecurityGroupName)
				.argument("source-security-group-owner-id", sourceSecurityGroupOwnerId)
				.argument("to-port", toPort?.toString())
	}

}


fun AmazonEC2Functions.bundleInstance(instanceId: String, storage: com.amazonaws.services.ec2.model.Storage, init: AmazonEC2BundleInstanceCommand.() -> Unit) {
	this.block.declare(AmazonEC2BundleInstanceCommand(instanceId, storage).apply(init))
}

@Generated
class AmazonEC2BundleInstanceCommand(val instanceId: String, val storage: com.amazonaws.services.ec2.model.Storage) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.BundleInstanceRequest> {



	override fun build(): com.amazonaws.services.ec2.model.BundleInstanceRequest {
		val input = com.amazonaws.services.ec2.model.BundleInstanceRequest()
		input.setInstanceId(this.instanceId)
		input.setStorage(this.storage)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.bundleInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 bundle-instance")
				.argument("instance-id", instanceId)
				.argument("storage", storage.toString())
	}

}


fun AmazonEC2Functions.cancelBundleTask(bundleId: String, init: AmazonEC2CancelBundleTaskCommand.() -> Unit) {
	this.block.declare(AmazonEC2CancelBundleTaskCommand(bundleId).apply(init))
}

@Generated
class AmazonEC2CancelBundleTaskCommand(val bundleId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CancelBundleTaskRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CancelBundleTaskRequest {
		val input = com.amazonaws.services.ec2.model.CancelBundleTaskRequest()
		input.setBundleId(this.bundleId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.cancelBundleTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 cancel-bundle-task")
				.argument("bundle-id", bundleId)
	}

}


fun AmazonEC2Functions.cancelConversionTask(conversionTaskId: String, init: AmazonEC2CancelConversionTaskCommand.() -> Unit) {
	this.block.declare(AmazonEC2CancelConversionTaskCommand(conversionTaskId).apply(init))
}

@Generated
class AmazonEC2CancelConversionTaskCommand(val conversionTaskId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CancelConversionTaskRequest> {

	var reasonMessage: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CancelConversionTaskRequest {
		val input = com.amazonaws.services.ec2.model.CancelConversionTaskRequest()
		input.setConversionTaskId(this.conversionTaskId)
		input.setReasonMessage(this.reasonMessage)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.cancelConversionTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 cancel-conversion-task")
				.argument("conversion-task-id", conversionTaskId)
				.argument("reason-message", reasonMessage)
	}

}


fun AmazonEC2Functions.cancelExportTask(exportTaskId: String, init: AmazonEC2CancelExportTaskCommand.() -> Unit) {
	this.block.declare(AmazonEC2CancelExportTaskCommand(exportTaskId).apply(init))
}

@Generated
class AmazonEC2CancelExportTaskCommand(val exportTaskId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CancelExportTaskRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CancelExportTaskRequest {
		val input = com.amazonaws.services.ec2.model.CancelExportTaskRequest()
		input.setExportTaskId(this.exportTaskId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.cancelExportTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 cancel-export-task")
				.argument("export-task-id", exportTaskId)
	}

}


fun AmazonEC2Functions.cancelImportTask(init: AmazonEC2CancelImportTaskCommand.() -> Unit) {
	this.block.declare(AmazonEC2CancelImportTaskCommand().apply(init))
}

@Generated
class AmazonEC2CancelImportTaskCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CancelImportTaskRequest> {

	var cancelReason: String? = null
	var importTaskId: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CancelImportTaskRequest {
		val input = com.amazonaws.services.ec2.model.CancelImportTaskRequest()
		input.setCancelReason(this.cancelReason)
		input.setImportTaskId(this.importTaskId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.cancelImportTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 cancel-import-task")
				.argument("cancel-reason", cancelReason)
				.argument("import-task-id", importTaskId)
	}

}


fun AmazonEC2Functions.cancelReservedInstancesListing(reservedInstancesListingId: String, init: AmazonEC2CancelReservedInstancesListingCommand.() -> Unit) {
	this.block.declare(AmazonEC2CancelReservedInstancesListingCommand(reservedInstancesListingId).apply(init))
}

@Generated
class AmazonEC2CancelReservedInstancesListingCommand(val reservedInstancesListingId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CancelReservedInstancesListingRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CancelReservedInstancesListingRequest {
		val input = com.amazonaws.services.ec2.model.CancelReservedInstancesListingRequest()
		input.setReservedInstancesListingId(this.reservedInstancesListingId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.cancelReservedInstancesListing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 cancel-reserved-instances-listing")
				.argument("reserved-instances-listing-id", reservedInstancesListingId)
	}

}


fun AmazonEC2Functions.cancelSpotFleetRequests(spotFleetRequestIds: List<String>, terminateInstances: Boolean, init: AmazonEC2CancelSpotFleetRequestsCommand.() -> Unit) {
	this.block.declare(AmazonEC2CancelSpotFleetRequestsCommand(spotFleetRequestIds, terminateInstances).apply(init))
}

@Generated
class AmazonEC2CancelSpotFleetRequestsCommand(val spotFleetRequestIds: List<String>, val terminateInstances: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CancelSpotFleetRequestsRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CancelSpotFleetRequestsRequest {
		val input = com.amazonaws.services.ec2.model.CancelSpotFleetRequestsRequest()
		input.setSpotFleetRequestIds(this.spotFleetRequestIds)
		input.setTerminateInstances(this.terminateInstances)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.cancelSpotFleetRequests(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 cancel-spot-fleet-requests")
				.argument("spot-fleet-request-ids", spotFleetRequestIds.toString())
				.option("terminate-instances", terminateInstances ?: false)
	}

}


fun AmazonEC2Functions.cancelSpotInstanceRequests(spotInstanceRequestIds: List<String>, init: AmazonEC2CancelSpotInstanceRequestsCommand.() -> Unit) {
	this.block.declare(AmazonEC2CancelSpotInstanceRequestsCommand(spotInstanceRequestIds).apply(init))
}

@Generated
class AmazonEC2CancelSpotInstanceRequestsCommand(val spotInstanceRequestIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsRequest {
		val input = com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsRequest()
		input.setSpotInstanceRequestIds(this.spotInstanceRequestIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.cancelSpotInstanceRequests(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 cancel-spot-instance-requests")
				.argument("spot-instance-request-ids", spotInstanceRequestIds.toString())
	}

}


fun AmazonEC2Functions.confirmProductInstance(instanceId: String, productCode: String, init: AmazonEC2ConfirmProductInstanceCommand.() -> Unit) {
	this.block.declare(AmazonEC2ConfirmProductInstanceCommand(instanceId, productCode).apply(init))
}

@Generated
class AmazonEC2ConfirmProductInstanceCommand(val instanceId: String, val productCode: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ConfirmProductInstanceRequest> {



	override fun build(): com.amazonaws.services.ec2.model.ConfirmProductInstanceRequest {
		val input = com.amazonaws.services.ec2.model.ConfirmProductInstanceRequest()
		input.setInstanceId(this.instanceId)
		input.setProductCode(this.productCode)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.confirmProductInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 confirm-product-instance")
				.argument("instance-id", instanceId)
				.argument("product-code", productCode)
	}

}


fun AmazonEC2Functions.copyFpgaImage(sourceFpgaImageId: String, sourceRegion: String, init: AmazonEC2CopyFpgaImageCommand.() -> Unit) {
	this.block.declare(AmazonEC2CopyFpgaImageCommand(sourceFpgaImageId, sourceRegion).apply(init))
}

@Generated
class AmazonEC2CopyFpgaImageCommand(val sourceFpgaImageId: String, val sourceRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CopyFpgaImageRequest> {

	var description: String? = null
	var name: String? = null
	var clientToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CopyFpgaImageRequest {
		val input = com.amazonaws.services.ec2.model.CopyFpgaImageRequest()
		input.setSourceFpgaImageId(this.sourceFpgaImageId)
		input.setDescription(this.description)
		input.setName(this.name)
		input.setSourceRegion(this.sourceRegion)
		input.setClientToken(this.clientToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.copyFpgaImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 copy-fpga-image")
				.argument("source-fpga-image-id", sourceFpgaImageId)
				.argument("description", description)
				.argument("name", name)
				.argument("source-region", sourceRegion)
				.argument("client-token", clientToken)
	}

}


fun AmazonEC2Functions.copyImage(name: String, sourceImageId: String, sourceRegion: String, init: AmazonEC2CopyImageCommand.() -> Unit) {
	this.block.declare(AmazonEC2CopyImageCommand(name, sourceImageId, sourceRegion).apply(init))
}

@Generated
class AmazonEC2CopyImageCommand(val name: String, val sourceImageId: String, val sourceRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CopyImageRequest> {

	var clientToken: String? = null
	var description: String? = null
	var encrypted: Boolean? = false
	var kmsKeyId: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CopyImageRequest {
		val input = com.amazonaws.services.ec2.model.CopyImageRequest()
		input.setClientToken(this.clientToken)
		input.setDescription(this.description)
		input.setEncrypted(this.encrypted)
		input.setKmsKeyId(this.kmsKeyId)
		input.setName(this.name)
		input.setSourceImageId(this.sourceImageId)
		input.setSourceRegion(this.sourceRegion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.copyImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 copy-image")
				.argument("client-token", clientToken)
				.argument("description", description)
				.option("encrypted", encrypted ?: false)
				.argument("kms-key-id", kmsKeyId)
				.argument("name", name)
				.argument("source-image-id", sourceImageId)
				.argument("source-region", sourceRegion)
	}

}


fun AmazonEC2Functions.copySnapshot(sourceRegion: String, sourceSnapshotId: String, init: AmazonEC2CopySnapshotCommand.() -> Unit) {
	this.block.declare(AmazonEC2CopySnapshotCommand(sourceRegion, sourceSnapshotId).apply(init))
}

@Generated
class AmazonEC2CopySnapshotCommand(val sourceRegion: String, val sourceSnapshotId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CopySnapshotRequest> {

	var description: String? = null
	var destinationRegion: String? = null
	var encrypted: Boolean? = false
	var kmsKeyId: String? = null
	var presignedUrl: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CopySnapshotRequest {
		val input = com.amazonaws.services.ec2.model.CopySnapshotRequest()
		input.setDescription(this.description)
		input.setDestinationRegion(this.destinationRegion)
		input.setEncrypted(this.encrypted)
		input.setKmsKeyId(this.kmsKeyId)
		input.setPresignedUrl(this.presignedUrl)
		input.setSourceRegion(this.sourceRegion)
		input.setSourceSnapshotId(this.sourceSnapshotId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.copySnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 copy-snapshot")
				.argument("description", description)
				.argument("destination-region", destinationRegion)
				.option("encrypted", encrypted ?: false)
				.argument("kms-key-id", kmsKeyId)
				.argument("presigned-url", presignedUrl)
				.argument("source-region", sourceRegion)
				.argument("source-snapshot-id", sourceSnapshotId)
	}

}


fun AmazonEC2Functions.createCustomerGateway(bgpAsn: Int, publicIp: String, type: GatewayType, init: AmazonEC2CreateCustomerGatewayCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateCustomerGatewayCommand(bgpAsn, publicIp, type).apply(init))
}

@Generated
class AmazonEC2CreateCustomerGatewayCommand(val bgpAsn: Int, val publicIp: String, val type: GatewayType) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateCustomerGatewayRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CreateCustomerGatewayRequest {
		val input = com.amazonaws.services.ec2.model.CreateCustomerGatewayRequest()
		input.setBgpAsn(this.bgpAsn)
		input.setPublicIp(this.publicIp)
		input.setType(this.type.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createCustomerGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-customer-gateway")
				.argument("bgp-asn", bgpAsn.toString())
				.argument("public-ip", publicIp)
				.argument("type", type.toString())
	}

}


fun AmazonEC2Functions.createDefaultSubnet(availabilityZone: String, init: AmazonEC2CreateDefaultSubnetCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateDefaultSubnetCommand(availabilityZone).apply(init))
}

@Generated
class AmazonEC2CreateDefaultSubnetCommand(val availabilityZone: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateDefaultSubnetRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CreateDefaultSubnetRequest {
		val input = com.amazonaws.services.ec2.model.CreateDefaultSubnetRequest()
		input.setAvailabilityZone(this.availabilityZone)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createDefaultSubnet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-default-subnet")
				.argument("availability-zone", availabilityZone)
	}

}


fun AmazonEC2Functions.createDefaultVpc(init: AmazonEC2CreateDefaultVpcCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateDefaultVpcCommand().apply(init))
}

@Generated
class AmazonEC2CreateDefaultVpcCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateDefaultVpcRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CreateDefaultVpcRequest {
		val input = com.amazonaws.services.ec2.model.CreateDefaultVpcRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createDefaultVpc(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-default-vpc")

	}

}


fun AmazonEC2Functions.createDhcpOptions(dhcpConfigurations: List<com.amazonaws.services.ec2.model.DhcpConfiguration>, init: AmazonEC2CreateDhcpOptionsCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateDhcpOptionsCommand(dhcpConfigurations).apply(init))
}

@Generated
class AmazonEC2CreateDhcpOptionsCommand(val dhcpConfigurations: List<com.amazonaws.services.ec2.model.DhcpConfiguration>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateDhcpOptionsRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CreateDhcpOptionsRequest {
		val input = com.amazonaws.services.ec2.model.CreateDhcpOptionsRequest()
		input.setDhcpConfigurations(this.dhcpConfigurations)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createDhcpOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-dhcp-options")
				.argument("dhcp-configurations", dhcpConfigurations.toString())
	}

}


fun AmazonEC2Functions.createEgressOnlyInternetGateway(vpcId: String, init: AmazonEC2CreateEgressOnlyInternetGatewayCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateEgressOnlyInternetGatewayCommand(vpcId).apply(init))
}

@Generated
class AmazonEC2CreateEgressOnlyInternetGatewayCommand(val vpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayRequest> {

	var clientToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayRequest {
		val input = com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayRequest()
		input.setClientToken(this.clientToken)
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createEgressOnlyInternetGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-egress-only-internet-gateway")
				.argument("client-token", clientToken)
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.createFlowLogs(deliverLogsPermissionArn: String, logGroupName: String, resourceIds: List<String>, resourceType: FlowLogsResourceType, trafficType: TrafficType, init: AmazonEC2CreateFlowLogsCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateFlowLogsCommand(deliverLogsPermissionArn, logGroupName, resourceIds, resourceType, trafficType).apply(init))
}

@Generated
class AmazonEC2CreateFlowLogsCommand(val deliverLogsPermissionArn: String, val logGroupName: String, val resourceIds: List<String>, val resourceType: FlowLogsResourceType, val trafficType: TrafficType) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateFlowLogsRequest> {

	var clientToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateFlowLogsRequest {
		val input = com.amazonaws.services.ec2.model.CreateFlowLogsRequest()
		input.setClientToken(this.clientToken)
		input.setDeliverLogsPermissionArn(this.deliverLogsPermissionArn)
		input.setLogGroupName(this.logGroupName)
		input.setResourceIds(this.resourceIds)
		input.setResourceType(this.resourceType.toString())
		input.setTrafficType(this.trafficType.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createFlowLogs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-flow-logs")
				.argument("client-token", clientToken)
				.argument("deliver-logs-permission-arn", deliverLogsPermissionArn)
				.argument("log-group-name", logGroupName)
				.argument("resource-ids", resourceIds.toString())
				.argument("resource-type", resourceType.toString())
				.argument("traffic-type", trafficType.toString())
	}

}


fun AmazonEC2Functions.createFpgaImage(inputStorageLocation: com.amazonaws.services.ec2.model.StorageLocation, init: AmazonEC2CreateFpgaImageCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateFpgaImageCommand(inputStorageLocation).apply(init))
}

@Generated
class AmazonEC2CreateFpgaImageCommand(val inputStorageLocation: com.amazonaws.services.ec2.model.StorageLocation) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateFpgaImageRequest> {

	var logsStorageLocation: com.amazonaws.services.ec2.model.StorageLocation? = null
	var description: String? = null
	var name: String? = null
	var clientToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateFpgaImageRequest {
		val input = com.amazonaws.services.ec2.model.CreateFpgaImageRequest()
		input.setInputStorageLocation(this.inputStorageLocation)
		input.setLogsStorageLocation(this.logsStorageLocation)
		input.setDescription(this.description)
		input.setName(this.name)
		input.setClientToken(this.clientToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createFpgaImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-fpga-image")
				.argument("input-storage-location", inputStorageLocation.toString())
				.argument("logs-storage-location", logsStorageLocation?.toString())
				.argument("description", description)
				.argument("name", name)
				.argument("client-token", clientToken)
	}

}


fun AmazonEC2Functions.createImage(instanceId: String, name: String, init: AmazonEC2CreateImageCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateImageCommand(instanceId, name).apply(init))
}

@Generated
class AmazonEC2CreateImageCommand(val instanceId: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateImageRequest> {

	var blockDeviceMappings: List<com.amazonaws.services.ec2.model.BlockDeviceMapping>? = null
	var description: String? = null
	var noReboot: Boolean? = false

	override fun build(): com.amazonaws.services.ec2.model.CreateImageRequest {
		val input = com.amazonaws.services.ec2.model.CreateImageRequest()
		input.setBlockDeviceMappings(this.blockDeviceMappings)
		input.setDescription(this.description)
		input.setInstanceId(this.instanceId)
		input.setName(this.name)
		input.setNoReboot(this.noReboot)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-image")
				.argument("block-device-mappings", blockDeviceMappings?.toString())
				.argument("description", description)
				.argument("instance-id", instanceId)
				.argument("name", name)
				.option("no-reboot", noReboot ?: false)
	}

}


fun AmazonEC2Functions.createInstanceExportTask(instanceId: String, init: AmazonEC2CreateInstanceExportTaskCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateInstanceExportTaskCommand(instanceId).apply(init))
}

@Generated
class AmazonEC2CreateInstanceExportTaskCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateInstanceExportTaskRequest> {

	var description: String? = null
	var exportToS3Task: com.amazonaws.services.ec2.model.ExportToS3TaskSpecification? = null
	var targetEnvironment: ExportEnvironment? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateInstanceExportTaskRequest {
		val input = com.amazonaws.services.ec2.model.CreateInstanceExportTaskRequest()
		input.setDescription(this.description)
		input.setExportToS3Task(this.exportToS3Task)
		input.setInstanceId(this.instanceId)
		input.setTargetEnvironment(this.targetEnvironment?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createInstanceExportTask(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-instance-export-task")
				.argument("description", description)
				.argument("export-to-s3-task", exportToS3Task?.toString())
				.argument("instance-id", instanceId)
				.argument("target-environment", targetEnvironment?.toString())
	}

}


fun AmazonEC2Functions.createInternetGateway(init: AmazonEC2CreateInternetGatewayCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateInternetGatewayCommand().apply(init))
}

@Generated
class AmazonEC2CreateInternetGatewayCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateInternetGatewayRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CreateInternetGatewayRequest {
		val input = com.amazonaws.services.ec2.model.CreateInternetGatewayRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createInternetGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-internet-gateway")

	}

}


fun AmazonEC2Functions.createKeyPair(keyName: String, init: AmazonEC2CreateKeyPairCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateKeyPairCommand(keyName).apply(init))
}

@Generated
class AmazonEC2CreateKeyPairCommand(val keyName: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateKeyPairRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CreateKeyPairRequest {
		val input = com.amazonaws.services.ec2.model.CreateKeyPairRequest()
		input.setKeyName(this.keyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createKeyPair(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-key-pair")
				.argument("key-name", keyName)
	}

}


fun AmazonEC2Functions.createLaunchTemplate(launchTemplateName: String, launchTemplateData: com.amazonaws.services.ec2.model.RequestLaunchTemplateData, init: AmazonEC2CreateLaunchTemplateCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateLaunchTemplateCommand(launchTemplateName, launchTemplateData).apply(init))
}

@Generated
class AmazonEC2CreateLaunchTemplateCommand(val launchTemplateName: String, val launchTemplateData: com.amazonaws.services.ec2.model.RequestLaunchTemplateData) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateLaunchTemplateRequest> {

	var clientToken: String? = null
	var versionDescription: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateLaunchTemplateRequest {
		val input = com.amazonaws.services.ec2.model.CreateLaunchTemplateRequest()
		input.setClientToken(this.clientToken)
		input.setLaunchTemplateName(this.launchTemplateName)
		input.setVersionDescription(this.versionDescription)
		input.setLaunchTemplateData(this.launchTemplateData)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createLaunchTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-launch-template")
				.argument("client-token", clientToken)
				.argument("launch-template-name", launchTemplateName)
				.argument("version-description", versionDescription)
				.argument("launch-template-data", launchTemplateData.toString())
	}

}


fun AmazonEC2Functions.createLaunchTemplateVersion(launchTemplateData: com.amazonaws.services.ec2.model.RequestLaunchTemplateData, init: AmazonEC2CreateLaunchTemplateVersionCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateLaunchTemplateVersionCommand(launchTemplateData).apply(init))
}

@Generated
class AmazonEC2CreateLaunchTemplateVersionCommand(val launchTemplateData: com.amazonaws.services.ec2.model.RequestLaunchTemplateData) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionRequest> {

	var clientToken: String? = null
	var launchTemplateId: String? = null
	var launchTemplateName: String? = null
	var sourceVersion: String? = null
	var versionDescription: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionRequest {
		val input = com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionRequest()
		input.setClientToken(this.clientToken)
		input.setLaunchTemplateId(this.launchTemplateId)
		input.setLaunchTemplateName(this.launchTemplateName)
		input.setSourceVersion(this.sourceVersion)
		input.setVersionDescription(this.versionDescription)
		input.setLaunchTemplateData(this.launchTemplateData)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createLaunchTemplateVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-launch-template-version")
				.argument("client-token", clientToken)
				.argument("launch-template-id", launchTemplateId)
				.argument("launch-template-name", launchTemplateName)
				.argument("source-version", sourceVersion)
				.argument("version-description", versionDescription)
				.argument("launch-template-data", launchTemplateData.toString())
	}

}


fun AmazonEC2Functions.createNatGateway(allocationId: String, subnetId: String, init: AmazonEC2CreateNatGatewayCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateNatGatewayCommand(allocationId, subnetId).apply(init))
}

@Generated
class AmazonEC2CreateNatGatewayCommand(val allocationId: String, val subnetId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateNatGatewayRequest> {

	var clientToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateNatGatewayRequest {
		val input = com.amazonaws.services.ec2.model.CreateNatGatewayRequest()
		input.setAllocationId(this.allocationId)
		input.setClientToken(this.clientToken)
		input.setSubnetId(this.subnetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createNatGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-nat-gateway")
				.argument("allocation-id", allocationId)
				.argument("client-token", clientToken)
				.argument("subnet-id", subnetId)
	}

}


fun AmazonEC2Functions.createNetworkAcl(vpcId: String, init: AmazonEC2CreateNetworkAclCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateNetworkAclCommand(vpcId).apply(init))
}

@Generated
class AmazonEC2CreateNetworkAclCommand(val vpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateNetworkAclRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CreateNetworkAclRequest {
		val input = com.amazonaws.services.ec2.model.CreateNetworkAclRequest()
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createNetworkAcl(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-network-acl")
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.createNetworkAclEntry(egress: Boolean, networkAclId: String, protocol: String, ruleAction: RuleAction, ruleNumber: Int, init: AmazonEC2CreateNetworkAclEntryCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateNetworkAclEntryCommand(egress, networkAclId, protocol, ruleAction, ruleNumber).apply(init))
}

@Generated
class AmazonEC2CreateNetworkAclEntryCommand(val egress: Boolean, val networkAclId: String, val protocol: String, val ruleAction: RuleAction, val ruleNumber: Int) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateNetworkAclEntryRequest> {

	var cidrBlock: String? = null
	var icmpTypeCode: com.amazonaws.services.ec2.model.IcmpTypeCode? = null
	var ipv6CidrBlock: String? = null
	var portRange: com.amazonaws.services.ec2.model.PortRange? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateNetworkAclEntryRequest {
		val input = com.amazonaws.services.ec2.model.CreateNetworkAclEntryRequest()
		input.setCidrBlock(this.cidrBlock)
		input.setEgress(this.egress)
		input.setIcmpTypeCode(this.icmpTypeCode)
		input.setIpv6CidrBlock(this.ipv6CidrBlock)
		input.setNetworkAclId(this.networkAclId)
		input.setPortRange(this.portRange)
		input.setProtocol(this.protocol)
		input.setRuleAction(this.ruleAction.toString())
		input.setRuleNumber(this.ruleNumber)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createNetworkAclEntry(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-network-acl-entry")
				.argument("cidr-block", cidrBlock)
				.option("egress", egress ?: false)
				.argument("icmp-type-code", icmpTypeCode?.toString())
				.argument("ipv6-cidr-block", ipv6CidrBlock)
				.argument("network-acl-id", networkAclId)
				.argument("port-range", portRange?.toString())
				.argument("protocol", protocol)
				.argument("rule-action", ruleAction.toString())
				.argument("rule-number", ruleNumber.toString())
	}

}


fun AmazonEC2Functions.createNetworkInterface(subnetId: String, init: AmazonEC2CreateNetworkInterfaceCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateNetworkInterfaceCommand(subnetId).apply(init))
}

@Generated
class AmazonEC2CreateNetworkInterfaceCommand(val subnetId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateNetworkInterfaceRequest> {

	var description: String? = null
	var groups: List<String>? = null
	var ipv6AddressCount: Int? = 0
	var ipv6Addresses: List<com.amazonaws.services.ec2.model.InstanceIpv6Address>? = null
	var privateIpAddress: String? = null
	var privateIpAddresses: List<com.amazonaws.services.ec2.model.PrivateIpAddressSpecification>? = null
	var secondaryPrivateIpAddressCount: Int? = 0

	override fun build(): com.amazonaws.services.ec2.model.CreateNetworkInterfaceRequest {
		val input = com.amazonaws.services.ec2.model.CreateNetworkInterfaceRequest()
		input.setDescription(this.description)
		input.setGroups(this.groups)
		input.setIpv6AddressCount(this.ipv6AddressCount)
		input.setIpv6Addresses(this.ipv6Addresses)
		input.setPrivateIpAddress(this.privateIpAddress)
		input.setPrivateIpAddresses(this.privateIpAddresses)
		input.setSecondaryPrivateIpAddressCount(this.secondaryPrivateIpAddressCount)
		input.setSubnetId(this.subnetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createNetworkInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-network-interface")
				.argument("description", description)
				.argument("groups", groups?.toString())
				.argument("ipv6-address-count", ipv6AddressCount?.toString())
				.argument("ipv6-addresses", ipv6Addresses?.toString())
				.argument("private-ip-address", privateIpAddress)
				.argument("private-ip-addresses", privateIpAddresses?.toString())
				.argument("secondary-private-ip-address-count", secondaryPrivateIpAddressCount?.toString())
				.argument("subnet-id", subnetId)
	}

}


fun AmazonEC2Functions.createNetworkInterfacePermission(networkInterfaceId: String, permission: InterfacePermissionType, init: AmazonEC2CreateNetworkInterfacePermissionCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateNetworkInterfacePermissionCommand(networkInterfaceId, permission).apply(init))
}

@Generated
class AmazonEC2CreateNetworkInterfacePermissionCommand(val networkInterfaceId: String, val permission: InterfacePermissionType) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionRequest> {

	var awsAccountId: String? = null
	var awsService: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionRequest {
		val input = com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionRequest()
		input.setNetworkInterfaceId(this.networkInterfaceId)
		input.setAwsAccountId(this.awsAccountId)
		input.setAwsService(this.awsService)
		input.setPermission(this.permission.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createNetworkInterfacePermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-network-interface-permission")
				.argument("network-interface-id", networkInterfaceId)
				.argument("aws-account-id", awsAccountId)
				.argument("aws-service", awsService)
				.argument("permission", permission.toString())
	}

}


fun AmazonEC2Functions.createPlacementGroup(groupName: String, strategy: PlacementStrategy, init: AmazonEC2CreatePlacementGroupCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreatePlacementGroupCommand(groupName, strategy).apply(init))
}

@Generated
class AmazonEC2CreatePlacementGroupCommand(val groupName: String, val strategy: PlacementStrategy) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreatePlacementGroupRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CreatePlacementGroupRequest {
		val input = com.amazonaws.services.ec2.model.CreatePlacementGroupRequest()
		input.setGroupName(this.groupName)
		input.setStrategy(this.strategy.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createPlacementGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-placement-group")
				.argument("group-name", groupName)
				.argument("strategy", strategy.toString())
	}

}


fun AmazonEC2Functions.createReservedInstancesListing(clientToken: String, instanceCount: Int, priceSchedules: List<com.amazonaws.services.ec2.model.PriceScheduleSpecification>, reservedInstancesId: String, init: AmazonEC2CreateReservedInstancesListingCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateReservedInstancesListingCommand(clientToken, instanceCount, priceSchedules, reservedInstancesId).apply(init))
}

@Generated
class AmazonEC2CreateReservedInstancesListingCommand(val clientToken: String, val instanceCount: Int, val priceSchedules: List<com.amazonaws.services.ec2.model.PriceScheduleSpecification>, val reservedInstancesId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateReservedInstancesListingRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CreateReservedInstancesListingRequest {
		val input = com.amazonaws.services.ec2.model.CreateReservedInstancesListingRequest()
		input.setClientToken(this.clientToken)
		input.setInstanceCount(this.instanceCount)
		input.setPriceSchedules(this.priceSchedules)
		input.setReservedInstancesId(this.reservedInstancesId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createReservedInstancesListing(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-reserved-instances-listing")
				.argument("client-token", clientToken)
				.argument("instance-count", instanceCount.toString())
				.argument("price-schedules", priceSchedules.toString())
				.argument("reserved-instances-id", reservedInstancesId)
	}

}


fun AmazonEC2Functions.createRoute(routeTableId: String, init: AmazonEC2CreateRouteCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateRouteCommand(routeTableId).apply(init))
}

@Generated
class AmazonEC2CreateRouteCommand(val routeTableId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateRouteRequest> {

	var destinationCidrBlock: String? = null
	var destinationIpv6CidrBlock: String? = null
	var egressOnlyInternetGatewayId: String? = null
	var gatewayId: String? = null
	var instanceId: String? = null
	var natGatewayId: String? = null
	var networkInterfaceId: String? = null
	var vpcPeeringConnectionId: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateRouteRequest {
		val input = com.amazonaws.services.ec2.model.CreateRouteRequest()
		input.setDestinationCidrBlock(this.destinationCidrBlock)
		input.setDestinationIpv6CidrBlock(this.destinationIpv6CidrBlock)
		input.setEgressOnlyInternetGatewayId(this.egressOnlyInternetGatewayId)
		input.setGatewayId(this.gatewayId)
		input.setInstanceId(this.instanceId)
		input.setNatGatewayId(this.natGatewayId)
		input.setNetworkInterfaceId(this.networkInterfaceId)
		input.setRouteTableId(this.routeTableId)
		input.setVpcPeeringConnectionId(this.vpcPeeringConnectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createRoute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-route")
				.argument("destination-cidr-block", destinationCidrBlock)
				.argument("destination-ipv6-cidr-block", destinationIpv6CidrBlock)
				.argument("egress-only-internet-gateway-id", egressOnlyInternetGatewayId)
				.argument("gateway-id", gatewayId)
				.argument("instance-id", instanceId)
				.argument("nat-gateway-id", natGatewayId)
				.argument("network-interface-id", networkInterfaceId)
				.argument("route-table-id", routeTableId)
				.argument("vpc-peering-connection-id", vpcPeeringConnectionId)
	}

}


fun AmazonEC2Functions.createRouteTable(vpcId: String, init: AmazonEC2CreateRouteTableCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateRouteTableCommand(vpcId).apply(init))
}

@Generated
class AmazonEC2CreateRouteTableCommand(val vpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateRouteTableRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CreateRouteTableRequest {
		val input = com.amazonaws.services.ec2.model.CreateRouteTableRequest()
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createRouteTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-route-table")
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.createSecurityGroup(description: String, groupName: String, init: AmazonEC2CreateSecurityGroupCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateSecurityGroupCommand(description, groupName).apply(init))
}

@Generated
class AmazonEC2CreateSecurityGroupCommand(val description: String, val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateSecurityGroupRequest> {

	var vpcId: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateSecurityGroupRequest {
		val input = com.amazonaws.services.ec2.model.CreateSecurityGroupRequest()
		input.setDescription(this.description)
		input.setGroupName(this.groupName)
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-security-group")
				.argument("description", description)
				.argument("group-name", groupName)
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.createSnapshot(volumeId: String, init: AmazonEC2CreateSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateSnapshotCommand(volumeId).apply(init))
}

@Generated
class AmazonEC2CreateSnapshotCommand(val volumeId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateSnapshotRequest> {

	var description: String? = null
	var tagSpecifications: List<com.amazonaws.services.ec2.model.TagSpecification>? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateSnapshotRequest {
		val input = com.amazonaws.services.ec2.model.CreateSnapshotRequest()
		input.setDescription(this.description)
		input.setVolumeId(this.volumeId)
		input.setTagSpecifications(this.tagSpecifications)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-snapshot")
				.argument("description", description)
				.argument("volume-id", volumeId)
				.argument("tag-specifications", tagSpecifications?.toString())
	}

}


fun AmazonEC2Functions.createSpotDatafeedSubscription(bucket: String, init: AmazonEC2CreateSpotDatafeedSubscriptionCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateSpotDatafeedSubscriptionCommand(bucket).apply(init))
}

@Generated
class AmazonEC2CreateSpotDatafeedSubscriptionCommand(val bucket: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionRequest> {

	var prefix: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionRequest {
		val input = com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionRequest()
		input.setBucket(this.bucket)
		input.setPrefix(this.prefix)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createSpotDatafeedSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-spot-datafeed-subscription")
				.argument("bucket", bucket)
				.argument("prefix", prefix)
	}

}


fun AmazonEC2Functions.createSubnet(cidrBlock: String, vpcId: String, init: AmazonEC2CreateSubnetCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateSubnetCommand(cidrBlock, vpcId).apply(init))
}

@Generated
class AmazonEC2CreateSubnetCommand(val cidrBlock: String, val vpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateSubnetRequest> {

	var availabilityZone: String? = null
	var ipv6CidrBlock: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateSubnetRequest {
		val input = com.amazonaws.services.ec2.model.CreateSubnetRequest()
		input.setAvailabilityZone(this.availabilityZone)
		input.setCidrBlock(this.cidrBlock)
		input.setIpv6CidrBlock(this.ipv6CidrBlock)
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createSubnet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-subnet")
				.argument("availability-zone", availabilityZone)
				.argument("cidr-block", cidrBlock)
				.argument("ipv6-cidr-block", ipv6CidrBlock)
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.createTags(resources: List<String>, tags: List<com.amazonaws.services.ec2.model.Tag>, init: AmazonEC2CreateTagsCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateTagsCommand(resources, tags).apply(init))
}

@Generated
class AmazonEC2CreateTagsCommand(val resources: List<String>, val tags: List<com.amazonaws.services.ec2.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateTagsRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CreateTagsRequest {
		val input = com.amazonaws.services.ec2.model.CreateTagsRequest()
		input.setResources(this.resources)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-tags")
				.argument("resources", resources.toString())
				.argument("tags", tags.toString())
	}

}


fun AmazonEC2Functions.createVolume(availabilityZone: String, init: AmazonEC2CreateVolumeCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateVolumeCommand(availabilityZone).apply(init))
}

@Generated
class AmazonEC2CreateVolumeCommand(val availabilityZone: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateVolumeRequest> {

	var encrypted: Boolean? = false
	var iops: Int? = 0
	var kmsKeyId: String? = null
	var size: Int? = 0
	var snapshotId: String? = null
	var volumeType: VolumeType? = null
	var tagSpecifications: List<com.amazonaws.services.ec2.model.TagSpecification>? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateVolumeRequest {
		val input = com.amazonaws.services.ec2.model.CreateVolumeRequest()
		input.setAvailabilityZone(this.availabilityZone)
		input.setEncrypted(this.encrypted)
		input.setIops(this.iops)
		input.setKmsKeyId(this.kmsKeyId)
		input.setSize(this.size)
		input.setSnapshotId(this.snapshotId)
		input.setVolumeType(this.volumeType?.toString())
		input.setTagSpecifications(this.tagSpecifications)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-volume")
				.argument("availability-zone", availabilityZone)
				.option("encrypted", encrypted ?: false)
				.argument("iops", iops?.toString())
				.argument("kms-key-id", kmsKeyId)
				.argument("size", size?.toString())
				.argument("snapshot-id", snapshotId)
				.argument("volume-type", volumeType?.toString())
				.argument("tag-specifications", tagSpecifications?.toString())
	}

}


fun AmazonEC2Functions.createVpc(cidrBlock: String, init: AmazonEC2CreateVpcCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateVpcCommand(cidrBlock).apply(init))
}

@Generated
class AmazonEC2CreateVpcCommand(val cidrBlock: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateVpcRequest> {

	var amazonProvidedIpv6CidrBlock: Boolean? = false
	var instanceTenancy: Tenancy? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateVpcRequest {
		val input = com.amazonaws.services.ec2.model.CreateVpcRequest()
		input.setCidrBlock(this.cidrBlock)
		input.setAmazonProvidedIpv6CidrBlock(this.amazonProvidedIpv6CidrBlock)
		input.setInstanceTenancy(this.instanceTenancy?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createVpc(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-vpc")
				.argument("cidr-block", cidrBlock)
				.option("amazon-provided-ipv6-cidr-block", amazonProvidedIpv6CidrBlock ?: false)
				.argument("instance-tenancy", instanceTenancy?.toString())
	}

}


fun AmazonEC2Functions.createVpcEndpoint(vpcId: String, serviceName: String, init: AmazonEC2CreateVpcEndpointCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateVpcEndpointCommand(vpcId, serviceName).apply(init))
}

@Generated
class AmazonEC2CreateVpcEndpointCommand(val vpcId: String, val serviceName: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateVpcEndpointRequest> {

	var vpcEndpointType: VpcEndpointType? = null
	var policyDocument: String? = null
	var routeTableIds: List<String>? = null
	var subnetIds: List<String>? = null
	var securityGroupIds: List<String>? = null
	var clientToken: String? = null
	var privateDnsEnabled: Boolean? = false

	override fun build(): com.amazonaws.services.ec2.model.CreateVpcEndpointRequest {
		val input = com.amazonaws.services.ec2.model.CreateVpcEndpointRequest()
		input.setVpcEndpointType(this.vpcEndpointType?.toString())
		input.setVpcId(this.vpcId)
		input.setServiceName(this.serviceName)
		input.setPolicyDocument(this.policyDocument)
		input.setRouteTableIds(this.routeTableIds)
		input.setSubnetIds(this.subnetIds)
		input.setSecurityGroupIds(this.securityGroupIds)
		input.setClientToken(this.clientToken)
		input.setPrivateDnsEnabled(this.privateDnsEnabled)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createVpcEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-vpc-endpoint")
				.argument("vpc-endpoint-type", vpcEndpointType?.toString())
				.argument("vpc-id", vpcId)
				.argument("service-name", serviceName)
				.argument("policy-document", policyDocument)
				.argument("route-table-ids", routeTableIds?.toString())
				.argument("subnet-ids", subnetIds?.toString())
				.argument("security-group-ids", securityGroupIds?.toString())
				.argument("client-token", clientToken)
				.option("private-dns-enabled", privateDnsEnabled ?: false)
	}

}


fun AmazonEC2Functions.createVpcEndpointConnectionNotification(connectionNotificationArn: String, connectionEvents: List<String>, init: AmazonEC2CreateVpcEndpointConnectionNotificationCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateVpcEndpointConnectionNotificationCommand(connectionNotificationArn, connectionEvents).apply(init))
}

@Generated
class AmazonEC2CreateVpcEndpointConnectionNotificationCommand(val connectionNotificationArn: String, val connectionEvents: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest> {

	var serviceId: String? = null
	var vpcEndpointId: String? = null
	var clientToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest {
		val input = com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest()
		input.setServiceId(this.serviceId)
		input.setVpcEndpointId(this.vpcEndpointId)
		input.setConnectionNotificationArn(this.connectionNotificationArn)
		input.setConnectionEvents(this.connectionEvents)
		input.setClientToken(this.clientToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createVpcEndpointConnectionNotification(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-vpc-endpoint-connection-notification")
				.argument("service-id", serviceId)
				.argument("vpc-endpoint-id", vpcEndpointId)
				.argument("connection-notification-arn", connectionNotificationArn)
				.argument("connection-events", connectionEvents.toString())
				.argument("client-token", clientToken)
	}

}


fun AmazonEC2Functions.createVpcEndpointServiceConfiguration(networkLoadBalancerArns: List<String>, init: AmazonEC2CreateVpcEndpointServiceConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateVpcEndpointServiceConfigurationCommand(networkLoadBalancerArns).apply(init))
}

@Generated
class AmazonEC2CreateVpcEndpointServiceConfigurationCommand(val networkLoadBalancerArns: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationRequest> {

	var acceptanceRequired: Boolean? = false
	var clientToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationRequest {
		val input = com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationRequest()
		input.setAcceptanceRequired(this.acceptanceRequired)
		input.setNetworkLoadBalancerArns(this.networkLoadBalancerArns)
		input.setClientToken(this.clientToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createVpcEndpointServiceConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-vpc-endpoint-service-configuration")
				.option("acceptance-required", acceptanceRequired ?: false)
				.argument("network-load-balancer-arns", networkLoadBalancerArns.toString())
				.argument("client-token", clientToken)
	}

}


fun AmazonEC2Functions.createVpcPeeringConnection(init: AmazonEC2CreateVpcPeeringConnectionCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateVpcPeeringConnectionCommand().apply(init))
}

@Generated
class AmazonEC2CreateVpcPeeringConnectionCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionRequest> {

	var peerOwnerId: String? = null
	var peerVpcId: String? = null
	var vpcId: String? = null
	var peerRegion: String? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionRequest {
		val input = com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionRequest()
		input.setPeerOwnerId(this.peerOwnerId)
		input.setPeerVpcId(this.peerVpcId)
		input.setVpcId(this.vpcId)
		input.setPeerRegion(this.peerRegion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createVpcPeeringConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-vpc-peering-connection")
				.argument("peer-owner-id", peerOwnerId)
				.argument("peer-vpc-id", peerVpcId)
				.argument("vpc-id", vpcId)
				.argument("peer-region", peerRegion)
	}

}


fun AmazonEC2Functions.createVpnConnection(customerGatewayId: String, type: String, vpnGatewayId: String, init: AmazonEC2CreateVpnConnectionCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateVpnConnectionCommand(customerGatewayId, type, vpnGatewayId).apply(init))
}

@Generated
class AmazonEC2CreateVpnConnectionCommand(val customerGatewayId: String, val type: String, val vpnGatewayId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateVpnConnectionRequest> {

	var options: com.amazonaws.services.ec2.model.VpnConnectionOptionsSpecification? = null

	override fun build(): com.amazonaws.services.ec2.model.CreateVpnConnectionRequest {
		val input = com.amazonaws.services.ec2.model.CreateVpnConnectionRequest()
		input.setCustomerGatewayId(this.customerGatewayId)
		input.setType(this.type)
		input.setVpnGatewayId(this.vpnGatewayId)
		input.setOptions(this.options)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createVpnConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-vpn-connection")
				.argument("customer-gateway-id", customerGatewayId)
				.argument("type", type)
				.argument("vpn-gateway-id", vpnGatewayId)
				.argument("options", options?.toString())
	}

}


fun AmazonEC2Functions.createVpnConnectionRoute(destinationCidrBlock: String, vpnConnectionId: String, init: AmazonEC2CreateVpnConnectionRouteCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateVpnConnectionRouteCommand(destinationCidrBlock, vpnConnectionId).apply(init))
}

@Generated
class AmazonEC2CreateVpnConnectionRouteCommand(val destinationCidrBlock: String, val vpnConnectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateVpnConnectionRouteRequest> {



	override fun build(): com.amazonaws.services.ec2.model.CreateVpnConnectionRouteRequest {
		val input = com.amazonaws.services.ec2.model.CreateVpnConnectionRouteRequest()
		input.setDestinationCidrBlock(this.destinationCidrBlock)
		input.setVpnConnectionId(this.vpnConnectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createVpnConnectionRoute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-vpn-connection-route")
				.argument("destination-cidr-block", destinationCidrBlock)
				.argument("vpn-connection-id", vpnConnectionId)
	}

}


fun AmazonEC2Functions.createVpnGateway(type: GatewayType, init: AmazonEC2CreateVpnGatewayCommand.() -> Unit) {
	this.block.declare(AmazonEC2CreateVpnGatewayCommand(type).apply(init))
}

@Generated
class AmazonEC2CreateVpnGatewayCommand(val type: GatewayType) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.CreateVpnGatewayRequest> {

	var availabilityZone: String? = null
	var amazonSideAsn: Long? = 0L

	override fun build(): com.amazonaws.services.ec2.model.CreateVpnGatewayRequest {
		val input = com.amazonaws.services.ec2.model.CreateVpnGatewayRequest()
		input.setAvailabilityZone(this.availabilityZone)
		input.setType(this.type.toString())
		input.setAmazonSideAsn(this.amazonSideAsn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.createVpnGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 create-vpn-gateway")
				.argument("availability-zone", availabilityZone)
				.argument("type", type.toString())
				.argument("amazon-side-asn", amazonSideAsn?.toString())
	}

}


fun AmazonEC2Functions.deleteCustomerGateway(customerGatewayId: String, init: AmazonEC2DeleteCustomerGatewayCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteCustomerGatewayCommand(customerGatewayId).apply(init))
}

@Generated
class AmazonEC2DeleteCustomerGatewayCommand(val customerGatewayId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteCustomerGatewayRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteCustomerGatewayRequest {
		val input = com.amazonaws.services.ec2.model.DeleteCustomerGatewayRequest()
		input.setCustomerGatewayId(this.customerGatewayId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteCustomerGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-customer-gateway")
				.argument("customer-gateway-id", customerGatewayId)
	}

}


fun AmazonEC2Functions.deleteDhcpOptions(dhcpOptionsId: String, init: AmazonEC2DeleteDhcpOptionsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteDhcpOptionsCommand(dhcpOptionsId).apply(init))
}

@Generated
class AmazonEC2DeleteDhcpOptionsCommand(val dhcpOptionsId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteDhcpOptionsRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteDhcpOptionsRequest {
		val input = com.amazonaws.services.ec2.model.DeleteDhcpOptionsRequest()
		input.setDhcpOptionsId(this.dhcpOptionsId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteDhcpOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-dhcp-options")
				.argument("dhcp-options-id", dhcpOptionsId)
	}

}


fun AmazonEC2Functions.deleteEgressOnlyInternetGateway(egressOnlyInternetGatewayId: String, init: AmazonEC2DeleteEgressOnlyInternetGatewayCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteEgressOnlyInternetGatewayCommand(egressOnlyInternetGatewayId).apply(init))
}

@Generated
class AmazonEC2DeleteEgressOnlyInternetGatewayCommand(val egressOnlyInternetGatewayId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest {
		val input = com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest()
		input.setEgressOnlyInternetGatewayId(this.egressOnlyInternetGatewayId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteEgressOnlyInternetGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-egress-only-internet-gateway")
				.argument("egress-only-internet-gateway-id", egressOnlyInternetGatewayId)
	}

}


fun AmazonEC2Functions.deleteFlowLogs(flowLogIds: List<String>, init: AmazonEC2DeleteFlowLogsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteFlowLogsCommand(flowLogIds).apply(init))
}

@Generated
class AmazonEC2DeleteFlowLogsCommand(val flowLogIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteFlowLogsRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteFlowLogsRequest {
		val input = com.amazonaws.services.ec2.model.DeleteFlowLogsRequest()
		input.setFlowLogIds(this.flowLogIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteFlowLogs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-flow-logs")
				.argument("flow-log-ids", flowLogIds.toString())
	}

}


fun AmazonEC2Functions.deleteFpgaImage(fpgaImageId: String, init: AmazonEC2DeleteFpgaImageCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteFpgaImageCommand(fpgaImageId).apply(init))
}

@Generated
class AmazonEC2DeleteFpgaImageCommand(val fpgaImageId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteFpgaImageRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteFpgaImageRequest {
		val input = com.amazonaws.services.ec2.model.DeleteFpgaImageRequest()
		input.setFpgaImageId(this.fpgaImageId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteFpgaImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-fpga-image")
				.argument("fpga-image-id", fpgaImageId)
	}

}


fun AmazonEC2Functions.deleteInternetGateway(internetGatewayId: String, init: AmazonEC2DeleteInternetGatewayCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteInternetGatewayCommand(internetGatewayId).apply(init))
}

@Generated
class AmazonEC2DeleteInternetGatewayCommand(val internetGatewayId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteInternetGatewayRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteInternetGatewayRequest {
		val input = com.amazonaws.services.ec2.model.DeleteInternetGatewayRequest()
		input.setInternetGatewayId(this.internetGatewayId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteInternetGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-internet-gateway")
				.argument("internet-gateway-id", internetGatewayId)
	}

}


fun AmazonEC2Functions.deleteKeyPair(keyName: String, init: AmazonEC2DeleteKeyPairCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteKeyPairCommand(keyName).apply(init))
}

@Generated
class AmazonEC2DeleteKeyPairCommand(val keyName: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteKeyPairRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteKeyPairRequest {
		val input = com.amazonaws.services.ec2.model.DeleteKeyPairRequest()
		input.setKeyName(this.keyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteKeyPair(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-key-pair")
				.argument("key-name", keyName)
	}

}


fun AmazonEC2Functions.deleteLaunchTemplate(init: AmazonEC2DeleteLaunchTemplateCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteLaunchTemplateCommand().apply(init))
}

@Generated
class AmazonEC2DeleteLaunchTemplateCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteLaunchTemplateRequest> {

	var launchTemplateId: String? = null
	var launchTemplateName: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DeleteLaunchTemplateRequest {
		val input = com.amazonaws.services.ec2.model.DeleteLaunchTemplateRequest()
		input.setLaunchTemplateId(this.launchTemplateId)
		input.setLaunchTemplateName(this.launchTemplateName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteLaunchTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-launch-template")
				.argument("launch-template-id", launchTemplateId)
				.argument("launch-template-name", launchTemplateName)
	}

}


fun AmazonEC2Functions.deleteLaunchTemplateVersions(versions: List<String>, init: AmazonEC2DeleteLaunchTemplateVersionsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteLaunchTemplateVersionsCommand(versions).apply(init))
}

@Generated
class AmazonEC2DeleteLaunchTemplateVersionsCommand(val versions: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsRequest> {

	var launchTemplateId: String? = null
	var launchTemplateName: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsRequest {
		val input = com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsRequest()
		input.setLaunchTemplateId(this.launchTemplateId)
		input.setLaunchTemplateName(this.launchTemplateName)
		input.setVersions(this.versions)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteLaunchTemplateVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-launch-template-versions")
				.argument("launch-template-id", launchTemplateId)
				.argument("launch-template-name", launchTemplateName)
				.argument("versions", versions.toString())
	}

}


fun AmazonEC2Functions.deleteNatGateway(natGatewayId: String, init: AmazonEC2DeleteNatGatewayCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteNatGatewayCommand(natGatewayId).apply(init))
}

@Generated
class AmazonEC2DeleteNatGatewayCommand(val natGatewayId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteNatGatewayRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteNatGatewayRequest {
		val input = com.amazonaws.services.ec2.model.DeleteNatGatewayRequest()
		input.setNatGatewayId(this.natGatewayId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteNatGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-nat-gateway")
				.argument("nat-gateway-id", natGatewayId)
	}

}


fun AmazonEC2Functions.deleteNetworkAcl(networkAclId: String, init: AmazonEC2DeleteNetworkAclCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteNetworkAclCommand(networkAclId).apply(init))
}

@Generated
class AmazonEC2DeleteNetworkAclCommand(val networkAclId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteNetworkAclRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteNetworkAclRequest {
		val input = com.amazonaws.services.ec2.model.DeleteNetworkAclRequest()
		input.setNetworkAclId(this.networkAclId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteNetworkAcl(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-network-acl")
				.argument("network-acl-id", networkAclId)
	}

}


fun AmazonEC2Functions.deleteNetworkAclEntry(egress: Boolean, networkAclId: String, ruleNumber: Int, init: AmazonEC2DeleteNetworkAclEntryCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteNetworkAclEntryCommand(egress, networkAclId, ruleNumber).apply(init))
}

@Generated
class AmazonEC2DeleteNetworkAclEntryCommand(val egress: Boolean, val networkAclId: String, val ruleNumber: Int) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteNetworkAclEntryRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteNetworkAclEntryRequest {
		val input = com.amazonaws.services.ec2.model.DeleteNetworkAclEntryRequest()
		input.setEgress(this.egress)
		input.setNetworkAclId(this.networkAclId)
		input.setRuleNumber(this.ruleNumber)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteNetworkAclEntry(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-network-acl-entry")
				.option("egress", egress ?: false)
				.argument("network-acl-id", networkAclId)
				.argument("rule-number", ruleNumber.toString())
	}

}


fun AmazonEC2Functions.deleteNetworkInterface(networkInterfaceId: String, init: AmazonEC2DeleteNetworkInterfaceCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteNetworkInterfaceCommand(networkInterfaceId).apply(init))
}

@Generated
class AmazonEC2DeleteNetworkInterfaceCommand(val networkInterfaceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteNetworkInterfaceRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteNetworkInterfaceRequest {
		val input = com.amazonaws.services.ec2.model.DeleteNetworkInterfaceRequest()
		input.setNetworkInterfaceId(this.networkInterfaceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteNetworkInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-network-interface")
				.argument("network-interface-id", networkInterfaceId)
	}

}


fun AmazonEC2Functions.deleteNetworkInterfacePermission(networkInterfacePermissionId: String, init: AmazonEC2DeleteNetworkInterfacePermissionCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteNetworkInterfacePermissionCommand(networkInterfacePermissionId).apply(init))
}

@Generated
class AmazonEC2DeleteNetworkInterfacePermissionCommand(val networkInterfacePermissionId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionRequest> {

	var force: Boolean? = false

	override fun build(): com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionRequest {
		val input = com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionRequest()
		input.setNetworkInterfacePermissionId(this.networkInterfacePermissionId)
		input.setForce(this.force)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteNetworkInterfacePermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-network-interface-permission")
				.argument("network-interface-permission-id", networkInterfacePermissionId)
				.option("force", force ?: false)
	}

}


fun AmazonEC2Functions.deletePlacementGroup(groupName: String, init: AmazonEC2DeletePlacementGroupCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeletePlacementGroupCommand(groupName).apply(init))
}

@Generated
class AmazonEC2DeletePlacementGroupCommand(val groupName: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeletePlacementGroupRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeletePlacementGroupRequest {
		val input = com.amazonaws.services.ec2.model.DeletePlacementGroupRequest()
		input.setGroupName(this.groupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deletePlacementGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-placement-group")
				.argument("group-name", groupName)
	}

}


fun AmazonEC2Functions.deleteRoute(routeTableId: String, init: AmazonEC2DeleteRouteCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteRouteCommand(routeTableId).apply(init))
}

@Generated
class AmazonEC2DeleteRouteCommand(val routeTableId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteRouteRequest> {

	var destinationCidrBlock: String? = null
	var destinationIpv6CidrBlock: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DeleteRouteRequest {
		val input = com.amazonaws.services.ec2.model.DeleteRouteRequest()
		input.setDestinationCidrBlock(this.destinationCidrBlock)
		input.setDestinationIpv6CidrBlock(this.destinationIpv6CidrBlock)
		input.setRouteTableId(this.routeTableId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteRoute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-route")
				.argument("destination-cidr-block", destinationCidrBlock)
				.argument("destination-ipv6-cidr-block", destinationIpv6CidrBlock)
				.argument("route-table-id", routeTableId)
	}

}


fun AmazonEC2Functions.deleteRouteTable(routeTableId: String, init: AmazonEC2DeleteRouteTableCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteRouteTableCommand(routeTableId).apply(init))
}

@Generated
class AmazonEC2DeleteRouteTableCommand(val routeTableId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteRouteTableRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteRouteTableRequest {
		val input = com.amazonaws.services.ec2.model.DeleteRouteTableRequest()
		input.setRouteTableId(this.routeTableId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteRouteTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-route-table")
				.argument("route-table-id", routeTableId)
	}

}


fun AmazonEC2Functions.deleteSecurityGroup(init: AmazonEC2DeleteSecurityGroupCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteSecurityGroupCommand().apply(init))
}

@Generated
class AmazonEC2DeleteSecurityGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteSecurityGroupRequest> {

	var groupId: String? = null
	var groupName: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DeleteSecurityGroupRequest {
		val input = com.amazonaws.services.ec2.model.DeleteSecurityGroupRequest()
		input.setGroupId(this.groupId)
		input.setGroupName(this.groupName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteSecurityGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-security-group")
				.argument("group-id", groupId)
				.argument("group-name", groupName)
	}

}


fun AmazonEC2Functions.deleteSnapshot(snapshotId: String, init: AmazonEC2DeleteSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteSnapshotCommand(snapshotId).apply(init))
}

@Generated
class AmazonEC2DeleteSnapshotCommand(val snapshotId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteSnapshotRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteSnapshotRequest {
		val input = com.amazonaws.services.ec2.model.DeleteSnapshotRequest()
		input.setSnapshotId(this.snapshotId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-snapshot")
				.argument("snapshot-id", snapshotId)
	}

}


fun AmazonEC2Functions.deleteSpotDatafeedSubscription(init: AmazonEC2DeleteSpotDatafeedSubscriptionCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteSpotDatafeedSubscriptionCommand().apply(init))
}

@Generated
class AmazonEC2DeleteSpotDatafeedSubscriptionCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionRequest {
		val input = com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteSpotDatafeedSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-spot-datafeed-subscription")

	}

}


fun AmazonEC2Functions.deleteSubnet(subnetId: String, init: AmazonEC2DeleteSubnetCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteSubnetCommand(subnetId).apply(init))
}

@Generated
class AmazonEC2DeleteSubnetCommand(val subnetId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteSubnetRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteSubnetRequest {
		val input = com.amazonaws.services.ec2.model.DeleteSubnetRequest()
		input.setSubnetId(this.subnetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteSubnet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-subnet")
				.argument("subnet-id", subnetId)
	}

}


fun AmazonEC2Functions.deleteTags(resources: List<String>, init: AmazonEC2DeleteTagsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteTagsCommand(resources).apply(init))
}

@Generated
class AmazonEC2DeleteTagsCommand(val resources: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteTagsRequest> {

	var tags: List<com.amazonaws.services.ec2.model.Tag>? = null

	override fun build(): com.amazonaws.services.ec2.model.DeleteTagsRequest {
		val input = com.amazonaws.services.ec2.model.DeleteTagsRequest()
		input.setResources(this.resources)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-tags")
				.argument("resources", resources.toString())
				.argument("tags", tags?.toString())
	}

}


fun AmazonEC2Functions.deleteVolume(volumeId: String, init: AmazonEC2DeleteVolumeCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteVolumeCommand(volumeId).apply(init))
}

@Generated
class AmazonEC2DeleteVolumeCommand(val volumeId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteVolumeRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteVolumeRequest {
		val input = com.amazonaws.services.ec2.model.DeleteVolumeRequest()
		input.setVolumeId(this.volumeId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-volume")
				.argument("volume-id", volumeId)
	}

}


fun AmazonEC2Functions.deleteVpc(vpcId: String, init: AmazonEC2DeleteVpcCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteVpcCommand(vpcId).apply(init))
}

@Generated
class AmazonEC2DeleteVpcCommand(val vpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteVpcRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteVpcRequest {
		val input = com.amazonaws.services.ec2.model.DeleteVpcRequest()
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteVpc(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-vpc")
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.deleteVpcEndpointConnectionNotifications(connectionNotificationIds: List<String>, init: AmazonEC2DeleteVpcEndpointConnectionNotificationsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteVpcEndpointConnectionNotificationsCommand(connectionNotificationIds).apply(init))
}

@Generated
class AmazonEC2DeleteVpcEndpointConnectionNotificationsCommand(val connectionNotificationIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsRequest {
		val input = com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsRequest()
		input.setConnectionNotificationIds(this.connectionNotificationIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteVpcEndpointConnectionNotifications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-vpc-endpoint-connection-notifications")
				.argument("connection-notification-ids", connectionNotificationIds.toString())
	}

}


fun AmazonEC2Functions.deleteVpcEndpointServiceConfigurations(serviceIds: List<String>, init: AmazonEC2DeleteVpcEndpointServiceConfigurationsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteVpcEndpointServiceConfigurationsCommand(serviceIds).apply(init))
}

@Generated
class AmazonEC2DeleteVpcEndpointServiceConfigurationsCommand(val serviceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsRequest {
		val input = com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsRequest()
		input.setServiceIds(this.serviceIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteVpcEndpointServiceConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-vpc-endpoint-service-configurations")
				.argument("service-ids", serviceIds.toString())
	}

}


fun AmazonEC2Functions.deleteVpcEndpoints(vpcEndpointIds: List<String>, init: AmazonEC2DeleteVpcEndpointsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteVpcEndpointsCommand(vpcEndpointIds).apply(init))
}

@Generated
class AmazonEC2DeleteVpcEndpointsCommand(val vpcEndpointIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteVpcEndpointsRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteVpcEndpointsRequest {
		val input = com.amazonaws.services.ec2.model.DeleteVpcEndpointsRequest()
		input.setVpcEndpointIds(this.vpcEndpointIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteVpcEndpoints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-vpc-endpoints")
				.argument("vpc-endpoint-ids", vpcEndpointIds.toString())
	}

}


fun AmazonEC2Functions.deleteVpcPeeringConnection(vpcPeeringConnectionId: String, init: AmazonEC2DeleteVpcPeeringConnectionCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteVpcPeeringConnectionCommand(vpcPeeringConnectionId).apply(init))
}

@Generated
class AmazonEC2DeleteVpcPeeringConnectionCommand(val vpcPeeringConnectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionRequest {
		val input = com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionRequest()
		input.setVpcPeeringConnectionId(this.vpcPeeringConnectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteVpcPeeringConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-vpc-peering-connection")
				.argument("vpc-peering-connection-id", vpcPeeringConnectionId)
	}

}


fun AmazonEC2Functions.deleteVpnConnection(vpnConnectionId: String, init: AmazonEC2DeleteVpnConnectionCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteVpnConnectionCommand(vpnConnectionId).apply(init))
}

@Generated
class AmazonEC2DeleteVpnConnectionCommand(val vpnConnectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteVpnConnectionRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteVpnConnectionRequest {
		val input = com.amazonaws.services.ec2.model.DeleteVpnConnectionRequest()
		input.setVpnConnectionId(this.vpnConnectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteVpnConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-vpn-connection")
				.argument("vpn-connection-id", vpnConnectionId)
	}

}


fun AmazonEC2Functions.deleteVpnConnectionRoute(destinationCidrBlock: String, vpnConnectionId: String, init: AmazonEC2DeleteVpnConnectionRouteCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteVpnConnectionRouteCommand(destinationCidrBlock, vpnConnectionId).apply(init))
}

@Generated
class AmazonEC2DeleteVpnConnectionRouteCommand(val destinationCidrBlock: String, val vpnConnectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteRequest {
		val input = com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteRequest()
		input.setDestinationCidrBlock(this.destinationCidrBlock)
		input.setVpnConnectionId(this.vpnConnectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteVpnConnectionRoute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-vpn-connection-route")
				.argument("destination-cidr-block", destinationCidrBlock)
				.argument("vpn-connection-id", vpnConnectionId)
	}

}


fun AmazonEC2Functions.deleteVpnGateway(vpnGatewayId: String, init: AmazonEC2DeleteVpnGatewayCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeleteVpnGatewayCommand(vpnGatewayId).apply(init))
}

@Generated
class AmazonEC2DeleteVpnGatewayCommand(val vpnGatewayId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeleteVpnGatewayRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeleteVpnGatewayRequest {
		val input = com.amazonaws.services.ec2.model.DeleteVpnGatewayRequest()
		input.setVpnGatewayId(this.vpnGatewayId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deleteVpnGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 delete-vpn-gateway")
				.argument("vpn-gateway-id", vpnGatewayId)
	}

}


fun AmazonEC2Functions.deregisterImage(imageId: String, init: AmazonEC2DeregisterImageCommand.() -> Unit) {
	this.block.declare(AmazonEC2DeregisterImageCommand(imageId).apply(init))
}

@Generated
class AmazonEC2DeregisterImageCommand(val imageId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DeregisterImageRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DeregisterImageRequest {
		val input = com.amazonaws.services.ec2.model.DeregisterImageRequest()
		input.setImageId(this.imageId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.deregisterImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 deregister-image")
				.argument("image-id", imageId)
	}

}


fun AmazonEC2Functions.describeAccountAttributes(init: AmazonEC2DescribeAccountAttributesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeAccountAttributesCommand().apply(init))
}

@Generated
class AmazonEC2DescribeAccountAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeAccountAttributesRequest> {

	var attributeNames: List<AccountAttributeName>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeAccountAttributesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeAccountAttributesRequest()
		input.setAttributeNames(this.attributeNames?.map { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeAccountAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-account-attributes")
				.argument("attribute-names", attributeNames?.toString())
	}

}


fun AmazonEC2Functions.describeAddresses(init: AmazonEC2DescribeAddressesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeAddressesCommand().apply(init))
}

@Generated
class AmazonEC2DescribeAddressesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeAddressesRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var publicIps: List<String>? = null
	var allocationIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeAddressesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeAddressesRequest()
		input.setFilters(this.filters)
		input.setPublicIps(this.publicIps)
		input.setAllocationIds(this.allocationIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeAddresses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-addresses")
				.argument("filters", filters?.toString())
				.argument("public-ips", publicIps?.toString())
				.argument("allocation-ids", allocationIds?.toString())
	}

}


fun AmazonEC2Functions.describeAggregateIdFormat(init: AmazonEC2DescribeAggregateIdFormatCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeAggregateIdFormatCommand().apply(init))
}

@Generated
class AmazonEC2DescribeAggregateIdFormatCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeAggregateIdFormatRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DescribeAggregateIdFormatRequest {
		val input = com.amazonaws.services.ec2.model.DescribeAggregateIdFormatRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeAggregateIdFormat(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-aggregate-id-format")

	}

}


fun AmazonEC2Functions.describeAvailabilityZones(init: AmazonEC2DescribeAvailabilityZonesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeAvailabilityZonesCommand().apply(init))
}

@Generated
class AmazonEC2DescribeAvailabilityZonesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeAvailabilityZonesRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var zoneNames: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeAvailabilityZonesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeAvailabilityZonesRequest()
		input.setFilters(this.filters)
		input.setZoneNames(this.zoneNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeAvailabilityZones(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-availability-zones")
				.argument("filters", filters?.toString())
				.argument("zone-names", zoneNames?.toString())
	}

}


fun AmazonEC2Functions.describeBundleTasks(init: AmazonEC2DescribeBundleTasksCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeBundleTasksCommand().apply(init))
}

@Generated
class AmazonEC2DescribeBundleTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeBundleTasksRequest> {

	var bundleIds: List<String>? = null
	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeBundleTasksRequest {
		val input = com.amazonaws.services.ec2.model.DescribeBundleTasksRequest()
		input.setBundleIds(this.bundleIds)
		input.setFilters(this.filters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeBundleTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-bundle-tasks")
				.argument("bundle-ids", bundleIds?.toString())
				.argument("filters", filters?.toString())
	}

}


fun AmazonEC2Functions.describeClassicLinkInstances(init: AmazonEC2DescribeClassicLinkInstancesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeClassicLinkInstancesCommand().apply(init))
}

@Generated
class AmazonEC2DescribeClassicLinkInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var instanceIds: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesRequest()
		input.setFilters(this.filters)
		input.setInstanceIds(this.instanceIds)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeClassicLinkInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-classic-link-instances")
				.argument("filters", filters?.toString())
				.argument("instance-ids", instanceIds?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeConversionTasks(init: AmazonEC2DescribeConversionTasksCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeConversionTasksCommand().apply(init))
}

@Generated
class AmazonEC2DescribeConversionTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeConversionTasksRequest> {

	var conversionTaskIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeConversionTasksRequest {
		val input = com.amazonaws.services.ec2.model.DescribeConversionTasksRequest()
		input.setConversionTaskIds(this.conversionTaskIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeConversionTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-conversion-tasks")
				.argument("conversion-task-ids", conversionTaskIds?.toString())
	}

}


fun AmazonEC2Functions.describeCustomerGateways(init: AmazonEC2DescribeCustomerGatewaysCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeCustomerGatewaysCommand().apply(init))
}

@Generated
class AmazonEC2DescribeCustomerGatewaysCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeCustomerGatewaysRequest> {

	var customerGatewayIds: List<String>? = null
	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeCustomerGatewaysRequest {
		val input = com.amazonaws.services.ec2.model.DescribeCustomerGatewaysRequest()
		input.setCustomerGatewayIds(this.customerGatewayIds)
		input.setFilters(this.filters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeCustomerGateways(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-customer-gateways")
				.argument("customer-gateway-ids", customerGatewayIds?.toString())
				.argument("filters", filters?.toString())
	}

}


fun AmazonEC2Functions.describeDhcpOptions(init: AmazonEC2DescribeDhcpOptionsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeDhcpOptionsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeDhcpOptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeDhcpOptionsRequest> {

	var dhcpOptionsIds: List<String>? = null
	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeDhcpOptionsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeDhcpOptionsRequest()
		input.setDhcpOptionsIds(this.dhcpOptionsIds)
		input.setFilters(this.filters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeDhcpOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-dhcp-options")
				.argument("dhcp-options-ids", dhcpOptionsIds?.toString())
				.argument("filters", filters?.toString())
	}

}


fun AmazonEC2Functions.describeEgressOnlyInternetGateways(init: AmazonEC2DescribeEgressOnlyInternetGatewaysCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeEgressOnlyInternetGatewaysCommand().apply(init))
}

@Generated
class AmazonEC2DescribeEgressOnlyInternetGatewaysCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysRequest> {

	var egressOnlyInternetGatewayIds: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysRequest {
		val input = com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysRequest()
		input.setEgressOnlyInternetGatewayIds(this.egressOnlyInternetGatewayIds)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeEgressOnlyInternetGateways(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-egress-only-internet-gateways")
				.argument("egress-only-internet-gateway-ids", egressOnlyInternetGatewayIds?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeElasticGpus(init: AmazonEC2DescribeElasticGpusCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeElasticGpusCommand().apply(init))
}

@Generated
class AmazonEC2DescribeElasticGpusCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeElasticGpusRequest> {

	var elasticGpuIds: List<String>? = null
	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeElasticGpusRequest {
		val input = com.amazonaws.services.ec2.model.DescribeElasticGpusRequest()
		input.setElasticGpuIds(this.elasticGpuIds)
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeElasticGpus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-elastic-gpus")
				.argument("elastic-gpu-ids", elasticGpuIds?.toString())
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeExportTasks(init: AmazonEC2DescribeExportTasksCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeExportTasksCommand().apply(init))
}

@Generated
class AmazonEC2DescribeExportTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeExportTasksRequest> {

	var exportTaskIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeExportTasksRequest {
		val input = com.amazonaws.services.ec2.model.DescribeExportTasksRequest()
		input.setExportTaskIds(this.exportTaskIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeExportTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-export-tasks")
				.argument("export-task-ids", exportTaskIds?.toString())
	}

}


fun AmazonEC2Functions.describeFlowLogs(init: AmazonEC2DescribeFlowLogsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeFlowLogsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeFlowLogsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeFlowLogsRequest> {

	var filter: List<com.amazonaws.services.ec2.model.Filter>? = null
	var flowLogIds: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeFlowLogsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeFlowLogsRequest()
		input.setFilter(this.filter)
		input.setFlowLogIds(this.flowLogIds)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeFlowLogs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-flow-logs")
				.argument("filter", filter?.toString())
				.argument("flow-log-ids", flowLogIds?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeFpgaImageAttribute(fpgaImageId: String, attribute: FpgaImageAttributeName, init: AmazonEC2DescribeFpgaImageAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeFpgaImageAttributeCommand(fpgaImageId, attribute).apply(init))
}

@Generated
class AmazonEC2DescribeFpgaImageAttributeCommand(val fpgaImageId: String, val attribute: FpgaImageAttributeName) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeRequest {
		val input = com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeRequest()
		input.setFpgaImageId(this.fpgaImageId)
		input.setAttribute(this.attribute.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeFpgaImageAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-fpga-image-attribute")
				.argument("fpga-image-id", fpgaImageId)
				.argument("attribute", attribute.toString())
	}

}


fun AmazonEC2Functions.describeFpgaImages(init: AmazonEC2DescribeFpgaImagesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeFpgaImagesCommand().apply(init))
}

@Generated
class AmazonEC2DescribeFpgaImagesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeFpgaImagesRequest> {

	var fpgaImageIds: List<String>? = null
	var owners: List<String>? = null
	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.ec2.model.DescribeFpgaImagesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeFpgaImagesRequest()
		input.setFpgaImageIds(this.fpgaImageIds)
		input.setOwners(this.owners)
		input.setFilters(this.filters)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeFpgaImages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-fpga-images")
				.argument("fpga-image-ids", fpgaImageIds?.toString())
				.argument("owners", owners?.toString())
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonEC2Functions.describeHostReservationOfferings(init: AmazonEC2DescribeHostReservationOfferingsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeHostReservationOfferingsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeHostReservationOfferingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsRequest> {

	var filter: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxDuration: Int? = 0
	var maxResults: Int? = 0
	var minDuration: Int? = 0
	var nextToken: String? = null
	var offeringId: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsRequest()
		input.setFilter(this.filter)
		input.setMaxDuration(this.maxDuration)
		input.setMaxResults(this.maxResults)
		input.setMinDuration(this.minDuration)
		input.setNextToken(this.nextToken)
		input.setOfferingId(this.offeringId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeHostReservationOfferings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-host-reservation-offerings")
				.argument("filter", filter?.toString())
				.argument("max-duration", maxDuration?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("min-duration", minDuration?.toString())
				.argument("next-token", nextToken)
				.argument("offering-id", offeringId)
	}

}


fun AmazonEC2Functions.describeHostReservations(init: AmazonEC2DescribeHostReservationsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeHostReservationsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeHostReservationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeHostReservationsRequest> {

	var filter: List<com.amazonaws.services.ec2.model.Filter>? = null
	var hostReservationIdSet: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeHostReservationsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeHostReservationsRequest()
		input.setFilter(this.filter)
		input.setHostReservationIdSet(this.hostReservationIdSet)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeHostReservations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-host-reservations")
				.argument("filter", filter?.toString())
				.argument("host-reservation-id-set", hostReservationIdSet?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeHosts(init: AmazonEC2DescribeHostsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeHostsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeHostsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeHostsRequest> {

	var filter: List<com.amazonaws.services.ec2.model.Filter>? = null
	var hostIds: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeHostsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeHostsRequest()
		input.setFilter(this.filter)
		input.setHostIds(this.hostIds)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeHosts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-hosts")
				.argument("filter", filter?.toString())
				.argument("host-ids", hostIds?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeIamInstanceProfileAssociations(init: AmazonEC2DescribeIamInstanceProfileAssociationsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeIamInstanceProfileAssociationsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeIamInstanceProfileAssociationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest> {

	var associationIds: List<String>? = null
	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest()
		input.setAssociationIds(this.associationIds)
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeIamInstanceProfileAssociations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-iam-instance-profile-associations")
				.argument("association-ids", associationIds?.toString())
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeIdFormat(init: AmazonEC2DescribeIdFormatCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeIdFormatCommand().apply(init))
}

@Generated
class AmazonEC2DescribeIdFormatCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeIdFormatRequest> {

	var resource: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeIdFormatRequest {
		val input = com.amazonaws.services.ec2.model.DescribeIdFormatRequest()
		input.setResource(this.resource)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeIdFormat(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-id-format")
				.argument("resource", resource)
	}

}


fun AmazonEC2Functions.describeIdentityIdFormat(principalArn: String, init: AmazonEC2DescribeIdentityIdFormatCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeIdentityIdFormatCommand(principalArn).apply(init))
}

@Generated
class AmazonEC2DescribeIdentityIdFormatCommand(val principalArn: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeIdentityIdFormatRequest> {

	var resource: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeIdentityIdFormatRequest {
		val input = com.amazonaws.services.ec2.model.DescribeIdentityIdFormatRequest()
		input.setPrincipalArn(this.principalArn)
		input.setResource(this.resource)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeIdentityIdFormat(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-identity-id-format")
				.argument("principal-arn", principalArn)
				.argument("resource", resource)
	}

}


fun AmazonEC2Functions.describeImageAttribute(attribute: ImageAttributeName, imageId: String, init: AmazonEC2DescribeImageAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeImageAttributeCommand(attribute, imageId).apply(init))
}

@Generated
class AmazonEC2DescribeImageAttributeCommand(val attribute: ImageAttributeName, val imageId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeImageAttributeRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DescribeImageAttributeRequest {
		val input = com.amazonaws.services.ec2.model.DescribeImageAttributeRequest()
		input.setAttribute(this.attribute.toString())
		input.setImageId(this.imageId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeImageAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-image-attribute")
				.argument("attribute", attribute.toString())
				.argument("image-id", imageId)
	}

}


fun AmazonEC2Functions.describeImages(init: AmazonEC2DescribeImagesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeImagesCommand().apply(init))
}

@Generated
class AmazonEC2DescribeImagesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeImagesRequest> {

	var executableUsers: List<String>? = null
	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var imageIds: List<String>? = null
	var owners: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeImagesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeImagesRequest()
		input.setExecutableUsers(this.executableUsers)
		input.setFilters(this.filters)
		input.setImageIds(this.imageIds)
		input.setOwners(this.owners)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeImages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-images")
				.argument("executable-users", executableUsers?.toString())
				.argument("filters", filters?.toString())
				.argument("image-ids", imageIds?.toString())
				.argument("owners", owners?.toString())
	}

}


fun AmazonEC2Functions.describeImportImageTasks(init: AmazonEC2DescribeImportImageTasksCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeImportImageTasksCommand().apply(init))
}

@Generated
class AmazonEC2DescribeImportImageTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeImportImageTasksRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var importTaskIds: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeImportImageTasksRequest {
		val input = com.amazonaws.services.ec2.model.DescribeImportImageTasksRequest()
		input.setFilters(this.filters)
		input.setImportTaskIds(this.importTaskIds)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeImportImageTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-import-image-tasks")
				.argument("filters", filters?.toString())
				.argument("import-task-ids", importTaskIds?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeImportSnapshotTasks(init: AmazonEC2DescribeImportSnapshotTasksCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeImportSnapshotTasksCommand().apply(init))
}

@Generated
class AmazonEC2DescribeImportSnapshotTasksCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var importTaskIds: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksRequest {
		val input = com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksRequest()
		input.setFilters(this.filters)
		input.setImportTaskIds(this.importTaskIds)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeImportSnapshotTasks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-import-snapshot-tasks")
				.argument("filters", filters?.toString())
				.argument("import-task-ids", importTaskIds?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeInstanceAttribute(attribute: InstanceAttributeName, instanceId: String, init: AmazonEC2DescribeInstanceAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeInstanceAttributeCommand(attribute, instanceId).apply(init))
}

@Generated
class AmazonEC2DescribeInstanceAttributeCommand(val attribute: InstanceAttributeName, val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeInstanceAttributeRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DescribeInstanceAttributeRequest {
		val input = com.amazonaws.services.ec2.model.DescribeInstanceAttributeRequest()
		input.setAttribute(this.attribute.toString())
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeInstanceAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-instance-attribute")
				.argument("attribute", attribute.toString())
				.argument("instance-id", instanceId)
	}

}


fun AmazonEC2Functions.describeInstanceCreditSpecifications(init: AmazonEC2DescribeInstanceCreditSpecificationsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeInstanceCreditSpecificationsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeInstanceCreditSpecificationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var instanceIds: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsRequest()
		input.setFilters(this.filters)
		input.setInstanceIds(this.instanceIds)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeInstanceCreditSpecifications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-instance-credit-specifications")
				.argument("filters", filters?.toString())
				.argument("instance-ids", instanceIds?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeInstanceStatus(init: AmazonEC2DescribeInstanceStatusCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeInstanceStatusCommand().apply(init))
}

@Generated
class AmazonEC2DescribeInstanceStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeInstanceStatusRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var instanceIds: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var includeAllInstances: Boolean? = false

	override fun build(): com.amazonaws.services.ec2.model.DescribeInstanceStatusRequest {
		val input = com.amazonaws.services.ec2.model.DescribeInstanceStatusRequest()
		input.setFilters(this.filters)
		input.setInstanceIds(this.instanceIds)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setIncludeAllInstances(this.includeAllInstances)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeInstanceStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-instance-status")
				.argument("filters", filters?.toString())
				.argument("instance-ids", instanceIds?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.option("include-all-instances", includeAllInstances ?: false)
	}

}


fun AmazonEC2Functions.describeInstances(init: AmazonEC2DescribeInstancesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeInstancesCommand().apply(init))
}

@Generated
class AmazonEC2DescribeInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeInstancesRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var instanceIds: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeInstancesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeInstancesRequest()
		input.setFilters(this.filters)
		input.setInstanceIds(this.instanceIds)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-instances")
				.argument("filters", filters?.toString())
				.argument("instance-ids", instanceIds?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeInternetGateways(init: AmazonEC2DescribeInternetGatewaysCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeInternetGatewaysCommand().apply(init))
}

@Generated
class AmazonEC2DescribeInternetGatewaysCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeInternetGatewaysRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var internetGatewayIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeInternetGatewaysRequest {
		val input = com.amazonaws.services.ec2.model.DescribeInternetGatewaysRequest()
		input.setFilters(this.filters)
		input.setInternetGatewayIds(this.internetGatewayIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeInternetGateways(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-internet-gateways")
				.argument("filters", filters?.toString())
				.argument("internet-gateway-ids", internetGatewayIds?.toString())
	}

}


fun AmazonEC2Functions.describeKeyPairs(init: AmazonEC2DescribeKeyPairsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeKeyPairsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeKeyPairsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeKeyPairsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var keyNames: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeKeyPairsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeKeyPairsRequest()
		input.setFilters(this.filters)
		input.setKeyNames(this.keyNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeKeyPairs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-key-pairs")
				.argument("filters", filters?.toString())
				.argument("key-names", keyNames?.toString())
	}

}


fun AmazonEC2Functions.describeLaunchTemplateVersions(init: AmazonEC2DescribeLaunchTemplateVersionsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeLaunchTemplateVersionsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeLaunchTemplateVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsRequest> {

	var launchTemplateId: String? = null
	var launchTemplateName: String? = null
	var versions: List<String>? = null
	var minVersion: String? = null
	var maxVersion: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsRequest()
		input.setLaunchTemplateId(this.launchTemplateId)
		input.setLaunchTemplateName(this.launchTemplateName)
		input.setVersions(this.versions)
		input.setMinVersion(this.minVersion)
		input.setMaxVersion(this.maxVersion)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setFilters(this.filters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeLaunchTemplateVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-launch-template-versions")
				.argument("launch-template-id", launchTemplateId)
				.argument("launch-template-name", launchTemplateName)
				.argument("versions", versions?.toString())
				.argument("min-version", minVersion)
				.argument("max-version", maxVersion)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
	}

}


fun AmazonEC2Functions.describeLaunchTemplates(init: AmazonEC2DescribeLaunchTemplatesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeLaunchTemplatesCommand().apply(init))
}

@Generated
class AmazonEC2DescribeLaunchTemplatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeLaunchTemplatesRequest> {

	var launchTemplateIds: List<String>? = null
	var launchTemplateNames: List<String>? = null
	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.ec2.model.DescribeLaunchTemplatesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeLaunchTemplatesRequest()
		input.setLaunchTemplateIds(this.launchTemplateIds)
		input.setLaunchTemplateNames(this.launchTemplateNames)
		input.setFilters(this.filters)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeLaunchTemplates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-launch-templates")
				.argument("launch-template-ids", launchTemplateIds?.toString())
				.argument("launch-template-names", launchTemplateNames?.toString())
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonEC2Functions.describeMovingAddresses(init: AmazonEC2DescribeMovingAddressesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeMovingAddressesCommand().apply(init))
}

@Generated
class AmazonEC2DescribeMovingAddressesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeMovingAddressesRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var publicIps: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeMovingAddressesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeMovingAddressesRequest()
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setPublicIps(this.publicIps)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeMovingAddresses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-moving-addresses")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("public-ips", publicIps?.toString())
	}

}


fun AmazonEC2Functions.describeNatGateways(init: AmazonEC2DescribeNatGatewaysCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeNatGatewaysCommand().apply(init))
}

@Generated
class AmazonEC2DescribeNatGatewaysCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeNatGatewaysRequest> {

	var filter: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxResults: Int? = 0
	var natGatewayIds: List<String>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeNatGatewaysRequest {
		val input = com.amazonaws.services.ec2.model.DescribeNatGatewaysRequest()
		input.setFilter(this.filter)
		input.setMaxResults(this.maxResults)
		input.setNatGatewayIds(this.natGatewayIds)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeNatGateways(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-nat-gateways")
				.argument("filter", filter?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("nat-gateway-ids", natGatewayIds?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeNetworkAcls(init: AmazonEC2DescribeNetworkAclsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeNetworkAclsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeNetworkAclsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeNetworkAclsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var networkAclIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeNetworkAclsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeNetworkAclsRequest()
		input.setFilters(this.filters)
		input.setNetworkAclIds(this.networkAclIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeNetworkAcls(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-network-acls")
				.argument("filters", filters?.toString())
				.argument("network-acl-ids", networkAclIds?.toString())
	}

}


fun AmazonEC2Functions.describeNetworkInterfaceAttribute(networkInterfaceId: String, init: AmazonEC2DescribeNetworkInterfaceAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeNetworkInterfaceAttributeCommand(networkInterfaceId).apply(init))
}

@Generated
class AmazonEC2DescribeNetworkInterfaceAttributeCommand(val networkInterfaceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeRequest> {

	var attribute: NetworkInterfaceAttribute? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeRequest {
		val input = com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeRequest()
		input.setAttribute(this.attribute?.toString())
		input.setNetworkInterfaceId(this.networkInterfaceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeNetworkInterfaceAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-network-interface-attribute")
				.argument("attribute", attribute?.toString())
				.argument("network-interface-id", networkInterfaceId)
	}

}


fun AmazonEC2Functions.describeNetworkInterfacePermissions(init: AmazonEC2DescribeNetworkInterfacePermissionsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeNetworkInterfacePermissionsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeNetworkInterfacePermissionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsRequest> {

	var networkInterfacePermissionIds: List<String>? = null
	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsRequest()
		input.setNetworkInterfacePermissionIds(this.networkInterfacePermissionIds)
		input.setFilters(this.filters)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeNetworkInterfacePermissions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-network-interface-permissions")
				.argument("network-interface-permission-ids", networkInterfacePermissionIds?.toString())
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonEC2Functions.describeNetworkInterfaces(init: AmazonEC2DescribeNetworkInterfacesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeNetworkInterfacesCommand().apply(init))
}

@Generated
class AmazonEC2DescribeNetworkInterfacesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeNetworkInterfacesRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var networkInterfaceIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeNetworkInterfacesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeNetworkInterfacesRequest()
		input.setFilters(this.filters)
		input.setNetworkInterfaceIds(this.networkInterfaceIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeNetworkInterfaces(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-network-interfaces")
				.argument("filters", filters?.toString())
				.argument("network-interface-ids", networkInterfaceIds?.toString())
	}

}


fun AmazonEC2Functions.describePlacementGroups(init: AmazonEC2DescribePlacementGroupsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribePlacementGroupsCommand().apply(init))
}

@Generated
class AmazonEC2DescribePlacementGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribePlacementGroupsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var groupNames: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribePlacementGroupsRequest {
		val input = com.amazonaws.services.ec2.model.DescribePlacementGroupsRequest()
		input.setFilters(this.filters)
		input.setGroupNames(this.groupNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describePlacementGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-placement-groups")
				.argument("filters", filters?.toString())
				.argument("group-names", groupNames?.toString())
	}

}


fun AmazonEC2Functions.describePrefixLists(init: AmazonEC2DescribePrefixListsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribePrefixListsCommand().apply(init))
}

@Generated
class AmazonEC2DescribePrefixListsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribePrefixListsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var prefixListIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribePrefixListsRequest {
		val input = com.amazonaws.services.ec2.model.DescribePrefixListsRequest()
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setPrefixListIds(this.prefixListIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describePrefixLists(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-prefix-lists")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("prefix-list-ids", prefixListIds?.toString())
	}

}


fun AmazonEC2Functions.describePrincipalIdFormat(init: AmazonEC2DescribePrincipalIdFormatCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribePrincipalIdFormatCommand().apply(init))
}

@Generated
class AmazonEC2DescribePrincipalIdFormatCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribePrincipalIdFormatRequest> {

	var resources: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribePrincipalIdFormatRequest {
		val input = com.amazonaws.services.ec2.model.DescribePrincipalIdFormatRequest()
		input.setResources(this.resources)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describePrincipalIdFormat(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-principal-id-format")
				.argument("resources", resources?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeRegions(init: AmazonEC2DescribeRegionsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeRegionsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeRegionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeRegionsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var regionNames: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeRegionsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeRegionsRequest()
		input.setFilters(this.filters)
		input.setRegionNames(this.regionNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeRegions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-regions")
				.argument("filters", filters?.toString())
				.argument("region-names", regionNames?.toString())
	}

}


fun AmazonEC2Functions.describeReservedInstances(init: AmazonEC2DescribeReservedInstancesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeReservedInstancesCommand().apply(init))
}

@Generated
class AmazonEC2DescribeReservedInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeReservedInstancesRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var offeringClass: OfferingClassType? = null
	var reservedInstancesIds: List<String>? = null
	var offeringType: OfferingTypeValues? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeReservedInstancesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeReservedInstancesRequest()
		input.setFilters(this.filters)
		input.setOfferingClass(this.offeringClass?.toString())
		input.setReservedInstancesIds(this.reservedInstancesIds)
		input.setOfferingType(this.offeringType?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeReservedInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-reserved-instances")
				.argument("filters", filters?.toString())
				.argument("offering-class", offeringClass?.toString())
				.argument("reserved-instances-ids", reservedInstancesIds?.toString())
				.argument("offering-type", offeringType?.toString())
	}

}


fun AmazonEC2Functions.describeReservedInstancesListings(init: AmazonEC2DescribeReservedInstancesListingsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeReservedInstancesListingsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeReservedInstancesListingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var reservedInstancesId: String? = null
	var reservedInstancesListingId: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsRequest()
		input.setFilters(this.filters)
		input.setReservedInstancesId(this.reservedInstancesId)
		input.setReservedInstancesListingId(this.reservedInstancesListingId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeReservedInstancesListings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-reserved-instances-listings")
				.argument("filters", filters?.toString())
				.argument("reserved-instances-id", reservedInstancesId)
				.argument("reserved-instances-listing-id", reservedInstancesListingId)
	}

}


fun AmazonEC2Functions.describeReservedInstancesModifications(init: AmazonEC2DescribeReservedInstancesModificationsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeReservedInstancesModificationsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeReservedInstancesModificationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var reservedInstancesModificationIds: List<String>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsRequest()
		input.setFilters(this.filters)
		input.setReservedInstancesModificationIds(this.reservedInstancesModificationIds)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeReservedInstancesModifications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-reserved-instances-modifications")
				.argument("filters", filters?.toString())
				.argument("reserved-instances-modification-ids", reservedInstancesModificationIds?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeReservedInstancesOfferings(init: AmazonEC2DescribeReservedInstancesOfferingsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeReservedInstancesOfferingsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeReservedInstancesOfferingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsRequest> {

	var availabilityZone: String? = null
	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var includeMarketplace: Boolean? = false
	var instanceType: InstanceType? = null
	var maxDuration: Long? = 0L
	var maxInstanceCount: Int? = 0
	var minDuration: Long? = 0L
	var offeringClass: OfferingClassType? = null
	var productDescription: RIProductDescription? = null
	var reservedInstancesOfferingIds: List<String>? = null
	var instanceTenancy: Tenancy? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var offeringType: OfferingTypeValues? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsRequest()
		input.setAvailabilityZone(this.availabilityZone)
		input.setFilters(this.filters)
		input.setIncludeMarketplace(this.includeMarketplace)
		input.setInstanceType(this.instanceType?.toString())
		input.setMaxDuration(this.maxDuration)
		input.setMaxInstanceCount(this.maxInstanceCount)
		input.setMinDuration(this.minDuration)
		input.setOfferingClass(this.offeringClass?.toString())
		input.setProductDescription(this.productDescription?.toString())
		input.setReservedInstancesOfferingIds(this.reservedInstancesOfferingIds)
		input.setInstanceTenancy(this.instanceTenancy?.toString())
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setOfferingType(this.offeringType?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeReservedInstancesOfferings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-reserved-instances-offerings")
				.argument("availability-zone", availabilityZone)
				.argument("filters", filters?.toString())
				.option("include-marketplace", includeMarketplace ?: false)
				.argument("instance-type", instanceType?.toString())
				.argument("max-duration", maxDuration?.toString())
				.argument("max-instance-count", maxInstanceCount?.toString())
				.argument("min-duration", minDuration?.toString())
				.argument("offering-class", offeringClass?.toString())
				.argument("product-description", productDescription?.toString())
				.argument("reserved-instances-offering-ids", reservedInstancesOfferingIds?.toString())
				.argument("instance-tenancy", instanceTenancy?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("offering-type", offeringType?.toString())
	}

}


fun AmazonEC2Functions.describeRouteTables(init: AmazonEC2DescribeRouteTablesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeRouteTablesCommand().apply(init))
}

@Generated
class AmazonEC2DescribeRouteTablesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeRouteTablesRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var routeTableIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeRouteTablesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeRouteTablesRequest()
		input.setFilters(this.filters)
		input.setRouteTableIds(this.routeTableIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeRouteTables(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-route-tables")
				.argument("filters", filters?.toString())
				.argument("route-table-ids", routeTableIds?.toString())
	}

}


fun AmazonEC2Functions.describeScheduledInstanceAvailability(firstSlotStartTimeRange: com.amazonaws.services.ec2.model.SlotDateTimeRangeRequest, recurrence: com.amazonaws.services.ec2.model.ScheduledInstanceRecurrenceRequest, init: AmazonEC2DescribeScheduledInstanceAvailabilityCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeScheduledInstanceAvailabilityCommand(firstSlotStartTimeRange, recurrence).apply(init))
}

@Generated
class AmazonEC2DescribeScheduledInstanceAvailabilityCommand(val firstSlotStartTimeRange: com.amazonaws.services.ec2.model.SlotDateTimeRangeRequest, val recurrence: com.amazonaws.services.ec2.model.ScheduledInstanceRecurrenceRequest) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxResults: Int? = 0
	var maxSlotDurationInHours: Int? = 0
	var minSlotDurationInHours: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest {
		val input = com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest()
		input.setFilters(this.filters)
		input.setFirstSlotStartTimeRange(this.firstSlotStartTimeRange)
		input.setMaxResults(this.maxResults)
		input.setMaxSlotDurationInHours(this.maxSlotDurationInHours)
		input.setMinSlotDurationInHours(this.minSlotDurationInHours)
		input.setNextToken(this.nextToken)
		input.setRecurrence(this.recurrence)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeScheduledInstanceAvailability(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-scheduled-instance-availability")
				.argument("filters", filters?.toString())
				.argument("first-slot-start-time-range", firstSlotStartTimeRange.toString())
				.argument("max-results", maxResults?.toString())
				.argument("max-slot-duration-in-hours", maxSlotDurationInHours?.toString())
				.argument("min-slot-duration-in-hours", minSlotDurationInHours?.toString())
				.argument("next-token", nextToken)
				.argument("recurrence", recurrence.toString())
	}

}


fun AmazonEC2Functions.describeScheduledInstances(init: AmazonEC2DescribeScheduledInstancesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeScheduledInstancesCommand().apply(init))
}

@Generated
class AmazonEC2DescribeScheduledInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeScheduledInstancesRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var scheduledInstanceIds: List<String>? = null
	var slotStartTimeRange: com.amazonaws.services.ec2.model.SlotStartTimeRangeRequest? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeScheduledInstancesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeScheduledInstancesRequest()
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setScheduledInstanceIds(this.scheduledInstanceIds)
		input.setSlotStartTimeRange(this.slotStartTimeRange)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeScheduledInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-scheduled-instances")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("scheduled-instance-ids", scheduledInstanceIds?.toString())
				.argument("slot-start-time-range", slotStartTimeRange?.toString())
	}

}


fun AmazonEC2Functions.describeSecurityGroupReferences(groupId: List<String>, init: AmazonEC2DescribeSecurityGroupReferencesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeSecurityGroupReferencesCommand(groupId).apply(init))
}

@Generated
class AmazonEC2DescribeSecurityGroupReferencesCommand(val groupId: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesRequest()
		input.setGroupId(this.groupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeSecurityGroupReferences(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-security-group-references")
				.argument("group-id", groupId.toString())
	}

}


fun AmazonEC2Functions.describeSecurityGroups(init: AmazonEC2DescribeSecurityGroupsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeSecurityGroupsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeSecurityGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var groupIds: List<String>? = null
	var groupNames: List<String>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest()
		input.setFilters(this.filters)
		input.setGroupIds(this.groupIds)
		input.setGroupNames(this.groupNames)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeSecurityGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-security-groups")
				.argument("filters", filters?.toString())
				.argument("group-ids", groupIds?.toString())
				.argument("group-names", groupNames?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonEC2Functions.describeSnapshotAttribute(attribute: SnapshotAttributeName, snapshotId: String, init: AmazonEC2DescribeSnapshotAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeSnapshotAttributeCommand(attribute, snapshotId).apply(init))
}

@Generated
class AmazonEC2DescribeSnapshotAttributeCommand(val attribute: SnapshotAttributeName, val snapshotId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeSnapshotAttributeRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DescribeSnapshotAttributeRequest {
		val input = com.amazonaws.services.ec2.model.DescribeSnapshotAttributeRequest()
		input.setAttribute(this.attribute.toString())
		input.setSnapshotId(this.snapshotId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeSnapshotAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-snapshot-attribute")
				.argument("attribute", attribute.toString())
				.argument("snapshot-id", snapshotId)
	}

}


fun AmazonEC2Functions.describeSnapshots(init: AmazonEC2DescribeSnapshotsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeSnapshotsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeSnapshotsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeSnapshotsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var ownerIds: List<String>? = null
	var restorableByUserIds: List<String>? = null
	var snapshotIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeSnapshotsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeSnapshotsRequest()
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setOwnerIds(this.ownerIds)
		input.setRestorableByUserIds(this.restorableByUserIds)
		input.setSnapshotIds(this.snapshotIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeSnapshots(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-snapshots")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("owner-ids", ownerIds?.toString())
				.argument("restorable-by-user-ids", restorableByUserIds?.toString())
				.argument("snapshot-ids", snapshotIds?.toString())
	}

}


fun AmazonEC2Functions.describeSpotDatafeedSubscription(init: AmazonEC2DescribeSpotDatafeedSubscriptionCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeSpotDatafeedSubscriptionCommand().apply(init))
}

@Generated
class AmazonEC2DescribeSpotDatafeedSubscriptionCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionRequest {
		val input = com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeSpotDatafeedSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-spot-datafeed-subscription")

	}

}


fun AmazonEC2Functions.describeSpotFleetInstances(spotFleetRequestId: String, init: AmazonEC2DescribeSpotFleetInstancesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeSpotFleetInstancesCommand(spotFleetRequestId).apply(init))
}

@Generated
class AmazonEC2DescribeSpotFleetInstancesCommand(val spotFleetRequestId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setSpotFleetRequestId(this.spotFleetRequestId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeSpotFleetInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-spot-fleet-instances")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("spot-fleet-request-id", spotFleetRequestId)
	}

}


fun AmazonEC2Functions.describeSpotFleetRequestHistory(spotFleetRequestId: String, startTime: java.util.Date, init: AmazonEC2DescribeSpotFleetRequestHistoryCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeSpotFleetRequestHistoryCommand(spotFleetRequestId, startTime).apply(init))
}

@Generated
class AmazonEC2DescribeSpotFleetRequestHistoryCommand(val spotFleetRequestId: String, val startTime: java.util.Date) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryRequest> {

	var eventType: EventType? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryRequest {
		val input = com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryRequest()
		input.setEventType(this.eventType?.toString())
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setSpotFleetRequestId(this.spotFleetRequestId)
		input.setStartTime(this.startTime)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeSpotFleetRequestHistory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-spot-fleet-request-history")
				.argument("event-type", eventType?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("spot-fleet-request-id", spotFleetRequestId)
				.argument("start-time", startTime.toString())
	}

}


fun AmazonEC2Functions.describeSpotFleetRequests(init: AmazonEC2DescribeSpotFleetRequestsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeSpotFleetRequestsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeSpotFleetRequestsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null
	var spotFleetRequestIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setSpotFleetRequestIds(this.spotFleetRequestIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeSpotFleetRequests(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-spot-fleet-requests")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("spot-fleet-request-ids", spotFleetRequestIds?.toString())
	}

}


fun AmazonEC2Functions.describeSpotInstanceRequests(init: AmazonEC2DescribeSpotInstanceRequestsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeSpotInstanceRequestsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeSpotInstanceRequestsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var spotInstanceRequestIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsRequest()
		input.setFilters(this.filters)
		input.setSpotInstanceRequestIds(this.spotInstanceRequestIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeSpotInstanceRequests(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-spot-instance-requests")
				.argument("filters", filters?.toString())
				.argument("spot-instance-request-ids", spotInstanceRequestIds?.toString())
	}

}


fun AmazonEC2Functions.describeSpotPriceHistory(init: AmazonEC2DescribeSpotPriceHistoryCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeSpotPriceHistoryCommand().apply(init))
}

@Generated
class AmazonEC2DescribeSpotPriceHistoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var availabilityZone: String? = null
	var endTime: java.util.Date? = null
	var instanceTypes: List<InstanceType>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var productDescriptions: List<String>? = null
	var startTime: java.util.Date? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryRequest {
		val input = com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryRequest()
		input.setFilters(this.filters)
		input.setAvailabilityZone(this.availabilityZone)
		input.setEndTime(this.endTime)
		input.setInstanceTypes(this.instanceTypes?.map { it.toString() })
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setProductDescriptions(this.productDescriptions)
		input.setStartTime(this.startTime)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeSpotPriceHistory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-spot-price-history")
				.argument("filters", filters?.toString())
				.argument("availability-zone", availabilityZone)
				.argument("end-time", endTime?.toString())
				.argument("instance-types", instanceTypes?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("product-descriptions", productDescriptions?.toString())
				.argument("start-time", startTime?.toString())
	}

}


fun AmazonEC2Functions.describeStaleSecurityGroups(vpcId: String, init: AmazonEC2DescribeStaleSecurityGroupsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeStaleSecurityGroupsCommand(vpcId).apply(init))
}

@Generated
class AmazonEC2DescribeStaleSecurityGroupsCommand(val vpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeStaleSecurityGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-stale-security-groups")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.describeSubnets(init: AmazonEC2DescribeSubnetsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeSubnetsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeSubnetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeSubnetsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var subnetIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeSubnetsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeSubnetsRequest()
		input.setFilters(this.filters)
		input.setSubnetIds(this.subnetIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeSubnets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-subnets")
				.argument("filters", filters?.toString())
				.argument("subnet-ids", subnetIds?.toString())
	}

}


fun AmazonEC2Functions.describeTags(init: AmazonEC2DescribeTagsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeTagsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeTagsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeTagsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeTagsRequest()
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-tags")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeVolumeAttribute(volumeId: String, init: AmazonEC2DescribeVolumeAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVolumeAttributeCommand(volumeId).apply(init))
}

@Generated
class AmazonEC2DescribeVolumeAttributeCommand(val volumeId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVolumeAttributeRequest> {

	var attribute: VolumeAttributeName? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeVolumeAttributeRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVolumeAttributeRequest()
		input.setAttribute(this.attribute?.toString())
		input.setVolumeId(this.volumeId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVolumeAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-volume-attribute")
				.argument("attribute", attribute?.toString())
				.argument("volume-id", volumeId)
	}

}


fun AmazonEC2Functions.describeVolumeStatus(init: AmazonEC2DescribeVolumeStatusCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVolumeStatusCommand().apply(init))
}

@Generated
class AmazonEC2DescribeVolumeStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVolumeStatusRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null
	var volumeIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeVolumeStatusRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVolumeStatusRequest()
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setVolumeIds(this.volumeIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVolumeStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-volume-status")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("volume-ids", volumeIds?.toString())
	}

}


fun AmazonEC2Functions.describeVolumes(init: AmazonEC2DescribeVolumesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVolumesCommand().apply(init))
}

@Generated
class AmazonEC2DescribeVolumesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVolumesRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var volumeIds: List<String>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeVolumesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVolumesRequest()
		input.setFilters(this.filters)
		input.setVolumeIds(this.volumeIds)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVolumes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-volumes")
				.argument("filters", filters?.toString())
				.argument("volume-ids", volumeIds?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeVolumesModifications(init: AmazonEC2DescribeVolumesModificationsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVolumesModificationsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeVolumesModificationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVolumesModificationsRequest> {

	var volumeIds: List<String>? = null
	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.ec2.model.DescribeVolumesModificationsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVolumesModificationsRequest()
		input.setVolumeIds(this.volumeIds)
		input.setFilters(this.filters)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVolumesModifications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-volumes-modifications")
				.argument("volume-ids", volumeIds?.toString())
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonEC2Functions.describeVpcAttribute(attribute: VpcAttributeName, vpcId: String, init: AmazonEC2DescribeVpcAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVpcAttributeCommand(attribute, vpcId).apply(init))
}

@Generated
class AmazonEC2DescribeVpcAttributeCommand(val attribute: VpcAttributeName, val vpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVpcAttributeRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DescribeVpcAttributeRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVpcAttributeRequest()
		input.setAttribute(this.attribute.toString())
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVpcAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-vpc-attribute")
				.argument("attribute", attribute.toString())
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.describeVpcClassicLink(init: AmazonEC2DescribeVpcClassicLinkCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVpcClassicLinkCommand().apply(init))
}

@Generated
class AmazonEC2DescribeVpcClassicLinkCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVpcClassicLinkRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var vpcIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeVpcClassicLinkRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVpcClassicLinkRequest()
		input.setFilters(this.filters)
		input.setVpcIds(this.vpcIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVpcClassicLink(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-vpc-classic-link")
				.argument("filters", filters?.toString())
				.argument("vpc-ids", vpcIds?.toString())
	}

}


fun AmazonEC2Functions.describeVpcClassicLinkDnsSupport(init: AmazonEC2DescribeVpcClassicLinkDnsSupportCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVpcClassicLinkDnsSupportCommand().apply(init))
}

@Generated
class AmazonEC2DescribeVpcClassicLinkDnsSupportCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null
	var vpcIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setVpcIds(this.vpcIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVpcClassicLinkDnsSupport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-vpc-classic-link-dns-support")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
				.argument("vpc-ids", vpcIds?.toString())
	}

}


fun AmazonEC2Functions.describeVpcEndpointConnectionNotifications(init: AmazonEC2DescribeVpcEndpointConnectionNotificationsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVpcEndpointConnectionNotificationsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeVpcEndpointConnectionNotificationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsRequest> {

	var connectionNotificationId: String? = null
	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsRequest()
		input.setConnectionNotificationId(this.connectionNotificationId)
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVpcEndpointConnectionNotifications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-vpc-endpoint-connection-notifications")
				.argument("connection-notification-id", connectionNotificationId)
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeVpcEndpointConnections(init: AmazonEC2DescribeVpcEndpointConnectionsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVpcEndpointConnectionsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeVpcEndpointConnectionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsRequest()
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVpcEndpointConnections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-vpc-endpoint-connections")
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeVpcEndpointServiceConfigurations(init: AmazonEC2DescribeVpcEndpointServiceConfigurationsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVpcEndpointServiceConfigurationsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeVpcEndpointServiceConfigurationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsRequest> {

	var serviceIds: List<String>? = null
	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsRequest()
		input.setServiceIds(this.serviceIds)
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVpcEndpointServiceConfigurations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-vpc-endpoint-service-configurations")
				.argument("service-ids", serviceIds?.toString())
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeVpcEndpointServicePermissions(serviceId: String, init: AmazonEC2DescribeVpcEndpointServicePermissionsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVpcEndpointServicePermissionsCommand(serviceId).apply(init))
}

@Generated
class AmazonEC2DescribeVpcEndpointServicePermissionsCommand(val serviceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsRequest()
		input.setServiceId(this.serviceId)
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVpcEndpointServicePermissions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-vpc-endpoint-service-permissions")
				.argument("service-id", serviceId)
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeVpcEndpointServices(init: AmazonEC2DescribeVpcEndpointServicesCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVpcEndpointServicesCommand().apply(init))
}

@Generated
class AmazonEC2DescribeVpcEndpointServicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesRequest> {

	var serviceNames: List<String>? = null
	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesRequest()
		input.setServiceNames(this.serviceNames)
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVpcEndpointServices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-vpc-endpoint-services")
				.argument("service-names", serviceNames?.toString())
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeVpcEndpoints(init: AmazonEC2DescribeVpcEndpointsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVpcEndpointsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeVpcEndpointsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVpcEndpointsRequest> {

	var vpcEndpointIds: List<String>? = null
	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeVpcEndpointsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVpcEndpointsRequest()
		input.setVpcEndpointIds(this.vpcEndpointIds)
		input.setFilters(this.filters)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVpcEndpoints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-vpc-endpoints")
				.argument("vpc-endpoint-ids", vpcEndpointIds?.toString())
				.argument("filters", filters?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonEC2Functions.describeVpcPeeringConnections(init: AmazonEC2DescribeVpcPeeringConnectionsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVpcPeeringConnectionsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeVpcPeeringConnectionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var vpcPeeringConnectionIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsRequest()
		input.setFilters(this.filters)
		input.setVpcPeeringConnectionIds(this.vpcPeeringConnectionIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVpcPeeringConnections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-vpc-peering-connections")
				.argument("filters", filters?.toString())
				.argument("vpc-peering-connection-ids", vpcPeeringConnectionIds?.toString())
	}

}


fun AmazonEC2Functions.describeVpcs(init: AmazonEC2DescribeVpcsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVpcsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeVpcsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVpcsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var vpcIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeVpcsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVpcsRequest()
		input.setFilters(this.filters)
		input.setVpcIds(this.vpcIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVpcs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-vpcs")
				.argument("filters", filters?.toString())
				.argument("vpc-ids", vpcIds?.toString())
	}

}


fun AmazonEC2Functions.describeVpnConnections(init: AmazonEC2DescribeVpnConnectionsCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVpnConnectionsCommand().apply(init))
}

@Generated
class AmazonEC2DescribeVpnConnectionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVpnConnectionsRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var vpnConnectionIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeVpnConnectionsRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVpnConnectionsRequest()
		input.setFilters(this.filters)
		input.setVpnConnectionIds(this.vpnConnectionIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVpnConnections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-vpn-connections")
				.argument("filters", filters?.toString())
				.argument("vpn-connection-ids", vpnConnectionIds?.toString())
	}

}


fun AmazonEC2Functions.describeVpnGateways(init: AmazonEC2DescribeVpnGatewaysCommand.() -> Unit) {
	this.block.declare(AmazonEC2DescribeVpnGatewaysCommand().apply(init))
}

@Generated
class AmazonEC2DescribeVpnGatewaysCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DescribeVpnGatewaysRequest> {

	var filters: List<com.amazonaws.services.ec2.model.Filter>? = null
	var vpnGatewayIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.DescribeVpnGatewaysRequest {
		val input = com.amazonaws.services.ec2.model.DescribeVpnGatewaysRequest()
		input.setFilters(this.filters)
		input.setVpnGatewayIds(this.vpnGatewayIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.describeVpnGateways(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 describe-vpn-gateways")
				.argument("filters", filters?.toString())
				.argument("vpn-gateway-ids", vpnGatewayIds?.toString())
	}

}


fun AmazonEC2Functions.detachClassicLinkVpc(instanceId: String, vpcId: String, init: AmazonEC2DetachClassicLinkVpcCommand.() -> Unit) {
	this.block.declare(AmazonEC2DetachClassicLinkVpcCommand(instanceId, vpcId).apply(init))
}

@Generated
class AmazonEC2DetachClassicLinkVpcCommand(val instanceId: String, val vpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DetachClassicLinkVpcRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DetachClassicLinkVpcRequest {
		val input = com.amazonaws.services.ec2.model.DetachClassicLinkVpcRequest()
		input.setInstanceId(this.instanceId)
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.detachClassicLinkVpc(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 detach-classic-link-vpc")
				.argument("instance-id", instanceId)
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.detachInternetGateway(internetGatewayId: String, vpcId: String, init: AmazonEC2DetachInternetGatewayCommand.() -> Unit) {
	this.block.declare(AmazonEC2DetachInternetGatewayCommand(internetGatewayId, vpcId).apply(init))
}

@Generated
class AmazonEC2DetachInternetGatewayCommand(val internetGatewayId: String, val vpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DetachInternetGatewayRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DetachInternetGatewayRequest {
		val input = com.amazonaws.services.ec2.model.DetachInternetGatewayRequest()
		input.setInternetGatewayId(this.internetGatewayId)
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.detachInternetGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 detach-internet-gateway")
				.argument("internet-gateway-id", internetGatewayId)
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.detachNetworkInterface(attachmentId: String, init: AmazonEC2DetachNetworkInterfaceCommand.() -> Unit) {
	this.block.declare(AmazonEC2DetachNetworkInterfaceCommand(attachmentId).apply(init))
}

@Generated
class AmazonEC2DetachNetworkInterfaceCommand(val attachmentId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DetachNetworkInterfaceRequest> {

	var force: Boolean? = false

	override fun build(): com.amazonaws.services.ec2.model.DetachNetworkInterfaceRequest {
		val input = com.amazonaws.services.ec2.model.DetachNetworkInterfaceRequest()
		input.setAttachmentId(this.attachmentId)
		input.setForce(this.force)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.detachNetworkInterface(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 detach-network-interface")
				.argument("attachment-id", attachmentId)
				.option("force", force ?: false)
	}

}


fun AmazonEC2Functions.detachVolume(volumeId: String, init: AmazonEC2DetachVolumeCommand.() -> Unit) {
	this.block.declare(AmazonEC2DetachVolumeCommand(volumeId).apply(init))
}

@Generated
class AmazonEC2DetachVolumeCommand(val volumeId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DetachVolumeRequest> {

	var device: String? = null
	var force: Boolean? = false
	var instanceId: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DetachVolumeRequest {
		val input = com.amazonaws.services.ec2.model.DetachVolumeRequest()
		input.setDevice(this.device)
		input.setForce(this.force)
		input.setInstanceId(this.instanceId)
		input.setVolumeId(this.volumeId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.detachVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 detach-volume")
				.argument("device", device)
				.option("force", force ?: false)
				.argument("instance-id", instanceId)
				.argument("volume-id", volumeId)
	}

}


fun AmazonEC2Functions.detachVpnGateway(vpcId: String, vpnGatewayId: String, init: AmazonEC2DetachVpnGatewayCommand.() -> Unit) {
	this.block.declare(AmazonEC2DetachVpnGatewayCommand(vpcId, vpnGatewayId).apply(init))
}

@Generated
class AmazonEC2DetachVpnGatewayCommand(val vpcId: String, val vpnGatewayId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DetachVpnGatewayRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DetachVpnGatewayRequest {
		val input = com.amazonaws.services.ec2.model.DetachVpnGatewayRequest()
		input.setVpcId(this.vpcId)
		input.setVpnGatewayId(this.vpnGatewayId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.detachVpnGateway(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 detach-vpn-gateway")
				.argument("vpc-id", vpcId)
				.argument("vpn-gateway-id", vpnGatewayId)
	}

}


fun AmazonEC2Functions.disableVgwRoutePropagation(gatewayId: String, routeTableId: String, init: AmazonEC2DisableVgwRoutePropagationCommand.() -> Unit) {
	this.block.declare(AmazonEC2DisableVgwRoutePropagationCommand(gatewayId, routeTableId).apply(init))
}

@Generated
class AmazonEC2DisableVgwRoutePropagationCommand(val gatewayId: String, val routeTableId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DisableVgwRoutePropagationRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DisableVgwRoutePropagationRequest {
		val input = com.amazonaws.services.ec2.model.DisableVgwRoutePropagationRequest()
		input.setGatewayId(this.gatewayId)
		input.setRouteTableId(this.routeTableId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.disableVgwRoutePropagation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 disable-vgw-route-propagation")
				.argument("gateway-id", gatewayId)
				.argument("route-table-id", routeTableId)
	}

}


fun AmazonEC2Functions.disableVpcClassicLink(vpcId: String, init: AmazonEC2DisableVpcClassicLinkCommand.() -> Unit) {
	this.block.declare(AmazonEC2DisableVpcClassicLinkCommand(vpcId).apply(init))
}

@Generated
class AmazonEC2DisableVpcClassicLinkCommand(val vpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DisableVpcClassicLinkRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DisableVpcClassicLinkRequest {
		val input = com.amazonaws.services.ec2.model.DisableVpcClassicLinkRequest()
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.disableVpcClassicLink(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 disable-vpc-classic-link")
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.disableVpcClassicLinkDnsSupport(init: AmazonEC2DisableVpcClassicLinkDnsSupportCommand.() -> Unit) {
	this.block.declare(AmazonEC2DisableVpcClassicLinkDnsSupportCommand().apply(init))
}

@Generated
class AmazonEC2DisableVpcClassicLinkDnsSupportCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest> {

	var vpcId: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest {
		val input = com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest()
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.disableVpcClassicLinkDnsSupport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 disable-vpc-classic-link-dns-support")
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.disassociateAddress(init: AmazonEC2DisassociateAddressCommand.() -> Unit) {
	this.block.declare(AmazonEC2DisassociateAddressCommand().apply(init))
}

@Generated
class AmazonEC2DisassociateAddressCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DisassociateAddressRequest> {

	var associationId: String? = null
	var publicIp: String? = null

	override fun build(): com.amazonaws.services.ec2.model.DisassociateAddressRequest {
		val input = com.amazonaws.services.ec2.model.DisassociateAddressRequest()
		input.setAssociationId(this.associationId)
		input.setPublicIp(this.publicIp)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.disassociateAddress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 disassociate-address")
				.argument("association-id", associationId)
				.argument("public-ip", publicIp)
	}

}


fun AmazonEC2Functions.disassociateIamInstanceProfile(associationId: String, init: AmazonEC2DisassociateIamInstanceProfileCommand.() -> Unit) {
	this.block.declare(AmazonEC2DisassociateIamInstanceProfileCommand(associationId).apply(init))
}

@Generated
class AmazonEC2DisassociateIamInstanceProfileCommand(val associationId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileRequest {
		val input = com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileRequest()
		input.setAssociationId(this.associationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.disassociateIamInstanceProfile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 disassociate-iam-instance-profile")
				.argument("association-id", associationId)
	}

}


fun AmazonEC2Functions.disassociateRouteTable(associationId: String, init: AmazonEC2DisassociateRouteTableCommand.() -> Unit) {
	this.block.declare(AmazonEC2DisassociateRouteTableCommand(associationId).apply(init))
}

@Generated
class AmazonEC2DisassociateRouteTableCommand(val associationId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DisassociateRouteTableRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DisassociateRouteTableRequest {
		val input = com.amazonaws.services.ec2.model.DisassociateRouteTableRequest()
		input.setAssociationId(this.associationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.disassociateRouteTable(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 disassociate-route-table")
				.argument("association-id", associationId)
	}

}


fun AmazonEC2Functions.disassociateSubnetCidrBlock(associationId: String, init: AmazonEC2DisassociateSubnetCidrBlockCommand.() -> Unit) {
	this.block.declare(AmazonEC2DisassociateSubnetCidrBlockCommand(associationId).apply(init))
}

@Generated
class AmazonEC2DisassociateSubnetCidrBlockCommand(val associationId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockRequest {
		val input = com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockRequest()
		input.setAssociationId(this.associationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.disassociateSubnetCidrBlock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 disassociate-subnet-cidr-block")
				.argument("association-id", associationId)
	}

}


fun AmazonEC2Functions.disassociateVpcCidrBlock(associationId: String, init: AmazonEC2DisassociateVpcCidrBlockCommand.() -> Unit) {
	this.block.declare(AmazonEC2DisassociateVpcCidrBlockCommand(associationId).apply(init))
}

@Generated
class AmazonEC2DisassociateVpcCidrBlockCommand(val associationId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockRequest> {



	override fun build(): com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockRequest {
		val input = com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockRequest()
		input.setAssociationId(this.associationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.disassociateVpcCidrBlock(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 disassociate-vpc-cidr-block")
				.argument("association-id", associationId)
	}

}


fun AmazonEC2Functions.enableVgwRoutePropagation(gatewayId: String, routeTableId: String, init: AmazonEC2EnableVgwRoutePropagationCommand.() -> Unit) {
	this.block.declare(AmazonEC2EnableVgwRoutePropagationCommand(gatewayId, routeTableId).apply(init))
}

@Generated
class AmazonEC2EnableVgwRoutePropagationCommand(val gatewayId: String, val routeTableId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.EnableVgwRoutePropagationRequest> {



	override fun build(): com.amazonaws.services.ec2.model.EnableVgwRoutePropagationRequest {
		val input = com.amazonaws.services.ec2.model.EnableVgwRoutePropagationRequest()
		input.setGatewayId(this.gatewayId)
		input.setRouteTableId(this.routeTableId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.enableVgwRoutePropagation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 enable-vgw-route-propagation")
				.argument("gateway-id", gatewayId)
				.argument("route-table-id", routeTableId)
	}

}


fun AmazonEC2Functions.enableVolumeIO(volumeId: String, init: AmazonEC2EnableVolumeIOCommand.() -> Unit) {
	this.block.declare(AmazonEC2EnableVolumeIOCommand(volumeId).apply(init))
}

@Generated
class AmazonEC2EnableVolumeIOCommand(val volumeId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.EnableVolumeIORequest> {



	override fun build(): com.amazonaws.services.ec2.model.EnableVolumeIORequest {
		val input = com.amazonaws.services.ec2.model.EnableVolumeIORequest()
		input.setVolumeId(this.volumeId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.enableVolumeIO(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 enable-volume-io")
				.argument("volume-id", volumeId)
	}

}


fun AmazonEC2Functions.enableVpcClassicLink(vpcId: String, init: AmazonEC2EnableVpcClassicLinkCommand.() -> Unit) {
	this.block.declare(AmazonEC2EnableVpcClassicLinkCommand(vpcId).apply(init))
}

@Generated
class AmazonEC2EnableVpcClassicLinkCommand(val vpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.EnableVpcClassicLinkRequest> {



	override fun build(): com.amazonaws.services.ec2.model.EnableVpcClassicLinkRequest {
		val input = com.amazonaws.services.ec2.model.EnableVpcClassicLinkRequest()
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.enableVpcClassicLink(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 enable-vpc-classic-link")
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.enableVpcClassicLinkDnsSupport(init: AmazonEC2EnableVpcClassicLinkDnsSupportCommand.() -> Unit) {
	this.block.declare(AmazonEC2EnableVpcClassicLinkDnsSupportCommand().apply(init))
}

@Generated
class AmazonEC2EnableVpcClassicLinkDnsSupportCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportRequest> {

	var vpcId: String? = null

	override fun build(): com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportRequest {
		val input = com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportRequest()
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.enableVpcClassicLinkDnsSupport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 enable-vpc-classic-link-dns-support")
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.getConsoleOutput(instanceId: String, init: AmazonEC2GetConsoleOutputCommand.() -> Unit) {
	this.block.declare(AmazonEC2GetConsoleOutputCommand(instanceId).apply(init))
}

@Generated
class AmazonEC2GetConsoleOutputCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.GetConsoleOutputRequest> {



	override fun build(): com.amazonaws.services.ec2.model.GetConsoleOutputRequest {
		val input = com.amazonaws.services.ec2.model.GetConsoleOutputRequest()
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.getConsoleOutput(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 get-console-output")
				.argument("instance-id", instanceId)
	}

}


fun AmazonEC2Functions.getConsoleScreenshot(instanceId: String, init: AmazonEC2GetConsoleScreenshotCommand.() -> Unit) {
	this.block.declare(AmazonEC2GetConsoleScreenshotCommand(instanceId).apply(init))
}

@Generated
class AmazonEC2GetConsoleScreenshotCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.GetConsoleScreenshotRequest> {

	var wakeUp: Boolean? = false

	override fun build(): com.amazonaws.services.ec2.model.GetConsoleScreenshotRequest {
		val input = com.amazonaws.services.ec2.model.GetConsoleScreenshotRequest()
		input.setInstanceId(this.instanceId)
		input.setWakeUp(this.wakeUp)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.getConsoleScreenshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 get-console-screenshot")
				.argument("instance-id", instanceId)
				.option("wake-up", wakeUp ?: false)
	}

}


fun AmazonEC2Functions.getHostReservationPurchasePreview(hostIdSet: List<String>, offeringId: String, init: AmazonEC2GetHostReservationPurchasePreviewCommand.() -> Unit) {
	this.block.declare(AmazonEC2GetHostReservationPurchasePreviewCommand(hostIdSet, offeringId).apply(init))
}

@Generated
class AmazonEC2GetHostReservationPurchasePreviewCommand(val hostIdSet: List<String>, val offeringId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewRequest> {



	override fun build(): com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewRequest {
		val input = com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewRequest()
		input.setHostIdSet(this.hostIdSet)
		input.setOfferingId(this.offeringId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.getHostReservationPurchasePreview(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 get-host-reservation-purchase-preview")
				.argument("host-id-set", hostIdSet.toString())
				.argument("offering-id", offeringId)
	}

}


fun AmazonEC2Functions.getLaunchTemplateData(instanceId: String, init: AmazonEC2GetLaunchTemplateDataCommand.() -> Unit) {
	this.block.declare(AmazonEC2GetLaunchTemplateDataCommand(instanceId).apply(init))
}

@Generated
class AmazonEC2GetLaunchTemplateDataCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.GetLaunchTemplateDataRequest> {



	override fun build(): com.amazonaws.services.ec2.model.GetLaunchTemplateDataRequest {
		val input = com.amazonaws.services.ec2.model.GetLaunchTemplateDataRequest()
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.getLaunchTemplateData(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 get-launch-template-data")
				.argument("instance-id", instanceId)
	}

}


fun AmazonEC2Functions.getPasswordData(instanceId: String, init: AmazonEC2GetPasswordDataCommand.() -> Unit) {
	this.block.declare(AmazonEC2GetPasswordDataCommand(instanceId).apply(init))
}

@Generated
class AmazonEC2GetPasswordDataCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.GetPasswordDataRequest> {



	override fun build(): com.amazonaws.services.ec2.model.GetPasswordDataRequest {
		val input = com.amazonaws.services.ec2.model.GetPasswordDataRequest()
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.getPasswordData(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 get-password-data")
				.argument("instance-id", instanceId)
	}

}


fun AmazonEC2Functions.getReservedInstancesExchangeQuote(reservedInstanceIds: List<String>, init: AmazonEC2GetReservedInstancesExchangeQuoteCommand.() -> Unit) {
	this.block.declare(AmazonEC2GetReservedInstancesExchangeQuoteCommand(reservedInstanceIds).apply(init))
}

@Generated
class AmazonEC2GetReservedInstancesExchangeQuoteCommand(val reservedInstanceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteRequest> {

	var targetConfigurations: List<com.amazonaws.services.ec2.model.TargetConfigurationRequest>? = null

	override fun build(): com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteRequest {
		val input = com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteRequest()
		input.setReservedInstanceIds(this.reservedInstanceIds)
		input.setTargetConfigurations(this.targetConfigurations)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.getReservedInstancesExchangeQuote(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 get-reserved-instances-exchange-quote")
				.argument("reserved-instance-ids", reservedInstanceIds.toString())
				.argument("target-configurations", targetConfigurations?.toString())
	}

}


fun AmazonEC2Functions.importImage(init: AmazonEC2ImportImageCommand.() -> Unit) {
	this.block.declare(AmazonEC2ImportImageCommand().apply(init))
}

@Generated
class AmazonEC2ImportImageCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ImportImageRequest> {

	var architecture: String? = null
	var clientData: com.amazonaws.services.ec2.model.ClientData? = null
	var clientToken: String? = null
	var description: String? = null
	var diskContainers: List<com.amazonaws.services.ec2.model.ImageDiskContainer>? = null
	var hypervisor: String? = null
	var licenseType: String? = null
	var platform: String? = null
	var roleName: String? = null

	override fun build(): com.amazonaws.services.ec2.model.ImportImageRequest {
		val input = com.amazonaws.services.ec2.model.ImportImageRequest()
		input.setArchitecture(this.architecture)
		input.setClientData(this.clientData)
		input.setClientToken(this.clientToken)
		input.setDescription(this.description)
		input.setDiskContainers(this.diskContainers)
		input.setHypervisor(this.hypervisor)
		input.setLicenseType(this.licenseType)
		input.setPlatform(this.platform)
		input.setRoleName(this.roleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.importImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 import-image")
				.argument("architecture", architecture)
				.argument("client-data", clientData?.toString())
				.argument("client-token", clientToken)
				.argument("description", description)
				.argument("disk-containers", diskContainers?.toString())
				.argument("hypervisor", hypervisor)
				.argument("license-type", licenseType)
				.argument("platform", platform)
				.argument("role-name", roleName)
	}

}


fun AmazonEC2Functions.importInstance(platform: PlatformValues, init: AmazonEC2ImportInstanceCommand.() -> Unit) {
	this.block.declare(AmazonEC2ImportInstanceCommand(platform).apply(init))
}

@Generated
class AmazonEC2ImportInstanceCommand(val platform: PlatformValues) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ImportInstanceRequest> {

	var description: String? = null
	var diskImages: List<com.amazonaws.services.ec2.model.DiskImage>? = null
	var launchSpecification: com.amazonaws.services.ec2.model.ImportInstanceLaunchSpecification? = null

	override fun build(): com.amazonaws.services.ec2.model.ImportInstanceRequest {
		val input = com.amazonaws.services.ec2.model.ImportInstanceRequest()
		input.setDescription(this.description)
		input.setDiskImages(this.diskImages)
		input.setLaunchSpecification(this.launchSpecification)
		input.setPlatform(this.platform.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.importInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 import-instance")
				.argument("description", description)
				.argument("disk-images", diskImages?.toString())
				.argument("launch-specification", launchSpecification?.toString())
				.argument("platform", platform.toString())
	}

}


fun AmazonEC2Functions.importKeyPair(keyName: String, publicKeyMaterial: String, init: AmazonEC2ImportKeyPairCommand.() -> Unit) {
	this.block.declare(AmazonEC2ImportKeyPairCommand(keyName, publicKeyMaterial).apply(init))
}

@Generated
class AmazonEC2ImportKeyPairCommand(val keyName: String, val publicKeyMaterial: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ImportKeyPairRequest> {



	override fun build(): com.amazonaws.services.ec2.model.ImportKeyPairRequest {
		val input = com.amazonaws.services.ec2.model.ImportKeyPairRequest()
		input.setKeyName(this.keyName)
		input.setPublicKeyMaterial(this.publicKeyMaterial)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.importKeyPair(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 import-key-pair")
				.argument("key-name", keyName)
				.argument("public-key-material", publicKeyMaterial)
	}

}


fun AmazonEC2Functions.importSnapshot(init: AmazonEC2ImportSnapshotCommand.() -> Unit) {
	this.block.declare(AmazonEC2ImportSnapshotCommand().apply(init))
}

@Generated
class AmazonEC2ImportSnapshotCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ImportSnapshotRequest> {

	var clientData: com.amazonaws.services.ec2.model.ClientData? = null
	var clientToken: String? = null
	var description: String? = null
	var diskContainer: com.amazonaws.services.ec2.model.SnapshotDiskContainer? = null
	var roleName: String? = null

	override fun build(): com.amazonaws.services.ec2.model.ImportSnapshotRequest {
		val input = com.amazonaws.services.ec2.model.ImportSnapshotRequest()
		input.setClientData(this.clientData)
		input.setClientToken(this.clientToken)
		input.setDescription(this.description)
		input.setDiskContainer(this.diskContainer)
		input.setRoleName(this.roleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.importSnapshot(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 import-snapshot")
				.argument("client-data", clientData?.toString())
				.argument("client-token", clientToken)
				.argument("description", description)
				.argument("disk-container", diskContainer?.toString())
				.argument("role-name", roleName)
	}

}


fun AmazonEC2Functions.importVolume(availabilityZone: String, image: com.amazonaws.services.ec2.model.DiskImageDetail, volume: com.amazonaws.services.ec2.model.VolumeDetail, init: AmazonEC2ImportVolumeCommand.() -> Unit) {
	this.block.declare(AmazonEC2ImportVolumeCommand(availabilityZone, image, volume).apply(init))
}

@Generated
class AmazonEC2ImportVolumeCommand(val availabilityZone: String, val image: com.amazonaws.services.ec2.model.DiskImageDetail, val volume: com.amazonaws.services.ec2.model.VolumeDetail) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ImportVolumeRequest> {

	var description: String? = null

	override fun build(): com.amazonaws.services.ec2.model.ImportVolumeRequest {
		val input = com.amazonaws.services.ec2.model.ImportVolumeRequest()
		input.setAvailabilityZone(this.availabilityZone)
		input.setDescription(this.description)
		input.setImage(this.image)
		input.setVolume(this.volume)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.importVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 import-volume")
				.argument("availability-zone", availabilityZone)
				.argument("description", description)
				.argument("image", image.toString())
				.argument("volume", volume.toString())
	}

}


fun AmazonEC2Functions.modifyFpgaImageAttribute(fpgaImageId: String, init: AmazonEC2ModifyFpgaImageAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyFpgaImageAttributeCommand(fpgaImageId).apply(init))
}

@Generated
class AmazonEC2ModifyFpgaImageAttributeCommand(val fpgaImageId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeRequest> {

	var attribute: FpgaImageAttributeName? = null
	var operationType: OperationType? = null
	var userIds: List<String>? = null
	var userGroups: List<String>? = null
	var productCodes: List<String>? = null
	var loadPermission: com.amazonaws.services.ec2.model.LoadPermissionModifications? = null
	var description: String? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeRequest {
		val input = com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeRequest()
		input.setFpgaImageId(this.fpgaImageId)
		input.setAttribute(this.attribute?.toString())
		input.setOperationType(this.operationType?.toString())
		input.setUserIds(this.userIds)
		input.setUserGroups(this.userGroups)
		input.setProductCodes(this.productCodes)
		input.setLoadPermission(this.loadPermission)
		input.setDescription(this.description)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyFpgaImageAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-fpga-image-attribute")
				.argument("fpga-image-id", fpgaImageId)
				.argument("attribute", attribute?.toString())
				.argument("operation-type", operationType?.toString())
				.argument("user-ids", userIds?.toString())
				.argument("user-groups", userGroups?.toString())
				.argument("product-codes", productCodes?.toString())
				.argument("load-permission", loadPermission?.toString())
				.argument("description", description)
				.argument("name", name)
	}

}


fun AmazonEC2Functions.modifyHosts(autoPlacement: AutoPlacement, hostIds: List<String>, init: AmazonEC2ModifyHostsCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyHostsCommand(autoPlacement, hostIds).apply(init))
}

@Generated
class AmazonEC2ModifyHostsCommand(val autoPlacement: AutoPlacement, val hostIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyHostsRequest> {



	override fun build(): com.amazonaws.services.ec2.model.ModifyHostsRequest {
		val input = com.amazonaws.services.ec2.model.ModifyHostsRequest()
		input.setAutoPlacement(this.autoPlacement.toString())
		input.setHostIds(this.hostIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyHosts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-hosts")
				.argument("auto-placement", autoPlacement.toString())
				.argument("host-ids", hostIds.toString())
	}

}


fun AmazonEC2Functions.modifyIdFormat(resource: String, useLongIds: Boolean, init: AmazonEC2ModifyIdFormatCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyIdFormatCommand(resource, useLongIds).apply(init))
}

@Generated
class AmazonEC2ModifyIdFormatCommand(val resource: String, val useLongIds: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyIdFormatRequest> {



	override fun build(): com.amazonaws.services.ec2.model.ModifyIdFormatRequest {
		val input = com.amazonaws.services.ec2.model.ModifyIdFormatRequest()
		input.setResource(this.resource)
		input.setUseLongIds(this.useLongIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyIdFormat(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-id-format")
				.argument("resource", resource)
				.option("use-long-ids", useLongIds ?: false)
	}

}


fun AmazonEC2Functions.modifyIdentityIdFormat(principalArn: String, resource: String, useLongIds: Boolean, init: AmazonEC2ModifyIdentityIdFormatCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyIdentityIdFormatCommand(principalArn, resource, useLongIds).apply(init))
}

@Generated
class AmazonEC2ModifyIdentityIdFormatCommand(val principalArn: String, val resource: String, val useLongIds: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyIdentityIdFormatRequest> {



	override fun build(): com.amazonaws.services.ec2.model.ModifyIdentityIdFormatRequest {
		val input = com.amazonaws.services.ec2.model.ModifyIdentityIdFormatRequest()
		input.setPrincipalArn(this.principalArn)
		input.setResource(this.resource)
		input.setUseLongIds(this.useLongIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyIdentityIdFormat(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-identity-id-format")
				.argument("principal-arn", principalArn)
				.argument("resource", resource)
				.option("use-long-ids", useLongIds ?: false)
	}

}


fun AmazonEC2Functions.modifyImageAttribute(imageId: String, init: AmazonEC2ModifyImageAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyImageAttributeCommand(imageId).apply(init))
}

@Generated
class AmazonEC2ModifyImageAttributeCommand(val imageId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyImageAttributeRequest> {

	var attribute: String? = null
	var description: String? = null
	var launchPermission: com.amazonaws.services.ec2.model.LaunchPermissionModifications? = null
	var operationType: OperationType? = null
	var productCodes: List<String>? = null
	var userGroups: List<String>? = null
	var userIds: List<String>? = null
	var value: String? = null

	override fun build(): com.amazonaws.services.ec2.model.ModifyImageAttributeRequest {
		val input = com.amazonaws.services.ec2.model.ModifyImageAttributeRequest()
		input.setAttribute(this.attribute)
		input.setDescription(this.description)
		input.setImageId(this.imageId)
		input.setLaunchPermission(this.launchPermission)
		input.setOperationType(this.operationType?.toString())
		input.setProductCodes(this.productCodes)
		input.setUserGroups(this.userGroups)
		input.setUserIds(this.userIds)
		input.setValue(this.value)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyImageAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-image-attribute")
				.argument("attribute", attribute)
				.argument("description", description)
				.argument("image-id", imageId)
				.argument("launch-permission", launchPermission?.toString())
				.argument("operation-type", operationType?.toString())
				.argument("product-codes", productCodes?.toString())
				.argument("user-groups", userGroups?.toString())
				.argument("user-ids", userIds?.toString())
				.argument("value", value)
	}

}


fun AmazonEC2Functions.modifyInstanceAttribute(instanceId: String, init: AmazonEC2ModifyInstanceAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyInstanceAttributeCommand(instanceId).apply(init))
}

@Generated
class AmazonEC2ModifyInstanceAttributeCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyInstanceAttributeRequest> {

	var sourceDestCheck: Boolean? = false
	var attribute: InstanceAttributeName? = null
	var blockDeviceMappings: List<com.amazonaws.services.ec2.model.InstanceBlockDeviceMappingSpecification>? = null
	var disableApiTermination: Boolean? = false
	var ebsOptimized: Boolean? = false
	var enaSupport: Boolean? = false
	var groups: List<String>? = null
	var instanceInitiatedShutdownBehavior: String? = null
	var instanceType: String? = null
	var kernel: String? = null
	var ramdisk: String? = null
	var sriovNetSupport: String? = null
	var userData: String? = null
	var value: String? = null

	override fun build(): com.amazonaws.services.ec2.model.ModifyInstanceAttributeRequest {
		val input = com.amazonaws.services.ec2.model.ModifyInstanceAttributeRequest()
		input.setSourceDestCheck(this.sourceDestCheck)
		input.setAttribute(this.attribute?.toString())
		input.setBlockDeviceMappings(this.blockDeviceMappings)
		input.setDisableApiTermination(this.disableApiTermination)
		input.setEbsOptimized(this.ebsOptimized)
		input.setEnaSupport(this.enaSupport)
		input.setGroups(this.groups)
		input.setInstanceId(this.instanceId)
		input.setInstanceInitiatedShutdownBehavior(this.instanceInitiatedShutdownBehavior)
		input.setInstanceType(this.instanceType)
		input.setKernel(this.kernel)
		input.setRamdisk(this.ramdisk)
		input.setSriovNetSupport(this.sriovNetSupport)
		input.setUserData(this.userData)
		input.setValue(this.value)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyInstanceAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-instance-attribute")
				.option("source-dest-check", sourceDestCheck ?: false)
				.argument("attribute", attribute?.toString())
				.argument("block-device-mappings", blockDeviceMappings?.toString())
				.option("disable-api-termination", disableApiTermination ?: false)
				.option("ebs-optimized", ebsOptimized ?: false)
				.option("ena-support", enaSupport ?: false)
				.argument("groups", groups?.toString())
				.argument("instance-id", instanceId)
				.argument("instance-initiated-shutdown-behavior", instanceInitiatedShutdownBehavior)
				.argument("instance-type", instanceType)
				.argument("kernel", kernel)
				.argument("ramdisk", ramdisk)
				.argument("sriov-net-support", sriovNetSupport)
				.argument("user-data", userData)
				.argument("value", value)
	}

}


fun AmazonEC2Functions.modifyInstanceCreditSpecification(instanceCreditSpecifications: List<com.amazonaws.services.ec2.model.InstanceCreditSpecificationRequest>, init: AmazonEC2ModifyInstanceCreditSpecificationCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyInstanceCreditSpecificationCommand(instanceCreditSpecifications).apply(init))
}

@Generated
class AmazonEC2ModifyInstanceCreditSpecificationCommand(val instanceCreditSpecifications: List<com.amazonaws.services.ec2.model.InstanceCreditSpecificationRequest>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationRequest> {

	var clientToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationRequest {
		val input = com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationRequest()
		input.setClientToken(this.clientToken)
		input.setInstanceCreditSpecifications(this.instanceCreditSpecifications)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyInstanceCreditSpecification(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-instance-credit-specification")
				.argument("client-token", clientToken)
				.argument("instance-credit-specifications", instanceCreditSpecifications.toString())
	}

}


fun AmazonEC2Functions.modifyInstancePlacement(instanceId: String, init: AmazonEC2ModifyInstancePlacementCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyInstancePlacementCommand(instanceId).apply(init))
}

@Generated
class AmazonEC2ModifyInstancePlacementCommand(val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyInstancePlacementRequest> {

	var affinity: Affinity? = null
	var groupName: String? = null
	var hostId: String? = null
	var tenancy: HostTenancy? = null

	override fun build(): com.amazonaws.services.ec2.model.ModifyInstancePlacementRequest {
		val input = com.amazonaws.services.ec2.model.ModifyInstancePlacementRequest()
		input.setAffinity(this.affinity?.toString())
		input.setGroupName(this.groupName)
		input.setHostId(this.hostId)
		input.setInstanceId(this.instanceId)
		input.setTenancy(this.tenancy?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyInstancePlacement(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-instance-placement")
				.argument("affinity", affinity?.toString())
				.argument("group-name", groupName)
				.argument("host-id", hostId)
				.argument("instance-id", instanceId)
				.argument("tenancy", tenancy?.toString())
	}

}


fun AmazonEC2Functions.modifyLaunchTemplate(init: AmazonEC2ModifyLaunchTemplateCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyLaunchTemplateCommand().apply(init))
}

@Generated
class AmazonEC2ModifyLaunchTemplateCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyLaunchTemplateRequest> {

	var clientToken: String? = null
	var launchTemplateId: String? = null
	var launchTemplateName: String? = null
	var defaultVersion: String? = null

	override fun build(): com.amazonaws.services.ec2.model.ModifyLaunchTemplateRequest {
		val input = com.amazonaws.services.ec2.model.ModifyLaunchTemplateRequest()
		input.setClientToken(this.clientToken)
		input.setLaunchTemplateId(this.launchTemplateId)
		input.setLaunchTemplateName(this.launchTemplateName)
		input.setDefaultVersion(this.defaultVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyLaunchTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-launch-template")
				.argument("client-token", clientToken)
				.argument("launch-template-id", launchTemplateId)
				.argument("launch-template-name", launchTemplateName)
				.argument("default-version", defaultVersion)
	}

}


fun AmazonEC2Functions.modifyNetworkInterfaceAttribute(networkInterfaceId: String, init: AmazonEC2ModifyNetworkInterfaceAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyNetworkInterfaceAttributeCommand(networkInterfaceId).apply(init))
}

@Generated
class AmazonEC2ModifyNetworkInterfaceAttributeCommand(val networkInterfaceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeRequest> {

	var attachment: com.amazonaws.services.ec2.model.NetworkInterfaceAttachmentChanges? = null
	var description: String? = null
	var groups: List<String>? = null
	var sourceDestCheck: Boolean? = false

	override fun build(): com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeRequest {
		val input = com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeRequest()
		input.setAttachment(this.attachment)
		input.setDescription(this.description)
		input.setGroups(this.groups)
		input.setNetworkInterfaceId(this.networkInterfaceId)
		input.setSourceDestCheck(this.sourceDestCheck)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyNetworkInterfaceAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-network-interface-attribute")
				.argument("attachment", attachment?.toString())
				.argument("description", description)
				.argument("groups", groups?.toString())
				.argument("network-interface-id", networkInterfaceId)
				.option("source-dest-check", sourceDestCheck ?: false)
	}

}


fun AmazonEC2Functions.modifyReservedInstances(reservedInstancesIds: List<String>, targetConfigurations: List<com.amazonaws.services.ec2.model.ReservedInstancesConfiguration>, init: AmazonEC2ModifyReservedInstancesCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyReservedInstancesCommand(reservedInstancesIds, targetConfigurations).apply(init))
}

@Generated
class AmazonEC2ModifyReservedInstancesCommand(val reservedInstancesIds: List<String>, val targetConfigurations: List<com.amazonaws.services.ec2.model.ReservedInstancesConfiguration>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyReservedInstancesRequest> {

	var clientToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.ModifyReservedInstancesRequest {
		val input = com.amazonaws.services.ec2.model.ModifyReservedInstancesRequest()
		input.setReservedInstancesIds(this.reservedInstancesIds)
		input.setClientToken(this.clientToken)
		input.setTargetConfigurations(this.targetConfigurations)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyReservedInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-reserved-instances")
				.argument("reserved-instances-ids", reservedInstancesIds.toString())
				.argument("client-token", clientToken)
				.argument("target-configurations", targetConfigurations.toString())
	}

}


fun AmazonEC2Functions.modifySnapshotAttribute(snapshotId: String, init: AmazonEC2ModifySnapshotAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifySnapshotAttributeCommand(snapshotId).apply(init))
}

@Generated
class AmazonEC2ModifySnapshotAttributeCommand(val snapshotId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifySnapshotAttributeRequest> {

	var attribute: SnapshotAttributeName? = null
	var createVolumePermission: com.amazonaws.services.ec2.model.CreateVolumePermissionModifications? = null
	var groupNames: List<String>? = null
	var operationType: OperationType? = null
	var userIds: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.ModifySnapshotAttributeRequest {
		val input = com.amazonaws.services.ec2.model.ModifySnapshotAttributeRequest()
		input.setAttribute(this.attribute?.toString())
		input.setCreateVolumePermission(this.createVolumePermission)
		input.setGroupNames(this.groupNames)
		input.setOperationType(this.operationType?.toString())
		input.setSnapshotId(this.snapshotId)
		input.setUserIds(this.userIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifySnapshotAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-snapshot-attribute")
				.argument("attribute", attribute?.toString())
				.argument("create-volume-permission", createVolumePermission?.toString())
				.argument("group-names", groupNames?.toString())
				.argument("operation-type", operationType?.toString())
				.argument("snapshot-id", snapshotId)
				.argument("user-ids", userIds?.toString())
	}

}


fun AmazonEC2Functions.modifySpotFleetRequest(spotFleetRequestId: String, init: AmazonEC2ModifySpotFleetRequestCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifySpotFleetRequestCommand(spotFleetRequestId).apply(init))
}

@Generated
class AmazonEC2ModifySpotFleetRequestCommand(val spotFleetRequestId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifySpotFleetRequestRequest> {

	var excessCapacityTerminationPolicy: ExcessCapacityTerminationPolicy? = null
	var targetCapacity: Int? = 0

	override fun build(): com.amazonaws.services.ec2.model.ModifySpotFleetRequestRequest {
		val input = com.amazonaws.services.ec2.model.ModifySpotFleetRequestRequest()
		input.setExcessCapacityTerminationPolicy(this.excessCapacityTerminationPolicy?.toString())
		input.setSpotFleetRequestId(this.spotFleetRequestId)
		input.setTargetCapacity(this.targetCapacity)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifySpotFleetRequest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-spot-fleet-request")
				.argument("excess-capacity-termination-policy", excessCapacityTerminationPolicy?.toString())
				.argument("spot-fleet-request-id", spotFleetRequestId)
				.argument("target-capacity", targetCapacity?.toString())
	}

}


fun AmazonEC2Functions.modifySubnetAttribute(subnetId: String, init: AmazonEC2ModifySubnetAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifySubnetAttributeCommand(subnetId).apply(init))
}

@Generated
class AmazonEC2ModifySubnetAttributeCommand(val subnetId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifySubnetAttributeRequest> {

	var assignIpv6AddressOnCreation: Boolean? = false
	var mapPublicIpOnLaunch: Boolean? = false

	override fun build(): com.amazonaws.services.ec2.model.ModifySubnetAttributeRequest {
		val input = com.amazonaws.services.ec2.model.ModifySubnetAttributeRequest()
		input.setAssignIpv6AddressOnCreation(this.assignIpv6AddressOnCreation)
		input.setMapPublicIpOnLaunch(this.mapPublicIpOnLaunch)
		input.setSubnetId(this.subnetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifySubnetAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-subnet-attribute")
				.option("assign-ipv6-address-on-creation", assignIpv6AddressOnCreation ?: false)
				.option("map-public-ip-on-launch", mapPublicIpOnLaunch ?: false)
				.argument("subnet-id", subnetId)
	}

}


fun AmazonEC2Functions.modifyVolume(volumeId: String, init: AmazonEC2ModifyVolumeCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyVolumeCommand(volumeId).apply(init))
}

@Generated
class AmazonEC2ModifyVolumeCommand(val volumeId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyVolumeRequest> {

	var size: Int? = 0
	var volumeType: VolumeType? = null
	var iops: Int? = 0

	override fun build(): com.amazonaws.services.ec2.model.ModifyVolumeRequest {
		val input = com.amazonaws.services.ec2.model.ModifyVolumeRequest()
		input.setVolumeId(this.volumeId)
		input.setSize(this.size)
		input.setVolumeType(this.volumeType?.toString())
		input.setIops(this.iops)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyVolume(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-volume")
				.argument("volume-id", volumeId)
				.argument("size", size?.toString())
				.argument("volume-type", volumeType?.toString())
				.argument("iops", iops?.toString())
	}

}


fun AmazonEC2Functions.modifyVolumeAttribute(volumeId: String, init: AmazonEC2ModifyVolumeAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyVolumeAttributeCommand(volumeId).apply(init))
}

@Generated
class AmazonEC2ModifyVolumeAttributeCommand(val volumeId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyVolumeAttributeRequest> {

	var autoEnableIO: Boolean? = false

	override fun build(): com.amazonaws.services.ec2.model.ModifyVolumeAttributeRequest {
		val input = com.amazonaws.services.ec2.model.ModifyVolumeAttributeRequest()
		input.setAutoEnableIO(this.autoEnableIO)
		input.setVolumeId(this.volumeId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyVolumeAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-volume-attribute")
				.option("auto-enable-io", autoEnableIO ?: false)
				.argument("volume-id", volumeId)
	}

}


fun AmazonEC2Functions.modifyVpcAttribute(vpcId: String, init: AmazonEC2ModifyVpcAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyVpcAttributeCommand(vpcId).apply(init))
}

@Generated
class AmazonEC2ModifyVpcAttributeCommand(val vpcId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyVpcAttributeRequest> {

	var enableDnsHostnames: Boolean? = false
	var enableDnsSupport: Boolean? = false

	override fun build(): com.amazonaws.services.ec2.model.ModifyVpcAttributeRequest {
		val input = com.amazonaws.services.ec2.model.ModifyVpcAttributeRequest()
		input.setEnableDnsHostnames(this.enableDnsHostnames)
		input.setEnableDnsSupport(this.enableDnsSupport)
		input.setVpcId(this.vpcId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyVpcAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-vpc-attribute")
				.option("enable-dns-hostnames", enableDnsHostnames ?: false)
				.option("enable-dns-support", enableDnsSupport ?: false)
				.argument("vpc-id", vpcId)
	}

}


fun AmazonEC2Functions.modifyVpcEndpoint(vpcEndpointId: String, init: AmazonEC2ModifyVpcEndpointCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyVpcEndpointCommand(vpcEndpointId).apply(init))
}

@Generated
class AmazonEC2ModifyVpcEndpointCommand(val vpcEndpointId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyVpcEndpointRequest> {

	var resetPolicy: Boolean? = false
	var policyDocument: String? = null
	var addRouteTableIds: List<String>? = null
	var removeRouteTableIds: List<String>? = null
	var addSubnetIds: List<String>? = null
	var removeSubnetIds: List<String>? = null
	var addSecurityGroupIds: List<String>? = null
	var removeSecurityGroupIds: List<String>? = null
	var privateDnsEnabled: Boolean? = false

	override fun build(): com.amazonaws.services.ec2.model.ModifyVpcEndpointRequest {
		val input = com.amazonaws.services.ec2.model.ModifyVpcEndpointRequest()
		input.setVpcEndpointId(this.vpcEndpointId)
		input.setResetPolicy(this.resetPolicy)
		input.setPolicyDocument(this.policyDocument)
		input.setAddRouteTableIds(this.addRouteTableIds)
		input.setRemoveRouteTableIds(this.removeRouteTableIds)
		input.setAddSubnetIds(this.addSubnetIds)
		input.setRemoveSubnetIds(this.removeSubnetIds)
		input.setAddSecurityGroupIds(this.addSecurityGroupIds)
		input.setRemoveSecurityGroupIds(this.removeSecurityGroupIds)
		input.setPrivateDnsEnabled(this.privateDnsEnabled)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyVpcEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-vpc-endpoint")
				.argument("vpc-endpoint-id", vpcEndpointId)
				.option("reset-policy", resetPolicy ?: false)
				.argument("policy-document", policyDocument)
				.argument("add-route-table-ids", addRouteTableIds?.toString())
				.argument("remove-route-table-ids", removeRouteTableIds?.toString())
				.argument("add-subnet-ids", addSubnetIds?.toString())
				.argument("remove-subnet-ids", removeSubnetIds?.toString())
				.argument("add-security-group-ids", addSecurityGroupIds?.toString())
				.argument("remove-security-group-ids", removeSecurityGroupIds?.toString())
				.option("private-dns-enabled", privateDnsEnabled ?: false)
	}

}


fun AmazonEC2Functions.modifyVpcEndpointConnectionNotification(connectionNotificationId: String, init: AmazonEC2ModifyVpcEndpointConnectionNotificationCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyVpcEndpointConnectionNotificationCommand(connectionNotificationId).apply(init))
}

@Generated
class AmazonEC2ModifyVpcEndpointConnectionNotificationCommand(val connectionNotificationId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest> {

	var connectionNotificationArn: String? = null
	var connectionEvents: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest {
		val input = com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest()
		input.setConnectionNotificationId(this.connectionNotificationId)
		input.setConnectionNotificationArn(this.connectionNotificationArn)
		input.setConnectionEvents(this.connectionEvents)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyVpcEndpointConnectionNotification(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-vpc-endpoint-connection-notification")
				.argument("connection-notification-id", connectionNotificationId)
				.argument("connection-notification-arn", connectionNotificationArn)
				.argument("connection-events", connectionEvents?.toString())
	}

}


fun AmazonEC2Functions.modifyVpcEndpointServiceConfiguration(serviceId: String, init: AmazonEC2ModifyVpcEndpointServiceConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyVpcEndpointServiceConfigurationCommand(serviceId).apply(init))
}

@Generated
class AmazonEC2ModifyVpcEndpointServiceConfigurationCommand(val serviceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationRequest> {

	var acceptanceRequired: Boolean? = false
	var addNetworkLoadBalancerArns: List<String>? = null
	var removeNetworkLoadBalancerArns: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationRequest {
		val input = com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationRequest()
		input.setServiceId(this.serviceId)
		input.setAcceptanceRequired(this.acceptanceRequired)
		input.setAddNetworkLoadBalancerArns(this.addNetworkLoadBalancerArns)
		input.setRemoveNetworkLoadBalancerArns(this.removeNetworkLoadBalancerArns)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyVpcEndpointServiceConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-vpc-endpoint-service-configuration")
				.argument("service-id", serviceId)
				.option("acceptance-required", acceptanceRequired ?: false)
				.argument("add-network-load-balancer-arns", addNetworkLoadBalancerArns?.toString())
				.argument("remove-network-load-balancer-arns", removeNetworkLoadBalancerArns?.toString())
	}

}


fun AmazonEC2Functions.modifyVpcEndpointServicePermissions(serviceId: String, init: AmazonEC2ModifyVpcEndpointServicePermissionsCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyVpcEndpointServicePermissionsCommand(serviceId).apply(init))
}

@Generated
class AmazonEC2ModifyVpcEndpointServicePermissionsCommand(val serviceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest> {

	var addAllowedPrincipals: List<String>? = null
	var removeAllowedPrincipals: List<String>? = null

	override fun build(): com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest {
		val input = com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest()
		input.setServiceId(this.serviceId)
		input.setAddAllowedPrincipals(this.addAllowedPrincipals)
		input.setRemoveAllowedPrincipals(this.removeAllowedPrincipals)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyVpcEndpointServicePermissions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-vpc-endpoint-service-permissions")
				.argument("service-id", serviceId)
				.argument("add-allowed-principals", addAllowedPrincipals?.toString())
				.argument("remove-allowed-principals", removeAllowedPrincipals?.toString())
	}

}


fun AmazonEC2Functions.modifyVpcPeeringConnectionOptions(vpcPeeringConnectionId: String, init: AmazonEC2ModifyVpcPeeringConnectionOptionsCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyVpcPeeringConnectionOptionsCommand(vpcPeeringConnectionId).apply(init))
}

@Generated
class AmazonEC2ModifyVpcPeeringConnectionOptionsCommand(val vpcPeeringConnectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsRequest> {

	var accepterPeeringConnectionOptions: com.amazonaws.services.ec2.model.PeeringConnectionOptionsRequest? = null
	var requesterPeeringConnectionOptions: com.amazonaws.services.ec2.model.PeeringConnectionOptionsRequest? = null

	override fun build(): com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsRequest {
		val input = com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsRequest()
		input.setAccepterPeeringConnectionOptions(this.accepterPeeringConnectionOptions)
		input.setRequesterPeeringConnectionOptions(this.requesterPeeringConnectionOptions)
		input.setVpcPeeringConnectionId(this.vpcPeeringConnectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyVpcPeeringConnectionOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-vpc-peering-connection-options")
				.argument("accepter-peering-connection-options", accepterPeeringConnectionOptions?.toString())
				.argument("requester-peering-connection-options", requesterPeeringConnectionOptions?.toString())
				.argument("vpc-peering-connection-id", vpcPeeringConnectionId)
	}

}


fun AmazonEC2Functions.modifyVpcTenancy(vpcId: String, instanceTenancy: VpcTenancy, init: AmazonEC2ModifyVpcTenancyCommand.() -> Unit) {
	this.block.declare(AmazonEC2ModifyVpcTenancyCommand(vpcId, instanceTenancy).apply(init))
}

@Generated
class AmazonEC2ModifyVpcTenancyCommand(val vpcId: String, val instanceTenancy: VpcTenancy) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ModifyVpcTenancyRequest> {



	override fun build(): com.amazonaws.services.ec2.model.ModifyVpcTenancyRequest {
		val input = com.amazonaws.services.ec2.model.ModifyVpcTenancyRequest()
		input.setVpcId(this.vpcId)
		input.setInstanceTenancy(this.instanceTenancy.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.modifyVpcTenancy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 modify-vpc-tenancy")
				.argument("vpc-id", vpcId)
				.argument("instance-tenancy", instanceTenancy.toString())
	}

}


fun AmazonEC2Functions.monitorInstances(instanceIds: List<String>, init: AmazonEC2MonitorInstancesCommand.() -> Unit) {
	this.block.declare(AmazonEC2MonitorInstancesCommand(instanceIds).apply(init))
}

@Generated
class AmazonEC2MonitorInstancesCommand(val instanceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.MonitorInstancesRequest> {



	override fun build(): com.amazonaws.services.ec2.model.MonitorInstancesRequest {
		val input = com.amazonaws.services.ec2.model.MonitorInstancesRequest()
		input.setInstanceIds(this.instanceIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.monitorInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 monitor-instances")
				.argument("instance-ids", instanceIds.toString())
	}

}


fun AmazonEC2Functions.moveAddressToVpc(publicIp: String, init: AmazonEC2MoveAddressToVpcCommand.() -> Unit) {
	this.block.declare(AmazonEC2MoveAddressToVpcCommand(publicIp).apply(init))
}

@Generated
class AmazonEC2MoveAddressToVpcCommand(val publicIp: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.MoveAddressToVpcRequest> {



	override fun build(): com.amazonaws.services.ec2.model.MoveAddressToVpcRequest {
		val input = com.amazonaws.services.ec2.model.MoveAddressToVpcRequest()
		input.setPublicIp(this.publicIp)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.moveAddressToVpc(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 move-address-to-vpc")
				.argument("public-ip", publicIp)
	}

}


fun AmazonEC2Functions.purchaseHostReservation(hostIdSet: List<String>, offeringId: String, init: AmazonEC2PurchaseHostReservationCommand.() -> Unit) {
	this.block.declare(AmazonEC2PurchaseHostReservationCommand(hostIdSet, offeringId).apply(init))
}

@Generated
class AmazonEC2PurchaseHostReservationCommand(val hostIdSet: List<String>, val offeringId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.PurchaseHostReservationRequest> {

	var clientToken: String? = null
	var currencyCode: CurrencyCodeValues? = null
	var limitPrice: String? = null

	override fun build(): com.amazonaws.services.ec2.model.PurchaseHostReservationRequest {
		val input = com.amazonaws.services.ec2.model.PurchaseHostReservationRequest()
		input.setClientToken(this.clientToken)
		input.setCurrencyCode(this.currencyCode?.toString())
		input.setHostIdSet(this.hostIdSet)
		input.setLimitPrice(this.limitPrice)
		input.setOfferingId(this.offeringId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.purchaseHostReservation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 purchase-host-reservation")
				.argument("client-token", clientToken)
				.argument("currency-code", currencyCode?.toString())
				.argument("host-id-set", hostIdSet.toString())
				.argument("limit-price", limitPrice)
				.argument("offering-id", offeringId)
	}

}


fun AmazonEC2Functions.purchaseReservedInstancesOffering(instanceCount: Int, reservedInstancesOfferingId: String, init: AmazonEC2PurchaseReservedInstancesOfferingCommand.() -> Unit) {
	this.block.declare(AmazonEC2PurchaseReservedInstancesOfferingCommand(instanceCount, reservedInstancesOfferingId).apply(init))
}

@Generated
class AmazonEC2PurchaseReservedInstancesOfferingCommand(val instanceCount: Int, val reservedInstancesOfferingId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingRequest> {

	var limitPrice: com.amazonaws.services.ec2.model.ReservedInstanceLimitPrice? = null

	override fun build(): com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingRequest {
		val input = com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingRequest()
		input.setInstanceCount(this.instanceCount)
		input.setReservedInstancesOfferingId(this.reservedInstancesOfferingId)
		input.setLimitPrice(this.limitPrice)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.purchaseReservedInstancesOffering(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 purchase-reserved-instances-offering")
				.argument("instance-count", instanceCount.toString())
				.argument("reserved-instances-offering-id", reservedInstancesOfferingId)
				.argument("limit-price", limitPrice?.toString())
	}

}


fun AmazonEC2Functions.purchaseScheduledInstances(purchaseRequests: List<com.amazonaws.services.ec2.model.PurchaseRequest>, init: AmazonEC2PurchaseScheduledInstancesCommand.() -> Unit) {
	this.block.declare(AmazonEC2PurchaseScheduledInstancesCommand(purchaseRequests).apply(init))
}

@Generated
class AmazonEC2PurchaseScheduledInstancesCommand(val purchaseRequests: List<com.amazonaws.services.ec2.model.PurchaseRequest>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.PurchaseScheduledInstancesRequest> {

	var clientToken: String? = null

	override fun build(): com.amazonaws.services.ec2.model.PurchaseScheduledInstancesRequest {
		val input = com.amazonaws.services.ec2.model.PurchaseScheduledInstancesRequest()
		input.setClientToken(this.clientToken)
		input.setPurchaseRequests(this.purchaseRequests)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.purchaseScheduledInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 purchase-scheduled-instances")
				.argument("client-token", clientToken)
				.argument("purchase-requests", purchaseRequests.toString())
	}

}


fun AmazonEC2Functions.rebootInstances(instanceIds: List<String>, init: AmazonEC2RebootInstancesCommand.() -> Unit) {
	this.block.declare(AmazonEC2RebootInstancesCommand(instanceIds).apply(init))
}

@Generated
class AmazonEC2RebootInstancesCommand(val instanceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.RebootInstancesRequest> {



	override fun build(): com.amazonaws.services.ec2.model.RebootInstancesRequest {
		val input = com.amazonaws.services.ec2.model.RebootInstancesRequest()
		input.setInstanceIds(this.instanceIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.rebootInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 reboot-instances")
				.argument("instance-ids", instanceIds.toString())
	}

}


fun AmazonEC2Functions.registerImage(name: String, init: AmazonEC2RegisterImageCommand.() -> Unit) {
	this.block.declare(AmazonEC2RegisterImageCommand(name).apply(init))
}

@Generated
class AmazonEC2RegisterImageCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.RegisterImageRequest> {

	var imageLocation: String? = null
	var architecture: ArchitectureValues? = null
	var blockDeviceMappings: List<com.amazonaws.services.ec2.model.BlockDeviceMapping>? = null
	var description: String? = null
	var enaSupport: Boolean? = false
	var kernelId: String? = null
	var billingProducts: List<String>? = null
	var ramdiskId: String? = null
	var rootDeviceName: String? = null
	var sriovNetSupport: String? = null
	var virtualizationType: String? = null

	override fun build(): com.amazonaws.services.ec2.model.RegisterImageRequest {
		val input = com.amazonaws.services.ec2.model.RegisterImageRequest()
		input.setImageLocation(this.imageLocation)
		input.setArchitecture(this.architecture?.toString())
		input.setBlockDeviceMappings(this.blockDeviceMappings)
		input.setDescription(this.description)
		input.setEnaSupport(this.enaSupport)
		input.setKernelId(this.kernelId)
		input.setName(this.name)
		input.setBillingProducts(this.billingProducts)
		input.setRamdiskId(this.ramdiskId)
		input.setRootDeviceName(this.rootDeviceName)
		input.setSriovNetSupport(this.sriovNetSupport)
		input.setVirtualizationType(this.virtualizationType)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.registerImage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 register-image")
				.argument("image-location", imageLocation)
				.argument("architecture", architecture?.toString())
				.argument("block-device-mappings", blockDeviceMappings?.toString())
				.argument("description", description)
				.option("ena-support", enaSupport ?: false)
				.argument("kernel-id", kernelId)
				.argument("name", name)
				.argument("billing-products", billingProducts?.toString())
				.argument("ramdisk-id", ramdiskId)
				.argument("root-device-name", rootDeviceName)
				.argument("sriov-net-support", sriovNetSupport)
				.argument("virtualization-type", virtualizationType)
	}

}


fun AmazonEC2Functions.rejectVpcEndpointConnections(serviceId: String, vpcEndpointIds: List<String>, init: AmazonEC2RejectVpcEndpointConnectionsCommand.() -> Unit) {
	this.block.declare(AmazonEC2RejectVpcEndpointConnectionsCommand(serviceId, vpcEndpointIds).apply(init))
}

@Generated
class AmazonEC2RejectVpcEndpointConnectionsCommand(val serviceId: String, val vpcEndpointIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsRequest> {



	override fun build(): com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsRequest {
		val input = com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsRequest()
		input.setServiceId(this.serviceId)
		input.setVpcEndpointIds(this.vpcEndpointIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.rejectVpcEndpointConnections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 reject-vpc-endpoint-connections")
				.argument("service-id", serviceId)
				.argument("vpc-endpoint-ids", vpcEndpointIds.toString())
	}

}


fun AmazonEC2Functions.rejectVpcPeeringConnection(vpcPeeringConnectionId: String, init: AmazonEC2RejectVpcPeeringConnectionCommand.() -> Unit) {
	this.block.declare(AmazonEC2RejectVpcPeeringConnectionCommand(vpcPeeringConnectionId).apply(init))
}

@Generated
class AmazonEC2RejectVpcPeeringConnectionCommand(val vpcPeeringConnectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionRequest> {



	override fun build(): com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionRequest {
		val input = com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionRequest()
		input.setVpcPeeringConnectionId(this.vpcPeeringConnectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.rejectVpcPeeringConnection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 reject-vpc-peering-connection")
				.argument("vpc-peering-connection-id", vpcPeeringConnectionId)
	}

}


fun AmazonEC2Functions.releaseAddress(init: AmazonEC2ReleaseAddressCommand.() -> Unit) {
	this.block.declare(AmazonEC2ReleaseAddressCommand().apply(init))
}

@Generated
class AmazonEC2ReleaseAddressCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ReleaseAddressRequest> {

	var allocationId: String? = null
	var publicIp: String? = null

	override fun build(): com.amazonaws.services.ec2.model.ReleaseAddressRequest {
		val input = com.amazonaws.services.ec2.model.ReleaseAddressRequest()
		input.setAllocationId(this.allocationId)
		input.setPublicIp(this.publicIp)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.releaseAddress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 release-address")
				.argument("allocation-id", allocationId)
				.argument("public-ip", publicIp)
	}

}


fun AmazonEC2Functions.releaseHosts(hostIds: List<String>, init: AmazonEC2ReleaseHostsCommand.() -> Unit) {
	this.block.declare(AmazonEC2ReleaseHostsCommand(hostIds).apply(init))
}

@Generated
class AmazonEC2ReleaseHostsCommand(val hostIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ReleaseHostsRequest> {



	override fun build(): com.amazonaws.services.ec2.model.ReleaseHostsRequest {
		val input = com.amazonaws.services.ec2.model.ReleaseHostsRequest()
		input.setHostIds(this.hostIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.releaseHosts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 release-hosts")
				.argument("host-ids", hostIds.toString())
	}

}


fun AmazonEC2Functions.replaceIamInstanceProfileAssociation(iamInstanceProfile: com.amazonaws.services.ec2.model.IamInstanceProfileSpecification, associationId: String, init: AmazonEC2ReplaceIamInstanceProfileAssociationCommand.() -> Unit) {
	this.block.declare(AmazonEC2ReplaceIamInstanceProfileAssociationCommand(iamInstanceProfile, associationId).apply(init))
}

@Generated
class AmazonEC2ReplaceIamInstanceProfileAssociationCommand(val iamInstanceProfile: com.amazonaws.services.ec2.model.IamInstanceProfileSpecification, val associationId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest> {



	override fun build(): com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest {
		val input = com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest()
		input.setIamInstanceProfile(this.iamInstanceProfile)
		input.setAssociationId(this.associationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.replaceIamInstanceProfileAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 replace-iam-instance-profile-association")
				.argument("iam-instance-profile", iamInstanceProfile.toString())
				.argument("association-id", associationId)
	}

}


fun AmazonEC2Functions.replaceNetworkAclAssociation(associationId: String, networkAclId: String, init: AmazonEC2ReplaceNetworkAclAssociationCommand.() -> Unit) {
	this.block.declare(AmazonEC2ReplaceNetworkAclAssociationCommand(associationId, networkAclId).apply(init))
}

@Generated
class AmazonEC2ReplaceNetworkAclAssociationCommand(val associationId: String, val networkAclId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationRequest> {



	override fun build(): com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationRequest {
		val input = com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationRequest()
		input.setAssociationId(this.associationId)
		input.setNetworkAclId(this.networkAclId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.replaceNetworkAclAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 replace-network-acl-association")
				.argument("association-id", associationId)
				.argument("network-acl-id", networkAclId)
	}

}


fun AmazonEC2Functions.replaceNetworkAclEntry(egress: Boolean, networkAclId: String, protocol: String, ruleAction: RuleAction, ruleNumber: Int, init: AmazonEC2ReplaceNetworkAclEntryCommand.() -> Unit) {
	this.block.declare(AmazonEC2ReplaceNetworkAclEntryCommand(egress, networkAclId, protocol, ruleAction, ruleNumber).apply(init))
}

@Generated
class AmazonEC2ReplaceNetworkAclEntryCommand(val egress: Boolean, val networkAclId: String, val protocol: String, val ruleAction: RuleAction, val ruleNumber: Int) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryRequest> {

	var cidrBlock: String? = null
	var icmpTypeCode: com.amazonaws.services.ec2.model.IcmpTypeCode? = null
	var ipv6CidrBlock: String? = null
	var portRange: com.amazonaws.services.ec2.model.PortRange? = null

	override fun build(): com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryRequest {
		val input = com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryRequest()
		input.setCidrBlock(this.cidrBlock)
		input.setEgress(this.egress)
		input.setIcmpTypeCode(this.icmpTypeCode)
		input.setIpv6CidrBlock(this.ipv6CidrBlock)
		input.setNetworkAclId(this.networkAclId)
		input.setPortRange(this.portRange)
		input.setProtocol(this.protocol)
		input.setRuleAction(this.ruleAction.toString())
		input.setRuleNumber(this.ruleNumber)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.replaceNetworkAclEntry(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 replace-network-acl-entry")
				.argument("cidr-block", cidrBlock)
				.option("egress", egress ?: false)
				.argument("icmp-type-code", icmpTypeCode?.toString())
				.argument("ipv6-cidr-block", ipv6CidrBlock)
				.argument("network-acl-id", networkAclId)
				.argument("port-range", portRange?.toString())
				.argument("protocol", protocol)
				.argument("rule-action", ruleAction.toString())
				.argument("rule-number", ruleNumber.toString())
	}

}


fun AmazonEC2Functions.replaceRoute(routeTableId: String, init: AmazonEC2ReplaceRouteCommand.() -> Unit) {
	this.block.declare(AmazonEC2ReplaceRouteCommand(routeTableId).apply(init))
}

@Generated
class AmazonEC2ReplaceRouteCommand(val routeTableId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ReplaceRouteRequest> {

	var destinationCidrBlock: String? = null
	var destinationIpv6CidrBlock: String? = null
	var egressOnlyInternetGatewayId: String? = null
	var gatewayId: String? = null
	var instanceId: String? = null
	var natGatewayId: String? = null
	var networkInterfaceId: String? = null
	var vpcPeeringConnectionId: String? = null

	override fun build(): com.amazonaws.services.ec2.model.ReplaceRouteRequest {
		val input = com.amazonaws.services.ec2.model.ReplaceRouteRequest()
		input.setDestinationCidrBlock(this.destinationCidrBlock)
		input.setDestinationIpv6CidrBlock(this.destinationIpv6CidrBlock)
		input.setEgressOnlyInternetGatewayId(this.egressOnlyInternetGatewayId)
		input.setGatewayId(this.gatewayId)
		input.setInstanceId(this.instanceId)
		input.setNatGatewayId(this.natGatewayId)
		input.setNetworkInterfaceId(this.networkInterfaceId)
		input.setRouteTableId(this.routeTableId)
		input.setVpcPeeringConnectionId(this.vpcPeeringConnectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.replaceRoute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 replace-route")
				.argument("destination-cidr-block", destinationCidrBlock)
				.argument("destination-ipv6-cidr-block", destinationIpv6CidrBlock)
				.argument("egress-only-internet-gateway-id", egressOnlyInternetGatewayId)
				.argument("gateway-id", gatewayId)
				.argument("instance-id", instanceId)
				.argument("nat-gateway-id", natGatewayId)
				.argument("network-interface-id", networkInterfaceId)
				.argument("route-table-id", routeTableId)
				.argument("vpc-peering-connection-id", vpcPeeringConnectionId)
	}

}


fun AmazonEC2Functions.replaceRouteTableAssociation(associationId: String, routeTableId: String, init: AmazonEC2ReplaceRouteTableAssociationCommand.() -> Unit) {
	this.block.declare(AmazonEC2ReplaceRouteTableAssociationCommand(associationId, routeTableId).apply(init))
}

@Generated
class AmazonEC2ReplaceRouteTableAssociationCommand(val associationId: String, val routeTableId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationRequest> {



	override fun build(): com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationRequest {
		val input = com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationRequest()
		input.setAssociationId(this.associationId)
		input.setRouteTableId(this.routeTableId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.replaceRouteTableAssociation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 replace-route-table-association")
				.argument("association-id", associationId)
				.argument("route-table-id", routeTableId)
	}

}


fun AmazonEC2Functions.reportInstanceStatus(instances: List<String>, reasonCodes: List<ReportInstanceReasonCodes>, status: ReportStatusType, init: AmazonEC2ReportInstanceStatusCommand.() -> Unit) {
	this.block.declare(AmazonEC2ReportInstanceStatusCommand(instances, reasonCodes, status).apply(init))
}

@Generated
class AmazonEC2ReportInstanceStatusCommand(val instances: List<String>, val reasonCodes: List<ReportInstanceReasonCodes>, val status: ReportStatusType) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ReportInstanceStatusRequest> {

	var description: String? = null
	var endTime: java.util.Date? = null
	var startTime: java.util.Date? = null

	override fun build(): com.amazonaws.services.ec2.model.ReportInstanceStatusRequest {
		val input = com.amazonaws.services.ec2.model.ReportInstanceStatusRequest()
		input.setDescription(this.description)
		input.setEndTime(this.endTime)
		input.setInstances(this.instances)
		input.setReasonCodes(this.reasonCodes.map { it.toString() })
		input.setStartTime(this.startTime)
		input.setStatus(this.status.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.reportInstanceStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 report-instance-status")
				.argument("description", description)
				.argument("end-time", endTime?.toString())
				.argument("instances", instances.toString())
				.argument("reason-codes", reasonCodes.toString())
				.argument("start-time", startTime?.toString())
				.argument("status", status.toString())
	}

}


fun AmazonEC2Functions.requestSpotFleet(spotFleetRequestConfig: com.amazonaws.services.ec2.model.SpotFleetRequestConfigData, init: AmazonEC2RequestSpotFleetCommand.() -> Unit) {
	this.block.declare(AmazonEC2RequestSpotFleetCommand(spotFleetRequestConfig).apply(init))
}

@Generated
class AmazonEC2RequestSpotFleetCommand(val spotFleetRequestConfig: com.amazonaws.services.ec2.model.SpotFleetRequestConfigData) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.RequestSpotFleetRequest> {



	override fun build(): com.amazonaws.services.ec2.model.RequestSpotFleetRequest {
		val input = com.amazonaws.services.ec2.model.RequestSpotFleetRequest()
		input.setSpotFleetRequestConfig(this.spotFleetRequestConfig)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.requestSpotFleet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 request-spot-fleet")
				.argument("spot-fleet-request-config", spotFleetRequestConfig.toString())
	}

}


fun AmazonEC2Functions.requestSpotInstances(init: AmazonEC2RequestSpotInstancesCommand.() -> Unit) {
	this.block.declare(AmazonEC2RequestSpotInstancesCommand().apply(init))
}

@Generated
class AmazonEC2RequestSpotInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.RequestSpotInstancesRequest> {

	var availabilityZoneGroup: String? = null
	var blockDurationMinutes: Int? = 0
	var clientToken: String? = null
	var instanceCount: Int? = 0
	var launchGroup: String? = null
	var launchSpecification: com.amazonaws.services.ec2.model.LaunchSpecification? = null
	var spotPrice: String? = null
	var type: SpotInstanceType? = null
	var validFrom: java.util.Date? = null
	var validUntil: java.util.Date? = null
	var instanceInterruptionBehavior: InstanceInterruptionBehavior? = null

	override fun build(): com.amazonaws.services.ec2.model.RequestSpotInstancesRequest {
		val input = com.amazonaws.services.ec2.model.RequestSpotInstancesRequest()
		input.setAvailabilityZoneGroup(this.availabilityZoneGroup)
		input.setBlockDurationMinutes(this.blockDurationMinutes)
		input.setClientToken(this.clientToken)
		input.setInstanceCount(this.instanceCount)
		input.setLaunchGroup(this.launchGroup)
		input.setLaunchSpecification(this.launchSpecification)
		input.setSpotPrice(this.spotPrice)
		input.setType(this.type?.toString())
		input.setValidFrom(this.validFrom)
		input.setValidUntil(this.validUntil)
		input.setInstanceInterruptionBehavior(this.instanceInterruptionBehavior?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.requestSpotInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 request-spot-instances")
				.argument("availability-zone-group", availabilityZoneGroup)
				.argument("block-duration-minutes", blockDurationMinutes?.toString())
				.argument("client-token", clientToken)
				.argument("instance-count", instanceCount?.toString())
				.argument("launch-group", launchGroup)
				.argument("launch-specification", launchSpecification?.toString())
				.argument("spot-price", spotPrice)
				.argument("type", type?.toString())
				.argument("valid-from", validFrom?.toString())
				.argument("valid-until", validUntil?.toString())
				.argument("instance-interruption-behavior", instanceInterruptionBehavior?.toString())
	}

}


fun AmazonEC2Functions.resetFpgaImageAttribute(fpgaImageId: String, init: AmazonEC2ResetFpgaImageAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2ResetFpgaImageAttributeCommand(fpgaImageId).apply(init))
}

@Generated
class AmazonEC2ResetFpgaImageAttributeCommand(val fpgaImageId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ResetFpgaImageAttributeRequest> {

	var attribute: ResetFpgaImageAttributeName? = null

	override fun build(): com.amazonaws.services.ec2.model.ResetFpgaImageAttributeRequest {
		val input = com.amazonaws.services.ec2.model.ResetFpgaImageAttributeRequest()
		input.setFpgaImageId(this.fpgaImageId)
		input.setAttribute(this.attribute?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.resetFpgaImageAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 reset-fpga-image-attribute")
				.argument("fpga-image-id", fpgaImageId)
				.argument("attribute", attribute?.toString())
	}

}


fun AmazonEC2Functions.resetImageAttribute(attribute: ResetImageAttributeName, imageId: String, init: AmazonEC2ResetImageAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2ResetImageAttributeCommand(attribute, imageId).apply(init))
}

@Generated
class AmazonEC2ResetImageAttributeCommand(val attribute: ResetImageAttributeName, val imageId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ResetImageAttributeRequest> {



	override fun build(): com.amazonaws.services.ec2.model.ResetImageAttributeRequest {
		val input = com.amazonaws.services.ec2.model.ResetImageAttributeRequest()
		input.setAttribute(this.attribute.toString())
		input.setImageId(this.imageId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.resetImageAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 reset-image-attribute")
				.argument("attribute", attribute.toString())
				.argument("image-id", imageId)
	}

}


fun AmazonEC2Functions.resetInstanceAttribute(attribute: InstanceAttributeName, instanceId: String, init: AmazonEC2ResetInstanceAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2ResetInstanceAttributeCommand(attribute, instanceId).apply(init))
}

@Generated
class AmazonEC2ResetInstanceAttributeCommand(val attribute: InstanceAttributeName, val instanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ResetInstanceAttributeRequest> {



	override fun build(): com.amazonaws.services.ec2.model.ResetInstanceAttributeRequest {
		val input = com.amazonaws.services.ec2.model.ResetInstanceAttributeRequest()
		input.setAttribute(this.attribute.toString())
		input.setInstanceId(this.instanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.resetInstanceAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 reset-instance-attribute")
				.argument("attribute", attribute.toString())
				.argument("instance-id", instanceId)
	}

}


fun AmazonEC2Functions.resetNetworkInterfaceAttribute(networkInterfaceId: String, init: AmazonEC2ResetNetworkInterfaceAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2ResetNetworkInterfaceAttributeCommand(networkInterfaceId).apply(init))
}

@Generated
class AmazonEC2ResetNetworkInterfaceAttributeCommand(val networkInterfaceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeRequest> {

	var sourceDestCheck: String? = null

	override fun build(): com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeRequest {
		val input = com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeRequest()
		input.setNetworkInterfaceId(this.networkInterfaceId)
		input.setSourceDestCheck(this.sourceDestCheck)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.resetNetworkInterfaceAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 reset-network-interface-attribute")
				.argument("network-interface-id", networkInterfaceId)
				.argument("source-dest-check", sourceDestCheck)
	}

}


fun AmazonEC2Functions.resetSnapshotAttribute(attribute: SnapshotAttributeName, snapshotId: String, init: AmazonEC2ResetSnapshotAttributeCommand.() -> Unit) {
	this.block.declare(AmazonEC2ResetSnapshotAttributeCommand(attribute, snapshotId).apply(init))
}

@Generated
class AmazonEC2ResetSnapshotAttributeCommand(val attribute: SnapshotAttributeName, val snapshotId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.ResetSnapshotAttributeRequest> {



	override fun build(): com.amazonaws.services.ec2.model.ResetSnapshotAttributeRequest {
		val input = com.amazonaws.services.ec2.model.ResetSnapshotAttributeRequest()
		input.setAttribute(this.attribute.toString())
		input.setSnapshotId(this.snapshotId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.resetSnapshotAttribute(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 reset-snapshot-attribute")
				.argument("attribute", attribute.toString())
				.argument("snapshot-id", snapshotId)
	}

}


fun AmazonEC2Functions.restoreAddressToClassic(publicIp: String, init: AmazonEC2RestoreAddressToClassicCommand.() -> Unit) {
	this.block.declare(AmazonEC2RestoreAddressToClassicCommand(publicIp).apply(init))
}

@Generated
class AmazonEC2RestoreAddressToClassicCommand(val publicIp: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.RestoreAddressToClassicRequest> {



	override fun build(): com.amazonaws.services.ec2.model.RestoreAddressToClassicRequest {
		val input = com.amazonaws.services.ec2.model.RestoreAddressToClassicRequest()
		input.setPublicIp(this.publicIp)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.restoreAddressToClassic(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 restore-address-to-classic")
				.argument("public-ip", publicIp)
	}

}


fun AmazonEC2Functions.revokeSecurityGroupEgress(groupId: String, init: AmazonEC2RevokeSecurityGroupEgressCommand.() -> Unit) {
	this.block.declare(AmazonEC2RevokeSecurityGroupEgressCommand(groupId).apply(init))
}

@Generated
class AmazonEC2RevokeSecurityGroupEgressCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressRequest> {

	var ipPermissions: List<com.amazonaws.services.ec2.model.IpPermission>? = null
	var cidrIp: String? = null
	var fromPort: Int? = 0
	var ipProtocol: String? = null
	var toPort: Int? = 0
	var sourceSecurityGroupName: String? = null
	var sourceSecurityGroupOwnerId: String? = null

	override fun build(): com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressRequest {
		val input = com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressRequest()
		input.setGroupId(this.groupId)
		input.setIpPermissions(this.ipPermissions)
		input.setCidrIp(this.cidrIp)
		input.setFromPort(this.fromPort)
		input.setIpProtocol(this.ipProtocol)
		input.setToPort(this.toPort)
		input.setSourceSecurityGroupName(this.sourceSecurityGroupName)
		input.setSourceSecurityGroupOwnerId(this.sourceSecurityGroupOwnerId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.revokeSecurityGroupEgress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 revoke-security-group-egress")
				.argument("group-id", groupId)
				.argument("ip-permissions", ipPermissions?.toString())
				.argument("cidr-ip", cidrIp)
				.argument("from-port", fromPort?.toString())
				.argument("ip-protocol", ipProtocol)
				.argument("to-port", toPort?.toString())
				.argument("source-security-group-name", sourceSecurityGroupName)
				.argument("source-security-group-owner-id", sourceSecurityGroupOwnerId)
	}

}


fun AmazonEC2Functions.revokeSecurityGroupIngress(init: AmazonEC2RevokeSecurityGroupIngressCommand.() -> Unit) {
	this.block.declare(AmazonEC2RevokeSecurityGroupIngressCommand().apply(init))
}

@Generated
class AmazonEC2RevokeSecurityGroupIngressCommand() : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressRequest> {

	var cidrIp: String? = null
	var fromPort: Int? = 0
	var groupId: String? = null
	var groupName: String? = null
	var ipPermissions: List<com.amazonaws.services.ec2.model.IpPermission>? = null
	var ipProtocol: String? = null
	var sourceSecurityGroupName: String? = null
	var sourceSecurityGroupOwnerId: String? = null
	var toPort: Int? = 0

	override fun build(): com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressRequest {
		val input = com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressRequest()
		input.setCidrIp(this.cidrIp)
		input.setFromPort(this.fromPort)
		input.setGroupId(this.groupId)
		input.setGroupName(this.groupName)
		input.setIpPermissions(this.ipPermissions)
		input.setIpProtocol(this.ipProtocol)
		input.setSourceSecurityGroupName(this.sourceSecurityGroupName)
		input.setSourceSecurityGroupOwnerId(this.sourceSecurityGroupOwnerId)
		input.setToPort(this.toPort)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.revokeSecurityGroupIngress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 revoke-security-group-ingress")
				.argument("cidr-ip", cidrIp)
				.argument("from-port", fromPort?.toString())
				.argument("group-id", groupId)
				.argument("group-name", groupName)
				.argument("ip-permissions", ipPermissions?.toString())
				.argument("ip-protocol", ipProtocol)
				.argument("source-security-group-name", sourceSecurityGroupName)
				.argument("source-security-group-owner-id", sourceSecurityGroupOwnerId)
				.argument("to-port", toPort?.toString())
	}

}


fun AmazonEC2Functions.runInstances(maxCount: Int, minCount: Int, init: AmazonEC2RunInstancesCommand.() -> Unit) {
	this.block.declare(AmazonEC2RunInstancesCommand(maxCount, minCount).apply(init))
}

@Generated
class AmazonEC2RunInstancesCommand(val maxCount: Int, val minCount: Int) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.RunInstancesRequest> {

	var blockDeviceMappings: List<com.amazonaws.services.ec2.model.BlockDeviceMapping>? = null
	var imageId: String? = null
	var instanceType: InstanceType? = null
	var ipv6AddressCount: Int? = 0
	var ipv6Addresses: List<com.amazonaws.services.ec2.model.InstanceIpv6Address>? = null
	var kernelId: String? = null
	var keyName: String? = null
	var monitoring: Boolean? = false
	var placement: com.amazonaws.services.ec2.model.Placement? = null
	var ramdiskId: String? = null
	var securityGroupIds: List<String>? = null
	var securityGroups: List<String>? = null
	var subnetId: String? = null
	var userData: String? = null
	var additionalInfo: String? = null
	var clientToken: String? = null
	var disableApiTermination: Boolean? = false
	var ebsOptimized: Boolean? = false
	var iamInstanceProfile: com.amazonaws.services.ec2.model.IamInstanceProfileSpecification? = null
	var instanceInitiatedShutdownBehavior: ShutdownBehavior? = null
	var networkInterfaces: List<com.amazonaws.services.ec2.model.InstanceNetworkInterfaceSpecification>? = null
	var privateIpAddress: String? = null
	var elasticGpuSpecification: List<com.amazonaws.services.ec2.model.ElasticGpuSpecification>? = null
	var tagSpecifications: List<com.amazonaws.services.ec2.model.TagSpecification>? = null
	var launchTemplate: com.amazonaws.services.ec2.model.LaunchTemplateSpecification? = null
	var instanceMarketOptions: com.amazonaws.services.ec2.model.InstanceMarketOptionsRequest? = null
	var creditSpecification: com.amazonaws.services.ec2.model.CreditSpecificationRequest? = null

	override fun build(): com.amazonaws.services.ec2.model.RunInstancesRequest {
		val input = com.amazonaws.services.ec2.model.RunInstancesRequest()
		input.setBlockDeviceMappings(this.blockDeviceMappings)
		input.setImageId(this.imageId)
		input.setInstanceType(this.instanceType?.toString())
		input.setIpv6AddressCount(this.ipv6AddressCount)
		input.setIpv6Addresses(this.ipv6Addresses)
		input.setKernelId(this.kernelId)
		input.setKeyName(this.keyName)
		input.setMaxCount(this.maxCount)
		input.setMinCount(this.minCount)
		input.setMonitoring(this.monitoring)
		input.setPlacement(this.placement)
		input.setRamdiskId(this.ramdiskId)
		input.setSecurityGroupIds(this.securityGroupIds)
		input.setSecurityGroups(this.securityGroups)
		input.setSubnetId(this.subnetId)
		input.setUserData(this.userData)
		input.setAdditionalInfo(this.additionalInfo)
		input.setClientToken(this.clientToken)
		input.setDisableApiTermination(this.disableApiTermination)
		input.setEbsOptimized(this.ebsOptimized)
		input.setIamInstanceProfile(this.iamInstanceProfile)
		input.setInstanceInitiatedShutdownBehavior(this.instanceInitiatedShutdownBehavior?.toString())
		input.setNetworkInterfaces(this.networkInterfaces)
		input.setPrivateIpAddress(this.privateIpAddress)
		input.setElasticGpuSpecification(this.elasticGpuSpecification)
		input.setTagSpecifications(this.tagSpecifications)
		input.setLaunchTemplate(this.launchTemplate)
		input.setInstanceMarketOptions(this.instanceMarketOptions)
		input.setCreditSpecification(this.creditSpecification)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.runInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 run-instances")
				.argument("block-device-mappings", blockDeviceMappings?.toString())
				.argument("image-id", imageId)
				.argument("instance-type", instanceType?.toString())
				.argument("ipv6-address-count", ipv6AddressCount?.toString())
				.argument("ipv6-addresses", ipv6Addresses?.toString())
				.argument("kernel-id", kernelId)
				.argument("key-name", keyName)
				.argument("max-count", maxCount.toString())
				.argument("min-count", minCount.toString())
				.option("monitoring", monitoring ?: false)
				.argument("placement", placement?.toString())
				.argument("ramdisk-id", ramdiskId)
				.argument("security-group-ids", securityGroupIds?.toString())
				.argument("security-groups", securityGroups?.toString())
				.argument("subnet-id", subnetId)
				.argument("user-data", userData)
				.argument("additional-info", additionalInfo)
				.argument("client-token", clientToken)
				.option("disable-api-termination", disableApiTermination ?: false)
				.option("ebs-optimized", ebsOptimized ?: false)
				.argument("iam-instance-profile", iamInstanceProfile?.toString())
				.argument("instance-initiated-shutdown-behavior", instanceInitiatedShutdownBehavior?.toString())
				.argument("network-interfaces", networkInterfaces?.toString())
				.argument("private-ip-address", privateIpAddress)
				.argument("elastic-gpu-specification", elasticGpuSpecification?.toString())
				.argument("tag-specifications", tagSpecifications?.toString())
				.argument("launch-template", launchTemplate?.toString())
				.argument("instance-market-options", instanceMarketOptions?.toString())
				.argument("credit-specification", creditSpecification?.toString())
	}

}


fun AmazonEC2Functions.runScheduledInstances(launchSpecification: com.amazonaws.services.ec2.model.ScheduledInstancesLaunchSpecification, scheduledInstanceId: String, init: AmazonEC2RunScheduledInstancesCommand.() -> Unit) {
	this.block.declare(AmazonEC2RunScheduledInstancesCommand(launchSpecification, scheduledInstanceId).apply(init))
}

@Generated
class AmazonEC2RunScheduledInstancesCommand(val launchSpecification: com.amazonaws.services.ec2.model.ScheduledInstancesLaunchSpecification, val scheduledInstanceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.RunScheduledInstancesRequest> {

	var clientToken: String? = null
	var instanceCount: Int? = 0

	override fun build(): com.amazonaws.services.ec2.model.RunScheduledInstancesRequest {
		val input = com.amazonaws.services.ec2.model.RunScheduledInstancesRequest()
		input.setClientToken(this.clientToken)
		input.setInstanceCount(this.instanceCount)
		input.setLaunchSpecification(this.launchSpecification)
		input.setScheduledInstanceId(this.scheduledInstanceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.runScheduledInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 run-scheduled-instances")
				.argument("client-token", clientToken)
				.argument("instance-count", instanceCount?.toString())
				.argument("launch-specification", launchSpecification.toString())
				.argument("scheduled-instance-id", scheduledInstanceId)
	}

}


fun AmazonEC2Functions.startInstances(instanceIds: List<String>, init: AmazonEC2StartInstancesCommand.() -> Unit) {
	this.block.declare(AmazonEC2StartInstancesCommand(instanceIds).apply(init))
}

@Generated
class AmazonEC2StartInstancesCommand(val instanceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.StartInstancesRequest> {

	var additionalInfo: String? = null

	override fun build(): com.amazonaws.services.ec2.model.StartInstancesRequest {
		val input = com.amazonaws.services.ec2.model.StartInstancesRequest()
		input.setInstanceIds(this.instanceIds)
		input.setAdditionalInfo(this.additionalInfo)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.startInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 start-instances")
				.argument("instance-ids", instanceIds.toString())
				.argument("additional-info", additionalInfo)
	}

}


fun AmazonEC2Functions.stopInstances(instanceIds: List<String>, init: AmazonEC2StopInstancesCommand.() -> Unit) {
	this.block.declare(AmazonEC2StopInstancesCommand(instanceIds).apply(init))
}

@Generated
class AmazonEC2StopInstancesCommand(val instanceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.StopInstancesRequest> {

	var force: Boolean? = false

	override fun build(): com.amazonaws.services.ec2.model.StopInstancesRequest {
		val input = com.amazonaws.services.ec2.model.StopInstancesRequest()
		input.setInstanceIds(this.instanceIds)
		input.setForce(this.force)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.stopInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 stop-instances")
				.argument("instance-ids", instanceIds.toString())
				.option("force", force ?: false)
	}

}


fun AmazonEC2Functions.terminateInstances(instanceIds: List<String>, init: AmazonEC2TerminateInstancesCommand.() -> Unit) {
	this.block.declare(AmazonEC2TerminateInstancesCommand(instanceIds).apply(init))
}

@Generated
class AmazonEC2TerminateInstancesCommand(val instanceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.TerminateInstancesRequest> {



	override fun build(): com.amazonaws.services.ec2.model.TerminateInstancesRequest {
		val input = com.amazonaws.services.ec2.model.TerminateInstancesRequest()
		input.setInstanceIds(this.instanceIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.terminateInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 terminate-instances")
				.argument("instance-ids", instanceIds.toString())
	}

}


fun AmazonEC2Functions.unassignIpv6Addresses(ipv6Addresses: List<String>, networkInterfaceId: String, init: AmazonEC2UnassignIpv6AddressesCommand.() -> Unit) {
	this.block.declare(AmazonEC2UnassignIpv6AddressesCommand(ipv6Addresses, networkInterfaceId).apply(init))
}

@Generated
class AmazonEC2UnassignIpv6AddressesCommand(val ipv6Addresses: List<String>, val networkInterfaceId: String) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.UnassignIpv6AddressesRequest> {



	override fun build(): com.amazonaws.services.ec2.model.UnassignIpv6AddressesRequest {
		val input = com.amazonaws.services.ec2.model.UnassignIpv6AddressesRequest()
		input.setIpv6Addresses(this.ipv6Addresses)
		input.setNetworkInterfaceId(this.networkInterfaceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.unassignIpv6Addresses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 unassign-ipv6-addresses")
				.argument("ipv6-addresses", ipv6Addresses.toString())
				.argument("network-interface-id", networkInterfaceId)
	}

}


fun AmazonEC2Functions.unassignPrivateIpAddresses(networkInterfaceId: String, privateIpAddresses: List<String>, init: AmazonEC2UnassignPrivateIpAddressesCommand.() -> Unit) {
	this.block.declare(AmazonEC2UnassignPrivateIpAddressesCommand(networkInterfaceId, privateIpAddresses).apply(init))
}

@Generated
class AmazonEC2UnassignPrivateIpAddressesCommand(val networkInterfaceId: String, val privateIpAddresses: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesRequest> {



	override fun build(): com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesRequest {
		val input = com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesRequest()
		input.setNetworkInterfaceId(this.networkInterfaceId)
		input.setPrivateIpAddresses(this.privateIpAddresses)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.unassignPrivateIpAddresses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 unassign-private-ip-addresses")
				.argument("network-interface-id", networkInterfaceId)
				.argument("private-ip-addresses", privateIpAddresses.toString())
	}

}


fun AmazonEC2Functions.unmonitorInstances(instanceIds: List<String>, init: AmazonEC2UnmonitorInstancesCommand.() -> Unit) {
	this.block.declare(AmazonEC2UnmonitorInstancesCommand(instanceIds).apply(init))
}

@Generated
class AmazonEC2UnmonitorInstancesCommand(val instanceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.UnmonitorInstancesRequest> {



	override fun build(): com.amazonaws.services.ec2.model.UnmonitorInstancesRequest {
		val input = com.amazonaws.services.ec2.model.UnmonitorInstancesRequest()
		input.setInstanceIds(this.instanceIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.unmonitorInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 unmonitor-instances")
				.argument("instance-ids", instanceIds.toString())
	}

}


fun AmazonEC2Functions.updateSecurityGroupRuleDescriptionsEgress(ipPermissions: List<com.amazonaws.services.ec2.model.IpPermission>, init: AmazonEC2UpdateSecurityGroupRuleDescriptionsEgressCommand.() -> Unit) {
	this.block.declare(AmazonEC2UpdateSecurityGroupRuleDescriptionsEgressCommand(ipPermissions).apply(init))
}

@Generated
class AmazonEC2UpdateSecurityGroupRuleDescriptionsEgressCommand(val ipPermissions: List<com.amazonaws.services.ec2.model.IpPermission>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressRequest> {

	var groupId: String? = null
	var groupName: String? = null

	override fun build(): com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressRequest {
		val input = com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressRequest()
		input.setGroupId(this.groupId)
		input.setGroupName(this.groupName)
		input.setIpPermissions(this.ipPermissions)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.updateSecurityGroupRuleDescriptionsEgress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 update-security-group-rule-descriptions-egress")
				.argument("group-id", groupId)
				.argument("group-name", groupName)
				.argument("ip-permissions", ipPermissions.toString())
	}

}


fun AmazonEC2Functions.updateSecurityGroupRuleDescriptionsIngress(ipPermissions: List<com.amazonaws.services.ec2.model.IpPermission>, init: AmazonEC2UpdateSecurityGroupRuleDescriptionsIngressCommand.() -> Unit) {
	this.block.declare(AmazonEC2UpdateSecurityGroupRuleDescriptionsIngressCommand(ipPermissions).apply(init))
}

@Generated
class AmazonEC2UpdateSecurityGroupRuleDescriptionsIngressCommand(val ipPermissions: List<com.amazonaws.services.ec2.model.IpPermission>) : AmazonWebServiceCommand<com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest> {

	var groupId: String? = null
	var groupName: String? = null

	override fun build(): com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest {
		val input = com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest()
		input.setGroupId(this.groupId)
		input.setGroupName(this.groupName)
		input.setIpPermissions(this.ipPermissions)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ec2.updateSecurityGroupRuleDescriptionsIngress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ec2 update-security-group-rule-descriptions-ingress")
				.argument("group-id", groupId)
				.argument("group-name", groupName)
				.argument("ip-permissions", ipPermissions.toString())
	}

}
