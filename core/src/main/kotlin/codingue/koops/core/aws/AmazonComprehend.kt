
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

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

infix fun <T> AwsContinuation.comprehend(init: AmazonComprehendFunctions.() -> T): T {
	return AmazonComprehendFunctions(shell).run(init)
}

			

fun AmazonComprehendFunctions.batchDetectDominantLanguage(textList: List<String>, init: AmazonComprehendBatchDetectDominantLanguageCommand.() -> Unit): com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageResult {
	return this.block.declare(AmazonComprehendBatchDetectDominantLanguageCommand(textList).apply(init)) as com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageResult
}

@Generated
class AmazonComprehendBatchDetectDominantLanguageCommand(val textList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest, com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageResult> {



	override fun build(): com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest {
		val input = com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageRequest()
		input.setTextList(this.textList)
		return input
	}

	override fun dryResult(): com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageResult {
	  return com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.comprehend.model.BatchDetectDominantLanguageResult {
		return environment.comprehend.batchDetectDominantLanguage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend batch-detect-dominant-language")
				.argument("text-list", textList.toString())
	}

}


fun AmazonComprehendFunctions.batchDetectEntities(textList: List<String>, languageCode: String, init: AmazonComprehendBatchDetectEntitiesCommand.() -> Unit): com.amazonaws.services.comprehend.model.BatchDetectEntitiesResult {
	return this.block.declare(AmazonComprehendBatchDetectEntitiesCommand(textList, languageCode).apply(init)) as com.amazonaws.services.comprehend.model.BatchDetectEntitiesResult
}

@Generated
class AmazonComprehendBatchDetectEntitiesCommand(val textList: List<String>, val languageCode: String) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest, com.amazonaws.services.comprehend.model.BatchDetectEntitiesResult> {



	override fun build(): com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest {
		val input = com.amazonaws.services.comprehend.model.BatchDetectEntitiesRequest()
		input.setTextList(this.textList)
		input.setLanguageCode(this.languageCode)
		return input
	}

	override fun dryResult(): com.amazonaws.services.comprehend.model.BatchDetectEntitiesResult {
	  return com.amazonaws.services.comprehend.model.BatchDetectEntitiesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.comprehend.model.BatchDetectEntitiesResult {
		return environment.comprehend.batchDetectEntities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend batch-detect-entities")
				.argument("text-list", textList.toString())
				.argument("language-code", languageCode)
	}

}


fun AmazonComprehendFunctions.batchDetectKeyPhrases(textList: List<String>, languageCode: String, init: AmazonComprehendBatchDetectKeyPhrasesCommand.() -> Unit): com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesResult {
	return this.block.declare(AmazonComprehendBatchDetectKeyPhrasesCommand(textList, languageCode).apply(init)) as com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesResult
}

@Generated
class AmazonComprehendBatchDetectKeyPhrasesCommand(val textList: List<String>, val languageCode: String) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest, com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesResult> {



	override fun build(): com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest {
		val input = com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesRequest()
		input.setTextList(this.textList)
		input.setLanguageCode(this.languageCode)
		return input
	}

	override fun dryResult(): com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesResult {
	  return com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.comprehend.model.BatchDetectKeyPhrasesResult {
		return environment.comprehend.batchDetectKeyPhrases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend batch-detect-key-phrases")
				.argument("text-list", textList.toString())
				.argument("language-code", languageCode)
	}

}


fun AmazonComprehendFunctions.batchDetectSentiment(textList: List<String>, languageCode: String, init: AmazonComprehendBatchDetectSentimentCommand.() -> Unit): com.amazonaws.services.comprehend.model.BatchDetectSentimentResult {
	return this.block.declare(AmazonComprehendBatchDetectSentimentCommand(textList, languageCode).apply(init)) as com.amazonaws.services.comprehend.model.BatchDetectSentimentResult
}

@Generated
class AmazonComprehendBatchDetectSentimentCommand(val textList: List<String>, val languageCode: String) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest, com.amazonaws.services.comprehend.model.BatchDetectSentimentResult> {



	override fun build(): com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest {
		val input = com.amazonaws.services.comprehend.model.BatchDetectSentimentRequest()
		input.setTextList(this.textList)
		input.setLanguageCode(this.languageCode)
		return input
	}

	override fun dryResult(): com.amazonaws.services.comprehend.model.BatchDetectSentimentResult {
	  return com.amazonaws.services.comprehend.model.BatchDetectSentimentResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.comprehend.model.BatchDetectSentimentResult {
		return environment.comprehend.batchDetectSentiment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend batch-detect-sentiment")
				.argument("text-list", textList.toString())
				.argument("language-code", languageCode)
	}

}


fun AmazonComprehendFunctions.describeTopicsDetectionJob(jobId: String, init: AmazonComprehendDescribeTopicsDetectionJobCommand.() -> Unit): com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobResult {
	return this.block.declare(AmazonComprehendDescribeTopicsDetectionJobCommand(jobId).apply(init)) as com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobResult
}

@Generated
class AmazonComprehendDescribeTopicsDetectionJobCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest, com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobResult> {



	override fun build(): com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest {
		val input = com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobRequest()
		input.setJobId(this.jobId)
		return input
	}

	override fun dryResult(): com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobResult {
	  return com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.comprehend.model.DescribeTopicsDetectionJobResult {
		return environment.comprehend.describeTopicsDetectionJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend describe-topics-detection-job")
				.argument("job-id", jobId)
	}

}


fun AmazonComprehendFunctions.detectDominantLanguage(text: String, init: AmazonComprehendDetectDominantLanguageCommand.() -> Unit): com.amazonaws.services.comprehend.model.DetectDominantLanguageResult {
	return this.block.declare(AmazonComprehendDetectDominantLanguageCommand(text).apply(init)) as com.amazonaws.services.comprehend.model.DetectDominantLanguageResult
}

@Generated
class AmazonComprehendDetectDominantLanguageCommand(val text: String) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest, com.amazonaws.services.comprehend.model.DetectDominantLanguageResult> {



	override fun build(): com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest {
		val input = com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest()
		input.setText(this.text)
		return input
	}

	override fun dryResult(): com.amazonaws.services.comprehend.model.DetectDominantLanguageResult {
	  return com.amazonaws.services.comprehend.model.DetectDominantLanguageResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.comprehend.model.DetectDominantLanguageResult {
		return environment.comprehend.detectDominantLanguage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend detect-dominant-language")
				.argument("text", text)
	}

}


fun AmazonComprehendFunctions.detectEntities(text: String, languageCode: LanguageCode, init: AmazonComprehendDetectEntitiesCommand.() -> Unit): com.amazonaws.services.comprehend.model.DetectEntitiesResult {
	return this.block.declare(AmazonComprehendDetectEntitiesCommand(text, languageCode).apply(init)) as com.amazonaws.services.comprehend.model.DetectEntitiesResult
}

@Generated
class AmazonComprehendDetectEntitiesCommand(val text: String, val languageCode: LanguageCode) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.DetectEntitiesRequest, com.amazonaws.services.comprehend.model.DetectEntitiesResult> {



	override fun build(): com.amazonaws.services.comprehend.model.DetectEntitiesRequest {
		val input = com.amazonaws.services.comprehend.model.DetectEntitiesRequest()
		input.setText(this.text)
		input.setLanguageCode(this.languageCode.toString())
		return input
	}

	override fun dryResult(): com.amazonaws.services.comprehend.model.DetectEntitiesResult {
	  return com.amazonaws.services.comprehend.model.DetectEntitiesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.comprehend.model.DetectEntitiesResult {
		return environment.comprehend.detectEntities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend detect-entities")
				.argument("text", text)
				.argument("language-code", languageCode.toString())
	}

}


fun AmazonComprehendFunctions.detectKeyPhrases(text: String, languageCode: LanguageCode, init: AmazonComprehendDetectKeyPhrasesCommand.() -> Unit): com.amazonaws.services.comprehend.model.DetectKeyPhrasesResult {
	return this.block.declare(AmazonComprehendDetectKeyPhrasesCommand(text, languageCode).apply(init)) as com.amazonaws.services.comprehend.model.DetectKeyPhrasesResult
}

@Generated
class AmazonComprehendDetectKeyPhrasesCommand(val text: String, val languageCode: LanguageCode) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest, com.amazonaws.services.comprehend.model.DetectKeyPhrasesResult> {



	override fun build(): com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest {
		val input = com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest()
		input.setText(this.text)
		input.setLanguageCode(this.languageCode.toString())
		return input
	}

	override fun dryResult(): com.amazonaws.services.comprehend.model.DetectKeyPhrasesResult {
	  return com.amazonaws.services.comprehend.model.DetectKeyPhrasesResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.comprehend.model.DetectKeyPhrasesResult {
		return environment.comprehend.detectKeyPhrases(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend detect-key-phrases")
				.argument("text", text)
				.argument("language-code", languageCode.toString())
	}

}


fun AmazonComprehendFunctions.detectSentiment(text: String, languageCode: LanguageCode, init: AmazonComprehendDetectSentimentCommand.() -> Unit): com.amazonaws.services.comprehend.model.DetectSentimentResult {
	return this.block.declare(AmazonComprehendDetectSentimentCommand(text, languageCode).apply(init)) as com.amazonaws.services.comprehend.model.DetectSentimentResult
}

@Generated
class AmazonComprehendDetectSentimentCommand(val text: String, val languageCode: LanguageCode) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.DetectSentimentRequest, com.amazonaws.services.comprehend.model.DetectSentimentResult> {



	override fun build(): com.amazonaws.services.comprehend.model.DetectSentimentRequest {
		val input = com.amazonaws.services.comprehend.model.DetectSentimentRequest()
		input.setText(this.text)
		input.setLanguageCode(this.languageCode.toString())
		return input
	}

	override fun dryResult(): com.amazonaws.services.comprehend.model.DetectSentimentResult {
	  return com.amazonaws.services.comprehend.model.DetectSentimentResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.comprehend.model.DetectSentimentResult {
		return environment.comprehend.detectSentiment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend detect-sentiment")
				.argument("text", text)
				.argument("language-code", languageCode.toString())
	}

}


fun AmazonComprehendFunctions.listTopicsDetectionJobs(init: AmazonComprehendListTopicsDetectionJobsCommand.() -> Unit): com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsResult {
	return this.block.declare(AmazonComprehendListTopicsDetectionJobsCommand().apply(init)) as com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsResult
}

@Generated
class AmazonComprehendListTopicsDetectionJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsRequest, com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsResult> {

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

	override fun dryResult(): com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsResult {
	  return com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.comprehend.model.ListTopicsDetectionJobsResult {
		return environment.comprehend.listTopicsDetectionJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws comprehend list-topics-detection-jobs")
				.argument("filter", filter?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonComprehendFunctions.startTopicsDetectionJob(inputDataConfig: com.amazonaws.services.comprehend.model.InputDataConfig, outputDataConfig: com.amazonaws.services.comprehend.model.OutputDataConfig, dataAccessRoleArn: String, init: AmazonComprehendStartTopicsDetectionJobCommand.() -> Unit): com.amazonaws.services.comprehend.model.StartTopicsDetectionJobResult {
	return this.block.declare(AmazonComprehendStartTopicsDetectionJobCommand(inputDataConfig, outputDataConfig, dataAccessRoleArn).apply(init)) as com.amazonaws.services.comprehend.model.StartTopicsDetectionJobResult
}

@Generated
class AmazonComprehendStartTopicsDetectionJobCommand(val inputDataConfig: com.amazonaws.services.comprehend.model.InputDataConfig, val outputDataConfig: com.amazonaws.services.comprehend.model.OutputDataConfig, val dataAccessRoleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.comprehend.model.StartTopicsDetectionJobRequest, com.amazonaws.services.comprehend.model.StartTopicsDetectionJobResult> {

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

	override fun dryResult(): com.amazonaws.services.comprehend.model.StartTopicsDetectionJobResult {
	  return com.amazonaws.services.comprehend.model.StartTopicsDetectionJobResult()
	}

	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.comprehend.model.StartTopicsDetectionJobResult {
		return environment.comprehend.startTopicsDetectionJob(build())
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
