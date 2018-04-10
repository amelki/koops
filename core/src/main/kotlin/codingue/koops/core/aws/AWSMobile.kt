
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.mobile.AWSMobile
import com.amazonaws.services.mobile.model.*

var codingue.koops.core.Environment.AWSMobileHubService: AWSMobile
	get() = this.capabilities[AWSMobile::class.java.name] as AWSMobile
	set(AWSMobileHubService) {
		this.capabilities[AWSMobile::class.java.name] = AWSMobileHubService
	}

@Generated
class AWSMobileFunctions(val block: Block)

infix fun AwsContinuation.AWSMobileHubService(init: AWSMobileFunctions.() -> Unit) {
	AWSMobileFunctions(shell).apply(init)
}

			

fun AWSMobileFunctions.createProject(init: AWSMobileCreateProjectCommand.() -> Unit) {
	this.block.declare(AWSMobileCreateProjectCommand().apply(init))
}

@Generated
class AWSMobileCreateProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.CreateProjectRequest> {

	var name: String? = null
	var region: String? = null
	var contents: java.nio.ByteBuffer? = null
	var snapshotId: String? = null

	override fun build(): com.amazonaws.services.mobile.model.CreateProjectRequest {
		val input = com.amazonaws.services.mobile.model.CreateProjectRequest()
		input.setName(this.name)
		input.setRegion(this.region)
		input.setContents(this.contents)
		input.setSnapshotId(this.snapshotId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.AWSMobileHubService.createProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService create-project")
				.argument("name", name)
				.argument("region", region)
				.argument("contents", contents?.toString())
				.argument("snapshot-id", snapshotId)
	}

}


fun AWSMobileFunctions.deleteProject(init: AWSMobileDeleteProjectCommand.() -> Unit) {
	this.block.declare(AWSMobileDeleteProjectCommand().apply(init))
}

@Generated
class AWSMobileDeleteProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.DeleteProjectRequest> {

	var projectId: String? = null

	override fun build(): com.amazonaws.services.mobile.model.DeleteProjectRequest {
		val input = com.amazonaws.services.mobile.model.DeleteProjectRequest()
		input.setProjectId(this.projectId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.AWSMobileHubService.deleteProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService delete-project")
				.argument("project-id", projectId)
	}

}


fun AWSMobileFunctions.describeBundle(init: AWSMobileDescribeBundleCommand.() -> Unit) {
	this.block.declare(AWSMobileDescribeBundleCommand().apply(init))
}

@Generated
class AWSMobileDescribeBundleCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.DescribeBundleRequest> {

	var bundleId: String? = null

	override fun build(): com.amazonaws.services.mobile.model.DescribeBundleRequest {
		val input = com.amazonaws.services.mobile.model.DescribeBundleRequest()
		input.setBundleId(this.bundleId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.AWSMobileHubService.describeBundle(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService describe-bundle")
				.argument("bundle-id", bundleId)
	}

}


fun AWSMobileFunctions.describeProject(init: AWSMobileDescribeProjectCommand.() -> Unit) {
	this.block.declare(AWSMobileDescribeProjectCommand().apply(init))
}

@Generated
class AWSMobileDescribeProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.DescribeProjectRequest> {

	var projectId: String? = null
	var syncFromResources: Boolean? = false

	override fun build(): com.amazonaws.services.mobile.model.DescribeProjectRequest {
		val input = com.amazonaws.services.mobile.model.DescribeProjectRequest()
		input.setProjectId(this.projectId)
		input.setSyncFromResources(this.syncFromResources)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.AWSMobileHubService.describeProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService describe-project")
				.argument("project-id", projectId)
				.option("sync-from-resources", syncFromResources ?: false)
	}

}


fun AWSMobileFunctions.exportBundle(init: AWSMobileExportBundleCommand.() -> Unit) {
	this.block.declare(AWSMobileExportBundleCommand().apply(init))
}

@Generated
class AWSMobileExportBundleCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.ExportBundleRequest> {

	var bundleId: String? = null
	var projectId: String? = null
	var platform: Platform? = null

	override fun build(): com.amazonaws.services.mobile.model.ExportBundleRequest {
		val input = com.amazonaws.services.mobile.model.ExportBundleRequest()
		input.setBundleId(this.bundleId)
		input.setProjectId(this.projectId)
		input.setPlatform(this.platform?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.AWSMobileHubService.exportBundle(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService export-bundle")
				.argument("bundle-id", bundleId)
				.argument("project-id", projectId)
				.argument("platform", platform?.toString())
	}

}


fun AWSMobileFunctions.exportProject(init: AWSMobileExportProjectCommand.() -> Unit) {
	this.block.declare(AWSMobileExportProjectCommand().apply(init))
}

@Generated
class AWSMobileExportProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.ExportProjectRequest> {

	var projectId: String? = null

	override fun build(): com.amazonaws.services.mobile.model.ExportProjectRequest {
		val input = com.amazonaws.services.mobile.model.ExportProjectRequest()
		input.setProjectId(this.projectId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.AWSMobileHubService.exportProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService export-project")
				.argument("project-id", projectId)
	}

}


fun AWSMobileFunctions.listBundles(init: AWSMobileListBundlesCommand.() -> Unit) {
	this.block.declare(AWSMobileListBundlesCommand().apply(init))
}

@Generated
class AWSMobileListBundlesCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.ListBundlesRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mobile.model.ListBundlesRequest {
		val input = com.amazonaws.services.mobile.model.ListBundlesRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.AWSMobileHubService.listBundles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService list-bundles")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMobileFunctions.listProjects(init: AWSMobileListProjectsCommand.() -> Unit) {
	this.block.declare(AWSMobileListProjectsCommand().apply(init))
}

@Generated
class AWSMobileListProjectsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.ListProjectsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mobile.model.ListProjectsRequest {
		val input = com.amazonaws.services.mobile.model.ListProjectsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.AWSMobileHubService.listProjects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService list-projects")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMobileFunctions.updateProject(init: AWSMobileUpdateProjectCommand.() -> Unit) {
	this.block.declare(AWSMobileUpdateProjectCommand().apply(init))
}

@Generated
class AWSMobileUpdateProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.UpdateProjectRequest> {

	var contents: java.nio.ByteBuffer? = null
	var projectId: String? = null

	override fun build(): com.amazonaws.services.mobile.model.UpdateProjectRequest {
		val input = com.amazonaws.services.mobile.model.UpdateProjectRequest()
		input.setContents(this.contents)
		input.setProjectId(this.projectId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.AWSMobileHubService.updateProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService update-project")
				.argument("contents", contents?.toString())
				.argument("project-id", projectId)
	}

}
