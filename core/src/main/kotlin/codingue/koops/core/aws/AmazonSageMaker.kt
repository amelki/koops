
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.sagemaker.AmazonSageMaker
import com.amazonaws.services.sagemaker.model.*

var codingue.koops.core.Environment.sagemaker: AmazonSageMaker
	get() = this.capabilities[AmazonSageMaker::class.java.name] as AmazonSageMaker
	set(sagemaker) {
		this.capabilities[AmazonSageMaker::class.java.name] = sagemaker
	}

@Generated
class AmazonSageMakerFunctions(val block: Block)

infix fun AwsContinuation.sagemaker(init: AmazonSageMakerFunctions.() -> Unit) {
	AmazonSageMakerFunctions(shell).apply(init)
}

			

fun AmazonSageMakerFunctions.addTags(resourceArn: String, tags: List<com.amazonaws.services.sagemaker.model.Tag>, init: AmazonSageMakerAddTagsCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerAddTagsCommand(resourceArn, tags).apply(init))
}

@Generated
class AmazonSageMakerAddTagsCommand(val resourceArn: String, val tags: List<com.amazonaws.services.sagemaker.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.AddTagsRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.AddTagsRequest {
		val input = com.amazonaws.services.sagemaker.model.AddTagsRequest()
		input.setResourceArn(this.resourceArn)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.addTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker add-tags")
				.argument("resource-arn", resourceArn)
				.argument("tags", tags.toString())
	}

}


fun AmazonSageMakerFunctions.createEndpoint(endpointName: String, endpointConfigName: String, init: AmazonSageMakerCreateEndpointCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerCreateEndpointCommand(endpointName, endpointConfigName).apply(init))
}

@Generated
class AmazonSageMakerCreateEndpointCommand(val endpointName: String, val endpointConfigName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.CreateEndpointRequest> {

	var tags: List<com.amazonaws.services.sagemaker.model.Tag>? = null

	override fun build(): com.amazonaws.services.sagemaker.model.CreateEndpointRequest {
		val input = com.amazonaws.services.sagemaker.model.CreateEndpointRequest()
		input.setEndpointName(this.endpointName)
		input.setEndpointConfigName(this.endpointConfigName)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.createEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker create-endpoint")
				.argument("endpoint-name", endpointName)
				.argument("endpoint-config-name", endpointConfigName)
				.argument("tags", tags?.toString())
	}

}


fun AmazonSageMakerFunctions.createEndpointConfig(endpointConfigName: String, productionVariants: List<com.amazonaws.services.sagemaker.model.ProductionVariant>, init: AmazonSageMakerCreateEndpointConfigCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerCreateEndpointConfigCommand(endpointConfigName, productionVariants).apply(init))
}

@Generated
class AmazonSageMakerCreateEndpointConfigCommand(val endpointConfigName: String, val productionVariants: List<com.amazonaws.services.sagemaker.model.ProductionVariant>) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.CreateEndpointConfigRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.createEndpointConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker create-endpoint-config")
				.argument("endpoint-config-name", endpointConfigName)
				.argument("production-variants", productionVariants.toString())
				.argument("tags", tags?.toString())
				.argument("kms-key-id", kmsKeyId)
	}

}


fun AmazonSageMakerFunctions.createModel(modelName: String, primaryContainer: com.amazonaws.services.sagemaker.model.ContainerDefinition, executionRoleArn: String, init: AmazonSageMakerCreateModelCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerCreateModelCommand(modelName, primaryContainer, executionRoleArn).apply(init))
}

@Generated
class AmazonSageMakerCreateModelCommand(val modelName: String, val primaryContainer: com.amazonaws.services.sagemaker.model.ContainerDefinition, val executionRoleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.CreateModelRequest> {

	var tags: List<com.amazonaws.services.sagemaker.model.Tag>? = null

	override fun build(): com.amazonaws.services.sagemaker.model.CreateModelRequest {
		val input = com.amazonaws.services.sagemaker.model.CreateModelRequest()
		input.setModelName(this.modelName)
		input.setPrimaryContainer(this.primaryContainer)
		input.setExecutionRoleArn(this.executionRoleArn)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.createModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker create-model")
				.argument("model-name", modelName)
				.argument("primary-container", primaryContainer.toString())
				.argument("execution-role-arn", executionRoleArn)
				.argument("tags", tags?.toString())
	}

}


fun AmazonSageMakerFunctions.createNotebookInstance(notebookInstanceName: String, instanceType: InstanceType, roleArn: String, init: AmazonSageMakerCreateNotebookInstanceCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerCreateNotebookInstanceCommand(notebookInstanceName, instanceType, roleArn).apply(init))
}

