
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.translate

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.translate.*
import com.amazonaws.services.translate.model.*

var codingue.koops.core.Environment.translate: AmazonTranslate
	get() {
		var service = this.capabilities["aws-translate"]
		if (service == null) {
			service = AmazonTranslateClientBuilder.standard().build()
			this.capabilities["aws-translate"] = service
		}
		return service as AmazonTranslate
	}
	set(translate) {
		this.capabilities["aws-translate"] = translate
	}

@Generated
class AmazonTranslateFunctions(val block: Block)

infix fun <T> AwsContinuation.translate(init: AmazonTranslateFunctions.() -> T): T {
	return AmazonTranslateFunctions(shell).run(init)
}

			

fun AmazonTranslateFunctions.translateText(text: String, sourceLanguageCode: String, targetLanguageCode: String, init: AmazonTranslateTranslateTextCommand.() -> Unit): com.amazonaws.services.translate.model.TranslateTextResult {
	return this.block.declare(AmazonTranslateTranslateTextCommand(text, sourceLanguageCode, targetLanguageCode).apply(init)) as com.amazonaws.services.translate.model.TranslateTextResult
}

@Generated
class AmazonTranslateTranslateTextCommand(val text: String, val sourceLanguageCode: String, val targetLanguageCode: String) : AmazonWebServiceCommand<com.amazonaws.services.translate.model.TranslateTextRequest, com.amazonaws.services.translate.model.TranslateTextResult> {



	override fun build(): com.amazonaws.services.translate.model.TranslateTextRequest {
		val input = com.amazonaws.services.translate.model.TranslateTextRequest()
		input.setText(this.text)
		input.setSourceLanguageCode(this.sourceLanguageCode)
		input.setTargetLanguageCode(this.targetLanguageCode)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.translate.model.TranslateTextResult {
	  return com.amazonaws.services.translate.model.TranslateTextResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.translate.model.TranslateTextResult {
		return environment.translate.translateText(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws translate translate-text")
				.argument("text", text)
				.argument("source-language-code", sourceLanguageCode)
				.argument("target-language-code", targetLanguageCode)
	}

}
