
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.athena.AmazonAthena
import com.amazonaws.services.athena.model.*

var codingue.koops.core.Environment.athena: AmazonAthena
	get() = this.capabilities[AmazonAthena::class.java.name] as AmazonAthena
	set(athena) {
		this.capabilities[AmazonAthena::class.java.name] = athena
	}

@Generated
class AmazonAthenaFunctions(val block: Block)

infix fun AwsContinuation.athena(init: AmazonAthenaFunctions.() -> Unit) {
	AmazonAthenaFunctions(shell).apply(init)
}

			

fun AmazonAthenaFunctions.batchGetNamedQuery(namedQueryIds: List<String>, init: AmazonAthenaBatchGetNamedQueryCommand.() -> Unit) {
	this.block.declare(AmazonAthenaBatchGetNamedQueryCommand(namedQueryIds).apply(init))
}

@Generated
class AmazonAthenaBatchGetNamedQueryCommand(val namedQueryIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.BatchGetNamedQueryRequest> {



	override fun build(): com.amazonaws.services.athena.model.BatchGetNamedQueryRequest {
		val input = com.amazonaws.services.athena.model.BatchGetNamedQueryRequest()
		input.setNamedQueryIds(this.namedQueryIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.athena.batchGetNamedQuery(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena batch-get-named-query")
				.argument("named-query-ids", namedQueryIds.toString())
	}

}


fun AmazonAthenaFunctions.batchGetQueryExecution(queryExecutionIds: List<String>, init: AmazonAthenaBatchGetQueryExecutionCommand.() -> Unit) {
	this.block.declare(AmazonAthenaBatchGetQueryExecutionCommand(queryExecutionIds).apply(init))
}

@Generated
class AmazonAthenaBatchGetQueryExecutionCommand(val queryExecutionIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest> {



	override fun build(): com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest {
		val input = com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest()
		input.setQueryExecutionIds(this.queryExecutionIds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.athena.batchGetQueryExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena batch-get-query-execution")
				.argument("query-execution-ids", queryExecutionIds.toString())
	}

}


fun AmazonAthenaFunctions.createNamedQuery(name: String, database: String, queryString: String, init: AmazonAthenaCreateNamedQueryCommand.() -> Unit) {
	this.block.declare(AmazonAthenaCreateNamedQueryCommand(name, database, queryString).apply(init))
}

@Generated
class AmazonAthenaCreateNamedQueryCommand(val name: String, val database: String, val queryString: String) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.CreateNamedQueryRequest> {

	var description: String? = null
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.athena.model.CreateNamedQueryRequest {
		val input = com.amazonaws.services.athena.model.CreateNamedQueryRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setDatabase(this.database)
		input.setQueryString(this.queryString)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.athena.createNamedQuery(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena create-named-query")
				.argument("name", name)
				.argument("description", description)
				.argument("database", database)
				.argument("query-string", queryString)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AmazonAthenaFunctions.deleteNamedQuery(namedQueryId: String, init: AmazonAthenaDeleteNamedQueryCommand.() -> Unit) {
	this.block.declare(AmazonAthenaDeleteNamedQueryCommand(namedQueryId).apply(init))
}

@Generated
class AmazonAthenaDeleteNamedQueryCommand(val namedQueryId: String) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.DeleteNamedQueryRequest> {



	override fun build(): com.amazonaws.services.athena.model.DeleteNamedQueryRequest {
		val input = com.amazonaws.services.athena.model.DeleteNamedQueryRequest()
		input.setNamedQueryId(this.namedQueryId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.athena.deleteNamedQuery(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena delete-named-query")
				.argument("named-query-id", namedQueryId)
	}

}


fun AmazonAthenaFunctions.getNamedQuery(namedQueryId: String, init: AmazonAthenaGetNamedQueryCommand.() -> Unit) {
	this.block.declare(AmazonAthenaGetNamedQueryCommand(namedQueryId).apply(init))
}

@Generated
class AmazonAthenaGetNamedQueryCommand(val namedQueryId: String) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.GetNamedQueryRequest> {



	override fun build(): com.amazonaws.services.athena.model.GetNamedQueryRequest {
		val input = com.amazonaws.services.athena.model.GetNamedQueryRequest()
		input.setNamedQueryId(this.namedQueryId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.athena.getNamedQuery(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena get-named-query")
				.argument("named-query-id", namedQueryId)
	}

}


fun AmazonAthenaFunctions.getQueryExecution(queryExecutionId: String, init: AmazonAthenaGetQueryExecutionCommand.() -> Unit) {
	this.block.declare(AmazonAthenaGetQueryExecutionCommand(queryExecutionId).apply(init))
}

@Generated
class AmazonAthenaGetQueryExecutionCommand(val queryExecutionId: String) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.GetQueryExecutionRequest> {



	override fun build(): com.amazonaws.services.athena.model.GetQueryExecutionRequest {
		val input = com.amazonaws.services.athena.model.GetQueryExecutionRequest()
		input.setQueryExecutionId(this.queryExecutionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.athena.getQueryExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena get-query-execution")
				.argument("query-execution-id", queryExecutionId)
	}

}


fun AmazonAthenaFunctions.getQueryResults(queryExecutionId: String, init: AmazonAthenaGetQueryResultsCommand.() -> Unit) {
	this.block.declare(AmazonAthenaGetQueryResultsCommand(queryExecutionId).apply(init))
}

@Generated
class AmazonAthenaGetQueryResultsCommand(val queryExecutionId: String) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.GetQueryResultsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.athena.model.GetQueryResultsRequest {
		val input = com.amazonaws.services.athena.model.GetQueryResultsRequest()
		input.setQueryExecutionId(this.queryExecutionId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.athena.getQueryResults(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena get-query-results")
				.argument("query-execution-id", queryExecutionId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonAthenaFunctions.listNamedQueries(init: AmazonAthenaListNamedQueriesCommand.() -> Unit) {
	this.block.declare(AmazonAthenaListNamedQueriesCommand().apply(init))
}

@Generated
class AmazonAthenaListNamedQueriesCommand() : AmazonWebServiceCommand<com.amazonaws.services.athena.model.ListNamedQueriesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.athena.model.ListNamedQueriesRequest {
		val input = com.amazonaws.services.athena.model.ListNamedQueriesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.athena.listNamedQueries(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena list-named-queries")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonAthenaFunctions.listQueryExecutions(init: AmazonAthenaListQueryExecutionsCommand.() -> Unit) {
	this.block.declare(AmazonAthenaListQueryExecutionsCommand().apply(init))
}

@Generated
class AmazonAthenaListQueryExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.athena.model.ListQueryExecutionsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.athena.model.ListQueryExecutionsRequest {
		val input = com.amazonaws.services.athena.model.ListQueryExecutionsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.athena.listQueryExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena list-query-executions")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonAthenaFunctions.startQueryExecution(queryString: String, resultConfiguration: com.amazonaws.services.athena.model.ResultConfiguration, init: AmazonAthenaStartQueryExecutionCommand.() -> Unit) {
	this.block.declare(AmazonAthenaStartQueryExecutionCommand(queryString, resultConfiguration).apply(init))
}

@Generated
class AmazonAthenaStartQueryExecutionCommand(val queryString: String, val resultConfiguration: com.amazonaws.services.athena.model.ResultConfiguration) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.StartQueryExecutionRequest> {

	var clientRequestToken: String? = null
	var queryExecutionContext: com.amazonaws.services.athena.model.QueryExecutionContext? = null

	override fun build(): com.amazonaws.services.athena.model.StartQueryExecutionRequest {
		val input = com.amazonaws.services.athena.model.StartQueryExecutionRequest()
		input.setQueryString(this.queryString)
		input.setClientRequestToken(this.clientRequestToken)
		input.setQueryExecutionContext(this.queryExecutionContext)
		input.setResultConfiguration(this.resultConfiguration)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.athena.startQueryExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena start-query-execution")
				.argument("query-string", queryString)
				.argument("client-request-token", clientRequestToken)
				.argument("query-execution-context", queryExecutionContext?.toString())
				.argument("result-configuration", resultConfiguration.toString())
	}

}


fun AmazonAthenaFunctions.stopQueryExecution(queryExecutionId: String, init: AmazonAthenaStopQueryExecutionCommand.() -> Unit) {
	this.block.declare(AmazonAthenaStopQueryExecutionCommand(queryExecutionId).apply(init))
}

@Generated
class AmazonAthenaStopQueryExecutionCommand(val queryExecutionId: String) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.StopQueryExecutionRequest> {



	override fun build(): com.amazonaws.services.athena.model.StopQueryExecutionRequest {
		val input = com.amazonaws.services.athena.model.StopQueryExecutionRequest()
		input.setQueryExecutionId(this.queryExecutionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.athena.stopQueryExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena stop-query-execution")
				.argument("query-execution-id", queryExecutionId)
	}

}
