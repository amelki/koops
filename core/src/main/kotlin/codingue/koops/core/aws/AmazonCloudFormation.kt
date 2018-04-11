
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.cloudformation.AmazonCloudFormation
import com.amazonaws.services.cloudformation.AmazonCloudFormationClientBuilder
import com.amazonaws.services.cloudformation.model.*

var codingue.koops.core.Environment.cloudformation: AmazonCloudFormation
	get() {
		var service = this.capabilities[AmazonCloudFormation::class.java.name]
		if (service == null) {
			service = AmazonCloudFormationClientBuilder.standard().build()
			cloudformation = service
		}
		return service as AmazonCloudFormation
	}
	set(cloudformation) {
		this.capabilities[AmazonCloudFormation::class.java.name] = cloudformation
	}

@Generated
class AmazonCloudFormationFunctions(val block: Block)

infix fun <T> AwsContinuation.cloudformation(init: AmazonCloudFormationFunctions.() -> T): T {
	return AmazonCloudFormationFunctions(shell).run(init)
}

			

fun AmazonCloudFormationFunctions.cancelUpdateStack(stackName: String, init: AmazonCloudFormationCancelUpdateStackCommand.() -> Unit): com.amazonaws.services.cloudformation.model.CancelUpdateStackResult {
	return this.block.declare(AmazonCloudFormationCancelUpdateStackCommand(stackName).apply(init)) as com.amazonaws.services.cloudformation.model.CancelUpdateStackResult
}

