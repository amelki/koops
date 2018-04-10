
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
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

infix fun AwsContinuation.apigateway(init: AmazonApiGatewayFunctions.() -> Unit) {
	AmazonApiGatewayFunctions(shell).apply(init)
}

			

fun AmazonApiGatewayFunctions.createApiKey(init: AmazonApiGatewayCreateApiKeyCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayCreateApiKeyCommand().apply(init))
}

@Generated
class AmazonApiGatewayCreateApiKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateApiKeyRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.createApiKey(build())
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


fun AmazonApiGatewayFunctions.createAuthorizer(init: AmazonApiGatewayCreateAuthorizerCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayCreateAuthorizerCommand().apply(init))
}

@Generated
class AmazonApiGatewayCreateAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateAuthorizerRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.createAuthorizer(build())
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


fun AmazonApiGatewayFunctions.createBasePathMapping(init: AmazonApiGatewayCreateBasePathMappingCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayCreateBasePathMappingCommand().apply(init))
}

@Generated
class AmazonApiGatewayCreateBasePathMappingCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateBasePathMappingRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.createBasePathMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-base-path-mapping")
				.argument("domain-name", domainName)
				.argument("base-path", basePath)
				.argument("rest-api-id", restApiId)
				.argument("stage", stage)
	}

}


fun AmazonApiGatewayFunctions.createDeployment(init: AmazonApiGatewayCreateDeploymentCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayCreateDeploymentCommand().apply(init))
}

@Generated
class AmazonApiGatewayCreateDeploymentCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateDeploymentRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.createDeployment(build())
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


fun AmazonApiGatewayFunctions.createDocumentationPart(init: AmazonApiGatewayCreateDocumentationPartCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayCreateDocumentationPartCommand().apply(init))
}

@Generated
class AmazonApiGatewayCreateDocumentationPartCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateDocumentationPartRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.createDocumentationPart(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-documentation-part")
				.argument("rest-api-id", restApiId)
				.argument("location", location?.toString())
				.argument("properties", properties)
	}

}


fun AmazonApiGatewayFunctions.createDocumentationVersion(init: AmazonApiGatewayCreateDocumentationVersionCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayCreateDocumentationVersionCommand().apply(init))
}

@Generated
class AmazonApiGatewayCreateDocumentationVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateDocumentationVersionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.createDocumentationVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-documentation-version")
				.argument("rest-api-id", restApiId)
				.argument("documentation-version", documentationVersion)
				.argument("stage-name", stageName)
				.argument("description", description)
	}

}


fun AmazonApiGatewayFunctions.createDomainName(init: AmazonApiGatewayCreateDomainNameCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayCreateDomainNameCommand().apply(init))
}

@Generated
class AmazonApiGatewayCreateDomainNameCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateDomainNameRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.createDomainName(build())
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


fun AmazonApiGatewayFunctions.createModel(init: AmazonApiGatewayCreateModelCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayCreateModelCommand().apply(init))
}

@Generated
class AmazonApiGatewayCreateModelCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateModelRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.createModel(build())
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


fun AmazonApiGatewayFunctions.createRequestValidator(init: AmazonApiGatewayCreateRequestValidatorCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayCreateRequestValidatorCommand().apply(init))
}

@Generated
class AmazonApiGatewayCreateRequestValidatorCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateRequestValidatorRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.createRequestValidator(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-request-validator")
				.argument("rest-api-id", restApiId)
				.argument("name", name)
				.option("validate-request-body", validateRequestBody ?: false)
				.option("validate-request-parameters", validateRequestParameters ?: false)
	}

}


fun AmazonApiGatewayFunctions.createResource(init: AmazonApiGatewayCreateResourceCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayCreateResourceCommand().apply(init))
}

@Generated
class AmazonApiGatewayCreateResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateResourceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.createResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-resource")
				.argument("rest-api-id", restApiId)
				.argument("parent-id", parentId)
				.argument("path-part", pathPart)
	}

}


fun AmazonApiGatewayFunctions.createRestApi(init: AmazonApiGatewayCreateRestApiCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayCreateRestApiCommand().apply(init))
}

@Generated
class AmazonApiGatewayCreateRestApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateRestApiRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.createRestApi(build())
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


fun AmazonApiGatewayFunctions.createStage(init: AmazonApiGatewayCreateStageCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayCreateStageCommand().apply(init))
}

@Generated
class AmazonApiGatewayCreateStageCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateStageRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.createStage(build())
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


fun AmazonApiGatewayFunctions.createUsagePlan(init: AmazonApiGatewayCreateUsagePlanCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayCreateUsagePlanCommand().apply(init))
}

@Generated
class AmazonApiGatewayCreateUsagePlanCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateUsagePlanRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.createUsagePlan(build())
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


fun AmazonApiGatewayFunctions.createUsagePlanKey(init: AmazonApiGatewayCreateUsagePlanKeyCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayCreateUsagePlanKeyCommand().apply(init))
}

@Generated
class AmazonApiGatewayCreateUsagePlanKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateUsagePlanKeyRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.createUsagePlanKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-usage-plan-key")
				.argument("usage-plan-id", usagePlanId)
				.argument("key-id", keyId)
				.argument("key-type", keyType)
	}

}


fun AmazonApiGatewayFunctions.createVpcLink(init: AmazonApiGatewayCreateVpcLinkCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayCreateVpcLinkCommand().apply(init))
}

@Generated
class AmazonApiGatewayCreateVpcLinkCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.CreateVpcLinkRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.createVpcLink(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway create-vpc-link")
				.argument("name", name)
				.argument("description", description)
				.argument("target-arns", targetArns?.toString())
	}

}


