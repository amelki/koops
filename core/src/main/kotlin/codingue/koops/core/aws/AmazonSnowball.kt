
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
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

infix fun <T> AwsContinuation.snowball(init: AmazonSnowballFunctions.() -> T): T {
	return AmazonSnowballFunctions(shell).run(init)
}

			

fun AmazonSnowballFunctions.cancelCluster(clusterId: String, init: AmazonSnowballCancelClusterCommand.() -> Unit): com.amazonaws.services.snowball.model.CancelClusterResult {
	return this.block.declare(AmazonSnowballCancelClusterCommand(clusterId).apply(init)) as com.amazonaws.services.snowball.model.CancelClusterResult
}

@Generated
class AmazonSnowballCancelClusterCommand(val clusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.CancelClusterRequest, com.amazonaws.services.snowball.model.CancelClusterResult> {



	override fun build(): com.amazonaws.services.snowball.model.CancelClusterRequest {
		val input = com.amazonaws.services.snowball.model.CancelClusterRequest()
		input.setClusterId(this.clusterId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.snowball.model.CancelClusterResult {
	  return com.amazonaws.services.snowball.model.CancelClusterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.CancelClusterResult {
		return environment.snowball.cancelCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball cancel-cluster")
				.argument("cluster-id", clusterId)
	}

}


fun AmazonSnowballFunctions.cancelJob(jobId: String, init: AmazonSnowballCancelJobCommand.() -> Unit): com.amazonaws.services.snowball.model.CancelJobResult {
	return this.block.declare(AmazonSnowballCancelJobCommand(jobId).apply(init)) as com.amazonaws.services.snowball.model.CancelJobResult
}

@Generated
class AmazonSnowballCancelJobCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.CancelJobRequest, com.amazonaws.services.snowball.model.CancelJobResult> {



	override fun build(): com.amazonaws.services.snowball.model.CancelJobRequest {
		val input = com.amazonaws.services.snowball.model.CancelJobRequest()
		input.setJobId(this.jobId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.snowball.model.CancelJobResult {
	  return com.amazonaws.services.snowball.model.CancelJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.CancelJobResult {
		return environment.snowball.cancelJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball cancel-job")
				.argument("job-id", jobId)
	}

}


fun AmazonSnowballFunctions.createAddress(address: com.amazonaws.services.snowball.model.Address, init: AmazonSnowballCreateAddressCommand.() -> Unit): com.amazonaws.services.snowball.model.CreateAddressResult {
	return this.block.declare(AmazonSnowballCreateAddressCommand(address).apply(init)) as com.amazonaws.services.snowball.model.CreateAddressResult
}

@Generated
class AmazonSnowballCreateAddressCommand(val address: com.amazonaws.services.snowball.model.Address) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.CreateAddressRequest, com.amazonaws.services.snowball.model.CreateAddressResult> {



	override fun build(): com.amazonaws.services.snowball.model.CreateAddressRequest {
		val input = com.amazonaws.services.snowball.model.CreateAddressRequest()
		input.setAddress(this.address)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.snowball.model.CreateAddressResult {
	  return com.amazonaws.services.snowball.model.CreateAddressResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.CreateAddressResult {
		return environment.snowball.createAddress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball create-address")
				.argument("address", address.toString())
	}

}


fun AmazonSnowballFunctions.createCluster(jobType: JobType, resources: com.amazonaws.services.snowball.model.JobResource, addressId: String, roleARN: String, shippingOption: ShippingOption, init: AmazonSnowballCreateClusterCommand.() -> Unit): com.amazonaws.services.snowball.model.CreateClusterResult {
	return this.block.declare(AmazonSnowballCreateClusterCommand(jobType, resources, addressId, roleARN, shippingOption).apply(init)) as com.amazonaws.services.snowball.model.CreateClusterResult
}

@Generated
class AmazonSnowballCreateClusterCommand(val jobType: JobType, val resources: com.amazonaws.services.snowball.model.JobResource, val addressId: String, val roleARN: String, val shippingOption: ShippingOption) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.CreateClusterRequest, com.amazonaws.services.snowball.model.CreateClusterResult> {

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

	
	override fun dryResult(): com.amazonaws.services.snowball.model.CreateClusterResult {
	  return com.amazonaws.services.snowball.model.CreateClusterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.CreateClusterResult {
		return environment.snowball.createCluster(build())
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


fun AmazonSnowballFunctions.createJob(init: AmazonSnowballCreateJobCommand.() -> Unit): com.amazonaws.services.snowball.model.CreateJobResult {
	return this.block.declare(AmazonSnowballCreateJobCommand().apply(init)) as com.amazonaws.services.snowball.model.CreateJobResult
}

@Generated
class AmazonSnowballCreateJobCommand() : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.CreateJobRequest, com.amazonaws.services.snowball.model.CreateJobResult> {

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

	
	override fun dryResult(): com.amazonaws.services.snowball.model.CreateJobResult {
	  return com.amazonaws.services.snowball.model.CreateJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.CreateJobResult {
		return environment.snowball.createJob(build())
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


fun AmazonSnowballFunctions.describeAddress(addressId: String, init: AmazonSnowballDescribeAddressCommand.() -> Unit): com.amazonaws.services.snowball.model.DescribeAddressResult {
	return this.block.declare(AmazonSnowballDescribeAddressCommand(addressId).apply(init)) as com.amazonaws.services.snowball.model.DescribeAddressResult
}

@Generated
class AmazonSnowballDescribeAddressCommand(val addressId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.DescribeAddressRequest, com.amazonaws.services.snowball.model.DescribeAddressResult> {



	override fun build(): com.amazonaws.services.snowball.model.DescribeAddressRequest {
		val input = com.amazonaws.services.snowball.model.DescribeAddressRequest()
		input.setAddressId(this.addressId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.snowball.model.DescribeAddressResult {
	  return com.amazonaws.services.snowball.model.DescribeAddressResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.DescribeAddressResult {
		return environment.snowball.describeAddress(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball describe-address")
				.argument("address-id", addressId)
	}

}


fun AmazonSnowballFunctions.describeAddresses(init: AmazonSnowballDescribeAddressesCommand.() -> Unit): com.amazonaws.services.snowball.model.DescribeAddressesResult {
	return this.block.declare(AmazonSnowballDescribeAddressesCommand().apply(init)) as com.amazonaws.services.snowball.model.DescribeAddressesResult
}

@Generated
class AmazonSnowballDescribeAddressesCommand() : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.DescribeAddressesRequest, com.amazonaws.services.snowball.model.DescribeAddressesResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.snowball.model.DescribeAddressesRequest {
		val input = com.amazonaws.services.snowball.model.DescribeAddressesRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.snowball.model.DescribeAddressesResult {
	  return com.amazonaws.services.snowball.model.DescribeAddressesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.DescribeAddressesResult {
		return environment.snowball.describeAddresses(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball describe-addresses")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonSnowballFunctions.describeCluster(clusterId: String, init: AmazonSnowballDescribeClusterCommand.() -> Unit): com.amazonaws.services.snowball.model.DescribeClusterResult {
	return this.block.declare(AmazonSnowballDescribeClusterCommand(clusterId).apply(init)) as com.amazonaws.services.snowball.model.DescribeClusterResult
}

@Generated
class AmazonSnowballDescribeClusterCommand(val clusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.DescribeClusterRequest, com.amazonaws.services.snowball.model.DescribeClusterResult> {



	override fun build(): com.amazonaws.services.snowball.model.DescribeClusterRequest {
		val input = com.amazonaws.services.snowball.model.DescribeClusterRequest()
		input.setClusterId(this.clusterId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.snowball.model.DescribeClusterResult {
	  return com.amazonaws.services.snowball.model.DescribeClusterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.DescribeClusterResult {
		return environment.snowball.describeCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball describe-cluster")
				.argument("cluster-id", clusterId)
	}

}


fun AmazonSnowballFunctions.describeJob(jobId: String, init: AmazonSnowballDescribeJobCommand.() -> Unit): com.amazonaws.services.snowball.model.DescribeJobResult {
	return this.block.declare(AmazonSnowballDescribeJobCommand(jobId).apply(init)) as com.amazonaws.services.snowball.model.DescribeJobResult
}

@Generated
class AmazonSnowballDescribeJobCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.DescribeJobRequest, com.amazonaws.services.snowball.model.DescribeJobResult> {



	override fun build(): com.amazonaws.services.snowball.model.DescribeJobRequest {
		val input = com.amazonaws.services.snowball.model.DescribeJobRequest()
		input.setJobId(this.jobId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.snowball.model.DescribeJobResult {
	  return com.amazonaws.services.snowball.model.DescribeJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.DescribeJobResult {
		return environment.snowball.describeJob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball describe-job")
				.argument("job-id", jobId)
	}

}


fun AmazonSnowballFunctions.getJobManifest(jobId: String, init: AmazonSnowballGetJobManifestCommand.() -> Unit): com.amazonaws.services.snowball.model.GetJobManifestResult {
	return this.block.declare(AmazonSnowballGetJobManifestCommand(jobId).apply(init)) as com.amazonaws.services.snowball.model.GetJobManifestResult
}

@Generated
class AmazonSnowballGetJobManifestCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.GetJobManifestRequest, com.amazonaws.services.snowball.model.GetJobManifestResult> {



	override fun build(): com.amazonaws.services.snowball.model.GetJobManifestRequest {
		val input = com.amazonaws.services.snowball.model.GetJobManifestRequest()
		input.setJobId(this.jobId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.snowball.model.GetJobManifestResult {
	  return com.amazonaws.services.snowball.model.GetJobManifestResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.GetJobManifestResult {
		return environment.snowball.getJobManifest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball get-job-manifest")
				.argument("job-id", jobId)
	}

}


fun AmazonSnowballFunctions.getJobUnlockCode(jobId: String, init: AmazonSnowballGetJobUnlockCodeCommand.() -> Unit): com.amazonaws.services.snowball.model.GetJobUnlockCodeResult {
	return this.block.declare(AmazonSnowballGetJobUnlockCodeCommand(jobId).apply(init)) as com.amazonaws.services.snowball.model.GetJobUnlockCodeResult
}

@Generated
class AmazonSnowballGetJobUnlockCodeCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest, com.amazonaws.services.snowball.model.GetJobUnlockCodeResult> {



	override fun build(): com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest {
		val input = com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest()
		input.setJobId(this.jobId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.snowball.model.GetJobUnlockCodeResult {
	  return com.amazonaws.services.snowball.model.GetJobUnlockCodeResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.GetJobUnlockCodeResult {
		return environment.snowball.getJobUnlockCode(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball get-job-unlock-code")
				.argument("job-id", jobId)
	}

}


fun AmazonSnowballFunctions.getSnowballUsage(init: AmazonSnowballGetSnowballUsageCommand.() -> Unit): com.amazonaws.services.snowball.model.GetSnowballUsageResult {
	return this.block.declare(AmazonSnowballGetSnowballUsageCommand().apply(init)) as com.amazonaws.services.snowball.model.GetSnowballUsageResult
}

@Generated
class AmazonSnowballGetSnowballUsageCommand() : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.GetSnowballUsageRequest, com.amazonaws.services.snowball.model.GetSnowballUsageResult> {



	override fun build(): com.amazonaws.services.snowball.model.GetSnowballUsageRequest {
		val input = com.amazonaws.services.snowball.model.GetSnowballUsageRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.snowball.model.GetSnowballUsageResult {
	  return com.amazonaws.services.snowball.model.GetSnowballUsageResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.GetSnowballUsageResult {
		return environment.snowball.getSnowballUsage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball get-snowball-usage")

	}

}


fun AmazonSnowballFunctions.listClusterJobs(clusterId: String, init: AmazonSnowballListClusterJobsCommand.() -> Unit): com.amazonaws.services.snowball.model.ListClusterJobsResult {
	return this.block.declare(AmazonSnowballListClusterJobsCommand(clusterId).apply(init)) as com.amazonaws.services.snowball.model.ListClusterJobsResult
}

@Generated
class AmazonSnowballListClusterJobsCommand(val clusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.ListClusterJobsRequest, com.amazonaws.services.snowball.model.ListClusterJobsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.snowball.model.ListClusterJobsRequest {
		val input = com.amazonaws.services.snowball.model.ListClusterJobsRequest()
		input.setClusterId(this.clusterId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.snowball.model.ListClusterJobsResult {
	  return com.amazonaws.services.snowball.model.ListClusterJobsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.ListClusterJobsResult {
		return environment.snowball.listClusterJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball list-cluster-jobs")
				.argument("cluster-id", clusterId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonSnowballFunctions.listClusters(init: AmazonSnowballListClustersCommand.() -> Unit): com.amazonaws.services.snowball.model.ListClustersResult {
	return this.block.declare(AmazonSnowballListClustersCommand().apply(init)) as com.amazonaws.services.snowball.model.ListClustersResult
}

@Generated
class AmazonSnowballListClustersCommand() : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.ListClustersRequest, com.amazonaws.services.snowball.model.ListClustersResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.snowball.model.ListClustersRequest {
		val input = com.amazonaws.services.snowball.model.ListClustersRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.snowball.model.ListClustersResult {
	  return com.amazonaws.services.snowball.model.ListClustersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.ListClustersResult {
		return environment.snowball.listClusters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball list-clusters")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonSnowballFunctions.listJobs(init: AmazonSnowballListJobsCommand.() -> Unit): com.amazonaws.services.snowball.model.ListJobsResult {
	return this.block.declare(AmazonSnowballListJobsCommand().apply(init)) as com.amazonaws.services.snowball.model.ListJobsResult
}

@Generated
class AmazonSnowballListJobsCommand() : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.ListJobsRequest, com.amazonaws.services.snowball.model.ListJobsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.snowball.model.ListJobsRequest {
		val input = com.amazonaws.services.snowball.model.ListJobsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.snowball.model.ListJobsResult {
	  return com.amazonaws.services.snowball.model.ListJobsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.ListJobsResult {
		return environment.snowball.listJobs(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws snowball list-jobs")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonSnowballFunctions.updateCluster(clusterId: String, init: AmazonSnowballUpdateClusterCommand.() -> Unit): com.amazonaws.services.snowball.model.UpdateClusterResult {
	return this.block.declare(AmazonSnowballUpdateClusterCommand(clusterId).apply(init)) as com.amazonaws.services.snowball.model.UpdateClusterResult
}

@Generated
class AmazonSnowballUpdateClusterCommand(val clusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.UpdateClusterRequest, com.amazonaws.services.snowball.model.UpdateClusterResult> {

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

	
	override fun dryResult(): com.amazonaws.services.snowball.model.UpdateClusterResult {
	  return com.amazonaws.services.snowball.model.UpdateClusterResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.UpdateClusterResult {
		return environment.snowball.updateCluster(build())
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


fun AmazonSnowballFunctions.updateJob(jobId: String, init: AmazonSnowballUpdateJobCommand.() -> Unit): com.amazonaws.services.snowball.model.UpdateJobResult {
	return this.block.declare(AmazonSnowballUpdateJobCommand(jobId).apply(init)) as com.amazonaws.services.snowball.model.UpdateJobResult
}

@Generated
class AmazonSnowballUpdateJobCommand(val jobId: String) : AmazonWebServiceCommand<com.amazonaws.services.snowball.model.UpdateJobRequest, com.amazonaws.services.snowball.model.UpdateJobResult> {

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

	
	override fun dryResult(): com.amazonaws.services.snowball.model.UpdateJobResult {
	  return com.amazonaws.services.snowball.model.UpdateJobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.snowball.model.UpdateJobResult {
		return environment.snowball.updateJob(build())
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
