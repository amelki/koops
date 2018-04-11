
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.waf.AWSWAF
import com.amazonaws.services.waf.model.*

var codingue.koops.core.Environment.waf: AWSWAF
	get() = this.capabilities[AWSWAF::class.java.name] as AWSWAF
	set(waf) {
		this.capabilities[AWSWAF::class.java.name] = waf
	}

@Generated
class AWSWAFFunctions(val block: Block)

infix fun <T> AwsContinuation.waf(init: AWSWAFFunctions.() -> T): T {
	return AWSWAFFunctions(shell).run(init)
}

			

fun AWSWAFFunctions.createByteMatchSet(name: String, changeToken: String, init: AWSWAFCreateByteMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.CreateByteMatchSetResult {
	return this.block.declare(AWSWAFCreateByteMatchSetCommand(name, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateByteMatchSetResult
}

@Generated
class AWSWAFCreateByteMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateByteMatchSetRequest, com.amazonaws.services.waf.model.CreateByteMatchSetResult> {



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
		return environment.waf.createByteMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-byte-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createGeoMatchSet(name: String, changeToken: String, init: AWSWAFCreateGeoMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.CreateGeoMatchSetResult {
	return this.block.declare(AWSWAFCreateGeoMatchSetCommand(name, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateGeoMatchSetResult
}

@Generated
class AWSWAFCreateGeoMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateGeoMatchSetRequest, com.amazonaws.services.waf.model.CreateGeoMatchSetResult> {



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
		return environment.waf.createGeoMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-geo-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createIPSet(name: String, changeToken: String, init: AWSWAFCreateIPSetCommand.() -> Unit): com.amazonaws.services.waf.model.CreateIPSetResult {
	return this.block.declare(AWSWAFCreateIPSetCommand(name, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateIPSetResult
}

@Generated
class AWSWAFCreateIPSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateIPSetRequest, com.amazonaws.services.waf.model.CreateIPSetResult> {



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
		return environment.waf.createIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-ipset")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createRateBasedRule(name: String, metricName: String, rateKey: RateKey, rateLimit: Long, changeToken: String, init: AWSWAFCreateRateBasedRuleCommand.() -> Unit): com.amazonaws.services.waf.model.CreateRateBasedRuleResult {
	return this.block.declare(AWSWAFCreateRateBasedRuleCommand(name, metricName, rateKey, rateLimit, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateRateBasedRuleResult
}

@Generated
class AWSWAFCreateRateBasedRuleCommand(val name: String, val metricName: String, val rateKey: RateKey, val rateLimit: Long, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRateBasedRuleRequest, com.amazonaws.services.waf.model.CreateRateBasedRuleResult> {



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
		return environment.waf.createRateBasedRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-rate-based-rule")
				.argument("name", name)
				.argument("metric-name", metricName)
				.argument("rate-key", rateKey.toString())
				.argument("rate-limit", rateLimit.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createRegexMatchSet(name: String, changeToken: String, init: AWSWAFCreateRegexMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.CreateRegexMatchSetResult {
	return this.block.declare(AWSWAFCreateRegexMatchSetCommand(name, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateRegexMatchSetResult
}

@Generated
class AWSWAFCreateRegexMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRegexMatchSetRequest, com.amazonaws.services.waf.model.CreateRegexMatchSetResult> {



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
		return environment.waf.createRegexMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-regex-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createRegexPatternSet(name: String, changeToken: String, init: AWSWAFCreateRegexPatternSetCommand.() -> Unit): com.amazonaws.services.waf.model.CreateRegexPatternSetResult {
	return this.block.declare(AWSWAFCreateRegexPatternSetCommand(name, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateRegexPatternSetResult
}

@Generated
class AWSWAFCreateRegexPatternSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRegexPatternSetRequest, com.amazonaws.services.waf.model.CreateRegexPatternSetResult> {



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
		return environment.waf.createRegexPatternSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-regex-pattern-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createRule(name: String, metricName: String, changeToken: String, init: AWSWAFCreateRuleCommand.() -> Unit): com.amazonaws.services.waf.model.CreateRuleResult {
	return this.block.declare(AWSWAFCreateRuleCommand(name, metricName, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateRuleResult
}

@Generated
class AWSWAFCreateRuleCommand(val name: String, val metricName: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRuleRequest, com.amazonaws.services.waf.model.CreateRuleResult> {



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
		return environment.waf.createRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-rule")
				.argument("name", name)
				.argument("metric-name", metricName)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createRuleGroup(name: String, metricName: String, changeToken: String, init: AWSWAFCreateRuleGroupCommand.() -> Unit): com.amazonaws.services.waf.model.CreateRuleGroupResult {
	return this.block.declare(AWSWAFCreateRuleGroupCommand(name, metricName, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateRuleGroupResult
}

@Generated
class AWSWAFCreateRuleGroupCommand(val name: String, val metricName: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRuleGroupRequest, com.amazonaws.services.waf.model.CreateRuleGroupResult> {



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
		return environment.waf.createRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-rule-group")
				.argument("name", name)
				.argument("metric-name", metricName)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createSizeConstraintSet(name: String, changeToken: String, init: AWSWAFCreateSizeConstraintSetCommand.() -> Unit): com.amazonaws.services.waf.model.CreateSizeConstraintSetResult {
	return this.block.declare(AWSWAFCreateSizeConstraintSetCommand(name, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateSizeConstraintSetResult
}

@Generated
class AWSWAFCreateSizeConstraintSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest, com.amazonaws.services.waf.model.CreateSizeConstraintSetResult> {



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
		return environment.waf.createSizeConstraintSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-size-constraint-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createSqlInjectionMatchSet(name: String, changeToken: String, init: AWSWAFCreateSqlInjectionMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetResult {
	return this.block.declare(AWSWAFCreateSqlInjectionMatchSetCommand(name, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetResult
}

@Generated
class AWSWAFCreateSqlInjectionMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest, com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetResult> {



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
		return environment.waf.createSqlInjectionMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-sql-injection-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createWebACL(name: String, metricName: String, defaultAction: com.amazonaws.services.waf.model.WafAction, changeToken: String, init: AWSWAFCreateWebACLCommand.() -> Unit): com.amazonaws.services.waf.model.CreateWebACLResult {
	return this.block.declare(AWSWAFCreateWebACLCommand(name, metricName, defaultAction, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateWebACLResult
}

@Generated
class AWSWAFCreateWebACLCommand(val name: String, val metricName: String, val defaultAction: com.amazonaws.services.waf.model.WafAction, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateWebACLRequest, com.amazonaws.services.waf.model.CreateWebACLResult> {



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
		return environment.waf.createWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-web-acl")
				.argument("name", name)
				.argument("metric-name", metricName)
				.argument("default-action", defaultAction.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createXssMatchSet(name: String, changeToken: String, init: AWSWAFCreateXssMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.CreateXssMatchSetResult {
	return this.block.declare(AWSWAFCreateXssMatchSetCommand(name, changeToken).apply(init)) as com.amazonaws.services.waf.model.CreateXssMatchSetResult
}

@Generated
class AWSWAFCreateXssMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateXssMatchSetRequest, com.amazonaws.services.waf.model.CreateXssMatchSetResult> {



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
		return environment.waf.createXssMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-xss-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteByteMatchSet(byteMatchSetId: String, changeToken: String, init: AWSWAFDeleteByteMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteByteMatchSetResult {
	return this.block.declare(AWSWAFDeleteByteMatchSetCommand(byteMatchSetId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteByteMatchSetResult
}

@Generated
class AWSWAFDeleteByteMatchSetCommand(val byteMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteByteMatchSetRequest, com.amazonaws.services.waf.model.DeleteByteMatchSetResult> {



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
		return environment.waf.deleteByteMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-byte-match-set")
				.argument("byte-match-set-id", byteMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteGeoMatchSet(geoMatchSetId: String, changeToken: String, init: AWSWAFDeleteGeoMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteGeoMatchSetResult {
	return this.block.declare(AWSWAFDeleteGeoMatchSetCommand(geoMatchSetId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteGeoMatchSetResult
}

@Generated
class AWSWAFDeleteGeoMatchSetCommand(val geoMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest, com.amazonaws.services.waf.model.DeleteGeoMatchSetResult> {



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
		return environment.waf.deleteGeoMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-geo-match-set")
				.argument("geo-match-set-id", geoMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteIPSet(iPSetId: String, changeToken: String, init: AWSWAFDeleteIPSetCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteIPSetResult {
	return this.block.declare(AWSWAFDeleteIPSetCommand(iPSetId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteIPSetResult
}

@Generated
class AWSWAFDeleteIPSetCommand(val iPSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteIPSetRequest, com.amazonaws.services.waf.model.DeleteIPSetResult> {



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
		return environment.waf.deleteIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-ipset")
				.argument("ipset-id", iPSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deletePermissionPolicy(resourceArn: String, init: AWSWAFDeletePermissionPolicyCommand.() -> Unit): com.amazonaws.services.waf.model.DeletePermissionPolicyResult {
	return this.block.declare(AWSWAFDeletePermissionPolicyCommand(resourceArn).apply(init)) as com.amazonaws.services.waf.model.DeletePermissionPolicyResult
}

@Generated
class AWSWAFDeletePermissionPolicyCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeletePermissionPolicyRequest, com.amazonaws.services.waf.model.DeletePermissionPolicyResult> {



	override fun build(): com.amazonaws.services.waf.model.DeletePermissionPolicyRequest {
		val input = com.amazonaws.services.waf.model.DeletePermissionPolicyRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.waf.model.DeletePermissionPolicyResult {
	  return com.amazonaws.services.waf.model.DeletePermissionPolicyResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.DeletePermissionPolicyResult {
		return environment.waf.deletePermissionPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-permission-policy")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSWAFFunctions.deleteRateBasedRule(ruleId: String, changeToken: String, init: AWSWAFDeleteRateBasedRuleCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteRateBasedRuleResult {
	return this.block.declare(AWSWAFDeleteRateBasedRuleCommand(ruleId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteRateBasedRuleResult
}

@Generated
class AWSWAFDeleteRateBasedRuleCommand(val ruleId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest, com.amazonaws.services.waf.model.DeleteRateBasedRuleResult> {



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
		return environment.waf.deleteRateBasedRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-rate-based-rule")
				.argument("rule-id", ruleId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteRegexMatchSet(regexMatchSetId: String, changeToken: String, init: AWSWAFDeleteRegexMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteRegexMatchSetResult {
	return this.block.declare(AWSWAFDeleteRegexMatchSetCommand(regexMatchSetId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteRegexMatchSetResult
}

@Generated
class AWSWAFDeleteRegexMatchSetCommand(val regexMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest, com.amazonaws.services.waf.model.DeleteRegexMatchSetResult> {



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
		return environment.waf.deleteRegexMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-regex-match-set")
				.argument("regex-match-set-id", regexMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteRegexPatternSet(regexPatternSetId: String, changeToken: String, init: AWSWAFDeleteRegexPatternSetCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteRegexPatternSetResult {
	return this.block.declare(AWSWAFDeleteRegexPatternSetCommand(regexPatternSetId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteRegexPatternSetResult
}

@Generated
class AWSWAFDeleteRegexPatternSetCommand(val regexPatternSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest, com.amazonaws.services.waf.model.DeleteRegexPatternSetResult> {



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
		return environment.waf.deleteRegexPatternSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-regex-pattern-set")
				.argument("regex-pattern-set-id", regexPatternSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteRule(ruleId: String, changeToken: String, init: AWSWAFDeleteRuleCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteRuleResult {
	return this.block.declare(AWSWAFDeleteRuleCommand(ruleId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteRuleResult
}

@Generated
class AWSWAFDeleteRuleCommand(val ruleId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRuleRequest, com.amazonaws.services.waf.model.DeleteRuleResult> {



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
		return environment.waf.deleteRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-rule")
				.argument("rule-id", ruleId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteRuleGroup(ruleGroupId: String, changeToken: String, init: AWSWAFDeleteRuleGroupCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteRuleGroupResult {
	return this.block.declare(AWSWAFDeleteRuleGroupCommand(ruleGroupId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteRuleGroupResult
}

@Generated
class AWSWAFDeleteRuleGroupCommand(val ruleGroupId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRuleGroupRequest, com.amazonaws.services.waf.model.DeleteRuleGroupResult> {



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
		return environment.waf.deleteRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-rule-group")
				.argument("rule-group-id", ruleGroupId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteSizeConstraintSet(sizeConstraintSetId: String, changeToken: String, init: AWSWAFDeleteSizeConstraintSetCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteSizeConstraintSetResult {
	return this.block.declare(AWSWAFDeleteSizeConstraintSetCommand(sizeConstraintSetId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteSizeConstraintSetResult
}

@Generated
class AWSWAFDeleteSizeConstraintSetCommand(val sizeConstraintSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest, com.amazonaws.services.waf.model.DeleteSizeConstraintSetResult> {



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
		return environment.waf.deleteSizeConstraintSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-size-constraint-set")
				.argument("size-constraint-set-id", sizeConstraintSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteSqlInjectionMatchSet(sqlInjectionMatchSetId: String, changeToken: String, init: AWSWAFDeleteSqlInjectionMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetResult {
	return this.block.declare(AWSWAFDeleteSqlInjectionMatchSetCommand(sqlInjectionMatchSetId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetResult
}

@Generated
class AWSWAFDeleteSqlInjectionMatchSetCommand(val sqlInjectionMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest, com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetResult> {



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
		return environment.waf.deleteSqlInjectionMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-sql-injection-match-set")
				.argument("sql-injection-match-set-id", sqlInjectionMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteWebACL(webACLId: String, changeToken: String, init: AWSWAFDeleteWebACLCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteWebACLResult {
	return this.block.declare(AWSWAFDeleteWebACLCommand(webACLId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteWebACLResult
}

@Generated
class AWSWAFDeleteWebACLCommand(val webACLId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteWebACLRequest, com.amazonaws.services.waf.model.DeleteWebACLResult> {



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
		return environment.waf.deleteWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-web-acl")
				.argument("web-aclid", webACLId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteXssMatchSet(xssMatchSetId: String, changeToken: String, init: AWSWAFDeleteXssMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.DeleteXssMatchSetResult {
	return this.block.declare(AWSWAFDeleteXssMatchSetCommand(xssMatchSetId, changeToken).apply(init)) as com.amazonaws.services.waf.model.DeleteXssMatchSetResult
}

@Generated
class AWSWAFDeleteXssMatchSetCommand(val xssMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteXssMatchSetRequest, com.amazonaws.services.waf.model.DeleteXssMatchSetResult> {



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
		return environment.waf.deleteXssMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-xss-match-set")
				.argument("xss-match-set-id", xssMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.getByteMatchSet(byteMatchSetId: String, init: AWSWAFGetByteMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.GetByteMatchSetResult {
	return this.block.declare(AWSWAFGetByteMatchSetCommand(byteMatchSetId).apply(init)) as com.amazonaws.services.waf.model.GetByteMatchSetResult
}

@Generated
class AWSWAFGetByteMatchSetCommand(val byteMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetByteMatchSetRequest, com.amazonaws.services.waf.model.GetByteMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.GetByteMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetByteMatchSetRequest()
		input.setByteMatchSetId(this.byteMatchSetId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.waf.model.GetByteMatchSetResult {
	  return com.amazonaws.services.waf.model.GetByteMatchSetResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetByteMatchSetResult {
		return environment.waf.getByteMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-byte-match-set")
				.argument("byte-match-set-id", byteMatchSetId)
	}

}


fun AWSWAFFunctions.getChangeToken(init: AWSWAFGetChangeTokenCommand.() -> Unit): com.amazonaws.services.waf.model.GetChangeTokenResult {
	return this.block.declare(AWSWAFGetChangeTokenCommand().apply(init)) as com.amazonaws.services.waf.model.GetChangeTokenResult
}

@Generated
class AWSWAFGetChangeTokenCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetChangeTokenRequest, com.amazonaws.services.waf.model.GetChangeTokenResult> {



	override fun build(): com.amazonaws.services.waf.model.GetChangeTokenRequest {
		val input = com.amazonaws.services.waf.model.GetChangeTokenRequest()

		return input
	}

	override fun dryResult(): com.amazonaws.services.waf.model.GetChangeTokenResult {
	  return com.amazonaws.services.waf.model.GetChangeTokenResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetChangeTokenResult {
		return environment.waf.getChangeToken(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-change-token")

	}

}


fun AWSWAFFunctions.getChangeTokenStatus(changeToken: String, init: AWSWAFGetChangeTokenStatusCommand.() -> Unit): com.amazonaws.services.waf.model.GetChangeTokenStatusResult {
	return this.block.declare(AWSWAFGetChangeTokenStatusCommand(changeToken).apply(init)) as com.amazonaws.services.waf.model.GetChangeTokenStatusResult
}

@Generated
class AWSWAFGetChangeTokenStatusCommand(val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetChangeTokenStatusRequest, com.amazonaws.services.waf.model.GetChangeTokenStatusResult> {



	override fun build(): com.amazonaws.services.waf.model.GetChangeTokenStatusRequest {
		val input = com.amazonaws.services.waf.model.GetChangeTokenStatusRequest()
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun dryResult(): com.amazonaws.services.waf.model.GetChangeTokenStatusResult {
	  return com.amazonaws.services.waf.model.GetChangeTokenStatusResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetChangeTokenStatusResult {
		return environment.waf.getChangeTokenStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-change-token-status")
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.getGeoMatchSet(geoMatchSetId: String, init: AWSWAFGetGeoMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.GetGeoMatchSetResult {
	return this.block.declare(AWSWAFGetGeoMatchSetCommand(geoMatchSetId).apply(init)) as com.amazonaws.services.waf.model.GetGeoMatchSetResult
}

@Generated
class AWSWAFGetGeoMatchSetCommand(val geoMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetGeoMatchSetRequest, com.amazonaws.services.waf.model.GetGeoMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.GetGeoMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetGeoMatchSetRequest()
		input.setGeoMatchSetId(this.geoMatchSetId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.waf.model.GetGeoMatchSetResult {
	  return com.amazonaws.services.waf.model.GetGeoMatchSetResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetGeoMatchSetResult {
		return environment.waf.getGeoMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-geo-match-set")
				.argument("geo-match-set-id", geoMatchSetId)
	}

}


fun AWSWAFFunctions.getIPSet(iPSetId: String, init: AWSWAFGetIPSetCommand.() -> Unit): com.amazonaws.services.waf.model.GetIPSetResult {
	return this.block.declare(AWSWAFGetIPSetCommand(iPSetId).apply(init)) as com.amazonaws.services.waf.model.GetIPSetResult
}

@Generated
class AWSWAFGetIPSetCommand(val iPSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetIPSetRequest, com.amazonaws.services.waf.model.GetIPSetResult> {



	override fun build(): com.amazonaws.services.waf.model.GetIPSetRequest {
		val input = com.amazonaws.services.waf.model.GetIPSetRequest()
		input.setIPSetId(this.iPSetId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.waf.model.GetIPSetResult {
	  return com.amazonaws.services.waf.model.GetIPSetResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetIPSetResult {
		return environment.waf.getIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-ipset")
				.argument("ipset-id", iPSetId)
	}

}


fun AWSWAFFunctions.getPermissionPolicy(resourceArn: String, init: AWSWAFGetPermissionPolicyCommand.() -> Unit): com.amazonaws.services.waf.model.GetPermissionPolicyResult {
	return this.block.declare(AWSWAFGetPermissionPolicyCommand(resourceArn).apply(init)) as com.amazonaws.services.waf.model.GetPermissionPolicyResult
}

@Generated
class AWSWAFGetPermissionPolicyCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetPermissionPolicyRequest, com.amazonaws.services.waf.model.GetPermissionPolicyResult> {



	override fun build(): com.amazonaws.services.waf.model.GetPermissionPolicyRequest {
		val input = com.amazonaws.services.waf.model.GetPermissionPolicyRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	override fun dryResult(): com.amazonaws.services.waf.model.GetPermissionPolicyResult {
	  return com.amazonaws.services.waf.model.GetPermissionPolicyResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetPermissionPolicyResult {
		return environment.waf.getPermissionPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-permission-policy")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSWAFFunctions.getRateBasedRule(ruleId: String, init: AWSWAFGetRateBasedRuleCommand.() -> Unit): com.amazonaws.services.waf.model.GetRateBasedRuleResult {
	return this.block.declare(AWSWAFGetRateBasedRuleCommand(ruleId).apply(init)) as com.amazonaws.services.waf.model.GetRateBasedRuleResult
}

@Generated
class AWSWAFGetRateBasedRuleCommand(val ruleId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRateBasedRuleRequest, com.amazonaws.services.waf.model.GetRateBasedRuleResult> {



	override fun build(): com.amazonaws.services.waf.model.GetRateBasedRuleRequest {
		val input = com.amazonaws.services.waf.model.GetRateBasedRuleRequest()
		input.setRuleId(this.ruleId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.waf.model.GetRateBasedRuleResult {
	  return com.amazonaws.services.waf.model.GetRateBasedRuleResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetRateBasedRuleResult {
		return environment.waf.getRateBasedRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-rate-based-rule")
				.argument("rule-id", ruleId)
	}

}


fun AWSWAFFunctions.getRateBasedRuleManagedKeys(ruleId: String, init: AWSWAFGetRateBasedRuleManagedKeysCommand.() -> Unit): com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysResult {
	return this.block.declare(AWSWAFGetRateBasedRuleManagedKeysCommand(ruleId).apply(init)) as com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysResult
}

@Generated
class AWSWAFGetRateBasedRuleManagedKeysCommand(val ruleId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest, com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysResult> {

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
		return environment.waf.getRateBasedRuleManagedKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-rate-based-rule-managed-keys")
				.argument("rule-id", ruleId)
				.argument("next-marker", nextMarker)
	}

}


fun AWSWAFFunctions.getRegexMatchSet(regexMatchSetId: String, init: AWSWAFGetRegexMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.GetRegexMatchSetResult {
	return this.block.declare(AWSWAFGetRegexMatchSetCommand(regexMatchSetId).apply(init)) as com.amazonaws.services.waf.model.GetRegexMatchSetResult
}

@Generated
class AWSWAFGetRegexMatchSetCommand(val regexMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRegexMatchSetRequest, com.amazonaws.services.waf.model.GetRegexMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.GetRegexMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetRegexMatchSetRequest()
		input.setRegexMatchSetId(this.regexMatchSetId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.waf.model.GetRegexMatchSetResult {
	  return com.amazonaws.services.waf.model.GetRegexMatchSetResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetRegexMatchSetResult {
		return environment.waf.getRegexMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-regex-match-set")
				.argument("regex-match-set-id", regexMatchSetId)
	}

}


fun AWSWAFFunctions.getRegexPatternSet(regexPatternSetId: String, init: AWSWAFGetRegexPatternSetCommand.() -> Unit): com.amazonaws.services.waf.model.GetRegexPatternSetResult {
	return this.block.declare(AWSWAFGetRegexPatternSetCommand(regexPatternSetId).apply(init)) as com.amazonaws.services.waf.model.GetRegexPatternSetResult
}

@Generated
class AWSWAFGetRegexPatternSetCommand(val regexPatternSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRegexPatternSetRequest, com.amazonaws.services.waf.model.GetRegexPatternSetResult> {



	override fun build(): com.amazonaws.services.waf.model.GetRegexPatternSetRequest {
		val input = com.amazonaws.services.waf.model.GetRegexPatternSetRequest()
		input.setRegexPatternSetId(this.regexPatternSetId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.waf.model.GetRegexPatternSetResult {
	  return com.amazonaws.services.waf.model.GetRegexPatternSetResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetRegexPatternSetResult {
		return environment.waf.getRegexPatternSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-regex-pattern-set")
				.argument("regex-pattern-set-id", regexPatternSetId)
	}

}


fun AWSWAFFunctions.getRule(ruleId: String, init: AWSWAFGetRuleCommand.() -> Unit): com.amazonaws.services.waf.model.GetRuleResult {
	return this.block.declare(AWSWAFGetRuleCommand(ruleId).apply(init)) as com.amazonaws.services.waf.model.GetRuleResult
}

@Generated
class AWSWAFGetRuleCommand(val ruleId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRuleRequest, com.amazonaws.services.waf.model.GetRuleResult> {



	override fun build(): com.amazonaws.services.waf.model.GetRuleRequest {
		val input = com.amazonaws.services.waf.model.GetRuleRequest()
		input.setRuleId(this.ruleId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.waf.model.GetRuleResult {
	  return com.amazonaws.services.waf.model.GetRuleResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetRuleResult {
		return environment.waf.getRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-rule")
				.argument("rule-id", ruleId)
	}

}


fun AWSWAFFunctions.getRuleGroup(ruleGroupId: String, init: AWSWAFGetRuleGroupCommand.() -> Unit): com.amazonaws.services.waf.model.GetRuleGroupResult {
	return this.block.declare(AWSWAFGetRuleGroupCommand(ruleGroupId).apply(init)) as com.amazonaws.services.waf.model.GetRuleGroupResult
}

@Generated
class AWSWAFGetRuleGroupCommand(val ruleGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRuleGroupRequest, com.amazonaws.services.waf.model.GetRuleGroupResult> {



	override fun build(): com.amazonaws.services.waf.model.GetRuleGroupRequest {
		val input = com.amazonaws.services.waf.model.GetRuleGroupRequest()
		input.setRuleGroupId(this.ruleGroupId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.waf.model.GetRuleGroupResult {
	  return com.amazonaws.services.waf.model.GetRuleGroupResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetRuleGroupResult {
		return environment.waf.getRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-rule-group")
				.argument("rule-group-id", ruleGroupId)
	}

}


fun AWSWAFFunctions.getSampledRequests(webAclId: String, ruleId: String, timeWindow: com.amazonaws.services.waf.model.TimeWindow, maxItems: Long, init: AWSWAFGetSampledRequestsCommand.() -> Unit): com.amazonaws.services.waf.model.GetSampledRequestsResult {
	return this.block.declare(AWSWAFGetSampledRequestsCommand(webAclId, ruleId, timeWindow, maxItems).apply(init)) as com.amazonaws.services.waf.model.GetSampledRequestsResult
}

@Generated
class AWSWAFGetSampledRequestsCommand(val webAclId: String, val ruleId: String, val timeWindow: com.amazonaws.services.waf.model.TimeWindow, val maxItems: Long) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetSampledRequestsRequest, com.amazonaws.services.waf.model.GetSampledRequestsResult> {



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
		return environment.waf.getSampledRequests(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-sampled-requests")
				.argument("web-acl-id", webAclId)
				.argument("rule-id", ruleId)
				.argument("time-window", timeWindow.toString())
				.argument("max-items", maxItems.toString())
	}

}


fun AWSWAFFunctions.getSizeConstraintSet(sizeConstraintSetId: String, init: AWSWAFGetSizeConstraintSetCommand.() -> Unit): com.amazonaws.services.waf.model.GetSizeConstraintSetResult {
	return this.block.declare(AWSWAFGetSizeConstraintSetCommand(sizeConstraintSetId).apply(init)) as com.amazonaws.services.waf.model.GetSizeConstraintSetResult
}

@Generated
class AWSWAFGetSizeConstraintSetCommand(val sizeConstraintSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetSizeConstraintSetRequest, com.amazonaws.services.waf.model.GetSizeConstraintSetResult> {



	override fun build(): com.amazonaws.services.waf.model.GetSizeConstraintSetRequest {
		val input = com.amazonaws.services.waf.model.GetSizeConstraintSetRequest()
		input.setSizeConstraintSetId(this.sizeConstraintSetId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.waf.model.GetSizeConstraintSetResult {
	  return com.amazonaws.services.waf.model.GetSizeConstraintSetResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetSizeConstraintSetResult {
		return environment.waf.getSizeConstraintSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-size-constraint-set")
				.argument("size-constraint-set-id", sizeConstraintSetId)
	}

}


fun AWSWAFFunctions.getSqlInjectionMatchSet(sqlInjectionMatchSetId: String, init: AWSWAFGetSqlInjectionMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult {
	return this.block.declare(AWSWAFGetSqlInjectionMatchSetCommand(sqlInjectionMatchSetId).apply(init)) as com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult
}

@Generated
class AWSWAFGetSqlInjectionMatchSetCommand(val sqlInjectionMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest, com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest()
		input.setSqlInjectionMatchSetId(this.sqlInjectionMatchSetId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult {
	  return com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetSqlInjectionMatchSetResult {
		return environment.waf.getSqlInjectionMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-sql-injection-match-set")
				.argument("sql-injection-match-set-id", sqlInjectionMatchSetId)
	}

}


fun AWSWAFFunctions.getWebACL(webACLId: String, init: AWSWAFGetWebACLCommand.() -> Unit): com.amazonaws.services.waf.model.GetWebACLResult {
	return this.block.declare(AWSWAFGetWebACLCommand(webACLId).apply(init)) as com.amazonaws.services.waf.model.GetWebACLResult
}

@Generated
class AWSWAFGetWebACLCommand(val webACLId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetWebACLRequest, com.amazonaws.services.waf.model.GetWebACLResult> {



	override fun build(): com.amazonaws.services.waf.model.GetWebACLRequest {
		val input = com.amazonaws.services.waf.model.GetWebACLRequest()
		input.setWebACLId(this.webACLId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.waf.model.GetWebACLResult {
	  return com.amazonaws.services.waf.model.GetWebACLResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetWebACLResult {
		return environment.waf.getWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-web-acl")
				.argument("web-aclid", webACLId)
	}

}


fun AWSWAFFunctions.getXssMatchSet(xssMatchSetId: String, init: AWSWAFGetXssMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.GetXssMatchSetResult {
	return this.block.declare(AWSWAFGetXssMatchSetCommand(xssMatchSetId).apply(init)) as com.amazonaws.services.waf.model.GetXssMatchSetResult
}

@Generated
class AWSWAFGetXssMatchSetCommand(val xssMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetXssMatchSetRequest, com.amazonaws.services.waf.model.GetXssMatchSetResult> {



	override fun build(): com.amazonaws.services.waf.model.GetXssMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetXssMatchSetRequest()
		input.setXssMatchSetId(this.xssMatchSetId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.waf.model.GetXssMatchSetResult {
	  return com.amazonaws.services.waf.model.GetXssMatchSetResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.waf.model.GetXssMatchSetResult {
		return environment.waf.getXssMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-xss-match-set")
				.argument("xss-match-set-id", xssMatchSetId)
	}

}


fun AWSWAFFunctions.listActivatedRulesInRuleGroup(init: AWSWAFListActivatedRulesInRuleGroupCommand.() -> Unit): com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupResult {
	return this.block.declare(AWSWAFListActivatedRulesInRuleGroupCommand().apply(init)) as com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupResult
}

@Generated
class AWSWAFListActivatedRulesInRuleGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupRequest, com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupResult> {

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
		return environment.waf.listActivatedRulesInRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-activated-rules-in-rule-group")
				.argument("rule-group-id", ruleGroupId)
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listByteMatchSets(init: AWSWAFListByteMatchSetsCommand.() -> Unit): com.amazonaws.services.waf.model.ListByteMatchSetsResult {
	return this.block.declare(AWSWAFListByteMatchSetsCommand().apply(init)) as com.amazonaws.services.waf.model.ListByteMatchSetsResult
}

@Generated
class AWSWAFListByteMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListByteMatchSetsRequest, com.amazonaws.services.waf.model.ListByteMatchSetsResult> {

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
		return environment.waf.listByteMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-byte-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listGeoMatchSets(init: AWSWAFListGeoMatchSetsCommand.() -> Unit): com.amazonaws.services.waf.model.ListGeoMatchSetsResult {
	return this.block.declare(AWSWAFListGeoMatchSetsCommand().apply(init)) as com.amazonaws.services.waf.model.ListGeoMatchSetsResult
}

@Generated
class AWSWAFListGeoMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListGeoMatchSetsRequest, com.amazonaws.services.waf.model.ListGeoMatchSetsResult> {

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
		return environment.waf.listGeoMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-geo-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listIPSets(init: AWSWAFListIPSetsCommand.() -> Unit): com.amazonaws.services.waf.model.ListIPSetsResult {
	return this.block.declare(AWSWAFListIPSetsCommand().apply(init)) as com.amazonaws.services.waf.model.ListIPSetsResult
}

@Generated
class AWSWAFListIPSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListIPSetsRequest, com.amazonaws.services.waf.model.ListIPSetsResult> {

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
		return environment.waf.listIPSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-ipsets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listRateBasedRules(init: AWSWAFListRateBasedRulesCommand.() -> Unit): com.amazonaws.services.waf.model.ListRateBasedRulesResult {
	return this.block.declare(AWSWAFListRateBasedRulesCommand().apply(init)) as com.amazonaws.services.waf.model.ListRateBasedRulesResult
}

@Generated
class AWSWAFListRateBasedRulesCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRateBasedRulesRequest, com.amazonaws.services.waf.model.ListRateBasedRulesResult> {

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
		return environment.waf.listRateBasedRules(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-rate-based-rules")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listRegexMatchSets(init: AWSWAFListRegexMatchSetsCommand.() -> Unit): com.amazonaws.services.waf.model.ListRegexMatchSetsResult {
	return this.block.declare(AWSWAFListRegexMatchSetsCommand().apply(init)) as com.amazonaws.services.waf.model.ListRegexMatchSetsResult
}

@Generated
class AWSWAFListRegexMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRegexMatchSetsRequest, com.amazonaws.services.waf.model.ListRegexMatchSetsResult> {

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
		return environment.waf.listRegexMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-regex-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listRegexPatternSets(init: AWSWAFListRegexPatternSetsCommand.() -> Unit): com.amazonaws.services.waf.model.ListRegexPatternSetsResult {
	return this.block.declare(AWSWAFListRegexPatternSetsCommand().apply(init)) as com.amazonaws.services.waf.model.ListRegexPatternSetsResult
}

@Generated
class AWSWAFListRegexPatternSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRegexPatternSetsRequest, com.amazonaws.services.waf.model.ListRegexPatternSetsResult> {

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
		return environment.waf.listRegexPatternSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-regex-pattern-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listRuleGroups(init: AWSWAFListRuleGroupsCommand.() -> Unit): com.amazonaws.services.waf.model.ListRuleGroupsResult {
	return this.block.declare(AWSWAFListRuleGroupsCommand().apply(init)) as com.amazonaws.services.waf.model.ListRuleGroupsResult
}

@Generated
class AWSWAFListRuleGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRuleGroupsRequest, com.amazonaws.services.waf.model.ListRuleGroupsResult> {

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
		return environment.waf.listRuleGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-rule-groups")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listRules(init: AWSWAFListRulesCommand.() -> Unit): com.amazonaws.services.waf.model.ListRulesResult {
	return this.block.declare(AWSWAFListRulesCommand().apply(init)) as com.amazonaws.services.waf.model.ListRulesResult
}

@Generated
class AWSWAFListRulesCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRulesRequest, com.amazonaws.services.waf.model.ListRulesResult> {

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
		return environment.waf.listRules(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-rules")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listSizeConstraintSets(init: AWSWAFListSizeConstraintSetsCommand.() -> Unit): com.amazonaws.services.waf.model.ListSizeConstraintSetsResult {
	return this.block.declare(AWSWAFListSizeConstraintSetsCommand().apply(init)) as com.amazonaws.services.waf.model.ListSizeConstraintSetsResult
}

@Generated
class AWSWAFListSizeConstraintSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest, com.amazonaws.services.waf.model.ListSizeConstraintSetsResult> {

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
		return environment.waf.listSizeConstraintSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-size-constraint-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listSqlInjectionMatchSets(init: AWSWAFListSqlInjectionMatchSetsCommand.() -> Unit): com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsResult {
	return this.block.declare(AWSWAFListSqlInjectionMatchSetsCommand().apply(init)) as com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsResult
}

@Generated
class AWSWAFListSqlInjectionMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest, com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsResult> {

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
		return environment.waf.listSqlInjectionMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-sql-injection-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listSubscribedRuleGroups(init: AWSWAFListSubscribedRuleGroupsCommand.() -> Unit): com.amazonaws.services.waf.model.ListSubscribedRuleGroupsResult {
	return this.block.declare(AWSWAFListSubscribedRuleGroupsCommand().apply(init)) as com.amazonaws.services.waf.model.ListSubscribedRuleGroupsResult
}

@Generated
class AWSWAFListSubscribedRuleGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest, com.amazonaws.services.waf.model.ListSubscribedRuleGroupsResult> {

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
		return environment.waf.listSubscribedRuleGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-subscribed-rule-groups")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listWebACLs(init: AWSWAFListWebACLsCommand.() -> Unit): com.amazonaws.services.waf.model.ListWebACLsResult {
	return this.block.declare(AWSWAFListWebACLsCommand().apply(init)) as com.amazonaws.services.waf.model.ListWebACLsResult
}

@Generated
class AWSWAFListWebACLsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListWebACLsRequest, com.amazonaws.services.waf.model.ListWebACLsResult> {

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
		return environment.waf.listWebACLs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-web-acls")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listXssMatchSets(init: AWSWAFListXssMatchSetsCommand.() -> Unit): com.amazonaws.services.waf.model.ListXssMatchSetsResult {
	return this.block.declare(AWSWAFListXssMatchSetsCommand().apply(init)) as com.amazonaws.services.waf.model.ListXssMatchSetsResult
}

@Generated
class AWSWAFListXssMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListXssMatchSetsRequest, com.amazonaws.services.waf.model.ListXssMatchSetsResult> {

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
		return environment.waf.listXssMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-xss-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.putPermissionPolicy(resourceArn: String, policy: String, init: AWSWAFPutPermissionPolicyCommand.() -> Unit): com.amazonaws.services.waf.model.PutPermissionPolicyResult {
	return this.block.declare(AWSWAFPutPermissionPolicyCommand(resourceArn, policy).apply(init)) as com.amazonaws.services.waf.model.PutPermissionPolicyResult
}

@Generated
class AWSWAFPutPermissionPolicyCommand(val resourceArn: String, val policy: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.PutPermissionPolicyRequest, com.amazonaws.services.waf.model.PutPermissionPolicyResult> {



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
		return environment.waf.putPermissionPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf put-permission-policy")
				.argument("resource-arn", resourceArn)
				.argument("policy", policy)
	}

}


fun AWSWAFFunctions.updateByteMatchSet(byteMatchSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.ByteMatchSetUpdate>, init: AWSWAFUpdateByteMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateByteMatchSetResult {
	return this.block.declare(AWSWAFUpdateByteMatchSetCommand(byteMatchSetId, changeToken, updates).apply(init)) as com.amazonaws.services.waf.model.UpdateByteMatchSetResult
}

@Generated
class AWSWAFUpdateByteMatchSetCommand(val byteMatchSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.ByteMatchSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateByteMatchSetRequest, com.amazonaws.services.waf.model.UpdateByteMatchSetResult> {



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
		return environment.waf.updateByteMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-byte-match-set")
				.argument("byte-match-set-id", byteMatchSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFFunctions.updateGeoMatchSet(geoMatchSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.GeoMatchSetUpdate>, init: AWSWAFUpdateGeoMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateGeoMatchSetResult {
	return this.block.declare(AWSWAFUpdateGeoMatchSetCommand(geoMatchSetId, changeToken, updates).apply(init)) as com.amazonaws.services.waf.model.UpdateGeoMatchSetResult
}

@Generated
class AWSWAFUpdateGeoMatchSetCommand(val geoMatchSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.GeoMatchSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest, com.amazonaws.services.waf.model.UpdateGeoMatchSetResult> {



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
		return environment.waf.updateGeoMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-geo-match-set")
				.argument("geo-match-set-id", geoMatchSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFFunctions.updateIPSet(iPSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.IPSetUpdate>, init: AWSWAFUpdateIPSetCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateIPSetResult {
	return this.block.declare(AWSWAFUpdateIPSetCommand(iPSetId, changeToken, updates).apply(init)) as com.amazonaws.services.waf.model.UpdateIPSetResult
}

@Generated
class AWSWAFUpdateIPSetCommand(val iPSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.IPSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateIPSetRequest, com.amazonaws.services.waf.model.UpdateIPSetResult> {



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
		return environment.waf.updateIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-ipset")
				.argument("ipset-id", iPSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFFunctions.updateRateBasedRule(ruleId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.RuleUpdate>, rateLimit: Long, init: AWSWAFUpdateRateBasedRuleCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateRateBasedRuleResult {
	return this.block.declare(AWSWAFUpdateRateBasedRuleCommand(ruleId, changeToken, updates, rateLimit).apply(init)) as com.amazonaws.services.waf.model.UpdateRateBasedRuleResult
}

@Generated
class AWSWAFUpdateRateBasedRuleCommand(val ruleId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.RuleUpdate>, val rateLimit: Long) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest, com.amazonaws.services.waf.model.UpdateRateBasedRuleResult> {



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
		return environment.waf.updateRateBasedRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-rate-based-rule")
				.argument("rule-id", ruleId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
				.argument("rate-limit", rateLimit.toString())
	}

}


fun AWSWAFFunctions.updateRegexMatchSet(regexMatchSetId: String, updates: List<com.amazonaws.services.waf.model.RegexMatchSetUpdate>, changeToken: String, init: AWSWAFUpdateRegexMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateRegexMatchSetResult {
	return this.block.declare(AWSWAFUpdateRegexMatchSetCommand(regexMatchSetId, updates, changeToken).apply(init)) as com.amazonaws.services.waf.model.UpdateRegexMatchSetResult
}

@Generated
class AWSWAFUpdateRegexMatchSetCommand(val regexMatchSetId: String, val updates: List<com.amazonaws.services.waf.model.RegexMatchSetUpdate>, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest, com.amazonaws.services.waf.model.UpdateRegexMatchSetResult> {



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
		return environment.waf.updateRegexMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-regex-match-set")
				.argument("regex-match-set-id", regexMatchSetId)
				.argument("updates", updates.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.updateRegexPatternSet(regexPatternSetId: String, updates: List<com.amazonaws.services.waf.model.RegexPatternSetUpdate>, changeToken: String, init: AWSWAFUpdateRegexPatternSetCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateRegexPatternSetResult {
	return this.block.declare(AWSWAFUpdateRegexPatternSetCommand(regexPatternSetId, updates, changeToken).apply(init)) as com.amazonaws.services.waf.model.UpdateRegexPatternSetResult
}

@Generated
class AWSWAFUpdateRegexPatternSetCommand(val regexPatternSetId: String, val updates: List<com.amazonaws.services.waf.model.RegexPatternSetUpdate>, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest, com.amazonaws.services.waf.model.UpdateRegexPatternSetResult> {



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
		return environment.waf.updateRegexPatternSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-regex-pattern-set")
				.argument("regex-pattern-set-id", regexPatternSetId)
				.argument("updates", updates.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.updateRule(ruleId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.RuleUpdate>, init: AWSWAFUpdateRuleCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateRuleResult {
	return this.block.declare(AWSWAFUpdateRuleCommand(ruleId, changeToken, updates).apply(init)) as com.amazonaws.services.waf.model.UpdateRuleResult
}

@Generated
class AWSWAFUpdateRuleCommand(val ruleId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.RuleUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRuleRequest, com.amazonaws.services.waf.model.UpdateRuleResult> {



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
		return environment.waf.updateRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-rule")
				.argument("rule-id", ruleId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFFunctions.updateRuleGroup(ruleGroupId: String, updates: List<com.amazonaws.services.waf.model.RuleGroupUpdate>, changeToken: String, init: AWSWAFUpdateRuleGroupCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateRuleGroupResult {
	return this.block.declare(AWSWAFUpdateRuleGroupCommand(ruleGroupId, updates, changeToken).apply(init)) as com.amazonaws.services.waf.model.UpdateRuleGroupResult
}

@Generated
class AWSWAFUpdateRuleGroupCommand(val ruleGroupId: String, val updates: List<com.amazonaws.services.waf.model.RuleGroupUpdate>, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRuleGroupRequest, com.amazonaws.services.waf.model.UpdateRuleGroupResult> {



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
		return environment.waf.updateRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-rule-group")
				.argument("rule-group-id", ruleGroupId)
				.argument("updates", updates.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.updateSizeConstraintSet(sizeConstraintSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.SizeConstraintSetUpdate>, init: AWSWAFUpdateSizeConstraintSetCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateSizeConstraintSetResult {
	return this.block.declare(AWSWAFUpdateSizeConstraintSetCommand(sizeConstraintSetId, changeToken, updates).apply(init)) as com.amazonaws.services.waf.model.UpdateSizeConstraintSetResult
}

@Generated
class AWSWAFUpdateSizeConstraintSetCommand(val sizeConstraintSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.SizeConstraintSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest, com.amazonaws.services.waf.model.UpdateSizeConstraintSetResult> {



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
		return environment.waf.updateSizeConstraintSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-size-constraint-set")
				.argument("size-constraint-set-id", sizeConstraintSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFFunctions.updateSqlInjectionMatchSet(sqlInjectionMatchSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.SqlInjectionMatchSetUpdate>, init: AWSWAFUpdateSqlInjectionMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetResult {
	return this.block.declare(AWSWAFUpdateSqlInjectionMatchSetCommand(sqlInjectionMatchSetId, changeToken, updates).apply(init)) as com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetResult
}

@Generated
class AWSWAFUpdateSqlInjectionMatchSetCommand(val sqlInjectionMatchSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.SqlInjectionMatchSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest, com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetResult> {



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
		return environment.waf.updateSqlInjectionMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-sql-injection-match-set")
				.argument("sql-injection-match-set-id", sqlInjectionMatchSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFFunctions.updateWebACL(webACLId: String, changeToken: String, init: AWSWAFUpdateWebACLCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateWebACLResult {
	return this.block.declare(AWSWAFUpdateWebACLCommand(webACLId, changeToken).apply(init)) as com.amazonaws.services.waf.model.UpdateWebACLResult
}

@Generated
class AWSWAFUpdateWebACLCommand(val webACLId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateWebACLRequest, com.amazonaws.services.waf.model.UpdateWebACLResult> {

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
		return environment.waf.updateWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-web-acl")
				.argument("web-aclid", webACLId)
				.argument("change-token", changeToken)
				.argument("updates", updates?.toString())
				.argument("default-action", defaultAction?.toString())
	}

}


fun AWSWAFFunctions.updateXssMatchSet(xssMatchSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.XssMatchSetUpdate>, init: AWSWAFUpdateXssMatchSetCommand.() -> Unit): com.amazonaws.services.waf.model.UpdateXssMatchSetResult {
	return this.block.declare(AWSWAFUpdateXssMatchSetCommand(xssMatchSetId, changeToken, updates).apply(init)) as com.amazonaws.services.waf.model.UpdateXssMatchSetResult
}

@Generated
class AWSWAFUpdateXssMatchSetCommand(val xssMatchSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.XssMatchSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateXssMatchSetRequest, com.amazonaws.services.waf.model.UpdateXssMatchSetResult> {



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
		return environment.waf.updateXssMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-xss-match-set")
				.argument("xss-match-set-id", xssMatchSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}
