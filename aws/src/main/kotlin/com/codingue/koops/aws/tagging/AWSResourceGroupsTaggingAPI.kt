
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.tagging

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.resourcegroupstaggingapi.*

var com.codingue.koops.core.Environment.tagging: AWSResourceGroupsTaggingAPI
	get() {
		var service = this.capabilities["aws-tagging"]
		if (service == null) {
			service = AWSResourceGroupsTaggingAPIClientBuilder.standard().build()
			this.capabilities["aws-tagging"] = service
		}
		return service as AWSResourceGroupsTaggingAPI
	}
	set(tagging) {
		this.capabilities["aws-tagging"] = tagging
	}

@Generated
class AWSResourceGroupsTaggingAPIFunctions(val block: Script)

infix fun <T> AwsContinuation.tagging(init: AWSResourceGroupsTaggingAPIFunctions.() -> T): T {
	return AWSResourceGroupsTaggingAPIFunctions(shell).run(init)
}

			

fun AWSResourceGroupsTaggingAPIFunctions.getResources(init: (AWSResourceGroupsTaggingAPIGetResourcesCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesResult {
	return this.block.declare(AWSResourceGroupsTaggingAPIGetResourcesCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesResult
}

@Generated
class AWSResourceGroupsTaggingAPIGetResourcesCommand() : AmazonWebServiceCommand<com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest, com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesResult> {

	var paginationToken: String? = null
	var tagFilters: List<com.amazonaws.services.resourcegroupstaggingapi.model.TagFilter>? = null
	var resourcesPerPage: Int? = 0
	var tagsPerPage: Int? = 0
	var resourceTypeFilters: List<String>? = null

	override fun build(): com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest {
		val input = com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest()
		input.setPaginationToken(this.paginationToken)
		input.setTagFilters(this.tagFilters)
		input.setResourcesPerPage(this.resourcesPerPage)
		input.setTagsPerPage(this.tagsPerPage)
		input.setResourceTypeFilters(this.resourceTypeFilters)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesResult {
	  return com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesResult {
		return environment.tagging.getResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws tagging get-resources")
				.argument("pagination-token", paginationToken)
				.argument("tag-filters", tagFilters?.toString())
				.argument("resources-per-page", resourcesPerPage?.toString())
				.argument("tags-per-page", tagsPerPage?.toString())
				.argument("resource-type-filters", resourceTypeFilters?.toString())
	}

}


fun AWSResourceGroupsTaggingAPIFunctions.getTagKeys(init: (AWSResourceGroupsTaggingAPIGetTagKeysCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysResult {
	return this.block.declare(AWSResourceGroupsTaggingAPIGetTagKeysCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysResult
}

@Generated
class AWSResourceGroupsTaggingAPIGetTagKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest, com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysResult> {

	var paginationToken: String? = null

	override fun build(): com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest {
		val input = com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest()
		input.setPaginationToken(this.paginationToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysResult {
	  return com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysResult {
		return environment.tagging.getTagKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws tagging get-tag-keys")
				.argument("pagination-token", paginationToken)
	}

}


fun AWSResourceGroupsTaggingAPIFunctions.getTagValues(key: String, init: (AWSResourceGroupsTaggingAPIGetTagValuesCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesResult {
	return this.block.declare(AWSResourceGroupsTaggingAPIGetTagValuesCommand(key).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesResult
}

@Generated
class AWSResourceGroupsTaggingAPIGetTagValuesCommand(val key: String) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest, com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesResult> {

	var paginationToken: String? = null

	override fun build(): com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest {
		val input = com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest()
		input.setPaginationToken(this.paginationToken)
		input.setKey(this.key)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesResult {
	  return com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesResult {
		return environment.tagging.getTagValues(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws tagging get-tag-values")
				.argument("pagination-token", paginationToken)
				.argument("key", key)
	}

}


fun AWSResourceGroupsTaggingAPIFunctions.tagResources(resourceARNList: List<String>, tags: Map<String, String>, init: (AWSResourceGroupsTaggingAPITagResourcesCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesResult {
	return this.block.declare(AWSResourceGroupsTaggingAPITagResourcesCommand(resourceARNList, tags).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesResult
}

@Generated
class AWSResourceGroupsTaggingAPITagResourcesCommand(val resourceARNList: List<String>, val tags: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest, com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesResult> {



	override fun build(): com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest {
		val input = com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest()
		input.setResourceARNList(this.resourceARNList)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesResult {
	  return com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesResult {
		return environment.tagging.tagResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws tagging tag-resources")
				.argument("resource-arnlist", resourceARNList.toString())
				.argument("tags", tags.toString())
	}

}


fun AWSResourceGroupsTaggingAPIFunctions.untagResources(resourceARNList: List<String>, tagKeys: List<String>, init: (AWSResourceGroupsTaggingAPIUntagResourcesCommand.() -> Unit)? = null): com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesResult {
	return this.block.declare(AWSResourceGroupsTaggingAPIUntagResourcesCommand(resourceARNList, tagKeys).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesResult
}

@Generated
class AWSResourceGroupsTaggingAPIUntagResourcesCommand(val resourceARNList: List<String>, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest, com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesResult> {



	override fun build(): com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest {
		val input = com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest()
		input.setResourceARNList(this.resourceARNList)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesResult {
	  return com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesResult {
		return environment.tagging.untagResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws tagging untag-resources")
				.argument("resource-arnlist", resourceARNList.toString())
				.argument("tag-keys", tagKeys.toString())
	}

}
