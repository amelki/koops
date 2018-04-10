
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.waf.AWSWAFRegional
import com.amazonaws.services.waf.model.*

var codingue.koops.core.Environment.waf_regional: AWSWAFRegional
	get() = this.capabilities[AWSWAFRegional::class.java.name] as AWSWAFRegional
	set(waf_regional) {
		this.capabilities[AWSWAFRegional::class.java.name] = waf_regional
	}

@Generated
class AWSWAFRegionalFunctions(val block: Block)

infix fun AwsContinuation.waf_regional(init: AWSWAFRegionalFunctions.() -> Unit) {
	AWSWAFRegionalFunctions(shell).apply(init)
}

			

fun AWSWAFRegionalFunctions.associateWebACL(webACLId: String, resourceArn: String, init: AWSWAFRegionalAssociateWebACLCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalAssociateWebACLCommand(webACLId, resourceArn).apply(init))
}

@Generated
class AWSWAFRegionalAssociateWebACLCommand(val webACLId: String, val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.AssociateWebACLRequest> {



	override fun build(): com.amazonaws.services.waf.model.AssociateWebACLRequest {
		val input = com.amazonaws.services.waf.model.AssociateWebACLRequest()
		input.setWebACLId(this.webACLId)
		input.setResourceArn(this.resourceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.associateWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional associate-web-acl")
				.argument("web-aclid", webACLId)
				.argument("resource-arn", resourceArn)
	}

}


fun AWSWAFRegionalFunctions.createByteMatchSet(name: String, changeToken: String, init: AWSWAFRegionalCreateByteMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalCreateByteMatchSetCommand(name, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalCreateByteMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateByteMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateByteMatchSetRequest {
		val input = com.amazonaws.services.waf.model.CreateByteMatchSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.createByteMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-byte-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createGeoMatchSet(name: String, changeToken: String, init: AWSWAFRegionalCreateGeoMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalCreateGeoMatchSetCommand(name, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalCreateGeoMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateGeoMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateGeoMatchSetRequest {
		val input = com.amazonaws.services.waf.model.CreateGeoMatchSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.createGeoMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-geo-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createIPSet(name: String, changeToken: String, init: AWSWAFRegionalCreateIPSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalCreateIPSetCommand(name, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalCreateIPSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateIPSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateIPSetRequest {
		val input = com.amazonaws.services.waf.model.CreateIPSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.createIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-ipset")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createRateBasedRule(name: String, metricName: String, rateKey: RateKey, rateLimit: Long, changeToken: String, init: AWSWAFRegionalCreateRateBasedRuleCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalCreateRateBasedRuleCommand(name, metricName, rateKey, rateLimit, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalCreateRateBasedRuleCommand(val name: String, val metricName: String, val rateKey: RateKey, val rateLimit: Long, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRateBasedRuleRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateRateBasedRuleRequest {
		val input = com.amazonaws.services.waf.model.CreateRateBasedRuleRequest()
		input.setName(this.name)
		input.setMetricName(this.metricName)
		input.setRateKey(this.rateKey.toString())
		input.setRateLimit(this.rateLimit)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.createRateBasedRule(build())
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


fun AWSWAFRegionalFunctions.createRegexMatchSet(name: String, changeToken: String, init: AWSWAFRegionalCreateRegexMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalCreateRegexMatchSetCommand(name, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalCreateRegexMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRegexMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateRegexMatchSetRequest {
		val input = com.amazonaws.services.waf.model.CreateRegexMatchSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.createRegexMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-regex-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createRegexPatternSet(name: String, changeToken: String, init: AWSWAFRegionalCreateRegexPatternSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalCreateRegexPatternSetCommand(name, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalCreateRegexPatternSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRegexPatternSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateRegexPatternSetRequest {
		val input = com.amazonaws.services.waf.model.CreateRegexPatternSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.createRegexPatternSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-regex-pattern-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createRule(name: String, metricName: String, changeToken: String, init: AWSWAFRegionalCreateRuleCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalCreateRuleCommand(name, metricName, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalCreateRuleCommand(val name: String, val metricName: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRuleRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateRuleRequest {
		val input = com.amazonaws.services.waf.model.CreateRuleRequest()
		input.setName(this.name)
		input.setMetricName(this.metricName)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.createRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-rule")
				.argument("name", name)
				.argument("metric-name", metricName)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createRuleGroup(name: String, metricName: String, changeToken: String, init: AWSWAFRegionalCreateRuleGroupCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalCreateRuleGroupCommand(name, metricName, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalCreateRuleGroupCommand(val name: String, val metricName: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRuleGroupRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateRuleGroupRequest {
		val input = com.amazonaws.services.waf.model.CreateRuleGroupRequest()
		input.setName(this.name)
		input.setMetricName(this.metricName)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.createRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-rule-group")
				.argument("name", name)
				.argument("metric-name", metricName)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createSizeConstraintSet(name: String, changeToken: String, init: AWSWAFRegionalCreateSizeConstraintSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalCreateSizeConstraintSetCommand(name, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalCreateSizeConstraintSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest {
		val input = com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.createSizeConstraintSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-size-constraint-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createSqlInjectionMatchSet(name: String, changeToken: String, init: AWSWAFRegionalCreateSqlInjectionMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalCreateSqlInjectionMatchSetCommand(name, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalCreateSqlInjectionMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest {
		val input = com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.createSqlInjectionMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-sql-injection-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createWebACL(name: String, metricName: String, defaultAction: com.amazonaws.services.waf.model.WafAction, changeToken: String, init: AWSWAFRegionalCreateWebACLCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalCreateWebACLCommand(name, metricName, defaultAction, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalCreateWebACLCommand(val name: String, val metricName: String, val defaultAction: com.amazonaws.services.waf.model.WafAction, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateWebACLRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateWebACLRequest {
		val input = com.amazonaws.services.waf.model.CreateWebACLRequest()
		input.setName(this.name)
		input.setMetricName(this.metricName)
		input.setDefaultAction(this.defaultAction)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.createWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-web-acl")
				.argument("name", name)
				.argument("metric-name", metricName)
				.argument("default-action", defaultAction.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.createXssMatchSet(name: String, changeToken: String, init: AWSWAFRegionalCreateXssMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalCreateXssMatchSetCommand(name, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalCreateXssMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateXssMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateXssMatchSetRequest {
		val input = com.amazonaws.services.waf.model.CreateXssMatchSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.createXssMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional create-xss-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteByteMatchSet(byteMatchSetId: String, changeToken: String, init: AWSWAFRegionalDeleteByteMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalDeleteByteMatchSetCommand(byteMatchSetId, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalDeleteByteMatchSetCommand(val byteMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteByteMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteByteMatchSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteByteMatchSetRequest()
		input.setByteMatchSetId(this.byteMatchSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.deleteByteMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-byte-match-set")
				.argument("byte-match-set-id", byteMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteGeoMatchSet(geoMatchSetId: String, changeToken: String, init: AWSWAFRegionalDeleteGeoMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalDeleteGeoMatchSetCommand(geoMatchSetId, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalDeleteGeoMatchSetCommand(val geoMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest()
		input.setGeoMatchSetId(this.geoMatchSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.deleteGeoMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-geo-match-set")
				.argument("geo-match-set-id", geoMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteIPSet(iPSetId: String, changeToken: String, init: AWSWAFRegionalDeleteIPSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalDeleteIPSetCommand(iPSetId, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalDeleteIPSetCommand(val iPSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteIPSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteIPSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteIPSetRequest()
		input.setIPSetId(this.iPSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.deleteIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-ipset")
				.argument("ipset-id", iPSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deletePermissionPolicy(resourceArn: String, init: AWSWAFRegionalDeletePermissionPolicyCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalDeletePermissionPolicyCommand(resourceArn).apply(init))
}

@Generated
class AWSWAFRegionalDeletePermissionPolicyCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeletePermissionPolicyRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeletePermissionPolicyRequest {
		val input = com.amazonaws.services.waf.model.DeletePermissionPolicyRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.deletePermissionPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-permission-policy")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSWAFRegionalFunctions.deleteRateBasedRule(ruleId: String, changeToken: String, init: AWSWAFRegionalDeleteRateBasedRuleCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalDeleteRateBasedRuleCommand(ruleId, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalDeleteRateBasedRuleCommand(val ruleId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest {
		val input = com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest()
		input.setRuleId(this.ruleId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.deleteRateBasedRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-rate-based-rule")
				.argument("rule-id", ruleId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteRegexMatchSet(regexMatchSetId: String, changeToken: String, init: AWSWAFRegionalDeleteRegexMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalDeleteRegexMatchSetCommand(regexMatchSetId, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalDeleteRegexMatchSetCommand(val regexMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest()
		input.setRegexMatchSetId(this.regexMatchSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.deleteRegexMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-regex-match-set")
				.argument("regex-match-set-id", regexMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteRegexPatternSet(regexPatternSetId: String, changeToken: String, init: AWSWAFRegionalDeleteRegexPatternSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalDeleteRegexPatternSetCommand(regexPatternSetId, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalDeleteRegexPatternSetCommand(val regexPatternSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest()
		input.setRegexPatternSetId(this.regexPatternSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.deleteRegexPatternSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-regex-pattern-set")
				.argument("regex-pattern-set-id", regexPatternSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteRule(ruleId: String, changeToken: String, init: AWSWAFRegionalDeleteRuleCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalDeleteRuleCommand(ruleId, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalDeleteRuleCommand(val ruleId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRuleRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteRuleRequest {
		val input = com.amazonaws.services.waf.model.DeleteRuleRequest()
		input.setRuleId(this.ruleId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.deleteRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-rule")
				.argument("rule-id", ruleId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteRuleGroup(ruleGroupId: String, changeToken: String, init: AWSWAFRegionalDeleteRuleGroupCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalDeleteRuleGroupCommand(ruleGroupId, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalDeleteRuleGroupCommand(val ruleGroupId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRuleGroupRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteRuleGroupRequest {
		val input = com.amazonaws.services.waf.model.DeleteRuleGroupRequest()
		input.setRuleGroupId(this.ruleGroupId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.deleteRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-rule-group")
				.argument("rule-group-id", ruleGroupId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteSizeConstraintSet(sizeConstraintSetId: String, changeToken: String, init: AWSWAFRegionalDeleteSizeConstraintSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalDeleteSizeConstraintSetCommand(sizeConstraintSetId, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalDeleteSizeConstraintSetCommand(val sizeConstraintSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest()
		input.setSizeConstraintSetId(this.sizeConstraintSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.deleteSizeConstraintSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-size-constraint-set")
				.argument("size-constraint-set-id", sizeConstraintSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteSqlInjectionMatchSet(sqlInjectionMatchSetId: String, changeToken: String, init: AWSWAFRegionalDeleteSqlInjectionMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalDeleteSqlInjectionMatchSetCommand(sqlInjectionMatchSetId, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalDeleteSqlInjectionMatchSetCommand(val sqlInjectionMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest()
		input.setSqlInjectionMatchSetId(this.sqlInjectionMatchSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.deleteSqlInjectionMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-sql-injection-match-set")
				.argument("sql-injection-match-set-id", sqlInjectionMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteWebACL(webACLId: String, changeToken: String, init: AWSWAFRegionalDeleteWebACLCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalDeleteWebACLCommand(webACLId, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalDeleteWebACLCommand(val webACLId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteWebACLRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteWebACLRequest {
		val input = com.amazonaws.services.waf.model.DeleteWebACLRequest()
		input.setWebACLId(this.webACLId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.deleteWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-web-acl")
				.argument("web-aclid", webACLId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.deleteXssMatchSet(xssMatchSetId: String, changeToken: String, init: AWSWAFRegionalDeleteXssMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalDeleteXssMatchSetCommand(xssMatchSetId, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalDeleteXssMatchSetCommand(val xssMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteXssMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteXssMatchSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteXssMatchSetRequest()
		input.setXssMatchSetId(this.xssMatchSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.deleteXssMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional delete-xss-match-set")
				.argument("xss-match-set-id", xssMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.disassociateWebACL(resourceArn: String, init: AWSWAFRegionalDisassociateWebACLCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalDisassociateWebACLCommand(resourceArn).apply(init))
}

@Generated
class AWSWAFRegionalDisassociateWebACLCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DisassociateWebACLRequest> {



	override fun build(): com.amazonaws.services.waf.model.DisassociateWebACLRequest {
		val input = com.amazonaws.services.waf.model.DisassociateWebACLRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.disassociateWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional disassociate-web-acl")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSWAFRegionalFunctions.getByteMatchSet(byteMatchSetId: String, init: AWSWAFRegionalGetByteMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetByteMatchSetCommand(byteMatchSetId).apply(init))
}

@Generated
class AWSWAFRegionalGetByteMatchSetCommand(val byteMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetByteMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetByteMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetByteMatchSetRequest()
		input.setByteMatchSetId(this.byteMatchSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getByteMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-byte-match-set")
				.argument("byte-match-set-id", byteMatchSetId)
	}

}


fun AWSWAFRegionalFunctions.getChangeToken(init: AWSWAFRegionalGetChangeTokenCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetChangeTokenCommand().apply(init))
}

@Generated
class AWSWAFRegionalGetChangeTokenCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetChangeTokenRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetChangeTokenRequest {
		val input = com.amazonaws.services.waf.model.GetChangeTokenRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getChangeToken(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-change-token")

	}

}


fun AWSWAFRegionalFunctions.getChangeTokenStatus(changeToken: String, init: AWSWAFRegionalGetChangeTokenStatusCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetChangeTokenStatusCommand(changeToken).apply(init))
}

@Generated
class AWSWAFRegionalGetChangeTokenStatusCommand(val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetChangeTokenStatusRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetChangeTokenStatusRequest {
		val input = com.amazonaws.services.waf.model.GetChangeTokenStatusRequest()
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getChangeTokenStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-change-token-status")
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.getGeoMatchSet(geoMatchSetId: String, init: AWSWAFRegionalGetGeoMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetGeoMatchSetCommand(geoMatchSetId).apply(init))
}

@Generated
class AWSWAFRegionalGetGeoMatchSetCommand(val geoMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetGeoMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetGeoMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetGeoMatchSetRequest()
		input.setGeoMatchSetId(this.geoMatchSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getGeoMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-geo-match-set")
				.argument("geo-match-set-id", geoMatchSetId)
	}

}


fun AWSWAFRegionalFunctions.getIPSet(iPSetId: String, init: AWSWAFRegionalGetIPSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetIPSetCommand(iPSetId).apply(init))
}

@Generated
class AWSWAFRegionalGetIPSetCommand(val iPSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetIPSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetIPSetRequest {
		val input = com.amazonaws.services.waf.model.GetIPSetRequest()
		input.setIPSetId(this.iPSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-ipset")
				.argument("ipset-id", iPSetId)
	}

}


fun AWSWAFRegionalFunctions.getPermissionPolicy(resourceArn: String, init: AWSWAFRegionalGetPermissionPolicyCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetPermissionPolicyCommand(resourceArn).apply(init))
}

@Generated
class AWSWAFRegionalGetPermissionPolicyCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetPermissionPolicyRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetPermissionPolicyRequest {
		val input = com.amazonaws.services.waf.model.GetPermissionPolicyRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getPermissionPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-permission-policy")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSWAFRegionalFunctions.getRateBasedRule(ruleId: String, init: AWSWAFRegionalGetRateBasedRuleCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetRateBasedRuleCommand(ruleId).apply(init))
}

@Generated
class AWSWAFRegionalGetRateBasedRuleCommand(val ruleId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRateBasedRuleRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetRateBasedRuleRequest {
		val input = com.amazonaws.services.waf.model.GetRateBasedRuleRequest()
		input.setRuleId(this.ruleId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getRateBasedRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-rate-based-rule")
				.argument("rule-id", ruleId)
	}

}


fun AWSWAFRegionalFunctions.getRateBasedRuleManagedKeys(ruleId: String, init: AWSWAFRegionalGetRateBasedRuleManagedKeysCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetRateBasedRuleManagedKeysCommand(ruleId).apply(init))
}

@Generated
class AWSWAFRegionalGetRateBasedRuleManagedKeysCommand(val ruleId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest> {

	var nextMarker: String? = null

	override fun build(): com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest {
		val input = com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest()
		input.setRuleId(this.ruleId)
		input.setNextMarker(this.nextMarker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getRateBasedRuleManagedKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-rate-based-rule-managed-keys")
				.argument("rule-id", ruleId)
				.argument("next-marker", nextMarker)
	}

}


fun AWSWAFRegionalFunctions.getRegexMatchSet(regexMatchSetId: String, init: AWSWAFRegionalGetRegexMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetRegexMatchSetCommand(regexMatchSetId).apply(init))
}

@Generated
class AWSWAFRegionalGetRegexMatchSetCommand(val regexMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRegexMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetRegexMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetRegexMatchSetRequest()
		input.setRegexMatchSetId(this.regexMatchSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getRegexMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-regex-match-set")
				.argument("regex-match-set-id", regexMatchSetId)
	}

}


fun AWSWAFRegionalFunctions.getRegexPatternSet(regexPatternSetId: String, init: AWSWAFRegionalGetRegexPatternSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetRegexPatternSetCommand(regexPatternSetId).apply(init))
}

@Generated
class AWSWAFRegionalGetRegexPatternSetCommand(val regexPatternSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRegexPatternSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetRegexPatternSetRequest {
		val input = com.amazonaws.services.waf.model.GetRegexPatternSetRequest()
		input.setRegexPatternSetId(this.regexPatternSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getRegexPatternSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-regex-pattern-set")
				.argument("regex-pattern-set-id", regexPatternSetId)
	}

}


fun AWSWAFRegionalFunctions.getRule(ruleId: String, init: AWSWAFRegionalGetRuleCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetRuleCommand(ruleId).apply(init))
}

@Generated
class AWSWAFRegionalGetRuleCommand(val ruleId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRuleRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetRuleRequest {
		val input = com.amazonaws.services.waf.model.GetRuleRequest()
		input.setRuleId(this.ruleId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-rule")
				.argument("rule-id", ruleId)
	}

}


fun AWSWAFRegionalFunctions.getRuleGroup(ruleGroupId: String, init: AWSWAFRegionalGetRuleGroupCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetRuleGroupCommand(ruleGroupId).apply(init))
}

@Generated
class AWSWAFRegionalGetRuleGroupCommand(val ruleGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRuleGroupRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetRuleGroupRequest {
		val input = com.amazonaws.services.waf.model.GetRuleGroupRequest()
		input.setRuleGroupId(this.ruleGroupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-rule-group")
				.argument("rule-group-id", ruleGroupId)
	}

}


fun AWSWAFRegionalFunctions.getSampledRequests(webAclId: String, ruleId: String, timeWindow: com.amazonaws.services.waf.model.TimeWindow, maxItems: Long, init: AWSWAFRegionalGetSampledRequestsCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetSampledRequestsCommand(webAclId, ruleId, timeWindow, maxItems).apply(init))
}

@Generated
class AWSWAFRegionalGetSampledRequestsCommand(val webAclId: String, val ruleId: String, val timeWindow: com.amazonaws.services.waf.model.TimeWindow, val maxItems: Long) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetSampledRequestsRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetSampledRequestsRequest {
		val input = com.amazonaws.services.waf.model.GetSampledRequestsRequest()
		input.setWebAclId(this.webAclId)
		input.setRuleId(this.ruleId)
		input.setTimeWindow(this.timeWindow)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getSampledRequests(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-sampled-requests")
				.argument("web-acl-id", webAclId)
				.argument("rule-id", ruleId)
				.argument("time-window", timeWindow.toString())
				.argument("max-items", maxItems.toString())
	}

}


fun AWSWAFRegionalFunctions.getSizeConstraintSet(sizeConstraintSetId: String, init: AWSWAFRegionalGetSizeConstraintSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetSizeConstraintSetCommand(sizeConstraintSetId).apply(init))
}

@Generated
class AWSWAFRegionalGetSizeConstraintSetCommand(val sizeConstraintSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetSizeConstraintSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetSizeConstraintSetRequest {
		val input = com.amazonaws.services.waf.model.GetSizeConstraintSetRequest()
		input.setSizeConstraintSetId(this.sizeConstraintSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getSizeConstraintSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-size-constraint-set")
				.argument("size-constraint-set-id", sizeConstraintSetId)
	}

}


fun AWSWAFRegionalFunctions.getSqlInjectionMatchSet(sqlInjectionMatchSetId: String, init: AWSWAFRegionalGetSqlInjectionMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetSqlInjectionMatchSetCommand(sqlInjectionMatchSetId).apply(init))
}

@Generated
class AWSWAFRegionalGetSqlInjectionMatchSetCommand(val sqlInjectionMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest()
		input.setSqlInjectionMatchSetId(this.sqlInjectionMatchSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getSqlInjectionMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-sql-injection-match-set")
				.argument("sql-injection-match-set-id", sqlInjectionMatchSetId)
	}

}


fun AWSWAFRegionalFunctions.getWebACL(webACLId: String, init: AWSWAFRegionalGetWebACLCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetWebACLCommand(webACLId).apply(init))
}

@Generated
class AWSWAFRegionalGetWebACLCommand(val webACLId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetWebACLRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetWebACLRequest {
		val input = com.amazonaws.services.waf.model.GetWebACLRequest()
		input.setWebACLId(this.webACLId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-web-acl")
				.argument("web-aclid", webACLId)
	}

}


fun AWSWAFRegionalFunctions.getWebACLForResource(resourceArn: String, init: AWSWAFRegionalGetWebACLForResourceCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetWebACLForResourceCommand(resourceArn).apply(init))
}

@Generated
class AWSWAFRegionalGetWebACLForResourceCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetWebACLForResourceRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetWebACLForResourceRequest {
		val input = com.amazonaws.services.waf.model.GetWebACLForResourceRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getWebACLForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-web-aclfor-resource")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSWAFRegionalFunctions.getXssMatchSet(xssMatchSetId: String, init: AWSWAFRegionalGetXssMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalGetXssMatchSetCommand(xssMatchSetId).apply(init))
}

@Generated
class AWSWAFRegionalGetXssMatchSetCommand(val xssMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetXssMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetXssMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetXssMatchSetRequest()
		input.setXssMatchSetId(this.xssMatchSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.getXssMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional get-xss-match-set")
				.argument("xss-match-set-id", xssMatchSetId)
	}

}


fun AWSWAFRegionalFunctions.listActivatedRulesInRuleGroup(init: AWSWAFRegionalListActivatedRulesInRuleGroupCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalListActivatedRulesInRuleGroupCommand().apply(init))
}

@Generated
class AWSWAFRegionalListActivatedRulesInRuleGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.listActivatedRulesInRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-activated-rules-in-rule-group")
				.argument("rule-group-id", ruleGroupId)
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listByteMatchSets(init: AWSWAFRegionalListByteMatchSetsCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalListByteMatchSetsCommand().apply(init))
}

@Generated
class AWSWAFRegionalListByteMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListByteMatchSetsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListByteMatchSetsRequest {
		val input = com.amazonaws.services.waf.model.ListByteMatchSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.listByteMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-byte-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listGeoMatchSets(init: AWSWAFRegionalListGeoMatchSetsCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalListGeoMatchSetsCommand().apply(init))
}

@Generated
class AWSWAFRegionalListGeoMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListGeoMatchSetsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListGeoMatchSetsRequest {
		val input = com.amazonaws.services.waf.model.ListGeoMatchSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.listGeoMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-geo-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listIPSets(init: AWSWAFRegionalListIPSetsCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalListIPSetsCommand().apply(init))
}

@Generated
class AWSWAFRegionalListIPSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListIPSetsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListIPSetsRequest {
		val input = com.amazonaws.services.waf.model.ListIPSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.listIPSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-ipsets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listRateBasedRules(init: AWSWAFRegionalListRateBasedRulesCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalListRateBasedRulesCommand().apply(init))
}

@Generated
class AWSWAFRegionalListRateBasedRulesCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRateBasedRulesRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListRateBasedRulesRequest {
		val input = com.amazonaws.services.waf.model.ListRateBasedRulesRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.listRateBasedRules(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-rate-based-rules")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listRegexMatchSets(init: AWSWAFRegionalListRegexMatchSetsCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalListRegexMatchSetsCommand().apply(init))
}

@Generated
class AWSWAFRegionalListRegexMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRegexMatchSetsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListRegexMatchSetsRequest {
		val input = com.amazonaws.services.waf.model.ListRegexMatchSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.listRegexMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-regex-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listRegexPatternSets(init: AWSWAFRegionalListRegexPatternSetsCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalListRegexPatternSetsCommand().apply(init))
}

@Generated
class AWSWAFRegionalListRegexPatternSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRegexPatternSetsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListRegexPatternSetsRequest {
		val input = com.amazonaws.services.waf.model.ListRegexPatternSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.listRegexPatternSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-regex-pattern-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listResourcesForWebACL(webACLId: String, init: AWSWAFRegionalListResourcesForWebACLCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalListResourcesForWebACLCommand(webACLId).apply(init))
}

@Generated
class AWSWAFRegionalListResourcesForWebACLCommand(val webACLId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListResourcesForWebACLRequest> {



	override fun build(): com.amazonaws.services.waf.model.ListResourcesForWebACLRequest {
		val input = com.amazonaws.services.waf.model.ListResourcesForWebACLRequest()
		input.setWebACLId(this.webACLId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.listResourcesForWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-resources-for-web-acl")
				.argument("web-aclid", webACLId)
	}

}


fun AWSWAFRegionalFunctions.listRuleGroups(init: AWSWAFRegionalListRuleGroupsCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalListRuleGroupsCommand().apply(init))
}

@Generated
class AWSWAFRegionalListRuleGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRuleGroupsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListRuleGroupsRequest {
		val input = com.amazonaws.services.waf.model.ListRuleGroupsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.listRuleGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-rule-groups")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listRules(init: AWSWAFRegionalListRulesCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalListRulesCommand().apply(init))
}

@Generated
class AWSWAFRegionalListRulesCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRulesRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListRulesRequest {
		val input = com.amazonaws.services.waf.model.ListRulesRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.listRules(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-rules")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listSizeConstraintSets(init: AWSWAFRegionalListSizeConstraintSetsCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalListSizeConstraintSetsCommand().apply(init))
}

@Generated
class AWSWAFRegionalListSizeConstraintSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest {
		val input = com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.listSizeConstraintSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-size-constraint-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listSqlInjectionMatchSets(init: AWSWAFRegionalListSqlInjectionMatchSetsCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalListSqlInjectionMatchSetsCommand().apply(init))
}

@Generated
class AWSWAFRegionalListSqlInjectionMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest {
		val input = com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.listSqlInjectionMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-sql-injection-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listSubscribedRuleGroups(init: AWSWAFRegionalListSubscribedRuleGroupsCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalListSubscribedRuleGroupsCommand().apply(init))
}

@Generated
class AWSWAFRegionalListSubscribedRuleGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest {
		val input = com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.listSubscribedRuleGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-subscribed-rule-groups")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listWebACLs(init: AWSWAFRegionalListWebACLsCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalListWebACLsCommand().apply(init))
}

@Generated
class AWSWAFRegionalListWebACLsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListWebACLsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListWebACLsRequest {
		val input = com.amazonaws.services.waf.model.ListWebACLsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.listWebACLs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-web-acls")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.listXssMatchSets(init: AWSWAFRegionalListXssMatchSetsCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalListXssMatchSetsCommand().apply(init))
}

@Generated
class AWSWAFRegionalListXssMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListXssMatchSetsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListXssMatchSetsRequest {
		val input = com.amazonaws.services.waf.model.ListXssMatchSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.listXssMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional list-xss-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFRegionalFunctions.putPermissionPolicy(resourceArn: String, policy: String, init: AWSWAFRegionalPutPermissionPolicyCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalPutPermissionPolicyCommand(resourceArn, policy).apply(init))
}

@Generated
class AWSWAFRegionalPutPermissionPolicyCommand(val resourceArn: String, val policy: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.PutPermissionPolicyRequest> {



	override fun build(): com.amazonaws.services.waf.model.PutPermissionPolicyRequest {
		val input = com.amazonaws.services.waf.model.PutPermissionPolicyRequest()
		input.setResourceArn(this.resourceArn)
		input.setPolicy(this.policy)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.putPermissionPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional put-permission-policy")
				.argument("resource-arn", resourceArn)
				.argument("policy", policy)
	}

}


fun AWSWAFRegionalFunctions.updateByteMatchSet(byteMatchSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.ByteMatchSetUpdate>, init: AWSWAFRegionalUpdateByteMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalUpdateByteMatchSetCommand(byteMatchSetId, changeToken, updates).apply(init))
}

@Generated
class AWSWAFRegionalUpdateByteMatchSetCommand(val byteMatchSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.ByteMatchSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateByteMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateByteMatchSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateByteMatchSetRequest()
		input.setByteMatchSetId(this.byteMatchSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.updateByteMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-byte-match-set")
				.argument("byte-match-set-id", byteMatchSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFRegionalFunctions.updateGeoMatchSet(geoMatchSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.GeoMatchSetUpdate>, init: AWSWAFRegionalUpdateGeoMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalUpdateGeoMatchSetCommand(geoMatchSetId, changeToken, updates).apply(init))
}

@Generated
class AWSWAFRegionalUpdateGeoMatchSetCommand(val geoMatchSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.GeoMatchSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest()
		input.setGeoMatchSetId(this.geoMatchSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.updateGeoMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-geo-match-set")
				.argument("geo-match-set-id", geoMatchSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFRegionalFunctions.updateIPSet(iPSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.IPSetUpdate>, init: AWSWAFRegionalUpdateIPSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalUpdateIPSetCommand(iPSetId, changeToken, updates).apply(init))
}

@Generated
class AWSWAFRegionalUpdateIPSetCommand(val iPSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.IPSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateIPSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateIPSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateIPSetRequest()
		input.setIPSetId(this.iPSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.updateIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-ipset")
				.argument("ipset-id", iPSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFRegionalFunctions.updateRateBasedRule(ruleId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.RuleUpdate>, rateLimit: Long, init: AWSWAFRegionalUpdateRateBasedRuleCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalUpdateRateBasedRuleCommand(ruleId, changeToken, updates, rateLimit).apply(init))
}

@Generated
class AWSWAFRegionalUpdateRateBasedRuleCommand(val ruleId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.RuleUpdate>, val rateLimit: Long) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest {
		val input = com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest()
		input.setRuleId(this.ruleId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		input.setRateLimit(this.rateLimit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.updateRateBasedRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-rate-based-rule")
				.argument("rule-id", ruleId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
				.argument("rate-limit", rateLimit.toString())
	}

}


fun AWSWAFRegionalFunctions.updateRegexMatchSet(regexMatchSetId: String, updates: List<com.amazonaws.services.waf.model.RegexMatchSetUpdate>, changeToken: String, init: AWSWAFRegionalUpdateRegexMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalUpdateRegexMatchSetCommand(regexMatchSetId, updates, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalUpdateRegexMatchSetCommand(val regexMatchSetId: String, val updates: List<com.amazonaws.services.waf.model.RegexMatchSetUpdate>, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest()
		input.setRegexMatchSetId(this.regexMatchSetId)
		input.setUpdates(this.updates)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.updateRegexMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-regex-match-set")
				.argument("regex-match-set-id", regexMatchSetId)
				.argument("updates", updates.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.updateRegexPatternSet(regexPatternSetId: String, updates: List<com.amazonaws.services.waf.model.RegexPatternSetUpdate>, changeToken: String, init: AWSWAFRegionalUpdateRegexPatternSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalUpdateRegexPatternSetCommand(regexPatternSetId, updates, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalUpdateRegexPatternSetCommand(val regexPatternSetId: String, val updates: List<com.amazonaws.services.waf.model.RegexPatternSetUpdate>, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest()
		input.setRegexPatternSetId(this.regexPatternSetId)
		input.setUpdates(this.updates)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.updateRegexPatternSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-regex-pattern-set")
				.argument("regex-pattern-set-id", regexPatternSetId)
				.argument("updates", updates.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.updateRule(ruleId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.RuleUpdate>, init: AWSWAFRegionalUpdateRuleCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalUpdateRuleCommand(ruleId, changeToken, updates).apply(init))
}

@Generated
class AWSWAFRegionalUpdateRuleCommand(val ruleId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.RuleUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRuleRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateRuleRequest {
		val input = com.amazonaws.services.waf.model.UpdateRuleRequest()
		input.setRuleId(this.ruleId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.updateRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-rule")
				.argument("rule-id", ruleId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFRegionalFunctions.updateRuleGroup(ruleGroupId: String, updates: List<com.amazonaws.services.waf.model.RuleGroupUpdate>, changeToken: String, init: AWSWAFRegionalUpdateRuleGroupCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalUpdateRuleGroupCommand(ruleGroupId, updates, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalUpdateRuleGroupCommand(val ruleGroupId: String, val updates: List<com.amazonaws.services.waf.model.RuleGroupUpdate>, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRuleGroupRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateRuleGroupRequest {
		val input = com.amazonaws.services.waf.model.UpdateRuleGroupRequest()
		input.setRuleGroupId(this.ruleGroupId)
		input.setUpdates(this.updates)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.updateRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-rule-group")
				.argument("rule-group-id", ruleGroupId)
				.argument("updates", updates.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFRegionalFunctions.updateSizeConstraintSet(sizeConstraintSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.SizeConstraintSetUpdate>, init: AWSWAFRegionalUpdateSizeConstraintSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalUpdateSizeConstraintSetCommand(sizeConstraintSetId, changeToken, updates).apply(init))
}

@Generated
class AWSWAFRegionalUpdateSizeConstraintSetCommand(val sizeConstraintSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.SizeConstraintSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest()
		input.setSizeConstraintSetId(this.sizeConstraintSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.updateSizeConstraintSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-size-constraint-set")
				.argument("size-constraint-set-id", sizeConstraintSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFRegionalFunctions.updateSqlInjectionMatchSet(sqlInjectionMatchSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.SqlInjectionMatchSetUpdate>, init: AWSWAFRegionalUpdateSqlInjectionMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalUpdateSqlInjectionMatchSetCommand(sqlInjectionMatchSetId, changeToken, updates).apply(init))
}

@Generated
class AWSWAFRegionalUpdateSqlInjectionMatchSetCommand(val sqlInjectionMatchSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.SqlInjectionMatchSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest()
		input.setSqlInjectionMatchSetId(this.sqlInjectionMatchSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.updateSqlInjectionMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-sql-injection-match-set")
				.argument("sql-injection-match-set-id", sqlInjectionMatchSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFRegionalFunctions.updateWebACL(webACLId: String, changeToken: String, init: AWSWAFRegionalUpdateWebACLCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalUpdateWebACLCommand(webACLId, changeToken).apply(init))
}

@Generated
class AWSWAFRegionalUpdateWebACLCommand(val webACLId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateWebACLRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.updateWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-web-acl")
				.argument("web-aclid", webACLId)
				.argument("change-token", changeToken)
				.argument("updates", updates?.toString())
				.argument("default-action", defaultAction?.toString())
	}

}


fun AWSWAFRegionalFunctions.updateXssMatchSet(xssMatchSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.XssMatchSetUpdate>, init: AWSWAFRegionalUpdateXssMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFRegionalUpdateXssMatchSetCommand(xssMatchSetId, changeToken, updates).apply(init))
}

@Generated
class AWSWAFRegionalUpdateXssMatchSetCommand(val xssMatchSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.XssMatchSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateXssMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateXssMatchSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateXssMatchSetRequest()
		input.setXssMatchSetId(this.xssMatchSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf_regional.updateXssMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf-regional update-xss-match-set")
				.argument("xss-match-set-id", xssMatchSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}
