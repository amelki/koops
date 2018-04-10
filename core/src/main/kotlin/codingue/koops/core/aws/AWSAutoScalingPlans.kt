
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.autoscalingplans.AWSAutoScalingPlans
import com.amazonaws.services.autoscalingplans.model.*

var codingue.koops.core.Environment.autoscaling_plans: AWSAutoScalingPlans
	get() = this.capabilities[AWSAutoScalingPlans::class.java.name] as AWSAutoScalingPlans
	set(autoscaling_plans) {
		this.capabilities[AWSAutoScalingPlans::class.java.name] = autoscaling_plans
	}

@Generated
class AWSAutoScalingPlansFunctions(val block: Block)

infix fun AwsContinuation.autoscaling_plans(init: AWSAutoScalingPlansFunctions.() -> Unit) {
	AWSAutoScalingPlansFunctions(shell).apply(init)
}

			

fun AWSAutoScalingPlansFunctions.createScalingPlan(scalingPlanName: String, applicationSource: com.amazonaws.services.autoscalingplans.model.ApplicationSource, scalingInstructions: List<com.amazonaws.services.autoscalingplans.model.ScalingInstruction>, init: AWSAutoScalingPlansCreateScalingPlanCommand.() -> Unit) {
	this.block.declare(AWSAutoScalingPlansCreateScalingPlanCommand(scalingPlanName, applicationSource, scalingInstructions).apply(init))
}

@Generated
class AWSAutoScalingPlansCreateScalingPlanCommand(val scalingPlanName: String, val applicationSource: com.amazonaws.services.autoscalingplans.model.ApplicationSource, val scalingInstructions: List<com.amazonaws.services.autoscalingplans.model.ScalingInstruction>) : AmazonWebServiceCommand<com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest> {



	override fun build(): com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest {
		val input = com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest()
		input.setScalingPlanName(this.scalingPlanName)
		input.setApplicationSource(this.applicationSource)
		input.setScalingInstructions(this.scalingInstructions)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling_plans.createScalingPlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling-plans create-scaling-plan")
				.argument("scaling-plan-name", scalingPlanName)
				.argument("application-source", applicationSource.toString())
				.argument("scaling-instructions", scalingInstructions.toString())
	}

}


fun AWSAutoScalingPlansFunctions.deleteScalingPlan(scalingPlanName: String, scalingPlanVersion: Long, init: AWSAutoScalingPlansDeleteScalingPlanCommand.() -> Unit) {
	this.block.declare(AWSAutoScalingPlansDeleteScalingPlanCommand(scalingPlanName, scalingPlanVersion).apply(init))
}

@Generated
class AWSAutoScalingPlansDeleteScalingPlanCommand(val scalingPlanName: String, val scalingPlanVersion: Long) : AmazonWebServiceCommand<com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest> {



	override fun build(): com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest {
		val input = com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest()
		input.setScalingPlanName(this.scalingPlanName)
		input.setScalingPlanVersion(this.scalingPlanVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling_plans.deleteScalingPlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling-plans delete-scaling-plan")
				.argument("scaling-plan-name", scalingPlanName)
				.argument("scaling-plan-version", scalingPlanVersion.toString())
	}

}


fun AWSAutoScalingPlansFunctions.describeScalingPlanResources(scalingPlanName: String, scalingPlanVersion: Long, init: AWSAutoScalingPlansDescribeScalingPlanResourcesCommand.() -> Unit) {
	this.block.declare(AWSAutoScalingPlansDescribeScalingPlanResourcesCommand(scalingPlanName, scalingPlanVersion).apply(init))
}

@Generated
class AWSAutoScalingPlansDescribeScalingPlanResourcesCommand(val scalingPlanName: String, val scalingPlanVersion: Long) : AmazonWebServiceCommand<com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest {
		val input = com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest()
		input.setScalingPlanName(this.scalingPlanName)
		input.setScalingPlanVersion(this.scalingPlanVersion)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling_plans.describeScalingPlanResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling-plans describe-scaling-plan-resources")
				.argument("scaling-plan-name", scalingPlanName)
				.argument("scaling-plan-version", scalingPlanVersion.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSAutoScalingPlansFunctions.describeScalingPlans(init: AWSAutoScalingPlansDescribeScalingPlansCommand.() -> Unit) {
	this.block.declare(AWSAutoScalingPlansDescribeScalingPlansCommand().apply(init))
}

@Generated
class AWSAutoScalingPlansDescribeScalingPlansCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest> {

	var scalingPlanNames: List<String>? = null
	var scalingPlanVersion: Long? = 0L
	var applicationSources: List<com.amazonaws.services.autoscalingplans.model.ApplicationSource>? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest {
		val input = com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest()
		input.setScalingPlanNames(this.scalingPlanNames)
		input.setScalingPlanVersion(this.scalingPlanVersion)
		input.setApplicationSources(this.applicationSources)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.autoscaling_plans.describeScalingPlans(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling-plans describe-scaling-plans")
				.argument("scaling-plan-names", scalingPlanNames?.toString())
				.argument("scaling-plan-version", scalingPlanVersion?.toString())
				.argument("application-sources", applicationSources?.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}
