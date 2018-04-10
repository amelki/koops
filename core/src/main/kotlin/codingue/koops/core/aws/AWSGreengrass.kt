
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.greengrass.AWSGreengrass
import com.amazonaws.services.greengrass.model.*

var codingue.koops.core.Environment.greengrass: AWSGreengrass
	get() = this.capabilities[AWSGreengrass::class.java.name] as AWSGreengrass
	set(greengrass) {
		this.capabilities[AWSGreengrass::class.java.name] = greengrass
	}

@Generated
class AWSGreengrassFunctions(val block: Block)

infix fun AwsContinuation.greengrass(init: AWSGreengrassFunctions.() -> Unit) {
	AWSGreengrassFunctions(shell).apply(init)
}

			

fun AWSGreengrassFunctions.associateRoleToGroup(groupId: String, init: AWSGreengrassAssociateRoleToGroupCommand.() -> Unit) {
	this.block.declare(AWSGreengrassAssociateRoleToGroupCommand(groupId).apply(init))
}

@Generated
class AWSGreengrassAssociateRoleToGroupCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest> {

	var roleArn: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest {
		val input = com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest()
		input.setGroupId(this.groupId)
		input.setRoleArn(this.roleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.associateRoleToGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass associate-role-to-group")
				.argument("group-id", groupId)
				.argument("role-arn", roleArn)
	}

}


fun AWSGreengrassFunctions.associateServiceRoleToAccount(init: AWSGreengrassAssociateServiceRoleToAccountCommand.() -> Unit) {
	this.block.declare(AWSGreengrassAssociateServiceRoleToAccountCommand().apply(init))
}

@Generated
class AWSGreengrassAssociateServiceRoleToAccountCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest> {

	var roleArn: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest {
		val input = com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest()
		input.setRoleArn(this.roleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.associateServiceRoleToAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass associate-service-role-to-account")
				.argument("role-arn", roleArn)
	}

}


fun AWSGreengrassFunctions.createCoreDefinition(init: AWSGreengrassCreateCoreDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateCoreDefinitionCommand().apply(init))
}

@Generated
class AWSGreengrassCreateCoreDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateCoreDefinitionRequest> {

	var amznClientToken: String? = null
	var initialVersion: com.amazonaws.services.greengrass.model.CoreDefinitionVersion? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateCoreDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateCoreDefinitionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setInitialVersion(this.initialVersion)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createCoreDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-core-definition")
				.argument("amzn-client-token", amznClientToken)
				.argument("initial-version", initialVersion?.toString())
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.createCoreDefinitionVersion(coreDefinitionId: String, init: AWSGreengrassCreateCoreDefinitionVersionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateCoreDefinitionVersionCommand(coreDefinitionId).apply(init))
}

@Generated
class AWSGreengrassCreateCoreDefinitionVersionCommand(val coreDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest> {

	var amznClientToken: String? = null
	var cores: List<com.amazonaws.services.greengrass.model.Core>? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setCoreDefinitionId(this.coreDefinitionId)
		input.setCores(this.cores)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createCoreDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-core-definition-version")
				.argument("amzn-client-token", amznClientToken)
				.argument("core-definition-id", coreDefinitionId)
				.argument("cores", cores?.toString())
	}

}


fun AWSGreengrassFunctions.createDeployment(groupId: String, init: AWSGreengrassCreateDeploymentCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateDeploymentCommand(groupId).apply(init))
}

@Generated
class AWSGreengrassCreateDeploymentCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateDeploymentRequest> {

	var amznClientToken: String? = null
	var deploymentId: String? = null
	var deploymentType: DeploymentType? = null
	var groupVersionId: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateDeploymentRequest {
		val input = com.amazonaws.services.greengrass.model.CreateDeploymentRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setDeploymentId(this.deploymentId)
		input.setDeploymentType(this.deploymentType?.toString())
		input.setGroupId(this.groupId)
		input.setGroupVersionId(this.groupVersionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createDeployment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-deployment")
				.argument("amzn-client-token", amznClientToken)
				.argument("deployment-id", deploymentId)
				.argument("deployment-type", deploymentType?.toString())
				.argument("group-id", groupId)
				.argument("group-version-id", groupVersionId)
	}

}


fun AWSGreengrassFunctions.createDeviceDefinition(init: AWSGreengrassCreateDeviceDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateDeviceDefinitionCommand().apply(init))
}

@Generated
class AWSGreengrassCreateDeviceDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateDeviceDefinitionRequest> {

	var amznClientToken: String? = null
	var initialVersion: com.amazonaws.services.greengrass.model.DeviceDefinitionVersion? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateDeviceDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateDeviceDefinitionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setInitialVersion(this.initialVersion)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createDeviceDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-device-definition")
				.argument("amzn-client-token", amznClientToken)
				.argument("initial-version", initialVersion?.toString())
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.createDeviceDefinitionVersion(deviceDefinitionId: String, init: AWSGreengrassCreateDeviceDefinitionVersionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateDeviceDefinitionVersionCommand(deviceDefinitionId).apply(init))
}

@Generated
class AWSGreengrassCreateDeviceDefinitionVersionCommand(val deviceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest> {

	var amznClientToken: String? = null
	var devices: List<com.amazonaws.services.greengrass.model.Device>? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setDeviceDefinitionId(this.deviceDefinitionId)
		input.setDevices(this.devices)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createDeviceDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-device-definition-version")
				.argument("amzn-client-token", amznClientToken)
				.argument("device-definition-id", deviceDefinitionId)
				.argument("devices", devices?.toString())
	}

}


