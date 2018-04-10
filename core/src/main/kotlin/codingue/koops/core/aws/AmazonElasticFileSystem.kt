
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem
import com.amazonaws.services.elasticfilesystem.model.*

var codingue.koops.core.Environment.elasticfilesystem: AmazonElasticFileSystem
	get() = this.capabilities[AmazonElasticFileSystem::class.java.name] as AmazonElasticFileSystem
	set(elasticfilesystem) {
		this.capabilities[AmazonElasticFileSystem::class.java.name] = elasticfilesystem
	}

@Generated
class AmazonElasticFileSystemFunctions(val block: Block)

infix fun AwsContinuation.elasticfilesystem(init: AmazonElasticFileSystemFunctions.() -> Unit) {
	AmazonElasticFileSystemFunctions(shell).apply(init)
}

			

fun AmazonElasticFileSystemFunctions.createFileSystem(creationToken: String, init: AmazonElasticFileSystemCreateFileSystemCommand.() -> Unit) {
	this.block.declare(AmazonElasticFileSystemCreateFileSystemCommand(creationToken).apply(init))
}

@Generated
class AmazonElasticFileSystemCreateFileSystemCommand(val creationToken: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.CreateFileSystemRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticfilesystem.createFileSystem(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem create-file-system")
				.argument("creation-token", creationToken)
				.argument("performance-mode", performanceMode?.toString())
				.option("encrypted", encrypted ?: false)
				.argument("kms-key-id", kmsKeyId)
	}

}


fun AmazonElasticFileSystemFunctions.createMountTarget(fileSystemId: String, subnetId: String, init: AmazonElasticFileSystemCreateMountTargetCommand.() -> Unit) {
	this.block.declare(AmazonElasticFileSystemCreateMountTargetCommand(fileSystemId, subnetId).apply(init))
}

@Generated
class AmazonElasticFileSystemCreateMountTargetCommand(val fileSystemId: String, val subnetId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.CreateMountTargetRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticfilesystem.createMountTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem create-mount-target")
				.argument("file-system-id", fileSystemId)
				.argument("subnet-id", subnetId)
				.argument("ip-address", ipAddress)
				.argument("security-groups", securityGroups?.toString())
	}

}


fun AmazonElasticFileSystemFunctions.createTags(fileSystemId: String, tags: List<com.amazonaws.services.elasticfilesystem.model.Tag>, init: AmazonElasticFileSystemCreateTagsCommand.() -> Unit) {
	this.block.declare(AmazonElasticFileSystemCreateTagsCommand(fileSystemId, tags).apply(init))
}

@Generated
class AmazonElasticFileSystemCreateTagsCommand(val fileSystemId: String, val tags: List<com.amazonaws.services.elasticfilesystem.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.CreateTagsRequest> {



	override fun build(): com.amazonaws.services.elasticfilesystem.model.CreateTagsRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.CreateTagsRequest()
		input.setFileSystemId(this.fileSystemId)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticfilesystem.createTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem create-tags")
				.argument("file-system-id", fileSystemId)
				.argument("tags", tags.toString())
	}

}


fun AmazonElasticFileSystemFunctions.deleteFileSystem(fileSystemId: String, init: AmazonElasticFileSystemDeleteFileSystemCommand.() -> Unit) {
	this.block.declare(AmazonElasticFileSystemDeleteFileSystemCommand(fileSystemId).apply(init))
}

