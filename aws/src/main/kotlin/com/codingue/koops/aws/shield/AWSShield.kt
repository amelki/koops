
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.shield

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.shield.*

var com.codingue.koops.core.Environment.shield: AWSShield
	get() {
		var service = this.capabilities["aws-shield"]
		if (service == null) {
			service = AWSShieldClientBuilder.standard().build()
			this.capabilities["aws-shield"] = service
		}
		return service as AWSShield
	}
	set(shield) {
		this.capabilities["aws-shield"] = shield
	}

@Generated
class AWSShieldFunctions(val block: Script)

infix fun <T> AwsContinuation.shield(init: AWSShieldFunctions.() -> T): T {
	return AWSShieldFunctions(shell).run(init)
}

			

fun AWSShieldFunctions.createProtection(name: String, resourceArn: String, init: (AWSShieldCreateProtectionCommand.() -> Unit)? = null): com.amazonaws.services.shield.model.CreateProtectionResult {
	return this.block.declare(AWSShieldCreateProtectionCommand(name, resourceArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.shield.model.CreateProtectionResult
}

@Generated
class AWSShieldCreateProtectionCommand(val name: String, val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.shield.model.CreateProtectionRequest, com.amazonaws.services.shield.model.CreateProtectionResult> {



	override fun build(): com.amazonaws.services.shield.model.CreateProtectionRequest {
		val input = com.amazonaws.services.shield.model.CreateProtectionRequest()
		input.setName(this.name)
		input.setResourceArn(this.resourceArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.shield.model.CreateProtectionResult {
	  return com.amazonaws.services.shield.model.CreateProtectionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.shield.model.CreateProtectionResult {
		return environment.shield.createProtection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield create-protection")
				.argument("name", name)
				.argument("resource-arn", resourceArn)
	}

}


fun AWSShieldFunctions.createSubscription(init: (AWSShieldCreateSubscriptionCommand.() -> Unit)? = null): com.amazonaws.services.shield.model.CreateSubscriptionResult {
	return this.block.declare(AWSShieldCreateSubscriptionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.shield.model.CreateSubscriptionResult
}

@Generated
class AWSShieldCreateSubscriptionCommand() : AmazonWebServiceCommand<com.amazonaws.services.shield.model.CreateSubscriptionRequest, com.amazonaws.services.shield.model.CreateSubscriptionResult> {



	override fun build(): com.amazonaws.services.shield.model.CreateSubscriptionRequest {
		val input = com.amazonaws.services.shield.model.CreateSubscriptionRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.shield.model.CreateSubscriptionResult {
	  return com.amazonaws.services.shield.model.CreateSubscriptionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.shield.model.CreateSubscriptionResult {
		return environment.shield.createSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield create-subscription")

	}

}


fun AWSShieldFunctions.deleteProtection(protectionId: String, init: (AWSShieldDeleteProtectionCommand.() -> Unit)? = null): com.amazonaws.services.shield.model.DeleteProtectionResult {
	return this.block.declare(AWSShieldDeleteProtectionCommand(protectionId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.shield.model.DeleteProtectionResult
}

@Generated
class AWSShieldDeleteProtectionCommand(val protectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.shield.model.DeleteProtectionRequest, com.amazonaws.services.shield.model.DeleteProtectionResult> {



	override fun build(): com.amazonaws.services.shield.model.DeleteProtectionRequest {
		val input = com.amazonaws.services.shield.model.DeleteProtectionRequest()
		input.setProtectionId(this.protectionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.shield.model.DeleteProtectionResult {
	  return com.amazonaws.services.shield.model.DeleteProtectionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.shield.model.DeleteProtectionResult {
		return environment.shield.deleteProtection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield delete-protection")
				.argument("protection-id", protectionId)
	}

}


fun AWSShieldFunctions.deleteSubscription(init: (AWSShieldDeleteSubscriptionCommand.() -> Unit)? = null): com.amazonaws.services.shield.model.DeleteSubscriptionResult {
	return this.block.declare(AWSShieldDeleteSubscriptionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.shield.model.DeleteSubscriptionResult
}

@Generated
class AWSShieldDeleteSubscriptionCommand() : AmazonWebServiceCommand<com.amazonaws.services.shield.model.DeleteSubscriptionRequest, com.amazonaws.services.shield.model.DeleteSubscriptionResult> {



	override fun build(): com.amazonaws.services.shield.model.DeleteSubscriptionRequest {
		val input = com.amazonaws.services.shield.model.DeleteSubscriptionRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.shield.model.DeleteSubscriptionResult {
	  return com.amazonaws.services.shield.model.DeleteSubscriptionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.shield.model.DeleteSubscriptionResult {
		return environment.shield.deleteSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield delete-subscription")

	}

}


fun AWSShieldFunctions.describeAttack(attackId: String, init: (AWSShieldDescribeAttackCommand.() -> Unit)? = null): com.amazonaws.services.shield.model.DescribeAttackResult {
	return this.block.declare(AWSShieldDescribeAttackCommand(attackId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.shield.model.DescribeAttackResult
}

@Generated
class AWSShieldDescribeAttackCommand(val attackId: String) : AmazonWebServiceCommand<com.amazonaws.services.shield.model.DescribeAttackRequest, com.amazonaws.services.shield.model.DescribeAttackResult> {



	override fun build(): com.amazonaws.services.shield.model.DescribeAttackRequest {
		val input = com.amazonaws.services.shield.model.DescribeAttackRequest()
		input.setAttackId(this.attackId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.shield.model.DescribeAttackResult {
	  return com.amazonaws.services.shield.model.DescribeAttackResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.shield.model.DescribeAttackResult {
		return environment.shield.describeAttack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield describe-attack")
				.argument("attack-id", attackId)
	}

}


fun AWSShieldFunctions.describeProtection(protectionId: String, init: (AWSShieldDescribeProtectionCommand.() -> Unit)? = null): com.amazonaws.services.shield.model.DescribeProtectionResult {
	return this.block.declare(AWSShieldDescribeProtectionCommand(protectionId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.shield.model.DescribeProtectionResult
}

@Generated
class AWSShieldDescribeProtectionCommand(val protectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.shield.model.DescribeProtectionRequest, com.amazonaws.services.shield.model.DescribeProtectionResult> {



	override fun build(): com.amazonaws.services.shield.model.DescribeProtectionRequest {
		val input = com.amazonaws.services.shield.model.DescribeProtectionRequest()
		input.setProtectionId(this.protectionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.shield.model.DescribeProtectionResult {
	  return com.amazonaws.services.shield.model.DescribeProtectionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.shield.model.DescribeProtectionResult {
		return environment.shield.describeProtection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield describe-protection")
				.argument("protection-id", protectionId)
	}

}


fun AWSShieldFunctions.describeSubscription(init: (AWSShieldDescribeSubscriptionCommand.() -> Unit)? = null): com.amazonaws.services.shield.model.DescribeSubscriptionResult {
	return this.block.declare(AWSShieldDescribeSubscriptionCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.shield.model.DescribeSubscriptionResult
}

@Generated
class AWSShieldDescribeSubscriptionCommand() : AmazonWebServiceCommand<com.amazonaws.services.shield.model.DescribeSubscriptionRequest, com.amazonaws.services.shield.model.DescribeSubscriptionResult> {



	override fun build(): com.amazonaws.services.shield.model.DescribeSubscriptionRequest {
		val input = com.amazonaws.services.shield.model.DescribeSubscriptionRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.shield.model.DescribeSubscriptionResult {
	  return com.amazonaws.services.shield.model.DescribeSubscriptionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.shield.model.DescribeSubscriptionResult {
		return environment.shield.describeSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield describe-subscription")

	}

}


fun AWSShieldFunctions.getSubscriptionState(init: (AWSShieldGetSubscriptionStateCommand.() -> Unit)? = null): com.amazonaws.services.shield.model.GetSubscriptionStateResult {
	return this.block.declare(AWSShieldGetSubscriptionStateCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.shield.model.GetSubscriptionStateResult
}

@Generated
class AWSShieldGetSubscriptionStateCommand() : AmazonWebServiceCommand<com.amazonaws.services.shield.model.GetSubscriptionStateRequest, com.amazonaws.services.shield.model.GetSubscriptionStateResult> {



	override fun build(): com.amazonaws.services.shield.model.GetSubscriptionStateRequest {
		val input = com.amazonaws.services.shield.model.GetSubscriptionStateRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.shield.model.GetSubscriptionStateResult {
	  return com.amazonaws.services.shield.model.GetSubscriptionStateResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.shield.model.GetSubscriptionStateResult {
		return environment.shield.getSubscriptionState(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield get-subscription-state")

	}

}


fun AWSShieldFunctions.listAttacks(init: (AWSShieldListAttacksCommand.() -> Unit)? = null): com.amazonaws.services.shield.model.ListAttacksResult {
	return this.block.declare(AWSShieldListAttacksCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.shield.model.ListAttacksResult
}

@Generated
class AWSShieldListAttacksCommand() : AmazonWebServiceCommand<com.amazonaws.services.shield.model.ListAttacksRequest, com.amazonaws.services.shield.model.ListAttacksResult> {

	var resourceArns: List<String>? = null
	var startTime: com.amazonaws.services.shield.model.TimeRange? = null
	var endTime: com.amazonaws.services.shield.model.TimeRange? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.shield.model.ListAttacksRequest {
		val input = com.amazonaws.services.shield.model.ListAttacksRequest()
		input.setResourceArns(this.resourceArns)
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.shield.model.ListAttacksResult {
	  return com.amazonaws.services.shield.model.ListAttacksResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.shield.model.ListAttacksResult {
		return environment.shield.listAttacks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield list-attacks")
				.argument("resource-arns", resourceArns?.toString())
				.argument("start-time", startTime?.toString())
				.argument("end-time", endTime?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSShieldFunctions.listProtections(init: (AWSShieldListProtectionsCommand.() -> Unit)? = null): com.amazonaws.services.shield.model.ListProtectionsResult {
	return this.block.declare(AWSShieldListProtectionsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.shield.model.ListProtectionsResult
}

@Generated
class AWSShieldListProtectionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.shield.model.ListProtectionsRequest, com.amazonaws.services.shield.model.ListProtectionsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.shield.model.ListProtectionsRequest {
		val input = com.amazonaws.services.shield.model.ListProtectionsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.shield.model.ListProtectionsResult {
	  return com.amazonaws.services.shield.model.ListProtectionsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.shield.model.ListProtectionsResult {
		return environment.shield.listProtections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield list-protections")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}
