@file:Suppress("MemberVisibilityCanBePrivate")

package codingue.koops.core

import com.amazonaws.AmazonWebServiceRequest
import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.AmazonS3ClientBuilder
import com.amazonaws.services.s3.model.*
import java.io.File
import java.io.InputStream

class S3Functions(val block: Block) {

	fun listObjects(bucket: String): ObjectListing {
		return block.declare(ListObjectsCommand(bucket)) as ObjectListing
	}

	fun putObject(bucket: String, key: String, file: File): PutObjectResult {
		return block.declare(PutObjectCommand(bucket, key, file)) as PutObjectResult
	}

	fun putObject(bucket: String, path: String): PutObjectResult {
		return putObject(bucket, path.substringAfterLast("/"), path)
	}

	fun putObject(bucket: String, key: String, path: String): PutObjectResult {
		return putObject(bucket, key, block.environment.resolvePath(path))
	}

	fun putObject(bucket: String, key: String, inputStream: InputStream, metadata: ObjectMetadata): PutObjectResult {
		return block.declare(PutObjectCommand(bucket, key, inputStream, metadata)) as PutObjectResult
	}

	fun listBuckets(): List<Bucket> {
		return block.declare(ListBucketsCommand()) as List<Bucket>
	}

}

var Environment.s3: AmazonS3
	get() {
		var service = this.capabilities[AmazonS3::class.java.name]
		if (service == null) {
			service = AmazonS3ClientBuilder.standard().build()
			s3 = service
		}
		return service as AmazonS3
	}
	set(s3) {
		this.capabilities[AmazonS3::class.java.name] = s3
	}

infix fun <T> AwsContinuation.s3(init: S3Functions.() -> T): T {
	return S3Functions(shell).run(init)
}

/**
 * Unlike generated AWS commands, S3 functions don't always return an AmazonWebServiceResult
 */
@CliMarker
interface S3Command<out T : AmazonWebServiceRequest, out R: Any> : Command<R> {
	fun build(): T
	fun descriptor(): AmazonWebServiceDescriptor
	override fun title(): String? = descriptor().toString()
}

abstract class AbstractPutObjectCommand<T : AbstractPutObjectRequest, out R: Any> : S3Command<T, R> {

	val bucket: String
	val key: String
	var file: File? = null
	var redirectLocation: String? = null
	var inputStream: InputStream? = null
	var metadata: ObjectMetadata? = null

	constructor(bucket: String, key: String, inputStream: InputStream, metadata: ObjectMetadata) : super() {
		this.bucket = bucket
		this.key = key
		this.inputStream = inputStream
		this.metadata = metadata
	}

	constructor(bucket: String, key: String, file: File) : super() {
		this.bucket = bucket
		this.key = key
		this.file = file
	}

	constructor(bucket: String, key: String, redirectLocation: String) : super() {
		this.bucket = bucket
		this.key = key
		this.redirectLocation = redirectLocation
	}

}

class PutObjectCommand : AbstractPutObjectCommand<PutObjectRequest, PutObjectResult> {
	constructor(bucket: String, key: String, inputStream: InputStream, metadata: ObjectMetadata) : super(bucket, key, inputStream, metadata)
	constructor(bucket: String, key: String, file: File) : super(bucket, key, file)
	constructor(bucket: String, key: String, redirectLocation: String) : super(bucket, key, redirectLocation)

	override fun build(): PutObjectRequest = when {
		inputStream != null -> PutObjectRequest(bucket, key, inputStream, metadata)
		file != null -> PutObjectRequest(bucket, key, file)
		else -> throw IllegalStateException("Input stream or file must be set")
	}

	override fun eval(environment: Environment): PutObjectResult {
		return environment.s3.putObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws s3 put-object")
				.argument("bucket", bucket)
				.argument("key", key)
	}

	override fun dryRun(): PutObjectResult {
		println(descriptor())
		return PutObjectResult()
	}

}

class ListObjectsCommand(val bucket: String) : S3Command<ListObjectsRequest, ObjectListing> {

	val delimiter: String? = null
	val encodingType: String? = null
	var isRequesterPays: Boolean? = false

	override fun build(): ListObjectsRequest {
		val input = ListObjectsRequest()
		input.bucketName = bucket
		input.delimiter = delimiter
		input.encodingType = encodingType
		input.isRequesterPays = isRequesterPays ?: false
		return input
	}

	override fun dryRun(): ObjectListing {
		println(descriptor())
		val listing = ObjectListing()
		listing.bucketName = bucket
		return listing
	}


	override fun eval(environment: Environment): ObjectListing {
		return environment.s3.listObjects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws s3 put-object")
				.argument("bucket", bucket)
	}
}

class ListBucketsCommand : S3Command<ListBucketsRequest, List<Bucket>> {

	override fun build(): ListBucketsRequest {
		return ListBucketsRequest()
	}

	override fun dryRun(): List<Bucket> {
		println(descriptor())
		return ArrayList()
	}


	override fun eval(environment: Environment): List<Bucket> {
		return environment.s3.listBuckets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws s3 list-buckets")
	}

}

