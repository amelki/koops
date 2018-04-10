
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.translate.AmazonTranslate
import com.amazonaws.services.translate.model.*

var codingue.koops.core.Environment.translate: AmazonTranslate
	get() = this.capabilities[AmazonTranslate::class.java.name] as AmazonTranslate
	set(translate) {
		this.capabilities[AmazonTranslate::class.java.name] = translate
	}

@Generated
class AmazonTranslateFunctions(val block: Block)

infix fun AwsContinuation.translate(init: AmazonTranslateFunctions.() -> Unit) {
	AmazonTranslateFunctions(shell).apply(init)
}

			

fun AmazonTranslateFunctions.translateText(text: String, sourceLanguageCode: String, targetLanguageCode: String, init: AmazonTranslateTranslateTextCommand.() -> Unit) {
	this.block.declare(AmazonTranslateTranslateTextCommand(text, sourceLanguageCode, targetLanguageCode).apply(init))
}

@Generated
class AmazonTranslateTranslateTextCommand(val text: String, val sourceLanguageCode: String, val targetLanguageCode: String) : AmazonWebServiceCommand<com.amazonaws.services.translate.model.TranslateTextRequest> {



	override fun build(): com.amazonaws.services.translate.model.TranslateTextRequest {
		val input = com.amazonaws.services.translate.model.TranslateTextRequest()
		input.setText(this.text)
		input.setSourceLanguageCode(this.sourceLanguageCode)
		input.setTargetLanguageCode(this.targetLanguageCode)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.translate.translateText(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws translate translate-text")
				.argument("text", text)
				.argument("source-language-code", sourceLanguageCode)
				.argument("target-language-code", targetLanguageCode)
	}

}