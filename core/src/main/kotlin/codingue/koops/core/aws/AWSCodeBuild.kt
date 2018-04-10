
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.codebuild.AWSCodeBuild
import com.amazonaws.services.codebuild.model.*

var codingue.koops.core.Environment.codebuild: AWSCodeBuild
	get() = this.capabilities[AWSCodeBuild::class.java.name] as AWSCodeBuild
	set(codebuild) {
		this.capabilities[AWSCodeBuild::class.java.name] = codebuild
	}

@Generated
class AWSCodeBuildFunctions(val block: Block)

infix fun AwsContinuation.codebuild(init: AWSCodeBuildFunctions.() -> Unit) {
	AWSCodeBuildFunctions(shell).apply(init)
}

			

fun AWSCodeBuildFunctions.batchDeleteBuilds(init: AWSCodeBuildBatchDeleteBuildsCommand.() -> Unit) {
	this.block.declare(AWSCodeBuildBatchDeleteBuildsCommand().apply(init))
}

@Generated
class AWSCodeBuildBatchDeleteBuildsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest> {

	var ids: List<String>? = null

	override fun build(): com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest {
		val input = com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest()
		input.setIds(this.ids)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codebuild.batchDeleteBuilds(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild batch-delete-builds")
				.argument("ids", ids?.toString())
	}

}


fun AWSCodeBuildFunctions.batchGetBuilds(init: AWSCodeBuildBatchGetBuildsCommand.() -> Unit) {
	this.block.declare(AWSCodeBuildBatchGetBuildsCommand().apply(init))
}

@Generated
class AWSCodeBuildBatchGetBuildsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.BatchGetBuildsRequest> {

	var ids: List<String>? = null

	override fun build(): com.amazonaws.services.codebuild.model.BatchGetBuildsRequest {
		val input = com.amazonaws.services.codebuild.model.BatchGetBuildsRequest()
		input.setIds(this.ids)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codebuild.batchGetBuilds(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild batch-get-builds")
				.argument("ids", ids?.toString())
	}

}


fun AWSCodeBuildFunctions.batchGetProjects(init: AWSCodeBuildBatchGetProjectsCommand.() -> Unit) {
	this.block.declare(AWSCodeBuildBatchGetProjectsCommand().apply(init))
}

@Generated
class AWSCodeBuildBatchGetProjectsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.BatchGetProjectsRequest> {

	var names: List<String>? = null

	override fun build(): com.amazonaws.services.codebuild.model.BatchGetProjectsRequest {
		val input = com.amazonaws.services.codebuild.model.BatchGetProjectsRequest()
		input.setNames(this.names)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codebuild.batchGetProjects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild batch-get-projects")
				.argument("names", names?.toString())
	}

}


fun AWSCodeBuildFunctions.createProject(init: AWSCodeBuildCreateProjectCommand.() -> Unit) {
	this.block.declare(AWSCodeBuildCreateProjectCommand().apply(init))
}

@Generated
class AWSCodeBuildCreateProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.CreateProjectRequest> {

	var name: String? = null
	var description: String? = null
	var source: com.amazonaws.services.codebuild.model.ProjectSource? = null
	var artifacts: com.amazonaws.services.codebuild.model.ProjectArtifacts? = null
	var cache: com.amazonaws.services.codebuild.model.ProjectCache? = null
	var environment: com.amazonaws.services.codebuild.model.ProjectEnvironment? = null
	var serviceRole: String? = null
	var timeoutInMinutes: Int? = 0
	var encryptionKey: String? = null
	var tags: List<com.amazonaws.services.codebuild.model.Tag>? = null
	var vpcConfig: com.amazonaws.services.codebuild.model.VpcConfig? = null
	var badgeEnabled: Boolean? = false

