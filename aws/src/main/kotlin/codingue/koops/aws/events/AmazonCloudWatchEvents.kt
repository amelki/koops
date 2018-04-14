
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.events

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.cloudwatchevents.*
import com.amazonaws.services.cloudwatchevents.model.*

var codingue.koops.core.Environment.events: AmazonCloudWatchEvents
	get() {
		var service = this.capabilities["aws-events"]
		if (service == null) {
			service = AmazonCloudWatchEventsClientBuilder.standard().build()
			this.capabilities["aws-events"] = service
		}
		return service as AmazonCloudWatchEvents
	}
	set(events) {
		this.capabilities["aws-events"] = events
	}

@Generated
class AmazonCloudWatchEventsFunctions(val block: Block)

infix fun <T> AwsContinuation.events(init: AmazonCloudWatchEventsFunctions.() -> T): T {
	return AmazonCloudWatchEventsFunctions(shell).run(init)
}

			

fun AmazonCloudWatchEventsFunctions.deleteRule(name: String, init: AmazonCloudWatchEventsDeleteRuleCommand.() -> Unit): com.amazonaws.services.cloudwatchevents.model.DeleteRuleResult {
	return this.block.declare(AmazonCloudWatchEventsDeleteRuleCommand(name).apply(init)) as com.amazonaws.services.cloudwatchevents.model.DeleteRuleResult
}

@Generated
class AmazonCloudWatchEventsDeleteRuleCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.DeleteRuleRequest, com.amazonaws.services.cloudwatchevents.model.DeleteRuleResult> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.DeleteRuleRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.DeleteRuleRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatchevents.model.DeleteRuleResult {
	  return com.amazonaws.services.cloudwatchevents.model.DeleteRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatchevents.model.DeleteRuleResult {
		return environment.events.deleteRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events delete-rule")
				.argument("name", name)
	}

}


fun AmazonCloudWatchEventsFunctions.describeEventBus(init: AmazonCloudWatchEventsDescribeEventBusCommand.() -> Unit): com.amazonaws.services.cloudwatchevents.model.DescribeEventBusResult {
	return this.block.declare(AmazonCloudWatchEventsDescribeEventBusCommand().apply(init)) as com.amazonaws.services.cloudwatchevents.model.DescribeEventBusResult
}

@Generated
class AmazonCloudWatchEventsDescribeEventBusCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.DescribeEventBusRequest, com.amazonaws.services.cloudwatchevents.model.DescribeEventBusResult> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.DescribeEventBusRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.DescribeEventBusRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatchevents.model.DescribeEventBusResult {
	  return com.amazonaws.services.cloudwatchevents.model.DescribeEventBusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatchevents.model.DescribeEventBusResult {
		return environment.events.describeEventBus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events describe-event-bus")

	}

}


fun AmazonCloudWatchEventsFunctions.describeRule(name: String, init: AmazonCloudWatchEventsDescribeRuleCommand.() -> Unit): com.amazonaws.services.cloudwatchevents.model.DescribeRuleResult {
	return this.block.declare(AmazonCloudWatchEventsDescribeRuleCommand(name).apply(init)) as com.amazonaws.services.cloudwatchevents.model.DescribeRuleResult
}

@Generated
class AmazonCloudWatchEventsDescribeRuleCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.DescribeRuleRequest, com.amazonaws.services.cloudwatchevents.model.DescribeRuleResult> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.DescribeRuleRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.DescribeRuleRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatchevents.model.DescribeRuleResult {
	  return com.amazonaws.services.cloudwatchevents.model.DescribeRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatchevents.model.DescribeRuleResult {
		return environment.events.describeRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events describe-rule")
				.argument("name", name)
	}

}


fun AmazonCloudWatchEventsFunctions.disableRule(name: String, init: AmazonCloudWatchEventsDisableRuleCommand.() -> Unit): com.amazonaws.services.cloudwatchevents.model.DisableRuleResult {
	return this.block.declare(AmazonCloudWatchEventsDisableRuleCommand(name).apply(init)) as com.amazonaws.services.cloudwatchevents.model.DisableRuleResult
}

@Generated
class AmazonCloudWatchEventsDisableRuleCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.DisableRuleRequest, com.amazonaws.services.cloudwatchevents.model.DisableRuleResult> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.DisableRuleRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.DisableRuleRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatchevents.model.DisableRuleResult {
	  return com.amazonaws.services.cloudwatchevents.model.DisableRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatchevents.model.DisableRuleResult {
		return environment.events.disableRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events disable-rule")
				.argument("name", name)
	}

}


fun AmazonCloudWatchEventsFunctions.enableRule(name: String, init: AmazonCloudWatchEventsEnableRuleCommand.() -> Unit): com.amazonaws.services.cloudwatchevents.model.EnableRuleResult {
	return this.block.declare(AmazonCloudWatchEventsEnableRuleCommand(name).apply(init)) as com.amazonaws.services.cloudwatchevents.model.EnableRuleResult
}

