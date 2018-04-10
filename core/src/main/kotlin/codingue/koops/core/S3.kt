@file:Suppress("MemberVisibilityCanBePrivate")

package codingue.koops.core

import com.amazonaws.AmazonWebServiceRequest
import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.model.AbstractPutObjectRequest
import com.amazonaws.services.s3.model.ListObjectsRequest
import com.amazonaws.services.s3.model.ObjectMetadata
import com.amazonaws.services.s3.model.PutObjectRequest
import java.io.File
import java.io.InputStream

class S3Functions(val block: Block) {

	fun putObject(bucket: String, key: String, file: File) {
		block.declare(PutObjectCommand(bucket, key, file))
	}

	fun putObject(bucket: String, key: String, redirectLocation: String) {
		block.declare(PutObjectCommand(bucket, key, redirectLocation))
	}

	fun putObject(bucket: String, key: String, inputStream: InputStream, metadata: ObjectMetadata) {
		block.declare(PutObjectCommand(bucket, key, inputStream, metadata))
	}

}

var Environment.s3: AmazonS3
	get() = this.capabilities[AmazonS3::class.java.name] as AmazonS3
	set(s3) {
		this.capabilities[AmazonS3::class.java.name] = s3
	}

infix fun AwsContinuation.s3(init: S3Functions.() -> Unit) {
	S3Functions(shell).apply(init)
}

@CliMarker
abstract class S3Command<out T : AmazonWebServiceRequest> : AmazonWebServiceCommand<T>

abstract class AbstractPutObjectCommand<T : AbstractPutObjectRequest> : S3Command<T> {

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

class PutObjectCommand : AbstractPutObjectCommand<PutObjectRequest> {
	constructor(bucket: String, key: String, inputStream: InputStream, metadata: ObjectMetadata) : super(bucket, key, inputStream, metadata)
	constructor(bucket: String, key: String, file: File) : super(bucket, key, file)
	constructor(bucket: String, key: String, redirectLocation: String) : super(bucket, key, redirectLocation)

	override fun build(): PutObjectRequest = when {
		inputStream != null -> PutObjectRequest(bucket, key, inputStream, metadata)
		file != null -> PutObjectRequest(bucket, key, file)
		else -> throw IllegalStateException("Input stream or file must be set")
	}

	override fun eval(environment: Environment) {
		environment.s3.putObject(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws s3 put-object")
				.argument("bucket", bucket)
				.argument("key", key)
	}
}

/*
class ListObjectsCommand(val bucket: String) : AmazonWebServiceCommand<ListObjectsRequest> {

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

	override fun eval(environment: Environment) {
		environment.s3.listObjects(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws s3 put-object")
				.argument("bucket", bucket)
				.argument("key", key)
	}
}
*/