@Generated
class AmazonElasticFileSystemDeleteFileSystemCommand(val fileSystemId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemRequest> {



	override fun build(): com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemRequest()
		input.setFileSystemId(this.fileSystemId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticfilesystem.deleteFileSystem(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem delete-file-system")
				.argument("file-system-id", fileSystemId)
	}

}


fun AmazonElasticFileSystemFunctions.deleteMountTarget(mountTargetId: String, init: AmazonElasticFileSystemDeleteMountTargetCommand.() -> Unit) {
	this.block.declare(AmazonElasticFileSystemDeleteMountTargetCommand(mountTargetId).apply(init))
}

@Generated
class AmazonElasticFileSystemDeleteMountTargetCommand(val mountTargetId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetRequest> {



	override fun build(): com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetRequest()
		input.setMountTargetId(this.mountTargetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticfilesystem.deleteMountTarget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem delete-mount-target")
				.argument("mount-target-id", mountTargetId)
	}

}


fun AmazonElasticFileSystemFunctions.deleteTags(fileSystemId: String, tagKeys: List<String>, init: AmazonElasticFileSystemDeleteTagsCommand.() -> Unit) {
	this.block.declare(AmazonElasticFileSystemDeleteTagsCommand(fileSystemId, tagKeys).apply(init))
}

@Generated
class AmazonElasticFileSystemDeleteTagsCommand(val fileSystemId: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.DeleteTagsRequest> {



	override fun build(): com.amazonaws.services.elasticfilesystem.model.DeleteTagsRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.DeleteTagsRequest()
		input.setFileSystemId(this.fileSystemId)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticfilesystem.deleteTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem delete-tags")
				.argument("file-system-id", fileSystemId)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AmazonElasticFileSystemFunctions.describeFileSystems(init: AmazonElasticFileSystemDescribeFileSystemsCommand.() -> Unit) {
	this.block.declare(AmazonElasticFileSystemDescribeFileSystemsCommand().apply(init))
}

@Generated
class AmazonElasticFileSystemDescribeFileSystemsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticfilesystem.describeFileSystems(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem describe-file-systems")
				.argument("max-items", maxItems?.toString())
				.argument("marker", marker)
				.argument("creation-token", creationToken)
				.argument("file-system-id", fileSystemId)
	}

}


fun AmazonElasticFileSystemFunctions.describeMountTargetSecurityGroups(mountTargetId: String, init: AmazonElasticFileSystemDescribeMountTargetSecurityGroupsCommand.() -> Unit) {
	this.block.declare(AmazonElasticFileSystemDescribeMountTargetSecurityGroupsCommand(mountTargetId).apply(init))
}

@Generated
class AmazonElasticFileSystemDescribeMountTargetSecurityGroupsCommand(val mountTargetId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsRequest> {



	override fun build(): com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsRequest()
		input.setMountTargetId(this.mountTargetId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticfilesystem.describeMountTargetSecurityGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem describe-mount-target-security-groups")
				.argument("mount-target-id", mountTargetId)
	}

}


fun AmazonElasticFileSystemFunctions.describeMountTargets(init: AmazonElasticFileSystemDescribeMountTargetsCommand.() -> Unit) {
	this.block.declare(AmazonElasticFileSystemDescribeMountTargetsCommand().apply(init))
}

@Generated
class AmazonElasticFileSystemDescribeMountTargetsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticfilesystem.describeMountTargets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem describe-mount-targets")
				.argument("max-items", maxItems?.toString())
				.argument("marker", marker)
				.argument("file-system-id", fileSystemId)
				.argument("mount-target-id", mountTargetId)
	}

}


fun AmazonElasticFileSystemFunctions.describeTags(fileSystemId: String, init: AmazonElasticFileSystemDescribeTagsCommand.() -> Unit) {
	this.block.declare(AmazonElasticFileSystemDescribeTagsCommand(fileSystemId).apply(init))
}

@Generated
class AmazonElasticFileSystemDescribeTagsCommand(val fileSystemId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.DescribeTagsRequest> {

	var maxItems: Int? = 0
	var marker: String? = null

	override fun build(): com.amazonaws.services.elasticfilesystem.model.DescribeTagsRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.DescribeTagsRequest()
		input.setMaxItems(this.maxItems)
		input.setMarker(this.marker)
		input.setFileSystemId(this.fileSystemId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticfilesystem.describeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem describe-tags")
				.argument("max-items", maxItems?.toString())
				.argument("marker", marker)
				.argument("file-system-id", fileSystemId)
	}

}


fun AmazonElasticFileSystemFunctions.modifyMountTargetSecurityGroups(mountTargetId: String, init: AmazonElasticFileSystemModifyMountTargetSecurityGroupsCommand.() -> Unit) {
	this.block.declare(AmazonElasticFileSystemModifyMountTargetSecurityGroupsCommand(mountTargetId).apply(init))
}

@Generated
class AmazonElasticFileSystemModifyMountTargetSecurityGroupsCommand(val mountTargetId: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsRequest> {

	var securityGroups: List<String>? = null

	override fun build(): com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsRequest {
		val input = com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsRequest()
		input.setMountTargetId(this.mountTargetId)
		input.setSecurityGroups(this.securityGroups)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.elasticfilesystem.modifyMountTargetSecurityGroups(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws elasticfilesystem modify-mount-target-security-groups")
				.argument("mount-target-id", mountTargetId)
				.argument("security-groups", securityGroups?.toString())
	}

}
