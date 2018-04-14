
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws.polly

import javax.annotation.Generated
import codingue.koops.core.*
import codingue.koops.aws.*
import com.amazonaws.services.polly.*
import com.amazonaws.services.polly.model.*

var codingue.koops.core.Environment.polly: AmazonPolly
	get() {
		var service = this.capabilities["aws-polly"]
		if (service == null) {
			service = AmazonPollyClientBuilder.standard().build()
			this.capabilities["aws-polly"] = service
		}
		return service as AmazonPolly
	}
	set(polly) {
		this.capabilities["aws-polly"] = polly
	}

@Generated
class AmazonPollyFunctions(val block: Block)

infix fun <T> AwsContinuation.polly(init: AmazonPollyFunctions.() -> T): T {
	return AmazonPollyFunctions(shell).run(init)
}

			

fun AmazonPollyFunctions.deleteLexicon(name: String, init: AmazonPollyDeleteLexiconCommand.() -> Unit): com.amazonaws.services.polly.model.DeleteLexiconResult {
	return this.block.declare(AmazonPollyDeleteLexiconCommand(name).apply(init)) as com.amazonaws.services.polly.model.DeleteLexiconResult
}

@Generated
class AmazonPollyDeleteLexiconCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.polly.model.DeleteLexiconRequest, com.amazonaws.services.polly.model.DeleteLexiconResult> {



	override fun build(): com.amazonaws.services.polly.model.DeleteLexiconRequest {
		val input = com.amazonaws.services.polly.model.DeleteLexiconRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.polly.model.DeleteLexiconResult {
	  return com.amazonaws.services.polly.model.DeleteLexiconResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.polly.model.DeleteLexiconResult {
		return environment.polly.deleteLexicon(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws polly delete-lexicon")
				.argument("name", name)
	}

}


fun AmazonPollyFunctions.describeVoices(init: AmazonPollyDescribeVoicesCommand.() -> Unit): com.amazonaws.services.polly.model.DescribeVoicesResult {
	return this.block.declare(AmazonPollyDescribeVoicesCommand().apply(init)) as com.amazonaws.services.polly.model.DescribeVoicesResult
}

@Generated
class AmazonPollyDescribeVoicesCommand() : AmazonWebServiceCommand<com.amazonaws.services.polly.model.DescribeVoicesRequest, com.amazonaws.services.polly.model.DescribeVoicesResult> {

	var languageCode: LanguageCode? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.polly.model.DescribeVoicesRequest {
		val input = com.amazonaws.services.polly.model.DescribeVoicesRequest()
		input.setLanguageCode(this.languageCode?.toString())
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.polly.model.DescribeVoicesResult {
	  return com.amazonaws.services.polly.model.DescribeVoicesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.polly.model.DescribeVoicesResult {
		return environment.polly.describeVoices(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws polly describe-voices")
				.argument("language-code", languageCode?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonPollyFunctions.getLexicon(name: String, init: AmazonPollyGetLexiconCommand.() -> Unit): com.amazonaws.services.polly.model.GetLexiconResult {
	return this.block.declare(AmazonPollyGetLexiconCommand(name).apply(init)) as com.amazonaws.services.polly.model.GetLexiconResult
}

@Generated
class AmazonPollyGetLexiconCommand(val name: String) : AmazonWebServiceCommand<com.amazonaws.services.polly.model.GetLexiconRequest, com.amazonaws.services.polly.model.GetLexiconResult> {



	override fun build(): com.amazonaws.services.polly.model.GetLexiconRequest {
		val input = com.amazonaws.services.polly.model.GetLexiconRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.polly.model.GetLexiconResult {
	  return com.amazonaws.services.polly.model.GetLexiconResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.polly.model.GetLexiconResult {
		return environment.polly.getLexicon(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws polly get-lexicon")
				.argument("name", name)
	}

}


fun AmazonPollyFunctions.listLexicons(init: AmazonPollyListLexiconsCommand.() -> Unit): com.amazonaws.services.polly.model.ListLexiconsResult {
	return this.block.declare(AmazonPollyListLexiconsCommand().apply(init)) as com.amazonaws.services.polly.model.ListLexiconsResult
}

@Generated
class AmazonPollyListLexiconsCommand() : AmazonWebServiceCommand<com.amazonaws.services.polly.model.ListLexiconsRequest, com.amazonaws.services.polly.model.ListLexiconsResult> {

	var nextToken: String? = null

	override fun build(): com.amazonaws.services.polly.model.ListLexiconsRequest {
		val input = com.amazonaws.services.polly.model.ListLexiconsRequest()
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.polly.model.ListLexiconsResult {
	  return com.amazonaws.services.polly.model.ListLexiconsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.polly.model.ListLexiconsResult {
		return environment.polly.listLexicons(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws polly list-lexicons")
				.argument("next-token", nextToken)
	}

}


fun AmazonPollyFunctions.putLexicon(name: String, content: String, init: AmazonPollyPutLexiconCommand.() -> Unit): com.amazonaws.services.polly.model.PutLexiconResult {
	return this.block.declare(AmazonPollyPutLexiconCommand(name, content).apply(init)) as com.amazonaws.services.polly.model.PutLexiconResult
}

@Generated
class AmazonPollyPutLexiconCommand(val name: String, val content: String) : AmazonWebServiceCommand<com.amazonaws.services.polly.model.PutLexiconRequest, com.amazonaws.services.polly.model.PutLexiconResult> {



	override fun build(): com.amazonaws.services.polly.model.PutLexiconRequest {
		val input = com.amazonaws.services.polly.model.PutLexiconRequest()
		input.setName(this.name)
		input.setContent(this.content)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.polly.model.PutLexiconResult {
	  return com.amazonaws.services.polly.model.PutLexiconResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.polly.model.PutLexiconResult {
		return environment.polly.putLexicon(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws polly put-lexicon")
				.argument("name", name)
				.argument("content", content)
	}

}


fun AmazonPollyFunctions.synthesizeSpeech(outputFormat: OutputFormat, text: String, voiceId: VoiceId, init: AmazonPollySynthesizeSpeechCommand.() -> Unit): com.amazonaws.services.polly.model.SynthesizeSpeechResult {
	return this.block.declare(AmazonPollySynthesizeSpeechCommand(outputFormat, text, voiceId).apply(init)) as com.amazonaws.services.polly.model.SynthesizeSpeechResult
}

@Generated
class AmazonPollySynthesizeSpeechCommand(val outputFormat: OutputFormat, val text: String, val voiceId: VoiceId) : AmazonWebServiceCommand<com.amazonaws.services.polly.model.SynthesizeSpeechRequest, com.amazonaws.services.polly.model.SynthesizeSpeechResult> {

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

	
	override fun dryResult(): com.amazonaws.services.polly.model.SynthesizeSpeechResult {
	  return com.amazonaws.services.polly.model.SynthesizeSpeechResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.polly.model.SynthesizeSpeechResult {
		return environment.polly.synthesizeSpeech(build())
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
