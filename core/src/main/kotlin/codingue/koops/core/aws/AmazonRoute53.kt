
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.route53.AmazonRoute53
import com.amazonaws.services.route53.model.*

var codingue.koops.core.Environment.route53: AmazonRoute53
	get() = this.capabilities[AmazonRoute53::class.java.name] as AmazonRoute53
	set(route53) {
		this.capabilities[AmazonRoute53::class.java.name] = route53
	}

@Generated
class AmazonRoute53Functions(val block: Block)

infix fun AwsContinuation.route53(init: AmazonRoute53Functions.() -> Unit) {
	AmazonRoute53Functions(shell).apply(init)
}

			

fun AmazonRoute53Functions.associateVPCWithHostedZone(hostedZoneId: String, vPC: com.amazonaws.services.route53.model.VPC, init: AmazonRoute53AssociateVPCWithHostedZoneCommand.() -> Unit) {
	this.block.declare(AmazonRoute53AssociateVPCWithHostedZoneCommand(hostedZoneId, vPC).apply(init))
}

@Generated
class AmazonRoute53AssociateVPCWithHostedZoneCommand(val hostedZoneId: String, val vPC: com.amazonaws.services.route53.model.VPC) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.AssociateVPCWithHostedZoneRequest> {

	var comment: String? = null

	override fun build(): com.amazonaws.services.route53.model.AssociateVPCWithHostedZoneRequest {
		val input = com.amazonaws.services.route53.model.AssociateVPCWithHostedZoneRequest()
		input.setHostedZoneId(this.hostedZoneId)
		input.setVPC(this.vPC)
		input.setComment(this.comment)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.associateVPCWithHostedZone(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 associate-vpcwith-hosted-zone")
				.argument("hosted-zone-id", hostedZoneId)
				.argument("vpc", vPC.toString())
				.argument("comment", comment)
	}

}


fun AmazonRoute53Functions.changeResourceRecordSets(hostedZoneId: String, changeBatch: com.amazonaws.services.route53.model.ChangeBatch, init: AmazonRoute53ChangeResourceRecordSetsCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ChangeResourceRecordSetsCommand(hostedZoneId, changeBatch).apply(init))
}

@Generated
class AmazonRoute53ChangeResourceRecordSetsCommand(val hostedZoneId: String, val changeBatch: com.amazonaws.services.route53.model.ChangeBatch) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ChangeResourceRecordSetsRequest> {



	override fun build(): com.amazonaws.services.route53.model.ChangeResourceRecordSetsRequest {
		val input = com.amazonaws.services.route53.model.ChangeResourceRecordSetsRequest()
		input.setHostedZoneId(this.hostedZoneId)
		input.setChangeBatch(this.changeBatch)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.changeResourceRecordSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 change-resource-record-sets")
				.argument("hosted-zone-id", hostedZoneId)
				.argument("change-batch", changeBatch.toString())
	}

}


fun AmazonRoute53Functions.changeTagsForResource(resourceType: TagResourceType, resourceId: String, init: AmazonRoute53ChangeTagsForResourceCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ChangeTagsForResourceCommand(resourceType, resourceId).apply(init))
}

