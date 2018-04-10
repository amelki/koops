
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.shield.AWSShield
import com.amazonaws.services.shield.model.*

var codingue.koops.core.Environment.shield: AWSShield
	get() = this.capabilities[AWSShield::class.java.name] as AWSShield
	set(shield) {
		this.capabilities[AWSShield::class.java.name] = shield
	}

@Generated
class AWSShieldFunctions(val block: Block)

infix fun AwsContinuation.shield(init: AWSShieldFunctions.() -> Unit) {
	AWSShieldFunctions(shell).apply(init)
}

			

fun AWSShieldFunctions.createProtection(name: String, resourceArn: String, init: AWSShieldCreateProtectionCommand.() -> Unit) {
	this.block.declare(AWSShieldCreateProtectionCommand(name, resourceArn).apply(init))
}

@Generated
class AWSShieldCreateProtectionCommand(val name: String, val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.shield.model.CreateProtectionRequest> {



	override fun build(): com.amazonaws.services.shield.model.CreateProtectionRequest {
		val input = com.amazonaws.services.shield.model.CreateProtectionRequest()
		input.setName(this.name)
		input.setResourceArn(this.resourceArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.shield.createProtection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield create-protection")
				.argument("name", name)
				.argument("resource-arn", resourceArn)
	}

}


fun AWSShieldFunctions.createSubscription(init: AWSShieldCreateSubscriptionCommand.() -> Unit) {
	this.block.declare(AWSShieldCreateSubscriptionCommand().apply(init))
}

@Generated
class AWSShieldCreateSubscriptionCommand() : AmazonWebServiceCommand<com.amazonaws.services.shield.model.CreateSubscriptionRequest> {



	override fun build(): com.amazonaws.services.shield.model.CreateSubscriptionRequest {
		val input = com.amazonaws.services.shield.model.CreateSubscriptionRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.shield.createSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield create-subscription")

	}

}


fun AWSShieldFunctions.deleteProtection(protectionId: String, init: AWSShieldDeleteProtectionCommand.() -> Unit) {
	this.block.declare(AWSShieldDeleteProtectionCommand(protectionId).apply(init))
}

@Generated
class AWSShieldDeleteProtectionCommand(val protectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.shield.model.DeleteProtectionRequest> {



	override fun build(): com.amazonaws.services.shield.model.DeleteProtectionRequest {
		val input = com.amazonaws.services.shield.model.DeleteProtectionRequest()
		input.setProtectionId(this.protectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.shield.deleteProtection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield delete-protection")
				.argument("protection-id", protectionId)
	}

}


fun AWSShieldFunctions.deleteSubscription(init: AWSShieldDeleteSubscriptionCommand.() -> Unit) {
	this.block.declare(AWSShieldDeleteSubscriptionCommand().apply(init))
}

@Generated
class AWSShieldDeleteSubscriptionCommand() : AmazonWebServiceCommand<com.amazonaws.services.shield.model.DeleteSubscriptionRequest> {



	override fun build(): com.amazonaws.services.shield.model.DeleteSubscriptionRequest {
		val input = com.amazonaws.services.shield.model.DeleteSubscriptionRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.shield.deleteSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield delete-subscription")

	}

}


fun AWSShieldFunctions.describeAttack(attackId: String, init: AWSShieldDescribeAttackCommand.() -> Unit) {
	this.block.declare(AWSShieldDescribeAttackCommand(attackId).apply(init))
}

@Generated
class AWSShieldDescribeAttackCommand(val attackId: String) : AmazonWebServiceCommand<com.amazonaws.services.shield.model.DescribeAttackRequest> {



	override fun build(): com.amazonaws.services.shield.model.DescribeAttackRequest {
		val input = com.amazonaws.services.shield.model.DescribeAttackRequest()
		input.setAttackId(this.attackId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.shield.describeAttack(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield describe-attack")
				.argument("attack-id", attackId)
	}

}


fun AWSShieldFunctions.describeProtection(protectionId: String, init: AWSShieldDescribeProtectionCommand.() -> Unit) {
	this.block.declare(AWSShieldDescribeProtectionCommand(protectionId).apply(init))
}

@Generated
class AWSShieldDescribeProtectionCommand(val protectionId: String) : AmazonWebServiceCommand<com.amazonaws.services.shield.model.DescribeProtectionRequest> {



	override fun build(): com.amazonaws.services.shield.model.DescribeProtectionRequest {
		val input = com.amazonaws.services.shield.model.DescribeProtectionRequest()
		input.setProtectionId(this.protectionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.shield.describeProtection(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield describe-protection")
				.argument("protection-id", protectionId)
	}

}


fun AWSShieldFunctions.describeSubscription(init: AWSShieldDescribeSubscriptionCommand.() -> Unit) {
	this.block.declare(AWSShieldDescribeSubscriptionCommand().apply(init))
}

@Generated
class AWSShieldDescribeSubscriptionCommand() : AmazonWebServiceCommand<com.amazonaws.services.shield.model.DescribeSubscriptionRequest> {



	override fun build(): com.amazonaws.services.shield.model.DescribeSubscriptionRequest {
		val input = com.amazonaws.services.shield.model.DescribeSubscriptionRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.shield.describeSubscription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield describe-subscription")

	}

}


fun AWSShieldFunctions.getSubscriptionState(init: AWSShieldGetSubscriptionStateCommand.() -> Unit) {
	this.block.declare(AWSShieldGetSubscriptionStateCommand().apply(init))
}

@Generated
class AWSShieldGetSubscriptionStateCommand() : AmazonWebServiceCommand<com.amazonaws.services.shield.model.GetSubscriptionStateRequest> {



	override fun build(): com.amazonaws.services.shield.model.GetSubscriptionStateRequest {
		val input = com.amazonaws.services.shield.model.GetSubscriptionStateRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.shield.getSubscriptionState(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield get-subscription-state")

	}

}


fun AWSShieldFunctions.listAttacks(init: AWSShieldListAttacksCommand.() -> Unit) {
	this.block.declare(AWSShieldListAttacksCommand().apply(init))
}

@Generated
class AWSShieldListAttacksCommand() : AmazonWebServiceCommand<com.amazonaws.services.shield.model.ListAttacksRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.shield.listAttacks(build())
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


fun AWSShieldFunctions.listProtections(init: AWSShieldListProtectionsCommand.() -> Unit) {
	this.block.declare(AWSShieldListProtectionsCommand().apply(init))
}

@Generated
class AWSShieldListProtectionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.shield.model.ListProtectionsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.shield.model.ListProtectionsRequest {
		val input = com.amazonaws.services.shield.model.ListProtectionsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.shield.listProtections(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws shield list-protections")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}