fun AWSGreengrassFunctions.createFunctionDefinition(init: AWSGreengrassCreateFunctionDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateFunctionDefinitionCommand().apply(init))
}

@Generated
class AWSGreengrassCreateFunctionDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest> {

	var amznClientToken: String? = null
	var initialVersion: com.amazonaws.services.greengrass.model.FunctionDefinitionVersion? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setInitialVersion(this.initialVersion)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createFunctionDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-function-definition")
				.argument("amzn-client-token", amznClientToken)
				.argument("initial-version", initialVersion?.toString())
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.createFunctionDefinitionVersion(functionDefinitionId: String, init: AWSGreengrassCreateFunctionDefinitionVersionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateFunctionDefinitionVersionCommand(functionDefinitionId).apply(init))
}

@Generated
class AWSGreengrassCreateFunctionDefinitionVersionCommand(val functionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest> {

	var amznClientToken: String? = null
	var functions: List<com.amazonaws.services.greengrass.model.Function>? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setFunctionDefinitionId(this.functionDefinitionId)
		input.setFunctions(this.functions)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createFunctionDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-function-definition-version")
				.argument("amzn-client-token", amznClientToken)
				.argument("function-definition-id", functionDefinitionId)
				.argument("functions", functions?.toString())
	}

}


fun AWSGreengrassFunctions.createGroup(init: AWSGreengrassCreateGroupCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateGroupCommand().apply(init))
}

@Generated
class AWSGreengrassCreateGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateGroupRequest> {

	var amznClientToken: String? = null
	var initialVersion: com.amazonaws.services.greengrass.model.GroupVersion? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateGroupRequest {
		val input = com.amazonaws.services.greengrass.model.CreateGroupRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setInitialVersion(this.initialVersion)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-group")
				.argument("amzn-client-token", amznClientToken)
				.argument("initial-version", initialVersion?.toString())
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.createGroupCertificateAuthority(groupId: String, init: AWSGreengrassCreateGroupCertificateAuthorityCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateGroupCertificateAuthorityCommand(groupId).apply(init))
}

@Generated
class AWSGreengrassCreateGroupCertificateAuthorityCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest> {

	var amznClientToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest {
		val input = com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setGroupId(this.groupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createGroupCertificateAuthority(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-group-certificate-authority")
				.argument("amzn-client-token", amznClientToken)
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.createGroupVersion(groupId: String, init: AWSGreengrassCreateGroupVersionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateGroupVersionCommand(groupId).apply(init))
}

@Generated
class AWSGreengrassCreateGroupVersionCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateGroupVersionRequest> {

	var amznClientToken: String? = null
	var coreDefinitionVersionArn: String? = null
	var deviceDefinitionVersionArn: String? = null
	var functionDefinitionVersionArn: String? = null
	var loggerDefinitionVersionArn: String? = null
	var resourceDefinitionVersionArn: String? = null
	var subscriptionDefinitionVersionArn: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateGroupVersionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateGroupVersionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setCoreDefinitionVersionArn(this.coreDefinitionVersionArn)
		input.setDeviceDefinitionVersionArn(this.deviceDefinitionVersionArn)
		input.setFunctionDefinitionVersionArn(this.functionDefinitionVersionArn)
		input.setGroupId(this.groupId)
		input.setLoggerDefinitionVersionArn(this.loggerDefinitionVersionArn)
		input.setResourceDefinitionVersionArn(this.resourceDefinitionVersionArn)
		input.setSubscriptionDefinitionVersionArn(this.subscriptionDefinitionVersionArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createGroupVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-group-version")
				.argument("amzn-client-token", amznClientToken)
				.argument("core-definition-version-arn", coreDefinitionVersionArn)
				.argument("device-definition-version-arn", deviceDefinitionVersionArn)
				.argument("function-definition-version-arn", functionDefinitionVersionArn)
				.argument("group-id", groupId)
				.argument("logger-definition-version-arn", loggerDefinitionVersionArn)
				.argument("resource-definition-version-arn", resourceDefinitionVersionArn)
				.argument("subscription-definition-version-arn", subscriptionDefinitionVersionArn)
	}

}


fun AWSGreengrassFunctions.createLoggerDefinition(init: AWSGreengrassCreateLoggerDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateLoggerDefinitionCommand().apply(init))
}

@Generated
class AWSGreengrassCreateLoggerDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateLoggerDefinitionRequest> {

	var amznClientToken: String? = null
	var initialVersion: com.amazonaws.services.greengrass.model.LoggerDefinitionVersion? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateLoggerDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateLoggerDefinitionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setInitialVersion(this.initialVersion)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createLoggerDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-logger-definition")
				.argument("amzn-client-token", amznClientToken)
				.argument("initial-version", initialVersion?.toString())
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.createLoggerDefinitionVersion(loggerDefinitionId: String, init: AWSGreengrassCreateLoggerDefinitionVersionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateLoggerDefinitionVersionCommand(loggerDefinitionId).apply(init))
}

@Generated
class AWSGreengrassCreateLoggerDefinitionVersionCommand(val loggerDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest> {

	var amznClientToken: String? = null
	var loggers: List<com.amazonaws.services.greengrass.model.Logger>? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setLoggerDefinitionId(this.loggerDefinitionId)
		input.setLoggers(this.loggers)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createLoggerDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-logger-definition-version")
				.argument("amzn-client-token", amznClientToken)
				.argument("logger-definition-id", loggerDefinitionId)
				.argument("loggers", loggers?.toString())
	}

}


fun AWSGreengrassFunctions.createResourceDefinition(init: AWSGreengrassCreateResourceDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateResourceDefinitionCommand().apply(init))
}

@Generated
class AWSGreengrassCreateResourceDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateResourceDefinitionRequest> {

