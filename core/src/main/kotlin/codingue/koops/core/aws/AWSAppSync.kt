
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

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

infix fun AwsContinuation.appsync(init: AWSAppSyncFunctions.() -> Unit) {
	AWSAppSyncFunctions(shell).apply(init)
}

			

fun AWSAppSyncFunctions.createApiKey(init: AWSAppSyncCreateApiKeyCommand.() -> Unit) {
	this.block.declare(AWSAppSyncCreateApiKeyCommand().apply(init))
}

@Generated
class AWSAppSyncCreateApiKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.CreateApiKeyRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.createApiKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync create-api-key")
				.argument("api-id", apiId)
				.argument("description", description)
				.argument("expires", expires?.toString())
	}

}


fun AWSAppSyncFunctions.createDataSource(init: AWSAppSyncCreateDataSourceCommand.() -> Unit) {
	this.block.declare(AWSAppSyncCreateDataSourceCommand().apply(init))
}

@Generated
class AWSAppSyncCreateDataSourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.CreateDataSourceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.createDataSource(build())
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


fun AWSAppSyncFunctions.createGraphqlApi(init: AWSAppSyncCreateGraphqlApiCommand.() -> Unit) {
	this.block.declare(AWSAppSyncCreateGraphqlApiCommand().apply(init))
}

@Generated
class AWSAppSyncCreateGraphqlApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.CreateGraphqlApiRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.createGraphqlApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync create-graphql-api")
				.argument("name", name)
				.argument("authentication-type", authenticationType?.toString())
				.argument("user-pool-config", userPoolConfig?.toString())
	}

}


fun AWSAppSyncFunctions.createResolver(init: AWSAppSyncCreateResolverCommand.() -> Unit) {
	this.block.declare(AWSAppSyncCreateResolverCommand().apply(init))
}

@Generated
class AWSAppSyncCreateResolverCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.CreateResolverRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.createResolver(build())
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


fun AWSAppSyncFunctions.createType(init: AWSAppSyncCreateTypeCommand.() -> Unit) {
	this.block.declare(AWSAppSyncCreateTypeCommand().apply(init))
}

@Generated
class AWSAppSyncCreateTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.CreateTypeRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.createType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync create-type")
				.argument("api-id", apiId)
				.argument("definition", definition)
				.argument("format", format?.toString())
	}

}


fun AWSAppSyncFunctions.deleteApiKey(init: AWSAppSyncDeleteApiKeyCommand.() -> Unit) {
	this.block.declare(AWSAppSyncDeleteApiKeyCommand().apply(init))
}

@Generated
class AWSAppSyncDeleteApiKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.DeleteApiKeyRequest> {

	var apiId: String? = null
	var id: String? = null

	override fun build(): com.amazonaws.services.appsync.model.DeleteApiKeyRequest {
		val input = com.amazonaws.services.appsync.model.DeleteApiKeyRequest()
		input.setApiId(this.apiId)
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.deleteApiKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync delete-api-key")
				.argument("api-id", apiId)
				.argument("id", id)
	}

}


fun AWSAppSyncFunctions.deleteDataSource(init: AWSAppSyncDeleteDataSourceCommand.() -> Unit) {
	this.block.declare(AWSAppSyncDeleteDataSourceCommand().apply(init))
}

@Generated
class AWSAppSyncDeleteDataSourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.DeleteDataSourceRequest> {

	var apiId: String? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.appsync.model.DeleteDataSourceRequest {
		val input = com.amazonaws.services.appsync.model.DeleteDataSourceRequest()
		input.setApiId(this.apiId)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.deleteDataSource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync delete-data-source")
				.argument("api-id", apiId)
				.argument("name", name)
	}

}


fun AWSAppSyncFunctions.deleteGraphqlApi(init: AWSAppSyncDeleteGraphqlApiCommand.() -> Unit) {
	this.block.declare(AWSAppSyncDeleteGraphqlApiCommand().apply(init))
}

@Generated
class AWSAppSyncDeleteGraphqlApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest> {

	var apiId: String? = null

	override fun build(): com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest {
		val input = com.amazonaws.services.appsync.model.DeleteGraphqlApiRequest()
		input.setApiId(this.apiId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.deleteGraphqlApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync delete-graphql-api")
				.argument("api-id", apiId)
	}

}


fun AWSAppSyncFunctions.deleteResolver(init: AWSAppSyncDeleteResolverCommand.() -> Unit) {
	this.block.declare(AWSAppSyncDeleteResolverCommand().apply(init))
}

@Generated
class AWSAppSyncDeleteResolverCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.DeleteResolverRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.deleteResolver(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync delete-resolver")
				.argument("api-id", apiId)
				.argument("type-name", typeName)
				.argument("field-name", fieldName)
	}

}


