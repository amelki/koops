
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.snowball.AmazonSnowball
import com.amazonaws.services.snowball.model.*

var codingue.koops.core.Environment.snowball: AmazonSnowball
	get() = this.capabilities[AmazonSnowball::class.java.name] as AmazonSnowball
	set(snowball) {
		this.capabilities[AmazonSnowball::class.java.name] = snowball
	}

@Generated
class AmazonSnowballFunctions(val block: Block)

infix fun AwsContinuation.snowball(init: AmazonSnowballFunctions.() -> Unit) {
	AmazonSnowballFunctions(shell).apply(init)
}

			

fun AmazonSnowballFunctions.cancelCluster(clusterId: String, init: AmazonSnowballCancelClusterCommand.() -> Unit) {
	this.block.declare(AmazonSnowballCancelClusterCommand(clusterId).apply(init))
}

@Generated
class AmazonSnowballCancelClusterCommand(val clusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.CancelClusterRequest> {



	override fun build(): com.amazonaws.services.snowball.model.CancelClusterRequest {
		val input = com.amazonaws.services.snowball.model.CancelClusterRequest()
		input.setClusterId(this.clusterId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.cancelCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball cancel-cluster")
				.argument("cluster-id", clusterId)
	}

}


fun AmazonSnowballFunctions.cancelJob(jobId: String, init: AmazonSnowballCancelJobCommand.() -> Unit) {
	this.block.declare(AmazonSnowballCancelJobCommand(jobId).apply(init))
}

@Generated
class AmazonSnowballCancelJobCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.CancelJobRequest> {



	override fun build(): com.amazonaws.services.snowball.model.CancelJobRequest {
		val input = com.amazonaws.services.snowball.model.CancelJobRequest()
		input.setJobId(this.jobId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.cancelJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball cancel-job")
				.argument("job-id", jobId)
	}

}


fun AmazonSnowballFunctions.createAddress(address: com.amazonaws.services.snowball.model.Address, init: AmazonSnowballCreateAddressCommand.() -> Unit) {
	this.block.declare(AmazonSnowballCreateAddressCommand(address).apply(init))
}

@Generated
class AmazonSnowballCreateAddressCommand(val address: com.amazonaws.services.snowball.model.Address) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.CreateAddressRequest> {



	override fun build(): com.amazonaws.services.snowball.model.CreateAddressRequest {
		val input = com.amazonaws.services.snowball.model.CreateAddressRequest()
		input.setAddress(this.address)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.createAddress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball create-address")
				.argument("address", address.toString())
	}

}


fun AmazonSnowballFunctions.createCluster(jobType: JobType, resources: com.amazonaws.services.snowball.model.JobResource, addressId: String, roleARN: String, shippingOption: ShippingOption, init: AmazonSnowballCreateClusterCommand.() -> Unit) {
	this.block.declare(AmazonSnowballCreateClusterCommand(jobType, resources, addressId, roleARN, shippingOption).apply(init))
}

@Generated
class AmazonSnowballCreateClusterCommand(val jobType: JobType, val resources: com.amazonaws.services.snowball.model.JobResource, val addressId: String, val roleARN: String, val shippingOption: ShippingOption) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.CreateClusterRequest> {

	var description: String? = null
	var kmsKeyARN: String? = null
	var snowballType: SnowballType? = null
	var notification: com.amazonaws.services.snowball.model.Notification? = null
	var forwardingAddressId: String? = null

	override fun build(): com.amazonaws.services.snowball.model.CreateClusterRequest {
		val input = com.amazonaws.services.snowball.model.CreateClusterRequest()
		input.setJobType(this.jobType.toString())
		input.setResources(this.resources)
		input.setDescription(this.description)
		input.setAddressId(this.addressId)
		input.setKmsKeyARN(this.kmsKeyARN)
		input.setRoleARN(this.roleARN)
		input.setSnowballType(this.snowballType?.toString())
		input.setShippingOption(this.shippingOption.toString())
		input.setNotification(this.notification)
		input.setForwardingAddressId(this.forwardingAddressId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.createCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball create-cluster")
				.argument("job-type", jobType.toString())
				.argument("resources", resources.toString())
				.argument("description", description)
				.argument("address-id", addressId)
				.argument("kms-key-arn", kmsKeyARN)
				.argument("role-arn", roleARN)
				.argument("snowball-type", snowballType?.toString())
				.argument("shipping-option", shippingOption.toString())
				.argument("notification", notification?.toString())
				.argument("forwarding-address-id", forwardingAddressId)
	}

}


fun AmazonSnowballFunctions.createJob(init: AmazonSnowballCreateJobCommand.() -> Unit) {
	this.block.declare(AmazonSnowballCreateJobCommand().apply(init))
}

@Generated
class AmazonSnowballCreateJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.CreateJobRequest> {

	var jobType: JobType? = null
	var resources: com.amazonaws.services.snowball.model.JobResource? = null
	var description: String? = null
	var addressId: String? = null
	var kmsKeyARN: String? = null
	var roleARN: String? = null
	var snowballCapacityPreference: SnowballCapacity? = null
	var shippingOption: ShippingOption? = null
	var notification: com.amazonaws.services.snowball.model.Notification? = null
	var clusterId: String? = null
	var snowballType: SnowballType? = null
	var forwardingAddressId: String? = null

	override fun build(): com.amazonaws.services.snowball.model.CreateJobRequest {
		val input = com.amazonaws.services.snowball.model.CreateJobRequest()
		input.setJobType(this.jobType?.toString())
		input.setResources(this.resources)
		input.setDescription(this.description)
		input.setAddressId(this.addressId)
		input.setKmsKeyARN(this.kmsKeyARN)
		input.setRoleARN(this.roleARN)
		input.setSnowballCapacityPreference(this.snowballCapacityPreference?.toString())
		input.setShippingOption(this.shippingOption?.toString())
		input.setNotification(this.notification)
		input.setClusterId(this.clusterId)
		input.setSnowballType(this.snowballType?.toString())
		input.setForwardingAddressId(this.forwardingAddressId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.createJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball create-job")
				.argument("job-type", jobType?.toString())
				.argument("resources", resources?.toString())
				.argument("description", description)
				.argument("address-id", addressId)
				.argument("kms-key-arn", kmsKeyARN)
				.argument("role-arn", roleARN)
				.argument("snowball-capacity-preference", snowballCapacityPreference?.toString())
				.argument("shipping-option", shippingOption?.toString())
				.argument("notification", notification?.toString())
				.argument("cluster-id", clusterId)
				.argument("snowball-type", snowballType?.toString())
				.argument("forwarding-address-id", forwardingAddressId)
	}

}


fun AmazonSnowballFunctions.describeAddress(addressId: String, init: AmazonSnowballDescribeAddressCommand.() -> Unit) {
	this.block.declare(AmazonSnowballDescribeAddressCommand(addressId).apply(init))
}

@Generated
class AmazonSnowballDescribeAddressCommand(val addressId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.DescribeAddressRequest> {



	override fun build(): com.amazonaws.services.snowball.model.DescribeAddressRequest {
		val input = com.amazonaws.services.snowball.model.DescribeAddressRequest()
		input.setAddressId(this.addressId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.describeAddress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball describe-address")
				.argument("address-id", addressId)
	}

}


fun AmazonSnowballFunctions.describeAddresses(init: AmazonSnowballDescribeAddressesCommand.() -> Unit) {
	this.block.declare(AmazonSnowballDescribeAddressesCommand().apply(init))
}

@Generated
class AmazonSnowballDescribeAddressesCommand() : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.DescribeAddressesRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.snowball.model.DescribeAddressesRequest {
		val input = com.amazonaws.services.snowball.model.DescribeAddressesRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.describeAddresses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball describe-addresses")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonSnowballFunctions.describeCluster(clusterId: String, init: AmazonSnowballDescribeClusterCommand.() -> Unit) {
	this.block.declare(AmazonSnowballDescribeClusterCommand(clusterId).apply(init))
}

@Generated
class AmazonSnowballDescribeClusterCommand(val clusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.DescribeClusterRequest> {



	override fun build(): com.amazonaws.services.snowball.model.DescribeClusterRequest {
		val input = com.amazonaws.services.snowball.model.DescribeClusterRequest()
		input.setClusterId(this.clusterId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.describeCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball describe-cluster")
				.argument("cluster-id", clusterId)
	}

}


fun AmazonSnowballFunctions.describeJob(jobId: String, init: AmazonSnowballDescribeJobCommand.() -> Unit) {
	this.block.declare(AmazonSnowballDescribeJobCommand(jobId).apply(init))
}

@Generated
class AmazonSnowballDescribeJobCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.DescribeJobRequest> {



	override fun build(): com.amazonaws.services.snowball.model.DescribeJobRequest {
		val input = com.amazonaws.services.snowball.model.DescribeJobRequest()
		input.setJobId(this.jobId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.describeJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball describe-job")
				.argument("job-id", jobId)
	}

}


fun AmazonSnowballFunctions.getJobManifest(jobId: String, init: AmazonSnowballGetJobManifestCommand.() -> Unit) {
	this.block.declare(AmazonSnowballGetJobManifestCommand(jobId).apply(init))
}

@Generated
class AmazonSnowballGetJobManifestCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.GetJobManifestRequest> {



	override fun build(): com.amazonaws.services.snowball.model.GetJobManifestRequest {
		val input = com.amazonaws.services.snowball.model.GetJobManifestRequest()
		input.setJobId(this.jobId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.getJobManifest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball get-job-manifest")
				.argument("job-id", jobId)
	}

}


fun AmazonSnowballFunctions.getJobUnlockCode(jobId: String, init: AmazonSnowballGetJobUnlockCodeCommand.() -> Unit) {
	this.block.declare(AmazonSnowballGetJobUnlockCodeCommand(jobId).apply(init))
}

@Generated
class AmazonSnowballGetJobUnlockCodeCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest> {



	override fun build(): com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest {
		val input = com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest()
		input.setJobId(this.jobId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.getJobUnlockCode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball get-job-unlock-code")
				.argument("job-id", jobId)
	}

}


fun AmazonSnowballFunctions.getSnowballUsage(init: AmazonSnowballGetSnowballUsageCommand.() -> Unit) {
	this.block.declare(AmazonSnowballGetSnowballUsageCommand().apply(init))
}

@Generated
class AmazonSnowballGetSnowballUsageCommand() : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.GetSnowballUsageRequest> {



	override fun build(): com.amazonaws.services.snowball.model.GetSnowballUsageRequest {
		val input = com.amazonaws.services.snowball.model.GetSnowballUsageRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.getSnowballUsage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball get-snowball-usage")

	}

}


fun AmazonSnowballFunctions.listClusterJobs(clusterId: String, init: AmazonSnowballListClusterJobsCommand.() -> Unit) {
	this.block.declare(AmazonSnowballListClusterJobsCommand(clusterId).apply(init))
}

@Generated
class AmazonSnowballListClusterJobsCommand(val clusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.ListClusterJobsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.snowball.model.ListClusterJobsRequest {
		val input = com.amazonaws.services.snowball.model.ListClusterJobsRequest()
		input.setClusterId(this.clusterId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.listClusterJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball list-cluster-jobs")
				.argument("cluster-id", clusterId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonSnowballFunctions.listClusters(init: AmazonSnowballListClustersCommand.() -> Unit) {
	this.block.declare(AmazonSnowballListClustersCommand().apply(init))
}

@Generated
class AmazonSnowballListClustersCommand() : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.ListClustersRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.snowball.model.ListClustersRequest {
		val input = com.amazonaws.services.snowball.model.ListClustersRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.listClusters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball list-clusters")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonSnowballFunctions.listJobs(init: AmazonSnowballListJobsCommand.() -> Unit) {
	this.block.declare(AmazonSnowballListJobsCommand().apply(init))
}

@Generated
class AmazonSnowballListJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.ListJobsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.snowball.model.ListJobsRequest {
		val input = com.amazonaws.services.snowball.model.ListJobsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.listJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball list-jobs")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonSnowballFunctions.updateCluster(clusterId: String, init: AmazonSnowballUpdateClusterCommand.() -> Unit) {
	this.block.declare(AmazonSnowballUpdateClusterCommand(clusterId).apply(init))
}

@Generated
class AmazonSnowballUpdateClusterCommand(val clusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.UpdateClusterRequest> {

	var roleARN: String? = null
	var description: String? = null
	var resources: com.amazonaws.services.snowball.model.JobResource? = null
	var addressId: String? = null
	var shippingOption: ShippingOption? = null
	var notification: com.amazonaws.services.snowball.model.Notification? = null
	var forwardingAddressId: String? = null

	override fun build(): com.amazonaws.services.snowball.model.UpdateClusterRequest {
		val input = com.amazonaws.services.snowball.model.UpdateClusterRequest()
		input.setClusterId(this.clusterId)
		input.setRoleARN(this.roleARN)
		input.setDescription(this.description)
		input.setResources(this.resources)
		input.setAddressId(this.addressId)
		input.setShippingOption(this.shippingOption?.toString())
		input.setNotification(this.notification)
		input.setForwardingAddressId(this.forwardingAddressId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.updateCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball update-cluster")
				.argument("cluster-id", clusterId)
				.argument("role-arn", roleARN)
				.argument("description", description)
				.argument("resources", resources?.toString())
				.argument("address-id", addressId)
				.argument("shipping-option", shippingOption?.toString())
				.argument("notification", notification?.toString())
				.argument("forwarding-address-id", forwardingAddressId)
	}

}


fun AmazonSnowballFunctions.updateJob(jobId: String, init: AmazonSnowballUpdateJobCommand.() -> Unit) {
	this.block.declare(AmazonSnowballUpdateJobCommand(jobId).apply(init))
}

@Generated
class AmazonSnowballUpdateJobCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.UpdateJobRequest> {

	var roleARN: String? = null
	var notification: com.amazonaws.services.snowball.model.Notification? = null
	var resources: com.amazonaws.services.snowball.model.JobResource? = null
	var addressId: String? = null
	var shippingOption: ShippingOption? = null
	var description: String? = null
	var snowballCapacityPreference: SnowballCapacity? = null
	var forwardingAddressId: String? = null

	override fun build(): com.amazonaws.services.snowball.model.UpdateJobRequest {
		val input = com.amazonaws.services.snowball.model.UpdateJobRequest()
		input.setJobId(this.jobId)
		input.setRoleARN(this.roleARN)
		input.setNotification(this.notification)
		input.setResources(this.resources)
		input.setAddressId(this.addressId)
		input.setShippingOption(this.shippingOption?.toString())
		input.setDescription(this.description)
		input.setSnowballCapacityPreference(this.snowballCapacityPreference?.toString())
		input.setForwardingAddressId(this.forwardingAddressId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.snowball.updateJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball update-job")
				.argument("job-id", jobId)
				.argument("role-arn", roleARN)
				.argument("notification", notification?.toString())
				.argument("resources", resources?.toString())
				.argument("address-id", addressId)
				.argument("shipping-option", shippingOption?.toString())
				.argument("description", description)
				.argument("snowball-capacity-preference", snowballCapacityPreference?.toString())
				.argument("forwarding-address-id", forwardingAddressId)
	}

}
