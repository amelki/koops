
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.elasticfilesystem.*
import com.amazonaws.services.elasticfilesystem.model.*

var codingue.koops.core.Environment.elasticfilesystem: AmazonElasticFileSystem
	get() {
		var service = this.capabilities["aws-elasticfilesystem"]
		if (service == null) {
			service = AmazonElasticFileSystemClientBuilder.standard().build()
			this.capabilities["aws-elasticfilesystem"] = service
		}
		return service as AmazonElasticFileSystem
	}
	set(elasticfilesystem) {
		this.capabilities["aws-elasticfilesystem"] = elasticfilesystem
	}

@Generated
class AmazonElasticFileSystemFunctions(val block: Block)

infix fun <T> AwsContinuation.elasticfilesystem(init: AmazonElasticFileSystemFunctions.() -> T): T {
	return AmazonElasticFileSystemFunctions(shell).run(init)
}

			

fun AmazonElasticFileSystemFunctions.createFileSystem(creationToken: String, init: AmazonElasticFileSystemCreateFileSystemCommand.() -> Unit): com.amazonaws.services.elasticfilesystem.model.CreateFileSystemResult {
	return this.block.declare(AmazonElasticFileSystemCreateFileSystemCommand(creationToken).apply(init)) as com.amazonaws.services.elasticfilesystem.model.CreateFileSystemResult
}