fun AWSAppSyncFunctions.deleteType(init: AWSAppSyncDeleteTypeCommand.() -> Unit) {
	this.block.declare(AWSAppSyncDeleteTypeCommand().apply(init))
}

@Generated
class AWSAppSyncDeleteTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.DeleteTypeRequest> {

	var apiId: String? = null
	var typeName: String? = null

	override fun build(): com.amazonaws.services.appsync.model.DeleteTypeRequest {
		val input = com.amazonaws.services.appsync.model.DeleteTypeRequest()
		input.setApiId(this.apiId)
		input.setTypeName(this.typeName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.deleteType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync delete-type")
				.argument("api-id", apiId)
				.argument("type-name", typeName)
	}

}


fun AWSAppSyncFunctions.getDataSource(init: AWSAppSyncGetDataSourceCommand.() -> Unit) {
	this.block.declare(AWSAppSyncGetDataSourceCommand().apply(init))
}

@Generated
class AWSAppSyncGetDataSourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.GetDataSourceRequest> {

	var apiId: String? = null
	var name: String? = null

	override fun build(): com.amazonaws.services.appsync.model.GetDataSourceRequest {
		val input = com.amazonaws.services.appsync.model.GetDataSourceRequest()
		input.setApiId(this.apiId)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.getDataSource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync get-data-source")
				.argument("api-id", apiId)
				.argument("name", name)
	}

}


fun AWSAppSyncFunctions.getGraphqlApi(init: AWSAppSyncGetGraphqlApiCommand.() -> Unit) {
	this.block.declare(AWSAppSyncGetGraphqlApiCommand().apply(init))
}

@Generated
class AWSAppSyncGetGraphqlApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.GetGraphqlApiRequest> {

	var apiId: String? = null

	override fun build(): com.amazonaws.services.appsync.model.GetGraphqlApiRequest {
		val input = com.amazonaws.services.appsync.model.GetGraphqlApiRequest()
		input.setApiId(this.apiId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.getGraphqlApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync get-graphql-api")
				.argument("api-id", apiId)
	}

}


fun AWSAppSyncFunctions.getIntrospectionSchema(init: AWSAppSyncGetIntrospectionSchemaCommand.() -> Unit) {
	this.block.declare(AWSAppSyncGetIntrospectionSchemaCommand().apply(init))
}

@Generated
class AWSAppSyncGetIntrospectionSchemaCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest> {

	var apiId: String? = null
	var format: OutputType? = null

	override fun build(): com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest {
		val input = com.amazonaws.services.appsync.model.GetIntrospectionSchemaRequest()
		input.setApiId(this.apiId)
		input.setFormat(this.format?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.getIntrospectionSchema(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync get-introspection-schema")
				.argument("api-id", apiId)
				.argument("format", format?.toString())
	}

}


fun AWSAppSyncFunctions.getResolver(init: AWSAppSyncGetResolverCommand.() -> Unit) {
	this.block.declare(AWSAppSyncGetResolverCommand().apply(init))
}

@Generated
class AWSAppSyncGetResolverCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.GetResolverRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.getResolver(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync get-resolver")
				.argument("api-id", apiId)
				.argument("type-name", typeName)
				.argument("field-name", fieldName)
	}

}


fun AWSAppSyncFunctions.getSchemaCreationStatus(init: AWSAppSyncGetSchemaCreationStatusCommand.() -> Unit) {
	this.block.declare(AWSAppSyncGetSchemaCreationStatusCommand().apply(init))
}

@Generated
class AWSAppSyncGetSchemaCreationStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest> {

	var apiId: String? = null

