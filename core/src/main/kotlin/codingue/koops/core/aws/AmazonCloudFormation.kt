
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.cloudformation.AmazonCloudFormation
import com.amazonaws.services.cloudformation.model.*

var codingue.koops.core.Environment.cloudformation: AmazonCloudFormation
	get() = this.capabilities[AmazonCloudFormation::class.java.name] as AmazonCloudFormation
	set(cloudformation) {
		this.capabilities[AmazonCloudFormation::class.java.name] = cloudformation
	}

@Generated
class AmazonCloudFormationFunctions(val block: Block)

infix fun AwsContinuation.cloudformation(init: AmazonCloudFormationFunctions.() -> Unit) {
	AmazonCloudFormationFunctions(shell).apply(init)
}

			

fun AmazonCloudFormationFunctions.cancelUpdateStack(stackName: String, init: AmazonCloudFormationCancelUpdateStackCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationCancelUpdateStackCommand(stackName).apply(init))
}

@Generated
class AmazonCloudFormationCancelUpdateStackCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest> {

	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest {
		val input = com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest()
		input.setStackName(this.stackName)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.cancelUpdateStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation cancel-update-stack")
				.argument("stack-name", stackName)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AmazonCloudFormationFunctions.continueUpdateRollback(stackName: String, init: AmazonCloudFormationContinueUpdateRollbackCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationContinueUpdateRollbackCommand(stackName).apply(init))
}

@Generated
class AmazonCloudFormationContinueUpdateRollbackCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackRequest> {