	var amznClientToken: String? = null
	var initialVersion: com.amazonaws.services.greengrass.model.ResourceDefinitionVersion? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateResourceDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateResourceDefinitionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setInitialVersion(this.initialVersion)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createResourceDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-resource-definition")
				.argument("amzn-client-token", amznClientToken)
				.argument("initial-version", initialVersion?.toString())
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.createResourceDefinitionVersion(resourceDefinitionId: String, init: AWSGreengrassCreateResourceDefinitionVersionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateResourceDefinitionVersionCommand(resourceDefinitionId).apply(init))
}

@Generated
class AWSGreengrassCreateResourceDefinitionVersionCommand(val resourceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest> {

	var amznClientToken: String? = null
	var resources: List<com.amazonaws.services.greengrass.model.Resource>? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setResourceDefinitionId(this.resourceDefinitionId)
		input.setResources(this.resources)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createResourceDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-resource-definition-version")
				.argument("amzn-client-token", amznClientToken)
				.argument("resource-definition-id", resourceDefinitionId)
				.argument("resources", resources?.toString())
	}

}


fun AWSGreengrassFunctions.createSoftwareUpdateJob(init: AWSGreengrassCreateSoftwareUpdateJobCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateSoftwareUpdateJobCommand().apply(init))
}

@Generated
class AWSGreengrassCreateSoftwareUpdateJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobRequest> {

	var amznClientToken: String? = null
	var s3UrlSignerRole: String? = null
	var softwareToUpdate: SoftwareToUpdate? = null
	var updateAgentLogLevel: UpdateAgentLogLevel? = null
	var updateTargets: List<String>? = null
	var updateTargetsArchitecture: UpdateTargetsArchitecture? = null
	var updateTargetsOperatingSystem: UpdateTargetsOperatingSystem? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobRequest {
		val input = com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setS3UrlSignerRole(this.s3UrlSignerRole)
		input.setSoftwareToUpdate(this.softwareToUpdate?.toString())
		input.setUpdateAgentLogLevel(this.updateAgentLogLevel?.toString())
		input.setUpdateTargets(this.updateTargets)
		input.setUpdateTargetsArchitecture(this.updateTargetsArchitecture?.toString())
		input.setUpdateTargetsOperatingSystem(this.updateTargetsOperatingSystem?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createSoftwareUpdateJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-software-update-job")
				.argument("amzn-client-token", amznClientToken)
				.argument("s3-url-signer-role", s3UrlSignerRole)
				.argument("software-to-update", softwareToUpdate?.toString())
				.argument("update-agent-log-level", updateAgentLogLevel?.toString())
				.argument("update-targets", updateTargets?.toString())
				.argument("update-targets-architecture", updateTargetsArchitecture?.toString())
				.argument("update-targets-operating-system", updateTargetsOperatingSystem?.toString())
	}

}


fun AWSGreengrassFunctions.createSubscriptionDefinition(init: AWSGreengrassCreateSubscriptionDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateSubscriptionDefinitionCommand().apply(init))
}

@Generated
class AWSGreengrassCreateSubscriptionDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionRequest> {

	var amznClientToken: String? = null
	var initialVersion: com.amazonaws.services.greengrass.model.SubscriptionDefinitionVersion? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setInitialVersion(this.initialVersion)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createSubscriptionDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-subscription-definition")
				.argument("amzn-client-token", amznClientToken)
				.argument("initial-version", initialVersion?.toString())
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.createSubscriptionDefinitionVersion(subscriptionDefinitionId: String, init: AWSGreengrassCreateSubscriptionDefinitionVersionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassCreateSubscriptionDefinitionVersionCommand(subscriptionDefinitionId).apply(init))
}

@Generated
class AWSGreengrassCreateSubscriptionDefinitionVersionCommand(val subscriptionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest> {

	var amznClientToken: String? = null
	var subscriptions: List<com.amazonaws.services.greengrass.model.Subscription>? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setSubscriptionDefinitionId(this.subscriptionDefinitionId)
		input.setSubscriptions(this.subscriptions)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.createSubscriptionDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-subscription-definition-version")
				.argument("amzn-client-token", amznClientToken)
				.argument("subscription-definition-id", subscriptionDefinitionId)
				.argument("subscriptions", subscriptions?.toString())
	}

}


fun AWSGreengrassFunctions.deleteCoreDefinition(coreDefinitionId: String, init: AWSGreengrassDeleteCoreDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassDeleteCoreDefinitionCommand(coreDefinitionId).apply(init))
}

@Generated
class AWSGreengrassDeleteCoreDefinitionCommand(val coreDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest()
		input.setCoreDefinitionId(this.coreDefinitionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.deleteCoreDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass delete-core-definition")
				.argument("core-definition-id", coreDefinitionId)
	}

}


fun AWSGreengrassFunctions.deleteDeviceDefinition(deviceDefinitionId: String, init: AWSGreengrassDeleteDeviceDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassDeleteDeviceDefinitionCommand(deviceDefinitionId).apply(init))
}

@Generated
class AWSGreengrassDeleteDeviceDefinitionCommand(val deviceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest()
		input.setDeviceDefinitionId(this.deviceDefinitionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.deleteDeviceDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass delete-device-definition")
				.argument("device-definition-id", deviceDefinitionId)
	}

}


