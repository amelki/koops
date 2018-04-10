
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.polly.AmazonPolly
import com.amazonaws.services.polly.model.*

var codingue.koops.core.Environment.polly: AmazonPolly
	get() = this.capabilities[AmazonPolly::class.java.name] as AmazonPolly
	set(polly) {
		this.capabilities[AmazonPolly::class.java.name] = polly
	}

@Generated
class AmazonPollyFunctions(val block: Block)

infix fun AwsContinuation.polly(init: AmazonPollyFunctions.() -> Unit) {
	AmazonPollyFunctions(shell).apply(init)
}

			

fun AmazonPollyFunctions.deleteLexicon(name: String, init: AmazonPollyDeleteLexiconCommand.() -> Unit) {
	this.block.declare(AmazonPollyDeleteLexiconCommand(name).apply(init))
}

@Generated
class AmazonPollyDeleteLexiconCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.polly.model.DeleteLexiconRequest> {



	override fun build(): com.amazonaws.services.polly.model.DeleteLexiconRequest {
		val input = com.amazonaws.services.polly.model.DeleteLexiconRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.polly.deleteLexicon(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws polly delete-lexicon")
				.argument("name", name)
	}

}


fun AmazonPollyFunctions.describeVoices(init: AmazonPollyDescribeVoicesCommand.() -> Unit) {
	this.block.declare(AmazonPollyDescribeVoicesCommand().apply(init))
}

@Generated
class AmazonPollyDescribeVoicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.polly.model.DescribeVoicesRequest> {

	var languageCode: LanguageCode? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.polly.model.DescribeVoicesRequest {
		val input = com.amazonaws.services.polly.model.DescribeVoicesRequest()
		input.setLanguageCode(this.languageCode?.toString())
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.polly.describeVoices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws polly describe-voices")
				.argument("language-code", languageCode?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonPollyFunctions.getLexicon(name: String, init: AmazonPollyGetLexiconCommand.() -> Unit) {
	this.block.declare(AmazonPollyGetLexiconCommand(name).apply(init))
}

@Generated
class AmazonPollyGetLexiconCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.polly.model.GetLexiconRequest> {



	override fun build(): com.amazonaws.services.polly.model.GetLexiconRequest {
		val input = com.amazonaws.services.polly.model.GetLexiconRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.polly.getLexicon(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws polly get-lexicon")
				.argument("name", name)
	}

}


fun AmazonPollyFunctions.listLexicons(init: AmazonPollyListLexiconsCommand.() -> Unit) {
	this.block.declare(AmazonPollyListLexiconsCommand().apply(init))
}

@Generated
class AmazonPollyListLexiconsCommand() : AmazonWebServiceCommand<com.amazonaws.services.polly.model.ListLexiconsRequest> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.polly.model.ListLexiconsRequest {
		val input = com.amazonaws.services.polly.model.ListLexiconsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.polly.listLexicons(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws polly list-lexicons")
				.argument("next-token", nextToken)
	}

}


fun AmazonPollyFunctions.putLexicon(name: String, content: String, init: AmazonPollyPutLexiconCommand.() -> Unit) {
	this.block.declare(AmazonPollyPutLexiconCommand(name, content).apply(init))
}

@Generated
class AmazonPollyPutLexiconCommand(val name: String, val content: String) : AmazonWebServiceCommand<com.amazonaws.services.polly.model.PutLexiconRequest> {



	override fun build(): com.amazonaws.services.polly.model.PutLexiconRequest {
		val input = com.amazonaws.services.polly.model.PutLexiconRequest()
		input.setName(this.name)
		input.setContent(this.content)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.polly.putLexicon(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws polly put-lexicon")
				.argument("name", name)
				.argument("content", content)
	}

}


fun AmazonPollyFunctions.synthesizeSpeech(outputFormat: OutputFormat, text: String, voiceId: VoiceId, init: AmazonPollySynthesizeSpeechCommand.() -> Unit) {
	this.block.declare(AmazonPollySynthesizeSpeechCommand(outputFormat, text, voiceId).apply(init))
}

@Generated
class AmazonPollySynthesizeSpeechCommand(val outputFormat: OutputFormat, val text: String, val voiceId: VoiceId) : AmazonWebServiceCommand<com.amazonaws.services.polly.model.SynthesizeSpeechRequest> {

	var lexiconNames: List<String>? = null
	var sampleRate: String? = null
	var speechMarkTypes: List<SpeechMarkType>? = null
	var textType: TextType? = null

	override fun build(): com.amazonaws.services.polly.model.SynthesizeSpeechRequest {
		val input = com.amazonaws.services.polly.model.SynthesizeSpeechRequest()
		input.setLexiconNames(this.lexiconNames)
		input.setOutputFormat(this.outputFormat.toString())
		input.setSampleRate(this.sampleRate)
		input.setSpeechMarkTypes(this.speechMarkTypes?.map { it.toString() })
		input.setText(this.text)
		input.setTextType(this.textType?.toString())
		input.setVoiceId(this.voiceId.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.polly.synthesizeSpeech(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws polly synthesize-speech")
				.argument("lexicon-names", lexiconNames?.toString())
				.argument("output-format", outputFormat.toString())
				.argument("sample-rate", sampleRate)
				.argument("speech-mark-types", speechMarkTypes?.toString())
				.argument("text", text)
				.argument("text-type", textType?.toString())
				.argument("voice-id", voiceId.toString())
	}

}