@Generated
class AmazonSageMakerCreateNotebookInstanceCommand(val notebookInstanceName: String, val instanceType: InstanceType, val roleArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.CreateNotebookInstanceRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.createNotebookInstance(build())
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


fun AmazonSageMakerFunctions.createNotebookInstanceLifecycleConfig(notebookInstanceLifecycleConfigName: String, init: AmazonSageMakerCreateNotebookInstanceLifecycleConfigCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerCreateNotebookInstanceLifecycleConfigCommand(notebookInstanceLifecycleConfigName).apply(init))
}

@Generated
class AmazonSageMakerCreateNotebookInstanceLifecycleConfigCommand(val notebookInstanceLifecycleConfigName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigRequest> {

	var onCreate: List<com.amazonaws.services.sagemaker.model.NotebookInstanceLifecycleHook>? = null
	var onStart: List<com.amazonaws.services.sagemaker.model.NotebookInstanceLifecycleHook>? = null

	override fun build(): com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigRequest {
		val input = com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigRequest()
		input.setNotebookInstanceLifecycleConfigName(this.notebookInstanceLifecycleConfigName)
		input.setOnCreate(this.onCreate)
		input.setOnStart(this.onStart)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.createNotebookInstanceLifecycleConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker create-notebook-instance-lifecycle-config")
				.argument("notebook-instance-lifecycle-config-name", notebookInstanceLifecycleConfigName)
				.argument("on-create", onCreate?.toString())
				.argument("on-start", onStart?.toString())
	}

}


fun AmazonSageMakerFunctions.createPresignedNotebookInstanceUrl(notebookInstanceName: String, init: AmazonSageMakerCreatePresignedNotebookInstanceUrlCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerCreatePresignedNotebookInstanceUrlCommand(notebookInstanceName).apply(init))
}

@Generated
class AmazonSageMakerCreatePresignedNotebookInstanceUrlCommand(val notebookInstanceName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlRequest> {

	var sessionExpirationDurationInSeconds: Int? = 0

	override fun build(): com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlRequest {
		val input = com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlRequest()
		input.setNotebookInstanceName(this.notebookInstanceName)
		input.setSessionExpirationDurationInSeconds(this.sessionExpirationDurationInSeconds)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.createPresignedNotebookInstanceUrl(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker create-presigned-notebook-instance-url")
				.argument("notebook-instance-name", notebookInstanceName)
				.argument("session-expiration-duration-in-seconds", sessionExpirationDurationInSeconds?.toString())
	}

}


fun AmazonSageMakerFunctions.createTrainingJob(trainingJobName: String, algorithmSpecification: com.amazonaws.services.sagemaker.model.AlgorithmSpecification, roleArn: String, inputDataConfig: List<com.amazonaws.services.sagemaker.model.Channel>, outputDataConfig: com.amazonaws.services.sagemaker.model.OutputDataConfig, resourceConfig: com.amazonaws.services.sagemaker.model.ResourceConfig, stoppingCondition: com.amazonaws.services.sagemaker.model.StoppingCondition, init: AmazonSageMakerCreateTrainingJobCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerCreateTrainingJobCommand(trainingJobName, algorithmSpecification, roleArn, inputDataConfig, outputDataConfig, resourceConfig, stoppingCondition).apply(init))
}

@Generated
class AmazonSageMakerCreateTrainingJobCommand(val trainingJobName: String, val algorithmSpecification: com.amazonaws.services.sagemaker.model.AlgorithmSpecification, val roleArn: String, val inputDataConfig: List<com.amazonaws.services.sagemaker.model.Channel>, val outputDataConfig: com.amazonaws.services.sagemaker.model.OutputDataConfig, val resourceConfig: com.amazonaws.services.sagemaker.model.ResourceConfig, val stoppingCondition: com.amazonaws.services.sagemaker.model.StoppingCondition) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.CreateTrainingJobRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.createTrainingJob(build())
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


fun AmazonSageMakerFunctions.deleteEndpoint(endpointName: String, init: AmazonSageMakerDeleteEndpointCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerDeleteEndpointCommand(endpointName).apply(init))
}