fun AWSGreengrassFunctions.deleteFunctionDefinition(functionDefinitionId: String, init: AWSGreengrassDeleteFunctionDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassDeleteFunctionDefinitionCommand(functionDefinitionId).apply(init))
}

@Generated
class AWSGreengrassDeleteFunctionDefinitionCommand(val functionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest()
		input.setFunctionDefinitionId(this.functionDefinitionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.deleteFunctionDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass delete-function-definition")
				.argument("function-definition-id", functionDefinitionId)
	}

}


fun AWSGreengrassFunctions.deleteGroup(groupId: String, init: AWSGreengrassDeleteGroupCommand.() -> Unit) {
	this.block.declare(AWSGreengrassDeleteGroupCommand(groupId).apply(init))
}

@Generated
class AWSGreengrassDeleteGroupCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DeleteGroupRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.DeleteGroupRequest {
		val input = com.amazonaws.services.greengrass.model.DeleteGroupRequest()
		input.setGroupId(this.groupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.deleteGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass delete-group")
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.deleteLoggerDefinition(loggerDefinitionId: String, init: AWSGreengrassDeleteLoggerDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassDeleteLoggerDefinitionCommand(loggerDefinitionId).apply(init))
}

@Generated
class AWSGreengrassDeleteLoggerDefinitionCommand(val loggerDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest()
		input.setLoggerDefinitionId(this.loggerDefinitionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.deleteLoggerDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass delete-logger-definition")
				.argument("logger-definition-id", loggerDefinitionId)
	}

}


fun AWSGreengrassFunctions.deleteResourceDefinition(resourceDefinitionId: String, init: AWSGreengrassDeleteResourceDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassDeleteResourceDefinitionCommand(resourceDefinitionId).apply(init))
}

@Generated
class AWSGreengrassDeleteResourceDefinitionCommand(val resourceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest()
		input.setResourceDefinitionId(this.resourceDefinitionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.deleteResourceDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass delete-resource-definition")
				.argument("resource-definition-id", resourceDefinitionId)
	}

}


fun AWSGreengrassFunctions.deleteSubscriptionDefinition(subscriptionDefinitionId: String, init: AWSGreengrassDeleteSubscriptionDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassDeleteSubscriptionDefinitionCommand(subscriptionDefinitionId).apply(init))
}

@Generated
class AWSGreengrassDeleteSubscriptionDefinitionCommand(val subscriptionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest()
		input.setSubscriptionDefinitionId(this.subscriptionDefinitionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.deleteSubscriptionDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass delete-subscription-definition")
				.argument("subscription-definition-id", subscriptionDefinitionId)
	}

}


fun AWSGreengrassFunctions.disassociateRoleFromGroup(groupId: String, init: AWSGreengrassDisassociateRoleFromGroupCommand.() -> Unit) {
	this.block.declare(AWSGreengrassDisassociateRoleFromGroupCommand(groupId).apply(init))
}

@Generated
class AWSGreengrassDisassociateRoleFromGroupCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest {
		val input = com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest()
		input.setGroupId(this.groupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.disassociateRoleFromGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass disassociate-role-from-group")
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.disassociateServiceRoleFromAccount(init: AWSGreengrassDisassociateServiceRoleFromAccountCommand.() -> Unit) {
	this.block.declare(AWSGreengrassDisassociateServiceRoleFromAccountCommand().apply(init))
}

@Generated
class AWSGreengrassDisassociateServiceRoleFromAccountCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest {
		val input = com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.disassociateServiceRoleFromAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass disassociate-service-role-from-account")

	}

}


fun AWSGreengrassFunctions.getAssociatedRole(groupId: String, init: AWSGreengrassGetAssociatedRoleCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetAssociatedRoleCommand(groupId).apply(init))
}

@Generated
class AWSGreengrassGetAssociatedRoleCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest {
		val input = com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest()
		input.setGroupId(this.groupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getAssociatedRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-associated-role")
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.getConnectivityInfo(thingName: String, init: AWSGreengrassGetConnectivityInfoCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetConnectivityInfoCommand(thingName).apply(init))
}

@Generated
class AWSGreengrassGetConnectivityInfoCommand(val thingName: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest {
		val input = com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest()
		input.setThingName(this.thingName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getConnectivityInfo(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-connectivity-info")
				.argument("thing-name", thingName)
	}

}


fun AWSGreengrassFunctions.getCoreDefinition(coreDefinitionId: String, init: AWSGreengrassGetCoreDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetCoreDefinitionCommand(coreDefinitionId).apply(init))
}

@Generated
class AWSGreengrassGetCoreDefinitionCommand(val coreDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest()
		input.setCoreDefinitionId(this.coreDefinitionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getCoreDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-core-definition")
				.argument("core-definition-id", coreDefinitionId)
	}

}


fun AWSGreengrassFunctions.getCoreDefinitionVersion(coreDefinitionId: String, coreDefinitionVersionId: String, init: AWSGreengrassGetCoreDefinitionVersionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetCoreDefinitionVersionCommand(coreDefinitionId, coreDefinitionVersionId).apply(init))
}

@Generated
class AWSGreengrassGetCoreDefinitionVersionCommand(val coreDefinitionId: String, val coreDefinitionVersionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest()
		input.setCoreDefinitionId(this.coreDefinitionId)
		input.setCoreDefinitionVersionId(this.coreDefinitionVersionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getCoreDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-core-definition-version")
				.argument("core-definition-id", coreDefinitionId)
				.argument("core-definition-version-id", coreDefinitionVersionId)
	}

}


fun AWSGreengrassFunctions.getDeploymentStatus(deploymentId: String, groupId: String, init: AWSGreengrassGetDeploymentStatusCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetDeploymentStatusCommand(deploymentId, groupId).apply(init))
}

