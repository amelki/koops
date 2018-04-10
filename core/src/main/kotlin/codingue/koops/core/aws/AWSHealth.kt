
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.health.AWSHealth
import com.amazonaws.services.health.model.*

var codingue.koops.core.Environment.health: AWSHealth
	get() = this.capabilities[AWSHealth::class.java.name] as AWSHealth
	set(health) {
		this.capabilities[AWSHealth::class.java.name] = health
	}

@Generated
class AWSHealthFunctions(val block: Block)

infix fun AwsContinuation.health(init: AWSHealthFunctions.() -> Unit) {
	AWSHealthFunctions(shell).apply(init)
}

			

fun AWSHealthFunctions.describeAffectedEntities(init: AWSHealthDescribeAffectedEntitiesCommand.() -> Unit) {
	this.block.declare(AWSHealthDescribeAffectedEntitiesCommand().apply(init))
}

@Generated
class AWSHealthDescribeAffectedEntitiesCommand() : AmazonWebServiceCommand<com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.health.describeAffectedEntities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws health describe-affected-entities")
				.argument("filter", filter?.toString())
				.argument("locale", locale)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSHealthFunctions.describeEntityAggregates(init: AWSHealthDescribeEntityAggregatesCommand.() -> Unit) {
	this.block.declare(AWSHealthDescribeEntityAggregatesCommand().apply(init))
}

@Generated
class AWSHealthDescribeEntityAggregatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.health.model.DescribeEntityAggregatesRequest> {

	var eventArns: List<String>? = null

	override fun build(): com.amazonaws.services.health.model.DescribeEntityAggregatesRequest {
		val input = com.amazonaws.services.health.model.DescribeEntityAggregatesRequest()
		input.setEventArns(this.eventArns)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.health.describeEntityAggregates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws health describe-entity-aggregates")
				.argument("event-arns", eventArns?.toString())
	}

}


fun AWSHealthFunctions.describeEventAggregates(init: AWSHealthDescribeEventAggregatesCommand.() -> Unit) {
	this.block.declare(AWSHealthDescribeEventAggregatesCommand().apply(init))
}

@Generated
class AWSHealthDescribeEventAggregatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.health.model.DescribeEventAggregatesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.health.describeEventAggregates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws health describe-event-aggregates")
				.argument("filter", filter?.toString())
				.argument("aggregate-field", aggregateField)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSHealthFunctions.describeEventDetails(init: AWSHealthDescribeEventDetailsCommand.() -> Unit) {
	this.block.declare(AWSHealthDescribeEventDetailsCommand().apply(init))
}

@Generated
class AWSHealthDescribeEventDetailsCommand() : AmazonWebServiceCommand<com.amazonaws.services.health.model.DescribeEventDetailsRequest> {

	var eventArns: List<String>? = null
	var locale: String? = null

	override fun build(): com.amazonaws.services.health.model.DescribeEventDetailsRequest {
		val input = com.amazonaws.services.health.model.DescribeEventDetailsRequest()
		input.setEventArns(this.eventArns)
		input.setLocale(this.locale)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.health.describeEventDetails(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws health describe-event-details")
				.argument("event-arns", eventArns?.toString())
				.argument("locale", locale)
	}

}


fun AWSHealthFunctions.describeEventTypes(init: AWSHealthDescribeEventTypesCommand.() -> Unit) {
	this.block.declare(AWSHealthDescribeEventTypesCommand().apply(init))
}

@Generated
class AWSHealthDescribeEventTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.health.model.DescribeEventTypesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.health.describeEventTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws health describe-event-types")
				.argument("filter", filter?.toString())
				.argument("locale", locale)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSHealthFunctions.describeEvents(init: AWSHealthDescribeEventsCommand.() -> Unit) {
	this.block.declare(AWSHealthDescribeEventsCommand().apply(init))
}

@Generated
class AWSHealthDescribeEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.health.model.DescribeEventsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.health.describeEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws health describe-events")
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("locale", locale)
	}

}
