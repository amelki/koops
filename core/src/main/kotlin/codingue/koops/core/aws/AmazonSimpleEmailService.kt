
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder
import com.amazonaws.services.simpleemail.model.*

var codingue.koops.core.Environment.ses: AmazonSimpleEmailService
	get() {
		var service = this.capabilities[AmazonSimpleEmailService::class.java.name]
		if (service == null) {
			service = AmazonSimpleEmailServiceClientBuilder.standard().build()
			ses = service
		}
		return service as AmazonSimpleEmailService
	}
	set(ses) {
		this.capabilities[AmazonSimpleEmailService::class.java.name] = ses
	}

@Generated
class AmazonSimpleEmailServiceFunctions(val block: Block)

infix fun <T> AwsContinuation.ses(init: AmazonSimpleEmailServiceFunctions.() -> T): T {
	return AmazonSimpleEmailServiceFunctions(shell).run(init)
}

			

fun AmazonSimpleEmailServiceFunctions.cloneReceiptRuleSet(ruleSetName: String, originalRuleSetName: String, init: AmazonSimpleEmailServiceCloneReceiptRuleSetCommand.() -> Unit): com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetResult {
	return this.block.declare(AmazonSimpleEmailServiceCloneReceiptRuleSetCommand(ruleSetName, originalRuleSetName).apply(init)) as com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetResult
}

