
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.machinelearning.AmazonMachineLearning
import com.amazonaws.services.machinelearning.model.*

var codingue.koops.core.Environment.machinelearning: AmazonMachineLearning
	get() = this.capabilities[AmazonMachineLearning::class.java.name] as AmazonMachineLearning
	set(machinelearning) {
		this.capabilities[AmazonMachineLearning::class.java.name] = machinelearning
	}

@Generated
class AmazonMachineLearningFunctions(val block: Block)

infix fun AwsContinuation.machinelearning(init: AmazonMachineLearningFunctions.() -> Unit) {
	AmazonMachineLearningFunctions(shell).apply(init)
}

			

fun AmazonMachineLearningFunctions.addTags(tags: List<com.amazonaws.services.machinelearning.model.Tag>, resourceId: String, resourceType: TaggableResourceType, init: AmazonMachineLearningAddTagsCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningAddTagsCommand(tags, resourceId, resourceType).apply(init))
}

@Generated
class AmazonMachineLearningAddTagsCommand(val tags: List<com.amazonaws.services.machinelearning.model.Tag>, val resourceId: String, val resourceType: TaggableResourceType) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.AddTagsRequest> {



	override fun build(): com.amazonaws.services.machinelearning.model.AddTagsRequest {
		val input = com.amazonaws.services.machinelearning.model.AddTagsRequest()
		input.setTags(this.tags)
		input.setResourceId(this.resourceId)
		input.setResourceType(this.resourceType.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.addTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning add-tags")
				.argument("tags", tags.toString())
				.argument("resource-id", resourceId)
				.argument("resource-type", resourceType.toString())
	}

}


fun AmazonMachineLearningFunctions.createBatchPrediction(batchPredictionId: String, mLModelId: String, batchPredictionDataSourceId: String, outputUri: String, init: AmazonMachineLearningCreateBatchPredictionCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningCreateBatchPredictionCommand(batchPredictionId, mLModelId, batchPredictionDataSourceId, outputUri).apply(init))
}

@Generated
class AmazonMachineLearningCreateBatchPredictionCommand(val batchPredictionId: String, val mLModelId: String, val batchPredictionDataSourceId: String, val outputUri: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.CreateBatchPredictionRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.createBatchPrediction(build())
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


fun AmazonMachineLearningFunctions.createDataSourceFromRDS(dataSourceId: String, rDSData: com.amazonaws.services.machinelearning.model.RDSDataSpec, roleARN: String, init: AmazonMachineLearningCreateDataSourceFromRDSCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningCreateDataSourceFromRDSCommand(dataSourceId, rDSData, roleARN).apply(init))
}

@Generated
class AmazonMachineLearningCreateDataSourceFromRDSCommand(val dataSourceId: String, val rDSData: com.amazonaws.services.machinelearning.model.RDSDataSpec, val roleARN: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.createDataSourceFromRDS(build())
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


fun AmazonMachineLearningFunctions.createDataSourceFromRedshift(dataSourceId: String, dataSpec: com.amazonaws.services.machinelearning.model.RedshiftDataSpec, roleARN: String, init: AmazonMachineLearningCreateDataSourceFromRedshiftCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningCreateDataSourceFromRedshiftCommand(dataSourceId, dataSpec, roleARN).apply(init))
}

@Generated
class AmazonMachineLearningCreateDataSourceFromRedshiftCommand(val dataSourceId: String, val dataSpec: com.amazonaws.services.machinelearning.model.RedshiftDataSpec, val roleARN: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.createDataSourceFromRedshift(build())
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


fun AmazonMachineLearningFunctions.createDataSourceFromS3(dataSourceId: String, dataSpec: com.amazonaws.services.machinelearning.model.S3DataSpec, init: AmazonMachineLearningCreateDataSourceFromS3Command.() -> Unit) {
	this.block.declare(AmazonMachineLearningCreateDataSourceFromS3Command(dataSourceId, dataSpec).apply(init))
}

@Generated
class AmazonMachineLearningCreateDataSourceFromS3Command(val dataSourceId: String, val dataSpec: com.amazonaws.services.machinelearning.model.S3DataSpec) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Request> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.createDataSourceFromS3(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning create-data-source-from-s3")
				.argument("data-source-id", dataSourceId)
				.argument("data-source-name", dataSourceName)
				.argument("data-spec", dataSpec.toString())
				.option("compute-statistics", computeStatistics ?: false)
	}

}


