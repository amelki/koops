
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.elasticsearch.AWSElasticsearch
import com.amazonaws.services.elasticsearch.model.*

var codingue.koops.core.Environment.es: AWSElasticsearch
	get() = this.capabilities[AWSElasticsearch::class.java.name] as AWSElasticsearch
	set(es) {
		this.capabilities[AWSElasticsearch::class.java.name] = es
	}

@Generated
class AWSElasticsearchFunctions(val block: Block)

infix fun AwsContinuation.es(init: AWSElasticsearchFunctions.() -> Unit) {
	AWSElasticsearchFunctions(shell).apply(init)
}

			

fun AWSElasticsearchFunctions.addTags(aRN: String, tagList: List<com.amazonaws.services.elasticsearch.model.Tag>, init: AWSElasticsearchAddTagsCommand.() -> Unit) {
	this.block.declare(AWSElasticsearchAddTagsCommand(aRN, tagList).apply(init))
}

@Generated
class AWSElasticsearchAddTagsCommand(val aRN: String, val tagList: List<com.amazonaws.services.elasticsearch.model.Tag>) : AmazonWebServiceCommand<com.amazonaws.services.elasticsearch.model.AddTagsRequest> {



	override fun build(): com.amazonaws.services.elasticsearch.model.AddTagsRequest {
		val input = com.amazonaws.services.elasticsearch.model.AddTagsRequest()
		input.setARN(this.aRN)
		input.setTagList(this.tagList)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.es.addTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws es add-tags")
				.argument("arn", aRN)
				.argument("tag-list", tagList.toString())
	}

}


fun AWSElasticsearchFunctions.createElasticsearchDomain(domainName: String, init: AWSElasticsearchCreateElasticsearchDomainCommand.() -> Unit) {
	this.block.declare(AWSElasticsearchCreateElasticsearchDomainCommand(domainName).apply(init))
}

@Generated
class AWSElasticsearchCreateElasticsearchDomainCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainRequest> {

	var elasticsearchVersion: String? = null
	var elasticsearchClusterConfig: com.amazonaws.services.elasticsearch.model.ElasticsearchClusterConfig? = null
	var eBSOptions: com.amazonaws.services.elasticsearch.model.EBSOptions? = null
	var accessPolicies: String? = null
	var snapshotOptions: com.amazonaws.services.elasticsearch.model.SnapshotOptions? = null
	var vPCOptions: com.amazonaws.services.elasticsearch.model.VPCOptions? = null
	var cognitoOptions: com.amazonaws.services.elasticsearch.model.CognitoOptions? = null
	var encryptionAtRestOptions: com.amazonaws.services.elasticsearch.model.EncryptionAtRestOptions? = null
	var advancedOptions: Map<String, String>? = null
	var logPublishingOptions: Map<LogType, com.amazonaws.services.elasticsearch.model.LogPublishingOption>? = null

