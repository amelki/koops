
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

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

infix fun AwsContinuation.waf(init: AWSWAFFunctions.() -> Unit) {
	AWSWAFFunctions(shell).apply(init)
}

			

fun AWSWAFFunctions.createByteMatchSet(name: String, changeToken: String, init: AWSWAFCreateByteMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFCreateByteMatchSetCommand(name, changeToken).apply(init))
}

@Generated
class AWSWAFCreateByteMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateByteMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateByteMatchSetRequest {
		val input = com.amazonaws.services.waf.model.CreateByteMatchSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.createByteMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-byte-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createGeoMatchSet(name: String, changeToken: String, init: AWSWAFCreateGeoMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFCreateGeoMatchSetCommand(name, changeToken).apply(init))
}

@Generated
class AWSWAFCreateGeoMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateGeoMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateGeoMatchSetRequest {
		val input = com.amazonaws.services.waf.model.CreateGeoMatchSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.createGeoMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-geo-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createIPSet(name: String, changeToken: String, init: AWSWAFCreateIPSetCommand.() -> Unit) {
	this.block.declare(AWSWAFCreateIPSetCommand(name, changeToken).apply(init))
}

@Generated
class AWSWAFCreateIPSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateIPSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateIPSetRequest {
		val input = com.amazonaws.services.waf.model.CreateIPSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.createIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-ipset")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createRateBasedRule(name: String, metricName: String, rateKey: RateKey, rateLimit: Long, changeToken: String, init: AWSWAFCreateRateBasedRuleCommand.() -> Unit) {
	this.block.declare(AWSWAFCreateRateBasedRuleCommand(name, metricName, rateKey, rateLimit, changeToken).apply(init))
}

@Generated
class AWSWAFCreateRateBasedRuleCommand(val name: String, val metricName: String, val rateKey: RateKey, val rateLimit: Long, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRateBasedRuleRequest> {



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
		environment.waf.createRateBasedRule(build())
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


fun AWSWAFFunctions.createRegexMatchSet(name: String, changeToken: String, init: AWSWAFCreateRegexMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFCreateRegexMatchSetCommand(name, changeToken).apply(init))
}

@Generated
class AWSWAFCreateRegexMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRegexMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateRegexMatchSetRequest {
		val input = com.amazonaws.services.waf.model.CreateRegexMatchSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.createRegexMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-regex-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createRegexPatternSet(name: String, changeToken: String, init: AWSWAFCreateRegexPatternSetCommand.() -> Unit) {
	this.block.declare(AWSWAFCreateRegexPatternSetCommand(name, changeToken).apply(init))
}

@Generated
class AWSWAFCreateRegexPatternSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRegexPatternSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateRegexPatternSetRequest {
		val input = com.amazonaws.services.waf.model.CreateRegexPatternSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.createRegexPatternSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-regex-pattern-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createRule(name: String, metricName: String, changeToken: String, init: AWSWAFCreateRuleCommand.() -> Unit) {
	this.block.declare(AWSWAFCreateRuleCommand(name, metricName, changeToken).apply(init))
}

@Generated
class AWSWAFCreateRuleCommand(val name: String, val metricName: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRuleRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateRuleRequest {
		val input = com.amazonaws.services.waf.model.CreateRuleRequest()
		input.setName(this.name)
		input.setMetricName(this.metricName)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.createRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-rule")
				.argument("name", name)
				.argument("metric-name", metricName)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createRuleGroup(name: String, metricName: String, changeToken: String, init: AWSWAFCreateRuleGroupCommand.() -> Unit) {
	this.block.declare(AWSWAFCreateRuleGroupCommand(name, metricName, changeToken).apply(init))
}

@Generated
class AWSWAFCreateRuleGroupCommand(val name: String, val metricName: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateRuleGroupRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateRuleGroupRequest {
		val input = com.amazonaws.services.waf.model.CreateRuleGroupRequest()
		input.setName(this.name)
		input.setMetricName(this.metricName)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.createRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-rule-group")
				.argument("name", name)
				.argument("metric-name", metricName)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createSizeConstraintSet(name: String, changeToken: String, init: AWSWAFCreateSizeConstraintSetCommand.() -> Unit) {
	this.block.declare(AWSWAFCreateSizeConstraintSetCommand(name, changeToken).apply(init))
}

@Generated
class AWSWAFCreateSizeConstraintSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest {
		val input = com.amazonaws.services.waf.model.CreateSizeConstraintSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.createSizeConstraintSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-size-constraint-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createSqlInjectionMatchSet(name: String, changeToken: String, init: AWSWAFCreateSqlInjectionMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFCreateSqlInjectionMatchSetCommand(name, changeToken).apply(init))
}

@Generated
class AWSWAFCreateSqlInjectionMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest {
		val input = com.amazonaws.services.waf.model.CreateSqlInjectionMatchSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.createSqlInjectionMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-sql-injection-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createWebACL(name: String, metricName: String, defaultAction: com.amazonaws.services.waf.model.WafAction, changeToken: String, init: AWSWAFCreateWebACLCommand.() -> Unit) {
	this.block.declare(AWSWAFCreateWebACLCommand(name, metricName, defaultAction, changeToken).apply(init))
}

@Generated
class AWSWAFCreateWebACLCommand(val name: String, val metricName: String, val defaultAction: com.amazonaws.services.waf.model.WafAction, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateWebACLRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateWebACLRequest {
		val input = com.amazonaws.services.waf.model.CreateWebACLRequest()
		input.setName(this.name)
		input.setMetricName(this.metricName)
		input.setDefaultAction(this.defaultAction)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.createWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-web-acl")
				.argument("name", name)
				.argument("metric-name", metricName)
				.argument("default-action", defaultAction.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.createXssMatchSet(name: String, changeToken: String, init: AWSWAFCreateXssMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFCreateXssMatchSetCommand(name, changeToken).apply(init))
}

@Generated
class AWSWAFCreateXssMatchSetCommand(val name: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.CreateXssMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.CreateXssMatchSetRequest {
		val input = com.amazonaws.services.waf.model.CreateXssMatchSetRequest()
		input.setName(this.name)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.createXssMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf create-xss-match-set")
				.argument("name", name)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteByteMatchSet(byteMatchSetId: String, changeToken: String, init: AWSWAFDeleteByteMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFDeleteByteMatchSetCommand(byteMatchSetId, changeToken).apply(init))
}

@Generated
class AWSWAFDeleteByteMatchSetCommand(val byteMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteByteMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteByteMatchSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteByteMatchSetRequest()
		input.setByteMatchSetId(this.byteMatchSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.deleteByteMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-byte-match-set")
				.argument("byte-match-set-id", byteMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteGeoMatchSet(geoMatchSetId: String, changeToken: String, init: AWSWAFDeleteGeoMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFDeleteGeoMatchSetCommand(geoMatchSetId, changeToken).apply(init))
}

@Generated
class AWSWAFDeleteGeoMatchSetCommand(val geoMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteGeoMatchSetRequest()
		input.setGeoMatchSetId(this.geoMatchSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.deleteGeoMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-geo-match-set")
				.argument("geo-match-set-id", geoMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteIPSet(iPSetId: String, changeToken: String, init: AWSWAFDeleteIPSetCommand.() -> Unit) {
	this.block.declare(AWSWAFDeleteIPSetCommand(iPSetId, changeToken).apply(init))
}

@Generated
class AWSWAFDeleteIPSetCommand(val iPSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteIPSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteIPSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteIPSetRequest()
		input.setIPSetId(this.iPSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.deleteIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-ipset")
				.argument("ipset-id", iPSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deletePermissionPolicy(resourceArn: String, init: AWSWAFDeletePermissionPolicyCommand.() -> Unit) {
	this.block.declare(AWSWAFDeletePermissionPolicyCommand(resourceArn).apply(init))
}

@Generated
class AWSWAFDeletePermissionPolicyCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeletePermissionPolicyRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeletePermissionPolicyRequest {
		val input = com.amazonaws.services.waf.model.DeletePermissionPolicyRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.deletePermissionPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-permission-policy")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSWAFFunctions.deleteRateBasedRule(ruleId: String, changeToken: String, init: AWSWAFDeleteRateBasedRuleCommand.() -> Unit) {
	this.block.declare(AWSWAFDeleteRateBasedRuleCommand(ruleId, changeToken).apply(init))
}

@Generated
class AWSWAFDeleteRateBasedRuleCommand(val ruleId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest {
		val input = com.amazonaws.services.waf.model.DeleteRateBasedRuleRequest()
		input.setRuleId(this.ruleId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.deleteRateBasedRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-rate-based-rule")
				.argument("rule-id", ruleId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteRegexMatchSet(regexMatchSetId: String, changeToken: String, init: AWSWAFDeleteRegexMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFDeleteRegexMatchSetCommand(regexMatchSetId, changeToken).apply(init))
}

@Generated
class AWSWAFDeleteRegexMatchSetCommand(val regexMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteRegexMatchSetRequest()
		input.setRegexMatchSetId(this.regexMatchSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.deleteRegexMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-regex-match-set")
				.argument("regex-match-set-id", regexMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteRegexPatternSet(regexPatternSetId: String, changeToken: String, init: AWSWAFDeleteRegexPatternSetCommand.() -> Unit) {
	this.block.declare(AWSWAFDeleteRegexPatternSetCommand(regexPatternSetId, changeToken).apply(init))
}

@Generated
class AWSWAFDeleteRegexPatternSetCommand(val regexPatternSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteRegexPatternSetRequest()
		input.setRegexPatternSetId(this.regexPatternSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.deleteRegexPatternSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-regex-pattern-set")
				.argument("regex-pattern-set-id", regexPatternSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteRule(ruleId: String, changeToken: String, init: AWSWAFDeleteRuleCommand.() -> Unit) {
	this.block.declare(AWSWAFDeleteRuleCommand(ruleId, changeToken).apply(init))
}

@Generated
class AWSWAFDeleteRuleCommand(val ruleId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRuleRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteRuleRequest {
		val input = com.amazonaws.services.waf.model.DeleteRuleRequest()
		input.setRuleId(this.ruleId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.deleteRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-rule")
				.argument("rule-id", ruleId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteRuleGroup(ruleGroupId: String, changeToken: String, init: AWSWAFDeleteRuleGroupCommand.() -> Unit) {
	this.block.declare(AWSWAFDeleteRuleGroupCommand(ruleGroupId, changeToken).apply(init))
}

@Generated
class AWSWAFDeleteRuleGroupCommand(val ruleGroupId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteRuleGroupRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteRuleGroupRequest {
		val input = com.amazonaws.services.waf.model.DeleteRuleGroupRequest()
		input.setRuleGroupId(this.ruleGroupId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.deleteRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-rule-group")
				.argument("rule-group-id", ruleGroupId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteSizeConstraintSet(sizeConstraintSetId: String, changeToken: String, init: AWSWAFDeleteSizeConstraintSetCommand.() -> Unit) {
	this.block.declare(AWSWAFDeleteSizeConstraintSetCommand(sizeConstraintSetId, changeToken).apply(init))
}

@Generated
class AWSWAFDeleteSizeConstraintSetCommand(val sizeConstraintSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteSizeConstraintSetRequest()
		input.setSizeConstraintSetId(this.sizeConstraintSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.deleteSizeConstraintSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-size-constraint-set")
				.argument("size-constraint-set-id", sizeConstraintSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteSqlInjectionMatchSet(sqlInjectionMatchSetId: String, changeToken: String, init: AWSWAFDeleteSqlInjectionMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFDeleteSqlInjectionMatchSetCommand(sqlInjectionMatchSetId, changeToken).apply(init))
}

@Generated
class AWSWAFDeleteSqlInjectionMatchSetCommand(val sqlInjectionMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteSqlInjectionMatchSetRequest()
		input.setSqlInjectionMatchSetId(this.sqlInjectionMatchSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.deleteSqlInjectionMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-sql-injection-match-set")
				.argument("sql-injection-match-set-id", sqlInjectionMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteWebACL(webACLId: String, changeToken: String, init: AWSWAFDeleteWebACLCommand.() -> Unit) {
	this.block.declare(AWSWAFDeleteWebACLCommand(webACLId, changeToken).apply(init))
}

@Generated
class AWSWAFDeleteWebACLCommand(val webACLId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteWebACLRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteWebACLRequest {
		val input = com.amazonaws.services.waf.model.DeleteWebACLRequest()
		input.setWebACLId(this.webACLId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.deleteWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-web-acl")
				.argument("web-aclid", webACLId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.deleteXssMatchSet(xssMatchSetId: String, changeToken: String, init: AWSWAFDeleteXssMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFDeleteXssMatchSetCommand(xssMatchSetId, changeToken).apply(init))
}

@Generated
class AWSWAFDeleteXssMatchSetCommand(val xssMatchSetId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.DeleteXssMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.DeleteXssMatchSetRequest {
		val input = com.amazonaws.services.waf.model.DeleteXssMatchSetRequest()
		input.setXssMatchSetId(this.xssMatchSetId)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.deleteXssMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf delete-xss-match-set")
				.argument("xss-match-set-id", xssMatchSetId)
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.getByteMatchSet(byteMatchSetId: String, init: AWSWAFGetByteMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFGetByteMatchSetCommand(byteMatchSetId).apply(init))
}

@Generated
class AWSWAFGetByteMatchSetCommand(val byteMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetByteMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetByteMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetByteMatchSetRequest()
		input.setByteMatchSetId(this.byteMatchSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getByteMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-byte-match-set")
				.argument("byte-match-set-id", byteMatchSetId)
	}

}


fun AWSWAFFunctions.getChangeToken(init: AWSWAFGetChangeTokenCommand.() -> Unit) {
	this.block.declare(AWSWAFGetChangeTokenCommand().apply(init))
}

@Generated
class AWSWAFGetChangeTokenCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetChangeTokenRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetChangeTokenRequest {
		val input = com.amazonaws.services.waf.model.GetChangeTokenRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getChangeToken(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-change-token")

	}

}


fun AWSWAFFunctions.getChangeTokenStatus(changeToken: String, init: AWSWAFGetChangeTokenStatusCommand.() -> Unit) {
	this.block.declare(AWSWAFGetChangeTokenStatusCommand(changeToken).apply(init))
}

@Generated
class AWSWAFGetChangeTokenStatusCommand(val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetChangeTokenStatusRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetChangeTokenStatusRequest {
		val input = com.amazonaws.services.waf.model.GetChangeTokenStatusRequest()
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getChangeTokenStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-change-token-status")
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.getGeoMatchSet(geoMatchSetId: String, init: AWSWAFGetGeoMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFGetGeoMatchSetCommand(geoMatchSetId).apply(init))
}

@Generated
class AWSWAFGetGeoMatchSetCommand(val geoMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetGeoMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetGeoMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetGeoMatchSetRequest()
		input.setGeoMatchSetId(this.geoMatchSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getGeoMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-geo-match-set")
				.argument("geo-match-set-id", geoMatchSetId)
	}

}


fun AWSWAFFunctions.getIPSet(iPSetId: String, init: AWSWAFGetIPSetCommand.() -> Unit) {
	this.block.declare(AWSWAFGetIPSetCommand(iPSetId).apply(init))
}

@Generated
class AWSWAFGetIPSetCommand(val iPSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetIPSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetIPSetRequest {
		val input = com.amazonaws.services.waf.model.GetIPSetRequest()
		input.setIPSetId(this.iPSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-ipset")
				.argument("ipset-id", iPSetId)
	}

}


fun AWSWAFFunctions.getPermissionPolicy(resourceArn: String, init: AWSWAFGetPermissionPolicyCommand.() -> Unit) {
	this.block.declare(AWSWAFGetPermissionPolicyCommand(resourceArn).apply(init))
}

@Generated
class AWSWAFGetPermissionPolicyCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetPermissionPolicyRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetPermissionPolicyRequest {
		val input = com.amazonaws.services.waf.model.GetPermissionPolicyRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getPermissionPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-permission-policy")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSWAFFunctions.getRateBasedRule(ruleId: String, init: AWSWAFGetRateBasedRuleCommand.() -> Unit) {
	this.block.declare(AWSWAFGetRateBasedRuleCommand(ruleId).apply(init))
}

@Generated
class AWSWAFGetRateBasedRuleCommand(val ruleId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRateBasedRuleRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetRateBasedRuleRequest {
		val input = com.amazonaws.services.waf.model.GetRateBasedRuleRequest()
		input.setRuleId(this.ruleId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getRateBasedRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-rate-based-rule")
				.argument("rule-id", ruleId)
	}

}


fun AWSWAFFunctions.getRateBasedRuleManagedKeys(ruleId: String, init: AWSWAFGetRateBasedRuleManagedKeysCommand.() -> Unit) {
	this.block.declare(AWSWAFGetRateBasedRuleManagedKeysCommand(ruleId).apply(init))
}

@Generated
class AWSWAFGetRateBasedRuleManagedKeysCommand(val ruleId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest> {

	var nextMarker: String? = null

	override fun build(): com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest {
		val input = com.amazonaws.services.waf.model.GetRateBasedRuleManagedKeysRequest()
		input.setRuleId(this.ruleId)
		input.setNextMarker(this.nextMarker)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getRateBasedRuleManagedKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-rate-based-rule-managed-keys")
				.argument("rule-id", ruleId)
				.argument("next-marker", nextMarker)
	}

}


fun AWSWAFFunctions.getRegexMatchSet(regexMatchSetId: String, init: AWSWAFGetRegexMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFGetRegexMatchSetCommand(regexMatchSetId).apply(init))
}

@Generated
class AWSWAFGetRegexMatchSetCommand(val regexMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRegexMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetRegexMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetRegexMatchSetRequest()
		input.setRegexMatchSetId(this.regexMatchSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getRegexMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-regex-match-set")
				.argument("regex-match-set-id", regexMatchSetId)
	}

}


fun AWSWAFFunctions.getRegexPatternSet(regexPatternSetId: String, init: AWSWAFGetRegexPatternSetCommand.() -> Unit) {
	this.block.declare(AWSWAFGetRegexPatternSetCommand(regexPatternSetId).apply(init))
}

@Generated
class AWSWAFGetRegexPatternSetCommand(val regexPatternSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRegexPatternSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetRegexPatternSetRequest {
		val input = com.amazonaws.services.waf.model.GetRegexPatternSetRequest()
		input.setRegexPatternSetId(this.regexPatternSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getRegexPatternSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-regex-pattern-set")
				.argument("regex-pattern-set-id", regexPatternSetId)
	}

}


fun AWSWAFFunctions.getRule(ruleId: String, init: AWSWAFGetRuleCommand.() -> Unit) {
	this.block.declare(AWSWAFGetRuleCommand(ruleId).apply(init))
}

@Generated
class AWSWAFGetRuleCommand(val ruleId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRuleRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetRuleRequest {
		val input = com.amazonaws.services.waf.model.GetRuleRequest()
		input.setRuleId(this.ruleId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-rule")
				.argument("rule-id", ruleId)
	}

}


fun AWSWAFFunctions.getRuleGroup(ruleGroupId: String, init: AWSWAFGetRuleGroupCommand.() -> Unit) {
	this.block.declare(AWSWAFGetRuleGroupCommand(ruleGroupId).apply(init))
}

@Generated
class AWSWAFGetRuleGroupCommand(val ruleGroupId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetRuleGroupRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetRuleGroupRequest {
		val input = com.amazonaws.services.waf.model.GetRuleGroupRequest()
		input.setRuleGroupId(this.ruleGroupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-rule-group")
				.argument("rule-group-id", ruleGroupId)
	}

}


fun AWSWAFFunctions.getSampledRequests(webAclId: String, ruleId: String, timeWindow: com.amazonaws.services.waf.model.TimeWindow, maxItems: Long, init: AWSWAFGetSampledRequestsCommand.() -> Unit) {
	this.block.declare(AWSWAFGetSampledRequestsCommand(webAclId, ruleId, timeWindow, maxItems).apply(init))
}

@Generated
class AWSWAFGetSampledRequestsCommand(val webAclId: String, val ruleId: String, val timeWindow: com.amazonaws.services.waf.model.TimeWindow, val maxItems: Long) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetSampledRequestsRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetSampledRequestsRequest {
		val input = com.amazonaws.services.waf.model.GetSampledRequestsRequest()
		input.setWebAclId(this.webAclId)
		input.setRuleId(this.ruleId)
		input.setTimeWindow(this.timeWindow)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getSampledRequests(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-sampled-requests")
				.argument("web-acl-id", webAclId)
				.argument("rule-id", ruleId)
				.argument("time-window", timeWindow.toString())
				.argument("max-items", maxItems.toString())
	}

}


fun AWSWAFFunctions.getSizeConstraintSet(sizeConstraintSetId: String, init: AWSWAFGetSizeConstraintSetCommand.() -> Unit) {
	this.block.declare(AWSWAFGetSizeConstraintSetCommand(sizeConstraintSetId).apply(init))
}

@Generated
class AWSWAFGetSizeConstraintSetCommand(val sizeConstraintSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetSizeConstraintSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetSizeConstraintSetRequest {
		val input = com.amazonaws.services.waf.model.GetSizeConstraintSetRequest()
		input.setSizeConstraintSetId(this.sizeConstraintSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getSizeConstraintSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-size-constraint-set")
				.argument("size-constraint-set-id", sizeConstraintSetId)
	}

}


fun AWSWAFFunctions.getSqlInjectionMatchSet(sqlInjectionMatchSetId: String, init: AWSWAFGetSqlInjectionMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFGetSqlInjectionMatchSetCommand(sqlInjectionMatchSetId).apply(init))
}

@Generated
class AWSWAFGetSqlInjectionMatchSetCommand(val sqlInjectionMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetSqlInjectionMatchSetRequest()
		input.setSqlInjectionMatchSetId(this.sqlInjectionMatchSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getSqlInjectionMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-sql-injection-match-set")
				.argument("sql-injection-match-set-id", sqlInjectionMatchSetId)
	}

}


fun AWSWAFFunctions.getWebACL(webACLId: String, init: AWSWAFGetWebACLCommand.() -> Unit) {
	this.block.declare(AWSWAFGetWebACLCommand(webACLId).apply(init))
}

@Generated
class AWSWAFGetWebACLCommand(val webACLId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetWebACLRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetWebACLRequest {
		val input = com.amazonaws.services.waf.model.GetWebACLRequest()
		input.setWebACLId(this.webACLId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-web-acl")
				.argument("web-aclid", webACLId)
	}

}


fun AWSWAFFunctions.getXssMatchSet(xssMatchSetId: String, init: AWSWAFGetXssMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFGetXssMatchSetCommand(xssMatchSetId).apply(init))
}

@Generated
class AWSWAFGetXssMatchSetCommand(val xssMatchSetId: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.GetXssMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.GetXssMatchSetRequest {
		val input = com.amazonaws.services.waf.model.GetXssMatchSetRequest()
		input.setXssMatchSetId(this.xssMatchSetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.getXssMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf get-xss-match-set")
				.argument("xss-match-set-id", xssMatchSetId)
	}

}


fun AWSWAFFunctions.listActivatedRulesInRuleGroup(init: AWSWAFListActivatedRulesInRuleGroupCommand.() -> Unit) {
	this.block.declare(AWSWAFListActivatedRulesInRuleGroupCommand().apply(init))
}

@Generated
class AWSWAFListActivatedRulesInRuleGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListActivatedRulesInRuleGroupRequest> {

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
		environment.waf.listActivatedRulesInRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-activated-rules-in-rule-group")
				.argument("rule-group-id", ruleGroupId)
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listByteMatchSets(init: AWSWAFListByteMatchSetsCommand.() -> Unit) {
	this.block.declare(AWSWAFListByteMatchSetsCommand().apply(init))
}

@Generated
class AWSWAFListByteMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListByteMatchSetsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListByteMatchSetsRequest {
		val input = com.amazonaws.services.waf.model.ListByteMatchSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.listByteMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-byte-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listGeoMatchSets(init: AWSWAFListGeoMatchSetsCommand.() -> Unit) {
	this.block.declare(AWSWAFListGeoMatchSetsCommand().apply(init))
}

@Generated
class AWSWAFListGeoMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListGeoMatchSetsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListGeoMatchSetsRequest {
		val input = com.amazonaws.services.waf.model.ListGeoMatchSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.listGeoMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-geo-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listIPSets(init: AWSWAFListIPSetsCommand.() -> Unit) {
	this.block.declare(AWSWAFListIPSetsCommand().apply(init))
}

@Generated
class AWSWAFListIPSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListIPSetsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListIPSetsRequest {
		val input = com.amazonaws.services.waf.model.ListIPSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.listIPSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-ipsets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listRateBasedRules(init: AWSWAFListRateBasedRulesCommand.() -> Unit) {
	this.block.declare(AWSWAFListRateBasedRulesCommand().apply(init))
}

@Generated
class AWSWAFListRateBasedRulesCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRateBasedRulesRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListRateBasedRulesRequest {
		val input = com.amazonaws.services.waf.model.ListRateBasedRulesRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.listRateBasedRules(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-rate-based-rules")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listRegexMatchSets(init: AWSWAFListRegexMatchSetsCommand.() -> Unit) {
	this.block.declare(AWSWAFListRegexMatchSetsCommand().apply(init))
}

@Generated
class AWSWAFListRegexMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRegexMatchSetsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListRegexMatchSetsRequest {
		val input = com.amazonaws.services.waf.model.ListRegexMatchSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.listRegexMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-regex-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listRegexPatternSets(init: AWSWAFListRegexPatternSetsCommand.() -> Unit) {
	this.block.declare(AWSWAFListRegexPatternSetsCommand().apply(init))
}

@Generated
class AWSWAFListRegexPatternSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRegexPatternSetsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListRegexPatternSetsRequest {
		val input = com.amazonaws.services.waf.model.ListRegexPatternSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.listRegexPatternSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-regex-pattern-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listRuleGroups(init: AWSWAFListRuleGroupsCommand.() -> Unit) {
	this.block.declare(AWSWAFListRuleGroupsCommand().apply(init))
}

@Generated
class AWSWAFListRuleGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRuleGroupsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListRuleGroupsRequest {
		val input = com.amazonaws.services.waf.model.ListRuleGroupsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.listRuleGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-rule-groups")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listRules(init: AWSWAFListRulesCommand.() -> Unit) {
	this.block.declare(AWSWAFListRulesCommand().apply(init))
}

@Generated
class AWSWAFListRulesCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListRulesRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListRulesRequest {
		val input = com.amazonaws.services.waf.model.ListRulesRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.listRules(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-rules")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listSizeConstraintSets(init: AWSWAFListSizeConstraintSetsCommand.() -> Unit) {
	this.block.declare(AWSWAFListSizeConstraintSetsCommand().apply(init))
}

@Generated
class AWSWAFListSizeConstraintSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest {
		val input = com.amazonaws.services.waf.model.ListSizeConstraintSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.listSizeConstraintSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-size-constraint-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listSqlInjectionMatchSets(init: AWSWAFListSqlInjectionMatchSetsCommand.() -> Unit) {
	this.block.declare(AWSWAFListSqlInjectionMatchSetsCommand().apply(init))
}

@Generated
class AWSWAFListSqlInjectionMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest {
		val input = com.amazonaws.services.waf.model.ListSqlInjectionMatchSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.listSqlInjectionMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-sql-injection-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listSubscribedRuleGroups(init: AWSWAFListSubscribedRuleGroupsCommand.() -> Unit) {
	this.block.declare(AWSWAFListSubscribedRuleGroupsCommand().apply(init))
}

@Generated
class AWSWAFListSubscribedRuleGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest {
		val input = com.amazonaws.services.waf.model.ListSubscribedRuleGroupsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.listSubscribedRuleGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-subscribed-rule-groups")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listWebACLs(init: AWSWAFListWebACLsCommand.() -> Unit) {
	this.block.declare(AWSWAFListWebACLsCommand().apply(init))
}

@Generated
class AWSWAFListWebACLsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListWebACLsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListWebACLsRequest {
		val input = com.amazonaws.services.waf.model.ListWebACLsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.listWebACLs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-web-acls")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.listXssMatchSets(init: AWSWAFListXssMatchSetsCommand.() -> Unit) {
	this.block.declare(AWSWAFListXssMatchSetsCommand().apply(init))
}

@Generated
class AWSWAFListXssMatchSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.waf.model.ListXssMatchSetsRequest> {

	var nextMarker: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.waf.model.ListXssMatchSetsRequest {
		val input = com.amazonaws.services.waf.model.ListXssMatchSetsRequest()
		input.setNextMarker(this.nextMarker)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.listXssMatchSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf list-xss-match-sets")
				.argument("next-marker", nextMarker)
				.argument("limit", limit?.toString())
	}

}


fun AWSWAFFunctions.putPermissionPolicy(resourceArn: String, policy: String, init: AWSWAFPutPermissionPolicyCommand.() -> Unit) {
	this.block.declare(AWSWAFPutPermissionPolicyCommand(resourceArn, policy).apply(init))
}

@Generated
class AWSWAFPutPermissionPolicyCommand(val resourceArn: String, val policy: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.PutPermissionPolicyRequest> {



	override fun build(): com.amazonaws.services.waf.model.PutPermissionPolicyRequest {
		val input = com.amazonaws.services.waf.model.PutPermissionPolicyRequest()
		input.setResourceArn(this.resourceArn)
		input.setPolicy(this.policy)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.putPermissionPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf put-permission-policy")
				.argument("resource-arn", resourceArn)
				.argument("policy", policy)
	}

}


fun AWSWAFFunctions.updateByteMatchSet(byteMatchSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.ByteMatchSetUpdate>, init: AWSWAFUpdateByteMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFUpdateByteMatchSetCommand(byteMatchSetId, changeToken, updates).apply(init))
}

@Generated
class AWSWAFUpdateByteMatchSetCommand(val byteMatchSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.ByteMatchSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateByteMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateByteMatchSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateByteMatchSetRequest()
		input.setByteMatchSetId(this.byteMatchSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.updateByteMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-byte-match-set")
				.argument("byte-match-set-id", byteMatchSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFFunctions.updateGeoMatchSet(geoMatchSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.GeoMatchSetUpdate>, init: AWSWAFUpdateGeoMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFUpdateGeoMatchSetCommand(geoMatchSetId, changeToken, updates).apply(init))
}

@Generated
class AWSWAFUpdateGeoMatchSetCommand(val geoMatchSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.GeoMatchSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateGeoMatchSetRequest()
		input.setGeoMatchSetId(this.geoMatchSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.updateGeoMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-geo-match-set")
				.argument("geo-match-set-id", geoMatchSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFFunctions.updateIPSet(iPSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.IPSetUpdate>, init: AWSWAFUpdateIPSetCommand.() -> Unit) {
	this.block.declare(AWSWAFUpdateIPSetCommand(iPSetId, changeToken, updates).apply(init))
}

@Generated
class AWSWAFUpdateIPSetCommand(val iPSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.IPSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateIPSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateIPSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateIPSetRequest()
		input.setIPSetId(this.iPSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.updateIPSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-ipset")
				.argument("ipset-id", iPSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFFunctions.updateRateBasedRule(ruleId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.RuleUpdate>, rateLimit: Long, init: AWSWAFUpdateRateBasedRuleCommand.() -> Unit) {
	this.block.declare(AWSWAFUpdateRateBasedRuleCommand(ruleId, changeToken, updates, rateLimit).apply(init))
}

@Generated
class AWSWAFUpdateRateBasedRuleCommand(val ruleId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.RuleUpdate>, val rateLimit: Long) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest {
		val input = com.amazonaws.services.waf.model.UpdateRateBasedRuleRequest()
		input.setRuleId(this.ruleId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		input.setRateLimit(this.rateLimit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.updateRateBasedRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-rate-based-rule")
				.argument("rule-id", ruleId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
				.argument("rate-limit", rateLimit.toString())
	}

}


fun AWSWAFFunctions.updateRegexMatchSet(regexMatchSetId: String, updates: List<com.amazonaws.services.waf.model.RegexMatchSetUpdate>, changeToken: String, init: AWSWAFUpdateRegexMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFUpdateRegexMatchSetCommand(regexMatchSetId, updates, changeToken).apply(init))
}

@Generated
class AWSWAFUpdateRegexMatchSetCommand(val regexMatchSetId: String, val updates: List<com.amazonaws.services.waf.model.RegexMatchSetUpdate>, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateRegexMatchSetRequest()
		input.setRegexMatchSetId(this.regexMatchSetId)
		input.setUpdates(this.updates)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.updateRegexMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-regex-match-set")
				.argument("regex-match-set-id", regexMatchSetId)
				.argument("updates", updates.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.updateRegexPatternSet(regexPatternSetId: String, updates: List<com.amazonaws.services.waf.model.RegexPatternSetUpdate>, changeToken: String, init: AWSWAFUpdateRegexPatternSetCommand.() -> Unit) {
	this.block.declare(AWSWAFUpdateRegexPatternSetCommand(regexPatternSetId, updates, changeToken).apply(init))
}

@Generated
class AWSWAFUpdateRegexPatternSetCommand(val regexPatternSetId: String, val updates: List<com.amazonaws.services.waf.model.RegexPatternSetUpdate>, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateRegexPatternSetRequest()
		input.setRegexPatternSetId(this.regexPatternSetId)
		input.setUpdates(this.updates)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.updateRegexPatternSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-regex-pattern-set")
				.argument("regex-pattern-set-id", regexPatternSetId)
				.argument("updates", updates.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.updateRule(ruleId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.RuleUpdate>, init: AWSWAFUpdateRuleCommand.() -> Unit) {
	this.block.declare(AWSWAFUpdateRuleCommand(ruleId, changeToken, updates).apply(init))
}

@Generated
class AWSWAFUpdateRuleCommand(val ruleId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.RuleUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRuleRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateRuleRequest {
		val input = com.amazonaws.services.waf.model.UpdateRuleRequest()
		input.setRuleId(this.ruleId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.updateRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-rule")
				.argument("rule-id", ruleId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFFunctions.updateRuleGroup(ruleGroupId: String, updates: List<com.amazonaws.services.waf.model.RuleGroupUpdate>, changeToken: String, init: AWSWAFUpdateRuleGroupCommand.() -> Unit) {
	this.block.declare(AWSWAFUpdateRuleGroupCommand(ruleGroupId, updates, changeToken).apply(init))
}

@Generated
class AWSWAFUpdateRuleGroupCommand(val ruleGroupId: String, val updates: List<com.amazonaws.services.waf.model.RuleGroupUpdate>, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateRuleGroupRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateRuleGroupRequest {
		val input = com.amazonaws.services.waf.model.UpdateRuleGroupRequest()
		input.setRuleGroupId(this.ruleGroupId)
		input.setUpdates(this.updates)
		input.setChangeToken(this.changeToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.updateRuleGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-rule-group")
				.argument("rule-group-id", ruleGroupId)
				.argument("updates", updates.toString())
				.argument("change-token", changeToken)
	}

}


fun AWSWAFFunctions.updateSizeConstraintSet(sizeConstraintSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.SizeConstraintSetUpdate>, init: AWSWAFUpdateSizeConstraintSetCommand.() -> Unit) {
	this.block.declare(AWSWAFUpdateSizeConstraintSetCommand(sizeConstraintSetId, changeToken, updates).apply(init))
}

@Generated
class AWSWAFUpdateSizeConstraintSetCommand(val sizeConstraintSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.SizeConstraintSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateSizeConstraintSetRequest()
		input.setSizeConstraintSetId(this.sizeConstraintSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.updateSizeConstraintSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-size-constraint-set")
				.argument("size-constraint-set-id", sizeConstraintSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFFunctions.updateSqlInjectionMatchSet(sqlInjectionMatchSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.SqlInjectionMatchSetUpdate>, init: AWSWAFUpdateSqlInjectionMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFUpdateSqlInjectionMatchSetCommand(sqlInjectionMatchSetId, changeToken, updates).apply(init))
}

@Generated
class AWSWAFUpdateSqlInjectionMatchSetCommand(val sqlInjectionMatchSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.SqlInjectionMatchSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateSqlInjectionMatchSetRequest()
		input.setSqlInjectionMatchSetId(this.sqlInjectionMatchSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.updateSqlInjectionMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-sql-injection-match-set")
				.argument("sql-injection-match-set-id", sqlInjectionMatchSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}


fun AWSWAFFunctions.updateWebACL(webACLId: String, changeToken: String, init: AWSWAFUpdateWebACLCommand.() -> Unit) {
	this.block.declare(AWSWAFUpdateWebACLCommand(webACLId, changeToken).apply(init))
}

@Generated
class AWSWAFUpdateWebACLCommand(val webACLId: String, val changeToken: String) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateWebACLRequest> {

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
		environment.waf.updateWebACL(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-web-acl")
				.argument("web-aclid", webACLId)
				.argument("change-token", changeToken)
				.argument("updates", updates?.toString())
				.argument("default-action", defaultAction?.toString())
	}

}


fun AWSWAFFunctions.updateXssMatchSet(xssMatchSetId: String, changeToken: String, updates: List<com.amazonaws.services.waf.model.XssMatchSetUpdate>, init: AWSWAFUpdateXssMatchSetCommand.() -> Unit) {
	this.block.declare(AWSWAFUpdateXssMatchSetCommand(xssMatchSetId, changeToken, updates).apply(init))
}

@Generated
class AWSWAFUpdateXssMatchSetCommand(val xssMatchSetId: String, val changeToken: String, val updates: List<com.amazonaws.services.waf.model.XssMatchSetUpdate>) : AmazonWebServiceCommand<com.amazonaws.services.waf.model.UpdateXssMatchSetRequest> {



	override fun build(): com.amazonaws.services.waf.model.UpdateXssMatchSetRequest {
		val input = com.amazonaws.services.waf.model.UpdateXssMatchSetRequest()
		input.setXssMatchSetId(this.xssMatchSetId)
		input.setChangeToken(this.changeToken)
		input.setUpdates(this.updates)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.waf.updateXssMatchSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws waf update-xss-match-set")
				.argument("xss-match-set-id", xssMatchSetId)
				.argument("change-token", changeToken)
				.argument("updates", updates.toString())
	}

}
