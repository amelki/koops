
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.kinesisanalytics.AmazonKinesisAnalytics
import com.amazonaws.services.kinesisanalytics.model.*

var codingue.koops.core.Environment.kinesisanalytics: AmazonKinesisAnalytics
	get() = this.capabilities[AmazonKinesisAnalytics::class.java.name] as AmazonKinesisAnalytics
	set(kinesisanalytics) {
		this.capabilities[AmazonKinesisAnalytics::class.java.name] = kinesisanalytics
	}

@Generated
class AmazonKinesisAnalyticsFunctions(val block: Block)

infix fun AwsContinuation.kinesisanalytics(init: AmazonKinesisAnalyticsFunctions.() -> Unit) {
	AmazonKinesisAnalyticsFunctions(shell).apply(init)
}

			

fun AmazonKinesisAnalyticsFunctions.addApplicationCloudWatchLoggingOption(applicationName: String, currentApplicationVersionId: Long, cloudWatchLoggingOption: com.amazonaws.services.kinesisanalytics.model.CloudWatchLoggingOption, init: AmazonKinesisAnalyticsAddApplicationCloudWatchLoggingOptionCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsAddApplicationCloudWatchLoggingOptionCommand(applicationName, currentApplicationVersionId, cloudWatchLoggingOption).apply(init))
}

@Generated
class AmazonKinesisAnalyticsAddApplicationCloudWatchLoggingOptionCommand(val applicationName: String, val currentApplicationVersionId: Long, val cloudWatchLoggingOption: com.amazonaws.services.kinesisanalytics.model.CloudWatchLoggingOption) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionRequest> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setCloudWatchLoggingOption(this.cloudWatchLoggingOption)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.addApplicationCloudWatchLoggingOption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics add-application-cloud-watch-logging-option")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("cloud-watch-logging-option", cloudWatchLoggingOption.toString())
	}

}


fun AmazonKinesisAnalyticsFunctions.addApplicationInput(applicationName: String, currentApplicationVersionId: Long, input: com.amazonaws.services.kinesisanalytics.model.Input, init: AmazonKinesisAnalyticsAddApplicationInputCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsAddApplicationInputCommand(applicationName, currentApplicationVersionId, input).apply(init))
}

@Generated
class AmazonKinesisAnalyticsAddApplicationInputCommand(val applicationName: String, val currentApplicationVersionId: Long, val input: com.amazonaws.services.kinesisanalytics.model.Input) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.AddApplicationInputRequest> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.AddApplicationInputRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.AddApplicationInputRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setInput(this.input)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.addApplicationInput(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics add-application-input")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("input", input.toString())
	}

}


fun AmazonKinesisAnalyticsFunctions.addApplicationInputProcessingConfiguration(applicationName: String, currentApplicationVersionId: Long, inputId: String, inputProcessingConfiguration: com.amazonaws.services.kinesisanalytics.model.InputProcessingConfiguration, init: AmazonKinesisAnalyticsAddApplicationInputProcessingConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsAddApplicationInputProcessingConfigurationCommand(applicationName, currentApplicationVersionId, inputId, inputProcessingConfiguration).apply(init))
}

@Generated
class AmazonKinesisAnalyticsAddApplicationInputProcessingConfigurationCommand(val applicationName: String, val currentApplicationVersionId: Long, val inputId: String, val inputProcessingConfiguration: com.amazonaws.services.kinesisanalytics.model.InputProcessingConfiguration) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationRequest> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setInputId(this.inputId)
		input.setInputProcessingConfiguration(this.inputProcessingConfiguration)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.addApplicationInputProcessingConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics add-application-input-processing-configuration")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("input-id", inputId)
				.argument("input-processing-configuration", inputProcessingConfiguration.toString())
	}

}


fun AmazonKinesisAnalyticsFunctions.addApplicationOutput(applicationName: String, currentApplicationVersionId: Long, output: com.amazonaws.services.kinesisanalytics.model.Output, init: AmazonKinesisAnalyticsAddApplicationOutputCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsAddApplicationOutputCommand(applicationName, currentApplicationVersionId, output).apply(init))
}

@Generated
class AmazonKinesisAnalyticsAddApplicationOutputCommand(val applicationName: String, val currentApplicationVersionId: Long, val output: com.amazonaws.services.kinesisanalytics.model.Output) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputRequest> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setOutput(this.output)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.addApplicationOutput(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics add-application-output")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("output", output.toString())
	}

}