@Generated
class AmazonSageMakerDeleteEndpointCommand(val endpointName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DeleteEndpointRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.DeleteEndpointRequest {
		val input = com.amazonaws.services.sagemaker.model.DeleteEndpointRequest()
		input.setEndpointName(this.endpointName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.deleteEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker delete-endpoint")
				.argument("endpoint-name", endpointName)
	}

}


fun AmazonSageMakerFunctions.deleteEndpointConfig(endpointConfigName: String, init: AmazonSageMakerDeleteEndpointConfigCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerDeleteEndpointConfigCommand(endpointConfigName).apply(init))
}

@Generated
class AmazonSageMakerDeleteEndpointConfigCommand(val endpointConfigName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DeleteEndpointConfigRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.DeleteEndpointConfigRequest {
		val input = com.amazonaws.services.sagemaker.model.DeleteEndpointConfigRequest()
		input.setEndpointConfigName(this.endpointConfigName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.deleteEndpointConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker delete-endpoint-config")
				.argument("endpoint-config-name", endpointConfigName)
	}

}


fun AmazonSageMakerFunctions.deleteModel(modelName: String, init: AmazonSageMakerDeleteModelCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerDeleteModelCommand(modelName).apply(init))
}

@Generated
class AmazonSageMakerDeleteModelCommand(val modelName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DeleteModelRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.DeleteModelRequest {
		val input = com.amazonaws.services.sagemaker.model.DeleteModelRequest()
		input.setModelName(this.modelName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.deleteModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker delete-model")
				.argument("model-name", modelName)
	}

}


fun AmazonSageMakerFunctions.deleteNotebookInstance(notebookInstanceName: String, init: AmazonSageMakerDeleteNotebookInstanceCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerDeleteNotebookInstanceCommand(notebookInstanceName).apply(init))
}

@Generated
class AmazonSageMakerDeleteNotebookInstanceCommand(val notebookInstanceName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceRequest {
		val input = com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceRequest()
		input.setNotebookInstanceName(this.notebookInstanceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.deleteNotebookInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker delete-notebook-instance")
				.argument("notebook-instance-name", notebookInstanceName)
	}

}


fun AmazonSageMakerFunctions.deleteNotebookInstanceLifecycleConfig(notebookInstanceLifecycleConfigName: String, init: AmazonSageMakerDeleteNotebookInstanceLifecycleConfigCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerDeleteNotebookInstanceLifecycleConfigCommand(notebookInstanceLifecycleConfigName).apply(init))
}

@Generated
class AmazonSageMakerDeleteNotebookInstanceLifecycleConfigCommand(val notebookInstanceLifecycleConfigName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigRequest {
		val input = com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigRequest()
		input.setNotebookInstanceLifecycleConfigName(this.notebookInstanceLifecycleConfigName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.deleteNotebookInstanceLifecycleConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker delete-notebook-instance-lifecycle-config")
				.argument("notebook-instance-lifecycle-config-name", notebookInstanceLifecycleConfigName)
	}

}


fun AmazonSageMakerFunctions.deleteTags(resourceArn: String, tagKeys: List<String>, init: AmazonSageMakerDeleteTagsCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerDeleteTagsCommand(resourceArn, tagKeys).apply(init))
}

