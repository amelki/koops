
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.kinesisvideo.*
import com.amazonaws.services.kinesisvideo.model.*

var codingue.koops.core.Environment.kinesisvideo: AmazonKinesisVideoMedia
	get() {
		var service = this.capabilities["aws-kinesisvideo"]
		if (service == null) {
			service = AmazonKinesisVideoMediaClientBuilder.standard().build()
			this.capabilities["aws-kinesisvideo"] = service
		}
		return service as AmazonKinesisVideoMedia
	}
	set(kinesisvideo) {
		this.capabilities["aws-kinesisvideo"] = kinesisvideo
	}

@Generated
class AmazonKinesisVideoMediaFunctions(val block: Block)

infix fun <T> AwsContinuation.kinesisvideo(init: AmazonKinesisVideoMediaFunctions.() -> T): T {
	return AmazonKinesisVideoMediaFunctions(shell).run(init)
}

			

fun AmazonKinesisVideoMediaFunctions.getMedia(startSelector: com.amazonaws.services.kinesisvideo.model.StartSelector, init: AmazonKinesisVideoMediaGetMediaCommand.() -> Unit): com.amazonaws.services.kinesisvideo.model.GetMediaResult {
	return this.block.declare(AmazonKinesisVideoMediaGetMediaCommand(startSelector).apply(init)) as com.amazonaws.services.kinesisvideo.model.GetMediaResult
}

@Generated
class AmazonKinesisVideoMediaGetMediaCommand(val startSelector: com.amazonaws.services.kinesisvideo.model.StartSelector) : AmazonWebServiceCommand<com.amazonaws.services.kinesisvideo.model.GetMediaRequest, com.amazonaws.services.kinesisvideo.model.GetMediaResult> {

	var streamName: String? = null
	var streamARN: String? = null

	override fun build(): com.amazonaws.services.kinesisvideo.model.GetMediaRequest {
		val input = com.amazonaws.services.kinesisvideo.model.GetMediaRequest()
		input.setStreamName(this.streamName)
		input.setStreamARN(this.streamARN)
		input.setStartSelector(this.startSelector)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.kinesisvideo.model.GetMediaResult {
	  return com.amazonaws.services.kinesisvideo.model.GetMediaResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.kinesisvideo.model.GetMediaResult {
		return environment.kinesisvideo.getMedia(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisvideo get-media")
				.argument("stream-name", streamName)
				.argument("stream-arn", streamARN)
				.argument("start-selector", startSelector.toString())
	}

}
