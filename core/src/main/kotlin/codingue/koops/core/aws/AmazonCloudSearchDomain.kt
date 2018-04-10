
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.cloudsearchdomain.AmazonCloudSearchDomain
import com.amazonaws.services.cloudsearchdomain.model.*

var codingue.koops.core.Environment.cloudsearchdomain: AmazonCloudSearchDomain
	get() = this.capabilities[AmazonCloudSearchDomain::class.java.name] as AmazonCloudSearchDomain
	set(cloudsearchdomain) {
		this.capabilities[AmazonCloudSearchDomain::class.java.name] = cloudsearchdomain
	}

@Generated
class AmazonCloudSearchDomainFunctions(val block: Block)

infix fun AwsContinuation.cloudsearchdomain(init: AmazonCloudSearchDomainFunctions.() -> Unit) {
	AmazonCloudSearchDomainFunctions(shell).apply(init)
}

			

fun AmazonCloudSearchDomainFunctions.search(init: AmazonCloudSearchDomainSearchCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDomainSearchCommand().apply(init))
}

@Generated
class AmazonCloudSearchDomainSearchCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchdomain.model.SearchRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearchdomain.search(build())
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


fun AmazonCloudSearchDomainFunctions.suggest(init: AmazonCloudSearchDomainSuggestCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDomainSuggestCommand().apply(init))
}

@Generated
class AmazonCloudSearchDomainSuggestCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchdomain.model.SuggestRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearchdomain.suggest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearchdomain suggest")
				.argument("query", query)
				.argument("suggester", suggester)
				.argument("size", size?.toString())
	}

}


fun AmazonCloudSearchDomainFunctions.uploadDocuments(init: AmazonCloudSearchDomainUploadDocumentsCommand.() -> Unit) {
	this.block.declare(AmazonCloudSearchDomainUploadDocumentsCommand().apply(init))
}

@Generated
class AmazonCloudSearchDomainUploadDocumentsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudsearchdomain.model.UploadDocumentsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.cloudsearchdomain.uploadDocuments(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws cloudsearchdomain upload-documents")
				.argument("documents", documents?.toString())
				.argument("content-type", contentType?.toString())
				.argument("content-length", contentLength?.toString())
	}

}
