
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.codebuild

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.codebuild.*
import com.amazonaws.services.codebuild.model.*

var com.codingue.koops.core.Environment.codebuild: AWSCodeBuild
	get() {
		var service = this.capabilities["aws-codebuild"]
		if (service == null) {
			service = AWSCodeBuildClientBuilder.standard().build()
			this.capabilities["aws-codebuild"] = service
		}
		return service as AWSCodeBuild
	}
	set(codebuild) {
		this.capabilities["aws-codebuild"] = codebuild
	}

@Generated
class AWSCodeBuildFunctions(val block: Script)

infix fun <T> AwsContinuation.codebuild(init: AWSCodeBuildFunctions.() -> T): T {
	return AWSCodeBuildFunctions(shell).run(init)
}

			

fun AWSCodeBuildFunctions.batchDeleteBuilds(init: (AWSCodeBuildBatchDeleteBuildsCommand.() -> Unit)? = null): com.amazonaws.services.codebuild.model.BatchDeleteBuildsResult {
	return this.block.declare(AWSCodeBuildBatchDeleteBuildsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codebuild.model.BatchDeleteBuildsResult
}

@Generated
class AWSCodeBuildBatchDeleteBuildsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest, com.amazonaws.services.codebuild.model.BatchDeleteBuildsResult> {

	var ids: List<String>? = null

	override fun build(): com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest {
		val input = com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest()
		input.setIds(this.ids)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codebuild.model.BatchDeleteBuildsResult {
	  return com.amazonaws.services.codebuild.model.BatchDeleteBuildsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codebuild.model.BatchDeleteBuildsResult {
		return environment.codebuild.batchDeleteBuilds(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild batch-delete-builds")
				.argument("ids", ids?.toString())
	}

}


fun AWSCodeBuildFunctions.batchGetBuilds(init: (AWSCodeBuildBatchGetBuildsCommand.() -> Unit)? = null): com.amazonaws.services.codebuild.model.BatchGetBuildsResult {
	return this.block.declare(AWSCodeBuildBatchGetBuildsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codebuild.model.BatchGetBuildsResult
}

@Generated
class AWSCodeBuildBatchGetBuildsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.BatchGetBuildsRequest, com.amazonaws.services.codebuild.model.BatchGetBuildsResult> {

	var ids: List<String>? = null

	override fun build(): com.amazonaws.services.codebuild.model.BatchGetBuildsRequest {
		val input = com.amazonaws.services.codebuild.model.BatchGetBuildsRequest()
		input.setIds(this.ids)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codebuild.model.BatchGetBuildsResult {
	  return com.amazonaws.services.codebuild.model.BatchGetBuildsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codebuild.model.BatchGetBuildsResult {
		return environment.codebuild.batchGetBuilds(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild batch-get-builds")
				.argument("ids", ids?.toString())
	}

}


fun AWSCodeBuildFunctions.batchGetProjects(init: (AWSCodeBuildBatchGetProjectsCommand.() -> Unit)? = null): com.amazonaws.services.codebuild.model.BatchGetProjectsResult {
	return this.block.declare(AWSCodeBuildBatchGetProjectsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codebuild.model.BatchGetProjectsResult
}

@Generated
class AWSCodeBuildBatchGetProjectsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.BatchGetProjectsRequest, com.amazonaws.services.codebuild.model.BatchGetProjectsResult> {

	var names: List<String>? = null

	override fun build(): com.amazonaws.services.codebuild.model.BatchGetProjectsRequest {
		val input = com.amazonaws.services.codebuild.model.BatchGetProjectsRequest()
		input.setNames(this.names)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codebuild.model.BatchGetProjectsResult {
	  return com.amazonaws.services.codebuild.model.BatchGetProjectsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codebuild.model.BatchGetProjectsResult {
		return environment.codebuild.batchGetProjects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild batch-get-projects")
				.argument("names", names?.toString())
	}

}


fun AWSCodeBuildFunctions.createProject(init: (AWSCodeBuildCreateProjectCommand.() -> Unit)? = null): com.amazonaws.services.codebuild.model.CreateProjectResult {
	return this.block.declare(AWSCodeBuildCreateProjectCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codebuild.model.CreateProjectResult
}

@Generated
class AWSCodeBuildCreateProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.CreateProjectRequest, com.amazonaws.services.codebuild.model.CreateProjectResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codebuild.model.CreateProjectResult {
	  return com.amazonaws.services.codebuild.model.CreateProjectResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codebuild.model.CreateProjectResult {
		return environment.codebuild.createProject(build())
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


fun AWSCodeBuildFunctions.createWebhook(init: (AWSCodeBuildCreateWebhookCommand.() -> Unit)? = null): com.amazonaws.services.codebuild.model.CreateWebhookResult {
	return this.block.declare(AWSCodeBuildCreateWebhookCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codebuild.model.CreateWebhookResult
}

@Generated
class AWSCodeBuildCreateWebhookCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.CreateWebhookRequest, com.amazonaws.services.codebuild.model.CreateWebhookResult> {

	var projectName: String? = null
	var branchFilter: String? = null

	override fun build(): com.amazonaws.services.codebuild.model.CreateWebhookRequest {
		val input = com.amazonaws.services.codebuild.model.CreateWebhookRequest()
		input.setProjectName(this.projectName)
		input.setBranchFilter(this.branchFilter)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codebuild.model.CreateWebhookResult {
	  return com.amazonaws.services.codebuild.model.CreateWebhookResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codebuild.model.CreateWebhookResult {
		return environment.codebuild.createWebhook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild create-webhook")
				.argument("project-name", projectName)
				.argument("branch-filter", branchFilter)
	}

}


fun AWSCodeBuildFunctions.deleteProject(init: (AWSCodeBuildDeleteProjectCommand.() -> Unit)? = null): com.amazonaws.services.codebuild.model.DeleteProjectResult {
	return this.block.declare(AWSCodeBuildDeleteProjectCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codebuild.model.DeleteProjectResult
}

@Generated
class AWSCodeBuildDeleteProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.DeleteProjectRequest, com.amazonaws.services.codebuild.model.DeleteProjectResult> {

	var name: String? = null

	override fun build(): com.amazonaws.services.codebuild.model.DeleteProjectRequest {
		val input = com.amazonaws.services.codebuild.model.DeleteProjectRequest()
		input.setName(this.name)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codebuild.model.DeleteProjectResult {
	  return com.amazonaws.services.codebuild.model.DeleteProjectResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codebuild.model.DeleteProjectResult {
		return environment.codebuild.deleteProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild delete-project")
				.argument("name", name)
	}

}


fun AWSCodeBuildFunctions.deleteWebhook(init: (AWSCodeBuildDeleteWebhookCommand.() -> Unit)? = null): com.amazonaws.services.codebuild.model.DeleteWebhookResult {
	return this.block.declare(AWSCodeBuildDeleteWebhookCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codebuild.model.DeleteWebhookResult
}

@Generated
class AWSCodeBuildDeleteWebhookCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.DeleteWebhookRequest, com.amazonaws.services.codebuild.model.DeleteWebhookResult> {

	var projectName: String? = null

	override fun build(): com.amazonaws.services.codebuild.model.DeleteWebhookRequest {
		val input = com.amazonaws.services.codebuild.model.DeleteWebhookRequest()
		input.setProjectName(this.projectName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codebuild.model.DeleteWebhookResult {
	  return com.amazonaws.services.codebuild.model.DeleteWebhookResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codebuild.model.DeleteWebhookResult {
		return environment.codebuild.deleteWebhook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild delete-webhook")
				.argument("project-name", projectName)
	}

}


fun AWSCodeBuildFunctions.invalidateProjectCache(init: (AWSCodeBuildInvalidateProjectCacheCommand.() -> Unit)? = null): com.amazonaws.services.codebuild.model.InvalidateProjectCacheResult {
	return this.block.declare(AWSCodeBuildInvalidateProjectCacheCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codebuild.model.InvalidateProjectCacheResult
}

@Generated
class AWSCodeBuildInvalidateProjectCacheCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest, com.amazonaws.services.codebuild.model.InvalidateProjectCacheResult> {

	var projectName: String? = null

	override fun build(): com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest {
		val input = com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest()
		input.setProjectName(this.projectName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codebuild.model.InvalidateProjectCacheResult {
	  return com.amazonaws.services.codebuild.model.InvalidateProjectCacheResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codebuild.model.InvalidateProjectCacheResult {
		return environment.codebuild.invalidateProjectCache(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild invalidate-project-cache")
				.argument("project-name", projectName)
	}

}


fun AWSCodeBuildFunctions.listBuilds(init: (AWSCodeBuildListBuildsCommand.() -> Unit)? = null): com.amazonaws.services.codebuild.model.ListBuildsResult {
	return this.block.declare(AWSCodeBuildListBuildsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codebuild.model.ListBuildsResult
}

@Generated
class AWSCodeBuildListBuildsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.ListBuildsRequest, com.amazonaws.services.codebuild.model.ListBuildsResult> {

	var sortOrder: SortOrderType? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codebuild.model.ListBuildsRequest {
		val input = com.amazonaws.services.codebuild.model.ListBuildsRequest()
		input.setSortOrder(this.sortOrder?.toString())
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codebuild.model.ListBuildsResult {
	  return com.amazonaws.services.codebuild.model.ListBuildsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codebuild.model.ListBuildsResult {
		return environment.codebuild.listBuilds(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild list-builds")
				.argument("sort-order", sortOrder?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCodeBuildFunctions.listBuildsForProject(init: (AWSCodeBuildListBuildsForProjectCommand.() -> Unit)? = null): com.amazonaws.services.codebuild.model.ListBuildsForProjectResult {
	return this.block.declare(AWSCodeBuildListBuildsForProjectCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codebuild.model.ListBuildsForProjectResult
}

@Generated
class AWSCodeBuildListBuildsForProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest, com.amazonaws.services.codebuild.model.ListBuildsForProjectResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codebuild.model.ListBuildsForProjectResult {
	  return com.amazonaws.services.codebuild.model.ListBuildsForProjectResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codebuild.model.ListBuildsForProjectResult {
		return environment.codebuild.listBuildsForProject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild list-builds-for-project")
				.argument("project-name", projectName)
				.argument("sort-order", sortOrder?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCodeBuildFunctions.listCuratedEnvironmentImages(init: (AWSCodeBuildListCuratedEnvironmentImagesCommand.() -> Unit)? = null): com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesResult {
	return this.block.declare(AWSCodeBuildListCuratedEnvironmentImagesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesResult
}

@Generated
class AWSCodeBuildListCuratedEnvironmentImagesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest, com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesResult> {



	override fun build(): com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest {
		val input = com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest()

		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesResult {
	  return com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesResult {
		return environment.codebuild.listCuratedEnvironmentImages(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild list-curated-environment-images")

	}

}


fun AWSCodeBuildFunctions.listProjects(init: (AWSCodeBuildListProjectsCommand.() -> Unit)? = null): com.amazonaws.services.codebuild.model.ListProjectsResult {
	return this.block.declare(AWSCodeBuildListProjectsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codebuild.model.ListProjectsResult
}

@Generated
class AWSCodeBuildListProjectsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.ListProjectsRequest, com.amazonaws.services.codebuild.model.ListProjectsResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codebuild.model.ListProjectsResult {
	  return com.amazonaws.services.codebuild.model.ListProjectsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codebuild.model.ListProjectsResult {
		return environment.codebuild.listProjects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild list-projects")
				.argument("sort-by", sortBy?.toString())
				.argument("sort-order", sortOrder?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCodeBuildFunctions.startBuild(init: (AWSCodeBuildStartBuildCommand.() -> Unit)? = null): com.amazonaws.services.codebuild.model.StartBuildResult {
	return this.block.declare(AWSCodeBuildStartBuildCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codebuild.model.StartBuildResult
}

@Generated
class AWSCodeBuildStartBuildCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.StartBuildRequest, com.amazonaws.services.codebuild.model.StartBuildResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codebuild.model.StartBuildResult {
	  return com.amazonaws.services.codebuild.model.StartBuildResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codebuild.model.StartBuildResult {
		return environment.codebuild.startBuild(build())
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


fun AWSCodeBuildFunctions.stopBuild(init: (AWSCodeBuildStopBuildCommand.() -> Unit)? = null): com.amazonaws.services.codebuild.model.StopBuildResult {
	return this.block.declare(AWSCodeBuildStopBuildCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codebuild.model.StopBuildResult
}

@Generated
class AWSCodeBuildStopBuildCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.StopBuildRequest, com.amazonaws.services.codebuild.model.StopBuildResult> {

	var id: String? = null

	override fun build(): com.amazonaws.services.codebuild.model.StopBuildRequest {
		val input = com.amazonaws.services.codebuild.model.StopBuildRequest()
		input.setId(this.id)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codebuild.model.StopBuildResult {
	  return com.amazonaws.services.codebuild.model.StopBuildResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codebuild.model.StopBuildResult {
		return environment.codebuild.stopBuild(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild stop-build")
				.argument("id", id)
	}

}


fun AWSCodeBuildFunctions.updateProject(init: (AWSCodeBuildUpdateProjectCommand.() -> Unit)? = null): com.amazonaws.services.codebuild.model.UpdateProjectResult {
	return this.block.declare(AWSCodeBuildUpdateProjectCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codebuild.model.UpdateProjectResult
}

@Generated
class AWSCodeBuildUpdateProjectCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.UpdateProjectRequest, com.amazonaws.services.codebuild.model.UpdateProjectResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codebuild.model.UpdateProjectResult {
	  return com.amazonaws.services.codebuild.model.UpdateProjectResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codebuild.model.UpdateProjectResult {
		return environment.codebuild.updateProject(build())
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


fun AWSCodeBuildFunctions.updateWebhook(init: (AWSCodeBuildUpdateWebhookCommand.() -> Unit)? = null): com.amazonaws.services.codebuild.model.UpdateWebhookResult {
	return this.block.declare(AWSCodeBuildUpdateWebhookCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.codebuild.model.UpdateWebhookResult
}

@Generated
class AWSCodeBuildUpdateWebhookCommand() : AmazonWebServiceCommand<com.amazonaws.services.codebuild.model.UpdateWebhookRequest, com.amazonaws.services.codebuild.model.UpdateWebhookResult> {

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

	
	override fun dryResult(): com.amazonaws.services.codebuild.model.UpdateWebhookResult {
	  return com.amazonaws.services.codebuild.model.UpdateWebhookResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.codebuild.model.UpdateWebhookResult {
		return environment.codebuild.updateWebhook(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codebuild update-webhook")
				.argument("project-name", projectName)
				.argument("branch-filter", branchFilter)
				.option("rotate-secret", rotateSecret ?: false)
	}

}
