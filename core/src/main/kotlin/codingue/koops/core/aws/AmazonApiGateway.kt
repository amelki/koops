
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.apigateway.AmazonApiGateway
import com.amazonaws.services.apigateway.model.*

var codingue.koops.core.Environment.apigateway: AmazonApiGateway
	get() = this.capabilities[AmazonApiGateway::class.java.name] as AmazonApiGateway
	set(apigateway) {
		this.capabilities[AmazonApiGateway::class.java.name] = apigateway
	}

@Generated
class AmazonApiGatewayFunctions(val block: Block)

infix fun <T> AwsContinuation.apigateway(init: AmazonApiGatewayFunctions.() -> T): T {
	return AmazonApiGatewayFunctions(shell).run(init)
}

			

fun AmazonApiGatewayFunctions.createApiKey(init: AmazonApiGatewayCreateApiKeyCommand.() -> Unit): com.amazonaws.services.apigateway.model.CreateApiKeyResult {
	return this.block.declare(AmazonApiGatewayCreateApiKeyCommand().apply(init)) as com.amazonaws.services.apigateway.model.CreateApiKeyResult
}

@Generated
class AmazonApiGatewayCreateApiKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateApiKeyRequest, com.amazonaws.services.apigateway.model.CreateApiKeyResult> {