@Generated
class AWSGreengrassGetDeploymentStatusCommand(val deploymentId: String, val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest {
		val input = com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest()
		input.setDeploymentId(this.deploymentId)
		input.setGroupId(this.groupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getDeploymentStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-deployment-status")
				.argument("deployment-id", deploymentId)
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.getDeviceDefinition(deviceDefinitionId: String, init: AWSGreengrassGetDeviceDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetDeviceDefinitionCommand(deviceDefinitionId).apply(init))
}

@Generated
class AWSGreengrassGetDeviceDefinitionCommand(val deviceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest()
		input.setDeviceDefinitionId(this.deviceDefinitionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getDeviceDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-device-definition")
				.argument("device-definition-id", deviceDefinitionId)
	}

}


fun AWSGreengrassFunctions.getDeviceDefinitionVersion(deviceDefinitionId: String, deviceDefinitionVersionId: String, init: AWSGreengrassGetDeviceDefinitionVersionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetDeviceDefinitionVersionCommand(deviceDefinitionId, deviceDefinitionVersionId).apply(init))
}

@Generated
class AWSGreengrassGetDeviceDefinitionVersionCommand(val deviceDefinitionId: String, val deviceDefinitionVersionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest()
		input.setDeviceDefinitionId(this.deviceDefinitionId)
		input.setDeviceDefinitionVersionId(this.deviceDefinitionVersionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getDeviceDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-device-definition-version")
				.argument("device-definition-id", deviceDefinitionId)
				.argument("device-definition-version-id", deviceDefinitionVersionId)
	}

}


fun AWSGreengrassFunctions.getFunctionDefinition(functionDefinitionId: String, init: AWSGreengrassGetFunctionDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetFunctionDefinitionCommand(functionDefinitionId).apply(init))
}

@Generated
class AWSGreengrassGetFunctionDefinitionCommand(val functionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest()
		input.setFunctionDefinitionId(this.functionDefinitionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getFunctionDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-function-definition")
				.argument("function-definition-id", functionDefinitionId)
	}

}


fun AWSGreengrassFunctions.getFunctionDefinitionVersion(functionDefinitionId: String, functionDefinitionVersionId: String, init: AWSGreengrassGetFunctionDefinitionVersionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetFunctionDefinitionVersionCommand(functionDefinitionId, functionDefinitionVersionId).apply(init))
}

@Generated
class AWSGreengrassGetFunctionDefinitionVersionCommand(val functionDefinitionId: String, val functionDefinitionVersionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest()
		input.setFunctionDefinitionId(this.functionDefinitionId)
		input.setFunctionDefinitionVersionId(this.functionDefinitionVersionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getFunctionDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-function-definition-version")
				.argument("function-definition-id", functionDefinitionId)
				.argument("function-definition-version-id", functionDefinitionVersionId)
	}

}


fun AWSGreengrassFunctions.getGroup(groupId: String, init: AWSGreengrassGetGroupCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetGroupCommand(groupId).apply(init))
}

@Generated
class AWSGreengrassGetGroupCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetGroupRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetGroupRequest {
		val input = com.amazonaws.services.greengrass.model.GetGroupRequest()
		input.setGroupId(this.groupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-group")
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.getGroupCertificateAuthority(certificateAuthorityId: String, groupId: String, init: AWSGreengrassGetGroupCertificateAuthorityCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetGroupCertificateAuthorityCommand(certificateAuthorityId, groupId).apply(init))
}

@Generated
class AWSGreengrassGetGroupCertificateAuthorityCommand(val certificateAuthorityId: String, val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest {
		val input = com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest()
		input.setCertificateAuthorityId(this.certificateAuthorityId)
		input.setGroupId(this.groupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getGroupCertificateAuthority(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-group-certificate-authority")
				.argument("certificate-authority-id", certificateAuthorityId)
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.getGroupCertificateConfiguration(groupId: String, init: AWSGreengrassGetGroupCertificateConfigurationCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetGroupCertificateConfigurationCommand(groupId).apply(init))
}

@Generated
class AWSGreengrassGetGroupCertificateConfigurationCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest {
		val input = com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest()
		input.setGroupId(this.groupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getGroupCertificateConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-group-certificate-configuration")
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.getGroupVersion(groupId: String, groupVersionId: String, init: AWSGreengrassGetGroupVersionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetGroupVersionCommand(groupId, groupVersionId).apply(init))
}

@Generated
class AWSGreengrassGetGroupVersionCommand(val groupId: String, val groupVersionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetGroupVersionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetGroupVersionRequest {
		val input = com.amazonaws.services.greengrass.model.GetGroupVersionRequest()
		input.setGroupId(this.groupId)
		input.setGroupVersionId(this.groupVersionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getGroupVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-group-version")
				.argument("group-id", groupId)
				.argument("group-version-id", groupVersionId)
	}

}


fun AWSGreengrassFunctions.getLoggerDefinition(loggerDefinitionId: String, init: AWSGreengrassGetLoggerDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetLoggerDefinitionCommand(loggerDefinitionId).apply(init))
}

@Generated
class AWSGreengrassGetLoggerDefinitionCommand(val loggerDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest()
		input.setLoggerDefinitionId(this.loggerDefinitionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getLoggerDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-logger-definition")
				.argument("logger-definition-id", loggerDefinitionId)
	}

}


fun AWSGreengrassFunctions.getLoggerDefinitionVersion(loggerDefinitionId: String, loggerDefinitionVersionId: String, init: AWSGreengrassGetLoggerDefinitionVersionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetLoggerDefinitionVersionCommand(loggerDefinitionId, loggerDefinitionVersionId).apply(init))
}

@Generated
class AWSGreengrassGetLoggerDefinitionVersionCommand(val loggerDefinitionId: String, val loggerDefinitionVersionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest()
		input.setLoggerDefinitionId(this.loggerDefinitionId)
		input.setLoggerDefinitionVersionId(this.loggerDefinitionVersionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getLoggerDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-logger-definition-version")
				.argument("logger-definition-id", loggerDefinitionId)
				.argument("logger-definition-version-id", loggerDefinitionVersionId)
	}

}


fun AWSGreengrassFunctions.getResourceDefinition(resourceDefinitionId: String, init: AWSGreengrassGetResourceDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetResourceDefinitionCommand(resourceDefinitionId).apply(init))
}

@Generated
class AWSGreengrassGetResourceDefinitionCommand(val resourceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest()
		input.setResourceDefinitionId(this.resourceDefinitionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getResourceDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-resource-definition")
				.argument("resource-definition-id", resourceDefinitionId)
	}

}


fun AWSGreengrassFunctions.getResourceDefinitionVersion(resourceDefinitionId: String, resourceDefinitionVersionId: String, init: AWSGreengrassGetResourceDefinitionVersionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetResourceDefinitionVersionCommand(resourceDefinitionId, resourceDefinitionVersionId).apply(init))
}

@Generated
class AWSGreengrassGetResourceDefinitionVersionCommand(val resourceDefinitionId: String, val resourceDefinitionVersionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest()
		input.setResourceDefinitionId(this.resourceDefinitionId)
		input.setResourceDefinitionVersionId(this.resourceDefinitionVersionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getResourceDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-resource-definition-version")
				.argument("resource-definition-id", resourceDefinitionId)
				.argument("resource-definition-version-id", resourceDefinitionVersionId)
	}

}


fun AWSGreengrassFunctions.getServiceRoleForAccount(init: AWSGreengrassGetServiceRoleForAccountCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetServiceRoleForAccountCommand().apply(init))
}

@Generated
class AWSGreengrassGetServiceRoleForAccountCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest {
		val input = com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getServiceRoleForAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-service-role-for-account")

	}

}


