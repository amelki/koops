
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk
import com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalkClientBuilder
import com.amazonaws.services.elasticbeanstalk.model.*

var codingue.koops.core.Environment.elasticbeanstalk: AWSElasticBeanstalk
	get() {
		var service = this.capabilities[AWSElasticBeanstalk::class.java.name]
		if (service == null) {
			service = AWSElasticBeanstalkClientBuilder.standard().build()
			elasticbeanstalk = service
		}
		return service as AWSElasticBeanstalk
	}
	set(elasticbeanstalk) {
		this.capabilities[AWSElasticBeanstalk::class.java.name] = elasticbeanstalk
	}

@Generated
class AWSElasticBeanstalkFunctions(val block: Block)

infix fun <T> AwsContinuation.elasticbeanstalk(init: AWSElasticBeanstalkFunctions.() -> T): T {
	return AWSElasticBeanstalkFunctions(shell).run(init)
}

			

fun AWSElasticBeanstalkFunctions.abortEnvironmentUpdate(init: AWSElasticBeanstalkAbortEnvironmentUpdateCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateResult {
	return this.block.declare(AWSElasticBeanstalkAbortEnvironmentUpdateCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateResult
}

@Generated
class AWSElasticBeanstalkAbortEnvironmentUpdateCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateRequest, com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateResult> {

	var environmentId: String? = null
	var environmentName: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateRequest()
		input.setEnvironmentId(this.environmentId)
		input.setEnvironmentName(this.environmentName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateResult {
	  return com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateResult {
		return environment.elasticbeanstalk.abortEnvironmentUpdate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk abort-environment-update")
				.argument("environment-id", environmentId)
				.argument("environment-name", environmentName)
	}

}


fun AWSElasticBeanstalkFunctions.applyEnvironmentManagedAction(actionId: String, init: AWSElasticBeanstalkApplyEnvironmentManagedActionCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionResult {
	return this.block.declare(AWSElasticBeanstalkApplyEnvironmentManagedActionCommand(actionId).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionResult
}

@Generated
class AWSElasticBeanstalkApplyEnvironmentManagedActionCommand(val actionId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionRequest, com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionResult> {

	var environmentName: String? = null
	var environmentId: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionRequest()
		input.setEnvironmentName(this.environmentName)
		input.setEnvironmentId(this.environmentId)
		input.setActionId(this.actionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionResult {
	  return com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionResult {
		return environment.elasticbeanstalk.applyEnvironmentManagedAction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk apply-environment-managed-action")
				.argument("environment-name", environmentName)
				.argument("environment-id", environmentId)
				.argument("action-id", actionId)
	}

}


fun AWSElasticBeanstalkFunctions.checkDNSAvailability(cNAMEPrefix: String, init: AWSElasticBeanstalkCheckDNSAvailabilityCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityResult {
	return this.block.declare(AWSElasticBeanstalkCheckDNSAvailabilityCommand(cNAMEPrefix).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityResult
}

@Generated
class AWSElasticBeanstalkCheckDNSAvailabilityCommand(val cNAMEPrefix: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityRequest, com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityResult> {



	override fun build(): com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityRequest()
		input.setCNAMEPrefix(this.cNAMEPrefix)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityResult {
	  return com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityResult {
		return environment.elasticbeanstalk.checkDNSAvailability(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk check-dnsavailability")
				.argument("cnameprefix", cNAMEPrefix)
	}

}


fun AWSElasticBeanstalkFunctions.composeEnvironments(init: AWSElasticBeanstalkComposeEnvironmentsCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsResult {
	return this.block.declare(AWSElasticBeanstalkComposeEnvironmentsCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsResult
}

@Generated
class AWSElasticBeanstalkComposeEnvironmentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsRequest, com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsResult> {

	var applicationName: String? = null
	var groupName: String? = null
	var versionLabels: List<String>? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsRequest()
		input.setApplicationName(this.applicationName)
		input.setGroupName(this.groupName)
		input.setVersionLabels(this.versionLabels)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsResult {
	  return com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsResult {
		return environment.elasticbeanstalk.composeEnvironments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk compose-environments")
				.argument("application-name", applicationName)
				.argument("group-name", groupName)
				.argument("version-labels", versionLabels?.toString())
	}

}


fun AWSElasticBeanstalkFunctions.createApplication(applicationName: String, init: AWSElasticBeanstalkCreateApplicationCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.CreateApplicationResult {
	return this.block.declare(AWSElasticBeanstalkCreateApplicationCommand(applicationName).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.CreateApplicationResult
}

@Generated
class AWSElasticBeanstalkCreateApplicationCommand(val applicationName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.CreateApplicationRequest, com.amazonaws.services.elasticbeanstalk.model.CreateApplicationResult> {

	var description: String? = null
	var resourceLifecycleConfig: com.amazonaws.services.elasticbeanstalk.model.ApplicationResourceLifecycleConfig? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.CreateApplicationRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.CreateApplicationRequest()
		input.setApplicationName(this.applicationName)
		input.setDescription(this.description)
		input.setResourceLifecycleConfig(this.resourceLifecycleConfig)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.CreateApplicationResult {
	  return com.amazonaws.services.elasticbeanstalk.model.CreateApplicationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.CreateApplicationResult {
		return environment.elasticbeanstalk.createApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk create-application")
				.argument("application-name", applicationName)
				.argument("description", description)
				.argument("resource-lifecycle-config", resourceLifecycleConfig?.toString())
	}

}


fun AWSElasticBeanstalkFunctions.createApplicationVersion(applicationName: String, versionLabel: String, init: AWSElasticBeanstalkCreateApplicationVersionCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionResult {
	return this.block.declare(AWSElasticBeanstalkCreateApplicationVersionCommand(applicationName, versionLabel).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionResult
}

@Generated
class AWSElasticBeanstalkCreateApplicationVersionCommand(val applicationName: String, val versionLabel: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionRequest, com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionResult> {

	var description: String? = null
	var sourceBuildInformation: com.amazonaws.services.elasticbeanstalk.model.SourceBuildInformation? = null
	var sourceBundle: com.amazonaws.services.elasticbeanstalk.model.S3Location? = null
	var buildConfiguration: com.amazonaws.services.elasticbeanstalk.model.BuildConfiguration? = null
	var autoCreateApplication: Boolean? = false
	var process: Boolean? = false

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionRequest()
		input.setApplicationName(this.applicationName)
		input.setVersionLabel(this.versionLabel)
		input.setDescription(this.description)
		input.setSourceBuildInformation(this.sourceBuildInformation)
		input.setSourceBundle(this.sourceBundle)
		input.setBuildConfiguration(this.buildConfiguration)
		input.setAutoCreateApplication(this.autoCreateApplication)
		input.setProcess(this.process)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionResult {
	  return com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionResult {
		return environment.elasticbeanstalk.createApplicationVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk create-application-version")
				.argument("application-name", applicationName)
				.argument("version-label", versionLabel)
				.argument("description", description)
				.argument("source-build-information", sourceBuildInformation?.toString())
				.argument("source-bundle", sourceBundle?.toString())
				.argument("build-configuration", buildConfiguration?.toString())
				.option("auto-create-application", autoCreateApplication ?: false)
				.option("process", process ?: false)
	}

}


fun AWSElasticBeanstalkFunctions.createConfigurationTemplate(applicationName: String, templateName: String, init: AWSElasticBeanstalkCreateConfigurationTemplateCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateResult {
	return this.block.declare(AWSElasticBeanstalkCreateConfigurationTemplateCommand(applicationName, templateName).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateResult
}

@Generated
class AWSElasticBeanstalkCreateConfigurationTemplateCommand(val applicationName: String, val templateName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateRequest, com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateResult> {

	var solutionStackName: String? = null
	var platformArn: String? = null
	var sourceConfiguration: com.amazonaws.services.elasticbeanstalk.model.SourceConfiguration? = null
	var environmentId: String? = null
	var description: String? = null
	var optionSettings: List<com.amazonaws.services.elasticbeanstalk.model.ConfigurationOptionSetting>? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateRequest()
		input.setApplicationName(this.applicationName)
		input.setTemplateName(this.templateName)
		input.setSolutionStackName(this.solutionStackName)
		input.setPlatformArn(this.platformArn)
		input.setSourceConfiguration(this.sourceConfiguration)
		input.setEnvironmentId(this.environmentId)
		input.setDescription(this.description)
		input.setOptionSettings(this.optionSettings)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateResult {
	  return com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateResult {
		return environment.elasticbeanstalk.createConfigurationTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk create-configuration-template")
				.argument("application-name", applicationName)
				.argument("template-name", templateName)
				.argument("solution-stack-name", solutionStackName)
				.argument("platform-arn", platformArn)
				.argument("source-configuration", sourceConfiguration?.toString())
				.argument("environment-id", environmentId)
				.argument("description", description)
				.argument("option-settings", optionSettings?.toString())
	}

}


fun AWSElasticBeanstalkFunctions.createEnvironment(applicationName: String, init: AWSElasticBeanstalkCreateEnvironmentCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentResult {
	return this.block.declare(AWSElasticBeanstalkCreateEnvironmentCommand(applicationName).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentResult
}

@Generated
class AWSElasticBeanstalkCreateEnvironmentCommand(val applicationName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentRequest, com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentResult> {

	var environmentName: String? = null
	var groupName: String? = null
	var description: String? = null
	var cNAMEPrefix: String? = null
	var tier: com.amazonaws.services.elasticbeanstalk.model.EnvironmentTier? = null
	var tags: List<com.amazonaws.services.elasticbeanstalk.model.Tag>? = null
	var versionLabel: String? = null
	var templateName: String? = null
	var solutionStackName: String? = null
	var platformArn: String? = null
	var optionSettings: List<com.amazonaws.services.elasticbeanstalk.model.ConfigurationOptionSetting>? = null
	var optionsToRemove: List<com.amazonaws.services.elasticbeanstalk.model.OptionSpecification>? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentRequest()
		input.setApplicationName(this.applicationName)
		input.setEnvironmentName(this.environmentName)
		input.setGroupName(this.groupName)
		input.setDescription(this.description)
		input.setCNAMEPrefix(this.cNAMEPrefix)
		input.setTier(this.tier)
		input.setTags(this.tags)
		input.setVersionLabel(this.versionLabel)
		input.setTemplateName(this.templateName)
		input.setSolutionStackName(this.solutionStackName)
		input.setPlatformArn(this.platformArn)
		input.setOptionSettings(this.optionSettings)
		input.setOptionsToRemove(this.optionsToRemove)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentResult {
	  return com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentResult {
		return environment.elasticbeanstalk.createEnvironment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk create-environment")
				.argument("application-name", applicationName)
				.argument("environment-name", environmentName)
				.argument("group-name", groupName)
				.argument("description", description)
				.argument("cnameprefix", cNAMEPrefix)
				.argument("tier", tier?.toString())
				.argument("tags", tags?.toString())
				.argument("version-label", versionLabel)
				.argument("template-name", templateName)
				.argument("solution-stack-name", solutionStackName)
				.argument("platform-arn", platformArn)
				.argument("option-settings", optionSettings?.toString())
				.argument("options-to-remove", optionsToRemove?.toString())
	}

}


fun AWSElasticBeanstalkFunctions.createPlatformVersion(platformName: String, platformVersion: String, platformDefinitionBundle: com.amazonaws.services.elasticbeanstalk.model.S3Location, init: AWSElasticBeanstalkCreatePlatformVersionCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionResult {
	return this.block.declare(AWSElasticBeanstalkCreatePlatformVersionCommand(platformName, platformVersion, platformDefinitionBundle).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionResult
}

@Generated
class AWSElasticBeanstalkCreatePlatformVersionCommand(val platformName: String, val platformVersion: String, val platformDefinitionBundle: com.amazonaws.services.elasticbeanstalk.model.S3Location) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionRequest, com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionResult> {

	var environmentName: String? = null
	var optionSettings: List<com.amazonaws.services.elasticbeanstalk.model.ConfigurationOptionSetting>? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionRequest()
		input.setPlatformName(this.platformName)
		input.setPlatformVersion(this.platformVersion)
		input.setPlatformDefinitionBundle(this.platformDefinitionBundle)
		input.setEnvironmentName(this.environmentName)
		input.setOptionSettings(this.optionSettings)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionResult {
	  return com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionResult {
		return environment.elasticbeanstalk.createPlatformVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk create-platform-version")
				.argument("platform-name", platformName)
				.argument("platform-version", platformVersion)
				.argument("platform-definition-bundle", platformDefinitionBundle.toString())
				.argument("environment-name", environmentName)
				.argument("option-settings", optionSettings?.toString())
	}

}


fun AWSElasticBeanstalkFunctions.createStorageLocation(init: AWSElasticBeanstalkCreateStorageLocationCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationResult {
	return this.block.declare(AWSElasticBeanstalkCreateStorageLocationCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationResult
}

@Generated
class AWSElasticBeanstalkCreateStorageLocationCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationRequest, com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationResult> {



	override fun build(): com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationResult {
	  return com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationResult {
		return environment.elasticbeanstalk.createStorageLocation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk create-storage-location")

	}

}


fun AWSElasticBeanstalkFunctions.deleteApplication(applicationName: String, init: AWSElasticBeanstalkDeleteApplicationCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationResult {
	return this.block.declare(AWSElasticBeanstalkDeleteApplicationCommand(applicationName).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationResult
}

@Generated
class AWSElasticBeanstalkDeleteApplicationCommand(val applicationName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationRequest, com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationResult> {

	var terminateEnvByForce: Boolean? = false

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationRequest()
		input.setApplicationName(this.applicationName)
		input.setTerminateEnvByForce(this.terminateEnvByForce)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationResult {
		return environment.elasticbeanstalk.deleteApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk delete-application")
				.argument("application-name", applicationName)
				.option("terminate-env-by-force", terminateEnvByForce ?: false)
	}

}


fun AWSElasticBeanstalkFunctions.deleteApplicationVersion(applicationName: String, versionLabel: String, init: AWSElasticBeanstalkDeleteApplicationVersionCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionResult {
	return this.block.declare(AWSElasticBeanstalkDeleteApplicationVersionCommand(applicationName, versionLabel).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionResult
}

@Generated
class AWSElasticBeanstalkDeleteApplicationVersionCommand(val applicationName: String, val versionLabel: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionRequest, com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionResult> {

	var deleteSourceBundle: Boolean? = false

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionRequest()
		input.setApplicationName(this.applicationName)
		input.setVersionLabel(this.versionLabel)
		input.setDeleteSourceBundle(this.deleteSourceBundle)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionResult {
		return environment.elasticbeanstalk.deleteApplicationVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk delete-application-version")
				.argument("application-name", applicationName)
				.argument("version-label", versionLabel)
				.option("delete-source-bundle", deleteSourceBundle ?: false)
	}

}


fun AWSElasticBeanstalkFunctions.deleteConfigurationTemplate(applicationName: String, templateName: String, init: AWSElasticBeanstalkDeleteConfigurationTemplateCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateResult {
	return this.block.declare(AWSElasticBeanstalkDeleteConfigurationTemplateCommand(applicationName, templateName).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateResult
}

@Generated
class AWSElasticBeanstalkDeleteConfigurationTemplateCommand(val applicationName: String, val templateName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateRequest, com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateResult> {



	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateRequest()
		input.setApplicationName(this.applicationName)
		input.setTemplateName(this.templateName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateResult {
		return environment.elasticbeanstalk.deleteConfigurationTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk delete-configuration-template")
				.argument("application-name", applicationName)
				.argument("template-name", templateName)
	}

}


fun AWSElasticBeanstalkFunctions.deleteEnvironmentConfiguration(applicationName: String, environmentName: String, init: AWSElasticBeanstalkDeleteEnvironmentConfigurationCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationResult {
	return this.block.declare(AWSElasticBeanstalkDeleteEnvironmentConfigurationCommand(applicationName, environmentName).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationResult
}

@Generated
class AWSElasticBeanstalkDeleteEnvironmentConfigurationCommand(val applicationName: String, val environmentName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationRequest, com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationResult> {



	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationRequest()
		input.setApplicationName(this.applicationName)
		input.setEnvironmentName(this.environmentName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationResult {
		return environment.elasticbeanstalk.deleteEnvironmentConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk delete-environment-configuration")
				.argument("application-name", applicationName)
				.argument("environment-name", environmentName)
	}

}


fun AWSElasticBeanstalkFunctions.deletePlatformVersion(init: AWSElasticBeanstalkDeletePlatformVersionCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionResult {
	return this.block.declare(AWSElasticBeanstalkDeletePlatformVersionCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionResult
}

@Generated
class AWSElasticBeanstalkDeletePlatformVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionRequest, com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionResult> {

	var platformArn: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionRequest()
		input.setPlatformArn(this.platformArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionResult {
		return environment.elasticbeanstalk.deletePlatformVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk delete-platform-version")
				.argument("platform-arn", platformArn)
	}

}


fun AWSElasticBeanstalkFunctions.describeAccountAttributes(init: AWSElasticBeanstalkDescribeAccountAttributesCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesResult {
	return this.block.declare(AWSElasticBeanstalkDescribeAccountAttributesCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesResult
}

@Generated
class AWSElasticBeanstalkDescribeAccountAttributesCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesRequest, com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesResult> {



	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesResult {
		return environment.elasticbeanstalk.describeAccountAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk describe-account-attributes")

	}

}


fun AWSElasticBeanstalkFunctions.describeApplicationVersions(init: AWSElasticBeanstalkDescribeApplicationVersionsCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsResult {
	return this.block.declare(AWSElasticBeanstalkDescribeApplicationVersionsCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsResult
}

@Generated
class AWSElasticBeanstalkDescribeApplicationVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsRequest, com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsResult> {

	var applicationName: String? = null
	var versionLabels: List<String>? = null
	var maxRecords: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsRequest()
		input.setApplicationName(this.applicationName)
		input.setVersionLabels(this.versionLabels)
		input.setMaxRecords(this.maxRecords)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsResult {
		return environment.elasticbeanstalk.describeApplicationVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk describe-application-versions")
				.argument("application-name", applicationName)
				.argument("version-labels", versionLabels?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSElasticBeanstalkFunctions.describeApplications(init: AWSElasticBeanstalkDescribeApplicationsCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsResult {
	return this.block.declare(AWSElasticBeanstalkDescribeApplicationsCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsResult
}

@Generated
class AWSElasticBeanstalkDescribeApplicationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsRequest, com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsResult> {

	var applicationNames: List<String>? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsRequest()
		input.setApplicationNames(this.applicationNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsResult {
		return environment.elasticbeanstalk.describeApplications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk describe-applications")
				.argument("application-names", applicationNames?.toString())
	}

}


fun AWSElasticBeanstalkFunctions.describeConfigurationOptions(init: AWSElasticBeanstalkDescribeConfigurationOptionsCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsResult {
	return this.block.declare(AWSElasticBeanstalkDescribeConfigurationOptionsCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsResult
}

@Generated
class AWSElasticBeanstalkDescribeConfigurationOptionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsRequest, com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsResult> {

	var applicationName: String? = null
	var templateName: String? = null
	var environmentName: String? = null
	var solutionStackName: String? = null
	var platformArn: String? = null
	var options: List<com.amazonaws.services.elasticbeanstalk.model.OptionSpecification>? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsRequest()
		input.setApplicationName(this.applicationName)
		input.setTemplateName(this.templateName)
		input.setEnvironmentName(this.environmentName)
		input.setSolutionStackName(this.solutionStackName)
		input.setPlatformArn(this.platformArn)
		input.setOptions(this.options)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsResult {
		return environment.elasticbeanstalk.describeConfigurationOptions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk describe-configuration-options")
				.argument("application-name", applicationName)
				.argument("template-name", templateName)
				.argument("environment-name", environmentName)
				.argument("solution-stack-name", solutionStackName)
				.argument("platform-arn", platformArn)
				.argument("options", options?.toString())
	}

}


fun AWSElasticBeanstalkFunctions.describeConfigurationSettings(applicationName: String, init: AWSElasticBeanstalkDescribeConfigurationSettingsCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsResult {
	return this.block.declare(AWSElasticBeanstalkDescribeConfigurationSettingsCommand(applicationName).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsResult
}

@Generated
class AWSElasticBeanstalkDescribeConfigurationSettingsCommand(val applicationName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsRequest, com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsResult> {

	var templateName: String? = null
	var environmentName: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsRequest()
		input.setApplicationName(this.applicationName)
		input.setTemplateName(this.templateName)
		input.setEnvironmentName(this.environmentName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsResult {
		return environment.elasticbeanstalk.describeConfigurationSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk describe-configuration-settings")
				.argument("application-name", applicationName)
				.argument("template-name", templateName)
				.argument("environment-name", environmentName)
	}

}


fun AWSElasticBeanstalkFunctions.describeEnvironmentHealth(init: AWSElasticBeanstalkDescribeEnvironmentHealthCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthResult {
	return this.block.declare(AWSElasticBeanstalkDescribeEnvironmentHealthCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthResult
}

@Generated
class AWSElasticBeanstalkDescribeEnvironmentHealthCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthRequest, com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthResult> {

	var environmentName: String? = null
	var environmentId: String? = null
	var attributeNames: List<EnvironmentHealthAttribute>? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthRequest()
		input.setEnvironmentName(this.environmentName)
		input.setEnvironmentId(this.environmentId)
		input.setAttributeNames(this.attributeNames?.map { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthResult {
		return environment.elasticbeanstalk.describeEnvironmentHealth(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk describe-environment-health")
				.argument("environment-name", environmentName)
				.argument("environment-id", environmentId)
				.argument("attribute-names", attributeNames?.toString())
	}

}


fun AWSElasticBeanstalkFunctions.describeEnvironmentManagedActionHistory(init: AWSElasticBeanstalkDescribeEnvironmentManagedActionHistoryCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryResult {
	return this.block.declare(AWSElasticBeanstalkDescribeEnvironmentManagedActionHistoryCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryResult
}

@Generated
class AWSElasticBeanstalkDescribeEnvironmentManagedActionHistoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryRequest, com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryResult> {

	var environmentId: String? = null
	var environmentName: String? = null
	var nextToken: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryRequest()
		input.setEnvironmentId(this.environmentId)
		input.setEnvironmentName(this.environmentName)
		input.setNextToken(this.nextToken)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryResult {
		return environment.elasticbeanstalk.describeEnvironmentManagedActionHistory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk describe-environment-managed-action-history")
				.argument("environment-id", environmentId)
				.argument("environment-name", environmentName)
				.argument("next-token", nextToken)
				.argument("max-items", maxItems?.toString())
	}

}


fun AWSElasticBeanstalkFunctions.describeEnvironmentManagedActions(init: AWSElasticBeanstalkDescribeEnvironmentManagedActionsCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsResult {
	return this.block.declare(AWSElasticBeanstalkDescribeEnvironmentManagedActionsCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsResult
}

@Generated
class AWSElasticBeanstalkDescribeEnvironmentManagedActionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsRequest, com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsResult> {

	var environmentName: String? = null
	var environmentId: String? = null
	var status: ActionStatus? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsRequest()
		input.setEnvironmentName(this.environmentName)
		input.setEnvironmentId(this.environmentId)
		input.setStatus(this.status?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsResult {
		return environment.elasticbeanstalk.describeEnvironmentManagedActions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk describe-environment-managed-actions")
				.argument("environment-name", environmentName)
				.argument("environment-id", environmentId)
				.argument("status", status?.toString())
	}

}


fun AWSElasticBeanstalkFunctions.describeEnvironmentResources(init: AWSElasticBeanstalkDescribeEnvironmentResourcesCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesResult {
	return this.block.declare(AWSElasticBeanstalkDescribeEnvironmentResourcesCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesResult
}

@Generated
class AWSElasticBeanstalkDescribeEnvironmentResourcesCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesRequest, com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesResult> {

	var environmentId: String? = null
	var environmentName: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesRequest()
		input.setEnvironmentId(this.environmentId)
		input.setEnvironmentName(this.environmentName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesResult {
		return environment.elasticbeanstalk.describeEnvironmentResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk describe-environment-resources")
				.argument("environment-id", environmentId)
				.argument("environment-name", environmentName)
	}

}


fun AWSElasticBeanstalkFunctions.describeEnvironments(init: AWSElasticBeanstalkDescribeEnvironmentsCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsResult {
	return this.block.declare(AWSElasticBeanstalkDescribeEnvironmentsCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsResult
}

@Generated
class AWSElasticBeanstalkDescribeEnvironmentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsRequest, com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsResult> {

	var applicationName: String? = null
	var versionLabel: String? = null
	var environmentIds: List<String>? = null
	var environmentNames: List<String>? = null
	var includeDeleted: Boolean? = false
	var includedDeletedBackTo: java.util.Date? = null
	var maxRecords: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsRequest()
		input.setApplicationName(this.applicationName)
		input.setVersionLabel(this.versionLabel)
		input.setEnvironmentIds(this.environmentIds)
		input.setEnvironmentNames(this.environmentNames)
		input.setIncludeDeleted(this.includeDeleted)
		input.setIncludedDeletedBackTo(this.includedDeletedBackTo)
		input.setMaxRecords(this.maxRecords)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsResult {
		return environment.elasticbeanstalk.describeEnvironments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk describe-environments")
				.argument("application-name", applicationName)
				.argument("version-label", versionLabel)
				.argument("environment-ids", environmentIds?.toString())
				.argument("environment-names", environmentNames?.toString())
				.option("include-deleted", includeDeleted ?: false)
				.argument("included-deleted-back-to", includedDeletedBackTo?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSElasticBeanstalkFunctions.describeEvents(init: AWSElasticBeanstalkDescribeEventsCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DescribeEventsResult {
	return this.block.declare(AWSElasticBeanstalkDescribeEventsCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DescribeEventsResult
}

@Generated
class AWSElasticBeanstalkDescribeEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DescribeEventsRequest, com.amazonaws.services.elasticbeanstalk.model.DescribeEventsResult> {

	var applicationName: String? = null
	var versionLabel: String? = null
	var templateName: String? = null
	var environmentId: String? = null
	var environmentName: String? = null
	var platformArn: String? = null
	var requestId: String? = null
	var severity: EventSeverity? = null
	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null
	var maxRecords: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DescribeEventsRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DescribeEventsRequest()
		input.setApplicationName(this.applicationName)
		input.setVersionLabel(this.versionLabel)
		input.setTemplateName(this.templateName)
		input.setEnvironmentId(this.environmentId)
		input.setEnvironmentName(this.environmentName)
		input.setPlatformArn(this.platformArn)
		input.setRequestId(this.requestId)
		input.setSeverity(this.severity?.toString())
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setMaxRecords(this.maxRecords)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DescribeEventsResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DescribeEventsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DescribeEventsResult {
		return environment.elasticbeanstalk.describeEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk describe-events")
				.argument("application-name", applicationName)
				.argument("version-label", versionLabel)
				.argument("template-name", templateName)
				.argument("environment-id", environmentId)
				.argument("environment-name", environmentName)
				.argument("platform-arn", platformArn)
				.argument("request-id", requestId)
				.argument("severity", severity?.toString())
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSElasticBeanstalkFunctions.describeInstancesHealth(init: AWSElasticBeanstalkDescribeInstancesHealthCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthResult {
	return this.block.declare(AWSElasticBeanstalkDescribeInstancesHealthCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthResult
}

@Generated
class AWSElasticBeanstalkDescribeInstancesHealthCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthRequest, com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthResult> {

	var environmentName: String? = null
	var environmentId: String? = null
	var attributeNames: List<InstancesHealthAttribute>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthRequest()
		input.setEnvironmentName(this.environmentName)
		input.setEnvironmentId(this.environmentId)
		input.setAttributeNames(this.attributeNames?.map { it.toString() })
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthResult {
		return environment.elasticbeanstalk.describeInstancesHealth(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk describe-instances-health")
				.argument("environment-name", environmentName)
				.argument("environment-id", environmentId)
				.argument("attribute-names", attributeNames?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSElasticBeanstalkFunctions.describePlatformVersion(init: AWSElasticBeanstalkDescribePlatformVersionCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionResult {
	return this.block.declare(AWSElasticBeanstalkDescribePlatformVersionCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionResult
}

@Generated
class AWSElasticBeanstalkDescribePlatformVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionRequest, com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionResult> {

	var platformArn: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionRequest()
		input.setPlatformArn(this.platformArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionResult {
	  return com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionResult {
		return environment.elasticbeanstalk.describePlatformVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk describe-platform-version")
				.argument("platform-arn", platformArn)
	}

}


fun AWSElasticBeanstalkFunctions.listAvailableSolutionStacks(init: AWSElasticBeanstalkListAvailableSolutionStacksCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksResult {
	return this.block.declare(AWSElasticBeanstalkListAvailableSolutionStacksCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksResult
}

@Generated
class AWSElasticBeanstalkListAvailableSolutionStacksCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksRequest, com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksResult> {



	override fun build(): com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksResult {
	  return com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksResult {
		return environment.elasticbeanstalk.listAvailableSolutionStacks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk list-available-solution-stacks")

	}

}


fun AWSElasticBeanstalkFunctions.listPlatformVersions(init: AWSElasticBeanstalkListPlatformVersionsCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsResult {
	return this.block.declare(AWSElasticBeanstalkListPlatformVersionsCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsResult
}

@Generated
class AWSElasticBeanstalkListPlatformVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsRequest, com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsResult> {

	var filters: List<com.amazonaws.services.elasticbeanstalk.model.PlatformFilter>? = null
	var maxRecords: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsRequest()
		input.setFilters(this.filters)
		input.setMaxRecords(this.maxRecords)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsResult {
	  return com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsResult {
		return environment.elasticbeanstalk.listPlatformVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk list-platform-versions")
				.argument("filters", filters?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSElasticBeanstalkFunctions.listTagsForResource(resourceArn: String, init: AWSElasticBeanstalkListTagsForResourceCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceResult {
	return this.block.declare(AWSElasticBeanstalkListTagsForResourceCommand(resourceArn).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceResult
}

@Generated
class AWSElasticBeanstalkListTagsForResourceCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceRequest, com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceResult> {



	override fun build(): com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceRequest()
		input.setResourceArn(this.resourceArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceResult {
	  return com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceResult {
		return environment.elasticbeanstalk.listTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk list-tags-for-resource")
				.argument("resource-arn", resourceArn)
	}

}


fun AWSElasticBeanstalkFunctions.rebuildEnvironment(init: AWSElasticBeanstalkRebuildEnvironmentCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentResult {
	return this.block.declare(AWSElasticBeanstalkRebuildEnvironmentCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentResult
}

@Generated
class AWSElasticBeanstalkRebuildEnvironmentCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentRequest, com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentResult> {

	var environmentId: String? = null
	var environmentName: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentRequest()
		input.setEnvironmentId(this.environmentId)
		input.setEnvironmentName(this.environmentName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentResult {
	  return com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentResult {
		return environment.elasticbeanstalk.rebuildEnvironment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk rebuild-environment")
				.argument("environment-id", environmentId)
				.argument("environment-name", environmentName)
	}

}


fun AWSElasticBeanstalkFunctions.requestEnvironmentInfo(infoType: EnvironmentInfoType, init: AWSElasticBeanstalkRequestEnvironmentInfoCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoResult {
	return this.block.declare(AWSElasticBeanstalkRequestEnvironmentInfoCommand(infoType).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoResult
}

@Generated
class AWSElasticBeanstalkRequestEnvironmentInfoCommand(val infoType: EnvironmentInfoType) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoRequest, com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoResult> {

	var environmentId: String? = null
	var environmentName: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoRequest()
		input.setEnvironmentId(this.environmentId)
		input.setEnvironmentName(this.environmentName)
		input.setInfoType(this.infoType.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoResult {
	  return com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoResult {
		return environment.elasticbeanstalk.requestEnvironmentInfo(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk request-environment-info")
				.argument("environment-id", environmentId)
				.argument("environment-name", environmentName)
				.argument("info-type", infoType.toString())
	}

}


fun AWSElasticBeanstalkFunctions.restartAppServer(init: AWSElasticBeanstalkRestartAppServerCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.RestartAppServerResult {
	return this.block.declare(AWSElasticBeanstalkRestartAppServerCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.RestartAppServerResult
}

@Generated
class AWSElasticBeanstalkRestartAppServerCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.RestartAppServerRequest, com.amazonaws.services.elasticbeanstalk.model.RestartAppServerResult> {

	var environmentId: String? = null
	var environmentName: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.RestartAppServerRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.RestartAppServerRequest()
		input.setEnvironmentId(this.environmentId)
		input.setEnvironmentName(this.environmentName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.RestartAppServerResult {
	  return com.amazonaws.services.elasticbeanstalk.model.RestartAppServerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.RestartAppServerResult {
		return environment.elasticbeanstalk.restartAppServer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk restart-app-server")
				.argument("environment-id", environmentId)
				.argument("environment-name", environmentName)
	}

}


fun AWSElasticBeanstalkFunctions.retrieveEnvironmentInfo(infoType: EnvironmentInfoType, init: AWSElasticBeanstalkRetrieveEnvironmentInfoCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoResult {
	return this.block.declare(AWSElasticBeanstalkRetrieveEnvironmentInfoCommand(infoType).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoResult
}

@Generated
class AWSElasticBeanstalkRetrieveEnvironmentInfoCommand(val infoType: EnvironmentInfoType) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoRequest, com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoResult> {

	var environmentId: String? = null
	var environmentName: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoRequest()
		input.setEnvironmentId(this.environmentId)
		input.setEnvironmentName(this.environmentName)
		input.setInfoType(this.infoType.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoResult {
	  return com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoResult {
		return environment.elasticbeanstalk.retrieveEnvironmentInfo(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk retrieve-environment-info")
				.argument("environment-id", environmentId)
				.argument("environment-name", environmentName)
				.argument("info-type", infoType.toString())
	}

}


fun AWSElasticBeanstalkFunctions.swapEnvironmentCNAMEs(init: AWSElasticBeanstalkSwapEnvironmentCNAMEsCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsResult {
	return this.block.declare(AWSElasticBeanstalkSwapEnvironmentCNAMEsCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsResult
}

@Generated
class AWSElasticBeanstalkSwapEnvironmentCNAMEsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsRequest, com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsResult> {

	var sourceEnvironmentId: String? = null
	var sourceEnvironmentName: String? = null
	var destinationEnvironmentId: String? = null
	var destinationEnvironmentName: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsRequest()
		input.setSourceEnvironmentId(this.sourceEnvironmentId)
		input.setSourceEnvironmentName(this.sourceEnvironmentName)
		input.setDestinationEnvironmentId(this.destinationEnvironmentId)
		input.setDestinationEnvironmentName(this.destinationEnvironmentName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsResult {
	  return com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsResult {
		return environment.elasticbeanstalk.swapEnvironmentCNAMEs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk swap-environment-cnames")
				.argument("source-environment-id", sourceEnvironmentId)
				.argument("source-environment-name", sourceEnvironmentName)
				.argument("destination-environment-id", destinationEnvironmentId)
				.argument("destination-environment-name", destinationEnvironmentName)
	}

}


fun AWSElasticBeanstalkFunctions.terminateEnvironment(init: AWSElasticBeanstalkTerminateEnvironmentCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentResult {
	return this.block.declare(AWSElasticBeanstalkTerminateEnvironmentCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentResult
}

@Generated
class AWSElasticBeanstalkTerminateEnvironmentCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentRequest, com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentResult> {

	var environmentId: String? = null
	var environmentName: String? = null
	var terminateResources: Boolean? = false
	var forceTerminate: Boolean? = false

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentRequest()
		input.setEnvironmentId(this.environmentId)
		input.setEnvironmentName(this.environmentName)
		input.setTerminateResources(this.terminateResources)
		input.setForceTerminate(this.forceTerminate)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentResult {
	  return com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentResult {
		return environment.elasticbeanstalk.terminateEnvironment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk terminate-environment")
				.argument("environment-id", environmentId)
				.argument("environment-name", environmentName)
				.option("terminate-resources", terminateResources ?: false)
				.option("force-terminate", forceTerminate ?: false)
	}

}


fun AWSElasticBeanstalkFunctions.updateApplication(applicationName: String, init: AWSElasticBeanstalkUpdateApplicationCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResult {
	return this.block.declare(AWSElasticBeanstalkUpdateApplicationCommand(applicationName).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResult
}

@Generated
class AWSElasticBeanstalkUpdateApplicationCommand(val applicationName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationRequest, com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResult> {

	var description: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationRequest()
		input.setApplicationName(this.applicationName)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResult {
	  return com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResult {
		return environment.elasticbeanstalk.updateApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk update-application")
				.argument("application-name", applicationName)
				.argument("description", description)
	}

}


fun AWSElasticBeanstalkFunctions.updateApplicationResourceLifecycle(applicationName: String, resourceLifecycleConfig: com.amazonaws.services.elasticbeanstalk.model.ApplicationResourceLifecycleConfig, init: AWSElasticBeanstalkUpdateApplicationResourceLifecycleCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleResult {
	return this.block.declare(AWSElasticBeanstalkUpdateApplicationResourceLifecycleCommand(applicationName, resourceLifecycleConfig).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleResult
}

@Generated
class AWSElasticBeanstalkUpdateApplicationResourceLifecycleCommand(val applicationName: String, val resourceLifecycleConfig: com.amazonaws.services.elasticbeanstalk.model.ApplicationResourceLifecycleConfig) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleRequest, com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleResult> {



	override fun build(): com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleRequest()
		input.setApplicationName(this.applicationName)
		input.setResourceLifecycleConfig(this.resourceLifecycleConfig)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleResult {
	  return com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleResult {
		return environment.elasticbeanstalk.updateApplicationResourceLifecycle(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk update-application-resource-lifecycle")
				.argument("application-name", applicationName)
				.argument("resource-lifecycle-config", resourceLifecycleConfig.toString())
	}

}


fun AWSElasticBeanstalkFunctions.updateApplicationVersion(applicationName: String, versionLabel: String, init: AWSElasticBeanstalkUpdateApplicationVersionCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionResult {
	return this.block.declare(AWSElasticBeanstalkUpdateApplicationVersionCommand(applicationName, versionLabel).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionResult
}

@Generated
class AWSElasticBeanstalkUpdateApplicationVersionCommand(val applicationName: String, val versionLabel: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionRequest, com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionResult> {

	var description: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionRequest()
		input.setApplicationName(this.applicationName)
		input.setVersionLabel(this.versionLabel)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionResult {
	  return com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionResult {
		return environment.elasticbeanstalk.updateApplicationVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk update-application-version")
				.argument("application-name", applicationName)
				.argument("version-label", versionLabel)
				.argument("description", description)
	}

}


fun AWSElasticBeanstalkFunctions.updateConfigurationTemplate(applicationName: String, templateName: String, init: AWSElasticBeanstalkUpdateConfigurationTemplateCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateResult {
	return this.block.declare(AWSElasticBeanstalkUpdateConfigurationTemplateCommand(applicationName, templateName).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateResult
}

@Generated
class AWSElasticBeanstalkUpdateConfigurationTemplateCommand(val applicationName: String, val templateName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateRequest, com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateResult> {

	var description: String? = null
	var optionSettings: List<com.amazonaws.services.elasticbeanstalk.model.ConfigurationOptionSetting>? = null
	var optionsToRemove: List<com.amazonaws.services.elasticbeanstalk.model.OptionSpecification>? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateRequest()
		input.setApplicationName(this.applicationName)
		input.setTemplateName(this.templateName)
		input.setDescription(this.description)
		input.setOptionSettings(this.optionSettings)
		input.setOptionsToRemove(this.optionsToRemove)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateResult {
	  return com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateResult {
		return environment.elasticbeanstalk.updateConfigurationTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk update-configuration-template")
				.argument("application-name", applicationName)
				.argument("template-name", templateName)
				.argument("description", description)
				.argument("option-settings", optionSettings?.toString())
				.argument("options-to-remove", optionsToRemove?.toString())
	}

}


fun AWSElasticBeanstalkFunctions.updateEnvironment(init: AWSElasticBeanstalkUpdateEnvironmentCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentResult {
	return this.block.declare(AWSElasticBeanstalkUpdateEnvironmentCommand().apply(init)) as com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentResult
}

@Generated
class AWSElasticBeanstalkUpdateEnvironmentCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentRequest, com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentResult> {

	var applicationName: String? = null
	var environmentId: String? = null
	var environmentName: String? = null
	var groupName: String? = null
	var description: String? = null
	var tier: com.amazonaws.services.elasticbeanstalk.model.EnvironmentTier? = null
	var versionLabel: String? = null
	var templateName: String? = null
	var solutionStackName: String? = null
	var platformArn: String? = null
	var optionSettings: List<com.amazonaws.services.elasticbeanstalk.model.ConfigurationOptionSetting>? = null
	var optionsToRemove: List<com.amazonaws.services.elasticbeanstalk.model.OptionSpecification>? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentRequest()
		input.setApplicationName(this.applicationName)
		input.setEnvironmentId(this.environmentId)
		input.setEnvironmentName(this.environmentName)
		input.setGroupName(this.groupName)
		input.setDescription(this.description)
		input.setTier(this.tier)
		input.setVersionLabel(this.versionLabel)
		input.setTemplateName(this.templateName)
		input.setSolutionStackName(this.solutionStackName)
		input.setPlatformArn(this.platformArn)
		input.setOptionSettings(this.optionSettings)
		input.setOptionsToRemove(this.optionsToRemove)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentResult {
	  return com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentResult {
		return environment.elasticbeanstalk.updateEnvironment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk update-environment")
				.argument("application-name", applicationName)
				.argument("environment-id", environmentId)
				.argument("environment-name", environmentName)
				.argument("group-name", groupName)
				.argument("description", description)
				.argument("tier", tier?.toString())
				.argument("version-label", versionLabel)
				.argument("template-name", templateName)
				.argument("solution-stack-name", solutionStackName)
				.argument("platform-arn", platformArn)
				.argument("option-settings", optionSettings?.toString())
				.argument("options-to-remove", optionsToRemove?.toString())
	}

}


fun AWSElasticBeanstalkFunctions.updateTagsForResource(resourceArn: String, init: AWSElasticBeanstalkUpdateTagsForResourceCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceResult {
	return this.block.declare(AWSElasticBeanstalkUpdateTagsForResourceCommand(resourceArn).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceResult
}

@Generated
class AWSElasticBeanstalkUpdateTagsForResourceCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceRequest, com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceResult> {

	var tagsToAdd: List<com.amazonaws.services.elasticbeanstalk.model.Tag>? = null
	var tagsToRemove: List<String>? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagsToAdd(this.tagsToAdd)
		input.setTagsToRemove(this.tagsToRemove)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceResult {
	  return com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceResult {
		return environment.elasticbeanstalk.updateTagsForResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk update-tags-for-resource")
				.argument("resource-arn", resourceArn)
				.argument("tags-to-add", tagsToAdd?.toString())
				.argument("tags-to-remove", tagsToRemove?.toString())
	}

}


fun AWSElasticBeanstalkFunctions.validateConfigurationSettings(applicationName: String, optionSettings: List<com.amazonaws.services.elasticbeanstalk.model.ConfigurationOptionSetting>, init: AWSElasticBeanstalkValidateConfigurationSettingsCommand.() -> Unit): com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsResult {
	return this.block.declare(AWSElasticBeanstalkValidateConfigurationSettingsCommand(applicationName, optionSettings).apply(init)) as com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsResult
}

@Generated
class AWSElasticBeanstalkValidateConfigurationSettingsCommand(val applicationName: String, val optionSettings: List<com.amazonaws.services.elasticbeanstalk.model.ConfigurationOptionSetting>) : AmazonWebServiceCommand<com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsRequest, com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsResult> {

	var templateName: String? = null
	var environmentName: String? = null

	override fun build(): com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsRequest {
		val input = com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsRequest()
		input.setApplicationName(this.applicationName)
		input.setTemplateName(this.templateName)
		input.setEnvironmentName(this.environmentName)
		input.setOptionSettings(this.optionSettings)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsResult {
	  return com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsResult {
		return environment.elasticbeanstalk.validateConfigurationSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticbeanstalk validate-configuration-settings")
				.argument("application-name", applicationName)
				.argument("template-name", templateName)
				.argument("environment-name", environmentName)
				.argument("option-settings", optionSettings.toString())
	}

}
