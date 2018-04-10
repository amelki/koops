
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.mediastore.AWSMediaStore
import com.amazonaws.services.mediastore.model.*

var codingue.koops.core.Environment.mediastore: AWSMediaStore
	get() = this.capabilities[AWSMediaStore::class.java.name] as AWSMediaStore
	set(mediastore) {
		this.capabilities[AWSMediaStore::class.java.name] = mediastore
	}

@Generated
class AWSMediaStoreFunctions(val block: Block)

infix fun AwsContinuation.mediastore(init: AWSMediaStoreFunctions.() -> Unit) {
	AWSMediaStoreFunctions(shell).apply(init)
}

			

fun AWSMediaStoreFunctions.createContainer(containerName: String, init: AWSMediaStoreCreateContainerCommand.() -> Unit) {
	this.block.declare(AWSMediaStoreCreateContainerCommand(containerName).apply(init))
}

@Generated
class AWSMediaStoreCreateContainerCommand(val containerName: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.CreateContainerRequest> {



	override fun build(): com.amazonaws.services.mediastore.model.CreateContainerRequest {
		val input = com.amazonaws.services.mediastore.model.CreateContainerRequest()
		input.setContainerName(this.containerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediastore.createContainer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore create-container")
				.argument("container-name", containerName)
	}

}


fun AWSMediaStoreFunctions.deleteContainer(containerName: String, init: AWSMediaStoreDeleteContainerCommand.() -> Unit) {
	this.block.declare(AWSMediaStoreDeleteContainerCommand(containerName).apply(init))
}

@Generated
class AWSMediaStoreDeleteContainerCommand(val containerName: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.DeleteContainerRequest> {



	override fun build(): com.amazonaws.services.mediastore.model.DeleteContainerRequest {
		val input = com.amazonaws.services.mediastore.model.DeleteContainerRequest()
		input.setContainerName(this.containerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediastore.deleteContainer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore delete-container")
				.argument("container-name", containerName)
	}

}


fun AWSMediaStoreFunctions.deleteContainerPolicy(containerName: String, init: AWSMediaStoreDeleteContainerPolicyCommand.() -> Unit) {
	this.block.declare(AWSMediaStoreDeleteContainerPolicyCommand(containerName).apply(init))
}

@Generated
class AWSMediaStoreDeleteContainerPolicyCommand(val containerName: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.DeleteContainerPolicyRequest> {



	override fun build(): com.amazonaws.services.mediastore.model.DeleteContainerPolicyRequest {
		val input = com.amazonaws.services.mediastore.model.DeleteContainerPolicyRequest()
		input.setContainerName(this.containerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediastore.deleteContainerPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore delete-container-policy")
				.argument("container-name", containerName)
	}

}


fun AWSMediaStoreFunctions.deleteCorsPolicy(containerName: String, init: AWSMediaStoreDeleteCorsPolicyCommand.() -> Unit) {
	this.block.declare(AWSMediaStoreDeleteCorsPolicyCommand(containerName).apply(init))
}

@Generated
class AWSMediaStoreDeleteCorsPolicyCommand(val containerName: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.DeleteCorsPolicyRequest> {



	override fun build(): com.amazonaws.services.mediastore.model.DeleteCorsPolicyRequest {
		val input = com.amazonaws.services.mediastore.model.DeleteCorsPolicyRequest()
		input.setContainerName(this.containerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediastore.deleteCorsPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore delete-cors-policy")
				.argument("container-name", containerName)
	}

}


fun AWSMediaStoreFunctions.describeContainer(init: AWSMediaStoreDescribeContainerCommand.() -> Unit) {
	this.block.declare(AWSMediaStoreDescribeContainerCommand().apply(init))
}

@Generated
class AWSMediaStoreDescribeContainerCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.DescribeContainerRequest> {

	var containerName: String? = null

	override fun build(): com.amazonaws.services.mediastore.model.DescribeContainerRequest {
		val input = com.amazonaws.services.mediastore.model.DescribeContainerRequest()
		input.setContainerName(this.containerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediastore.describeContainer(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore describe-container")
				.argument("container-name", containerName)
	}

}


fun AWSMediaStoreFunctions.getContainerPolicy(containerName: String, init: AWSMediaStoreGetContainerPolicyCommand.() -> Unit) {
	this.block.declare(AWSMediaStoreGetContainerPolicyCommand(containerName).apply(init))
}

@Generated
class AWSMediaStoreGetContainerPolicyCommand(val containerName: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.GetContainerPolicyRequest> {



	override fun build(): com.amazonaws.services.mediastore.model.GetContainerPolicyRequest {
		val input = com.amazonaws.services.mediastore.model.GetContainerPolicyRequest()
		input.setContainerName(this.containerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediastore.getContainerPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore get-container-policy")
				.argument("container-name", containerName)
	}

}


fun AWSMediaStoreFunctions.getCorsPolicy(containerName: String, init: AWSMediaStoreGetCorsPolicyCommand.() -> Unit) {
	this.block.declare(AWSMediaStoreGetCorsPolicyCommand(containerName).apply(init))
}

@Generated
class AWSMediaStoreGetCorsPolicyCommand(val containerName: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.GetCorsPolicyRequest> {



	override fun build(): com.amazonaws.services.mediastore.model.GetCorsPolicyRequest {
		val input = com.amazonaws.services.mediastore.model.GetCorsPolicyRequest()
		input.setContainerName(this.containerName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediastore.getCorsPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore get-cors-policy")
				.argument("container-name", containerName)
	}

}


fun AWSMediaStoreFunctions.listContainers(init: AWSMediaStoreListContainersCommand.() -> Unit) {
	this.block.declare(AWSMediaStoreListContainersCommand().apply(init))
}

@Generated
class AWSMediaStoreListContainersCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.ListContainersRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.mediastore.model.ListContainersRequest {
		val input = com.amazonaws.services.mediastore.model.ListContainersRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediastore.listContainers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore list-containers")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSMediaStoreFunctions.putContainerPolicy(containerName: String, policy: String, init: AWSMediaStorePutContainerPolicyCommand.() -> Unit) {
	this.block.declare(AWSMediaStorePutContainerPolicyCommand(containerName, policy).apply(init))
}

@Generated
class AWSMediaStorePutContainerPolicyCommand(val containerName: String, val policy: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.PutContainerPolicyRequest> {



	override fun build(): com.amazonaws.services.mediastore.model.PutContainerPolicyRequest {
		val input = com.amazonaws.services.mediastore.model.PutContainerPolicyRequest()
		input.setContainerName(this.containerName)
		input.setPolicy(this.policy)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediastore.putContainerPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore put-container-policy")
				.argument("container-name", containerName)
				.argument("policy", policy)
	}

}


fun AWSMediaStoreFunctions.putCorsPolicy(containerName: String, corsPolicy: List<com.amazonaws.services.mediastore.model.CorsRule>, init: AWSMediaStorePutCorsPolicyCommand.() -> Unit) {
	this.block.declare(AWSMediaStorePutCorsPolicyCommand(containerName, corsPolicy).apply(init))
}

@Generated
class AWSMediaStorePutCorsPolicyCommand(val containerName: String, val corsPolicy: List<com.amazonaws.services.mediastore.model.CorsRule>) : AmazonWebServiceCommand<com.amazonaws.services.mediastore.model.PutCorsPolicyRequest> {



	override fun build(): com.amazonaws.services.mediastore.model.PutCorsPolicyRequest {
		val input = com.amazonaws.services.mediastore.model.PutCorsPolicyRequest()
		input.setContainerName(this.containerName)
		input.setCorsPolicy(this.corsPolicy)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediastore.putCorsPolicy(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore put-cors-policy")
				.argument("container-name", containerName)
				.argument("cors-policy", corsPolicy.toString())
	}

}
