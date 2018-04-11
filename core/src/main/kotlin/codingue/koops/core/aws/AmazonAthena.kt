
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.athena.AmazonAthena
import com.amazonaws.services.athena.AmazonAthenaClientBuilder
import com.amazonaws.services.athena.model.*

var codingue.koops.core.Environment.athena: AmazonAthena
	get() {
		var service = this.capabilities[AmazonAthena::class.java.name]
		if (service == null) {
			service = AmazonAthenaClientBuilder.standard().build()
			athena = service
		}
		return service as AmazonAthena
	}
	set(athena) {
		this.capabilities[AmazonAthena::class.java.name] = athena
	}

@Generated
class AmazonAthenaFunctions(val block: Block)

infix fun <T> AwsContinuation.athena(init: AmazonAthenaFunctions.() -> T): T {
	return AmazonAthenaFunctions(shell).run(init)
}

			

fun AmazonAthenaFunctions.batchGetNamedQuery(namedQueryIds: List<String>, init: AmazonAthenaBatchGetNamedQueryCommand.() -> Unit): com.amazonaws.services.athena.model.BatchGetNamedQueryResult {
	return this.block.declare(AmazonAthenaBatchGetNamedQueryCommand(namedQueryIds).apply(init)) as com.amazonaws.services.athena.model.BatchGetNamedQueryResult
}