@Generated
class AmazonSimpleEmailServiceCloneReceiptRuleSetCommand(val ruleSetName: String, val originalRuleSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetRequest, com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetRequest {
		val input = com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetRequest()
		input.setRuleSetName(this.ruleSetName)
		input.setOriginalRuleSetName(this.originalRuleSetName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetResult {
	  return com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetResult {
		return environment.ses.cloneReceiptRuleSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses clone-receipt-rule-set")
				.argument("rule-set-name", ruleSetName)
				.argument("original-rule-set-name", originalRuleSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.createConfigurationSet(configurationSet: com.amazonaws.services.simpleemail.model.ConfigurationSet, init: AmazonSimpleEmailServiceCreateConfigurationSetCommand.() -> Unit): com.amazonaws.services.simpleemail.model.CreateConfigurationSetResult {
	return this.block.declare(AmazonSimpleEmailServiceCreateConfigurationSetCommand(configurationSet).apply(init)) as com.amazonaws.services.simpleemail.model.CreateConfigurationSetResult
}

@Generated
class AmazonSimpleEmailServiceCreateConfigurationSetCommand(val configurationSet: com.amazonaws.services.simpleemail.model.ConfigurationSet) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CreateConfigurationSetRequest, com.amazonaws.services.simpleemail.model.CreateConfigurationSetResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.CreateConfigurationSetRequest {
		val input = com.amazonaws.services.simpleemail.model.CreateConfigurationSetRequest()
		input.setConfigurationSet(this.configurationSet)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.CreateConfigurationSetResult {
	  return com.amazonaws.services.simpleemail.model.CreateConfigurationSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.CreateConfigurationSetResult {
		return environment.ses.createConfigurationSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses create-configuration-set")
				.argument("configuration-set", configurationSet.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.createConfigurationSetEventDestination(configurationSetName: String, eventDestination: com.amazonaws.services.simpleemail.model.EventDestination, init: AmazonSimpleEmailServiceCreateConfigurationSetEventDestinationCommand.() -> Unit): com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationResult {
	return this.block.declare(AmazonSimpleEmailServiceCreateConfigurationSetEventDestinationCommand(configurationSetName, eventDestination).apply(init)) as com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationResult
}

@Generated
class AmazonSimpleEmailServiceCreateConfigurationSetEventDestinationCommand(val configurationSetName: String, val eventDestination: com.amazonaws.services.simpleemail.model.EventDestination) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationRequest, com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationRequest {
		val input = com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationRequest()
		input.setConfigurationSetName(this.configurationSetName)
		input.setEventDestination(this.eventDestination)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationResult {
	  return com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationResult {
		return environment.ses.createConfigurationSetEventDestination(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses create-configuration-set-event-destination")
				.argument("configuration-set-name", configurationSetName)
				.argument("event-destination", eventDestination.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.createConfigurationSetTrackingOptions(configurationSetName: String, trackingOptions: com.amazonaws.services.simpleemail.model.TrackingOptions, init: AmazonSimpleEmailServiceCreateConfigurationSetTrackingOptionsCommand.() -> Unit): com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsResult {
	return this.block.declare(AmazonSimpleEmailServiceCreateConfigurationSetTrackingOptionsCommand(configurationSetName, trackingOptions).apply(init)) as com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsResult
}

@Generated
class AmazonSimpleEmailServiceCreateConfigurationSetTrackingOptionsCommand(val configurationSetName: String, val trackingOptions: com.amazonaws.services.simpleemail.model.TrackingOptions) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsRequest, com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsRequest {
		val input = com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsRequest()
		input.setConfigurationSetName(this.configurationSetName)
		input.setTrackingOptions(this.trackingOptions)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsResult {
	  return com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsResult {
		return environment.ses.createConfigurationSetTrackingOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses create-configuration-set-tracking-options")
				.argument("configuration-set-name", configurationSetName)
				.argument("tracking-options", trackingOptions.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.createCustomVerificationEmailTemplate(templateName: String, fromEmailAddress: String, templateSubject: String, templateContent: String, successRedirectionURL: String, failureRedirectionURL: String, init: AmazonSimpleEmailServiceCreateCustomVerificationEmailTemplateCommand.() -> Unit): com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateResult {
	return this.block.declare(AmazonSimpleEmailServiceCreateCustomVerificationEmailTemplateCommand(templateName, fromEmailAddress, templateSubject, templateContent, successRedirectionURL, failureRedirectionURL).apply(init)) as com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateResult
}

@Generated
class AmazonSimpleEmailServiceCreateCustomVerificationEmailTemplateCommand(val templateName: String, val fromEmailAddress: String, val templateSubject: String, val templateContent: String, val successRedirectionURL: String, val failureRedirectionURL: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateRequest, com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateResult> {



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

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateResult {
	  return com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateResult {
		return environment.ses.createCustomVerificationEmailTemplate(build())
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


fun AmazonSimpleEmailServiceFunctions.createReceiptFilter(filter: com.amazonaws.services.simpleemail.model.ReceiptFilter, init: AmazonSimpleEmailServiceCreateReceiptFilterCommand.() -> Unit): com.amazonaws.services.simpleemail.model.CreateReceiptFilterResult {
	return this.block.declare(AmazonSimpleEmailServiceCreateReceiptFilterCommand(filter).apply(init)) as com.amazonaws.services.simpleemail.model.CreateReceiptFilterResult
}

@Generated
class AmazonSimpleEmailServiceCreateReceiptFilterCommand(val filter: com.amazonaws.services.simpleemail.model.ReceiptFilter) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CreateReceiptFilterRequest, com.amazonaws.services.simpleemail.model.CreateReceiptFilterResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.CreateReceiptFilterRequest {
		val input = com.amazonaws.services.simpleemail.model.CreateReceiptFilterRequest()
		input.setFilter(this.filter)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.CreateReceiptFilterResult {
	  return com.amazonaws.services.simpleemail.model.CreateReceiptFilterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.CreateReceiptFilterResult {
		return environment.ses.createReceiptFilter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses create-receipt-filter")
				.argument("filter", filter.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.createReceiptRule(ruleSetName: String, rule: com.amazonaws.services.simpleemail.model.ReceiptRule, init: AmazonSimpleEmailServiceCreateReceiptRuleCommand.() -> Unit): com.amazonaws.services.simpleemail.model.CreateReceiptRuleResult {
	return this.block.declare(AmazonSimpleEmailServiceCreateReceiptRuleCommand(ruleSetName, rule).apply(init)) as com.amazonaws.services.simpleemail.model.CreateReceiptRuleResult
}

@Generated
class AmazonSimpleEmailServiceCreateReceiptRuleCommand(val ruleSetName: String, val rule: com.amazonaws.services.simpleemail.model.ReceiptRule) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CreateReceiptRuleRequest, com.amazonaws.services.simpleemail.model.CreateReceiptRuleResult> {

	var after: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.CreateReceiptRuleRequest {
		val input = com.amazonaws.services.simpleemail.model.CreateReceiptRuleRequest()
		input.setRuleSetName(this.ruleSetName)
		input.setAfter(this.after)
		input.setRule(this.rule)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.CreateReceiptRuleResult {
	  return com.amazonaws.services.simpleemail.model.CreateReceiptRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.CreateReceiptRuleResult {
		return environment.ses.createReceiptRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses create-receipt-rule")
				.argument("rule-set-name", ruleSetName)
				.argument("after", after)
				.argument("rule", rule.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.createReceiptRuleSet(ruleSetName: String, init: AmazonSimpleEmailServiceCreateReceiptRuleSetCommand.() -> Unit): com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetResult {
	return this.block.declare(AmazonSimpleEmailServiceCreateReceiptRuleSetCommand(ruleSetName).apply(init)) as com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetResult
}

@Generated
class AmazonSimpleEmailServiceCreateReceiptRuleSetCommand(val ruleSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetRequest, com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetRequest {
		val input = com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetRequest()
		input.setRuleSetName(this.ruleSetName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetResult {
	  return com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetResult {
		return environment.ses.createReceiptRuleSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses create-receipt-rule-set")
				.argument("rule-set-name", ruleSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.createTemplate(template: com.amazonaws.services.simpleemail.model.Template, init: AmazonSimpleEmailServiceCreateTemplateCommand.() -> Unit): com.amazonaws.services.simpleemail.model.CreateTemplateResult {
	return this.block.declare(AmazonSimpleEmailServiceCreateTemplateCommand(template).apply(init)) as com.amazonaws.services.simpleemail.model.CreateTemplateResult
}

@Generated
class AmazonSimpleEmailServiceCreateTemplateCommand(val template: com.amazonaws.services.simpleemail.model.Template) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.CreateTemplateRequest, com.amazonaws.services.simpleemail.model.CreateTemplateResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.CreateTemplateRequest {
		val input = com.amazonaws.services.simpleemail.model.CreateTemplateRequest()
		input.setTemplate(this.template)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.CreateTemplateResult {
	  return com.amazonaws.services.simpleemail.model.CreateTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.CreateTemplateResult {
		return environment.ses.createTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses create-template")
				.argument("template", template.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteConfigurationSet(configurationSetName: String, init: AmazonSimpleEmailServiceDeleteConfigurationSetCommand.() -> Unit): com.amazonaws.services.simpleemail.model.DeleteConfigurationSetResult {
	return this.block.declare(AmazonSimpleEmailServiceDeleteConfigurationSetCommand(configurationSetName).apply(init)) as com.amazonaws.services.simpleemail.model.DeleteConfigurationSetResult
}

@Generated
class AmazonSimpleEmailServiceDeleteConfigurationSetCommand(val configurationSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteConfigurationSetRequest, com.amazonaws.services.simpleemail.model.DeleteConfigurationSetResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteConfigurationSetRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteConfigurationSetRequest()
		input.setConfigurationSetName(this.configurationSetName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.DeleteConfigurationSetResult {
	  return com.amazonaws.services.simpleemail.model.DeleteConfigurationSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.DeleteConfigurationSetResult {
		return environment.ses.deleteConfigurationSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-configuration-set")
				.argument("configuration-set-name", configurationSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteConfigurationSetEventDestination(configurationSetName: String, eventDestinationName: String, init: AmazonSimpleEmailServiceDeleteConfigurationSetEventDestinationCommand.() -> Unit): com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationResult {
	return this.block.declare(AmazonSimpleEmailServiceDeleteConfigurationSetEventDestinationCommand(configurationSetName, eventDestinationName).apply(init)) as com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationResult
}

@Generated
class AmazonSimpleEmailServiceDeleteConfigurationSetEventDestinationCommand(val configurationSetName: String, val eventDestinationName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationRequest, com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationRequest()
		input.setConfigurationSetName(this.configurationSetName)
		input.setEventDestinationName(this.eventDestinationName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationResult {
	  return com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationResult {
		return environment.ses.deleteConfigurationSetEventDestination(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-configuration-set-event-destination")
				.argument("configuration-set-name", configurationSetName)
				.argument("event-destination-name", eventDestinationName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteConfigurationSetTrackingOptions(configurationSetName: String, init: AmazonSimpleEmailServiceDeleteConfigurationSetTrackingOptionsCommand.() -> Unit): com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsResult {
	return this.block.declare(AmazonSimpleEmailServiceDeleteConfigurationSetTrackingOptionsCommand(configurationSetName).apply(init)) as com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsResult
}

@Generated
class AmazonSimpleEmailServiceDeleteConfigurationSetTrackingOptionsCommand(val configurationSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsRequest, com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsRequest()
		input.setConfigurationSetName(this.configurationSetName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsResult {
	  return com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsResult {
		return environment.ses.deleteConfigurationSetTrackingOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-configuration-set-tracking-options")
				.argument("configuration-set-name", configurationSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteCustomVerificationEmailTemplate(templateName: String, init: AmazonSimpleEmailServiceDeleteCustomVerificationEmailTemplateCommand.() -> Unit): com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateResult {
	return this.block.declare(AmazonSimpleEmailServiceDeleteCustomVerificationEmailTemplateCommand(templateName).apply(init)) as com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateResult
}

@Generated
class AmazonSimpleEmailServiceDeleteCustomVerificationEmailTemplateCommand(val templateName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateRequest, com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateRequest()
		input.setTemplateName(this.templateName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateResult {
	  return com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateResult {
		return environment.ses.deleteCustomVerificationEmailTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-custom-verification-email-template")
				.argument("template-name", templateName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteIdentity(identity: String, init: AmazonSimpleEmailServiceDeleteIdentityCommand.() -> Unit): com.amazonaws.services.simpleemail.model.DeleteIdentityResult {
	return this.block.declare(AmazonSimpleEmailServiceDeleteIdentityCommand(identity).apply(init)) as com.amazonaws.services.simpleemail.model.DeleteIdentityResult
}

@Generated
class AmazonSimpleEmailServiceDeleteIdentityCommand(val identity: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteIdentityRequest, com.amazonaws.services.simpleemail.model.DeleteIdentityResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteIdentityRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteIdentityRequest()
		input.setIdentity(this.identity)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.DeleteIdentityResult {
	  return com.amazonaws.services.simpleemail.model.DeleteIdentityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.DeleteIdentityResult {
		return environment.ses.deleteIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-identity")
				.argument("identity", identity)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteIdentityPolicy(identity: String, policyName: String, init: AmazonSimpleEmailServiceDeleteIdentityPolicyCommand.() -> Unit): com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyResult {
	return this.block.declare(AmazonSimpleEmailServiceDeleteIdentityPolicyCommand(identity, policyName).apply(init)) as com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyResult
}

@Generated
class AmazonSimpleEmailServiceDeleteIdentityPolicyCommand(val identity: String, val policyName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest, com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest()
		input.setIdentity(this.identity)
		input.setPolicyName(this.policyName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyResult {
	  return com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyResult {
		return environment.ses.deleteIdentityPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-identity-policy")
				.argument("identity", identity)
				.argument("policy-name", policyName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteReceiptFilter(filterName: String, init: AmazonSimpleEmailServiceDeleteReceiptFilterCommand.() -> Unit): com.amazonaws.services.simpleemail.model.DeleteReceiptFilterResult {
	return this.block.declare(AmazonSimpleEmailServiceDeleteReceiptFilterCommand(filterName).apply(init)) as com.amazonaws.services.simpleemail.model.DeleteReceiptFilterResult
}

@Generated
class AmazonSimpleEmailServiceDeleteReceiptFilterCommand(val filterName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteReceiptFilterRequest, com.amazonaws.services.simpleemail.model.DeleteReceiptFilterResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteReceiptFilterRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteReceiptFilterRequest()
		input.setFilterName(this.filterName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.DeleteReceiptFilterResult {
	  return com.amazonaws.services.simpleemail.model.DeleteReceiptFilterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.DeleteReceiptFilterResult {
		return environment.ses.deleteReceiptFilter(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-receipt-filter")
				.argument("filter-name", filterName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteReceiptRule(ruleSetName: String, ruleName: String, init: AmazonSimpleEmailServiceDeleteReceiptRuleCommand.() -> Unit): com.amazonaws.services.simpleemail.model.DeleteReceiptRuleResult {
	return this.block.declare(AmazonSimpleEmailServiceDeleteReceiptRuleCommand(ruleSetName, ruleName).apply(init)) as com.amazonaws.services.simpleemail.model.DeleteReceiptRuleResult
}

@Generated
class AmazonSimpleEmailServiceDeleteReceiptRuleCommand(val ruleSetName: String, val ruleName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteReceiptRuleRequest, com.amazonaws.services.simpleemail.model.DeleteReceiptRuleResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteReceiptRuleRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteReceiptRuleRequest()
		input.setRuleSetName(this.ruleSetName)
		input.setRuleName(this.ruleName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.DeleteReceiptRuleResult {
	  return com.amazonaws.services.simpleemail.model.DeleteReceiptRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.DeleteReceiptRuleResult {
		return environment.ses.deleteReceiptRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-receipt-rule")
				.argument("rule-set-name", ruleSetName)
				.argument("rule-name", ruleName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteReceiptRuleSet(ruleSetName: String, init: AmazonSimpleEmailServiceDeleteReceiptRuleSetCommand.() -> Unit): com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetResult {
	return this.block.declare(AmazonSimpleEmailServiceDeleteReceiptRuleSetCommand(ruleSetName).apply(init)) as com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetResult
}

@Generated
class AmazonSimpleEmailServiceDeleteReceiptRuleSetCommand(val ruleSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetRequest, com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetRequest()
		input.setRuleSetName(this.ruleSetName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetResult {
	  return com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetResult {
		return environment.ses.deleteReceiptRuleSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-receipt-rule-set")
				.argument("rule-set-name", ruleSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteTemplate(templateName: String, init: AmazonSimpleEmailServiceDeleteTemplateCommand.() -> Unit): com.amazonaws.services.simpleemail.model.DeleteTemplateResult {
	return this.block.declare(AmazonSimpleEmailServiceDeleteTemplateCommand(templateName).apply(init)) as com.amazonaws.services.simpleemail.model.DeleteTemplateResult
}

@Generated
class AmazonSimpleEmailServiceDeleteTemplateCommand(val templateName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteTemplateRequest, com.amazonaws.services.simpleemail.model.DeleteTemplateResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteTemplateRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteTemplateRequest()
		input.setTemplateName(this.templateName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.DeleteTemplateResult {
	  return com.amazonaws.services.simpleemail.model.DeleteTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.DeleteTemplateResult {
		return environment.ses.deleteTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-template")
				.argument("template-name", templateName)
	}

}


fun AmazonSimpleEmailServiceFunctions.deleteVerifiedEmailAddress(emailAddress: String, init: AmazonSimpleEmailServiceDeleteVerifiedEmailAddressCommand.() -> Unit): com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressResult {
	return this.block.declare(AmazonSimpleEmailServiceDeleteVerifiedEmailAddressCommand(emailAddress).apply(init)) as com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressResult
}

@Generated
class AmazonSimpleEmailServiceDeleteVerifiedEmailAddressCommand(val emailAddress: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest, com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest {
		val input = com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest()
		input.setEmailAddress(this.emailAddress)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressResult {
	  return com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressResult {
		return environment.ses.deleteVerifiedEmailAddress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses delete-verified-email-address")
				.argument("email-address", emailAddress)
	}

}


fun AmazonSimpleEmailServiceFunctions.describeActiveReceiptRuleSet(init: AmazonSimpleEmailServiceDescribeActiveReceiptRuleSetCommand.() -> Unit): com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetResult {
	return this.block.declare(AmazonSimpleEmailServiceDescribeActiveReceiptRuleSetCommand().apply(init)) as com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetResult
}

@Generated
class AmazonSimpleEmailServiceDescribeActiveReceiptRuleSetCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetRequest, com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetRequest {
		val input = com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetResult {
	  return com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetResult {
		return environment.ses.describeActiveReceiptRuleSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses describe-active-receipt-rule-set")

	}

}


fun AmazonSimpleEmailServiceFunctions.describeConfigurationSet(configurationSetName: String, init: AmazonSimpleEmailServiceDescribeConfigurationSetCommand.() -> Unit): com.amazonaws.services.simpleemail.model.DescribeConfigurationSetResult {
	return this.block.declare(AmazonSimpleEmailServiceDescribeConfigurationSetCommand(configurationSetName).apply(init)) as com.amazonaws.services.simpleemail.model.DescribeConfigurationSetResult
}

@Generated
class AmazonSimpleEmailServiceDescribeConfigurationSetCommand(val configurationSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DescribeConfigurationSetRequest, com.amazonaws.services.simpleemail.model.DescribeConfigurationSetResult> {

	var configurationSetAttributeNames: List<ConfigurationSetAttribute>? = null

	override fun build(): com.amazonaws.services.simpleemail.model.DescribeConfigurationSetRequest {
		val input = com.amazonaws.services.simpleemail.model.DescribeConfigurationSetRequest()
		input.setConfigurationSetName(this.configurationSetName)
		input.setConfigurationSetAttributeNames(this.configurationSetAttributeNames?.map { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.DescribeConfigurationSetResult {
	  return com.amazonaws.services.simpleemail.model.DescribeConfigurationSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.DescribeConfigurationSetResult {
		return environment.ses.describeConfigurationSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses describe-configuration-set")
				.argument("configuration-set-name", configurationSetName)
				.argument("configuration-set-attribute-names", configurationSetAttributeNames?.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.describeReceiptRule(ruleSetName: String, ruleName: String, init: AmazonSimpleEmailServiceDescribeReceiptRuleCommand.() -> Unit): com.amazonaws.services.simpleemail.model.DescribeReceiptRuleResult {
	return this.block.declare(AmazonSimpleEmailServiceDescribeReceiptRuleCommand(ruleSetName, ruleName).apply(init)) as com.amazonaws.services.simpleemail.model.DescribeReceiptRuleResult
}

@Generated
class AmazonSimpleEmailServiceDescribeReceiptRuleCommand(val ruleSetName: String, val ruleName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DescribeReceiptRuleRequest, com.amazonaws.services.simpleemail.model.DescribeReceiptRuleResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.DescribeReceiptRuleRequest {
		val input = com.amazonaws.services.simpleemail.model.DescribeReceiptRuleRequest()
		input.setRuleSetName(this.ruleSetName)
		input.setRuleName(this.ruleName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.DescribeReceiptRuleResult {
	  return com.amazonaws.services.simpleemail.model.DescribeReceiptRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.DescribeReceiptRuleResult {
		return environment.ses.describeReceiptRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses describe-receipt-rule")
				.argument("rule-set-name", ruleSetName)
				.argument("rule-name", ruleName)
	}

}


fun AmazonSimpleEmailServiceFunctions.describeReceiptRuleSet(ruleSetName: String, init: AmazonSimpleEmailServiceDescribeReceiptRuleSetCommand.() -> Unit): com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetResult {
	return this.block.declare(AmazonSimpleEmailServiceDescribeReceiptRuleSetCommand(ruleSetName).apply(init)) as com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetResult
}

@Generated
class AmazonSimpleEmailServiceDescribeReceiptRuleSetCommand(val ruleSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetRequest, com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetRequest {
		val input = com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetRequest()
		input.setRuleSetName(this.ruleSetName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetResult {
	  return com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetResult {
		return environment.ses.describeReceiptRuleSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses describe-receipt-rule-set")
				.argument("rule-set-name", ruleSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.getAccountSendingEnabled(init: AmazonSimpleEmailServiceGetAccountSendingEnabledCommand.() -> Unit): com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledResult {
	return this.block.declare(AmazonSimpleEmailServiceGetAccountSendingEnabledCommand().apply(init)) as com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledResult
}

@Generated
class AmazonSimpleEmailServiceGetAccountSendingEnabledCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledRequest, com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledRequest {
		val input = com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledResult {
	  return com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledResult {
		return environment.ses.getAccountSendingEnabled(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-account-sending-enabled")

	}

}


fun AmazonSimpleEmailServiceFunctions.getCustomVerificationEmailTemplate(templateName: String, init: AmazonSimpleEmailServiceGetCustomVerificationEmailTemplateCommand.() -> Unit): com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateResult {
	return this.block.declare(AmazonSimpleEmailServiceGetCustomVerificationEmailTemplateCommand(templateName).apply(init)) as com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateResult
}

@Generated
class AmazonSimpleEmailServiceGetCustomVerificationEmailTemplateCommand(val templateName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateRequest, com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateRequest {
		val input = com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateRequest()
		input.setTemplateName(this.templateName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateResult {
	  return com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateResult {
		return environment.ses.getCustomVerificationEmailTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-custom-verification-email-template")
				.argument("template-name", templateName)
	}

}


fun AmazonSimpleEmailServiceFunctions.getIdentityDkimAttributes(identities: List<String>, init: AmazonSimpleEmailServiceGetIdentityDkimAttributesCommand.() -> Unit): com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult {
	return this.block.declare(AmazonSimpleEmailServiceGetIdentityDkimAttributesCommand(identities).apply(init)) as com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult
}

@Generated
class AmazonSimpleEmailServiceGetIdentityDkimAttributesCommand(val identities: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest, com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest {
		val input = com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest()
		input.setIdentities(this.identities)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult {
	  return com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult {
		return environment.ses.getIdentityDkimAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-identity-dkim-attributes")
				.argument("identities", identities.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.getIdentityMailFromDomainAttributes(identities: List<String>, init: AmazonSimpleEmailServiceGetIdentityMailFromDomainAttributesCommand.() -> Unit): com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesResult {
	return this.block.declare(AmazonSimpleEmailServiceGetIdentityMailFromDomainAttributesCommand(identities).apply(init)) as com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesResult
}

@Generated
class AmazonSimpleEmailServiceGetIdentityMailFromDomainAttributesCommand(val identities: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesRequest, com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesRequest {
		val input = com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesRequest()
		input.setIdentities(this.identities)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesResult {
	  return com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesResult {
		return environment.ses.getIdentityMailFromDomainAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-identity-mail-from-domain-attributes")
				.argument("identities", identities.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.getIdentityNotificationAttributes(identities: List<String>, init: AmazonSimpleEmailServiceGetIdentityNotificationAttributesCommand.() -> Unit): com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesResult {
	return this.block.declare(AmazonSimpleEmailServiceGetIdentityNotificationAttributesCommand(identities).apply(init)) as com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesResult
}

@Generated
class AmazonSimpleEmailServiceGetIdentityNotificationAttributesCommand(val identities: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest, com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest {
		val input = com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest()
		input.setIdentities(this.identities)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesResult {
	  return com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesResult {
		return environment.ses.getIdentityNotificationAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-identity-notification-attributes")
				.argument("identities", identities.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.getIdentityPolicies(identity: String, policyNames: List<String>, init: AmazonSimpleEmailServiceGetIdentityPoliciesCommand.() -> Unit): com.amazonaws.services.simpleemail.model.GetIdentityPoliciesResult {
	return this.block.declare(AmazonSimpleEmailServiceGetIdentityPoliciesCommand(identity, policyNames).apply(init)) as com.amazonaws.services.simpleemail.model.GetIdentityPoliciesResult
}

@Generated
class AmazonSimpleEmailServiceGetIdentityPoliciesCommand(val identity: String, val policyNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest, com.amazonaws.services.simpleemail.model.GetIdentityPoliciesResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest {
		val input = com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest()
		input.setIdentity(this.identity)
		input.setPolicyNames(this.policyNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.GetIdentityPoliciesResult {
	  return com.amazonaws.services.simpleemail.model.GetIdentityPoliciesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.GetIdentityPoliciesResult {
		return environment.ses.getIdentityPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-identity-policies")
				.argument("identity", identity)
				.argument("policy-names", policyNames.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.getIdentityVerificationAttributes(identities: List<String>, init: AmazonSimpleEmailServiceGetIdentityVerificationAttributesCommand.() -> Unit): com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult {
	return this.block.declare(AmazonSimpleEmailServiceGetIdentityVerificationAttributesCommand(identities).apply(init)) as com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult
}

@Generated
class AmazonSimpleEmailServiceGetIdentityVerificationAttributesCommand(val identities: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest, com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest {
		val input = com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest()
		input.setIdentities(this.identities)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult {
	  return com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult {
		return environment.ses.getIdentityVerificationAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-identity-verification-attributes")
				.argument("identities", identities.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.getSendQuota(init: AmazonSimpleEmailServiceGetSendQuotaCommand.() -> Unit): com.amazonaws.services.simpleemail.model.GetSendQuotaResult {
	return this.block.declare(AmazonSimpleEmailServiceGetSendQuotaCommand().apply(init)) as com.amazonaws.services.simpleemail.model.GetSendQuotaResult
}

@Generated
class AmazonSimpleEmailServiceGetSendQuotaCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetSendQuotaRequest, com.amazonaws.services.simpleemail.model.GetSendQuotaResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetSendQuotaRequest {
		val input = com.amazonaws.services.simpleemail.model.GetSendQuotaRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.GetSendQuotaResult {
	  return com.amazonaws.services.simpleemail.model.GetSendQuotaResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.GetSendQuotaResult {
		return environment.ses.getSendQuota(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-send-quota")

	}

}


fun AmazonSimpleEmailServiceFunctions.getSendStatistics(init: AmazonSimpleEmailServiceGetSendStatisticsCommand.() -> Unit): com.amazonaws.services.simpleemail.model.GetSendStatisticsResult {
	return this.block.declare(AmazonSimpleEmailServiceGetSendStatisticsCommand().apply(init)) as com.amazonaws.services.simpleemail.model.GetSendStatisticsResult
}

@Generated
class AmazonSimpleEmailServiceGetSendStatisticsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest, com.amazonaws.services.simpleemail.model.GetSendStatisticsResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest {
		val input = com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.GetSendStatisticsResult {
	  return com.amazonaws.services.simpleemail.model.GetSendStatisticsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.GetSendStatisticsResult {
		return environment.ses.getSendStatistics(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-send-statistics")

	}

}


fun AmazonSimpleEmailServiceFunctions.getTemplate(templateName: String, init: AmazonSimpleEmailServiceGetTemplateCommand.() -> Unit): com.amazonaws.services.simpleemail.model.GetTemplateResult {
	return this.block.declare(AmazonSimpleEmailServiceGetTemplateCommand(templateName).apply(init)) as com.amazonaws.services.simpleemail.model.GetTemplateResult
}

@Generated
class AmazonSimpleEmailServiceGetTemplateCommand(val templateName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.GetTemplateRequest, com.amazonaws.services.simpleemail.model.GetTemplateResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.GetTemplateRequest {
		val input = com.amazonaws.services.simpleemail.model.GetTemplateRequest()
		input.setTemplateName(this.templateName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.GetTemplateResult {
	  return com.amazonaws.services.simpleemail.model.GetTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.GetTemplateResult {
		return environment.ses.getTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses get-template")
				.argument("template-name", templateName)
	}

}


fun AmazonSimpleEmailServiceFunctions.listConfigurationSets(init: AmazonSimpleEmailServiceListConfigurationSetsCommand.() -> Unit): com.amazonaws.services.simpleemail.model.ListConfigurationSetsResult {
	return this.block.declare(AmazonSimpleEmailServiceListConfigurationSetsCommand().apply(init)) as com.amazonaws.services.simpleemail.model.ListConfigurationSetsResult
}

@Generated
class AmazonSimpleEmailServiceListConfigurationSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ListConfigurationSetsRequest, com.amazonaws.services.simpleemail.model.ListConfigurationSetsResult> {

	var nextToken: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.simpleemail.model.ListConfigurationSetsRequest {
		val input = com.amazonaws.services.simpleemail.model.ListConfigurationSetsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.ListConfigurationSetsResult {
	  return com.amazonaws.services.simpleemail.model.ListConfigurationSetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.ListConfigurationSetsResult {
		return environment.ses.listConfigurationSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses list-configuration-sets")
				.argument("next-token", nextToken)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.listCustomVerificationEmailTemplates(init: AmazonSimpleEmailServiceListCustomVerificationEmailTemplatesCommand.() -> Unit): com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesResult {
	return this.block.declare(AmazonSimpleEmailServiceListCustomVerificationEmailTemplatesCommand().apply(init)) as com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesResult
}

@Generated
class AmazonSimpleEmailServiceListCustomVerificationEmailTemplatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesRequest, com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesRequest {
		val input = com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesResult {
	  return com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesResult {
		return environment.ses.listCustomVerificationEmailTemplates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses list-custom-verification-email-templates")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.listIdentities(init: AmazonSimpleEmailServiceListIdentitiesCommand.() -> Unit): com.amazonaws.services.simpleemail.model.ListIdentitiesResult {
	return this.block.declare(AmazonSimpleEmailServiceListIdentitiesCommand().apply(init)) as com.amazonaws.services.simpleemail.model.ListIdentitiesResult
}

@Generated
class AmazonSimpleEmailServiceListIdentitiesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ListIdentitiesRequest, com.amazonaws.services.simpleemail.model.ListIdentitiesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.ListIdentitiesResult {
	  return com.amazonaws.services.simpleemail.model.ListIdentitiesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.ListIdentitiesResult {
		return environment.ses.listIdentities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses list-identities")
				.argument("identity-type", identityType?.toString())
				.argument("next-token", nextToken)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.listIdentityPolicies(identity: String, init: AmazonSimpleEmailServiceListIdentityPoliciesCommand.() -> Unit): com.amazonaws.services.simpleemail.model.ListIdentityPoliciesResult {
	return this.block.declare(AmazonSimpleEmailServiceListIdentityPoliciesCommand(identity).apply(init)) as com.amazonaws.services.simpleemail.model.ListIdentityPoliciesResult
}

@Generated
class AmazonSimpleEmailServiceListIdentityPoliciesCommand(val identity: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest, com.amazonaws.services.simpleemail.model.ListIdentityPoliciesResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest {
		val input = com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest()
		input.setIdentity(this.identity)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.ListIdentityPoliciesResult {
	  return com.amazonaws.services.simpleemail.model.ListIdentityPoliciesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.ListIdentityPoliciesResult {
		return environment.ses.listIdentityPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses list-identity-policies")
				.argument("identity", identity)
	}

}


fun AmazonSimpleEmailServiceFunctions.listReceiptFilters(init: AmazonSimpleEmailServiceListReceiptFiltersCommand.() -> Unit): com.amazonaws.services.simpleemail.model.ListReceiptFiltersResult {
	return this.block.declare(AmazonSimpleEmailServiceListReceiptFiltersCommand().apply(init)) as com.amazonaws.services.simpleemail.model.ListReceiptFiltersResult
}

@Generated
class AmazonSimpleEmailServiceListReceiptFiltersCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ListReceiptFiltersRequest, com.amazonaws.services.simpleemail.model.ListReceiptFiltersResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.ListReceiptFiltersRequest {
		val input = com.amazonaws.services.simpleemail.model.ListReceiptFiltersRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.ListReceiptFiltersResult {
	  return com.amazonaws.services.simpleemail.model.ListReceiptFiltersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.ListReceiptFiltersResult {
		return environment.ses.listReceiptFilters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses list-receipt-filters")

	}

}


fun AmazonSimpleEmailServiceFunctions.listReceiptRuleSets(init: AmazonSimpleEmailServiceListReceiptRuleSetsCommand.() -> Unit): com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsResult {
	return this.block.declare(AmazonSimpleEmailServiceListReceiptRuleSetsCommand().apply(init)) as com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsResult
}

@Generated
class AmazonSimpleEmailServiceListReceiptRuleSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsRequest, com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsRequest {
		val input = com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsResult {
	  return com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsResult {
		return environment.ses.listReceiptRuleSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses list-receipt-rule-sets")
				.argument("next-token", nextToken)
	}

}


fun AmazonSimpleEmailServiceFunctions.listTemplates(init: AmazonSimpleEmailServiceListTemplatesCommand.() -> Unit): com.amazonaws.services.simpleemail.model.ListTemplatesResult {
	return this.block.declare(AmazonSimpleEmailServiceListTemplatesCommand().apply(init)) as com.amazonaws.services.simpleemail.model.ListTemplatesResult
}

@Generated
class AmazonSimpleEmailServiceListTemplatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ListTemplatesRequest, com.amazonaws.services.simpleemail.model.ListTemplatesResult> {

	var nextToken: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.simpleemail.model.ListTemplatesRequest {
		val input = com.amazonaws.services.simpleemail.model.ListTemplatesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.ListTemplatesResult {
	  return com.amazonaws.services.simpleemail.model.ListTemplatesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.ListTemplatesResult {
		return environment.ses.listTemplates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses list-templates")
				.argument("next-token", nextToken)
				.argument("max-items", maxItems?.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.listVerifiedEmailAddresses(init: AmazonSimpleEmailServiceListVerifiedEmailAddressesCommand.() -> Unit): com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult {
	return this.block.declare(AmazonSimpleEmailServiceListVerifiedEmailAddressesCommand().apply(init)) as com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult
}

@Generated
class AmazonSimpleEmailServiceListVerifiedEmailAddressesCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest, com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest {
		val input = com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult {
	  return com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult {
		return environment.ses.listVerifiedEmailAddresses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses list-verified-email-addresses")

	}

}


fun AmazonSimpleEmailServiceFunctions.putIdentityPolicy(identity: String, policyName: String, policy: String, init: AmazonSimpleEmailServicePutIdentityPolicyCommand.() -> Unit): com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult {
	return this.block.declare(AmazonSimpleEmailServicePutIdentityPolicyCommand(identity, policyName, policy).apply(init)) as com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult
}

@Generated
class AmazonSimpleEmailServicePutIdentityPolicyCommand(val identity: String, val policyName: String, val policy: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest, com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest {
		val input = com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest()
		input.setIdentity(this.identity)
		input.setPolicyName(this.policyName)
		input.setPolicy(this.policy)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult {
	  return com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult {
		return environment.ses.putIdentityPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses put-identity-policy")
				.argument("identity", identity)
				.argument("policy-name", policyName)
				.argument("policy", policy)
	}

}


fun AmazonSimpleEmailServiceFunctions.reorderReceiptRuleSet(ruleSetName: String, ruleNames: List<String>, init: AmazonSimpleEmailServiceReorderReceiptRuleSetCommand.() -> Unit): com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetResult {
	return this.block.declare(AmazonSimpleEmailServiceReorderReceiptRuleSetCommand(ruleSetName, ruleNames).apply(init)) as com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetResult
}

@Generated
class AmazonSimpleEmailServiceReorderReceiptRuleSetCommand(val ruleSetName: String, val ruleNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetRequest, com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetRequest {
		val input = com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetRequest()
		input.setRuleSetName(this.ruleSetName)
		input.setRuleNames(this.ruleNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetResult {
	  return com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetResult {
		return environment.ses.reorderReceiptRuleSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses reorder-receipt-rule-set")
				.argument("rule-set-name", ruleSetName)
				.argument("rule-names", ruleNames.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.sendBounce(originalMessageId: String, bounceSender: String, bouncedRecipientInfoList: List<com.amazonaws.services.simpleemail.model.BouncedRecipientInfo>, init: AmazonSimpleEmailServiceSendBounceCommand.() -> Unit): com.amazonaws.services.simpleemail.model.SendBounceResult {
	return this.block.declare(AmazonSimpleEmailServiceSendBounceCommand(originalMessageId, bounceSender, bouncedRecipientInfoList).apply(init)) as com.amazonaws.services.simpleemail.model.SendBounceResult
}

@Generated
class AmazonSimpleEmailServiceSendBounceCommand(val originalMessageId: String, val bounceSender: String, val bouncedRecipientInfoList: List<com.amazonaws.services.simpleemail.model.BouncedRecipientInfo>) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SendBounceRequest, com.amazonaws.services.simpleemail.model.SendBounceResult> {

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

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.SendBounceResult {
	  return com.amazonaws.services.simpleemail.model.SendBounceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.SendBounceResult {
		return environment.ses.sendBounce(build())
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


fun AmazonSimpleEmailServiceFunctions.sendBulkTemplatedEmail(source: String, template: String, destinations: List<com.amazonaws.services.simpleemail.model.BulkEmailDestination>, init: AmazonSimpleEmailServiceSendBulkTemplatedEmailCommand.() -> Unit): com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailResult {
	return this.block.declare(AmazonSimpleEmailServiceSendBulkTemplatedEmailCommand(source, template, destinations).apply(init)) as com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailResult
}

@Generated
class AmazonSimpleEmailServiceSendBulkTemplatedEmailCommand(val source: String, val template: String, val destinations: List<com.amazonaws.services.simpleemail.model.BulkEmailDestination>) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailRequest, com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailResult> {

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

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailResult {
	  return com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailResult {
		return environment.ses.sendBulkTemplatedEmail(build())
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


fun AmazonSimpleEmailServiceFunctions.sendCustomVerificationEmail(emailAddress: String, templateName: String, init: AmazonSimpleEmailServiceSendCustomVerificationEmailCommand.() -> Unit): com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailResult {
	return this.block.declare(AmazonSimpleEmailServiceSendCustomVerificationEmailCommand(emailAddress, templateName).apply(init)) as com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailResult
}

@Generated
class AmazonSimpleEmailServiceSendCustomVerificationEmailCommand(val emailAddress: String, val templateName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailRequest, com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailResult> {

	var configurationSetName: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailRequest {
		val input = com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailRequest()
		input.setEmailAddress(this.emailAddress)
		input.setTemplateName(this.templateName)
		input.setConfigurationSetName(this.configurationSetName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailResult {
	  return com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailResult {
		return environment.ses.sendCustomVerificationEmail(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses send-custom-verification-email")
				.argument("email-address", emailAddress)
				.argument("template-name", templateName)
				.argument("configuration-set-name", configurationSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.sendEmail(source: String, destination: com.amazonaws.services.simpleemail.model.Destination, message: com.amazonaws.services.simpleemail.model.Message, init: AmazonSimpleEmailServiceSendEmailCommand.() -> Unit): com.amazonaws.services.simpleemail.model.SendEmailResult {
	return this.block.declare(AmazonSimpleEmailServiceSendEmailCommand(source, destination, message).apply(init)) as com.amazonaws.services.simpleemail.model.SendEmailResult
}

@Generated
class AmazonSimpleEmailServiceSendEmailCommand(val source: String, val destination: com.amazonaws.services.simpleemail.model.Destination, val message: com.amazonaws.services.simpleemail.model.Message) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SendEmailRequest, com.amazonaws.services.simpleemail.model.SendEmailResult> {

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

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.SendEmailResult {
	  return com.amazonaws.services.simpleemail.model.SendEmailResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.SendEmailResult {
		return environment.ses.sendEmail(build())
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


fun AmazonSimpleEmailServiceFunctions.sendRawEmail(rawMessage: com.amazonaws.services.simpleemail.model.RawMessage, init: AmazonSimpleEmailServiceSendRawEmailCommand.() -> Unit): com.amazonaws.services.simpleemail.model.SendRawEmailResult {
	return this.block.declare(AmazonSimpleEmailServiceSendRawEmailCommand(rawMessage).apply(init)) as com.amazonaws.services.simpleemail.model.SendRawEmailResult
}

@Generated
class AmazonSimpleEmailServiceSendRawEmailCommand(val rawMessage: com.amazonaws.services.simpleemail.model.RawMessage) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SendRawEmailRequest, com.amazonaws.services.simpleemail.model.SendRawEmailResult> {

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

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.SendRawEmailResult {
	  return com.amazonaws.services.simpleemail.model.SendRawEmailResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.SendRawEmailResult {
		return environment.ses.sendRawEmail(build())
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


fun AmazonSimpleEmailServiceFunctions.sendTemplatedEmail(source: String, destination: com.amazonaws.services.simpleemail.model.Destination, template: String, templateData: String, init: AmazonSimpleEmailServiceSendTemplatedEmailCommand.() -> Unit): com.amazonaws.services.simpleemail.model.SendTemplatedEmailResult {
	return this.block.declare(AmazonSimpleEmailServiceSendTemplatedEmailCommand(source, destination, template, templateData).apply(init)) as com.amazonaws.services.simpleemail.model.SendTemplatedEmailResult
}

@Generated
class AmazonSimpleEmailServiceSendTemplatedEmailCommand(val source: String, val destination: com.amazonaws.services.simpleemail.model.Destination, val template: String, val templateData: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SendTemplatedEmailRequest, com.amazonaws.services.simpleemail.model.SendTemplatedEmailResult> {

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

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.SendTemplatedEmailResult {
	  return com.amazonaws.services.simpleemail.model.SendTemplatedEmailResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.SendTemplatedEmailResult {
		return environment.ses.sendTemplatedEmail(build())
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


fun AmazonSimpleEmailServiceFunctions.setActiveReceiptRuleSet(init: AmazonSimpleEmailServiceSetActiveReceiptRuleSetCommand.() -> Unit): com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetResult {
	return this.block.declare(AmazonSimpleEmailServiceSetActiveReceiptRuleSetCommand().apply(init)) as com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetResult
}

@Generated
class AmazonSimpleEmailServiceSetActiveReceiptRuleSetCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetRequest, com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetResult> {

	var ruleSetName: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetRequest {
		val input = com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetRequest()
		input.setRuleSetName(this.ruleSetName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetResult {
	  return com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetResult {
		return environment.ses.setActiveReceiptRuleSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses set-active-receipt-rule-set")
				.argument("rule-set-name", ruleSetName)
	}

}


fun AmazonSimpleEmailServiceFunctions.setIdentityDkimEnabled(identity: String, dkimEnabled: Boolean, init: AmazonSimpleEmailServiceSetIdentityDkimEnabledCommand.() -> Unit): com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledResult {
	return this.block.declare(AmazonSimpleEmailServiceSetIdentityDkimEnabledCommand(identity, dkimEnabled).apply(init)) as com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledResult
}

@Generated
class AmazonSimpleEmailServiceSetIdentityDkimEnabledCommand(val identity: String, val dkimEnabled: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest, com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest {
		val input = com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest()
		input.setIdentity(this.identity)
		input.setDkimEnabled(this.dkimEnabled)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledResult {
	  return com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledResult {
		return environment.ses.setIdentityDkimEnabled(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses set-identity-dkim-enabled")
				.argument("identity", identity)
				.option("dkim-enabled", dkimEnabled ?: false)
	}

}


fun AmazonSimpleEmailServiceFunctions.setIdentityFeedbackForwardingEnabled(identity: String, forwardingEnabled: Boolean, init: AmazonSimpleEmailServiceSetIdentityFeedbackForwardingEnabledCommand.() -> Unit): com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledResult {
	return this.block.declare(AmazonSimpleEmailServiceSetIdentityFeedbackForwardingEnabledCommand(identity, forwardingEnabled).apply(init)) as com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledResult
}

@Generated
class AmazonSimpleEmailServiceSetIdentityFeedbackForwardingEnabledCommand(val identity: String, val forwardingEnabled: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest, com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest {
		val input = com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest()
		input.setIdentity(this.identity)
		input.setForwardingEnabled(this.forwardingEnabled)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledResult {
	  return com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledResult {
		return environment.ses.setIdentityFeedbackForwardingEnabled(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses set-identity-feedback-forwarding-enabled")
				.argument("identity", identity)
				.option("forwarding-enabled", forwardingEnabled ?: false)
	}

}


fun AmazonSimpleEmailServiceFunctions.setIdentityHeadersInNotificationsEnabled(identity: String, notificationType: NotificationType, enabled: Boolean, init: AmazonSimpleEmailServiceSetIdentityHeadersInNotificationsEnabledCommand.() -> Unit): com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledResult {
	return this.block.declare(AmazonSimpleEmailServiceSetIdentityHeadersInNotificationsEnabledCommand(identity, notificationType, enabled).apply(init)) as com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledResult
}

@Generated
class AmazonSimpleEmailServiceSetIdentityHeadersInNotificationsEnabledCommand(val identity: String, val notificationType: NotificationType, val enabled: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledRequest, com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledRequest {
		val input = com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledRequest()
		input.setIdentity(this.identity)
		input.setNotificationType(this.notificationType.toString())
		input.setEnabled(this.enabled)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledResult {
	  return com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledResult {
		return environment.ses.setIdentityHeadersInNotificationsEnabled(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses set-identity-headers-in-notifications-enabled")
				.argument("identity", identity)
				.argument("notification-type", notificationType.toString())
				.option("enabled", enabled ?: false)
	}

}


fun AmazonSimpleEmailServiceFunctions.setIdentityMailFromDomain(identity: String, init: AmazonSimpleEmailServiceSetIdentityMailFromDomainCommand.() -> Unit): com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainResult {
	return this.block.declare(AmazonSimpleEmailServiceSetIdentityMailFromDomainCommand(identity).apply(init)) as com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainResult
}

@Generated
class AmazonSimpleEmailServiceSetIdentityMailFromDomainCommand(val identity: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainRequest, com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainResult> {

	var mailFromDomain: String? = null
	var behaviorOnMXFailure: BehaviorOnMXFailure? = null

	override fun build(): com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainRequest {
		val input = com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainRequest()
		input.setIdentity(this.identity)
		input.setMailFromDomain(this.mailFromDomain)
		input.setBehaviorOnMXFailure(this.behaviorOnMXFailure?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainResult {
	  return com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainResult {
		return environment.ses.setIdentityMailFromDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses set-identity-mail-from-domain")
				.argument("identity", identity)
				.argument("mail-from-domain", mailFromDomain)
				.argument("behavior-on-mxfailure", behaviorOnMXFailure?.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.setIdentityNotificationTopic(identity: String, notificationType: NotificationType, init: AmazonSimpleEmailServiceSetIdentityNotificationTopicCommand.() -> Unit): com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult {
	return this.block.declare(AmazonSimpleEmailServiceSetIdentityNotificationTopicCommand(identity, notificationType).apply(init)) as com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult
}

@Generated
class AmazonSimpleEmailServiceSetIdentityNotificationTopicCommand(val identity: String, val notificationType: NotificationType) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest, com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult> {

	var snsTopic: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest {
		val input = com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest()
		input.setIdentity(this.identity)
		input.setNotificationType(this.notificationType.toString())
		input.setSnsTopic(this.snsTopic)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult {
	  return com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult {
		return environment.ses.setIdentityNotificationTopic(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses set-identity-notification-topic")
				.argument("identity", identity)
				.argument("notification-type", notificationType.toString())
				.argument("sns-topic", snsTopic)
	}

}


fun AmazonSimpleEmailServiceFunctions.setReceiptRulePosition(ruleSetName: String, ruleName: String, init: AmazonSimpleEmailServiceSetReceiptRulePositionCommand.() -> Unit): com.amazonaws.services.simpleemail.model.SetReceiptRulePositionResult {
	return this.block.declare(AmazonSimpleEmailServiceSetReceiptRulePositionCommand(ruleSetName, ruleName).apply(init)) as com.amazonaws.services.simpleemail.model.SetReceiptRulePositionResult
}

@Generated
class AmazonSimpleEmailServiceSetReceiptRulePositionCommand(val ruleSetName: String, val ruleName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.SetReceiptRulePositionRequest, com.amazonaws.services.simpleemail.model.SetReceiptRulePositionResult> {

	var after: String? = null

	override fun build(): com.amazonaws.services.simpleemail.model.SetReceiptRulePositionRequest {
		val input = com.amazonaws.services.simpleemail.model.SetReceiptRulePositionRequest()
		input.setRuleSetName(this.ruleSetName)
		input.setRuleName(this.ruleName)
		input.setAfter(this.after)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.SetReceiptRulePositionResult {
	  return com.amazonaws.services.simpleemail.model.SetReceiptRulePositionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.SetReceiptRulePositionResult {
		return environment.ses.setReceiptRulePosition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses set-receipt-rule-position")
				.argument("rule-set-name", ruleSetName)
				.argument("rule-name", ruleName)
				.argument("after", after)
	}

}


fun AmazonSimpleEmailServiceFunctions.testRenderTemplate(templateName: String, templateData: String, init: AmazonSimpleEmailServiceTestRenderTemplateCommand.() -> Unit): com.amazonaws.services.simpleemail.model.TestRenderTemplateResult {
	return this.block.declare(AmazonSimpleEmailServiceTestRenderTemplateCommand(templateName, templateData).apply(init)) as com.amazonaws.services.simpleemail.model.TestRenderTemplateResult
}

@Generated
class AmazonSimpleEmailServiceTestRenderTemplateCommand(val templateName: String, val templateData: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.TestRenderTemplateRequest, com.amazonaws.services.simpleemail.model.TestRenderTemplateResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.TestRenderTemplateRequest {
		val input = com.amazonaws.services.simpleemail.model.TestRenderTemplateRequest()
		input.setTemplateName(this.templateName)
		input.setTemplateData(this.templateData)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.TestRenderTemplateResult {
	  return com.amazonaws.services.simpleemail.model.TestRenderTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.TestRenderTemplateResult {
		return environment.ses.testRenderTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses test-render-template")
				.argument("template-name", templateName)
				.argument("template-data", templateData)
	}

}


fun AmazonSimpleEmailServiceFunctions.updateAccountSendingEnabled(init: AmazonSimpleEmailServiceUpdateAccountSendingEnabledCommand.() -> Unit): com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledResult {
	return this.block.declare(AmazonSimpleEmailServiceUpdateAccountSendingEnabledCommand().apply(init)) as com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledResult
}

@Generated
class AmazonSimpleEmailServiceUpdateAccountSendingEnabledCommand() : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledRequest, com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledResult> {

	var enabled: Boolean? = false

	override fun build(): com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledRequest {
		val input = com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledRequest()
		input.setEnabled(this.enabled)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledResult {
	  return com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledResult {
		return environment.ses.updateAccountSendingEnabled(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses update-account-sending-enabled")
				.option("enabled", enabled ?: false)
	}

}


fun AmazonSimpleEmailServiceFunctions.updateConfigurationSetEventDestination(configurationSetName: String, eventDestination: com.amazonaws.services.simpleemail.model.EventDestination, init: AmazonSimpleEmailServiceUpdateConfigurationSetEventDestinationCommand.() -> Unit): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationResult {
	return this.block.declare(AmazonSimpleEmailServiceUpdateConfigurationSetEventDestinationCommand(configurationSetName, eventDestination).apply(init)) as com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationResult
}

@Generated
class AmazonSimpleEmailServiceUpdateConfigurationSetEventDestinationCommand(val configurationSetName: String, val eventDestination: com.amazonaws.services.simpleemail.model.EventDestination) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationRequest, com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationRequest {
		val input = com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationRequest()
		input.setConfigurationSetName(this.configurationSetName)
		input.setEventDestination(this.eventDestination)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationResult {
	  return com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationResult {
		return environment.ses.updateConfigurationSetEventDestination(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses update-configuration-set-event-destination")
				.argument("configuration-set-name", configurationSetName)
				.argument("event-destination", eventDestination.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.updateConfigurationSetReputationMetricsEnabled(configurationSetName: String, enabled: Boolean, init: AmazonSimpleEmailServiceUpdateConfigurationSetReputationMetricsEnabledCommand.() -> Unit): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledResult {
	return this.block.declare(AmazonSimpleEmailServiceUpdateConfigurationSetReputationMetricsEnabledCommand(configurationSetName, enabled).apply(init)) as com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledResult
}

@Generated
class AmazonSimpleEmailServiceUpdateConfigurationSetReputationMetricsEnabledCommand(val configurationSetName: String, val enabled: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledRequest, com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledRequest {
		val input = com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledRequest()
		input.setConfigurationSetName(this.configurationSetName)
		input.setEnabled(this.enabled)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledResult {
	  return com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledResult {
		return environment.ses.updateConfigurationSetReputationMetricsEnabled(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses update-configuration-set-reputation-metrics-enabled")
				.argument("configuration-set-name", configurationSetName)
				.option("enabled", enabled ?: false)
	}

}


fun AmazonSimpleEmailServiceFunctions.updateConfigurationSetSendingEnabled(configurationSetName: String, enabled: Boolean, init: AmazonSimpleEmailServiceUpdateConfigurationSetSendingEnabledCommand.() -> Unit): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledResult {
	return this.block.declare(AmazonSimpleEmailServiceUpdateConfigurationSetSendingEnabledCommand(configurationSetName, enabled).apply(init)) as com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledResult
}

@Generated
class AmazonSimpleEmailServiceUpdateConfigurationSetSendingEnabledCommand(val configurationSetName: String, val enabled: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledRequest, com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledRequest {
		val input = com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledRequest()
		input.setConfigurationSetName(this.configurationSetName)
		input.setEnabled(this.enabled)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledResult {
	  return com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledResult {
		return environment.ses.updateConfigurationSetSendingEnabled(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses update-configuration-set-sending-enabled")
				.argument("configuration-set-name", configurationSetName)
				.option("enabled", enabled ?: false)
	}

}


fun AmazonSimpleEmailServiceFunctions.updateConfigurationSetTrackingOptions(configurationSetName: String, trackingOptions: com.amazonaws.services.simpleemail.model.TrackingOptions, init: AmazonSimpleEmailServiceUpdateConfigurationSetTrackingOptionsCommand.() -> Unit): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsResult {
	return this.block.declare(AmazonSimpleEmailServiceUpdateConfigurationSetTrackingOptionsCommand(configurationSetName, trackingOptions).apply(init)) as com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsResult
}

@Generated
class AmazonSimpleEmailServiceUpdateConfigurationSetTrackingOptionsCommand(val configurationSetName: String, val trackingOptions: com.amazonaws.services.simpleemail.model.TrackingOptions) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsRequest, com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsRequest {
		val input = com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsRequest()
		input.setConfigurationSetName(this.configurationSetName)
		input.setTrackingOptions(this.trackingOptions)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsResult {
	  return com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsResult {
		return environment.ses.updateConfigurationSetTrackingOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses update-configuration-set-tracking-options")
				.argument("configuration-set-name", configurationSetName)
				.argument("tracking-options", trackingOptions.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.updateCustomVerificationEmailTemplate(templateName: String, init: AmazonSimpleEmailServiceUpdateCustomVerificationEmailTemplateCommand.() -> Unit): com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateResult {
	return this.block.declare(AmazonSimpleEmailServiceUpdateCustomVerificationEmailTemplateCommand(templateName).apply(init)) as com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateResult
}

@Generated
class AmazonSimpleEmailServiceUpdateCustomVerificationEmailTemplateCommand(val templateName: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateRequest, com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateResult> {

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

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateResult {
	  return com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateResult {
		return environment.ses.updateCustomVerificationEmailTemplate(build())
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


fun AmazonSimpleEmailServiceFunctions.updateReceiptRule(ruleSetName: String, rule: com.amazonaws.services.simpleemail.model.ReceiptRule, init: AmazonSimpleEmailServiceUpdateReceiptRuleCommand.() -> Unit): com.amazonaws.services.simpleemail.model.UpdateReceiptRuleResult {
	return this.block.declare(AmazonSimpleEmailServiceUpdateReceiptRuleCommand(ruleSetName, rule).apply(init)) as com.amazonaws.services.simpleemail.model.UpdateReceiptRuleResult
}

@Generated
class AmazonSimpleEmailServiceUpdateReceiptRuleCommand(val ruleSetName: String, val rule: com.amazonaws.services.simpleemail.model.ReceiptRule) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.UpdateReceiptRuleRequest, com.amazonaws.services.simpleemail.model.UpdateReceiptRuleResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.UpdateReceiptRuleRequest {
		val input = com.amazonaws.services.simpleemail.model.UpdateReceiptRuleRequest()
		input.setRuleSetName(this.ruleSetName)
		input.setRule(this.rule)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.UpdateReceiptRuleResult {
	  return com.amazonaws.services.simpleemail.model.UpdateReceiptRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.UpdateReceiptRuleResult {
		return environment.ses.updateReceiptRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses update-receipt-rule")
				.argument("rule-set-name", ruleSetName)
				.argument("rule", rule.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.updateTemplate(template: com.amazonaws.services.simpleemail.model.Template, init: AmazonSimpleEmailServiceUpdateTemplateCommand.() -> Unit): com.amazonaws.services.simpleemail.model.UpdateTemplateResult {
	return this.block.declare(AmazonSimpleEmailServiceUpdateTemplateCommand(template).apply(init)) as com.amazonaws.services.simpleemail.model.UpdateTemplateResult
}

@Generated
class AmazonSimpleEmailServiceUpdateTemplateCommand(val template: com.amazonaws.services.simpleemail.model.Template) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.UpdateTemplateRequest, com.amazonaws.services.simpleemail.model.UpdateTemplateResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.UpdateTemplateRequest {
		val input = com.amazonaws.services.simpleemail.model.UpdateTemplateRequest()
		input.setTemplate(this.template)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.UpdateTemplateResult {
	  return com.amazonaws.services.simpleemail.model.UpdateTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.UpdateTemplateResult {
		return environment.ses.updateTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses update-template")
				.argument("template", template.toString())
	}

}


fun AmazonSimpleEmailServiceFunctions.verifyDomainDkim(domain: String, init: AmazonSimpleEmailServiceVerifyDomainDkimCommand.() -> Unit): com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult {
	return this.block.declare(AmazonSimpleEmailServiceVerifyDomainDkimCommand(domain).apply(init)) as com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult
}

@Generated
class AmazonSimpleEmailServiceVerifyDomainDkimCommand(val domain: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest, com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest {
		val input = com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest()
		input.setDomain(this.domain)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult {
	  return com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult {
		return environment.ses.verifyDomainDkim(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses verify-domain-dkim")
				.argument("domain", domain)
	}

}


fun AmazonSimpleEmailServiceFunctions.verifyDomainIdentity(domain: String, init: AmazonSimpleEmailServiceVerifyDomainIdentityCommand.() -> Unit): com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult {
	return this.block.declare(AmazonSimpleEmailServiceVerifyDomainIdentityCommand(domain).apply(init)) as com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult
}

@Generated
class AmazonSimpleEmailServiceVerifyDomainIdentityCommand(val domain: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest, com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest {
		val input = com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest()
		input.setDomain(this.domain)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult {
	  return com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult {
		return environment.ses.verifyDomainIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses verify-domain-identity")
				.argument("domain", domain)
	}

}


fun AmazonSimpleEmailServiceFunctions.verifyEmailAddress(emailAddress: String, init: AmazonSimpleEmailServiceVerifyEmailAddressCommand.() -> Unit): com.amazonaws.services.simpleemail.model.VerifyEmailAddressResult {
	return this.block.declare(AmazonSimpleEmailServiceVerifyEmailAddressCommand(emailAddress).apply(init)) as com.amazonaws.services.simpleemail.model.VerifyEmailAddressResult
}

@Generated
class AmazonSimpleEmailServiceVerifyEmailAddressCommand(val emailAddress: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest, com.amazonaws.services.simpleemail.model.VerifyEmailAddressResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest {
		val input = com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest()
		input.setEmailAddress(this.emailAddress)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.VerifyEmailAddressResult {
	  return com.amazonaws.services.simpleemail.model.VerifyEmailAddressResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.VerifyEmailAddressResult {
		return environment.ses.verifyEmailAddress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses verify-email-address")
				.argument("email-address", emailAddress)
	}

}


fun AmazonSimpleEmailServiceFunctions.verifyEmailIdentity(emailAddress: String, init: AmazonSimpleEmailServiceVerifyEmailIdentityCommand.() -> Unit): com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult {
	return this.block.declare(AmazonSimpleEmailServiceVerifyEmailIdentityCommand(emailAddress).apply(init)) as com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult
}

@Generated
class AmazonSimpleEmailServiceVerifyEmailIdentityCommand(val emailAddress: String) : AmazonWebServiceCommand<com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest, com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult> {



	override fun build(): com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest {
		val input = com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest()
		input.setEmailAddress(this.emailAddress)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult {
	  return com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult {
		return environment.ses.verifyEmailIdentity(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws ses verify-email-identity")
				.argument("email-address", emailAddress)
	}

}