	override fun build(): com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest {
		val input = com.amazonaws.services.appsync.model.GetSchemaCreationStatusRequest()
		input.setApiId(this.apiId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.getSchemaCreationStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync get-schema-creation-status")
				.argument("api-id", apiId)
	}

}


fun AWSAppSyncFunctions.getType(init: AWSAppSyncGetTypeCommand.() -> Unit) {
	this.block.declare(AWSAppSyncGetTypeCommand().apply(init))
}

@Generated
class AWSAppSyncGetTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.GetTypeRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.getType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync get-type")
				.argument("api-id", apiId)
				.argument("type-name", typeName)
				.argument("format", format?.toString())
	}

}


fun AWSAppSyncFunctions.listApiKeys(init: AWSAppSyncListApiKeysCommand.() -> Unit) {
	this.block.declare(AWSAppSyncListApiKeysCommand().apply(init))
}

@Generated
class AWSAppSyncListApiKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.ListApiKeysRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.listApiKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync list-api-keys")
				.argument("api-id", apiId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSAppSyncFunctions.listDataSources(init: AWSAppSyncListDataSourcesCommand.() -> Unit) {
	this.block.declare(AWSAppSyncListDataSourcesCommand().apply(init))
}

@Generated
class AWSAppSyncListDataSourcesCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.ListDataSourcesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.listDataSources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync list-data-sources")
				.argument("api-id", apiId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSAppSyncFunctions.listGraphqlApis(init: AWSAppSyncListGraphqlApisCommand.() -> Unit) {
	this.block.declare(AWSAppSyncListGraphqlApisCommand().apply(init))
}

@Generated
class AWSAppSyncListGraphqlApisCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.ListGraphqlApisRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.appsync.model.ListGraphqlApisRequest {
		val input = com.amazonaws.services.appsync.model.ListGraphqlApisRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.listGraphqlApis(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync list-graphql-apis")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSAppSyncFunctions.listResolvers(init: AWSAppSyncListResolversCommand.() -> Unit) {
	this.block.declare(AWSAppSyncListResolversCommand().apply(init))
}

@Generated
class AWSAppSyncListResolversCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.ListResolversRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.listResolvers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync list-resolvers")
				.argument("api-id", apiId)
				.argument("type-name", typeName)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSAppSyncFunctions.listTypes(init: AWSAppSyncListTypesCommand.() -> Unit) {
	this.block.declare(AWSAppSyncListTypesCommand().apply(init))
}

@Generated
class AWSAppSyncListTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.ListTypesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.listTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync list-types")
				.argument("api-id", apiId)
				.argument("format", format?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSAppSyncFunctions.startSchemaCreation(init: AWSAppSyncStartSchemaCreationCommand.() -> Unit) {
	this.block.declare(AWSAppSyncStartSchemaCreationCommand().apply(init))
}

@Generated
class AWSAppSyncStartSchemaCreationCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.StartSchemaCreationRequest> {

	var apiId: String? = null
	var definition: java.nio.ByteBuffer? = null

	override fun build(): com.amazonaws.services.appsync.model.StartSchemaCreationRequest {
		val input = com.amazonaws.services.appsync.model.StartSchemaCreationRequest()
		input.setApiId(this.apiId)
		input.setDefinition(this.definition)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.startSchemaCreation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync start-schema-creation")
				.argument("api-id", apiId)
				.argument("definition", definition?.toString())
	}

}


fun AWSAppSyncFunctions.updateApiKey(init: AWSAppSyncUpdateApiKeyCommand.() -> Unit) {
	this.block.declare(AWSAppSyncUpdateApiKeyCommand().apply(init))
}

@Generated
class AWSAppSyncUpdateApiKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.UpdateApiKeyRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.updateApiKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync update-api-key")
				.argument("api-id", apiId)
				.argument("id", id)
				.argument("description", description)
				.argument("expires", expires?.toString())
	}

}


fun AWSAppSyncFunctions.updateDataSource(init: AWSAppSyncUpdateDataSourceCommand.() -> Unit) {
	this.block.declare(AWSAppSyncUpdateDataSourceCommand().apply(init))
}

@Generated
class AWSAppSyncUpdateDataSourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.UpdateDataSourceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.updateDataSource(build())
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


fun AWSAppSyncFunctions.updateGraphqlApi(init: AWSAppSyncUpdateGraphqlApiCommand.() -> Unit) {
	this.block.declare(AWSAppSyncUpdateGraphqlApiCommand().apply(init))
}

@Generated
class AWSAppSyncUpdateGraphqlApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.UpdateGraphqlApiRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.updateGraphqlApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync update-graphql-api")
				.argument("api-id", apiId)
				.argument("name", name)
				.argument("authentication-type", authenticationType?.toString())
				.argument("user-pool-config", userPoolConfig?.toString())
	}

}


fun AWSAppSyncFunctions.updateResolver(init: AWSAppSyncUpdateResolverCommand.() -> Unit) {
	this.block.declare(AWSAppSyncUpdateResolverCommand().apply(init))
}

@Generated
class AWSAppSyncUpdateResolverCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.UpdateResolverRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.updateResolver(build())
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


fun AWSAppSyncFunctions.updateType(init: AWSAppSyncUpdateTypeCommand.() -> Unit) {
	this.block.declare(AWSAppSyncUpdateTypeCommand().apply(init))
}

@Generated
class AWSAppSyncUpdateTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.appsync.model.UpdateTypeRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.appsync.updateType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws appsync update-type")
				.argument("api-id", apiId)
				.argument("type-name", typeName)
				.argument("definition", definition)
				.argument("format", format?.toString())
	}

}
