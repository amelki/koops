
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService
import com.amazonaws.services.simpleemail.model.*

var codingue.koops.core.Environment.ses: AmazonSimpleEmailService
	get() = this.capabilities[AmazonSimpleEmailService::class.java.name] as AmazonSimpleEmailService
	set(ses) {
		this.capabilities[AmazonSimpleEmailService::class.java.name] = ses
	}

@Generated
class AmazonSimpleEmailServiceFunctions(val block: Block)

infix fun AwsContinuation.ses(init: AmazonSimpleEmailServiceFunctions.() -> Unit) {
	AmazonSimpleEmailServiceFunctions(shell).apply(init)
}

			

fun AmazonSimpleEmailServiceFunctions.cloneReceiptRuleSet(ruleSetName: String, originalRuleSetName: String, init: AmazonSimpleEmailServiceCloneReceiptRuleSetCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceCloneReceiptRuleSetCommand(ruleSetName, originalRuleSetName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceCloneReceiptRuleSetCommand(val ruleSetName: String, val originalRuleSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetRequest {
		val input = com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetRequest()
		input.setRuleSetName(this.ruleSetName)
		input.setOriginalRuleSetName(this.originalRuleSetName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.cloneReceiptRuleSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses clone-receipt-rule-set")
				.argument("rule-set-name", ruleSetName)
				.argument("original-rule-set-name", originalRuleSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.createConfigurationSet(configurationSet: com.amazonaws.services.simpleemail.model.ConfigurationSet, init: AmazonSimpleEmailServiceCreateConfigurationSetCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceCreateConfigurationSetCommand(configurationSet).apply(init))
}

@Generated
class AmazonSimpleEmailServiceCreateConfigurationSetCommand(val configurationSet: com.amazonaws.services.simpleemail.model.ConfigurationSet) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CreateConfigurationSetRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.CreateConfigurationSetRequest {
		val input = com.amazonaws.services.simpleemail.model.CreateConfigurationSetRequest()
		input.setConfigurationSet(this.configurationSet)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.createConfigurationSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses create-configuration-set")
				.argument("configuration-set", configurationSet.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.createConfigurationSetEventDestination(configurationSetName: String, eventDestination: com.amazonaws.services.simpleemail.model.EventDestination, init: AmazonSimpleEmailServiceCreateConfigurationSetEventDestinationCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceCreateConfigurationSetEventDestinationCommand(configurationSetName, eventDestination).apply(init))
}

@Generated
class AmazonSimpleEmailServiceCreateConfigurationSetEventDestinationCommand(val configurationSetName: String, val eventDestination: com.amazonaws.services.simpleemail.model.EventDestination) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationRequest {
		val input = com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationRequest()
		input.setConfigurationSetName(this.configurationSetName)
		input.setEventDestination(this.eventDestination)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.createConfigurationSetEventDestination(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses create-configuration-set-event-destination")
				.argument("configuration-set-name", configurationSetName)
				.argument("event-destination", eventDestination.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.createConfigurationSetTrackingOptions(configurationSetName: String, trackingOptions: com.amazonaws.services.simpleemail.model.TrackingOptions, init: AmazonSimpleEmailServiceCreateConfigurationSetTrackingOptionsCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceCreateConfigurationSetTrackingOptionsCommand(configurationSetName, trackingOptions).apply(init))
}

@Generated
class AmazonSimpleEmailServiceCreateConfigurationSetTrackingOptionsCommand(val configurationSetName: String, val trackingOptions: com.amazonaws.services.simpleemail.model.TrackingOptions) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsRequest {
		val input = com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsRequest()
		input.setConfigurationSetName(this.configurationSetName)
		input.setTrackingOptions(this.trackingOptions)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.createConfigurationSetTrackingOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses create-configuration-set-tracking-options")
				.argument("configuration-set-name", configurationSetName)
				.argument("tracking-options", trackingOptions.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.createCustomVerificationEmailTemplate(templateName: String, fromEmailAddress: String, templateSubject: String, templateContent: String, successRedirectionURL: String, failureRedirectionURL: String, init: AmazonSimpleEmailServiceCreateCustomVerificationEmailTemplateCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceCreateCustomVerificationEmailTemplateCommand(templateName, fromEmailAddress, templateSubject, templateContent, successRedirectionURL, failureRedirectionURL).apply(init))
}

@Generated
class AmazonSimpleEmailServiceCreateCustomVerificationEmailTemplateCommand(val templateName: String, val fromEmailAddress: String, val templateSubject: String, val templateContent: String, val successRedirectionURL: String, val failureRedirectionURL: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateRequest {
		val input = com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateRequest()
		input.setTemplateName(this.templateName)
		input.setFromEmailAddress(this.fromEmailAddress)
		input.setTemplateSubject(this.templateSubject)
		input.setTemplateContent(this.templateContent)
		input.setSuccessRedirectionURL(this.successRedirectionURL)
		input.setFailureRedirectionURL(this.failureRedirectionURL)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.createCustomVerificationEmailTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses create-custom-verification-email-template")
				.argument("template-name", templateName)
				.argument("from-email-address", fromEmailAddress)
				.argument("template-subject", templateSubject)
				.argument("template-content", templateContent)
				.argument("success-redirection-url", successRedirectionURL)
				.argument("failure-redirection-url", failureRedirectionURL)
	}

}


fun AmazonSimpleEmailServiceFunctions.createReceiptFilter(filter: com.amazonaws.services.simpleemail.model.ReceiptFilter, init: AmazonSimpleEmailServiceCreateReceiptFilterCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceCreateReceiptFilterCommand(filter).apply(init))
}

@Generated
class AmazonSimpleEmailServiceCreateReceiptFilterCommand(val filter: com.amazonaws.services.simpleemail.model.ReceiptFilter) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CreateReceiptFilterRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.CreateReceiptFilterRequest {
		val input = com.amazonaws.services.simpleemail.model.CreateReceiptFilterRequest()
		input.setFilter(this.filter)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.createReceiptFilter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses create-receipt-filter")
				.argument("filter", filter.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.createReceiptRule(ruleSetName: String, rule: com.amazonaws.services.simpleemail.model.ReceiptRule, init: AmazonSimpleEmailServiceCreateReceiptRuleCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceCreateReceiptRuleCommand(ruleSetName, rule).apply(init))
}

@Generated
class AmazonSimpleEmailServiceCreateReceiptRuleCommand(val ruleSetName: String, val rule: com.amazonaws.services.simpleemail.model.ReceiptRule) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CreateReceiptRuleRequest> {

	var after: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.CreateReceiptRuleRequest {
		val input = com.amazonaws.services.simpleemail.model.CreateReceiptRuleRequest()
		input.setRuleSetName(this.ruleSetName)
		input.setAfter(this.after)
		input.setRule(this.rule)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.createReceiptRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses create-receipt-rule")
				.argument("rule-set-name", ruleSetName)
				.argument("after", after)
				.argument("rule", rule.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.createReceiptRuleSet(ruleSetName: String, init: AmazonSimpleEmailServiceCreateReceiptRuleSetCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceCreateReceiptRuleSetCommand(ruleSetName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceCreateReceiptRuleSetCommand(val ruleSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetRequest {
		val input = com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetRequest()
		input.setRuleSetName(this.ruleSetName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.createReceiptRuleSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses create-receipt-rule-set")
				.argument("rule-set-name", ruleSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.createTemplate(template: com.amazonaws.services.simpleemail.model.Template, init: AmazonSimpleEmailServiceCreateTemplateCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceCreateTemplateCommand(template).apply(init))
}

@Generated
class AmazonSimpleEmailServiceCreateTemplateCommand(val template: com.amazonaws.services.simpleemail.model.Template) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CreateTemplateRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.CreateTemplateRequest {
		val input = com.amazonaws.services.simpleemail.model.CreateTemplateRequest()
		input.setTemplate(this.template)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.createTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses create-template")
				.argument("template", template.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteConfigurationSet(configurationSetName: String, init: AmazonSimpleEmailServiceDeleteConfigurationSetCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceDeleteConfigurationSetCommand(configurationSetName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceDeleteConfigurationSetCommand(val configurationSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteConfigurationSetRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteConfigurationSetRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteConfigurationSetRequest()
		input.setConfigurationSetName(this.configurationSetName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.deleteConfigurationSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-configuration-set")
				.argument("configuration-set-name", configurationSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteConfigurationSetEventDestination(configurationSetName: String, eventDestinationName: String, init: AmazonSimpleEmailServiceDeleteConfigurationSetEventDestinationCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceDeleteConfigurationSetEventDestinationCommand(configurationSetName, eventDestinationName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceDeleteConfigurationSetEventDestinationCommand(val configurationSetName: String, val eventDestinationName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationRequest()
		input.setConfigurationSetName(this.configurationSetName)
		input.setEventDestinationName(this.eventDestinationName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.deleteConfigurationSetEventDestination(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-configuration-set-event-destination")
				.argument("configuration-set-name", configurationSetName)
				.argument("event-destination-name", eventDestinationName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteConfigurationSetTrackingOptions(configurationSetName: String, init: AmazonSimpleEmailServiceDeleteConfigurationSetTrackingOptionsCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceDeleteConfigurationSetTrackingOptionsCommand(configurationSetName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceDeleteConfigurationSetTrackingOptionsCommand(val configurationSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsRequest()
		input.setConfigurationSetName(this.configurationSetName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.deleteConfigurationSetTrackingOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-configuration-set-tracking-options")
				.argument("configuration-set-name", configurationSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteCustomVerificationEmailTemplate(templateName: String, init: AmazonSimpleEmailServiceDeleteCustomVerificationEmailTemplateCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceDeleteCustomVerificationEmailTemplateCommand(templateName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceDeleteCustomVerificationEmailTemplateCommand(val templateName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateRequest()
		input.setTemplateName(this.templateName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.deleteCustomVerificationEmailTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-custom-verification-email-template")
				.argument("template-name", templateName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteIdentity(identity: String, init: AmazonSimpleEmailServiceDeleteIdentityCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceDeleteIdentityCommand(identity).apply(init))
}

@Generated
class AmazonSimpleEmailServiceDeleteIdentityCommand(val identity: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteIdentityRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteIdentityRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteIdentityRequest()
		input.setIdentity(this.identity)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.deleteIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-identity")
				.argument("identity", identity)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteIdentityPolicy(identity: String, policyName: String, init: AmazonSimpleEmailServiceDeleteIdentityPolicyCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceDeleteIdentityPolicyCommand(identity, policyName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceDeleteIdentityPolicyCommand(val identity: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest()
		input.setIdentity(this.identity)
		input.setPolicyName(this.policyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.deleteIdentityPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-identity-policy")
				.argument("identity", identity)
				.argument("policy-name", policyName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteReceiptFilter(filterName: String, init: AmazonSimpleEmailServiceDeleteReceiptFilterCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceDeleteReceiptFilterCommand(filterName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceDeleteReceiptFilterCommand(val filterName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteReceiptFilterRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteReceiptFilterRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteReceiptFilterRequest()
		input.setFilterName(this.filterName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.deleteReceiptFilter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-receipt-filter")
				.argument("filter-name", filterName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteReceiptRule(ruleSetName: String, ruleName: String, init: AmazonSimpleEmailServiceDeleteReceiptRuleCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceDeleteReceiptRuleCommand(ruleSetName, ruleName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceDeleteReceiptRuleCommand(val ruleSetName: String, val ruleName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteReceiptRuleRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteReceiptRuleRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteReceiptRuleRequest()
		input.setRuleSetName(this.ruleSetName)
		input.setRuleName(this.ruleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.deleteReceiptRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-receipt-rule")
				.argument("rule-set-name", ruleSetName)
				.argument("rule-name", ruleName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteReceiptRuleSet(ruleSetName: String, init: AmazonSimpleEmailServiceDeleteReceiptRuleSetCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceDeleteReceiptRuleSetCommand(ruleSetName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceDeleteReceiptRuleSetCommand(val ruleSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetRequest()
		input.setRuleSetName(this.ruleSetName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.deleteReceiptRuleSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-receipt-rule-set")
				.argument("rule-set-name", ruleSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteTemplate(templateName: String, init: AmazonSimpleEmailServiceDeleteTemplateCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceDeleteTemplateCommand(templateName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceDeleteTemplateCommand(val templateName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteTemplateRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteTemplateRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteTemplateRequest()
		input.setTemplateName(this.templateName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.deleteTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-template")
				.argument("template-name", templateName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteVerifiedEmailAddress(emailAddress: String, init: AmazonSimpleEmailServiceDeleteVerifiedEmailAddressCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceDeleteVerifiedEmailAddressCommand(emailAddress).apply(init))
}

@Generated
class AmazonSimpleEmailServiceDeleteVerifiedEmailAddressCommand(val emailAddress: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest()
		input.setEmailAddress(this.emailAddress)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.deleteVerifiedEmailAddress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-verified-email-address")
				.argument("email-address", emailAddress)
	}

}


fun AmazonSimpleEmailServiceFunctions.describeActiveReceiptRuleSet(init: AmazonSimpleEmailServiceDescribeActiveReceiptRuleSetCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceDescribeActiveReceiptRuleSetCommand().apply(init))
}

@Generated
class AmazonSimpleEmailServiceDescribeActiveReceiptRuleSetCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetRequest {
		val input = com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.describeActiveReceiptRuleSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses describe-active-receipt-rule-set")

	}

}


fun AmazonSimpleEmailServiceFunctions.describeConfigurationSet(configurationSetName: String, init: AmazonSimpleEmailServiceDescribeConfigurationSetCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceDescribeConfigurationSetCommand(configurationSetName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceDescribeConfigurationSetCommand(val configurationSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DescribeConfigurationSetRequest> {

	var configurationSetAttributeNames: List<ConfigurationSetAttribute>? = null

	override fun build(): com.amazonaws.services.simpleemail.model.DescribeConfigurationSetRequest {
		val input = com.amazonaws.services.simpleemail.model.DescribeConfigurationSetRequest()
		input.setConfigurationSetName(this.configurationSetName)
		input.setConfigurationSetAttributeNames(this.configurationSetAttributeNames?.map { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.describeConfigurationSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses describe-configuration-set")
				.argument("configuration-set-name", configurationSetName)
				.argument("configuration-set-attribute-names", configurationSetAttributeNames?.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.describeReceiptRule(ruleSetName: String, ruleName: String, init: AmazonSimpleEmailServiceDescribeReceiptRuleCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceDescribeReceiptRuleCommand(ruleSetName, ruleName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceDescribeReceiptRuleCommand(val ruleSetName: String, val ruleName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DescribeReceiptRuleRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.DescribeReceiptRuleRequest {
		val input = com.amazonaws.services.simpleemail.model.DescribeReceiptRuleRequest()
		input.setRuleSetName(this.ruleSetName)
		input.setRuleName(this.ruleName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.describeReceiptRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses describe-receipt-rule")
				.argument("rule-set-name", ruleSetName)
				.argument("rule-name", ruleName)
	}

}


fun AmazonSimpleEmailServiceFunctions.describeReceiptRuleSet(ruleSetName: String, init: AmazonSimpleEmailServiceDescribeReceiptRuleSetCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceDescribeReceiptRuleSetCommand(ruleSetName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceDescribeReceiptRuleSetCommand(val ruleSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetRequest {
		val input = com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetRequest()
		input.setRuleSetName(this.ruleSetName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.describeReceiptRuleSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses describe-receipt-rule-set")
				.argument("rule-set-name", ruleSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.getAccountSendingEnabled(init: AmazonSimpleEmailServiceGetAccountSendingEnabledCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceGetAccountSendingEnabledCommand().apply(init))
}

@Generated
class AmazonSimpleEmailServiceGetAccountSendingEnabledCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledRequest {
		val input = com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.getAccountSendingEnabled(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-account-sending-enabled")

	}

}


fun AmazonSimpleEmailServiceFunctions.getCustomVerificationEmailTemplate(templateName: String, init: AmazonSimpleEmailServiceGetCustomVerificationEmailTemplateCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceGetCustomVerificationEmailTemplateCommand(templateName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceGetCustomVerificationEmailTemplateCommand(val templateName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateRequest {
		val input = com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateRequest()
		input.setTemplateName(this.templateName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.getCustomVerificationEmailTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-custom-verification-email-template")
				.argument("template-name", templateName)
	}

}


fun AmazonSimpleEmailServiceFunctions.getIdentityDkimAttributes(identities: List<String>, init: AmazonSimpleEmailServiceGetIdentityDkimAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceGetIdentityDkimAttributesCommand(identities).apply(init))
}

@Generated
class AmazonSimpleEmailServiceGetIdentityDkimAttributesCommand(val identities: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest {
		val input = com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest()
		input.setIdentities(this.identities)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.getIdentityDkimAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-identity-dkim-attributes")
				.argument("identities", identities.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.getIdentityMailFromDomainAttributes(identities: List<String>, init: AmazonSimpleEmailServiceGetIdentityMailFromDomainAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceGetIdentityMailFromDomainAttributesCommand(identities).apply(init))
}

@Generated
class AmazonSimpleEmailServiceGetIdentityMailFromDomainAttributesCommand(val identities: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesRequest {
		val input = com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesRequest()
		input.setIdentities(this.identities)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.getIdentityMailFromDomainAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-identity-mail-from-domain-attributes")
				.argument("identities", identities.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.getIdentityNotificationAttributes(identities: List<String>, init: AmazonSimpleEmailServiceGetIdentityNotificationAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceGetIdentityNotificationAttributesCommand(identities).apply(init))
}

@Generated
class AmazonSimpleEmailServiceGetIdentityNotificationAttributesCommand(val identities: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest {
		val input = com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest()
		input.setIdentities(this.identities)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.getIdentityNotificationAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-identity-notification-attributes")
				.argument("identities", identities.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.getIdentityPolicies(identity: String, policyNames: List<String>, init: AmazonSimpleEmailServiceGetIdentityPoliciesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceGetIdentityPoliciesCommand(identity, policyNames).apply(init))
}

@Generated
class AmazonSimpleEmailServiceGetIdentityPoliciesCommand(val identity: String, val policyNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest {
		val input = com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest()
		input.setIdentity(this.identity)
		input.setPolicyNames(this.policyNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.getIdentityPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-identity-policies")
				.argument("identity", identity)
				.argument("policy-names", policyNames.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.getIdentityVerificationAttributes(identities: List<String>, init: AmazonSimpleEmailServiceGetIdentityVerificationAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceGetIdentityVerificationAttributesCommand(identities).apply(init))
}

@Generated
class AmazonSimpleEmailServiceGetIdentityVerificationAttributesCommand(val identities: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest {
		val input = com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest()
		input.setIdentities(this.identities)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.getIdentityVerificationAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-identity-verification-attributes")
				.argument("identities", identities.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.getSendQuota(init: AmazonSimpleEmailServiceGetSendQuotaCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceGetSendQuotaCommand().apply(init))
}

@Generated
class AmazonSimpleEmailServiceGetSendQuotaCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetSendQuotaRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetSendQuotaRequest {
		val input = com.amazonaws.services.simpleemail.model.GetSendQuotaRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.getSendQuota(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-send-quota")

	}

}


fun AmazonSimpleEmailServiceFunctions.getSendStatistics(init: AmazonSimpleEmailServiceGetSendStatisticsCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceGetSendStatisticsCommand().apply(init))
}

@Generated
class AmazonSimpleEmailServiceGetSendStatisticsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest {
		val input = com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.getSendStatistics(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-send-statistics")

	}

}


fun AmazonSimpleEmailServiceFunctions.getTemplate(templateName: String, init: AmazonSimpleEmailServiceGetTemplateCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceGetTemplateCommand(templateName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceGetTemplateCommand(val templateName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetTemplateRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetTemplateRequest {
		val input = com.amazonaws.services.simpleemail.model.GetTemplateRequest()
		input.setTemplateName(this.templateName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.getTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-template")
				.argument("template-name", templateName)
	}

}


fun AmazonSimpleEmailServiceFunctions.listConfigurationSets(init: AmazonSimpleEmailServiceListConfigurationSetsCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceListConfigurationSetsCommand().apply(init))
}

@Generated
class AmazonSimpleEmailServiceListConfigurationSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ListConfigurationSetsRequest> {

	var nextToken: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.simpleemail.model.ListConfigurationSetsRequest {
		val input = com.amazonaws.services.simpleemail.model.ListConfigurationSetsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.listConfigurationSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses list-configuration-sets")
				.argument("next-token", nextToken)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.listCustomVerificationEmailTemplates(init: AmazonSimpleEmailServiceListCustomVerificationEmailTemplatesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceListCustomVerificationEmailTemplatesCommand().apply(init))
}

@Generated
class AmazonSimpleEmailServiceListCustomVerificationEmailTemplatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesRequest {
		val input = com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.listCustomVerificationEmailTemplates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses list-custom-verification-email-templates")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.listIdentities(init: AmazonSimpleEmailServiceListIdentitiesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceListIdentitiesCommand().apply(init))
}

@Generated
class AmazonSimpleEmailServiceListIdentitiesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ListIdentitiesRequest> {

	var identityType: IdentityType? = null
	var nextToken: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.simpleemail.model.ListIdentitiesRequest {
		val input = com.amazonaws.services.simpleemail.model.ListIdentitiesRequest()
		input.setIdentityType(this.identityType?.toString())
		input.setNextToken(this.nextToken)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.listIdentities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses list-identities")
				.argument("identity-type", identityType?.toString())
				.argument("next-token", nextToken)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.listIdentityPolicies(identity: String, init: AmazonSimpleEmailServiceListIdentityPoliciesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceListIdentityPoliciesCommand(identity).apply(init))
}

@Generated
class AmazonSimpleEmailServiceListIdentityPoliciesCommand(val identity: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest {
		val input = com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest()
		input.setIdentity(this.identity)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.listIdentityPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses list-identity-policies")
				.argument("identity", identity)
	}

}


fun AmazonSimpleEmailServiceFunctions.listReceiptFilters(init: AmazonSimpleEmailServiceListReceiptFiltersCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceListReceiptFiltersCommand().apply(init))
}

@Generated
class AmazonSimpleEmailServiceListReceiptFiltersCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ListReceiptFiltersRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.ListReceiptFiltersRequest {
		val input = com.amazonaws.services.simpleemail.model.ListReceiptFiltersRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.listReceiptFilters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses list-receipt-filters")

	}

}


fun AmazonSimpleEmailServiceFunctions.listReceiptRuleSets(init: AmazonSimpleEmailServiceListReceiptRuleSetsCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceListReceiptRuleSetsCommand().apply(init))
}

@Generated
class AmazonSimpleEmailServiceListReceiptRuleSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsRequest {
		val input = com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.listReceiptRuleSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses list-receipt-rule-sets")
				.argument("next-token", nextToken)
	}

}


fun AmazonSimpleEmailServiceFunctions.listTemplates(init: AmazonSimpleEmailServiceListTemplatesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceListTemplatesCommand().apply(init))
}

@Generated
class AmazonSimpleEmailServiceListTemplatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ListTemplatesRequest> {

	var nextToken: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.simpleemail.model.ListTemplatesRequest {
		val input = com.amazonaws.services.simpleemail.model.ListTemplatesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.listTemplates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses list-templates")
				.argument("next-token", nextToken)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.listVerifiedEmailAddresses(init: AmazonSimpleEmailServiceListVerifiedEmailAddressesCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceListVerifiedEmailAddressesCommand().apply(init))
}

@Generated
class AmazonSimpleEmailServiceListVerifiedEmailAddressesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest {
		val input = com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.listVerifiedEmailAddresses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses list-verified-email-addresses")

	}

}


fun AmazonSimpleEmailServiceFunctions.putIdentityPolicy(identity: String, policyName: String, policy: String, init: AmazonSimpleEmailServicePutIdentityPolicyCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServicePutIdentityPolicyCommand(identity, policyName, policy).apply(init))
}

@Generated
class AmazonSimpleEmailServicePutIdentityPolicyCommand(val identity: String, val policyName: String, val policy: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest {
		val input = com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest()
		input.setIdentity(this.identity)
		input.setPolicyName(this.policyName)
		input.setPolicy(this.policy)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.putIdentityPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses put-identity-policy")
				.argument("identity", identity)
				.argument("policy-name", policyName)
				.argument("policy", policy)
	}

}


fun AmazonSimpleEmailServiceFunctions.reorderReceiptRuleSet(ruleSetName: String, ruleNames: List<String>, init: AmazonSimpleEmailServiceReorderReceiptRuleSetCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceReorderReceiptRuleSetCommand(ruleSetName, ruleNames).apply(init))
}

@Generated
class AmazonSimpleEmailServiceReorderReceiptRuleSetCommand(val ruleSetName: String, val ruleNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetRequest {
		val input = com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetRequest()
		input.setRuleSetName(this.ruleSetName)
		input.setRuleNames(this.ruleNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.reorderReceiptRuleSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses reorder-receipt-rule-set")
				.argument("rule-set-name", ruleSetName)
				.argument("rule-names", ruleNames.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.sendBounce(originalMessageId: String, bounceSender: String, bouncedRecipientInfoList: List<com.amazonaws.services.simpleemail.model.BouncedRecipientInfo>, init: AmazonSimpleEmailServiceSendBounceCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceSendBounceCommand(originalMessageId, bounceSender, bouncedRecipientInfoList).apply(init))
}

@Generated
class AmazonSimpleEmailServiceSendBounceCommand(val originalMessageId: String, val bounceSender: String, val bouncedRecipientInfoList: List<com.amazonaws.services.simpleemail.model.BouncedRecipientInfo>) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SendBounceRequest> {

	var explanation: String? = null
	var messageDsn: com.amazonaws.services.simpleemail.model.MessageDsn? = null
	var bounceSenderArn: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.SendBounceRequest {
		val input = com.amazonaws.services.simpleemail.model.SendBounceRequest()
		input.setOriginalMessageId(this.originalMessageId)
		input.setBounceSender(this.bounceSender)
		input.setExplanation(this.explanation)
		input.setMessageDsn(this.messageDsn)
		input.setBouncedRecipientInfoList(this.bouncedRecipientInfoList)
		input.setBounceSenderArn(this.bounceSenderArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.sendBounce(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses send-bounce")
				.argument("original-message-id", originalMessageId)
				.argument("bounce-sender", bounceSender)
				.argument("explanation", explanation)
				.argument("message-dsn", messageDsn?.toString())
				.argument("bounced-recipient-info-list", bouncedRecipientInfoList.toString())
				.argument("bounce-sender-arn", bounceSenderArn)
	}

}


fun AmazonSimpleEmailServiceFunctions.sendBulkTemplatedEmail(source: String, template: String, destinations: List<com.amazonaws.services.simpleemail.model.BulkEmailDestination>, init: AmazonSimpleEmailServiceSendBulkTemplatedEmailCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceSendBulkTemplatedEmailCommand(source, template, destinations).apply(init))
}

@Generated
class AmazonSimpleEmailServiceSendBulkTemplatedEmailCommand(val source: String, val template: String, val destinations: List<com.amazonaws.services.simpleemail.model.BulkEmailDestination>) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailRequest> {

	var sourceArn: String? = null
	var replyToAddresses: List<String>? = null
	var returnPath: String? = null
	var returnPathArn: String? = null
	var configurationSetName: String? = null
	var defaultTags: List<com.amazonaws.services.simpleemail.model.MessageTag>? = null
	var templateArn: String? = null
	var defaultTemplateData: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailRequest {
		val input = com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailRequest()
		input.setSource(this.source)
		input.setSourceArn(this.sourceArn)
		input.setReplyToAddresses(this.replyToAddresses)
		input.setReturnPath(this.returnPath)
		input.setReturnPathArn(this.returnPathArn)
		input.setConfigurationSetName(this.configurationSetName)
		input.setDefaultTags(this.defaultTags)
		input.setTemplate(this.template)
		input.setTemplateArn(this.templateArn)
		input.setDefaultTemplateData(this.defaultTemplateData)
		input.setDestinations(this.destinations)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.sendBulkTemplatedEmail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses send-bulk-templated-email")
				.argument("source", source)
				.argument("source-arn", sourceArn)
				.argument("reply-to-addresses", replyToAddresses?.toString())
				.argument("return-path", returnPath)
				.argument("return-path-arn", returnPathArn)
				.argument("configuration-set-name", configurationSetName)
				.argument("default-tags", defaultTags?.toString())
				.argument("template", template)
				.argument("template-arn", templateArn)
				.argument("default-template-data", defaultTemplateData)
				.argument("destinations", destinations.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.sendCustomVerificationEmail(emailAddress: String, templateName: String, init: AmazonSimpleEmailServiceSendCustomVerificationEmailCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceSendCustomVerificationEmailCommand(emailAddress, templateName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceSendCustomVerificationEmailCommand(val emailAddress: String, val templateName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailRequest> {

	var configurationSetName: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailRequest {
		val input = com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailRequest()
		input.setEmailAddress(this.emailAddress)
		input.setTemplateName(this.templateName)
		input.setConfigurationSetName(this.configurationSetName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.sendCustomVerificationEmail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses send-custom-verification-email")
				.argument("email-address", emailAddress)
				.argument("template-name", templateName)
				.argument("configuration-set-name", configurationSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.sendEmail(source: String, destination: com.amazonaws.services.simpleemail.model.Destination, message: com.amazonaws.services.simpleemail.model.Message, init: AmazonSimpleEmailServiceSendEmailCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceSendEmailCommand(source, destination, message).apply(init))
}

@Generated
class AmazonSimpleEmailServiceSendEmailCommand(val source: String, val destination: com.amazonaws.services.simpleemail.model.Destination, val message: com.amazonaws.services.simpleemail.model.Message) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SendEmailRequest> {

	var replyToAddresses: List<String>? = null
	var returnPath: String? = null
	var sourceArn: String? = null
	var returnPathArn: String? = null
	var tags: List<com.amazonaws.services.simpleemail.model.MessageTag>? = null
	var configurationSetName: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.SendEmailRequest {
		val input = com.amazonaws.services.simpleemail.model.SendEmailRequest()
		input.setSource(this.source)
		input.setDestination(this.destination)
		input.setMessage(this.message)
		input.setReplyToAddresses(this.replyToAddresses)
		input.setReturnPath(this.returnPath)
		input.setSourceArn(this.sourceArn)
		input.setReturnPathArn(this.returnPathArn)
		input.setTags(this.tags)
		input.setConfigurationSetName(this.configurationSetName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.sendEmail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses send-email")
				.argument("source", source)
				.argument("destination", destination.toString())
				.argument("message", message.toString())
				.argument("reply-to-addresses", replyToAddresses?.toString())
				.argument("return-path", returnPath)
				.argument("source-arn", sourceArn)
				.argument("return-path-arn", returnPathArn)
				.argument("tags", tags?.toString())
				.argument("configuration-set-name", configurationSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.sendRawEmail(rawMessage: com.amazonaws.services.simpleemail.model.RawMessage, init: AmazonSimpleEmailServiceSendRawEmailCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceSendRawEmailCommand(rawMessage).apply(init))
}

@Generated
class AmazonSimpleEmailServiceSendRawEmailCommand(val rawMessage: com.amazonaws.services.simpleemail.model.RawMessage) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SendRawEmailRequest> {

	var source: String? = null
	var destinations: List<String>? = null
	var fromArn: String? = null
	var sourceArn: String? = null
	var returnPathArn: String? = null
	var tags: List<com.amazonaws.services.simpleemail.model.MessageTag>? = null
	var configurationSetName: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.SendRawEmailRequest {
		val input = com.amazonaws.services.simpleemail.model.SendRawEmailRequest()
		input.setSource(this.source)
		input.setDestinations(this.destinations)
		input.setRawMessage(this.rawMessage)
		input.setFromArn(this.fromArn)
		input.setSourceArn(this.sourceArn)
		input.setReturnPathArn(this.returnPathArn)
		input.setTags(this.tags)
		input.setConfigurationSetName(this.configurationSetName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.sendRawEmail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses send-raw-email")
				.argument("source", source)
				.argument("destinations", destinations?.toString())
				.argument("raw-message", rawMessage.toString())
				.argument("from-arn", fromArn)
				.argument("source-arn", sourceArn)
				.argument("return-path-arn", returnPathArn)
				.argument("tags", tags?.toString())
				.argument("configuration-set-name", configurationSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.sendTemplatedEmail(source: String, destination: com.amazonaws.services.simpleemail.model.Destination, template: String, templateData: String, init: AmazonSimpleEmailServiceSendTemplatedEmailCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceSendTemplatedEmailCommand(source, destination, template, templateData).apply(init))
}

@Generated
class AmazonSimpleEmailServiceSendTemplatedEmailCommand(val source: String, val destination: com.amazonaws.services.simpleemail.model.Destination, val template: String, val templateData: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SendTemplatedEmailRequest> {

	var replyToAddresses: List<String>? = null
	var returnPath: String? = null
	var sourceArn: String? = null
	var returnPathArn: String? = null
	var tags: List<com.amazonaws.services.simpleemail.model.MessageTag>? = null
	var configurationSetName: String? = null
	var templateArn: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.SendTemplatedEmailRequest {
		val input = com.amazonaws.services.simpleemail.model.SendTemplatedEmailRequest()
		input.setSource(this.source)
		input.setDestination(this.destination)
		input.setReplyToAddresses(this.replyToAddresses)
		input.setReturnPath(this.returnPath)
		input.setSourceArn(this.sourceArn)
		input.setReturnPathArn(this.returnPathArn)
		input.setTags(this.tags)
		input.setConfigurationSetName(this.configurationSetName)
		input.setTemplate(this.template)
		input.setTemplateArn(this.templateArn)
		input.setTemplateData(this.templateData)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.sendTemplatedEmail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses send-templated-email")
				.argument("source", source)
				.argument("destination", destination.toString())
				.argument("reply-to-addresses", replyToAddresses?.toString())
				.argument("return-path", returnPath)
				.argument("source-arn", sourceArn)
				.argument("return-path-arn", returnPathArn)
				.argument("tags", tags?.toString())
				.argument("configuration-set-name", configurationSetName)
				.argument("template", template)
				.argument("template-arn", templateArn)
				.argument("template-data", templateData)
	}

}


fun AmazonSimpleEmailServiceFunctions.setActiveReceiptRuleSet(init: AmazonSimpleEmailServiceSetActiveReceiptRuleSetCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceSetActiveReceiptRuleSetCommand().apply(init))
}

@Generated
class AmazonSimpleEmailServiceSetActiveReceiptRuleSetCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetRequest> {

	var ruleSetName: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetRequest {
		val input = com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetRequest()
		input.setRuleSetName(this.ruleSetName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.setActiveReceiptRuleSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses set-active-receipt-rule-set")
				.argument("rule-set-name", ruleSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.setIdentityDkimEnabled(identity: String, dkimEnabled: Boolean, init: AmazonSimpleEmailServiceSetIdentityDkimEnabledCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceSetIdentityDkimEnabledCommand(identity, dkimEnabled).apply(init))
}

@Generated
class AmazonSimpleEmailServiceSetIdentityDkimEnabledCommand(val identity: String, val dkimEnabled: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest {
		val input = com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest()
		input.setIdentity(this.identity)
		input.setDkimEnabled(this.dkimEnabled)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.setIdentityDkimEnabled(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses set-identity-dkim-enabled")
				.argument("identity", identity)
				.option("dkim-enabled", dkimEnabled ?: false)
	}

}


fun AmazonSimpleEmailServiceFunctions.setIdentityFeedbackForwardingEnabled(identity: String, forwardingEnabled: Boolean, init: AmazonSimpleEmailServiceSetIdentityFeedbackForwardingEnabledCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceSetIdentityFeedbackForwardingEnabledCommand(identity, forwardingEnabled).apply(init))
}

@Generated
class AmazonSimpleEmailServiceSetIdentityFeedbackForwardingEnabledCommand(val identity: String, val forwardingEnabled: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest {
		val input = com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest()
		input.setIdentity(this.identity)
		input.setForwardingEnabled(this.forwardingEnabled)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.setIdentityFeedbackForwardingEnabled(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses set-identity-feedback-forwarding-enabled")
				.argument("identity", identity)
				.option("forwarding-enabled", forwardingEnabled ?: false)
	}

}


fun AmazonSimpleEmailServiceFunctions.setIdentityHeadersInNotificationsEnabled(identity: String, notificationType: NotificationType, enabled: Boolean, init: AmazonSimpleEmailServiceSetIdentityHeadersInNotificationsEnabledCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceSetIdentityHeadersInNotificationsEnabledCommand(identity, notificationType, enabled).apply(init))
}

@Generated
class AmazonSimpleEmailServiceSetIdentityHeadersInNotificationsEnabledCommand(val identity: String, val notificationType: NotificationType, val enabled: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledRequest {
		val input = com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledRequest()
		input.setIdentity(this.identity)
		input.setNotificationType(this.notificationType.toString())
		input.setEnabled(this.enabled)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.setIdentityHeadersInNotificationsEnabled(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses set-identity-headers-in-notifications-enabled")
				.argument("identity", identity)
				.argument("notification-type", notificationType.toString())
				.option("enabled", enabled ?: false)
	}

}


fun AmazonSimpleEmailServiceFunctions.setIdentityMailFromDomain(identity: String, init: AmazonSimpleEmailServiceSetIdentityMailFromDomainCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceSetIdentityMailFromDomainCommand(identity).apply(init))
}

@Generated
class AmazonSimpleEmailServiceSetIdentityMailFromDomainCommand(val identity: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainRequest> {

	var mailFromDomain: String? = null
	var behaviorOnMXFailure: BehaviorOnMXFailure? = null

	override fun build(): com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainRequest {
		val input = com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainRequest()
		input.setIdentity(this.identity)
		input.setMailFromDomain(this.mailFromDomain)
		input.setBehaviorOnMXFailure(this.behaviorOnMXFailure?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.setIdentityMailFromDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses set-identity-mail-from-domain")
				.argument("identity", identity)
				.argument("mail-from-domain", mailFromDomain)
				.argument("behavior-on-mxfailure", behaviorOnMXFailure?.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.setIdentityNotificationTopic(identity: String, notificationType: NotificationType, init: AmazonSimpleEmailServiceSetIdentityNotificationTopicCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceSetIdentityNotificationTopicCommand(identity, notificationType).apply(init))
}

@Generated
class AmazonSimpleEmailServiceSetIdentityNotificationTopicCommand(val identity: String, val notificationType: NotificationType) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest> {

	var snsTopic: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest {
		val input = com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest()
		input.setIdentity(this.identity)
		input.setNotificationType(this.notificationType.toString())
		input.setSnsTopic(this.snsTopic)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.setIdentityNotificationTopic(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses set-identity-notification-topic")
				.argument("identity", identity)
				.argument("notification-type", notificationType.toString())
				.argument("sns-topic", snsTopic)
	}

}


fun AmazonSimpleEmailServiceFunctions.setReceiptRulePosition(ruleSetName: String, ruleName: String, init: AmazonSimpleEmailServiceSetReceiptRulePositionCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceSetReceiptRulePositionCommand(ruleSetName, ruleName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceSetReceiptRulePositionCommand(val ruleSetName: String, val ruleName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SetReceiptRulePositionRequest> {

	var after: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.SetReceiptRulePositionRequest {
		val input = com.amazonaws.services.simpleemail.model.SetReceiptRulePositionRequest()
		input.setRuleSetName(this.ruleSetName)
		input.setRuleName(this.ruleName)
		input.setAfter(this.after)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.setReceiptRulePosition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses set-receipt-rule-position")
				.argument("rule-set-name", ruleSetName)
				.argument("rule-name", ruleName)
				.argument("after", after)
	}

}


fun AmazonSimpleEmailServiceFunctions.testRenderTemplate(templateName: String, templateData: String, init: AmazonSimpleEmailServiceTestRenderTemplateCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceTestRenderTemplateCommand(templateName, templateData).apply(init))
}

@Generated
class AmazonSimpleEmailServiceTestRenderTemplateCommand(val templateName: String, val templateData: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.TestRenderTemplateRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.TestRenderTemplateRequest {
		val input = com.amazonaws.services.simpleemail.model.TestRenderTemplateRequest()
		input.setTemplateName(this.templateName)
		input.setTemplateData(this.templateData)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.testRenderTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses test-render-template")
				.argument("template-name", templateName)
				.argument("template-data", templateData)
	}

}


fun AmazonSimpleEmailServiceFunctions.updateAccountSendingEnabled(init: AmazonSimpleEmailServiceUpdateAccountSendingEnabledCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceUpdateAccountSendingEnabledCommand().apply(init))
}

@Generated
class AmazonSimpleEmailServiceUpdateAccountSendingEnabledCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledRequest> {

	var enabled: Boolean? = false

	override fun build(): com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledRequest {
		val input = com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledRequest()
		input.setEnabled(this.enabled)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.updateAccountSendingEnabled(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses update-account-sending-enabled")
				.option("enabled", enabled ?: false)
	}

}


fun AmazonSimpleEmailServiceFunctions.updateConfigurationSetEventDestination(configurationSetName: String, eventDestination: com.amazonaws.services.simpleemail.model.EventDestination, init: AmazonSimpleEmailServiceUpdateConfigurationSetEventDestinationCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceUpdateConfigurationSetEventDestinationCommand(configurationSetName, eventDestination).apply(init))
}

@Generated
class AmazonSimpleEmailServiceUpdateConfigurationSetEventDestinationCommand(val configurationSetName: String, val eventDestination: com.amazonaws.services.simpleemail.model.EventDestination) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationRequest {
		val input = com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationRequest()
		input.setConfigurationSetName(this.configurationSetName)
		input.setEventDestination(this.eventDestination)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.updateConfigurationSetEventDestination(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses update-configuration-set-event-destination")
				.argument("configuration-set-name", configurationSetName)
				.argument("event-destination", eventDestination.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.updateConfigurationSetReputationMetricsEnabled(configurationSetName: String, enabled: Boolean, init: AmazonSimpleEmailServiceUpdateConfigurationSetReputationMetricsEnabledCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceUpdateConfigurationSetReputationMetricsEnabledCommand(configurationSetName, enabled).apply(init))
}

@Generated
class AmazonSimpleEmailServiceUpdateConfigurationSetReputationMetricsEnabledCommand(val configurationSetName: String, val enabled: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledRequest {
		val input = com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledRequest()
		input.setConfigurationSetName(this.configurationSetName)
		input.setEnabled(this.enabled)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.updateConfigurationSetReputationMetricsEnabled(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses update-configuration-set-reputation-metrics-enabled")
				.argument("configuration-set-name", configurationSetName)
				.option("enabled", enabled ?: false)
	}

}


fun AmazonSimpleEmailServiceFunctions.updateConfigurationSetSendingEnabled(configurationSetName: String, enabled: Boolean, init: AmazonSimpleEmailServiceUpdateConfigurationSetSendingEnabledCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceUpdateConfigurationSetSendingEnabledCommand(configurationSetName, enabled).apply(init))
}

@Generated
class AmazonSimpleEmailServiceUpdateConfigurationSetSendingEnabledCommand(val configurationSetName: String, val enabled: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledRequest {
		val input = com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledRequest()
		input.setConfigurationSetName(this.configurationSetName)
		input.setEnabled(this.enabled)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.updateConfigurationSetSendingEnabled(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses update-configuration-set-sending-enabled")
				.argument("configuration-set-name", configurationSetName)
				.option("enabled", enabled ?: false)
	}

}


fun AmazonSimpleEmailServiceFunctions.updateConfigurationSetTrackingOptions(configurationSetName: String, trackingOptions: com.amazonaws.services.simpleemail.model.TrackingOptions, init: AmazonSimpleEmailServiceUpdateConfigurationSetTrackingOptionsCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceUpdateConfigurationSetTrackingOptionsCommand(configurationSetName, trackingOptions).apply(init))
}

@Generated
class AmazonSimpleEmailServiceUpdateConfigurationSetTrackingOptionsCommand(val configurationSetName: String, val trackingOptions: com.amazonaws.services.simpleemail.model.TrackingOptions) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsRequest {
		val input = com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsRequest()
		input.setConfigurationSetName(this.configurationSetName)
		input.setTrackingOptions(this.trackingOptions)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.updateConfigurationSetTrackingOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses update-configuration-set-tracking-options")
				.argument("configuration-set-name", configurationSetName)
				.argument("tracking-options", trackingOptions.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.updateCustomVerificationEmailTemplate(templateName: String, init: AmazonSimpleEmailServiceUpdateCustomVerificationEmailTemplateCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceUpdateCustomVerificationEmailTemplateCommand(templateName).apply(init))
}

@Generated
class AmazonSimpleEmailServiceUpdateCustomVerificationEmailTemplateCommand(val templateName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateRequest> {

	var fromEmailAddress: String? = null
	var templateSubject: String? = null
	var templateContent: String? = null
	var successRedirectionURL: String? = null
	var failureRedirectionURL: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateRequest {
		val input = com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateRequest()
		input.setTemplateName(this.templateName)
		input.setFromEmailAddress(this.fromEmailAddress)
		input.setTemplateSubject(this.templateSubject)
		input.setTemplateContent(this.templateContent)
		input.setSuccessRedirectionURL(this.successRedirectionURL)
		input.setFailureRedirectionURL(this.failureRedirectionURL)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.updateCustomVerificationEmailTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses update-custom-verification-email-template")
				.argument("template-name", templateName)
				.argument("from-email-address", fromEmailAddress)
				.argument("template-subject", templateSubject)
				.argument("template-content", templateContent)
				.argument("success-redirection-url", successRedirectionURL)
				.argument("failure-redirection-url", failureRedirectionURL)
	}

}


fun AmazonSimpleEmailServiceFunctions.updateReceiptRule(ruleSetName: String, rule: com.amazonaws.services.simpleemail.model.ReceiptRule, init: AmazonSimpleEmailServiceUpdateReceiptRuleCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceUpdateReceiptRuleCommand(ruleSetName, rule).apply(init))
}

@Generated
class AmazonSimpleEmailServiceUpdateReceiptRuleCommand(val ruleSetName: String, val rule: com.amazonaws.services.simpleemail.model.ReceiptRule) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.UpdateReceiptRuleRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.UpdateReceiptRuleRequest {
		val input = com.amazonaws.services.simpleemail.model.UpdateReceiptRuleRequest()
		input.setRuleSetName(this.ruleSetName)
		input.setRule(this.rule)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.updateReceiptRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses update-receipt-rule")
				.argument("rule-set-name", ruleSetName)
				.argument("rule", rule.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.updateTemplate(template: com.amazonaws.services.simpleemail.model.Template, init: AmazonSimpleEmailServiceUpdateTemplateCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceUpdateTemplateCommand(template).apply(init))
}

@Generated
class AmazonSimpleEmailServiceUpdateTemplateCommand(val template: com.amazonaws.services.simpleemail.model.Template) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.UpdateTemplateRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.UpdateTemplateRequest {
		val input = com.amazonaws.services.simpleemail.model.UpdateTemplateRequest()
		input.setTemplate(this.template)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.updateTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses update-template")
				.argument("template", template.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.verifyDomainDkim(domain: String, init: AmazonSimpleEmailServiceVerifyDomainDkimCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceVerifyDomainDkimCommand(domain).apply(init))
}

@Generated
class AmazonSimpleEmailServiceVerifyDomainDkimCommand(val domain: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest {
		val input = com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest()
		input.setDomain(this.domain)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.verifyDomainDkim(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses verify-domain-dkim")
				.argument("domain", domain)
	}

}


fun AmazonSimpleEmailServiceFunctions.verifyDomainIdentity(domain: String, init: AmazonSimpleEmailServiceVerifyDomainIdentityCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceVerifyDomainIdentityCommand(domain).apply(init))
}

@Generated
class AmazonSimpleEmailServiceVerifyDomainIdentityCommand(val domain: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest {
		val input = com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest()
		input.setDomain(this.domain)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.verifyDomainIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses verify-domain-identity")
				.argument("domain", domain)
	}

}


fun AmazonSimpleEmailServiceFunctions.verifyEmailAddress(emailAddress: String, init: AmazonSimpleEmailServiceVerifyEmailAddressCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceVerifyEmailAddressCommand(emailAddress).apply(init))
}

@Generated
class AmazonSimpleEmailServiceVerifyEmailAddressCommand(val emailAddress: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest {
		val input = com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest()
		input.setEmailAddress(this.emailAddress)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.verifyEmailAddress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses verify-email-address")
				.argument("email-address", emailAddress)
	}

}


fun AmazonSimpleEmailServiceFunctions.verifyEmailIdentity(emailAddress: String, init: AmazonSimpleEmailServiceVerifyEmailIdentityCommand.() -> Unit) {
	this.block.declare(AmazonSimpleEmailServiceVerifyEmailIdentityCommand(emailAddress).apply(init))
}

@Generated
class AmazonSimpleEmailServiceVerifyEmailIdentityCommand(val emailAddress: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest> {



	override fun build(): com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest {
		val input = com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest()
		input.setEmailAddress(this.emailAddress)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.ses.verifyEmailIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses verify-email-identity")
				.argument("email-address", emailAddress)
	}

}
