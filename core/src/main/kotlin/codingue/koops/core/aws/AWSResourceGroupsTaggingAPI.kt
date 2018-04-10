
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.resourcegroupstaggingapi.AWSResourceGroupsTaggingAPI
import com.amazonaws.services.resourcegroupstaggingapi.model.*

var codingue.koops.core.Environment.tagging: AWSResourceGroupsTaggingAPI
	get() = this.capabilities[AWSResourceGroupsTaggingAPI::class.java.name] as AWSResourceGroupsTaggingAPI
	set(tagging) {
		this.capabilities[AWSResourceGroupsTaggingAPI::class.java.name] = tagging
	}

@Generated
class AWSResourceGroupsTaggingAPIFunctions(val block: Block)

infix fun AwsContinuation.tagging(init: AWSResourceGroupsTaggingAPIFunctions.() -> Unit) {
	AWSResourceGroupsTaggingAPIFunctions(shell).apply(init)
}

			

fun AWSResourceGroupsTaggingAPIFunctions.getResources(init: AWSResourceGroupsTaggingAPIGetResourcesCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsTaggingAPIGetResourcesCommand().apply(init))
}

@Generated
class AWSResourceGroupsTaggingAPIGetResourcesCommand() : AmazonWebServiceCommand<com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.tagging.getResources(build())
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


fun AWSResourceGroupsTaggingAPIFunctions.getTagKeys(init: AWSResourceGroupsTaggingAPIGetTagKeysCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsTaggingAPIGetTagKeysCommand().apply(init))
}

@Generated
class AWSResourceGroupsTaggingAPIGetTagKeysCommand() : AmazonWebServiceCommand<com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest> {

	var paginationToken: String? = null

	override fun build(): com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest {
		val input = com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest()
		input.setPaginationToken(this.paginationToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.tagging.getTagKeys(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws tagging get-tag-keys")
				.argument("pagination-token", paginationToken)
	}

}


fun AWSResourceGroupsTaggingAPIFunctions.getTagValues(key: String, init: AWSResourceGroupsTaggingAPIGetTagValuesCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsTaggingAPIGetTagValuesCommand(key).apply(init))
}

@Generated
class AWSResourceGroupsTaggingAPIGetTagValuesCommand(val key: String) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest> {

	var paginationToken: String? = null

	override fun build(): com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest {
		val input = com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest()
		input.setPaginationToken(this.paginationToken)
		input.setKey(this.key)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.tagging.getTagValues(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws tagging get-tag-values")
				.argument("pagination-token", paginationToken)
				.argument("key", key)
	}

}


fun AWSResourceGroupsTaggingAPIFunctions.tagResources(resourceARNList: List<String>, tags: Map<String, String>, init: AWSResourceGroupsTaggingAPITagResourcesCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsTaggingAPITagResourcesCommand(resourceARNList, tags).apply(init))
}

@Generated
class AWSResourceGroupsTaggingAPITagResourcesCommand(val resourceARNList: List<String>, val tags: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest> {



	override fun build(): com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest {
		val input = com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest()
		input.setResourceARNList(this.resourceARNList)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.tagging.tagResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws tagging tag-resources")
				.argument("resource-arnlist", resourceARNList.toString())
				.argument("tags", tags.toString())
	}

}


fun AWSResourceGroupsTaggingAPIFunctions.untagResources(resourceARNList: List<String>, tagKeys: List<String>, init: AWSResourceGroupsTaggingAPIUntagResourcesCommand.() -> Unit) {
	this.block.declare(AWSResourceGroupsTaggingAPIUntagResourcesCommand(resourceARNList, tagKeys).apply(init))
}

@Generated
class AWSResourceGroupsTaggingAPIUntagResourcesCommand(val resourceARNList: List<String>, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest> {



	override fun build(): com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest {
		val input = com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest()
		input.setResourceARNList(this.resourceARNList)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.tagging.untagResources(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws tagging untag-resources")
				.argument("resource-arnlist", resourceARNList.toString())
				.argument("tag-keys", tagKeys.toString())
	}

}