	var roleARN: String? = null
	var resourcesToSkip: List<String>? = null
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackRequest {
		val input = com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackRequest()
		input.setStackName(this.stackName)
		input.setRoleARN(this.roleARN)
		input.setResourcesToSkip(this.resourcesToSkip)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.continueUpdateRollback(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation continue-update-rollback")
				.argument("stack-name", stackName)
				.argument("role-arn", roleARN)
				.argument("resources-to-skip", resourcesToSkip?.toString())
				.argument("client-request-token", clientRequestToken)
	}

}


fun AmazonCloudFormationFunctions.createChangeSet(stackName: String, changeSetName: String, init: AmazonCloudFormationCreateChangeSetCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationCreateChangeSetCommand(stackName, changeSetName).apply(init))
}

@Generated
class AmazonCloudFormationCreateChangeSetCommand(val stackName: String, val changeSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.CreateChangeSetRequest> {

	var templateBody: String? = null
	var templateURL: String? = null
	var usePreviousTemplate: Boolean? = false
	var parameters: List<com.amazonaws.services.cloudformation.model.Parameter>? = null
	var capabilities: List<Capability>? = null
	var resourceTypes: List<String>? = null
	var roleARN: String? = null
	var rollbackConfiguration: com.amazonaws.services.cloudformation.model.RollbackConfiguration? = null
	var notificationARNs: List<String>? = null
	var tags: List<com.amazonaws.services.cloudformation.model.Tag>? = null
	var clientToken: String? = null
	var description: String? = null
	var changeSetType: ChangeSetType? = null

	override fun build(): com.amazonaws.services.cloudformation.model.CreateChangeSetRequest {
		val input = com.amazonaws.services.cloudformation.model.CreateChangeSetRequest()
		input.setStackName(this.stackName)
		input.setTemplateBody(this.templateBody)
		input.setTemplateURL(this.templateURL)
		input.setUsePreviousTemplate(this.usePreviousTemplate)
		input.setParameters(this.parameters)
		input.setCapabilities(this.capabilities?.map { it.toString() })
		input.setResourceTypes(this.resourceTypes)
		input.setRoleARN(this.roleARN)
		input.setRollbackConfiguration(this.rollbackConfiguration)
		input.setNotificationARNs(this.notificationARNs)
		input.setTags(this.tags)
		input.setChangeSetName(this.changeSetName)
		input.setClientToken(this.clientToken)
		input.setDescription(this.description)
		input.setChangeSetType(this.changeSetType?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.createChangeSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation create-change-set")
				.argument("stack-name", stackName)
				.argument("template-body", templateBody)
				.argument("template-url", templateURL)
				.option("use-previous-template", usePreviousTemplate ?: false)
				.argument("parameters", parameters?.toString())
				.argument("capabilities", capabilities?.toString())
				.argument("resource-types", resourceTypes?.toString())
				.argument("role-arn", roleARN)
				.argument("rollback-configuration", rollbackConfiguration?.toString())
				.argument("notification-arns", notificationARNs?.toString())
				.argument("tags", tags?.toString())
				.argument("change-set-name", changeSetName)
				.argument("client-token", clientToken)
				.argument("description", description)
				.argument("change-set-type", changeSetType?.toString())
	}

}


fun AmazonCloudFormationFunctions.createStack(stackName: String, init: AmazonCloudFormationCreateStackCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationCreateStackCommand(stackName).apply(init))
}

@Generated
class AmazonCloudFormationCreateStackCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.CreateStackRequest> {

	var templateBody: String? = null
	var templateURL: String? = null
	var parameters: List<com.amazonaws.services.cloudformation.model.Parameter>? = null
	var disableRollback: Boolean? = false
	var rollbackConfiguration: com.amazonaws.services.cloudformation.model.RollbackConfiguration? = null
	var timeoutInMinutes: Int? = 0
	var notificationARNs: List<String>? = null
	var capabilities: List<Capability>? = null
	var resourceTypes: List<String>? = null
	var roleARN: String? = null
	var onFailure: OnFailure? = null
	var stackPolicyBody: String? = null
	var stackPolicyURL: String? = null
	var tags: List<com.amazonaws.services.cloudformation.model.Tag>? = null
	var clientRequestToken: String? = null
	var enableTerminationProtection: Boolean? = false

	override fun build(): com.amazonaws.services.cloudformation.model.CreateStackRequest {
		val input = com.amazonaws.services.cloudformation.model.CreateStackRequest()
		input.setStackName(this.stackName)
		input.setTemplateBody(this.templateBody)
		input.setTemplateURL(this.templateURL)
		input.setParameters(this.parameters)
		input.setDisableRollback(this.disableRollback)
		input.setRollbackConfiguration(this.rollbackConfiguration)
		input.setTimeoutInMinutes(this.timeoutInMinutes)
		input.setNotificationARNs(this.notificationARNs)
		input.setCapabilities(this.capabilities?.map { it.toString() })
		input.setResourceTypes(this.resourceTypes)
		input.setRoleARN(this.roleARN)
		input.setOnFailure(this.onFailure?.toString())
		input.setStackPolicyBody(this.stackPolicyBody)
		input.setStackPolicyURL(this.stackPolicyURL)
		input.setTags(this.tags)
		input.setClientRequestToken(this.clientRequestToken)
		input.setEnableTerminationProtection(this.enableTerminationProtection)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.createStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation create-stack")
				.argument("stack-name", stackName)
				.argument("template-body", templateBody)
				.argument("template-url", templateURL)
				.argument("parameters", parameters?.toString())
				.option("disable-rollback", disableRollback ?: false)
				.argument("rollback-configuration", rollbackConfiguration?.toString())
				.argument("timeout-in-minutes", timeoutInMinutes?.toString())
				.argument("notification-arns", notificationARNs?.toString())
				.argument("capabilities", capabilities?.toString())
				.argument("resource-types", resourceTypes?.toString())
				.argument("role-arn", roleARN)
				.argument("on-failure", onFailure?.toString())
				.argument("stack-policy-body", stackPolicyBody)
				.argument("stack-policy-url", stackPolicyURL)
				.argument("tags", tags?.toString())
				.argument("client-request-token", clientRequestToken)
				.option("enable-termination-protection", enableTerminationProtection ?: false)
	}

}


fun AmazonCloudFormationFunctions.createStackInstances(stackSetName: String, accounts: List<String>, regions: List<String>, init: AmazonCloudFormationCreateStackInstancesCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationCreateStackInstancesCommand(stackSetName, accounts, regions).apply(init))
}

@Generated
class AmazonCloudFormationCreateStackInstancesCommand(val stackSetName: String, val accounts: List<String>, val regions: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.CreateStackInstancesRequest> {

	var parameterOverrides: List<com.amazonaws.services.cloudformation.model.Parameter>? = null
	var operationPreferences: com.amazonaws.services.cloudformation.model.StackSetOperationPreferences? = null
	var operationId: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.CreateStackInstancesRequest {
		val input = com.amazonaws.services.cloudformation.model.CreateStackInstancesRequest()
		input.setStackSetName(this.stackSetName)
		input.setAccounts(this.accounts)
		input.setRegions(this.regions)
		input.setParameterOverrides(this.parameterOverrides)
		input.setOperationPreferences(this.operationPreferences)
		input.setOperationId(this.operationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.createStackInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation create-stack-instances")
				.argument("stack-set-name", stackSetName)
				.argument("accounts", accounts.toString())
				.argument("regions", regions.toString())
				.argument("parameter-overrides", parameterOverrides?.toString())
				.argument("operation-preferences", operationPreferences?.toString())
				.argument("operation-id", operationId)
	}

}


fun AmazonCloudFormationFunctions.createStackSet(stackSetName: String, init: AmazonCloudFormationCreateStackSetCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationCreateStackSetCommand(stackSetName).apply(init))
}

@Generated
class AmazonCloudFormationCreateStackSetCommand(val stackSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.CreateStackSetRequest> {

	var description: String? = null
	var templateBody: String? = null
	var templateURL: String? = null
	var parameters: List<com.amazonaws.services.cloudformation.model.Parameter>? = null
	var capabilities: List<Capability>? = null
	var tags: List<com.amazonaws.services.cloudformation.model.Tag>? = null
	var administrationRoleARN: String? = null
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.CreateStackSetRequest {
		val input = com.amazonaws.services.cloudformation.model.CreateStackSetRequest()
		input.setStackSetName(this.stackSetName)
		input.setDescription(this.description)
		input.setTemplateBody(this.templateBody)
		input.setTemplateURL(this.templateURL)
		input.setParameters(this.parameters)
		input.setCapabilities(this.capabilities?.map { it.toString() })
		input.setTags(this.tags)
		input.setAdministrationRoleARN(this.administrationRoleARN)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.createStackSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation create-stack-set")
				.argument("stack-set-name", stackSetName)
				.argument("description", description)
				.argument("template-body", templateBody)
				.argument("template-url", templateURL)
				.argument("parameters", parameters?.toString())
				.argument("capabilities", capabilities?.toString())
				.argument("tags", tags?.toString())
				.argument("administration-role-arn", administrationRoleARN)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AmazonCloudFormationFunctions.deleteChangeSet(changeSetName: String, init: AmazonCloudFormationDeleteChangeSetCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationDeleteChangeSetCommand(changeSetName).apply(init))
}

@Generated
class AmazonCloudFormationDeleteChangeSetCommand(val changeSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest> {

	var stackName: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest {
		val input = com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest()
		input.setChangeSetName(this.changeSetName)
		input.setStackName(this.stackName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.deleteChangeSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation delete-change-set")
				.argument("change-set-name", changeSetName)
				.argument("stack-name", stackName)
	}

}


fun AmazonCloudFormationFunctions.deleteStack(stackName: String, init: AmazonCloudFormationDeleteStackCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationDeleteStackCommand(stackName).apply(init))
}

@Generated
class AmazonCloudFormationDeleteStackCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DeleteStackRequest> {

	var retainResources: List<String>? = null
	var roleARN: String? = null
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.DeleteStackRequest {
		val input = com.amazonaws.services.cloudformation.model.DeleteStackRequest()
		input.setStackName(this.stackName)
		input.setRetainResources(this.retainResources)
		input.setRoleARN(this.roleARN)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.deleteStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation delete-stack")
				.argument("stack-name", stackName)
				.argument("retain-resources", retainResources?.toString())
				.argument("role-arn", roleARN)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AmazonCloudFormationFunctions.deleteStackInstances(stackSetName: String, accounts: List<String>, regions: List<String>, retainStacks: Boolean, init: AmazonCloudFormationDeleteStackInstancesCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationDeleteStackInstancesCommand(stackSetName, accounts, regions, retainStacks).apply(init))
}

@Generated
class AmazonCloudFormationDeleteStackInstancesCommand(val stackSetName: String, val accounts: List<String>, val regions: List<String>, val retainStacks: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DeleteStackInstancesRequest> {

	var operationPreferences: com.amazonaws.services.cloudformation.model.StackSetOperationPreferences? = null
	var operationId: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.DeleteStackInstancesRequest {
		val input = com.amazonaws.services.cloudformation.model.DeleteStackInstancesRequest()
		input.setStackSetName(this.stackSetName)
		input.setAccounts(this.accounts)
		input.setRegions(this.regions)
		input.setOperationPreferences(this.operationPreferences)
		input.setRetainStacks(this.retainStacks)
		input.setOperationId(this.operationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.deleteStackInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation delete-stack-instances")
				.argument("stack-set-name", stackSetName)
				.argument("accounts", accounts.toString())
				.argument("regions", regions.toString())
				.argument("operation-preferences", operationPreferences?.toString())
				.option("retain-stacks", retainStacks ?: false)
				.argument("operation-id", operationId)
	}

}


fun AmazonCloudFormationFunctions.deleteStackSet(stackSetName: String, init: AmazonCloudFormationDeleteStackSetCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationDeleteStackSetCommand(stackSetName).apply(init))
}

@Generated
class AmazonCloudFormationDeleteStackSetCommand(val stackSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DeleteStackSetRequest> {



	override fun build(): com.amazonaws.services.cloudformation.model.DeleteStackSetRequest {
		val input = com.amazonaws.services.cloudformation.model.DeleteStackSetRequest()
		input.setStackSetName(this.stackSetName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.deleteStackSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation delete-stack-set")
				.argument("stack-set-name", stackSetName)
	}

}


fun AmazonCloudFormationFunctions.describeAccountLimits(init: AmazonCloudFormationDescribeAccountLimitsCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationDescribeAccountLimitsCommand().apply(init))
}

@Generated
class AmazonCloudFormationDescribeAccountLimitsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.describeAccountLimits(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-account-limits")
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudFormationFunctions.describeChangeSet(changeSetName: String, init: AmazonCloudFormationDescribeChangeSetCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationDescribeChangeSetCommand(changeSetName).apply(init))
}

@Generated
class AmazonCloudFormationDescribeChangeSetCommand(val changeSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest> {

	var stackName: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest()
		input.setChangeSetName(this.changeSetName)
		input.setStackName(this.stackName)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.describeChangeSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-change-set")
				.argument("change-set-name", changeSetName)
				.argument("stack-name", stackName)
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudFormationFunctions.describeStackEvents(init: AmazonCloudFormationDescribeStackEventsCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationDescribeStackEventsCommand().apply(init))
}

@Generated
class AmazonCloudFormationDescribeStackEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest> {

	var stackName: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest()
		input.setStackName(this.stackName)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.describeStackEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-stack-events")
				.argument("stack-name", stackName)
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudFormationFunctions.describeStackInstance(stackSetName: String, stackInstanceAccount: String, stackInstanceRegion: String, init: AmazonCloudFormationDescribeStackInstanceCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationDescribeStackInstanceCommand(stackSetName, stackInstanceAccount, stackInstanceRegion).apply(init))
}

@Generated
class AmazonCloudFormationDescribeStackInstanceCommand(val stackSetName: String, val stackInstanceAccount: String, val stackInstanceRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest> {



	override fun build(): com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest()
		input.setStackSetName(this.stackSetName)
		input.setStackInstanceAccount(this.stackInstanceAccount)
		input.setStackInstanceRegion(this.stackInstanceRegion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.describeStackInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-stack-instance")
				.argument("stack-set-name", stackSetName)
				.argument("stack-instance-account", stackInstanceAccount)
				.argument("stack-instance-region", stackInstanceRegion)
	}

}


fun AmazonCloudFormationFunctions.describeStackResource(stackName: String, logicalResourceId: String, init: AmazonCloudFormationDescribeStackResourceCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationDescribeStackResourceCommand(stackName, logicalResourceId).apply(init))
}

@Generated
class AmazonCloudFormationDescribeStackResourceCommand(val stackName: String, val logicalResourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest> {



	override fun build(): com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest()
		input.setStackName(this.stackName)
		input.setLogicalResourceId(this.logicalResourceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.describeStackResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-stack-resource")
				.argument("stack-name", stackName)
				.argument("logical-resource-id", logicalResourceId)
	}

}


fun AmazonCloudFormationFunctions.describeStackResources(init: AmazonCloudFormationDescribeStackResourcesCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationDescribeStackResourcesCommand().apply(init))
}

@Generated
class AmazonCloudFormationDescribeStackResourcesCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest> {

	var stackName: String? = null
	var logicalResourceId: String? = null
	var physicalResourceId: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest()
		input.setStackName(this.stackName)
		input.setLogicalResourceId(this.logicalResourceId)
		input.setPhysicalResourceId(this.physicalResourceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.describeStackResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-stack-resources")
				.argument("stack-name", stackName)
				.argument("logical-resource-id", logicalResourceId)
				.argument("physical-resource-id", physicalResourceId)
	}

}


fun AmazonCloudFormationFunctions.describeStackSet(stackSetName: String, init: AmazonCloudFormationDescribeStackSetCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationDescribeStackSetCommand(stackSetName).apply(init))
}

@Generated
class AmazonCloudFormationDescribeStackSetCommand(val stackSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeStackSetRequest> {



	override fun build(): com.amazonaws.services.cloudformation.model.DescribeStackSetRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeStackSetRequest()
		input.setStackSetName(this.stackSetName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.describeStackSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-stack-set")
				.argument("stack-set-name", stackSetName)
	}

}


fun AmazonCloudFormationFunctions.describeStackSetOperation(stackSetName: String, operationId: String, init: AmazonCloudFormationDescribeStackSetOperationCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationDescribeStackSetOperationCommand(stackSetName, operationId).apply(init))
}

@Generated
class AmazonCloudFormationDescribeStackSetOperationCommand(val stackSetName: String, val operationId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest> {



	override fun build(): com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest()
		input.setStackSetName(this.stackSetName)
		input.setOperationId(this.operationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.describeStackSetOperation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-stack-set-operation")
				.argument("stack-set-name", stackSetName)
				.argument("operation-id", operationId)
	}

}


fun AmazonCloudFormationFunctions.describeStacks(init: AmazonCloudFormationDescribeStacksCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationDescribeStacksCommand().apply(init))
}

@Generated
class AmazonCloudFormationDescribeStacksCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeStacksRequest> {

	var stackName: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.DescribeStacksRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeStacksRequest()
		input.setStackName(this.stackName)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.describeStacks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-stacks")
				.argument("stack-name", stackName)
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudFormationFunctions.estimateTemplateCost(init: AmazonCloudFormationEstimateTemplateCostCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationEstimateTemplateCostCommand().apply(init))
}

@Generated
class AmazonCloudFormationEstimateTemplateCostCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.EstimateTemplateCostRequest> {

	var templateBody: String? = null
	var templateURL: String? = null
	var parameters: List<com.amazonaws.services.cloudformation.model.Parameter>? = null

	override fun build(): com.amazonaws.services.cloudformation.model.EstimateTemplateCostRequest {
		val input = com.amazonaws.services.cloudformation.model.EstimateTemplateCostRequest()
		input.setTemplateBody(this.templateBody)
		input.setTemplateURL(this.templateURL)
		input.setParameters(this.parameters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.estimateTemplateCost(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation estimate-template-cost")
				.argument("template-body", templateBody)
				.argument("template-url", templateURL)
				.argument("parameters", parameters?.toString())
	}

}


fun AmazonCloudFormationFunctions.executeChangeSet(changeSetName: String, init: AmazonCloudFormationExecuteChangeSetCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationExecuteChangeSetCommand(changeSetName).apply(init))
}

@Generated
class AmazonCloudFormationExecuteChangeSetCommand(val changeSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest> {

	var stackName: String? = null
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest {
		val input = com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest()
		input.setChangeSetName(this.changeSetName)
		input.setStackName(this.stackName)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.executeChangeSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation execute-change-set")
				.argument("change-set-name", changeSetName)
				.argument("stack-name", stackName)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AmazonCloudFormationFunctions.getStackPolicy(stackName: String, init: AmazonCloudFormationGetStackPolicyCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationGetStackPolicyCommand(stackName).apply(init))
}

@Generated
class AmazonCloudFormationGetStackPolicyCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.GetStackPolicyRequest> {



	override fun build(): com.amazonaws.services.cloudformation.model.GetStackPolicyRequest {
		val input = com.amazonaws.services.cloudformation.model.GetStackPolicyRequest()
		input.setStackName(this.stackName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.getStackPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation get-stack-policy")
				.argument("stack-name", stackName)
	}

}


fun AmazonCloudFormationFunctions.getTemplate(init: AmazonCloudFormationGetTemplateCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationGetTemplateCommand().apply(init))
}

@Generated
class AmazonCloudFormationGetTemplateCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.GetTemplateRequest> {

	var stackName: String? = null
	var changeSetName: String? = null
	var templateStage: TemplateStage? = null

	override fun build(): com.amazonaws.services.cloudformation.model.GetTemplateRequest {
		val input = com.amazonaws.services.cloudformation.model.GetTemplateRequest()
		input.setStackName(this.stackName)
		input.setChangeSetName(this.changeSetName)
		input.setTemplateStage(this.templateStage?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.getTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation get-template")
				.argument("stack-name", stackName)
				.argument("change-set-name", changeSetName)
				.argument("template-stage", templateStage?.toString())
	}

}


fun AmazonCloudFormationFunctions.getTemplateSummary(init: AmazonCloudFormationGetTemplateSummaryCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationGetTemplateSummaryCommand().apply(init))
}

@Generated
class AmazonCloudFormationGetTemplateSummaryCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest> {

	var templateBody: String? = null
	var templateURL: String? = null
	var stackName: String? = null
	var stackSetName: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest {
		val input = com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest()
		input.setTemplateBody(this.templateBody)
		input.setTemplateURL(this.templateURL)
		input.setStackName(this.stackName)
		input.setStackSetName(this.stackSetName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.getTemplateSummary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation get-template-summary")
				.argument("template-body", templateBody)
				.argument("template-url", templateURL)
				.argument("stack-name", stackName)
				.argument("stack-set-name", stackSetName)
	}

}


fun AmazonCloudFormationFunctions.listChangeSets(stackName: String, init: AmazonCloudFormationListChangeSetsCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationListChangeSetsCommand(stackName).apply(init))
}

@Generated
class AmazonCloudFormationListChangeSetsCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListChangeSetsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ListChangeSetsRequest {
		val input = com.amazonaws.services.cloudformation.model.ListChangeSetsRequest()
		input.setStackName(this.stackName)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.listChangeSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-change-sets")
				.argument("stack-name", stackName)
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudFormationFunctions.listExports(init: AmazonCloudFormationListExportsCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationListExportsCommand().apply(init))
}

@Generated
class AmazonCloudFormationListExportsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListExportsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ListExportsRequest {
		val input = com.amazonaws.services.cloudformation.model.ListExportsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.listExports(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-exports")
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudFormationFunctions.listImports(exportName: String, init: AmazonCloudFormationListImportsCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationListImportsCommand(exportName).apply(init))
}

@Generated
class AmazonCloudFormationListImportsCommand(val exportName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListImportsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ListImportsRequest {
		val input = com.amazonaws.services.cloudformation.model.ListImportsRequest()
		input.setExportName(this.exportName)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.listImports(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-imports")
				.argument("export-name", exportName)
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudFormationFunctions.listStackInstances(stackSetName: String, init: AmazonCloudFormationListStackInstancesCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationListStackInstancesCommand(stackSetName).apply(init))
}

@Generated
class AmazonCloudFormationListStackInstancesCommand(val stackSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListStackInstancesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var stackInstanceAccount: String? = null
	var stackInstanceRegion: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ListStackInstancesRequest {
		val input = com.amazonaws.services.cloudformation.model.ListStackInstancesRequest()
		input.setStackSetName(this.stackSetName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setStackInstanceAccount(this.stackInstanceAccount)
		input.setStackInstanceRegion(this.stackInstanceRegion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.listStackInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-stack-instances")
				.argument("stack-set-name", stackSetName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("stack-instance-account", stackInstanceAccount)
				.argument("stack-instance-region", stackInstanceRegion)
	}

}


fun AmazonCloudFormationFunctions.listStackResources(stackName: String, init: AmazonCloudFormationListStackResourcesCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationListStackResourcesCommand(stackName).apply(init))
}

@Generated
class AmazonCloudFormationListStackResourcesCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListStackResourcesRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ListStackResourcesRequest {
		val input = com.amazonaws.services.cloudformation.model.ListStackResourcesRequest()
		input.setStackName(this.stackName)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.listStackResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-stack-resources")
				.argument("stack-name", stackName)
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudFormationFunctions.listStackSetOperationResults(stackSetName: String, operationId: String, init: AmazonCloudFormationListStackSetOperationResultsCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationListStackSetOperationResultsCommand(stackSetName, operationId).apply(init))
}

@Generated
class AmazonCloudFormationListStackSetOperationResultsCommand(val stackSetName: String, val operationId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsRequest {
		val input = com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsRequest()
		input.setStackSetName(this.stackSetName)
		input.setOperationId(this.operationId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.listStackSetOperationResults(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-stack-set-operation-results")
				.argument("stack-set-name", stackSetName)
				.argument("operation-id", operationId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudFormationFunctions.listStackSetOperations(stackSetName: String, init: AmazonCloudFormationListStackSetOperationsCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationListStackSetOperationsCommand(stackSetName).apply(init))
}

@Generated
class AmazonCloudFormationListStackSetOperationsCommand(val stackSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest {
		val input = com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest()
		input.setStackSetName(this.stackSetName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.listStackSetOperations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-stack-set-operations")
				.argument("stack-set-name", stackSetName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudFormationFunctions.listStackSets(init: AmazonCloudFormationListStackSetsCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationListStackSetsCommand().apply(init))
}

@Generated
class AmazonCloudFormationListStackSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListStackSetsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var status: StackSetStatus? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ListStackSetsRequest {
		val input = com.amazonaws.services.cloudformation.model.ListStackSetsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setStatus(this.status?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.listStackSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-stack-sets")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("status", status?.toString())
	}

}


fun AmazonCloudFormationFunctions.listStacks(init: AmazonCloudFormationListStacksCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationListStacksCommand().apply(init))
}

@Generated
class AmazonCloudFormationListStacksCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListStacksRequest> {

	var nextToken: String? = null
	var stackStatusFilters: List<StackStatus>? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ListStacksRequest {
		val input = com.amazonaws.services.cloudformation.model.ListStacksRequest()
		input.setNextToken(this.nextToken)
		input.setStackStatusFilters(this.stackStatusFilters?.map { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.listStacks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-stacks")
				.argument("next-token", nextToken)
				.argument("stack-status-filters", stackStatusFilters?.toString())
	}

}


fun AmazonCloudFormationFunctions.setStackPolicy(stackName: String, init: AmazonCloudFormationSetStackPolicyCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationSetStackPolicyCommand(stackName).apply(init))
}

@Generated
class AmazonCloudFormationSetStackPolicyCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.SetStackPolicyRequest> {

	var stackPolicyBody: String? = null
	var stackPolicyURL: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.SetStackPolicyRequest {
		val input = com.amazonaws.services.cloudformation.model.SetStackPolicyRequest()
		input.setStackName(this.stackName)
		input.setStackPolicyBody(this.stackPolicyBody)
		input.setStackPolicyURL(this.stackPolicyURL)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.setStackPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation set-stack-policy")
				.argument("stack-name", stackName)
				.argument("stack-policy-body", stackPolicyBody)
				.argument("stack-policy-url", stackPolicyURL)
	}

}


fun AmazonCloudFormationFunctions.signalResource(stackName: String, logicalResourceId: String, uniqueId: String, status: ResourceSignalStatus, init: AmazonCloudFormationSignalResourceCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationSignalResourceCommand(stackName, logicalResourceId, uniqueId, status).apply(init))
}

@Generated
class AmazonCloudFormationSignalResourceCommand(val stackName: String, val logicalResourceId: String, val uniqueId: String, val status: ResourceSignalStatus) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.SignalResourceRequest> {



	override fun build(): com.amazonaws.services.cloudformation.model.SignalResourceRequest {
		val input = com.amazonaws.services.cloudformation.model.SignalResourceRequest()
		input.setStackName(this.stackName)
		input.setLogicalResourceId(this.logicalResourceId)
		input.setUniqueId(this.uniqueId)
		input.setStatus(this.status.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.signalResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation signal-resource")
				.argument("stack-name", stackName)
				.argument("logical-resource-id", logicalResourceId)
				.argument("unique-id", uniqueId)
				.argument("status", status.toString())
	}

}


fun AmazonCloudFormationFunctions.stopStackSetOperation(stackSetName: String, operationId: String, init: AmazonCloudFormationStopStackSetOperationCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationStopStackSetOperationCommand(stackSetName, operationId).apply(init))
}

@Generated
class AmazonCloudFormationStopStackSetOperationCommand(val stackSetName: String, val operationId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest> {



	override fun build(): com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest {
		val input = com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest()
		input.setStackSetName(this.stackSetName)
		input.setOperationId(this.operationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.stopStackSetOperation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation stop-stack-set-operation")
				.argument("stack-set-name", stackSetName)
				.argument("operation-id", operationId)
	}

}


fun AmazonCloudFormationFunctions.updateStack(stackName: String, init: AmazonCloudFormationUpdateStackCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationUpdateStackCommand(stackName).apply(init))
}

@Generated
class AmazonCloudFormationUpdateStackCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.UpdateStackRequest> {

	var templateBody: String? = null
	var templateURL: String? = null
	var usePreviousTemplate: Boolean? = false
	var stackPolicyDuringUpdateBody: String? = null
	var stackPolicyDuringUpdateURL: String? = null
	var parameters: List<com.amazonaws.services.cloudformation.model.Parameter>? = null
	var capabilities: List<Capability>? = null
	var resourceTypes: List<String>? = null
	var roleARN: String? = null
	var rollbackConfiguration: com.amazonaws.services.cloudformation.model.RollbackConfiguration? = null
	var stackPolicyBody: String? = null
	var stackPolicyURL: String? = null
	var notificationARNs: List<String>? = null
	var tags: List<com.amazonaws.services.cloudformation.model.Tag>? = null
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.UpdateStackRequest {
		val input = com.amazonaws.services.cloudformation.model.UpdateStackRequest()
		input.setStackName(this.stackName)
		input.setTemplateBody(this.templateBody)
		input.setTemplateURL(this.templateURL)
		input.setUsePreviousTemplate(this.usePreviousTemplate)
		input.setStackPolicyDuringUpdateBody(this.stackPolicyDuringUpdateBody)
		input.setStackPolicyDuringUpdateURL(this.stackPolicyDuringUpdateURL)
		input.setParameters(this.parameters)
		input.setCapabilities(this.capabilities?.map { it.toString() })
		input.setResourceTypes(this.resourceTypes)
		input.setRoleARN(this.roleARN)
		input.setRollbackConfiguration(this.rollbackConfiguration)
		input.setStackPolicyBody(this.stackPolicyBody)
		input.setStackPolicyURL(this.stackPolicyURL)
		input.setNotificationARNs(this.notificationARNs)
		input.setTags(this.tags)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.updateStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation update-stack")
				.argument("stack-name", stackName)
				.argument("template-body", templateBody)
				.argument("template-url", templateURL)
				.option("use-previous-template", usePreviousTemplate ?: false)
				.argument("stack-policy-during-update-body", stackPolicyDuringUpdateBody)
				.argument("stack-policy-during-update-url", stackPolicyDuringUpdateURL)
				.argument("parameters", parameters?.toString())
				.argument("capabilities", capabilities?.toString())
				.argument("resource-types", resourceTypes?.toString())
				.argument("role-arn", roleARN)
				.argument("rollback-configuration", rollbackConfiguration?.toString())
				.argument("stack-policy-body", stackPolicyBody)
				.argument("stack-policy-url", stackPolicyURL)
				.argument("notification-arns", notificationARNs?.toString())
				.argument("tags", tags?.toString())
				.argument("client-request-token", clientRequestToken)
	}

}


fun AmazonCloudFormationFunctions.updateStackInstances(stackSetName: String, accounts: List<String>, regions: List<String>, init: AmazonCloudFormationUpdateStackInstancesCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationUpdateStackInstancesCommand(stackSetName, accounts, regions).apply(init))
}

@Generated
class AmazonCloudFormationUpdateStackInstancesCommand(val stackSetName: String, val accounts: List<String>, val regions: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.UpdateStackInstancesRequest> {

	var parameterOverrides: List<com.amazonaws.services.cloudformation.model.Parameter>? = null
	var operationPreferences: com.amazonaws.services.cloudformation.model.StackSetOperationPreferences? = null
	var operationId: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.UpdateStackInstancesRequest {
		val input = com.amazonaws.services.cloudformation.model.UpdateStackInstancesRequest()
		input.setStackSetName(this.stackSetName)
		input.setAccounts(this.accounts)
		input.setRegions(this.regions)
		input.setParameterOverrides(this.parameterOverrides)
		input.setOperationPreferences(this.operationPreferences)
		input.setOperationId(this.operationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.updateStackInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation update-stack-instances")
				.argument("stack-set-name", stackSetName)
				.argument("accounts", accounts.toString())
				.argument("regions", regions.toString())
				.argument("parameter-overrides", parameterOverrides?.toString())
				.argument("operation-preferences", operationPreferences?.toString())
				.argument("operation-id", operationId)
	}

}


fun AmazonCloudFormationFunctions.updateStackSet(stackSetName: String, init: AmazonCloudFormationUpdateStackSetCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationUpdateStackSetCommand(stackSetName).apply(init))
}

@Generated
class AmazonCloudFormationUpdateStackSetCommand(val stackSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.UpdateStackSetRequest> {

	var description: String? = null
	var templateBody: String? = null
	var templateURL: String? = null
	var usePreviousTemplate: Boolean? = false
	var parameters: List<com.amazonaws.services.cloudformation.model.Parameter>? = null
	var capabilities: List<Capability>? = null
	var tags: List<com.amazonaws.services.cloudformation.model.Tag>? = null
	var operationPreferences: com.amazonaws.services.cloudformation.model.StackSetOperationPreferences? = null
	var administrationRoleARN: String? = null
	var operationId: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.UpdateStackSetRequest {
		val input = com.amazonaws.services.cloudformation.model.UpdateStackSetRequest()
		input.setStackSetName(this.stackSetName)
		input.setDescription(this.description)
		input.setTemplateBody(this.templateBody)
		input.setTemplateURL(this.templateURL)
		input.setUsePreviousTemplate(this.usePreviousTemplate)
		input.setParameters(this.parameters)
		input.setCapabilities(this.capabilities?.map { it.toString() })
		input.setTags(this.tags)
		input.setOperationPreferences(this.operationPreferences)
		input.setAdministrationRoleARN(this.administrationRoleARN)
		input.setOperationId(this.operationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.updateStackSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation update-stack-set")
				.argument("stack-set-name", stackSetName)
				.argument("description", description)
				.argument("template-body", templateBody)
				.argument("template-url", templateURL)
				.option("use-previous-template", usePreviousTemplate ?: false)
				.argument("parameters", parameters?.toString())
				.argument("capabilities", capabilities?.toString())
				.argument("tags", tags?.toString())
				.argument("operation-preferences", operationPreferences?.toString())
				.argument("administration-role-arn", administrationRoleARN)
				.argument("operation-id", operationId)
	}

}


fun AmazonCloudFormationFunctions.updateTerminationProtection(enableTerminationProtection: Boolean, stackName: String, init: AmazonCloudFormationUpdateTerminationProtectionCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationUpdateTerminationProtectionCommand(enableTerminationProtection, stackName).apply(init))
}

@Generated
class AmazonCloudFormationUpdateTerminationProtectionCommand(val enableTerminationProtection: Boolean, val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest> {



	override fun build(): com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest {
		val input = com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest()
		input.setEnableTerminationProtection(this.enableTerminationProtection)
		input.setStackName(this.stackName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.updateTerminationProtection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation update-termination-protection")
				.option("enable-termination-protection", enableTerminationProtection ?: false)
				.argument("stack-name", stackName)
	}

}


fun AmazonCloudFormationFunctions.validateTemplate(init: AmazonCloudFormationValidateTemplateCommand.() -> Unit) {
	this.block.declare(AmazonCloudFormationValidateTemplateCommand().apply(init))
}

@Generated
class AmazonCloudFormationValidateTemplateCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ValidateTemplateRequest> {

	var templateBody: String? = null
	var templateURL: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ValidateTemplateRequest {
		val input = com.amazonaws.services.cloudformation.model.ValidateTemplateRequest()
		input.setTemplateBody(this.templateBody)
		input.setTemplateURL(this.templateURL)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudformation.validateTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation validate-template")
				.argument("template-body", templateBody)
				.argument("template-url", templateURL)
	}

}
