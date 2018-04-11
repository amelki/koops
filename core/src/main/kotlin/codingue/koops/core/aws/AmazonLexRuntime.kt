
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.lexruntime.AmazonLexRuntime
import com.amazonaws.services.lexruntime.AmazonLexRuntimeClientBuilder
import com.amazonaws.services.lexruntime.model.*

var codingue.koops.core.Environment.lexruntime: AmazonLexRuntime
	get() {
		var service = this.capabilities[AmazonLexRuntime::class.java.name]
		if (service == null) {
			service = AmazonLexRuntimeClientBuilder.standard().build()
			lexruntime = service
		}
		return service as AmazonLexRuntime
	}
	set(lexruntime) {
		this.capabilities[AmazonLexRuntime::class.java.name] = lexruntime
	}

@Generated
class AmazonLexRuntimeFunctions(val block: Block)

infix fun <T> AwsContinuation.lexruntime(init: AmazonLexRuntimeFunctions.() -> T): T {
	return AmazonLexRuntimeFunctions(shell).run(init)
}

			

fun AmazonLexRuntimeFunctions.postContent(init: AmazonLexRuntimePostContentCommand.() -> Unit): com.amazonaws.services.lexruntime.model.PostContentResult {
	return this.block.declare(AmazonLexRuntimePostContentCommand().apply(init)) as com.amazonaws.services.lexruntime.model.PostContentResult
}

@Generated
class AmazonLexRuntimePostContentCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexruntime.model.PostContentRequest, com.amazonaws.services.lexruntime.model.PostContentResult> {

	var botName: String? = null
	var botAlias: String? = null
	var userId: String? = null
	var sessionAttributes: String? = null
	var requestAttributes: String? = null
	var contentType: String? = null
	var accept: String? = null
	var inputStream: java.io.InputStream? = null

	override fun build(): com.amazonaws.services.lexruntime.model.PostContentRequest {
		val input = com.amazonaws.services.lexruntime.model.PostContentRequest()
		input.setBotName(this.botName)
		input.setBotAlias(this.botAlias)
		input.setUserId(this.userId)
		input.setSessionAttributes(this.sessionAttributes)
		input.setRequestAttributes(this.requestAttributes)
		input.setContentType(this.contentType)
		input.setAccept(this.accept)
		input.setInputStream(this.inputStream)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexruntime.model.PostContentResult {
	  return com.amazonaws.services.lexruntime.model.PostContentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.lexruntime.model.PostContentResult {
		return environment.lexruntime.postContent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-runtime post-content")
				.argument("bot-name", botName)
				.argument("bot-alias", botAlias)
				.argument("user-id", userId)
				.argument("session-attributes", sessionAttributes)
				.argument("request-attributes", requestAttributes)
				.argument("content-type", contentType)
				.argument("accept", accept)
				.argument("input-stream", inputStream?.toString())
	}

}


fun AmazonLexRuntimeFunctions.postText(init: AmazonLexRuntimePostTextCommand.() -> Unit): com.amazonaws.services.lexruntime.model.PostTextResult {
	return this.block.declare(AmazonLexRuntimePostTextCommand().apply(init)) as com.amazonaws.services.lexruntime.model.PostTextResult
}

@Generated
class AmazonLexRuntimePostTextCommand() : AmazonWebServiceCommand<com.amazonaws.services.lexruntime.model.PostTextRequest, com.amazonaws.services.lexruntime.model.PostTextResult> {

	var botName: String? = null
	var botAlias: String? = null
	var userId: String? = null
	var sessionAttributes: Map<String, String>? = null
	var requestAttributes: Map<String, String>? = null
	var inputText: String? = null

	override fun build(): com.amazonaws.services.lexruntime.model.PostTextRequest {
		val input = com.amazonaws.services.lexruntime.model.PostTextRequest()
		input.setBotName(this.botName)
		input.setBotAlias(this.botAlias)
		input.setUserId(this.userId)
		input.setSessionAttributes(this.sessionAttributes)
		input.setRequestAttributes(this.requestAttributes)
		input.setInputText(this.inputText)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.lexruntime.model.PostTextResult {
	  return com.amazonaws.services.lexruntime.model.PostTextResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.lexruntime.model.PostTextResult {
		return environment.lexruntime.postText(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws lex-runtime post-text")
				.argument("bot-name", botName)
				.argument("bot-alias", botAlias)
				.argument("user-id", userId)
				.argument("session-attributes", sessionAttributes?.toString())
				.argument("request-attributes", requestAttributes?.toString())
				.argument("input-text", inputText)
	}

}
