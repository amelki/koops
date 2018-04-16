
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.lambda

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.lambda.*
import com.amazonaws.services.lambda.model.*

var com.codingue.koops.core.Environment.lambda: AWSLambda
	get() {
		var service = this.capabilities["aws-lambda"]
		if (service == null) {
			service = AWSLambdaClientBuilder.standard().build()
			this.capabilities["aws-lambda"] = service
		}
		return service as AWSLambda
	}
	set(lambda) {
		this.capabilities["aws-lambda"] = lambda
	}

@Generated
class AWSLambdaFunctions(val block: Block)

infix fun <T> AwsContinuation.lambda(init: AWSLambdaFunctions.() -> T): T {
	return AWSLambdaFunctions(shell).run(init)
}

			

fun AWSLambdaFunctions.addPermission(functionName: String, statementId: String, action: String, principal: String, init: (AWSLambdaAddPermissionCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.AddPermissionResult {
	return this.block.declare(AWSLambdaAddPermissionCommand(functionName, statementId, action, principal).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.AddPermissionResult
}

@Generated
class AWSLambdaAddPermissionCommand(val functionName: String, val statementId: String, val action: String, val principal: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.AddPermissionRequest, com.amazonaws.services.lambda.model.AddPermissionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lambda.model.AddPermissionResult {
	  return com.amazonaws.services.lambda.model.AddPermissionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.AddPermissionResult {
		return environment.lambda.addPermission(build())
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


fun AWSLambdaFunctions.createAlias(functionName: String, name: String, functionVersion: String, init: (AWSLambdaCreateAliasCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.CreateAliasResult {
	return this.block.declare(AWSLambdaCreateAliasCommand(functionName, name, functionVersion).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.CreateAliasResult
}

@Generated
class AWSLambdaCreateAliasCommand(val functionName: String, val name: String, val functionVersion: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.CreateAliasRequest, com.amazonaws.services.lambda.model.CreateAliasResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lambda.model.CreateAliasResult {
	  return com.amazonaws.services.lambda.model.CreateAliasResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.CreateAliasResult {
		return environment.lambda.createAlias(build())
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


fun AWSLambdaFunctions.createEventSourceMapping(eventSourceArn: String, functionName: String, startingPosition: EventSourcePosition, init: (AWSLambdaCreateEventSourceMappingCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.CreateEventSourceMappingResult {
	return this.block.declare(AWSLambdaCreateEventSourceMappingCommand(eventSourceArn, functionName, startingPosition).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.CreateEventSourceMappingResult
}

@Generated
class AWSLambdaCreateEventSourceMappingCommand(val eventSourceArn: String, val functionName: String, val startingPosition: EventSourcePosition) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest, com.amazonaws.services.lambda.model.CreateEventSourceMappingResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lambda.model.CreateEventSourceMappingResult {
	  return com.amazonaws.services.lambda.model.CreateEventSourceMappingResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.CreateEventSourceMappingResult {
		return environment.lambda.createEventSourceMapping(build())
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


fun AWSLambdaFunctions.createFunction(functionName: String, runtime: Runtime, role: String, handler: String, code: com.amazonaws.services.lambda.model.FunctionCode, init: (AWSLambdaCreateFunctionCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.CreateFunctionResult {
	return this.block.declare(AWSLambdaCreateFunctionCommand(functionName, runtime, role, handler, code).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.CreateFunctionResult
}

@Generated
class AWSLambdaCreateFunctionCommand(val functionName: String, val runtime: Runtime, val role: String, val handler: String, val code: com.amazonaws.services.lambda.model.FunctionCode) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.CreateFunctionRequest, com.amazonaws.services.lambda.model.CreateFunctionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lambda.model.CreateFunctionResult {
	  return com.amazonaws.services.lambda.model.CreateFunctionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.CreateFunctionResult {
		return environment.lambda.createFunction(build())
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


fun AWSLambdaFunctions.deleteAlias(functionName: String, name: String, init: (AWSLambdaDeleteAliasCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.DeleteAliasResult {
	return this.block.declare(AWSLambdaDeleteAliasCommand(functionName, name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.DeleteAliasResult
}

@Generated
class AWSLambdaDeleteAliasCommand(val functionName: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.DeleteAliasRequest, com.amazonaws.services.lambda.model.DeleteAliasResult> {



	override fun build(): com.amazonaws.services.lambda.model.DeleteAliasRequest {
		val input = com.amazonaws.services.lambda.model.DeleteAliasRequest()
		input.setFunctionName(this.functionName)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lambda.model.DeleteAliasResult {
	  return com.amazonaws.services.lambda.model.DeleteAliasResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.DeleteAliasResult {
		return environment.lambda.deleteAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda delete-alias")
				.argument("function-name", functionName)
				.argument("name", name)
	}

}


fun AWSLambdaFunctions.deleteEventSourceMapping(uUID: String, init: (AWSLambdaDeleteEventSourceMappingCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.DeleteEventSourceMappingResult {
	return this.block.declare(AWSLambdaDeleteEventSourceMappingCommand(uUID).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.DeleteEventSourceMappingResult
}

@Generated
class AWSLambdaDeleteEventSourceMappingCommand(val uUID: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest, com.amazonaws.services.lambda.model.DeleteEventSourceMappingResult> {



	override fun build(): com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest {
		val input = com.amazonaws.services.lambda.model.DeleteEventSourceMappingRequest()
		input.setUUID(this.uUID)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lambda.model.DeleteEventSourceMappingResult {
	  return com.amazonaws.services.lambda.model.DeleteEventSourceMappingResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.DeleteEventSourceMappingResult {
		return environment.lambda.deleteEventSourceMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda delete-event-source-mapping")
				.argument("uuid", uUID)
	}

}


fun AWSLambdaFunctions.deleteFunction(functionName: String, init: (AWSLambdaDeleteFunctionCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.DeleteFunctionResult {
	return this.block.declare(AWSLambdaDeleteFunctionCommand(functionName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.DeleteFunctionResult
}

@Generated
class AWSLambdaDeleteFunctionCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.DeleteFunctionRequest, com.amazonaws.services.lambda.model.DeleteFunctionResult> {

	var qualifier: String? = null

	override fun build(): com.amazonaws.services.lambda.model.DeleteFunctionRequest {
		val input = com.amazonaws.services.lambda.model.DeleteFunctionRequest()
		input.setFunctionName(this.functionName)
		input.setQualifier(this.qualifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lambda.model.DeleteFunctionResult {
	  return com.amazonaws.services.lambda.model.DeleteFunctionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.DeleteFunctionResult {
		return environment.lambda.deleteFunction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda delete-function")
				.argument("function-name", functionName)
				.argument("qualifier", qualifier)
	}

}


fun AWSLambdaFunctions.deleteFunctionConcurrency(functionName: String, init: (AWSLambdaDeleteFunctionConcurrencyCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyResult {
	return this.block.declare(AWSLambdaDeleteFunctionConcurrencyCommand(functionName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyResult
}

@Generated
class AWSLambdaDeleteFunctionConcurrencyCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest, com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyResult> {



	override fun build(): com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest {
		val input = com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyRequest()
		input.setFunctionName(this.functionName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyResult {
	  return com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.DeleteFunctionConcurrencyResult {
		return environment.lambda.deleteFunctionConcurrency(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda delete-function-concurrency")
				.argument("function-name", functionName)
	}

}


fun AWSLambdaFunctions.getAccountSettings(init: (AWSLambdaGetAccountSettingsCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.GetAccountSettingsResult {
	return this.block.declare(AWSLambdaGetAccountSettingsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.GetAccountSettingsResult
}

@Generated
class AWSLambdaGetAccountSettingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.GetAccountSettingsRequest, com.amazonaws.services.lambda.model.GetAccountSettingsResult> {



	override fun build(): com.amazonaws.services.lambda.model.GetAccountSettingsRequest {
		val input = com.amazonaws.services.lambda.model.GetAccountSettingsRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lambda.model.GetAccountSettingsResult {
	  return com.amazonaws.services.lambda.model.GetAccountSettingsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.GetAccountSettingsResult {
		return environment.lambda.getAccountSettings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda get-account-settings")

	}

}


fun AWSLambdaFunctions.getAlias(functionName: String, name: String, init: (AWSLambdaGetAliasCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.GetAliasResult {
	return this.block.declare(AWSLambdaGetAliasCommand(functionName, name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.GetAliasResult
}

@Generated
class AWSLambdaGetAliasCommand(val functionName: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.GetAliasRequest, com.amazonaws.services.lambda.model.GetAliasResult> {



	override fun build(): com.amazonaws.services.lambda.model.GetAliasRequest {
		val input = com.amazonaws.services.lambda.model.GetAliasRequest()
		input.setFunctionName(this.functionName)
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lambda.model.GetAliasResult {
	  return com.amazonaws.services.lambda.model.GetAliasResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.GetAliasResult {
		return environment.lambda.getAlias(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda get-alias")
				.argument("function-name", functionName)
				.argument("name", name)
	}

}


fun AWSLambdaFunctions.getEventSourceMapping(uUID: String, init: (AWSLambdaGetEventSourceMappingCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.GetEventSourceMappingResult {
	return this.block.declare(AWSLambdaGetEventSourceMappingCommand(uUID).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.GetEventSourceMappingResult
}

@Generated
class AWSLambdaGetEventSourceMappingCommand(val uUID: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.GetEventSourceMappingRequest, com.amazonaws.services.lambda.model.GetEventSourceMappingResult> {



	override fun build(): com.amazonaws.services.lambda.model.GetEventSourceMappingRequest {
		val input = com.amazonaws.services.lambda.model.GetEventSourceMappingRequest()
		input.setUUID(this.uUID)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lambda.model.GetEventSourceMappingResult {
	  return com.amazonaws.services.lambda.model.GetEventSourceMappingResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.GetEventSourceMappingResult {
		return environment.lambda.getEventSourceMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda get-event-source-mapping")
				.argument("uuid", uUID)
	}

}


fun AWSLambdaFunctions.getFunction(functionName: String, init: (AWSLambdaGetFunctionCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.GetFunctionResult {
	return this.block.declare(AWSLambdaGetFunctionCommand(functionName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.GetFunctionResult
}

@Generated
class AWSLambdaGetFunctionCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.GetFunctionRequest, com.amazonaws.services.lambda.model.GetFunctionResult> {

	var qualifier: String? = null

	override fun build(): com.amazonaws.services.lambda.model.GetFunctionRequest {
		val input = com.amazonaws.services.lambda.model.GetFunctionRequest()
		input.setFunctionName(this.functionName)
		input.setQualifier(this.qualifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lambda.model.GetFunctionResult {
	  return com.amazonaws.services.lambda.model.GetFunctionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.GetFunctionResult {
		return environment.lambda.getFunction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda get-function")
				.argument("function-name", functionName)
				.argument("qualifier", qualifier)
	}

}


fun AWSLambdaFunctions.getFunctionConfiguration(functionName: String, init: (AWSLambdaGetFunctionConfigurationCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.GetFunctionConfigurationResult {
	return this.block.declare(AWSLambdaGetFunctionConfigurationCommand(functionName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.GetFunctionConfigurationResult
}

@Generated
class AWSLambdaGetFunctionConfigurationCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest, com.amazonaws.services.lambda.model.GetFunctionConfigurationResult> {

	var qualifier: String? = null

	override fun build(): com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest {
		val input = com.amazonaws.services.lambda.model.GetFunctionConfigurationRequest()
		input.setFunctionName(this.functionName)
		input.setQualifier(this.qualifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lambda.model.GetFunctionConfigurationResult {
	  return com.amazonaws.services.lambda.model.GetFunctionConfigurationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.GetFunctionConfigurationResult {
		return environment.lambda.getFunctionConfiguration(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda get-function-configuration")
				.argument("function-name", functionName)
				.argument("qualifier", qualifier)
	}

}


fun AWSLambdaFunctions.getPolicy(functionName: String, init: (AWSLambdaGetPolicyCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.GetPolicyResult {
	return this.block.declare(AWSLambdaGetPolicyCommand(functionName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.GetPolicyResult
}

@Generated
class AWSLambdaGetPolicyCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.GetPolicyRequest, com.amazonaws.services.lambda.model.GetPolicyResult> {

	var qualifier: String? = null

	override fun build(): com.amazonaws.services.lambda.model.GetPolicyRequest {
		val input = com.amazonaws.services.lambda.model.GetPolicyRequest()
		input.setFunctionName(this.functionName)
		input.setQualifier(this.qualifier)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lambda.model.GetPolicyResult {
	  return com.amazonaws.services.lambda.model.GetPolicyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.GetPolicyResult {
		return environment.lambda.getPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda get-policy")
				.argument("function-name", functionName)
				.argument("qualifier", qualifier)
	}

}


fun AWSLambdaFunctions.invoke(functionName: String, init: (AWSLambdaInvokeCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.InvokeResult {
	return this.block.declare(AWSLambdaInvokeCommand(functionName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.InvokeResult
}

@Generated
class AWSLambdaInvokeCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.InvokeRequest, com.amazonaws.services.lambda.model.InvokeResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lambda.model.InvokeResult {
	  return com.amazonaws.services.lambda.model.InvokeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.InvokeResult {
		return environment.lambda.invoke(build())
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


fun AWSLambdaFunctions.invokeAsync(functionName: String, invokeArgs: java.io.InputStream, init: (AWSLambdaInvokeAsyncCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.InvokeAsyncResult {
	return this.block.declare(AWSLambdaInvokeAsyncCommand(functionName, invokeArgs).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.InvokeAsyncResult
}

@Generated
class AWSLambdaInvokeAsyncCommand(val functionName: String, val invokeArgs: java.io.InputStream) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.InvokeAsyncRequest, com.amazonaws.services.lambda.model.InvokeAsyncResult> {



	override fun build(): com.amazonaws.services.lambda.model.InvokeAsyncRequest {
		val input = com.amazonaws.services.lambda.model.InvokeAsyncRequest()
		input.setFunctionName(this.functionName)
		input.setInvokeArgs(this.invokeArgs)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lambda.model.InvokeAsyncResult {
	  return com.amazonaws.services.lambda.model.InvokeAsyncResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.InvokeAsyncResult {
		return environment.lambda.invokeAsync(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda invoke-async")
				.argument("function-name", functionName)
				.argument("invoke-args", invokeArgs.toString())
	}

}


fun AWSLambdaFunctions.listAliases(functionName: String, init: (AWSLambdaListAliasesCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.ListAliasesResult {
	return this.block.declare(AWSLambdaListAliasesCommand(functionName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.ListAliasesResult
}

@Generated
class AWSLambdaListAliasesCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.ListAliasesRequest, com.amazonaws.services.lambda.model.ListAliasesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lambda.model.ListAliasesResult {
	  return com.amazonaws.services.lambda.model.ListAliasesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.ListAliasesResult {
		return environment.lambda.listAliases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda list-aliases")
				.argument("function-name", functionName)
				.argument("function-version", functionVersion)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AWSLambdaFunctions.listEventSourceMappings(init: (AWSLambdaListEventSourceMappingsCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.ListEventSourceMappingsResult {
	return this.block.declare(AWSLambdaListEventSourceMappingsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.ListEventSourceMappingsResult
}

@Generated
class AWSLambdaListEventSourceMappingsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.ListEventSourceMappingsRequest, com.amazonaws.services.lambda.model.ListEventSourceMappingsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lambda.model.ListEventSourceMappingsResult {
	  return com.amazonaws.services.lambda.model.ListEventSourceMappingsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.ListEventSourceMappingsResult {
		return environment.lambda.listEventSourceMappings(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda list-event-source-mappings")
				.argument("event-source-arn", eventSourceArn)
				.argument("function-name", functionName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AWSLambdaFunctions.listFunctions(init: (AWSLambdaListFunctionsCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.ListFunctionsResult {
	return this.block.declare(AWSLambdaListFunctionsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.ListFunctionsResult
}

@Generated
class AWSLambdaListFunctionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.ListFunctionsRequest, com.amazonaws.services.lambda.model.ListFunctionsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lambda.model.ListFunctionsResult {
	  return com.amazonaws.services.lambda.model.ListFunctionsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.ListFunctionsResult {
		return environment.lambda.listFunctions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda list-functions")
				.argument("master-region", masterRegion)
				.argument("function-version", functionVersion?.toString())
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AWSLambdaFunctions.listTags(resource: String, init: (AWSLambdaListTagsCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.ListTagsResult {
	return this.block.declare(AWSLambdaListTagsCommand(resource).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.ListTagsResult
}

@Generated
class AWSLambdaListTagsCommand(val resource: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.ListTagsRequest, com.amazonaws.services.lambda.model.ListTagsResult> {



	override fun build(): com.amazonaws.services.lambda.model.ListTagsRequest {
		val input = com.amazonaws.services.lambda.model.ListTagsRequest()
		input.setResource(this.resource)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lambda.model.ListTagsResult {
	  return com.amazonaws.services.lambda.model.ListTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.ListTagsResult {
		return environment.lambda.listTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda list-tags")
				.argument("resource", resource)
	}

}


fun AWSLambdaFunctions.listVersionsByFunction(functionName: String, init: (AWSLambdaListVersionsByFunctionCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.ListVersionsByFunctionResult {
	return this.block.declare(AWSLambdaListVersionsByFunctionCommand(functionName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.ListVersionsByFunctionResult
}

@Generated
class AWSLambdaListVersionsByFunctionCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest, com.amazonaws.services.lambda.model.ListVersionsByFunctionResult> {

	var marker: String? = null
	var maxItems: Int? = 0

	override fun build(): com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest {
		val input = com.amazonaws.services.lambda.model.ListVersionsByFunctionRequest()
		input.setFunctionName(this.functionName)
		input.setMarker(this.marker)
		input.setMaxItems(this.maxItems)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lambda.model.ListVersionsByFunctionResult {
	  return com.amazonaws.services.lambda.model.ListVersionsByFunctionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.ListVersionsByFunctionResult {
		return environment.lambda.listVersionsByFunction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda list-versions-by-function")
				.argument("function-name", functionName)
				.argument("marker", marker)
				.argument("max-items", maxItems?.toString())
	}

}


fun AWSLambdaFunctions.publishVersion(functionName: String, init: (AWSLambdaPublishVersionCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.PublishVersionResult {
	return this.block.declare(AWSLambdaPublishVersionCommand(functionName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.PublishVersionResult
}

@Generated
class AWSLambdaPublishVersionCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.PublishVersionRequest, com.amazonaws.services.lambda.model.PublishVersionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lambda.model.PublishVersionResult {
	  return com.amazonaws.services.lambda.model.PublishVersionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.PublishVersionResult {
		return environment.lambda.publishVersion(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda publish-version")
				.argument("function-name", functionName)
				.argument("code-sha256", codeSha256)
				.argument("description", description)
				.argument("revision-id", revisionId)
	}

}


fun AWSLambdaFunctions.putFunctionConcurrency(functionName: String, reservedConcurrentExecutions: Int, init: (AWSLambdaPutFunctionConcurrencyCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.PutFunctionConcurrencyResult {
	return this.block.declare(AWSLambdaPutFunctionConcurrencyCommand(functionName, reservedConcurrentExecutions).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.PutFunctionConcurrencyResult
}

@Generated
class AWSLambdaPutFunctionConcurrencyCommand(val functionName: String, val reservedConcurrentExecutions: Int) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest, com.amazonaws.services.lambda.model.PutFunctionConcurrencyResult> {



	override fun build(): com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest {
		val input = com.amazonaws.services.lambda.model.PutFunctionConcurrencyRequest()
		input.setFunctionName(this.functionName)
		input.setReservedConcurrentExecutions(this.reservedConcurrentExecutions)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lambda.model.PutFunctionConcurrencyResult {
	  return com.amazonaws.services.lambda.model.PutFunctionConcurrencyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.PutFunctionConcurrencyResult {
		return environment.lambda.putFunctionConcurrency(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda put-function-concurrency")
				.argument("function-name", functionName)
				.argument("reserved-concurrent-executions", reservedConcurrentExecutions.toString())
	}

}


fun AWSLambdaFunctions.removePermission(functionName: String, statementId: String, init: (AWSLambdaRemovePermissionCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.RemovePermissionResult {
	return this.block.declare(AWSLambdaRemovePermissionCommand(functionName, statementId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.RemovePermissionResult
}

@Generated
class AWSLambdaRemovePermissionCommand(val functionName: String, val statementId: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.RemovePermissionRequest, com.amazonaws.services.lambda.model.RemovePermissionResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lambda.model.RemovePermissionResult {
	  return com.amazonaws.services.lambda.model.RemovePermissionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.RemovePermissionResult {
		return environment.lambda.removePermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda remove-permission")
				.argument("function-name", functionName)
				.argument("statement-id", statementId)
				.argument("qualifier", qualifier)
				.argument("revision-id", revisionId)
	}

}


fun AWSLambdaFunctions.tagResource(resource: String, tags: Map<String, String>, init: (AWSLambdaTagResourceCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.TagResourceResult {
	return this.block.declare(AWSLambdaTagResourceCommand(resource, tags).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.TagResourceResult
}

@Generated
class AWSLambdaTagResourceCommand(val resource: String, val tags: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.TagResourceRequest, com.amazonaws.services.lambda.model.TagResourceResult> {



	override fun build(): com.amazonaws.services.lambda.model.TagResourceRequest {
		val input = com.amazonaws.services.lambda.model.TagResourceRequest()
		input.setResource(this.resource)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lambda.model.TagResourceResult {
	  return com.amazonaws.services.lambda.model.TagResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.TagResourceResult {
		return environment.lambda.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda tag-resource")
				.argument("resource", resource)
				.argument("tags", tags.toString())
	}

}


fun AWSLambdaFunctions.untagResource(resource: String, tagKeys: List<String>, init: (AWSLambdaUntagResourceCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.UntagResourceResult {
	return this.block.declare(AWSLambdaUntagResourceCommand(resource, tagKeys).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.UntagResourceResult
}

@Generated
class AWSLambdaUntagResourceCommand(val resource: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.UntagResourceRequest, com.amazonaws.services.lambda.model.UntagResourceResult> {



	override fun build(): com.amazonaws.services.lambda.model.UntagResourceRequest {
		val input = com.amazonaws.services.lambda.model.UntagResourceRequest()
		input.setResource(this.resource)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lambda.model.UntagResourceResult {
	  return com.amazonaws.services.lambda.model.UntagResourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.UntagResourceResult {
		return environment.lambda.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda untag-resource")
				.argument("resource", resource)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSLambdaFunctions.updateAlias(functionName: String, name: String, init: (AWSLambdaUpdateAliasCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.UpdateAliasResult {
	return this.block.declare(AWSLambdaUpdateAliasCommand(functionName, name).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.UpdateAliasResult
}

@Generated
class AWSLambdaUpdateAliasCommand(val functionName: String, val name: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.UpdateAliasRequest, com.amazonaws.services.lambda.model.UpdateAliasResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lambda.model.UpdateAliasResult {
	  return com.amazonaws.services.lambda.model.UpdateAliasResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.UpdateAliasResult {
		return environment.lambda.updateAlias(build())
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


fun AWSLambdaFunctions.updateEventSourceMapping(uUID: String, init: (AWSLambdaUpdateEventSourceMappingCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.UpdateEventSourceMappingResult {
	return this.block.declare(AWSLambdaUpdateEventSourceMappingCommand(uUID).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.UpdateEventSourceMappingResult
}

@Generated
class AWSLambdaUpdateEventSourceMappingCommand(val uUID: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.UpdateEventSourceMappingRequest, com.amazonaws.services.lambda.model.UpdateEventSourceMappingResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lambda.model.UpdateEventSourceMappingResult {
	  return com.amazonaws.services.lambda.model.UpdateEventSourceMappingResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.UpdateEventSourceMappingResult {
		return environment.lambda.updateEventSourceMapping(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lambda update-event-source-mapping")
				.argument("uuid", uUID)
				.argument("function-name", functionName)
				.option("enabled", enabled ?: false)
				.argument("batch-size", batchSize?.toString())
	}

}


fun AWSLambdaFunctions.updateFunctionCode(functionName: String, init: (AWSLambdaUpdateFunctionCodeCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.UpdateFunctionCodeResult {
	return this.block.declare(AWSLambdaUpdateFunctionCodeCommand(functionName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.UpdateFunctionCodeResult
}

@Generated
class AWSLambdaUpdateFunctionCodeCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest, com.amazonaws.services.lambda.model.UpdateFunctionCodeResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lambda.model.UpdateFunctionCodeResult {
	  return com.amazonaws.services.lambda.model.UpdateFunctionCodeResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.UpdateFunctionCodeResult {
		return environment.lambda.updateFunctionCode(build())
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


fun AWSLambdaFunctions.updateFunctionConfiguration(functionName: String, init: (AWSLambdaUpdateFunctionConfigurationCommand.() -> Unit)? = null): com.amazonaws.services.lambda.model.UpdateFunctionConfigurationResult {
	return this.block.declare(AWSLambdaUpdateFunctionConfigurationCommand(functionName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.lambda.model.UpdateFunctionConfigurationResult
}

@Generated
class AWSLambdaUpdateFunctionConfigurationCommand(val functionName: String) : AmazonWebServiceCommand<com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest, com.amazonaws.services.lambda.model.UpdateFunctionConfigurationResult> {

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

	
	override fun dryResult(): com.amazonaws.services.lambda.model.UpdateFunctionConfigurationResult {
	  return com.amazonaws.services.lambda.model.UpdateFunctionConfigurationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.lambda.model.UpdateFunctionConfigurationResult {
		return environment.lambda.updateFunctionConfiguration(build())
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