	override fun build(): com.amazonaws.services.codebuild.model.CreateProjectRequest {
		val input = com.amazonaws.services.codebuild.model.CreateProjectRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setSource(this.source)
		input.setArtifacts(this.artifacts)
		input.setCache(this.cache)
		input.setEnvironment(this.environment)
		input.setServiceRole(this.serviceRole)
		input.setTimeoutInMinutes(this.timeoutInMinutes)
		input.setEncryptionKey(this.encryptionKey)
		input.setTags(this.tags)
		input.setVpcConfig(this.vpcConfig)
		input.setBadgeEnabled(this.badgeEnabled)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codebuild.createProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild create-project")
				.argument("name", name)
				.argument("description", description)
				.argument("source", source?.toString())
				.argument("artifacts", artifacts?.toString())
				.argument("cache", cache?.toString())
				.argument("environment", environment?.toString())
				.argument("service-role", serviceRole)
				.argument("timeout-in-minutes", timeoutInMinutes?.toString())
				.argument("encryption-key", encryptionKey)
				.argument("tags", tags?.toString())
				.argument("vpc-config", vpcConfig?.toString())
				.option("badge-enabled", badgeEnabled ?: false)
	}

}


fun AWSCodeBuildFunctions.createWebhook(init: AWSCodeBuildCreateWebhookCommand.() -> Unit) {
	this.block.declare(AWSCodeBuildCreateWebhookCommand().apply(init))
}

@Generated
class AWSCodeBuildCreateWebhookCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.CreateWebhookRequest> {

	var projectName: String? = null
	var branchFilter: String? = null

	override fun build(): com.amazonaws.services.codebuild.model.CreateWebhookRequest {
		val input = com.amazonaws.services.codebuild.model.CreateWebhookRequest()
		input.setProjectName(this.projectName)
		input.setBranchFilter(this.branchFilter)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codebuild.createWebhook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild create-webhook")
				.argument("project-name", projectName)
				.argument("branch-filter", branchFilter)
	}

}


fun AWSCodeBuildFunctions.deleteProject(init: AWSCodeBuildDeleteProjectCommand.() -> Unit) {
	this.block.declare(AWSCodeBuildDeleteProjectCommand().apply(init))
}

@Generated
class AWSCodeBuildDeleteProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.DeleteProjectRequest> {

	var name: String? = null

	override fun build(): com.amazonaws.services.codebuild.model.DeleteProjectRequest {
		val input = com.amazonaws.services.codebuild.model.DeleteProjectRequest()
		input.setName(this.name)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codebuild.deleteProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild delete-project")
				.argument("name", name)
	}

}


fun AWSCodeBuildFunctions.deleteWebhook(init: AWSCodeBuildDeleteWebhookCommand.() -> Unit) {
	this.block.declare(AWSCodeBuildDeleteWebhookCommand().apply(init))
}

@Generated
class AWSCodeBuildDeleteWebhookCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.DeleteWebhookRequest> {

	var projectName: String? = null

	override fun build(): com.amazonaws.services.codebuild.model.DeleteWebhookRequest {
		val input = com.amazonaws.services.codebuild.model.DeleteWebhookRequest()
		input.setProjectName(this.projectName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codebuild.deleteWebhook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild delete-webhook")
				.argument("project-name", projectName)
	}

}


fun AWSCodeBuildFunctions.invalidateProjectCache(init: AWSCodeBuildInvalidateProjectCacheCommand.() -> Unit) {
	this.block.declare(AWSCodeBuildInvalidateProjectCacheCommand().apply(init))
}

@Generated
class AWSCodeBuildInvalidateProjectCacheCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest> {

	var projectName: String? = null

