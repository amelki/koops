
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.greengrass.*
import com.amazonaws.services.greengrass.model.*

var codingue.koops.core.Environment.greengrass: AWSGreengrass
	get() {
		var service = this.capabilities["aws-greengrass"]
		if (service == null) {
			service = AWSGreengrassClientBuilder.standard().build()
			this.capabilities["aws-greengrass"] = service
		}
		return service as AWSGreengrass
	}
	set(greengrass) {
		this.capabilities["aws-greengrass"] = greengrass
	}

@Generated
class AWSGreengrassFunctions(val block: Block)

infix fun <T> AwsContinuation.greengrass(init: AWSGreengrassFunctions.() -> T): T {
	return AWSGreengrassFunctions(shell).run(init)
}

			

fun AWSGreengrassFunctions.associateRoleToGroup(groupId: String, init: AWSGreengrassAssociateRoleToGroupCommand.() -> Unit): com.amazonaws.services.greengrass.model.AssociateRoleToGroupResult {
	return this.block.declare(AWSGreengrassAssociateRoleToGroupCommand(groupId).apply(init)) as com.amazonaws.services.greengrass.model.AssociateRoleToGroupResult
}

@Generated
class AWSGreengrassAssociateRoleToGroupCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest, com.amazonaws.services.greengrass.model.AssociateRoleToGroupResult> {