@Generated
class AmazonSageMakerDeleteTagsCommand(val resourceArn: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DeleteTagsRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.DeleteTagsRequest {
		val input = com.amazonaws.services.sagemaker.model.DeleteTagsRequest()
		input.setResourceArn(this.resourceArn)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.deleteTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker delete-tags")
				.argument("resource-arn", resourceArn)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonSageMakerFunctions.describeEndpoint(endpointName: String, init: AmazonSageMakerDescribeEndpointCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerDescribeEndpointCommand(endpointName).apply(init))
}

@Generated
class AmazonSageMakerDescribeEndpointCommand(val endpointName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DescribeEndpointRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.DescribeEndpointRequest {
		val input = com.amazonaws.services.sagemaker.model.DescribeEndpointRequest()
		input.setEndpointName(this.endpointName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.describeEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker describe-endpoint")
				.argument("endpoint-name", endpointName)
	}

}


fun AmazonSageMakerFunctions.describeEndpointConfig(endpointConfigName: String, init: AmazonSageMakerDescribeEndpointConfigCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerDescribeEndpointConfigCommand(endpointConfigName).apply(init))
}

@Generated
class AmazonSageMakerDescribeEndpointConfigCommand(val endpointConfigName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DescribeEndpointConfigRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.DescribeEndpointConfigRequest {
		val input = com.amazonaws.services.sagemaker.model.DescribeEndpointConfigRequest()
		input.setEndpointConfigName(this.endpointConfigName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.describeEndpointConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker describe-endpoint-config")
				.argument("endpoint-config-name", endpointConfigName)
	}

}


fun AmazonSageMakerFunctions.describeModel(modelName: String, init: AmazonSageMakerDescribeModelCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerDescribeModelCommand(modelName).apply(init))
}

@Generated
class AmazonSageMakerDescribeModelCommand(val modelName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DescribeModelRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.DescribeModelRequest {
		val input = com.amazonaws.services.sagemaker.model.DescribeModelRequest()
		input.setModelName(this.modelName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.describeModel(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker describe-model")
				.argument("model-name", modelName)
	}

}


fun AmazonSageMakerFunctions.describeNotebookInstance(notebookInstanceName: String, init: AmazonSageMakerDescribeNotebookInstanceCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerDescribeNotebookInstanceCommand(notebookInstanceName).apply(init))
}

@Generated
class AmazonSageMakerDescribeNotebookInstanceCommand(val notebookInstanceName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceRequest {
		val input = com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceRequest()
		input.setNotebookInstanceName(this.notebookInstanceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.describeNotebookInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker describe-notebook-instance")
				.argument("notebook-instance-name", notebookInstanceName)
	}

}


fun AmazonSageMakerFunctions.describeNotebookInstanceLifecycleConfig(notebookInstanceLifecycleConfigName: String, init: AmazonSageMakerDescribeNotebookInstanceLifecycleConfigCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerDescribeNotebookInstanceLifecycleConfigCommand(notebookInstanceLifecycleConfigName).apply(init))
}

@Generated
class AmazonSageMakerDescribeNotebookInstanceLifecycleConfigCommand(val notebookInstanceLifecycleConfigName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigRequest {
		val input = com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigRequest()
		input.setNotebookInstanceLifecycleConfigName(this.notebookInstanceLifecycleConfigName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.describeNotebookInstanceLifecycleConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker describe-notebook-instance-lifecycle-config")
				.argument("notebook-instance-lifecycle-config-name", notebookInstanceLifecycleConfigName)
	}

}


fun AmazonSageMakerFunctions.describeTrainingJob(trainingJobName: String, init: AmazonSageMakerDescribeTrainingJobCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerDescribeTrainingJobCommand(trainingJobName).apply(init))
}

@Generated
class AmazonSageMakerDescribeTrainingJobCommand(val trainingJobName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.DescribeTrainingJobRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.DescribeTrainingJobRequest {
		val input = com.amazonaws.services.sagemaker.model.DescribeTrainingJobRequest()
		input.setTrainingJobName(this.trainingJobName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.describeTrainingJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker describe-training-job")
				.argument("training-job-name", trainingJobName)
	}

}


fun AmazonSageMakerFunctions.listEndpointConfigs(init: AmazonSageMakerListEndpointConfigsCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerListEndpointConfigsCommand().apply(init))
}

@Generated
class AmazonSageMakerListEndpointConfigsCommand() : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.ListEndpointConfigsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.listEndpointConfigs(build())
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


fun AmazonSageMakerFunctions.listEndpoints(init: AmazonSageMakerListEndpointsCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerListEndpointsCommand().apply(init))
}

@Generated
class AmazonSageMakerListEndpointsCommand() : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.ListEndpointsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.listEndpoints(build())
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


fun AmazonSageMakerFunctions.listModels(init: AmazonSageMakerListModelsCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerListModelsCommand().apply(init))
}