fun AmazonMachineLearningFunctions.createEvaluation(evaluationId: String, mLModelId: String, evaluationDataSourceId: String, init: AmazonMachineLearningCreateEvaluationCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningCreateEvaluationCommand(evaluationId, mLModelId, evaluationDataSourceId).apply(init))
}

@Generated
class AmazonMachineLearningCreateEvaluationCommand(val evaluationId: String, val mLModelId: String, val evaluationDataSourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.CreateEvaluationRequest> {

	var evaluationName: String? = null

	override fun build(): com.amazonaws.services.machinelearning.model.CreateEvaluationRequest {
		val input = com.amazonaws.services.machinelearning.model.CreateEvaluationRequest()
		input.setEvaluationId(this.evaluationId)
		input.setEvaluationName(this.evaluationName)
		input.setMLModelId(this.mLModelId)
		input.setEvaluationDataSourceId(this.evaluationDataSourceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.createEvaluation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning create-evaluation")
				.argument("evaluation-id", evaluationId)
				.argument("evaluation-name", evaluationName)
				.argument("mlmodel-id", mLModelId)
				.argument("evaluation-data-source-id", evaluationDataSourceId)
	}

}


fun AmazonMachineLearningFunctions.createMLModel(mLModelId: String, mLModelType: MLModelType, trainingDataSourceId: String, init: AmazonMachineLearningCreateMLModelCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningCreateMLModelCommand(mLModelId, mLModelType, trainingDataSourceId).apply(init))
}

@Generated
class AmazonMachineLearningCreateMLModelCommand(val mLModelId: String, val mLModelType: MLModelType, val trainingDataSourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.CreateMLModelRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.createMLModel(build())
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


fun AmazonMachineLearningFunctions.createRealtimeEndpoint(mLModelId: String, init: AmazonMachineLearningCreateRealtimeEndpointCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningCreateRealtimeEndpointCommand(mLModelId).apply(init))
}

@Generated
class AmazonMachineLearningCreateRealtimeEndpointCommand(val mLModelId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest> {



	override fun build(): com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest {
		val input = com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest()
		input.setMLModelId(this.mLModelId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.createRealtimeEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning create-realtime-endpoint")
				.argument("mlmodel-id", mLModelId)
	}

}


fun AmazonMachineLearningFunctions.deleteBatchPrediction(batchPredictionId: String, init: AmazonMachineLearningDeleteBatchPredictionCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningDeleteBatchPredictionCommand(batchPredictionId).apply(init))
}

@Generated
class AmazonMachineLearningDeleteBatchPredictionCommand(val batchPredictionId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest> {



	override fun build(): com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest {
		val input = com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest()
		input.setBatchPredictionId(this.batchPredictionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.deleteBatchPrediction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning delete-batch-prediction")
				.argument("batch-prediction-id", batchPredictionId)
	}

}


fun AmazonMachineLearningFunctions.deleteDataSource(dataSourceId: String, init: AmazonMachineLearningDeleteDataSourceCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningDeleteDataSourceCommand(dataSourceId).apply(init))
}

@Generated
class AmazonMachineLearningDeleteDataSourceCommand(val dataSourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest> {



	override fun build(): com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest {
		val input = com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest()
		input.setDataSourceId(this.dataSourceId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.deleteDataSource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning delete-data-source")
				.argument("data-source-id", dataSourceId)
	}

}


fun AmazonMachineLearningFunctions.deleteEvaluation(evaluationId: String, init: AmazonMachineLearningDeleteEvaluationCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningDeleteEvaluationCommand(evaluationId).apply(init))
}

@Generated
class AmazonMachineLearningDeleteEvaluationCommand(val evaluationId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest> {



	override fun build(): com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest {
		val input = com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest()
		input.setEvaluationId(this.evaluationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.deleteEvaluation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning delete-evaluation")
				.argument("evaluation-id", evaluationId)
	}

}


fun AmazonMachineLearningFunctions.deleteMLModel(mLModelId: String, init: AmazonMachineLearningDeleteMLModelCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningDeleteMLModelCommand(mLModelId).apply(init))
}

@Generated
class AmazonMachineLearningDeleteMLModelCommand(val mLModelId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DeleteMLModelRequest> {



	override fun build(): com.amazonaws.services.machinelearning.model.DeleteMLModelRequest {
		val input = com.amazonaws.services.machinelearning.model.DeleteMLModelRequest()
		input.setMLModelId(this.mLModelId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.deleteMLModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning delete-mlmodel")
				.argument("mlmodel-id", mLModelId)
	}

}


fun AmazonMachineLearningFunctions.deleteRealtimeEndpoint(mLModelId: String, init: AmazonMachineLearningDeleteRealtimeEndpointCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningDeleteRealtimeEndpointCommand(mLModelId).apply(init))
}

@Generated
class AmazonMachineLearningDeleteRealtimeEndpointCommand(val mLModelId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest> {



	override fun build(): com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest {
		val input = com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest()
		input.setMLModelId(this.mLModelId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.deleteRealtimeEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning delete-realtime-endpoint")
				.argument("mlmodel-id", mLModelId)
	}

}


fun AmazonMachineLearningFunctions.deleteTags(tagKeys: List<String>, resourceId: String, resourceType: TaggableResourceType, init: AmazonMachineLearningDeleteTagsCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningDeleteTagsCommand(tagKeys, resourceId, resourceType).apply(init))
}

@Generated
class AmazonMachineLearningDeleteTagsCommand(val tagKeys: List<String>, val resourceId: String, val resourceType: TaggableResourceType) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DeleteTagsRequest> {



	override fun build(): com.amazonaws.services.machinelearning.model.DeleteTagsRequest {
		val input = com.amazonaws.services.machinelearning.model.DeleteTagsRequest()
		input.setTagKeys(this.tagKeys)
		input.setResourceId(this.resourceId)
		input.setResourceType(this.resourceType.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.deleteTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning delete-tags")
				.argument("tag-keys", tagKeys.toString())
				.argument("resource-id", resourceId)
				.argument("resource-type", resourceType.toString())
	}

}


fun AmazonMachineLearningFunctions.describeBatchPredictions(init: AmazonMachineLearningDescribeBatchPredictionsCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningDescribeBatchPredictionsCommand().apply(init))
}

@Generated
class AmazonMachineLearningDescribeBatchPredictionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.describeBatchPredictions(build())
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


fun AmazonMachineLearningFunctions.describeDataSources(init: AmazonMachineLearningDescribeDataSourcesCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningDescribeDataSourcesCommand().apply(init))
}

@Generated
class AmazonMachineLearningDescribeDataSourcesCommand() : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DescribeDataSourcesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.describeDataSources(build())
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


fun AmazonMachineLearningFunctions.describeEvaluations(init: AmazonMachineLearningDescribeEvaluationsCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningDescribeEvaluationsCommand().apply(init))
}

@Generated
class AmazonMachineLearningDescribeEvaluationsCommand() : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DescribeEvaluationsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.describeEvaluations(build())
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


fun AmazonMachineLearningFunctions.describeMLModels(init: AmazonMachineLearningDescribeMLModelsCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningDescribeMLModelsCommand().apply(init))
}

@Generated
class AmazonMachineLearningDescribeMLModelsCommand() : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DescribeMLModelsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.describeMLModels(build())
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


fun AmazonMachineLearningFunctions.describeTags(resourceId: String, resourceType: TaggableResourceType, init: AmazonMachineLearningDescribeTagsCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningDescribeTagsCommand(resourceId, resourceType).apply(init))
}

@Generated
class AmazonMachineLearningDescribeTagsCommand(val resourceId: String, val resourceType: TaggableResourceType) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.DescribeTagsRequest> {



	override fun build(): com.amazonaws.services.machinelearning.model.DescribeTagsRequest {
		val input = com.amazonaws.services.machinelearning.model.DescribeTagsRequest()
		input.setResourceId(this.resourceId)
		input.setResourceType(this.resourceType.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.describeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning describe-tags")
				.argument("resource-id", resourceId)
				.argument("resource-type", resourceType.toString())
	}

}


fun AmazonMachineLearningFunctions.getBatchPrediction(batchPredictionId: String, init: AmazonMachineLearningGetBatchPredictionCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningGetBatchPredictionCommand(batchPredictionId).apply(init))
}

@Generated
class AmazonMachineLearningGetBatchPredictionCommand(val batchPredictionId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest> {



	override fun build(): com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest {
		val input = com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest()
		input.setBatchPredictionId(this.batchPredictionId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.getBatchPrediction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning get-batch-prediction")
				.argument("batch-prediction-id", batchPredictionId)
	}

}


fun AmazonMachineLearningFunctions.getDataSource(dataSourceId: String, init: AmazonMachineLearningGetDataSourceCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningGetDataSourceCommand(dataSourceId).apply(init))
}

@Generated
class AmazonMachineLearningGetDataSourceCommand(val dataSourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.GetDataSourceRequest> {

	var verbose: Boolean? = false

	override fun build(): com.amazonaws.services.machinelearning.model.GetDataSourceRequest {
		val input = com.amazonaws.services.machinelearning.model.GetDataSourceRequest()
		input.setDataSourceId(this.dataSourceId)
		input.setVerbose(this.verbose)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.getDataSource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning get-data-source")
				.argument("data-source-id", dataSourceId)
				.option("verbose", verbose ?: false)
	}

}


fun AmazonMachineLearningFunctions.getEvaluation(evaluationId: String, init: AmazonMachineLearningGetEvaluationCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningGetEvaluationCommand(evaluationId).apply(init))
}

@Generated
class AmazonMachineLearningGetEvaluationCommand(val evaluationId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.GetEvaluationRequest> {



	override fun build(): com.amazonaws.services.machinelearning.model.GetEvaluationRequest {
		val input = com.amazonaws.services.machinelearning.model.GetEvaluationRequest()
		input.setEvaluationId(this.evaluationId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.getEvaluation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning get-evaluation")
				.argument("evaluation-id", evaluationId)
	}

}


fun AmazonMachineLearningFunctions.getMLModel(mLModelId: String, init: AmazonMachineLearningGetMLModelCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningGetMLModelCommand(mLModelId).apply(init))
}

@Generated
class AmazonMachineLearningGetMLModelCommand(val mLModelId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.GetMLModelRequest> {

	var verbose: Boolean? = false

	override fun build(): com.amazonaws.services.machinelearning.model.GetMLModelRequest {
		val input = com.amazonaws.services.machinelearning.model.GetMLModelRequest()
		input.setMLModelId(this.mLModelId)
		input.setVerbose(this.verbose)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.getMLModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning get-mlmodel")
				.argument("mlmodel-id", mLModelId)
				.option("verbose", verbose ?: false)
	}

}


fun AmazonMachineLearningFunctions.predict(mLModelId: String, record: Map<String, String>, predictEndpoint: String, init: AmazonMachineLearningPredictCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningPredictCommand(mLModelId, record, predictEndpoint).apply(init))
}

@Generated
class AmazonMachineLearningPredictCommand(val mLModelId: String, val record: Map<String, String>, val predictEndpoint: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.PredictRequest> {



	override fun build(): com.amazonaws.services.machinelearning.model.PredictRequest {
		val input = com.amazonaws.services.machinelearning.model.PredictRequest()
		input.setMLModelId(this.mLModelId)
		input.setRecord(this.record)
		input.setPredictEndpoint(this.predictEndpoint)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.predict(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning predict")
				.argument("mlmodel-id", mLModelId)
				.argument("record", record.toString())
				.argument("predict-endpoint", predictEndpoint)
	}

}


fun AmazonMachineLearningFunctions.updateBatchPrediction(batchPredictionId: String, batchPredictionName: String, init: AmazonMachineLearningUpdateBatchPredictionCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningUpdateBatchPredictionCommand(batchPredictionId, batchPredictionName).apply(init))
}

@Generated
class AmazonMachineLearningUpdateBatchPredictionCommand(val batchPredictionId: String, val batchPredictionName: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest> {



	override fun build(): com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest {
		val input = com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest()
		input.setBatchPredictionId(this.batchPredictionId)
		input.setBatchPredictionName(this.batchPredictionName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.updateBatchPrediction(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning update-batch-prediction")
				.argument("batch-prediction-id", batchPredictionId)
				.argument("batch-prediction-name", batchPredictionName)
	}

}


fun AmazonMachineLearningFunctions.updateDataSource(dataSourceId: String, dataSourceName: String, init: AmazonMachineLearningUpdateDataSourceCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningUpdateDataSourceCommand(dataSourceId, dataSourceName).apply(init))
}

@Generated
class AmazonMachineLearningUpdateDataSourceCommand(val dataSourceId: String, val dataSourceName: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest> {



	override fun build(): com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest {
		val input = com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest()
		input.setDataSourceId(this.dataSourceId)
		input.setDataSourceName(this.dataSourceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.updateDataSource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning update-data-source")
				.argument("data-source-id", dataSourceId)
				.argument("data-source-name", dataSourceName)
	}

}


fun AmazonMachineLearningFunctions.updateEvaluation(evaluationId: String, evaluationName: String, init: AmazonMachineLearningUpdateEvaluationCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningUpdateEvaluationCommand(evaluationId, evaluationName).apply(init))
}

@Generated
class AmazonMachineLearningUpdateEvaluationCommand(val evaluationId: String, val evaluationName: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest> {



	override fun build(): com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest {
		val input = com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest()
		input.setEvaluationId(this.evaluationId)
		input.setEvaluationName(this.evaluationName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.updateEvaluation(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning update-evaluation")
				.argument("evaluation-id", evaluationId)
				.argument("evaluation-name", evaluationName)
	}

}


fun AmazonMachineLearningFunctions.updateMLModel(mLModelId: String, init: AmazonMachineLearningUpdateMLModelCommand.() -> Unit) {
	this.block.declare(AmazonMachineLearningUpdateMLModelCommand(mLModelId).apply(init))
}

@Generated
class AmazonMachineLearningUpdateMLModelCommand(val mLModelId: String) : AmazonWebServiceCommand<com.amazonaws.services.machinelearning.model.UpdateMLModelRequest> {

	var mLModelName: String? = null
	var scoreThreshold: Float? = 0f

	override fun build(): com.amazonaws.services.machinelearning.model.UpdateMLModelRequest {
		val input = com.amazonaws.services.machinelearning.model.UpdateMLModelRequest()
		input.setMLModelId(this.mLModelId)
		input.setMLModelName(this.mLModelName)
		input.setScoreThreshold(this.scoreThreshold)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.machinelearning.updateMLModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws machinelearning update-mlmodel")
				.argument("mlmodel-id", mLModelId)
				.argument("mlmodel-name", mLModelName)
				.argument("score-threshold", scoreThreshold?.toString())
	}

}
