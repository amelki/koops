
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.kinesisvideo.AmazonKinesisVideoMedia
import com.amazonaws.services.kinesisvideo.model.*

var codingue.koops.core.Environment.kinesisvideo: AmazonKinesisVideoMedia
	get() = this.capabilities[AmazonKinesisVideoMedia::class.java.name] as AmazonKinesisVideoMedia
	set(kinesisvideo) {
		this.capabilities[AmazonKinesisVideoMedia::class.java.name] = kinesisvideo
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