fun AmazonKinesisAnalyticsFunctions.addApplicationReferenceDataSource(applicationName: String, currentApplicationVersionId: Long, referenceDataSource: com.amazonaws.services.kinesisanalytics.model.ReferenceDataSource, init: AmazonKinesisAnalyticsAddApplicationReferenceDataSourceCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsAddApplicationReferenceDataSourceCommand(applicationName, currentApplicationVersionId, referenceDataSource).apply(init))
}

@Generated
class AmazonKinesisAnalyticsAddApplicationReferenceDataSourceCommand(val applicationName: String, val currentApplicationVersionId: Long, val referenceDataSource: com.amazonaws.services.kinesisanalytics.model.ReferenceDataSource) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceRequest> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setReferenceDataSource(this.referenceDataSource)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.addApplicationReferenceDataSource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics add-application-reference-data-source")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("reference-data-source", referenceDataSource.toString())
	}

}


fun AmazonKinesisAnalyticsFunctions.createApplication(applicationName: String, init: AmazonKinesisAnalyticsCreateApplicationCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsCreateApplicationCommand(applicationName).apply(init))
}

@Generated
class AmazonKinesisAnalyticsCreateApplicationCommand(val applicationName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.CreateApplicationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.createApplication(build())
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


fun AmazonKinesisAnalyticsFunctions.deleteApplication(applicationName: String, createTimestamp: java.util.Date, init: AmazonKinesisAnalyticsDeleteApplicationCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsDeleteApplicationCommand(applicationName, createTimestamp).apply(init))
}

@Generated
class AmazonKinesisAnalyticsDeleteApplicationCommand(val applicationName: String, val createTimestamp: java.util.Date) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationRequest> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.DeleteApplicationRequest()
		input.setApplicationName(this.applicationName)
		input.setCreateTimestamp(this.createTimestamp)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.deleteApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics delete-application")
				.argument("application-name", applicationName)
				.argument("create-timestamp", createTimestamp.toString())
	}

}


fun AmazonKinesisAnalyticsFunctions.deleteApplicationCloudWatchLoggingOption(applicationName: String, currentApplicationVersionId: Long, cloudWatchLoggingOptionId: String, init: AmazonKinesisAnalyticsDeleteApplicationCloudWatchLoggingOptionCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsDeleteApplicationCloudWatchLoggingOptionCommand(applicationName, currentApplicationVersionId, cloudWatchLoggingOptionId).apply(init))
}

@Generated
class AmazonKinesisAnalyticsDeleteApplicationCloudWatchLoggingOptionCommand(val applicationName: String, val currentApplicationVersionId: Long, val cloudWatchLoggingOptionId: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionRequest> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setCloudWatchLoggingOptionId(this.cloudWatchLoggingOptionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.deleteApplicationCloudWatchLoggingOption(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics delete-application-cloud-watch-logging-option")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("cloud-watch-logging-option-id", cloudWatchLoggingOptionId)
	}

}


fun AmazonKinesisAnalyticsFunctions.deleteApplicationInputProcessingConfiguration(applicationName: String, currentApplicationVersionId: Long, inputId: String, init: AmazonKinesisAnalyticsDeleteApplicationInputProcessingConfigurationCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsDeleteApplicationInputProcessingConfigurationCommand(applicationName, currentApplicationVersionId, inputId).apply(init))
}

@Generated
class AmazonKinesisAnalyticsDeleteApplicationInputProcessingConfigurationCommand(val applicationName: String, val currentApplicationVersionId: Long, val inputId: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationRequest> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setInputId(this.inputId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.deleteApplicationInputProcessingConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics delete-application-input-processing-configuration")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("input-id", inputId)
	}

}


fun AmazonKinesisAnalyticsFunctions.deleteApplicationOutput(applicationName: String, currentApplicationVersionId: Long, outputId: String, init: AmazonKinesisAnalyticsDeleteApplicationOutputCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsDeleteApplicationOutputCommand(applicationName, currentApplicationVersionId, outputId).apply(init))
}

@Generated
class AmazonKinesisAnalyticsDeleteApplicationOutputCommand(val applicationName: String, val currentApplicationVersionId: Long, val outputId: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputRequest> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setOutputId(this.outputId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.deleteApplicationOutput(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics delete-application-output")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("output-id", outputId)
	}

}


fun AmazonKinesisAnalyticsFunctions.deleteApplicationReferenceDataSource(applicationName: String, currentApplicationVersionId: Long, referenceId: String, init: AmazonKinesisAnalyticsDeleteApplicationReferenceDataSourceCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsDeleteApplicationReferenceDataSourceCommand(applicationName, currentApplicationVersionId, referenceId).apply(init))
}

