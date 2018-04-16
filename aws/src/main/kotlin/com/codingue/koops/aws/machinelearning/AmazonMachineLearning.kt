
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.machinelearning

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.machinelearning.*
import com.amazonaws.services.machinelearning.model.*

var com.codingue.koops.core.Environment.machinelearning: AmazonMachineLearning
	get() {
		var service = this.capabilities["aws-machinelearning"]
		if (service == null) {
			service = AmazonMachineLearningClientBuilder.standard().build()
			this.capabilities["aws-machinelearning"] = service
		}
		return service as AmazonMachineLearning
	}
	set(machinelearning) {
		this.capabilities["aws-machinelearning"] = machinelearning
	}

@Generated
class AmazonMachineLearningFunctions(val block: Block)

infix fun <T> AwsContinuation.machinelearning(init: AmazonMachineLearningFunctions.() -> T): T {
	return AmazonMachineLearningFunctions(shell).run(init)
}

			

fun AmazonMachineLearningFunctions.addTags(tags: List<com.amazonaws.services.machinelearning.model.Tag>, resourceId: String, resourceType: TaggableResourceType, init: (AmazonMachineLearningAddTagsCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.AddTagsResult {
	return this.block.declare(AmazonMachineLearningAddTagsCommand(tags, resourceId, resourceType).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.AddTagsResult
}

@Generated
class AmazonMachineLearningAddTagsCommand(val tags: List<com.amazonaws.services.machinelearning.model.Tag>, val resourceId: String, val resourceType: TaggableResourceType) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.AddTagsRequest, com.amazonaws.services.machinelearning.model.AddTagsResult> {



	override fun build(): com.amazonaws.services.machinelearning.model.AddTagsRequest {
		val input = com.amazonaws.services.machinelearning.model.AddTagsRequest()
		input.setTags(this.tags)
		input.setResourceId(this.resourceId)
		input.setResourceType(this.resourceType.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.AddTagsResult {
	  return com.amazonaws.services.machinelearning.model.AddTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.AddTagsResult {
		return environment.machinelearning.addTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning add-tags")
				.argument("tags", tags.toString())
				.argument("resource-id", resourceId)
				.argument("resource-type", resourceType.toString())
	}

}


fun AmazonMachineLearningFunctions.createBatchPrediction(batchPredictionId: String, mLModelId: String, batchPredictionDataSourceId: String, outputUri: String, init: (AmazonMachineLearningCreateBatchPredictionCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.CreateBatchPredictionResult {
	return this.block.declare(AmazonMachineLearningCreateBatchPredictionCommand(batchPredictionId, mLModelId, batchPredictionDataSourceId, outputUri).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.CreateBatchPredictionResult
}

@Generated
class AmazonMachineLearningCreateBatchPredictionCommand(val batchPredictionId: String, val mLModelId: String, val batchPredictionDataSourceId: String, val outputUri: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.CreateBatchPredictionRequest, com.amazonaws.services.machinelearning.model.CreateBatchPredictionResult> {

	var batchPredictionName: String? = null

	override fun build(): com.amazonaws.services.machinelearning.model.CreateBatchPredictionRequest {
		val input = com.amazonaws.services.machinelearning.model.CreateBatchPredictionRequest()
		input.setBatchPredictionId(this.batchPredictionId)
		input.setBatchPredictionName(this.batchPredictionName)
		input.setMLModelId(this.mLModelId)
		input.setBatchPredictionDataSourceId(this.batchPredictionDataSourceId)
		input.setOutputUri(this.outputUri)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.CreateBatchPredictionResult {
	  return com.amazonaws.services.machinelearning.model.CreateBatchPredictionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.CreateBatchPredictionResult {
		return environment.machinelearning.createBatchPrediction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning create-batch-prediction")
				.argument("batch-prediction-id", batchPredictionId)
				.argument("batch-prediction-name", batchPredictionName)
				.argument("mlmodel-id", mLModelId)
				.argument("batch-prediction-data-source-id", batchPredictionDataSourceId)
				.argument("output-uri", outputUri)
	}

}


fun AmazonMachineLearningFunctions.createDataSourceFromRDS(dataSourceId: String, rDSData: com.amazonaws.services.machinelearning.model.RDSDataSpec, roleARN: String, init: (AmazonMachineLearningCreateDataSourceFromRDSCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSResult {
	return this.block.declare(AmazonMachineLearningCreateDataSourceFromRDSCommand(dataSourceId, rDSData, roleARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSResult
}

@Generated
class AmazonMachineLearningCreateDataSourceFromRDSCommand(val dataSourceId: String, val rDSData: com.amazonaws.services.machinelearning.model.RDSDataSpec, val roleARN: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSRequest, com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSResult> {

	var dataSourceName: String? = null
	var computeStatistics: Boolean? = false

	override fun build(): com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSRequest {
		val input = com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSRequest()
		input.setDataSourceId(this.dataSourceId)
		input.setDataSourceName(this.dataSourceName)
		input.setRDSData(this.rDSData)
		input.setRoleARN(this.roleARN)
		input.setComputeStatistics(this.computeStatistics)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSResult {
	  return com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSResult {
		return environment.machinelearning.createDataSourceFromRDS(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning create-data-source-from-rds")
				.argument("data-source-id", dataSourceId)
				.argument("data-source-name", dataSourceName)
				.argument("rdsdata", rDSData.toString())
				.argument("role-arn", roleARN)
				.option("compute-statistics", computeStatistics ?: false)
	}

}


fun AmazonMachineLearningFunctions.createDataSourceFromRedshift(dataSourceId: String, dataSpec: com.amazonaws.services.machinelearning.model.RedshiftDataSpec, roleARN: String, init: (AmazonMachineLearningCreateDataSourceFromRedshiftCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftResult {
	return this.block.declare(AmazonMachineLearningCreateDataSourceFromRedshiftCommand(dataSourceId, dataSpec, roleARN).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftResult
}

@Generated
class AmazonMachineLearningCreateDataSourceFromRedshiftCommand(val dataSourceId: String, val dataSpec: com.amazonaws.services.machinelearning.model.RedshiftDataSpec, val roleARN: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftRequest, com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftResult> {

	var dataSourceName: String? = null
	var computeStatistics: Boolean? = false

	override fun build(): com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftRequest {
		val input = com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftRequest()
		input.setDataSourceId(this.dataSourceId)
		input.setDataSourceName(this.dataSourceName)
		input.setDataSpec(this.dataSpec)
		input.setRoleARN(this.roleARN)
		input.setComputeStatistics(this.computeStatistics)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftResult {
	  return com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftResult {
		return environment.machinelearning.createDataSourceFromRedshift(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning create-data-source-from-redshift")
				.argument("data-source-id", dataSourceId)
				.argument("data-source-name", dataSourceName)
				.argument("data-spec", dataSpec.toString())
				.argument("role-arn", roleARN)
				.option("compute-statistics", computeStatistics ?: false)
	}

}


fun AmazonMachineLearningFunctions.createDataSourceFromS3(dataSourceId: String, dataSpec: com.amazonaws.services.machinelearning.model.S3DataSpec, init: (AmazonMachineLearningCreateDataSourceFromS3Command.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Result {
	return this.block.declare(AmazonMachineLearningCreateDataSourceFromS3Command(dataSourceId, dataSpec).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Result
}

@Generated
class AmazonMachineLearningCreateDataSourceFromS3Command(val dataSourceId: String, val dataSpec: com.amazonaws.services.machinelearning.model.S3DataSpec) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Request, com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Result> {

	var dataSourceName: String? = null
	var computeStatistics: Boolean? = false

	override fun build(): com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Request {
		val input = com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Request()
		input.setDataSourceId(this.dataSourceId)
		input.setDataSourceName(this.dataSourceName)
		input.setDataSpec(this.dataSpec)
		input.setComputeStatistics(this.computeStatistics)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Result {
	  return com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Result()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Result {
		return environment.machinelearning.createDataSourceFromS3(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning create-data-source-from-s3")
				.argument("data-source-id", dataSourceId)
				.argument("data-source-name", dataSourceName)
				.argument("data-spec", dataSpec.toString())
				.option("compute-statistics", computeStatistics ?: false)
	}

}


fun AmazonMachineLearningFunctions.createEvaluation(evaluationId: String, mLModelId: String, evaluationDataSourceId: String, init: (AmazonMachineLearningCreateEvaluationCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.CreateEvaluationResult {
	return this.block.declare(AmazonMachineLearningCreateEvaluationCommand(evaluationId, mLModelId, evaluationDataSourceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.CreateEvaluationResult
}

@Generated
class AmazonMachineLearningCreateEvaluationCommand(val evaluationId: String, val mLModelId: String, val evaluationDataSourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.CreateEvaluationRequest, com.amazonaws.services.machinelearning.model.CreateEvaluationResult> {

	var evaluationName: String? = null

	override fun build(): com.amazonaws.services.machinelearning.model.CreateEvaluationRequest {
		val input = com.amazonaws.services.machinelearning.model.CreateEvaluationRequest()
		input.setEvaluationId(this.evaluationId)
		input.setEvaluationName(this.evaluationName)
		input.setMLModelId(this.mLModelId)
		input.setEvaluationDataSourceId(this.evaluationDataSourceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.CreateEvaluationResult {
	  return com.amazonaws.services.machinelearning.model.CreateEvaluationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.CreateEvaluationResult {
		return environment.machinelearning.createEvaluation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning create-evaluation")
				.argument("evaluation-id", evaluationId)
				.argument("evaluation-name", evaluationName)
				.argument("mlmodel-id", mLModelId)
				.argument("evaluation-data-source-id", evaluationDataSourceId)
	}

}


fun AmazonMachineLearningFunctions.createMLModel(mLModelId: String, mLModelType: MLModelType, trainingDataSourceId: String, init: (AmazonMachineLearningCreateMLModelCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.CreateMLModelResult {
	return this.block.declare(AmazonMachineLearningCreateMLModelCommand(mLModelId, mLModelType, trainingDataSourceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.CreateMLModelResult
}

@Generated
class AmazonMachineLearningCreateMLModelCommand(val mLModelId: String, val mLModelType: MLModelType, val trainingDataSourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.CreateMLModelRequest, com.amazonaws.services.machinelearning.model.CreateMLModelResult> {

	var mLModelName: String? = null
	var parameters: Map<String, String>? = null
	var recipe: String? = null
	var recipeUri: String? = null

	override fun build(): com.amazonaws.services.machinelearning.model.CreateMLModelRequest {
		val input = com.amazonaws.services.machinelearning.model.CreateMLModelRequest()
		input.setMLModelId(this.mLModelId)
		input.setMLModelName(this.mLModelName)
		input.setMLModelType(this.mLModelType.toString())
		input.setParameters(this.parameters)
		input.setTrainingDataSourceId(this.trainingDataSourceId)
		input.setRecipe(this.recipe)
		input.setRecipeUri(this.recipeUri)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.CreateMLModelResult {
	  return com.amazonaws.services.machinelearning.model.CreateMLModelResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.CreateMLModelResult {
		return environment.machinelearning.createMLModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning create-mlmodel")
				.argument("mlmodel-id", mLModelId)
				.argument("mlmodel-name", mLModelName)
				.argument("mlmodel-type", mLModelType.toString())
				.argument("parameters", parameters?.toString())
				.argument("training-data-source-id", trainingDataSourceId)
				.argument("recipe", recipe)
				.argument("recipe-uri", recipeUri)
	}

}


fun AmazonMachineLearningFunctions.createRealtimeEndpoint(mLModelId: String, init: (AmazonMachineLearningCreateRealtimeEndpointCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointResult {
	return this.block.declare(AmazonMachineLearningCreateRealtimeEndpointCommand(mLModelId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointResult
}

@Generated
class AmazonMachineLearningCreateRealtimeEndpointCommand(val mLModelId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest, com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointResult> {



	override fun build(): com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest {
		val input = com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest()
		input.setMLModelId(this.mLModelId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointResult {
	  return com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointResult {
		return environment.machinelearning.createRealtimeEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning create-realtime-endpoint")
				.argument("mlmodel-id", mLModelId)
	}

}


fun AmazonMachineLearningFunctions.deleteBatchPrediction(batchPredictionId: String, init: (AmazonMachineLearningDeleteBatchPredictionCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.DeleteBatchPredictionResult {
	return this.block.declare(AmazonMachineLearningDeleteBatchPredictionCommand(batchPredictionId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.DeleteBatchPredictionResult
}

@Generated
class AmazonMachineLearningDeleteBatchPredictionCommand(val batchPredictionId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest, com.amazonaws.services.machinelearning.model.DeleteBatchPredictionResult> {



	override fun build(): com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest {
		val input = com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest()
		input.setBatchPredictionId(this.batchPredictionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.DeleteBatchPredictionResult {
	  return com.amazonaws.services.machinelearning.model.DeleteBatchPredictionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.DeleteBatchPredictionResult {
		return environment.machinelearning.deleteBatchPrediction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning delete-batch-prediction")
				.argument("batch-prediction-id", batchPredictionId)
	}

}


fun AmazonMachineLearningFunctions.deleteDataSource(dataSourceId: String, init: (AmazonMachineLearningDeleteDataSourceCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.DeleteDataSourceResult {
	return this.block.declare(AmazonMachineLearningDeleteDataSourceCommand(dataSourceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.DeleteDataSourceResult
}

@Generated
class AmazonMachineLearningDeleteDataSourceCommand(val dataSourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest, com.amazonaws.services.machinelearning.model.DeleteDataSourceResult> {



	override fun build(): com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest {
		val input = com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest()
		input.setDataSourceId(this.dataSourceId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.DeleteDataSourceResult {
	  return com.amazonaws.services.machinelearning.model.DeleteDataSourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.DeleteDataSourceResult {
		return environment.machinelearning.deleteDataSource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning delete-data-source")
				.argument("data-source-id", dataSourceId)
	}

}


fun AmazonMachineLearningFunctions.deleteEvaluation(evaluationId: String, init: (AmazonMachineLearningDeleteEvaluationCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.DeleteEvaluationResult {
	return this.block.declare(AmazonMachineLearningDeleteEvaluationCommand(evaluationId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.DeleteEvaluationResult
}

@Generated
class AmazonMachineLearningDeleteEvaluationCommand(val evaluationId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest, com.amazonaws.services.machinelearning.model.DeleteEvaluationResult> {



	override fun build(): com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest {
		val input = com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest()
		input.setEvaluationId(this.evaluationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.DeleteEvaluationResult {
	  return com.amazonaws.services.machinelearning.model.DeleteEvaluationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.DeleteEvaluationResult {
		return environment.machinelearning.deleteEvaluation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning delete-evaluation")
				.argument("evaluation-id", evaluationId)
	}

}


fun AmazonMachineLearningFunctions.deleteMLModel(mLModelId: String, init: (AmazonMachineLearningDeleteMLModelCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.DeleteMLModelResult {
	return this.block.declare(AmazonMachineLearningDeleteMLModelCommand(mLModelId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.DeleteMLModelResult
}

@Generated
class AmazonMachineLearningDeleteMLModelCommand(val mLModelId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DeleteMLModelRequest, com.amazonaws.services.machinelearning.model.DeleteMLModelResult> {



	override fun build(): com.amazonaws.services.machinelearning.model.DeleteMLModelRequest {
		val input = com.amazonaws.services.machinelearning.model.DeleteMLModelRequest()
		input.setMLModelId(this.mLModelId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.DeleteMLModelResult {
	  return com.amazonaws.services.machinelearning.model.DeleteMLModelResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.DeleteMLModelResult {
		return environment.machinelearning.deleteMLModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning delete-mlmodel")
				.argument("mlmodel-id", mLModelId)
	}

}


fun AmazonMachineLearningFunctions.deleteRealtimeEndpoint(mLModelId: String, init: (AmazonMachineLearningDeleteRealtimeEndpointCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointResult {
	return this.block.declare(AmazonMachineLearningDeleteRealtimeEndpointCommand(mLModelId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointResult
}

@Generated
class AmazonMachineLearningDeleteRealtimeEndpointCommand(val mLModelId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest, com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointResult> {



	override fun build(): com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest {
		val input = com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest()
		input.setMLModelId(this.mLModelId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointResult {
	  return com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointResult {
		return environment.machinelearning.deleteRealtimeEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning delete-realtime-endpoint")
				.argument("mlmodel-id", mLModelId)
	}

}


fun AmazonMachineLearningFunctions.deleteTags(tagKeys: List<String>, resourceId: String, resourceType: TaggableResourceType, init: (AmazonMachineLearningDeleteTagsCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.DeleteTagsResult {
	return this.block.declare(AmazonMachineLearningDeleteTagsCommand(tagKeys, resourceId, resourceType).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.DeleteTagsResult
}

@Generated
class AmazonMachineLearningDeleteTagsCommand(val tagKeys: List<String>, val resourceId: String, val resourceType: TaggableResourceType) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DeleteTagsRequest, com.amazonaws.services.machinelearning.model.DeleteTagsResult> {



	override fun build(): com.amazonaws.services.machinelearning.model.DeleteTagsRequest {
		val input = com.amazonaws.services.machinelearning.model.DeleteTagsRequest()
		input.setTagKeys(this.tagKeys)
		input.setResourceId(this.resourceId)
		input.setResourceType(this.resourceType.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.DeleteTagsResult {
	  return com.amazonaws.services.machinelearning.model.DeleteTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.DeleteTagsResult {
		return environment.machinelearning.deleteTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning delete-tags")
				.argument("tag-keys", tagKeys.toString())
				.argument("resource-id", resourceId)
				.argument("resource-type", resourceType.toString())
	}

}


fun AmazonMachineLearningFunctions.describeBatchPredictions(init: (AmazonMachineLearningDescribeBatchPredictionsCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult {
	return this.block.declare(AmazonMachineLearningDescribeBatchPredictionsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult
}

@Generated
class AmazonMachineLearningDescribeBatchPredictionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsRequest, com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult> {

	var filterVariable: BatchPredictionFilterVariable? = null
	var eQ: String? = null
	var gT: String? = null
	var lT: String? = null
	var gE: String? = null
	var lE: String? = null
	var nE: String? = null
	var prefix: String? = null
	var sortOrder: SortOrder? = null
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsRequest {
		val input = com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsRequest()
		input.setFilterVariable(this.filterVariable?.toString())
		input.setEQ(this.eQ)
		input.setGT(this.gT)
		input.setLT(this.lT)
		input.setGE(this.gE)
		input.setLE(this.lE)
		input.setNE(this.nE)
		input.setPrefix(this.prefix)
		input.setSortOrder(this.sortOrder?.toString())
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult {
	  return com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult {
		return environment.machinelearning.describeBatchPredictions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning describe-batch-predictions")
				.argument("filter-variable", filterVariable?.toString())
				.argument("eq", eQ)
				.argument("gt", gT)
				.argument("lt", lT)
				.argument("ge", gE)
				.argument("le", lE)
				.argument("ne", nE)
				.argument("prefix", prefix)
				.argument("sort-order", sortOrder?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AmazonMachineLearningFunctions.describeDataSources(init: (AmazonMachineLearningDescribeDataSourcesCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult {
	return this.block.declare(AmazonMachineLearningDescribeDataSourcesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult
}

@Generated
class AmazonMachineLearningDescribeDataSourcesCommand() : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DescribeDataSourcesRequest, com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult> {

	var filterVariable: DataSourceFilterVariable? = null
	var eQ: String? = null
	var gT: String? = null
	var lT: String? = null
	var gE: String? = null
	var lE: String? = null
	var nE: String? = null
	var prefix: String? = null
	var sortOrder: SortOrder? = null
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.machinelearning.model.DescribeDataSourcesRequest {
		val input = com.amazonaws.services.machinelearning.model.DescribeDataSourcesRequest()
		input.setFilterVariable(this.filterVariable?.toString())
		input.setEQ(this.eQ)
		input.setGT(this.gT)
		input.setLT(this.lT)
		input.setGE(this.gE)
		input.setLE(this.lE)
		input.setNE(this.nE)
		input.setPrefix(this.prefix)
		input.setSortOrder(this.sortOrder?.toString())
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult {
	  return com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult {
		return environment.machinelearning.describeDataSources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning describe-data-sources")
				.argument("filter-variable", filterVariable?.toString())
				.argument("eq", eQ)
				.argument("gt", gT)
				.argument("lt", lT)
				.argument("ge", gE)
				.argument("le", lE)
				.argument("ne", nE)
				.argument("prefix", prefix)
				.argument("sort-order", sortOrder?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AmazonMachineLearningFunctions.describeEvaluations(init: (AmazonMachineLearningDescribeEvaluationsCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult {
	return this.block.declare(AmazonMachineLearningDescribeEvaluationsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult
}

@Generated
class AmazonMachineLearningDescribeEvaluationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DescribeEvaluationsRequest, com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult> {

	var filterVariable: EvaluationFilterVariable? = null
	var eQ: String? = null
	var gT: String? = null
	var lT: String? = null
	var gE: String? = null
	var lE: String? = null
	var nE: String? = null
	var prefix: String? = null
	var sortOrder: SortOrder? = null
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.machinelearning.model.DescribeEvaluationsRequest {
		val input = com.amazonaws.services.machinelearning.model.DescribeEvaluationsRequest()
		input.setFilterVariable(this.filterVariable?.toString())
		input.setEQ(this.eQ)
		input.setGT(this.gT)
		input.setLT(this.lT)
		input.setGE(this.gE)
		input.setLE(this.lE)
		input.setNE(this.nE)
		input.setPrefix(this.prefix)
		input.setSortOrder(this.sortOrder?.toString())
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult {
	  return com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult {
		return environment.machinelearning.describeEvaluations(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning describe-evaluations")
				.argument("filter-variable", filterVariable?.toString())
				.argument("eq", eQ)
				.argument("gt", gT)
				.argument("lt", lT)
				.argument("ge", gE)
				.argument("le", lE)
				.argument("ne", nE)
				.argument("prefix", prefix)
				.argument("sort-order", sortOrder?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AmazonMachineLearningFunctions.describeMLModels(init: (AmazonMachineLearningDescribeMLModelsCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.DescribeMLModelsResult {
	return this.block.declare(AmazonMachineLearningDescribeMLModelsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.DescribeMLModelsResult
}

@Generated
class AmazonMachineLearningDescribeMLModelsCommand() : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DescribeMLModelsRequest, com.amazonaws.services.machinelearning.model.DescribeMLModelsResult> {

	var filterVariable: MLModelFilterVariable? = null
	var eQ: String? = null
	var gT: String? = null
	var lT: String? = null
	var gE: String? = null
	var lE: String? = null
	var nE: String? = null
	var prefix: String? = null
	var sortOrder: SortOrder? = null
	var nextToken: String? = null
	var limit: Int? = 0

	override fun build(): com.amazonaws.services.machinelearning.model.DescribeMLModelsRequest {
		val input = com.amazonaws.services.machinelearning.model.DescribeMLModelsRequest()
		input.setFilterVariable(this.filterVariable?.toString())
		input.setEQ(this.eQ)
		input.setGT(this.gT)
		input.setLT(this.lT)
		input.setGE(this.gE)
		input.setLE(this.lE)
		input.setNE(this.nE)
		input.setPrefix(this.prefix)
		input.setSortOrder(this.sortOrder?.toString())
		input.setNextToken(this.nextToken)
		input.setLimit(this.limit)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.DescribeMLModelsResult {
	  return com.amazonaws.services.machinelearning.model.DescribeMLModelsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.DescribeMLModelsResult {
		return environment.machinelearning.describeMLModels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning describe-mlmodels")
				.argument("filter-variable", filterVariable?.toString())
				.argument("eq", eQ)
				.argument("gt", gT)
				.argument("lt", lT)
				.argument("ge", gE)
				.argument("le", lE)
				.argument("ne", nE)
				.argument("prefix", prefix)
				.argument("sort-order", sortOrder?.toString())
				.argument("next-token", nextToken)
				.argument("limit", limit?.toString())
	}

}


fun AmazonMachineLearningFunctions.describeTags(resourceId: String, resourceType: TaggableResourceType, init: (AmazonMachineLearningDescribeTagsCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.DescribeTagsResult {
	return this.block.declare(AmazonMachineLearningDescribeTagsCommand(resourceId, resourceType).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.DescribeTagsResult
}

@Generated
class AmazonMachineLearningDescribeTagsCommand(val resourceId: String, val resourceType: TaggableResourceType) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DescribeTagsRequest, com.amazonaws.services.machinelearning.model.DescribeTagsResult> {



	override fun build(): com.amazonaws.services.machinelearning.model.DescribeTagsRequest {
		val input = com.amazonaws.services.machinelearning.model.DescribeTagsRequest()
		input.setResourceId(this.resourceId)
		input.setResourceType(this.resourceType.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.DescribeTagsResult {
	  return com.amazonaws.services.machinelearning.model.DescribeTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.DescribeTagsResult {
		return environment.machinelearning.describeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning describe-tags")
				.argument("resource-id", resourceId)
				.argument("resource-type", resourceType.toString())
	}

}


fun AmazonMachineLearningFunctions.getBatchPrediction(batchPredictionId: String, init: (AmazonMachineLearningGetBatchPredictionCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.GetBatchPredictionResult {
	return this.block.declare(AmazonMachineLearningGetBatchPredictionCommand(batchPredictionId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.GetBatchPredictionResult
}

@Generated
class AmazonMachineLearningGetBatchPredictionCommand(val batchPredictionId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest, com.amazonaws.services.machinelearning.model.GetBatchPredictionResult> {



	override fun build(): com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest {
		val input = com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest()
		input.setBatchPredictionId(this.batchPredictionId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.GetBatchPredictionResult {
	  return com.amazonaws.services.machinelearning.model.GetBatchPredictionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.GetBatchPredictionResult {
		return environment.machinelearning.getBatchPrediction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning get-batch-prediction")
				.argument("batch-prediction-id", batchPredictionId)
	}

}


fun AmazonMachineLearningFunctions.getDataSource(dataSourceId: String, init: (AmazonMachineLearningGetDataSourceCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.GetDataSourceResult {
	return this.block.declare(AmazonMachineLearningGetDataSourceCommand(dataSourceId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.GetDataSourceResult
}

@Generated
class AmazonMachineLearningGetDataSourceCommand(val dataSourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.GetDataSourceRequest, com.amazonaws.services.machinelearning.model.GetDataSourceResult> {

	var verbose: Boolean? = false

	override fun build(): com.amazonaws.services.machinelearning.model.GetDataSourceRequest {
		val input = com.amazonaws.services.machinelearning.model.GetDataSourceRequest()
		input.setDataSourceId(this.dataSourceId)
		input.setVerbose(this.verbose)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.GetDataSourceResult {
	  return com.amazonaws.services.machinelearning.model.GetDataSourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.GetDataSourceResult {
		return environment.machinelearning.getDataSource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning get-data-source")
				.argument("data-source-id", dataSourceId)
				.option("verbose", verbose ?: false)
	}

}


fun AmazonMachineLearningFunctions.getEvaluation(evaluationId: String, init: (AmazonMachineLearningGetEvaluationCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.GetEvaluationResult {
	return this.block.declare(AmazonMachineLearningGetEvaluationCommand(evaluationId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.GetEvaluationResult
}

@Generated
class AmazonMachineLearningGetEvaluationCommand(val evaluationId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.GetEvaluationRequest, com.amazonaws.services.machinelearning.model.GetEvaluationResult> {



	override fun build(): com.amazonaws.services.machinelearning.model.GetEvaluationRequest {
		val input = com.amazonaws.services.machinelearning.model.GetEvaluationRequest()
		input.setEvaluationId(this.evaluationId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.GetEvaluationResult {
	  return com.amazonaws.services.machinelearning.model.GetEvaluationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.GetEvaluationResult {
		return environment.machinelearning.getEvaluation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning get-evaluation")
				.argument("evaluation-id", evaluationId)
	}

}


fun AmazonMachineLearningFunctions.getMLModel(mLModelId: String, init: (AmazonMachineLearningGetMLModelCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.GetMLModelResult {
	return this.block.declare(AmazonMachineLearningGetMLModelCommand(mLModelId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.GetMLModelResult
}

@Generated
class AmazonMachineLearningGetMLModelCommand(val mLModelId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.GetMLModelRequest, com.amazonaws.services.machinelearning.model.GetMLModelResult> {

	var verbose: Boolean? = false

	override fun build(): com.amazonaws.services.machinelearning.model.GetMLModelRequest {
		val input = com.amazonaws.services.machinelearning.model.GetMLModelRequest()
		input.setMLModelId(this.mLModelId)
		input.setVerbose(this.verbose)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.GetMLModelResult {
	  return com.amazonaws.services.machinelearning.model.GetMLModelResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.GetMLModelResult {
		return environment.machinelearning.getMLModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning get-mlmodel")
				.argument("mlmodel-id", mLModelId)
				.option("verbose", verbose ?: false)
	}

}


fun AmazonMachineLearningFunctions.predict(mLModelId: String, record: Map<String, String>, predictEndpoint: String, init: (AmazonMachineLearningPredictCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.PredictResult {
	return this.block.declare(AmazonMachineLearningPredictCommand(mLModelId, record, predictEndpoint).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.PredictResult
}

@Generated
class AmazonMachineLearningPredictCommand(val mLModelId: String, val record: Map<String, String>, val predictEndpoint: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.PredictRequest, com.amazonaws.services.machinelearning.model.PredictResult> {



	override fun build(): com.amazonaws.services.machinelearning.model.PredictRequest {
		val input = com.amazonaws.services.machinelearning.model.PredictRequest()
		input.setMLModelId(this.mLModelId)
		input.setRecord(this.record)
		input.setPredictEndpoint(this.predictEndpoint)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.PredictResult {
	  return com.amazonaws.services.machinelearning.model.PredictResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.PredictResult {
		return environment.machinelearning.predict(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning predict")
				.argument("mlmodel-id", mLModelId)
				.argument("record", record.toString())
				.argument("predict-endpoint", predictEndpoint)
	}

}


fun AmazonMachineLearningFunctions.updateBatchPrediction(batchPredictionId: String, batchPredictionName: String, init: (AmazonMachineLearningUpdateBatchPredictionCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.UpdateBatchPredictionResult {
	return this.block.declare(AmazonMachineLearningUpdateBatchPredictionCommand(batchPredictionId, batchPredictionName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.UpdateBatchPredictionResult
}

@Generated
class AmazonMachineLearningUpdateBatchPredictionCommand(val batchPredictionId: String, val batchPredictionName: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest, com.amazonaws.services.machinelearning.model.UpdateBatchPredictionResult> {



	override fun build(): com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest {
		val input = com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest()
		input.setBatchPredictionId(this.batchPredictionId)
		input.setBatchPredictionName(this.batchPredictionName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.UpdateBatchPredictionResult {
	  return com.amazonaws.services.machinelearning.model.UpdateBatchPredictionResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.UpdateBatchPredictionResult {
		return environment.machinelearning.updateBatchPrediction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning update-batch-prediction")
				.argument("batch-prediction-id", batchPredictionId)
				.argument("batch-prediction-name", batchPredictionName)
	}

}


fun AmazonMachineLearningFunctions.updateDataSource(dataSourceId: String, dataSourceName: String, init: (AmazonMachineLearningUpdateDataSourceCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.UpdateDataSourceResult {
	return this.block.declare(AmazonMachineLearningUpdateDataSourceCommand(dataSourceId, dataSourceName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.UpdateDataSourceResult
}

@Generated
class AmazonMachineLearningUpdateDataSourceCommand(val dataSourceId: String, val dataSourceName: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest, com.amazonaws.services.machinelearning.model.UpdateDataSourceResult> {



	override fun build(): com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest {
		val input = com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest()
		input.setDataSourceId(this.dataSourceId)
		input.setDataSourceName(this.dataSourceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.UpdateDataSourceResult {
	  return com.amazonaws.services.machinelearning.model.UpdateDataSourceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.UpdateDataSourceResult {
		return environment.machinelearning.updateDataSource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning update-data-source")
				.argument("data-source-id", dataSourceId)
				.argument("data-source-name", dataSourceName)
	}

}


fun AmazonMachineLearningFunctions.updateEvaluation(evaluationId: String, evaluationName: String, init: (AmazonMachineLearningUpdateEvaluationCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.UpdateEvaluationResult {
	return this.block.declare(AmazonMachineLearningUpdateEvaluationCommand(evaluationId, evaluationName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.UpdateEvaluationResult
}

@Generated
class AmazonMachineLearningUpdateEvaluationCommand(val evaluationId: String, val evaluationName: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest, com.amazonaws.services.machinelearning.model.UpdateEvaluationResult> {



	override fun build(): com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest {
		val input = com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest()
		input.setEvaluationId(this.evaluationId)
		input.setEvaluationName(this.evaluationName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.UpdateEvaluationResult {
	  return com.amazonaws.services.machinelearning.model.UpdateEvaluationResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.UpdateEvaluationResult {
		return environment.machinelearning.updateEvaluation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning update-evaluation")
				.argument("evaluation-id", evaluationId)
				.argument("evaluation-name", evaluationName)
	}

}


fun AmazonMachineLearningFunctions.updateMLModel(mLModelId: String, init: (AmazonMachineLearningUpdateMLModelCommand.() -> Unit)? = null): com.amazonaws.services.machinelearning.model.UpdateMLModelResult {
	return this.block.declare(AmazonMachineLearningUpdateMLModelCommand(mLModelId).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.machinelearning.model.UpdateMLModelResult
}

@Generated
class AmazonMachineLearningUpdateMLModelCommand(val mLModelId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.UpdateMLModelRequest, com.amazonaws.services.machinelearning.model.UpdateMLModelResult> {

	var mLModelName: String? = null
	var scoreThreshold: Float? = 0f

	override fun build(): com.amazonaws.services.machinelearning.model.UpdateMLModelRequest {
		val input = com.amazonaws.services.machinelearning.model.UpdateMLModelRequest()
		input.setMLModelId(this.mLModelId)
		input.setMLModelName(this.mLModelName)
		input.setScoreThreshold(this.scoreThreshold)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.machinelearning.model.UpdateMLModelResult {
	  return com.amazonaws.services.machinelearning.model.UpdateMLModelResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.machinelearning.model.UpdateMLModelResult {
		return environment.machinelearning.updateMLModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning update-mlmodel")
				.argument("mlmodel-id", mLModelId)
				.argument("mlmodel-name", mLModelName)
				.argument("score-threshold", scoreThreshold?.toString())
	}

}
