
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.transcribe

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.transcribe.*
import com.amazonaws.services.transcribe.model.*

var com.codingue.koops.core.Environment.transcribe: AmazonTranscribe
	get() {
		var service = this.capabilities["aws-transcribe"]
		if (service == null) {
			service = AmazonTranscribeClientBuilder.standard().build()
			this.capabilities["aws-transcribe"] = service
		}
		return service as AmazonTranscribe
	}
	set(transcribe) {
		this.capabilities["aws-transcribe"] = transcribe
	}

@Generated
class AmazonTranscribeFunctions(val block: Script)

infix fun <T> AwsContinuation.transcribe(init: AmazonTranscribeFunctions.() -> T): T {
	return AmazonTranscribeFunctions(shell).run(init)
}

			

fun AmazonTranscribeFunctions.createVocabulary(vocabularyName: String, languageCode: LanguageCode, phrases: List<String>, init: (AmazonTranscribeCreateVocabularyCommand.() -> Unit)? = null): com.amazonaws.services.transcribe.model.CreateVocabularyResult {
	return this.block.declare(AmazonTranscribeCreateVocabularyCommand(vocabularyName, languageCode, phrases).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.transcribe.model.CreateVocabularyResult
}

@Generated
class AmazonTranscribeCreateVocabularyCommand(val vocabularyName: String, val languageCode: LanguageCode, val phrases: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.transcribe.model.CreateVocabularyRequest, com.amazonaws.services.transcribe.model.CreateVocabularyResult> {



	override fun build(): com.amazonaws.services.transcribe.model.CreateVocabularyRequest {
		val input = com.amazonaws.services.transcribe.model.CreateVocabularyRequest()
		input.setVocabularyName(this.vocabularyName)
		input.setLanguageCode(this.languageCode.toString())
		input.setPhrases(this.phrases)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.transcribe.model.CreateVocabularyResult {
	  return com.amazonaws.services.transcribe.model.CreateVocabularyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.transcribe.model.CreateVocabularyResult {
		return environment.transcribe.createVocabulary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws transcribe create-vocabulary")
				.argument("vocabulary-name", vocabularyName)
				.argument("language-code", languageCode.toString())
				.argument("phrases", phrases.toString())
	}

}


fun AmazonTranscribeFunctions.deleteVocabulary(vocabularyName: String, init: (AmazonTranscribeDeleteVocabularyCommand.() -> Unit)? = null): com.amazonaws.services.transcribe.model.DeleteVocabularyResult {
	return this.block.declare(AmazonTranscribeDeleteVocabularyCommand(vocabularyName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.transcribe.model.DeleteVocabularyResult
}

@Generated
class AmazonTranscribeDeleteVocabularyCommand(val vocabularyName: String) : AmazonWebServiceCommand<com.amazonaws.services.transcribe.model.DeleteVocabularyRequest, com.amazonaws.services.transcribe.model.DeleteVocabularyResult> {



	override fun build(): com.amazonaws.services.transcribe.model.DeleteVocabularyRequest {
		val input = com.amazonaws.services.transcribe.model.DeleteVocabularyRequest()
		input.setVocabularyName(this.vocabularyName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.transcribe.model.DeleteVocabularyResult {
	  return com.amazonaws.services.transcribe.model.DeleteVocabularyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.transcribe.model.DeleteVocabularyResult {
		return environment.transcribe.deleteVocabulary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws transcribe delete-vocabulary")
				.argument("vocabulary-name", vocabularyName)
	}

}


fun AmazonTranscribeFunctions.getTranscriptionJob(transcriptionJobName: String, init: (AmazonTranscribeGetTranscriptionJobCommand.() -> Unit)? = null): com.amazonaws.services.transcribe.model.GetTranscriptionJobResult {
	return this.block.declare(AmazonTranscribeGetTranscriptionJobCommand(transcriptionJobName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.transcribe.model.GetTranscriptionJobResult
}

@Generated
class AmazonTranscribeGetTranscriptionJobCommand(val transcriptionJobName: String) : AmazonWebServiceCommand<com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest, com.amazonaws.services.transcribe.model.GetTranscriptionJobResult> {



	override fun build(): com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest {
		val input = com.amazonaws.services.transcribe.model.GetTranscriptionJobRequest()
		input.setTranscriptionJobName(this.transcriptionJobName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.transcribe.model.GetTranscriptionJobResult {
	  return com.amazonaws.services.transcribe.model.GetTranscriptionJobResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.transcribe.model.GetTranscriptionJobResult {
		return environment.transcribe.getTranscriptionJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws transcribe get-transcription-job")
				.argument("transcription-job-name", transcriptionJobName)
	}

}


fun AmazonTranscribeFunctions.getVocabulary(vocabularyName: String, init: (AmazonTranscribeGetVocabularyCommand.() -> Unit)? = null): com.amazonaws.services.transcribe.model.GetVocabularyResult {
	return this.block.declare(AmazonTranscribeGetVocabularyCommand(vocabularyName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.transcribe.model.GetVocabularyResult
}

@Generated
class AmazonTranscribeGetVocabularyCommand(val vocabularyName: String) : AmazonWebServiceCommand<com.amazonaws.services.transcribe.model.GetVocabularyRequest, com.amazonaws.services.transcribe.model.GetVocabularyResult> {



	override fun build(): com.amazonaws.services.transcribe.model.GetVocabularyRequest {
		val input = com.amazonaws.services.transcribe.model.GetVocabularyRequest()
		input.setVocabularyName(this.vocabularyName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.transcribe.model.GetVocabularyResult {
	  return com.amazonaws.services.transcribe.model.GetVocabularyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.transcribe.model.GetVocabularyResult {
		return environment.transcribe.getVocabulary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws transcribe get-vocabulary")
				.argument("vocabulary-name", vocabularyName)
	}

}


fun AmazonTranscribeFunctions.listTranscriptionJobs(init: (AmazonTranscribeListTranscriptionJobsCommand.() -> Unit)? = null): com.amazonaws.services.transcribe.model.ListTranscriptionJobsResult {
	return this.block.declare(AmazonTranscribeListTranscriptionJobsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.transcribe.model.ListTranscriptionJobsResult
}

@Generated
class AmazonTranscribeListTranscriptionJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.transcribe.model.ListTranscriptionJobsRequest, com.amazonaws.services.transcribe.model.ListTranscriptionJobsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.transcribe.model.ListTranscriptionJobsResult {
	  return com.amazonaws.services.transcribe.model.ListTranscriptionJobsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.transcribe.model.ListTranscriptionJobsResult {
		return environment.transcribe.listTranscriptionJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws transcribe list-transcription-jobs")
				.argument("status", status?.toString())
				.argument("job-name-contains", jobNameContains)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonTranscribeFunctions.listVocabularies(init: (AmazonTranscribeListVocabulariesCommand.() -> Unit)? = null): com.amazonaws.services.transcribe.model.ListVocabulariesResult {
	return this.block.declare(AmazonTranscribeListVocabulariesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.transcribe.model.ListVocabulariesResult
}

@Generated
class AmazonTranscribeListVocabulariesCommand() : AmazonWebServiceCommand<com.amazonaws.services.transcribe.model.ListVocabulariesRequest, com.amazonaws.services.transcribe.model.ListVocabulariesResult> {

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

	
	override fun dryResult(): com.amazonaws.services.transcribe.model.ListVocabulariesResult {
	  return com.amazonaws.services.transcribe.model.ListVocabulariesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.transcribe.model.ListVocabulariesResult {
		return environment.transcribe.listVocabularies(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws transcribe list-vocabularies")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("state-equals", stateEquals?.toString())
				.argument("name-contains", nameContains)
	}

}


fun AmazonTranscribeFunctions.startTranscriptionJob(transcriptionJobName: String, languageCode: LanguageCode, mediaFormat: MediaFormat, media: com.amazonaws.services.transcribe.model.Media, init: (AmazonTranscribeStartTranscriptionJobCommand.() -> Unit)? = null): com.amazonaws.services.transcribe.model.StartTranscriptionJobResult {
	return this.block.declare(AmazonTranscribeStartTranscriptionJobCommand(transcriptionJobName, languageCode, mediaFormat, media).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.transcribe.model.StartTranscriptionJobResult
}

@Generated
class AmazonTranscribeStartTranscriptionJobCommand(val transcriptionJobName: String, val languageCode: LanguageCode, val mediaFormat: MediaFormat, val media: com.amazonaws.services.transcribe.model.Media) : AmazonWebServiceCommand<com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest, com.amazonaws.services.transcribe.model.StartTranscriptionJobResult> {

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

	
	override fun dryResult(): com.amazonaws.services.transcribe.model.StartTranscriptionJobResult {
	  return com.amazonaws.services.transcribe.model.StartTranscriptionJobResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.transcribe.model.StartTranscriptionJobResult {
		return environment.transcribe.startTranscriptionJob(build())
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


fun AmazonTranscribeFunctions.updateVocabulary(vocabularyName: String, languageCode: LanguageCode, phrases: List<String>, init: (AmazonTranscribeUpdateVocabularyCommand.() -> Unit)? = null): com.amazonaws.services.transcribe.model.UpdateVocabularyResult {
	return this.block.declare(AmazonTranscribeUpdateVocabularyCommand(vocabularyName, languageCode, phrases).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.transcribe.model.UpdateVocabularyResult
}

@Generated
class AmazonTranscribeUpdateVocabularyCommand(val vocabularyName: String, val languageCode: LanguageCode, val phrases: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.transcribe.model.UpdateVocabularyRequest, com.amazonaws.services.transcribe.model.UpdateVocabularyResult> {



	override fun build(): com.amazonaws.services.transcribe.model.UpdateVocabularyRequest {
		val input = com.amazonaws.services.transcribe.model.UpdateVocabularyRequest()
		input.setVocabularyName(this.vocabularyName)
		input.setLanguageCode(this.languageCode.toString())
		input.setPhrases(this.phrases)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.transcribe.model.UpdateVocabularyResult {
	  return com.amazonaws.services.transcribe.model.UpdateVocabularyResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.transcribe.model.UpdateVocabularyResult {
		return environment.transcribe.updateVocabulary(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws transcribe update-vocabulary")
				.argument("vocabulary-name", vocabularyName)
				.argument("language-code", languageCode.toString())
				.argument("phrases", phrases.toString())
	}

}