	var name: String? = null
	var description: String? = null
	var enabled: Boolean? = false
	var generateDistinctId: Boolean? = false
	var value: String? = null
	var stageKeys: List<com.amazonaws.services.apigateway.model.StageKey>? = null
	var customerId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.CreateApiKeyRequest {
		val input = com.amazonaws.services.apigateway.model.CreateApiKeyRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setEnabled(this.enabled)
		input.setGenerateDistinctId(this.generateDistinctId)
		input.setValue(this.value)
		input.setStageKeys(this.stageKeys)
		input.setCustomerId(this.customerId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.CreateApiKeyResult {
	  return com.amazonaws.services.apigateway.model.CreateApiKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.CreateApiKeyResult {
		return environment.apigateway.createApiKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-api-key")
				.argument("name", name)
				.argument("description", description)
				.option("enabled", enabled ?: false)
				.option("generate-distinct-id", generateDistinctId ?: false)
				.argument("value", value)
				.argument("stage-keys", stageKeys?.toString())
				.argument("customer-id", customerId)
	}

}


fun AmazonApiGatewayFunctions.createAuthorizer(init: AmazonApiGatewayCreateAuthorizerCommand.() -> Unit): com.amazonaws.services.apigateway.model.CreateAuthorizerResult {
	return this.block.declare(AmazonApiGatewayCreateAuthorizerCommand().apply(init)) as com.amazonaws.services.apigateway.model.CreateAuthorizerResult
}

@Generated
class AmazonApiGatewayCreateAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateAuthorizerRequest, com.amazonaws.services.apigateway.model.CreateAuthorizerResult> {

	var restApiId: String? = null
	var name: String? = null
	var type: AuthorizerType? = null
	var providerARNs: List<String>? = null
	var authType: String? = null
	var authorizerUri: String? = null
	var authorizerCredentials: String? = null
	var identitySource: String? = null
	var identityValidationExpression: String? = null
	var authorizerResultTtlInSeconds: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.CreateAuthorizerRequest {
		val input = com.amazonaws.services.apigateway.model.CreateAuthorizerRequest()
		input.setRestApiId(this.restApiId)
		input.setName(this.name)
		input.setType(this.type?.toString())
		input.setProviderARNs(this.providerARNs)
		input.setAuthType(this.authType)
		input.setAuthorizerUri(this.authorizerUri)
		input.setAuthorizerCredentials(this.authorizerCredentials)
		input.setIdentitySource(this.identitySource)
		input.setIdentityValidationExpression(this.identityValidationExpression)
		input.setAuthorizerResultTtlInSeconds(this.authorizerResultTtlInSeconds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.CreateAuthorizerResult {
	  return com.amazonaws.services.apigateway.model.CreateAuthorizerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.CreateAuthorizerResult {
		return environment.apigateway.createAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-authorizer")
				.argument("rest-api-id", restApiId)
				.argument("name", name)
				.argument("type", type?.toString())
				.argument("provider-arns", providerARNs?.toString())
				.argument("auth-type", authType)
				.argument("authorizer-uri", authorizerUri)
				.argument("authorizer-credentials", authorizerCredentials)
				.argument("identity-source", identitySource)
				.argument("identity-validation-expression", identityValidationExpression)
				.argument("authorizer-result-ttl-in-seconds", authorizerResultTtlInSeconds?.toString())
	}

}


fun AmazonApiGatewayFunctions.createBasePathMapping(init: AmazonApiGatewayCreateBasePathMappingCommand.() -> Unit): com.amazonaws.services.apigateway.model.CreateBasePathMappingResult {
	return this.block.declare(AmazonApiGatewayCreateBasePathMappingCommand().apply(init)) as com.amazonaws.services.apigateway.model.CreateBasePathMappingResult
}

@Generated
class AmazonApiGatewayCreateBasePathMappingCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateBasePathMappingRequest, com.amazonaws.services.apigateway.model.CreateBasePathMappingResult> {

	var domainName: String? = null
	var basePath: String? = null
	var restApiId: String? = null
	var stage: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.CreateBasePathMappingRequest {
		val input = com.amazonaws.services.apigateway.model.CreateBasePathMappingRequest()
		input.setDomainName(this.domainName)
		input.setBasePath(this.basePath)
		input.setRestApiId(this.restApiId)
		input.setStage(this.stage)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.CreateBasePathMappingResult {
	  return com.amazonaws.services.apigateway.model.CreateBasePathMappingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.CreateBasePathMappingResult {
		return environment.apigateway.createBasePathMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-base-path-mapping")
				.argument("domain-name", domainName)
				.argument("base-path", basePath)
				.argument("rest-api-id", restApiId)
				.argument("stage", stage)
	}

}


fun AmazonApiGatewayFunctions.createDeployment(init: AmazonApiGatewayCreateDeploymentCommand.() -> Unit): com.amazonaws.services.apigateway.model.CreateDeploymentResult {
	return this.block.declare(AmazonApiGatewayCreateDeploymentCommand().apply(init)) as com.amazonaws.services.apigateway.model.CreateDeploymentResult
}

@Generated
class AmazonApiGatewayCreateDeploymentCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateDeploymentRequest, com.amazonaws.services.apigateway.model.CreateDeploymentResult> {

	var restApiId: String? = null
	var stageName: String? = null
	var stageDescription: String? = null
	var description: String? = null
	var cacheClusterEnabled: Boolean? = false
	var cacheClusterSize: String? = null
	var variables: Map<String, String>? = null
	var canarySettings: com.amazonaws.services.apigateway.model.DeploymentCanarySettings? = null

	override fun build(): com.amazonaws.services.apigateway.model.CreateDeploymentRequest {
		val input = com.amazonaws.services.apigateway.model.CreateDeploymentRequest()
		input.setRestApiId(this.restApiId)
		input.setStageName(this.stageName)
		input.setStageDescription(this.stageDescription)
		input.setDescription(this.description)
		input.setCacheClusterEnabled(this.cacheClusterEnabled)
		input.setCacheClusterSize(this.cacheClusterSize)
		input.setVariables(this.variables)
		input.setCanarySettings(this.canarySettings)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.CreateDeploymentResult {
	  return com.amazonaws.services.apigateway.model.CreateDeploymentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.CreateDeploymentResult {
		return environment.apigateway.createDeployment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-deployment")
				.argument("rest-api-id", restApiId)
				.argument("stage-name", stageName)
				.argument("stage-description", stageDescription)
				.argument("description", description)
				.option("cache-cluster-enabled", cacheClusterEnabled ?: false)
				.argument("cache-cluster-size", cacheClusterSize)
				.argument("variables", variables?.toString())
				.argument("canary-settings", canarySettings?.toString())
	}

}


fun AmazonApiGatewayFunctions.createDocumentationPart(init: AmazonApiGatewayCreateDocumentationPartCommand.() -> Unit): com.amazonaws.services.apigateway.model.CreateDocumentationPartResult {
	return this.block.declare(AmazonApiGatewayCreateDocumentationPartCommand().apply(init)) as com.amazonaws.services.apigateway.model.CreateDocumentationPartResult
}

@Generated
class AmazonApiGatewayCreateDocumentationPartCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateDocumentationPartRequest, com.amazonaws.services.apigateway.model.CreateDocumentationPartResult> {

	var restApiId: String? = null
	var location: com.amazonaws.services.apigateway.model.DocumentationPartLocation? = null
	var properties: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.CreateDocumentationPartRequest {
		val input = com.amazonaws.services.apigateway.model.CreateDocumentationPartRequest()
		input.setRestApiId(this.restApiId)
		input.setLocation(this.location)
		input.setProperties(this.properties)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.CreateDocumentationPartResult {
	  return com.amazonaws.services.apigateway.model.CreateDocumentationPartResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.CreateDocumentationPartResult {
		return environment.apigateway.createDocumentationPart(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-documentation-part")
				.argument("rest-api-id", restApiId)
				.argument("location", location?.toString())
				.argument("properties", properties)
	}

}


fun AmazonApiGatewayFunctions.createDocumentationVersion(init: AmazonApiGatewayCreateDocumentationVersionCommand.() -> Unit): com.amazonaws.services.apigateway.model.CreateDocumentationVersionResult {
	return this.block.declare(AmazonApiGatewayCreateDocumentationVersionCommand().apply(init)) as com.amazonaws.services.apigateway.model.CreateDocumentationVersionResult
}

@Generated
class AmazonApiGatewayCreateDocumentationVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateDocumentationVersionRequest, com.amazonaws.services.apigateway.model.CreateDocumentationVersionResult> {

	var restApiId: String? = null
	var documentationVersion: String? = null
	var stageName: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.CreateDocumentationVersionRequest {
		val input = com.amazonaws.services.apigateway.model.CreateDocumentationVersionRequest()
		input.setRestApiId(this.restApiId)
		input.setDocumentationVersion(this.documentationVersion)
		input.setStageName(this.stageName)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.CreateDocumentationVersionResult {
	  return com.amazonaws.services.apigateway.model.CreateDocumentationVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.CreateDocumentationVersionResult {
		return environment.apigateway.createDocumentationVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-documentation-version")
				.argument("rest-api-id", restApiId)
				.argument("documentation-version", documentationVersion)
				.argument("stage-name", stageName)
				.argument("description", description)
	}

}


fun AmazonApiGatewayFunctions.createDomainName(init: AmazonApiGatewayCreateDomainNameCommand.() -> Unit): com.amazonaws.services.apigateway.model.CreateDomainNameResult {
	return this.block.declare(AmazonApiGatewayCreateDomainNameCommand().apply(init)) as com.amazonaws.services.apigateway.model.CreateDomainNameResult
}

@Generated
class AmazonApiGatewayCreateDomainNameCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateDomainNameRequest, com.amazonaws.services.apigateway.model.CreateDomainNameResult> {

	var domainName: String? = null
	var certificateName: String? = null
	var certificateBody: String? = null
	var certificatePrivateKey: String? = null
	var certificateChain: String? = null
	var certificateArn: String? = null
	var regionalCertificateName: String? = null
	var regionalCertificateArn: String? = null
	var endpointConfiguration: com.amazonaws.services.apigateway.model.EndpointConfiguration? = null

	override fun build(): com.amazonaws.services.apigateway.model.CreateDomainNameRequest {
		val input = com.amazonaws.services.apigateway.model.CreateDomainNameRequest()
		input.setDomainName(this.domainName)
		input.setCertificateName(this.certificateName)
		input.setCertificateBody(this.certificateBody)
		input.setCertificatePrivateKey(this.certificatePrivateKey)
		input.setCertificateChain(this.certificateChain)
		input.setCertificateArn(this.certificateArn)
		input.setRegionalCertificateName(this.regionalCertificateName)
		input.setRegionalCertificateArn(this.regionalCertificateArn)
		input.setEndpointConfiguration(this.endpointConfiguration)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.CreateDomainNameResult {
	  return com.amazonaws.services.apigateway.model.CreateDomainNameResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.CreateDomainNameResult {
		return environment.apigateway.createDomainName(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-domain-name")
				.argument("domain-name", domainName)
				.argument("certificate-name", certificateName)
				.argument("certificate-body", certificateBody)
				.argument("certificate-private-key", certificatePrivateKey)
				.argument("certificate-chain", certificateChain)
				.argument("certificate-arn", certificateArn)
				.argument("regional-certificate-name", regionalCertificateName)
				.argument("regional-certificate-arn", regionalCertificateArn)
				.argument("endpoint-configuration", endpointConfiguration?.toString())
	}

}


fun AmazonApiGatewayFunctions.createModel(init: AmazonApiGatewayCreateModelCommand.() -> Unit): com.amazonaws.services.apigateway.model.CreateModelResult {
	return this.block.declare(AmazonApiGatewayCreateModelCommand().apply(init)) as com.amazonaws.services.apigateway.model.CreateModelResult
}

@Generated
class AmazonApiGatewayCreateModelCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateModelRequest, com.amazonaws.services.apigateway.model.CreateModelResult> {

	var restApiId: String? = null
	var name: String? = null
	var description: String? = null
	var schema: String? = null
	var contentType: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.CreateModelRequest {
		val input = com.amazonaws.services.apigateway.model.CreateModelRequest()
		input.setRestApiId(this.restApiId)
		input.setName(this.name)
		input.setDescription(this.description)
		input.setSchema(this.schema)
		input.setContentType(this.contentType)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.CreateModelResult {
	  return com.amazonaws.services.apigateway.model.CreateModelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.CreateModelResult {
		return environment.apigateway.createModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-model")
				.argument("rest-api-id", restApiId)
				.argument("name", name)
				.argument("description", description)
				.argument("schema", schema)
				.argument("content-type", contentType)
	}

}


fun AmazonApiGatewayFunctions.createRequestValidator(init: AmazonApiGatewayCreateRequestValidatorCommand.() -> Unit): com.amazonaws.services.apigateway.model.CreateRequestValidatorResult {
	return this.block.declare(AmazonApiGatewayCreateRequestValidatorCommand().apply(init)) as com.amazonaws.services.apigateway.model.CreateRequestValidatorResult
}

@Generated
class AmazonApiGatewayCreateRequestValidatorCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateRequestValidatorRequest, com.amazonaws.services.apigateway.model.CreateRequestValidatorResult> {

	var restApiId: String? = null
	var name: String? = null
	var validateRequestBody: Boolean? = false
	var validateRequestParameters: Boolean? = false

	override fun build(): com.amazonaws.services.apigateway.model.CreateRequestValidatorRequest {
		val input = com.amazonaws.services.apigateway.model.CreateRequestValidatorRequest()
		input.setRestApiId(this.restApiId)
		input.setName(this.name)
		input.setValidateRequestBody(this.validateRequestBody)
		input.setValidateRequestParameters(this.validateRequestParameters)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.CreateRequestValidatorResult {
	  return com.amazonaws.services.apigateway.model.CreateRequestValidatorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.CreateRequestValidatorResult {
		return environment.apigateway.createRequestValidator(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-request-validator")
				.argument("rest-api-id", restApiId)
				.argument("name", name)
				.option("validate-request-body", validateRequestBody ?: false)
				.option("validate-request-parameters", validateRequestParameters ?: false)
	}

}


fun AmazonApiGatewayFunctions.createResource(init: AmazonApiGatewayCreateResourceCommand.() -> Unit): com.amazonaws.services.apigateway.model.CreateResourceResult {
	return this.block.declare(AmazonApiGatewayCreateResourceCommand().apply(init)) as com.amazonaws.services.apigateway.model.CreateResourceResult
}

@Generated
class AmazonApiGatewayCreateResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateResourceRequest, com.amazonaws.services.apigateway.model.CreateResourceResult> {

	var restApiId: String? = null
	var parentId: String? = null
	var pathPart: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.CreateResourceRequest {
		val input = com.amazonaws.services.apigateway.model.CreateResourceRequest()
		input.setRestApiId(this.restApiId)
		input.setParentId(this.parentId)
		input.setPathPart(this.pathPart)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.CreateResourceResult {
	  return com.amazonaws.services.apigateway.model.CreateResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.CreateResourceResult {
		return environment.apigateway.createResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-resource")
				.argument("rest-api-id", restApiId)
				.argument("parent-id", parentId)
				.argument("path-part", pathPart)
	}

}


fun AmazonApiGatewayFunctions.createRestApi(init: AmazonApiGatewayCreateRestApiCommand.() -> Unit): com.amazonaws.services.apigateway.model.CreateRestApiResult {
	return this.block.declare(AmazonApiGatewayCreateRestApiCommand().apply(init)) as com.amazonaws.services.apigateway.model.CreateRestApiResult
}

@Generated
class AmazonApiGatewayCreateRestApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateRestApiRequest, com.amazonaws.services.apigateway.model.CreateRestApiResult> {

	var name: String? = null
	var description: String? = null
	var version: String? = null
	var cloneFrom: String? = null
	var binaryMediaTypes: List<String>? = null
	var minimumCompressionSize: Int? = 0
	var apiKeySource: ApiKeySourceType? = null
	var endpointConfiguration: com.amazonaws.services.apigateway.model.EndpointConfiguration? = null
	var policy: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.CreateRestApiRequest {
		val input = com.amazonaws.services.apigateway.model.CreateRestApiRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setVersion(this.version)
		input.setCloneFrom(this.cloneFrom)
		input.setBinaryMediaTypes(this.binaryMediaTypes)
		input.setMinimumCompressionSize(this.minimumCompressionSize)
		input.setApiKeySource(this.apiKeySource?.toString())
		input.setEndpointConfiguration(this.endpointConfiguration)
		input.setPolicy(this.policy)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.CreateRestApiResult {
	  return com.amazonaws.services.apigateway.model.CreateRestApiResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.CreateRestApiResult {
		return environment.apigateway.createRestApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-rest-api")
				.argument("name", name)
				.argument("description", description)
				.argument("version", version)
				.argument("clone-from", cloneFrom)
				.argument("binary-media-types", binaryMediaTypes?.toString())
				.argument("minimum-compression-size", minimumCompressionSize?.toString())
				.argument("api-key-source", apiKeySource?.toString())
				.argument("endpoint-configuration", endpointConfiguration?.toString())
				.argument("policy", policy)
	}

}


fun AmazonApiGatewayFunctions.createStage(init: AmazonApiGatewayCreateStageCommand.() -> Unit): com.amazonaws.services.apigateway.model.CreateStageResult {
	return this.block.declare(AmazonApiGatewayCreateStageCommand().apply(init)) as com.amazonaws.services.apigateway.model.CreateStageResult
}

@Generated
class AmazonApiGatewayCreateStageCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateStageRequest, com.amazonaws.services.apigateway.model.CreateStageResult> {

	var restApiId: String? = null
	var stageName: String? = null
	var deploymentId: String? = null
	var description: String? = null
	var cacheClusterEnabled: Boolean? = false
	var cacheClusterSize: String? = null
	var variables: Map<String, String>? = null
	var documentationVersion: String? = null
	var canarySettings: com.amazonaws.services.apigateway.model.CanarySettings? = null
	var tags: Map<String, String>? = null

	override fun build(): com.amazonaws.services.apigateway.model.CreateStageRequest {
		val input = com.amazonaws.services.apigateway.model.CreateStageRequest()
		input.setRestApiId(this.restApiId)
		input.setStageName(this.stageName)
		input.setDeploymentId(this.deploymentId)
		input.setDescription(this.description)
		input.setCacheClusterEnabled(this.cacheClusterEnabled)
		input.setCacheClusterSize(this.cacheClusterSize)
		input.setVariables(this.variables)
		input.setDocumentationVersion(this.documentationVersion)
		input.setCanarySettings(this.canarySettings)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.CreateStageResult {
	  return com.amazonaws.services.apigateway.model.CreateStageResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.CreateStageResult {
		return environment.apigateway.createStage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-stage")
				.argument("rest-api-id", restApiId)
				.argument("stage-name", stageName)
				.argument("deployment-id", deploymentId)
				.argument("description", description)
				.option("cache-cluster-enabled", cacheClusterEnabled ?: false)
				.argument("cache-cluster-size", cacheClusterSize)
				.argument("variables", variables?.toString())
				.argument("documentation-version", documentationVersion)
				.argument("canary-settings", canarySettings?.toString())
				.argument("tags", tags?.toString())
	}

}


fun AmazonApiGatewayFunctions.createUsagePlan(init: AmazonApiGatewayCreateUsagePlanCommand.() -> Unit): com.amazonaws.services.apigateway.model.CreateUsagePlanResult {
	return this.block.declare(AmazonApiGatewayCreateUsagePlanCommand().apply(init)) as com.amazonaws.services.apigateway.model.CreateUsagePlanResult
}

@Generated
class AmazonApiGatewayCreateUsagePlanCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateUsagePlanRequest, com.amazonaws.services.apigateway.model.CreateUsagePlanResult> {

	var name: String? = null
	var description: String? = null
	var apiStages: List<com.amazonaws.services.apigateway.model.ApiStage>? = null
	var throttle: com.amazonaws.services.apigateway.model.ThrottleSettings? = null
	var quota: com.amazonaws.services.apigateway.model.QuotaSettings? = null

	override fun build(): com.amazonaws.services.apigateway.model.CreateUsagePlanRequest {
		val input = com.amazonaws.services.apigateway.model.CreateUsagePlanRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setApiStages(this.apiStages)
		input.setThrottle(this.throttle)
		input.setQuota(this.quota)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.CreateUsagePlanResult {
	  return com.amazonaws.services.apigateway.model.CreateUsagePlanResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.CreateUsagePlanResult {
		return environment.apigateway.createUsagePlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-usage-plan")
				.argument("name", name)
				.argument("description", description)
				.argument("api-stages", apiStages?.toString())
				.argument("throttle", throttle?.toString())
				.argument("quota", quota?.toString())
	}

}


fun AmazonApiGatewayFunctions.createUsagePlanKey(init: AmazonApiGatewayCreateUsagePlanKeyCommand.() -> Unit): com.amazonaws.services.apigateway.model.CreateUsagePlanKeyResult {
	return this.block.declare(AmazonApiGatewayCreateUsagePlanKeyCommand().apply(init)) as com.amazonaws.services.apigateway.model.CreateUsagePlanKeyResult
}

@Generated
class AmazonApiGatewayCreateUsagePlanKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateUsagePlanKeyRequest, com.amazonaws.services.apigateway.model.CreateUsagePlanKeyResult> {

	var usagePlanId: String? = null
	var keyId: String? = null
	var keyType: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.CreateUsagePlanKeyRequest {
		val input = com.amazonaws.services.apigateway.model.CreateUsagePlanKeyRequest()
		input.setUsagePlanId(this.usagePlanId)
		input.setKeyId(this.keyId)
		input.setKeyType(this.keyType)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.CreateUsagePlanKeyResult {
	  return com.amazonaws.services.apigateway.model.CreateUsagePlanKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.CreateUsagePlanKeyResult {
		return environment.apigateway.createUsagePlanKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-usage-plan-key")
				.argument("usage-plan-id", usagePlanId)
				.argument("key-id", keyId)
				.argument("key-type", keyType)
	}

}


fun AmazonApiGatewayFunctions.createVpcLink(init: AmazonApiGatewayCreateVpcLinkCommand.() -> Unit): com.amazonaws.services.apigateway.model.CreateVpcLinkResult {
	return this.block.declare(AmazonApiGatewayCreateVpcLinkCommand().apply(init)) as com.amazonaws.services.apigateway.model.CreateVpcLinkResult
}

@Generated
class AmazonApiGatewayCreateVpcLinkCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateVpcLinkRequest, com.amazonaws.services.apigateway.model.CreateVpcLinkResult> {

	var name: String? = null
	var description: String? = null
	var targetArns: List<String>? = null

	override fun build(): com.amazonaws.services.apigateway.model.CreateVpcLinkRequest {
		val input = com.amazonaws.services.apigateway.model.CreateVpcLinkRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setTargetArns(this.targetArns)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.CreateVpcLinkResult {
	  return com.amazonaws.services.apigateway.model.CreateVpcLinkResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.CreateVpcLinkResult {
		return environment.apigateway.createVpcLink(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-vpc-link")
				.argument("name", name)
				.argument("description", description)
				.argument("target-arns", targetArns?.toString())
	}

}


fun AmazonApiGatewayFunctions.deleteApiKey(init: AmazonApiGatewayDeleteApiKeyCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteApiKeyResult {
	return this.block.declare(AmazonApiGatewayDeleteApiKeyCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteApiKeyResult
}

@Generated
class AmazonApiGatewayDeleteApiKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteApiKeyRequest, com.amazonaws.services.apigateway.model.DeleteApiKeyResult> {

	var apiKey: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteApiKeyRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteApiKeyRequest()
		input.setApiKey(this.apiKey)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteApiKeyResult {
	  return com.amazonaws.services.apigateway.model.DeleteApiKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteApiKeyResult {
		return environment.apigateway.deleteApiKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-api-key")
				.argument("api-key", apiKey)
	}

}


fun AmazonApiGatewayFunctions.deleteAuthorizer(init: AmazonApiGatewayDeleteAuthorizerCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteAuthorizerResult {
	return this.block.declare(AmazonApiGatewayDeleteAuthorizerCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteAuthorizerResult
}

@Generated
class AmazonApiGatewayDeleteAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest, com.amazonaws.services.apigateway.model.DeleteAuthorizerResult> {

	var restApiId: String? = null
	var authorizerId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest()
		input.setRestApiId(this.restApiId)
		input.setAuthorizerId(this.authorizerId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteAuthorizerResult {
	  return com.amazonaws.services.apigateway.model.DeleteAuthorizerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteAuthorizerResult {
		return environment.apigateway.deleteAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-authorizer")
				.argument("rest-api-id", restApiId)
				.argument("authorizer-id", authorizerId)
	}

}


fun AmazonApiGatewayFunctions.deleteBasePathMapping(init: AmazonApiGatewayDeleteBasePathMappingCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteBasePathMappingResult {
	return this.block.declare(AmazonApiGatewayDeleteBasePathMappingCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteBasePathMappingResult
}

@Generated
class AmazonApiGatewayDeleteBasePathMappingCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest, com.amazonaws.services.apigateway.model.DeleteBasePathMappingResult> {

	var domainName: String? = null
	var basePath: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest()
		input.setDomainName(this.domainName)
		input.setBasePath(this.basePath)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteBasePathMappingResult {
	  return com.amazonaws.services.apigateway.model.DeleteBasePathMappingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteBasePathMappingResult {
		return environment.apigateway.deleteBasePathMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-base-path-mapping")
				.argument("domain-name", domainName)
				.argument("base-path", basePath)
	}

}


fun AmazonApiGatewayFunctions.deleteClientCertificate(init: AmazonApiGatewayDeleteClientCertificateCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteClientCertificateResult {
	return this.block.declare(AmazonApiGatewayDeleteClientCertificateCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteClientCertificateResult
}

@Generated
class AmazonApiGatewayDeleteClientCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest, com.amazonaws.services.apigateway.model.DeleteClientCertificateResult> {

	var clientCertificateId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest()
		input.setClientCertificateId(this.clientCertificateId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteClientCertificateResult {
	  return com.amazonaws.services.apigateway.model.DeleteClientCertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteClientCertificateResult {
		return environment.apigateway.deleteClientCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-client-certificate")
				.argument("client-certificate-id", clientCertificateId)
	}

}


fun AmazonApiGatewayFunctions.deleteDeployment(init: AmazonApiGatewayDeleteDeploymentCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteDeploymentResult {
	return this.block.declare(AmazonApiGatewayDeleteDeploymentCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteDeploymentResult
}

@Generated
class AmazonApiGatewayDeleteDeploymentCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteDeploymentRequest, com.amazonaws.services.apigateway.model.DeleteDeploymentResult> {

	var restApiId: String? = null
	var deploymentId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteDeploymentRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteDeploymentRequest()
		input.setRestApiId(this.restApiId)
		input.setDeploymentId(this.deploymentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteDeploymentResult {
	  return com.amazonaws.services.apigateway.model.DeleteDeploymentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteDeploymentResult {
		return environment.apigateway.deleteDeployment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-deployment")
				.argument("rest-api-id", restApiId)
				.argument("deployment-id", deploymentId)
	}

}


fun AmazonApiGatewayFunctions.deleteDocumentationPart(init: AmazonApiGatewayDeleteDocumentationPartCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteDocumentationPartResult {
	return this.block.declare(AmazonApiGatewayDeleteDocumentationPartCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteDocumentationPartResult
}

@Generated
class AmazonApiGatewayDeleteDocumentationPartCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest, com.amazonaws.services.apigateway.model.DeleteDocumentationPartResult> {

	var restApiId: String? = null
	var documentationPartId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest()
		input.setRestApiId(this.restApiId)
		input.setDocumentationPartId(this.documentationPartId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteDocumentationPartResult {
	  return com.amazonaws.services.apigateway.model.DeleteDocumentationPartResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteDocumentationPartResult {
		return environment.apigateway.deleteDocumentationPart(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-documentation-part")
				.argument("rest-api-id", restApiId)
				.argument("documentation-part-id", documentationPartId)
	}

}


fun AmazonApiGatewayFunctions.deleteDocumentationVersion(init: AmazonApiGatewayDeleteDocumentationVersionCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteDocumentationVersionResult {
	return this.block.declare(AmazonApiGatewayDeleteDocumentationVersionCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteDocumentationVersionResult
}

@Generated
class AmazonApiGatewayDeleteDocumentationVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest, com.amazonaws.services.apigateway.model.DeleteDocumentationVersionResult> {

	var restApiId: String? = null
	var documentationVersion: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest()
		input.setRestApiId(this.restApiId)
		input.setDocumentationVersion(this.documentationVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteDocumentationVersionResult {
	  return com.amazonaws.services.apigateway.model.DeleteDocumentationVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteDocumentationVersionResult {
		return environment.apigateway.deleteDocumentationVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-documentation-version")
				.argument("rest-api-id", restApiId)
				.argument("documentation-version", documentationVersion)
	}

}


fun AmazonApiGatewayFunctions.deleteDomainName(init: AmazonApiGatewayDeleteDomainNameCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteDomainNameResult {
	return this.block.declare(AmazonApiGatewayDeleteDomainNameCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteDomainNameResult
}

@Generated
class AmazonApiGatewayDeleteDomainNameCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteDomainNameRequest, com.amazonaws.services.apigateway.model.DeleteDomainNameResult> {

	var domainName: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteDomainNameRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteDomainNameRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteDomainNameResult {
	  return com.amazonaws.services.apigateway.model.DeleteDomainNameResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteDomainNameResult {
		return environment.apigateway.deleteDomainName(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-domain-name")
				.argument("domain-name", domainName)
	}

}


fun AmazonApiGatewayFunctions.deleteGatewayResponse(init: AmazonApiGatewayDeleteGatewayResponseCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteGatewayResponseResult {
	return this.block.declare(AmazonApiGatewayDeleteGatewayResponseCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteGatewayResponseResult
}

@Generated
class AmazonApiGatewayDeleteGatewayResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest, com.amazonaws.services.apigateway.model.DeleteGatewayResponseResult> {

	var restApiId: String? = null
	var responseType: GatewayResponseType? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest()
		input.setRestApiId(this.restApiId)
		input.setResponseType(this.responseType?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteGatewayResponseResult {
	  return com.amazonaws.services.apigateway.model.DeleteGatewayResponseResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteGatewayResponseResult {
		return environment.apigateway.deleteGatewayResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-gateway-response")
				.argument("rest-api-id", restApiId)
				.argument("response-type", responseType?.toString())
	}

}


fun AmazonApiGatewayFunctions.deleteIntegration(init: AmazonApiGatewayDeleteIntegrationCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteIntegrationResult {
	return this.block.declare(AmazonApiGatewayDeleteIntegrationCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteIntegrationResult
}

@Generated
class AmazonApiGatewayDeleteIntegrationCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteIntegrationRequest, com.amazonaws.services.apigateway.model.DeleteIntegrationResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteIntegrationRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteIntegrationRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteIntegrationResult {
	  return com.amazonaws.services.apigateway.model.DeleteIntegrationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteIntegrationResult {
		return environment.apigateway.deleteIntegration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-integration")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
	}

}


fun AmazonApiGatewayFunctions.deleteIntegrationResponse(init: AmazonApiGatewayDeleteIntegrationResponseCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteIntegrationResponseResult {
	return this.block.declare(AmazonApiGatewayDeleteIntegrationResponseCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteIntegrationResponseResult
}

@Generated
class AmazonApiGatewayDeleteIntegrationResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteIntegrationResponseRequest, com.amazonaws.services.apigateway.model.DeleteIntegrationResponseResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null
	var statusCode: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteIntegrationResponseRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteIntegrationResponseRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		input.setStatusCode(this.statusCode)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteIntegrationResponseResult {
	  return com.amazonaws.services.apigateway.model.DeleteIntegrationResponseResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteIntegrationResponseResult {
		return environment.apigateway.deleteIntegrationResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-integration-response")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("status-code", statusCode)
	}

}


fun AmazonApiGatewayFunctions.deleteMethod(init: AmazonApiGatewayDeleteMethodCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteMethodResult {
	return this.block.declare(AmazonApiGatewayDeleteMethodCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteMethodResult
}

@Generated
class AmazonApiGatewayDeleteMethodCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteMethodRequest, com.amazonaws.services.apigateway.model.DeleteMethodResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteMethodRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteMethodRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteMethodResult {
	  return com.amazonaws.services.apigateway.model.DeleteMethodResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteMethodResult {
		return environment.apigateway.deleteMethod(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-method")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
	}

}


fun AmazonApiGatewayFunctions.deleteMethodResponse(init: AmazonApiGatewayDeleteMethodResponseCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteMethodResponseResult {
	return this.block.declare(AmazonApiGatewayDeleteMethodResponseCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteMethodResponseResult
}

@Generated
class AmazonApiGatewayDeleteMethodResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteMethodResponseRequest, com.amazonaws.services.apigateway.model.DeleteMethodResponseResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null
	var statusCode: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteMethodResponseRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteMethodResponseRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		input.setStatusCode(this.statusCode)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteMethodResponseResult {
	  return com.amazonaws.services.apigateway.model.DeleteMethodResponseResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteMethodResponseResult {
		return environment.apigateway.deleteMethodResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-method-response")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("status-code", statusCode)
	}

}


fun AmazonApiGatewayFunctions.deleteModel(init: AmazonApiGatewayDeleteModelCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteModelResult {
	return this.block.declare(AmazonApiGatewayDeleteModelCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteModelResult
}

@Generated
class AmazonApiGatewayDeleteModelCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteModelRequest, com.amazonaws.services.apigateway.model.DeleteModelResult> {

	var restApiId: String? = null
	var modelName: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteModelRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteModelRequest()
		input.setRestApiId(this.restApiId)
		input.setModelName(this.modelName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteModelResult {
	  return com.amazonaws.services.apigateway.model.DeleteModelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteModelResult {
		return environment.apigateway.deleteModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-model")
				.argument("rest-api-id", restApiId)
				.argument("model-name", modelName)
	}

}


fun AmazonApiGatewayFunctions.deleteRequestValidator(init: AmazonApiGatewayDeleteRequestValidatorCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteRequestValidatorResult {
	return this.block.declare(AmazonApiGatewayDeleteRequestValidatorCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteRequestValidatorResult
}

@Generated
class AmazonApiGatewayDeleteRequestValidatorCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest, com.amazonaws.services.apigateway.model.DeleteRequestValidatorResult> {

	var restApiId: String? = null
	var requestValidatorId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest()
		input.setRestApiId(this.restApiId)
		input.setRequestValidatorId(this.requestValidatorId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteRequestValidatorResult {
	  return com.amazonaws.services.apigateway.model.DeleteRequestValidatorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteRequestValidatorResult {
		return environment.apigateway.deleteRequestValidator(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-request-validator")
				.argument("rest-api-id", restApiId)
				.argument("request-validator-id", requestValidatorId)
	}

}


fun AmazonApiGatewayFunctions.deleteResource(init: AmazonApiGatewayDeleteResourceCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteResourceResult {
	return this.block.declare(AmazonApiGatewayDeleteResourceCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteResourceResult
}

@Generated
class AmazonApiGatewayDeleteResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteResourceRequest, com.amazonaws.services.apigateway.model.DeleteResourceResult> {

	var restApiId: String? = null
	var resourceId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteResourceRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteResourceRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteResourceResult {
	  return com.amazonaws.services.apigateway.model.DeleteResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteResourceResult {
		return environment.apigateway.deleteResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-resource")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
	}

}


fun AmazonApiGatewayFunctions.deleteRestApi(init: AmazonApiGatewayDeleteRestApiCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteRestApiResult {
	return this.block.declare(AmazonApiGatewayDeleteRestApiCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteRestApiResult
}

@Generated
class AmazonApiGatewayDeleteRestApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteRestApiRequest, com.amazonaws.services.apigateway.model.DeleteRestApiResult> {

	var restApiId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteRestApiRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteRestApiRequest()
		input.setRestApiId(this.restApiId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteRestApiResult {
	  return com.amazonaws.services.apigateway.model.DeleteRestApiResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteRestApiResult {
		return environment.apigateway.deleteRestApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-rest-api")
				.argument("rest-api-id", restApiId)
	}

}


fun AmazonApiGatewayFunctions.deleteStage(init: AmazonApiGatewayDeleteStageCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteStageResult {
	return this.block.declare(AmazonApiGatewayDeleteStageCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteStageResult
}

@Generated
class AmazonApiGatewayDeleteStageCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteStageRequest, com.amazonaws.services.apigateway.model.DeleteStageResult> {

	var restApiId: String? = null
	var stageName: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteStageRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteStageRequest()
		input.setRestApiId(this.restApiId)
		input.setStageName(this.stageName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteStageResult {
	  return com.amazonaws.services.apigateway.model.DeleteStageResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteStageResult {
		return environment.apigateway.deleteStage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-stage")
				.argument("rest-api-id", restApiId)
				.argument("stage-name", stageName)
	}

}


fun AmazonApiGatewayFunctions.deleteUsagePlan(init: AmazonApiGatewayDeleteUsagePlanCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteUsagePlanResult {
	return this.block.declare(AmazonApiGatewayDeleteUsagePlanCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteUsagePlanResult
}

@Generated
class AmazonApiGatewayDeleteUsagePlanCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest, com.amazonaws.services.apigateway.model.DeleteUsagePlanResult> {

	var usagePlanId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest()
		input.setUsagePlanId(this.usagePlanId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteUsagePlanResult {
	  return com.amazonaws.services.apigateway.model.DeleteUsagePlanResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteUsagePlanResult {
		return environment.apigateway.deleteUsagePlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-usage-plan")
				.argument("usage-plan-id", usagePlanId)
	}

}


fun AmazonApiGatewayFunctions.deleteUsagePlanKey(init: AmazonApiGatewayDeleteUsagePlanKeyCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyResult {
	return this.block.declare(AmazonApiGatewayDeleteUsagePlanKeyCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyResult
}

@Generated
class AmazonApiGatewayDeleteUsagePlanKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest, com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyResult> {

	var usagePlanId: String? = null
	var keyId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest()
		input.setUsagePlanId(this.usagePlanId)
		input.setKeyId(this.keyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyResult {
	  return com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyResult {
		return environment.apigateway.deleteUsagePlanKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-usage-plan-key")
				.argument("usage-plan-id", usagePlanId)
				.argument("key-id", keyId)
	}

}


fun AmazonApiGatewayFunctions.deleteVpcLink(init: AmazonApiGatewayDeleteVpcLinkCommand.() -> Unit): com.amazonaws.services.apigateway.model.DeleteVpcLinkResult {
	return this.block.declare(AmazonApiGatewayDeleteVpcLinkCommand().apply(init)) as com.amazonaws.services.apigateway.model.DeleteVpcLinkResult
}

@Generated
class AmazonApiGatewayDeleteVpcLinkCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest, com.amazonaws.services.apigateway.model.DeleteVpcLinkResult> {

	var vpcLinkId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest()
		input.setVpcLinkId(this.vpcLinkId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.DeleteVpcLinkResult {
	  return com.amazonaws.services.apigateway.model.DeleteVpcLinkResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.DeleteVpcLinkResult {
		return environment.apigateway.deleteVpcLink(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-vpc-link")
				.argument("vpc-link-id", vpcLinkId)
	}

}


fun AmazonApiGatewayFunctions.flushStageAuthorizersCache(init: AmazonApiGatewayFlushStageAuthorizersCacheCommand.() -> Unit): com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheResult {
	return this.block.declare(AmazonApiGatewayFlushStageAuthorizersCacheCommand().apply(init)) as com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheResult
}

@Generated
class AmazonApiGatewayFlushStageAuthorizersCacheCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest, com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheResult> {

	var restApiId: String? = null
	var stageName: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest {
		val input = com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest()
		input.setRestApiId(this.restApiId)
		input.setStageName(this.stageName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheResult {
	  return com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheResult {
		return environment.apigateway.flushStageAuthorizersCache(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway flush-stage-authorizers-cache")
				.argument("rest-api-id", restApiId)
				.argument("stage-name", stageName)
	}

}


fun AmazonApiGatewayFunctions.flushStageCache(init: AmazonApiGatewayFlushStageCacheCommand.() -> Unit): com.amazonaws.services.apigateway.model.FlushStageCacheResult {
	return this.block.declare(AmazonApiGatewayFlushStageCacheCommand().apply(init)) as com.amazonaws.services.apigateway.model.FlushStageCacheResult
}

@Generated
class AmazonApiGatewayFlushStageCacheCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.FlushStageCacheRequest, com.amazonaws.services.apigateway.model.FlushStageCacheResult> {

	var restApiId: String? = null
	var stageName: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.FlushStageCacheRequest {
		val input = com.amazonaws.services.apigateway.model.FlushStageCacheRequest()
		input.setRestApiId(this.restApiId)
		input.setStageName(this.stageName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.FlushStageCacheResult {
	  return com.amazonaws.services.apigateway.model.FlushStageCacheResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.FlushStageCacheResult {
		return environment.apigateway.flushStageCache(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway flush-stage-cache")
				.argument("rest-api-id", restApiId)
				.argument("stage-name", stageName)
	}

}


fun AmazonApiGatewayFunctions.generateClientCertificate(init: AmazonApiGatewayGenerateClientCertificateCommand.() -> Unit): com.amazonaws.services.apigateway.model.GenerateClientCertificateResult {
	return this.block.declare(AmazonApiGatewayGenerateClientCertificateCommand().apply(init)) as com.amazonaws.services.apigateway.model.GenerateClientCertificateResult
}

@Generated
class AmazonApiGatewayGenerateClientCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest, com.amazonaws.services.apigateway.model.GenerateClientCertificateResult> {

	var description: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest {
		val input = com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest()
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GenerateClientCertificateResult {
	  return com.amazonaws.services.apigateway.model.GenerateClientCertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GenerateClientCertificateResult {
		return environment.apigateway.generateClientCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway generate-client-certificate")
				.argument("description", description)
	}

}


fun AmazonApiGatewayFunctions.getAccount(init: AmazonApiGatewayGetAccountCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetAccountResult {
	return this.block.declare(AmazonApiGatewayGetAccountCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetAccountResult
}

@Generated
class AmazonApiGatewayGetAccountCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetAccountRequest, com.amazonaws.services.apigateway.model.GetAccountResult> {



	override fun build(): com.amazonaws.services.apigateway.model.GetAccountRequest {
		val input = com.amazonaws.services.apigateway.model.GetAccountRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetAccountResult {
	  return com.amazonaws.services.apigateway.model.GetAccountResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetAccountResult {
		return environment.apigateway.getAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-account")

	}

}


fun AmazonApiGatewayFunctions.getApiKey(init: AmazonApiGatewayGetApiKeyCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetApiKeyResult {
	return this.block.declare(AmazonApiGatewayGetApiKeyCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetApiKeyResult
}

@Generated
class AmazonApiGatewayGetApiKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetApiKeyRequest, com.amazonaws.services.apigateway.model.GetApiKeyResult> {

	var apiKey: String? = null
	var includeValue: Boolean? = false

	override fun build(): com.amazonaws.services.apigateway.model.GetApiKeyRequest {
		val input = com.amazonaws.services.apigateway.model.GetApiKeyRequest()
		input.setApiKey(this.apiKey)
		input.setIncludeValue(this.includeValue)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetApiKeyResult {
	  return com.amazonaws.services.apigateway.model.GetApiKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetApiKeyResult {
		return environment.apigateway.getApiKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-api-key")
				.argument("api-key", apiKey)
				.option("include-value", includeValue ?: false)
	}

}


fun AmazonApiGatewayFunctions.getApiKeys(init: AmazonApiGatewayGetApiKeysCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetApiKeysResult {
	return this.block.declare(AmazonApiGatewayGetApiKeysCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetApiKeysResult
}

@Generated
class AmazonApiGatewayGetApiKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetApiKeysRequest, com.amazonaws.services.apigateway.model.GetApiKeysResult> {

	var position: String? = null
	var limit: Int? = 0
	var nameQuery: String? = null
	var customerId: String? = null
	var includeValues: Boolean? = false

	override fun build(): com.amazonaws.services.apigateway.model.GetApiKeysRequest {
		val input = com.amazonaws.services.apigateway.model.GetApiKeysRequest()
		input.setPosition(this.position)
		input.setLimit(this.limit)
		input.setNameQuery(this.nameQuery)
		input.setCustomerId(this.customerId)
		input.setIncludeValues(this.includeValues)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetApiKeysResult {
	  return com.amazonaws.services.apigateway.model.GetApiKeysResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetApiKeysResult {
		return environment.apigateway.getApiKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-api-keys")
				.argument("position", position)
				.argument("limit", limit?.toString())
				.argument("name-query", nameQuery)
				.argument("customer-id", customerId)
				.option("include-values", includeValues ?: false)
	}

}


fun AmazonApiGatewayFunctions.getAuthorizer(init: AmazonApiGatewayGetAuthorizerCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetAuthorizerResult {
	return this.block.declare(AmazonApiGatewayGetAuthorizerCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetAuthorizerResult
}

@Generated
class AmazonApiGatewayGetAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetAuthorizerRequest, com.amazonaws.services.apigateway.model.GetAuthorizerResult> {

	var restApiId: String? = null
	var authorizerId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetAuthorizerRequest {
		val input = com.amazonaws.services.apigateway.model.GetAuthorizerRequest()
		input.setRestApiId(this.restApiId)
		input.setAuthorizerId(this.authorizerId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetAuthorizerResult {
	  return com.amazonaws.services.apigateway.model.GetAuthorizerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetAuthorizerResult {
		return environment.apigateway.getAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-authorizer")
				.argument("rest-api-id", restApiId)
				.argument("authorizer-id", authorizerId)
	}

}


fun AmazonApiGatewayFunctions.getAuthorizers(init: AmazonApiGatewayGetAuthorizersCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetAuthorizersResult {
	return this.block.declare(AmazonApiGatewayGetAuthorizersCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetAuthorizersResult
}

@Generated
class AmazonApiGatewayGetAuthorizersCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetAuthorizersRequest, com.amazonaws.services.apigateway.model.GetAuthorizersResult> {

	var restApiId: String? = null
	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetAuthorizersRequest {
		val input = com.amazonaws.services.apigateway.model.GetAuthorizersRequest()
		input.setRestApiId(this.restApiId)
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetAuthorizersResult {
	  return com.amazonaws.services.apigateway.model.GetAuthorizersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetAuthorizersResult {
		return environment.apigateway.getAuthorizers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-authorizers")
				.argument("rest-api-id", restApiId)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getBasePathMapping(init: AmazonApiGatewayGetBasePathMappingCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetBasePathMappingResult {
	return this.block.declare(AmazonApiGatewayGetBasePathMappingCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetBasePathMappingResult
}

@Generated
class AmazonApiGatewayGetBasePathMappingCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetBasePathMappingRequest, com.amazonaws.services.apigateway.model.GetBasePathMappingResult> {

	var domainName: String? = null
	var basePath: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetBasePathMappingRequest {
		val input = com.amazonaws.services.apigateway.model.GetBasePathMappingRequest()
		input.setDomainName(this.domainName)
		input.setBasePath(this.basePath)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetBasePathMappingResult {
	  return com.amazonaws.services.apigateway.model.GetBasePathMappingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetBasePathMappingResult {
		return environment.apigateway.getBasePathMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-base-path-mapping")
				.argument("domain-name", domainName)
				.argument("base-path", basePath)
	}

}


fun AmazonApiGatewayFunctions.getBasePathMappings(init: AmazonApiGatewayGetBasePathMappingsCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetBasePathMappingsResult {
	return this.block.declare(AmazonApiGatewayGetBasePathMappingsCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetBasePathMappingsResult
}

@Generated
class AmazonApiGatewayGetBasePathMappingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetBasePathMappingsRequest, com.amazonaws.services.apigateway.model.GetBasePathMappingsResult> {

	var domainName: String? = null
	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetBasePathMappingsRequest {
		val input = com.amazonaws.services.apigateway.model.GetBasePathMappingsRequest()
		input.setDomainName(this.domainName)
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetBasePathMappingsResult {
	  return com.amazonaws.services.apigateway.model.GetBasePathMappingsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetBasePathMappingsResult {
		return environment.apigateway.getBasePathMappings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-base-path-mappings")
				.argument("domain-name", domainName)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getClientCertificate(init: AmazonApiGatewayGetClientCertificateCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetClientCertificateResult {
	return this.block.declare(AmazonApiGatewayGetClientCertificateCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetClientCertificateResult
}

@Generated
class AmazonApiGatewayGetClientCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetClientCertificateRequest, com.amazonaws.services.apigateway.model.GetClientCertificateResult> {

	var clientCertificateId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetClientCertificateRequest {
		val input = com.amazonaws.services.apigateway.model.GetClientCertificateRequest()
		input.setClientCertificateId(this.clientCertificateId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetClientCertificateResult {
	  return com.amazonaws.services.apigateway.model.GetClientCertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetClientCertificateResult {
		return environment.apigateway.getClientCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-client-certificate")
				.argument("client-certificate-id", clientCertificateId)
	}

}


fun AmazonApiGatewayFunctions.getClientCertificates(init: AmazonApiGatewayGetClientCertificatesCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetClientCertificatesResult {
	return this.block.declare(AmazonApiGatewayGetClientCertificatesCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetClientCertificatesResult
}

@Generated
class AmazonApiGatewayGetClientCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetClientCertificatesRequest, com.amazonaws.services.apigateway.model.GetClientCertificatesResult> {

	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetClientCertificatesRequest {
		val input = com.amazonaws.services.apigateway.model.GetClientCertificatesRequest()
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetClientCertificatesResult {
	  return com.amazonaws.services.apigateway.model.GetClientCertificatesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetClientCertificatesResult {
		return environment.apigateway.getClientCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-client-certificates")
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getDeployment(init: AmazonApiGatewayGetDeploymentCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetDeploymentResult {
	return this.block.declare(AmazonApiGatewayGetDeploymentCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetDeploymentResult
}

@Generated
class AmazonApiGatewayGetDeploymentCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetDeploymentRequest, com.amazonaws.services.apigateway.model.GetDeploymentResult> {

	var restApiId: String? = null
	var deploymentId: String? = null
	var embed: List<String>? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetDeploymentRequest {
		val input = com.amazonaws.services.apigateway.model.GetDeploymentRequest()
		input.setRestApiId(this.restApiId)
		input.setDeploymentId(this.deploymentId)
		input.setEmbed(this.embed)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetDeploymentResult {
	  return com.amazonaws.services.apigateway.model.GetDeploymentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetDeploymentResult {
		return environment.apigateway.getDeployment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-deployment")
				.argument("rest-api-id", restApiId)
				.argument("deployment-id", deploymentId)
				.argument("embed", embed?.toString())
	}

}


fun AmazonApiGatewayFunctions.getDeployments(init: AmazonApiGatewayGetDeploymentsCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetDeploymentsResult {
	return this.block.declare(AmazonApiGatewayGetDeploymentsCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetDeploymentsResult
}

@Generated
class AmazonApiGatewayGetDeploymentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetDeploymentsRequest, com.amazonaws.services.apigateway.model.GetDeploymentsResult> {

	var restApiId: String? = null
	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetDeploymentsRequest {
		val input = com.amazonaws.services.apigateway.model.GetDeploymentsRequest()
		input.setRestApiId(this.restApiId)
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetDeploymentsResult {
	  return com.amazonaws.services.apigateway.model.GetDeploymentsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetDeploymentsResult {
		return environment.apigateway.getDeployments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-deployments")
				.argument("rest-api-id", restApiId)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getDocumentationPart(init: AmazonApiGatewayGetDocumentationPartCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetDocumentationPartResult {
	return this.block.declare(AmazonApiGatewayGetDocumentationPartCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetDocumentationPartResult
}

@Generated
class AmazonApiGatewayGetDocumentationPartCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetDocumentationPartRequest, com.amazonaws.services.apigateway.model.GetDocumentationPartResult> {

	var restApiId: String? = null
	var documentationPartId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetDocumentationPartRequest {
		val input = com.amazonaws.services.apigateway.model.GetDocumentationPartRequest()
		input.setRestApiId(this.restApiId)
		input.setDocumentationPartId(this.documentationPartId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetDocumentationPartResult {
	  return com.amazonaws.services.apigateway.model.GetDocumentationPartResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetDocumentationPartResult {
		return environment.apigateway.getDocumentationPart(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-documentation-part")
				.argument("rest-api-id", restApiId)
				.argument("documentation-part-id", documentationPartId)
	}

}


fun AmazonApiGatewayFunctions.getDocumentationParts(init: AmazonApiGatewayGetDocumentationPartsCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetDocumentationPartsResult {
	return this.block.declare(AmazonApiGatewayGetDocumentationPartsCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetDocumentationPartsResult
}

@Generated
class AmazonApiGatewayGetDocumentationPartsCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetDocumentationPartsRequest, com.amazonaws.services.apigateway.model.GetDocumentationPartsResult> {

	var restApiId: String? = null
	var type: DocumentationPartType? = null
	var nameQuery: String? = null
	var path: String? = null
	var position: String? = null
	var limit: Int? = 0
	var locationStatus: LocationStatusType? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetDocumentationPartsRequest {
		val input = com.amazonaws.services.apigateway.model.GetDocumentationPartsRequest()
		input.setRestApiId(this.restApiId)
		input.setType(this.type?.toString())
		input.setNameQuery(this.nameQuery)
		input.setPath(this.path)
		input.setPosition(this.position)
		input.setLimit(this.limit)
		input.setLocationStatus(this.locationStatus?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetDocumentationPartsResult {
	  return com.amazonaws.services.apigateway.model.GetDocumentationPartsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetDocumentationPartsResult {
		return environment.apigateway.getDocumentationParts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-documentation-parts")
				.argument("rest-api-id", restApiId)
				.argument("type", type?.toString())
				.argument("name-query", nameQuery)
				.argument("path", path)
				.argument("position", position)
				.argument("limit", limit?.toString())
				.argument("location-status", locationStatus?.toString())
	}

}


fun AmazonApiGatewayFunctions.getDocumentationVersion(init: AmazonApiGatewayGetDocumentationVersionCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetDocumentationVersionResult {
	return this.block.declare(AmazonApiGatewayGetDocumentationVersionCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetDocumentationVersionResult
}

@Generated
class AmazonApiGatewayGetDocumentationVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest, com.amazonaws.services.apigateway.model.GetDocumentationVersionResult> {

	var restApiId: String? = null
	var documentationVersion: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest {
		val input = com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest()
		input.setRestApiId(this.restApiId)
		input.setDocumentationVersion(this.documentationVersion)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetDocumentationVersionResult {
	  return com.amazonaws.services.apigateway.model.GetDocumentationVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetDocumentationVersionResult {
		return environment.apigateway.getDocumentationVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-documentation-version")
				.argument("rest-api-id", restApiId)
				.argument("documentation-version", documentationVersion)
	}

}


fun AmazonApiGatewayFunctions.getDocumentationVersions(init: AmazonApiGatewayGetDocumentationVersionsCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetDocumentationVersionsResult {
	return this.block.declare(AmazonApiGatewayGetDocumentationVersionsCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetDocumentationVersionsResult
}

@Generated
class AmazonApiGatewayGetDocumentationVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetDocumentationVersionsRequest, com.amazonaws.services.apigateway.model.GetDocumentationVersionsResult> {

	var restApiId: String? = null
	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetDocumentationVersionsRequest {
		val input = com.amazonaws.services.apigateway.model.GetDocumentationVersionsRequest()
		input.setRestApiId(this.restApiId)
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetDocumentationVersionsResult {
	  return com.amazonaws.services.apigateway.model.GetDocumentationVersionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetDocumentationVersionsResult {
		return environment.apigateway.getDocumentationVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-documentation-versions")
				.argument("rest-api-id", restApiId)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getDomainName(init: AmazonApiGatewayGetDomainNameCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetDomainNameResult {
	return this.block.declare(AmazonApiGatewayGetDomainNameCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetDomainNameResult
}

@Generated
class AmazonApiGatewayGetDomainNameCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetDomainNameRequest, com.amazonaws.services.apigateway.model.GetDomainNameResult> {

	var domainName: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetDomainNameRequest {
		val input = com.amazonaws.services.apigateway.model.GetDomainNameRequest()
		input.setDomainName(this.domainName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetDomainNameResult {
	  return com.amazonaws.services.apigateway.model.GetDomainNameResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetDomainNameResult {
		return environment.apigateway.getDomainName(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-domain-name")
				.argument("domain-name", domainName)
	}

}


fun AmazonApiGatewayFunctions.getDomainNames(init: AmazonApiGatewayGetDomainNamesCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetDomainNamesResult {
	return this.block.declare(AmazonApiGatewayGetDomainNamesCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetDomainNamesResult
}

@Generated
class AmazonApiGatewayGetDomainNamesCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetDomainNamesRequest, com.amazonaws.services.apigateway.model.GetDomainNamesResult> {

	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetDomainNamesRequest {
		val input = com.amazonaws.services.apigateway.model.GetDomainNamesRequest()
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetDomainNamesResult {
	  return com.amazonaws.services.apigateway.model.GetDomainNamesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetDomainNamesResult {
		return environment.apigateway.getDomainNames(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-domain-names")
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getExport(init: AmazonApiGatewayGetExportCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetExportResult {
	return this.block.declare(AmazonApiGatewayGetExportCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetExportResult
}

@Generated
class AmazonApiGatewayGetExportCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetExportRequest, com.amazonaws.services.apigateway.model.GetExportResult> {

	var restApiId: String? = null
	var stageName: String? = null
	var exportType: String? = null
	var parameters: Map<String, String>? = null
	var accepts: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetExportRequest {
		val input = com.amazonaws.services.apigateway.model.GetExportRequest()
		input.setRestApiId(this.restApiId)
		input.setStageName(this.stageName)
		input.setExportType(this.exportType)
		input.setParameters(this.parameters)
		input.setAccepts(this.accepts)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetExportResult {
	  return com.amazonaws.services.apigateway.model.GetExportResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetExportResult {
		return environment.apigateway.getExport(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-export")
				.argument("rest-api-id", restApiId)
				.argument("stage-name", stageName)
				.argument("export-type", exportType)
				.argument("parameters", parameters?.toString())
				.argument("accepts", accepts)
	}

}


fun AmazonApiGatewayFunctions.getGatewayResponse(init: AmazonApiGatewayGetGatewayResponseCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetGatewayResponseResult {
	return this.block.declare(AmazonApiGatewayGetGatewayResponseCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetGatewayResponseResult
}

@Generated
class AmazonApiGatewayGetGatewayResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetGatewayResponseRequest, com.amazonaws.services.apigateway.model.GetGatewayResponseResult> {

	var restApiId: String? = null
	var responseType: GatewayResponseType? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetGatewayResponseRequest {
		val input = com.amazonaws.services.apigateway.model.GetGatewayResponseRequest()
		input.setRestApiId(this.restApiId)
		input.setResponseType(this.responseType?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetGatewayResponseResult {
	  return com.amazonaws.services.apigateway.model.GetGatewayResponseResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetGatewayResponseResult {
		return environment.apigateway.getGatewayResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-gateway-response")
				.argument("rest-api-id", restApiId)
				.argument("response-type", responseType?.toString())
	}

}


fun AmazonApiGatewayFunctions.getGatewayResponses(init: AmazonApiGatewayGetGatewayResponsesCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetGatewayResponsesResult {
	return this.block.declare(AmazonApiGatewayGetGatewayResponsesCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetGatewayResponsesResult
}

@Generated
class AmazonApiGatewayGetGatewayResponsesCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetGatewayResponsesRequest, com.amazonaws.services.apigateway.model.GetGatewayResponsesResult> {

	var restApiId: String? = null
	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetGatewayResponsesRequest {
		val input = com.amazonaws.services.apigateway.model.GetGatewayResponsesRequest()
		input.setRestApiId(this.restApiId)
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetGatewayResponsesResult {
	  return com.amazonaws.services.apigateway.model.GetGatewayResponsesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetGatewayResponsesResult {
		return environment.apigateway.getGatewayResponses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-gateway-responses")
				.argument("rest-api-id", restApiId)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getIntegration(init: AmazonApiGatewayGetIntegrationCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetIntegrationResult {
	return this.block.declare(AmazonApiGatewayGetIntegrationCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetIntegrationResult
}

@Generated
class AmazonApiGatewayGetIntegrationCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetIntegrationRequest, com.amazonaws.services.apigateway.model.GetIntegrationResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetIntegrationRequest {
		val input = com.amazonaws.services.apigateway.model.GetIntegrationRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetIntegrationResult {
	  return com.amazonaws.services.apigateway.model.GetIntegrationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetIntegrationResult {
		return environment.apigateway.getIntegration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-integration")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
	}

}


fun AmazonApiGatewayFunctions.getIntegrationResponse(init: AmazonApiGatewayGetIntegrationResponseCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetIntegrationResponseResult {
	return this.block.declare(AmazonApiGatewayGetIntegrationResponseCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetIntegrationResponseResult
}

@Generated
class AmazonApiGatewayGetIntegrationResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetIntegrationResponseRequest, com.amazonaws.services.apigateway.model.GetIntegrationResponseResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null
	var statusCode: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetIntegrationResponseRequest {
		val input = com.amazonaws.services.apigateway.model.GetIntegrationResponseRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		input.setStatusCode(this.statusCode)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetIntegrationResponseResult {
	  return com.amazonaws.services.apigateway.model.GetIntegrationResponseResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetIntegrationResponseResult {
		return environment.apigateway.getIntegrationResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-integration-response")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("status-code", statusCode)
	}

}


fun AmazonApiGatewayFunctions.getMethod(init: AmazonApiGatewayGetMethodCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetMethodResult {
	return this.block.declare(AmazonApiGatewayGetMethodCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetMethodResult
}

@Generated
class AmazonApiGatewayGetMethodCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetMethodRequest, com.amazonaws.services.apigateway.model.GetMethodResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetMethodRequest {
		val input = com.amazonaws.services.apigateway.model.GetMethodRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetMethodResult {
	  return com.amazonaws.services.apigateway.model.GetMethodResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetMethodResult {
		return environment.apigateway.getMethod(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-method")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
	}

}


fun AmazonApiGatewayFunctions.getMethodResponse(init: AmazonApiGatewayGetMethodResponseCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetMethodResponseResult {
	return this.block.declare(AmazonApiGatewayGetMethodResponseCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetMethodResponseResult
}

@Generated
class AmazonApiGatewayGetMethodResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetMethodResponseRequest, com.amazonaws.services.apigateway.model.GetMethodResponseResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null
	var statusCode: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetMethodResponseRequest {
		val input = com.amazonaws.services.apigateway.model.GetMethodResponseRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		input.setStatusCode(this.statusCode)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetMethodResponseResult {
	  return com.amazonaws.services.apigateway.model.GetMethodResponseResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetMethodResponseResult {
		return environment.apigateway.getMethodResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-method-response")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("status-code", statusCode)
	}

}


fun AmazonApiGatewayFunctions.getModel(init: AmazonApiGatewayGetModelCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetModelResult {
	return this.block.declare(AmazonApiGatewayGetModelCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetModelResult
}

@Generated
class AmazonApiGatewayGetModelCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetModelRequest, com.amazonaws.services.apigateway.model.GetModelResult> {

	var restApiId: String? = null
	var modelName: String? = null
	var flatten: Boolean? = false

	override fun build(): com.amazonaws.services.apigateway.model.GetModelRequest {
		val input = com.amazonaws.services.apigateway.model.GetModelRequest()
		input.setRestApiId(this.restApiId)
		input.setModelName(this.modelName)
		input.setFlatten(this.flatten)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetModelResult {
	  return com.amazonaws.services.apigateway.model.GetModelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetModelResult {
		return environment.apigateway.getModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-model")
				.argument("rest-api-id", restApiId)
				.argument("model-name", modelName)
				.option("flatten", flatten ?: false)
	}

}


fun AmazonApiGatewayFunctions.getModelTemplate(init: AmazonApiGatewayGetModelTemplateCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetModelTemplateResult {
	return this.block.declare(AmazonApiGatewayGetModelTemplateCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetModelTemplateResult
}

@Generated
class AmazonApiGatewayGetModelTemplateCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetModelTemplateRequest, com.amazonaws.services.apigateway.model.GetModelTemplateResult> {

	var restApiId: String? = null
	var modelName: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetModelTemplateRequest {
		val input = com.amazonaws.services.apigateway.model.GetModelTemplateRequest()
		input.setRestApiId(this.restApiId)
		input.setModelName(this.modelName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetModelTemplateResult {
	  return com.amazonaws.services.apigateway.model.GetModelTemplateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetModelTemplateResult {
		return environment.apigateway.getModelTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-model-template")
				.argument("rest-api-id", restApiId)
				.argument("model-name", modelName)
	}

}


fun AmazonApiGatewayFunctions.getModels(init: AmazonApiGatewayGetModelsCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetModelsResult {
	return this.block.declare(AmazonApiGatewayGetModelsCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetModelsResult
}

@Generated
class AmazonApiGatewayGetModelsCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetModelsRequest, com.amazonaws.services.apigateway.model.GetModelsResult> {

	var restApiId: String? = null
	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetModelsRequest {
		val input = com.amazonaws.services.apigateway.model.GetModelsRequest()
		input.setRestApiId(this.restApiId)
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetModelsResult {
	  return com.amazonaws.services.apigateway.model.GetModelsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetModelsResult {
		return environment.apigateway.getModels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-models")
				.argument("rest-api-id", restApiId)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getRequestValidator(init: AmazonApiGatewayGetRequestValidatorCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetRequestValidatorResult {
	return this.block.declare(AmazonApiGatewayGetRequestValidatorCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetRequestValidatorResult
}

@Generated
class AmazonApiGatewayGetRequestValidatorCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetRequestValidatorRequest, com.amazonaws.services.apigateway.model.GetRequestValidatorResult> {

	var restApiId: String? = null
	var requestValidatorId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetRequestValidatorRequest {
		val input = com.amazonaws.services.apigateway.model.GetRequestValidatorRequest()
		input.setRestApiId(this.restApiId)
		input.setRequestValidatorId(this.requestValidatorId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetRequestValidatorResult {
	  return com.amazonaws.services.apigateway.model.GetRequestValidatorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetRequestValidatorResult {
		return environment.apigateway.getRequestValidator(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-request-validator")
				.argument("rest-api-id", restApiId)
				.argument("request-validator-id", requestValidatorId)
	}

}


fun AmazonApiGatewayFunctions.getRequestValidators(init: AmazonApiGatewayGetRequestValidatorsCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetRequestValidatorsResult {
	return this.block.declare(AmazonApiGatewayGetRequestValidatorsCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetRequestValidatorsResult
}

@Generated
class AmazonApiGatewayGetRequestValidatorsCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetRequestValidatorsRequest, com.amazonaws.services.apigateway.model.GetRequestValidatorsResult> {

	var restApiId: String? = null
	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetRequestValidatorsRequest {
		val input = com.amazonaws.services.apigateway.model.GetRequestValidatorsRequest()
		input.setRestApiId(this.restApiId)
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetRequestValidatorsResult {
	  return com.amazonaws.services.apigateway.model.GetRequestValidatorsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetRequestValidatorsResult {
		return environment.apigateway.getRequestValidators(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-request-validators")
				.argument("rest-api-id", restApiId)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getResource(init: AmazonApiGatewayGetResourceCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetResourceResult {
	return this.block.declare(AmazonApiGatewayGetResourceCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetResourceResult
}

@Generated
class AmazonApiGatewayGetResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetResourceRequest, com.amazonaws.services.apigateway.model.GetResourceResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var embed: List<String>? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetResourceRequest {
		val input = com.amazonaws.services.apigateway.model.GetResourceRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setEmbed(this.embed)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetResourceResult {
	  return com.amazonaws.services.apigateway.model.GetResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetResourceResult {
		return environment.apigateway.getResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-resource")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("embed", embed?.toString())
	}

}


fun AmazonApiGatewayFunctions.getResources(init: AmazonApiGatewayGetResourcesCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetResourcesResult {
	return this.block.declare(AmazonApiGatewayGetResourcesCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetResourcesResult
}

@Generated
class AmazonApiGatewayGetResourcesCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetResourcesRequest, com.amazonaws.services.apigateway.model.GetResourcesResult> {

	var restApiId: String? = null
	var position: String? = null
	var limit: Int? = 0
	var embed: List<String>? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetResourcesRequest {
		val input = com.amazonaws.services.apigateway.model.GetResourcesRequest()
		input.setRestApiId(this.restApiId)
		input.setPosition(this.position)
		input.setLimit(this.limit)
		input.setEmbed(this.embed)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetResourcesResult {
	  return com.amazonaws.services.apigateway.model.GetResourcesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetResourcesResult {
		return environment.apigateway.getResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-resources")
				.argument("rest-api-id", restApiId)
				.argument("position", position)
				.argument("limit", limit?.toString())
				.argument("embed", embed?.toString())
	}

}


fun AmazonApiGatewayFunctions.getRestApi(init: AmazonApiGatewayGetRestApiCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetRestApiResult {
	return this.block.declare(AmazonApiGatewayGetRestApiCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetRestApiResult
}

@Generated
class AmazonApiGatewayGetRestApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetRestApiRequest, com.amazonaws.services.apigateway.model.GetRestApiResult> {

	var restApiId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetRestApiRequest {
		val input = com.amazonaws.services.apigateway.model.GetRestApiRequest()
		input.setRestApiId(this.restApiId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetRestApiResult {
	  return com.amazonaws.services.apigateway.model.GetRestApiResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetRestApiResult {
		return environment.apigateway.getRestApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-rest-api")
				.argument("rest-api-id", restApiId)
	}

}


fun AmazonApiGatewayFunctions.getRestApis(init: AmazonApiGatewayGetRestApisCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetRestApisResult {
	return this.block.declare(AmazonApiGatewayGetRestApisCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetRestApisResult
}

@Generated
class AmazonApiGatewayGetRestApisCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetRestApisRequest, com.amazonaws.services.apigateway.model.GetRestApisResult> {

	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetRestApisRequest {
		val input = com.amazonaws.services.apigateway.model.GetRestApisRequest()
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetRestApisResult {
	  return com.amazonaws.services.apigateway.model.GetRestApisResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetRestApisResult {
		return environment.apigateway.getRestApis(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-rest-apis")
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getSdk(init: AmazonApiGatewayGetSdkCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetSdkResult {
	return this.block.declare(AmazonApiGatewayGetSdkCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetSdkResult
}

@Generated
class AmazonApiGatewayGetSdkCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetSdkRequest, com.amazonaws.services.apigateway.model.GetSdkResult> {

	var restApiId: String? = null
	var stageName: String? = null
	var sdkType: String? = null
	var parameters: Map<String, String>? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetSdkRequest {
		val input = com.amazonaws.services.apigateway.model.GetSdkRequest()
		input.setRestApiId(this.restApiId)
		input.setStageName(this.stageName)
		input.setSdkType(this.sdkType)
		input.setParameters(this.parameters)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetSdkResult {
	  return com.amazonaws.services.apigateway.model.GetSdkResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetSdkResult {
		return environment.apigateway.getSdk(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-sdk")
				.argument("rest-api-id", restApiId)
				.argument("stage-name", stageName)
				.argument("sdk-type", sdkType)
				.argument("parameters", parameters?.toString())
	}

}


fun AmazonApiGatewayFunctions.getSdkType(init: AmazonApiGatewayGetSdkTypeCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetSdkTypeResult {
	return this.block.declare(AmazonApiGatewayGetSdkTypeCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetSdkTypeResult
}

@Generated
class AmazonApiGatewayGetSdkTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetSdkTypeRequest, com.amazonaws.services.apigateway.model.GetSdkTypeResult> {

	var id: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetSdkTypeRequest {
		val input = com.amazonaws.services.apigateway.model.GetSdkTypeRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetSdkTypeResult {
	  return com.amazonaws.services.apigateway.model.GetSdkTypeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetSdkTypeResult {
		return environment.apigateway.getSdkType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-sdk-type")
				.argument("id", id)
	}

}


fun AmazonApiGatewayFunctions.getSdkTypes(init: AmazonApiGatewayGetSdkTypesCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetSdkTypesResult {
	return this.block.declare(AmazonApiGatewayGetSdkTypesCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetSdkTypesResult
}

@Generated
class AmazonApiGatewayGetSdkTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetSdkTypesRequest, com.amazonaws.services.apigateway.model.GetSdkTypesResult> {

	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetSdkTypesRequest {
		val input = com.amazonaws.services.apigateway.model.GetSdkTypesRequest()
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetSdkTypesResult {
	  return com.amazonaws.services.apigateway.model.GetSdkTypesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetSdkTypesResult {
		return environment.apigateway.getSdkTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-sdk-types")
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getStage(init: AmazonApiGatewayGetStageCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetStageResult {
	return this.block.declare(AmazonApiGatewayGetStageCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetStageResult
}

@Generated
class AmazonApiGatewayGetStageCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetStageRequest, com.amazonaws.services.apigateway.model.GetStageResult> {

	var restApiId: String? = null
	var stageName: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetStageRequest {
		val input = com.amazonaws.services.apigateway.model.GetStageRequest()
		input.setRestApiId(this.restApiId)
		input.setStageName(this.stageName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetStageResult {
	  return com.amazonaws.services.apigateway.model.GetStageResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetStageResult {
		return environment.apigateway.getStage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-stage")
				.argument("rest-api-id", restApiId)
				.argument("stage-name", stageName)
	}

}


fun AmazonApiGatewayFunctions.getStages(init: AmazonApiGatewayGetStagesCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetStagesResult {
	return this.block.declare(AmazonApiGatewayGetStagesCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetStagesResult
}

@Generated
class AmazonApiGatewayGetStagesCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetStagesRequest, com.amazonaws.services.apigateway.model.GetStagesResult> {

	var restApiId: String? = null
	var deploymentId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetStagesRequest {
		val input = com.amazonaws.services.apigateway.model.GetStagesRequest()
		input.setRestApiId(this.restApiId)
		input.setDeploymentId(this.deploymentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetStagesResult {
	  return com.amazonaws.services.apigateway.model.GetStagesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetStagesResult {
		return environment.apigateway.getStages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-stages")
				.argument("rest-api-id", restApiId)
				.argument("deployment-id", deploymentId)
	}

}


fun AmazonApiGatewayFunctions.getTags(init: AmazonApiGatewayGetTagsCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetTagsResult {
	return this.block.declare(AmazonApiGatewayGetTagsCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetTagsResult
}

@Generated
class AmazonApiGatewayGetTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetTagsRequest, com.amazonaws.services.apigateway.model.GetTagsResult> {

	var resourceArn: String? = null
	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetTagsRequest {
		val input = com.amazonaws.services.apigateway.model.GetTagsRequest()
		input.setResourceArn(this.resourceArn)
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetTagsResult {
	  return com.amazonaws.services.apigateway.model.GetTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetTagsResult {
		return environment.apigateway.getTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-tags")
				.argument("resource-arn", resourceArn)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getUsage(init: AmazonApiGatewayGetUsageCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetUsageResult {
	return this.block.declare(AmazonApiGatewayGetUsageCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetUsageResult
}

@Generated
class AmazonApiGatewayGetUsageCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetUsageRequest, com.amazonaws.services.apigateway.model.GetUsageResult> {

	var usagePlanId: String? = null
	var keyId: String? = null
	var startDate: String? = null
	var endDate: String? = null
	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetUsageRequest {
		val input = com.amazonaws.services.apigateway.model.GetUsageRequest()
		input.setUsagePlanId(this.usagePlanId)
		input.setKeyId(this.keyId)
		input.setStartDate(this.startDate)
		input.setEndDate(this.endDate)
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetUsageResult {
	  return com.amazonaws.services.apigateway.model.GetUsageResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetUsageResult {
		return environment.apigateway.getUsage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-usage")
				.argument("usage-plan-id", usagePlanId)
				.argument("key-id", keyId)
				.argument("start-date", startDate)
				.argument("end-date", endDate)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getUsagePlan(init: AmazonApiGatewayGetUsagePlanCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetUsagePlanResult {
	return this.block.declare(AmazonApiGatewayGetUsagePlanCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetUsagePlanResult
}

@Generated
class AmazonApiGatewayGetUsagePlanCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetUsagePlanRequest, com.amazonaws.services.apigateway.model.GetUsagePlanResult> {

	var usagePlanId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetUsagePlanRequest {
		val input = com.amazonaws.services.apigateway.model.GetUsagePlanRequest()
		input.setUsagePlanId(this.usagePlanId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetUsagePlanResult {
	  return com.amazonaws.services.apigateway.model.GetUsagePlanResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetUsagePlanResult {
		return environment.apigateway.getUsagePlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-usage-plan")
				.argument("usage-plan-id", usagePlanId)
	}

}


fun AmazonApiGatewayFunctions.getUsagePlanKey(init: AmazonApiGatewayGetUsagePlanKeyCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetUsagePlanKeyResult {
	return this.block.declare(AmazonApiGatewayGetUsagePlanKeyCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetUsagePlanKeyResult
}

@Generated
class AmazonApiGatewayGetUsagePlanKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest, com.amazonaws.services.apigateway.model.GetUsagePlanKeyResult> {

	var usagePlanId: String? = null
	var keyId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest {
		val input = com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest()
		input.setUsagePlanId(this.usagePlanId)
		input.setKeyId(this.keyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetUsagePlanKeyResult {
	  return com.amazonaws.services.apigateway.model.GetUsagePlanKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetUsagePlanKeyResult {
		return environment.apigateway.getUsagePlanKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-usage-plan-key")
				.argument("usage-plan-id", usagePlanId)
				.argument("key-id", keyId)
	}

}


fun AmazonApiGatewayFunctions.getUsagePlanKeys(init: AmazonApiGatewayGetUsagePlanKeysCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetUsagePlanKeysResult {
	return this.block.declare(AmazonApiGatewayGetUsagePlanKeysCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetUsagePlanKeysResult
}

@Generated
class AmazonApiGatewayGetUsagePlanKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetUsagePlanKeysRequest, com.amazonaws.services.apigateway.model.GetUsagePlanKeysResult> {

	var usagePlanId: String? = null
	var position: String? = null
	var limit: Int? = 0
	var nameQuery: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetUsagePlanKeysRequest {
		val input = com.amazonaws.services.apigateway.model.GetUsagePlanKeysRequest()
		input.setUsagePlanId(this.usagePlanId)
		input.setPosition(this.position)
		input.setLimit(this.limit)
		input.setNameQuery(this.nameQuery)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetUsagePlanKeysResult {
	  return com.amazonaws.services.apigateway.model.GetUsagePlanKeysResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetUsagePlanKeysResult {
		return environment.apigateway.getUsagePlanKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-usage-plan-keys")
				.argument("usage-plan-id", usagePlanId)
				.argument("position", position)
				.argument("limit", limit?.toString())
				.argument("name-query", nameQuery)
	}

}


fun AmazonApiGatewayFunctions.getUsagePlans(init: AmazonApiGatewayGetUsagePlansCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetUsagePlansResult {
	return this.block.declare(AmazonApiGatewayGetUsagePlansCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetUsagePlansResult
}

@Generated
class AmazonApiGatewayGetUsagePlansCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetUsagePlansRequest, com.amazonaws.services.apigateway.model.GetUsagePlansResult> {

	var position: String? = null
	var keyId: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetUsagePlansRequest {
		val input = com.amazonaws.services.apigateway.model.GetUsagePlansRequest()
		input.setPosition(this.position)
		input.setKeyId(this.keyId)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetUsagePlansResult {
	  return com.amazonaws.services.apigateway.model.GetUsagePlansResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetUsagePlansResult {
		return environment.apigateway.getUsagePlans(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-usage-plans")
				.argument("position", position)
				.argument("key-id", keyId)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getVpcLink(init: AmazonApiGatewayGetVpcLinkCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetVpcLinkResult {
	return this.block.declare(AmazonApiGatewayGetVpcLinkCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetVpcLinkResult
}

@Generated
class AmazonApiGatewayGetVpcLinkCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetVpcLinkRequest, com.amazonaws.services.apigateway.model.GetVpcLinkResult> {

	var vpcLinkId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetVpcLinkRequest {
		val input = com.amazonaws.services.apigateway.model.GetVpcLinkRequest()
		input.setVpcLinkId(this.vpcLinkId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetVpcLinkResult {
	  return com.amazonaws.services.apigateway.model.GetVpcLinkResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetVpcLinkResult {
		return environment.apigateway.getVpcLink(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-vpc-link")
				.argument("vpc-link-id", vpcLinkId)
	}

}


fun AmazonApiGatewayFunctions.getVpcLinks(init: AmazonApiGatewayGetVpcLinksCommand.() -> Unit): com.amazonaws.services.apigateway.model.GetVpcLinksResult {
	return this.block.declare(AmazonApiGatewayGetVpcLinksCommand().apply(init)) as com.amazonaws.services.apigateway.model.GetVpcLinksResult
}

@Generated
class AmazonApiGatewayGetVpcLinksCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetVpcLinksRequest, com.amazonaws.services.apigateway.model.GetVpcLinksResult> {

	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetVpcLinksRequest {
		val input = com.amazonaws.services.apigateway.model.GetVpcLinksRequest()
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.GetVpcLinksResult {
	  return com.amazonaws.services.apigateway.model.GetVpcLinksResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.GetVpcLinksResult {
		return environment.apigateway.getVpcLinks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-vpc-links")
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.importApiKeys(init: AmazonApiGatewayImportApiKeysCommand.() -> Unit): com.amazonaws.services.apigateway.model.ImportApiKeysResult {
	return this.block.declare(AmazonApiGatewayImportApiKeysCommand().apply(init)) as com.amazonaws.services.apigateway.model.ImportApiKeysResult
}

@Generated
class AmazonApiGatewayImportApiKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.ImportApiKeysRequest, com.amazonaws.services.apigateway.model.ImportApiKeysResult> {

	var body: java.nio.ByteBuffer? = null
	var format: ApiKeysFormat? = null
	var failOnWarnings: Boolean? = false

	override fun build(): com.amazonaws.services.apigateway.model.ImportApiKeysRequest {
		val input = com.amazonaws.services.apigateway.model.ImportApiKeysRequest()
		input.setBody(this.body)
		input.setFormat(this.format?.toString())
		input.setFailOnWarnings(this.failOnWarnings)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.ImportApiKeysResult {
	  return com.amazonaws.services.apigateway.model.ImportApiKeysResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.ImportApiKeysResult {
		return environment.apigateway.importApiKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway import-api-keys")
				.argument("body", body?.toString())
				.argument("format", format?.toString())
				.option("fail-on-warnings", failOnWarnings ?: false)
	}

}


fun AmazonApiGatewayFunctions.importDocumentationParts(init: AmazonApiGatewayImportDocumentationPartsCommand.() -> Unit): com.amazonaws.services.apigateway.model.ImportDocumentationPartsResult {
	return this.block.declare(AmazonApiGatewayImportDocumentationPartsCommand().apply(init)) as com.amazonaws.services.apigateway.model.ImportDocumentationPartsResult
}

@Generated
class AmazonApiGatewayImportDocumentationPartsCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.ImportDocumentationPartsRequest, com.amazonaws.services.apigateway.model.ImportDocumentationPartsResult> {

	var restApiId: String? = null
	var mode: PutMode? = null
	var failOnWarnings: Boolean? = false
	var body: java.nio.ByteBuffer? = null

	override fun build(): com.amazonaws.services.apigateway.model.ImportDocumentationPartsRequest {
		val input = com.amazonaws.services.apigateway.model.ImportDocumentationPartsRequest()
		input.setRestApiId(this.restApiId)
		input.setMode(this.mode?.toString())
		input.setFailOnWarnings(this.failOnWarnings)
		input.setBody(this.body)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.ImportDocumentationPartsResult {
	  return com.amazonaws.services.apigateway.model.ImportDocumentationPartsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.ImportDocumentationPartsResult {
		return environment.apigateway.importDocumentationParts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway import-documentation-parts")
				.argument("rest-api-id", restApiId)
				.argument("mode", mode?.toString())
				.option("fail-on-warnings", failOnWarnings ?: false)
				.argument("body", body?.toString())
	}

}


fun AmazonApiGatewayFunctions.importRestApi(init: AmazonApiGatewayImportRestApiCommand.() -> Unit): com.amazonaws.services.apigateway.model.ImportRestApiResult {
	return this.block.declare(AmazonApiGatewayImportRestApiCommand().apply(init)) as com.amazonaws.services.apigateway.model.ImportRestApiResult
}

@Generated
class AmazonApiGatewayImportRestApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.ImportRestApiRequest, com.amazonaws.services.apigateway.model.ImportRestApiResult> {

	var failOnWarnings: Boolean? = false
	var parameters: Map<String, String>? = null
	var body: java.nio.ByteBuffer? = null

	override fun build(): com.amazonaws.services.apigateway.model.ImportRestApiRequest {
		val input = com.amazonaws.services.apigateway.model.ImportRestApiRequest()
		input.setFailOnWarnings(this.failOnWarnings)
		input.setParameters(this.parameters)
		input.setBody(this.body)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.ImportRestApiResult {
	  return com.amazonaws.services.apigateway.model.ImportRestApiResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.ImportRestApiResult {
		return environment.apigateway.importRestApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway import-rest-api")
				.option("fail-on-warnings", failOnWarnings ?: false)
				.argument("parameters", parameters?.toString())
				.argument("body", body?.toString())
	}

}


fun AmazonApiGatewayFunctions.putGatewayResponse(init: AmazonApiGatewayPutGatewayResponseCommand.() -> Unit): com.amazonaws.services.apigateway.model.PutGatewayResponseResult {
	return this.block.declare(AmazonApiGatewayPutGatewayResponseCommand().apply(init)) as com.amazonaws.services.apigateway.model.PutGatewayResponseResult
}

@Generated
class AmazonApiGatewayPutGatewayResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.PutGatewayResponseRequest, com.amazonaws.services.apigateway.model.PutGatewayResponseResult> {

	var restApiId: String? = null
	var responseType: GatewayResponseType? = null
	var statusCode: String? = null
	var responseParameters: Map<String, String>? = null
	var responseTemplates: Map<String, String>? = null

	override fun build(): com.amazonaws.services.apigateway.model.PutGatewayResponseRequest {
		val input = com.amazonaws.services.apigateway.model.PutGatewayResponseRequest()
		input.setRestApiId(this.restApiId)
		input.setResponseType(this.responseType?.toString())
		input.setStatusCode(this.statusCode)
		input.setResponseParameters(this.responseParameters)
		input.setResponseTemplates(this.responseTemplates)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.PutGatewayResponseResult {
	  return com.amazonaws.services.apigateway.model.PutGatewayResponseResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.PutGatewayResponseResult {
		return environment.apigateway.putGatewayResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway put-gateway-response")
				.argument("rest-api-id", restApiId)
				.argument("response-type", responseType?.toString())
				.argument("status-code", statusCode)
				.argument("response-parameters", responseParameters?.toString())
				.argument("response-templates", responseTemplates?.toString())
	}

}


fun AmazonApiGatewayFunctions.putIntegration(init: AmazonApiGatewayPutIntegrationCommand.() -> Unit): com.amazonaws.services.apigateway.model.PutIntegrationResult {
	return this.block.declare(AmazonApiGatewayPutIntegrationCommand().apply(init)) as com.amazonaws.services.apigateway.model.PutIntegrationResult
}

@Generated
class AmazonApiGatewayPutIntegrationCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.PutIntegrationRequest, com.amazonaws.services.apigateway.model.PutIntegrationResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null
	var type: IntegrationType? = null
	var integrationHttpMethod: String? = null
	var uri: String? = null
	var connectionType: ConnectionType? = null
	var connectionId: String? = null
	var credentials: String? = null
	var requestParameters: Map<String, String>? = null
	var requestTemplates: Map<String, String>? = null
	var passthroughBehavior: String? = null
	var cacheNamespace: String? = null
	var cacheKeyParameters: List<String>? = null
	var contentHandling: ContentHandlingStrategy? = null
	var timeoutInMillis: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.PutIntegrationRequest {
		val input = com.amazonaws.services.apigateway.model.PutIntegrationRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		input.setType(this.type?.toString())
		input.setIntegrationHttpMethod(this.integrationHttpMethod)
		input.setUri(this.uri)
		input.setConnectionType(this.connectionType?.toString())
		input.setConnectionId(this.connectionId)
		input.setCredentials(this.credentials)
		input.setRequestParameters(this.requestParameters)
		input.setRequestTemplates(this.requestTemplates)
		input.setPassthroughBehavior(this.passthroughBehavior)
		input.setCacheNamespace(this.cacheNamespace)
		input.setCacheKeyParameters(this.cacheKeyParameters)
		input.setContentHandling(this.contentHandling?.toString())
		input.setTimeoutInMillis(this.timeoutInMillis)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.PutIntegrationResult {
	  return com.amazonaws.services.apigateway.model.PutIntegrationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.PutIntegrationResult {
		return environment.apigateway.putIntegration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway put-integration")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("type", type?.toString())
				.argument("integration-http-method", integrationHttpMethod)
				.argument("uri", uri)
				.argument("connection-type", connectionType?.toString())
				.argument("connection-id", connectionId)
				.argument("credentials", credentials)
				.argument("request-parameters", requestParameters?.toString())
				.argument("request-templates", requestTemplates?.toString())
				.argument("passthrough-behavior", passthroughBehavior)
				.argument("cache-namespace", cacheNamespace)
				.argument("cache-key-parameters", cacheKeyParameters?.toString())
				.argument("content-handling", contentHandling?.toString())
				.argument("timeout-in-millis", timeoutInMillis?.toString())
	}

}


fun AmazonApiGatewayFunctions.putIntegrationResponse(init: AmazonApiGatewayPutIntegrationResponseCommand.() -> Unit): com.amazonaws.services.apigateway.model.PutIntegrationResponseResult {
	return this.block.declare(AmazonApiGatewayPutIntegrationResponseCommand().apply(init)) as com.amazonaws.services.apigateway.model.PutIntegrationResponseResult
}

@Generated
class AmazonApiGatewayPutIntegrationResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.PutIntegrationResponseRequest, com.amazonaws.services.apigateway.model.PutIntegrationResponseResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null
	var statusCode: String? = null
	var selectionPattern: String? = null
	var responseParameters: Map<String, String>? = null
	var responseTemplates: Map<String, String>? = null
	var contentHandling: ContentHandlingStrategy? = null

	override fun build(): com.amazonaws.services.apigateway.model.PutIntegrationResponseRequest {
		val input = com.amazonaws.services.apigateway.model.PutIntegrationResponseRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		input.setStatusCode(this.statusCode)
		input.setSelectionPattern(this.selectionPattern)
		input.setResponseParameters(this.responseParameters)
		input.setResponseTemplates(this.responseTemplates)
		input.setContentHandling(this.contentHandling?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.PutIntegrationResponseResult {
	  return com.amazonaws.services.apigateway.model.PutIntegrationResponseResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.PutIntegrationResponseResult {
		return environment.apigateway.putIntegrationResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway put-integration-response")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("status-code", statusCode)
				.argument("selection-pattern", selectionPattern)
				.argument("response-parameters", responseParameters?.toString())
				.argument("response-templates", responseTemplates?.toString())
				.argument("content-handling", contentHandling?.toString())
	}

}


fun AmazonApiGatewayFunctions.putMethod(init: AmazonApiGatewayPutMethodCommand.() -> Unit): com.amazonaws.services.apigateway.model.PutMethodResult {
	return this.block.declare(AmazonApiGatewayPutMethodCommand().apply(init)) as com.amazonaws.services.apigateway.model.PutMethodResult
}

@Generated
class AmazonApiGatewayPutMethodCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.PutMethodRequest, com.amazonaws.services.apigateway.model.PutMethodResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null
	var authorizationType: String? = null
	var authorizerId: String? = null
	var apiKeyRequired: Boolean? = false
	var operationName: String? = null
	var requestParameters: Map<String, Boolean>? = null
	var requestModels: Map<String, String>? = null
	var requestValidatorId: String? = null
	var authorizationScopes: List<String>? = null

	override fun build(): com.amazonaws.services.apigateway.model.PutMethodRequest {
		val input = com.amazonaws.services.apigateway.model.PutMethodRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		input.setAuthorizationType(this.authorizationType)
		input.setAuthorizerId(this.authorizerId)
		input.setApiKeyRequired(this.apiKeyRequired)
		input.setOperationName(this.operationName)
		input.setRequestParameters(this.requestParameters)
		input.setRequestModels(this.requestModels)
		input.setRequestValidatorId(this.requestValidatorId)
		input.setAuthorizationScopes(this.authorizationScopes)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.PutMethodResult {
	  return com.amazonaws.services.apigateway.model.PutMethodResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.PutMethodResult {
		return environment.apigateway.putMethod(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway put-method")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("authorization-type", authorizationType)
				.argument("authorizer-id", authorizerId)
				.option("api-key-required", apiKeyRequired ?: false)
				.argument("operation-name", operationName)
				.argument("request-parameters", requestParameters?.toString())
				.argument("request-models", requestModels?.toString())
				.argument("request-validator-id", requestValidatorId)
				.argument("authorization-scopes", authorizationScopes?.toString())
	}

}


fun AmazonApiGatewayFunctions.putMethodResponse(init: AmazonApiGatewayPutMethodResponseCommand.() -> Unit): com.amazonaws.services.apigateway.model.PutMethodResponseResult {
	return this.block.declare(AmazonApiGatewayPutMethodResponseCommand().apply(init)) as com.amazonaws.services.apigateway.model.PutMethodResponseResult
}

@Generated
class AmazonApiGatewayPutMethodResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.PutMethodResponseRequest, com.amazonaws.services.apigateway.model.PutMethodResponseResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null
	var statusCode: String? = null
	var responseParameters: Map<String, Boolean>? = null
	var responseModels: Map<String, String>? = null

	override fun build(): com.amazonaws.services.apigateway.model.PutMethodResponseRequest {
		val input = com.amazonaws.services.apigateway.model.PutMethodResponseRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		input.setStatusCode(this.statusCode)
		input.setResponseParameters(this.responseParameters)
		input.setResponseModels(this.responseModels)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.PutMethodResponseResult {
	  return com.amazonaws.services.apigateway.model.PutMethodResponseResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.PutMethodResponseResult {
		return environment.apigateway.putMethodResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway put-method-response")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("status-code", statusCode)
				.argument("response-parameters", responseParameters?.toString())
				.argument("response-models", responseModels?.toString())
	}

}


fun AmazonApiGatewayFunctions.putRestApi(init: AmazonApiGatewayPutRestApiCommand.() -> Unit): com.amazonaws.services.apigateway.model.PutRestApiResult {
	return this.block.declare(AmazonApiGatewayPutRestApiCommand().apply(init)) as com.amazonaws.services.apigateway.model.PutRestApiResult
}

@Generated
class AmazonApiGatewayPutRestApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.PutRestApiRequest, com.amazonaws.services.apigateway.model.PutRestApiResult> {

	var restApiId: String? = null
	var mode: PutMode? = null
	var failOnWarnings: Boolean? = false
	var parameters: Map<String, String>? = null
	var body: java.nio.ByteBuffer? = null

	override fun build(): com.amazonaws.services.apigateway.model.PutRestApiRequest {
		val input = com.amazonaws.services.apigateway.model.PutRestApiRequest()
		input.setRestApiId(this.restApiId)
		input.setMode(this.mode?.toString())
		input.setFailOnWarnings(this.failOnWarnings)
		input.setParameters(this.parameters)
		input.setBody(this.body)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.PutRestApiResult {
	  return com.amazonaws.services.apigateway.model.PutRestApiResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.PutRestApiResult {
		return environment.apigateway.putRestApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway put-rest-api")
				.argument("rest-api-id", restApiId)
				.argument("mode", mode?.toString())
				.option("fail-on-warnings", failOnWarnings ?: false)
				.argument("parameters", parameters?.toString())
				.argument("body", body?.toString())
	}

}


fun AmazonApiGatewayFunctions.tagResource(init: AmazonApiGatewayTagResourceCommand.() -> Unit): com.amazonaws.services.apigateway.model.TagResourceResult {
	return this.block.declare(AmazonApiGatewayTagResourceCommand().apply(init)) as com.amazonaws.services.apigateway.model.TagResourceResult
}

@Generated
class AmazonApiGatewayTagResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.TagResourceRequest, com.amazonaws.services.apigateway.model.TagResourceResult> {

	var resourceArn: String? = null
	var tags: Map<String, String>? = null

	override fun build(): com.amazonaws.services.apigateway.model.TagResourceRequest {
		val input = com.amazonaws.services.apigateway.model.TagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.TagResourceResult {
	  return com.amazonaws.services.apigateway.model.TagResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.TagResourceResult {
		return environment.apigateway.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway tag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags?.toString())
	}

}


fun AmazonApiGatewayFunctions.testInvokeAuthorizer(init: AmazonApiGatewayTestInvokeAuthorizerCommand.() -> Unit): com.amazonaws.services.apigateway.model.TestInvokeAuthorizerResult {
	return this.block.declare(AmazonApiGatewayTestInvokeAuthorizerCommand().apply(init)) as com.amazonaws.services.apigateway.model.TestInvokeAuthorizerResult
}

@Generated
class AmazonApiGatewayTestInvokeAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.TestInvokeAuthorizerRequest, com.amazonaws.services.apigateway.model.TestInvokeAuthorizerResult> {

	var restApiId: String? = null
	var authorizerId: String? = null
	var headers: Map<String, String>? = null
	var pathWithQueryString: String? = null
	var body: String? = null
	var stageVariables: Map<String, String>? = null
	var additionalContext: Map<String, String>? = null

	override fun build(): com.amazonaws.services.apigateway.model.TestInvokeAuthorizerRequest {
		val input = com.amazonaws.services.apigateway.model.TestInvokeAuthorizerRequest()
		input.setRestApiId(this.restApiId)
		input.setAuthorizerId(this.authorizerId)
		input.setHeaders(this.headers)
		input.setPathWithQueryString(this.pathWithQueryString)
		input.setBody(this.body)
		input.setStageVariables(this.stageVariables)
		input.setAdditionalContext(this.additionalContext)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.TestInvokeAuthorizerResult {
	  return com.amazonaws.services.apigateway.model.TestInvokeAuthorizerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.TestInvokeAuthorizerResult {
		return environment.apigateway.testInvokeAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway test-invoke-authorizer")
				.argument("rest-api-id", restApiId)
				.argument("authorizer-id", authorizerId)
				.argument("headers", headers?.toString())
				.argument("path-with-query-string", pathWithQueryString)
				.argument("body", body)
				.argument("stage-variables", stageVariables?.toString())
				.argument("additional-context", additionalContext?.toString())
	}

}


fun AmazonApiGatewayFunctions.testInvokeMethod(init: AmazonApiGatewayTestInvokeMethodCommand.() -> Unit): com.amazonaws.services.apigateway.model.TestInvokeMethodResult {
	return this.block.declare(AmazonApiGatewayTestInvokeMethodCommand().apply(init)) as com.amazonaws.services.apigateway.model.TestInvokeMethodResult
}

@Generated
class AmazonApiGatewayTestInvokeMethodCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.TestInvokeMethodRequest, com.amazonaws.services.apigateway.model.TestInvokeMethodResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null
	var pathWithQueryString: String? = null
	var body: String? = null
	var headers: Map<String, String>? = null
	var clientCertificateId: String? = null
	var stageVariables: Map<String, String>? = null

	override fun build(): com.amazonaws.services.apigateway.model.TestInvokeMethodRequest {
		val input = com.amazonaws.services.apigateway.model.TestInvokeMethodRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		input.setPathWithQueryString(this.pathWithQueryString)
		input.setBody(this.body)
		input.setHeaders(this.headers)
		input.setClientCertificateId(this.clientCertificateId)
		input.setStageVariables(this.stageVariables)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.TestInvokeMethodResult {
	  return com.amazonaws.services.apigateway.model.TestInvokeMethodResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.TestInvokeMethodResult {
		return environment.apigateway.testInvokeMethod(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway test-invoke-method")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("path-with-query-string", pathWithQueryString)
				.argument("body", body)
				.argument("headers", headers?.toString())
				.argument("client-certificate-id", clientCertificateId)
				.argument("stage-variables", stageVariables?.toString())
	}

}


fun AmazonApiGatewayFunctions.untagResource(init: AmazonApiGatewayUntagResourceCommand.() -> Unit): com.amazonaws.services.apigateway.model.UntagResourceResult {
	return this.block.declare(AmazonApiGatewayUntagResourceCommand().apply(init)) as com.amazonaws.services.apigateway.model.UntagResourceResult
}

@Generated
class AmazonApiGatewayUntagResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UntagResourceRequest, com.amazonaws.services.apigateway.model.UntagResourceResult> {

	var resourceArn: String? = null
	var tagKeys: List<String>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UntagResourceRequest {
		val input = com.amazonaws.services.apigateway.model.UntagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UntagResourceResult {
	  return com.amazonaws.services.apigateway.model.UntagResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UntagResourceResult {
		return environment.apigateway.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway untag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-keys", tagKeys?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateAccount(init: AmazonApiGatewayUpdateAccountCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateAccountResult {
	return this.block.declare(AmazonApiGatewayUpdateAccountCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateAccountResult
}

@Generated
class AmazonApiGatewayUpdateAccountCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateAccountRequest, com.amazonaws.services.apigateway.model.UpdateAccountResult> {

	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateAccountRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateAccountRequest()
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateAccountResult {
	  return com.amazonaws.services.apigateway.model.UpdateAccountResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateAccountResult {
		return environment.apigateway.updateAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-account")
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateApiKey(init: AmazonApiGatewayUpdateApiKeyCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateApiKeyResult {
	return this.block.declare(AmazonApiGatewayUpdateApiKeyCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateApiKeyResult
}

@Generated
class AmazonApiGatewayUpdateApiKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateApiKeyRequest, com.amazonaws.services.apigateway.model.UpdateApiKeyResult> {

	var apiKey: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateApiKeyRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateApiKeyRequest()
		input.setApiKey(this.apiKey)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateApiKeyResult {
	  return com.amazonaws.services.apigateway.model.UpdateApiKeyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateApiKeyResult {
		return environment.apigateway.updateApiKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-api-key")
				.argument("api-key", apiKey)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateAuthorizer(init: AmazonApiGatewayUpdateAuthorizerCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateAuthorizerResult {
	return this.block.declare(AmazonApiGatewayUpdateAuthorizerCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateAuthorizerResult
}

@Generated
class AmazonApiGatewayUpdateAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateAuthorizerRequest, com.amazonaws.services.apigateway.model.UpdateAuthorizerResult> {

	var restApiId: String? = null
	var authorizerId: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateAuthorizerRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateAuthorizerRequest()
		input.setRestApiId(this.restApiId)
		input.setAuthorizerId(this.authorizerId)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateAuthorizerResult {
	  return com.amazonaws.services.apigateway.model.UpdateAuthorizerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateAuthorizerResult {
		return environment.apigateway.updateAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-authorizer")
				.argument("rest-api-id", restApiId)
				.argument("authorizer-id", authorizerId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateBasePathMapping(init: AmazonApiGatewayUpdateBasePathMappingCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateBasePathMappingResult {
	return this.block.declare(AmazonApiGatewayUpdateBasePathMappingCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateBasePathMappingResult
}

@Generated
class AmazonApiGatewayUpdateBasePathMappingCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateBasePathMappingRequest, com.amazonaws.services.apigateway.model.UpdateBasePathMappingResult> {

	var domainName: String? = null
	var basePath: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateBasePathMappingRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateBasePathMappingRequest()
		input.setDomainName(this.domainName)
		input.setBasePath(this.basePath)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateBasePathMappingResult {
	  return com.amazonaws.services.apigateway.model.UpdateBasePathMappingResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateBasePathMappingResult {
		return environment.apigateway.updateBasePathMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-base-path-mapping")
				.argument("domain-name", domainName)
				.argument("base-path", basePath)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateClientCertificate(init: AmazonApiGatewayUpdateClientCertificateCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateClientCertificateResult {
	return this.block.declare(AmazonApiGatewayUpdateClientCertificateCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateClientCertificateResult
}

@Generated
class AmazonApiGatewayUpdateClientCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest, com.amazonaws.services.apigateway.model.UpdateClientCertificateResult> {

	var clientCertificateId: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest()
		input.setClientCertificateId(this.clientCertificateId)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateClientCertificateResult {
	  return com.amazonaws.services.apigateway.model.UpdateClientCertificateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateClientCertificateResult {
		return environment.apigateway.updateClientCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-client-certificate")
				.argument("client-certificate-id", clientCertificateId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateDeployment(init: AmazonApiGatewayUpdateDeploymentCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateDeploymentResult {
	return this.block.declare(AmazonApiGatewayUpdateDeploymentCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateDeploymentResult
}

@Generated
class AmazonApiGatewayUpdateDeploymentCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateDeploymentRequest, com.amazonaws.services.apigateway.model.UpdateDeploymentResult> {

	var restApiId: String? = null
	var deploymentId: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateDeploymentRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateDeploymentRequest()
		input.setRestApiId(this.restApiId)
		input.setDeploymentId(this.deploymentId)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateDeploymentResult {
	  return com.amazonaws.services.apigateway.model.UpdateDeploymentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateDeploymentResult {
		return environment.apigateway.updateDeployment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-deployment")
				.argument("rest-api-id", restApiId)
				.argument("deployment-id", deploymentId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateDocumentationPart(init: AmazonApiGatewayUpdateDocumentationPartCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateDocumentationPartResult {
	return this.block.declare(AmazonApiGatewayUpdateDocumentationPartCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateDocumentationPartResult
}

@Generated
class AmazonApiGatewayUpdateDocumentationPartCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateDocumentationPartRequest, com.amazonaws.services.apigateway.model.UpdateDocumentationPartResult> {

	var restApiId: String? = null
	var documentationPartId: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateDocumentationPartRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateDocumentationPartRequest()
		input.setRestApiId(this.restApiId)
		input.setDocumentationPartId(this.documentationPartId)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateDocumentationPartResult {
	  return com.amazonaws.services.apigateway.model.UpdateDocumentationPartResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateDocumentationPartResult {
		return environment.apigateway.updateDocumentationPart(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-documentation-part")
				.argument("rest-api-id", restApiId)
				.argument("documentation-part-id", documentationPartId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateDocumentationVersion(init: AmazonApiGatewayUpdateDocumentationVersionCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateDocumentationVersionResult {
	return this.block.declare(AmazonApiGatewayUpdateDocumentationVersionCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateDocumentationVersionResult
}

@Generated
class AmazonApiGatewayUpdateDocumentationVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateDocumentationVersionRequest, com.amazonaws.services.apigateway.model.UpdateDocumentationVersionResult> {

	var restApiId: String? = null
	var documentationVersion: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateDocumentationVersionRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateDocumentationVersionRequest()
		input.setRestApiId(this.restApiId)
		input.setDocumentationVersion(this.documentationVersion)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateDocumentationVersionResult {
	  return com.amazonaws.services.apigateway.model.UpdateDocumentationVersionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateDocumentationVersionResult {
		return environment.apigateway.updateDocumentationVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-documentation-version")
				.argument("rest-api-id", restApiId)
				.argument("documentation-version", documentationVersion)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateDomainName(init: AmazonApiGatewayUpdateDomainNameCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateDomainNameResult {
	return this.block.declare(AmazonApiGatewayUpdateDomainNameCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateDomainNameResult
}

@Generated
class AmazonApiGatewayUpdateDomainNameCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateDomainNameRequest, com.amazonaws.services.apigateway.model.UpdateDomainNameResult> {

	var domainName: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateDomainNameRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateDomainNameRequest()
		input.setDomainName(this.domainName)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateDomainNameResult {
	  return com.amazonaws.services.apigateway.model.UpdateDomainNameResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateDomainNameResult {
		return environment.apigateway.updateDomainName(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-domain-name")
				.argument("domain-name", domainName)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateGatewayResponse(init: AmazonApiGatewayUpdateGatewayResponseCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateGatewayResponseResult {
	return this.block.declare(AmazonApiGatewayUpdateGatewayResponseCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateGatewayResponseResult
}

@Generated
class AmazonApiGatewayUpdateGatewayResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateGatewayResponseRequest, com.amazonaws.services.apigateway.model.UpdateGatewayResponseResult> {

	var restApiId: String? = null
	var responseType: GatewayResponseType? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateGatewayResponseRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateGatewayResponseRequest()
		input.setRestApiId(this.restApiId)
		input.setResponseType(this.responseType?.toString())
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateGatewayResponseResult {
	  return com.amazonaws.services.apigateway.model.UpdateGatewayResponseResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateGatewayResponseResult {
		return environment.apigateway.updateGatewayResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-gateway-response")
				.argument("rest-api-id", restApiId)
				.argument("response-type", responseType?.toString())
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateIntegration(init: AmazonApiGatewayUpdateIntegrationCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateIntegrationResult {
	return this.block.declare(AmazonApiGatewayUpdateIntegrationCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateIntegrationResult
}

@Generated
class AmazonApiGatewayUpdateIntegrationCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateIntegrationRequest, com.amazonaws.services.apigateway.model.UpdateIntegrationResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateIntegrationRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateIntegrationRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateIntegrationResult {
	  return com.amazonaws.services.apigateway.model.UpdateIntegrationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateIntegrationResult {
		return environment.apigateway.updateIntegration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-integration")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateIntegrationResponse(init: AmazonApiGatewayUpdateIntegrationResponseCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateIntegrationResponseResult {
	return this.block.declare(AmazonApiGatewayUpdateIntegrationResponseCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateIntegrationResponseResult
}

@Generated
class AmazonApiGatewayUpdateIntegrationResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateIntegrationResponseRequest, com.amazonaws.services.apigateway.model.UpdateIntegrationResponseResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null
	var statusCode: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateIntegrationResponseRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateIntegrationResponseRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		input.setStatusCode(this.statusCode)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateIntegrationResponseResult {
	  return com.amazonaws.services.apigateway.model.UpdateIntegrationResponseResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateIntegrationResponseResult {
		return environment.apigateway.updateIntegrationResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-integration-response")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("status-code", statusCode)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateMethod(init: AmazonApiGatewayUpdateMethodCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateMethodResult {
	return this.block.declare(AmazonApiGatewayUpdateMethodCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateMethodResult
}

@Generated
class AmazonApiGatewayUpdateMethodCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateMethodRequest, com.amazonaws.services.apigateway.model.UpdateMethodResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateMethodRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateMethodRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateMethodResult {
	  return com.amazonaws.services.apigateway.model.UpdateMethodResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateMethodResult {
		return environment.apigateway.updateMethod(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-method")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateMethodResponse(init: AmazonApiGatewayUpdateMethodResponseCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateMethodResponseResult {
	return this.block.declare(AmazonApiGatewayUpdateMethodResponseCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateMethodResponseResult
}

@Generated
class AmazonApiGatewayUpdateMethodResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateMethodResponseRequest, com.amazonaws.services.apigateway.model.UpdateMethodResponseResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var httpMethod: String? = null
	var statusCode: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateMethodResponseRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateMethodResponseRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setHttpMethod(this.httpMethod)
		input.setStatusCode(this.statusCode)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateMethodResponseResult {
	  return com.amazonaws.services.apigateway.model.UpdateMethodResponseResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateMethodResponseResult {
		return environment.apigateway.updateMethodResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-method-response")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("status-code", statusCode)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateModel(init: AmazonApiGatewayUpdateModelCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateModelResult {
	return this.block.declare(AmazonApiGatewayUpdateModelCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateModelResult
}

@Generated
class AmazonApiGatewayUpdateModelCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateModelRequest, com.amazonaws.services.apigateway.model.UpdateModelResult> {

	var restApiId: String? = null
	var modelName: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateModelRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateModelRequest()
		input.setRestApiId(this.restApiId)
		input.setModelName(this.modelName)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateModelResult {
	  return com.amazonaws.services.apigateway.model.UpdateModelResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateModelResult {
		return environment.apigateway.updateModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-model")
				.argument("rest-api-id", restApiId)
				.argument("model-name", modelName)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateRequestValidator(init: AmazonApiGatewayUpdateRequestValidatorCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateRequestValidatorResult {
	return this.block.declare(AmazonApiGatewayUpdateRequestValidatorCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateRequestValidatorResult
}

@Generated
class AmazonApiGatewayUpdateRequestValidatorCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateRequestValidatorRequest, com.amazonaws.services.apigateway.model.UpdateRequestValidatorResult> {

	var restApiId: String? = null
	var requestValidatorId: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateRequestValidatorRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateRequestValidatorRequest()
		input.setRestApiId(this.restApiId)
		input.setRequestValidatorId(this.requestValidatorId)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateRequestValidatorResult {
	  return com.amazonaws.services.apigateway.model.UpdateRequestValidatorResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateRequestValidatorResult {
		return environment.apigateway.updateRequestValidator(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-request-validator")
				.argument("rest-api-id", restApiId)
				.argument("request-validator-id", requestValidatorId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateResource(init: AmazonApiGatewayUpdateResourceCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateResourceResult {
	return this.block.declare(AmazonApiGatewayUpdateResourceCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateResourceResult
}

@Generated
class AmazonApiGatewayUpdateResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateResourceRequest, com.amazonaws.services.apigateway.model.UpdateResourceResult> {

	var restApiId: String? = null
	var resourceId: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateResourceRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateResourceRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateResourceResult {
	  return com.amazonaws.services.apigateway.model.UpdateResourceResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateResourceResult {
		return environment.apigateway.updateResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-resource")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateRestApi(init: AmazonApiGatewayUpdateRestApiCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateRestApiResult {
	return this.block.declare(AmazonApiGatewayUpdateRestApiCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateRestApiResult
}

@Generated
class AmazonApiGatewayUpdateRestApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateRestApiRequest, com.amazonaws.services.apigateway.model.UpdateRestApiResult> {

	var restApiId: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateRestApiRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateRestApiRequest()
		input.setRestApiId(this.restApiId)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateRestApiResult {
	  return com.amazonaws.services.apigateway.model.UpdateRestApiResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateRestApiResult {
		return environment.apigateway.updateRestApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-rest-api")
				.argument("rest-api-id", restApiId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateStage(init: AmazonApiGatewayUpdateStageCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateStageResult {
	return this.block.declare(AmazonApiGatewayUpdateStageCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateStageResult
}

@Generated
class AmazonApiGatewayUpdateStageCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateStageRequest, com.amazonaws.services.apigateway.model.UpdateStageResult> {

	var restApiId: String? = null
	var stageName: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateStageRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateStageRequest()
		input.setRestApiId(this.restApiId)
		input.setStageName(this.stageName)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateStageResult {
	  return com.amazonaws.services.apigateway.model.UpdateStageResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateStageResult {
		return environment.apigateway.updateStage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-stage")
				.argument("rest-api-id", restApiId)
				.argument("stage-name", stageName)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateUsage(init: AmazonApiGatewayUpdateUsageCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateUsageResult {
	return this.block.declare(AmazonApiGatewayUpdateUsageCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateUsageResult
}

@Generated
class AmazonApiGatewayUpdateUsageCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateUsageRequest, com.amazonaws.services.apigateway.model.UpdateUsageResult> {

	var usagePlanId: String? = null
	var keyId: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateUsageRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateUsageRequest()
		input.setUsagePlanId(this.usagePlanId)
		input.setKeyId(this.keyId)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateUsageResult {
	  return com.amazonaws.services.apigateway.model.UpdateUsageResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateUsageResult {
		return environment.apigateway.updateUsage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-usage")
				.argument("usage-plan-id", usagePlanId)
				.argument("key-id", keyId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateUsagePlan(init: AmazonApiGatewayUpdateUsagePlanCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateUsagePlanResult {
	return this.block.declare(AmazonApiGatewayUpdateUsagePlanCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateUsagePlanResult
}

@Generated
class AmazonApiGatewayUpdateUsagePlanCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest, com.amazonaws.services.apigateway.model.UpdateUsagePlanResult> {

	var usagePlanId: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest()
		input.setUsagePlanId(this.usagePlanId)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateUsagePlanResult {
	  return com.amazonaws.services.apigateway.model.UpdateUsagePlanResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateUsagePlanResult {
		return environment.apigateway.updateUsagePlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-usage-plan")
				.argument("usage-plan-id", usagePlanId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateVpcLink(init: AmazonApiGatewayUpdateVpcLinkCommand.() -> Unit): com.amazonaws.services.apigateway.model.UpdateVpcLinkResult {
	return this.block.declare(AmazonApiGatewayUpdateVpcLinkCommand().apply(init)) as com.amazonaws.services.apigateway.model.UpdateVpcLinkResult
}

@Generated
class AmazonApiGatewayUpdateVpcLinkCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest, com.amazonaws.services.apigateway.model.UpdateVpcLinkResult> {

	var vpcLinkId: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest()
		input.setVpcLinkId(this.vpcLinkId)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.apigateway.model.UpdateVpcLinkResult {
	  return com.amazonaws.services.apigateway.model.UpdateVpcLinkResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.apigateway.model.UpdateVpcLinkResult {
		return environment.apigateway.updateVpcLink(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-vpc-link")
				.argument("vpc-link-id", vpcLinkId)
				.argument("patch-operations", patchOperations?.toString())
	}

}
