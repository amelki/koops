
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.appsync.AWSAppSync
import com.amazonaws.services.appsync.model.*

var codingue.koops.core.Environment.appsync: AWSAppSync
	get() = this.capabilities[AWSAppSync::class.java.name] as AWSAppSync
	set(appsync) {
		this.capabilities[AWSAppSync::class.java.name] = appsync
	}

@Generated
class AWSAppSyncFunctions(val block: Block)

infix fun <T> AwsContinuation.appsync(init: AWSAppSyncFunctions.() -> T): T {
	return AWSAppSyncFunctions(shell).run(init)
}

			

fun AWSAppSyncFunctions.createApiKey(init: AWSAppSyncCreateApiKeyCommand.() -> Unit): com.amazonaws.services.appsync.model.CreateApiKeyResult {
	return this.block.declare(AWSAppSyncCreateApiKeyCommand().apply(init)) as com.amazonaws.services.appsync.model.CreateApiKeyResult
}

@Generated
class AWSAppSyncCreateApiKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.CreateApiKeyRequest, com.amazonaws.services.appsync.model.CreateApiKeyResult> {

	var apiId: String? = null
	var description: String? = null
	var expires: Long? = 0L

	override fun build(): com.amazonaws.services.appsync.model.CreateApiKeyRequest {
		val input = com.amazonaws.services.appsync.model.CreateApiKeyRequest()
		input.setApiId(this.apiId)
		input.setDescription(this.description)
		input.setExpires(this.expires)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.CreateApiKeyResult {
	  return com.amazonaws.services.appsync.model.CreateApiKeyResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.CreateApiKeyResult {
		return environment.appsync.createApiKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync create-api-key")
				.argument("api-id", apiId)
				.argument("description", description)
				.argument("expires", expires?.toString())
	}

}


fun AWSAppSyncFunctions.createDataSource(init: AWSAppSyncCreateDataSourceCommand.() -> Unit): com.amazonaws.services.appsync.model.CreateDataSourceResult {
	return this.block.declare(AWSAppSyncCreateDataSourceCommand().apply(init)) as com.amazonaws.services.appsync.model.CreateDataSourceResult
}

@Generated
class AWSAppSyncCreateDataSourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.CreateDataSourceRequest, com.amazonaws.services.appsync.model.CreateDataSourceResult> {

	var apiId: String? = null
	var name: String? = null
	var description: String? = null
	var type: DataSourceType? = null
	var serviceRoleArn: String? = null
	var dynamodbConfig: com.amazonaws.services.appsync.model.DynamodbDataSourceConfig? = null
	var lambdaConfig: com.amazonaws.services.appsync.model.LambdaDataSourceConfig? = null
	var elasticsearchConfig: com.amazonaws.services.appsync.model.ElasticsearchDataSourceConfig? = null

	override fun build(): com.amazonaws.services.appsync.model.CreateDataSourceRequest {
		val input = com.amazonaws.services.appsync.model.CreateDataSourceRequest()
		input.setApiId(this.apiId)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setType(this.type?.toString())
		input.setServiceRoleArn(this.serviceRoleArn)
		input.setDynamodbConfig(this.dynamodbConfig)
		input.setLambdaConfig(this.lambdaConfig)
		input.setElasticsearchConfig(this.elasticsearchConfig)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.CreateDataSourceResult {
	  return com.amazonaws.services.appsync.model.CreateDataSourceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.CreateDataSourceResult {
		return environment.appsync.createDataSource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync create-data-source")
				.argument("api-id", apiId)
				.argument("name", name)
				.argument("description", description)
				.argument("type", type?.toString())
				.argument("service-role-arn", serviceRoleArn)
				.argument("dynamodb-config", dynamodbConfig?.toString())
				.argument("lambda-config", lambdaConfig?.toString())
				.argument("elasticsearch-config", elasticsearchConfig?.toString())
	}

}


fun AWSAppSyncFunctions.createGraphqlApi(init: AWSAppSyncCreateGraphqlApiCommand.() -> Unit): com.amazonaws.services.appsync.model.CreateGraphqlApiResult {
	return this.block.declare(AWSAppSyncCreateGraphqlApiCommand().apply(init)) as com.amazonaws.services.appsync.model.CreateGraphqlApiResult
}

@Generated
class AWSAppSyncCreateGraphqlApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.CreateGraphqlApiRequest, com.amazonaws.services.appsync.model.CreateGraphqlApiResult> {

	var name: String? = null
	var authenticationType: AuthenticationType? = null
	var userPoolConfig: com.amazonaws.services.appsync.model.UserPoolConfig? = null

	override fun build(): com.amazonaws.services.appsync.model.CreateGraphqlApiRequest {
		val input = com.amazonaws.services.appsync.model.CreateGraphqlApiRequest()
		input.setName(this.name)
		input.setAuthenticationType(this.authenticationType?.toString())
		input.setUserPoolConfig(this.userPoolConfig)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.CreateGraphqlApiResult {
	  return com.amazonaws.services.appsync.model.CreateGraphqlApiResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.CreateGraphqlApiResult {
		return environment.appsync.createGraphqlApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync create-graphql-api")
				.argument("name", name)
				.argument("authentication-type", authenticationType?.toString())
				.argument("user-pool-config", userPoolConfig?.toString())
	}

}


fun AWSAppSyncFunctions.createResolver(init: AWSAppSyncCreateResolverCommand.() -> Unit): com.amazonaws.services.appsync.model.CreateResolverResult {
	return this.block.declare(AWSAppSyncCreateResolverCommand().apply(init)) as com.amazonaws.services.appsync.model.CreateResolverResult
}

@Generated
class AWSAppSyncCreateResolverCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.CreateResolverRequest, com.amazonaws.services.appsync.model.CreateResolverResult> {

	var apiId: String? = null
	var typeName: String? = null
	var fieldName: String? = null
	var dataSourceName: String? = null
	var requestMappingTemplate: String? = null
	var responseMappingTemplate: String? = null

	override fun build(): com.amazonaws.services.appsync.model.CreateResolverRequest {
		val input = com.amazonaws.services.appsync.model.CreateResolverRequest()
		input.setApiId(this.apiId)
		input.setTypeName(this.typeName)
		input.setFieldName(this.fieldName)
		input.setDataSourceName(this.dataSourceName)
		input.setRequestMappingTemplate(this.requestMappingTemplate)
		input.setResponseMappingTemplate(this.responseMappingTemplate)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.CreateResolverResult {
	  return com.amazonaws.services.appsync.model.CreateResolverResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.CreateResolverResult {
		return environment.appsync.createResolver(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync create-resolver")
				.argument("api-id", apiId)
				.argument("type-name", typeName)
				.argument("field-name", fieldName)
				.argument("data-source-name", dataSourceName)
				.argument("request-mapping-template", requestMappingTemplate)
				.argument("response-mapping-template", responseMappingTemplate)
	}

}


fun AWSAppSyncFunctions.createType(init: AWSAppSyncCreateTypeCommand.() -> Unit): com.amazonaws.services.appsync.model.CreateTypeResult {
	return this.block.declare(AWSAppSyncCreateTypeCommand().apply(init)) as com.amazonaws.services.appsync.model.CreateTypeResult
}

@Generated
class AWSAppSyncCreateTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.CreateTypeRequest, com.amazonaws.services.appsync.model.CreateTypeResult> {

	var apiId: String? = null
	var definition: String? = null
	var format: TypeDefinitionFormat? = null

	override fun build(): com.amazonaws.services.appsync.model.CreateTypeRequest {
		val input = com.amazonaws.services.appsync.model.CreateTypeRequest()
		input.setApiId(this.apiId)
		input.setDefinition(this.definition)
		input.setFormat(this.format?.toString())
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.CreateTypeResult {
	  return com.amazonaws.services.appsync.model.CreateTypeResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.CreateTypeResult {
		return environment.appsync.createType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync create-type")
				.argument("api-id", apiId)
				.argument("definition", definition)
				.argument("format", format?.toString())
	}

}


fun AWSAppSyncFunctions.deleteApiKey(init: AWSAppSyncDeleteApiKeyCommand.() -> Unit): com.amazonaws.services.appsync.model.DeleteApiKeyResult {
	return this.block.declare(AWSAppSyncDeleteApiKeyCommand().apply(init)) as com.amazonaws.services.appsync.model.DeleteApiKeyResult
}

@Generated
class AWSAppSyncDeleteApiKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.DeleteApiKeyRequest, com.amazonaws.services.appsync.model.DeleteApiKeyResult> {

	var apiId: String? = null
	var id: String? = null

	override fun build(): com.amazonaws.services.appsync.model.DeleteApiKeyRequest {
		val input = com.amazonaws.services.appsync.model.DeleteApiKeyRequest()
		input.setApiId(this.apiId)
		input.setId(this.id)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.DeleteApiKeyResult {
	  return com.amazonaws.services.appsync.model.DeleteApiKeyResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.DeleteApiKeyResult {
		return environment.appsync.deleteApiKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync delete-api-key")
				.argument("api-id", apiId)
				.argument("id", id)
	}

}


fun AWSAppSyncFunctions.deleteDataSource(init: AWSAppSyncDeleteDataSourceCommand.() -> Unit): com.amazonaws.services.appsync.model.DeleteDataSourceResult {
	return this.block.declare(AWSAppSyncDeleteDataSourceCommand().apply(init)) as com.amazonaws.services.appsync.model.DeleteDataSourceResult
}

@Generated
class AWSAppSyncDeleteDataSourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.DeleteDataSourceRequest, com.amazonaws.services.appsync.model.DeleteDataSourceResult> {

	var apiId: String? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.appsync.model.DeleteDataSourceRequest {
		val input = com.amazonaws.services.appsync.model.DeleteDataSourceRequest()
		input.setApiId(this.apiId)
		input.setName(this.name)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.DeleteDataSourceResult {
	  return com.amazonaws.services.appsync.model.DeleteDataSourceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.DeleteDataSourceResult {
		return environment.appsync.deleteDataSource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync delete-data-source")
				.argument("api-id", apiId)
				.argument("name", name)
	}

}


fun AWSAppSyncFunctions.deleteGraphqlApi(init: AWSAppSyncDeleteGraphqlApiCommand.() -> Unit): com.amazonaws.services.appsync.model.DeleteGraphqlApiResult {
	return this.block.declare(AWSAppSyncDeleteGraphqlApiCommand().apply(init)) as com.amazonaws.services.appsync.model.DeleteGraphqlApiResult
}

@Generated
class AWSAppSyncDeleteGraphqlApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest, com.amazonaws.services.appsync.model.DeleteGraphqlApiResult> {

	var apiId: String? = null

	override fun build(): com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest {
		val input = com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest()
		input.setApiId(this.apiId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.DeleteGraphqlApiResult {
	  return com.amazonaws.services.appsync.model.DeleteGraphqlApiResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.DeleteGraphqlApiResult {
		return environment.appsync.deleteGraphqlApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync delete-graphql-api")
				.argument("api-id", apiId)
	}

}


fun AWSAppSyncFunctions.deleteResolver(init: AWSAppSyncDeleteResolverCommand.() -> Unit): com.amazonaws.services.appsync.model.DeleteResolverResult {
	return this.block.declare(AWSAppSyncDeleteResolverCommand().apply(init)) as com.amazonaws.services.appsync.model.DeleteResolverResult
}

@Generated
class AWSAppSyncDeleteResolverCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.DeleteResolverRequest, com.amazonaws.services.appsync.model.DeleteResolverResult> {

	var apiId: String? = null
	var typeName: String? = null
	var fieldName: String? = null

	override fun build(): com.amazonaws.services.appsync.model.DeleteResolverRequest {
		val input = com.amazonaws.services.appsync.model.DeleteResolverRequest()
		input.setApiId(this.apiId)
		input.setTypeName(this.typeName)
		input.setFieldName(this.fieldName)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.DeleteResolverResult {
	  return com.amazonaws.services.appsync.model.DeleteResolverResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.DeleteResolverResult {
		return environment.appsync.deleteResolver(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync delete-resolver")
				.argument("api-id", apiId)
				.argument("type-name", typeName)
				.argument("field-name", fieldName)
	}

}


fun AWSAppSyncFunctions.deleteType(init: AWSAppSyncDeleteTypeCommand.() -> Unit): com.amazonaws.services.appsync.model.DeleteTypeResult {
	return this.block.declare(AWSAppSyncDeleteTypeCommand().apply(init)) as com.amazonaws.services.appsync.model.DeleteTypeResult
}

@Generated
class AWSAppSyncDeleteTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.DeleteTypeRequest, com.amazonaws.services.appsync.model.DeleteTypeResult> {

	var apiId: String? = null
	var typeName: String? = null

	override fun build(): com.amazonaws.services.appsync.model.DeleteTypeRequest {
		val input = com.amazonaws.services.appsync.model.DeleteTypeRequest()
		input.setApiId(this.apiId)
		input.setTypeName(this.typeName)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.DeleteTypeResult {
	  return com.amazonaws.services.appsync.model.DeleteTypeResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.DeleteTypeResult {
		return environment.appsync.deleteType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync delete-type")
				.argument("api-id", apiId)
				.argument("type-name", typeName)
	}

}


fun AWSAppSyncFunctions.getDataSource(init: AWSAppSyncGetDataSourceCommand.() -> Unit): com.amazonaws.services.appsync.model.GetDataSourceResult {
	return this.block.declare(AWSAppSyncGetDataSourceCommand().apply(init)) as com.amazonaws.services.appsync.model.GetDataSourceResult
}

@Generated
class AWSAppSyncGetDataSourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.GetDataSourceRequest, com.amazonaws.services.appsync.model.GetDataSourceResult> {

	var apiId: String? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.appsync.model.GetDataSourceRequest {
		val input = com.amazonaws.services.appsync.model.GetDataSourceRequest()
		input.setApiId(this.apiId)
		input.setName(this.name)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.GetDataSourceResult {
	  return com.amazonaws.services.appsync.model.GetDataSourceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.GetDataSourceResult {
		return environment.appsync.getDataSource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync get-data-source")
				.argument("api-id", apiId)
				.argument("name", name)
	}

}


fun AWSAppSyncFunctions.getGraphqlApi(init: AWSAppSyncGetGraphqlApiCommand.() -> Unit): com.amazonaws.services.appsync.model.GetGraphqlApiResult {
	return this.block.declare(AWSAppSyncGetGraphqlApiCommand().apply(init)) as com.amazonaws.services.appsync.model.GetGraphqlApiResult
}

@Generated
class AWSAppSyncGetGraphqlApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.GetGraphqlApiRequest, com.amazonaws.services.appsync.model.GetGraphqlApiResult> {

	var apiId: String? = null

	override fun build(): com.amazonaws.services.appsync.model.GetGraphqlApiRequest {
		val input = com.amazonaws.services.appsync.model.GetGraphqlApiRequest()
		input.setApiId(this.apiId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.GetGraphqlApiResult {
	  return com.amazonaws.services.appsync.model.GetGraphqlApiResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.GetGraphqlApiResult {
		return environment.appsync.getGraphqlApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync get-graphql-api")
				.argument("api-id", apiId)
	}

}


fun AWSAppSyncFunctions.getIntrospectionSchema(init: AWSAppSyncGetIntrospectionSchemaCommand.() -> Unit): com.amazonaws.services.appsync.model.GetIntrospectionSchemaResult {
	return this.block.declare(AWSAppSyncGetIntrospectionSchemaCommand().apply(init)) as com.amazonaws.services.appsync.model.GetIntrospectionSchemaResult
}

@Generated
class AWSAppSyncGetIntrospectionSchemaCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest, com.amazonaws.services.appsync.model.GetIntrospectionSchemaResult> {

	var apiId: String? = null
	var format: OutputType? = null

	override fun build(): com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest {
		val input = com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest()
		input.setApiId(this.apiId)
		input.setFormat(this.format?.toString())
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.GetIntrospectionSchemaResult {
	  return com.amazonaws.services.appsync.model.GetIntrospectionSchemaResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.GetIntrospectionSchemaResult {
		return environment.appsync.getIntrospectionSchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync get-introspection-schema")
				.argument("api-id", apiId)
				.argument("format", format?.toString())
	}

}


fun AWSAppSyncFunctions.getResolver(init: AWSAppSyncGetResolverCommand.() -> Unit): com.amazonaws.services.appsync.model.GetResolverResult {
	return this.block.declare(AWSAppSyncGetResolverCommand().apply(init)) as com.amazonaws.services.appsync.model.GetResolverResult
}

@Generated
class AWSAppSyncGetResolverCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.GetResolverRequest, com.amazonaws.services.appsync.model.GetResolverResult> {

	var apiId: String? = null
	var typeName: String? = null
	var fieldName: String? = null

	override fun build(): com.amazonaws.services.appsync.model.GetResolverRequest {
		val input = com.amazonaws.services.appsync.model.GetResolverRequest()
		input.setApiId(this.apiId)
		input.setTypeName(this.typeName)
		input.setFieldName(this.fieldName)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.GetResolverResult {
	  return com.amazonaws.services.appsync.model.GetResolverResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.GetResolverResult {
		return environment.appsync.getResolver(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync get-resolver")
				.argument("api-id", apiId)
				.argument("type-name", typeName)
				.argument("field-name", fieldName)
	}

}


fun AWSAppSyncFunctions.getSchemaCreationStatus(init: AWSAppSyncGetSchemaCreationStatusCommand.() -> Unit): com.amazonaws.services.appsync.model.GetSchemaCreationStatusResult {
	return this.block.declare(AWSAppSyncGetSchemaCreationStatusCommand().apply(init)) as com.amazonaws.services.appsync.model.GetSchemaCreationStatusResult
}

@Generated
class AWSAppSyncGetSchemaCreationStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest, com.amazonaws.services.appsync.model.GetSchemaCreationStatusResult> {

	var apiId: String? = null

	override fun build(): com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest {
		val input = com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest()
		input.setApiId(this.apiId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.GetSchemaCreationStatusResult {
	  return com.amazonaws.services.appsync.model.GetSchemaCreationStatusResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.GetSchemaCreationStatusResult {
		return environment.appsync.getSchemaCreationStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync get-schema-creation-status")
				.argument("api-id", apiId)
	}

}


fun AWSAppSyncFunctions.getType(init: AWSAppSyncGetTypeCommand.() -> Unit): com.amazonaws.services.appsync.model.GetTypeResult {
	return this.block.declare(AWSAppSyncGetTypeCommand().apply(init)) as com.amazonaws.services.appsync.model.GetTypeResult
}

@Generated
class AWSAppSyncGetTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.GetTypeRequest, com.amazonaws.services.appsync.model.GetTypeResult> {

	var apiId: String? = null
	var typeName: String? = null
	var format: TypeDefinitionFormat? = null

	override fun build(): com.amazonaws.services.appsync.model.GetTypeRequest {
		val input = com.amazonaws.services.appsync.model.GetTypeRequest()
		input.setApiId(this.apiId)
		input.setTypeName(this.typeName)
		input.setFormat(this.format?.toString())
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.GetTypeResult {
	  return com.amazonaws.services.appsync.model.GetTypeResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.GetTypeResult {
		return environment.appsync.getType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync get-type")
				.argument("api-id", apiId)
				.argument("type-name", typeName)
				.argument("format", format?.toString())
	}

}


fun AWSAppSyncFunctions.listApiKeys(init: AWSAppSyncListApiKeysCommand.() -> Unit): com.amazonaws.services.appsync.model.ListApiKeysResult {
	return this.block.declare(AWSAppSyncListApiKeysCommand().apply(init)) as com.amazonaws.services.appsync.model.ListApiKeysResult
}

@Generated
class AWSAppSyncListApiKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.ListApiKeysRequest, com.amazonaws.services.appsync.model.ListApiKeysResult> {

	var apiId: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.appsync.model.ListApiKeysRequest {
		val input = com.amazonaws.services.appsync.model.ListApiKeysRequest()
		input.setApiId(this.apiId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.ListApiKeysResult {
	  return com.amazonaws.services.appsync.model.ListApiKeysResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.ListApiKeysResult {
		return environment.appsync.listApiKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync list-api-keys")
				.argument("api-id", apiId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSAppSyncFunctions.listDataSources(init: AWSAppSyncListDataSourcesCommand.() -> Unit): com.amazonaws.services.appsync.model.ListDataSourcesResult {
	return this.block.declare(AWSAppSyncListDataSourcesCommand().apply(init)) as com.amazonaws.services.appsync.model.ListDataSourcesResult
}

@Generated
class AWSAppSyncListDataSourcesCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.ListDataSourcesRequest, com.amazonaws.services.appsync.model.ListDataSourcesResult> {

	var apiId: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.appsync.model.ListDataSourcesRequest {
		val input = com.amazonaws.services.appsync.model.ListDataSourcesRequest()
		input.setApiId(this.apiId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.ListDataSourcesResult {
	  return com.amazonaws.services.appsync.model.ListDataSourcesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.ListDataSourcesResult {
		return environment.appsync.listDataSources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync list-data-sources")
				.argument("api-id", apiId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSAppSyncFunctions.listGraphqlApis(init: AWSAppSyncListGraphqlApisCommand.() -> Unit): com.amazonaws.services.appsync.model.ListGraphqlApisResult {
	return this.block.declare(AWSAppSyncListGraphqlApisCommand().apply(init)) as com.amazonaws.services.appsync.model.ListGraphqlApisResult
}

@Generated
class AWSAppSyncListGraphqlApisCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.ListGraphqlApisRequest, com.amazonaws.services.appsync.model.ListGraphqlApisResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.appsync.model.ListGraphqlApisRequest {
		val input = com.amazonaws.services.appsync.model.ListGraphqlApisRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.ListGraphqlApisResult {
	  return com.amazonaws.services.appsync.model.ListGraphqlApisResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.ListGraphqlApisResult {
		return environment.appsync.listGraphqlApis(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync list-graphql-apis")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSAppSyncFunctions.listResolvers(init: AWSAppSyncListResolversCommand.() -> Unit): com.amazonaws.services.appsync.model.ListResolversResult {
	return this.block.declare(AWSAppSyncListResolversCommand().apply(init)) as com.amazonaws.services.appsync.model.ListResolversResult
}

@Generated
class AWSAppSyncListResolversCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.ListResolversRequest, com.amazonaws.services.appsync.model.ListResolversResult> {

	var apiId: String? = null
	var typeName: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.appsync.model.ListResolversRequest {
		val input = com.amazonaws.services.appsync.model.ListResolversRequest()
		input.setApiId(this.apiId)
		input.setTypeName(this.typeName)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.ListResolversResult {
	  return com.amazonaws.services.appsync.model.ListResolversResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.ListResolversResult {
		return environment.appsync.listResolvers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync list-resolvers")
				.argument("api-id", apiId)
				.argument("type-name", typeName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSAppSyncFunctions.listTypes(init: AWSAppSyncListTypesCommand.() -> Unit): com.amazonaws.services.appsync.model.ListTypesResult {
	return this.block.declare(AWSAppSyncListTypesCommand().apply(init)) as com.amazonaws.services.appsync.model.ListTypesResult
}

@Generated
class AWSAppSyncListTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.ListTypesRequest, com.amazonaws.services.appsync.model.ListTypesResult> {

	var apiId: String? = null
	var format: TypeDefinitionFormat? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.appsync.model.ListTypesRequest {
		val input = com.amazonaws.services.appsync.model.ListTypesRequest()
		input.setApiId(this.apiId)
		input.setFormat(this.format?.toString())
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.ListTypesResult {
	  return com.amazonaws.services.appsync.model.ListTypesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.ListTypesResult {
		return environment.appsync.listTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync list-types")
				.argument("api-id", apiId)
				.argument("format", format?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSAppSyncFunctions.startSchemaCreation(init: AWSAppSyncStartSchemaCreationCommand.() -> Unit): com.amazonaws.services.appsync.model.StartSchemaCreationResult {
	return this.block.declare(AWSAppSyncStartSchemaCreationCommand().apply(init)) as com.amazonaws.services.appsync.model.StartSchemaCreationResult
}

@Generated
class AWSAppSyncStartSchemaCreationCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.StartSchemaCreationRequest, com.amazonaws.services.appsync.model.StartSchemaCreationResult> {

	var apiId: String? = null
	var definition: java.nio.ByteBuffer? = null

	override fun build(): com.amazonaws.services.appsync.model.StartSchemaCreationRequest {
		val input = com.amazonaws.services.appsync.model.StartSchemaCreationRequest()
		input.setApiId(this.apiId)
		input.setDefinition(this.definition)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.StartSchemaCreationResult {
	  return com.amazonaws.services.appsync.model.StartSchemaCreationResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.StartSchemaCreationResult {
		return environment.appsync.startSchemaCreation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync start-schema-creation")
				.argument("api-id", apiId)
				.argument("definition", definition?.toString())
	}

}


fun AWSAppSyncFunctions.updateApiKey(init: AWSAppSyncUpdateApiKeyCommand.() -> Unit): com.amazonaws.services.appsync.model.UpdateApiKeyResult {
	return this.block.declare(AWSAppSyncUpdateApiKeyCommand().apply(init)) as com.amazonaws.services.appsync.model.UpdateApiKeyResult
}

@Generated
class AWSAppSyncUpdateApiKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.UpdateApiKeyRequest, com.amazonaws.services.appsync.model.UpdateApiKeyResult> {

	var apiId: String? = null
	var id: String? = null
	var description: String? = null
	var expires: Long? = 0L

	override fun build(): com.amazonaws.services.appsync.model.UpdateApiKeyRequest {
		val input = com.amazonaws.services.appsync.model.UpdateApiKeyRequest()
		input.setApiId(this.apiId)
		input.setId(this.id)
		input.setDescription(this.description)
		input.setExpires(this.expires)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.UpdateApiKeyResult {
	  return com.amazonaws.services.appsync.model.UpdateApiKeyResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.UpdateApiKeyResult {
		return environment.appsync.updateApiKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync update-api-key")
				.argument("api-id", apiId)
				.argument("id", id)
				.argument("description", description)
				.argument("expires", expires?.toString())
	}

}


fun AWSAppSyncFunctions.updateDataSource(init: AWSAppSyncUpdateDataSourceCommand.() -> Unit): com.amazonaws.services.appsync.model.UpdateDataSourceResult {
	return this.block.declare(AWSAppSyncUpdateDataSourceCommand().apply(init)) as com.amazonaws.services.appsync.model.UpdateDataSourceResult
}

@Generated
class AWSAppSyncUpdateDataSourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.UpdateDataSourceRequest, com.amazonaws.services.appsync.model.UpdateDataSourceResult> {

	var apiId: String? = null
	var name: String? = null
	var description: String? = null
	var type: DataSourceType? = null
	var serviceRoleArn: String? = null
	var dynamodbConfig: com.amazonaws.services.appsync.model.DynamodbDataSourceConfig? = null
	var lambdaConfig: com.amazonaws.services.appsync.model.LambdaDataSourceConfig? = null
	var elasticsearchConfig: com.amazonaws.services.appsync.model.ElasticsearchDataSourceConfig? = null

	override fun build(): com.amazonaws.services.appsync.model.UpdateDataSourceRequest {
		val input = com.amazonaws.services.appsync.model.UpdateDataSourceRequest()
		input.setApiId(this.apiId)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setType(this.type?.toString())
		input.setServiceRoleArn(this.serviceRoleArn)
		input.setDynamodbConfig(this.dynamodbConfig)
		input.setLambdaConfig(this.lambdaConfig)
		input.setElasticsearchConfig(this.elasticsearchConfig)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.UpdateDataSourceResult {
	  return com.amazonaws.services.appsync.model.UpdateDataSourceResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.UpdateDataSourceResult {
		return environment.appsync.updateDataSource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync update-data-source")
				.argument("api-id", apiId)
				.argument("name", name)
				.argument("description", description)
				.argument("type", type?.toString())
				.argument("service-role-arn", serviceRoleArn)
				.argument("dynamodb-config", dynamodbConfig?.toString())
				.argument("lambda-config", lambdaConfig?.toString())
				.argument("elasticsearch-config", elasticsearchConfig?.toString())
	}

}


fun AWSAppSyncFunctions.updateGraphqlApi(init: AWSAppSyncUpdateGraphqlApiCommand.() -> Unit): com.amazonaws.services.appsync.model.UpdateGraphqlApiResult {
	return this.block.declare(AWSAppSyncUpdateGraphqlApiCommand().apply(init)) as com.amazonaws.services.appsync.model.UpdateGraphqlApiResult
}

@Generated
class AWSAppSyncUpdateGraphqlApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.UpdateGraphqlApiRequest, com.amazonaws.services.appsync.model.UpdateGraphqlApiResult> {

	var apiId: String? = null
	var name: String? = null
	var authenticationType: AuthenticationType? = null
	var userPoolConfig: com.amazonaws.services.appsync.model.UserPoolConfig? = null

	override fun build(): com.amazonaws.services.appsync.model.UpdateGraphqlApiRequest {
		val input = com.amazonaws.services.appsync.model.UpdateGraphqlApiRequest()
		input.setApiId(this.apiId)
		input.setName(this.name)
		input.setAuthenticationType(this.authenticationType?.toString())
		input.setUserPoolConfig(this.userPoolConfig)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.UpdateGraphqlApiResult {
	  return com.amazonaws.services.appsync.model.UpdateGraphqlApiResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.UpdateGraphqlApiResult {
		return environment.appsync.updateGraphqlApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync update-graphql-api")
				.argument("api-id", apiId)
				.argument("name", name)
				.argument("authentication-type", authenticationType?.toString())
				.argument("user-pool-config", userPoolConfig?.toString())
	}

}


fun AWSAppSyncFunctions.updateResolver(init: AWSAppSyncUpdateResolverCommand.() -> Unit): com.amazonaws.services.appsync.model.UpdateResolverResult {
	return this.block.declare(AWSAppSyncUpdateResolverCommand().apply(init)) as com.amazonaws.services.appsync.model.UpdateResolverResult
}

@Generated
class AWSAppSyncUpdateResolverCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.UpdateResolverRequest, com.amazonaws.services.appsync.model.UpdateResolverResult> {

	var apiId: String? = null
	var typeName: String? = null
	var fieldName: String? = null
	var dataSourceName: String? = null
	var requestMappingTemplate: String? = null
	var responseMappingTemplate: String? = null

	override fun build(): com.amazonaws.services.appsync.model.UpdateResolverRequest {
		val input = com.amazonaws.services.appsync.model.UpdateResolverRequest()
		input.setApiId(this.apiId)
		input.setTypeName(this.typeName)
		input.setFieldName(this.fieldName)
		input.setDataSourceName(this.dataSourceName)
		input.setRequestMappingTemplate(this.requestMappingTemplate)
		input.setResponseMappingTemplate(this.responseMappingTemplate)
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.UpdateResolverResult {
	  return com.amazonaws.services.appsync.model.UpdateResolverResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.UpdateResolverResult {
		return environment.appsync.updateResolver(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync update-resolver")
				.argument("api-id", apiId)
				.argument("type-name", typeName)
				.argument("field-name", fieldName)
				.argument("data-source-name", dataSourceName)
				.argument("request-mapping-template", requestMappingTemplate)
				.argument("response-mapping-template", responseMappingTemplate)
	}

}


fun AWSAppSyncFunctions.updateType(init: AWSAppSyncUpdateTypeCommand.() -> Unit): com.amazonaws.services.appsync.model.UpdateTypeResult {
	return this.block.declare(AWSAppSyncUpdateTypeCommand().apply(init)) as com.amazonaws.services.appsync.model.UpdateTypeResult
}

@Generated
class AWSAppSyncUpdateTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.UpdateTypeRequest, com.amazonaws.services.appsync.model.UpdateTypeResult> {

	var apiId: String? = null
	var typeName: String? = null
	var definition: String? = null
	var format: TypeDefinitionFormat? = null

	override fun build(): com.amazonaws.services.appsync.model.UpdateTypeRequest {
		val input = com.amazonaws.services.appsync.model.UpdateTypeRequest()
		input.setApiId(this.apiId)
		input.setTypeName(this.typeName)
		input.setDefinition(this.definition)
		input.setFormat(this.format?.toString())
		return input
	}

	override fun dryResult(): com.amazonaws.services.appsync.model.UpdateTypeResult {
	  return com.amazonaws.services.appsync.model.UpdateTypeResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.appsync.model.UpdateTypeResult {
		return environment.appsync.updateType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync update-type")
				.argument("api-id", apiId)
				.argument("type-name", typeName)
				.argument("definition", definition)
				.argument("format", format?.toString())
	}

}
