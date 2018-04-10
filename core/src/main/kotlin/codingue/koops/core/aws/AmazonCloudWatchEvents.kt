
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.cloudwatchevents.AmazonCloudWatchEvents
import com.amazonaws.services.cloudwatchevents.model.*

var codingue.koops.core.Environment.events: AmazonCloudWatchEvents
	get() = this.capabilities[AmazonCloudWatchEvents::class.java.name] as AmazonCloudWatchEvents
	set(events) {
		this.capabilities[AmazonCloudWatchEvents::class.java.name] = events
	}

@Generated
class AmazonCloudWatchEventsFunctions(val block: Block)

infix fun AwsContinuation.events(init: AmazonCloudWatchEventsFunctions.() -> Unit) {
	AmazonCloudWatchEventsFunctions(shell).apply(init)
}

			

fun AmazonCloudWatchEventsFunctions.deleteRule(name: String, init: AmazonCloudWatchEventsDeleteRuleCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchEventsDeleteRuleCommand(name).apply(init))
}

@Generated
class AmazonCloudWatchEventsDeleteRuleCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.DeleteRuleRequest> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.DeleteRuleRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.DeleteRuleRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.events.deleteRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events delete-rule")
				.argument("name", name)
	}

}


fun AmazonCloudWatchEventsFunctions.describeEventBus(init: AmazonCloudWatchEventsDescribeEventBusCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchEventsDescribeEventBusCommand().apply(init))
}

@Generated
class AmazonCloudWatchEventsDescribeEventBusCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.DescribeEventBusRequest> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.DescribeEventBusRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.DescribeEventBusRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.events.describeEventBus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events describe-event-bus")

	}

}


fun AmazonCloudWatchEventsFunctions.describeRule(name: String, init: AmazonCloudWatchEventsDescribeRuleCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchEventsDescribeRuleCommand(name).apply(init))
}

@Generated
class AmazonCloudWatchEventsDescribeRuleCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.DescribeRuleRequest> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.DescribeRuleRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.DescribeRuleRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.events.describeRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events describe-rule")
				.argument("name", name)
	}

}


fun AmazonCloudWatchEventsFunctions.disableRule(name: String, init: AmazonCloudWatchEventsDisableRuleCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchEventsDisableRuleCommand(name).apply(init))
}

@Generated
class AmazonCloudWatchEventsDisableRuleCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.DisableRuleRequest> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.DisableRuleRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.DisableRuleRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.events.disableRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events disable-rule")
				.argument("name", name)
	}

}


fun AmazonCloudWatchEventsFunctions.enableRule(name: String, init: AmazonCloudWatchEventsEnableRuleCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchEventsEnableRuleCommand(name).apply(init))
}

@Generated
class AmazonCloudWatchEventsEnableRuleCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.EnableRuleRequest> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.EnableRuleRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.EnableRuleRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.events.enableRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events enable-rule")
				.argument("name", name)
	}

}


fun AmazonCloudWatchEventsFunctions.listRuleNamesByTarget(targetArn: String, init: AmazonCloudWatchEventsListRuleNamesByTargetCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchEventsListRuleNamesByTargetCommand(targetArn).apply(init))
}

@Generated
class AmazonCloudWatchEventsListRuleNamesByTargetCommand(val targetArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetRequest> {

	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetRequest()
		input.setTargetArn(this.targetArn)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.events.listRuleNamesByTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events list-rule-names-by-target")
				.argument("target-arn", targetArn)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AmazonCloudWatchEventsFunctions.listRules(init: AmazonCloudWatchEventsListRulesCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchEventsListRulesCommand().apply(init))
}

@Generated
class AmazonCloudWatchEventsListRulesCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.ListRulesRequest> {

	var namePrefix: String? = null
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.cloudwatchevents.model.ListRulesRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.ListRulesRequest()
		input.setNamePrefix(this.namePrefix)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.events.listRules(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events list-rules")
				.argument("name-prefix", namePrefix)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AmazonCloudWatchEventsFunctions.listTargetsByRule(rule: String, init: AmazonCloudWatchEventsListTargetsByRuleCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchEventsListTargetsByRuleCommand(rule).apply(init))
}

@Generated
class AmazonCloudWatchEventsListTargetsByRuleCommand(val rule: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleRequest> {

	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleRequest()
		input.setRule(this.rule)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.events.listTargetsByRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events list-targets-by-rule")
				.argument("rule", rule)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AmazonCloudWatchEventsFunctions.putEvents(entries: List<com.amazonaws.services.cloudwatchevents.model.PutEventsRequestEntry>, init: AmazonCloudWatchEventsPutEventsCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchEventsPutEventsCommand(entries).apply(init))
}

@Generated
class AmazonCloudWatchEventsPutEventsCommand(val entries: List<com.amazonaws.services.cloudwatchevents.model.PutEventsRequestEntry>) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.PutEventsRequest> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.PutEventsRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.PutEventsRequest()
		input.setEntries(this.entries)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.events.putEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events put-events")
				.argument("entries", entries.toString())
	}

}


fun AmazonCloudWatchEventsFunctions.putPermission(action: String, principal: String, statementId: String, init: AmazonCloudWatchEventsPutPermissionCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchEventsPutPermissionCommand(action, principal, statementId).apply(init))
}