	override fun build(): com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest {
		val input = com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest()
		input.setProjectName(this.projectName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codebuild.invalidateProjectCache(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild invalidate-project-cache")
				.argument("project-name", projectName)
	}

}


fun AWSCodeBuildFunctions.listBuilds(init: AWSCodeBuildListBuildsCommand.() -> Unit) {
	this.block.declare(AWSCodeBuildListBuildsCommand().apply(init))
}

@Generated
class AWSCodeBuildListBuildsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.ListBuildsRequest> {

	var sortOrder: SortOrderType? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codebuild.model.ListBuildsRequest {
		val input = com.amazonaws.services.codebuild.model.ListBuildsRequest()
		input.setSortOrder(this.sortOrder?.toString())
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codebuild.listBuilds(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild list-builds")
				.argument("sort-order", sortOrder?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCodeBuildFunctions.listBuildsForProject(init: AWSCodeBuildListBuildsForProjectCommand.() -> Unit) {
	this.block.declare(AWSCodeBuildListBuildsForProjectCommand().apply(init))
}

@Generated
class AWSCodeBuildListBuildsForProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest> {

	var projectName: String? = null
	var sortOrder: SortOrderType? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest {
		val input = com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest()
		input.setProjectName(this.projectName)
		input.setSortOrder(this.sortOrder?.toString())
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codebuild.listBuildsForProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild list-builds-for-project")
				.argument("project-name", projectName)
				.argument("sort-order", sortOrder?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCodeBuildFunctions.listCuratedEnvironmentImages(init: AWSCodeBuildListCuratedEnvironmentImagesCommand.() -> Unit) {
	this.block.declare(AWSCodeBuildListCuratedEnvironmentImagesCommand().apply(init))
}

@Generated
class AWSCodeBuildListCuratedEnvironmentImagesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest> {



	override fun build(): com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest {
		val input = com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codebuild.listCuratedEnvironmentImages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild list-curated-environment-images")

	}

}


fun AWSCodeBuildFunctions.listProjects(init: AWSCodeBuildListProjectsCommand.() -> Unit) {
	this.block.declare(AWSCodeBuildListProjectsCommand().apply(init))
}

@Generated
class AWSCodeBuildListProjectsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.ListProjectsRequest> {

	var sortBy: ProjectSortByType? = null
	var sortOrder: SortOrderType? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codebuild.model.ListProjectsRequest {
		val input = com.amazonaws.services.codebuild.model.ListProjectsRequest()
		input.setSortBy(this.sortBy?.toString())
		input.setSortOrder(this.sortOrder?.toString())
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codebuild.listProjects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild list-projects")
				.argument("sort-by", sortBy?.toString())
				.argument("sort-order", sortOrder?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCodeBuildFunctions.startBuild(init: AWSCodeBuildStartBuildCommand.() -> Unit) {
	this.block.declare(AWSCodeBuildStartBuildCommand().apply(init))
}

@Generated
class AWSCodeBuildStartBuildCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.StartBuildRequest> {

	var projectName: String? = null
	var sourceVersion: String? = null
	var artifactsOverride: com.amazonaws.services.codebuild.model.ProjectArtifacts? = null
	var environmentVariablesOverride: List<com.amazonaws.services.codebuild.model.EnvironmentVariable>? = null
	var gitCloneDepthOverride: Int? = 0
	var buildspecOverride: String? = null
	var timeoutInMinutesOverride: Int? = 0

	override fun build(): com.amazonaws.services.codebuild.model.StartBuildRequest {
		val input = com.amazonaws.services.codebuild.model.StartBuildRequest()
		input.setProjectName(this.projectName)
		input.setSourceVersion(this.sourceVersion)
		input.setArtifactsOverride(this.artifactsOverride)
		input.setEnvironmentVariablesOverride(this.environmentVariablesOverride)
		input.setGitCloneDepthOverride(this.gitCloneDepthOverride)
		input.setBuildspecOverride(this.buildspecOverride)
		input.setTimeoutInMinutesOverride(this.timeoutInMinutesOverride)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codebuild.startBuild(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild start-build")
				.argument("project-name", projectName)
				.argument("source-version", sourceVersion)
				.argument("artifacts-override", artifactsOverride?.toString())
				.argument("environment-variables-override", environmentVariablesOverride?.toString())
				.argument("git-clone-depth-override", gitCloneDepthOverride?.toString())
				.argument("buildspec-override", buildspecOverride)
				.argument("timeout-in-minutes-override", timeoutInMinutesOverride?.toString())
	}

}


fun AWSCodeBuildFunctions.stopBuild(init: AWSCodeBuildStopBuildCommand.() -> Unit) {
	this.block.declare(AWSCodeBuildStopBuildCommand().apply(init))
}

@Generated
class AWSCodeBuildStopBuildCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.StopBuildRequest> {

	var id: String? = null

	override fun build(): com.amazonaws.services.codebuild.model.StopBuildRequest {
		val input = com.amazonaws.services.codebuild.model.StopBuildRequest()
		input.setId(this.id)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codebuild.stopBuild(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild stop-build")
				.argument("id", id)
	}

}


fun AWSCodeBuildFunctions.updateProject(init: AWSCodeBuildUpdateProjectCommand.() -> Unit) {
	this.block.declare(AWSCodeBuildUpdateProjectCommand().apply(init))
}

@Generated
class AWSCodeBuildUpdateProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.UpdateProjectRequest> {

	var name: String? = null
	var description: String? = null
	var source: com.amazonaws.services.codebuild.model.ProjectSource? = null
	var artifacts: com.amazonaws.services.codebuild.model.ProjectArtifacts? = null
	var cache: com.amazonaws.services.codebuild.model.ProjectCache? = null
	var environment: com.amazonaws.services.codebuild.model.ProjectEnvironment? = null
	var serviceRole: String? = null
	var timeoutInMinutes: Int? = 0
	var encryptionKey: String? = null
	var tags: List<com.amazonaws.services.codebuild.model.Tag>? = null
	var vpcConfig: com.amazonaws.services.codebuild.model.VpcConfig? = null
	var badgeEnabled: Boolean? = false

	override fun build(): com.amazonaws.services.codebuild.model.UpdateProjectRequest {
		val input = com.amazonaws.services.codebuild.model.UpdateProjectRequest()
		input.setName(this.name)
		input.setDescription(this.description)
		input.setSource(this.source)
		input.setArtifacts(this.artifacts)
		input.setCache(this.cache)
		input.setEnvironment(this.environment)
		input.setServiceRole(this.serviceRole)
		input.setTimeoutInMinutes(this.timeoutInMinutes)
		input.setEncryptionKey(this.encryptionKey)
		input.setTags(this.tags)
		input.setVpcConfig(this.vpcConfig)
		input.setBadgeEnabled(this.badgeEnabled)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codebuild.updateProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild update-project")
				.argument("name", name)
				.argument("description", description)
				.argument("source", source?.toString())
				.argument("artifacts", artifacts?.toString())
				.argument("cache", cache?.toString())
				.argument("environment", environment?.toString())
				.argument("service-role", serviceRole)
				.argument("timeout-in-minutes", timeoutInMinutes?.toString())
				.argument("encryption-key", encryptionKey)
				.argument("tags", tags?.toString())
				.argument("vpc-config", vpcConfig?.toString())
				.option("badge-enabled", badgeEnabled ?: false)
	}

}


fun AWSCodeBuildFunctions.updateWebhook(init: AWSCodeBuildUpdateWebhookCommand.() -> Unit) {
	this.block.declare(AWSCodeBuildUpdateWebhookCommand().apply(init))
}

@Generated
class AWSCodeBuildUpdateWebhookCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.UpdateWebhookRequest> {

	var projectName: String? = null
	var branchFilter: String? = null
	var rotateSecret: Boolean? = false

	override fun build(): com.amazonaws.services.codebuild.model.UpdateWebhookRequest {
		val input = com.amazonaws.services.codebuild.model.UpdateWebhookRequest()
		input.setProjectName(this.projectName)
		input.setBranchFilter(this.branchFilter)
		input.setRotateSecret(this.rotateSecret)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.codebuild.updateWebhook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild update-webhook")
				.argument("project-name", projectName)
				.argument("branch-filter", branchFilter)
				.option("rotate-secret", rotateSecret ?: false)
	}

}
