
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.sqs.*
import com.amazonaws.services.sqs.model.*

var codingue.koops.core.Environment.sqs: AmazonSQS
	get() {
		var service = this.capabilities["aws-sqs"]
		if (service == null) {
			service = AmazonSQSClientBuilder.standard().build()
			this.capabilities["aws-sqs"] = service
		}
		return service as AmazonSQS
	}
	set(sqs) {
		this.capabilities["aws-sqs"] = sqs
	}

@Generated
class AmazonSQSFunctions(val block: Block)

infix fun <T> AwsContinuation.sqs(init: AmazonSQSFunctions.() -> T): T {
	return AmazonSQSFunctions(shell).run(init)
}

			

fun AmazonSQSFunctions.addPermission(queueUrl: String, label: String, aWSAccountIds: List<String>, actions: List<String>, init: AmazonSQSAddPermissionCommand.() -> Unit): com.amazonaws.services.sqs.model.AddPermissionResult {
	return this.block.declare(AmazonSQSAddPermissionCommand(queueUrl, label, aWSAccountIds, actions).apply(init)) as com.amazonaws.services.sqs.model.AddPermissionResult
}

@Generated
class AmazonSQSAddPermissionCommand(val queueUrl: String, val label: String, val aWSAccountIds: List<String>, val actions: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.AddPermissionRequest, com.amazonaws.services.sqs.model.AddPermissionResult> {



	override fun build(): com.amazonaws.services.sqs.model.AddPermissionRequest {
		val input = com.amazonaws.services.sqs.model.AddPermissionRequest()
		input.setQueueUrl(this.queueUrl)
		input.setLabel(this.label)
		input.setAWSAccountIds(this.aWSAccountIds)
		input.setActions(this.actions)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.AddPermissionResult {
	  return com.amazonaws.services.sqs.model.AddPermissionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.AddPermissionResult {
		return environment.sqs.addPermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs add-permission")
				.argument("queue-url", queueUrl)
				.argument("label", label)
				.argument("awsaccount-ids", aWSAccountIds.toString())
				.argument("actions", actions.toString())
	}

}


fun AmazonSQSFunctions.changeMessageVisibility(queueUrl: String, receiptHandle: String, visibilityTimeout: Int, init: AmazonSQSChangeMessageVisibilityCommand.() -> Unit): com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult {
	return this.block.declare(AmazonSQSChangeMessageVisibilityCommand(queueUrl, receiptHandle, visibilityTimeout).apply(init)) as com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult
}

@Generated
class AmazonSQSChangeMessageVisibilityCommand(val queueUrl: String, val receiptHandle: String, val visibilityTimeout: Int) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest, com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult> {



	override fun build(): com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest {
		val input = com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest()
		input.setQueueUrl(this.queueUrl)
		input.setReceiptHandle(this.receiptHandle)
		input.setVisibilityTimeout(this.visibilityTimeout)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult {
	  return com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult {
		return environment.sqs.changeMessageVisibility(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs change-message-visibility")
				.argument("queue-url", queueUrl)
				.argument("receipt-handle", receiptHandle)
				.argument("visibility-timeout", visibilityTimeout.toString())
	}

}


fun AmazonSQSFunctions.changeMessageVisibilityBatch(queueUrl: String, entries: List<com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequestEntry>, init: AmazonSQSChangeMessageVisibilityBatchCommand.() -> Unit): com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult {
	return this.block.declare(AmazonSQSChangeMessageVisibilityBatchCommand(queueUrl, entries).apply(init)) as com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult
}

@Generated
class AmazonSQSChangeMessageVisibilityBatchCommand(val queueUrl: String, val entries: List<com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequestEntry>) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest, com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult> {



	override fun build(): com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest {
		val input = com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest()
		input.setQueueUrl(this.queueUrl)
		input.setEntries(this.entries)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult {
	  return com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult {
		return environment.sqs.changeMessageVisibilityBatch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs change-message-visibility-batch")
				.argument("queue-url", queueUrl)
				.argument("entries", entries.toString())
	}

}


fun AmazonSQSFunctions.createQueue(queueName: String, init: AmazonSQSCreateQueueCommand.() -> Unit): com.amazonaws.services.sqs.model.CreateQueueResult {
	return this.block.declare(AmazonSQSCreateQueueCommand(queueName).apply(init)) as com.amazonaws.services.sqs.model.CreateQueueResult
}

@Generated
class AmazonSQSCreateQueueCommand(val queueName: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.CreateQueueRequest, com.amazonaws.services.sqs.model.CreateQueueResult> {

	var attributes: Map<QueueAttributeName, String>? = null

	override fun build(): com.amazonaws.services.sqs.model.CreateQueueRequest {
		val input = com.amazonaws.services.sqs.model.CreateQueueRequest()
		input.setQueueName(this.queueName)
		input.setAttributes(this.attributes?.mapKeys { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.CreateQueueResult {
	  return com.amazonaws.services.sqs.model.CreateQueueResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.CreateQueueResult {
		return environment.sqs.createQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs create-queue")
				.argument("queue-name", queueName)
				.argument("attributes", attributes?.toString())
	}

}


fun AmazonSQSFunctions.deleteMessage(queueUrl: String, receiptHandle: String, init: AmazonSQSDeleteMessageCommand.() -> Unit): com.amazonaws.services.sqs.model.DeleteMessageResult {
	return this.block.declare(AmazonSQSDeleteMessageCommand(queueUrl, receiptHandle).apply(init)) as com.amazonaws.services.sqs.model.DeleteMessageResult
}

@Generated
class AmazonSQSDeleteMessageCommand(val queueUrl: String, val receiptHandle: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.DeleteMessageRequest, com.amazonaws.services.sqs.model.DeleteMessageResult> {



	override fun build(): com.amazonaws.services.sqs.model.DeleteMessageRequest {
		val input = com.amazonaws.services.sqs.model.DeleteMessageRequest()
		input.setQueueUrl(this.queueUrl)
		input.setReceiptHandle(this.receiptHandle)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.DeleteMessageResult {
	  return com.amazonaws.services.sqs.model.DeleteMessageResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.DeleteMessageResult {
		return environment.sqs.deleteMessage(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs delete-message")
				.argument("queue-url", queueUrl)
				.argument("receipt-handle", receiptHandle)
	}

}


fun AmazonSQSFunctions.deleteMessageBatch(queueUrl: String, entries: List<com.amazonaws.services.sqs.model.DeleteMessageBatchRequestEntry>, init: AmazonSQSDeleteMessageBatchCommand.() -> Unit): com.amazonaws.services.sqs.model.DeleteMessageBatchResult {
	return this.block.declare(AmazonSQSDeleteMessageBatchCommand(queueUrl, entries).apply(init)) as com.amazonaws.services.sqs.model.DeleteMessageBatchResult
}

@Generated
class AmazonSQSDeleteMessageBatchCommand(val queueUrl: String, val entries: List<com.amazonaws.services.sqs.model.DeleteMessageBatchRequestEntry>) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.DeleteMessageBatchRequest, com.amazonaws.services.sqs.model.DeleteMessageBatchResult> {



	override fun build(): com.amazonaws.services.sqs.model.DeleteMessageBatchRequest {
		val input = com.amazonaws.services.sqs.model.DeleteMessageBatchRequest()
		input.setQueueUrl(this.queueUrl)
		input.setEntries(this.entries)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.DeleteMessageBatchResult {
	  return com.amazonaws.services.sqs.model.DeleteMessageBatchResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.DeleteMessageBatchResult {
		return environment.sqs.deleteMessageBatch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs delete-message-batch")
				.argument("queue-url", queueUrl)
				.argument("entries", entries.toString())
	}

}


fun AmazonSQSFunctions.deleteQueue(queueUrl: String, init: AmazonSQSDeleteQueueCommand.() -> Unit): com.amazonaws.services.sqs.model.DeleteQueueResult {
	return this.block.declare(AmazonSQSDeleteQueueCommand(queueUrl).apply(init)) as com.amazonaws.services.sqs.model.DeleteQueueResult
}

@Generated
class AmazonSQSDeleteQueueCommand(val queueUrl: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.DeleteQueueRequest, com.amazonaws.services.sqs.model.DeleteQueueResult> {



	override fun build(): com.amazonaws.services.sqs.model.DeleteQueueRequest {
		val input = com.amazonaws.services.sqs.model.DeleteQueueRequest()
		input.setQueueUrl(this.queueUrl)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.DeleteQueueResult {
	  return com.amazonaws.services.sqs.model.DeleteQueueResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.DeleteQueueResult {
		return environment.sqs.deleteQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs delete-queue")
				.argument("queue-url", queueUrl)
	}

}


fun AmazonSQSFunctions.getQueueAttributes(queueUrl: String, init: AmazonSQSGetQueueAttributesCommand.() -> Unit): com.amazonaws.services.sqs.model.GetQueueAttributesResult {
	return this.block.declare(AmazonSQSGetQueueAttributesCommand(queueUrl).apply(init)) as com.amazonaws.services.sqs.model.GetQueueAttributesResult
}

@Generated
class AmazonSQSGetQueueAttributesCommand(val queueUrl: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.GetQueueAttributesRequest, com.amazonaws.services.sqs.model.GetQueueAttributesResult> {

	var attributeNames: List<QueueAttributeName>? = null

	override fun build(): com.amazonaws.services.sqs.model.GetQueueAttributesRequest {
		val input = com.amazonaws.services.sqs.model.GetQueueAttributesRequest()
		input.setQueueUrl(this.queueUrl)
		input.setAttributeNames(this.attributeNames?.map { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.GetQueueAttributesResult {
	  return com.amazonaws.services.sqs.model.GetQueueAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.GetQueueAttributesResult {
		return environment.sqs.getQueueAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs get-queue-attributes")
				.argument("queue-url", queueUrl)
				.argument("attribute-names", attributeNames?.toString())
	}

}


fun AmazonSQSFunctions.getQueueUrl(queueName: String, init: AmazonSQSGetQueueUrlCommand.() -> Unit): com.amazonaws.services.sqs.model.GetQueueUrlResult {
	return this.block.declare(AmazonSQSGetQueueUrlCommand(queueName).apply(init)) as com.amazonaws.services.sqs.model.GetQueueUrlResult
}

@Generated
class AmazonSQSGetQueueUrlCommand(val queueName: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.GetQueueUrlRequest, com.amazonaws.services.sqs.model.GetQueueUrlResult> {

	var queueOwnerAWSAccountId: String? = null

	override fun build(): com.amazonaws.services.sqs.model.GetQueueUrlRequest {
		val input = com.amazonaws.services.sqs.model.GetQueueUrlRequest()
		input.setQueueName(this.queueName)
		input.setQueueOwnerAWSAccountId(this.queueOwnerAWSAccountId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.GetQueueUrlResult {
	  return com.amazonaws.services.sqs.model.GetQueueUrlResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.GetQueueUrlResult {
		return environment.sqs.getQueueUrl(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs get-queue-url")
				.argument("queue-name", queueName)
				.argument("queue-owner-awsaccount-id", queueOwnerAWSAccountId)
	}

}


fun AmazonSQSFunctions.listDeadLetterSourceQueues(queueUrl: String, init: AmazonSQSListDeadLetterSourceQueuesCommand.() -> Unit): com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesResult {
	return this.block.declare(AmazonSQSListDeadLetterSourceQueuesCommand(queueUrl).apply(init)) as com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesResult
}

@Generated
class AmazonSQSListDeadLetterSourceQueuesCommand(val queueUrl: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest, com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesResult> {



	override fun build(): com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest {
		val input = com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest()
		input.setQueueUrl(this.queueUrl)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesResult {
	  return com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesResult {
		return environment.sqs.listDeadLetterSourceQueues(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs list-dead-letter-source-queues")
				.argument("queue-url", queueUrl)
	}

}


fun AmazonSQSFunctions.listQueueTags(queueUrl: String, init: AmazonSQSListQueueTagsCommand.() -> Unit): com.amazonaws.services.sqs.model.ListQueueTagsResult {
	return this.block.declare(AmazonSQSListQueueTagsCommand(queueUrl).apply(init)) as com.amazonaws.services.sqs.model.ListQueueTagsResult
}

@Generated
class AmazonSQSListQueueTagsCommand(val queueUrl: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.ListQueueTagsRequest, com.amazonaws.services.sqs.model.ListQueueTagsResult> {



	override fun build(): com.amazonaws.services.sqs.model.ListQueueTagsRequest {
		val input = com.amazonaws.services.sqs.model.ListQueueTagsRequest()
		input.setQueueUrl(this.queueUrl)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.ListQueueTagsResult {
	  return com.amazonaws.services.sqs.model.ListQueueTagsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.ListQueueTagsResult {
		return environment.sqs.listQueueTags(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs list-queue-tags")
				.argument("queue-url", queueUrl)
	}

}


fun AmazonSQSFunctions.listQueues(init: AmazonSQSListQueuesCommand.() -> Unit): com.amazonaws.services.sqs.model.ListQueuesResult {
	return this.block.declare(AmazonSQSListQueuesCommand().apply(init)) as com.amazonaws.services.sqs.model.ListQueuesResult
}

@Generated
class AmazonSQSListQueuesCommand() : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.ListQueuesRequest, com.amazonaws.services.sqs.model.ListQueuesResult> {

	var queueNamePrefix: String? = null

	override fun build(): com.amazonaws.services.sqs.model.ListQueuesRequest {
		val input = com.amazonaws.services.sqs.model.ListQueuesRequest()
		input.setQueueNamePrefix(this.queueNamePrefix)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.ListQueuesResult {
	  return com.amazonaws.services.sqs.model.ListQueuesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.ListQueuesResult {
		return environment.sqs.listQueues(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs list-queues")
				.argument("queue-name-prefix", queueNamePrefix)
	}

}


fun AmazonSQSFunctions.purgeQueue(queueUrl: String, init: AmazonSQSPurgeQueueCommand.() -> Unit): com.amazonaws.services.sqs.model.PurgeQueueResult {
	return this.block.declare(AmazonSQSPurgeQueueCommand(queueUrl).apply(init)) as com.amazonaws.services.sqs.model.PurgeQueueResult
}

@Generated
class AmazonSQSPurgeQueueCommand(val queueUrl: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.PurgeQueueRequest, com.amazonaws.services.sqs.model.PurgeQueueResult> {



	override fun build(): com.amazonaws.services.sqs.model.PurgeQueueRequest {
		val input = com.amazonaws.services.sqs.model.PurgeQueueRequest()
		input.setQueueUrl(this.queueUrl)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.PurgeQueueResult {
	  return com.amazonaws.services.sqs.model.PurgeQueueResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.PurgeQueueResult {
		return environment.sqs.purgeQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs purge-queue")
				.argument("queue-url", queueUrl)
	}

}


fun AmazonSQSFunctions.receiveMessage(queueUrl: String, init: AmazonSQSReceiveMessageCommand.() -> Unit): com.amazonaws.services.sqs.model.ReceiveMessageResult {
	return this.block.declare(AmazonSQSReceiveMessageCommand(queueUrl).apply(init)) as com.amazonaws.services.sqs.model.ReceiveMessageResult
}

@Generated
class AmazonSQSReceiveMessageCommand(val queueUrl: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.ReceiveMessageRequest, com.amazonaws.services.sqs.model.ReceiveMessageResult> {

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

	
	override fun dryResult(): com.amazonaws.services.sqs.model.ReceiveMessageResult {
	  return com.amazonaws.services.sqs.model.ReceiveMessageResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.ReceiveMessageResult {
		return environment.sqs.receiveMessage(build())
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


fun AmazonSQSFunctions.removePermission(queueUrl: String, label: String, init: AmazonSQSRemovePermissionCommand.() -> Unit): com.amazonaws.services.sqs.model.RemovePermissionResult {
	return this.block.declare(AmazonSQSRemovePermissionCommand(queueUrl, label).apply(init)) as com.amazonaws.services.sqs.model.RemovePermissionResult
}

@Generated
class AmazonSQSRemovePermissionCommand(val queueUrl: String, val label: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.RemovePermissionRequest, com.amazonaws.services.sqs.model.RemovePermissionResult> {



	override fun build(): com.amazonaws.services.sqs.model.RemovePermissionRequest {
		val input = com.amazonaws.services.sqs.model.RemovePermissionRequest()
		input.setQueueUrl(this.queueUrl)
		input.setLabel(this.label)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.RemovePermissionResult {
	  return com.amazonaws.services.sqs.model.RemovePermissionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.RemovePermissionResult {
		return environment.sqs.removePermission(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs remove-permission")
				.argument("queue-url", queueUrl)
				.argument("label", label)
	}

}


fun AmazonSQSFunctions.sendMessage(queueUrl: String, messageBody: String, init: AmazonSQSSendMessageCommand.() -> Unit): com.amazonaws.services.sqs.model.SendMessageResult {
	return this.block.declare(AmazonSQSSendMessageCommand(queueUrl, messageBody).apply(init)) as com.amazonaws.services.sqs.model.SendMessageResult
}

@Generated
class AmazonSQSSendMessageCommand(val queueUrl: String, val messageBody: String) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.SendMessageRequest, com.amazonaws.services.sqs.model.SendMessageResult> {

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

	
	override fun dryResult(): com.amazonaws.services.sqs.model.SendMessageResult {
	  return com.amazonaws.services.sqs.model.SendMessageResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.SendMessageResult {
		return environment.sqs.sendMessage(build())
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


fun AmazonSQSFunctions.sendMessageBatch(queueUrl: String, entries: List<com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry>, init: AmazonSQSSendMessageBatchCommand.() -> Unit): com.amazonaws.services.sqs.model.SendMessageBatchResult {
	return this.block.declare(AmazonSQSSendMessageBatchCommand(queueUrl, entries).apply(init)) as com.amazonaws.services.sqs.model.SendMessageBatchResult
}

@Generated
class AmazonSQSSendMessageBatchCommand(val queueUrl: String, val entries: List<com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry>) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.SendMessageBatchRequest, com.amazonaws.services.sqs.model.SendMessageBatchResult> {



	override fun build(): com.amazonaws.services.sqs.model.SendMessageBatchRequest {
		val input = com.amazonaws.services.sqs.model.SendMessageBatchRequest()
		input.setQueueUrl(this.queueUrl)
		input.setEntries(this.entries)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.SendMessageBatchResult {
	  return com.amazonaws.services.sqs.model.SendMessageBatchResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.SendMessageBatchResult {
		return environment.sqs.sendMessageBatch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs send-message-batch")
				.argument("queue-url", queueUrl)
				.argument("entries", entries.toString())
	}

}


fun AmazonSQSFunctions.setQueueAttributes(queueUrl: String, attributes: Map<QueueAttributeName, String>, init: AmazonSQSSetQueueAttributesCommand.() -> Unit): com.amazonaws.services.sqs.model.SetQueueAttributesResult {
	return this.block.declare(AmazonSQSSetQueueAttributesCommand(queueUrl, attributes).apply(init)) as com.amazonaws.services.sqs.model.SetQueueAttributesResult
}

@Generated
class AmazonSQSSetQueueAttributesCommand(val queueUrl: String, val attributes: Map<QueueAttributeName, String>) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.SetQueueAttributesRequest, com.amazonaws.services.sqs.model.SetQueueAttributesResult> {



	override fun build(): com.amazonaws.services.sqs.model.SetQueueAttributesRequest {
		val input = com.amazonaws.services.sqs.model.SetQueueAttributesRequest()
		input.setQueueUrl(this.queueUrl)
		input.setAttributes(this.attributes.mapKeys { it.toString() })
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.SetQueueAttributesResult {
	  return com.amazonaws.services.sqs.model.SetQueueAttributesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.SetQueueAttributesResult {
		return environment.sqs.setQueueAttributes(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs set-queue-attributes")
				.argument("queue-url", queueUrl)
				.argument("attributes", attributes.toString())
	}

}


fun AmazonSQSFunctions.tagQueue(queueUrl: String, tags: Map<String, String>, init: AmazonSQSTagQueueCommand.() -> Unit): com.amazonaws.services.sqs.model.TagQueueResult {
	return this.block.declare(AmazonSQSTagQueueCommand(queueUrl, tags).apply(init)) as com.amazonaws.services.sqs.model.TagQueueResult
}

@Generated
class AmazonSQSTagQueueCommand(val queueUrl: String, val tags: Map<String, String>) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.TagQueueRequest, com.amazonaws.services.sqs.model.TagQueueResult> {



	override fun build(): com.amazonaws.services.sqs.model.TagQueueRequest {
		val input = com.amazonaws.services.sqs.model.TagQueueRequest()
		input.setQueueUrl(this.queueUrl)
		input.setTags(this.tags)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.TagQueueResult {
	  return com.amazonaws.services.sqs.model.TagQueueResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.TagQueueResult {
		return environment.sqs.tagQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs tag-queue")
				.argument("queue-url", queueUrl)
				.argument("tags", tags.toString())
	}

}


fun AmazonSQSFunctions.untagQueue(queueUrl: String, tagKeys: List<String>, init: AmazonSQSUntagQueueCommand.() -> Unit): com.amazonaws.services.sqs.model.UntagQueueResult {
	return this.block.declare(AmazonSQSUntagQueueCommand(queueUrl, tagKeys).apply(init)) as com.amazonaws.services.sqs.model.UntagQueueResult
}

@Generated
class AmazonSQSUntagQueueCommand(val queueUrl: String, val tagKeys: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.sqs.model.UntagQueueRequest, com.amazonaws.services.sqs.model.UntagQueueResult> {



	override fun build(): com.amazonaws.services.sqs.model.UntagQueueRequest {
		val input = com.amazonaws.services.sqs.model.UntagQueueRequest()
		input.setQueueUrl(this.queueUrl)
		input.setTagKeys(this.tagKeys)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.sqs.model.UntagQueueResult {
	  return com.amazonaws.services.sqs.model.UntagQueueResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.sqs.model.UntagQueueResult {
		return environment.sqs.untagQueue(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws sqs untag-queue")
				.argument("queue-url", queueUrl)
				.argument("tag-keys", tagKeys.toString())
	}

}
