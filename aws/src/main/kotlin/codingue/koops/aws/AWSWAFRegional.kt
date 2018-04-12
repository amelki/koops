
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.waf.*
import com.amazonaws.services.waf.model.*

var codingue.koops.core.Environment.waf_regional: AWSWAFRegional
	get() {
		var service = this.capabilities["aws-waf_regional"]
		if (service == null) {
			service = AWSWAFRegionalClientBuilder.standard().build()
			this.capabilities["aws-waf_regional"] = service
		}
		return service as AWSWAFRegional
	}
	set(waf_regional) {
		this.capabilities["aws-waf_regional"] = waf_regional
	}

@Generated
class AWSWAFRegionalFunctions(val block: Block)

infix fun <T> AwsContinuation.waf_regional(init: AWSWAFRegionalFunctions.() -> T): T {
	return AWSWAFRegionalFunctions(shell).run(init)
}

			

fun AWSWAFRegionalFunctions.associateWebACL(webACLId: String, resourceArn: String, init: AWSWAFRegionalAssociateWebACLCommand.() -> Unit): com.amazonaws.services.waf.model.AssociateWebACLResult {
	return this.block.declare(AWSWAFRegionalAssociateWebACLCommand(webACLId, resourceArn).apply(init)) as com.amazonaws.services.waf.model.AssociateWebACLResult
}