@Generated
class AmazonCloudWatchEventsEnableRuleCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.EnableRuleRequest, com.amazonaws.services.cloudwatchevents.model.EnableRuleResult> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.EnableRuleRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.EnableRuleRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatchevents.model.EnableRuleResult {
	  return com.amazonaws.services.cloudwatchevents.model.EnableRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatchevents.model.EnableRuleResult {
		return environment.events.enableRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events enable-rule")
				.argument("name", name)
	}

}


fun AmazonCloudWatchEventsFunctions.listRuleNamesByTarget(targetArn: String, init: AmazonCloudWatchEventsListRuleNamesByTargetCommand.() -> Unit): com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetResult {
	return this.block.declare(AmazonCloudWatchEventsListRuleNamesByTargetCommand(targetArn).apply(init)) as com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetResult
}

@Generated
class AmazonCloudWatchEventsListRuleNamesByTargetCommand(val targetArn: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetRequest, com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetResult> {

	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetRequest()
		input.setTargetArn(this.targetArn)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetResult {
	  return com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetResult {
		return environment.events.listRuleNamesByTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events list-rule-names-by-target")
				.argument("target-arn", targetArn)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AmazonCloudWatchEventsFunctions.listRules(init: AmazonCloudWatchEventsListRulesCommand.() -> Unit): com.amazonaws.services.cloudwatchevents.model.ListRulesResult {
	return this.block.declare(AmazonCloudWatchEventsListRulesCommand().apply(init)) as com.amazonaws.services.cloudwatchevents.model.ListRulesResult
}

@Generated
class AmazonCloudWatchEventsListRulesCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.ListRulesRequest, com.amazonaws.services.cloudwatchevents.model.ListRulesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudwatchevents.model.ListRulesResult {
	  return com.amazonaws.services.cloudwatchevents.model.ListRulesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatchevents.model.ListRulesResult {
		return environment.events.listRules(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events list-rules")
				.argument("name-prefix", namePrefix)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AmazonCloudWatchEventsFunctions.listTargetsByRule(rule: String, init: AmazonCloudWatchEventsListTargetsByRuleCommand.() -> Unit): com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleResult {
	return this.block.declare(AmazonCloudWatchEventsListTargetsByRuleCommand(rule).apply(init)) as com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleResult
}

@Generated
class AmazonCloudWatchEventsListTargetsByRuleCommand(val rule: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleRequest, com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleResult> {

	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleRequest()
		input.setRule(this.rule)
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleResult {
	  return com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleResult {
		return environment.events.listTargetsByRule(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events list-targets-by-rule")
				.argument("rule", rule)
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AmazonCloudWatchEventsFunctions.putEvents(entries: List<com.amazonaws.services.cloudwatchevents.model.PutEventsRequestEntry>, init: AmazonCloudWatchEventsPutEventsCommand.() -> Unit): com.amazonaws.services.cloudwatchevents.model.PutEventsResult {
	return this.block.declare(AmazonCloudWatchEventsPutEventsCommand(entries).apply(init)) as com.amazonaws.services.cloudwatchevents.model.PutEventsResult
}

@Generated
class AmazonCloudWatchEventsPutEventsCommand(val entries: List<com.amazonaws.services.cloudwatchevents.model.PutEventsRequestEntry>) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.PutEventsRequest, com.amazonaws.services.cloudwatchevents.model.PutEventsResult> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.PutEventsRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.PutEventsRequest()
		input.setEntries(this.entries)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatchevents.model.PutEventsResult {
	  return com.amazonaws.services.cloudwatchevents.model.PutEventsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatchevents.model.PutEventsResult {
		return environment.events.putEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events put-events")
				.argument("entries", entries.toString())
	}

}


fun AmazonCloudWatchEventsFunctions.putPermission(action: String, principal: String, statementId: String, init: AmazonCloudWatchEventsPutPermissionCommand.() -> Unit): com.amazonaws.services.cloudwatchevents.model.PutPermissionResult {
	return this.block.declare(AmazonCloudWatchEventsPutPermissionCommand(action, principal, statementId).apply(init)) as com.amazonaws.services.cloudwatchevents.model.PutPermissionResult
}

@Generated
class AmazonCloudWatchEventsPutPermissionCommand(val action: String, val principal: String, val statementId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.PutPermissionRequest, com.amazonaws.services.cloudwatchevents.model.PutPermissionResult> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.PutPermissionRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.PutPermissionRequest()
		input.setAction(this.action)
		input.setPrincipal(this.principal)
		input.setStatementId(this.statementId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatchevents.model.PutPermissionResult {
	  return com.amazonaws.services.cloudwatchevents.model.PutPermissionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatchevents.model.PutPermissionResult {
		return environment.events.putPermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events put-permission")
				.argument("action", action)
				.argument("principal", principal)
				.argument("statement-id", statementId)
	}

}


fun AmazonCloudWatchEventsFunctions.putRule(name: String, init: AmazonCloudWatchEventsPutRuleCommand.() -> Unit): com.amazonaws.services.cloudwatchevents.model.PutRuleResult {
	return this.block.declare(AmazonCloudWatchEventsPutRuleCommand(name).apply(init)) as com.amazonaws.services.cloudwatchevents.model.PutRuleResult
}

@Generated
class AmazonCloudWatchEventsPutRuleCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.PutRuleRequest, com.amazonaws.services.cloudwatchevents.model.PutRuleResult> {

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

	
	override fun dryResult(): com.amazonaws.services.cloudwatchevents.model.PutRuleResult {
	  return com.amazonaws.services.cloudwatchevents.model.PutRuleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatchevents.model.PutRuleResult {
		return environment.events.putRule(build())
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


fun AmazonCloudWatchEventsFunctions.putTargets(rule: String, targets: List<com.amazonaws.services.cloudwatchevents.model.Target>, init: AmazonCloudWatchEventsPutTargetsCommand.() -> Unit): com.amazonaws.services.cloudwatchevents.model.PutTargetsResult {
	return this.block.declare(AmazonCloudWatchEventsPutTargetsCommand(rule, targets).apply(init)) as com.amazonaws.services.cloudwatchevents.model.PutTargetsResult
}

@Generated
class AmazonCloudWatchEventsPutTargetsCommand(val rule: String, val targets: List<com.amazonaws.services.cloudwatchevents.model.Target>) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.PutTargetsRequest, com.amazonaws.services.cloudwatchevents.model.PutTargetsResult> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.PutTargetsRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.PutTargetsRequest()
		input.setRule(this.rule)
		input.setTargets(this.targets)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatchevents.model.PutTargetsResult {
	  return com.amazonaws.services.cloudwatchevents.model.PutTargetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatchevents.model.PutTargetsResult {
		return environment.events.putTargets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events put-targets")
				.argument("rule", rule)
				.argument("targets", targets.toString())
	}

}


fun AmazonCloudWatchEventsFunctions.removePermission(statementId: String, init: AmazonCloudWatchEventsRemovePermissionCommand.() -> Unit): com.amazonaws.services.cloudwatchevents.model.RemovePermissionResult {
	return this.block.declare(AmazonCloudWatchEventsRemovePermissionCommand(statementId).apply(init)) as com.amazonaws.services.cloudwatchevents.model.RemovePermissionResult
}

@Generated
class AmazonCloudWatchEventsRemovePermissionCommand(val statementId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.RemovePermissionRequest, com.amazonaws.services.cloudwatchevents.model.RemovePermissionResult> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.RemovePermissionRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.RemovePermissionRequest()
		input.setStatementId(this.statementId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatchevents.model.RemovePermissionResult {
	  return com.amazonaws.services.cloudwatchevents.model.RemovePermissionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatchevents.model.RemovePermissionResult {
		return environment.events.removePermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events remove-permission")
				.argument("statement-id", statementId)
	}

}


fun AmazonCloudWatchEventsFunctions.removeTargets(rule: String, ids: List<String>, init: AmazonCloudWatchEventsRemoveTargetsCommand.() -> Unit): com.amazonaws.services.cloudwatchevents.model.RemoveTargetsResult {
	return this.block.declare(AmazonCloudWatchEventsRemoveTargetsCommand(rule, ids).apply(init)) as com.amazonaws.services.cloudwatchevents.model.RemoveTargetsResult
}

@Generated
class AmazonCloudWatchEventsRemoveTargetsCommand(val rule: String, val ids: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.RemoveTargetsRequest, com.amazonaws.services.cloudwatchevents.model.RemoveTargetsResult> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.RemoveTargetsRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.RemoveTargetsRequest()
		input.setRule(this.rule)
		input.setIds(this.ids)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatchevents.model.RemoveTargetsResult {
	  return com.amazonaws.services.cloudwatchevents.model.RemoveTargetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatchevents.model.RemoveTargetsResult {
		return environment.events.removeTargets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events remove-targets")
				.argument("rule", rule)
				.argument("ids", ids.toString())
	}

}


fun AmazonCloudWatchEventsFunctions.testEventPattern(eventPattern: String, event: String, init: AmazonCloudWatchEventsTestEventPatternCommand.() -> Unit): com.amazonaws.services.cloudwatchevents.model.TestEventPatternResult {
	return this.block.declare(AmazonCloudWatchEventsTestEventPatternCommand(eventPattern, event).apply(init)) as com.amazonaws.services.cloudwatchevents.model.TestEventPatternResult
}

@Generated
class AmazonCloudWatchEventsTestEventPatternCommand(val eventPattern: String, val event: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatchevents.model.TestEventPatternRequest, com.amazonaws.services.cloudwatchevents.model.TestEventPatternResult> {



	override fun build(): com.amazonaws.services.cloudwatchevents.model.TestEventPatternRequest {
		val input = com.amazonaws.services.cloudwatchevents.model.TestEventPatternRequest()
		input.setEventPattern(this.eventPattern)
		input.setEvent(this.event)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatchevents.model.TestEventPatternResult {
	  return com.amazonaws.services.cloudwatchevents.model.TestEventPatternResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatchevents.model.TestEventPatternResult {
		return environment.events.testEventPattern(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws events test-event-pattern")
				.argument("event-pattern", eventPattern)
				.argument("event", event)
	}

}
