
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

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

infix fun <T> AwsContinuation.autoscaling_plans(init: AWSAutoScalingPlansFunctions.() -> T): T {
	return AWSAutoScalingPlansFunctions(shell).run(init)
}

			

fun AWSAutoScalingPlansFunctions.createScalingPlan(scalingPlanName: String, applicationSource: com.amazonaws.services.autoscalingplans.model.ApplicationSource, scalingInstructions: List<com.amazonaws.services.autoscalingplans.model.ScalingInstruction>, init: AWSAutoScalingPlansCreateScalingPlanCommand.() -> Unit): com.amazonaws.services.autoscalingplans.model.CreateScalingPlanResult {
	return this.block.declare(AWSAutoScalingPlansCreateScalingPlanCommand(scalingPlanName, applicationSource, scalingInstructions).apply(init)) as com.amazonaws.services.autoscalingplans.model.CreateScalingPlanResult
}

@Generated
class AWSAutoScalingPlansCreateScalingPlanCommand(val scalingPlanName: String, val applicationSource: com.amazonaws.services.autoscalingplans.model.ApplicationSource, val scalingInstructions: List<com.amazonaws.services.autoscalingplans.model.ScalingInstruction>) : AmazonWebServiceCommand<com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest, com.amazonaws.services.autoscalingplans.model.CreateScalingPlanResult> {



	override fun build(): com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest {
		val input = com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest()
		input.setScalingPlanName(this.scalingPlanName)
		input.setApplicationSource(this.applicationSource)
		input.setScalingInstructions(this.scalingInstructions)
		return input
	}

	override fun dryResult(): com.amazonaws.services.autoscalingplans.model.CreateScalingPlanResult {
	  return com.amazonaws.services.autoscalingplans.model.CreateScalingPlanResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscalingplans.model.CreateScalingPlanResult {
		return environment.autoscaling_plans.createScalingPlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling-plans create-scaling-plan")
				.argument("scaling-plan-name", scalingPlanName)
				.argument("application-source", applicationSource.toString())
				.argument("scaling-instructions", scalingInstructions.toString())
	}

}


fun AWSAutoScalingPlansFunctions.deleteScalingPlan(scalingPlanName: String, scalingPlanVersion: Long, init: AWSAutoScalingPlansDeleteScalingPlanCommand.() -> Unit): com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanResult {
	return this.block.declare(AWSAutoScalingPlansDeleteScalingPlanCommand(scalingPlanName, scalingPlanVersion).apply(init)) as com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanResult
}

@Generated
class AWSAutoScalingPlansDeleteScalingPlanCommand(val scalingPlanName: String, val scalingPlanVersion: Long) : AmazonWebServiceCommand<com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest, com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanResult> {



	override fun build(): com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest {
		val input = com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest()
		input.setScalingPlanName(this.scalingPlanName)
		input.setScalingPlanVersion(this.scalingPlanVersion)
		return input
	}

	override fun dryResult(): com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanResult {
	  return com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanResult {
		return environment.autoscaling_plans.deleteScalingPlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling-plans delete-scaling-plan")
				.argument("scaling-plan-name", scalingPlanName)
				.argument("scaling-plan-version", scalingPlanVersion.toString())
	}

}


fun AWSAutoScalingPlansFunctions.describeScalingPlanResources(scalingPlanName: String, scalingPlanVersion: Long, init: AWSAutoScalingPlansDescribeScalingPlanResourcesCommand.() -> Unit): com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesResult {
	return this.block.declare(AWSAutoScalingPlansDescribeScalingPlanResourcesCommand(scalingPlanName, scalingPlanVersion).apply(init)) as com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesResult
}

@Generated
class AWSAutoScalingPlansDescribeScalingPlanResourcesCommand(val scalingPlanName: String, val scalingPlanVersion: Long) : AmazonWebServiceCommand<com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest, com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesResult> {

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

	override fun dryResult(): com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesResult {
	  return com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesResult {
		return environment.autoscaling_plans.describeScalingPlanResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws autoscaling-plans describe-scaling-plan-resources")
				.argument("scaling-plan-name", scalingPlanName)
				.argument("scaling-plan-version", scalingPlanVersion.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSAutoScalingPlansFunctions.describeScalingPlans(init: AWSAutoScalingPlansDescribeScalingPlansCommand.() -> Unit): com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansResult {
	return this.block.declare(AWSAutoScalingPlansDescribeScalingPlansCommand().apply(init)) as com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansResult
}

@Generated
class AWSAutoScalingPlansDescribeScalingPlansCommand() : AmazonWebServiceCommand<com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest, com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansResult> {

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

	override fun dryResult(): com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansResult {
	  return com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansResult {
		return environment.autoscaling_plans.describeScalingPlans(build())
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
