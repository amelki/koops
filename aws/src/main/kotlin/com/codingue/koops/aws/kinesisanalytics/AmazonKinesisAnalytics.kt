
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.kinesisanalytics

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.kinesisanalytics.*
import com.amazonaws.services.kinesisanalytics.model.*

var com.codingue.koops.core.Environment.kinesisanalytics: AmazonKinesisAnalytics
	get() {
		var service = this.capabilities["aws-kinesisanalytics"]
		if (service == null) {
			service = AmazonKinesisAnalyticsClientBuilder.standard().build()
			this.capabilities["aws-kinesisanalytics"] = service
		}
		return service as AmazonKinesisAnalytics
	}
	set(kinesisanalytics) {
		this.capabilities["aws-kinesisanalytics"] = kinesisanalytics
	}

@Generated
class AmazonKinesisAnalyticsFunctions(val block: Block)

infix fun <T> AwsContinuation.kinesisanalytics(init: AmazonKinesisAnalyticsFunctions.() -> T): T {
	return AmazonKinesisAnalyticsFunctions(shell).run(init)
}

			

fun AmazonKinesisAnalyticsFunctions.addApplicationCloudWatchLoggingOption(applicationName: String, currentApplicationVersionId: Long, cloudWatchLoggingOption: com.amazonaws.services.kinesisanalytics.model.CloudWatchLoggingOption, init: (AmazonKinesisAnalyticsAddApplicationCloudWatchLoggingOptionCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionResult {
	return this.block.declare(AmazonKinesisAnalyticsAddApplicationCloudWatchLoggingOptionCommand(applicationName, currentApplicationVersionId, cloudWatchLoggingOption).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionResult
}

@Generated
class AmazonKinesisAnalyticsAddApplicationCloudWatchLoggingOptionCommand(val applicationName: String, val currentApplicationVersionId: Long, val cloudWatchLoggingOption: com.amazonaws.services.kinesisanalytics.model.CloudWatchLoggingOption) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionRequest, com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionResult> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setCloudWatchLoggingOption(this.cloudWatchLoggingOption)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionResult {
	  return com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionResult {
		return environment.kinesisanalytics.addApplicationCloudWatchLoggingOption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics add-application-cloud-watch-logging-option")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("cloud-watch-logging-option", cloudWatchLoggingOption.toString())
	}

}


fun AmazonKinesisAnalyticsFunctions.addApplicationInput(applicationName: String, currentApplicationVersionId: Long, input: com.amazonaws.services.kinesisanalytics.model.Input, init: (AmazonKinesisAnalyticsAddApplicationInputCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.AddApplicationInputResult {
	return this.block.declare(AmazonKinesisAnalyticsAddApplicationInputCommand(applicationName, currentApplicationVersionId, input).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.AddApplicationInputResult
}

@Generated
class AmazonKinesisAnalyticsAddApplicationInputCommand(val applicationName: String, val currentApplicationVersionId: Long, val input: com.amazonaws.services.kinesisanalytics.model.Input) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.AddApplicationInputRequest, com.amazonaws.services.kinesisanalytics.model.AddApplicationInputResult> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.AddApplicationInputRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.AddApplicationInputRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setInput(this.input)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.AddApplicationInputResult {
	  return com.amazonaws.services.kinesisanalytics.model.AddApplicationInputResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.AddApplicationInputResult {
		return environment.kinesisanalytics.addApplicationInput(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics add-application-input")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("input", input.toString())
	}

}


fun AmazonKinesisAnalyticsFunctions.addApplicationInputProcessingConfiguration(applicationName: String, currentApplicationVersionId: Long, inputId: String, inputProcessingConfiguration: com.amazonaws.services.kinesisanalytics.model.InputProcessingConfiguration, init: (AmazonKinesisAnalyticsAddApplicationInputProcessingConfigurationCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationResult {
	return this.block.declare(AmazonKinesisAnalyticsAddApplicationInputProcessingConfigurationCommand(applicationName, currentApplicationVersionId, inputId, inputProcessingConfiguration).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationResult
}

@Generated
class AmazonKinesisAnalyticsAddApplicationInputProcessingConfigurationCommand(val applicationName: String, val currentApplicationVersionId: Long, val inputId: String, val inputProcessingConfiguration: com.amazonaws.services.kinesisanalytics.model.InputProcessingConfiguration) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationRequest, com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationResult> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setInputId(this.inputId)
		input.setInputProcessingConfiguration(this.inputProcessingConfiguration)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationResult {
	  return com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationResult {
		return environment.kinesisanalytics.addApplicationInputProcessingConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics add-application-input-processing-configuration")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("input-id", inputId)
				.argument("input-processing-configuration", inputProcessingConfiguration.toString())
	}

}


fun AmazonKinesisAnalyticsFunctions.addApplicationOutput(applicationName: String, currentApplicationVersionId: Long, output: com.amazonaws.services.kinesisanalytics.model.Output, init: (AmazonKinesisAnalyticsAddApplicationOutputCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputResult {
	return this.block.declare(AmazonKinesisAnalyticsAddApplicationOutputCommand(applicationName, currentApplicationVersionId, output).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputResult
}

@Generated
class AmazonKinesisAnalyticsAddApplicationOutputCommand(val applicationName: String, val currentApplicationVersionId: Long, val output: com.amazonaws.services.kinesisanalytics.model.Output) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputRequest, com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputResult> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setOutput(this.output)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputResult {
	  return com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputResult {
		return environment.kinesisanalytics.addApplicationOutput(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics add-application-output")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("output", output.toString())
	}

}


fun AmazonKinesisAnalyticsFunctions.addApplicationReferenceDataSource(applicationName: String, currentApplicationVersionId: Long, referenceDataSource: com.amazonaws.services.kinesisanalytics.model.ReferenceDataSource, init: (AmazonKinesisAnalyticsAddApplicationReferenceDataSourceCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceResult {
	return this.block.declare(AmazonKinesisAnalyticsAddApplicationReferenceDataSourceCommand(applicationName, currentApplicationVersionId, referenceDataSource).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceResult
}

@Generated
class AmazonKinesisAnalyticsAddApplicationReferenceDataSourceCommand(val applicationName: String, val currentApplicationVersionId: Long, val referenceDataSource: com.amazonaws.services.kinesisanalytics.model.ReferenceDataSource) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceRequest, com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceResult> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setReferenceDataSource(this.referenceDataSource)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceResult {
	  return com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceResult {
		return environment.kinesisanalytics.addApplicationReferenceDataSource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics add-application-reference-data-source")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("reference-data-source", referenceDataSource.toString())
	}

}


fun AmazonKinesisAnalyticsFunctions.createApplication(applicationName: String, init: (AmazonKinesisAnalyticsCreateApplicationCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.CreateApplicationResult {
	return this.block.declare(AmazonKinesisAnalyticsCreateApplicationCommand(applicationName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.CreateApplicationResult
}

@Generated
class AmazonKinesisAnalyticsCreateApplicationCommand(val applicationName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.CreateApplicationRequest, com.amazonaws.services.kinesisanalytics.model.CreateApplicationResult> {

	var applicationDescription: String? = null
	var inputs: List<com.amazonaws.services.kinesisanalytics.model.Input>? = null
	var outputs: List<com.amazonaws.services.kinesisanalytics.model.Output>? = null
	var cloudWatchLoggingOptions: List<com.amazonaws.services.kinesisanalytics.model.CloudWatchLoggingOption>? = null
	var applicationCode: String? = null

	override fun build(): com.amazonaws.services.kinesisanalytics.model.CreateApplicationRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.CreateApplicationRequest()
		input.setApplicationName(this.applicationName)
		input.setApplicationDescription(this.applicationDescription)
		input.setInputs(this.inputs)
		input.setOutputs(this.outputs)
		input.setCloudWatchLoggingOptions(this.cloudWatchLoggingOptions)
		input.setApplicationCode(this.applicationCode)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.CreateApplicationResult {
	  return com.amazonaws.services.kinesisanalytics.model.CreateApplicationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.CreateApplicationResult {
		return environment.kinesisanalytics.createApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics create-application")
				.argument("application-name", applicationName)
				.argument("application-description", applicationDescription)
				.argument("inputs", inputs?.toString())
				.argument("outputs", outputs?.toString())
				.argument("cloud-watch-logging-options", cloudWatchLoggingOptions?.toString())
				.argument("application-code", applicationCode)
	}

}


fun AmazonKinesisAnalyticsFunctions.deleteApplication(applicationName: String, createTimestamp: java.util.Date, init: (AmazonKinesisAnalyticsDeleteApplicationCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationResult {
	return this.block.declare(AmazonKinesisAnalyticsDeleteApplicationCommand(applicationName, createTimestamp).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.DeleteApplicationResult
}

@Generated
class AmazonKinesisAnalyticsDeleteApplicationCommand(val applicationName: String, val createTimestamp: java.util.Date) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationRequest, com.amazonaws.services.kinesisanalytics.model.DeleteApplicationResult> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.DeleteApplicationRequest()
		input.setApplicationName(this.applicationName)
		input.setCreateTimestamp(this.createTimestamp)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationResult {
	  return com.amazonaws.services.kinesisanalytics.model.DeleteApplicationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationResult {
		return environment.kinesisanalytics.deleteApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics delete-application")
				.argument("application-name", applicationName)
				.argument("create-timestamp", createTimestamp.toString())
	}

}


fun AmazonKinesisAnalyticsFunctions.deleteApplicationCloudWatchLoggingOption(applicationName: String, currentApplicationVersionId: Long, cloudWatchLoggingOptionId: String, init: (AmazonKinesisAnalyticsDeleteApplicationCloudWatchLoggingOptionCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionResult {
	return this.block.declare(AmazonKinesisAnalyticsDeleteApplicationCloudWatchLoggingOptionCommand(applicationName, currentApplicationVersionId, cloudWatchLoggingOptionId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionResult
}

@Generated
class AmazonKinesisAnalyticsDeleteApplicationCloudWatchLoggingOptionCommand(val applicationName: String, val currentApplicationVersionId: Long, val cloudWatchLoggingOptionId: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionRequest, com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionResult> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setCloudWatchLoggingOptionId(this.cloudWatchLoggingOptionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionResult {
	  return com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionResult {
		return environment.kinesisanalytics.deleteApplicationCloudWatchLoggingOption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics delete-application-cloud-watch-logging-option")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("cloud-watch-logging-option-id", cloudWatchLoggingOptionId)
	}

}


fun AmazonKinesisAnalyticsFunctions.deleteApplicationInputProcessingConfiguration(applicationName: String, currentApplicationVersionId: Long, inputId: String, init: (AmazonKinesisAnalyticsDeleteApplicationInputProcessingConfigurationCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationResult {
	return this.block.declare(AmazonKinesisAnalyticsDeleteApplicationInputProcessingConfigurationCommand(applicationName, currentApplicationVersionId, inputId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationResult
}

@Generated
class AmazonKinesisAnalyticsDeleteApplicationInputProcessingConfigurationCommand(val applicationName: String, val currentApplicationVersionId: Long, val inputId: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationRequest, com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationResult> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setInputId(this.inputId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationResult {
	  return com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationResult {
		return environment.kinesisanalytics.deleteApplicationInputProcessingConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics delete-application-input-processing-configuration")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("input-id", inputId)
	}

}


fun AmazonKinesisAnalyticsFunctions.deleteApplicationOutput(applicationName: String, currentApplicationVersionId: Long, outputId: String, init: (AmazonKinesisAnalyticsDeleteApplicationOutputCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputResult {
	return this.block.declare(AmazonKinesisAnalyticsDeleteApplicationOutputCommand(applicationName, currentApplicationVersionId, outputId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputResult
}

@Generated
class AmazonKinesisAnalyticsDeleteApplicationOutputCommand(val applicationName: String, val currentApplicationVersionId: Long, val outputId: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputRequest, com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputResult> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setOutputId(this.outputId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputResult {
	  return com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputResult {
		return environment.kinesisanalytics.deleteApplicationOutput(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics delete-application-output")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("output-id", outputId)
	}

}


fun AmazonKinesisAnalyticsFunctions.deleteApplicationReferenceDataSource(applicationName: String, currentApplicationVersionId: Long, referenceId: String, init: (AmazonKinesisAnalyticsDeleteApplicationReferenceDataSourceCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceResult {
	return this.block.declare(AmazonKinesisAnalyticsDeleteApplicationReferenceDataSourceCommand(applicationName, currentApplicationVersionId, referenceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceResult
}

@Generated
class AmazonKinesisAnalyticsDeleteApplicationReferenceDataSourceCommand(val applicationName: String, val currentApplicationVersionId: Long, val referenceId: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceRequest, com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceResult> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setReferenceId(this.referenceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceResult {
	  return com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceResult {
		return environment.kinesisanalytics.deleteApplicationReferenceDataSource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics delete-application-reference-data-source")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("reference-id", referenceId)
	}

}


fun AmazonKinesisAnalyticsFunctions.describeApplication(applicationName: String, init: (AmazonKinesisAnalyticsDescribeApplicationCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.DescribeApplicationResult {
	return this.block.declare(AmazonKinesisAnalyticsDescribeApplicationCommand(applicationName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.DescribeApplicationResult
}

@Generated
class AmazonKinesisAnalyticsDescribeApplicationCommand(val applicationName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.DescribeApplicationRequest, com.amazonaws.services.kinesisanalytics.model.DescribeApplicationResult> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.DescribeApplicationRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.DescribeApplicationRequest()
		input.setApplicationName(this.applicationName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.DescribeApplicationResult {
	  return com.amazonaws.services.kinesisanalytics.model.DescribeApplicationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.DescribeApplicationResult {
		return environment.kinesisanalytics.describeApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics describe-application")
				.argument("application-name", applicationName)
	}

}


fun AmazonKinesisAnalyticsFunctions.discoverInputSchema(init: (AmazonKinesisAnalyticsDiscoverInputSchemaCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaResult {
	return this.block.declare(AmazonKinesisAnalyticsDiscoverInputSchemaCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaResult
}

@Generated
class AmazonKinesisAnalyticsDiscoverInputSchemaCommand() : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaRequest, com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaResult> {

	var resourceARN: String? = null
	var roleARN: String? = null
	var inputStartingPositionConfiguration: com.amazonaws.services.kinesisanalytics.model.InputStartingPositionConfiguration? = null
	var s3Configuration: com.amazonaws.services.kinesisanalytics.model.S3Configuration? = null
	var inputProcessingConfiguration: com.amazonaws.services.kinesisanalytics.model.InputProcessingConfiguration? = null

	override fun build(): com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaRequest()
		input.setResourceARN(this.resourceARN)
		input.setRoleARN(this.roleARN)
		input.setInputStartingPositionConfiguration(this.inputStartingPositionConfiguration)
		input.setS3Configuration(this.s3Configuration)
		input.setInputProcessingConfiguration(this.inputProcessingConfiguration)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaResult {
	  return com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaResult {
		return environment.kinesisanalytics.discoverInputSchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics discover-input-schema")
				.argument("resource-arn", resourceARN)
				.argument("role-arn", roleARN)
				.argument("input-starting-position-configuration", inputStartingPositionConfiguration?.toString())
				.argument("s3-configuration", s3Configuration?.toString())
				.argument("input-processing-configuration", inputProcessingConfiguration?.toString())
	}

}


fun AmazonKinesisAnalyticsFunctions.listApplications(init: (AmazonKinesisAnalyticsListApplicationsCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.ListApplicationsResult {
	return this.block.declare(AmazonKinesisAnalyticsListApplicationsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.ListApplicationsResult
}

@Generated
class AmazonKinesisAnalyticsListApplicationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.ListApplicationsRequest, com.amazonaws.services.kinesisanalytics.model.ListApplicationsResult> {

	var limit: Int? = 0
	var exclusiveStartApplicationName: String? = null

	override fun build(): com.amazonaws.services.kinesisanalytics.model.ListApplicationsRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.ListApplicationsRequest()
		input.setLimit(this.limit)
		input.setExclusiveStartApplicationName(this.exclusiveStartApplicationName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.ListApplicationsResult {
	  return com.amazonaws.services.kinesisanalytics.model.ListApplicationsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.ListApplicationsResult {
		return environment.kinesisanalytics.listApplications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics list-applications")
				.argument("limit", limit?.toString())
				.argument("exclusive-start-application-name", exclusiveStartApplicationName)
	}

}


fun AmazonKinesisAnalyticsFunctions.startApplication(applicationName: String, inputConfigurations: List<com.amazonaws.services.kinesisanalytics.model.InputConfiguration>, init: (AmazonKinesisAnalyticsStartApplicationCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.StartApplicationResult {
	return this.block.declare(AmazonKinesisAnalyticsStartApplicationCommand(applicationName, inputConfigurations).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.StartApplicationResult
}

@Generated
class AmazonKinesisAnalyticsStartApplicationCommand(val applicationName: String, val inputConfigurations: List<com.amazonaws.services.kinesisanalytics.model.InputConfiguration>) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.StartApplicationRequest, com.amazonaws.services.kinesisanalytics.model.StartApplicationResult> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.StartApplicationRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.StartApplicationRequest()
		input.setApplicationName(this.applicationName)
		input.setInputConfigurations(this.inputConfigurations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.StartApplicationResult {
	  return com.amazonaws.services.kinesisanalytics.model.StartApplicationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.StartApplicationResult {
		return environment.kinesisanalytics.startApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics start-application")
				.argument("application-name", applicationName)
				.argument("input-configurations", inputConfigurations.toString())
	}

}


fun AmazonKinesisAnalyticsFunctions.stopApplication(applicationName: String, init: (AmazonKinesisAnalyticsStopApplicationCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.StopApplicationResult {
	return this.block.declare(AmazonKinesisAnalyticsStopApplicationCommand(applicationName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.StopApplicationResult
}

@Generated
class AmazonKinesisAnalyticsStopApplicationCommand(val applicationName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.StopApplicationRequest, com.amazonaws.services.kinesisanalytics.model.StopApplicationResult> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.StopApplicationRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.StopApplicationRequest()
		input.setApplicationName(this.applicationName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.StopApplicationResult {
	  return com.amazonaws.services.kinesisanalytics.model.StopApplicationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.StopApplicationResult {
		return environment.kinesisanalytics.stopApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics stop-application")
				.argument("application-name", applicationName)
	}

}


fun AmazonKinesisAnalyticsFunctions.updateApplication(applicationName: String, currentApplicationVersionId: Long, applicationUpdate: com.amazonaws.services.kinesisanalytics.model.ApplicationUpdate, init: (AmazonKinesisAnalyticsUpdateApplicationCommand.() -> Unit)? = null): com.amazonaws.services.kinesisanalytics.model.UpdateApplicationResult {
	return this.block.declare(AmazonKinesisAnalyticsUpdateApplicationCommand(applicationName, currentApplicationVersionId, applicationUpdate).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisanalytics.model.UpdateApplicationResult
}

@Generated
class AmazonKinesisAnalyticsUpdateApplicationCommand(val applicationName: String, val currentApplicationVersionId: Long, val applicationUpdate: com.amazonaws.services.kinesisanalytics.model.ApplicationUpdate) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.UpdateApplicationRequest, com.amazonaws.services.kinesisanalytics.model.UpdateApplicationResult> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.UpdateApplicationRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.UpdateApplicationRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setApplicationUpdate(this.applicationUpdate)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisanalytics.model.UpdateApplicationResult {
	  return com.amazonaws.services.kinesisanalytics.model.UpdateApplicationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisanalytics.model.UpdateApplicationResult {
		return environment.kinesisanalytics.updateApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics update-application")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("application-update", applicationUpdate.toString())
	}

}