fun AWSGreengrassFunctions.getSubscriptionDefinition(subscriptionDefinitionId: String, init: AWSGreengrassGetSubscriptionDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetSubscriptionDefinitionCommand(subscriptionDefinitionId).apply(init))
}

@Generated
class AWSGreengrassGetSubscriptionDefinitionCommand(val subscriptionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest()
		input.setSubscriptionDefinitionId(this.subscriptionDefinitionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getSubscriptionDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-subscription-definition")
				.argument("subscription-definition-id", subscriptionDefinitionId)
	}

}


fun AWSGreengrassFunctions.getSubscriptionDefinitionVersion(subscriptionDefinitionId: String, subscriptionDefinitionVersionId: String, init: AWSGreengrassGetSubscriptionDefinitionVersionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassGetSubscriptionDefinitionVersionCommand(subscriptionDefinitionId, subscriptionDefinitionVersionId).apply(init))
}

@Generated
class AWSGreengrassGetSubscriptionDefinitionVersionCommand(val subscriptionDefinitionId: String, val subscriptionDefinitionVersionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest()
		input.setSubscriptionDefinitionId(this.subscriptionDefinitionId)
		input.setSubscriptionDefinitionVersionId(this.subscriptionDefinitionVersionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.getSubscriptionDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-subscription-definition-version")
				.argument("subscription-definition-id", subscriptionDefinitionId)
				.argument("subscription-definition-version-id", subscriptionDefinitionVersionId)
	}

}


fun AWSGreengrassFunctions.listCoreDefinitionVersions(coreDefinitionId: String, init: AWSGreengrassListCoreDefinitionVersionsCommand.() -> Unit) {
	this.block.declare(AWSGreengrassListCoreDefinitionVersionsCommand(coreDefinitionId).apply(init))
}