@Generated
class AmazonCloudFormationCancelUpdateStackCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest, com.amazonaws.services.cloudformation.model.CancelUpdateStackResult> {

	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest {
		val input = com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest()
		input.setStackName(this.stackName)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.CancelUpdateStackResult {
	  return com.amazonaws.services.cloudformation.model.CancelUpdateStackResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.CancelUpdateStackResult {
		return environment.cloudformation.cancelUpdateStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation cancel-update-stack")
				.argument("stack-name", stackName)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AmazonCloudFormationFunctions.continueUpdateRollback(stackName: String, init: AmazonCloudFormationContinueUpdateRollbackCommand.() -> Unit): com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackResult {
	return this.block.declare(AmazonCloudFormationContinueUpdateRollbackCommand(stackName).apply(init)) as com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackResult
}

@Generated
class AmazonCloudFormationContinueUpdateRollbackCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackRequest, com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackResult {
	  return com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackResult {
		return environment.cloudformation.continueUpdateRollback(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation continue-update-rollback")
				.argument("stack-name", stackName)
				.argument("role-arn", roleARN)
				.argument("resources-to-skip", resourcesToSkip?.toString())
				.argument("client-request-token", clientRequestToken)
	}

}


fun AmazonCloudFormationFunctions.createChangeSet(stackName: String, changeSetName: String, init: AmazonCloudFormationCreateChangeSetCommand.() -> Unit): com.amazonaws.services.cloudformation.model.CreateChangeSetResult {
	return this.block.declare(AmazonCloudFormationCreateChangeSetCommand(stackName, changeSetName).apply(init)) as com.amazonaws.services.cloudformation.model.CreateChangeSetResult
}

@Generated
class AmazonCloudFormationCreateChangeSetCommand(val stackName: String, val changeSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.CreateChangeSetRequest, com.amazonaws.services.cloudformation.model.CreateChangeSetResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.CreateChangeSetResult {
	  return com.amazonaws.services.cloudformation.model.CreateChangeSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.CreateChangeSetResult {
		return environment.cloudformation.createChangeSet(build())
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


fun AmazonCloudFormationFunctions.createStack(stackName: String, init: AmazonCloudFormationCreateStackCommand.() -> Unit): com.amazonaws.services.cloudformation.model.CreateStackResult {
	return this.block.declare(AmazonCloudFormationCreateStackCommand(stackName).apply(init)) as com.amazonaws.services.cloudformation.model.CreateStackResult
}

@Generated
class AmazonCloudFormationCreateStackCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.CreateStackRequest, com.amazonaws.services.cloudformation.model.CreateStackResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.CreateStackResult {
	  return com.amazonaws.services.cloudformation.model.CreateStackResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.CreateStackResult {
		return environment.cloudformation.createStack(build())
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


fun AmazonCloudFormationFunctions.createStackInstances(stackSetName: String, accounts: List<String>, regions: List<String>, init: AmazonCloudFormationCreateStackInstancesCommand.() -> Unit): com.amazonaws.services.cloudformation.model.CreateStackInstancesResult {
	return this.block.declare(AmazonCloudFormationCreateStackInstancesCommand(stackSetName, accounts, regions).apply(init)) as com.amazonaws.services.cloudformation.model.CreateStackInstancesResult
}

@Generated
class AmazonCloudFormationCreateStackInstancesCommand(val stackSetName: String, val accounts: List<String>, val regions: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.CreateStackInstancesRequest, com.amazonaws.services.cloudformation.model.CreateStackInstancesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.CreateStackInstancesResult {
	  return com.amazonaws.services.cloudformation.model.CreateStackInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.CreateStackInstancesResult {
		return environment.cloudformation.createStackInstances(build())
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


fun AmazonCloudFormationFunctions.createStackSet(stackSetName: String, init: AmazonCloudFormationCreateStackSetCommand.() -> Unit): com.amazonaws.services.cloudformation.model.CreateStackSetResult {
	return this.block.declare(AmazonCloudFormationCreateStackSetCommand(stackSetName).apply(init)) as com.amazonaws.services.cloudformation.model.CreateStackSetResult
}

@Generated
class AmazonCloudFormationCreateStackSetCommand(val stackSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.CreateStackSetRequest, com.amazonaws.services.cloudformation.model.CreateStackSetResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.CreateStackSetResult {
	  return com.amazonaws.services.cloudformation.model.CreateStackSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.CreateStackSetResult {
		return environment.cloudformation.createStackSet(build())
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


fun AmazonCloudFormationFunctions.deleteChangeSet(changeSetName: String, init: AmazonCloudFormationDeleteChangeSetCommand.() -> Unit): com.amazonaws.services.cloudformation.model.DeleteChangeSetResult {
	return this.block.declare(AmazonCloudFormationDeleteChangeSetCommand(changeSetName).apply(init)) as com.amazonaws.services.cloudformation.model.DeleteChangeSetResult
}

@Generated
class AmazonCloudFormationDeleteChangeSetCommand(val changeSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest, com.amazonaws.services.cloudformation.model.DeleteChangeSetResult> {

	var stackName: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest {
		val input = com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest()
		input.setChangeSetName(this.changeSetName)
		input.setStackName(this.stackName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.DeleteChangeSetResult {
	  return com.amazonaws.services.cloudformation.model.DeleteChangeSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.DeleteChangeSetResult {
		return environment.cloudformation.deleteChangeSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation delete-change-set")
				.argument("change-set-name", changeSetName)
				.argument("stack-name", stackName)
	}

}


fun AmazonCloudFormationFunctions.deleteStack(stackName: String, init: AmazonCloudFormationDeleteStackCommand.() -> Unit): com.amazonaws.services.cloudformation.model.DeleteStackResult {
	return this.block.declare(AmazonCloudFormationDeleteStackCommand(stackName).apply(init)) as com.amazonaws.services.cloudformation.model.DeleteStackResult
}

@Generated
class AmazonCloudFormationDeleteStackCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DeleteStackRequest, com.amazonaws.services.cloudformation.model.DeleteStackResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.DeleteStackResult {
	  return com.amazonaws.services.cloudformation.model.DeleteStackResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.DeleteStackResult {
		return environment.cloudformation.deleteStack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation delete-stack")
				.argument("stack-name", stackName)
				.argument("retain-resources", retainResources?.toString())
				.argument("role-arn", roleARN)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AmazonCloudFormationFunctions.deleteStackInstances(stackSetName: String, accounts: List<String>, regions: List<String>, retainStacks: Boolean, init: AmazonCloudFormationDeleteStackInstancesCommand.() -> Unit): com.amazonaws.services.cloudformation.model.DeleteStackInstancesResult {
	return this.block.declare(AmazonCloudFormationDeleteStackInstancesCommand(stackSetName, accounts, regions, retainStacks).apply(init)) as com.amazonaws.services.cloudformation.model.DeleteStackInstancesResult
}

@Generated
class AmazonCloudFormationDeleteStackInstancesCommand(val stackSetName: String, val accounts: List<String>, val regions: List<String>, val retainStacks: Boolean) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DeleteStackInstancesRequest, com.amazonaws.services.cloudformation.model.DeleteStackInstancesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.DeleteStackInstancesResult {
	  return com.amazonaws.services.cloudformation.model.DeleteStackInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.DeleteStackInstancesResult {
		return environment.cloudformation.deleteStackInstances(build())
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


fun AmazonCloudFormationFunctions.deleteStackSet(stackSetName: String, init: AmazonCloudFormationDeleteStackSetCommand.() -> Unit): com.amazonaws.services.cloudformation.model.DeleteStackSetResult {
	return this.block.declare(AmazonCloudFormationDeleteStackSetCommand(stackSetName).apply(init)) as com.amazonaws.services.cloudformation.model.DeleteStackSetResult
}

@Generated
class AmazonCloudFormationDeleteStackSetCommand(val stackSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DeleteStackSetRequest, com.amazonaws.services.cloudformation.model.DeleteStackSetResult> {



	override fun build(): com.amazonaws.services.cloudformation.model.DeleteStackSetRequest {
		val input = com.amazonaws.services.cloudformation.model.DeleteStackSetRequest()
		input.setStackSetName(this.stackSetName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.DeleteStackSetResult {
	  return com.amazonaws.services.cloudformation.model.DeleteStackSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.DeleteStackSetResult {
		return environment.cloudformation.deleteStackSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation delete-stack-set")
				.argument("stack-set-name", stackSetName)
	}

}


fun AmazonCloudFormationFunctions.describeAccountLimits(init: AmazonCloudFormationDescribeAccountLimitsCommand.() -> Unit): com.amazonaws.services.cloudformation.model.DescribeAccountLimitsResult {
	return this.block.declare(AmazonCloudFormationDescribeAccountLimitsCommand().apply(init)) as com.amazonaws.services.cloudformation.model.DescribeAccountLimitsResult
}

@Generated
class AmazonCloudFormationDescribeAccountLimitsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest, com.amazonaws.services.cloudformation.model.DescribeAccountLimitsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.DescribeAccountLimitsResult {
	  return com.amazonaws.services.cloudformation.model.DescribeAccountLimitsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.DescribeAccountLimitsResult {
		return environment.cloudformation.describeAccountLimits(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-account-limits")
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudFormationFunctions.describeChangeSet(changeSetName: String, init: AmazonCloudFormationDescribeChangeSetCommand.() -> Unit): com.amazonaws.services.cloudformation.model.DescribeChangeSetResult {
	return this.block.declare(AmazonCloudFormationDescribeChangeSetCommand(changeSetName).apply(init)) as com.amazonaws.services.cloudformation.model.DescribeChangeSetResult
}

@Generated
class AmazonCloudFormationDescribeChangeSetCommand(val changeSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest, com.amazonaws.services.cloudformation.model.DescribeChangeSetResult> {

	var stackName: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest()
		input.setChangeSetName(this.changeSetName)
		input.setStackName(this.stackName)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.DescribeChangeSetResult {
	  return com.amazonaws.services.cloudformation.model.DescribeChangeSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.DescribeChangeSetResult {
		return environment.cloudformation.describeChangeSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-change-set")
				.argument("change-set-name", changeSetName)
				.argument("stack-name", stackName)
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudFormationFunctions.describeStackEvents(init: AmazonCloudFormationDescribeStackEventsCommand.() -> Unit): com.amazonaws.services.cloudformation.model.DescribeStackEventsResult {
	return this.block.declare(AmazonCloudFormationDescribeStackEventsCommand().apply(init)) as com.amazonaws.services.cloudformation.model.DescribeStackEventsResult
}

@Generated
class AmazonCloudFormationDescribeStackEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest, com.amazonaws.services.cloudformation.model.DescribeStackEventsResult> {

	var stackName: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest()
		input.setStackName(this.stackName)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.DescribeStackEventsResult {
	  return com.amazonaws.services.cloudformation.model.DescribeStackEventsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.DescribeStackEventsResult {
		return environment.cloudformation.describeStackEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-stack-events")
				.argument("stack-name", stackName)
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudFormationFunctions.describeStackInstance(stackSetName: String, stackInstanceAccount: String, stackInstanceRegion: String, init: AmazonCloudFormationDescribeStackInstanceCommand.() -> Unit): com.amazonaws.services.cloudformation.model.DescribeStackInstanceResult {
	return this.block.declare(AmazonCloudFormationDescribeStackInstanceCommand(stackSetName, stackInstanceAccount, stackInstanceRegion).apply(init)) as com.amazonaws.services.cloudformation.model.DescribeStackInstanceResult
}

@Generated
class AmazonCloudFormationDescribeStackInstanceCommand(val stackSetName: String, val stackInstanceAccount: String, val stackInstanceRegion: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest, com.amazonaws.services.cloudformation.model.DescribeStackInstanceResult> {



	override fun build(): com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest()
		input.setStackSetName(this.stackSetName)
		input.setStackInstanceAccount(this.stackInstanceAccount)
		input.setStackInstanceRegion(this.stackInstanceRegion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.DescribeStackInstanceResult {
	  return com.amazonaws.services.cloudformation.model.DescribeStackInstanceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.DescribeStackInstanceResult {
		return environment.cloudformation.describeStackInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-stack-instance")
				.argument("stack-set-name", stackSetName)
				.argument("stack-instance-account", stackInstanceAccount)
				.argument("stack-instance-region", stackInstanceRegion)
	}

}


fun AmazonCloudFormationFunctions.describeStackResource(stackName: String, logicalResourceId: String, init: AmazonCloudFormationDescribeStackResourceCommand.() -> Unit): com.amazonaws.services.cloudformation.model.DescribeStackResourceResult {
	return this.block.declare(AmazonCloudFormationDescribeStackResourceCommand(stackName, logicalResourceId).apply(init)) as com.amazonaws.services.cloudformation.model.DescribeStackResourceResult
}

@Generated
class AmazonCloudFormationDescribeStackResourceCommand(val stackName: String, val logicalResourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest, com.amazonaws.services.cloudformation.model.DescribeStackResourceResult> {



	override fun build(): com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest()
		input.setStackName(this.stackName)
		input.setLogicalResourceId(this.logicalResourceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.DescribeStackResourceResult {
	  return com.amazonaws.services.cloudformation.model.DescribeStackResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.DescribeStackResourceResult {
		return environment.cloudformation.describeStackResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-stack-resource")
				.argument("stack-name", stackName)
				.argument("logical-resource-id", logicalResourceId)
	}

}


fun AmazonCloudFormationFunctions.describeStackResources(init: AmazonCloudFormationDescribeStackResourcesCommand.() -> Unit): com.amazonaws.services.cloudformation.model.DescribeStackResourcesResult {
	return this.block.declare(AmazonCloudFormationDescribeStackResourcesCommand().apply(init)) as com.amazonaws.services.cloudformation.model.DescribeStackResourcesResult
}

@Generated
class AmazonCloudFormationDescribeStackResourcesCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest, com.amazonaws.services.cloudformation.model.DescribeStackResourcesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.DescribeStackResourcesResult {
	  return com.amazonaws.services.cloudformation.model.DescribeStackResourcesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.DescribeStackResourcesResult {
		return environment.cloudformation.describeStackResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-stack-resources")
				.argument("stack-name", stackName)
				.argument("logical-resource-id", logicalResourceId)
				.argument("physical-resource-id", physicalResourceId)
	}

}


fun AmazonCloudFormationFunctions.describeStackSet(stackSetName: String, init: AmazonCloudFormationDescribeStackSetCommand.() -> Unit): com.amazonaws.services.cloudformation.model.DescribeStackSetResult {
	return this.block.declare(AmazonCloudFormationDescribeStackSetCommand(stackSetName).apply(init)) as com.amazonaws.services.cloudformation.model.DescribeStackSetResult
}

@Generated
class AmazonCloudFormationDescribeStackSetCommand(val stackSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeStackSetRequest, com.amazonaws.services.cloudformation.model.DescribeStackSetResult> {



	override fun build(): com.amazonaws.services.cloudformation.model.DescribeStackSetRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeStackSetRequest()
		input.setStackSetName(this.stackSetName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.DescribeStackSetResult {
	  return com.amazonaws.services.cloudformation.model.DescribeStackSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.DescribeStackSetResult {
		return environment.cloudformation.describeStackSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-stack-set")
				.argument("stack-set-name", stackSetName)
	}

}


fun AmazonCloudFormationFunctions.describeStackSetOperation(stackSetName: String, operationId: String, init: AmazonCloudFormationDescribeStackSetOperationCommand.() -> Unit): com.amazonaws.services.cloudformation.model.DescribeStackSetOperationResult {
	return this.block.declare(AmazonCloudFormationDescribeStackSetOperationCommand(stackSetName, operationId).apply(init)) as com.amazonaws.services.cloudformation.model.DescribeStackSetOperationResult
}

@Generated
class AmazonCloudFormationDescribeStackSetOperationCommand(val stackSetName: String, val operationId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest, com.amazonaws.services.cloudformation.model.DescribeStackSetOperationResult> {



	override fun build(): com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest()
		input.setStackSetName(this.stackSetName)
		input.setOperationId(this.operationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.DescribeStackSetOperationResult {
	  return com.amazonaws.services.cloudformation.model.DescribeStackSetOperationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.DescribeStackSetOperationResult {
		return environment.cloudformation.describeStackSetOperation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-stack-set-operation")
				.argument("stack-set-name", stackSetName)
				.argument("operation-id", operationId)
	}

}


fun AmazonCloudFormationFunctions.describeStacks(init: AmazonCloudFormationDescribeStacksCommand.() -> Unit): com.amazonaws.services.cloudformation.model.DescribeStacksResult {
	return this.block.declare(AmazonCloudFormationDescribeStacksCommand().apply(init)) as com.amazonaws.services.cloudformation.model.DescribeStacksResult
}

@Generated
class AmazonCloudFormationDescribeStacksCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.DescribeStacksRequest, com.amazonaws.services.cloudformation.model.DescribeStacksResult> {

	var stackName: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.DescribeStacksRequest {
		val input = com.amazonaws.services.cloudformation.model.DescribeStacksRequest()
		input.setStackName(this.stackName)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.DescribeStacksResult {
	  return com.amazonaws.services.cloudformation.model.DescribeStacksResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.DescribeStacksResult {
		return environment.cloudformation.describeStacks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation describe-stacks")
				.argument("stack-name", stackName)
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudFormationFunctions.estimateTemplateCost(init: AmazonCloudFormationEstimateTemplateCostCommand.() -> Unit): com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult {
	return this.block.declare(AmazonCloudFormationEstimateTemplateCostCommand().apply(init)) as com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult
}

@Generated
class AmazonCloudFormationEstimateTemplateCostCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.EstimateTemplateCostRequest, com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult {
	  return com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult {
		return environment.cloudformation.estimateTemplateCost(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation estimate-template-cost")
				.argument("template-body", templateBody)
				.argument("template-url", templateURL)
				.argument("parameters", parameters?.toString())
	}

}


fun AmazonCloudFormationFunctions.executeChangeSet(changeSetName: String, init: AmazonCloudFormationExecuteChangeSetCommand.() -> Unit): com.amazonaws.services.cloudformation.model.ExecuteChangeSetResult {
	return this.block.declare(AmazonCloudFormationExecuteChangeSetCommand(changeSetName).apply(init)) as com.amazonaws.services.cloudformation.model.ExecuteChangeSetResult
}

@Generated
class AmazonCloudFormationExecuteChangeSetCommand(val changeSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest, com.amazonaws.services.cloudformation.model.ExecuteChangeSetResult> {

	var stackName: String? = null
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest {
		val input = com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest()
		input.setChangeSetName(this.changeSetName)
		input.setStackName(this.stackName)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.ExecuteChangeSetResult {
	  return com.amazonaws.services.cloudformation.model.ExecuteChangeSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.ExecuteChangeSetResult {
		return environment.cloudformation.executeChangeSet(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation execute-change-set")
				.argument("change-set-name", changeSetName)
				.argument("stack-name", stackName)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AmazonCloudFormationFunctions.getStackPolicy(stackName: String, init: AmazonCloudFormationGetStackPolicyCommand.() -> Unit): com.amazonaws.services.cloudformation.model.GetStackPolicyResult {
	return this.block.declare(AmazonCloudFormationGetStackPolicyCommand(stackName).apply(init)) as com.amazonaws.services.cloudformation.model.GetStackPolicyResult
}

@Generated
class AmazonCloudFormationGetStackPolicyCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.GetStackPolicyRequest, com.amazonaws.services.cloudformation.model.GetStackPolicyResult> {



	override fun build(): com.amazonaws.services.cloudformation.model.GetStackPolicyRequest {
		val input = com.amazonaws.services.cloudformation.model.GetStackPolicyRequest()
		input.setStackName(this.stackName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.GetStackPolicyResult {
	  return com.amazonaws.services.cloudformation.model.GetStackPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.GetStackPolicyResult {
		return environment.cloudformation.getStackPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation get-stack-policy")
				.argument("stack-name", stackName)
	}

}


fun AmazonCloudFormationFunctions.getTemplate(init: AmazonCloudFormationGetTemplateCommand.() -> Unit): com.amazonaws.services.cloudformation.model.GetTemplateResult {
	return this.block.declare(AmazonCloudFormationGetTemplateCommand().apply(init)) as com.amazonaws.services.cloudformation.model.GetTemplateResult
}

@Generated
class AmazonCloudFormationGetTemplateCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.GetTemplateRequest, com.amazonaws.services.cloudformation.model.GetTemplateResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.GetTemplateResult {
	  return com.amazonaws.services.cloudformation.model.GetTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.GetTemplateResult {
		return environment.cloudformation.getTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation get-template")
				.argument("stack-name", stackName)
				.argument("change-set-name", changeSetName)
				.argument("template-stage", templateStage?.toString())
	}

}


fun AmazonCloudFormationFunctions.getTemplateSummary(init: AmazonCloudFormationGetTemplateSummaryCommand.() -> Unit): com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult {
	return this.block.declare(AmazonCloudFormationGetTemplateSummaryCommand().apply(init)) as com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult
}

@Generated
class AmazonCloudFormationGetTemplateSummaryCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest, com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult {
	  return com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult {
		return environment.cloudformation.getTemplateSummary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation get-template-summary")
				.argument("template-body", templateBody)
				.argument("template-url", templateURL)
				.argument("stack-name", stackName)
				.argument("stack-set-name", stackSetName)
	}

}


fun AmazonCloudFormationFunctions.listChangeSets(stackName: String, init: AmazonCloudFormationListChangeSetsCommand.() -> Unit): com.amazonaws.services.cloudformation.model.ListChangeSetsResult {
	return this.block.declare(AmazonCloudFormationListChangeSetsCommand(stackName).apply(init)) as com.amazonaws.services.cloudformation.model.ListChangeSetsResult
}

@Generated
class AmazonCloudFormationListChangeSetsCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListChangeSetsRequest, com.amazonaws.services.cloudformation.model.ListChangeSetsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ListChangeSetsRequest {
		val input = com.amazonaws.services.cloudformation.model.ListChangeSetsRequest()
		input.setStackName(this.stackName)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.ListChangeSetsResult {
	  return com.amazonaws.services.cloudformation.model.ListChangeSetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.ListChangeSetsResult {
		return environment.cloudformation.listChangeSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-change-sets")
				.argument("stack-name", stackName)
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudFormationFunctions.listExports(init: AmazonCloudFormationListExportsCommand.() -> Unit): com.amazonaws.services.cloudformation.model.ListExportsResult {
	return this.block.declare(AmazonCloudFormationListExportsCommand().apply(init)) as com.amazonaws.services.cloudformation.model.ListExportsResult
}

@Generated
class AmazonCloudFormationListExportsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListExportsRequest, com.amazonaws.services.cloudformation.model.ListExportsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ListExportsRequest {
		val input = com.amazonaws.services.cloudformation.model.ListExportsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.ListExportsResult {
	  return com.amazonaws.services.cloudformation.model.ListExportsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.ListExportsResult {
		return environment.cloudformation.listExports(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-exports")
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudFormationFunctions.listImports(exportName: String, init: AmazonCloudFormationListImportsCommand.() -> Unit): com.amazonaws.services.cloudformation.model.ListImportsResult {
	return this.block.declare(AmazonCloudFormationListImportsCommand(exportName).apply(init)) as com.amazonaws.services.cloudformation.model.ListImportsResult
}

@Generated
class AmazonCloudFormationListImportsCommand(val exportName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListImportsRequest, com.amazonaws.services.cloudformation.model.ListImportsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ListImportsRequest {
		val input = com.amazonaws.services.cloudformation.model.ListImportsRequest()
		input.setExportName(this.exportName)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.ListImportsResult {
	  return com.amazonaws.services.cloudformation.model.ListImportsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.ListImportsResult {
		return environment.cloudformation.listImports(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-imports")
				.argument("export-name", exportName)
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudFormationFunctions.listStackInstances(stackSetName: String, init: AmazonCloudFormationListStackInstancesCommand.() -> Unit): com.amazonaws.services.cloudformation.model.ListStackInstancesResult {
	return this.block.declare(AmazonCloudFormationListStackInstancesCommand(stackSetName).apply(init)) as com.amazonaws.services.cloudformation.model.ListStackInstancesResult
}

@Generated
class AmazonCloudFormationListStackInstancesCommand(val stackSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListStackInstancesRequest, com.amazonaws.services.cloudformation.model.ListStackInstancesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.ListStackInstancesResult {
	  return com.amazonaws.services.cloudformation.model.ListStackInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.ListStackInstancesResult {
		return environment.cloudformation.listStackInstances(build())
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


fun AmazonCloudFormationFunctions.listStackResources(stackName: String, init: AmazonCloudFormationListStackResourcesCommand.() -> Unit): com.amazonaws.services.cloudformation.model.ListStackResourcesResult {
	return this.block.declare(AmazonCloudFormationListStackResourcesCommand(stackName).apply(init)) as com.amazonaws.services.cloudformation.model.ListStackResourcesResult
}

@Generated
class AmazonCloudFormationListStackResourcesCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListStackResourcesRequest, com.amazonaws.services.cloudformation.model.ListStackResourcesResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ListStackResourcesRequest {
		val input = com.amazonaws.services.cloudformation.model.ListStackResourcesRequest()
		input.setStackName(this.stackName)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.ListStackResourcesResult {
	  return com.amazonaws.services.cloudformation.model.ListStackResourcesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.ListStackResourcesResult {
		return environment.cloudformation.listStackResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-stack-resources")
				.argument("stack-name", stackName)
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudFormationFunctions.listStackSetOperationResults(stackSetName: String, operationId: String, init: AmazonCloudFormationListStackSetOperationResultsCommand.() -> Unit): com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsResult {
	return this.block.declare(AmazonCloudFormationListStackSetOperationResultsCommand(stackSetName, operationId).apply(init)) as com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsResult
}

@Generated
class AmazonCloudFormationListStackSetOperationResultsCommand(val stackSetName: String, val operationId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsRequest, com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsResult {
	  return com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsResult {
		return environment.cloudformation.listStackSetOperationResults(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-stack-set-operation-results")
				.argument("stack-set-name", stackSetName)
				.argument("operation-id", operationId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudFormationFunctions.listStackSetOperations(stackSetName: String, init: AmazonCloudFormationListStackSetOperationsCommand.() -> Unit): com.amazonaws.services.cloudformation.model.ListStackSetOperationsResult {
	return this.block.declare(AmazonCloudFormationListStackSetOperationsCommand(stackSetName).apply(init)) as com.amazonaws.services.cloudformation.model.ListStackSetOperationsResult
}

@Generated
class AmazonCloudFormationListStackSetOperationsCommand(val stackSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest, com.amazonaws.services.cloudformation.model.ListStackSetOperationsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest {
		val input = com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest()
		input.setStackSetName(this.stackSetName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.ListStackSetOperationsResult {
	  return com.amazonaws.services.cloudformation.model.ListStackSetOperationsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.ListStackSetOperationsResult {
		return environment.cloudformation.listStackSetOperations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-stack-set-operations")
				.argument("stack-set-name", stackSetName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonCloudFormationFunctions.listStackSets(init: AmazonCloudFormationListStackSetsCommand.() -> Unit): com.amazonaws.services.cloudformation.model.ListStackSetsResult {
	return this.block.declare(AmazonCloudFormationListStackSetsCommand().apply(init)) as com.amazonaws.services.cloudformation.model.ListStackSetsResult
}

@Generated
class AmazonCloudFormationListStackSetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListStackSetsRequest, com.amazonaws.services.cloudformation.model.ListStackSetsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.ListStackSetsResult {
	  return com.amazonaws.services.cloudformation.model.ListStackSetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.ListStackSetsResult {
		return environment.cloudformation.listStackSets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-stack-sets")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("status", status?.toString())
	}

}


fun AmazonCloudFormationFunctions.listStacks(init: AmazonCloudFormationListStacksCommand.() -> Unit): com.amazonaws.services.cloudformation.model.ListStacksResult {
	return this.block.declare(AmazonCloudFormationListStacksCommand().apply(init)) as com.amazonaws.services.cloudformation.model.ListStacksResult
}

@Generated
class AmazonCloudFormationListStacksCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ListStacksRequest, com.amazonaws.services.cloudformation.model.ListStacksResult> {

	var nextToken: String? = null
	var stackStatusFilters: List<StackStatus>? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ListStacksRequest {
		val input = com.amazonaws.services.cloudformation.model.ListStacksRequest()
		input.setNextToken(this.nextToken)
		input.setStackStatusFilters(this.stackStatusFilters?.map { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.ListStacksResult {
	  return com.amazonaws.services.cloudformation.model.ListStacksResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.ListStacksResult {
		return environment.cloudformation.listStacks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation list-stacks")
				.argument("next-token", nextToken)
				.argument("stack-status-filters", stackStatusFilters?.toString())
	}

}


fun AmazonCloudFormationFunctions.setStackPolicy(stackName: String, init: AmazonCloudFormationSetStackPolicyCommand.() -> Unit): com.amazonaws.services.cloudformation.model.SetStackPolicyResult {
	return this.block.declare(AmazonCloudFormationSetStackPolicyCommand(stackName).apply(init)) as com.amazonaws.services.cloudformation.model.SetStackPolicyResult
}

@Generated
class AmazonCloudFormationSetStackPolicyCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.SetStackPolicyRequest, com.amazonaws.services.cloudformation.model.SetStackPolicyResult> {

	var stackPolicyBody: String? = null
	var stackPolicyURL: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.SetStackPolicyRequest {
		val input = com.amazonaws.services.cloudformation.model.SetStackPolicyRequest()
		input.setStackName(this.stackName)
		input.setStackPolicyBody(this.stackPolicyBody)
		input.setStackPolicyURL(this.stackPolicyURL)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.SetStackPolicyResult {
	  return com.amazonaws.services.cloudformation.model.SetStackPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.SetStackPolicyResult {
		return environment.cloudformation.setStackPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation set-stack-policy")
				.argument("stack-name", stackName)
				.argument("stack-policy-body", stackPolicyBody)
				.argument("stack-policy-url", stackPolicyURL)
	}

}


fun AmazonCloudFormationFunctions.signalResource(stackName: String, logicalResourceId: String, uniqueId: String, status: ResourceSignalStatus, init: AmazonCloudFormationSignalResourceCommand.() -> Unit): com.amazonaws.services.cloudformation.model.SignalResourceResult {
	return this.block.declare(AmazonCloudFormationSignalResourceCommand(stackName, logicalResourceId, uniqueId, status).apply(init)) as com.amazonaws.services.cloudformation.model.SignalResourceResult
}

@Generated
class AmazonCloudFormationSignalResourceCommand(val stackName: String, val logicalResourceId: String, val uniqueId: String, val status: ResourceSignalStatus) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.SignalResourceRequest, com.amazonaws.services.cloudformation.model.SignalResourceResult> {



	override fun build(): com.amazonaws.services.cloudformation.model.SignalResourceRequest {
		val input = com.amazonaws.services.cloudformation.model.SignalResourceRequest()
		input.setStackName(this.stackName)
		input.setLogicalResourceId(this.logicalResourceId)
		input.setUniqueId(this.uniqueId)
		input.setStatus(this.status.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.SignalResourceResult {
	  return com.amazonaws.services.cloudformation.model.SignalResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.SignalResourceResult {
		return environment.cloudformation.signalResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation signal-resource")
				.argument("stack-name", stackName)
				.argument("logical-resource-id", logicalResourceId)
				.argument("unique-id", uniqueId)
				.argument("status", status.toString())
	}

}


fun AmazonCloudFormationFunctions.stopStackSetOperation(stackSetName: String, operationId: String, init: AmazonCloudFormationStopStackSetOperationCommand.() -> Unit): com.amazonaws.services.cloudformation.model.StopStackSetOperationResult {
	return this.block.declare(AmazonCloudFormationStopStackSetOperationCommand(stackSetName, operationId).apply(init)) as com.amazonaws.services.cloudformation.model.StopStackSetOperationResult
}

@Generated
class AmazonCloudFormationStopStackSetOperationCommand(val stackSetName: String, val operationId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest, com.amazonaws.services.cloudformation.model.StopStackSetOperationResult> {



	override fun build(): com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest {
		val input = com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest()
		input.setStackSetName(this.stackSetName)
		input.setOperationId(this.operationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.StopStackSetOperationResult {
	  return com.amazonaws.services.cloudformation.model.StopStackSetOperationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.StopStackSetOperationResult {
		return environment.cloudformation.stopStackSetOperation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation stop-stack-set-operation")
				.argument("stack-set-name", stackSetName)
				.argument("operation-id", operationId)
	}

}


fun AmazonCloudFormationFunctions.updateStack(stackName: String, init: AmazonCloudFormationUpdateStackCommand.() -> Unit): com.amazonaws.services.cloudformation.model.UpdateStackResult {
	return this.block.declare(AmazonCloudFormationUpdateStackCommand(stackName).apply(init)) as com.amazonaws.services.cloudformation.model.UpdateStackResult
}

@Generated
class AmazonCloudFormationUpdateStackCommand(val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.UpdateStackRequest, com.amazonaws.services.cloudformation.model.UpdateStackResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.UpdateStackResult {
	  return com.amazonaws.services.cloudformation.model.UpdateStackResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.UpdateStackResult {
		return environment.cloudformation.updateStack(build())
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


fun AmazonCloudFormationFunctions.updateStackInstances(stackSetName: String, accounts: List<String>, regions: List<String>, init: AmazonCloudFormationUpdateStackInstancesCommand.() -> Unit): com.amazonaws.services.cloudformation.model.UpdateStackInstancesResult {
	return this.block.declare(AmazonCloudFormationUpdateStackInstancesCommand(stackSetName, accounts, regions).apply(init)) as com.amazonaws.services.cloudformation.model.UpdateStackInstancesResult
}

@Generated
class AmazonCloudFormationUpdateStackInstancesCommand(val stackSetName: String, val accounts: List<String>, val regions: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.UpdateStackInstancesRequest, com.amazonaws.services.cloudformation.model.UpdateStackInstancesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.UpdateStackInstancesResult {
	  return com.amazonaws.services.cloudformation.model.UpdateStackInstancesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.UpdateStackInstancesResult {
		return environment.cloudformation.updateStackInstances(build())
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


fun AmazonCloudFormationFunctions.updateStackSet(stackSetName: String, init: AmazonCloudFormationUpdateStackSetCommand.() -> Unit): com.amazonaws.services.cloudformation.model.UpdateStackSetResult {
	return this.block.declare(AmazonCloudFormationUpdateStackSetCommand(stackSetName).apply(init)) as com.amazonaws.services.cloudformation.model.UpdateStackSetResult
}

@Generated
class AmazonCloudFormationUpdateStackSetCommand(val stackSetName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.UpdateStackSetRequest, com.amazonaws.services.cloudformation.model.UpdateStackSetResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.UpdateStackSetResult {
	  return com.amazonaws.services.cloudformation.model.UpdateStackSetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.UpdateStackSetResult {
		return environment.cloudformation.updateStackSet(build())
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


fun AmazonCloudFormationFunctions.updateTerminationProtection(enableTerminationProtection: Boolean, stackName: String, init: AmazonCloudFormationUpdateTerminationProtectionCommand.() -> Unit): com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionResult {
	return this.block.declare(AmazonCloudFormationUpdateTerminationProtectionCommand(enableTerminationProtection, stackName).apply(init)) as com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionResult
}

@Generated
class AmazonCloudFormationUpdateTerminationProtectionCommand(val enableTerminationProtection: Boolean, val stackName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest, com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionResult> {



	override fun build(): com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest {
		val input = com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest()
		input.setEnableTerminationProtection(this.enableTerminationProtection)
		input.setStackName(this.stackName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionResult {
	  return com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionResult {
		return environment.cloudformation.updateTerminationProtection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation update-termination-protection")
				.option("enable-termination-protection", enableTerminationProtection ?: false)
				.argument("stack-name", stackName)
	}

}


fun AmazonCloudFormationFunctions.validateTemplate(init: AmazonCloudFormationValidateTemplateCommand.() -> Unit): com.amazonaws.services.cloudformation.model.ValidateTemplateResult {
	return this.block.declare(AmazonCloudFormationValidateTemplateCommand().apply(init)) as com.amazonaws.services.cloudformation.model.ValidateTemplateResult
}

@Generated
class AmazonCloudFormationValidateTemplateCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudformation.model.ValidateTemplateRequest, com.amazonaws.services.cloudformation.model.ValidateTemplateResult> {

	var templateBody: String? = null
	var templateURL: String? = null

	override fun build(): com.amazonaws.services.cloudformation.model.ValidateTemplateRequest {
		val input = com.amazonaws.services.cloudformation.model.ValidateTemplateRequest()
		input.setTemplateBody(this.templateBody)
		input.setTemplateURL(this.templateURL)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudformation.model.ValidateTemplateResult {
	  return com.amazonaws.services.cloudformation.model.ValidateTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudformation.model.ValidateTemplateResult {
		return environment.cloudformation.validateTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudformation validate-template")
				.argument("template-body", templateBody)
				.argument("template-url", templateURL)
	}

}
