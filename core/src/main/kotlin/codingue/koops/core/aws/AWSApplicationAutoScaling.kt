
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.applicationautoscaling.AWSApplicationAutoScaling
import com.amazonaws.services.applicationautoscaling.model.*

var codingue.koops.core.Environment.application_autoscaling: AWSApplicationAutoScaling
	get() = this.capabilities[AWSApplicationAutoScaling::class.java.name] as AWSApplicationAutoScaling
	set(application_autoscaling) {
		this.capabilities[AWSApplicationAutoScaling::class.java.name] = application_autoscaling
	}

@Generated
class AWSApplicationAutoScalingFunctions(val block: Block)

infix fun AwsContinuation.application_autoscaling(init: AWSApplicationAutoScalingFunctions.() -> Unit) {
	AWSApplicationAutoScalingFunctions(shell).apply(init)
}

			

fun AWSApplicationAutoScalingFunctions.deleteScalingPolicy(policyName: String, serviceNamespace: ServiceNamespace, resourceId: String, scalableDimension: ScalableDimension, init: AWSApplicationAutoScalingDeleteScalingPolicyCommand.() -> Unit) {
	this.block.declare(AWSApplicationAutoScalingDeleteScalingPolicyCommand(policyName, serviceNamespace, resourceId, scalableDimension).apply(init))
}

@Generated
class AWSApplicationAutoScalingDeleteScalingPolicyCommand(val policyName: String, val serviceNamespace: ServiceNamespace, val resourceId: String, val scalableDimension: ScalableDimension) : AmazonWebServiceCommand<com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyRequest> {



