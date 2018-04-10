
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.sqs.AmazonSQS
import com.amazonaws.services.sqs.model.*

var codingue.koops.core.Environment.sqs: AmazonSQS
	get() = this.capabilities[AmazonSQS::class.java.name] as AmazonSQS
	set(sqs) {
		this.capabilities[AmazonSQS::class.java.name] = sqs
	}

@Generated
class AmazonSQSFunctions(val block: Block)

infix fun AwsContinuation.sqs(init: AmazonSQSFunctions.() -> Unit) {
	AmazonSQSFunctions(shell).apply(init)
}

			

fun AmazonSQSFunctions.addPermission(queueUrl: String, label: String, aWSAccountIds: List<String>, actions: List<String>, init: AmazonSQSAddPermissionCommand.() -> Unit) {
	this.block.declare(AmazonSQSAddPermissionCommand(queueUrl, label, aWSAccountIds, actions).apply(init))
}

@Generated
class AmazonSQSAddPermissionCommand(val queueUrl: String, val label: String, val aWSAccountIds: List<String>, val actions: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.AddPermissionRequest> {



	override fun build(): com.amazonaws.services.sqs.model.AddPermissionRequest {
		val input = com.amazonaws.services.sqs.model.AddPermissionRequest()
		input.setQueueUrl(this.queueUrl)
		input.setLabel(this.label)
		input.setAWSAccountIds(this.aWSAccountIds)
		input.setActions(this.actions)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.addPermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs add-permission")
				.argument("queue-url", queueUrl)
				.argument("label", label)
				.argument("awsaccount-ids", aWSAccountIds.toString())
				.argument("actions", actions.toString())
	}

}


fun AmazonSQSFunctions.changeMessageVisibility(queueUrl: String, receiptHandle: String, visibilityTimeout: Int, init: AmazonSQSChangeMessageVisibilityCommand.() -> Unit) {
	this.block.declare(AmazonSQSChangeMessageVisibilityCommand(queueUrl, receiptHandle, visibilityTimeout).apply(init))
}

@Generated
class AmazonSQSChangeMessageVisibilityCommand(val queueUrl: String, val receiptHandle: String, val visibilityTimeout: Int) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest> {



	override fun build(): com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest {
		val input = com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest()
		input.setQueueUrl(this.queueUrl)
		input.setReceiptHandle(this.receiptHandle)
		input.setVisibilityTimeout(this.visibilityTimeout)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.changeMessageVisibility(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs change-message-visibility")
				.argument("queue-url", queueUrl)
				.argument("receipt-handle", receiptHandle)
				.argument("visibility-timeout", visibilityTimeout.toString())
	}

}


fun AmazonSQSFunctions.changeMessageVisibilityBatch(queueUrl: String, entries: List<com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequestEntry>, init: AmazonSQSChangeMessageVisibilityBatchCommand.() -> Unit) {
	this.block.declare(AmazonSQSChangeMessageVisibilityBatchCommand(queueUrl, entries).apply(init))
}

@Generated
class AmazonSQSChangeMessageVisibilityBatchCommand(val queueUrl: String, val entries: List<com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequestEntry>) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest> {



	override fun build(): com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest {
		val input = com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest()
		input.setQueueUrl(this.queueUrl)
		input.setEntries(this.entries)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.changeMessageVisibilityBatch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs change-message-visibility-batch")
				.argument("queue-url", queueUrl)
				.argument("entries", entries.toString())
	}

}


fun AmazonSQSFunctions.createQueue(queueName: String, init: AmazonSQSCreateQueueCommand.() -> Unit) {
	this.block.declare(AmazonSQSCreateQueueCommand(queueName).apply(init))
}

@Generated
class AmazonSQSCreateQueueCommand(val queueName: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.CreateQueueRequest> {

	var attributes: Map<QueueAttributeName, String>? = null

	override fun build(): com.amazonaws.services.sqs.model.CreateQueueRequest {
		val input = com.amazonaws.services.sqs.model.CreateQueueRequest()
		input.setQueueName(this.queueName)
		input.setAttributes(this.attributes?.mapKeys { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.createQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs create-queue")
				.argument("queue-name", queueName)
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonSQSFunctions.deleteMessage(queueUrl: String, receiptHandle: String, init: AmazonSQSDeleteMessageCommand.() -> Unit) {
	this.block.declare(AmazonSQSDeleteMessageCommand(queueUrl, receiptHandle).apply(init))
}

@Generated
class AmazonSQSDeleteMessageCommand(val queueUrl: String, val receiptHandle: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.DeleteMessageRequest> {



	override fun build(): com.amazonaws.services.sqs.model.DeleteMessageRequest {
		val input = com.amazonaws.services.sqs.model.DeleteMessageRequest()
		input.setQueueUrl(this.queueUrl)
		input.setReceiptHandle(this.receiptHandle)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.deleteMessage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs delete-message")
				.argument("queue-url", queueUrl)
				.argument("receipt-handle", receiptHandle)
	}

}


fun AmazonSQSFunctions.deleteMessageBatch(queueUrl: String, entries: List<com.amazonaws.services.sqs.model.DeleteMessageBatchRequestEntry>, init: AmazonSQSDeleteMessageBatchCommand.() -> Unit) {
	this.block.declare(AmazonSQSDeleteMessageBatchCommand(queueUrl, entries).apply(init))
}

@Generated
class AmazonSQSDeleteMessageBatchCommand(val queueUrl: String, val entries: List<com.amazonaws.services.sqs.model.DeleteMessageBatchRequestEntry>) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.DeleteMessageBatchRequest> {



	override fun build(): com.amazonaws.services.sqs.model.DeleteMessageBatchRequest {
		val input = com.amazonaws.services.sqs.model.DeleteMessageBatchRequest()
		input.setQueueUrl(this.queueUrl)
		input.setEntries(this.entries)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.deleteMessageBatch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs delete-message-batch")
				.argument("queue-url", queueUrl)
				.argument("entries", entries.toString())
	}

}


fun AmazonSQSFunctions.deleteQueue(queueUrl: String, init: AmazonSQSDeleteQueueCommand.() -> Unit) {
	this.block.declare(AmazonSQSDeleteQueueCommand(queueUrl).apply(init))
}

@Generated
class AmazonSQSDeleteQueueCommand(val queueUrl: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.DeleteQueueRequest> {



	override fun build(): com.amazonaws.services.sqs.model.DeleteQueueRequest {
		val input = com.amazonaws.services.sqs.model.DeleteQueueRequest()
		input.setQueueUrl(this.queueUrl)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.deleteQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs delete-queue")
				.argument("queue-url", queueUrl)
	}

}


fun AmazonSQSFunctions.getQueueAttributes(queueUrl: String, init: AmazonSQSGetQueueAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSQSGetQueueAttributesCommand(queueUrl).apply(init))
}

@Generated
class AmazonSQSGetQueueAttributesCommand(val queueUrl: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.GetQueueAttributesRequest> {

	var attributeNames: List<QueueAttributeName>? = null

	override fun build(): com.amazonaws.services.sqs.model.GetQueueAttributesRequest {
		val input = com.amazonaws.services.sqs.model.GetQueueAttributesRequest()
		input.setQueueUrl(this.queueUrl)
		input.setAttributeNames(this.attributeNames?.map { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.getQueueAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs get-queue-attributes")
				.argument("queue-url", queueUrl)
				.argument("attribute-names", attributeNames?.toString())
	}

}


fun AmazonSQSFunctions.getQueueUrl(queueName: String, init: AmazonSQSGetQueueUrlCommand.() -> Unit) {
	this.block.declare(AmazonSQSGetQueueUrlCommand(queueName).apply(init))
}

@Generated
class AmazonSQSGetQueueUrlCommand(val queueName: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.GetQueueUrlRequest> {

	var queueOwnerAWSAccountId: String? = null

	override fun build(): com.amazonaws.services.sqs.model.GetQueueUrlRequest {
		val input = com.amazonaws.services.sqs.model.GetQueueUrlRequest()
		input.setQueueName(this.queueName)
		input.setQueueOwnerAWSAccountId(this.queueOwnerAWSAccountId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.getQueueUrl(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs get-queue-url")
				.argument("queue-name", queueName)
				.argument("queue-owner-awsaccount-id", queueOwnerAWSAccountId)
	}

}


fun AmazonSQSFunctions.listDeadLetterSourceQueues(queueUrl: String, init: AmazonSQSListDeadLetterSourceQueuesCommand.() -> Unit) {
	this.block.declare(AmazonSQSListDeadLetterSourceQueuesCommand(queueUrl).apply(init))
}

@Generated
class AmazonSQSListDeadLetterSourceQueuesCommand(val queueUrl: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest> {



	override fun build(): com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest {
		val input = com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest()
		input.setQueueUrl(this.queueUrl)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.listDeadLetterSourceQueues(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs list-dead-letter-source-queues")
				.argument("queue-url", queueUrl)
	}

}


fun AmazonSQSFunctions.listQueueTags(queueUrl: String, init: AmazonSQSListQueueTagsCommand.() -> Unit) {
	this.block.declare(AmazonSQSListQueueTagsCommand(queueUrl).apply(init))
}

@Generated
class AmazonSQSListQueueTagsCommand(val queueUrl: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.ListQueueTagsRequest> {



	override fun build(): com.amazonaws.services.sqs.model.ListQueueTagsRequest {
		val input = com.amazonaws.services.sqs.model.ListQueueTagsRequest()
		input.setQueueUrl(this.queueUrl)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.listQueueTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs list-queue-tags")
				.argument("queue-url", queueUrl)
	}

}


fun AmazonSQSFunctions.listQueues(init: AmazonSQSListQueuesCommand.() -> Unit) {
	this.block.declare(AmazonSQSListQueuesCommand().apply(init))
}

@Generated
class AmazonSQSListQueuesCommand() : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.ListQueuesRequest> {

	var queueNamePrefix: String? = null

	override fun build(): com.amazonaws.services.sqs.model.ListQueuesRequest {
		val input = com.amazonaws.services.sqs.model.ListQueuesRequest()
		input.setQueueNamePrefix(this.queueNamePrefix)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.listQueues(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs list-queues")
				.argument("queue-name-prefix", queueNamePrefix)
	}

}


fun AmazonSQSFunctions.purgeQueue(queueUrl: String, init: AmazonSQSPurgeQueueCommand.() -> Unit) {
	this.block.declare(AmazonSQSPurgeQueueCommand(queueUrl).apply(init))
}

@Generated
class AmazonSQSPurgeQueueCommand(val queueUrl: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.PurgeQueueRequest> {



	override fun build(): com.amazonaws.services.sqs.model.PurgeQueueRequest {
		val input = com.amazonaws.services.sqs.model.PurgeQueueRequest()
		input.setQueueUrl(this.queueUrl)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.purgeQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs purge-queue")
				.argument("queue-url", queueUrl)
	}

}


fun AmazonSQSFunctions.receiveMessage(queueUrl: String, init: AmazonSQSReceiveMessageCommand.() -> Unit) {
	this.block.declare(AmazonSQSReceiveMessageCommand(queueUrl).apply(init))
}

@Generated
class AmazonSQSReceiveMessageCommand(val queueUrl: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.ReceiveMessageRequest> {

	var attributeNames: List<QueueAttributeName>? = null
	var messageAttributeNames: List<String>? = null
	var maxNumberOfMessages: Int? = 0
	var visibilityTimeout: Int? = 0
	var waitTimeSeconds: Int? = 0
	var receiveRequestAttemptId: String? = null

	override fun build(): com.amazonaws.services.sqs.model.ReceiveMessageRequest {
		val input = com.amazonaws.services.sqs.model.ReceiveMessageRequest()
		input.setQueueUrl(this.queueUrl)
		input.setAttributeNames(this.attributeNames?.map { it.toString() })
		input.setMessageAttributeNames(this.messageAttributeNames)
		input.setMaxNumberOfMessages(this.maxNumberOfMessages)
		input.setVisibilityTimeout(this.visibilityTimeout)
		input.setWaitTimeSeconds(this.waitTimeSeconds)
		input.setReceiveRequestAttemptId(this.receiveRequestAttemptId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.receiveMessage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs receive-message")
				.argument("queue-url", queueUrl)
				.argument("attribute-names", attributeNames?.toString())
				.argument("message-attribute-names", messageAttributeNames?.toString())
				.argument("max-number-of-messages", maxNumberOfMessages?.toString())
				.argument("visibility-timeout", visibilityTimeout?.toString())
				.argument("wait-time-seconds", waitTimeSeconds?.toString())
				.argument("receive-request-attempt-id", receiveRequestAttemptId)
	}

}


fun AmazonSQSFunctions.removePermission(queueUrl: String, label: String, init: AmazonSQSRemovePermissionCommand.() -> Unit) {
	this.block.declare(AmazonSQSRemovePermissionCommand(queueUrl, label).apply(init))
}

@Generated
class AmazonSQSRemovePermissionCommand(val queueUrl: String, val label: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.RemovePermissionRequest> {



	override fun build(): com.amazonaws.services.sqs.model.RemovePermissionRequest {
		val input = com.amazonaws.services.sqs.model.RemovePermissionRequest()
		input.setQueueUrl(this.queueUrl)
		input.setLabel(this.label)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.removePermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs remove-permission")
				.argument("queue-url", queueUrl)
				.argument("label", label)
	}

}


fun AmazonSQSFunctions.sendMessage(queueUrl: String, messageBody: String, init: AmazonSQSSendMessageCommand.() -> Unit) {
	this.block.declare(AmazonSQSSendMessageCommand(queueUrl, messageBody).apply(init))
}

@Generated
class AmazonSQSSendMessageCommand(val queueUrl: String, val messageBody: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.SendMessageRequest> {

	var delaySeconds: Int? = 0
	var messageAttributes: Map<String, com.amazonaws.services.sqs.model.MessageAttributeValue>? = null
	var messageDeduplicationId: String? = null
	var messageGroupId: String? = null

	override fun build(): com.amazonaws.services.sqs.model.SendMessageRequest {
		val input = com.amazonaws.services.sqs.model.SendMessageRequest()
		input.setQueueUrl(this.queueUrl)
		input.setMessageBody(this.messageBody)
		input.setDelaySeconds(this.delaySeconds)
		input.setMessageAttributes(this.messageAttributes)
		input.setMessageDeduplicationId(this.messageDeduplicationId)
		input.setMessageGroupId(this.messageGroupId)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.sendMessage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs send-message")
				.argument("queue-url", queueUrl)
				.argument("message-body", messageBody)
				.argument("delay-seconds", delaySeconds?.toString())
				.argument("message-attributes", messageAttributes?.toString())
				.argument("message-deduplication-id", messageDeduplicationId)
				.argument("message-group-id", messageGroupId)
	}

}


fun AmazonSQSFunctions.sendMessageBatch(queueUrl: String, entries: List<com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry>, init: AmazonSQSSendMessageBatchCommand.() -> Unit) {
	this.block.declare(AmazonSQSSendMessageBatchCommand(queueUrl, entries).apply(init))
}

@Generated
class AmazonSQSSendMessageBatchCommand(val queueUrl: String, val entries: List<com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry>) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.SendMessageBatchRequest> {



	override fun build(): com.amazonaws.services.sqs.model.SendMessageBatchRequest {
		val input = com.amazonaws.services.sqs.model.SendMessageBatchRequest()
		input.setQueueUrl(this.queueUrl)
		input.setEntries(this.entries)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.sendMessageBatch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs send-message-batch")
				.argument("queue-url", queueUrl)
				.argument("entries", entries.toString())
	}

}


fun AmazonSQSFunctions.setQueueAttributes(queueUrl: String, attributes: Map<QueueAttributeName, String>, init: AmazonSQSSetQueueAttributesCommand.() -> Unit) {
	this.block.declare(AmazonSQSSetQueueAttributesCommand(queueUrl, attributes).apply(init))
}

@Generated
class AmazonSQSSetQueueAttributesCommand(val queueUrl: String, val attributes: Map<QueueAttributeName, String>) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.SetQueueAttributesRequest> {



	override fun build(): com.amazonaws.services.sqs.model.SetQueueAttributesRequest {
		val input = com.amazonaws.services.sqs.model.SetQueueAttributesRequest()
		input.setQueueUrl(this.queueUrl)
		input.setAttributes(this.attributes.mapKeys { it.toString() })
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.setQueueAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs set-queue-attributes")
				.argument("queue-url", queueUrl)
				.argument("attributes", attributes.toString())
	}

}


fun AmazonSQSFunctions.tagQueue(queueUrl: String, tags: Map<String, String>, init: AmazonSQSTagQueueCommand.() -> Unit) {
	this.block.declare(AmazonSQSTagQueueCommand(queueUrl, tags).apply(init))
}

@Generated
class AmazonSQSTagQueueCommand(val queueUrl: String, val tags: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.TagQueueRequest> {



	override fun build(): com.amazonaws.services.sqs.model.TagQueueRequest {
		val input = com.amazonaws.services.sqs.model.TagQueueRequest()
		input.setQueueUrl(this.queueUrl)
		input.setTags(this.tags)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.tagQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs tag-queue")
				.argument("queue-url", queueUrl)
				.argument("tags", tags.toString())
	}

}


fun AmazonSQSFunctions.untagQueue(queueUrl: String, tagKeys: List<String>, init: AmazonSQSUntagQueueCommand.() -> Unit) {
	this.block.declare(AmazonSQSUntagQueueCommand(queueUrl, tagKeys).apply(init))
}

@Generated
class AmazonSQSUntagQueueCommand(val queueUrl: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.UntagQueueRequest> {



	override fun build(): com.amazonaws.services.sqs.model.UntagQueueRequest {
		val input = com.amazonaws.services.sqs.model.UntagQueueRequest()
		input.setQueueUrl(this.queueUrl)
		input.setTagKeys(this.tagKeys)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.sqs.untagQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs untag-queue")
				.argument("queue-url", queueUrl)
				.argument("tag-keys", tagKeys.toString())
	}

}