@Generated
class AWSWAFRegionalAssociateWebACLCommand(val webACLId: String, val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.AssociateWebACLRequest, com.amazonaws.services.waf.model.AssociateWebACLResult> {



	override fun build(): com.amazonaws.services.waf.model.AssociateWebACLRequest {
		val input = com.amazonaws.services.waf.model.AssociateWebACLRequest()
		input.setWebACLId(this.webACLId)
		input.setResourceArn(this.resourceArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.AssociateWebACLResult {
	  return com.amazonaws.services.waf.model.AssociateWebACLResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.AssociateWebACLResult {
		return environment.waf_regional.associateWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional associate-web-acl")
				.argument("web-aclid", webACLId)
				.argument("resource-arn", resourceArn)
	}

}


fun AWSWAFRegionalFunctions.createByteMatchSet(name: String, changeToken: String, init: AWSWAFRegionalCreateByteMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.CreateByteMatchSetResult {
	return this.block.declare(AWSWAFRegionalCreateByteMatchSetCommand(name, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateByteMatchSetResult
}

@Generated
class AWSWAFRegionalCreateByteMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateByteMatchSetRequest, com.amazonaws.services.waf.model.CreateByteMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.CreateByteMatchSetRequest {
		val input = com.amazonaws.services.waf.model.CreateByteMatchSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.CreateByteMatchSetResult {
	  return com.amazonaws.services.waf.model.CreateByteMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.CreateByteMatchSetResult {
		return environment.waf_regional.createByteMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-byte-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createGeoMatchSet(name: String, changeToken: String, init: AWSWAFRegionalCreateGeoMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.CreateGeoMatchSetResult {
	return this.block.declare(AWSWAFRegionalCreateGeoMatchSetCommand(name, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateGeoMatchSetResult
}

@Generated
class AWSWAFRegionalCreateGeoMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateGeoMatchSetRequest, com.amazonaws.services.waf.model.CreateGeoMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.CreateGeoMatchSetRequest {
		val input = com.amazonaws.services.waf.model.CreateGeoMatchSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.CreateGeoMatchSetResult {
	  return com.amazonaws.services.waf.model.CreateGeoMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.CreateGeoMatchSetResult {
		return environment.waf_regional.createGeoMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-geo-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createIPSet(name: String, changeToken: String, init: AWSWAFRegionalCreateIPSetCommand.() -> Unit): com.amazonaws.services.waf.model.CreateIPSetResult {
	return this.block.declare(AWSWAFRegionalCreateIPSetCommand(name, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateIPSetResult
}

@Generated
class AWSWAFRegionalCreateIPSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateIPSetRequest, com.amazonaws.services.waf.model.CreateIPSetResult> {



	override fun build(): com.amazonaws.services.waf.model.CreateIPSetRequest {
		val input = com.amazonaws.services.waf.model.CreateIPSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.CreateIPSetResult {
	  return com.amazonaws.services.waf.model.CreateIPSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.CreateIPSetResult {
		return environment.waf_regional.createIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-ipset")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createRateBasedRule(name: String, metricName: String, rateKey: RateKey, rateLimit: Long, changeToken: String, init: AWSWAFRegionalCreateRateBasedRuleCommand.() -> Unit): com.amazonaws.services.waf.model.CreateRateBasedRuleResult {
	return this.block.declare(AWSWAFRegionalCreateRateBasedRuleCommand(name, metricName, rateKey, rateLimit, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateRateBasedRuleResult
}

@Generated
class AWSWAFRegionalCreateRateBasedRuleCommand(val name: String, val metricName: String, val rateKey: RateKey, val rateLimit: Long, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRateBasedRuleRequest, com.amazonaws.services.waf.model.CreateRateBasedRuleResult> {



	override fun build(): com.amazonaws.services.waf.model.CreateRateBasedRuleRequest {
		val input = com.amazonaws.services.waf.model.CreateRateBasedRuleRequest()
		input.setName(this.name)
		input.setMetricName(this.metricName)
		input.setRateKey(this.rateKey.toString())
		input.setRateLimit(this.rateLimit)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.CreateRateBasedRuleResult {
	  return com.amazonaws.services.waf.model.CreateRateBasedRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.CreateRateBasedRuleResult {
		return environment.waf_regional.createRateBasedRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-rate-based-rule")
				.argument("name", name)
				.argument("metric-name", metricName)
				.argument("rate-key", rateKey.toString())
				.argument("rate-limit", rateLimit.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createRegexMatchSet(name: String, changeToken: String, init: AWSWAFRegionalCreateRegexMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.CreateRegexMatchSetResult {
	return this.block.declare(AWSWAFRegionalCreateRegexMatchSetCommand(name, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateRegexMatchSetResult
}

@Generated
class AWSWAFRegionalCreateRegexMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRegexMatchSetRequest, com.amazonaws.services.waf.model.CreateRegexMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.CreateRegexMatchSetRequest {
		val input = com.amazonaws.services.waf.model.CreateRegexMatchSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.CreateRegexMatchSetResult {
	  return com.amazonaws.services.waf.model.CreateRegexMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.CreateRegexMatchSetResult {
		return environment.waf_regional.createRegexMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-regex-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createRegexPatternSet(name: String, changeToken: String, init: AWSWAFRegionalCreateRegexPatternSetCommand.() -> Unit): com.amazonaws.services.waf.model.CreateRegexPatternSetResult {
	return this.block.declare(AWSWAFRegionalCreateRegexPatternSetCommand(name, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateRegexPatternSetResult
}

@Generated
class AWSWAFRegionalCreateRegexPatternSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRegexPatternSetRequest, com.amazonaws.services.waf.model.CreateRegexPatternSetResult> {



	override fun build(): com.amazonaws.services.waf.model.CreateRegexPatternSetRequest {
		val input = com.amazonaws.services.waf.model.CreateRegexPatternSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.CreateRegexPatternSetResult {
	  return com.amazonaws.services.waf.model.CreateRegexPatternSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.CreateRegexPatternSetResult {
		return environment.waf_regional.createRegexPatternSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-regex-pattern-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createRule(name: String, metricName: String, changeToken: String, init: AWSWAFRegionalCreateRuleCommand.() -> Unit): com.amazonaws.services.waf.model.CreateRuleResult {
	return this.block.declare(AWSWAFRegionalCreateRuleCommand(name, metricName, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateRuleResult
}

@Generated
class AWSWAFRegionalCreateRuleCommand(val name: String, val metricName: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRuleRequest, com.amazonaws.services.waf.model.CreateRuleResult> {



	override fun build(): com.amazonaws.services.waf.model.CreateRuleRequest {
		val input = com.amazonaws.services.waf.model.CreateRuleRequest()
		input.setName(this.name)
		input.setMetricName(this.metricName)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.CreateRuleResult {
	  return com.amazonaws.services.waf.model.CreateRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.CreateRuleResult {
		return environment.waf_regional.createRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-rule")
				.argument("name", name)
				.argument("metric-name", metricName)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createRuleGroup(name: String, metricName: String, changeToken: String, init: AWSWAFRegionalCreateRuleGroupCommand.() -> Unit): com.amazonaws.services.waf.model.CreateRuleGroupResult {
	return this.block.declare(AWSWAFRegionalCreateRuleGroupCommand(name, metricName, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateRuleGroupResult
}

@Generated
class AWSWAFRegionalCreateRuleGroupCommand(val name: String, val metricName: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRuleGroupRequest, com.amazonaws.services.waf.model.CreateRuleGroupResult> {



	override fun build(): com.amazonaws.services.waf.model.CreateRuleGroupRequest {
		val input = com.amazonaws.services.waf.model.CreateRuleGroupRequest()
		input.setName(this.name)
		input.setMetricName(this.metricName)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.CreateRuleGroupResult {
	  return com.amazonaws.services.waf.model.CreateRuleGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.CreateRuleGroupResult {
		return environment.waf_regional.createRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-rule-group")
				.argument("name", name)
				.argument("metric-name", metricName)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createSizeConstraintSet(name: String, changeToken: String, init: AWSWAFRegionalCreateSizeConstraintSetCommand.() -> Unit): com.amazonaws.services.waf.model.CreateSizeConstraintSetResult {
	return this.block.declare(AWSWAFRegionalCreateSizeConstraintSetCommand(name, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateSizeConstraintSetResult
}

@Generated
class AWSWAFRegionalCreateSizeConstraintSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest, com.amazonaws.services.waf.model.CreateSizeConstraintSetResult> {



	override fun build(): com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest {
		val input = com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.CreateSizeConstraintSetResult {
	  return com.amazonaws.services.waf.model.CreateSizeConstraintSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.CreateSizeConstraintSetResult {
		return environment.waf_regional.createSizeConstraintSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-size-constraint-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createSqlInjectionMatchSet(name: String, changeToken: String, init: AWSWAFRegionalCreateSqlInjectionMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetResult {
	return this.block.declare(AWSWAFRegionalCreateSqlInjectionMatchSetCommand(name, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetResult
}

@Generated
class AWSWAFRegionalCreateSqlInjectionMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest, com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest {
		val input = com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetResult {
	  return com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetResult {
		return environment.waf_regional.createSqlInjectionMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-sql-injection-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createWebACL(name: String, metricName: String, defaultAction: com.amazonaws.services.waf.model.WafAction, changeToken: String, init: AWSWAFRegionalCreateWebACLCommand.() -> Unit): com.amazonaws.services.waf.model.CreateWebACLResult {
	return this.block.declare(AWSWAFRegionalCreateWebACLCommand(name, metricName, defaultAction, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateWebACLResult
}

@Generated
class AWSWAFRegionalCreateWebACLCommand(val name: String, val metricName: String, val defaultAction: com.amazonaws.services.waf.model.WafAction, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateWebACLRequest, com.amazonaws.services.waf.model.CreateWebACLResult> {



	override fun build(): com.amazonaws.services.waf.model.CreateWebACLRequest {
		val input = com.amazonaws.services.waf.model.CreateWebACLRequest()
		input.setName(this.name)
		input.setMetricName(this.metricName)
		input.setDefaultAction(this.defaultAction)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.CreateWebACLResult {
	  return com.amazonaws.services.waf.model.CreateWebACLResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.CreateWebACLResult {
		return environment.waf_regional.createWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-web-acl")
				.argument("name", name)
				.argument("metric-name", metricName)
				.argument("default-action", defaultAction.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createXssMatchSet(name: String, changeToken: String, init: AWSWAFRegionalCreateXssMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.CreateXssMatchSetResult {
	return this.block.declare(AWSWAFRegionalCreateXssMatchSetCommand(name, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateXssMatchSetResult
}

@Generated
class AWSWAFRegionalCreateXssMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateXssMatchSetRequest, com.amazonaws.services.waf.model.CreateXssMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.CreateXssMatchSetRequest {
		val input = com.amazonaws.services.waf.model.CreateXssMatchSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.CreateXssMatchSetResult {
	  return com.amazonaws.services.waf.model.CreateXssMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.CreateXssMatchSetResult {
		return environment.waf_regional.createXssMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-xss-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteByteMatchSet(byteMatchSetId: String, changeToken: String, init: AWSWAFRegionalDeleteByteMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteByteMatchSetResult {
	return this.block.declare(AWSWAFRegionalDeleteByteMatchSetCommand(byteMatchSetId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteByteMatchSetResult
}

@Generated
class AWSWAFRegionalDeleteByteMatchSetCommand(val byteMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteByteMatchSetRequest, com.amazonaws.services.waf.model.DeleteByteMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.DeleteByteMatchSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteByteMatchSetRequest()
		input.setByteMatchSetId(this.byteMatchSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.DeleteByteMatchSetResult {
	  return com.amazonaws.services.waf.model.DeleteByteMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.DeleteByteMatchSetResult {
		return environment.waf_regional.deleteByteMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-byte-match-set")
				.argument("byte-match-set-id", byteMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteGeoMatchSet(geoMatchSetId: String, changeToken: String, init: AWSWAFRegionalDeleteGeoMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteGeoMatchSetResult {
	return this.block.declare(AWSWAFRegionalDeleteGeoMatchSetCommand(geoMatchSetId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteGeoMatchSetResult
}

@Generated
class AWSWAFRegionalDeleteGeoMatchSetCommand(val geoMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest, com.amazonaws.services.waf.model.DeleteGeoMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest()
		input.setGeoMatchSetId(this.geoMatchSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.DeleteGeoMatchSetResult {
	  return com.amazonaws.services.waf.model.DeleteGeoMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.DeleteGeoMatchSetResult {
		return environment.waf_regional.deleteGeoMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-geo-match-set")
				.argument("geo-match-set-id", geoMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteIPSet(iPSetId: String, changeToken: String, init: AWSWAFRegionalDeleteIPSetCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteIPSetResult {
	return this.block.declare(AWSWAFRegionalDeleteIPSetCommand(iPSetId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteIPSetResult
}

@Generated
class AWSWAFRegionalDeleteIPSetCommand(val iPSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteIPSetRequest, com.amazonaws.services.waf.model.DeleteIPSetResult> {



	override fun build(): com.amazonaws.services.waf.model.DeleteIPSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteIPSetRequest()
		input.setIPSetId(this.iPSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.DeleteIPSetResult {
	  return com.amazonaws.services.waf.model.DeleteIPSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.DeleteIPSetResult {
		return environment.waf_regional.deleteIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-ipset")
				.argument("ipset-id", iPSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deletePermissionPolicy(resourceArn: String, init: AWSWAFRegionalDeletePermissionPolicyCommand.() -> Unit): com.amazonaws.services.waf.model.DeletePermissionPolicyResult {
	return this.block.declare(AWSWAFRegionalDeletePermissionPolicyCommand(resourceArn).apply(init)) as com.amazonaws.services.waf.model.DeletePermissionPolicyResult
}

@Generated
class AWSWAFRegionalDeletePermissionPolicyCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeletePermissionPolicyRequest, com.amazonaws.services.waf.model.DeletePermissionPolicyResult> {



	override fun build(): com.amazonaws.services.waf.model.DeletePermissionPolicyRequest {
		val input = com.amazonaws.services.waf.model.DeletePermissionPolicyRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.DeletePermissionPolicyResult {
	  return com.amazonaws.services.waf.model.DeletePermissionPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.DeletePermissionPolicyResult {
		return environment.waf_regional.deletePermissionPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-permission-policy")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSWAFRegionalFunctions.deleteRateBasedRule(ruleId: String, changeToken: String, init: AWSWAFRegionalDeleteRateBasedRuleCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteRateBasedRuleResult {
	return this.block.declare(AWSWAFRegionalDeleteRateBasedRuleCommand(ruleId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteRateBasedRuleResult
}

@Generated
class AWSWAFRegionalDeleteRateBasedRuleCommand(val ruleId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest, com.amazonaws.services.waf.model.DeleteRateBasedRuleResult> {



	override fun build(): com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest {
		val input = com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest()
		input.setRuleId(this.ruleId)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.DeleteRateBasedRuleResult {
	  return com.amazonaws.services.waf.model.DeleteRateBasedRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.DeleteRateBasedRuleResult {
		return environment.waf_regional.deleteRateBasedRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-rate-based-rule")
				.argument("rule-id", ruleId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteRegexMatchSet(regexMatchSetId: String, changeToken: String, init: AWSWAFRegionalDeleteRegexMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteRegexMatchSetResult {
	return this.block.declare(AWSWAFRegionalDeleteRegexMatchSetCommand(regexMatchSetId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteRegexMatchSetResult
}

@Generated
class AWSWAFRegionalDeleteRegexMatchSetCommand(val regexMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest, com.amazonaws.services.waf.model.DeleteRegexMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest()
		input.setRegexMatchSetId(this.regexMatchSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.DeleteRegexMatchSetResult {
	  return com.amazonaws.services.waf.model.DeleteRegexMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.DeleteRegexMatchSetResult {
		return environment.waf_regional.deleteRegexMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-regex-match-set")
				.argument("regex-match-set-id", regexMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteRegexPatternSet(regexPatternSetId: String, changeToken: String, init: AWSWAFRegionalDeleteRegexPatternSetCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteRegexPatternSetResult {
	return this.block.declare(AWSWAFRegionalDeleteRegexPatternSetCommand(regexPatternSetId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteRegexPatternSetResult
}

@Generated
class AWSWAFRegionalDeleteRegexPatternSetCommand(val regexPatternSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest, com.amazonaws.services.waf.model.DeleteRegexPatternSetResult> {



	override fun build(): com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest()
		input.setRegexPatternSetId(this.regexPatternSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.DeleteRegexPatternSetResult {
	  return com.amazonaws.services.waf.model.DeleteRegexPatternSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.DeleteRegexPatternSetResult {
		return environment.waf_regional.deleteRegexPatternSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-regex-pattern-set")
				.argument("regex-pattern-set-id", regexPatternSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteRule(ruleId: String, changeToken: String, init: AWSWAFRegionalDeleteRuleCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteRuleResult {
	return this.block.declare(AWSWAFRegionalDeleteRuleCommand(ruleId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteRuleResult
}

@Generated
class AWSWAFRegionalDeleteRuleCommand(val ruleId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRuleRequest, com.amazonaws.services.waf.model.DeleteRuleResult> {



	override fun build(): com.amazonaws.services.waf.model.DeleteRuleRequest {
		val input = com.amazonaws.services.waf.model.DeleteRuleRequest()
		input.setRuleId(this.ruleId)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.DeleteRuleResult {
	  return com.amazonaws.services.waf.model.DeleteRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.DeleteRuleResult {
		return environment.waf_regional.deleteRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-rule")
				.argument("rule-id", ruleId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteRuleGroup(ruleGroupId: String, changeToken: String, init: AWSWAFRegionalDeleteRuleGroupCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteRuleGroupResult {
	return this.block.declare(AWSWAFRegionalDeleteRuleGroupCommand(ruleGroupId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteRuleGroupResult
}

@Generated
class AWSWAFRegionalDeleteRuleGroupCommand(val ruleGroupId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRuleGroupRequest, com.amazonaws.services.waf.model.DeleteRuleGroupResult> {



	override fun build(): com.amazonaws.services.waf.model.DeleteRuleGroupRequest {
		val input = com.amazonaws.services.waf.model.DeleteRuleGroupRequest()
		input.setRuleGroupId(this.ruleGroupId)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.DeleteRuleGroupResult {
	  return com.amazonaws.services.waf.model.DeleteRuleGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.DeleteRuleGroupResult {
		return environment.waf_regional.deleteRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-rule-group")
				.argument("rule-group-id", ruleGroupId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteSizeConstraintSet(sizeConstraintSetId: String, changeToken: String, init: AWSWAFRegionalDeleteSizeConstraintSetCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteSizeConstraintSetResult {
	return this.block.declare(AWSWAFRegionalDeleteSizeConstraintSetCommand(sizeConstraintSetId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteSizeConstraintSetResult
}

@Generated
class AWSWAFRegionalDeleteSizeConstraintSetCommand(val sizeConstraintSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest, com.amazonaws.services.waf.model.DeleteSizeConstraintSetResult> {



	override fun build(): com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest()
		input.setSizeConstraintSetId(this.sizeConstraintSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.DeleteSizeConstraintSetResult {
	  return com.amazonaws.services.waf.model.DeleteSizeConstraintSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.DeleteSizeConstraintSetResult {
		return environment.waf_regional.deleteSizeConstraintSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-size-constraint-set")
				.argument("size-constraint-set-id", sizeConstraintSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteSqlInjectionMatchSet(sqlInjectionMatchSetId: String, changeToken: String, init: AWSWAFRegionalDeleteSqlInjectionMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetResult {
	return this.block.declare(AWSWAFRegionalDeleteSqlInjectionMatchSetCommand(sqlInjectionMatchSetId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetResult
}

@Generated
class AWSWAFRegionalDeleteSqlInjectionMatchSetCommand(val sqlInjectionMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest, com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest()
		input.setSqlInjectionMatchSetId(this.sqlInjectionMatchSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetResult {
	  return com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetResult {
		return environment.waf_regional.deleteSqlInjectionMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-sql-injection-match-set")
				.argument("sql-injection-match-set-id", sqlInjectionMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteWebACL(webACLId: String, changeToken: String, init: AWSWAFRegionalDeleteWebACLCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteWebACLResult {
	return this.block.declare(AWSWAFRegionalDeleteWebACLCommand(webACLId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteWebACLResult
}

@Generated
class AWSWAFRegionalDeleteWebACLCommand(val webACLId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteWebACLRequest, com.amazonaws.services.waf.model.DeleteWebACLResult> {



	override fun build(): com.amazonaws.services.waf.model.DeleteWebACLRequest {
		val input = com.amazonaws.services.waf.model.DeleteWebACLRequest()
		input.setWebACLId(this.webACLId)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.DeleteWebACLResult {
	  return com.amazonaws.services.waf.model.DeleteWebACLResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.DeleteWebACLResult {
		return environment.waf_regional.deleteWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-web-acl")
				.argument("web-aclid", webACLId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteXssMatchSet(xssMatchSetId: String, changeToken: String, init: AWSWAFRegionalDeleteXssMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteXssMatchSetResult {
	return this.block.declare(AWSWAFRegionalDeleteXssMatchSetCommand(xssMatchSetId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteXssMatchSetResult
}

@Generated
class AWSWAFRegionalDeleteXssMatchSetCommand(val xssMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteXssMatchSetRequest, com.amazonaws.services.waf.model.DeleteXssMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.DeleteXssMatchSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteXssMatchSetRequest()
		input.setXssMatchSetId(this.xssMatchSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.DeleteXssMatchSetResult {
	  return com.amazonaws.services.waf.model.DeleteXssMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.DeleteXssMatchSetResult {
		return environment.waf_regional.deleteXssMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-xss-match-set")
				.argument("xss-match-set-id", xssMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.disassociateWebACL(resourceArn: String, init: AWSWAFRegionalDisassociateWebACLCommand.() -> Unit): com.amazonaws.services.waf.model.DisassociateWebACLResult {
	return this.block.declare(AWSWAFRegionalDisassociateWebACLCommand(resourceArn).apply(init)) as com.amazonaws.services.waf.model.DisassociateWebACLResult
}

@Generated
class AWSWAFRegionalDisassociateWebACLCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DisassociateWebACLRequest, com.amazonaws.services.waf.model.DisassociateWebACLResult> {



	override fun build(): com.amazonaws.services.waf.model.DisassociateWebACLRequest {
		val input = com.amazonaws.services.waf.model.DisassociateWebACLRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.DisassociateWebACLResult {
	  return com.amazonaws.services.waf.model.DisassociateWebACLResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.DisassociateWebACLResult {
		return environment.waf_regional.disassociateWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional disassociate-web-acl")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSWAFRegionalFunctions.getByteMatchSet(byteMatchSetId: String, init: AWSWAFRegionalGetByteMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.GetByteMatchSetResult {
	return this.block.declare(AWSWAFRegionalGetByteMatchSetCommand(byteMatchSetId).apply(init)) as com.amazonaws.services.waf.model.GetByteMatchSetResult
}

@Generated
class AWSWAFRegionalGetByteMatchSetCommand(val byteMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetByteMatchSetRequest, com.amazonaws.services.waf.model.GetByteMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.GetByteMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetByteMatchSetRequest()
		input.setByteMatchSetId(this.byteMatchSetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetByteMatchSetResult {
	  return com.amazonaws.services.waf.model.GetByteMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetByteMatchSetResult {
		return environment.waf_regional.getByteMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-byte-match-set")
				.argument("byte-match-set-id", byteMatchSetId)
	}

}


fun AWSWAFRegionalFunctions.getChangeToken(init: AWSWAFRegionalGetChangeTokenCommand.() -> Unit): com.amazonaws.services.waf.model.GetChangeTokenResult {
	return this.block.declare(AWSWAFRegionalGetChangeTokenCommand().apply(init)) as com.amazonaws.services.waf.model.GetChangeTokenResult
}

@Generated
class AWSWAFRegionalGetChangeTokenCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetChangeTokenRequest, com.amazonaws.services.waf.model.GetChangeTokenResult> {



	override fun build(): com.amazonaws.services.waf.model.GetChangeTokenRequest {
		val input = com.amazonaws.services.waf.model.GetChangeTokenRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetChangeTokenResult {
	  return com.amazonaws.services.waf.model.GetChangeTokenResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetChangeTokenResult {
		return environment.waf_regional.getChangeToken(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-change-token")

	}

}


fun AWSWAFRegionalFunctions.getChangeTokenStatus(changeToken: String, init: AWSWAFRegionalGetChangeTokenStatusCommand.() -> Unit): com.amazonaws.services.waf.model.GetChangeTokenStatusResult {
	return this.block.declare(AWSWAFRegionalGetChangeTokenStatusCommand(changeToken).apply(init)) as com.amazonaws.services.waf.model.GetChangeTokenStatusResult
}

@Generated
class AWSWAFRegionalGetChangeTokenStatusCommand(val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetChangeTokenStatusRequest, com.amazonaws.services.waf.model.GetChangeTokenStatusResult> {



	override fun build(): com.amazonaws.services.waf.model.GetChangeTokenStatusRequest {
		val input = com.amazonaws.services.waf.model.GetChangeTokenStatusRequest()
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetChangeTokenStatusResult {
	  return com.amazonaws.services.waf.model.GetChangeTokenStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetChangeTokenStatusResult {
		return environment.waf_regional.getChangeTokenStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-change-token-status")
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.getGeoMatchSet(geoMatchSetId: String, init: AWSWAFRegionalGetGeoMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.GetGeoMatchSetResult {
	return this.block.declare(AWSWAFRegionalGetGeoMatchSetCommand(geoMatchSetId).apply(init)) as com.amazonaws.services.waf.model.GetGeoMatchSetResult
}

@Generated
class AWSWAFRegionalGetGeoMatchSetCommand(val geoMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetGeoMatchSetRequest, com.amazonaws.services.waf.model.GetGeoMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.GetGeoMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetGeoMatchSetRequest()
		input.setGeoMatchSetId(this.geoMatchSetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetGeoMatchSetResult {
	  return com.amazonaws.services.waf.model.GetGeoMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetGeoMatchSetResult {
		return environment.waf_regional.getGeoMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-geo-match-set")
				.argument("geo-match-set-id", geoMatchSetId)
	}

}


fun AWSWAFRegionalFunctions.getIPSet(iPSetId: String, init: AWSWAFRegionalGetIPSetCommand.() -> Unit): com.amazonaws.services.waf.model.GetIPSetResult {
	return this.block.declare(AWSWAFRegionalGetIPSetCommand(iPSetId).apply(init)) as com.amazonaws.services.waf.model.GetIPSetResult
}

@Generated
class AWSWAFRegionalGetIPSetCommand(val iPSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetIPSetRequest, com.amazonaws.services.waf.model.GetIPSetResult> {



	override fun build(): com.amazonaws.services.waf.model.GetIPSetRequest {
		val input = com.amazonaws.services.waf.model.GetIPSetRequest()
		input.setIPSetId(this.iPSetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetIPSetResult {
	  return com.amazonaws.services.waf.model.GetIPSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetIPSetResult {
		return environment.waf_regional.getIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-ipset")
				.argument("ipset-id", iPSetId)
	}

}


fun AWSWAFRegionalFunctions.getPermissionPolicy(resourceArn: String, init: AWSWAFRegionalGetPermissionPolicyCommand.() -> Unit): com.amazonaws.services.waf.model.GetPermissionPolicyResult {
	return this.block.declare(AWSWAFRegionalGetPermissionPolicyCommand(resourceArn).apply(init)) as com.amazonaws.services.waf.model.GetPermissionPolicyResult
}

@Generated
class AWSWAFRegionalGetPermissionPolicyCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetPermissionPolicyRequest, com.amazonaws.services.waf.model.GetPermissionPolicyResult> {



	override fun build(): com.amazonaws.services.waf.model.GetPermissionPolicyRequest {
		val input = com.amazonaws.services.waf.model.GetPermissionPolicyRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetPermissionPolicyResult {
	  return com.amazonaws.services.waf.model.GetPermissionPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetPermissionPolicyResult {
		return environment.waf_regional.getPermissionPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-permission-policy")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSWAFRegionalFunctions.getRateBasedRule(ruleId: String, init: AWSWAFRegionalGetRateBasedRuleCommand.() -> Unit): com.amazonaws.services.waf.model.GetRateBasedRuleResult {
	return this.block.declare(AWSWAFRegionalGetRateBasedRuleCommand(ruleId).apply(init)) as com.amazonaws.services.waf.model.GetRateBasedRuleResult
}

@Generated
class AWSWAFRegionalGetRateBasedRuleCommand(val ruleId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRateBasedRuleRequest, com.amazonaws.services.waf.model.GetRateBasedRuleResult> {



	override fun build(): com.amazonaws.services.waf.model.GetRateBasedRuleRequest {
		val input = com.amazonaws.services.waf.model.GetRateBasedRuleRequest()
		input.setRuleId(this.ruleId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetRateBasedRuleResult {
	  return com.amazonaws.services.waf.model.GetRateBasedRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetRateBasedRuleResult {
		return environment.waf_regional.getRateBasedRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-rate-based-rule")
				.argument("rule-id", ruleId)
	}

}


fun AWSWAFRegionalFunctions.getRateBasedRuleManagedKeys(ruleId: String, init: AWSWAFRegionalGetRateBasedRuleManagedKeysCommand.() -> Unit): com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysResult {
	return this.block.declare(AWSWAFRegionalGetRateBasedRuleManagedKeysCommand(ruleId).apply(init)) as com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysResult
}

@Generated
class AWSWAFRegionalGetRateBasedRuleManagedKeysCommand(val ruleId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest, com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysResult> {

	var nextMarker: String? = null

	override fun build(): com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest {
		val input = com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest()
		input.setRuleId(this.ruleId)
		input.setNextMarker(this.nextMarker)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysResult {
	  return com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysResult {
		return environment.waf_regional.getRateBasedRuleManagedKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-rate-based-rule-managed-keys")
				.argument("rule-id", ruleId)
				.argument("next-marker", nextMarker)
	}

}


fun AWSWAFRegionalFunctions.getRegexMatchSet(regexMatchSetId: String, init: AWSWAFRegionalGetRegexMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.GetRegexMatchSetResult {
	return this.block.declare(AWSWAFRegionalGetRegexMatchSetCommand(regexMatchSetId).apply(init)) as com.amazonaws.services.waf.model.GetRegexMatchSetResult
}

@Generated
class AWSWAFRegionalGetRegexMatchSetCommand(val regexMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRegexMatchSetRequest, com.amazonaws.services.waf.model.GetRegexMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.GetRegexMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetRegexMatchSetRequest()
		input.setRegexMatchSetId(this.regexMatchSetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetRegexMatchSetResult {
	  return com.amazonaws.services.waf.model.GetRegexMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetRegexMatchSetResult {
		return environment.waf_regional.getRegexMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-regex-match-set")
				.argument("regex-match-set-id", regexMatchSetId)
	}

}


fun AWSWAFRegionalFunctions.getRegexPatternSet(regexPatternSetId: String, init: AWSWAFRegionalGetRegexPatternSetCommand.() -> Unit): com.amazonaws.services.waf.model.GetRegexPatternSetResult {
	return this.block.declare(AWSWAFRegionalGetRegexPatternSetCommand(regexPatternSetId).apply(init)) as com.amazonaws.services.waf.model.GetRegexPatternSetResult
}

@Generated
class AWSWAFRegionalGetRegexPatternSetCommand(val regexPatternSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRegexPatternSetRequest, com.amazonaws.services.waf.model.GetRegexPatternSetResult> {



	override fun build(): com.amazonaws.services.waf.model.GetRegexPatternSetRequest {
		val input = com.amazonaws.services.waf.model.GetRegexPatternSetRequest()
		input.setRegexPatternSetId(this.regexPatternSetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetRegexPatternSetResult {
	  return com.amazonaws.services.waf.model.GetRegexPatternSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetRegexPatternSetResult {
		return environment.waf_regional.getRegexPatternSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-regex-pattern-set")
				.argument("regex-pattern-set-id", regexPatternSetId)
	}

}


fun AWSWAFRegionalFunctions.getRule(ruleId: String, init: AWSWAFRegionalGetRuleCommand.() -> Unit): com.amazonaws.services.waf.model.GetRuleResult {
	return this.block.declare(AWSWAFRegionalGetRuleCommand(ruleId).apply(init)) as com.amazonaws.services.waf.model.GetRuleResult
}

@Generated
class AWSWAFRegionalGetRuleCommand(val ruleId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRuleRequest, com.amazonaws.services.waf.model.GetRuleResult> {



	override fun build(): com.amazonaws.services.waf.model.GetRuleRequest {
		val input = com.amazonaws.services.waf.model.GetRuleRequest()
		input.setRuleId(this.ruleId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetRuleResult {
	  return com.amazonaws.services.waf.model.GetRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetRuleResult {
		return environment.waf_regional.getRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-rule")
				.argument("rule-id", ruleId)
	}

}


fun AWSWAFRegionalFunctions.getRuleGroup(ruleGroupId: String, init: AWSWAFRegionalGetRuleGroupCommand.() -> Unit): com.amazonaws.services.waf.model.GetRuleGroupResult {
	return this.block.declare(AWSWAFRegionalGetRuleGroupCommand(ruleGroupId).apply(init)) as com.amazonaws.services.waf.model.GetRuleGroupResult
}

@Generated
class AWSWAFRegionalGetRuleGroupCommand(val ruleGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRuleGroupRequest, com.amazonaws.services.waf.model.GetRuleGroupResult> {



	override fun build(): com.amazonaws.services.waf.model.GetRuleGroupRequest {
		val input = com.amazonaws.services.waf.model.GetRuleGroupRequest()
		input.setRuleGroupId(this.ruleGroupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetRuleGroupResult {
	  return com.amazonaws.services.waf.model.GetRuleGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetRuleGroupResult {
		return environment.waf_regional.getRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-rule-group")
				.argument("rule-group-id", ruleGroupId)
	}

}


fun AWSWAFRegionalFunctions.getSampledRequests(webAclId: String, ruleId: String, timeWindow: com.amazonaws.services.waf.model.TimeWindow, maxItems: Long, init: AWSWAFRegionalGetSampledRequestsCommand.() -> Unit): com.amazonaws.services.waf.model.GetSampledRequestsResult {
	return this.block.declare(AWSWAFRegionalGetSampledRequestsCommand(webAclId, ruleId, timeWindow, maxItems).apply(init)) as com.amazonaws.services.waf.model.GetSampledRequestsResult
}

@Generated
class AWSWAFRegionalGetSampledRequestsCommand(val webAclId: String, val ruleId: String, val timeWindow: com.amazonaws.services.waf.model.TimeWindow, val maxItems: Long) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetSampledRequestsRequest, com.amazonaws.services.waf.model.GetSampledRequestsResult> {



	override fun build(): com.amazonaws.services.waf.model.GetSampledRequestsRequest {
		val input = com.amazonaws.services.waf.model.GetSampledRequestsRequest()
		input.setWebAclId(this.webAclId)
		input.setRuleId(this.ruleId)
		input.setTimeWindow(this.timeWindow)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetSampledRequestsResult {
	  return com.amazonaws.services.waf.model.GetSampledRequestsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetSampledRequestsResult {
		return environment.waf_regional.getSampledRequests(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-sampled-requests")
				.argument("web-acl-id", webAclId)
				.argument("rule-id", ruleId)
				.argument("time-window", timeWindow.toString())
				.argument("max-items", maxItems.toString())
	}

}


fun AWSWAFRegionalFunctions.getSizeConstraintSet(sizeConstraintSetId: String, init: AWSWAFRegionalGetSizeConstraintSetCommand.() -> Unit): com.amazonaws.services.waf.model.GetSizeConstraintSetResult {
	return this.block.declare(AWSWAFRegionalGetSizeConstraintSetCommand(sizeConstraintSetId).apply(init)) as com.amazonaws.services.waf.model.GetSizeConstraintSetResult
}

@Generated
class AWSWAFRegionalGetSizeConstraintSetCommand(val sizeConstraintSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetSizeConstraintSetRequest, com.amazonaws.services.waf.model.GetSizeConstraintSetResult> {



	override fun build(): com.amazonaws.services.waf.model.GetSizeConstraintSetRequest {
		val input = com.amazonaws.services.waf.model.GetSizeConstraintSetRequest()
		input.setSizeConstraintSetId(this.sizeConstraintSetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetSizeConstraintSetResult {
	  return com.amazonaws.services.waf.model.GetSizeConstraintSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetSizeConstraintSetResult {
		return environment.waf_regional.getSizeConstraintSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-size-constraint-set")
				.argument("size-constraint-set-id", sizeConstraintSetId)
	}

}


fun AWSWAFRegionalFunctions.getSqlInjectionMatchSet(sqlInjectionMatchSetId: String, init: AWSWAFRegionalGetSqlInjectionMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult {
	return this.block.declare(AWSWAFRegionalGetSqlInjectionMatchSetCommand(sqlInjectionMatchSetId).apply(init)) as com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult
}

@Generated
class AWSWAFRegionalGetSqlInjectionMatchSetCommand(val sqlInjectionMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest, com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest()
		input.setSqlInjectionMatchSetId(this.sqlInjectionMatchSetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult {
	  return com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult {
		return environment.waf_regional.getSqlInjectionMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-sql-injection-match-set")
				.argument("sql-injection-match-set-id", sqlInjectionMatchSetId)
	}

}


fun AWSWAFRegionalFunctions.getWebACL(webACLId: String, init: AWSWAFRegionalGetWebACLCommand.() -> Unit): com.amazonaws.services.waf.model.GetWebACLResult {
	return this.block.declare(AWSWAFRegionalGetWebACLCommand(webACLId).apply(init)) as com.amazonaws.services.waf.model.GetWebACLResult
}

@Generated
class AWSWAFRegionalGetWebACLCommand(val webACLId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetWebACLRequest, com.amazonaws.services.waf.model.GetWebACLResult> {



	override fun build(): com.amazonaws.services.waf.model.GetWebACLRequest {
		val input = com.amazonaws.services.waf.model.GetWebACLRequest()
		input.setWebACLId(this.webACLId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetWebACLResult {
	  return com.amazonaws.services.waf.model.GetWebACLResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetWebACLResult {
		return environment.waf_regional.getWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-web-acl")
				.argument("web-aclid", webACLId)
	}

}


fun AWSWAFRegionalFunctions.getWebACLForResource(resourceArn: String, init: AWSWAFRegionalGetWebACLForResourceCommand.() -> Unit): com.amazonaws.services.waf.model.GetWebACLForResourceResult {
	return this.block.declare(AWSWAFRegionalGetWebACLForResourceCommand(resourceArn).apply(init)) as com.amazonaws.services.waf.model.GetWebACLForResourceResult
}

@Generated
class AWSWAFRegionalGetWebACLForResourceCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetWebACLForResourceRequest, com.amazonaws.services.waf.model.GetWebACLForResourceResult> {



	override fun build(): com.amazonaws.services.waf.model.GetWebACLForResourceRequest {
		val input = com.amazonaws.services.waf.model.GetWebACLForResourceRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetWebACLForResourceResult {
	  return com.amazonaws.services.waf.model.GetWebACLForResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetWebACLForResourceResult {
		return environment.waf_regional.getWebACLForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-web-aclfor-resource")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSWAFRegionalFunctions.getXssMatchSet(xssMatchSetId: String, init: AWSWAFRegionalGetXssMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.GetXssMatchSetResult {
	return this.block.declare(AWSWAFRegionalGetXssMatchSetCommand(xssMatchSetId).apply(init)) as com.amazonaws.services.waf.model.GetXssMatchSetResult
}

@Generated
class AWSWAFRegionalGetXssMatchSetCommand(val xssMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetXssMatchSetRequest, com.amazonaws.services.waf.model.GetXssMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.GetXssMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetXssMatchSetRequest()
		input.setXssMatchSetId(this.xssMatchSetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.GetXssMatchSetResult {
	  return com.amazonaws.services.waf.model.GetXssMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetXssMatchSetResult {
		return environment.waf_regional.getXssMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-xss-match-set")
				.argument("xss-match-set-id", xssMatchSetId)
	}

}


fun AWSWAFRegionalFunctions.listActivatedRulesInRuleGroup(init: AWSWAFRegionalListActivatedRulesInRuleGroupCommand.() -> Unit): com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupResult {
	return this.block.declare(AWSWAFRegionalListActivatedRulesInRuleGroupCommand().apply(init)) as com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupResult
}

@Generated
class AWSWAFRegionalListActivatedRulesInRuleGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupRequest, com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupResult> {

	var ruleGroupId: String? = null
	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupRequest {
		val input = com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupRequest()
		input.setRuleGroupId(this.ruleGroupId)
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupResult {
	  return com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupResult {
		return environment.waf_regional.listActivatedRulesInRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-activated-rules-in-rule-group")
				.argument("rule-group-id", ruleGroupId)
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listByteMatchSets(init: AWSWAFRegionalListByteMatchSetsCommand.() -> Unit): com.amazonaws.services.waf.model.ListByteMatchSetsResult {
	return this.block.declare(AWSWAFRegionalListByteMatchSetsCommand().apply(init)) as com.amazonaws.services.waf.model.ListByteMatchSetsResult
}

@Generated
class AWSWAFRegionalListByteMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListByteMatchSetsRequest, com.amazonaws.services.waf.model.ListByteMatchSetsResult> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListByteMatchSetsRequest {
		val input = com.amazonaws.services.waf.model.ListByteMatchSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.ListByteMatchSetsResult {
	  return com.amazonaws.services.waf.model.ListByteMatchSetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.ListByteMatchSetsResult {
		return environment.waf_regional.listByteMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-byte-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listGeoMatchSets(init: AWSWAFRegionalListGeoMatchSetsCommand.() -> Unit): com.amazonaws.services.waf.model.ListGeoMatchSetsResult {
	return this.block.declare(AWSWAFRegionalListGeoMatchSetsCommand().apply(init)) as com.amazonaws.services.waf.model.ListGeoMatchSetsResult
}

@Generated
class AWSWAFRegionalListGeoMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListGeoMatchSetsRequest, com.amazonaws.services.waf.model.ListGeoMatchSetsResult> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListGeoMatchSetsRequest {
		val input = com.amazonaws.services.waf.model.ListGeoMatchSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.ListGeoMatchSetsResult {
	  return com.amazonaws.services.waf.model.ListGeoMatchSetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.ListGeoMatchSetsResult {
		return environment.waf_regional.listGeoMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-geo-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listIPSets(init: AWSWAFRegionalListIPSetsCommand.() -> Unit): com.amazonaws.services.waf.model.ListIPSetsResult {
	return this.block.declare(AWSWAFRegionalListIPSetsCommand().apply(init)) as com.amazonaws.services.waf.model.ListIPSetsResult
}

@Generated
class AWSWAFRegionalListIPSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListIPSetsRequest, com.amazonaws.services.waf.model.ListIPSetsResult> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListIPSetsRequest {
		val input = com.amazonaws.services.waf.model.ListIPSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.ListIPSetsResult {
	  return com.amazonaws.services.waf.model.ListIPSetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.ListIPSetsResult {
		return environment.waf_regional.listIPSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-ipsets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listRateBasedRules(init: AWSWAFRegionalListRateBasedRulesCommand.() -> Unit): com.amazonaws.services.waf.model.ListRateBasedRulesResult {
	return this.block.declare(AWSWAFRegionalListRateBasedRulesCommand().apply(init)) as com.amazonaws.services.waf.model.ListRateBasedRulesResult
}

@Generated
class AWSWAFRegionalListRateBasedRulesCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRateBasedRulesRequest, com.amazonaws.services.waf.model.ListRateBasedRulesResult> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListRateBasedRulesRequest {
		val input = com.amazonaws.services.waf.model.ListRateBasedRulesRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.ListRateBasedRulesResult {
	  return com.amazonaws.services.waf.model.ListRateBasedRulesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.ListRateBasedRulesResult {
		return environment.waf_regional.listRateBasedRules(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-rate-based-rules")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listRegexMatchSets(init: AWSWAFRegionalListRegexMatchSetsCommand.() -> Unit): com.amazonaws.services.waf.model.ListRegexMatchSetsResult {
	return this.block.declare(AWSWAFRegionalListRegexMatchSetsCommand().apply(init)) as com.amazonaws.services.waf.model.ListRegexMatchSetsResult
}

@Generated
class AWSWAFRegionalListRegexMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRegexMatchSetsRequest, com.amazonaws.services.waf.model.ListRegexMatchSetsResult> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListRegexMatchSetsRequest {
		val input = com.amazonaws.services.waf.model.ListRegexMatchSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.ListRegexMatchSetsResult {
	  return com.amazonaws.services.waf.model.ListRegexMatchSetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.ListRegexMatchSetsResult {
		return environment.waf_regional.listRegexMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-regex-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listRegexPatternSets(init: AWSWAFRegionalListRegexPatternSetsCommand.() -> Unit): com.amazonaws.services.waf.model.ListRegexPatternSetsResult {
	return this.block.declare(AWSWAFRegionalListRegexPatternSetsCommand().apply(init)) as com.amazonaws.services.waf.model.ListRegexPatternSetsResult
}

@Generated
class AWSWAFRegionalListRegexPatternSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRegexPatternSetsRequest, com.amazonaws.services.waf.model.ListRegexPatternSetsResult> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListRegexPatternSetsRequest {
		val input = com.amazonaws.services.waf.model.ListRegexPatternSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.ListRegexPatternSetsResult {
	  return com.amazonaws.services.waf.model.ListRegexPatternSetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.ListRegexPatternSetsResult {
		return environment.waf_regional.listRegexPatternSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-regex-pattern-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listResourcesForWebACL(webACLId: String, init: AWSWAFRegionalListResourcesForWebACLCommand.() -> Unit): com.amazonaws.services.waf.model.ListResourcesForWebACLResult {
	return this.block.declare(AWSWAFRegionalListResourcesForWebACLCommand(webACLId).apply(init)) as com.amazonaws.services.waf.model.ListResourcesForWebACLResult
}

@Generated
class AWSWAFRegionalListResourcesForWebACLCommand(val webACLId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListResourcesForWebACLRequest, com.amazonaws.services.waf.model.ListResourcesForWebACLResult> {



	override fun build(): com.amazonaws.services.waf.model.ListResourcesForWebACLRequest {
		val input = com.amazonaws.services.waf.model.ListResourcesForWebACLRequest()
		input.setWebACLId(this.webACLId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.ListResourcesForWebACLResult {
	  return com.amazonaws.services.waf.model.ListResourcesForWebACLResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.ListResourcesForWebACLResult {
		return environment.waf_regional.listResourcesForWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-resources-for-web-acl")
				.argument("web-aclid", webACLId)
	}

}


fun AWSWAFRegionalFunctions.listRuleGroups(init: AWSWAFRegionalListRuleGroupsCommand.() -> Unit): com.amazonaws.services.waf.model.ListRuleGroupsResult {
	return this.block.declare(AWSWAFRegionalListRuleGroupsCommand().apply(init)) as com.amazonaws.services.waf.model.ListRuleGroupsResult
}

@Generated
class AWSWAFRegionalListRuleGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRuleGroupsRequest, com.amazonaws.services.waf.model.ListRuleGroupsResult> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListRuleGroupsRequest {
		val input = com.amazonaws.services.waf.model.ListRuleGroupsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.ListRuleGroupsResult {
	  return com.amazonaws.services.waf.model.ListRuleGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.ListRuleGroupsResult {
		return environment.waf_regional.listRuleGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-rule-groups")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listRules(init: AWSWAFRegionalListRulesCommand.() -> Unit): com.amazonaws.services.waf.model.ListRulesResult {
	return this.block.declare(AWSWAFRegionalListRulesCommand().apply(init)) as com.amazonaws.services.waf.model.ListRulesResult
}

@Generated
class AWSWAFRegionalListRulesCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRulesRequest, com.amazonaws.services.waf.model.ListRulesResult> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListRulesRequest {
		val input = com.amazonaws.services.waf.model.ListRulesRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.ListRulesResult {
	  return com.amazonaws.services.waf.model.ListRulesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.ListRulesResult {
		return environment.waf_regional.listRules(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-rules")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listSizeConstraintSets(init: AWSWAFRegionalListSizeConstraintSetsCommand.() -> Unit): com.amazonaws.services.waf.model.ListSizeConstraintSetsResult {
	return this.block.declare(AWSWAFRegionalListSizeConstraintSetsCommand().apply(init)) as com.amazonaws.services.waf.model.ListSizeConstraintSetsResult
}

@Generated
class AWSWAFRegionalListSizeConstraintSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest, com.amazonaws.services.waf.model.ListSizeConstraintSetsResult> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest {
		val input = com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.ListSizeConstraintSetsResult {
	  return com.amazonaws.services.waf.model.ListSizeConstraintSetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.ListSizeConstraintSetsResult {
		return environment.waf_regional.listSizeConstraintSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-size-constraint-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listSqlInjectionMatchSets(init: AWSWAFRegionalListSqlInjectionMatchSetsCommand.() -> Unit): com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsResult {
	return this.block.declare(AWSWAFRegionalListSqlInjectionMatchSetsCommand().apply(init)) as com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsResult
}

@Generated
class AWSWAFRegionalListSqlInjectionMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest, com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsResult> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest {
		val input = com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsResult {
	  return com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsResult {
		return environment.waf_regional.listSqlInjectionMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-sql-injection-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listSubscribedRuleGroups(init: AWSWAFRegionalListSubscribedRuleGroupsCommand.() -> Unit): com.amazonaws.services.waf.model.ListSubscribedRuleGroupsResult {
	return this.block.declare(AWSWAFRegionalListSubscribedRuleGroupsCommand().apply(init)) as com.amazonaws.services.waf.model.ListSubscribedRuleGroupsResult
}

@Generated
class AWSWAFRegionalListSubscribedRuleGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest, com.amazonaws.services.waf.model.ListSubscribedRuleGroupsResult> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest {
		val input = com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.ListSubscribedRuleGroupsResult {
	  return com.amazonaws.services.waf.model.ListSubscribedRuleGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.ListSubscribedRuleGroupsResult {
		return environment.waf_regional.listSubscribedRuleGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-subscribed-rule-groups")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listWebACLs(init: AWSWAFRegionalListWebACLsCommand.() -> Unit): com.amazonaws.services.waf.model.ListWebACLsResult {
	return this.block.declare(AWSWAFRegionalListWebACLsCommand().apply(init)) as com.amazonaws.services.waf.model.ListWebACLsResult
}

@Generated
class AWSWAFRegionalListWebACLsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListWebACLsRequest, com.amazonaws.services.waf.model.ListWebACLsResult> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListWebACLsRequest {
		val input = com.amazonaws.services.waf.model.ListWebACLsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.ListWebACLsResult {
	  return com.amazonaws.services.waf.model.ListWebACLsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.ListWebACLsResult {
		return environment.waf_regional.listWebACLs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-web-acls")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listXssMatchSets(init: AWSWAFRegionalListXssMatchSetsCommand.() -> Unit): com.amazonaws.services.waf.model.ListXssMatchSetsResult {
	return this.block.declare(AWSWAFRegionalListXssMatchSetsCommand().apply(init)) as com.amazonaws.services.waf.model.ListXssMatchSetsResult
}

@Generated
class AWSWAFRegionalListXssMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListXssMatchSetsRequest, com.amazonaws.services.waf.model.ListXssMatchSetsResult> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListXssMatchSetsRequest {
		val input = com.amazonaws.services.waf.model.ListXssMatchSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.ListXssMatchSetsResult {
	  return com.amazonaws.services.waf.model.ListXssMatchSetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.ListXssMatchSetsResult {
		return environment.waf_regional.listXssMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-xss-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.putPermissionPolicy(resourceArn: String, policy: String, init: AWSWAFRegionalPutPermissionPolicyCommand.() -> Unit): com.amazonaws.services.waf.model.PutPermissionPolicyResult {
	return this.block.declare(AWSWAFRegionalPutPermissionPolicyCommand(resourceArn, policy).apply(init)) as com.amazonaws.services.waf.model.PutPermissionPolicyResult
}

@Generated
class AWSWAFRegionalPutPermissionPolicyCommand(val resourceArn: String, val policy: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.PutPermissionPolicyRequest, com.amazonaws.services.waf.model.PutPermissionPolicyResult> {



	override fun build(): com.amazonaws.services.waf.model.PutPermissionPolicyRequest {
		val input = com.amazonaws.services.waf.model.PutPermissionPolicyRequest()
		input.setResourceArn(this.resourceArn)
		input.setPolicy(this.policy)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.PutPermissionPolicyResult {
	  return com.amazonaws.services.waf.model.PutPermissionPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.PutPermissionPolicyResult {
		return environment.waf_regional.putPermissionPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional put-permission-policy")
				.argument("resource-arn", resourceArn)
				.argument("policy", policy)
	}

}


fun AWSWAFRegionalFunctions.updateByteMatchSet(byteMatchSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.ByteMatchSetUpdate>, init: AWSWAFRegionalUpdateByteMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateByteMatchSetResult {
	return this.block.declare(AWSWAFRegionalUpdateByteMatchSetCommand(byteMatchSetId, changeToken, updates).apply(init)) as com.amazonaws.services.waf.model.UpdateByteMatchSetResult
}

@Generated
class AWSWAFRegionalUpdateByteMatchSetCommand(val byteMatchSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.ByteMatchSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateByteMatchSetRequest, com.amazonaws.services.waf.model.UpdateByteMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.UpdateByteMatchSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateByteMatchSetRequest()
		input.setByteMatchSetId(this.byteMatchSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.UpdateByteMatchSetResult {
	  return com.amazonaws.services.waf.model.UpdateByteMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.UpdateByteMatchSetResult {
		return environment.waf_regional.updateByteMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-byte-match-set")
				.argument("byte-match-set-id", byteMatchSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFRegionalFunctions.updateGeoMatchSet(geoMatchSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.GeoMatchSetUpdate>, init: AWSWAFRegionalUpdateGeoMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateGeoMatchSetResult {
	return this.block.declare(AWSWAFRegionalUpdateGeoMatchSetCommand(geoMatchSetId, changeToken, updates).apply(init)) as com.amazonaws.services.waf.model.UpdateGeoMatchSetResult
}

@Generated
class AWSWAFRegionalUpdateGeoMatchSetCommand(val geoMatchSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.GeoMatchSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest, com.amazonaws.services.waf.model.UpdateGeoMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest()
		input.setGeoMatchSetId(this.geoMatchSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.UpdateGeoMatchSetResult {
	  return com.amazonaws.services.waf.model.UpdateGeoMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.UpdateGeoMatchSetResult {
		return environment.waf_regional.updateGeoMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-geo-match-set")
				.argument("geo-match-set-id", geoMatchSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFRegionalFunctions.updateIPSet(iPSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.IPSetUpdate>, init: AWSWAFRegionalUpdateIPSetCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateIPSetResult {
	return this.block.declare(AWSWAFRegionalUpdateIPSetCommand(iPSetId, changeToken, updates).apply(init)) as com.amazonaws.services.waf.model.UpdateIPSetResult
}

@Generated
class AWSWAFRegionalUpdateIPSetCommand(val iPSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.IPSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateIPSetRequest, com.amazonaws.services.waf.model.UpdateIPSetResult> {



	override fun build(): com.amazonaws.services.waf.model.UpdateIPSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateIPSetRequest()
		input.setIPSetId(this.iPSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.UpdateIPSetResult {
	  return com.amazonaws.services.waf.model.UpdateIPSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.UpdateIPSetResult {
		return environment.waf_regional.updateIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-ipset")
				.argument("ipset-id", iPSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFRegionalFunctions.updateRateBasedRule(ruleId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.RuleUpdate>, rateLimit: Long, init: AWSWAFRegionalUpdateRateBasedRuleCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateRateBasedRuleResult {
	return this.block.declare(AWSWAFRegionalUpdateRateBasedRuleCommand(ruleId, changeToken, updates, rateLimit).apply(init)) as com.amazonaws.services.waf.model.UpdateRateBasedRuleResult
}

@Generated
class AWSWAFRegionalUpdateRateBasedRuleCommand(val ruleId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.RuleUpdate>, val rateLimit: Long) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest, com.amazonaws.services.waf.model.UpdateRateBasedRuleResult> {



	override fun build(): com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest {
		val input = com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest()
		input.setRuleId(this.ruleId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		input.setRateLimit(this.rateLimit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.UpdateRateBasedRuleResult {
	  return com.amazonaws.services.waf.model.UpdateRateBasedRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.UpdateRateBasedRuleResult {
		return environment.waf_regional.updateRateBasedRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-rate-based-rule")
				.argument("rule-id", ruleId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
				.argument("rate-limit", rateLimit.toString())
	}

}


fun AWSWAFRegionalFunctions.updateRegexMatchSet(regexMatchSetId: String, updates: List<com.amazonaws.services.waf.model.RegexMatchSetUpdate>, changeToken: String, init: AWSWAFRegionalUpdateRegexMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateRegexMatchSetResult {
	return this.block.declare(AWSWAFRegionalUpdateRegexMatchSetCommand(regexMatchSetId, updates, changeToken).apply(init)) as com.amazonaws.services.waf.model.UpdateRegexMatchSetResult
}

@Generated
class AWSWAFRegionalUpdateRegexMatchSetCommand(val regexMatchSetId: String, val updates: List<com.amazonaws.services.waf.model.RegexMatchSetUpdate>, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest, com.amazonaws.services.waf.model.UpdateRegexMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest()
		input.setRegexMatchSetId(this.regexMatchSetId)
		input.setUpdates(this.updates)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.UpdateRegexMatchSetResult {
	  return com.amazonaws.services.waf.model.UpdateRegexMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.UpdateRegexMatchSetResult {
		return environment.waf_regional.updateRegexMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-regex-match-set")
				.argument("regex-match-set-id", regexMatchSetId)
				.argument("updates", updates.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.updateRegexPatternSet(regexPatternSetId: String, updates: List<com.amazonaws.services.waf.model.RegexPatternSetUpdate>, changeToken: String, init: AWSWAFRegionalUpdateRegexPatternSetCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateRegexPatternSetResult {
	return this.block.declare(AWSWAFRegionalUpdateRegexPatternSetCommand(regexPatternSetId, updates, changeToken).apply(init)) as com.amazonaws.services.waf.model.UpdateRegexPatternSetResult
}

@Generated
class AWSWAFRegionalUpdateRegexPatternSetCommand(val regexPatternSetId: String, val updates: List<com.amazonaws.services.waf.model.RegexPatternSetUpdate>, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest, com.amazonaws.services.waf.model.UpdateRegexPatternSetResult> {



	override fun build(): com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest()
		input.setRegexPatternSetId(this.regexPatternSetId)
		input.setUpdates(this.updates)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.UpdateRegexPatternSetResult {
	  return com.amazonaws.services.waf.model.UpdateRegexPatternSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.UpdateRegexPatternSetResult {
		return environment.waf_regional.updateRegexPatternSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-regex-pattern-set")
				.argument("regex-pattern-set-id", regexPatternSetId)
				.argument("updates", updates.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.updateRule(ruleId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.RuleUpdate>, init: AWSWAFRegionalUpdateRuleCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateRuleResult {
	return this.block.declare(AWSWAFRegionalUpdateRuleCommand(ruleId, changeToken, updates).apply(init)) as com.amazonaws.services.waf.model.UpdateRuleResult
}

@Generated
class AWSWAFRegionalUpdateRuleCommand(val ruleId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.RuleUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRuleRequest, com.amazonaws.services.waf.model.UpdateRuleResult> {



	override fun build(): com.amazonaws.services.waf.model.UpdateRuleRequest {
		val input = com.amazonaws.services.waf.model.UpdateRuleRequest()
		input.setRuleId(this.ruleId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.UpdateRuleResult {
	  return com.amazonaws.services.waf.model.UpdateRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.UpdateRuleResult {
		return environment.waf_regional.updateRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-rule")
				.argument("rule-id", ruleId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFRegionalFunctions.updateRuleGroup(ruleGroupId: String, updates: List<com.amazonaws.services.waf.model.RuleGroupUpdate>, changeToken: String, init: AWSWAFRegionalUpdateRuleGroupCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateRuleGroupResult {
	return this.block.declare(AWSWAFRegionalUpdateRuleGroupCommand(ruleGroupId, updates, changeToken).apply(init)) as com.amazonaws.services.waf.model.UpdateRuleGroupResult
}

@Generated
class AWSWAFRegionalUpdateRuleGroupCommand(val ruleGroupId: String, val updates: List<com.amazonaws.services.waf.model.RuleGroupUpdate>, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRuleGroupRequest, com.amazonaws.services.waf.model.UpdateRuleGroupResult> {



	override fun build(): com.amazonaws.services.waf.model.UpdateRuleGroupRequest {
		val input = com.amazonaws.services.waf.model.UpdateRuleGroupRequest()
		input.setRuleGroupId(this.ruleGroupId)
		input.setUpdates(this.updates)
		input.setChangeToken(this.changeToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.UpdateRuleGroupResult {
	  return com.amazonaws.services.waf.model.UpdateRuleGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.UpdateRuleGroupResult {
		return environment.waf_regional.updateRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-rule-group")
				.argument("rule-group-id", ruleGroupId)
				.argument("updates", updates.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.updateSizeConstraintSet(sizeConstraintSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.SizeConstraintSetUpdate>, init: AWSWAFRegionalUpdateSizeConstraintSetCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateSizeConstraintSetResult {
	return this.block.declare(AWSWAFRegionalUpdateSizeConstraintSetCommand(sizeConstraintSetId, changeToken, updates).apply(init)) as com.amazonaws.services.waf.model.UpdateSizeConstraintSetResult
}

@Generated
class AWSWAFRegionalUpdateSizeConstraintSetCommand(val sizeConstraintSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.SizeConstraintSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest, com.amazonaws.services.waf.model.UpdateSizeConstraintSetResult> {



	override fun build(): com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest()
		input.setSizeConstraintSetId(this.sizeConstraintSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.UpdateSizeConstraintSetResult {
	  return com.amazonaws.services.waf.model.UpdateSizeConstraintSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.UpdateSizeConstraintSetResult {
		return environment.waf_regional.updateSizeConstraintSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-size-constraint-set")
				.argument("size-constraint-set-id", sizeConstraintSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFRegionalFunctions.updateSqlInjectionMatchSet(sqlInjectionMatchSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.SqlInjectionMatchSetUpdate>, init: AWSWAFRegionalUpdateSqlInjectionMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetResult {
	return this.block.declare(AWSWAFRegionalUpdateSqlInjectionMatchSetCommand(sqlInjectionMatchSetId, changeToken, updates).apply(init)) as com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetResult
}

@Generated
class AWSWAFRegionalUpdateSqlInjectionMatchSetCommand(val sqlInjectionMatchSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.SqlInjectionMatchSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest, com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest()
		input.setSqlInjectionMatchSetId(this.sqlInjectionMatchSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetResult {
	  return com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetResult {
		return environment.waf_regional.updateSqlInjectionMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-sql-injection-match-set")
				.argument("sql-injection-match-set-id", sqlInjectionMatchSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFRegionalFunctions.updateWebACL(webACLId: String, changeToken: String, init: AWSWAFRegionalUpdateWebACLCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateWebACLResult {
	return this.block.declare(AWSWAFRegionalUpdateWebACLCommand(webACLId, changeToken).apply(init)) as com.amazonaws.services.waf.model.UpdateWebACLResult
}

@Generated
class AWSWAFRegionalUpdateWebACLCommand(val webACLId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateWebACLRequest, com.amazonaws.services.waf.model.UpdateWebACLResult> {

	var updates: List<com.amazonaws.services.waf.model.WebACLUpdate>? = null
	var defaultAction: com.amazonaws.services.waf.model.WafAction? = null

	override fun build(): com.amazonaws.services.waf.model.UpdateWebACLRequest {
		val input = com.amazonaws.services.waf.model.UpdateWebACLRequest()
		input.setWebACLId(this.webACLId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		input.setDefaultAction(this.defaultAction)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.UpdateWebACLResult {
	  return com.amazonaws.services.waf.model.UpdateWebACLResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.UpdateWebACLResult {
		return environment.waf_regional.updateWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-web-acl")
				.argument("web-aclid", webACLId)
				.argument("change-token", changeToken)
				.argument("updates", updates?.toString())
				.argument("default-action", defaultAction?.toString())
	}

}


fun AWSWAFRegionalFunctions.updateXssMatchSet(xssMatchSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.XssMatchSetUpdate>, init: AWSWAFRegionalUpdateXssMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateXssMatchSetResult {
	return this.block.declare(AWSWAFRegionalUpdateXssMatchSetCommand(xssMatchSetId, changeToken, updates).apply(init)) as com.amazonaws.services.waf.model.UpdateXssMatchSetResult
}

@Generated
class AWSWAFRegionalUpdateXssMatchSetCommand(val xssMatchSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.XssMatchSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateXssMatchSetRequest, com.amazonaws.services.waf.model.UpdateXssMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.UpdateXssMatchSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateXssMatchSetRequest()
		input.setXssMatchSetId(this.xssMatchSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.waf.model.UpdateXssMatchSetResult {
	  return com.amazonaws.services.waf.model.UpdateXssMatchSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.UpdateXssMatchSetResult {
		return environment.waf_regional.updateXssMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-xss-match-set")
				.argument("xss-match-set-id", xssMatchSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}
