
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.mediastore.*
import com.amazonaws.services.mediastore.model.*

var codingue.koops.core.Environment.mediastore: AWSMediaStore
	get() {
		var service = this.capabilities["aws-mediastore"]
		if (service == null) {
			service = AWSMediaStoreClientBuilder.standard().build()
			this.capabilities["aws-mediastore"] = service
		}
		return service as AWSMediaStore
	}
	set(mediastore) {
		this.capabilities["aws-mediastore"] = mediastore
	}

@Generated
class AWSMediaStoreFunctions(val block: Block)

infix fun <T> AwsContinuation.mediastore(init: AWSMediaStoreFunctions.() -> T): T {
	return AWSMediaStoreFunctions(shell).run(init)
}

			

fun AWSMediaStoreFunctions.createContainer(containerName: String, init: AWSMediaStoreCreateContainerCommand.() -> Unit): com.amazonaws.services.mediastore.model.CreateContainerResult {
	return this.block.declare(AWSMediaStoreCreateContainerCommand(containerName).apply(init)) as com.amazonaws.services.mediastore.model.CreateContainerResult
}

@Generated
class AWSMediaStoreCreateContainerCommand(val containerName: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.CreateContainerRequest, com.amazonaws.services.mediastore.model.CreateContainerResult> {



	override fun build(): com.amazonaws.services.mediastore.model.CreateContainerRequest {
		val input = com.amazonaws.services.mediastore.model.CreateContainerRequest()
		input.setContainerName(this.containerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediastore.model.CreateContainerResult {
	  return com.amazonaws.services.mediastore.model.CreateContainerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediastore.model.CreateContainerResult {
		return environment.mediastore.createContainer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore create-container")
				.argument("container-name", containerName)
	}

}


fun AWSMediaStoreFunctions.deleteContainer(containerName: String, init: AWSMediaStoreDeleteContainerCommand.() -> Unit): com.amazonaws.services.mediastore.model.DeleteContainerResult {
	return this.block.declare(AWSMediaStoreDeleteContainerCommand(containerName).apply(init)) as com.amazonaws.services.mediastore.model.DeleteContainerResult
}

@Generated
class AWSMediaStoreDeleteContainerCommand(val containerName: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.DeleteContainerRequest, com.amazonaws.services.mediastore.model.DeleteContainerResult> {



	override fun build(): com.amazonaws.services.mediastore.model.DeleteContainerRequest {
		val input = com.amazonaws.services.mediastore.model.DeleteContainerRequest()
		input.setContainerName(this.containerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediastore.model.DeleteContainerResult {
	  return com.amazonaws.services.mediastore.model.DeleteContainerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediastore.model.DeleteContainerResult {
		return environment.mediastore.deleteContainer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore delete-container")
				.argument("container-name", containerName)
	}

}


fun AWSMediaStoreFunctions.deleteContainerPolicy(containerName: String, init: AWSMediaStoreDeleteContainerPolicyCommand.() -> Unit): com.amazonaws.services.mediastore.model.DeleteContainerPolicyResult {
	return this.block.declare(AWSMediaStoreDeleteContainerPolicyCommand(containerName).apply(init)) as com.amazonaws.services.mediastore.model.DeleteContainerPolicyResult
}

@Generated
class AWSMediaStoreDeleteContainerPolicyCommand(val containerName: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.DeleteContainerPolicyRequest, com.amazonaws.services.mediastore.model.DeleteContainerPolicyResult> {



	override fun build(): com.amazonaws.services.mediastore.model.DeleteContainerPolicyRequest {
		val input = com.amazonaws.services.mediastore.model.DeleteContainerPolicyRequest()
		input.setContainerName(this.containerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediastore.model.DeleteContainerPolicyResult {
	  return com.amazonaws.services.mediastore.model.DeleteContainerPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediastore.model.DeleteContainerPolicyResult {
		return environment.mediastore.deleteContainerPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore delete-container-policy")
				.argument("container-name", containerName)
	}

}


fun AWSMediaStoreFunctions.deleteCorsPolicy(containerName: String, init: AWSMediaStoreDeleteCorsPolicyCommand.() -> Unit): com.amazonaws.services.mediastore.model.DeleteCorsPolicyResult {
	return this.block.declare(AWSMediaStoreDeleteCorsPolicyCommand(containerName).apply(init)) as com.amazonaws.services.mediastore.model.DeleteCorsPolicyResult
}

@Generated
class AWSMediaStoreDeleteCorsPolicyCommand(val containerName: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.DeleteCorsPolicyRequest, com.amazonaws.services.mediastore.model.DeleteCorsPolicyResult> {



	override fun build(): com.amazonaws.services.mediastore.model.DeleteCorsPolicyRequest {
		val input = com.amazonaws.services.mediastore.model.DeleteCorsPolicyRequest()
		input.setContainerName(this.containerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediastore.model.DeleteCorsPolicyResult {
	  return com.amazonaws.services.mediastore.model.DeleteCorsPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediastore.model.DeleteCorsPolicyResult {
		return environment.mediastore.deleteCorsPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore delete-cors-policy")
				.argument("container-name", containerName)
	}

}


fun AWSMediaStoreFunctions.describeContainer(init: AWSMediaStoreDescribeContainerCommand.() -> Unit): com.amazonaws.services.mediastore.model.DescribeContainerResult {
	return this.block.declare(AWSMediaStoreDescribeContainerCommand().apply(init)) as com.amazonaws.services.mediastore.model.DescribeContainerResult
}

@Generated
class AWSMediaStoreDescribeContainerCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.DescribeContainerRequest, com.amazonaws.services.mediastore.model.DescribeContainerResult> {

	var containerName: String? = null

	override fun build(): com.amazonaws.services.mediastore.model.DescribeContainerRequest {
		val input = com.amazonaws.services.mediastore.model.DescribeContainerRequest()
		input.setContainerName(this.containerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediastore.model.DescribeContainerResult {
	  return com.amazonaws.services.mediastore.model.DescribeContainerResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediastore.model.DescribeContainerResult {
		return environment.mediastore.describeContainer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore describe-container")
				.argument("container-name", containerName)
	}

}


fun AWSMediaStoreFunctions.getContainerPolicy(containerName: String, init: AWSMediaStoreGetContainerPolicyCommand.() -> Unit): com.amazonaws.services.mediastore.model.GetContainerPolicyResult {
	return this.block.declare(AWSMediaStoreGetContainerPolicyCommand(containerName).apply(init)) as com.amazonaws.services.mediastore.model.GetContainerPolicyResult
}

@Generated
class AWSMediaStoreGetContainerPolicyCommand(val containerName: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.GetContainerPolicyRequest, com.amazonaws.services.mediastore.model.GetContainerPolicyResult> {



	override fun build(): com.amazonaws.services.mediastore.model.GetContainerPolicyRequest {
		val input = com.amazonaws.services.mediastore.model.GetContainerPolicyRequest()
		input.setContainerName(this.containerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediastore.model.GetContainerPolicyResult {
	  return com.amazonaws.services.mediastore.model.GetContainerPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediastore.model.GetContainerPolicyResult {
		return environment.mediastore.getContainerPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore get-container-policy")
				.argument("container-name", containerName)
	}

}


fun AWSMediaStoreFunctions.getCorsPolicy(containerName: String, init: AWSMediaStoreGetCorsPolicyCommand.() -> Unit): com.amazonaws.services.mediastore.model.GetCorsPolicyResult {
	return this.block.declare(AWSMediaStoreGetCorsPolicyCommand(containerName).apply(init)) as com.amazonaws.services.mediastore.model.GetCorsPolicyResult
}

@Generated
class AWSMediaStoreGetCorsPolicyCommand(val containerName: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.GetCorsPolicyRequest, com.amazonaws.services.mediastore.model.GetCorsPolicyResult> {



	override fun build(): com.amazonaws.services.mediastore.model.GetCorsPolicyRequest {
		val input = com.amazonaws.services.mediastore.model.GetCorsPolicyRequest()
		input.setContainerName(this.containerName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediastore.model.GetCorsPolicyResult {
	  return com.amazonaws.services.mediastore.model.GetCorsPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediastore.model.GetCorsPolicyResult {
		return environment.mediastore.getCorsPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore get-cors-policy")
				.argument("container-name", containerName)
	}

}


fun AWSMediaStoreFunctions.listContainers(init: AWSMediaStoreListContainersCommand.() -> Unit): com.amazonaws.services.mediastore.model.ListContainersResult {
	return this.block.declare(AWSMediaStoreListContainersCommand().apply(init)) as com.amazonaws.services.mediastore.model.ListContainersResult
}

@Generated
class AWSMediaStoreListContainersCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.ListContainersRequest, com.amazonaws.services.mediastore.model.ListContainersResult> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.mediastore.model.ListContainersRequest {
		val input = com.amazonaws.services.mediastore.model.ListContainersRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediastore.model.ListContainersResult {
	  return com.amazonaws.services.mediastore.model.ListContainersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediastore.model.ListContainersResult {
		return environment.mediastore.listContainers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore list-containers")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSMediaStoreFunctions.putContainerPolicy(containerName: String, policy: String, init: AWSMediaStorePutContainerPolicyCommand.() -> Unit): com.amazonaws.services.mediastore.model.PutContainerPolicyResult {
	return this.block.declare(AWSMediaStorePutContainerPolicyCommand(containerName, policy).apply(init)) as com.amazonaws.services.mediastore.model.PutContainerPolicyResult
}

@Generated
class AWSMediaStorePutContainerPolicyCommand(val containerName: String, val policy: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.PutContainerPolicyRequest, com.amazonaws.services.mediastore.model.PutContainerPolicyResult> {



	override fun build(): com.amazonaws.services.mediastore.model.PutContainerPolicyRequest {
		val input = com.amazonaws.services.mediastore.model.PutContainerPolicyRequest()
		input.setContainerName(this.containerName)
		input.setPolicy(this.policy)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediastore.model.PutContainerPolicyResult {
	  return com.amazonaws.services.mediastore.model.PutContainerPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediastore.model.PutContainerPolicyResult {
		return environment.mediastore.putContainerPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore put-container-policy")
				.argument("container-name", containerName)
				.argument("policy", policy)
	}

}


fun AWSMediaStoreFunctions.putCorsPolicy(containerName: String, corsPolicy: List<com.amazonaws.services.mediastore.model.CorsRule>, init: AWSMediaStorePutCorsPolicyCommand.() -> Unit): com.amazonaws.services.mediastore.model.PutCorsPolicyResult {
	return this.block.declare(AWSMediaStorePutCorsPolicyCommand(containerName, corsPolicy).apply(init)) as com.amazonaws.services.mediastore.model.PutCorsPolicyResult
}

@Generated
class AWSMediaStorePutCorsPolicyCommand(val containerName: String, val corsPolicy: List<com.amazonaws.services.mediastore.model.CorsRule>) : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.PutCorsPolicyRequest, com.amazonaws.services.mediastore.model.PutCorsPolicyResult> {



	override fun build(): com.amazonaws.services.mediastore.model.PutCorsPolicyRequest {
		val input = com.amazonaws.services.mediastore.model.PutCorsPolicyRequest()
		input.setContainerName(this.containerName)
		input.setCorsPolicy(this.corsPolicy)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mediastore.model.PutCorsPolicyResult {
	  return com.amazonaws.services.mediastore.model.PutCorsPolicyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mediastore.model.PutCorsPolicyResult {
		return environment.mediastore.putCorsPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore put-cors-policy")
				.argument("container-name", containerName)
				.argument("cors-policy", corsPolicy.toString())
	}

}