@Generated
class AmazonRoute53ChangeTagsForResourceCommand(val resourceType: TagResourceType, val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ChangeTagsForResourceRequest> {

	var addTags: List<com.amazonaws.services.route53.model.Tag>? = null
	var removeTagKeys: List<String>? = null

	override fun build(): com.amazonaws.services.route53.model.ChangeTagsForResourceRequest {
		val input = com.amazonaws.services.route53.model.ChangeTagsForResourceRequest()
		input.setResourceType(this.resourceType.toString())
		input.setResourceId(this.resourceId)
		input.setAddTags(this.addTags)
		input.setRemoveTagKeys(this.removeTagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.changeTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 change-tags-for-resource")
				.argument("resource-type", resourceType.toString())
				.argument("resource-id", resourceId)
				.argument("add-tags", addTags?.toString())
				.argument("remove-tag-keys", removeTagKeys?.toString())
	}

}


fun AmazonRoute53Functions.createHealthCheck(callerReference: String, healthCheckConfig: com.amazonaws.services.route53.model.HealthCheckConfig, init: AmazonRoute53CreateHealthCheckCommand.() -> Unit) {
	this.block.declare(AmazonRoute53CreateHealthCheckCommand(callerReference, healthCheckConfig).apply(init))
}

@Generated
class AmazonRoute53CreateHealthCheckCommand(val callerReference: String, val healthCheckConfig: com.amazonaws.services.route53.model.HealthCheckConfig) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.CreateHealthCheckRequest> {



	override fun build(): com.amazonaws.services.route53.model.CreateHealthCheckRequest {
		val input = com.amazonaws.services.route53.model.CreateHealthCheckRequest()
		input.setCallerReference(this.callerReference)
		input.setHealthCheckConfig(this.healthCheckConfig)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.createHealthCheck(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 create-health-check")
				.argument("caller-reference", callerReference)
				.argument("health-check-config", healthCheckConfig.toString())
	}

}


fun AmazonRoute53Functions.createHostedZone(name: String, callerReference: String, init: AmazonRoute53CreateHostedZoneCommand.() -> Unit) {
	this.block.declare(AmazonRoute53CreateHostedZoneCommand(name, callerReference).apply(init))
}

@Generated
class AmazonRoute53CreateHostedZoneCommand(val name: String, val callerReference: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.CreateHostedZoneRequest> {

	var vPC: com.amazonaws.services.route53.model.VPC? = null
	var hostedZoneConfig: com.amazonaws.services.route53.model.HostedZoneConfig? = null
	var delegationSetId: String? = null

	override fun build(): com.amazonaws.services.route53.model.CreateHostedZoneRequest {
		val input = com.amazonaws.services.route53.model.CreateHostedZoneRequest()
		input.setName(this.name)
		input.setVPC(this.vPC)
		input.setCallerReference(this.callerReference)
		input.setHostedZoneConfig(this.hostedZoneConfig)
		input.setDelegationSetId(this.delegationSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.createHostedZone(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 create-hosted-zone")
				.argument("name", name)
				.argument("vpc", vPC?.toString())
				.argument("caller-reference", callerReference)
				.argument("hosted-zone-config", hostedZoneConfig?.toString())
				.argument("delegation-set-id", delegationSetId)
	}

}


fun AmazonRoute53Functions.createQueryLoggingConfig(hostedZoneId: String, cloudWatchLogsLogGroupArn: String, init: AmazonRoute53CreateQueryLoggingConfigCommand.() -> Unit) {
	this.block.declare(AmazonRoute53CreateQueryLoggingConfigCommand(hostedZoneId, cloudWatchLogsLogGroupArn).apply(init))
}

@Generated
class AmazonRoute53CreateQueryLoggingConfigCommand(val hostedZoneId: String, val cloudWatchLogsLogGroupArn: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.CreateQueryLoggingConfigRequest> {



	override fun build(): com.amazonaws.services.route53.model.CreateQueryLoggingConfigRequest {
		val input = com.amazonaws.services.route53.model.CreateQueryLoggingConfigRequest()
		input.setHostedZoneId(this.hostedZoneId)
		input.setCloudWatchLogsLogGroupArn(this.cloudWatchLogsLogGroupArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.createQueryLoggingConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 create-query-logging-config")
				.argument("hosted-zone-id", hostedZoneId)
				.argument("cloud-watch-logs-log-group-arn", cloudWatchLogsLogGroupArn)
	}

}


fun AmazonRoute53Functions.createReusableDelegationSet(callerReference: String, init: AmazonRoute53CreateReusableDelegationSetCommand.() -> Unit) {
	this.block.declare(AmazonRoute53CreateReusableDelegationSetCommand(callerReference).apply(init))
}

@Generated
class AmazonRoute53CreateReusableDelegationSetCommand(val callerReference: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.CreateReusableDelegationSetRequest> {

	var hostedZoneId: String? = null

	override fun build(): com.amazonaws.services.route53.model.CreateReusableDelegationSetRequest {
		val input = com.amazonaws.services.route53.model.CreateReusableDelegationSetRequest()
		input.setCallerReference(this.callerReference)
		input.setHostedZoneId(this.hostedZoneId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.createReusableDelegationSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 create-reusable-delegation-set")
				.argument("caller-reference", callerReference)
				.argument("hosted-zone-id", hostedZoneId)
	}

}


fun AmazonRoute53Functions.createTrafficPolicy(name: String, document: String, init: AmazonRoute53CreateTrafficPolicyCommand.() -> Unit) {
	this.block.declare(AmazonRoute53CreateTrafficPolicyCommand(name, document).apply(init))
}

@Generated
class AmazonRoute53CreateTrafficPolicyCommand(val name: String, val document: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.CreateTrafficPolicyRequest> {

	var comment: String? = null

	override fun build(): com.amazonaws.services.route53.model.CreateTrafficPolicyRequest {
		val input = com.amazonaws.services.route53.model.CreateTrafficPolicyRequest()
		input.setName(this.name)
		input.setDocument(this.document)
		input.setComment(this.comment)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.createTrafficPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 create-traffic-policy")
				.argument("name", name)
				.argument("document", document)
				.argument("comment", comment)
	}

}


fun AmazonRoute53Functions.createTrafficPolicyInstance(hostedZoneId: String, name: String, tTL: Long, trafficPolicyId: String, trafficPolicyVersion: Int, init: AmazonRoute53CreateTrafficPolicyInstanceCommand.() -> Unit) {
	this.block.declare(AmazonRoute53CreateTrafficPolicyInstanceCommand(hostedZoneId, name, tTL, trafficPolicyId, trafficPolicyVersion).apply(init))
}

@Generated
class AmazonRoute53CreateTrafficPolicyInstanceCommand(val hostedZoneId: String, val name: String, val tTL: Long, val trafficPolicyId: String, val trafficPolicyVersion: Int) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.CreateTrafficPolicyInstanceRequest> {



	override fun build(): com.amazonaws.services.route53.model.CreateTrafficPolicyInstanceRequest {
		val input = com.amazonaws.services.route53.model.CreateTrafficPolicyInstanceRequest()
		input.setHostedZoneId(this.hostedZoneId)
		input.setName(this.name)
		input.setTTL(this.tTL)
		input.setTrafficPolicyId(this.trafficPolicyId)
		input.setTrafficPolicyVersion(this.trafficPolicyVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.createTrafficPolicyInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 create-traffic-policy-instance")
				.argument("hosted-zone-id", hostedZoneId)
				.argument("name", name)
				.argument("ttl", tTL.toString())
				.argument("traffic-policy-id", trafficPolicyId)
				.argument("traffic-policy-version", trafficPolicyVersion.toString())
	}

}


fun AmazonRoute53Functions.createTrafficPolicyVersion(id: String, document: String, init: AmazonRoute53CreateTrafficPolicyVersionCommand.() -> Unit) {
	this.block.declare(AmazonRoute53CreateTrafficPolicyVersionCommand(id, document).apply(init))
}

@Generated
class AmazonRoute53CreateTrafficPolicyVersionCommand(val id: String, val document: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.CreateTrafficPolicyVersionRequest> {

	var comment: String? = null

	override fun build(): com.amazonaws.services.route53.model.CreateTrafficPolicyVersionRequest {
		val input = com.amazonaws.services.route53.model.CreateTrafficPolicyVersionRequest()
		input.setId(this.id)
		input.setDocument(this.document)
		input.setComment(this.comment)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.createTrafficPolicyVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 create-traffic-policy-version")
				.argument("id", id)
				.argument("document", document)
				.argument("comment", comment)
	}

}


fun AmazonRoute53Functions.createVPCAssociationAuthorization(hostedZoneId: String, vPC: com.amazonaws.services.route53.model.VPC, init: AmazonRoute53CreateVPCAssociationAuthorizationCommand.() -> Unit) {
	this.block.declare(AmazonRoute53CreateVPCAssociationAuthorizationCommand(hostedZoneId, vPC).apply(init))
}

@Generated
class AmazonRoute53CreateVPCAssociationAuthorizationCommand(val hostedZoneId: String, val vPC: com.amazonaws.services.route53.model.VPC) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.CreateVPCAssociationAuthorizationRequest> {



	override fun build(): com.amazonaws.services.route53.model.CreateVPCAssociationAuthorizationRequest {
		val input = com.amazonaws.services.route53.model.CreateVPCAssociationAuthorizationRequest()
		input.setHostedZoneId(this.hostedZoneId)
		input.setVPC(this.vPC)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.createVPCAssociationAuthorization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 create-vpcassociation-authorization")
				.argument("hosted-zone-id", hostedZoneId)
				.argument("vpc", vPC.toString())
	}

}


fun AmazonRoute53Functions.deleteHealthCheck(healthCheckId: String, init: AmazonRoute53DeleteHealthCheckCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DeleteHealthCheckCommand(healthCheckId).apply(init))
}

@Generated
class AmazonRoute53DeleteHealthCheckCommand(val healthCheckId: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.DeleteHealthCheckRequest> {



	override fun build(): com.amazonaws.services.route53.model.DeleteHealthCheckRequest {
		val input = com.amazonaws.services.route53.model.DeleteHealthCheckRequest()
		input.setHealthCheckId(this.healthCheckId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.deleteHealthCheck(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 delete-health-check")
				.argument("health-check-id", healthCheckId)
	}

}


fun AmazonRoute53Functions.deleteHostedZone(id: String, init: AmazonRoute53DeleteHostedZoneCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DeleteHostedZoneCommand(id).apply(init))
}

@Generated
class AmazonRoute53DeleteHostedZoneCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.DeleteHostedZoneRequest> {



	override fun build(): com.amazonaws.services.route53.model.DeleteHostedZoneRequest {
		val input = com.amazonaws.services.route53.model.DeleteHostedZoneRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.deleteHostedZone(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 delete-hosted-zone")
				.argument("id", id)
	}

}


fun AmazonRoute53Functions.deleteQueryLoggingConfig(id: String, init: AmazonRoute53DeleteQueryLoggingConfigCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DeleteQueryLoggingConfigCommand(id).apply(init))
}

@Generated
class AmazonRoute53DeleteQueryLoggingConfigCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.DeleteQueryLoggingConfigRequest> {



	override fun build(): com.amazonaws.services.route53.model.DeleteQueryLoggingConfigRequest {
		val input = com.amazonaws.services.route53.model.DeleteQueryLoggingConfigRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.deleteQueryLoggingConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 delete-query-logging-config")
				.argument("id", id)
	}

}


fun AmazonRoute53Functions.deleteReusableDelegationSet(id: String, init: AmazonRoute53DeleteReusableDelegationSetCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DeleteReusableDelegationSetCommand(id).apply(init))
}

@Generated
class AmazonRoute53DeleteReusableDelegationSetCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.DeleteReusableDelegationSetRequest> {



	override fun build(): com.amazonaws.services.route53.model.DeleteReusableDelegationSetRequest {
		val input = com.amazonaws.services.route53.model.DeleteReusableDelegationSetRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.deleteReusableDelegationSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 delete-reusable-delegation-set")
				.argument("id", id)
	}

}


fun AmazonRoute53Functions.deleteTrafficPolicy(id: String, version: Int, init: AmazonRoute53DeleteTrafficPolicyCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DeleteTrafficPolicyCommand(id, version).apply(init))
}

@Generated
class AmazonRoute53DeleteTrafficPolicyCommand(val id: String, val version: Int) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.DeleteTrafficPolicyRequest> {



	override fun build(): com.amazonaws.services.route53.model.DeleteTrafficPolicyRequest {
		val input = com.amazonaws.services.route53.model.DeleteTrafficPolicyRequest()
		input.setId(this.id)
		input.setVersion(this.version)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.deleteTrafficPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 delete-traffic-policy")
				.argument("id", id)
				.argument("version", version.toString())
	}

}


fun AmazonRoute53Functions.deleteTrafficPolicyInstance(id: String, init: AmazonRoute53DeleteTrafficPolicyInstanceCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DeleteTrafficPolicyInstanceCommand(id).apply(init))
}

@Generated
class AmazonRoute53DeleteTrafficPolicyInstanceCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.DeleteTrafficPolicyInstanceRequest> {



	override fun build(): com.amazonaws.services.route53.model.DeleteTrafficPolicyInstanceRequest {
		val input = com.amazonaws.services.route53.model.DeleteTrafficPolicyInstanceRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.deleteTrafficPolicyInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 delete-traffic-policy-instance")
				.argument("id", id)
	}

}


fun AmazonRoute53Functions.deleteVPCAssociationAuthorization(hostedZoneId: String, vPC: com.amazonaws.services.route53.model.VPC, init: AmazonRoute53DeleteVPCAssociationAuthorizationCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DeleteVPCAssociationAuthorizationCommand(hostedZoneId, vPC).apply(init))
}

@Generated
class AmazonRoute53DeleteVPCAssociationAuthorizationCommand(val hostedZoneId: String, val vPC: com.amazonaws.services.route53.model.VPC) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.DeleteVPCAssociationAuthorizationRequest> {



	override fun build(): com.amazonaws.services.route53.model.DeleteVPCAssociationAuthorizationRequest {
		val input = com.amazonaws.services.route53.model.DeleteVPCAssociationAuthorizationRequest()
		input.setHostedZoneId(this.hostedZoneId)
		input.setVPC(this.vPC)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.deleteVPCAssociationAuthorization(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 delete-vpcassociation-authorization")
				.argument("hosted-zone-id", hostedZoneId)
				.argument("vpc", vPC.toString())
	}

}


fun AmazonRoute53Functions.disassociateVPCFromHostedZone(hostedZoneId: String, vPC: com.amazonaws.services.route53.model.VPC, init: AmazonRoute53DisassociateVPCFromHostedZoneCommand.() -> Unit) {
	this.block.declare(AmazonRoute53DisassociateVPCFromHostedZoneCommand(hostedZoneId, vPC).apply(init))
}

@Generated
class AmazonRoute53DisassociateVPCFromHostedZoneCommand(val hostedZoneId: String, val vPC: com.amazonaws.services.route53.model.VPC) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.DisassociateVPCFromHostedZoneRequest> {

	var comment: String? = null

	override fun build(): com.amazonaws.services.route53.model.DisassociateVPCFromHostedZoneRequest {
		val input = com.amazonaws.services.route53.model.DisassociateVPCFromHostedZoneRequest()
		input.setHostedZoneId(this.hostedZoneId)
		input.setVPC(this.vPC)
		input.setComment(this.comment)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.disassociateVPCFromHostedZone(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 disassociate-vpcfrom-hosted-zone")
				.argument("hosted-zone-id", hostedZoneId)
				.argument("vpc", vPC.toString())
				.argument("comment", comment)
	}

}


fun AmazonRoute53Functions.getAccountLimit(type: AccountLimitType, init: AmazonRoute53GetAccountLimitCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetAccountLimitCommand(type).apply(init))
}

@Generated
class AmazonRoute53GetAccountLimitCommand(val type: AccountLimitType) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetAccountLimitRequest> {



	override fun build(): com.amazonaws.services.route53.model.GetAccountLimitRequest {
		val input = com.amazonaws.services.route53.model.GetAccountLimitRequest()
		input.setType(this.type.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getAccountLimit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-account-limit")
				.argument("type", type.toString())
	}

}


fun AmazonRoute53Functions.getChange(id: String, init: AmazonRoute53GetChangeCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetChangeCommand(id).apply(init))
}

@Generated
class AmazonRoute53GetChangeCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetChangeRequest> {



	override fun build(): com.amazonaws.services.route53.model.GetChangeRequest {
		val input = com.amazonaws.services.route53.model.GetChangeRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getChange(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-change")
				.argument("id", id)
	}

}


fun AmazonRoute53Functions.getCheckerIpRanges(init: AmazonRoute53GetCheckerIpRangesCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetCheckerIpRangesCommand().apply(init))
}

@Generated
class AmazonRoute53GetCheckerIpRangesCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetCheckerIpRangesRequest> {



	override fun build(): com.amazonaws.services.route53.model.GetCheckerIpRangesRequest {
		val input = com.amazonaws.services.route53.model.GetCheckerIpRangesRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getCheckerIpRanges(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-checker-ip-ranges")

	}

}


fun AmazonRoute53Functions.getGeoLocation(init: AmazonRoute53GetGeoLocationCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetGeoLocationCommand().apply(init))
}

@Generated
class AmazonRoute53GetGeoLocationCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetGeoLocationRequest> {

	var continentCode: String? = null
	var countryCode: String? = null
	var subdivisionCode: String? = null

	override fun build(): com.amazonaws.services.route53.model.GetGeoLocationRequest {
		val input = com.amazonaws.services.route53.model.GetGeoLocationRequest()
		input.setContinentCode(this.continentCode)
		input.setCountryCode(this.countryCode)
		input.setSubdivisionCode(this.subdivisionCode)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getGeoLocation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-geo-location")
				.argument("continent-code", continentCode)
				.argument("country-code", countryCode)
				.argument("subdivision-code", subdivisionCode)
	}

}


fun AmazonRoute53Functions.getHealthCheck(healthCheckId: String, init: AmazonRoute53GetHealthCheckCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetHealthCheckCommand(healthCheckId).apply(init))
}

@Generated
class AmazonRoute53GetHealthCheckCommand(val healthCheckId: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetHealthCheckRequest> {



	override fun build(): com.amazonaws.services.route53.model.GetHealthCheckRequest {
		val input = com.amazonaws.services.route53.model.GetHealthCheckRequest()
		input.setHealthCheckId(this.healthCheckId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getHealthCheck(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-health-check")
				.argument("health-check-id", healthCheckId)
	}

}


fun AmazonRoute53Functions.getHealthCheckCount(init: AmazonRoute53GetHealthCheckCountCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetHealthCheckCountCommand().apply(init))
}

@Generated
class AmazonRoute53GetHealthCheckCountCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetHealthCheckCountRequest> {



	override fun build(): com.amazonaws.services.route53.model.GetHealthCheckCountRequest {
		val input = com.amazonaws.services.route53.model.GetHealthCheckCountRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getHealthCheckCount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-health-check-count")

	}

}


fun AmazonRoute53Functions.getHealthCheckLastFailureReason(healthCheckId: String, init: AmazonRoute53GetHealthCheckLastFailureReasonCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetHealthCheckLastFailureReasonCommand(healthCheckId).apply(init))
}

@Generated
class AmazonRoute53GetHealthCheckLastFailureReasonCommand(val healthCheckId: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetHealthCheckLastFailureReasonRequest> {



	override fun build(): com.amazonaws.services.route53.model.GetHealthCheckLastFailureReasonRequest {
		val input = com.amazonaws.services.route53.model.GetHealthCheckLastFailureReasonRequest()
		input.setHealthCheckId(this.healthCheckId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getHealthCheckLastFailureReason(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-health-check-last-failure-reason")
				.argument("health-check-id", healthCheckId)
	}

}


fun AmazonRoute53Functions.getHealthCheckStatus(healthCheckId: String, init: AmazonRoute53GetHealthCheckStatusCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetHealthCheckStatusCommand(healthCheckId).apply(init))
}

@Generated
class AmazonRoute53GetHealthCheckStatusCommand(val healthCheckId: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetHealthCheckStatusRequest> {



	override fun build(): com.amazonaws.services.route53.model.GetHealthCheckStatusRequest {
		val input = com.amazonaws.services.route53.model.GetHealthCheckStatusRequest()
		input.setHealthCheckId(this.healthCheckId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getHealthCheckStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-health-check-status")
				.argument("health-check-id", healthCheckId)
	}

}


fun AmazonRoute53Functions.getHostedZone(id: String, init: AmazonRoute53GetHostedZoneCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetHostedZoneCommand(id).apply(init))
}

@Generated
class AmazonRoute53GetHostedZoneCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetHostedZoneRequest> {



	override fun build(): com.amazonaws.services.route53.model.GetHostedZoneRequest {
		val input = com.amazonaws.services.route53.model.GetHostedZoneRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getHostedZone(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-hosted-zone")
				.argument("id", id)
	}

}


fun AmazonRoute53Functions.getHostedZoneCount(init: AmazonRoute53GetHostedZoneCountCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetHostedZoneCountCommand().apply(init))
}

@Generated
class AmazonRoute53GetHostedZoneCountCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetHostedZoneCountRequest> {



	override fun build(): com.amazonaws.services.route53.model.GetHostedZoneCountRequest {
		val input = com.amazonaws.services.route53.model.GetHostedZoneCountRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getHostedZoneCount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-hosted-zone-count")

	}

}


fun AmazonRoute53Functions.getHostedZoneLimit(type: HostedZoneLimitType, hostedZoneId: String, init: AmazonRoute53GetHostedZoneLimitCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetHostedZoneLimitCommand(type, hostedZoneId).apply(init))
}

@Generated
class AmazonRoute53GetHostedZoneLimitCommand(val type: HostedZoneLimitType, val hostedZoneId: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetHostedZoneLimitRequest> {



	override fun build(): com.amazonaws.services.route53.model.GetHostedZoneLimitRequest {
		val input = com.amazonaws.services.route53.model.GetHostedZoneLimitRequest()
		input.setType(this.type.toString())
		input.setHostedZoneId(this.hostedZoneId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getHostedZoneLimit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-hosted-zone-limit")
				.argument("type", type.toString())
				.argument("hosted-zone-id", hostedZoneId)
	}

}


fun AmazonRoute53Functions.getQueryLoggingConfig(id: String, init: AmazonRoute53GetQueryLoggingConfigCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetQueryLoggingConfigCommand(id).apply(init))
}

@Generated
class AmazonRoute53GetQueryLoggingConfigCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetQueryLoggingConfigRequest> {



	override fun build(): com.amazonaws.services.route53.model.GetQueryLoggingConfigRequest {
		val input = com.amazonaws.services.route53.model.GetQueryLoggingConfigRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getQueryLoggingConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-query-logging-config")
				.argument("id", id)
	}

}


fun AmazonRoute53Functions.getReusableDelegationSet(id: String, init: AmazonRoute53GetReusableDelegationSetCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetReusableDelegationSetCommand(id).apply(init))
}

@Generated
class AmazonRoute53GetReusableDelegationSetCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetReusableDelegationSetRequest> {



	override fun build(): com.amazonaws.services.route53.model.GetReusableDelegationSetRequest {
		val input = com.amazonaws.services.route53.model.GetReusableDelegationSetRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getReusableDelegationSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-reusable-delegation-set")
				.argument("id", id)
	}

}


fun AmazonRoute53Functions.getReusableDelegationSetLimit(type: ReusableDelegationSetLimitType, delegationSetId: String, init: AmazonRoute53GetReusableDelegationSetLimitCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetReusableDelegationSetLimitCommand(type, delegationSetId).apply(init))
}

@Generated
class AmazonRoute53GetReusableDelegationSetLimitCommand(val type: ReusableDelegationSetLimitType, val delegationSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetReusableDelegationSetLimitRequest> {



	override fun build(): com.amazonaws.services.route53.model.GetReusableDelegationSetLimitRequest {
		val input = com.amazonaws.services.route53.model.GetReusableDelegationSetLimitRequest()
		input.setType(this.type.toString())
		input.setDelegationSetId(this.delegationSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getReusableDelegationSetLimit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-reusable-delegation-set-limit")
				.argument("type", type.toString())
				.argument("delegation-set-id", delegationSetId)
	}

}


fun AmazonRoute53Functions.getTrafficPolicy(id: String, version: Int, init: AmazonRoute53GetTrafficPolicyCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetTrafficPolicyCommand(id, version).apply(init))
}

@Generated
class AmazonRoute53GetTrafficPolicyCommand(val id: String, val version: Int) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetTrafficPolicyRequest> {



	override fun build(): com.amazonaws.services.route53.model.GetTrafficPolicyRequest {
		val input = com.amazonaws.services.route53.model.GetTrafficPolicyRequest()
		input.setId(this.id)
		input.setVersion(this.version)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getTrafficPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-traffic-policy")
				.argument("id", id)
				.argument("version", version.toString())
	}

}


fun AmazonRoute53Functions.getTrafficPolicyInstance(id: String, init: AmazonRoute53GetTrafficPolicyInstanceCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetTrafficPolicyInstanceCommand(id).apply(init))
}

@Generated
class AmazonRoute53GetTrafficPolicyInstanceCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetTrafficPolicyInstanceRequest> {



	override fun build(): com.amazonaws.services.route53.model.GetTrafficPolicyInstanceRequest {
		val input = com.amazonaws.services.route53.model.GetTrafficPolicyInstanceRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getTrafficPolicyInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-traffic-policy-instance")
				.argument("id", id)
	}

}


fun AmazonRoute53Functions.getTrafficPolicyInstanceCount(init: AmazonRoute53GetTrafficPolicyInstanceCountCommand.() -> Unit) {
	this.block.declare(AmazonRoute53GetTrafficPolicyInstanceCountCommand().apply(init))
}

@Generated
class AmazonRoute53GetTrafficPolicyInstanceCountCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53.model.GetTrafficPolicyInstanceCountRequest> {



	override fun build(): com.amazonaws.services.route53.model.GetTrafficPolicyInstanceCountRequest {
		val input = com.amazonaws.services.route53.model.GetTrafficPolicyInstanceCountRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.getTrafficPolicyInstanceCount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 get-traffic-policy-instance-count")

	}

}


fun AmazonRoute53Functions.listGeoLocations(init: AmazonRoute53ListGeoLocationsCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ListGeoLocationsCommand().apply(init))
}

@Generated
class AmazonRoute53ListGeoLocationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ListGeoLocationsRequest> {

	var startContinentCode: String? = null
	var startCountryCode: String? = null
	var startSubdivisionCode: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.route53.model.ListGeoLocationsRequest {
		val input = com.amazonaws.services.route53.model.ListGeoLocationsRequest()
		input.setStartContinentCode(this.startContinentCode)
		input.setStartCountryCode(this.startCountryCode)
		input.setStartSubdivisionCode(this.startSubdivisionCode)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.listGeoLocations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 list-geo-locations")
				.argument("start-continent-code", startContinentCode)
				.argument("start-country-code", startCountryCode)
				.argument("start-subdivision-code", startSubdivisionCode)
				.argument("max-items", maxItems)
	}

}


fun AmazonRoute53Functions.listHealthChecks(init: AmazonRoute53ListHealthChecksCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ListHealthChecksCommand().apply(init))
}

@Generated
class AmazonRoute53ListHealthChecksCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ListHealthChecksRequest> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.route53.model.ListHealthChecksRequest {
		val input = com.amazonaws.services.route53.model.ListHealthChecksRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.listHealthChecks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 list-health-checks")
				.argument("marker", marker)
				.argument("max-items", maxItems)
	}

}


fun AmazonRoute53Functions.listHostedZones(init: AmazonRoute53ListHostedZonesCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ListHostedZonesCommand().apply(init))
}

@Generated
class AmazonRoute53ListHostedZonesCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ListHostedZonesRequest> {

	var marker: String? = null
	var maxItems: String? = null
	var delegationSetId: String? = null

	override fun build(): com.amazonaws.services.route53.model.ListHostedZonesRequest {
		val input = com.amazonaws.services.route53.model.ListHostedZonesRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		input.setDelegationSetId(this.delegationSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.listHostedZones(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 list-hosted-zones")
				.argument("marker", marker)
				.argument("max-items", maxItems)
				.argument("delegation-set-id", delegationSetId)
	}

}


fun AmazonRoute53Functions.listHostedZonesByName(init: AmazonRoute53ListHostedZonesByNameCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ListHostedZonesByNameCommand().apply(init))
}

@Generated
class AmazonRoute53ListHostedZonesByNameCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ListHostedZonesByNameRequest> {

	var dNSName: String? = null
	var hostedZoneId: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.route53.model.ListHostedZonesByNameRequest {
		val input = com.amazonaws.services.route53.model.ListHostedZonesByNameRequest()
		input.setDNSName(this.dNSName)
		input.setHostedZoneId(this.hostedZoneId)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.listHostedZonesByName(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 list-hosted-zones-by-name")
				.argument("dnsname", dNSName)
				.argument("hosted-zone-id", hostedZoneId)
				.argument("max-items", maxItems)
	}

}


fun AmazonRoute53Functions.listQueryLoggingConfigs(init: AmazonRoute53ListQueryLoggingConfigsCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ListQueryLoggingConfigsCommand().apply(init))
}

@Generated
class AmazonRoute53ListQueryLoggingConfigsCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ListQueryLoggingConfigsRequest> {

	var hostedZoneId: String? = null
	var nextToken: String? = null
	var maxResults: String? = null

	override fun build(): com.amazonaws.services.route53.model.ListQueryLoggingConfigsRequest {
		val input = com.amazonaws.services.route53.model.ListQueryLoggingConfigsRequest()
		input.setHostedZoneId(this.hostedZoneId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.listQueryLoggingConfigs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 list-query-logging-configs")
				.argument("hosted-zone-id", hostedZoneId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults)
	}

}


fun AmazonRoute53Functions.listResourceRecordSets(hostedZoneId: String, init: AmazonRoute53ListResourceRecordSetsCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ListResourceRecordSetsCommand(hostedZoneId).apply(init))
}

@Generated
class AmazonRoute53ListResourceRecordSetsCommand(val hostedZoneId: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ListResourceRecordSetsRequest> {

	var startRecordName: String? = null
	var startRecordType: RRType? = null
	var startRecordIdentifier: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.route53.model.ListResourceRecordSetsRequest {
		val input = com.amazonaws.services.route53.model.ListResourceRecordSetsRequest()
		input.setHostedZoneId(this.hostedZoneId)
		input.setStartRecordName(this.startRecordName)
		input.setStartRecordType(this.startRecordType?.toString())
		input.setStartRecordIdentifier(this.startRecordIdentifier)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.listResourceRecordSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 list-resource-record-sets")
				.argument("hosted-zone-id", hostedZoneId)
				.argument("start-record-name", startRecordName)
				.argument("start-record-type", startRecordType?.toString())
				.argument("start-record-identifier", startRecordIdentifier)
				.argument("max-items", maxItems)
	}

}


fun AmazonRoute53Functions.listReusableDelegationSets(init: AmazonRoute53ListReusableDelegationSetsCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ListReusableDelegationSetsCommand().apply(init))
}

@Generated
class AmazonRoute53ListReusableDelegationSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ListReusableDelegationSetsRequest> {

	var marker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.route53.model.ListReusableDelegationSetsRequest {
		val input = com.amazonaws.services.route53.model.ListReusableDelegationSetsRequest()
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.listReusableDelegationSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 list-reusable-delegation-sets")
				.argument("marker", marker)
				.argument("max-items", maxItems)
	}

}


fun AmazonRoute53Functions.listTagsForResource(resourceType: TagResourceType, resourceId: String, init: AmazonRoute53ListTagsForResourceCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ListTagsForResourceCommand(resourceType, resourceId).apply(init))
}

@Generated
class AmazonRoute53ListTagsForResourceCommand(val resourceType: TagResourceType, val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ListTagsForResourceRequest> {



	override fun build(): com.amazonaws.services.route53.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.route53.model.ListTagsForResourceRequest()
		input.setResourceType(this.resourceType.toString())
		input.setResourceId(this.resourceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 list-tags-for-resource")
				.argument("resource-type", resourceType.toString())
				.argument("resource-id", resourceId)
	}

}


fun AmazonRoute53Functions.listTagsForResources(resourceType: TagResourceType, resourceIds: List<String>, init: AmazonRoute53ListTagsForResourcesCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ListTagsForResourcesCommand(resourceType, resourceIds).apply(init))
}

@Generated
class AmazonRoute53ListTagsForResourcesCommand(val resourceType: TagResourceType, val resourceIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ListTagsForResourcesRequest> {



	override fun build(): com.amazonaws.services.route53.model.ListTagsForResourcesRequest {
		val input = com.amazonaws.services.route53.model.ListTagsForResourcesRequest()
		input.setResourceType(this.resourceType.toString())
		input.setResourceIds(this.resourceIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.listTagsForResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 list-tags-for-resources")
				.argument("resource-type", resourceType.toString())
				.argument("resource-ids", resourceIds.toString())
	}

}


fun AmazonRoute53Functions.listTrafficPolicies(init: AmazonRoute53ListTrafficPoliciesCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ListTrafficPoliciesCommand().apply(init))
}

@Generated
class AmazonRoute53ListTrafficPoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ListTrafficPoliciesRequest> {

	var trafficPolicyIdMarker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.route53.model.ListTrafficPoliciesRequest {
		val input = com.amazonaws.services.route53.model.ListTrafficPoliciesRequest()
		input.setTrafficPolicyIdMarker(this.trafficPolicyIdMarker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.listTrafficPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 list-traffic-policies")
				.argument("traffic-policy-id-marker", trafficPolicyIdMarker)
				.argument("max-items", maxItems)
	}

}


fun AmazonRoute53Functions.listTrafficPolicyInstances(init: AmazonRoute53ListTrafficPolicyInstancesCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ListTrafficPolicyInstancesCommand().apply(init))
}

@Generated
class AmazonRoute53ListTrafficPolicyInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ListTrafficPolicyInstancesRequest> {

	var hostedZoneIdMarker: String? = null
	var trafficPolicyInstanceNameMarker: String? = null
	var trafficPolicyInstanceTypeMarker: RRType? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.route53.model.ListTrafficPolicyInstancesRequest {
		val input = com.amazonaws.services.route53.model.ListTrafficPolicyInstancesRequest()
		input.setHostedZoneIdMarker(this.hostedZoneIdMarker)
		input.setTrafficPolicyInstanceNameMarker(this.trafficPolicyInstanceNameMarker)
		input.setTrafficPolicyInstanceTypeMarker(this.trafficPolicyInstanceTypeMarker?.toString())
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.listTrafficPolicyInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 list-traffic-policy-instances")
				.argument("hosted-zone-id-marker", hostedZoneIdMarker)
				.argument("traffic-policy-instance-name-marker", trafficPolicyInstanceNameMarker)
				.argument("traffic-policy-instance-type-marker", trafficPolicyInstanceTypeMarker?.toString())
				.argument("max-items", maxItems)
	}

}


fun AmazonRoute53Functions.listTrafficPolicyInstancesByHostedZone(hostedZoneId: String, init: AmazonRoute53ListTrafficPolicyInstancesByHostedZoneCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ListTrafficPolicyInstancesByHostedZoneCommand(hostedZoneId).apply(init))
}

@Generated
class AmazonRoute53ListTrafficPolicyInstancesByHostedZoneCommand(val hostedZoneId: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByHostedZoneRequest> {

	var trafficPolicyInstanceNameMarker: String? = null
	var trafficPolicyInstanceTypeMarker: RRType? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByHostedZoneRequest {
		val input = com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByHostedZoneRequest()
		input.setHostedZoneId(this.hostedZoneId)
		input.setTrafficPolicyInstanceNameMarker(this.trafficPolicyInstanceNameMarker)
		input.setTrafficPolicyInstanceTypeMarker(this.trafficPolicyInstanceTypeMarker?.toString())
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.listTrafficPolicyInstancesByHostedZone(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 list-traffic-policy-instances-by-hosted-zone")
				.argument("hosted-zone-id", hostedZoneId)
				.argument("traffic-policy-instance-name-marker", trafficPolicyInstanceNameMarker)
				.argument("traffic-policy-instance-type-marker", trafficPolicyInstanceTypeMarker?.toString())
				.argument("max-items", maxItems)
	}

}


fun AmazonRoute53Functions.listTrafficPolicyInstancesByPolicy(trafficPolicyId: String, trafficPolicyVersion: Int, init: AmazonRoute53ListTrafficPolicyInstancesByPolicyCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ListTrafficPolicyInstancesByPolicyCommand(trafficPolicyId, trafficPolicyVersion).apply(init))
}

@Generated
class AmazonRoute53ListTrafficPolicyInstancesByPolicyCommand(val trafficPolicyId: String, val trafficPolicyVersion: Int) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByPolicyRequest> {

	var hostedZoneIdMarker: String? = null
	var trafficPolicyInstanceNameMarker: String? = null
	var trafficPolicyInstanceTypeMarker: RRType? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByPolicyRequest {
		val input = com.amazonaws.services.route53.model.ListTrafficPolicyInstancesByPolicyRequest()
		input.setTrafficPolicyId(this.trafficPolicyId)
		input.setTrafficPolicyVersion(this.trafficPolicyVersion)
		input.setHostedZoneIdMarker(this.hostedZoneIdMarker)
		input.setTrafficPolicyInstanceNameMarker(this.trafficPolicyInstanceNameMarker)
		input.setTrafficPolicyInstanceTypeMarker(this.trafficPolicyInstanceTypeMarker?.toString())
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.listTrafficPolicyInstancesByPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 list-traffic-policy-instances-by-policy")
				.argument("traffic-policy-id", trafficPolicyId)
				.argument("traffic-policy-version", trafficPolicyVersion.toString())
				.argument("hosted-zone-id-marker", hostedZoneIdMarker)
				.argument("traffic-policy-instance-name-marker", trafficPolicyInstanceNameMarker)
				.argument("traffic-policy-instance-type-marker", trafficPolicyInstanceTypeMarker?.toString())
				.argument("max-items", maxItems)
	}

}


fun AmazonRoute53Functions.listTrafficPolicyVersions(id: String, init: AmazonRoute53ListTrafficPolicyVersionsCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ListTrafficPolicyVersionsCommand(id).apply(init))
}

@Generated
class AmazonRoute53ListTrafficPolicyVersionsCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ListTrafficPolicyVersionsRequest> {

	var trafficPolicyVersionMarker: String? = null
	var maxItems: String? = null

	override fun build(): com.amazonaws.services.route53.model.ListTrafficPolicyVersionsRequest {
		val input = com.amazonaws.services.route53.model.ListTrafficPolicyVersionsRequest()
		input.setId(this.id)
		input.setTrafficPolicyVersionMarker(this.trafficPolicyVersionMarker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.listTrafficPolicyVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 list-traffic-policy-versions")
				.argument("id", id)
				.argument("traffic-policy-version-marker", trafficPolicyVersionMarker)
				.argument("max-items", maxItems)
	}

}


fun AmazonRoute53Functions.listVPCAssociationAuthorizations(hostedZoneId: String, init: AmazonRoute53ListVPCAssociationAuthorizationsCommand.() -> Unit) {
	this.block.declare(AmazonRoute53ListVPCAssociationAuthorizationsCommand(hostedZoneId).apply(init))
}

@Generated
class AmazonRoute53ListVPCAssociationAuthorizationsCommand(val hostedZoneId: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.ListVPCAssociationAuthorizationsRequest> {

	var nextToken: String? = null
	var maxResults: String? = null

	override fun build(): com.amazonaws.services.route53.model.ListVPCAssociationAuthorizationsRequest {
		val input = com.amazonaws.services.route53.model.ListVPCAssociationAuthorizationsRequest()
		input.setHostedZoneId(this.hostedZoneId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.listVPCAssociationAuthorizations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 list-vpcassociation-authorizations")
				.argument("hosted-zone-id", hostedZoneId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults)
	}

}


fun AmazonRoute53Functions.testDNSAnswer(hostedZoneId: String, recordName: String, recordType: RRType, init: AmazonRoute53TestDNSAnswerCommand.() -> Unit) {
	this.block.declare(AmazonRoute53TestDNSAnswerCommand(hostedZoneId, recordName, recordType).apply(init))
}

@Generated
class AmazonRoute53TestDNSAnswerCommand(val hostedZoneId: String, val recordName: String, val recordType: RRType) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.TestDNSAnswerRequest> {

	var resolverIP: String? = null
	var eDNS0ClientSubnetIP: String? = null
	var eDNS0ClientSubnetMask: String? = null

	override fun build(): com.amazonaws.services.route53.model.TestDNSAnswerRequest {
		val input = com.amazonaws.services.route53.model.TestDNSAnswerRequest()
		input.setHostedZoneId(this.hostedZoneId)
		input.setRecordName(this.recordName)
		input.setRecordType(this.recordType.toString())
		input.setResolverIP(this.resolverIP)
		input.setEDNS0ClientSubnetIP(this.eDNS0ClientSubnetIP)
		input.setEDNS0ClientSubnetMask(this.eDNS0ClientSubnetMask)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.testDNSAnswer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 test-dnsanswer")
				.argument("hosted-zone-id", hostedZoneId)
				.argument("record-name", recordName)
				.argument("record-type", recordType.toString())
				.argument("resolver-ip", resolverIP)
				.argument("edns0-client-subnet-ip", eDNS0ClientSubnetIP)
				.argument("edns0-client-subnet-mask", eDNS0ClientSubnetMask)
	}

}


fun AmazonRoute53Functions.updateHealthCheck(healthCheckId: String, init: AmazonRoute53UpdateHealthCheckCommand.() -> Unit) {
	this.block.declare(AmazonRoute53UpdateHealthCheckCommand(healthCheckId).apply(init))
}

@Generated
class AmazonRoute53UpdateHealthCheckCommand(val healthCheckId: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.UpdateHealthCheckRequest> {

	var healthCheckVersion: Long? = 0L
	var iPAddress: String? = null
	var port: Int? = 0
	var resourcePath: String? = null
	var fullyQualifiedDomainName: String? = null
	var searchString: String? = null
	var failureThreshold: Int? = 0
	var inverted: Boolean? = false
	var healthThreshold: Int? = 0
	var childHealthChecks: List<String>? = null
	var enableSNI: Boolean? = false
	var regions: List<HealthCheckRegion>? = null
	var alarmIdentifier: com.amazonaws.services.route53.model.AlarmIdentifier? = null
	var insufficientDataHealthStatus: InsufficientDataHealthStatus? = null
	var resetElements: List<ResettableElementName>? = null

	override fun build(): com.amazonaws.services.route53.model.UpdateHealthCheckRequest {
		val input = com.amazonaws.services.route53.model.UpdateHealthCheckRequest()
		input.setHealthCheckId(this.healthCheckId)
		input.setHealthCheckVersion(this.healthCheckVersion)
		input.setIPAddress(this.iPAddress)
		input.setPort(this.port)
		input.setResourcePath(this.resourcePath)
		input.setFullyQualifiedDomainName(this.fullyQualifiedDomainName)
		input.setSearchString(this.searchString)
		input.setFailureThreshold(this.failureThreshold)
		input.setInverted(this.inverted)
		input.setHealthThreshold(this.healthThreshold)
		input.setChildHealthChecks(this.childHealthChecks)
		input.setEnableSNI(this.enableSNI)
		input.setRegions(this.regions?.map { it.toString() })
		input.setAlarmIdentifier(this.alarmIdentifier)
		input.setInsufficientDataHealthStatus(this.insufficientDataHealthStatus?.toString())
		input.setResetElements(this.resetElements?.map { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.updateHealthCheck(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 update-health-check")
				.argument("health-check-id", healthCheckId)
				.argument("health-check-version", healthCheckVersion?.toString())
				.argument("ipaddress", iPAddress)
				.argument("port", port?.toString())
				.argument("resource-path", resourcePath)
				.argument("fully-qualified-domain-name", fullyQualifiedDomainName)
				.argument("search-string", searchString)
				.argument("failure-threshold", failureThreshold?.toString())
				.option("inverted", inverted ?: false)
				.argument("health-threshold", healthThreshold?.toString())
				.argument("child-health-checks", childHealthChecks?.toString())
				.option("enable-sni", enableSNI ?: false)
				.argument("regions", regions?.toString())
				.argument("alarm-identifier", alarmIdentifier?.toString())
				.argument("insufficient-data-health-status", insufficientDataHealthStatus?.toString())
				.argument("reset-elements", resetElements?.toString())
	}

}


fun AmazonRoute53Functions.updateHostedZoneComment(id: String, init: AmazonRoute53UpdateHostedZoneCommentCommand.() -> Unit) {
	this.block.declare(AmazonRoute53UpdateHostedZoneCommentCommand(id).apply(init))
}

@Generated
class AmazonRoute53UpdateHostedZoneCommentCommand(val id: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.UpdateHostedZoneCommentRequest> {

	var comment: String? = null

	override fun build(): com.amazonaws.services.route53.model.UpdateHostedZoneCommentRequest {
		val input = com.amazonaws.services.route53.model.UpdateHostedZoneCommentRequest()
		input.setId(this.id)
		input.setComment(this.comment)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.updateHostedZoneComment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 update-hosted-zone-comment")
				.argument("id", id)
				.argument("comment", comment)
	}

}


fun AmazonRoute53Functions.updateTrafficPolicyComment(id: String, version: Int, comment: String, init: AmazonRoute53UpdateTrafficPolicyCommentCommand.() -> Unit) {
	this.block.declare(AmazonRoute53UpdateTrafficPolicyCommentCommand(id, version, comment).apply(init))
}

@Generated
class AmazonRoute53UpdateTrafficPolicyCommentCommand(val id: String, val version: Int, val comment: String) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.UpdateTrafficPolicyCommentRequest> {



	override fun build(): com.amazonaws.services.route53.model.UpdateTrafficPolicyCommentRequest {
		val input = com.amazonaws.services.route53.model.UpdateTrafficPolicyCommentRequest()
		input.setId(this.id)
		input.setVersion(this.version)
		input.setComment(this.comment)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.updateTrafficPolicyComment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 update-traffic-policy-comment")
				.argument("id", id)
				.argument("version", version.toString())
				.argument("comment", comment)
	}

}


fun AmazonRoute53Functions.updateTrafficPolicyInstance(id: String, tTL: Long, trafficPolicyId: String, trafficPolicyVersion: Int, init: AmazonRoute53UpdateTrafficPolicyInstanceCommand.() -> Unit) {
	this.block.declare(AmazonRoute53UpdateTrafficPolicyInstanceCommand(id, tTL, trafficPolicyId, trafficPolicyVersion).apply(init))
}

@Generated
class AmazonRoute53UpdateTrafficPolicyInstanceCommand(val id: String, val tTL: Long, val trafficPolicyId: String, val trafficPolicyVersion: Int) : AmazonWebServiceCommand<com.amazonaws.services.route53.model.UpdateTrafficPolicyInstanceRequest> {



	override fun build(): com.amazonaws.services.route53.model.UpdateTrafficPolicyInstanceRequest {
		val input = com.amazonaws.services.route53.model.UpdateTrafficPolicyInstanceRequest()
		input.setId(this.id)
		input.setTTL(this.tTL)
		input.setTrafficPolicyId(this.trafficPolicyId)
		input.setTrafficPolicyVersion(this.trafficPolicyVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.route53.updateTrafficPolicyInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws route53 update-traffic-policy-instance")
				.argument("id", id)
				.argument("ttl", tTL.toString())
				.argument("traffic-policy-id", trafficPolicyId)
				.argument("traffic-policy-version", trafficPolicyVersion.toString())
	}

}