	override fun build(): com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainRequest {
		val input = com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainRequest()
		input.setDomainName(this.domainName)
		input.setElasticsearchVersion(this.elasticsearchVersion)
		input.setElasticsearchClusterConfig(this.elasticsearchClusterConfig)
		input.setEBSOptions(this.eBSOptions)
		input.setAccessPolicies(this.accessPolicies)
		input.setSnapshotOptions(this.snapshotOptions)
		input.setVPCOptions(this.vPCOptions)
		input.setCognitoOptions(this.cognitoOptions)
		input.setEncryptionAtRestOptions(this.encryptionAtRestOptions)
		input.setAdvancedOptions(this.advancedOptions)
		input.setLogPublishingOptions(this.logPublishingOptions?.mapKeys { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.es.createElasticsearchDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws es create-elasticsearch-domain")
				.argument("domain-name", domainName)
				.argument("elasticsearch-version", elasticsearchVersion)
				.argument("elasticsearch-cluster-config", elasticsearchClusterConfig?.toString())
				.argument("ebsoptions", eBSOptions?.toString())
				.argument("access-policies", accessPolicies)
				.argument("snapshot-options", snapshotOptions?.toString())
				.argument("vpcoptions", vPCOptions?.toString())
				.argument("cognito-options", cognitoOptions?.toString())
				.argument("encryption-at-rest-options", encryptionAtRestOptions?.toString())
				.argument("advanced-options", advancedOptions?.toString())
				.argument("log-publishing-options", logPublishingOptions?.toString())
	}

}


fun AWSElasticsearchFunctions.deleteElasticsearchDomain(domainName: String, init: AWSElasticsearchDeleteElasticsearchDomainCommand.() -> Unit) {
	this.block.declare(AWSElasticsearchDeleteElasticsearchDomainCommand(domainName).apply(init))
}

@Generated
class AWSElasticsearchDeleteElasticsearchDomainCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainRequest> {



	override fun build(): com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainRequest {
		val input = com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.es.deleteElasticsearchDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws es delete-elasticsearch-domain")
				.argument("domain-name", domainName)
	}

}


fun AWSElasticsearchFunctions.deleteElasticsearchServiceRole(init: AWSElasticsearchDeleteElasticsearchServiceRoleCommand.() -> Unit) {
	this.block.declare(AWSElasticsearchDeleteElasticsearchServiceRoleCommand().apply(init))
}

@Generated
class AWSElasticsearchDeleteElasticsearchServiceRoleCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleRequest> {



	override fun build(): com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleRequest {
		val input = com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.es.deleteElasticsearchServiceRole(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws es delete-elasticsearch-service-role")

	}

}


fun AWSElasticsearchFunctions.describeElasticsearchDomain(domainName: String, init: AWSElasticsearchDescribeElasticsearchDomainCommand.() -> Unit) {
	this.block.declare(AWSElasticsearchDescribeElasticsearchDomainCommand(domainName).apply(init))
}

@Generated
class AWSElasticsearchDescribeElasticsearchDomainCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainRequest> {



	override fun build(): com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainRequest {
		val input = com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.es.describeElasticsearchDomain(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws es describe-elasticsearch-domain")
				.argument("domain-name", domainName)
	}

}


fun AWSElasticsearchFunctions.describeElasticsearchDomainConfig(domainName: String, init: AWSElasticsearchDescribeElasticsearchDomainConfigCommand.() -> Unit) {
	this.block.declare(AWSElasticsearchDescribeElasticsearchDomainConfigCommand(domainName).apply(init))
}

@Generated
class AWSElasticsearchDescribeElasticsearchDomainConfigCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigRequest> {



	override fun build(): com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigRequest {
		val input = com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigRequest()
		input.setDomainName(this.domainName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.es.describeElasticsearchDomainConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws es describe-elasticsearch-domain-config")
				.argument("domain-name", domainName)
	}

}


fun AWSElasticsearchFunctions.describeElasticsearchDomains(domainNames: List<String>, init: AWSElasticsearchDescribeElasticsearchDomainsCommand.() -> Unit) {
	this.block.declare(AWSElasticsearchDescribeElasticsearchDomainsCommand(domainNames).apply(init))
}

@Generated
class AWSElasticsearchDescribeElasticsearchDomainsCommand(val domainNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsRequest> {



	override fun build(): com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsRequest {
		val input = com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsRequest()
		input.setDomainNames(this.domainNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.es.describeElasticsearchDomains(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws es describe-elasticsearch-domains")
				.argument("domain-names", domainNames.toString())
	}

}


fun AWSElasticsearchFunctions.describeElasticsearchInstanceTypeLimits(instanceType: ESPartitionInstanceType, elasticsearchVersion: String, init: AWSElasticsearchDescribeElasticsearchInstanceTypeLimitsCommand.() -> Unit) {
	this.block.declare(AWSElasticsearchDescribeElasticsearchInstanceTypeLimitsCommand(instanceType, elasticsearchVersion).apply(init))
}

@Generated
class AWSElasticsearchDescribeElasticsearchInstanceTypeLimitsCommand(val instanceType: ESPartitionInstanceType, val elasticsearchVersion: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsRequest> {

	var domainName: String? = null

	override fun build(): com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsRequest {
		val input = com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsRequest()
		input.setDomainName(this.domainName)
		input.setInstanceType(this.instanceType.toString())
		input.setElasticsearchVersion(this.elasticsearchVersion)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.es.describeElasticsearchInstanceTypeLimits(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws es describe-elasticsearch-instance-type-limits")
				.argument("domain-name", domainName)
				.argument("instance-type", instanceType.toString())
				.argument("elasticsearch-version", elasticsearchVersion)
	}

}


fun AWSElasticsearchFunctions.listDomainNames(init: AWSElasticsearchListDomainNamesCommand.() -> Unit) {
	this.block.declare(AWSElasticsearchListDomainNamesCommand().apply(init))
}

@Generated
class AWSElasticsearchListDomainNamesCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticsearch.model.ListDomainNamesRequest> {



	override fun build(): com.amazonaws.services.elasticsearch.model.ListDomainNamesRequest {
		val input = com.amazonaws.services.elasticsearch.model.ListDomainNamesRequest()

		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.es.listDomainNames(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws es list-domain-names")

	}

}


fun AWSElasticsearchFunctions.listElasticsearchInstanceTypes(elasticsearchVersion: String, init: AWSElasticsearchListElasticsearchInstanceTypesCommand.() -> Unit) {
	this.block.declare(AWSElasticsearchListElasticsearchInstanceTypesCommand(elasticsearchVersion).apply(init))
}

@Generated
class AWSElasticsearchListElasticsearchInstanceTypesCommand(val elasticsearchVersion: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesRequest> {

	var domainName: String? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesRequest {
		val input = com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesRequest()
		input.setElasticsearchVersion(this.elasticsearchVersion)
		input.setDomainName(this.domainName)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.es.listElasticsearchInstanceTypes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws es list-elasticsearch-instance-types")
				.argument("elasticsearch-version", elasticsearchVersion)
				.argument("domain-name", domainName)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSElasticsearchFunctions.listElasticsearchVersions(init: AWSElasticsearchListElasticsearchVersionsCommand.() -> Unit) {
	this.block.declare(AWSElasticsearchListElasticsearchVersionsCommand().apply(init))
}

@Generated
class AWSElasticsearchListElasticsearchVersionsCommand() : AmazonWebServiceCommand<com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsRequest> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsRequest {
		val input = com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsRequest()
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.es.listElasticsearchVersions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws es list-elasticsearch-versions")
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSElasticsearchFunctions.listTags(aRN: String, init: AWSElasticsearchListTagsCommand.() -> Unit) {
	this.block.declare(AWSElasticsearchListTagsCommand(aRN).apply(init))
}

@Generated
class AWSElasticsearchListTagsCommand(val aRN: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticsearch.model.ListTagsRequest> {



	override fun build(): com.amazonaws.services.elasticsearch.model.ListTagsRequest {
		val input = com.amazonaws.services.elasticsearch.model.ListTagsRequest()
		input.setARN(this.aRN)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.es.listTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws es list-tags")
				.argument("arn", aRN)
	}

}


fun AWSElasticsearchFunctions.removeTags(aRN: String, tagKeys: List<String>, init: AWSElasticsearchRemoveTagsCommand.() -> Unit) {
	this.block.declare(AWSElasticsearchRemoveTagsCommand(aRN, tagKeys).apply(init))
}

@Generated
class AWSElasticsearchRemoveTagsCommand(val aRN: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.elasticsearch.model.RemoveTagsRequest> {



	override fun build(): com.amazonaws.services.elasticsearch.model.RemoveTagsRequest {
		val input = com.amazonaws.services.elasticsearch.model.RemoveTagsRequest()
		input.setARN(this.aRN)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.es.removeTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws es remove-tags")
				.argument("arn", aRN)
				.argument("tag-keys", tagKeys.toString())
	}

}


fun AWSElasticsearchFunctions.updateElasticsearchDomainConfig(domainName: String, init: AWSElasticsearchUpdateElasticsearchDomainConfigCommand.() -> Unit) {
	this.block.declare(AWSElasticsearchUpdateElasticsearchDomainConfigCommand(domainName).apply(init))
}

@Generated
class AWSElasticsearchUpdateElasticsearchDomainConfigCommand(val domainName: String) : AmazonWebServiceCommand<com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigRequest> {

	var elasticsearchClusterConfig: com.amazonaws.services.elasticsearch.model.ElasticsearchClusterConfig? = null
	var eBSOptions: com.amazonaws.services.elasticsearch.model.EBSOptions? = null
	var snapshotOptions: com.amazonaws.services.elasticsearch.model.SnapshotOptions? = null
	var vPCOptions: com.amazonaws.services.elasticsearch.model.VPCOptions? = null
	var cognitoOptions: com.amazonaws.services.elasticsearch.model.CognitoOptions? = null
	var advancedOptions: Map<String, String>? = null
	var accessPolicies: String? = null
	var logPublishingOptions: Map<LogType, com.amazonaws.services.elasticsearch.model.LogPublishingOption>? = null

	override fun build(): com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigRequest {
		val input = com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigRequest()
		input.setDomainName(this.domainName)
		input.setElasticsearchClusterConfig(this.elasticsearchClusterConfig)
		input.setEBSOptions(this.eBSOptions)
		input.setSnapshotOptions(this.snapshotOptions)
		input.setVPCOptions(this.vPCOptions)
		input.setCognitoOptions(this.cognitoOptions)
		input.setAdvancedOptions(this.advancedOptions)
		input.setAccessPolicies(this.accessPolicies)
		input.setLogPublishingOptions(this.logPublishingOptions?.mapKeys { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.es.updateElasticsearchDomainConfig(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws es update-elasticsearch-domain-config")
				.argument("domain-name", domainName)
				.argument("elasticsearch-cluster-config", elasticsearchClusterConfig?.toString())
				.argument("ebsoptions", eBSOptions?.toString())
				.argument("snapshot-options", snapshotOptions?.toString())
				.argument("vpcoptions", vPCOptions?.toString())
				.argument("cognito-options", cognitoOptions?.toString())
				.argument("advanced-options", advancedOptions?.toString())
				.argument("access-policies", accessPolicies)
				.argument("log-publishing-options", logPublishingOptions?.toString())
	}

}
