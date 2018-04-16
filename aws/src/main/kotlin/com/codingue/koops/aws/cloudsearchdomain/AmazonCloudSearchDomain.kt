
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.cloudsearchdomain

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.cloudsearchdomain.*
import com.amazonaws.services.cloudsearchdomain.model.*

var com.codingue.koops.core.Environment.cloudsearchdomain: AmazonCloudSearchDomain
	get() {
		var service = this.capabilities["aws-cloudsearchdomain"]
		if (service == null) {
			service = AmazonCloudSearchDomainClientBuilder.standard().build()
			this.capabilities["aws-cloudsearchdomain"] = service
		}
		return service as AmazonCloudSearchDomain
	}
	set(cloudsearchdomain) {
		this.capabilities["aws-cloudsearchdomain"] = cloudsearchdomain
	}

@Generated
class AmazonCloudSearchDomainFunctions(val block: Block)

infix fun <T> AwsContinuation.cloudsearchdomain(init: AmazonCloudSearchDomainFunctions.() -> T): T {
	return AmazonCloudSearchDomainFunctions(shell).run(init)
}

			

fun AmazonCloudSearchDomainFunctions.search(init: (AmazonCloudSearchDomainSearchCommand.() -> Unit)? = null): com.amazonaws.services.cloudsearchdomain.model.SearchResult {
	return this.block.declare(AmazonCloudSearchDomainSearchCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.cloudsearchdomain.model.SearchResult
}

@Generated
class AmazonCloudSearchDomainSearchCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchdomain.model.SearchRequest, com.amazonaws.services.cloudsearchdomain.model.SearchResult> {

	var cursor: String? = null
	var expr: String? = null
	var facet: String? = null
	var filterQuery: String? = null
	var highlight: String? = null
	var partial: Boolean? = false
	var query: String? = null
	var queryOptions: String? = null
	var queryParser: QueryParser? = null
	var returnValue: String? = null
	var size: Long? = 0L
	var sort: String? = null
	var start: Long? = 0L
	var stats: String? = null

	override fun build(): com.amazonaws.services.cloudsearchdomain.model.SearchRequest {
		val input = com.amazonaws.services.cloudsearchdomain.model.SearchRequest()
		input.setCursor(this.cursor)
		input.setExpr(this.expr)
		input.setFacet(this.facet)
		input.setFilterQuery(this.filterQuery)
		input.setHighlight(this.highlight)
		input.setPartial(this.partial)
		input.setQuery(this.query)
		input.setQueryOptions(this.queryOptions)
		input.setQueryParser(this.queryParser?.toString())
		input.setReturn(this.returnValue)
		input.setSize(this.size)
		input.setSort(this.sort)
		input.setStart(this.start)
		input.setStats(this.stats)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchdomain.model.SearchResult {
	  return com.amazonaws.services.cloudsearchdomain.model.SearchResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.cloudsearchdomain.model.SearchResult {
		return environment.cloudsearchdomain.search(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearchdomain search")
				.argument("cursor", cursor)
				.argument("expr", expr)
				.argument("facet", facet)
				.argument("filter-query", filterQuery)
				.argument("highlight", highlight)
				.option("partial", partial ?: false)
				.argument("query", query)
				.argument("query-options", queryOptions)
				.argument("query-parser", queryParser?.toString())
				.argument("return", returnValue)
				.argument("size", size?.toString())
				.argument("sort", sort)
				.argument("start", start?.toString())
				.argument("stats", stats)
	}

}


fun AmazonCloudSearchDomainFunctions.suggest(init: (AmazonCloudSearchDomainSuggestCommand.() -> Unit)? = null): com.amazonaws.services.cloudsearchdomain.model.SuggestResult {
	return this.block.declare(AmazonCloudSearchDomainSuggestCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.cloudsearchdomain.model.SuggestResult
}

@Generated
class AmazonCloudSearchDomainSuggestCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchdomain.model.SuggestRequest, com.amazonaws.services.cloudsearchdomain.model.SuggestResult> {

	var query: String? = null
	var suggester: String? = null
	var size: Long? = 0L

	override fun build(): com.amazonaws.services.cloudsearchdomain.model.SuggestRequest {
		val input = com.amazonaws.services.cloudsearchdomain.model.SuggestRequest()
		input.setQuery(this.query)
		input.setSuggester(this.suggester)
		input.setSize(this.size)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchdomain.model.SuggestResult {
	  return com.amazonaws.services.cloudsearchdomain.model.SuggestResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.cloudsearchdomain.model.SuggestResult {
		return environment.cloudsearchdomain.suggest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearchdomain suggest")
				.argument("query", query)
				.argument("suggester", suggester)
				.argument("size", size?.toString())
	}

}


fun AmazonCloudSearchDomainFunctions.uploadDocuments(init: (AmazonCloudSearchDomainUploadDocumentsCommand.() -> Unit)? = null): com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsResult {
	return this.block.declare(AmazonCloudSearchDomainUploadDocumentsCommand().applyIfNotNull(init, { init!!() })) as com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsResult
}

@Generated
class AmazonCloudSearchDomainUploadDocumentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsRequest, com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsResult> {

	var documents: java.io.InputStream? = null
	var contentType: ContentType? = null
	var contentLength: Long? = 0L

	override fun build(): com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsRequest {
		val input = com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsRequest()
		input.setDocuments(this.documents)
		input.setContentType(this.contentType?.toString())
		input.setContentLength(this.contentLength)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsResult {
	  return com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsResult()
	}


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsResult {
		return environment.cloudsearchdomain.uploadDocuments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearchdomain upload-documents")
				.argument("documents", documents?.toString())
				.argument("content-type", contentType?.toString())
				.argument("content-length", contentLength?.toString())
	}

}
