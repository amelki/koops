
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.sagemakerruntime

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.sagemakerruntime.*
import com.amazonaws.services.sagemakerruntime.model.*

var codingue.koops.core.Environment.sagemakerruntime: AmazonSageMakerRuntime
	get() {
		var service = this.capabilities["aws-sagemakerruntime"]
		if (service == null) {
			service = AmazonSageMakerRuntimeClientBuilder.standard().build()
			this.capabilities["aws-sagemakerruntime"] = service
		}
		return service as AmazonSageMakerRuntime
	}
	set(sagemakerruntime) {
		this.capabilities["aws-sagemakerruntime"] = sagemakerruntime
	}

@Generated
class AmazonSageMakerRuntimeFunctions(val block: Block)

infix fun <T> AwsContinuation.sagemakerruntime(init: AmazonSageMakerRuntimeFunctions.() -> T): T {
	return AmazonSageMakerRuntimeFunctions(shell).run(init)
}

			

fun AmazonSageMakerRuntimeFunctions.invokeEndpoint(endpointName: String, body: java.nio.ByteBuffer, init: AmazonSageMakerRuntimeInvokeEndpointCommand.() -> Unit): com.amazonaws.services.sagemakerruntime.model.InvokeEndpointResult {
	return this.block.declare(AmazonSageMakerRuntimeInvokeEndpointCommand(endpointName, body).apply(init)) as com.amazonaws.services.sagemakerruntime.model.InvokeEndpointResult
}

@Generated
class AmazonSageMakerRuntimeInvokeEndpointCommand(val endpointName: String, val body: java.nio.ByteBuffer) : AmazonWebServiceCommand<com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest, com.amazonaws.services.sagemakerruntime.model.InvokeEndpointResult> {

	var contentType: String? = null
	var accept: String? = null

	override fun build(): com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest {
		val input = com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest()
		input.setEndpointName(this.endpointName)
		input.setBody(this.body)
		input.setContentType(this.contentType)
		input.setAccept(this.accept)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemakerruntime.model.InvokeEndpointResult {
	  return com.amazonaws.services.sagemakerruntime.model.InvokeEndpointResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sagemakerruntime.model.InvokeEndpointResult {
		return environment.sagemakerruntime.invokeEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker-runtime invoke-endpoint")
				.argument("endpoint-name", endpointName)
				.argument("body", body.toString())
				.argument("content-type", contentType)
				.argument("accept", accept)
	}

}
