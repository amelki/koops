
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.cloudhsmv2.AWSCloudHSMV2
import com.amazonaws.services.cloudhsmv2.model.*

var codingue.koops.core.Environment.cloudhsmv2: AWSCloudHSMV2
	get() = this.capabilities[AWSCloudHSMV2::class.java.name] as AWSCloudHSMV2
	set(cloudhsmv2) {
		this.capabilities[AWSCloudHSMV2::class.java.name] = cloudhsmv2
	}

@Generated
class AWSCloudHSMV2Functions(val block: Block)

infix fun AwsContinuation.cloudhsmv2(init: AWSCloudHSMV2Functions.() -> Unit) {
	AWSCloudHSMV2Functions(shell).apply(init)
}

			

fun AWSCloudHSMV2Functions.createCluster(subnetIds: List<String>, hsmType: String, init: AWSCloudHSMV2CreateClusterCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMV2CreateClusterCommand(subnetIds, hsmType).apply(init))
}

@Generated
class AWSCloudHSMV2CreateClusterCommand(val subnetIds: List<String>, val hsmType: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsmv2.model.CreateClusterRequest> {

	var sourceBackupId: String? = null

	override fun build(): com.amazonaws.services.cloudhsmv2.model.CreateClusterRequest {
		val input = com.amazonaws.services.cloudhsmv2.model.CreateClusterRequest()
		input.setSubnetIds(this.subnetIds)
		input.setHsmType(this.hsmType)
		input.setSourceBackupId(this.sourceBackupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsmv2.createCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsmv2 create-cluster")
				.argument("subnet-ids", subnetIds.toString())
				.argument("hsm-type", hsmType)
				.argument("source-backup-id", sourceBackupId)
	}

}


fun AWSCloudHSMV2Functions.createHsm(clusterId: String, availabilityZone: String, init: AWSCloudHSMV2CreateHsmCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMV2CreateHsmCommand(clusterId, availabilityZone).apply(init))
}

@Generated
class AWSCloudHSMV2CreateHsmCommand(val clusterId: String, val availabilityZone: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsmv2.model.CreateHsmRequest> {

	var ipAddress: String? = null

	override fun build(): com.amazonaws.services.cloudhsmv2.model.CreateHsmRequest {
		val input = com.amazonaws.services.cloudhsmv2.model.CreateHsmRequest()
		input.setClusterId(this.clusterId)
		input.setAvailabilityZone(this.availabilityZone)
		input.setIpAddress(this.ipAddress)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsmv2.createHsm(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsmv2 create-hsm")
				.argument("cluster-id", clusterId)
				.argument("availability-zone", availabilityZone)
				.argument("ip-address", ipAddress)
	}

}


fun AWSCloudHSMV2Functions.deleteCluster(clusterId: String, init: AWSCloudHSMV2DeleteClusterCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMV2DeleteClusterCommand(clusterId).apply(init))
}

@Generated
class AWSCloudHSMV2DeleteClusterCommand(val clusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsmv2.model.DeleteClusterRequest> {



	override fun build(): com.amazonaws.services.cloudhsmv2.model.DeleteClusterRequest {
		val input = com.amazonaws.services.cloudhsmv2.model.DeleteClusterRequest()
		input.setClusterId(this.clusterId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsmv2.deleteCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsmv2 delete-cluster")
				.argument("cluster-id", clusterId)
	}

}


fun AWSCloudHSMV2Functions.deleteHsm(clusterId: String, init: AWSCloudHSMV2DeleteHsmCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMV2DeleteHsmCommand(clusterId).apply(init))
}

@Generated
class AWSCloudHSMV2DeleteHsmCommand(val clusterId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsmv2.model.DeleteHsmRequest> {

	var hsmId: String? = null
	var eniId: String? = null
	var eniIp: String? = null

	override fun build(): com.amazonaws.services.cloudhsmv2.model.DeleteHsmRequest {
		val input = com.amazonaws.services.cloudhsmv2.model.DeleteHsmRequest()
		input.setClusterId(this.clusterId)
		input.setHsmId(this.hsmId)
		input.setEniId(this.eniId)
		input.setEniIp(this.eniIp)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsmv2.deleteHsm(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsmv2 delete-hsm")
				.argument("cluster-id", clusterId)
				.argument("hsm-id", hsmId)
				.argument("eni-id", eniId)
				.argument("eni-ip", eniIp)
	}

}


fun AWSCloudHSMV2Functions.describeBackups(init: AWSCloudHSMV2DescribeBackupsCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMV2DescribeBackupsCommand().apply(init))
}

@Generated
class AWSCloudHSMV2DescribeBackupsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudhsmv2.model.DescribeBackupsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0
	var filters: Map<String, List<String>>? = null

	override fun build(): com.amazonaws.services.cloudhsmv2.model.DescribeBackupsRequest {
		val input = com.amazonaws.services.cloudhsmv2.model.DescribeBackupsRequest()
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		input.setFilters(this.filters)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsmv2.describeBackups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsmv2 describe-backups")
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
				.argument("filters", filters?.toString())
	}

}


fun AWSCloudHSMV2Functions.describeClusters(init: AWSCloudHSMV2DescribeClustersCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMV2DescribeClustersCommand().apply(init))
}

@Generated
class AWSCloudHSMV2DescribeClustersCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudhsmv2.model.DescribeClustersRequest> {

	var filters: Map<String, List<String>>? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.cloudhsmv2.model.DescribeClustersRequest {
		val input = com.amazonaws.services.cloudhsmv2.model.DescribeClustersRequest()
		input.setFilters(this.filters)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsmv2.describeClusters(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsmv2 describe-clusters")
				.argument("filters", filters?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCloudHSMV2Functions.initializeCluster(clusterId: String, signedCert: String, trustAnchor: String, init: AWSCloudHSMV2InitializeClusterCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMV2InitializeClusterCommand(clusterId, signedCert, trustAnchor).apply(init))
}

@Generated
class AWSCloudHSMV2InitializeClusterCommand(val clusterId: String, val signedCert: String, val trustAnchor: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsmv2.model.InitializeClusterRequest> {



	override fun build(): com.amazonaws.services.cloudhsmv2.model.InitializeClusterRequest {
		val input = com.amazonaws.services.cloudhsmv2.model.InitializeClusterRequest()
		input.setClusterId(this.clusterId)
		input.setSignedCert(this.signedCert)
		input.setTrustAnchor(this.trustAnchor)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsmv2.initializeCluster(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsmv2 initialize-cluster")
				.argument("cluster-id", clusterId)
				.argument("signed-cert", signedCert)
				.argument("trust-anchor", trustAnchor)
	}

}


fun AWSCloudHSMV2Functions.listTags(resourceId: String, init: AWSCloudHSMV2ListTagsCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMV2ListTagsCommand(resourceId).apply(init))
}

@Generated
class AWSCloudHSMV2ListTagsCommand(val resourceId: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsmv2.model.ListTagsRequest> {

	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.cloudhsmv2.model.ListTagsRequest {
		val input = com.amazonaws.services.cloudhsmv2.model.ListTagsRequest()
		input.setResourceId(this.resourceId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsmv2.listTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsmv2 list-tags")
				.argument("resource-id", resourceId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCloudHSMV2Functions.tagResource(resourceId: String, tagList: List<com.amazonaws.services.cloudhsmv2.model.Tag>, init: AWSCloudHSMV2TagResourceCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMV2TagResourceCommand(resourceId, tagList).apply(init))
}

@Generated
class AWSCloudHSMV2TagResourceCommand(val resourceId: String, val tagList: List<com.amazonaws.services.cloudhsmv2.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsmv2.model.TagResourceRequest> {



	override fun build(): com.amazonaws.services.cloudhsmv2.model.TagResourceRequest {
		val input = com.amazonaws.services.cloudhsmv2.model.TagResourceRequest()
		input.setResourceId(this.resourceId)
		input.setTagList(this.tagList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsmv2.tagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsmv2 tag-resource")
				.argument("resource-id", resourceId)
				.argument("tag-list", tagList.toString())
	}

}


fun AWSCloudHSMV2Functions.untagResource(resourceId: String, tagKeyList: List<String>, init: AWSCloudHSMV2UntagResourceCommand.() -> Unit) {
	this.block.declare(AWSCloudHSMV2UntagResourceCommand(resourceId, tagKeyList).apply(init))
}

@Generated
class AWSCloudHSMV2UntagResourceCommand(val resourceId: String, val tagKeyList: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudhsmv2.model.UntagResourceRequest> {



	override fun build(): com.amazonaws.services.cloudhsmv2.model.UntagResourceRequest {
		val input = com.amazonaws.services.cloudhsmv2.model.UntagResourceRequest()
		input.setResourceId(this.resourceId)
		input.setTagKeyList(this.tagKeyList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudhsmv2.untagResource(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudhsmv2 untag-resource")
				.argument("resource-id", resourceId)
				.argument("tag-key-list", tagKeyList.toString())
	}

}
