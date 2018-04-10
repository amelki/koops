
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.comprehend.AmazonComprehend
import com.amazonaws.services.comprehend.model.*

var codingue.koops.core.Environment.comprehend: AmazonComprehend
	get() = this.capabilities[AmazonComprehend::class.java.name] as AmazonComprehend
	set(comprehend) {
		this.capabilities[AmazonComprehend::class.java.name] = comprehend
	}

@Generated
class AmazonComprehendFunctions(val block: Block)

infix fun AwsContinuation.comprehend(init: AmazonComprehendFunctions.() -> Unit) {
	AmazonComprehendFunctions(shell).apply(init)
}

			

fun AmazonComprehendFunctions.batchDetectDominantLanguage(textList: List<String>, init: AmazonComprehendBatchDetectDominantLanguageCommand.() -> Unit) {
	this.block.declare(AmazonComprehendBatchDetectDominantLanguageCommand(textList).apply(init))
}

@Generated
class AmazonComprehendBatchDetectDominantLanguageCommand(val textList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest> {



	override fun build(): com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest {
		val input = com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest()
		input.setTextList(this.textList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.comprehend.batchDetectDominantLanguage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend batch-detect-dominant-language")
				.argument("text-list", textList.toString())
	}

}


fun AmazonComprehendFunctions.batchDetectEntities(textList: List<String>, languageCode: String, init: AmazonComprehendBatchDetectEntitiesCommand.() -> Unit) {
	this.block.declare(AmazonComprehendBatchDetectEntitiesCommand(textList, languageCode).apply(init))
}

@Generated
class AmazonComprehendBatchDetectEntitiesCommand(val textList: List<String>, val languageCode: String) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest> {



	override fun build(): com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest {
		val input = com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest()
		input.setTextList(this.textList)
		input.setLanguageCode(this.languageCode)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.comprehend.batchDetectEntities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend batch-detect-entities")
				.argument("text-list", textList.toString())
				.argument("language-code", languageCode)
	}

}


fun AmazonComprehendFunctions.batchDetectKeyPhrases(textList: List<String>, languageCode: String, init: AmazonComprehendBatchDetectKeyPhrasesCommand.() -> Unit) {
	this.block.declare(AmazonComprehendBatchDetectKeyPhrasesCommand(textList, languageCode).apply(init))
}

@Generated
class AmazonComprehendBatchDetectKeyPhrasesCommand(val textList: List<String>, val languageCode: String) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest> {



	override fun build(): com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest {
		val input = com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest()
		input.setTextList(this.textList)
		input.setLanguageCode(this.languageCode)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.comprehend.batchDetectKeyPhrases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend batch-detect-key-phrases")
				.argument("text-list", textList.toString())
				.argument("language-code", languageCode)
	}

}


fun AmazonComprehendFunctions.batchDetectSentiment(textList: List<String>, languageCode: String, init: AmazonComprehendBatchDetectSentimentCommand.() -> Unit) {
	this.block.declare(AmazonComprehendBatchDetectSentimentCommand(textList, languageCode).apply(init))
}

@Generated
class AmazonComprehendBatchDetectSentimentCommand(val textList: List<String>, val languageCode: String) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest> {



	override fun build(): com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest {
		val input = com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest()
		input.setTextList(this.textList)
		input.setLanguageCode(this.languageCode)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.comprehend.batchDetectSentiment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend batch-detect-sentiment")
				.argument("text-list", textList.toString())
				.argument("language-code", languageCode)
	}

}


fun AmazonComprehendFunctions.describeTopicsDetectionJob(jobId: String, init: AmazonComprehendDescribeTopicsDetectionJobCommand.() -> Unit) {
	this.block.declare(AmazonComprehendDescribeTopicsDetectionJobCommand(jobId).apply(init))
}

@Generated
class AmazonComprehendDescribeTopicsDetectionJobCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest> {



	override fun build(): com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest {
		val input = com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest()
		input.setJobId(this.jobId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.comprehend.describeTopicsDetectionJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend describe-topics-detection-job")
				.argument("job-id", jobId)
	}

}


fun AmazonComprehendFunctions.detectDominantLanguage(text: String, init: AmazonComprehendDetectDominantLanguageCommand.() -> Unit) {
	this.block.declare(AmazonComprehendDetectDominantLanguageCommand(text).apply(init))
}

@Generated
class AmazonComprehendDetectDominantLanguageCommand(val text: String) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest> {



	override fun build(): com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest {
		val input = com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest()
		input.setText(this.text)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.comprehend.detectDominantLanguage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend detect-dominant-language")
				.argument("text", text)
	}

}


fun AmazonComprehendFunctions.detectEntities(text: String, languageCode: LanguageCode, init: AmazonComprehendDetectEntitiesCommand.() -> Unit) {
	this.block.declare(AmazonComprehendDetectEntitiesCommand(text, languageCode).apply(init))
}

@Generated
class AmazonComprehendDetectEntitiesCommand(val text: String, val languageCode: LanguageCode) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.DetectEntitiesRequest> {



	override fun build(): com.amazonaws.services.comprehend.model.DetectEntitiesRequest {
		val input = com.amazonaws.services.comprehend.model.DetectEntitiesRequest()
		input.setText(this.text)
		input.setLanguageCode(this.languageCode.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.comprehend.detectEntities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend detect-entities")
				.argument("text", text)
				.argument("language-code", languageCode.toString())
	}

}


fun AmazonComprehendFunctions.detectKeyPhrases(text: String, languageCode: LanguageCode, init: AmazonComprehendDetectKeyPhrasesCommand.() -> Unit) {
	this.block.declare(AmazonComprehendDetectKeyPhrasesCommand(text, languageCode).apply(init))
}

@Generated
class AmazonComprehendDetectKeyPhrasesCommand(val text: String, val languageCode: LanguageCode) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest> {



	override fun build(): com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest {
		val input = com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest()
		input.setText(this.text)
		input.setLanguageCode(this.languageCode.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.comprehend.detectKeyPhrases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend detect-key-phrases")
				.argument("text", text)
				.argument("language-code", languageCode.toString())
	}

}


fun AmazonComprehendFunctions.detectSentiment(text: String, languageCode: LanguageCode, init: AmazonComprehendDetectSentimentCommand.() -> Unit) {
	this.block.declare(AmazonComprehendDetectSentimentCommand(text, languageCode).apply(init))
}

@Generated
class AmazonComprehendDetectSentimentCommand(val text: String, val languageCode: LanguageCode) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.DetectSentimentRequest> {



	override fun build(): com.amazonaws.services.comprehend.model.DetectSentimentRequest {
		val input = com.amazonaws.services.comprehend.model.DetectSentimentRequest()
		input.setText(this.text)
		input.setLanguageCode(this.languageCode.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.comprehend.detectSentiment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend detect-sentiment")
				.argument("text", text)
				.argument("language-code", languageCode.toString())
	}

}


fun AmazonComprehendFunctions.listTopicsDetectionJobs(init: AmazonComprehendListTopicsDetectionJobsCommand.() -> Unit) {
	this.block.declare(AmazonComprehendListTopicsDetectionJobsCommand().apply(init))
}

@Generated
class AmazonComprehendListTopicsDetectionJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsRequest> {

	var filter: com.amazonaws.services.comprehend.model.TopicsDetectionJobFilter? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsRequest {
		val input = com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsRequest()
		input.setFilter(this.filter)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.comprehend.listTopicsDetectionJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend list-topics-detection-jobs")
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonComprehendFunctions.startTopicsDetectionJob(inputDataConfig: com.amazonaws.services.comprehend.model.InputDataConfig, outputDataConfig: com.amazonaws.services.comprehend.model.OutputDataConfig, dataAccessRoleArn: String, init: AmazonComprehendStartTopicsDetectionJobCommand.() -> Unit) {
	this.block.declare(AmazonComprehendStartTopicsDetectionJobCommand(inputDataConfig, outputDataConfig, dataAccessRoleArn).apply(init))
}

@Generated
class AmazonComprehendStartTopicsDetectionJobCommand(val inputDataConfig: com.amazonaws.services.comprehend.model.InputDataConfig, val outputDataConfig: com.amazonaws.services.comprehend.model.OutputDataConfig, val dataAccessRoleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.StartTopicsDetectionJobRequest> {

	var jobName: String? = null
	var numberOfTopics: Int? = 0
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.comprehend.model.StartTopicsDetectionJobRequest {
		val input = com.amazonaws.services.comprehend.model.StartTopicsDetectionJobRequest()
		input.setInputDataConfig(this.inputDataConfig)
		input.setOutputDataConfig(this.outputDataConfig)
		input.setDataAccessRoleArn(this.dataAccessRoleArn)
		input.setJobName(this.jobName)
		input.setNumberOfTopics(this.numberOfTopics)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.comprehend.startTopicsDetectionJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend start-topics-detection-job")
				.argument("input-data-config", inputDataConfig.toString())
				.argument("output-data-config", outputDataConfig.toString())
				.argument("data-access-role-arn", dataAccessRoleArn)
				.argument("job-name", jobName)
				.argument("number-of-topics", numberOfTopics?.toString())
				.argument("client-request-token", clientRequestToken)
	}

}
