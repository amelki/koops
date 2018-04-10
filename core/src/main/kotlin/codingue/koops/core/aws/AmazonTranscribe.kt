
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.transcribe.AmazonTranscribe
import com.amazonaws.services.transcribe.model.*

var codingue.koops.core.Environment.transcribe: AmazonTranscribe
	get() = this.capabilities[AmazonTranscribe::class.java.name] as AmazonTranscribe
	set(transcribe) {
		this.capabilities[AmazonTranscribe::class.java.name] = transcribe
	}

@Generated
class AmazonTranscribeFunctions(val block: Block)

infix fun AwsContinuation.transcribe(init: AmazonTranscribeFunctions.() -> Unit) {
	AmazonTranscribeFunctions(shell).apply(init)
}

			

fun AmazonTranscribeFunctions.createVocabulary(vocabularyName: String, languageCode: LanguageCode, phrases: List<String>, init: AmazonTranscribeCreateVocabularyCommand.() -> Unit) {
	this.block.declare(AmazonTranscribeCreateVocabularyCommand(vocabularyName, languageCode, phrases).apply(init))
}

@Generated
class AmazonTranscribeCreateVocabularyCommand(val vocabularyName: String, val languageCode: LanguageCode, val phrases: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.transcribe.model.CreateVocabularyRequest> {



	override fun build(): com.amazonaws.services.transcribe.model.CreateVocabularyRequest {
		val input = com.amazonaws.services.transcribe.model.CreateVocabularyRequest()
		input.setVocabularyName(this.vocabularyName)
		input.setLanguageCode(this.languageCode.toString())
		input.setPhrases(this.phrases)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.transcribe.createVocabulary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws transcribe create-vocabulary")
				.argument("vocabulary-name", vocabularyName)
				.argument("language-code", languageCode.toString())
				.argument("phrases", phrases.toString())
	}

}


fun AmazonTranscribeFunctions.deleteVocabulary(vocabularyName: String, init: AmazonTranscribeDeleteVocabularyCommand.() -> Unit) {
	this.block.declare(AmazonTranscribeDeleteVocabularyCommand(vocabularyName).apply(init))
}

@Generated
class AmazonTranscribeDeleteVocabularyCommand(val vocabularyName: String) : AmazonWebServiceCommand<com.amazonaws.services.transcribe.model.DeleteVocabularyRequest> {



	override fun build(): com.amazonaws.services.transcribe.model.DeleteVocabularyRequest {
		val input = com.amazonaws.services.transcribe.model.DeleteVocabularyRequest()
		input.setVocabularyName(this.vocabularyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.transcribe.deleteVocabulary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws transcribe delete-vocabulary")
				.argument("vocabulary-name", vocabularyName)
	}

}


fun AmazonTranscribeFunctions.getTranscriptionJob(transcriptionJobName: String, init: AmazonTranscribeGetTranscriptionJobCommand.() -> Unit) {
	this.block.declare(AmazonTranscribeGetTranscriptionJobCommand(transcriptionJobName).apply(init))
}

@Generated
class AmazonTranscribeGetTranscriptionJobCommand(val transcriptionJobName: String) : AmazonWebServiceCommand<com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest> {



	override fun build(): com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest {
		val input = com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest()
		input.setTranscriptionJobName(this.transcriptionJobName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.transcribe.getTranscriptionJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws transcribe get-transcription-job")
				.argument("transcription-job-name", transcriptionJobName)
	}

}


fun AmazonTranscribeFunctions.getVocabulary(vocabularyName: String, init: AmazonTranscribeGetVocabularyCommand.() -> Unit) {
	this.block.declare(AmazonTranscribeGetVocabularyCommand(vocabularyName).apply(init))
}

@Generated
class AmazonTranscribeGetVocabularyCommand(val vocabularyName: String) : AmazonWebServiceCommand<com.amazonaws.services.transcribe.model.GetVocabularyRequest> {



	override fun build(): com.amazonaws.services.transcribe.model.GetVocabularyRequest {
		val input = com.amazonaws.services.transcribe.model.GetVocabularyRequest()
		input.setVocabularyName(this.vocabularyName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.transcribe.getVocabulary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws transcribe get-vocabulary")
				.argument("vocabulary-name", vocabularyName)
	}

}


fun AmazonTranscribeFunctions.listTranscriptionJobs(init: AmazonTranscribeListTranscriptionJobsCommand.() -> Unit) {
	this.block.declare(AmazonTranscribeListTranscriptionJobsCommand().apply(init))
}

@Generated
class AmazonTranscribeListTranscriptionJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.transcribe.model.ListTranscriptionJobsRequest> {

	var status: TranscriptionJobStatus? = null
	var jobNameContains: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.transcribe.model.ListTranscriptionJobsRequest {
		val input = com.amazonaws.services.transcribe.model.ListTranscriptionJobsRequest()
		input.setStatus(this.status?.toString())
		input.setJobNameContains(this.jobNameContains)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.transcribe.listTranscriptionJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws transcribe list-transcription-jobs")
				.argument("status", status?.toString())
				.argument("job-name-contains", jobNameContains)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonTranscribeFunctions.listVocabularies(init: AmazonTranscribeListVocabulariesCommand.() -> Unit) {
	this.block.declare(AmazonTranscribeListVocabulariesCommand().apply(init))
}

@Generated
class AmazonTranscribeListVocabulariesCommand() : AmazonWebServiceCommand<com.amazonaws.services.transcribe.model.ListVocabulariesRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var stateEquals: VocabularyState? = null
	var nameContains: String? = null

	override fun build(): com.amazonaws.services.transcribe.model.ListVocabulariesRequest {
		val input = com.amazonaws.services.transcribe.model.ListVocabulariesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setStateEquals(this.stateEquals?.toString())
		input.setNameContains(this.nameContains)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.transcribe.listVocabularies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws transcribe list-vocabularies")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("state-equals", stateEquals?.toString())
				.argument("name-contains", nameContains)
	}

}


fun AmazonTranscribeFunctions.startTranscriptionJob(transcriptionJobName: String, languageCode: LanguageCode, mediaFormat: MediaFormat, media: com.amazonaws.services.transcribe.model.Media, init: AmazonTranscribeStartTranscriptionJobCommand.() -> Unit) {
	this.block.declare(AmazonTranscribeStartTranscriptionJobCommand(transcriptionJobName, languageCode, mediaFormat, media).apply(init))
}

@Generated
class AmazonTranscribeStartTranscriptionJobCommand(val transcriptionJobName: String, val languageCode: LanguageCode, val mediaFormat: MediaFormat, val media: com.amazonaws.services.transcribe.model.Media) : AmazonWebServiceCommand<com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest> {

	var mediaSampleRateHertz: Int? = 0
	var settings: com.amazonaws.services.transcribe.model.Settings? = null

	override fun build(): com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest {
		val input = com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest()
		input.setTranscriptionJobName(this.transcriptionJobName)
		input.setLanguageCode(this.languageCode.toString())
		input.setMediaSampleRateHertz(this.mediaSampleRateHertz)
		input.setMediaFormat(this.mediaFormat.toString())
		input.setMedia(this.media)
		input.setSettings(this.settings)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.transcribe.startTranscriptionJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws transcribe start-transcription-job")
				.argument("transcription-job-name", transcriptionJobName)
				.argument("language-code", languageCode.toString())
				.argument("media-sample-rate-hertz", mediaSampleRateHertz?.toString())
				.argument("media-format", mediaFormat.toString())
				.argument("media", media.toString())
				.argument("settings", settings?.toString())
	}

}


fun AmazonTranscribeFunctions.updateVocabulary(vocabularyName: String, languageCode: LanguageCode, phrases: List<String>, init: AmazonTranscribeUpdateVocabularyCommand.() -> Unit) {
	this.block.declare(AmazonTranscribeUpdateVocabularyCommand(vocabularyName, languageCode, phrases).apply(init))
}

@Generated
class AmazonTranscribeUpdateVocabularyCommand(val vocabularyName: String, val languageCode: LanguageCode, val phrases: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.transcribe.model.UpdateVocabularyRequest> {



	override fun build(): com.amazonaws.services.transcribe.model.UpdateVocabularyRequest {
		val input = com.amazonaws.services.transcribe.model.UpdateVocabularyRequest()
		input.setVocabularyName(this.vocabularyName)
		input.setLanguageCode(this.languageCode.toString())
		input.setPhrases(this.phrases)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.transcribe.updateVocabulary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws transcribe update-vocabulary")
				.argument("vocabulary-name", vocabularyName)
				.argument("language-code", languageCode.toString())
				.argument("phrases", phrases.toString())
	}

}
