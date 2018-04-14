
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.health

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.health.*
import com.amazonaws.services.health.model.*

var codingue.koops.core.Environment.health: AWSHealth
	get() {
		var service = this.capabilities["aws-health"]
		if (service == null) {
			service = AWSHealthClientBuilder.standard().build()
			this.capabilities["aws-health"] = service
		}
		return service as AWSHealth
	}
	set(health) {
		this.capabilities["aws-health"] = health
	}

@Generated
class AWSHealthFunctions(val block: Block)

infix fun <T> AwsContinuation.health(init: AWSHealthFunctions.() -> T): T {
	return AWSHealthFunctions(shell).run(init)
}

			

fun AWSHealthFunctions.describeAffectedEntities(init: AWSHealthDescribeAffectedEntitiesCommand.() -> Unit): com.amazonaws.services.health.model.DescribeAffectedEntitiesResult {
	return this.block.declare(AWSHealthDescribeAffectedEntitiesCommand().apply(init)) as com.amazonaws.services.health.model.DescribeAffectedEntitiesResult
}

@Generated
class AWSHealthDescribeAffectedEntitiesCommand() : AmazonWebServiceCommand<com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest, com.amazonaws.services.health.model.DescribeAffectedEntitiesResult> {

	var filter: com.amazonaws.services.health.model.EntityFilter? = null
	var locale: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest {
		val input = com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest()
		input.setFilter(this.filter)
		input.setLocale(this.locale)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.health.model.DescribeAffectedEntitiesResult {
	  return com.amazonaws.services.health.model.DescribeAffectedEntitiesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.health.model.DescribeAffectedEntitiesResult {
		return environment.health.describeAffectedEntities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws health describe-affected-entities")
				.argument("filter", filter?.toString())
				.argument("locale", locale)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSHealthFunctions.describeEntityAggregates(init: AWSHealthDescribeEntityAggregatesCommand.() -> Unit): com.amazonaws.services.health.model.DescribeEntityAggregatesResult {
	return this.block.declare(AWSHealthDescribeEntityAggregatesCommand().apply(init)) as com.amazonaws.services.health.model.DescribeEntityAggregatesResult
}

@Generated
class AWSHealthDescribeEntityAggregatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.health.model.DescribeEntityAggregatesRequest, com.amazonaws.services.health.model.DescribeEntityAggregatesResult> {

	var eventArns: List<String>? = null

	override fun build(): com.amazonaws.services.health.model.DescribeEntityAggregatesRequest {
		val input = com.amazonaws.services.health.model.DescribeEntityAggregatesRequest()
		input.setEventArns(this.eventArns)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.health.model.DescribeEntityAggregatesResult {
	  return com.amazonaws.services.health.model.DescribeEntityAggregatesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.health.model.DescribeEntityAggregatesResult {
		return environment.health.describeEntityAggregates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws health describe-entity-aggregates")
				.argument("event-arns", eventArns?.toString())
	}

}


fun AWSHealthFunctions.describeEventAggregates(init: AWSHealthDescribeEventAggregatesCommand.() -> Unit): com.amazonaws.services.health.model.DescribeEventAggregatesResult {
	return this.block.declare(AWSHealthDescribeEventAggregatesCommand().apply(init)) as com.amazonaws.services.health.model.DescribeEventAggregatesResult
}

@Generated
class AWSHealthDescribeEventAggregatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.health.model.DescribeEventAggregatesRequest, com.amazonaws.services.health.model.DescribeEventAggregatesResult> {

	var filter: com.amazonaws.services.health.model.EventFilter? = null
	var aggregateField: String? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.health.model.DescribeEventAggregatesRequest {
		val input = com.amazonaws.services.health.model.DescribeEventAggregatesRequest()
		input.setFilter(this.filter)
		input.setAggregateField(this.aggregateField)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.health.model.DescribeEventAggregatesResult {
	  return com.amazonaws.services.health.model.DescribeEventAggregatesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.health.model.DescribeEventAggregatesResult {
		return environment.health.describeEventAggregates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws health describe-event-aggregates")
				.argument("filter", filter?.toString())
				.argument("aggregate-field", aggregateField)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSHealthFunctions.describeEventDetails(init: AWSHealthDescribeEventDetailsCommand.() -> Unit): com.amazonaws.services.health.model.DescribeEventDetailsResult {
	return this.block.declare(AWSHealthDescribeEventDetailsCommand().apply(init)) as com.amazonaws.services.health.model.DescribeEventDetailsResult
}

@Generated
class AWSHealthDescribeEventDetailsCommand() : AmazonWebServiceCommand<com.amazonaws.services.health.model.DescribeEventDetailsRequest, com.amazonaws.services.health.model.DescribeEventDetailsResult> {

	var eventArns: List<String>? = null
	var locale: String? = null

	override fun build(): com.amazonaws.services.health.model.DescribeEventDetailsRequest {
		val input = com.amazonaws.services.health.model.DescribeEventDetailsRequest()
		input.setEventArns(this.eventArns)
		input.setLocale(this.locale)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.health.model.DescribeEventDetailsResult {
	  return com.amazonaws.services.health.model.DescribeEventDetailsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.health.model.DescribeEventDetailsResult {
		return environment.health.describeEventDetails(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws health describe-event-details")
				.argument("event-arns", eventArns?.toString())
				.argument("locale", locale)
	}

}


fun AWSHealthFunctions.describeEventTypes(init: AWSHealthDescribeEventTypesCommand.() -> Unit): com.amazonaws.services.health.model.DescribeEventTypesResult {
	return this.block.declare(AWSHealthDescribeEventTypesCommand().apply(init)) as com.amazonaws.services.health.model.DescribeEventTypesResult
}

@Generated
class AWSHealthDescribeEventTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.health.model.DescribeEventTypesRequest, com.amazonaws.services.health.model.DescribeEventTypesResult> {

	var filter: com.amazonaws.services.health.model.EventTypeFilter? = null
	var locale: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.health.model.DescribeEventTypesRequest {
		val input = com.amazonaws.services.health.model.DescribeEventTypesRequest()
		input.setFilter(this.filter)
		input.setLocale(this.locale)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.health.model.DescribeEventTypesResult {
	  return com.amazonaws.services.health.model.DescribeEventTypesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.health.model.DescribeEventTypesResult {
		return environment.health.describeEventTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws health describe-event-types")
				.argument("filter", filter?.toString())
				.argument("locale", locale)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSHealthFunctions.describeEvents(init: AWSHealthDescribeEventsCommand.() -> Unit): com.amazonaws.services.health.model.DescribeEventsResult {
	return this.block.declare(AWSHealthDescribeEventsCommand().apply(init)) as com.amazonaws.services.health.model.DescribeEventsResult
}

@Generated
class AWSHealthDescribeEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.health.model.DescribeEventsRequest, com.amazonaws.services.health.model.DescribeEventsResult> {

	var filter: com.amazonaws.services.health.model.EventFilter? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var locale: String? = null

	override fun build(): com.amazonaws.services.health.model.DescribeEventsRequest {
		val input = com.amazonaws.services.health.model.DescribeEventsRequest()
		input.setFilter(this.filter)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setLocale(this.locale)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.health.model.DescribeEventsResult {
	  return com.amazonaws.services.health.model.DescribeEventsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.health.model.DescribeEventsResult {
		return environment.health.describeEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws health describe-events")
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("locale", locale)
	}

}
