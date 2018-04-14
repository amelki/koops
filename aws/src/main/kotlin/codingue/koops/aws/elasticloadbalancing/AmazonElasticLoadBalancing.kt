
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.elasticloadbalancing

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.elasticloadbalancing.*
import com.amazonaws.services.elasticloadbalancing.model.*

var codingue.koops.core.Environment.elasticloadbalancing: AmazonElasticLoadBalancing
	get() {
		var service = this.capabilities["aws-elasticloadbalancing"]
		if (service == null) {
			service = AmazonElasticLoadBalancingClientBuilder.standard().build()
			this.capabilities["aws-elasticloadbalancing"] = service
		}
		return service as AmazonElasticLoadBalancing
	}
	set(elasticloadbalancing) {
		this.capabilities["aws-elasticloadbalancing"] = elasticloadbalancing
	}

@Generated
class AmazonElasticLoadBalancingFunctions(val block: Block)

infix fun <T> AwsContinuation.elasticloadbalancing(init: AmazonElasticLoadBalancingFunctions.() -> T): T {
	return AmazonElasticLoadBalancingFunctions(shell).run(init)
}

			

fun AmazonElasticLoadBalancingFunctions.addTags(loadBalancerNames: List<String>, tags: List<com.amazonaws.services.elasticloadbalancing.model.Tag>, init: AmazonElasticLoadBalancingAddTagsCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.AddTagsResult {
	return this.block.declare(AmazonElasticLoadBalancingAddTagsCommand(loadBalancerNames, tags).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.AddTagsResult
}

@Generated
class AmazonElasticLoadBalancingAddTagsCommand(val loadBalancerNames: List<String>, val tags: List<com.amazonaws.services.elasticloadbalancing.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.AddTagsRequest, com.amazonaws.services.elasticloadbalancing.model.AddTagsResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.AddTagsRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.AddTagsRequest()
		input.setLoadBalancerNames(this.loadBalancerNames)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.AddTagsResult {
	  return com.amazonaws.services.elasticloadbalancing.model.AddTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.AddTagsResult {
		return environment.elasticloadbalancing.addTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing add-tags")
				.argument("load-balancer-names", loadBalancerNames.toString())
				.argument("tags", tags.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.applySecurityGroupsToLoadBalancer(loadBalancerName: String, securityGroups: List<String>, init: AmazonElasticLoadBalancingApplySecurityGroupsToLoadBalancerCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerResult {
	return this.block.declare(AmazonElasticLoadBalancingApplySecurityGroupsToLoadBalancerCommand(loadBalancerName, securityGroups).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerResult
}

@Generated
class AmazonElasticLoadBalancingApplySecurityGroupsToLoadBalancerCommand(val loadBalancerName: String, val securityGroups: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerRequest, com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setSecurityGroups(this.securityGroups)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerResult {
	  return com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.ApplySecurityGroupsToLoadBalancerResult {
		return environment.elasticloadbalancing.applySecurityGroupsToLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing apply-security-groups-to-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
				.argument("security-groups", securityGroups.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.attachLoadBalancerToSubnets(loadBalancerName: String, subnets: List<String>, init: AmazonElasticLoadBalancingAttachLoadBalancerToSubnetsCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsResult {
	return this.block.declare(AmazonElasticLoadBalancingAttachLoadBalancerToSubnetsCommand(loadBalancerName, subnets).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsResult
}

@Generated
class AmazonElasticLoadBalancingAttachLoadBalancerToSubnetsCommand(val loadBalancerName: String, val subnets: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsRequest, com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setSubnets(this.subnets)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsResult {
	  return com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.AttachLoadBalancerToSubnetsResult {
		return environment.elasticloadbalancing.attachLoadBalancerToSubnets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing attach-load-balancer-to-subnets")
				.argument("load-balancer-name", loadBalancerName)
				.argument("subnets", subnets.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.configureHealthCheck(loadBalancerName: String, healthCheck: com.amazonaws.services.elasticloadbalancing.model.HealthCheck, init: AmazonElasticLoadBalancingConfigureHealthCheckCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckResult {
	return this.block.declare(AmazonElasticLoadBalancingConfigureHealthCheckCommand(loadBalancerName, healthCheck).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckResult
}

@Generated
class AmazonElasticLoadBalancingConfigureHealthCheckCommand(val loadBalancerName: String, val healthCheck: com.amazonaws.services.elasticloadbalancing.model.HealthCheck) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest, com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setHealthCheck(this.healthCheck)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckResult {
	  return com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckResult {
		return environment.elasticloadbalancing.configureHealthCheck(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing configure-health-check")
				.argument("load-balancer-name", loadBalancerName)
				.argument("health-check", healthCheck.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.createAppCookieStickinessPolicy(loadBalancerName: String, policyName: String, cookieName: String, init: AmazonElasticLoadBalancingCreateAppCookieStickinessPolicyCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyResult {
	return this.block.declare(AmazonElasticLoadBalancingCreateAppCookieStickinessPolicyCommand(loadBalancerName, policyName, cookieName).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyResult
}

@Generated
class AmazonElasticLoadBalancingCreateAppCookieStickinessPolicyCommand(val loadBalancerName: String, val policyName: String, val cookieName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyRequest, com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setPolicyName(this.policyName)
		input.setCookieName(this.cookieName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyResult {
	  return com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.CreateAppCookieStickinessPolicyResult {
		return environment.elasticloadbalancing.createAppCookieStickinessPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing create-app-cookie-stickiness-policy")
				.argument("load-balancer-name", loadBalancerName)
				.argument("policy-name", policyName)
				.argument("cookie-name", cookieName)
	}

}


fun AmazonElasticLoadBalancingFunctions.createLBCookieStickinessPolicy(loadBalancerName: String, policyName: String, init: AmazonElasticLoadBalancingCreateLBCookieStickinessPolicyCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyResult {
	return this.block.declare(AmazonElasticLoadBalancingCreateLBCookieStickinessPolicyCommand(loadBalancerName, policyName).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyResult
}

@Generated
class AmazonElasticLoadBalancingCreateLBCookieStickinessPolicyCommand(val loadBalancerName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest, com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyResult> {

	var cookieExpirationPeriod: Long? = 0L

	override fun build(): com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setPolicyName(this.policyName)
		input.setCookieExpirationPeriod(this.cookieExpirationPeriod)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyResult {
	  return com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyResult {
		return environment.elasticloadbalancing.createLBCookieStickinessPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing create-lbcookie-stickiness-policy")
				.argument("load-balancer-name", loadBalancerName)
				.argument("policy-name", policyName)
				.argument("cookie-expiration-period", cookieExpirationPeriod?.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.createLoadBalancer(loadBalancerName: String, listeners: List<com.amazonaws.services.elasticloadbalancing.model.Listener>, init: AmazonElasticLoadBalancingCreateLoadBalancerCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerResult {
	return this.block.declare(AmazonElasticLoadBalancingCreateLoadBalancerCommand(loadBalancerName, listeners).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerResult
}

@Generated
class AmazonElasticLoadBalancingCreateLoadBalancerCommand(val loadBalancerName: String, val listeners: List<com.amazonaws.services.elasticloadbalancing.model.Listener>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerRequest, com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerResult> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerResult {
	  return com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerResult {
		return environment.elasticloadbalancing.createLoadBalancer(build())
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


fun AmazonElasticLoadBalancingFunctions.createLoadBalancerListeners(loadBalancerName: String, listeners: List<com.amazonaws.services.elasticloadbalancing.model.Listener>, init: AmazonElasticLoadBalancingCreateLoadBalancerListenersCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersResult {
	return this.block.declare(AmazonElasticLoadBalancingCreateLoadBalancerListenersCommand(loadBalancerName, listeners).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersResult
}

@Generated
class AmazonElasticLoadBalancingCreateLoadBalancerListenersCommand(val loadBalancerName: String, val listeners: List<com.amazonaws.services.elasticloadbalancing.model.Listener>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest, com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setListeners(this.listeners)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersResult {
	  return com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersResult {
		return environment.elasticloadbalancing.createLoadBalancerListeners(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing create-load-balancer-listeners")
				.argument("load-balancer-name", loadBalancerName)
				.argument("listeners", listeners.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.createLoadBalancerPolicy(loadBalancerName: String, policyName: String, policyTypeName: String, init: AmazonElasticLoadBalancingCreateLoadBalancerPolicyCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyResult {
	return this.block.declare(AmazonElasticLoadBalancingCreateLoadBalancerPolicyCommand(loadBalancerName, policyName, policyTypeName).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyResult
}

@Generated
class AmazonElasticLoadBalancingCreateLoadBalancerPolicyCommand(val loadBalancerName: String, val policyName: String, val policyTypeName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest, com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyResult> {

	var policyAttributes: List<com.amazonaws.services.elasticloadbalancing.model.PolicyAttribute>? = null

	override fun build(): com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setPolicyName(this.policyName)
		input.setPolicyTypeName(this.policyTypeName)
		input.setPolicyAttributes(this.policyAttributes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyResult {
	  return com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyResult {
		return environment.elasticloadbalancing.createLoadBalancerPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing create-load-balancer-policy")
				.argument("load-balancer-name", loadBalancerName)
				.argument("policy-name", policyName)
				.argument("policy-type-name", policyTypeName)
				.argument("policy-attributes", policyAttributes?.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.deleteLoadBalancer(loadBalancerName: String, init: AmazonElasticLoadBalancingDeleteLoadBalancerCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerResult {
	return this.block.declare(AmazonElasticLoadBalancingDeleteLoadBalancerCommand(loadBalancerName).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerResult
}

@Generated
class AmazonElasticLoadBalancingDeleteLoadBalancerCommand(val loadBalancerName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest, com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerResult {
	  return com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerResult {
		return environment.elasticloadbalancing.deleteLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing delete-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
	}

}


fun AmazonElasticLoadBalancingFunctions.deleteLoadBalancerListeners(loadBalancerName: String, loadBalancerPorts: List<Int>, init: AmazonElasticLoadBalancingDeleteLoadBalancerListenersCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersResult {
	return this.block.declare(AmazonElasticLoadBalancingDeleteLoadBalancerListenersCommand(loadBalancerName, loadBalancerPorts).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersResult
}

@Generated
class AmazonElasticLoadBalancingDeleteLoadBalancerListenersCommand(val loadBalancerName: String, val loadBalancerPorts: List<Int>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest, com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setLoadBalancerPorts(this.loadBalancerPorts)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersResult {
	  return com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersResult {
		return environment.elasticloadbalancing.deleteLoadBalancerListeners(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing delete-load-balancer-listeners")
				.argument("load-balancer-name", loadBalancerName)
				.argument("load-balancer-ports", loadBalancerPorts.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.deleteLoadBalancerPolicy(loadBalancerName: String, policyName: String, init: AmazonElasticLoadBalancingDeleteLoadBalancerPolicyCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyResult {
	return this.block.declare(AmazonElasticLoadBalancingDeleteLoadBalancerPolicyCommand(loadBalancerName, policyName).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyResult
}

@Generated
class AmazonElasticLoadBalancingDeleteLoadBalancerPolicyCommand(val loadBalancerName: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyRequest, com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setPolicyName(this.policyName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyResult {
	  return com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerPolicyResult {
		return environment.elasticloadbalancing.deleteLoadBalancerPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing delete-load-balancer-policy")
				.argument("load-balancer-name", loadBalancerName)
				.argument("policy-name", policyName)
	}

}


fun AmazonElasticLoadBalancingFunctions.deregisterInstancesFromLoadBalancer(loadBalancerName: String, instances: List<com.amazonaws.services.elasticloadbalancing.model.Instance>, init: AmazonElasticLoadBalancingDeregisterInstancesFromLoadBalancerCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerResult {
	return this.block.declare(AmazonElasticLoadBalancingDeregisterInstancesFromLoadBalancerCommand(loadBalancerName, instances).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerResult
}

@Generated
class AmazonElasticLoadBalancingDeregisterInstancesFromLoadBalancerCommand(val loadBalancerName: String, val instances: List<com.amazonaws.services.elasticloadbalancing.model.Instance>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest, com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setInstances(this.instances)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerResult {
	  return com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerResult {
		return environment.elasticloadbalancing.deregisterInstancesFromLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing deregister-instances-from-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
				.argument("instances", instances.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.describeAccountLimits(init: AmazonElasticLoadBalancingDescribeAccountLimitsCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsResult {
	return this.block.declare(AmazonElasticLoadBalancingDescribeAccountLimitsCommand().apply(init)) as com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsResult
}

@Generated
class AmazonElasticLoadBalancingDescribeAccountLimitsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsRequest, com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsResult> {

	var marker: String? = null
	var pageSize: Int? = 0

	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsRequest()
		input.setMarker(this.marker)
		input.setPageSize(this.pageSize)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsResult {
	  return com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.DescribeAccountLimitsResult {
		return environment.elasticloadbalancing.describeAccountLimits(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing describe-account-limits")
				.argument("marker", marker)
				.argument("page-size", pageSize?.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.describeInstanceHealth(loadBalancerName: String, init: AmazonElasticLoadBalancingDescribeInstanceHealthCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthResult {
	return this.block.declare(AmazonElasticLoadBalancingDescribeInstanceHealthCommand(loadBalancerName).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthResult
}

@Generated
class AmazonElasticLoadBalancingDescribeInstanceHealthCommand(val loadBalancerName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest, com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthResult> {

	var instances: List<com.amazonaws.services.elasticloadbalancing.model.Instance>? = null

	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setInstances(this.instances)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthResult {
	  return com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthResult {
		return environment.elasticloadbalancing.describeInstanceHealth(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing describe-instance-health")
				.argument("load-balancer-name", loadBalancerName)
				.argument("instances", instances?.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.describeLoadBalancerAttributes(loadBalancerName: String, init: AmazonElasticLoadBalancingDescribeLoadBalancerAttributesCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesResult {
	return this.block.declare(AmazonElasticLoadBalancingDescribeLoadBalancerAttributesCommand(loadBalancerName).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesResult
}

@Generated
class AmazonElasticLoadBalancingDescribeLoadBalancerAttributesCommand(val loadBalancerName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest, com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesResult {
	  return com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesResult {
		return environment.elasticloadbalancing.describeLoadBalancerAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing describe-load-balancer-attributes")
				.argument("load-balancer-name", loadBalancerName)
	}

}


fun AmazonElasticLoadBalancingFunctions.describeLoadBalancerPolicies(init: AmazonElasticLoadBalancingDescribeLoadBalancerPoliciesCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesResult {
	return this.block.declare(AmazonElasticLoadBalancingDescribeLoadBalancerPoliciesCommand().apply(init)) as com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesResult
}

@Generated
class AmazonElasticLoadBalancingDescribeLoadBalancerPoliciesCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest, com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesResult> {

	var loadBalancerName: String? = null
	var policyNames: List<String>? = null

	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setPolicyNames(this.policyNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesResult {
	  return com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesResult {
		return environment.elasticloadbalancing.describeLoadBalancerPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing describe-load-balancer-policies")
				.argument("load-balancer-name", loadBalancerName)
				.argument("policy-names", policyNames?.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.describeLoadBalancerPolicyTypes(init: AmazonElasticLoadBalancingDescribeLoadBalancerPolicyTypesCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesResult {
	return this.block.declare(AmazonElasticLoadBalancingDescribeLoadBalancerPolicyTypesCommand().apply(init)) as com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesResult
}

@Generated
class AmazonElasticLoadBalancingDescribeLoadBalancerPolicyTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesRequest, com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesResult> {

	var policyTypeNames: List<String>? = null

	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesRequest()
		input.setPolicyTypeNames(this.policyTypeNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesResult {
	  return com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPolicyTypesResult {
		return environment.elasticloadbalancing.describeLoadBalancerPolicyTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing describe-load-balancer-policy-types")
				.argument("policy-type-names", policyTypeNames?.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.describeLoadBalancers(init: AmazonElasticLoadBalancingDescribeLoadBalancersCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersResult {
	return this.block.declare(AmazonElasticLoadBalancingDescribeLoadBalancersCommand().apply(init)) as com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersResult
}

@Generated
class AmazonElasticLoadBalancingDescribeLoadBalancersCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersRequest, com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersResult> {

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

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersResult {
	  return com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersResult {
		return environment.elasticloadbalancing.describeLoadBalancers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing describe-load-balancers")
				.argument("load-balancer-names", loadBalancerNames?.toString())
				.argument("marker", marker)
				.argument("page-size", pageSize?.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.describeTags(loadBalancerNames: List<String>, init: AmazonElasticLoadBalancingDescribeTagsCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.DescribeTagsResult {
	return this.block.declare(AmazonElasticLoadBalancingDescribeTagsCommand(loadBalancerNames).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.DescribeTagsResult
}

@Generated
class AmazonElasticLoadBalancingDescribeTagsCommand(val loadBalancerNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DescribeTagsRequest, com.amazonaws.services.elasticloadbalancing.model.DescribeTagsResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DescribeTagsRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DescribeTagsRequest()
		input.setLoadBalancerNames(this.loadBalancerNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.DescribeTagsResult {
	  return com.amazonaws.services.elasticloadbalancing.model.DescribeTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.DescribeTagsResult {
		return environment.elasticloadbalancing.describeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing describe-tags")
				.argument("load-balancer-names", loadBalancerNames.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.detachLoadBalancerFromSubnets(loadBalancerName: String, subnets: List<String>, init: AmazonElasticLoadBalancingDetachLoadBalancerFromSubnetsCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsResult {
	return this.block.declare(AmazonElasticLoadBalancingDetachLoadBalancerFromSubnetsCommand(loadBalancerName, subnets).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsResult
}

@Generated
class AmazonElasticLoadBalancingDetachLoadBalancerFromSubnetsCommand(val loadBalancerName: String, val subnets: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsRequest, com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setSubnets(this.subnets)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsResult {
	  return com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.DetachLoadBalancerFromSubnetsResult {
		return environment.elasticloadbalancing.detachLoadBalancerFromSubnets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing detach-load-balancer-from-subnets")
				.argument("load-balancer-name", loadBalancerName)
				.argument("subnets", subnets.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.disableAvailabilityZonesForLoadBalancer(loadBalancerName: String, availabilityZones: List<String>, init: AmazonElasticLoadBalancingDisableAvailabilityZonesForLoadBalancerCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerResult {
	return this.block.declare(AmazonElasticLoadBalancingDisableAvailabilityZonesForLoadBalancerCommand(loadBalancerName, availabilityZones).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerResult
}

@Generated
class AmazonElasticLoadBalancingDisableAvailabilityZonesForLoadBalancerCommand(val loadBalancerName: String, val availabilityZones: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest, com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setAvailabilityZones(this.availabilityZones)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerResult {
	  return com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerResult {
		return environment.elasticloadbalancing.disableAvailabilityZonesForLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing disable-availability-zones-for-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
				.argument("availability-zones", availabilityZones.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.enableAvailabilityZonesForLoadBalancer(loadBalancerName: String, availabilityZones: List<String>, init: AmazonElasticLoadBalancingEnableAvailabilityZonesForLoadBalancerCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerResult {
	return this.block.declare(AmazonElasticLoadBalancingEnableAvailabilityZonesForLoadBalancerCommand(loadBalancerName, availabilityZones).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerResult
}

@Generated
class AmazonElasticLoadBalancingEnableAvailabilityZonesForLoadBalancerCommand(val loadBalancerName: String, val availabilityZones: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest, com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setAvailabilityZones(this.availabilityZones)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerResult {
	  return com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerResult {
		return environment.elasticloadbalancing.enableAvailabilityZonesForLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing enable-availability-zones-for-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
				.argument("availability-zones", availabilityZones.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.modifyLoadBalancerAttributes(loadBalancerName: String, loadBalancerAttributes: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerAttributes, init: AmazonElasticLoadBalancingModifyLoadBalancerAttributesCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesResult {
	return this.block.declare(AmazonElasticLoadBalancingModifyLoadBalancerAttributesCommand(loadBalancerName, loadBalancerAttributes).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesResult
}

@Generated
class AmazonElasticLoadBalancingModifyLoadBalancerAttributesCommand(val loadBalancerName: String, val loadBalancerAttributes: com.amazonaws.services.elasticloadbalancing.model.LoadBalancerAttributes) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest, com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setLoadBalancerAttributes(this.loadBalancerAttributes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesResult {
	  return com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesResult {
		return environment.elasticloadbalancing.modifyLoadBalancerAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing modify-load-balancer-attributes")
				.argument("load-balancer-name", loadBalancerName)
				.argument("load-balancer-attributes", loadBalancerAttributes.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.registerInstancesWithLoadBalancer(loadBalancerName: String, instances: List<com.amazonaws.services.elasticloadbalancing.model.Instance>, init: AmazonElasticLoadBalancingRegisterInstancesWithLoadBalancerCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerResult {
	return this.block.declare(AmazonElasticLoadBalancingRegisterInstancesWithLoadBalancerCommand(loadBalancerName, instances).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerResult
}

@Generated
class AmazonElasticLoadBalancingRegisterInstancesWithLoadBalancerCommand(val loadBalancerName: String, val instances: List<com.amazonaws.services.elasticloadbalancing.model.Instance>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest, com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setInstances(this.instances)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerResult {
	  return com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerResult {
		return environment.elasticloadbalancing.registerInstancesWithLoadBalancer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing register-instances-with-load-balancer")
				.argument("load-balancer-name", loadBalancerName)
				.argument("instances", instances.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.removeTags(loadBalancerNames: List<String>, tags: List<com.amazonaws.services.elasticloadbalancing.model.TagKeyOnly>, init: AmazonElasticLoadBalancingRemoveTagsCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.RemoveTagsResult {
	return this.block.declare(AmazonElasticLoadBalancingRemoveTagsCommand(loadBalancerNames, tags).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.RemoveTagsResult
}

@Generated
class AmazonElasticLoadBalancingRemoveTagsCommand(val loadBalancerNames: List<String>, val tags: List<com.amazonaws.services.elasticloadbalancing.model.TagKeyOnly>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.RemoveTagsRequest, com.amazonaws.services.elasticloadbalancing.model.RemoveTagsResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.RemoveTagsRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.RemoveTagsRequest()
		input.setLoadBalancerNames(this.loadBalancerNames)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.RemoveTagsResult {
	  return com.amazonaws.services.elasticloadbalancing.model.RemoveTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.RemoveTagsResult {
		return environment.elasticloadbalancing.removeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing remove-tags")
				.argument("load-balancer-names", loadBalancerNames.toString())
				.argument("tags", tags.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.setLoadBalancerListenerSSLCertificate(loadBalancerName: String, loadBalancerPort: Int, sSLCertificateId: String, init: AmazonElasticLoadBalancingSetLoadBalancerListenerSSLCertificateCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateResult {
	return this.block.declare(AmazonElasticLoadBalancingSetLoadBalancerListenerSSLCertificateCommand(loadBalancerName, loadBalancerPort, sSLCertificateId).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateResult
}

@Generated
class AmazonElasticLoadBalancingSetLoadBalancerListenerSSLCertificateCommand(val loadBalancerName: String, val loadBalancerPort: Int, val sSLCertificateId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest, com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setLoadBalancerPort(this.loadBalancerPort)
		input.setSSLCertificateId(this.sSLCertificateId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateResult {
	  return com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateResult {
		return environment.elasticloadbalancing.setLoadBalancerListenerSSLCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing set-load-balancer-listener-sslcertificate")
				.argument("load-balancer-name", loadBalancerName)
				.argument("load-balancer-port", loadBalancerPort.toString())
				.argument("sslcertificate-id", sSLCertificateId)
	}

}


fun AmazonElasticLoadBalancingFunctions.setLoadBalancerPoliciesForBackendServer(loadBalancerName: String, instancePort: Int, policyNames: List<String>, init: AmazonElasticLoadBalancingSetLoadBalancerPoliciesForBackendServerCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerResult {
	return this.block.declare(AmazonElasticLoadBalancingSetLoadBalancerPoliciesForBackendServerCommand(loadBalancerName, instancePort, policyNames).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerResult
}

@Generated
class AmazonElasticLoadBalancingSetLoadBalancerPoliciesForBackendServerCommand(val loadBalancerName: String, val instancePort: Int, val policyNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerRequest, com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setInstancePort(this.instancePort)
		input.setPolicyNames(this.policyNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerResult {
	  return com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesForBackendServerResult {
		return environment.elasticloadbalancing.setLoadBalancerPoliciesForBackendServer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing set-load-balancer-policies-for-backend-server")
				.argument("load-balancer-name", loadBalancerName)
				.argument("instance-port", instancePort.toString())
				.argument("policy-names", policyNames.toString())
	}

}


fun AmazonElasticLoadBalancingFunctions.setLoadBalancerPoliciesOfListener(loadBalancerName: String, loadBalancerPort: Int, policyNames: List<String>, init: AmazonElasticLoadBalancingSetLoadBalancerPoliciesOfListenerCommand.() -> Unit): com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerResult {
	return this.block.declare(AmazonElasticLoadBalancingSetLoadBalancerPoliciesOfListenerCommand(loadBalancerName, loadBalancerPort, policyNames).apply(init)) as com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerResult
}

@Generated
class AmazonElasticLoadBalancingSetLoadBalancerPoliciesOfListenerCommand(val loadBalancerName: String, val loadBalancerPort: Int, val policyNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest, com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerResult> {



	override fun build(): com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest {
		val input = com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest()
		input.setLoadBalancerName(this.loadBalancerName)
		input.setLoadBalancerPort(this.loadBalancerPort)
		input.setPolicyNames(this.policyNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerResult {
	  return com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerResult {
		return environment.elasticloadbalancing.setLoadBalancerPoliciesOfListener(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticloadbalancing set-load-balancer-policies-of-listener")
				.argument("load-balancer-name", loadBalancerName)
				.argument("load-balancer-port", loadBalancerPort.toString())
				.argument("policy-names", policyNames.toString())
	}

}
