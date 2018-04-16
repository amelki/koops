
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.sagemaker

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.sagemaker.*
import com.amazonaws.services.sagemaker.model.*

var com.codingue.koops.core.Environment.sagemaker: AmazonSageMaker
	get() {
		var service = this.capabilities["aws-sagemaker"]
		if (service == null) {
			service = AmazonSageMakerClientBuilder.standard().build()
			this.capabilities["aws-sagemaker"] = service
		}
		return service as AmazonSageMaker
	}
	set(sagemaker) {
		this.capabilities["aws-sagemaker"] = sagemaker
	}

@Generated
class AmazonSageMakerFunctions(val block: Block)

infix fun <T> AwsContinuation.sagemaker(init: AmazonSageMakerFunctions.() -> T): T {
	return AmazonSageMakerFunctions(shell).run(init)
}

			

fun AmazonSageMakerFunctions.addTags(resourceArn: String, tags: List<com.amazonaws.services.sagemaker.model.Tag>, init: (AmazonSageMakerAddTagsCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.AddTagsResult {
	return this.block.declare(AmazonSageMakerAddTagsCommand(resourceArn, tags).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.AddTagsResult
}

@Generated
class AmazonSageMakerAddTagsCommand(val resourceArn: String, val tags: List<com.amazonaws.services.sagemaker.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.AddTagsRequest, com.amazonaws.services.sagemaker.model.AddTagsResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.AddTagsRequest {
		val input = com.amazonaws.services.sagemaker.model.AddTagsRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.AddTagsResult {
	  return com.amazonaws.services.sagemaker.model.AddTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.AddTagsResult {
		return environment.sagemaker.addTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker add-tags")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags.toString())
	}

}


fun AmazonSageMakerFunctions.createEndpoint(endpointName: String, endpointConfigName: String, init: (AmazonSageMakerCreateEndpointCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.CreateEndpointResult {
	return this.block.declare(AmazonSageMakerCreateEndpointCommand(endpointName, endpointConfigName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.CreateEndpointResult
}

@Generated
class AmazonSageMakerCreateEndpointCommand(val endpointName: String, val endpointConfigName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.CreateEndpointRequest, com.amazonaws.services.sagemaker.model.CreateEndpointResult> {

	var tags: List<com.amazonaws.services.sagemaker.model.Tag>? = null

	override fun build(): com.amazonaws.services.sagemaker.model.CreateEndpointRequest {
		val input = com.amazonaws.services.sagemaker.model.CreateEndpointRequest()
		input.setEndpointName(this.endpointName)
		input.setEndpointConfigName(this.endpointConfigName)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.CreateEndpointResult {
	  return com.amazonaws.services.sagemaker.model.CreateEndpointResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.CreateEndpointResult {
		return environment.sagemaker.createEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker create-endpoint")
				.argument("endpoint-name", endpointName)
				.argument("endpoint-config-name", endpointConfigName)
				.argument("tags", tags?.toString())
	}

}


fun AmazonSageMakerFunctions.createEndpointConfig(endpointConfigName: String, productionVariants: List<com.amazonaws.services.sagemaker.model.ProductionVariant>, init: (AmazonSageMakerCreateEndpointConfigCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.CreateEndpointConfigResult {
	return this.block.declare(AmazonSageMakerCreateEndpointConfigCommand(endpointConfigName, productionVariants).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.CreateEndpointConfigResult
}

@Generated
class AmazonSageMakerCreateEndpointConfigCommand(val endpointConfigName: String, val productionVariants: List<com.amazonaws.services.sagemaker.model.ProductionVariant>) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.CreateEndpointConfigRequest, com.amazonaws.services.sagemaker.model.CreateEndpointConfigResult> {

	var tags: List<com.amazonaws.services.sagemaker.model.Tag>? = null
	var kmsKeyId: String? = null

	override fun build(): com.amazonaws.services.sagemaker.model.CreateEndpointConfigRequest {
		val input = com.amazonaws.services.sagemaker.model.CreateEndpointConfigRequest()
		input.setEndpointConfigName(this.endpointConfigName)
		input.setProductionVariants(this.productionVariants)
		input.setTags(this.tags)
		input.setKmsKeyId(this.kmsKeyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.CreateEndpointConfigResult {
	  return com.amazonaws.services.sagemaker.model.CreateEndpointConfigResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.CreateEndpointConfigResult {
		return environment.sagemaker.createEndpointConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker create-endpoint-config")
				.argument("endpoint-config-name", endpointConfigName)
				.argument("production-variants", productionVariants.toString())
				.argument("tags", tags?.toString())
				.argument("kms-key-id", kmsKeyId)
	}

}


fun AmazonSageMakerFunctions.createModel(modelName: String, primaryContainer: com.amazonaws.services.sagemaker.model.ContainerDefinition, executionRoleArn: String, init: (AmazonSageMakerCreateModelCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.CreateModelResult {
	return this.block.declare(AmazonSageMakerCreateModelCommand(modelName, primaryContainer, executionRoleArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.CreateModelResult
}

@Generated
class AmazonSageMakerCreateModelCommand(val modelName: String, val primaryContainer: com.amazonaws.services.sagemaker.model.ContainerDefinition, val executionRoleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.CreateModelRequest, com.amazonaws.services.sagemaker.model.CreateModelResult> {

	var tags: List<com.amazonaws.services.sagemaker.model.Tag>? = null

	override fun build(): com.amazonaws.services.sagemaker.model.CreateModelRequest {
		val input = com.amazonaws.services.sagemaker.model.CreateModelRequest()
		input.setModelName(this.modelName)
		input.setPrimaryContainer(this.primaryContainer)
		input.setExecutionRoleArn(this.executionRoleArn)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.CreateModelResult {
	  return com.amazonaws.services.sagemaker.model.CreateModelResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.CreateModelResult {
		return environment.sagemaker.createModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker create-model")
				.argument("model-name", modelName)
				.argument("primary-container", primaryContainer.toString())
				.argument("execution-role-arn", executionRoleArn)
				.argument("tags", tags?.toString())
	}

}


fun AmazonSageMakerFunctions.createNotebookInstance(notebookInstanceName: String, instanceType: InstanceType, roleArn: String, init: (AmazonSageMakerCreateNotebookInstanceCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.CreateNotebookInstanceResult {
	return this.block.declare(AmazonSageMakerCreateNotebookInstanceCommand(notebookInstanceName, instanceType, roleArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.CreateNotebookInstanceResult
}

@Generated
class AmazonSageMakerCreateNotebookInstanceCommand(val notebookInstanceName: String, val instanceType: InstanceType, val roleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.CreateNotebookInstanceRequest, com.amazonaws.services.sagemaker.model.CreateNotebookInstanceResult> {

	var subnetId: String? = null
	var securityGroupIds: List<String>? = null
	var kmsKeyId: String? = null
	var tags: List<com.amazonaws.services.sagemaker.model.Tag>? = null
	var lifecycleConfigName: String? = null
	var directInternetAccess: DirectInternetAccess? = null

	override fun build(): com.amazonaws.services.sagemaker.model.CreateNotebookInstanceRequest {
		val input = com.amazonaws.services.sagemaker.model.CreateNotebookInstanceRequest()
		input.setNotebookInstanceName(this.notebookInstanceName)
		input.setInstanceType(this.instanceType.toString())
		input.setSubnetId(this.subnetId)
		input.setSecurityGroupIds(this.securityGroupIds)
		input.setRoleArn(this.roleArn)
		input.setKmsKeyId(this.kmsKeyId)
		input.setTags(this.tags)
		input.setLifecycleConfigName(this.lifecycleConfigName)
		input.setDirectInternetAccess(this.directInternetAccess?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.CreateNotebookInstanceResult {
	  return com.amazonaws.services.sagemaker.model.CreateNotebookInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.CreateNotebookInstanceResult {
		return environment.sagemaker.createNotebookInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker create-notebook-instance")
				.argument("notebook-instance-name", notebookInstanceName)
				.argument("instance-type", instanceType.toString())
				.argument("subnet-id", subnetId)
				.argument("security-group-ids", securityGroupIds?.toString())
				.argument("role-arn", roleArn)
				.argument("kms-key-id", kmsKeyId)
				.argument("tags", tags?.toString())
				.argument("lifecycle-config-name", lifecycleConfigName)
				.argument("direct-internet-access", directInternetAccess?.toString())
	}

}


fun AmazonSageMakerFunctions.createNotebookInstanceLifecycleConfig(notebookInstanceLifecycleConfigName: String, init: (AmazonSageMakerCreateNotebookInstanceLifecycleConfigCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigResult {
	return this.block.declare(AmazonSageMakerCreateNotebookInstanceLifecycleConfigCommand(notebookInstanceLifecycleConfigName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigResult
}

@Generated
class AmazonSageMakerCreateNotebookInstanceLifecycleConfigCommand(val notebookInstanceLifecycleConfigName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigRequest, com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigResult> {

	var onCreate: List<com.amazonaws.services.sagemaker.model.NotebookInstanceLifecycleHook>? = null
	var onStart: List<com.amazonaws.services.sagemaker.model.NotebookInstanceLifecycleHook>? = null

	override fun build(): com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigRequest {
		val input = com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigRequest()
		input.setNotebookInstanceLifecycleConfigName(this.notebookInstanceLifecycleConfigName)
		input.setOnCreate(this.onCreate)
		input.setOnStart(this.onStart)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigResult {
	  return com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigResult {
		return environment.sagemaker.createNotebookInstanceLifecycleConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker create-notebook-instance-lifecycle-config")
				.argument("notebook-instance-lifecycle-config-name", notebookInstanceLifecycleConfigName)
				.argument("on-create", onCreate?.toString())
				.argument("on-start", onStart?.toString())
	}

}


fun AmazonSageMakerFunctions.createPresignedNotebookInstanceUrl(notebookInstanceName: String, init: (AmazonSageMakerCreatePresignedNotebookInstanceUrlCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlResult {
	return this.block.declare(AmazonSageMakerCreatePresignedNotebookInstanceUrlCommand(notebookInstanceName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlResult
}

@Generated
class AmazonSageMakerCreatePresignedNotebookInstanceUrlCommand(val notebookInstanceName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlRequest, com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlResult> {

	var sessionExpirationDurationInSeconds: Int? = 0

	override fun build(): com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlRequest {
		val input = com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlRequest()
		input.setNotebookInstanceName(this.notebookInstanceName)
		input.setSessionExpirationDurationInSeconds(this.sessionExpirationDurationInSeconds)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlResult {
	  return com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlResult {
		return environment.sagemaker.createPresignedNotebookInstanceUrl(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker create-presigned-notebook-instance-url")
				.argument("notebook-instance-name", notebookInstanceName)
				.argument("session-expiration-duration-in-seconds", sessionExpirationDurationInSeconds?.toString())
	}

}


fun AmazonSageMakerFunctions.createTrainingJob(trainingJobName: String, algorithmSpecification: com.amazonaws.services.sagemaker.model.AlgorithmSpecification, roleArn: String, inputDataConfig: List<com.amazonaws.services.sagemaker.model.Channel>, outputDataConfig: com.amazonaws.services.sagemaker.model.OutputDataConfig, resourceConfig: com.amazonaws.services.sagemaker.model.ResourceConfig, stoppingCondition: com.amazonaws.services.sagemaker.model.StoppingCondition, init: (AmazonSageMakerCreateTrainingJobCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.CreateTrainingJobResult {
	return this.block.declare(AmazonSageMakerCreateTrainingJobCommand(trainingJobName, algorithmSpecification, roleArn, inputDataConfig, outputDataConfig, resourceConfig, stoppingCondition).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.CreateTrainingJobResult
}

@Generated
class AmazonSageMakerCreateTrainingJobCommand(val trainingJobName: String, val algorithmSpecification: com.amazonaws.services.sagemaker.model.AlgorithmSpecification, val roleArn: String, val inputDataConfig: List<com.amazonaws.services.sagemaker.model.Channel>, val outputDataConfig: com.amazonaws.services.sagemaker.model.OutputDataConfig, val resourceConfig: com.amazonaws.services.sagemaker.model.ResourceConfig, val stoppingCondition: com.amazonaws.services.sagemaker.model.StoppingCondition) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.CreateTrainingJobRequest, com.amazonaws.services.sagemaker.model.CreateTrainingJobResult> {

	var hyperParameters: Map<String, String>? = null
	var tags: List<com.amazonaws.services.sagemaker.model.Tag>? = null

	override fun build(): com.amazonaws.services.sagemaker.model.CreateTrainingJobRequest {
		val input = com.amazonaws.services.sagemaker.model.CreateTrainingJobRequest()
		input.setTrainingJobName(this.trainingJobName)
		input.setHyperParameters(this.hyperParameters)
		input.setAlgorithmSpecification(this.algorithmSpecification)
		input.setRoleArn(this.roleArn)
		input.setInputDataConfig(this.inputDataConfig)
		input.setOutputDataConfig(this.outputDataConfig)
		input.setResourceConfig(this.resourceConfig)
		input.setStoppingCondition(this.stoppingCondition)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.CreateTrainingJobResult {
	  return com.amazonaws.services.sagemaker.model.CreateTrainingJobResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.CreateTrainingJobResult {
		return environment.sagemaker.createTrainingJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker create-training-job")
				.argument("training-job-name", trainingJobName)
				.argument("hyper-parameters", hyperParameters?.toString())
				.argument("algorithm-specification", algorithmSpecification.toString())
				.argument("role-arn", roleArn)
				.argument("input-data-config", inputDataConfig.toString())
				.argument("output-data-config", outputDataConfig.toString())
				.argument("resource-config", resourceConfig.toString())
				.argument("stopping-condition", stoppingCondition.toString())
				.argument("tags", tags?.toString())
	}

}


fun AmazonSageMakerFunctions.deleteEndpoint(endpointName: String, init: (AmazonSageMakerDeleteEndpointCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.DeleteEndpointResult {
	return this.block.declare(AmazonSageMakerDeleteEndpointCommand(endpointName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.DeleteEndpointResult
}

@Generated
class AmazonSageMakerDeleteEndpointCommand(val endpointName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DeleteEndpointRequest, com.amazonaws.services.sagemaker.model.DeleteEndpointResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.DeleteEndpointRequest {
		val input = com.amazonaws.services.sagemaker.model.DeleteEndpointRequest()
		input.setEndpointName(this.endpointName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.DeleteEndpointResult {
	  return com.amazonaws.services.sagemaker.model.DeleteEndpointResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.DeleteEndpointResult {
		return environment.sagemaker.deleteEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker delete-endpoint")
				.argument("endpoint-name", endpointName)
	}

}


fun AmazonSageMakerFunctions.deleteEndpointConfig(endpointConfigName: String, init: (AmazonSageMakerDeleteEndpointConfigCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.DeleteEndpointConfigResult {
	return this.block.declare(AmazonSageMakerDeleteEndpointConfigCommand(endpointConfigName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.DeleteEndpointConfigResult
}

@Generated
class AmazonSageMakerDeleteEndpointConfigCommand(val endpointConfigName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DeleteEndpointConfigRequest, com.amazonaws.services.sagemaker.model.DeleteEndpointConfigResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.DeleteEndpointConfigRequest {
		val input = com.amazonaws.services.sagemaker.model.DeleteEndpointConfigRequest()
		input.setEndpointConfigName(this.endpointConfigName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.DeleteEndpointConfigResult {
	  return com.amazonaws.services.sagemaker.model.DeleteEndpointConfigResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.DeleteEndpointConfigResult {
		return environment.sagemaker.deleteEndpointConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker delete-endpoint-config")
				.argument("endpoint-config-name", endpointConfigName)
	}

}


fun AmazonSageMakerFunctions.deleteModel(modelName: String, init: (AmazonSageMakerDeleteModelCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.DeleteModelResult {
	return this.block.declare(AmazonSageMakerDeleteModelCommand(modelName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.DeleteModelResult
}

@Generated
class AmazonSageMakerDeleteModelCommand(val modelName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DeleteModelRequest, com.amazonaws.services.sagemaker.model.DeleteModelResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.DeleteModelRequest {
		val input = com.amazonaws.services.sagemaker.model.DeleteModelRequest()
		input.setModelName(this.modelName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.DeleteModelResult {
	  return com.amazonaws.services.sagemaker.model.DeleteModelResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.DeleteModelResult {
		return environment.sagemaker.deleteModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker delete-model")
				.argument("model-name", modelName)
	}

}


fun AmazonSageMakerFunctions.deleteNotebookInstance(notebookInstanceName: String, init: (AmazonSageMakerDeleteNotebookInstanceCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceResult {
	return this.block.declare(AmazonSageMakerDeleteNotebookInstanceCommand(notebookInstanceName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceResult
}

@Generated
class AmazonSageMakerDeleteNotebookInstanceCommand(val notebookInstanceName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceRequest, com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceRequest {
		val input = com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceRequest()
		input.setNotebookInstanceName(this.notebookInstanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceResult {
	  return com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceResult {
		return environment.sagemaker.deleteNotebookInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker delete-notebook-instance")
				.argument("notebook-instance-name", notebookInstanceName)
	}

}


fun AmazonSageMakerFunctions.deleteNotebookInstanceLifecycleConfig(notebookInstanceLifecycleConfigName: String, init: (AmazonSageMakerDeleteNotebookInstanceLifecycleConfigCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigResult {
	return this.block.declare(AmazonSageMakerDeleteNotebookInstanceLifecycleConfigCommand(notebookInstanceLifecycleConfigName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigResult
}

@Generated
class AmazonSageMakerDeleteNotebookInstanceLifecycleConfigCommand(val notebookInstanceLifecycleConfigName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigRequest, com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigRequest {
		val input = com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigRequest()
		input.setNotebookInstanceLifecycleConfigName(this.notebookInstanceLifecycleConfigName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigResult {
	  return com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigResult {
		return environment.sagemaker.deleteNotebookInstanceLifecycleConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker delete-notebook-instance-lifecycle-config")
				.argument("notebook-instance-lifecycle-config-name", notebookInstanceLifecycleConfigName)
	}

}


fun AmazonSageMakerFunctions.deleteTags(resourceArn: String, tagKeys: List<String>, init: (AmazonSageMakerDeleteTagsCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.DeleteTagsResult {
	return this.block.declare(AmazonSageMakerDeleteTagsCommand(resourceArn, tagKeys).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.DeleteTagsResult
}

@Generated
class AmazonSageMakerDeleteTagsCommand(val resourceArn: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DeleteTagsRequest, com.amazonaws.services.sagemaker.model.DeleteTagsResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.DeleteTagsRequest {
		val input = com.amazonaws.services.sagemaker.model.DeleteTagsRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.DeleteTagsResult {
	  return com.amazonaws.services.sagemaker.model.DeleteTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.DeleteTagsResult {
		return environment.sagemaker.deleteTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker delete-tags")
				.argument("resource-arn", resourceArn)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonSageMakerFunctions.describeEndpoint(endpointName: String, init: (AmazonSageMakerDescribeEndpointCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.DescribeEndpointResult {
	return this.block.declare(AmazonSageMakerDescribeEndpointCommand(endpointName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.DescribeEndpointResult
}

@Generated
class AmazonSageMakerDescribeEndpointCommand(val endpointName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DescribeEndpointRequest, com.amazonaws.services.sagemaker.model.DescribeEndpointResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.DescribeEndpointRequest {
		val input = com.amazonaws.services.sagemaker.model.DescribeEndpointRequest()
		input.setEndpointName(this.endpointName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.DescribeEndpointResult {
	  return com.amazonaws.services.sagemaker.model.DescribeEndpointResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.DescribeEndpointResult {
		return environment.sagemaker.describeEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker describe-endpoint")
				.argument("endpoint-name", endpointName)
	}

}


fun AmazonSageMakerFunctions.describeEndpointConfig(endpointConfigName: String, init: (AmazonSageMakerDescribeEndpointConfigCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.DescribeEndpointConfigResult {
	return this.block.declare(AmazonSageMakerDescribeEndpointConfigCommand(endpointConfigName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.DescribeEndpointConfigResult
}

@Generated
class AmazonSageMakerDescribeEndpointConfigCommand(val endpointConfigName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DescribeEndpointConfigRequest, com.amazonaws.services.sagemaker.model.DescribeEndpointConfigResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.DescribeEndpointConfigRequest {
		val input = com.amazonaws.services.sagemaker.model.DescribeEndpointConfigRequest()
		input.setEndpointConfigName(this.endpointConfigName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.DescribeEndpointConfigResult {
	  return com.amazonaws.services.sagemaker.model.DescribeEndpointConfigResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.DescribeEndpointConfigResult {
		return environment.sagemaker.describeEndpointConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker describe-endpoint-config")
				.argument("endpoint-config-name", endpointConfigName)
	}

}


fun AmazonSageMakerFunctions.describeModel(modelName: String, init: (AmazonSageMakerDescribeModelCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.DescribeModelResult {
	return this.block.declare(AmazonSageMakerDescribeModelCommand(modelName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.DescribeModelResult
}

@Generated
class AmazonSageMakerDescribeModelCommand(val modelName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DescribeModelRequest, com.amazonaws.services.sagemaker.model.DescribeModelResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.DescribeModelRequest {
		val input = com.amazonaws.services.sagemaker.model.DescribeModelRequest()
		input.setModelName(this.modelName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.DescribeModelResult {
	  return com.amazonaws.services.sagemaker.model.DescribeModelResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.DescribeModelResult {
		return environment.sagemaker.describeModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker describe-model")
				.argument("model-name", modelName)
	}

}


fun AmazonSageMakerFunctions.describeNotebookInstance(notebookInstanceName: String, init: (AmazonSageMakerDescribeNotebookInstanceCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceResult {
	return this.block.declare(AmazonSageMakerDescribeNotebookInstanceCommand(notebookInstanceName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceResult
}

@Generated
class AmazonSageMakerDescribeNotebookInstanceCommand(val notebookInstanceName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceRequest, com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceRequest {
		val input = com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceRequest()
		input.setNotebookInstanceName(this.notebookInstanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceResult {
	  return com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceResult {
		return environment.sagemaker.describeNotebookInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker describe-notebook-instance")
				.argument("notebook-instance-name", notebookInstanceName)
	}

}


fun AmazonSageMakerFunctions.describeNotebookInstanceLifecycleConfig(notebookInstanceLifecycleConfigName: String, init: (AmazonSageMakerDescribeNotebookInstanceLifecycleConfigCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigResult {
	return this.block.declare(AmazonSageMakerDescribeNotebookInstanceLifecycleConfigCommand(notebookInstanceLifecycleConfigName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigResult
}

@Generated
class AmazonSageMakerDescribeNotebookInstanceLifecycleConfigCommand(val notebookInstanceLifecycleConfigName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigRequest, com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigRequest {
		val input = com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigRequest()
		input.setNotebookInstanceLifecycleConfigName(this.notebookInstanceLifecycleConfigName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigResult {
	  return com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigResult {
		return environment.sagemaker.describeNotebookInstanceLifecycleConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker describe-notebook-instance-lifecycle-config")
				.argument("notebook-instance-lifecycle-config-name", notebookInstanceLifecycleConfigName)
	}

}


fun AmazonSageMakerFunctions.describeTrainingJob(trainingJobName: String, init: (AmazonSageMakerDescribeTrainingJobCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.DescribeTrainingJobResult {
	return this.block.declare(AmazonSageMakerDescribeTrainingJobCommand(trainingJobName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.DescribeTrainingJobResult
}

@Generated
class AmazonSageMakerDescribeTrainingJobCommand(val trainingJobName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DescribeTrainingJobRequest, com.amazonaws.services.sagemaker.model.DescribeTrainingJobResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.DescribeTrainingJobRequest {
		val input = com.amazonaws.services.sagemaker.model.DescribeTrainingJobRequest()
		input.setTrainingJobName(this.trainingJobName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.DescribeTrainingJobResult {
	  return com.amazonaws.services.sagemaker.model.DescribeTrainingJobResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.DescribeTrainingJobResult {
		return environment.sagemaker.describeTrainingJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker describe-training-job")
				.argument("training-job-name", trainingJobName)
	}

}


fun AmazonSageMakerFunctions.listEndpointConfigs(init: (AmazonSageMakerListEndpointConfigsCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.ListEndpointConfigsResult {
	return this.block.declare(AmazonSageMakerListEndpointConfigsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.ListEndpointConfigsResult
}

@Generated
class AmazonSageMakerListEndpointConfigsCommand() : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.ListEndpointConfigsRequest, com.amazonaws.services.sagemaker.model.ListEndpointConfigsResult> {

	var sortBy: EndpointConfigSortKey? = null
	var sortOrder: OrderKey? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var nameContains: String? = null
	var creationTimeBefore: java.util.Date? = null
	var creationTimeAfter: java.util.Date? = null

	override fun build(): com.amazonaws.services.sagemaker.model.ListEndpointConfigsRequest {
		val input = com.amazonaws.services.sagemaker.model.ListEndpointConfigsRequest()
		input.setSortBy(this.sortBy?.toString())
		input.setSortOrder(this.sortOrder?.toString())
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setNameContains(this.nameContains)
		input.setCreationTimeBefore(this.creationTimeBefore)
		input.setCreationTimeAfter(this.creationTimeAfter)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.ListEndpointConfigsResult {
	  return com.amazonaws.services.sagemaker.model.ListEndpointConfigsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.ListEndpointConfigsResult {
		return environment.sagemaker.listEndpointConfigs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker list-endpoint-configs")
				.argument("sort-by", sortBy?.toString())
				.argument("sort-order", sortOrder?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("name-contains", nameContains)
				.argument("creation-time-before", creationTimeBefore?.toString())
				.argument("creation-time-after", creationTimeAfter?.toString())
	}

}


fun AmazonSageMakerFunctions.listEndpoints(init: (AmazonSageMakerListEndpointsCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.ListEndpointsResult {
	return this.block.declare(AmazonSageMakerListEndpointsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.ListEndpointsResult
}

@Generated
class AmazonSageMakerListEndpointsCommand() : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.ListEndpointsRequest, com.amazonaws.services.sagemaker.model.ListEndpointsResult> {

	var sortBy: EndpointSortKey? = null
	var sortOrder: OrderKey? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var nameContains: String? = null
	var creationTimeBefore: java.util.Date? = null
	var creationTimeAfter: java.util.Date? = null
	var lastModifiedTimeBefore: java.util.Date? = null
	var lastModifiedTimeAfter: java.util.Date? = null
	var statusEquals: EndpointStatus? = null

	override fun build(): com.amazonaws.services.sagemaker.model.ListEndpointsRequest {
		val input = com.amazonaws.services.sagemaker.model.ListEndpointsRequest()
		input.setSortBy(this.sortBy?.toString())
		input.setSortOrder(this.sortOrder?.toString())
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setNameContains(this.nameContains)
		input.setCreationTimeBefore(this.creationTimeBefore)
		input.setCreationTimeAfter(this.creationTimeAfter)
		input.setLastModifiedTimeBefore(this.lastModifiedTimeBefore)
		input.setLastModifiedTimeAfter(this.lastModifiedTimeAfter)
		input.setStatusEquals(this.statusEquals?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.ListEndpointsResult {
	  return com.amazonaws.services.sagemaker.model.ListEndpointsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.ListEndpointsResult {
		return environment.sagemaker.listEndpoints(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker list-endpoints")
				.argument("sort-by", sortBy?.toString())
				.argument("sort-order", sortOrder?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("name-contains", nameContains)
				.argument("creation-time-before", creationTimeBefore?.toString())
				.argument("creation-time-after", creationTimeAfter?.toString())
				.argument("last-modified-time-before", lastModifiedTimeBefore?.toString())
				.argument("last-modified-time-after", lastModifiedTimeAfter?.toString())
				.argument("status-equals", statusEquals?.toString())
	}

}


fun AmazonSageMakerFunctions.listModels(init: (AmazonSageMakerListModelsCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.ListModelsResult {
	return this.block.declare(AmazonSageMakerListModelsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.ListModelsResult
}

@Generated
class AmazonSageMakerListModelsCommand() : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.ListModelsRequest, com.amazonaws.services.sagemaker.model.ListModelsResult> {

	var sortBy: ModelSortKey? = null
	var sortOrder: OrderKey? = null
	var nextToken: String? = null
	var maxResults: Int? = 0
	var nameContains: String? = null
	var creationTimeBefore: java.util.Date? = null
	var creationTimeAfter: java.util.Date? = null

	override fun build(): com.amazonaws.services.sagemaker.model.ListModelsRequest {
		val input = com.amazonaws.services.sagemaker.model.ListModelsRequest()
		input.setSortBy(this.sortBy?.toString())
		input.setSortOrder(this.sortOrder?.toString())
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setNameContains(this.nameContains)
		input.setCreationTimeBefore(this.creationTimeBefore)
		input.setCreationTimeAfter(this.creationTimeAfter)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.ListModelsResult {
	  return com.amazonaws.services.sagemaker.model.ListModelsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.ListModelsResult {
		return environment.sagemaker.listModels(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker list-models")
				.argument("sort-by", sortBy?.toString())
				.argument("sort-order", sortOrder?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("name-contains", nameContains)
				.argument("creation-time-before", creationTimeBefore?.toString())
				.argument("creation-time-after", creationTimeAfter?.toString())
	}

}


fun AmazonSageMakerFunctions.listNotebookInstanceLifecycleConfigs(init: (AmazonSageMakerListNotebookInstanceLifecycleConfigsCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsResult {
	return this.block.declare(AmazonSageMakerListNotebookInstanceLifecycleConfigsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsResult
}

@Generated
class AmazonSageMakerListNotebookInstanceLifecycleConfigsCommand() : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsRequest, com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var sortBy: NotebookInstanceLifecycleConfigSortKey? = null
	var sortOrder: NotebookInstanceLifecycleConfigSortOrder? = null
	var nameContains: String? = null
	var creationTimeBefore: java.util.Date? = null
	var creationTimeAfter: java.util.Date? = null
	var lastModifiedTimeBefore: java.util.Date? = null
	var lastModifiedTimeAfter: java.util.Date? = null

	override fun build(): com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsRequest {
		val input = com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setSortBy(this.sortBy?.toString())
		input.setSortOrder(this.sortOrder?.toString())
		input.setNameContains(this.nameContains)
		input.setCreationTimeBefore(this.creationTimeBefore)
		input.setCreationTimeAfter(this.creationTimeAfter)
		input.setLastModifiedTimeBefore(this.lastModifiedTimeBefore)
		input.setLastModifiedTimeAfter(this.lastModifiedTimeAfter)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsResult {
	  return com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsResult {
		return environment.sagemaker.listNotebookInstanceLifecycleConfigs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker list-notebook-instance-lifecycle-configs")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("sort-by", sortBy?.toString())
				.argument("sort-order", sortOrder?.toString())
				.argument("name-contains", nameContains)
				.argument("creation-time-before", creationTimeBefore?.toString())
				.argument("creation-time-after", creationTimeAfter?.toString())
				.argument("last-modified-time-before", lastModifiedTimeBefore?.toString())
				.argument("last-modified-time-after", lastModifiedTimeAfter?.toString())
	}

}


fun AmazonSageMakerFunctions.listNotebookInstances(init: (AmazonSageMakerListNotebookInstancesCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.ListNotebookInstancesResult {
	return this.block.declare(AmazonSageMakerListNotebookInstancesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.ListNotebookInstancesResult
}

@Generated
class AmazonSageMakerListNotebookInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.ListNotebookInstancesRequest, com.amazonaws.services.sagemaker.model.ListNotebookInstancesResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var sortBy: NotebookInstanceSortKey? = null
	var sortOrder: NotebookInstanceSortOrder? = null
	var nameContains: String? = null
	var creationTimeBefore: java.util.Date? = null
	var creationTimeAfter: java.util.Date? = null
	var lastModifiedTimeBefore: java.util.Date? = null
	var lastModifiedTimeAfter: java.util.Date? = null
	var statusEquals: NotebookInstanceStatus? = null
	var notebookInstanceLifecycleConfigNameContains: String? = null

	override fun build(): com.amazonaws.services.sagemaker.model.ListNotebookInstancesRequest {
		val input = com.amazonaws.services.sagemaker.model.ListNotebookInstancesRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setSortBy(this.sortBy?.toString())
		input.setSortOrder(this.sortOrder?.toString())
		input.setNameContains(this.nameContains)
		input.setCreationTimeBefore(this.creationTimeBefore)
		input.setCreationTimeAfter(this.creationTimeAfter)
		input.setLastModifiedTimeBefore(this.lastModifiedTimeBefore)
		input.setLastModifiedTimeAfter(this.lastModifiedTimeAfter)
		input.setStatusEquals(this.statusEquals?.toString())
		input.setNotebookInstanceLifecycleConfigNameContains(this.notebookInstanceLifecycleConfigNameContains)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.ListNotebookInstancesResult {
	  return com.amazonaws.services.sagemaker.model.ListNotebookInstancesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.ListNotebookInstancesResult {
		return environment.sagemaker.listNotebookInstances(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker list-notebook-instances")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("sort-by", sortBy?.toString())
				.argument("sort-order", sortOrder?.toString())
				.argument("name-contains", nameContains)
				.argument("creation-time-before", creationTimeBefore?.toString())
				.argument("creation-time-after", creationTimeAfter?.toString())
				.argument("last-modified-time-before", lastModifiedTimeBefore?.toString())
				.argument("last-modified-time-after", lastModifiedTimeAfter?.toString())
				.argument("status-equals", statusEquals?.toString())
				.argument("notebook-instance-lifecycle-config-name-contains", notebookInstanceLifecycleConfigNameContains)
	}

}


fun AmazonSageMakerFunctions.listTags(resourceArn: String, init: (AmazonSageMakerListTagsCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.ListTagsResult {
	return this.block.declare(AmazonSageMakerListTagsCommand(resourceArn).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.ListTagsResult
}

@Generated
class AmazonSageMakerListTagsCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.ListTagsRequest, com.amazonaws.services.sagemaker.model.ListTagsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.sagemaker.model.ListTagsRequest {
		val input = com.amazonaws.services.sagemaker.model.ListTagsRequest()
		input.setResourceArn(this.resourceArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.ListTagsResult {
	  return com.amazonaws.services.sagemaker.model.ListTagsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.ListTagsResult {
		return environment.sagemaker.listTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker list-tags")
				.argument("resource-arn", resourceArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonSageMakerFunctions.listTrainingJobs(init: (AmazonSageMakerListTrainingJobsCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.ListTrainingJobsResult {
	return this.block.declare(AmazonSageMakerListTrainingJobsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.ListTrainingJobsResult
}

@Generated
class AmazonSageMakerListTrainingJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.ListTrainingJobsRequest, com.amazonaws.services.sagemaker.model.ListTrainingJobsResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var creationTimeAfter: java.util.Date? = null
	var creationTimeBefore: java.util.Date? = null
	var lastModifiedTimeAfter: java.util.Date? = null
	var lastModifiedTimeBefore: java.util.Date? = null
	var nameContains: String? = null
	var statusEquals: TrainingJobStatus? = null
	var sortBy: SortBy? = null
	var sortOrder: SortOrder? = null

	override fun build(): com.amazonaws.services.sagemaker.model.ListTrainingJobsRequest {
		val input = com.amazonaws.services.sagemaker.model.ListTrainingJobsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setCreationTimeAfter(this.creationTimeAfter)
		input.setCreationTimeBefore(this.creationTimeBefore)
		input.setLastModifiedTimeAfter(this.lastModifiedTimeAfter)
		input.setLastModifiedTimeBefore(this.lastModifiedTimeBefore)
		input.setNameContains(this.nameContains)
		input.setStatusEquals(this.statusEquals?.toString())
		input.setSortBy(this.sortBy?.toString())
		input.setSortOrder(this.sortOrder?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.ListTrainingJobsResult {
	  return com.amazonaws.services.sagemaker.model.ListTrainingJobsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.ListTrainingJobsResult {
		return environment.sagemaker.listTrainingJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker list-training-jobs")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("creation-time-after", creationTimeAfter?.toString())
				.argument("creation-time-before", creationTimeBefore?.toString())
				.argument("last-modified-time-after", lastModifiedTimeAfter?.toString())
				.argument("last-modified-time-before", lastModifiedTimeBefore?.toString())
				.argument("name-contains", nameContains)
				.argument("status-equals", statusEquals?.toString())
				.argument("sort-by", sortBy?.toString())
				.argument("sort-order", sortOrder?.toString())
	}

}


fun AmazonSageMakerFunctions.startNotebookInstance(notebookInstanceName: String, init: (AmazonSageMakerStartNotebookInstanceCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.StartNotebookInstanceResult {
	return this.block.declare(AmazonSageMakerStartNotebookInstanceCommand(notebookInstanceName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.StartNotebookInstanceResult
}

@Generated
class AmazonSageMakerStartNotebookInstanceCommand(val notebookInstanceName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.StartNotebookInstanceRequest, com.amazonaws.services.sagemaker.model.StartNotebookInstanceResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.StartNotebookInstanceRequest {
		val input = com.amazonaws.services.sagemaker.model.StartNotebookInstanceRequest()
		input.setNotebookInstanceName(this.notebookInstanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.StartNotebookInstanceResult {
	  return com.amazonaws.services.sagemaker.model.StartNotebookInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.StartNotebookInstanceResult {
		return environment.sagemaker.startNotebookInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker start-notebook-instance")
				.argument("notebook-instance-name", notebookInstanceName)
	}

}


fun AmazonSageMakerFunctions.stopNotebookInstance(notebookInstanceName: String, init: (AmazonSageMakerStopNotebookInstanceCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.StopNotebookInstanceResult {
	return this.block.declare(AmazonSageMakerStopNotebookInstanceCommand(notebookInstanceName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.StopNotebookInstanceResult
}

@Generated
class AmazonSageMakerStopNotebookInstanceCommand(val notebookInstanceName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.StopNotebookInstanceRequest, com.amazonaws.services.sagemaker.model.StopNotebookInstanceResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.StopNotebookInstanceRequest {
		val input = com.amazonaws.services.sagemaker.model.StopNotebookInstanceRequest()
		input.setNotebookInstanceName(this.notebookInstanceName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.StopNotebookInstanceResult {
	  return com.amazonaws.services.sagemaker.model.StopNotebookInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.StopNotebookInstanceResult {
		return environment.sagemaker.stopNotebookInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker stop-notebook-instance")
				.argument("notebook-instance-name", notebookInstanceName)
	}

}


fun AmazonSageMakerFunctions.stopTrainingJob(trainingJobName: String, init: (AmazonSageMakerStopTrainingJobCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.StopTrainingJobResult {
	return this.block.declare(AmazonSageMakerStopTrainingJobCommand(trainingJobName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.StopTrainingJobResult
}

@Generated
class AmazonSageMakerStopTrainingJobCommand(val trainingJobName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.StopTrainingJobRequest, com.amazonaws.services.sagemaker.model.StopTrainingJobResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.StopTrainingJobRequest {
		val input = com.amazonaws.services.sagemaker.model.StopTrainingJobRequest()
		input.setTrainingJobName(this.trainingJobName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.StopTrainingJobResult {
	  return com.amazonaws.services.sagemaker.model.StopTrainingJobResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.StopTrainingJobResult {
		return environment.sagemaker.stopTrainingJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker stop-training-job")
				.argument("training-job-name", trainingJobName)
	}

}


fun AmazonSageMakerFunctions.updateEndpoint(endpointName: String, endpointConfigName: String, init: (AmazonSageMakerUpdateEndpointCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.UpdateEndpointResult {
	return this.block.declare(AmazonSageMakerUpdateEndpointCommand(endpointName, endpointConfigName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.UpdateEndpointResult
}

@Generated
class AmazonSageMakerUpdateEndpointCommand(val endpointName: String, val endpointConfigName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.UpdateEndpointRequest, com.amazonaws.services.sagemaker.model.UpdateEndpointResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.UpdateEndpointRequest {
		val input = com.amazonaws.services.sagemaker.model.UpdateEndpointRequest()
		input.setEndpointName(this.endpointName)
		input.setEndpointConfigName(this.endpointConfigName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.UpdateEndpointResult {
	  return com.amazonaws.services.sagemaker.model.UpdateEndpointResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.UpdateEndpointResult {
		return environment.sagemaker.updateEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker update-endpoint")
				.argument("endpoint-name", endpointName)
				.argument("endpoint-config-name", endpointConfigName)
	}

}


fun AmazonSageMakerFunctions.updateEndpointWeightsAndCapacities(endpointName: String, desiredWeightsAndCapacities: List<com.amazonaws.services.sagemaker.model.DesiredWeightAndCapacity>, init: (AmazonSageMakerUpdateEndpointWeightsAndCapacitiesCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesResult {
	return this.block.declare(AmazonSageMakerUpdateEndpointWeightsAndCapacitiesCommand(endpointName, desiredWeightsAndCapacities).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesResult
}

@Generated
class AmazonSageMakerUpdateEndpointWeightsAndCapacitiesCommand(val endpointName: String, val desiredWeightsAndCapacities: List<com.amazonaws.services.sagemaker.model.DesiredWeightAndCapacity>) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesRequest, com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesResult> {



	override fun build(): com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesRequest {
		val input = com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesRequest()
		input.setEndpointName(this.endpointName)
		input.setDesiredWeightsAndCapacities(this.desiredWeightsAndCapacities)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesResult {
	  return com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesResult {
		return environment.sagemaker.updateEndpointWeightsAndCapacities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker update-endpoint-weights-and-capacities")
				.argument("endpoint-name", endpointName)
				.argument("desired-weights-and-capacities", desiredWeightsAndCapacities.toString())
	}

}


fun AmazonSageMakerFunctions.updateNotebookInstance(notebookInstanceName: String, init: (AmazonSageMakerUpdateNotebookInstanceCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceResult {
	return this.block.declare(AmazonSageMakerUpdateNotebookInstanceCommand(notebookInstanceName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceResult
}

@Generated
class AmazonSageMakerUpdateNotebookInstanceCommand(val notebookInstanceName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceRequest, com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceResult> {

	var instanceType: InstanceType? = null
	var roleArn: String? = null

	override fun build(): com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceRequest {
		val input = com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceRequest()
		input.setNotebookInstanceName(this.notebookInstanceName)
		input.setInstanceType(this.instanceType?.toString())
		input.setRoleArn(this.roleArn)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceResult {
	  return com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceResult {
		return environment.sagemaker.updateNotebookInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker update-notebook-instance")
				.argument("notebook-instance-name", notebookInstanceName)
				.argument("instance-type", instanceType?.toString())
				.argument("role-arn", roleArn)
	}

}


fun AmazonSageMakerFunctions.updateNotebookInstanceLifecycleConfig(notebookInstanceLifecycleConfigName: String, init: (AmazonSageMakerUpdateNotebookInstanceLifecycleConfigCommand.() -> Unit)? = null): com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigResult {
	return this.block.declare(AmazonSageMakerUpdateNotebookInstanceLifecycleConfigCommand(notebookInstanceLifecycleConfigName).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigResult
}

@Generated
class AmazonSageMakerUpdateNotebookInstanceLifecycleConfigCommand(val notebookInstanceLifecycleConfigName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigRequest, com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigResult> {

	var onCreate: List<com.amazonaws.services.sagemaker.model.NotebookInstanceLifecycleHook>? = null
	var onStart: List<com.amazonaws.services.sagemaker.model.NotebookInstanceLifecycleHook>? = null

	override fun build(): com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigRequest {
		val input = com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigRequest()
		input.setNotebookInstanceLifecycleConfigName(this.notebookInstanceLifecycleConfigName)
		input.setOnCreate(this.onCreate)
		input.setOnStart(this.onStart)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigResult {
	  return com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigResult {
		return environment.sagemaker.updateNotebookInstanceLifecycleConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker update-notebook-instance-lifecycle-config")
				.argument("notebook-instance-lifecycle-config-name", notebookInstanceLifecycleConfigName)
				.argument("on-create", onCreate?.toString())
				.argument("on-start", onStart?.toString())
	}

}