fun AmazonApiGatewayFunctions.deleteApiKey(init: AmazonApiGatewayDeleteApiKeyCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteApiKeyCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteApiKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteApiKeyRequest> {

	var apiKey: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteApiKeyRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteApiKeyRequest()
		input.setApiKey(this.apiKey)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteApiKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-api-key")
				.argument("api-key", apiKey)
	}

}


fun AmazonApiGatewayFunctions.deleteAuthorizer(init: AmazonApiGatewayDeleteAuthorizerCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteAuthorizerCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest> {

	var restApiId: String? = null
	var authorizerId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteAuthorizerRequest()
		input.setRestApiId(this.restApiId)
		input.setAuthorizerId(this.authorizerId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-authorizer")
				.argument("rest-api-id", restApiId)
				.argument("authorizer-id", authorizerId)
	}

}


fun AmazonApiGatewayFunctions.deleteBasePathMapping(init: AmazonApiGatewayDeleteBasePathMappingCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteBasePathMappingCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteBasePathMappingCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest> {

	var domainName: String? = null
	var basePath: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteBasePathMappingRequest()
		input.setDomainName(this.domainName)
		input.setBasePath(this.basePath)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteBasePathMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-base-path-mapping")
				.argument("domain-name", domainName)
				.argument("base-path", basePath)
	}

}


fun AmazonApiGatewayFunctions.deleteClientCertificate(init: AmazonApiGatewayDeleteClientCertificateCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteClientCertificateCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteClientCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest> {

	var clientCertificateId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteClientCertificateRequest()
		input.setClientCertificateId(this.clientCertificateId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteClientCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-client-certificate")
				.argument("client-certificate-id", clientCertificateId)
	}

}


fun AmazonApiGatewayFunctions.deleteDeployment(init: AmazonApiGatewayDeleteDeploymentCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteDeploymentCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteDeploymentCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteDeploymentRequest> {

	var restApiId: String? = null
	var deploymentId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteDeploymentRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteDeploymentRequest()
		input.setRestApiId(this.restApiId)
		input.setDeploymentId(this.deploymentId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteDeployment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-deployment")
				.argument("rest-api-id", restApiId)
				.argument("deployment-id", deploymentId)
	}

}


fun AmazonApiGatewayFunctions.deleteDocumentationPart(init: AmazonApiGatewayDeleteDocumentationPartCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteDocumentationPartCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteDocumentationPartCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest> {

	var restApiId: String? = null
	var documentationPartId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteDocumentationPartRequest()
		input.setRestApiId(this.restApiId)
		input.setDocumentationPartId(this.documentationPartId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteDocumentationPart(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-documentation-part")
				.argument("rest-api-id", restApiId)
				.argument("documentation-part-id", documentationPartId)
	}

}


fun AmazonApiGatewayFunctions.deleteDocumentationVersion(init: AmazonApiGatewayDeleteDocumentationVersionCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteDocumentationVersionCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteDocumentationVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest> {

	var restApiId: String? = null
	var documentationVersion: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteDocumentationVersionRequest()
		input.setRestApiId(this.restApiId)
		input.setDocumentationVersion(this.documentationVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteDocumentationVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-documentation-version")
				.argument("rest-api-id", restApiId)
				.argument("documentation-version", documentationVersion)
	}

}


fun AmazonApiGatewayFunctions.deleteDomainName(init: AmazonApiGatewayDeleteDomainNameCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteDomainNameCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteDomainNameCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteDomainNameRequest> {

	var domainName: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteDomainNameRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteDomainNameRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteDomainName(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-domain-name")
				.argument("domain-name", domainName)
	}

}


fun AmazonApiGatewayFunctions.deleteGatewayResponse(init: AmazonApiGatewayDeleteGatewayResponseCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteGatewayResponseCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteGatewayResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest> {

	var restApiId: String? = null
	var responseType: GatewayResponseType? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteGatewayResponseRequest()
		input.setRestApiId(this.restApiId)
		input.setResponseType(this.responseType?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteGatewayResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-gateway-response")
				.argument("rest-api-id", restApiId)
				.argument("response-type", responseType?.toString())
	}

}


fun AmazonApiGatewayFunctions.deleteIntegration(init: AmazonApiGatewayDeleteIntegrationCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteIntegrationCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteIntegrationCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteIntegrationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteIntegration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-integration")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
	}

}


fun AmazonApiGatewayFunctions.deleteIntegrationResponse(init: AmazonApiGatewayDeleteIntegrationResponseCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteIntegrationResponseCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteIntegrationResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteIntegrationResponseRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteIntegrationResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-integration-response")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("status-code", statusCode)
	}

}


fun AmazonApiGatewayFunctions.deleteMethod(init: AmazonApiGatewayDeleteMethodCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteMethodCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteMethodCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteMethodRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteMethod(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-method")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
	}

}


fun AmazonApiGatewayFunctions.deleteMethodResponse(init: AmazonApiGatewayDeleteMethodResponseCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteMethodResponseCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteMethodResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteMethodResponseRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteMethodResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-method-response")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("status-code", statusCode)
	}

}


fun AmazonApiGatewayFunctions.deleteModel(init: AmazonApiGatewayDeleteModelCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteModelCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteModelCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteModelRequest> {

	var restApiId: String? = null
	var modelName: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteModelRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteModelRequest()
		input.setRestApiId(this.restApiId)
		input.setModelName(this.modelName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-model")
				.argument("rest-api-id", restApiId)
				.argument("model-name", modelName)
	}

}


fun AmazonApiGatewayFunctions.deleteRequestValidator(init: AmazonApiGatewayDeleteRequestValidatorCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteRequestValidatorCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteRequestValidatorCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest> {

	var restApiId: String? = null
	var requestValidatorId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteRequestValidatorRequest()
		input.setRestApiId(this.restApiId)
		input.setRequestValidatorId(this.requestValidatorId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteRequestValidator(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-request-validator")
				.argument("rest-api-id", restApiId)
				.argument("request-validator-id", requestValidatorId)
	}

}


fun AmazonApiGatewayFunctions.deleteResource(init: AmazonApiGatewayDeleteResourceCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteResourceCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteResourceRequest> {

	var restApiId: String? = null
	var resourceId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteResourceRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteResourceRequest()
		input.setRestApiId(this.restApiId)
		input.setResourceId(this.resourceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-resource")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
	}

}


fun AmazonApiGatewayFunctions.deleteRestApi(init: AmazonApiGatewayDeleteRestApiCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteRestApiCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteRestApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteRestApiRequest> {

	var restApiId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteRestApiRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteRestApiRequest()
		input.setRestApiId(this.restApiId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteRestApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-rest-api")
				.argument("rest-api-id", restApiId)
	}

}


fun AmazonApiGatewayFunctions.deleteStage(init: AmazonApiGatewayDeleteStageCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteStageCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteStageCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteStageRequest> {

	var restApiId: String? = null
	var stageName: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteStageRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteStageRequest()
		input.setRestApiId(this.restApiId)
		input.setStageName(this.stageName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteStage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-stage")
				.argument("rest-api-id", restApiId)
				.argument("stage-name", stageName)
	}

}


fun AmazonApiGatewayFunctions.deleteUsagePlan(init: AmazonApiGatewayDeleteUsagePlanCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteUsagePlanCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteUsagePlanCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest> {

	var usagePlanId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteUsagePlanRequest()
		input.setUsagePlanId(this.usagePlanId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteUsagePlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-usage-plan")
				.argument("usage-plan-id", usagePlanId)
	}

}


fun AmazonApiGatewayFunctions.deleteUsagePlanKey(init: AmazonApiGatewayDeleteUsagePlanKeyCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteUsagePlanKeyCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteUsagePlanKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest> {

	var usagePlanId: String? = null
	var keyId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteUsagePlanKeyRequest()
		input.setUsagePlanId(this.usagePlanId)
		input.setKeyId(this.keyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteUsagePlanKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-usage-plan-key")
				.argument("usage-plan-id", usagePlanId)
				.argument("key-id", keyId)
	}

}


fun AmazonApiGatewayFunctions.deleteVpcLink(init: AmazonApiGatewayDeleteVpcLinkCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayDeleteVpcLinkCommand().apply(init))
}

@Generated
class AmazonApiGatewayDeleteVpcLinkCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest> {

	var vpcLinkId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest {
		val input = com.amazonaws.services.apigateway.model.DeleteVpcLinkRequest()
		input.setVpcLinkId(this.vpcLinkId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.deleteVpcLink(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway delete-vpc-link")
				.argument("vpc-link-id", vpcLinkId)
	}

}


fun AmazonApiGatewayFunctions.flushStageAuthorizersCache(init: AmazonApiGatewayFlushStageAuthorizersCacheCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayFlushStageAuthorizersCacheCommand().apply(init))
}

@Generated
class AmazonApiGatewayFlushStageAuthorizersCacheCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest> {

	var restApiId: String? = null
	var stageName: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest {
		val input = com.amazonaws.services.apigateway.model.FlushStageAuthorizersCacheRequest()
		input.setRestApiId(this.restApiId)
		input.setStageName(this.stageName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.flushStageAuthorizersCache(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway flush-stage-authorizers-cache")
				.argument("rest-api-id", restApiId)
				.argument("stage-name", stageName)
	}

}


fun AmazonApiGatewayFunctions.flushStageCache(init: AmazonApiGatewayFlushStageCacheCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayFlushStageCacheCommand().apply(init))
}

@Generated
class AmazonApiGatewayFlushStageCacheCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.FlushStageCacheRequest> {

	var restApiId: String? = null
	var stageName: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.FlushStageCacheRequest {
		val input = com.amazonaws.services.apigateway.model.FlushStageCacheRequest()
		input.setRestApiId(this.restApiId)
		input.setStageName(this.stageName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.flushStageCache(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway flush-stage-cache")
				.argument("rest-api-id", restApiId)
				.argument("stage-name", stageName)
	}

}


fun AmazonApiGatewayFunctions.generateClientCertificate(init: AmazonApiGatewayGenerateClientCertificateCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGenerateClientCertificateCommand().apply(init))
}

@Generated
class AmazonApiGatewayGenerateClientCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest> {

	var description: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest {
		val input = com.amazonaws.services.apigateway.model.GenerateClientCertificateRequest()
		input.setDescription(this.description)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.generateClientCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway generate-client-certificate")
				.argument("description", description)
	}

}


fun AmazonApiGatewayFunctions.getAccount(init: AmazonApiGatewayGetAccountCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetAccountCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetAccountCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetAccountRequest> {



	override fun build(): com.amazonaws.services.apigateway.model.GetAccountRequest {
		val input = com.amazonaws.services.apigateway.model.GetAccountRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-account")

	}

}


fun AmazonApiGatewayFunctions.getApiKey(init: AmazonApiGatewayGetApiKeyCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetApiKeyCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetApiKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetApiKeyRequest> {

	var apiKey: String? = null
	var includeValue: Boolean? = false

	override fun build(): com.amazonaws.services.apigateway.model.GetApiKeyRequest {
		val input = com.amazonaws.services.apigateway.model.GetApiKeyRequest()
		input.setApiKey(this.apiKey)
		input.setIncludeValue(this.includeValue)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getApiKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-api-key")
				.argument("api-key", apiKey)
				.option("include-value", includeValue ?: false)
	}

}


fun AmazonApiGatewayFunctions.getApiKeys(init: AmazonApiGatewayGetApiKeysCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetApiKeysCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetApiKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetApiKeysRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getApiKeys(build())
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


fun AmazonApiGatewayFunctions.getAuthorizer(init: AmazonApiGatewayGetAuthorizerCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetAuthorizerCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetAuthorizerRequest> {

	var restApiId: String? = null
	var authorizerId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetAuthorizerRequest {
		val input = com.amazonaws.services.apigateway.model.GetAuthorizerRequest()
		input.setRestApiId(this.restApiId)
		input.setAuthorizerId(this.authorizerId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-authorizer")
				.argument("rest-api-id", restApiId)
				.argument("authorizer-id", authorizerId)
	}

}


fun AmazonApiGatewayFunctions.getAuthorizers(init: AmazonApiGatewayGetAuthorizersCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetAuthorizersCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetAuthorizersCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetAuthorizersRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getAuthorizers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-authorizers")
				.argument("rest-api-id", restApiId)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getBasePathMapping(init: AmazonApiGatewayGetBasePathMappingCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetBasePathMappingCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetBasePathMappingCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetBasePathMappingRequest> {

	var domainName: String? = null
	var basePath: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetBasePathMappingRequest {
		val input = com.amazonaws.services.apigateway.model.GetBasePathMappingRequest()
		input.setDomainName(this.domainName)
		input.setBasePath(this.basePath)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getBasePathMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-base-path-mapping")
				.argument("domain-name", domainName)
				.argument("base-path", basePath)
	}

}


fun AmazonApiGatewayFunctions.getBasePathMappings(init: AmazonApiGatewayGetBasePathMappingsCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetBasePathMappingsCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetBasePathMappingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetBasePathMappingsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getBasePathMappings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-base-path-mappings")
				.argument("domain-name", domainName)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getClientCertificate(init: AmazonApiGatewayGetClientCertificateCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetClientCertificateCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetClientCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetClientCertificateRequest> {

	var clientCertificateId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetClientCertificateRequest {
		val input = com.amazonaws.services.apigateway.model.GetClientCertificateRequest()
		input.setClientCertificateId(this.clientCertificateId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getClientCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-client-certificate")
				.argument("client-certificate-id", clientCertificateId)
	}

}


fun AmazonApiGatewayFunctions.getClientCertificates(init: AmazonApiGatewayGetClientCertificatesCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetClientCertificatesCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetClientCertificatesCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetClientCertificatesRequest> {

	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetClientCertificatesRequest {
		val input = com.amazonaws.services.apigateway.model.GetClientCertificatesRequest()
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getClientCertificates(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-client-certificates")
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getDeployment(init: AmazonApiGatewayGetDeploymentCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetDeploymentCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetDeploymentCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetDeploymentRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getDeployment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-deployment")
				.argument("rest-api-id", restApiId)
				.argument("deployment-id", deploymentId)
				.argument("embed", embed?.toString())
	}

}


fun AmazonApiGatewayFunctions.getDeployments(init: AmazonApiGatewayGetDeploymentsCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetDeploymentsCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetDeploymentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetDeploymentsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getDeployments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-deployments")
				.argument("rest-api-id", restApiId)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getDocumentationPart(init: AmazonApiGatewayGetDocumentationPartCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetDocumentationPartCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetDocumentationPartCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetDocumentationPartRequest> {

	var restApiId: String? = null
	var documentationPartId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetDocumentationPartRequest {
		val input = com.amazonaws.services.apigateway.model.GetDocumentationPartRequest()
		input.setRestApiId(this.restApiId)
		input.setDocumentationPartId(this.documentationPartId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getDocumentationPart(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-documentation-part")
				.argument("rest-api-id", restApiId)
				.argument("documentation-part-id", documentationPartId)
	}

}


fun AmazonApiGatewayFunctions.getDocumentationParts(init: AmazonApiGatewayGetDocumentationPartsCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetDocumentationPartsCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetDocumentationPartsCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetDocumentationPartsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getDocumentationParts(build())
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


fun AmazonApiGatewayFunctions.getDocumentationVersion(init: AmazonApiGatewayGetDocumentationVersionCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetDocumentationVersionCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetDocumentationVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest> {

	var restApiId: String? = null
	var documentationVersion: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest {
		val input = com.amazonaws.services.apigateway.model.GetDocumentationVersionRequest()
		input.setRestApiId(this.restApiId)
		input.setDocumentationVersion(this.documentationVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getDocumentationVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-documentation-version")
				.argument("rest-api-id", restApiId)
				.argument("documentation-version", documentationVersion)
	}

}


fun AmazonApiGatewayFunctions.getDocumentationVersions(init: AmazonApiGatewayGetDocumentationVersionsCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetDocumentationVersionsCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetDocumentationVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetDocumentationVersionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getDocumentationVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-documentation-versions")
				.argument("rest-api-id", restApiId)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getDomainName(init: AmazonApiGatewayGetDomainNameCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetDomainNameCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetDomainNameCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetDomainNameRequest> {

	var domainName: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetDomainNameRequest {
		val input = com.amazonaws.services.apigateway.model.GetDomainNameRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getDomainName(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-domain-name")
				.argument("domain-name", domainName)
	}

}


fun AmazonApiGatewayFunctions.getDomainNames(init: AmazonApiGatewayGetDomainNamesCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetDomainNamesCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetDomainNamesCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetDomainNamesRequest> {

	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetDomainNamesRequest {
		val input = com.amazonaws.services.apigateway.model.GetDomainNamesRequest()
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getDomainNames(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-domain-names")
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getExport(init: AmazonApiGatewayGetExportCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetExportCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetExportCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetExportRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getExport(build())
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


fun AmazonApiGatewayFunctions.getGatewayResponse(init: AmazonApiGatewayGetGatewayResponseCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetGatewayResponseCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetGatewayResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetGatewayResponseRequest> {

	var restApiId: String? = null
	var responseType: GatewayResponseType? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetGatewayResponseRequest {
		val input = com.amazonaws.services.apigateway.model.GetGatewayResponseRequest()
		input.setRestApiId(this.restApiId)
		input.setResponseType(this.responseType?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getGatewayResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-gateway-response")
				.argument("rest-api-id", restApiId)
				.argument("response-type", responseType?.toString())
	}

}


fun AmazonApiGatewayFunctions.getGatewayResponses(init: AmazonApiGatewayGetGatewayResponsesCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetGatewayResponsesCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetGatewayResponsesCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetGatewayResponsesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getGatewayResponses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-gateway-responses")
				.argument("rest-api-id", restApiId)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getIntegration(init: AmazonApiGatewayGetIntegrationCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetIntegrationCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetIntegrationCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetIntegrationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getIntegration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-integration")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
	}

}


fun AmazonApiGatewayFunctions.getIntegrationResponse(init: AmazonApiGatewayGetIntegrationResponseCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetIntegrationResponseCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetIntegrationResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetIntegrationResponseRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getIntegrationResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-integration-response")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("status-code", statusCode)
	}

}


fun AmazonApiGatewayFunctions.getMethod(init: AmazonApiGatewayGetMethodCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetMethodCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetMethodCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetMethodRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getMethod(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-method")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
	}

}


fun AmazonApiGatewayFunctions.getMethodResponse(init: AmazonApiGatewayGetMethodResponseCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetMethodResponseCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetMethodResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetMethodResponseRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getMethodResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-method-response")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("status-code", statusCode)
	}

}


fun AmazonApiGatewayFunctions.getModel(init: AmazonApiGatewayGetModelCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetModelCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetModelCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetModelRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-model")
				.argument("rest-api-id", restApiId)
				.argument("model-name", modelName)
				.option("flatten", flatten ?: false)
	}

}


fun AmazonApiGatewayFunctions.getModelTemplate(init: AmazonApiGatewayGetModelTemplateCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetModelTemplateCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetModelTemplateCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetModelTemplateRequest> {

	var restApiId: String? = null
	var modelName: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetModelTemplateRequest {
		val input = com.amazonaws.services.apigateway.model.GetModelTemplateRequest()
		input.setRestApiId(this.restApiId)
		input.setModelName(this.modelName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getModelTemplate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-model-template")
				.argument("rest-api-id", restApiId)
				.argument("model-name", modelName)
	}

}


fun AmazonApiGatewayFunctions.getModels(init: AmazonApiGatewayGetModelsCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetModelsCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetModelsCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetModelsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getModels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-models")
				.argument("rest-api-id", restApiId)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getRequestValidator(init: AmazonApiGatewayGetRequestValidatorCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetRequestValidatorCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetRequestValidatorCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetRequestValidatorRequest> {

	var restApiId: String? = null
	var requestValidatorId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetRequestValidatorRequest {
		val input = com.amazonaws.services.apigateway.model.GetRequestValidatorRequest()
		input.setRestApiId(this.restApiId)
		input.setRequestValidatorId(this.requestValidatorId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getRequestValidator(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-request-validator")
				.argument("rest-api-id", restApiId)
				.argument("request-validator-id", requestValidatorId)
	}

}


fun AmazonApiGatewayFunctions.getRequestValidators(init: AmazonApiGatewayGetRequestValidatorsCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetRequestValidatorsCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetRequestValidatorsCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetRequestValidatorsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getRequestValidators(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-request-validators")
				.argument("rest-api-id", restApiId)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getResource(init: AmazonApiGatewayGetResourceCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetResourceCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetResourceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-resource")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("embed", embed?.toString())
	}

}


fun AmazonApiGatewayFunctions.getResources(init: AmazonApiGatewayGetResourcesCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetResourcesCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetResourcesCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetResourcesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-resources")
				.argument("rest-api-id", restApiId)
				.argument("position", position)
				.argument("limit", limit?.toString())
				.argument("embed", embed?.toString())
	}

}


fun AmazonApiGatewayFunctions.getRestApi(init: AmazonApiGatewayGetRestApiCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetRestApiCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetRestApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetRestApiRequest> {

	var restApiId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetRestApiRequest {
		val input = com.amazonaws.services.apigateway.model.GetRestApiRequest()
		input.setRestApiId(this.restApiId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getRestApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-rest-api")
				.argument("rest-api-id", restApiId)
	}

}


fun AmazonApiGatewayFunctions.getRestApis(init: AmazonApiGatewayGetRestApisCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetRestApisCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetRestApisCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetRestApisRequest> {

	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetRestApisRequest {
		val input = com.amazonaws.services.apigateway.model.GetRestApisRequest()
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getRestApis(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-rest-apis")
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getSdk(init: AmazonApiGatewayGetSdkCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetSdkCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetSdkCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetSdkRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getSdk(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-sdk")
				.argument("rest-api-id", restApiId)
				.argument("stage-name", stageName)
				.argument("sdk-type", sdkType)
				.argument("parameters", parameters?.toString())
	}

}


fun AmazonApiGatewayFunctions.getSdkType(init: AmazonApiGatewayGetSdkTypeCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetSdkTypeCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetSdkTypeCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetSdkTypeRequest> {

	var id: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetSdkTypeRequest {
		val input = com.amazonaws.services.apigateway.model.GetSdkTypeRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getSdkType(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-sdk-type")
				.argument("id", id)
	}

}


fun AmazonApiGatewayFunctions.getSdkTypes(init: AmazonApiGatewayGetSdkTypesCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetSdkTypesCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetSdkTypesCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetSdkTypesRequest> {

	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetSdkTypesRequest {
		val input = com.amazonaws.services.apigateway.model.GetSdkTypesRequest()
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getSdkTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-sdk-types")
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getStage(init: AmazonApiGatewayGetStageCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetStageCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetStageCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetStageRequest> {

	var restApiId: String? = null
	var stageName: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetStageRequest {
		val input = com.amazonaws.services.apigateway.model.GetStageRequest()
		input.setRestApiId(this.restApiId)
		input.setStageName(this.stageName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getStage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-stage")
				.argument("rest-api-id", restApiId)
				.argument("stage-name", stageName)
	}

}


fun AmazonApiGatewayFunctions.getStages(init: AmazonApiGatewayGetStagesCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetStagesCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetStagesCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetStagesRequest> {

	var restApiId: String? = null
	var deploymentId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetStagesRequest {
		val input = com.amazonaws.services.apigateway.model.GetStagesRequest()
		input.setRestApiId(this.restApiId)
		input.setDeploymentId(this.deploymentId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getStages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-stages")
				.argument("rest-api-id", restApiId)
				.argument("deployment-id", deploymentId)
	}

}


fun AmazonApiGatewayFunctions.getTags(init: AmazonApiGatewayGetTagsCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetTagsCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetTagsCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetTagsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-tags")
				.argument("resource-arn", resourceArn)
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getUsage(init: AmazonApiGatewayGetUsageCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetUsageCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetUsageCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetUsageRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getUsage(build())
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


fun AmazonApiGatewayFunctions.getUsagePlan(init: AmazonApiGatewayGetUsagePlanCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetUsagePlanCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetUsagePlanCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetUsagePlanRequest> {

	var usagePlanId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetUsagePlanRequest {
		val input = com.amazonaws.services.apigateway.model.GetUsagePlanRequest()
		input.setUsagePlanId(this.usagePlanId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getUsagePlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-usage-plan")
				.argument("usage-plan-id", usagePlanId)
	}

}


fun AmazonApiGatewayFunctions.getUsagePlanKey(init: AmazonApiGatewayGetUsagePlanKeyCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetUsagePlanKeyCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetUsagePlanKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest> {

	var usagePlanId: String? = null
	var keyId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest {
		val input = com.amazonaws.services.apigateway.model.GetUsagePlanKeyRequest()
		input.setUsagePlanId(this.usagePlanId)
		input.setKeyId(this.keyId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getUsagePlanKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-usage-plan-key")
				.argument("usage-plan-id", usagePlanId)
				.argument("key-id", keyId)
	}

}


fun AmazonApiGatewayFunctions.getUsagePlanKeys(init: AmazonApiGatewayGetUsagePlanKeysCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetUsagePlanKeysCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetUsagePlanKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetUsagePlanKeysRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getUsagePlanKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-usage-plan-keys")
				.argument("usage-plan-id", usagePlanId)
				.argument("position", position)
				.argument("limit", limit?.toString())
				.argument("name-query", nameQuery)
	}

}


fun AmazonApiGatewayFunctions.getUsagePlans(init: AmazonApiGatewayGetUsagePlansCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetUsagePlansCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetUsagePlansCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetUsagePlansRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getUsagePlans(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-usage-plans")
				.argument("position", position)
				.argument("key-id", keyId)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.getVpcLink(init: AmazonApiGatewayGetVpcLinkCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetVpcLinkCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetVpcLinkCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetVpcLinkRequest> {

	var vpcLinkId: String? = null

	override fun build(): com.amazonaws.services.apigateway.model.GetVpcLinkRequest {
		val input = com.amazonaws.services.apigateway.model.GetVpcLinkRequest()
		input.setVpcLinkId(this.vpcLinkId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getVpcLink(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-vpc-link")
				.argument("vpc-link-id", vpcLinkId)
	}

}


fun AmazonApiGatewayFunctions.getVpcLinks(init: AmazonApiGatewayGetVpcLinksCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayGetVpcLinksCommand().apply(init))
}

@Generated
class AmazonApiGatewayGetVpcLinksCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.GetVpcLinksRequest> {

	var position: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.apigateway.model.GetVpcLinksRequest {
		val input = com.amazonaws.services.apigateway.model.GetVpcLinksRequest()
		input.setPosition(this.position)
		input.setLimit(this.limit)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.getVpcLinks(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway get-vpc-links")
				.argument("position", position)
				.argument("limit", limit?.toString())
	}

}


fun AmazonApiGatewayFunctions.importApiKeys(init: AmazonApiGatewayImportApiKeysCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayImportApiKeysCommand().apply(init))
}

@Generated
class AmazonApiGatewayImportApiKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.ImportApiKeysRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.importApiKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway import-api-keys")
				.argument("body", body?.toString())
				.argument("format", format?.toString())
				.option("fail-on-warnings", failOnWarnings ?: false)
	}

}


fun AmazonApiGatewayFunctions.importDocumentationParts(init: AmazonApiGatewayImportDocumentationPartsCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayImportDocumentationPartsCommand().apply(init))
}

@Generated
class AmazonApiGatewayImportDocumentationPartsCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.ImportDocumentationPartsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.importDocumentationParts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway import-documentation-parts")
				.argument("rest-api-id", restApiId)
				.argument("mode", mode?.toString())
				.option("fail-on-warnings", failOnWarnings ?: false)
				.argument("body", body?.toString())
	}

}


fun AmazonApiGatewayFunctions.importRestApi(init: AmazonApiGatewayImportRestApiCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayImportRestApiCommand().apply(init))
}

@Generated
class AmazonApiGatewayImportRestApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.ImportRestApiRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.importRestApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway import-rest-api")
				.option("fail-on-warnings", failOnWarnings ?: false)
				.argument("parameters", parameters?.toString())
				.argument("body", body?.toString())
	}

}


fun AmazonApiGatewayFunctions.putGatewayResponse(init: AmazonApiGatewayPutGatewayResponseCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayPutGatewayResponseCommand().apply(init))
}

@Generated
class AmazonApiGatewayPutGatewayResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.PutGatewayResponseRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.putGatewayResponse(build())
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


fun AmazonApiGatewayFunctions.putIntegration(init: AmazonApiGatewayPutIntegrationCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayPutIntegrationCommand().apply(init))
}

@Generated
class AmazonApiGatewayPutIntegrationCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.PutIntegrationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.putIntegration(build())
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


fun AmazonApiGatewayFunctions.putIntegrationResponse(init: AmazonApiGatewayPutIntegrationResponseCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayPutIntegrationResponseCommand().apply(init))
}

@Generated
class AmazonApiGatewayPutIntegrationResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.PutIntegrationResponseRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.putIntegrationResponse(build())
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


fun AmazonApiGatewayFunctions.putMethod(init: AmazonApiGatewayPutMethodCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayPutMethodCommand().apply(init))
}

@Generated
class AmazonApiGatewayPutMethodCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.PutMethodRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.putMethod(build())
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


fun AmazonApiGatewayFunctions.putMethodResponse(init: AmazonApiGatewayPutMethodResponseCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayPutMethodResponseCommand().apply(init))
}

@Generated
class AmazonApiGatewayPutMethodResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.PutMethodResponseRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.putMethodResponse(build())
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


fun AmazonApiGatewayFunctions.putRestApi(init: AmazonApiGatewayPutRestApiCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayPutRestApiCommand().apply(init))
}

@Generated
class AmazonApiGatewayPutRestApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.PutRestApiRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.putRestApi(build())
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


fun AmazonApiGatewayFunctions.tagResource(init: AmazonApiGatewayTagResourceCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayTagResourceCommand().apply(init))
}

@Generated
class AmazonApiGatewayTagResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.TagResourceRequest> {

	var resourceArn: String? = null
	var tags: Map<String, String>? = null

	override fun build(): com.amazonaws.services.apigateway.model.TagResourceRequest {
		val input = com.amazonaws.services.apigateway.model.TagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway tag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags?.toString())
	}

}


fun AmazonApiGatewayFunctions.testInvokeAuthorizer(init: AmazonApiGatewayTestInvokeAuthorizerCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayTestInvokeAuthorizerCommand().apply(init))
}

@Generated
class AmazonApiGatewayTestInvokeAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.TestInvokeAuthorizerRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.testInvokeAuthorizer(build())
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


fun AmazonApiGatewayFunctions.testInvokeMethod(init: AmazonApiGatewayTestInvokeMethodCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayTestInvokeMethodCommand().apply(init))
}

@Generated
class AmazonApiGatewayTestInvokeMethodCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.TestInvokeMethodRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.testInvokeMethod(build())
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


fun AmazonApiGatewayFunctions.untagResource(init: AmazonApiGatewayUntagResourceCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUntagResourceCommand().apply(init))
}

@Generated
class AmazonApiGatewayUntagResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UntagResourceRequest> {

	var resourceArn: String? = null
	var tagKeys: List<String>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UntagResourceRequest {
		val input = com.amazonaws.services.apigateway.model.UntagResourceRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway untag-resource")
				.argument("resource-arn", resourceArn)
				.argument("tag-keys", tagKeys?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateAccount(init: AmazonApiGatewayUpdateAccountCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateAccountCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateAccountCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateAccountRequest> {

	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateAccountRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateAccountRequest()
		input.setPatchOperations(this.patchOperations)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateAccount(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-account")
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateApiKey(init: AmazonApiGatewayUpdateApiKeyCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateApiKeyCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateApiKeyCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateApiKeyRequest> {

	var apiKey: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateApiKeyRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateApiKeyRequest()
		input.setApiKey(this.apiKey)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateApiKey(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-api-key")
				.argument("api-key", apiKey)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateAuthorizer(init: AmazonApiGatewayUpdateAuthorizerCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateAuthorizerCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateAuthorizerCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateAuthorizerRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateAuthorizer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-authorizer")
				.argument("rest-api-id", restApiId)
				.argument("authorizer-id", authorizerId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateBasePathMapping(init: AmazonApiGatewayUpdateBasePathMappingCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateBasePathMappingCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateBasePathMappingCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateBasePathMappingRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateBasePathMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-base-path-mapping")
				.argument("domain-name", domainName)
				.argument("base-path", basePath)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateClientCertificate(init: AmazonApiGatewayUpdateClientCertificateCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateClientCertificateCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateClientCertificateCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest> {

	var clientCertificateId: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateClientCertificateRequest()
		input.setClientCertificateId(this.clientCertificateId)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateClientCertificate(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-client-certificate")
				.argument("client-certificate-id", clientCertificateId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateDeployment(init: AmazonApiGatewayUpdateDeploymentCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateDeploymentCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateDeploymentCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateDeploymentRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateDeployment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-deployment")
				.argument("rest-api-id", restApiId)
				.argument("deployment-id", deploymentId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateDocumentationPart(init: AmazonApiGatewayUpdateDocumentationPartCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateDocumentationPartCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateDocumentationPartCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateDocumentationPartRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateDocumentationPart(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-documentation-part")
				.argument("rest-api-id", restApiId)
				.argument("documentation-part-id", documentationPartId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateDocumentationVersion(init: AmazonApiGatewayUpdateDocumentationVersionCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateDocumentationVersionCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateDocumentationVersionCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateDocumentationVersionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateDocumentationVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-documentation-version")
				.argument("rest-api-id", restApiId)
				.argument("documentation-version", documentationVersion)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateDomainName(init: AmazonApiGatewayUpdateDomainNameCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateDomainNameCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateDomainNameCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateDomainNameRequest> {

	var domainName: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateDomainNameRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateDomainNameRequest()
		input.setDomainName(this.domainName)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateDomainName(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-domain-name")
				.argument("domain-name", domainName)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateGatewayResponse(init: AmazonApiGatewayUpdateGatewayResponseCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateGatewayResponseCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateGatewayResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateGatewayResponseRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateGatewayResponse(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-gateway-response")
				.argument("rest-api-id", restApiId)
				.argument("response-type", responseType?.toString())
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateIntegration(init: AmazonApiGatewayUpdateIntegrationCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateIntegrationCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateIntegrationCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateIntegrationRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateIntegration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-integration")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateIntegrationResponse(init: AmazonApiGatewayUpdateIntegrationResponseCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateIntegrationResponseCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateIntegrationResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateIntegrationResponseRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateIntegrationResponse(build())
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


fun AmazonApiGatewayFunctions.updateMethod(init: AmazonApiGatewayUpdateMethodCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateMethodCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateMethodCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateMethodRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateMethod(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-method")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("http-method", httpMethod)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateMethodResponse(init: AmazonApiGatewayUpdateMethodResponseCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateMethodResponseCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateMethodResponseCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateMethodResponseRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateMethodResponse(build())
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


fun AmazonApiGatewayFunctions.updateModel(init: AmazonApiGatewayUpdateModelCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateModelCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateModelCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateModelRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-model")
				.argument("rest-api-id", restApiId)
				.argument("model-name", modelName)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateRequestValidator(init: AmazonApiGatewayUpdateRequestValidatorCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateRequestValidatorCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateRequestValidatorCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateRequestValidatorRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateRequestValidator(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-request-validator")
				.argument("rest-api-id", restApiId)
				.argument("request-validator-id", requestValidatorId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateResource(init: AmazonApiGatewayUpdateResourceCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateResourceCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateResourceCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateResourceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-resource")
				.argument("rest-api-id", restApiId)
				.argument("resource-id", resourceId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateRestApi(init: AmazonApiGatewayUpdateRestApiCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateRestApiCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateRestApiCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateRestApiRequest> {

	var restApiId: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateRestApiRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateRestApiRequest()
		input.setRestApiId(this.restApiId)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateRestApi(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-rest-api")
				.argument("rest-api-id", restApiId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateStage(init: AmazonApiGatewayUpdateStageCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateStageCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateStageCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateStageRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateStage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-stage")
				.argument("rest-api-id", restApiId)
				.argument("stage-name", stageName)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateUsage(init: AmazonApiGatewayUpdateUsageCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateUsageCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateUsageCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateUsageRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateUsage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-usage")
				.argument("usage-plan-id", usagePlanId)
				.argument("key-id", keyId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateUsagePlan(init: AmazonApiGatewayUpdateUsagePlanCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateUsagePlanCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateUsagePlanCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest> {

	var usagePlanId: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateUsagePlanRequest()
		input.setUsagePlanId(this.usagePlanId)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateUsagePlan(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-usage-plan")
				.argument("usage-plan-id", usagePlanId)
				.argument("patch-operations", patchOperations?.toString())
	}

}


fun AmazonApiGatewayFunctions.updateVpcLink(init: AmazonApiGatewayUpdateVpcLinkCommand.() -> Unit) {
	this.block.declare(AmazonApiGatewayUpdateVpcLinkCommand().apply(init))
}

@Generated
class AmazonApiGatewayUpdateVpcLinkCommand() : AmazonWebServiceCommand<com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest> {

	var vpcLinkId: String? = null
	var patchOperations: List<com.amazonaws.services.apigateway.model.PatchOperation>? = null

	override fun build(): com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest {
		val input = com.amazonaws.services.apigateway.model.UpdateVpcLinkRequest()
		input.setVpcLinkId(this.vpcLinkId)
		input.setPatchOperations(this.patchOperations)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.apigateway.updateVpcLink(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws apigateway update-vpc-link")
				.argument("vpc-link-id", vpcLinkId)
				.argument("patch-operations", patchOperations?.toString())
	}

}
