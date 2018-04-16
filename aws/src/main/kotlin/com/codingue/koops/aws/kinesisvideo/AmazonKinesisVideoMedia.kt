
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package com.codingue.koops.aws.kinesisvideo

import javax.annotation.Generated
import com.codingue.koops.common.*
import com.codingue.koops.core.*
import com.codingue.koops.aws.*
import com.amazonaws.services.kinesisvideo.*

var com.codingue.koops.core.Environment.kinesisvideo: AmazonKinesisVideoMedia
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
class AmazonKinesisVideoMediaFunctions(val block: Script)

infix fun <T> AwsContinuation.kinesisvideo(init: AmazonKinesisVideoMediaFunctions.() -> T): T {
	return AmazonKinesisVideoMediaFunctions(shell).run(init)
}

			

fun AmazonKinesisVideoMediaFunctions.getMedia(startSelector: com.amazonaws.services.kinesisvideo.model.StartSelector, init: (AmazonKinesisVideoMediaGetMediaCommand.() -> Unit)? = null): com.amazonaws.services.kinesisvideo.model.GetMediaResult {
	return this.block.declare(AmazonKinesisVideoMediaGetMediaCommand(startSelector).applyIfNotNull(init, { init!!() })) as com.amazonaws.services.kinesisvideo.model.GetMediaResult
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


	override fun eval(environment: com.codingue.koops.core.Environment): com.amazonaws.services.kinesisvideo.model.GetMediaResult {
		return environment.kinesisvideo.getMedia(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws kinesisvideo get-media")
				.argument("stream-name", streamName)
				.argument("stream-arn", streamARN)
				.argument("start-selector", startSelector.toString())
	}

}