@Generated
class AmazonSageMakerListModelsCommand() : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.ListModelsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.listModels(build())
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


fun AmazonSageMakerFunctions.listNotebookInstanceLifecycleConfigs(init: AmazonSageMakerListNotebookInstanceLifecycleConfigsCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerListNotebookInstanceLifecycleConfigsCommand().apply(init))
}

@Generated
class AmazonSageMakerListNotebookInstanceLifecycleConfigsCommand() : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.listNotebookInstanceLifecycleConfigs(build())
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


fun AmazonSageMakerFunctions.listNotebookInstances(init: AmazonSageMakerListNotebookInstancesCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerListNotebookInstancesCommand().apply(init))
}

@Generated
class AmazonSageMakerListNotebookInstancesCommand() : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.ListNotebookInstancesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.listNotebookInstances(build())
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


fun AmazonSageMakerFunctions.listTags(resourceArn: String, init: AmazonSageMakerListTagsCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerListTagsCommand(resourceArn).apply(init))
}

@Generated
class AmazonSageMakerListTagsCommand(val resourceArn: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.ListTagsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.sagemaker.model.ListTagsRequest {
		val input = com.amazonaws.services.sagemaker.model.ListTagsRequest()
		input.setResourceArn(this.resourceArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.listTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker list-tags")
				.argument("resource-arn", resourceArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AmazonSageMakerFunctions.listTrainingJobs(init: AmazonSageMakerListTrainingJobsCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerListTrainingJobsCommand().apply(init))
}

@Generated
class AmazonSageMakerListTrainingJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.ListTrainingJobsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.listTrainingJobs(build())
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


fun AmazonSageMakerFunctions.startNotebookInstance(notebookInstanceName: String, init: AmazonSageMakerStartNotebookInstanceCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerStartNotebookInstanceCommand(notebookInstanceName).apply(init))
}

@Generated
class AmazonSageMakerStartNotebookInstanceCommand(val notebookInstanceName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.StartNotebookInstanceRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.StartNotebookInstanceRequest {
		val input = com.amazonaws.services.sagemaker.model.StartNotebookInstanceRequest()
		input.setNotebookInstanceName(this.notebookInstanceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.startNotebookInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker start-notebook-instance")
				.argument("notebook-instance-name", notebookInstanceName)
	}

}


fun AmazonSageMakerFunctions.stopNotebookInstance(notebookInstanceName: String, init: AmazonSageMakerStopNotebookInstanceCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerStopNotebookInstanceCommand(notebookInstanceName).apply(init))
}

@Generated
class AmazonSageMakerStopNotebookInstanceCommand(val notebookInstanceName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.StopNotebookInstanceRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.StopNotebookInstanceRequest {
		val input = com.amazonaws.services.sagemaker.model.StopNotebookInstanceRequest()
		input.setNotebookInstanceName(this.notebookInstanceName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.stopNotebookInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker stop-notebook-instance")
				.argument("notebook-instance-name", notebookInstanceName)
	}

}


fun AmazonSageMakerFunctions.stopTrainingJob(trainingJobName: String, init: AmazonSageMakerStopTrainingJobCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerStopTrainingJobCommand(trainingJobName).apply(init))
}

@Generated
class AmazonSageMakerStopTrainingJobCommand(val trainingJobName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.StopTrainingJobRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.StopTrainingJobRequest {
		val input = com.amazonaws.services.sagemaker.model.StopTrainingJobRequest()
		input.setTrainingJobName(this.trainingJobName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.stopTrainingJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker stop-training-job")
				.argument("training-job-name", trainingJobName)
	}

}


fun AmazonSageMakerFunctions.updateEndpoint(endpointName: String, endpointConfigName: String, init: AmazonSageMakerUpdateEndpointCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerUpdateEndpointCommand(endpointName, endpointConfigName).apply(init))
}

@Generated
class AmazonSageMakerUpdateEndpointCommand(val endpointName: String, val endpointConfigName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.UpdateEndpointRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.UpdateEndpointRequest {
		val input = com.amazonaws.services.sagemaker.model.UpdateEndpointRequest()
		input.setEndpointName(this.endpointName)
		input.setEndpointConfigName(this.endpointConfigName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.updateEndpoint(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker update-endpoint")
				.argument("endpoint-name", endpointName)
				.argument("endpoint-config-name", endpointConfigName)
	}

}


fun AmazonSageMakerFunctions.updateEndpointWeightsAndCapacities(endpointName: String, desiredWeightsAndCapacities: List<com.amazonaws.services.sagemaker.model.DesiredWeightAndCapacity>, init: AmazonSageMakerUpdateEndpointWeightsAndCapacitiesCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerUpdateEndpointWeightsAndCapacitiesCommand(endpointName, desiredWeightsAndCapacities).apply(init))
}

@Generated
class AmazonSageMakerUpdateEndpointWeightsAndCapacitiesCommand(val endpointName: String, val desiredWeightsAndCapacities: List<com.amazonaws.services.sagemaker.model.DesiredWeightAndCapacity>) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesRequest> {



	override fun build(): com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesRequest {
		val input = com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesRequest()
		input.setEndpointName(this.endpointName)
		input.setDesiredWeightsAndCapacities(this.desiredWeightsAndCapacities)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.updateEndpointWeightsAndCapacities(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker update-endpoint-weights-and-capacities")
				.argument("endpoint-name", endpointName)
				.argument("desired-weights-and-capacities", desiredWeightsAndCapacities.toString())
	}

}


fun AmazonSageMakerFunctions.updateNotebookInstance(notebookInstanceName: String, init: AmazonSageMakerUpdateNotebookInstanceCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerUpdateNotebookInstanceCommand(notebookInstanceName).apply(init))
}

@Generated
class AmazonSageMakerUpdateNotebookInstanceCommand(val notebookInstanceName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceRequest> {

	var instanceType: InstanceType? = null
	var roleArn: String? = null

	override fun build(): com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceRequest {
		val input = com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceRequest()
		input.setNotebookInstanceName(this.notebookInstanceName)
		input.setInstanceType(this.instanceType?.toString())
		input.setRoleArn(this.roleArn)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.updateNotebookInstance(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker update-notebook-instance")
				.argument("notebook-instance-name", notebookInstanceName)
				.argument("instance-type", instanceType?.toString())
				.argument("role-arn", roleArn)
	}

}


fun AmazonSageMakerFunctions.updateNotebookInstanceLifecycleConfig(notebookInstanceLifecycleConfigName: String, init: AmazonSageMakerUpdateNotebookInstanceLifecycleConfigCommand.() -> Unit) {
	this.block.declare(AmazonSageMakerUpdateNotebookInstanceLifecycleConfigCommand(notebookInstanceLifecycleConfigName).apply(init))
}

@Generated
class AmazonSageMakerUpdateNotebookInstanceLifecycleConfigCommand(val notebookInstanceLifecycleConfigName: String) : AmazonWebServiceCommand<com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigRequest> {

	var onCreate: List<com.amazonaws.services.sagemaker.model.NotebookInstanceLifecycleHook>? = null
	var onStart: List<com.amazonaws.services.sagemaker.model.NotebookInstanceLifecycleHook>? = null

	override fun build(): com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigRequest {
		val input = com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigRequest()
		input.setNotebookInstanceLifecycleConfigName(this.notebookInstanceLifecycleConfigName)
		input.setOnCreate(this.onCreate)
		input.setOnStart(this.onStart)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sagemaker.updateNotebookInstanceLifecycleConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sagemaker update-notebook-instance-lifecycle-config")
				.argument("notebook-instance-lifecycle-config-name", notebookInstanceLifecycleConfigName)
				.argument("on-create", onCreate?.toString())
				.argument("on-start", onStart?.toString())
	}

}
