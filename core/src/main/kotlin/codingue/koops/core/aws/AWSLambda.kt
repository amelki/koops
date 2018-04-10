
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.lambda.AWSLambda
import com.amazonaws.services.lambda.model.*

var codingue.koops.core.Environment.lambda: AWSLambda
	get() = this.capabilities[AWSLambda::class.java.name] as AWSLambda
	set(lambda) {
		this.capabilities[AWSLambda::class.java.name] = lambda
	}

@Generated
class AWSLambdaFunctions(val block: Block)

infix fun AwsContinuation.lambda(init: AWSLambdaFunctions.() -> Unit) {
	AWSLambdaFunctions(shell).apply(init)
}

			

fun AWSLambdaFunctions.addPermission(functionName: String, statementId: String, action: String, principal: String, init: AWSLambdaAddPermissionCommand.() -> Unit) {
	this.block.declare(AWSLambdaAddPermissionCommand(functionName, statementId, action, principal).apply(init))
}

@Generated
class AWSLambdaAddPermissionCommand(val functionName: String, val statementId: String, val action: String, val principal: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.AddPermissionRequest> {

	var sourceArn: String? = null
	var sourceAccount: String? = null
	var eventSourceToken: String? = null
	var qualifier: String? = null
	var revisionId: String? = null

	override fun build(): com.amazonaws.services.lambda.model.AddPermissionRequest {
		val input = com.amazonaws.services.lambda.model.AddPermissionRequest()
		input.setFunctionName(this.functionName)
		input.setStatementId(this.statementId)
		input.setAction(this.action)
		input.setPrincipal(this.principal)
		input.setSourceArn(this.sourceArn)
		input.setSourceAccount(this.sourceAccount)
		input.setEventSourceToken(this.eventSourceToken)
		input.setQualifier(this.qualifier)
		input.setRevisionId(this.revisionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.addPermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda add-permission")
				.argument("function-name", functionName)
				.argument("statement-id", statementId)
				.argument("action", action)
				.argument("principal", principal)
				.argument("source-arn", sourceArn)
				.argument("source-account", sourceAccount)
				.argument("event-source-token", eventSourceToken)
				.argument("qualifier", qualifier)
				.argument("revision-id", revisionId)
	}

}


fun AWSLambdaFunctions.createAlias(functionName: String, name: String, functionVersion: String, init: AWSLambdaCreateAliasCommand.() -> Unit) {
	this.block.declare(AWSLambdaCreateAliasCommand(functionName, name, functionVersion).apply(init))
}

@Generated
class AWSLambdaCreateAliasCommand(val functionName: String, val name: String, val functionVersion: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.CreateAliasRequest> {

	var description: String? = null
	var routingConfig: com.amazonaws.services.lambda.model.AliasRoutingConfiguration? = null

	override fun build(): com.amazonaws.services.lambda.model.CreateAliasRequest {
		val input = com.amazonaws.services.lambda.model.CreateAliasRequest()
		input.setFunctionName(this.functionName)
		input.setName(this.name)
		input.setFunctionVersion(this.functionVersion)
		input.setDescription(this.description)
		input.setRoutingConfig(this.routingConfig)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.createAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda create-alias")
				.argument("function-name", functionName)
				.argument("name", name)
				.argument("function-version", functionVersion)
				.argument("description", description)
				.argument("routing-config", routingConfig?.toString())
	}

}


fun AWSLambdaFunctions.createEventSourceMapping(eventSourceArn: String, functionName: String, startingPosition: EventSourcePosition, init: AWSLambdaCreateEventSourceMappingCommand.() -> Unit) {
	this.block.declare(AWSLambdaCreateEventSourceMappingCommand(eventSourceArn, functionName, startingPosition).apply(init))
}

@Generated
class AWSLambdaCreateEventSourceMappingCommand(val eventSourceArn: String, val functionName: String, val startingPosition: EventSourcePosition) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest> {

	var enabled: Boolean? = false
	var batchSize: Int? = 0
	var startingPositionTimestamp: java.util.Date? = null

	override fun build(): com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest {
		val input = com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest()
		input.setEventSourceArn(this.eventSourceArn)
		input.setFunctionName(this.functionName)
		input.setEnabled(this.enabled)
		input.setBatchSize(this.batchSize)
		input.setStartingPosition(this.startingPosition.toString())
		input.setStartingPositionTimestamp(this.startingPositionTimestamp)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.createEventSourceMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda create-event-source-mapping")
				.argument("event-source-arn", eventSourceArn)
				.argument("function-name", functionName)
				.option("enabled", enabled ?: false)
				.argument("batch-size", batchSize?.toString())
				.argument("starting-position", startingPosition.toString())
				.argument("starting-position-timestamp", startingPositionTimestamp?.toString())
	}

}


fun AWSLambdaFunctions.createFunction(functionName: String, runtime: Runtime, role: String, handler: String, code: com.amazonaws.services.lambda.model.FunctionCode, init: AWSLambdaCreateFunctionCommand.() -> Unit) {
	this.block.declare(AWSLambdaCreateFunctionCommand(functionName, runtime, role, handler, code).apply(init))
}

@Generated
class AWSLambdaCreateFunctionCommand(val functionName: String, val runtime: Runtime, val role: String, val handler: String, val code: com.amazonaws.services.lambda.model.FunctionCode) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.CreateFunctionRequest> {

	var description: String? = null
	var timeout: Int? = 0
	var memorySize: Int? = 0
	var publish: Boolean? = false
	var vpcConfig: com.amazonaws.services.lambda.model.VpcConfig? = null
	var deadLetterConfig: com.amazonaws.services.lambda.model.DeadLetterConfig? = null
	var environment: com.amazonaws.services.lambda.model.Environment? = null
	var kMSKeyArn: String? = null
	var tracingConfig: com.amazonaws.services.lambda.model.TracingConfig? = null
	var tags: Map<String, String>? = null

	override fun build(): com.amazonaws.services.lambda.model.CreateFunctionRequest {
		val input = com.amazonaws.services.lambda.model.CreateFunctionRequest()
		input.setFunctionName(this.functionName)
		input.setRuntime(this.runtime.toString())
		input.setRole(this.role)
		input.setHandler(this.handler)
		input.setCode(this.code)
		input.setDescription(this.description)
		input.setTimeout(this.timeout)
		input.setMemorySize(this.memorySize)
		input.setPublish(this.publish)
		input.setVpcConfig(this.vpcConfig)
		input.setDeadLetterConfig(this.deadLetterConfig)
		input.setEnvironment(this.environment)
		input.setKMSKeyArn(this.kMSKeyArn)
		input.setTracingConfig(this.tracingConfig)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.createFunction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda create-function")
				.argument("function-name", functionName)
				.argument("runtime", runtime.toString())
				.argument("role", role)
				.argument("handler", handler)
				.argument("code", code.toString())
				.argument("description", description)
				.argument("timeout", timeout?.toString())
				.argument("memory-size", memorySize?.toString())
				.option("publish", publish ?: false)
				.argument("vpc-config", vpcConfig?.toString())
				.argument("dead-letter-config", deadLetterConfig?.toString())
				.argument("environment", environment?.toString())
				.argument("kmskey-arn", kMSKeyArn)
				.argument("tracing-config", tracingConfig?.toString())
				.argument("tags", tags?.toString())
	}

}


fun AWSLambdaFunctions.deleteAlias(functionName: String, name: String, init: AWSLambdaDeleteAliasCommand.() -> Unit) {
	this.block.declare(AWSLambdaDeleteAliasCommand(functionName, name).apply(init))
}

@Generated
class AWSLambdaDeleteAliasCommand(val functionName: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.DeleteAliasRequest> {



	override fun build(): com.amazonaws.services.lambda.model.DeleteAliasRequest {
		val input = com.amazonaws.services.lambda.model.DeleteAliasRequest()
		input.setFunctionName(this.functionName)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.deleteAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda delete-alias")
				.argument("function-name", functionName)
				.argument("name", name)
	}

}


fun AWSLambdaFunctions.deleteEventSourceMapping(uUID: String, init: AWSLambdaDeleteEventSourceMappingCommand.() -> Unit) {
	this.block.declare(AWSLambdaDeleteEventSourceMappingCommand(uUID).apply(init))
}

@Generated
class AWSLambdaDeleteEventSourceMappingCommand(val uUID: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest> {



	override fun build(): com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest {
		val input = com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest()
		input.setUUID(this.uUID)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.deleteEventSourceMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda delete-event-source-mapping")
				.argument("uuid", uUID)
	}

}


fun AWSLambdaFunctions.deleteFunction(functionName: String, init: AWSLambdaDeleteFunctionCommand.() -> Unit) {
	this.block.declare(AWSLambdaDeleteFunctionCommand(functionName).apply(init))
}

@Generated
class AWSLambdaDeleteFunctionCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.DeleteFunctionRequest> {

	var qualifier: String? = null

	override fun build(): com.amazonaws.services.lambda.model.DeleteFunctionRequest {
		val input = com.amazonaws.services.lambda.model.DeleteFunctionRequest()
		input.setFunctionName(this.functionName)
		input.setQualifier(this.qualifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.deleteFunction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda delete-function")
				.argument("function-name", functionName)
				.argument("qualifier", qualifier)
	}

}


fun AWSLambdaFunctions.deleteFunctionConcurrency(functionName: String, init: AWSLambdaDeleteFunctionConcurrencyCommand.() -> Unit) {
	this.block.declare(AWSLambdaDeleteFunctionConcurrencyCommand(functionName).apply(init))
}

@Generated
class AWSLambdaDeleteFunctionConcurrencyCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest> {



	override fun build(): com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest {
		val input = com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest()
		input.setFunctionName(this.functionName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.deleteFunctionConcurrency(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda delete-function-concurrency")
				.argument("function-name", functionName)
	}

}


fun AWSLambdaFunctions.getAccountSettings(init: AWSLambdaGetAccountSettingsCommand.() -> Unit) {
	this.block.declare(AWSLambdaGetAccountSettingsCommand().apply(init))
}

@Generated
class AWSLambdaGetAccountSettingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.GetAccountSettingsRequest> {



	override fun build(): com.amazonaws.services.lambda.model.GetAccountSettingsRequest {
		val input = com.amazonaws.services.lambda.model.GetAccountSettingsRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.getAccountSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda get-account-settings")

	}

}


fun AWSLambdaFunctions.getAlias(functionName: String, name: String, init: AWSLambdaGetAliasCommand.() -> Unit) {
	this.block.declare(AWSLambdaGetAliasCommand(functionName, name).apply(init))
}

@Generated
class AWSLambdaGetAliasCommand(val functionName: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.GetAliasRequest> {



	override fun build(): com.amazonaws.services.lambda.model.GetAliasRequest {
		val input = com.amazonaws.services.lambda.model.GetAliasRequest()
		input.setFunctionName(this.functionName)
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.getAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda get-alias")
				.argument("function-name", functionName)
				.argument("name", name)
	}

}


fun AWSLambdaFunctions.getEventSourceMapping(uUID: String, init: AWSLambdaGetEventSourceMappingCommand.() -> Unit) {
	this.block.declare(AWSLambdaGetEventSourceMappingCommand(uUID).apply(init))
}

@Generated
class AWSLambdaGetEventSourceMappingCommand(val uUID: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.GetEventSourceMappingRequest> {



	override fun build(): com.amazonaws.services.lambda.model.GetEventSourceMappingRequest {
		val input = com.amazonaws.services.lambda.model.GetEventSourceMappingRequest()
		input.setUUID(this.uUID)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.getEventSourceMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda get-event-source-mapping")
				.argument("uuid", uUID)
	}

}


fun AWSLambdaFunctions.getFunction(functionName: String, init: AWSLambdaGetFunctionCommand.() -> Unit) {
	this.block.declare(AWSLambdaGetFunctionCommand(functionName).apply(init))
}

@Generated
class AWSLambdaGetFunctionCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.GetFunctionRequest> {

	var qualifier: String? = null

	override fun build(): com.amazonaws.services.lambda.model.GetFunctionRequest {
		val input = com.amazonaws.services.lambda.model.GetFunctionRequest()
		input.setFunctionName(this.functionName)
		input.setQualifier(this.qualifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.getFunction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda get-function")
				.argument("function-name", functionName)
				.argument("qualifier", qualifier)
	}

}


fun AWSLambdaFunctions.getFunctionConfiguration(functionName: String, init: AWSLambdaGetFunctionConfigurationCommand.() -> Unit) {
	this.block.declare(AWSLambdaGetFunctionConfigurationCommand(functionName).apply(init))
}

@Generated
class AWSLambdaGetFunctionConfigurationCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest> {

	var qualifier: String? = null

	override fun build(): com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest {
		val input = com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest()
		input.setFunctionName(this.functionName)
		input.setQualifier(this.qualifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.getFunctionConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda get-function-configuration")
				.argument("function-name", functionName)
				.argument("qualifier", qualifier)
	}

}


fun AWSLambdaFunctions.getPolicy(functionName: String, init: AWSLambdaGetPolicyCommand.() -> Unit) {
	this.block.declare(AWSLambdaGetPolicyCommand(functionName).apply(init))
}

@Generated
class AWSLambdaGetPolicyCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.GetPolicyRequest> {

	var qualifier: String? = null

	override fun build(): com.amazonaws.services.lambda.model.GetPolicyRequest {
		val input = com.amazonaws.services.lambda.model.GetPolicyRequest()
		input.setFunctionName(this.functionName)
		input.setQualifier(this.qualifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.getPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda get-policy")
				.argument("function-name", functionName)
				.argument("qualifier", qualifier)
	}

}


fun AWSLambdaFunctions.invoke(functionName: String, init: AWSLambdaInvokeCommand.() -> Unit) {
	this.block.declare(AWSLambdaInvokeCommand(functionName).apply(init))
}

@Generated
class AWSLambdaInvokeCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.InvokeRequest> {

	var invocationType: InvocationType? = null
	var logType: LogType? = null
	var clientContext: String? = null
	var payload: java.nio.ByteBuffer? = null
	var qualifier: String? = null

	override fun build(): com.amazonaws.services.lambda.model.InvokeRequest {
		val input = com.amazonaws.services.lambda.model.InvokeRequest()
		input.setFunctionName(this.functionName)
		input.setInvocationType(this.invocationType?.toString())
		input.setLogType(this.logType?.toString())
		input.setClientContext(this.clientContext)
		input.setPayload(this.payload)
		input.setQualifier(this.qualifier)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.invoke(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda invoke")
				.argument("function-name", functionName)
				.argument("invocation-type", invocationType?.toString())
				.argument("log-type", logType?.toString())
				.argument("client-context", clientContext)
				.argument("payload", payload?.toString())
				.argument("qualifier", qualifier)
	}

}


fun AWSLambdaFunctions.invokeAsync(functionName: String, invokeArgs: java.io.InputStream, init: AWSLambdaInvokeAsyncCommand.() -> Unit) {
	this.block.declare(AWSLambdaInvokeAsyncCommand(functionName, invokeArgs).apply(init))
}

@Generated
class AWSLambdaInvokeAsyncCommand(val functionName: String, val invokeArgs: java.io.InputStream) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.InvokeAsyncRequest> {



	override fun build(): com.amazonaws.services.lambda.model.InvokeAsyncRequest {
		val input = com.amazonaws.services.lambda.model.InvokeAsyncRequest()
		input.setFunctionName(this.functionName)
		input.setInvokeArgs(this.invokeArgs)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.invokeAsync(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda invoke-async")
				.argument("function-name", functionName)
				.argument("invoke-args", invokeArgs.toString())
	}

}


fun AWSLambdaFunctions.listAliases(functionName: String, init: AWSLambdaListAliasesCommand.() -> Unit) {
	this.block.declare(AWSLambdaListAliasesCommand(functionName).apply(init))
}

@Generated
class AWSLambdaListAliasesCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.ListAliasesRequest> {

	var functionVersion: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.lambda.model.ListAliasesRequest {
		val input = com.amazonaws.services.lambda.model.ListAliasesRequest()
		input.setFunctionName(this.functionName)
		input.setFunctionVersion(this.functionVersion)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.listAliases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda list-aliases")
				.argument("function-name", functionName)
				.argument("function-version", functionVersion)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AWSLambdaFunctions.listEventSourceMappings(init: AWSLambdaListEventSourceMappingsCommand.() -> Unit) {
	this.block.declare(AWSLambdaListEventSourceMappingsCommand().apply(init))
}

@Generated
class AWSLambdaListEventSourceMappingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.ListEventSourceMappingsRequest> {

	var eventSourceArn: String? = null
	var functionName: String? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.lambda.model.ListEventSourceMappingsRequest {
		val input = com.amazonaws.services.lambda.model.ListEventSourceMappingsRequest()
		input.setEventSourceArn(this.eventSourceArn)
		input.setFunctionName(this.functionName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.listEventSourceMappings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda list-event-source-mappings")
				.argument("event-source-arn", eventSourceArn)
				.argument("function-name", functionName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AWSLambdaFunctions.listFunctions(init: AWSLambdaListFunctionsCommand.() -> Unit) {
	this.block.declare(AWSLambdaListFunctionsCommand().apply(init))
}

@Generated
class AWSLambdaListFunctionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.ListFunctionsRequest> {

	var masterRegion: String? = null
	var functionVersion: FunctionVersion? = null
	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.lambda.model.ListFunctionsRequest {
		val input = com.amazonaws.services.lambda.model.ListFunctionsRequest()
		input.setMasterRegion(this.masterRegion)
		input.setFunctionVersion(this.functionVersion?.toString())
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.listFunctions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda list-functions")
				.argument("master-region", masterRegion)
				.argument("function-version", functionVersion?.toString())
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AWSLambdaFunctions.listTags(resource: String, init: AWSLambdaListTagsCommand.() -> Unit) {
	this.block.declare(AWSLambdaListTagsCommand(resource).apply(init))
}

@Generated
class AWSLambdaListTagsCommand(val resource: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.ListTagsRequest> {



	override fun build(): com.amazonaws.services.lambda.model.ListTagsRequest {
		val input = com.amazonaws.services.lambda.model.ListTagsRequest()
		input.setResource(this.resource)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.listTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda list-tags")
				.argument("resource", resource)
	}

}


fun AWSLambdaFunctions.listVersionsByFunction(functionName: String, init: AWSLambdaListVersionsByFunctionCommand.() -> Unit) {
	this.block.declare(AWSLambdaListVersionsByFunctionCommand(functionName).apply(init))
}

@Generated
class AWSLambdaListVersionsByFunctionCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest {
		val input = com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest()
		input.setFunctionName(this.functionName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.listVersionsByFunction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda list-versions-by-function")
				.argument("function-name", functionName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AWSLambdaFunctions.publishVersion(functionName: String, init: AWSLambdaPublishVersionCommand.() -> Unit) {
	this.block.declare(AWSLambdaPublishVersionCommand(functionName).apply(init))
}

@Generated
class AWSLambdaPublishVersionCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.PublishVersionRequest> {

	var codeSha256: String? = null
	var description: String? = null
	var revisionId: String? = null

	override fun build(): com.amazonaws.services.lambda.model.PublishVersionRequest {
		val input = com.amazonaws.services.lambda.model.PublishVersionRequest()
		input.setFunctionName(this.functionName)
		input.setCodeSha256(this.codeSha256)
		input.setDescription(this.description)
		input.setRevisionId(this.revisionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.publishVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda publish-version")
				.argument("function-name", functionName)
				.argument("code-sha256", codeSha256)
				.argument("description", description)
				.argument("revision-id", revisionId)
	}

}


fun AWSLambdaFunctions.putFunctionConcurrency(functionName: String, reservedConcurrentExecutions: Int, init: AWSLambdaPutFunctionConcurrencyCommand.() -> Unit) {
	this.block.declare(AWSLambdaPutFunctionConcurrencyCommand(functionName, reservedConcurrentExecutions).apply(init))
}

@Generated
class AWSLambdaPutFunctionConcurrencyCommand(val functionName: String, val reservedConcurrentExecutions: Int) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest> {



	override fun build(): com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest {
		val input = com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest()
		input.setFunctionName(this.functionName)
		input.setReservedConcurrentExecutions(this.reservedConcurrentExecutions)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.putFunctionConcurrency(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda put-function-concurrency")
				.argument("function-name", functionName)
				.argument("reserved-concurrent-executions", reservedConcurrentExecutions.toString())
	}

}


fun AWSLambdaFunctions.removePermission(functionName: String, statementId: String, init: AWSLambdaRemovePermissionCommand.() -> Unit) {
	this.block.declare(AWSLambdaRemovePermissionCommand(functionName, statementId).apply(init))
}

@Generated
class AWSLambdaRemovePermissionCommand(val functionName: String, val statementId: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.RemovePermissionRequest> {

	var qualifier: String? = null
	var revisionId: String? = null

	override fun build(): com.amazonaws.services.lambda.model.RemovePermissionRequest {
		val input = com.amazonaws.services.lambda.model.RemovePermissionRequest()
		input.setFunctionName(this.functionName)
		input.setStatementId(this.statementId)
		input.setQualifier(this.qualifier)
		input.setRevisionId(this.revisionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.removePermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda remove-permission")
				.argument("function-name", functionName)
				.argument("statement-id", statementId)
				.argument("qualifier", qualifier)
				.argument("revision-id", revisionId)
	}

}


fun AWSLambdaFunctions.tagResource(resource: String, tags: Map<String, String>, init: AWSLambdaTagResourceCommand.() -> Unit) {
	this.block.declare(AWSLambdaTagResourceCommand(resource, tags).apply(init))
}

@Generated
class AWSLambdaTagResourceCommand(val resource: String, val tags: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.TagResourceRequest> {



	override fun build(): com.amazonaws.services.lambda.model.TagResourceRequest {
		val input = com.amazonaws.services.lambda.model.TagResourceRequest()
		input.setResource(this.resource)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda tag-resource")
				.argument("resource", resource)
				.argument("tags", tags.toString())
	}

}


fun AWSLambdaFunctions.untagResource(resource: String, tagKeys: List<String>, init: AWSLambdaUntagResourceCommand.() -> Unit) {
	this.block.declare(AWSLambdaUntagResourceCommand(resource, tagKeys).apply(init))
}

@Generated
class AWSLambdaUntagResourceCommand(val resource: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.UntagResourceRequest> {



	override fun build(): com.amazonaws.services.lambda.model.UntagResourceRequest {
		val input = com.amazonaws.services.lambda.model.UntagResourceRequest()
		input.setResource(this.resource)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda untag-resource")
				.argument("resource", resource)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSLambdaFunctions.updateAlias(functionName: String, name: String, init: AWSLambdaUpdateAliasCommand.() -> Unit) {
	this.block.declare(AWSLambdaUpdateAliasCommand(functionName, name).apply(init))
}

@Generated
class AWSLambdaUpdateAliasCommand(val functionName: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.UpdateAliasRequest> {

	var functionVersion: String? = null
	var description: String? = null
	var routingConfig: com.amazonaws.services.lambda.model.AliasRoutingConfiguration? = null
	var revisionId: String? = null

	override fun build(): com.amazonaws.services.lambda.model.UpdateAliasRequest {
		val input = com.amazonaws.services.lambda.model.UpdateAliasRequest()
		input.setFunctionName(this.functionName)
		input.setName(this.name)
		input.setFunctionVersion(this.functionVersion)
		input.setDescription(this.description)
		input.setRoutingConfig(this.routingConfig)
		input.setRevisionId(this.revisionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.updateAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda update-alias")
				.argument("function-name", functionName)
				.argument("name", name)
				.argument("function-version", functionVersion)
				.argument("description", description)
				.argument("routing-config", routingConfig?.toString())
				.argument("revision-id", revisionId)
	}

}


fun AWSLambdaFunctions.updateEventSourceMapping(uUID: String, init: AWSLambdaUpdateEventSourceMappingCommand.() -> Unit) {
	this.block.declare(AWSLambdaUpdateEventSourceMappingCommand(uUID).apply(init))
}

@Generated
class AWSLambdaUpdateEventSourceMappingCommand(val uUID: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.UpdateEventSourceMappingRequest> {

	var functionName: String? = null
	var enabled: Boolean? = false
	var batchSize: Int? = 0

	override fun build(): com.amazonaws.services.lambda.model.UpdateEventSourceMappingRequest {
		val input = com.amazonaws.services.lambda.model.UpdateEventSourceMappingRequest()
		input.setUUID(this.uUID)
		input.setFunctionName(this.functionName)
		input.setEnabled(this.enabled)
		input.setBatchSize(this.batchSize)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.updateEventSourceMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda update-event-source-mapping")
				.argument("uuid", uUID)
				.argument("function-name", functionName)
				.option("enabled", enabled ?: false)
				.argument("batch-size", batchSize?.toString())
	}

}


fun AWSLambdaFunctions.updateFunctionCode(functionName: String, init: AWSLambdaUpdateFunctionCodeCommand.() -> Unit) {
	this.block.declare(AWSLambdaUpdateFunctionCodeCommand(functionName).apply(init))
}

@Generated
class AWSLambdaUpdateFunctionCodeCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest> {

	var zipFile: java.nio.ByteBuffer? = null
	var s3Bucket: String? = null
	var s3Key: String? = null
	var s3ObjectVersion: String? = null
	var publish: Boolean? = false
	var dryRun: Boolean? = false
	var revisionId: String? = null

	override fun build(): com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest {
		val input = com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest()
		input.setFunctionName(this.functionName)
		input.setZipFile(this.zipFile)
		input.setS3Bucket(this.s3Bucket)
		input.setS3Key(this.s3Key)
		input.setS3ObjectVersion(this.s3ObjectVersion)
		input.setPublish(this.publish)
		input.setDryRun(this.dryRun)
		input.setRevisionId(this.revisionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.updateFunctionCode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda update-function-code")
				.argument("function-name", functionName)
				.argument("zip-file", zipFile?.toString())
				.argument("s3-bucket", s3Bucket)
				.argument("s3-key", s3Key)
				.argument("s3-object-version", s3ObjectVersion)
				.option("publish", publish ?: false)
				.option("dry-run", dryRun ?: false)
				.argument("revision-id", revisionId)
	}

}


fun AWSLambdaFunctions.updateFunctionConfiguration(functionName: String, init: AWSLambdaUpdateFunctionConfigurationCommand.() -> Unit) {
	this.block.declare(AWSLambdaUpdateFunctionConfigurationCommand(functionName).apply(init))
}

@Generated
class AWSLambdaUpdateFunctionConfigurationCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest> {

	var role: String? = null
	var handler: String? = null
	var description: String? = null
	var timeout: Int? = 0
	var memorySize: Int? = 0
	var vpcConfig: com.amazonaws.services.lambda.model.VpcConfig? = null
	var environment: com.amazonaws.services.lambda.model.Environment? = null
	var runtime: Runtime? = null
	var deadLetterConfig: com.amazonaws.services.lambda.model.DeadLetterConfig? = null
	var kMSKeyArn: String? = null
	var tracingConfig: com.amazonaws.services.lambda.model.TracingConfig? = null
	var revisionId: String? = null

	override fun build(): com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest {
		val input = com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest()
		input.setFunctionName(this.functionName)
		input.setRole(this.role)
		input.setHandler(this.handler)
		input.setDescription(this.description)
		input.setTimeout(this.timeout)
		input.setMemorySize(this.memorySize)
		input.setVpcConfig(this.vpcConfig)
		input.setEnvironment(this.environment)
		input.setRuntime(this.runtime?.toString())
		input.setDeadLetterConfig(this.deadLetterConfig)
		input.setKMSKeyArn(this.kMSKeyArn)
		input.setTracingConfig(this.tracingConfig)
		input.setRevisionId(this.revisionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.lambda.updateFunctionConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda update-function-configuration")
				.argument("function-name", functionName)
				.argument("role", role)
				.argument("handler", handler)
				.argument("description", description)
				.argument("timeout", timeout?.toString())
				.argument("memory-size", memorySize?.toString())
				.argument("vpc-config", vpcConfig?.toString())
				.argument("environment", environment?.toString())
				.argument("runtime", runtime?.toString())
				.argument("dead-letter-config", deadLetterConfig?.toString())
				.argument("kmskey-arn", kMSKeyArn)
				.argument("tracing-config", tracingConfig?.toString())
				.argument("revision-id", revisionId)
	}

}