@Generated
class AmazonCloudWatchEventsPutPermissionCommand(val action: String, val principal: String, val statementId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.PutPermissionRequest> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.PutPermissionRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.PutPermissionRequest()
		input.setAction(this.action)
		input.setPrincipal(this.principal)
		input.setStatementId(this.statementId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.events.putPermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events put-permission")
				.argument("action", action)
				.argument("principal", principal)
				.argument("statement-id", statementId)
	}

}


fun AmazonCloudWatchEventsFunctions.putRule(name: String, init: AmazonCloudWatchEventsPutRuleCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchEventsPutRuleCommand(name).apply(init))
}

@Generated
class AmazonCloudWatchEventsPutRuleCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.PutRuleRequest> {

	var scheduleExpression: String? = null
	var eventPattern: String? = null
	var state: RuleState? = null
	var description: String? = null
	var roleArn: String? = null

	override fun build(): com.amazonaws.services.cloudwatchevents.model.PutRuleRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.PutRuleRequest()
		input.setName(this.name)
		input.setScheduleExpression(this.scheduleExpression)
		input.setEventPattern(this.eventPattern)
		input.setState(this.state?.toString())
		input.setDescription(this.description)
		input.setRoleArn(this.roleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.events.putRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events put-rule")
				.argument("name", name)
				.argument("schedule-expression", scheduleExpression)
				.argument("event-pattern", eventPattern)
				.argument("state", state?.toString())
				.argument("description", description)
				.argument("role-arn", roleArn)
	}

}


fun AmazonCloudWatchEventsFunctions.putTargets(rule: String, targets: List<com.amazonaws.services.cloudwatchevents.model.Target>, init: AmazonCloudWatchEventsPutTargetsCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchEventsPutTargetsCommand(rule, targets).apply(init))
}

@Generated
class AmazonCloudWatchEventsPutTargetsCommand(val rule: String, val targets: List<com.amazonaws.services.cloudwatchevents.model.Target>) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.PutTargetsRequest> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.PutTargetsRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.PutTargetsRequest()
		input.setRule(this.rule)
		input.setTargets(this.targets)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.events.putTargets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events put-targets")
				.argument("rule", rule)
				.argument("targets", targets.toString())
	}

}


fun AmazonCloudWatchEventsFunctions.removePermission(statementId: String, init: AmazonCloudWatchEventsRemovePermissionCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchEventsRemovePermissionCommand(statementId).apply(init))
}

@Generated
class AmazonCloudWatchEventsRemovePermissionCommand(val statementId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.RemovePermissionRequest> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.RemovePermissionRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.RemovePermissionRequest()
		input.setStatementId(this.statementId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.events.removePermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events remove-permission")
				.argument("statement-id", statementId)
	}

}


fun AmazonCloudWatchEventsFunctions.removeTargets(rule: String, ids: List<String>, init: AmazonCloudWatchEventsRemoveTargetsCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchEventsRemoveTargetsCommand(rule, ids).apply(init))
}

@Generated
class AmazonCloudWatchEventsRemoveTargetsCommand(val rule: String, val ids: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.RemoveTargetsRequest> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.RemoveTargetsRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.RemoveTargetsRequest()
		input.setRule(this.rule)
		input.setIds(this.ids)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.events.removeTargets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events remove-targets")
				.argument("rule", rule)
				.argument("ids", ids.toString())
	}

}


fun AmazonCloudWatchEventsFunctions.testEventPattern(eventPattern: String, event: String, init: AmazonCloudWatchEventsTestEventPatternCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchEventsTestEventPatternCommand(eventPattern, event).apply(init))
}

@Generated
class AmazonCloudWatchEventsTestEventPatternCommand(val eventPattern: String, val event: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.TestEventPatternRequest> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.TestEventPatternRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.TestEventPatternRequest()
		input.setEventPattern(this.eventPattern)
		input.setEvent(this.event)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.events.testEventPattern(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events test-event-pattern")
				.argument("event-pattern", eventPattern)
				.argument("event", event)
	}

}