@Generated
class AWSGreengrassListCoreDefinitionVersionsCommand(val coreDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest()
		input.setCoreDefinitionId(this.coreDefinitionId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.listCoreDefinitionVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-core-definition-versions")
				.argument("core-definition-id", coreDefinitionId)
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listCoreDefinitions(init: AWSGreengrassListCoreDefinitionsCommand.() -> Unit) {
	this.block.declare(AWSGreengrassListCoreDefinitionsCommand().apply(init))
}

@Generated
class AWSGreengrassListCoreDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.listCoreDefinitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-core-definitions")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listDeployments(groupId: String, init: AWSGreengrassListDeploymentsCommand.() -> Unit) {
	this.block.declare(AWSGreengrassListDeploymentsCommand(groupId).apply(init))
}

@Generated
class AWSGreengrassListDeploymentsCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListDeploymentsRequest> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListDeploymentsRequest {
		val input = com.amazonaws.services.greengrass.model.ListDeploymentsRequest()
		input.setGroupId(this.groupId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.listDeployments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-deployments")
				.argument("group-id", groupId)
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listDeviceDefinitionVersions(deviceDefinitionId: String, init: AWSGreengrassListDeviceDefinitionVersionsCommand.() -> Unit) {
	this.block.declare(AWSGreengrassListDeviceDefinitionVersionsCommand(deviceDefinitionId).apply(init))
}

@Generated
class AWSGreengrassListDeviceDefinitionVersionsCommand(val deviceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest()
		input.setDeviceDefinitionId(this.deviceDefinitionId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.listDeviceDefinitionVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-device-definition-versions")
				.argument("device-definition-id", deviceDefinitionId)
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listDeviceDefinitions(init: AWSGreengrassListDeviceDefinitionsCommand.() -> Unit) {
	this.block.declare(AWSGreengrassListDeviceDefinitionsCommand().apply(init))
}

@Generated
class AWSGreengrassListDeviceDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.listDeviceDefinitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-device-definitions")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listFunctionDefinitionVersions(functionDefinitionId: String, init: AWSGreengrassListFunctionDefinitionVersionsCommand.() -> Unit) {
	this.block.declare(AWSGreengrassListFunctionDefinitionVersionsCommand(functionDefinitionId).apply(init))
}

@Generated
class AWSGreengrassListFunctionDefinitionVersionsCommand(val functionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest()
		input.setFunctionDefinitionId(this.functionDefinitionId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.listFunctionDefinitionVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-function-definition-versions")
				.argument("function-definition-id", functionDefinitionId)
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listFunctionDefinitions(init: AWSGreengrassListFunctionDefinitionsCommand.() -> Unit) {
	this.block.declare(AWSGreengrassListFunctionDefinitionsCommand().apply(init))
}

@Generated
class AWSGreengrassListFunctionDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.listFunctionDefinitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-function-definitions")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listGroupCertificateAuthorities(groupId: String, init: AWSGreengrassListGroupCertificateAuthoritiesCommand.() -> Unit) {
	this.block.declare(AWSGreengrassListGroupCertificateAuthoritiesCommand(groupId).apply(init))
}

@Generated
class AWSGreengrassListGroupCertificateAuthoritiesCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest> {



	override fun build(): com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest {
		val input = com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest()
		input.setGroupId(this.groupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.listGroupCertificateAuthorities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-group-certificate-authorities")
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.listGroupVersions(groupId: String, init: AWSGreengrassListGroupVersionsCommand.() -> Unit) {
	this.block.declare(AWSGreengrassListGroupVersionsCommand(groupId).apply(init))
}

@Generated
class AWSGreengrassListGroupVersionsCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListGroupVersionsRequest> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListGroupVersionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListGroupVersionsRequest()
		input.setGroupId(this.groupId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.listGroupVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-group-versions")
				.argument("group-id", groupId)
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listGroups(init: AWSGreengrassListGroupsCommand.() -> Unit) {
	this.block.declare(AWSGreengrassListGroupsCommand().apply(init))
}

@Generated
class AWSGreengrassListGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListGroupsRequest> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListGroupsRequest {
		val input = com.amazonaws.services.greengrass.model.ListGroupsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.listGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-groups")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listLoggerDefinitionVersions(loggerDefinitionId: String, init: AWSGreengrassListLoggerDefinitionVersionsCommand.() -> Unit) {
	this.block.declare(AWSGreengrassListLoggerDefinitionVersionsCommand(loggerDefinitionId).apply(init))
}

@Generated
class AWSGreengrassListLoggerDefinitionVersionsCommand(val loggerDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest()
		input.setLoggerDefinitionId(this.loggerDefinitionId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.listLoggerDefinitionVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-logger-definition-versions")
				.argument("logger-definition-id", loggerDefinitionId)
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listLoggerDefinitions(init: AWSGreengrassListLoggerDefinitionsCommand.() -> Unit) {
	this.block.declare(AWSGreengrassListLoggerDefinitionsCommand().apply(init))
}

@Generated
class AWSGreengrassListLoggerDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.listLoggerDefinitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-logger-definitions")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listResourceDefinitionVersions(resourceDefinitionId: String, init: AWSGreengrassListResourceDefinitionVersionsCommand.() -> Unit) {
	this.block.declare(AWSGreengrassListResourceDefinitionVersionsCommand(resourceDefinitionId).apply(init))
}

@Generated
class AWSGreengrassListResourceDefinitionVersionsCommand(val resourceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setResourceDefinitionId(this.resourceDefinitionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.listResourceDefinitionVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-resource-definition-versions")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
				.argument("resource-definition-id", resourceDefinitionId)
	}

}


fun AWSGreengrassFunctions.listResourceDefinitions(init: AWSGreengrassListResourceDefinitionsCommand.() -> Unit) {
	this.block.declare(AWSGreengrassListResourceDefinitionsCommand().apply(init))
}

@Generated
class AWSGreengrassListResourceDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.listResourceDefinitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-resource-definitions")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listSubscriptionDefinitionVersions(subscriptionDefinitionId: String, init: AWSGreengrassListSubscriptionDefinitionVersionsCommand.() -> Unit) {
	this.block.declare(AWSGreengrassListSubscriptionDefinitionVersionsCommand(subscriptionDefinitionId).apply(init))
}

@Generated
class AWSGreengrassListSubscriptionDefinitionVersionsCommand(val subscriptionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setSubscriptionDefinitionId(this.subscriptionDefinitionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.listSubscriptionDefinitionVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-subscription-definition-versions")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
				.argument("subscription-definition-id", subscriptionDefinitionId)
	}

}


fun AWSGreengrassFunctions.listSubscriptionDefinitions(init: AWSGreengrassListSubscriptionDefinitionsCommand.() -> Unit) {
	this.block.declare(AWSGreengrassListSubscriptionDefinitionsCommand().apply(init))
}

@Generated
class AWSGreengrassListSubscriptionDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.listSubscriptionDefinitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-subscription-definitions")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.resetDeployments(groupId: String, init: AWSGreengrassResetDeploymentsCommand.() -> Unit) {
	this.block.declare(AWSGreengrassResetDeploymentsCommand(groupId).apply(init))
}

@Generated
class AWSGreengrassResetDeploymentsCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ResetDeploymentsRequest> {

	var amznClientToken: String? = null
	var force: Boolean? = false

	override fun build(): com.amazonaws.services.greengrass.model.ResetDeploymentsRequest {
		val input = com.amazonaws.services.greengrass.model.ResetDeploymentsRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setForce(this.force)
		input.setGroupId(this.groupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.resetDeployments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass reset-deployments")
				.argument("amzn-client-token", amznClientToken)
				.option("force", force ?: false)
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.updateConnectivityInfo(thingName: String, init: AWSGreengrassUpdateConnectivityInfoCommand.() -> Unit) {
	this.block.declare(AWSGreengrassUpdateConnectivityInfoCommand(thingName).apply(init))
}

@Generated
class AWSGreengrassUpdateConnectivityInfoCommand(val thingName: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest> {

	var connectivityInfo: List<com.amazonaws.services.greengrass.model.ConnectivityInfo>? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest()
		input.setConnectivityInfo(this.connectivityInfo)
		input.setThingName(this.thingName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.updateConnectivityInfo(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-connectivity-info")
				.argument("connectivity-info", connectivityInfo?.toString())
				.argument("thing-name", thingName)
	}

}


fun AWSGreengrassFunctions.updateCoreDefinition(coreDefinitionId: String, init: AWSGreengrassUpdateCoreDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassUpdateCoreDefinitionCommand(coreDefinitionId).apply(init))
}

@Generated
class AWSGreengrassUpdateCoreDefinitionCommand(val coreDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest()
		input.setCoreDefinitionId(this.coreDefinitionId)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.updateCoreDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-core-definition")
				.argument("core-definition-id", coreDefinitionId)
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.updateDeviceDefinition(deviceDefinitionId: String, init: AWSGreengrassUpdateDeviceDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassUpdateDeviceDefinitionCommand(deviceDefinitionId).apply(init))
}

@Generated
class AWSGreengrassUpdateDeviceDefinitionCommand(val deviceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest()
		input.setDeviceDefinitionId(this.deviceDefinitionId)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.updateDeviceDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-device-definition")
				.argument("device-definition-id", deviceDefinitionId)
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.updateFunctionDefinition(functionDefinitionId: String, init: AWSGreengrassUpdateFunctionDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassUpdateFunctionDefinitionCommand(functionDefinitionId).apply(init))
}

@Generated
class AWSGreengrassUpdateFunctionDefinitionCommand(val functionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest()
		input.setFunctionDefinitionId(this.functionDefinitionId)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.updateFunctionDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-function-definition")
				.argument("function-definition-id", functionDefinitionId)
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.updateGroup(groupId: String, init: AWSGreengrassUpdateGroupCommand.() -> Unit) {
	this.block.declare(AWSGreengrassUpdateGroupCommand(groupId).apply(init))
}

@Generated
class AWSGreengrassUpdateGroupCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateGroupRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateGroupRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateGroupRequest()
		input.setGroupId(this.groupId)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.updateGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-group")
				.argument("group-id", groupId)
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.updateGroupCertificateConfiguration(groupId: String, init: AWSGreengrassUpdateGroupCertificateConfigurationCommand.() -> Unit) {
	this.block.declare(AWSGreengrassUpdateGroupCertificateConfigurationCommand(groupId).apply(init))
}

@Generated
class AWSGreengrassUpdateGroupCertificateConfigurationCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest> {

	var certificateExpiryInMilliseconds: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest()
		input.setCertificateExpiryInMilliseconds(this.certificateExpiryInMilliseconds)
		input.setGroupId(this.groupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.updateGroupCertificateConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-group-certificate-configuration")
				.argument("certificate-expiry-in-milliseconds", certificateExpiryInMilliseconds)
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.updateLoggerDefinition(loggerDefinitionId: String, init: AWSGreengrassUpdateLoggerDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassUpdateLoggerDefinitionCommand(loggerDefinitionId).apply(init))
}

@Generated
class AWSGreengrassUpdateLoggerDefinitionCommand(val loggerDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest()
		input.setLoggerDefinitionId(this.loggerDefinitionId)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.updateLoggerDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-logger-definition")
				.argument("logger-definition-id", loggerDefinitionId)
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.updateResourceDefinition(resourceDefinitionId: String, init: AWSGreengrassUpdateResourceDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassUpdateResourceDefinitionCommand(resourceDefinitionId).apply(init))
}

@Generated
class AWSGreengrassUpdateResourceDefinitionCommand(val resourceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest()
		input.setName(this.name)
		input.setResourceDefinitionId(this.resourceDefinitionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.updateResourceDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-resource-definition")
				.argument("name", name)
				.argument("resource-definition-id", resourceDefinitionId)
	}

}


fun AWSGreengrassFunctions.updateSubscriptionDefinition(subscriptionDefinitionId: String, init: AWSGreengrassUpdateSubscriptionDefinitionCommand.() -> Unit) {
	this.block.declare(AWSGreengrassUpdateSubscriptionDefinitionCommand(subscriptionDefinitionId).apply(init))
}

@Generated
class AWSGreengrassUpdateSubscriptionDefinitionCommand(val subscriptionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest()
		input.setName(this.name)
		input.setSubscriptionDefinitionId(this.subscriptionDefinitionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.greengrass.updateSubscriptionDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-subscription-definition")
				.argument("name", name)
				.argument("subscription-definition-id", subscriptionDefinitionId)
	}

}