@Generated
class AmazonAthenaBatchGetNamedQueryCommand(val namedQueryIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.BatchGetNamedQueryRequest, com.amazonaws.services.athena.model.BatchGetNamedQueryResult> {



	override fun build(): com.amazonaws.services.athena.model.BatchGetNamedQueryRequest {
		val input = com.amazonaws.services.athena.model.BatchGetNamedQueryRequest()
		input.setNamedQueryIds(this.namedQueryIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.athena.model.BatchGetNamedQueryResult {
	  return com.amazonaws.services.athena.model.BatchGetNamedQueryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.athena.model.BatchGetNamedQueryResult {
		return environment.athena.batchGetNamedQuery(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena batch-get-named-query")
				.argument("named-query-ids", namedQueryIds.toString())
	}

}


fun AmazonAthenaFunctions.batchGetQueryExecution(queryExecutionIds: List<String>, init: AmazonAthenaBatchGetQueryExecutionCommand.() -> Unit): com.amazonaws.services.athena.model.BatchGetQueryExecutionResult {
	return this.block.declare(AmazonAthenaBatchGetQueryExecutionCommand(queryExecutionIds).apply(init)) as com.amazonaws.services.athena.model.BatchGetQueryExecutionResult
}

@Generated
class AmazonAthenaBatchGetQueryExecutionCommand(val queryExecutionIds: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest, com.amazonaws.services.athena.model.BatchGetQueryExecutionResult> {



	override fun build(): com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest {
		val input = com.amazonaws.services.athena.model.BatchGetQueryExecutionRequest()
		input.setQueryExecutionIds(this.queryExecutionIds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.athena.model.BatchGetQueryExecutionResult {
	  return com.amazonaws.services.athena.model.BatchGetQueryExecutionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.athena.model.BatchGetQueryExecutionResult {
		return environment.athena.batchGetQueryExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena batch-get-query-execution")
				.argument("query-execution-ids", queryExecutionIds.toString())
	}

}


fun AmazonAthenaFunctions.createNamedQuery(name: String, database: String, queryString: String, init: AmazonAthenaCreateNamedQueryCommand.() -> Unit): com.amazonaws.services.athena.model.CreateNamedQueryResult {
	return this.block.declare(AmazonAthenaCreateNamedQueryCommand(name, database, queryString).apply(init)) as com.amazonaws.services.athena.model.CreateNamedQueryResult
}

@Generated
class AmazonAthenaCreateNamedQueryCommand(val name: String, val database: String, val queryString: String) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.CreateNamedQueryRequest, com.amazonaws.services.athena.model.CreateNamedQueryResult> {

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

	
	override fun dryResult(): com.amazonaws.services.athena.model.CreateNamedQueryResult {
	  return com.amazonaws.services.athena.model.CreateNamedQueryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.athena.model.CreateNamedQueryResult {
		return environment.athena.createNamedQuery(build())
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


fun AmazonAthenaFunctions.deleteNamedQuery(namedQueryId: String, init: AmazonAthenaDeleteNamedQueryCommand.() -> Unit): com.amazonaws.services.athena.model.DeleteNamedQueryResult {
	return this.block.declare(AmazonAthenaDeleteNamedQueryCommand(namedQueryId).apply(init)) as com.amazonaws.services.athena.model.DeleteNamedQueryResult
}

@Generated
class AmazonAthenaDeleteNamedQueryCommand(val namedQueryId: String) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.DeleteNamedQueryRequest, com.amazonaws.services.athena.model.DeleteNamedQueryResult> {



	override fun build(): com.amazonaws.services.athena.model.DeleteNamedQueryRequest {
		val input = com.amazonaws.services.athena.model.DeleteNamedQueryRequest()
		input.setNamedQueryId(this.namedQueryId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.athena.model.DeleteNamedQueryResult {
	  return com.amazonaws.services.athena.model.DeleteNamedQueryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.athena.model.DeleteNamedQueryResult {
		return environment.athena.deleteNamedQuery(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena delete-named-query")
				.argument("named-query-id", namedQueryId)
	}

}


fun AmazonAthenaFunctions.getNamedQuery(namedQueryId: String, init: AmazonAthenaGetNamedQueryCommand.() -> Unit): com.amazonaws.services.athena.model.GetNamedQueryResult {
	return this.block.declare(AmazonAthenaGetNamedQueryCommand(namedQueryId).apply(init)) as com.amazonaws.services.athena.model.GetNamedQueryResult
}

@Generated
class AmazonAthenaGetNamedQueryCommand(val namedQueryId: String) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.GetNamedQueryRequest, com.amazonaws.services.athena.model.GetNamedQueryResult> {



	override fun build(): com.amazonaws.services.athena.model.GetNamedQueryRequest {
		val input = com.amazonaws.services.athena.model.GetNamedQueryRequest()
		input.setNamedQueryId(this.namedQueryId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.athena.model.GetNamedQueryResult {
	  return com.amazonaws.services.athena.model.GetNamedQueryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.athena.model.GetNamedQueryResult {
		return environment.athena.getNamedQuery(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena get-named-query")
				.argument("named-query-id", namedQueryId)
	}

}


fun AmazonAthenaFunctions.getQueryExecution(queryExecutionId: String, init: AmazonAthenaGetQueryExecutionCommand.() -> Unit): com.amazonaws.services.athena.model.GetQueryExecutionResult {
	return this.block.declare(AmazonAthenaGetQueryExecutionCommand(queryExecutionId).apply(init)) as com.amazonaws.services.athena.model.GetQueryExecutionResult
}

@Generated
class AmazonAthenaGetQueryExecutionCommand(val queryExecutionId: String) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.GetQueryExecutionRequest, com.amazonaws.services.athena.model.GetQueryExecutionResult> {



	override fun build(): com.amazonaws.services.athena.model.GetQueryExecutionRequest {
		val input = com.amazonaws.services.athena.model.GetQueryExecutionRequest()
		input.setQueryExecutionId(this.queryExecutionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.athena.model.GetQueryExecutionResult {
	  return com.amazonaws.services.athena.model.GetQueryExecutionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.athena.model.GetQueryExecutionResult {
		return environment.athena.getQueryExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena get-query-execution")
				.argument("query-execution-id", queryExecutionId)
	}

}


fun AmazonAthenaFunctions.getQueryResults(queryExecutionId: String, init: AmazonAthenaGetQueryResultsCommand.() -> Unit): com.amazonaws.services.athena.model.GetQueryResultsResult {
	return this.block.declare(AmazonAthenaGetQueryResultsCommand(queryExecutionId).apply(init)) as com.amazonaws.services.athena.model.GetQueryResultsResult
}

@Generated
class AmazonAthenaGetQueryResultsCommand(val queryExecutionId: String) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.GetQueryResultsRequest, com.amazonaws.services.athena.model.GetQueryResultsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.athena.model.GetQueryResultsRequest {
		val input = com.amazonaws.services.athena.model.GetQueryResultsRequest()
		input.setQueryExecutionId(this.queryExecutionId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.athena.model.GetQueryResultsResult {
	  return com.amazonaws.services.athena.model.GetQueryResultsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.athena.model.GetQueryResultsResult {
		return environment.athena.getQueryResults(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena get-query-results")
				.argument("query-execution-id", queryExecutionId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonAthenaFunctions.listNamedQueries(init: AmazonAthenaListNamedQueriesCommand.() -> Unit): com.amazonaws.services.athena.model.ListNamedQueriesResult {
	return this.block.declare(AmazonAthenaListNamedQueriesCommand().apply(init)) as com.amazonaws.services.athena.model.ListNamedQueriesResult
}

@Generated
class AmazonAthenaListNamedQueriesCommand() : AmazonWebServiceCommand<com.amazonaws.services.athena.model.ListNamedQueriesRequest, com.amazonaws.services.athena.model.ListNamedQueriesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.athena.model.ListNamedQueriesRequest {
		val input = com.amazonaws.services.athena.model.ListNamedQueriesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.athena.model.ListNamedQueriesResult {
	  return com.amazonaws.services.athena.model.ListNamedQueriesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.athena.model.ListNamedQueriesResult {
		return environment.athena.listNamedQueries(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena list-named-queries")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonAthenaFunctions.listQueryExecutions(init: AmazonAthenaListQueryExecutionsCommand.() -> Unit): com.amazonaws.services.athena.model.ListQueryExecutionsResult {
	return this.block.declare(AmazonAthenaListQueryExecutionsCommand().apply(init)) as com.amazonaws.services.athena.model.ListQueryExecutionsResult
}

@Generated
class AmazonAthenaListQueryExecutionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.athena.model.ListQueryExecutionsRequest, com.amazonaws.services.athena.model.ListQueryExecutionsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.athena.model.ListQueryExecutionsRequest {
		val input = com.amazonaws.services.athena.model.ListQueryExecutionsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.athena.model.ListQueryExecutionsResult {
	  return com.amazonaws.services.athena.model.ListQueryExecutionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.athena.model.ListQueryExecutionsResult {
		return environment.athena.listQueryExecutions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena list-query-executions")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonAthenaFunctions.startQueryExecution(queryString: String, resultConfiguration: com.amazonaws.services.athena.model.ResultConfiguration, init: AmazonAthenaStartQueryExecutionCommand.() -> Unit): com.amazonaws.services.athena.model.StartQueryExecutionResult {
	return this.block.declare(AmazonAthenaStartQueryExecutionCommand(queryString, resultConfiguration).apply(init)) as com.amazonaws.services.athena.model.StartQueryExecutionResult
}

@Generated
class AmazonAthenaStartQueryExecutionCommand(val queryString: String, val resultConfiguration: com.amazonaws.services.athena.model.ResultConfiguration) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.StartQueryExecutionRequest, com.amazonaws.services.athena.model.StartQueryExecutionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.athena.model.StartQueryExecutionResult {
	  return com.amazonaws.services.athena.model.StartQueryExecutionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.athena.model.StartQueryExecutionResult {
		return environment.athena.startQueryExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena start-query-execution")
				.argument("query-string", queryString)
				.argument("client-request-token", clientRequestToken)
				.argument("query-execution-context", queryExecutionContext?.toString())
				.argument("result-configuration", resultConfiguration.toString())
	}

}


fun AmazonAthenaFunctions.stopQueryExecution(queryExecutionId: String, init: AmazonAthenaStopQueryExecutionCommand.() -> Unit): com.amazonaws.services.athena.model.StopQueryExecutionResult {
	return this.block.declare(AmazonAthenaStopQueryExecutionCommand(queryExecutionId).apply(init)) as com.amazonaws.services.athena.model.StopQueryExecutionResult
}

@Generated
class AmazonAthenaStopQueryExecutionCommand(val queryExecutionId: String) : AmazonWebServiceCommand<com.amazonaws.services.athena.model.StopQueryExecutionRequest, com.amazonaws.services.athena.model.StopQueryExecutionResult> {



	override fun build(): com.amazonaws.services.athena.model.StopQueryExecutionRequest {
		val input = com.amazonaws.services.athena.model.StopQueryExecutionRequest()
		input.setQueryExecutionId(this.queryExecutionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.athena.model.StopQueryExecutionResult {
	  return com.amazonaws.services.athena.model.StopQueryExecutionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.athena.model.StopQueryExecutionResult {
		return environment.athena.stopQueryExecution(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws athena stop-query-execution")
				.argument("query-execution-id", queryExecutionId)
	}

}
