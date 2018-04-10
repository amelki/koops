
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing
import com.amazonaws.services.elasticloadbalancing.model.*

var codingue.koops.core.Environment.elasticloadbalancing: AmazonElasticLoadBalancing
	get() = this.capabilities[AmazonElasticLoadBalancing::class.java.name] as AmazonElasticLoadBalancing
	set(elasticloadbalancing) {
		this.capabilities[AmazonElasticLoadBalancing::class.java.name] = elasticloadbalancing
	}

@Generated
class AmazonElasticLoadBalancingFunctions(val block: Block)

infix fun AwsContinuation.elasticloadbalancing(init: AmazonElasticLoadBalancingFunctions.() -> Unit) {
	AmazonElasticLoadBalancingFunctions(shell).apply(init)
}

			

fun AmazonElasticLoadBalancingFunctions.addTags(loadBalancerNames: List<String>, tags: List<com.amazonaws.services.elasticloadbalancing.model.Tag>, init: AmazonElasticLoadBalancingAddTagsCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingAddTagsCommand(loadBalancerNames, tags).apply(init))
}

@Generated
class AmazonElasticLoadBalancingAddTagsCommand(val loadBalancerNames: List<String>, val tags: List<com.amazonaws.services.elasticloadbalancing.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.AddTagsRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.AddTagsRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.AddTagsRequest()
		input.setLoadBalancerNames(this.loadBalancerNames)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.addTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing add-tags")
				.argument("load-balancer-names", loadBalancerNames.toString())
				.argument("tags", tags.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.applySecurityGroupsToLoadBalancer(loadBalancerName: String, securityGroups: List<String>, init: AmazonElasticLoadBalancingApplySecurityGroupsToLoadBalancerCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingApplySecurityGroupsToLoadBalancerCommand(loadBalancerName, securityGroups).apply(init))
}

@Generated
class AmazonElasticLoadBalancingApplySecurityGroupsToLoadBalancerCommand(val loadBalancerName: String, val securityGroups: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setSecurityGroups(this.securityGroups)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.applySecurityGroupsToLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing apply-security-groups-to-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
				.argument("security-groups", securityGroups.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.attachLoadBalancerToSubnets(loadBalancerName: String, subnets: List<String>, init: AmazonElasticLoadBalancingAttachLoadBalancerToSubnetsCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingAttachLoadBalancerToSubnetsCommand(loadBalancerName, subnets).apply(init))
}

@Generated
class AmazonElasticLoadBalancingAttachLoadBalancerToSubnetsCommand(val loadBalancerName: String, val subnets: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setSubnets(this.subnets)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.attachLoadBalancerToSubnets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing attach-load-balancer-to-subnets")
				.argument("load-balancer-name", loadBalancerName)
				.argument("subnets", subnets.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.configureHealthCheck(loadBalancerName: String, healthCheck: com.amazonaws.services.elasticloadbalancing.model.HealthCheck, init: AmazonElasticLoadBalancingConfigureHealthCheckCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingConfigureHealthCheckCommand(loadBalancerName, healthCheck).apply(init))
}

@Generated
class AmazonElasticLoadBalancingConfigureHealthCheckCommand(val loadBalancerName: String, val healthCheck: com.amazonaws.services.elasticloadbalancing.model.HealthCheck) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setHealthCheck(this.healthCheck)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.configureHealthCheck(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing configure-health-check")
				.argument("load-balancer-name", loadBalancerName)
				.argument("health-check", healthCheck.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.createAppCookieStickinessPolicy(loadBalancerName: String, policyName: String, cookieName: String, init: AmazonElasticLoadBalancingCreateAppCookieStickinessPolicyCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingCreateAppCookieStickinessPolicyCommand(loadBalancerName, policyName, cookieName).apply(init))
}

@Generated
class AmazonElasticLoadBalancingCreateAppCookieStickinessPolicyCommand(val loadBalancerName: String, val policyName: String, val cookieName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setPolicyName(this.policyName)
		input.setCookieName(this.cookieName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.createAppCookieStickinessPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing create-app-cookie-stickiness-policy")
				.argument("load-balancer-name", loadBalancerName)
				.argument("policy-name", policyName)
				.argument("cookie-name", cookieName)
	}

}


fun AmazonElasticLoadBalancingFunctions.createLBCookieStickinessPolicy(loadBalancerName: String, policyName: String, init: AmazonElasticLoadBalancingCreateLBCookieStickinessPolicyCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingCreateLBCookieStickinessPolicyCommand(loadBalancerName, policyName).apply(init))
}

@Generated
class AmazonElasticLoadBalancingCreateLBCookieStickinessPolicyCommand(val loadBalancerName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest> {

	var cookieExpirationPeriod: Long? = 0L

	override fun build(): com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setPolicyName(this.policyName)
		input.setCookieExpirationPeriod(this.cookieExpirationPeriod)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.createLBCookieStickinessPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing create-lbcookie-stickiness-policy")
				.argument("load-balancer-name", loadBalancerName)
				.argument("policy-name", policyName)
				.argument("cookie-expiration-period", cookieExpirationPeriod?.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.createLoadBalancer(loadBalancerName: String, listeners: List<com.amazonaws.services.elasticloadbalancing.model.Listener>, init: AmazonElasticLoadBalancingCreateLoadBalancerCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingCreateLoadBalancerCommand(loadBalancerName, listeners).apply(init))
}

@Generated
class AmazonElasticLoadBalancingCreateLoadBalancerCommand(val loadBalancerName: String, val listeners: List<com.amazonaws.services.elasticloadbalancing.model.Listener>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerRequest> {

	var availabilityZones: List<String>? = null
	var subnets: List<String>? = null
	var securityGroups: List<String>? = null
	var scheme: String? = null
	var tags: List<com.amazonaws.services.elasticloadbalancing.model.Tag>? = null

	override fun build(): com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setListeners(this.listeners)
		input.setAvailabilityZones(this.availabilityZones)
		input.setSubnets(this.subnets)
		input.setSecurityGroups(this.securityGroups)
		input.setScheme(this.scheme)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.createLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing create-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
				.argument("listeners", listeners.toString())
				.argument("availability-zones", availabilityZones?.toString())
				.argument("subnets", subnets?.toString())
				.argument("security-groups", securityGroups?.toString())
				.argument("scheme", scheme)
				.argument("tags", tags?.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.createLoadBalancerListeners(loadBalancerName: String, listeners: List<com.amazonaws.services.elasticloadbalancing.model.Listener>, init: AmazonElasticLoadBalancingCreateLoadBalancerListenersCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingCreateLoadBalancerListenersCommand(loadBalancerName, listeners).apply(init))
}

@Generated
class AmazonElasticLoadBalancingCreateLoadBalancerListenersCommand(val loadBalancerName: String, val listeners: List<com.amazonaws.services.elasticloadbalancing.model.Listener>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setListeners(this.listeners)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.createLoadBalancerListeners(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing create-load-balancer-listeners")
				.argument("load-balancer-name", loadBalancerName)
				.argument("listeners", listeners.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.createLoadBalancerPolicy(loadBalancerName: String, policyName: String, policyTypeName: String, init: AmazonElasticLoadBalancingCreateLoadBalancerPolicyCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingCreateLoadBalancerPolicyCommand(loadBalancerName, policyName, policyTypeName).apply(init))
}

@Generated
class AmazonElasticLoadBalancingCreateLoadBalancerPolicyCommand(val loadBalancerName: String, val policyName: String, val policyTypeName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest> {

	var policyAttributes: List<com.amazonaws.services.elasticloadbalancing.model.PolicyAttribute>? = null

	override fun build(): com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setPolicyName(this.policyName)
		input.setPolicyTypeName(this.policyTypeName)
		input.setPolicyAttributes(this.policyAttributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.createLoadBalancerPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing create-load-balancer-policy")
				.argument("load-balancer-name", loadBalancerName)
				.argument("policy-name", policyName)
				.argument("policy-type-name", policyTypeName)
				.argument("policy-attributes", policyAttributes?.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.deleteLoadBalancer(loadBalancerName: String, init: AmazonElasticLoadBalancingDeleteLoadBalancerCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingDeleteLoadBalancerCommand(loadBalancerName).apply(init))
}

@Generated
class AmazonElasticLoadBalancingDeleteLoadBalancerCommand(val loadBalancerName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.deleteLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing delete-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
	}

}


fun AmazonElasticLoadBalancingFunctions.deleteLoadBalancerListeners(loadBalancerName: String, loadBalancerPorts: List<Int>, init: AmazonElasticLoadBalancingDeleteLoadBalancerListenersCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingDeleteLoadBalancerListenersCommand(loadBalancerName, loadBalancerPorts).apply(init))
}

@Generated
class AmazonElasticLoadBalancingDeleteLoadBalancerListenersCommand(val loadBalancerName: String, val loadBalancerPorts: List<Int>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setLoadBalancerPorts(this.loadBalancerPorts)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.deleteLoadBalancerListeners(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing delete-load-balancer-listeners")
				.argument("load-balancer-name", loadBalancerName)
				.argument("load-balancer-ports", loadBalancerPorts.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.deleteLoadBalancerPolicy(loadBalancerName: String, policyName: String, init: AmazonElasticLoadBalancingDeleteLoadBalancerPolicyCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingDeleteLoadBalancerPolicyCommand(loadBalancerName, policyName).apply(init))
}

@Generated
class AmazonElasticLoadBalancingDeleteLoadBalancerPolicyCommand(val loadBalancerName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setPolicyName(this.policyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.deleteLoadBalancerPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing delete-load-balancer-policy")
				.argument("load-balancer-name", loadBalancerName)
				.argument("policy-name", policyName)
	}

}


fun AmazonElasticLoadBalancingFunctions.deregisterInstancesFromLoadBalancer(loadBalancerName: String, instances: List<com.amazonaws.services.elasticloadbalancing.model.Instance>, init: AmazonElasticLoadBalancingDeregisterInstancesFromLoadBalancerCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingDeregisterInstancesFromLoadBalancerCommand(loadBalancerName, instances).apply(init))
}

@Generated
class AmazonElasticLoadBalancingDeregisterInstancesFromLoadBalancerCommand(val loadBalancerName: String, val instances: List<com.amazonaws.services.elasticloadbalancing.model.Instance>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setInstances(this.instances)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.deregisterInstancesFromLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing deregister-instances-from-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
				.argument("instances", instances.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.describeAccountLimits(init: AmazonElasticLoadBalancingDescribeAccountLimitsCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingDescribeAccountLimitsCommand().apply(init))
}

@Generated
class AmazonElasticLoadBalancingDescribeAccountLimitsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsRequest> {

	var marker: String? = null
	var pageSize: Int? = 0

	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsRequest()
		input.setMarker(this.marker)
		input.setPageSize(this.pageSize)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.describeAccountLimits(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing describe-account-limits")
				.argument("marker", marker)
				.argument("page-size", pageSize?.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.describeInstanceHealth(loadBalancerName: String, init: AmazonElasticLoadBalancingDescribeInstanceHealthCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingDescribeInstanceHealthCommand(loadBalancerName).apply(init))
}

@Generated
class AmazonElasticLoadBalancingDescribeInstanceHealthCommand(val loadBalancerName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest> {

	var instances: List<com.amazonaws.services.elasticloadbalancing.model.Instance>? = null

	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setInstances(this.instances)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.describeInstanceHealth(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing describe-instance-health")
				.argument("load-balancer-name", loadBalancerName)
				.argument("instances", instances?.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.describeLoadBalancerAttributes(loadBalancerName: String, init: AmazonElasticLoadBalancingDescribeLoadBalancerAttributesCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingDescribeLoadBalancerAttributesCommand(loadBalancerName).apply(init))
}

@Generated
class AmazonElasticLoadBalancingDescribeLoadBalancerAttributesCommand(val loadBalancerName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.describeLoadBalancerAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing describe-load-balancer-attributes")
				.argument("load-balancer-name", loadBalancerName)
	}

}


fun AmazonElasticLoadBalancingFunctions.describeLoadBalancerPolicies(init: AmazonElasticLoadBalancingDescribeLoadBalancerPoliciesCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingDescribeLoadBalancerPoliciesCommand().apply(init))
}

@Generated
class AmazonElasticLoadBalancingDescribeLoadBalancerPoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest> {

	var loadBalancerName: String? = null
	var policyNames: List<String>? = null

	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setPolicyNames(this.policyNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.describeLoadBalancerPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing describe-load-balancer-policies")
				.argument("load-balancer-name", loadBalancerName)
				.argument("policy-names", policyNames?.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.describeLoadBalancerPolicyTypes(init: AmazonElasticLoadBalancingDescribeLoadBalancerPolicyTypesCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingDescribeLoadBalancerPolicyTypesCommand().apply(init))
}

@Generated
class AmazonElasticLoadBalancingDescribeLoadBalancerPolicyTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesRequest> {

	var policyTypeNames: List<String>? = null

	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesRequest()
		input.setPolicyTypeNames(this.policyTypeNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.describeLoadBalancerPolicyTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing describe-load-balancer-policy-types")
				.argument("policy-type-names", policyTypeNames?.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.describeLoadBalancers(init: AmazonElasticLoadBalancingDescribeLoadBalancersCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingDescribeLoadBalancersCommand().apply(init))
}

@Generated
class AmazonElasticLoadBalancingDescribeLoadBalancersCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersRequest> {

	var loadBalancerNames: List<String>? = null
	var marker: String? = null
	var pageSize: Int? = 0

	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersRequest()
		input.setLoadBalancerNames(this.loadBalancerNames)
		input.setMarker(this.marker)
		input.setPageSize(this.pageSize)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.describeLoadBalancers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing describe-load-balancers")
				.argument("load-balancer-names", loadBalancerNames?.toString())
				.argument("marker", marker)
				.argument("page-size", pageSize?.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.describeTags(loadBalancerNames: List<String>, init: AmazonElasticLoadBalancingDescribeTagsCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingDescribeTagsCommand(loadBalancerNames).apply(init))
}

@Generated
class AmazonElasticLoadBalancingDescribeTagsCommand(val loadBalancerNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DescribeTagsRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DescribeTagsRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DescribeTagsRequest()
		input.setLoadBalancerNames(this.loadBalancerNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.describeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing describe-tags")
				.argument("load-balancer-names", loadBalancerNames.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.detachLoadBalancerFromSubnets(loadBalancerName: String, subnets: List<String>, init: AmazonElasticLoadBalancingDetachLoadBalancerFromSubnetsCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingDetachLoadBalancerFromSubnetsCommand(loadBalancerName, subnets).apply(init))
}

@Generated
class AmazonElasticLoadBalancingDetachLoadBalancerFromSubnetsCommand(val loadBalancerName: String, val subnets: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setSubnets(this.subnets)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.detachLoadBalancerFromSubnets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing detach-load-balancer-from-subnets")
				.argument("load-balancer-name", loadBalancerName)
				.argument("subnets", subnets.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.disableAvailabilityZonesForLoadBalancer(loadBalancerName: String, availabilityZones: List<String>, init: AmazonElasticLoadBalancingDisableAvailabilityZonesForLoadBalancerCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingDisableAvailabilityZonesForLoadBalancerCommand(loadBalancerName, availabilityZones).apply(init))
}

@Generated
class AmazonElasticLoadBalancingDisableAvailabilityZonesForLoadBalancerCommand(val loadBalancerName: String, val availabilityZones: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setAvailabilityZones(this.availabilityZones)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.disableAvailabilityZonesForLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing disable-availability-zones-for-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
				.argument("availability-zones", availabilityZones.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.enableAvailabilityZonesForLoadBalancer(loadBalancerName: String, availabilityZones: List<String>, init: AmazonElasticLoadBalancingEnableAvailabilityZonesForLoadBalancerCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingEnableAvailabilityZonesForLoadBalancerCommand(loadBalancerName, availabilityZones).apply(init))
}

@Generated
class AmazonElasticLoadBalancingEnableAvailabilityZonesForLoadBalancerCommand(val loadBalancerName: String, val availabilityZones: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setAvailabilityZones(this.availabilityZones)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.enableAvailabilityZonesForLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing enable-availability-zones-for-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
				.argument("availability-zones", availabilityZones.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.modifyLoadBalancerAttributes(loadBalancerName: String, loadBalancerAttributes: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerAttributes, init: AmazonElasticLoadBalancingModifyLoadBalancerAttributesCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingModifyLoadBalancerAttributesCommand(loadBalancerName, loadBalancerAttributes).apply(init))
}

@Generated
class AmazonElasticLoadBalancingModifyLoadBalancerAttributesCommand(val loadBalancerName: String, val loadBalancerAttributes: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerAttributes) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setLoadBalancerAttributes(this.loadBalancerAttributes)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.modifyLoadBalancerAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing modify-load-balancer-attributes")
				.argument("load-balancer-name", loadBalancerName)
				.argument("load-balancer-attributes", loadBalancerAttributes.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.registerInstancesWithLoadBalancer(loadBalancerName: String, instances: List<com.amazonaws.services.elasticloadbalancing.model.Instance>, init: AmazonElasticLoadBalancingRegisterInstancesWithLoadBalancerCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingRegisterInstancesWithLoadBalancerCommand(loadBalancerName, instances).apply(init))
}

@Generated
class AmazonElasticLoadBalancingRegisterInstancesWithLoadBalancerCommand(val loadBalancerName: String, val instances: List<com.amazonaws.services.elasticloadbalancing.model.Instance>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setInstances(this.instances)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.registerInstancesWithLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing register-instances-with-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
				.argument("instances", instances.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.removeTags(loadBalancerNames: List<String>, tags: List<com.amazonaws.services.elasticloadbalancing.model.TagKeyOnly>, init: AmazonElasticLoadBalancingRemoveTagsCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingRemoveTagsCommand(loadBalancerNames, tags).apply(init))
}

@Generated
class AmazonElasticLoadBalancingRemoveTagsCommand(val loadBalancerNames: List<String>, val tags: List<com.amazonaws.services.elasticloadbalancing.model.TagKeyOnly>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.RemoveTagsRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.RemoveTagsRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.RemoveTagsRequest()
		input.setLoadBalancerNames(this.loadBalancerNames)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.removeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing remove-tags")
				.argument("load-balancer-names", loadBalancerNames.toString())
				.argument("tags", tags.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.setLoadBalancerListenerSSLCertificate(loadBalancerName: String, loadBalancerPort: Int, sSLCertificateId: String, init: AmazonElasticLoadBalancingSetLoadBalancerListenerSSLCertificateCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingSetLoadBalancerListenerSSLCertificateCommand(loadBalancerName, loadBalancerPort, sSLCertificateId).apply(init))
}

@Generated
class AmazonElasticLoadBalancingSetLoadBalancerListenerSSLCertificateCommand(val loadBalancerName: String, val loadBalancerPort: Int, val sSLCertificateId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setLoadBalancerPort(this.loadBalancerPort)
		input.setSSLCertificateId(this.sSLCertificateId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.setLoadBalancerListenerSSLCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing set-load-balancer-listener-sslcertificate")
				.argument("load-balancer-name", loadBalancerName)
				.argument("load-balancer-port", loadBalancerPort.toString())
				.argument("sslcertificate-id", sSLCertificateId)
	}

}


fun AmazonElasticLoadBalancingFunctions.setLoadBalancerPoliciesForBackendServer(loadBalancerName: String, instancePort: Int, policyNames: List<String>, init: AmazonElasticLoadBalancingSetLoadBalancerPoliciesForBackendServerCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingSetLoadBalancerPoliciesForBackendServerCommand(loadBalancerName, instancePort, policyNames).apply(init))
}

@Generated
class AmazonElasticLoadBalancingSetLoadBalancerPoliciesForBackendServerCommand(val loadBalancerName: String, val instancePort: Int, val policyNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setInstancePort(this.instancePort)
		input.setPolicyNames(this.policyNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.setLoadBalancerPoliciesForBackendServer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing set-load-balancer-policies-for-backend-server")
				.argument("load-balancer-name", loadBalancerName)
				.argument("instance-port", instancePort.toString())
				.argument("policy-names", policyNames.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.setLoadBalancerPoliciesOfListener(loadBalancerName: String, loadBalancerPort: Int, policyNames: List<String>, init: AmazonElasticLoadBalancingSetLoadBalancerPoliciesOfListenerCommand.() -> Unit) {
	this.block.declare(AmazonElasticLoadBalancingSetLoadBalancerPoliciesOfListenerCommand(loadBalancerName, loadBalancerPort, policyNames).apply(init))
}

@Generated
class AmazonElasticLoadBalancingSetLoadBalancerPoliciesOfListenerCommand(val loadBalancerName: String, val loadBalancerPort: Int, val policyNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setLoadBalancerPort(this.loadBalancerPort)
		input.setPolicyNames(this.policyNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticloadbalancing.setLoadBalancerPoliciesOfListener(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing set-load-balancer-policies-of-listener")
				.argument("load-balancer-name", loadBalancerName)
				.argument("load-balancer-port", loadBalancerPort.toString())
				.argument("policy-names", policyNames.toString())
	}

}