@Generated
class AmazonElasticFileSystemCreateFileSystemCommand(val creationToken: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.CreateFileSystemRequest, com.amazonaws.services.elasticfilesystem.model.CreateFileSystemResult> {

	var performanceMode: PerformanceMode? = null
	var encrypted: Boolean? = false
	var kmsKeyId: String? = null

	override fun build(): com.amazonaws.services.elasticfilesystem.model.CreateFileSystemRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.CreateFileSystemRequest()
		input.setCreationToken(this.creationToken)
		input.setPerformanceMode(this.performanceMode?.toString())
		input.setEncrypted(this.encrypted)
		input.setKmsKeyId(this.kmsKeyId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticfilesystem.model.CreateFileSystemResult {
	  return com.amazonaws.services.elasticfilesystem.model.CreateFileSystemResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticfilesystem.model.CreateFileSystemResult {
		return environment.elasticfilesystem.createFileSystem(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem create-file-system")
				.argument("creation-token", creationToken)
				.argument("performance-mode", performanceMode?.toString())
				.option("encrypted", encrypted ?: false)
				.argument("kms-key-id", kmsKeyId)
	}

}


fun AmazonElasticFileSystemFunctions.createMountTarget(fileSystemId: String, subnetId: String, init: AmazonElasticFileSystemCreateMountTargetCommand.() -> Unit): com.amazonaws.services.elasticfilesystem.model.CreateMountTargetResult {
	return this.block.declare(AmazonElasticFileSystemCreateMountTargetCommand(fileSystemId, subnetId).apply(init)) as com.amazonaws.services.elasticfilesystem.model.CreateMountTargetResult
}

@Generated
class AmazonElasticFileSystemCreateMountTargetCommand(val fileSystemId: String, val subnetId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.CreateMountTargetRequest, com.amazonaws.services.elasticfilesystem.model.CreateMountTargetResult> {

	var ipAddress: String? = null
	var securityGroups: List<String>? = null

	override fun build(): com.amazonaws.services.elasticfilesystem.model.CreateMountTargetRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.CreateMountTargetRequest()
		input.setFileSystemId(this.fileSystemId)
		input.setSubnetId(this.subnetId)
		input.setIpAddress(this.ipAddress)
		input.setSecurityGroups(this.securityGroups)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticfilesystem.model.CreateMountTargetResult {
	  return com.amazonaws.services.elasticfilesystem.model.CreateMountTargetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticfilesystem.model.CreateMountTargetResult {
		return environment.elasticfilesystem.createMountTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem create-mount-target")
				.argument("file-system-id", fileSystemId)
				.argument("subnet-id", subnetId)
				.argument("ip-address", ipAddress)
				.argument("security-groups", securityGroups?.toString())
	}

}


fun AmazonElasticFileSystemFunctions.createTags(fileSystemId: String, tags: List<com.amazonaws.services.elasticfilesystem.model.Tag>, init: AmazonElasticFileSystemCreateTagsCommand.() -> Unit): com.amazonaws.services.elasticfilesystem.model.CreateTagsResult {
	return this.block.declare(AmazonElasticFileSystemCreateTagsCommand(fileSystemId, tags).apply(init)) as com.amazonaws.services.elasticfilesystem.model.CreateTagsResult
}

@Generated
class AmazonElasticFileSystemCreateTagsCommand(val fileSystemId: String, val tags: List<com.amazonaws.services.elasticfilesystem.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.CreateTagsRequest, com.amazonaws.services.elasticfilesystem.model.CreateTagsResult> {



	override fun build(): com.amazonaws.services.elasticfilesystem.model.CreateTagsRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.CreateTagsRequest()
		input.setFileSystemId(this.fileSystemId)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticfilesystem.model.CreateTagsResult {
	  return com.amazonaws.services.elasticfilesystem.model.CreateTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticfilesystem.model.CreateTagsResult {
		return environment.elasticfilesystem.createTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem create-tags")
				.argument("file-system-id", fileSystemId)
				.argument("tags", tags.toString())
	}

}


fun AmazonElasticFileSystemFunctions.deleteFileSystem(fileSystemId: String, init: AmazonElasticFileSystemDeleteFileSystemCommand.() -> Unit): com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemResult {
	return this.block.declare(AmazonElasticFileSystemDeleteFileSystemCommand(fileSystemId).apply(init)) as com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemResult
}

@Generated
class AmazonElasticFileSystemDeleteFileSystemCommand(val fileSystemId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemRequest, com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemResult> {



	override fun build(): com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemRequest()
		input.setFileSystemId(this.fileSystemId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemResult {
	  return com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemResult {
		return environment.elasticfilesystem.deleteFileSystem(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem delete-file-system")
				.argument("file-system-id", fileSystemId)
	}

}


fun AmazonElasticFileSystemFunctions.deleteMountTarget(mountTargetId: String, init: AmazonElasticFileSystemDeleteMountTargetCommand.() -> Unit): com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetResult {
	return this.block.declare(AmazonElasticFileSystemDeleteMountTargetCommand(mountTargetId).apply(init)) as com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetResult
}

@Generated
class AmazonElasticFileSystemDeleteMountTargetCommand(val mountTargetId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetRequest, com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetResult> {



	override fun build(): com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetRequest()
		input.setMountTargetId(this.mountTargetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetResult {
	  return com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetResult {
		return environment.elasticfilesystem.deleteMountTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem delete-mount-target")
				.argument("mount-target-id", mountTargetId)
	}

}


fun AmazonElasticFileSystemFunctions.deleteTags(fileSystemId: String, tagKeys: List<String>, init: AmazonElasticFileSystemDeleteTagsCommand.() -> Unit): com.amazonaws.services.elasticfilesystem.model.DeleteTagsResult {
	return this.block.declare(AmazonElasticFileSystemDeleteTagsCommand(fileSystemId, tagKeys).apply(init)) as com.amazonaws.services.elasticfilesystem.model.DeleteTagsResult
}

@Generated
class AmazonElasticFileSystemDeleteTagsCommand(val fileSystemId: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.DeleteTagsRequest, com.amazonaws.services.elasticfilesystem.model.DeleteTagsResult> {



	override fun build(): com.amazonaws.services.elasticfilesystem.model.DeleteTagsRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.DeleteTagsRequest()
		input.setFileSystemId(this.fileSystemId)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticfilesystem.model.DeleteTagsResult {
	  return com.amazonaws.services.elasticfilesystem.model.DeleteTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticfilesystem.model.DeleteTagsResult {
		return environment.elasticfilesystem.deleteTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem delete-tags")
				.argument("file-system-id", fileSystemId)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonElasticFileSystemFunctions.describeFileSystems(init: AmazonElasticFileSystemDescribeFileSystemsCommand.() -> Unit): com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsResult {
	return this.block.declare(AmazonElasticFileSystemDescribeFileSystemsCommand().apply(init)) as com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsResult
}

@Generated
class AmazonElasticFileSystemDescribeFileSystemsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsRequest, com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsResult> {

	var maxItems: Int? = 0
	var marker: String? = null
	var creationToken: String? = null
	var fileSystemId: String? = null

	override fun build(): com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsRequest()
		input.setMaxItems(this.maxItems)
		input.setMarker(this.marker)
		input.setCreationToken(this.creationToken)
		input.setFileSystemId(this.fileSystemId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsResult {
	  return com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsResult {
		return environment.elasticfilesystem.describeFileSystems(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem describe-file-systems")
				.argument("max-items", maxItems?.toString())
				.argument("marker", marker)
				.argument("creation-token", creationToken)
				.argument("file-system-id", fileSystemId)
	}

}


fun AmazonElasticFileSystemFunctions.describeMountTargetSecurityGroups(mountTargetId: String, init: AmazonElasticFileSystemDescribeMountTargetSecurityGroupsCommand.() -> Unit): com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsResult {
	return this.block.declare(AmazonElasticFileSystemDescribeMountTargetSecurityGroupsCommand(mountTargetId).apply(init)) as com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsResult
}

@Generated
class AmazonElasticFileSystemDescribeMountTargetSecurityGroupsCommand(val mountTargetId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsRequest, com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsResult> {



	override fun build(): com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsRequest()
		input.setMountTargetId(this.mountTargetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsResult {
	  return com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsResult {
		return environment.elasticfilesystem.describeMountTargetSecurityGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem describe-mount-target-security-groups")
				.argument("mount-target-id", mountTargetId)
	}

}


fun AmazonElasticFileSystemFunctions.describeMountTargets(init: AmazonElasticFileSystemDescribeMountTargetsCommand.() -> Unit): com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsResult {
	return this.block.declare(AmazonElasticFileSystemDescribeMountTargetsCommand().apply(init)) as com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsResult
}

@Generated
class AmazonElasticFileSystemDescribeMountTargetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsRequest, com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsResult> {

	var maxItems: Int? = 0
	var marker: String? = null
	var fileSystemId: String? = null
	var mountTargetId: String? = null

	override fun build(): com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsRequest()
		input.setMaxItems(this.maxItems)
		input.setMarker(this.marker)
		input.setFileSystemId(this.fileSystemId)
		input.setMountTargetId(this.mountTargetId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsResult {
	  return com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsResult {
		return environment.elasticfilesystem.describeMountTargets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem describe-mount-targets")
				.argument("max-items", maxItems?.toString())
				.argument("marker", marker)
				.argument("file-system-id", fileSystemId)
				.argument("mount-target-id", mountTargetId)
	}

}


fun AmazonElasticFileSystemFunctions.describeTags(fileSystemId: String, init: AmazonElasticFileSystemDescribeTagsCommand.() -> Unit): com.amazonaws.services.elasticfilesystem.model.DescribeTagsResult {
	return this.block.declare(AmazonElasticFileSystemDescribeTagsCommand(fileSystemId).apply(init)) as com.amazonaws.services.elasticfilesystem.model.DescribeTagsResult
}

@Generated
class AmazonElasticFileSystemDescribeTagsCommand(val fileSystemId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.DescribeTagsRequest, com.amazonaws.services.elasticfilesystem.model.DescribeTagsResult> {

	var maxItems: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticfilesystem.model.DescribeTagsRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.DescribeTagsRequest()
		input.setMaxItems(this.maxItems)
		input.setMarker(this.marker)
		input.setFileSystemId(this.fileSystemId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticfilesystem.model.DescribeTagsResult {
	  return com.amazonaws.services.elasticfilesystem.model.DescribeTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticfilesystem.model.DescribeTagsResult {
		return environment.elasticfilesystem.describeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem describe-tags")
				.argument("max-items", maxItems?.toString())
				.argument("marker", marker)
				.argument("file-system-id", fileSystemId)
	}

}


fun AmazonElasticFileSystemFunctions.modifyMountTargetSecurityGroups(mountTargetId: String, init: AmazonElasticFileSystemModifyMountTargetSecurityGroupsCommand.() -> Unit): com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsResult {
	return this.block.declare(AmazonElasticFileSystemModifyMountTargetSecurityGroupsCommand(mountTargetId).apply(init)) as com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsResult
}

@Generated
class AmazonElasticFileSystemModifyMountTargetSecurityGroupsCommand(val mountTargetId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsRequest, com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsResult> {

	var securityGroups: List<String>? = null

	override fun build(): com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsRequest()
		input.setMountTargetId(this.mountTargetId)
		input.setSecurityGroups(this.securityGroups)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsResult {
	  return com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsResult {
		return environment.elasticfilesystem.modifyMountTargetSecurityGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem modify-mount-target-security-groups")
				.argument("mount-target-id", mountTargetId)
				.argument("security-groups", securityGroups?.toString())
	}

}