@Generated
class AmazonKinesisAnalyticsDeleteApplicationReferenceDataSourceCommand(val applicationName: String, val currentApplicationVersionId: Long, val referenceId: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceRequest> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setReferenceId(this.referenceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.deleteApplicationReferenceDataSource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics delete-application-reference-data-source")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("reference-id", referenceId)
	}

}


fun AmazonKinesisAnalyticsFunctions.describeApplication(applicationName: String, init: AmazonKinesisAnalyticsDescribeApplicationCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsDescribeApplicationCommand(applicationName).apply(init))
}

@Generated
class AmazonKinesisAnalyticsDescribeApplicationCommand(val applicationName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.DescribeApplicationRequest> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.DescribeApplicationRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.DescribeApplicationRequest()
		input.setApplicationName(this.applicationName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.describeApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics describe-application")
				.argument("application-name", applicationName)
	}

}


fun AmazonKinesisAnalyticsFunctions.discoverInputSchema(init: AmazonKinesisAnalyticsDiscoverInputSchemaCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsDiscoverInputSchemaCommand().apply(init))
}

@Generated
class AmazonKinesisAnalyticsDiscoverInputSchemaCommand() : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.discoverInputSchema(build())
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


fun AmazonKinesisAnalyticsFunctions.listApplications(init: AmazonKinesisAnalyticsListApplicationsCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsListApplicationsCommand().apply(init))
}

@Generated
class AmazonKinesisAnalyticsListApplicationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.ListApplicationsRequest> {

	var limit: Int? = 0
	var exclusiveStartApplicationName: String? = null

	override fun build(): com.amazonaws.services.kinesisanalytics.model.ListApplicationsRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.ListApplicationsRequest()
		input.setLimit(this.limit)
		input.setExclusiveStartApplicationName(this.exclusiveStartApplicationName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.listApplications(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics list-applications")
				.argument("limit", limit?.toString())
				.argument("exclusive-start-application-name", exclusiveStartApplicationName)
	}

}


fun AmazonKinesisAnalyticsFunctions.startApplication(applicationName: String, inputConfigurations: List<com.amazonaws.services.kinesisanalytics.model.InputConfiguration>, init: AmazonKinesisAnalyticsStartApplicationCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsStartApplicationCommand(applicationName, inputConfigurations).apply(init))
}

@Generated
class AmazonKinesisAnalyticsStartApplicationCommand(val applicationName: String, val inputConfigurations: List<com.amazonaws.services.kinesisanalytics.model.InputConfiguration>) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.StartApplicationRequest> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.StartApplicationRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.StartApplicationRequest()
		input.setApplicationName(this.applicationName)
		input.setInputConfigurations(this.inputConfigurations)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.startApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics start-application")
				.argument("application-name", applicationName)
				.argument("input-configurations", inputConfigurations.toString())
	}

}


fun AmazonKinesisAnalyticsFunctions.stopApplication(applicationName: String, init: AmazonKinesisAnalyticsStopApplicationCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsStopApplicationCommand(applicationName).apply(init))
}

@Generated
class AmazonKinesisAnalyticsStopApplicationCommand(val applicationName: String) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.StopApplicationRequest> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.StopApplicationRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.StopApplicationRequest()
		input.setApplicationName(this.applicationName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.stopApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics stop-application")
				.argument("application-name", applicationName)
	}

}


fun AmazonKinesisAnalyticsFunctions.updateApplication(applicationName: String, currentApplicationVersionId: Long, applicationUpdate: com.amazonaws.services.kinesisanalytics.model.ApplicationUpdate, init: AmazonKinesisAnalyticsUpdateApplicationCommand.() -> Unit) {
	this.block.declare(AmazonKinesisAnalyticsUpdateApplicationCommand(applicationName, currentApplicationVersionId, applicationUpdate).apply(init))
}

@Generated
class AmazonKinesisAnalyticsUpdateApplicationCommand(val applicationName: String, val currentApplicationVersionId: Long, val applicationUpdate: com.amazonaws.services.kinesisanalytics.model.ApplicationUpdate) : AmazonWebServiceCommand<com.amazonaws.services.kinesisanalytics.model.UpdateApplicationRequest> {



	override fun build(): com.amazonaws.services.kinesisanalytics.model.UpdateApplicationRequest {
		val input = com.amazonaws.services.kinesisanalytics.model.UpdateApplicationRequest()
		input.setApplicationName(this.applicationName)
		input.setCurrentApplicationVersionId(this.currentApplicationVersionId)
		input.setApplicationUpdate(this.applicationUpdate)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.kinesisanalytics.updateApplication(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisanalytics update-application")
				.argument("application-name", applicationName)
				.argument("current-application-version-id", currentApplicationVersionId.toString())
				.argument("application-update", applicationUpdate.toString())
	}

}
