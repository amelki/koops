
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.mediastoredata.AWSMediaStoreData
import com.amazonaws.services.mediastoredata.model.*

var codingue.koops.core.Environment.mediastoredata: AWSMediaStoreData
	get() = this.capabilities[AWSMediaStoreData::class.java.name] as AWSMediaStoreData
	set(mediastoredata) {
		this.capabilities[AWSMediaStoreData::class.java.name] = mediastoredata
	}

@Generated
class AWSMediaStoreDataFunctions(val block: Block)

infix fun AwsContinuation.mediastoredata(init: AWSMediaStoreDataFunctions.() -> Unit) {
	AWSMediaStoreDataFunctions(shell).apply(init)
}

			

fun AWSMediaStoreDataFunctions.deleteObject(path: String, init: AWSMediaStoreDataDeleteObjectCommand.() -> Unit) {
	this.block.declare(AWSMediaStoreDataDeleteObjectCommand(path).apply(init))
}

@Generated
class AWSMediaStoreDataDeleteObjectCommand(val path: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastoredata.model.DeleteObjectRequest> {



	override fun build(): com.amazonaws.services.mediastoredata.model.DeleteObjectRequest {
		val input = com.amazonaws.services.mediastoredata.model.DeleteObjectRequest()
		input.setPath(this.path)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediastoredata.deleteObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore-data delete-object")
				.argument("path", path)
	}

}


fun AWSMediaStoreDataFunctions.describeObject(path: String, init: AWSMediaStoreDataDescribeObjectCommand.() -> Unit) {
	this.block.declare(AWSMediaStoreDataDescribeObjectCommand(path).apply(init))
}

@Generated
class AWSMediaStoreDataDescribeObjectCommand(val path: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastoredata.model.DescribeObjectRequest> {



	override fun build(): com.amazonaws.services.mediastoredata.model.DescribeObjectRequest {
		val input = com.amazonaws.services.mediastoredata.model.DescribeObjectRequest()
		input.setPath(this.path)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediastoredata.describeObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore-data describe-object")
				.argument("path", path)
	}

}


fun AWSMediaStoreDataFunctions.getObject(path: String, init: AWSMediaStoreDataGetObjectCommand.() -> Unit) {
	this.block.declare(AWSMediaStoreDataGetObjectCommand(path).apply(init))
}

@Generated
class AWSMediaStoreDataGetObjectCommand(val path: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastoredata.model.GetObjectRequest> {

	var range: String? = null

	override fun build(): com.amazonaws.services.mediastoredata.model.GetObjectRequest {
		val input = com.amazonaws.services.mediastoredata.model.GetObjectRequest()
		input.setPath(this.path)
		input.setRange(this.range)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediastoredata.getObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore-data get-object")
				.argument("path", path)
				.argument("range", range)
	}

}


fun AWSMediaStoreDataFunctions.listItems(init: AWSMediaStoreDataListItemsCommand.() -> Unit) {
	this.block.declare(AWSMediaStoreDataListItemsCommand().apply(init))
}

@Generated
class AWSMediaStoreDataListItemsCommand() : AmazonWebServiceCommand<com.amazonaws.services.mediastoredata.model.ListItemsRequest> {

	var path: String? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.mediastoredata.model.ListItemsRequest {
		val input = com.amazonaws.services.mediastoredata.model.ListItemsRequest()
		input.setPath(this.path)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediastoredata.listItems(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore-data list-items")
				.argument("path", path)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSMediaStoreDataFunctions.putObject(body: java.io.InputStream, path: String, init: AWSMediaStoreDataPutObjectCommand.() -> Unit) {
	this.block.declare(AWSMediaStoreDataPutObjectCommand(body, path).apply(init))
}

@Generated
class AWSMediaStoreDataPutObjectCommand(val body: java.io.InputStream, val path: String) : AmazonWebServiceCommand<com.amazonaws.services.mediastoredata.model.PutObjectRequest> {

	var contentType: String? = null
	var cacheControl: String? = null
	var storageClass: StorageClass? = null

	override fun build(): com.amazonaws.services.mediastoredata.model.PutObjectRequest {
		val input = com.amazonaws.services.mediastoredata.model.PutObjectRequest()
		input.setBody(this.body)
		input.setPath(this.path)
		input.setContentType(this.contentType)
		input.setCacheControl(this.cacheControl)
		input.setStorageClass(this.storageClass?.toString())
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.mediastoredata.putObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws mediastore-data put-object")
				.argument("body", body.toString())
				.argument("path", path)
				.argument("content-type", contentType)
				.argument("cache-control", cacheControl)
				.argument("storage-class", storageClass?.toString())
	}

}
