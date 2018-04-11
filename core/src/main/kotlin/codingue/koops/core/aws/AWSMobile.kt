
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
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

infix fun <T> AwsContinuation.AWSMobileHubService(init: AWSMobileFunctions.() -> T): T {
	return AWSMobileFunctions(shell).run(init)
}

			

fun AWSMobileFunctions.createProject(init: AWSMobileCreateProjectCommand.() -> Unit): com.amazonaws.services.mobile.model.CreateProjectResult {
	return this.block.declare(AWSMobileCreateProjectCommand().apply(init)) as com.amazonaws.services.mobile.model.CreateProjectResult
}

@Generated
class AWSMobileCreateProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.CreateProjectRequest, com.amazonaws.services.mobile.model.CreateProjectResult> {

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

	
	override fun dryResult(): com.amazonaws.services.mobile.model.CreateProjectResult {
	  return com.amazonaws.services.mobile.model.CreateProjectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mobile.model.CreateProjectResult {
		return environment.AWSMobileHubService.createProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService create-project")
				.argument("name", name)
				.argument("region", region)
				.argument("contents", contents?.toString())
				.argument("snapshot-id", snapshotId)
	}

}


fun AWSMobileFunctions.deleteProject(init: AWSMobileDeleteProjectCommand.() -> Unit): com.amazonaws.services.mobile.model.DeleteProjectResult {
	return this.block.declare(AWSMobileDeleteProjectCommand().apply(init)) as com.amazonaws.services.mobile.model.DeleteProjectResult
}

@Generated
class AWSMobileDeleteProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.DeleteProjectRequest, com.amazonaws.services.mobile.model.DeleteProjectResult> {

	var projectId: String? = null