	override fun build(): com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyRequest {
		val input = com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyRequest()
		input.setPolicyName(this.policyName)
		input.setServiceNamespace(this.serviceNamespace.toString())
		input.setResourceId(this.resourceId)
		input.setScalableDimension(this.scalableDimension.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.application_autoscaling.deleteScalingPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws application-autoscaling delete-scaling-policy")
				.argument("policy-name", policyName)
				.argument("service-namespace", serviceNamespace.toString())
				.argument("resource-id", resourceId)
				.argument("scalable-dimension", scalableDimension.toString())
	}

}


fun AWSApplicationAutoScalingFunctions.deleteScheduledAction(serviceNamespace: ServiceNamespace, scheduledActionName: String, resourceId: String, init: AWSApplicationAutoScalingDeleteScheduledActionCommand.() -> Unit) {
	this.block.declare(AWSApplicationAutoScalingDeleteScheduledActionCommand(serviceNamespace, scheduledActionName, resourceId).apply(init))
}

@Generated
class AWSApplicationAutoScalingDeleteScheduledActionCommand(val serviceNamespace: ServiceNamespace, val scheduledActionName: String, val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionRequest> {

	var scalableDimension: ScalableDimension? = null

	override fun build(): com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionRequest {
		val input = com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionRequest()
		input.setServiceNamespace(this.serviceNamespace.toString())
		input.setScheduledActionName(this.scheduledActionName)
		input.setResourceId(this.resourceId)
		input.setScalableDimension(this.scalableDimension?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.application_autoscaling.deleteScheduledAction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws application-autoscaling delete-scheduled-action")
				.argument("service-namespace", serviceNamespace.toString())
				.argument("scheduled-action-name", scheduledActionName)
				.argument("resource-id", resourceId)
				.argument("scalable-dimension", scalableDimension?.toString())
	}

}


fun AWSApplicationAutoScalingFunctions.deregisterScalableTarget(serviceNamespace: ServiceNamespace, resourceId: String, scalableDimension: ScalableDimension, init: AWSApplicationAutoScalingDeregisterScalableTargetCommand.() -> Unit) {
	this.block.declare(AWSApplicationAutoScalingDeregisterScalableTargetCommand(serviceNamespace, resourceId, scalableDimension).apply(init))
}

@Generated
class AWSApplicationAutoScalingDeregisterScalableTargetCommand(val serviceNamespace: ServiceNamespace, val resourceId: String, val scalableDimension: ScalableDimension) : AmazonWebServiceCommand<com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetRequest> {



	override fun build(): com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetRequest {
		val input = com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetRequest()
		input.setServiceNamespace(this.serviceNamespace.toString())
		input.setResourceId(this.resourceId)
		input.setScalableDimension(this.scalableDimension.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.application_autoscaling.deregisterScalableTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws application-autoscaling deregister-scalable-target")
				.argument("service-namespace", serviceNamespace.toString())
				.argument("resource-id", resourceId)
				.argument("scalable-dimension", scalableDimension.toString())
	}

}


fun AWSApplicationAutoScalingFunctions.describeScalableTargets(serviceNamespace: ServiceNamespace, init: AWSApplicationAutoScalingDescribeScalableTargetsCommand.() -> Unit) {
	this.block.declare(AWSApplicationAutoScalingDescribeScalableTargetsCommand(serviceNamespace).apply(init))
}

@Generated
class AWSApplicationAutoScalingDescribeScalableTargetsCommand(val serviceNamespace: ServiceNamespace) : AmazonWebServiceCommand<com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsRequest> {

	var resourceIds: List<String>? = null
	var scalableDimension: ScalableDimension? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsRequest {
		val input = com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsRequest()
		input.setServiceNamespace(this.serviceNamespace.toString())
		input.setResourceIds(this.resourceIds)
		input.setScalableDimension(this.scalableDimension?.toString())
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.application_autoscaling.describeScalableTargets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws application-autoscaling describe-scalable-targets")
				.argument("service-namespace", serviceNamespace.toString())
				.argument("resource-ids", resourceIds?.toString())
				.argument("scalable-dimension", scalableDimension?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSApplicationAutoScalingFunctions.describeScalingActivities(serviceNamespace: ServiceNamespace, init: AWSApplicationAutoScalingDescribeScalingActivitiesCommand.() -> Unit) {
	this.block.declare(AWSApplicationAutoScalingDescribeScalingActivitiesCommand(serviceNamespace).apply(init))
}

@Generated
class AWSApplicationAutoScalingDescribeScalingActivitiesCommand(val serviceNamespace: ServiceNamespace) : AmazonWebServiceCommand<com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesRequest> {

	var resourceId: String? = null
	var scalableDimension: ScalableDimension? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesRequest {
		val input = com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesRequest()
		input.setServiceNamespace(this.serviceNamespace.toString())
		input.setResourceId(this.resourceId)
		input.setScalableDimension(this.scalableDimension?.toString())
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.application_autoscaling.describeScalingActivities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws application-autoscaling describe-scaling-activities")
				.argument("service-namespace", serviceNamespace.toString())
				.argument("resource-id", resourceId)
				.argument("scalable-dimension", scalableDimension?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSApplicationAutoScalingFunctions.describeScalingPolicies(serviceNamespace: ServiceNamespace, init: AWSApplicationAutoScalingDescribeScalingPoliciesCommand.() -> Unit) {
	this.block.declare(AWSApplicationAutoScalingDescribeScalingPoliciesCommand(serviceNamespace).apply(init))
}

@Generated
class AWSApplicationAutoScalingDescribeScalingPoliciesCommand(val serviceNamespace: ServiceNamespace) : AmazonWebServiceCommand<com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesRequest> {

	var policyNames: List<String>? = null
	var resourceId: String? = null
	var scalableDimension: ScalableDimension? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesRequest {
		val input = com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesRequest()
		input.setPolicyNames(this.policyNames)
		input.setServiceNamespace(this.serviceNamespace.toString())
		input.setResourceId(this.resourceId)
		input.setScalableDimension(this.scalableDimension?.toString())
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.application_autoscaling.describeScalingPolicies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws application-autoscaling describe-scaling-policies")
				.argument("policy-names", policyNames?.toString())
				.argument("service-namespace", serviceNamespace.toString())
				.argument("resource-id", resourceId)
				.argument("scalable-dimension", scalableDimension?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSApplicationAutoScalingFunctions.describeScheduledActions(serviceNamespace: ServiceNamespace, init: AWSApplicationAutoScalingDescribeScheduledActionsCommand.() -> Unit) {
	this.block.declare(AWSApplicationAutoScalingDescribeScheduledActionsCommand(serviceNamespace).apply(init))
}

@Generated
class AWSApplicationAutoScalingDescribeScheduledActionsCommand(val serviceNamespace: ServiceNamespace) : AmazonWebServiceCommand<com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsRequest> {

	var scheduledActionNames: List<String>? = null
	var resourceId: String? = null
	var scalableDimension: ScalableDimension? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsRequest {
		val input = com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsRequest()
		input.setScheduledActionNames(this.scheduledActionNames)
		input.setServiceNamespace(this.serviceNamespace.toString())
		input.setResourceId(this.resourceId)
		input.setScalableDimension(this.scalableDimension?.toString())
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.application_autoscaling.describeScheduledActions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws application-autoscaling describe-scheduled-actions")
				.argument("scheduled-action-names", scheduledActionNames?.toString())
				.argument("service-namespace", serviceNamespace.toString())
				.argument("resource-id", resourceId)
				.argument("scalable-dimension", scalableDimension?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSApplicationAutoScalingFunctions.putScalingPolicy(policyName: String, serviceNamespace: ServiceNamespace, resourceId: String, scalableDimension: ScalableDimension, init: AWSApplicationAutoScalingPutScalingPolicyCommand.() -> Unit) {
	this.block.declare(AWSApplicationAutoScalingPutScalingPolicyCommand(policyName, serviceNamespace, resourceId, scalableDimension).apply(init))
}

@Generated
class AWSApplicationAutoScalingPutScalingPolicyCommand(val policyName: String, val serviceNamespace: ServiceNamespace, val resourceId: String, val scalableDimension: ScalableDimension) : AmazonWebServiceCommand<com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyRequest> {

	var policyType: PolicyType? = null
	var stepScalingPolicyConfiguration: com.amazonaws.services.applicationautoscaling.model.StepScalingPolicyConfiguration? = null
	var targetTrackingScalingPolicyConfiguration: com.amazonaws.services.applicationautoscaling.model.TargetTrackingScalingPolicyConfiguration? = null

	override fun build(): com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyRequest {
		val input = com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyRequest()
		input.setPolicyName(this.policyName)
		input.setServiceNamespace(this.serviceNamespace.toString())
		input.setResourceId(this.resourceId)
		input.setScalableDimension(this.scalableDimension.toString())
		input.setPolicyType(this.policyType?.toString())
		input.setStepScalingPolicyConfiguration(this.stepScalingPolicyConfiguration)
		input.setTargetTrackingScalingPolicyConfiguration(this.targetTrackingScalingPolicyConfiguration)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.application_autoscaling.putScalingPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws application-autoscaling put-scaling-policy")
				.argument("policy-name", policyName)
				.argument("service-namespace", serviceNamespace.toString())
				.argument("resource-id", resourceId)
				.argument("scalable-dimension", scalableDimension.toString())
				.argument("policy-type", policyType?.toString())
				.argument("step-scaling-policy-configuration", stepScalingPolicyConfiguration?.toString())
				.argument("target-tracking-scaling-policy-configuration", targetTrackingScalingPolicyConfiguration?.toString())
	}

}


fun AWSApplicationAutoScalingFunctions.putScheduledAction(serviceNamespace: ServiceNamespace, scheduledActionName: String, resourceId: String, init: AWSApplicationAutoScalingPutScheduledActionCommand.() -> Unit) {
	this.block.declare(AWSApplicationAutoScalingPutScheduledActionCommand(serviceNamespace, scheduledActionName, resourceId).apply(init))
}

@Generated
class AWSApplicationAutoScalingPutScheduledActionCommand(val serviceNamespace: ServiceNamespace, val scheduledActionName: String, val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.applicationautoscaling.model.PutScheduledActionRequest> {

	var schedule: String? = null
	var scalableDimension: ScalableDimension? = null
	var startTime: java.util.Date? = null
	var endTime: java.util.Date? = null
	var scalableTargetAction: com.amazonaws.services.applicationautoscaling.model.ScalableTargetAction? = null

	override fun build(): com.amazonaws.services.applicationautoscaling.model.PutScheduledActionRequest {
		val input = com.amazonaws.services.applicationautoscaling.model.PutScheduledActionRequest()
		input.setServiceNamespace(this.serviceNamespace.toString())
		input.setSchedule(this.schedule)
		input.setScheduledActionName(this.scheduledActionName)
		input.setResourceId(this.resourceId)
		input.setScalableDimension(this.scalableDimension?.toString())
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setScalableTargetAction(this.scalableTargetAction)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.application_autoscaling.putScheduledAction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws application-autoscaling put-scheduled-action")
				.argument("service-namespace", serviceNamespace.toString())
				.argument("schedule", schedule)
				.argument("scheduled-action-name", scheduledActionName)
				.argument("resource-id", resourceId)
				.argument("scalable-dimension", scalableDimension?.toString())
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("scalable-target-action", scalableTargetAction?.toString())
	}

}


fun AWSApplicationAutoScalingFunctions.registerScalableTarget(serviceNamespace: ServiceNamespace, resourceId: String, scalableDimension: ScalableDimension, init: AWSApplicationAutoScalingRegisterScalableTargetCommand.() -> Unit) {
	this.block.declare(AWSApplicationAutoScalingRegisterScalableTargetCommand(serviceNamespace, resourceId, scalableDimension).apply(init))
}

@Generated
class AWSApplicationAutoScalingRegisterScalableTargetCommand(val serviceNamespace: ServiceNamespace, val resourceId: String, val scalableDimension: ScalableDimension) : AmazonWebServiceCommand<com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetRequest> {

	var minCapacity: Int? = 0
	var maxCapacity: Int? = 0
	var roleARN: String? = null

	override fun build(): com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetRequest {
		val input = com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetRequest()
		input.setServiceNamespace(this.serviceNamespace.toString())
		input.setResourceId(this.resourceId)
		input.setScalableDimension(this.scalableDimension.toString())
		input.setMinCapacity(this.minCapacity)
		input.setMaxCapacity(this.maxCapacity)
		input.setRoleARN(this.roleARN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.application_autoscaling.registerScalableTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws application-autoscaling register-scalable-target")
				.argument("service-namespace", serviceNamespace.toString())
				.argument("resource-id", resourceId)
				.argument("scalable-dimension", scalableDimension.toString())
				.argument("min-capacity", minCapacity?.toString())
				.argument("max-capacity", maxCapacity?.toString())
				.argument("role-arn", roleARN)
	}

}