	var roleArn: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest {
		val input = com.amazonaws.services.greengrass.model.AssociateRoleToGroupRequest()
		input.setGroupId(this.groupId)
		input.setRoleArn(this.roleArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.AssociateRoleToGroupResult {
	  return com.amazonaws.services.greengrass.model.AssociateRoleToGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.AssociateRoleToGroupResult {
		return environment.greengrass.associateRoleToGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass associate-role-to-group")
				.argument("group-id", groupId)
				.argument("role-arn", roleArn)
	}

}


fun AWSGreengrassFunctions.associateServiceRoleToAccount(init: AWSGreengrassAssociateServiceRoleToAccountCommand.() -> Unit): com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountResult {
	return this.block.declare(AWSGreengrassAssociateServiceRoleToAccountCommand().apply(init)) as com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountResult
}

@Generated
class AWSGreengrassAssociateServiceRoleToAccountCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest, com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountResult> {

	var roleArn: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest {
		val input = com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountRequest()
		input.setRoleArn(this.roleArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountResult {
	  return com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.AssociateServiceRoleToAccountResult {
		return environment.greengrass.associateServiceRoleToAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass associate-service-role-to-account")
				.argument("role-arn", roleArn)
	}

}


fun AWSGreengrassFunctions.createCoreDefinition(init: AWSGreengrassCreateCoreDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateCoreDefinitionResult {
	return this.block.declare(AWSGreengrassCreateCoreDefinitionCommand().apply(init)) as com.amazonaws.services.greengrass.model.CreateCoreDefinitionResult
}

@Generated
class AWSGreengrassCreateCoreDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateCoreDefinitionRequest, com.amazonaws.services.greengrass.model.CreateCoreDefinitionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateCoreDefinitionResult {
	  return com.amazonaws.services.greengrass.model.CreateCoreDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateCoreDefinitionResult {
		return environment.greengrass.createCoreDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-core-definition")
				.argument("amzn-client-token", amznClientToken)
				.argument("initial-version", initialVersion?.toString())
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.createCoreDefinitionVersion(coreDefinitionId: String, init: AWSGreengrassCreateCoreDefinitionVersionCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionResult {
	return this.block.declare(AWSGreengrassCreateCoreDefinitionVersionCommand(coreDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionResult
}

@Generated
class AWSGreengrassCreateCoreDefinitionVersionCommand(val coreDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest, com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionResult> {

	var amznClientToken: String? = null
	var cores: List<com.amazonaws.services.greengrass.model.Core>? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setCoreDefinitionId(this.coreDefinitionId)
		input.setCores(this.cores)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionResult {
	  return com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateCoreDefinitionVersionResult {
		return environment.greengrass.createCoreDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-core-definition-version")
				.argument("amzn-client-token", amznClientToken)
				.argument("core-definition-id", coreDefinitionId)
				.argument("cores", cores?.toString())
	}

}


fun AWSGreengrassFunctions.createDeployment(groupId: String, init: AWSGreengrassCreateDeploymentCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateDeploymentResult {
	return this.block.declare(AWSGreengrassCreateDeploymentCommand(groupId).apply(init)) as com.amazonaws.services.greengrass.model.CreateDeploymentResult
}

@Generated
class AWSGreengrassCreateDeploymentCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateDeploymentRequest, com.amazonaws.services.greengrass.model.CreateDeploymentResult> {

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

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateDeploymentResult {
	  return com.amazonaws.services.greengrass.model.CreateDeploymentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateDeploymentResult {
		return environment.greengrass.createDeployment(build())
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


fun AWSGreengrassFunctions.createDeviceDefinition(init: AWSGreengrassCreateDeviceDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateDeviceDefinitionResult {
	return this.block.declare(AWSGreengrassCreateDeviceDefinitionCommand().apply(init)) as com.amazonaws.services.greengrass.model.CreateDeviceDefinitionResult
}

@Generated
class AWSGreengrassCreateDeviceDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateDeviceDefinitionRequest, com.amazonaws.services.greengrass.model.CreateDeviceDefinitionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateDeviceDefinitionResult {
	  return com.amazonaws.services.greengrass.model.CreateDeviceDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateDeviceDefinitionResult {
		return environment.greengrass.createDeviceDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-device-definition")
				.argument("amzn-client-token", amznClientToken)
				.argument("initial-version", initialVersion?.toString())
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.createDeviceDefinitionVersion(deviceDefinitionId: String, init: AWSGreengrassCreateDeviceDefinitionVersionCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionResult {
	return this.block.declare(AWSGreengrassCreateDeviceDefinitionVersionCommand(deviceDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionResult
}

@Generated
class AWSGreengrassCreateDeviceDefinitionVersionCommand(val deviceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest, com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionResult> {

	var amznClientToken: String? = null
	var devices: List<com.amazonaws.services.greengrass.model.Device>? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setDeviceDefinitionId(this.deviceDefinitionId)
		input.setDevices(this.devices)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionResult {
	  return com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateDeviceDefinitionVersionResult {
		return environment.greengrass.createDeviceDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-device-definition-version")
				.argument("amzn-client-token", amznClientToken)
				.argument("device-definition-id", deviceDefinitionId)
				.argument("devices", devices?.toString())
	}

}


fun AWSGreengrassFunctions.createFunctionDefinition(init: AWSGreengrassCreateFunctionDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateFunctionDefinitionResult {
	return this.block.declare(AWSGreengrassCreateFunctionDefinitionCommand().apply(init)) as com.amazonaws.services.greengrass.model.CreateFunctionDefinitionResult
}

@Generated
class AWSGreengrassCreateFunctionDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest, com.amazonaws.services.greengrass.model.CreateFunctionDefinitionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateFunctionDefinitionResult {
	  return com.amazonaws.services.greengrass.model.CreateFunctionDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateFunctionDefinitionResult {
		return environment.greengrass.createFunctionDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-function-definition")
				.argument("amzn-client-token", amznClientToken)
				.argument("initial-version", initialVersion?.toString())
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.createFunctionDefinitionVersion(functionDefinitionId: String, init: AWSGreengrassCreateFunctionDefinitionVersionCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionResult {
	return this.block.declare(AWSGreengrassCreateFunctionDefinitionVersionCommand(functionDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionResult
}

@Generated
class AWSGreengrassCreateFunctionDefinitionVersionCommand(val functionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest, com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionResult> {

	var amznClientToken: String? = null
	var functions: List<com.amazonaws.services.greengrass.model.Function>? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setFunctionDefinitionId(this.functionDefinitionId)
		input.setFunctions(this.functions)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionResult {
	  return com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateFunctionDefinitionVersionResult {
		return environment.greengrass.createFunctionDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-function-definition-version")
				.argument("amzn-client-token", amznClientToken)
				.argument("function-definition-id", functionDefinitionId)
				.argument("functions", functions?.toString())
	}

}


fun AWSGreengrassFunctions.createGroup(init: AWSGreengrassCreateGroupCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateGroupResult {
	return this.block.declare(AWSGreengrassCreateGroupCommand().apply(init)) as com.amazonaws.services.greengrass.model.CreateGroupResult
}

@Generated
class AWSGreengrassCreateGroupCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateGroupRequest, com.amazonaws.services.greengrass.model.CreateGroupResult> {

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

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateGroupResult {
	  return com.amazonaws.services.greengrass.model.CreateGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateGroupResult {
		return environment.greengrass.createGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-group")
				.argument("amzn-client-token", amznClientToken)
				.argument("initial-version", initialVersion?.toString())
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.createGroupCertificateAuthority(groupId: String, init: AWSGreengrassCreateGroupCertificateAuthorityCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityResult {
	return this.block.declare(AWSGreengrassCreateGroupCertificateAuthorityCommand(groupId).apply(init)) as com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityResult
}

@Generated
class AWSGreengrassCreateGroupCertificateAuthorityCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest, com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityResult> {

	var amznClientToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest {
		val input = com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setGroupId(this.groupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityResult {
	  return com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateGroupCertificateAuthorityResult {
		return environment.greengrass.createGroupCertificateAuthority(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-group-certificate-authority")
				.argument("amzn-client-token", amznClientToken)
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.createGroupVersion(groupId: String, init: AWSGreengrassCreateGroupVersionCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateGroupVersionResult {
	return this.block.declare(AWSGreengrassCreateGroupVersionCommand(groupId).apply(init)) as com.amazonaws.services.greengrass.model.CreateGroupVersionResult
}

@Generated
class AWSGreengrassCreateGroupVersionCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateGroupVersionRequest, com.amazonaws.services.greengrass.model.CreateGroupVersionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateGroupVersionResult {
	  return com.amazonaws.services.greengrass.model.CreateGroupVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateGroupVersionResult {
		return environment.greengrass.createGroupVersion(build())
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


fun AWSGreengrassFunctions.createLoggerDefinition(init: AWSGreengrassCreateLoggerDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateLoggerDefinitionResult {
	return this.block.declare(AWSGreengrassCreateLoggerDefinitionCommand().apply(init)) as com.amazonaws.services.greengrass.model.CreateLoggerDefinitionResult
}

@Generated
class AWSGreengrassCreateLoggerDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateLoggerDefinitionRequest, com.amazonaws.services.greengrass.model.CreateLoggerDefinitionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateLoggerDefinitionResult {
	  return com.amazonaws.services.greengrass.model.CreateLoggerDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateLoggerDefinitionResult {
		return environment.greengrass.createLoggerDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-logger-definition")
				.argument("amzn-client-token", amznClientToken)
				.argument("initial-version", initialVersion?.toString())
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.createLoggerDefinitionVersion(loggerDefinitionId: String, init: AWSGreengrassCreateLoggerDefinitionVersionCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionResult {
	return this.block.declare(AWSGreengrassCreateLoggerDefinitionVersionCommand(loggerDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionResult
}

@Generated
class AWSGreengrassCreateLoggerDefinitionVersionCommand(val loggerDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest, com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionResult> {

	var amznClientToken: String? = null
	var loggers: List<com.amazonaws.services.greengrass.model.Logger>? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setLoggerDefinitionId(this.loggerDefinitionId)
		input.setLoggers(this.loggers)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionResult {
	  return com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateLoggerDefinitionVersionResult {
		return environment.greengrass.createLoggerDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-logger-definition-version")
				.argument("amzn-client-token", amznClientToken)
				.argument("logger-definition-id", loggerDefinitionId)
				.argument("loggers", loggers?.toString())
	}

}


fun AWSGreengrassFunctions.createResourceDefinition(init: AWSGreengrassCreateResourceDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateResourceDefinitionResult {
	return this.block.declare(AWSGreengrassCreateResourceDefinitionCommand().apply(init)) as com.amazonaws.services.greengrass.model.CreateResourceDefinitionResult
}

@Generated
class AWSGreengrassCreateResourceDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateResourceDefinitionRequest, com.amazonaws.services.greengrass.model.CreateResourceDefinitionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateResourceDefinitionResult {
	  return com.amazonaws.services.greengrass.model.CreateResourceDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateResourceDefinitionResult {
		return environment.greengrass.createResourceDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-resource-definition")
				.argument("amzn-client-token", amznClientToken)
				.argument("initial-version", initialVersion?.toString())
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.createResourceDefinitionVersion(resourceDefinitionId: String, init: AWSGreengrassCreateResourceDefinitionVersionCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionResult {
	return this.block.declare(AWSGreengrassCreateResourceDefinitionVersionCommand(resourceDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionResult
}

@Generated
class AWSGreengrassCreateResourceDefinitionVersionCommand(val resourceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest, com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionResult> {

	var amznClientToken: String? = null
	var resources: List<com.amazonaws.services.greengrass.model.Resource>? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setResourceDefinitionId(this.resourceDefinitionId)
		input.setResources(this.resources)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionResult {
	  return com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateResourceDefinitionVersionResult {
		return environment.greengrass.createResourceDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-resource-definition-version")
				.argument("amzn-client-token", amznClientToken)
				.argument("resource-definition-id", resourceDefinitionId)
				.argument("resources", resources?.toString())
	}

}


fun AWSGreengrassFunctions.createSoftwareUpdateJob(init: AWSGreengrassCreateSoftwareUpdateJobCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobResult {
	return this.block.declare(AWSGreengrassCreateSoftwareUpdateJobCommand().apply(init)) as com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobResult
}

@Generated
class AWSGreengrassCreateSoftwareUpdateJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobRequest, com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobResult> {

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

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobResult {
	  return com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateSoftwareUpdateJobResult {
		return environment.greengrass.createSoftwareUpdateJob(build())
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


fun AWSGreengrassFunctions.createSubscriptionDefinition(init: AWSGreengrassCreateSubscriptionDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionResult {
	return this.block.declare(AWSGreengrassCreateSubscriptionDefinitionCommand().apply(init)) as com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionResult
}

@Generated
class AWSGreengrassCreateSubscriptionDefinitionCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionRequest, com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionResult {
	  return com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionResult {
		return environment.greengrass.createSubscriptionDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-subscription-definition")
				.argument("amzn-client-token", amznClientToken)
				.argument("initial-version", initialVersion?.toString())
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.createSubscriptionDefinitionVersion(subscriptionDefinitionId: String, init: AWSGreengrassCreateSubscriptionDefinitionVersionCommand.() -> Unit): com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionResult {
	return this.block.declare(AWSGreengrassCreateSubscriptionDefinitionVersionCommand(subscriptionDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionResult
}

@Generated
class AWSGreengrassCreateSubscriptionDefinitionVersionCommand(val subscriptionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest, com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionResult> {

	var amznClientToken: String? = null
	var subscriptions: List<com.amazonaws.services.greengrass.model.Subscription>? = null

	override fun build(): com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setSubscriptionDefinitionId(this.subscriptionDefinitionId)
		input.setSubscriptions(this.subscriptions)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionResult {
	  return com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.CreateSubscriptionDefinitionVersionResult {
		return environment.greengrass.createSubscriptionDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass create-subscription-definition-version")
				.argument("amzn-client-token", amznClientToken)
				.argument("subscription-definition-id", subscriptionDefinitionId)
				.argument("subscriptions", subscriptions?.toString())
	}

}


fun AWSGreengrassFunctions.deleteCoreDefinition(coreDefinitionId: String, init: AWSGreengrassDeleteCoreDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.DeleteCoreDefinitionResult {
	return this.block.declare(AWSGreengrassDeleteCoreDefinitionCommand(coreDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.DeleteCoreDefinitionResult
}

@Generated
class AWSGreengrassDeleteCoreDefinitionCommand(val coreDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest, com.amazonaws.services.greengrass.model.DeleteCoreDefinitionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.DeleteCoreDefinitionRequest()
		input.setCoreDefinitionId(this.coreDefinitionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.DeleteCoreDefinitionResult {
	  return com.amazonaws.services.greengrass.model.DeleteCoreDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.DeleteCoreDefinitionResult {
		return environment.greengrass.deleteCoreDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass delete-core-definition")
				.argument("core-definition-id", coreDefinitionId)
	}

}


fun AWSGreengrassFunctions.deleteDeviceDefinition(deviceDefinitionId: String, init: AWSGreengrassDeleteDeviceDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionResult {
	return this.block.declare(AWSGreengrassDeleteDeviceDefinitionCommand(deviceDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionResult
}

@Generated
class AWSGreengrassDeleteDeviceDefinitionCommand(val deviceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest, com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionRequest()
		input.setDeviceDefinitionId(this.deviceDefinitionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionResult {
	  return com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.DeleteDeviceDefinitionResult {
		return environment.greengrass.deleteDeviceDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass delete-device-definition")
				.argument("device-definition-id", deviceDefinitionId)
	}

}


fun AWSGreengrassFunctions.deleteFunctionDefinition(functionDefinitionId: String, init: AWSGreengrassDeleteFunctionDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionResult {
	return this.block.declare(AWSGreengrassDeleteFunctionDefinitionCommand(functionDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionResult
}

@Generated
class AWSGreengrassDeleteFunctionDefinitionCommand(val functionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest, com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionRequest()
		input.setFunctionDefinitionId(this.functionDefinitionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionResult {
	  return com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.DeleteFunctionDefinitionResult {
		return environment.greengrass.deleteFunctionDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass delete-function-definition")
				.argument("function-definition-id", functionDefinitionId)
	}

}


fun AWSGreengrassFunctions.deleteGroup(groupId: String, init: AWSGreengrassDeleteGroupCommand.() -> Unit): com.amazonaws.services.greengrass.model.DeleteGroupResult {
	return this.block.declare(AWSGreengrassDeleteGroupCommand(groupId).apply(init)) as com.amazonaws.services.greengrass.model.DeleteGroupResult
}

@Generated
class AWSGreengrassDeleteGroupCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DeleteGroupRequest, com.amazonaws.services.greengrass.model.DeleteGroupResult> {



	override fun build(): com.amazonaws.services.greengrass.model.DeleteGroupRequest {
		val input = com.amazonaws.services.greengrass.model.DeleteGroupRequest()
		input.setGroupId(this.groupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.DeleteGroupResult {
	  return com.amazonaws.services.greengrass.model.DeleteGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.DeleteGroupResult {
		return environment.greengrass.deleteGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass delete-group")
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.deleteLoggerDefinition(loggerDefinitionId: String, init: AWSGreengrassDeleteLoggerDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionResult {
	return this.block.declare(AWSGreengrassDeleteLoggerDefinitionCommand(loggerDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionResult
}

@Generated
class AWSGreengrassDeleteLoggerDefinitionCommand(val loggerDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest, com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionRequest()
		input.setLoggerDefinitionId(this.loggerDefinitionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionResult {
	  return com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.DeleteLoggerDefinitionResult {
		return environment.greengrass.deleteLoggerDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass delete-logger-definition")
				.argument("logger-definition-id", loggerDefinitionId)
	}

}


fun AWSGreengrassFunctions.deleteResourceDefinition(resourceDefinitionId: String, init: AWSGreengrassDeleteResourceDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.DeleteResourceDefinitionResult {
	return this.block.declare(AWSGreengrassDeleteResourceDefinitionCommand(resourceDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.DeleteResourceDefinitionResult
}

@Generated
class AWSGreengrassDeleteResourceDefinitionCommand(val resourceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest, com.amazonaws.services.greengrass.model.DeleteResourceDefinitionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.DeleteResourceDefinitionRequest()
		input.setResourceDefinitionId(this.resourceDefinitionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.DeleteResourceDefinitionResult {
	  return com.amazonaws.services.greengrass.model.DeleteResourceDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.DeleteResourceDefinitionResult {
		return environment.greengrass.deleteResourceDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass delete-resource-definition")
				.argument("resource-definition-id", resourceDefinitionId)
	}

}


fun AWSGreengrassFunctions.deleteSubscriptionDefinition(subscriptionDefinitionId: String, init: AWSGreengrassDeleteSubscriptionDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionResult {
	return this.block.declare(AWSGreengrassDeleteSubscriptionDefinitionCommand(subscriptionDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionResult
}

@Generated
class AWSGreengrassDeleteSubscriptionDefinitionCommand(val subscriptionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest, com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionRequest()
		input.setSubscriptionDefinitionId(this.subscriptionDefinitionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionResult {
	  return com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.DeleteSubscriptionDefinitionResult {
		return environment.greengrass.deleteSubscriptionDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass delete-subscription-definition")
				.argument("subscription-definition-id", subscriptionDefinitionId)
	}

}


fun AWSGreengrassFunctions.disassociateRoleFromGroup(groupId: String, init: AWSGreengrassDisassociateRoleFromGroupCommand.() -> Unit): com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupResult {
	return this.block.declare(AWSGreengrassDisassociateRoleFromGroupCommand(groupId).apply(init)) as com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupResult
}

@Generated
class AWSGreengrassDisassociateRoleFromGroupCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest, com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupResult> {



	override fun build(): com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest {
		val input = com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupRequest()
		input.setGroupId(this.groupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupResult {
	  return com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.DisassociateRoleFromGroupResult {
		return environment.greengrass.disassociateRoleFromGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass disassociate-role-from-group")
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.disassociateServiceRoleFromAccount(init: AWSGreengrassDisassociateServiceRoleFromAccountCommand.() -> Unit): com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountResult {
	return this.block.declare(AWSGreengrassDisassociateServiceRoleFromAccountCommand().apply(init)) as com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountResult
}

@Generated
class AWSGreengrassDisassociateServiceRoleFromAccountCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest, com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountResult> {



	override fun build(): com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest {
		val input = com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountResult {
	  return com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.DisassociateServiceRoleFromAccountResult {
		return environment.greengrass.disassociateServiceRoleFromAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass disassociate-service-role-from-account")

	}

}


fun AWSGreengrassFunctions.getAssociatedRole(groupId: String, init: AWSGreengrassGetAssociatedRoleCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetAssociatedRoleResult {
	return this.block.declare(AWSGreengrassGetAssociatedRoleCommand(groupId).apply(init)) as com.amazonaws.services.greengrass.model.GetAssociatedRoleResult
}

@Generated
class AWSGreengrassGetAssociatedRoleCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest, com.amazonaws.services.greengrass.model.GetAssociatedRoleResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest {
		val input = com.amazonaws.services.greengrass.model.GetAssociatedRoleRequest()
		input.setGroupId(this.groupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetAssociatedRoleResult {
	  return com.amazonaws.services.greengrass.model.GetAssociatedRoleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetAssociatedRoleResult {
		return environment.greengrass.getAssociatedRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-associated-role")
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.getConnectivityInfo(thingName: String, init: AWSGreengrassGetConnectivityInfoCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetConnectivityInfoResult {
	return this.block.declare(AWSGreengrassGetConnectivityInfoCommand(thingName).apply(init)) as com.amazonaws.services.greengrass.model.GetConnectivityInfoResult
}

@Generated
class AWSGreengrassGetConnectivityInfoCommand(val thingName: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest, com.amazonaws.services.greengrass.model.GetConnectivityInfoResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest {
		val input = com.amazonaws.services.greengrass.model.GetConnectivityInfoRequest()
		input.setThingName(this.thingName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetConnectivityInfoResult {
	  return com.amazonaws.services.greengrass.model.GetConnectivityInfoResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetConnectivityInfoResult {
		return environment.greengrass.getConnectivityInfo(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-connectivity-info")
				.argument("thing-name", thingName)
	}

}


fun AWSGreengrassFunctions.getCoreDefinition(coreDefinitionId: String, init: AWSGreengrassGetCoreDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetCoreDefinitionResult {
	return this.block.declare(AWSGreengrassGetCoreDefinitionCommand(coreDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.GetCoreDefinitionResult
}

@Generated
class AWSGreengrassGetCoreDefinitionCommand(val coreDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest, com.amazonaws.services.greengrass.model.GetCoreDefinitionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.GetCoreDefinitionRequest()
		input.setCoreDefinitionId(this.coreDefinitionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetCoreDefinitionResult {
	  return com.amazonaws.services.greengrass.model.GetCoreDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetCoreDefinitionResult {
		return environment.greengrass.getCoreDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-core-definition")
				.argument("core-definition-id", coreDefinitionId)
	}

}


fun AWSGreengrassFunctions.getCoreDefinitionVersion(coreDefinitionId: String, coreDefinitionVersionId: String, init: AWSGreengrassGetCoreDefinitionVersionCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionResult {
	return this.block.declare(AWSGreengrassGetCoreDefinitionVersionCommand(coreDefinitionId, coreDefinitionVersionId).apply(init)) as com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionResult
}

@Generated
class AWSGreengrassGetCoreDefinitionVersionCommand(val coreDefinitionId: String, val coreDefinitionVersionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest, com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionRequest()
		input.setCoreDefinitionId(this.coreDefinitionId)
		input.setCoreDefinitionVersionId(this.coreDefinitionVersionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionResult {
	  return com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetCoreDefinitionVersionResult {
		return environment.greengrass.getCoreDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-core-definition-version")
				.argument("core-definition-id", coreDefinitionId)
				.argument("core-definition-version-id", coreDefinitionVersionId)
	}

}


fun AWSGreengrassFunctions.getDeploymentStatus(deploymentId: String, groupId: String, init: AWSGreengrassGetDeploymentStatusCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetDeploymentStatusResult {
	return this.block.declare(AWSGreengrassGetDeploymentStatusCommand(deploymentId, groupId).apply(init)) as com.amazonaws.services.greengrass.model.GetDeploymentStatusResult
}

@Generated
class AWSGreengrassGetDeploymentStatusCommand(val deploymentId: String, val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest, com.amazonaws.services.greengrass.model.GetDeploymentStatusResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest {
		val input = com.amazonaws.services.greengrass.model.GetDeploymentStatusRequest()
		input.setDeploymentId(this.deploymentId)
		input.setGroupId(this.groupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetDeploymentStatusResult {
	  return com.amazonaws.services.greengrass.model.GetDeploymentStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetDeploymentStatusResult {
		return environment.greengrass.getDeploymentStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-deployment-status")
				.argument("deployment-id", deploymentId)
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.getDeviceDefinition(deviceDefinitionId: String, init: AWSGreengrassGetDeviceDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetDeviceDefinitionResult {
	return this.block.declare(AWSGreengrassGetDeviceDefinitionCommand(deviceDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.GetDeviceDefinitionResult
}

@Generated
class AWSGreengrassGetDeviceDefinitionCommand(val deviceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest, com.amazonaws.services.greengrass.model.GetDeviceDefinitionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.GetDeviceDefinitionRequest()
		input.setDeviceDefinitionId(this.deviceDefinitionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetDeviceDefinitionResult {
	  return com.amazonaws.services.greengrass.model.GetDeviceDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetDeviceDefinitionResult {
		return environment.greengrass.getDeviceDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-device-definition")
				.argument("device-definition-id", deviceDefinitionId)
	}

}


fun AWSGreengrassFunctions.getDeviceDefinitionVersion(deviceDefinitionId: String, deviceDefinitionVersionId: String, init: AWSGreengrassGetDeviceDefinitionVersionCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionResult {
	return this.block.declare(AWSGreengrassGetDeviceDefinitionVersionCommand(deviceDefinitionId, deviceDefinitionVersionId).apply(init)) as com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionResult
}

@Generated
class AWSGreengrassGetDeviceDefinitionVersionCommand(val deviceDefinitionId: String, val deviceDefinitionVersionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest, com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionRequest()
		input.setDeviceDefinitionId(this.deviceDefinitionId)
		input.setDeviceDefinitionVersionId(this.deviceDefinitionVersionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionResult {
	  return com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetDeviceDefinitionVersionResult {
		return environment.greengrass.getDeviceDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-device-definition-version")
				.argument("device-definition-id", deviceDefinitionId)
				.argument("device-definition-version-id", deviceDefinitionVersionId)
	}

}


fun AWSGreengrassFunctions.getFunctionDefinition(functionDefinitionId: String, init: AWSGreengrassGetFunctionDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetFunctionDefinitionResult {
	return this.block.declare(AWSGreengrassGetFunctionDefinitionCommand(functionDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.GetFunctionDefinitionResult
}

@Generated
class AWSGreengrassGetFunctionDefinitionCommand(val functionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest, com.amazonaws.services.greengrass.model.GetFunctionDefinitionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.GetFunctionDefinitionRequest()
		input.setFunctionDefinitionId(this.functionDefinitionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetFunctionDefinitionResult {
	  return com.amazonaws.services.greengrass.model.GetFunctionDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetFunctionDefinitionResult {
		return environment.greengrass.getFunctionDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-function-definition")
				.argument("function-definition-id", functionDefinitionId)
	}

}


fun AWSGreengrassFunctions.getFunctionDefinitionVersion(functionDefinitionId: String, functionDefinitionVersionId: String, init: AWSGreengrassGetFunctionDefinitionVersionCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionResult {
	return this.block.declare(AWSGreengrassGetFunctionDefinitionVersionCommand(functionDefinitionId, functionDefinitionVersionId).apply(init)) as com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionResult
}

@Generated
class AWSGreengrassGetFunctionDefinitionVersionCommand(val functionDefinitionId: String, val functionDefinitionVersionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest, com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionRequest()
		input.setFunctionDefinitionId(this.functionDefinitionId)
		input.setFunctionDefinitionVersionId(this.functionDefinitionVersionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionResult {
	  return com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetFunctionDefinitionVersionResult {
		return environment.greengrass.getFunctionDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-function-definition-version")
				.argument("function-definition-id", functionDefinitionId)
				.argument("function-definition-version-id", functionDefinitionVersionId)
	}

}


fun AWSGreengrassFunctions.getGroup(groupId: String, init: AWSGreengrassGetGroupCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetGroupResult {
	return this.block.declare(AWSGreengrassGetGroupCommand(groupId).apply(init)) as com.amazonaws.services.greengrass.model.GetGroupResult
}

@Generated
class AWSGreengrassGetGroupCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetGroupRequest, com.amazonaws.services.greengrass.model.GetGroupResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetGroupRequest {
		val input = com.amazonaws.services.greengrass.model.GetGroupRequest()
		input.setGroupId(this.groupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetGroupResult {
	  return com.amazonaws.services.greengrass.model.GetGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetGroupResult {
		return environment.greengrass.getGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-group")
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.getGroupCertificateAuthority(certificateAuthorityId: String, groupId: String, init: AWSGreengrassGetGroupCertificateAuthorityCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityResult {
	return this.block.declare(AWSGreengrassGetGroupCertificateAuthorityCommand(certificateAuthorityId, groupId).apply(init)) as com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityResult
}

@Generated
class AWSGreengrassGetGroupCertificateAuthorityCommand(val certificateAuthorityId: String, val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest, com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest {
		val input = com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityRequest()
		input.setCertificateAuthorityId(this.certificateAuthorityId)
		input.setGroupId(this.groupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityResult {
	  return com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetGroupCertificateAuthorityResult {
		return environment.greengrass.getGroupCertificateAuthority(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-group-certificate-authority")
				.argument("certificate-authority-id", certificateAuthorityId)
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.getGroupCertificateConfiguration(groupId: String, init: AWSGreengrassGetGroupCertificateConfigurationCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationResult {
	return this.block.declare(AWSGreengrassGetGroupCertificateConfigurationCommand(groupId).apply(init)) as com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationResult
}

@Generated
class AWSGreengrassGetGroupCertificateConfigurationCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest, com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest {
		val input = com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationRequest()
		input.setGroupId(this.groupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationResult {
	  return com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetGroupCertificateConfigurationResult {
		return environment.greengrass.getGroupCertificateConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-group-certificate-configuration")
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.getGroupVersion(groupId: String, groupVersionId: String, init: AWSGreengrassGetGroupVersionCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetGroupVersionResult {
	return this.block.declare(AWSGreengrassGetGroupVersionCommand(groupId, groupVersionId).apply(init)) as com.amazonaws.services.greengrass.model.GetGroupVersionResult
}

@Generated
class AWSGreengrassGetGroupVersionCommand(val groupId: String, val groupVersionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetGroupVersionRequest, com.amazonaws.services.greengrass.model.GetGroupVersionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetGroupVersionRequest {
		val input = com.amazonaws.services.greengrass.model.GetGroupVersionRequest()
		input.setGroupId(this.groupId)
		input.setGroupVersionId(this.groupVersionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetGroupVersionResult {
	  return com.amazonaws.services.greengrass.model.GetGroupVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetGroupVersionResult {
		return environment.greengrass.getGroupVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-group-version")
				.argument("group-id", groupId)
				.argument("group-version-id", groupVersionId)
	}

}


fun AWSGreengrassFunctions.getLoggerDefinition(loggerDefinitionId: String, init: AWSGreengrassGetLoggerDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetLoggerDefinitionResult {
	return this.block.declare(AWSGreengrassGetLoggerDefinitionCommand(loggerDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.GetLoggerDefinitionResult
}

@Generated
class AWSGreengrassGetLoggerDefinitionCommand(val loggerDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest, com.amazonaws.services.greengrass.model.GetLoggerDefinitionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.GetLoggerDefinitionRequest()
		input.setLoggerDefinitionId(this.loggerDefinitionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetLoggerDefinitionResult {
	  return com.amazonaws.services.greengrass.model.GetLoggerDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetLoggerDefinitionResult {
		return environment.greengrass.getLoggerDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-logger-definition")
				.argument("logger-definition-id", loggerDefinitionId)
	}

}


fun AWSGreengrassFunctions.getLoggerDefinitionVersion(loggerDefinitionId: String, loggerDefinitionVersionId: String, init: AWSGreengrassGetLoggerDefinitionVersionCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionResult {
	return this.block.declare(AWSGreengrassGetLoggerDefinitionVersionCommand(loggerDefinitionId, loggerDefinitionVersionId).apply(init)) as com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionResult
}

@Generated
class AWSGreengrassGetLoggerDefinitionVersionCommand(val loggerDefinitionId: String, val loggerDefinitionVersionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest, com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionRequest()
		input.setLoggerDefinitionId(this.loggerDefinitionId)
		input.setLoggerDefinitionVersionId(this.loggerDefinitionVersionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionResult {
	  return com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetLoggerDefinitionVersionResult {
		return environment.greengrass.getLoggerDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-logger-definition-version")
				.argument("logger-definition-id", loggerDefinitionId)
				.argument("logger-definition-version-id", loggerDefinitionVersionId)
	}

}


fun AWSGreengrassFunctions.getResourceDefinition(resourceDefinitionId: String, init: AWSGreengrassGetResourceDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetResourceDefinitionResult {
	return this.block.declare(AWSGreengrassGetResourceDefinitionCommand(resourceDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.GetResourceDefinitionResult
}

@Generated
class AWSGreengrassGetResourceDefinitionCommand(val resourceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest, com.amazonaws.services.greengrass.model.GetResourceDefinitionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.GetResourceDefinitionRequest()
		input.setResourceDefinitionId(this.resourceDefinitionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetResourceDefinitionResult {
	  return com.amazonaws.services.greengrass.model.GetResourceDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetResourceDefinitionResult {
		return environment.greengrass.getResourceDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-resource-definition")
				.argument("resource-definition-id", resourceDefinitionId)
	}

}


fun AWSGreengrassFunctions.getResourceDefinitionVersion(resourceDefinitionId: String, resourceDefinitionVersionId: String, init: AWSGreengrassGetResourceDefinitionVersionCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionResult {
	return this.block.declare(AWSGreengrassGetResourceDefinitionVersionCommand(resourceDefinitionId, resourceDefinitionVersionId).apply(init)) as com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionResult
}

@Generated
class AWSGreengrassGetResourceDefinitionVersionCommand(val resourceDefinitionId: String, val resourceDefinitionVersionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest, com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionRequest()
		input.setResourceDefinitionId(this.resourceDefinitionId)
		input.setResourceDefinitionVersionId(this.resourceDefinitionVersionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionResult {
	  return com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetResourceDefinitionVersionResult {
		return environment.greengrass.getResourceDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-resource-definition-version")
				.argument("resource-definition-id", resourceDefinitionId)
				.argument("resource-definition-version-id", resourceDefinitionVersionId)
	}

}


fun AWSGreengrassFunctions.getServiceRoleForAccount(init: AWSGreengrassGetServiceRoleForAccountCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetServiceRoleForAccountResult {
	return this.block.declare(AWSGreengrassGetServiceRoleForAccountCommand().apply(init)) as com.amazonaws.services.greengrass.model.GetServiceRoleForAccountResult
}

@Generated
class AWSGreengrassGetServiceRoleForAccountCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest, com.amazonaws.services.greengrass.model.GetServiceRoleForAccountResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest {
		val input = com.amazonaws.services.greengrass.model.GetServiceRoleForAccountRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetServiceRoleForAccountResult {
	  return com.amazonaws.services.greengrass.model.GetServiceRoleForAccountResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetServiceRoleForAccountResult {
		return environment.greengrass.getServiceRoleForAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-service-role-for-account")

	}

}


fun AWSGreengrassFunctions.getSubscriptionDefinition(subscriptionDefinitionId: String, init: AWSGreengrassGetSubscriptionDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionResult {
	return this.block.declare(AWSGreengrassGetSubscriptionDefinitionCommand(subscriptionDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionResult
}

@Generated
class AWSGreengrassGetSubscriptionDefinitionCommand(val subscriptionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest, com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionRequest()
		input.setSubscriptionDefinitionId(this.subscriptionDefinitionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionResult {
	  return com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionResult {
		return environment.greengrass.getSubscriptionDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-subscription-definition")
				.argument("subscription-definition-id", subscriptionDefinitionId)
	}

}


fun AWSGreengrassFunctions.getSubscriptionDefinitionVersion(subscriptionDefinitionId: String, subscriptionDefinitionVersionId: String, init: AWSGreengrassGetSubscriptionDefinitionVersionCommand.() -> Unit): com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionResult {
	return this.block.declare(AWSGreengrassGetSubscriptionDefinitionVersionCommand(subscriptionDefinitionId, subscriptionDefinitionVersionId).apply(init)) as com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionResult
}

@Generated
class AWSGreengrassGetSubscriptionDefinitionVersionCommand(val subscriptionDefinitionId: String, val subscriptionDefinitionVersionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest, com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionResult> {



	override fun build(): com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest {
		val input = com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionRequest()
		input.setSubscriptionDefinitionId(this.subscriptionDefinitionId)
		input.setSubscriptionDefinitionVersionId(this.subscriptionDefinitionVersionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionResult {
	  return com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.GetSubscriptionDefinitionVersionResult {
		return environment.greengrass.getSubscriptionDefinitionVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass get-subscription-definition-version")
				.argument("subscription-definition-id", subscriptionDefinitionId)
				.argument("subscription-definition-version-id", subscriptionDefinitionVersionId)
	}

}


fun AWSGreengrassFunctions.listCoreDefinitionVersions(coreDefinitionId: String, init: AWSGreengrassListCoreDefinitionVersionsCommand.() -> Unit): com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsResult {
	return this.block.declare(AWSGreengrassListCoreDefinitionVersionsCommand(coreDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsResult
}

@Generated
class AWSGreengrassListCoreDefinitionVersionsCommand(val coreDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest, com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsResult> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsRequest()
		input.setCoreDefinitionId(this.coreDefinitionId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsResult {
	  return com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ListCoreDefinitionVersionsResult {
		return environment.greengrass.listCoreDefinitionVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-core-definition-versions")
				.argument("core-definition-id", coreDefinitionId)
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listCoreDefinitions(init: AWSGreengrassListCoreDefinitionsCommand.() -> Unit): com.amazonaws.services.greengrass.model.ListCoreDefinitionsResult {
	return this.block.declare(AWSGreengrassListCoreDefinitionsCommand().apply(init)) as com.amazonaws.services.greengrass.model.ListCoreDefinitionsResult
}

@Generated
class AWSGreengrassListCoreDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest, com.amazonaws.services.greengrass.model.ListCoreDefinitionsResult> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListCoreDefinitionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ListCoreDefinitionsResult {
	  return com.amazonaws.services.greengrass.model.ListCoreDefinitionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ListCoreDefinitionsResult {
		return environment.greengrass.listCoreDefinitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-core-definitions")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listDeployments(groupId: String, init: AWSGreengrassListDeploymentsCommand.() -> Unit): com.amazonaws.services.greengrass.model.ListDeploymentsResult {
	return this.block.declare(AWSGreengrassListDeploymentsCommand(groupId).apply(init)) as com.amazonaws.services.greengrass.model.ListDeploymentsResult
}

@Generated
class AWSGreengrassListDeploymentsCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListDeploymentsRequest, com.amazonaws.services.greengrass.model.ListDeploymentsResult> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListDeploymentsRequest {
		val input = com.amazonaws.services.greengrass.model.ListDeploymentsRequest()
		input.setGroupId(this.groupId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ListDeploymentsResult {
	  return com.amazonaws.services.greengrass.model.ListDeploymentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ListDeploymentsResult {
		return environment.greengrass.listDeployments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-deployments")
				.argument("group-id", groupId)
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listDeviceDefinitionVersions(deviceDefinitionId: String, init: AWSGreengrassListDeviceDefinitionVersionsCommand.() -> Unit): com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsResult {
	return this.block.declare(AWSGreengrassListDeviceDefinitionVersionsCommand(deviceDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsResult
}

@Generated
class AWSGreengrassListDeviceDefinitionVersionsCommand(val deviceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest, com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsResult> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsRequest()
		input.setDeviceDefinitionId(this.deviceDefinitionId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsResult {
	  return com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ListDeviceDefinitionVersionsResult {
		return environment.greengrass.listDeviceDefinitionVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-device-definition-versions")
				.argument("device-definition-id", deviceDefinitionId)
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listDeviceDefinitions(init: AWSGreengrassListDeviceDefinitionsCommand.() -> Unit): com.amazonaws.services.greengrass.model.ListDeviceDefinitionsResult {
	return this.block.declare(AWSGreengrassListDeviceDefinitionsCommand().apply(init)) as com.amazonaws.services.greengrass.model.ListDeviceDefinitionsResult
}

@Generated
class AWSGreengrassListDeviceDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest, com.amazonaws.services.greengrass.model.ListDeviceDefinitionsResult> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListDeviceDefinitionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ListDeviceDefinitionsResult {
	  return com.amazonaws.services.greengrass.model.ListDeviceDefinitionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ListDeviceDefinitionsResult {
		return environment.greengrass.listDeviceDefinitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-device-definitions")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listFunctionDefinitionVersions(functionDefinitionId: String, init: AWSGreengrassListFunctionDefinitionVersionsCommand.() -> Unit): com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsResult {
	return this.block.declare(AWSGreengrassListFunctionDefinitionVersionsCommand(functionDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsResult
}

@Generated
class AWSGreengrassListFunctionDefinitionVersionsCommand(val functionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest, com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsResult> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsRequest()
		input.setFunctionDefinitionId(this.functionDefinitionId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsResult {
	  return com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ListFunctionDefinitionVersionsResult {
		return environment.greengrass.listFunctionDefinitionVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-function-definition-versions")
				.argument("function-definition-id", functionDefinitionId)
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listFunctionDefinitions(init: AWSGreengrassListFunctionDefinitionsCommand.() -> Unit): com.amazonaws.services.greengrass.model.ListFunctionDefinitionsResult {
	return this.block.declare(AWSGreengrassListFunctionDefinitionsCommand().apply(init)) as com.amazonaws.services.greengrass.model.ListFunctionDefinitionsResult
}

@Generated
class AWSGreengrassListFunctionDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest, com.amazonaws.services.greengrass.model.ListFunctionDefinitionsResult> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListFunctionDefinitionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ListFunctionDefinitionsResult {
	  return com.amazonaws.services.greengrass.model.ListFunctionDefinitionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ListFunctionDefinitionsResult {
		return environment.greengrass.listFunctionDefinitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-function-definitions")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listGroupCertificateAuthorities(groupId: String, init: AWSGreengrassListGroupCertificateAuthoritiesCommand.() -> Unit): com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesResult {
	return this.block.declare(AWSGreengrassListGroupCertificateAuthoritiesCommand(groupId).apply(init)) as com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesResult
}

@Generated
class AWSGreengrassListGroupCertificateAuthoritiesCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest, com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesResult> {



	override fun build(): com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest {
		val input = com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesRequest()
		input.setGroupId(this.groupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesResult {
	  return com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ListGroupCertificateAuthoritiesResult {
		return environment.greengrass.listGroupCertificateAuthorities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-group-certificate-authorities")
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.listGroupVersions(groupId: String, init: AWSGreengrassListGroupVersionsCommand.() -> Unit): com.amazonaws.services.greengrass.model.ListGroupVersionsResult {
	return this.block.declare(AWSGreengrassListGroupVersionsCommand(groupId).apply(init)) as com.amazonaws.services.greengrass.model.ListGroupVersionsResult
}

@Generated
class AWSGreengrassListGroupVersionsCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListGroupVersionsRequest, com.amazonaws.services.greengrass.model.ListGroupVersionsResult> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListGroupVersionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListGroupVersionsRequest()
		input.setGroupId(this.groupId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ListGroupVersionsResult {
	  return com.amazonaws.services.greengrass.model.ListGroupVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ListGroupVersionsResult {
		return environment.greengrass.listGroupVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-group-versions")
				.argument("group-id", groupId)
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listGroups(init: AWSGreengrassListGroupsCommand.() -> Unit): com.amazonaws.services.greengrass.model.ListGroupsResult {
	return this.block.declare(AWSGreengrassListGroupsCommand().apply(init)) as com.amazonaws.services.greengrass.model.ListGroupsResult
}

@Generated
class AWSGreengrassListGroupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListGroupsRequest, com.amazonaws.services.greengrass.model.ListGroupsResult> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListGroupsRequest {
		val input = com.amazonaws.services.greengrass.model.ListGroupsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ListGroupsResult {
	  return com.amazonaws.services.greengrass.model.ListGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ListGroupsResult {
		return environment.greengrass.listGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-groups")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listLoggerDefinitionVersions(loggerDefinitionId: String, init: AWSGreengrassListLoggerDefinitionVersionsCommand.() -> Unit): com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsResult {
	return this.block.declare(AWSGreengrassListLoggerDefinitionVersionsCommand(loggerDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsResult
}

@Generated
class AWSGreengrassListLoggerDefinitionVersionsCommand(val loggerDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest, com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsResult> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsRequest()
		input.setLoggerDefinitionId(this.loggerDefinitionId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsResult {
	  return com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ListLoggerDefinitionVersionsResult {
		return environment.greengrass.listLoggerDefinitionVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-logger-definition-versions")
				.argument("logger-definition-id", loggerDefinitionId)
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listLoggerDefinitions(init: AWSGreengrassListLoggerDefinitionsCommand.() -> Unit): com.amazonaws.services.greengrass.model.ListLoggerDefinitionsResult {
	return this.block.declare(AWSGreengrassListLoggerDefinitionsCommand().apply(init)) as com.amazonaws.services.greengrass.model.ListLoggerDefinitionsResult
}

@Generated
class AWSGreengrassListLoggerDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest, com.amazonaws.services.greengrass.model.ListLoggerDefinitionsResult> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListLoggerDefinitionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ListLoggerDefinitionsResult {
	  return com.amazonaws.services.greengrass.model.ListLoggerDefinitionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ListLoggerDefinitionsResult {
		return environment.greengrass.listLoggerDefinitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-logger-definitions")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listResourceDefinitionVersions(resourceDefinitionId: String, init: AWSGreengrassListResourceDefinitionVersionsCommand.() -> Unit): com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsResult {
	return this.block.declare(AWSGreengrassListResourceDefinitionVersionsCommand(resourceDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsResult
}

@Generated
class AWSGreengrassListResourceDefinitionVersionsCommand(val resourceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest, com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsResult> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setResourceDefinitionId(this.resourceDefinitionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsResult {
	  return com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ListResourceDefinitionVersionsResult {
		return environment.greengrass.listResourceDefinitionVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-resource-definition-versions")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
				.argument("resource-definition-id", resourceDefinitionId)
	}

}


fun AWSGreengrassFunctions.listResourceDefinitions(init: AWSGreengrassListResourceDefinitionsCommand.() -> Unit): com.amazonaws.services.greengrass.model.ListResourceDefinitionsResult {
	return this.block.declare(AWSGreengrassListResourceDefinitionsCommand().apply(init)) as com.amazonaws.services.greengrass.model.ListResourceDefinitionsResult
}

@Generated
class AWSGreengrassListResourceDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest, com.amazonaws.services.greengrass.model.ListResourceDefinitionsResult> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListResourceDefinitionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ListResourceDefinitionsResult {
	  return com.amazonaws.services.greengrass.model.ListResourceDefinitionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ListResourceDefinitionsResult {
		return environment.greengrass.listResourceDefinitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-resource-definitions")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.listSubscriptionDefinitionVersions(subscriptionDefinitionId: String, init: AWSGreengrassListSubscriptionDefinitionVersionsCommand.() -> Unit): com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsResult {
	return this.block.declare(AWSGreengrassListSubscriptionDefinitionVersionsCommand(subscriptionDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsResult
}

@Generated
class AWSGreengrassListSubscriptionDefinitionVersionsCommand(val subscriptionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest, com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsResult> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		input.setSubscriptionDefinitionId(this.subscriptionDefinitionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsResult {
	  return com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionVersionsResult {
		return environment.greengrass.listSubscriptionDefinitionVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-subscription-definition-versions")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
				.argument("subscription-definition-id", subscriptionDefinitionId)
	}

}


fun AWSGreengrassFunctions.listSubscriptionDefinitions(init: AWSGreengrassListSubscriptionDefinitionsCommand.() -> Unit): com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsResult {
	return this.block.declare(AWSGreengrassListSubscriptionDefinitionsCommand().apply(init)) as com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsResult
}

@Generated
class AWSGreengrassListSubscriptionDefinitionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest, com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsResult> {

	var maxResults: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest {
		val input = com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsResult {
	  return com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ListSubscriptionDefinitionsResult {
		return environment.greengrass.listSubscriptionDefinitions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass list-subscription-definitions")
				.argument("max-results", maxResults)
				.argument("next-token", nextToken)
	}

}


fun AWSGreengrassFunctions.resetDeployments(groupId: String, init: AWSGreengrassResetDeploymentsCommand.() -> Unit): com.amazonaws.services.greengrass.model.ResetDeploymentsResult {
	return this.block.declare(AWSGreengrassResetDeploymentsCommand(groupId).apply(init)) as com.amazonaws.services.greengrass.model.ResetDeploymentsResult
}

@Generated
class AWSGreengrassResetDeploymentsCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.ResetDeploymentsRequest, com.amazonaws.services.greengrass.model.ResetDeploymentsResult> {

	var amznClientToken: String? = null
	var force: Boolean? = false

	override fun build(): com.amazonaws.services.greengrass.model.ResetDeploymentsRequest {
		val input = com.amazonaws.services.greengrass.model.ResetDeploymentsRequest()
		input.setAmznClientToken(this.amznClientToken)
		input.setForce(this.force)
		input.setGroupId(this.groupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.ResetDeploymentsResult {
	  return com.amazonaws.services.greengrass.model.ResetDeploymentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.ResetDeploymentsResult {
		return environment.greengrass.resetDeployments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass reset-deployments")
				.argument("amzn-client-token", amznClientToken)
				.option("force", force ?: false)
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.updateConnectivityInfo(thingName: String, init: AWSGreengrassUpdateConnectivityInfoCommand.() -> Unit): com.amazonaws.services.greengrass.model.UpdateConnectivityInfoResult {
	return this.block.declare(AWSGreengrassUpdateConnectivityInfoCommand(thingName).apply(init)) as com.amazonaws.services.greengrass.model.UpdateConnectivityInfoResult
}

@Generated
class AWSGreengrassUpdateConnectivityInfoCommand(val thingName: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest, com.amazonaws.services.greengrass.model.UpdateConnectivityInfoResult> {

	var connectivityInfo: List<com.amazonaws.services.greengrass.model.ConnectivityInfo>? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateConnectivityInfoRequest()
		input.setConnectivityInfo(this.connectivityInfo)
		input.setThingName(this.thingName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.UpdateConnectivityInfoResult {
	  return com.amazonaws.services.greengrass.model.UpdateConnectivityInfoResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.UpdateConnectivityInfoResult {
		return environment.greengrass.updateConnectivityInfo(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-connectivity-info")
				.argument("connectivity-info", connectivityInfo?.toString())
				.argument("thing-name", thingName)
	}

}


fun AWSGreengrassFunctions.updateCoreDefinition(coreDefinitionId: String, init: AWSGreengrassUpdateCoreDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.UpdateCoreDefinitionResult {
	return this.block.declare(AWSGreengrassUpdateCoreDefinitionCommand(coreDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.UpdateCoreDefinitionResult
}

@Generated
class AWSGreengrassUpdateCoreDefinitionCommand(val coreDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest, com.amazonaws.services.greengrass.model.UpdateCoreDefinitionResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateCoreDefinitionRequest()
		input.setCoreDefinitionId(this.coreDefinitionId)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.UpdateCoreDefinitionResult {
	  return com.amazonaws.services.greengrass.model.UpdateCoreDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.UpdateCoreDefinitionResult {
		return environment.greengrass.updateCoreDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-core-definition")
				.argument("core-definition-id", coreDefinitionId)
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.updateDeviceDefinition(deviceDefinitionId: String, init: AWSGreengrassUpdateDeviceDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionResult {
	return this.block.declare(AWSGreengrassUpdateDeviceDefinitionCommand(deviceDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionResult
}

@Generated
class AWSGreengrassUpdateDeviceDefinitionCommand(val deviceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest, com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionRequest()
		input.setDeviceDefinitionId(this.deviceDefinitionId)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionResult {
	  return com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.UpdateDeviceDefinitionResult {
		return environment.greengrass.updateDeviceDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-device-definition")
				.argument("device-definition-id", deviceDefinitionId)
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.updateFunctionDefinition(functionDefinitionId: String, init: AWSGreengrassUpdateFunctionDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionResult {
	return this.block.declare(AWSGreengrassUpdateFunctionDefinitionCommand(functionDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionResult
}

@Generated
class AWSGreengrassUpdateFunctionDefinitionCommand(val functionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest, com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionRequest()
		input.setFunctionDefinitionId(this.functionDefinitionId)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionResult {
	  return com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.UpdateFunctionDefinitionResult {
		return environment.greengrass.updateFunctionDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-function-definition")
				.argument("function-definition-id", functionDefinitionId)
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.updateGroup(groupId: String, init: AWSGreengrassUpdateGroupCommand.() -> Unit): com.amazonaws.services.greengrass.model.UpdateGroupResult {
	return this.block.declare(AWSGreengrassUpdateGroupCommand(groupId).apply(init)) as com.amazonaws.services.greengrass.model.UpdateGroupResult
}

@Generated
class AWSGreengrassUpdateGroupCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateGroupRequest, com.amazonaws.services.greengrass.model.UpdateGroupResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateGroupRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateGroupRequest()
		input.setGroupId(this.groupId)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.UpdateGroupResult {
	  return com.amazonaws.services.greengrass.model.UpdateGroupResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.UpdateGroupResult {
		return environment.greengrass.updateGroup(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-group")
				.argument("group-id", groupId)
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.updateGroupCertificateConfiguration(groupId: String, init: AWSGreengrassUpdateGroupCertificateConfigurationCommand.() -> Unit): com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationResult {
	return this.block.declare(AWSGreengrassUpdateGroupCertificateConfigurationCommand(groupId).apply(init)) as com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationResult
}

@Generated
class AWSGreengrassUpdateGroupCertificateConfigurationCommand(val groupId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest, com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationResult> {

	var certificateExpiryInMilliseconds: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationRequest()
		input.setCertificateExpiryInMilliseconds(this.certificateExpiryInMilliseconds)
		input.setGroupId(this.groupId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationResult {
	  return com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.UpdateGroupCertificateConfigurationResult {
		return environment.greengrass.updateGroupCertificateConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-group-certificate-configuration")
				.argument("certificate-expiry-in-milliseconds", certificateExpiryInMilliseconds)
				.argument("group-id", groupId)
	}

}


fun AWSGreengrassFunctions.updateLoggerDefinition(loggerDefinitionId: String, init: AWSGreengrassUpdateLoggerDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionResult {
	return this.block.declare(AWSGreengrassUpdateLoggerDefinitionCommand(loggerDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionResult
}

@Generated
class AWSGreengrassUpdateLoggerDefinitionCommand(val loggerDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest, com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionRequest()
		input.setLoggerDefinitionId(this.loggerDefinitionId)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionResult {
	  return com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.UpdateLoggerDefinitionResult {
		return environment.greengrass.updateLoggerDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-logger-definition")
				.argument("logger-definition-id", loggerDefinitionId)
				.argument("name", name)
	}

}


fun AWSGreengrassFunctions.updateResourceDefinition(resourceDefinitionId: String, init: AWSGreengrassUpdateResourceDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.UpdateResourceDefinitionResult {
	return this.block.declare(AWSGreengrassUpdateResourceDefinitionCommand(resourceDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.UpdateResourceDefinitionResult
}

@Generated
class AWSGreengrassUpdateResourceDefinitionCommand(val resourceDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest, com.amazonaws.services.greengrass.model.UpdateResourceDefinitionResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateResourceDefinitionRequest()
		input.setName(this.name)
		input.setResourceDefinitionId(this.resourceDefinitionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.UpdateResourceDefinitionResult {
	  return com.amazonaws.services.greengrass.model.UpdateResourceDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.UpdateResourceDefinitionResult {
		return environment.greengrass.updateResourceDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-resource-definition")
				.argument("name", name)
				.argument("resource-definition-id", resourceDefinitionId)
	}

}


fun AWSGreengrassFunctions.updateSubscriptionDefinition(subscriptionDefinitionId: String, init: AWSGreengrassUpdateSubscriptionDefinitionCommand.() -> Unit): com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionResult {
	return this.block.declare(AWSGreengrassUpdateSubscriptionDefinitionCommand(subscriptionDefinitionId).apply(init)) as com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionResult
}

@Generated
class AWSGreengrassUpdateSubscriptionDefinitionCommand(val subscriptionDefinitionId: String) : AmazonWebServiceCommand<com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest, com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest {
		val input = com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionRequest()
		input.setName(this.name)
		input.setSubscriptionDefinitionId(this.subscriptionDefinitionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionResult {
	  return com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.greengrass.model.UpdateSubscriptionDefinitionResult {
		return environment.greengrass.updateSubscriptionDefinition(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws greengrass update-subscription-definition")
				.argument("name", name)
				.argument("subscription-definition-id", subscriptionDefinitionId)
	}

}