	override fun build(): com.amazonaws.services.mobile.model.DeleteProjectRequest {
		val input = com.amazonaws.services.mobile.model.DeleteProjectRequest()
		input.setProjectId(this.projectId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mobile.model.DeleteProjectResult {
	  return com.amazonaws.services.mobile.model.DeleteProjectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mobile.model.DeleteProjectResult {
		return environment.AWSMobileHubService.deleteProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService delete-project")
				.argument("project-id", projectId)
	}

}


fun AWSMobileFunctions.describeBundle(init: AWSMobileDescribeBundleCommand.() -> Unit): com.amazonaws.services.mobile.model.DescribeBundleResult {
	return this.block.declare(AWSMobileDescribeBundleCommand().apply(init)) as com.amazonaws.services.mobile.model.DescribeBundleResult
}

@Generated
class AWSMobileDescribeBundleCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.DescribeBundleRequest, com.amazonaws.services.mobile.model.DescribeBundleResult> {

	var bundleId: String? = null

	override fun build(): com.amazonaws.services.mobile.model.DescribeBundleRequest {
		val input = com.amazonaws.services.mobile.model.DescribeBundleRequest()
		input.setBundleId(this.bundleId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mobile.model.DescribeBundleResult {
	  return com.amazonaws.services.mobile.model.DescribeBundleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mobile.model.DescribeBundleResult {
		return environment.AWSMobileHubService.describeBundle(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService describe-bundle")
				.argument("bundle-id", bundleId)
	}

}


fun AWSMobileFunctions.describeProject(init: AWSMobileDescribeProjectCommand.() -> Unit): com.amazonaws.services.mobile.model.DescribeProjectResult {
	return this.block.declare(AWSMobileDescribeProjectCommand().apply(init)) as com.amazonaws.services.mobile.model.DescribeProjectResult
}

@Generated
class AWSMobileDescribeProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.DescribeProjectRequest, com.amazonaws.services.mobile.model.DescribeProjectResult> {

	var projectId: String? = null
	var syncFromResources: Boolean? = false

	override fun build(): com.amazonaws.services.mobile.model.DescribeProjectRequest {
		val input = com.amazonaws.services.mobile.model.DescribeProjectRequest()
		input.setProjectId(this.projectId)
		input.setSyncFromResources(this.syncFromResources)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mobile.model.DescribeProjectResult {
	  return com.amazonaws.services.mobile.model.DescribeProjectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mobile.model.DescribeProjectResult {
		return environment.AWSMobileHubService.describeProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService describe-project")
				.argument("project-id", projectId)
				.option("sync-from-resources", syncFromResources ?: false)
	}

}


fun AWSMobileFunctions.exportBundle(init: AWSMobileExportBundleCommand.() -> Unit): com.amazonaws.services.mobile.model.ExportBundleResult {
	return this.block.declare(AWSMobileExportBundleCommand().apply(init)) as com.amazonaws.services.mobile.model.ExportBundleResult
}

@Generated
class AWSMobileExportBundleCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.ExportBundleRequest, com.amazonaws.services.mobile.model.ExportBundleResult> {

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

	
	override fun dryResult(): com.amazonaws.services.mobile.model.ExportBundleResult {
	  return com.amazonaws.services.mobile.model.ExportBundleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mobile.model.ExportBundleResult {
		return environment.AWSMobileHubService.exportBundle(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService export-bundle")
				.argument("bundle-id", bundleId)
				.argument("project-id", projectId)
				.argument("platform", platform?.toString())
	}

}


fun AWSMobileFunctions.exportProject(init: AWSMobileExportProjectCommand.() -> Unit): com.amazonaws.services.mobile.model.ExportProjectResult {
	return this.block.declare(AWSMobileExportProjectCommand().apply(init)) as com.amazonaws.services.mobile.model.ExportProjectResult
}

@Generated
class AWSMobileExportProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.ExportProjectRequest, com.amazonaws.services.mobile.model.ExportProjectResult> {

	var projectId: String? = null

	override fun build(): com.amazonaws.services.mobile.model.ExportProjectRequest {
		val input = com.amazonaws.services.mobile.model.ExportProjectRequest()
		input.setProjectId(this.projectId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mobile.model.ExportProjectResult {
	  return com.amazonaws.services.mobile.model.ExportProjectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mobile.model.ExportProjectResult {
		return environment.AWSMobileHubService.exportProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService export-project")
				.argument("project-id", projectId)
	}

}


fun AWSMobileFunctions.listBundles(init: AWSMobileListBundlesCommand.() -> Unit): com.amazonaws.services.mobile.model.ListBundlesResult {
	return this.block.declare(AWSMobileListBundlesCommand().apply(init)) as com.amazonaws.services.mobile.model.ListBundlesResult
}

@Generated
class AWSMobileListBundlesCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.ListBundlesRequest, com.amazonaws.services.mobile.model.ListBundlesResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mobile.model.ListBundlesRequest {
		val input = com.amazonaws.services.mobile.model.ListBundlesRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mobile.model.ListBundlesResult {
	  return com.amazonaws.services.mobile.model.ListBundlesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mobile.model.ListBundlesResult {
		return environment.AWSMobileHubService.listBundles(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService list-bundles")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMobileFunctions.listProjects(init: AWSMobileListProjectsCommand.() -> Unit): com.amazonaws.services.mobile.model.ListProjectsResult {
	return this.block.declare(AWSMobileListProjectsCommand().apply(init)) as com.amazonaws.services.mobile.model.ListProjectsResult
}

@Generated
class AWSMobileListProjectsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.ListProjectsRequest, com.amazonaws.services.mobile.model.ListProjectsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mobile.model.ListProjectsRequest {
		val input = com.amazonaws.services.mobile.model.ListProjectsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mobile.model.ListProjectsResult {
	  return com.amazonaws.services.mobile.model.ListProjectsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mobile.model.ListProjectsResult {
		return environment.AWSMobileHubService.listProjects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService list-projects")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMobileFunctions.updateProject(init: AWSMobileUpdateProjectCommand.() -> Unit): com.amazonaws.services.mobile.model.UpdateProjectResult {
	return this.block.declare(AWSMobileUpdateProjectCommand().apply(init)) as com.amazonaws.services.mobile.model.UpdateProjectResult
}

@Generated
class AWSMobileUpdateProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.mobile.model.UpdateProjectRequest, com.amazonaws.services.mobile.model.UpdateProjectResult> {

	var contents: java.nio.ByteBuffer? = null
	var projectId: String? = null

	override fun build(): com.amazonaws.services.mobile.model.UpdateProjectRequest {
		val input = com.amazonaws.services.mobile.model.UpdateProjectRequest()
		input.setContents(this.contents)
		input.setProjectId(this.projectId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.mobile.model.UpdateProjectResult {
	  return com.amazonaws.services.mobile.model.UpdateProjectResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.mobile.model.UpdateProjectResult {
		return environment.AWSMobileHubService.updateProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws AWSMobileHubService update-project")
				.argument("contents", contents?.toString())
				.argument("project-id", projectId)
	}

}
